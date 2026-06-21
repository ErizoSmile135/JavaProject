package by.lesson.practics.class5;

public enum ListOfFunctions {
    COOK("Готовит"),
    BUZZ("Жужжит");

    final String type;

    ListOfFunctions(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }
}
