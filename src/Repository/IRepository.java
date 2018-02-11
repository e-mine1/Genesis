/*
 * The MIT License
 * 
 * Copyright (c) 2018 FuturICT 2.0
 * 
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package Repository;

import Features.IFeature;
import Features.IOperation;
import Features.IUnderlying;
import Features.operations.IProof;
import Features.properties.IProperty;
import Token.IToken;
import Utilities.IAddress;
import java.util.Collection;
import java.util.Map;

/**
 * 
 * @author Mark C. Ballandies <bmark@ethz.ch>
 */
public interface IRepository<T extends IToken> {
   
    /**
     * Saves token to Repository. 
     * Returns the unique ID of the Token in Repository
     * @param token 
     * @return uniqueID
     */
    public long store(T token);
    
    public T crateNewToken(Collection<IFeature> features);
    
    public T fetchToken(long uniqueID);
    
   
    public Collection<T> getAllTokens();
    
    
    public Collection<IOperation> getOperations(T token);
    public Collection<IUnderlying> getUnderlyings(T token);
    public Collection<IProperty> getProperties(T token);
    
    public int getCurrentTotalSupply(T token);
    public int getBalanceOf(T token, IAddress addr);
    Map<IAddress, Integer> getAllBalances(T token);
    boolean transfer(T token, IAddress from, IAddress to, int value, IProof proof);
       
}
