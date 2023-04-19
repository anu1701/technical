import java.util.*;
import java.lang.*;
import java.io.*;
class RotateLeft
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        	st = new StringTokenizer(br.readLine());
        	int len = Integer.parseInt(st.nextToken());
        	int d = Integer.parseInt(st.nextToken());
        	st = new StringTokenizer(br.readLine());
        	ArrayDeque<Integer> al = new ArrayDeque<>();
        	while(st.hasMoreTokens()){
            		al.add(Integer.parseInt(st.nextToken()));
        	}
        	for(int i = 0;i<d;i++){
            		al.add(al.peekFirst());
            		al.pollFirst();
        	}
        	for(int i = 0;i<len;i++){
            		System.out.print(al.pollFirst()+" ");
        	}
    	}
}

