package cn.edu.thssdb.schema;

import cn.edu.thssdb.type.ColumnType;

import java.io.Serializable;

public class Column implements Comparable<Column>, Serializable {
  public String name;
  private ColumnType type;
  private int primary;
  private boolean notNull;
  private int maxLength;

  public Column(String name, ColumnType type, int primary, boolean notNull, int maxLength) {
    this.name = name;
    this.type = type;
    this.primary = primary;
    this.notNull = notNull;
    this.maxLength = maxLength;
  }

  @Override
  public int compareTo(Column e) {
    return name.compareTo(e.name);
  }

  public int compareTo(String string) { return name.compareTo(string);}

  public String toString() {
    return name + ',' + type + ',' + primary + ',' + notNull + ',' + maxLength;
  }

  public int isPrimary(){return primary;}

  public boolean isNotNull(){return notNull;}

  public String getName(){return name;};
}
