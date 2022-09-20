public class DZ3 {
    public static void main(String[] args){
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var totalWeight = weightBoxer1 + weightBoxer2;
        System.out.println("Общий вес:" + totalWeight + " кг");
        var differenceWeight = weightBoxer2 - weightBoxer1;
        System.out.println("Разница в весе:" + differenceWeight + " кг");
        var difference = differenceWeight % totalWeight;
        System.out.println("Разница в весе:" + difference + " кг");

        var allTime = 640;
        var workTime = 8;
        var employees = allTime / workTime;
        System.out.println("Всего работников в компании – " + employees + " человек");
        var newEmployees = 94;
        var allEmployess = employees + newEmployees;
        var newWorkTime = allTime / allEmployess;
        System.out.println("Если в компании работает " + allEmployess +
                " человек, то всего " + newWorkTime + " часов работы может быть поделено между сотрудниками");
    }
}
