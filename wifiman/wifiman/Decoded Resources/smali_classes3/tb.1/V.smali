.class public final Ltb/V;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltb/V$a;
    }
.end annotation


# static fields
.field public static final a:Ltb/V;

.field private static final b:Lib/h;

.field private static final c:Ljava/util/Map;

.field private static final d:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltb/V;

    invoke-direct {v0}, Ltb/V;-><init>()V

    sput-object v0, Ltb/V;->a:Ltb/V;

    new-instance v0, Lib/h;

    invoke-direct {v0}, Lib/h;-><init>()V

    sput-object v0, Ltb/V;->b:Lib/h;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    sput-object v0, Ltb/V;->c:Ljava/util/Map;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    sput-object v0, Ltb/V;->d:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ltb/u;)Lgg/s;
    .locals 0

    invoke-static {p0}, Ltb/V;->n(Ltb/u;)Lgg/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Ltb/V;->o(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic c(LGb/f;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Ltb/V;->r(LGb/f;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic d(Ljava/lang/String;Llb/b;Lpb/l;Llb/c;ZLmh/l;)Ltb/u;
    .locals 0

    invoke-static/range {p0 .. p5}, Ltb/V;->j(Ljava/lang/String;Llb/b;Lpb/l;Llb/c;ZLmh/l;)Ltb/u;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Ltb/V;Ljava/lang/String;Ltb/N$c;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ltb/V;->p(Ljava/lang/String;Ltb/N$c;)V

    return-void
.end method

.method public static final synthetic f(Ltb/V;Ljava/lang/String;Ljava/lang/String;LGb/f;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ltb/V;->q(Ljava/lang/String;Ljava/lang/String;LGb/f;)V

    return-void
.end method

.method private final g(Ljava/lang/String;Ltb/V$a;)V
    .locals 2

    sget-object v0, Ltb/V;->d:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    check-cast v1, Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    monitor-enter v1

    :try_start_1
    invoke-interface {v1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit v1

    return-void

    :catchall_1
    move-exception p1

    monitor-exit v1

    throw p1

    :goto_1
    monitor-exit v0

    throw p1
.end method

.method private final h(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Ltb/V;->d:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method private final i(Ljava/lang/String;Llb/b;Lpb/l;Llb/c;ZLmh/l;)Lgg/s;
    .locals 8

    new-instance v7, Ltb/U;

    move-object v0, v7

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Ltb/U;-><init>(Ljava/lang/String;Llb/b;Lpb/l;Llb/c;ZLmh/l;)V

    invoke-static {v7}, Lgg/z;->x(Ljava/util/concurrent/Callable;)Lgg/z;

    move-result-object p2

    new-instance p3, Ltb/V$b;

    invoke-direct {p3, p1}, Ltb/V$b;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Lgg/z;->v(Lkg/n;)Lgg/s;

    move-result-object p1

    const-string/jumbo p2, "flatMapObservable(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final j(Ljava/lang/String;Llb/b;Lpb/l;Llb/c;ZLmh/l;)Ltb/u;
    .locals 8

    new-instance v0, Ltb/u;

    sget-object v1, Ltb/V;->a:Ltb/V;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move v6, p4

    move-object v7, p5

    invoke-direct/range {v1 .. v7}, Ltb/V;->k(Ljava/lang/String;Llb/b;Lpb/l;Llb/c;ZLmh/l;)Ltb/N;

    move-result-object p0

    invoke-direct {v0, p0}, Ltb/u;-><init>(Ltb/N;)V

    return-object v0
.end method

.method private final k(Ljava/lang/String;Llb/b;Lpb/l;Llb/c;ZLmh/l;)Ltb/N;
    .locals 6

    invoke-virtual {p2}, Llb/b;->g()Llb/n;

    move-result-object p2

    invoke-virtual {p2}, Llb/n;->c()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lorg/webrtc/PeerConnection$IceServer;->builder(Ljava/util/List;)Lorg/webrtc/PeerConnection$IceServer$Builder;

    move-result-object v0

    invoke-virtual {p2}, Llb/n;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/webrtc/PeerConnection$IceServer$Builder;->setUsername(Ljava/lang/String;)Lorg/webrtc/PeerConnection$IceServer$Builder;

    move-result-object v0

    invoke-virtual {p2}, Llb/n;->b()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lorg/webrtc/PeerConnection$IceServer$Builder;->setPassword(Ljava/lang/String;)Lorg/webrtc/PeerConnection$IceServer$Builder;

    move-result-object p2

    invoke-virtual {p2}, Lorg/webrtc/PeerConnection$IceServer$Builder;->createIceServer()Lorg/webrtc/PeerConnection$IceServer;

    move-result-object p2

    invoke-static {p2}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    new-instance p2, Ltb/N;

    move-object v0, p2

    move-object v2, p1

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v5}, Ltb/N;-><init>(Ljava/util/List;Ljava/lang/String;Lpb/l;Llb/c;Z)V

    invoke-virtual {p2, p6}, Ltb/N;->B0(Lmh/l;)V

    return-object p2
.end method

.method private static final n(Ltb/u;)Lgg/s;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lgg/s;->n0()Lgg/s;

    move-result-object p0

    return-object p0
.end method

.method private static final o(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Ltb/V;->b:Lib/h;

    invoke-virtual {v0}, Lib/h;->j()V

    sget-object v0, Ltb/V;->c:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lgg/s;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    sget-object p1, Ltb/V;->a:Ltb/V;

    invoke-direct {p1, p0}, Ltb/V;->h(Ljava/lang/String;)V

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method private final p(Ljava/lang/String;Ltb/N$c;)V
    .locals 2

    sget-object v0, Ltb/V;->d:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit v0

    if-nez p1, :cond_0

    return-void

    :cond_0
    monitor-enter p1

    :try_start_1
    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ltb/V$a;

    invoke-interface {v1, p2}, Ltb/V$a;->a(Ltb/N$c;)V

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :cond_1
    sget-object p2, LYg/J;->a:LYg/J;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p1

    return-void

    :goto_1
    monitor-exit p1

    throw p2

    :catchall_1
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method private final q(Ljava/lang/String;Ljava/lang/String;LGb/f;)V
    .locals 6

    sget-object v0, Ltb/V;->b:Lib/h;

    invoke-virtual {v0}, Lib/h;->h()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0}, Lib/h;->j()V

    move-object v0, v1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-interface {p3, p2}, LGb/f;->I(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    goto :goto_0

    :cond_0
    const-wide/16 v2, 0x0

    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long/2addr v4, v2

    const-wide/32 v2, 0x36ee80

    cmp-long v0, v4, v2

    if-lez v0, :cond_1

    new-instance v0, Lib/d;

    invoke-direct {v0, p1}, Lib/d;-><init>(Ljava/lang/String;)V

    invoke-interface {p3, p2}, LGb/f;->w(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, v1}, Lib/d;->h(Ljava/lang/String;Ljava/util/List;)Lgg/b;

    move-result-object p1

    new-instance v0, Ltb/T;

    invoke-direct {v0, p3, p2}, Ltb/T;-><init>(LGb/f;Ljava/lang/String;)V

    sget-object p2, Ltb/V$f;->a:Ltb/V$f;

    invoke-virtual {p1, v0, p2}, Lgg/b;->U(Lkg/a;Lkg/f;)Lhg/c;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    sget-object p1, LSj/a;->a:LSj/a$b;

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Object;

    const-string/jumbo p3, "Not sending logs since I already did send some recently!"

    invoke-virtual {p1, p3, p2}, LSj/a$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    :goto_1
    return-void
.end method

.method private static final r(LGb/f;Ljava/lang/String;)V
    .locals 3

    sget-object v0, LSj/a;->a:LSj/a$b;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string/jumbo v2, "Logs sent!"

    invoke-virtual {v0, v2, v1}, LSj/a$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-interface {p0, p1, v0, v1}, LGb/f;->H(Ljava/lang/String;J)V

    return-void
.end method


# virtual methods
.method public final l()Lib/h;
    .locals 1

    sget-object v0, Ltb/V;->b:Lib/h;

    return-object v0
.end method

.method public final m(Ljava/lang/String;Ljava/lang/String;LGb/f;Llb/b;Lpb/l;Llb/c;ZLtb/V$a;Lmh/l;)Lgg/s;
    .locals 13

    move-object v0, p1

    move-object v8, p2

    move-object/from16 v9, p3

    move-object/from16 v1, p8

    const-string/jumbo v2, "appVersion"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v2, "deviceId"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v2, "storage"

    invoke-static {v9, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v2, "cloudCredentials"

    move-object/from16 v3, p4

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v2, "mqttClient"

    move-object/from16 v4, p5

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v2, "meta"

    move-object/from16 v5, p6

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v2, "webRtcConnectionStateListener"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v2, "onConnectionInfoDetermined"

    move-object/from16 v7, p9

    invoke-static {v7, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v10, p0

    invoke-direct {p0, p2, v1}, Ltb/V;->g(Ljava/lang/String;Ltb/V$a;)V

    sget-object v11, Ltb/V;->c:Ljava/util/Map;

    monitor-enter v11

    :try_start_0
    invoke-interface/range {p3 .. p3}, LGb/f;->h()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v11, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    sget-object v1, Ltb/V;->a:Ltb/V;

    move-object v2, p2

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    move/from16 v6, p7

    move-object/from16 v7, p9

    invoke-direct/range {v1 .. v7}, Ltb/V;->i(Ljava/lang/String;Llb/b;Lpb/l;Llb/c;ZLmh/l;)Lgg/s;

    move-result-object v1

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x1e

    invoke-static {v3, v4, v2}, Lgg/s;->b1(JLjava/util/concurrent/TimeUnit;)Lgg/s;

    move-result-object v3

    new-instance v4, Ltb/Q;

    invoke-direct {v4}, Ltb/Q;-><init>()V

    invoke-virtual {v1, v3, v4}, Lgg/s;->Y0(Lgg/v;Lkg/n;)Lgg/s;

    move-result-object v1

    sget-object v3, Ltb/V$c;->a:Ltb/V$c;

    invoke-virtual {v1, v3}, Lgg/s;->G(Lkg/f;)Lgg/s;

    move-result-object v1

    new-instance v3, Ltb/V$d;

    invoke-direct {v3, p1, p2, v9}, Ltb/V$d;-><init>(Ljava/lang/String;Ljava/lang/String;LGb/f;)V

    invoke-virtual {v1, v3}, Lgg/s;->D(Lkg/f;)Lgg/s;

    move-result-object v0

    new-instance v1, Ltb/S;

    invoke-direct {v1, p2, v12}, Ltb/S;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lgg/s;->y(Lkg/a;)Lgg/s;

    move-result-object v0

    sget-object v1, Ltb/V$e;->a:Ltb/V$e;

    invoke-virtual {v0, v1}, Lgg/s;->F(Lkg/f;)Lgg/s;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lgg/s;->x0(I)LBg/a;

    move-result-object v0

    const-wide/16 v3, 0xa

    invoke-virtual {v0, v3, v4, v2}, LBg/a;->n1(JLjava/util/concurrent/TimeUnit;)Lgg/s;

    move-result-object v1

    const-string/jumbo v0, "refCount(...)"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v11, v12, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    check-cast v1, Lgg/s;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v11

    return-object v1

    :goto_1
    monitor-exit v11

    throw v0
.end method
