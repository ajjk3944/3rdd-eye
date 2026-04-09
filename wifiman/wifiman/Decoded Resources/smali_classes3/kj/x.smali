.class public Lkj/x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final q:Ljava/lang/String; = "kj.x"


# instance fields
.field private a:Lorg/eclipse/paho/client/mqttv3/logging/a;

.field private volatile b:Z

.field private c:Z

.field private d:Z

.field private final e:Ljava/lang/Object;

.field private final f:Ljava/lang/Object;

.field protected g:Lorg/eclipse/paho/client/mqttv3/MqttMessage;

.field private h:Lnj/u;

.field private i:Lorg/eclipse/paho/client/mqttv3/MqttException;

.field private j:[Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

.field private m:Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;

.field private n:Ljava/lang/Object;

.field private o:I

.field private p:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string/jumbo v0, "org.eclipse.paho.client.mqttv3.internal.nls.logcat"

    sget-object v1, Lkj/x;->q:Ljava/lang/String;

    invoke-static {v0, v1}, Lorg/eclipse/paho/client/mqttv3/logging/b;->a(Ljava/lang/String;Ljava/lang/String;)Lorg/eclipse/paho/client/mqttv3/logging/a;

    move-result-object v0

    iput-object v0, p0, Lkj/x;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lkj/x;->b:Z

    iput-boolean v0, p0, Lkj/x;->c:Z

    iput-boolean v0, p0, Lkj/x;->d:Z

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lkj/x;->e:Ljava/lang/Object;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lkj/x;->f:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-object v1, p0, Lkj/x;->g:Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    iput-object v1, p0, Lkj/x;->h:Lnj/u;

    iput-object v1, p0, Lkj/x;->i:Lorg/eclipse/paho/client/mqttv3/MqttException;

    iput-object v1, p0, Lkj/x;->j:[Ljava/lang/String;

    iput-object v1, p0, Lkj/x;->l:Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    iput-object v1, p0, Lkj/x;->m:Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;

    iput-object v1, p0, Lkj/x;->n:Ljava/lang/Object;

    iput v0, p0, Lkj/x;->o:I

    iput-boolean v0, p0, Lkj/x;->p:Z

    iget-object v0, p0, Lkj/x;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    invoke-interface {v0, p1}, Lorg/eclipse/paho/client/mqttv3/logging/a;->setResourceName(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public A([Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    iput-object p1, p0, Lkj/x;->j:[Ljava/lang/String;

    return-void
.end method

.method public B(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lkj/x;->n:Ljava/lang/Object;

    return-void
.end method

.method public C(J)V
    .locals 5

    iget-object v0, p0, Lkj/x;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v1, Lkj/x;->q:Ljava/lang/String;

    invoke-virtual {p0}, Lkj/x;->f()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    filled-new-array {v2, v3, p0}, [Ljava/lang/Object;

    move-result-object v2

    const-string/jumbo v3, "waitForCompletion"

    const-string v4, "407"

    invoke-interface {v0, v1, v3, v4, v2}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0, p1, p2}, Lkj/x;->D(J)Lnj/u;

    move-result-object p1

    if-nez p1, :cond_1

    iget-boolean p1, p0, Lkj/x;->b:Z

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lkj/x;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    invoke-virtual {p0}, Lkj/x;->f()Ljava/lang/String;

    move-result-object p2

    filled-new-array {p2, p0}, [Ljava/lang/Object;

    move-result-object p2

    const-string v0, "406"

    invoke-interface {p1, v1, v3, v0, p2}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance p1, Lorg/eclipse/paho/client/mqttv3/MqttException;

    const/16 p2, 0x7d00

    invoke-direct {p1, p2}, Lorg/eclipse/paho/client/mqttv3/MqttException;-><init>(I)V

    iput-object p1, p0, Lkj/x;->i:Lorg/eclipse/paho/client/mqttv3/MqttException;

    throw p1

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lkj/x;->a()Z

    return-void
.end method

.method protected D(J)Lnj/u;
    .locals 13

    iget-object v0, p0, Lkj/x;->e:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lkj/x;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v2, Lkj/x;->q:Ljava/lang/String;

    const-string/jumbo v3, "waitForResponse"

    const-string v4, "400"

    invoke-virtual {p0}, Lkj/x;->f()Ljava/lang/String;

    move-result-object v5

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    iget-boolean v7, p0, Lkj/x;->d:Z

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    iget-boolean v8, p0, Lkj/x;->b:Z

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    iget-object v12, p0, Lkj/x;->i:Lorg/eclipse/paho/client/mqttv3/MqttException;

    if-nez v12, :cond_0

    const-string/jumbo v9, "false"

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :cond_0
    const-string/jumbo v9, "true"

    :goto_0
    iget-object v10, p0, Lkj/x;->h:Lnj/u;

    move-object v11, p0

    filled-new-array/range {v5 .. v11}, [Ljava/lang/Object;

    move-result-object v5

    move-object v6, v12

    invoke-interface/range {v1 .. v6}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    :cond_1
    iget-boolean v1, p0, Lkj/x;->b:Z

    if-eqz v1, :cond_2

    goto :goto_3

    :cond_2
    iget-object v1, p0, Lkj/x;->i:Lorg/eclipse/paho/client/mqttv3/MqttException;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-wide/16 v2, 0x0

    if-nez v1, :cond_4

    :try_start_1
    iget-object v1, p0, Lkj/x;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v4, Lkj/x;->q:Ljava/lang/String;

    const-string/jumbo v5, "waitForResponse"

    const-string v6, "408"

    invoke-virtual {p0}, Lkj/x;->f()Ljava/lang/String;

    move-result-object v7

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    filled-new-array {v7, v8}, [Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v1, v4, v5, v6, v7}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    cmp-long v1, p1, v2

    if-gtz v1, :cond_3

    iget-object v1, p0, Lkj/x;->e:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->wait()V

    goto :goto_2

    :catch_0
    move-exception v1

    goto :goto_1

    :cond_3
    iget-object v1, p0, Lkj/x;->e:Ljava/lang/Object;

    invoke-virtual {v1, p1, p2}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :goto_1
    :try_start_2
    new-instance v4, Lorg/eclipse/paho/client/mqttv3/MqttException;

    invoke-direct {v4, v1}, Lorg/eclipse/paho/client/mqttv3/MqttException;-><init>(Ljava/lang/Throwable;)V

    iput-object v4, p0, Lkj/x;->i:Lorg/eclipse/paho/client/mqttv3/MqttException;

    :cond_4
    :goto_2
    iget-boolean v1, p0, Lkj/x;->b:Z

    if-nez v1, :cond_1

    iget-object v9, p0, Lkj/x;->i:Lorg/eclipse/paho/client/mqttv3/MqttException;

    if-nez v9, :cond_5

    cmp-long v1, p1, v2

    if-lez v1, :cond_1

    :goto_3
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object p1, p0, Lkj/x;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object p2, Lkj/x;->q:Ljava/lang/String;

    const-string/jumbo v0, "waitForResponse"

    const-string v1, "402"

    invoke-virtual {p0}, Lkj/x;->f()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lkj/x;->h:Lnj/u;

    filled-new-array {v2, v3}, [Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1, p2, v0, v1, v2}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lkj/x;->h:Lnj/u;

    return-object p1

    :cond_5
    :try_start_3
    iget-object v4, p0, Lkj/x;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v5, Lkj/x;->q:Ljava/lang/String;

    const-string/jumbo v6, "waitForResponse"

    const-string v7, "401"

    const/4 v8, 0x0

    invoke-interface/range {v4 .. v9}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    iget-object p1, p0, Lkj/x;->i:Lorg/eclipse/paho/client/mqttv3/MqttException;

    throw p1

    :goto_4
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method public E()V
    .locals 6

    iget-object v0, p0, Lkj/x;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lkj/x;->e:Ljava/lang/Object;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v2, p0, Lkj/x;->i:Lorg/eclipse/paho/client/mqttv3/MqttException;

    if-nez v2, :cond_3

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catch_0
    :goto_0
    :try_start_2
    iget-boolean v1, p0, Lkj/x;->d:Z

    if-eqz v1, :cond_2

    if-nez v1, :cond_1

    iget-object v1, p0, Lkj/x;->i:Lorg/eclipse/paho/client/mqttv3/MqttException;

    if-nez v1, :cond_0

    const/4 v1, 0x6

    invoke-static {v1}, Lkj/i;->a(I)Lorg/eclipse/paho/client/mqttv3/MqttException;

    move-result-object v1

    throw v1

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_0
    throw v1

    :cond_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-void

    :cond_2
    :try_start_3
    iget-object v1, p0, Lkj/x;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v2, Lkj/x;->q:Ljava/lang/String;

    const-string/jumbo v3, "waitUntilSent"

    const-string v4, "409"

    invoke-virtual {p0}, Lkj/x;->f()Ljava/lang/String;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v1, v2, v3, v4, v5}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lkj/x;->f:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->wait()V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    :catchall_1
    move-exception v2

    goto :goto_1

    :cond_3
    :try_start_4
    throw v2

    :goto_1
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    throw v2

    :goto_2
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw v1
.end method

.method public a()Z
    .locals 1

    invoke-virtual {p0}, Lkj/x;->d()Lorg/eclipse/paho/client/mqttv3/MqttException;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    invoke-virtual {p0}, Lkj/x;->d()Lorg/eclipse/paho/client/mqttv3/MqttException;

    move-result-object v0

    throw v0
.end method

.method public b()Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;
    .locals 1

    iget-object v0, p0, Lkj/x;->m:Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;

    return-object v0
.end method

.method public c()Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;
    .locals 1

    iget-object v0, p0, Lkj/x;->l:Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    return-object v0
.end method

.method public d()Lorg/eclipse/paho/client/mqttv3/MqttException;
    .locals 1

    iget-object v0, p0, Lkj/x;->i:Lorg/eclipse/paho/client/mqttv3/MqttException;

    return-object v0
.end method

.method public e()[I
    .locals 3

    const/4 v0, 0x0

    new-array v0, v0, [I

    iget-object v1, p0, Lkj/x;->h:Lnj/u;

    instance-of v2, v1, Lnj/q;

    if-eqz v2, :cond_0

    check-cast v1, Lnj/q;

    invoke-virtual {v1}, Lnj/q;->w()[I

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lkj/x;->k:Ljava/lang/String;

    return-object v0
.end method

.method public g()Lorg/eclipse/paho/client/mqttv3/MqttMessage;
    .locals 1

    iget-object v0, p0, Lkj/x;->g:Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    return-object v0
.end method

.method public h()I
    .locals 1

    iget v0, p0, Lkj/x;->o:I

    return v0
.end method

.method public i()Lnj/u;
    .locals 1

    iget-object v0, p0, Lkj/x;->h:Lnj/u;

    return-object v0
.end method

.method public j()Z
    .locals 2

    iget-object v0, p0, Lkj/x;->h:Lnj/u;

    instance-of v1, v0, Lnj/c;

    if-eqz v1, :cond_0

    check-cast v0, Lnj/c;

    invoke-virtual {v0}, Lnj/c;->x()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public k()[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lkj/x;->j:[Ljava/lang/String;

    return-object v0
.end method

.method public l()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lkj/x;->n:Ljava/lang/Object;

    return-object v0
.end method

.method public m()Lnj/u;
    .locals 1

    iget-object v0, p0, Lkj/x;->h:Lnj/u;

    return-object v0
.end method

.method public n()Z
    .locals 1

    iget-boolean v0, p0, Lkj/x;->b:Z

    return v0
.end method

.method protected o()Z
    .locals 1

    iget-boolean v0, p0, Lkj/x;->c:Z

    return v0
.end method

.method public p()Z
    .locals 1

    iget-boolean v0, p0, Lkj/x;->p:Z

    return v0
.end method

.method protected q(Lnj/u;Lorg/eclipse/paho/client/mqttv3/MqttException;)V
    .locals 5

    iget-object v0, p0, Lkj/x;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v1, Lkj/x;->q:Ljava/lang/String;

    const-string/jumbo v2, "markComplete"

    const-string v3, "404"

    invoke-virtual {p0}, Lkj/x;->f()Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4, p1, p2}, [Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v0, v1, v2, v3, v4}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lkj/x;->e:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    instance-of v1, p1, Lnj/b;

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    iput-object v1, p0, Lkj/x;->g:Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Lkj/x;->c:Z

    iput-object p1, p0, Lkj/x;->h:Lnj/u;

    iput-object p2, p0, Lkj/x;->i:Lorg/eclipse/paho/client/mqttv3/MqttException;

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method protected r()V
    .locals 7

    iget-object v0, p0, Lkj/x;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v1, Lkj/x;->q:Ljava/lang/String;

    const-string/jumbo v2, "notifyComplete"

    const-string v3, "404"

    invoke-virtual {p0}, Lkj/x;->f()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lkj/x;->h:Lnj/u;

    iget-object v6, p0, Lkj/x;->i:Lorg/eclipse/paho/client/mqttv3/MqttException;

    filled-new-array {v4, v5, v6}, [Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v0, v1, v2, v3, v4}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lkj/x;->e:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lkj/x;->i:Lorg/eclipse/paho/client/mqttv3/MqttException;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_0

    iget-boolean v1, p0, Lkj/x;->c:Z

    if-eqz v1, :cond_0

    iput-boolean v3, p0, Lkj/x;->b:Z

    iput-boolean v2, p0, Lkj/x;->c:Z

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    iput-boolean v2, p0, Lkj/x;->c:Z

    :goto_0
    iget-object v1, p0, Lkj/x;->e:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Lkj/x;->f:Ljava/lang/Object;

    monitor-enter v1

    :try_start_1
    iput-boolean v3, p0, Lkj/x;->d:Z

    iget-object v0, p0, Lkj/x;->f:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v1

    return-void

    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw v0

    :goto_1
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method protected s()V
    .locals 5

    iget-object v0, p0, Lkj/x;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v1, Lkj/x;->q:Ljava/lang/String;

    const-string/jumbo v2, "notifySent"

    const-string v3, "403"

    invoke-virtual {p0}, Lkj/x;->f()Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v0, v1, v2, v3, v4}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lkj/x;->e:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    iput-object v1, p0, Lkj/x;->h:Lnj/u;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lkj/x;->b:Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    iget-object v1, p0, Lkj/x;->f:Ljava/lang/Object;

    monitor-enter v1

    const/4 v0, 0x1

    :try_start_1
    iput-boolean v0, p0, Lkj/x;->d:Z

    iget-object v0, p0, Lkj/x;->f:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :catchall_1
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1
.end method

.method public t(Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)V
    .locals 0

    iput-object p1, p0, Lkj/x;->m:Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string/jumbo v1, "key="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0}, Lkj/x;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v1, " ,topics="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0}, Lkj/x;->k()[Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Lkj/x;->k()[Ljava/lang/String;

    move-result-object v2

    array-length v2, v2

    if-lt v1, v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lkj/x;->k()[Ljava/lang/String;

    move-result-object v2

    aget-object v2, v2, v1

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v2, ", "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    const-string v1, " ,usercontext="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0}, Lkj/x;->l()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    const-string v1, " ,isComplete="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0}, Lkj/x;->n()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Z)Ljava/lang/StringBuffer;

    const-string v1, " ,isNotified="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0}, Lkj/x;->p()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Z)Ljava/lang/StringBuffer;

    const-string v1, " ,exception="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0}, Lkj/x;->d()Lorg/eclipse/paho/client/mqttv3/MqttException;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    const-string v1, " ,actioncallback="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0}, Lkj/x;->b()Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected u(Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;)V
    .locals 0

    iput-object p1, p0, Lkj/x;->l:Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    return-void
.end method

.method public v(Lorg/eclipse/paho/client/mqttv3/MqttException;)V
    .locals 1

    iget-object v0, p0, Lkj/x;->e:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lkj/x;->i:Lorg/eclipse/paho/client/mqttv3/MqttException;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public w(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lkj/x;->k:Ljava/lang/String;

    return-void
.end method

.method public x(Lorg/eclipse/paho/client/mqttv3/MqttMessage;)V
    .locals 0

    iput-object p1, p0, Lkj/x;->g:Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    return-void
.end method

.method public y(I)V
    .locals 0

    iput p1, p0, Lkj/x;->o:I

    return-void
.end method

.method public z(Z)V
    .locals 0

    iput-boolean p1, p0, Lkj/x;->p:Z

    return-void
.end method
