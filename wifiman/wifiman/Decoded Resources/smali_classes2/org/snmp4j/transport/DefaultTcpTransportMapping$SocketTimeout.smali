.class Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketTimeout;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/transport/DefaultTcpTransportMapping;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "SocketTimeout"
.end annotation


# instance fields
.field private entry:Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;

.field final synthetic this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;


# direct methods
.method public constructor <init>(Lorg/snmp4j/transport/DefaultTcpTransportMapping;Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketTimeout;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    iput-object p2, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketTimeout;->entry:Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;

    return-void
.end method

.method private rescheduleCleanup(JLorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;)V
    .locals 3

    iget-object v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketTimeout;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    invoke-static {v0}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$100(Lorg/snmp4j/transport/DefaultTcpTransportMapping;)J

    move-result-wide v0

    sub-long/2addr v0, p1

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object p1

    invoke-interface {p1}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Scheduling "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_0
    new-instance p1, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketTimeout;

    iget-object p2, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketTimeout;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    invoke-direct {p1, p2, p3}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketTimeout;-><init>(Lorg/snmp4j/transport/DefaultTcpTransportMapping;Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;)V

    invoke-virtual {p3, p1}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->setSocketTimeout(Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketTimeout;)V

    iget-object p2, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketTimeout;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    iget-object p2, p2, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->socketCleaner:Lorg/snmp4j/util/CommonTimer;

    invoke-interface {p2, p1, v0, v1}, Lorg/snmp4j/util/CommonTimer;->schedule(Ljava/util/TimerTask;J)V

    return-void
.end method


# virtual methods
.method public cancel()Z
    .locals 2

    invoke-super {p0}, Ljava/util/TimerTask;->cancel()Z

    move-result v0

    const/4 v1, 0x0

    iput-object v1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketTimeout;->entry:Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;

    return v0
.end method

.method public run()V
    .locals 6

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iget-object v2, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketTimeout;->entry:Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;

    if-nez v2, :cond_0

    return-void

    :cond_0
    invoke-virtual {v2}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->getLastUse()J

    move-result-wide v3

    sub-long/2addr v0, v3

    const-wide/32 v3, 0xf4240

    div-long/2addr v0, v3

    iget-object v3, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketTimeout;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    iget-object v4, v3, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->socketCleaner:Lorg/snmp4j/util/CommonTimer;

    if-eqz v4, :cond_2

    invoke-static {v3}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$100(Lorg/snmp4j/transport/DefaultTcpTransportMapping;)J

    move-result-wide v3

    cmp-long v3, v0, v3

    if-ltz v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-direct {p0, v0, v1, v2}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketTimeout;->rescheduleCleanup(JLorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;)V

    goto/16 :goto_3

    :cond_2
    :goto_0
    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v3

    invoke-interface {v3}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Socket has not been used for "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v5, " milliseconds, closing it"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_3
    :try_start_0
    monitor-enter v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v3, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketTimeout;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    invoke-static {v3}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$100(Lorg/snmp4j/transport/DefaultTcpTransportMapping;)J

    move-result-wide v3

    cmp-long v3, v0, v3

    if-ltz v3, :cond_4

    iget-object v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketTimeout;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    invoke-virtual {v2}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->getPeerAddress()Lorg/snmp4j/smi/TcpAddress;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->removeSocketEntry(Lorg/snmp4j/smi/TcpAddress;)Ljava/lang/Object;

    invoke-virtual {v2}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->getSocket()Ljava/net/Socket;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/Socket;->close()V

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isInfoEnabled()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Socket to "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->getPeerAddress()Lorg/snmp4j/smi/TcpAddress;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " closed due to timeout"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->info(Ljava/lang/CharSequence;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_4
    invoke-direct {p0, v0, v1, v2}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketTimeout;->rescheduleCleanup(JLorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;)V

    :cond_5
    :goto_1
    monitor-exit v2

    goto :goto_3

    :goto_2
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception v0

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v1

    invoke-interface {v1, v0}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    :goto_3
    return-void
.end method
