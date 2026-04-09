.class Lorg/snmp4j/tools/console/LogControl$LoggerListListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/util/TableListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/tools/console/LogControl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "LoggerListListener"
.end annotation


# instance fields
.field private finished:Z

.field final synthetic this$0:Lorg/snmp4j/tools/console/LogControl;


# direct methods
.method constructor <init>(Lorg/snmp4j/tools/console/LogControl;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/tools/console/LogControl$LoggerListListener;->this$0:Lorg/snmp4j/tools/console/LogControl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private printLogger(Lorg/snmp4j/util/TableEvent;)V
    .locals 5

    invoke-virtual {p1}, Lorg/snmp4j/util/RetrievalEvent;->getStatus()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lorg/snmp4j/util/TableEvent;->getIndex()Lorg/snmp4j/smi/OID;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lorg/snmp4j/util/TableEvent;->getColumns()[Lorg/snmp4j/smi/VariableBinding;

    move-result-object v0

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lorg/snmp4j/smi/VariableBinding;->getVariable()Lorg/snmp4j/smi/Variable;

    move-result-object v0

    invoke-interface {v0}, Lorg/snmp4j/smi/Variable;->toInt()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    new-instance v0, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v0}, Lorg/snmp4j/smi/OctetString;-><init>()V

    invoke-virtual {p1}, Lorg/snmp4j/util/TableEvent;->getIndex()Lorg/snmp4j/smi/OID;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lorg/snmp4j/smi/OctetString;->fromSubIndex(Lorg/snmp4j/smi/OID;Z)V

    new-instance v2, Lorg/snmp4j/log/LogLevel;

    invoke-virtual {p1}, Lorg/snmp4j/util/TableEvent;->getColumns()[Lorg/snmp4j/smi/VariableBinding;

    move-result-object v3

    const/4 v4, 0x0

    aget-object v3, v3, v4

    invoke-virtual {v3}, Lorg/snmp4j/smi/VariableBinding;->getVariable()Lorg/snmp4j/smi/Variable;

    move-result-object v3

    invoke-interface {v3}, Lorg/snmp4j/smi/Variable;->toInt()I

    move-result v3

    invoke-direct {v2, v3}, Lorg/snmp4j/log/LogLevel;-><init>(I)V

    new-instance v3, Lorg/snmp4j/log/LogLevel;

    invoke-virtual {p1}, Lorg/snmp4j/util/TableEvent;->getColumns()[Lorg/snmp4j/smi/VariableBinding;

    move-result-object p1

    aget-object p1, p1, v1

    invoke-virtual {p1}, Lorg/snmp4j/smi/VariableBinding;->getVariable()Lorg/snmp4j/smi/Variable;

    move-result-object p1

    invoke-interface {p1}, Lorg/snmp4j/smi/Variable;->toInt()I

    move-result p1

    invoke-direct {v3, p1}, Lorg/snmp4j/log/LogLevel;-><init>(I)V

    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lorg/snmp4j/smi/OctetString;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "("

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lorg/snmp4j/util/RetrievalEvent;->getStatus()I

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Logger list command failed with: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/snmp4j/util/RetrievalEvent;->getErrorMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public finished(Lorg/snmp4j/util/TableEvent;)V
    .locals 1

    invoke-direct {p0, p1}, Lorg/snmp4j/tools/console/LogControl$LoggerListListener;->printLogger(Lorg/snmp4j/util/TableEvent;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/snmp4j/tools/console/LogControl$LoggerListListener;->finished:Z

    invoke-virtual {p1}, Lorg/snmp4j/util/RetrievalEvent;->getUserObject()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    invoke-virtual {p1}, Lorg/snmp4j/util/RetrievalEvent;->getUserObject()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->notify()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public isFinished()Z
    .locals 1

    iget-boolean v0, p0, Lorg/snmp4j/tools/console/LogControl$LoggerListListener;->finished:Z

    return v0
.end method

.method public next(Lorg/snmp4j/util/TableEvent;)Z
    .locals 0

    invoke-direct {p0, p1}, Lorg/snmp4j/tools/console/LogControl$LoggerListListener;->printLogger(Lorg/snmp4j/util/TableEvent;)V

    invoke-virtual {p1}, Lorg/snmp4j/util/RetrievalEvent;->getStatus()I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
