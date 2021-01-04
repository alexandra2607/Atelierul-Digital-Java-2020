//package Lab2.challenge2;
//
//public class Main {
//    public static void main(String[] args) {
//        Premiu oscar1990 = new Premiu("oscar", 1990);
//        Premiu oscar2000 = new Premiu("oscar", 2000);
//        Premiu oscar2010 = new Premiu("oscar", 2010);
//        Premiu oscar2020 = new Premiu("oscar", 2020);
//
//        Actor actorOscar1990 = new Actor("actor cu 2 oscaruri", 35, new Premiu[]{oscar1990, oscar2000});
//        Actor actorOscar2010 = new Actor("actor cu oscar in 2000", 55, new Premiu[]{oscar2010});
//        Actor actorOscar2018 = new Actor("actor cu oscar din 2018", 23, new Premiu[]{oscar2020});
//        Actor asctorFaraPremii01 = new Actor("actor fara oscar 01", 22, new Premiu[]{});
//        Actor asctorFaraPremii02 = new Actor("actor fara oscar 02", 27, new Premiu[]{});
//        Actor asctorFaraPremii03 = new Actor("actor fara oscar 03", 42, new Premiu[]{});
//
//        Film film1 = new Film(1990, "film cu actori de oscar", new Actor[]{actorOscar1990, asctorFaraPremii01});
//        Film film2 = new Film(2010, "film cu actori fara premii1", new Actor[]{asctorFaraPremii01, asctorFaraPremii02, asctorFaraPremii03});
//        Film film3 = new Film(2010, "film cu actori fara premii2", new Actor[]{asctorFaraPremii02, asctorFaraPremii03});
//        Film film4 = new Film(2020, "film cu actori de oscar", new Actor[]{actorOscar2018, actorOscar2010});
//        Film film5 = new Film(2020, "film cu actori fara premii5", new Actor[]{asctorFaraPremii02, asctorFaraPremii03});
//
//        Studio studio1 = new Studio("MGM", new Film[]{film1, film2});
//        Studio studio2 = new Studio("Disney", new Film[]{film3, film4, film5});
//
//        Studio[] studioDatabase = new Studio[]{studio1, studio2};
//
//        for ( int i = 0; i < studioDatabase.length;i++) {
//            if(studioDatabase[i].getFilms().length > 2) {
//                System.out.println(studioDatabase[i].nume + " studio have published more than 2 films");
//            }
//
//            System.out.println((studioDatabase[i].getFilms().length));
//
//        }
//    }
//}
