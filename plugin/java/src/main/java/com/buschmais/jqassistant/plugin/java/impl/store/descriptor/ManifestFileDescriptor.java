package com.buschmais.jqassistant.plugin.java.impl.store.descriptor;

import com.buschmais.cdo.neo4j.api.annotation.Label;
import com.buschmais.cdo.neo4j.api.annotation.Relation;
import com.buschmais.jqassistant.plugin.common.impl.descriptor.FileDescriptor;

import java.util.List;

import static com.buschmais.cdo.neo4j.api.annotation.Relation.Outgoing;

@Label("MANIFEST")
public interface ManifestFileDescriptor extends FileDescriptor {

    @Relation("DECLARES")
    @Outgoing
    ManifestSectionDescriptor getMainSection();

    void setMainSection(ManifestSectionDescriptor mainSection);

    @Relation("DECLARES")
    @Outgoing
    List<ManifestSectionDescriptor> getManifestSections();
}
