.class public Lorg/snmp4j/smi/TcpAddress;
.super Lorg/snmp4j/smi/TransportIpAddress;
.source "SourceFile"


# static fields
.field private static final logger:Lorg/snmp4j/log/LogAdapter;

.field static final serialVersionUID:J = 0x102c0c2218a534ecL


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lorg/snmp4j/smi/TcpAddress;

    invoke-static {v0}, Lorg/snmp4j/log/LogFactory;->getLogger(Ljava/lang/Class;)Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/smi/TcpAddress;->logger:Lorg/snmp4j/log/LogAdapter;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/snmp4j/smi/TransportIpAddress;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 5
    invoke-direct {p0}, Lorg/snmp4j/smi/TransportIpAddress;-><init>()V

    .line 6
    invoke-virtual {p0, p1}, Lorg/snmp4j/smi/TransportIpAddress;->setPort(I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 7
    invoke-direct {p0}, Lorg/snmp4j/smi/TransportIpAddress;-><init>()V

    .line 8
    invoke-virtual {p0, p1}, Lorg/snmp4j/smi/TransportIpAddress;->parseAddress(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 9
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public constructor <init>(Ljava/net/InetAddress;I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lorg/snmp4j/smi/TransportIpAddress;-><init>()V

    .line 3
    invoke-virtual {p0, p1}, Lorg/snmp4j/smi/IpAddress;->setInetAddress(Ljava/net/InetAddress;)V

    .line 4
    invoke-virtual {p0, p2}, Lorg/snmp4j/smi/TransportIpAddress;->setPort(I)V

    return-void
.end method

.method public static parse(Ljava/lang/String;)Lorg/snmp4j/smi/Address;
    .locals 1

    :try_start_0
    new-instance v0, Lorg/snmp4j/smi/TcpAddress;

    invoke-direct {v0}, Lorg/snmp4j/smi/TcpAddress;-><init>()V

    invoke-virtual {v0, p0}, Lorg/snmp4j/smi/TransportIpAddress;->parseAddress(Ljava/lang/String;)Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p0, :cond_0

    return-object v0

    :catch_0
    move-exception p0

    sget-object v0, Lorg/snmp4j/smi/TcpAddress;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v0, p0}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lorg/snmp4j/smi/TcpAddress;

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Lorg/snmp4j/smi/TransportIpAddress;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
