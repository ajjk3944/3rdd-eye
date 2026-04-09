.class public Lorg/snmp4j/transport/TLSTM;
.super Lorg/snmp4j/transport/TcpTransportMapping;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/snmp4j/transport/TLSTM$DefaultTLSTMTrustManagerFactory;,
        Lorg/snmp4j/transport/TLSTM$TLSTMTrustManagerFactory;,
        Lorg/snmp4j/transport/TLSTM$DefaultSSLEngineConfiguration;,
        Lorg/snmp4j/transport/TLSTM$SSLEngineConfigurator;,
        Lorg/snmp4j/transport/TLSTM$ServerThread;,
        Lorg/snmp4j/transport/TLSTM$SocketTimeout;,
        Lorg/snmp4j/transport/TLSTM$SocketEntry;
    }
.end annotation


# static fields
.field public static final DEFAULT_TLSTM_PROTOCOLS:Ljava/lang/String; = "TLSv1"

.field public static final MAX_TLS_PAYLOAD_SIZE:I = 0x8000

.field public static final TLS_MAX_FRAGMENT_SIZE:I = 0x4000

.field private static final logger:Lorg/snmp4j/log/LogAdapter;


# instance fields
.field private connectionTimeout:J

.field private counterSupport:Lorg/snmp4j/mp/CounterSupport;

.field private keyStore:Ljava/lang/String;

.field private keyStorePassword:Ljava/lang/String;

.field private localCertificateAlias:Ljava/lang/String;

.field private nextSessionID:J

.field private securityCallback:Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/snmp4j/transport/tls/TlsTmSecurityCallback<",
            "Ljava/security/cert/X509Certificate;",
            ">;"
        }
    .end annotation
.end field

.field private server:Lorg/snmp4j/util/WorkerTask;

.field private serverEnabled:Z

.field private serverThread:Lorg/snmp4j/transport/TLSTM$ServerThread;

.field private socketCleaner:Lorg/snmp4j/util/CommonTimer;

.field private sockets:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lorg/snmp4j/smi/Address;",
            "Lorg/snmp4j/transport/TLSTM$SocketEntry;",
            ">;"
        }
    .end annotation
.end field

.field private sslEngineConfigurator:Lorg/snmp4j/transport/TLSTM$SSLEngineConfigurator;

.field private tlsMaxFragmentSize:I

.field private tlsProtocols:[Ljava/lang/String;

.field private trustManagerFactory:Lorg/snmp4j/transport/TLSTM$TLSTMTrustManagerFactory;

.field private trustStore:Ljava/lang/String;

.field private trustStorePassword:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lorg/snmp4j/transport/TLSTM;

    invoke-static {v0}, Lorg/snmp4j/log/LogFactory;->getLogger(Ljava/lang/Class;)Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/transport/TLSTM;->logger:Lorg/snmp4j/log/LogAdapter;

    return-void
.end method

.method public constructor <init>()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/UnknownHostException;
        }
    .end annotation

    .line 1
    new-instance v0, Lorg/snmp4j/smi/TlsAddress;

    invoke-static {}, Ljava/net/InetAddress;->getLocalHost()Ljava/net/InetAddress;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/snmp4j/smi/TlsAddress;-><init>(Ljava/net/InetAddress;I)V

    invoke-direct {p0, v0}, Lorg/snmp4j/transport/TcpTransportMapping;-><init>(Lorg/snmp4j/smi/TcpAddress;)V

    .line 2
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/transport/TLSTM;->sockets:Ljava/util/Map;

    const-wide/32 v0, 0xea60

    .line 3
    iput-wide v0, p0, Lorg/snmp4j/transport/TLSTM;->connectionTimeout:J

    .line 4
    iput-boolean v2, p0, Lorg/snmp4j/transport/TLSTM;->serverEnabled:Z

    const-wide/16 v0, 0x1

    .line 5
    iput-wide v0, p0, Lorg/snmp4j/transport/TLSTM;->nextSessionID:J

    .line 6
    new-instance v0, Lorg/snmp4j/transport/TLSTM$DefaultSSLEngineConfiguration;

    invoke-direct {v0, p0}, Lorg/snmp4j/transport/TLSTM$DefaultSSLEngineConfiguration;-><init>(Lorg/snmp4j/transport/TLSTM;)V

    iput-object v0, p0, Lorg/snmp4j/transport/TLSTM;->sslEngineConfigurator:Lorg/snmp4j/transport/TLSTM$SSLEngineConfigurator;

    .line 7
    new-instance v0, Lorg/snmp4j/transport/TLSTM$DefaultTLSTMTrustManagerFactory;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lorg/snmp4j/transport/TLSTM$DefaultTLSTMTrustManagerFactory;-><init>(Lorg/snmp4j/transport/TLSTM;Lorg/snmp4j/transport/TLSTM$1;)V

    iput-object v0, p0, Lorg/snmp4j/transport/TLSTM;->trustManagerFactory:Lorg/snmp4j/transport/TLSTM$TLSTMTrustManagerFactory;

    const/16 v0, 0x4000

    .line 8
    iput v0, p0, Lorg/snmp4j/transport/TLSTM;->tlsMaxFragmentSize:I

    .line 9
    invoke-static {}, Lorg/snmp4j/mp/CounterSupport;->getInstance()Lorg/snmp4j/mp/CounterSupport;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/transport/TLSTM;->counterSupport:Lorg/snmp4j/mp/CounterSupport;

    const v0, 0x8000

    .line 10
    iput v0, p0, Lorg/snmp4j/transport/AbstractTransportMapping;->maxInboundMessageSize:I

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/smi/TlsAddress;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 11
    invoke-direct {p0, p1}, Lorg/snmp4j/transport/TcpTransportMapping;-><init>(Lorg/snmp4j/smi/TcpAddress;)V

    .line 12
    new-instance p1, Ljava/util/Hashtable;

    invoke-direct {p1}, Ljava/util/Hashtable;-><init>()V

    iput-object p1, p0, Lorg/snmp4j/transport/TLSTM;->sockets:Ljava/util/Map;

    const-wide/32 v0, 0xea60

    .line 13
    iput-wide v0, p0, Lorg/snmp4j/transport/TLSTM;->connectionTimeout:J

    const/4 p1, 0x0

    .line 14
    iput-boolean p1, p0, Lorg/snmp4j/transport/TLSTM;->serverEnabled:Z

    const-wide/16 v0, 0x1

    .line 15
    iput-wide v0, p0, Lorg/snmp4j/transport/TLSTM;->nextSessionID:J

    .line 16
    new-instance v0, Lorg/snmp4j/transport/TLSTM$DefaultSSLEngineConfiguration;

    invoke-direct {v0, p0}, Lorg/snmp4j/transport/TLSTM$DefaultSSLEngineConfiguration;-><init>(Lorg/snmp4j/transport/TLSTM;)V

    iput-object v0, p0, Lorg/snmp4j/transport/TLSTM;->sslEngineConfigurator:Lorg/snmp4j/transport/TLSTM$SSLEngineConfigurator;

    .line 17
    new-instance v0, Lorg/snmp4j/transport/TLSTM$DefaultTLSTMTrustManagerFactory;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lorg/snmp4j/transport/TLSTM$DefaultTLSTMTrustManagerFactory;-><init>(Lorg/snmp4j/transport/TLSTM;Lorg/snmp4j/transport/TLSTM$1;)V

    iput-object v0, p0, Lorg/snmp4j/transport/TLSTM;->trustManagerFactory:Lorg/snmp4j/transport/TLSTM$TLSTMTrustManagerFactory;

    const/16 v0, 0x4000

    .line 18
    iput v0, p0, Lorg/snmp4j/transport/TLSTM;->tlsMaxFragmentSize:I

    const v0, 0x8000

    .line 19
    iput v0, p0, Lorg/snmp4j/transport/AbstractTransportMapping;->maxInboundMessageSize:I

    const/4 v0, 0x1

    .line 20
    iput-boolean v0, p0, Lorg/snmp4j/transport/TLSTM;->serverEnabled:Z

    .line 21
    invoke-static {}, Lorg/snmp4j/mp/CounterSupport;->getInstance()Lorg/snmp4j/mp/CounterSupport;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/transport/TLSTM;->counterSupport:Lorg/snmp4j/mp/CounterSupport;

    .line 22
    :try_start_0
    const-string v0, "javax.net.ssl.X509ExtendedTrustManager"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 23
    const-class v0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManagerFactory;

    .line 24
    invoke-virtual {v0}, Ljava/lang/Class;->getConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object v0

    aget-object p1, v0, p1

    .line 25
    invoke-static {}, Lorg/snmp4j/mp/CounterSupport;->getInstance()Lorg/snmp4j/mp/CounterSupport;

    move-result-object v0

    iget-object v1, p0, Lorg/snmp4j/transport/TLSTM;->securityCallback:Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/snmp4j/transport/TLSTM$TLSTMTrustManagerFactory;

    .line 26
    invoke-virtual {p0, p1}, Lorg/snmp4j/transport/TLSTM;->setTrustManagerFactory(Lorg/snmp4j/transport/TLSTM$TLSTMTrustManagerFactory;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :catch_2
    move-exception p1

    goto :goto_2

    :catch_3
    move-exception p1

    goto :goto_3

    .line 27
    :goto_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to instantiate TLSTMTrustManagerFactory: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 28
    :goto_1
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to access TLSTMTrustManagerFactory: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 29
    :goto_2
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to setup TLSTMTrustManagerFactory: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 30
    :goto_3
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to init TLSTMTrustManagerFactory: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_4
    :goto_4
    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;Lorg/snmp4j/smi/TlsAddress;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/snmp4j/transport/tls/TlsTmSecurityCallback<",
            "Ljava/security/cert/X509Certificate;",
            ">;",
            "Lorg/snmp4j/smi/TlsAddress;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 31
    invoke-static {}, Lorg/snmp4j/mp/CounterSupport;->getInstance()Lorg/snmp4j/mp/CounterSupport;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lorg/snmp4j/transport/TLSTM;-><init>(Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;Lorg/snmp4j/smi/TlsAddress;Lorg/snmp4j/mp/CounterSupport;)V

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;Lorg/snmp4j/smi/TlsAddress;Lorg/snmp4j/mp/CounterSupport;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/snmp4j/transport/tls/TlsTmSecurityCallback<",
            "Ljava/security/cert/X509Certificate;",
            ">;",
            "Lorg/snmp4j/smi/TlsAddress;",
            "Lorg/snmp4j/mp/CounterSupport;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 32
    invoke-direct {p0, p2}, Lorg/snmp4j/transport/TcpTransportMapping;-><init>(Lorg/snmp4j/smi/TcpAddress;)V

    .line 33
    new-instance p2, Ljava/util/Hashtable;

    invoke-direct {p2}, Ljava/util/Hashtable;-><init>()V

    iput-object p2, p0, Lorg/snmp4j/transport/TLSTM;->sockets:Ljava/util/Map;

    const-wide/32 v0, 0xea60

    .line 34
    iput-wide v0, p0, Lorg/snmp4j/transport/TLSTM;->connectionTimeout:J

    const/4 p2, 0x0

    .line 35
    iput-boolean p2, p0, Lorg/snmp4j/transport/TLSTM;->serverEnabled:Z

    const-wide/16 v0, 0x1

    .line 36
    iput-wide v0, p0, Lorg/snmp4j/transport/TLSTM;->nextSessionID:J

    .line 37
    new-instance p2, Lorg/snmp4j/transport/TLSTM$DefaultSSLEngineConfiguration;

    invoke-direct {p2, p0}, Lorg/snmp4j/transport/TLSTM$DefaultSSLEngineConfiguration;-><init>(Lorg/snmp4j/transport/TLSTM;)V

    iput-object p2, p0, Lorg/snmp4j/transport/TLSTM;->sslEngineConfigurator:Lorg/snmp4j/transport/TLSTM$SSLEngineConfigurator;

    .line 38
    new-instance p2, Lorg/snmp4j/transport/TLSTM$DefaultTLSTMTrustManagerFactory;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0}, Lorg/snmp4j/transport/TLSTM$DefaultTLSTMTrustManagerFactory;-><init>(Lorg/snmp4j/transport/TLSTM;Lorg/snmp4j/transport/TLSTM$1;)V

    iput-object p2, p0, Lorg/snmp4j/transport/TLSTM;->trustManagerFactory:Lorg/snmp4j/transport/TLSTM$TLSTMTrustManagerFactory;

    const/16 p2, 0x4000

    .line 39
    iput p2, p0, Lorg/snmp4j/transport/TLSTM;->tlsMaxFragmentSize:I

    const p2, 0x8000

    .line 40
    iput p2, p0, Lorg/snmp4j/transport/AbstractTransportMapping;->maxInboundMessageSize:I

    const/4 p2, 0x1

    .line 41
    iput-boolean p2, p0, Lorg/snmp4j/transport/TLSTM;->serverEnabled:Z

    .line 42
    iput-object p1, p0, Lorg/snmp4j/transport/TLSTM;->securityCallback:Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;

    .line 43
    iput-object p3, p0, Lorg/snmp4j/transport/TLSTM;->counterSupport:Lorg/snmp4j/mp/CounterSupport;

    return-void
.end method

.method static synthetic access$1000(Lorg/snmp4j/transport/TLSTM;)Z
    .locals 0

    iget-boolean p0, p0, Lorg/snmp4j/transport/TLSTM;->serverEnabled:Z

    return p0
.end method

.method static synthetic access$1500(Lorg/snmp4j/transport/TLSTM;Lorg/snmp4j/transport/TLSTM$SocketEntry;Ljavax/net/ssl/SSLEngineResult;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lorg/snmp4j/transport/TLSTM;->adjustInNetBuffer(Lorg/snmp4j/transport/TLSTM$SocketEntry;Ljavax/net/ssl/SSLEngineResult;)V

    return-void
.end method

.method static synthetic access$200(Lorg/snmp4j/transport/TLSTM;)Lorg/snmp4j/mp/CounterSupport;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/transport/TLSTM;->counterSupport:Lorg/snmp4j/mp/CounterSupport;

    return-object p0
.end method

.method static synthetic access$2000(Lorg/snmp4j/transport/TLSTM;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/transport/TLSTM;->sockets:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic access$2100(Lorg/snmp4j/transport/TLSTM;Lorg/snmp4j/TransportStateReference;Lorg/snmp4j/TransportStateReference;)Z
    .locals 0

    invoke-direct {p0, p1, p2}, Lorg/snmp4j/transport/TLSTM;->matchingStateReferences(Lorg/snmp4j/TransportStateReference;Lorg/snmp4j/TransportStateReference;)Z

    move-result p0

    return p0
.end method

.method static synthetic access$2200(Lorg/snmp4j/transport/TLSTM;Lorg/snmp4j/transport/TLSTM$SocketEntry;)V
    .locals 0

    invoke-direct {p0, p1}, Lorg/snmp4j/transport/TLSTM;->timeoutSocket(Lorg/snmp4j/transport/TLSTM$SocketEntry;)V

    return-void
.end method

.method static synthetic access$2300(Lorg/snmp4j/transport/TLSTM;)Lorg/snmp4j/util/WorkerTask;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/transport/TLSTM;->server:Lorg/snmp4j/util/WorkerTask;

    return-object p0
.end method

.method static synthetic access$2302(Lorg/snmp4j/transport/TLSTM;Lorg/snmp4j/util/WorkerTask;)Lorg/snmp4j/util/WorkerTask;
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/transport/TLSTM;->server:Lorg/snmp4j/util/WorkerTask;

    return-object p1
.end method

.method static synthetic access$2400(Lorg/snmp4j/transport/TLSTM;)I
    .locals 0

    iget p0, p0, Lorg/snmp4j/transport/TLSTM;->tlsMaxFragmentSize:I

    return p0
.end method

.method static synthetic access$2800(Lorg/snmp4j/transport/TLSTM;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/transport/TLSTM;->trustStore:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$2900(Lorg/snmp4j/transport/TLSTM;)Lorg/snmp4j/transport/TLSTM$TLSTMTrustManagerFactory;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/transport/TLSTM;->trustManagerFactory:Lorg/snmp4j/transport/TLSTM$TLSTMTrustManagerFactory;

    return-object p0
.end method

.method static synthetic access$300(Lorg/snmp4j/transport/TLSTM;)Lorg/snmp4j/transport/TLSTM$SSLEngineConfigurator;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/transport/TLSTM;->sslEngineConfigurator:Lorg/snmp4j/transport/TLSTM$SSLEngineConfigurator;

    return-object p0
.end method

.method static synthetic access$3000(Lorg/snmp4j/transport/TLSTM;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/transport/TLSTM;->localCertificateAlias:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$408(Lorg/snmp4j/transport/TLSTM;)J
    .locals 4

    iget-wide v0, p0, Lorg/snmp4j/transport/TLSTM;->nextSessionID:J

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    iput-wide v2, p0, Lorg/snmp4j/transport/TLSTM;->nextSessionID:J

    return-wide v0
.end method

.method static synthetic access$500()Lorg/snmp4j/log/LogAdapter;
    .locals 1

    sget-object v0, Lorg/snmp4j/transport/TLSTM;->logger:Lorg/snmp4j/log/LogAdapter;

    return-object v0
.end method

.method static synthetic access$600(Lorg/snmp4j/transport/TLSTM;)Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/transport/TLSTM;->securityCallback:Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;

    return-object p0
.end method

.method static synthetic access$700(Lorg/snmp4j/transport/TLSTM;Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljavax/net/ssl/SSLEngineResult;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-direct {p0, p1}, Lorg/snmp4j/transport/TLSTM;->sendNetMessage(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljavax/net/ssl/SSLEngineResult;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$800(Lorg/snmp4j/transport/TLSTM;)Lorg/snmp4j/util/CommonTimer;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/transport/TLSTM;->socketCleaner:Lorg/snmp4j/util/CommonTimer;

    return-object p0
.end method

.method static synthetic access$900(Lorg/snmp4j/transport/TLSTM;)J
    .locals 2

    iget-wide v0, p0, Lorg/snmp4j/transport/TLSTM;->connectionTimeout:J

    return-wide v0
.end method

.method private adjustInNetBuffer(Lorg/snmp4j/transport/TLSTM$SocketEntry;Ljavax/net/ssl/SSLEngineResult;)V
    .locals 2

    invoke-virtual {p2}, Ljavax/net/ssl/SSLEngineResult;->getStatus()Ljavax/net/ssl/SSLEngineResult$Status;

    move-result-object v0

    sget-object v1, Ljavax/net/ssl/SSLEngineResult$Status;->OK:Ljavax/net/ssl/SSLEngineResult$Status;

    if-ne v0, v1, :cond_1

    invoke-virtual {p2}, Ljavax/net/ssl/SSLEngineResult;->bytesConsumed()I

    move-result v0

    invoke-static {p1}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1200(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/Buffer;->limit()I

    move-result v1

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1200(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Ljavax/net/ssl/SSLEngineResult;->bytesConsumed()I

    move-result p2

    if-lez p2, :cond_1

    invoke-static {p1}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1200(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->compact()Ljava/nio/ByteBuffer;

    :cond_1
    :goto_0
    return-void
.end method

.method public static getFingerprint(Ljava/security/cert/X509Certificate;)Lorg/snmp4j/smi/OctetString;
    .locals 5

    const-string v0, ": "

    const-string v1, "with"

    :try_start_0
    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getSigAlgName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    const/4 v3, 0x0

    invoke-virtual {v2, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const-string v1, "SHA"

    invoke-virtual {v2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "-"

    invoke-virtual {v2, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SHA-"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v3, 0x3

    invoke-virtual {v2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_1

    :catch_1
    move-exception v1

    goto :goto_2

    :cond_0
    :goto_0
    invoke-static {v2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v1

    invoke-virtual {p0}, Ljava/security/cert/Certificate;->getEncoded()[B

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/security/MessageDigest;->update([B)V

    new-instance v2, Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v1

    invoke-direct {v2, v1}, Lorg/snmp4j/smi/OctetString;-><init>([B)V
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/cert/CertificateEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :goto_1
    sget-object v2, Lorg/snmp4j/transport/TLSTM;->logger:Lorg/snmp4j/log/LogAdapter;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Certificate encoding exception while getting fingerprint from "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v2, p0, v1}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/lang/CharSequence;Ljava/lang/Throwable;)V

    goto :goto_3

    :goto_2
    sget-object v2, Lorg/snmp4j/transport/TLSTM;->logger:Lorg/snmp4j/log/LogAdapter;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "No such digest algorithm exception while getting fingerprint from "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v2, p0, v1}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/lang/CharSequence;Ljava/lang/Throwable;)V

    :goto_3
    const/4 v2, 0x0

    :goto_4
    return-object v2
.end method

.method public static getSubjAltName(Ljava/util/Collection;I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/util/List<",
            "*>;>;I)",
            "Ljava/lang/Object;"
        }
    .end annotation

    if-eqz p0, :cond_1

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, p1, :cond_0

    const/4 p0, 0x1

    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method protected static isEngineClosed(Ljavax/net/ssl/SSLEngine;)Z
    .locals 2

    invoke-virtual {p0}, Ljavax/net/ssl/SSLEngine;->getHandshakeStatus()Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    move-result-object v0

    sget-object v1, Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;->NOT_HANDSHAKING:Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Ljavax/net/ssl/SSLEngine;->isOutboundDone()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljavax/net/ssl/SSLEngine;->isInboundDone()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private matchingStateReferences(Lorg/snmp4j/TransportStateReference;Lorg/snmp4j/TransportStateReference;)Z
    .locals 5

    const/4 v0, 0x0

    const-string v1, ",refOld="

    if-eqz p2, :cond_3

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lorg/snmp4j/TransportStateReference;->getSecurityName()Lorg/snmp4j/smi/OctetString;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {p2}, Lorg/snmp4j/TransportStateReference;->getSecurityName()Lorg/snmp4j/smi/OctetString;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lorg/snmp4j/TransportStateReference;->getSecurityName()Lorg/snmp4j/smi/OctetString;

    move-result-object p1

    invoke-virtual {p2}, Lorg/snmp4j/TransportStateReference;->getSecurityName()Lorg/snmp4j/smi/OctetString;

    move-result-object p2

    invoke-virtual {p1, p2}, Lorg/snmp4j/smi/OctetString;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    sget-object v2, Lorg/snmp4j/transport/TLSTM;->logger:Lorg/snmp4j/log/LogAdapter;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Could not match TransportStateReferences refNew="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v2, p1}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    return v0

    :cond_3
    :goto_1
    sget-object v2, Lorg/snmp4j/transport/TLSTM;->logger:Lorg/snmp4j/log/LogAdapter;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Failed to compare TransportStateReferences refNew="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v2, p1}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    return v0
.end method

.method private sendNetMessage(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljavax/net/ssl/SSLEngineResult;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p1}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$2500(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    invoke-static {p1}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$2700(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v1

    if-nez v1, :cond_0

    monitor-exit v0

    const/4 p1, 0x0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1400(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljavax/net/ssl/SSLEngine;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-static {p1}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$2700(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljavax/net/ssl/SSLEngine;->wrap(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)Ljavax/net/ssl/SSLEngineResult;

    move-result-object v1

    invoke-static {p1}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$2700(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    sget-object v2, Lorg/snmp4j/transport/TLSTM;->logger:Lorg/snmp4j/log/LogAdapter;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "TLS outNetBuffer = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$2700(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    invoke-static {p1}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1800(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/net/Socket;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/Socket;->getChannel()Ljava/nio/channels/SocketChannel;

    move-result-object v2

    invoke-static {p1}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$2700(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/nio/channels/SocketChannel;->write(Ljava/nio/ByteBuffer;)I

    invoke-static {p1}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$2700(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    monitor-exit v0

    return-object v1

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private declared-synchronized timeoutSocket(Lorg/snmp4j/transport/TLSTM$SocketEntry;)V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lorg/snmp4j/transport/TLSTM;->connectionTimeout:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    new-instance v0, Lorg/snmp4j/transport/TLSTM$SocketTimeout;

    invoke-direct {v0, p0, p1}, Lorg/snmp4j/transport/TLSTM$SocketTimeout;-><init>(Lorg/snmp4j/transport/TLSTM;Lorg/snmp4j/transport/TLSTM$SocketEntry;)V

    invoke-virtual {p1, v0}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->setSocketTimeout(Lorg/snmp4j/transport/TLSTM$SocketTimeout;)V

    iget-object p1, p0, Lorg/snmp4j/transport/TLSTM;->socketCleaner:Lorg/snmp4j/util/CommonTimer;

    iget-wide v1, p0, Lorg/snmp4j/transport/TLSTM;->connectionTimeout:J

    invoke-interface {p1, v0, v1, v2}, Lorg/snmp4j/util/CommonTimer;->schedule(Ljava/util/TimerTask;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method


# virtual methods
.method public close()V
    .locals 8

    .line 2
    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM;->sockets:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/snmp4j/transport/TLSTM$SocketEntry;

    .line 3
    invoke-virtual {v1}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->closeSession()V

    .line 4
    new-instance v3, Lorg/snmp4j/transport/TransportStateEvent;

    .line 5
    invoke-virtual {v1}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->getPeerAddress()Lorg/snmp4j/smi/TcpAddress;

    move-result-object v1

    const/4 v4, 0x4

    invoke-direct {v3, p0, v1, v4, v2}, Lorg/snmp4j/transport/TransportStateEvent;-><init>(Lorg/snmp4j/transport/TcpTransportMapping;Lorg/snmp4j/smi/Address;ILjava/io/IOException;)V

    .line 6
    invoke-virtual {p0, v3}, Lorg/snmp4j/transport/TcpTransportMapping;->fireConnectionStateChanged(Lorg/snmp4j/transport/TransportStateEvent;)V

    goto :goto_0

    .line 7
    :cond_0
    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM;->server:Lorg/snmp4j/util/WorkerTask;

    if-eqz v0, :cond_5

    .line 8
    invoke-interface {v0}, Lorg/snmp4j/util/WorkerTask;->terminate()V

    .line 9
    invoke-interface {v0}, Lorg/snmp4j/util/WorkerTask;->interrupt()V

    .line 10
    :try_start_0
    invoke-interface {v0}, Lorg/snmp4j/util/WorkerTask;->join()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 11
    sget-object v1, Lorg/snmp4j/transport/TLSTM;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v1, v0}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    .line 12
    :goto_1
    iput-object v2, p0, Lorg/snmp4j/transport/TLSTM;->server:Lorg/snmp4j/util/WorkerTask;

    .line 13
    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM;->sockets:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/snmp4j/transport/TLSTM$SocketEntry;

    .line 14
    invoke-virtual {v1}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->getSocket()Ljava/net/Socket;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 15
    :try_start_1
    invoke-virtual {v3}, Ljava/net/Socket;->getChannel()Ljava/nio/channels/SocketChannel;

    move-result-object v4

    .line 16
    invoke-virtual {v3}, Ljava/net/Socket;->close()V

    .line 17
    sget-object v3, Lorg/snmp4j/transport/TLSTM;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v3}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v5
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    const-string v6, " closed"

    if-eqz v5, :cond_2

    .line 18
    :try_start_2
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Socket to "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->getPeerAddress()Lorg/snmp4j/smi/TcpAddress;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v5}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    goto :goto_3

    :catch_1
    move-exception v1

    goto :goto_4

    :cond_2
    :goto_3
    if-eqz v4, :cond_1

    .line 19
    invoke-virtual {v4}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V

    .line 20
    invoke-interface {v3}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 21
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Socket channel to "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    invoke-virtual {v1}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->getPeerAddress()Lorg/snmp4j/smi/TcpAddress;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 23
    invoke-interface {v3, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_2

    .line 24
    :goto_4
    sget-object v3, Lorg/snmp4j/transport/TLSTM;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v3, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    goto :goto_2

    .line 25
    :cond_3
    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM;->socketCleaner:Lorg/snmp4j/util/CommonTimer;

    if-eqz v0, :cond_4

    .line 26
    invoke-interface {v0}, Lorg/snmp4j/util/CommonTimer;->cancel()V

    .line 27
    :cond_4
    iput-object v2, p0, Lorg/snmp4j/transport/TLSTM;->socketCleaner:Lorg/snmp4j/util/CommonTimer;

    :cond_5
    return-void
.end method

.method public bridge synthetic close(Lorg/snmp4j/smi/Address;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    check-cast p1, Lorg/snmp4j/smi/TcpAddress;

    invoke-virtual {p0, p1}, Lorg/snmp4j/transport/TLSTM;->close(Lorg/snmp4j/smi/TcpAddress;)Z

    move-result p1

    return p1
.end method

.method public declared-synchronized close(Lorg/snmp4j/smi/TcpAddress;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 28
    :try_start_0
    sget-object v0, Lorg/snmp4j/transport/TLSTM;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 29
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Closing socket for peer address "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 30
    :cond_0
    :goto_0
    invoke-virtual {p0, p1}, Lorg/snmp4j/transport/TLSTM;->removeSocketEntry(Lorg/snmp4j/smi/TcpAddress;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/snmp4j/transport/TLSTM$SocketEntry;

    if-eqz v1, :cond_3

    .line 31
    invoke-virtual {v1}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->getSocket()Ljava/net/Socket;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 32
    invoke-virtual {v1}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->getSocket()Ljava/net/Socket;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/Socket;->getChannel()Ljava/nio/channels/SocketChannel;

    move-result-object v2

    .line 33
    invoke-virtual {v1}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->getSocket()Ljava/net/Socket;

    move-result-object v3

    invoke-virtual {v3}, Ljava/net/Socket;->close()V

    .line 34
    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isInfoEnabled()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 35
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Socket to "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->getPeerAddress()Lorg/snmp4j/smi/TcpAddress;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " closed"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->info(Ljava/lang/CharSequence;)V

    :cond_1
    if-eqz v2, :cond_2

    .line 36
    invoke-virtual {v2}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V

    .line 37
    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 38
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Closed socket channel for peer address "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    :cond_2
    monitor-exit p0

    const/4 p1, 0x1

    return p1

    .line 40
    :cond_3
    monitor-exit p0

    const/4 p1, 0x0

    return p1

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public getConnectionTimeout()J
    .locals 2

    iget-wide v0, p0, Lorg/snmp4j/transport/TLSTM;->connectionTimeout:J

    return-wide v0
.end method

.method public getCounterSupport()Lorg/snmp4j/mp/CounterSupport;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM;->counterSupport:Lorg/snmp4j/mp/CounterSupport;

    return-object v0
.end method

.method public getKeyStore()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM;->keyStore:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "javax.net.ssl.keyStore"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public getKeyStorePassword()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM;->keyStorePassword:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "javax.net.ssl.keyStorePassword"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public bridge synthetic getListenAddress()Lorg/snmp4j/smi/Address;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/snmp4j/transport/TLSTM;->getListenAddress()Lorg/snmp4j/smi/TcpAddress;

    move-result-object v0

    return-object v0
.end method

.method public getListenAddress()Lorg/snmp4j/smi/TcpAddress;
    .locals 3

    .line 2
    iget-object v0, p0, Lorg/snmp4j/transport/TcpTransportMapping;->tcpAddress:Lorg/snmp4j/smi/TcpAddress;

    invoke-virtual {v0}, Lorg/snmp4j/smi/TransportIpAddress;->getPort()I

    move-result v0

    .line 3
    iget-object v1, p0, Lorg/snmp4j/transport/TLSTM;->serverThread:Lorg/snmp4j/transport/TLSTM$ServerThread;

    .line 4
    :try_start_0
    invoke-static {v1}, Lorg/snmp4j/transport/TLSTM$ServerThread;->access$100(Lorg/snmp4j/transport/TLSTM$ServerThread;)Ljava/nio/channels/ServerSocketChannel;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/channels/ServerSocketChannel;->socket()Ljava/net/ServerSocket;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/ServerSocket;->getLocalPort()I

    move-result v0
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    :catch_0
    new-instance v1, Lorg/snmp4j/smi/TcpAddress;

    iget-object v2, p0, Lorg/snmp4j/transport/TcpTransportMapping;->tcpAddress:Lorg/snmp4j/smi/TcpAddress;

    invoke-virtual {v2}, Lorg/snmp4j/smi/IpAddress;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lorg/snmp4j/smi/TcpAddress;-><init>(Ljava/net/InetAddress;I)V

    return-object v1
.end method

.method public getLocalCertificateAlias()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM;->localCertificateAlias:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "org.snmp4j.arg.tlsLocalID"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public getMaxInboundMessageSize()I
    .locals 1

    invoke-super {p0}, Lorg/snmp4j/transport/AbstractTransportMapping;->getMaxInboundMessageSize()I

    move-result v0

    return v0
.end method

.method public getMessageLengthDecoder()Lorg/snmp4j/transport/MessageLengthDecoder;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getSecurityCallback()Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/snmp4j/transport/tls/TlsTmSecurityCallback<",
            "Ljava/security/cert/X509Certificate;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM;->securityCallback:Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;

    return-object v0
.end method

.method public getSupportedAddressClass()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "+",
            "Lorg/snmp4j/smi/Address;",
            ">;"
        }
    .end annotation

    const-class v0, Lorg/snmp4j/smi/TlsAddress;

    return-object v0
.end method

.method public getThreadName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM;->server:Lorg/snmp4j/util/WorkerTask;

    if-eqz v0, :cond_0

    check-cast v0, Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getTlsProtocols()[Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM;->tlsProtocols:[Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "org.snmp4j.arg.tlsVersion"

    const-string v1, "TLSv1"

    invoke-static {v0, v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public getTrustManagerFactory()Lorg/snmp4j/transport/TLSTM$TLSTMTrustManagerFactory;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM;->trustManagerFactory:Lorg/snmp4j/transport/TLSTM$TLSTMTrustManagerFactory;

    return-object v0
.end method

.method public getTrustStore()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM;->trustStore:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "javax.net.ssl.trustStore"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public getTrustStorePassword()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM;->trustStorePassword:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "javax.net.ssl.trustStorePassword"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public isListening()Z
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM;->server:Lorg/snmp4j/util/WorkerTask;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isServerEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lorg/snmp4j/transport/TLSTM;->serverEnabled:Z

    return v0
.end method

.method public declared-synchronized listen()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM;->server:Lorg/snmp4j/util/WorkerTask;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_2

    :try_start_1
    new-instance v0, Lorg/snmp4j/transport/TLSTM$ServerThread;

    invoke-direct {v0, p0}, Lorg/snmp4j/transport/TLSTM$ServerThread;-><init>(Lorg/snmp4j/transport/TLSTM;)V

    iput-object v0, p0, Lorg/snmp4j/transport/TLSTM;->serverThread:Lorg/snmp4j/transport/TLSTM$ServerThread;

    sget-object v0, Lorg/snmp4j/transport/TLSTM;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isInfoEnabled()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "TCP address "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/snmp4j/transport/TLSTM;->getListenAddress()Lorg/snmp4j/smi/TcpAddress;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " bound successfully"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->info(Ljava/lang/CharSequence;)V
    :try_end_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    :try_start_2
    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->getThreadFactory()Lorg/snmp4j/util/ThreadFactory;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "TLSTM_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/snmp4j/transport/TcpTransportMapping;->getAddress()Lorg/snmp4j/smi/TcpAddress;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lorg/snmp4j/transport/TLSTM;->serverThread:Lorg/snmp4j/transport/TLSTM$ServerThread;

    const/4 v3, 0x1

    invoke-interface {v0, v1, v2, v3}, Lorg/snmp4j/util/ThreadFactory;->createWorkerThread(Ljava/lang/String;Lorg/snmp4j/util/WorkerTask;Z)Lorg/snmp4j/util/WorkerTask;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/transport/TLSTM;->server:Lorg/snmp4j/util/WorkerTask;

    iget-wide v0, p0, Lorg/snmp4j/transport/TLSTM;->connectionTimeout:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->getTimerFactory()Lorg/snmp4j/util/TimerFactory;

    move-result-object v0

    invoke-interface {v0}, Lorg/snmp4j/util/TimerFactory;->createTimer()Lorg/snmp4j/util/CommonTimer;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/transport/TLSTM;->socketCleaner:Lorg/snmp4j/util/CommonTimer;

    :cond_1
    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM;->server:Lorg/snmp4j/util/WorkerTask;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :goto_1
    :try_start_3
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SSL not available: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_2
    new-instance v0, Ljava/net/SocketException;

    const-string v1, "Port already listening"

    invoke-direct {v0, v1}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_2
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0
.end method

.method protected removeSocketEntry(Lorg/snmp4j/smi/TcpAddress;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM;->sockets:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic sendMessage(Lorg/snmp4j/smi/Address;[BLorg/snmp4j/TransportStateReference;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    check-cast p1, Lorg/snmp4j/smi/TcpAddress;

    invoke-virtual {p0, p1, p2, p3}, Lorg/snmp4j/transport/TLSTM;->sendMessage(Lorg/snmp4j/smi/TcpAddress;[BLorg/snmp4j/TransportStateReference;)V

    return-void
.end method

.method public sendMessage(Lorg/snmp4j/smi/TcpAddress;[BLorg/snmp4j/TransportStateReference;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM;->server:Lorg/snmp4j/util/WorkerTask;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM;->serverThread:Lorg/snmp4j/transport/TLSTM$ServerThread;

    if-nez v0, :cond_2

    .line 3
    :cond_0
    invoke-virtual {p0}, Lorg/snmp4j/transport/TcpTransportMapping;->isOpenSocketOnSending()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {p0}, Lorg/snmp4j/transport/TLSTM;->listen()V

    goto :goto_0

    .line 5
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/snmp4j/transport/TcpTransportMapping;->handleDroppedMessageToSend(Lorg/snmp4j/smi/TcpAddress;[BLorg/snmp4j/TransportStateReference;)V

    .line 6
    :cond_2
    :goto_0
    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM;->serverThread:Lorg/snmp4j/transport/TLSTM$ServerThread;

    if-eqz v0, :cond_4

    .line 7
    iget-object v0, p0, Lorg/snmp4j/transport/TcpTransportMapping;->suspendedAddresses:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    if-lez v0, :cond_3

    iget-object v0, p0, Lorg/snmp4j/transport/TcpTransportMapping;->suspendedAddresses:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 8
    invoke-virtual {p0, p1, p2, p3}, Lorg/snmp4j/transport/TcpTransportMapping;->handleDroppedMessageToSend(Lorg/snmp4j/smi/TcpAddress;[BLorg/snmp4j/TransportStateReference;)V

    goto :goto_1

    .line 9
    :cond_3
    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM;->serverThread:Lorg/snmp4j/transport/TLSTM$ServerThread;

    invoke-virtual {v0, p1, p2, p3}, Lorg/snmp4j/transport/TLSTM$ServerThread;->sendMessage(Lorg/snmp4j/smi/Address;[BLorg/snmp4j/TransportStateReference;)V

    :cond_4
    :goto_1
    return-void
.end method

.method public setConnectionTimeout(J)V
    .locals 0

    iput-wide p1, p0, Lorg/snmp4j/transport/TLSTM;->connectionTimeout:J

    return-void
.end method

.method public setKeyStore(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/transport/TLSTM;->keyStore:Ljava/lang/String;

    return-void
.end method

.method public setKeyStorePassword(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/transport/TLSTM;->keyStorePassword:Ljava/lang/String;

    return-void
.end method

.method public setLocalCertificateAlias(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/transport/TLSTM;->localCertificateAlias:Ljava/lang/String;

    return-void
.end method

.method public setMaxInboundMessageSize(I)V
    .locals 0

    iput p1, p0, Lorg/snmp4j/transport/AbstractTransportMapping;->maxInboundMessageSize:I

    return-void
.end method

.method public setMessageLengthDecoder(Lorg/snmp4j/transport/MessageLengthDecoder;)V
    .locals 0

    return-void
.end method

.method public setSecurityCallback(Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/snmp4j/transport/tls/TlsTmSecurityCallback<",
            "Ljava/security/cert/X509Certificate;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lorg/snmp4j/transport/TLSTM;->securityCallback:Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;

    return-void
.end method

.method public setServerEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/snmp4j/transport/TLSTM;->serverEnabled:Z

    return-void
.end method

.method protected setSocketOptions(Ljava/net/ServerSocket;)V
    .locals 0

    return-void
.end method

.method public setThreadName(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM;->server:Lorg/snmp4j/util/WorkerTask;

    instance-of v1, v0, Ljava/lang/Thread;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Thread;

    invoke-virtual {v0, p1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public setTlsProtocols([Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/transport/TLSTM;->tlsProtocols:[Ljava/lang/String;

    return-void
.end method

.method public setTrustManagerFactory(Lorg/snmp4j/transport/TLSTM$TLSTMTrustManagerFactory;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lorg/snmp4j/transport/TLSTM;->trustManagerFactory:Lorg/snmp4j/transport/TLSTM$TLSTMTrustManagerFactory;

    return-void
.end method

.method public setTrustStore(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/transport/TLSTM;->trustStore:Ljava/lang/String;

    return-void
.end method

.method public setTrustStorePassword(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/transport/TLSTM;->trustStorePassword:Ljava/lang/String;

    return-void
.end method

.method writeNetBuffer(Lorg/snmp4j/transport/TLSTM$SocketEntry;Ljava/nio/channels/SocketChannel;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p1}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$2700(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    :cond_0
    invoke-static {p1}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$2700(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lorg/snmp4j/transport/TLSTM;->logger:Lorg/snmp4j/log/LogAdapter;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Writing TLS outNetBuffer(PAYLOAD): "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$2700(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    invoke-static {p1}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$2700(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/nio/channels/SocketChannel;->write(Ljava/nio/ByteBuffer;)I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Wrote TLS "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " bytes from outNetBuffer(PAYLOAD)"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    const/4 v0, -0x1

    if-eq v1, v0, :cond_1

    if-nez v1, :cond_0

    invoke-static {p1}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$2700(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->compact()Ljava/nio/ByteBuffer;

    return-void

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "TLS connection closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$2700(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    return-void
.end method
