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
public class MjsxwcDocuments {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Document document1 = new Document("Another Life","Sally Smith");
      document1.setBody("The grass is always greener on the other side.");
      
      Document document2 = new Document("Final Word","Karen Jones","We should plan for the worst and hope for the best");
      document2.setTitle("Final Word");
      
      System.out.printf("document 1:\ntitle: %s\n",document1.getTitle());
      System.out.printf("Author: %s\n",document1.getAuthor());
      System.out.printf("Body: %s\n",document1.getBody());
      System.out.printf("version: %d\n",document1.getVersion());
      
      System.out.printf("\ndocument 2:\ntitle: %s\n",document2.getTitle());
      System.out.printf("Author: %s\n",document2.getAuthor());
      System.out.printf("Body: %s\n",document2.getBody());
      System.out.printf("version: %d\n",document2.getVersion());
    }
}
