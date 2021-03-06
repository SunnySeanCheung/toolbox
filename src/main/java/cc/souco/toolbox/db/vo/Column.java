package cc.souco.toolbox.db.vo;

public class Column {
    private String name;
    private String type;
    private Integer size;  //  字段大小
    private Boolean nullable;  // 是否可空
    private String remarks;  // 备注
    private Boolean enumerable;  // 可枚举的
    private String enumerateValue;  // 枚举值
    private String defaultValue;  // 默认值

    public Column() {
    }

    public Column(String name, String type, Integer size, Boolean nullable, String remarks, String defaultValue) {
        this.name = name;
        this.type = type;
        this.size = size;
        this.nullable = nullable;
        this.remarks = remarks;
        this.defaultValue = defaultValue;
        this.enumerable = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Boolean isNullable() {
        return nullable;
    }

    public Boolean getNullable(){
        return nullable;
    }

    public void setNullable(Boolean nullable) {
        this.nullable = nullable;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public Boolean getEnumerable() {
        return enumerable;
    }

    public void setEnumerable(Boolean enumerable) {
        this.enumerable = enumerable;
    }

    public String getEnumerateValue() {
        return enumerateValue;
    }

    public void setEnumerateValue(String enumerateValue) {
        this.enumerateValue = enumerateValue;
    }

    @Override
    public String toString() {
        return "TableColumn{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", length='" + size + '\'' +
                ", nullable=" + nullable +
                ", remarks='" + remarks + '\'' +
                ", defaultValue='" + defaultValue + '\'' +
                '}';
    }
}
