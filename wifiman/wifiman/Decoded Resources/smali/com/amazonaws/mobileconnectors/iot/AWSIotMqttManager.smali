.class public Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$AuthenticationMode;
    }
.end annotation


# static fields
.field private static final L:Ljava/lang/Integer;

.field private static final M:Ljava/lang/Integer;

.field private static final N:Lcom/amazonaws/logging/Log;

.field public static final O:Ljava/lang/Integer;

.field public static final P:Ljava/lang/Integer;

.field public static final Q:Ljava/lang/Boolean;

.field public static final R:Ljava/lang/Integer;

.field public static final S:Ljava/lang/Integer;

.field public static final T:Ljava/lang/Boolean;

.field public static final U:Ljava/lang/Integer;

.field private static final V:Ljava/lang/Long;

.field private static final W:Ljava/lang/Integer;


# instance fields
.field A:Ljava/util/Map;

.field private final B:Ljava/lang/String;

.field private C:Ljava/util/Properties;

.field private D:Ljava/lang/String;

.field private E:Ljava/lang/String;

.field private F:Ljavax/net/SocketFactory;

.field private G:Lcom/amazonaws/auth/AWSCredentialsProvider;

.field private H:Ljava/lang/Integer;

.field private I:Ljava/lang/Long;

.field private J:Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;

.field private K:Ljava/lang/Long;

.field private a:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

.field private b:Lcom/amazonaws/mobileconnectors/iot/AWSIotWebSocketUrlSigner;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Lcom/amazonaws/regions/Region;

.field private f:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$AuthenticationMode;

.field private g:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttClientStatusCallback;

.field private final h:Ljava/util/Map;

.field private final i:Ljava/util/concurrent/ConcurrentLinkedQueue;

.field private j:I

.field private k:Z

.field private l:I

.field private m:I

.field private n:I

.field private o:I

.field private p:I

.field private q:Z

.field private r:Ljava/lang/Integer;

.field private s:Z

.field private t:J

.field private u:Z

.field private v:Z

.field private w:Z

.field private x:Z

.field private y:Z

.field z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/16 v0, 0x10

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->L:Ljava/lang/Integer;

    const/16 v0, 0x3e8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->M:Ljava/lang/Integer;

    const-class v0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-static {v0}, Lcom/amazonaws/logging/LogFactory;->b(Ljava/lang/Class;)Lcom/amazonaws/logging/Log;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->N:Lcom/amazonaws/logging/Log;

    const/4 v0, 0x4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->O:Ljava/lang/Integer;

    const/16 v0, 0x40

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->P:Ljava/lang/Integer;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sput-object v0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->Q:Ljava/lang/Boolean;

    const/16 v1, 0xa

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sput-object v1, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->R:Ljava/lang/Integer;

    const/16 v2, 0x12c

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    sput-object v2, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->S:Ljava/lang/Integer;

    sput-object v0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->T:Ljava/lang/Boolean;

    const/16 v0, 0x64

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->U:Ljava/lang/Integer;

    const-wide/16 v2, 0xfa

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->V:Ljava/lang/Long;

    sput-object v1, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->W:Ljava/lang/Integer;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->x:Z

    iput-boolean v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->y:Z

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "?SDK=Android&Version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/amazonaws/util/VersionInfoUtils;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->z:Ljava/lang/String;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->A:Ljava/util/Map;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    if-eqz p2, :cond_0

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->h:Ljava/util/Map;

    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->i:Ljava/util/concurrent/ConcurrentLinkedQueue;

    iput-object p1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->d:Ljava/lang/String;

    iput-object p2, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->B:Ljava/lang/String;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->c:Ljava/lang/String;

    invoke-static {p2}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->F(Ljava/lang/String;)Lcom/amazonaws/regions/Region;

    move-result-object p1

    iput-object p1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->e:Lcom/amazonaws/regions/Region;

    invoke-direct {p0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->I()V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "endpoint is null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "mqttClientId is null or empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method static synthetic A(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;
    .locals 0

    iget-object p0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->a:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    return-object p0
.end method

.method static synthetic B(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;)Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;
    .locals 0

    iput-object p1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->a:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    return-object p1
.end method

.method private E()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->B:Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v1, "%s:443"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->c:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->e:Lcom/amazonaws/regions/Region;

    invoke-virtual {v1}, Lcom/amazonaws/regions/Region;->d()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->e:Lcom/amazonaws/regions/Region;

    invoke-virtual {v2}, Lcom/amazonaws/regions/Region;->a()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "%s.iot.%s.%s:443"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No valid endpoint information is available. Please pass in a valid endpoint in AWSIotMqttManager."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static F(Ljava/lang/String;)Lcom/amazonaws/regions/Region;
    .locals 3

    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    const-string v0, "[\\.:]"

    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    array-length v0, p0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p0, v1

    invoke-static {v2}, Lcom/amazonaws/regions/Region;->e(Ljava/lang/String;)Lcom/amazonaws/regions/Region;

    move-result-object v2

    if-eqz v2, :cond_0

    return-object v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot find AWS Region code within endpoint"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private G()Ljava/lang/Long;
    .locals 2

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->K:Ljava/lang/Long;

    if-nez v0, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method private H(Ljava/lang/Throwable;)V
    .locals 1

    invoke-direct {p0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->W()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;->Reconnecting:Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;

    iput-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->J:Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;->Disconnected:Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;

    iput-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->J:Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;

    :goto_0
    invoke-virtual {p0, p1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->e0(Ljava/lang/Throwable;)V

    return-void
.end method

.method private I()V
    .locals 2

    sget-object v0, Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;->Disconnected:Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;

    iput-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->J:Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;

    sget-object v0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->Q:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->k:Z

    sget-object v0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->O:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->l:I

    sget-object v0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->P:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->m:I

    sget-object v0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->R:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->o:I

    sget-object v0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->S:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->j:I

    sget-object v0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->T:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->q:Z

    sget-object v0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->U:Ljava/lang/Integer;

    iput-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->r:Ljava/lang/Integer;

    sget-object v0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->V:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->t:J

    invoke-virtual {p0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->X()V

    sget-object v0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->W:Ljava/lang/Integer;

    iput-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->H:Ljava/lang/Integer;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->K:Ljava/lang/Long;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->v:Z

    new-instance v0, Ljava/util/Properties;

    invoke-direct {v0}, Ljava/util/Properties;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->C:Ljava/util/Properties;

    return-void
.end method

.method static K(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 6

    const-string v0, "/"

    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    array-length v0, p0

    array-length v1, p1

    const/4 v2, 0x0

    if-le v0, v1, :cond_0

    return v2

    :cond_0
    move v0, v2

    :goto_0
    array-length v1, p0

    const/4 v3, 0x1

    if-ge v0, v1, :cond_3

    aget-object v1, p0, v0

    aget-object v4, p1, v0

    const-string v5, "#"

    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    return v3

    :cond_1
    const-string v3, "+"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    array-length p0, p0

    array-length p1, p1

    if-ne p0, p1, :cond_4

    move v2, v3

    :cond_4
    return v2
.end method

.method private L(Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;)V
    .locals 3

    sget-object v0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->N:Lcom/amazonaws/logging/Log;

    const-string v1, "ready to do mqtt connect"

    invoke-interface {v0, v1}, Lcom/amazonaws/logging/Log;->a(Ljava/lang/Object;)V

    iget-boolean v1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->x:Z

    invoke-virtual {p1, v1}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->setCleanSession(Z)V

    iget v1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->j:I

    invoke-virtual {p1, v1}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->setKeepAliveInterval(I)V

    invoke-virtual {p0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->J()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$AuthenticationMode;->USERNAME_PASSWORD:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$AuthenticationMode;

    iget-object v2, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->f:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$AuthenticationMode;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->z:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->setUserName(Ljava/lang/String;)V

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "metrics collection is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->J()Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "enabled"

    goto :goto_0

    :cond_1
    const-string v2, "disabled"

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", username: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->getUserName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/amazonaws/logging/Log;->b(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->h:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->i:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->clear()V

    invoke-virtual {p0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->U()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->u:Z

    invoke-virtual {p0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->a0()V

    :try_start_0
    sget-object v0, Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;->Connecting:Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;

    iput-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->J:Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;

    invoke-virtual {p0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->d0()V

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->a:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    new-instance v1, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$2;

    invoke-direct {v1, p0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$2;-><init>(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)V

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v2, v1}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->connect(Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;Ljava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;
    :try_end_0
    .catch Lorg/eclipse/paho/client/mqttv3/MqttException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_2

    :goto_1
    sget-object v0, Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;->Disconnected:Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;

    iput-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->J:Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;

    invoke-virtual {p0, p1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->e0(Ljava/lang/Throwable;)V

    goto :goto_3

    :goto_2
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/MqttException;->getReasonCode()I

    move-result v0

    const/16 v1, 0x7d64

    if-eq v0, v1, :cond_3

    const/16 v1, 0x7d6e

    if-eq v0, v1, :cond_2

    sget-object v0, Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;->Disconnected:Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;

    iput-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->J:Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;

    invoke-virtual {p0, p1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->e0(Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_2
    sget-object p1, Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;->Connecting:Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;

    iput-object p1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->J:Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;

    invoke-virtual {p0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->d0()V

    goto :goto_3

    :cond_3
    sget-object p1, Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;->Connected:Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;

    iput-object p1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->J:Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;

    invoke-virtual {p0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->d0()V

    :goto_3
    return-void
.end method

.method private S(Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;)V
    .locals 8

    new-instance v0, Lcom/amazonaws/mobileconnectors/iot/AWSIotWebSocketUrlSigner;

    const-string v1, "iotdata"

    invoke-direct {v0, v1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotWebSocketUrlSigner;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->b:Lcom/amazonaws/mobileconnectors/iot/AWSIotWebSocketUrlSigner;

    invoke-direct {p0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->E()Ljava/lang/String;

    move-result-object v3

    :try_start_0
    iget-object v2, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->b:Lcom/amazonaws/mobileconnectors/iot/AWSIotWebSocketUrlSigner;

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->G:Lcom/amazonaws/auth/AWSCredentialsProvider;

    invoke-interface {v0}, Lcom/amazonaws/auth/AWSCredentialsProvider;->a()Lcom/amazonaws/auth/AWSCredentials;

    move-result-object v4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    iget-object v7, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->e:Lcom/amazonaws/regions/Region;

    invoke-virtual/range {v2 .. v7}, Lcom/amazonaws/mobileconnectors/iot/AWSIotWebSocketUrlSigner;->c(Ljava/lang/String;Lcom/amazonaws/auth/AWSCredentials;JLcom/amazonaws/regions/Region;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->N:Lcom/amazonaws/logging/Log;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Reconnect to mqtt broker: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->B:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " mqttWebSocketURL: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/amazonaws/logging/Log;->a(Ljava/lang/Object;)V

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->setServerURIs([Ljava/lang/String;)V
    :try_end_0
    .catch Lcom/amazonaws/AmazonClientException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    sget-object v0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->N:Lcom/amazonaws/logging/Log;

    const-string v1, "Failed to get credentials. AmazonClientException: "

    invoke-interface {v0, v1, p1}, Lcom/amazonaws/logging/Log;->d(Ljava/lang/Object;Ljava/lang/Throwable;)V

    invoke-direct {p0, p1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->H(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private W()Z
    .locals 5

    sget-object v0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->N:Lcom/amazonaws/logging/Log;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "schedule Reconnect attempt "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->p:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " of "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->o:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " in "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->n:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " seconds."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/amazonaws/logging/Log;->b(Ljava/lang/Object;)V

    iget v1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->o:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    iget v2, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->p:I

    if-ge v2, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "schedule reconnect returns false"

    invoke-interface {v0, v1}, Lcom/amazonaws/logging/Log;->e(Ljava/lang/Object;)V

    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "Reconnect thread"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Landroid/os/Handler;

    invoke-direct {v2, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$4;

    invoke-direct {v1, p0, v0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$4;-><init>(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;Landroid/os/HandlerThread;)V

    sget-object v0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->M:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget v3, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->n:I

    mul-int/2addr v0, v3

    int-to-long v3, v0

    invoke-virtual {v2, v1, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    iget v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->n:I

    mul-int/lit8 v0, v0, 0x2

    iget v1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->m:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->n:I

    const/4 v0, 0x1

    return v0
.end method

.method static synthetic a(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)Lcom/amazonaws/mobileconnectors/iot/AWSIotWebSocketUrlSigner;
    .locals 0

    iget-object p0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->b:Lcom/amazonaws/mobileconnectors/iot/AWSIotWebSocketUrlSigner;

    return-object p0
.end method

.method static synthetic b(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;Lcom/amazonaws/mobileconnectors/iot/AWSIotWebSocketUrlSigner;)Lcom/amazonaws/mobileconnectors/iot/AWSIotWebSocketUrlSigner;
    .locals 0

    iput-object p1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->b:Lcom/amazonaws/mobileconnectors/iot/AWSIotWebSocketUrlSigner;

    return-object p1
.end method

.method static synthetic c(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->B:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic d(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->d:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic e(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->L(Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;)V

    return-void
.end method

.method static synthetic f(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;
    .locals 0

    iget-object p0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->J:Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;

    return-object p0
.end method

.method static synthetic g(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;)Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;
    .locals 0

    iput-object p1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->J:Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;

    return-object p1
.end method

.method static synthetic h(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)Ljava/lang/Long;
    .locals 0

    iget-object p0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->I:Ljava/lang/Long;

    return-object p0
.end method

.method static synthetic i(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;Ljava/lang/Long;)Ljava/lang/Long;
    .locals 0

    iput-object p1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->I:Ljava/lang/Long;

    return-object p1
.end method

.method static synthetic j(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)Ljava/lang/Long;
    .locals 0

    invoke-direct {p0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->G()Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method static synthetic k(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->w:Z

    return p1
.end method

.method static synthetic l(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)Ljava/util/concurrent/ConcurrentLinkedQueue;
    .locals 0

    iget-object p0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->i:Ljava/util/concurrent/ConcurrentLinkedQueue;

    return-object p0
.end method

.method static synthetic m(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->u:Z

    return p0
.end method

.method static synthetic n(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->k:Z

    return p0
.end method

.method static synthetic o(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)Z
    .locals 0

    invoke-direct {p0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->W()Z

    move-result p0

    return p0
.end method

.method static synthetic p(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->c:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic q(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->v:Z

    return p0
.end method

.method static synthetic r(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->H(Ljava/lang/Throwable;)V

    return-void
.end method

.method static synthetic s(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->H:Ljava/lang/Integer;

    return-object p0
.end method

.method static synthetic t(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->h:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic u(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)Lcom/amazonaws/regions/Region;
    .locals 0

    iget-object p0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->e:Lcom/amazonaws/regions/Region;

    return-object p0
.end method

.method static synthetic v(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$AuthenticationMode;)Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$AuthenticationMode;
    .locals 0

    iput-object p1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->f:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$AuthenticationMode;

    return-object p1
.end method

.method static synthetic w()Lcom/amazonaws/logging/Log;
    .locals 1

    sget-object v0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->N:Lcom/amazonaws/logging/Log;

    return-object v0
.end method

.method static synthetic x(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)Lcom/amazonaws/auth/AWSCredentialsProvider;
    .locals 0

    iget-object p0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->G:Lcom/amazonaws/auth/AWSCredentialsProvider;

    return-object p0
.end method

.method static synthetic y()Ljava/lang/Integer;
    .locals 1

    sget-object v0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->M:Ljava/lang/Integer;

    return-object v0
.end method

.method static synthetic z(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttLastWillAndTestament;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public C(Lcom/amazonaws/auth/AWSCredentialsProvider;Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttClientStatusCallback;)V
    .locals 1

    iput-object p1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->G:Lcom/amazonaws/auth/AWSCredentialsProvider;

    if-eqz p1, :cond_1

    iput-object p2, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->g:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttClientStatusCallback;

    sget-object p1, Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;->Disconnected:Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;

    iget-object p2, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->J:Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->d0()V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/Thread;

    new-instance p2, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$1;

    invoke-direct {p2, p0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$1;-><init>(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)V

    const-string v0, "Mqtt Connect Thread"

    invoke-direct {p1, p2, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "credentials provider cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public D()Z
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->u:Z

    invoke-virtual {p0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->T()V

    iget-object v1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->h:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    sget-object v1, Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;->Disconnected:Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;

    iput-object v1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->J:Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;

    invoke-virtual {p0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->d0()V

    return v0
.end method

.method public J()Z
    .locals 1

    iget-boolean v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->y:Z

    return v0
.end method

.method M(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback;Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback$MessageDeliveryStatus;Ljava/lang/Object;Ljava/lang/RuntimeException;)V
    .locals 0

    if-eqz p1, :cond_0

    invoke-interface {p1, p2, p3}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback;->a(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback$MessageDeliveryStatus;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    if-nez p4, :cond_1

    :goto_0
    return-void

    :cond_1
    throw p4
.end method

.method public N([BLjava/lang/String;Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback;Ljava/lang/Object;)V
    .locals 8

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    if-eqz p1, :cond_5

    if-eqz p3, :cond_4

    new-instance v6, Lcom/amazonaws/mobileconnectors/iot/PublishMessageUserData;

    invoke-direct {v6, p4, p5}, Lcom/amazonaws/mobileconnectors/iot/PublishMessageUserData;-><init>(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback;Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->J:Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;

    sget-object v1, Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;->Connected:Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->i:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->a:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    invoke-virtual {p3}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;->asInt()I

    move-result v4

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v2, p2

    move-object v3, p1

    invoke-virtual/range {v1 .. v7}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->publish(Ljava/lang/String;[BIZLjava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;
    :try_end_0
    .catch Lorg/eclipse/paho/client/mqttv3/MqttException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    sget-object p2, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback$MessageDeliveryStatus;->Fail:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback$MessageDeliveryStatus;

    new-instance p3, Lcom/amazonaws/AmazonClientException;

    const-string v0, "Client error while publishing."

    invoke-direct {p3, v0, p1}, Lcom/amazonaws/AmazonClientException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0, p4, p2, p5, p3}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->M(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback;Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback$MessageDeliveryStatus;Ljava/lang/Object;Ljava/lang/RuntimeException;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, p2, p3, v6}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->Q([BLjava/lang/String;Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;Lcom/amazonaws/mobileconnectors/iot/PublishMessageUserData;)V

    goto :goto_0

    :cond_1
    sget-object v1, Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;->Reconnecting:Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;

    if-ne v0, v1, :cond_3

    iget-boolean v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->q:Z

    if-eqz v0, :cond_2

    invoke-virtual {p0, p1, p2, p3, v6}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->Q([BLjava/lang/String;Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;Lcom/amazonaws/mobileconnectors/iot/PublishMessageUserData;)V

    goto :goto_0

    :cond_2
    sget-object p1, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback$MessageDeliveryStatus;->Fail:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback$MessageDeliveryStatus;

    new-instance p2, Lcom/amazonaws/AmazonClientException;

    const-string p3, "Client error while publishing : Offline publish queue is not enabled and client is not connected"

    invoke-direct {p2, p3}, Lcom/amazonaws/AmazonClientException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p4, p1, p5, p2}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->M(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback;Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback$MessageDeliveryStatus;Ljava/lang/Object;Ljava/lang/RuntimeException;)V

    goto :goto_0

    :cond_3
    sget-object p1, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback$MessageDeliveryStatus;->Fail:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback$MessageDeliveryStatus;

    new-instance p2, Lcom/amazonaws/AmazonClientException;

    const-string p3, "Client is disconnected or not yet connected."

    invoke-direct {p2, p3}, Lcom/amazonaws/AmazonClientException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p4, p1, p5, p2}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->M(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback;Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback$MessageDeliveryStatus;Ljava/lang/Object;Ljava/lang/RuntimeException;)V

    :goto_0
    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "QoS cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "data is null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "topic is null or empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method O()V
    .locals 9

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->J:Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;

    sget-object v1, Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;->Connected:Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->i:Ljava/util/concurrent/ConcurrentLinkedQueue;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->i:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQueueMessage;

    if-eqz v0, :cond_1

    :try_start_0
    invoke-virtual {v0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQueueMessage;->d()Lcom/amazonaws/mobileconnectors/iot/PublishMessageUserData;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQueueMessage;->d()Lcom/amazonaws/mobileconnectors/iot/PublishMessageUserData;

    move-result-object v1

    invoke-virtual {v1}, Lcom/amazonaws/mobileconnectors/iot/PublishMessageUserData;->a()Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v2, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->a:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    invoke-virtual {v0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQueueMessage;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQueueMessage;->a()[B

    move-result-object v4

    invoke-virtual {v0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQueueMessage;->b()Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;

    move-result-object v1

    invoke-virtual {v1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;->asInt()I

    move-result v5

    invoke-virtual {v0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQueueMessage;->d()Lcom/amazonaws/mobileconnectors/iot/PublishMessageUserData;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v2 .. v8}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->publish(Ljava/lang/String;[BIZLjava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;

    goto :goto_1

    :catch_0
    move-exception v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->a:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    invoke-virtual {v0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQueueMessage;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQueueMessage;->a()[B

    move-result-object v3

    invoke-virtual {v0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQueueMessage;->b()Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;

    move-result-object v4

    invoke-virtual {v4}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;->asInt()I

    move-result v4

    const/4 v5, 0x0

    invoke-virtual {v1, v2, v3, v4, v5}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->publish(Ljava/lang/String;[BIZ)Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;
    :try_end_0
    .catch Lorg/eclipse/paho/client/mqttv3/MqttException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :goto_0
    invoke-virtual {v0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQueueMessage;->d()Lcom/amazonaws/mobileconnectors/iot/PublishMessageUserData;

    move-result-object v2

    invoke-virtual {v2}, Lcom/amazonaws/mobileconnectors/iot/PublishMessageUserData;->a()Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback;

    move-result-object v2

    sget-object v3, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback$MessageDeliveryStatus;->Fail:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback$MessageDeliveryStatus;

    invoke-virtual {v0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQueueMessage;->d()Lcom/amazonaws/mobileconnectors/iot/PublishMessageUserData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/amazonaws/mobileconnectors/iot/PublishMessageUserData;->b()Ljava/lang/Object;

    move-result-object v0

    new-instance v4, Lcom/amazonaws/AmazonClientException;

    const-string v5, "Client error while publishing."

    invoke-direct {v4, v5, v1}, Lcom/amazonaws/AmazonClientException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0, v2, v3, v0, v4}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->M(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback;Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback$MessageDeliveryStatus;Ljava/lang/Object;Ljava/lang/RuntimeException;)V

    :cond_1
    :goto_1
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$6;

    invoke-direct {v1, p0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$6;-><init>(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)V

    iget-wide v2, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->t:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_2
    return-void
.end method

.method public P(Ljava/lang/String;Ljava/lang/String;Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback;Ljava/lang/Object;)V
    .locals 7

    if-eqz p1, :cond_2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    if-eqz p3, :cond_0

    sget-object v0, Lcom/amazonaws/util/StringUtils;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v2

    move-object v1, p0

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->N([BLjava/lang/String;Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback;Ljava/lang/Object;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "QoS cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "topic is null or empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "publish string is null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method Q([BLjava/lang/String;Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;Lcom/amazonaws/mobileconnectors/iot/PublishMessageUserData;)V
    .locals 1

    new-instance v0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQueueMessage;

    invoke-direct {v0, p2, p1, p3, p4}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQueueMessage;-><init>(Ljava/lang/String;[BLcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;Lcom/amazonaws/mobileconnectors/iot/PublishMessageUserData;)V

    iget-object p1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->i:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    move-result p1

    iget-object p2, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->r:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    if-lt p1, p2, :cond_1

    iget-boolean p1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->s:Z

    if-eqz p1, :cond_0

    invoke-virtual {p4}, Lcom/amazonaws/mobileconnectors/iot/PublishMessageUserData;->a()Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback;

    move-result-object p1

    sget-object p2, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback$MessageDeliveryStatus;->Fail:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback$MessageDeliveryStatus;

    invoke-virtual {p4}, Lcom/amazonaws/mobileconnectors/iot/PublishMessageUserData;->b()Ljava/lang/Object;

    move-result-object p3

    new-instance p4, Lcom/amazonaws/AmazonClientException;

    const-string v0, "Failed to publish the message. Queue is full and set to hold onto the oldest messages."

    invoke-direct {p4, v0}, Lcom/amazonaws/AmazonClientException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->M(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback;Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback$MessageDeliveryStatus;Ljava/lang/Object;Ljava/lang/RuntimeException;)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->i:Ljava/util/concurrent/ConcurrentLinkedQueue;

    const/4 p2, 0x0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z

    :cond_1
    iget-object p1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->i:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method R()V
    .locals 6

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->a:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    if-eqz v0, :cond_4

    sget-object v0, Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;->Disconnected:Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;

    iget-object v1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->J:Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    sget-object v0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->N:Lcom/amazonaws/logging/Log;

    const-string v1, "attempting to reconnect to mqtt broker"

    invoke-interface {v0, v1}, Lcom/amazonaws/logging/Log;->b(Ljava/lang/Object;)V

    new-instance v1, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    invoke-direct {v1}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;-><init>()V

    iget-boolean v2, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->x:Z

    invoke-virtual {v1, v2}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->setCleanSession(Z)V

    iget v2, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->j:I

    invoke-virtual {v1, v2}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->setKeepAliveInterval(I)V

    sget-object v2, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$8;->a:[I

    iget-object v3, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->f:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$AuthenticationMode;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/4 v3, 0x1

    if-eq v2, v3, :cond_3

    const/4 v4, 0x2

    if-eq v2, v4, :cond_2

    const/4 v4, 0x3

    if-eq v2, v4, :cond_1

    const/4 v4, 0x4

    if-eq v2, v4, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->D:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->setUserName(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->E:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->toCharArray()[C

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->setPassword([C)V

    iget-object v2, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->C:Ljava/util/Properties;

    invoke-virtual {v1, v2}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->setCustomWebSocketHeaders(Ljava/util/Properties;)V

    :goto_0
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Unexpected value: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->f:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$AuthenticationMode;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v2}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->H(Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_1
    iget-object v2, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->C:Ljava/util/Properties;

    invoke-virtual {v1, v2}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->setCustomWebSocketHeaders(Ljava/util/Properties;)V

    goto :goto_1

    :cond_2
    invoke-direct {p0, v1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->S(Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;)V

    goto :goto_1

    :cond_3
    iget-object v2, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->F:Ljavax/net/SocketFactory;

    invoke-virtual {v1, v2}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->setSocketFactory(Ljavax/net/SocketFactory;)V

    :goto_1
    invoke-virtual {p0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->a0()V

    :try_start_0
    iget v2, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->p:I

    add-int/2addr v2, v3

    iput v2, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->p:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mqtt reconnecting attempt "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->p:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/amazonaws/logging/Log;->a(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->a:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    new-instance v2, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$3;

    invoke-direct {v2, p0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$3;-><init>(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)V

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->connect(Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;Ljava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;
    :try_end_0
    .catch Lorg/eclipse/paho/client/mqttv3/MqttException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    sget-object v1, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->N:Lcom/amazonaws/logging/Log;

    const-string v2, "Exception during reconnect, exception: "

    invoke-interface {v1, v2, v0}, Lcom/amazonaws/logging/Log;->d(Ljava/lang/Object;Ljava/lang/Throwable;)V

    invoke-direct {p0, v0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->H(Ljava/lang/Throwable;)V

    :cond_4
    :goto_2
    return-void
.end method

.method T()V
    .locals 3

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->a:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->a:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->disconnect(J)Lorg/eclipse/paho/client/mqttv3/IMqttToken;
    :try_end_0
    .catch Lorg/eclipse/paho/client/mqttv3/MqttException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/amazonaws/AmazonClientException;

    const-string v2, "Client error when disconnecting."

    invoke-direct {v1, v2, v0}, Lcom/amazonaws/AmazonClientException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_0
    :goto_0
    return-void
.end method

.method public U()V
    .locals 2

    sget-object v0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->N:Lcom/amazonaws/logging/Log;

    const-string v1, "resetting reconnect attempt and retry time"

    invoke-interface {v0, v1}, Lcom/amazonaws/logging/Log;->b(Ljava/lang/Object;)V

    const/4 v0, 0x0

    iput v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->p:I

    iget v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->l:I

    iput v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->n:I

    return-void
.end method

.method V()V
    .locals 4

    sget-object v0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->N:Lcom/amazonaws/logging/Log;

    const-string v1, "Auto-resubscribe is enabled. Resubscribing to previous topics."

    invoke-interface {v0, v1}, Lcom/amazonaws/logging/Log;->b(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->h:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttTopic;

    iget-object v2, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->a:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    if-eqz v2, :cond_0

    :try_start_0
    invoke-virtual {v1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttTopic;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttTopic;->b()Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;

    move-result-object v1

    invoke-virtual {v1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;->asInt()I

    move-result v1

    invoke-virtual {v2, v3, v1}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->subscribe(Ljava/lang/String;I)Lorg/eclipse/paho/client/mqttv3/IMqttToken;
    :try_end_0
    .catch Lorg/eclipse/paho/client/mqttv3/MqttException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    sget-object v2, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->N:Lcom/amazonaws/logging/Log;

    const-string v3, "Error while resubscribing to previously subscribed toipcs."

    invoke-interface {v2, v3, v1}, Lcom/amazonaws/logging/Log;->d(Ljava/lang/Object;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public X()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->s:Z

    return-void
.end method

.method public Y(I)V
    .locals 1

    if-gtz p1, :cond_1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Max reconnection attempts must be postive or -1"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iput p1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->o:I

    return-void
.end method

.method public Z(II)V
    .locals 0

    if-gt p1, p2, :cond_0

    iput p1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->l:I

    iput p2, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->m:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Minimum reconnect time needs to be less than Maximum."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method a0()V
    .locals 2

    sget-object v0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->N:Lcom/amazonaws/logging/Log;

    const-string v1, "Setting up Callback for MqttClient"

    invoke-interface {v0, v1}, Lcom/amazonaws/logging/Log;->a(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->a:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    new-instance v1, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$7;

    invoke-direct {v1, p0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$7;-><init>(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)V

    invoke-virtual {v0, v1}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->setCallback(Lorg/eclipse/paho/client/mqttv3/MqttCallback;)V

    return-void
.end method

.method public b0(Ljava/lang/String;Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttSubscriptionStatusCallback;Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttNewMessageCallback;)V
    .locals 4

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    if-eqz p2, :cond_3

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->a:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    if-eqz v0, :cond_2

    if-eqz p3, :cond_0

    :try_start_0
    invoke-virtual {p2}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;->asInt()I

    move-result v1

    new-instance v2, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$5;

    invoke-direct {v2, p0, p3}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$5;-><init>(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttSubscriptionStatusCallback;)V

    const/4 v3, 0x0

    invoke-virtual {v0, p1, v1, v3, v2}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->subscribe(Ljava/lang/String;ILjava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;->asInt()I

    move-result v1

    invoke-virtual {v0, p1, v1}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->subscribe(Ljava/lang/String;I)Lorg/eclipse/paho/client/mqttv3/IMqttToken;
    :try_end_0
    .catch Lorg/eclipse/paho/client/mqttv3/MqttException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :goto_0
    if-eqz p3, :cond_1

    invoke-interface {p3, v0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttSubscriptionStatusCallback;->a(Ljava/lang/Throwable;)V

    :goto_1
    new-instance p3, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttTopic;

    invoke-direct {p3, p1, p2, p4}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttTopic;-><init>(Ljava/lang/String;Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttNewMessageCallback;)V

    iget-object p2, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->h:Ljava/util/Map;

    invoke-interface {p2, p1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_1
    new-instance p1, Lcom/amazonaws/AmazonClientException;

    const-string p2, "Client error when subscribing."

    invoke-direct {p1, p2, v0}, Lcom/amazonaws/AmazonClientException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_2
    :goto_2
    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "QoS cannot be null."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "topic is null or empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c0(Ljava/lang/String;)V
    .locals 2

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->a:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {v0, p1}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->unsubscribe(Ljava/lang/String;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;
    :try_end_0
    .catch Lorg/eclipse/paho/client/mqttv3/MqttException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->h:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance v0, Lcom/amazonaws/AmazonClientException;

    const-string v1, "Client error while unsubscribing."

    invoke-direct {v0, v1, p1}, Lcom/amazonaws/AmazonClientException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    :goto_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "topic is null or empty"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method d0()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->e0(Ljava/lang/Throwable;)V

    return-void
.end method

.method e0(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->g:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttClientStatusCallback;

    if-eqz v0, :cond_4

    sget-object v0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$8;->b:[I

    iget-object v1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->J:Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->g:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttClientStatusCallback;

    sget-object v1, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttClientStatusCallback$AWSIotMqttClientStatus;->ConnectionLost:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttClientStatusCallback$AWSIotMqttClientStatus;

    invoke-interface {v0, v1, p1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttClientStatusCallback;->a(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttClientStatusCallback$AWSIotMqttClientStatus;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Unknown connection state."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->g:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttClientStatusCallback;

    sget-object v1, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttClientStatusCallback$AWSIotMqttClientStatus;->Reconnecting:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttClientStatusCallback$AWSIotMqttClientStatus;

    invoke-interface {v0, v1, p1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttClientStatusCallback;->a(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttClientStatusCallback$AWSIotMqttClientStatus;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->g:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttClientStatusCallback;

    sget-object v1, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttClientStatusCallback$AWSIotMqttClientStatus;->Connecting:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttClientStatusCallback$AWSIotMqttClientStatus;

    invoke-interface {v0, v1, p1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttClientStatusCallback;->a(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttClientStatusCallback$AWSIotMqttClientStatus;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->g:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttClientStatusCallback;

    sget-object v1, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttClientStatusCallback$AWSIotMqttClientStatus;->Connected:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttClientStatusCallback$AWSIotMqttClientStatus;

    invoke-interface {v0, v1, p1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttClientStatusCallback;->a(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttClientStatusCallback$AWSIotMqttClientStatus;Ljava/lang/Throwable;)V

    :cond_4
    :goto_0
    return-void
.end method
