package edu.pitt.se;

import java.util.List;

public class PlaylistRecommender {

    /*
        classifyEnergy(List<Integer> bpms)
            Return "HIGH" if avg BPM ≥ 140
            "MEDIUM" if 100–139
            "LOW" if < 100
            Reject null or empty lists
    */
    public static String classifyEnergy(List<Integer> bpms) {
        if (bpms == null || bpms.isEmpty()) 
            throw new IllegalArgumentException("BPM list cannot be null or empty");

        int totalBmps = 0;
        for (Integer bpm : bpms) {
            count++;
            totalBmps += bpm;
        }
        avg = totalBmps / bpms.size();

        if(avg >= 140) {
            return "HIGH";
        } else if(avg >= 100) {
            return "MEDIUM";
        } else {
            return "LOW";  
        }  
    }

    /*
        isValidTrackTitle(String title)
            Checks for alphabetic characters + spaces, 1–30 chars
            Reject null or special characters
    */
    public static boolean isValidTrackTitle(String title) {
        if (title == null || title.isEmpty() || title.length() > 30) {
            return false;
        }

        return title.matches("[a-zA-Z ]+");
    }

    /*
        normalizeVolume(int volumeDb)
            Clamp volume into range 0–100 (e.g., 120 -> 100, -10 -> 0)
    */
    public static int normalizeVolume(int volumeDb) {
        if(volumeDb > 100) {
            return 100;
        } else if(volumeDb < 0) {
            return 0;
        } else {
            return volumeDb;
        }
    }
}
