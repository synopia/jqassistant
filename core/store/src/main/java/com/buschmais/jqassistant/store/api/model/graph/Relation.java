package com.buschmais.jqassistant.store.api.model.graph;

import org.neo4j.graphdb.RelationshipType;

public enum Relation implements RelationshipType {

    ANNOTATED_BY, DEPENDS_ON, CONTAINS, EXTENDS, IMPLEMENTS, THROWS;
}