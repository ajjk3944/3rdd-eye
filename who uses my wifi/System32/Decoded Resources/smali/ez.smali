.class public abstract Lez;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final f:Landroid/content/Context;

.field public final g:Ljava/lang/String;

.field public final h:Lgw3;

.field public final i:Lu4;

.field public final j:Lc5;

.field public final k:I

.field public final l:Lfr;

.field public final m:Ljz;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lgw3;Lu4;Ldz;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "Null context is not permitted."

    .line 5
    .line 6
    invoke-static {p1, v0}, Lou1;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const-string v0, "Api must not be null."

    .line 10
    .line 11
    invoke-static {p2, v0}, Lou1;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead."

    .line 15
    .line 16
    invoke-static {p4, v0}, Lou1;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Lez;->f:Landroid/content/Context;

    .line 24
    .line 25
    invoke-static {}, Lob1;->m()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const/4 v1, 0x0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    :try_start_0
    const-class v0, Landroid/content/Context;

    .line 33
    .line 34
    const-string v2, "getAttributionTag"

    .line 35
    .line 36
    invoke-virtual {v0, v2, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    .line 46
    move-object v1, p1

    .line 47
    :catch_0
    :cond_0
    iput-object v1, p0, Lez;->g:Ljava/lang/String;

    .line 48
    .line 49
    iput-object p2, p0, Lez;->h:Lgw3;

    .line 50
    .line 51
    iput-object p3, p0, Lez;->i:Lu4;

    .line 52
    .line 53
    new-instance p1, Lc5;

    .line 54
    .line 55
    invoke-direct {p1, p2, p3, v1}, Lc5;-><init>(Lgw3;Lu4;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    iput-object p1, p0, Lez;->j:Lc5;

    .line 59
    .line 60
    new-instance p1, Lac1;

    .line 61
    .line 62
    iget-object p1, p0, Lez;->f:Landroid/content/Context;

    .line 63
    .line 64
    invoke-static {p1}, Ljz;->e(Landroid/content/Context;)Ljz;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iput-object p1, p0, Lez;->m:Ljz;

    .line 69
    .line 70
    iget-object p2, p1, Ljz;->m:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 71
    .line 72
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    iput p2, p0, Lez;->k:I

    .line 77
    .line 78
    iget-object p2, p4, Ldz;->a:Lfr;

    .line 79
    .line 80
    iput-object p2, p0, Lez;->l:Lfr;

    .line 81
    .line 82
    iget-object p1, p1, Ljz;->r:Lwc1;

    .line 83
    .line 84
    const/4 p2, 0x7

    .line 85
    invoke-virtual {p1, p2, p0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    invoke-virtual {p1, p2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 90
    .line 91
    .line 92
    return-void
.end method


# virtual methods
.method public final a()Lxb4;
    .locals 4

    .line 1
    new-instance v0, Lxb4;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1}, Lxb4;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 8
    .line 9
    iget-object v2, v0, Lxb4;->g:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lu8;

    .line 12
    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    new-instance v2, Lu8;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v2, v3}, Lu8;-><init>(I)V

    .line 19
    .line 20
    .line 21
    iput-object v2, v0, Lxb4;->g:Ljava/lang/Object;

    .line 22
    .line 23
    :cond_0
    iget-object v2, v0, Lxb4;->g:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v2, Lu8;

    .line 26
    .line 27
    invoke-virtual {v2, v1}, Lu8;->addAll(Ljava/util/Collection;)Z

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lez;->f:Landroid/content/Context;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    iput-object v2, v0, Lxb4;->i:Ljava/lang/Object;

    .line 41
    .line 42
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    iput-object v1, v0, Lxb4;->h:Ljava/lang/Object;

    .line 47
    .line 48
    return-object v0
.end method

.method public final b(ILrb;)Lgi4;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    new-instance v2, Lk01;

    .line 6
    .line 7
    invoke-direct {v2}, Lk01;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v3, v2, Lk01;->a:Lgi4;

    .line 11
    .line 12
    iget-object v5, v0, Lez;->m:Ljz;

    .line 13
    .line 14
    iget-object v12, v0, Lez;->l:Lfr;

    .line 15
    .line 16
    iget-object v13, v5, Ljz;->r:Lwc1;

    .line 17
    .line 18
    iget v6, v1, Lrb;->b:I

    .line 19
    .line 20
    if-eqz v6, :cond_8

    .line 21
    .line 22
    iget-object v7, v0, Lez;->j:Lc5;

    .line 23
    .line 24
    invoke-virtual {v5}, Ljz;->a()Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    const/4 v8, 0x0

    .line 29
    if-nez v4, :cond_0

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_0
    invoke-static {}, Lsq0;->k()Lsq0;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    iget-object v4, v4, Lsq0;->g:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v4, Ltq0;

    .line 39
    .line 40
    const/4 v9, 0x1

    .line 41
    if-eqz v4, :cond_5

    .line 42
    .line 43
    iget-boolean v10, v4, Ltq0;->g:Z

    .line 44
    .line 45
    if-nez v10, :cond_1

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_1
    iget-boolean v4, v4, Ltq0;->h:Z

    .line 49
    .line 50
    iget-object v10, v5, Ljz;->o:Ljava/util/concurrent/ConcurrentHashMap;

    .line 51
    .line 52
    invoke-virtual {v10, v7}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v10

    .line 56
    check-cast v10, Lxb1;

    .line 57
    .line 58
    if-eqz v10, :cond_4

    .line 59
    .line 60
    iget-object v11, v10, Lxb1;->g:Lv4;

    .line 61
    .line 62
    instance-of v14, v11, Lw9;

    .line 63
    .line 64
    if-nez v14, :cond_2

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_2
    check-cast v11, Lw9;

    .line 68
    .line 69
    iget-object v14, v11, Lw9;->v:Leb4;

    .line 70
    .line 71
    if-eqz v14, :cond_4

    .line 72
    .line 73
    invoke-virtual {v11}, Lw9;->f()Z

    .line 74
    .line 75
    .line 76
    move-result v14

    .line 77
    if-nez v14, :cond_4

    .line 78
    .line 79
    invoke-static {v10, v11, v6}, Lhc1;->a(Lxb1;Lw9;I)Lsh;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    if-nez v4, :cond_3

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_3
    iget v8, v10, Lxb1;->q:I

    .line 87
    .line 88
    add-int/2addr v8, v9

    .line 89
    iput v8, v10, Lxb1;->q:I

    .line 90
    .line 91
    iget-boolean v9, v4, Lsh;->h:Z

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_4
    move v9, v4

    .line 95
    :cond_5
    :goto_0
    new-instance v4, Lhc1;

    .line 96
    .line 97
    const-wide/16 v10, 0x0

    .line 98
    .line 99
    if-eqz v9, :cond_6

    .line 100
    .line 101
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 102
    .line 103
    .line 104
    move-result-wide v14

    .line 105
    goto :goto_1

    .line 106
    :cond_6
    move-wide v14, v10

    .line 107
    :goto_1
    if-eqz v9, :cond_7

    .line 108
    .line 109
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 110
    .line 111
    .line 112
    move-result-wide v10

    .line 113
    :cond_7
    move-wide v8, v14

    .line 114
    invoke-direct/range {v4 .. v11}, Lhc1;-><init>(Ljz;ILc5;JJ)V

    .line 115
    .line 116
    .line 117
    move-object v8, v4

    .line 118
    :goto_2
    if-eqz v8, :cond_8

    .line 119
    .line 120
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    new-instance v4, Lvb1;

    .line 124
    .line 125
    const/4 v6, 0x0

    .line 126
    invoke-direct {v4, v13, v6}, Lvb1;-><init>(Landroid/os/Handler;I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    new-instance v6, Lmn2;

    .line 133
    .line 134
    invoke-direct {v6, v4, v8}, Lmn2;-><init>(Ljava/util/concurrent/Executor;Ldj0;)V

    .line 135
    .line 136
    .line 137
    iget-object v4, v3, Lgi4;->b:Lwy0;

    .line 138
    .line 139
    invoke-virtual {v4, v6}, Lwy0;->c(Lje4;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v3}, Lgi4;->h()V

    .line 143
    .line 144
    .line 145
    :cond_8
    new-instance v4, Lpc1;

    .line 146
    .line 147
    move/from16 v6, p1

    .line 148
    .line 149
    invoke-direct {v4, v6, v1, v2, v12}, Lpc1;-><init>(ILrb;Lk01;Lfr;)V

    .line 150
    .line 151
    .line 152
    new-instance v1, Ljc1;

    .line 153
    .line 154
    iget-object v2, v5, Ljz;->n:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 155
    .line 156
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 157
    .line 158
    .line 159
    move-result v2

    .line 160
    invoke-direct {v1, v4, v2, v0}, Ljc1;-><init>(Lpc1;ILez;)V

    .line 161
    .line 162
    .line 163
    const/4 v2, 0x4

    .line 164
    invoke-virtual {v13, v2, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-virtual {v13, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 169
    .line 170
    .line 171
    return-object v3
.end method
