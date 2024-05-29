package com.example.springboot_mongodb.model;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.StringPath;

import javax.annotation.processing.Generated;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;

/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QTutorial extends EntityPathBase<Tutorial> {

    private static final long serialVersionUID = 45678;

    public static final QTutorial tutorial = new QTutorial("tutorial");

    public final NumberPath<Integer> age = createNumber("age", Integer.class);

    public final StringPath id = createString("id");

    public final StringPath description = createString("description");

    public QTutorial(String variable) {
        super(Tutorial.class, forVariable(variable));
    }

    public QTutorial(Path<? extends Tutorial> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTutorial(PathMetadata metadata) {
        super(Tutorial.class, metadata);
    }
}
