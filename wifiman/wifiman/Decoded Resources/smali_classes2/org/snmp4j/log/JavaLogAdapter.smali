.class public Lorg/snmp4j/log/JavaLogAdapter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/log/LogAdapter;


# instance fields
.field private final logger:Ljava/util/logging/Logger;


# direct methods
.method public constructor <init>(Ljava/util/logging/Logger;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/snmp4j/log/JavaLogAdapter;->logger:Ljava/util/logging/Logger;

    return-void
.end method

.method private static fromJavaToSnmp4jLevel(Ljava/util/logging/Level;)Lorg/snmp4j/log/LogLevel;
    .locals 3

    if-nez p0, :cond_0

    sget-object p0, Lorg/snmp4j/log/LogLevel;->NONE:Lorg/snmp4j/log/LogLevel;

    return-object p0

    :cond_0
    sget-object v0, Ljava/util/logging/Level;->ALL:Ljava/util/logging/Level;

    invoke-virtual {v0, p0}, Ljava/util/logging/Level;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lorg/snmp4j/log/LogLevel;->ALL:Lorg/snmp4j/log/LogLevel;

    return-object p0

    :cond_1
    sget-object v0, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    invoke-virtual {v0, p0}, Ljava/util/logging/Level;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, Lorg/snmp4j/log/LogLevel;->FATAL:Lorg/snmp4j/log/LogLevel;

    return-object p0

    :cond_2
    sget-object v0, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    invoke-virtual {v0, p0}, Ljava/util/logging/Level;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p0, Lorg/snmp4j/log/LogLevel;->WARN:Lorg/snmp4j/log/LogLevel;

    return-object p0

    :cond_3
    sget-object v0, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    invoke-virtual {v0, p0}, Ljava/util/logging/Level;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object p0, Lorg/snmp4j/log/LogLevel;->INFO:Lorg/snmp4j/log/LogLevel;

    return-object p0

    :cond_4
    sget-object v0, Ljava/util/logging/Level;->CONFIG:Ljava/util/logging/Level;

    invoke-virtual {v0, p0}, Ljava/util/logging/Level;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object p0, Lorg/snmp4j/log/LogLevel;->DEBUG:Lorg/snmp4j/log/LogLevel;

    return-object p0

    :cond_5
    sget-object v0, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v0, p0}, Ljava/util/logging/Level;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object p0, Lorg/snmp4j/log/LogLevel;->DEBUG:Lorg/snmp4j/log/LogLevel;

    return-object p0

    :cond_6
    sget-object v0, Ljava/util/logging/Level;->FINER:Ljava/util/logging/Level;

    invoke-virtual {v0, p0}, Ljava/util/logging/Level;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object p0, Lorg/snmp4j/log/LogLevel;->TRACE:Lorg/snmp4j/log/LogLevel;

    return-object p0

    :cond_7
    sget-object v0, Ljava/util/logging/Level;->FINEST:Ljava/util/logging/Level;

    invoke-virtual {v0, p0}, Ljava/util/logging/Level;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    sget-object p0, Lorg/snmp4j/log/LogLevel;->TRACE:Lorg/snmp4j/log/LogLevel;

    return-object p0

    :cond_8
    sget-object v0, Ljava/util/logging/Level;->OFF:Ljava/util/logging/Level;

    invoke-virtual {v0, p0}, Ljava/util/logging/Level;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    sget-object p0, Lorg/snmp4j/log/LogLevel;->DEBUG:Lorg/snmp4j/log/LogLevel;

    return-object p0

    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Mapping not defined from Java level "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/util/logging/Level;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " to SNMP4J logging level"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static fromSnmp4jToJdk(Lorg/snmp4j/log/LogLevel;)Ljava/util/logging/Level;
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lorg/snmp4j/log/LogLevel;->getLevel()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Mapping not defined from SNMP4J level "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " to Java logging level"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    sget-object p0, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    return-object p0

    :pswitch_1
    sget-object p0, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    return-object p0

    :pswitch_2
    sget-object p0, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    return-object p0

    :pswitch_3
    sget-object p0, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    return-object p0

    :pswitch_4
    sget-object p0, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    return-object p0

    :pswitch_5
    sget-object p0, Ljava/util/logging/Level;->FINEST:Ljava/util/logging/Level;

    return-object p0

    :pswitch_6
    sget-object p0, Ljava/util/logging/Level;->ALL:Ljava/util/logging/Level;

    return-object p0

    :pswitch_7
    sget-object p0, Ljava/util/logging/Level;->OFF:Ljava/util/logging/Level;

    return-object p0

    :pswitch_8
    sget-object p0, Ljava/util/logging/Level;->OFF:Ljava/util/logging/Level;

    return-object p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private isLoggable(Lorg/snmp4j/log/LogLevel;)Z
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/log/JavaLogAdapter;->logger:Ljava/util/logging/Logger;

    invoke-static {p1}, Lorg/snmp4j/log/JavaLogAdapter;->fromSnmp4jToJdk(Lorg/snmp4j/log/LogLevel;)Ljava/util/logging/Level;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result p1

    return p1
.end method

.method private log(Lorg/snmp4j/log/LogLevel;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/log/JavaLogAdapter;->logger:Ljava/util/logging/Logger;

    invoke-static {p1}, Lorg/snmp4j/log/JavaLogAdapter;->fromSnmp4jToJdk(Lorg/snmp4j/log/LogLevel;)Ljava/util/logging/Level;

    move-result-object p1

    invoke-virtual {v0, p1, p2, p3}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public debug(Ljava/io/Serializable;)V
    .locals 2

    sget-object v0, Lorg/snmp4j/log/LogLevel;->DEBUG:Lorg/snmp4j/log/LogLevel;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1}, Lorg/snmp4j/log/JavaLogAdapter;->log(Lorg/snmp4j/log/LogLevel;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public error(Ljava/io/Serializable;)V
    .locals 2

    .line 1
    sget-object v0, Lorg/snmp4j/log/LogLevel;->ERROR:Lorg/snmp4j/log/LogLevel;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1}, Lorg/snmp4j/log/JavaLogAdapter;->log(Lorg/snmp4j/log/LogLevel;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public error(Ljava/lang/CharSequence;Ljava/lang/Throwable;)V
    .locals 1

    .line 2
    sget-object v0, Lorg/snmp4j/log/LogLevel;->ERROR:Lorg/snmp4j/log/LogLevel;

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v0, p1, p2}, Lorg/snmp4j/log/JavaLogAdapter;->log(Lorg/snmp4j/log/LogLevel;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public fatal(Ljava/lang/CharSequence;Ljava/lang/Throwable;)V
    .locals 1

    .line 2
    sget-object v0, Lorg/snmp4j/log/LogLevel;->FATAL:Lorg/snmp4j/log/LogLevel;

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v0, p1, p2}, Lorg/snmp4j/log/JavaLogAdapter;->log(Lorg/snmp4j/log/LogLevel;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public fatal(Ljava/lang/Object;)V
    .locals 2

    .line 1
    sget-object v0, Lorg/snmp4j/log/LogLevel;->FATAL:Lorg/snmp4j/log/LogLevel;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1}, Lorg/snmp4j/log/JavaLogAdapter;->log(Lorg/snmp4j/log/LogLevel;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public getEffectiveLogLevel()Lorg/snmp4j/log/LogLevel;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/log/JavaLogAdapter;->logger:Ljava/util/logging/Logger;

    invoke-virtual {v0}, Ljava/util/logging/Logger;->getLevel()Ljava/util/logging/Level;

    move-result-object v0

    invoke-static {v0}, Lorg/snmp4j/log/JavaLogAdapter;->fromJavaToSnmp4jLevel(Ljava/util/logging/Level;)Lorg/snmp4j/log/LogLevel;

    move-result-object v0

    return-object v0
.end method

.method public getLogHandler()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/util/logging/Handler;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lorg/snmp4j/log/JavaLogAdapter;->logger:Ljava/util/logging/Logger;

    invoke-virtual {v0}, Ljava/util/logging/Logger;->getHandlers()[Ljava/util/logging/Handler;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public getLogLevel()Lorg/snmp4j/log/LogLevel;
    .locals 1

    invoke-virtual {p0}, Lorg/snmp4j/log/JavaLogAdapter;->getEffectiveLogLevel()Lorg/snmp4j/log/LogLevel;

    move-result-object v0

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/log/JavaLogAdapter;->logger:Ljava/util/logging/Logger;

    invoke-virtual {v0}, Ljava/util/logging/Logger;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public info(Ljava/lang/CharSequence;)V
    .locals 2

    sget-object v0, Lorg/snmp4j/log/LogLevel;->INFO:Lorg/snmp4j/log/LogLevel;

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1}, Lorg/snmp4j/log/JavaLogAdapter;->log(Lorg/snmp4j/log/LogLevel;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public isDebugEnabled()Z
    .locals 1

    sget-object v0, Lorg/snmp4j/log/LogLevel;->DEBUG:Lorg/snmp4j/log/LogLevel;

    invoke-direct {p0, v0}, Lorg/snmp4j/log/JavaLogAdapter;->isLoggable(Lorg/snmp4j/log/LogLevel;)Z

    move-result v0

    return v0
.end method

.method public isInfoEnabled()Z
    .locals 1

    sget-object v0, Lorg/snmp4j/log/LogLevel;->INFO:Lorg/snmp4j/log/LogLevel;

    invoke-direct {p0, v0}, Lorg/snmp4j/log/JavaLogAdapter;->isLoggable(Lorg/snmp4j/log/LogLevel;)Z

    move-result v0

    return v0
.end method

.method public isWarnEnabled()Z
    .locals 1

    sget-object v0, Lorg/snmp4j/log/LogLevel;->WARN:Lorg/snmp4j/log/LogLevel;

    invoke-direct {p0, v0}, Lorg/snmp4j/log/JavaLogAdapter;->isLoggable(Lorg/snmp4j/log/LogLevel;)Z

    move-result v0

    return v0
.end method

.method public setLogLevel(Lorg/snmp4j/log/LogLevel;)V
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/log/JavaLogAdapter;->logger:Ljava/util/logging/Logger;

    invoke-static {p1}, Lorg/snmp4j/log/JavaLogAdapter;->fromSnmp4jToJdk(Lorg/snmp4j/log/LogLevel;)Ljava/util/logging/Level;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/logging/Logger;->setLevel(Ljava/util/logging/Level;)V

    return-void
.end method

.method public warn(Ljava/io/Serializable;)V
    .locals 2

    sget-object v0, Lorg/snmp4j/log/LogLevel;->WARN:Lorg/snmp4j/log/LogLevel;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1}, Lorg/snmp4j/log/JavaLogAdapter;->log(Lorg/snmp4j/log/LogLevel;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
