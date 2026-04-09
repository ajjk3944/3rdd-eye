.class public Lorg/snmp4j/log/JavaLogFactory;
.super Lorg/snmp4j/log/LogFactory;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/snmp4j/log/JavaLogFactory$JavaLogAdapterIterator;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lorg/snmp4j/log/LogFactory;-><init>()V

    return-void
.end method


# virtual methods
.method protected createLogger(Ljava/lang/Class;)Lorg/snmp4j/log/LogAdapter;
    .locals 1

    .line 1
    new-instance v0, Lorg/snmp4j/log/JavaLogAdapter;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/snmp4j/log/JavaLogAdapter;-><init>(Ljava/util/logging/Logger;)V

    return-object v0
.end method

.method protected createLogger(Ljava/lang/String;)Lorg/snmp4j/log/LogAdapter;
    .locals 1

    .line 2
    new-instance v0, Lorg/snmp4j/log/JavaLogAdapter;

    invoke-static {p1}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/snmp4j/log/JavaLogAdapter;-><init>(Ljava/util/logging/Logger;)V

    return-object v0
.end method

.method public getRootLogger()Lorg/snmp4j/log/LogAdapter;
    .locals 2

    new-instance v0, Lorg/snmp4j/log/JavaLogAdapter;

    const-string v1, ""

    invoke-static {v1}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/snmp4j/log/JavaLogAdapter;-><init>(Ljava/util/logging/Logger;)V

    return-object v0
.end method

.method public loggers()Ljava/util/Iterator;
    .locals 2

    invoke-static {}, Ljava/util/logging/LogManager;->getLogManager()Ljava/util/logging/LogManager;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/logging/LogManager;->getLoggerNames()Ljava/util/Enumeration;

    move-result-object v0

    new-instance v1, Lorg/snmp4j/log/JavaLogFactory$JavaLogAdapterIterator;

    invoke-direct {v1, p0, v0}, Lorg/snmp4j/log/JavaLogFactory$JavaLogAdapterIterator;-><init>(Lorg/snmp4j/log/JavaLogFactory;Ljava/util/Enumeration;)V

    return-object v1
.end method
