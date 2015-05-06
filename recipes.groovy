import com.speedment.orm.config.model.parameters.*

name = "project_1";
packetLocation = "src/main/java";
packetName = "recipes";
enabled = true;
dbms {
    ipAddress = "127.0.0.1";
    name = "recipes";
    password = "root";
    port = 3306;
    type = StandardDbmsType.MYSQL;
    username = "root";
    enabled = true;
    schema {
        columnCompressionType = ColumnCompressionType.NONE;
        fieldStorageType = FieldStorageType.WRAPPER;
        name = "recipes";
        schemaName = "recipes";
        storageEngineType = StorageEngineType.ON_HEAP;
        defaultSchema = false;
        enabled = true;
        table {
            columnCompressionType = ColumnCompressionType.INHERIT;
            fieldStorageType = FieldStorageType.INHERIT;
            name = "ratings";
            storageEngineType = StorageEngineType.INHERIT;
            tableName = "ratings";
            enabled = true;
            column {
                columnCompressionType = ColumnCompressionType.INHERIT;
                fieldStorageType = FieldStorageType.INHERIT;
                mapping = java.lang.Long.class;
                name = "id";
                autoincrement = true;
                enabled = true;
                nullable = false;
            }
            column {
                columnCompressionType = ColumnCompressionType.INHERIT;
                fieldStorageType = FieldStorageType.INHERIT;
                mapping = java.lang.Long.class;
                name = "users_id";
                autoincrement = false;
                enabled = true;
                nullable = false;
            }
            column {
                columnCompressionType = ColumnCompressionType.INHERIT;
                fieldStorageType = FieldStorageType.INHERIT;
                mapping = java.lang.Long.class;
                name = "recipes_id";
                autoincrement = false;
                enabled = true;
                nullable = false;
            }
            column {
                columnCompressionType = ColumnCompressionType.INHERIT;
                fieldStorageType = FieldStorageType.INHERIT;
                mapping = java.lang.Integer.class;
                name = "rating";
                autoincrement = false;
                enabled = true;
                nullable = false;
            }
            primaryKeyColumn {
                name = "id";
                enabled = true;
            }
            index {
                name = "PRIMARY";
                enabled = true;
                unique = true;
                indexColumn {
                    name = "id";
                    orderType = OrderType.ASC;
                    enabled = true;
                }
            }
            index {
                name = "recipes_id";
                enabled = true;
                unique = false;
                indexColumn {
                    name = "recipes_id";
                    orderType = OrderType.ASC;
                    enabled = true;
                }
            }
            index {
                name = "users_id";
                enabled = true;
                unique = false;
                indexColumn {
                    name = "users_id";
                    orderType = OrderType.ASC;
                    enabled = true;
                }
            }
            foreignKey {
                name = "ratings_ibfk_1";
                enabled = true;
                foreignKeyColumn {
                    foreignColumnName = "id";
                    foreignTableName = "users";
                    name = "users_id";
                    enabled = true;
                }
            }
            foreignKey {
                name = "ratings_ibfk_2";
                enabled = true;
                foreignKeyColumn {
                    foreignColumnName = "id";
                    foreignTableName = "recipes";
                    name = "recipes_id";
                    enabled = true;
                }
            }
        }
        table {
            columnCompressionType = ColumnCompressionType.INHERIT;
            fieldStorageType = FieldStorageType.INHERIT;
            name = "recipes";
            storageEngineType = StorageEngineType.INHERIT;
            tableName = "recipes";
            enabled = true;
            column {
                columnCompressionType = ColumnCompressionType.INHERIT;
                fieldStorageType = FieldStorageType.INHERIT;
                mapping = java.lang.Long.class;
                name = "id";
                autoincrement = true;
                enabled = true;
                nullable = false;
            }
            column {
                columnCompressionType = ColumnCompressionType.INHERIT;
                fieldStorageType = FieldStorageType.INHERIT;
                mapping = java.lang.String.class;
                name = "name";
                autoincrement = false;
                enabled = true;
                nullable = false;
            }
            column {
                columnCompressionType = ColumnCompressionType.INHERIT;
                fieldStorageType = FieldStorageType.INHERIT;
                mapping = java.lang.String.class;
                name = "text";
                autoincrement = false;
                enabled = true;
                nullable = false;
            }
            primaryKeyColumn {
                name = "id";
                enabled = true;
            }
            index {
                name = "PRIMARY";
                enabled = true;
                unique = true;
                indexColumn {
                    name = "id";
                    orderType = OrderType.ASC;
                    enabled = true;
                }
            }
        }
        table {
            columnCompressionType = ColumnCompressionType.INHERIT;
            fieldStorageType = FieldStorageType.INHERIT;
            name = "users";
            storageEngineType = StorageEngineType.INHERIT;
            tableName = "users";
            enabled = true;
            column {
                columnCompressionType = ColumnCompressionType.INHERIT;
                fieldStorageType = FieldStorageType.INHERIT;
                mapping = java.lang.Long.class;
                name = "id";
                autoincrement = true;
                enabled = true;
                nullable = false;
            }
            column {
                columnCompressionType = ColumnCompressionType.INHERIT;
                fieldStorageType = FieldStorageType.INHERIT;
                mapping = java.lang.String.class;
                name = "name";
                autoincrement = false;
                enabled = true;
                nullable = false;
            }
            column {
                columnCompressionType = ColumnCompressionType.INHERIT;
                fieldStorageType = FieldStorageType.INHERIT;
                mapping = java.lang.String.class;
                name = "password";
                autoincrement = false;
                enabled = true;
                nullable = false;
            }
            primaryKeyColumn {
                name = "id";
                enabled = true;
            }
            index {
                name = "PRIMARY";
                enabled = true;
                unique = true;
                indexColumn {
                    name = "id";
                    orderType = OrderType.ASC;
                    enabled = true;
                }
            }
        }
    }
}
