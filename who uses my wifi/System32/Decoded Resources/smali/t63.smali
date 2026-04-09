.class public final Lt63;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Lth2;

.field public final d:Ls63;

.field public final e:Lk73;

.field public final f:Le51;

.field public final g:Landroid/widget/FrameLayout;

.field public final h:Lea3;

.field public final i:Lk83;

.field public j:Ln70;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lth2;Lk73;Ls63;Lk83;Le51;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt63;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lt63;->b:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    iput-object p3, p0, Lt63;->c:Lth2;

    .line 9
    .line 10
    iput-object p4, p0, Lt63;->e:Lk73;

    .line 11
    .line 12
    iput-object p5, p0, Lt63;->d:Ls63;

    .line 13
    .line 14
    iput-object p6, p0, Lt63;->i:Lk83;

    .line 15
    .line 16
    iput-object p7, p0, Lt63;->f:Le51;

    .line 17
    .line 18
    new-instance p2, Landroid/widget/FrameLayout;

    .line 19
    .line 20
    invoke-direct {p2, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 21
    .line 22
    .line 23
    iput-object p2, p0, Lt63;->g:Landroid/widget/FrameLayout;

    .line 24
    .line 25
    invoke-virtual {p3}, Lth2;->c()Lea3;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, Lt63;->h:Lea3;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final declared-synchronized a(Lpc4;Ljava/lang/String;Lm54;Ly23;)Z
    .locals 9

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Lpc4;->b()Z

    .line 3
    .line 4
    .line 5
    move-result p3

    .line 6
    const/4 v0, 0x1

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz p3, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    sget-object p3, Lq02;->d:Lso1;

    .line 12
    .line 13
    invoke-virtual {p3}, Lso1;->w()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    check-cast p3, Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 23
    if-eqz p3, :cond_1

    .line 24
    .line 25
    :try_start_1
    sget-object p3, Lmz1;->Wb:Liz1;

    .line 26
    .line 27
    sget-object v2, Ltw1;->e:Ltw1;

    .line 28
    .line 29
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 30
    .line 31
    invoke-virtual {v2, p3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    check-cast p3, Ljava/lang/Boolean;

    .line 36
    .line 37
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 38
    .line 39
    .line 40
    move-result p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    if-eqz p3, :cond_1

    .line 42
    .line 43
    move p3, v0

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move p3, v1

    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    move-object p1, v0

    .line 49
    move-object v2, p0

    .line 50
    goto/16 :goto_4

    .line 51
    .line 52
    :goto_0
    :try_start_2
    iget-object v2, p0, Lt63;->f:Le51;

    .line 53
    .line 54
    iget v2, v2, Le51;->h:I

    .line 55
    .line 56
    sget-object v3, Lmz1;->Xb:Liz1;

    .line 57
    .line 58
    sget-object v4, Ltw1;->e:Ltw1;

    .line 59
    .line 60
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 61
    .line 62
    invoke-virtual {v4, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    check-cast v3, Ljava/lang/Integer;

    .line 67
    .line 68
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-lt v2, v3, :cond_2

    .line 73
    .line 74
    if-nez p3, :cond_3

    .line 75
    .line 76
    :cond_2
    const-string p3, "loadAd must be called on the main UI thread."

    .line 77
    .line 78
    invoke-static {p3}, Lou1;->h(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 79
    .line 80
    .line 81
    :cond_3
    :goto_1
    if-nez p2, :cond_4

    .line 82
    .line 83
    :try_start_3
    const-string p1, "Ad unit ID should not be null for app open ad."

    .line 84
    .line 85
    invoke-static {p1}, Lgi2;->Z(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    iget-object p1, p0, Lt63;->b:Ljava/util/concurrent/Executor;

    .line 89
    .line 90
    new-instance p2, Lbs2;

    .line 91
    .line 92
    const/16 p3, 0xf

    .line 93
    .line 94
    invoke-direct {p2, p3, p0}, Lbs2;-><init>(ILjava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 98
    .line 99
    .line 100
    monitor-exit p0

    .line 101
    return v1

    .line 102
    :cond_4
    :try_start_4
    iget-object p3, p0, Lt63;->j:Ln70;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 103
    .line 104
    if-eqz p3, :cond_5

    .line 105
    .line 106
    monitor-exit p0

    .line 107
    return v1

    .line 108
    :cond_5
    :try_start_5
    sget-object p3, Ln02;->c:Lso1;

    .line 109
    .line 110
    invoke-virtual {p3}, Lso1;->w()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p3

    .line 114
    check-cast p3, Ljava/lang/Boolean;

    .line 115
    .line 116
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 117
    .line 118
    .line 119
    move-result p3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 120
    const/4 v1, 0x7

    .line 121
    const/4 v2, 0x0

    .line 122
    if-eqz p3, :cond_6

    .line 123
    .line 124
    :try_start_6
    iget-object p3, p0, Lt63;->e:Lk73;

    .line 125
    .line 126
    invoke-interface {p3}, Lk73;->l()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p3

    .line 130
    check-cast p3, Lzh2;

    .line 131
    .line 132
    if-eqz p3, :cond_6

    .line 133
    .line 134
    iget-object p3, p3, Lzh2;->f:Lba4;

    .line 135
    .line 136
    invoke-virtual {p3}, Lba4;->d()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p3

    .line 140
    check-cast p3, Lda3;

    .line 141
    .line 142
    invoke-virtual {p3, v1}, Lda3;->i(I)V

    .line 143
    .line 144
    .line 145
    iget-object v3, p1, Lpc4;->u:Ljava/lang/String;

    .line 146
    .line 147
    invoke-virtual {p3, v3}, Lda3;->c(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    iget-object v3, p1, Lpc4;->r:Landroid/os/Bundle;

    .line 151
    .line 152
    invoke-virtual {p3, v3}, Lda3;->d(Landroid/os/Bundle;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 153
    .line 154
    .line 155
    move-object v4, p3

    .line 156
    goto :goto_2

    .line 157
    :cond_6
    move-object v4, v2

    .line 158
    :goto_2
    :try_start_7
    iget-object p3, p0, Lt63;->a:Landroid/content/Context;

    .line 159
    .line 160
    iget-boolean v3, p1, Lpc4;->k:Z

    .line 161
    .line 162
    invoke-static {p3, v3}, Lyc0;->v(Landroid/content/Context;Z)V

    .line 163
    .line 164
    .line 165
    sget-object v5, Lmz1;->I9:Liz1;

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
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 181
    if-eqz v5, :cond_7

    .line 182
    .line 183
    if-eqz v3, :cond_7

    .line 184
    .line 185
    :try_start_8
    iget-object v3, p0, Lt63;->c:Lth2;

    .line 186
    .line 187
    iget-object v3, v3, Lth2;->z:Lba4;

    .line 188
    .line 189
    invoke-virtual {v3}, Lba4;->d()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    check-cast v3, Lzw2;

    .line 194
    .line 195
    invoke-virtual {v3, v0}, Lzw2;->b(Z)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 196
    .line 197
    .line 198
    :cond_7
    :try_start_9
    new-instance v3, Landroid/util/Pair;

    .line 199
    .line 200
    const-string v5, "api-call"

    .line 201
    .line 202
    iget-wide v6, p1, Lpc4;->E:J

    .line 203
    .line 204
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 205
    .line 206
    .line 207
    move-result-object v6

    .line 208
    invoke-direct {v3, v5, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    new-instance v5, Landroid/util/Pair;

    .line 212
    .line 213
    const-string v6, "dynamite-enter"

    .line 214
    .line 215
    sget-object v7, Lhg4;->C:Lhg4;

    .line 216
    .line 217
    iget-object v7, v7, Lhg4;->k:Lym;

    .line 218
    .line 219
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 223
    .line 224
    .line 225
    move-result-wide v7

    .line 226
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 227
    .line 228
    .line 229
    move-result-object v7

    .line 230
    invoke-direct {v5, v6, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    filled-new-array {v3, v5}, [Landroid/util/Pair;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    invoke-static {v3}, Lbd2;->C([Landroid/util/Pair;)Landroid/os/Bundle;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    iget-object v5, p0, Lt63;->i:Lk83;

    .line 242
    .line 243
    iput-object p2, v5, Lk83;->c:Ljava/lang/String;

    .line 244
    .line 245
    invoke-static {}, Lxe4;->b()Lxe4;

    .line 246
    .line 247
    .line 248
    move-result-object p2

    .line 249
    iput-object p2, v5, Lk83;->b:Lxe4;

    .line 250
    .line 251
    iput-object p1, v5, Lk83;->a:Lpc4;

    .line 252
    .line 253
    iput-object v3, v5, Lk83;->t:Landroid/os/Bundle;

    .line 254
    .line 255
    invoke-virtual {v5}, Lk83;->a()Ll83;

    .line 256
    .line 257
    .line 258
    move-result-object p2

    .line 259
    invoke-static {p2}, Lqb1;->N(Ll83;)I

    .line 260
    .line 261
    .line 262
    move-result v3

    .line 263
    invoke-static {p3, v3, v1, p1}, Laa3;->g(Landroid/content/Context;IILpc4;)Laa3;

    .line 264
    .line 265
    .line 266
    move-result-object v5

    .line 267
    new-instance v6, Lr63;

    .line 268
    .line 269
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 270
    .line 271
    .line 272
    iput-object p2, v6, Lr63;->a:Ll83;

    .line 273
    .line 274
    iget-object p1, p0, Lt63;->e:Lk73;

    .line 275
    .line 276
    new-instance p2, Llv2;

    .line 277
    .line 278
    const/4 p3, 0x5

    .line 279
    const/4 v1, 0x0

    .line 280
    invoke-direct {p2, v6, v2, p3, v1}, Llv2;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 281
    .line 282
    .line 283
    new-instance p3, Lf20;

    .line 284
    .line 285
    const/16 v1, 0x19

    .line 286
    .line 287
    invoke-direct {p3, v1, p0}, Lf20;-><init>(ILjava/lang/Object;)V

    .line 288
    .line 289
    .line 290
    invoke-interface {p1, p2, p3}, Lk73;->i(Llv2;Lj73;)Ln70;

    .line 291
    .line 292
    .line 293
    move-result-object p1

    .line 294
    iput-object p1, p0, Lt63;->j:Ln70;

    .line 295
    .line 296
    new-instance v1, Lg4;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 297
    .line 298
    const/16 v7, 0xd

    .line 299
    .line 300
    const/4 v8, 0x0

    .line 301
    move-object v2, p0

    .line 302
    move-object v3, p4

    .line 303
    :try_start_a
    invoke-direct/range {v1 .. v8}, Lg4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 304
    .line 305
    .line 306
    iget-object p2, v2, Lt63;->b:Ljava/util/concurrent/Executor;

    .line 307
    .line 308
    new-instance p3, Ljq3;

    .line 309
    .line 310
    const/4 p4, 0x0

    .line 311
    invoke-direct {p3, p1, v1, p4}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 312
    .line 313
    .line 314
    invoke-interface {p1, p3, p2}, Ln70;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 315
    .line 316
    .line 317
    monitor-exit p0

    .line 318
    return v0

    .line 319
    :catchall_1
    move-exception v0

    .line 320
    :goto_3
    move-object p1, v0

    .line 321
    goto :goto_4

    .line 322
    :catchall_2
    move-exception v0

    .line 323
    move-object v2, p0

    .line 324
    goto :goto_3

    .line 325
    :goto_4
    :try_start_b
    monitor-exit p0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 326
    throw p1
.end method

.method public final declared-synchronized b(Li73;)Lyh2;
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    check-cast p1, Lr63;

    .line 3
    .line 4
    sget-object v0, Lmz1;->P8:Liz1;

    .line 5
    .line 6
    sget-object v1, Ltw1;->e:Ltw1;

    .line 7
    .line 8
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    new-instance v0, Lmm2;

    .line 23
    .line 24
    invoke-direct {v0}, Lmm2;-><init>()V

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Lt63;->a:Landroid/content/Context;

    .line 28
    .line 29
    iput-object v1, v0, Lmm2;->a:Landroid/content/Context;

    .line 30
    .line 31
    iget-object p1, p1, Lr63;->a:Ll83;

    .line 32
    .line 33
    iput-object p1, v0, Lmm2;->b:Ljava/lang/Object;

    .line 34
    .line 35
    new-instance p1, Lmm2;

    .line 36
    .line 37
    invoke-direct {p1, v0}, Lmm2;-><init>(Lmm2;)V

    .line 38
    .line 39
    .line 40
    new-instance v0, Lep2;

    .line 41
    .line 42
    invoke-direct {v0}, Lep2;-><init>()V

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Lt63;->d:Ls63;

    .line 46
    .line 47
    iget-object v2, p0, Lt63;->b:Ljava/util/concurrent/Executor;

    .line 48
    .line 49
    new-instance v3, Lup2;

    .line 50
    .line 51
    invoke-direct {v3, v1, v2}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 52
    .line 53
    .line 54
    iget-object v4, v0, Lep2;->l:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v4, Ljava/util/HashSet;

    .line 57
    .line 58
    invoke-virtual {v4, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v1, v2}, Lep2;->c(Lxp2;Ljava/util/concurrent/Executor;)V

    .line 62
    .line 63
    .line 64
    new-instance v1, Lfp2;

    .line 65
    .line 66
    invoke-direct {v1, v0}, Lfp2;-><init>(Lep2;)V

    .line 67
    .line 68
    .line 69
    iget-object v0, p0, Lt63;->c:Lth2;

    .line 70
    .line 71
    new-instance v2, Lyh2;

    .line 72
    .line 73
    iget-object v0, v0, Lth2;->b:Lth2;

    .line 74
    .line 75
    const/4 v3, 0x0

    .line 76
    invoke-direct {v2, v0, v3}, Lyh2;-><init>(Lth2;I)V

    .line 77
    .line 78
    .line 79
    iput-object p1, v2, Lyh2;->f:Lmm2;

    .line 80
    .line 81
    iput-object v1, v2, Lyh2;->e:Lfp2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    .line 83
    monitor-exit p0

    .line 84
    return-object v2

    .line 85
    :catchall_0
    move-exception p1

    .line 86
    goto :goto_0

    .line 87
    :cond_0
    :try_start_1
    iget-object v0, p0, Lt63;->d:Ls63;

    .line 88
    .line 89
    new-instance v1, Ls63;

    .line 90
    .line 91
    iget-object v2, v0, Ls63;->f:Lx83;

    .line 92
    .line 93
    invoke-direct {v1, v2}, Ls63;-><init>(Lx83;)V

    .line 94
    .line 95
    .line 96
    iput-object v0, v1, Ls63;->m:Ls63;

    .line 97
    .line 98
    new-instance v0, Lep2;

    .line 99
    .line 100
    invoke-direct {v0}, Lep2;-><init>()V

    .line 101
    .line 102
    .line 103
    iget-object v2, p0, Lt63;->b:Ljava/util/concurrent/Executor;

    .line 104
    .line 105
    invoke-virtual {v0, v1, v2}, Lep2;->a(Lwm2;Ljava/util/concurrent/Executor;)V

    .line 106
    .line 107
    .line 108
    new-instance v3, Lup2;

    .line 109
    .line 110
    invoke-direct {v3, v1, v2}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 111
    .line 112
    .line 113
    iget-object v4, v0, Lep2;->g:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v4, Ljava/util/HashSet;

    .line 116
    .line 117
    invoke-virtual {v4, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    new-instance v3, Lup2;

    .line 121
    .line 122
    invoke-direct {v3, v1, v2}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 123
    .line 124
    .line 125
    iget-object v4, v0, Lep2;->n:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v4, Ljava/util/HashSet;

    .line 128
    .line 129
    invoke-virtual {v4, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    new-instance v3, Lup2;

    .line 133
    .line 134
    invoke-direct {v3, v1, v2}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 135
    .line 136
    .line 137
    iget-object v4, v0, Lep2;->m:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v4, Ljava/util/HashSet;

    .line 140
    .line 141
    invoke-virtual {v4, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    new-instance v3, Lup2;

    .line 145
    .line 146
    invoke-direct {v3, v1, v2}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 147
    .line 148
    .line 149
    iget-object v4, v0, Lep2;->l:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v4, Ljava/util/HashSet;

    .line 152
    .line 153
    invoke-virtual {v4, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0, v1, v2}, Lep2;->c(Lxp2;Ljava/util/concurrent/Executor;)V

    .line 157
    .line 158
    .line 159
    iput-object v1, v0, Lep2;->o:Ljava/lang/Object;

    .line 160
    .line 161
    new-instance v1, Lmm2;

    .line 162
    .line 163
    invoke-direct {v1}, Lmm2;-><init>()V

    .line 164
    .line 165
    .line 166
    iget-object v2, p0, Lt63;->a:Landroid/content/Context;

    .line 167
    .line 168
    iput-object v2, v1, Lmm2;->a:Landroid/content/Context;

    .line 169
    .line 170
    iget-object p1, p1, Lr63;->a:Ll83;

    .line 171
    .line 172
    iput-object p1, v1, Lmm2;->b:Ljava/lang/Object;

    .line 173
    .line 174
    new-instance p1, Lmm2;

    .line 175
    .line 176
    invoke-direct {p1, v1}, Lmm2;-><init>(Lmm2;)V

    .line 177
    .line 178
    .line 179
    new-instance v1, Lfp2;

    .line 180
    .line 181
    invoke-direct {v1, v0}, Lfp2;-><init>(Lep2;)V

    .line 182
    .line 183
    .line 184
    iget-object v0, p0, Lt63;->c:Lth2;

    .line 185
    .line 186
    new-instance v2, Lyh2;

    .line 187
    .line 188
    iget-object v0, v0, Lth2;->b:Lth2;

    .line 189
    .line 190
    const/4 v3, 0x0

    .line 191
    invoke-direct {v2, v0, v3}, Lyh2;-><init>(Lth2;I)V

    .line 192
    .line 193
    .line 194
    iput-object p1, v2, Lyh2;->f:Lmm2;

    .line 195
    .line 196
    iput-object v1, v2, Lyh2;->e:Lfp2;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 197
    .line 198
    monitor-exit p0

    .line 199
    return-object v2

    .line 200
    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 201
    throw p1
.end method
