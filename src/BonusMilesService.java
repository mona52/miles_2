public class BonusMilesService {
    public int calculate (int cost) {
        int norm_of_miles = 20;
        int number_of_miles = cost / norm_of_miles;
        return number_of_miles;
    }
}
