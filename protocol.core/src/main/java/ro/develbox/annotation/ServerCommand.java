package ro.develbox.annotation;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SuppressWarnings("rawtypes")
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface ServerCommand {
    
    /**
     * next command accepted 
     */
    Class[] nextCommandType() default {};

    /**
     * expected response type
     */
    Class[] responseCommandType() default {};
    
    
}
