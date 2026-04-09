.class public Lorg/snmp4j/log/LogFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final SNMP4J_LOG_FACTORY_SYSTEM_PROPERTY:Ljava/lang/String; = "snmp4j.LogFactory"

.field private static configChecked:Z = false

.field private static snmp4jLogFactory:Lorg/snmp4j/log/LogFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static checkConfig()V
    .locals 1

    sget-boolean v0, Lorg/snmp4j/log/LogFactory;->configChecked:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    sput-boolean v0, Lorg/snmp4j/log/LogFactory;->configChecked:Z

    invoke-static {}, Lorg/snmp4j/log/LogFactory;->getFactoryFromSystemProperty()V

    :cond_0
    return-void
.end method

.method private static declared-synchronized getFactoryFromSystemProperty()V
    .locals 3

    const-class v0, Lorg/snmp4j/log/LogFactory;

    monitor-enter v0

    :try_start_0
    const-string v1, "snmp4j.LogFactory"

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    :try_start_1
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/snmp4j/log/LogFactory;

    sput-object v1, Lorg/snmp4j/log/LogFactory;->snmp4jLogFactory:Lorg/snmp4j/log/LogFactory;
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v1

    goto :goto_5

    :catch_0
    move-exception v1

    goto :goto_4

    :catch_1
    move-exception v1

    goto :goto_0

    :catch_2
    move-exception v1

    goto :goto_1

    :catch_3
    move-exception v1

    goto :goto_2

    :goto_0
    :try_start_2
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2

    :goto_1
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2

    :goto_2
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_0
    :goto_3
    monitor-exit v0

    return-void

    :goto_4
    :try_start_3
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2

    :goto_5
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v1
.end method

.method public static getLogFactory()Lorg/snmp4j/log/LogFactory;
    .locals 1

    sget-object v0, Lorg/snmp4j/log/LogFactory;->snmp4jLogFactory:Lorg/snmp4j/log/LogFactory;

    if-nez v0, :cond_0

    new-instance v0, Lorg/snmp4j/log/LogFactory;

    invoke-direct {v0}, Lorg/snmp4j/log/LogFactory;-><init>()V

    :cond_0
    return-object v0
.end method

.method public static getLogger(Ljava/lang/Class;)Lorg/snmp4j/log/LogAdapter;
    .locals 1

    .line 1
    invoke-static {}, Lorg/snmp4j/log/LogFactory;->checkConfig()V

    .line 2
    sget-object v0, Lorg/snmp4j/log/LogFactory;->snmp4jLogFactory:Lorg/snmp4j/log/LogFactory;

    if-nez v0, :cond_0

    .line 3
    sget-object p0, Lorg/snmp4j/log/NoLogger;->instance:Lorg/snmp4j/log/NoLogger;

    return-object p0

    .line 4
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lorg/snmp4j/log/LogFactory;->createLogger(Ljava/lang/String;)Lorg/snmp4j/log/LogAdapter;

    move-result-object p0

    return-object p0
.end method

.method public static getLogger(Ljava/lang/String;)Lorg/snmp4j/log/LogAdapter;
    .locals 1

    .line 5
    invoke-static {}, Lorg/snmp4j/log/LogFactory;->checkConfig()V

    .line 6
    sget-object v0, Lorg/snmp4j/log/LogFactory;->snmp4jLogFactory:Lorg/snmp4j/log/LogFactory;

    if-nez v0, :cond_0

    .line 7
    sget-object p0, Lorg/snmp4j/log/NoLogger;->instance:Lorg/snmp4j/log/NoLogger;

    return-object p0

    .line 8
    :cond_0
    invoke-virtual {v0, p0}, Lorg/snmp4j/log/LogFactory;->createLogger(Ljava/lang/String;)Lorg/snmp4j/log/LogAdapter;

    move-result-object p0

    return-object p0
.end method

.method public static setLogFactory(Lorg/snmp4j/log/LogFactory;)V
    .locals 1

    const/4 v0, 0x1

    sput-boolean v0, Lorg/snmp4j/log/LogFactory;->configChecked:Z

    sput-object p0, Lorg/snmp4j/log/LogFactory;->snmp4jLogFactory:Lorg/snmp4j/log/LogFactory;

    return-void
.end method


# virtual methods
.method protected createLogger(Ljava/lang/Class;)Lorg/snmp4j/log/LogAdapter;
    .locals 0

    .line 1
    sget-object p1, Lorg/snmp4j/log/NoLogger;->instance:Lorg/snmp4j/log/NoLogger;

    return-object p1
.end method

.method protected createLogger(Ljava/lang/String;)Lorg/snmp4j/log/LogAdapter;
    .locals 0

    .line 2
    sget-object p1, Lorg/snmp4j/log/NoLogger;->instance:Lorg/snmp4j/log/NoLogger;

    return-object p1
.end method

.method public getRootLogger()Lorg/snmp4j/log/LogAdapter;
    .locals 1

    sget-object v0, Lorg/snmp4j/log/NoLogger;->instance:Lorg/snmp4j/log/NoLogger;

    return-object v0
.end method

.method public loggers()Ljava/util/Iterator;
    .locals 1

    sget-object v0, Lorg/snmp4j/log/NoLogger;->instance:Lorg/snmp4j/log/NoLogger;

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
