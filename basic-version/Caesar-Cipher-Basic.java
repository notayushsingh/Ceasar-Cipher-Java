import java.util.*;                                                                 //importing package
class Ceasar_Cipher
{
    public static void main(String args[])
    {
        int i=0;
        String output="";
        Scanner sc=new Scanner(System.in);                                          //using Scanner Function to get input from user
        
        System.out.print("Enter a String to encrypt: ");
        String input=sc.nextLine();                                                 //Accepting a String
        
        System.out.print("Enter the shift value: ");
        int shift=sc.nextInt();                                                     //Accepting Shifting Value
        
        if(shift%26==0)
        {
            System.out.println("We can't encrypt at the given shifting value");     /*As alphabet consists of 26 letters.
                                                                                    So,Shifting by 26 wouldn't change the input String.
                                                                                    Thus we show the original String only without any encryption */
            System.out.println("Original String="+ input);
            System.exit(0);

        }

        else
        {
            shift%=26;
        }

        for(i=0;i<input.length();i++)
        {
            char ch=input.charAt(i);
            if(Character.isUpperCase(ch))
            {
                ch=(char)('A'+(ch-'A'+shift)%26);                          
            }

            /*Example for this Encryption Logic
            Input:Hello World ;    Shift=3
            
            Firstly,the character 'H' will go in ch variable.
            Now,we want to shift it by 3.

            Starting from innermost brackets we have ch-'A'(and in ch we have 'H')
            So we get 'H'-'A' i.e. 72-65=7
            Now adding shifting value in it we get 10.

            We used modulo outside this bracket to keep position within alphabet.
            (For example,if position becomes 26,  26%26=0 which will eventually correspond to 'A')

            Now,outside this bracket we add 'A' i.e. 65 we get 75 and converting it into char we get 'K'.

            That's how we can encrypt in simple way!  */

            else if(Character.isLowerCase(ch))
            {
                ch=(char)('a'+(ch-'a'+shift)%26);
            }

            /*Same Explanation applies here just with lowercase characters */

            output+=ch;                                                             //It Stores Encrypted Word
        }
        System.out.print("Your Encrypted String is: "+output);

    }
}
