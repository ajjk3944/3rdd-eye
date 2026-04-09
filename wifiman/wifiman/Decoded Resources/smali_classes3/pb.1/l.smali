.class public final Lpb/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Llb/b;

.field private final b:Llb/c;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/util/concurrent/atomic/AtomicInteger;

.field private e:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttClientStatusCallback$AWSIotMqttClientStatus;

.field private final f:LYg/m;

.field private final g:Lgg/s;

.field private final h:Lcom/amazonaws/internal/StaticCredentialsProvider;


# direct methods
.method public constructor <init>(Llb/o;Llb/b;Llb/c;)V
    .locals 2

    const-string/jumbo v0, "cloudAccess"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "cloudCredentials"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "meta"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lpb/l;->a:Llb/b;

    iput-object p3, p0, Lpb/l;->b:Llb/c;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "android-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Lpb/l;->c:Ljava/lang/String;

    new-instance p3, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v0, 0x1

    invoke-direct {p3, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p3, p0, Lpb/l;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    sget-object p3, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttClientStatusCallback$AWSIotMqttClientStatus;->Connecting:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttClientStatusCallback$AWSIotMqttClientStatus;

    iput-object p3, p0, Lpb/l;->e:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttClientStatusCallback$AWSIotMqttClientStatus;

    new-instance p3, Lpb/a;

    invoke-direct {p3, p0, p1}, Lpb/a;-><init>(Lpb/l;Llb/o;)V

    invoke-static {p3}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lpb/l;->f:LYg/m;

    new-instance p1, Lpb/c;

    invoke-direct {p1, p0}, Lpb/c;-><init>(Lpb/l;)V

    invoke-static {p1}, Lgg/s;->o(Lgg/u;)Lgg/s;

    move-result-object p1

    const-string/jumbo p3, "create(...)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpb/l;->g:Lgg/s;

    new-instance p1, Lcom/amazonaws/internal/StaticCredentialsProvider;

    new-instance p3, Lcom/amazonaws/auth/BasicSessionCredentials;

    invoke-virtual {p2}, Llb/b;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Llb/b;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Llb/b;->f()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p3, v0, v1, p2}, Lcom/amazonaws/auth/BasicSessionCredentials;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p1, p3}, Lcom/amazonaws/internal/StaticCredentialsProvider;-><init>(Lcom/amazonaws/auth/AWSCredentials;)V

    iput-object p1, p0, Lpb/l;->h:Lcom/amazonaws/internal/StaticCredentialsProvider;

    return-void
.end method

.method private static final A(Lpb/l;Ljava/lang/String;Lgg/t;)V
    .locals 0

    :try_start_0
    invoke-direct {p0}, Lpb/l;->s()Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->c0(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-interface {p2, p0}, Lgg/t;->c(Ljava/lang/Throwable;)Z

    :goto_0
    return-void
.end method

.method private static final B(Lgg/t;Lnb/f;)V
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lgg/h;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic a(Lgg/t;Lnb/f;)V
    .locals 0

    invoke-static {p0, p1}, Lpb/l;->B(Lgg/t;Lnb/f;)V

    return-void
.end method

.method public static synthetic b(Lpb/l;Ljava/lang/String;Lgg/t;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpb/l;->A(Lpb/l;Ljava/lang/String;Lgg/t;)V

    return-void
.end method

.method public static synthetic c(Lpb/l;Lgg/t;)V
    .locals 0

    invoke-static {p0, p1}, Lpb/l;->m(Lpb/l;Lgg/t;)V

    return-void
.end method

.method public static synthetic d(Lpb/l;)V
    .locals 0

    invoke-static {p0}, Lpb/l;->r(Lpb/l;)V

    return-void
.end method

.method public static synthetic e(Lpb/l;Llb/o;)Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;
    .locals 0

    invoke-static {p0, p1}, Lpb/l;->u(Lpb/l;Llb/o;)Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lpb/l;Ljava/lang/String;Ljava/lang/String;ZLgg/t;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lpb/l;->x(Lpb/l;Ljava/lang/String;Ljava/lang/String;ZLgg/t;)V

    return-void
.end method

.method public static synthetic g(Lpb/m;Ljava/lang/String;[B)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpb/l;->y(Lpb/m;Ljava/lang/String;[B)V

    return-void
.end method

.method public static synthetic h(Lgg/t;Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback$MessageDeliveryStatus;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpb/l;->z(Lgg/t;Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback$MessageDeliveryStatus;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic i(Lpb/l;Lgg/t;Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttClientStatusCallback$AWSIotMqttClientStatus;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpb/l;->n(Lpb/l;Lgg/t;Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttClientStatusCallback$AWSIotMqttClientStatus;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic j(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback$MessageDeliveryStatus;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lpb/l;->v(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback$MessageDeliveryStatus;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic k(Lpb/l;)V
    .locals 0

    invoke-static {p0}, Lpb/l;->o(Lpb/l;)V

    return-void
.end method

.method private static final m(Lpb/l;Lgg/t;)V
    .locals 3

    const-string/jumbo v0, "emitter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lpb/l;->s()Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    move-result-object v0

    iget-object v1, p0, Lpb/l;->h:Lcom/amazonaws/internal/StaticCredentialsProvider;

    new-instance v2, Lpb/d;

    invoke-direct {v2, p0, p1}, Lpb/d;-><init>(Lpb/l;Lgg/t;)V

    invoke-virtual {v0, v1, v2}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->C(Lcom/amazonaws/auth/AWSCredentialsProvider;Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttClientStatusCallback;)V

    new-instance v0, Lpb/e;

    invoke-direct {v0, p0}, Lpb/e;-><init>(Lpb/l;)V

    invoke-interface {p1, v0}, Lgg/t;->d(Lkg/e;)V

    return-void
.end method

.method private static final n(Lpb/l;Lgg/t;Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttClientStatusCallback$AWSIotMqttClientStatus;Ljava/lang/Throwable;)V
    .locals 4

    sget-object v0, LSj/a;->a:LSj/a$b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "onStatusChanged: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    invoke-virtual {v0, p3, v1, v3}, LSj/a$b;->b(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    iput-object p2, p0, Lpb/l;->e:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttClientStatusCallback$AWSIotMqttClientStatus;

    invoke-interface {p1}, Lgg/t;->isDisposed()Z

    move-result p0

    if-nez p0, :cond_0

    invoke-interface {p1, p2}, Lgg/h;->h(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const-string/jumbo p0, "MQTT disconnected, but nobody cares anymore!"

    new-array p2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, p0, p2}, LSj/a$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    instance-of p0, p3, Lorg/eclipse/paho/client/mqttv3/MqttException;

    if-eqz p0, :cond_1

    check-cast p3, Lorg/eclipse/paho/client/mqttv3/MqttException;

    goto :goto_1

    :cond_1
    const/4 p3, 0x0

    :goto_1
    if-eqz p3, :cond_2

    invoke-interface {p1, p3}, Lgg/t;->c(Ljava/lang/Throwable;)Z

    :cond_2
    return-void
.end method

.method private static final o(Lpb/l;)V
    .locals 3

    sget-object v0, LSj/a;->a:LSj/a$b;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Disconnecting MQTT"

    invoke-virtual {v0, v2, v1}, LSj/a$b;->o(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-direct {p0}, Lpb/l;->q()V

    return-void
.end method

.method private final q()V
    .locals 2

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    new-instance v1, Lpb/f;

    invoke-direct {v1, p0}, Lpb/f;-><init>(Lpb/l;)V

    invoke-virtual {v0, v1}, Lgg/y;->e(Ljava/lang/Runnable;)Lhg/c;

    return-void
.end method

.method private static final r(Lpb/l;)V
    .locals 4

    :try_start_0
    invoke-direct {p0}, Lpb/l;->s()Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    move-result-object p0

    invoke-virtual {p0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->D()Z
    :try_end_0
    .catch Lcom/amazonaws/AmazonClientException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v1, v0, Lorg/eclipse/paho/client/mqttv3/MqttException;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lorg/eclipse/paho/client/mqttv3/MqttException;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/MqttException;->getReasonCode()I

    move-result v1

    const/16 v3, 0x7d65

    if-eq v1, v3, :cond_1

    const/16 v3, 0x7d66

    if-eq v1, v3, :cond_1

    goto :goto_1

    :cond_1
    move-object v2, v0

    :goto_1
    if-eqz v2, :cond_2

    sget-object p0, LSj/a;->a:LSj/a$b;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Client already disconnecting!"

    invoke-virtual {p0, v2, v1, v0}, LSj/a$b;->b(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_2
    return-void

    :cond_2
    throw p0
.end method

.method private final s()Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;
    .locals 1

    iget-object v0, p0, Lpb/l;->f:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    return-object v0
.end method

.method private final t(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lpb/l;->a:Llb/b;

    invoke-virtual {v0}, Llb/b;->c()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lpb/l;->c:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "client/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/device/"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "/connect/"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private static final u(Lpb/l;Llb/o;)Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;
    .locals 1

    new-instance v0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    iget-object p0, p0, Lpb/l;->c:Ljava/lang/String;

    invoke-virtual {p1}, Llb/o;->b()Llb/f;

    move-result-object p1

    invoke-virtual {p1}, Llb/f;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p0, 0x3

    invoke-virtual {v0, p0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->Y(I)V

    const/4 p0, 0x1

    const/4 p1, 0x5

    invoke-virtual {v0, p0, p1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->Z(II)V

    return-object v0
.end method

.method private static final v(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback$MessageDeliveryStatus;Ljava/lang/Object;)V
    .locals 3

    sget-object v0, LSj/a;->a:LSj/a$b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "mqtt delivery status: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ", userData: "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    invoke-virtual {v0, p0, p1}, LSj/a$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private static final x(Lpb/l;Ljava/lang/String;Ljava/lang/String;ZLgg/t;)V
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    const-string/jumbo v2, "emitter"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lpb/l;->a:Llb/b;

    invoke-virtual {v2}, Llb/b;->c()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v0, Lpb/l;->c:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v5, "client/"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v2, p1

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "/connect/"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lpb/i;

    invoke-direct {v4, v0, v3, v1}, Lpb/i;-><init>(Lpb/l;Ljava/lang/String;Lgg/t;)V

    invoke-interface {v1, v4}, Lgg/t;->d(Lkg/e;)V

    new-instance v4, Lpb/l$c;

    invoke-direct {v4, v1}, Lpb/l$c;-><init>(Lgg/t;)V

    iget-object v5, v0, Lpb/l;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v6, 0x1

    invoke-virtual {v5, v6}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    new-instance v5, Lpb/m;

    new-instance v6, Lpb/j;

    invoke-direct {v6, v1}, Lpb/j;-><init>(Lgg/t;)V

    invoke-direct {v5, v6}, Lpb/m;-><init>(Lpb/m$a;)V

    invoke-direct/range {p0 .. p0}, Lpb/l;->s()Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    move-result-object v6

    sget-object v10, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;->QOS0:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;

    new-instance v7, Lpb/k;

    invoke-direct {v7, v5}, Lpb/k;-><init>(Lpb/m;)V

    invoke-virtual {v6, v3, v10, v4, v7}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->b0(Ljava/lang/String;Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttSubscriptionStatusCallback;Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttNewMessageCallback;)V

    new-instance v11, Lpb/b;

    invoke-direct {v11, v1}, Lpb/b;-><init>(Lgg/t;)V

    iget-object v1, v0, Lpb/l;->a:Llb/b;

    invoke-virtual {v1}, Llb/b;->g()Llb/n;

    move-result-object v1

    new-instance v3, Lnb/h;

    new-instance v4, Lnb/d;

    invoke-virtual {v1}, Llb/n;->c()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v1}, Llb/n;->d()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Llb/n;->b()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v4, v5, v6, v1}, Lnb/d;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v4}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    iget-object v1, v0, Lpb/l;->b:Llb/c;

    invoke-virtual {v1}, Llb/c;->b()Ljava/lang/String;

    move-result-object v16

    iget-object v1, v0, Lpb/l;->b:Llb/c;

    invoke-virtual {v1}, Llb/c;->c()Ljava/lang/String;

    move-result-object v17

    const/16 v20, 0x40

    const/16 v21, 0x0

    const-string/jumbo v15, "ucore-android"

    const/16 v19, 0x0

    move-object v12, v3

    move-object/from16 v13, p2

    move/from16 v18, p3

    invoke-direct/range {v12 .. v21}, Lnb/h;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct/range {p0 .. p0}, Lpb/l;->s()Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    move-result-object v7

    sget-object v1, Lub/c;->a:Lub/c;

    invoke-virtual {v1}, Lub/c;->d()Laj/b;

    move-result-object v1

    invoke-virtual {v1}, Laj/b;->a()Lcj/e;

    sget-object v4, Lnb/h;->Companion:Lnb/h$b;

    invoke-virtual {v4}, Lnb/h$b;->serializer()LVi/b;

    move-result-object v4

    invoke-virtual {v1, v4, v3}, Laj/b;->c(LVi/o;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-direct/range {p0 .. p1}, Lpb/l;->t(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const/4 v12, 0x0

    invoke-virtual/range {v7 .. v12}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->P(Ljava/lang/String;Ljava/lang/String;Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback;Ljava/lang/Object;)V

    return-void
.end method

.method private static final y(Lpb/m;Ljava/lang/String;[B)V
    .locals 4

    sget-object v0, LSj/a;->a:LSj/a$b;

    new-instance v1, Ljava/lang/String;

    invoke-static {p2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    sget-object v2, Lkotlin/text/d;->b:Ljava/nio/charset/Charset;

    invoke-direct {v1, p2, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "onMessageArrived topic: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " data: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, LSj/a$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p0, p1, p2}, Lpb/m;->d(Ljava/lang/String;[B)V

    return-void
.end method

.method private static final z(Lgg/t;Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback$MessageDeliveryStatus;Ljava/lang/Object;)V
    .locals 3

    sget-object v0, LSj/a;->a:LSj/a$b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "mqtt delivery status: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", userData: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, p2, v1}, LSj/a$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p2, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback$MessageDeliveryStatus;->Fail:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback$MessageDeliveryStatus;

    if-ne p1, p2, :cond_0

    new-instance p1, Ljava/lang/Exception;

    const-string p2, "Could not send Mqtt request"

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lgg/t;->c(Ljava/lang/Throwable;)Z

    :cond_0
    return-void
.end method


# virtual methods
.method public final C(Ljava/lang/String;Ljava/lang/String;Z)Lgg/s;
    .locals 2

    const-string/jumbo v0, "deviceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "offer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpb/l;->e:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttClientStatusCallback$AWSIotMqttClientStatus;

    sget-object v1, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttClientStatusCallback$AWSIotMqttClientStatus;->Connected:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttClientStatusCallback$AWSIotMqttClientStatus;

    if-eq v0, v1, :cond_0

    new-instance p1, Ljava/lang/Exception;

    iget-object p2, p0, Lpb/l;->e:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttClientStatusCallback$AWSIotMqttClientStatus;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v0, "MQTT Not connected "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lgg/s;->L(Ljava/lang/Throwable;)Lgg/s;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lpb/h;

    invoke-direct {v0, p0, p1, p2, p3}, Lpb/h;-><init>(Lpb/l;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-static {v0}, Lgg/s;->o(Lgg/u;)Lgg/s;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :goto_0
    return-object p1
.end method

.method public final l()Lgg/s;
    .locals 2

    iget-object v0, p0, Lpb/l;->g:Lgg/s;

    sget-object v1, Lpb/l$a;->a:Lpb/l$a;

    invoke-virtual {v0, v1}, Lgg/s;->N(Lkg/p;)Lgg/s;

    move-result-object v0

    new-instance v1, Lpb/l$b;

    invoke-direct {v1, p0}, Lpb/l$b;-><init>(Lpb/l;)V

    invoke-virtual {v0, v1}, Lgg/s;->i0(Lkg/n;)Lgg/s;

    move-result-object v0

    const-string/jumbo v1, "map(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final p()V
    .locals 0

    invoke-direct {p0}, Lpb/l;->q()V

    return-void
.end method

.method public final w(Ljava/lang/String;Lorg/webrtc/IceCandidate;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const-string/jumbo v2, "deviceId"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v2, "candidate"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lpb/l;->e:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttClientStatusCallback$AWSIotMqttClientStatus;

    sget-object v4, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttClientStatusCallback$AWSIotMqttClientStatus;->Connected:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttClientStatusCallback$AWSIotMqttClientStatus;

    if-eq v2, v4, :cond_0

    sget-object v1, LSj/a;->a:LSj/a$b;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string/jumbo v3, "MQTT disconnected!"

    invoke-virtual {v1, v3, v2}, LSj/a$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v8, Lpb/g;

    invoke-direct {v8}, Lpb/g;-><init>()V

    invoke-direct/range {p0 .. p0}, Lpb/l;->s()Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    move-result-object v4

    sget-object v2, Lub/c;->a:Lub/c;

    new-instance v5, Lnb/b;

    iget-object v10, v1, Lorg/webrtc/IceCandidate;->sdp:Ljava/lang/String;

    const-string/jumbo v6, "sdp"

    invoke-static {v10, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v11, v1, Lorg/webrtc/IceCandidate;->sdpMid:Ljava/lang/String;

    iget v1, v1, Lorg/webrtc/IceCandidate;->sdpMLineIndex:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    iget-object v1, v0, Lpb/l;->b:Llb/c;

    invoke-virtual {v1}, Llb/c;->b()Ljava/lang/String;

    move-result-object v14

    iget-object v1, v0, Lpb/l;->b:Llb/c;

    invoke-virtual {v1}, Llb/c;->c()Ljava/lang/String;

    move-result-object v15

    const/16 v17, 0x40

    const/16 v18, 0x0

    const-string/jumbo v13, "ucore-android"

    const/16 v16, 0x0

    move-object v9, v5

    invoke-direct/range {v9 .. v18}, Lnb/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2}, Lub/c;->d()Laj/b;

    move-result-object v1

    invoke-virtual {v1}, Laj/b;->a()Lcj/e;

    sget-object v2, Lnb/b;->Companion:Lnb/b$b;

    invoke-virtual {v2}, Lnb/b$b;->serializer()LVi/b;

    move-result-object v2

    invoke-virtual {v1, v2, v5}, Laj/b;->c(LVi/o;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct/range {p0 .. p1}, Lpb/l;->t(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;->QOS0:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;

    const/4 v9, 0x0

    invoke-virtual/range {v4 .. v9}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->P(Ljava/lang/String;Ljava/lang/String;Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
