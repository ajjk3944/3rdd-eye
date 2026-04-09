.class public Lkj/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkj/c$a;
    }
.end annotation


# static fields
.field private static final r:Ljava/lang/String; = "kj.c"


# instance fields
.field private final a:Lorg/eclipse/paho/client/mqttv3/logging/a;

.field private b:Lorg/eclipse/paho/client/mqttv3/MqttCallback;

.field private c:Lorg/eclipse/paho/client/mqttv3/MqttCallbackExtended;

.field private d:Ljava/util/Hashtable;

.field private e:Lkj/a;

.field private final f:Ljava/util/Vector;

.field private final g:Ljava/util/Vector;

.field private h:Lkj/c$a;

.field private i:Lkj/c$a;

.field private final j:Ljava/lang/Object;

.field private k:Ljava/lang/Thread;

.field private l:Ljava/lang/String;

.field private m:Ljava/util/concurrent/Future;

.field private final n:Ljava/lang/Object;

.field private final o:Ljava/lang/Object;

.field private p:Lkj/b;

.field private q:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Lkj/a;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string/jumbo v0, "org.eclipse.paho.client.mqttv3.internal.nls.logcat"

    sget-object v1, Lkj/c;->r:Ljava/lang/String;

    invoke-static {v0, v1}, Lorg/eclipse/paho/client/mqttv3/logging/b;->a(Ljava/lang/String;Ljava/lang/String;)Lorg/eclipse/paho/client/mqttv3/logging/a;

    move-result-object v0

    iput-object v0, p0, Lkj/c;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v1, Lkj/c$a;->STOPPED:Lkj/c$a;

    iput-object v1, p0, Lkj/c;->h:Lkj/c$a;

    iput-object v1, p0, Lkj/c;->i:Lkj/c$a;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lkj/c;->j:Ljava/lang/Object;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lkj/c;->n:Ljava/lang/Object;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lkj/c;->o:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lkj/c;->q:Z

    iput-object p1, p0, Lkj/c;->e:Lkj/a;

    new-instance v1, Ljava/util/Vector;

    const/16 v2, 0xa

    invoke-direct {v1, v2}, Ljava/util/Vector;-><init>(I)V

    iput-object v1, p0, Lkj/c;->f:Ljava/util/Vector;

    new-instance v1, Ljava/util/Vector;

    invoke-direct {v1, v2}, Ljava/util/Vector;-><init>(I)V

    iput-object v1, p0, Lkj/c;->g:Ljava/util/Vector;

    new-instance v1, Ljava/util/Hashtable;

    invoke-direct {v1}, Ljava/util/Hashtable;-><init>()V

    iput-object v1, p0, Lkj/c;->d:Ljava/util/Hashtable;

    invoke-virtual {p1}, Lkj/a;->B()Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    move-result-object p1

    invoke-interface {p1}, Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;->getClientId()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lorg/eclipse/paho/client/mqttv3/logging/a;->setResourceName(Ljava/lang/String;)V

    return-void
.end method

.method private f(Lorg/eclipse/paho/client/mqttv3/MqttToken;)V
    .locals 5

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lkj/c;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v1, Lkj/c;->r:Ljava/lang/String;

    const-string/jumbo v2, "handleActionComplete"

    const-string v3, "705"

    iget-object v4, p1, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lkj/x;

    invoke-virtual {v4}, Lkj/x;->f()Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v0, v1, v2, v3, v4}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/MqttToken;->isComplete()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkj/c;->p:Lkj/b;

    invoke-virtual {v0, p1}, Lkj/b;->w(Lorg/eclipse/paho/client/mqttv3/MqttToken;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p1, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lkj/x;

    invoke-virtual {v0}, Lkj/x;->r()V

    iget-object v0, p1, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lkj/x;

    invoke-virtual {v0}, Lkj/x;->p()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lkj/c;->b:Lorg/eclipse/paho/client/mqttv3/MqttCallback;

    if-eqz v0, :cond_1

    instance-of v0, p1, Lorg/eclipse/paho/client/mqttv3/MqttDeliveryToken;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/MqttToken;->isComplete()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lkj/c;->b:Lorg/eclipse/paho/client/mqttv3/MqttCallback;

    move-object v1, p1

    check-cast v1, Lorg/eclipse/paho/client/mqttv3/MqttDeliveryToken;

    invoke-interface {v0, v1}, Lorg/eclipse/paho/client/mqttv3/MqttCallback;->deliveryComplete(Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;)V

    :cond_1
    invoke-virtual {p0, p1}, Lkj/c;->d(Lorg/eclipse/paho/client/mqttv3/MqttToken;)V

    :cond_2
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/MqttToken;->isComplete()Z

    move-result v0

    if-eqz v0, :cond_3

    instance-of v0, p1, Lorg/eclipse/paho/client/mqttv3/MqttDeliveryToken;

    if-eqz v0, :cond_3

    iget-object v0, p1, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lkj/x;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lkj/x;->z(Z)V

    :cond_3
    monitor-exit p1

    return-void

    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private g(Lnj/o;)V
    .locals 6

    invoke-virtual {p1}, Lnj/o;->y()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lkj/c;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v2, Lkj/c;->r:Ljava/lang/String;

    invoke-virtual {p1}, Lnj/u;->j()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v3, v0}, [Ljava/lang/Object;

    move-result-object v3

    const-string/jumbo v4, "handleMessage"

    const-string v5, "713"

    invoke-interface {v1, v2, v4, v5, v3}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Lnj/u;->j()I

    move-result v1

    invoke-virtual {p1}, Lnj/o;->x()Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, Lkj/c;->c(Ljava/lang/String;ILorg/eclipse/paho/client/mqttv3/MqttMessage;)Z

    iget-boolean v0, p0, Lkj/c;->q:Z

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lnj/o;->x()Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    move-result-object v0

    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/MqttMessage;->getQos()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lkj/c;->e:Lkj/a;

    new-instance v1, Lnj/k;

    invoke-direct {v1, p1}, Lnj/k;-><init>(Lnj/o;)V

    new-instance p1, Lorg/eclipse/paho/client/mqttv3/MqttToken;

    iget-object v2, p0, Lkj/c;->e:Lkj/a;

    invoke-virtual {v2}, Lkj/a;->B()Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    move-result-object v2

    invoke-interface {v2}, Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;->getClientId()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p1, v2}, Lorg/eclipse/paho/client/mqttv3/MqttToken;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, p1}, Lkj/a;->I(Lnj/u;Lorg/eclipse/paho/client/mqttv3/MqttToken;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lnj/o;->x()Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    move-result-object v0

    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/MqttMessage;->getQos()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lkj/c;->e:Lkj/a;

    invoke-virtual {v0, p1}, Lkj/a;->u(Lnj/o;)V

    new-instance v0, Lnj/l;

    invoke-direct {v0, p1}, Lnj/l;-><init>(Lnj/o;)V

    iget-object p1, p0, Lkj/c;->e:Lkj/a;

    new-instance v1, Lorg/eclipse/paho/client/mqttv3/MqttToken;

    invoke-virtual {p1}, Lkj/a;->B()Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    move-result-object v2

    invoke-interface {v2}, Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;->getClientId()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/eclipse/paho/client/mqttv3/MqttToken;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0, v1}, Lkj/a;->I(Lnj/u;Lorg/eclipse/paho/client/mqttv3/MqttToken;)V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public a(Lorg/eclipse/paho/client/mqttv3/MqttToken;)V
    .locals 7

    invoke-virtual {p0}, Lkj/c;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkj/c;->g:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    iget-object v0, p0, Lkj/c;->n:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lkj/c;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v2, Lkj/c;->r:Ljava/lang/String;

    const-string/jumbo v3, "asyncOperationComplete"

    const-string v4, "715"

    iget-object p1, p1, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lkj/x;

    invoke-virtual {p1}, Lkj/x;->f()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v1, v2, v3, v4, p1}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lkj/c;->n:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_0
    :try_start_1
    invoke-direct {p0, p1}, Lkj/c;->f(Lorg/eclipse/paho/client/mqttv3/MqttToken;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    iget-object v1, p0, Lkj/c;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v2, Lkj/c;->r:Ljava/lang/String;

    const-string/jumbo v3, "asyncOperationComplete"

    const-string v4, "719"

    const/4 v5, 0x0

    move-object v6, p1

    invoke-interface/range {v1 .. v6}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    iget-object v0, p0, Lkj/c;->e:Lkj/a;

    new-instance v1, Lorg/eclipse/paho/client/mqttv3/MqttException;

    invoke-direct {v1, p1}, Lorg/eclipse/paho/client/mqttv3/MqttException;-><init>(Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1, v1}, Lkj/a;->b0(Lorg/eclipse/paho/client/mqttv3/MqttToken;Lorg/eclipse/paho/client/mqttv3/MqttException;)V

    :goto_0
    return-void
.end method

.method public b(Lorg/eclipse/paho/client/mqttv3/MqttException;)V
    .locals 5

    const-string/jumbo v0, "connectionLost"

    :try_start_0
    iget-object v1, p0, Lkj/c;->b:Lorg/eclipse/paho/client/mqttv3/MqttCallback;

    if-eqz v1, :cond_0

    if-eqz p1, :cond_0

    iget-object v1, p0, Lkj/c;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v2, Lkj/c;->r:Ljava/lang/String;

    const-string v3, "708"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v1, v2, v0, v3, v4}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lkj/c;->b:Lorg/eclipse/paho/client/mqttv3/MqttCallback;

    invoke-interface {v1, p1}, Lorg/eclipse/paho/client/mqttv3/MqttCallback;->connectionLost(Ljava/lang/Throwable;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v1, p0, Lkj/c;->c:Lorg/eclipse/paho/client/mqttv3/MqttCallbackExtended;

    if-eqz v1, :cond_1

    if-eqz p1, :cond_1

    invoke-interface {v1, p1}, Lorg/eclipse/paho/client/mqttv3/MqttCallback;->connectionLost(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    iget-object v1, p0, Lkj/c;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v2, Lkj/c;->r:Ljava/lang/String;

    const-string v3, "720"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v1, v2, v0, v3, p1}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    :goto_2
    return-void
.end method

.method protected c(Ljava/lang/String;ILorg/eclipse/paho/client/mqttv3/MqttMessage;)Z
    .locals 5

    iget-object v0, p0, Lkj/c;->d:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->keys()Ljava/util/Enumeration;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v2

    const/4 v3, 0x1

    if-nez v2, :cond_2

    iget-object v0, p0, Lkj/c;->b:Lorg/eclipse/paho/client/mqttv3/MqttCallback;

    if-eqz v0, :cond_1

    if-nez v1, :cond_1

    invoke-virtual {p3, p2}, Lorg/eclipse/paho/client/mqttv3/MqttMessage;->setId(I)V

    iget-object p2, p0, Lkj/c;->b:Lorg/eclipse/paho/client/mqttv3/MqttCallback;

    invoke-interface {p2, p1, p3}, Lorg/eclipse/paho/client/mqttv3/MqttCallback;->messageArrived(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttMessage;)V

    move v1, v3

    :cond_1
    return v1

    :cond_2
    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v4, p0, Lkj/c;->d:Ljava/util/Hashtable;

    invoke-virtual {v4, v2}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/eclipse/paho/client/mqttv3/IMqttMessageListener;

    if-nez v4, :cond_3

    goto :goto_0

    :cond_3
    invoke-static {v2, p1}, Lorg/eclipse/paho/client/mqttv3/MqttTopic;->isMatched(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p3, p2}, Lorg/eclipse/paho/client/mqttv3/MqttMessage;->setId(I)V

    invoke-interface {v4, p1, p3}, Lorg/eclipse/paho/client/mqttv3/IMqttMessageListener;->messageArrived(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttMessage;)V

    move v1, v3

    goto :goto_0
.end method

.method public d(Lorg/eclipse/paho/client/mqttv3/MqttToken;)V
    .locals 6

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/MqttToken;->getActionCallback()Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/MqttToken;->getException()Lorg/eclipse/paho/client/mqttv3/MqttException;

    move-result-object v1

    const-string v2, "716"

    const-string/jumbo v3, "fireActionEvent"

    if-nez v1, :cond_0

    iget-object v1, p0, Lkj/c;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v4, Lkj/c;->r:Ljava/lang/String;

    iget-object v5, p1, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lkj/x;

    invoke-virtual {v5}, Lkj/x;->f()Ljava/lang/String;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v1, v4, v3, v2, v5}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-interface {v0, p1}, Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;->onSuccess(Lorg/eclipse/paho/client/mqttv3/IMqttToken;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lkj/c;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v4, Lkj/c;->r:Ljava/lang/String;

    iget-object v5, p1, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lkj/x;

    invoke-virtual {v5}, Lkj/x;->f()Ljava/lang/String;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v1, v4, v3, v2, v5}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/MqttToken;->getException()Lorg/eclipse/paho/client/mqttv3/MqttException;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;->onFailure(Lorg/eclipse/paho/client/mqttv3/IMqttToken;Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method protected e()Ljava/lang/Thread;
    .locals 1

    iget-object v0, p0, Lkj/c;->k:Ljava/lang/Thread;

    return-object v0
.end method

.method public h()Z
    .locals 1

    invoke-virtual {p0}, Lkj/c;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkj/c;->g:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lkj/c;->f:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public i()Z
    .locals 3

    iget-object v0, p0, Lkj/c;->j:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lkj/c;->h:Lkj/c$a;

    sget-object v2, Lkj/c$a;->QUIESCING:Lkj/c$a;

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public j()Z
    .locals 4

    iget-object v0, p0, Lkj/c;->j:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lkj/c;->h:Lkj/c$a;

    sget-object v2, Lkj/c$a;->RUNNING:Lkj/c$a;

    if-eq v1, v2, :cond_0

    sget-object v3, Lkj/c$a;->QUIESCING:Lkj/c$a;

    if-ne v1, v3, :cond_1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_0
    :goto_0
    iget-object v1, p0, Lkj/c;->i:Lkj/c$a;

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

.method public k(Lnj/o;)V
    .locals 5

    iget-object v0, p0, Lkj/c;->b:Lorg/eclipse/paho/client/mqttv3/MqttCallback;

    if-nez v0, :cond_0

    iget-object v0, p0, Lkj/c;->d:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->size()I

    move-result v0

    if-lez v0, :cond_3

    :cond_0
    iget-object v0, p0, Lkj/c;->o:Ljava/lang/Object;

    monitor-enter v0

    :catch_0
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Lkj/c;->j()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lkj/c;->i()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lkj/c;->f:Ljava/util/Vector;

    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v2, 0xa

    if-ge v1, v2, :cond_1

    goto :goto_1

    :cond_1
    :try_start_1
    iget-object v1, p0, Lkj/c;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v2, Lkj/c;->r:Ljava/lang/String;

    const-string/jumbo v3, "messageArrived"

    const-string v4, "709"

    invoke-interface {v1, v2, v3, v4}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lkj/c;->o:Ljava/lang/Object;

    const-wide/16 v2, 0xc8

    invoke-virtual {v1, v2, v3}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_2
    :goto_1
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {p0}, Lkj/c;->i()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lkj/c;->f:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    iget-object p1, p0, Lkj/c;->n:Ljava/lang/Object;

    monitor-enter p1

    :try_start_3
    iget-object v0, p0, Lkj/c;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v1, Lkj/c;->r:Ljava/lang/String;

    const-string/jumbo v2, "messageArrived"

    const-string v3, "710"

    invoke-interface {v0, v1, v2, v3}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lkj/c;->n:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p1

    goto :goto_2

    :catchall_1
    move-exception v0

    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0

    :cond_3
    :goto_2
    return-void

    :goto_3
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1
.end method

.method public l(II)V
    .locals 2

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    iget-object p2, p0, Lkj/c;->e:Lkj/a;

    new-instance v0, Lnj/k;

    invoke-direct {v0, p1}, Lnj/k;-><init>(I)V

    new-instance p1, Lorg/eclipse/paho/client/mqttv3/MqttToken;

    iget-object v1, p0, Lkj/c;->e:Lkj/a;

    invoke-virtual {v1}, Lkj/a;->B()Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    move-result-object v1

    invoke-interface {v1}, Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;->getClientId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Lorg/eclipse/paho/client/mqttv3/MqttToken;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0, p1}, Lkj/a;->I(Lnj/u;Lorg/eclipse/paho/client/mqttv3/MqttToken;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    iget-object p2, p0, Lkj/c;->e:Lkj/a;

    invoke-virtual {p2, p1}, Lkj/a;->t(I)V

    new-instance p2, Lnj/l;

    invoke-direct {p2, p1}, Lnj/l;-><init>(I)V

    iget-object p1, p0, Lkj/c;->e:Lkj/a;

    new-instance v0, Lorg/eclipse/paho/client/mqttv3/MqttToken;

    invoke-virtual {p1}, Lkj/a;->B()Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    move-result-object v1

    invoke-interface {v1}, Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;->getClientId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/eclipse/paho/client/mqttv3/MqttToken;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2, v0}, Lkj/a;->I(Lnj/u;Lorg/eclipse/paho/client/mqttv3/MqttToken;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public m()V
    .locals 5

    iget-object v0, p0, Lkj/c;->j:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lkj/c;->h:Lkj/c$a;

    sget-object v2, Lkj/c$a;->RUNNING:Lkj/c$a;

    if-ne v1, v2, :cond_0

    sget-object v1, Lkj/c$a;->QUIESCING:Lkj/c$a;

    iput-object v1, p0, Lkj/c;->h:Lkj/c$a;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Lkj/c;->o:Ljava/lang/Object;

    monitor-enter v1

    :try_start_1
    iget-object v0, p0, Lkj/c;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v2, Lkj/c;->r:Ljava/lang/String;

    const-string/jumbo v3, "quiesce"

    const-string v4, "711"

    invoke-interface {v0, v2, v3, v4}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lkj/c;->o:Ljava/lang/Object;

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

.method public n(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lkj/c;->d:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public o()V
    .locals 1

    iget-object v0, p0, Lkj/c;->d:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->clear()V

    return-void
.end method

.method public p(Lorg/eclipse/paho/client/mqttv3/MqttCallback;)V
    .locals 0

    iput-object p1, p0, Lkj/c;->b:Lorg/eclipse/paho/client/mqttv3/MqttCallback;

    return-void
.end method

.method public q(Lkj/b;)V
    .locals 0

    iput-object p1, p0, Lkj/c;->p:Lkj/b;

    return-void
.end method

.method public r(Z)V
    .locals 0

    iput-boolean p1, p0, Lkj/c;->q:Z

    return-void
.end method

.method public run()V
    .locals 9

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iput-object v0, p0, Lkj/c;->k:Ljava/lang/Thread;

    iget-object v1, p0, Lkj/c;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    iget-object v0, p0, Lkj/c;->j:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lkj/c$a;->RUNNING:Lkj/c$a;

    iput-object v1, p0, Lkj/c;->h:Lkj/c$a;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_9

    :goto_0
    invoke-virtual {p0}, Lkj/c;->j()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Lkj/c;->j:Ljava/lang/Object;

    monitor-enter v0

    :try_start_1
    sget-object v2, Lkj/c$a;->STOPPED:Lkj/c$a;

    iput-object v2, p0, Lkj/c;->h:Lkj/c$a;

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iput-object v1, p0, Lkj/c;->k:Ljava/lang/Thread;

    return-void

    :catchall_0
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1

    :cond_0
    :try_start_3
    iget-object v0, p0, Lkj/c;->n:Ljava/lang/Object;

    monitor-enter v0
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    invoke-virtual {p0}, Lkj/c;->j()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lkj/c;->f:Ljava/util/Vector;

    invoke-virtual {v2}, Ljava/util/Vector;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lkj/c;->g:Ljava/util/Vector;

    invoke-virtual {v2}, Ljava/util/Vector;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lkj/c;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v3, Lkj/c;->r:Ljava/lang/String;

    const-string/jumbo v4, "run"

    const-string v5, "704"

    invoke-interface {v2, v3, v4, v5}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Lkj/c;->n:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->wait()V

    goto :goto_1

    :catchall_1
    move-exception v2

    goto :goto_2

    :cond_1
    :goto_1
    monitor-exit v0

    goto :goto_3

    :goto_2
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    throw v2
    :try_end_5
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception v0

    goto/16 :goto_9

    :catch_0
    :goto_3
    :try_start_6
    invoke-virtual {p0}, Lkj/c;->j()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lkj/c;->g:Ljava/util/Vector;

    monitor-enter v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :try_start_7
    iget-object v2, p0, Lkj/c;->g:Ljava/util/Vector;

    invoke-virtual {v2}, Ljava/util/Vector;->isEmpty()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_2

    iget-object v2, p0, Lkj/c;->g:Ljava/util/Vector;

    invoke-virtual {v2, v3}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/eclipse/paho/client/mqttv3/MqttToken;

    iget-object v4, p0, Lkj/c;->g:Ljava/util/Vector;

    invoke-virtual {v4, v3}, Ljava/util/Vector;->removeElementAt(I)V

    goto :goto_4

    :catchall_3
    move-exception v2

    goto :goto_7

    :cond_2
    move-object v2, v1

    :goto_4
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    if-eqz v2, :cond_3

    :try_start_8
    invoke-direct {p0, v2}, Lkj/c;->f(Lorg/eclipse/paho/client/mqttv3/MqttToken;)V

    :cond_3
    iget-object v0, p0, Lkj/c;->f:Ljava/util/Vector;

    monitor-enter v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :try_start_9
    iget-object v2, p0, Lkj/c;->f:Ljava/util/Vector;

    invoke-virtual {v2}, Ljava/util/Vector;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_4

    iget-object v2, p0, Lkj/c;->f:Ljava/util/Vector;

    invoke-virtual {v2, v3}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnj/o;

    iget-object v4, p0, Lkj/c;->f:Ljava/util/Vector;

    invoke-virtual {v4, v3}, Ljava/util/Vector;->removeElementAt(I)V

    goto :goto_5

    :catchall_4
    move-exception v2

    goto :goto_6

    :cond_4
    move-object v2, v1

    :goto_5
    monitor-exit v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    if-eqz v2, :cond_5

    :try_start_a
    invoke-direct {p0, v2}, Lkj/c;->g(Lnj/o;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    goto :goto_8

    :goto_6
    :try_start_b
    monitor-exit v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    :try_start_c
    throw v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    :goto_7
    :try_start_d
    monitor-exit v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    :try_start_e
    throw v2

    :cond_5
    :goto_8
    invoke-virtual {p0}, Lkj/c;->i()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lkj/c;->p:Lkj/b;

    invoke-virtual {v0}, Lkj/b;->b()Z
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    :cond_6
    iget-object v0, p0, Lkj/c;->o:Ljava/lang/Object;

    monitor-enter v0

    :try_start_f
    iget-object v1, p0, Lkj/c;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v2, Lkj/c;->r:Ljava/lang/String;

    const-string/jumbo v3, "run"

    const-string v4, "706"

    invoke-interface {v1, v2, v3, v4}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lkj/c;->o:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v0

    goto/16 :goto_0

    :catchall_5
    move-exception v1

    monitor-exit v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    throw v1

    :goto_9
    :try_start_10
    iget-object v2, p0, Lkj/c;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v8, Lkj/c;->r:Ljava/lang/String;

    const-string/jumbo v4, "run"

    const-string v5, "714"

    const/4 v6, 0x0

    move-object v3, v8

    move-object v7, v0

    invoke-interface/range {v2 .. v7}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    iget-object v2, p0, Lkj/c;->e:Lkj/a;

    new-instance v3, Lorg/eclipse/paho/client/mqttv3/MqttException;

    invoke-direct {v3, v0}, Lorg/eclipse/paho/client/mqttv3/MqttException;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v2, v1, v3}, Lkj/a;->b0(Lorg/eclipse/paho/client/mqttv3/MqttToken;Lorg/eclipse/paho/client/mqttv3/MqttException;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    iget-object v0, p0, Lkj/c;->o:Ljava/lang/Object;

    monitor-enter v0

    :try_start_11
    iget-object v1, p0, Lkj/c;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    const-string/jumbo v2, "run"

    const-string v3, "706"

    invoke-interface {v1, v8, v2, v3}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lkj/c;->o:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v0

    goto/16 :goto_0

    :catchall_6
    move-exception v1

    monitor-exit v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_6

    throw v1

    :catchall_7
    move-exception v0

    iget-object v1, p0, Lkj/c;->o:Ljava/lang/Object;

    monitor-enter v1

    :try_start_12
    iget-object v2, p0, Lkj/c;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v3, Lkj/c;->r:Ljava/lang/String;

    const-string/jumbo v4, "run"

    const-string v5, "706"

    invoke-interface {v2, v3, v4, v5}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Lkj/c;->o:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v1
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_8

    throw v0

    :catchall_8
    move-exception v0

    :try_start_13
    monitor-exit v1
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_8

    throw v0

    :catchall_9
    move-exception v1

    :try_start_14
    monitor-exit v0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_9

    throw v1
.end method

.method public s(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/IMqttMessageListener;)V
    .locals 1

    iget-object v0, p0, Lkj/c;->d:Ljava/util/Hashtable;

    invoke-virtual {v0, p1, p2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public t(Lorg/eclipse/paho/client/mqttv3/MqttCallbackExtended;)V
    .locals 0

    iput-object p1, p0, Lkj/c;->c:Lorg/eclipse/paho/client/mqttv3/MqttCallbackExtended;

    return-void
.end method

.method public u(Ljava/lang/String;Ljava/util/concurrent/ExecutorService;)V
    .locals 2

    iput-object p1, p0, Lkj/c;->l:Ljava/lang/String;

    iget-object p1, p0, Lkj/c;->j:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lkj/c;->h:Lkj/c$a;

    sget-object v1, Lkj/c$a;->STOPPED:Lkj/c$a;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lkj/c;->f:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->clear()V

    iget-object v0, p0, Lkj/c;->g:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->clear()V

    sget-object v0, Lkj/c$a;->RUNNING:Lkj/c$a;

    iput-object v0, p0, Lkj/c;->i:Lkj/c$a;

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

    iput-object p2, p0, Lkj/c;->m:Ljava/util/concurrent/Future;

    :cond_1
    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catch_0
    :goto_1
    invoke-virtual {p0}, Lkj/c;->j()Z

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

.method public v()V
    .locals 5

    iget-object v0, p0, Lkj/c;->j:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lkj/c;->m:Ljava/util/concurrent/Future;

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_4

    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lkj/c;->j()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lkj/c;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v1, Lkj/c;->r:Ljava/lang/String;

    const-string/jumbo v2, "stop"

    const-string v3, "700"

    invoke-interface {v0, v1, v2, v3}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lkj/c;->j:Ljava/lang/Object;

    monitor-enter v0

    :try_start_1
    sget-object v2, Lkj/c$a;->STOPPED:Lkj/c$a;

    iput-object v2, p0, Lkj/c;->i:Lkj/c$a;

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iget-object v2, p0, Lkj/c;->k:Ljava/lang/Thread;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lkj/c;->n:Ljava/lang/Object;

    monitor-enter v0

    :try_start_2
    iget-object v2, p0, Lkj/c;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    const-string/jumbo v3, "stop"

    const-string v4, "701"

    invoke-interface {v2, v1, v3, v4}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lkj/c;->n:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_1
    invoke-virtual {p0}, Lkj/c;->j()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    const-wide/16 v0, 0x64

    :try_start_3
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    :catch_0
    iget-object v0, p0, Lkj/c;->p:Lkj/b;

    invoke-virtual {v0}, Lkj/b;->x()V

    goto :goto_1

    :catchall_1
    move-exception v1

    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v1

    :cond_2
    :goto_2
    iget-object v0, p0, Lkj/c;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v1, Lkj/c;->r:Ljava/lang/String;

    const-string/jumbo v2, "stop"

    const-string v3, "703"

    invoke-interface {v0, v1, v2, v3}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :catchall_2
    move-exception v1

    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    throw v1

    :cond_3
    :goto_3
    return-void

    :goto_4
    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw v1
.end method
