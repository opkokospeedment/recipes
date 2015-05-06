import com.speedment.orm.runtime.ApplicationMetadata;

/**
 * A Speedment Application Metadata representing an entity (for example, a row) in the Project 'project_1'.
 * <p>
 * This Class or Interface has been automatically generated by Speedment.
 * Any changes made to this Class or Interface will be overwritten.
 * 
 * @author Speedment 
 */
public class Project1ApplicationMetadata implements ApplicationMetadata {
    
    public Project1ApplicationMetadata() {
        
    }
    
    @Override
    public String getMetadata() {
        return 
                "import com.speedment.orm.config.model.parameters.*\n"+
                "\n"+
                "name = \"project_1\";\n"+
                "packetLocation = \"src/main/java\";\n"+
                "packetName = \"com.company.speedment.orm.test\";\n"+
                "enabled = true;\n"+
                "dbms {\n"+
                "    ipAddress = \"127.0.0.1\";\n"+
                "    name = \"recipes\";\n"+
                "    password = \"root\";\n"+
                "    port = 3306;\n"+
                "    type = StandardDbmsType.MYSQL;\n"+
                "    username = \"root\";\n"+
                "    enabled = true;\n"+
                "    schema {\n"+
                "        columnCompressionType = ColumnCompressionType.NONE;\n"+
                "        fieldStorageType = FieldStorageType.WRAPPER;\n"+
                "        name = \"recipes\";\n"+
                "        schemaName = \"recipes\";\n"+
                "        storageEngineType = StorageEngineType.ON_HEAP;\n"+
                "        defaultSchema = false;\n"+
                "        enabled = true;\n"+
                "        table {\n"+
                "            columnCompressionType = ColumnCompressionType.INHERIT;\n"+
                "            fieldStorageType = FieldStorageType.INHERIT;\n"+
                "            name = \"ratings\";\n"+
                "            storageEngineType = StorageEngineType.INHERIT;\n"+
                "            tableName = \"ratings\";\n"+
                "            enabled = true;\n"+
                "            column {\n"+
                "                columnCompressionType = ColumnCompressionType.INHERIT;\n"+
                "                fieldStorageType = FieldStorageType.INHERIT;\n"+
                "                mapping = java.lang.Long.class;\n"+
                "                name = \"id\";\n"+
                "                autoincrement = true;\n"+
                "                enabled = true;\n"+
                "                nullable = false;\n"+
                "            }\n"+
                "            column {\n"+
                "                columnCompressionType = ColumnCompressionType.INHERIT;\n"+
                "                fieldStorageType = FieldStorageType.INHERIT;\n"+
                "                mapping = java.lang.Long.class;\n"+
                "                name = \"users_id\";\n"+
                "                autoincrement = false;\n"+
                "                enabled = true;\n"+
                "                nullable = false;\n"+
                "            }\n"+
                "            column {\n"+
                "                columnCompressionType = ColumnCompressionType.INHERIT;\n"+
                "                fieldStorageType = FieldStorageType.INHERIT;\n"+
                "                mapping = java.lang.Long.class;\n"+
                "                name = \"recipes_id\";\n"+
                "                autoincrement = false;\n"+
                "                enabled = true;\n"+
                "                nullable = false;\n"+
                "            }\n"+
                "            column {\n"+
                "                columnCompressionType = ColumnCompressionType.INHERIT;\n"+
                "                fieldStorageType = FieldStorageType.INHERIT;\n"+
                "                mapping = java.lang.Integer.class;\n"+
                "                name = \"rating\";\n"+
                "                autoincrement = false;\n"+
                "                enabled = true;\n"+
                "                nullable = false;\n"+
                "            }\n"+
                "            primaryKeyColumn {\n"+
                "                name = \"id\";\n"+
                "                enabled = true;\n"+
                "            }\n"+
                "            index {\n"+
                "                name = \"PRIMARY\";\n"+
                "                enabled = true;\n"+
                "                unique = true;\n"+
                "                indexColumn {\n"+
                "                    name = \"id\";\n"+
                "                    orderType = OrderType.ASC;\n"+
                "                    enabled = true;\n"+
                "                }\n"+
                "            }\n"+
                "            index {\n"+
                "                name = \"recipes_id\";\n"+
                "                enabled = true;\n"+
                "                unique = false;\n"+
                "                indexColumn {\n"+
                "                    name = \"recipes_id\";\n"+
                "                    orderType = OrderType.ASC;\n"+
                "                    enabled = true;\n"+
                "                }\n"+
                "            }\n"+
                "            index {\n"+
                "                name = \"users_id\";\n"+
                "                enabled = true;\n"+
                "                unique = false;\n"+
                "                indexColumn {\n"+
                "                    name = \"users_id\";\n"+
                "                    orderType = OrderType.ASC;\n"+
                "                    enabled = true;\n"+
                "                }\n"+
                "            }\n"+
                "            foreignKey {\n"+
                "                name = \"ratings_ibfk_1\";\n"+
                "                enabled = true;\n"+
                "                foreignKeyColumn {\n"+
                "                    foreignColumnName = \"id\";\n"+
                "                    foreignTableName = \"users\";\n"+
                "                    name = \"users_id\";\n"+
                "                    enabled = true;\n"+
                "                }\n"+
                "            }\n"+
                "            foreignKey {\n"+
                "                name = \"ratings_ibfk_2\";\n"+
                "                enabled = true;\n"+
                "                foreignKeyColumn {\n"+
                "                    foreignColumnName = \"id\";\n"+
                "                    foreignTableName = \"recipes\";\n"+
                "                    name = \"recipes_id\";\n"+
                "                    enabled = true;\n"+
                "                }\n"+
                "            }\n"+
                "        }\n"+
                "        table {\n"+
                "            columnCompressionType = ColumnCompressionType.INHERIT;\n"+
                "            fieldStorageType = FieldStorageType.INHERIT;\n"+
                "            name = \"recipes\";\n"+
                "            storageEngineType = StorageEngineType.INHERIT;\n"+
                "            tableName = \"recipes\";\n"+
                "            enabled = true;\n"+
                "            column {\n"+
                "                columnCompressionType = ColumnCompressionType.INHERIT;\n"+
                "                fieldStorageType = FieldStorageType.INHERIT;\n"+
                "                mapping = java.lang.Long.class;\n"+
                "                name = \"id\";\n"+
                "                autoincrement = true;\n"+
                "                enabled = true;\n"+
                "                nullable = false;\n"+
                "            }\n"+
                "            column {\n"+
                "                columnCompressionType = ColumnCompressionType.INHERIT;\n"+
                "                fieldStorageType = FieldStorageType.INHERIT;\n"+
                "                mapping = java.lang.String.class;\n"+
                "                name = \"name\";\n"+
                "                autoincrement = false;\n"+
                "                enabled = true;\n"+
                "                nullable = false;\n"+
                "            }\n"+
                "            column {\n"+
                "                columnCompressionType = ColumnCompressionType.INHERIT;\n"+
                "                fieldStorageType = FieldStorageType.INHERIT;\n"+
                "                mapping = java.lang.String.class;\n"+
                "                name = \"text\";\n"+
                "                autoincrement = false;\n"+
                "                enabled = true;\n"+
                "                nullable = false;\n"+
                "            }\n"+
                "            primaryKeyColumn {\n"+
                "                name = \"id\";\n"+
                "                enabled = true;\n"+
                "            }\n"+
                "            index {\n"+
                "                name = \"PRIMARY\";\n"+
                "                enabled = true;\n"+
                "                unique = true;\n"+
                "                indexColumn {\n"+
                "                    name = \"id\";\n"+
                "                    orderType = OrderType.ASC;\n"+
                "                    enabled = true;\n"+
                "                }\n"+
                "            }\n"+
                "        }\n"+
                "        table {\n"+
                "            columnCompressionType = ColumnCompressionType.INHERIT;\n"+
                "            fieldStorageType = FieldStorageType.INHERIT;\n"+
                "            name = \"users\";\n"+
                "            storageEngineType = StorageEngineType.INHERIT;\n"+
                "            tableName = \"users\";\n"+
                "            enabled = true;\n"+
                "            column {\n"+
                "                columnCompressionType = ColumnCompressionType.INHERIT;\n"+
                "                fieldStorageType = FieldStorageType.INHERIT;\n"+
                "                mapping = java.lang.Long.class;\n"+
                "                name = \"id\";\n"+
                "                autoincrement = true;\n"+
                "                enabled = true;\n"+
                "                nullable = false;\n"+
                "            }\n"+
                "            column {\n"+
                "                columnCompressionType = ColumnCompressionType.INHERIT;\n"+
                "                fieldStorageType = FieldStorageType.INHERIT;\n"+
                "                mapping = java.lang.String.class;\n"+
                "                name = \"name\";\n"+
                "                autoincrement = false;\n"+
                "                enabled = true;\n"+
                "                nullable = false;\n"+
                "            }\n"+
                "            column {\n"+
                "                columnCompressionType = ColumnCompressionType.INHERIT;\n"+
                "                fieldStorageType = FieldStorageType.INHERIT;\n"+
                "                mapping = java.lang.String.class;\n"+
                "                name = \"password\";\n"+
                "                autoincrement = false;\n"+
                "                enabled = true;\n"+
                "                nullable = false;\n"+
                "            }\n"+
                "            primaryKeyColumn {\n"+
                "                name = \"id\";\n"+
                "                enabled = true;\n"+
                "            }\n"+
                "            index {\n"+
                "                name = \"PRIMARY\";\n"+
                "                enabled = true;\n"+
                "                unique = true;\n"+
                "                indexColumn {\n"+
                "                    name = \"id\";\n"+
                "                    orderType = OrderType.ASC;\n"+
                "                    enabled = true;\n"+
                "                }\n"+
                "            }\n"+
                "        }\n"+
                "    }\n"+
                "}\n"+
        "";
    }
}