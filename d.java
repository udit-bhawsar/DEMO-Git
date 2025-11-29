import java.util.Scanner;
class DMart{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter your name: ");
String name = sc.next();
System.out.print("Enter your gender: ");
String gender = sc.next();

System.out.print("Enter Product 1: ");
String pname1 = sc.next();
System.out.print("Enter Quantity of "+pname1+": ");
int quantity1 = sc.nextInt();
System.out.print("Enter Product 2: ");
String pname2 = sc.next();
System.out.print("Enter Quantity of "+pname2+": ");
int quantity2 = sc.nextInt();
System.out.print("Enter Product 3: ");
String pname3 = sc.next();
System.out.print("Enter Quantity of "+pname3+": ");
int quantity3 = sc.nextInt();
System.out.print("Enter Product 4: ");
String pname4 = sc.next();
System.out.print("Enter Quantity of "+pname4+": ");
int quantity4 = sc.nextInt();
System.out.print("Enter Product 5: ");
String pname5 = sc.next();
System.out.print("Enter Quantity of "+pname5+": ");
int quantity5 = sc.nextInt();
System.out.print("Enter Product 6: ");
String pname6 = sc.next();
System.out.print("Enter Quantity of "+pname6+": ");
int quantity6 = sc.nextInt();
System.out.print("Enter Product 7: ");
String pname7 = sc.next();
System.out.print("Enter Quantity of "+pname7+": ");
int quantity7 = sc.nextInt();
System.out.print("Enter Product 8: ");
String pname8 = sc.next();
System.out.print("Enter Quantity of "+pname8+": ");
int quantity8 = sc.nextInt();
System.out.print("Enter Product 9: ");
String pname9 = sc.next();
System.out.print("Enter Quantity of "+pname9+": ");
int quantity9 = sc.nextInt();
System.out.print("Enter Product 10: ");
String pname10 = sc.next();
System.out.print("Enter Quantity of "+pname10+": ");
int quantity10 = sc.nextInt();

double price1=0;
if(pname1.equals("almond")){
price1 = 80;
}
else if(pname1.equals("bottle")){
price1 = 50;
}
else if(pname1.equals("choclate")){
price1 = 60;
}
else if(pname1.equals("detergent")){
price1 = 40;
}
else if(pname1.equals("facewash")){
price1 = 70;
}
else if(pname1.equals("hairoil")){
price1 = 20;
}
else if(pname1.equals("oil")){
price1 = 90;
}
else if(pname1.equals("soap")){
price1 = 20;
}
else if(pname1.equals("lotion")){
price1 = 50;
}
else if(pname1.equals("toothpaste")){
price1 = 10;
}
else{
System.out.print("Product not available");
}
double cost1=0,fprice1=0;
if(quantity1>4){
cost1 = price1 * quantity1;
double dis = cost1 * 5/100;
fprice1 = cost1 - dis;
}
else{
fprice1 = price1 * quantity1;
}
System.out.println("Product 1 final cost: "+fprice1);



double price2=0;
if(pname2.equals("almond")){
price2 = 80;
}
else if(pname2.equals("bottle")){
price2 = 50;
}
else if(pname2.equals("choclate")){
price2 = 60;
}
else if(pname2.equals("detergent")){
price2 = 40;
}
else if(pname2.equals("facewash")){
price2 = 70;
}
else if(pname2.equals("hairoil")){
price2 = 20;
}
else if(pname2.equals("oil")){
price2 = 90;
}
else if(pname2.equals("soap")){
price2 = 20;
}
else if(pname2.equals("lotion")){
price2 = 50;
}
else if(pname2.equals("toothpaste")){
price2 = 10;
}
else{
System.out.print("Product not available");
}
double fprice2 = price2 * quantity2;
System.out.println("Total cost of product 2: "+fprice2);




double price3=0;
if(pname3.equals("almond")){
price3 = 80;
}
else if(pname3.equals("bottle")){
price3 = 50;
}
else if(pname3.equals("choclate")){
price3 = 60;
}
else if(pname3.equals("detergent")){
price3 = 40;
}
else if(pname3.equals("facewash")){
price3 = 70;
}
else if(pname3.equals("hairoil")){
price3 = 20;
}
else if(pname3.equals("oil")){
price3 = 90;
}
else if(pname3.equals("soap")){
price3 = 20;
}
else if(pname2.equals("lotion")){
price3 = 50;
}
else if(pname3.equals("toothpaste")){
price3 = 10;
}
else{
System.out.print("Product not available");
}
double fprice3 = price3 * quantity3;
System.out.println("Total cost of product 3: "+fprice3);


double price4=0;
if(pname4.equals("almond")){
price4 = 80;
}
else if(pname4.equals("bottle")){
price4 = 50;
}
else if(pname4.equals("choclate")){
price4 = 60;
}
else if(pname4.equals("detergent")){
price4 = 40;
}
else if(pname4.equals("facewash")){
price4 = 70;
}
else if(pname4.equals("hairoil")){
price4 = 20;
}
else if(pname4.equals("oil")){
price4 = 90;
}
else if(pname4.equals("soap")){
price4 = 20;
}
else if(pname4.equals("lotion")){
price4 = 50;
}
else if(pname4.equals("toothpaste")){
price4 = 10;
}
else{
System.out.print("Product not available");
}
double fprice4 = price4 * quantity4;
System.out.println("Total cost of product 4: "+fprice4);



double price5=0;
if(pname5.equals("almond")){
price5 = 80;
}
else if(pname5.equals("bottle")){
price5 = 50;
}
else if(pname5.equals("choclate")){
price5 = 60;
}
else if(pname5.equals("detergent")){
price5 = 40;
}
else if(pname5.equals("facewash")){
price5 = 70;
}
else if(pname5.equals("hairoil")){
price5 = 20;
}
else if(pname5.equals("oil")){
price5 = 90;
}
else if(pname5.equals("soap")){
price5 = 20;
}
else if(pname5.equals("lotion")){
price5 = 50;
}
else if(pname5.equals("toothpaste")){
price5 = 10;
}
else{
System.out.print("Product not available");
}
double fprice5 = price5 * quantity5;
System.out.println("Total cost of product 5: "+fprice5);


double price6=0;
if(pname6.equals("almond")){
price6 = 80;
}
else if(pname6.equals("bottle")){
price6 = 50;
}
else if(pname6.equals("choclate")){
price6 = 60;
}
else if(pname6.equals("detergent")){
price6 = 40;
}
else if(pname6.equals("facewash")){
price6 = 70;
}
else if(pname6.equals("hairoil")){
price6 = 20;
}
else if(pname6.equals("oil")){
price6 = 90;
}
else if(pname6.equals("soap")){
price6 = 20;
}
else if(pname6.equals("lotion")){
price6 = 50;
}
else if(pname6.equals("toothpaste")){
price6 = 10;
}
else{
System.out.print("Product not available");
}
double fprice6 = price6 * quantity6;
System.out.println("Total cost of product 6: "+fprice6);



double price7=0;
if(pname7.equals("almond")){
price7 = 80;
}
else if(pname7.equals("bottle")){
price7 = 50;
}
else if(pname7.equals("choclate")){
price7 = 60;
}
else if(pname7.equals("detergent")){
price7 = 40;
}
else if(pname7.equals("facewash")){
price7 = 70;
}
else if(pname7.equals("hairoil")){
price7 = 20;
}
else if(pname7.equals("oil")){
price7 = 90;
}
else if(pname7.equals("soap")){
price7 = 20;
}
else if(pname7.equals("lotion")){
price7 = 50;
}
else if(pname7.equals("toothpaste")){
price7 = 10;
}
else{
System.out.print("Product not available");
}
double fprice7 = price7 * quantity7;
System.out.println("Total cost of product 7: "+fprice7);


double price8=0;
if(pname8.equals("almond")){
price8 = 80;
}
else if(pname8.equals("bottle")){
price8 = 50;
}
else if(pname8.equals("choclate")){
price8 = 60;
}
else if(pname8.equals("detergent")){
price8 = 40;
}
else if(pname8.equals("facewash")){
price8 = 70;
}
else if(pname8.equals("hairoil")){
price8 = 20;
}
else if(pname8.equals("oil")){
price8 = 90;
}
else if(pname8.equals("soap")){
price8 = 20;
}
else if(pname8.equals("lotion")){
price8 = 50;
}
else if(pname8.equals("toothpaste")){
price8 = 10;
}
else{
System.out.print("Product not available");
}
double fprice8 = price8 * quantity8;
System.out.println("Total cost of product 8: "+fprice8);



double price9=0;
if(pname9.equals("almond")){
price9 = 80;
}
else if(pname9.equals("bottle")){
price9 = 50;
}
else if(pname9.equals("choclate")){
price9 = 60;
}
else if(pname9.equals("detergent")){
price9 = 40;
}
else if(pname9.equals("facewash")){
price9 = 70;
}
else if(pname9.equals("hairoil")){
price9 = 20;
}
else if(pname9.equals("oil")){
price9 = 90;
}
else if(pname9.equals("soap")){
price9 = 20;
}
else if(pname9.equals("lotion")){
price9 = 50;
}
else if(pname9.equals("toothpaste")){
price9 = 10;
}
else{
System.out.print("Product not available");
}
double fprice9 = price9 * quantity9;
System.out.println("Total cost of product 9: "+fprice9);





double price10=0;
if(pname10.equals("almond")){
price10 = 80;
}
else if(pname10.equals("bottle")){
price10 = 50;
}
else if(pname10.equals("choclate")){
price10 = 60;
}
else if(pname10.equals("detergent")){
price10 = 40;
}
else if(pname10.equals("facewash")){
price10 = 70;
}
else if(pname10.equals("hairoil")){
price10 = 20;
}
else if(pname10.equals("oil")){
price10 = 90;
}
else if(pname10.equals("soap")){
price10 = 20;
}
else if(pname10.equals("lotion")){
price10 = 50;
}
else if(pname10.equals("toothpaste")){
price10 = 10;
}
else{
System.out.print("Product not available"); 
}
double fprice10 = price10 * quantity10;
System.out.println("Total cost of product 10: "+fprice10);


double gtotal = fprice1 + fprice2 + fprice3 + fprice4 + fprice5 + fprice6 + fprice7 + fprice8 + fprice9 + fprice10;
System.out.println("Grand total: "+gtotal);

double totalb = gtotal;
if(gtotal > 10000){
double off1 = gtotal * 15/100;
totalb = gtotal - off1;
System.out.println("Congratulations!!! you got 15% discount");
}
else if(gtotal <= 10000 && gtotal > 5000 ){
double off2 = gtotal * 10/100;
totalb = gtotal - off2;
System.out.println("Congratulations!!! you got 10% discount");
}
else{
System.out.println("Sorry!! No discount");

}
System.out.println("Total bill: "+totalb);




System.out.println("\t\t\t\t\t\tD-mart");
System.out.println("Name: "+name);
System.out.println("------------------------------------------------------------------------------------------------------------");
System.out.println("Item Name \t\t Quantity \t\t Price \t\t Total \t\t After Discount");
System.out.println(pname1+ "\t\t" +quantity1+ "\t\t" +price1+  "\t\t" +cost1+ "\t\t" +fprice1);
System.out.println(pname2+ "\t\t" +quantity2+ "\t\t" +price2+  "\t\t" +fprice2+ "\t\t" +fprice2);
System.out.println(pname3+ "\t\t" +quantity3+ "\t\t" +price3+  "\t\t" +fprice3+ "\t\t" +fprice3);
System.out.println(pname4+ "\t\t" +quantity4+ "\t\t" +price4+  "\t\t" +fprice4+ "\t\t" +fprice4);
System.out.println(pname5+ "\t\t" +quantity5+ "\t\t" +price5+  "\t\t" +fprice5+ "\t\t" +fprice5);
System.out.println(pname6+ "\t\t" +quantity6+ "\t\t" +price6+  "\t\t" +fprice6+ "\t\t" +fprice6);
System.out.println(pname7+ "\t\t" +quantity7+ "\t\t" +price7+  "\t\t" +fprice7+ "\t\t" +fprice7);
System.out.println(pname8+ "\t\t" +quantity8+ "\t\t" +price8+  "\t\t" +fprice8+ "\t\t" +fprice8);
System.out.println(pname9+ "\t\t" +quantity9+ "\t\t" +price9+  "\t\t" +fprice9+ "\t\t" +fprice9);
System.out.println(pname10+ "\t\t" +quantity10+ "\t\t" +price10+  "\t\t" +fprice10+ "\t\t" +fprice10);


.
















}

}