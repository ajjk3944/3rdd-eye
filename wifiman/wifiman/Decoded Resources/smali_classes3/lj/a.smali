.class public Llj/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final d:[Ljava/lang/String;

.field private static final e:[B


# instance fields
.field private a:Ljava/util/Hashtable;

.field private b:Ljava/util/Properties;

.field private c:Lorg/eclipse/paho/client/mqttv3/logging/a;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    const-string/jumbo v12, "com.ibm.ssl.enabledCipherSuites"

    const-string/jumbo v13, "com.ibm.ssl.clientAuthentication"

    const-string/jumbo v0, "com.ibm.ssl.protocol"

    const-string/jumbo v1, "com.ibm.ssl.contextProvider"

    const-string/jumbo v2, "com.ibm.ssl.keyStore"

    const-string/jumbo v3, "com.ibm.ssl.keyStorePassword"

    const-string/jumbo v4, "com.ibm.ssl.keyStoreType"

    const-string/jumbo v5, "com.ibm.ssl.keyStoreProvider"

    const-string/jumbo v6, "com.ibm.ssl.keyManager"

    const-string/jumbo v7, "com.ibm.ssl.trustStore"

    const-string/jumbo v8, "com.ibm.ssl.trustStorePassword"

    const-string/jumbo v9, "com.ibm.ssl.trustStoreType"

    const-string/jumbo v10, "com.ibm.ssl.trustStoreProvider"

    const-string/jumbo v11, "com.ibm.ssl.trustManager"

    filled-new-array/range {v0 .. v13}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Llj/a;->d:[Ljava/lang/String;

    const/16 v0, 0x8

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Llj/a;->e:[B

    return-void

    :array_0
    .array-data 1
        -0x63t
        -0x59t
        -0x27t
        -0x80t
        0x5t
        -0x48t
        -0x77t
        -0x64t
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Llj/a;->c:Lorg/eclipse/paho/client/mqttv3/logging/a;

    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Llj/a;->a:Ljava/util/Hashtable;

    return-void
.end method

.method private a(Ljava/util/Properties;)V
    .locals 2

    invoke-virtual {p1}, Ljava/util/Properties;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Llj/a;->u(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v0, " is not a valid IBM SSL property key."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private b(Ljava/util/Properties;)V
    .locals 4

    const-string/jumbo v0, "com.ibm.ssl.keyStorePassword"

    invoke-virtual {p1, v0}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "{xor}"

    if-eqz v1, :cond_0

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v1

    invoke-static {v1}, Llj/a;->v([C)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/util/Properties;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    const-string/jumbo v0, "com.ibm.ssl.trustStorePassword"

    invoke-virtual {p1, v0}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v1

    invoke-static {v1}, Llj/a;->v([C)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/util/Properties;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public static d(Ljava/lang/String;)[C
    .locals 4

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    const/4 v1, 0x5

    :try_start_0
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Llj/b;->a(Ljava/lang/String;)[B

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x0

    :goto_0
    array-length v1, p0

    if-lt v0, v1, :cond_1

    invoke-static {p0}, Llj/a;->x([B)[C

    move-result-object p0

    return-object p0

    :cond_1
    aget-byte v1, p0, v0

    sget-object v2, Llj/a;->e:[B

    array-length v3, v2

    rem-int v3, v0, v3

    aget-byte v2, v2, v3

    xor-int/2addr v1, v2

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catch_0
    return-object v0
.end method

.method private k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1, p2}, Llj/a;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    if-eqz p3, :cond_1

    invoke-static {p3}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method private l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object v1, p0, Llj/a;->a:Ljava/util/Hashtable;

    invoke-virtual {v1, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Properties;

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1, p2}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    iget-object p1, p0, Llj/a;->b:Ljava/util/Properties;

    if-eqz p1, :cond_2

    invoke-virtual {p1, p2}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    :cond_2
    return-object v0
.end method

.method private m(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;
    .locals 13

    const-string/jumbo v0, "com.ibm.ssl.keyStore"

    invoke-virtual {p0, p1}, Llj/a;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-string/jumbo v1, "TLS"

    :cond_0
    iget-object v2, p0, Llj/a;->c:Lorg/eclipse/paho/client/mqttv3/logging/a;

    const-string/jumbo v3, "null (broker defaults)"

    const-string/jumbo v4, "getSSLContext"

    const-string/jumbo v5, "org.eclipse.paho.client.mqttv3.internal.security.SSLSocketFactoryFactory"

    if-eqz v2, :cond_2

    if-eqz p1, :cond_1

    move-object v6, p1

    goto :goto_0

    :cond_1
    move-object v6, v3

    :goto_0
    filled-new-array {v6, v1}, [Ljava/lang/Object;

    move-result-object v6

    const-string v7, "12000"

    invoke-interface {v2, v5, v4, v7, v6}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    invoke-virtual {p0, p1}, Llj/a;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_3

    :try_start_0
    invoke-static {v1}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    move-result-object v1

    goto :goto_1

    :catch_0
    move-exception p1

    goto/16 :goto_1f

    :catch_1
    move-exception p1

    goto/16 :goto_20

    :catch_2
    move-exception p1

    goto/16 :goto_21

    :cond_3
    invoke-static {v1, v2}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    move-result-object v1

    :goto_1
    iget-object v2, p0, Llj/a;->c:Lorg/eclipse/paho/client/mqttv3/logging/a;

    if-eqz v2, :cond_5

    const-string v6, "12001"

    if-eqz p1, :cond_4

    move-object v7, p1

    goto :goto_2

    :cond_4
    move-object v7, v3

    :goto_2
    invoke-virtual {v1}, Ljavax/net/ssl/SSLContext;->getProvider()Ljava/security/Provider;

    move-result-object v8

    invoke-virtual {v8}, Ljava/security/Provider;->getName()Ljava/lang/String;

    move-result-object v8

    filled-new-array {v7, v8}, [Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v2, v5, v4, v6, v7}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_5
    const/4 v2, 0x0

    invoke-direct {p0, p1, v0, v2}, Llj/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_6

    const-string/jumbo v6, "javax.net.ssl.keyStore"

    invoke-direct {p0, p1, v0, v6}, Llj/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    :cond_6
    iget-object v0, p0, Llj/a;->c:Lorg/eclipse/paho/client/mqttv3/logging/a;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/NoSuchProviderException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/KeyManagementException; {:try_start_0 .. :try_end_0} :catch_0

    const-string/jumbo v7, "null"

    if-eqz v0, :cond_9

    :try_start_1
    const-string v8, "12004"

    if-eqz p1, :cond_7

    move-object v9, p1

    goto :goto_3

    :cond_7
    move-object v9, v3

    :goto_3
    if-eqz v6, :cond_8

    move-object v10, v6

    goto :goto_4

    :cond_8
    move-object v10, v7

    :goto_4
    filled-new-array {v9, v10}, [Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v0, v5, v4, v8, v9}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_9
    invoke-virtual {p0, p1}, Llj/a;->h(Ljava/lang/String;)[C

    move-result-object v0

    iget-object v8, p0, Llj/a;->c:Lorg/eclipse/paho/client/mqttv3/logging/a;

    if-eqz v8, :cond_c

    const-string v9, "12005"

    if-eqz p1, :cond_a

    move-object v10, p1

    goto :goto_5

    :cond_a
    move-object v10, v3

    :goto_5
    if-eqz v0, :cond_b

    invoke-static {v0}, Llj/a;->v([C)Ljava/lang/String;

    move-result-object v11

    goto :goto_6

    :cond_b
    move-object v11, v7

    :goto_6
    filled-new-array {v10, v11}, [Ljava/lang/Object;

    move-result-object v10

    invoke-interface {v8, v5, v4, v9, v10}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_c
    invoke-virtual {p0, p1}, Llj/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_d

    invoke-static {}, Ljava/security/KeyStore;->getDefaultType()Ljava/lang/String;

    move-result-object v8

    :cond_d
    iget-object v9, p0, Llj/a;->c:Lorg/eclipse/paho/client/mqttv3/logging/a;

    if-eqz v9, :cond_10

    const-string v10, "12006"

    if-eqz p1, :cond_e

    move-object v11, p1

    goto :goto_7

    :cond_e
    move-object v11, v3

    :goto_7
    if-eqz v8, :cond_f

    move-object v12, v8

    goto :goto_8

    :cond_f
    move-object v12, v7

    :goto_8
    filled-new-array {v11, v12}, [Ljava/lang/Object;

    move-result-object v11

    invoke-interface {v9, v5, v4, v10, v11}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_10
    invoke-static {}, Ljavax/net/ssl/KeyManagerFactory;->getDefaultAlgorithm()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p0, p1}, Llj/a;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {p0, p1}, Llj/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11
    :try_end_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/security/NoSuchProviderException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/security/KeyManagementException; {:try_start_1 .. :try_end_1} :catch_0

    if-eqz v11, :cond_11

    move-object v9, v11

    :cond_11
    if-eqz v6, :cond_16

    if-eqz v8, :cond_16

    if-eqz v9, :cond_16

    :try_start_2
    invoke-static {v8}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    move-result-object v8

    new-instance v11, Ljava/io/FileInputStream;

    invoke-direct {v11, v6}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v11, v0}, Ljava/security/KeyStore;->load(Ljava/io/InputStream;[C)V

    if-eqz v10, :cond_12

    invoke-static {v9, v10}, Ljavax/net/ssl/KeyManagerFactory;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljavax/net/ssl/KeyManagerFactory;

    move-result-object v6

    goto :goto_9

    :catch_3
    move-exception p1

    goto :goto_c

    :catch_4
    move-exception p1

    goto :goto_d

    :catch_5
    move-exception p1

    goto :goto_e

    :catch_6
    move-exception p1

    goto :goto_f

    :catch_7
    move-exception p1

    goto :goto_10

    :cond_12
    invoke-static {v9}, Ljavax/net/ssl/KeyManagerFactory;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/KeyManagerFactory;

    move-result-object v6

    :goto_9
    iget-object v10, p0, Llj/a;->c:Lorg/eclipse/paho/client/mqttv3/logging/a;

    if-eqz v10, :cond_15

    const-string v11, "12010"

    if-eqz p1, :cond_13

    move-object v12, p1

    goto :goto_a

    :cond_13
    move-object v12, v3

    :goto_a
    filled-new-array {v12, v9}, [Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v10, v5, v4, v11, v9}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v9, p0, Llj/a;->c:Lorg/eclipse/paho/client/mqttv3/logging/a;

    const-string v10, "12009"

    if-eqz p1, :cond_14

    move-object v11, p1

    goto :goto_b

    :cond_14
    move-object v11, v3

    :goto_b
    invoke-virtual {v6}, Ljavax/net/ssl/KeyManagerFactory;->getProvider()Ljava/security/Provider;

    move-result-object v12

    invoke-virtual {v12}, Ljava/security/Provider;->getName()Ljava/lang/String;

    move-result-object v12

    filled-new-array {v11, v12}, [Ljava/lang/Object;

    move-result-object v11

    invoke-interface {v9, v5, v4, v10, v11}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_15
    invoke-virtual {v6, v8, v0}, Ljavax/net/ssl/KeyManagerFactory;->init(Ljava/security/KeyStore;[C)V

    invoke-virtual {v6}, Ljavax/net/ssl/KeyManagerFactory;->getKeyManagers()[Ljavax/net/ssl/KeyManager;

    move-result-object v0
    :try_end_2
    .catch Ljava/security/KeyStoreException; {:try_start_2 .. :try_end_2} :catch_7
    .catch Ljava/security/cert/CertificateException; {:try_start_2 .. :try_end_2} :catch_6
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/security/UnrecoverableKeyException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/security/NoSuchProviderException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/security/KeyManagementException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_11

    :goto_c
    :try_start_3
    new-instance v0, Lorg/eclipse/paho/client/mqttv3/MqttSecurityException;

    invoke-direct {v0, p1}, Lorg/eclipse/paho/client/mqttv3/MqttSecurityException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :goto_d
    new-instance v0, Lorg/eclipse/paho/client/mqttv3/MqttSecurityException;

    invoke-direct {v0, p1}, Lorg/eclipse/paho/client/mqttv3/MqttSecurityException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :goto_e
    new-instance v0, Lorg/eclipse/paho/client/mqttv3/MqttSecurityException;

    invoke-direct {v0, p1}, Lorg/eclipse/paho/client/mqttv3/MqttSecurityException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :goto_f
    new-instance v0, Lorg/eclipse/paho/client/mqttv3/MqttSecurityException;

    invoke-direct {v0, p1}, Lorg/eclipse/paho/client/mqttv3/MqttSecurityException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :goto_10
    new-instance v0, Lorg/eclipse/paho/client/mqttv3/MqttSecurityException;

    invoke-direct {v0, p1}, Lorg/eclipse/paho/client/mqttv3/MqttSecurityException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_16
    move-object v0, v2

    :goto_11
    invoke-virtual {p0, p1}, Llj/a;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iget-object v8, p0, Llj/a;->c:Lorg/eclipse/paho/client/mqttv3/logging/a;

    if-eqz v8, :cond_19

    const-string v9, "12011"

    if-eqz p1, :cond_17

    move-object v10, p1

    goto :goto_12

    :cond_17
    move-object v10, v3

    :goto_12
    if-eqz v6, :cond_18

    move-object v11, v6

    goto :goto_13

    :cond_18
    move-object v11, v7

    :goto_13
    filled-new-array {v10, v11}, [Ljava/lang/Object;

    move-result-object v10

    invoke-interface {v8, v5, v4, v9, v10}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_19
    invoke-virtual {p0, p1}, Llj/a;->q(Ljava/lang/String;)[C

    move-result-object v8

    iget-object v9, p0, Llj/a;->c:Lorg/eclipse/paho/client/mqttv3/logging/a;

    if-eqz v9, :cond_1c

    const-string v10, "12012"

    if-eqz p1, :cond_1a

    move-object v11, p1

    goto :goto_14

    :cond_1a
    move-object v11, v3

    :goto_14
    if-eqz v8, :cond_1b

    invoke-static {v8}, Llj/a;->v([C)Ljava/lang/String;

    move-result-object v12

    goto :goto_15

    :cond_1b
    move-object v12, v7

    :goto_15
    filled-new-array {v11, v12}, [Ljava/lang/Object;

    move-result-object v11

    invoke-interface {v9, v5, v4, v10, v11}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1c
    invoke-virtual {p0, p1}, Llj/a;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_1d

    invoke-static {}, Ljava/security/KeyStore;->getDefaultType()Ljava/lang/String;

    move-result-object v9

    :cond_1d
    iget-object v10, p0, Llj/a;->c:Lorg/eclipse/paho/client/mqttv3/logging/a;

    if-eqz v10, :cond_20

    const-string v11, "12013"

    if-eqz p1, :cond_1e

    move-object v12, p1

    goto :goto_16

    :cond_1e
    move-object v12, v3

    :goto_16
    if-eqz v9, :cond_1f

    move-object v7, v9

    :cond_1f
    filled-new-array {v12, v7}, [Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v10, v5, v4, v11, v7}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_20
    invoke-static {}, Ljavax/net/ssl/TrustManagerFactory;->getDefaultAlgorithm()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0, p1}, Llj/a;->r(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {p0, p1}, Llj/a;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11
    :try_end_3
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/security/NoSuchProviderException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/security/KeyManagementException; {:try_start_3 .. :try_end_3} :catch_0

    if-eqz v11, :cond_21

    move-object v7, v11

    :cond_21
    if-eqz v6, :cond_26

    if-eqz v9, :cond_26

    if-eqz v7, :cond_26

    :try_start_4
    invoke-static {v9}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    move-result-object v9

    new-instance v11, Ljava/io/FileInputStream;

    invoke-direct {v11, v6}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v11, v8}, Ljava/security/KeyStore;->load(Ljava/io/InputStream;[C)V

    if-eqz v10, :cond_22

    invoke-static {v7, v10}, Ljavax/net/ssl/TrustManagerFactory;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljavax/net/ssl/TrustManagerFactory;

    move-result-object v6

    goto :goto_17

    :catch_8
    move-exception p1

    goto :goto_1a

    :catch_9
    move-exception p1

    goto :goto_1b

    :catch_a
    move-exception p1

    goto :goto_1c

    :catch_b
    move-exception p1

    goto :goto_1d

    :cond_22
    invoke-static {v7}, Ljavax/net/ssl/TrustManagerFactory;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/TrustManagerFactory;

    move-result-object v6

    :goto_17
    iget-object v8, p0, Llj/a;->c:Lorg/eclipse/paho/client/mqttv3/logging/a;

    if-eqz v8, :cond_25

    const-string v10, "12017"

    if-eqz p1, :cond_23

    move-object v11, p1

    goto :goto_18

    :cond_23
    move-object v11, v3

    :goto_18
    filled-new-array {v11, v7}, [Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v8, v5, v4, v10, v7}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v7, p0, Llj/a;->c:Lorg/eclipse/paho/client/mqttv3/logging/a;

    const-string v8, "12016"

    if-eqz p1, :cond_24

    goto :goto_19

    :cond_24
    move-object p1, v3

    :goto_19
    invoke-virtual {v6}, Ljavax/net/ssl/TrustManagerFactory;->getProvider()Ljava/security/Provider;

    move-result-object v3

    invoke-virtual {v3}, Ljava/security/Provider;->getName()Ljava/lang/String;

    move-result-object v3

    filled-new-array {p1, v3}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v7, v5, v4, v8, p1}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_25
    invoke-virtual {v6, v9}, Ljavax/net/ssl/TrustManagerFactory;->init(Ljava/security/KeyStore;)V

    invoke-virtual {v6}, Ljavax/net/ssl/TrustManagerFactory;->getTrustManagers()[Ljavax/net/ssl/TrustManager;

    move-result-object p1
    :try_end_4
    .catch Ljava/security/KeyStoreException; {:try_start_4 .. :try_end_4} :catch_b
    .catch Ljava/security/cert/CertificateException; {:try_start_4 .. :try_end_4} :catch_a
    .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_9
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_8
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/security/NoSuchProviderException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/security/KeyManagementException; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_1e

    :goto_1a
    :try_start_5
    new-instance v0, Lorg/eclipse/paho/client/mqttv3/MqttSecurityException;

    invoke-direct {v0, p1}, Lorg/eclipse/paho/client/mqttv3/MqttSecurityException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :goto_1b
    new-instance v0, Lorg/eclipse/paho/client/mqttv3/MqttSecurityException;

    invoke-direct {v0, p1}, Lorg/eclipse/paho/client/mqttv3/MqttSecurityException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :goto_1c
    new-instance v0, Lorg/eclipse/paho/client/mqttv3/MqttSecurityException;

    invoke-direct {v0, p1}, Lorg/eclipse/paho/client/mqttv3/MqttSecurityException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :goto_1d
    new-instance v0, Lorg/eclipse/paho/client/mqttv3/MqttSecurityException;

    invoke-direct {v0, p1}, Lorg/eclipse/paho/client/mqttv3/MqttSecurityException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_26
    move-object p1, v2

    :goto_1e
    invoke-virtual {v1, v0, p1, v2}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V
    :try_end_5
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/security/NoSuchProviderException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/security/KeyManagementException; {:try_start_5 .. :try_end_5} :catch_0

    return-object v1

    :goto_1f
    new-instance v0, Lorg/eclipse/paho/client/mqttv3/MqttSecurityException;

    invoke-direct {v0, p1}, Lorg/eclipse/paho/client/mqttv3/MqttSecurityException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :goto_20
    new-instance v0, Lorg/eclipse/paho/client/mqttv3/MqttSecurityException;

    invoke-direct {v0, p1}, Lorg/eclipse/paho/client/mqttv3/MqttSecurityException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :goto_21
    new-instance v0, Lorg/eclipse/paho/client/mqttv3/MqttSecurityException;

    invoke-direct {v0, p1}, Lorg/eclipse/paho/client/mqttv3/MqttSecurityException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method private u(Ljava/lang/String;)Z
    .locals 4

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    sget-object v2, Llj/a;->d:[Ljava/lang/String;

    array-length v3, v2

    if-lt v1, v3, :cond_0

    goto :goto_1

    :cond_0
    aget-object v3, v2, v1

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    :goto_1
    array-length p1, v2

    if-ge v1, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v0

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

.method public static v([C)Ljava/lang/String;
    .locals 4

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-static {p0}, Llj/a;->w([C)[B

    move-result-object p0

    const/4 v0, 0x0

    :goto_0
    array-length v1, p0

    if-lt v0, v1, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v1, "{xor}"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance v1, Ljava/lang/String;

    invoke-static {p0}, Llj/b;->b([B)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    aget-byte v1, p0, v0

    sget-object v2, Llj/a;->e:[B

    array-length v3, v2

    rem-int v3, v0, v3

    aget-byte v2, v2, v3

    xor-int/2addr v1, v2

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public static w([C)[B
    .locals 6

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    array-length v0, p0

    mul-int/lit8 v0, v0, 0x2

    new-array v0, v0, [B

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    array-length v3, p0

    if-lt v1, v3, :cond_1

    return-object v0

    :cond_1
    add-int/lit8 v3, v2, 0x1

    aget-char v4, p0, v1

    and-int/lit16 v5, v4, 0xff

    int-to-byte v5, v5

    aput-byte v5, v0, v2

    add-int/lit8 v2, v2, 0x2

    add-int/lit8 v1, v1, 0x1

    shr-int/lit8 v4, v4, 0x8

    and-int/lit16 v4, v4, 0xff

    int-to-byte v4, v4

    aput-byte v4, v0, v3

    goto :goto_0
.end method

.method public static x([B)[C
    .locals 6

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    array-length v0, p0

    div-int/lit8 v0, v0, 0x2

    new-array v0, v0, [C

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    array-length v3, p0

    if-lt v1, v3, :cond_1

    return-object v0

    :cond_1
    add-int/lit8 v3, v2, 0x1

    add-int/lit8 v4, v1, 0x1

    aget-byte v5, p0, v1

    and-int/lit16 v5, v5, 0xff

    add-int/lit8 v1, v1, 0x2

    aget-byte v4, p0, v4

    and-int/lit16 v4, v4, 0xff

    shl-int/lit8 v4, v4, 0x8

    add-int/2addr v5, v4

    int-to-char v4, v5

    aput-char v4, v0, v2

    move v2, v3

    goto :goto_0
.end method

.method public static y(Ljava/lang/String;)[Ljava/lang/String;
    .locals 5

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    const/16 v1, 0x2c

    invoke-virtual {p0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    const/4 v4, -0x1

    if-gt v2, v4, :cond_1

    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result p0

    new-array p0, p0, [Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/util/Vector;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    return-object p0

    :cond_1
    invoke-virtual {p0, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v2, 0x1

    invoke-virtual {p0, v1, v3}, Ljava/lang/String;->indexOf(II)I

    move-result v2

    goto :goto_0
.end method


# virtual methods
.method public c(Ljava/lang/String;)Ljavax/net/ssl/SSLSocketFactory;
    .locals 5

    invoke-direct {p0, p1}, Llj/a;->m(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    move-result-object v0

    iget-object v1, p0, Llj/a;->c:Lorg/eclipse/paho/client/mqttv3/logging/a;

    if-eqz v1, :cond_2

    if-eqz p1, :cond_0

    move-object v2, p1

    goto :goto_0

    :cond_0
    const-string/jumbo v2, "null (broker defaults)"

    :goto_0
    invoke-virtual {p0, p1}, Llj/a;->e(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    const-string/jumbo v3, "com.ibm.ssl.enabledCipherSuites"

    const/4 v4, 0x0

    invoke-direct {p0, p1, v3, v4}, Llj/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_1
    const-string/jumbo p1, "null (using platform-enabled cipher suites)"

    :goto_1
    filled-new-array {v2, p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string/jumbo v2, "org.eclipse.paho.client.mqttv3.internal.security.SSLSocketFactoryFactory"

    const-string/jumbo v3, "createSocketFactory"

    const-string v4, "12020"

    invoke-interface {v1, v2, v3, v4, p1}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object p1

    return-object p1
.end method

.method public e(Ljava/lang/String;)[Ljava/lang/String;
    .locals 2

    const-string/jumbo v0, "com.ibm.ssl.enabledCipherSuites"

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Llj/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Llj/a;->y(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public f(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string/jumbo v0, "com.ibm.ssl.contextProvider"

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Llj/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public g(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string/jumbo v0, "com.ibm.ssl.keyManager"

    const-string/jumbo v1, "ssl.KeyManagerFactory.algorithm"

    invoke-direct {p0, p1, v0, v1}, Llj/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public h(Ljava/lang/String;)[C
    .locals 2

    const-string/jumbo v0, "com.ibm.ssl.keyStorePassword"

    const-string/jumbo v1, "javax.net.ssl.keyStorePassword"

    invoke-direct {p0, p1, v0, v1}, Llj/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string/jumbo v0, "{xor}"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Llj/a;->d(Ljava/lang/String;)[C

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public i(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string/jumbo v0, "com.ibm.ssl.keyStoreProvider"

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Llj/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public j(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string/jumbo v0, "com.ibm.ssl.keyStoreType"

    const-string/jumbo v1, "javax.net.ssl.keyStoreType"

    invoke-direct {p0, p1, v0, v1}, Llj/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public n(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string/jumbo v0, "com.ibm.ssl.protocol"

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Llj/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public o(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string/jumbo v0, "com.ibm.ssl.trustManager"

    const-string/jumbo v1, "ssl.TrustManagerFactory.algorithm"

    invoke-direct {p0, p1, v0, v1}, Llj/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public p(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string/jumbo v0, "com.ibm.ssl.trustStore"

    const-string/jumbo v1, "javax.net.ssl.trustStore"

    invoke-direct {p0, p1, v0, v1}, Llj/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :try_start_0
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object p1
.end method

.method public q(Ljava/lang/String;)[C
    .locals 2

    const-string/jumbo v0, "com.ibm.ssl.trustStorePassword"

    const-string/jumbo v1, "javax.net.ssl.trustStorePassword"

    invoke-direct {p0, p1, v0, v1}, Llj/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string/jumbo v0, "{xor}"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Llj/a;->d(Ljava/lang/String;)[C

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public r(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string/jumbo v0, "com.ibm.ssl.trustStoreProvider"

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Llj/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public s(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string/jumbo v0, "com.ibm.ssl.trustStoreType"

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Llj/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public t(Ljava/util/Properties;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0, p1}, Llj/a;->a(Ljava/util/Properties;)V

    new-instance v0, Ljava/util/Properties;

    invoke-direct {v0}, Ljava/util/Properties;-><init>()V

    invoke-virtual {v0, p1}, Ljava/util/Properties;->putAll(Ljava/util/Map;)V

    invoke-direct {p0, v0}, Llj/a;->b(Ljava/util/Properties;)V

    if-eqz p2, :cond_0

    iget-object p1, p0, Llj/a;->a:Ljava/util/Hashtable;

    invoke-virtual {p1, p2, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iput-object v0, p0, Llj/a;->b:Ljava/util/Properties;

    :goto_0
    return-void
.end method
