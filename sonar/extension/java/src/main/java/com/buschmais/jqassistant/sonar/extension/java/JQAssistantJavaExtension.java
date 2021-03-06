package com.buschmais.jqassistant.sonar.extension.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sonar.api.SonarPlugin;

import java.util.Collections;
import java.util.List;

/**
 * Defines the jQAssistant JUnit4 extension.
 */
public class JQAssistantJavaExtension extends SonarPlugin {

    @Override
    public List getExtensions() {
        return Collections.emptyList();
    }

}
