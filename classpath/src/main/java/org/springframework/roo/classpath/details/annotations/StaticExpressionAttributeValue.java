package org.springframework.roo.classpath.details.annotations;

import org.apache.commons.lang3.Validate;
import org.springframework.roo.model.JavaSymbolName;

/**
 * Represents an annotation attribute value provided by a static expression.
 */
public class StaticExpressionAttributeValue extends
        AbstractAnnotationAttributeValue<String> {
    private final String value;

    public StaticExpressionAttributeValue(final JavaSymbolName name, final String value) {
        super(name);
        Validate.notNull(value, "Value required");
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return getName() + " -> " + value;
    }
}
