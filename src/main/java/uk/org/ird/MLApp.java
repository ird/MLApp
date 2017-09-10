package uk.org.ird;

import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class MLApp {
    public static void main(String[] args) throws Exception{
        Instances data1 = DataSource.read("http://www.cs.albany.edu/~davidson/courses/FallCSI661-DataMining/Voting.arff");
    }
}
