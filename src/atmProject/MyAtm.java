/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmProject;

/**
 *
 * @author 2B
 */
public interface MyAtm {

 public String desposite(String amount);
 public String withdraw(String amount);
 public String getCurrentBalance();
 public String previous();
 public String next();
}
