.class public abstract Lorg/snmp4j/security/nonstandard/PrivAESWith3DESKeyExtension;
.super Lorg/snmp4j/security/PrivAES;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/security/nonstandard/NonStandardSecurityProtocol;


# static fields
.field private static final logger:Lorg/snmp4j/log/LogAdapter;


# instance fields
.field protected oid:Lorg/snmp4j/smi/OID;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lorg/snmp4j/security/nonstandard/PrivAESWith3DESKeyExtension;

    invoke-static {v0}, Lorg/snmp4j/log/LogFactory;->getLogger(Ljava/lang/Class;)Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/security/nonstandard/PrivAESWith3DESKeyExtension;->logger:Lorg/snmp4j/log/LogAdapter;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0, p1}, Lorg/snmp4j/security/PrivAES;-><init>(I)V

    return-void
.end method


# virtual methods
.method public extendShortKey([BLorg/snmp4j/smi/OctetString;[BLorg/snmp4j/security/AuthenticationProtocol;)[B
    .locals 4

    array-length p2, p1

    invoke-virtual {p0}, Lorg/snmp4j/security/PrivAES;->getMinKeyLength()I

    move-result v0

    new-array v0, v0, [B

    array-length v1, p1

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-virtual {p0}, Lorg/snmp4j/security/PrivAES;->getMinKeyLength()I

    move-result v1

    new-array v1, v1, [B

    array-length v3, p1

    invoke-static {p1, v2, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_0
    invoke-virtual {p0}, Lorg/snmp4j/security/PrivAES;->getMinKeyLength()I

    move-result p1

    if-ge p2, p1, :cond_0

    new-instance p1, Lorg/snmp4j/smi/OctetString;

    invoke-direct {p1, v1, v2, p2}, Lorg/snmp4j/smi/OctetString;-><init>([BII)V

    invoke-interface {p4, p1, p3}, Lorg/snmp4j/security/AuthenticationProtocol;->passwordToKey(Lorg/snmp4j/smi/OctetString;[B)[B

    move-result-object v1

    invoke-virtual {p0}, Lorg/snmp4j/security/PrivAES;->getMinKeyLength()I

    move-result p1

    sub-int/2addr p1, p2

    invoke-interface {p4}, Lorg/snmp4j/security/AuthenticationProtocol;->getDigestLength()I

    move-result v3

    invoke-static {p1, v3}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-static {v1, v2, v0, p2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr p2, p1

    goto :goto_0

    :cond_0
    sget-object p1, Lorg/snmp4j/security/nonstandard/PrivAESWith3DESKeyExtension;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {p1}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result p2

    if-eqz p2, :cond_1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "AES nonstandard key extend produced key "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance p3, Lorg/snmp4j/smi/OctetString;

    invoke-direct {p3, v0}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    invoke-virtual {p3}, Lorg/snmp4j/smi/OctetString;->toHexString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_1
    return-object v0
.end method

.method public getID()Lorg/snmp4j/smi/OID;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/nonstandard/PrivAESWith3DESKeyExtension;->oid:Lorg/snmp4j/smi/OID;

    if-nez v0, :cond_0

    invoke-interface {p0}, Lorg/snmp4j/security/nonstandard/NonStandardSecurityProtocol;->getDefaultID()Lorg/snmp4j/smi/OID;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public setID(Lorg/snmp4j/smi/OID;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/security/nonstandard/PrivAESWith3DESKeyExtension;->oid:Lorg/snmp4j/smi/OID;

    return-void
.end method
