.class public Lorg/snmp4j/log/LogProxy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/log/LogAdapter;


# instance fields
.field private logger:Lorg/snmp4j/log/LogAdapter;

.field private name:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lorg/snmp4j/log/LogProxy;->name:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/log/LogAdapter;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lorg/snmp4j/log/LogProxy;->logger:Lorg/snmp4j/log/LogAdapter;

    return-void
.end method


# virtual methods
.method public debug(Ljava/io/Serializable;)V
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/log/LogProxy;->logger:Lorg/snmp4j/log/LogAdapter;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_0
    return-void
.end method

.method public error(Ljava/io/Serializable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/snmp4j/log/LogProxy;->logger:Lorg/snmp4j/log/LogAdapter;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    :cond_0
    return-void
.end method

.method public error(Ljava/lang/CharSequence;Ljava/lang/Throwable;)V
    .locals 1

    .line 3
    iget-object v0, p0, Lorg/snmp4j/log/LogProxy;->logger:Lorg/snmp4j/log/LogAdapter;

    if-eqz v0, :cond_0

    .line 4
    invoke-interface {v0, p1, p2}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/lang/CharSequence;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public fatal(Ljava/lang/CharSequence;Ljava/lang/Throwable;)V
    .locals 1

    .line 3
    iget-object v0, p0, Lorg/snmp4j/log/LogProxy;->logger:Lorg/snmp4j/log/LogAdapter;

    if-eqz v0, :cond_0

    .line 4
    invoke-interface {v0, p1, p2}, Lorg/snmp4j/log/LogAdapter;->fatal(Ljava/lang/CharSequence;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public fatal(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/snmp4j/log/LogProxy;->logger:Lorg/snmp4j/log/LogAdapter;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Lorg/snmp4j/log/LogAdapter;->fatal(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public getEffectiveLogLevel()Lorg/snmp4j/log/LogLevel;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/log/LogProxy;->logger:Lorg/snmp4j/log/LogAdapter;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->getEffectiveLogLevel()Lorg/snmp4j/log/LogLevel;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Lorg/snmp4j/log/LogLevel;->OFF:Lorg/snmp4j/log/LogLevel;

    return-object v0
.end method

.method public getLogHandler()Ljava/util/Iterator;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/log/LogProxy;->logger:Lorg/snmp4j/log/LogAdapter;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->getLogHandler()Ljava/util/Iterator;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public getLogLevel()Lorg/snmp4j/log/LogLevel;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/log/LogProxy;->logger:Lorg/snmp4j/log/LogAdapter;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->getLogLevel()Lorg/snmp4j/log/LogLevel;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Lorg/snmp4j/log/LogLevel;->OFF:Lorg/snmp4j/log/LogLevel;

    return-object v0
.end method

.method public getLogger()Lorg/snmp4j/log/LogAdapter;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/log/LogProxy;->logger:Lorg/snmp4j/log/LogAdapter;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/log/LogProxy;->logger:Lorg/snmp4j/log/LogAdapter;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->getName()Ljava/lang/String;

    :cond_0
    iget-object v0, p0, Lorg/snmp4j/log/LogProxy;->name:Ljava/lang/String;

    return-object v0
.end method

.method public info(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/log/LogProxy;->logger:Lorg/snmp4j/log/LogAdapter;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lorg/snmp4j/log/LogAdapter;->info(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public isDebugEnabled()Z
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/log/LogProxy;->logger:Lorg/snmp4j/log/LogAdapter;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isInfoEnabled()Z
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/log/LogProxy;->logger:Lorg/snmp4j/log/LogAdapter;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isInfoEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isWarnEnabled()Z
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/log/LogProxy;->logger:Lorg/snmp4j/log/LogAdapter;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isWarnEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setLogLevel(Lorg/snmp4j/log/LogLevel;)V
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/log/LogProxy;->logger:Lorg/snmp4j/log/LogAdapter;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lorg/snmp4j/log/LogAdapter;->setLogLevel(Lorg/snmp4j/log/LogLevel;)V

    :cond_0
    return-void
.end method

.method public setLogger(Lorg/snmp4j/log/LogAdapter;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/log/LogProxy;->logger:Lorg/snmp4j/log/LogAdapter;

    return-void
.end method

.method public warn(Ljava/io/Serializable;)V
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/log/LogProxy;->logger:Lorg/snmp4j/log/LogAdapter;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    :cond_0
    return-void
.end method
