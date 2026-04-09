.class public Lkj/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final E:Ljava/lang/String; = "kj.b"


# instance fields
.field private A:Ljava/util/Hashtable;

.field private B:Ljava/util/Hashtable;

.field private C:Ljava/util/Hashtable;

.field private D:Lorg/eclipse/paho/client/mqttv3/MqttPingSender;

.field private a:Lorg/eclipse/paho/client/mqttv3/logging/a;

.field private b:I

.field private c:Ljava/util/Hashtable;

.field private volatile d:Ljava/util/Vector;

.field private volatile e:Ljava/util/Vector;

.field private f:Lkj/f;

.field private g:Lkj/a;

.field private h:Lkj/c;

.field private i:J

.field private j:Z

.field private k:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

.field private l:Lkj/k;

.field private m:I

.field private n:I

.field private o:I

.field private final p:Ljava/lang/Object;

.field private final q:Ljava/lang/Object;

.field private r:Z

.field private s:J

.field private t:J

.field private u:J

.field private v:Lnj/u;

.field private final w:Ljava/lang/Object;

.field private x:I

.field private y:Z

.field private z:Ljava/util/Hashtable;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method protected constructor <init>(Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;Lkj/f;Lkj/c;Lkj/a;Lorg/eclipse/paho/client/mqttv3/MqttPingSender;Lkj/k;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lkj/b;->E:Ljava/lang/String;

    const-string/jumbo v1, "org.eclipse.paho.client.mqttv3.internal.nls.logcat"

    invoke-static {v1, v0}, Lorg/eclipse/paho/client/mqttv3/logging/b;->a(Ljava/lang/String;Ljava/lang/String;)Lorg/eclipse/paho/client/mqttv3/logging/a;

    move-result-object v1

    iput-object v1, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    const/4 v2, 0x0

    iput v2, p0, Lkj/b;->b:I

    const/4 v3, 0x0

    iput-object v3, p0, Lkj/b;->g:Lkj/a;

    iput-object v3, p0, Lkj/b;->h:Lkj/c;

    iput v2, p0, Lkj/b;->m:I

    iput v2, p0, Lkj/b;->n:I

    iput v2, p0, Lkj/b;->o:I

    new-instance v4, Ljava/lang/Object;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    iput-object v4, p0, Lkj/b;->p:Ljava/lang/Object;

    new-instance v4, Ljava/lang/Object;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    iput-object v4, p0, Lkj/b;->q:Ljava/lang/Object;

    iput-boolean v2, p0, Lkj/b;->r:Z

    const-wide/16 v4, 0x0

    iput-wide v4, p0, Lkj/b;->s:J

    iput-wide v4, p0, Lkj/b;->t:J

    iput-wide v4, p0, Lkj/b;->u:J

    new-instance v4, Ljava/lang/Object;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    iput-object v4, p0, Lkj/b;->w:Ljava/lang/Object;

    iput v2, p0, Lkj/b;->x:I

    iput-boolean v2, p0, Lkj/b;->y:Z

    iput-object v3, p0, Lkj/b;->z:Ljava/util/Hashtable;

    iput-object v3, p0, Lkj/b;->A:Ljava/util/Hashtable;

    iput-object v3, p0, Lkj/b;->B:Ljava/util/Hashtable;

    iput-object v3, p0, Lkj/b;->C:Ljava/util/Hashtable;

    iput-object v3, p0, Lkj/b;->D:Lorg/eclipse/paho/client/mqttv3/MqttPingSender;

    invoke-virtual {p4}, Lkj/a;->B()Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    move-result-object v3

    invoke-interface {v3}, Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;->getClientId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Lorg/eclipse/paho/client/mqttv3/logging/a;->setResourceName(Ljava/lang/String;)V

    iget-object v1, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    const-string v3, "<Init>"

    const-string v4, ""

    invoke-interface {v1, v0, v3, v4}, Lorg/eclipse/paho/client/mqttv3/logging/a;->finer(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lkj/b;->c:Ljava/util/Hashtable;

    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lkj/b;->e:Ljava/util/Vector;

    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lkj/b;->z:Ljava/util/Hashtable;

    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lkj/b;->A:Ljava/util/Hashtable;

    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lkj/b;->B:Ljava/util/Hashtable;

    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lkj/b;->C:Ljava/util/Hashtable;

    new-instance v0, Lnj/i;

    invoke-direct {v0}, Lnj/i;-><init>()V

    iput-object v0, p0, Lkj/b;->v:Lnj/u;

    iput v2, p0, Lkj/b;->o:I

    iput v2, p0, Lkj/b;->n:I

    iput-object p1, p0, Lkj/b;->k:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    iput-object p3, p0, Lkj/b;->h:Lkj/c;

    iput-object p2, p0, Lkj/b;->f:Lkj/f;

    iput-object p4, p0, Lkj/b;->g:Lkj/a;

    iput-object p5, p0, Lkj/b;->D:Lorg/eclipse/paho/client/mqttv3/MqttPingSender;

    iput-object p6, p0, Lkj/b;->l:Lkj/k;

    invoke-virtual {p0}, Lkj/b;->M()V

    return-void
.end method

.method private G(Ljava/util/Vector;)Ljava/util/Vector;
    .locals 7

    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    invoke-virtual {p1}, Ljava/util/Vector;->size()I

    move-result v1

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    move v4, v3

    move v5, v4

    :goto_0
    invoke-virtual {p1}, Ljava/util/Vector;->size()I

    move-result v6

    if-lt v2, v6, :cond_4

    invoke-virtual {p1, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnj/u;

    invoke-virtual {v2}, Lnj/u;->j()I

    move-result v2

    const v6, 0xffff

    sub-int/2addr v6, v3

    add-int/2addr v6, v2

    if-le v6, v4, :cond_1

    move v6, v1

    goto :goto_1

    :cond_1
    move v6, v5

    :goto_1
    move v2, v6

    :goto_2
    invoke-virtual {p1}, Ljava/util/Vector;->size()I

    move-result v3

    if-lt v2, v3, :cond_3

    :goto_3
    if-lt v1, v6, :cond_2

    return-object v0

    :cond_2
    invoke-virtual {p1, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_3
    invoke-virtual {p1, v2}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_4
    invoke-virtual {p1, v2}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lnj/u;

    invoke-virtual {v6}, Lnj/u;->j()I

    move-result v6

    sub-int v3, v6, v3

    if-le v3, v4, :cond_5

    move v5, v2

    move v4, v3

    :cond_5
    add-int/lit8 v2, v2, 0x1

    move v3, v6

    goto :goto_0
.end method

.method private declared-synchronized H(I)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lkj/b;->c:Ljava/util/Hashtable;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private K()V
    .locals 8

    new-instance v0, Ljava/util/Vector;

    iget v1, p0, Lkj/b;->m:I

    invoke-direct {v0, v1}, Ljava/util/Vector;-><init>(I)V

    iput-object v0, p0, Lkj/b;->d:Ljava/util/Vector;

    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lkj/b;->e:Ljava/util/Vector;

    iget-object v0, p0, Lkj/b;->z:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->keys()Ljava/util/Enumeration;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    const/4 v2, 0x1

    const-string/jumbo v3, "restoreInflightMessages"

    if-nez v1, :cond_3

    iget-object v0, p0, Lkj/b;->A:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->keys()Ljava/util/Enumeration;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lkj/b;->B:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->keys()Ljava/util/Enumeration;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v0, p0, Lkj/b;->e:Ljava/util/Vector;

    invoke-direct {p0, v0}, Lkj/b;->G(Ljava/util/Vector;)Ljava/util/Vector;

    move-result-object v0

    iput-object v0, p0, Lkj/b;->e:Ljava/util/Vector;

    iget-object v0, p0, Lkj/b;->d:Ljava/util/Vector;

    invoke-direct {p0, v0}, Lkj/b;->G(Ljava/util/Vector;)Ljava/util/Vector;

    move-result-object v0

    iput-object v0, p0, Lkj/b;->d:Ljava/util/Vector;

    return-void

    :cond_1
    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lkj/b;->B:Ljava/util/Hashtable;

    invoke-virtual {v2, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnj/o;

    iget-object v4, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v5, Lkj/b;->E:Ljava/lang/String;

    const-string v6, "512"

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v4, v5, v3, v6, v1}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lkj/b;->d:Ljava/util/Vector;

    invoke-direct {p0, v1, v2}, Lkj/b;->v(Ljava/util/Vector;Lnj/u;)V

    goto :goto_2

    :cond_2
    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    iget-object v4, p0, Lkj/b;->A:Ljava/util/Hashtable;

    invoke-virtual {v4, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lnj/o;

    invoke-virtual {v4, v2}, Lnj/u;->r(Z)V

    iget-object v5, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v6, Lkj/b;->E:Ljava/lang/String;

    const-string v7, "612"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v5, v6, v3, v7, v0}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lkj/b;->d:Ljava/util/Vector;

    invoke-direct {p0, v0, v4}, Lkj/b;->v(Ljava/util/Vector;Lnj/u;)V

    goto :goto_1

    :cond_3
    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    iget-object v4, p0, Lkj/b;->z:Ljava/util/Hashtable;

    invoke-virtual {v4, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lnj/u;

    instance-of v5, v4, Lnj/o;

    if-eqz v5, :cond_4

    iget-object v5, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v6, Lkj/b;->E:Ljava/lang/String;

    const-string v7, "610"

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v5, v6, v3, v7, v1}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v4, v2}, Lnj/u;->r(Z)V

    iget-object v1, p0, Lkj/b;->d:Ljava/util/Vector;

    check-cast v4, Lnj/o;

    invoke-direct {p0, v1, v4}, Lkj/b;->v(Ljava/util/Vector;Lnj/u;)V

    goto/16 :goto_0

    :cond_4
    instance-of v2, v4, Lnj/n;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v5, Lkj/b;->E:Ljava/lang/String;

    const-string v6, "611"

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v2, v5, v3, v6, v1}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lkj/b;->e:Ljava/util/Vector;

    check-cast v4, Lnj/n;

    invoke-direct {p0, v1, v4}, Lkj/b;->v(Ljava/util/Vector;Lnj/u;)V

    goto/16 :goto_0
.end method

.method private L(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttPersistable;)Lnj/u;
    .locals 6

    :try_start_0
    invoke-static {p2}, Lnj/u;->b(Lorg/eclipse/paho/client/mqttv3/MqttPersistable;)Lnj/u;

    move-result-object p2
    :try_end_0
    .catch Lorg/eclipse/paho/client/mqttv3/MqttException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    iget-object v0, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v1, Lkj/b;->E:Ljava/lang/String;

    const-string v3, "602"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v4

    const-string/jumbo v2, "restoreMessage"

    move-object v5, p2

    invoke-interface/range {v0 .. v5}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    invoke-virtual {p2}, Lorg/eclipse/paho/client/mqttv3/MqttException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v0, v0, Ljava/io/EOFException;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lkj/b;->k:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    invoke-interface {p2, p1}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->remove(Ljava/lang/String;)V

    :cond_0
    const/4 p2, 0x0

    :goto_0
    iget-object v0, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v1, Lkj/b;->E:Ljava/lang/String;

    const-string v2, "601"

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    const-string/jumbo v3, "restoreMessage"

    invoke-interface {v0, v1, v3, v2, p1}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object p2

    :cond_1
    throw p2
.end method

.method private f()V
    .locals 6

    iget-object v0, p0, Lkj/b;->p:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lkj/b;->n:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lkj/b;->n:I

    iget-object v2, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v3, Lkj/b;->E:Ljava/lang/String;

    const-string/jumbo v4, "decrementInFlight"

    const-string v5, "646"

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v2, v3, v4, v5, v1}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, Lkj/b;->b()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lkj/b;->p:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private declared-synchronized o()I
    .locals 5

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lkj/b;->b:I

    const/4 v1, 0x0

    :cond_0
    iget v2, p0, Lkj/b;->b:I

    const/4 v3, 0x1

    add-int/2addr v2, v3

    iput v2, p0, Lkj/b;->b:I

    const v4, 0xffff

    if-le v2, v4, :cond_1

    iput v3, p0, Lkj/b;->b:I

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    :goto_0
    iget v2, p0, Lkj/b;->b:I

    if-ne v2, v0, :cond_3

    add-int/lit8 v1, v1, 0x1

    const/4 v3, 0x2

    if-eq v1, v3, :cond_2

    goto :goto_1

    :cond_2
    const/16 v0, 0x7d01

    invoke-static {v0}, Lkj/i;->a(I)Lorg/eclipse/paho/client/mqttv3/MqttException;

    move-result-object v0

    throw v0

    :cond_3
    :goto_1
    iget-object v3, p0, Lkj/b;->c:Ljava/util/Hashtable;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    iget v0, p0, Lkj/b;->b:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lkj/b;->c:Ljava/util/Hashtable;

    invoke-virtual {v1, v0, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, p0, Lkj/b;->b:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private p(I)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v1, "r-"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private q(Lnj/u;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v1, "r-"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lnj/u;->j()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private r(Lnj/u;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v1, "sb-"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lnj/u;->j()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private s(Lnj/u;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v1, "sc-"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lnj/u;->j()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private t(I)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v1, "s-"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private u(Lnj/u;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v1, "s-"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lnj/u;->j()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private v(Ljava/util/Vector;Lnj/u;)V
    .locals 3

    invoke-virtual {p2}, Lnj/u;->j()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/util/Vector;->size()I

    move-result v2

    if-lt v1, v2, :cond_0

    invoke-virtual {p1, p2}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {p1, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnj/u;

    invoke-virtual {v2}, Lnj/u;->j()I

    move-result v2

    if-le v2, v0, :cond_1

    invoke-virtual {p1, p2, v1}, Ljava/util/Vector;->insertElementAt(Ljava/lang/Object;I)V

    return-void

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method


# virtual methods
.method protected A(Lnj/u;)V
    .locals 5

    iget-object v0, p0, Lkj/b;->l:Lkj/k;

    invoke-interface {v0}, Lkj/k;->b()J

    move-result-wide v0

    iput-wide v0, p0, Lkj/b;->t:J

    iget-object v0, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v1, Lkj/b;->E:Ljava/lang/String;

    invoke-virtual {p1}, Lnj/u;->j()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v2, p1}, [Ljava/lang/Object;

    move-result-object v2

    const-string/jumbo v3, "notifyReceivedMsg"

    const-string v4, "651"

    invoke-interface {v0, v1, v3, v4, v2}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-boolean v0, p0, Lkj/b;->r:Z

    if-nez v0, :cond_4

    instance-of v0, p1, Lnj/o;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Lnj/o;

    invoke-virtual {v0}, Lnj/o;->x()Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    move-result-object v2

    invoke-virtual {v2}, Lorg/eclipse/paho/client/mqttv3/MqttMessage;->getQos()I

    move-result v2

    if-eqz v2, :cond_1

    const/4 v3, 0x1

    if-eq v2, v3, :cond_1

    const/4 v3, 0x2

    if-eq v2, v3, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lkj/b;->k:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    invoke-direct {p0, p1}, Lkj/b;->q(Lnj/u;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v2, p1, v0}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->put(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttPersistable;)V

    iget-object p1, p0, Lkj/b;->C:Ljava/util/Hashtable;

    invoke-virtual {v0}, Lnj/u;->j()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v2, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Lnj/m;

    invoke-direct {p1, v0}, Lnj/m;-><init>(Lnj/o;)V

    invoke-virtual {p0, p1, v1}, Lkj/b;->N(Lnj/u;Lorg/eclipse/paho/client/mqttv3/MqttToken;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lkj/b;->h:Lkj/c;

    if-eqz p1, :cond_4

    invoke-virtual {p1, v0}, Lkj/c;->k(Lnj/o;)V

    goto :goto_0

    :cond_2
    instance-of v0, p1, Lnj/n;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lkj/b;->C:Ljava/util/Hashtable;

    invoke-virtual {p1}, Lnj/u;->j()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnj/o;

    if-eqz v0, :cond_3

    iget-object p1, p0, Lkj/b;->h:Lkj/c;

    if-eqz p1, :cond_4

    invoke-virtual {p1, v0}, Lkj/c;->k(Lnj/o;)V

    goto :goto_0

    :cond_3
    new-instance v0, Lnj/l;

    invoke-virtual {p1}, Lnj/u;->j()I

    move-result p1

    invoke-direct {v0, p1}, Lnj/l;-><init>(I)V

    invoke-virtual {p0, v0, v1}, Lkj/b;->N(Lnj/u;Lorg/eclipse/paho/client/mqttv3/MqttToken;)V

    :cond_4
    :goto_0
    return-void
.end method

.method protected B(Lnj/u;Lorg/eclipse/paho/client/mqttv3/MqttToken;Lorg/eclipse/paho/client/mqttv3/MqttException;)V
    .locals 5

    iget-object v0, p2, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lkj/x;

    invoke-virtual {v0, p1, p3}, Lkj/x;->q(Lnj/u;Lorg/eclipse/paho/client/mqttv3/MqttException;)V

    iget-object v0, p2, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lkj/x;

    invoke-virtual {v0}, Lkj/x;->r()V

    const-string/jumbo v0, "notifyResult"

    if-eqz p1, :cond_0

    instance-of v1, p1, Lnj/b;

    if-eqz v1, :cond_0

    instance-of v1, p1, Lnj/m;

    if-nez v1, :cond_0

    iget-object v1, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v2, Lkj/b;->E:Ljava/lang/String;

    iget-object v3, p2, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lkj/x;

    invoke-virtual {v3}, Lkj/x;->f()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3, p1, p3}, [Ljava/lang/Object;

    move-result-object v3

    const-string v4, "648"

    invoke-interface {v1, v2, v0, v4, v3}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lkj/b;->h:Lkj/c;

    invoke-virtual {v1, p2}, Lkj/c;->a(Lorg/eclipse/paho/client/mqttv3/MqttToken;)V

    :cond_0
    if-nez p1, :cond_1

    iget-object p1, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v1, Lkj/b;->E:Ljava/lang/String;

    iget-object v2, p2, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lkj/x;

    invoke-virtual {v2}, Lkj/x;->f()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2, p3}, [Ljava/lang/Object;

    move-result-object p3

    const-string v2, "649"

    invoke-interface {p1, v1, v0, v2, p3}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lkj/b;->h:Lkj/c;

    invoke-virtual {p1, p2}, Lkj/c;->a(Lorg/eclipse/paho/client/mqttv3/MqttToken;)V

    :cond_1
    return-void
.end method

.method protected C(Lnj/u;)V
    .locals 5

    iget-object v0, p0, Lkj/b;->l:Lkj/k;

    invoke-interface {v0}, Lkj/k;->b()J

    move-result-wide v0

    iput-wide v0, p0, Lkj/b;->s:J

    iget-object v0, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v1, Lkj/b;->E:Ljava/lang/String;

    const-string/jumbo v2, "notifySent"

    const-string v3, "625"

    invoke-virtual {p1}, Lnj/u;->i()Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v0, v1, v2, v3, v4}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Lnj/u;->m()Lorg/eclipse/paho/client/mqttv3/MqttToken;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lkj/b;->f:Lkj/f;

    invoke-virtual {v0, p1}, Lkj/f;->f(Lnj/u;)Lorg/eclipse/paho/client/mqttv3/MqttToken;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v2, v0, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lkj/x;

    invoke-virtual {v2}, Lkj/x;->s()V

    instance-of v2, p1, Lnj/i;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lkj/b;->w:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget-object p1, p0, Lkj/b;->l:Lkj/k;

    invoke-interface {p1}, Lkj/k;->b()J

    move-result-wide v3

    iget-object p1, p0, Lkj/b;->w:Ljava/lang/Object;

    monitor-enter p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iput-wide v3, p0, Lkj/b;->u:J

    iget v0, p0, Lkj/b;->x:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lkj/b;->x:I

    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget-object p1, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    const-string/jumbo v3, "notifySent"

    const-string v4, "635"

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v1, v3, v4, v0}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    throw v0

    :goto_0
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1

    :cond_1
    instance-of v1, p1, Lnj/o;

    if-eqz v1, :cond_2

    move-object v1, p1

    check-cast v1, Lnj/o;

    invoke-virtual {v1}, Lnj/o;->x()Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    move-result-object v1

    invoke-virtual {v1}, Lorg/eclipse/paho/client/mqttv3/MqttMessage;->getQos()I

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, v0, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lkj/x;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v2}, Lkj/x;->q(Lnj/u;Lorg/eclipse/paho/client/mqttv3/MqttException;)V

    iget-object v1, p0, Lkj/b;->h:Lkj/c;

    invoke-virtual {v1, v0}, Lkj/c;->a(Lorg/eclipse/paho/client/mqttv3/MqttToken;)V

    invoke-direct {p0}, Lkj/b;->f()V

    invoke-virtual {p1}, Lnj/u;->j()I

    move-result v0

    invoke-direct {p0, v0}, Lkj/b;->H(I)V

    iget-object v0, p0, Lkj/b;->f:Lkj/f;

    invoke-virtual {v0, p1}, Lkj/f;->j(Lnj/u;)Lorg/eclipse/paho/client/mqttv3/MqttToken;

    invoke-virtual {p0}, Lkj/b;->b()Z

    :cond_2
    :goto_1
    return-void
.end method

.method public D(I)V
    .locals 4

    if-lez p1, :cond_0

    iget-object v0, p0, Lkj/b;->l:Lkj/k;

    invoke-interface {v0}, Lkj/k;->b()J

    move-result-wide v0

    iput-wide v0, p0, Lkj/b;->s:J

    :cond_0
    iget-object v0, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v1, Lkj/b;->E:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string/jumbo v2, "notifySentBytes"

    const-string v3, "643"

    invoke-interface {v0, v1, v2, v3, p1}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public E(Lnj/u;)V
    .locals 5

    const-string/jumbo v0, "persistBufferedMessage"

    invoke-direct {p0, p1}, Lkj/b;->r(Lnj/u;)Ljava/lang/String;

    move-result-object v1

    :try_start_0
    invoke-direct {p0}, Lkj/b;->o()I

    move-result v2

    invoke-virtual {p1, v2}, Lnj/u;->s(I)V

    invoke-direct {p0, p1}, Lkj/b;->r(Lnj/u;)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Lorg/eclipse/paho/client/mqttv3/MqttException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v2, p0, Lkj/b;->k:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    move-object v3, p1

    check-cast v3, Lnj/o;

    invoke-interface {v2, v1, v3}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->put(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttPersistable;)V
    :try_end_1
    .catch Lorg/eclipse/paho/client/mqttv3/MqttPersistenceException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lorg/eclipse/paho/client/mqttv3/MqttException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    :try_start_2
    iget-object v2, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v3, Lkj/b;->E:Ljava/lang/String;

    const-string v4, "515"

    invoke-interface {v2, v3, v0, v4}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Lkj/b;->k:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    iget-object v3, p0, Lkj/b;->g:Lkj/a;

    invoke-virtual {v3}, Lkj/a;->B()Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    move-result-object v3

    invoke-interface {v3}, Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;->getClientId()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lkj/b;->g:Lkj/a;

    invoke-virtual {v4}, Lkj/a;->B()Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    move-result-object v4

    invoke-interface {v4}, Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;->getServerURI()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->open(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Lkj/b;->k:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    check-cast p1, Lnj/o;

    invoke-interface {v2, v1, p1}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->put(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttPersistable;)V

    :goto_0
    iget-object p1, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v2, Lkj/b;->E:Ljava/lang/String;

    const-string v3, "513"

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p1, v2, v0, v3, v4}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Lorg/eclipse/paho/client/mqttv3/MqttException; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    :goto_1
    iget-object v2, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v3, Lkj/b;->E:Ljava/lang/String;

    const-string v4, "514"

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v2, v3, v0, v4, v1}, Lorg/eclipse/paho/client/mqttv3/logging/a;->warning(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    throw p1
.end method

.method public F(J)V
    .locals 9

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_2

    iget-object v0, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v1, Lkj/b;->E:Ljava/lang/String;

    const-string/jumbo v2, "quiesce"

    const-string v3, "637"

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v0, v1, v2, v3, v4}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lkj/b;->p:Ljava/lang/Object;

    monitor-enter v0

    const/4 v2, 0x1

    :try_start_0
    iput-boolean v2, p0, Lkj/b;->r:Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    iget-object v0, p0, Lkj/b;->h:Lkj/c;

    invoke-virtual {v0}, Lkj/c;->m()V

    invoke-virtual {p0}, Lkj/b;->x()V

    iget-object v2, p0, Lkj/b;->q:Ljava/lang/Object;

    monitor-enter v2

    :try_start_1
    iget-object v0, p0, Lkj/b;->f:Lkj/f;

    invoke-virtual {v0}, Lkj/f;->b()I

    move-result v0

    if-gtz v0, :cond_0

    iget-object v3, p0, Lkj/b;->e:Ljava/util/Vector;

    invoke-virtual {v3}, Ljava/util/Vector;->size()I

    move-result v3

    if-gtz v3, :cond_0

    iget-object v3, p0, Lkj/b;->h:Lkj/c;

    invoke-virtual {v3}, Lkj/c;->h()Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v3, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    const-string/jumbo v4, "quiesce"

    const-string v5, "639"

    iget v6, p0, Lkj/b;->n:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    iget-object v7, p0, Lkj/b;->e:Ljava/util/Vector;

    invoke-virtual {v7}, Ljava/util/Vector;->size()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    iget v8, p0, Lkj/b;->o:I

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v6, v7, v8, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v3, v1, v4, v5, v0}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lkj/b;->q:Ljava/lang/Object;

    invoke-virtual {v0, p1, p2}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catch_0
    :cond_1
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object p1, p0, Lkj/b;->p:Ljava/lang/Object;

    monitor-enter p1

    :try_start_3
    iget-object p2, p0, Lkj/b;->d:Ljava/util/Vector;

    invoke-virtual {p2}, Ljava/util/Vector;->clear()V

    iget-object p2, p0, Lkj/b;->e:Ljava/util/Vector;

    invoke-virtual {p2}, Ljava/util/Vector;->clear()V

    const/4 p2, 0x0

    iput-boolean p2, p0, Lkj/b;->r:Z

    iput p2, p0, Lkj/b;->n:I

    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    iget-object p1, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object p2, Lkj/b;->E:Ljava/lang/String;

    const-string/jumbo v0, "quiesce"

    const-string v1, "640"

    invoke-interface {p1, p2, v0, v1}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :catchall_1
    move-exception p2

    :try_start_4
    monitor-exit p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p2

    :goto_1
    :try_start_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw p1

    :catchall_2
    move-exception p1

    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    throw p1

    :cond_2
    :goto_2
    return-void
.end method

.method protected I(Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;)Z
    .locals 6

    invoke-interface {p1}, Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;->getMessage()Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    move-result-object v0

    invoke-interface {p1}, Lorg/eclipse/paho/client/mqttv3/IMqttToken;->getMessageId()I

    move-result p1

    iget-object v1, p0, Lkj/b;->p:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/MqttMessage;->getQos()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    iget-object v2, p0, Lkj/b;->A:Ljava/util/Hashtable;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/MqttMessage;->getQos()I

    move-result v4

    const/4 v5, 0x2

    if-ne v4, v5, :cond_1

    iget-object v4, p0, Lkj/b;->z:Ljava/util/Hashtable;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_1

    move v2, v3

    :cond_1
    iget-object v4, p0, Lkj/b;->d:Ljava/util/Vector;

    invoke-virtual {v4, v0}, Ljava/util/Vector;->removeElement(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    move v3, v2

    :goto_1
    iget-object v0, p0, Lkj/b;->k:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    invoke-direct {p0, p1}, Lkj/b;->t(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->remove(Ljava/lang/String;)V

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lkj/b;->f:Lkj/f;

    invoke-virtual {v2, v0}, Lkj/f;->i(Ljava/lang/String;)Lorg/eclipse/paho/client/mqttv3/MqttToken;

    invoke-direct {p0, p1}, Lkj/b;->H(I)V

    invoke-direct {p0}, Lkj/b;->f()V

    monitor-exit v1

    return v3

    :goto_2
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public J(Lorg/eclipse/paho/client/mqttv3/MqttException;)Ljava/util/Vector;
    .locals 5

    iget-object v0, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v1, Lkj/b;->E:Ljava/lang/String;

    const-string/jumbo v2, "resolveOldTokens"

    const-string v3, "632"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v0, v1, v2, v3, v4}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    if-nez p1, :cond_0

    new-instance p1, Lorg/eclipse/paho/client/mqttv3/MqttException;

    const/16 v0, 0x7d66

    invoke-direct {p1, v0}, Lorg/eclipse/paho/client/mqttv3/MqttException;-><init>(I)V

    :cond_0
    iget-object v0, p0, Lkj/b;->f:Lkj/f;

    invoke-virtual {v0}, Lkj/f;->d()Ljava/util/Vector;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Vector;->elements()Ljava/util/Enumeration;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v2

    if-nez v2, :cond_2

    return-object v0

    :cond_2
    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/eclipse/paho/client/mqttv3/MqttToken;

    monitor-enter v2

    :try_start_0
    invoke-virtual {v2}, Lorg/eclipse/paho/client/mqttv3/MqttToken;->isComplete()Z

    move-result v3

    if-nez v3, :cond_3

    iget-object v3, v2, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lkj/x;

    invoke-virtual {v3}, Lkj/x;->o()Z

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual {v2}, Lorg/eclipse/paho/client/mqttv3/MqttToken;->getException()Lorg/eclipse/paho/client/mqttv3/MqttException;

    move-result-object v3

    if-nez v3, :cond_3

    iget-object v3, v2, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lkj/x;

    invoke-virtual {v3, p1}, Lkj/x;->v(Lorg/eclipse/paho/client/mqttv3/MqttException;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_3
    :goto_1
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    instance-of v3, v2, Lorg/eclipse/paho/client/mqttv3/MqttDeliveryToken;

    if-nez v3, :cond_1

    iget-object v3, p0, Lkj/b;->f:Lkj/f;

    iget-object v2, v2, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lkj/x;

    invoke-virtual {v2}, Lkj/x;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lkj/f;->i(Ljava/lang/String;)Lorg/eclipse/paho/client/mqttv3/MqttToken;

    goto :goto_0

    :goto_2
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method protected M()V
    .locals 13

    iget-object v0, p0, Lkj/b;->k:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    invoke-interface {v0}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->keys()Ljava/util/Enumeration;

    move-result-object v0

    iget v1, p0, Lkj/b;->b:I

    new-instance v2, Ljava/util/Vector;

    invoke-direct {v2}, Ljava/util/Vector;-><init>()V

    iget-object v3, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v4, Lkj/b;->E:Ljava/lang/String;

    const-string v5, "600"

    const-string/jumbo v6, "restoreState"

    invoke-interface {v3, v4, v6, v5}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {v2}, Ljava/util/Vector;->elements()Ljava/util/Enumeration;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-nez v0, :cond_1

    iput v1, p0, Lkj/b;->b:I

    return-void

    :cond_1
    invoke-interface {v3}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v2, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v4, Lkj/b;->E:Ljava/lang/String;

    const-string v5, "609"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v2, v4, v6, v5, v7}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v2, p0, Lkj/b;->k:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    invoke-interface {v2, v0}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->remove(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iget-object v4, p0, Lkj/b;->k:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    invoke-interface {v4, v3}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->get(Ljava/lang/String;)Lorg/eclipse/paho/client/mqttv3/MqttPersistable;

    move-result-object v4

    invoke-direct {p0, v3, v4}, Lkj/b;->L(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttPersistable;)Lnj/u;

    move-result-object v4

    if-eqz v4, :cond_0

    const-string/jumbo v5, "r-"

    invoke-virtual {v3, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_3

    iget-object v5, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v7, Lkj/b;->E:Ljava/lang/String;

    const-string v8, "604"

    filled-new-array {v3, v4}, [Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v5, v7, v6, v8, v3}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v3, p0, Lkj/b;->C:Ljava/util/Hashtable;

    invoke-virtual {v4}, Lnj/u;->j()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v5, v4}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    const-string/jumbo v5, "s-"

    invoke-virtual {v3, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    const-string v7, "608"

    const-string v8, "607"

    const/4 v9, 0x2

    const/4 v10, 0x1

    if-eqz v5, :cond_7

    move-object v5, v4

    check-cast v5, Lnj/o;

    invoke-virtual {v5}, Lnj/u;->j()I

    move-result v11

    invoke-static {v11, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    iget-object v11, p0, Lkj/b;->k:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    invoke-direct {p0, v5}, Lkj/b;->s(Lnj/u;)Ljava/lang/String;

    move-result-object v12

    invoke-interface {v11, v12}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->containsKey(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_5

    iget-object v7, p0, Lkj/b;->k:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    invoke-direct {p0, v5}, Lkj/b;->s(Lnj/u;)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v7, v8}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->get(Ljava/lang/String;)Lorg/eclipse/paho/client/mqttv3/MqttPersistable;

    move-result-object v7

    invoke-direct {p0, v3, v7}, Lkj/b;->L(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttPersistable;)Lnj/u;

    move-result-object v7

    check-cast v7, Lnj/n;

    if-eqz v7, :cond_4

    iget-object v8, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v9, Lkj/b;->E:Ljava/lang/String;

    const-string v10, "605"

    filled-new-array {v3, v4}, [Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v8, v9, v6, v10, v3}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v3, p0, Lkj/b;->z:Ljava/util/Hashtable;

    invoke-virtual {v7}, Lnj/u;->j()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, v4, v7}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_4
    iget-object v7, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v8, Lkj/b;->E:Ljava/lang/String;

    const-string v9, "606"

    filled-new-array {v3, v4}, [Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v7, v8, v6, v9, v3}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    :cond_5
    invoke-virtual {v5, v10}, Lnj/u;->r(Z)V

    invoke-virtual {v5}, Lnj/o;->x()Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    move-result-object v10

    invoke-virtual {v10}, Lorg/eclipse/paho/client/mqttv3/MqttMessage;->getQos()I

    move-result v10

    if-ne v10, v9, :cond_6

    iget-object v7, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v9, Lkj/b;->E:Ljava/lang/String;

    filled-new-array {v3, v4}, [Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v7, v9, v6, v8, v3}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v3, p0, Lkj/b;->z:Ljava/util/Hashtable;

    invoke-virtual {v5}, Lnj/u;->j()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, v4, v5}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_6
    iget-object v8, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v9, Lkj/b;->E:Ljava/lang/String;

    filled-new-array {v3, v4}, [Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v8, v9, v6, v7, v3}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v3, p0, Lkj/b;->A:Ljava/util/Hashtable;

    invoke-virtual {v5}, Lnj/u;->j()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, v4, v5}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_2
    iget-object v3, p0, Lkj/b;->f:Lkj/f;

    invoke-virtual {v3, v5}, Lkj/f;->k(Lnj/o;)Lorg/eclipse/paho/client/mqttv3/MqttDeliveryToken;

    move-result-object v3

    iget-object v3, v3, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lkj/x;

    iget-object v4, p0, Lkj/b;->g:Lkj/a;

    invoke-virtual {v4}, Lkj/a;->B()Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    move-result-object v4

    invoke-virtual {v3, v4}, Lkj/x;->u(Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;)V

    iget-object v3, p0, Lkj/b;->c:Ljava/util/Hashtable;

    invoke-virtual {v5}, Lnj/u;->j()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v5}, Lnj/u;->j()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_7
    const-string/jumbo v5, "sb-"

    invoke-virtual {v3, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_a

    move-object v5, v4

    check-cast v5, Lnj/o;

    invoke-virtual {v5}, Lnj/u;->j()I

    move-result v11

    invoke-static {v11, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-virtual {v5}, Lnj/o;->x()Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    move-result-object v11

    invoke-virtual {v11}, Lorg/eclipse/paho/client/mqttv3/MqttMessage;->getQos()I

    move-result v11

    if-ne v11, v9, :cond_8

    iget-object v7, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v9, Lkj/b;->E:Ljava/lang/String;

    filled-new-array {v3, v4}, [Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v7, v9, v6, v8, v3}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v3, p0, Lkj/b;->z:Ljava/util/Hashtable;

    invoke-virtual {v5}, Lnj/u;->j()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, v4, v5}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_8
    invoke-virtual {v5}, Lnj/o;->x()Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    move-result-object v8

    invoke-virtual {v8}, Lorg/eclipse/paho/client/mqttv3/MqttMessage;->getQos()I

    move-result v8

    if-ne v8, v10, :cond_9

    iget-object v8, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v9, Lkj/b;->E:Ljava/lang/String;

    filled-new-array {v3, v4}, [Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v8, v9, v6, v7, v3}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v3, p0, Lkj/b;->A:Ljava/util/Hashtable;

    invoke-virtual {v5}, Lnj/u;->j()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, v4, v5}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_9
    iget-object v7, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v8, Lkj/b;->E:Ljava/lang/String;

    const-string v9, "511"

    filled-new-array {v3, v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v7, v8, v6, v9, v4}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v4, p0, Lkj/b;->B:Ljava/util/Hashtable;

    invoke-virtual {v5}, Lnj/u;->j()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v4, v7, v5}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v4, p0, Lkj/b;->k:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    invoke-interface {v4, v3}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->remove(Ljava/lang/String;)V

    :goto_3
    iget-object v3, p0, Lkj/b;->f:Lkj/f;

    invoke-virtual {v3, v5}, Lkj/f;->k(Lnj/o;)Lorg/eclipse/paho/client/mqttv3/MqttDeliveryToken;

    move-result-object v3

    iget-object v3, v3, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lkj/x;

    iget-object v4, p0, Lkj/b;->g:Lkj/a;

    invoke-virtual {v4}, Lkj/a;->B()Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    move-result-object v4

    invoke-virtual {v3, v4}, Lkj/x;->u(Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;)V

    iget-object v3, p0, Lkj/b;->c:Ljava/util/Hashtable;

    invoke-virtual {v5}, Lnj/u;->j()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v5}, Lnj/u;->j()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_a
    const-string/jumbo v5, "sc-"

    invoke-virtual {v3, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    check-cast v4, Lnj/n;

    iget-object v5, p0, Lkj/b;->k:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    invoke-direct {p0, v4}, Lkj/b;->u(Lnj/u;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v5, v4}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->containsKey(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v2, v3}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    goto/16 :goto_0
.end method

.method public N(Lnj/u;Lorg/eclipse/paho/client/mqttv3/MqttToken;)V
    .locals 8

    invoke-virtual {p1}, Lnj/u;->p()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lnj/u;->j()I

    move-result v0

    if-nez v0, :cond_2

    instance-of v0, p1, Lnj/o;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lnj/o;

    invoke-virtual {v0}, Lnj/o;->x()Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    move-result-object v0

    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/MqttMessage;->getQos()I

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lkj/b;->o()I

    move-result v0

    invoke-virtual {p1, v0}, Lnj/u;->s(I)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lnj/k;

    if-nez v0, :cond_1

    instance-of v0, p1, Lnj/m;

    if-nez v0, :cond_1

    instance-of v0, p1, Lnj/n;

    if-nez v0, :cond_1

    instance-of v0, p1, Lnj/l;

    if-nez v0, :cond_1

    instance-of v0, p1, Lnj/r;

    if-nez v0, :cond_1

    instance-of v0, p1, Lnj/q;

    if-nez v0, :cond_1

    instance-of v0, p1, Lnj/t;

    if-nez v0, :cond_1

    instance-of v0, p1, Lnj/s;

    if-eqz v0, :cond_2

    :cond_1
    invoke-direct {p0}, Lkj/b;->o()I

    move-result v0

    invoke-virtual {p1, v0}, Lnj/u;->s(I)V

    :cond_2
    :goto_0
    if-eqz p2, :cond_3

    invoke-virtual {p1, p2}, Lnj/u;->t(Lorg/eclipse/paho/client/mqttv3/MqttToken;)V

    :try_start_0
    iget-object v0, p2, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lkj/x;

    invoke-virtual {p1}, Lnj/u;->j()I

    move-result v1

    invoke-virtual {v0, v1}, Lkj/x;->y(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_3
    instance-of v0, p1, Lnj/o;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lkj/b;->p:Ljava/lang/Object;

    monitor-enter v0

    :try_start_1
    iget v1, p0, Lkj/b;->n:I

    iget v2, p0, Lkj/b;->m:I

    if-ge v1, v2, :cond_6

    move-object v1, p1

    check-cast v1, Lnj/o;

    invoke-virtual {v1}, Lnj/o;->x()Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    move-result-object v1

    iget-object v2, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v3, Lkj/b;->E:Ljava/lang/String;

    const-string/jumbo v4, "send"

    const-string v5, "628"

    invoke-virtual {p1}, Lnj/u;->j()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v1}, Lorg/eclipse/paho/client/mqttv3/MqttMessage;->getQos()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    filled-new-array {v6, v7, p1}, [Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v2, v3, v4, v5, v6}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v1}, Lorg/eclipse/paho/client/mqttv3/MqttMessage;->getQos()I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_5

    const/4 v2, 0x2

    if-eq v1, v2, :cond_4

    goto :goto_1

    :cond_4
    iget-object v1, p0, Lkj/b;->z:Ljava/util/Hashtable;

    invoke-virtual {p1}, Lnj/u;->j()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2, p1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lkj/b;->k:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    invoke-direct {p0, p1}, Lkj/b;->u(Lnj/u;)Ljava/lang/String;

    move-result-object v2

    move-object v3, p1

    check-cast v3, Lnj/o;

    invoke-interface {v1, v2, v3}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->put(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttPersistable;)V

    iget-object v1, p0, Lkj/b;->f:Lkj/f;

    invoke-virtual {v1, p2, p1}, Lkj/f;->m(Lorg/eclipse/paho/client/mqttv3/MqttToken;Lnj/u;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_5
    iget-object v1, p0, Lkj/b;->A:Ljava/util/Hashtable;

    invoke-virtual {p1}, Lnj/u;->j()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2, p1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lkj/b;->k:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    invoke-direct {p0, p1}, Lkj/b;->u(Lnj/u;)Ljava/lang/String;

    move-result-object v2

    move-object v3, p1

    check-cast v3, Lnj/o;

    invoke-interface {v1, v2, v3}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->put(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttPersistable;)V

    iget-object v1, p0, Lkj/b;->f:Lkj/f;

    invoke-virtual {v1, p2, p1}, Lkj/f;->m(Lorg/eclipse/paho/client/mqttv3/MqttToken;Lnj/u;)V

    :goto_1
    iget-object p2, p0, Lkj/b;->d:Ljava/util/Vector;

    invoke-virtual {p2, p1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    iget-object p1, p0, Lkj/b;->p:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v0

    goto/16 :goto_5

    :cond_6
    iget-object p1, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object p2, Lkj/b;->E:Ljava/lang/String;

    const-string/jumbo v2, "send"

    const-string v3, "613"

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, p2, v2, v3, v1}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance p1, Lorg/eclipse/paho/client/mqttv3/MqttException;

    const/16 p2, 0x7dca

    invoke-direct {p1, p2}, Lorg/eclipse/paho/client/mqttv3/MqttException;-><init>(I)V

    throw p1

    :goto_2
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_7
    iget-object v0, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v1, Lkj/b;->E:Ljava/lang/String;

    const-string/jumbo v2, "send"

    const-string v3, "615"

    invoke-virtual {p1}, Lnj/u;->j()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v4, p1}, [Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v0, v1, v2, v3, v4}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    instance-of v0, p1, Lnj/d;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lkj/b;->p:Ljava/lang/Object;

    monitor-enter v0

    :try_start_2
    iget-object v1, p0, Lkj/b;->f:Lkj/f;

    invoke-virtual {v1, p2, p1}, Lkj/f;->m(Lorg/eclipse/paho/client/mqttv3/MqttToken;Lnj/u;)V

    iget-object p2, p0, Lkj/b;->e:Ljava/util/Vector;

    const/4 v1, 0x0

    invoke-virtual {p2, p1, v1}, Ljava/util/Vector;->insertElementAt(Ljava/lang/Object;I)V

    iget-object p1, p0, Lkj/b;->p:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v0

    goto :goto_5

    :catchall_1
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1

    :cond_8
    instance-of v0, p1, Lnj/i;

    if-eqz v0, :cond_9

    iput-object p1, p0, Lkj/b;->v:Lnj/u;

    goto :goto_3

    :cond_9
    instance-of v0, p1, Lnj/n;

    if-eqz v0, :cond_a

    iget-object v0, p0, Lkj/b;->z:Ljava/util/Hashtable;

    invoke-virtual {p1}, Lnj/u;->j()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lkj/b;->k:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    invoke-direct {p0, p1}, Lkj/b;->s(Lnj/u;)Ljava/lang/String;

    move-result-object v1

    move-object v2, p1

    check-cast v2, Lnj/n;

    invoke-interface {v0, v1, v2}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->put(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttPersistable;)V

    goto :goto_3

    :cond_a
    instance-of v0, p1, Lnj/l;

    if-eqz v0, :cond_b

    iget-object v0, p0, Lkj/b;->k:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    invoke-direct {p0, p1}, Lkj/b;->q(Lnj/u;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->remove(Ljava/lang/String;)V

    :cond_b
    :goto_3
    iget-object v0, p0, Lkj/b;->p:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    instance-of v1, p1, Lnj/b;

    if-nez v1, :cond_c

    iget-object v1, p0, Lkj/b;->f:Lkj/f;

    invoke-virtual {v1, p2, p1}, Lkj/f;->m(Lorg/eclipse/paho/client/mqttv3/MqttToken;Lnj/u;)V

    goto :goto_4

    :catchall_2
    move-exception p1

    goto :goto_6

    :cond_c
    :goto_4
    iget-object p2, p0, Lkj/b;->e:Ljava/util/Vector;

    invoke-virtual {p2, p1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    iget-object p1, p0, Lkj/b;->p:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v0

    :goto_5
    return-void

    :goto_6
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    throw p1
.end method

.method protected O(Z)V
    .locals 0

    iput-boolean p1, p0, Lkj/b;->j:Z

    return-void
.end method

.method protected P(J)V
    .locals 1

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide p1

    iput-wide p1, p0, Lkj/b;->i:J

    return-void
.end method

.method protected Q(I)V
    .locals 1

    iput p1, p0, Lkj/b;->m:I

    new-instance p1, Ljava/util/Vector;

    iget v0, p0, Lkj/b;->m:I

    invoke-direct {p1, v0}, Ljava/util/Vector;-><init>(I)V

    iput-object p1, p0, Lkj/b;->d:Ljava/util/Vector;

    return-void
.end method

.method public R(Lnj/u;)V
    .locals 5

    const-string/jumbo v0, "unPersistBufferedMessage"

    :try_start_0
    iget-object v1, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v2, Lkj/b;->E:Ljava/lang/String;

    const-string v3, "517"

    invoke-virtual {p1}, Lnj/u;->i()Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v1, v2, v0, v3, v4}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lkj/b;->k:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    invoke-direct {p0, p1}, Lkj/b;->r(Lnj/u;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->remove(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/eclipse/paho/client/mqttv3/MqttPersistenceException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    iget-object v1, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v2, Lkj/b;->E:Ljava/lang/String;

    invoke-virtual {p1}, Lnj/u;->i()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v3, "518"

    invoke-interface {v1, v2, v0, v3, p1}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method protected S(Lnj/o;)V
    .locals 7

    iget-object v0, p0, Lkj/b;->p:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v2, Lkj/b;->E:Ljava/lang/String;

    const-string/jumbo v3, "undo"

    const-string v4, "618"

    invoke-virtual {p1}, Lnj/u;->j()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {p1}, Lnj/o;->x()Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    move-result-object v6

    invoke-virtual {v6}, Lorg/eclipse/paho/client/mqttv3/MqttMessage;->getQos()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    filled-new-array {v5, v6}, [Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v1, v2, v3, v4, v5}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Lnj/o;->x()Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    move-result-object v1

    invoke-virtual {v1}, Lorg/eclipse/paho/client/mqttv3/MqttMessage;->getQos()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lkj/b;->A:Ljava/util/Hashtable;

    invoke-virtual {p1}, Lnj/u;->j()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lkj/b;->z:Ljava/util/Hashtable;

    invoke-virtual {p1}, Lnj/u;->j()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    iget-object v1, p0, Lkj/b;->d:Ljava/util/Vector;

    invoke-virtual {v1, p1}, Ljava/util/Vector;->removeElement(Ljava/lang/Object;)Z

    iget-object v1, p0, Lkj/b;->k:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    invoke-direct {p0, p1}, Lkj/b;->u(Lnj/u;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->remove(Ljava/lang/String;)V

    iget-object v1, p0, Lkj/b;->f:Lkj/f;

    invoke-virtual {v1, p1}, Lkj/f;->j(Lnj/u;)Lorg/eclipse/paho/client/mqttv3/MqttToken;

    invoke-virtual {p1}, Lnj/o;->x()Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    move-result-object v1

    invoke-virtual {v1}, Lorg/eclipse/paho/client/mqttv3/MqttMessage;->getQos()I

    move-result v1

    if-lez v1, :cond_1

    invoke-virtual {p1}, Lnj/u;->j()I

    move-result v1

    invoke-direct {p0, v1}, Lkj/b;->H(I)V

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lnj/o;->s(I)V

    :cond_1
    invoke-virtual {p0}, Lkj/b;->b()Z

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public a(Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/MqttToken;
    .locals 15

    move-object v1, p0

    move-object/from16 v0, p1

    iget-object v2, v1, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v3, Lkj/b;->E:Ljava/lang/String;

    const-string/jumbo v4, "checkForActivity"

    const-string v5, "616"

    const/4 v6, 0x0

    new-array v7, v6, [Ljava/lang/Object;

    invoke-interface {v2, v3, v4, v5, v7}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v2, v1, Lkj/b;->q:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget-boolean v4, v1, Lkj/b;->r:Z

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    monitor-exit v2

    return-object v5

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    :cond_0
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    iget-wide v7, v1, Lkj/b;->i:J

    invoke-virtual {v2, v7, v8}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    iget-boolean v4, v1, Lkj/b;->y:Z

    if-eqz v4, :cond_9

    iget-wide v7, v1, Lkj/b;->i:J

    const-wide/16 v9, 0x0

    cmp-long v4, v7, v9

    if-lez v4, :cond_9

    iget-object v4, v1, Lkj/b;->l:Lkj/k;

    invoke-interface {v4}, Lkj/k;->b()J

    move-result-wide v7

    iget-object v4, v1, Lkj/b;->w:Ljava/lang/Object;

    monitor-enter v4

    :try_start_1
    iget v9, v1, Lkj/b;->x:I

    const v10, 0x186a0

    if-lez v9, :cond_2

    iget-wide v11, v1, Lkj/b;->t:J

    sub-long v11, v7, v11

    iget-wide v13, v1, Lkj/b;->i:J

    int-to-long v5, v10

    add-long/2addr v5, v13

    cmp-long v5, v11, v5

    if-gez v5, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, v1, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    const-string/jumbo v2, "checkForActivity"

    const-string v5, "619"

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    iget-wide v9, v1, Lkj/b;->s:J

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    iget-wide v10, v1, Lkj/b;->t:J

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    iget-wide v11, v1, Lkj/b;->u:J

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    filled-new-array {v6, v9, v10, v7, v8}, [Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v0, v3, v2, v5, v6}, Lorg/eclipse/paho/client/mqttv3/logging/a;->severe(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const/16 v0, 0x7d00

    invoke-static {v0}, Lkj/i;->a(I)Lorg/eclipse/paho/client/mqttv3/MqttException;

    move-result-object v0

    throw v0

    :catchall_1
    move-exception v0

    goto/16 :goto_3

    :cond_2
    :goto_0
    if-nez v9, :cond_4

    iget-wide v5, v1, Lkj/b;->s:J

    sub-long v5, v7, v5

    iget-wide v11, v1, Lkj/b;->i:J

    const-wide/16 v13, 0x2

    mul-long/2addr v13, v11

    cmp-long v5, v5, v13

    if-gez v5, :cond_3

    goto :goto_1

    :cond_3
    iget-object v0, v1, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    const-string/jumbo v2, "checkForActivity"

    const-string v5, "642"

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    iget-wide v9, v1, Lkj/b;->s:J

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    iget-wide v10, v1, Lkj/b;->t:J

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    iget-wide v11, v1, Lkj/b;->u:J

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    filled-new-array {v6, v9, v10, v7, v8}, [Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v0, v3, v2, v5, v6}, Lorg/eclipse/paho/client/mqttv3/logging/a;->severe(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const/16 v0, 0x7d02

    invoke-static {v0}, Lkj/i;->a(I)Lorg/eclipse/paho/client/mqttv3/MqttException;

    move-result-object v0

    throw v0

    :cond_4
    :goto_1
    if-nez v9, :cond_5

    iget-wide v5, v1, Lkj/b;->t:J

    sub-long v5, v7, v5

    iget-wide v11, v1, Lkj/b;->i:J

    int-to-long v13, v10

    sub-long/2addr v11, v13

    cmp-long v5, v5, v11

    if-gez v5, :cond_6

    :cond_5
    iget-wide v5, v1, Lkj/b;->s:J

    sub-long v5, v7, v5

    iget-wide v11, v1, Lkj/b;->i:J

    int-to-long v9, v10

    sub-long/2addr v11, v9

    cmp-long v5, v5, v11

    if-ltz v5, :cond_8

    :cond_6
    iget-object v2, v1, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    const-string/jumbo v5, "checkForActivity"

    const-string v6, "620"

    iget-wide v7, v1, Lkj/b;->i:J

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    iget-wide v8, v1, Lkj/b;->s:J

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    iget-wide v9, v1, Lkj/b;->t:J

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    filled-new-array {v7, v8, v9}, [Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v2, v3, v5, v6, v7}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v5, Lorg/eclipse/paho/client/mqttv3/MqttToken;

    iget-object v2, v1, Lkj/b;->g:Lkj/a;

    invoke-virtual {v2}, Lkj/a;->B()Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    move-result-object v2

    invoke-interface {v2}, Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;->getClientId()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v5, v2}, Lorg/eclipse/paho/client/mqttv3/MqttToken;-><init>(Ljava/lang/String;)V

    if-eqz v0, :cond_7

    invoke-virtual {v5, v0}, Lorg/eclipse/paho/client/mqttv3/MqttToken;->setActionCallback(Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)V

    :cond_7
    iget-object v0, v1, Lkj/b;->f:Lkj/f;

    iget-object v2, v1, Lkj/b;->v:Lnj/u;

    invoke-virtual {v0, v5, v2}, Lkj/f;->m(Lorg/eclipse/paho/client/mqttv3/MqttToken;Lnj/u;)V

    iget-object v0, v1, Lkj/b;->e:Ljava/util/Vector;

    iget-object v2, v1, Lkj/b;->v:Lnj/u;

    const/4 v6, 0x0

    invoke-virtual {v0, v2, v6}, Ljava/util/Vector;->insertElementAt(Ljava/lang/Object;I)V

    invoke-virtual {p0}, Lkj/b;->m()J

    move-result-wide v6

    invoke-virtual {p0}, Lkj/b;->x()V

    goto :goto_2

    :cond_8
    iget-object v0, v1, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    const-string/jumbo v5, "checkForActivity"

    const-string v6, "634"

    const/4 v9, 0x0

    invoke-interface {v0, v3, v5, v6, v9}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-wide v5, v1, Lkj/b;->s:J

    sub-long/2addr v7, v5

    invoke-virtual {v2, v7, v8}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v5

    invoke-virtual {p0}, Lkj/b;->m()J

    move-result-wide v7

    sub-long/2addr v7, v5

    const-wide/16 v5, 0x1

    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    move-object v5, v9

    :goto_2
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    iget-object v0, v1, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    const-string/jumbo v2, "checkForActivity"

    const-string v4, "624"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    filled-new-array {v8}, [Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v0, v3, v2, v4, v8}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, v1, Lkj/b;->D:Lorg/eclipse/paho/client/mqttv3/MqttPingSender;

    invoke-interface {v0, v6, v7}, Lorg/eclipse/paho/client/mqttv3/MqttPingSender;->schedule(J)V

    goto :goto_4

    :goto_3
    :try_start_2
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0

    :cond_9
    move-object v9, v5

    move-object v5, v9

    :goto_4
    return-object v5

    :goto_5
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0
.end method

.method protected b()Z
    .locals 12

    iget-object v0, p0, Lkj/b;->f:Lkj/f;

    invoke-virtual {v0}, Lkj/f;->b()I

    move-result v0

    iget-boolean v1, p0, Lkj/b;->r:Z

    if-eqz v1, :cond_0

    if-nez v0, :cond_0

    iget-object v1, p0, Lkj/b;->e:Ljava/util/Vector;

    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lkj/b;->h:Lkj/c;

    invoke-virtual {v1}, Lkj/c;->h()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v2, Lkj/b;->E:Ljava/lang/String;

    const-string/jumbo v3, "checkQuiesceLock"

    const-string v4, "626"

    iget-boolean v5, p0, Lkj/b;->r:Z

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    iget v5, p0, Lkj/b;->n:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    iget-object v5, p0, Lkj/b;->e:Ljava/util/Vector;

    invoke-virtual {v5}, Ljava/util/Vector;->size()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    iget v5, p0, Lkj/b;->o:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    iget-object v5, p0, Lkj/b;->h:Lkj/c;

    invoke-virtual {v5}, Lkj/c;->h()Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    filled-new-array/range {v6 .. v11}, [Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v2, v3, v4, v0}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lkj/b;->q:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lkj/b;->q:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v0

    const/4 v0, 0x1

    return v0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method protected c()V
    .locals 4

    iget-object v0, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v1, Lkj/b;->E:Ljava/lang/String;

    const-string/jumbo v2, "clearState"

    const-string v3, ">"

    invoke-interface {v0, v1, v2, v3}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lkj/b;->k:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    invoke-interface {v0}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->clear()V

    iget-object v0, p0, Lkj/b;->c:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->clear()V

    iget-object v0, p0, Lkj/b;->d:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->clear()V

    iget-object v0, p0, Lkj/b;->e:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->clear()V

    iget-object v0, p0, Lkj/b;->z:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->clear()V

    iget-object v0, p0, Lkj/b;->A:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->clear()V

    iget-object v0, p0, Lkj/b;->B:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->clear()V

    iget-object v0, p0, Lkj/b;->C:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->clear()V

    iget-object v0, p0, Lkj/b;->f:Lkj/f;

    invoke-virtual {v0}, Lkj/f;->a()V

    return-void
.end method

.method protected d()V
    .locals 1

    iget-object v0, p0, Lkj/b;->c:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->clear()V

    iget-object v0, p0, Lkj/b;->d:Ljava/util/Vector;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkj/b;->d:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->clear()V

    :cond_0
    iget-object v0, p0, Lkj/b;->e:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->clear()V

    iget-object v0, p0, Lkj/b;->z:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->clear()V

    iget-object v0, p0, Lkj/b;->A:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->clear()V

    iget-object v0, p0, Lkj/b;->B:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->clear()V

    iget-object v0, p0, Lkj/b;->C:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->clear()V

    iget-object v0, p0, Lkj/b;->f:Lkj/f;

    invoke-virtual {v0}, Lkj/f;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, Lkj/b;->c:Ljava/util/Hashtable;

    iput-object v0, p0, Lkj/b;->d:Ljava/util/Vector;

    iput-object v0, p0, Lkj/b;->e:Ljava/util/Vector;

    iput-object v0, p0, Lkj/b;->z:Ljava/util/Hashtable;

    iput-object v0, p0, Lkj/b;->A:Ljava/util/Hashtable;

    iput-object v0, p0, Lkj/b;->B:Ljava/util/Hashtable;

    iput-object v0, p0, Lkj/b;->C:Ljava/util/Hashtable;

    iput-object v0, p0, Lkj/b;->f:Lkj/f;

    iput-object v0, p0, Lkj/b;->h:Lkj/c;

    iput-object v0, p0, Lkj/b;->g:Lkj/a;

    iput-object v0, p0, Lkj/b;->k:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    iput-object v0, p0, Lkj/b;->v:Lnj/u;

    iput-object v0, p0, Lkj/b;->l:Lkj/k;

    return-void
.end method

.method public e()V
    .locals 4

    iget-object v0, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v1, Lkj/b;->E:Ljava/lang/String;

    const-string/jumbo v2, "connected"

    const-string v3, "631"

    invoke-interface {v0, v1, v2, v3}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lkj/b;->y:Z

    iget-object v0, p0, Lkj/b;->D:Lorg/eclipse/paho/client/mqttv3/MqttPingSender;

    invoke-interface {v0}, Lorg/eclipse/paho/client/mqttv3/MqttPingSender;->start()V

    return-void
.end method

.method protected g(I)V
    .locals 5

    iget-object v0, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v1, Lkj/b;->E:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string/jumbo v3, "deliveryComplete"

    const-string v4, "641"

    invoke-interface {v0, v1, v3, v4, v2}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lkj/b;->k:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    invoke-direct {p0, p1}, Lkj/b;->p(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->remove(Ljava/lang/String;)V

    iget-object v0, p0, Lkj/b;->C:Ljava/util/Hashtable;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method protected h(Lnj/o;)V
    .locals 5

    iget-object v0, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v1, Lkj/b;->E:Ljava/lang/String;

    invoke-virtual {p1}, Lnj/u;->j()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string/jumbo v3, "deliveryComplete"

    const-string v4, "641"

    invoke-interface {v0, v1, v3, v4, v2}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lkj/b;->k:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    invoke-direct {p0, p1}, Lkj/b;->q(Lnj/u;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->remove(Ljava/lang/String;)V

    iget-object v0, p0, Lkj/b;->C:Ljava/util/Hashtable;

    invoke-virtual {p1}, Lnj/u;->j()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public i(Lorg/eclipse/paho/client/mqttv3/MqttException;)V
    .locals 4

    iget-object v0, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v1, Lkj/b;->E:Ljava/lang/String;

    const-string/jumbo v2, "disconnected"

    const-string v3, "633"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, v1, v2, v3, p1}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lkj/b;->y:Z

    :try_start_0
    iget-boolean v0, p0, Lkj/b;->j:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lkj/b;->c()V

    :cond_0
    iget-object v0, p0, Lkj/b;->d:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->clear()V

    iget-object v0, p0, Lkj/b;->e:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->clear()V

    iget-object v0, p0, Lkj/b;->w:Ljava/lang/Object;

    monitor-enter v0
    :try_end_0
    .catch Lorg/eclipse/paho/client/mqttv3/MqttException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iput p1, p0, Lkj/b;->x:I

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p1
    :try_end_2
    .catch Lorg/eclipse/paho/client/mqttv3/MqttException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    :goto_0
    return-void
.end method

.method protected j()Lnj/u;
    .locals 8

    iget-object v0, p0, Lkj/b;->p:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    move-object v2, v1

    :cond_0
    :goto_0
    if-eqz v2, :cond_1

    :try_start_0
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception v1

    goto/16 :goto_2

    :cond_1
    iget-object v3, p0, Lkj/b;->d:Ljava/util/Vector;

    invoke-virtual {v3}, Ljava/util/Vector;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lkj/b;->e:Ljava/util/Vector;

    invoke-virtual {v3}, Ljava/util/Vector;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_3

    :cond_2
    iget-object v3, p0, Lkj/b;->e:Ljava/util/Vector;

    invoke-virtual {v3}, Ljava/util/Vector;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_4

    iget v3, p0, Lkj/b;->n:I

    iget v4, p0, Lkj/b;->m:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lt v3, v4, :cond_4

    :cond_3
    :try_start_1
    iget-object v3, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v4, Lkj/b;->E:Ljava/lang/String;

    const-string/jumbo v5, "get"

    const-string v6, "644"

    invoke-interface {v3, v4, v5, v6}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, p0, Lkj/b;->p:Ljava/lang/Object;

    invoke-virtual {v3}, Ljava/lang/Object;->wait()V

    iget-object v3, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    const-string/jumbo v5, "get"

    const-string v6, "647"

    invoke-interface {v3, v4, v5, v6}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catch_0
    :cond_4
    :try_start_2
    iget-object v3, p0, Lkj/b;->e:Ljava/util/Vector;

    if-eqz v3, :cond_9

    iget-boolean v3, p0, Lkj/b;->y:Z

    const/4 v4, 0x0

    if-nez v3, :cond_5

    iget-object v3, p0, Lkj/b;->e:Ljava/util/Vector;

    invoke-virtual {v3}, Ljava/util/Vector;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_9

    iget-object v3, p0, Lkj/b;->e:Ljava/util/Vector;

    invoke-virtual {v3, v4}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lnj/u;

    instance-of v3, v3, Lnj/d;

    if-nez v3, :cond_5

    goto :goto_1

    :cond_5
    iget-object v3, p0, Lkj/b;->e:Ljava/util/Vector;

    invoke-virtual {v3}, Ljava/util/Vector;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_7

    iget-object v2, p0, Lkj/b;->e:Ljava/util/Vector;

    invoke-virtual {v2, v4}, Ljava/util/Vector;->remove(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnj/u;

    instance-of v3, v2, Lnj/n;

    if-eqz v3, :cond_6

    iget v3, p0, Lkj/b;->o:I

    add-int/lit8 v3, v3, 0x1

    iput v3, p0, Lkj/b;->o:I

    iget-object v4, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v5, Lkj/b;->E:Ljava/lang/String;

    const-string/jumbo v6, "get"

    const-string v7, "617"

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v4, v5, v6, v7, v3}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_6
    invoke-virtual {p0}, Lkj/b;->b()Z

    goto/16 :goto_0

    :cond_7
    iget-object v3, p0, Lkj/b;->d:Ljava/util/Vector;

    invoke-virtual {v3}, Ljava/util/Vector;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    iget v3, p0, Lkj/b;->n:I

    iget v5, p0, Lkj/b;->m:I

    if-ge v3, v5, :cond_8

    iget-object v2, p0, Lkj/b;->d:Ljava/util/Vector;

    invoke-virtual {v2, v4}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnj/u;

    iget-object v3, p0, Lkj/b;->d:Ljava/util/Vector;

    invoke-virtual {v3, v4}, Ljava/util/Vector;->removeElementAt(I)V

    iget v3, p0, Lkj/b;->n:I

    add-int/lit8 v3, v3, 0x1

    iput v3, p0, Lkj/b;->n:I

    iget-object v4, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v5, Lkj/b;->E:Ljava/lang/String;

    const-string/jumbo v6, "get"

    const-string v7, "623"

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v4, v5, v6, v7, v3}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_8
    iget-object v3, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v4, Lkj/b;->E:Ljava/lang/String;

    const-string/jumbo v5, "get"

    const-string v6, "622"

    invoke-interface {v3, v4, v5, v6}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_9
    :goto_1
    iget-object v2, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v3, Lkj/b;->E:Ljava/lang/String;

    const-string/jumbo v4, "get"

    const-string v5, "621"

    invoke-interface {v2, v3, v4, v5}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    monitor-exit v0

    return-object v1

    :goto_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public k()I
    .locals 1

    iget v0, p0, Lkj/b;->n:I

    return v0
.end method

.method protected l()Z
    .locals 1

    iget-boolean v0, p0, Lkj/b;->j:Z

    return v0
.end method

.method protected m()J
    .locals 3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    iget-wide v1, p0, Lkj/b;->i:J

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public n()I
    .locals 1

    iget v0, p0, Lkj/b;->m:I

    return v0
.end method

.method protected w(Lorg/eclipse/paho/client/mqttv3/MqttToken;)V
    .locals 5

    iget-object v0, p1, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lkj/x;

    invoke-virtual {v0}, Lkj/x;->m()Lnj/u;

    move-result-object v0

    if-eqz v0, :cond_2

    instance-of v1, v0, Lnj/b;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v2, Lkj/b;->E:Ljava/lang/String;

    invoke-virtual {v0}, Lnj/u;->j()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v3, p1, v0}, [Ljava/lang/Object;

    move-result-object p1

    const-string/jumbo v3, "notifyComplete"

    const-string v4, "629"

    invoke-interface {v1, v2, v3, v4, p1}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    move-object p1, v0

    check-cast p1, Lnj/b;

    instance-of v1, p1, Lnj/k;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lkj/b;->k:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    invoke-direct {p0, v0}, Lkj/b;->u(Lnj/u;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v4}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->remove(Ljava/lang/String;)V

    iget-object v1, p0, Lkj/b;->k:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    invoke-direct {p0, v0}, Lkj/b;->r(Lnj/u;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v4}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->remove(Ljava/lang/String;)V

    iget-object v1, p0, Lkj/b;->A:Ljava/util/Hashtable;

    invoke-virtual {p1}, Lnj/u;->j()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lkj/b;->f()V

    invoke-virtual {v0}, Lnj/u;->j()I

    move-result v1

    invoke-direct {p0, v1}, Lkj/b;->H(I)V

    iget-object v1, p0, Lkj/b;->f:Lkj/f;

    invoke-virtual {v1, v0}, Lkj/f;->j(Lnj/u;)Lorg/eclipse/paho/client/mqttv3/MqttToken;

    iget-object v0, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    invoke-virtual {p1}, Lnj/u;->j()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v1, "650"

    invoke-interface {v0, v2, v3, v1, p1}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    instance-of v1, p1, Lnj/l;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lkj/b;->k:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    invoke-direct {p0, v0}, Lkj/b;->u(Lnj/u;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v4}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->remove(Ljava/lang/String;)V

    iget-object v1, p0, Lkj/b;->k:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    invoke-direct {p0, v0}, Lkj/b;->s(Lnj/u;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v4}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->remove(Ljava/lang/String;)V

    iget-object v1, p0, Lkj/b;->k:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    invoke-direct {p0, v0}, Lkj/b;->r(Lnj/u;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v4}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->remove(Ljava/lang/String;)V

    iget-object v1, p0, Lkj/b;->z:Ljava/util/Hashtable;

    invoke-virtual {p1}, Lnj/u;->j()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget v1, p0, Lkj/b;->o:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lkj/b;->o:I

    invoke-direct {p0}, Lkj/b;->f()V

    invoke-virtual {v0}, Lnj/u;->j()I

    move-result v1

    invoke-direct {p0, v1}, Lkj/b;->H(I)V

    iget-object v1, p0, Lkj/b;->f:Lkj/f;

    invoke-virtual {v1, v0}, Lkj/f;->j(Lnj/u;)Lorg/eclipse/paho/client/mqttv3/MqttToken;

    iget-object v0, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    invoke-virtual {p1}, Lnj/u;->j()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget v1, p0, Lkj/b;->o:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {p1, v1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v1, "645"

    invoke-interface {v0, v2, v3, v1, p1}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lkj/b;->b()Z

    :cond_2
    return-void
.end method

.method public x()V
    .locals 5

    iget-object v0, p0, Lkj/b;->p:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v2, Lkj/b;->E:Ljava/lang/String;

    const-string/jumbo v3, "notifyQueueLock"

    const-string v4, "638"

    invoke-interface {v1, v2, v3, v4}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lkj/b;->p:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method protected y(Lnj/b;)V
    .locals 6

    iget-object v0, p0, Lkj/b;->l:Lkj/k;

    invoke-interface {v0}, Lkj/k;->b()J

    move-result-wide v0

    iput-wide v0, p0, Lkj/b;->t:J

    iget-object v0, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v1, Lkj/b;->E:Ljava/lang/String;

    const-string/jumbo v2, "notifyReceivedAck"

    const-string v3, "627"

    invoke-virtual {p1}, Lnj/u;->j()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v4, p1}, [Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v0, v1, v2, v3, v4}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lkj/b;->f:Lkj/f;

    invoke-virtual {v0, p1}, Lkj/f;->f(Lnj/u;)Lorg/eclipse/paho/client/mqttv3/MqttToken;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    const-string/jumbo v2, "notifyReceivedAck"

    const-string v3, "662"

    invoke-virtual {p1}, Lnj/u;->j()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, v1, v2, v3, p1}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_0
    instance-of v2, p1, Lnj/m;

    if-eqz v2, :cond_1

    new-instance v1, Lnj/n;

    check-cast p1, Lnj/m;

    invoke-direct {v1, p1}, Lnj/n;-><init>(Lnj/m;)V

    invoke-virtual {p0, v1, v0}, Lkj/b;->N(Lnj/u;Lorg/eclipse/paho/client/mqttv3/MqttToken;)V

    goto/16 :goto_5

    :cond_1
    instance-of v2, p1, Lnj/k;

    const/4 v3, 0x0

    if-nez v2, :cond_8

    instance-of v2, p1, Lnj/l;

    if-eqz v2, :cond_2

    goto/16 :goto_4

    :cond_2
    instance-of v2, p1, Lnj/j;

    const/4 v4, 0x0

    if-eqz v2, :cond_4

    iget-object v2, p0, Lkj/b;->w:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget v5, p0, Lkj/b;->x:I

    add-int/lit8 v5, v5, -0x1

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    iput v4, p0, Lkj/b;->x:I

    invoke-virtual {p0, p1, v0, v3}, Lkj/b;->B(Lnj/u;Lorg/eclipse/paho/client/mqttv3/MqttToken;Lorg/eclipse/paho/client/mqttv3/MqttException;)V

    iget v0, p0, Lkj/b;->x:I

    if-nez v0, :cond_3

    iget-object v0, p0, Lkj/b;->f:Lkj/f;

    invoke-virtual {v0, p1}, Lkj/f;->j(Lnj/u;)Lorg/eclipse/paho/client/mqttv3/MqttToken;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_3
    :goto_0
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    const-string/jumbo v0, "notifyReceivedAck"

    const-string v2, "636"

    iget v3, p0, Lkj/b;->x:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-interface {p1, v1, v0, v2, v3}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_5

    :goto_1
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_4
    instance-of v1, p1, Lnj/c;

    if-eqz v1, :cond_7

    move-object v1, p1

    check-cast v1, Lnj/c;

    invoke-virtual {v1}, Lnj/c;->w()I

    move-result v2

    if-nez v2, :cond_6

    iget-object v5, p0, Lkj/b;->p:Ljava/lang/Object;

    monitor-enter v5

    :try_start_2
    iget-boolean v2, p0, Lkj/b;->j:Z

    if-eqz v2, :cond_5

    invoke-virtual {p0}, Lkj/b;->c()V

    iget-object v2, p0, Lkj/b;->f:Lkj/f;

    invoke-virtual {v2, v0, p1}, Lkj/f;->m(Lorg/eclipse/paho/client/mqttv3/MqttToken;Lnj/u;)V

    goto :goto_2

    :catchall_1
    move-exception p1

    goto :goto_3

    :cond_5
    :goto_2
    iput v4, p0, Lkj/b;->o:I

    iput v4, p0, Lkj/b;->n:I

    invoke-direct {p0}, Lkj/b;->K()V

    invoke-virtual {p0}, Lkj/b;->e()V

    monitor-exit v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    iget-object v2, p0, Lkj/b;->g:Lkj/a;

    invoke-virtual {v2, v1, v3}, Lkj/a;->r(Lnj/c;Lorg/eclipse/paho/client/mqttv3/MqttException;)V

    invoke-virtual {p0, p1, v0, v3}, Lkj/b;->B(Lnj/u;Lorg/eclipse/paho/client/mqttv3/MqttToken;Lorg/eclipse/paho/client/mqttv3/MqttException;)V

    iget-object v0, p0, Lkj/b;->f:Lkj/f;

    invoke-virtual {v0, p1}, Lkj/f;->j(Lnj/u;)Lorg/eclipse/paho/client/mqttv3/MqttToken;

    iget-object p1, p0, Lkj/b;->p:Ljava/lang/Object;

    monitor-enter p1

    :try_start_3
    iget-object v0, p0, Lkj/b;->p:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p1

    goto :goto_5

    :catchall_2
    move-exception v0

    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    throw v0

    :goto_3
    :try_start_4
    monitor-exit v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p1

    :cond_6
    invoke-static {v2}, Lkj/i;->a(I)Lorg/eclipse/paho/client/mqttv3/MqttException;

    move-result-object p1

    throw p1

    :cond_7
    invoke-virtual {p0, p1, v0, v3}, Lkj/b;->B(Lnj/u;Lorg/eclipse/paho/client/mqttv3/MqttToken;Lorg/eclipse/paho/client/mqttv3/MqttException;)V

    invoke-virtual {p1}, Lnj/u;->j()I

    move-result v0

    invoke-direct {p0, v0}, Lkj/b;->H(I)V

    iget-object v0, p0, Lkj/b;->f:Lkj/f;

    invoke-virtual {v0, p1}, Lkj/f;->j(Lnj/u;)Lorg/eclipse/paho/client/mqttv3/MqttToken;

    goto :goto_5

    :cond_8
    :goto_4
    invoke-virtual {p0, p1, v0, v3}, Lkj/b;->B(Lnj/u;Lorg/eclipse/paho/client/mqttv3/MqttToken;Lorg/eclipse/paho/client/mqttv3/MqttException;)V

    :goto_5
    invoke-virtual {p0}, Lkj/b;->b()Z

    return-void
.end method

.method public z(I)V
    .locals 4

    if-lez p1, :cond_0

    iget-object v0, p0, Lkj/b;->l:Lkj/k;

    invoke-interface {v0}, Lkj/k;->b()J

    move-result-wide v0

    iput-wide v0, p0, Lkj/b;->t:J

    :cond_0
    iget-object v0, p0, Lkj/b;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v1, Lkj/b;->E:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string/jumbo v2, "notifyReceivedBytes"

    const-string v3, "630"

    invoke-interface {v0, v1, v2, v3, p1}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
