/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Token;

import Features.properties.IProperty;
import Features.IUnderlying;
import Utilities.IAddress;
import java.util.Map;
import Features.IOperation;
import Features.operations.IClaim;
import java.util.Collection;

/**
 *
 * @author mcb
 */
public interface IToken<U extends IUnderlying, P extends IProperty, B extends IOperation> {
    
   public long getUniqueID(); 
    
   public String getName();
   public int getDecimals();
   public String getSymbol();
   public int getTotalSupply();
   public boolean isCapped();
   public boolean preMined();
   public int preMinedAmount();
   public int cappedAmount();
   
   public int getBalanceOf(IAddress addr);
   public Map<IAddress,Integer> getAllBalances();
   
   //public boolean transfer(IAddress from, IAddress to, int value);
   
   Collection<U> getUnderlyings();
   Collection<P> getProperties();
   Collection<B> getOperations();
   
   boolean addClaim(IClaim claim);
   
      
   
}
