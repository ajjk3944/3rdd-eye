.class public Lorg/snmp4j/security/SecurityProtocols;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/snmp4j/security/SecurityProtocols$SecurityProtocolType;
    }
.end annotation


# static fields
.field public static final SECURITY_PROTOCOLS_PROPERTIES:Ljava/lang/String; = "org.snmp4j.securityProtocols"

.field private static final SECURITY_PROTOCOLS_PROPERTIES_DEFAULT:Ljava/lang/String; = "SecurityProtocols.properties"

.field private static instance:Lorg/snmp4j/security/SecurityProtocols; = null

.field private static final logger:Lorg/snmp4j/log/LogAdapter;

.field private static final serialVersionUID:J = 0x34bdffc9309c747cL


# instance fields
.field private authProtocols:Ljava/util/Hashtable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Hashtable<",
            "Lorg/snmp4j/smi/OID;",
            "Lorg/snmp4j/security/AuthenticationProtocol;",
            ">;"
        }
    .end annotation
.end field

.field private maxAuthDigestLength:I

.field private maxPrivDecryptParamsLength:I

.field private privProtocols:Ljava/util/Hashtable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Hashtable<",
            "Lorg/snmp4j/smi/OID;",
            "Lorg/snmp4j/security/PrivacyProtocol;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lorg/snmp4j/security/SecurityProtocols;

    invoke-static {v0}, Lorg/snmp4j/log/LogFactory;->getLogger(Ljava/lang/Class;)Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/security/SecurityProtocols;->logger:Lorg/snmp4j/log/LogAdapter;

    const/4 v0, 0x0

    sput-object v0, Lorg/snmp4j/security/SecurityProtocols;->instance:Lorg/snmp4j/security/SecurityProtocols;

    return-void
.end method

.method protected constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lorg/snmp4j/security/SecurityProtocols;->maxAuthDigestLength:I

    iput v0, p0, Lorg/snmp4j/security/SecurityProtocols;->maxPrivDecryptParamsLength:I

    new-instance v0, Ljava/util/Hashtable;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ljava/util/Hashtable;-><init>(I)V

    iput-object v0, p0, Lorg/snmp4j/security/SecurityProtocols;->authProtocols:Ljava/util/Hashtable;

    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0, v1}, Ljava/util/Hashtable;-><init>(I)V

    iput-object v0, p0, Lorg/snmp4j/security/SecurityProtocols;->privProtocols:Ljava/util/Hashtable;

    return-void
.end method

.method public static getInstance()Lorg/snmp4j/security/SecurityProtocols;
    .locals 1

    sget-object v0, Lorg/snmp4j/security/SecurityProtocols;->instance:Lorg/snmp4j/security/SecurityProtocols;

    if-nez v0, :cond_0

    new-instance v0, Lorg/snmp4j/security/SecurityProtocols;

    invoke-direct {v0}, Lorg/snmp4j/security/SecurityProtocols;-><init>()V

    sput-object v0, Lorg/snmp4j/security/SecurityProtocols;->instance:Lorg/snmp4j/security/SecurityProtocols;

    :cond_0
    sget-object v0, Lorg/snmp4j/security/SecurityProtocols;->instance:Lorg/snmp4j/security/SecurityProtocols;

    return-object v0
.end method

.method public static setSecurityProtocols(Lorg/snmp4j/security/SecurityProtocols;)V
    .locals 0

    sput-object p0, Lorg/snmp4j/security/SecurityProtocols;->instance:Lorg/snmp4j/security/SecurityProtocols;

    return-void
.end method


# virtual methods
.method public declared-synchronized addAuthenticationProtocol(Lorg/snmp4j/security/AuthenticationProtocol;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/security/SecurityProtocols;->authProtocols:Ljava/util/Hashtable;

    invoke-interface {p1}, Lorg/snmp4j/security/AuthenticationProtocol;->getID()Lorg/snmp4j/smi/OID;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lorg/snmp4j/security/SecurityProtocols;->authProtocols:Ljava/util/Hashtable;

    invoke-interface {p1}, Lorg/snmp4j/security/AuthenticationProtocol;->getID()Lorg/snmp4j/smi/OID;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Lorg/snmp4j/security/AuthenticationProtocol;->getDigestLength()I

    move-result v0

    iget v1, p0, Lorg/snmp4j/security/SecurityProtocols;->maxAuthDigestLength:I

    if-le v0, v1, :cond_0

    invoke-interface {p1}, Lorg/snmp4j/security/AuthenticationProtocol;->getDigestLength()I

    move-result p1

    iput p1, p0, Lorg/snmp4j/security/SecurityProtocols;->maxAuthDigestLength:I
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

.method public declared-synchronized addDefaultProtocols()Lorg/snmp4j/security/SecurityProtocols;
    .locals 10

    monitor-enter p0

    :try_start_0
    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->isExtensibilityEnabled()Z

    move-result v0

    if-eqz v0, :cond_7

    const-string v0, "org.snmp4j.securityProtocols"

    const-string v1, "SecurityProtocols.properties"

    invoke-static {v0, v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-class v1, Lorg/snmp4j/security/SecurityProtocols;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v1

    if-eqz v1, :cond_6

    new-instance v2, Ljava/util/Properties;

    invoke-direct {v2}, Ljava/util/Properties;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {v2, v1}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V

    invoke-virtual {v2}, Ljava/util/Properties;->propertyNames()Ljava/util/Enumeration;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v3}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_0

    new-instance v6, Lorg/snmp4j/smi/OID;

    invoke-direct {v6, v5}, Lorg/snmp4j/smi/OID;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    :catch_0
    move-exception v2

    goto/16 :goto_4

    :cond_0
    const/4 v6, 0x0

    :goto_1
    :try_start_2
    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v5

    instance-of v7, v5, Lorg/snmp4j/security/nonstandard/NonStandardSecurityProtocol;

    if-eqz v7, :cond_2

    if-eqz v6, :cond_2

    invoke-virtual {v6}, Lorg/snmp4j/smi/OID;->size()I

    move-result v7

    if-lez v7, :cond_2

    sget-object v7, Lorg/snmp4j/security/SecurityProtocols;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v7}, Lorg/snmp4j/log/LogAdapter;->isInfoEnabled()Z

    move-result v8

    if-eqz v8, :cond_1

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Assigning custom ID \'"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v9, "\' to security protocol "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v7, v8}, Lorg/snmp4j/log/LogAdapter;->info(Ljava/lang/CharSequence;)V

    goto :goto_2

    :catch_1
    move-exception v2

    goto :goto_3

    :cond_1
    :goto_2
    move-object v7, v5

    check-cast v7, Lorg/snmp4j/security/nonstandard/NonStandardSecurityProtocol;

    invoke-interface {v7, v6}, Lorg/snmp4j/security/nonstandard/NonStandardSecurityProtocol;->setID(Lorg/snmp4j/smi/OID;)V

    :cond_2
    instance-of v6, v5, Lorg/snmp4j/security/AuthenticationProtocol;

    if-eqz v6, :cond_3

    check-cast v5, Lorg/snmp4j/security/AuthenticationProtocol;

    invoke-virtual {p0, v5}, Lorg/snmp4j/security/SecurityProtocols;->addAuthenticationProtocol(Lorg/snmp4j/security/AuthenticationProtocol;)V

    goto :goto_0

    :cond_3
    instance-of v6, v5, Lorg/snmp4j/security/PrivacyProtocol;

    if-eqz v6, :cond_4

    check-cast v5, Lorg/snmp4j/security/PrivacyProtocol;

    invoke-virtual {p0, v5}, Lorg/snmp4j/security/SecurityProtocols;->addPrivacyProtocol(Lorg/snmp4j/security/PrivacyProtocol;)V

    goto :goto_0

    :cond_4
    sget-object v5, Lorg/snmp4j/security/SecurityProtocols;->logger:Lorg/snmp4j/log/LogAdapter;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Failed to register security protocol because it does not implement required interfaces: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v5, v4}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_0

    :goto_3
    :try_start_3
    sget-object v3, Lorg/snmp4j/security/SecurityProtocols;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v3, v2}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    new-instance v3, Ljava/lang/InternalError;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2}, Ljava/lang/InternalError;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_5
    :try_start_4
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto/16 :goto_7

    :catchall_1
    move-exception v0

    goto/16 :goto_8

    :catch_2
    move-exception v0

    :try_start_5
    sget-object v1, Lorg/snmp4j/security/SecurityProtocols;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v1, v0}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto/16 :goto_7

    :goto_4
    :try_start_6
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Could not read \'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\': "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lorg/snmp4j/security/SecurityProtocols;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v2, v0}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    new-instance v2, Ljava/lang/InternalError;

    invoke-direct {v2, v0}, Ljava/lang/InternalError;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :goto_5
    :try_start_7
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    goto :goto_6

    :catch_3
    move-exception v1

    :try_start_8
    sget-object v2, Lorg/snmp4j/security/SecurityProtocols;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v2, v1}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    :goto_6
    throw v0

    :cond_6
    new-instance v1, Ljava/lang/InternalError;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Could not read \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\' from classpath!"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/InternalError;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_7
    new-instance v0, Lorg/snmp4j/security/AuthMD5;

    invoke-direct {v0}, Lorg/snmp4j/security/AuthMD5;-><init>()V

    invoke-virtual {p0, v0}, Lorg/snmp4j/security/SecurityProtocols;->addAuthenticationProtocol(Lorg/snmp4j/security/AuthenticationProtocol;)V

    new-instance v0, Lorg/snmp4j/security/AuthSHA;

    invoke-direct {v0}, Lorg/snmp4j/security/AuthSHA;-><init>()V

    invoke-virtual {p0, v0}, Lorg/snmp4j/security/SecurityProtocols;->addAuthenticationProtocol(Lorg/snmp4j/security/AuthenticationProtocol;)V

    new-instance v0, Lorg/snmp4j/security/AuthHMAC128SHA224;

    invoke-direct {v0}, Lorg/snmp4j/security/AuthHMAC128SHA224;-><init>()V

    invoke-virtual {p0, v0}, Lorg/snmp4j/security/SecurityProtocols;->addAuthenticationProtocol(Lorg/snmp4j/security/AuthenticationProtocol;)V

    new-instance v0, Lorg/snmp4j/security/AuthHMAC192SHA256;

    invoke-direct {v0}, Lorg/snmp4j/security/AuthHMAC192SHA256;-><init>()V

    invoke-virtual {p0, v0}, Lorg/snmp4j/security/SecurityProtocols;->addAuthenticationProtocol(Lorg/snmp4j/security/AuthenticationProtocol;)V

    new-instance v0, Lorg/snmp4j/security/AuthHMAC256SHA384;

    invoke-direct {v0}, Lorg/snmp4j/security/AuthHMAC256SHA384;-><init>()V

    invoke-virtual {p0, v0}, Lorg/snmp4j/security/SecurityProtocols;->addAuthenticationProtocol(Lorg/snmp4j/security/AuthenticationProtocol;)V

    new-instance v0, Lorg/snmp4j/security/AuthHMAC384SHA512;

    invoke-direct {v0}, Lorg/snmp4j/security/AuthHMAC384SHA512;-><init>()V

    invoke-virtual {p0, v0}, Lorg/snmp4j/security/SecurityProtocols;->addAuthenticationProtocol(Lorg/snmp4j/security/AuthenticationProtocol;)V

    new-instance v0, Lorg/snmp4j/security/PrivDES;

    invoke-direct {v0}, Lorg/snmp4j/security/PrivDES;-><init>()V

    invoke-virtual {p0, v0}, Lorg/snmp4j/security/SecurityProtocols;->addPrivacyProtocol(Lorg/snmp4j/security/PrivacyProtocol;)V

    new-instance v0, Lorg/snmp4j/security/PrivAES128;

    invoke-direct {v0}, Lorg/snmp4j/security/PrivAES128;-><init>()V

    invoke-virtual {p0, v0}, Lorg/snmp4j/security/SecurityProtocols;->addPrivacyProtocol(Lorg/snmp4j/security/PrivacyProtocol;)V

    new-instance v0, Lorg/snmp4j/security/PrivAES192;

    invoke-direct {v0}, Lorg/snmp4j/security/PrivAES192;-><init>()V

    invoke-virtual {p0, v0}, Lorg/snmp4j/security/SecurityProtocols;->addPrivacyProtocol(Lorg/snmp4j/security/PrivacyProtocol;)V

    new-instance v0, Lorg/snmp4j/security/PrivAES256;

    invoke-direct {v0}, Lorg/snmp4j/security/PrivAES256;-><init>()V

    invoke-virtual {p0, v0}, Lorg/snmp4j/security/SecurityProtocols;->addPrivacyProtocol(Lorg/snmp4j/security/PrivacyProtocol;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :goto_7
    monitor-exit p0

    return-object p0

    :goto_8
    :try_start_9
    monitor-exit p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    throw v0
.end method

.method public declared-synchronized addPrivacyProtocol(Lorg/snmp4j/security/PrivacyProtocol;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/security/SecurityProtocols;->privProtocols:Ljava/util/Hashtable;

    invoke-interface {p1}, Lorg/snmp4j/security/PrivacyProtocol;->getID()Lorg/snmp4j/smi/OID;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lorg/snmp4j/security/SecurityProtocols;->privProtocols:Ljava/util/Hashtable;

    invoke-interface {p1}, Lorg/snmp4j/security/PrivacyProtocol;->getID()Lorg/snmp4j/smi/OID;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Lorg/snmp4j/security/PrivacyProtocol;->getDecryptParamsLength()I

    move-result v0

    iget v1, p0, Lorg/snmp4j/security/SecurityProtocols;->maxPrivDecryptParamsLength:I

    if-le v0, v1, :cond_0

    invoke-interface {p1}, Lorg/snmp4j/security/PrivacyProtocol;->getDecryptParamsLength()I

    move-result p1

    iput p1, p0, Lorg/snmp4j/security/SecurityProtocols;->maxPrivDecryptParamsLength:I
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

.method public getAuthenticationProtocol(Lorg/snmp4j/smi/OID;)Lorg/snmp4j/security/AuthenticationProtocol;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lorg/snmp4j/security/SecurityProtocols;->authProtocols:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/snmp4j/security/AuthenticationProtocol;

    return-object p1
.end method

.method public getMaxAuthDigestLength()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/security/SecurityProtocols;->maxAuthDigestLength:I

    return v0
.end method

.method public getMaxPrivDecryptParamsLength()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/security/SecurityProtocols;->maxPrivDecryptParamsLength:I

    return v0
.end method

.method public getPrivacyProtocol(Lorg/snmp4j/smi/OID;)Lorg/snmp4j/security/PrivacyProtocol;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lorg/snmp4j/security/SecurityProtocols;->privProtocols:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/snmp4j/security/PrivacyProtocol;

    return-object p1
.end method

.method public getSecurityProtocol(Lorg/snmp4j/smi/OID;)Lorg/snmp4j/security/SecurityProtocol;
    .locals 1

    invoke-virtual {p0, p1}, Lorg/snmp4j/security/SecurityProtocols;->getAuthenticationProtocol(Lorg/snmp4j/smi/OID;)Lorg/snmp4j/security/AuthenticationProtocol;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lorg/snmp4j/security/SecurityProtocols;->getPrivacyProtocol(Lorg/snmp4j/smi/OID;)Lorg/snmp4j/security/PrivacyProtocol;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public passwordToKey(Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OctetString;[B)[B
    .locals 3

    .line 4
    iget-object v0, p0, Lorg/snmp4j/security/SecurityProtocols;->authProtocols:Ljava/util/Hashtable;

    .line 5
    invoke-virtual {v0, p2}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lorg/snmp4j/security/AuthenticationProtocol;

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return-object v0

    .line 6
    :cond_0
    iget-object v1, p0, Lorg/snmp4j/security/SecurityProtocols;->privProtocols:Ljava/util/Hashtable;

    .line 7
    invoke-virtual {v1, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/snmp4j/security/PrivacyProtocol;

    if-nez p1, :cond_1

    return-object v0

    .line 8
    :cond_1
    invoke-interface {p2, p3, p4}, Lorg/snmp4j/security/AuthenticationProtocol;->passwordToKey(Lorg/snmp4j/smi/OctetString;[B)[B

    move-result-object v1

    if-nez v1, :cond_2

    return-object v0

    .line 9
    :cond_2
    array-length v0, v1

    invoke-interface {p1}, Lorg/snmp4j/security/PrivacyProtocol;->getMinKeyLength()I

    move-result v2

    if-lt v0, v2, :cond_4

    .line 10
    array-length p2, v1

    invoke-interface {p1}, Lorg/snmp4j/security/PrivacyProtocol;->getMaxKeyLength()I

    move-result p3

    if-le p2, p3, :cond_3

    .line 11
    invoke-interface {p1}, Lorg/snmp4j/security/PrivacyProtocol;->getMaxKeyLength()I

    move-result p2

    new-array p2, p2, [B

    .line 12
    invoke-interface {p1}, Lorg/snmp4j/security/PrivacyProtocol;->getMaxKeyLength()I

    move-result p1

    const/4 p3, 0x0

    invoke-static {v1, p3, p2, p3, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object p2

    :cond_3
    return-object v1

    .line 13
    :cond_4
    invoke-interface {p1, v1, p3, p4, p2}, Lorg/snmp4j/security/PrivacyProtocol;->extendShortKey([BLorg/snmp4j/smi/OctetString;[BLorg/snmp4j/security/AuthenticationProtocol;)[B

    move-result-object p1

    return-object p1
.end method

.method public passwordToKey(Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OctetString;[B)[B
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/snmp4j/security/SecurityProtocols;->authProtocols:Ljava/util/Hashtable;

    .line 2
    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/snmp4j/security/AuthenticationProtocol;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 3
    :cond_0
    invoke-interface {p1, p2, p3}, Lorg/snmp4j/security/AuthenticationProtocol;->passwordToKey(Lorg/snmp4j/smi/OctetString;[B)[B

    move-result-object p1

    return-object p1
.end method

.method public removeAuthenticationProtocol(Lorg/snmp4j/security/AuthenticationProtocol;)V
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/SecurityProtocols;->authProtocols:Ljava/util/Hashtable;

    invoke-interface {p1}, Lorg/snmp4j/security/AuthenticationProtocol;->getID()Lorg/snmp4j/smi/OID;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public removePrivacyProtocol(Lorg/snmp4j/security/PrivacyProtocol;)V
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/SecurityProtocols;->privProtocols:Ljava/util/Hashtable;

    invoke-interface {p1}, Lorg/snmp4j/security/PrivacyProtocol;->getID()Lorg/snmp4j/smi/OID;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public truncateKey([BI)[B
    .locals 2

    array-length v0, p1

    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result p2

    new-array v0, p2, [B

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method
