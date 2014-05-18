gradle-spring
=============

Sample project using spring and gradle.

This is a very simple hello world app using spring and gradle:

* Allows deployment to JBoss using the cargo plugin
* RESTful student interface added using the tutorial at http://eggsylife.co.uk/2010/01/03/spring-3-restful-web-services/
* Sets up 2 dedicated contexts:
	1. mvc-dispatcher for hello world page (mvc-dispatcher-servlet.xml)
	2. SpringRestfulExample for students demo (students-servlet.xml)
	3. There is also an unused root context (root-context.xml)
	
mvc-dispatcher
==============	
	
* Simple hello world app
* 	
	
SpringRestfulExample
====================	

* Uses tiles to format web page, this can be used to build up a web page using sections (tiles)

General structure
=================

web.xml		Sets up 2 org.springframework.web.servlet.DispatcherServlets
			each with its own context (contextConfigLocation)
			Create servlet mapping from url -> servlet
			Set up root context (or uses applicationContext.xml by default)
			
			

Notes
=====

I learnt a lot about logging in JBoss, the hardest bit was learning that the spring setup logging (setting up of container etc) is only possible in the container.
Spring context
3. WEB-INF folder - part of Servlet spec. Not part of public document root, only servlets have access to it (secure). Not part of web root.
Simple static url is useful for CSS and javascript.
Further reading at http://download.oracle.com/otn-pub/jcp/servlet-2.4-fr-spec-oth-JSpec/servlet-2_4-fr-spec.pdf 
Servlet container says the root of your app must be in the src/main/WEBAPP folder
Java Servlet API says root of your web app must have certain folder structure: META-INF, WEB-INF/ classes, lib, web.xml
Most frameworks want their config files on the classpath (ie classes folder)
See http://stackoverflow.com/questions/19786142/what-is-web-inf-used-for-in-a-java-web-application

log4j logging - mention per deployment logging 