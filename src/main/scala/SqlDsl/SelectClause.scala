package SqlDsl

case class SelectClause(expressions: Seq[SqlExpression], fromClause: Seq[SqlFromItem] = Seq.empty, whereClause: Seq[SqlConditional] = Seq.empty) {
  def from(items: SqlFromItem*): SelectClause = this.copy(fromClause = items)
  def where(conditionals: SqlConditional*): SelectClause = this.copy(whereClause = conditionals)
}