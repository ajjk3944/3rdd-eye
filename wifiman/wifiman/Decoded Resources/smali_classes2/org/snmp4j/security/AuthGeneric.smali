.class public abstract Lorg/snmp4j/security/AuthGeneric;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/security/AuthenticationProtocol;


# static fields
.field private static DEFAULT_AUTHENTICATION_CODE_LENGTH:I = 0x0

.field public static HMAC_BLOCK_SIZE:I = 0x0

.field private static final HMAC_BUFFER_SIZE:I = 0x100000

.field private static final logger:Lorg/snmp4j/log/LogAdapter;

.field private static final serialVersionUID:J = 0x3801b7e2b0406bc8L


# instance fields
.field private authenticationCodeLength:I

.field private final digestLength:I

.field protected hmacBlockSize:I

.field private final protoName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lorg/snmp4j/security/AuthGeneric;

    invoke-static {v0}, Lorg/snmp4j/log/LogFactory;->getLogger(Ljava/lang/Class;)Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/security/AuthGeneric;->logger:Lorg/snmp4j/log/LogAdapter;

    const/16 v0, 0x40

    sput v0, Lorg/snmp4j/security/AuthGeneric;->HMAC_BLOCK_SIZE:I

    const/16 v0, 0xc

    sput v0, Lorg/snmp4j/security/AuthGeneric;->DEFAULT_AUTHENTICATION_CODE_LENGTH:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Lorg/snmp4j/security/AuthGeneric;->HMAC_BLOCK_SIZE:I

    iput v0, p0, Lorg/snmp4j/security/AuthGeneric;->hmacBlockSize:I

    .line 3
    sget v0, Lorg/snmp4j/security/AuthGeneric;->DEFAULT_AUTHENTICATION_CODE_LENGTH:I

    iput v0, p0, Lorg/snmp4j/security/AuthGeneric;->authenticationCodeLength:I

    .line 4
    iput-object p1, p0, Lorg/snmp4j/security/AuthGeneric;->protoName:Ljava/lang/String;

    .line 5
    iput p2, p0, Lorg/snmp4j/security/AuthGeneric;->digestLength:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 6
    invoke-direct {p0, p1, p2}, Lorg/snmp4j/security/AuthGeneric;-><init>(Ljava/lang/String;I)V

    .line 7
    iput p3, p0, Lorg/snmp4j/security/AuthGeneric;->authenticationCodeLength:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;III)V
    .locals 0

    .line 8
    invoke-direct {p0, p1, p2, p3}, Lorg/snmp4j/security/AuthGeneric;-><init>(Ljava/lang/String;II)V

    .line 9
    iput p4, p0, Lorg/snmp4j/security/AuthGeneric;->hmacBlockSize:I

    return-void
.end method


# virtual methods
.method public authenticate([B[BIILorg/snmp4j/security/ByteArrayWindow;)Z
    .locals 8

    invoke-virtual {p0}, Lorg/snmp4j/security/AuthGeneric;->getDigestObject()Ljava/security/MessageDigest;

    move-result-object v0

    iget v1, p0, Lorg/snmp4j/security/AuthGeneric;->hmacBlockSize:I

    new-array v2, v1, [B

    new-array v1, v1, [B

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    iget v5, p0, Lorg/snmp4j/security/AuthGeneric;->authenticationCodeLength:I

    if-ge v4, v5, :cond_0

    invoke-virtual {p5, v4, v3}, Lorg/snmp4j/security/ByteArrayWindow;->set(IB)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    array-length v4, p1

    iget v5, p0, Lorg/snmp4j/security/AuthGeneric;->hmacBlockSize:I

    if-le v4, v5, :cond_1

    invoke-virtual {v0, p1}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object p1

    :cond_1
    move v4, v3

    :goto_1
    array-length v5, p1

    const/16 v6, 0x5c

    const/16 v7, 0x36

    if-ge v4, v5, :cond_2

    aget-byte v5, p1, v4

    xor-int/2addr v5, v7

    int-to-byte v5, v5

    aput-byte v5, v2, v4

    aget-byte v5, p1, v4

    xor-int/2addr v5, v6

    int-to-byte v5, v5

    aput-byte v5, v1, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_2
    array-length p1, p1

    :goto_2
    iget v4, p0, Lorg/snmp4j/security/AuthGeneric;->hmacBlockSize:I

    if-ge p1, v4, :cond_3

    aput-byte v7, v2, p1

    aput-byte v6, v1, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_2

    :cond_3
    invoke-virtual {v0, v2}, Ljava/security/MessageDigest;->update([B)V

    invoke-virtual {v0, p2, p3, p4}, Ljava/security/MessageDigest;->update([BII)V

    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p1

    invoke-virtual {v0}, Ljava/security/MessageDigest;->reset()V

    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->update([B)V

    invoke-virtual {v0, p1}, Ljava/security/MessageDigest;->update([B)V

    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p1

    :goto_3
    iget p2, p0, Lorg/snmp4j/security/AuthGeneric;->authenticationCodeLength:I

    if-ge v3, p2, :cond_4

    aget-byte p2, p1, v3

    invoke-virtual {p5, v3, p2}, Lorg/snmp4j/security/ByteArrayWindow;->set(IB)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_4
    const/4 p1, 0x1

    return p1
.end method

.method public changeDelta([B[B[B)[B
    .locals 11

    invoke-virtual {p0}, Lorg/snmp4j/security/AuthGeneric;->getDigestObject()Ljava/security/MessageDigest;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/MessageDigest;->getDigestLength()I

    move-result v1

    sget-object v2, Lorg/snmp4j/security/AuthGeneric;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v2}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v3

    if-eqz v3, :cond_0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lorg/snmp4j/security/AuthGeneric;->protoName:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "oldKey: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v4, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v4, p1}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    invoke-virtual {v4}, Lorg/snmp4j/smi/OctetString;->toHexString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lorg/snmp4j/security/AuthGeneric;->protoName:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "newKey: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v4, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v4, p2}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    invoke-virtual {v4}, Lorg/snmp4j/smi/OctetString;->toHexString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lorg/snmp4j/security/AuthGeneric;->protoName:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "random: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v4, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v4, p3}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    invoke-virtual {v4}, Lorg/snmp4j/smi/OctetString;->toHexString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_0
    array-length v2, p1

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v0}, Ljava/security/MessageDigest;->getDigestLength()I

    move-result v3

    div-int/2addr v2, v3

    new-instance v3, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v3, p1}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    new-instance v4, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v4}, Lorg/snmp4j/smi/OctetString;-><init>()V

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    if-ge v6, v2, :cond_2

    invoke-virtual {v3, p3}, Lorg/snmp4j/smi/OctetString;->append([B)V

    invoke-virtual {v3}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v7

    invoke-virtual {v0, v7}, Ljava/security/MessageDigest;->update([B)V

    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v7

    invoke-virtual {v3, v7}, Lorg/snmp4j/smi/OctetString;->setValue([B)V

    new-array v7, v1, [B

    invoke-virtual {v4, v7}, Lorg/snmp4j/smi/OctetString;->append([B)V

    move v7, v5

    :goto_1
    if-ge v7, v1, :cond_1

    mul-int v8, v6, v1

    add-int/2addr v8, v7

    invoke-virtual {v3, v7}, Lorg/snmp4j/smi/OctetString;->get(I)B

    move-result v9

    aget-byte v10, p2, v8

    xor-int/2addr v9, v10

    int-to-byte v9, v9

    invoke-virtual {v4, v8, v9}, Lorg/snmp4j/smi/OctetString;->set(IB)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v3, p3}, Lorg/snmp4j/smi/OctetString;->append([B)V

    invoke-virtual {v3}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/security/MessageDigest;->update([B)V

    new-instance v3, Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    array-length p1, p1

    invoke-virtual {v4}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v6

    sub-int/2addr p1, v6

    invoke-direct {v3, v0, v5, p1}, Lorg/snmp4j/smi/OctetString;-><init>([BII)V

    move p1, v5

    :goto_2
    invoke-virtual {v3}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v0

    if-ge p1, v0, :cond_3

    invoke-virtual {v3, p1}, Lorg/snmp4j/smi/OctetString;->get(I)B

    move-result v0

    mul-int v6, v2, v1

    add-int/2addr v6, p1

    aget-byte v6, p2, v6

    xor-int/2addr v0, v6

    int-to-byte v0, v0

    invoke-virtual {v3, p1, v0}, Lorg/snmp4j/smi/OctetString;->set(IB)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_2

    :cond_3
    array-length p1, p3

    invoke-virtual {v4}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result p2

    add-int/2addr p1, p2

    invoke-virtual {v3}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result p2

    add-int/2addr p1, p2

    new-array p1, p1, [B

    array-length p2, p3

    invoke-static {p3, v5, p1, v5, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-virtual {v4}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object p2

    array-length v0, p3

    invoke-virtual {v4}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v1

    invoke-static {p2, v5, p1, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-virtual {v3}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object p2

    array-length p3, p3

    invoke-virtual {v4}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v0

    add-int/2addr p3, v0

    invoke-virtual {v3}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v0

    invoke-static {p2, v5, p1, p3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    sget-object p2, Lorg/snmp4j/security/AuthGeneric;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {p2}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result p3

    if-eqz p3, :cond_4

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lorg/snmp4j/security/AuthGeneric;->protoName:Ljava/lang/String;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "keyChange:"

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v0, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v0, p1}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    invoke-virtual {v0}, Lorg/snmp4j/smi/OctetString;->toHexString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-interface {p2, p3}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_4
    return-object p1
.end method

.method public getAuthenticationCodeLength()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/security/AuthGeneric;->authenticationCodeLength:I

    return v0
.end method

.method public getDigestLength()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/security/AuthGeneric;->digestLength:I

    return v0
.end method

.method protected getDigestObject()Ljava/security/MessageDigest;
    .locals 3

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/security/AuthGeneric;->protoName:Ljava/lang/String;

    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    new-instance v0, Ljava/lang/InternalError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lorg/snmp4j/security/AuthGeneric;->protoName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " not supported in this VM."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/InternalError;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getMaxKeyLength()I
    .locals 1

    invoke-virtual {p0}, Lorg/snmp4j/security/AuthGeneric;->getDigestLength()I

    move-result v0

    return v0
.end method

.method public hash([B)[B
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/snmp4j/security/AuthGeneric;->getDigestObject()Ljava/security/MessageDigest;

    move-result-object v0

    .line 2
    invoke-virtual {v0, p1}, Ljava/security/MessageDigest;->update([B)V

    .line 3
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p1

    return-object p1
.end method

.method public hash([BII)[B
    .locals 1

    .line 4
    invoke-virtual {p0}, Lorg/snmp4j/security/AuthGeneric;->getDigestObject()Ljava/security/MessageDigest;

    move-result-object v0

    .line 5
    invoke-virtual {v0, p1, p2, p3}, Ljava/security/MessageDigest;->update([BII)V

    .line 6
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p1

    return-object p1
.end method

.method public isAuthentic([B[BIILorg/snmp4j/security/ByteArrayWindow;)Z
    .locals 6

    new-instance v0, Lorg/snmp4j/security/ByteArrayWindow;

    iget v1, p0, Lorg/snmp4j/security/AuthGeneric;->authenticationCodeLength:I

    new-array v2, v1, [B

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lorg/snmp4j/security/ByteArrayWindow;-><init>([BII)V

    invoke-virtual {p5}, Lorg/snmp4j/security/ByteArrayWindow;->getValue()[B

    move-result-object v1

    invoke-virtual {p5}, Lorg/snmp4j/security/ByteArrayWindow;->getOffset()I

    move-result v2

    invoke-virtual {v0}, Lorg/snmp4j/security/ByteArrayWindow;->getValue()[B

    move-result-object v4

    iget v5, p0, Lorg/snmp4j/security/AuthGeneric;->authenticationCodeLength:I

    invoke-static {v1, v2, v4, v3, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-virtual/range {p0 .. p5}, Lorg/snmp4j/security/AuthGeneric;->authenticate([B[BIILorg/snmp4j/security/ByteArrayWindow;)Z

    move-result p1

    if-nez p1, :cond_0

    return v3

    :cond_0
    iget p1, p0, Lorg/snmp4j/security/AuthGeneric;->authenticationCodeLength:I

    invoke-virtual {p5, v0, p1}, Lorg/snmp4j/security/ByteArrayWindow;->equals(Lorg/snmp4j/security/ByteArrayWindow;I)Z

    move-result p1

    return p1
.end method

.method public isSupported()Z
    .locals 1

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/security/AuthGeneric;->protoName:Ljava/lang/String;

    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    const/4 v0, 0x0

    return v0
.end method

.method public passwordToKey(Lorg/snmp4j/smi/OctetString;[B)[B
    .locals 9

    invoke-virtual {p0}, Lorg/snmp4j/security/AuthGeneric;->getDigestObject()Ljava/security/MessageDigest;

    move-result-object v0

    const/high16 v1, 0x100000

    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {p1}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object p1

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    :goto_0
    if-ge v4, v1, :cond_1

    move v6, v3

    :goto_1
    iget v7, p0, Lorg/snmp4j/security/AuthGeneric;->hmacBlockSize:I

    if-ge v6, v7, :cond_0

    add-int/lit8 v7, v5, 0x1

    array-length v8, p1

    rem-int/2addr v5, v8

    aget-byte v5, p1, v5

    invoke-virtual {v2, v5}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    add-int/lit8 v6, v6, 0x1

    move v5, v7

    goto :goto_1

    :cond_0
    add-int/2addr v4, v7

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    invoke-virtual {v0, v2}, Ljava/security/MessageDigest;->update(Ljava/nio/ByteBuffer;)V

    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p1

    sget-object v1, Lorg/snmp4j/security/AuthGeneric;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v1}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v2

    if-eqz v2, :cond_2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lorg/snmp4j/security/AuthGeneric;->protoName:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "First digest: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v3, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v3, p1}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    invoke-virtual {v3}, Lorg/snmp4j/smi/OctetString;->toHexString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_2
    invoke-virtual {v0}, Ljava/security/MessageDigest;->reset()V

    invoke-virtual {v0, p1}, Ljava/security/MessageDigest;->update([B)V

    invoke-virtual {v0, p2}, Ljava/security/MessageDigest;->update([B)V

    invoke-virtual {v0, p1}, Ljava/security/MessageDigest;->update([B)V

    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p1

    invoke-interface {v1}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result p2

    if-eqz p2, :cond_3

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lorg/snmp4j/security/AuthGeneric;->protoName:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "localized key: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v0, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v0, p1}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    invoke-virtual {v0}, Lorg/snmp4j/smi/OctetString;->toHexString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {v1, p2}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_3
    return-object p1
.end method
