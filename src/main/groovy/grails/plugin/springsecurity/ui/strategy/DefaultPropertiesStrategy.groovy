/* Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package grails.plugin.springsecurity.ui.strategy

import grails.plugin.springsecurity.ui.SpringSecurityUiService
import groovy.transform.CompileStatic
import org.springframework.transaction.TransactionStatus

/**
 * @author <a href='mailto:burt@burtbeckwith.com'>Burt Beckwith</a>
 */
@CompileStatic
class DefaultPropertiesStrategy implements PropertiesStrategy {

	SpringSecurityUiService springSecurityUiService

	Map<Class<?>, Map<String, String>> findClassMappings() {
		springSecurityUiService.findClassMappings()
	}

	def getProperty(instance, String paramName) {
		springSecurityUiService.getProperty instance, paramName
	}

	def setProperties(Map data, instanceOrClass, TransactionStatus transactionStatus) {
		springSecurityUiService.setProperties data, instanceOrClass, transactionStatus
	}

	String paramNameToPropertyName(String paramName, String controllerName) {
		springSecurityUiService.paramNameToPropertyName paramName, controllerName
	}
}
