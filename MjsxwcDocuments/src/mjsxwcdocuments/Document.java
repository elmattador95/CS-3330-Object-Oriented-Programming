/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mjsxwcdocuments;

/**
 *
 * @author Matthew
 */
public final class Document {
    private String title;
    private String author;
    private String body;
    private int version;
    
    public Document(String title ,String author){
        setTitle("Another Life");
        setAuthor("Sally Smith");
        version = 0; 
    }
    public Document(String title,String author,String body){
        setTitle("Final Word");
        setAuthor("Karen Jones");
        setBody("We should plan for the worst and hope for the best.");
        version = 1;
    }
   
    public void setTitle(String title){
        this.title = title; 
        version++;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setBody(String body){
        this.body = body;
        version++;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){  
        return author;
    } 
    public String getBody(){
        return body;
    } 
    public Integer getVersion(){
        return version;
    }
}

