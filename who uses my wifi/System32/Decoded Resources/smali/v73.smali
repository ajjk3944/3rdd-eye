.class public final Lv73;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Lth2;

.field public final d:Ls73;

.field public final e:Lk73;

.field public final f:Li83;

.field public final g:Lea3;

.field public final h:Lk83;

.field public i:Ln70;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lth2;Lk73;Ls73;Lk83;Li83;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv73;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lv73;->b:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    iput-object p3, p0, Lv73;->c:Lth2;

    .line 9
    .line 10
    iput-object p4, p0, Lv73;->e:Lk73;

    .line 11
    .line 12
    iput-object p5, p0, Lv73;->d:Ls73;

    .line 13
    .line 14
    iput-object p6, p0, Lv73;->h:Lk83;

    .line 15
    .line 16
    iput-object p7, p0, Lv73;->f:Li83;

    .line 17
    .line 18
    invoke-virtual {p3}, Lth2;->c()Lea3;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lv73;->g:Lea3;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final a(Lpc4;Ljava/lang/String;Lm54;Ly23;)Z
    .locals 28

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    check-cast v3, Lt73;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    iget-object v8, v1, Lv73;->b:Ljava/util/concurrent/Executor;

    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    const-string v0, "Ad unit ID should not be null for rewarded video ad."

    .line 17
    .line 18
    invoke-static {v0}, Lgi2;->Z(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Lbs2;

    .line 22
    .line 23
    const/16 v2, 0x14

    .line 24
    .line 25
    invoke-direct {v0, v2, v1}, Lbs2;-><init>(ILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {v8, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 29
    .line 30
    .line 31
    return v3

    .line 32
    :cond_0
    iget-object v4, v1, Lv73;->i:Ln70;

    .line 33
    .line 34
    if-eqz v4, :cond_1

    .line 35
    .line 36
    invoke-interface {v4}, Ljava/util/concurrent/Future;->isDone()Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-nez v4, :cond_1

    .line 41
    .line 42
    return v3

    .line 43
    :cond_1
    sget-object v3, Ln02;->c:Lso1;

    .line 44
    .line 45
    invoke-virtual {v3}, Lso1;->w()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    check-cast v3, Ljava/lang/Boolean;

    .line 50
    .line 51
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    const/4 v4, 0x5

    .line 56
    iget-object v5, v1, Lv73;->e:Lk73;

    .line 57
    .line 58
    const/4 v6, 0x0

    .line 59
    if-eqz v3, :cond_2

    .line 60
    .line 61
    invoke-interface {v5}, Lk73;->l()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    if-eqz v3, :cond_2

    .line 66
    .line 67
    invoke-interface {v5}, Lk73;->l()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    check-cast v3, Lji2;

    .line 72
    .line 73
    iget-object v3, v3, Lji2;->g:Lba4;

    .line 74
    .line 75
    invoke-virtual {v3}, Lba4;->d()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    check-cast v3, Lda3;

    .line 80
    .line 81
    invoke-virtual {v3, v4}, Lda3;->i(I)V

    .line 82
    .line 83
    .line 84
    iget-object v7, v0, Lpc4;->u:Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {v3, v7}, Lda3;->c(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    iget-object v7, v0, Lpc4;->r:Landroid/os/Bundle;

    .line 90
    .line 91
    invoke-virtual {v3, v7}, Lda3;->d(Landroid/os/Bundle;)V

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_2
    move-object v3, v6

    .line 96
    :goto_0
    iget-boolean v7, v0, Lpc4;->k:Z

    .line 97
    .line 98
    iget-object v9, v1, Lv73;->a:Landroid/content/Context;

    .line 99
    .line 100
    invoke-static {v9, v7}, Lyc0;->v(Landroid/content/Context;Z)V

    .line 101
    .line 102
    .line 103
    sget-object v10, Lmz1;->I9:Liz1;

    .line 104
    .line 105
    sget-object v11, Ltw1;->e:Ltw1;

    .line 106
    .line 107
    iget-object v11, v11, Ltw1;->c:Lkz1;

    .line 108
    .line 109
    invoke-virtual {v11, v10}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v10

    .line 113
    check-cast v10, Ljava/lang/Boolean;

    .line 114
    .line 115
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 116
    .line 117
    .line 118
    move-result v10

    .line 119
    const/4 v11, 0x1

    .line 120
    if-eqz v10, :cond_3

    .line 121
    .line 122
    if-eqz v7, :cond_3

    .line 123
    .line 124
    iget-object v7, v1, Lv73;->c:Lth2;

    .line 125
    .line 126
    iget-object v7, v7, Lth2;->z:Lba4;

    .line 127
    .line 128
    invoke-virtual {v7}, Lba4;->d()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v7

    .line 132
    check-cast v7, Lzw2;

    .line 133
    .line 134
    invoke-virtual {v7, v11}, Lzw2;->b(Z)V

    .line 135
    .line 136
    .line 137
    :cond_3
    new-instance v7, Landroid/util/Pair;

    .line 138
    .line 139
    iget-wide v12, v0, Lpc4;->E:J

    .line 140
    .line 141
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 142
    .line 143
    .line 144
    move-result-object v10

    .line 145
    const-string v12, "api-call"

    .line 146
    .line 147
    invoke-direct {v7, v12, v10}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    new-instance v10, Landroid/util/Pair;

    .line 151
    .line 152
    sget-object v12, Lhg4;->C:Lhg4;

    .line 153
    .line 154
    iget-object v12, v12, Lhg4;->k:Lym;

    .line 155
    .line 156
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 160
    .line 161
    .line 162
    move-result-wide v12

    .line 163
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 164
    .line 165
    .line 166
    move-result-object v12

    .line 167
    const-string v13, "dynamite-enter"

    .line 168
    .line 169
    invoke-direct {v10, v13, v12}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    filled-new-array {v7, v10}, [Landroid/util/Pair;

    .line 173
    .line 174
    .line 175
    move-result-object v7

    .line 176
    invoke-static {v7}, Lbd2;->C([Landroid/util/Pair;)Landroid/os/Bundle;

    .line 177
    .line 178
    .line 179
    move-result-object v7

    .line 180
    iget-object v10, v1, Lv73;->h:Lk83;

    .line 181
    .line 182
    iput-object v2, v10, Lk83;->c:Ljava/lang/String;

    .line 183
    .line 184
    new-instance v12, Lxe4;

    .line 185
    .line 186
    const/16 v26, 0x0

    .line 187
    .line 188
    const/16 v27, 0x0

    .line 189
    .line 190
    const-string v13, "reward_mb"

    .line 191
    .line 192
    const/4 v14, 0x0

    .line 193
    const/4 v15, 0x0

    .line 194
    const/16 v16, 0x1

    .line 195
    .line 196
    const/16 v17, 0x0

    .line 197
    .line 198
    const/16 v18, 0x0

    .line 199
    .line 200
    const/16 v19, 0x0

    .line 201
    .line 202
    const/16 v20, 0x0

    .line 203
    .line 204
    const/16 v21, 0x0

    .line 205
    .line 206
    const/16 v22, 0x0

    .line 207
    .line 208
    const/16 v23, 0x0

    .line 209
    .line 210
    const/16 v24, 0x0

    .line 211
    .line 212
    const/16 v25, 0x0

    .line 213
    .line 214
    invoke-direct/range {v12 .. v27}, Lxe4;-><init>(Ljava/lang/String;IIZII[Lxe4;ZZZZZZZZ)V

    .line 215
    .line 216
    .line 217
    iput-object v12, v10, Lk83;->b:Lxe4;

    .line 218
    .line 219
    iput-object v0, v10, Lk83;->a:Lpc4;

    .line 220
    .line 221
    iput-object v7, v10, Lk83;->t:Landroid/os/Bundle;

    .line 222
    .line 223
    invoke-virtual {v10}, Lk83;->a()Ll83;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    invoke-static {v2}, Lqb1;->N(Ll83;)I

    .line 228
    .line 229
    .line 230
    move-result v7

    .line 231
    invoke-static {v9, v7, v4, v0}, Laa3;->g(Landroid/content/Context;IILpc4;)Laa3;

    .line 232
    .line 233
    .line 234
    move-result-object v4

    .line 235
    new-instance v0, Lu73;

    .line 236
    .line 237
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 238
    .line 239
    .line 240
    iput-object v2, v0, Lu73;->a:Ll83;

    .line 241
    .line 242
    new-instance v2, Llv2;

    .line 243
    .line 244
    const/4 v7, 0x5

    .line 245
    const/4 v9, 0x0

    .line 246
    invoke-direct {v2, v0, v6, v7, v9}, Llv2;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 247
    .line 248
    .line 249
    new-instance v6, Lf23;

    .line 250
    .line 251
    const/16 v7, 0x1b

    .line 252
    .line 253
    invoke-direct {v6, v7, v1}, Lf23;-><init>(ILjava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    invoke-interface {v5, v2, v6}, Lk73;->i(Llv2;Lj73;)Ln70;

    .line 257
    .line 258
    .line 259
    move-result-object v9

    .line 260
    iput-object v9, v1, Lv73;->i:Ln70;

    .line 261
    .line 262
    move-object v5, v0

    .line 263
    new-instance v0, Lg4;

    .line 264
    .line 265
    const/16 v6, 0xf

    .line 266
    .line 267
    const/4 v7, 0x0

    .line 268
    move-object/from16 v2, p4

    .line 269
    .line 270
    invoke-direct/range {v0 .. v7}, Lg4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 271
    .line 272
    .line 273
    new-instance v1, Ljq3;

    .line 274
    .line 275
    const/4 v2, 0x0

    .line 276
    invoke-direct {v1, v9, v0, v2}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 277
    .line 278
    .line 279
    invoke-interface {v9, v1, v8}, Ln70;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 280
    .line 281
    .line 282
    return v11
.end method

.method public final b(Li73;)Lyh2;
    .locals 3

    .line 1
    check-cast p1, Lu73;

    .line 2
    .line 3
    new-instance v0, Lyh2;

    .line 4
    .line 5
    iget-object v1, p0, Lv73;->c:Lth2;

    .line 6
    .line 7
    iget-object v1, v1, Lth2;->b:Lth2;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-direct {v0, v1, v2}, Lyh2;-><init>(Lth2;I)V

    .line 11
    .line 12
    .line 13
    new-instance v1, Lmm2;

    .line 14
    .line 15
    invoke-direct {v1}, Lmm2;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object v2, p0, Lv73;->a:Landroid/content/Context;

    .line 19
    .line 20
    iput-object v2, v1, Lmm2;->a:Landroid/content/Context;

    .line 21
    .line 22
    iget-object p1, p1, Lu73;->a:Ll83;

    .line 23
    .line 24
    iput-object p1, v1, Lmm2;->b:Ljava/lang/Object;

    .line 25
    .line 26
    iget-object p1, p0, Lv73;->f:Li83;

    .line 27
    .line 28
    iput-object p1, v1, Lmm2;->d:Ljava/lang/Object;

    .line 29
    .line 30
    new-instance p1, Lmm2;

    .line 31
    .line 32
    invoke-direct {p1, v1}, Lmm2;-><init>(Lmm2;)V

    .line 33
    .line 34
    .line 35
    iput-object p1, v0, Lyh2;->f:Lmm2;

    .line 36
    .line 37
    new-instance p1, Lep2;

    .line 38
    .line 39
    invoke-direct {p1}, Lep2;-><init>()V

    .line 40
    .line 41
    .line 42
    new-instance v1, Lfp2;

    .line 43
    .line 44
    invoke-direct {v1, p1}, Lfp2;-><init>(Lep2;)V

    .line 45
    .line 46
    .line 47
    iput-object v1, v0, Lyh2;->e:Lfp2;

    .line 48
    .line 49
    return-object v0
.end method
