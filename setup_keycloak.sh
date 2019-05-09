#!/bin/bash


cd ${JBOSS_HOME}/bin

echo 'Autenticando ...'
./kcadm.sh config credentials --server http://localhost:8080/auth --realm master --user ${KEYCLOAK_USER} \
--password ${KEYCLOAK_PASSWORD} --client admin-cli

echo 'Criando cliente demo-angular ...'
./kcadm.sh create clients -r master -s clientId=demo-angular -s directAccessGrantsEnabled=true -s \
publicClient=true -s 'webOrigins=["*"]' -s 'redirectUris=["*"]'

echo 'Criando usuário user1 ...'
./kcadm.sh create users  -r master -s username=user1 -s enabled=true -s emailVerified=true \
-s email=user1@angulardemo.com -s firstName="Demo User"

echo 'Atualizando senha do usuário user1 ...'
./kcadm.sh set-password -r master --username user1 -p 11235


if [[ -n "${KEYSTORE}" ]]; then
    echo 'Cadastrando keystore ...'

    ./kcadm.sh create components -r master -s name='demo-angular' -s providerId=java-keystore \
    -s providerType=org.keycloak.keys.KeyProvider -s parentId=master -s 'config.priority=["101"]' \
    -s 'config.enabled=["true"]' -s 'config.active=["true"]' \
    -s 'config.keystore=['\"${KEYSTORE}\"']' -s 'config.keystorePassword=['\"${KEYSTORE_STORE_PASSWORD}\"']' \
    -s 'config.keyPassword=['\"${KEYSTORE_KEY_PASSWORD}\"']' -s 'config.keyAlias=['\"${KEYSTORE_ALIAS}\"']'
fi