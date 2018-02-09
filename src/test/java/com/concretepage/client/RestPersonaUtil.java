/*package com.concretepage.client;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.concretepage.entity.Persona;

public class RestPersonaUtil {
	public void getAllPersonasDemo() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
        RestTemplate restTemplate = new RestTemplate();
	    String url = "http://localhost:8080/administrador/personas";
        HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
        ResponseEntity<Persona[]> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Persona[].class);
        Persona[] personas = responseEntity.getBody();
        for(Persona persona : personas) {
              System.out.println("Id:"+persona.getPersonaId());
        }
    }
	 public static void main(String args[]) {
	    	RestPersonaUtil util = new RestPersonaUtil();
	    	util.getAllPersonasDemo();
	 }    
}
*/