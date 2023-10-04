public class HairTieRunner {
    public static void main(String [] args) {
        System.out.println("-- TESTING CONSTRUCTORS AND GETTER METHODS --");
        HairTie tie1 = new HairTie("blue", 1, 0.20, true);
        System.out.println(tie1.getColor());
        System.out.println(tie1.getDiameter());
        System.out.println(tie1.getPrice());
        System.out.println(tie1.getStretchy());

        HairTie tie2 = new HairTie();
        System.out.println(tie2.getColor());
        System.out.println(tie2.getDiameter());
        System.out.println(tie2.getPrice());
        System.out.println(tie2.getStretchy());

        System.out.println("-- TESTING SETTER, CALCULATE RADIUS, CALCULATE CIRCUMFERENCE, AND PRINT HAIR TIE INFO METHODS --");
        tie1.printHairTieInfo();
        System.out.println("The radius is: " + tie1.calculateRadius());
        System.out.println("The circumference is: " + tie1.calculateCircumference());
        tie1.setColor("red");
        tie1.setDiameter(2);
        tie1.setPrice(0.50);
        tie1.setStretchy(false);
        System.out.println(tie1.calculateRadius());
        System.out.println(tie1.calculateCircumference());

        tie2.printHairTieInfo();
        System.out.println("The radius is: " + tie2.calculateRadius());
        System.out.println("The circumference is: " + tie2.calculateCircumference());
        tie2.setColor("yellow");
        tie2.setDiameter(5);
        tie2.setPrice(1.20);
        tie2.setStretchy(false);
        System.out.println(tie2.calculateRadius());
        System.out.println(tie2.calculateCircumference());
    }
}
