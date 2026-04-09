.class public final Ltc;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final b:Li80;


# instance fields
.field public final a:Lpc;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Ltc;

    .line 2
    .line 3
    invoke-static {v0}, Lk80;->d(Ljava/lang/Class;)Li80;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Ltc;->b:Li80;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(I)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lpc;

    .line 5
    .line 6
    const/high16 v0, 0x3f400000    # 0.75f

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    const/16 v2, 0x10

    .line 10
    .line 11
    invoke-direct {p1, v2, v0, v1}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    .line 12
    .line 13
    .line 14
    const v0, 0xc350

    .line 15
    .line 16
    .line 17
    iput v0, p1, Lpc;->f:I

    .line 18
    .line 19
    iput-object p1, p0, Ltc;->a:Lpc;

    .line 20
    .line 21
    return-void
.end method

.method public static a(JJ)I
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p2, v0

    .line 4
    .line 5
    if-ltz v2, :cond_0

    .line 6
    .line 7
    cmp-long v2, p2, p0

    .line 8
    .line 9
    if-gez v2, :cond_0

    .line 10
    .line 11
    move-wide p0, p2

    .line 12
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 13
    .line 14
    .line 15
    move-result-wide p2

    .line 16
    const-wide/16 v2, 0x3e8

    .line 17
    .line 18
    div-long/2addr p2, v2

    .line 19
    add-long/2addr p2, p0

    .line 20
    cmp-long p0, p2, v0

    .line 21
    .line 22
    if-ltz p0, :cond_2

    .line 23
    .line 24
    const-wide/32 p0, 0x7fffffff

    .line 25
    .line 26
    .line 27
    cmp-long p0, p2, p0

    .line 28
    .line 29
    if-lez p0, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    long-to-int p0, p2

    .line 33
    return p0

    .line 34
    :cond_2
    :goto_0
    const p0, 0x7fffffff

    .line 35
    .line 36
    .line 37
    return p0
.end method

.method public static f(IZ)I
    .locals 3

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x1

    .line 3
    if-ne p0, v1, :cond_0

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v2, 0x2

    .line 9
    if-ne p0, v2, :cond_2

    .line 10
    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    :goto_0
    const/4 p0, 0x4

    .line 14
    return p0

    .line 15
    :cond_1
    return v0

    .line 16
    :cond_2
    if-ne p0, v0, :cond_3

    .line 17
    .line 18
    return v1

    .line 19
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 20
    .line 21
    const-string p1, "getCred: invalid section"

    .line 22
    .line 23
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p0
.end method

.method public static h(Lkn0;Ljava/util/HashSet;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkn0;->e()Ltn0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ltn0;->f()Lgg0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    const/4 v0, 0x1

    .line 13
    invoke-virtual {p0, v0}, Lkn0;->f(Z)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Ltn0;

    .line 32
    .line 33
    invoke-virtual {v0}, Ltn0;->f()Lgg0;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    invoke-virtual {p1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    :goto_1
    return-void
.end method


# virtual methods
.method public final declared-synchronized b(Lgg0;Lrc;)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Ltc;->a:Lpc;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Ltc;->a:Lpc;

    .line 11
    .line 12
    invoke-virtual {v0, p1, p2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    monitor-exit p0

    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    goto :goto_2

    .line 19
    :cond_0
    :try_start_1
    invoke-interface {p2}, Lrc;->getType()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    instance-of v2, v0, Ljava/util/List;

    .line 24
    .line 25
    if-eqz v2, :cond_3

    .line 26
    .line 27
    check-cast v0, Ljava/util/List;

    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-ge p1, v2, :cond_2

    .line 35
    .line 36
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Lrc;

    .line 41
    .line 42
    invoke-interface {v2}, Lrc;->getType()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-ne v2, v1, :cond_1

    .line 47
    .line 48
    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    .line 50
    .line 51
    monitor-exit p0

    .line 52
    return-void

    .line 53
    :cond_1
    add-int/lit8 p1, p1, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    :try_start_2
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    check-cast v0, Lrc;

    .line 61
    .line 62
    invoke-interface {v0}, Lrc;->getType()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-ne v2, v1, :cond_4

    .line 67
    .line 68
    iget-object v0, p0, Ltc;->a:Lpc;

    .line 69
    .line 70
    invoke-virtual {v0, p1, p2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_4
    new-instance v1, Ljava/util/LinkedList;

    .line 75
    .line 76
    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, v0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, p2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    iget-object p2, p0, Ltc;->a:Lpc;

    .line 86
    .line 87
    invoke-virtual {p2, p1, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 88
    .line 89
    .line 90
    :goto_1
    monitor-exit p0

    .line 91
    return-void

    .line 92
    :goto_2
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 93
    throw p1
.end method

.method public final declared-synchronized c(ILkn0;Z)V
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p2}, Lkn0;->e()Ltn0;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    iget-wide v0, v0, Ltn0;->i:J

    .line 7
    .line 8
    invoke-virtual {p2}, Lkn0;->e()Ltn0;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    iget-object v2, v2, Ltn0;->f:Lgg0;

    .line 13
    .line 14
    invoke-virtual {p2}, Lkn0;->getType()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    invoke-virtual {p0, v2, v3}, Ltc;->e(Lgg0;I)Lrc;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    const-wide/16 v5, 0x0

    .line 23
    .line 24
    cmp-long v0, v0, v5

    .line 25
    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    if-eqz v4, :cond_3

    .line 29
    .line 30
    invoke-interface {v4, p1}, Lrc;->a(I)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-gtz p1, :cond_3

    .line 35
    .line 36
    invoke-virtual {p0, v2, v3}, Ltc;->j(Lgg0;I)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    goto :goto_2

    .line 42
    :cond_0
    if-eqz v4, :cond_1

    .line 43
    .line 44
    invoke-interface {v4, p1}, Lrc;->a(I)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-gtz v0, :cond_1

    .line 49
    .line 50
    const/4 v4, 0x0

    .line 51
    :cond_1
    if-nez v4, :cond_3

    .line 52
    .line 53
    instance-of v0, p2, Lqc;

    .line 54
    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    check-cast p2, Lqc;

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    new-instance v0, Lqc;

    .line 61
    .line 62
    const/4 v1, -0x1

    .line 63
    int-to-long v3, v1

    .line 64
    invoke-direct {v0, p2}, Lkn0;-><init>(Lkn0;)V

    .line 65
    .line 66
    .line 67
    iput p1, v0, Lqc;->j:I

    .line 68
    .line 69
    invoke-virtual {p2}, Lkn0;->e()Ltn0;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iget-wide p1, p1, Ltn0;->i:J

    .line 74
    .line 75
    invoke-static {p1, p2, v3, v4}, Ltc;->a(JJ)I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    iput p1, v0, Lqc;->k:I

    .line 80
    .line 81
    iput-boolean p3, v0, Lqc;->l:Z

    .line 82
    .line 83
    move-object p2, v0

    .line 84
    :goto_0
    invoke-virtual {p0, v2, p2}, Ltc;->b(Lgg0;Lrc;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    .line 86
    .line 87
    :cond_3
    :goto_1
    monitor-exit p0

    .line 88
    return-void

    .line 89
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 90
    throw p1
.end method

.method public final declared-synchronized d(Ljava/lang/Object;)[Lrc;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    instance-of v0, p1, Ljava/util/List;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    new-array v0, v0, [Lrc;

    .line 13
    .line 14
    invoke-interface {p1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, [Lrc;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    monitor-exit p0

    .line 21
    return-object p1

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    :try_start_1
    check-cast p1, Lrc;

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    new-array v0, v0, [Lrc;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    aput-object p1, v0, v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    .line 32
    monitor-exit p0

    .line 33
    return-object v0

    .line 34
    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 35
    throw p1
.end method

.method public final declared-synchronized e(Lgg0;I)Lrc;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    :try_start_1
    iget-object v0, p0, Ltc;->a:Lpc;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 9
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    monitor-exit p0

    .line 13
    const/4 p1, 0x0

    .line 14
    return-object p1

    .line 15
    :cond_0
    const/4 v1, 0x0

    .line 16
    :try_start_3
    invoke-virtual {p0, p1, v0, p2, v1}, Ltc;->i(Lgg0;Ljava/lang/Object;II)Lrc;

    .line 17
    .line 18
    .line 19
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 20
    monitor-exit p0

    .line 21
    return-object p1

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    goto :goto_0

    .line 24
    :catchall_1
    move-exception p1

    .line 25
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 26
    :try_start_5
    throw p1

    .line 27
    :goto_0
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 28
    throw p1
.end method

.method public final g(Lgg0;II)Lnu0;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    monitor-enter p0

    .line 10
    :try_start_0
    iget v4, v0, Lgg0;->i:I

    .line 11
    .line 12
    move v5, v4

    .line 13
    :goto_0
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x1

    .line 15
    const/4 v8, 0x0

    .line 16
    if-lt v5, v7, :cond_10

    .line 17
    .line 18
    if-ne v5, v7, :cond_0

    .line 19
    .line 20
    move v9, v7

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    move v9, v8

    .line 23
    :goto_1
    if-ne v5, v4, :cond_1

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_1
    move v7, v8

    .line 27
    :goto_2
    if-eqz v9, :cond_2

    .line 28
    .line 29
    sget-object v9, Lgg0;->l:Lgg0;

    .line 30
    .line 31
    goto :goto_3

    .line 32
    :catchall_0
    move-exception v0

    .line 33
    goto/16 :goto_7

    .line 34
    .line 35
    :cond_2
    if-eqz v7, :cond_3

    .line 36
    .line 37
    move-object v9, v0

    .line 38
    goto :goto_3

    .line 39
    :cond_3
    new-instance v9, Lgg0;

    .line 40
    .line 41
    sub-int v10, v4, v5

    .line 42
    .line 43
    invoke-direct {v9, v0, v10}, Lgg0;-><init>(Lgg0;I)V

    .line 44
    .line 45
    .line 46
    :goto_3
    iget-object v10, v1, Ltc;->a:Lpc;

    .line 47
    .line 48
    invoke-virtual {v10, v9}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v10

    .line 52
    if-nez v10, :cond_4

    .line 53
    .line 54
    goto/16 :goto_6

    .line 55
    .line 56
    :cond_4
    const/4 v11, 0x7

    .line 57
    if-eqz v7, :cond_9

    .line 58
    .line 59
    const/16 v12, 0xff

    .line 60
    .line 61
    if-ne v2, v12, :cond_9

    .line 62
    .line 63
    invoke-virtual {v1, v10}, Ltc;->d(Ljava/lang/Object;)[Lrc;

    .line 64
    .line 65
    .line 66
    move-result-object v12

    .line 67
    invoke-static {v11, v6, v8}, Lnu0;->b(ILkn0;Z)Lnu0;

    .line 68
    .line 69
    .line 70
    move-result-object v11

    .line 71
    array-length v13, v12

    .line 72
    move v14, v8

    .line 73
    move v15, v14

    .line 74
    :goto_4
    if-ge v14, v13, :cond_8

    .line 75
    .line 76
    aget-object v6, v12, v14

    .line 77
    .line 78
    invoke-interface {v6}, Lrc;->b()Z

    .line 79
    .line 80
    .line 81
    move-result v16

    .line 82
    if-eqz v16, :cond_5

    .line 83
    .line 84
    invoke-interface {v6}, Lrc;->getType()I

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    invoke-virtual {v1, v9, v6}, Ltc;->j(Lgg0;I)V

    .line 89
    .line 90
    .line 91
    goto :goto_5

    .line 92
    :cond_5
    instance-of v8, v6, Lqc;

    .line 93
    .line 94
    if-nez v8, :cond_6

    .line 95
    .line 96
    goto :goto_5

    .line 97
    :cond_6
    invoke-interface {v6, v3}, Lrc;->a(I)I

    .line 98
    .line 99
    .line 100
    move-result v8

    .line 101
    if-gez v8, :cond_7

    .line 102
    .line 103
    goto :goto_5

    .line 104
    :cond_7
    check-cast v6, Lqc;

    .line 105
    .line 106
    invoke-virtual {v11, v6}, Lnu0;->a(Lkn0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 107
    .line 108
    .line 109
    add-int/lit8 v15, v15, 0x1

    .line 110
    .line 111
    :goto_5
    add-int/lit8 v14, v14, 0x1

    .line 112
    .line 113
    const/4 v6, 0x0

    .line 114
    const/4 v8, 0x0

    .line 115
    goto :goto_4

    .line 116
    :cond_8
    if-lez v15, :cond_d

    .line 117
    .line 118
    monitor-exit p0

    .line 119
    return-object v11

    .line 120
    :cond_9
    if-eqz v7, :cond_c

    .line 121
    .line 122
    :try_start_1
    invoke-virtual {v1, v9, v10, v2, v3}, Ltc;->i(Lgg0;Ljava/lang/Object;II)Lrc;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    instance-of v8, v6, Lqc;

    .line 127
    .line 128
    if-eqz v8, :cond_a

    .line 129
    .line 130
    check-cast v6, Lqc;

    .line 131
    .line 132
    sget-object v0, Lnu0;->d:Lnu0;

    .line 133
    .line 134
    iget-boolean v0, v6, Lqc;->l:Z

    .line 135
    .line 136
    invoke-static {v11, v6, v0}, Lnu0;->b(ILkn0;Z)Lnu0;

    .line 137
    .line 138
    .line 139
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 140
    monitor-exit p0

    .line 141
    return-object v0

    .line 142
    :cond_a
    if-eqz v6, :cond_b

    .line 143
    .line 144
    const/4 v0, 0x3

    .line 145
    const/4 v2, 0x0

    .line 146
    const/4 v3, 0x0

    .line 147
    :try_start_2
    invoke-static {v0, v2, v3}, Lnu0;->b(ILkn0;Z)Lnu0;

    .line 148
    .line 149
    .line 150
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 151
    monitor-exit p0

    .line 152
    return-object v0

    .line 153
    :cond_b
    const/4 v6, 0x5

    .line 154
    :try_start_3
    invoke-virtual {v1, v9, v10, v6, v3}, Ltc;->i(Lgg0;Ljava/lang/Object;II)Lrc;

    .line 155
    .line 156
    .line 157
    move-result-object v8

    .line 158
    instance-of v11, v8, Lqc;

    .line 159
    .line 160
    if-eqz v11, :cond_d

    .line 161
    .line 162
    check-cast v8, Lqc;

    .line 163
    .line 164
    sget-object v0, Lnu0;->d:Lnu0;

    .line 165
    .line 166
    iget-boolean v0, v8, Lqc;->l:Z

    .line 167
    .line 168
    invoke-static {v6, v8, v0}, Lnu0;->b(ILkn0;Z)Lnu0;

    .line 169
    .line 170
    .line 171
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 172
    monitor-exit p0

    .line 173
    return-object v0

    .line 174
    :cond_c
    const/16 v6, 0x27

    .line 175
    .line 176
    :try_start_4
    invoke-virtual {v1, v9, v10, v6, v3}, Ltc;->i(Lgg0;Ljava/lang/Object;II)Lrc;

    .line 177
    .line 178
    .line 179
    move-result-object v6

    .line 180
    instance-of v8, v6, Lqc;

    .line 181
    .line 182
    if-eqz v8, :cond_d

    .line 183
    .line 184
    check-cast v6, Lqc;

    .line 185
    .line 186
    sget-object v0, Lnu0;->d:Lnu0;

    .line 187
    .line 188
    iget-boolean v0, v6, Lqc;->l:Z

    .line 189
    .line 190
    const/4 v2, 0x6

    .line 191
    invoke-static {v2, v6, v0}, Lnu0;->b(ILkn0;Z)Lnu0;

    .line 192
    .line 193
    .line 194
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 195
    monitor-exit p0

    .line 196
    return-object v0

    .line 197
    :cond_d
    const/4 v6, 0x2

    .line 198
    :try_start_5
    invoke-virtual {v1, v9, v10, v6, v3}, Ltc;->i(Lgg0;Ljava/lang/Object;II)Lrc;

    .line 199
    .line 200
    .line 201
    move-result-object v8

    .line 202
    instance-of v11, v8, Lqc;

    .line 203
    .line 204
    if-eqz v11, :cond_e

    .line 205
    .line 206
    check-cast v8, Lqc;

    .line 207
    .line 208
    sget-object v0, Lnu0;->d:Lnu0;

    .line 209
    .line 210
    iget-boolean v0, v8, Lqc;->l:Z

    .line 211
    .line 212
    const/4 v2, 0x4

    .line 213
    invoke-static {v2, v8, v0}, Lnu0;->b(ILkn0;Z)Lnu0;

    .line 214
    .line 215
    .line 216
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 217
    monitor-exit p0

    .line 218
    return-object v0

    .line 219
    :cond_e
    if-eqz v7, :cond_f

    .line 220
    .line 221
    const/4 v7, 0x0

    .line 222
    :try_start_6
    invoke-virtual {v1, v9, v10, v7, v3}, Ltc;->i(Lgg0;Ljava/lang/Object;II)Lrc;

    .line 223
    .line 224
    .line 225
    move-result-object v8

    .line 226
    if-eqz v8, :cond_f

    .line 227
    .line 228
    const/4 v8, 0x0

    .line 229
    invoke-static {v6, v8, v7}, Lnu0;->b(ILkn0;Z)Lnu0;

    .line 230
    .line 231
    .line 232
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 233
    monitor-exit p0

    .line 234
    return-object v0

    .line 235
    :cond_f
    :goto_6
    add-int/lit8 v5, v5, -0x1

    .line 236
    .line 237
    goto/16 :goto_0

    .line 238
    .line 239
    :cond_10
    move-object v2, v6

    .line 240
    move v3, v8

    .line 241
    :try_start_7
    invoke-static {v7, v2, v3}, Lnu0;->b(ILkn0;Z)Lnu0;

    .line 242
    .line 243
    .line 244
    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 245
    monitor-exit p0

    .line 246
    return-object v0

    .line 247
    :goto_7
    :try_start_8
    monitor-exit p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 248
    throw v0
.end method

.method public final declared-synchronized i(Lgg0;Ljava/lang/Object;II)Lrc;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    const/16 v0, 0xff

    .line 3
    .line 4
    if-eq p3, v0, :cond_6

    .line 5
    .line 6
    :try_start_0
    instance-of v0, p2, Ljava/util/List;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    check-cast p2, Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lrc;

    .line 28
    .line 29
    invoke-interface {v0}, Lrc;->getType()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-ne v2, p3, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception p1

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move-object v0, p2

    .line 39
    check-cast v0, Lrc;

    .line 40
    .line 41
    invoke-interface {v0}, Lrc;->getType()I

    .line 42
    .line 43
    .line 44
    move-result p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    if-ne p2, p3, :cond_2

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    move-object v0, v1

    .line 49
    :goto_0
    if-nez v0, :cond_3

    .line 50
    .line 51
    monitor-exit p0

    .line 52
    return-object v1

    .line 53
    :cond_3
    :try_start_1
    invoke-interface {v0}, Lrc;->b()Z

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    if-eqz p2, :cond_4

    .line 58
    .line 59
    invoke-virtual {p0, p1, p3}, Ltc;->j(Lgg0;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 60
    .line 61
    .line 62
    monitor-exit p0

    .line 63
    return-object v1

    .line 64
    :cond_4
    :try_start_2
    invoke-interface {v0, p4}, Lrc;->a(I)I

    .line 65
    .line 66
    .line 67
    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 68
    if-gez p1, :cond_5

    .line 69
    .line 70
    monitor-exit p0

    .line 71
    return-object v1

    .line 72
    :cond_5
    monitor-exit p0

    .line 73
    return-object v0

    .line 74
    :cond_6
    :try_start_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 75
    .line 76
    const-string p2, "oneElement(ANY)"

    .line 77
    .line 78
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw p1

    .line 82
    :goto_1
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 83
    throw p1
.end method

.method public final declared-synchronized j(Lgg0;I)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Ltc;->a:Lpc;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    monitor-exit p0

    .line 11
    return-void

    .line 12
    :cond_0
    :try_start_1
    instance-of v1, v0, Ljava/util/List;

    .line 13
    .line 14
    if-eqz v1, :cond_3

    .line 15
    .line 16
    check-cast v0, Ljava/util/List;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-ge v1, v2, :cond_5

    .line 24
    .line 25
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Lrc;

    .line 30
    .line 31
    invoke-interface {v2}, Lrc;->getType()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-ne v2, p2, :cond_2

    .line 36
    .line 37
    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    if-eqz p2, :cond_1

    .line 45
    .line 46
    iget-object p2, p0, Ltc;->a:Lpc;

    .line 47
    .line 48
    invoke-virtual {p2, p1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :catchall_0
    move-exception p1

    .line 53
    goto :goto_2

    .line 54
    :cond_1
    :goto_1
    monitor-exit p0

    .line 55
    return-void

    .line 56
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    :try_start_2
    check-cast v0, Lrc;

    .line 60
    .line 61
    invoke-interface {v0}, Lrc;->getType()I

    .line 62
    .line 63
    .line 64
    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 65
    if-eq v0, p2, :cond_4

    .line 66
    .line 67
    monitor-exit p0

    .line 68
    return-void

    .line 69
    :cond_4
    :try_start_3
    iget-object p2, p0, Ltc;->a:Lpc;

    .line 70
    .line 71
    invoke-virtual {p2, p1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 72
    .line 73
    .line 74
    :cond_5
    monitor-exit p0

    .line 75
    return-void

    .line 76
    :goto_2
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 77
    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    monitor-enter p0

    .line 7
    :try_start_0
    iget-object v1, p0, Ltc;->a:Lpc;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/AbstractMap;->values()Ljava/util/Collection;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {p0, v2}, Ltc;->d(Ljava/lang/Object;)[Lrc;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    array-length v3, v2

    .line 32
    const/4 v4, 0x0

    .line 33
    :goto_0
    if-ge v4, v3, :cond_0

    .line 34
    .line 35
    aget-object v5, v2, v4

    .line 36
    .line 37
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v5, "\n"

    .line 41
    .line 42
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    add-int/lit8 v4, v4, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception v0

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    return-object v0

    .line 56
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 57
    throw v0
.end method
