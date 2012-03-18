/*******************************************************************************
 * Copyright 2012 Apigee Corporation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.usergrid.persistence.query.tree;

import org.antlr.runtime.Token;

/**
 * @author tnine
 *
 */
public class WithinOperand extends Operand {

 
  /**
   * @param property
   * @param literal
   */
  public WithinOperand(Token t ) {
    super(t);
  }

  /* (non-Javadoc)
   * @see org.usergrid.persistence.query.tree.Operand#visit(org.usergrid.persistence.query.tree.QueryVisitor)
   */
  @Override
  public void visit(QueryVisitor visitor) {
    visitor.visit(this);
  }
  
  /**
   * 
   * @return
   */
  public Property getProperty(){
    return (Property) this.children.get(0);
  }
  
  /**
   * 
   * @return
   */
  public FloatLiteral getDistance(){
    return (FloatLiteral) this.children.get(1);
  }
  
  
  
  /**
   * @return
   */
  public FloatLiteral getLattitude(){
    return (FloatLiteral) this.children.get(2);
  }
  
  /**
   * @return
   */
  public FloatLiteral getLongitude(){
    return (FloatLiteral) this.children.get(3);
  }
}
