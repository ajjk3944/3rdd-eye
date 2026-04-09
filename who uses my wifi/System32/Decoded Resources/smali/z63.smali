.class public final Lz63;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Lth2;

.field public final d:Ls23;

.field public final e:Lu23;

.field public final f:Landroid/widget/FrameLayout;

.field public g:Lvz1;

.field public final h:Lgo2;

.field public final i:Lea3;

.field public final j:Lwo2;

.field public final k:Lk83;

.field public l:Lq93;

.field public m:Z

.field public n:Lnx2;

.field public o:Ly23;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lxe4;Lth2;Ls23;Lu23;Lk83;Lwo2;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz63;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lz63;->b:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    iput-object p4, p0, Lz63;->c:Lth2;

    .line 9
    .line 10
    iput-object p5, p0, Lz63;->d:Ls23;

    .line 11
    .line 12
    iput-object p6, p0, Lz63;->e:Lu23;

    .line 13
    .line 14
    iput-object p7, p0, Lz63;->k:Lk83;

    .line 15
    .line 16
    iget-object p2, p4, Lth2;->d:Lba4;

    .line 17
    .line 18
    invoke-virtual {p2}, Lba4;->d()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    check-cast p2, Ljava/util/concurrent/ScheduledExecutorService;

    .line 23
    .line 24
    iget-object p5, p4, Lth2;->f:Lba4;

    .line 25
    .line 26
    invoke-virtual {p5}, Lba4;->d()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p5

    .line 30
    check-cast p5, Lym;

    .line 31
    .line 32
    iget-object p6, p4, Lth2;->j:Lba4;

    .line 33
    .line 34
    invoke-virtual {p6}, Lba4;->d()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p6

    .line 38
    check-cast p6, Lmv2;

    .line 39
    .line 40
    new-instance v0, Lgo2;

    .line 41
    .line 42
    invoke-direct {v0, p2, p5, p6}, Lgo2;-><init>(Ljava/util/concurrent/ScheduledExecutorService;Lym;Lmv2;)V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, Lz63;->h:Lgo2;

    .line 46
    .line 47
    invoke-virtual {p4}, Lth2;->c()Lea3;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    iput-object p2, p0, Lz63;->i:Lea3;

    .line 52
    .line 53
    new-instance p2, Landroid/widget/FrameLayout;

    .line 54
    .line 55
    invoke-direct {p2, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 56
    .line 57
    .line 58
    iput-object p2, p0, Lz63;->f:Landroid/widget/FrameLayout;

    .line 59
    .line 60
    iput-object p8, p0, Lz63;->j:Lwo2;

    .line 61
    .line 62
    iput-object p3, p7, Lk83;->b:Lxe4;

    .line 63
    .line 64
    const/4 p1, 0x1

    .line 65
    iput-boolean p1, p0, Lz63;->m:Z

    .line 66
    .line 67
    const/4 p1, 0x0

    .line 68
    iput-object p1, p0, Lz63;->n:Lnx2;

    .line 69
    .line 70
    iput-object p1, p0, Lz63;->o:Ly23;

    .line 71
    .line 72
    return-void
.end method


# virtual methods
.method public final a(Lpc4;Ljava/lang/String;Lm54;Ly23;)Z
    .locals 39

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v4, v0, Lz63;->b:Ljava/util/concurrent/Executor;

    .line 9
    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    const-string v1, "Ad unit ID should not be null for banner ad."

    .line 13
    .line 14
    invoke-static {v1}, Lgi2;->Z(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    new-instance v1, Lbs2;

    .line 18
    .line 19
    const/16 v2, 0x10

    .line 20
    .line 21
    invoke-direct {v1, v2, v0}, Lbs2;-><init>(ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v4, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 25
    .line 26
    .line 27
    return v3

    .line 28
    :cond_0
    invoke-virtual {v0}, Lz63;->b()Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    iget-object v6, v0, Lz63;->k:Lk83;

    .line 33
    .line 34
    const/4 v7, 0x1

    .line 35
    if-eqz v5, :cond_1

    .line 36
    .line 37
    iget-boolean v1, v6, Lk83;->p:Z

    .line 38
    .line 39
    if-nez v1, :cond_3

    .line 40
    .line 41
    iput-boolean v7, v0, Lz63;->m:Z

    .line 42
    .line 43
    return v3

    .line 44
    :cond_1
    sget-object v5, Lmz1;->I9:Liz1;

    .line 45
    .line 46
    sget-object v8, Ltw1;->e:Ltw1;

    .line 47
    .line 48
    iget-object v9, v8, Ltw1;->c:Lkz1;

    .line 49
    .line 50
    invoke-virtual {v9, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    check-cast v5, Ljava/lang/Boolean;

    .line 55
    .line 56
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    iget-object v9, v0, Lz63;->c:Lth2;

    .line 61
    .line 62
    if-eqz v5, :cond_2

    .line 63
    .line 64
    iget-boolean v5, v1, Lpc4;->k:Z

    .line 65
    .line 66
    if-eqz v5, :cond_2

    .line 67
    .line 68
    iget-object v5, v9, Lth2;->z:Lba4;

    .line 69
    .line 70
    invoke-virtual {v5}, Lba4;->d()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    check-cast v5, Lzw2;

    .line 75
    .line 76
    invoke-virtual {v5, v7}, Lzw2;->b(Z)V

    .line 77
    .line 78
    .line 79
    :cond_2
    new-instance v5, Landroid/util/Pair;

    .line 80
    .line 81
    iget-wide v10, v1, Lpc4;->E:J

    .line 82
    .line 83
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 84
    .line 85
    .line 86
    move-result-object v10

    .line 87
    const-string v11, "api-call"

    .line 88
    .line 89
    invoke-direct {v5, v11, v10}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    new-instance v10, Landroid/util/Pair;

    .line 93
    .line 94
    sget-object v11, Lhg4;->C:Lhg4;

    .line 95
    .line 96
    iget-object v11, v11, Lhg4;->k:Lym;

    .line 97
    .line 98
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 102
    .line 103
    .line 104
    move-result-wide v11

    .line 105
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 106
    .line 107
    .line 108
    move-result-object v11

    .line 109
    const-string v12, "dynamite-enter"

    .line 110
    .line 111
    invoke-direct {v10, v12, v11}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    filled-new-array {v5, v10}, [Landroid/util/Pair;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    invoke-static {v5}, Lbd2;->C([Landroid/util/Pair;)Landroid/os/Bundle;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    iput-object v2, v6, Lk83;->c:Ljava/lang/String;

    .line 123
    .line 124
    iput-object v1, v6, Lk83;->a:Lpc4;

    .line 125
    .line 126
    iput-object v5, v6, Lk83;->t:Landroid/os/Bundle;

    .line 127
    .line 128
    invoke-virtual {v6}, Lk83;->a()Ll83;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    invoke-static {v2}, Lqb1;->N(Ll83;)I

    .line 133
    .line 134
    .line 135
    move-result v5

    .line 136
    iget-object v10, v0, Lz63;->a:Landroid/content/Context;

    .line 137
    .line 138
    const/4 v11, 0x3

    .line 139
    invoke-static {v10, v5, v11, v1}, Laa3;->g(Landroid/content/Context;IILpc4;)Laa3;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    sget-object v12, Lc12;->d:Lso1;

    .line 144
    .line 145
    invoke-virtual {v12}, Lso1;->w()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v12

    .line 149
    check-cast v12, Ljava/lang/Boolean;

    .line 150
    .line 151
    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    .line 152
    .line 153
    .line 154
    move-result v12

    .line 155
    iget-object v13, v0, Lz63;->d:Ls23;

    .line 156
    .line 157
    const/4 v14, 0x0

    .line 158
    if-eqz v12, :cond_4

    .line 159
    .line 160
    iget-object v6, v6, Lk83;->b:Lxe4;

    .line 161
    .line 162
    iget-boolean v6, v6, Lxe4;->p:Z

    .line 163
    .line 164
    if-eqz v6, :cond_4

    .line 165
    .line 166
    if-eqz v13, :cond_3

    .line 167
    .line 168
    const/4 v1, 0x7

    .line 169
    invoke-static {v1, v14, v14}, Lzt0;->Q(ILjava/lang/String;Lnx2;)Lnx2;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    invoke-virtual {v13, v1}, Ls23;->d0(Lnx2;)V

    .line 174
    .line 175
    .line 176
    :cond_3
    return v3

    .line 177
    :cond_4
    sget-object v3, Lmz1;->O8:Liz1;

    .line 178
    .line 179
    iget-object v6, v8, Ltw1;->c:Lkz1;

    .line 180
    .line 181
    invoke-virtual {v6, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    check-cast v3, Ljava/lang/Boolean;

    .line 186
    .line 187
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    iget-object v6, v0, Lz63;->f:Landroid/widget/FrameLayout;

    .line 192
    .line 193
    iget-object v8, v0, Lz63;->j:Lwo2;

    .line 194
    .line 195
    iget-object v12, v0, Lz63;->h:Lgo2;

    .line 196
    .line 197
    if-eqz v3, :cond_5

    .line 198
    .line 199
    iget-object v3, v9, Lth2;->b:Lth2;

    .line 200
    .line 201
    new-instance v9, Lmm2;

    .line 202
    .line 203
    invoke-direct {v9}, Lmm2;-><init>()V

    .line 204
    .line 205
    .line 206
    iput-object v10, v9, Lmm2;->a:Landroid/content/Context;

    .line 207
    .line 208
    iput-object v2, v9, Lmm2;->b:Ljava/lang/Object;

    .line 209
    .line 210
    new-instance v2, Lmm2;

    .line 211
    .line 212
    invoke-direct {v2, v9}, Lmm2;-><init>(Lmm2;)V

    .line 213
    .line 214
    .line 215
    new-instance v9, Lep2;

    .line 216
    .line 217
    invoke-direct {v9}, Lep2;-><init>()V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v9, v13, v4}, Lep2;->d(Ljo2;Ljava/util/concurrent/Executor;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v9, v13, v4}, Lep2;->b(Lb8;Ljava/util/concurrent/Executor;)V

    .line 224
    .line 225
    .line 226
    new-instance v10, Lfp2;

    .line 227
    .line 228
    invoke-direct {v10, v9}, Lfp2;-><init>(Lep2;)V

    .line 229
    .line 230
    .line 231
    new-instance v9, Lf23;

    .line 232
    .line 233
    iget-object v13, v0, Lz63;->g:Lvz1;

    .line 234
    .line 235
    const/4 v15, 0x0

    .line 236
    invoke-direct {v9, v15, v13}, Lf23;-><init>(ILjava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    new-instance v13, Lvq2;

    .line 240
    .line 241
    sget-object v15, Lyr2;->h:Lyr2;

    .line 242
    .line 243
    move/from16 p3, v7

    .line 244
    .line 245
    const/4 v7, 0x0

    .line 246
    invoke-direct {v13, v15, v14, v7}, Lvq2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 247
    .line 248
    .line 249
    new-instance v7, Ll92;

    .line 250
    .line 251
    invoke-direct {v7, v12, v8}, Ll92;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    new-instance v8, Lug0;

    .line 255
    .line 256
    const/16 v12, 0x13

    .line 257
    .line 258
    invoke-direct {v8, v12, v6}, Lug0;-><init>(ILjava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    new-instance v6, Lf23;

    .line 262
    .line 263
    const/16 v12, 0x19

    .line 264
    .line 265
    invoke-direct {v6, v12}, Lf23;-><init>(I)V

    .line 266
    .line 267
    .line 268
    new-instance v15, Lbi2;

    .line 269
    .line 270
    new-instance v12, Ltv2;

    .line 271
    .line 272
    const/4 v11, 0x0

    .line 273
    const/4 v14, 0x0

    .line 274
    invoke-direct {v12, v11, v14}, Ltv2;-><init>(IB)V

    .line 275
    .line 276
    .line 277
    const/16 v25, 0x0

    .line 278
    .line 279
    const/16 v26, 0x0

    .line 280
    .line 281
    move-object/from16 v21, v2

    .line 282
    .line 283
    move-object/from16 v16, v3

    .line 284
    .line 285
    move-object/from16 v22, v6

    .line 286
    .line 287
    move-object/from16 v24, v7

    .line 288
    .line 289
    move-object/from16 v17, v8

    .line 290
    .line 291
    move-object/from16 v23, v9

    .line 292
    .line 293
    move-object/from16 v20, v10

    .line 294
    .line 295
    move-object/from16 v19, v12

    .line 296
    .line 297
    move-object/from16 v18, v13

    .line 298
    .line 299
    invoke-direct/range {v15 .. v26}, Lbi2;-><init>(Lth2;Lug0;Lvq2;Ltv2;Lfp2;Lmm2;Lf23;Lf23;Ll92;Lm73;Lb73;)V

    .line 300
    .line 301
    .line 302
    const/4 v14, 0x0

    .line 303
    goto/16 :goto_0

    .line 304
    .line 305
    :cond_5
    move/from16 p3, v7

    .line 306
    .line 307
    iget-object v3, v9, Lth2;->b:Lth2;

    .line 308
    .line 309
    new-instance v7, Lmm2;

    .line 310
    .line 311
    invoke-direct {v7}, Lmm2;-><init>()V

    .line 312
    .line 313
    .line 314
    iput-object v10, v7, Lmm2;->a:Landroid/content/Context;

    .line 315
    .line 316
    iput-object v2, v7, Lmm2;->b:Ljava/lang/Object;

    .line 317
    .line 318
    new-instance v2, Lmm2;

    .line 319
    .line 320
    invoke-direct {v2, v7}, Lmm2;-><init>(Lmm2;)V

    .line 321
    .line 322
    .line 323
    new-instance v7, Lep2;

    .line 324
    .line 325
    invoke-direct {v7}, Lep2;-><init>()V

    .line 326
    .line 327
    .line 328
    iget-object v9, v7, Lep2;->c:Ljava/lang/Object;

    .line 329
    .line 330
    check-cast v9, Ljava/util/HashSet;

    .line 331
    .line 332
    invoke-virtual {v7, v13, v4}, Lep2;->d(Ljo2;Ljava/util/concurrent/Executor;)V

    .line 333
    .line 334
    .line 335
    new-instance v10, Lup2;

    .line 336
    .line 337
    invoke-direct {v10, v13, v4}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v9, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    new-instance v10, Lup2;

    .line 344
    .line 345
    iget-object v11, v0, Lz63;->e:Lu23;

    .line 346
    .line 347
    invoke-direct {v10, v11, v4}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {v9, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 351
    .line 352
    .line 353
    invoke-virtual {v7, v13, v4}, Lep2;->c(Lxp2;Ljava/util/concurrent/Executor;)V

    .line 354
    .line 355
    .line 356
    new-instance v9, Lup2;

    .line 357
    .line 358
    invoke-direct {v9, v13, v4}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 359
    .line 360
    .line 361
    iget-object v10, v7, Lep2;->f:Ljava/lang/Object;

    .line 362
    .line 363
    check-cast v10, Ljava/util/HashSet;

    .line 364
    .line 365
    invoke-virtual {v10, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    new-instance v9, Lup2;

    .line 369
    .line 370
    invoke-direct {v9, v13, v4}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 371
    .line 372
    .line 373
    iget-object v10, v7, Lep2;->e:Ljava/lang/Object;

    .line 374
    .line 375
    check-cast v10, Ljava/util/HashSet;

    .line 376
    .line 377
    invoke-virtual {v10, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 378
    .line 379
    .line 380
    new-instance v9, Lup2;

    .line 381
    .line 382
    invoke-direct {v9, v13, v4}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 383
    .line 384
    .line 385
    iget-object v10, v7, Lep2;->h:Ljava/lang/Object;

    .line 386
    .line 387
    check-cast v10, Ljava/util/HashSet;

    .line 388
    .line 389
    invoke-virtual {v10, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 390
    .line 391
    .line 392
    invoke-virtual {v7, v13, v4}, Lep2;->a(Lwm2;Ljava/util/concurrent/Executor;)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v7, v13, v4}, Lep2;->b(Lb8;Ljava/util/concurrent/Executor;)V

    .line 396
    .line 397
    .line 398
    new-instance v9, Lup2;

    .line 399
    .line 400
    invoke-direct {v9, v13, v4}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 401
    .line 402
    .line 403
    iget-object v10, v7, Lep2;->m:Ljava/lang/Object;

    .line 404
    .line 405
    check-cast v10, Ljava/util/HashSet;

    .line 406
    .line 407
    invoke-virtual {v10, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 408
    .line 409
    .line 410
    new-instance v9, Lfp2;

    .line 411
    .line 412
    invoke-direct {v9, v7}, Lfp2;-><init>(Lep2;)V

    .line 413
    .line 414
    .line 415
    new-instance v7, Lf23;

    .line 416
    .line 417
    iget-object v10, v0, Lz63;->g:Lvz1;

    .line 418
    .line 419
    const/4 v11, 0x0

    .line 420
    invoke-direct {v7, v11, v10}, Lf23;-><init>(ILjava/lang/Object;)V

    .line 421
    .line 422
    .line 423
    new-instance v10, Lvq2;

    .line 424
    .line 425
    sget-object v11, Lyr2;->h:Lyr2;

    .line 426
    .line 427
    const/4 v13, 0x0

    .line 428
    const/4 v14, 0x0

    .line 429
    invoke-direct {v10, v11, v14, v13}, Lvq2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 430
    .line 431
    .line 432
    new-instance v11, Ll92;

    .line 433
    .line 434
    invoke-direct {v11, v12, v8}, Ll92;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 435
    .line 436
    .line 437
    new-instance v8, Lug0;

    .line 438
    .line 439
    const/16 v12, 0x13

    .line 440
    .line 441
    invoke-direct {v8, v12, v6}, Lug0;-><init>(ILjava/lang/Object;)V

    .line 442
    .line 443
    .line 444
    new-instance v6, Lf23;

    .line 445
    .line 446
    const/16 v12, 0x19

    .line 447
    .line 448
    invoke-direct {v6, v12}, Lf23;-><init>(I)V

    .line 449
    .line 450
    .line 451
    new-instance v27, Lbi2;

    .line 452
    .line 453
    new-instance v12, Ltv2;

    .line 454
    .line 455
    const/4 v15, 0x0

    .line 456
    invoke-direct {v12, v13, v15}, Ltv2;-><init>(IB)V

    .line 457
    .line 458
    .line 459
    const/16 v37, 0x0

    .line 460
    .line 461
    const/16 v38, 0x0

    .line 462
    .line 463
    move-object/from16 v33, v2

    .line 464
    .line 465
    move-object/from16 v28, v3

    .line 466
    .line 467
    move-object/from16 v34, v6

    .line 468
    .line 469
    move-object/from16 v35, v7

    .line 470
    .line 471
    move-object/from16 v29, v8

    .line 472
    .line 473
    move-object/from16 v32, v9

    .line 474
    .line 475
    move-object/from16 v30, v10

    .line 476
    .line 477
    move-object/from16 v36, v11

    .line 478
    .line 479
    move-object/from16 v31, v12

    .line 480
    .line 481
    invoke-direct/range {v27 .. v38}, Lbi2;-><init>(Lth2;Lug0;Lvq2;Ltv2;Lfp2;Lmm2;Lf23;Lf23;Ll92;Lm73;Lb73;)V

    .line 482
    .line 483
    .line 484
    move-object/from16 v15, v27

    .line 485
    .line 486
    :goto_0
    sget-object v2, Ln02;->c:Lso1;

    .line 487
    .line 488
    invoke-virtual {v2}, Lso1;->w()Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object v2

    .line 492
    check-cast v2, Ljava/lang/Boolean;

    .line 493
    .line 494
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 495
    .line 496
    .line 497
    move-result v2

    .line 498
    if-eqz v2, :cond_6

    .line 499
    .line 500
    iget-object v2, v15, Lbi2;->k:Lba4;

    .line 501
    .line 502
    invoke-virtual {v2}, Lba4;->d()Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v2

    .line 506
    move-object v14, v2

    .line 507
    check-cast v14, Lda3;

    .line 508
    .line 509
    const/4 v2, 0x3

    .line 510
    invoke-virtual {v14, v2}, Lda3;->i(I)V

    .line 511
    .line 512
    .line 513
    iget-object v2, v1, Lpc4;->u:Ljava/lang/String;

    .line 514
    .line 515
    invoke-virtual {v14, v2}, Lda3;->c(Ljava/lang/String;)V

    .line 516
    .line 517
    .line 518
    iget-object v1, v1, Lpc4;->r:Landroid/os/Bundle;

    .line 519
    .line 520
    invoke-virtual {v14, v1}, Lda3;->d(Landroid/os/Bundle;)V

    .line 521
    .line 522
    .line 523
    :cond_6
    move-object/from16 v1, p4

    .line 524
    .line 525
    iput-object v1, v0, Lz63;->o:Ly23;

    .line 526
    .line 527
    iget-object v1, v15, Lbi2;->r:Lba4;

    .line 528
    .line 529
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v1

    .line 533
    check-cast v1, Lnl2;

    .line 534
    .line 535
    invoke-virtual {v1}, Lnl2;->b()Lq93;

    .line 536
    .line 537
    .line 538
    move-result-object v2

    .line 539
    invoke-virtual {v1, v2}, Lnl2;->c(Ln70;)Lq93;

    .line 540
    .line 541
    .line 542
    move-result-object v1

    .line 543
    iput-object v1, v0, Lz63;->l:Lq93;

    .line 544
    .line 545
    new-instance v2, Lp21;

    .line 546
    .line 547
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 548
    .line 549
    .line 550
    iput-object v14, v2, Lp21;->f:Ljava/lang/Object;

    .line 551
    .line 552
    iput-object v5, v2, Lp21;->g:Ljava/lang/Object;

    .line 553
    .line 554
    iput-object v15, v2, Lp21;->h:Ljava/lang/Object;

    .line 555
    .line 556
    iput-object v0, v2, Lp21;->i:Ljava/lang/Object;

    .line 557
    .line 558
    new-instance v3, Ljq3;

    .line 559
    .line 560
    const/4 v5, 0x0

    .line 561
    invoke-direct {v3, v1, v2, v5}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 562
    .line 563
    .line 564
    invoke-virtual {v1, v3, v4}, Lq93;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 565
    .line 566
    .line 567
    return p3
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lz63;->l:Lq93;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lq93;->h:Ln70;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public final c()V
    .locals 9

    .line 1
    const-string v0, " already has a parent view. Removing its old parent."

    .line 2
    .line 3
    const-string v1, "Banner view provided from "

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-object v2, p0, Lz63;->l:Lq93;

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v2, :cond_5

    .line 10
    .line 11
    iget-object v2, v2, Lq93;->h:Ln70;

    .line 12
    .line 13
    invoke-interface {v2}, Ljava/util/concurrent/Future;->isDone()Z

    .line 14
    .line 15
    .line 16
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    if-eqz v2, :cond_5

    .line 18
    .line 19
    :try_start_1
    iget-object v2, p0, Lz63;->l:Lq93;

    .line 20
    .line 21
    iget-object v2, v2, Lq93;->h:Ln70;

    .line 22
    .line 23
    invoke-interface {v2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Lik2;

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    iput-object v4, p0, Lz63;->l:Lq93;

    .line 31
    .line 32
    iget-object v4, p0, Lz63;->f:Landroid/widget/FrameLayout;

    .line 33
    .line 34
    invoke-virtual {v4}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    iget-object v5, v2, Lik2;->m:Landroid/view/View;

    .line 41
    .line 42
    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    instance-of v6, v5, Landroid/view/ViewGroup;

    .line 47
    .line 48
    if-eqz v6, :cond_0

    .line 49
    .line 50
    iget-object v6, v2, Lel2;->f:Lrm2;

    .line 51
    .line 52
    iget-object v6, v6, Lrm2;->f:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    add-int/lit8 v7, v7, 0x4e

    .line 63
    .line 64
    new-instance v8, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    check-cast v5, Landroid/view/ViewGroup;

    .line 86
    .line 87
    iget-object v0, v2, Lik2;->m:Landroid/view/View;

    .line 88
    .line 89
    invoke-virtual {v5, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :catchall_0
    move-exception v0

    .line 94
    goto/16 :goto_2

    .line 95
    .line 96
    :cond_0
    :goto_0
    sget-object v0, Lmz1;->O8:Liz1;

    .line 97
    .line 98
    sget-object v1, Ltw1;->e:Ltw1;

    .line 99
    .line 100
    iget-object v5, v1, Ltw1;->c:Lkz1;

    .line 101
    .line 102
    invoke-virtual {v5, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    check-cast v5, Ljava/lang/Boolean;

    .line 107
    .line 108
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    if-eqz v5, :cond_1

    .line 113
    .line 114
    iget-object v5, v2, Lel2;->g:Lpo2;

    .line 115
    .line 116
    iget-object v5, v5, Lpo2;->f:Lug0;

    .line 117
    .line 118
    iget-object v6, p0, Lz63;->d:Ls23;

    .line 119
    .line 120
    iget-object v5, v5, Lug0;->g:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v5, Lpo2;

    .line 123
    .line 124
    iput-object v6, v5, Lpo2;->g:Ls23;

    .line 125
    .line 126
    iget-object v6, p0, Lz63;->e:Lu23;

    .line 127
    .line 128
    iput-object v6, v5, Lpo2;->h:Lu23;

    .line 129
    .line 130
    :cond_1
    iget-object v5, v2, Lik2;->m:Landroid/view/View;

    .line 131
    .line 132
    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 133
    .line 134
    .line 135
    iget-object v4, p0, Lz63;->o:Ly23;

    .line 136
    .line 137
    if-eqz v4, :cond_2

    .line 138
    .line 139
    invoke-interface {v4, v2}, Ly23;->w(Lel2;)V

    .line 140
    .line 141
    .line 142
    :cond_2
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 143
    .line 144
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    check-cast v0, Ljava/lang/Boolean;

    .line 149
    .line 150
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    if-eqz v0, :cond_3

    .line 155
    .line 156
    iget-object v0, p0, Lz63;->b:Ljava/util/concurrent/Executor;

    .line 157
    .line 158
    iget-object v1, p0, Lz63;->d:Ls23;

    .line 159
    .line 160
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    new-instance v4, Lbs2;

    .line 164
    .line 165
    const/16 v5, 0x11

    .line 166
    .line 167
    invoke-direct {v4, v5, v1}, Lbs2;-><init>(ILjava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    invoke-interface {v0, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 171
    .line 172
    .line 173
    :cond_3
    iget-object v0, v2, Lel2;->a:Lh83;

    .line 174
    .line 175
    iget-object v0, v0, Lh83;->b:Lp21;

    .line 176
    .line 177
    iget-object v0, v0, Lp21;->g:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v0, Lc83;

    .line 180
    .line 181
    iget v0, v0, Lc83;->d:I

    .line 182
    .line 183
    if-ltz v0, :cond_4

    .line 184
    .line 185
    const/4 v1, 0x0

    .line 186
    iput-boolean v1, p0, Lz63;->m:Z

    .line 187
    .line 188
    iget-object v1, p0, Lz63;->h:Lgo2;

    .line 189
    .line 190
    invoke-virtual {v1, v0}, Lgo2;->U1(I)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v2}, Lik2;->d()I

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    invoke-virtual {v1, v0}, Lgo2;->V1(I)V

    .line 198
    .line 199
    .line 200
    goto :goto_1

    .line 201
    :cond_4
    iput-boolean v3, p0, Lz63;->m:Z

    .line 202
    .line 203
    iget-object v0, p0, Lz63;->h:Lgo2;

    .line 204
    .line 205
    invoke-virtual {v2}, Lik2;->d()I

    .line 206
    .line 207
    .line 208
    move-result v1

    .line 209
    invoke-virtual {v0, v1}, Lgo2;->U1(I)V
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 210
    .line 211
    .line 212
    goto :goto_1

    .line 213
    :catch_0
    :try_start_2
    invoke-virtual {p0}, Lz63;->e()V

    .line 214
    .line 215
    .line 216
    invoke-static {}, Lgi2;->R()Z

    .line 217
    .line 218
    .line 219
    iput-boolean v3, p0, Lz63;->m:Z

    .line 220
    .line 221
    iget-object v0, p0, Lz63;->h:Lgo2;

    .line 222
    .line 223
    invoke-virtual {v0}, Lgo2;->r()V

    .line 224
    .line 225
    .line 226
    goto :goto_1

    .line 227
    :cond_5
    iget-object v0, p0, Lz63;->l:Lq93;

    .line 228
    .line 229
    if-eqz v0, :cond_6

    .line 230
    .line 231
    const-string v0, "Show timer went off but there is an ongoing ad request."

    .line 232
    .line 233
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    iput-boolean v3, p0, Lz63;->m:Z

    .line 237
    .line 238
    goto :goto_1

    .line 239
    :cond_6
    const-string v0, "No ad request was in progress or an ad was cached when show timer went off. Hence requesting a new ad."

    .line 240
    .line 241
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    iput-boolean v3, p0, Lz63;->m:Z

    .line 245
    .line 246
    iget-object v0, p0, Lz63;->h:Lgo2;

    .line 247
    .line 248
    invoke-virtual {v0}, Lgo2;->r()V

    .line 249
    .line 250
    .line 251
    :goto_1
    monitor-exit p0

    .line 252
    return-void

    .line 253
    :goto_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 254
    throw v0
.end method

.method public final d()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lz63;->f:Landroid/widget/FrameLayout;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v1, v0, Landroid/view/View;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return v0

    .line 13
    :cond_0
    check-cast v0, Landroid/view/View;

    .line 14
    .line 15
    sget-object v1, Lhg4;->C:Lhg4;

    .line 16
    .line 17
    iget-object v1, v1, Lhg4;->c:Llf4;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const/4 v3, 0x0

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    const-string v4, "power"

    .line 31
    .line 32
    invoke-virtual {v2, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Landroid/os/PowerManager;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    move-object v2, v3

    .line 40
    :goto_0
    const-string v4, "keyguard"

    .line 41
    .line 42
    invoke-virtual {v1, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    instance-of v4, v1, Landroid/app/KeyguardManager;

    .line 49
    .line 50
    if-eqz v4, :cond_2

    .line 51
    .line 52
    move-object v3, v1

    .line 53
    check-cast v3, Landroid/app/KeyguardManager;

    .line 54
    .line 55
    :cond_2
    invoke-static {v0, v2, v3}, Llf4;->r(Landroid/view/View;Landroid/os/PowerManager;Landroid/app/KeyguardManager;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    return v0
.end method

.method public final e()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lz63;->l:Lq93;

    .line 3
    .line 4
    iget-object v1, p0, Lz63;->n:Lnx2;

    .line 5
    .line 6
    iput-object v0, p0, Lz63;->n:Lnx2;

    .line 7
    .line 8
    sget-object v0, Lmz1;->O8:Liz1;

    .line 9
    .line 10
    sget-object v2, Ltw1;->e:Ltw1;

    .line 11
    .line 12
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 13
    .line 14
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    new-instance v0, Lsz2;

    .line 29
    .line 30
    const/4 v2, 0x6

    .line 31
    invoke-direct {v0, p0, v1, v2}, Lsz2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, Lz63;->b:Ljava/util/concurrent/Executor;

    .line 35
    .line 36
    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    iget-object v0, p0, Lz63;->o:Ly23;

    .line 40
    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    invoke-interface {v0}, Ly23;->a()V

    .line 44
    .line 45
    .line 46
    :cond_1
    return-void
.end method
