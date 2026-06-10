package by.lesson.practics.class4;

public class Village {
    private Building[] arrBuild;

    public Village(int countOfBuild) {
        this.arrBuild = new Building[countOfBuild];
    }

    public void addBuild(Building build) {
        for (int i = 0; i < this.arrBuild.length; i++) {
            if (this.arrBuild[i] == null) {
                this.arrBuild[i] = build;
                System.out.println("Добавил домик " + (i + 1) + " из " + this.arrBuild.length);
                break;
            }

            if (i == this.arrBuild.length - 1) System.out.println("В деревне нет больше мест!");
        }
    }

    public void getCountOfBuilds() {
        for (int i = 0; i < this.arrBuild.length; i++) {
            if (this.arrBuild[i] == null) {
                System.out.println("Сейчас в деревне " + (i + 1) + " домов");
                break;
            } else if (i == this.arrBuild.length - 1) System.out.println("Сейчас в деревне " + (i + 1) + " домов!");
        }
    }

    public void getInfOfIndustBuilds() {
        for (int i = 0; i < this.arrBuild.length; i++) {
            if (this.arrBuild[i] == null) break;
            if (this.arrBuild[i] instanceof IndustrialBuilding) {               //гугл подсказал такой вариант для наследников
            //if (this.arrBuild[i].getClass() == IndustrialBuilding.class) {    //А это видимо смотрит только на факт класс
                System.out.println("Вывожу инфу по зданию №" + (i + 1));
                //тут нужно геттер из п2.4 на инфу, но я их уже не буду создавать...
            }
        }
    }
}
