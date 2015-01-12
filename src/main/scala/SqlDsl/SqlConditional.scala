package SqlDsl

sealed trait SqlConditional

object True extends SqlConditional
object False extends SqlConditional

case class SqlConditionalField(field: SqlField) extends SqlConditional {
  def eq(rightField: SqlField) = SqlConditionalFieldComparison(field, rightField, Eq)
}

case class SqlConditionalFieldComparison(leftField: SqlField, rightField: SqlField, operator: SqlOperator) extends SqlConditional


