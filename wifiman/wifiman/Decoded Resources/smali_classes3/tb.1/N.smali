.class public final Ltb/N;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/webrtc/PeerConnection$Observer;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltb/N$b;,
        Ltb/N$c;,
        Ltb/N$d;
    }
.end annotation


# static fields
.field public static final B:Ltb/N$b;

.field private static final C:Ltb/N$a;

.field private static final D:Lgg/y;

.field private static E:Lorg/webrtc/PeerConnectionFactory;

.field private static final F:Lorg/webrtc/MediaConstraints;


# instance fields
.field private A:Lhg/c;

.field private final a:Ljava/lang/String;

.field private final b:Lpb/l;

.field private final c:Llb/c;

.field private final d:Z

.field private e:Lorg/webrtc/PeerConnection;

.field private final f:Z

.field private g:Z

.field private h:Z

.field private i:Z

.field private j:Z

.field private k:Lhg/c;

.field private final l:Ljava/util/List;

.field private final m:Ljava/util/Map;

.field private n:Lhg/c;

.field private o:Lhg/c;

.field private p:Lmh/l;

.field private q:Ljava/util/Map;

.field private final r:LFg/a;

.field private final s:LFg/c;

.field private t:Ltb/N$c;

.field private final u:Lgg/z;

.field private v:Lgg/t;

.field private final w:Lgg/s;

.field private final x:Lgg/s;

.field private final y:Ltb/N$n;

.field private final z:Ltb/N$p;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ltb/N$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ltb/N$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ltb/N;->B:Ltb/N$b;

    new-instance v0, Ltb/N$a;

    invoke-direct {v0}, Ltb/N$a;-><init>()V

    sput-object v0, Ltb/N;->C:Ltb/N$a;

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-static {v0}, LGg/a;->b(Ljava/util/concurrent/Executor;)Lgg/y;

    move-result-object v0

    const-string/jumbo v1, "from(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Ltb/N;->D:Lgg/y;

    new-instance v0, Lorg/webrtc/MediaConstraints;

    invoke-direct {v0}, Lorg/webrtc/MediaConstraints;-><init>()V

    iget-object v1, v0, Lorg/webrtc/MediaConstraints;->mandatory:Ljava/util/List;

    new-instance v2, Lorg/webrtc/MediaConstraints$KeyValuePair;

    const-string/jumbo v3, "OfferToReceiveAudio"

    const-string/jumbo v4, "true"

    invoke-direct {v2, v3, v4}, Lorg/webrtc/MediaConstraints$KeyValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lorg/webrtc/MediaConstraints;->mandatory:Ljava/util/List;

    new-instance v2, Lorg/webrtc/MediaConstraints$KeyValuePair;

    const-string/jumbo v3, "OfferToReceiveVideo"

    invoke-direct {v2, v3, v4}, Lorg/webrtc/MediaConstraints$KeyValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sput-object v0, Ltb/N;->F:Lorg/webrtc/MediaConstraints;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/lang/String;Lpb/l;Llb/c;Z)V
    .locals 1

    const-string/jumbo v0, "iceServers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "deviceId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "mqttClient"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "meta"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ltb/N;->a:Ljava/lang/String;

    iput-object p3, p0, Ltb/N;->b:Lpb/l;

    iput-object p4, p0, Ltb/N;->c:Llb/c;

    iput-boolean p5, p0, Ltb/N;->d:Z

    const/4 p2, 0x1

    iput-boolean p2, p0, Ltb/N;->f:Z

    invoke-static {}, Lhg/c;->n()Lhg/c;

    move-result-object p2

    const-string/jumbo p3, "disposed(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Ltb/N;->k:Lhg/c;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Ltb/N;->l:Ljava/util/List;

    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p2, p0, Ltb/N;->m:Ljava/util/Map;

    invoke-static {}, Lhg/c;->n()Lhg/c;

    move-result-object p2

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Ltb/N;->n:Lhg/c;

    invoke-static {}, Lhg/c;->n()Lhg/c;

    move-result-object p2

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Ltb/N;->o:Lhg/c;

    invoke-static {}, LZg/U;->h()Ljava/util/Map;

    move-result-object p2

    iput-object p2, p0, Ltb/N;->q:Ljava/util/Map;

    invoke-static {p2}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object p2

    const-string/jumbo p4, "createDefault(...)"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Ltb/N;->r:LFg/a;

    invoke-static {}, LFg/c;->j2()LFg/c;

    move-result-object p2

    const-string/jumbo p4, "create(...)"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Ltb/N;->s:LFg/c;

    new-instance p2, Lorg/webrtc/PeerConnection$RTCConfiguration;

    invoke-direct {p2, p1}, Lorg/webrtc/PeerConnection$RTCConfiguration;-><init>(Ljava/util/List;)V

    sget-object p1, Lorg/webrtc/PeerConnection$TcpCandidatePolicy;->ENABLED:Lorg/webrtc/PeerConnection$TcpCandidatePolicy;

    iput-object p1, p2, Lorg/webrtc/PeerConnection$RTCConfiguration;->tcpCandidatePolicy:Lorg/webrtc/PeerConnection$TcpCandidatePolicy;

    sget-object p1, Lorg/webrtc/PeerConnection$ContinualGatheringPolicy;->GATHER_CONTINUALLY:Lorg/webrtc/PeerConnection$ContinualGatheringPolicy;

    iput-object p1, p2, Lorg/webrtc/PeerConnection$RTCConfiguration;->continualGatheringPolicy:Lorg/webrtc/PeerConnection$ContinualGatheringPolicy;

    sget-object p1, Ltb/N;->E:Lorg/webrtc/PeerConnectionFactory;

    if-nez p1, :cond_0

    const-string/jumbo p1, "peerConnectionFactory"

    invoke-static {p1}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p1, p2, p0}, Lorg/webrtc/PeerConnectionFactory;->createPeerConnection(Lorg/webrtc/PeerConnection$RTCConfiguration;Lorg/webrtc/PeerConnection$Observer;)Lorg/webrtc/PeerConnection;

    move-result-object p1

    iput-object p1, p0, Ltb/N;->e:Lorg/webrtc/PeerConnection;

    sget-object p1, Ltb/N$c;->NONE:Ltb/N$c;

    iput-object p1, p0, Ltb/N;->t:Ltb/N$c;

    new-instance p1, Ltb/v;

    invoke-direct {p1, p0}, Ltb/v;-><init>(Ltb/N;)V

    invoke-static {p1}, Lgg/z;->x(Ljava/util/concurrent/Callable;)Lgg/z;

    move-result-object p1

    new-instance p2, Ltb/N$m;

    invoke-direct {p2, p0}, Ltb/N$m;-><init>(Ltb/N;)V

    invoke-virtual {p1, p2}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object p1

    sget-object p2, Ltb/N;->D:Lgg/y;

    invoke-virtual {p1, p2}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object p1

    const-string/jumbo p2, "subscribeOn(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ltb/N;->u:Lgg/z;

    new-instance p2, Ltb/E;

    invoke-direct {p2, p0}, Ltb/E;-><init>(Ltb/N;)V

    invoke-static {p2}, Lgg/s;->o(Lgg/u;)Lgg/s;

    move-result-object p2

    invoke-static {p2, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Ltb/N;->w:Lgg/s;

    new-instance p2, Ltb/N$j;

    invoke-direct {p2, p0}, Ltb/N$j;-><init>(Ltb/N;)V

    invoke-virtual {p1, p2}, Lgg/z;->v(Lkg/n;)Lgg/s;

    move-result-object p1

    const-string/jumbo p2, "flatMapObservable(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ltb/N;->x:Lgg/s;

    new-instance p1, Ltb/N$n;

    invoke-direct {p1, p0}, Ltb/N$n;-><init>(Ltb/N;)V

    iput-object p1, p0, Ltb/N;->y:Ltb/N$n;

    new-instance p1, Ltb/N$p;

    invoke-direct {p1, p0}, Ltb/N$p;-><init>(Ltb/N;)V

    iput-object p1, p0, Ltb/N;->z:Ltb/N$p;

    invoke-static {}, Lhg/c;->n()Lhg/c;

    move-result-object p1

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ltb/N;->A:Lhg/c;

    return-void
.end method

.method public static final synthetic A(Ltb/N;)V
    .locals 0

    invoke-direct {p0}, Ltb/N;->m0()V

    return-void
.end method

.method private final A0(Lorg/webrtc/SessionDescription;)V
    .locals 2

    sget-object v0, Ltb/N$c;->SET_LOCAL_SDP:Ltb/N$c;

    invoke-direct {p0, v0}, Ltb/N;->I(Ltb/N$c;)V

    iget-object v0, p0, Ltb/N;->e:Lorg/webrtc/PeerConnection;

    if-eqz v0, :cond_0

    iget-object v1, p0, Ltb/N;->y:Ltb/N$n;

    invoke-virtual {v0, v1, p1}, Lorg/webrtc/PeerConnection;->setLocalDescription(Lorg/webrtc/SdpObserver;Lorg/webrtc/SessionDescription;)V

    :cond_0
    return-void
.end method

.method public static final synthetic B(Ltb/N;Lorg/webrtc/SessionDescription;Ltb/f;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ltb/N;->v0(Lorg/webrtc/SessionDescription;Ltb/f;)V

    return-void
.end method

.method public static final synthetic C(Ltb/N;Lorg/webrtc/SessionDescription;)V
    .locals 0

    invoke-direct {p0, p1}, Ltb/N;->y0(Lorg/webrtc/SessionDescription;)V

    return-void
.end method

.method private final C0(Lorg/webrtc/SessionDescription;)V
    .locals 2

    sget-object v0, Ltb/N$c;->SET_REMOTE_SDP:Ltb/N$c;

    invoke-direct {p0, v0}, Ltb/N;->I(Ltb/N$c;)V

    iget-object v0, p0, Ltb/N;->e:Lorg/webrtc/PeerConnection;

    if-eqz v0, :cond_0

    iget-object v1, p0, Ltb/N;->z:Ltb/N$p;

    invoke-virtual {v0, v1, p1}, Lorg/webrtc/PeerConnection;->setRemoteDescription(Lorg/webrtc/SdpObserver;Lorg/webrtc/SessionDescription;)V

    :cond_0
    return-void
.end method

.method public static final synthetic D(Ltb/N;Lorg/webrtc/SessionDescription;)V
    .locals 0

    invoke-direct {p0, p1}, Ltb/N;->A0(Lorg/webrtc/SessionDescription;)V

    return-void
.end method

.method private final D0(Ltb/N$c;)V
    .locals 3

    iput-object p1, p0, Ltb/N;->t:Ltb/N$c;

    sget-object v0, LSj/a;->a:LSj/a$b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v1}, LSj/a$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic E(Ltb/N;Z)V
    .locals 0

    iput-boolean p1, p0, Ltb/N;->g:Z

    return-void
.end method

.method public static final synthetic F(Lorg/webrtc/PeerConnectionFactory;)V
    .locals 0

    sput-object p0, Ltb/N;->E:Lorg/webrtc/PeerConnectionFactory;

    return-void
.end method

.method public static final synthetic G(Ltb/N;Lorg/webrtc/SessionDescription;)V
    .locals 0

    invoke-direct {p0, p1}, Ltb/N;->C0(Lorg/webrtc/SessionDescription;)V

    return-void
.end method

.method private final H(Lorg/webrtc/IceCandidate;)V
    .locals 1

    iget-boolean v0, p0, Ltb/N;->i:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ltb/N;->e:Lorg/webrtc/PeerConnection;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lorg/webrtc/PeerConnection;->addIceCandidate(Lorg/webrtc/IceCandidate;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ltb/N;->l:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    return-void
.end method

.method private final I(Ltb/N$c;)V
    .locals 2

    invoke-direct {p0, p1}, Ltb/N;->D0(Ltb/N$c;)V

    iget-object v0, p0, Ltb/N;->v:Lgg/t;

    if-nez v0, :cond_0

    const-string/jumbo v0, "stateEmitter"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-interface {v0, p1}, Lgg/h;->h(Ljava/lang/Object;)V

    sget-object v0, Ltb/N$d;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    iget-boolean p1, p0, Ltb/N;->d:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Ltb/N;->k:Lhg/c;

    invoke-interface {p1}, Lhg/c;->dispose()V

    invoke-direct {p0}, Ltb/N;->R()Lgg/z;

    move-result-object p1

    sget-object v0, Ltb/N$e;->a:Ltb/N$e;

    sget-object v1, Ltb/N$f;->a:Ltb/N$f;

    invoke-virtual {p1, v0, v1}, Lgg/z;->M(Lkg/f;Lkg/f;)Lhg/c;

    move-result-object p1

    iput-object p1, p0, Ltb/N;->k:Lhg/c;

    :cond_1
    :pswitch_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static final K(Ltb/N;Lgg/t;)V
    .locals 1

    const-string/jumbo v0, "emitter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ltb/N;->v:Lgg/t;

    iget-object v0, p0, Ltb/N;->e:Lorg/webrtc/PeerConnection;

    if-nez v0, :cond_0

    new-instance p0, Ljava/lang/Exception;

    const-string v0, "Could not instantiate PeerConnection"

    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, p0}, Lgg/t;->c(Ljava/lang/Throwable;)Z

    return-void

    :cond_0
    new-instance v0, Ltb/x;

    invoke-direct {v0, p0}, Ltb/x;-><init>(Ltb/N;)V

    invoke-interface {p1, v0}, Lgg/t;->d(Lkg/e;)V

    invoke-direct {p0}, Ltb/N;->Q()V

    return-void
.end method

.method private final L()V
    .locals 4

    iget-boolean v0, p0, Ltb/N;->j:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Ltb/N;->t0()Lorg/webrtc/PeerConnection;

    move-result-object v0

    invoke-virtual {v0}, Lorg/webrtc/PeerConnection;->getLocalDescription()Lorg/webrtc/SessionDescription;

    move-result-object v0

    iget-object v0, v0, Lorg/webrtc/SessionDescription;->description:Ljava/lang/String;

    const/4 v1, 0x1

    iput-boolean v1, p0, Ltb/N;->j:Z

    sget-object v1, Ltb/N$c;->REQUESTING_SDP_ANSWER:Ltb/N$c;

    invoke-direct {p0, v1}, Ltb/N;->I(Ltb/N$c;)V

    iget-object v1, p0, Ltb/N;->b:Lpb/l;

    iget-object v2, p0, Ltb/N;->a:Ljava/lang/String;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-boolean v3, p0, Ltb/N;->f:Z

    invoke-virtual {v1, v2, v0, v3}, Lpb/l;->C(Ljava/lang/String;Ljava/lang/String;Z)Lgg/s;

    move-result-object v0

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/s;->o0(Lgg/y;)Lgg/s;

    move-result-object v0

    new-instance v1, Ltb/N$h;

    invoke-direct {v1, p0}, Ltb/N$h;-><init>(Ltb/N;)V

    new-instance v2, Ltb/N$i;

    invoke-direct {v2, p0}, Ltb/N$i;-><init>(Ltb/N;)V

    invoke-virtual {v0, v1, v2}, Lgg/s;->J0(Lkg/f;Lkg/f;)Lhg/c;

    move-result-object v0

    iput-object v0, p0, Ltb/N;->n:Lhg/c;

    return-void
.end method

.method private final M()V
    .locals 1

    iget-boolean v0, p0, Ltb/N;->g:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, Ltb/N;->f:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ltb/N;->h:Z

    if-eqz v0, :cond_2

    :cond_1
    invoke-direct {p0}, Ltb/N;->L()V

    :cond_2
    return-void
.end method

.method private final N(Ltb/f;)V
    .locals 2

    iget-object v0, p0, Ltb/N;->e:Lorg/webrtc/PeerConnection;

    if-eqz v0, :cond_0

    new-instance v1, Ltb/N$k;

    invoke-direct {v1, p0, p1}, Ltb/N$k;-><init>(Ltb/N;Ltb/f;)V

    sget-object p1, Ltb/N;->F:Lorg/webrtc/MediaConstraints;

    invoke-virtual {v0, v1, p1}, Lorg/webrtc/PeerConnection;->createAnswer(Lorg/webrtc/SdpObserver;Lorg/webrtc/MediaConstraints;)V

    :cond_0
    return-void
.end method

.method private final O(Ljava/lang/String;)Lorg/webrtc/DataChannel;
    .locals 2

    invoke-direct {p0}, Ltb/N;->t0()Lorg/webrtc/PeerConnection;

    move-result-object v0

    new-instance v1, Lorg/webrtc/DataChannel$Init;

    invoke-direct {v1}, Lorg/webrtc/DataChannel$Init;-><init>()V

    invoke-virtual {v0, p1, v1}, Lorg/webrtc/PeerConnection;->createDataChannel(Ljava/lang/String;Lorg/webrtc/DataChannel$Init;)Lorg/webrtc/DataChannel;

    move-result-object p1

    return-object p1
.end method

.method private final Q()V
    .locals 3

    invoke-direct {p0}, Ltb/N;->t0()Lorg/webrtc/PeerConnection;

    move-result-object v0

    sget-object v1, Ltb/N$c;->CREATE_OFFER:Ltb/N$c;

    invoke-direct {p0, v1}, Ltb/N;->I(Ltb/N$c;)V

    iget-object v1, p0, Ltb/N;->y:Ltb/N$n;

    invoke-static {}, Ltb/P;->b()Lorg/webrtc/MediaConstraints;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/webrtc/PeerConnection;->createOffer(Lorg/webrtc/SdpObserver;Lorg/webrtc/MediaConstraints;)V

    return-void
.end method

.method private final R()Lgg/z;
    .locals 2

    new-instance v0, Ltb/L;

    invoke-direct {v0, p0}, Ltb/L;-><init>(Ltb/N;)V

    invoke-static {v0}, Lgg/z;->x(Ljava/util/concurrent/Callable;)Lgg/z;

    move-result-object v0

    sget-object v1, Ltb/N;->D:Lgg/y;

    invoke-virtual {v0, v1}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object v0

    sget-object v1, Ltb/N$l;->a:Ltb/N$l;

    invoke-virtual {v0, v1}, Lgg/z;->m(Lkg/f;)Lgg/z;

    move-result-object v0

    const-string/jumbo v1, "doOnError(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final S(Ltb/N;)Ltb/f;
    .locals 4

    iget-object v0, p0, Ltb/N;->m:Ljava/util/Map;

    const-string/jumbo v1, "ws:/api/ws/webrtc/signaling"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltb/f;

    if-nez v0, :cond_1

    new-instance v0, Ltb/f;

    sget-object v2, Ltb/N;->D:Lgg/y;

    invoke-direct {v0, v1, v2}, Ltb/f;-><init>(Ljava/lang/String;Lgg/y;)V

    iget-object v2, p0, Ltb/N;->m:Ljava/util/Map;

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ltb/y;

    invoke-direct {v2, p0}, Ltb/y;-><init>(Ltb/N;)V

    invoke-virtual {v0, v2}, Ltb/f;->g(Ltb/f$c;)V

    new-instance v2, Ltb/m;

    new-instance v3, Ltb/z;

    invoke-direct {v3, p0, v0}, Ltb/z;-><init>(Ltb/N;Ltb/f;)V

    invoke-direct {v2, v3}, Ltb/m;-><init>(Lmh/l;)V

    new-instance v3, Ltb/A;

    invoke-direct {v3, v2}, Ltb/A;-><init>(Ltb/m;)V

    invoke-virtual {v0, v3}, Ltb/f;->B(Ltb/f$b;)V

    invoke-direct {p0, v1}, Ltb/N;->O(Ljava/lang/String;)Lorg/webrtc/DataChannel;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {v0, p0}, Ltb/f;->y(Lorg/webrtc/DataChannel;)V

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/Exception;

    const-string v0, "Could not create DataChannel with name \'ws:/api/ws/webrtc/signaling\'"

    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    return-object v0
.end method

.method private static final T(Ltb/N;Lorg/webrtc/DataChannel$State;)V
    .locals 1

    const-string/jumbo v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lorg/webrtc/DataChannel$State;->CLOSED:Lorg/webrtc/DataChannel$State;

    if-eq p1, v0, :cond_0

    sget-object v0, Lorg/webrtc/DataChannel$State;->CLOSING:Lorg/webrtc/DataChannel$State;

    if-ne p1, v0, :cond_1

    :cond_0
    iget-object p0, p0, Ltb/N;->m:Ljava/util/Map;

    const-string/jumbo p1, "ws:/api/ws/webrtc/signaling"

    invoke-interface {p0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method private static final U(Ltb/N;Ltb/f;Ljava/lang/String;)LYg/J;
    .locals 1

    const-string/jumbo v0, "offer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2, p1}, Ltb/N;->p0(Ljava/lang/String;Ltb/f;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final V(Ltb/m;Ljava/nio/ByteBuffer;)V
    .locals 1

    const-string/jumbo v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lkb/r;->a(Ljava/nio/ByteBuffer;)V

    return-void
.end method

.method private final W()V
    .locals 2

    iget-object v0, p0, Ltb/N;->e:Lorg/webrtc/PeerConnection;

    if-eqz v0, :cond_0

    new-instance v1, Ltb/F;

    invoke-direct {v1, p0}, Ltb/F;-><init>(Ltb/N;)V

    invoke-virtual {v0, v1}, Lorg/webrtc/PeerConnection;->getStats(Lorg/webrtc/RTCStatsCollectorCallback;)V

    :cond_0
    return-void
.end method

.method private static final X(Ltb/N;Lorg/webrtc/RTCStatsReport;)V
    .locals 0

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Ltb/N;->f0(Lorg/webrtc/RTCStatsReport;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Leb/i$a$b;->a:Leb/i$a$b;

    goto :goto_0

    :cond_0
    sget-object p1, Leb/i$a$a;->a:Leb/i$a$a;

    :goto_0
    iget-object p0, p0, Ltb/N;->p:Lmh/l;

    if-eqz p0, :cond_1

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method private final Y()V
    .locals 3

    iget-object v0, p0, Ltb/N;->k:Lhg/c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    iget-object v0, p0, Ltb/N;->n:Lhg/c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    iget-object v0, p0, Ltb/N;->e:Lorg/webrtc/PeerConnection;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    iput-object v1, p0, Ltb/N;->e:Lorg/webrtc/PeerConnection;

    iget-object v1, p0, Ltb/N;->o:Lhg/c;

    invoke-interface {v1}, Lhg/c;->dispose()V

    iget-object v1, p0, Ltb/N;->m:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    sget-object v1, Ltb/N;->D:Lgg/y;

    new-instance v2, Ltb/B;

    invoke-direct {v2, v0}, Ltb/B;-><init>(Lorg/webrtc/PeerConnection;)V

    invoke-virtual {v1, v2}, Lgg/y;->e(Ljava/lang/Runnable;)Lhg/c;

    return-void
.end method

.method private static final Z(Lorg/webrtc/PeerConnection;)V
    .locals 0

    invoke-virtual {p0}, Lorg/webrtc/PeerConnection;->dispose()V

    return-void
.end method

.method public static synthetic a(Ltb/N;)Ltb/f;
    .locals 0

    invoke-static {p0}, Ltb/N;->d0(Ltb/N;)Ltb/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ltb/N;Ltb/f;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Ltb/N;->j0(Ltb/N;Ltb/f;Ljava/lang/String;)V

    return-void
.end method

.method private final b0(Lorg/webrtc/RTCStats;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p1}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/lang/String;

    if-eqz p2, :cond_0

    check-cast p1, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public static synthetic c(Ltb/f;Ltb/N;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Ltb/N;->s0(Ltb/f;Ltb/N;Ljava/lang/String;)V

    return-void
.end method

.method private final c0(Lnb/c;)V
    .locals 5

    new-instance v0, Lorg/webrtc/IceCandidate;

    invoke-virtual {p1}, Lnb/c;->d()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    if-nez v1, :cond_0

    move-object v1, v2

    :cond_0
    invoke-virtual {p1}, Lnb/c;->e()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {p1}, Lnb/c;->c()Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Ltb/P;->a()Lkotlin/text/p;

    move-result-object v4

    invoke-virtual {v4, p1, v2}, Lkotlin/text/p;->n(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, v3, p1}, Lorg/webrtc/IceCandidate;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    invoke-direct {p0, v0}, Ltb/N;->H(Lorg/webrtc/IceCandidate;)V

    return-void
.end method

.method public static synthetic d(Ltb/N;Lorg/webrtc/DataChannel$Buffer;)V
    .locals 0

    invoke-static {p0, p1}, Ltb/N;->x0(Ltb/N;Lorg/webrtc/DataChannel$Buffer;)V

    return-void
.end method

.method private static final d0(Ltb/N;)Ltb/f;
    .locals 2

    const-string/jumbo v0, "api:0"

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Ltb/N;->g0(Ljava/lang/String;Z)Ltb/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ltb/N;)V
    .locals 0

    invoke-direct {p0}, Ltb/N;->z0()V

    return-void
.end method

.method public static synthetic f(Ltb/N;Ltb/f;Ljava/lang/String;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, Ltb/N;->U(Ltb/N;Ltb/f;Ljava/lang/String;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private final f0(Lorg/webrtc/RTCStatsReport;)Z
    .locals 7

    invoke-virtual {p1}, Lorg/webrtc/RTCStatsReport;->getStatsMap()Ljava/util/Map;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    const-string v6, "<get-key>(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Ljava/lang/String;

    const-string/jumbo v6, "RTCTransport"

    invoke-static {v5, v6, v0, v3, v4}, Lkotlin/text/t;->P(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_0

    :cond_2
    move-object v2, v4

    :goto_0
    check-cast v2, Ljava/util/Map$Entry;

    if-eqz v2, :cond_6

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/webrtc/RTCStats;

    if-eqz v1, :cond_6

    const-string/jumbo v2, "selectedCandidatePairId"

    invoke-direct {p0, v1, v2}, Ltb/N;->b0(Lorg/webrtc/RTCStats;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/webrtc/RTCStats;

    if-eqz v1, :cond_6

    const-string/jumbo v2, "localCandidateId"

    invoke-direct {p0, v1, v2}, Ltb/N;->b0(Lorg/webrtc/RTCStats;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/webrtc/RTCStats;

    if-eqz v2, :cond_6

    const-string/jumbo v5, "remoteCandidateId"

    invoke-direct {p0, v1, v5}, Ltb/N;->b0(Lorg/webrtc/RTCStats;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/webrtc/RTCStats;

    if-eqz p1, :cond_6

    const-string/jumbo v1, "candidateType"

    invoke-direct {p0, v2, v1}, Ltb/N;->b0(Lorg/webrtc/RTCStats;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_3

    return v0

    :cond_3
    invoke-direct {p0, p1, v1}, Ltb/N;->b0(Lorg/webrtc/RTCStats;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_4

    return v0

    :cond_4
    const-string/jumbo v1, "relay"

    invoke-static {v2, v1, v0, v3, v4}, Lkotlin/text/t;->W(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    invoke-static {p1, v1, v0, v3, v4}, Lkotlin/text/t;->W(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    :cond_5
    const/4 v0, 0x1

    :cond_6
    return v0
.end method

.method public static synthetic g(Ltb/N;Lorg/webrtc/MediaStream;)V
    .locals 0

    invoke-static {p0, p1}, Ltb/N;->k0(Ltb/N;Lorg/webrtc/MediaStream;)V

    return-void
.end method

.method private final g0(Ljava/lang/String;Z)Ltb/f;
    .locals 3

    new-instance v0, Ltb/f;

    sget-object v1, Ltb/N;->D:Lgg/y;

    invoke-direct {v0, p1, v1}, Ltb/f;-><init>(Ljava/lang/String;Lgg/y;)V

    iget-object v2, p0, Ltb/N;->m:Ljava/util/Map;

    invoke-interface {v2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ltb/M;

    invoke-direct {v2, p0, p1}, Ltb/M;-><init>(Ltb/N;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ltb/f;->g(Ltb/f$c;)V

    if-eqz p2, :cond_0

    invoke-direct {p0, v0, p1}, Ltb/N;->q0(Ltb/f;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance p2, Ltb/w;

    invoke-direct {p2, p0, v0, p1}, Ltb/w;-><init>(Ltb/N;Ltb/f;Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Lgg/y;->e(Ljava/lang/Runnable;)Lhg/c;

    :goto_0
    return-object v0
.end method

.method public static synthetic h(Ltb/N;)V
    .locals 0

    invoke-direct {p0}, Ltb/N;->Y()V

    return-void
.end method

.method static synthetic h0(Ltb/N;Ljava/lang/String;ZILjava/lang/Object;)Ltb/f;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, Ltb/N;->g0(Ljava/lang/String;Z)Ltb/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Ltb/N;Lorg/webrtc/DataChannel$State;)V
    .locals 0

    invoke-static {p0, p1}, Ltb/N;->T(Ltb/N;Lorg/webrtc/DataChannel$State;)V

    return-void
.end method

.method private static final i0(Ltb/N;Ljava/lang/String;Lorg/webrtc/DataChannel$State;)V
    .locals 1

    const-string/jumbo v0, "state"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lorg/webrtc/DataChannel$State;->CLOSED:Lorg/webrtc/DataChannel$State;

    if-eq p2, v0, :cond_0

    sget-object v0, Lorg/webrtc/DataChannel$State;->CLOSING:Lorg/webrtc/DataChannel$State;

    if-ne p2, v0, :cond_1

    :cond_0
    iget-object p0, p0, Ltb/N;->m:Ljava/util/Map;

    invoke-interface {p0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public static synthetic j(Ltb/N;Lorg/webrtc/RTCStatsReport;)V
    .locals 0

    invoke-static {p0, p1}, Ltb/N;->X(Ltb/N;Lorg/webrtc/RTCStatsReport;)V

    return-void
.end method

.method private static final j0(Ltb/N;Ltb/f;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ltb/N;->q0(Ltb/f;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic k(Ltb/N;)V
    .locals 0

    invoke-static {p0}, Ltb/N;->o0(Ltb/N;)V

    return-void
.end method

.method private static final k0(Ltb/N;Lorg/webrtc/MediaStream;)V
    .locals 3

    iget-object v0, p0, Ltb/N;->q:Ljava/util/Map;

    invoke-static {v0}, LZg/U;->x(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p1}, Lorg/webrtc/MediaStream;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v0, p0, Ltb/N;->q:Ljava/util/Map;

    iget-object v1, p0, Ltb/N;->r:LFg/a;

    invoke-virtual {v1, v0}, LFg/a;->h(Ljava/lang/Object;)V

    sget-object v0, LSj/a;->a:LSj/a$b;

    iget-object p0, p0, Ltb/N;->q:Ljava/util/Map;

    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result p0

    invoke-virtual {p1}, Lorg/webrtc/MediaStream;->getId()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "onAddStream "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    invoke-virtual {v0, p0, p1}, LSj/a$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic l(Ltb/N;Ljava/lang/String;Lorg/webrtc/DataChannel$State;)V
    .locals 0

    invoke-static {p0, p1, p2}, Ltb/N;->i0(Ltb/N;Ljava/lang/String;Lorg/webrtc/DataChannel$State;)V

    return-void
.end method

.method private static final l0(Ltb/N;)V
    .locals 1

    iget-object v0, p0, Ltb/N;->r:LFg/a;

    iget-object p0, p0, Ltb/N;->q:Ljava/util/Map;

    invoke-virtual {v0, p0}, LFg/a;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic m(Ltb/N;Lgg/t;)V
    .locals 0

    invoke-static {p0, p1}, Ltb/N;->K(Ltb/N;Lgg/t;)V

    return-void
.end method

.method private final m0()V
    .locals 3

    sget-object v0, Ltb/N$c;->SET_REMOTE_SDP_SUCCESS:Ltb/N$c;

    invoke-direct {p0, v0}, Ltb/N;->I(Ltb/N$c;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Ltb/N;->i:Z

    iget-object v0, p0, Ltb/N;->l:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/webrtc/IceCandidate;

    iget-object v2, p0, Ltb/N;->e:Lorg/webrtc/PeerConnection;

    if-eqz v2, :cond_0

    invoke-virtual {v2, v1}, Lorg/webrtc/PeerConnection;->addIceCandidate(Lorg/webrtc/IceCandidate;)Z

    goto :goto_0

    :cond_1
    iget-object v0, p0, Ltb/N;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public static synthetic n(Lorg/webrtc/PeerConnection;)V
    .locals 0

    invoke-static {p0}, Ltb/N;->Z(Lorg/webrtc/PeerConnection;)V

    return-void
.end method

.method private static final n0(Ltb/N;Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Ltb/N;->q:Ljava/util/Map;

    invoke-static {v0}, LZg/U;->x(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v0, p0, Ltb/N;->q:Ljava/util/Map;

    iget-object v1, p0, Ltb/N;->r:LFg/a;

    invoke-virtual {v1, v0}, LFg/a;->h(Ljava/lang/Object;)V

    sget-object v0, LSj/a;->a:LSj/a$b;

    iget-object p0, p0, Ltb/N;->q:Ljava/util/Map;

    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "onRemoveStream "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    invoke-virtual {v0, p0, p1}, LSj/a$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic o(Ltb/N;)V
    .locals 0

    invoke-static {p0}, Ltb/N;->l0(Ltb/N;)V

    return-void
.end method

.method private static final o0(Ltb/N;)V
    .locals 1

    iget-object v0, p0, Ltb/N;->r:LFg/a;

    iget-object p0, p0, Ltb/N;->q:Ljava/util/Map;

    invoke-virtual {v0, p0}, LFg/a;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic p(Ltb/N;)Ltb/f;
    .locals 0

    invoke-static {p0}, Ltb/N;->S(Ltb/N;)Ltb/f;

    move-result-object p0

    return-object p0
.end method

.method private final p0(Ljava/lang/String;Ltb/f;)V
    .locals 3

    sget-object v0, LSj/a;->a:LSj/a$b;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string/jumbo v2, "Setting new remote description"

    invoke-virtual {v0, v2, v1}, LSj/a$b;->o(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Lorg/webrtc/SessionDescription;

    sget-object v1, Lorg/webrtc/SessionDescription$Type;->OFFER:Lorg/webrtc/SessionDescription$Type;

    invoke-direct {v0, v1, p1}, Lorg/webrtc/SessionDescription;-><init>(Lorg/webrtc/SessionDescription$Type;Ljava/lang/String;)V

    iget-object p1, p0, Ltb/N;->e:Lorg/webrtc/PeerConnection;

    if-eqz p1, :cond_0

    new-instance v1, Ltb/N$o;

    invoke-direct {v1, p0, p2}, Ltb/N$o;-><init>(Ltb/N;Ltb/f;)V

    invoke-virtual {p1, v1, v0}, Lorg/webrtc/PeerConnection;->setRemoteDescription(Lorg/webrtc/SdpObserver;Lorg/webrtc/SessionDescription;)V

    :cond_0
    return-void
.end method

.method public static synthetic q(Ltb/N;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Ltb/N;->n0(Ltb/N;Ljava/lang/String;)V

    return-void
.end method

.method private final q0(Ltb/f;Ljava/lang/String;)V
    .locals 3

    :try_start_0
    sget-object v0, LYg/u;->b:LYg/u$a;

    invoke-direct {p0, p2}, Ltb/N;->O(Ljava/lang/String;)Lorg/webrtc/DataChannel;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, Ltb/f;->y(Lorg/webrtc/DataChannel;)V

    sget-object v0, LYg/J;->a:LYg/J;

    invoke-static {v0}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/Exception;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not create DataChannel with name \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    sget-object v1, LYg/u;->b:LYg/u$a;

    invoke-static {v0}, LYg/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_1
    invoke-static {v0}, LYg/u;->h(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ltb/N;->m:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ltb/f;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ltb/f;->i()V

    :cond_1
    invoke-virtual {p1}, Ltb/f;->i()V

    :cond_2
    return-void
.end method

.method public static synthetic r(Ltb/m;Ljava/nio/ByteBuffer;)V
    .locals 0

    invoke-static {p0, p1}, Ltb/N;->V(Ltb/m;Ljava/nio/ByteBuffer;)V

    return-void
.end method

.method public static final synthetic s(Ltb/N;Ltb/N$c;)V
    .locals 0

    invoke-direct {p0, p1}, Ltb/N;->I(Ltb/N$c;)V

    return-void
.end method

.method private static final s0(Ltb/f;Ltb/N;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0}, Ltb/f;->i()V

    iget-object p0, p1, Ltb/N;->m:Ljava/util/Map;

    invoke-interface {p0, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic t(Ltb/N;)V
    .locals 0

    invoke-direct {p0}, Ltb/N;->M()V

    return-void
.end method

.method private final t0()Lorg/webrtc/PeerConnection;
    .locals 2

    iget-object v0, p0, Ltb/N;->e:Lorg/webrtc/PeerConnection;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/Exception;

    const-string/jumbo v1, "PeerConnection not initialized"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final synthetic u(Ltb/N;Ltb/f;)V
    .locals 0

    invoke-direct {p0, p1}, Ltb/N;->N(Ltb/f;)V

    return-void
.end method

.method private final u0(Lorg/webrtc/IceCandidate;)V
    .locals 4

    iget-object v0, p0, Ltb/N;->m:Ljava/util/Map;

    const-string/jumbo v1, "ws:/api/ws/webrtc/signaling"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltb/f;

    if-eqz v0, :cond_0

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string/jumbo v1, "type"

    const-string/jumbo v2, "candidate"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v1, p1, Lorg/webrtc/IceCandidate;->sdp:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string/jumbo v1, "sdpMid"

    iget-object v2, p1, Lorg/webrtc/IceCandidate;->sdpMid:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string/jumbo v1, "sdpMLineIndex"

    iget p1, p1, Lorg/webrtc/IceCandidate;->sdpMLineIndex:I

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    sget-object p1, Lkb/c;->a:Lkb/c;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "toString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lkotlin/text/d;->b:Ljava/nio/charset/Charset;

    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    const-string/jumbo v2, "getBytes(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v1

    const-string/jumbo v2, "wrap(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Lkb/c;->b(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object p1

    sget-object v1, LSj/a;->a:LSj/a$b;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "Sending ice candidate to signalling! "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v0, v2}, LSj/a$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Lorg/webrtc/DataChannel$Buffer;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lorg/webrtc/DataChannel$Buffer;-><init>(Ljava/nio/ByteBuffer;Z)V

    invoke-virtual {p0, v0}, Ltb/N;->w0(Lorg/webrtc/DataChannel$Buffer;)V

    :cond_0
    return-void
.end method

.method public static final synthetic v(Ltb/N;)V
    .locals 0

    invoke-direct {p0}, Ltb/N;->W()V

    return-void
.end method

.method private final v0(Lorg/webrtc/SessionDescription;Ltb/f;)V
    .locals 3

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string/jumbo v1, "type"

    const-string/jumbo v2, "answer"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string/jumbo v1, "sdp"

    iget-object p1, p1, Lorg/webrtc/SessionDescription;->description:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    sget-object p1, Lkb/c;->a:Lkb/c;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lkotlin/text/d;->b:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const-string/jumbo v1, "getBytes(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    const-string/jumbo v1, "wrap(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lkb/c;->b(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object p1

    new-instance v0, Lorg/webrtc/DataChannel$Buffer;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lorg/webrtc/DataChannel$Buffer;-><init>(Ljava/nio/ByteBuffer;Z)V

    invoke-virtual {p2, v0}, Ltb/f;->w(Lorg/webrtc/DataChannel$Buffer;)V

    return-void
.end method

.method public static final synthetic w(Ltb/N;)Lgg/s;
    .locals 0

    iget-object p0, p0, Ltb/N;->w:Lgg/s;

    return-object p0
.end method

.method public static final synthetic x(Ltb/N;)Lpb/l;
    .locals 0

    iget-object p0, p0, Ltb/N;->b:Lpb/l;

    return-object p0
.end method

.method private static final x0(Ltb/N;Lorg/webrtc/DataChannel$Buffer;)V
    .locals 1

    iget-object p0, p0, Ltb/N;->m:Ljava/util/Map;

    const-string/jumbo v0, "ws:/api/ws/webrtc/signaling"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ltb/f;

    if-nez p0, :cond_0

    sget-object p0, LSj/a;->a:LSj/a$b;

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string/jumbo v0, "Signalling is null cant send command!"

    invoke-virtual {p0, v0, p1}, LSj/a$b;->o(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Ltb/f;->w(Lorg/webrtc/DataChannel$Buffer;)V

    :goto_0
    return-void
.end method

.method public static final synthetic y(Ltb/N;)Lgg/t;
    .locals 0

    iget-object p0, p0, Ltb/N;->v:Lgg/t;

    return-object p0
.end method

.method private final y0(Lorg/webrtc/SessionDescription;)V
    .locals 2

    iget-object v0, p0, Ltb/N;->e:Lorg/webrtc/PeerConnection;

    if-eqz v0, :cond_0

    new-instance v1, Ltb/N$q;

    invoke-direct {v1}, Ltb/N$q;-><init>()V

    invoke-virtual {v0, v1, p1}, Lorg/webrtc/PeerConnection;->setLocalDescription(Lorg/webrtc/SdpObserver;Lorg/webrtc/SessionDescription;)V

    :cond_0
    return-void
.end method

.method public static final synthetic z(Ltb/N;Lnb/c;)V
    .locals 0

    invoke-direct {p0, p1}, Ltb/N;->c0(Lnb/c;)V

    return-void
.end method

.method private final declared-synchronized z0()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Ltb/N;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    const/4 v0, 0x1

    :try_start_1
    iput-boolean v0, p0, Ltb/N;->h:Z

    sget-object v0, Ltb/N$c;->ICE_GATHERING_COMPLETE:Ltb/N$c;

    invoke-direct {p0, v0}, Ltb/N;->I(Ltb/N$c;)V

    invoke-direct {p0}, Ltb/N;->M()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method


# virtual methods
.method public final B0(Lmh/l;)V
    .locals 0

    iput-object p1, p0, Ltb/N;->p:Lmh/l;

    return-void
.end method

.method public final J()Lgg/s;
    .locals 2

    iget-object v0, p0, Ltb/N;->x:Lgg/s;

    new-instance v1, Ltb/N$g;

    invoke-direct {v1, p0}, Ltb/N$g;-><init>(Ltb/N;)V

    invoke-virtual {v0, v1}, Lgg/s;->F(Lkg/f;)Lgg/s;

    move-result-object v0

    const-string/jumbo v1, "doOnNext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final P(Ljava/lang/String;)Ltb/f;
    .locals 4

    const-string/jumbo v0, "label"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LSj/a;->a:LSj/a$b;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "createDataChannelObserverHub "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v3}, LSj/a$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Ltb/N;->m:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltb/f;

    if-nez v0, :cond_0

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p0, p1, v2, v0, v1}, Ltb/N;->h0(Ltb/N;Ljava/lang/String;ZILjava/lang/Object;)Ltb/f;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final a0()Llb/c;
    .locals 1

    iget-object v0, p0, Ltb/N;->c:Llb/c;

    return-object v0
.end method

.method public final e0()Z
    .locals 1

    iget-boolean v0, p0, Ltb/N;->d:Z

    return v0
.end method

.method public onAddStream(Lorg/webrtc/MediaStream;)V
    .locals 4

    const-string/jumbo v0, "mediaStream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ltb/N;->s:LFg/c;

    new-instance v1, Ltb/h$a;

    invoke-virtual {p1}, Lorg/webrtc/MediaStream;->getId()Ljava/lang/String;

    move-result-object v2

    const-string/jumbo v3, "getId(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v2}, Ltb/h$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LFg/c;->k2(Ljava/lang/Object;)Z

    sget-object v0, Ltb/N;->D:Lgg/y;

    new-instance v1, Ltb/J;

    invoke-direct {v1, p0, p1}, Ltb/J;-><init>(Ltb/N;Lorg/webrtc/MediaStream;)V

    invoke-virtual {v0, v1}, Lgg/y;->e(Ljava/lang/Runnable;)Lhg/c;

    return-void
.end method

.method public onAddTrack(Lorg/webrtc/RtpReceiver;[Lorg/webrtc/MediaStream;)V
    .locals 1

    const-string/jumbo v0, "receiver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p1, "mediaStreams"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Ltb/N;->D:Lgg/y;

    new-instance p2, Ltb/K;

    invoke-direct {p2, p0}, Ltb/K;-><init>(Ltb/N;)V

    invoke-virtual {p1, p2}, Lgg/y;->e(Ljava/lang/Runnable;)Lhg/c;

    return-void
.end method

.method public onDataChannel(Lorg/webrtc/DataChannel;)V
    .locals 2

    const-string/jumbo v0, "dataChannel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, LYg/r;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "An operation is not implemented: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo v1, "not implemented"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, LYg/r;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public onIceCandidate(Lorg/webrtc/IceCandidate;)V
    .locals 4

    const-string/jumbo v0, "candidate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LSj/a;->a:LSj/a$b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "onIceCandidate: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, LSj/a$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Ltb/N;->A:Lhg/c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    iget-boolean v0, p0, Ltb/N;->f:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ltb/N;->b:Lpb/l;

    iget-object v1, p0, Ltb/N;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lpb/l;->w(Ljava/lang/String;Lorg/webrtc/IceCandidate;)V

    :cond_0
    invoke-virtual {p0}, Ltb/N;->e0()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, p1}, Ltb/N;->u0(Lorg/webrtc/IceCandidate;)V

    :cond_1
    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object p1

    new-instance v0, Ltb/I;

    invoke-direct {v0, p0}, Ltb/I;-><init>(Ltb/N;)V

    const-wide/16 v1, 0x3

    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2, v3}, Lgg/y;->f(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lhg/c;

    move-result-object p1

    iput-object p1, p0, Ltb/N;->A:Lhg/c;

    return-void
.end method

.method public onIceCandidatesRemoved([Lorg/webrtc/IceCandidate;)V
    .locals 3

    const-string/jumbo v0, "candidates"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LSj/a;->a:LSj/a$b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "onIceCandidatesRemoved candidates: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v1}, LSj/a$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public onIceConnectionChange(Lorg/webrtc/PeerConnection$IceConnectionState;)V
    .locals 3

    const-string/jumbo v0, "newState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ltb/N$d;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Ltb/N$c;->NONE:Ltb/N$c;

    invoke-direct {p0, v0}, Ltb/N;->I(Ltb/N$c;)V

    iget-object v0, p0, Ltb/N;->v:Lgg/t;

    if-nez v0, :cond_1

    const-string/jumbo v0, "stateEmitter"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_1
    new-instance v1, Lcom/ui/unifi/core/base/net/webrtc/WebRtcClientDisconnectedException;

    invoke-direct {v1}, Lcom/ui/unifi/core/base/net/webrtc/WebRtcClientDisconnectedException;-><init>()V

    invoke-interface {v0, v1}, Lgg/t;->c(Ljava/lang/Throwable;)Z

    :goto_0
    sget-object v0, LSj/a;->a:LSj/a$b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "onIceConnectionChange newState: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v1}, LSj/a$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public onIceConnectionReceivingChange(Z)V
    .locals 3

    sget-object v0, LSj/a;->a:LSj/a$b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "onIceConnectionReceivingChange receiving: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v1}, LSj/a$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public onIceGatheringChange(Lorg/webrtc/PeerConnection$IceGatheringState;)V
    .locals 3

    const-string/jumbo v0, "newState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LSj/a;->a:LSj/a$b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "onIceGatheringChange newState: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, LSj/a$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v0, Lorg/webrtc/PeerConnection$IceGatheringState;->COMPLETE:Lorg/webrtc/PeerConnection$IceGatheringState;

    if-ne p1, v0, :cond_0

    invoke-direct {p0}, Ltb/N;->z0()V

    :cond_0
    return-void
.end method

.method public onRemoveStream(Lorg/webrtc/MediaStream;)V
    .locals 2

    const-string/jumbo v0, "mediaStream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lorg/webrtc/MediaStream;->getId()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ltb/N;->s:LFg/c;

    new-instance v1, Ltb/h$b;

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {v1, p1}, Ltb/h$b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LFg/c;->k2(Ljava/lang/Object;)Z

    sget-object v0, Ltb/N;->D:Lgg/y;

    new-instance v1, Ltb/G;

    invoke-direct {v1, p0, p1}, Ltb/G;-><init>(Ltb/N;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lgg/y;->e(Ljava/lang/Runnable;)Lhg/c;

    return-void
.end method

.method public onRemoveTrack(Lorg/webrtc/RtpReceiver;)V
    .locals 1

    sget-object p1, Ltb/N;->D:Lgg/y;

    new-instance v0, Ltb/H;

    invoke-direct {v0, p0}, Ltb/H;-><init>(Ltb/N;)V

    invoke-virtual {p1, v0}, Lgg/y;->e(Ljava/lang/Runnable;)Lhg/c;

    return-void
.end method

.method public onRenegotiationNeeded()V
    .locals 3

    sget-object v0, LSj/a;->a:LSj/a$b;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string/jumbo v2, "onRenegotiationNeeded"

    invoke-virtual {v0, v2, v1}, LSj/a$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public onSignalingChange(Lorg/webrtc/PeerConnection$SignalingState;)V
    .locals 3

    const-string/jumbo v0, "newState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LSj/a;->a:LSj/a$b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "onSignalingChange newState: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v1}, LSj/a$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public onTrack(Lorg/webrtc/RtpTransceiver;)V
    .locals 5

    invoke-super {p0, p1}, Lorg/webrtc/PeerConnection$Observer;->onTrack(Lorg/webrtc/RtpTransceiver;)V

    sget-object v0, LSj/a;->a:LSj/a$b;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lorg/webrtc/RtpTransceiver;->getReceiver()Lorg/webrtc/RtpReceiver;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lorg/webrtc/RtpReceiver;->id()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "onTrack "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3}, LSj/a$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lorg/webrtc/RtpTransceiver;->getMediaType()Lorg/webrtc/MediaStreamTrack$MediaType;

    move-result-object v1

    :cond_1
    sget-object v0, Lorg/webrtc/MediaStreamTrack$MediaType;->MEDIA_TYPE_AUDIO:Lorg/webrtc/MediaStreamTrack$MediaType;

    if-ne v1, v0, :cond_2

    sget-object v0, Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;->SEND_RECV:Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;

    invoke-virtual {p1, v0}, Lorg/webrtc/RtpTransceiver;->setDirection(Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;)Z

    :cond_2
    return-void
.end method

.method public final r0(Ljava/lang/String;)V
    .locals 3

    const-string/jumbo v0, "label"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ltb/N;->m:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltb/f;

    if-eqz v0, :cond_0

    sget-object v1, Ltb/N;->D:Lgg/y;

    new-instance v2, Ltb/D;

    invoke-direct {v2, v0, p0, p1}, Ltb/D;-><init>(Ltb/f;Ltb/N;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lgg/y;->e(Ljava/lang/Runnable;)Lhg/c;

    :cond_0
    return-void
.end method

.method public final w0(Lorg/webrtc/DataChannel$Buffer;)V
    .locals 2

    const-string/jumbo v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ltb/N;->D:Lgg/y;

    new-instance v1, Ltb/C;

    invoke-direct {v1, p0, p1}, Ltb/C;-><init>(Ltb/N;Lorg/webrtc/DataChannel$Buffer;)V

    invoke-virtual {v0, v1}, Lgg/y;->e(Ljava/lang/Runnable;)Lhg/c;

    return-void
.end method
