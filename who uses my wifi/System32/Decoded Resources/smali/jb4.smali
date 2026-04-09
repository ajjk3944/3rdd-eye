.class public final Ljb4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Landroid/os/Handler$Callback;
.implements Lih4;
.implements Lec4;
.implements Lbe1;


# static fields
.field public static final i0:J


# instance fields
.field public final A:Lmd4;

.field public final B:Ld13;

.field public final C:Z

.field public final D:Lr24;

.field public E:Llc4;

.field public F:Lkc4;

.field public G:Z

.field public H:Z

.field public I:Lib4;

.field public J:I

.field public K:Ldc4;

.field public L:Lr60;

.field public M:Z

.field public N:Z

.field public O:Z

.field public P:Z

.field public Q:J

.field public R:Z

.field public S:I

.field public T:Z

.field public U:Z

.field public V:I

.field public W:Lib4;

.field public X:J

.field public Y:J

.field public Z:I

.field public a0:Z

.field public b0:Lb84;

.field public c0:J

.field public d0:Lla4;

.field public e0:J

.field public final f:[Lt71;

.field public f0:Z

.field public final g:[Lkg4;

.field public g0:F

.field public final h:[Z

.field public final h0:Lm44;

.field public final i:Llj4;

.field public final j:Lpj4;

.field public final k:Llb4;

.field public final l:Luj4;

.field public final m:Ld13;

.field public final n:Lr2;

.field public final o:Landroid/os/Looper;

.field public final p:Lez1;

.field public final q:Lsw1;

.field public final r:J

.field public final s:Lg53;

.field public final t:Ljava/util/ArrayList;

.field public final u:Lpz;

.field public final v:Lci3;

.field public final w:Lrb4;

.field public final x:Luu0;

.field public final y:J

.field public final z:Lxd4;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x2710

    .line 2
    .line 3
    invoke-static {v0, v1}, Lv23;->q(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    sput-wide v0, Ljb4;->i0:J

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;[Lkg4;[Lkg4;Llj4;Lpj4;Llb4;Luj4;Lmd4;Llc4;Lm44;JLandroid/os/Looper;Lpz;Lci3;Lxd4;Lla4;)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    move-object/from16 v2, p4

    move-object/from16 v3, p7

    move-object/from16 v4, p8

    move-object/from16 v5, p14

    move-object/from16 v6, p16

    move-object/from16 v7, p17

    .line 1
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v8, v1, Ljb4;->e0:J

    move-object/from16 v10, p15

    iput-object v10, v1, Ljb4;->v:Lci3;

    iput-object v2, v1, Ljb4;->i:Llj4;

    move-object/from16 v10, p5

    iput-object v10, v1, Ljb4;->j:Lpj4;

    move-object/from16 v11, p6

    iput-object v11, v1, Ljb4;->k:Llb4;

    iput-object v3, v1, Ljb4;->l:Luj4;

    const/4 v12, 0x0

    iput v12, v1, Ljb4;->S:I

    iput-boolean v12, v1, Ljb4;->T:Z

    move-object/from16 v13, p9

    iput-object v13, v1, Ljb4;->E:Llc4;

    move-object/from16 v13, p10

    iput-object v13, v1, Ljb4;->h0:Lm44;

    move-wide/from16 v13, p11

    iput-wide v13, v1, Ljb4;->y:J

    iput-boolean v12, v1, Ljb4;->N:Z

    iput-object v5, v1, Ljb4;->u:Lpz;

    iput-object v6, v1, Ljb4;->z:Lxd4;

    iput-object v7, v1, Ljb4;->d0:Lla4;

    iput-object v4, v1, Ljb4;->A:Lmd4;

    const/high16 v13, 0x3f800000    # 1.0f

    iput v13, v1, Ljb4;->g0:F

    sget-object v13, Lkc4;->b:Lkc4;

    iput-object v13, v1, Ljb4;->F:Lkc4;

    iput-wide v8, v1, Ljb4;->c0:J

    iput-wide v8, v1, Ljb4;->Q:J

    .line 2
    invoke-interface {v11}, Llb4;->c()J

    move-result-wide v8

    iput-wide v8, v1, Ljb4;->r:J

    .line 3
    sget-object v8, Loz1;->a:Law1;

    .line 4
    invoke-static {v10}, Ldc4;->a(Lpj4;)Ldc4;

    move-result-object v8

    iput-object v8, v1, Ljb4;->K:Ldc4;

    new-instance v9, Lr60;

    invoke-direct {v9, v8}, Lr60;-><init>(Ldc4;)V

    iput-object v9, v1, Ljb4;->L:Lr60;

    .line 5
    array-length v8, v0

    const/4 v8, 0x2

    new-array v9, v8, [Lkg4;

    iput-object v9, v1, Ljb4;->g:[Lkg4;

    new-array v9, v8, [Z

    iput-object v9, v1, Ljb4;->h:[Z

    .line 6
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-array v9, v8, [Lt71;

    iput-object v9, v1, Ljb4;->f:[Lt71;

    move v9, v12

    move v10, v9

    :goto_0
    const/4 v11, 0x1

    if-ge v9, v8, :cond_1

    .line 7
    aget-object v13, v0, v9

    .line 8
    iput v9, v13, Lkg4;->j:I

    iput-object v6, v13, Lkg4;->k:Lxd4;

    iput-object v5, v13, Lkg4;->l:Lpz;

    .line 9
    iget-object v14, v1, Ljb4;->g:[Lkg4;

    .line 10
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    aput-object v13, v14, v9

    iget-object v13, v1, Ljb4;->g:[Lkg4;

    .line 11
    aget-object v13, v13, v9

    .line 12
    iget-object v14, v13, Lkg4;->f:Ljava/lang/Object;

    monitor-enter v14

    :try_start_0
    iput-object v2, v13, Lkg4;->w:Llj4;

    monitor-exit v14
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    aget-object v13, p3, v9

    if-eqz v13, :cond_0

    .line 14
    iput v9, v13, Lkg4;->j:I

    iput-object v6, v13, Lkg4;->k:Lxd4;

    iput-object v5, v13, Lkg4;->l:Lpz;

    move v10, v11

    .line 15
    :cond_0
    iget-object v11, v1, Ljb4;->f:[Lt71;

    new-instance v14, Lt71;

    .line 16
    aget-object v15, v0, v9

    .line 17
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    iput-object v15, v14, Lt71;->e:Ljava/lang/Object;

    iput v9, v14, Lt71;->a:I

    iput-object v13, v14, Lt71;->f:Ljava/lang/Object;

    iput v12, v14, Lt71;->b:I

    iput-boolean v12, v14, Lt71;->c:Z

    iput-boolean v12, v14, Lt71;->d:Z

    .line 18
    aput-object v14, v11, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 19
    :try_start_1
    monitor-exit v14
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 20
    :cond_1
    iput-boolean v10, v1, Ljb4;->C:Z

    new-instance v0, Lg53;

    .line 21
    invoke-direct {v0, v1}, Lg53;-><init>(Ljb4;)V

    iput-object v0, v1, Ljb4;->s:Lg53;

    new-instance v0, Ljava/util/ArrayList;

    .line 22
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, v1, Ljb4;->t:Ljava/util/ArrayList;

    .line 23
    new-instance v0, Lez1;

    invoke-direct {v0}, Lez1;-><init>()V

    iput-object v0, v1, Ljb4;->p:Lez1;

    .line 24
    new-instance v0, Lsw1;

    invoke-direct {v0}, Lsw1;-><init>()V

    iput-object v0, v1, Ljb4;->q:Lsw1;

    .line 25
    iget-object v0, v2, Llj4;->a:Ljb4;

    if-nez v0, :cond_2

    move v0, v11

    goto :goto_1

    :cond_2
    move v0, v12

    :goto_1
    invoke-static {v0}, Lzt0;->b0(Z)V

    iput-object v1, v2, Llj4;->a:Ljb4;

    iput-object v3, v2, Llj4;->b:Luj4;

    .line 26
    iput-boolean v11, v1, Ljb4;->a0:Z

    const/4 v0, 0x0

    move-object/from16 v2, p13

    .line 27
    invoke-virtual {v5, v2, v0}, Lpz;->p(Landroid/os/Looper;Landroid/os/Handler$Callback;)Ld13;

    move-result-object v0

    iput-object v0, v1, Ljb4;->B:Ld13;

    new-instance v2, Lrb4;

    new-instance v3, Lx34;

    invoke-direct {v3, v1}, Lx34;-><init>(Ljava/lang/Object;)V

    .line 28
    invoke-direct {v2, v4, v0, v3, v7}, Lrb4;-><init>(Lmd4;Ld13;Lx34;Lla4;)V

    iput-object v2, v1, Ljb4;->w:Lrb4;

    new-instance v2, Luu0;

    .line 29
    invoke-direct {v2, v1, v4, v0, v6}, Luu0;-><init>(Ljb4;Lmd4;Ld13;Lxd4;)V

    iput-object v2, v1, Ljb4;->x:Luu0;

    new-instance v0, Lr2;

    const/4 v2, 0x6

    invoke-direct {v0, v2}, Lr2;-><init>(I)V

    iput-object v0, v1, Ljb4;->n:Lr2;

    .line 30
    iget-object v2, v0, Lr2;->h:Ljava/lang/Object;

    monitor-enter v2

    :try_start_2
    iget-object v3, v0, Lr2;->i:Ljava/lang/Object;

    check-cast v3, Landroid/os/Looper;

    if-nez v3, :cond_4

    iget v3, v0, Lr2;->g:I

    if-nez v3, :cond_3

    iget-object v3, v0, Lr2;->j:Ljava/lang/Object;

    check-cast v3, Landroid/os/HandlerThread;

    if-nez v3, :cond_3

    move v12, v11

    :cond_3
    invoke-static {v12}, Lzt0;->b0(Z)V

    new-instance v3, Landroid/os/HandlerThread;

    const-string v4, "ExoPlayer:Playback"

    const/16 v6, -0x10

    .line 31
    invoke-direct {v3, v4, v6}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    iput-object v3, v0, Lr2;->j:Ljava/lang/Object;

    .line 32
    invoke-virtual {v3}, Ljava/lang/Thread;->start()V

    iget-object v3, v0, Lr2;->j:Ljava/lang/Object;

    check-cast v3, Landroid/os/HandlerThread;

    .line 33
    invoke-virtual {v3}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v3

    iput-object v3, v0, Lr2;->i:Ljava/lang/Object;

    goto :goto_2

    :catchall_1
    move-exception v0

    goto :goto_3

    :cond_4
    :goto_2
    iget v3, v0, Lr2;->g:I

    add-int/2addr v3, v11

    iput v3, v0, Lr2;->g:I

    iget-object v0, v0, Lr2;->i:Ljava/lang/Object;

    check-cast v0, Landroid/os/Looper;

    .line 34
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 35
    iput-object v0, v1, Ljb4;->o:Landroid/os/Looper;

    .line 36
    invoke-virtual {v5, v0, v1}, Lpz;->p(Landroid/os/Looper;Landroid/os/Handler$Callback;)Ld13;

    move-result-object v2

    iput-object v2, v1, Ljb4;->m:Ld13;

    new-instance v3, Lr24;

    move-object/from16 v4, p1

    .line 37
    invoke-direct {v3, v4, v0, v1}, Lr24;-><init>(Landroid/content/Context;Landroid/os/Looper;Ljb4;)V

    iput-object v3, v1, Ljb4;->D:Lr24;

    new-instance v0, Lab4;

    invoke-direct {v0, v1}, Lab4;-><init>(Ljb4;)V

    const/16 v3, 0x23

    .line 38
    invoke-virtual {v2, v3, v0}, Ld13;->a(ILjava/lang/Object;)Lv03;

    move-result-object v0

    .line 39
    invoke-virtual {v0}, Lv03;->a()V

    return-void

    .line 40
    :goto_3
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0
.end method

.method public static final A(Lpb4;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_4

    .line 3
    .line 4
    :try_start_0
    iget-object v1, p0, Lpb4;->a:Ljava/lang/Object;

    .line 5
    .line 6
    iget-boolean v2, p0, Lpb4;->e:Z

    .line 7
    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    invoke-interface {v1}, Ljh4;->r()V

    .line 11
    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    iget-object v2, p0, Lpb4;->c:[Lli4;

    .line 15
    .line 16
    move v3, v0

    .line 17
    :goto_0
    const/4 v4, 0x2

    .line 18
    if-ge v3, v4, :cond_2

    .line 19
    .line 20
    aget-object v4, v2, v3

    .line 21
    .line 22
    if-eqz v4, :cond_1

    .line 23
    .line 24
    invoke-interface {v4}, Lli4;->h()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    .line 27
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    :goto_1
    iget-boolean p0, p0, Lpb4;->e:Z

    .line 31
    .line 32
    if-nez p0, :cond_3

    .line 33
    .line 34
    const-wide/16 v1, 0x0

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_3
    invoke-interface {v1}, Lmi4;->i()J

    .line 38
    .line 39
    .line 40
    move-result-wide v1

    .line 41
    :goto_2
    const-wide/high16 v3, -0x8000000000000000L

    .line 42
    .line 43
    cmp-long p0, v1, v3

    .line 44
    .line 45
    if-eqz p0, :cond_4

    .line 46
    .line 47
    const/4 p0, 0x1

    .line 48
    return p0

    .line 49
    :catch_0
    :cond_4
    return v0
.end method

.method public static W(Lez1;Lsw1;IZLjava/lang/Object;Loz1;Loz1;)I
    .locals 12

    .line 1
    move-object v3, p0

    .line 2
    move-object v2, p1

    .line 3
    move-object/from16 v0, p4

    .line 4
    .line 5
    move-object/from16 v1, p5

    .line 6
    .line 7
    move-object/from16 v6, p6

    .line 8
    .line 9
    invoke-virtual {v1, v0, p1}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    iget v4, v4, Lsw1;->c:I

    .line 14
    .line 15
    const-wide/16 v7, 0x0

    .line 16
    .line 17
    invoke-virtual {v1, v4, p0, v7, v8}, Loz1;->b(ILez1;J)Lez1;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    iget-object v4, v4, Lez1;->a:Ljava/lang/Object;

    .line 22
    .line 23
    const/4 v9, 0x0

    .line 24
    move v5, v9

    .line 25
    :goto_0
    invoke-virtual {v6}, Loz1;->a()I

    .line 26
    .line 27
    .line 28
    move-result v10

    .line 29
    if-ge v5, v10, :cond_1

    .line 30
    .line 31
    invoke-virtual {v6, v5, p0, v7, v8}, Loz1;->b(ILez1;J)Lez1;

    .line 32
    .line 33
    .line 34
    move-result-object v10

    .line 35
    iget-object v10, v10, Lez1;->a:Ljava/lang/Object;

    .line 36
    .line 37
    invoke-virtual {v10, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v10

    .line 41
    if-eqz v10, :cond_0

    .line 42
    .line 43
    return v5

    .line 44
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-virtual {v1, v0}, Loz1;->e(Ljava/lang/Object;)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    invoke-virtual {v1}, Loz1;->c()I

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    const/4 v8, -0x1

    .line 56
    move v11, v8

    .line 57
    move v10, v9

    .line 58
    :goto_1
    if-ge v10, v7, :cond_3

    .line 59
    .line 60
    if-ne v11, v8, :cond_3

    .line 61
    .line 62
    move-object v4, v1

    .line 63
    move v1, v0

    .line 64
    move-object v0, v4

    .line 65
    move v4, p2

    .line 66
    move v5, p3

    .line 67
    invoke-virtual/range {v0 .. v5}, Loz1;->l(ILsw1;Lez1;IZ)I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-ne v1, v8, :cond_2

    .line 72
    .line 73
    move v11, v8

    .line 74
    goto :goto_2

    .line 75
    :cond_2
    invoke-virtual {v0, v1}, Loz1;->f(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-virtual {v6, v3}, Loz1;->e(Ljava/lang/Object;)I

    .line 80
    .line 81
    .line 82
    move-result v11

    .line 83
    add-int/lit8 v10, v10, 0x1

    .line 84
    .line 85
    move v3, v1

    .line 86
    move-object v1, v0

    .line 87
    move v0, v3

    .line 88
    move-object v3, p0

    .line 89
    goto :goto_1

    .line 90
    :cond_3
    :goto_2
    if-ne v11, v8, :cond_4

    .line 91
    .line 92
    return v8

    .line 93
    :cond_4
    invoke-virtual {v6, v11, p1, v9}, Loz1;->d(ILsw1;Z)Lsw1;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    iget v0, v0, Lsw1;->c:I

    .line 98
    .line 99
    return v0
.end method

.method public static z(Loz1;Lib4;IZLez1;Lsw1;)Landroid/util/Pair;
    .locals 10

    .line 1
    iget-object v0, p1, Lib4;->a:Loz1;

    .line 2
    .line 3
    invoke-virtual {p0}, Loz1;->g()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_2

    .line 10
    .line 11
    :cond_0
    const/4 v1, 0x1

    .line 12
    invoke-virtual {v0}, Loz1;->g()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-ne v1, v2, :cond_1

    .line 17
    .line 18
    move-object v3, p0

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    move-object v3, v0

    .line 21
    :goto_0
    :try_start_0
    iget v6, p1, Lib4;->b:I

    .line 22
    .line 23
    iget-wide v7, p1, Lib4;->c:J

    .line 24
    .line 25
    move-object v4, p4

    .line 26
    move-object v5, p5

    .line 27
    invoke-virtual/range {v3 .. v8}, Loz1;->m(Lez1;Lsw1;IJ)Landroid/util/Pair;

    .line 28
    .line 29
    .line 30
    move-result-object p4
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    move-object v6, v5

    .line 32
    move-object v5, v4

    .line 33
    invoke-virtual {p0, v3}, Loz1;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p5

    .line 37
    if-eqz p5, :cond_2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    iget-object p5, p4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 41
    .line 42
    invoke-virtual {p0, p5}, Loz1;->e(Ljava/lang/Object;)I

    .line 43
    .line 44
    .line 45
    move-result p5

    .line 46
    const/4 v0, -0x1

    .line 47
    if-eq p5, v0, :cond_4

    .line 48
    .line 49
    iget-object p2, p4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 50
    .line 51
    invoke-virtual {v3, p2, v6}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    iget-boolean p2, p2, Lsw1;->e:Z

    .line 56
    .line 57
    if-eqz p2, :cond_3

    .line 58
    .line 59
    iget p2, v6, Lsw1;->c:I

    .line 60
    .line 61
    const-wide/16 v0, 0x0

    .line 62
    .line 63
    invoke-virtual {v3, p2, v5, v0, v1}, Loz1;->b(ILez1;J)Lez1;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    iget p2, p2, Lez1;->k:I

    .line 68
    .line 69
    iget-object p3, p4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 70
    .line 71
    invoke-virtual {v3, p3}, Loz1;->e(Ljava/lang/Object;)I

    .line 72
    .line 73
    .line 74
    move-result p3

    .line 75
    if-ne p2, p3, :cond_3

    .line 76
    .line 77
    iget-object p2, p4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 78
    .line 79
    invoke-virtual {p0, p2, v6}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    iget v7, p2, Lsw1;->c:I

    .line 84
    .line 85
    iget-wide v8, p1, Lib4;->c:J

    .line 86
    .line 87
    move-object v4, p0

    .line 88
    invoke-virtual/range {v4 .. v9}, Loz1;->m(Lez1;Lsw1;IJ)Landroid/util/Pair;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0

    .line 93
    :cond_3
    :goto_1
    return-object p4

    .line 94
    :cond_4
    move-object v4, p0

    .line 95
    iget-object v7, p4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 96
    .line 97
    move-object v8, v3

    .line 98
    move-object v9, v4

    .line 99
    move-object v3, v5

    .line 100
    move-object v4, v6

    .line 101
    move v5, p2

    .line 102
    move v6, p3

    .line 103
    invoke-static/range {v3 .. v9}, Ljb4;->W(Lez1;Lsw1;IZLjava/lang/Object;Loz1;Loz1;)I

    .line 104
    .line 105
    .line 106
    move-result v7

    .line 107
    move-object v5, v3

    .line 108
    move-object v6, v4

    .line 109
    move-object v4, v9

    .line 110
    if-eq v7, v0, :cond_5

    .line 111
    .line 112
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    invoke-virtual/range {v4 .. v9}, Loz1;->m(Lez1;Lsw1;IJ)Landroid/util/Pair;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    return-object p0

    .line 122
    :catch_0
    :cond_5
    :goto_2
    const/4 p0, 0x0

    .line 123
    return-object p0
.end method


# virtual methods
.method public final B()V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    const/4 v2, 0x2

    .line 4
    if-ge v1, v2, :cond_2

    .line 5
    .line 6
    iget-object v2, p0, Ljb4;->f:[Lt71;

    .line 7
    .line 8
    aget-object v3, v2, v1

    .line 9
    .line 10
    invoke-virtual {v3}, Lt71;->r()I

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    aget-object v2, v2, v1

    .line 15
    .line 16
    iget-object v4, v2, Lt71;->e:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v4, Lkg4;

    .line 19
    .line 20
    iget-object v5, v2, Lt71;->f:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v5, Lkg4;

    .line 23
    .line 24
    iget-object v6, p0, Ljb4;->s:Lg53;

    .line 25
    .line 26
    invoke-virtual {v2, v4, v6}, Lt71;->i(Lkg4;Lg53;)V

    .line 27
    .line 28
    .line 29
    if-eqz v5, :cond_1

    .line 30
    .line 31
    iget v4, v5, Lkg4;->m:I

    .line 32
    .line 33
    if-eqz v4, :cond_0

    .line 34
    .line 35
    iget v4, v2, Lt71;->b:I

    .line 36
    .line 37
    const/4 v7, 0x3

    .line 38
    if-eq v4, v7, :cond_0

    .line 39
    .line 40
    const/4 v4, 0x1

    .line 41
    goto :goto_1

    .line 42
    :cond_0
    move v4, v0

    .line 43
    :goto_1
    invoke-virtual {v2, v5, v6}, Lt71;->i(Lkg4;Lg53;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, v0}, Lt71;->j(Z)V

    .line 47
    .line 48
    .line 49
    if-eqz v4, :cond_1

    .line 50
    .line 51
    iget-object v4, v2, Lt71;->e:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v4, Lkg4;

    .line 54
    .line 55
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    const/16 v6, 0x11

    .line 59
    .line 60
    invoke-interface {v5, v6, v4}, Lfc4;->a(ILjava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :cond_1
    iput v0, v2, Lt71;->b:I

    .line 64
    .line 65
    invoke-virtual {p0, v1, v0}, Ljb4;->m(IZ)V

    .line 66
    .line 67
    .line 68
    iget v2, p0, Ljb4;->V:I

    .line 69
    .line 70
    sub-int/2addr v2, v3

    .line 71
    iput v2, p0, Ljb4;->V:I

    .line 72
    .line 73
    add-int/lit8 v1, v1, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    iput-wide v0, p0, Ljb4;->e0:J

    .line 82
    .line 83
    return-void
.end method

.method public final C()V
    .locals 10

    .line 1
    iget-boolean v0, p0, Ljb4;->C:Z

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-virtual {p0}, Ljb4;->V()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_6

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    move v1, v0

    .line 14
    :goto_0
    const/4 v2, 0x2

    .line 15
    if-ge v1, v2, :cond_6

    .line 16
    .line 17
    iget-object v3, p0, Ljb4;->f:[Lt71;

    .line 18
    .line 19
    aget-object v3, v3, v1

    .line 20
    .line 21
    invoke-virtual {v3}, Lt71;->r()I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    invoke-virtual {v3}, Lt71;->q()Z

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    if-nez v5, :cond_1

    .line 30
    .line 31
    goto :goto_5

    .line 32
    :cond_1
    iget v5, v3, Lt71;->b:I

    .line 33
    .line 34
    const/4 v6, 0x1

    .line 35
    const/4 v7, 0x4

    .line 36
    if-eq v5, v7, :cond_3

    .line 37
    .line 38
    if-ne v5, v2, :cond_2

    .line 39
    .line 40
    :goto_1
    move v5, v6

    .line 41
    goto :goto_2

    .line 42
    :cond_2
    move v2, v5

    .line 43
    move v5, v0

    .line 44
    goto :goto_2

    .line 45
    :cond_3
    move v2, v5

    .line 46
    goto :goto_1

    .line 47
    :goto_2
    if-eqz v5, :cond_4

    .line 48
    .line 49
    iget-object v8, v3, Lt71;->e:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v8, Lkg4;

    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_4
    iget-object v8, v3, Lt71;->f:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v8, Lkg4;

    .line 57
    .line 58
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    :goto_3
    iget-object v9, p0, Ljb4;->s:Lg53;

    .line 62
    .line 63
    invoke-virtual {v3, v8, v9}, Lt71;->i(Lkg4;Lg53;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v3, v5}, Lt71;->j(Z)V

    .line 67
    .line 68
    .line 69
    if-ne v2, v7, :cond_5

    .line 70
    .line 71
    goto :goto_4

    .line 72
    :cond_5
    move v6, v0

    .line 73
    :goto_4
    iput v6, v3, Lt71;->b:I

    .line 74
    .line 75
    :goto_5
    iget v2, p0, Ljb4;->V:I

    .line 76
    .line 77
    invoke-virtual {v3}, Lt71;->r()I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    sub-int/2addr v4, v3

    .line 82
    sub-int/2addr v2, v4

    .line 83
    iput v2, p0, Ljb4;->V:I

    .line 84
    .line 85
    add-int/lit8 v1, v1, 0x1

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_6
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    iput-wide v0, p0, Ljb4;->e0:J

    .line 94
    .line 95
    :cond_7
    :goto_6
    return-void
.end method

.method public final D()V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v10, v0, Ljb4;->s:Lg53;

    .line 4
    .line 5
    invoke-virtual {v10}, Lg53;->g()Lsr1;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v1, v1, Lsr1;->a:F

    .line 10
    .line 11
    iget-object v1, v0, Ljb4;->w:Lrb4;

    .line 12
    .line 13
    iget-object v2, v1, Lrb4;->h:Lpb4;

    .line 14
    .line 15
    iget-object v3, v1, Lrb4;->i:Lpb4;

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v11, 0x1

    .line 19
    move-object v12, v2

    .line 20
    move v2, v11

    .line 21
    :goto_0
    if-eqz v12, :cond_12

    .line 22
    .line 23
    iget-boolean v5, v12, Lpb4;->e:Z

    .line 24
    .line 25
    if-nez v5, :cond_0

    .line 26
    .line 27
    goto/16 :goto_b

    .line 28
    .line 29
    :cond_0
    iget-object v5, v0, Ljb4;->K:Ldc4;

    .line 30
    .line 31
    iget-object v5, v5, Ldc4;->a:Loz1;

    .line 32
    .line 33
    invoke-virtual {v12, v5}, Lpb4;->f(Loz1;)Lpj4;

    .line 34
    .line 35
    .line 36
    move-result-object v13

    .line 37
    iget-object v5, v1, Lrb4;->h:Lpb4;

    .line 38
    .line 39
    if-ne v12, v5, :cond_1

    .line 40
    .line 41
    move-object v15, v13

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move-object v15, v4

    .line 44
    :goto_1
    iget-object v4, v12, Lpb4;->o:Lpj4;

    .line 45
    .line 46
    const/4 v5, 0x0

    .line 47
    if-eqz v4, :cond_5

    .line 48
    .line 49
    iget-object v6, v13, Lpj4;->h:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v6, [Lnj4;

    .line 52
    .line 53
    iget-object v7, v4, Lpj4;->h:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v7, [Lnj4;

    .line 56
    .line 57
    array-length v7, v7

    .line 58
    array-length v8, v6

    .line 59
    if-eq v7, v8, :cond_2

    .line 60
    .line 61
    goto :goto_4

    .line 62
    :cond_2
    move v7, v5

    .line 63
    :goto_2
    array-length v8, v6

    .line 64
    if-ge v7, v8, :cond_3

    .line 65
    .line 66
    invoke-virtual {v13, v4, v7}, Lpj4;->c(Lpj4;I)Z

    .line 67
    .line 68
    .line 69
    move-result v8

    .line 70
    if-eqz v8, :cond_5

    .line 71
    .line 72
    add-int/lit8 v7, v7, 0x1

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_3
    if-ne v12, v3, :cond_4

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_4
    move v5, v11

    .line 79
    :goto_3
    and-int/2addr v2, v5

    .line 80
    iget-object v12, v12, Lpb4;->m:Lpb4;

    .line 81
    .line 82
    move-object v4, v15

    .line 83
    goto :goto_0

    .line 84
    :cond_5
    :goto_4
    const/4 v3, 0x4

    .line 85
    const/4 v4, 0x2

    .line 86
    if-eqz v2, :cond_10

    .line 87
    .line 88
    iget-object v14, v1, Lrb4;->h:Lpb4;

    .line 89
    .line 90
    invoke-virtual {v1, v14}, Lrb4;->y(Lpb4;)I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    and-int/2addr v1, v11

    .line 95
    iget-object v12, v0, Ljb4;->f:[Lt71;

    .line 96
    .line 97
    new-array v2, v4, [Z

    .line 98
    .line 99
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    if-eq v11, v1, :cond_6

    .line 103
    .line 104
    move/from16 v18, v5

    .line 105
    .line 106
    goto :goto_5

    .line 107
    :cond_6
    move/from16 v18, v11

    .line 108
    .line 109
    :goto_5
    iget-object v1, v0, Ljb4;->K:Ldc4;

    .line 110
    .line 111
    iget-wide v6, v1, Ldc4;->r:J

    .line 112
    .line 113
    move-object/from16 v19, v2

    .line 114
    .line 115
    move-wide/from16 v16, v6

    .line 116
    .line 117
    invoke-virtual/range {v14 .. v19}, Lpb4;->g(Lpj4;JZ[Z)J

    .line 118
    .line 119
    .line 120
    move-result-wide v1

    .line 121
    iget-object v6, v0, Ljb4;->K:Ldc4;

    .line 122
    .line 123
    iget v7, v6, Ldc4;->e:I

    .line 124
    .line 125
    if-eq v7, v3, :cond_7

    .line 126
    .line 127
    iget-wide v6, v6, Ldc4;->r:J

    .line 128
    .line 129
    cmp-long v6, v1, v6

    .line 130
    .line 131
    if-eqz v6, :cond_7

    .line 132
    .line 133
    move v8, v11

    .line 134
    goto :goto_6

    .line 135
    :cond_7
    move v8, v5

    .line 136
    :goto_6
    iget-object v6, v0, Ljb4;->K:Ldc4;

    .line 137
    .line 138
    move v7, v3

    .line 139
    move-wide v2, v1

    .line 140
    iget-object v1, v6, Ldc4;->b:Lkh4;

    .line 141
    .line 142
    move v9, v4

    .line 143
    move v13, v5

    .line 144
    iget-wide v4, v6, Ldc4;->c:J

    .line 145
    .line 146
    move v15, v8

    .line 147
    iget-wide v7, v6, Ldc4;->d:J

    .line 148
    .line 149
    move v6, v9

    .line 150
    const/4 v9, 0x5

    .line 151
    move/from16 v16, v15

    .line 152
    .line 153
    move v15, v6

    .line 154
    move-wide v6, v7

    .line 155
    move/from16 v8, v16

    .line 156
    .line 157
    const/16 v16, 0x4

    .line 158
    .line 159
    invoke-virtual/range {v0 .. v9}, Ljb4;->N(Lkh4;JJJZI)Ldc4;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    iput-object v1, v0, Ljb4;->K:Ldc4;

    .line 164
    .line 165
    if-eqz v8, :cond_8

    .line 166
    .line 167
    invoke-virtual {v0, v2, v3, v11}, Ljb4;->s(JZ)V

    .line 168
    .line 169
    .line 170
    :cond_8
    invoke-virtual {v0}, Ljb4;->C()V

    .line 171
    .line 172
    .line 173
    new-array v1, v15, [Z

    .line 174
    .line 175
    move v5, v13

    .line 176
    :goto_7
    if-ge v5, v15, :cond_e

    .line 177
    .line 178
    aget-object v2, v12, v5

    .line 179
    .line 180
    invoke-virtual {v2}, Lt71;->r()I

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    aget-object v3, v12, v5

    .line 185
    .line 186
    invoke-virtual {v3}, Lt71;->g()Z

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    aput-boolean v3, v1, v5

    .line 191
    .line 192
    aget-object v3, v12, v5

    .line 193
    .line 194
    iget-object v4, v14, Lpb4;->c:[Lli4;

    .line 195
    .line 196
    aget-object v4, v4, v5

    .line 197
    .line 198
    iget-wide v6, v0, Ljb4;->X:J

    .line 199
    .line 200
    aget-boolean v8, v19, v5

    .line 201
    .line 202
    iget-object v9, v3, Lt71;->e:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v9, Lkg4;

    .line 205
    .line 206
    invoke-static {v9}, Lt71;->l(Lkg4;)Z

    .line 207
    .line 208
    .line 209
    move-result v17

    .line 210
    if-eqz v17, :cond_a

    .line 211
    .line 212
    iget-object v15, v9, Lkg4;->n:Lli4;

    .line 213
    .line 214
    if-eq v4, v15, :cond_9

    .line 215
    .line 216
    invoke-virtual {v3, v9, v10}, Lt71;->i(Lkg4;Lg53;)V

    .line 217
    .line 218
    .line 219
    goto :goto_8

    .line 220
    :cond_9
    if-eqz v8, :cond_a

    .line 221
    .line 222
    invoke-virtual {v9, v6, v7, v13, v11}, Lkg4;->L(JZZ)V

    .line 223
    .line 224
    .line 225
    :cond_a
    :goto_8
    iget-object v9, v3, Lt71;->f:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast v9, Lkg4;

    .line 228
    .line 229
    if-eqz v9, :cond_c

    .line 230
    .line 231
    invoke-static {v9}, Lt71;->l(Lkg4;)Z

    .line 232
    .line 233
    .line 234
    move-result v15

    .line 235
    if-eqz v15, :cond_c

    .line 236
    .line 237
    iget-object v15, v9, Lkg4;->n:Lli4;

    .line 238
    .line 239
    if-eq v4, v15, :cond_b

    .line 240
    .line 241
    invoke-virtual {v3, v9, v10}, Lt71;->i(Lkg4;Lg53;)V

    .line 242
    .line 243
    .line 244
    goto :goto_9

    .line 245
    :cond_b
    if-eqz v8, :cond_c

    .line 246
    .line 247
    invoke-virtual {v9, v6, v7, v13, v11}, Lkg4;->L(JZZ)V

    .line 248
    .line 249
    .line 250
    :cond_c
    :goto_9
    aget-object v3, v12, v5

    .line 251
    .line 252
    invoke-virtual {v3}, Lt71;->r()I

    .line 253
    .line 254
    .line 255
    move-result v3

    .line 256
    sub-int v3, v2, v3

    .line 257
    .line 258
    if-lez v3, :cond_d

    .line 259
    .line 260
    invoke-virtual {v0, v5, v13}, Ljb4;->m(IZ)V

    .line 261
    .line 262
    .line 263
    :cond_d
    iget v3, v0, Ljb4;->V:I

    .line 264
    .line 265
    aget-object v4, v12, v5

    .line 266
    .line 267
    invoke-virtual {v4}, Lt71;->r()I

    .line 268
    .line 269
    .line 270
    move-result v4

    .line 271
    sub-int/2addr v2, v4

    .line 272
    sub-int/2addr v3, v2

    .line 273
    iput v3, v0, Ljb4;->V:I

    .line 274
    .line 275
    add-int/lit8 v5, v5, 0x1

    .line 276
    .line 277
    const/4 v15, 0x2

    .line 278
    goto :goto_7

    .line 279
    :cond_e
    iget-wide v2, v0, Ljb4;->X:J

    .line 280
    .line 281
    invoke-virtual {v0, v1, v2, v3}, Ljb4;->O([ZJ)V

    .line 282
    .line 283
    .line 284
    iput-boolean v11, v14, Lpb4;->h:Z

    .line 285
    .line 286
    :cond_f
    move/from16 v7, v16

    .line 287
    .line 288
    const/4 v6, 0x2

    .line 289
    goto :goto_a

    .line 290
    :cond_10
    move/from16 v16, v3

    .line 291
    .line 292
    invoke-virtual {v1, v12}, Lrb4;->y(Lpb4;)I

    .line 293
    .line 294
    .line 295
    iget-boolean v2, v12, Lpb4;->e:Z

    .line 296
    .line 297
    if-eqz v2, :cond_f

    .line 298
    .line 299
    iget-object v2, v12, Lpb4;->g:Lqb4;

    .line 300
    .line 301
    iget-wide v2, v2, Lqb4;->b:J

    .line 302
    .line 303
    iget-wide v4, v0, Ljb4;->X:J

    .line 304
    .line 305
    iget-wide v6, v12, Lpb4;->p:J

    .line 306
    .line 307
    sub-long/2addr v4, v6

    .line 308
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 309
    .line 310
    .line 311
    move-result-wide v14

    .line 312
    iget-boolean v2, v0, Ljb4;->C:Z

    .line 313
    .line 314
    if-eqz v2, :cond_11

    .line 315
    .line 316
    invoke-virtual {v0}, Ljb4;->V()Z

    .line 317
    .line 318
    .line 319
    move-result v2

    .line 320
    if-eqz v2, :cond_11

    .line 321
    .line 322
    iget-object v1, v1, Lrb4;->j:Lpb4;

    .line 323
    .line 324
    if-ne v1, v12, :cond_11

    .line 325
    .line 326
    invoke-virtual {v0}, Ljb4;->C()V

    .line 327
    .line 328
    .line 329
    :cond_11
    move/from16 v7, v16

    .line 330
    .line 331
    const/16 v16, 0x0

    .line 332
    .line 333
    const/4 v6, 0x2

    .line 334
    new-array v1, v6, [Z

    .line 335
    .line 336
    move-object/from16 v17, v1

    .line 337
    .line 338
    invoke-virtual/range {v12 .. v17}, Lpb4;->g(Lpj4;JZ[Z)J

    .line 339
    .line 340
    .line 341
    :goto_a
    invoke-virtual {v0, v11}, Ljb4;->Q(Z)V

    .line 342
    .line 343
    .line 344
    iget-object v1, v0, Ljb4;->K:Ldc4;

    .line 345
    .line 346
    iget v1, v1, Ldc4;->e:I

    .line 347
    .line 348
    if-eq v1, v7, :cond_12

    .line 349
    .line 350
    invoke-virtual {v0}, Ljb4;->L()V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v0}, Ljb4;->l()V

    .line 354
    .line 355
    .line 356
    iget-object v1, v0, Ljb4;->m:Ld13;

    .line 357
    .line 358
    invoke-virtual {v1, v6}, Ld13;->b(I)Z

    .line 359
    .line 360
    .line 361
    :cond_12
    :goto_b
    return-void
.end method

.method public final E()Z
    .locals 5

    .line 1
    iget-object v0, p0, Ljb4;->w:Lrb4;

    .line 2
    .line 3
    iget-object v0, v0, Lrb4;->h:Lpb4;

    .line 4
    .line 5
    iget-object v1, v0, Lpb4;->g:Lqb4;

    .line 6
    .line 7
    iget-wide v1, v1, Lqb4;->e:J

    .line 8
    .line 9
    iget-boolean v0, v0, Lpb4;->e:Z

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    cmp-long v0, v1, v3

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Ljb4;->K:Ldc4;

    .line 23
    .line 24
    iget-wide v3, v0, Ldc4;->r:J

    .line 25
    .line 26
    cmp-long v0, v3, v1

    .line 27
    .line 28
    if-ltz v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0}, Ljb4;->T()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 v0, 0x1

    .line 38
    return v0

    .line 39
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 40
    return v0
.end method

.method public final F(Loz1;Z)V
    .locals 29

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Ljb4;->K:Ldc4;

    .line 4
    .line 5
    iget-object v3, v1, Ljb4;->W:Lib4;

    .line 6
    .line 7
    iget v4, v1, Ljb4;->S:I

    .line 8
    .line 9
    iget-boolean v5, v1, Ljb4;->T:Z

    .line 10
    .line 11
    invoke-virtual/range {p1 .. p1}, Loz1;->g()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    sget-object v0, Ldc4;->t:Lkh4;

    .line 18
    .line 19
    move-object/from16 v2, p1

    .line 20
    .line 21
    move-object v10, v0

    .line 22
    const/4 v6, 0x0

    .line 23
    const/4 v11, 0x0

    .line 24
    const-wide/16 v13, 0x0

    .line 25
    .line 26
    const/4 v15, 0x0

    .line 27
    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    const/16 v23, 0x1

    .line 33
    .line 34
    const-wide v24, -0x7fffffffffffffffL    # -4.9E-324

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    goto/16 :goto_15

    .line 40
    .line 41
    :cond_0
    iget-object v7, v1, Ljb4;->q:Lsw1;

    .line 42
    .line 43
    iget-object v2, v0, Ldc4;->b:Lkh4;

    .line 44
    .line 45
    iget-object v6, v2, Lkh4;->a:Ljava/lang/Object;

    .line 46
    .line 47
    iget-object v8, v0, Ldc4;->a:Loz1;

    .line 48
    .line 49
    invoke-virtual {v8}, Loz1;->g()Z

    .line 50
    .line 51
    .line 52
    move-result v17

    .line 53
    if-nez v17, :cond_2

    .line 54
    .line 55
    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    iget-object v11, v2, Lkh4;->a:Ljava/lang/Object;

    .line 61
    .line 62
    invoke-virtual {v8, v11, v7}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 63
    .line 64
    .line 65
    move-result-object v8

    .line 66
    iget-boolean v8, v8, Lsw1;->e:Z

    .line 67
    .line 68
    if-eqz v8, :cond_1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    const/4 v11, 0x0

    .line 72
    goto :goto_1

    .line 73
    :cond_2
    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    :goto_0
    const/4 v11, 0x1

    .line 79
    :goto_1
    invoke-virtual {v2}, Lkh4;->b()Z

    .line 80
    .line 81
    .line 82
    move-result v8

    .line 83
    if-nez v8, :cond_4

    .line 84
    .line 85
    if-eqz v11, :cond_3

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_3
    iget-wide v13, v0, Ldc4;->r:J

    .line 89
    .line 90
    :goto_2
    move-object v8, v6

    .line 91
    goto :goto_4

    .line 92
    :cond_4
    :goto_3
    iget-wide v13, v0, Ldc4;->c:J

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :goto_4
    iget-object v6, v1, Ljb4;->p:Lez1;

    .line 96
    .line 97
    if-eqz v3, :cond_8

    .line 98
    .line 99
    move-object v12, v2

    .line 100
    move-object/from16 v2, p1

    .line 101
    .line 102
    invoke-static/range {v2 .. v7}, Ljb4;->z(Loz1;Lib4;IZLez1;Lsw1;)Landroid/util/Pair;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    if-nez v4, :cond_5

    .line 107
    .line 108
    invoke-virtual {v2, v5}, Loz1;->k(Z)I

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    move-object v5, v8

    .line 113
    move-wide v9, v13

    .line 114
    const/4 v4, 0x0

    .line 115
    const/4 v15, 0x0

    .line 116
    const/16 v23, 0x1

    .line 117
    .line 118
    goto :goto_7

    .line 119
    :cond_5
    iget-wide v9, v3, Lib4;->c:J

    .line 120
    .line 121
    cmp-long v3, v9, v17

    .line 122
    .line 123
    if-nez v3, :cond_6

    .line 124
    .line 125
    iget-object v3, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 126
    .line 127
    invoke-virtual {v2, v3, v7}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    iget v3, v3, Lsw1;->c:I

    .line 132
    .line 133
    move-object v9, v8

    .line 134
    move-wide v4, v13

    .line 135
    const/4 v10, 0x0

    .line 136
    goto :goto_5

    .line 137
    :cond_6
    iget-object v3, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 138
    .line 139
    iget-object v4, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v4, Ljava/lang/Long;

    .line 142
    .line 143
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 144
    .line 145
    .line 146
    move-result-wide v4

    .line 147
    move-object v9, v3

    .line 148
    const/4 v3, -0x1

    .line 149
    const/4 v10, 0x1

    .line 150
    :goto_5
    iget v15, v0, Ldc4;->e:I

    .line 151
    .line 152
    move/from16 v23, v3

    .line 153
    .line 154
    const/4 v3, 0x4

    .line 155
    if-ne v15, v3, :cond_7

    .line 156
    .line 157
    const/4 v3, 0x1

    .line 158
    goto :goto_6

    .line 159
    :cond_7
    const/4 v3, 0x0

    .line 160
    :goto_6
    move v15, v10

    .line 161
    move-wide/from16 v27, v4

    .line 162
    .line 163
    move v4, v3

    .line 164
    move-object v5, v9

    .line 165
    move/from16 v3, v23

    .line 166
    .line 167
    const/16 v23, 0x0

    .line 168
    .line 169
    move-wide/from16 v9, v27

    .line 170
    .line 171
    :goto_7
    move/from16 v16, v4

    .line 172
    .line 173
    move-object v4, v5

    .line 174
    move-wide/from16 v24, v9

    .line 175
    .line 176
    move/from16 v19, v15

    .line 177
    .line 178
    const-wide/16 v9, 0x0

    .line 179
    .line 180
    const/4 v15, 0x0

    .line 181
    move v5, v3

    .line 182
    move-object v3, v7

    .line 183
    :goto_8
    const/4 v7, -0x1

    .line 184
    goto/16 :goto_c

    .line 185
    .line 186
    :cond_8
    move-object v12, v2

    .line 187
    move-object v3, v7

    .line 188
    move-object/from16 v2, p1

    .line 189
    .line 190
    iget-object v7, v0, Ldc4;->a:Loz1;

    .line 191
    .line 192
    invoke-virtual {v7}, Loz1;->g()Z

    .line 193
    .line 194
    .line 195
    move-result v9

    .line 196
    if-eqz v9, :cond_9

    .line 197
    .line 198
    invoke-virtual {v2, v5}, Loz1;->k(Z)I

    .line 199
    .line 200
    .line 201
    move-result v4

    .line 202
    move v5, v4

    .line 203
    move-object v4, v8

    .line 204
    move-wide/from16 v24, v13

    .line 205
    .line 206
    const/4 v7, -0x1

    .line 207
    const-wide/16 v9, 0x0

    .line 208
    .line 209
    const/4 v15, 0x0

    .line 210
    const/16 v16, 0x0

    .line 211
    .line 212
    const/16 v19, 0x0

    .line 213
    .line 214
    const/16 v23, 0x0

    .line 215
    .line 216
    goto/16 :goto_c

    .line 217
    .line 218
    :cond_9
    invoke-virtual {v2, v8}, Loz1;->e(Ljava/lang/Object;)I

    .line 219
    .line 220
    .line 221
    move-result v9

    .line 222
    const/4 v10, -0x1

    .line 223
    if-ne v9, v10, :cond_b

    .line 224
    .line 225
    move-object v15, v8

    .line 226
    move-object v8, v2

    .line 227
    move-object v2, v6

    .line 228
    move-object v6, v15

    .line 229
    const/4 v15, 0x0

    .line 230
    invoke-static/range {v2 .. v8}, Ljb4;->W(Lez1;Lsw1;IZLjava/lang/Object;Loz1;Loz1;)I

    .line 231
    .line 232
    .line 233
    move-result v4

    .line 234
    move-object/from16 v27, v6

    .line 235
    .line 236
    move-object v6, v2

    .line 237
    move-object v2, v8

    .line 238
    move-object/from16 v8, v27

    .line 239
    .line 240
    if-ne v4, v10, :cond_a

    .line 241
    .line 242
    invoke-virtual {v2, v5}, Loz1;->k(Z)I

    .line 243
    .line 244
    .line 245
    move-result v4

    .line 246
    move v5, v4

    .line 247
    const/4 v4, 0x1

    .line 248
    goto :goto_9

    .line 249
    :cond_a
    move v5, v4

    .line 250
    move v4, v15

    .line 251
    :goto_9
    move/from16 v23, v4

    .line 252
    .line 253
    move-object v4, v8

    .line 254
    move-wide/from16 v24, v13

    .line 255
    .line 256
    move/from16 v16, v15

    .line 257
    .line 258
    move/from16 v19, v16

    .line 259
    .line 260
    :goto_a
    const/4 v7, -0x1

    .line 261
    const-wide/16 v9, 0x0

    .line 262
    .line 263
    goto/16 :goto_c

    .line 264
    .line 265
    :cond_b
    const/4 v15, 0x0

    .line 266
    cmp-long v4, v13, v17

    .line 267
    .line 268
    if-nez v4, :cond_c

    .line 269
    .line 270
    invoke-virtual {v2, v8, v3}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 271
    .line 272
    .line 273
    move-result-object v4

    .line 274
    iget v4, v4, Lsw1;->c:I

    .line 275
    .line 276
    move v5, v4

    .line 277
    move-object v4, v8

    .line 278
    move-wide/from16 v24, v13

    .line 279
    .line 280
    move/from16 v16, v15

    .line 281
    .line 282
    move/from16 v19, v16

    .line 283
    .line 284
    move/from16 v23, v19

    .line 285
    .line 286
    goto :goto_a

    .line 287
    :cond_c
    if-eqz v11, :cond_f

    .line 288
    .line 289
    invoke-virtual {v7, v8, v3}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 290
    .line 291
    .line 292
    iget v4, v3, Lsw1;->c:I

    .line 293
    .line 294
    const-wide/16 v9, 0x0

    .line 295
    .line 296
    invoke-virtual {v7, v4, v6, v9, v10}, Loz1;->b(ILez1;J)Lez1;

    .line 297
    .line 298
    .line 299
    move-result-object v4

    .line 300
    iget v4, v4, Lez1;->k:I

    .line 301
    .line 302
    invoke-virtual {v7, v8}, Loz1;->e(Ljava/lang/Object;)I

    .line 303
    .line 304
    .line 305
    move-result v5

    .line 306
    if-ne v4, v5, :cond_d

    .line 307
    .line 308
    invoke-virtual {v2, v8, v3}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 309
    .line 310
    .line 311
    move-result-object v4

    .line 312
    iget v5, v4, Lsw1;->c:I

    .line 313
    .line 314
    move-object v4, v3

    .line 315
    move-object v3, v6

    .line 316
    move-wide v6, v13

    .line 317
    invoke-virtual/range {v2 .. v7}, Loz1;->m(Lez1;Lsw1;IJ)Landroid/util/Pair;

    .line 318
    .line 319
    .line 320
    move-result-object v5

    .line 321
    move-object v6, v3

    .line 322
    move-object v3, v4

    .line 323
    iget-object v4, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 324
    .line 325
    iget-object v5, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 326
    .line 327
    check-cast v5, Ljava/lang/Long;

    .line 328
    .line 329
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 330
    .line 331
    .line 332
    move-result-wide v9

    .line 333
    move-wide/from16 v19, v9

    .line 334
    .line 335
    const-wide/16 v9, 0x0

    .line 336
    .line 337
    goto :goto_b

    .line 338
    :cond_d
    invoke-virtual {v2, v8, v3}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 339
    .line 340
    .line 341
    move-result-object v4

    .line 342
    iget-wide v4, v4, Lsw1;->d:J

    .line 343
    .line 344
    cmp-long v4, v4, v17

    .line 345
    .line 346
    if-eqz v4, :cond_e

    .line 347
    .line 348
    iget-wide v4, v3, Lsw1;->d:J

    .line 349
    .line 350
    const-wide/16 v9, -0x1

    .line 351
    .line 352
    add-long/2addr v4, v9

    .line 353
    sget-object v7, Lv23;->a:Ljava/lang/String;

    .line 354
    .line 355
    invoke-static {v13, v14, v4, v5}, Ljava/lang/Math;->min(JJ)J

    .line 356
    .line 357
    .line 358
    move-result-wide v4

    .line 359
    const-wide/16 v9, 0x0

    .line 360
    .line 361
    invoke-static {v9, v10, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 362
    .line 363
    .line 364
    move-result-wide v4

    .line 365
    move-wide/from16 v19, v4

    .line 366
    .line 367
    move-object v4, v8

    .line 368
    goto :goto_b

    .line 369
    :cond_e
    const-wide/16 v9, 0x0

    .line 370
    .line 371
    move-object v4, v8

    .line 372
    move-wide/from16 v19, v13

    .line 373
    .line 374
    :goto_b
    move/from16 v16, v15

    .line 375
    .line 376
    move/from16 v23, v16

    .line 377
    .line 378
    move-wide/from16 v24, v19

    .line 379
    .line 380
    const/4 v5, -0x1

    .line 381
    const/4 v7, -0x1

    .line 382
    const/16 v19, 0x1

    .line 383
    .line 384
    goto :goto_c

    .line 385
    :cond_f
    const-wide/16 v9, 0x0

    .line 386
    .line 387
    move-object v4, v8

    .line 388
    move-wide/from16 v24, v13

    .line 389
    .line 390
    move/from16 v16, v15

    .line 391
    .line 392
    move/from16 v19, v16

    .line 393
    .line 394
    move/from16 v23, v19

    .line 395
    .line 396
    const/4 v5, -0x1

    .line 397
    goto/16 :goto_8

    .line 398
    .line 399
    :goto_c
    if-eq v5, v7, :cond_10

    .line 400
    .line 401
    move-object v4, v3

    .line 402
    move-object v3, v6

    .line 403
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    invoke-virtual/range {v2 .. v7}, Loz1;->m(Lez1;Lsw1;IJ)Landroid/util/Pair;

    .line 409
    .line 410
    .line 411
    move-result-object v3

    .line 412
    iget-object v5, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 413
    .line 414
    iget-object v3, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 415
    .line 416
    check-cast v3, Ljava/lang/Long;

    .line 417
    .line 418
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 419
    .line 420
    .line 421
    move-result-wide v6

    .line 422
    move-wide/from16 v24, v17

    .line 423
    .line 424
    goto :goto_d

    .line 425
    :cond_10
    move-object v6, v4

    .line 426
    move-object v4, v3

    .line 427
    move-object v5, v6

    .line 428
    move-wide/from16 v6, v24

    .line 429
    .line 430
    :goto_d
    iget-object v3, v1, Ljb4;->w:Lrb4;

    .line 431
    .line 432
    invoke-virtual {v3, v2, v5}, Lrb4;->E(Loz1;Ljava/lang/Object;)Lkh4;

    .line 433
    .line 434
    .line 435
    move-result-object v3

    .line 436
    invoke-virtual {v8, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 437
    .line 438
    .line 439
    move-result v20

    .line 440
    if-eqz v20, :cond_11

    .line 441
    .line 442
    invoke-virtual {v12}, Lkh4;->b()Z

    .line 443
    .line 444
    .line 445
    move-result v20

    .line 446
    if-nez v20, :cond_11

    .line 447
    .line 448
    invoke-virtual {v3}, Lkh4;->b()Z

    .line 449
    .line 450
    .line 451
    move-result v20

    .line 452
    if-nez v20, :cond_11

    .line 453
    .line 454
    const/4 v9, 0x1

    .line 455
    goto :goto_e

    .line 456
    :cond_11
    move v9, v15

    .line 457
    :goto_e
    invoke-virtual {v2, v5, v4}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 458
    .line 459
    .line 460
    move-result-object v5

    .line 461
    if-nez v11, :cond_12

    .line 462
    .line 463
    cmp-long v10, v13, v24

    .line 464
    .line 465
    if-nez v10, :cond_12

    .line 466
    .line 467
    iget-object v10, v3, Lkh4;->a:Ljava/lang/Object;

    .line 468
    .line 469
    invoke-virtual {v8, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 470
    .line 471
    .line 472
    move-result v8

    .line 473
    if-nez v8, :cond_13

    .line 474
    .line 475
    :cond_12
    :goto_f
    const/4 v5, 0x1

    .line 476
    goto :goto_10

    .line 477
    :cond_13
    invoke-virtual {v12}, Lkh4;->b()Z

    .line 478
    .line 479
    .line 480
    move-result v8

    .line 481
    if-eqz v8, :cond_14

    .line 482
    .line 483
    iget v8, v12, Lkh4;->b:I

    .line 484
    .line 485
    invoke-virtual {v5, v8}, Lsw1;->c(I)V

    .line 486
    .line 487
    .line 488
    :cond_14
    invoke-virtual {v3}, Lkh4;->b()Z

    .line 489
    .line 490
    .line 491
    move-result v8

    .line 492
    if-eqz v8, :cond_12

    .line 493
    .line 494
    const/4 v10, -0x1

    .line 495
    invoke-virtual {v5, v10}, Lsw1;->c(I)V

    .line 496
    .line 497
    .line 498
    goto :goto_f

    .line 499
    :goto_10
    if-eq v5, v9, :cond_15

    .line 500
    .line 501
    goto :goto_11

    .line 502
    :cond_15
    move-object v3, v12

    .line 503
    :goto_11
    invoke-virtual {v3}, Lkh4;->b()Z

    .line 504
    .line 505
    .line 506
    move-result v5

    .line 507
    if-eqz v5, :cond_1a

    .line 508
    .line 509
    invoke-virtual {v3, v12}, Lkh4;->equals(Ljava/lang/Object;)Z

    .line 510
    .line 511
    .line 512
    move-result v5

    .line 513
    if-eqz v5, :cond_16

    .line 514
    .line 515
    iget-wide v9, v0, Ldc4;->r:J

    .line 516
    .line 517
    goto :goto_14

    .line 518
    :cond_16
    iget-object v0, v3, Lkh4;->a:Ljava/lang/Object;

    .line 519
    .line 520
    invoke-virtual {v2, v0, v4}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 521
    .line 522
    .line 523
    iget v0, v3, Lkh4;->c:I

    .line 524
    .line 525
    iget v5, v3, Lkh4;->b:I

    .line 526
    .line 527
    iget-object v6, v4, Lsw1;->f:Lzb2;

    .line 528
    .line 529
    invoke-virtual {v6, v5}, Lzb2;->a(I)Lcd1;

    .line 530
    .line 531
    .line 532
    move-result-object v5

    .line 533
    move v8, v15

    .line 534
    :goto_12
    iget-object v6, v5, Lcd1;->d:[I

    .line 535
    .line 536
    array-length v7, v6

    .line 537
    if-ge v8, v7, :cond_18

    .line 538
    .line 539
    aget v6, v6, v8

    .line 540
    .line 541
    if-eqz v6, :cond_18

    .line 542
    .line 543
    const/4 v7, 0x1

    .line 544
    if-ne v6, v7, :cond_17

    .line 545
    .line 546
    goto :goto_13

    .line 547
    :cond_17
    add-int/lit8 v8, v8, 0x1

    .line 548
    .line 549
    goto :goto_12

    .line 550
    :cond_18
    :goto_13
    if-ne v0, v8, :cond_19

    .line 551
    .line 552
    iget-object v0, v4, Lsw1;->f:Lzb2;

    .line 553
    .line 554
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 555
    .line 556
    .line 557
    :cond_19
    const-wide/16 v9, 0x0

    .line 558
    .line 559
    goto :goto_14

    .line 560
    :cond_1a
    move-wide v9, v6

    .line 561
    :goto_14
    move-wide v13, v9

    .line 562
    move/from16 v6, v16

    .line 563
    .line 564
    move/from16 v11, v19

    .line 565
    .line 566
    move-object v10, v3

    .line 567
    :goto_15
    iget-object v0, v1, Ljb4;->K:Ldc4;

    .line 568
    .line 569
    iget-object v0, v0, Ldc4;->b:Lkh4;

    .line 570
    .line 571
    invoke-virtual {v0, v10}, Lkh4;->equals(Ljava/lang/Object;)Z

    .line 572
    .line 573
    .line 574
    move-result v0

    .line 575
    if-eqz v0, :cond_1b

    .line 576
    .line 577
    iget-object v0, v1, Ljb4;->K:Ldc4;

    .line 578
    .line 579
    iget-wide v3, v0, Ldc4;->r:J

    .line 580
    .line 581
    cmp-long v0, v13, v3

    .line 582
    .line 583
    if-eqz v0, :cond_1c

    .line 584
    .line 585
    :cond_1b
    const/4 v12, 0x1

    .line 586
    goto :goto_16

    .line 587
    :cond_1c
    move v12, v15

    .line 588
    :goto_16
    const/16 v16, 0x3

    .line 589
    .line 590
    const/4 v4, 0x2

    .line 591
    if-eqz v23, :cond_1e

    .line 592
    .line 593
    :try_start_0
    iget-object v0, v1, Ljb4;->K:Ldc4;

    .line 594
    .line 595
    iget v0, v0, Ldc4;->e:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 596
    .line 597
    const/4 v5, 0x1

    .line 598
    if-eq v0, v5, :cond_1d

    .line 599
    .line 600
    const/4 v7, 0x4

    .line 601
    :try_start_1
    invoke-virtual {v1, v7}, Ljb4;->d(I)V

    .line 602
    .line 603
    .line 604
    goto :goto_19

    .line 605
    :catchall_0
    move-exception v0

    .line 606
    :goto_17
    move/from16 v26, v4

    .line 607
    .line 608
    move v9, v5

    .line 609
    move/from16 v21, v7

    .line 610
    .line 611
    move-object v2, v10

    .line 612
    :goto_18
    const/4 v10, 0x0

    .line 613
    goto/16 :goto_2e

    .line 614
    .line 615
    :cond_1d
    const/4 v7, 0x4

    .line 616
    :goto_19
    invoke-virtual {v1, v15, v15, v15, v5}, Ljb4;->v(ZZZZ)V

    .line 617
    .line 618
    .line 619
    goto :goto_1a

    .line 620
    :catchall_1
    move-exception v0

    .line 621
    const/4 v5, 0x1

    .line 622
    const/4 v7, 0x4

    .line 623
    goto :goto_17

    .line 624
    :cond_1e
    const/4 v5, 0x1

    .line 625
    const/4 v7, 0x4

    .line 626
    :goto_1a
    iget-object v0, v1, Ljb4;->f:[Lt71;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 627
    .line 628
    move v8, v15

    .line 629
    :goto_1b
    if-ge v8, v4, :cond_21

    .line 630
    .line 631
    :try_start_2
    aget-object v9, v0, v8

    .line 632
    .line 633
    iget-object v3, v9, Lt71;->e:Ljava/lang/Object;

    .line 634
    .line 635
    check-cast v3, Lkg4;

    .line 636
    .line 637
    iget-object v4, v3, Lkg4;->u:Loz1;

    .line 638
    .line 639
    invoke-static {v4, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 640
    .line 641
    .line 642
    move-result v4

    .line 643
    if-nez v4, :cond_1f

    .line 644
    .line 645
    iput-object v2, v3, Lkg4;->u:Loz1;

    .line 646
    .line 647
    :cond_1f
    iget-object v3, v9, Lt71;->f:Ljava/lang/Object;

    .line 648
    .line 649
    check-cast v3, Lkg4;

    .line 650
    .line 651
    if-eqz v3, :cond_20

    .line 652
    .line 653
    iget-object v4, v3, Lkg4;->u:Loz1;

    .line 654
    .line 655
    invoke-static {v4, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 656
    .line 657
    .line 658
    move-result v4

    .line 659
    if-nez v4, :cond_20

    .line 660
    .line 661
    iput-object v2, v3, Lkg4;->u:Loz1;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 662
    .line 663
    :cond_20
    add-int/lit8 v8, v8, 0x1

    .line 664
    .line 665
    const/4 v4, 0x2

    .line 666
    goto :goto_1b

    .line 667
    :goto_1c
    move v9, v5

    .line 668
    move/from16 v21, v7

    .line 669
    .line 670
    move-object v2, v10

    .line 671
    :goto_1d
    const/4 v10, 0x0

    .line 672
    const/16 v26, 0x2

    .line 673
    .line 674
    goto/16 :goto_2e

    .line 675
    .line 676
    :catchall_2
    move-exception v0

    .line 677
    goto :goto_1c

    .line 678
    :cond_21
    if-nez v12, :cond_27

    .line 679
    .line 680
    :try_start_3
    iget-object v2, v1, Ljb4;->w:Lrb4;

    .line 681
    .line 682
    iget-object v0, v2, Lrb4;->i:Lpb4;

    .line 683
    .line 684
    if-nez v0, :cond_22

    .line 685
    .line 686
    const-wide/16 v3, 0x0

    .line 687
    .line 688
    goto :goto_1e

    .line 689
    :cond_22
    invoke-virtual {v1, v0}, Ljb4;->H(Lpb4;)J

    .line 690
    .line 691
    .line 692
    move-result-wide v3

    .line 693
    :goto_1e
    invoke-virtual {v1}, Ljb4;->V()Z

    .line 694
    .line 695
    .line 696
    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_7

    .line 697
    if-eqz v0, :cond_23

    .line 698
    .line 699
    :try_start_4
    iget-object v0, v2, Lrb4;->j:Lpb4;

    .line 700
    .line 701
    if-nez v0, :cond_24

    .line 702
    .line 703
    :cond_23
    move/from16 v22, v5

    .line 704
    .line 705
    move/from16 v21, v7

    .line 706
    .line 707
    const-wide/16 v8, 0x0

    .line 708
    .line 709
    :goto_1f
    move-wide v6, v3

    .line 710
    goto :goto_20

    .line 711
    :cond_24
    invoke-virtual {v1, v0}, Ljb4;->H(Lpb4;)J

    .line 712
    .line 713
    .line 714
    move-result-wide v8
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 715
    move/from16 v22, v5

    .line 716
    .line 717
    move/from16 v21, v7

    .line 718
    .line 719
    goto :goto_1f

    .line 720
    :goto_20
    :try_start_5
    iget-wide v4, v1, Ljb4;->X:J
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    .line 721
    .line 722
    move-object/from16 v3, p1

    .line 723
    .line 724
    :try_start_6
    invoke-virtual/range {v2 .. v9}, Lrb4;->C(Loz1;JJJ)I

    .line 725
    .line 726
    .line 727
    move-result v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 728
    move-object v8, v3

    .line 729
    and-int/lit8 v2, v0, 0x1

    .line 730
    .line 731
    if-eqz v2, :cond_25

    .line 732
    .line 733
    :try_start_7
    invoke-virtual {v1, v15}, Ljb4;->i(Z)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 734
    .line 735
    .line 736
    move-object v2, v10

    .line 737
    const/16 v26, 0x2

    .line 738
    .line 739
    goto/16 :goto_27

    .line 740
    .line 741
    :catchall_3
    move-exception v0

    .line 742
    move-object v2, v10

    .line 743
    const/4 v9, 0x1

    .line 744
    goto :goto_1d

    .line 745
    :cond_25
    const/16 v26, 0x2

    .line 746
    .line 747
    and-int/lit8 v0, v0, 0x2

    .line 748
    .line 749
    if-eqz v0, :cond_26

    .line 750
    .line 751
    :try_start_8
    invoke-virtual {v1}, Ljb4;->C()V

    .line 752
    .line 753
    .line 754
    :cond_26
    move-object v2, v10

    .line 755
    goto/16 :goto_27

    .line 756
    .line 757
    :catchall_4
    move-exception v0

    .line 758
    :goto_21
    move-object v2, v10

    .line 759
    :goto_22
    const/4 v9, 0x1

    .line 760
    goto/16 :goto_18

    .line 761
    .line 762
    :catchall_5
    move-exception v0

    .line 763
    move-object v8, v3

    .line 764
    :goto_23
    const/16 v26, 0x2

    .line 765
    .line 766
    goto :goto_21

    .line 767
    :catchall_6
    move-exception v0

    .line 768
    move-object/from16 v8, p1

    .line 769
    .line 770
    goto :goto_23

    .line 771
    :catchall_7
    move-exception v0

    .line 772
    move-object/from16 v8, p1

    .line 773
    .line 774
    move/from16 v21, v7

    .line 775
    .line 776
    goto :goto_23

    .line 777
    :cond_27
    move-object v8, v2

    .line 778
    move/from16 v21, v7

    .line 779
    .line 780
    const/16 v26, 0x2

    .line 781
    .line 782
    invoke-virtual {v8}, Loz1;->g()Z

    .line 783
    .line 784
    .line 785
    move-result v0

    .line 786
    if-nez v0, :cond_26

    .line 787
    .line 788
    iget-object v0, v1, Ljb4;->w:Lrb4;

    .line 789
    .line 790
    iget-object v2, v0, Lrb4;->h:Lpb4;

    .line 791
    .line 792
    :goto_24
    if-eqz v2, :cond_2a

    .line 793
    .line 794
    iget-object v3, v2, Lpb4;->g:Lqb4;

    .line 795
    .line 796
    iget-object v3, v3, Lqb4;->a:Lkh4;

    .line 797
    .line 798
    invoke-virtual {v3, v10}, Lkh4;->equals(Ljava/lang/Object;)Z

    .line 799
    .line 800
    .line 801
    move-result v3

    .line 802
    if-eqz v3, :cond_29

    .line 803
    .line 804
    iget-object v3, v2, Lpb4;->g:Lqb4;

    .line 805
    .line 806
    invoke-virtual {v0, v8, v3}, Lrb4;->D(Loz1;Lqb4;)Lqb4;

    .line 807
    .line 808
    .line 809
    move-result-object v3

    .line 810
    iput-object v3, v2, Lpb4;->g:Lqb4;

    .line 811
    .line 812
    iget-object v4, v2, Lpb4;->a:Ljava/lang/Object;

    .line 813
    .line 814
    instance-of v5, v4, Lrg4;

    .line 815
    .line 816
    if-eqz v5, :cond_29

    .line 817
    .line 818
    move-object v5, v4

    .line 819
    iget-wide v3, v3, Lqb4;->d:J

    .line 820
    .line 821
    cmp-long v7, v3, v17

    .line 822
    .line 823
    if-nez v7, :cond_28

    .line 824
    .line 825
    const-wide/high16 v3, -0x8000000000000000L

    .line 826
    .line 827
    :cond_28
    check-cast v5, Lrg4;

    .line 828
    .line 829
    iput-wide v3, v5, Lrg4;->j:J

    .line 830
    .line 831
    :cond_29
    iget-object v2, v2, Lpb4;->m:Lpb4;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 832
    .line 833
    goto :goto_24

    .line 834
    :cond_2a
    :try_start_9
    iget-object v0, v1, Ljb4;->w:Lrb4;

    .line 835
    .line 836
    iget-object v2, v0, Lrb4;->h:Lpb4;

    .line 837
    .line 838
    iget-object v0, v0, Lrb4;->i:Lpb4;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 839
    .line 840
    if-eq v2, v0, :cond_2b

    .line 841
    .line 842
    const/4 v5, 0x1

    .line 843
    :goto_25
    move-object v2, v10

    .line 844
    move-wide v3, v13

    .line 845
    goto :goto_26

    .line 846
    :cond_2b
    move v5, v15

    .line 847
    goto :goto_25

    .line 848
    :goto_26
    :try_start_a
    invoke-virtual/range {v1 .. v6}, Ljb4;->r(Lkh4;JZZ)J

    .line 849
    .line 850
    .line 851
    move-result-wide v13
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    .line 852
    goto :goto_27

    .line 853
    :catchall_8
    move-exception v0

    .line 854
    move-wide v13, v3

    .line 855
    goto :goto_22

    .line 856
    :catchall_9
    move-exception v0

    .line 857
    goto :goto_21

    .line 858
    :goto_27
    iget-object v0, v1, Ljb4;->K:Ldc4;

    .line 859
    .line 860
    iget-object v4, v0, Ldc4;->a:Loz1;

    .line 861
    .line 862
    iget-object v5, v0, Ldc4;->b:Lkh4;

    .line 863
    .line 864
    const/4 v9, 0x1

    .line 865
    if-eq v9, v11, :cond_2c

    .line 866
    .line 867
    move-wide/from16 v6, v17

    .line 868
    .line 869
    goto :goto_28

    .line 870
    :cond_2c
    move-wide v6, v13

    .line 871
    :goto_28
    const/4 v8, 0x0

    .line 872
    move-object v3, v2

    .line 873
    move-object/from16 v2, p1

    .line 874
    .line 875
    invoke-virtual/range {v1 .. v8}, Ljb4;->G(Loz1;Lkh4;Loz1;Lkh4;JZ)V

    .line 876
    .line 877
    .line 878
    move-object v11, v2

    .line 879
    move-object v2, v3

    .line 880
    if-nez v12, :cond_2e

    .line 881
    .line 882
    iget-object v0, v1, Ljb4;->K:Ldc4;

    .line 883
    .line 884
    iget-wide v3, v0, Ldc4;->c:J

    .line 885
    .line 886
    cmp-long v0, v24, v3

    .line 887
    .line 888
    if-eqz v0, :cond_2d

    .line 889
    .line 890
    goto :goto_29

    .line 891
    :cond_2d
    move/from16 v12, v26

    .line 892
    .line 893
    goto :goto_2d

    .line 894
    :cond_2e
    :goto_29
    iget-object v0, v1, Ljb4;->K:Ldc4;

    .line 895
    .line 896
    iget-object v3, v0, Ldc4;->b:Lkh4;

    .line 897
    .line 898
    iget-object v3, v3, Lkh4;->a:Ljava/lang/Object;

    .line 899
    .line 900
    iget-object v0, v0, Ldc4;->a:Loz1;

    .line 901
    .line 902
    if-eqz v12, :cond_2f

    .line 903
    .line 904
    if-eqz p2, :cond_2f

    .line 905
    .line 906
    invoke-virtual {v0}, Loz1;->g()Z

    .line 907
    .line 908
    .line 909
    move-result v4

    .line 910
    if-nez v4, :cond_2f

    .line 911
    .line 912
    iget-object v4, v1, Ljb4;->q:Lsw1;

    .line 913
    .line 914
    invoke-virtual {v0, v3, v4}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 915
    .line 916
    .line 917
    move-result-object v0

    .line 918
    iget-boolean v0, v0, Lsw1;->e:Z

    .line 919
    .line 920
    if-nez v0, :cond_2f

    .line 921
    .line 922
    goto :goto_2a

    .line 923
    :cond_2f
    move v9, v15

    .line 924
    :goto_2a
    iget-object v0, v1, Ljb4;->K:Ldc4;

    .line 925
    .line 926
    iget-wide v7, v0, Ldc4;->d:J

    .line 927
    .line 928
    invoke-virtual {v11, v3}, Loz1;->e(Ljava/lang/Object;)I

    .line 929
    .line 930
    .line 931
    move-result v0

    .line 932
    const/4 v10, -0x1

    .line 933
    if-ne v0, v10, :cond_30

    .line 934
    .line 935
    move/from16 v10, v21

    .line 936
    .line 937
    :goto_2b
    move-wide v3, v13

    .line 938
    move-wide/from16 v5, v24

    .line 939
    .line 940
    move/from16 v12, v26

    .line 941
    .line 942
    goto :goto_2c

    .line 943
    :cond_30
    move/from16 v10, v16

    .line 944
    .line 945
    goto :goto_2b

    .line 946
    :goto_2c
    invoke-virtual/range {v1 .. v10}, Ljb4;->N(Lkh4;JJJZI)Ldc4;

    .line 947
    .line 948
    .line 949
    move-result-object v0

    .line 950
    iput-object v0, v1, Ljb4;->K:Ldc4;

    .line 951
    .line 952
    :goto_2d
    invoke-virtual {v1}, Ljb4;->J()V

    .line 953
    .line 954
    .line 955
    iget-object v0, v1, Ljb4;->K:Ldc4;

    .line 956
    .line 957
    iget-object v0, v0, Ldc4;->a:Loz1;

    .line 958
    .line 959
    invoke-virtual {v1, v11, v0}, Ljb4;->x(Loz1;Loz1;)V

    .line 960
    .line 961
    .line 962
    iget-object v0, v1, Ljb4;->K:Ldc4;

    .line 963
    .line 964
    invoke-virtual {v0, v11}, Ldc4;->c(Loz1;)Ldc4;

    .line 965
    .line 966
    .line 967
    move-result-object v0

    .line 968
    iput-object v0, v1, Ljb4;->K:Ldc4;

    .line 969
    .line 970
    invoke-virtual {v11}, Loz1;->g()Z

    .line 971
    .line 972
    .line 973
    move-result v0

    .line 974
    if-nez v0, :cond_31

    .line 975
    .line 976
    const/4 v10, 0x0

    .line 977
    iput-object v10, v1, Ljb4;->W:Lib4;

    .line 978
    .line 979
    :cond_31
    invoke-virtual {v1, v15}, Ljb4;->Q(Z)V

    .line 980
    .line 981
    .line 982
    iget-object v0, v1, Ljb4;->m:Ld13;

    .line 983
    .line 984
    invoke-virtual {v0, v12}, Ld13;->b(I)Z

    .line 985
    .line 986
    .line 987
    return-void

    .line 988
    :goto_2e
    iget-object v3, v1, Ljb4;->K:Ldc4;

    .line 989
    .line 990
    iget-object v4, v3, Ldc4;->a:Loz1;

    .line 991
    .line 992
    iget-object v5, v3, Ldc4;->b:Lkh4;

    .line 993
    .line 994
    if-eq v9, v11, :cond_32

    .line 995
    .line 996
    move-wide/from16 v6, v17

    .line 997
    .line 998
    goto :goto_2f

    .line 999
    :cond_32
    move-wide v6, v13

    .line 1000
    :goto_2f
    const/4 v8, 0x0

    .line 1001
    move-object v3, v2

    .line 1002
    move/from16 v11, v26

    .line 1003
    .line 1004
    move-object/from16 v2, p1

    .line 1005
    .line 1006
    invoke-virtual/range {v1 .. v8}, Ljb4;->G(Loz1;Lkh4;Loz1;Lkh4;JZ)V

    .line 1007
    .line 1008
    .line 1009
    if-nez v12, :cond_34

    .line 1010
    .line 1011
    iget-object v4, v1, Ljb4;->K:Ldc4;

    .line 1012
    .line 1013
    iget-wide v4, v4, Ldc4;->c:J

    .line 1014
    .line 1015
    cmp-long v4, v24, v4

    .line 1016
    .line 1017
    if-eqz v4, :cond_33

    .line 1018
    .line 1019
    goto :goto_30

    .line 1020
    :cond_33
    move-object v12, v2

    .line 1021
    move-object v13, v10

    .line 1022
    goto :goto_34

    .line 1023
    :cond_34
    :goto_30
    iget-object v4, v1, Ljb4;->K:Ldc4;

    .line 1024
    .line 1025
    iget-object v5, v4, Ldc4;->b:Lkh4;

    .line 1026
    .line 1027
    iget-object v5, v5, Lkh4;->a:Ljava/lang/Object;

    .line 1028
    .line 1029
    iget-object v4, v4, Ldc4;->a:Loz1;

    .line 1030
    .line 1031
    if-eqz v12, :cond_35

    .line 1032
    .line 1033
    if-eqz p2, :cond_35

    .line 1034
    .line 1035
    invoke-virtual {v4}, Loz1;->g()Z

    .line 1036
    .line 1037
    .line 1038
    move-result v6

    .line 1039
    if-nez v6, :cond_35

    .line 1040
    .line 1041
    iget-object v6, v1, Ljb4;->q:Lsw1;

    .line 1042
    .line 1043
    invoke-virtual {v4, v5, v6}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v4

    .line 1047
    iget-boolean v4, v4, Lsw1;->e:Z

    .line 1048
    .line 1049
    if-nez v4, :cond_35

    .line 1050
    .line 1051
    goto :goto_31

    .line 1052
    :cond_35
    move v9, v15

    .line 1053
    :goto_31
    iget-object v4, v1, Ljb4;->K:Ldc4;

    .line 1054
    .line 1055
    iget-wide v7, v4, Ldc4;->d:J

    .line 1056
    .line 1057
    invoke-virtual {v2, v5}, Loz1;->e(Ljava/lang/Object;)I

    .line 1058
    .line 1059
    .line 1060
    move-result v4

    .line 1061
    const/4 v5, -0x1

    .line 1062
    if-ne v4, v5, :cond_36

    .line 1063
    .line 1064
    move-object v12, v2

    .line 1065
    move-object v2, v3

    .line 1066
    move-wide v3, v13

    .line 1067
    move-object v13, v10

    .line 1068
    move/from16 v10, v21

    .line 1069
    .line 1070
    :goto_32
    move-wide/from16 v5, v24

    .line 1071
    .line 1072
    goto :goto_33

    .line 1073
    :cond_36
    move-object v12, v2

    .line 1074
    move-object v2, v3

    .line 1075
    move-wide v3, v13

    .line 1076
    move-object v13, v10

    .line 1077
    move/from16 v10, v16

    .line 1078
    .line 1079
    goto :goto_32

    .line 1080
    :goto_33
    invoke-virtual/range {v1 .. v10}, Ljb4;->N(Lkh4;JJJZI)Ldc4;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v2

    .line 1084
    iput-object v2, v1, Ljb4;->K:Ldc4;

    .line 1085
    .line 1086
    :goto_34
    invoke-virtual {v1}, Ljb4;->J()V

    .line 1087
    .line 1088
    .line 1089
    iget-object v2, v1, Ljb4;->K:Ldc4;

    .line 1090
    .line 1091
    iget-object v2, v2, Ldc4;->a:Loz1;

    .line 1092
    .line 1093
    invoke-virtual {v1, v12, v2}, Ljb4;->x(Loz1;Loz1;)V

    .line 1094
    .line 1095
    .line 1096
    iget-object v2, v1, Ljb4;->K:Ldc4;

    .line 1097
    .line 1098
    invoke-virtual {v2, v12}, Ldc4;->c(Loz1;)Ldc4;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v2

    .line 1102
    iput-object v2, v1, Ljb4;->K:Ldc4;

    .line 1103
    .line 1104
    invoke-virtual {v12}, Loz1;->g()Z

    .line 1105
    .line 1106
    .line 1107
    move-result v2

    .line 1108
    if-nez v2, :cond_37

    .line 1109
    .line 1110
    iput-object v13, v1, Ljb4;->W:Lib4;

    .line 1111
    .line 1112
    :cond_37
    invoke-virtual {v1, v15}, Ljb4;->Q(Z)V

    .line 1113
    .line 1114
    .line 1115
    iget-object v2, v1, Ljb4;->m:Ld13;

    .line 1116
    .line 1117
    invoke-virtual {v2, v11}, Ld13;->b(I)Z

    .line 1118
    .line 1119
    .line 1120
    throw v0
.end method

.method public final G(Loz1;Lkh4;Loz1;Lkh4;JZ)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-wide/from16 v3, p5

    .line 8
    .line 9
    invoke-virtual/range {p0 .. p2}, Ljb4;->o(Loz1;Lkh4;)Z

    .line 10
    .line 11
    .line 12
    move-result v5

    .line 13
    if-nez v5, :cond_1

    .line 14
    .line 15
    invoke-virtual/range {p2 .. p2}, Lkh4;->b()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    sget-object v1, Lsr1;->d:Lsr1;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object v1, v0, Ljb4;->K:Ldc4;

    .line 25
    .line 26
    iget-object v1, v1, Ldc4;->o:Lsr1;

    .line 27
    .line 28
    :goto_0
    iget-object v2, v0, Ljb4;->s:Lg53;

    .line 29
    .line 30
    invoke-virtual {v2}, Lg53;->g()Lsr1;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v3, v1}, Lsr1;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-nez v3, :cond_4

    .line 39
    .line 40
    iget-object v3, v0, Ljb4;->m:Ld13;

    .line 41
    .line 42
    const/16 v4, 0x10

    .line 43
    .line 44
    invoke-virtual {v3, v4}, Ld13;->c(I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2, v1}, Lg53;->b(Lsr1;)V

    .line 48
    .line 49
    .line 50
    iget-object v2, v0, Ljb4;->K:Ldc4;

    .line 51
    .line 52
    iget-object v2, v2, Ldc4;->o:Lsr1;

    .line 53
    .line 54
    iget v1, v1, Lsr1;->a:F

    .line 55
    .line 56
    const/4 v3, 0x0

    .line 57
    invoke-virtual {v0, v2, v1, v3, v3}, Ljb4;->K(Lsr1;FZZ)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_1
    move-object/from16 v5, p2

    .line 62
    .line 63
    iget-object v5, v5, Lkh4;->a:Ljava/lang/Object;

    .line 64
    .line 65
    iget-object v6, v0, Ljb4;->q:Lsw1;

    .line 66
    .line 67
    invoke-virtual {v1, v5, v6}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    iget v7, v7, Lsw1;->c:I

    .line 72
    .line 73
    iget-object v8, v0, Ljb4;->p:Lez1;

    .line 74
    .line 75
    const-wide/16 v9, 0x0

    .line 76
    .line 77
    invoke-virtual {v1, v7, v8, v9, v10}, Loz1;->b(ILez1;J)Lez1;

    .line 78
    .line 79
    .line 80
    iget-object v7, v8, Lez1;->h:Lqg1;

    .line 81
    .line 82
    sget-object v11, Lv23;->a:Ljava/lang/String;

    .line 83
    .line 84
    iget-object v11, v0, Ljb4;->h0:Lm44;

    .line 85
    .line 86
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    invoke-static {v12, v13}, Lv23;->r(J)J

    .line 98
    .line 99
    .line 100
    move-result-wide v14

    .line 101
    iput-wide v14, v11, Lm44;->c:J

    .line 102
    .line 103
    iput-wide v14, v11, Lm44;->f:J

    .line 104
    .line 105
    iput-wide v14, v11, Lm44;->g:J

    .line 106
    .line 107
    invoke-virtual {v11}, Lm44;->c()V

    .line 108
    .line 109
    .line 110
    cmp-long v7, v3, v12

    .line 111
    .line 112
    if-eqz v7, :cond_2

    .line 113
    .line 114
    invoke-virtual {v0, v1, v5, v3, v4}, Ljb4;->n(Loz1;Ljava/lang/Object;J)J

    .line 115
    .line 116
    .line 117
    move-result-wide v1

    .line 118
    iput-wide v1, v11, Lm44;->d:J

    .line 119
    .line 120
    invoke-virtual {v11}, Lm44;->c()V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :cond_2
    iget-object v1, v8, Lez1;->a:Ljava/lang/Object;

    .line 125
    .line 126
    invoke-virtual {v2}, Loz1;->g()Z

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    if-nez v3, :cond_3

    .line 131
    .line 132
    move-object/from16 v3, p4

    .line 133
    .line 134
    iget-object v3, v3, Lkh4;->a:Ljava/lang/Object;

    .line 135
    .line 136
    invoke-virtual {v2, v3, v6}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    iget v3, v3, Lsw1;->c:I

    .line 141
    .line 142
    invoke-virtual {v2, v3, v8, v9, v10}, Loz1;->b(ILez1;J)Lez1;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    iget-object v2, v2, Lez1;->a:Ljava/lang/Object;

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_3
    const/4 v2, 0x0

    .line 150
    :goto_1
    invoke-static {v2, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    if-eqz v1, :cond_5

    .line 155
    .line 156
    if-eqz p7, :cond_4

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_4
    return-void

    .line 160
    :cond_5
    :goto_2
    iput-wide v12, v11, Lm44;->d:J

    .line 161
    .line 162
    invoke-virtual {v11}, Lm44;->c()V

    .line 163
    .line 164
    .line 165
    return-void
.end method

.method public final H(Lpb4;)J
    .locals 8

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const-wide/16 v0, 0x0

    .line 4
    .line 5
    return-wide v0

    .line 6
    :cond_0
    iget-wide v0, p1, Lpb4;->p:J

    .line 7
    .line 8
    iget-boolean v2, p1, Lpb4;->e:Z

    .line 9
    .line 10
    if-eqz v2, :cond_3

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    :goto_0
    const/4 v3, 0x2

    .line 14
    if-ge v2, v3, :cond_3

    .line 15
    .line 16
    iget-object v3, p0, Ljb4;->f:[Lt71;

    .line 17
    .line 18
    aget-object v4, v3, v2

    .line 19
    .line 20
    invoke-virtual {v4, p1}, Lt71;->m(Lpb4;)Lkg4;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    if-eqz v4, :cond_2

    .line 25
    .line 26
    aget-object v3, v3, v2

    .line 27
    .line 28
    invoke-virtual {v3, p1}, Lt71;->m(Lpb4;)Lkg4;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    iget-wide v3, v3, Lkg4;->r:J

    .line 36
    .line 37
    const-wide/high16 v5, -0x8000000000000000L

    .line 38
    .line 39
    cmp-long v7, v3, v5

    .line 40
    .line 41
    if-nez v7, :cond_1

    .line 42
    .line 43
    return-wide v5

    .line 44
    :cond_1
    invoke-static {v3, v4, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 45
    .line 46
    .line 47
    move-result-wide v0

    .line 48
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    return-wide v0
.end method

.method public final I()V
    .locals 10

    .line 1
    iget-object v0, p0, Ljb4;->w:Lrb4;

    .line 2
    .line 3
    invoke-virtual {v0}, Lrb4;->z()V

    .line 4
    .line 5
    .line 6
    iget-object v0, v0, Lrb4;->l:Lpb4;

    .line 7
    .line 8
    if-eqz v0, :cond_9

    .line 9
    .line 10
    iget-object v1, v0, Lpb4;->a:Ljava/lang/Object;

    .line 11
    .line 12
    iget-boolean v2, v0, Lpb4;->d:Z

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    iget-boolean v2, v0, Lpb4;->e:Z

    .line 17
    .line 18
    if-eqz v2, :cond_9

    .line 19
    .line 20
    :cond_0
    invoke-interface {v1}, Lmi4;->o()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_9

    .line 25
    .line 26
    iget-object v2, p0, Ljb4;->K:Ldc4;

    .line 27
    .line 28
    iget-object v2, v2, Ldc4;->a:Loz1;

    .line 29
    .line 30
    iget-boolean v2, v0, Lpb4;->e:Z

    .line 31
    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    invoke-interface {v1}, Lmi4;->j()J

    .line 35
    .line 36
    .line 37
    :cond_1
    iget-object v2, p0, Ljb4;->k:Llb4;

    .line 38
    .line 39
    invoke-interface {v2}, Llb4;->g()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-nez v2, :cond_2

    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_2
    iget-boolean v2, v0, Lpb4;->d:Z

    .line 47
    .line 48
    const/4 v3, 0x1

    .line 49
    if-nez v2, :cond_3

    .line 50
    .line 51
    iget-object v2, v0, Lpb4;->g:Lqb4;

    .line 52
    .line 53
    iget-wide v4, v2, Lqb4;->b:J

    .line 54
    .line 55
    iput-boolean v3, v0, Lpb4;->d:Z

    .line 56
    .line 57
    invoke-interface {v1, p0, v4, v5}, Ljh4;->a(Lih4;J)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_3
    new-instance v2, Lmb4;

    .line 62
    .line 63
    invoke-direct {v2}, Lmb4;-><init>()V

    .line 64
    .line 65
    .line 66
    iget-wide v4, p0, Ljb4;->X:J

    .line 67
    .line 68
    iget-wide v6, v0, Lpb4;->p:J

    .line 69
    .line 70
    sub-long/2addr v4, v6

    .line 71
    iput-wide v4, v2, Lmb4;->a:J

    .line 72
    .line 73
    iget-object v4, p0, Ljb4;->s:Lg53;

    .line 74
    .line 75
    invoke-virtual {v4}, Lg53;->g()Lsr1;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    iget v4, v4, Lsr1;->a:F

    .line 80
    .line 81
    const/4 v5, 0x0

    .line 82
    cmpl-float v5, v4, v5

    .line 83
    .line 84
    const/4 v6, 0x0

    .line 85
    if-gtz v5, :cond_4

    .line 86
    .line 87
    const v5, -0x800001

    .line 88
    .line 89
    .line 90
    cmpl-float v5, v4, v5

    .line 91
    .line 92
    if-nez v5, :cond_5

    .line 93
    .line 94
    :cond_4
    move v5, v3

    .line 95
    goto :goto_0

    .line 96
    :cond_5
    move v5, v6

    .line 97
    :goto_0
    invoke-static {v5}, Lzt0;->D(Z)V

    .line 98
    .line 99
    .line 100
    iput v4, v2, Lmb4;->b:F

    .line 101
    .line 102
    iget-wide v4, p0, Ljb4;->Q:J

    .line 103
    .line 104
    const-wide/16 v7, 0x0

    .line 105
    .line 106
    cmp-long v7, v4, v7

    .line 107
    .line 108
    if-gez v7, :cond_6

    .line 109
    .line 110
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    cmp-long v9, v4, v7

    .line 116
    .line 117
    if-nez v9, :cond_7

    .line 118
    .line 119
    move-wide v4, v7

    .line 120
    :cond_6
    move v7, v3

    .line 121
    goto :goto_1

    .line 122
    :cond_7
    move v7, v6

    .line 123
    :goto_1
    invoke-static {v7}, Lzt0;->D(Z)V

    .line 124
    .line 125
    .line 126
    iput-wide v4, v2, Lmb4;->c:J

    .line 127
    .line 128
    new-instance v4, Lnb4;

    .line 129
    .line 130
    invoke-direct {v4, v2}, Lnb4;-><init>(Lmb4;)V

    .line 131
    .line 132
    .line 133
    iget-object v0, v0, Lpb4;->m:Lpb4;

    .line 134
    .line 135
    if-nez v0, :cond_8

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_8
    move v3, v6

    .line 139
    :goto_2
    invoke-static {v3}, Lzt0;->b0(Z)V

    .line 140
    .line 141
    .line 142
    invoke-interface {v1, v4}, Lmi4;->b(Lnb4;)Z

    .line 143
    .line 144
    .line 145
    :cond_9
    :goto_3
    return-void
.end method

.method public final J()V
    .locals 2

    .line 1
    iget-object v0, p0, Ljb4;->w:Lrb4;

    .line 2
    .line 3
    iget-object v0, v0, Lrb4;->h:Lpb4;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Lpb4;->g:Lqb4;

    .line 9
    .line 10
    iget-boolean v0, v0, Lqb4;->g:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-boolean v0, p0, Ljb4;->N:Z

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    :cond_0
    iput-boolean v1, p0, Ljb4;->O:Z

    .line 20
    .line 21
    return-void
.end method

.method public final K(Lsr1;FZZ)V
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    if-eqz p3, :cond_1

    .line 6
    .line 7
    if-eqz p4, :cond_0

    .line 8
    .line 9
    iget-object v2, v0, Ljb4;->L:Lr60;

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    invoke-virtual {v2, v3}, Lr60;->f(I)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v2, v0, Ljb4;->K:Ldc4;

    .line 16
    .line 17
    iget-object v4, v2, Ldc4;->a:Loz1;

    .line 18
    .line 19
    iget-object v5, v2, Ldc4;->b:Lkh4;

    .line 20
    .line 21
    iget-wide v6, v2, Ldc4;->c:J

    .line 22
    .line 23
    iget-wide v8, v2, Ldc4;->d:J

    .line 24
    .line 25
    iget v10, v2, Ldc4;->e:I

    .line 26
    .line 27
    iget-object v11, v2, Ldc4;->f:Lb84;

    .line 28
    .line 29
    iget-boolean v12, v2, Ldc4;->g:Z

    .line 30
    .line 31
    iget-object v13, v2, Ldc4;->h:Lri4;

    .line 32
    .line 33
    iget-object v14, v2, Ldc4;->i:Lpj4;

    .line 34
    .line 35
    iget-object v15, v2, Ldc4;->j:Ljava/util/List;

    .line 36
    .line 37
    iget-object v3, v2, Ldc4;->k:Lkh4;

    .line 38
    .line 39
    move-object/from16 v16, v3

    .line 40
    .line 41
    iget-boolean v3, v2, Ldc4;->l:Z

    .line 42
    .line 43
    move/from16 v17, v3

    .line 44
    .line 45
    iget v3, v2, Ldc4;->m:I

    .line 46
    .line 47
    move/from16 v18, v3

    .line 48
    .line 49
    iget v3, v2, Ldc4;->n:I

    .line 50
    .line 51
    move/from16 v19, v3

    .line 52
    .line 53
    new-instance v3, Ldc4;

    .line 54
    .line 55
    move-object/from16 p3, v3

    .line 56
    .line 57
    move-object/from16 v20, v4

    .line 58
    .line 59
    iget-wide v3, v2, Ldc4;->p:J

    .line 60
    .line 61
    move-wide/from16 v21, v3

    .line 62
    .line 63
    iget-wide v3, v2, Ldc4;->q:J

    .line 64
    .line 65
    move-wide/from16 v23, v3

    .line 66
    .line 67
    iget-wide v3, v2, Ldc4;->r:J

    .line 68
    .line 69
    move-wide/from16 v25, v3

    .line 70
    .line 71
    iget-wide v2, v2, Ldc4;->s:J

    .line 72
    .line 73
    move-wide/from16 v27, v2

    .line 74
    .line 75
    move-object/from16 v4, v20

    .line 76
    .line 77
    move-object/from16 v20, p1

    .line 78
    .line 79
    move-object/from16 v3, p3

    .line 80
    .line 81
    invoke-direct/range {v3 .. v28}, Ldc4;-><init>(Loz1;Lkh4;JJILb84;ZLri4;Lpj4;Ljava/util/List;Lkh4;ZIILsr1;JJJJ)V

    .line 82
    .line 83
    .line 84
    iput-object v3, v0, Ljb4;->K:Ldc4;

    .line 85
    .line 86
    :cond_1
    move-object/from16 v2, p1

    .line 87
    .line 88
    iget v2, v2, Lsr1;->a:F

    .line 89
    .line 90
    iget-object v3, v0, Ljb4;->w:Lrb4;

    .line 91
    .line 92
    iget-object v3, v3, Lrb4;->h:Lpb4;

    .line 93
    .line 94
    :goto_0
    const/4 v4, 0x0

    .line 95
    if-eqz v3, :cond_3

    .line 96
    .line 97
    iget-object v5, v3, Lpb4;->o:Lpj4;

    .line 98
    .line 99
    iget-object v5, v5, Lpj4;->h:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v5, [Lnj4;

    .line 102
    .line 103
    array-length v6, v5

    .line 104
    :goto_1
    if-ge v4, v6, :cond_2

    .line 105
    .line 106
    aget-object v7, v5, v4

    .line 107
    .line 108
    add-int/lit8 v4, v4, 0x1

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_2
    iget-object v3, v3, Lpb4;->m:Lpb4;

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_3
    iget-object v3, v0, Ljb4;->f:[Lt71;

    .line 115
    .line 116
    :goto_2
    const/4 v5, 0x2

    .line 117
    if-ge v4, v5, :cond_5

    .line 118
    .line 119
    aget-object v5, v3, v4

    .line 120
    .line 121
    iget-object v6, v5, Lt71;->e:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v6, Lkg4;

    .line 124
    .line 125
    invoke-virtual {v6, v1, v2}, Lkg4;->q(FF)V

    .line 126
    .line 127
    .line 128
    iget-object v5, v5, Lt71;->f:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v5, Lkg4;

    .line 131
    .line 132
    if-eqz v5, :cond_4

    .line 133
    .line 134
    invoke-virtual {v5, v1, v2}, Lkg4;->q(FF)V

    .line 135
    .line 136
    .line 137
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_5
    return-void
.end method

.method public final L()V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ljb4;->w:Lrb4;

    .line 4
    .line 5
    iget-object v2, v1, Lrb4;->k:Lpb4;

    .line 6
    .line 7
    invoke-static {v2}, Ljb4;->A(Lpb4;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    const-wide/16 v5, 0x0

    .line 17
    .line 18
    const/4 v7, 0x0

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    move v8, v7

    .line 22
    goto/16 :goto_2

    .line 23
    .line 24
    :cond_0
    iget-object v2, v1, Lrb4;->k:Lpb4;

    .line 25
    .line 26
    iget-boolean v8, v2, Lpb4;->e:Z

    .line 27
    .line 28
    if-nez v8, :cond_1

    .line 29
    .line 30
    move-wide v8, v5

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    iget-object v8, v2, Lpb4;->a:Ljava/lang/Object;

    .line 33
    .line 34
    invoke-interface {v8}, Lmi4;->i()J

    .line 35
    .line 36
    .line 37
    move-result-wide v8

    .line 38
    :goto_0
    invoke-virtual {v0, v8, v9}, Ljb4;->R(J)J

    .line 39
    .line 40
    .line 41
    move-result-wide v14

    .line 42
    iget-object v8, v0, Ljb4;->K:Ldc4;

    .line 43
    .line 44
    iget-object v8, v8, Ldc4;->a:Loz1;

    .line 45
    .line 46
    iget-object v9, v2, Lpb4;->g:Lqb4;

    .line 47
    .line 48
    iget-object v9, v9, Lqb4;->a:Lkh4;

    .line 49
    .line 50
    invoke-virtual {v0, v8, v9}, Ljb4;->o(Loz1;Lkh4;)Z

    .line 51
    .line 52
    .line 53
    move-result v8

    .line 54
    if-eqz v8, :cond_2

    .line 55
    .line 56
    iget-object v8, v0, Ljb4;->h0:Lm44;

    .line 57
    .line 58
    iget-wide v8, v8, Lm44;->h:J

    .line 59
    .line 60
    move-wide/from16 v18, v8

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    move-wide/from16 v18, v3

    .line 64
    .line 65
    :goto_1
    iget-object v11, v0, Ljb4;->z:Lxd4;

    .line 66
    .line 67
    new-instance v10, Lkb4;

    .line 68
    .line 69
    iget-object v8, v0, Ljb4;->K:Ldc4;

    .line 70
    .line 71
    iget-object v12, v8, Ldc4;->a:Loz1;

    .line 72
    .line 73
    iget-object v2, v2, Lpb4;->g:Lqb4;

    .line 74
    .line 75
    iget-object v13, v2, Lqb4;->a:Lkh4;

    .line 76
    .line 77
    iget-object v2, v0, Ljb4;->s:Lg53;

    .line 78
    .line 79
    invoke-virtual {v2}, Lg53;->g()Lsr1;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    iget v2, v2, Lsr1;->a:F

    .line 84
    .line 85
    iget-object v8, v0, Ljb4;->K:Ldc4;

    .line 86
    .line 87
    iget-boolean v8, v8, Ldc4;->l:Z

    .line 88
    .line 89
    iget-boolean v8, v0, Ljb4;->P:Z

    .line 90
    .line 91
    move/from16 v16, v2

    .line 92
    .line 93
    move/from16 v17, v8

    .line 94
    .line 95
    invoke-direct/range {v10 .. v19}, Lkb4;-><init>(Lxd4;Loz1;Lkh4;JFZJ)V

    .line 96
    .line 97
    .line 98
    iget-object v2, v0, Ljb4;->k:Llb4;

    .line 99
    .line 100
    invoke-interface {v2, v10}, Llb4;->a(Lkb4;)Z

    .line 101
    .line 102
    .line 103
    move-result v8

    .line 104
    iget-object v9, v1, Lrb4;->h:Lpb4;

    .line 105
    .line 106
    if-nez v8, :cond_4

    .line 107
    .line 108
    iget-boolean v11, v9, Lpb4;->e:Z

    .line 109
    .line 110
    if-eqz v11, :cond_4

    .line 111
    .line 112
    const-wide/32 v11, 0x7a120

    .line 113
    .line 114
    .line 115
    cmp-long v11, v14, v11

    .line 116
    .line 117
    if-gez v11, :cond_4

    .line 118
    .line 119
    iget-wide v11, v0, Ljb4;->r:J

    .line 120
    .line 121
    cmp-long v11, v11, v5

    .line 122
    .line 123
    if-gtz v11, :cond_3

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_3
    iget-object v8, v9, Lpb4;->a:Ljava/lang/Object;

    .line 127
    .line 128
    iget-object v9, v0, Ljb4;->K:Ldc4;

    .line 129
    .line 130
    iget-wide v11, v9, Ldc4;->r:J

    .line 131
    .line 132
    invoke-interface {v8, v11, v12}, Ljh4;->e(J)V

    .line 133
    .line 134
    .line 135
    invoke-interface {v2, v10}, Llb4;->a(Lkb4;)Z

    .line 136
    .line 137
    .line 138
    move-result v8

    .line 139
    :cond_4
    :goto_2
    iput-boolean v8, v0, Ljb4;->R:Z

    .line 140
    .line 141
    if-eqz v8, :cond_a

    .line 142
    .line 143
    iget-object v1, v1, Lrb4;->k:Lpb4;

    .line 144
    .line 145
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    new-instance v2, Lmb4;

    .line 149
    .line 150
    invoke-direct {v2}, Lmb4;-><init>()V

    .line 151
    .line 152
    .line 153
    iget-wide v8, v0, Ljb4;->X:J

    .line 154
    .line 155
    iget-wide v10, v1, Lpb4;->p:J

    .line 156
    .line 157
    sub-long/2addr v8, v10

    .line 158
    iput-wide v8, v2, Lmb4;->a:J

    .line 159
    .line 160
    iget-object v8, v0, Ljb4;->s:Lg53;

    .line 161
    .line 162
    invoke-virtual {v8}, Lg53;->g()Lsr1;

    .line 163
    .line 164
    .line 165
    move-result-object v8

    .line 166
    iget v8, v8, Lsr1;->a:F

    .line 167
    .line 168
    const/4 v9, 0x0

    .line 169
    cmpl-float v9, v8, v9

    .line 170
    .line 171
    const/4 v10, 0x1

    .line 172
    if-gtz v9, :cond_5

    .line 173
    .line 174
    const v9, -0x800001

    .line 175
    .line 176
    .line 177
    cmpl-float v9, v8, v9

    .line 178
    .line 179
    if-nez v9, :cond_6

    .line 180
    .line 181
    :cond_5
    move v9, v10

    .line 182
    goto :goto_3

    .line 183
    :cond_6
    move v9, v7

    .line 184
    :goto_3
    invoke-static {v9}, Lzt0;->D(Z)V

    .line 185
    .line 186
    .line 187
    iput v8, v2, Lmb4;->b:F

    .line 188
    .line 189
    iget-wide v8, v0, Ljb4;->Q:J

    .line 190
    .line 191
    cmp-long v5, v8, v5

    .line 192
    .line 193
    if-gez v5, :cond_8

    .line 194
    .line 195
    cmp-long v5, v8, v3

    .line 196
    .line 197
    if-nez v5, :cond_7

    .line 198
    .line 199
    :goto_4
    move v5, v10

    .line 200
    goto :goto_5

    .line 201
    :cond_7
    move v5, v7

    .line 202
    move-wide v3, v8

    .line 203
    goto :goto_5

    .line 204
    :cond_8
    move-wide v3, v8

    .line 205
    goto :goto_4

    .line 206
    :goto_5
    invoke-static {v5}, Lzt0;->D(Z)V

    .line 207
    .line 208
    .line 209
    iput-wide v3, v2, Lmb4;->c:J

    .line 210
    .line 211
    new-instance v3, Lnb4;

    .line 212
    .line 213
    invoke-direct {v3, v2}, Lnb4;-><init>(Lmb4;)V

    .line 214
    .line 215
    .line 216
    iget-object v2, v1, Lpb4;->m:Lpb4;

    .line 217
    .line 218
    if-nez v2, :cond_9

    .line 219
    .line 220
    move v7, v10

    .line 221
    :cond_9
    invoke-static {v7}, Lzt0;->b0(Z)V

    .line 222
    .line 223
    .line 224
    iget-object v1, v1, Lpb4;->a:Ljava/lang/Object;

    .line 225
    .line 226
    invoke-interface {v1, v3}, Lmi4;->b(Lnb4;)Z

    .line 227
    .line 228
    .line 229
    :cond_a
    invoke-virtual {v0}, Ljb4;->M()V

    .line 230
    .line 231
    .line 232
    return-void
.end method

.method public final M()V
    .locals 3

    .line 1
    iget-object v0, p0, Ljb4;->w:Lrb4;

    .line 2
    .line 3
    iget-object v0, v0, Lrb4;->k:Lpb4;

    .line 4
    .line 5
    iget-boolean v1, p0, Ljb4;->R:Z

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, v0, Lpb4;->a:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-interface {v0}, Lmi4;->o()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v2, v1

    .line 23
    :cond_1
    :goto_0
    iget-object v0, p0, Ljb4;->K:Ldc4;

    .line 24
    .line 25
    iget-boolean v1, v0, Ldc4;->g:Z

    .line 26
    .line 27
    if-eq v2, v1, :cond_2

    .line 28
    .line 29
    invoke-virtual {v0, v2}, Ldc4;->f(Z)Ldc4;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, Ljb4;->K:Ldc4;

    .line 34
    .line 35
    :cond_2
    return-void
.end method

.method public final N(Lkh4;JJJZI)Ldc4;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-wide/from16 v5, p4

    .line 6
    .line 7
    move/from16 v1, p9

    .line 8
    .line 9
    iget-boolean v3, v0, Ljb4;->a0:Z

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    if-nez v3, :cond_0

    .line 13
    .line 14
    iget-object v3, v0, Ljb4;->K:Ldc4;

    .line 15
    .line 16
    iget-wide v8, v3, Ldc4;->r:J

    .line 17
    .line 18
    cmp-long v3, p2, v8

    .line 19
    .line 20
    if-nez v3, :cond_0

    .line 21
    .line 22
    iget-object v3, v0, Ljb4;->K:Ldc4;

    .line 23
    .line 24
    iget-object v3, v3, Ldc4;->b:Lkh4;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Lkh4;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-nez v3, :cond_1

    .line 31
    .line 32
    :cond_0
    const/4 v3, 0x1

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move v3, v4

    .line 35
    :goto_0
    iput-boolean v3, v0, Ljb4;->a0:Z

    .line 36
    .line 37
    invoke-virtual {v0}, Ljb4;->J()V

    .line 38
    .line 39
    .line 40
    iget-object v3, v0, Ljb4;->K:Ldc4;

    .line 41
    .line 42
    iget-object v8, v3, Ldc4;->h:Lri4;

    .line 43
    .line 44
    iget-object v9, v3, Ldc4;->i:Lpj4;

    .line 45
    .line 46
    iget-object v10, v3, Ldc4;->j:Ljava/util/List;

    .line 47
    .line 48
    iget-object v11, v0, Ljb4;->x:Luu0;

    .line 49
    .line 50
    iget-boolean v11, v11, Luu0;->f:Z

    .line 51
    .line 52
    if-eqz v11, :cond_b

    .line 53
    .line 54
    iget-object v3, v0, Ljb4;->w:Lrb4;

    .line 55
    .line 56
    iget-object v8, v3, Lrb4;->h:Lpb4;

    .line 57
    .line 58
    if-nez v8, :cond_2

    .line 59
    .line 60
    sget-object v9, Lri4;->d:Lri4;

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    iget-object v9, v8, Lpb4;->n:Lri4;

    .line 64
    .line 65
    :goto_1
    if-nez v8, :cond_3

    .line 66
    .line 67
    iget-object v10, v0, Ljb4;->j:Lpj4;

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_3
    iget-object v10, v8, Lpb4;->o:Lpj4;

    .line 71
    .line 72
    :goto_2
    iget-object v11, v10, Lpj4;->h:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v11, [Lnj4;

    .line 75
    .line 76
    new-instance v12, Lum3;

    .line 77
    .line 78
    const/4 v13, 0x4

    .line 79
    invoke-direct {v12, v13}, Lrm3;-><init>(I)V

    .line 80
    .line 81
    .line 82
    array-length v13, v11

    .line 83
    move v14, v4

    .line 84
    move v15, v14

    .line 85
    :goto_3
    if-ge v14, v13, :cond_6

    .line 86
    .line 87
    aget-object v7, v11, v14

    .line 88
    .line 89
    if-eqz v7, :cond_5

    .line 90
    .line 91
    invoke-interface {v7, v4}, Lnj4;->c(I)Lph4;

    .line 92
    .line 93
    .line 94
    move-result-object v7

    .line 95
    iget-object v7, v7, Lph4;->k:Lwn1;

    .line 96
    .line 97
    if-nez v7, :cond_4

    .line 98
    .line 99
    new-instance v7, Lwn1;

    .line 100
    .line 101
    move-object/from16 v16, v9

    .line 102
    .line 103
    new-array v9, v4, [Len1;

    .line 104
    .line 105
    invoke-direct {v7, v9}, Lwn1;-><init>([Len1;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v12, v7}, Lrm3;->a(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_4
    move-object/from16 v16, v9

    .line 113
    .line 114
    invoke-virtual {v12, v7}, Lrm3;->a(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    const/4 v15, 0x1

    .line 118
    goto :goto_4

    .line 119
    :cond_5
    move-object/from16 v16, v9

    .line 120
    .line 121
    :goto_4
    add-int/lit8 v14, v14, 0x1

    .line 122
    .line 123
    move-object/from16 v9, v16

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_6
    move-object/from16 v16, v9

    .line 127
    .line 128
    if-eqz v15, :cond_7

    .line 129
    .line 130
    invoke-virtual {v12}, Lum3;->f()Lsn3;

    .line 131
    .line 132
    .line 133
    move-result-object v7

    .line 134
    goto :goto_5

    .line 135
    :cond_7
    sget-object v7, Lxm3;->g:Lvm3;

    .line 136
    .line 137
    sget-object v7, Lsn3;->j:Lsn3;

    .line 138
    .line 139
    :goto_5
    if-eqz v8, :cond_8

    .line 140
    .line 141
    iget-object v9, v8, Lpb4;->g:Lqb4;

    .line 142
    .line 143
    iget-wide v11, v9, Lqb4;->c:J

    .line 144
    .line 145
    cmp-long v11, v11, v5

    .line 146
    .line 147
    if-eqz v11, :cond_8

    .line 148
    .line 149
    invoke-virtual {v9, v5, v6}, Lqb4;->b(J)Lqb4;

    .line 150
    .line 151
    .line 152
    move-result-object v9

    .line 153
    iput-object v9, v8, Lpb4;->g:Lqb4;

    .line 154
    .line 155
    :cond_8
    iget-object v8, v3, Lrb4;->h:Lpb4;

    .line 156
    .line 157
    iget-object v3, v3, Lrb4;->i:Lpb4;

    .line 158
    .line 159
    if-ne v8, v3, :cond_a

    .line 160
    .line 161
    if-eqz v8, :cond_a

    .line 162
    .line 163
    iget-object v3, v8, Lpb4;->o:Lpj4;

    .line 164
    .line 165
    move v8, v4

    .line 166
    :goto_6
    iget-object v9, v0, Ljb4;->f:[Lt71;

    .line 167
    .line 168
    const/4 v11, 0x2

    .line 169
    if-ge v8, v11, :cond_a

    .line 170
    .line 171
    invoke-virtual {v3, v8}, Lpj4;->a(I)Z

    .line 172
    .line 173
    .line 174
    move-result v11

    .line 175
    if-eqz v11, :cond_9

    .line 176
    .line 177
    aget-object v9, v9, v8

    .line 178
    .line 179
    iget-object v9, v9, Lt71;->e:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v9, Lkg4;

    .line 182
    .line 183
    iget v9, v9, Lkg4;->g:I

    .line 184
    .line 185
    const/4 v11, 0x1

    .line 186
    if-ne v9, v11, :cond_a

    .line 187
    .line 188
    iget-object v9, v3, Lpj4;->g:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v9, [Ljc4;

    .line 191
    .line 192
    aget-object v9, v9, v8

    .line 193
    .line 194
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    :cond_9
    add-int/lit8 v8, v8, 0x1

    .line 198
    .line 199
    goto :goto_6

    .line 200
    :cond_a
    move-object v13, v7

    .line 201
    move-object v12, v10

    .line 202
    move-object/from16 v11, v16

    .line 203
    .line 204
    goto :goto_7

    .line 205
    :cond_b
    iget-object v3, v3, Ldc4;->b:Lkh4;

    .line 206
    .line 207
    invoke-virtual {v2, v3}, Lkh4;->equals(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v3

    .line 211
    if-nez v3, :cond_c

    .line 212
    .line 213
    iget-object v9, v0, Ljb4;->j:Lpj4;

    .line 214
    .line 215
    sget-object v8, Lri4;->d:Lri4;

    .line 216
    .line 217
    sget-object v10, Lsn3;->j:Lsn3;

    .line 218
    .line 219
    :cond_c
    move-object v11, v8

    .line 220
    move-object v12, v9

    .line 221
    move-object v13, v10

    .line 222
    :goto_7
    if-eqz p8, :cond_f

    .line 223
    .line 224
    iget-object v3, v0, Ljb4;->L:Lr60;

    .line 225
    .line 226
    iget-boolean v7, v3, Lr60;->d:Z

    .line 227
    .line 228
    if-eqz v7, :cond_e

    .line 229
    .line 230
    iget v7, v3, Lr60;->e:I

    .line 231
    .line 232
    const/4 v8, 0x5

    .line 233
    if-eq v7, v8, :cond_e

    .line 234
    .line 235
    if-ne v1, v8, :cond_d

    .line 236
    .line 237
    const/4 v4, 0x1

    .line 238
    :cond_d
    invoke-static {v4}, Lzt0;->D(Z)V

    .line 239
    .line 240
    .line 241
    goto :goto_8

    .line 242
    :cond_e
    const/4 v4, 0x1

    .line 243
    iput-boolean v4, v3, Lr60;->c:Z

    .line 244
    .line 245
    iput-boolean v4, v3, Lr60;->d:Z

    .line 246
    .line 247
    iput v1, v3, Lr60;->e:I

    .line 248
    .line 249
    :cond_f
    :goto_8
    iget-object v1, v0, Ljb4;->K:Ldc4;

    .line 250
    .line 251
    iget-wide v3, v1, Ldc4;->p:J

    .line 252
    .line 253
    invoke-virtual {v0, v3, v4}, Ljb4;->R(J)J

    .line 254
    .line 255
    .line 256
    move-result-wide v9

    .line 257
    move-wide/from16 v3, p2

    .line 258
    .line 259
    move-wide/from16 v7, p6

    .line 260
    .line 261
    invoke-virtual/range {v1 .. v13}, Ldc4;->b(Lkh4;JJJJLri4;Lpj4;Ljava/util/List;)Ldc4;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    return-object v1
.end method

.method public final O([ZJ)V
    .locals 9

    .line 1
    iget-object v0, p0, Ljb4;->w:Lrb4;

    .line 2
    .line 3
    iget-object v2, v0, Lrb4;->i:Lpb4;

    .line 4
    .line 5
    iget-object v0, v2, Lpb4;->o:Lpj4;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    move v3, v1

    .line 9
    :goto_0
    const/4 v7, 0x2

    .line 10
    iget-object v8, p0, Ljb4;->f:[Lt71;

    .line 11
    .line 12
    if-ge v3, v7, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0, v3}, Lpj4;->a(I)Z

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    if-nez v4, :cond_0

    .line 19
    .line 20
    aget-object v4, v8, v3

    .line 21
    .line 22
    invoke-virtual {v4}, Lt71;->b()V

    .line 23
    .line 24
    .line 25
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move v3, v1

    .line 29
    :goto_1
    if-ge v3, v7, :cond_4

    .line 30
    .line 31
    invoke-virtual {v0, v3}, Lpj4;->a(I)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    aget-object v1, v8, v3

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Lt71;->m(Lpb4;)Lkg4;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    if-eqz v1, :cond_3

    .line 44
    .line 45
    :cond_2
    move-wide v5, p2

    .line 46
    goto :goto_2

    .line 47
    :cond_3
    aget-boolean v4, p1, v3

    .line 48
    .line 49
    move-object v1, p0

    .line 50
    move-wide v5, p2

    .line 51
    invoke-virtual/range {v1 .. v6}, Ljb4;->P(Lpb4;IZJ)V

    .line 52
    .line 53
    .line 54
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 55
    .line 56
    move-wide p2, v5

    .line 57
    goto :goto_1

    .line 58
    :cond_4
    return-void
.end method

.method public final P(Lpb4;IZJ)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Ljb4;->f:[Lt71;

    .line 6
    .line 7
    aget-object v10, v2, p2

    .line 8
    .line 9
    invoke-virtual {v10}, Lt71;->g()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    goto/16 :goto_9

    .line 16
    .line 17
    :cond_0
    iget-object v2, v0, Ljb4;->w:Lrb4;

    .line 18
    .line 19
    iget-object v2, v2, Lrb4;->h:Lpb4;

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    const/4 v11, 0x1

    .line 23
    if-ne v1, v2, :cond_1

    .line 24
    .line 25
    move v12, v11

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move v12, v3

    .line 28
    :goto_0
    iget-object v2, v1, Lpb4;->o:Lpj4;

    .line 29
    .line 30
    iget-object v4, v2, Lpj4;->g:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v4, [Ljc4;

    .line 33
    .line 34
    aget-object v4, v4, p2

    .line 35
    .line 36
    iget-object v2, v2, Lpj4;->h:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v2, [Lnj4;

    .line 39
    .line 40
    aget-object v2, v2, p2

    .line 41
    .line 42
    invoke-virtual {v0}, Ljb4;->T()Z

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    if-eqz v5, :cond_2

    .line 47
    .line 48
    iget-object v5, v0, Ljb4;->K:Ldc4;

    .line 49
    .line 50
    iget v5, v5, Ldc4;->e:I

    .line 51
    .line 52
    const/4 v6, 0x3

    .line 53
    if-ne v5, v6, :cond_2

    .line 54
    .line 55
    move v13, v11

    .line 56
    goto :goto_1

    .line 57
    :cond_2
    move v13, v3

    .line 58
    :goto_1
    if-nez p3, :cond_3

    .line 59
    .line 60
    if-eqz v13, :cond_3

    .line 61
    .line 62
    move v14, v11

    .line 63
    goto :goto_2

    .line 64
    :cond_3
    move v14, v3

    .line 65
    :goto_2
    iget v5, v0, Ljb4;->V:I

    .line 66
    .line 67
    add-int/2addr v5, v11

    .line 68
    iput v5, v0, Ljb4;->V:I

    .line 69
    .line 70
    iget-object v5, v1, Lpb4;->c:[Lli4;

    .line 71
    .line 72
    aget-object v5, v5, p2

    .line 73
    .line 74
    iget-wide v7, v1, Lpb4;->p:J

    .line 75
    .line 76
    iget-object v6, v1, Lpb4;->g:Lqb4;

    .line 77
    .line 78
    iget-object v9, v6, Lqb4;->a:Lkh4;

    .line 79
    .line 80
    if-eqz v2, :cond_4

    .line 81
    .line 82
    invoke-interface {v2}, Lnj4;->b()I

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    move v15, v3

    .line 87
    goto :goto_3

    .line 88
    :cond_4
    move v6, v3

    .line 89
    move v15, v6

    .line 90
    :goto_3
    new-array v3, v6, [Lph4;

    .line 91
    .line 92
    :goto_4
    if-ge v15, v6, :cond_5

    .line 93
    .line 94
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-interface {v2, v15}, Lnj4;->c(I)Lph4;

    .line 98
    .line 99
    .line 100
    move-result-object v16

    .line 101
    aput-object v16, v3, v15

    .line 102
    .line 103
    add-int/lit8 v15, v15, 0x1

    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_5
    iget v2, v10, Lt71;->b:I

    .line 107
    .line 108
    iget-object v15, v0, Ljb4;->s:Lg53;

    .line 109
    .line 110
    if-eqz v2, :cond_6

    .line 111
    .line 112
    const/4 v6, 0x2

    .line 113
    if-eq v2, v6, :cond_6

    .line 114
    .line 115
    const/4 v6, 0x4

    .line 116
    if-ne v2, v6, :cond_7

    .line 117
    .line 118
    :cond_6
    move-object v2, v5

    .line 119
    move-wide/from16 v5, p4

    .line 120
    .line 121
    goto :goto_6

    .line 122
    :cond_7
    iput-boolean v11, v10, Lt71;->d:Z

    .line 123
    .line 124
    iget-object v2, v10, Lt71;->f:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v2, Lkg4;

    .line 127
    .line 128
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    iget v6, v2, Lkg4;->m:I

    .line 132
    .line 133
    if-nez v6, :cond_8

    .line 134
    .line 135
    move v6, v11

    .line 136
    goto :goto_5

    .line 137
    :cond_8
    const/4 v6, 0x0

    .line 138
    :goto_5
    invoke-static {v6}, Lzt0;->b0(Z)V

    .line 139
    .line 140
    .line 141
    iput-object v4, v2, Lkg4;->i:Ljc4;

    .line 142
    .line 143
    iput-object v9, v2, Lkg4;->v:Lkh4;

    .line 144
    .line 145
    iput v11, v2, Lkg4;->m:I

    .line 146
    .line 147
    invoke-virtual {v2, v14, v12}, Lkg4;->p0(ZZ)V

    .line 148
    .line 149
    .line 150
    move-object v4, v5

    .line 151
    move-wide/from16 v5, p4

    .line 152
    .line 153
    invoke-virtual/range {v2 .. v9}, Lkg4;->l0([Lph4;Lli4;JJLkh4;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2, v5, v6, v14, v11}, Lkg4;->L(JZZ)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v15, v2}, Lg53;->c(Lkg4;)V

    .line 160
    .line 161
    .line 162
    goto :goto_8

    .line 163
    :goto_6
    iput-boolean v11, v10, Lt71;->c:Z

    .line 164
    .line 165
    iget-object v11, v10, Lt71;->e:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v11, Lkg4;

    .line 168
    .line 169
    move-object/from16 p3, v2

    .line 170
    .line 171
    iget v2, v11, Lkg4;->m:I

    .line 172
    .line 173
    if-nez v2, :cond_9

    .line 174
    .line 175
    const/4 v2, 0x1

    .line 176
    goto :goto_7

    .line 177
    :cond_9
    const/4 v2, 0x0

    .line 178
    :goto_7
    invoke-static {v2}, Lzt0;->b0(Z)V

    .line 179
    .line 180
    .line 181
    iput-object v4, v11, Lkg4;->i:Ljc4;

    .line 182
    .line 183
    iput-object v9, v11, Lkg4;->v:Lkh4;

    .line 184
    .line 185
    const/4 v2, 0x1

    .line 186
    iput v2, v11, Lkg4;->m:I

    .line 187
    .line 188
    invoke-virtual {v11, v14, v12}, Lkg4;->p0(ZZ)V

    .line 189
    .line 190
    .line 191
    move-object v4, v11

    .line 192
    move v11, v2

    .line 193
    move-object v2, v4

    .line 194
    move-object/from16 v4, p3

    .line 195
    .line 196
    invoke-virtual/range {v2 .. v9}, Lkg4;->l0([Lph4;Lli4;JJLkh4;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v2, v5, v6, v14, v11}, Lkg4;->L(JZZ)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v15, v2}, Lg53;->c(Lkg4;)V

    .line 203
    .line 204
    .line 205
    :goto_8
    new-instance v2, Lza4;

    .line 206
    .line 207
    invoke-direct {v2, v0}, Lza4;-><init>(Ljb4;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v10, v1}, Lt71;->m(Lpb4;)Lkg4;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    const/16 v3, 0xb

    .line 218
    .line 219
    invoke-interface {v1, v3, v2}, Lfc4;->a(ILjava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    if-eqz v13, :cond_a

    .line 223
    .line 224
    if-eqz v12, :cond_a

    .line 225
    .line 226
    invoke-virtual {v10}, Lt71;->D()V

    .line 227
    .line 228
    .line 229
    :cond_a
    :goto_9
    return-void
.end method

.method public final Q(Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Ljb4;->w:Lrb4;

    .line 2
    .line 3
    iget-object v0, v0, Lrb4;->k:Lpb4;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Ljb4;->K:Ldc4;

    .line 8
    .line 9
    iget-object v1, v1, Ldc4;->b:Lkh4;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v1, v0, Lpb4;->g:Lqb4;

    .line 13
    .line 14
    iget-object v1, v1, Lqb4;->a:Lkh4;

    .line 15
    .line 16
    :goto_0
    iget-object v2, p0, Ljb4;->K:Ldc4;

    .line 17
    .line 18
    iget-object v2, v2, Ldc4;->k:Lkh4;

    .line 19
    .line 20
    invoke-virtual {v2, v1}, Lkh4;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_1

    .line 25
    .line 26
    iget-object v3, p0, Ljb4;->K:Ldc4;

    .line 27
    .line 28
    invoke-virtual {v3, v1}, Ldc4;->g(Lkh4;)Ldc4;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iput-object v1, p0, Ljb4;->K:Ldc4;

    .line 33
    .line 34
    :cond_1
    iget-object v1, p0, Ljb4;->K:Ldc4;

    .line 35
    .line 36
    if-nez v0, :cond_2

    .line 37
    .line 38
    iget-wide v3, v1, Ldc4;->r:J

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    invoke-virtual {v0}, Lpb4;->d()J

    .line 42
    .line 43
    .line 44
    move-result-wide v3

    .line 45
    :goto_1
    iput-wide v3, v1, Ldc4;->p:J

    .line 46
    .line 47
    iget-object v1, p0, Ljb4;->K:Ldc4;

    .line 48
    .line 49
    iget-wide v3, v1, Ldc4;->p:J

    .line 50
    .line 51
    invoke-virtual {p0, v3, v4}, Ljb4;->R(J)J

    .line 52
    .line 53
    .line 54
    move-result-wide v3

    .line 55
    iput-wide v3, v1, Ldc4;->q:J

    .line 56
    .line 57
    if-eqz v2, :cond_3

    .line 58
    .line 59
    if-eqz p1, :cond_4

    .line 60
    .line 61
    :cond_3
    if-eqz v0, :cond_4

    .line 62
    .line 63
    iget-boolean p1, v0, Lpb4;->e:Z

    .line 64
    .line 65
    if-eqz p1, :cond_4

    .line 66
    .line 67
    iget-object p1, v0, Lpb4;->g:Lqb4;

    .line 68
    .line 69
    iget-object p1, p1, Lqb4;->a:Lkh4;

    .line 70
    .line 71
    iget-object v1, v0, Lpb4;->n:Lri4;

    .line 72
    .line 73
    iget-object v0, v0, Lpb4;->o:Lpj4;

    .line 74
    .line 75
    invoke-virtual {p0, p1, v1, v0}, Ljb4;->S(Lkh4;Lri4;Lpj4;)V

    .line 76
    .line 77
    .line 78
    :cond_4
    return-void
.end method

.method public final R(J)J
    .locals 7

    .line 1
    iget-object v0, p0, Ljb4;->w:Lrb4;

    .line 2
    .line 3
    iget-object v0, v0, Lrb4;->k:Lpb4;

    .line 4
    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-wide v1

    .line 10
    :cond_0
    iget-wide v3, p0, Ljb4;->X:J

    .line 11
    .line 12
    iget-wide v5, v0, Lpb4;->p:J

    .line 13
    .line 14
    sub-long/2addr v3, v5

    .line 15
    sub-long/2addr p1, v3

    .line 16
    invoke-static {v1, v2, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 17
    .line 18
    .line 19
    move-result-wide p1

    .line 20
    return-wide p1
.end method

.method public final S(Lkh4;Lri4;Lpj4;)V
    .locals 12

    .line 1
    iget-object p2, p0, Ljb4;->w:Lrb4;

    .line 2
    .line 3
    iget-object p2, p2, Lrb4;->k:Lpb4;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2}, Lpb4;->d()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    invoke-virtual {p0, v0, v1}, Ljb4;->R(J)J

    .line 13
    .line 14
    .line 15
    move-result-wide v6

    .line 16
    iget-object v0, p0, Ljb4;->K:Ldc4;

    .line 17
    .line 18
    iget-object v0, v0, Ldc4;->a:Loz1;

    .line 19
    .line 20
    iget-object p2, p2, Lpb4;->g:Lqb4;

    .line 21
    .line 22
    iget-object p2, p2, Lqb4;->a:Lkh4;

    .line 23
    .line 24
    invoke-virtual {p0, v0, p2}, Ljb4;->o(Loz1;Lkh4;)Z

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    if-eqz p2, :cond_0

    .line 29
    .line 30
    iget-object p2, p0, Ljb4;->h0:Lm44;

    .line 31
    .line 32
    iget-wide v0, p2, Lm44;->h:J

    .line 33
    .line 34
    :goto_0
    move-wide v10, v0

    .line 35
    goto :goto_1

    .line 36
    :cond_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :goto_1
    new-instance v2, Lkb4;

    .line 43
    .line 44
    iget-object p2, p0, Ljb4;->K:Ldc4;

    .line 45
    .line 46
    iget-object v4, p2, Ldc4;->a:Loz1;

    .line 47
    .line 48
    iget-object p2, p0, Ljb4;->s:Lg53;

    .line 49
    .line 50
    invoke-virtual {p2}, Lg53;->g()Lsr1;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    iget v8, p2, Lsr1;->a:F

    .line 55
    .line 56
    iget-object p2, p0, Ljb4;->K:Ldc4;

    .line 57
    .line 58
    iget-boolean p2, p2, Ldc4;->l:Z

    .line 59
    .line 60
    iget-boolean v9, p0, Ljb4;->P:Z

    .line 61
    .line 62
    iget-object v3, p0, Ljb4;->z:Lxd4;

    .line 63
    .line 64
    move-object v5, p1

    .line 65
    invoke-direct/range {v2 .. v11}, Lkb4;-><init>(Lxd4;Loz1;Lkh4;JFZJ)V

    .line 66
    .line 67
    .line 68
    iget-object p1, p3, Lpj4;->h:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p1, [Lnj4;

    .line 71
    .line 72
    iget-object p2, p0, Ljb4;->k:Llb4;

    .line 73
    .line 74
    invoke-interface {p2, v2, p1}, Llb4;->b(Lkb4;[Lnj4;)V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public final T()Z
    .locals 2

    .line 1
    iget-object v0, p0, Ljb4;->K:Ldc4;

    .line 2
    .line 3
    iget-boolean v1, v0, Ldc4;->l:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget v0, v0, Ldc4;->n:I

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public final U(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Ljb4;->f:[Lt71;

    .line 2
    .line 3
    aget-object p1, v0, p1

    .line 4
    .line 5
    :try_start_0
    iget-object v0, p0, Ljb4;->w:Lrb4;

    .line 6
    .line 7
    iget-object v0, v0, Lrb4;->h:Lpb4;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lt71;->m(Lpb4;)Lkg4;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v0, v0, Lkg4;->n:Lli4;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-interface {v0}, Lli4;->h()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    const/4 v0, 0x0

    .line 28
    throw v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    :catch_0
    move-exception v0

    .line 30
    goto :goto_0

    .line 31
    :catch_1
    move-exception v0

    .line 32
    :goto_0
    iget-object p1, p1, Lt71;->e:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p1, Lkg4;

    .line 35
    .line 36
    iget p1, p1, Lkg4;->g:I

    .line 37
    .line 38
    throw v0
.end method

.method public final V()Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Ljb4;->C:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    move v0, v1

    .line 8
    :goto_0
    const/4 v2, 0x2

    .line 9
    if-ge v0, v2, :cond_2

    .line 10
    .line 11
    iget-object v2, p0, Ljb4;->f:[Lt71;

    .line 12
    .line 13
    aget-object v2, v2, v0

    .line 14
    .line 15
    invoke-virtual {v2}, Lt71;->q()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_2
    return v1
.end method

.method public final a(Ljava/io/IOException;I)V
    .locals 2

    .line 1
    new-instance v0, Lb84;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, p1, p2}, Lb84;-><init>(ILjava/lang/Exception;I)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Ljb4;->w:Lrb4;

    .line 8
    .line 9
    iget-object p1, p1, Lrb4;->h:Lpb4;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p1, Lpb4;->g:Lqb4;

    .line 14
    .line 15
    iget-object p1, p1, Lqb4;->a:Lkh4;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lb84;->a(Lkh4;)Lb84;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :cond_0
    const-string p1, "ExoPlayerImplInternal"

    .line 22
    .line 23
    const-string p2, "Playback error"

    .line 24
    .line 25
    invoke-static {p1, p2, v0}, La30;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v1, v1}, Ljb4;->u(ZZ)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Ljb4;->K:Ldc4;

    .line 32
    .line 33
    invoke-virtual {p1, v0}, Ldc4;->e(Lb84;)Ldc4;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, Ljb4;->K:Ldc4;

    .line 38
    .line 39
    return-void
.end method

.method public final b(JJLph4;Landroid/media/MediaFormat;)V
    .locals 0

    .line 1
    iget-boolean p1, p0, Ljb4;->H:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Ljb4;->m:Ld13;

    .line 6
    .line 7
    iget-object p1, p1, Ld13;->a:Landroid/os/Handler;

    .line 8
    .line 9
    invoke-static {}, Ld13;->f()Lv03;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    const/16 p3, 0x25

    .line 14
    .line 15
    invoke-virtual {p1, p3}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p2, Lv03;->a:Landroid/os/Message;

    .line 20
    .line 21
    invoke-virtual {p2}, Lv03;->a()V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public final bridge synthetic c(Lmi4;)V
    .locals 2

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    check-cast p1, Ljh4;

    .line 4
    .line 5
    iget-object v1, p0, Ljb4;->m:Ld13;

    .line 6
    .line 7
    invoke-virtual {v1, v0, p1}, Ld13;->a(ILjava/lang/Object;)Lv03;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Lv03;->a()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final d(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Ljb4;->K:Ldc4;

    .line 2
    .line 3
    iget v1, v0, Ldc4;->e:I

    .line 4
    .line 5
    if-eq v1, p1, :cond_1

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    if-eq p1, v1, :cond_0

    .line 9
    .line 10
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    iput-wide v1, p0, Ljb4;->c0:J

    .line 16
    .line 17
    :cond_0
    invoke-virtual {v0, p1}, Ldc4;->d(I)Ldc4;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Ljb4;->K:Ldc4;

    .line 22
    .line 23
    :cond_1
    return-void
.end method

.method public final e()V
    .locals 4

    .line 1
    iget-object v0, p0, Ljb4;->L:Lr60;

    .line 2
    .line 3
    iget-object v1, p0, Ljb4;->K:Ldc4;

    .line 4
    .line 5
    iget-boolean v2, v0, Lr60;->c:Z

    .line 6
    .line 7
    iget-object v3, v0, Lr60;->f:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, Ldc4;

    .line 10
    .line 11
    if-eq v3, v1, :cond_0

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v3, 0x0

    .line 16
    :goto_0
    or-int/2addr v2, v3

    .line 17
    iput-boolean v2, v0, Lr60;->c:Z

    .line 18
    .line 19
    iput-object v1, v0, Lr60;->f:Ljava/lang/Object;

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    iget-object v1, p0, Ljb4;->v:Lci3;

    .line 24
    .line 25
    iget-object v1, v1, Lci3;->g:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Lya4;

    .line 28
    .line 29
    new-instance v2, Lsz2;

    .line 30
    .line 31
    const/16 v3, 0x14

    .line 32
    .line 33
    invoke-direct {v2, v1, v0, v3}, Lsz2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 34
    .line 35
    .line 36
    iget-object v0, v1, Lya4;->q:Ld13;

    .line 37
    .line 38
    invoke-virtual {v0, v2}, Ld13;->d(Ljava/lang/Runnable;)Z

    .line 39
    .line 40
    .line 41
    new-instance v0, Lr60;

    .line 42
    .line 43
    iget-object v1, p0, Ljb4;->K:Ldc4;

    .line 44
    .line 45
    invoke-direct {v0, v1}, Lr60;-><init>(Ldc4;)V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, Ljb4;->L:Lr60;

    .line 49
    .line 50
    :cond_1
    return-void
.end method

.method public final f(F)V
    .locals 6

    .line 1
    iput p1, p0, Ljb4;->g0:F

    .line 2
    .line 3
    iget-object v0, p0, Ljb4;->D:Lr24;

    .line 4
    .line 5
    iget v0, v0, Lr24;->g:F

    .line 6
    .line 7
    mul-float/2addr p1, v0

    .line 8
    const/4 v0, 0x0

    .line 9
    :goto_0
    const/4 v1, 0x2

    .line 10
    if-ge v0, v1, :cond_2

    .line 11
    .line 12
    iget-object v2, p0, Ljb4;->f:[Lt71;

    .line 13
    .line 14
    aget-object v2, v2, v0

    .line 15
    .line 16
    iget-object v3, v2, Lt71;->e:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, Lkg4;

    .line 19
    .line 20
    iget v4, v3, Lkg4;->g:I

    .line 21
    .line 22
    const/4 v5, 0x1

    .line 23
    if-eq v4, v5, :cond_0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-interface {v3, v1, v4}, Lfc4;->a(ILjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object v2, v2, Lt71;->f:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v2, Lkg4;

    .line 36
    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    invoke-interface {v2, v1, v4}, Lfc4;->a(ILjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    return-void
.end method

.method public final g(Ljh4;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ljb4;->m:Ld13;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Ld13;->a(ILjava/lang/Object;)Lv03;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Lv03;->a()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final h(IIIZ)V
    .locals 6

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    if-eqz p4, :cond_1

    .line 5
    .line 6
    if-eq p1, v0, :cond_0

    .line 7
    .line 8
    move p4, v1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move p1, v0

    .line 11
    :cond_1
    move p4, v2

    .line 12
    :goto_0
    const/4 v3, 0x2

    .line 13
    if-ne p1, v0, :cond_2

    .line 14
    .line 15
    move p3, v3

    .line 16
    goto :goto_1

    .line 17
    :cond_2
    if-ne p3, v3, :cond_3

    .line 18
    .line 19
    move p3, v1

    .line 20
    :cond_3
    :goto_1
    iget-boolean v0, p0, Ljb4;->G:Z

    .line 21
    .line 22
    if-nez p1, :cond_4

    .line 23
    .line 24
    move p2, v1

    .line 25
    goto :goto_2

    .line 26
    :cond_4
    if-ne p2, v1, :cond_6

    .line 27
    .line 28
    if-eqz v0, :cond_5

    .line 29
    .line 30
    const/4 p2, 0x4

    .line 31
    goto :goto_2

    .line 32
    :cond_5
    move p2, v2

    .line 33
    :cond_6
    :goto_2
    iget-object p1, p0, Ljb4;->K:Ldc4;

    .line 34
    .line 35
    iget-boolean v0, p1, Ldc4;->l:Z

    .line 36
    .line 37
    if-ne v0, p4, :cond_7

    .line 38
    .line 39
    iget v0, p1, Ldc4;->n:I

    .line 40
    .line 41
    if-ne v0, p2, :cond_7

    .line 42
    .line 43
    iget v0, p1, Ldc4;->m:I

    .line 44
    .line 45
    if-eq v0, p3, :cond_d

    .line 46
    .line 47
    :cond_7
    invoke-virtual {p1, p3, p2, p4}, Ldc4;->h(IIZ)Ldc4;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iput-object p1, p0, Ljb4;->K:Ldc4;

    .line 52
    .line 53
    invoke-virtual {p0, v2, v2}, Ljb4;->y(ZZ)V

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, Ljb4;->w:Lrb4;

    .line 57
    .line 58
    iget-object p2, p1, Lrb4;->h:Lpb4;

    .line 59
    .line 60
    :goto_3
    if-eqz p2, :cond_9

    .line 61
    .line 62
    iget-object p3, p2, Lpb4;->o:Lpj4;

    .line 63
    .line 64
    iget-object p3, p3, Lpj4;->h:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p3, [Lnj4;

    .line 67
    .line 68
    array-length p4, p3

    .line 69
    move v0, v2

    .line 70
    :goto_4
    if-ge v0, p4, :cond_8

    .line 71
    .line 72
    aget-object v4, p3, v0

    .line 73
    .line 74
    add-int/lit8 v0, v0, 0x1

    .line 75
    .line 76
    goto :goto_4

    .line 77
    :cond_8
    iget-object p2, p2, Lpb4;->m:Lpb4;

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_9
    invoke-virtual {p0}, Ljb4;->T()Z

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    if-nez p2, :cond_a

    .line 85
    .line 86
    invoke-virtual {p0}, Ljb4;->k()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Ljb4;->l()V

    .line 90
    .line 91
    .line 92
    iget-object p2, p0, Ljb4;->K:Ldc4;

    .line 93
    .line 94
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    iget-wide p2, p0, Ljb4;->X:J

    .line 98
    .line 99
    invoke-virtual {p1, p2, p3}, Lrb4;->n(J)V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :cond_a
    iget-object p1, p0, Ljb4;->K:Ldc4;

    .line 104
    .line 105
    iget p1, p1, Ldc4;->e:I

    .line 106
    .line 107
    const/4 p2, 0x3

    .line 108
    iget-object p3, p0, Ljb4;->m:Ld13;

    .line 109
    .line 110
    if-ne p1, p2, :cond_c

    .line 111
    .line 112
    iget-object p1, p0, Ljb4;->s:Lg53;

    .line 113
    .line 114
    iput-boolean v1, p1, Lg53;->g:Z

    .line 115
    .line 116
    iget-object p1, p1, Lg53;->h:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast p1, Lnc4;

    .line 119
    .line 120
    iget-boolean p2, p1, Lnc4;->f:Z

    .line 121
    .line 122
    if-nez p2, :cond_b

    .line 123
    .line 124
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 125
    .line 126
    .line 127
    move-result-wide v4

    .line 128
    iput-wide v4, p1, Lnc4;->h:J

    .line 129
    .line 130
    iput-boolean v1, p1, Lnc4;->f:Z

    .line 131
    .line 132
    :cond_b
    invoke-virtual {p0}, Ljb4;->j()V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p3, v3}, Ld13;->b(I)Z

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :cond_c
    if-ne p1, v3, :cond_d

    .line 140
    .line 141
    invoke-virtual {p3, v3}, Ld13;->b(I)Z

    .line 142
    .line 143
    .line 144
    :cond_d
    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 36

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const-string v11, "Playback error"

    .line 6
    .line 7
    const-string v12, "ExoPlayerImplInternal"

    .line 8
    .line 9
    const/4 v15, 0x0

    .line 10
    const/4 v2, 0x2

    .line 11
    const/4 v3, 0x1

    .line 12
    const/4 v4, 0x0

    .line 13
    :try_start_0
    iget v5, v0, Landroid/os/Message;->what:I

    .line 14
    .line 15
    const/16 v6, 0xf

    .line 16
    .line 17
    const/4 v9, -0x1

    .line 18
    const/4 v10, 0x3

    .line 19
    packed-switch v5, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    :pswitch_0
    return v4

    .line 23
    :pswitch_1
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lkc4;

    .line 26
    .line 27
    iput-object v0, v1, Ljb4;->F:Lkc4;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljb4;->t()V

    .line 30
    .line 31
    .line 32
    :cond_0
    :goto_0
    move v8, v3

    .line 33
    goto/16 :goto_52

    .line 34
    .line 35
    :catch_0
    move-exception v0

    .line 36
    move v15, v2

    .line 37
    :goto_1
    move-object/from16 v23, v11

    .line 38
    .line 39
    goto/16 :goto_46

    .line 40
    .line 41
    :catch_1
    move-exception v0

    .line 42
    goto/16 :goto_48

    .line 43
    .line 44
    :catch_2
    move-exception v0

    .line 45
    goto/16 :goto_49

    .line 46
    .line 47
    :catch_3
    move-exception v0

    .line 48
    goto/16 :goto_4a

    .line 49
    .line 50
    :catch_4
    move-exception v0

    .line 51
    goto/16 :goto_4c

    .line 52
    .line 53
    :catch_5
    move-exception v0

    .line 54
    :goto_2
    move v15, v2

    .line 55
    goto/16 :goto_4d

    .line 56
    .line 57
    :pswitch_2
    iput-boolean v4, v1, Ljb4;->H:Z

    .line 58
    .line 59
    iget-object v0, v1, Ljb4;->I:Lib4;

    .line 60
    .line 61
    if-eqz v0, :cond_0

    .line 62
    .line 63
    invoke-virtual {v1, v0, v4}, Ljb4;->q(Lib4;Z)V

    .line 64
    .line 65
    .line 66
    iput-object v15, v1, Ljb4;->I:Lib4;

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :pswitch_3
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v0, Ljava/lang/Boolean;

    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_2

    .line 78
    .line 79
    iget v5, v1, Ljb4;->J:I

    .line 80
    .line 81
    if-lez v5, :cond_1

    .line 82
    .line 83
    iget-object v6, v1, Ljb4;->B:Ld13;

    .line 84
    .line 85
    new-instance v7, Lbh3;

    .line 86
    .line 87
    invoke-direct {v7, v1, v5}, Lbh3;-><init>(Ljb4;I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v6, v7}, Ld13;->d(Ljava/lang/Runnable;)Z

    .line 91
    .line 92
    .line 93
    :cond_1
    iput v4, v1, Ljb4;->J:I

    .line 94
    .line 95
    iput-boolean v4, v1, Ljb4;->H:Z

    .line 96
    .line 97
    iget-object v5, v1, Ljb4;->m:Ld13;

    .line 98
    .line 99
    const/16 v6, 0x25

    .line 100
    .line 101
    invoke-virtual {v5, v6}, Ld13;->c(I)V

    .line 102
    .line 103
    .line 104
    iget-object v5, v1, Ljb4;->I:Lib4;

    .line 105
    .line 106
    if-eqz v5, :cond_2

    .line 107
    .line 108
    invoke-virtual {v1, v5, v4}, Ljb4;->q(Lib4;Z)V

    .line 109
    .line 110
    .line 111
    iput-object v15, v1, Ljb4;->I:Lib4;

    .line 112
    .line 113
    :cond_2
    iput-boolean v0, v1, Ljb4;->G:Z

    .line 114
    .line 115
    invoke-virtual {v1}, Ljb4;->t()V

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :pswitch_4
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v0, Lbe1;

    .line 122
    .line 123
    iget-object v5, v1, Ljb4;->f:[Lt71;

    .line 124
    .line 125
    move v6, v4

    .line 126
    :goto_3
    if-ge v6, v2, :cond_0

    .line 127
    .line 128
    aget-object v7, v5, v6

    .line 129
    .line 130
    invoke-virtual {v7, v0}, Lt71;->f(Lbe1;)V

    .line 131
    .line 132
    .line 133
    add-int/lit8 v6, v6, 0x1

    .line 134
    .line 135
    goto :goto_3

    .line 136
    :pswitch_5
    iget v0, v1, Ljb4;->g0:F

    .line 137
    .line 138
    invoke-virtual {v1, v0}, Ljb4;->f(F)V

    .line 139
    .line 140
    .line 141
    goto :goto_0

    .line 142
    :pswitch_6
    iget v0, v0, Landroid/os/Message;->arg1:I

    .line 143
    .line 144
    iget-object v5, v1, Ljb4;->K:Ldc4;

    .line 145
    .line 146
    iget-boolean v6, v5, Ldc4;->l:Z

    .line 147
    .line 148
    iget v7, v5, Ldc4;->n:I

    .line 149
    .line 150
    iget v5, v5, Ldc4;->m:I

    .line 151
    .line 152
    invoke-virtual {v1, v0, v7, v5, v6}, Ljb4;->h(IIIZ)V

    .line 153
    .line 154
    .line 155
    goto :goto_0

    .line 156
    :pswitch_7
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v0, Ljava/lang/Float;

    .line 159
    .line 160
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    invoke-virtual {v1, v0}, Ljb4;->f(F)V

    .line 165
    .line 166
    .line 167
    goto/16 :goto_0

    .line 168
    .line 169
    :pswitch_8
    iget-object v5, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v5, Lin2;

    .line 172
    .line 173
    iget v0, v0, Landroid/os/Message;->arg1:I

    .line 174
    .line 175
    iget-object v6, v1, Ljb4;->i:Llj4;

    .line 176
    .line 177
    invoke-virtual {v6, v5}, Llj4;->b(Lin2;)V

    .line 178
    .line 179
    .line 180
    iget-object v6, v1, Ljb4;->D:Lr24;

    .line 181
    .line 182
    if-nez v0, :cond_3

    .line 183
    .line 184
    move-object v5, v15

    .line 185
    :cond_3
    invoke-virtual {v6, v5}, Lr24;->a(Lin2;)V

    .line 186
    .line 187
    .line 188
    iget-object v0, v1, Ljb4;->K:Ldc4;

    .line 189
    .line 190
    iget-boolean v5, v0, Ldc4;->l:Z

    .line 191
    .line 192
    iget v6, v0, Ldc4;->n:I

    .line 193
    .line 194
    iget v7, v0, Ldc4;->m:I

    .line 195
    .line 196
    iget v0, v0, Ldc4;->e:I

    .line 197
    .line 198
    iget-object v8, v1, Ljb4;->D:Lr24;

    .line 199
    .line 200
    invoke-virtual {v8, v0, v5}, Lr24;->b(IZ)I

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    invoke-virtual {v1, v0, v6, v7, v5}, Ljb4;->h(IIIZ)V

    .line 205
    .line 206
    .line 207
    goto/16 :goto_0

    .line 208
    .line 209
    :pswitch_9
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v0, Landroid/util/Pair;

    .line 212
    .line 213
    iget-object v5, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 214
    .line 215
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v0, Lhp2;

    .line 218
    .line 219
    iget-object v6, v1, Ljb4;->f:[Lt71;

    .line 220
    .line 221
    move v7, v4

    .line 222
    :goto_4
    if-ge v7, v2, :cond_4

    .line 223
    .line 224
    aget-object v8, v6, v7

    .line 225
    .line 226
    invoke-virtual {v8, v5}, Lt71;->e(Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    add-int/lit8 v7, v7, 0x1

    .line 230
    .line 231
    goto :goto_4

    .line 232
    :cond_4
    iget-object v5, v1, Ljb4;->K:Ldc4;

    .line 233
    .line 234
    iget v5, v5, Ldc4;->e:I

    .line 235
    .line 236
    if-eq v5, v10, :cond_5

    .line 237
    .line 238
    if-ne v5, v2, :cond_6

    .line 239
    .line 240
    :cond_5
    iget-object v5, v1, Ljb4;->m:Ld13;

    .line 241
    .line 242
    invoke-virtual {v5, v2}, Ld13;->b(I)Z

    .line 243
    .line 244
    .line 245
    :cond_6
    if-eqz v0, :cond_0

    .line 246
    .line 247
    invoke-virtual {v0}, Lhp2;->a()Z

    .line 248
    .line 249
    .line 250
    goto/16 :goto_0

    .line 251
    .line 252
    :pswitch_a
    iget-object v0, v1, Ljb4;->L:Lr60;

    .line 253
    .line 254
    invoke-virtual {v0, v3}, Lr60;->f(I)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v1, v4, v4, v4, v3}, Ljb4;->v(ZZZZ)V

    .line 258
    .line 259
    .line 260
    iget-object v0, v1, Ljb4;->k:Llb4;

    .line 261
    .line 262
    iget-object v5, v1, Ljb4;->z:Lxd4;

    .line 263
    .line 264
    invoke-interface {v0, v5}, Llb4;->d(Lxd4;)V

    .line 265
    .line 266
    .line 267
    iget-object v0, v1, Ljb4;->K:Ldc4;

    .line 268
    .line 269
    iget-object v0, v0, Ldc4;->a:Loz1;

    .line 270
    .line 271
    invoke-virtual {v0}, Loz1;->g()Z

    .line 272
    .line 273
    .line 274
    move-result v0

    .line 275
    if-eq v3, v0, :cond_7

    .line 276
    .line 277
    move v0, v2

    .line 278
    goto :goto_5

    .line 279
    :cond_7
    const/4 v0, 0x4

    .line 280
    :goto_5
    invoke-virtual {v1, v0}, Ljb4;->d(I)V

    .line 281
    .line 282
    .line 283
    iget-object v0, v1, Ljb4;->K:Ldc4;

    .line 284
    .line 285
    iget-boolean v5, v0, Ldc4;->l:Z

    .line 286
    .line 287
    iget v6, v0, Ldc4;->n:I

    .line 288
    .line 289
    iget v7, v0, Ldc4;->m:I

    .line 290
    .line 291
    iget v0, v0, Ldc4;->e:I

    .line 292
    .line 293
    iget-object v8, v1, Ljb4;->D:Lr24;

    .line 294
    .line 295
    invoke-virtual {v8, v0, v5}, Lr24;->b(IZ)I

    .line 296
    .line 297
    .line 298
    move-result v0

    .line 299
    invoke-virtual {v1, v0, v6, v7, v5}, Ljb4;->h(IIIZ)V

    .line 300
    .line 301
    .line 302
    iget-object v0, v1, Ljb4;->x:Luu0;

    .line 303
    .line 304
    iget-object v5, v1, Ljb4;->l:Luj4;

    .line 305
    .line 306
    check-cast v5, Lxj4;

    .line 307
    .line 308
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    invoke-virtual {v0, v5}, Luu0;->f(Lws3;)V

    .line 312
    .line 313
    .line 314
    iget-object v0, v1, Ljb4;->m:Ld13;

    .line 315
    .line 316
    invoke-virtual {v0, v2}, Ld13;->b(I)Z

    .line 317
    .line 318
    .line 319
    goto/16 :goto_0

    .line 320
    .line 321
    :pswitch_b
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 322
    .line 323
    check-cast v0, Lla4;

    .line 324
    .line 325
    iput-object v0, v1, Ljb4;->d0:Lla4;

    .line 326
    .line 327
    iget-object v5, v1, Ljb4;->w:Lrb4;

    .line 328
    .line 329
    iget-object v6, v1, Ljb4;->K:Ldc4;

    .line 330
    .line 331
    iget-object v6, v6, Ldc4;->a:Loz1;

    .line 332
    .line 333
    invoke-virtual {v5, v0}, Lrb4;->m(Lla4;)V

    .line 334
    .line 335
    .line 336
    goto/16 :goto_0

    .line 337
    .line 338
    :pswitch_c
    iget v5, v0, Landroid/os/Message;->arg1:I

    .line 339
    .line 340
    iget v6, v0, Landroid/os/Message;->arg2:I

    .line 341
    .line 342
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 343
    .line 344
    check-cast v0, Ljava/util/List;

    .line 345
    .line 346
    iget-object v7, v1, Ljb4;->L:Lr60;

    .line 347
    .line 348
    invoke-virtual {v7, v3}, Lr60;->f(I)V

    .line 349
    .line 350
    .line 351
    iget-object v7, v1, Ljb4;->x:Luu0;

    .line 352
    .line 353
    invoke-virtual {v7, v5, v6, v0}, Luu0;->c(IILjava/util/List;)Loz1;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    invoke-virtual {v1, v0, v4}, Ljb4;->F(Loz1;Z)V

    .line 358
    .line 359
    .line 360
    goto/16 :goto_0

    .line 361
    .line 362
    :pswitch_d
    invoke-virtual {v1}, Ljb4;->D()V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v1, v3}, Ljb4;->i(Z)V

    .line 366
    .line 367
    .line 368
    goto/16 :goto_0

    .line 369
    .line 370
    :pswitch_e
    invoke-virtual {v1}, Ljb4;->D()V

    .line 371
    .line 372
    .line 373
    invoke-virtual {v1, v3}, Ljb4;->i(Z)V

    .line 374
    .line 375
    .line 376
    goto/16 :goto_0

    .line 377
    .line 378
    :pswitch_f
    iget v0, v0, Landroid/os/Message;->arg1:I

    .line 379
    .line 380
    if-eqz v0, :cond_8

    .line 381
    .line 382
    move v0, v3

    .line 383
    goto :goto_6

    .line 384
    :cond_8
    move v0, v4

    .line 385
    :goto_6
    iput-boolean v0, v1, Ljb4;->N:Z

    .line 386
    .line 387
    invoke-virtual {v1}, Ljb4;->J()V

    .line 388
    .line 389
    .line 390
    iget-boolean v0, v1, Ljb4;->O:Z

    .line 391
    .line 392
    if-eqz v0, :cond_0

    .line 393
    .line 394
    iget-object v0, v1, Ljb4;->w:Lrb4;

    .line 395
    .line 396
    invoke-virtual {v0}, Lrb4;->t()Lpb4;

    .line 397
    .line 398
    .line 399
    move-result-object v5

    .line 400
    invoke-virtual {v0}, Lrb4;->s()Lpb4;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    if-eq v5, v0, :cond_0

    .line 405
    .line 406
    invoke-virtual {v1, v3}, Ljb4;->i(Z)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v1, v4}, Ljb4;->Q(Z)V

    .line 410
    .line 411
    .line 412
    goto/16 :goto_0

    .line 413
    .line 414
    :pswitch_10
    iget-object v0, v1, Ljb4;->x:Luu0;

    .line 415
    .line 416
    invoke-virtual {v0}, Luu0;->h()Loz1;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    invoke-virtual {v1, v0, v3}, Ljb4;->F(Loz1;Z)V

    .line 421
    .line 422
    .line 423
    goto/16 :goto_0

    .line 424
    .line 425
    :pswitch_11
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 426
    .line 427
    check-cast v0, Lni4;

    .line 428
    .line 429
    iget-object v5, v1, Ljb4;->L:Lr60;

    .line 430
    .line 431
    invoke-virtual {v5, v3}, Lr60;->f(I)V

    .line 432
    .line 433
    .line 434
    iget-object v5, v1, Ljb4;->x:Luu0;

    .line 435
    .line 436
    invoke-virtual {v5, v0}, Luu0;->l(Lni4;)Loz1;

    .line 437
    .line 438
    .line 439
    move-result-object v0

    .line 440
    invoke-virtual {v1, v0, v4}, Ljb4;->F(Loz1;Z)V

    .line 441
    .line 442
    .line 443
    goto/16 :goto_0

    .line 444
    .line 445
    :pswitch_12
    iget v5, v0, Landroid/os/Message;->arg1:I

    .line 446
    .line 447
    iget v6, v0, Landroid/os/Message;->arg2:I

    .line 448
    .line 449
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 450
    .line 451
    check-cast v0, Lni4;

    .line 452
    .line 453
    iget-object v7, v1, Ljb4;->L:Lr60;

    .line 454
    .line 455
    invoke-virtual {v7, v3}, Lr60;->f(I)V

    .line 456
    .line 457
    .line 458
    iget-object v7, v1, Ljb4;->x:Luu0;

    .line 459
    .line 460
    invoke-virtual {v7, v5, v6, v0}, Luu0;->k(IILni4;)Loz1;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    invoke-virtual {v1, v0, v4}, Ljb4;->F(Loz1;Z)V

    .line 465
    .line 466
    .line 467
    goto/16 :goto_0

    .line 468
    .line 469
    :pswitch_13
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 470
    .line 471
    invoke-static {v0}, Lga1;->o(Ljava/lang/Object;)V

    .line 472
    .line 473
    .line 474
    iget-object v0, v1, Ljb4;->L:Lr60;

    .line 475
    .line 476
    invoke-virtual {v0, v3}, Lr60;->f(I)V
    :try_end_0
    .catch Lb84; {:try_start_0 .. :try_end_0} :catch_5
    .catch Lif4; {:try_start_0 .. :try_end_0} :catch_4
    .catch Llq1; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ldi3; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 477
    .line 478
    .line 479
    :try_start_1
    throw v15
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    .line 480
    :pswitch_14
    :try_start_2
    iget-object v5, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 481
    .line 482
    check-cast v5, Lhb4;

    .line 483
    .line 484
    iget v0, v0, Landroid/os/Message;->arg1:I

    .line 485
    .line 486
    iget-object v6, v1, Ljb4;->L:Lr60;

    .line 487
    .line 488
    invoke-virtual {v6, v3}, Lr60;->f(I)V

    .line 489
    .line 490
    .line 491
    iget-object v6, v1, Ljb4;->x:Luu0;

    .line 492
    .line 493
    if-ne v0, v9, :cond_9

    .line 494
    .line 495
    iget-object v0, v6, Luu0;->h:Ljava/lang/Object;

    .line 496
    .line 497
    check-cast v0, Ljava/util/ArrayList;

    .line 498
    .line 499
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 500
    .line 501
    .line 502
    move-result v0

    .line 503
    :cond_9
    iget-object v7, v5, Lhb4;->a:Ljava/util/ArrayList;

    .line 504
    .line 505
    iget-object v5, v5, Lhb4;->d:Lni4;

    .line 506
    .line 507
    invoke-virtual {v6, v0, v7, v5}, Luu0;->j(ILjava/util/List;Lni4;)Loz1;

    .line 508
    .line 509
    .line 510
    move-result-object v0

    .line 511
    invoke-virtual {v1, v0, v4}, Ljb4;->F(Loz1;Z)V

    .line 512
    .line 513
    .line 514
    goto/16 :goto_0

    .line 515
    .line 516
    :pswitch_15
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 517
    .line 518
    check-cast v0, Lhb4;

    .line 519
    .line 520
    iget-object v5, v1, Ljb4;->L:Lr60;

    .line 521
    .line 522
    invoke-virtual {v5, v3}, Lr60;->f(I)V

    .line 523
    .line 524
    .line 525
    iget v5, v0, Lhb4;->b:I

    .line 526
    .line 527
    if-eq v5, v9, :cond_a

    .line 528
    .line 529
    new-instance v5, Lib4;

    .line 530
    .line 531
    new-instance v6, Lic4;

    .line 532
    .line 533
    iget-object v7, v0, Lhb4;->a:Ljava/util/ArrayList;

    .line 534
    .line 535
    iget-object v8, v0, Lhb4;->d:Lni4;

    .line 536
    .line 537
    invoke-direct {v6, v7, v8}, Lic4;-><init>(Ljava/util/List;Lni4;)V

    .line 538
    .line 539
    .line 540
    iget v7, v0, Lhb4;->b:I

    .line 541
    .line 542
    invoke-virtual {v0}, Lhb4;->a()J

    .line 543
    .line 544
    .line 545
    move-result-wide v8

    .line 546
    invoke-direct {v5, v6, v7, v8, v9}, Lib4;-><init>(Loz1;IJ)V

    .line 547
    .line 548
    .line 549
    iput-object v5, v1, Ljb4;->W:Lib4;

    .line 550
    .line 551
    :cond_a
    iget-object v5, v1, Ljb4;->x:Luu0;

    .line 552
    .line 553
    iget-object v6, v0, Lhb4;->a:Ljava/util/ArrayList;

    .line 554
    .line 555
    iget-object v0, v0, Lhb4;->d:Lni4;

    .line 556
    .line 557
    invoke-virtual {v5, v6, v0}, Luu0;->i(Ljava/util/List;Lni4;)Loz1;

    .line 558
    .line 559
    .line 560
    move-result-object v0

    .line 561
    invoke-virtual {v1, v0, v4}, Ljb4;->F(Loz1;Z)V

    .line 562
    .line 563
    .line 564
    goto/16 :goto_0

    .line 565
    .line 566
    :pswitch_16
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 567
    .line 568
    check-cast v0, Lsr1;

    .line 569
    .line 570
    iget v5, v0, Lsr1;->a:F

    .line 571
    .line 572
    invoke-virtual {v1, v0, v5, v3, v4}, Ljb4;->K(Lsr1;FZZ)V

    .line 573
    .line 574
    .line 575
    goto/16 :goto_0

    .line 576
    .line 577
    :pswitch_17
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 578
    .line 579
    check-cast v0, Lgc4;

    .line 580
    .line 581
    iget-object v5, v0, Lgc4;->e:Landroid/os/Looper;

    .line 582
    .line 583
    invoke-virtual {v5}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 584
    .line 585
    .line 586
    move-result-object v6

    .line 587
    invoke-virtual {v6}, Ljava/lang/Thread;->isAlive()Z

    .line 588
    .line 589
    .line 590
    move-result v6

    .line 591
    if-nez v6, :cond_b

    .line 592
    .line 593
    const-string v5, "Trying to send message on a dead thread."

    .line 594
    .line 595
    invoke-static {v5}, La30;->x(Ljava/lang/String;)V

    .line 596
    .line 597
    .line 598
    invoke-virtual {v0, v4}, Lgc4;->b(Z)V

    .line 599
    .line 600
    .line 601
    goto/16 :goto_0

    .line 602
    .line 603
    :cond_b
    iget-object v6, v1, Ljb4;->u:Lpz;

    .line 604
    .line 605
    invoke-virtual {v6, v5, v15}, Lpz;->p(Landroid/os/Looper;Landroid/os/Handler$Callback;)Ld13;

    .line 606
    .line 607
    .line 608
    move-result-object v5

    .line 609
    new-instance v6, Lbh3;

    .line 610
    .line 611
    const/16 v7, 0xb

    .line 612
    .line 613
    invoke-direct {v6, v7, v0}, Lbh3;-><init>(ILjava/lang/Object;)V

    .line 614
    .line 615
    .line 616
    invoke-virtual {v5, v6}, Ld13;->d(Ljava/lang/Runnable;)Z

    .line 617
    .line 618
    .line 619
    goto/16 :goto_0

    .line 620
    .line 621
    :pswitch_18
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 622
    .line 623
    move-object v5, v0

    .line 624
    check-cast v5, Lgc4;

    .line 625
    .line 626
    iget-object v0, v5, Lgc4;->e:Landroid/os/Looper;

    .line 627
    .line 628
    iget-object v7, v1, Ljb4;->o:Landroid/os/Looper;

    .line 629
    .line 630
    if-ne v0, v7, :cond_d

    .line 631
    .line 632
    monitor-enter v5

    .line 633
    monitor-exit v5
    :try_end_2
    .catch Lb84; {:try_start_2 .. :try_end_2} :catch_5
    .catch Lif4; {:try_start_2 .. :try_end_2} :catch_4
    .catch Llq1; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ldi3; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    .line 634
    :try_start_3
    iget-object v0, v5, Lgc4;->a:Lfc4;

    .line 635
    .line 636
    iget v6, v5, Lgc4;->c:I

    .line 637
    .line 638
    iget-object v7, v5, Lgc4;->d:Ljava/lang/Object;

    .line 639
    .line 640
    invoke-interface {v0, v6, v7}, Lfc4;->a(ILjava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 641
    .line 642
    .line 643
    :try_start_4
    invoke-virtual {v5, v3}, Lgc4;->b(Z)V

    .line 644
    .line 645
    .line 646
    iget-object v0, v1, Ljb4;->K:Ldc4;

    .line 647
    .line 648
    iget v0, v0, Ldc4;->e:I

    .line 649
    .line 650
    if-eq v0, v10, :cond_c

    .line 651
    .line 652
    if-ne v0, v2, :cond_0

    .line 653
    .line 654
    :cond_c
    iget-object v0, v1, Ljb4;->m:Ld13;

    .line 655
    .line 656
    invoke-virtual {v0, v2}, Ld13;->b(I)Z

    .line 657
    .line 658
    .line 659
    goto/16 :goto_0

    .line 660
    .line 661
    :catchall_0
    move-exception v0

    .line 662
    invoke-virtual {v5, v3}, Lgc4;->b(Z)V

    .line 663
    .line 664
    .line 665
    throw v0

    .line 666
    :cond_d
    iget-object v0, v1, Ljb4;->m:Ld13;

    .line 667
    .line 668
    invoke-virtual {v0, v6, v5}, Ld13;->a(ILjava/lang/Object;)Lv03;

    .line 669
    .line 670
    .line 671
    move-result-object v0

    .line 672
    invoke-virtual {v0}, Lv03;->a()V

    .line 673
    .line 674
    .line 675
    goto/16 :goto_0

    .line 676
    .line 677
    :pswitch_19
    iget v5, v0, Landroid/os/Message;->arg1:I

    .line 678
    .line 679
    if-eqz v5, :cond_e

    .line 680
    .line 681
    move v5, v3

    .line 682
    goto :goto_7

    .line 683
    :cond_e
    move v5, v4

    .line 684
    :goto_7
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 685
    .line 686
    check-cast v0, Lhp2;

    .line 687
    .line 688
    iget-boolean v6, v1, Ljb4;->U:Z

    .line 689
    .line 690
    if-eq v6, v5, :cond_f

    .line 691
    .line 692
    iput-boolean v5, v1, Ljb4;->U:Z

    .line 693
    .line 694
    if-nez v5, :cond_f

    .line 695
    .line 696
    iget-object v5, v1, Ljb4;->f:[Lt71;

    .line 697
    .line 698
    move v6, v4

    .line 699
    :goto_8
    if-ge v6, v2, :cond_f

    .line 700
    .line 701
    aget-object v7, v5, v6

    .line 702
    .line 703
    invoke-virtual {v7}, Lt71;->b()V

    .line 704
    .line 705
    .line 706
    add-int/lit8 v6, v6, 0x1

    .line 707
    .line 708
    goto :goto_8

    .line 709
    :cond_f
    if-eqz v0, :cond_0

    .line 710
    .line 711
    invoke-virtual {v0}, Lhp2;->a()Z

    .line 712
    .line 713
    .line 714
    goto/16 :goto_0

    .line 715
    .line 716
    :pswitch_1a
    iget v0, v0, Landroid/os/Message;->arg1:I

    .line 717
    .line 718
    if-eqz v0, :cond_10

    .line 719
    .line 720
    move v0, v3

    .line 721
    goto :goto_9

    .line 722
    :cond_10
    move v0, v4

    .line 723
    :goto_9
    iput-boolean v0, v1, Ljb4;->T:Z

    .line 724
    .line 725
    iget-object v5, v1, Ljb4;->w:Lrb4;

    .line 726
    .line 727
    iget-object v6, v1, Ljb4;->K:Ldc4;

    .line 728
    .line 729
    iget-object v6, v6, Ldc4;->a:Loz1;

    .line 730
    .line 731
    invoke-virtual {v5, v6, v0}, Lrb4;->l(Loz1;Z)I

    .line 732
    .line 733
    .line 734
    move-result v0

    .line 735
    and-int/lit8 v5, v0, 0x1

    .line 736
    .line 737
    if-eqz v5, :cond_11

    .line 738
    .line 739
    invoke-virtual {v1, v3}, Ljb4;->i(Z)V

    .line 740
    .line 741
    .line 742
    goto :goto_a

    .line 743
    :cond_11
    and-int/2addr v0, v2

    .line 744
    if-eqz v0, :cond_12

    .line 745
    .line 746
    invoke-virtual {v1}, Ljb4;->C()V

    .line 747
    .line 748
    .line 749
    :cond_12
    :goto_a
    invoke-virtual {v1, v4}, Ljb4;->Q(Z)V

    .line 750
    .line 751
    .line 752
    goto/16 :goto_0

    .line 753
    .line 754
    :pswitch_1b
    iget v0, v0, Landroid/os/Message;->arg1:I

    .line 755
    .line 756
    iput v0, v1, Ljb4;->S:I

    .line 757
    .line 758
    iget-object v5, v1, Ljb4;->w:Lrb4;

    .line 759
    .line 760
    iget-object v6, v1, Ljb4;->K:Ldc4;

    .line 761
    .line 762
    iget-object v6, v6, Ldc4;->a:Loz1;

    .line 763
    .line 764
    invoke-virtual {v5, v6, v0}, Lrb4;->k(Loz1;I)I

    .line 765
    .line 766
    .line 767
    move-result v0

    .line 768
    and-int/lit8 v5, v0, 0x1

    .line 769
    .line 770
    if-eqz v5, :cond_13

    .line 771
    .line 772
    invoke-virtual {v1, v3}, Ljb4;->i(Z)V

    .line 773
    .line 774
    .line 775
    goto :goto_b

    .line 776
    :cond_13
    and-int/2addr v0, v2

    .line 777
    if-eqz v0, :cond_14

    .line 778
    .line 779
    invoke-virtual {v1}, Ljb4;->C()V

    .line 780
    .line 781
    .line 782
    :cond_14
    :goto_b
    invoke-virtual {v1, v4}, Ljb4;->Q(Z)V

    .line 783
    .line 784
    .line 785
    goto/16 :goto_0

    .line 786
    .line 787
    :pswitch_1c
    invoke-virtual {v1}, Ljb4;->D()V

    .line 788
    .line 789
    .line 790
    goto/16 :goto_0

    .line 791
    .line 792
    :pswitch_1d
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 793
    .line 794
    check-cast v0, Ljh4;

    .line 795
    .line 796
    iget-object v5, v1, Ljb4;->w:Lrb4;

    .line 797
    .line 798
    iget-object v6, v5, Lrb4;->k:Lpb4;

    .line 799
    .line 800
    if-eqz v6, :cond_15

    .line 801
    .line 802
    iget-object v6, v6, Lpb4;->a:Ljava/lang/Object;

    .line 803
    .line 804
    if-ne v6, v0, :cond_15

    .line 805
    .line 806
    move v6, v3

    .line 807
    goto :goto_c

    .line 808
    :cond_15
    move v6, v4

    .line 809
    :goto_c
    if-eqz v6, :cond_16

    .line 810
    .line 811
    iget-wide v6, v1, Ljb4;->X:J

    .line 812
    .line 813
    invoke-virtual {v5, v6, v7}, Lrb4;->n(J)V

    .line 814
    .line 815
    .line 816
    invoke-virtual {v1}, Ljb4;->L()V

    .line 817
    .line 818
    .line 819
    goto/16 :goto_0

    .line 820
    .line 821
    :cond_16
    iget-object v5, v5, Lrb4;->l:Lpb4;

    .line 822
    .line 823
    if-eqz v5, :cond_17

    .line 824
    .line 825
    iget-object v5, v5, Lpb4;->a:Ljava/lang/Object;

    .line 826
    .line 827
    if-ne v5, v0, :cond_17

    .line 828
    .line 829
    move v0, v3

    .line 830
    goto :goto_d

    .line 831
    :cond_17
    move v0, v4

    .line 832
    :goto_d
    if-eqz v0, :cond_0

    .line 833
    .line 834
    invoke-virtual {v1}, Ljb4;->I()V
    :try_end_4
    .catch Lb84; {:try_start_4 .. :try_end_4} :catch_5
    .catch Lif4; {:try_start_4 .. :try_end_4} :catch_4
    .catch Llq1; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ldi3; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_0

    .line 835
    .line 836
    .line 837
    goto/16 :goto_0

    .line 838
    .line 839
    :pswitch_1e
    :try_start_5
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 840
    .line 841
    check-cast v0, Ljh4;

    .line 842
    .line 843
    iget-object v5, v1, Ljb4;->w:Lrb4;

    .line 844
    .line 845
    iget-object v6, v5, Lrb4;->k:Lpb4;

    .line 846
    .line 847
    if-eqz v6, :cond_18

    .line 848
    .line 849
    iget-object v7, v6, Lpb4;->a:Ljava/lang/Object;

    .line 850
    .line 851
    if-ne v7, v0, :cond_18

    .line 852
    .line 853
    move v7, v3

    .line 854
    goto :goto_e

    .line 855
    :cond_18
    move v7, v4

    .line 856
    :goto_e
    if-eqz v7, :cond_1d

    .line 857
    .line 858
    if-eqz v6, :cond_1c

    .line 859
    .line 860
    iget-boolean v0, v6, Lpb4;->e:Z
    :try_end_5
    .catch Lb84; {:try_start_5 .. :try_end_5} :catch_f
    .catch Lif4; {:try_start_5 .. :try_end_5} :catch_c
    .catch Llq1; {:try_start_5 .. :try_end_5} :catch_b
    .catch Ldi3; {:try_start_5 .. :try_end_5} :catch_a
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_9
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_e

    .line 861
    .line 862
    if-nez v0, :cond_19

    .line 863
    .line 864
    :try_start_6
    iget-object v0, v1, Ljb4;->s:Lg53;

    .line 865
    .line 866
    invoke-virtual {v0}, Lg53;->g()Lsr1;

    .line 867
    .line 868
    .line 869
    move-result-object v0

    .line 870
    iget v0, v0, Lsr1;->a:F

    .line 871
    .line 872
    iget-object v0, v1, Ljb4;->K:Ldc4;

    .line 873
    .line 874
    iget-object v0, v0, Ldc4;->a:Loz1;

    .line 875
    .line 876
    invoke-virtual {v6, v0}, Lpb4;->e(Loz1;)V
    :try_end_6
    .catch Lb84; {:try_start_6 .. :try_end_6} :catch_5
    .catch Lif4; {:try_start_6 .. :try_end_6} :catch_4
    .catch Llq1; {:try_start_6 .. :try_end_6} :catch_3
    .catch Ldi3; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_0

    .line 877
    .line 878
    .line 879
    :cond_19
    :try_start_7
    iget-object v0, v6, Lpb4;->g:Lqb4;

    .line 880
    .line 881
    iget-object v0, v0, Lqb4;->a:Lkh4;

    .line 882
    .line 883
    invoke-virtual {v6}, Lpb4;->j()Lri4;

    .line 884
    .line 885
    .line 886
    move-result-object v7

    .line 887
    invoke-virtual {v6}, Lpb4;->k()Lpj4;

    .line 888
    .line 889
    .line 890
    move-result-object v8

    .line 891
    invoke-virtual {v1, v0, v7, v8}, Ljb4;->S(Lkh4;Lri4;Lpj4;)V

    .line 892
    .line 893
    .line 894
    invoke-virtual {v5}, Lrb4;->s()Lpb4;

    .line 895
    .line 896
    .line 897
    move-result-object v0

    .line 898
    if-ne v6, v0, :cond_1a

    .line 899
    .line 900
    iget-object v0, v6, Lpb4;->g:Lqb4;

    .line 901
    .line 902
    iget-wide v7, v0, Lqb4;->b:J

    .line 903
    .line 904
    invoke-virtual {v1, v7, v8, v3}, Ljb4;->s(JZ)V

    .line 905
    .line 906
    .line 907
    iget-object v0, v1, Ljb4;->w:Lrb4;

    .line 908
    .line 909
    new-array v5, v2, [Z

    .line 910
    .line 911
    iget-object v0, v0, Lrb4;->i:Lpb4;

    .line 912
    .line 913
    invoke-virtual {v0}, Lpb4;->a()J

    .line 914
    .line 915
    .line 916
    move-result-wide v7

    .line 917
    invoke-virtual {v1, v5, v7, v8}, Ljb4;->O([ZJ)V

    .line 918
    .line 919
    .line 920
    iput-boolean v3, v6, Lpb4;->h:Z

    .line 921
    .line 922
    iget-object v0, v1, Ljb4;->K:Ldc4;
    :try_end_7
    .catch Lb84; {:try_start_7 .. :try_end_7} :catch_f
    .catch Lif4; {:try_start_7 .. :try_end_7} :catch_c
    .catch Llq1; {:try_start_7 .. :try_end_7} :catch_b
    .catch Ldi3; {:try_start_7 .. :try_end_7} :catch_a
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_9
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_e

    .line 923
    .line 924
    move v5, v2

    .line 925
    :try_start_8
    iget-object v2, v0, Ldc4;->b:Lkh4;

    .line 926
    .line 927
    iget-object v6, v6, Lpb4;->g:Lqb4;

    .line 928
    .line 929
    iget-wide v6, v6, Lqb4;->b:J

    .line 930
    .line 931
    iget-wide v8, v0, Ldc4;->c:J
    :try_end_8
    .catch Lb84; {:try_start_8 .. :try_end_8} :catch_d
    .catch Lif4; {:try_start_8 .. :try_end_8} :catch_c
    .catch Llq1; {:try_start_8 .. :try_end_8} :catch_b
    .catch Ldi3; {:try_start_8 .. :try_end_8} :catch_a
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_9
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_8} :catch_8

    .line 932
    .line 933
    move v10, v4

    .line 934
    move-wide/from16 v34, v8

    .line 935
    .line 936
    move v8, v3

    .line 937
    move-wide v3, v6

    .line 938
    move v7, v5

    .line 939
    move-wide/from16 v5, v34

    .line 940
    .line 941
    const/4 v9, 0x0

    .line 942
    move/from16 v16, v10

    .line 943
    .line 944
    const/4 v10, 0x5

    .line 945
    move/from16 v17, v7

    .line 946
    .line 947
    move/from16 v18, v8

    .line 948
    .line 949
    move-wide v7, v3

    .line 950
    move/from16 v13, v17

    .line 951
    .line 952
    move-object/from16 v17, v15

    .line 953
    .line 954
    move v15, v13

    .line 955
    move/from16 v14, v16

    .line 956
    .line 957
    move/from16 v13, v18

    .line 958
    .line 959
    :try_start_9
    invoke-virtual/range {v1 .. v10}, Ljb4;->N(Lkh4;JJJZI)Ldc4;

    .line 960
    .line 961
    .line 962
    move-result-object v0

    .line 963
    iput-object v0, v1, Ljb4;->K:Ldc4;

    .line 964
    .line 965
    goto :goto_f

    .line 966
    :catch_6
    move-exception v0

    .line 967
    goto/16 :goto_1

    .line 968
    .line 969
    :catch_7
    move-exception v0

    .line 970
    goto/16 :goto_4d

    .line 971
    .line 972
    :catch_8
    move-exception v0

    .line 973
    move v13, v3

    .line 974
    move v14, v4

    .line 975
    move v15, v5

    .line 976
    goto/16 :goto_1

    .line 977
    .line 978
    :catch_9
    move-exception v0

    .line 979
    move v13, v3

    .line 980
    goto/16 :goto_48

    .line 981
    .line 982
    :catch_a
    move-exception v0

    .line 983
    move v13, v3

    .line 984
    goto/16 :goto_49

    .line 985
    .line 986
    :catch_b
    move-exception v0

    .line 987
    move v13, v3

    .line 988
    goto/16 :goto_4a

    .line 989
    .line 990
    :catch_c
    move-exception v0

    .line 991
    move v13, v3

    .line 992
    goto/16 :goto_4c

    .line 993
    .line 994
    :catch_d
    move-exception v0

    .line 995
    move v13, v3

    .line 996
    move v14, v4

    .line 997
    move-object/from16 v17, v15

    .line 998
    .line 999
    move v15, v5

    .line 1000
    goto/16 :goto_4d

    .line 1001
    .line 1002
    :catch_e
    move-exception v0

    .line 1003
    move v15, v2

    .line 1004
    move v13, v3

    .line 1005
    move v14, v4

    .line 1006
    goto/16 :goto_1

    .line 1007
    .line 1008
    :catch_f
    move-exception v0

    .line 1009
    move v13, v3

    .line 1010
    move v14, v4

    .line 1011
    move-object/from16 v17, v15

    .line 1012
    .line 1013
    goto/16 :goto_2

    .line 1014
    .line 1015
    :cond_1a
    move v13, v3

    .line 1016
    move v14, v4

    .line 1017
    move-object/from16 v17, v15

    .line 1018
    .line 1019
    move v15, v2

    .line 1020
    :goto_f
    invoke-virtual {v1}, Ljb4;->L()V

    .line 1021
    .line 1022
    .line 1023
    :cond_1b
    :goto_10
    move v8, v13

    .line 1024
    goto/16 :goto_52

    .line 1025
    .line 1026
    :cond_1c
    move v13, v3

    .line 1027
    move v14, v4

    .line 1028
    move-object/from16 v17, v15

    .line 1029
    .line 1030
    move v15, v2

    .line 1031
    throw v17

    .line 1032
    :cond_1d
    move v13, v3

    .line 1033
    move v14, v4

    .line 1034
    move-object/from16 v17, v15

    .line 1035
    .line 1036
    move v15, v2

    .line 1037
    invoke-virtual {v5, v0}, Lrb4;->A(Ljh4;)Lpb4;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v2

    .line 1041
    if-eqz v2, :cond_1b

    .line 1042
    .line 1043
    iget-boolean v3, v2, Lpb4;->e:Z

    .line 1044
    .line 1045
    xor-int/2addr v3, v13

    .line 1046
    invoke-static {v3}, Lzt0;->b0(Z)V

    .line 1047
    .line 1048
    .line 1049
    iget-object v3, v1, Ljb4;->s:Lg53;

    .line 1050
    .line 1051
    invoke-virtual {v3}, Lg53;->g()Lsr1;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v3

    .line 1055
    iget v3, v3, Lsr1;->a:F

    .line 1056
    .line 1057
    iget-object v3, v1, Ljb4;->K:Ldc4;

    .line 1058
    .line 1059
    iget-object v3, v3, Ldc4;->a:Loz1;

    .line 1060
    .line 1061
    invoke-virtual {v2, v3}, Lpb4;->e(Loz1;)V

    .line 1062
    .line 1063
    .line 1064
    iget-object v2, v5, Lrb4;->l:Lpb4;

    .line 1065
    .line 1066
    if-eqz v2, :cond_1e

    .line 1067
    .line 1068
    iget-object v2, v2, Lpb4;->a:Ljava/lang/Object;

    .line 1069
    .line 1070
    if-ne v2, v0, :cond_1e

    .line 1071
    .line 1072
    move v3, v13

    .line 1073
    goto :goto_11

    .line 1074
    :cond_1e
    move v3, v14

    .line 1075
    :goto_11
    if-eqz v3, :cond_1b

    .line 1076
    .line 1077
    invoke-virtual {v1}, Ljb4;->I()V

    .line 1078
    .line 1079
    .line 1080
    goto :goto_10

    .line 1081
    :pswitch_1f
    move v13, v3

    .line 1082
    move v14, v4

    .line 1083
    move-object/from16 v17, v15

    .line 1084
    .line 1085
    move v15, v2

    .line 1086
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1087
    .line 1088
    move-object v2, v0

    .line 1089
    check-cast v2, Lhp2;
    :try_end_9
    .catch Lb84; {:try_start_9 .. :try_end_9} :catch_7
    .catch Lif4; {:try_start_9 .. :try_end_9} :catch_4
    .catch Llq1; {:try_start_9 .. :try_end_9} :catch_3
    .catch Ldi3; {:try_start_9 .. :try_end_9} :catch_2
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_9 .. :try_end_9} :catch_6

    .line 1090
    .line 1091
    :try_start_a
    invoke-virtual {v1, v13, v14, v13, v14}, Ljb4;->v(ZZZZ)V

    .line 1092
    .line 1093
    .line 1094
    move v4, v14

    .line 1095
    :goto_12
    iget-object v0, v1, Ljb4;->f:[Lt71;

    .line 1096
    .line 1097
    if-ge v4, v15, :cond_1f

    .line 1098
    .line 1099
    iget-object v3, v1, Ljb4;->g:[Lkg4;

    .line 1100
    .line 1101
    aget-object v3, v3, v4

    .line 1102
    .line 1103
    invoke-virtual {v3}, Lkg4;->o0()V

    .line 1104
    .line 1105
    .line 1106
    aget-object v0, v0, v4

    .line 1107
    .line 1108
    invoke-virtual {v0}, Lt71;->d()V

    .line 1109
    .line 1110
    .line 1111
    add-int/lit8 v4, v4, 0x1

    .line 1112
    .line 1113
    goto :goto_12

    .line 1114
    :catchall_1
    move-exception v0

    .line 1115
    goto :goto_13

    .line 1116
    :cond_1f
    iget-object v0, v1, Ljb4;->k:Llb4;

    .line 1117
    .line 1118
    iget-object v3, v1, Ljb4;->z:Lxd4;

    .line 1119
    .line 1120
    invoke-interface {v0, v3}, Llb4;->h(Lxd4;)V

    .line 1121
    .line 1122
    .line 1123
    iget-object v0, v1, Ljb4;->D:Lr24;

    .line 1124
    .line 1125
    invoke-virtual {v0}, Lr24;->c()V

    .line 1126
    .line 1127
    .line 1128
    iget-object v0, v1, Ljb4;->i:Llj4;

    .line 1129
    .line 1130
    invoke-virtual {v0}, Llj4;->a()V

    .line 1131
    .line 1132
    .line 1133
    invoke-virtual {v1, v13}, Ljb4;->d(I)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 1134
    .line 1135
    .line 1136
    :try_start_b
    iget-object v0, v1, Ljb4;->m:Ld13;

    .line 1137
    .line 1138
    iget-object v0, v0, Ld13;->a:Landroid/os/Handler;

    .line 1139
    .line 1140
    move-object/from16 v3, v17

    .line 1141
    .line 1142
    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 1143
    .line 1144
    .line 1145
    iget-object v0, v1, Ljb4;->n:Lr2;

    .line 1146
    .line 1147
    invoke-virtual {v0}, Lr2;->h()V

    .line 1148
    .line 1149
    .line 1150
    invoke-virtual {v2}, Lhp2;->a()Z

    .line 1151
    .line 1152
    .line 1153
    return v13

    .line 1154
    :goto_13
    iget-object v3, v1, Ljb4;->m:Ld13;

    .line 1155
    .line 1156
    iget-object v3, v3, Ld13;->a:Landroid/os/Handler;

    .line 1157
    .line 1158
    const/4 v4, 0x0

    .line 1159
    invoke-virtual {v3, v4}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 1160
    .line 1161
    .line 1162
    iget-object v3, v1, Ljb4;->n:Lr2;

    .line 1163
    .line 1164
    invoke-virtual {v3}, Lr2;->h()V

    .line 1165
    .line 1166
    .line 1167
    invoke-virtual {v2}, Lhp2;->a()Z

    .line 1168
    .line 1169
    .line 1170
    throw v0

    .line 1171
    :pswitch_20
    move v15, v2

    .line 1172
    move v13, v3

    .line 1173
    move v14, v4

    .line 1174
    invoke-virtual {v1, v14, v13}, Ljb4;->u(ZZ)V

    .line 1175
    .line 1176
    .line 1177
    goto/16 :goto_10

    .line 1178
    .line 1179
    :pswitch_21
    move v15, v2

    .line 1180
    move v13, v3

    .line 1181
    move v14, v4

    .line 1182
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1183
    .line 1184
    check-cast v0, Llc4;

    .line 1185
    .line 1186
    iput-object v0, v1, Ljb4;->E:Llc4;

    .line 1187
    .line 1188
    goto/16 :goto_10

    .line 1189
    .line 1190
    :pswitch_22
    move v15, v2

    .line 1191
    move v13, v3

    .line 1192
    move v14, v4

    .line 1193
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1194
    .line 1195
    check-cast v0, Lsr1;

    .line 1196
    .line 1197
    iget-object v2, v1, Ljb4;->m:Ld13;

    .line 1198
    .line 1199
    const/16 v3, 0x10

    .line 1200
    .line 1201
    invoke-virtual {v2, v3}, Ld13;->c(I)V

    .line 1202
    .line 1203
    .line 1204
    iget-object v2, v1, Ljb4;->s:Lg53;

    .line 1205
    .line 1206
    invoke-virtual {v2, v0}, Lg53;->b(Lsr1;)V

    .line 1207
    .line 1208
    .line 1209
    iget-object v0, v1, Ljb4;->s:Lg53;

    .line 1210
    .line 1211
    invoke-virtual {v0}, Lg53;->g()Lsr1;

    .line 1212
    .line 1213
    .line 1214
    move-result-object v0

    .line 1215
    iget v2, v0, Lsr1;->a:F

    .line 1216
    .line 1217
    invoke-virtual {v1, v0, v2, v13, v13}, Ljb4;->K(Lsr1;FZZ)V

    .line 1218
    .line 1219
    .line 1220
    goto/16 :goto_10

    .line 1221
    .line 1222
    :pswitch_23
    move v15, v2

    .line 1223
    move v13, v3

    .line 1224
    move v14, v4

    .line 1225
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1226
    .line 1227
    check-cast v0, Lib4;

    .line 1228
    .line 1229
    invoke-virtual {v1, v0, v13}, Ljb4;->q(Lib4;Z)V
    :try_end_b
    .catch Lb84; {:try_start_b .. :try_end_b} :catch_7
    .catch Lif4; {:try_start_b .. :try_end_b} :catch_4
    .catch Llq1; {:try_start_b .. :try_end_b} :catch_3
    .catch Ldi3; {:try_start_b .. :try_end_b} :catch_2
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_b .. :try_end_b} :catch_6

    .line 1230
    .line 1231
    .line 1232
    goto/16 :goto_10

    .line 1233
    .line 1234
    :pswitch_24
    move v15, v2

    .line 1235
    move v13, v3

    .line 1236
    move v14, v4

    .line 1237
    :try_start_c
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 1238
    .line 1239
    .line 1240
    move-result-wide v7

    .line 1241
    iget-object v0, v1, Ljb4;->m:Ld13;

    .line 1242
    .line 1243
    invoke-virtual {v0, v15}, Ld13;->c(I)V

    .line 1244
    .line 1245
    .line 1246
    iget-object v2, v1, Ljb4;->K:Ldc4;

    .line 1247
    .line 1248
    iget-object v2, v2, Ldc4;->a:Loz1;

    .line 1249
    .line 1250
    invoke-virtual {v2}, Loz1;->g()Z

    .line 1251
    .line 1252
    .line 1253
    move-result v2

    .line 1254
    if-nez v2, :cond_20

    .line 1255
    .line 1256
    iget-object v2, v1, Ljb4;->x:Luu0;

    .line 1257
    .line 1258
    invoke-virtual {v2}, Luu0;->e()Z

    .line 1259
    .line 1260
    .line 1261
    move-result v2

    .line 1262
    if-nez v2, :cond_21

    .line 1263
    .line 1264
    :cond_20
    move-wide/from16 v26, v7

    .line 1265
    .line 1266
    move-object/from16 v23, v11

    .line 1267
    .line 1268
    move v11, v10

    .line 1269
    goto/16 :goto_30

    .line 1270
    .line 1271
    :cond_21
    iget-object v2, v1, Ljb4;->w:Lrb4;

    .line 1272
    .line 1273
    iget-wide v5, v1, Ljb4;->X:J

    .line 1274
    .line 1275
    invoke-virtual {v2, v5, v6}, Lrb4;->n(J)V

    .line 1276
    .line 1277
    .line 1278
    invoke-virtual {v2}, Lrb4;->o()Z

    .line 1279
    .line 1280
    .line 1281
    move-result v5
    :try_end_c
    .catch Lb84; {:try_start_c .. :try_end_c} :catch_12
    .catch Lif4; {:try_start_c .. :try_end_c} :catch_4
    .catch Llq1; {:try_start_c .. :try_end_c} :catch_3
    .catch Ldi3; {:try_start_c .. :try_end_c} :catch_2
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_c .. :try_end_c} :catch_6

    .line 1282
    if-eqz v5, :cond_25

    .line 1283
    .line 1284
    :try_start_d
    iget-wide v5, v1, Ljb4;->X:J

    .line 1285
    .line 1286
    iget-object v3, v1, Ljb4;->K:Ldc4;

    .line 1287
    .line 1288
    invoke-virtual {v2, v5, v6, v3}, Lrb4;->p(JLdc4;)Lqb4;

    .line 1289
    .line 1290
    .line 1291
    move-result-object v3

    .line 1292
    if-eqz v3, :cond_25

    .line 1293
    .line 1294
    invoke-virtual {v2, v3}, Lrb4;->q(Lqb4;)Lpb4;

    .line 1295
    .line 1296
    .line 1297
    move-result-object v4

    .line 1298
    iget-boolean v5, v4, Lpb4;->d:Z

    .line 1299
    .line 1300
    if-nez v5, :cond_22

    .line 1301
    .line 1302
    iget-wide v5, v3, Lqb4;->b:J

    .line 1303
    .line 1304
    iput-boolean v13, v4, Lpb4;->d:Z

    .line 1305
    .line 1306
    iget-object v0, v4, Lpb4;->a:Ljava/lang/Object;

    .line 1307
    .line 1308
    invoke-interface {v0, v1, v5, v6}, Ljh4;->a(Lih4;J)V

    .line 1309
    .line 1310
    .line 1311
    goto :goto_14

    .line 1312
    :cond_22
    iget-boolean v5, v4, Lpb4;->e:Z

    .line 1313
    .line 1314
    if-eqz v5, :cond_23

    .line 1315
    .line 1316
    iget-object v5, v4, Lpb4;->a:Ljava/lang/Object;

    .line 1317
    .line 1318
    const/16 v6, 0x8

    .line 1319
    .line 1320
    invoke-virtual {v0, v6, v5}, Ld13;->a(ILjava/lang/Object;)Lv03;

    .line 1321
    .line 1322
    .line 1323
    move-result-object v0

    .line 1324
    invoke-virtual {v0}, Lv03;->a()V

    .line 1325
    .line 1326
    .line 1327
    :cond_23
    :goto_14
    invoke-virtual {v2}, Lrb4;->s()Lpb4;

    .line 1328
    .line 1329
    .line 1330
    move-result-object v0

    .line 1331
    if-ne v0, v4, :cond_24

    .line 1332
    .line 1333
    iget-wide v3, v3, Lqb4;->b:J

    .line 1334
    .line 1335
    invoke-virtual {v1, v3, v4, v13}, Ljb4;->s(JZ)V

    .line 1336
    .line 1337
    .line 1338
    :cond_24
    invoke-virtual {v1, v14}, Ljb4;->Q(Z)V
    :try_end_d
    .catch Lb84; {:try_start_d .. :try_end_d} :catch_7
    .catch Lif4; {:try_start_d .. :try_end_d} :catch_4
    .catch Llq1; {:try_start_d .. :try_end_d} :catch_3
    .catch Ldi3; {:try_start_d .. :try_end_d} :catch_2
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_d .. :try_end_d} :catch_6

    .line 1339
    .line 1340
    .line 1341
    :cond_25
    :try_start_e
    iget-boolean v0, v1, Ljb4;->R:Z
    :try_end_e
    .catch Lb84; {:try_start_e .. :try_end_e} :catch_12
    .catch Lif4; {:try_start_e .. :try_end_e} :catch_4
    .catch Llq1; {:try_start_e .. :try_end_e} :catch_3
    .catch Ldi3; {:try_start_e .. :try_end_e} :catch_2
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_e .. :try_end_e} :catch_6

    .line 1342
    .line 1343
    if-eqz v0, :cond_26

    .line 1344
    .line 1345
    :try_start_f
    iget-object v0, v2, Lrb4;->k:Lpb4;

    .line 1346
    .line 1347
    invoke-static {v0}, Ljb4;->A(Lpb4;)Z

    .line 1348
    .line 1349
    .line 1350
    move-result v0

    .line 1351
    iput-boolean v0, v1, Ljb4;->R:Z

    .line 1352
    .line 1353
    invoke-virtual {v1}, Ljb4;->M()V
    :try_end_f
    .catch Lb84; {:try_start_f .. :try_end_f} :catch_7
    .catch Lif4; {:try_start_f .. :try_end_f} :catch_4
    .catch Llq1; {:try_start_f .. :try_end_f} :catch_3
    .catch Ldi3; {:try_start_f .. :try_end_f} :catch_2
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_f .. :try_end_f} :catch_6

    .line 1354
    .line 1355
    .line 1356
    goto :goto_15

    .line 1357
    :cond_26
    :try_start_10
    invoke-virtual {v1}, Ljb4;->L()V

    .line 1358
    .line 1359
    .line 1360
    :goto_15
    iget-boolean v0, v1, Ljb4;->O:Z

    .line 1361
    .line 1362
    const-wide/32 v21, 0x989680

    .line 1363
    .line 1364
    .line 1365
    if-nez v0, :cond_2a

    .line 1366
    .line 1367
    iget-boolean v0, v1, Ljb4;->C:Z

    .line 1368
    .line 1369
    if-eqz v0, :cond_2a

    .line 1370
    .line 1371
    iget-boolean v0, v1, Ljb4;->f0:Z

    .line 1372
    .line 1373
    if-nez v0, :cond_2a

    .line 1374
    .line 1375
    invoke-virtual {v1}, Ljb4;->V()Z

    .line 1376
    .line 1377
    .line 1378
    move-result v0

    .line 1379
    if-nez v0, :cond_2a

    .line 1380
    .line 1381
    invoke-virtual {v2}, Lrb4;->u()Lpb4;

    .line 1382
    .line 1383
    .line 1384
    move-result-object v0

    .line 1385
    if-eqz v0, :cond_2a

    .line 1386
    .line 1387
    invoke-virtual {v2}, Lrb4;->t()Lpb4;

    .line 1388
    .line 1389
    .line 1390
    move-result-object v3

    .line 1391
    if-ne v0, v3, :cond_2a

    .line 1392
    .line 1393
    invoke-virtual {v0}, Lpb4;->i()Lpb4;

    .line 1394
    .line 1395
    .line 1396
    move-result-object v3

    .line 1397
    if-eqz v3, :cond_2a

    .line 1398
    .line 1399
    invoke-virtual {v0}, Lpb4;->i()Lpb4;

    .line 1400
    .line 1401
    .line 1402
    move-result-object v3

    .line 1403
    iget-boolean v3, v3, Lpb4;->e:Z

    .line 1404
    .line 1405
    if-eqz v3, :cond_2a

    .line 1406
    .line 1407
    invoke-virtual {v0}, Lpb4;->i()Lpb4;

    .line 1408
    .line 1409
    .line 1410
    move-result-object v0
    :try_end_10
    .catch Lb84; {:try_start_10 .. :try_end_10} :catch_12
    .catch Lif4; {:try_start_10 .. :try_end_10} :catch_4
    .catch Llq1; {:try_start_10 .. :try_end_10} :catch_3
    .catch Ldi3; {:try_start_10 .. :try_end_10} :catch_2
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_10 .. :try_end_10} :catch_6

    .line 1411
    :try_start_11
    iget-boolean v3, v0, Lpb4;->e:Z

    .line 1412
    .line 1413
    invoke-static {v3}, Lzt0;->b0(Z)V

    .line 1414
    .line 1415
    .line 1416
    invoke-virtual {v0}, Lpb4;->a()J

    .line 1417
    .line 1418
    .line 1419
    move-result-wide v3

    .line 1420
    iget-wide v5, v1, Ljb4;->X:J

    .line 1421
    .line 1422
    sub-long/2addr v3, v5

    .line 1423
    iget-object v0, v1, Ljb4;->s:Lg53;

    .line 1424
    .line 1425
    invoke-virtual {v0}, Lg53;->g()Lsr1;

    .line 1426
    .line 1427
    .line 1428
    move-result-object v0

    .line 1429
    iget v0, v0, Lsr1;->a:F
    :try_end_11
    .catch Lb84; {:try_start_11 .. :try_end_11} :catch_13
    .catch Lif4; {:try_start_11 .. :try_end_11} :catch_4
    .catch Llq1; {:try_start_11 .. :try_end_11} :catch_3
    .catch Ldi3; {:try_start_11 .. :try_end_11} :catch_2
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_11 .. :try_end_11} :catch_6

    .line 1430
    .line 1431
    long-to-float v3, v3

    .line 1432
    div-float/2addr v3, v0

    .line 1433
    float-to-long v3, v3

    .line 1434
    cmp-long v0, v3, v21

    .line 1435
    .line 1436
    if-gtz v0, :cond_2a

    .line 1437
    .line 1438
    :try_start_12
    invoke-virtual {v2}, Lrb4;->w()V

    .line 1439
    .line 1440
    .line 1441
    move-object v0, v2

    .line 1442
    invoke-virtual {v0}, Lrb4;->u()Lpb4;

    .line 1443
    .line 1444
    .line 1445
    move-result-object v2

    .line 1446
    if-eqz v2, :cond_29

    .line 1447
    .line 1448
    invoke-virtual {v2}, Lpb4;->k()Lpj4;

    .line 1449
    .line 1450
    .line 1451
    move-result-object v3

    .line 1452
    move v4, v14

    .line 1453
    :goto_16
    iget-object v5, v1, Ljb4;->f:[Lt71;

    .line 1454
    .line 1455
    if-ge v4, v15, :cond_28

    .line 1456
    .line 1457
    invoke-virtual {v3, v4}, Lpj4;->a(I)Z

    .line 1458
    .line 1459
    .line 1460
    move-result v6

    .line 1461
    if-eqz v6, :cond_27

    .line 1462
    .line 1463
    aget-object v6, v5, v4

    .line 1464
    .line 1465
    invoke-virtual {v6}, Lt71;->o()Z

    .line 1466
    .line 1467
    .line 1468
    move-result v6

    .line 1469
    if-eqz v6, :cond_27

    .line 1470
    .line 1471
    aget-object v6, v5, v4

    .line 1472
    .line 1473
    invoke-virtual {v6}, Lt71;->q()Z

    .line 1474
    .line 1475
    .line 1476
    move-result v6

    .line 1477
    if-nez v6, :cond_27

    .line 1478
    .line 1479
    aget-object v5, v5, v4

    .line 1480
    .line 1481
    invoke-virtual {v5}, Lt71;->p()V

    .line 1482
    .line 1483
    .line 1484
    invoke-virtual {v2}, Lpb4;->a()J

    .line 1485
    .line 1486
    .line 1487
    move-result-wide v5
    :try_end_12
    .catch Lb84; {:try_start_12 .. :try_end_12} :catch_12
    .catch Lif4; {:try_start_12 .. :try_end_12} :catch_4
    .catch Llq1; {:try_start_12 .. :try_end_12} :catch_3
    .catch Ldi3; {:try_start_12 .. :try_end_12} :catch_2
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_12 .. :try_end_12} :catch_6

    .line 1488
    move-object/from16 v18, v3

    .line 1489
    .line 1490
    move v3, v4

    .line 1491
    const/4 v4, 0x0

    .line 1492
    move-object/from16 v23, v11

    .line 1493
    .line 1494
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    :try_start_13
    invoke-virtual/range {v1 .. v6}, Ljb4;->P(Lpb4;IZJ)V

    .line 1500
    .line 1501
    .line 1502
    goto :goto_18

    .line 1503
    :catch_10
    move-exception v0

    .line 1504
    goto/16 :goto_46

    .line 1505
    .line 1506
    :catch_11
    move-exception v0

    .line 1507
    :goto_17
    move-object/from16 v11, v23

    .line 1508
    .line 1509
    goto/16 :goto_4d

    .line 1510
    .line 1511
    :catch_12
    move-exception v0

    .line 1512
    move-object/from16 v23, v11

    .line 1513
    .line 1514
    goto/16 :goto_4d

    .line 1515
    .line 1516
    :cond_27
    move-object/from16 v18, v3

    .line 1517
    .line 1518
    move v3, v4

    .line 1519
    move-object/from16 v23, v11

    .line 1520
    .line 1521
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    :goto_18
    add-int/lit8 v4, v3, 0x1

    .line 1527
    .line 1528
    move-object/from16 v3, v18

    .line 1529
    .line 1530
    move-object/from16 v11, v23

    .line 1531
    .line 1532
    const/4 v10, 0x3

    .line 1533
    goto :goto_16

    .line 1534
    :cond_28
    move-object/from16 v23, v11

    .line 1535
    .line 1536
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    invoke-virtual {v1}, Ljb4;->V()Z

    .line 1542
    .line 1543
    .line 1544
    move-result v3

    .line 1545
    if-eqz v3, :cond_2b

    .line 1546
    .line 1547
    iget-object v3, v2, Lpb4;->a:Ljava/lang/Object;

    .line 1548
    .line 1549
    invoke-interface {v3}, Ljh4;->f()J

    .line 1550
    .line 1551
    .line 1552
    move-result-wide v3

    .line 1553
    iput-wide v3, v1, Ljb4;->e0:J

    .line 1554
    .line 1555
    invoke-virtual {v2}, Lpb4;->b()Z

    .line 1556
    .line 1557
    .line 1558
    move-result v3

    .line 1559
    if-nez v3, :cond_2b

    .line 1560
    .line 1561
    invoke-virtual {v0, v2}, Lrb4;->y(Lpb4;)I

    .line 1562
    .line 1563
    .line 1564
    invoke-virtual {v1, v14}, Ljb4;->Q(Z)V

    .line 1565
    .line 1566
    .line 1567
    invoke-virtual {v1}, Ljb4;->L()V

    .line 1568
    .line 1569
    .line 1570
    goto :goto_1a

    .line 1571
    :cond_29
    :goto_19
    move-object/from16 v23, v11

    .line 1572
    .line 1573
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    goto :goto_1a

    .line 1579
    :cond_2a
    move-object v0, v2

    .line 1580
    goto :goto_19

    .line 1581
    :catch_13
    move-exception v0

    .line 1582
    move-object/from16 v23, v11

    .line 1583
    .line 1584
    goto :goto_17

    .line 1585
    :cond_2b
    :goto_1a
    invoke-virtual {v0}, Lrb4;->t()Lpb4;

    .line 1586
    .line 1587
    .line 1588
    move-result-object v2

    .line 1589
    if-nez v2, :cond_2d

    .line 1590
    .line 1591
    :cond_2c
    move-wide/from16 v26, v7

    .line 1592
    .line 1593
    move/from16 v18, v13

    .line 1594
    .line 1595
    goto/16 :goto_25

    .line 1596
    .line 1597
    :cond_2d
    invoke-virtual {v2}, Lpb4;->i()Lpb4;

    .line 1598
    .line 1599
    .line 1600
    move-result-object v3
    :try_end_13
    .catch Lb84; {:try_start_13 .. :try_end_13} :catch_11
    .catch Lif4; {:try_start_13 .. :try_end_13} :catch_4
    .catch Llq1; {:try_start_13 .. :try_end_13} :catch_3
    .catch Ldi3; {:try_start_13 .. :try_end_13} :catch_2
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_13 .. :try_end_13} :catch_10

    .line 1601
    if-eqz v3, :cond_2e

    .line 1602
    .line 1603
    :try_start_14
    iget-boolean v3, v1, Ljb4;->O:Z

    .line 1604
    .line 1605
    if-eqz v3, :cond_2f

    .line 1606
    .line 1607
    :cond_2e
    move-wide/from16 v26, v7

    .line 1608
    .line 1609
    move/from16 v18, v13

    .line 1610
    .line 1611
    goto/16 :goto_21

    .line 1612
    .line 1613
    :cond_2f
    invoke-virtual {v0}, Lrb4;->t()Lpb4;

    .line 1614
    .line 1615
    .line 1616
    move-result-object v3

    .line 1617
    iget-boolean v4, v3, Lpb4;->e:Z

    .line 1618
    .line 1619
    if-eqz v4, :cond_2c

    .line 1620
    .line 1621
    move v4, v14

    .line 1622
    :goto_1b
    iget-object v5, v1, Ljb4;->f:[Lt71;
    :try_end_14
    .catch Lb84; {:try_start_14 .. :try_end_14} :catch_19
    .catch Lif4; {:try_start_14 .. :try_end_14} :catch_18
    .catch Llq1; {:try_start_14 .. :try_end_14} :catch_17
    .catch Ldi3; {:try_start_14 .. :try_end_14} :catch_16
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_15
    .catch Ljava/lang/RuntimeException; {:try_start_14 .. :try_end_14} :catch_14

    .line 1623
    .line 1624
    if-ge v4, v15, :cond_30

    .line 1625
    .line 1626
    :try_start_15
    aget-object v5, v5, v4

    .line 1627
    .line 1628
    invoke-virtual {v5, v3}, Lt71;->A(Lpb4;)Z

    .line 1629
    .line 1630
    .line 1631
    move-result v5
    :try_end_15
    .catch Lb84; {:try_start_15 .. :try_end_15} :catch_11
    .catch Lif4; {:try_start_15 .. :try_end_15} :catch_4
    .catch Llq1; {:try_start_15 .. :try_end_15} :catch_3
    .catch Ldi3; {:try_start_15 .. :try_end_15} :catch_2
    .catch Ljava/io/IOException; {:try_start_15 .. :try_end_15} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_15 .. :try_end_15} :catch_10

    .line 1632
    if-eqz v5, :cond_2c

    .line 1633
    .line 1634
    add-int/lit8 v4, v4, 0x1

    .line 1635
    .line 1636
    goto :goto_1b

    .line 1637
    :cond_30
    :try_start_16
    invoke-virtual {v1}, Ljb4;->V()Z

    .line 1638
    .line 1639
    .line 1640
    move-result v3
    :try_end_16
    .catch Lb84; {:try_start_16 .. :try_end_16} :catch_19
    .catch Lif4; {:try_start_16 .. :try_end_16} :catch_18
    .catch Llq1; {:try_start_16 .. :try_end_16} :catch_17
    .catch Ldi3; {:try_start_16 .. :try_end_16} :catch_16
    .catch Ljava/io/IOException; {:try_start_16 .. :try_end_16} :catch_15
    .catch Ljava/lang/RuntimeException; {:try_start_16 .. :try_end_16} :catch_14

    .line 1641
    if-eqz v3, :cond_31

    .line 1642
    .line 1643
    :try_start_17
    invoke-virtual {v0}, Lrb4;->u()Lpb4;

    .line 1644
    .line 1645
    .line 1646
    move-result-object v3

    .line 1647
    invoke-virtual {v0}, Lrb4;->t()Lpb4;

    .line 1648
    .line 1649
    .line 1650
    move-result-object v4
    :try_end_17
    .catch Lb84; {:try_start_17 .. :try_end_17} :catch_11
    .catch Lif4; {:try_start_17 .. :try_end_17} :catch_4
    .catch Llq1; {:try_start_17 .. :try_end_17} :catch_3
    .catch Ldi3; {:try_start_17 .. :try_end_17} :catch_2
    .catch Ljava/io/IOException; {:try_start_17 .. :try_end_17} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_17 .. :try_end_17} :catch_10

    .line 1651
    if-eq v3, v4, :cond_2c

    .line 1652
    .line 1653
    :cond_31
    :try_start_18
    invoke-virtual {v2}, Lpb4;->i()Lpb4;

    .line 1654
    .line 1655
    .line 1656
    move-result-object v3

    .line 1657
    iget-boolean v3, v3, Lpb4;->e:Z
    :try_end_18
    .catch Lb84; {:try_start_18 .. :try_end_18} :catch_19
    .catch Lif4; {:try_start_18 .. :try_end_18} :catch_18
    .catch Llq1; {:try_start_18 .. :try_end_18} :catch_17
    .catch Ldi3; {:try_start_18 .. :try_end_18} :catch_16
    .catch Ljava/io/IOException; {:try_start_18 .. :try_end_18} :catch_15
    .catch Ljava/lang/RuntimeException; {:try_start_18 .. :try_end_18} :catch_14

    .line 1658
    .line 1659
    if-nez v3, :cond_32

    .line 1660
    .line 1661
    :try_start_19
    iget-wide v3, v1, Ljb4;->X:J

    .line 1662
    .line 1663
    invoke-virtual {v2}, Lpb4;->i()Lpb4;

    .line 1664
    .line 1665
    .line 1666
    move-result-object v6

    .line 1667
    invoke-virtual {v6}, Lpb4;->a()J

    .line 1668
    .line 1669
    .line 1670
    move-result-wide v19
    :try_end_19
    .catch Lb84; {:try_start_19 .. :try_end_19} :catch_11
    .catch Lif4; {:try_start_19 .. :try_end_19} :catch_4
    .catch Llq1; {:try_start_19 .. :try_end_19} :catch_3
    .catch Ldi3; {:try_start_19 .. :try_end_19} :catch_2
    .catch Ljava/io/IOException; {:try_start_19 .. :try_end_19} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_19 .. :try_end_19} :catch_10

    .line 1671
    cmp-long v3, v3, v19

    .line 1672
    .line 1673
    if-ltz v3, :cond_2c

    .line 1674
    .line 1675
    :cond_32
    :try_start_1a
    invoke-virtual {v2}, Lpb4;->i()Lpb4;

    .line 1676
    .line 1677
    .line 1678
    move-result-object v3

    .line 1679
    iget-boolean v3, v3, Lpb4;->e:Z

    .line 1680
    .line 1681
    if-eqz v3, :cond_34

    .line 1682
    .line 1683
    invoke-virtual {v2}, Lpb4;->i()Lpb4;

    .line 1684
    .line 1685
    .line 1686
    move-result-object v3

    .line 1687
    iget-boolean v4, v3, Lpb4;->e:Z

    .line 1688
    .line 1689
    invoke-static {v4}, Lzt0;->b0(Z)V

    .line 1690
    .line 1691
    .line 1692
    invoke-virtual {v3}, Lpb4;->a()J

    .line 1693
    .line 1694
    .line 1695
    move-result-wide v3
    :try_end_1a
    .catch Lb84; {:try_start_1a .. :try_end_1a} :catch_19
    .catch Lif4; {:try_start_1a .. :try_end_1a} :catch_18
    .catch Llq1; {:try_start_1a .. :try_end_1a} :catch_17
    .catch Ldi3; {:try_start_1a .. :try_end_1a} :catch_16
    .catch Ljava/io/IOException; {:try_start_1a .. :try_end_1a} :catch_15
    .catch Ljava/lang/RuntimeException; {:try_start_1a .. :try_end_1a} :catch_14

    .line 1696
    move/from16 v18, v13

    .line 1697
    .line 1698
    :try_start_1b
    iget-wide v13, v1, Ljb4;->X:J

    .line 1699
    .line 1700
    sub-long/2addr v3, v13

    .line 1701
    iget-object v6, v1, Ljb4;->s:Lg53;

    .line 1702
    .line 1703
    invoke-virtual {v6}, Lg53;->g()Lsr1;

    .line 1704
    .line 1705
    .line 1706
    move-result-object v6

    .line 1707
    iget v6, v6, Lsr1;->a:F

    .line 1708
    .line 1709
    long-to-float v3, v3

    .line 1710
    div-float/2addr v3, v6

    .line 1711
    float-to-long v3, v3

    .line 1712
    cmp-long v3, v3, v21

    .line 1713
    .line 1714
    if-gtz v3, :cond_33

    .line 1715
    .line 1716
    goto :goto_1c

    .line 1717
    :cond_33
    move-wide/from16 v26, v7

    .line 1718
    .line 1719
    goto/16 :goto_25

    .line 1720
    .line 1721
    :catch_14
    move-exception v0

    .line 1722
    move/from16 v18, v13

    .line 1723
    .line 1724
    goto/16 :goto_46

    .line 1725
    .line 1726
    :catch_15
    move-exception v0

    .line 1727
    move/from16 v18, v13

    .line 1728
    .line 1729
    goto/16 :goto_48

    .line 1730
    .line 1731
    :catch_16
    move-exception v0

    .line 1732
    move/from16 v18, v13

    .line 1733
    .line 1734
    goto/16 :goto_49

    .line 1735
    .line 1736
    :catch_17
    move-exception v0

    .line 1737
    move/from16 v18, v13

    .line 1738
    .line 1739
    goto/16 :goto_4a

    .line 1740
    .line 1741
    :catch_18
    move-exception v0

    .line 1742
    move/from16 v18, v13

    .line 1743
    .line 1744
    goto/16 :goto_4c

    .line 1745
    .line 1746
    :catch_19
    move-exception v0

    .line 1747
    move/from16 v18, v13

    .line 1748
    .line 1749
    goto/16 :goto_17

    .line 1750
    .line 1751
    :cond_34
    move/from16 v18, v13

    .line 1752
    .line 1753
    :goto_1c
    invoke-virtual {v2}, Lpb4;->k()Lpj4;

    .line 1754
    .line 1755
    .line 1756
    move-result-object v13

    .line 1757
    invoke-virtual {v0}, Lrb4;->v()Lpb4;

    .line 1758
    .line 1759
    .line 1760
    move-result-object v14

    .line 1761
    invoke-virtual {v14}, Lpb4;->k()Lpj4;

    .line 1762
    .line 1763
    .line 1764
    move-result-object v3

    .line 1765
    iget-object v4, v1, Ljb4;->K:Ldc4;

    .line 1766
    .line 1767
    iget-object v4, v4, Ldc4;->a:Loz1;

    .line 1768
    .line 1769
    iget-object v6, v14, Lpb4;->g:Lqb4;

    .line 1770
    .line 1771
    iget-object v6, v6, Lqb4;->a:Lkh4;

    .line 1772
    .line 1773
    iget-object v2, v2, Lpb4;->g:Lqb4;

    .line 1774
    .line 1775
    iget-object v2, v2, Lqb4;->a:Lkh4;

    .line 1776
    .line 1777
    move-wide/from16 v20, v7

    .line 1778
    .line 1779
    move-object v8, v3

    .line 1780
    move-object v3, v6

    .line 1781
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    move-object/from16 v22, v8

    .line 1787
    .line 1788
    const/4 v8, 0x0

    .line 1789
    move-object/from16 v25, v5

    .line 1790
    .line 1791
    move-object v5, v2

    .line 1792
    move-object v2, v4

    .line 1793
    move-wide/from16 v26, v20

    .line 1794
    .line 1795
    move-object/from16 v9, v22

    .line 1796
    .line 1797
    invoke-virtual/range {v1 .. v8}, Ljb4;->G(Loz1;Lkh4;Loz1;Lkh4;JZ)V

    .line 1798
    .line 1799
    .line 1800
    iget-boolean v2, v14, Lpb4;->e:Z

    .line 1801
    .line 1802
    if-eqz v2, :cond_38

    .line 1803
    .line 1804
    iget-boolean v2, v1, Ljb4;->C:Z

    .line 1805
    .line 1806
    if-eqz v2, :cond_35

    .line 1807
    .line 1808
    iget-wide v3, v1, Ljb4;->e0:J

    .line 1809
    .line 1810
    cmp-long v3, v3, v10

    .line 1811
    .line 1812
    if-nez v3, :cond_36

    .line 1813
    .line 1814
    :cond_35
    iget-object v3, v14, Lpb4;->a:Ljava/lang/Object;

    .line 1815
    .line 1816
    invoke-interface {v3}, Ljh4;->f()J

    .line 1817
    .line 1818
    .line 1819
    move-result-wide v3

    .line 1820
    cmp-long v3, v3, v10

    .line 1821
    .line 1822
    if-eqz v3, :cond_38

    .line 1823
    .line 1824
    :cond_36
    iput-wide v10, v1, Ljb4;->e0:J

    .line 1825
    .line 1826
    if-eqz v2, :cond_39

    .line 1827
    .line 1828
    iget-boolean v2, v1, Ljb4;->f0:Z

    .line 1829
    .line 1830
    if-nez v2, :cond_39

    .line 1831
    .line 1832
    const/4 v4, 0x0

    .line 1833
    :goto_1d
    if-ge v4, v15, :cond_38

    .line 1834
    .line 1835
    invoke-virtual {v9, v4}, Lpj4;->a(I)Z

    .line 1836
    .line 1837
    .line 1838
    move-result v2

    .line 1839
    if-eqz v2, :cond_37

    .line 1840
    .line 1841
    aget-object v2, v25, v4

    .line 1842
    .line 1843
    invoke-virtual {v2}, Lt71;->s()V

    .line 1844
    .line 1845
    .line 1846
    iget-object v2, v9, Lpj4;->h:Ljava/lang/Object;

    .line 1847
    .line 1848
    check-cast v2, [Lnj4;

    .line 1849
    .line 1850
    aget-object v3, v2, v4

    .line 1851
    .line 1852
    invoke-interface {v3}, Lnj4;->h()Lph4;

    .line 1853
    .line 1854
    .line 1855
    move-result-object v3

    .line 1856
    iget-object v3, v3, Lph4;->m:Ljava/lang/String;

    .line 1857
    .line 1858
    aget-object v2, v2, v4

    .line 1859
    .line 1860
    invoke-interface {v2}, Lnj4;->h()Lph4;

    .line 1861
    .line 1862
    .line 1863
    move-result-object v2

    .line 1864
    iget-object v2, v2, Lph4;->j:Ljava/lang/String;

    .line 1865
    .line 1866
    invoke-static {v3, v2}, Lpp1;->d(Ljava/lang/String;Ljava/lang/String;)Z

    .line 1867
    .line 1868
    .line 1869
    move-result v2

    .line 1870
    if-nez v2, :cond_37

    .line 1871
    .line 1872
    aget-object v2, v25, v4

    .line 1873
    .line 1874
    invoke-virtual {v2}, Lt71;->q()Z

    .line 1875
    .line 1876
    .line 1877
    move-result v2

    .line 1878
    if-nez v2, :cond_37

    .line 1879
    .line 1880
    goto :goto_1e

    .line 1881
    :cond_37
    add-int/lit8 v4, v4, 0x1

    .line 1882
    .line 1883
    goto :goto_1d

    .line 1884
    :cond_38
    const/4 v4, 0x0

    .line 1885
    goto :goto_20

    .line 1886
    :cond_39
    :goto_1e
    invoke-virtual {v14}, Lpb4;->a()J

    .line 1887
    .line 1888
    .line 1889
    const/4 v4, 0x0

    .line 1890
    :goto_1f
    if-ge v4, v15, :cond_3a

    .line 1891
    .line 1892
    aget-object v2, v25, v4

    .line 1893
    .line 1894
    invoke-virtual {v2}, Lt71;->w()V

    .line 1895
    .line 1896
    .line 1897
    add-int/lit8 v4, v4, 0x1

    .line 1898
    .line 1899
    goto :goto_1f

    .line 1900
    :cond_3a
    invoke-virtual {v14}, Lpb4;->b()Z

    .line 1901
    .line 1902
    .line 1903
    move-result v2

    .line 1904
    if-nez v2, :cond_3f

    .line 1905
    .line 1906
    invoke-virtual {v0, v14}, Lrb4;->y(Lpb4;)I

    .line 1907
    .line 1908
    .line 1909
    const/4 v14, 0x0

    .line 1910
    invoke-virtual {v1, v14}, Ljb4;->Q(Z)V

    .line 1911
    .line 1912
    .line 1913
    invoke-virtual {v1}, Ljb4;->L()V

    .line 1914
    .line 1915
    .line 1916
    goto :goto_25

    .line 1917
    :goto_20
    if-ge v4, v15, :cond_3f

    .line 1918
    .line 1919
    aget-object v2, v25, v4

    .line 1920
    .line 1921
    invoke-virtual {v14}, Lpb4;->a()J

    .line 1922
    .line 1923
    .line 1924
    invoke-virtual {v2, v13, v9}, Lt71;->v(Lpj4;Lpj4;)V

    .line 1925
    .line 1926
    .line 1927
    add-int/lit8 v4, v4, 0x1

    .line 1928
    .line 1929
    goto :goto_20

    .line 1930
    :goto_21
    iget-object v3, v2, Lpb4;->g:Lqb4;

    .line 1931
    .line 1932
    iget-boolean v3, v3, Lqb4;->h:Z

    .line 1933
    .line 1934
    if-nez v3, :cond_3b

    .line 1935
    .line 1936
    iget-boolean v3, v1, Ljb4;->O:Z

    .line 1937
    .line 1938
    if-eqz v3, :cond_3f

    .line 1939
    .line 1940
    :cond_3b
    iget-object v3, v1, Ljb4;->f:[Lt71;

    .line 1941
    .line 1942
    const/4 v4, 0x0

    .line 1943
    :goto_22
    if-ge v4, v15, :cond_3f

    .line 1944
    .line 1945
    aget-object v5, v3, v4

    .line 1946
    .line 1947
    invoke-virtual {v5, v2}, Lt71;->m(Lpb4;)Lkg4;

    .line 1948
    .line 1949
    .line 1950
    move-result-object v6

    .line 1951
    if-eqz v6, :cond_3c

    .line 1952
    .line 1953
    move/from16 v6, v18

    .line 1954
    .line 1955
    goto :goto_23

    .line 1956
    :cond_3c
    const/4 v6, 0x0

    .line 1957
    :goto_23
    if-nez v6, :cond_3d

    .line 1958
    .line 1959
    goto :goto_24

    .line 1960
    :cond_3d
    invoke-virtual {v5, v2}, Lt71;->t(Lpb4;)Z

    .line 1961
    .line 1962
    .line 1963
    move-result v6

    .line 1964
    if-eqz v6, :cond_3e

    .line 1965
    .line 1966
    invoke-virtual {v5, v2}, Lt71;->u(Lpb4;)V

    .line 1967
    .line 1968
    .line 1969
    :cond_3e
    :goto_24
    add-int/lit8 v4, v4, 0x1

    .line 1970
    .line 1971
    goto :goto_22

    .line 1972
    :cond_3f
    :goto_25
    invoke-virtual {v0}, Lrb4;->t()Lpb4;

    .line 1973
    .line 1974
    .line 1975
    move-result-object v2

    .line 1976
    if-eqz v2, :cond_45

    .line 1977
    .line 1978
    invoke-virtual {v0}, Lrb4;->s()Lpb4;

    .line 1979
    .line 1980
    .line 1981
    move-result-object v3

    .line 1982
    if-eq v3, v2, :cond_45

    .line 1983
    .line 1984
    iget-boolean v2, v2, Lpb4;->h:Z

    .line 1985
    .line 1986
    if-eqz v2, :cond_40

    .line 1987
    .line 1988
    goto :goto_29

    .line 1989
    :cond_40
    invoke-virtual {v0}, Lrb4;->t()Lpb4;

    .line 1990
    .line 1991
    .line 1992
    move-result-object v2

    .line 1993
    invoke-virtual {v2}, Lpb4;->k()Lpj4;

    .line 1994
    .line 1995
    .line 1996
    move-result-object v7

    .line 1997
    move/from16 v3, v18

    .line 1998
    .line 1999
    const/4 v4, 0x0

    .line 2000
    :goto_26
    iget-object v8, v1, Ljb4;->f:[Lt71;

    .line 2001
    .line 2002
    if-ge v4, v15, :cond_41

    .line 2003
    .line 2004
    aget-object v5, v8, v4

    .line 2005
    .line 2006
    invoke-virtual {v5}, Lt71;->r()I

    .line 2007
    .line 2008
    .line 2009
    move-result v5

    .line 2010
    aget-object v6, v8, v4

    .line 2011
    .line 2012
    iget-object v9, v1, Ljb4;->s:Lg53;

    .line 2013
    .line 2014
    invoke-virtual {v6, v2, v7, v9}, Lt71;->c(Lpb4;Lpj4;Lg53;)I

    .line 2015
    .line 2016
    .line 2017
    move-result v6

    .line 2018
    iget v9, v1, Ljb4;->V:I

    .line 2019
    .line 2020
    aget-object v8, v8, v4

    .line 2021
    .line 2022
    invoke-virtual {v8}, Lt71;->r()I

    .line 2023
    .line 2024
    .line 2025
    move-result v8

    .line 2026
    sub-int/2addr v5, v8

    .line 2027
    sub-int/2addr v9, v5

    .line 2028
    iput v9, v1, Ljb4;->V:I

    .line 2029
    .line 2030
    and-int/lit8 v5, v6, 0x1

    .line 2031
    .line 2032
    and-int/2addr v3, v5

    .line 2033
    add-int/lit8 v4, v4, 0x1

    .line 2034
    .line 2035
    goto :goto_26

    .line 2036
    :cond_41
    if-eqz v3, :cond_45

    .line 2037
    .line 2038
    const/4 v3, 0x0

    .line 2039
    :goto_27
    if-ge v3, v15, :cond_44

    .line 2040
    .line 2041
    invoke-virtual {v7, v3}, Lpj4;->a(I)Z

    .line 2042
    .line 2043
    .line 2044
    move-result v4

    .line 2045
    if-eqz v4, :cond_43

    .line 2046
    .line 2047
    aget-object v4, v8, v3

    .line 2048
    .line 2049
    invoke-virtual {v4, v2}, Lt71;->m(Lpb4;)Lkg4;

    .line 2050
    .line 2051
    .line 2052
    move-result-object v4

    .line 2053
    if-eqz v4, :cond_42

    .line 2054
    .line 2055
    move/from16 v4, v18

    .line 2056
    .line 2057
    goto :goto_28

    .line 2058
    :cond_42
    const/4 v4, 0x0

    .line 2059
    :goto_28
    if-nez v4, :cond_43

    .line 2060
    .line 2061
    invoke-virtual {v2}, Lpb4;->a()J

    .line 2062
    .line 2063
    .line 2064
    move-result-wide v5

    .line 2065
    const/4 v4, 0x0

    .line 2066
    invoke-virtual/range {v1 .. v6}, Ljb4;->P(Lpb4;IZJ)V

    .line 2067
    .line 2068
    .line 2069
    :cond_43
    add-int/lit8 v3, v3, 0x1

    .line 2070
    .line 2071
    goto :goto_27

    .line 2072
    :cond_44
    invoke-virtual {v0}, Lrb4;->t()Lpb4;

    .line 2073
    .line 2074
    .line 2075
    move-result-object v2

    .line 2076
    move/from16 v8, v18

    .line 2077
    .line 2078
    iput-boolean v8, v2, Lpb4;->h:Z

    .line 2079
    .line 2080
    :cond_45
    :goto_29
    const/4 v3, 0x0

    .line 2081
    :goto_2a
    invoke-virtual {v1}, Ljb4;->T()Z

    .line 2082
    .line 2083
    .line 2084
    move-result v2

    .line 2085
    if-nez v2, :cond_47

    .line 2086
    .line 2087
    :cond_46
    const/4 v11, 0x3

    .line 2088
    goto/16 :goto_2f

    .line 2089
    .line 2090
    :cond_47
    iget-boolean v2, v1, Ljb4;->O:Z

    .line 2091
    .line 2092
    if-nez v2, :cond_46

    .line 2093
    .line 2094
    invoke-virtual {v0}, Lrb4;->s()Lpb4;

    .line 2095
    .line 2096
    .line 2097
    move-result-object v2

    .line 2098
    if-eqz v2, :cond_46

    .line 2099
    .line 2100
    invoke-virtual {v2}, Lpb4;->i()Lpb4;

    .line 2101
    .line 2102
    .line 2103
    move-result-object v2

    .line 2104
    if-eqz v2, :cond_46

    .line 2105
    .line 2106
    iget-wide v4, v1, Ljb4;->X:J

    .line 2107
    .line 2108
    invoke-virtual {v2}, Lpb4;->a()J

    .line 2109
    .line 2110
    .line 2111
    move-result-wide v6

    .line 2112
    cmp-long v4, v4, v6

    .line 2113
    .line 2114
    if-ltz v4, :cond_46

    .line 2115
    .line 2116
    iget-boolean v2, v2, Lpb4;->h:Z

    .line 2117
    .line 2118
    if-eqz v2, :cond_46

    .line 2119
    .line 2120
    if-eqz v3, :cond_48

    .line 2121
    .line 2122
    invoke-virtual {v1}, Ljb4;->e()V

    .line 2123
    .line 2124
    .line 2125
    :cond_48
    const/4 v14, 0x0

    .line 2126
    iput-boolean v14, v1, Ljb4;->f0:Z

    .line 2127
    .line 2128
    invoke-virtual {v0}, Lrb4;->x()Lpb4;

    .line 2129
    .line 2130
    .line 2131
    move-result-object v13

    .line 2132
    if-eqz v13, :cond_4f

    .line 2133
    .line 2134
    iget-object v2, v1, Ljb4;->K:Ldc4;

    .line 2135
    .line 2136
    iget-object v2, v2, Ldc4;->b:Lkh4;

    .line 2137
    .line 2138
    iget-object v2, v2, Lkh4;->a:Ljava/lang/Object;

    .line 2139
    .line 2140
    iget-object v3, v13, Lpb4;->g:Lqb4;

    .line 2141
    .line 2142
    iget-object v3, v3, Lqb4;->a:Lkh4;

    .line 2143
    .line 2144
    iget-object v3, v3, Lkh4;->a:Ljava/lang/Object;

    .line 2145
    .line 2146
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2147
    .line 2148
    .line 2149
    move-result v2

    .line 2150
    if-eqz v2, :cond_4a

    .line 2151
    .line 2152
    iget-object v2, v1, Ljb4;->K:Ldc4;

    .line 2153
    .line 2154
    iget-object v2, v2, Ldc4;->b:Lkh4;

    .line 2155
    .line 2156
    iget v3, v2, Lkh4;->b:I

    .line 2157
    .line 2158
    const/4 v4, -0x1

    .line 2159
    if-ne v3, v4, :cond_49

    .line 2160
    .line 2161
    iget-object v3, v13, Lpb4;->g:Lqb4;

    .line 2162
    .line 2163
    iget-object v3, v3, Lqb4;->a:Lkh4;

    .line 2164
    .line 2165
    iget v5, v3, Lkh4;->b:I

    .line 2166
    .line 2167
    if-ne v5, v4, :cond_49

    .line 2168
    .line 2169
    iget v2, v2, Lkh4;->e:I

    .line 2170
    .line 2171
    iget v3, v3, Lkh4;->e:I

    .line 2172
    .line 2173
    if-eq v2, v3, :cond_49

    .line 2174
    .line 2175
    const/4 v3, 0x1

    .line 2176
    goto :goto_2c

    .line 2177
    :cond_49
    :goto_2b
    const/4 v3, 0x0

    .line 2178
    goto :goto_2c

    .line 2179
    :cond_4a
    const/4 v4, -0x1

    .line 2180
    goto :goto_2b

    .line 2181
    :goto_2c
    iget-object v2, v13, Lpb4;->g:Lqb4;

    .line 2182
    .line 2183
    iget-object v5, v2, Lqb4;->a:Lkh4;

    .line 2184
    .line 2185
    move v6, v3

    .line 2186
    move/from16 v20, v4

    .line 2187
    .line 2188
    iget-wide v3, v2, Lqb4;->b:J

    .line 2189
    .line 2190
    iget-wide v7, v2, Lqb4;->c:J

    .line 2191
    .line 2192
    const/16 v18, 0x1

    .line 2193
    .line 2194
    xor-int/lit8 v9, v6, 0x1

    .line 2195
    .line 2196
    move-wide/from16 v21, v10

    .line 2197
    .line 2198
    const/4 v10, 0x0

    .line 2199
    move-object v2, v5

    .line 2200
    move-wide v5, v7

    .line 2201
    move-wide v7, v3

    .line 2202
    const/4 v11, 0x3

    .line 2203
    invoke-virtual/range {v1 .. v10}, Ljb4;->N(Lkh4;JJJZI)Ldc4;

    .line 2204
    .line 2205
    .line 2206
    move-result-object v2

    .line 2207
    iput-object v2, v1, Ljb4;->K:Ldc4;

    .line 2208
    .line 2209
    invoke-virtual {v1}, Ljb4;->J()V

    .line 2210
    .line 2211
    .line 2212
    invoke-virtual {v1}, Ljb4;->l()V

    .line 2213
    .line 2214
    .line 2215
    invoke-virtual {v1}, Ljb4;->V()Z

    .line 2216
    .line 2217
    .line 2218
    move-result v2

    .line 2219
    if-eqz v2, :cond_4b

    .line 2220
    .line 2221
    invoke-virtual {v0}, Lrb4;->u()Lpb4;

    .line 2222
    .line 2223
    .line 2224
    move-result-object v2

    .line 2225
    if-ne v13, v2, :cond_4b

    .line 2226
    .line 2227
    iget-object v2, v1, Ljb4;->f:[Lt71;

    .line 2228
    .line 2229
    const/4 v4, 0x0

    .line 2230
    :goto_2d
    if-ge v4, v15, :cond_4b

    .line 2231
    .line 2232
    aget-object v3, v2, v4

    .line 2233
    .line 2234
    invoke-virtual {v3}, Lt71;->a()V

    .line 2235
    .line 2236
    .line 2237
    add-int/lit8 v4, v4, 0x1

    .line 2238
    .line 2239
    goto :goto_2d

    .line 2240
    :cond_4b
    iget-object v2, v1, Ljb4;->K:Ldc4;

    .line 2241
    .line 2242
    iget v2, v2, Ldc4;->e:I

    .line 2243
    .line 2244
    if-ne v2, v11, :cond_4c

    .line 2245
    .line 2246
    invoke-virtual {v1}, Ljb4;->j()V

    .line 2247
    .line 2248
    .line 2249
    :cond_4c
    invoke-virtual {v0}, Lrb4;->s()Lpb4;

    .line 2250
    .line 2251
    .line 2252
    move-result-object v2

    .line 2253
    invoke-virtual {v2}, Lpb4;->k()Lpj4;

    .line 2254
    .line 2255
    .line 2256
    move-result-object v2

    .line 2257
    const/4 v4, 0x0

    .line 2258
    :goto_2e
    iget-object v3, v1, Ljb4;->f:[Lt71;

    .line 2259
    .line 2260
    if-ge v4, v15, :cond_4e

    .line 2261
    .line 2262
    invoke-virtual {v2, v4}, Lpj4;->a(I)Z

    .line 2263
    .line 2264
    .line 2265
    move-result v5

    .line 2266
    if-eqz v5, :cond_4d

    .line 2267
    .line 2268
    aget-object v3, v3, v4

    .line 2269
    .line 2270
    invoke-virtual {v3}, Lt71;->x()V

    .line 2271
    .line 2272
    .line 2273
    :cond_4d
    add-int/lit8 v4, v4, 0x1

    .line 2274
    .line 2275
    goto :goto_2e

    .line 2276
    :cond_4e
    const/4 v3, 0x1

    .line 2277
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    goto/16 :goto_2a

    .line 2283
    .line 2284
    :cond_4f
    const/16 v17, 0x0

    .line 2285
    .line 2286
    throw v17

    .line 2287
    :goto_2f
    iget-object v0, v1, Ljb4;->d0:Lla4;

    .line 2288
    .line 2289
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2290
    .line 2291
    .line 2292
    :goto_30
    iget-object v0, v1, Ljb4;->K:Ldc4;

    .line 2293
    .line 2294
    iget v0, v0, Ldc4;->e:I

    .line 2295
    .line 2296
    const/4 v8, 0x1

    .line 2297
    if-eq v0, v8, :cond_85

    .line 2298
    .line 2299
    const/4 v2, 0x4

    .line 2300
    if-ne v0, v2, :cond_51

    .line 2301
    .line 2302
    :cond_50
    :goto_31
    const/4 v8, 0x1

    .line 2303
    goto/16 :goto_52

    .line 2304
    .line 2305
    :cond_51
    iget-object v0, v1, Ljb4;->w:Lrb4;

    .line 2306
    .line 2307
    invoke-virtual {v0}, Lrb4;->s()Lpb4;

    .line 2308
    .line 2309
    .line 2310
    move-result-object v2

    .line 2311
    if-nez v2, :cond_52

    .line 2312
    .line 2313
    move-wide/from16 v3, v26

    .line 2314
    .line 2315
    invoke-virtual {v1, v3, v4}, Ljb4;->p(J)V

    .line 2316
    .line 2317
    .line 2318
    goto :goto_31

    .line 2319
    :cond_52
    move-wide/from16 v3, v26

    .line 2320
    .line 2321
    const-string v5, "doSomeWork"

    .line 2322
    .line 2323
    invoke-static {v5}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 2324
    .line 2325
    .line 2326
    invoke-virtual {v1}, Ljb4;->l()V

    .line 2327
    .line 2328
    .line 2329
    iget-boolean v5, v2, Lpb4;->e:Z

    .line 2330
    .line 2331
    if-eqz v5, :cond_57

    .line 2332
    .line 2333
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 2334
    .line 2335
    .line 2336
    move-result-wide v5

    .line 2337
    invoke-static {v5, v6}, Lv23;->r(J)J

    .line 2338
    .line 2339
    .line 2340
    move-result-wide v5

    .line 2341
    iput-wide v5, v1, Ljb4;->Y:J

    .line 2342
    .line 2343
    iget-object v5, v2, Lpb4;->a:Ljava/lang/Object;

    .line 2344
    .line 2345
    iget-object v6, v1, Ljb4;->K:Ldc4;

    .line 2346
    .line 2347
    iget-wide v6, v6, Ldc4;->r:J

    .line 2348
    .line 2349
    iget-wide v8, v1, Ljb4;->r:J

    .line 2350
    .line 2351
    sub-long/2addr v6, v8

    .line 2352
    invoke-interface {v5, v6, v7}, Ljh4;->e(J)V

    .line 2353
    .line 2354
    .line 2355
    const/4 v5, 0x1

    .line 2356
    const/4 v6, 0x1

    .line 2357
    const/4 v7, 0x0

    .line 2358
    :goto_32
    iget-object v8, v1, Ljb4;->f:[Lt71;

    .line 2359
    .line 2360
    if-ge v7, v15, :cond_58

    .line 2361
    .line 2362
    aget-object v8, v8, v7

    .line 2363
    .line 2364
    invoke-virtual {v8}, Lt71;->r()I

    .line 2365
    .line 2366
    .line 2367
    move-result v9

    .line 2368
    if-nez v9, :cond_53

    .line 2369
    .line 2370
    const/4 v14, 0x0

    .line 2371
    invoke-virtual {v1, v7, v14}, Ljb4;->m(IZ)V

    .line 2372
    .line 2373
    .line 2374
    goto :goto_35

    .line 2375
    :cond_53
    iget-wide v9, v1, Ljb4;->X:J

    .line 2376
    .line 2377
    iget-wide v13, v1, Ljb4;->Y:J

    .line 2378
    .line 2379
    invoke-virtual {v8, v9, v10, v13, v14}, Lt71;->B(JJ)V

    .line 2380
    .line 2381
    .line 2382
    if-eqz v5, :cond_54

    .line 2383
    .line 2384
    invoke-virtual {v8}, Lt71;->y()Z

    .line 2385
    .line 2386
    .line 2387
    move-result v5

    .line 2388
    if-eqz v5, :cond_54

    .line 2389
    .line 2390
    const/4 v5, 0x1

    .line 2391
    goto :goto_33

    .line 2392
    :cond_54
    const/4 v5, 0x0

    .line 2393
    :goto_33
    invoke-virtual {v8, v2}, Lt71;->C(Lpb4;)Z

    .line 2394
    .line 2395
    .line 2396
    move-result v8

    .line 2397
    invoke-virtual {v1, v7, v8}, Ljb4;->m(IZ)V

    .line 2398
    .line 2399
    .line 2400
    if-eqz v6, :cond_55

    .line 2401
    .line 2402
    if-eqz v8, :cond_55

    .line 2403
    .line 2404
    const/4 v6, 0x1

    .line 2405
    goto :goto_34

    .line 2406
    :cond_55
    const/4 v6, 0x0

    .line 2407
    :goto_34
    if-nez v8, :cond_56

    .line 2408
    .line 2409
    invoke-virtual {v1, v7}, Ljb4;->U(I)V

    .line 2410
    .line 2411
    .line 2412
    :cond_56
    :goto_35
    add-int/lit8 v7, v7, 0x1

    .line 2413
    .line 2414
    goto :goto_32

    .line 2415
    :cond_57
    iget-object v5, v2, Lpb4;->a:Ljava/lang/Object;

    .line 2416
    .line 2417
    invoke-interface {v5}, Ljh4;->r()V

    .line 2418
    .line 2419
    .line 2420
    const/4 v5, 0x1

    .line 2421
    const/4 v6, 0x1

    .line 2422
    :cond_58
    iget-object v7, v2, Lpb4;->g:Lqb4;

    .line 2423
    .line 2424
    iget-wide v7, v7, Lqb4;->e:J

    .line 2425
    .line 2426
    if-eqz v5, :cond_5b

    .line 2427
    .line 2428
    iget-boolean v5, v2, Lpb4;->e:Z

    .line 2429
    .line 2430
    if-eqz v5, :cond_5b

    .line 2431
    .line 2432
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    cmp-long v5, v7, v9

    .line 2438
    .line 2439
    if-eqz v5, :cond_59

    .line 2440
    .line 2441
    iget-object v5, v1, Ljb4;->K:Ldc4;

    .line 2442
    .line 2443
    iget-wide v13, v5, Ldc4;->r:J

    .line 2444
    .line 2445
    cmp-long v5, v7, v13

    .line 2446
    .line 2447
    if-gtz v5, :cond_5c

    .line 2448
    .line 2449
    :cond_59
    iget-boolean v5, v1, Ljb4;->O:Z

    .line 2450
    .line 2451
    if-eqz v5, :cond_5a

    .line 2452
    .line 2453
    const/4 v14, 0x0

    .line 2454
    iput-boolean v14, v1, Ljb4;->O:Z

    .line 2455
    .line 2456
    iget-object v5, v1, Ljb4;->K:Ldc4;

    .line 2457
    .line 2458
    iget v5, v5, Ldc4;->n:I

    .line 2459
    .line 2460
    iget-object v7, v1, Ljb4;->L:Lr60;

    .line 2461
    .line 2462
    invoke-virtual {v7, v14}, Lr60;->f(I)V

    .line 2463
    .line 2464
    .line 2465
    iget-object v7, v1, Ljb4;->K:Ldc4;

    .line 2466
    .line 2467
    iget v7, v7, Ldc4;->e:I

    .line 2468
    .line 2469
    iget-object v8, v1, Ljb4;->D:Lr24;

    .line 2470
    .line 2471
    invoke-virtual {v8, v7, v14}, Lr24;->b(IZ)I

    .line 2472
    .line 2473
    .line 2474
    move-result v7

    .line 2475
    const/4 v8, 0x5

    .line 2476
    invoke-virtual {v1, v7, v5, v8, v14}, Ljb4;->h(IIIZ)V

    .line 2477
    .line 2478
    .line 2479
    :cond_5a
    iget-object v5, v2, Lpb4;->g:Lqb4;

    .line 2480
    .line 2481
    iget-boolean v5, v5, Lqb4;->h:Z

    .line 2482
    .line 2483
    if-eqz v5, :cond_5c

    .line 2484
    .line 2485
    const/4 v5, 0x4

    .line 2486
    invoke-virtual {v1, v5}, Ljb4;->d(I)V

    .line 2487
    .line 2488
    .line 2489
    invoke-virtual {v1}, Ljb4;->k()V

    .line 2490
    .line 2491
    .line 2492
    move-wide/from16 v21, v9

    .line 2493
    .line 2494
    goto/16 :goto_3f

    .line 2495
    .line 2496
    :cond_5b
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    :cond_5c
    iget-object v5, v1, Ljb4;->K:Ldc4;

    .line 2502
    .line 2503
    iget v7, v5, Ldc4;->e:I

    .line 2504
    .line 2505
    if-ne v7, v15, :cond_5e

    .line 2506
    .line 2507
    iget v7, v1, Ljb4;->V:I

    .line 2508
    .line 2509
    if-nez v7, :cond_5d

    .line 2510
    .line 2511
    invoke-virtual {v1}, Ljb4;->E()Z

    .line 2512
    .line 2513
    .line 2514
    move-result v5

    .line 2515
    move-wide/from16 v21, v9

    .line 2516
    .line 2517
    goto/16 :goto_39

    .line 2518
    .line 2519
    :cond_5d
    if-nez v6, :cond_5f

    .line 2520
    .line 2521
    :cond_5e
    move-wide/from16 v21, v9

    .line 2522
    .line 2523
    goto/16 :goto_3b

    .line 2524
    .line 2525
    :cond_5f
    iget-boolean v5, v5, Ldc4;->g:Z

    .line 2526
    .line 2527
    if-eqz v5, :cond_63

    .line 2528
    .line 2529
    invoke-virtual {v0}, Lrb4;->s()Lpb4;

    .line 2530
    .line 2531
    .line 2532
    move-result-object v5

    .line 2533
    iget-object v7, v1, Ljb4;->K:Ldc4;

    .line 2534
    .line 2535
    iget-object v7, v7, Ldc4;->a:Loz1;

    .line 2536
    .line 2537
    iget-object v8, v5, Lpb4;->g:Lqb4;

    .line 2538
    .line 2539
    iget-object v8, v8, Lqb4;->a:Lkh4;

    .line 2540
    .line 2541
    invoke-virtual {v1, v7, v8}, Ljb4;->o(Loz1;Lkh4;)Z

    .line 2542
    .line 2543
    .line 2544
    move-result v7

    .line 2545
    if-eqz v7, :cond_60

    .line 2546
    .line 2547
    iget-object v7, v1, Ljb4;->h0:Lm44;

    .line 2548
    .line 2549
    invoke-virtual {v7}, Lm44;->b()J

    .line 2550
    .line 2551
    .line 2552
    move-result-wide v7

    .line 2553
    move-wide/from16 v32, v7

    .line 2554
    .line 2555
    goto :goto_36

    .line 2556
    :cond_60
    move-wide/from16 v32, v9

    .line 2557
    .line 2558
    :goto_36
    iget-object v7, v0, Lrb4;->k:Lpb4;

    .line 2559
    .line 2560
    invoke-virtual {v7}, Lpb4;->b()Z

    .line 2561
    .line 2562
    .line 2563
    move-result v8

    .line 2564
    if-eqz v8, :cond_61

    .line 2565
    .line 2566
    iget-object v8, v7, Lpb4;->g:Lqb4;

    .line 2567
    .line 2568
    iget-boolean v8, v8, Lqb4;->h:Z

    .line 2569
    .line 2570
    if-eqz v8, :cond_61

    .line 2571
    .line 2572
    const/4 v8, 0x1

    .line 2573
    goto :goto_37

    .line 2574
    :cond_61
    const/4 v8, 0x0

    .line 2575
    :goto_37
    iget-object v13, v7, Lpb4;->g:Lqb4;

    .line 2576
    .line 2577
    iget-object v13, v13, Lqb4;->a:Lkh4;

    .line 2578
    .line 2579
    invoke-virtual {v13}, Lkh4;->b()Z

    .line 2580
    .line 2581
    .line 2582
    move-result v13

    .line 2583
    if-eqz v13, :cond_62

    .line 2584
    .line 2585
    iget-boolean v13, v7, Lpb4;->e:Z

    .line 2586
    .line 2587
    if-nez v13, :cond_62

    .line 2588
    .line 2589
    const/4 v13, 0x1

    .line 2590
    goto :goto_38

    .line 2591
    :cond_62
    const/4 v13, 0x0

    .line 2592
    :goto_38
    if-nez v8, :cond_63

    .line 2593
    .line 2594
    if-nez v13, :cond_63

    .line 2595
    .line 2596
    invoke-virtual {v7}, Lpb4;->d()J

    .line 2597
    .line 2598
    .line 2599
    move-result-wide v7

    .line 2600
    invoke-virtual {v1, v7, v8}, Ljb4;->R(J)J

    .line 2601
    .line 2602
    .line 2603
    move-result-wide v28

    .line 2604
    iget-object v7, v1, Ljb4;->k:Llb4;

    .line 2605
    .line 2606
    new-instance v24, Lkb4;

    .line 2607
    .line 2608
    iget-object v8, v1, Ljb4;->z:Lxd4;

    .line 2609
    .line 2610
    iget-object v13, v1, Ljb4;->K:Ldc4;

    .line 2611
    .line 2612
    iget-object v13, v13, Ldc4;->a:Loz1;

    .line 2613
    .line 2614
    iget-object v5, v5, Lpb4;->g:Lqb4;

    .line 2615
    .line 2616
    iget-object v5, v5, Lqb4;->a:Lkh4;

    .line 2617
    .line 2618
    iget-object v14, v1, Ljb4;->s:Lg53;

    .line 2619
    .line 2620
    invoke-virtual {v14}, Lg53;->g()Lsr1;

    .line 2621
    .line 2622
    .line 2623
    move-result-object v14

    .line 2624
    iget v14, v14, Lsr1;->a:F

    .line 2625
    .line 2626
    move-wide/from16 v21, v9

    .line 2627
    .line 2628
    iget-object v9, v1, Ljb4;->K:Ldc4;

    .line 2629
    .line 2630
    iget-boolean v9, v9, Ldc4;->l:Z

    .line 2631
    .line 2632
    iget-boolean v9, v1, Ljb4;->P:Z

    .line 2633
    .line 2634
    move-object/from16 v27, v5

    .line 2635
    .line 2636
    move-object/from16 v25, v8

    .line 2637
    .line 2638
    move/from16 v31, v9

    .line 2639
    .line 2640
    move-object/from16 v26, v13

    .line 2641
    .line 2642
    move/from16 v30, v14

    .line 2643
    .line 2644
    invoke-direct/range {v24 .. v33}, Lkb4;-><init>(Lxd4;Loz1;Lkh4;JFZJ)V

    .line 2645
    .line 2646
    .line 2647
    move-object/from16 v5, v24

    .line 2648
    .line 2649
    invoke-interface {v7, v5}, Llb4;->f(Lkb4;)Z

    .line 2650
    .line 2651
    .line 2652
    move-result v5

    .line 2653
    :goto_39
    if-eqz v5, :cond_65

    .line 2654
    .line 2655
    goto :goto_3a

    .line 2656
    :cond_63
    move-wide/from16 v21, v9

    .line 2657
    .line 2658
    :goto_3a
    invoke-virtual {v1, v11}, Ljb4;->d(I)V

    .line 2659
    .line 2660
    .line 2661
    const/4 v5, 0x0

    .line 2662
    iput-object v5, v1, Ljb4;->b0:Lb84;

    .line 2663
    .line 2664
    invoke-virtual {v1}, Ljb4;->T()Z

    .line 2665
    .line 2666
    .line 2667
    move-result v5

    .line 2668
    if-eqz v5, :cond_6a

    .line 2669
    .line 2670
    const/4 v14, 0x0

    .line 2671
    invoke-virtual {v1, v14, v14}, Ljb4;->y(ZZ)V

    .line 2672
    .line 2673
    .line 2674
    iget-object v5, v1, Ljb4;->s:Lg53;

    .line 2675
    .line 2676
    const/4 v8, 0x1

    .line 2677
    iput-boolean v8, v5, Lg53;->g:Z

    .line 2678
    .line 2679
    iget-object v5, v5, Lg53;->h:Ljava/lang/Object;

    .line 2680
    .line 2681
    check-cast v5, Lnc4;

    .line 2682
    .line 2683
    iget-boolean v6, v5, Lnc4;->f:Z

    .line 2684
    .line 2685
    if-nez v6, :cond_64

    .line 2686
    .line 2687
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 2688
    .line 2689
    .line 2690
    move-result-wide v6

    .line 2691
    iput-wide v6, v5, Lnc4;->h:J

    .line 2692
    .line 2693
    const/4 v8, 0x1

    .line 2694
    iput-boolean v8, v5, Lnc4;->f:Z

    .line 2695
    .line 2696
    :cond_64
    invoke-virtual {v1}, Ljb4;->j()V

    .line 2697
    .line 2698
    .line 2699
    goto :goto_3f

    .line 2700
    :cond_65
    :goto_3b
    iget-object v5, v1, Ljb4;->K:Ldc4;

    .line 2701
    .line 2702
    iget v5, v5, Ldc4;->e:I

    .line 2703
    .line 2704
    if-ne v5, v11, :cond_6a

    .line 2705
    .line 2706
    iget v5, v1, Ljb4;->V:I

    .line 2707
    .line 2708
    if-nez v5, :cond_66

    .line 2709
    .line 2710
    invoke-virtual {v1}, Ljb4;->E()Z

    .line 2711
    .line 2712
    .line 2713
    move-result v5

    .line 2714
    if-nez v5, :cond_6a

    .line 2715
    .line 2716
    goto :goto_3c

    .line 2717
    :cond_66
    if-nez v6, :cond_6a

    .line 2718
    .line 2719
    :goto_3c
    invoke-virtual {v1}, Ljb4;->T()Z

    .line 2720
    .line 2721
    .line 2722
    move-result v5

    .line 2723
    const/4 v14, 0x0

    .line 2724
    invoke-virtual {v1, v5, v14}, Ljb4;->y(ZZ)V

    .line 2725
    .line 2726
    .line 2727
    invoke-virtual {v1, v15}, Ljb4;->d(I)V

    .line 2728
    .line 2729
    .line 2730
    iget-boolean v5, v1, Ljb4;->P:Z

    .line 2731
    .line 2732
    if-eqz v5, :cond_69

    .line 2733
    .line 2734
    invoke-virtual {v0}, Lrb4;->s()Lpb4;

    .line 2735
    .line 2736
    .line 2737
    move-result-object v5

    .line 2738
    :goto_3d
    if-eqz v5, :cond_68

    .line 2739
    .line 2740
    invoke-virtual {v5}, Lpb4;->k()Lpj4;

    .line 2741
    .line 2742
    .line 2743
    move-result-object v6

    .line 2744
    iget-object v6, v6, Lpj4;->h:Ljava/lang/Object;

    .line 2745
    .line 2746
    check-cast v6, [Lnj4;

    .line 2747
    .line 2748
    array-length v7, v6

    .line 2749
    const/4 v8, 0x0

    .line 2750
    :goto_3e
    if-ge v8, v7, :cond_67

    .line 2751
    .line 2752
    aget-object v9, v6, v8

    .line 2753
    .line 2754
    add-int/lit8 v8, v8, 0x1

    .line 2755
    .line 2756
    goto :goto_3e

    .line 2757
    :cond_67
    invoke-virtual {v5}, Lpb4;->i()Lpb4;

    .line 2758
    .line 2759
    .line 2760
    move-result-object v5

    .line 2761
    goto :goto_3d

    .line 2762
    :cond_68
    iget-object v5, v1, Ljb4;->h0:Lm44;

    .line 2763
    .line 2764
    invoke-virtual {v5}, Lm44;->a()V

    .line 2765
    .line 2766
    .line 2767
    :cond_69
    invoke-virtual {v1}, Ljb4;->k()V

    .line 2768
    .line 2769
    .line 2770
    :cond_6a
    :goto_3f
    iget-object v5, v1, Ljb4;->K:Ldc4;

    .line 2771
    .line 2772
    iget v5, v5, Ldc4;->e:I

    .line 2773
    .line 2774
    if-ne v5, v15, :cond_70

    .line 2775
    .line 2776
    const/4 v5, 0x0

    .line 2777
    :goto_40
    iget-object v6, v1, Ljb4;->f:[Lt71;

    .line 2778
    .line 2779
    if-ge v5, v15, :cond_6d

    .line 2780
    .line 2781
    aget-object v6, v6, v5

    .line 2782
    .line 2783
    invoke-virtual {v6, v2}, Lt71;->m(Lpb4;)Lkg4;

    .line 2784
    .line 2785
    .line 2786
    move-result-object v6

    .line 2787
    if-eqz v6, :cond_6b

    .line 2788
    .line 2789
    const/4 v6, 0x1

    .line 2790
    goto :goto_41

    .line 2791
    :cond_6b
    const/4 v6, 0x0

    .line 2792
    :goto_41
    if-eqz v6, :cond_6c

    .line 2793
    .line 2794
    invoke-virtual {v1, v5}, Ljb4;->U(I)V

    .line 2795
    .line 2796
    .line 2797
    :cond_6c
    add-int/lit8 v5, v5, 0x1

    .line 2798
    .line 2799
    goto :goto_40

    .line 2800
    :cond_6d
    iget-object v2, v1, Ljb4;->K:Ldc4;

    .line 2801
    .line 2802
    iget-boolean v5, v2, Ldc4;->g:Z

    .line 2803
    .line 2804
    if-nez v5, :cond_70

    .line 2805
    .line 2806
    iget-wide v5, v2, Ldc4;->q:J

    .line 2807
    .line 2808
    const-wide/32 v7, 0x7a120

    .line 2809
    .line 2810
    .line 2811
    cmp-long v2, v5, v7

    .line 2812
    .line 2813
    if-gez v2, :cond_70

    .line 2814
    .line 2815
    iget-object v0, v0, Lrb4;->k:Lpb4;

    .line 2816
    .line 2817
    invoke-static {v0}, Ljb4;->A(Lpb4;)Z

    .line 2818
    .line 2819
    .line 2820
    move-result v0

    .line 2821
    if-eqz v0, :cond_70

    .line 2822
    .line 2823
    invoke-virtual {v1}, Ljb4;->T()Z

    .line 2824
    .line 2825
    .line 2826
    move-result v0

    .line 2827
    if-eqz v0, :cond_70

    .line 2828
    .line 2829
    iget-wide v5, v1, Ljb4;->c0:J

    .line 2830
    .line 2831
    cmp-long v0, v5, v21

    .line 2832
    .line 2833
    if-nez v0, :cond_6e

    .line 2834
    .line 2835
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 2836
    .line 2837
    .line 2838
    move-result-wide v5

    .line 2839
    iput-wide v5, v1, Ljb4;->c0:J

    .line 2840
    .line 2841
    goto :goto_42

    .line 2842
    :cond_6e
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 2843
    .line 2844
    .line 2845
    move-result-wide v5

    .line 2846
    iget-wide v7, v1, Ljb4;->c0:J

    .line 2847
    .line 2848
    sub-long/2addr v5, v7

    .line 2849
    const-wide/16 v7, 0xfa0

    .line 2850
    .line 2851
    cmp-long v0, v5, v7

    .line 2852
    .line 2853
    if-gez v0, :cond_6f

    .line 2854
    .line 2855
    goto :goto_42

    .line 2856
    :cond_6f
    new-instance v0, Lzc4;

    .line 2857
    .line 2858
    const/16 v2, 0xfa0

    .line 2859
    .line 2860
    const/4 v14, 0x0

    .line 2861
    invoke-direct {v0, v14, v2}, Lzc4;-><init>(II)V

    .line 2862
    .line 2863
    .line 2864
    throw v0

    .line 2865
    :cond_70
    move-wide/from16 v9, v21

    .line 2866
    .line 2867
    iput-wide v9, v1, Ljb4;->c0:J

    .line 2868
    .line 2869
    :goto_42
    invoke-virtual {v1}, Ljb4;->T()Z

    .line 2870
    .line 2871
    .line 2872
    move-result v0

    .line 2873
    if-eqz v0, :cond_71

    .line 2874
    .line 2875
    iget-object v0, v1, Ljb4;->K:Ldc4;

    .line 2876
    .line 2877
    iget v0, v0, Ldc4;->e:I

    .line 2878
    .line 2879
    if-ne v0, v11, :cond_71

    .line 2880
    .line 2881
    const/4 v0, 0x1

    .line 2882
    goto :goto_43

    .line 2883
    :cond_71
    const/4 v0, 0x0

    .line 2884
    :goto_43
    iget-object v2, v1, Ljb4;->K:Ldc4;

    .line 2885
    .line 2886
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2887
    .line 2888
    .line 2889
    iget-object v2, v1, Ljb4;->K:Ldc4;

    .line 2890
    .line 2891
    iget v2, v2, Ldc4;->e:I

    .line 2892
    .line 2893
    const/4 v5, 0x4

    .line 2894
    if-ne v2, v5, :cond_72

    .line 2895
    .line 2896
    goto :goto_44

    .line 2897
    :cond_72
    if-nez v0, :cond_73

    .line 2898
    .line 2899
    if-eq v2, v15, :cond_73

    .line 2900
    .line 2901
    if-ne v2, v11, :cond_74

    .line 2902
    .line 2903
    iget v0, v1, Ljb4;->V:I

    .line 2904
    .line 2905
    if-eqz v0, :cond_74

    .line 2906
    .line 2907
    :cond_73
    invoke-virtual {v1, v3, v4}, Ljb4;->p(J)V

    .line 2908
    .line 2909
    .line 2910
    :cond_74
    :goto_44
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 2911
    .line 2912
    .line 2913
    goto/16 :goto_31

    .line 2914
    .line 2915
    :pswitch_25
    move v15, v2

    .line 2916
    move-object/from16 v23, v11

    .line 2917
    .line 2918
    iget v2, v0, Landroid/os/Message;->arg1:I

    .line 2919
    .line 2920
    if-eqz v2, :cond_75

    .line 2921
    .line 2922
    const/4 v3, 0x1

    .line 2923
    goto :goto_45

    .line 2924
    :cond_75
    const/4 v3, 0x0

    .line 2925
    :goto_45
    iget v0, v0, Landroid/os/Message;->arg2:I

    .line 2926
    .line 2927
    shr-int/lit8 v2, v0, 0x4

    .line 2928
    .line 2929
    and-int/2addr v0, v6

    .line 2930
    iget-object v4, v1, Ljb4;->L:Lr60;

    .line 2931
    .line 2932
    const/4 v8, 0x1

    .line 2933
    invoke-virtual {v4, v8}, Lr60;->f(I)V

    .line 2934
    .line 2935
    .line 2936
    iget-object v4, v1, Ljb4;->K:Ldc4;

    .line 2937
    .line 2938
    iget v4, v4, Ldc4;->e:I

    .line 2939
    .line 2940
    iget-object v5, v1, Ljb4;->D:Lr24;

    .line 2941
    .line 2942
    invoke-virtual {v5, v4, v3}, Lr24;->b(IZ)I

    .line 2943
    .line 2944
    .line 2945
    move-result v4

    .line 2946
    invoke-virtual {v1, v4, v2, v0, v3}, Ljb4;->h(IIIZ)V
    :try_end_1b
    .catch Lb84; {:try_start_1b .. :try_end_1b} :catch_11
    .catch Lif4; {:try_start_1b .. :try_end_1b} :catch_4
    .catch Llq1; {:try_start_1b .. :try_end_1b} :catch_3
    .catch Ldi3; {:try_start_1b .. :try_end_1b} :catch_2
    .catch Ljava/io/IOException; {:try_start_1b .. :try_end_1b} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_1b .. :try_end_1b} :catch_10

    .line 2947
    .line 2948
    .line 2949
    goto/16 :goto_31

    .line 2950
    .line 2951
    :goto_46
    instance-of v2, v0, Ljava/lang/IllegalStateException;

    .line 2952
    .line 2953
    const/16 v3, 0x3ec

    .line 2954
    .line 2955
    if-nez v2, :cond_76

    .line 2956
    .line 2957
    instance-of v2, v0, Ljava/lang/IllegalArgumentException;

    .line 2958
    .line 2959
    if-eqz v2, :cond_77

    .line 2960
    .line 2961
    :cond_76
    move v13, v3

    .line 2962
    goto :goto_47

    .line 2963
    :cond_77
    const/16 v13, 0x3e8

    .line 2964
    .line 2965
    :goto_47
    new-instance v2, Lb84;

    .line 2966
    .line 2967
    invoke-direct {v2, v15, v0, v13}, Lb84;-><init>(ILjava/lang/Exception;I)V

    .line 2968
    .line 2969
    .line 2970
    move-object/from16 v11, v23

    .line 2971
    .line 2972
    invoke-static {v12, v11, v2}, La30;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2973
    .line 2974
    .line 2975
    const/4 v8, 0x1

    .line 2976
    const/4 v14, 0x0

    .line 2977
    invoke-virtual {v1, v8, v14}, Ljb4;->u(ZZ)V

    .line 2978
    .line 2979
    .line 2980
    iget-object v0, v1, Ljb4;->K:Ldc4;

    .line 2981
    .line 2982
    invoke-virtual {v0, v2}, Ldc4;->e(Lb84;)Ldc4;

    .line 2983
    .line 2984
    .line 2985
    move-result-object v0

    .line 2986
    iput-object v0, v1, Ljb4;->K:Ldc4;

    .line 2987
    .line 2988
    goto/16 :goto_31

    .line 2989
    .line 2990
    :goto_48
    const/16 v2, 0x7d0

    .line 2991
    .line 2992
    invoke-virtual {v1, v0, v2}, Ljb4;->a(Ljava/io/IOException;I)V

    .line 2993
    .line 2994
    .line 2995
    goto/16 :goto_31

    .line 2996
    .line 2997
    :goto_49
    iget v2, v0, Ldi3;->f:I

    .line 2998
    .line 2999
    invoke-virtual {v1, v0, v2}, Ljb4;->a(Ljava/io/IOException;I)V

    .line 3000
    .line 3001
    .line 3002
    goto/16 :goto_31

    .line 3003
    .line 3004
    :goto_4a
    iget v2, v0, Llq1;->g:I

    .line 3005
    .line 3006
    const/4 v8, 0x1

    .line 3007
    if-ne v2, v8, :cond_79

    .line 3008
    .line 3009
    iget-boolean v2, v0, Llq1;->f:Z

    .line 3010
    .line 3011
    if-eq v8, v2, :cond_78

    .line 3012
    .line 3013
    const/16 v13, 0xbbb

    .line 3014
    .line 3015
    goto :goto_4b

    .line 3016
    :cond_78
    const/16 v13, 0xbb9

    .line 3017
    .line 3018
    goto :goto_4b

    .line 3019
    :cond_79
    const/16 v13, 0x3e8

    .line 3020
    .line 3021
    :goto_4b
    invoke-virtual {v1, v0, v13}, Ljb4;->a(Ljava/io/IOException;I)V

    .line 3022
    .line 3023
    .line 3024
    goto/16 :goto_31

    .line 3025
    .line 3026
    :goto_4c
    iget v2, v0, Lif4;->f:I

    .line 3027
    .line 3028
    invoke-virtual {v1, v0, v2}, Ljb4;->a(Ljava/io/IOException;I)V

    .line 3029
    .line 3030
    .line 3031
    goto/16 :goto_31

    .line 3032
    .line 3033
    :goto_4d
    iget v2, v0, Lb84;->h:I

    .line 3034
    .line 3035
    const/4 v8, 0x1

    .line 3036
    if-ne v2, v8, :cond_7a

    .line 3037
    .line 3038
    iget-object v2, v1, Ljb4;->w:Lrb4;

    .line 3039
    .line 3040
    invoke-virtual {v2}, Lrb4;->t()Lpb4;

    .line 3041
    .line 3042
    .line 3043
    move-result-object v2

    .line 3044
    if-eqz v2, :cond_7a

    .line 3045
    .line 3046
    iget-object v3, v0, Lb84;->m:Lkh4;

    .line 3047
    .line 3048
    if-nez v3, :cond_7a

    .line 3049
    .line 3050
    iget-object v2, v2, Lpb4;->g:Lqb4;

    .line 3051
    .line 3052
    iget-object v2, v2, Lqb4;->a:Lkh4;

    .line 3053
    .line 3054
    invoke-virtual {v0, v2}, Lb84;->a(Lkh4;)Lb84;

    .line 3055
    .line 3056
    .line 3057
    move-result-object v0

    .line 3058
    :cond_7a
    iget v2, v0, Lb84;->h:I

    .line 3059
    .line 3060
    const/4 v8, 0x1

    .line 3061
    if-ne v2, v8, :cond_7e

    .line 3062
    .line 3063
    iget-object v2, v0, Lb84;->m:Lkh4;

    .line 3064
    .line 3065
    if-eqz v2, :cond_7e

    .line 3066
    .line 3067
    iget v3, v0, Lb84;->j:I

    .line 3068
    .line 3069
    iget-object v4, v1, Ljb4;->w:Lrb4;

    .line 3070
    .line 3071
    invoke-virtual {v4}, Lrb4;->u()Lpb4;

    .line 3072
    .line 3073
    .line 3074
    move-result-object v5

    .line 3075
    if-eqz v5, :cond_7e

    .line 3076
    .line 3077
    invoke-virtual {v4}, Lrb4;->u()Lpb4;

    .line 3078
    .line 3079
    .line 3080
    move-result-object v5

    .line 3081
    iget-object v5, v5, Lpb4;->g:Lqb4;

    .line 3082
    .line 3083
    iget-object v5, v5, Lqb4;->a:Lkh4;

    .line 3084
    .line 3085
    invoke-virtual {v5, v2}, Lkh4;->equals(Ljava/lang/Object;)Z

    .line 3086
    .line 3087
    .line 3088
    move-result v2

    .line 3089
    if-nez v2, :cond_7b

    .line 3090
    .line 3091
    goto :goto_50

    .line 3092
    :cond_7b
    iget-object v2, v1, Ljb4;->f:[Lt71;

    .line 3093
    .line 3094
    aget-object v2, v2, v3

    .line 3095
    .line 3096
    invoke-virtual {v4}, Lrb4;->u()Lpb4;

    .line 3097
    .line 3098
    .line 3099
    move-result-object v3

    .line 3100
    invoke-virtual {v2, v3}, Lt71;->z(Lpb4;)Z

    .line 3101
    .line 3102
    .line 3103
    move-result v2

    .line 3104
    if-eqz v2, :cond_7e

    .line 3105
    .line 3106
    const/4 v8, 0x1

    .line 3107
    iput-boolean v8, v1, Ljb4;->f0:Z

    .line 3108
    .line 3109
    invoke-virtual {v1}, Ljb4;->C()V

    .line 3110
    .line 3111
    .line 3112
    invoke-virtual {v4}, Lrb4;->u()Lpb4;

    .line 3113
    .line 3114
    .line 3115
    move-result-object v0

    .line 3116
    invoke-virtual {v4}, Lrb4;->s()Lpb4;

    .line 3117
    .line 3118
    .line 3119
    move-result-object v2

    .line 3120
    invoke-virtual {v4}, Lrb4;->s()Lpb4;

    .line 3121
    .line 3122
    .line 3123
    move-result-object v3

    .line 3124
    if-ne v3, v0, :cond_7c

    .line 3125
    .line 3126
    goto :goto_4f

    .line 3127
    :cond_7c
    :goto_4e
    if-eqz v2, :cond_7d

    .line 3128
    .line 3129
    invoke-virtual {v2}, Lpb4;->i()Lpb4;

    .line 3130
    .line 3131
    .line 3132
    move-result-object v3

    .line 3133
    if-eq v3, v0, :cond_7d

    .line 3134
    .line 3135
    invoke-virtual {v2}, Lpb4;->i()Lpb4;

    .line 3136
    .line 3137
    .line 3138
    move-result-object v2

    .line 3139
    goto :goto_4e

    .line 3140
    :cond_7d
    :goto_4f
    invoke-virtual {v4, v2}, Lrb4;->y(Lpb4;)I

    .line 3141
    .line 3142
    .line 3143
    iget-object v0, v1, Ljb4;->K:Ldc4;

    .line 3144
    .line 3145
    iget v0, v0, Ldc4;->e:I

    .line 3146
    .line 3147
    const/4 v5, 0x4

    .line 3148
    if-eq v0, v5, :cond_50

    .line 3149
    .line 3150
    invoke-virtual {v1}, Ljb4;->L()V

    .line 3151
    .line 3152
    .line 3153
    iget-object v0, v1, Ljb4;->m:Ld13;

    .line 3154
    .line 3155
    invoke-virtual {v0, v15}, Ld13;->b(I)Z

    .line 3156
    .line 3157
    .line 3158
    goto/16 :goto_31

    .line 3159
    .line 3160
    :cond_7e
    :goto_50
    iget-object v2, v1, Ljb4;->b0:Lb84;

    .line 3161
    .line 3162
    if-eqz v2, :cond_7f

    .line 3163
    .line 3164
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 3165
    .line 3166
    .line 3167
    iget-object v0, v1, Ljb4;->b0:Lb84;

    .line 3168
    .line 3169
    :cond_7f
    iget v2, v0, Lb84;->h:I

    .line 3170
    .line 3171
    const/4 v8, 0x1

    .line 3172
    if-ne v2, v8, :cond_81

    .line 3173
    .line 3174
    iget-object v2, v1, Ljb4;->w:Lrb4;

    .line 3175
    .line 3176
    invoke-virtual {v2}, Lrb4;->s()Lpb4;

    .line 3177
    .line 3178
    .line 3179
    move-result-object v3

    .line 3180
    invoke-virtual {v2}, Lrb4;->t()Lpb4;

    .line 3181
    .line 3182
    .line 3183
    move-result-object v4

    .line 3184
    if-eq v3, v4, :cond_81

    .line 3185
    .line 3186
    :goto_51
    invoke-virtual {v2}, Lrb4;->s()Lpb4;

    .line 3187
    .line 3188
    .line 3189
    move-result-object v3

    .line 3190
    invoke-virtual {v2}, Lrb4;->t()Lpb4;

    .line 3191
    .line 3192
    .line 3193
    move-result-object v4

    .line 3194
    if-eq v3, v4, :cond_80

    .line 3195
    .line 3196
    invoke-virtual {v2}, Lrb4;->x()Lpb4;

    .line 3197
    .line 3198
    .line 3199
    goto :goto_51

    .line 3200
    :cond_80
    invoke-virtual {v2}, Lrb4;->s()Lpb4;

    .line 3201
    .line 3202
    .line 3203
    move-result-object v2

    .line 3204
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3205
    .line 3206
    .line 3207
    invoke-virtual {v1}, Ljb4;->e()V

    .line 3208
    .line 3209
    .line 3210
    iget-object v2, v2, Lpb4;->g:Lqb4;

    .line 3211
    .line 3212
    iget-object v3, v2, Lqb4;->a:Lkh4;

    .line 3213
    .line 3214
    move-object v5, v3

    .line 3215
    iget-wide v3, v2, Lqb4;->b:J

    .line 3216
    .line 3217
    iget-wide v6, v2, Lqb4;->c:J

    .line 3218
    .line 3219
    const/4 v9, 0x1

    .line 3220
    const/4 v10, 0x0

    .line 3221
    move-object v2, v5

    .line 3222
    move-wide v5, v6

    .line 3223
    move-wide v7, v3

    .line 3224
    invoke-virtual/range {v1 .. v10}, Ljb4;->N(Lkh4;JJJZI)Ldc4;

    .line 3225
    .line 3226
    .line 3227
    move-result-object v2

    .line 3228
    iput-object v2, v1, Ljb4;->K:Ldc4;

    .line 3229
    .line 3230
    :cond_81
    iget-boolean v2, v0, Lb84;->n:Z

    .line 3231
    .line 3232
    if-eqz v2, :cond_84

    .line 3233
    .line 3234
    iget-object v2, v1, Ljb4;->b0:Lb84;

    .line 3235
    .line 3236
    if-eqz v2, :cond_82

    .line 3237
    .line 3238
    iget v2, v0, Lb84;->f:I

    .line 3239
    .line 3240
    const/16 v3, 0x138c

    .line 3241
    .line 3242
    if-eq v2, v3, :cond_82

    .line 3243
    .line 3244
    const/16 v3, 0x138b

    .line 3245
    .line 3246
    if-ne v2, v3, :cond_84

    .line 3247
    .line 3248
    :cond_82
    const-string v2, "Recoverable renderer error"

    .line 3249
    .line 3250
    invoke-static {v2, v0}, La30;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 3251
    .line 3252
    .line 3253
    iget-object v2, v1, Ljb4;->b0:Lb84;

    .line 3254
    .line 3255
    if-nez v2, :cond_83

    .line 3256
    .line 3257
    iput-object v0, v1, Ljb4;->b0:Lb84;

    .line 3258
    .line 3259
    :cond_83
    iget-object v2, v1, Ljb4;->m:Ld13;

    .line 3260
    .line 3261
    const/16 v3, 0x19

    .line 3262
    .line 3263
    invoke-virtual {v2, v3, v0}, Ld13;->a(ILjava/lang/Object;)Lv03;

    .line 3264
    .line 3265
    .line 3266
    move-result-object v0

    .line 3267
    iget-object v2, v2, Ld13;->a:Landroid/os/Handler;

    .line 3268
    .line 3269
    iget-object v3, v0, Lv03;->a:Landroid/os/Message;

    .line 3270
    .line 3271
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3272
    .line 3273
    .line 3274
    invoke-virtual {v2, v3}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z

    .line 3275
    .line 3276
    .line 3277
    const/4 v3, 0x0

    .line 3278
    iput-object v3, v0, Lv03;->a:Landroid/os/Message;

    .line 3279
    .line 3280
    invoke-static {v0}, Ld13;->e(Lv03;)V

    .line 3281
    .line 3282
    .line 3283
    goto/16 :goto_31

    .line 3284
    .line 3285
    :cond_84
    invoke-static {v12, v11, v0}, La30;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 3286
    .line 3287
    .line 3288
    const/4 v8, 0x1

    .line 3289
    const/4 v14, 0x0

    .line 3290
    invoke-virtual {v1, v8, v14}, Ljb4;->u(ZZ)V

    .line 3291
    .line 3292
    .line 3293
    iget-object v2, v1, Ljb4;->K:Ldc4;

    .line 3294
    .line 3295
    invoke-virtual {v2, v0}, Ldc4;->e(Lb84;)Ldc4;

    .line 3296
    .line 3297
    .line 3298
    move-result-object v0

    .line 3299
    iput-object v0, v1, Ljb4;->K:Ldc4;

    .line 3300
    .line 3301
    :cond_85
    :goto_52
    invoke-virtual {v1}, Ljb4;->e()V

    .line 3302
    .line 3303
    .line 3304
    return v8

    .line 3305
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final i(Z)V
    .locals 11

    .line 1
    iget-object v0, p0, Ljb4;->w:Lrb4;

    .line 2
    .line 3
    iget-object v0, v0, Lrb4;->h:Lpb4;

    .line 4
    .line 5
    iget-object v0, v0, Lpb4;->g:Lqb4;

    .line 6
    .line 7
    iget-object v2, v0, Lqb4;->a:Lkh4;

    .line 8
    .line 9
    iget-object v0, p0, Ljb4;->K:Ldc4;

    .line 10
    .line 11
    iget-wide v3, v0, Ldc4;->r:J

    .line 12
    .line 13
    const/4 v5, 0x1

    .line 14
    const/4 v6, 0x0

    .line 15
    move-object v1, p0

    .line 16
    invoke-virtual/range {v1 .. v6}, Ljb4;->r(Lkh4;JZZ)J

    .line 17
    .line 18
    .line 19
    move-result-wide v3

    .line 20
    iget-object v0, v1, Ljb4;->K:Ldc4;

    .line 21
    .line 22
    iget-wide v5, v0, Ldc4;->r:J

    .line 23
    .line 24
    cmp-long v0, v3, v5

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    iget-object v0, v1, Ljb4;->K:Ldc4;

    .line 29
    .line 30
    iget-wide v5, v0, Ldc4;->c:J

    .line 31
    .line 32
    iget-wide v7, v0, Ldc4;->d:J

    .line 33
    .line 34
    const/4 v10, 0x5

    .line 35
    move v9, p1

    .line 36
    invoke-virtual/range {v1 .. v10}, Ljb4;->N(Lkh4;JJJZI)Ldc4;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, v1, Ljb4;->K:Ldc4;

    .line 41
    .line 42
    :cond_0
    return-void
.end method

.method public final j()V
    .locals 3

    .line 1
    iget-object v0, p0, Ljb4;->w:Lrb4;

    .line 2
    .line 3
    iget-object v0, v0, Lrb4;->h:Lpb4;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-object v0, v0, Lpb4;->o:Lpj4;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    const/4 v2, 0x2

    .line 12
    if-ge v1, v2, :cond_2

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lpj4;->a(I)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    iget-object v2, p0, Ljb4;->f:[Lt71;

    .line 21
    .line 22
    aget-object v2, v2, v1

    .line 23
    .line 24
    invoke-virtual {v2}, Lt71;->D()V

    .line 25
    .line 26
    .line 27
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    :goto_1
    return-void
.end method

.method public final k()V
    .locals 4

    .line 1
    iget-object v0, p0, Ljb4;->s:Lg53;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, v0, Lg53;->g:Z

    .line 5
    .line 6
    iget-object v0, v0, Lg53;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lnc4;

    .line 9
    .line 10
    iget-boolean v2, v0, Lnc4;->f:Z

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Lnc4;->e()J

    .line 15
    .line 16
    .line 17
    move-result-wide v2

    .line 18
    invoke-virtual {v0, v2, v3}, Lnc4;->a(J)V

    .line 19
    .line 20
    .line 21
    iput-boolean v1, v0, Lnc4;->f:Z

    .line 22
    .line 23
    :cond_0
    :goto_0
    const/4 v0, 0x2

    .line 24
    if-ge v1, v0, :cond_3

    .line 25
    .line 26
    iget-object v0, p0, Ljb4;->f:[Lt71;

    .line 27
    .line 28
    aget-object v0, v0, v1

    .line 29
    .line 30
    iget-object v2, v0, Lt71;->e:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v2, Lkg4;

    .line 33
    .line 34
    invoke-static {v2}, Lt71;->l(Lkg4;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_1

    .line 39
    .line 40
    invoke-static {v2}, Lt71;->n(Lkg4;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    iget-object v0, v0, Lt71;->f:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Lkg4;

    .line 46
    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    iget v2, v0, Lkg4;->m:I

    .line 50
    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    invoke-static {v0}, Lt71;->n(Lkg4;)V

    .line 54
    .line 55
    .line 56
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    return-void
.end method

.method public final l()V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v10, v0, Ljb4;->w:Lrb4;

    .line 4
    .line 5
    iget-object v1, v10, Lrb4;->h:Lpb4;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_e

    .line 10
    .line 11
    :cond_0
    iget-boolean v2, v1, Lpb4;->e:Z

    .line 12
    .line 13
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    iget-object v2, v1, Lpb4;->a:Ljava/lang/Object;

    .line 21
    .line 22
    invoke-interface {v2}, Ljh4;->f()J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move-wide v2, v11

    .line 28
    :goto_0
    cmp-long v4, v2, v11

    .line 29
    .line 30
    const/4 v13, 0x2

    .line 31
    const/16 v14, 0x10

    .line 32
    .line 33
    const/4 v15, 0x1

    .line 34
    const/4 v5, 0x0

    .line 35
    if-eqz v4, :cond_4

    .line 36
    .line 37
    invoke-virtual {v1}, Lpb4;->b()Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-nez v4, :cond_2

    .line 42
    .line 43
    invoke-virtual {v10, v1}, Lrb4;->y(Lpb4;)I

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v5}, Ljb4;->Q(Z)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljb4;->L()V

    .line 50
    .line 51
    .line 52
    :cond_2
    invoke-virtual {v0, v2, v3, v15}, Ljb4;->s(JZ)V

    .line 53
    .line 54
    .line 55
    iget-object v1, v0, Ljb4;->K:Ldc4;

    .line 56
    .line 57
    iget-wide v6, v1, Ldc4;->r:J

    .line 58
    .line 59
    cmp-long v1, v2, v6

    .line 60
    .line 61
    if-eqz v1, :cond_3

    .line 62
    .line 63
    iget-object v1, v0, Ljb4;->K:Ldc4;

    .line 64
    .line 65
    iget-object v4, v1, Ldc4;->b:Lkh4;

    .line 66
    .line 67
    iget-wide v6, v1, Ldc4;->c:J

    .line 68
    .line 69
    const/4 v8, 0x1

    .line 70
    const/4 v9, 0x5

    .line 71
    move-object v1, v4

    .line 72
    move/from16 v16, v5

    .line 73
    .line 74
    move-wide v4, v6

    .line 75
    move-wide v6, v2

    .line 76
    move-wide/from16 v17, v11

    .line 77
    .line 78
    move/from16 v11, v16

    .line 79
    .line 80
    invoke-virtual/range {v0 .. v9}, Ljb4;->N(Lkh4;JJJZI)Ldc4;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    iput-object v1, v0, Ljb4;->K:Ldc4;

    .line 85
    .line 86
    goto/16 :goto_7

    .line 87
    .line 88
    :cond_3
    move-wide/from16 v17, v11

    .line 89
    .line 90
    move v11, v5

    .line 91
    goto/16 :goto_7

    .line 92
    .line 93
    :cond_4
    move-wide/from16 v17, v11

    .line 94
    .line 95
    move v11, v5

    .line 96
    iget-object v2, v0, Ljb4;->s:Lg53;

    .line 97
    .line 98
    iget-object v3, v10, Lrb4;->i:Lpb4;

    .line 99
    .line 100
    if-eq v1, v3, :cond_5

    .line 101
    .line 102
    move v5, v15

    .line 103
    goto :goto_1

    .line 104
    :cond_5
    move v5, v11

    .line 105
    :goto_1
    iget-object v3, v2, Lg53;->h:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v3, Lnc4;

    .line 108
    .line 109
    iget-object v4, v2, Lg53;->j:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v4, Lkg4;

    .line 112
    .line 113
    if-eqz v4, :cond_a

    .line 114
    .line 115
    invoke-virtual {v4}, Lkg4;->u()Z

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    if-nez v4, :cond_a

    .line 120
    .line 121
    if-eqz v5, :cond_6

    .line 122
    .line 123
    iget-object v4, v2, Lg53;->j:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v4, Lkg4;

    .line 126
    .line 127
    iget v4, v4, Lkg4;->m:I

    .line 128
    .line 129
    if-ne v4, v13, :cond_a

    .line 130
    .line 131
    :cond_6
    iget-object v4, v2, Lg53;->j:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v4, Lkg4;

    .line 134
    .line 135
    invoke-virtual {v4}, Lkg4;->t()Z

    .line 136
    .line 137
    .line 138
    move-result v4

    .line 139
    if-nez v4, :cond_7

    .line 140
    .line 141
    if-nez v5, :cond_a

    .line 142
    .line 143
    iget-object v4, v2, Lg53;->j:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v4, Lkg4;

    .line 146
    .line 147
    invoke-virtual {v4}, Lkg4;->n0()Z

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    if-eqz v4, :cond_7

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_7
    iget-object v4, v2, Lg53;->k:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v4, Lob4;

    .line 157
    .line 158
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-interface {v4}, Lob4;->e()J

    .line 162
    .line 163
    .line 164
    move-result-wide v5

    .line 165
    iget-boolean v7, v2, Lg53;->f:Z

    .line 166
    .line 167
    if-eqz v7, :cond_9

    .line 168
    .line 169
    invoke-virtual {v3}, Lnc4;->e()J

    .line 170
    .line 171
    .line 172
    move-result-wide v7

    .line 173
    cmp-long v7, v5, v7

    .line 174
    .line 175
    if-gez v7, :cond_8

    .line 176
    .line 177
    iget-boolean v4, v3, Lnc4;->f:Z

    .line 178
    .line 179
    if-eqz v4, :cond_b

    .line 180
    .line 181
    invoke-virtual {v3}, Lnc4;->e()J

    .line 182
    .line 183
    .line 184
    move-result-wide v4

    .line 185
    invoke-virtual {v3, v4, v5}, Lnc4;->a(J)V

    .line 186
    .line 187
    .line 188
    iput-boolean v11, v3, Lnc4;->f:Z

    .line 189
    .line 190
    goto :goto_3

    .line 191
    :cond_8
    iput-boolean v11, v2, Lg53;->f:Z

    .line 192
    .line 193
    iget-boolean v7, v2, Lg53;->g:Z

    .line 194
    .line 195
    if-eqz v7, :cond_9

    .line 196
    .line 197
    iget-boolean v7, v3, Lnc4;->f:Z

    .line 198
    .line 199
    if-nez v7, :cond_9

    .line 200
    .line 201
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 202
    .line 203
    .line 204
    move-result-wide v7

    .line 205
    iput-wide v7, v3, Lnc4;->h:J

    .line 206
    .line 207
    iput-boolean v15, v3, Lnc4;->f:Z

    .line 208
    .line 209
    :cond_9
    invoke-virtual {v3, v5, v6}, Lnc4;->a(J)V

    .line 210
    .line 211
    .line 212
    invoke-interface {v4}, Lob4;->g()Lsr1;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    iget-object v5, v3, Lnc4;->i:Lsr1;

    .line 217
    .line 218
    invoke-virtual {v4, v5}, Lsr1;->equals(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v5

    .line 222
    if-nez v5, :cond_b

    .line 223
    .line 224
    invoke-virtual {v3, v4}, Lnc4;->b(Lsr1;)V

    .line 225
    .line 226
    .line 227
    iget-object v3, v2, Lg53;->i:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast v3, Ljb4;

    .line 230
    .line 231
    iget-object v3, v3, Ljb4;->m:Ld13;

    .line 232
    .line 233
    invoke-virtual {v3, v14, v4}, Ld13;->a(ILjava/lang/Object;)Lv03;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    invoke-virtual {v3}, Lv03;->a()V

    .line 238
    .line 239
    .line 240
    goto :goto_3

    .line 241
    :cond_a
    :goto_2
    iput-boolean v15, v2, Lg53;->f:Z

    .line 242
    .line 243
    iget-boolean v4, v2, Lg53;->g:Z

    .line 244
    .line 245
    if-eqz v4, :cond_b

    .line 246
    .line 247
    iget-boolean v4, v3, Lnc4;->f:Z

    .line 248
    .line 249
    if-nez v4, :cond_b

    .line 250
    .line 251
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 252
    .line 253
    .line 254
    move-result-wide v4

    .line 255
    iput-wide v4, v3, Lnc4;->h:J

    .line 256
    .line 257
    iput-boolean v15, v3, Lnc4;->f:Z

    .line 258
    .line 259
    :cond_b
    :goto_3
    invoke-virtual {v2}, Lg53;->e()J

    .line 260
    .line 261
    .line 262
    move-result-wide v3

    .line 263
    iput-wide v3, v0, Ljb4;->X:J

    .line 264
    .line 265
    iget-wide v5, v1, Lpb4;->p:J

    .line 266
    .line 267
    sub-long/2addr v3, v5

    .line 268
    iget-object v1, v0, Ljb4;->K:Ldc4;

    .line 269
    .line 270
    iget-wide v5, v1, Ldc4;->r:J

    .line 271
    .line 272
    iget-object v1, v0, Ljb4;->t:Ljava/util/ArrayList;

    .line 273
    .line 274
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 275
    .line 276
    .line 277
    move-result v5

    .line 278
    if-nez v5, :cond_12

    .line 279
    .line 280
    iget-object v5, v0, Ljb4;->K:Ldc4;

    .line 281
    .line 282
    iget-object v5, v5, Ldc4;->b:Lkh4;

    .line 283
    .line 284
    invoke-virtual {v5}, Lkh4;->b()Z

    .line 285
    .line 286
    .line 287
    move-result v5

    .line 288
    if-eqz v5, :cond_c

    .line 289
    .line 290
    goto :goto_6

    .line 291
    :cond_c
    iget-boolean v5, v0, Ljb4;->a0:Z

    .line 292
    .line 293
    if-eqz v5, :cond_d

    .line 294
    .line 295
    iput-boolean v11, v0, Ljb4;->a0:Z

    .line 296
    .line 297
    :cond_d
    iget-object v5, v0, Ljb4;->K:Ldc4;

    .line 298
    .line 299
    iget-object v6, v5, Ldc4;->a:Loz1;

    .line 300
    .line 301
    iget-object v5, v5, Ldc4;->b:Lkh4;

    .line 302
    .line 303
    iget-object v5, v5, Lkh4;->a:Ljava/lang/Object;

    .line 304
    .line 305
    invoke-virtual {v6, v5}, Loz1;->e(Ljava/lang/Object;)I

    .line 306
    .line 307
    .line 308
    iget v5, v0, Ljb4;->Z:I

    .line 309
    .line 310
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 311
    .line 312
    .line 313
    move-result v6

    .line 314
    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    .line 315
    .line 316
    .line 317
    move-result v5

    .line 318
    if-lez v5, :cond_f

    .line 319
    .line 320
    add-int/lit8 v6, v5, -0x1

    .line 321
    .line 322
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v6

    .line 326
    if-nez v6, :cond_e

    .line 327
    .line 328
    goto :goto_4

    .line 329
    :cond_e
    new-instance v1, Ljava/lang/ClassCastException;

    .line 330
    .line 331
    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    .line 332
    .line 333
    .line 334
    throw v1

    .line 335
    :cond_f
    :goto_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 336
    .line 337
    .line 338
    move-result v6

    .line 339
    if-ge v5, v6, :cond_11

    .line 340
    .line 341
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v1

    .line 345
    if-nez v1, :cond_10

    .line 346
    .line 347
    goto :goto_5

    .line 348
    :cond_10
    new-instance v1, Ljava/lang/ClassCastException;

    .line 349
    .line 350
    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    .line 351
    .line 352
    .line 353
    throw v1

    .line 354
    :cond_11
    :goto_5
    iput v5, v0, Ljb4;->Z:I

    .line 355
    .line 356
    :cond_12
    :goto_6
    invoke-virtual {v2}, Lg53;->f()Z

    .line 357
    .line 358
    .line 359
    move-result v1

    .line 360
    if-eqz v1, :cond_13

    .line 361
    .line 362
    iget-object v1, v0, Ljb4;->L:Lr60;

    .line 363
    .line 364
    iget-boolean v1, v1, Lr60;->d:Z

    .line 365
    .line 366
    xor-int/lit8 v8, v1, 0x1

    .line 367
    .line 368
    iget-object v1, v0, Ljb4;->K:Ldc4;

    .line 369
    .line 370
    iget-object v2, v1, Ldc4;->b:Lkh4;

    .line 371
    .line 372
    iget-wide v5, v1, Ldc4;->c:J

    .line 373
    .line 374
    const/4 v9, 0x6

    .line 375
    move-object v1, v2

    .line 376
    move-wide v2, v3

    .line 377
    move-wide v4, v5

    .line 378
    move-wide v6, v2

    .line 379
    invoke-virtual/range {v0 .. v9}, Ljb4;->N(Lkh4;JJJZI)Ldc4;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    iput-object v1, v0, Ljb4;->K:Ldc4;

    .line 384
    .line 385
    goto :goto_7

    .line 386
    :cond_13
    move-wide v2, v3

    .line 387
    iget-object v1, v0, Ljb4;->K:Ldc4;

    .line 388
    .line 389
    iput-wide v2, v1, Ldc4;->r:J

    .line 390
    .line 391
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 392
    .line 393
    .line 394
    move-result-wide v2

    .line 395
    iput-wide v2, v1, Ldc4;->s:J

    .line 396
    .line 397
    :goto_7
    iget-object v1, v10, Lrb4;->k:Lpb4;

    .line 398
    .line 399
    iget-object v2, v0, Ljb4;->K:Ldc4;

    .line 400
    .line 401
    invoke-virtual {v1}, Lpb4;->d()J

    .line 402
    .line 403
    .line 404
    move-result-wide v3

    .line 405
    iput-wide v3, v2, Ldc4;->p:J

    .line 406
    .line 407
    iget-object v1, v0, Ljb4;->K:Ldc4;

    .line 408
    .line 409
    iget-wide v2, v1, Ldc4;->p:J

    .line 410
    .line 411
    invoke-virtual {v0, v2, v3}, Ljb4;->R(J)J

    .line 412
    .line 413
    .line 414
    move-result-wide v2

    .line 415
    iput-wide v2, v1, Ldc4;->q:J

    .line 416
    .line 417
    iget-object v1, v0, Ljb4;->K:Ldc4;

    .line 418
    .line 419
    iget-boolean v2, v1, Ldc4;->l:Z

    .line 420
    .line 421
    if-eqz v2, :cond_1d

    .line 422
    .line 423
    iget v2, v1, Ldc4;->e:I

    .line 424
    .line 425
    const/4 v3, 0x3

    .line 426
    if-ne v2, v3, :cond_1d

    .line 427
    .line 428
    iget-object v2, v1, Ldc4;->a:Loz1;

    .line 429
    .line 430
    iget-object v1, v1, Ldc4;->b:Lkh4;

    .line 431
    .line 432
    invoke-virtual {v0, v2, v1}, Ljb4;->o(Loz1;Lkh4;)Z

    .line 433
    .line 434
    .line 435
    move-result v1

    .line 436
    if-eqz v1, :cond_1d

    .line 437
    .line 438
    iget-object v1, v0, Ljb4;->K:Ldc4;

    .line 439
    .line 440
    iget-object v2, v1, Ldc4;->o:Lsr1;

    .line 441
    .line 442
    iget v2, v2, Lsr1;->a:F

    .line 443
    .line 444
    const/high16 v4, 0x3f800000    # 1.0f

    .line 445
    .line 446
    cmpl-float v2, v2, v4

    .line 447
    .line 448
    if-nez v2, :cond_1d

    .line 449
    .line 450
    iget-object v2, v0, Ljb4;->h0:Lm44;

    .line 451
    .line 452
    iget-object v5, v1, Ldc4;->a:Loz1;

    .line 453
    .line 454
    iget-object v6, v1, Ldc4;->b:Lkh4;

    .line 455
    .line 456
    iget-object v6, v6, Lkh4;->a:Ljava/lang/Object;

    .line 457
    .line 458
    iget-wide v7, v1, Ldc4;->r:J

    .line 459
    .line 460
    invoke-virtual {v0, v5, v6, v7, v8}, Ljb4;->n(Loz1;Ljava/lang/Object;J)J

    .line 461
    .line 462
    .line 463
    move-result-wide v5

    .line 464
    iget-object v1, v0, Ljb4;->K:Ldc4;

    .line 465
    .line 466
    iget-wide v7, v1, Ldc4;->q:J

    .line 467
    .line 468
    iget-wide v9, v2, Lm44;->c:J

    .line 469
    .line 470
    cmp-long v1, v9, v17

    .line 471
    .line 472
    if-eqz v1, :cond_1c

    .line 473
    .line 474
    sub-long v7, v5, v7

    .line 475
    .line 476
    iget-wide v9, v2, Lm44;->k:J

    .line 477
    .line 478
    cmp-long v1, v9, v17

    .line 479
    .line 480
    if-nez v1, :cond_14

    .line 481
    .line 482
    iput-wide v7, v2, Lm44;->k:J

    .line 483
    .line 484
    const-wide/16 v7, 0x0

    .line 485
    .line 486
    iput-wide v7, v2, Lm44;->l:J

    .line 487
    .line 488
    move v1, v13

    .line 489
    goto :goto_8

    .line 490
    :cond_14
    long-to-float v1, v9

    .line 491
    long-to-float v9, v7

    .line 492
    const v10, 0x3f7fbe77    # 0.999f

    .line 493
    .line 494
    .line 495
    mul-float/2addr v1, v10

    .line 496
    const v12, 0x3a831200    # 9.999871E-4f

    .line 497
    .line 498
    .line 499
    mul-float/2addr v9, v12

    .line 500
    add-float/2addr v9, v1

    .line 501
    move/from16 v16, v12

    .line 502
    .line 503
    move v1, v13

    .line 504
    float-to-long v12, v9

    .line 505
    invoke-static {v7, v8, v12, v13}, Ljava/lang/Math;->max(JJ)J

    .line 506
    .line 507
    .line 508
    move-result-wide v12

    .line 509
    iput-wide v12, v2, Lm44;->k:J

    .line 510
    .line 511
    sub-long/2addr v7, v12

    .line 512
    invoke-static {v7, v8}, Ljava/lang/Math;->abs(J)J

    .line 513
    .line 514
    .line 515
    move-result-wide v7

    .line 516
    iget-wide v12, v2, Lm44;->l:J

    .line 517
    .line 518
    long-to-float v9, v12

    .line 519
    long-to-float v7, v7

    .line 520
    mul-float/2addr v9, v10

    .line 521
    mul-float v7, v7, v16

    .line 522
    .line 523
    add-float/2addr v7, v9

    .line 524
    float-to-long v7, v7

    .line 525
    iput-wide v7, v2, Lm44;->l:J

    .line 526
    .line 527
    :goto_8
    iget-wide v7, v2, Lm44;->j:J

    .line 528
    .line 529
    cmp-long v7, v7, v17

    .line 530
    .line 531
    if-eqz v7, :cond_16

    .line 532
    .line 533
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 534
    .line 535
    .line 536
    move-result-wide v12

    .line 537
    const-wide/16 v19, 0x3e8

    .line 538
    .line 539
    iget-wide v8, v2, Lm44;->j:J

    .line 540
    .line 541
    sub-long/2addr v12, v8

    .line 542
    cmp-long v7, v12, v19

    .line 543
    .line 544
    if-ltz v7, :cond_15

    .line 545
    .line 546
    goto :goto_9

    .line 547
    :cond_15
    iget v4, v2, Lm44;->i:F

    .line 548
    .line 549
    goto/16 :goto_d

    .line 550
    .line 551
    :cond_16
    const-wide/16 v19, 0x3e8

    .line 552
    .line 553
    :goto_9
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 554
    .line 555
    .line 556
    move-result-wide v7

    .line 557
    iput-wide v7, v2, Lm44;->j:J

    .line 558
    .line 559
    iget-wide v7, v2, Lm44;->k:J

    .line 560
    .line 561
    iget-wide v9, v2, Lm44;->l:J

    .line 562
    .line 563
    const-wide/16 v12, 0x3

    .line 564
    .line 565
    mul-long/2addr v9, v12

    .line 566
    add-long/2addr v9, v7

    .line 567
    iget-wide v7, v2, Lm44;->h:J

    .line 568
    .line 569
    cmp-long v7, v7, v9

    .line 570
    .line 571
    const v8, 0x33d6bf95    # 1.0E-7f

    .line 572
    .line 573
    .line 574
    if-lez v7, :cond_19

    .line 575
    .line 576
    const/high16 v7, -0x40800000    # -1.0f

    .line 577
    .line 578
    invoke-static/range {v19 .. v20}, Lv23;->r(J)J

    .line 579
    .line 580
    .line 581
    move-result-wide v12

    .line 582
    move/from16 v16, v1

    .line 583
    .line 584
    iget v1, v2, Lm44;->i:F

    .line 585
    .line 586
    add-float/2addr v1, v7

    .line 587
    move/from16 v20, v15

    .line 588
    .line 589
    iget-wide v14, v2, Lm44;->e:J

    .line 590
    .line 591
    move-wide/from16 v21, v5

    .line 592
    .line 593
    iget-wide v4, v2, Lm44;->h:J

    .line 594
    .line 595
    long-to-float v6, v12

    .line 596
    const v7, 0x3cf5c280    # 0.029999971f

    .line 597
    .line 598
    .line 599
    mul-float/2addr v7, v6

    .line 600
    mul-float/2addr v1, v6

    .line 601
    float-to-long v12, v1

    .line 602
    float-to-long v6, v7

    .line 603
    add-long/2addr v12, v6

    .line 604
    sub-long/2addr v4, v12

    .line 605
    new-array v1, v3, [J

    .line 606
    .line 607
    aput-wide v9, v1, v11

    .line 608
    .line 609
    aput-wide v14, v1, v20

    .line 610
    .line 611
    aput-wide v4, v1, v16

    .line 612
    .line 613
    aget-wide v4, v1, v11

    .line 614
    .line 615
    move/from16 v15, v20

    .line 616
    .line 617
    :goto_a
    if-ge v15, v3, :cond_18

    .line 618
    .line 619
    aget-wide v6, v1, v15

    .line 620
    .line 621
    cmp-long v9, v6, v4

    .line 622
    .line 623
    if-gtz v9, :cond_17

    .line 624
    .line 625
    goto :goto_b

    .line 626
    :cond_17
    move-wide v4, v6

    .line 627
    :goto_b
    add-int/lit8 v15, v15, 0x1

    .line 628
    .line 629
    goto :goto_a

    .line 630
    :cond_18
    iput-wide v4, v2, Lm44;->h:J

    .line 631
    .line 632
    goto :goto_c

    .line 633
    :cond_19
    move-wide/from16 v21, v5

    .line 634
    .line 635
    const/high16 v7, -0x40800000    # -1.0f

    .line 636
    .line 637
    iget v1, v2, Lm44;->i:F

    .line 638
    .line 639
    add-float/2addr v1, v7

    .line 640
    const/4 v3, 0x0

    .line 641
    invoke-static {v3, v1}, Ljava/lang/Math;->max(FF)F

    .line 642
    .line 643
    .line 644
    move-result v1

    .line 645
    div-float/2addr v1, v8

    .line 646
    float-to-long v3, v1

    .line 647
    sub-long v5, v21, v3

    .line 648
    .line 649
    iget-wide v3, v2, Lm44;->h:J

    .line 650
    .line 651
    sget-object v1, Lv23;->a:Ljava/lang/String;

    .line 652
    .line 653
    invoke-static {v5, v6, v9, v10}, Ljava/lang/Math;->min(JJ)J

    .line 654
    .line 655
    .line 656
    move-result-wide v5

    .line 657
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 658
    .line 659
    .line 660
    move-result-wide v4

    .line 661
    iput-wide v4, v2, Lm44;->h:J

    .line 662
    .line 663
    iget-wide v6, v2, Lm44;->g:J

    .line 664
    .line 665
    cmp-long v1, v6, v17

    .line 666
    .line 667
    if-eqz v1, :cond_1a

    .line 668
    .line 669
    cmp-long v1, v4, v6

    .line 670
    .line 671
    if-lez v1, :cond_1a

    .line 672
    .line 673
    iput-wide v6, v2, Lm44;->h:J

    .line 674
    .line 675
    move-wide v4, v6

    .line 676
    :cond_1a
    :goto_c
    sub-long v5, v21, v4

    .line 677
    .line 678
    iget-wide v3, v2, Lm44;->a:J

    .line 679
    .line 680
    invoke-static {v5, v6}, Ljava/lang/Math;->abs(J)J

    .line 681
    .line 682
    .line 683
    move-result-wide v9

    .line 684
    cmp-long v1, v9, v3

    .line 685
    .line 686
    if-gez v1, :cond_1b

    .line 687
    .line 688
    const/high16 v1, 0x3f800000    # 1.0f

    .line 689
    .line 690
    iput v1, v2, Lm44;->i:F

    .line 691
    .line 692
    move v4, v1

    .line 693
    goto :goto_d

    .line 694
    :cond_1b
    const/high16 v1, 0x3f800000    # 1.0f

    .line 695
    .line 696
    long-to-float v3, v5

    .line 697
    mul-float/2addr v3, v8

    .line 698
    add-float/2addr v3, v1

    .line 699
    const v1, 0x3f83d70a    # 1.03f

    .line 700
    .line 701
    .line 702
    invoke-static {v3, v1}, Ljava/lang/Math;->min(FF)F

    .line 703
    .line 704
    .line 705
    move-result v1

    .line 706
    const v3, 0x3f7851ec    # 0.97f

    .line 707
    .line 708
    .line 709
    invoke-static {v3, v1}, Ljava/lang/Math;->max(FF)F

    .line 710
    .line 711
    .line 712
    move-result v4

    .line 713
    iput v4, v2, Lm44;->i:F

    .line 714
    .line 715
    goto :goto_d

    .line 716
    :cond_1c
    move v1, v4

    .line 717
    :goto_d
    iget-object v1, v0, Ljb4;->s:Lg53;

    .line 718
    .line 719
    invoke-virtual {v1}, Lg53;->g()Lsr1;

    .line 720
    .line 721
    .line 722
    move-result-object v2

    .line 723
    iget v2, v2, Lsr1;->a:F

    .line 724
    .line 725
    cmpl-float v2, v2, v4

    .line 726
    .line 727
    if-eqz v2, :cond_1d

    .line 728
    .line 729
    iget-object v2, v0, Ljb4;->K:Ldc4;

    .line 730
    .line 731
    iget-object v2, v2, Ldc4;->o:Lsr1;

    .line 732
    .line 733
    iget v2, v2, Lsr1;->b:F

    .line 734
    .line 735
    new-instance v3, Lsr1;

    .line 736
    .line 737
    invoke-direct {v3, v4, v2}, Lsr1;-><init>(FF)V

    .line 738
    .line 739
    .line 740
    iget-object v2, v0, Ljb4;->m:Ld13;

    .line 741
    .line 742
    const/16 v4, 0x10

    .line 743
    .line 744
    invoke-virtual {v2, v4}, Ld13;->c(I)V

    .line 745
    .line 746
    .line 747
    iget-object v2, v0, Ljb4;->s:Lg53;

    .line 748
    .line 749
    invoke-virtual {v2, v3}, Lg53;->b(Lsr1;)V

    .line 750
    .line 751
    .line 752
    iget-object v2, v0, Ljb4;->K:Ldc4;

    .line 753
    .line 754
    iget-object v2, v2, Ldc4;->o:Lsr1;

    .line 755
    .line 756
    invoke-virtual {v1}, Lg53;->g()Lsr1;

    .line 757
    .line 758
    .line 759
    move-result-object v1

    .line 760
    iget v1, v1, Lsr1;->a:F

    .line 761
    .line 762
    invoke-virtual {v0, v2, v1, v11, v11}, Ljb4;->K(Lsr1;FZZ)V

    .line 763
    .line 764
    .line 765
    :cond_1d
    :goto_e
    return-void
.end method

.method public final m(IZ)V
    .locals 2

    .line 1
    iget-object v0, p0, Ljb4;->h:[Z

    .line 2
    .line 3
    aget-boolean v1, v0, p1

    .line 4
    .line 5
    if-eq v1, p2, :cond_0

    .line 6
    .line 7
    aput-boolean p2, v0, p1

    .line 8
    .line 9
    new-instance v0, Lcd;

    .line 10
    .line 11
    invoke-direct {v0, p0, p1, p2}, Lcd;-><init>(Ljb4;IZ)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Ljb4;->B:Ld13;

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Ld13;->d(Ljava/lang/Runnable;)Z

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final n(Loz1;Ljava/lang/Object;J)J
    .locals 4

    .line 1
    iget-object v0, p0, Ljb4;->q:Lsw1;

    .line 2
    .line 3
    invoke-virtual {p1, p2, v0}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    iget p2, p2, Lsw1;->c:I

    .line 8
    .line 9
    const-wide/16 v0, 0x0

    .line 10
    .line 11
    iget-object v2, p0, Ljb4;->p:Lez1;

    .line 12
    .line 13
    invoke-virtual {p1, p2, v2, v0, v1}, Loz1;->b(ILez1;J)Lez1;

    .line 14
    .line 15
    .line 16
    iget-wide p1, v2, Lez1;->d:J

    .line 17
    .line 18
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    cmp-long p1, p1, v0

    .line 24
    .line 25
    if-eqz p1, :cond_2

    .line 26
    .line 27
    invoke-virtual {v2}, Lez1;->b()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    iget-boolean p1, v2, Lez1;->g:Z

    .line 34
    .line 35
    if-nez p1, :cond_0

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_0
    iget-wide p1, v2, Lez1;->e:J

    .line 39
    .line 40
    sget-object v3, Lv23;->a:Ljava/lang/String;

    .line 41
    .line 42
    cmp-long v0, p1, v0

    .line 43
    .line 44
    if-nez v0, :cond_1

    .line 45
    .line 46
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 47
    .line 48
    .line 49
    move-result-wide p1

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 52
    .line 53
    .line 54
    move-result-wide v0

    .line 55
    add-long/2addr p1, v0

    .line 56
    :goto_0
    iget-wide v0, v2, Lez1;->d:J

    .line 57
    .line 58
    sub-long/2addr p1, v0

    .line 59
    invoke-static {p1, p2}, Lv23;->r(J)J

    .line 60
    .line 61
    .line 62
    move-result-wide p1

    .line 63
    sub-long/2addr p1, p3

    .line 64
    return-wide p1

    .line 65
    :cond_2
    :goto_1
    return-wide v0
.end method

.method public final o(Loz1;Lkh4;)Z
    .locals 3

    .line 1
    invoke-virtual {p2}, Lkh4;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Loz1;->g()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object p2, p2, Lkh4;->a:Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v0, p0, Ljb4;->q:Lsw1;

    .line 17
    .line 18
    invoke-virtual {p1, p2, v0}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    iget p2, p2, Lsw1;->c:I

    .line 23
    .line 24
    const-wide/16 v0, 0x0

    .line 25
    .line 26
    iget-object v2, p0, Ljb4;->p:Lez1;

    .line 27
    .line 28
    invoke-virtual {p1, p2, v2, v0, v1}, Loz1;->b(ILez1;J)Lez1;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Lez1;->b()Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    iget-boolean p1, v2, Lez1;->g:Z

    .line 38
    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    iget-wide p1, v2, Lez1;->d:J

    .line 42
    .line 43
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    cmp-long p1, p1, v0

    .line 49
    .line 50
    if-eqz p1, :cond_1

    .line 51
    .line 52
    const/4 p1, 0x1

    .line 53
    return p1

    .line 54
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 55
    return p1
.end method

.method public final p(J)V
    .locals 14

    .line 1
    iget-boolean v0, p0, Ljb4;->G:Z

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const-wide/16 v2, 0x3e8

    .line 5
    .line 6
    const/4 v4, 0x3

    .line 7
    sget-wide v5, Ljb4;->i0:J

    .line 8
    .line 9
    if-eqz v0, :cond_5

    .line 10
    .line 11
    iget-object v0, p0, Ljb4;->F:Lkc4;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Ljb4;->K:Ldc4;

    .line 17
    .line 18
    iget v0, v0, Ldc4;->e:I

    .line 19
    .line 20
    if-ne v0, v4, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-wide v2, v5

    .line 24
    :goto_0
    const/4 v0, 0x0

    .line 25
    :goto_1
    if-ge v0, v1, :cond_3

    .line 26
    .line 27
    iget-object v4, p0, Ljb4;->f:[Lt71;

    .line 28
    .line 29
    aget-object v4, v4, v0

    .line 30
    .line 31
    iget-wide v7, p0, Ljb4;->X:J

    .line 32
    .line 33
    iget-wide v9, p0, Ljb4;->Y:J

    .line 34
    .line 35
    iget-object v11, v4, Lt71;->e:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v11, Lkg4;

    .line 38
    .line 39
    invoke-static {v11}, Lt71;->l(Lkg4;)Z

    .line 40
    .line 41
    .line 42
    move-result v12

    .line 43
    if-eqz v12, :cond_1

    .line 44
    .line 45
    invoke-virtual {v11, v7, v8, v9, v10}, Lkg4;->Q(JJ)J

    .line 46
    .line 47
    .line 48
    move-result-wide v11

    .line 49
    goto :goto_2

    .line 50
    :cond_1
    const-wide v11, 0x7fffffffffffffffL

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    :goto_2
    iget-object v4, v4, Lt71;->f:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v4, Lkg4;

    .line 58
    .line 59
    if-eqz v4, :cond_2

    .line 60
    .line 61
    iget v13, v4, Lkg4;->m:I

    .line 62
    .line 63
    if-eqz v13, :cond_2

    .line 64
    .line 65
    invoke-virtual {v4, v7, v8, v9, v10}, Lkg4;->Q(JJ)J

    .line 66
    .line 67
    .line 68
    move-result-wide v7

    .line 69
    invoke-static {v11, v12, v7, v8}, Ljava/lang/Math;->min(JJ)J

    .line 70
    .line 71
    .line 72
    move-result-wide v11

    .line 73
    :cond_2
    invoke-static {v11, v12}, Lv23;->q(J)J

    .line 74
    .line 75
    .line 76
    move-result-wide v7

    .line 77
    invoke-static {v2, v3, v7, v8}, Ljava/lang/Math;->min(JJ)J

    .line 78
    .line 79
    .line 80
    move-result-wide v2

    .line 81
    add-int/lit8 v0, v0, 0x1

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_3
    iget-object v0, p0, Ljb4;->K:Ldc4;

    .line 85
    .line 86
    invoke-virtual {v0}, Ldc4;->i()Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_7

    .line 91
    .line 92
    iget-object v0, p0, Ljb4;->w:Lrb4;

    .line 93
    .line 94
    iget-object v0, v0, Lrb4;->h:Lpb4;

    .line 95
    .line 96
    if-eqz v0, :cond_4

    .line 97
    .line 98
    iget-object v0, v0, Lpb4;->m:Lpb4;

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_4
    const/4 v0, 0x0

    .line 102
    :goto_3
    if-eqz v0, :cond_7

    .line 103
    .line 104
    iget-wide v7, p0, Ljb4;->X:J

    .line 105
    .line 106
    long-to-float v4, v7

    .line 107
    invoke-static {v2, v3}, Lv23;->r(J)J

    .line 108
    .line 109
    .line 110
    move-result-wide v7

    .line 111
    iget-object v9, p0, Ljb4;->K:Ldc4;

    .line 112
    .line 113
    iget-object v9, v9, Ldc4;->o:Lsr1;

    .line 114
    .line 115
    iget v9, v9, Lsr1;->a:F

    .line 116
    .line 117
    long-to-float v7, v7

    .line 118
    mul-float/2addr v7, v9

    .line 119
    invoke-virtual {v0}, Lpb4;->a()J

    .line 120
    .line 121
    .line 122
    move-result-wide v8

    .line 123
    long-to-float v0, v8

    .line 124
    add-float/2addr v4, v7

    .line 125
    cmpl-float v0, v4, v0

    .line 126
    .line 127
    if-ltz v0, :cond_7

    .line 128
    .line 129
    invoke-static {v2, v3, v5, v6}, Ljava/lang/Math;->min(JJ)J

    .line 130
    .line 131
    .line 132
    move-result-wide v2

    .line 133
    goto :goto_4

    .line 134
    :cond_5
    iget-object v0, p0, Ljb4;->K:Ldc4;

    .line 135
    .line 136
    iget v0, v0, Ldc4;->e:I

    .line 137
    .line 138
    if-ne v0, v4, :cond_6

    .line 139
    .line 140
    invoke-virtual {p0}, Ljb4;->T()Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-nez v0, :cond_6

    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_6
    move-wide v2, v5

    .line 148
    :cond_7
    :goto_4
    add-long/2addr v2, p1

    .line 149
    iget-object v0, p0, Ljb4;->m:Ld13;

    .line 150
    .line 151
    iget-object v0, v0, Ld13;->a:Landroid/os/Handler;

    .line 152
    .line 153
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageAtTime(IJ)Z

    .line 154
    .line 155
    .line 156
    return-void
.end method

.method public final q(Lib4;Z)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    iget-object v0, v1, Ljb4;->L:Lr60;

    .line 6
    .line 7
    move/from16 v2, p2

    .line 8
    .line 9
    invoke-virtual {v0, v2}, Lr60;->f(I)V

    .line 10
    .line 11
    .line 12
    iget-boolean v0, v1, Ljb4;->H:Z

    .line 13
    .line 14
    const/4 v8, 0x1

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v0, v1, Ljb4;->I:Lib4;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget v0, v1, Ljb4;->J:I

    .line 22
    .line 23
    add-int/2addr v0, v8

    .line 24
    iput v0, v1, Ljb4;->J:I

    .line 25
    .line 26
    :cond_0
    iput-object v3, v1, Ljb4;->I:Lib4;

    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    iget-object v0, v1, Ljb4;->K:Ldc4;

    .line 30
    .line 31
    iget-object v2, v0, Ldc4;->a:Loz1;

    .line 32
    .line 33
    iget v4, v1, Ljb4;->S:I

    .line 34
    .line 35
    iget-boolean v5, v1, Ljb4;->T:Z

    .line 36
    .line 37
    iget-object v6, v1, Ljb4;->p:Lez1;

    .line 38
    .line 39
    iget-object v7, v1, Ljb4;->q:Lsw1;

    .line 40
    .line 41
    invoke-static/range {v2 .. v7}, Ljb4;->z(Loz1;Lib4;IZLez1;Lsw1;)Landroid/util/Pair;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    const/4 v11, 0x0

    .line 51
    if-nez v0, :cond_2

    .line 52
    .line 53
    iget-object v2, v1, Ljb4;->K:Ldc4;

    .line 54
    .line 55
    iget-object v2, v2, Ldc4;->a:Loz1;

    .line 56
    .line 57
    invoke-virtual {v1, v2}, Ljb4;->w(Loz1;)Landroid/util/Pair;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    iget-object v7, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v7, Lkh4;

    .line 64
    .line 65
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v2, Ljava/lang/Long;

    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 70
    .line 71
    .line 72
    move-result-wide v12

    .line 73
    iget-object v2, v1, Ljb4;->K:Ldc4;

    .line 74
    .line 75
    iget-object v2, v2, Ldc4;->a:Loz1;

    .line 76
    .line 77
    invoke-virtual {v2}, Loz1;->g()Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    xor-int/2addr v2, v8

    .line 82
    move-object v15, v7

    .line 83
    move v7, v2

    .line 84
    move-object v2, v15

    .line 85
    move-wide v15, v9

    .line 86
    const-wide/16 v17, 0x0

    .line 87
    .line 88
    goto :goto_5

    .line 89
    :cond_2
    iget-object v2, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 90
    .line 91
    iget-object v12, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v12, Ljava/lang/Long;

    .line 94
    .line 95
    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    .line 96
    .line 97
    .line 98
    move-result-wide v12

    .line 99
    iget-wide v14, v3, Lib4;->c:J

    .line 100
    .line 101
    cmp-long v14, v14, v9

    .line 102
    .line 103
    if-nez v14, :cond_3

    .line 104
    .line 105
    move-wide v15, v9

    .line 106
    :goto_0
    const-wide/16 v17, 0x0

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_3
    move-wide v15, v12

    .line 110
    goto :goto_0

    .line 111
    :goto_1
    iget-object v4, v1, Ljb4;->w:Lrb4;

    .line 112
    .line 113
    iget-object v5, v1, Ljb4;->K:Ldc4;

    .line 114
    .line 115
    iget-object v5, v5, Ldc4;->a:Loz1;

    .line 116
    .line 117
    invoke-virtual {v4, v5, v2}, Lrb4;->E(Loz1;Ljava/lang/Object;)Lkh4;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-virtual {v2}, Lkh4;->b()Z

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    if-eqz v4, :cond_7

    .line 126
    .line 127
    iget-object v4, v1, Ljb4;->K:Ldc4;

    .line 128
    .line 129
    iget-object v4, v4, Ldc4;->a:Loz1;

    .line 130
    .line 131
    iget-object v5, v2, Lkh4;->a:Ljava/lang/Object;

    .line 132
    .line 133
    invoke-virtual {v4, v5, v7}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 134
    .line 135
    .line 136
    iget-object v4, v7, Lsw1;->f:Lzb2;

    .line 137
    .line 138
    const/4 v5, -0x1

    .line 139
    invoke-virtual {v4, v5}, Lzb2;->a(I)Lcd1;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    move v12, v11

    .line 144
    :goto_2
    iget-object v13, v4, Lcd1;->d:[I

    .line 145
    .line 146
    array-length v14, v13

    .line 147
    if-ge v12, v14, :cond_5

    .line 148
    .line 149
    aget v13, v13, v12

    .line 150
    .line 151
    if-eqz v13, :cond_5

    .line 152
    .line 153
    if-ne v13, v8, :cond_4

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_4
    add-int/lit8 v12, v12, 0x1

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_5
    :goto_3
    if-ne v12, v5, :cond_6

    .line 160
    .line 161
    iget-object v4, v7, Lsw1;->f:Lzb2;

    .line 162
    .line 163
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    :cond_6
    move v7, v8

    .line 167
    move-wide/from16 v12, v17

    .line 168
    .line 169
    goto :goto_5

    .line 170
    :cond_7
    if-nez v14, :cond_8

    .line 171
    .line 172
    move v4, v8

    .line 173
    goto :goto_4

    .line 174
    :cond_8
    move v4, v11

    .line 175
    :goto_4
    move v7, v4

    .line 176
    :goto_5
    :try_start_0
    iget-object v4, v1, Ljb4;->K:Ldc4;

    .line 177
    .line 178
    iget-object v4, v4, Ldc4;->a:Loz1;

    .line 179
    .line 180
    invoke-virtual {v4}, Loz1;->g()Z

    .line 181
    .line 182
    .line 183
    move-result v4

    .line 184
    if-eqz v4, :cond_9

    .line 185
    .line 186
    iput-object v3, v1, Ljb4;->W:Lib4;

    .line 187
    .line 188
    goto :goto_6

    .line 189
    :catchall_0
    move-exception v0

    .line 190
    move-wide v5, v15

    .line 191
    goto/16 :goto_e

    .line 192
    .line 193
    :cond_9
    const/4 v3, 0x4

    .line 194
    if-nez v0, :cond_b

    .line 195
    .line 196
    iget-object v0, v1, Ljb4;->K:Ldc4;

    .line 197
    .line 198
    iget v0, v0, Ldc4;->e:I

    .line 199
    .line 200
    if-eq v0, v8, :cond_a

    .line 201
    .line 202
    invoke-virtual {v1, v3}, Ljb4;->d(I)V

    .line 203
    .line 204
    .line 205
    :cond_a
    invoke-virtual {v1, v11, v8, v11, v8}, Ljb4;->v(ZZZZ)V

    .line 206
    .line 207
    .line 208
    :goto_6
    move v9, v7

    .line 209
    move-wide v3, v12

    .line 210
    move-wide v5, v15

    .line 211
    goto/16 :goto_b

    .line 212
    .line 213
    :cond_b
    iget-object v0, v1, Ljb4;->K:Ldc4;

    .line 214
    .line 215
    iget-object v0, v0, Ldc4;->b:Lkh4;

    .line 216
    .line 217
    invoke-virtual {v2, v0}, Lkh4;->equals(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    if-eqz v0, :cond_f

    .line 222
    .line 223
    iget-object v0, v1, Ljb4;->w:Lrb4;

    .line 224
    .line 225
    iget-object v0, v0, Lrb4;->h:Lpb4;

    .line 226
    .line 227
    if-eqz v0, :cond_d

    .line 228
    .line 229
    iget-boolean v4, v0, Lpb4;->e:Z

    .line 230
    .line 231
    if-eqz v4, :cond_d

    .line 232
    .line 233
    cmp-long v4, v12, v17

    .line 234
    .line 235
    if-eqz v4, :cond_d

    .line 236
    .line 237
    iget-object v0, v0, Lpb4;->a:Ljava/lang/Object;

    .line 238
    .line 239
    iget-wide v4, v6, Lez1;->j:J

    .line 240
    .line 241
    iget-boolean v6, v1, Ljb4;->G:Z

    .line 242
    .line 243
    if-eqz v6, :cond_c

    .line 244
    .line 245
    cmp-long v4, v4, v9

    .line 246
    .line 247
    if-eqz v4, :cond_c

    .line 248
    .line 249
    iget-object v4, v1, Ljb4;->F:Lkc4;

    .line 250
    .line 251
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    :cond_c
    iget-object v4, v1, Ljb4;->E:Llc4;

    .line 255
    .line 256
    invoke-interface {v0, v12, v13, v4}, Ljh4;->h(JLlc4;)J

    .line 257
    .line 258
    .line 259
    move-result-wide v4

    .line 260
    goto :goto_7

    .line 261
    :cond_d
    move-wide v4, v12

    .line 262
    :goto_7
    invoke-static {v4, v5}, Lv23;->q(J)J

    .line 263
    .line 264
    .line 265
    move-result-wide v9

    .line 266
    iget-object v0, v1, Ljb4;->K:Ldc4;

    .line 267
    .line 268
    move-wide/from16 v17, v9

    .line 269
    .line 270
    iget-wide v8, v0, Ldc4;->r:J

    .line 271
    .line 272
    invoke-static {v8, v9}, Lv23;->q(J)J

    .line 273
    .line 274
    .line 275
    move-result-wide v8

    .line 276
    cmp-long v0, v17, v8

    .line 277
    .line 278
    if-nez v0, :cond_10

    .line 279
    .line 280
    iget-object v0, v1, Ljb4;->K:Ldc4;

    .line 281
    .line 282
    iget v6, v0, Ldc4;->e:I

    .line 283
    .line 284
    const/4 v8, 0x2

    .line 285
    if-eq v6, v8, :cond_e

    .line 286
    .line 287
    const/4 v8, 0x3

    .line 288
    if-ne v6, v8, :cond_10

    .line 289
    .line 290
    :cond_e
    iget-wide v12, v0, Ldc4;->r:J

    .line 291
    .line 292
    goto :goto_6

    .line 293
    :cond_f
    move-wide v4, v12

    .line 294
    :cond_10
    iget-boolean v0, v1, Ljb4;->G:Z

    .line 295
    .line 296
    iput-boolean v0, v1, Ljb4;->H:Z

    .line 297
    .line 298
    iget-object v0, v1, Ljb4;->K:Ldc4;

    .line 299
    .line 300
    iget v0, v0, Ldc4;->e:I

    .line 301
    .line 302
    if-ne v0, v3, :cond_11

    .line 303
    .line 304
    const/4 v6, 0x1

    .line 305
    goto :goto_8

    .line 306
    :cond_11
    move v6, v11

    .line 307
    :goto_8
    iget-object v0, v1, Ljb4;->w:Lrb4;

    .line 308
    .line 309
    iget-object v3, v0, Lrb4;->h:Lpb4;

    .line 310
    .line 311
    iget-object v0, v0, Lrb4;->i:Lpb4;

    .line 312
    .line 313
    if-eq v3, v0, :cond_12

    .line 314
    .line 315
    move-wide v3, v4

    .line 316
    const/4 v5, 0x1

    .line 317
    goto :goto_9

    .line 318
    :cond_12
    move-wide v3, v4

    .line 319
    move v5, v11

    .line 320
    :goto_9
    invoke-virtual/range {v1 .. v6}, Ljb4;->r(Lkh4;JZZ)J

    .line 321
    .line 322
    .line 323
    move-result-wide v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 324
    cmp-long v0, v12, v9

    .line 325
    .line 326
    if-eqz v0, :cond_13

    .line 327
    .line 328
    const/4 v8, 0x1

    .line 329
    goto :goto_a

    .line 330
    :cond_13
    move v8, v11

    .line 331
    :goto_a
    or-int v11, v7, v8

    .line 332
    .line 333
    :try_start_1
    iget-object v0, v1, Ljb4;->K:Ldc4;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 334
    .line 335
    move-object v3, v2

    .line 336
    :try_start_2
    iget-object v2, v0, Ldc4;->a:Loz1;

    .line 337
    .line 338
    iget-object v5, v0, Ldc4;->b:Lkh4;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 339
    .line 340
    const/4 v8, 0x1

    .line 341
    move-object v4, v2

    .line 342
    move-wide v6, v15

    .line 343
    :try_start_3
    invoke-virtual/range {v1 .. v8}, Ljb4;->G(Loz1;Lkh4;Loz1;Lkh4;JZ)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 344
    .line 345
    .line 346
    move-object v2, v3

    .line 347
    move-wide v5, v6

    .line 348
    move-wide v3, v9

    .line 349
    move v9, v11

    .line 350
    :goto_b
    const/4 v10, 0x2

    .line 351
    move-wide v7, v3

    .line 352
    move-object/from16 v1, p0

    .line 353
    .line 354
    invoke-virtual/range {v1 .. v10}, Ljb4;->N(Lkh4;JJJZI)Ldc4;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    iput-object v0, v1, Ljb4;->K:Ldc4;

    .line 359
    .line 360
    return-void

    .line 361
    :catchall_1
    move-exception v0

    .line 362
    move-object v2, v3

    .line 363
    move-wide v5, v6

    .line 364
    goto :goto_d

    .line 365
    :catchall_2
    move-exception v0

    .line 366
    move-object v2, v3

    .line 367
    :goto_c
    move-wide v5, v15

    .line 368
    goto :goto_d

    .line 369
    :catchall_3
    move-exception v0

    .line 370
    goto :goto_c

    .line 371
    :goto_d
    move-wide v3, v9

    .line 372
    move v9, v11

    .line 373
    goto :goto_f

    .line 374
    :goto_e
    move v9, v7

    .line 375
    move-wide v3, v12

    .line 376
    :goto_f
    const/4 v10, 0x2

    .line 377
    move-wide v7, v3

    .line 378
    invoke-virtual/range {v1 .. v10}, Ljb4;->N(Lkh4;JJJZI)Ldc4;

    .line 379
    .line 380
    .line 381
    move-result-object v2

    .line 382
    iput-object v2, v1, Ljb4;->K:Ldc4;

    .line 383
    .line 384
    throw v0
.end method

.method public final r(Lkh4;JZZ)J
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljb4;->k()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {p0, v0, v1}, Ljb4;->y(ZZ)V

    .line 7
    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    if-nez p5, :cond_0

    .line 11
    .line 12
    iget-object p5, p0, Ljb4;->K:Ldc4;

    .line 13
    .line 14
    iget p5, p5, Ldc4;->e:I

    .line 15
    .line 16
    const/4 v3, 0x3

    .line 17
    if-ne p5, v3, :cond_1

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0, v2}, Ljb4;->d(I)V

    .line 20
    .line 21
    .line 22
    :cond_1
    iget-object p5, p0, Ljb4;->w:Lrb4;

    .line 23
    .line 24
    iget-object v3, p5, Lrb4;->h:Lpb4;

    .line 25
    .line 26
    move-object v4, v3

    .line 27
    :goto_0
    if-eqz v4, :cond_3

    .line 28
    .line 29
    iget-object v5, v4, Lpb4;->g:Lqb4;

    .line 30
    .line 31
    iget-object v5, v5, Lqb4;->a:Lkh4;

    .line 32
    .line 33
    invoke-virtual {p1, v5}, Lkh4;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v5, :cond_2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    iget-object v4, v4, Lpb4;->m:Lpb4;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_3
    :goto_1
    if-nez p4, :cond_4

    .line 44
    .line 45
    if-ne v3, v4, :cond_4

    .line 46
    .line 47
    if-eqz v4, :cond_6

    .line 48
    .line 49
    iget-wide v5, v4, Lpb4;->p:J

    .line 50
    .line 51
    add-long/2addr v5, p2

    .line 52
    const-wide/16 v7, 0x0

    .line 53
    .line 54
    cmp-long p1, v5, v7

    .line 55
    .line 56
    if-gez p1, :cond_6

    .line 57
    .line 58
    :cond_4
    invoke-virtual {p0}, Ljb4;->B()V

    .line 59
    .line 60
    .line 61
    if-eqz v4, :cond_6

    .line 62
    .line 63
    :goto_2
    iget-object p1, p5, Lrb4;->h:Lpb4;

    .line 64
    .line 65
    if-eq p1, v4, :cond_5

    .line 66
    .line 67
    invoke-virtual {p5}, Lrb4;->x()Lpb4;

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_5
    invoke-virtual {p5, v4}, Lrb4;->y(Lpb4;)I

    .line 72
    .line 73
    .line 74
    const-wide v5, 0xe8d4a51000L

    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    iput-wide v5, v4, Lpb4;->p:J

    .line 80
    .line 81
    iget-object p1, p0, Ljb4;->w:Lrb4;

    .line 82
    .line 83
    new-array p4, v2, [Z

    .line 84
    .line 85
    iget-object p1, p1, Lrb4;->i:Lpb4;

    .line 86
    .line 87
    invoke-virtual {p1}, Lpb4;->a()J

    .line 88
    .line 89
    .line 90
    move-result-wide v5

    .line 91
    invoke-virtual {p0, p4, v5, v6}, Ljb4;->O([ZJ)V

    .line 92
    .line 93
    .line 94
    iput-boolean v1, v4, Lpb4;->h:Z

    .line 95
    .line 96
    :cond_6
    invoke-virtual {p0}, Ljb4;->C()V

    .line 97
    .line 98
    .line 99
    if-eqz v4, :cond_e

    .line 100
    .line 101
    invoke-virtual {p5, v4}, Lrb4;->y(Lpb4;)I

    .line 102
    .line 103
    .line 104
    iget-boolean p1, v4, Lpb4;->e:Z

    .line 105
    .line 106
    if-nez p1, :cond_7

    .line 107
    .line 108
    iget-object p1, v4, Lpb4;->g:Lqb4;

    .line 109
    .line 110
    invoke-virtual {p1, p2, p3}, Lqb4;->a(J)Lqb4;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    iput-object p1, v4, Lpb4;->g:Lqb4;

    .line 115
    .line 116
    goto/16 :goto_6

    .line 117
    .line 118
    :cond_7
    iget-boolean p1, v4, Lpb4;->f:Z

    .line 119
    .line 120
    if-eqz p1, :cond_d

    .line 121
    .line 122
    iget-boolean p1, p0, Ljb4;->G:Z

    .line 123
    .line 124
    if-eqz p1, :cond_c

    .line 125
    .line 126
    iget-object p1, p0, Ljb4;->F:Lkc4;

    .line 127
    .line 128
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    iget-object p1, p0, Ljb4;->K:Ldc4;

    .line 132
    .line 133
    iget-object p1, p1, Ldc4;->a:Loz1;

    .line 134
    .line 135
    invoke-virtual {p1}, Loz1;->g()Z

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    if-nez p1, :cond_c

    .line 140
    .line 141
    iget-object p1, v4, Lpb4;->g:Lqb4;

    .line 142
    .line 143
    iget-object p1, p1, Lqb4;->a:Lkh4;

    .line 144
    .line 145
    iget-object p4, p0, Ljb4;->K:Ldc4;

    .line 146
    .line 147
    iget-object p4, p4, Ldc4;->b:Lkh4;

    .line 148
    .line 149
    invoke-virtual {p1, p4}, Lkh4;->equals(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    if-nez p1, :cond_8

    .line 154
    .line 155
    goto :goto_5

    .line 156
    :cond_8
    iget-object p1, p0, Ljb4;->f:[Lt71;

    .line 157
    .line 158
    move p4, v0

    .line 159
    move p5, v1

    .line 160
    :goto_3
    if-ge p4, v2, :cond_b

    .line 161
    .line 162
    aget-object v3, p1, p4

    .line 163
    .line 164
    invoke-virtual {v3}, Lt71;->g()Z

    .line 165
    .line 166
    .line 167
    move-result v5

    .line 168
    if-eqz v5, :cond_a

    .line 169
    .line 170
    invoke-virtual {v3, v4}, Lt71;->m(Lpb4;)Lkg4;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    if-eqz v3, :cond_9

    .line 175
    .line 176
    invoke-virtual {v3, p2, p3}, Lkg4;->p(J)Z

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    if-eqz v3, :cond_9

    .line 181
    .line 182
    move v3, v1

    .line 183
    goto :goto_4

    .line 184
    :cond_9
    move v3, v0

    .line 185
    :goto_4
    and-int/2addr p5, v3

    .line 186
    :cond_a
    add-int/lit8 p4, p4, 0x1

    .line 187
    .line 188
    goto :goto_3

    .line 189
    :cond_b
    if-eqz p5, :cond_c

    .line 190
    .line 191
    iget-object p1, v4, Lpb4;->a:Ljava/lang/Object;

    .line 192
    .line 193
    iget-object p4, p0, Ljb4;->K:Ldc4;

    .line 194
    .line 195
    iget-wide p4, p4, Ldc4;->r:J

    .line 196
    .line 197
    sget-object v3, Llc4;->c:Llc4;

    .line 198
    .line 199
    invoke-interface {p1, p4, p5, v3}, Ljh4;->h(JLlc4;)J

    .line 200
    .line 201
    .line 202
    move-result-wide p4

    .line 203
    invoke-interface {p1, p2, p3, v3}, Ljh4;->h(JLlc4;)J

    .line 204
    .line 205
    .line 206
    move-result-wide v5

    .line 207
    cmp-long p1, p4, v5

    .line 208
    .line 209
    if-nez p1, :cond_c

    .line 210
    .line 211
    move v1, v0

    .line 212
    goto :goto_6

    .line 213
    :cond_c
    :goto_5
    iget-object p1, v4, Lpb4;->a:Ljava/lang/Object;

    .line 214
    .line 215
    invoke-interface {p1, p2, p3}, Ljh4;->d(J)J

    .line 216
    .line 217
    .line 218
    move-result-wide p2

    .line 219
    iget-wide p4, p0, Ljb4;->r:J

    .line 220
    .line 221
    sub-long p4, p2, p4

    .line 222
    .line 223
    invoke-interface {p1, p4, p5}, Ljh4;->e(J)V

    .line 224
    .line 225
    .line 226
    :cond_d
    :goto_6
    invoke-virtual {p0, p2, p3, v1}, Ljb4;->s(JZ)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {p0}, Ljb4;->L()V

    .line 230
    .line 231
    .line 232
    goto :goto_7

    .line 233
    :cond_e
    invoke-virtual {p5}, Lrb4;->B()V

    .line 234
    .line 235
    .line 236
    invoke-virtual {p0, p2, p3, v1}, Ljb4;->s(JZ)V

    .line 237
    .line 238
    .line 239
    :goto_7
    invoke-virtual {p0, v0}, Ljb4;->Q(Z)V

    .line 240
    .line 241
    .line 242
    iget-object p1, p0, Ljb4;->m:Ld13;

    .line 243
    .line 244
    invoke-virtual {p1, v2}, Ld13;->b(I)Z

    .line 245
    .line 246
    .line 247
    return-wide p2
.end method

.method public final s(JZ)V
    .locals 5

    .line 1
    iget-object v0, p0, Ljb4;->w:Lrb4;

    .line 2
    .line 3
    iget-object v1, v0, Lrb4;->h:Lpb4;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    const-wide v2, 0xe8d4a51000L

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    :goto_0
    add-long/2addr p1, v2

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    iget-wide v2, v1, Lpb4;->p:J

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :goto_1
    iput-wide p1, p0, Ljb4;->X:J

    .line 18
    .line 19
    iget-object v2, p0, Ljb4;->s:Lg53;

    .line 20
    .line 21
    iget-object v2, v2, Lg53;->h:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, Lnc4;

    .line 24
    .line 25
    invoke-virtual {v2, p1, p2}, Lnc4;->a(J)V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    move p2, p1

    .line 30
    :goto_2
    const/4 v2, 0x2

    .line 31
    if-ge p2, v2, :cond_2

    .line 32
    .line 33
    iget-object v2, p0, Ljb4;->f:[Lt71;

    .line 34
    .line 35
    aget-object v2, v2, p2

    .line 36
    .line 37
    iget-wide v3, p0, Ljb4;->X:J

    .line 38
    .line 39
    invoke-virtual {v2, v1}, Lt71;->m(Lpb4;)Lkg4;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    if-eqz v2, :cond_1

    .line 44
    .line 45
    invoke-virtual {v2, v3, v4, p1, p3}, Lkg4;->L(JZZ)V

    .line 46
    .line 47
    .line 48
    :cond_1
    add-int/lit8 p2, p2, 0x1

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    iget-object p2, v0, Lrb4;->h:Lpb4;

    .line 52
    .line 53
    :goto_3
    if-eqz p2, :cond_4

    .line 54
    .line 55
    iget-object p3, p2, Lpb4;->o:Lpj4;

    .line 56
    .line 57
    iget-object p3, p3, Lpj4;->h:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p3, [Lnj4;

    .line 60
    .line 61
    array-length v0, p3

    .line 62
    move v1, p1

    .line 63
    :goto_4
    if-ge v1, v0, :cond_3

    .line 64
    .line 65
    aget-object v2, p3, v1

    .line 66
    .line 67
    add-int/lit8 v1, v1, 0x1

    .line 68
    .line 69
    goto :goto_4

    .line 70
    :cond_3
    iget-object p2, p2, Lpb4;->m:Lpb4;

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_4
    return-void
.end method

.method public final t()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    const/4 v1, 0x2

    .line 3
    if-ge v0, v1, :cond_2

    .line 4
    .line 5
    iget-object v1, p0, Ljb4;->f:[Lt71;

    .line 6
    .line 7
    aget-object v1, v1, v0

    .line 8
    .line 9
    iget-boolean v2, p0, Ljb4;->G:Z

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    iget-object v2, p0, Ljb4;->F:Lkc4;

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    const/4 v2, 0x0

    .line 17
    :goto_1
    iget-object v3, v1, Lt71;->e:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v3, Lkg4;

    .line 20
    .line 21
    const/16 v4, 0x12

    .line 22
    .line 23
    invoke-interface {v3, v4, v2}, Lfc4;->a(ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object v1, v1, Lt71;->f:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Lkg4;

    .line 29
    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    invoke-interface {v1, v4, v2}, Lfc4;->a(ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    return-void
.end method

.method public final u(ZZ)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    iget-boolean p1, p0, Ljb4;->U:Z

    .line 6
    .line 7
    if-nez p1, :cond_1

    .line 8
    .line 9
    :cond_0
    move p1, v1

    .line 10
    goto :goto_0

    .line 11
    :cond_1
    move p1, v0

    .line 12
    :goto_0
    invoke-virtual {p0, p1, v0, v1, v0}, Ljb4;->v(ZZZZ)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Ljb4;->L:Lr60;

    .line 16
    .line 17
    invoke-virtual {p1, p2}, Lr60;->f(I)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Ljb4;->k:Llb4;

    .line 21
    .line 22
    iget-object p2, p0, Ljb4;->z:Lxd4;

    .line 23
    .line 24
    invoke-interface {p1, p2}, Llb4;->e(Lxd4;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Ljb4;->K:Ldc4;

    .line 28
    .line 29
    iget-boolean p1, p1, Ldc4;->l:Z

    .line 30
    .line 31
    iget-object p2, p0, Ljb4;->D:Lr24;

    .line 32
    .line 33
    invoke-virtual {p2, v1, p1}, Lr24;->b(IZ)I

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v1}, Ljb4;->d(I)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final v(ZZZZ)V
    .locals 33

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v2, "ExoPlayerImplInternal"

    .line 4
    .line 5
    iget-object v0, v1, Ljb4;->m:Ld13;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    invoke-virtual {v0, v3}, Ld13;->c(I)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    iput-boolean v4, v1, Ljb4;->H:Z

    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    iput-object v5, v1, Ljb4;->I:Lib4;

    .line 16
    .line 17
    iput-object v5, v1, Ljb4;->b0:Lb84;

    .line 18
    .line 19
    const/4 v6, 0x1

    .line 20
    invoke-virtual {v1, v4, v6}, Ljb4;->y(ZZ)V

    .line 21
    .line 22
    .line 23
    iget-object v0, v1, Ljb4;->s:Lg53;

    .line 24
    .line 25
    iput-boolean v4, v0, Lg53;->g:Z

    .line 26
    .line 27
    iget-object v0, v0, Lg53;->h:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Lnc4;

    .line 30
    .line 31
    iget-boolean v7, v0, Lnc4;->f:Z

    .line 32
    .line 33
    if-eqz v7, :cond_0

    .line 34
    .line 35
    invoke-virtual {v0}, Lnc4;->e()J

    .line 36
    .line 37
    .line 38
    move-result-wide v7

    .line 39
    invoke-virtual {v0, v7, v8}, Lnc4;->a(J)V

    .line 40
    .line 41
    .line 42
    iput-boolean v4, v0, Lnc4;->f:Z

    .line 43
    .line 44
    :cond_0
    const-wide v7, 0xe8d4a51000L

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    iput-wide v7, v1, Ljb4;->X:J

    .line 50
    .line 51
    :try_start_0
    invoke-virtual {v1}, Ljb4;->B()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lb84; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :catch_0
    move-exception v0

    .line 56
    goto :goto_0

    .line 57
    :catch_1
    move-exception v0

    .line 58
    :goto_0
    const-string v7, "Disable failed."

    .line 59
    .line 60
    invoke-static {v2, v7, v0}, La30;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    :goto_1
    if-eqz p1, :cond_1

    .line 64
    .line 65
    iget-object v7, v1, Ljb4;->f:[Lt71;

    .line 66
    .line 67
    move v8, v4

    .line 68
    :goto_2
    if-ge v8, v3, :cond_1

    .line 69
    .line 70
    aget-object v0, v7, v8

    .line 71
    .line 72
    :try_start_1
    invoke-virtual {v0}, Lt71;->b()V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2

    .line 73
    .line 74
    .line 75
    goto :goto_3

    .line 76
    :catch_2
    move-exception v0

    .line 77
    const-string v9, "Reset failed."

    .line 78
    .line 79
    invoke-static {v2, v9, v0}, La30;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    :goto_3
    add-int/lit8 v8, v8, 0x1

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_1
    iput v4, v1, Ljb4;->V:I

    .line 86
    .line 87
    iget-object v0, v1, Ljb4;->K:Ldc4;

    .line 88
    .line 89
    iget-object v2, v0, Ldc4;->b:Lkh4;

    .line 90
    .line 91
    iget-wide v7, v0, Ldc4;->r:J

    .line 92
    .line 93
    iget-object v0, v1, Ljb4;->K:Ldc4;

    .line 94
    .line 95
    iget-object v0, v0, Ldc4;->b:Lkh4;

    .line 96
    .line 97
    invoke-virtual {v0}, Lkh4;->b()Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-nez v0, :cond_3

    .line 102
    .line 103
    iget-object v0, v1, Ljb4;->K:Ldc4;

    .line 104
    .line 105
    iget-object v3, v1, Ljb4;->q:Lsw1;

    .line 106
    .line 107
    iget-object v9, v0, Ldc4;->b:Lkh4;

    .line 108
    .line 109
    iget-object v0, v0, Ldc4;->a:Loz1;

    .line 110
    .line 111
    invoke-virtual {v0}, Loz1;->g()Z

    .line 112
    .line 113
    .line 114
    move-result v10

    .line 115
    if-nez v10, :cond_3

    .line 116
    .line 117
    iget-object v9, v9, Lkh4;->a:Ljava/lang/Object;

    .line 118
    .line 119
    invoke-virtual {v0, v9, v3}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    iget-boolean v0, v0, Lsw1;->e:Z

    .line 124
    .line 125
    if-eqz v0, :cond_2

    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_2
    iget-object v0, v1, Ljb4;->K:Ldc4;

    .line 129
    .line 130
    iget-wide v9, v0, Ldc4;->r:J

    .line 131
    .line 132
    goto :goto_5

    .line 133
    :cond_3
    :goto_4
    iget-object v0, v1, Ljb4;->K:Ldc4;

    .line 134
    .line 135
    iget-wide v9, v0, Ldc4;->c:J

    .line 136
    .line 137
    :goto_5
    if-eqz p2, :cond_4

    .line 138
    .line 139
    iput-object v5, v1, Ljb4;->W:Lib4;

    .line 140
    .line 141
    iget-object v0, v1, Ljb4;->K:Ldc4;

    .line 142
    .line 143
    iget-object v0, v0, Ldc4;->a:Loz1;

    .line 144
    .line 145
    invoke-virtual {v1, v0}, Ljb4;->w(Loz1;)Landroid/util/Pair;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    iget-object v2, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v2, Lkh4;

    .line 152
    .line 153
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v0, Ljava/lang/Long;

    .line 156
    .line 157
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 158
    .line 159
    .line 160
    move-result-wide v7

    .line 161
    iget-object v0, v1, Ljb4;->K:Ldc4;

    .line 162
    .line 163
    iget-object v0, v0, Ldc4;->b:Lkh4;

    .line 164
    .line 165
    invoke-virtual {v2, v0}, Lkh4;->equals(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    if-nez v0, :cond_4

    .line 175
    .line 176
    :goto_6
    move-wide v12, v7

    .line 177
    move-wide v10, v9

    .line 178
    goto :goto_7

    .line 179
    :cond_4
    move v6, v4

    .line 180
    goto :goto_6

    .line 181
    :goto_7
    iget-object v0, v1, Ljb4;->w:Lrb4;

    .line 182
    .line 183
    invoke-virtual {v0}, Lrb4;->B()V

    .line 184
    .line 185
    .line 186
    iput-boolean v4, v1, Ljb4;->R:Z

    .line 187
    .line 188
    iget-object v3, v1, Ljb4;->K:Ldc4;

    .line 189
    .line 190
    iget-object v3, v3, Ldc4;->a:Loz1;

    .line 191
    .line 192
    if-eqz p3, :cond_7

    .line 193
    .line 194
    instance-of v7, v3, Lic4;

    .line 195
    .line 196
    if-eqz v7, :cond_7

    .line 197
    .line 198
    check-cast v3, Lic4;

    .line 199
    .line 200
    iget-object v7, v1, Ljb4;->x:Luu0;

    .line 201
    .line 202
    iget-object v7, v7, Luu0;->q:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v7, Lni4;

    .line 205
    .line 206
    iget-object v8, v3, Lic4;->h:[Loz1;

    .line 207
    .line 208
    array-length v9, v8

    .line 209
    new-array v9, v9, [Loz1;

    .line 210
    .line 211
    move v14, v4

    .line 212
    :goto_8
    array-length v15, v8

    .line 213
    if-ge v14, v15, :cond_5

    .line 214
    .line 215
    new-instance v15, Lhc4;

    .line 216
    .line 217
    aget-object v5, v8, v14

    .line 218
    .line 219
    invoke-direct {v15, v3, v5}, Lhc4;-><init>(Lic4;Loz1;)V

    .line 220
    .line 221
    .line 222
    aput-object v15, v9, v14

    .line 223
    .line 224
    add-int/lit8 v14, v14, 0x1

    .line 225
    .line 226
    const/4 v5, 0x0

    .line 227
    goto :goto_8

    .line 228
    :cond_5
    iget-object v3, v3, Lic4;->i:[Ljava/lang/Object;

    .line 229
    .line 230
    new-instance v5, Lic4;

    .line 231
    .line 232
    invoke-direct {v5, v9, v3, v7}, Lic4;-><init>([Loz1;[Ljava/lang/Object;Lni4;)V

    .line 233
    .line 234
    .line 235
    iget v3, v2, Lkh4;->b:I

    .line 236
    .line 237
    const/4 v7, -0x1

    .line 238
    if-eq v3, v7, :cond_6

    .line 239
    .line 240
    iget-object v3, v2, Lkh4;->a:Ljava/lang/Object;

    .line 241
    .line 242
    iget-object v7, v1, Ljb4;->q:Lsw1;

    .line 243
    .line 244
    invoke-virtual {v5, v3, v7}, Lic4;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 245
    .line 246
    .line 247
    iget-object v8, v1, Ljb4;->p:Lez1;

    .line 248
    .line 249
    iget v7, v7, Lsw1;->c:I

    .line 250
    .line 251
    const-wide/16 v14, 0x0

    .line 252
    .line 253
    invoke-virtual {v5, v7, v8, v14, v15}, Lic4;->b(ILez1;J)Lez1;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v8}, Lez1;->b()Z

    .line 257
    .line 258
    .line 259
    move-result v7

    .line 260
    if-eqz v7, :cond_6

    .line 261
    .line 262
    new-instance v7, Lkh4;

    .line 263
    .line 264
    iget-wide v8, v2, Lkh4;->d:J

    .line 265
    .line 266
    invoke-direct {v7, v8, v9, v3}, Lkh4;-><init>(JLjava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    move-object v8, v5

    .line 270
    move-object v9, v7

    .line 271
    goto :goto_9

    .line 272
    :cond_6
    move-object v9, v2

    .line 273
    move-object v8, v5

    .line 274
    goto :goto_9

    .line 275
    :cond_7
    move-object v9, v2

    .line 276
    move-object v8, v3

    .line 277
    :goto_9
    new-instance v7, Ldc4;

    .line 278
    .line 279
    iget-object v2, v1, Ljb4;->K:Ldc4;

    .line 280
    .line 281
    iget v14, v2, Ldc4;->e:I

    .line 282
    .line 283
    if-eqz p4, :cond_8

    .line 284
    .line 285
    const/4 v15, 0x0

    .line 286
    goto :goto_a

    .line 287
    :cond_8
    iget-object v5, v2, Ldc4;->f:Lb84;

    .line 288
    .line 289
    move-object v15, v5

    .line 290
    :goto_a
    if-eqz v6, :cond_9

    .line 291
    .line 292
    sget-object v3, Lri4;->d:Lri4;

    .line 293
    .line 294
    :goto_b
    move-object/from16 v17, v3

    .line 295
    .line 296
    goto :goto_c

    .line 297
    :cond_9
    iget-object v3, v2, Ldc4;->h:Lri4;

    .line 298
    .line 299
    goto :goto_b

    .line 300
    :goto_c
    if-eqz v6, :cond_a

    .line 301
    .line 302
    iget-object v3, v1, Ljb4;->j:Lpj4;

    .line 303
    .line 304
    :goto_d
    move-object/from16 v18, v3

    .line 305
    .line 306
    goto :goto_e

    .line 307
    :cond_a
    iget-object v3, v2, Ldc4;->i:Lpj4;

    .line 308
    .line 309
    goto :goto_d

    .line 310
    :goto_e
    if-eqz v6, :cond_b

    .line 311
    .line 312
    sget-object v3, Lxm3;->g:Lvm3;

    .line 313
    .line 314
    sget-object v3, Lsn3;->j:Lsn3;

    .line 315
    .line 316
    :goto_f
    move-object/from16 v19, v3

    .line 317
    .line 318
    goto :goto_10

    .line 319
    :cond_b
    iget-object v3, v2, Ldc4;->j:Ljava/util/List;

    .line 320
    .line 321
    goto :goto_f

    .line 322
    :goto_10
    iget-boolean v3, v2, Ldc4;->l:Z

    .line 323
    .line 324
    iget v5, v2, Ldc4;->m:I

    .line 325
    .line 326
    iget v6, v2, Ldc4;->n:I

    .line 327
    .line 328
    iget-object v2, v2, Ldc4;->o:Lsr1;

    .line 329
    .line 330
    const-wide/16 v27, 0x0

    .line 331
    .line 332
    const-wide/16 v31, 0x0

    .line 333
    .line 334
    const/16 v16, 0x0

    .line 335
    .line 336
    move-object/from16 v20, v9

    .line 337
    .line 338
    move-wide/from16 v25, v12

    .line 339
    .line 340
    move-wide/from16 v29, v12

    .line 341
    .line 342
    move-object/from16 v24, v2

    .line 343
    .line 344
    move/from16 v21, v3

    .line 345
    .line 346
    move/from16 v22, v5

    .line 347
    .line 348
    move/from16 v23, v6

    .line 349
    .line 350
    invoke-direct/range {v7 .. v32}, Ldc4;-><init>(Loz1;Lkh4;JJILb84;ZLri4;Lpj4;Ljava/util/List;Lkh4;ZIILsr1;JJJJ)V

    .line 351
    .line 352
    .line 353
    iput-object v7, v1, Ljb4;->K:Ldc4;

    .line 354
    .line 355
    if-eqz p3, :cond_d

    .line 356
    .line 357
    invoke-virtual {v0}, Lrb4;->r()V

    .line 358
    .line 359
    .line 360
    iget-object v2, v1, Ljb4;->x:Luu0;

    .line 361
    .line 362
    iget-object v0, v2, Luu0;->l:Ljava/lang/Object;

    .line 363
    .line 364
    move-object v3, v0

    .line 365
    check-cast v3, Ljava/util/HashMap;

    .line 366
    .line 367
    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 372
    .line 373
    .line 374
    move-result-object v5

    .line 375
    :goto_11
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 376
    .line 377
    .line 378
    move-result v0

    .line 379
    if-eqz v0, :cond_c

    .line 380
    .line 381
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    move-object v6, v0

    .line 386
    check-cast v6, Lac4;

    .line 387
    .line 388
    :try_start_2
    iget-object v0, v6, Lac4;->a:Lpg4;

    .line 389
    .line 390
    iget-object v7, v6, Lac4;->b:Lcc4;

    .line 391
    .line 392
    invoke-virtual {v0, v7}, Lpg4;->q(Llh4;)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_3

    .line 393
    .line 394
    .line 395
    goto :goto_12

    .line 396
    :catch_3
    move-exception v0

    .line 397
    const-string v7, "MediaSourceList"

    .line 398
    .line 399
    const-string v8, "Failed to release child source."

    .line 400
    .line 401
    invoke-static {v7, v8, v0}, La30;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 402
    .line 403
    .line 404
    :goto_12
    iget-object v0, v6, Lac4;->a:Lpg4;

    .line 405
    .line 406
    iget-object v6, v6, Lac4;->c:Lvb4;

    .line 407
    .line 408
    invoke-virtual {v0, v6}, Lpg4;->l(Lrh4;)V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v0, v6}, Lpg4;->m(Lkf4;)V

    .line 412
    .line 413
    .line 414
    goto :goto_11

    .line 415
    :cond_c
    invoke-virtual {v3}, Ljava/util/HashMap;->clear()V

    .line 416
    .line 417
    .line 418
    iget-object v0, v2, Luu0;->m:Ljava/lang/Object;

    .line 419
    .line 420
    check-cast v0, Ljava/util/HashSet;

    .line 421
    .line 422
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 423
    .line 424
    .line 425
    iput-boolean v4, v2, Luu0;->f:Z

    .line 426
    .line 427
    :cond_d
    return-void
.end method

.method public final w(Loz1;)Landroid/util/Pair;
    .locals 9

    .line 1
    invoke-virtual {p1}, Loz1;->g()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object p1, Ldc4;->t:Lkh4;

    .line 10
    .line 11
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {p1, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :cond_0
    iget-boolean v0, p0, Ljb4;->T:Z

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Loz1;->k(Z)I

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    iget-object v4, p0, Ljb4;->p:Lez1;

    .line 32
    .line 33
    iget-object v5, p0, Ljb4;->q:Lsw1;

    .line 34
    .line 35
    move-object v3, p1

    .line 36
    invoke-virtual/range {v3 .. v8}, Loz1;->m(Lez1;Lsw1;IJ)Landroid/util/Pair;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iget-object v0, p0, Ljb4;->w:Lrb4;

    .line 41
    .line 42
    iget-object v4, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 43
    .line 44
    invoke-virtual {v0, v3, v4}, Lrb4;->E(Loz1;Ljava/lang/Object;)Lkh4;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p1, Ljava/lang/Long;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 53
    .line 54
    .line 55
    move-result-wide v6

    .line 56
    invoke-virtual {v0}, Lkh4;->b()Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_3

    .line 61
    .line 62
    iget-object p1, v0, Lkh4;->a:Ljava/lang/Object;

    .line 63
    .line 64
    invoke-virtual {v3, p1, v5}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 65
    .line 66
    .line 67
    iget-object p1, v5, Lsw1;->f:Lzb2;

    .line 68
    .line 69
    const/4 v3, -0x1

    .line 70
    invoke-virtual {p1, v3}, Lzb2;->a(I)Lcd1;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    const/4 v4, 0x0

    .line 75
    :goto_0
    iget-object v6, p1, Lcd1;->d:[I

    .line 76
    .line 77
    array-length v7, v6

    .line 78
    if-ge v4, v7, :cond_2

    .line 79
    .line 80
    aget v6, v6, v4

    .line 81
    .line 82
    if-eqz v6, :cond_2

    .line 83
    .line 84
    const/4 v7, 0x1

    .line 85
    if-ne v6, v7, :cond_1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_2
    :goto_1
    if-ne v3, v4, :cond_4

    .line 92
    .line 93
    iget-object p1, v5, Lsw1;->f:Lzb2;

    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_3
    move-wide v1, v6

    .line 100
    :cond_4
    :goto_2
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-static {v0, p1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    return-object p1
.end method

.method public final x(Loz1;Loz1;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Loz1;->g()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p2}, Loz1;->g()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    return-void

    .line 15
    :cond_1
    :goto_0
    iget-object p1, p0, Ljb4;->t:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    add-int/lit8 p2, p2, -0x1

    .line 22
    .line 23
    if-gez p2, :cond_2

    .line 24
    .line 25
    invoke-static {p1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_2
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    new-instance p1, Ljava/lang/ClassCastException;

    .line 37
    .line 38
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 39
    .line 40
    .line 41
    throw p1
.end method

.method public final y(ZZ)V
    .locals 2

    .line 1
    iput-boolean p1, p0, Ljb4;->P:Z

    .line 2
    .line 3
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    if-nez p2, :cond_0

    .line 11
    .line 12
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    :cond_0
    iput-wide v0, p0, Ljb4;->Q:J

    .line 17
    .line 18
    return-void
.end method
