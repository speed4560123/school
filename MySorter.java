package ntou.cs.sorter;

public class MySorter
{
	public void sort (double[] d)
	{
		for (int i = 0; i < d.length; i++)
		{
			for (int j = 0; j < d.length - i - 1; j++)
			{
				if(d[j+1] < 0 || d[j]<0)//不讓負數輸出，要中斷的是SWAP FUNCTION
				return;
				if (d[j] > d[j + 1])
				{
					swap(d, j, j+1);
				}
			}
		}
	}

	public void swap (double d[], int k, int s)
	{
		double temp = d[k];
		d[k] = d[s];
		d[s] = temp;
	}
}

