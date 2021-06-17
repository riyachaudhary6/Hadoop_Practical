// exceptions import
import java.io.IOException;

// import box classes
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;

// import reducer class
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.Reducer.Context;

public class MyReducer extends Reducer<Text, IntWritable, Text, IntWritable> {

	public void reduce(Text key, Iterable<IntWritable> values, Context context)
			throws IOException, InterruptedException {
		int sum = 0;
		if (key.equals("PrimeSum")) {
			for (IntWritable value : values) {
				sum += value.get();
			}
		}else{
			for (IntWritable value : values) {
				sum += value.get();
			}
		}
		context.write(key, new IntWritable(sum));
	}
}