package com.pattern.creational.factory;

public class program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory= createDeveloperBySpecialty("cpp");
        Developer developer=developerFactory.createDeveloper();
        developer.writeCode();

    }
    private static DeveloperFactory createDeveloperBySpecialty(String specialty){
        if (specialty.equalsIgnoreCase("Java")) {
            return new JavaDeveloperFactory();
        } else if(specialty.equalsIgnoreCase("Cpp")){
            return new CppDeveloperFactory();
        } else throw new RuntimeException(specialty + "is unknowen");
    }
}
