// exception handling 
import java.io.IOException;

// box classes import
import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;

// import mapper class
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Mapper.Context;

public class WordMapper extends Mapper<LongWritable, Text, Text, IntWritable> {

	public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
		String inputstring = value.toString();
		for (String x : inputstring.split(" ")) {
			if(x.equals("India")){
			context.write(new Text(x), new IntWritable(1));
			}
		}
	}
}