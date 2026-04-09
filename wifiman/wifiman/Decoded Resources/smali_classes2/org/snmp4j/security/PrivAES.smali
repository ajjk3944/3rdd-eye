.class public abstract Lorg/snmp4j/security/PrivAES;
.super Lorg/snmp4j/security/PrivacyGeneric;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/security/PrivacyProtocol;


# static fields
.field private static final DECRYPT_PARAMS_LENGTH:I = 0x8

.field private static final INIT_VECTOR_LENGTH:I = 0x10

.field private static final PROTOCOL_CLASS:Ljava/lang/String; = "AES"

.field private static final PROTOCOL_ID:Ljava/lang/String; = "AES/CFB/NoPadding"

.field private static final logger:Lorg/snmp4j/log/LogAdapter;


# instance fields
.field protected salt:Lorg/snmp4j/security/Salt;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lorg/snmp4j/security/PrivAES;

    invoke-static {v0}, Lorg/snmp4j/log/LogFactory;->getLogger(Ljava/lang/Class;)Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/security/PrivAES;->logger:Lorg/snmp4j/log/LogAdapter;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 3

    invoke-direct {p0}, Lorg/snmp4j/security/PrivacyGeneric;-><init>()V

    const/16 v0, 0x10

    iput v0, p0, Lorg/snmp4j/security/PrivacyGeneric;->initVectorLength:I

    const-string v1, "AES/CFB/NoPadding"

    iput-object v1, p0, Lorg/snmp4j/security/PrivacyGeneric;->protocolId:Ljava/lang/String;

    const-string v1, "AES"

    iput-object v1, p0, Lorg/snmp4j/security/PrivacyGeneric;->protocolClass:Ljava/lang/String;

    if-eq p1, v0, :cond_1

    const/16 v0, 0x18

    if-eq p1, v0, :cond_1

    const/16 v0, 0x20

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Only 128, 192 and 256 bit AES is allowed. Requested ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    mul-int/lit8 p1, p1, 0x8

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ")."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iput p1, p0, Lorg/snmp4j/security/PrivacyGeneric;->keyBytes:I

    invoke-static {}, Lorg/snmp4j/security/Salt;->getInstance()Lorg/snmp4j/security/Salt;

    move-result-object p1

    iput-object p1, p0, Lorg/snmp4j/security/PrivAES;->salt:Lorg/snmp4j/security/Salt;

    new-instance p1, Lorg/snmp4j/security/CipherPool;

    invoke-direct {p1}, Lorg/snmp4j/security/CipherPool;-><init>()V

    iput-object p1, p0, Lorg/snmp4j/security/PrivacyGeneric;->cipherPool:Lorg/snmp4j/security/CipherPool;

    return-void
.end method

.method public static asHex([B)Ljava/lang/String;
    .locals 1

    new-instance v0, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v0, p0}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    invoke-virtual {v0}, Lorg/snmp4j/smi/OctetString;->toHexString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public decrypt([BII[BJJLorg/snmp4j/security/DecryptParams;)[B
    .locals 11

    move-object v6, p0

    move-object v4, p4

    move-object/from16 v0, p9

    const/16 v1, 0x10

    new-array v5, v1, [B

    array-length v2, v4

    iget v3, v6, Lorg/snmp4j/security/PrivacyGeneric;->keyBytes:I

    if-ne v2, v3, :cond_1

    const/16 v2, 0x18

    shr-long v7, p5, v2

    const-wide/16 v9, 0xff

    and-long/2addr v7, v9

    long-to-int v3, v7

    int-to-byte v3, v3

    const/4 v7, 0x0

    aput-byte v3, v5, v7

    shr-long v7, p5, v1

    and-long/2addr v7, v9

    long-to-int v3, v7

    int-to-byte v3, v3

    const/4 v7, 0x1

    aput-byte v3, v5, v7

    const/16 v3, 0x8

    shr-long v7, p5, v3

    and-long/2addr v7, v9

    long-to-int v7, v7

    int-to-byte v7, v7

    const/4 v8, 0x2

    aput-byte v7, v5, v8

    and-long v7, p5, v9

    long-to-int v7, v7

    int-to-byte v7, v7

    const/4 v8, 0x3

    aput-byte v7, v5, v8

    shr-long v7, p7, v2

    and-long/2addr v7, v9

    long-to-int v2, v7

    int-to-byte v2, v2

    const/4 v7, 0x4

    aput-byte v2, v5, v7

    shr-long v1, p7, v1

    and-long/2addr v1, v9

    long-to-int v1, v1

    int-to-byte v1, v1

    const/4 v2, 0x5

    aput-byte v1, v5, v2

    shr-long v1, p7, v3

    and-long/2addr v1, v9

    long-to-int v1, v1

    int-to-byte v1, v1

    const/4 v2, 0x6

    aput-byte v1, v5, v2

    and-long v1, p7, v9

    long-to-int v1, v1

    int-to-byte v1, v1

    const/4 v2, 0x7

    aput-byte v1, v5, v2

    iget-object v1, v0, Lorg/snmp4j/security/DecryptParams;->array:[B

    iget v0, v0, Lorg/snmp4j/security/DecryptParams;->offset:I

    invoke-static {v1, v0, v5, v3, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    sget-object v0, Lorg/snmp4j/security/PrivAES;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "initVect is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v5}, Lorg/snmp4j/security/PrivAES;->asHex([B)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Lorg/snmp4j/security/PrivacyGeneric;->doDecrypt([BII[B[B)[B

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Needed key length is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v6, Lorg/snmp4j/security/PrivacyGeneric;->keyBytes:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ". Got "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v2, v4

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public encrypt([BII[BJJLorg/snmp4j/security/DecryptParams;)[B
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p4

    move-object/from16 v2, p9

    const/16 v3, 0x10

    new-array v4, v3, [B

    iget-object v5, v1, Lorg/snmp4j/security/PrivAES;->salt:Lorg/snmp4j/security/Salt;

    invoke-virtual {v5}, Lorg/snmp4j/security/Salt;->getNext()J

    move-result-wide v5

    array-length v7, v0

    iget v8, v1, Lorg/snmp4j/security/PrivacyGeneric;->keyBytes:I

    if-ne v7, v8, :cond_5

    iget-object v7, v2, Lorg/snmp4j/security/DecryptParams;->array:[B

    const/16 v8, 0x8

    if-eqz v7, :cond_0

    iget v7, v2, Lorg/snmp4j/security/DecryptParams;->length:I

    if-ge v7, v8, :cond_1

    :cond_0
    new-array v7, v8, [B

    iput-object v7, v2, Lorg/snmp4j/security/DecryptParams;->array:[B

    :cond_1
    iput v8, v2, Lorg/snmp4j/security/DecryptParams;->length:I

    const/4 v7, 0x0

    iput v7, v2, Lorg/snmp4j/security/DecryptParams;->offset:I

    const/16 v9, 0x18

    shr-long v10, p5, v9

    const-wide/16 v12, 0xff

    and-long/2addr v10, v12

    long-to-int v10, v10

    int-to-byte v10, v10

    aput-byte v10, v4, v7

    shr-long v10, p5, v3

    and-long/2addr v10, v12

    long-to-int v10, v10

    int-to-byte v10, v10

    const/4 v11, 0x1

    aput-byte v10, v4, v11

    shr-long v14, p5, v8

    and-long/2addr v14, v12

    long-to-int v10, v14

    int-to-byte v10, v10

    const/4 v14, 0x2

    aput-byte v10, v4, v14

    and-long v14, p5, v12

    long-to-int v10, v14

    int-to-byte v10, v10

    const/4 v14, 0x3

    aput-byte v10, v4, v14

    shr-long v9, p7, v9

    and-long/2addr v9, v12

    long-to-int v9, v9

    int-to-byte v9, v9

    const/4 v10, 0x4

    aput-byte v9, v4, v10

    shr-long v9, p7, v3

    and-long/2addr v9, v12

    long-to-int v3, v9

    int-to-byte v3, v3

    const/4 v9, 0x5

    aput-byte v3, v4, v9

    shr-long v9, p7, v8

    and-long/2addr v9, v12

    long-to-int v3, v9

    int-to-byte v3, v3

    const/4 v9, 0x6

    aput-byte v3, v4, v9

    and-long v9, p7, v12

    long-to-int v3, v9

    int-to-byte v3, v3

    const/4 v9, 0x7

    aput-byte v3, v4, v9

    const/16 v3, 0x38

    move v9, v8

    :goto_0
    if-ltz v3, :cond_2

    shr-long v14, v5, v3

    and-long/2addr v14, v12

    long-to-int v10, v14

    int-to-byte v10, v10

    aput-byte v10, v4, v9

    add-int/lit8 v3, v3, -0x8

    add-int/2addr v9, v11

    goto :goto_0

    :cond_2
    iget-object v3, v2, Lorg/snmp4j/security/DecryptParams;->array:[B

    invoke-static {v4, v8, v3, v7, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    sget-object v3, Lorg/snmp4j/security/PrivAES;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v3}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v5

    if-eqz v5, :cond_3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "initVect is "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v4}, Lorg/snmp4j/security/PrivAES;->asHex([B)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v5}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_3
    const/4 v5, 0x0

    :try_start_0
    invoke-virtual {v1, v0, v4}, Lorg/snmp4j/security/PrivacyGeneric;->doInit([B[B)Ljavax/crypto/Cipher;

    move-result-object v4

    move-object/from16 v6, p1

    move/from16 v7, p2

    move/from16 v8, p3

    invoke-virtual {v4, v6, v7, v8}, Ljavax/crypto/Cipher;->doFinal([BII)[B

    move-result-object v5

    iget-object v7, v1, Lorg/snmp4j/security/PrivacyGeneric;->cipherPool:Lorg/snmp4j/security/CipherPool;

    invoke-virtual {v7, v4}, Lorg/snmp4j/security/CipherPool;->offerCipher(Ljavax/crypto/Cipher;)V

    invoke-interface {v3}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v4

    if-eqz v4, :cond_4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "aes encrypt: Data to encrypt "

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {p1 .. p1}, Lorg/snmp4j/security/PrivAES;->asHex([B)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "aes encrypt: used key "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {p4 .. p4}, Lorg/snmp4j/security/PrivAES;->asHex([B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "aes encrypt: created privacy_params "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v2, Lorg/snmp4j/security/DecryptParams;->array:[B

    invoke-static {v2}, Lorg/snmp4j/security/PrivAES;->asHex([B)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "aes encrypt: encrypted Data  "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v5}, Lorg/snmp4j/security/PrivAES;->asHex([B)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    sget-object v2, Lorg/snmp4j/security/PrivAES;->logger:Lorg/snmp4j/log/LogAdapter;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Encrypt Exception "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    :cond_4
    :goto_1
    return-object v5

    :cond_5
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Needed key length is "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v1, Lorg/snmp4j/security/PrivacyGeneric;->keyBytes:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ". Got "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v0, v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "."

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public extendShortKey([BLorg/snmp4j/smi/OctetString;[BLorg/snmp4j/security/AuthenticationProtocol;)[B
    .locals 4

    invoke-virtual {p0}, Lorg/snmp4j/security/PrivAES;->getMinKeyLength()I

    move-result p2

    new-array p3, p2, [B

    array-length v0, p1

    const/4 v1, 0x0

    invoke-static {p1, v1, p3, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_0
    if-ge v0, p2, :cond_2

    invoke-interface {p4, p3, v1, v0}, Lorg/snmp4j/security/AuthenticationProtocol;->hash([BII)[B

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    sub-int v2, p2, v0

    invoke-interface {p4}, Lorg/snmp4j/security/AuthenticationProtocol;->getDigestLength()I

    move-result v3

    if-le v2, v3, :cond_1

    invoke-interface {p4}, Lorg/snmp4j/security/AuthenticationProtocol;->getDigestLength()I

    move-result v2

    :cond_1
    invoke-static {p1, v1, p3, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v0, v2

    goto :goto_0

    :cond_2
    return-object p3
.end method

.method public getDecryptParamsLength()I
    .locals 1

    const/16 v0, 0x8

    return v0
.end method

.method public getEncryptedLength(I)I
    .locals 0

    return p1
.end method

.method public getMaxKeyLength()I
    .locals 1

    invoke-virtual {p0}, Lorg/snmp4j/security/PrivAES;->getMinKeyLength()I

    move-result v0

    return v0
.end method

.method public getMinKeyLength()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/security/PrivacyGeneric;->keyBytes:I

    return v0
.end method
