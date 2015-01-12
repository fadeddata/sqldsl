package SqlDsl

package object SqlDsl {
  implicit def sqlFieldToSqlExpressionField(field: SqlField) = SqlExpressionField(field)
  def select(expressions: SqlExpression*) = SelectClause(expressions)
  def only(table: SqlFromItemTable): SqlFromItemTable = table.copy(only = true)
  implicit def sqlTableToSqlFromItemTable(table: SqlTable) = SqlFromItemTable(table)
  implicit def sqlFieldToSqlConditionalField(field: SqlField) = SqlConditionalField(field)
}
