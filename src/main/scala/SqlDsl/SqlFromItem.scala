package SqlDsl

sealed trait SqlFromItem

case class SqlFromItemTable(table: SqlTable, alias: Option[String] = None, only: Boolean = false) extends SqlFromItem {
  def as(alias: String): SqlFromItemTable = this.copy(alias = Some(alias))
}