.class public final Lzt2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final a:Ll92;

.field public final b:Landroid/content/Context;

.field public final c:Lmv2;

.field public final d:Ljz2;

.field public final e:Ljava/util/concurrent/Executor;

.field public final f:Lvs1;

.field public final g:Le51;

.field public final h:Leb3;

.field public final i:Lpz2;

.field public final j:Lm83;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lvs1;Le51;Ll92;Ljz2;Leb3;Lmv2;Lpz2;Lm83;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lzt2;->b:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lzt2;->e:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    iput-object p3, p0, Lzt2;->f:Lvs1;

    .line 9
    .line 10
    iput-object p4, p0, Lzt2;->g:Le51;

    .line 11
    .line 12
    iput-object p5, p0, Lzt2;->a:Ll92;

    .line 13
    .line 14
    iput-object p6, p0, Lzt2;->d:Ljz2;

    .line 15
    .line 16
    iput-object p7, p0, Lzt2;->h:Leb3;

    .line 17
    .line 18
    iput-object p8, p0, Lzt2;->c:Lmv2;

    .line 19
    .line 20
    iput-object p9, p0, Lzt2;->i:Lpz2;

    .line 21
    .line 22
    iput-object p10, p0, Lzt2;->j:Lm83;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 11

    .line 1
    new-instance v1, Lau2;

    .line 2
    .line 3
    invoke-direct {v1, p0}, Lau2;-><init>(Lzt2;)V

    .line 4
    .line 5
    .line 6
    monitor-enter v1

    .line 7
    :try_start_0
    sget-object v0, Lmz1;->e4:Liz1;

    .line 8
    .line 9
    sget-object v2, Ltw1;->e:Ltw1;

    .line 10
    .line 11
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 12
    .line 13
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    move-object v10, v0

    .line 18
    check-cast v10, Ljava/lang/String;

    .line 19
    .line 20
    iget-object v4, v1, Lau2;->f:Lvs1;

    .line 21
    .line 22
    iget-object v6, v1, Lau2;->b:Ll92;

    .line 23
    .line 24
    iget-object v7, v1, Lau2;->k:Lpz2;

    .line 25
    .line 26
    iget-object v3, v1, Lau2;->c:Landroid/content/Context;

    .line 27
    .line 28
    iget-object v8, v1, Lau2;->l:Lm83;

    .line 29
    .line 30
    iget-object v5, v1, Lau2;->g:Le51;

    .line 31
    .line 32
    iget-object v9, v1, Lau2;->d:Lmv2;

    .line 33
    .line 34
    new-instance v2, Lgi1;

    .line 35
    .line 36
    invoke-direct/range {v2 .. v10}, Lgi1;-><init>(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    sget-object v0, Lmd2;->f:Lld2;

    .line 40
    .line 41
    invoke-static {v2, v0}, Lpu1;->H(Lxp3;Ljava/util/concurrent/Executor;)Lar3;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    new-instance v2, Lvn1;

    .line 46
    .line 47
    const/4 v3, 0x2

    .line 48
    invoke-direct {v2, v3, v1}, Lvn1;-><init>(ILjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object v3, v1, Lau2;->e:Ljava/util/concurrent/Executor;

    .line 52
    .line 53
    invoke-static {v0, v2, v3}, Lpu1;->P(Ln70;Lzk3;Ljava/util/concurrent/Executor;)Lrp3;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-object v0, v1, Lau2;->m:Lrp3;

    .line 58
    .line 59
    const-string v2, "NativeJavascriptExecutor.initializeEngine"

    .line 60
    .line 61
    invoke-static {v0, v2}, Lum;->F(Ln70;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    .line 63
    .line 64
    monitor-exit v1

    .line 65
    return-object v1

    .line 66
    :catchall_0
    move-exception v0

    .line 67
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    throw v0
.end method
