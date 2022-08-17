package com.company;

import com.company.dto.*;
import com.company.service.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        mainMenu();
    }

    private static void mainMenu(){
        System.out.println("Welcome to my system, which I do for lab10\n");
        boolean flag = true;

        while(flag){
            System.out.println("1. Work with \"Educational institutions\"");
            System.out.println("2. Work with \"Facultets\"");
            System.out.println("3. Work with \"Persons\"");
            System.out.println("4. Work with \"Towns\"");
            System.out.println("5. Work with \"Types\"");
            System.out.println("6. Exit");
            System.out.print("\nYour choice: ");

            Scanner scanner = new Scanner(System.in);
            int command = scanner.nextInt();

            switch(command){
                case 1:
                    educationalInstitutionMenu();
                    break;
                case 2:
                    facultetMenu();
                    break;
                case 3:
                    personMenu();
                    break;
                case 4:
                    townMenu();
                    break;
                case 5:
                    typeMenu();
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.print("\nYour choice is not correct! Try again!\n");
            }
        }
    }

    private static void educationalInstitutionMenu(){
        System.out.println("Work with \"Educational Institution\"\n");

        EducationalInstitutionService educationalInstitutionService = new EducationalInstitutionService();
        boolean flag = true;

        while(flag){
            System.out.println("1. Create educational institution");
            System.out.println("2. Read educational institutions");
            System.out.println("3. Read educational institution by id");
            System.out.println("4. Update educational institution");
            System.out.println("5. Delete educational institution");
            System.out.println("6. Exit");
            System.out.print("\nYour choice: ");

            Scanner scanner = new Scanner(System.in);
            int command = scanner.nextInt();

            switch(command){
                case 1:
                    educationalInstitutionCreate(educationalInstitutionService);
                    break;
                case 2:
                    educationalInstitutionFindAll(educationalInstitutionService);
                    break;
                case 3:
                    educationalInstitutionFindById(educationalInstitutionService);
                    break;
                case 4:
                    educationalInstitutionUpdate(educationalInstitutionService);
                    break;
                case 5:
                    educationalInstitutionDelete(educationalInstitutionService);
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.print("\nYour choice is not correct! Try again!\n");
            }
        }
    }

    private static void educationalInstitutionCreate(EducationalInstitutionService educationalInstitutionService){
        EducationalInstitution educationalInstitution = new EducationalInstitution();

        System.out.println("\nAdd new \"Educational institution\"\n");
        System.out.print("Enter name: ");

        Scanner scanner = new Scanner(System.in);
        educationalInstitution.setName(scanner.nextLine());

        System.out.print("Enter year of founded: ");
        educationalInstitution.setFounded(scanner.nextInt());

        System.out.print("Enter town id: ");
        educationalInstitution.setIdTown(scanner.nextLong());

        System.out.print("Enter type id: ");
        educationalInstitution.setIdType(scanner.nextLong());

        System.out.print("Enter person id: ");
        educationalInstitution.setIdPerson(scanner.nextLong());

        educationalInstitutionService.create(educationalInstitution);
    }

    private static void educationalInstitutionFindAll(EducationalInstitutionService educationalInstitutionService){
        System.out.println("\nShow all \"Educational institutions\"\n");

        ArrayList<EducationalInstitution> educationalInstitutions = educationalInstitutionService.findAll();

        System.out.println();
        for (EducationalInstitution educationalInstitution : educationalInstitutions) {
            System.out.println(educationalInstitution.getId() + " "
                    + educationalInstitution.getName() + " "
                    + educationalInstitution.getFounded() + " "
                    + educationalInstitution.getIdTown() + " "
                    + educationalInstitution.getIdType() + " "
                    + educationalInstitution.getIdPerson());
        }
        System.out.println();
    }

    private static void educationalInstitutionFindById(EducationalInstitutionService educationalInstitutionService){
        System.out.println("\nShow \"Educational institution\" by id\n");
        System.out.print("Enter an id: ");

        Scanner scanner = new Scanner(System.in);
        long id = scanner.nextLong();

        EducationalInstitution educationalInstitution = educationalInstitutionService.findById(id);

        if(educationalInstitution != null){
            System.out.println(educationalInstitution.getId() + " "
                    + educationalInstitution.getName() + " "
                    + educationalInstitution.getFounded() +  " "
                    + educationalInstitution.getIdTown() + " "
                    + educationalInstitution.getIdType() + " "
                    + educationalInstitution.getIdPerson());
        }
    }

    private static void educationalInstitutionUpdate(EducationalInstitutionService educationalInstitutionService){
        EducationalInstitution educationalInstitution = new EducationalInstitution();

        System.out.println("\nUpdate \"Educational institution\"\n");
        System.out.print("Enter an id: ");

        Scanner scanner = new Scanner(System.in);
        long id = scanner.nextLong();

        System.out.print("Enter name: ");

        Scanner scanner2 = new Scanner(System.in);
        educationalInstitution.setName(scanner2.nextLine());

        System.out.print("Enter year of founded: ");
        educationalInstitution.setFounded(scanner2.nextInt());

        System.out.print("Enter town id: ");
        educationalInstitution.setIdTown(scanner2.nextLong());

        System.out.print("Enter type id: ");
        educationalInstitution.setIdType(scanner2.nextLong());

        System.out.print("Enter person id: ");
        educationalInstitution.setIdPerson(scanner2.nextLong());

        educationalInstitutionService.update(educationalInstitution, id);
    }

    private static void educationalInstitutionDelete(EducationalInstitutionService educationalInstitutionService){
        System.out.println("\nDelete \"Educational institution\"\n");
        System.out.print("Enter an id: ");

        Scanner scanner = new Scanner(System.in);
        long id = scanner.nextLong();

        educationalInstitutionService.delete(id);
    }

    private static void facultetMenu(){
        System.out.println("Work with \"Facultets\"\n");

        FacultetService facultetService = new FacultetService();
        boolean flag = true;

        while(flag){
            System.out.println("1. Create facultet");
            System.out.println("2. Read facultets");
            System.out.println("3. Read facultet by id");
            System.out.println("4. Update facultet");
            System.out.println("5. Delete facultet");
            System.out.println("6. Exit");
            System.out.print("\nYour choice: ");

            Scanner scanner = new Scanner(System.in);
            int command = scanner.nextInt();

            switch(command){
                case 1:
                    facultetCreate(facultetService);
                    break;
                case 2:
                    facultetFindAll(facultetService);
                    break;
                case 3:
                    facultetFindById(facultetService);
                    break;
                case 4:
                    facultetUpdate(facultetService);
                    break;
                case 5:
                    facultetDelete(facultetService);
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.print("\nYour choice is not correct! Try again!\n");
            }
        }
    }

    private static void facultetCreate(FacultetService facultetService){
        Facultet facultet = new Facultet();
        System.out.println("\nAdd new \"Facultet\"\n");
        System.out.print("Enter name: ");

        Scanner scanner = new Scanner(System.in);
        facultet.setName(scanner.nextLine());

        System.out.print("Enter year of founded: ");
        facultet.setFounded(scanner.nextInt());

        System.out.print("Enter an educational institution id: ");
        facultet.setIdEducationalInstitution(scanner.nextInt());

        System.out.print("Enter a person id: ");
        facultet.setIdPerson(scanner.nextInt());

        facultetService.create(facultet);
    }

    private static void facultetFindAll(FacultetService facultetService){
        System.out.println("\nShow all \"Facultets\"\n");

        ArrayList<Facultet> facultet = facultetService.findAll();

        System.out.println();
        for (Facultet value : facultet) {
            System.out.println(value.getId() + " "
                    + value.getName() + " "
                    + value.getFounded() + " "
                    + value.getIdEducationalInstitution() + " "
                    + value.getIdPerson());
        }
        System.out.println();
    }

    private static void facultetFindById(FacultetService facultetService){
        System.out.println("\nShow \"Facultet\" by id\n");
        System.out.print("Enter an id: ");

        Scanner scanner = new Scanner(System.in);
        long id = scanner.nextLong();

        Facultet facultet = facultetService.findById(id);

        if(facultet != null){
            System.out.println(facultet.getId() + " "
                    + facultet.getName() + " "
                    + facultet.getFounded() +  " "
                    + facultet.getIdEducationalInstitution() + " "
                    + facultet.getIdPerson());
        }
    }

    private static void facultetUpdate(FacultetService facultetService){
        Facultet facultet = new Facultet();
        System.out.print("\nUpdate \"Facultet\"\n");
        System.out.print("Enter an id: ");

        Scanner scanner = new Scanner(System.in);
        long id = scanner.nextLong();

        System.out.print("Enter name: ");

        Scanner scanner2 = new Scanner(System.in);
        facultet.setName(scanner2.nextLine());

        System.out.print("Enter year of founded: ");
        facultet.setFounded(scanner2.nextInt());

        System.out.print("Enter an educational institution id: ");
        facultet.setIdEducationalInstitution(scanner2.nextInt());

        System.out.print("Enter a person id: ");
        facultet.setIdPerson(scanner2.nextInt());

        facultetService.update(facultet, id);
    }

    private static void facultetDelete(FacultetService facultetService){
        System.out.print("\nDelete \"Facultet\"\n");
        System.out.print("Enter an id: ");

        Scanner scanner = new Scanner(System.in);
        long id = scanner.nextLong();

        facultetService.delete(id);
    }

    private static void personMenu(){
        System.out.println("Work with \"Persons\"\n");

        PersonService personService = new PersonService();
        boolean flag = true;

        while(flag){
            System.out.println("1. Create person");
            System.out.println("2. Read persons");
            System.out.println("3. Read person by id");
            System.out.println("4. Update person");
            System.out.println("5. Delete person");
            System.out.println("6. Exit");
            System.out.print("\nYour choice: ");

            Scanner scanner = new Scanner(System.in);
            int command = scanner.nextInt();

            switch(command){
                case 1:
                    personCreate(personService);
                    break;
                case 2:
                    personFindAll(personService);
                    break;
                case 3:
                    personFindById(personService);
                    break;
                case 4:
                    personUpdate(personService);
                    break;
                case 5:
                    personDelete(personService);
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.print("\nYour choice is not correct! Try again!\n");
            }
        }
    }

    private static void personCreate(PersonService personService){
        Person person = new Person();

        System.out.println("\nAdd new \"Person\"\n");
        System.out.print("Enter first name: ");

        Scanner scanner = new Scanner(System.in);
        person.setFirstName(scanner.nextLine());

        System.out.print("Enter last name: ");
        person.setLastName(scanner.nextLine());

        System.out.print("Enter a birthday year: ");
        person.setBirthdayYear(scanner.nextInt());

        personService.create(person);
    }

    private static void personFindAll(PersonService personService){
        System.out.println("\nShow all \"Persons\"\n");

        ArrayList<Person> person = personService.findAll();

        System.out.println();
        for (Person value : person) {
            System.out.println(value.getId() + " "
                    + value.getLastName() + " "
                    + value.getFirstName() + " "
                    + value.getBirthdayYear());
        }
        System.out.println();
    }

    private static void personFindById(PersonService personService){
        System.out.println("\nShow \"Person\" by id\n");
        System.out.print("Enter an id: ");

        Scanner scanner = new Scanner(System.in);
        long id = scanner.nextLong();

        Person person = personService.findById(id);

        if(person != null){
            System.out.println(person.getId() + " "
                    + person.getLastName() + " "
                    + person.getFirstName() +  " "
                    + person.getBirthdayYear());
        }
    }

    private static void personUpdate(PersonService personService){
        Person person = new Person();
        System.out.println("\nUpdate \"Town\"\n");
        System.out.print("Enter an id: ");

        Scanner scanner = new Scanner(System.in);
        long id = scanner.nextLong();

        System.out.print("\bEnter first name: ");

        Scanner scanner2 = new Scanner(System.in);
        person.setFirstName(scanner2.nextLine());

        System.out.print("Enter last name: ");
        person.setLastName(scanner2.nextLine());

        System.out.print("Enter a birthday year: ");
        person.setBirthdayYear(scanner2.nextInt());

        personService.update(person, id);
    }

    private static void personDelete(PersonService personService){
        System.out.print("\nDelete \"Person\"\n");
        System.out.print("Enter an id: ");

        Scanner scanner = new Scanner(System.in);
        long id = scanner.nextLong();

        personService.delete(id);
    }

    private static void townMenu(){
        System.out.println("Work with \"Towns\"\n");

        TownService townService = new TownService();
        boolean flag = true;

        while(flag){
            System.out.println("1. Create town");
            System.out.println("2. Read towns");
            System.out.println("3. Read town by id");
            System.out.println("4. Update town");
            System.out.println("5. Delete town");
            System.out.println("6. Exit");
            System.out.print("\nYour choice: ");

            Scanner scanner = new Scanner(System.in);
            int command = scanner.nextInt();

            switch(command){
                case 1:
                    townCreate(townService);
                    break;
                case 2:
                    townFindAll(townService);
                    break;
                case 3:
                    townFindById(townService);
                    break;
                case 4:
                    townUpdate(townService);
                    break;
                case 5:
                    townDelete(townService);
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.print("\nYour choice is not correct! Try again!\n");
            }
        }
    }

    private static void townCreate(TownService townService){
        Town town = new Town();
        System.out.println("\nAdd new \"Town\"\n");
        System.out.print("Enter a town name: ");

        Scanner scanner = new Scanner(System.in);
        town.setTownName(scanner.nextLine());

        townService.create(town);
    }

    private static void townFindAll(TownService townService){
        System.out.println("\nShow all \"Towns\"\n");

        ArrayList<Town> town = townService.findAll();

        System.out.println();
        for (Town value : town) {
            System.out.println(value.getId() + " " + value.getTownName());
        }
        System.out.println();
    }

    private static void townFindById(TownService townService){
        System.out.println("\nShow \"Town\" by id\n");
        System.out.print("Enter an id: ");

        Scanner scanner = new Scanner(System.in);
        long id = scanner.nextLong();

        Town town = townService.findById(id);

        if(town != null){
            System.out.println(town.getId() + " " + town.getTownName());
        }
    }

    private static void townUpdate(TownService townService){
        Town town = new Town();
        System.out.println("\nUpdate \"Town\"\n");
        System.out.print("Enter an id: ");

        Scanner scanner = new Scanner(System.in);
        long id = scanner.nextLong();

        System.out.print("Enter a town name: ");

        Scanner scanner2 = new Scanner(System.in);
        town.setTownName(scanner2.nextLine());

        townService.update(town, id);
    }

    private static void townDelete(TownService townService){
        System.out.println("\nDelete \"Town\"\n");
        System.out.print("Enter an id: ");

        Scanner scanner = new Scanner(System.in);
        long id = scanner.nextLong();

        townService.delete(id);
    }

    private static void typeMenu(){
        System.out.println("Work with \"Types\"\n");

        TypeService typeService = new TypeService();
        boolean flag = true;

        while(flag){
            System.out.println("1. Create type");
            System.out.println("2. Read types");
            System.out.println("3. Read type by id");
            System.out.println("4. Update type");
            System.out.println("5. Delete type");
            System.out.println("6. Exit");
            System.out.print("\nYour choice: ");

            Scanner scanner = new Scanner(System.in);
            int command = scanner.nextInt();

            switch(command){
                case 1:
                    typeCreate(typeService);
                    break;
                case 2:
                    typeFindAll(typeService);
                    break;
                case 3:
                    typeFindById(typeService);
                    break;
                case 4:
                    typeUpdate(typeService);
                    break;
                case 5:
                    typeDelete(typeService);
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.print("\nYour choice is not correct! Try again!\n");
            }
        }
    }

    private static void typeCreate(TypeService typeService){
        Type type = new Type();
        System.out.println("\nAdd new \"Type\"\n");
        System.out.print("Enter a type of educational institution: ");

        Scanner scanner = new Scanner(System.in);
        type.setType(scanner.nextLine());

        typeService.create(type);
    }

    private static void typeFindAll(TypeService typeService){
        System.out.println("\nShow all \"Types\"\n");

        ArrayList<Type> type = typeService.findAll();

        System.out.println();
        for(int i=0; i < type.size(); i++){
            System.out.println(type.get(i).getId() + " " + type.get(i).getType());
        }
        System.out.println();
    }

    private static void typeFindById(TypeService typeService){
        System.out.println("\nShow \"Type\" by id\n");
        System.out.print("Enter an id: ");

        Scanner scanner = new Scanner(System.in);
        long id = scanner.nextLong();

        Type type = typeService.findById(id);

        if(type != null){
            System.out.println(type.getId() + " " + type.getType());
        }
    }

    private static void typeUpdate(TypeService typeService){
        Type type = new Type();
        System.out.println("\nUpdate \"Type\"\n");
        System.out.print("Enter an id: ");

        Scanner scanner = new Scanner(System.in);
        long id = scanner.nextLong();

        System.out.print("Enter a type of educational institution: ");

        Scanner scanner2 = new Scanner(System.in);
        type.setType(scanner2.nextLine());

        typeService.update(type, id);
    }

    private static void typeDelete(TypeService typeService){
        System.out.println("\nDelete \"Type\"\n");
        System.out.print("Enter an id: ");

        Scanner scanner = new Scanner(System.in);
        long id = scanner.nextLong();

        typeService.delete(id);
    }
}
