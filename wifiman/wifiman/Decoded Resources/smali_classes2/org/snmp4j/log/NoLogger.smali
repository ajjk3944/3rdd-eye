.class public Lorg/snmp4j/log/NoLogger;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/log/LogAdapter;


# static fields
.field static final instance:Lorg/snmp4j/log/NoLogger;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/snmp4j/log/NoLogger;

    invoke-direct {v0}, Lorg/snmp4j/log/NoLogger;-><init>()V

    sput-object v0, Lorg/snmp4j/log/NoLogger;->instance:Lorg/snmp4j/log/NoLogger;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public debug(Ljava/io/Serializable;)V
    .locals 0

    return-void
.end method

.method public error(Ljava/io/Serializable;)V
    .locals 0

    .line 1
    return-void
.end method

.method public error(Ljava/lang/CharSequence;Ljava/lang/Throwable;)V
    .locals 0

    .line 2
    return-void
.end method

.method public fatal(Ljava/lang/CharSequence;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    return-void
.end method

.method public fatal(Ljava/lang/Object;)V
    .locals 0

    .line 2
    return-void
.end method

.method public getEffectiveLogLevel()Lorg/snmp4j/log/LogLevel;
    .locals 1

    sget-object v0, Lorg/snmp4j/log/LogLevel;->OFF:Lorg/snmp4j/log/LogLevel;

    return-object v0
.end method

.method public getLogHandler()Ljava/util/Iterator;
    .locals 1

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public getLogLevel()Lorg/snmp4j/log/LogLevel;
    .locals 1

    sget-object v0, Lorg/snmp4j/log/LogLevel;->OFF:Lorg/snmp4j/log/LogLevel;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public info(Ljava/lang/CharSequence;)V
    .locals 0

    return-void
.end method

.method public isDebugEnabled()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isInfoEnabled()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isWarnEnabled()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public setLogLevel(Lorg/snmp4j/log/LogLevel;)V
    .locals 0

    return-void
.end method

.method public warn(Ljava/io/Serializable;)V
    .locals 0

    return-void
.end method
