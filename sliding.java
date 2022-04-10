// apache spark

RDD<Object> r = RDDFunctions.fromRDD(filteredWords.rdd(), filteredWords.classTag()).sliding(input_length);
        JavaRDD<Object> x = new JavaRDD<>(r, r.elementClassTag());

// classpaths
// export CLASSPATH=${CLASSPATH}:libs/json-20190722.jar:libs/javax.json-1.0.jar:.
