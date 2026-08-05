class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        
       int hour1 = Integer.parseInt(startTime.substring(0, 2))- Integer.parseInt(endTime.substring(0, 2));

int min1 = Integer.parseInt(startTime.substring(3, 5))-Integer.parseInt(endTime.substring(3, 5));

int sec1 = Integer.parseInt(startTime.substring(6, 8))-Integer.parseInt(endTime.substring(6, 8));
        return Math.abs(hour1*3600+min1*60+sec1);

    }
}