import java.util.ArrayList;
import java.util.List;
class GfG {
	static ArrayList<Integer> spirallyTraverse(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
	ArrayList<Integer>res=new ArrayList<>();
	boolean[][]vis=new boolean[m][n];
	int[]dr={0,1,0,-1};
	int[]dc={1,0,-1,0};
	int r=0,c=0;
	int idx=0;
	for(int i=0;i<m*n;++i)
	{
		res.add(mat[r][c]);
		vis[r][c]=true;
		int newR=r+dr[idx];
		int newC=c+dc[idx];
		if (0 <= newR && newR < m && 0 <= newC && newC < n
                    && !vis[newR][newC]) {
			r=newR;
			c=newC;
		}else{
			idx=(idx +1)%4;
			r+=dr[idx];
			c+=dc[idx];
			}
		}
		return res;

	}
	public static void main(String[] args) {
		int[][]mat={{1,2,3,4},
			    {5,6,7,8},
			    {9,10,11,12},
			    {13,14,15,16}};
 	ArrayList<Integer> res = spirallyTraverse(mat);

        for (int num : res) {
            System.out.print(num + " ");
        }
    }
}	
		
