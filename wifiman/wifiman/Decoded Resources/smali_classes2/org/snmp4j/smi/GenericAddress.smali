.class public Lorg/snmp4j/smi/GenericAddress;
.super Lorg/snmp4j/smi/SMIAddress;
.source "SourceFile"


# static fields
.field public static final ADDRESS_TYPES_PROPERTIES:Ljava/lang/String; = "org.snmp4j.addresses"

.field private static final ADDRESS_TYPES_PROPERTIES_DEFAULT:Ljava/lang/String; = "address.properties"

.field public static final TYPE_IP:Ljava/lang/String; = "ip"

.field public static final TYPE_TCP:Ljava/lang/String; = "tcp"

.field public static final TYPE_TLS:Ljava/lang/String; = "tls"

.field public static final TYPE_UDP:Ljava/lang/String; = "udp"

.field private static knownAddressTypes:Ljava/util/Map; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "Lorg/snmp4j/smi/Address;",
            ">;>;"
        }
    .end annotation
.end field

.field private static final logger:Lorg/snmp4j/log/LogAdapter;

.field static final serialVersionUID:J = -0x54b0c534ed992ad7L


# instance fields
.field private address:Lorg/snmp4j/smi/SMIAddress;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lorg/snmp4j/smi/GenericAddress;

    invoke-static {v0}, Lorg/snmp4j/log/LogFactory;->getLogger(Ljava/lang/Class;)Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/smi/GenericAddress;->logger:Lorg/snmp4j/log/LogAdapter;

    const/4 v0, 0x0

    sput-object v0, Lorg/snmp4j/smi/GenericAddress;->knownAddressTypes:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/snmp4j/smi/SMIAddress;-><init>()V

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/smi/SMIAddress;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lorg/snmp4j/smi/SMIAddress;-><init>()V

    .line 3
    iput-object p1, p0, Lorg/snmp4j/smi/GenericAddress;->address:Lorg/snmp4j/smi/SMIAddress;

    return-void
.end method

.method public static getTDomainPrefix(Ljava/lang/Class;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lorg/snmp4j/smi/Address;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    sget-object v0, Lorg/snmp4j/smi/GenericAddress;->knownAddressTypes:Ljava/util/Map;

    if-nez v0, :cond_0

    invoke-static {}, Lorg/snmp4j/smi/GenericAddress;->registerAddressTypes()V

    :cond_0
    sget-object v0, Lorg/snmp4j/smi/GenericAddress;->knownAddressTypes:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Class;

    invoke-virtual {v2, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static parse(Ljava/lang/String;)Lorg/snmp4j/smi/Address;
    .locals 3

    sget-object v0, Lorg/snmp4j/smi/GenericAddress;->knownAddressTypes:Ljava/util/Map;

    if-nez v0, :cond_0

    invoke-static {}, Lorg/snmp4j/smi/GenericAddress;->registerAddressTypes()V

    :cond_0
    const/16 v0, 0x3a

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-lez v0, :cond_1

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_1
    const-string v1, "udp"

    :goto_0
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lorg/snmp4j/smi/GenericAddress;->knownAddressTypes:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    if-eqz v1, :cond_3

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/snmp4j/smi/Address;

    invoke-interface {v1, p0}, Lorg/snmp4j/smi/Address;->parseAddress(Ljava/lang/String;)Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p0, :cond_2

    return-object v1

    :cond_2
    return-object v0

    :catch_0
    move-exception p0

    sget-object v1, Lorg/snmp4j/smi/GenericAddress;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v1, p0}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    return-object v0

    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Address type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " unknown"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static declared-synchronized registerAddressTypes()V
    .locals 10

    const-class v0, Lorg/snmp4j/smi/GenericAddress;

    monitor-enter v0

    :try_start_0
    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->isExtensibilityEnabled()Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "org.snmp4j.addresses"

    const-string v2, "address.properties"

    invoke-static {v1, v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lorg/snmp4j/smi/Variable;

    invoke-virtual {v2, v1}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v2

    if-eqz v2, :cond_1

    new-instance v3, Ljava/util/Properties;

    invoke-direct {v3}, Ljava/util/Properties;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {v3, v2}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V

    new-instance v4, Ljava/util/TreeMap;

    invoke-direct {v4}, Ljava/util/TreeMap;-><init>()V

    invoke-virtual {v3}, Ljava/util/Properties;->propertyNames()Ljava/util/Enumeration;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v5}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    invoke-interface {v4, v6, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/ClassCastException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_3

    :catch_0
    move-exception v3

    goto :goto_2

    :catch_1
    move-exception v6

    goto :goto_1

    :catch_2
    :try_start_3
    sget-object v6, Lorg/snmp4j/smi/GenericAddress;->logger:Lorg/snmp4j/log/LogAdapter;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Class name \'"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "\' is not a subclass of "

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v7, Lorg/snmp4j/smi/Address;

    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v6, v7}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    goto :goto_0

    :goto_1
    sget-object v7, Lorg/snmp4j/smi/GenericAddress;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v7, v6}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    goto :goto_0

    :cond_0
    sput-object v4, Lorg/snmp4j/smi/GenericAddress;->knownAddressTypes:Ljava/util/Map;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto/16 :goto_5

    :catchall_1
    move-exception v1

    goto/16 :goto_6

    :catch_3
    move-exception v1

    :try_start_5
    sget-object v2, Lorg/snmp4j/smi/GenericAddress;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v2, v1}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_5

    :goto_2
    :try_start_6
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Could not read \'"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\': "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lorg/snmp4j/smi/GenericAddress;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v3, v1}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    new-instance v3, Ljava/lang/InternalError;

    invoke-direct {v3, v1}, Ljava/lang/InternalError;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :goto_3
    :try_start_7
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_4
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    goto :goto_4

    :catch_4
    move-exception v2

    :try_start_8
    sget-object v3, Lorg/snmp4j/smi/GenericAddress;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v3, v2}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    :goto_4
    throw v1

    :cond_1
    new-instance v2, Ljava/lang/InternalError;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Could not read \'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\' from classpath!"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/InternalError;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_2
    new-instance v1, Ljava/util/TreeMap;

    invoke-direct {v1}, Ljava/util/TreeMap;-><init>()V

    const-string v2, "udp"

    const-class v3, Lorg/snmp4j/smi/UdpAddress;

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "tcp"

    const-class v3, Lorg/snmp4j/smi/TcpAddress;

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "ip"

    const-class v3, Lorg/snmp4j/smi/IpAddress;

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "tls"

    const-class v3, Lorg/snmp4j/smi/TlsAddress;

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sput-object v1, Lorg/snmp4j/smi/GenericAddress;->knownAddressTypes:Ljava/util/Map;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :goto_5
    monitor-exit v0

    return-void

    :goto_6
    :try_start_9
    monitor-exit v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    throw v1
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lorg/snmp4j/smi/GenericAddress;

    iget-object v1, p0, Lorg/snmp4j/smi/GenericAddress;->address:Lorg/snmp4j/smi/SMIAddress;

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/GenericAddress;-><init>(Lorg/snmp4j/smi/SMIAddress;)V

    return-object v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lorg/snmp4j/smi/Variable;

    invoke-virtual {p0, p1}, Lorg/snmp4j/smi/GenericAddress;->compareTo(Lorg/snmp4j/smi/Variable;)I

    move-result p1

    return p1
.end method

.method public compareTo(Lorg/snmp4j/smi/Variable;)I
    .locals 1

    .line 2
    iget-object v0, p0, Lorg/snmp4j/smi/GenericAddress;->address:Lorg/snmp4j/smi/SMIAddress;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/AbstractVariable;->compareTo(Lorg/snmp4j/smi/Variable;)I

    move-result p1

    return p1
.end method

.method public decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public encodeBER(Ljava/io/OutputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lorg/snmp4j/smi/GenericAddress;->address:Lorg/snmp4j/smi/SMIAddress;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/AbstractVariable;->encodeBER(Ljava/io/OutputStream;)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/smi/GenericAddress;->address:Lorg/snmp4j/smi/SMIAddress;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/AbstractVariable;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public fromSubIndex(Lorg/snmp4j/smi/OID;Z)V
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public getAddress()Lorg/snmp4j/smi/Address;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/smi/GenericAddress;->address:Lorg/snmp4j/smi/SMIAddress;

    return-object v0
.end method

.method public getBERLength()I
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/smi/GenericAddress;->address:Lorg/snmp4j/smi/SMIAddress;

    invoke-virtual {v0}, Lorg/snmp4j/smi/AbstractVariable;->getBERLength()I

    move-result v0

    return v0
.end method

.method public getSyntax()I
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/smi/GenericAddress;->address:Lorg/snmp4j/smi/SMIAddress;

    invoke-virtual {v0}, Lorg/snmp4j/smi/AbstractVariable;->getSyntax()I

    move-result v0

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/smi/GenericAddress;->address:Lorg/snmp4j/smi/SMIAddress;

    invoke-virtual {v0}, Lorg/snmp4j/smi/AbstractVariable;->hashCode()I

    move-result v0

    return v0
.end method

.method public isValid()Z
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/smi/GenericAddress;->address:Lorg/snmp4j/smi/SMIAddress;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lorg/snmp4j/smi/Address;->isValid()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public parseAddress(Ljava/lang/String;)Z
    .locals 1

    invoke-static {p1}, Lorg/snmp4j/smi/GenericAddress;->parse(Ljava/lang/String;)Lorg/snmp4j/smi/Address;

    move-result-object p1

    instance-of v0, p1, Lorg/snmp4j/smi/SMIAddress;

    if-eqz v0, :cond_0

    check-cast p1, Lorg/snmp4j/smi/SMIAddress;

    invoke-virtual {p0, p1}, Lorg/snmp4j/smi/GenericAddress;->setAddress(Lorg/snmp4j/smi/SMIAddress;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public setAddress(Lorg/snmp4j/smi/SMIAddress;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/smi/GenericAddress;->address:Lorg/snmp4j/smi/SMIAddress;

    return-void
.end method

.method public setValue(Ljava/lang/String;)V
    .locals 2

    .line 2
    invoke-virtual {p0, p1}, Lorg/snmp4j/smi/GenericAddress;->parseAddress(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " cannot be parsed by "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public setValue([B)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/snmp4j/smi/GenericAddress;->address:Lorg/snmp4j/smi/SMIAddress;

    invoke-interface {v0, p1}, Lorg/snmp4j/smi/AssignableFromByteArray;->setValue([B)V

    return-void
.end method

.method public toByteArray()[B
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/smi/GenericAddress;->address:Lorg/snmp4j/smi/SMIAddress;

    invoke-interface {v0}, Lorg/snmp4j/smi/AssignableFromByteArray;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method

.method public toInt()I
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public toLong()J
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/smi/GenericAddress;->address:Lorg/snmp4j/smi/SMIAddress;

    invoke-virtual {v0}, Lorg/snmp4j/smi/AbstractVariable;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toSubIndex(Z)Lorg/snmp4j/smi/OID;
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method
