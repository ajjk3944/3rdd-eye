.class Lorg/snmp4j/tools/console/SnmpRequest$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/util/TreeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/snmp4j/tools/console/SnmpRequest;->walk(Lorg/snmp4j/Snmp;Lorg/snmp4j/PDU;Lorg/snmp4j/Target;Ljava/util/List;)Lorg/snmp4j/PDU;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private finished:Z

.field final synthetic this$0:Lorg/snmp4j/tools/console/SnmpRequest;

.field final synthetic val$counts:Lorg/snmp4j/tools/console/SnmpRequest$WalkCounts;

.field final synthetic val$snapshot:Ljava/util/List;

.field final synthetic val$startTime:J


# direct methods
.method constructor <init>(Lorg/snmp4j/tools/console/SnmpRequest;Lorg/snmp4j/tools/console/SnmpRequest$WalkCounts;Ljava/util/List;J)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/tools/console/SnmpRequest$1;->this$0:Lorg/snmp4j/tools/console/SnmpRequest;

    iput-object p2, p0, Lorg/snmp4j/tools/console/SnmpRequest$1;->val$counts:Lorg/snmp4j/tools/console/SnmpRequest$WalkCounts;

    iput-object p3, p0, Lorg/snmp4j/tools/console/SnmpRequest$1;->val$snapshot:Ljava/util/List;

    iput-wide p4, p0, Lorg/snmp4j/tools/console/SnmpRequest$1;->val$startTime:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public finished(Lorg/snmp4j/util/TreeEvent;)V
    .locals 6

    invoke-virtual {p1}, Lorg/snmp4j/util/TreeEvent;->getVariableBindings()[Lorg/snmp4j/smi/VariableBinding;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lorg/snmp4j/util/TreeEvent;->getVariableBindings()[Lorg/snmp4j/smi/VariableBinding;

    move-result-object v0

    array-length v0, v0

    if-lez v0, :cond_0

    invoke-virtual {p0, p1}, Lorg/snmp4j/tools/console/SnmpRequest$1;->next(Lorg/snmp4j/util/TreeEvent;)Z

    :cond_0
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0}, Ljava/io/PrintStream;->println()V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Total requests sent:    "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lorg/snmp4j/tools/console/SnmpRequest$1;->val$counts:Lorg/snmp4j/tools/console/SnmpRequest$WalkCounts;

    iget v2, v2, Lorg/snmp4j/tools/console/SnmpRequest$WalkCounts;->requests:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Total objects received: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lorg/snmp4j/tools/console/SnmpRequest$1;->val$counts:Lorg/snmp4j/tools/console/SnmpRequest$WalkCounts;

    iget v2, v2, Lorg/snmp4j/tools/console/SnmpRequest$WalkCounts;->objects:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Total walk time:        "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    iget-wide v4, p0, Lorg/snmp4j/tools/console/SnmpRequest$1;->val$startTime:J

    sub-long/2addr v2, v4

    const-wide/32 v4, 0xf4240

    div-long/2addr v2, v4

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " milliseconds"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    invoke-virtual {p1}, Lorg/snmp4j/util/RetrievalEvent;->isError()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string v1, "The following error occurred during walk:"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    invoke-virtual {p1}, Lorg/snmp4j/util/RetrievalEvent;->getErrorMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_1
    const/4 p1, 0x1

    iput-boolean p1, p0, Lorg/snmp4j/tools/console/SnmpRequest$1;->finished:Z

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public isFinished()Z
    .locals 1

    iget-boolean v0, p0, Lorg/snmp4j/tools/console/SnmpRequest$1;->finished:Z

    return v0
.end method

.method public next(Lorg/snmp4j/util/TreeEvent;)Z
    .locals 5

    iget-object v0, p0, Lorg/snmp4j/tools/console/SnmpRequest$1;->val$counts:Lorg/snmp4j/tools/console/SnmpRequest$WalkCounts;

    iget v1, v0, Lorg/snmp4j/tools/console/SnmpRequest$WalkCounts;->requests:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, v0, Lorg/snmp4j/tools/console/SnmpRequest$WalkCounts;->requests:I

    invoke-virtual {p1}, Lorg/snmp4j/util/TreeEvent;->getVariableBindings()[Lorg/snmp4j/smi/VariableBinding;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lorg/snmp4j/util/TreeEvent;->getVariableBindings()[Lorg/snmp4j/smi/VariableBinding;

    move-result-object p1

    iget-object v0, p0, Lorg/snmp4j/tools/console/SnmpRequest$1;->val$counts:Lorg/snmp4j/tools/console/SnmpRequest$WalkCounts;

    iget v1, v0, Lorg/snmp4j/tools/console/SnmpRequest$WalkCounts;->objects:I

    array-length v3, p1

    add-int/2addr v1, v3

    iput v1, v0, Lorg/snmp4j/tools/console/SnmpRequest$WalkCounts;->objects:I

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v3, p1, v1

    iget-object v4, p0, Lorg/snmp4j/tools/console/SnmpRequest$1;->val$snapshot:Ljava/util/List;

    if-eqz v4, :cond_0

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v3}, Lorg/snmp4j/smi/VariableBinding;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v2
.end method
