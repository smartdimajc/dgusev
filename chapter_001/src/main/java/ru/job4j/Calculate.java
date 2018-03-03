package ru.job4j;
/** главный класс калькулятора
 *
 *Calculate.
 *
 *@author Gusev Dmitry (smartdima@rambler.ru)
 */
public class Calculate {
    /**
	* Main
	* @param args - argumens of command line
	*/

    public static void main(String[] arg) {
    System.out.println("Calculate");
	/**
	 * first  - 1 input value
	 * second - 2 input value
	 * summ   - result value
	 */
    private int first =Integer.valueOf(arg[0]);
    private int second=Integer.valueOf(arg[1]);
    private int summ=first-second;
	/**
	*@return Return sum of tow arguments.
	*/
    System.out.println("Sum: "+summ);    


    }
    }