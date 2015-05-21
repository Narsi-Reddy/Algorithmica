public class towD_ArraySearch{


public static void main(String[] args){

int x= Integer.parseInt(args[0]);

int[][] a={

              {1,5,10,15},
              {2,6,11,16},
              {3,7,12,17},
              {4,8,13,18}

            };

//position pos = new towD_ArraySearch().search_binary_on_eachRow(a,x);


position pos = new towD_ArraySearch().search_incAndDecMethod(a,x);

System.out.println("Position of your number "+ x + " is ("+pos.posX+", "+pos.posY+")");

}
//sol 1 : gothrough every element.

//sol 2
public position search_binary_on_eachRow(int[][] a, int x){

position posObj = new position();
posObj.posX=-1;
posObj.posY=-1; 

int m= a.length;
int n = a[0].length;

if (m>n){
 int temp =m;
m= n;
n= temp;

}

for (int i=0; i<= m-1; i++){

if (x <= a[i][n-1]){

int rowPos = i;
int colPos = new BinarySearch().binSearch(a[i],0,n-1,x);
if (colPos>=0){
posObj.posX=rowPos;
posObj.posY=colPos; 
break;
}



}


}

return posObj;

}


//sol 3

public position search_incAndDecMethod(int[][] a, int x){

position posObj = new position();
posObj.posX=-1;
posObj.posY=-1;

int m= a.length;
int n = a[0].length;
int rowPos = 0;
int colPos = n-1;


for (;rowPos<=m-1 && colPos>=0;){
System.out.println("("+rowPos+","+colPos+")");

if(x<a[rowPos][colPos]){

colPos--;

}

else if (x>a[rowPos][colPos]){

rowPos++;

}

else {
posObj.posX=rowPos;
posObj.posY=colPos;
break;

} 

}
 return posObj;

}


}
