.class public abstract Lorg/snmp4j/smi/TransportIpAddress;
.super Lorg/snmp4j/smi/IpAddress;
.source "SourceFile"


# static fields
.field private static final logger:Lorg/snmp4j/log/LogAdapter;

.field static final serialVersionUID:J = 0x9a7415bdc8ef60cL


# instance fields
.field protected port:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lorg/snmp4j/smi/TransportIpAddress;

    invoke-static {v0}, Lorg/snmp4j/log/LogFactory;->getLogger(Ljava/lang/Class;)Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/smi/TransportIpAddress;->logger:Lorg/snmp4j/log/LogAdapter;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lorg/snmp4j/smi/IpAddress;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lorg/snmp4j/smi/TransportIpAddress;->port:I

    return-void
.end method

.method public static parse(Ljava/lang/String;)Lorg/snmp4j/smi/Address;
    .locals 1

    new-instance v0, Lorg/snmp4j/smi/UdpAddress;

    invoke-direct {v0}, Lorg/snmp4j/smi/UdpAddress;-><init>()V

    invoke-virtual {v0, p0}, Lorg/snmp4j/smi/TransportIpAddress;->parseAddress(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    return-object v0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lorg/snmp4j/smi/Variable;

    invoke-virtual {p0, p1}, Lorg/snmp4j/smi/TransportIpAddress;->compareTo(Lorg/snmp4j/smi/Variable;)I

    move-result p1

    return p1
.end method

.method public compareTo(Lorg/snmp4j/smi/Variable;)I
    .locals 1

    .line 2
    invoke-super {p0, p1}, Lorg/snmp4j/smi/IpAddress;->compareTo(Lorg/snmp4j/smi/Variable;)I

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget v0, p0, Lorg/snmp4j/smi/TransportIpAddress;->port:I

    check-cast p1, Lorg/snmp4j/smi/TransportIpAddress;

    invoke-virtual {p1}, Lorg/snmp4j/smi/TransportIpAddress;->getPort()I

    move-result p1

    sub-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method public decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v0}, Lorg/snmp4j/smi/OctetString;-><init>()V

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/OctetString;->decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V

    :try_start_0
    invoke-virtual {p0, v0}, Lorg/snmp4j/smi/TransportIpAddress;->setTransportAddress(Lorg/snmp4j/smi/OctetString;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    sget-object v0, Lorg/snmp4j/smi/TransportIpAddress;->logger:Lorg/snmp4j/log/LogAdapter;

    const-string v1, "Wrong encoding of TransportAddress"

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public encodeBER(Ljava/io/OutputStream;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Lorg/snmp4j/smi/OctetString;

    invoke-virtual {p0}, Lorg/snmp4j/smi/TransportIpAddress;->getValue()[B

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/OctetString;->encodeBER(Ljava/io/OutputStream;)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lorg/snmp4j/smi/TransportIpAddress;

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Lorg/snmp4j/smi/IpAddress;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast p1, Lorg/snmp4j/smi/TransportIpAddress;

    invoke-virtual {p1}, Lorg/snmp4j/smi/TransportIpAddress;->getPort()I

    move-result p1

    iget v0, p0, Lorg/snmp4j/smi/TransportIpAddress;->port:I

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public getBERLength()I
    .locals 1

    invoke-virtual {p0}, Lorg/snmp4j/smi/TransportIpAddress;->getValue()[B

    move-result-object v0

    array-length v0, v0

    return v0
.end method

.method public getBERPayloadLength()I
    .locals 1

    invoke-virtual {p0}, Lorg/snmp4j/smi/TransportIpAddress;->getBERLength()I

    move-result v0

    return v0
.end method

.method public getPort()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/smi/TransportIpAddress;->port:I

    return v0
.end method

.method public getSyntax()I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method

.method public getValue()[B
    .locals 7

    const/4 v0, 0x4

    invoke-virtual {p0}, Lorg/snmp4j/smi/IpAddress;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/InetAddress;->getAddress()[B

    move-result-object v1

    invoke-virtual {p0}, Lorg/snmp4j/smi/IpAddress;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v2

    instance-of v2, v2, Ljava/net/Inet6Address;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    :try_start_0
    invoke-virtual {p0}, Lorg/snmp4j/smi/IpAddress;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v2

    check-cast v2, Ljava/net/Inet6Address;

    const-class v4, Ljava/net/Inet6Address;

    const-string v5, "getScopeId"

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    invoke-virtual {v4, v2, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move v4, v0

    goto :goto_0

    :catch_0
    :cond_0
    move v2, v3

    move v4, v2

    :goto_0
    array-length v5, v1

    add-int/lit8 v5, v5, 0x2

    add-int/2addr v5, v4

    new-array v5, v5, [B

    array-length v6, v1

    invoke-static {v1, v3, v5, v3, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v1, v1

    if-lez v4, :cond_1

    add-int/lit8 v3, v1, 0x1

    const/high16 v4, -0x1000000

    and-int/2addr v4, v2

    shr-int/lit8 v4, v4, 0x18

    int-to-byte v4, v4

    aput-byte v4, v5, v1

    add-int/lit8 v4, v1, 0x2

    const/high16 v6, 0xff0000

    and-int/2addr v6, v2

    shr-int/lit8 v6, v6, 0x10

    int-to-byte v6, v6

    aput-byte v6, v5, v3

    add-int/lit8 v3, v1, 0x3

    const v6, 0xff00

    and-int/2addr v6, v2

    shr-int/lit8 v6, v6, 0x8

    int-to-byte v6, v6

    aput-byte v6, v5, v4

    add-int/2addr v1, v0

    and-int/lit16 v0, v2, 0xff

    int-to-byte v0, v0

    aput-byte v0, v5, v3

    :cond_1
    add-int/lit8 v0, v1, 0x1

    iget v2, p0, Lorg/snmp4j/smi/TransportIpAddress;->port:I

    shr-int/lit8 v3, v2, 0x8

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    aput-byte v3, v5, v1

    and-int/lit16 v1, v2, 0xff

    int-to-byte v1, v1

    aput-byte v1, v5, v0

    return-object v5
.end method

.method public hashCode()I
    .locals 2

    invoke-super {p0}, Lorg/snmp4j/smi/IpAddress;->hashCode()I

    move-result v0

    iget v1, p0, Lorg/snmp4j/smi/TransportIpAddress;->port:I

    add-int/lit8 v1, v1, 0x2

    xor-int/2addr v0, v1

    return v0
.end method

.method public isValid()Z
    .locals 2

    invoke-super {p0}, Lorg/snmp4j/smi/IpAddress;->isValid()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lorg/snmp4j/smi/TransportIpAddress;->port:I

    if-ltz v0, :cond_0

    const v1, 0xffff

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public parseAddress(Ljava/lang/String;)Z
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Ljava/util/StringTokenizer;

    const-string v2, "/"

    invoke-direct {v1, p1, v2}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v1

    invoke-super {p0, p1}, Lorg/snmp4j/smi/IpAddress;->parseAddress(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lorg/snmp4j/smi/TransportIpAddress;->port:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    :cond_0
    return v0
.end method

.method public setPort(I)V
    .locals 3

    if-ltz p1, :cond_0

    const v0, 0xffff

    if-gt p1, v0, :cond_0

    iput p1, p0, Lorg/snmp4j/smi/TransportIpAddress;->port:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Illegal port specified: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public setTransportAddress(Lorg/snmp4j/smi/OctetString;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/UnknownHostException;
        }
    .end annotation

    const-class v0, Ljava/net/Inet6Address;

    invoke-virtual {p1}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x2

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v1}, Lorg/snmp4j/smi/OctetString;->substring(II)Lorg/snmp4j/smi/OctetString;

    move-result-object v1

    invoke-virtual {v1}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v1

    array-length v3, v1

    const/16 v4, 0x8

    if-eq v3, v4, :cond_1

    array-length v3, v1

    const/16 v5, 0x14

    if-ne v3, v5, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v1}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/snmp4j/smi/IpAddress;->setInetAddress(Ljava/net/InetAddress;)V

    goto :goto_1

    :cond_1
    :goto_0
    array-length v3, v1

    add-int/lit8 v5, v3, -0x4

    new-array v6, v5, [B

    invoke-static {v1, v2, v6, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    aget-byte v2, v1, v5

    shl-int/lit8 v2, v2, 0x18

    add-int/lit8 v5, v3, -0x3

    aget-byte v5, v1, v5

    and-int/lit16 v5, v5, 0xff

    shl-int/lit8 v5, v5, 0x10

    add-int/2addr v2, v5

    add-int/lit8 v5, v3, -0x2

    aget-byte v5, v1, v5

    and-int/lit16 v5, v5, 0xff

    shl-int/2addr v5, v4

    add-int/2addr v2, v5

    add-int/lit8 v3, v3, -0x1

    aget-byte v1, v1, v3

    and-int/lit16 v1, v1, 0xff

    add-int/2addr v2, v1

    :try_start_0
    const-class v1, Ljava/lang/String;

    const-class v3, [B

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v1, v3, v5}, [Ljava/lang/Class;

    move-result-object v1

    const-string v3, "getByAddress"

    invoke-virtual {v0, v3, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    filled-new-array {v3, v6, v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/net/InetAddress;

    invoke-virtual {p0, v0}, Lorg/snmp4j/smi/IpAddress;->setInetAddress(Ljava/net/InetAddress;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    sget-object v0, Lorg/snmp4j/smi/TransportIpAddress;->logger:Lorg/snmp4j/log/LogAdapter;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Java < 1.5 does not support scoped IPv6 addresses, ignoring scope ID for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    invoke-static {v6}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/snmp4j/smi/IpAddress;->setInetAddress(Ljava/net/InetAddress;)V

    :goto_1
    invoke-virtual {p1}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x2

    invoke-virtual {p1, v0}, Lorg/snmp4j/smi/OctetString;->get(I)B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    shl-int/2addr v0, v4

    iput v0, p0, Lorg/snmp4j/smi/TransportIpAddress;->port:I

    invoke-virtual {p1}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p1, v1}, Lorg/snmp4j/smi/OctetString;->get(I)B

    move-result p1

    and-int/lit16 p1, p1, 0xff

    add-int/2addr v0, p1

    iput v0, p0, Lorg/snmp4j/smi/TransportIpAddress;->port:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Lorg/snmp4j/smi/IpAddress;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lorg/snmp4j/smi/TransportIpAddress;->port:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
