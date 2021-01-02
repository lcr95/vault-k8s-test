path "database/creds/*" {
    capabilities = ["create",  "update", "delete", "list", "read"]
}

path "database/*" {
    capabilities = ["create",  "update", "delete", "list"]
}

path "pki/ca" {
    capabilities = ["read", "list", "create"]
}

path "pki/issue/*" {
    capabilities = ["update", "read", "list"]
}

path "secret/spring-native-example" {

    capabilities = ["read", "list"]

}
