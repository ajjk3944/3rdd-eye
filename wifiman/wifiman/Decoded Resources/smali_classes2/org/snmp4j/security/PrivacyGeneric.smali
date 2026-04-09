.class public abstract Lorg/snmp4j/security/PrivacyGeneric;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/security/PrivacyProtocol;


# static fields
.field private static final logger:Lorg/snmp4j/log/LogAdapter;


# instance fields
.field protected cipherPool:Lorg/snmp4j/security/CipherPool;

.field protected initVectorLength:I

.field protected keyBytes:I

.field protected protocolClass:Ljava/lang/String;

.field protected protocolId:Ljava/lang/String;

.field protected salt:Lorg/snmp4j/security/Salt;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lorg/snmp4j/security/PrivacyGeneric;

    invoke-static {v0}, Lorg/snmp4j/log/LogFactory;->getLogger(Ljava/lang/Class;)Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/security/PrivacyGeneric;->logger:Lorg/snmp4j/log/LogAdapter;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected doDecrypt([BII[B[B)[B
    .locals 6

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lorg/snmp4j/security/PrivacyGeneric;->cipherPool:Lorg/snmp4j/security/CipherPool;

    invoke-virtual {v1}, Lorg/snmp4j/security/CipherPool;->reuseCipher()Ljavax/crypto/Cipher;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lorg/snmp4j/security/PrivacyGeneric;->protocolId:Ljava/lang/String;

    invoke-static {v1}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v1

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    new-instance v2, Ljavax/crypto/spec/SecretKeySpec;

    iget v3, p0, Lorg/snmp4j/security/PrivacyGeneric;->keyBytes:I

    iget-object v4, p0, Lorg/snmp4j/security/PrivacyGeneric;->protocolClass:Ljava/lang/String;

    const/4 v5, 0x0

    invoke-direct {v2, p4, v5, v3, v4}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BIILjava/lang/String;)V

    new-instance p4, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {p4, p5}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    const/4 p5, 0x2

    invoke-virtual {v1, p5, v2, p4}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    invoke-virtual {v1, p1, p2, p3}, Ljavax/crypto/Cipher;->doFinal([BII)[B

    move-result-object v0

    iget-object p1, p0, Lorg/snmp4j/security/PrivacyGeneric;->cipherPool:Lorg/snmp4j/security/CipherPool;

    invoke-virtual {p1, v1}, Lorg/snmp4j/security/CipherPool;->offerCipher(Ljavax/crypto/Cipher;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :goto_1
    sget-object p2, Lorg/snmp4j/security/PrivacyGeneric;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {p2, p1}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    invoke-interface {p2}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    :goto_2
    return-object v0
.end method

.method protected doFinal([BIILjavax/crypto/Cipher;)[B
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/crypto/BadPaddingException;,
            Ljavax/crypto/IllegalBlockSizeException;,
            Ljavax/crypto/ShortBufferException;
        }
    .end annotation

    invoke-virtual {p4, p1, p2, p3}, Ljavax/crypto/Cipher;->doFinal([BII)[B

    move-result-object p1

    return-object p1
.end method

.method protected doFinalWithPadding([BIILjavax/crypto/Cipher;)[B
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/crypto/IllegalBlockSizeException;,
            Ljavax/crypto/BadPaddingException;,
            Ljavax/crypto/ShortBufferException;
        }
    .end annotation

    rem-int/lit8 v0, p3, 0x8

    if-nez v0, :cond_0

    invoke-virtual {p4, p1, p2, p3}, Ljavax/crypto/Cipher;->doFinal([BII)[B

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object v1, Lorg/snmp4j/security/PrivacyGeneric;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v1}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "Using padding."

    invoke-interface {v1, v2}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_1
    div-int/lit8 v1, p3, 0x8

    add-int/lit8 v1, v1, 0x1

    const/16 v2, 0x8

    mul-int/2addr v1, v2

    new-array v1, v1, [B

    new-array v4, v2, [B

    invoke-virtual {p4, p1, p2, p3, v1}, Ljavax/crypto/Cipher;->update([BII[B)I

    move-result v8

    const/4 v5, 0x0

    rsub-int/lit8 v6, v0, 0x8

    move-object v3, p4

    move-object v7, v1

    invoke-virtual/range {v3 .. v8}, Ljavax/crypto/Cipher;->doFinal([BII[BI)I

    move-object p1, v1

    :goto_0
    return-object p1
.end method

.method protected doInit([B[B)Ljavax/crypto/Cipher;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/crypto/NoSuchPaddingException;,
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/InvalidKeyException;,
            Ljava/security/InvalidAlgorithmParameterException;
        }
    .end annotation

    iget-object v0, p0, Lorg/snmp4j/security/PrivacyGeneric;->cipherPool:Lorg/snmp4j/security/CipherPool;

    invoke-virtual {v0}, Lorg/snmp4j/security/CipherPool;->reuseCipher()Ljavax/crypto/Cipher;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lorg/snmp4j/security/PrivacyGeneric;->protocolId:Ljava/lang/String;

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v0

    :cond_0
    new-instance v1, Ljavax/crypto/spec/SecretKeySpec;

    iget v2, p0, Lorg/snmp4j/security/PrivacyGeneric;->keyBytes:I

    iget-object v3, p0, Lorg/snmp4j/security/PrivacyGeneric;->protocolClass:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-direct {v1, p1, v4, v2, v3}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BIILjava/lang/String;)V

    new-instance p1, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {p1, p2}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    const/4 p2, 0x1

    invoke-virtual {v0, p2, v1, p1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    return-object v0
.end method

.method public isSupported()Z
    .locals 7

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lorg/snmp4j/security/PrivacyGeneric;->cipherPool:Lorg/snmp4j/security/CipherPool;

    invoke-virtual {v1}, Lorg/snmp4j/security/CipherPool;->reuseCipher()Ljavax/crypto/Cipher;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lorg/snmp4j/security/PrivacyGeneric;->protocolId:Ljava/lang/String;

    invoke-static {v1}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v1

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    iget v2, p0, Lorg/snmp4j/security/PrivacyGeneric;->initVectorLength:I

    new-array v2, v2, [B

    iget v3, p0, Lorg/snmp4j/security/PrivacyGeneric;->keyBytes:I

    new-array v3, v3, [B

    new-instance v4, Ljavax/crypto/spec/SecretKeySpec;

    iget v5, p0, Lorg/snmp4j/security/PrivacyGeneric;->keyBytes:I

    iget-object v6, p0, Lorg/snmp4j/security/PrivacyGeneric;->protocolClass:Ljava/lang/String;

    invoke-direct {v4, v3, v0, v5, v6}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BIILjava/lang/String;)V

    new-instance v3, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v3, v2}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    const/4 v2, 0x1

    invoke-virtual {v1, v2, v4, v3}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
    :try_end_0
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_1

    return v2

    :catch_1
    sget-object v1, Lorg/snmp4j/security/PrivacyGeneric;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v1}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lorg/snmp4j/security/PrivacyGeneric;->protocolClass:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " privacy with key length "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Lorg/snmp4j/security/PrivacyGeneric;->keyBytes:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " not supported"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_1
    return v0

    :goto_1
    sget-object v2, Lorg/snmp4j/security/PrivacyGeneric;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v2}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v3

    if-eqz v3, :cond_2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lorg/snmp4j/security/PrivacyGeneric;->protocolClass:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " privacy not available due to invalid parameter: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_2
    return v0

    :catch_2
    sget-object v1, Lorg/snmp4j/security/PrivacyGeneric;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v1}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v2

    if-eqz v2, :cond_3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lorg/snmp4j/security/PrivacyGeneric;->protocolClass:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " privacy not available"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_3
    return v0

    :catch_3
    sget-object v1, Lorg/snmp4j/security/PrivacyGeneric;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v1}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v2

    if-eqz v2, :cond_4

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lorg/snmp4j/security/PrivacyGeneric;->protocolClass:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " privacy not available without padding"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_4
    return v0
.end method
