import java.util.*;
class Example{
        public static void main(String[] args){
                Scanner input=new Scanner(System.in);

                System.out.println("===============================================================================================");
                System.out.println("__          __  _                            _          _ __  __            _                 ");
                System.out.println("\\ \\        / / | |                          | |        (_)  \\/  |          | |             ");
                System.out.println(" \\ \\  /\\  / /__| | ___ ___  _ __ ___   ___  | |_ ___    _| \\  / | __ _ _ __| |_           ");   
                System.out.println("  \\ \\/  \\/ / _ \\ |/ __/ _ \\| '_ ' _ \\ / _ \\ | __/ _ \\  | | |\\/| |/ _' | '__| __|     ");
                System.out.println("   \\  /\\  /  __/ | (_| (_) | | | | | |  __/ | || (_) | | | |  | | (_| | |  | |_             ");
                System.out.println("    \\/  \\/ \\___|_|\\___\\___/|_| |_| |_|\\___|  \\__\\___/  |_|_|  |_|\\__,_|_|   \\__|    ");
                System.out.println("                                                                                               ");
                System.out.println("================================================================================================");
                
                String a,b;

                System.out.print("Enter customer phone number - ");		
                a=input.nextLine();
                System.out.print("Enter customer name - ");		
                b=input.nextLine();
                System.out.println("                                                                                ");
                System.out.println("===============================================================================================");
                
                int c,d,e,f,g,h,i;
                
                System.out.print("Basmathi - ");
                c=input.nextInt();
                System.out.print("Dhal - ");
                d=input.nextInt();
                System.out.print("Sugar - ");
                e=input.nextInt();
                System.out.print("Higland - ");
                f=input.nextInt();
                System.out.print("Yoghurt - ");
                g=input.nextInt();
                System.out.print("Flour - ");
                h=input.nextInt();
                System.out.print("Soap - ");
                i=input.nextInt();
         
                int j,k,l,m,n,o,p,q,r;
                j=c*250;
                k=d*180;
                l=e*150;
                m=f*1200;
                n=g*50;
                o=h*120;
                p=i*160; 
                q=j+k+l+m+n+o+p;
                r=(q*10)/100;

                System.out.println("+----------------------------------------------------------------------------------------------+");
                System.out.println("|                         _   __  __          _____ _______                                    |");
                System.out.println("|                        (_) |  \\/  |   /\\   |  _  \\__   __|                                   |");
                System.out.println("|                         _  | \\  / |  /  \\  | |_)  | | |                                      |");   
                System.out.println("|                        | | | |\\/| | / /\\ \\ |  _  /  | |                                      |");
                System.out.println("|                        | | | |  | |/ ____ \\| | \\ \\  | |                                      |");
                System.out.println("|                        |_| |_|  |_/_/    \\_\\_|  \\_\\ |_|                                      |");
                System.out.println("|                               225,Galle road panadura                                        |");
                System.out.println("|                                                                                              |");
                System.out.println("+----------------------------------------------------------------------------------------------+");
                System.out.println("|                                #Tel  : 0761888026                                            |");
                System.out.println("|                                #Name : Sumudu                                                |");
                System.out.println("+--------------+--------------+------------------------------+---------------------------------+");
                System.out.println("|              |              |                              |                                 |");
                System.out.println("|              |     Qty      |         Unit price           |             Price               |");
                System.out.println("+--------------+--------------+------------------------------+---------------------------------+");
                System.out.println("| #Basmathi    |    "+c+"         |        250.0                 |        "+c*250   +"                     |");
                System.out.println("|              |              |                              |                                 |");
                System.out.println("| #Dhal        |    "+d+"         |        180.0                 |        "+d*180   +"                      |");
                System.out.println("|              |              |                              |                                 |");
                System.out.println("| #Sugar       |    "+e+"         |        150.0                 |        "+e*150   +"                      |");
                System.out.println("|              |              |                              |                                 |");
                System.out.println("| #Highland    |    "+f+"         |        1200.0                |        "+f*1200   +"                    |");
                System.out.println("|              |              |                              |                                 |");
                System.out.println("| #Yoghutr     |    "+g+"         |        50.0                  |        "+g*50   +"                      |");
                System.out.println("|              |              |                              |                                 |");
                System.out.println("| #Flour       |    "+h+"         |        120.0                 |        "+h*120   +"                      |");
                System.out.println("|              |              |                              |                                 |");
                System.out.println("| #Soap        |    "+i+"         |        160.0                 |        "+i*160  +"                      |");
                System.out.println("|              |              |                              |                                 |");
                System.out.println("+--------------+--------------+------------------------------+---------------------------------+");
                System.out.println("                              |     Total                    |       "+(j+k+l+m+n+o+p)+   "                     |");
                System.out.println("                              +------------------------------+---------------------------------+");
                System.out.println("                              |     Discount(10%)            |       "+(q*10)/100+   "                      |");
                System.out.println("                              +------------------------------+---------------------------------|");
                System.out.println("                              |     Price                    |       "+(q-r)+   "                     |");
                System.out.println("                              +------------------------------+---------------------------------+");
				
				int s,t,u;
				t=(q-r);
				System.out.print("Enter coustermer given amount - ");		
                s=input.nextInt();
                
                System.out.println("+-----------------+-------------------+");
                System.out.println("|   Net ammount   | "   +  t  +   "              |");
                System.out.println("+-----------------+-------------------+");
                System.out.println("|   Cash          | "   + s +      "             |");
                System.out.println("+-----------------+-------------------+");
                System.out.println("|   Change        | "   + (s-t) +  "              |");
                System.out.println("+-----------------+-------------------+");
                System.out.println("");
                System.out.println("");
                
                u=(s-t);
                
                int aa,ab,ac,ad,ae,af,ag,ah,ai,aj,ak,al,am;
                
                aa=u/5000;
                u=u%5000;
                ab=u/2000;
                u=u%2000;
                ac=u/1000;
                u=u%1000;
                ad=u/500;
                u=u%500;
                ae=u/100;
                u=u%100;
                af=u/50;
                u=u%50;
                ag=u/20;
                u=u%20;
                ah=u/10;
                u=u%10;
                ai=u/5;
                u=u%5;
                aj=u/2;
                u=u%2;
                ak=u/1;
                u=u/1;
                
                al=aa+ab+ac+ad+ae+af+ag;
                am=ah+ai+aj+ak;
                
                System.out.println("+---------------------+--------------------+");
                System.out.println("|       Value         |         No         |");
                System.out.println("+---------------------+--------------------+");
                System.out.println("|   Rs.5000           |  "  + aa +  "                 |");
                System.out.println("+---------------------+--------------------+");
                System.out.println("|   Rs.2000           |  "  + ab +  "                 |");
                System.out.println("+---------------------+--------------------+");
                System.out.println("|   Rs.1000           |  "  + ac +  "                 |");
                System.out.println("+---------------------+--------------------+");
                System.out.println("|   Rs.500            |  "  + ad +  "                 |");
                System.out.println("+---------------------+--------------------+");
                System.out.println("|   Rs.100            |  "  + ae  +  "                 |");
                System.out.println("+---------------------+--------------------+");
                System.out.println("|   Rs.50             |  "  + af   +  "                 |");
                System.out.println("+---------------------+--------------------+");  
                System.out.println("|   Rs.20             |  "  + ag   +  "                 |");
                System.out.println("+---------------------+--------------------+");
                System.out.println("|   Rs.10             |  "  + ah   +  "       	   |");
                System.out.println("+---------------------+--------------------+");
                System.out.println("|   Rs.5              |  "  + ai    +  "       	   |");
                System.out.println("+---------------------+--------------------+");
                System.out.println("|   Rs.2              |  "  + aj    +  "                 |");
                System.out.println("+---------------------+--------------------+");
                System.out.println("|   Rs.1              |  "  + ak    +  "        	   |");
                System.out.println("+---------------------+--------------------+");
                System.out.println("|   No of notes       |  "  + al   +  "         	   | ");
                System.out.println("+---------------------+--------------------+");
                System.out.println("|   No of coins       |  "  + am  +  "          	   |");
                System.out.println("+---------------------+--------------------+");
                System.out.println("  ");
                System.out.println("   ");
 
                System.out.println("---------------------------------------------------------------");
                System.out.println("             THANK YOU FOR SHOPPING WITH US                    ");
                System.out.println("---------------------------------------------------------------");
                
        }
}












