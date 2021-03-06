/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Validate the message body using the Java Bean Validation API.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface BeanValidatorEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Bean Validator component.
     */
    public interface BeanValidatorEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedBeanValidatorEndpointBuilder advanced() {
            return (AdvancedBeanValidatorEndpointBuilder) this;
        }
        /**
         * To use a custom validation group.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: javax.validation.groups.Default
         * Group: producer
         */
        default BeanValidatorEndpointBuilder group(String group) {
            doSetProperty("group", group);
            return this;
        }
        /**
         * Whether to ignore data from the META-INF/validation.xml file.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default BeanValidatorEndpointBuilder ignoreXmlConfiguration(
                boolean ignoreXmlConfiguration) {
            doSetProperty("ignoreXmlConfiguration", ignoreXmlConfiguration);
            return this;
        }
        /**
         * Whether to ignore data from the META-INF/validation.xml file.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default BeanValidatorEndpointBuilder ignoreXmlConfiguration(
                String ignoreXmlConfiguration) {
            doSetProperty("ignoreXmlConfiguration", ignoreXmlConfiguration);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default BeanValidatorEndpointBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default BeanValidatorEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Bean Validator component.
     */
    public interface AdvancedBeanValidatorEndpointBuilder
            extends
                EndpointProducerBuilder {
        default BeanValidatorEndpointBuilder basic() {
            return (BeanValidatorEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedBeanValidatorEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedBeanValidatorEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * To use a custom ConstraintValidatorFactory.
         * 
         * The option is a:
         * <code>javax.validation.ConstraintValidatorFactory</code> type.
         * 
         * Group: advanced
         */
        default AdvancedBeanValidatorEndpointBuilder constraintValidatorFactory(
                Object constraintValidatorFactory) {
            doSetProperty("constraintValidatorFactory", constraintValidatorFactory);
            return this;
        }
        /**
         * To use a custom ConstraintValidatorFactory.
         * 
         * The option will be converted to a
         * <code>javax.validation.ConstraintValidatorFactory</code> type.
         * 
         * Group: advanced
         */
        default AdvancedBeanValidatorEndpointBuilder constraintValidatorFactory(
                String constraintValidatorFactory) {
            doSetProperty("constraintValidatorFactory", constraintValidatorFactory);
            return this;
        }
        /**
         * To use a custom MessageInterpolator.
         * 
         * The option is a: <code>javax.validation.MessageInterpolator</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedBeanValidatorEndpointBuilder messageInterpolator(
                Object messageInterpolator) {
            doSetProperty("messageInterpolator", messageInterpolator);
            return this;
        }
        /**
         * To use a custom MessageInterpolator.
         * 
         * The option will be converted to a
         * <code>javax.validation.MessageInterpolator</code> type.
         * 
         * Group: advanced
         */
        default AdvancedBeanValidatorEndpointBuilder messageInterpolator(
                String messageInterpolator) {
            doSetProperty("messageInterpolator", messageInterpolator);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedBeanValidatorEndpointBuilder synchronous(
                boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedBeanValidatorEndpointBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * To use a custom TraversableResolver.
         * 
         * The option is a: <code>javax.validation.TraversableResolver</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedBeanValidatorEndpointBuilder traversableResolver(
                Object traversableResolver) {
            doSetProperty("traversableResolver", traversableResolver);
            return this;
        }
        /**
         * To use a custom TraversableResolver.
         * 
         * The option will be converted to a
         * <code>javax.validation.TraversableResolver</code> type.
         * 
         * Group: advanced
         */
        default AdvancedBeanValidatorEndpointBuilder traversableResolver(
                String traversableResolver) {
            doSetProperty("traversableResolver", traversableResolver);
            return this;
        }
        /**
         * To use a a custom ValidationProviderResolver.
         * 
         * The option is a:
         * <code>javax.validation.ValidationProviderResolver</code> type.
         * 
         * Group: advanced
         */
        default AdvancedBeanValidatorEndpointBuilder validationProviderResolver(
                Object validationProviderResolver) {
            doSetProperty("validationProviderResolver", validationProviderResolver);
            return this;
        }
        /**
         * To use a a custom ValidationProviderResolver.
         * 
         * The option will be converted to a
         * <code>javax.validation.ValidationProviderResolver</code> type.
         * 
         * Group: advanced
         */
        default AdvancedBeanValidatorEndpointBuilder validationProviderResolver(
                String validationProviderResolver) {
            doSetProperty("validationProviderResolver", validationProviderResolver);
            return this;
        }
        /**
         * To use a custom ValidatorFactory.
         * 
         * The option is a: <code>javax.validation.ValidatorFactory</code> type.
         * 
         * Group: advanced
         */
        default AdvancedBeanValidatorEndpointBuilder validatorFactory(
                Object validatorFactory) {
            doSetProperty("validatorFactory", validatorFactory);
            return this;
        }
        /**
         * To use a custom ValidatorFactory.
         * 
         * The option will be converted to a
         * <code>javax.validation.ValidatorFactory</code> type.
         * 
         * Group: advanced
         */
        default AdvancedBeanValidatorEndpointBuilder validatorFactory(
                String validatorFactory) {
            doSetProperty("validatorFactory", validatorFactory);
            return this;
        }
    }

    public interface BeanValidatorBuilders {
        /**
         * Bean Validator (camel-bean-validator)
         * Validate the message body using the Java Bean Validation API.
         * 
         * Category: validation
         * Since: 2.3
         * Maven coordinates: org.apache.camel:camel-bean-validator
         * 
         * Syntax: <code>bean-validator:label</code>
         * 
         * Path parameter: label (required)
         * Where label is an arbitrary text value describing the endpoint
         */
        default BeanValidatorEndpointBuilder beanValidator(String path) {
            return BeanValidatorEndpointBuilderFactory.beanValidator(path);
        }
    }
    /**
     * Bean Validator (camel-bean-validator)
     * Validate the message body using the Java Bean Validation API.
     * 
     * Category: validation
     * Since: 2.3
     * Maven coordinates: org.apache.camel:camel-bean-validator
     * 
     * Syntax: <code>bean-validator:label</code>
     * 
     * Path parameter: label (required)
     * Where label is an arbitrary text value describing the endpoint
     */
    static BeanValidatorEndpointBuilder beanValidator(String path) {
        class BeanValidatorEndpointBuilderImpl extends AbstractEndpointBuilder implements BeanValidatorEndpointBuilder, AdvancedBeanValidatorEndpointBuilder {
            public BeanValidatorEndpointBuilderImpl(String path) {
                super("bean-validator", path);
            }
        }
        return new BeanValidatorEndpointBuilderImpl(path);
    }
}