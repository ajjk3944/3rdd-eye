.class public Lkj/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkj/d$a;
    }
.end annotation


# static fields
.field private static final l:Ljava/lang/String; = "kj.d"


# instance fields
.field private a:Lorg/eclipse/paho/client/mqttv3/logging/a;

.field private b:Lkj/d$a;

.field private c:Lkj/d$a;

.field private final d:Ljava/lang/Object;

.field private e:Ljava/lang/String;

.field private f:Ljava/util/concurrent/Future;

.field private g:Lkj/b;

.field private h:Lkj/a;

.field private i:Lnj/f;

.field private j:Lkj/f;

.field private k:Ljava/lang/Thread;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lkj/a;Lkj/b;Lkj/f;Ljava/io/InputStream;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string/jumbo v0, "org.eclipse.paho.client.mqttv3.internal.nls.logcat"

    sget-object v1, Lkj/d;->l:Ljava/lang/String;

    invoke-static {v0, v1}, Lorg/eclipse/paho/client/mqttv3/logging/b;->a(Ljava/lang/String;Ljava/lang/String;)Lorg/eclipse/paho/client/mqttv3/logging/a;

    move-result-object v0

    iput-object v0, p0, Lkj/d;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v0, Lkj/d$a;->STOPPED:Lkj/d$a;

    iput-object v0, p0, Lkj/d;->b:Lkj/d$a;

    iput-object v0, p0, Lkj/d;->c:Lkj/d$a;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lkj/d;->d:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, p0, Lkj/d;->g:Lkj/b;

    iput-object v0, p0, Lkj/d;->h:Lkj/a;

    iput-object v0, p0, Lkj/d;->j:Lkj/f;

    iput-object v0, p0, Lkj/d;->k:Ljava/lang/Thread;

    new-instance v0, Lnj/f;

    invoke-direct {v0, p2, p4}, Lnj/f;-><init>(Lkj/b;Ljava/io/InputStream;)V

    iput-object v0, p0, Lkj/d;->i:Lnj/f;

    iput-object p1, p0, Lkj/d;->h:Lkj/a;

    iput-object p2, p0, Lkj/d;->g:Lkj/b;

    iput-object p3, p0, Lkj/d;->j:Lkj/f;

    iget-object p2, p0, Lkj/d;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    invoke-virtual {p1}, Lkj/a;->B()Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    move-result-object p1

    invoke-interface {p1}, Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;->getClientId()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lorg/eclipse/paho/client/mqttv3/logging/a;->setResourceName(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 4

    iget-object v0, p0, Lkj/d;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lkj/d;->b:Lkj/d$a;

    sget-object v2, Lkj/d$a;->RUNNING:Lkj/d$a;

    if-eq v1, v2, :cond_0

    sget-object v3, Lkj/d$a;->RECEIVING:Lkj/d$a;

    if-ne v1, v3, :cond_1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_0
    :goto_0
    iget-object v1, p0, Lkj/d;->c:Lkj/d$a;

    if-ne v1, v2, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    monitor-exit v0

    return v1

    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public b(Ljava/lang/String;Ljava/util/concurrent/ExecutorService;)V
    .locals 3

    iput-object p1, p0, Lkj/d;->e:Ljava/lang/String;

    iget-object p1, p0, Lkj/d;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v0, Lkj/d;->l:Ljava/lang/String;

    const-string/jumbo v1, "start"

    const-string v2, "855"

    invoke-interface {p1, v0, v1, v2}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lkj/d;->d:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lkj/d;->b:Lkj/d$a;

    sget-object v1, Lkj/d$a;->STOPPED:Lkj/d$a;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lkj/d;->c:Lkj/d$a;

    if-ne v0, v1, :cond_1

    sget-object v0, Lkj/d$a;->RUNNING:Lkj/d$a;

    iput-object v0, p0, Lkj/d;->c:Lkj/d$a;

    if-nez p2, :cond_0

    new-instance p2, Ljava/lang/Thread;

    invoke-direct {p2, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {p2}, Ljava/lang/Thread;->start()V

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_2

    :cond_0
    invoke-interface {p2, p0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object p2

    iput-object p2, p0, Lkj/d;->f:Ljava/util/concurrent/Future;

    :cond_1
    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catch_0
    :goto_1
    invoke-virtual {p0}, Lkj/d;->a()Z

    move-result p1

    if-eqz p1, :cond_2

    return-void

    :cond_2
    const-wide/16 p1, 0x64

    :try_start_1
    invoke-static {p1, p2}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :goto_2
    :try_start_2
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p2
.end method

.method public c()V
    .locals 5

    iget-object v0, p0, Lkj/d;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lkj/d;->f:Ljava/util/concurrent/Future;

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_0
    :goto_0
    iget-object v1, p0, Lkj/d;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v2, Lkj/d;->l:Ljava/lang/String;

    const-string/jumbo v3, "stop"

    const-string v4, "850"

    invoke-interface {v1, v2, v3, v4}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lkj/d;->a()Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Lkj/d$a;->STOPPED:Lkj/d$a;

    iput-object v1, p0, Lkj/d;->c:Lkj/d$a;

    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catch_0
    :goto_1
    invoke-virtual {p0}, Lkj/d;->a()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lkj/d;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v1, Lkj/d;->l:Ljava/lang/String;

    const-string/jumbo v2, "stop"

    const-string v3, "851"

    invoke-interface {v0, v1, v2, v3}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    const-wide/16 v0, 0x64

    :try_start_1
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :goto_2
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public run()V
    .locals 9

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iput-object v0, p0, Lkj/d;->k:Ljava/lang/Thread;

    iget-object v1, p0, Lkj/d;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    iget-object v0, p0, Lkj/d;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lkj/d$a;->RUNNING:Lkj/d$a;

    iput-object v1, p0, Lkj/d;->b:Lkj/d$a;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_f

    :try_start_1
    iget-object v0, p0, Lkj/d;->d:Ljava/lang/Object;

    monitor-enter v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    :try_start_2
    iget-object v1, p0, Lkj/d;->c:Lkj/d$a;

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_d

    const/4 v0, 0x0

    move-object v2, v0

    :goto_0
    :try_start_3
    sget-object v3, Lkj/d$a;->RUNNING:Lkj/d$a;

    if-ne v1, v3, :cond_a

    iget-object v1, p0, Lkj/d;->i:Lnj/f;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    if-nez v1, :cond_0

    goto/16 :goto_9

    :cond_0
    :try_start_4
    iget-object v1, p0, Lkj/d;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v4, Lkj/d;->l:Ljava/lang/String;

    const-string/jumbo v5, "run"

    const-string v6, "852"

    invoke-interface {v1, v4, v5, v6}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lkj/d;->i:Lnj/f;

    invoke-virtual {v1}, Lnj/f;->available()I

    move-result v1

    if-lez v1, :cond_1

    iget-object v1, p0, Lkj/d;->d:Ljava/lang/Object;

    monitor-enter v1
    :try_end_4
    .catch Lorg/eclipse/paho/client/mqttv3/MqttException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    sget-object v5, Lkj/d$a;->RECEIVING:Lkj/d$a;

    iput-object v5, p0, Lkj/d;->b:Lkj/d$a;

    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception v3

    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    throw v3

    :catchall_1
    move-exception v0

    goto/16 :goto_8

    :catch_0
    move-exception v1

    goto/16 :goto_4

    :catch_1
    move-exception v1

    goto/16 :goto_6

    :cond_1
    :goto_1
    iget-object v1, p0, Lkj/d;->i:Lnj/f;

    invoke-virtual {v1}, Lnj/f;->g()Lnj/u;

    move-result-object v1

    iget-object v5, p0, Lkj/d;->d:Ljava/lang/Object;

    monitor-enter v5
    :try_end_6
    .catch Lorg/eclipse/paho/client/mqttv3/MqttException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :try_start_7
    iput-object v3, p0, Lkj/d;->b:Lkj/d$a;

    monitor-exit v5
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    :try_start_8
    instance-of v5, v1, Lnj/b;

    if-eqz v5, :cond_5

    iget-object v5, p0, Lkj/d;->j:Lkj/f;

    invoke-virtual {v5, v1}, Lkj/f;->f(Lnj/u;)Lorg/eclipse/paho/client/mqttv3/MqttToken;

    move-result-object v2

    if-eqz v2, :cond_2

    monitor-enter v2
    :try_end_8
    .catch Lorg/eclipse/paho/client/mqttv3/MqttException; {:try_start_8 .. :try_end_8} :catch_1
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :try_start_9
    iget-object v4, p0, Lkj/d;->g:Lkj/b;

    check-cast v1, Lnj/b;

    invoke-virtual {v4, v1}, Lkj/b;->y(Lnj/b;)V

    monitor-exit v2

    goto :goto_3

    :catchall_2
    move-exception v1

    monitor-exit v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    :try_start_a
    throw v1

    :cond_2
    instance-of v5, v1, Lnj/m;

    if-nez v5, :cond_4

    instance-of v5, v1, Lnj/l;

    if-nez v5, :cond_4

    instance-of v1, v1, Lnj/k;

    if-eqz v1, :cond_3

    goto :goto_2

    :cond_3
    new-instance v1, Lorg/eclipse/paho/client/mqttv3/MqttException;

    const/4 v3, 0x6

    invoke-direct {v1, v3}, Lorg/eclipse/paho/client/mqttv3/MqttException;-><init>(I)V

    throw v1

    :cond_4
    :goto_2
    iget-object v1, p0, Lkj/d;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    const-string/jumbo v5, "run"

    const-string v6, "857"

    invoke-interface {v1, v4, v5, v6}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :cond_5
    if-eqz v1, :cond_6

    iget-object v4, p0, Lkj/d;->g:Lkj/b;

    invoke-virtual {v4, v1}, Lkj/b;->A(Lnj/u;)V

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lkj/d;->h:Lkj/a;

    invoke-virtual {v1}, Lkj/a;->K()Z

    move-result v1

    if-nez v1, :cond_8

    iget-object v1, p0, Lkj/d;->h:Lkj/a;

    invoke-virtual {v1}, Lkj/a;->L()Z

    move-result v1

    if-eqz v1, :cond_7

    goto :goto_3

    :cond_7
    new-instance v1, Ljava/io/IOException;

    const-string v3, "Connection is lost."

    invoke-direct {v1, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_a
    .catch Lorg/eclipse/paho/client/mqttv3/MqttException; {:try_start_a .. :try_end_a} :catch_1
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_0
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    :cond_8
    :goto_3
    :try_start_b
    iget-object v1, p0, Lkj/d;->d:Ljava/lang/Object;

    monitor-enter v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    :try_start_c
    iput-object v3, p0, Lkj/d;->b:Lkj/d$a;

    monitor-exit v1

    goto :goto_7

    :catchall_3
    move-exception v0

    monitor-exit v1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    :try_start_d
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    :catchall_4
    move-exception v0

    goto/16 :goto_a

    :catchall_5
    move-exception v1

    :try_start_e
    monitor-exit v5
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    :try_start_f
    throw v1
    :try_end_f
    .catch Lorg/eclipse/paho/client/mqttv3/MqttException; {:try_start_f .. :try_end_f} :catch_1
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_0
    .catchall {:try_start_f .. :try_end_f} :catchall_1

    :goto_4
    :try_start_10
    iget-object v3, p0, Lkj/d;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v4, Lkj/d;->l:Ljava/lang/String;

    const-string/jumbo v5, "run"

    const-string v6, "853"

    invoke-interface {v3, v4, v5, v6}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, p0, Lkj/d;->c:Lkj/d$a;

    sget-object v4, Lkj/d$a;->STOPPED:Lkj/d$a;

    if-eq v3, v4, :cond_9

    iget-object v3, p0, Lkj/d;->d:Ljava/lang/Object;

    monitor-enter v3
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_1

    :try_start_11
    iput-object v4, p0, Lkj/d;->c:Lkj/d$a;

    monitor-exit v3
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_6

    :try_start_12
    iget-object v3, p0, Lkj/d;->h:Lkj/a;

    invoke-virtual {v3}, Lkj/a;->N()Z

    move-result v3

    if-nez v3, :cond_9

    iget-object v3, p0, Lkj/d;->h:Lkj/a;

    new-instance v4, Lorg/eclipse/paho/client/mqttv3/MqttException;

    const/16 v5, 0x7d6d

    invoke-direct {v4, v5, v1}, Lorg/eclipse/paho/client/mqttv3/MqttException;-><init>(ILjava/lang/Throwable;)V

    invoke-virtual {v3, v2, v4}, Lkj/a;->b0(Lorg/eclipse/paho/client/mqttv3/MqttToken;Lorg/eclipse/paho/client/mqttv3/MqttException;)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_1

    goto :goto_5

    :catchall_6
    move-exception v0

    :try_start_13
    monitor-exit v3
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_6

    :try_start_14
    throw v0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_1

    :cond_9
    :goto_5
    :try_start_15
    iget-object v1, p0, Lkj/d;->d:Ljava/lang/Object;

    monitor-enter v1
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_4

    :try_start_16
    sget-object v3, Lkj/d$a;->RUNNING:Lkj/d$a;

    iput-object v3, p0, Lkj/d;->b:Lkj/d$a;

    monitor-exit v1

    goto :goto_7

    :catchall_7
    move-exception v0

    monitor-exit v1
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_7

    :try_start_17
    throw v0
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_4

    :goto_6
    :try_start_18
    iget-object v3, p0, Lkj/d;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v4, Lkj/d;->l:Ljava/lang/String;

    const-string/jumbo v5, "run"

    const-string v6, "856"

    const/4 v7, 0x0

    move-object v8, v1

    invoke-interface/range {v3 .. v8}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    iget-object v3, p0, Lkj/d;->d:Ljava/lang/Object;

    monitor-enter v3
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_1

    :try_start_19
    sget-object v4, Lkj/d$a;->STOPPED:Lkj/d$a;

    iput-object v4, p0, Lkj/d;->c:Lkj/d$a;

    monitor-exit v3
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_a

    :try_start_1a
    iget-object v3, p0, Lkj/d;->h:Lkj/a;

    invoke-virtual {v3, v2, v1}, Lkj/a;->b0(Lorg/eclipse/paho/client/mqttv3/MqttToken;Lorg/eclipse/paho/client/mqttv3/MqttException;)V
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_1

    :try_start_1b
    iget-object v1, p0, Lkj/d;->d:Ljava/lang/Object;

    monitor-enter v1
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_4

    :try_start_1c
    sget-object v3, Lkj/d$a;->RUNNING:Lkj/d$a;

    iput-object v3, p0, Lkj/d;->b:Lkj/d$a;

    monitor-exit v1
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_9

    :goto_7
    :try_start_1d
    iget-object v1, p0, Lkj/d;->d:Ljava/lang/Object;

    monitor-enter v1
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_4

    :try_start_1e
    iget-object v3, p0, Lkj/d;->c:Lkj/d$a;

    monitor-exit v1

    move-object v1, v3

    goto/16 :goto_0

    :catchall_8
    move-exception v0

    monitor-exit v1
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_8

    :try_start_1f
    throw v0
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_4

    :catchall_9
    move-exception v0

    :try_start_20
    monitor-exit v1
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_9

    :try_start_21
    throw v0
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_4

    :catchall_a
    move-exception v0

    :try_start_22
    monitor-exit v3
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_a

    :try_start_23
    throw v0
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_1

    :goto_8
    :try_start_24
    iget-object v1, p0, Lkj/d;->d:Ljava/lang/Object;

    monitor-enter v1
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_4

    :try_start_25
    sget-object v2, Lkj/d$a;->RUNNING:Lkj/d$a;

    iput-object v2, p0, Lkj/d;->b:Lkj/d$a;

    monitor-exit v1
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_b

    :try_start_26
    throw v0
    :try_end_26
    .catchall {:try_start_26 .. :try_end_26} :catchall_4

    :catchall_b
    move-exception v0

    :try_start_27
    monitor-exit v1
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_b

    :try_start_28
    throw v0
    :try_end_28
    .catchall {:try_start_28 .. :try_end_28} :catchall_4

    :cond_a
    :goto_9
    iget-object v1, p0, Lkj/d;->d:Ljava/lang/Object;

    monitor-enter v1

    :try_start_29
    sget-object v2, Lkj/d$a;->STOPPED:Lkj/d$a;

    iput-object v2, p0, Lkj/d;->b:Lkj/d$a;

    monitor-exit v1
    :try_end_29
    .catchall {:try_start_29 .. :try_end_29} :catchall_c

    iput-object v0, p0, Lkj/d;->k:Ljava/lang/Thread;

    iget-object v0, p0, Lkj/d;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v1, Lkj/d;->l:Ljava/lang/String;

    const-string/jumbo v2, "run"

    const-string v3, "854"

    invoke-interface {v0, v1, v2, v3}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :catchall_c
    move-exception v0

    :try_start_2a
    monitor-exit v1
    :try_end_2a
    .catchall {:try_start_2a .. :try_end_2a} :catchall_c

    throw v0

    :catchall_d
    move-exception v1

    :try_start_2b
    monitor-exit v0
    :try_end_2b
    .catchall {:try_start_2b .. :try_end_2b} :catchall_d

    :try_start_2c
    throw v1
    :try_end_2c
    .catchall {:try_start_2c .. :try_end_2c} :catchall_4

    :goto_a
    iget-object v1, p0, Lkj/d;->d:Ljava/lang/Object;

    monitor-enter v1

    :try_start_2d
    sget-object v2, Lkj/d$a;->STOPPED:Lkj/d$a;

    iput-object v2, p0, Lkj/d;->b:Lkj/d$a;

    monitor-exit v1
    :try_end_2d
    .catchall {:try_start_2d .. :try_end_2d} :catchall_e

    throw v0

    :catchall_e
    move-exception v0

    :try_start_2e
    monitor-exit v1
    :try_end_2e
    .catchall {:try_start_2e .. :try_end_2e} :catchall_e

    throw v0

    :catchall_f
    move-exception v1

    :try_start_2f
    monitor-exit v0
    :try_end_2f
    .catchall {:try_start_2f .. :try_end_2f} :catchall_f

    throw v1
.end method
