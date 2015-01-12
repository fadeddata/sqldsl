package SqlDsl

sealed trait SqlExpression

object * extends SqlExpression

case class SqlExpressionField(field: SqlField, alias: Option[String] = None) extends SqlExpression {
  def as(alias: String) = this.copy(alias = Some(alias))
}

object Play {
  import SqlDsl._

  val firstName = SqlField("first_name")
  val lastName = SqlField("last_name")
  val employees = SqlTable("empployees")




  select(firstName as "fnm", firstName as "asdf").from(employees as "emp").where(firstName eq lastName)
}
