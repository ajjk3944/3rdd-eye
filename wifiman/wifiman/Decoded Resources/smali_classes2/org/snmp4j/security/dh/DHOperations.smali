.class public Lorg/snmp4j/security/dh/DHOperations;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/snmp4j/security/dh/DHOperations$DHKeyInfo;,
        Lorg/snmp4j/security/dh/DHOperations$KeyType;
    }
.end annotation


# static fields
.field public static final DH_AUTH_PROTOCOL_PROPERTY:Ljava/lang/String; = "dh.authProtocol."

.field public static final DH_KICKSTART_SEC_NAME:Ljava/lang/String; = "dhKickstart"

.field public static final DH_KICKSTART_VIEW_NAME:Ljava/lang/String; = "dhKickRestricted"

.field public static final DH_PARAMS_PROPERTY:Ljava/lang/String; = "dh.params"

.field public static final DH_PRIVATE_KEY_PROPERTY:Ljava/lang/String; = "dh.privateKey."

.field public static final DH_PRIV_PROTOCOL_PROPERTY:Ljava/lang/String; = "dh.privProtocol."

.field public static final DH_PUBLIC_KEY_PROPERTY:Ljava/lang/String; = "dh.publicKey."

.field public static final DH_RESET_PROPERTY:Ljava/lang/String; = "dh.reset."

.field public static final DH_VACM_ROLE_PROPERTY:Ljava/lang/String; = "dh.vacm.role."

.field public static final DIFFIE_HELLMAN:Ljava/lang/String; = "DH"

.field private static final LOGGER:Lorg/snmp4j/log/LogAdapter;

.field public static final PBKDF2:Ljava/lang/String; = "PBKDF2WithHmacSHA1"

.field private static final PBKDF2_AUTH_SALT:Lorg/snmp4j/smi/OctetString;

.field private static final PBKDF2_ITERATION_COUNT:I = 0x1f4

.field private static final PBKDF2_PRIV_SALT:Lorg/snmp4j/smi/OctetString;

.field public static final oidUsmDHKickstartMgrPublic:Lorg/snmp4j/smi/OID;

.field public static final oidUsmDHKickstartMyPublic:Lorg/snmp4j/smi/OID;

.field public static final oidUsmDHKickstartSecurityName:Lorg/snmp4j/smi/OID;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Lorg/snmp4j/security/dh/DHOperations;

    invoke-static {v0}, Lorg/snmp4j/log/LogFactory;->getLogger(Ljava/lang/Class;)Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/security/dh/DHOperations;->LOGGER:Lorg/snmp4j/log/LogAdapter;

    const-string v0, "98dfb5ac"

    invoke-static {v0}, Lorg/snmp4j/smi/OctetString;->fromHexStringPairs(Ljava/lang/String;)Lorg/snmp4j/smi/OctetString;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/security/dh/DHOperations;->PBKDF2_AUTH_SALT:Lorg/snmp4j/smi/OctetString;

    const-string v0, "d1310ba6"

    invoke-static {v0}, Lorg/snmp4j/smi/OctetString;->fromHexStringPairs(Ljava/lang/String;)Lorg/snmp4j/smi/OctetString;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/security/dh/DHOperations;->PBKDF2_PRIV_SALT:Lorg/snmp4j/smi/OctetString;

    new-instance v0, Lorg/snmp4j/smi/OID;

    const/16 v1, 0xb

    new-array v2, v1, [I

    fill-array-data v2, :array_0

    invoke-direct {v0, v2}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/security/dh/DHOperations;->oidUsmDHKickstartMyPublic:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v2, v1, [I

    fill-array-data v2, :array_1

    invoke-direct {v0, v2}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/security/dh/DHOperations;->oidUsmDHKickstartMgrPublic:Lorg/snmp4j/smi/OID;

    new-instance v0, Lorg/snmp4j/smi/OID;

    new-array v1, v1, [I

    fill-array-data v1, :array_2

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OID;-><init>([I)V

    sput-object v0, Lorg/snmp4j/security/dh/DHOperations;->oidUsmDHKickstartSecurityName:Lorg/snmp4j/smi/OID;

    return-void

    nop

    :array_0
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x3
        0x65
        0x1
        0x2
        0x1
        0x1
        0x2
    .end array-data

    :array_1
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x3
        0x65
        0x1
        0x2
        0x1
        0x1
        0x3
    .end array-data

    :array_2
    .array-data 4
        0x1
        0x3
        0x6
        0x1
        0x3
        0x65
        0x1
        0x2
        0x1
        0x1
        0x4
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bytesToBigInteger([B)Ljava/math/BigInteger;
    .locals 2

    array-length v0, p0

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    new-instance p0, Ljava/math/BigInteger;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/math/BigInteger;-><init>([B)V

    return-object p0
.end method

.method public static computeSharedKey(Ljavax/crypto/KeyAgreement;[BLorg/snmp4j/security/dh/DHParameters;)[B
    .locals 5

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    :try_start_0
    const-string v0, "DH"

    invoke-static {v0}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v0

    invoke-static {p1}, Lorg/snmp4j/security/dh/DHOperations;->bytesToBigInteger([B)Ljava/math/BigInteger;

    move-result-object v1

    new-instance v2, Ljavax/crypto/spec/DHPublicKeySpec;

    invoke-virtual {p2}, Lorg/snmp4j/security/dh/DHParameters;->getPrime()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {p2}, Lorg/snmp4j/security/dh/DHParameters;->getGenerator()Ljava/math/BigInteger;

    move-result-object v4

    invoke-direct {v2, v1, v3, v4}, Ljavax/crypto/spec/DHPublicKeySpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-virtual {v0, v2}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Ljavax/crypto/KeyAgreement;->doPhase(Ljava/security/Key;Z)Ljava/security/Key;

    invoke-virtual {p0}, Ljavax/crypto/KeyAgreement;->generateSecret()[B

    move-result-object p0

    sget-object v0, Lorg/snmp4j/security/dh/DHOperations;->LOGGER:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Computing shared key "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v2, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v2, p0}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    invoke-virtual {v2}, Lorg/snmp4j/smi/OctetString;->toHexString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " from public key "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v2, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v2, p1}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    invoke-virtual {v2}, Lorg/snmp4j/smi/OctetString;->toHexString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " and parameters "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    goto :goto_1

    :cond_1
    :goto_0
    return-object p0

    :goto_1
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static createKeyPair(Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/security/dh/DHParameters;)Ljava/security/KeyPair;
    .locals 4

    :try_start_0
    const-string v0, "DH"

    invoke-static {v0}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v0

    invoke-virtual {p0}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object p0

    invoke-static {p0}, Lorg/snmp4j/security/dh/DHOperations;->bytesToBigInteger([B)Ljava/math/BigInteger;

    move-result-object p0

    new-instance v1, Ljavax/crypto/spec/DHPublicKeySpec;

    invoke-virtual {p2}, Lorg/snmp4j/security/dh/DHParameters;->getPrime()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {p2}, Lorg/snmp4j/security/dh/DHParameters;->getGenerator()Ljava/math/BigInteger;

    move-result-object v3

    invoke-direct {v1, p0, v2, v3}, Ljavax/crypto/spec/DHPublicKeySpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-virtual {v0, v1}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object p0

    invoke-virtual {p1}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object p1

    invoke-static {p1}, Lorg/snmp4j/security/dh/DHOperations;->bytesToBigInteger([B)Ljava/math/BigInteger;

    move-result-object p1

    new-instance v1, Ljavax/crypto/spec/DHPrivateKeySpec;

    invoke-virtual {p2}, Lorg/snmp4j/security/dh/DHParameters;->getPrime()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {p2}, Lorg/snmp4j/security/dh/DHParameters;->getGenerator()Ljava/math/BigInteger;

    move-result-object p2

    invoke-direct {v1, p1, v2, p2}, Ljavax/crypto/spec/DHPrivateKeySpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-virtual {v0, v1}, Ljava/security/KeyFactory;->generatePrivate(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;

    move-result-object p1

    new-instance p2, Ljava/security/KeyPair;

    invoke-direct {p2, p0, p1}, Ljava/security/KeyPair;-><init>(Ljava/security/PublicKey;Ljava/security/PrivateKey;)V
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/spec/InvalidKeySpecException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    goto :goto_1

    :goto_0
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :goto_1
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static deriveKey([BI)[B
    .locals 3

    new-array v0, p1, [B

    array-length v1, p0

    sub-int/2addr v1, p1

    const/4 v2, 0x0

    invoke-static {p0, v1, v0, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method

.method public static deriveKeyPBKDF2([BILorg/snmp4j/security/SecurityProtocols$SecurityProtocolType;)[B
    .locals 3

    :try_start_0
    const-string v0, "PBKDF2WithHmacSHA1"

    invoke-static {v0}, Ljavax/crypto/SecretKeyFactory;->getInstance(Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;

    move-result-object v0

    sget-object v1, Lorg/snmp4j/security/SecurityProtocols$SecurityProtocolType;->authentication:Lorg/snmp4j/security/SecurityProtocols$SecurityProtocolType;

    if-ne p2, v1, :cond_0

    sget-object p2, Lorg/snmp4j/security/dh/DHOperations;->PBKDF2_AUTH_SALT:Lorg/snmp4j/smi/OctetString;

    :goto_0
    invoke-virtual {p2}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object p2

    goto :goto_1

    :catch_0
    move-exception p0

    goto :goto_2

    :cond_0
    sget-object p2, Lorg/snmp4j/security/dh/DHOperations;->PBKDF2_PRIV_SALT:Lorg/snmp4j/smi/OctetString;

    goto :goto_0

    :goto_1
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, p0}, Ljava/lang/String;-><init>([B)V

    new-instance p0, Ljavax/crypto/spec/PBEKeySpec;

    invoke-virtual {v1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v1

    mul-int/lit8 p1, p1, 0x8

    const/16 v2, 0x1f4

    invoke-direct {p0, v1, p2, v2, p1}, Ljavax/crypto/spec/PBEKeySpec;-><init>([C[BII)V

    invoke-virtual {v0, p0}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;

    move-result-object p0

    invoke-interface {p0}, Ljava/security/Key;->getEncoded()[B

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :goto_2
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static derivePrivateKey(Ljava/security/KeyPair;)Lorg/snmp4j/smi/OctetString;
    .locals 1

    new-instance v0, Lorg/snmp4j/smi/OctetString;

    invoke-virtual {p0}, Ljava/security/KeyPair;->getPrivate()Ljava/security/PrivateKey;

    move-result-object p0

    invoke-static {p0}, Lorg/snmp4j/security/dh/DHOperations;->keyToBytes(Ljava/security/Key;)[B

    move-result-object p0

    invoke-direct {v0, p0}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    return-object v0
.end method

.method public static derivePublicKey(Ljava/security/KeyPair;)Lorg/snmp4j/smi/OctetString;
    .locals 1

    new-instance v0, Lorg/snmp4j/smi/OctetString;

    invoke-virtual {p0}, Ljava/security/KeyPair;->getPublic()Ljava/security/PublicKey;

    move-result-object p0

    invoke-static {p0}, Lorg/snmp4j/security/dh/DHOperations;->keyToBytes(Ljava/security/Key;)[B

    move-result-object p0

    invoke-direct {v0, p0}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    return-object v0
.end method

.method public static generatePublicKey(Lorg/snmp4j/security/dh/DHParameters;)Ljava/security/KeyPair;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/InvalidAlgorithmParameterException;
        }
    .end annotation

    new-instance v0, Ljavax/crypto/spec/DHParameterSpec;

    invoke-virtual {p0}, Lorg/snmp4j/security/dh/DHParameters;->getPrime()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {p0}, Lorg/snmp4j/security/dh/DHParameters;->getGenerator()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {p0}, Lorg/snmp4j/security/dh/DHParameters;->getPrivateValueLength()I

    move-result p0

    invoke-direct {v0, v1, v2, p0}, Ljavax/crypto/spec/DHParameterSpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V

    const-string p0, "DH"

    invoke-static {p0}, Ljava/security/KeyPairGenerator;->getInstance(Ljava/lang/String;)Ljava/security/KeyPairGenerator;

    move-result-object p0

    invoke-virtual {p0, v0}, Ljava/security/KeyPairGenerator;->initialize(Ljava/security/spec/AlgorithmParameterSpec;)V

    invoke-virtual {p0}, Ljava/security/KeyPairGenerator;->generateKeyPair()Ljava/security/KeyPair;

    move-result-object p0

    return-object p0
.end method

.method public static getDHKickstartPublicKeys(Lorg/snmp4j/Session;Lorg/snmp4j/util/PDUFactory;Lorg/snmp4j/Target;Ljava/util/Set;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/snmp4j/Session;",
            "Lorg/snmp4j/util/PDUFactory;",
            "Lorg/snmp4j/Target;",
            "Ljava/util/Set<",
            "Lorg/snmp4j/smi/OctetString;",
            ">;)",
            "Ljava/util/Map<",
            "Lorg/snmp4j/smi/OctetString;",
            "[",
            "Lorg/snmp4j/smi/OctetString;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Lorg/snmp4j/smi/OctetString;

    const-string v1, "dhKickstart"

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OctetString;-><init>(Ljava/lang/String;)V

    invoke-interface {p2, v0}, Lorg/snmp4j/Target;->setSecurityName(Lorg/snmp4j/smi/OctetString;)V

    new-instance v0, Lorg/snmp4j/util/TableUtils;

    invoke-direct {v0, p0, p1}, Lorg/snmp4j/util/TableUtils;-><init>(Lorg/snmp4j/Session;Lorg/snmp4j/util/PDUFactory;)V

    sget-object p0, Lorg/snmp4j/security/dh/DHOperations;->oidUsmDHKickstartMyPublic:Lorg/snmp4j/smi/OID;

    sget-object p1, Lorg/snmp4j/security/dh/DHOperations;->oidUsmDHKickstartMgrPublic:Lorg/snmp4j/smi/OID;

    sget-object v1, Lorg/snmp4j/security/dh/DHOperations;->oidUsmDHKickstartSecurityName:Lorg/snmp4j/smi/OID;

    filled-new-array {p0, p1, v1}, [Lorg/snmp4j/smi/OID;

    move-result-object p0

    const/4 p1, 0x0

    invoke-virtual {v0, p2, p0, p1, p1}, Lorg/snmp4j/util/TableUtils;->getTable(Lorg/snmp4j/Target;[Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OID;)Ljava/util/List;

    move-result-object p0

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/util/TableEvent;

    invoke-virtual {v0}, Lorg/snmp4j/util/RetrievalEvent;->getStatus()I

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lorg/snmp4j/util/TableEvent;->getColumns()[Lorg/snmp4j/smi/VariableBinding;

    move-result-object v1

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-virtual {v1}, Lorg/snmp4j/smi/VariableBinding;->getVariable()Lorg/snmp4j/smi/Variable;

    move-result-object v1

    invoke-virtual {v0}, Lorg/snmp4j/util/RetrievalEvent;->isError()Z

    move-result v2

    if-nez v2, :cond_1

    instance-of v2, v1, Lorg/snmp4j/smi/OctetString;

    if-eqz v2, :cond_1

    invoke-interface {p3, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    check-cast v1, Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v0}, Lorg/snmp4j/util/TableEvent;->getColumns()[Lorg/snmp4j/smi/VariableBinding;

    move-result-object v2

    const/4 v3, 0x0

    aget-object v2, v2, v3

    invoke-virtual {v2}, Lorg/snmp4j/smi/VariableBinding;->getVariable()Lorg/snmp4j/smi/Variable;

    move-result-object v2

    check-cast v2, Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v0}, Lorg/snmp4j/util/TableEvent;->getColumns()[Lorg/snmp4j/smi/VariableBinding;

    move-result-object v0

    const/4 v3, 0x2

    aget-object v0, v0, v3

    invoke-virtual {v0}, Lorg/snmp4j/smi/VariableBinding;->getVariable()Lorg/snmp4j/smi/Variable;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/smi/OctetString;

    filled-new-array {v2, v0}, [Lorg/snmp4j/smi/OctetString;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    sget-object v1, Lorg/snmp4j/security/dh/DHOperations;->LOGGER:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v1}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DH kickstart table retrieval from \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "\' returned error: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lorg/snmp4j/util/RetrievalEvent;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    goto :goto_0

    :cond_2
    return-object p1
.end method

.method public static getInitializedKeyAgreement(Ljava/security/KeyPair;)Ljavax/crypto/KeyAgreement;
    .locals 1

    :try_start_0
    const-string v0, "DH"

    invoke-static {v0}, Ljavax/crypto/KeyAgreement;->getInstance(Ljava/lang/String;)Ljavax/crypto/KeyAgreement;

    move-result-object v0

    invoke-virtual {p0}, Ljava/security/KeyPair;->getPrivate()Ljava/security/PrivateKey;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljavax/crypto/KeyAgreement;->init(Ljava/security/Key;)V
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    :goto_0
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static keyToBytes(Ljava/security/Key;)[B
    .locals 2

    instance-of v0, p0, Ljavax/crypto/interfaces/DHPublicKey;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p0, Ljavax/crypto/interfaces/DHPublicKey;

    invoke-interface {p0}, Ljavax/crypto/interfaces/DHPublicKey;->getY()Ljava/math/BigInteger;

    move-result-object p0

    invoke-virtual {p0}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object p0

    goto :goto_0

    :cond_0
    instance-of v0, p0, Ljavax/crypto/interfaces/DHPrivateKey;

    if-eqz v0, :cond_1

    check-cast p0, Ljavax/crypto/interfaces/DHPrivateKey;

    invoke-interface {p0}, Ljavax/crypto/interfaces/DHPrivateKey;->getX()Ljava/math/BigInteger;

    move-result-object p0

    invoke-virtual {p0}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object p0

    goto :goto_0

    :cond_1
    move-object p0, v1

    :goto_0
    if-nez p0, :cond_2

    return-object v1

    :cond_2
    array-length v0, p0

    rem-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    aget-byte v0, p0, v0

    if-nez v0, :cond_3

    const/4 v0, 0x1

    array-length v1, p0

    invoke-static {p0, v0, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p0

    :cond_3
    return-object p0
.end method
