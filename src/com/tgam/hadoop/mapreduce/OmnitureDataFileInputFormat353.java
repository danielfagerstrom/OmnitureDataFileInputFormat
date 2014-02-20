package com.tgam.hadoop.mapreduce;

import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.TaskAttemptContext;

/**
 * A custom input format for dealing with Omniture's hit_data.tsv daily data feed files.
 * @author Mike Sukmanowsky (<a href="mailto:mike.sukmanowsky@gmail.com">mike.sukmanowsky@gmail.com</a>)
 *
 */
public class OmnitureDataFileInputFormat353 extends OmnitureDataFileInputFormat {

    @Override
    public OmnitureDataFileRecordReader353 createRecordReader(InputSplit split, TaskAttemptContext tac) {
        return new OmnitureDataFileRecordReader353();
    }

}
