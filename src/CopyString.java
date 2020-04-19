//Amanda has a string of lowercase letters that she wants to copy to a new string. She can perform the following operations with the given costs. She can perform them any number of times to construct a new string :
//
//        Append a character to the end of string  at a cost of  dollar.
//        Choose any substring of  and append it to the end of  at no charge.
//        Given  strings , find and print the minimum cost of copying each  to  on a new line.
//
//        For example, given a string , it can be copied for  dollars. Start by copying ,  and  individually at a cost of  dollar per character. String  at this time. Copy  to the end of  at no cost to complete the copy.
//
//        Function Description
//
//        Complete the stringConstruction function in the editor below. It should return the minimum cost of copying a string.
//
// task from HackerRank

public class CopyString {
    static int stringConstruction(String s) {
        return (int)s.chars().distinct().count();
    }

    public static void main(String[] args) {

     System.out.println(stringConstruction("abab"));
     System.out.println(stringConstruction("abcd"));
     System.out.println(stringConstruction("abcab"));
    }
}
