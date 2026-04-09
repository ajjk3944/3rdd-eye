.class public final Lpj4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lan1;


# instance fields
.field public f:I

.field public final g:Ljava/lang/Object;

.field public final h:Ljava/lang/Object;

.field public final i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lgn1;I)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lpj4;->j:Ljava/lang/Object;

    new-instance p1, Llg1;

    const/4 v0, 0x5

    new-array v1, v0, [B

    invoke-direct {p1, v0, v1}, Llg1;-><init>(I[B)V

    iput-object p1, p0, Lpj4;->g:Ljava/lang/Object;

    new-instance p1, Landroid/util/SparseArray;

    .line 3
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lpj4;->h:Ljava/lang/Object;

    new-instance p1, Landroid/util/SparseIntArray;

    .line 4
    invoke-direct {p1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p1, p0, Lpj4;->i:Ljava/lang/Object;

    iput p2, p0, Lpj4;->f:I

    return-void
.end method

.method public constructor <init>(Lt83;)V
    .locals 8

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iget-object v0, p1, Lt83;->h:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 8
    new-array v2, v1, [Ljava/lang/String;

    .line 9
    iget-object v3, p1, Lt83;->g:Ljava/lang/Object;

    check-cast v3, Ljava/util/ArrayList;

    .line 10
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/String;

    iput-object v2, p0, Lpj4;->g:Ljava/lang/Object;

    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    new-array v3, v2, [D

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v2, :cond_0

    .line 12
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Double;

    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v6

    aput-wide v6, v3, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 13
    :cond_0
    iput-object v3, p0, Lpj4;->h:Ljava/lang/Object;

    .line 14
    iget-object p1, p1, Lt83;->i:Ljava/lang/Object;

    check-cast p1, Ljava/util/ArrayList;

    .line 15
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v2, v0, [D

    move v3, v4

    :goto_1
    if-ge v3, v0, :cond_1

    .line 16
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Double;

    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v5

    aput-wide v5, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 17
    :cond_1
    iput-object v2, p0, Lpj4;->i:Ljava/lang/Object;

    .line 18
    new-array p1, v1, [I

    iput-object p1, p0, Lpj4;->j:Ljava/lang/Object;

    iput v4, p0, Lpj4;->f:I

    return-void
.end method

.method public constructor <init>(Lt83;Lx83;Lz71;)V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lpj4;->f:I

    iput-object p1, p0, Lpj4;->g:Ljava/lang/Object;

    iput-object p3, p0, Lpj4;->h:Ljava/lang/Object;

    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lpj4;->i:Ljava/lang/Object;

    new-instance p1, Lvg0;

    const/16 p3, 0x19

    invoke-direct {p1, p3, p0}, Lvg0;-><init>(ILjava/lang/Object;)V

    .line 20
    iput-object p1, p2, Lx83;->a:Lvg0;

    return-void
.end method

.method public constructor <init>(Lxf1;Lug0;[B[Lkj1;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpj4;->g:Ljava/lang/Object;

    iput-object p2, p0, Lpj4;->h:Ljava/lang/Object;

    iput-object p3, p0, Lpj4;->i:Ljava/lang/Object;

    iput-object p4, p0, Lpj4;->j:Ljava/lang/Object;

    iput p5, p0, Lpj4;->f:I

    return-void
.end method

.method public constructor <init>([Ljc4;[Lnj4;Lo42;Loj4;)V
    .locals 2

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    array-length v0, p1

    array-length v1, p2

    if-ne v0, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lzt0;->D(Z)V

    iput-object p1, p0, Lpj4;->g:Ljava/lang/Object;

    .line 22
    invoke-virtual {p2}, [Lnj4;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lnj4;

    iput-object p1, p0, Lpj4;->h:Ljava/lang/Object;

    iput-object p3, p0, Lpj4;->i:Ljava/lang/Object;

    iput-object p4, p0, Lpj4;->j:Ljava/lang/Object;

    iput v0, p0, Lpj4;->f:I

    return-void
.end method


# virtual methods
.method public a(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lpj4;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [Ljc4;

    .line 4
    .line 5
    aget-object p1, v0, p1

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    return p1

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    return p1
.end method

.method public b(Lx13;Lnf1;Lin1;)V
    .locals 0

    .line 1
    return-void
.end method

.method public c(Lpj4;I)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-object v1, p0, Lpj4;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, [Ljc4;

    .line 8
    .line 9
    aget-object v1, v1, p2

    .line 10
    .line 11
    iget-object v2, p1, Lpj4;->g:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, [Ljc4;

    .line 14
    .line 15
    aget-object v2, v2, p2

    .line 16
    .line 17
    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    iget-object v1, p0, Lpj4;->h:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, [Lnj4;

    .line 26
    .line 27
    aget-object v1, v1, p2

    .line 28
    .line 29
    iget-object p1, p1, Lpj4;->h:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, [Lnj4;

    .line 32
    .line 33
    aget-object p1, p1, p2

    .line 34
    .line 35
    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    const/4 p1, 0x1

    .line 42
    return p1

    .line 43
    :cond_1
    return v0
.end method

.method public declared-synchronized d()V
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Lmz1;->F6:Liz1;

    .line 3
    .line 4
    sget-object v1, Ltw1;->e:Ltw1;

    .line 5
    .line 6
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    sget-object v0, Lhg4;->C:Lhg4;

    .line 21
    .line 22
    iget-object v0, v0, Lhg4;->h:Lgd2;

    .line 23
    .line 24
    invoke-virtual {v0}, Lgd2;->g()Lra4;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Lra4;->m()Led2;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget-boolean v0, v0, Led2;->j:Z

    .line 33
    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget-object v0, p0, Lpj4;->i:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Ljava/util/ArrayDeque;

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    monitor-exit p0

    .line 45
    return-void

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    goto/16 :goto_5

    .line 48
    .line 49
    :cond_1
    :goto_0
    :try_start_1
    monitor-enter p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    :try_start_2
    iget-object v0, p0, Lpj4;->j:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Lgc3;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 53
    .line 54
    if-nez v0, :cond_2

    .line 55
    .line 56
    :try_start_3
    monitor-exit p0

    .line 57
    const/4 v0, 0x1

    .line 58
    goto :goto_1

    .line 59
    :cond_2
    monitor-exit p0

    .line 60
    const/4 v0, 0x0

    .line 61
    :goto_1
    if-eqz v0, :cond_7

    .line 62
    .line 63
    :cond_3
    :goto_2
    iget-object v0, p0, Lpj4;->i:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v0, Ljava/util/ArrayDeque;

    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-nez v1, :cond_7

    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    check-cast v0, La73;

    .line 78
    .line 79
    if-eqz v0, :cond_6

    .line 80
    .line 81
    iget-object v1, v0, La73;->g:Lf93;

    .line 82
    .line 83
    if-eqz v1, :cond_3

    .line 84
    .line 85
    iget-object v2, p0, Lpj4;->g:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v2, Lt83;

    .line 88
    .line 89
    monitor-enter v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 90
    :try_start_4
    iget-object v3, v2, Lt83;->g:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v3, Ljava/util/concurrent/ConcurrentHashMap;

    .line 93
    .line 94
    invoke-virtual {v3, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    check-cast v1, Lz83;

    .line 99
    .line 100
    if-eqz v1, :cond_4

    .line 101
    .line 102
    iget-object v3, v2, Lt83;->h:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v3, Ld93;

    .line 105
    .line 106
    invoke-virtual {v1}, Lz83;->a()V

    .line 107
    .line 108
    .line 109
    iget-object v1, v1, Lz83;->a:Ljava/util/LinkedList;

    .line 110
    .line 111
    invoke-virtual {v1}, Ljava/util/LinkedList;->size()I

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    iget v3, v3, Ld93;->j:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 116
    .line 117
    if-ge v1, v3, :cond_5

    .line 118
    .line 119
    :cond_4
    :try_start_5
    monitor-exit v2

    .line 120
    goto :goto_3

    .line 121
    :cond_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 122
    goto :goto_2

    .line 123
    :catchall_1
    move-exception v0

    .line 124
    :try_start_6
    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 125
    :try_start_7
    throw v0

    .line 126
    :cond_6
    :goto_3
    iget-object v1, p0, Lpj4;->g:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v1, Lt83;

    .line 129
    .line 130
    iget-object v2, p0, Lpj4;->h:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v2, Lz71;

    .line 133
    .line 134
    new-instance v3, Lgc3;

    .line 135
    .line 136
    invoke-direct {v3, v1, v2, v0}, Lgc3;-><init>(Lt83;Lz71;La73;)V

    .line 137
    .line 138
    .line 139
    iput-object v3, p0, Lpj4;->j:Ljava/lang/Object;

    .line 140
    .line 141
    new-instance v1, Llv2;

    .line 142
    .line 143
    const/4 v2, 0x6

    .line 144
    const/4 v4, 0x0

    .line 145
    invoke-direct {v1, p0, v0, v2, v4}, Llv2;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 146
    .line 147
    .line 148
    monitor-enter v3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 149
    :try_start_8
    iget-object v2, v3, Lgc3;->d:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v2, Lwo3;

    .line 152
    .line 153
    sget-object v4, Lfi1;->n:Lfi1;

    .line 154
    .line 155
    iget-object v5, v0, La73;->e:Ljava/util/concurrent/Executor;

    .line 156
    .line 157
    invoke-static {v2, v4, v5}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    iget-object v0, v0, La73;->e:Ljava/util/concurrent/Executor;

    .line 162
    .line 163
    new-instance v4, Ljq3;

    .line 164
    .line 165
    const/4 v5, 0x0

    .line 166
    invoke-direct {v4, v2, v1, v5}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2, v4, v0}, Lgp3;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 170
    .line 171
    .line 172
    :try_start_9
    monitor-exit v3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 173
    monitor-exit p0

    .line 174
    return-void

    .line 175
    :catchall_2
    move-exception v0

    .line 176
    :try_start_a
    monitor-exit v3
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 177
    :try_start_b
    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 178
    :cond_7
    monitor-exit p0

    .line 179
    return-void

    .line 180
    :goto_4
    :try_start_c
    monitor-exit p0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 181
    :try_start_d
    throw v0

    .line 182
    :catchall_3
    move-exception v0

    .line 183
    goto :goto_4

    .line 184
    :goto_5
    monitor-exit p0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    .line 185
    throw v0
.end method

.method public e(Lkz2;)V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Lkz2;->K()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x2

    .line 10
    if-eq v2, v3, :cond_1

    .line 11
    .line 12
    :cond_0
    move-object v3, v0

    .line 13
    goto/16 :goto_11

    .line 14
    .line 15
    :cond_1
    iget-object v2, v0, Lpj4;->j:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Lgn1;

    .line 18
    .line 19
    iget-object v4, v2, Lgn1;->a:Ljava/util/List;

    .line 20
    .line 21
    iget-object v5, v2, Lgn1;->f:Landroid/util/SparseArray;

    .line 22
    .line 23
    iget-object v6, v2, Lgn1;->g:Landroid/util/SparseBooleanArray;

    .line 24
    .line 25
    const/4 v7, 0x0

    .line 26
    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    check-cast v4, Lx13;

    .line 31
    .line 32
    invoke-virtual {v1}, Lkz2;->K()I

    .line 33
    .line 34
    .line 35
    move-result v8

    .line 36
    const/16 v9, 0x80

    .line 37
    .line 38
    and-int/2addr v8, v9

    .line 39
    if-eqz v8, :cond_0

    .line 40
    .line 41
    const/4 v8, 0x1

    .line 42
    invoke-virtual {v1, v8}, Lkz2;->G(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Lkz2;->L()I

    .line 46
    .line 47
    .line 48
    move-result v10

    .line 49
    const/4 v11, 0x3

    .line 50
    invoke-virtual {v1, v11}, Lkz2;->G(I)V

    .line 51
    .line 52
    .line 53
    iget-object v12, v0, Lpj4;->g:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v12, Llg1;

    .line 56
    .line 57
    iget-object v13, v12, Llg1;->a:[B

    .line 58
    .line 59
    invoke-virtual {v1, v13, v7, v3}, Lkz2;->H([BII)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v12, v7}, Llg1;->l(I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v12, v11}, Llg1;->o(I)V

    .line 66
    .line 67
    .line 68
    const/16 v13, 0xd

    .line 69
    .line 70
    invoke-virtual {v12, v13}, Llg1;->r(I)I

    .line 71
    .line 72
    .line 73
    move-result v14

    .line 74
    iput v14, v2, Lgn1;->o:I

    .line 75
    .line 76
    iget-object v14, v12, Llg1;->a:[B

    .line 77
    .line 78
    invoke-virtual {v1, v14, v7, v3}, Lkz2;->H([BII)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v12, v7}, Llg1;->l(I)V

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x4

    .line 85
    invoke-virtual {v12, v14}, Llg1;->o(I)V

    .line 86
    .line 87
    .line 88
    const/16 v15, 0xc

    .line 89
    .line 90
    invoke-virtual {v12, v15}, Llg1;->r(I)I

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    invoke-virtual {v1, v8}, Lkz2;->G(I)V

    .line 95
    .line 96
    .line 97
    iget-object v8, v0, Lpj4;->h:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v8, Landroid/util/SparseArray;

    .line 100
    .line 101
    invoke-virtual {v8}, Landroid/util/SparseArray;->clear()V

    .line 102
    .line 103
    .line 104
    iget-object v9, v0, Lpj4;->i:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v9, Landroid/util/SparseIntArray;

    .line 107
    .line 108
    invoke-virtual {v9}, Landroid/util/SparseIntArray;->clear()V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1}, Lkz2;->B()I

    .line 112
    .line 113
    .line 114
    move-result v16

    .line 115
    :goto_0
    if-lez v16, :cond_24

    .line 116
    .line 117
    iget-object v3, v12, Llg1;->a:[B

    .line 118
    .line 119
    const/4 v15, 0x5

    .line 120
    invoke-virtual {v1, v3, v7, v15}, Lkz2;->H([BII)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v12, v7}, Llg1;->l(I)V

    .line 124
    .line 125
    .line 126
    const/16 v3, 0x8

    .line 127
    .line 128
    invoke-virtual {v12, v3}, Llg1;->r(I)I

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    invoke-virtual {v12, v11}, Llg1;->o(I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v12, v13}, Llg1;->r(I)I

    .line 136
    .line 137
    .line 138
    move-result v7

    .line 139
    invoke-virtual {v12, v14}, Llg1;->o(I)V

    .line 140
    .line 141
    .line 142
    const/16 v13, 0xc

    .line 143
    .line 144
    invoke-virtual {v12, v13}, Llg1;->r(I)I

    .line 145
    .line 146
    .line 147
    move-result v17

    .line 148
    iget v13, v1, Lkz2;->b:I

    .line 149
    .line 150
    add-int v14, v13, v17

    .line 151
    .line 152
    const/16 v18, 0x0

    .line 153
    .line 154
    const/16 v19, -0x1

    .line 155
    .line 156
    move-object/from16 v20, v18

    .line 157
    .line 158
    move-object/from16 v22, v20

    .line 159
    .line 160
    const/16 v21, 0x0

    .line 161
    .line 162
    :goto_1
    iget v11, v1, Lkz2;->b:I

    .line 163
    .line 164
    if-ge v11, v14, :cond_2

    .line 165
    .line 166
    invoke-virtual {v1}, Lkz2;->K()I

    .line 167
    .line 168
    .line 169
    move-result v11

    .line 170
    invoke-virtual {v1}, Lkz2;->K()I

    .line 171
    .line 172
    .line 173
    move-result v26

    .line 174
    iget v15, v1, Lkz2;->b:I

    .line 175
    .line 176
    add-int v15, v15, v26

    .line 177
    .line 178
    if-le v15, v14, :cond_3

    .line 179
    .line 180
    :cond_2
    move-object/from16 v26, v5

    .line 181
    .line 182
    move-object/from16 v27, v12

    .line 183
    .line 184
    goto/16 :goto_8

    .line 185
    .line 186
    :cond_3
    const/16 v26, 0x87

    .line 187
    .line 188
    move-object/from16 v27, v12

    .line 189
    .line 190
    const/4 v12, 0x5

    .line 191
    if-ne v11, v12, :cond_7

    .line 192
    .line 193
    invoke-virtual {v1}, Lkz2;->P()J

    .line 194
    .line 195
    .line 196
    move-result-wide v11

    .line 197
    const-wide/32 v23, 0x41432d33

    .line 198
    .line 199
    .line 200
    cmp-long v23, v11, v23

    .line 201
    .line 202
    if-nez v23, :cond_4

    .line 203
    .line 204
    :goto_2
    move-object/from16 v26, v5

    .line 205
    .line 206
    move/from16 v25, v15

    .line 207
    .line 208
    const/16 v19, 0x81

    .line 209
    .line 210
    goto/16 :goto_7

    .line 211
    .line 212
    :cond_4
    const-wide/32 v23, 0x45414333

    .line 213
    .line 214
    .line 215
    cmp-long v23, v11, v23

    .line 216
    .line 217
    if-nez v23, :cond_5

    .line 218
    .line 219
    :goto_3
    move/from16 v25, v15

    .line 220
    .line 221
    move/from16 v19, v26

    .line 222
    .line 223
    move-object/from16 v26, v5

    .line 224
    .line 225
    goto/16 :goto_7

    .line 226
    .line 227
    :cond_5
    const-wide/32 v23, 0x41432d34

    .line 228
    .line 229
    .line 230
    cmp-long v23, v11, v23

    .line 231
    .line 232
    if-nez v23, :cond_6

    .line 233
    .line 234
    :goto_4
    move-object/from16 v26, v5

    .line 235
    .line 236
    move/from16 v25, v15

    .line 237
    .line 238
    const/16 v19, 0xac

    .line 239
    .line 240
    goto/16 :goto_7

    .line 241
    .line 242
    :cond_6
    const-wide/32 v23, 0x48455643

    .line 243
    .line 244
    .line 245
    cmp-long v11, v11, v23

    .line 246
    .line 247
    if-nez v11, :cond_e

    .line 248
    .line 249
    move-object/from16 v26, v5

    .line 250
    .line 251
    move/from16 v25, v15

    .line 252
    .line 253
    const/16 v19, 0x24

    .line 254
    .line 255
    goto/16 :goto_7

    .line 256
    .line 257
    :cond_7
    const/16 v12, 0x6a

    .line 258
    .line 259
    if-ne v11, v12, :cond_8

    .line 260
    .line 261
    goto :goto_2

    .line 262
    :cond_8
    const/16 v12, 0x7a

    .line 263
    .line 264
    if-ne v11, v12, :cond_9

    .line 265
    .line 266
    goto :goto_3

    .line 267
    :cond_9
    const/16 v12, 0x7f

    .line 268
    .line 269
    if-ne v11, v12, :cond_c

    .line 270
    .line 271
    invoke-virtual {v1}, Lkz2;->K()I

    .line 272
    .line 273
    .line 274
    move-result v11

    .line 275
    const/16 v12, 0x15

    .line 276
    .line 277
    if-ne v11, v12, :cond_a

    .line 278
    .line 279
    goto :goto_4

    .line 280
    :cond_a
    const/16 v12, 0xe

    .line 281
    .line 282
    if-ne v11, v12, :cond_b

    .line 283
    .line 284
    const/16 v11, 0x88

    .line 285
    .line 286
    move-object/from16 v26, v5

    .line 287
    .line 288
    move/from16 v19, v11

    .line 289
    .line 290
    :goto_5
    move/from16 v25, v15

    .line 291
    .line 292
    goto/16 :goto_7

    .line 293
    .line 294
    :cond_b
    const/16 v12, 0x21

    .line 295
    .line 296
    if-ne v11, v12, :cond_e

    .line 297
    .line 298
    move-object/from16 v26, v5

    .line 299
    .line 300
    move/from16 v25, v15

    .line 301
    .line 302
    const/16 v19, 0x8b

    .line 303
    .line 304
    goto/16 :goto_7

    .line 305
    .line 306
    :cond_c
    const/16 v12, 0x7b

    .line 307
    .line 308
    if-ne v11, v12, :cond_d

    .line 309
    .line 310
    move-object/from16 v26, v5

    .line 311
    .line 312
    move/from16 v25, v15

    .line 313
    .line 314
    const/16 v19, 0x8a

    .line 315
    .line 316
    goto :goto_7

    .line 317
    :cond_d
    const/16 v12, 0xa

    .line 318
    .line 319
    if-ne v11, v12, :cond_f

    .line 320
    .line 321
    sget-object v11, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 322
    .line 323
    const/4 v12, 0x3

    .line 324
    invoke-virtual {v1, v12, v11}, Lkz2;->k(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v11

    .line 328
    invoke-virtual {v11}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v20

    .line 332
    invoke-virtual {v1}, Lkz2;->K()I

    .line 333
    .line 334
    .line 335
    move-result v21

    .line 336
    :cond_e
    move-object/from16 v26, v5

    .line 337
    .line 338
    goto :goto_5

    .line 339
    :cond_f
    const/16 v12, 0x59

    .line 340
    .line 341
    if-ne v11, v12, :cond_11

    .line 342
    .line 343
    new-instance v11, Ljava/util/ArrayList;

    .line 344
    .line 345
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 346
    .line 347
    .line 348
    :goto_6
    iget v12, v1, Lkz2;->b:I

    .line 349
    .line 350
    if-ge v12, v15, :cond_10

    .line 351
    .line 352
    sget-object v12, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 353
    .line 354
    move/from16 v25, v15

    .line 355
    .line 356
    const/4 v15, 0x3

    .line 357
    invoke-virtual {v1, v15, v12}, Lkz2;->k(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v12

    .line 361
    invoke-virtual {v12}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v12

    .line 365
    invoke-virtual {v1}, Lkz2;->K()I

    .line 366
    .line 367
    .line 368
    const/4 v15, 0x4

    .line 369
    new-array v0, v15, [B

    .line 370
    .line 371
    move-object/from16 v26, v5

    .line 372
    .line 373
    const/4 v5, 0x0

    .line 374
    invoke-virtual {v1, v0, v5, v15}, Lkz2;->H([BII)V

    .line 375
    .line 376
    .line 377
    new-instance v5, Lhn1;

    .line 378
    .line 379
    invoke-direct {v5, v12, v0}, Lhn1;-><init>(Ljava/lang/String;[B)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 383
    .line 384
    .line 385
    move-object/from16 v0, p0

    .line 386
    .line 387
    move/from16 v15, v25

    .line 388
    .line 389
    move-object/from16 v5, v26

    .line 390
    .line 391
    goto :goto_6

    .line 392
    :cond_10
    move-object/from16 v26, v5

    .line 393
    .line 394
    move/from16 v25, v15

    .line 395
    .line 396
    move-object/from16 v22, v11

    .line 397
    .line 398
    const/16 v19, 0x59

    .line 399
    .line 400
    goto :goto_7

    .line 401
    :cond_11
    move-object/from16 v26, v5

    .line 402
    .line 403
    move/from16 v25, v15

    .line 404
    .line 405
    const/16 v0, 0x6f

    .line 406
    .line 407
    if-ne v11, v0, :cond_12

    .line 408
    .line 409
    const/16 v19, 0x101

    .line 410
    .line 411
    :cond_12
    :goto_7
    iget v0, v1, Lkz2;->b:I

    .line 412
    .line 413
    sub-int v15, v25, v0

    .line 414
    .line 415
    invoke-virtual {v1, v15}, Lkz2;->G(I)V

    .line 416
    .line 417
    .line 418
    move-object/from16 v0, p0

    .line 419
    .line 420
    move-object/from16 v5, v26

    .line 421
    .line 422
    move-object/from16 v12, v27

    .line 423
    .line 424
    const/4 v15, 0x5

    .line 425
    goto/16 :goto_1

    .line 426
    .line 427
    :goto_8
    invoke-virtual {v1, v14}, Lkz2;->E(I)V

    .line 428
    .line 429
    .line 430
    new-instance v0, Lso1;

    .line 431
    .line 432
    iget-object v5, v1, Lkz2;->a:[B

    .line 433
    .line 434
    invoke-static {v5, v13, v14}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 435
    .line 436
    .line 437
    move-result-object v5

    .line 438
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 439
    .line 440
    .line 441
    move/from16 v11, v21

    .line 442
    .line 443
    iput v11, v0, Lso1;->f:I

    .line 444
    .line 445
    if-nez v22, :cond_13

    .line 446
    .line 447
    sget-object v11, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 448
    .line 449
    goto :goto_9

    .line 450
    :cond_13
    invoke-static/range {v22 .. v22}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 451
    .line 452
    .line 453
    move-result-object v11

    .line 454
    :goto_9
    iput-object v11, v0, Lso1;->g:Ljava/lang/Object;

    .line 455
    .line 456
    iput-object v5, v0, Lso1;->h:Ljava/lang/Object;

    .line 457
    .line 458
    const/4 v5, 0x6

    .line 459
    if-eq v3, v5, :cond_14

    .line 460
    .line 461
    const/4 v12, 0x5

    .line 462
    if-ne v3, v12, :cond_15

    .line 463
    .line 464
    :cond_14
    move/from16 v3, v19

    .line 465
    .line 466
    :cond_15
    add-int/lit8 v17, v17, 0x5

    .line 467
    .line 468
    sub-int v16, v16, v17

    .line 469
    .line 470
    invoke-virtual {v6, v7}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 471
    .line 472
    .line 473
    move-result v5

    .line 474
    if-nez v5, :cond_23

    .line 475
    .line 476
    iget-object v5, v2, Lgn1;->d:Ldm1;

    .line 477
    .line 478
    const-string v11, "video/mp2t"

    .line 479
    .line 480
    const/4 v12, 0x2

    .line 481
    if-eq v3, v12, :cond_21

    .line 482
    .line 483
    const/4 v15, 0x3

    .line 484
    if-eq v3, v15, :cond_20

    .line 485
    .line 486
    const/4 v13, 0x4

    .line 487
    if-eq v3, v13, :cond_20

    .line 488
    .line 489
    const/16 v14, 0x15

    .line 490
    .line 491
    if-eq v3, v14, :cond_1f

    .line 492
    .line 493
    const/16 v14, 0x1b

    .line 494
    .line 495
    if-eq v3, v14, :cond_1e

    .line 496
    .line 497
    const/16 v14, 0x24

    .line 498
    .line 499
    if-eq v3, v14, :cond_1d

    .line 500
    .line 501
    const/16 v14, 0x2d

    .line 502
    .line 503
    if-eq v3, v14, :cond_1c

    .line 504
    .line 505
    const/16 v14, 0x59

    .line 506
    .line 507
    if-eq v3, v14, :cond_1b

    .line 508
    .line 509
    const/16 v14, 0xac

    .line 510
    .line 511
    if-eq v3, v14, :cond_1a

    .line 512
    .line 513
    const/16 v14, 0x101

    .line 514
    .line 515
    if-eq v3, v14, :cond_19

    .line 516
    .line 517
    const/16 v14, 0x80

    .line 518
    .line 519
    if-eq v3, v14, :cond_22

    .line 520
    .line 521
    const/16 v12, 0x81

    .line 522
    .line 523
    if-eq v3, v12, :cond_17

    .line 524
    .line 525
    const/16 v12, 0x8a

    .line 526
    .line 527
    if-eq v3, v12, :cond_16

    .line 528
    .line 529
    const/16 v12, 0x8b

    .line 530
    .line 531
    if-eq v3, v12, :cond_18

    .line 532
    .line 533
    packed-switch v3, :pswitch_data_0

    .line 534
    .line 535
    .line 536
    packed-switch v3, :pswitch_data_1

    .line 537
    .line 538
    .line 539
    move-object/from16 v3, v18

    .line 540
    .line 541
    goto/16 :goto_d

    .line 542
    .line 543
    :cond_16
    :pswitch_0
    move-object/from16 v12, v20

    .line 544
    .line 545
    const/4 v13, 0x0

    .line 546
    goto :goto_b

    .line 547
    :cond_17
    :pswitch_1
    move-object/from16 v12, v20

    .line 548
    .line 549
    const/4 v13, 0x0

    .line 550
    goto/16 :goto_c

    .line 551
    .line 552
    :pswitch_2
    new-instance v0, Lbn1;

    .line 553
    .line 554
    new-instance v3, Lxb4;

    .line 555
    .line 556
    const-string v5, "application/x-scte35"

    .line 557
    .line 558
    invoke-direct {v3, v5}, Lxb4;-><init>(Ljava/lang/String;)V

    .line 559
    .line 560
    .line 561
    invoke-direct {v0, v3}, Lbn1;-><init>(Lan1;)V

    .line 562
    .line 563
    .line 564
    :goto_a
    move-object v3, v0

    .line 565
    goto/16 :goto_d

    .line 566
    .line 567
    :pswitch_3
    new-instance v3, Lwm1;

    .line 568
    .line 569
    new-instance v5, Ltm1;

    .line 570
    .line 571
    invoke-virtual {v0}, Lso1;->m()I

    .line 572
    .line 573
    .line 574
    move-result v0

    .line 575
    move-object/from16 v12, v20

    .line 576
    .line 577
    invoke-direct {v5, v12, v0}, Ltm1;-><init>(Ljava/lang/String;I)V

    .line 578
    .line 579
    .line 580
    invoke-direct {v3, v5}, Lwm1;-><init>(Lgm1;)V

    .line 581
    .line 582
    .line 583
    goto/16 :goto_d

    .line 584
    .line 585
    :pswitch_4
    new-instance v3, Lwm1;

    .line 586
    .line 587
    new-instance v11, Llm1;

    .line 588
    .line 589
    new-instance v12, Lxb4;

    .line 590
    .line 591
    invoke-virtual {v5, v0}, Ldm1;->a(Lso1;)Ljava/util/List;

    .line 592
    .line 593
    .line 594
    move-result-object v0

    .line 595
    const/16 v5, 0xe

    .line 596
    .line 597
    invoke-direct {v12, v5, v0}, Lxb4;-><init>(ILjava/util/List;)V

    .line 598
    .line 599
    .line 600
    invoke-direct {v11, v12}, Llm1;-><init>(Lxb4;)V

    .line 601
    .line 602
    .line 603
    invoke-direct {v3, v11}, Lwm1;-><init>(Lgm1;)V

    .line 604
    .line 605
    .line 606
    goto/16 :goto_d

    .line 607
    .line 608
    :pswitch_5
    move-object/from16 v12, v20

    .line 609
    .line 610
    new-instance v3, Lwm1;

    .line 611
    .line 612
    new-instance v5, Lcm1;

    .line 613
    .line 614
    invoke-virtual {v0}, Lso1;->m()I

    .line 615
    .line 616
    .line 617
    move-result v0

    .line 618
    const/4 v13, 0x0

    .line 619
    invoke-direct {v5, v12, v0, v11, v13}, Lcm1;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    .line 620
    .line 621
    .line 622
    invoke-direct {v3, v5}, Lwm1;-><init>(Lgm1;)V

    .line 623
    .line 624
    .line 625
    goto/16 :goto_d

    .line 626
    .line 627
    :cond_18
    move-object/from16 v12, v20

    .line 628
    .line 629
    const/4 v13, 0x0

    .line 630
    new-instance v3, Lwm1;

    .line 631
    .line 632
    new-instance v5, Lem1;

    .line 633
    .line 634
    invoke-virtual {v0}, Lso1;->m()I

    .line 635
    .line 636
    .line 637
    move-result v0

    .line 638
    const/16 v11, 0x1520

    .line 639
    .line 640
    invoke-direct {v5, v12, v0, v11}, Lem1;-><init>(Ljava/lang/String;II)V

    .line 641
    .line 642
    .line 643
    invoke-direct {v3, v5}, Lwm1;-><init>(Lgm1;)V

    .line 644
    .line 645
    .line 646
    goto/16 :goto_d

    .line 647
    .line 648
    :goto_b
    new-instance v3, Lwm1;

    .line 649
    .line 650
    new-instance v5, Lem1;

    .line 651
    .line 652
    invoke-virtual {v0}, Lso1;->m()I

    .line 653
    .line 654
    .line 655
    move-result v0

    .line 656
    const/16 v11, 0x1000

    .line 657
    .line 658
    invoke-direct {v5, v12, v0, v11}, Lem1;-><init>(Ljava/lang/String;II)V

    .line 659
    .line 660
    .line 661
    invoke-direct {v3, v5}, Lwm1;-><init>(Lgm1;)V

    .line 662
    .line 663
    .line 664
    goto/16 :goto_d

    .line 665
    .line 666
    :goto_c
    new-instance v3, Lwm1;

    .line 667
    .line 668
    new-instance v5, Lzl1;

    .line 669
    .line 670
    invoke-virtual {v0}, Lso1;->m()I

    .line 671
    .line 672
    .line 673
    move-result v0

    .line 674
    const/4 v13, 0x0

    .line 675
    invoke-direct {v5, v0, v13, v12, v11}, Lzl1;-><init>(IILjava/lang/String;Ljava/lang/String;)V

    .line 676
    .line 677
    .line 678
    invoke-direct {v3, v5}, Lwm1;-><init>(Lgm1;)V

    .line 679
    .line 680
    .line 681
    goto/16 :goto_d

    .line 682
    .line 683
    :cond_19
    const/16 v14, 0x80

    .line 684
    .line 685
    new-instance v0, Lbn1;

    .line 686
    .line 687
    new-instance v3, Lxb4;

    .line 688
    .line 689
    const-string v5, "application/vnd.dvb.ait"

    .line 690
    .line 691
    invoke-direct {v3, v5}, Lxb4;-><init>(Ljava/lang/String;)V

    .line 692
    .line 693
    .line 694
    invoke-direct {v0, v3}, Lbn1;-><init>(Lan1;)V

    .line 695
    .line 696
    .line 697
    goto/16 :goto_a

    .line 698
    .line 699
    :cond_1a
    move-object/from16 v12, v20

    .line 700
    .line 701
    const/16 v14, 0x80

    .line 702
    .line 703
    new-instance v3, Lwm1;

    .line 704
    .line 705
    new-instance v5, Lzl1;

    .line 706
    .line 707
    invoke-virtual {v0}, Lso1;->m()I

    .line 708
    .line 709
    .line 710
    move-result v0

    .line 711
    const/4 v13, 0x1

    .line 712
    invoke-direct {v5, v0, v13, v12, v11}, Lzl1;-><init>(IILjava/lang/String;Ljava/lang/String;)V

    .line 713
    .line 714
    .line 715
    invoke-direct {v3, v5}, Lwm1;-><init>(Lgm1;)V

    .line 716
    .line 717
    .line 718
    goto/16 :goto_d

    .line 719
    .line 720
    :cond_1b
    const/16 v14, 0x80

    .line 721
    .line 722
    iget-object v0, v0, Lso1;->g:Ljava/lang/Object;

    .line 723
    .line 724
    check-cast v0, Ljava/util/List;

    .line 725
    .line 726
    new-instance v3, Lwm1;

    .line 727
    .line 728
    new-instance v5, Lfm1;

    .line 729
    .line 730
    invoke-direct {v5, v0}, Lfm1;-><init>(Ljava/util/List;)V

    .line 731
    .line 732
    .line 733
    invoke-direct {v3, v5}, Lwm1;-><init>(Lgm1;)V

    .line 734
    .line 735
    .line 736
    goto :goto_d

    .line 737
    :cond_1c
    const/16 v14, 0x80

    .line 738
    .line 739
    new-instance v0, Lwm1;

    .line 740
    .line 741
    new-instance v3, Lvm1;

    .line 742
    .line 743
    invoke-direct {v3}, Lvm1;-><init>()V

    .line 744
    .line 745
    .line 746
    invoke-direct {v0, v3}, Lwm1;-><init>(Lgm1;)V

    .line 747
    .line 748
    .line 749
    goto/16 :goto_a

    .line 750
    .line 751
    :cond_1d
    const/16 v14, 0x80

    .line 752
    .line 753
    new-instance v3, Lwm1;

    .line 754
    .line 755
    new-instance v11, Lpm1;

    .line 756
    .line 757
    new-instance v12, Lt83;

    .line 758
    .line 759
    invoke-virtual {v5, v0}, Ldm1;->a(Lso1;)Ljava/util/List;

    .line 760
    .line 761
    .line 762
    move-result-object v0

    .line 763
    invoke-direct {v12, v0}, Lt83;-><init>(Ljava/util/List;)V

    .line 764
    .line 765
    .line 766
    invoke-direct {v11, v12}, Lpm1;-><init>(Lt83;)V

    .line 767
    .line 768
    .line 769
    invoke-direct {v3, v11}, Lwm1;-><init>(Lgm1;)V

    .line 770
    .line 771
    .line 772
    goto :goto_d

    .line 773
    :cond_1e
    const/16 v14, 0x80

    .line 774
    .line 775
    new-instance v3, Lwm1;

    .line 776
    .line 777
    new-instance v11, Lnm1;

    .line 778
    .line 779
    new-instance v12, Lt83;

    .line 780
    .line 781
    invoke-virtual {v5, v0}, Ldm1;->a(Lso1;)Ljava/util/List;

    .line 782
    .line 783
    .line 784
    move-result-object v0

    .line 785
    invoke-direct {v12, v0}, Lt83;-><init>(Ljava/util/List;)V

    .line 786
    .line 787
    .line 788
    invoke-direct {v11, v12}, Lnm1;-><init>(Lt83;)V

    .line 789
    .line 790
    .line 791
    invoke-direct {v3, v11}, Lwm1;-><init>(Lgm1;)V

    .line 792
    .line 793
    .line 794
    goto :goto_d

    .line 795
    :cond_1f
    const/16 v14, 0x80

    .line 796
    .line 797
    new-instance v0, Lwm1;

    .line 798
    .line 799
    new-instance v3, Lfm1;

    .line 800
    .line 801
    invoke-direct {v3}, Lfm1;-><init>()V

    .line 802
    .line 803
    .line 804
    invoke-direct {v0, v3}, Lwm1;-><init>(Lgm1;)V

    .line 805
    .line 806
    .line 807
    goto/16 :goto_a

    .line 808
    .line 809
    :cond_20
    move-object/from16 v12, v20

    .line 810
    .line 811
    const/16 v14, 0x80

    .line 812
    .line 813
    new-instance v3, Lwm1;

    .line 814
    .line 815
    new-instance v5, Lum1;

    .line 816
    .line 817
    invoke-virtual {v0}, Lso1;->m()I

    .line 818
    .line 819
    .line 820
    move-result v0

    .line 821
    invoke-direct {v5, v0, v12, v11}, Lum1;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 822
    .line 823
    .line 824
    invoke-direct {v3, v5}, Lwm1;-><init>(Lgm1;)V

    .line 825
    .line 826
    .line 827
    goto :goto_d

    .line 828
    :cond_21
    const/16 v14, 0x80

    .line 829
    .line 830
    const/4 v15, 0x3

    .line 831
    :cond_22
    new-instance v3, Lwm1;

    .line 832
    .line 833
    new-instance v12, Lim1;

    .line 834
    .line 835
    new-instance v13, Lxb4;

    .line 836
    .line 837
    invoke-virtual {v5, v0}, Ldm1;->a(Lso1;)Ljava/util/List;

    .line 838
    .line 839
    .line 840
    move-result-object v0

    .line 841
    const/16 v5, 0xe

    .line 842
    .line 843
    invoke-direct {v13, v5, v0}, Lxb4;-><init>(ILjava/util/List;)V

    .line 844
    .line 845
    .line 846
    invoke-direct {v12, v13, v11}, Lim1;-><init>(Lxb4;Ljava/lang/String;)V

    .line 847
    .line 848
    .line 849
    invoke-direct {v3, v12}, Lwm1;-><init>(Lgm1;)V

    .line 850
    .line 851
    .line 852
    :goto_d
    invoke-virtual {v9, v7, v7}, Landroid/util/SparseIntArray;->put(II)V

    .line 853
    .line 854
    .line 855
    invoke-virtual {v8, v7, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 856
    .line 857
    .line 858
    goto :goto_e

    .line 859
    :cond_23
    const/16 v14, 0x80

    .line 860
    .line 861
    const/4 v15, 0x3

    .line 862
    :goto_e
    move-object/from16 v0, p0

    .line 863
    .line 864
    move v11, v15

    .line 865
    move-object/from16 v5, v26

    .line 866
    .line 867
    move-object/from16 v12, v27

    .line 868
    .line 869
    const/4 v3, 0x2

    .line 870
    const/4 v7, 0x0

    .line 871
    const/16 v13, 0xd

    .line 872
    .line 873
    const/4 v14, 0x4

    .line 874
    const/16 v15, 0xc

    .line 875
    .line 876
    goto/16 :goto_0

    .line 877
    .line 878
    :cond_24
    move-object/from16 v26, v5

    .line 879
    .line 880
    invoke-virtual {v9}, Landroid/util/SparseIntArray;->size()I

    .line 881
    .line 882
    .line 883
    move-result v0

    .line 884
    const/4 v7, 0x0

    .line 885
    :goto_f
    if-ge v7, v0, :cond_26

    .line 886
    .line 887
    invoke-virtual {v9, v7}, Landroid/util/SparseIntArray;->keyAt(I)I

    .line 888
    .line 889
    .line 890
    move-result v1

    .line 891
    invoke-virtual {v9, v7}, Landroid/util/SparseIntArray;->valueAt(I)I

    .line 892
    .line 893
    .line 894
    move-result v3

    .line 895
    const/4 v5, 0x1

    .line 896
    invoke-virtual {v6, v1, v5}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 897
    .line 898
    .line 899
    iget-object v11, v2, Lgn1;->h:Landroid/util/SparseBooleanArray;

    .line 900
    .line 901
    invoke-virtual {v11, v3, v5}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 902
    .line 903
    .line 904
    invoke-virtual {v8, v7}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 905
    .line 906
    .line 907
    move-result-object v5

    .line 908
    check-cast v5, Ljn1;

    .line 909
    .line 910
    if-eqz v5, :cond_25

    .line 911
    .line 912
    new-instance v11, Lin1;

    .line 913
    .line 914
    const/16 v12, 0x2000

    .line 915
    .line 916
    invoke-direct {v11, v10, v1, v12}, Lin1;-><init>(III)V

    .line 917
    .line 918
    .line 919
    iget-object v1, v2, Lgn1;->k:Lnf1;

    .line 920
    .line 921
    invoke-interface {v5, v4, v1, v11}, Ljn1;->b(Lx13;Lnf1;Lin1;)V

    .line 922
    .line 923
    .line 924
    move-object/from16 v1, v26

    .line 925
    .line 926
    invoke-virtual {v1, v3, v5}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 927
    .line 928
    .line 929
    goto :goto_10

    .line 930
    :cond_25
    move-object/from16 v1, v26

    .line 931
    .line 932
    :goto_10
    add-int/lit8 v7, v7, 0x1

    .line 933
    .line 934
    move-object/from16 v26, v1

    .line 935
    .line 936
    goto :goto_f

    .line 937
    :cond_26
    move-object/from16 v3, p0

    .line 938
    .line 939
    move-object/from16 v1, v26

    .line 940
    .line 941
    iget v0, v3, Lpj4;->f:I

    .line 942
    .line 943
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->remove(I)V

    .line 944
    .line 945
    .line 946
    iget-object v0, v2, Lgn1;->k:Lnf1;

    .line 947
    .line 948
    invoke-interface {v0}, Lnf1;->s()V

    .line 949
    .line 950
    .line 951
    const/4 v5, 0x1

    .line 952
    iput-boolean v5, v2, Lgn1;->l:Z

    .line 953
    .line 954
    :goto_11
    return-void

    .line 955
    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    :pswitch_data_1
    .packed-switch 0x86
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
