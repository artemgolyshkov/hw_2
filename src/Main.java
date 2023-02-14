public class Main {
        public static void main(String[] args) {
            task1();
            task2();
            task3();
        }

        public static void task1 () {
            System.out.println("Задача 1-3");
            System.out.println("Задача 1");
              var dog = 8.0;
               System.out.println(dog);
              var cat = 3.6;
               System.out.println(cat);
              var paper = 763789;
               System.out.println(paper); // Код для задачи 1
            System.out.println("Задача 2");
              dog = dog + 4;
               System.out.println(dog);
              cat = cat + 4;
               System.out.println(cat);
              paper = paper + 4;
               System.out.println(paper);// Код для задачи 2
            System.out.println("Задача 3");
              dog = dog - 3.5 ;
               System.out.println(dog);
              cat = cat - 1.6;
               System.out.println(cat);
              paper = paper - 7639;
               System.out.println(paper);// Код для задачи 3

        }

        public static void task2 () {
            System.out.println("Задача 4-5");
            System.out.println("Задача 4");
              var friend = 19;
               System.out.println(friend);
              friend = friend + 2;
               System.out.println(friend);
              friend = friend / 7;
               System.out.println(friend);// Код для задачи 4
            System.out.println("Задача 5");
              var frog = 3.5;
               System.out.println(frog);
              frog = frog * 10;
               System.out.println(frog);
              frog = frog / 3.5;
               System.out.println(frog);
              frog = frog + 4;
               System.out.println(frog);// Код для задачи 4

        }
    public static void task3 () {
        System.out.println("Задача 6-8");
        System.out.println("Задача 6");
          var oneBoxers = 78.2;
          var twoBoxers = 82.7;
          var totalWeightBoxers = oneBoxers + twoBoxers;
           System.out.println("Общий вес бойцов равен " + totalWeightBoxers + " кг!");
          var weightDifference = (-oneBoxers - (-twoBoxers));
           System.out.println("Разница в весе бойцов равна " + weightDifference + " кг!"); // Код для задачи 6
        System.out.println("Задача 7");
          var weightDifference1 = twoBoxers - oneBoxers;
           System.out.println("Разница в весе бойцов равна " + weightDifference1 + " кг!");
          var weightDifference2 =  twoBoxers % oneBoxers;
           System.out.println("Разница в весе бойцов равна " + weightDifference2 + " кг!"); // Код для задачи 7
        System.out.println("Задача 8");
          var totalHours = 640;
          var oneEmployee = 8;
          var numberEmployees = totalHours / oneEmployee;
           System.out.println("Всего работников в компании - " + numberEmployees + " человек");
          var totalPeople = numberEmployees + 94;
          var totalHoursTwo = totalPeople * oneEmployee;
           System.out.println("Если в компании работает - " + totalPeople + " человек, то всего " + totalHoursTwo + " часа работы может быть поделено между сотрудниками" );// Код для задачи 8
    }
    }
