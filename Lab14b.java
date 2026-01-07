//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;

public class Lab14b
{
	public static void main( String args[] )
	{
		int[] one = {1,2,3,4,5,6,7,8,9,10};
		int[] two = {1,2,3,9,11,20,30};
		//add more test cases
		int[] three = {29,25,23,22,21,16,6,7,2,1};
		int[] four = {26,25,22,21,20,17,12,6,2,1};


		System.out.println(Arrays.toString(one));
		System.out.println("is going Up ?  " + ArrayFunHouseTwo.goingUp(one));
		System.out.println(Arrays.toString(two));
		System.out.println("is going Up ?  " + ArrayFunHouseTwo.goingUp(two));
		//add more test cases
		System.out.println(Arrays.toString(three));
		System.out.println("is going Up ?  " + ArrayFunHouseTwo.goingUp(three));

		System.out.println("\n\n"+Arrays.toString(one));
		System.out.println("is going Down ?  " + ArrayFunHouseTwo.goingDown(one));
		System.out.println(Arrays.toString(two));
		System.out.println("is going Down ?  " + ArrayFunHouseTwo.goingDown(two));
		//add more test cases
		System.out.println(Arrays.toString(four));
		System.out.println("is going Down ?  " + ArrayFunHouseTwo.goingDown(four));


		System.out.println("\n\nfirst 3 values greater than 8 in array two " + Arrays.toString(ArrayFunHouseTwo.getCountValuesBiggerThanX(two,3,8))  );
		System.out.println("first 2 values greater than 1 in array two " + Arrays.toString(ArrayFunHouseTwo.getCountValuesBiggerThanX(two,2,1))  );
		System.out.println("first 5 values greater than 4 in array one " + Arrays.toString(ArrayFunHouseTwo.getCountValuesBiggerThanX(one,5,4))  );
		System.out.println("first 6 values greater than 15 in array three " + Arrays.toString(ArrayFunHouseTwo.getCountValuesBiggerThanX(three,6,15))  );

	}
}