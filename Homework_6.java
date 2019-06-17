/**
 * level 1, lesson 6
 * @author Maluy Yaroslav
 * @version date 17.06.19
 */
import java.util.Random;
class Homework_6 {

    public static void main(String[] args) {
        Cat cat = new Cat(1,112, 5);
        Dog dog = new Dog( 0.7, 370, 10);
    }
}
//1. Создать классы Собака и Кот с наследованием от класса Животное.
    class Cat extends Animal {

        public Cat(double jump, int run, int swim) {
            super(jump, run, swim);
            System.out.println("Cat:");
            checkCatJump(jump);
            checkCatRun(run);
            checkCatSwim(swim);
//3. У каждого животного есть ограничения на действия
// (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
// 4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль.
// (Например, dog1.run(150); -> результат: run: true)
// 5. * Добавить животным разброс в ограничениях.
// То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.
        }
        void checkCatJump(double jump) {
            if (jump <= (0.5 + 3 * rand.nextDouble()) && jump >= 0) {
                System.out.println("jamp: true");
            } else {
                System.out.println("jamp: false");
            }
        }

        void checkCatRun(int run) {
                if (run <= (rand.nextInt(101) + 100) && run >= 0 ) {
                    System.out.println("run: true");
                } else {
                    System.out.println("run: false");
                }
            }
            void checkCatSwim(int swim) {
                System.out.println("swim: false");
            }
        }

    class Dog extends Animal {
        public Dog(double jump, int run, int swim) {
            super(jump, run, swim);
            System.out.println("Dog:");
            checkDogJump(jump);
            checkDogRun(run);
            checkDogSwim(swim);
        }
        void checkDogJump(double jump) {
            if (jump <= (0.5 + rand.nextDouble()) && jump >= 0) {
                System.out.println("jamp: true");
            } else {
                System.out.println("jamp: false");
            }
        }

        void checkDogRun(int run) {
            if (run <= (rand.nextInt(201) + 300) && run >= 0) {
                System.out.println("run: true");
            } else {
                System.out.println("run: false");
            }
        }
        void checkDogSwim(int swim) {
            if (swim <= (rand.nextInt(11) + 10) && swim >= 0) {
                System.out.println("swim: true");
            } else {
                System.out.println("swim: false");
            }
        }
    }
//2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
// В качестве параметра каждому методу передается величина, означающая или длину препятствия (для бега и плавания),
// или высоту (для прыжков).
    class Animal  {
        Random rand = new Random();
         double jump;
         int run;
         int swim;

        public Animal(double jump, int run, int swim) {
            this.jump = jump;
            this.run = run;
            this.swim = swim;
        }
    }

