package com.sonar;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QMetric is a Querydsl query type for Metric
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QMetric extends EntityPathBase<Metric> {

    private static final long serialVersionUID = -1362568152L;

    public static final QMetric metric = new QMetric("metric");

    public final DateTimePath<java.util.Date> creationDate = createDateTime("creationDate", java.util.Date.class);

    public final DateTimePath<java.util.Date> date = createDateTime("date", java.util.Date.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath key = createString("key");

    public final StringPath lname = createString("lname");

    public final StringPath name = createString("name");

    public final StringPath qualifier = createString("qualifier");

    public final StringPath scope = createString("scope");

    public final StringPath version = createString("version");

    public QMetric(String variable) {
        super(Metric.class, forVariable(variable));
    }

    public QMetric(Path<? extends Metric> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMetric(PathMetadata<?> metadata) {
        super(Metric.class, metadata);
    }

}

