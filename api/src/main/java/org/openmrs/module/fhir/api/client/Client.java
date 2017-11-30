package org.openmrs.module.fhir.api.client;

/**
 * This interface describes a client which is able to pull and push an object to OpenMRS instance based on a category.
 */
public interface Client {

    /**
     * Perform GET request.
     *
     * @param category Category of the resource.
     * @param url The url of the resource.
     * @param username Username for Basic Auth.
     * @param password Password for Basic Auth.
     * @return Object representing pulled object.
     */
    Object getObject(String category, String url, String username, String password);
}