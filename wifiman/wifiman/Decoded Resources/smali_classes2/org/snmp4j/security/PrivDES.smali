.class public Lorg/snmp4j/security/PrivDES;
.super Lorg/snmp4j/security/PrivacyGeneric;
.source "SourceFile"


# static fields
.field private static final DECRYPT_PARAMS_LENGTH:I = 0x8

.field public static final ID:Lorg/snmp4j/smi/OID;

.field private static final INIT_VECTOR_LENGTH:I = 0x8

.field private static final INPUT_KEY_LENGTH:I = 0x10

.field private static final KEY_LENGTH:I = 0x8

.field private static final PROTOCOL_CLASS:Ljava/lang/String; = "DES"

.field private static final PROTOCOL_ID:Ljava/lang/String; = "DES/CBC/NoPadding"

.field private static final logger:Lorg/snmp4j/log/LogAdapter;

.field private static final serialVersionUID:J = 0x230e677117c62af8L


# instance fields
.field protected salt:Lorg/snmp4j/security/Salt;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/snmp4j/smi/OID;

    const-string v1, "1.3.6.1.6.3.10.1.2.2"

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OID;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/snmp4j/security/PrivDES;->ID:Lorg/snmp4j/smi/OID;

    const-class v0, Lorg/snmp4j/security/PrivDES;

    invoke-static {v0}, Lorg/snmp4j/log/LogFactory;->getLogger(Ljava/lang/Class;)Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/security/PrivDES;->logger:Lorg/snmp4j/log/LogAdapter;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lorg/snmp4j/security/PrivacyGeneric;-><init>()V

    const/16 v0, 0x8

    iput v0, p0, Lorg/snmp4j/security/PrivacyGeneric;->initVectorLength:I

    const-string v1, "DES/CBC/NoPadding"

    iput-object v1, p0, Lorg/snmp4j/security/PrivacyGeneric;->protocolId:Ljava/lang/String;

    const-string v1, "DES"

    iput-object v1, p0, Lorg/snmp4j/security/PrivacyGeneric;->protocolClass:Ljava/lang/String;

    iput v0, p0, Lorg/snmp4j/security/PrivacyGeneric;->keyBytes:I

    invoke-static {}, Lorg/snmp4j/security/Salt;->getInstance()Lorg/snmp4j/security/Salt;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/security/PrivDES;->salt:Lorg/snmp4j/security/Salt;

    new-instance v0, Lorg/snmp4j/security/CipherPool;

    invoke-direct {v0}, Lorg/snmp4j/security/CipherPool;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/security/PrivacyGeneric;->cipherPool:Lorg/snmp4j/security/CipherPool;

    return-void
.end method


# virtual methods
.method public decrypt([BII[BJJLorg/snmp4j/security/DecryptParams;)[B
    .locals 6

    rem-int/lit8 p5, p3, 0x8

    if-nez p5, :cond_2

    const/16 p5, 0x8

    if-lt p3, p5, :cond_2

    iget p6, p9, Lorg/snmp4j/security/DecryptParams;->length:I

    if-ne p6, p5, :cond_2

    array-length p6, p4

    const/16 p7, 0x10

    if-lt p6, p7, :cond_1

    new-array v5, p5, [B

    const/4 p6, 0x0

    :goto_0
    if-ge p6, p5, :cond_0

    add-int/lit8 p7, p6, 0x8

    aget-byte p7, p4, p7

    iget-object p8, p9, Lorg/snmp4j/security/DecryptParams;->array:[B

    aget-byte p8, p8, p6

    xor-int/2addr p7, p8

    int-to-byte p7, p7

    aput-byte p7, v5, p6

    add-int/lit8 p6, p6, 0x1

    goto :goto_0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Lorg/snmp4j/security/PrivacyGeneric;->doDecrypt([BII[B[B)[B

    move-result-object p1

    return-object p1

    :cond_1
    sget-object p1, Lorg/snmp4j/security/PrivDES;->logger:Lorg/snmp4j/log/LogAdapter;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Wrong Key length: need at least 16 bytes, is "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p3, p4

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " bytes."

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "decryptionKey has illegal length "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p3, p4

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " (should be at least 16)."

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Length ("

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, ") is not multiple of 8 or decrypt params has not length 8 ("

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p3, p9, Lorg/snmp4j/security/DecryptParams;->length:I

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, ")."

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public encrypt([BII[BJJLorg/snmp4j/security/DecryptParams;)[B
    .locals 14

    move-object v1, p0

    move-object/from16 v0, p4

    move-object/from16 v2, p9

    iget-object v3, v1, Lorg/snmp4j/security/PrivDES;->salt:Lorg/snmp4j/security/Salt;

    invoke-virtual {v3}, Lorg/snmp4j/security/Salt;->getNext()J

    move-result-wide v3

    long-to-int v3, v3

    array-length v4, v0

    const/16 v5, 0x10

    if-lt v4, v5, :cond_8

    iget-object v4, v2, Lorg/snmp4j/security/DecryptParams;->array:[B

    const/16 v5, 0x8

    if-eqz v4, :cond_0

    iget v4, v2, Lorg/snmp4j/security/DecryptParams;->length:I

    if-ge v4, v5, :cond_1

    :cond_0
    new-array v4, v5, [B

    iput-object v4, v2, Lorg/snmp4j/security/DecryptParams;->array:[B

    :cond_1
    iput v5, v2, Lorg/snmp4j/security/DecryptParams;->length:I

    const/4 v4, 0x0

    iput v4, v2, Lorg/snmp4j/security/DecryptParams;->offset:I

    sget-object v6, Lorg/snmp4j/security/PrivDES;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v6}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v7

    if-eqz v7, :cond_2

    const-string v7, "Preparing decrypt_params."

    invoke-interface {v6, v7}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_2
    move v6, v4

    :goto_0
    const/4 v7, 0x4

    if-ge v6, v7, :cond_3

    iget-object v7, v2, Lorg/snmp4j/security/DecryptParams;->array:[B

    rsub-int/lit8 v8, v6, 0x3

    mul-int/lit8 v9, v6, 0x8

    shr-long v10, p5, v9

    const-wide/16 v12, 0xff

    and-long/2addr v10, v12

    long-to-int v10, v10

    int-to-byte v10, v10

    aput-byte v10, v7, v8

    rsub-int/lit8 v8, v6, 0x7

    shr-int v9, v3, v9

    and-int/lit16 v9, v9, 0xff

    int-to-byte v9, v9

    aput-byte v9, v7, v8

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_3
    new-array v3, v5, [B

    sget-object v6, Lorg/snmp4j/security/PrivDES;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v6}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v7

    if-eqz v7, :cond_4

    const-string v7, "Preparing iv for encryption."

    invoke-interface {v6, v7}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_4
    :goto_1
    if-ge v4, v5, :cond_5

    add-int/lit8 v6, v4, 0x8

    aget-byte v6, v0, v6

    iget-object v7, v2, Lorg/snmp4j/security/DecryptParams;->array:[B

    aget-byte v7, v7, v4

    xor-int/2addr v6, v7

    int-to-byte v6, v6

    aput-byte v6, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_5
    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {p0, v0, v3}, Lorg/snmp4j/security/PrivacyGeneric;->doInit([B[B)Ljavax/crypto/Cipher;

    move-result-object v0

    move-object v3, p1

    move/from16 v4, p2

    move/from16 v5, p3

    invoke-virtual {p0, p1, v4, v5, v0}, Lorg/snmp4j/security/PrivacyGeneric;->doFinalWithPadding([BIILjavax/crypto/Cipher;)[B

    move-result-object v2

    iget-object v3, v1, Lorg/snmp4j/security/PrivacyGeneric;->cipherPool:Lorg/snmp4j/security/CipherPool;

    invoke-virtual {v3, v0}, Lorg/snmp4j/security/CipherPool;->offerCipher(Ljavax/crypto/Cipher;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    sget-object v3, Lorg/snmp4j/security/PrivDES;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v3, v0}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    invoke-interface {v3}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_6
    :goto_2
    sget-object v0, Lorg/snmp4j/security/PrivDES;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v3

    if-eqz v3, :cond_7

    const-string v3, "Encryption finished."

    invoke-interface {v0, v3}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_7
    return-object v2

    :cond_8
    sget-object v2, Lorg/snmp4j/security/PrivDES;->logger:Lorg/snmp4j/log/LogAdapter;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Wrong Key length: need at least 16 bytes, is "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v4, v0

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " bytes."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "encryptionKey has illegal length "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v0, v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " (should be at least 16)."

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public extendShortKey([BLorg/snmp4j/smi/OctetString;[BLorg/snmp4j/security/AuthenticationProtocol;)[B
    .locals 0

    return-object p1
.end method

.method public getDecryptParamsLength()I
    .locals 1

    const/16 v0, 0x8

    return v0
.end method

.method public getEncryptedLength(I)I
    .locals 1

    rem-int/lit8 v0, p1, 0x8

    if-nez v0, :cond_0

    return p1

    :cond_0
    div-int/lit8 p1, p1, 0x8

    add-int/lit8 p1, p1, 0x1

    mul-int/lit8 p1, p1, 0x8

    return p1
.end method

.method public getID()Lorg/snmp4j/smi/OID;
    .locals 1

    sget-object v0, Lorg/snmp4j/security/PrivDES;->ID:Lorg/snmp4j/smi/OID;

    invoke-virtual {v0}, Lorg/snmp4j/smi/OID;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/smi/OID;

    return-object v0
.end method

.method public getMaxKeyLength()I
    .locals 1

    invoke-virtual {p0}, Lorg/snmp4j/security/PrivDES;->getMinKeyLength()I

    move-result v0

    return v0
.end method

.method public getMinKeyLength()I
    .locals 1

    const/16 v0, 0x10

    return v0
.end method

.method public isSupported()Z
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lorg/snmp4j/security/PrivacyGeneric;->cipherPool:Lorg/snmp4j/security/CipherPool;

    invoke-virtual {v1}, Lorg/snmp4j/security/CipherPool;->reuseCipher()Ljavax/crypto/Cipher;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, "DESede/CBC/NoPadding"

    invoke-static {v1}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;
    :try_end_0
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    const/4 v0, 0x1

    :catch_0
    return v0
.end method
