.class public final Lps1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lrs1;


# static fields
.field public static w:Lps1;


# instance fields
.field public final f:Landroid/content/Context;

.field public final g:Lmc2;

.field public final h:Lde3;

.field public final i:Lfe3;

.field public final j:Lft1;

.field public final k:Lgd3;

.field public final l:Ljava/util/concurrent/Executor;

.field public final m:Lav1;

.field public final n:Lus0;

.field public final o:Ljava/util/concurrent/CountDownLatch;

.field public final p:Lpt1;

.field public final q:Lxe1;

.field public final r:Ldm1;

.field public volatile s:J

.field public final t:Ljava/lang/Object;

.field public volatile u:Z

.field public volatile v:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lgd3;Lmc2;Lde3;Lfe3;Lft1;Ljava/util/concurrent/Executor;Lfd3;Lav1;Lpt1;Lxe1;Ldm1;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, Lps1;->s:J

    .line 7
    .line 8
    new-instance p8, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-direct {p8}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p8, p0, Lps1;->t:Ljava/lang/Object;

    .line 14
    .line 15
    const/4 p8, 0x0

    .line 16
    iput-boolean p8, p0, Lps1;->v:Z

    .line 17
    .line 18
    iput-object p1, p0, Lps1;->f:Landroid/content/Context;

    .line 19
    .line 20
    iput-object p2, p0, Lps1;->k:Lgd3;

    .line 21
    .line 22
    iput-object p3, p0, Lps1;->g:Lmc2;

    .line 23
    .line 24
    iput-object p4, p0, Lps1;->h:Lde3;

    .line 25
    .line 26
    iput-object p5, p0, Lps1;->i:Lfe3;

    .line 27
    .line 28
    iput-object p6, p0, Lps1;->j:Lft1;

    .line 29
    .line 30
    iput-object p7, p0, Lps1;->l:Ljava/util/concurrent/Executor;

    .line 31
    .line 32
    iput-object p9, p0, Lps1;->m:Lav1;

    .line 33
    .line 34
    iput-object p10, p0, Lps1;->p:Lpt1;

    .line 35
    .line 36
    iput-object p11, p0, Lps1;->q:Lxe1;

    .line 37
    .line 38
    iput-object p12, p0, Lps1;->r:Ldm1;

    .line 39
    .line 40
    iput-boolean p8, p0, Lps1;->v:Z

    .line 41
    .line 42
    new-instance p1, Ljava/util/concurrent/CountDownLatch;

    .line 43
    .line 44
    const/4 p2, 0x1

    .line 45
    invoke-direct {p1, p2}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, Lps1;->o:Ljava/util/concurrent/CountDownLatch;

    .line 49
    .line 50
    new-instance p1, Lus0;

    .line 51
    .line 52
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object p1, p0, Lps1;->n:Lus0;

    .line 56
    .line 57
    return-void
.end method

.method public static declared-synchronized m(Landroid/content/Context;Ljava/util/concurrent/ExecutorService;Lid3;Z)Lps1;
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    const-class v13, Lps1;

    .line 6
    .line 7
    monitor-enter v13

    .line 8
    :try_start_0
    sget-object v0, Lps1;->w:Lps1;

    .line 9
    .line 10
    if-nez v0, :cond_4

    .line 11
    .line 12
    move/from16 v0, p3

    .line 13
    .line 14
    invoke-static {v1, v7, v0}, Lgd3;->a(Landroid/content/Context;Ljava/util/concurrent/Executor;Z)Lgd3;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    sget-object v0, Lmz1;->J3:Liz1;

    .line 19
    .line 20
    sget-object v3, Ltw1;->e:Ltw1;

    .line 21
    .line 22
    iget-object v4, v3, Ltw1;->c:Lkz1;

    .line 23
    .line 24
    invoke-virtual {v4, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/4 v4, 0x0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    invoke-static {v1}, Lzs1;->D(Landroid/content/Context;)Lzs1;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    move-object/from16 v19, v0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception v0

    .line 45
    goto/16 :goto_3

    .line 46
    .line 47
    :cond_0
    move-object/from16 v19, v4

    .line 48
    .line 49
    :goto_0
    sget-object v0, Lmz1;->K3:Liz1;

    .line 50
    .line 51
    iget-object v5, v3, Ltw1;->c:Lkz1;

    .line 52
    .line 53
    invoke-virtual {v5, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Ljava/lang/Boolean;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_1

    .line 64
    .line 65
    invoke-static/range {p0 .. p1}, Lpt1;->a(Landroid/content/Context;Ljava/util/concurrent/Executor;)Lpt1;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    move-object/from16 v20, v0

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    move-object/from16 v20, v4

    .line 73
    .line 74
    :goto_1
    sget-object v0, Lmz1;->S2:Liz1;

    .line 75
    .line 76
    iget-object v5, v3, Ltw1;->c:Lkz1;

    .line 77
    .line 78
    invoke-virtual {v5, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    check-cast v0, Ljava/lang/Boolean;

    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_2

    .line 89
    .line 90
    new-instance v0, Lxe1;

    .line 91
    .line 92
    invoke-direct {v0}, Lxe1;-><init>()V

    .line 93
    .line 94
    .line 95
    move-object/from16 v21, v0

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_2
    move-object/from16 v21, v4

    .line 99
    .line 100
    :goto_2
    sget-object v0, Lmz1;->b3:Liz1;

    .line 101
    .line 102
    iget-object v5, v3, Ltw1;->c:Lkz1;

    .line 103
    .line 104
    invoke-virtual {v5, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    check-cast v0, Ljava/lang/Boolean;

    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-eqz v0, :cond_3

    .line 115
    .line 116
    new-instance v4, Ldm1;

    .line 117
    .line 118
    invoke-direct {v4}, Ldm1;-><init>()V

    .line 119
    .line 120
    .line 121
    :cond_3
    move-object v12, v4

    .line 122
    invoke-static {v1, v7, v2}, Lp21;->x(Landroid/content/Context;Ljava/util/concurrent/Executor;Lgd3;)Lp21;

    .line 123
    .line 124
    .line 125
    move-result-object v16

    .line 126
    new-instance v0, Let1;

    .line 127
    .line 128
    invoke-direct {v0, v1}, Let1;-><init>(Landroid/content/Context;)V

    .line 129
    .line 130
    .line 131
    new-instance v4, Lnt1;

    .line 132
    .line 133
    invoke-direct {v4, v1, v0}, Lnt1;-><init>(Landroid/content/Context;Let1;)V

    .line 134
    .line 135
    .line 136
    new-instance v14, Lft1;

    .line 137
    .line 138
    move-object/from16 v15, p2

    .line 139
    .line 140
    move-object/from16 v18, v0

    .line 141
    .line 142
    move-object/from16 v17, v4

    .line 143
    .line 144
    move-object/from16 v22, v12

    .line 145
    .line 146
    invoke-direct/range {v14 .. v22}, Lft1;-><init>(Lid3;Lp21;Lnt1;Let1;Lzs1;Lpt1;Lxe1;Ldm1;)V

    .line 147
    .line 148
    .line 149
    move-object/from16 v12, v22

    .line 150
    .line 151
    invoke-static {v1, v2}, Lgi2;->J(Landroid/content/Context;Lgd3;)Lav1;

    .line 152
    .line 153
    .line 154
    move-result-object v9

    .line 155
    new-instance v4, Lfd3;

    .line 156
    .line 157
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 158
    .line 159
    .line 160
    new-instance v6, Lps1;

    .line 161
    .line 162
    new-instance v8, Lmc2;

    .line 163
    .line 164
    invoke-direct {v8, v1, v9}, Lmc2;-><init>(Landroid/content/Context;Lav1;)V

    .line 165
    .line 166
    .line 167
    new-instance v10, Lde3;

    .line 168
    .line 169
    new-instance v0, Lug0;

    .line 170
    .line 171
    const/16 v5, 0xd

    .line 172
    .line 173
    invoke-direct {v0, v5, v2}, Lug0;-><init>(ILjava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    sget-object v5, Lmz1;->C2:Liz1;

    .line 177
    .line 178
    iget-object v3, v3, Ltw1;->c:Lkz1;

    .line 179
    .line 180
    invoke-virtual {v3, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    check-cast v3, Ljava/lang/Boolean;

    .line 185
    .line 186
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    invoke-direct {v10, v1, v9, v0, v3}, Lde3;-><init>(Landroid/content/Context;Lav1;Lsd3;Z)V

    .line 191
    .line 192
    .line 193
    new-instance v0, Lfe3;

    .line 194
    .line 195
    const/4 v5, 0x0

    .line 196
    move-object v3, v2

    .line 197
    move-object v2, v14

    .line 198
    invoke-direct/range {v0 .. v5}, Lfe3;-><init>(Landroid/content/Context;Lge3;Lgd3;Lfd3;Z)V

    .line 199
    .line 200
    .line 201
    move-object/from16 v1, p0

    .line 202
    .line 203
    move-object v5, v0

    .line 204
    move-object v0, v6

    .line 205
    move-object/from16 v11, v21

    .line 206
    .line 207
    move-object v6, v2

    .line 208
    move-object v2, v3

    .line 209
    move-object v3, v8

    .line 210
    move-object v8, v4

    .line 211
    move-object v4, v10

    .line 212
    move-object/from16 v10, v20

    .line 213
    .line 214
    invoke-direct/range {v0 .. v12}, Lps1;-><init>(Landroid/content/Context;Lgd3;Lmc2;Lde3;Lfe3;Lft1;Ljava/util/concurrent/Executor;Lfd3;Lav1;Lpt1;Lxe1;Ldm1;)V

    .line 215
    .line 216
    .line 217
    sput-object v0, Lps1;->w:Lps1;

    .line 218
    .line 219
    invoke-virtual {v0}, Lps1;->j()V

    .line 220
    .line 221
    .line 222
    sget-object v0, Lps1;->w:Lps1;

    .line 223
    .line 224
    invoke-virtual {v0}, Lps1;->k()V

    .line 225
    .line 226
    .line 227
    :cond_4
    sget-object v0, Lps1;->w:Lps1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 228
    .line 229
    monitor-exit v13

    .line 230
    return-object v0

    .line 231
    :goto_3
    :try_start_1
    monitor-exit v13
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 232
    throw v0
.end method


# virtual methods
.method public final a(III)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lmz1;->Lc:Liz1;

    .line 4
    .line 5
    sget-object v2, Ltw1;->e:Ltw1;

    .line 6
    .line 7
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 8
    .line 9
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    iget-object v1, v0, Lps1;->f:Landroid/content/Context;

    .line 22
    .line 23
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move/from16 v2, p1

    .line 35
    .line 36
    int-to-float v2, v2

    .line 37
    iget v3, v1, Landroid/util/DisplayMetrics;->density:F

    .line 38
    .line 39
    mul-float v9, v2, v3

    .line 40
    .line 41
    move/from16 v4, p2

    .line 42
    .line 43
    int-to-float v4, v4

    .line 44
    mul-float v10, v4, v3

    .line 45
    .line 46
    const/16 v16, 0x0

    .line 47
    .line 48
    const/16 v17, 0x0

    .line 49
    .line 50
    move v3, v4

    .line 51
    const-wide/16 v4, 0x0

    .line 52
    .line 53
    const-wide/16 v6, 0x0

    .line 54
    .line 55
    const/4 v8, 0x0

    .line 56
    const/4 v11, 0x0

    .line 57
    const/4 v12, 0x0

    .line 58
    const/4 v13, 0x0

    .line 59
    const/4 v14, 0x0

    .line 60
    const/4 v15, 0x0

    .line 61
    invoke-static/range {v4 .. v17}, Landroid/view/MotionEvent;->obtain(JJIFFFFIFFII)Landroid/view/MotionEvent;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-virtual {v0, v4}, Lps1;->f(Landroid/view/MotionEvent;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4}, Landroid/view/MotionEvent;->recycle()V

    .line 69
    .line 70
    .line 71
    iget v4, v1, Landroid/util/DisplayMetrics;->density:F

    .line 72
    .line 73
    mul-float v10, v2, v4

    .line 74
    .line 75
    mul-float v11, v3, v4

    .line 76
    .line 77
    const/16 v18, 0x0

    .line 78
    .line 79
    const-wide/16 v5, 0x0

    .line 80
    .line 81
    const-wide/16 v7, 0x0

    .line 82
    .line 83
    const/4 v9, 0x2

    .line 84
    const/4 v13, 0x0

    .line 85
    const/4 v14, 0x0

    .line 86
    const/16 v16, 0x0

    .line 87
    .line 88
    invoke-static/range {v5 .. v18}, Landroid/view/MotionEvent;->obtain(JJIFFFFIFFII)Landroid/view/MotionEvent;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    invoke-virtual {v0, v4}, Lps1;->f(Landroid/view/MotionEvent;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v4}, Landroid/view/MotionEvent;->recycle()V

    .line 96
    .line 97
    .line 98
    move/from16 v4, p3

    .line 99
    .line 100
    int-to-long v6, v4

    .line 101
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 102
    .line 103
    mul-float v9, v2, v1

    .line 104
    .line 105
    mul-float v10, v3, v1

    .line 106
    .line 107
    const/16 v16, 0x0

    .line 108
    .line 109
    const-wide/16 v4, 0x0

    .line 110
    .line 111
    const/4 v8, 0x1

    .line 112
    const/4 v11, 0x0

    .line 113
    const/4 v13, 0x0

    .line 114
    const/4 v14, 0x0

    .line 115
    invoke-static/range {v4 .. v17}, Landroid/view/MotionEvent;->obtain(JJIFFFFIFFII)Landroid/view/MotionEvent;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-virtual {v0, v1}, Lps1;->f(Landroid/view/MotionEvent;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V

    .line 123
    .line 124
    .line 125
    :cond_1
    :goto_0
    return-void
.end method

.method public final b(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    .line 1
    const-string p1, "19"

    .line 2
    .line 3
    return-object p1
.end method

.method public final c([Ljava/lang/StackTraceElement;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lps1;->r:Ldm1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    new-instance v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    iput-object v1, v0, Ldm1;->a:Ljava/util/List;

    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final d(Landroid/content/Context;)Ljava/lang/String;
    .locals 10

    .line 1
    iget-object v0, p0, Lps1;->p:Lpt1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v1, v0, Lpt1;->d:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    iput-wide v1, v0, Lpt1;->b:J

    .line 14
    .line 15
    :cond_0
    sget-object v0, Lmz1;->S2:Liz1;

    .line 16
    .line 17
    sget-object v1, Ltw1;->e:Ltw1;

    .line 18
    .line 19
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Ljava/lang/Boolean;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    iget-object v0, p0, Lps1;->q:Lxe1;

    .line 34
    .line 35
    iget-wide v1, v0, Lxe1;->a:J

    .line 36
    .line 37
    iput-wide v1, v0, Lxe1;->b:J

    .line 38
    .line 39
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 40
    .line 41
    .line 42
    move-result-wide v1

    .line 43
    iput-wide v1, v0, Lxe1;->a:J

    .line 44
    .line 45
    :cond_1
    invoke-virtual {p0}, Lps1;->k()V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lps1;->i:Lfe3;

    .line 49
    .line 50
    invoke-virtual {v0}, Lfe3;->b()Lde3;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-eqz v0, :cond_2

    .line 55
    .line 56
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 57
    .line 58
    .line 59
    move-result-wide v1

    .line 60
    invoke-virtual {v0, p1}, Lde3;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v8

    .line 64
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 65
    .line 66
    .line 67
    move-result-wide v3

    .line 68
    sub-long v5, v3, v1

    .line 69
    .line 70
    const/4 v7, 0x0

    .line 71
    const/4 v9, 0x0

    .line 72
    iget-object v3, p0, Lps1;->k:Lgd3;

    .line 73
    .line 74
    const/16 v4, 0x1389

    .line 75
    .line 76
    invoke-virtual/range {v3 .. v9}, Lgd3;->e(IJLjava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)Lgi4;

    .line 77
    .line 78
    .line 79
    return-object v8

    .line 80
    :cond_2
    const-string p1, ""

    .line 81
    .line 82
    return-object p1
.end method

.method public final e(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lps1;->j:Lft1;

    .line 2
    .line 3
    iget-object v0, v0, Lft1;->c:Lnt1;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lnt1;->a(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final f(Landroid/view/MotionEvent;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lps1;->i:Lfe3;

    .line 2
    .line 3
    invoke-virtual {v0}, Lfe3;->b()Lde3;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    :try_start_0
    invoke-virtual {v0, p1}, Lde3;->i(Landroid/view/MotionEvent;)V
    :try_end_0
    .catch Lee3; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catch_0
    move-exception p1

    .line 14
    iget v0, p1, Lee3;->f:I

    .line 15
    .line 16
    const-wide/16 v1, -0x1

    .line 17
    .line 18
    iget-object v3, p0, Lps1;->k:Lgd3;

    .line 19
    .line 20
    invoke-virtual {v3, v0, v1, v2, p1}, Lgd3;->c(IJLjava/lang/Exception;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public final g(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;)Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, p3, v0}, Lps1;->h(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    return-object p1
.end method

.method public final h(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;
    .locals 10

    .line 1
    iget-object v0, p0, Lps1;->p:Lpt1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v1, v0, Lpt1;->d:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    iput-wide v1, v0, Lpt1;->b:J

    .line 14
    .line 15
    :cond_0
    sget-object v0, Lmz1;->S2:Liz1;

    .line 16
    .line 17
    sget-object v1, Ltw1;->e:Ltw1;

    .line 18
    .line 19
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Ljava/lang/Boolean;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    iget-object v0, p0, Lps1;->q:Lxe1;

    .line 34
    .line 35
    iget-wide v1, v0, Lxe1;->g:J

    .line 36
    .line 37
    iput-wide v1, v0, Lxe1;->h:J

    .line 38
    .line 39
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 40
    .line 41
    .line 42
    move-result-wide v1

    .line 43
    iput-wide v1, v0, Lxe1;->g:J

    .line 44
    .line 45
    :cond_1
    invoke-virtual {p0}, Lps1;->k()V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lps1;->i:Lfe3;

    .line 49
    .line 50
    invoke-virtual {v0}, Lfe3;->b()Lde3;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-eqz v0, :cond_2

    .line 55
    .line 56
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 57
    .line 58
    .line 59
    move-result-wide v1

    .line 60
    invoke-virtual {v0, p1, p2, p3, p4}, Lde3;->h(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v8

    .line 64
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 65
    .line 66
    .line 67
    move-result-wide p1

    .line 68
    sub-long v5, p1, v1

    .line 69
    .line 70
    const/4 v7, 0x0

    .line 71
    const/4 v9, 0x0

    .line 72
    iget-object v3, p0, Lps1;->k:Lgd3;

    .line 73
    .line 74
    const/16 v4, 0x1388

    .line 75
    .line 76
    invoke-virtual/range {v3 .. v9}, Lgd3;->e(IJLjava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)Lgi4;

    .line 77
    .line 78
    .line 79
    return-object v8

    .line 80
    :cond_2
    const-string p1, ""

    .line 81
    .line 82
    return-object p1
.end method

.method public final i(Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;
    .locals 10

    .line 1
    iget-object v0, p0, Lps1;->p:Lpt1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v1, v0, Lpt1;->d:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    iput-wide v1, v0, Lpt1;->b:J

    .line 14
    .line 15
    :cond_0
    sget-object v0, Lmz1;->S2:Liz1;

    .line 16
    .line 17
    sget-object v1, Ltw1;->e:Ltw1;

    .line 18
    .line 19
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Ljava/lang/Boolean;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    iget-object v0, p0, Lps1;->q:Lxe1;

    .line 34
    .line 35
    invoke-virtual {v0, p1, p2}, Lxe1;->b(Landroid/content/Context;Landroid/view/View;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    invoke-virtual {p0}, Lps1;->k()V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lps1;->i:Lfe3;

    .line 42
    .line 43
    invoke-virtual {v0}, Lfe3;->b()Lde3;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 50
    .line 51
    .line 52
    move-result-wide v1

    .line 53
    invoke-virtual {v0, p1, p2, p3}, Lde3;->e(Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 58
    .line 59
    .line 60
    move-result-wide p1

    .line 61
    sub-long v5, p1, v1

    .line 62
    .line 63
    const/4 v7, 0x0

    .line 64
    const/4 v9, 0x0

    .line 65
    iget-object v3, p0, Lps1;->k:Lgd3;

    .line 66
    .line 67
    const/16 v4, 0x138a

    .line 68
    .line 69
    invoke-virtual/range {v3 .. v9}, Lgd3;->e(IJLjava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)Lgi4;

    .line 70
    .line 71
    .line 72
    return-object v8

    .line 73
    :cond_2
    const-string p1, ""

    .line 74
    .line 75
    return-object p1
.end method

.method public final declared-synchronized j()V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 3
    .line 4
    .line 5
    move-result-wide v0

    .line 6
    invoke-virtual {p0}, Lps1;->n()Lg4;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lps1;->i:Lfe3;

    .line 13
    .line 14
    invoke-virtual {v0, v2}, Lfe3;->a(Lg4;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    iput-boolean v0, p0, Lps1;->v:Z

    .line 22
    .line 23
    iget-object v0, p0, Lps1;->o:Ljava/util/concurrent/CountDownLatch;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    monitor-exit p0

    .line 29
    return-void

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    monitor-exit p0

    .line 33
    return-void

    .line 34
    :cond_1
    :try_start_1
    iget-object v2, p0, Lps1;->k:Lgd3;

    .line 35
    .line 36
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 37
    .line 38
    .line 39
    move-result-wide v3

    .line 40
    sub-long/2addr v3, v0

    .line 41
    const/16 v0, 0xfad

    .line 42
    .line 43
    invoke-virtual {v2, v0, v3, v4}, Lgd3;->b(IJ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    .line 45
    .line 46
    monitor-exit p0

    .line 47
    return-void

    .line 48
    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 49
    throw v0
.end method

.method public final k()V
    .locals 9

    .line 1
    iget-boolean v0, p0, Lps1;->u:Z

    .line 2
    .line 3
    if-nez v0, :cond_4

    .line 4
    .line 5
    iget-object v0, p0, Lps1;->t:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-boolean v1, p0, Lps1;->u:Z

    .line 9
    .line 10
    if-nez v1, :cond_3

    .line 11
    .line 12
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    const-wide/16 v3, 0x3e8

    .line 17
    .line 18
    div-long/2addr v1, v3

    .line 19
    iget-wide v5, p0, Lps1;->s:J

    .line 20
    .line 21
    sub-long/2addr v1, v5

    .line 22
    const-wide/16 v5, 0xe10

    .line 23
    .line 24
    cmp-long v1, v1, v5

    .line 25
    .line 26
    if-gez v1, :cond_0

    .line 27
    .line 28
    monitor-exit v0

    .line 29
    return-void

    .line 30
    :catchall_0
    move-exception v1

    .line 31
    goto :goto_3

    .line 32
    :cond_0
    iget-object v1, p0, Lps1;->i:Lfe3;

    .line 33
    .line 34
    iget-object v2, v1, Lfe3;->g:Ljava/lang/Object;

    .line 35
    .line 36
    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    :try_start_1
    iget-object v1, v1, Lfe3;->f:Lde3;

    .line 38
    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    iget-object v1, v1, Lde3;->h:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, Lg4;

    .line 44
    .line 45
    monitor-exit v2

    .line 46
    goto :goto_0

    .line 47
    :catchall_1
    move-exception v1

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 50
    const/4 v1, 0x0

    .line 51
    :goto_0
    if-eqz v1, :cond_2

    .line 52
    .line 53
    :try_start_2
    iget-object v1, v1, Lg4;->g:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v1, Lfv1;

    .line 56
    .line 57
    invoke-virtual {v1}, Lfv1;->C()J

    .line 58
    .line 59
    .line 60
    move-result-wide v1

    .line 61
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 62
    .line 63
    .line 64
    move-result-wide v7

    .line 65
    div-long/2addr v7, v3

    .line 66
    sub-long/2addr v1, v7

    .line 67
    cmp-long v1, v1, v5

    .line 68
    .line 69
    if-gez v1, :cond_3

    .line 70
    .line 71
    :cond_2
    iget-object v1, p0, Lps1;->m:Lav1;

    .line 72
    .line 73
    invoke-static {v1}, Lgi2;->H(Lav1;)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_3

    .line 78
    .line 79
    iget-object v1, p0, Lps1;->l:Ljava/util/concurrent/Executor;

    .line 80
    .line 81
    new-instance v2, La9;

    .line 82
    .line 83
    const/16 v3, 0x1a

    .line 84
    .line 85
    invoke-direct {v2, v3, p0}, La9;-><init>(ILjava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 89
    .line 90
    .line 91
    goto :goto_2

    .line 92
    :goto_1
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 93
    :try_start_4
    throw v1

    .line 94
    :cond_3
    :goto_2
    monitor-exit v0

    .line 95
    return-void

    .line 96
    :goto_3
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 97
    throw v1

    .line 98
    :cond_4
    return-void
.end method

.method public final l()V
    .locals 7

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p0}, Lps1;->n()Lg4;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    iget-object v3, v2, Lg4;->g:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, Lfv1;

    .line 14
    .line 15
    invoke-virtual {v3}, Lfv1;->A()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    iget-object v2, v2, Lg4;->g:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Lfv1;

    .line 22
    .line 23
    invoke-virtual {v2}, Lfv1;->B()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v3, 0x0

    .line 29
    move-object v2, v3

    .line 30
    :goto_0
    :try_start_0
    iget-object v4, p0, Lps1;->f:Landroid/content/Context;

    .line 31
    .line 32
    iget-object v5, p0, Lps1;->m:Lav1;

    .line 33
    .line 34
    iget-object v6, p0, Lps1;->k:Lgd3;

    .line 35
    .line 36
    invoke-static {v4, v5, v3, v2, v6}, Lbd2;->G(Landroid/content/Context;Lav1;Ljava/lang/String;Ljava/lang/String;Lgd3;)Lce3;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    iget-object v3, v2, Lce3;->g:[B

    .line 41
    .line 42
    if-eqz v3, :cond_b

    .line 43
    .line 44
    array-length v4, v3
    :try_end_0
    .catch La64; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    if-nez v4, :cond_1

    .line 46
    .line 47
    goto/16 :goto_4

    .line 48
    .line 49
    :cond_1
    const/4 v5, 0x0

    .line 50
    :try_start_1
    invoke-static {v3, v5, v4}, La54;->n([BII)Ly44;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    sget-object v4, Lh54;->a:Lh54;

    .line 55
    .line 56
    sget v4, Lu44;->a:I

    .line 57
    .line 58
    sget-object v4, Lh54;->b:Lh54;

    .line 59
    .line 60
    invoke-static {v3, v4}, Lbv1;->D(Ly44;Lh54;)Lbv1;

    .line 61
    .line 62
    .line 63
    move-result-object v3
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_1
    .catch La64; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 64
    :try_start_2
    invoke-virtual {v3}, Lbv1;->A()Lfv1;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-virtual {v4}, Lfv1;->A()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    if-nez v4, :cond_a

    .line 77
    .line 78
    invoke-virtual {v3}, Lbv1;->A()Lfv1;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-virtual {v4}, Lfv1;->B()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-nez v4, :cond_a

    .line 91
    .line 92
    invoke-virtual {v3}, Lbv1;->C()La54;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    invoke-virtual {v4}, La54;->p()[B

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    array-length v4, v4

    .line 101
    if-nez v4, :cond_2

    .line 102
    .line 103
    goto/16 :goto_3

    .line 104
    .line 105
    :cond_2
    invoke-virtual {p0}, Lps1;->n()Lg4;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    if-nez v4, :cond_3

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_3
    iget-object v4, v4, Lg4;->g:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v4, Lfv1;

    .line 115
    .line 116
    if-eqz v4, :cond_4

    .line 117
    .line 118
    invoke-virtual {v3}, Lbv1;->A()Lfv1;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    invoke-virtual {v5}, Lfv1;->A()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    invoke-virtual {v4}, Lfv1;->A()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v6

    .line 130
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    if-eqz v5, :cond_4

    .line 135
    .line 136
    invoke-virtual {v3}, Lbv1;->A()Lfv1;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    invoke-virtual {v5}, Lfv1;->B()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    invoke-virtual {v4}, Lfv1;->B()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v4

    .line 152
    if-nez v4, :cond_a

    .line 153
    .line 154
    goto :goto_1

    .line 155
    :catchall_0
    move-exception v0

    .line 156
    goto/16 :goto_7

    .line 157
    .line 158
    :catch_0
    move-exception v2

    .line 159
    goto/16 :goto_5

    .line 160
    .line 161
    :cond_4
    :goto_1
    iget-object v4, p0, Lps1;->n:Lus0;

    .line 162
    .line 163
    iget v2, v2, Lce3;->h:I

    .line 164
    .line 165
    sget-object v5, Lmz1;->A2:Liz1;

    .line 166
    .line 167
    sget-object v6, Ltw1;->e:Ltw1;

    .line 168
    .line 169
    iget-object v6, v6, Ltw1;->c:Lkz1;

    .line 170
    .line 171
    invoke-virtual {v6, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    check-cast v5, Ljava/lang/Boolean;

    .line 176
    .line 177
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 178
    .line 179
    .line 180
    move-result v5

    .line 181
    if-eqz v5, :cond_6

    .line 182
    .line 183
    const/4 v5, 0x3

    .line 184
    if-ne v2, v5, :cond_5

    .line 185
    .line 186
    iget-object v2, p0, Lps1;->h:Lde3;

    .line 187
    .line 188
    invoke-virtual {v2, v3}, Lde3;->g(Lbv1;)Z

    .line 189
    .line 190
    .line 191
    move-result v2

    .line 192
    goto :goto_2

    .line 193
    :cond_5
    const/4 v5, 0x4

    .line 194
    if-ne v2, v5, :cond_7

    .line 195
    .line 196
    iget-object v2, p0, Lps1;->h:Lde3;

    .line 197
    .line 198
    invoke-virtual {v2, v3, v4}, Lde3;->d(Lbv1;Lus0;)Z

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    goto :goto_2

    .line 203
    :cond_6
    iget-object v2, p0, Lps1;->g:Lmc2;

    .line 204
    .line 205
    invoke-virtual {v2, v3, v4}, Lmc2;->j(Lbv1;Lus0;)Z

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    :goto_2
    if-nez v2, :cond_8

    .line 210
    .line 211
    :cond_7
    iget-object v2, p0, Lps1;->k:Lgd3;

    .line 212
    .line 213
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 214
    .line 215
    .line 216
    move-result-wide v3

    .line 217
    sub-long/2addr v3, v0

    .line 218
    const/16 v5, 0xfa9

    .line 219
    .line 220
    invoke-virtual {v2, v5, v3, v4}, Lgd3;->b(IJ)V

    .line 221
    .line 222
    .line 223
    goto :goto_6

    .line 224
    :cond_8
    invoke-virtual {p0}, Lps1;->n()Lg4;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    if-eqz v2, :cond_c

    .line 229
    .line 230
    iget-object v3, p0, Lps1;->i:Lfe3;

    .line 231
    .line 232
    invoke-virtual {v3, v2}, Lfe3;->a(Lg4;)Z

    .line 233
    .line 234
    .line 235
    move-result v2

    .line 236
    if-eqz v2, :cond_9

    .line 237
    .line 238
    const/4 v2, 0x1

    .line 239
    iput-boolean v2, p0, Lps1;->v:Z

    .line 240
    .line 241
    :cond_9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 242
    .line 243
    .line 244
    move-result-wide v2

    .line 245
    const-wide/16 v4, 0x3e8

    .line 246
    .line 247
    div-long/2addr v2, v4

    .line 248
    iput-wide v2, p0, Lps1;->s:J

    .line 249
    .line 250
    goto :goto_6

    .line 251
    :cond_a
    :goto_3
    iget-object v2, p0, Lps1;->k:Lgd3;

    .line 252
    .line 253
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 254
    .line 255
    .line 256
    move-result-wide v3

    .line 257
    sub-long/2addr v3, v0

    .line 258
    const/16 v5, 0x1392

    .line 259
    .line 260
    invoke-virtual {v2, v5, v3, v4}, Lgd3;->b(IJ)V

    .line 261
    .line 262
    .line 263
    goto :goto_6

    .line 264
    :catch_1
    iget-object v2, p0, Lps1;->k:Lgd3;

    .line 265
    .line 266
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 267
    .line 268
    .line 269
    move-result-wide v3

    .line 270
    sub-long/2addr v3, v0

    .line 271
    const/16 v5, 0x7ee

    .line 272
    .line 273
    invoke-virtual {v2, v5, v3, v4}, Lgd3;->b(IJ)V

    .line 274
    .line 275
    .line 276
    goto :goto_6

    .line 277
    :cond_b
    :goto_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 278
    .line 279
    .line 280
    move-result-wide v2

    .line 281
    sub-long/2addr v2, v0

    .line 282
    const/16 v4, 0x1391

    .line 283
    .line 284
    invoke-virtual {v6, v4, v2, v3}, Lgd3;->b(IJ)V
    :try_end_2
    .catch La64; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 285
    .line 286
    .line 287
    goto :goto_6

    .line 288
    :goto_5
    :try_start_3
    iget-object v3, p0, Lps1;->k:Lgd3;

    .line 289
    .line 290
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 291
    .line 292
    .line 293
    move-result-wide v4

    .line 294
    sub-long/2addr v4, v0

    .line 295
    const/16 v0, 0xfa2

    .line 296
    .line 297
    invoke-virtual {v3, v0, v4, v5, v2}, Lgd3;->c(IJLjava/lang/Exception;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 298
    .line 299
    .line 300
    :cond_c
    :goto_6
    iget-object v0, p0, Lps1;->o:Ljava/util/concurrent/CountDownLatch;

    .line 301
    .line 302
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 303
    .line 304
    .line 305
    return-void

    .line 306
    :goto_7
    iget-object v1, p0, Lps1;->o:Ljava/util/concurrent/CountDownLatch;

    .line 307
    .line 308
    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 309
    .line 310
    .line 311
    throw v0
.end method

.method public final n()Lg4;
    .locals 10

    .line 1
    iget-object v0, p0, Lps1;->m:Lav1;

    .line 2
    .line 3
    invoke-static {v0}, Lgi2;->H(Lav1;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    sget-object v0, Lmz1;->A2:Liz1;

    .line 12
    .line 13
    sget-object v2, Ltw1;->e:Ltw1;

    .line 14
    .line 15
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 16
    .line 17
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v2, 0x1

    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    iget-object v0, p0, Lps1;->h:Lde3;

    .line 31
    .line 32
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 33
    .line 34
    .line 35
    move-result-wide v3

    .line 36
    sget-object v5, Lde3;->k:Ljava/lang/Object;

    .line 37
    .line 38
    monitor-enter v5

    .line 39
    :try_start_0
    invoke-virtual {v0, v2}, Lde3;->r(I)Lfv1;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    if-nez v2, :cond_1

    .line 44
    .line 45
    const/16 v2, 0xfb6

    .line 46
    .line 47
    invoke-virtual {v0, v2, v3, v4}, Lde3;->p(IJ)V

    .line 48
    .line 49
    .line 50
    monitor-exit v5

    .line 51
    return-object v1

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-virtual {v2}, Lfv1;->A()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v0, v1}, Lde3;->j(Ljava/lang/String;)Ljava/io/File;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    new-instance v6, Ljava/io/File;

    .line 63
    .line 64
    const-string v7, "pcam.jar"

    .line 65
    .line 66
    invoke-direct {v6, v1, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    if-nez v7, :cond_2

    .line 74
    .line 75
    new-instance v6, Ljava/io/File;

    .line 76
    .line 77
    const-string v7, "pcam"

    .line 78
    .line 79
    invoke-direct {v6, v1, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    :cond_2
    new-instance v7, Ljava/io/File;

    .line 83
    .line 84
    const-string v8, "pcbc"

    .line 85
    .line 86
    invoke-direct {v7, v1, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    new-instance v8, Ljava/io/File;

    .line 90
    .line 91
    const-string v9, "pcopt"

    .line 92
    .line 93
    invoke-direct {v8, v1, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    const/16 v1, 0x1398

    .line 97
    .line 98
    invoke-virtual {v0, v1, v3, v4}, Lde3;->p(IJ)V

    .line 99
    .line 100
    .line 101
    new-instance v0, Lg4;

    .line 102
    .line 103
    invoke-direct {v0, v2, v6, v7, v8}, Lg4;-><init>(Lfv1;Ljava/io/File;Ljava/io/File;Ljava/io/File;)V

    .line 104
    .line 105
    .line 106
    monitor-exit v5

    .line 107
    return-object v0

    .line 108
    :goto_0
    monitor-exit v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    throw v0

    .line 110
    :cond_3
    iget-object v0, p0, Lps1;->g:Lmc2;

    .line 111
    .line 112
    invoke-virtual {v0, v2}, Lmc2;->r(I)Lfv1;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    if-nez v2, :cond_4

    .line 117
    .line 118
    :goto_1
    return-object v1

    .line 119
    :cond_4
    invoke-virtual {v2}, Lfv1;->A()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-virtual {v0}, Lmc2;->v()Ljava/io/File;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    const-string v4, "pcam.jar"

    .line 128
    .line 129
    invoke-static {v1, v4, v3}, Luk2;->J(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    if-nez v4, :cond_5

    .line 138
    .line 139
    invoke-virtual {v0}, Lmc2;->v()Ljava/io/File;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    const-string v4, "pcam"

    .line 144
    .line 145
    invoke-static {v1, v4, v3}, Luk2;->J(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    :cond_5
    invoke-virtual {v0}, Lmc2;->v()Ljava/io/File;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    const-string v5, "pcopt"

    .line 154
    .line 155
    invoke-static {v1, v5, v4}, Luk2;->J(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    invoke-virtual {v0}, Lmc2;->v()Ljava/io/File;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    const-string v5, "pcbc"

    .line 164
    .line 165
    invoke-static {v1, v5, v0}, Luk2;->J(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    new-instance v1, Lg4;

    .line 170
    .line 171
    invoke-direct {v1, v2, v3, v0, v4}, Lg4;-><init>(Lfv1;Ljava/io/File;Ljava/io/File;Ljava/io/File;)V

    .line 172
    .line 173
    .line 174
    return-object v1
.end method
