package Drafts;

public class Avg {
    public void main() {
        int [][] table = new int[][] {
                {2021,3,2,4,4},
                {2022,2,3,3,1},
                {2023,2,2,2,4},
                {2024,2,1,1,1},
                {2025,1,3,4,4}
        };

        for(int [] row : table) {
            int year = row[0];
            int total = row[1]+row[2]+row[3]+row[4];

            double avg = total/4;
            System.out.println(year + " " + avg);
        }
    }
}

