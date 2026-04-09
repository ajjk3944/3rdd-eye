.class public Lkj/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkj/e$a;
    }
.end annotation


# static fields
.field private static final l:Ljava/lang/String; = "kj.e"


# instance fields
.field private a:Lorg/eclipse/paho/client/mqttv3/logging/a;

.field private b:Lkj/e$a;

.field private c:Lkj/e$a;

.field private final d:Ljava/lang/Object;

.field private e:Ljava/lang/Thread;

.field private f:Ljava/lang/String;

.field private g:Ljava/util/concurrent/Future;

.field private h:Lkj/b;

.field private i:Lnj/g;

.field private j:Lkj/a;

.field private k:Lkj/f;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lkj/a;Lkj/b;Lkj/f;Ljava/io/OutputStream;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string/jumbo v0, "org.eclipse.paho.client.mqttv3.internal.nls.logcat"

    sget-object v1, Lkj/e;->l:Ljava/lang/String;

    invoke-static {v0, v1}, Lorg/eclipse/paho/client/mqttv3/logging/b;->a(Ljava/lang/String;Ljava/lang/String;)Lorg/eclipse/paho/client/mqttv3/logging/a;

    move-result-object v0

    iput-object v0, p0, Lkj/e;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v0, Lkj/e$a;->STOPPED:Lkj/e$a;

    iput-object v0, p0, Lkj/e;->b:Lkj/e$a;

    iput-object v0, p0, Lkj/e;->c:Lkj/e$a;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lkj/e;->d:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, p0, Lkj/e;->e:Ljava/lang/Thread;

    iput-object v0, p0, Lkj/e;->h:Lkj/b;

    iput-object v0, p0, Lkj/e;->j:Lkj/a;

    iput-object v0, p0, Lkj/e;->k:Lkj/f;

    new-instance v0, Lnj/g;

    invoke-direct {v0, p2, p4}, Lnj/g;-><init>(Lkj/b;Ljava/io/OutputStream;)V

    iput-object v0, p0, Lkj/e;->i:Lnj/g;

    iput-object p1, p0, Lkj/e;->j:Lkj/a;

    iput-object p2, p0, Lkj/e;->h:Lkj/b;

    iput-object p3, p0, Lkj/e;->k:Lkj/f;

    iget-object p2, p0, Lkj/e;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    invoke-virtual {p1}, Lkj/a;->B()Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    move-result-object p1

    invoke-interface {p1}, Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;->getClientId()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lorg/eclipse/paho/client/mqttv3/logging/a;->setResourceName(Ljava/lang/String;)V

    return-void
.end method

.method private a(Lnj/u;Ljava/lang/Exception;)V
    .locals 6

    iget-object v0, p0, Lkj/e;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v1, Lkj/e;->l:Ljava/lang/String;

    const-string/jumbo v2, "handleRunException"

    const-string v3, "804"

    const/4 v4, 0x0

    move-object v5, p2

    invoke-interface/range {v0 .. v5}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    instance-of p1, p2, Lorg/eclipse/paho/client/mqttv3/MqttException;

    if-nez p1, :cond_0

    new-instance p1, Lorg/eclipse/paho/client/mqttv3/MqttException;

    const/16 v0, 0x7d6d

    invoke-direct {p1, v0, p2}, Lorg/eclipse/paho/client/mqttv3/MqttException;-><init>(ILjava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    move-object p1, p2

    check-cast p1, Lorg/eclipse/paho/client/mqttv3/MqttException;

    :goto_0
    iget-object p2, p0, Lkj/e;->d:Ljava/lang/Object;

    monitor-enter p2

    :try_start_0
    sget-object v0, Lkj/e$a;->STOPPED:Lkj/e$a;

    iput-object v0, p0, Lkj/e;->c:Lkj/e$a;

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p2, p0, Lkj/e;->j:Lkj/a;

    const/4 v0, 0x0

    invoke-virtual {p2, v0, p1}, Lkj/a;->b0(Lorg/eclipse/paho/client/mqttv3/MqttToken;Lorg/eclipse/paho/client/mqttv3/MqttException;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method


# virtual methods
.method public b()Z
    .locals 3

    iget-object v0, p0, Lkj/e;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lkj/e;->b:Lkj/e$a;

    sget-object v2, Lkj/e$a;->RUNNING:Lkj/e$a;

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lkj/e;->c:Lkj/e$a;

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public c(Ljava/lang/String;Ljava/util/concurrent/ExecutorService;)V
    .locals 2

    iput-object p1, p0, Lkj/e;->f:Ljava/lang/String;

    iget-object p1, p0, Lkj/e;->d:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lkj/e;->b:Lkj/e$a;

    sget-object v1, Lkj/e$a;->STOPPED:Lkj/e$a;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lkj/e;->c:Lkj/e$a;

    if-ne v0, v1, :cond_1

    sget-object v0, Lkj/e$a;->RUNNING:Lkj/e$a;

    iput-object v0, p0, Lkj/e;->c:Lkj/e$a;

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

    iput-object p2, p0, Lkj/e;->g:Ljava/util/concurrent/Future;

    :cond_1
    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catch_0
    :goto_1
    invoke-virtual {p0}, Lkj/e;->b()Z

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

.method public d()V
    .locals 5

    invoke-virtual {p0}, Lkj/e;->b()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lkj/e;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lkj/e;->g:Ljava/util/concurrent/Future;

    if-eqz v1, :cond_1

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_1
    :goto_0
    iget-object v1, p0, Lkj/e;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v2, Lkj/e;->l:Ljava/lang/String;

    const-string/jumbo v3, "stop"

    const-string v4, "800"

    invoke-interface {v1, v2, v3, v4}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lkj/e;->b()Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v1, Lkj/e$a;->STOPPED:Lkj/e$a;

    iput-object v1, p0, Lkj/e;->c:Lkj/e$a;

    iget-object v1, p0, Lkj/e;->h:Lkj/b;

    invoke-virtual {v1}, Lkj/b;->x()V

    :cond_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    invoke-virtual {p0}, Lkj/e;->b()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lkj/e;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v1, Lkj/e;->l:Ljava/lang/String;

    const-string/jumbo v2, "stop"

    const-string v3, "801"

    invoke-interface {v0, v1, v2, v3}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3
    const-wide/16 v0, 0x64

    :try_start_1
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    iget-object v0, p0, Lkj/e;->h:Lkj/b;

    invoke-virtual {v0}, Lkj/b;->x()V

    goto :goto_1

    :goto_2
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public run()V
    .locals 7

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iput-object v0, p0, Lkj/e;->e:Ljava/lang/Thread;

    iget-object v1, p0, Lkj/e;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    iget-object v0, p0, Lkj/e;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lkj/e$a;->RUNNING:Lkj/e$a;

    iput-object v1, p0, Lkj/e;->b:Lkj/e$a;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_7

    const/4 v0, 0x0

    :try_start_1
    iget-object v1, p0, Lkj/e;->d:Ljava/lang/Object;

    monitor-enter v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget-object v2, p0, Lkj/e;->c:Lkj/e$a;

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    move-object v1, v0

    :goto_0
    :try_start_3
    sget-object v3, Lkj/e$a;->RUNNING:Lkj/e$a;

    if-ne v2, v3, :cond_6

    iget-object v2, p0, Lkj/e;->i:Lnj/g;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-nez v2, :cond_0

    goto/16 :goto_6

    :cond_0
    :try_start_4
    iget-object v2, p0, Lkj/e;->h:Lkj/b;

    invoke-virtual {v2}, Lkj/b;->j()Lnj/u;

    move-result-object v1

    if-eqz v1, :cond_4

    iget-object v2, p0, Lkj/e;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v3, Lkj/e;->l:Ljava/lang/String;

    const-string/jumbo v4, "run"

    const-string v5, "802"

    invoke-virtual {v1}, Lnj/u;->i()Ljava/lang/String;

    move-result-object v6

    filled-new-array {v6, v1}, [Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v2, v3, v4, v5, v6}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    instance-of v2, v1, Lnj/b;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lkj/e;->i:Lnj/g;

    invoke-virtual {v2, v1}, Lnj/g;->a(Lnj/u;)V

    iget-object v2, p0, Lkj/e;->i:Lnj/g;

    invoke-virtual {v2}, Lnj/g;->flush()V

    goto :goto_5

    :catchall_0
    move-exception v1

    goto/16 :goto_7

    :catch_0
    move-exception v2

    goto :goto_3

    :catch_1
    move-exception v2

    goto :goto_4

    :cond_1
    invoke-virtual {v1}, Lnj/u;->m()Lorg/eclipse/paho/client/mqttv3/MqttToken;

    move-result-object v2

    if-nez v2, :cond_2

    iget-object v2, p0, Lkj/e;->k:Lkj/f;

    invoke-virtual {v2, v1}, Lkj/f;->f(Lnj/u;)Lorg/eclipse/paho/client/mqttv3/MqttToken;

    move-result-object v2

    :cond_2
    if-eqz v2, :cond_5

    monitor-enter v2
    :try_end_4
    .catch Lorg/eclipse/paho/client/mqttv3/MqttException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    iget-object v3, p0, Lkj/e;->i:Lnj/g;

    invoke-virtual {v3, v1}, Lnj/g;->a(Lnj/u;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :try_start_6
    iget-object v3, p0, Lkj/e;->i:Lnj/g;

    invoke-virtual {v3}, Lnj/g;->flush()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v3

    goto :goto_2

    :catch_2
    move-exception v3

    :try_start_7
    instance-of v4, v1, Lnj/e;

    if-eqz v4, :cond_3

    :goto_1
    iget-object v3, p0, Lkj/e;->h:Lkj/b;

    invoke-virtual {v3, v1}, Lkj/b;->C(Lnj/u;)V

    monitor-exit v2

    goto :goto_5

    :cond_3
    throw v3

    :goto_2
    monitor-exit v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :try_start_8
    throw v3

    :cond_4
    iget-object v2, p0, Lkj/e;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v3, Lkj/e;->l:Ljava/lang/String;

    const-string/jumbo v4, "run"

    const-string v5, "803"

    invoke-interface {v2, v3, v4, v5}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Lkj/e;->d:Ljava/lang/Object;

    monitor-enter v2
    :try_end_8
    .catch Lorg/eclipse/paho/client/mqttv3/MqttException; {:try_start_8 .. :try_end_8} :catch_1
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :try_start_9
    sget-object v3, Lkj/e$a;->STOPPED:Lkj/e$a;

    iput-object v3, p0, Lkj/e;->c:Lkj/e$a;

    monitor-exit v2

    goto :goto_5

    :catchall_2
    move-exception v3

    monitor-exit v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    :try_start_a
    throw v3
    :try_end_a
    .catch Lorg/eclipse/paho/client/mqttv3/MqttException; {:try_start_a .. :try_end_a} :catch_1
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_0
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    :goto_3
    :try_start_b
    invoke-direct {p0, v1, v2}, Lkj/e;->a(Lnj/u;Ljava/lang/Exception;)V

    goto :goto_5

    :goto_4
    invoke-direct {p0, v1, v2}, Lkj/e;->a(Lnj/u;Ljava/lang/Exception;)V

    :cond_5
    :goto_5
    iget-object v2, p0, Lkj/e;->d:Ljava/lang/Object;

    monitor-enter v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    :try_start_c
    iget-object v3, p0, Lkj/e;->c:Lkj/e$a;

    monitor-exit v2

    move-object v2, v3

    goto/16 :goto_0

    :catchall_3
    move-exception v1

    monitor-exit v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    :try_start_d
    throw v1
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    :cond_6
    :goto_6
    iget-object v1, p0, Lkj/e;->d:Ljava/lang/Object;

    monitor-enter v1

    :try_start_e
    sget-object v2, Lkj/e$a;->STOPPED:Lkj/e$a;

    iput-object v2, p0, Lkj/e;->b:Lkj/e$a;

    iput-object v0, p0, Lkj/e;->e:Ljava/lang/Thread;

    monitor-exit v1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    iget-object v0, p0, Lkj/e;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v1, Lkj/e;->l:Ljava/lang/String;

    const-string/jumbo v2, "run"

    const-string v3, "805"

    invoke-interface {v0, v1, v2, v3}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :catchall_4
    move-exception v0

    :try_start_f
    monitor-exit v1
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_4

    throw v0

    :catchall_5
    move-exception v2

    :try_start_10
    monitor-exit v1
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_5

    :try_start_11
    throw v2
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    :goto_7
    iget-object v2, p0, Lkj/e;->d:Ljava/lang/Object;

    monitor-enter v2

    :try_start_12
    sget-object v3, Lkj/e$a;->STOPPED:Lkj/e$a;

    iput-object v3, p0, Lkj/e;->b:Lkj/e$a;

    iput-object v0, p0, Lkj/e;->e:Ljava/lang/Thread;

    monitor-exit v2
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_6

    throw v1

    :catchall_6
    move-exception v0

    :try_start_13
    monitor-exit v2
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_6

    throw v0

    :catchall_7
    move-exception v1

    :try_start_14
    monitor-exit v0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_7

    throw v1
.end method
