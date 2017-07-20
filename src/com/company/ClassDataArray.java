package com.company;

/**
 * Created by alexander.mikhailov on 17.05.2017.
 */
class Person {
    private String lastName;
    private String firstName;
    private int age;

    public Person(String last,String first,int a){
        lastName = last;
        firstName = first;
        age = a;
    }
    public void displayPerson(){
        System.out.print(" Last name: " + lastName);
        System.out.print(", First name: " + firstName);
        System.out.println(". Age" + age );
    }

    public String getLast(){
        return lastName;
    }
}

class ClassDataArray{
    private Person[] a;
    private int nElems;

    public ClassDataArray(int max){
        a = new Person[max];
        nElems = 0;
    }
    public Person find(String searchName){
        int j;
        for (j = 0;j < nElems;j++)
            if (a[j].getLast().equals(searchName))
                break;
        if (j == nElems)
            return null;
        else
            return a[j];
    }
    public void insert(String last,String first,int age){
        a[nElems] = new Person(last,first,age);
        nElems++;
    }
    public boolean delete(String searchName){
        int j;
        for (j = 0;j < nElems;j++)
            if (a[j].getLast().equals(searchName))
                break;
        if (j==nElems)
            return false;
        else{
            for (int k = j;k < nElems;k++)
                a[k] = a[k+1];
            nElems--;
            return true;
        }
    }
    public void display(){
        for ( int j = 0;j < nElems;j++)
            a[j].displayPerson();
    }
}
class ClassDataApp{
        public static void main(String[] args){
            int maxSize = 100;
            ClassDataArray arr;
            arr = new ClassDataArray(maxSize);

            arr.insert("Evans","Patty",24);
            arr.insert("Smith","Larraine",37);
            arr.insert("Yee","Tom",43);
            arr.insert("Adams","Henry",63);
            arr.insert("Hashimoto","Sato",21);
            arr.insert("Stimson","Henry",29);
            arr.insert("Velasquez","Jose",72);
            arr.insert("Lambarque","Henty",54);
            arr.insert("Vang","Minh",22);
            arr.insert("Creswell","Lusinda",18);

            arr.display();
            String searchKey = "Stimson";
            Person found;
            found = arr.find(searchKey);
            if (found != null){
                System.out.print("Found ");
                found.displayPerson();
            }
            else
                System.out.println("Cant find " +  searchKey);

            System.out.println("Deleting Smith,Yee snd Creswell");
            arr.delete("Smith");
            arr.delete("Yee");
            arr.delete("Creswell");

            arr.display();
        }
        }
