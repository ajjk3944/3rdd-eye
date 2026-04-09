.class public final Lx03;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lqq2;


# instance fields
.field public f:Z

.field public final g:Ljava/lang/Object;

.field public final h:Ljava/lang/Object;

.field public final i:Ljava/lang/Object;

.field public final j:Ljava/lang/Object;

.field public final k:Ljava/lang/Object;

.field public final l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;

.field public n:Ljava/lang/Object;

.field public o:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lx03;->g:Ljava/lang/Object;

    new-instance v0, Ljava/util/HashMap;

    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lx03;->h:Ljava/lang/Object;

    new-instance v0, Ljava/util/HashMap;

    .line 4
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lx03;->i:Ljava/lang/Object;

    new-instance v0, Ljava/util/HashSet;

    .line 5
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lx03;->j:Ljava/lang/Object;

    new-instance v0, Ljava/util/HashSet;

    .line 6
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lx03;->k:Ljava/lang/Object;

    new-instance v0, Ljava/util/HashSet;

    .line 7
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lx03;->l:Ljava/lang/Object;

    new-instance v0, Ljava/util/HashMap;

    .line 8
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lx03;->m:Ljava/lang/Object;

    new-instance v0, Ljava/util/HashSet;

    .line 9
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lx03;->n:Ljava/lang/Object;

    new-instance v0, Ljava/util/WeakHashMap;

    .line 10
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lx03;->o:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Le51;Lpd2;La83;Lag2;Ll83;ZLe42;Lpz2;Lmv2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx03;->g:Ljava/lang/Object;

    iput-object p2, p0, Lx03;->h:Ljava/lang/Object;

    iput-object p3, p0, Lx03;->i:Ljava/lang/Object;

    iput-object p4, p0, Lx03;->j:Ljava/lang/Object;

    iput-object p5, p0, Lx03;->k:Ljava/lang/Object;

    iput-object p6, p0, Lx03;->l:Ljava/lang/Object;

    iput-object p8, p0, Lx03;->m:Ljava/lang/Object;

    iput-boolean p7, p0, Lx03;->f:Z

    iput-object p9, p0, Lx03;->n:Ljava/lang/Object;

    iput-object p10, p0, Lx03;->o:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ler3;Landroid/content/Intent;)V
    .locals 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lx03;->k:Ljava/lang/Object;

    iput-object p1, p0, Lx03;->g:Ljava/lang/Object;

    iput-object p2, p0, Lx03;->i:Ljava/lang/Object;

    const-string p1, "OverlayDisplayService"

    iput-object p1, p0, Lx03;->j:Ljava/lang/Object;

    iput-object p3, p0, Lx03;->l:Ljava/lang/Object;

    new-instance p1, Lsu2;

    const/16 p2, 0xc

    .line 12
    invoke-direct {p1, p2}, Lsu2;-><init>(I)V

    .line 13
    invoke-static {p1}, Li41;->I(Lll3;)Lll3;

    move-result-object p1

    iput-object p1, p0, Lx03;->h:Ljava/lang/Object;

    new-instance p1, Ltk3;

    invoke-direct {p1, p0}, Ltk3;-><init>(Lx03;)V

    iput-object p1, p0, Lx03;->m:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lit3;Lin2;Landroid/media/AudioDeviceInfo;)V
    .locals 1

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lx03;->g:Ljava/lang/Object;

    .line 15
    iput-object p2, p0, Lx03;->h:Ljava/lang/Object;

    iput-object p3, p0, Lx03;->o:Ljava/lang/Object;

    iput-object p4, p0, Lx03;->n:Ljava/lang/Object;

    .line 16
    sget-object p2, Lv23;->a:Ljava/lang/String;

    .line 17
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p2

    if-eqz p2, :cond_0

    goto :goto_0

    .line 18
    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    .line 19
    :goto_0
    new-instance p3, Landroid/os/Handler;

    const/4 p4, 0x0

    .line 20
    invoke-direct {p3, p2, p4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object p3, p0, Lx03;->i:Ljava/lang/Object;

    .line 21
    new-instance p2, Lbe4;

    invoke-direct {p2, p0}, Lbe4;-><init>(Lx03;)V

    iput-object p2, p0, Lx03;->j:Ljava/lang/Object;

    new-instance p2, Ld6;

    const/16 v0, 0x8

    .line 22
    invoke-direct {p2, v0, p0}, Ld6;-><init>(ILjava/lang/Object;)V

    iput-object p2, p0, Lx03;->k:Ljava/lang/Object;

    .line 23
    sget-object p2, Lae4;->c:Lae4;

    .line 24
    sget-object p2, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    const-string v0, "Amazon"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "Xiaomi"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    move-object p2, p4

    goto :goto_2

    .line 25
    :cond_2
    :goto_1
    const-string p2, "external_surround_sound_enabled"

    .line 26
    invoke-static {p2}, Landroid/provider/Settings$Global;->getUriFor(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    :goto_2
    if-eqz p2, :cond_3

    .line 27
    new-instance p4, Lce4;

    .line 28
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    invoke-direct {p4, p0, p3, p1, p2}, Lce4;-><init>(Lx03;Landroid/os/Handler;Landroid/content/ContentResolver;Landroid/net/Uri;)V

    :cond_3
    iput-object p4, p0, Lx03;->l:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Landroid/media/AudioDeviceInfo;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lx03;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/AudioDeviceInfo;

    .line 4
    .line 5
    invoke-static {p1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iput-object p1, p0, Lx03;->n:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v0, p0, Lx03;->g:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Landroid/content/Context;

    .line 17
    .line 18
    iget-object v1, p0, Lx03;->o:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Lin2;

    .line 21
    .line 22
    invoke-static {v0, v1, p1}, Lae4;->a(Landroid/content/Context;Lin2;Landroid/media/AudioDeviceInfo;)Lae4;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p0, p1}, Lx03;->b(Lae4;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public b(Lae4;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lx03;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    iget-object v0, p0, Lx03;->m:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lae4;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Lae4;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_4

    .line 14
    .line 15
    iput-object p1, p0, Lx03;->m:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v0, p0, Lx03;->h:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Lit3;

    .line 20
    .line 21
    iget-object v0, v0, Lit3;->g:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Ldf4;

    .line 24
    .line 25
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iget-object v2, v0, Ldf4;->W:Landroid/os/Looper;

    .line 30
    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    const-string v3, "null"

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    :goto_0
    iget-object v4, v0, Ldf4;->W:Landroid/os/Looper;

    .line 45
    .line 46
    if-nez v4, :cond_1

    .line 47
    .line 48
    const-string v4, "null"

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    invoke-virtual {v4}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-virtual {v4}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    :goto_1
    if-ne v2, v1, :cond_2

    .line 60
    .line 61
    const/4 v1, 0x1

    .line 62
    goto :goto_2

    .line 63
    :cond_2
    const/4 v1, 0x0

    .line 64
    :goto_2
    const-string v2, "Current looper (%s) is not the playback looper (%s)"

    .line 65
    .line 66
    if-eqz v1, :cond_3

    .line 67
    .line 68
    iget-object v1, v0, Ldf4;->s:Lae4;

    .line 69
    .line 70
    if-eqz v1, :cond_4

    .line 71
    .line 72
    invoke-virtual {p1, v1}, Lae4;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-nez v1, :cond_4

    .line 77
    .line 78
    iput-object p1, v0, Ldf4;->s:Lae4;

    .line 79
    .line 80
    iget-object p1, v0, Ldf4;->n:Lbi3;

    .line 81
    .line 82
    if-eqz p1, :cond_4

    .line 83
    .line 84
    iget-object p1, p1, Lbi3;->g:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast p1, Lef4;

    .line 87
    .line 88
    iget-object v0, p1, Lkg4;->f:Ljava/lang/Object;

    .line 89
    .line 90
    monitor-enter v0

    .line 91
    :try_start_0
    iget-object p1, p1, Lkg4;->w:Llj4;

    .line 92
    .line 93
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 94
    if-eqz p1, :cond_4

    .line 95
    .line 96
    iget-object v0, p1, Llj4;->c:Ljava/lang/Object;

    .line 97
    .line 98
    monitor-enter v0

    .line 99
    :try_start_1
    iget-object p1, p1, Llj4;->e:Ldj4;

    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    monitor-exit v0

    .line 105
    return-void

    .line 106
    :catchall_0
    move-exception p1

    .line 107
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 108
    throw p1

    .line 109
    :catchall_1
    move-exception p1

    .line 110
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 111
    throw p1

    .line 112
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 113
    .line 114
    filled-new-array {v3, v4}, [Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-static {v2, v0}, Lqb1;->J(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw p1

    .line 126
    :cond_4
    return-void
.end method

.method public c(Ljava/lang/Runnable;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lx03;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lll3;

    .line 4
    .line 5
    invoke-interface {v0}, Lll3;->a()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/os/Handler;

    .line 10
    .line 11
    new-instance v1, Lvk3;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    invoke-direct {v1, p0, p1, v2}, Lvk3;-><init>(Lx03;Ljava/lang/Runnable;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public d()La83;
    .locals 1

    .line 1
    iget-object v0, p0, Lx03;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La83;

    .line 4
    .line 5
    return-object v0
.end method

.method public q(ZLandroid/content/Context;Lan2;)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lx03;->m:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v2, v0

    .line 6
    check-cast v2, Le42;

    .line 7
    .line 8
    iget-object v0, v1, Lx03;->i:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lpd2;

    .line 11
    .line 12
    invoke-static {v0}, Lpu1;->S(Lpd2;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ldi2;

    .line 17
    .line 18
    iget-object v3, v1, Lx03;->k:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v6, v3

    .line 21
    check-cast v6, Lag2;

    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    invoke-interface {v6, v3}, Lag2;->P0(Z)V

    .line 25
    .line 26
    .line 27
    new-instance v7, Lzb4;

    .line 28
    .line 29
    iget-boolean v4, v1, Lx03;->f:Z

    .line 30
    .line 31
    const/4 v5, 0x0

    .line 32
    if-eqz v4, :cond_0

    .line 33
    .line 34
    invoke-virtual {v2, v5}, Le42;->a(Z)Z

    .line 35
    .line 36
    .line 37
    move-result v8

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move v8, v5

    .line 40
    :goto_0
    sget-object v9, Lhg4;->C:Lhg4;

    .line 41
    .line 42
    iget-object v9, v9, Lhg4;->c:Llf4;

    .line 43
    .line 44
    iget-object v9, v1, Lx03;->g:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v9, Landroid/content/Context;

    .line 47
    .line 48
    invoke-static {v9}, Llf4;->i(Landroid/content/Context;)Z

    .line 49
    .line 50
    .line 51
    move-result v9

    .line 52
    if-eqz v4, :cond_1

    .line 53
    .line 54
    monitor-enter v2

    .line 55
    :try_start_0
    iget-boolean v10, v2, Le42;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    .line 57
    monitor-exit v2

    .line 58
    if-eqz v10, :cond_1

    .line 59
    .line 60
    move v10, v3

    .line 61
    goto :goto_1

    .line 62
    :cond_1
    move v10, v5

    .line 63
    goto :goto_1

    .line 64
    :catchall_0
    move-exception v0

    .line 65
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    throw v0

    .line 67
    :goto_1
    if-eqz v4, :cond_2

    .line 68
    .line 69
    monitor-enter v2

    .line 70
    :try_start_2
    iget v4, v2, Le42;->c:F
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 71
    .line 72
    monitor-exit v2

    .line 73
    :goto_2
    move v11, v4

    .line 74
    goto :goto_3

    .line 75
    :catchall_1
    move-exception v0

    .line 76
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 77
    throw v0

    .line 78
    :cond_2
    const/4 v4, 0x0

    .line 79
    goto :goto_2

    .line 80
    :goto_3
    iget-object v2, v1, Lx03;->j:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v2, La83;

    .line 83
    .line 84
    iget-boolean v13, v2, La83;->O:Z

    .line 85
    .line 86
    const/4 v14, 0x0

    .line 87
    move/from16 v12, p1

    .line 88
    .line 89
    invoke-direct/range {v7 .. v14}, Lzb4;-><init>(ZZZFZZZ)V

    .line 90
    .line 91
    .line 92
    if-eqz p3, :cond_3

    .line 93
    .line 94
    invoke-virtual/range {p3 .. p3}, Lan2;->U1()V

    .line 95
    .line 96
    .line 97
    :cond_3
    new-instance v4, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 98
    .line 99
    iget-object v0, v0, Ldi2;->K:Lba4;

    .line 100
    .line 101
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    move-object v5, v0

    .line 106
    check-cast v5, Loq2;

    .line 107
    .line 108
    move-object v10, v7

    .line 109
    iget v7, v2, La83;->Q:I

    .line 110
    .line 111
    iget-object v0, v1, Lx03;->h:Ljava/lang/Object;

    .line 112
    .line 113
    move-object v8, v0

    .line 114
    check-cast v8, Le51;

    .line 115
    .line 116
    iget-object v9, v2, La83;->B:Ljava/lang/String;

    .line 117
    .line 118
    iget-object v0, v2, La83;->s:Le83;

    .line 119
    .line 120
    iget-object v11, v0, Le83;->b:Ljava/lang/String;

    .line 121
    .line 122
    iget-object v12, v0, Le83;->a:Ljava/lang/String;

    .line 123
    .line 124
    iget-object v0, v1, Lx03;->l:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v0, Ll83;

    .line 127
    .line 128
    invoke-virtual {v2}, La83;->b()Z

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    if-eqz v2, :cond_4

    .line 133
    .line 134
    iget-object v2, v1, Lx03;->n:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v2, Lpz2;

    .line 137
    .line 138
    :goto_4
    move-object v15, v2

    .line 139
    goto :goto_5

    .line 140
    :cond_4
    const/4 v2, 0x0

    .line 141
    goto :goto_4

    .line 142
    :goto_5
    iget-object v13, v0, Ll83;->g:Ljava/lang/String;

    .line 143
    .line 144
    invoke-interface {v6}, Lag2;->o()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v16

    .line 148
    move-object/from16 v14, p3

    .line 149
    .line 150
    invoke-direct/range {v4 .. v16}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;-><init>(Loq2;Lag2;ILe51;Ljava/lang/String;Lzb4;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lan2;Lpz2;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    iget-object v0, v1, Lx03;->o:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v0, Lmv2;

    .line 156
    .line 157
    move-object/from16 v2, p2

    .line 158
    .line 159
    invoke-static {v2, v4, v3, v0}, Ly24;->b(Landroid/content/Context;Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;ZLmv2;)V

    .line 160
    .line 161
    .line 162
    return-void
.end method
