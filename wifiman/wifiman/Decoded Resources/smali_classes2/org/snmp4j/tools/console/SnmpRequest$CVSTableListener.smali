.class Lorg/snmp4j/tools/console/SnmpRequest$CVSTableListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/util/TableListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/tools/console/SnmpRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "CVSTableListener"
.end annotation


# instance fields
.field private finished:Z

.field private requestTime:J

.field final synthetic this$0:Lorg/snmp4j/tools/console/SnmpRequest;


# direct methods
.method public constructor <init>(Lorg/snmp4j/tools/console/SnmpRequest;J)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/tools/console/SnmpRequest$CVSTableListener;->this$0:Lorg/snmp4j/tools/console/SnmpRequest;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, Lorg/snmp4j/tools/console/SnmpRequest$CVSTableListener;->requestTime:J

    return-void
.end method


# virtual methods
.method public finished(Lorg/snmp4j/util/TableEvent;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/snmp4j/tools/console/SnmpRequest$CVSTableListener;->finished:Z

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

    iget-boolean v0, p0, Lorg/snmp4j/tools/console/SnmpRequest$CVSTableListener;->finished:Z

    return v0
.end method

.method public next(Lorg/snmp4j/util/TableEvent;)Z
    .locals 7

    iget-object v0, p0, Lorg/snmp4j/tools/console/SnmpRequest$CVSTableListener;->this$0:Lorg/snmp4j/tools/console/SnmpRequest;

    iget v0, v0, Lorg/snmp4j/tools/console/SnmpRequest;->operation:I

    const/4 v1, 0x5

    const-string v2, ","

    if-ne v0, v1, :cond_0

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    iget-wide v3, p0, Lorg/snmp4j/tools/console/SnmpRequest$CVSTableListener;->requestTime:J

    invoke-virtual {v0, v3, v4}, Ljava/io/PrintStream;->print(J)V

    invoke-virtual {v0, v2}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    :cond_0
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\""

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/snmp4j/util/TableEvent;->getIndex()Lorg/snmp4j/smi/OID;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, "\","

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_1
    :goto_0
    invoke-virtual {p1}, Lorg/snmp4j/util/TableEvent;->getColumns()[Lorg/snmp4j/smi/VariableBinding;

    move-result-object v1

    array-length v1, v1

    const/4 v4, 0x1

    if-ge v0, v1, :cond_5

    invoke-virtual {p1}, Lorg/snmp4j/util/TableEvent;->getColumns()[Lorg/snmp4j/smi/VariableBinding;

    move-result-object v1

    aget-object v1, v1, v0

    invoke-virtual {v1}, Lorg/snmp4j/smi/VariableBinding;->getVariable()Lorg/snmp4j/smi/Variable;

    move-result-object v1

    invoke-interface {v1}, Lorg/snmp4j/smi/Variable;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v1}, Lorg/snmp4j/smi/Variable;->getSyntax()I

    move-result v1

    const/4 v6, 0x4

    if-eq v1, v6, :cond_2

    const/4 v4, 0x6

    if-eq v1, v4, :cond_4

    const/16 v4, 0x40

    if-eq v1, v4, :cond_4

    const/16 v4, 0x44

    if-eq v1, v4, :cond_4

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v5}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    invoke-direct {v1, v6}, Ljava/lang/StringBuffer;-><init>(I)V

    new-instance v6, Ljava/util/StringTokenizer;

    invoke-direct {v6, v5, v3, v4}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    :cond_3
    :goto_1
    invoke-virtual {v6}, Ljava/util/StringTokenizer;->hasMoreTokens()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {v6}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_1

    :cond_4
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v3}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    invoke-virtual {v1, v5}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    :goto_2
    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p1}, Lorg/snmp4j/util/TableEvent;->getColumns()[Lorg/snmp4j/smi/VariableBinding;

    move-result-object v1

    array-length v1, v1

    if-ge v0, v1, :cond_1

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {p1}, Ljava/io/PrintStream;->println()V

    return v4
.end method
