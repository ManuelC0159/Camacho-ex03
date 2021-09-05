/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;
public class Solution03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the quote? ");
        String quote = input.nextLine();
        System.out.println("Who said it? ");
        String Author = input.nextLine();
        System.out.println(Author + " says, \""+ quote +".\"" );

    }
}
/*
    PseudoCode
    Ask user for quote using standard input
    get quote from user using standard input
    Ask user for Author of the quote using standard input
    get Author from user using standard input
    Print author says quote into standard output
 */