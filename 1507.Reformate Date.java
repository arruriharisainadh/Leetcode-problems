import java.util.HashMap;
import java.util.Map;

class Solution {
    public String reformatDate(String date) {
        // Map abbreviated months to their 2-digit representation
        Map<String, String> months = new HashMap<>();
        months.put("Jan", "01");
        months.put("Feb", "02");
        months.put("Mar", "03");
        months.put("Apr", "04");
        months.put("May", "05");
        months.put("Jun", "06");
        months.put("Jul", "07");
        months.put("Aug", "08");
        months.put("Sep", "09");
        months.put("Oct", "10");
        months.put("Nov", "11");
        months.put("Dec", "12");

        // Split the date string into [Day, Month, Year]
        String[] parts = date.split(" ");
        String dayStr = parts[0];
        String monthStr = parts[1];
        String year = parts[2];

        // Strip suffix ("st", "nd", "rd", "th") to get numeric day
        String dayNumber = dayStr.substring(0, dayStr.length() - 2);
        
        // Pad single-digit days with a leading zero
        if (dayNumber.length() == 1) {
            dayNumber = "0" + dayNumber;
        }

        // Format as YYYY-MM-DD
        return year + "-" + months.get(monthStr) + "-" + dayNumber;
    }
}
