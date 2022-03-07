// WAP to read number of units from user and find bill

//       200   --->        34.50 per/u   4560+GST==> final bill

// print bill along with GST: 18% on bill.


// jj
// Enter units:  200

//   bill=200*34.50
//   gst=(bill*18)/100;

//   final_bill=bill+gst
class bill 
{ 
        public static void main(String args[]) 
        {   
	int units=200;
 
	double bill=0;
 
        	if(units<=200)
	 {
	      bill=units*34.50;
	  }
	double gst=(bill*18)/100;
	double final_bill=bill+gst;
	System.out.println("final bill "+final_bill);
        }
}