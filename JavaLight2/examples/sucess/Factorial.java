class Factorial{
    public static void main(String[] a){
	System.out.println(new Fac().ComputeFac(10));
    }
}

class Fac {

    public int ComputeFac(int num){
	int num_aux;
	int b;
	//boolean temp = false;
	boolean temp;
	temp = false;
	if (num < 1)
	{    num_aux = 1 ;
		temp = true;
	
	}
	else 
	{    
		num_aux = num * (this.ComputeFac(num-1)) ;
	}
	
	if(temp)
	{ 
		num_aux = 1;
		b = num + num_aux;
	}
	else{
		
		temp = false;
	}
	return num_aux;
    }
}
