.class public Lorg/snmp4j/log/ConsoleLogAdapter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/log/LogAdapter;


# static fields
.field private static debugEnabled:Z = false

.field private static infoEnabled:Z = true

.field private static warnEnabled:Z = true


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

.method public static setDebugEnabled(Z)V
    .locals 0

    sput-boolean p0, Lorg/snmp4j/log/ConsoleLogAdapter;->debugEnabled:Z

    return-void
.end method

.method public static setInfoEnabled(Z)V
    .locals 0

    sput-boolean p0, Lorg/snmp4j/log/ConsoleLogAdapter;->infoEnabled:Z

    return-void
.end method

.method public static setWarnEnabled(Z)V
    .locals 0

    sput-boolean p0, Lorg/snmp4j/log/ConsoleLogAdapter;->warnEnabled:Z

    return-void
.end method


# virtual methods
.method public debug(Ljava/io/Serializable;)V
    .locals 1

    sget-boolean v0, Lorg/snmp4j/log/ConsoleLogAdapter;->debugEnabled:Z

    if-eqz v0, :cond_0

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public error(Ljava/io/Serializable;)V
    .locals 1

    .line 1
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method

.method public error(Ljava/lang/CharSequence;Ljava/lang/Throwable;)V
    .locals 0

    .line 2
    sget-object p2, Ljava/lang/System;->err:Ljava/io/PrintStream;

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method

.method public fatal(Ljava/lang/CharSequence;Ljava/lang/Throwable;)V
    .locals 0

    .line 2
    sget-object p2, Ljava/lang/System;->err:Ljava/io/PrintStream;

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method

.method public fatal(Ljava/lang/Object;)V
    .locals 1

    .line 1
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method

.method public getEffectiveLogLevel()Lorg/snmp4j/log/LogLevel;
    .locals 1

    invoke-virtual {p0}, Lorg/snmp4j/log/ConsoleLogAdapter;->getLogLevel()Lorg/snmp4j/log/LogLevel;

    move-result-object v0

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

    sget-boolean v0, Lorg/snmp4j/log/ConsoleLogAdapter;->debugEnabled:Z

    if-eqz v0, :cond_0

    sget-object v0, Lorg/snmp4j/log/LogLevel;->DEBUG:Lorg/snmp4j/log/LogLevel;

    return-object v0

    :cond_0
    sget-boolean v0, Lorg/snmp4j/log/ConsoleLogAdapter;->infoEnabled:Z

    if-eqz v0, :cond_1

    sget-object v0, Lorg/snmp4j/log/LogLevel;->INFO:Lorg/snmp4j/log/LogLevel;

    return-object v0

    :cond_1
    sget-boolean v0, Lorg/snmp4j/log/ConsoleLogAdapter;->warnEnabled:Z

    if-eqz v0, :cond_2

    sget-object v0, Lorg/snmp4j/log/LogLevel;->WARN:Lorg/snmp4j/log/LogLevel;

    return-object v0

    :cond_2
    sget-object v0, Lorg/snmp4j/log/LogLevel;->OFF:Lorg/snmp4j/log/LogLevel;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public info(Ljava/lang/CharSequence;)V
    .locals 1

    sget-boolean v0, Lorg/snmp4j/log/ConsoleLogAdapter;->infoEnabled:Z

    if-eqz v0, :cond_0

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public isDebugEnabled()Z
    .locals 1

    sget-boolean v0, Lorg/snmp4j/log/ConsoleLogAdapter;->debugEnabled:Z

    return v0
.end method

.method public isInfoEnabled()Z
    .locals 1

    sget-boolean v0, Lorg/snmp4j/log/ConsoleLogAdapter;->infoEnabled:Z

    return v0
.end method

.method public isWarnEnabled()Z
    .locals 1

    sget-boolean v0, Lorg/snmp4j/log/ConsoleLogAdapter;->warnEnabled:Z

    return v0
.end method

.method public setLogLevel(Lorg/snmp4j/log/LogLevel;)V
    .locals 2

    const/4 v0, 0x0

    sput-boolean v0, Lorg/snmp4j/log/ConsoleLogAdapter;->debugEnabled:Z

    sput-boolean v0, Lorg/snmp4j/log/ConsoleLogAdapter;->warnEnabled:Z

    sput-boolean v0, Lorg/snmp4j/log/ConsoleLogAdapter;->infoEnabled:Z

    invoke-virtual {p1}, Lorg/snmp4j/log/LogLevel;->getLevel()I

    move-result p1

    const/4 v0, 0x2

    const/4 v1, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    const/4 v0, 0x4

    if-eq p1, v0, :cond_2

    const/4 v0, 0x5

    if-eq p1, v0, :cond_1

    const/4 v0, 0x6

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    sput-boolean v1, Lorg/snmp4j/log/ConsoleLogAdapter;->warnEnabled:Z

    goto :goto_0

    :cond_1
    sput-boolean v1, Lorg/snmp4j/log/ConsoleLogAdapter;->infoEnabled:Z

    sput-boolean v1, Lorg/snmp4j/log/ConsoleLogAdapter;->warnEnabled:Z

    goto :goto_0

    :cond_2
    sput-boolean v1, Lorg/snmp4j/log/ConsoleLogAdapter;->debugEnabled:Z

    sput-boolean v1, Lorg/snmp4j/log/ConsoleLogAdapter;->warnEnabled:Z

    sput-boolean v1, Lorg/snmp4j/log/ConsoleLogAdapter;->infoEnabled:Z

    :goto_0
    return-void
.end method

.method public warn(Ljava/io/Serializable;)V
    .locals 1

    sget-boolean v0, Lorg/snmp4j/log/ConsoleLogAdapter;->warnEnabled:Z

    if-eqz v0, :cond_0

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
