.class public Lkj/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkj/a$a;,
        Lkj/a$b;,
        Lkj/a$c;,
        Lkj/a$d;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lorg/eclipse/paho/client/mqttv3/logging/a;

.field private c:Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

.field private d:I

.field private e:[Lkj/p;

.field private f:Lkj/d;

.field private g:Lkj/e;

.field private h:Lkj/c;

.field private i:Lkj/b;

.field private j:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

.field private k:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

.field private l:Lorg/eclipse/paho/client/mqttv3/MqttPingSender;

.field private m:Lkj/f;

.field private n:Z

.field private o:B

.field private final p:Ljava/lang/Object;

.field private q:Z

.field private r:Z

.field private s:Lkj/h;

.field private t:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;Lorg/eclipse/paho/client/mqttv3/MqttPingSender;Ljava/util/concurrent/ExecutorService;Lkj/k;)V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Lkj/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkj/a;->a:Ljava/lang/String;

    const-string/jumbo v1, "org.eclipse.paho.client.mqttv3.internal.nls.logcat"

    invoke-static {v1, v0}, Lorg/eclipse/paho/client/mqttv3/logging/b;->a(Ljava/lang/String;Ljava/lang/String;)Lorg/eclipse/paho/client/mqttv3/logging/a;

    move-result-object v0

    iput-object v0, p0, Lkj/a;->b:Lorg/eclipse/paho/client/mqttv3/logging/a;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lkj/a;->n:Z

    new-instance v2, Ljava/lang/Object;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object v2, p0, Lkj/a;->p:Ljava/lang/Object;

    iput-boolean v1, p0, Lkj/a;->q:Z

    iput-boolean v1, p0, Lkj/a;->r:Z

    const/4 v1, 0x3

    iput-byte v1, p0, Lkj/a;->o:B

    iput-object p1, p0, Lkj/a;->c:Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    iput-object p2, p0, Lkj/a;->k:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    iput-object p3, p0, Lkj/a;->l:Lorg/eclipse/paho/client/mqttv3/MqttPingSender;

    invoke-interface {p3, p0}, Lorg/eclipse/paho/client/mqttv3/MqttPingSender;->init(Lkj/a;)V

    iput-object p4, p0, Lkj/a;->t:Ljava/util/concurrent/ExecutorService;

    new-instance p1, Lkj/f;

    invoke-virtual {p0}, Lkj/a;->B()Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    move-result-object p4

    invoke-interface {p4}, Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;->getClientId()Ljava/lang/String;

    move-result-object p4

    invoke-direct {p1, p4}, Lkj/f;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lkj/a;->m:Lkj/f;

    new-instance p1, Lkj/c;

    invoke-direct {p1, p0}, Lkj/c;-><init>(Lkj/a;)V

    iput-object p1, p0, Lkj/a;->h:Lkj/c;

    new-instance p1, Lkj/b;

    iget-object v3, p0, Lkj/a;->m:Lkj/f;

    iget-object v4, p0, Lkj/a;->h:Lkj/c;

    move-object v1, p1

    move-object v2, p2

    move-object v5, p0

    move-object v6, p3

    move-object v7, p5

    invoke-direct/range {v1 .. v7}, Lkj/b;-><init>(Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;Lkj/f;Lkj/c;Lkj/a;Lorg/eclipse/paho/client/mqttv3/MqttPingSender;Lkj/k;)V

    iput-object p1, p0, Lkj/a;->i:Lkj/b;

    iget-object p2, p0, Lkj/a;->h:Lkj/c;

    invoke-virtual {p2, p1}, Lkj/c;->q(Lkj/b;)V

    invoke-virtual {p0}, Lkj/a;->B()Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    move-result-object p1

    invoke-interface {p1}, Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;->getClientId()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lorg/eclipse/paho/client/mqttv3/logging/a;->setResourceName(Ljava/lang/String;)V

    return-void
.end method

.method private G(Lorg/eclipse/paho/client/mqttv3/MqttToken;Lorg/eclipse/paho/client/mqttv3/MqttException;)Lorg/eclipse/paho/client/mqttv3/MqttToken;
    .locals 4

    iget-object v0, p0, Lkj/a;->b:Lorg/eclipse/paho/client/mqttv3/logging/a;

    iget-object v1, p0, Lkj/a;->a:Ljava/lang/String;

    const-string/jumbo v2, "handleOldTokens"

    const-string v3, "222"

    invoke-interface {v0, v1, v2, v3}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    :try_start_0
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/MqttToken;->isComplete()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lkj/a;->m:Lkj/f;

    iget-object v2, p1, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lkj/x;

    invoke-virtual {v2}, Lkj/x;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lkj/f;->e(Ljava/lang/String;)Lorg/eclipse/paho/client/mqttv3/MqttToken;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lkj/a;->m:Lkj/f;

    iget-object v2, p1, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lkj/x;

    invoke-virtual {v2}, Lkj/x;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Lkj/f;->l(Lorg/eclipse/paho/client/mqttv3/MqttToken;Ljava/lang/String;)V

    :cond_0
    iget-object p1, p0, Lkj/a;->i:Lkj/b;

    invoke-virtual {p1, p2}, Lkj/b;->J(Lorg/eclipse/paho/client/mqttv3/MqttException;)Ljava/util/Vector;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Vector;->elements()Ljava/util/Enumeration;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result p2

    if-nez p2, :cond_1

    goto :goto_2

    :cond_1
    invoke-interface {p1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lorg/eclipse/paho/client/mqttv3/MqttToken;

    iget-object v1, p2, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lkj/x;

    invoke-virtual {v1}, Lkj/x;->f()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Disc"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p2, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lkj/x;

    invoke-virtual {v1}, Lkj/x;->f()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Con"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lkj/a;->h:Lkj/c;

    invoke-virtual {v1, p2}, Lkj/c;->a(Lorg/eclipse/paho/client/mqttv3/MqttToken;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_3
    :goto_1
    move-object v0, p2

    goto :goto_0

    :catch_0
    :goto_2
    return-object v0
.end method

.method private H(Ljava/lang/Exception;)V
    .locals 6

    iget-object v0, p0, Lkj/a;->b:Lorg/eclipse/paho/client/mqttv3/logging/a;

    iget-object v1, p0, Lkj/a;->a:Ljava/lang/String;

    const-string v3, "804"

    const/4 v4, 0x0

    const-string/jumbo v2, "handleRunException"

    move-object v5, p1

    invoke-interface/range {v0 .. v5}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    instance-of v0, p1, Lorg/eclipse/paho/client/mqttv3/MqttException;

    if-nez v0, :cond_0

    new-instance v0, Lorg/eclipse/paho/client/mqttv3/MqttException;

    const/16 v1, 0x7d6d

    invoke-direct {v0, v1, p1}, Lorg/eclipse/paho/client/mqttv3/MqttException;-><init>(ILjava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    move-object v0, p1

    check-cast v0, Lorg/eclipse/paho/client/mqttv3/MqttException;

    :goto_0
    const/4 p1, 0x0

    invoke-virtual {p0, p1, v0}, Lkj/a;->b0(Lorg/eclipse/paho/client/mqttv3/MqttToken;Lorg/eclipse/paho/client/mqttv3/MqttException;)V

    return-void
.end method

.method static synthetic a(Lkj/a;)Ljava/util/concurrent/ExecutorService;
    .locals 0

    iget-object p0, p0, Lkj/a;->t:Ljava/util/concurrent/ExecutorService;

    return-object p0
.end method

.method static synthetic b(Lkj/a;)Lorg/eclipse/paho/client/mqttv3/logging/a;
    .locals 0

    iget-object p0, p0, Lkj/a;->b:Lorg/eclipse/paho/client/mqttv3/logging/a;

    return-object p0
.end method

.method static synthetic c(Lkj/a;)Lkj/e;
    .locals 0

    iget-object p0, p0, Lkj/a;->g:Lkj/e;

    return-object p0
.end method

.method static synthetic d(Lkj/a;)Lkj/c;
    .locals 0

    iget-object p0, p0, Lkj/a;->h:Lkj/c;

    return-object p0
.end method

.method static synthetic e(Lkj/a;)Lkj/h;
    .locals 0

    iget-object p0, p0, Lkj/a;->s:Lkj/h;

    return-object p0
.end method

.method static synthetic f(Lkj/a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lkj/a;->a:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic g(Lkj/a;)Lkj/f;
    .locals 0

    iget-object p0, p0, Lkj/a;->m:Lkj/f;

    return-object p0
.end method

.method static synthetic h(Lkj/a;)[Lkj/p;
    .locals 0

    iget-object p0, p0, Lkj/a;->e:[Lkj/p;

    return-object p0
.end method

.method static synthetic i(Lkj/a;)I
    .locals 0

    iget p0, p0, Lkj/a;->d:I

    return p0
.end method

.method static synthetic j(Lkj/a;)Lkj/b;
    .locals 0

    iget-object p0, p0, Lkj/a;->i:Lkj/b;

    return-object p0
.end method

.method static synthetic k(Lkj/a;Lkj/d;)V
    .locals 0

    iput-object p1, p0, Lkj/a;->f:Lkj/d;

    return-void
.end method

.method static synthetic l(Lkj/a;)Lkj/d;
    .locals 0

    iget-object p0, p0, Lkj/a;->f:Lkj/d;

    return-object p0
.end method

.method static synthetic m(Lkj/a;Lkj/e;)V
    .locals 0

    iput-object p1, p0, Lkj/a;->g:Lkj/e;

    return-void
.end method


# virtual methods
.method public A()I
    .locals 1

    iget-object v0, p0, Lkj/a;->s:Lkj/h;

    invoke-virtual {v0}, Lkj/h;->c()I

    move-result v0

    return v0
.end method

.method public B()Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;
    .locals 1

    iget-object v0, p0, Lkj/a;->c:Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    return-object v0
.end method

.method public C()J
    .locals 2

    iget-object v0, p0, Lkj/a;->i:Lkj/b;

    invoke-virtual {v0}, Lkj/b;->m()J

    move-result-wide v0

    return-wide v0
.end method

.method public D()I
    .locals 1

    iget v0, p0, Lkj/a;->d:I

    return v0
.end method

.method public E()[Lkj/p;
    .locals 1

    iget-object v0, p0, Lkj/a;->e:[Lkj/p;

    return-object v0
.end method

.method public F()[Lorg/eclipse/paho/client/mqttv3/MqttDeliveryToken;
    .locals 1

    iget-object v0, p0, Lkj/a;->m:Lkj/f;

    invoke-virtual {v0}, Lkj/f;->c()[Lorg/eclipse/paho/client/mqttv3/MqttDeliveryToken;

    move-result-object v0

    return-object v0
.end method

.method I(Lnj/u;Lorg/eclipse/paho/client/mqttv3/MqttToken;)V
    .locals 5

    iget-object v0, p0, Lkj/a;->b:Lorg/eclipse/paho/client/mqttv3/logging/a;

    iget-object v1, p0, Lkj/a;->a:Ljava/lang/String;

    invoke-virtual {p1}, Lnj/u;->i()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2, p1, p2}, [Ljava/lang/Object;

    move-result-object v2

    const-string/jumbo v3, "internalSend"

    const-string v4, "200"

    invoke-interface {v0, v1, v3, v4, v2}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p2}, Lorg/eclipse/paho/client/mqttv3/MqttToken;->getClient()Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p2, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lkj/x;

    invoke-virtual {p0}, Lkj/a;->B()Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkj/x;->u(Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;)V

    :try_start_0
    iget-object v0, p0, Lkj/a;->i:Lkj/b;

    invoke-virtual {v0, p1, p2}, Lkj/b;->N(Lnj/u;Lorg/eclipse/paho/client/mqttv3/MqttToken;)V
    :try_end_0
    .catch Lorg/eclipse/paho/client/mqttv3/MqttException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object p2, p2, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lkj/x;

    const/4 v1, 0x0

    invoke-virtual {p2, v1}, Lkj/x;->u(Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;)V

    instance-of p2, p1, Lnj/o;

    if-eqz p2, :cond_0

    iget-object p2, p0, Lkj/a;->i:Lkj/b;

    check-cast p1, Lnj/o;

    invoke-virtual {p2, p1}, Lkj/b;->S(Lnj/o;)V

    :cond_0
    throw v0

    :cond_1
    iget-object v0, p0, Lkj/a;->b:Lorg/eclipse/paho/client/mqttv3/logging/a;

    iget-object v1, p0, Lkj/a;->a:Ljava/lang/String;

    invoke-virtual {p1}, Lnj/u;->i()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2, p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "213"

    invoke-interface {v0, v1, v3, p2, p1}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance p1, Lorg/eclipse/paho/client/mqttv3/MqttException;

    const/16 p2, 0x7dc9

    invoke-direct {p1, p2}, Lorg/eclipse/paho/client/mqttv3/MqttException;-><init>(I)V

    throw p1
.end method

.method public J()Z
    .locals 3

    iget-object v0, p0, Lkj/a;->p:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-byte v1, p0, Lkj/a;->o:B

    const/4 v2, 0x4

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

.method public K()Z
    .locals 2

    iget-object v0, p0, Lkj/a;->p:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-byte v1, p0, Lkj/a;->o:B

    if-nez v1, :cond_0

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

.method public L()Z
    .locals 3

    iget-object v0, p0, Lkj/a;->p:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-byte v1, p0, Lkj/a;->o:B

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    monitor-exit v0

    return v2

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public M()Z
    .locals 3

    iget-object v0, p0, Lkj/a;->p:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-byte v1, p0, Lkj/a;->o:B

    const/4 v2, 0x3

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

.method public N()Z
    .locals 3

    iget-object v0, p0, Lkj/a;->p:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-byte v1, p0, Lkj/a;->o:B

    const/4 v2, 0x2

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

.method public O(II)V
    .locals 1

    iget-object v0, p0, Lkj/a;->h:Lkj/c;

    invoke-virtual {v0, p1, p2}, Lkj/c;->l(II)V

    return-void
.end method

.method public P()V
    .locals 5

    iget-object v0, p0, Lkj/a;->s:Lkj/h;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lkj/a;->b:Lorg/eclipse/paho/client/mqttv3/logging/a;

    iget-object v1, p0, Lkj/a;->a:Ljava/lang/String;

    const-string v2, "509"

    const/4 v3, 0x0

    const-string/jumbo v4, "notifyConnect"

    invoke-interface {v0, v1, v4, v2, v3}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lkj/a;->s:Lkj/h;

    new-instance v1, Lkj/a$d;

    invoke-direct {v1, p0, v4}, Lkj/a$d;-><init>(Lkj/a;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lkj/h;->g(Lkj/m;)V

    iget-object v0, p0, Lkj/a;->s:Lkj/h;

    new-instance v1, Lkj/a$c;

    invoke-direct {v1, p0}, Lkj/a$c;-><init>(Lkj/a;)V

    invoke-virtual {v0, v1}, Lkj/h;->f(Lkj/l;)V

    iget-object v0, p0, Lkj/a;->t:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/Thread;

    iget-object v1, p0, Lkj/a;->s:Lkj/h;

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lkj/a;->s:Lkj/h;

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public Q(Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;)Z
    .locals 1

    iget-object v0, p0, Lkj/a;->i:Lkj/b;

    invoke-virtual {v0, p1}, Lkj/b;->I(Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;)Z

    move-result p1

    return p1
.end method

.method public R(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lkj/a;->h:Lkj/c;

    invoke-virtual {v0, p1}, Lkj/c;->n(Ljava/lang/String;)V

    return-void
.end method

.method public S(Lnj/u;Lorg/eclipse/paho/client/mqttv3/MqttToken;)V
    .locals 5

    invoke-virtual {p0}, Lkj/a;->K()Z

    move-result v0

    const-string/jumbo v1, "sendNoWait"

    if-nez v0, :cond_4

    invoke-virtual {p0}, Lkj/a;->K()Z

    move-result v0

    if-nez v0, :cond_0

    instance-of v0, p1, Lnj/d;

    if-nez v0, :cond_4

    :cond_0
    invoke-virtual {p0}, Lkj/a;->N()Z

    move-result v0

    if-eqz v0, :cond_1

    instance-of v0, p1, Lnj/e;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lkj/a;->s:Lkj/h;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lkj/a;->b:Lorg/eclipse/paho/client/mqttv3/logging/a;

    iget-object v2, p0, Lkj/a;->a:Ljava/lang/String;

    invoke-virtual {p1}, Lnj/u;->i()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const-string v4, "508"

    invoke-interface {v0, v2, v1, v4, v3}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lkj/a;->s:Lkj/h;

    invoke-virtual {v0}, Lkj/h;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lkj/a;->i:Lkj/b;

    invoke-virtual {v0, p1}, Lkj/b;->E(Lnj/u;)V

    :cond_2
    iget-object v0, p0, Lkj/a;->s:Lkj/h;

    invoke-virtual {v0, p1, p2}, Lkj/h;->e(Lnj/u;Lorg/eclipse/paho/client/mqttv3/MqttToken;)V

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lkj/a;->b:Lorg/eclipse/paho/client/mqttv3/logging/a;

    iget-object p2, p0, Lkj/a;->a:Ljava/lang/String;

    const-string v0, "208"

    invoke-interface {p1, p2, v1, v0}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 p1, 0x7d68

    invoke-static {p1}, Lkj/i;->a(I)Lorg/eclipse/paho/client/mqttv3/MqttException;

    move-result-object p1

    throw p1

    :cond_4
    :goto_0
    iget-object v0, p0, Lkj/a;->s:Lkj/h;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lkj/h;->c()I

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lkj/a;->b:Lorg/eclipse/paho/client/mqttv3/logging/a;

    iget-object v2, p0, Lkj/a;->a:Ljava/lang/String;

    invoke-virtual {p1}, Lnj/u;->i()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const-string v4, "507"

    invoke-interface {v0, v2, v1, v4, v3}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lkj/a;->s:Lkj/h;

    invoke-virtual {v0}, Lkj/h;->d()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lkj/a;->i:Lkj/b;

    invoke-virtual {v0, p1}, Lkj/b;->E(Lnj/u;)V

    :cond_5
    iget-object v0, p0, Lkj/a;->s:Lkj/h;

    invoke-virtual {v0, p1, p2}, Lkj/h;->e(Lnj/u;Lorg/eclipse/paho/client/mqttv3/MqttToken;)V

    goto :goto_1

    :cond_6
    invoke-virtual {p0, p1, p2}, Lkj/a;->I(Lnj/u;Lorg/eclipse/paho/client/mqttv3/MqttToken;)V

    :goto_1
    return-void
.end method

.method public T(Lorg/eclipse/paho/client/mqttv3/MqttCallback;)V
    .locals 1

    iget-object v0, p0, Lkj/a;->h:Lkj/c;

    invoke-virtual {v0, p1}, Lkj/c;->p(Lorg/eclipse/paho/client/mqttv3/MqttCallback;)V

    return-void
.end method

.method public U(Lkj/h;)V
    .locals 0

    iput-object p1, p0, Lkj/a;->s:Lkj/h;

    return-void
.end method

.method public V(Z)V
    .locals 1

    iget-object v0, p0, Lkj/a;->h:Lkj/c;

    invoke-virtual {v0, p1}, Lkj/c;->r(Z)V

    return-void
.end method

.method public W(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/IMqttMessageListener;)V
    .locals 1

    iget-object v0, p0, Lkj/a;->h:Lkj/c;

    invoke-virtual {v0, p1, p2}, Lkj/c;->s(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/IMqttMessageListener;)V

    return-void
.end method

.method public X(I)V
    .locals 0

    iput p1, p0, Lkj/a;->d:I

    return-void
.end method

.method public Y([Lkj/p;)V
    .locals 0

    invoke-virtual {p1}, [Lkj/p;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lkj/p;

    iput-object p1, p0, Lkj/a;->e:[Lkj/p;

    return-void
.end method

.method public Z(Lorg/eclipse/paho/client/mqttv3/MqttCallbackExtended;)V
    .locals 1

    iget-object v0, p0, Lkj/a;->h:Lkj/c;

    invoke-virtual {v0, p1}, Lkj/c;->t(Lorg/eclipse/paho/client/mqttv3/MqttCallbackExtended;)V

    return-void
.end method

.method public a0(Z)V
    .locals 0

    iput-boolean p1, p0, Lkj/a;->r:Z

    return-void
.end method

.method public b0(Lorg/eclipse/paho/client/mqttv3/MqttToken;Lorg/eclipse/paho/client/mqttv3/MqttException;)V
    .locals 8

    iget-object v0, p0, Lkj/a;->p:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lkj/a;->n:Z

    if-nez v1, :cond_d

    iget-boolean v1, p0, Lkj/a;->q:Z

    if-nez v1, :cond_d

    invoke-virtual {p0}, Lkj/a;->J()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_3

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Lkj/a;->n:Z

    iget-object v2, p0, Lkj/a;->b:Lorg/eclipse/paho/client/mqttv3/logging/a;

    iget-object v3, p0, Lkj/a;->a:Ljava/lang/String;

    const-string/jumbo v4, "shutdownConnection"

    const-string v5, "216"

    invoke-interface {v2, v3, v4, v5}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lkj/a;->K()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_1

    invoke-virtual {p0}, Lkj/a;->N()Z

    move-result v2

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :cond_1
    move v2, v1

    :goto_0
    const/4 v4, 0x2

    iput-byte v4, p0, Lkj/a;->o:B

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/MqttToken;->isComplete()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p1, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lkj/x;

    invoke-virtual {v0, p2}, Lkj/x;->v(Lorg/eclipse/paho/client/mqttv3/MqttException;)V

    :cond_2
    iget-object v0, p0, Lkj/a;->h:Lkj/c;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lkj/c;->v()V

    :cond_3
    iget-object v0, p0, Lkj/a;->f:Lkj/d;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lkj/d;->c()V

    :cond_4
    :try_start_1
    iget-object v0, p0, Lkj/a;->e:[Lkj/p;

    if-eqz v0, :cond_5

    iget v4, p0, Lkj/a;->d:I

    aget-object v0, v0, v4

    if-eqz v0, :cond_5

    invoke-interface {v0}, Lkj/p;->stop()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :cond_5
    iget-object v0, p0, Lkj/a;->m:Lkj/f;

    new-instance v4, Lorg/eclipse/paho/client/mqttv3/MqttException;

    const/16 v5, 0x7d66

    invoke-direct {v4, v5}, Lorg/eclipse/paho/client/mqttv3/MqttException;-><init>(I)V

    invoke-virtual {v0, v4}, Lkj/f;->h(Lorg/eclipse/paho/client/mqttv3/MqttException;)V

    invoke-direct {p0, p1, p2}, Lkj/a;->G(Lorg/eclipse/paho/client/mqttv3/MqttToken;Lorg/eclipse/paho/client/mqttv3/MqttException;)Lorg/eclipse/paho/client/mqttv3/MqttToken;

    move-result-object p1

    :try_start_2
    iget-object v0, p0, Lkj/a;->i:Lkj/b;

    invoke-virtual {v0, p2}, Lkj/b;->i(Lorg/eclipse/paho/client/mqttv3/MqttException;)V

    iget-object v0, p0, Lkj/a;->i:Lkj/b;

    invoke-virtual {v0}, Lkj/b;->l()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lkj/a;->h:Lkj/c;

    invoke-virtual {v0}, Lkj/c;->o()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    :cond_6
    iget-object v0, p0, Lkj/a;->g:Lkj/e;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lkj/e;->d()V

    :cond_7
    iget-object v0, p0, Lkj/a;->l:Lorg/eclipse/paho/client/mqttv3/MqttPingSender;

    if-eqz v0, :cond_8

    invoke-interface {v0}, Lorg/eclipse/paho/client/mqttv3/MqttPingSender;->stop()V

    :cond_8
    :try_start_3
    iget-object v0, p0, Lkj/a;->s:Lkj/h;

    if-nez v0, :cond_9

    iget-object v0, p0, Lkj/a;->k:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    if-eqz v0, :cond_9

    invoke-interface {v0}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    :catch_2
    :cond_9
    iget-object v4, p0, Lkj/a;->p:Ljava/lang/Object;

    monitor-enter v4

    :try_start_4
    iget-object v0, p0, Lkj/a;->b:Lorg/eclipse/paho/client/mqttv3/logging/a;

    iget-object v5, p0, Lkj/a;->a:Ljava/lang/String;

    const-string/jumbo v6, "shutdownConnection"

    const-string v7, "217"

    invoke-interface {v0, v5, v6, v7}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x3

    iput-byte v0, p0, Lkj/a;->o:B

    iput-boolean v3, p0, Lkj/a;->n:Z

    monitor-exit v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    if-eqz p1, :cond_a

    iget-object v0, p0, Lkj/a;->h:Lkj/c;

    if-eqz v0, :cond_a

    invoke-virtual {v0, p1}, Lkj/c;->a(Lorg/eclipse/paho/client/mqttv3/MqttToken;)V

    :cond_a
    if-eqz v2, :cond_b

    iget-object p1, p0, Lkj/a;->h:Lkj/c;

    if-eqz p1, :cond_b

    invoke-virtual {p1, p2}, Lkj/c;->b(Lorg/eclipse/paho/client/mqttv3/MqttException;)V

    :cond_b
    iget-object p1, p0, Lkj/a;->p:Ljava/lang/Object;

    monitor-enter p1

    :try_start_5
    iget-boolean p2, p0, Lkj/a;->q:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    if-eqz p2, :cond_c

    :try_start_6
    invoke-virtual {p0, v1}, Lkj/a;->p(Z)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p2

    goto :goto_2

    :catch_3
    :cond_c
    :goto_1
    :try_start_7
    monitor-exit p1

    return-void

    :goto_2
    monitor-exit p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    throw p2

    :catchall_2
    move-exception p1

    :try_start_8
    monitor-exit v4
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    throw p1

    :cond_d
    :goto_3
    :try_start_9
    monitor-exit v0

    return-void

    :goto_4
    monitor-exit v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    throw p1
.end method

.method public n()Lorg/eclipse/paho/client/mqttv3/MqttToken;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lkj/a;->o(Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/MqttToken;

    move-result-object v0

    return-object v0
.end method

.method public o(Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/MqttToken;
    .locals 1

    :try_start_0
    iget-object v0, p0, Lkj/a;->i:Lkj/b;

    invoke-virtual {v0, p1}, Lkj/b;->a(Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/MqttToken;

    move-result-object p1
    :try_end_0
    .catch Lorg/eclipse/paho/client/mqttv3/MqttException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :goto_0
    invoke-direct {p0, p1}, Lkj/a;->H(Ljava/lang/Exception;)V

    goto :goto_2

    :goto_1
    invoke-direct {p0, p1}, Lkj/a;->H(Ljava/lang/Exception;)V

    :goto_2
    const/4 p1, 0x0

    :goto_3
    return-object p1
.end method

.method public p(Z)V
    .locals 4

    iget-object v0, p0, Lkj/a;->p:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lkj/a;->J()Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {p0}, Lkj/a;->M()Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz p1, :cond_1

    :cond_0
    iget-object p1, p0, Lkj/a;->b:Lorg/eclipse/paho/client/mqttv3/logging/a;

    iget-object v1, p0, Lkj/a;->a:Ljava/lang/String;

    const-string/jumbo v2, "close"

    const-string v3, "224"

    invoke-interface {p1, v1, v2, v3}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lkj/a;->L()Z

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {p0}, Lkj/a;->K()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {p0}, Lkj/a;->N()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, p0, Lkj/a;->q:Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x4

    iput-byte p1, p0, Lkj/a;->o:B

    iget-object p1, p0, Lkj/a;->i:Lkj/b;

    invoke-virtual {p1}, Lkj/b;->d()V

    const/4 p1, 0x0

    iput-object p1, p0, Lkj/a;->i:Lkj/b;

    iput-object p1, p0, Lkj/a;->h:Lkj/c;

    iput-object p1, p0, Lkj/a;->k:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    iput-object p1, p0, Lkj/a;->g:Lkj/e;

    iput-object p1, p0, Lkj/a;->l:Lorg/eclipse/paho/client/mqttv3/MqttPingSender;

    iput-object p1, p0, Lkj/a;->f:Lkj/d;

    iput-object p1, p0, Lkj/a;->e:[Lkj/p;

    iput-object p1, p0, Lkj/a;->j:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    iput-object p1, p0, Lkj/a;->m:Lkj/f;

    goto :goto_0

    :cond_2
    const/16 p1, 0x7d64

    invoke-static {p1}, Lkj/i;->a(I)Lorg/eclipse/paho/client/mqttv3/MqttException;

    move-result-object p1

    throw p1

    :cond_3
    new-instance p1, Lorg/eclipse/paho/client/mqttv3/MqttException;

    const/16 v1, 0x7d6e

    invoke-direct {p1, v1}, Lorg/eclipse/paho/client/mqttv3/MqttException;-><init>(I)V

    throw p1

    :cond_4
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public q(Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;Lorg/eclipse/paho/client/mqttv3/MqttToken;)V
    .locals 11

    iget-object v0, p0, Lkj/a;->p:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lkj/a;->M()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lkj/a;->q:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Lkj/a;->b:Lorg/eclipse/paho/client/mqttv3/logging/a;

    iget-object v2, p0, Lkj/a;->a:Ljava/lang/String;

    const-string/jumbo v3, "connect"

    const-string v4, "214"

    invoke-interface {v1, v2, v3, v4}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x1

    iput-byte v1, p0, Lkj/a;->o:B

    iput-object p1, p0, Lkj/a;->j:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    new-instance p1, Lnj/d;

    iget-object v1, p0, Lkj/a;->c:Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    invoke-interface {v1}, Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;->getClientId()Ljava/lang/String;

    move-result-object v3

    iget-object v1, p0, Lkj/a;->j:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    invoke-virtual {v1}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->getMqttVersion()I

    move-result v4

    iget-object v1, p0, Lkj/a;->j:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    invoke-virtual {v1}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->isCleanSession()Z

    move-result v5

    iget-object v1, p0, Lkj/a;->j:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    invoke-virtual {v1}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->getKeepAliveInterval()I

    move-result v6

    iget-object v1, p0, Lkj/a;->j:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    invoke-virtual {v1}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->getUserName()Ljava/lang/String;

    move-result-object v7

    iget-object v1, p0, Lkj/a;->j:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    invoke-virtual {v1}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->getPassword()[C

    move-result-object v8

    iget-object v1, p0, Lkj/a;->j:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    invoke-virtual {v1}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->getWillMessage()Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    move-result-object v9

    iget-object v1, p0, Lkj/a;->j:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    invoke-virtual {v1}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->getWillDestination()Ljava/lang/String;

    move-result-object v10

    move-object v2, p1

    invoke-direct/range {v2 .. v10}, Lnj/d;-><init>(Ljava/lang/String;IZILjava/lang/String;[CLorg/eclipse/paho/client/mqttv3/MqttMessage;Ljava/lang/String;)V

    iget-object v1, p0, Lkj/a;->i:Lkj/b;

    iget-object v2, p0, Lkj/a;->j:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    invoke-virtual {v2}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->getKeepAliveInterval()I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {v1, v2, v3}, Lkj/b;->P(J)V

    iget-object v1, p0, Lkj/a;->i:Lkj/b;

    iget-object v2, p0, Lkj/a;->j:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    invoke-virtual {v2}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->isCleanSession()Z

    move-result v2

    invoke-virtual {v1, v2}, Lkj/b;->O(Z)V

    iget-object v1, p0, Lkj/a;->i:Lkj/b;

    iget-object v2, p0, Lkj/a;->j:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    invoke-virtual {v2}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->getMaxInflight()I

    move-result v2

    invoke-virtual {v1, v2}, Lkj/b;->Q(I)V

    iget-object v1, p0, Lkj/a;->m:Lkj/f;

    invoke-virtual {v1}, Lkj/f;->g()V

    new-instance v1, Lkj/a$a;

    iget-object v7, p0, Lkj/a;->t:Ljava/util/concurrent/ExecutorService;

    move-object v2, v1

    move-object v3, p0

    move-object v4, p0

    move-object v5, p2

    move-object v6, p1

    invoke-direct/range {v2 .. v7}, Lkj/a$a;-><init>(Lkj/a;Lkj/a;Lorg/eclipse/paho/client/mqttv3/MqttToken;Lnj/d;Ljava/util/concurrent/ExecutorService;)V

    invoke-virtual {v1}, Lkj/a$a;->a()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lkj/a;->b:Lorg/eclipse/paho/client/mqttv3/logging/a;

    iget-object p2, p0, Lkj/a;->a:Ljava/lang/String;

    const-string/jumbo v1, "connect"

    const-string v2, "207"

    iget-byte v3, p0, Lkj/a;->o:B

    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-interface {p1, p2, v1, v2, v3}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, Lkj/a;->J()Z

    move-result p1

    if-nez p1, :cond_3

    iget-boolean p1, p0, Lkj/a;->q:Z

    if-nez p1, :cond_3

    invoke-virtual {p0}, Lkj/a;->L()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {p0}, Lkj/a;->N()Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Lorg/eclipse/paho/client/mqttv3/MqttException;

    const/16 p2, 0x7d66

    invoke-direct {p1, p2}, Lorg/eclipse/paho/client/mqttv3/MqttException;-><init>(I)V

    throw p1

    :cond_1
    const/16 p1, 0x7d64

    invoke-static {p1}, Lkj/i;->a(I)Lorg/eclipse/paho/client/mqttv3/MqttException;

    move-result-object p1

    throw p1

    :cond_2
    new-instance p1, Lorg/eclipse/paho/client/mqttv3/MqttException;

    const/16 p2, 0x7d6e

    invoke-direct {p1, p2}, Lorg/eclipse/paho/client/mqttv3/MqttException;-><init>(I)V

    throw p1

    :cond_3
    new-instance p1, Lorg/eclipse/paho/client/mqttv3/MqttException;

    const/16 p2, 0x7d6f

    invoke-direct {p1, p2}, Lorg/eclipse/paho/client/mqttv3/MqttException;-><init>(I)V

    throw p1

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public r(Lnj/c;Lorg/eclipse/paho/client/mqttv3/MqttException;)V
    .locals 4

    invoke-virtual {p1}, Lnj/c;->w()I

    move-result p1

    iget-object v0, p0, Lkj/a;->p:Ljava/lang/Object;

    monitor-enter v0

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lkj/a;->b:Lorg/eclipse/paho/client/mqttv3/logging/a;

    iget-object p2, p0, Lkj/a;->a:Ljava/lang/String;

    const-string/jumbo v1, "connectComplete"

    const-string v2, "215"

    invoke-interface {p1, p2, v1, v2}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-byte p1, p0, Lkj/a;->o:B

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lkj/a;->b:Lorg/eclipse/paho/client/mqttv3/logging/a;

    iget-object v1, p0, Lkj/a;->a:Ljava/lang/String;

    const-string/jumbo v2, "connectComplete"

    const-string v3, "204"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, v1, v2, v3, p1}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    throw p2

    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public s(I)V
    .locals 1

    iget-object v0, p0, Lkj/a;->s:Lkj/h;

    invoke-virtual {v0, p1}, Lkj/h;->a(I)V

    return-void
.end method

.method protected t(I)V
    .locals 1

    iget-object v0, p0, Lkj/a;->i:Lkj/b;

    invoke-virtual {v0, p1}, Lkj/b;->g(I)V

    return-void
.end method

.method protected u(Lnj/o;)V
    .locals 1

    iget-object v0, p0, Lkj/a;->i:Lkj/b;

    invoke-virtual {v0, p1}, Lkj/b;->h(Lnj/o;)V

    return-void
.end method

.method public v(Lnj/e;JLorg/eclipse/paho/client/mqttv3/MqttToken;)V
    .locals 9

    iget-object v0, p0, Lkj/a;->p:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lkj/a;->J()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {p0}, Lkj/a;->M()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p0}, Lkj/a;->N()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    iget-object v2, p0, Lkj/a;->h:Lkj/c;

    invoke-virtual {v2}, Lkj/c;->e()Ljava/lang/Thread;

    move-result-object v2

    if-eq v1, v2, :cond_0

    iget-object v1, p0, Lkj/a;->b:Lorg/eclipse/paho/client/mqttv3/logging/a;

    iget-object v2, p0, Lkj/a;->a:Ljava/lang/String;

    const-string/jumbo v3, "disconnect"

    const-string v4, "218"

    invoke-interface {v1, v2, v3, v4}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x2

    iput-byte v1, p0, Lkj/a;->o:B

    new-instance v1, Lkj/a$b;

    iget-object v8, p0, Lkj/a;->t:Ljava/util/concurrent/ExecutorService;

    move-object v2, v1

    move-object v3, p0

    move-object v4, p1

    move-wide v5, p2

    move-object v7, p4

    invoke-direct/range {v2 .. v8}, Lkj/a$b;-><init>(Lkj/a;Lnj/e;JLorg/eclipse/paho/client/mqttv3/MqttToken;Ljava/util/concurrent/ExecutorService;)V

    invoke-virtual {v1}, Lkj/a$b;->a()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lkj/a;->b:Lorg/eclipse/paho/client/mqttv3/logging/a;

    iget-object p2, p0, Lkj/a;->a:Ljava/lang/String;

    const-string/jumbo p3, "disconnect"

    const-string p4, "210"

    invoke-interface {p1, p2, p3, p4}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 p1, 0x7d6b

    invoke-static {p1}, Lkj/i;->a(I)Lorg/eclipse/paho/client/mqttv3/MqttException;

    move-result-object p1

    throw p1

    :cond_1
    iget-object p1, p0, Lkj/a;->b:Lorg/eclipse/paho/client/mqttv3/logging/a;

    iget-object p2, p0, Lkj/a;->a:Ljava/lang/String;

    const-string/jumbo p3, "disconnect"

    const-string p4, "219"

    invoke-interface {p1, p2, p3, p4}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 p1, 0x7d66

    invoke-static {p1}, Lkj/i;->a(I)Lorg/eclipse/paho/client/mqttv3/MqttException;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lkj/a;->b:Lorg/eclipse/paho/client/mqttv3/logging/a;

    iget-object p2, p0, Lkj/a;->a:Ljava/lang/String;

    const-string/jumbo p3, "disconnect"

    const-string p4, "211"

    invoke-interface {p1, p2, p3, p4}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 p1, 0x7d65

    invoke-static {p1}, Lkj/i;->a(I)Lorg/eclipse/paho/client/mqttv3/MqttException;

    move-result-object p1

    throw p1

    :cond_3
    iget-object p1, p0, Lkj/a;->b:Lorg/eclipse/paho/client/mqttv3/logging/a;

    iget-object p2, p0, Lkj/a;->a:Ljava/lang/String;

    const-string/jumbo p3, "disconnect"

    const-string p4, "223"

    invoke-interface {p1, p2, p3, p4}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 p1, 0x7d6f

    invoke-static {p1}, Lkj/i;->a(I)Lorg/eclipse/paho/client/mqttv3/MqttException;

    move-result-object p1

    throw p1

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public w(JJ)V
    .locals 6

    const/4 v5, 0x1

    move-object v0, p0

    move-wide v1, p1

    move-wide v3, p3

    invoke-virtual/range {v0 .. v5}, Lkj/a;->x(JJZ)V

    return-void
.end method

.method public x(JJZ)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, Lkj/a;->o:B

    iget-object v0, p0, Lkj/a;->i:Lkj/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lkj/b;->F(J)V

    :cond_0
    new-instance p1, Lorg/eclipse/paho/client/mqttv3/MqttToken;

    iget-object p2, p0, Lkj/a;->c:Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    invoke-interface {p2}, Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;->getClientId()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lorg/eclipse/paho/client/mqttv3/MqttToken;-><init>(Ljava/lang/String;)V

    const/4 p2, 0x0

    if-eqz p5, :cond_1

    :try_start_0
    new-instance p5, Lnj/e;

    invoke-direct {p5}, Lnj/e;-><init>()V

    invoke-virtual {p0, p5, p1}, Lkj/a;->I(Lnj/u;Lorg/eclipse/paho/client/mqttv3/MqttToken;)V

    invoke-virtual {p1, p3, p4}, Lorg/eclipse/paho/client/mqttv3/MqttToken;->waitForCompletion(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p3

    iget-object p4, p1, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lkj/x;

    invoke-virtual {p4, p2, p2}, Lkj/x;->q(Lnj/u;Lorg/eclipse/paho/client/mqttv3/MqttException;)V

    invoke-virtual {p0, p1, p2}, Lkj/a;->b0(Lorg/eclipse/paho/client/mqttv3/MqttToken;Lorg/eclipse/paho/client/mqttv3/MqttException;)V

    throw p3

    :catch_0
    :cond_1
    :goto_0
    iget-object p3, p1, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lkj/x;

    invoke-virtual {p3, p2, p2}, Lkj/x;->q(Lnj/u;Lorg/eclipse/paho/client/mqttv3/MqttException;)V

    invoke-virtual {p0, p1, p2}, Lkj/a;->b0(Lorg/eclipse/paho/client/mqttv3/MqttToken;Lorg/eclipse/paho/client/mqttv3/MqttException;)V

    return-void
.end method

.method public y()I
    .locals 1

    iget-object v0, p0, Lkj/a;->i:Lkj/b;

    invoke-virtual {v0}, Lkj/b;->k()I

    move-result v0

    return v0
.end method

.method public z(I)Lorg/eclipse/paho/client/mqttv3/MqttMessage;
    .locals 1

    iget-object v0, p0, Lkj/a;->s:Lkj/h;

    invoke-virtual {v0, p1}, Lkj/h;->b(I)Lorg/eclipse/paho/client/mqttv3/BufferedMessage;

    move-result-object p1

    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/BufferedMessage;->getMessage()Lnj/u;

    move-result-object p1

    check-cast p1, Lnj/o;

    invoke-virtual {p1}, Lnj/o;->x()Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    move-result-object p1

    return-object p1
.end method
