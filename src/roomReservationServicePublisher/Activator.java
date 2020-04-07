package roomReservationServicePublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import org.osgi.framework.ServiceRegistration;


public class Activator implements BundleActivator{
	ServiceRegistration publishServiceRegistration;
	
    public void start(BundleContext context){
    	RoomService publisherService = new RoomServiceImpl();  	    	
    	publishServiceRegistration = context.registerService(RoomService.class.getName(), publisherService, null);
        System.out.println("Hospital room reservation service publisher registered and started successfully");		
    }


    public void stop(BundleContext context){
    	System.out.println("Hospital room reservation service publisher stopped");
		publishServiceRegistration.unregister();
    	
    }

    private static class RoomServiceImpl implements RoomService{

        Room r1 = new Room("001", "Normal", 2000, "Bed and pillow");
        Room r2 = new Room("002", "Luxary", 3000, "AC");
        Room  r3 = new Room("003", "VIP", 5000, "Food and beverages");
        
        Room[] rooms = {r1, r2, r3};

		@Override
		public void displayRooms() {
			// TODO Auto-generated method stub
			for(Room r : rooms) {
				System.out.println("Room number : " +r.getRoomNumber());
				System.out.println("Room type : " +r.getRoomType());
				System.out.println("Room cost per day : " +r.getRoomPrice());
				System.out.println("Features : " +r.getRoomFeatures());
				System.out.println();
			}	
		}

		@Override
		public double reserveRoom(String roomNumber, int noOfDays) {
			// TODO Auto-generated method stub
			if(roomNumber.equalsIgnoreCase("001")) {
				return (2000 * noOfDays);
			}else if(roomNumber.equalsIgnoreCase("002")) {
				return (3000 * noOfDays);
			}else if(roomNumber.equalsIgnoreCase("003")) {
				return (5000 * noOfDays);
			}
			else {
				System.out.println("Invalid room number");
				return 0;
			}			
		} 

    }
}