.class Lorg/snmp4j/transport/TLSTM$SocketTimeout;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/transport/TLSTM;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "SocketTimeout"
.end annotation


# instance fields
.field private entry:Lorg/snmp4j/transport/TLSTM$SocketEntry;

.field final synthetic this$0:Lorg/snmp4j/transport/TLSTM;


# direct methods
.method public constructor <init>(Lorg/snmp4j/transport/TLSTM;Lorg/snmp4j/transport/TLSTM$SocketEntry;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/transport/TLSTM$SocketTimeout;->this$0:Lorg/snmp4j/transport/TLSTM;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    iput-object p2, p0, Lorg/snmp4j/transport/TLSTM$SocketTimeout;->entry:Lorg/snmp4j/transport/TLSTM$SocketEntry;

    return-void
.end method


# virtual methods
.method public cancel()Z
    .locals 2

    invoke-super {p0}, Ljava/util/TimerTask;->cancel()Z

    move-result v0

    const/4 v1, 0x0

    iput-object v1, p0, Lorg/snmp4j/transport/TLSTM$SocketTimeout;->entry:Lorg/snmp4j/transport/TLSTM$SocketEntry;

    return v0
.end method

.method public run()V
    .locals 8

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iget-object v2, p0, Lorg/snmp4j/transport/TLSTM$SocketTimeout;->this$0:Lorg/snmp4j/transport/TLSTM;

    invoke-static {v2}, Lorg/snmp4j/transport/TLSTM;->access$800(Lorg/snmp4j/transport/TLSTM;)Lorg/snmp4j/util/CommonTimer;

    move-result-object v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lorg/snmp4j/transport/TLSTM$SocketTimeout;->entry:Lorg/snmp4j/transport/TLSTM$SocketEntry;

    invoke-virtual {v2}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->getLastUse()J

    move-result-wide v2

    sub-long v2, v0, v2

    const-wide/32 v4, 0xf4240

    div-long/2addr v2, v4

    iget-object v6, p0, Lorg/snmp4j/transport/TLSTM$SocketTimeout;->this$0:Lorg/snmp4j/transport/TLSTM;

    invoke-static {v6}, Lorg/snmp4j/transport/TLSTM;->access$900(Lorg/snmp4j/transport/TLSTM;)J

    move-result-wide v6

    cmp-long v2, v2, v6

    if-ltz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-object v6, p0, Lorg/snmp4j/transport/TLSTM$SocketTimeout;->entry:Lorg/snmp4j/transport/TLSTM$SocketEntry;

    invoke-virtual {v6}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->getLastUse()J

    move-result-wide v6

    sub-long/2addr v0, v6

    div-long/2addr v0, v4

    add-long/2addr v2, v0

    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM$SocketTimeout;->this$0:Lorg/snmp4j/transport/TLSTM;

    invoke-static {v0}, Lorg/snmp4j/transport/TLSTM;->access$900(Lorg/snmp4j/transport/TLSTM;)J

    move-result-wide v0

    add-long/2addr v2, v0

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Scheduling "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_1
    new-instance v0, Lorg/snmp4j/transport/TLSTM$SocketTimeout;

    iget-object v1, p0, Lorg/snmp4j/transport/TLSTM$SocketTimeout;->this$0:Lorg/snmp4j/transport/TLSTM;

    iget-object v4, p0, Lorg/snmp4j/transport/TLSTM$SocketTimeout;->entry:Lorg/snmp4j/transport/TLSTM$SocketEntry;

    invoke-direct {v0, v1, v4}, Lorg/snmp4j/transport/TLSTM$SocketTimeout;-><init>(Lorg/snmp4j/transport/TLSTM;Lorg/snmp4j/transport/TLSTM$SocketEntry;)V

    iget-object v1, p0, Lorg/snmp4j/transport/TLSTM$SocketTimeout;->entry:Lorg/snmp4j/transport/TLSTM$SocketEntry;

    invoke-virtual {v1, v0}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->setSocketTimeout(Lorg/snmp4j/transport/TLSTM$SocketTimeout;)V

    iget-object v1, p0, Lorg/snmp4j/transport/TLSTM$SocketTimeout;->this$0:Lorg/snmp4j/transport/TLSTM;

    invoke-static {v1}, Lorg/snmp4j/transport/TLSTM;->access$800(Lorg/snmp4j/transport/TLSTM;)Lorg/snmp4j/util/CommonTimer;

    move-result-object v1

    invoke-interface {v1, v0, v2, v3}, Lorg/snmp4j/util/CommonTimer;->schedule(Ljava/util/TimerTask;J)V

    goto :goto_2

    :cond_2
    :goto_0
    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v2

    invoke-interface {v2}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Socket has not been used for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lorg/snmp4j/transport/TLSTM$SocketTimeout;->entry:Lorg/snmp4j/transport/TLSTM$SocketEntry;

    invoke-virtual {v4}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->getLastUse()J

    move-result-wide v4

    sub-long/2addr v0, v4

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " milliseconds, closing it"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_3
    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM$SocketTimeout;->this$0:Lorg/snmp4j/transport/TLSTM;

    iget-object v1, p0, Lorg/snmp4j/transport/TLSTM$SocketTimeout;->entry:Lorg/snmp4j/transport/TLSTM$SocketEntry;

    invoke-virtual {v1}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->getPeerAddress()Lorg/snmp4j/smi/TcpAddress;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/snmp4j/transport/TLSTM;->removeSocketEntry(Lorg/snmp4j/smi/TcpAddress;)Ljava/lang/Object;

    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM$SocketTimeout;->entry:Lorg/snmp4j/transport/TLSTM$SocketEntry;

    :try_start_0
    monitor-enter v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-virtual {v0}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->getSocket()Ljava/net/Socket;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/Socket;->close()V

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Socket to "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->getPeerAddress()Lorg/snmp4j/smi/TcpAddress;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " closed due to timeout"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lorg/snmp4j/log/LogAdapter;->info(Ljava/lang/CharSequence;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_1

    :catchall_0
    move-exception v1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :goto_1
    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v1

    invoke-interface {v1, v0}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    :goto_2
    return-void
.end method
