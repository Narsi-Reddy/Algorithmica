public class BinarySearch{

public static void main(String[] args){

int[] sortedArray={1,2,3,4,5,6,7,8,9}; 
int searchElement = 9;
System.out.println("The index of elem "+searchElement +" : "+ new BinarySearch().binSearch(sortedArray, 0, sortedArray.length-1, searchElement ));

}

public int binSearch(int[] sortedArray, int start, int end, int searchElement){

int[] a = sortedArray;
int mid = (start+end)/2;
int x= searchElement;

while(start<end){

if(x<a[mid]){

end= mid-1;
return binSearch(a, start, end, x);

}
else if (x>a[mid]){
start= mid+1;
return binSearch(a, start, end, x);

}
/* else if (x==a[mid]){

return mid;

} */
else 

   return mid;


}
 return -1;

}


}
