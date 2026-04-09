.class public interface abstract Lorg/snmp4j/log/LogAdapter;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract debug(Ljava/io/Serializable;)V
.end method

.method public abstract error(Ljava/io/Serializable;)V
.end method

.method public abstract error(Ljava/lang/CharSequence;Ljava/lang/Throwable;)V
.end method

.method public abstract fatal(Ljava/lang/CharSequence;Ljava/lang/Throwable;)V
.end method

.method public abstract fatal(Ljava/lang/Object;)V
.end method

.method public abstract getEffectiveLogLevel()Lorg/snmp4j/log/LogLevel;
.end method

.method public abstract getLogHandler()Ljava/util/Iterator;
.end method

.method public abstract getLogLevel()Lorg/snmp4j/log/LogLevel;
.end method

.method public abstract getName()Ljava/lang/String;
.end method

.method public abstract info(Ljava/lang/CharSequence;)V
.end method

.method public abstract isDebugEnabled()Z
.end method

.method public abstract isInfoEnabled()Z
.end method

.method public abstract isWarnEnabled()Z
.end method

.method public abstract setLogLevel(Lorg/snmp4j/log/LogLevel;)V
.end method

.method public abstract warn(Ljava/io/Serializable;)V
.end method
