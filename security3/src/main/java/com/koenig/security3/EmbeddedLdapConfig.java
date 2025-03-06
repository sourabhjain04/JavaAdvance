/*
 * package com.koenig.security3; import
 * org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties;
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.core.io.ClassPathResource; import
 * org.springframework.ldap.core.support.LdapContextSource;
 * 
 * @Configuration public class EmbeddedLdapConfig {
 * 
 * @Bean public LdapContextSource ldapContextSource(EmbeddedLdapProperties
 * properties) { LdapContextSource contextSource = new LdapContextSource();
 * contextSource.setUrl("ldap://localhost:8389/");
 * contextSource.setBase("dc=example,dc=com");
 * contextSource.setUserDn("cn=admin,dc=example,dc=com");
 * contextSource.setPassword("admin"); return contextSource; } }
 */