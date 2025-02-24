public class calculateFactorialTime{
	public static void main(String[] args){
		
		long start_time1, start_time2, end_time1, end_time2, time_required1 = 0, time_required2 = 0;
		int fact1 = 1, fact2 = 1;

		int size = (int) (System.nanoTime()/100%10) + 1;
		int[] array = new int [size];
		for(int i = 0; i < size; i++){
			array[i] = (int) (System.nanoTime()/100%10);
		}

		for(int j = 0; j < size; j++){
			start_time1 = System.nanoTime();
			fact1 = factorial1(array[j]);
			end_time1 = System.nanoTime();
			time_required1 += end_time1-start_time1;
		}

		for(int k = 0; k < size; k++){
			start_time2 = System.nanoTime();
			fact2 = factorial2(array[k]);
			end_time2 = System.nanoTime();
			time_required2 += end_time2-start_time2;
		}
		
		long avg_time1 = time_required1 / size;
		long avg_time2 = time_required2 / size;

		System.out.println("Time required for factorial1 is " + avg_time1 + " nanosec");
		System.out.println("Time required for factorial2 is " + avg_time2 + " nanosec");
	}

static int factorial1(int number){
    if(number>=0){
    if(number<2){
        return 1;
    }

    int factorial=2;
    for(;number>=3;){
        factorial*=number--;
    }
        return factorial;
    }
    else{                                                                               
        return -1;//For negative numbers
    }
}

static int factorial2(int number){
    if(number>=0){
    if(number<2){
        return 1;
    }
    int factorial = number*factorial2(number-1);
        return factorial;
    }
    else{
        return -1;//For negative numbers
    }
}
}