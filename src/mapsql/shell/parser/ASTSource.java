/* Generated By:JJTree: Do not edit this line. ASTSource.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package mapsql.shell.parser;

public
class ASTSource extends SimpleNode {
  public ASTSource(int id) {
    super(id);
  }

  public ASTSource(MapSQL p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(MapSQLVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=052cde10249f9c8cff14d38ca5e8d6f9 (do not edit this line) */
