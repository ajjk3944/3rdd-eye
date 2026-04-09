.class public final Lq73;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Lth2;

.field public final d:Ls23;

.field public final e:Ls73;

.field public f:Lvz1;

.field public final g:Lea3;

.field public final h:Lk83;

.field public i:Lq93;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lth2;Ls23;Ls73;Lk83;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq73;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lq73;->b:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    iput-object p3, p0, Lq73;->c:Lth2;

    .line 9
    .line 10
    iput-object p4, p0, Lq73;->d:Ls23;

    .line 11
    .line 12
    iput-object p6, p0, Lq73;->h:Lk83;

    .line 13
    .line 14
    iput-object p5, p0, Lq73;->e:Ls73;

    .line 15
    .line 16
    invoke-virtual {p3}, Lth2;->c()Lea3;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lq73;->g:Lea3;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final a(Lpc4;Ljava/lang/String;Lm54;Ly23;)Z
    .locals 24

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
    const/4 v3, 0x0

    .line 8
    iget-object v8, v1, Lq73;->b:Ljava/util/concurrent/Executor;

    .line 9
    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    const-string v0, "Ad unit ID should not be null for interstitial ad."

    .line 13
    .line 14
    invoke-static {v0}, Lgi2;->Z(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    new-instance v0, Lbs2;

    .line 18
    .line 19
    const/16 v2, 0x12

    .line 20
    .line 21
    invoke-direct {v0, v2, v1}, Lbs2;-><init>(ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v8, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 25
    .line 26
    .line 27
    return v3

    .line 28
    :cond_0
    invoke-virtual {v1}, Lq73;->b()Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_1

    .line 33
    .line 34
    return v3

    .line 35
    :cond_1
    sget-object v3, Lmz1;->I9:Liz1;

    .line 36
    .line 37
    sget-object v4, Ltw1;->e:Ltw1;

    .line 38
    .line 39
    iget-object v5, v4, Ltw1;->c:Lkz1;

    .line 40
    .line 41
    invoke-virtual {v5, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    check-cast v3, Ljava/lang/Boolean;

    .line 46
    .line 47
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    const/4 v9, 0x1

    .line 52
    iget-object v5, v1, Lq73;->c:Lth2;

    .line 53
    .line 54
    if-eqz v3, :cond_2

    .line 55
    .line 56
    iget-boolean v3, v0, Lpc4;->k:Z

    .line 57
    .line 58
    if-eqz v3, :cond_2

    .line 59
    .line 60
    iget-object v3, v5, Lth2;->z:Lba4;

    .line 61
    .line 62
    invoke-virtual {v3}, Lba4;->d()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    check-cast v3, Lzw2;

    .line 67
    .line 68
    invoke-virtual {v3, v9}, Lzw2;->b(Z)V

    .line 69
    .line 70
    .line 71
    :cond_2
    move-object/from16 v3, p3

    .line 72
    .line 73
    check-cast v3, Ln73;

    .line 74
    .line 75
    iget-object v3, v3, Ln73;->g:Lxe4;

    .line 76
    .line 77
    new-instance v6, Landroid/util/Pair;

    .line 78
    .line 79
    iget-wide v10, v0, Lpc4;->E:J

    .line 80
    .line 81
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    const-string v10, "api-call"

    .line 86
    .line 87
    invoke-direct {v6, v10, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    new-instance v7, Landroid/util/Pair;

    .line 91
    .line 92
    sget-object v10, Lhg4;->C:Lhg4;

    .line 93
    .line 94
    iget-object v10, v10, Lhg4;->k:Lym;

    .line 95
    .line 96
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 100
    .line 101
    .line 102
    move-result-wide v10

    .line 103
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 104
    .line 105
    .line 106
    move-result-object v10

    .line 107
    const-string v11, "dynamite-enter"

    .line 108
    .line 109
    invoke-direct {v7, v11, v10}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    filled-new-array {v6, v7}, [Landroid/util/Pair;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    invoke-static {v6}, Lbd2;->C([Landroid/util/Pair;)Landroid/os/Bundle;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    iget-object v7, v1, Lq73;->h:Lk83;

    .line 121
    .line 122
    iput-object v2, v7, Lk83;->c:Ljava/lang/String;

    .line 123
    .line 124
    iput-object v3, v7, Lk83;->b:Lxe4;

    .line 125
    .line 126
    iput-object v0, v7, Lk83;->a:Lpc4;

    .line 127
    .line 128
    iput-object v6, v7, Lk83;->t:Landroid/os/Bundle;

    .line 129
    .line 130
    invoke-virtual {v7}, Lk83;->a()Ll83;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-static {v2}, Lqb1;->N(Ll83;)I

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    iget-object v6, v1, Lq73;->a:Landroid/content/Context;

    .line 139
    .line 140
    const/4 v7, 0x4

    .line 141
    invoke-static {v6, v3, v7, v0}, Laa3;->g(Landroid/content/Context;IILpc4;)Laa3;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    sget-object v10, Lmz1;->Q8:Liz1;

    .line 146
    .line 147
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 148
    .line 149
    invoke-virtual {v4, v10}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    check-cast v4, Ljava/lang/Boolean;

    .line 154
    .line 155
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 156
    .line 157
    .line 158
    move-result v4

    .line 159
    iget-object v10, v1, Lq73;->d:Ls23;

    .line 160
    .line 161
    if-eqz v4, :cond_3

    .line 162
    .line 163
    iget-object v12, v5, Lth2;->b:Lth2;

    .line 164
    .line 165
    new-instance v4, Lmm2;

    .line 166
    .line 167
    invoke-direct {v4}, Lmm2;-><init>()V

    .line 168
    .line 169
    .line 170
    iput-object v6, v4, Lmm2;->a:Landroid/content/Context;

    .line 171
    .line 172
    iput-object v2, v4, Lmm2;->b:Ljava/lang/Object;

    .line 173
    .line 174
    new-instance v15, Lmm2;

    .line 175
    .line 176
    invoke-direct {v15, v4}, Lmm2;-><init>(Lmm2;)V

    .line 177
    .line 178
    .line 179
    new-instance v2, Lep2;

    .line 180
    .line 181
    invoke-direct {v2}, Lep2;-><init>()V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v2, v10, v8}, Lep2;->d(Ljo2;Ljava/util/concurrent/Executor;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v2, v10, v8}, Lep2;->b(Lb8;Ljava/util/concurrent/Executor;)V

    .line 188
    .line 189
    .line 190
    new-instance v14, Lfp2;

    .line 191
    .line 192
    invoke-direct {v14, v2}, Lfp2;-><init>(Lep2;)V

    .line 193
    .line 194
    .line 195
    new-instance v2, Lf23;

    .line 196
    .line 197
    iget-object v4, v1, Lq73;->f:Lvz1;

    .line 198
    .line 199
    const/4 v5, 0x0

    .line 200
    invoke-direct {v2, v5, v4}, Lf23;-><init>(ILjava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    new-instance v11, Lei2;

    .line 204
    .line 205
    new-instance v13, Ltv2;

    .line 206
    .line 207
    const/4 v4, 0x0

    .line 208
    invoke-direct {v13, v4, v5}, Ltv2;-><init>(IB)V

    .line 209
    .line 210
    .line 211
    new-instance v4, Lf23;

    .line 212
    .line 213
    const/16 v5, 0x19

    .line 214
    .line 215
    invoke-direct {v4, v5}, Lf23;-><init>(I)V

    .line 216
    .line 217
    .line 218
    const/16 v18, 0x0

    .line 219
    .line 220
    const/16 v19, 0x0

    .line 221
    .line 222
    move-object/from16 v17, v2

    .line 223
    .line 224
    move-object/from16 v16, v4

    .line 225
    .line 226
    invoke-direct/range {v11 .. v19}, Lei2;-><init>(Lth2;Ltv2;Lfp2;Lmm2;Lf23;Lf23;Lm73;Lb73;)V

    .line 227
    .line 228
    .line 229
    move-object v5, v11

    .line 230
    goto/16 :goto_0

    .line 231
    .line 232
    :cond_3
    new-instance v4, Lep2;

    .line 233
    .line 234
    invoke-direct {v4}, Lep2;-><init>()V

    .line 235
    .line 236
    .line 237
    iget-object v11, v4, Lep2;->h:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast v11, Ljava/util/HashSet;

    .line 240
    .line 241
    iget-object v12, v4, Lep2;->e:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast v12, Ljava/util/HashSet;

    .line 244
    .line 245
    iget-object v13, v1, Lq73;->e:Ls73;

    .line 246
    .line 247
    if-eqz v13, :cond_4

    .line 248
    .line 249
    new-instance v14, Lup2;

    .line 250
    .line 251
    invoke-direct {v14, v13, v8}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v12, v14}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    new-instance v14, Lup2;

    .line 258
    .line 259
    invoke-direct {v14, v13, v8}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v11, v14}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    invoke-virtual {v4, v13, v8}, Lep2;->a(Lwm2;Ljava/util/concurrent/Executor;)V

    .line 266
    .line 267
    .line 268
    :cond_4
    iget-object v5, v5, Lth2;->b:Lth2;

    .line 269
    .line 270
    new-instance v13, Lmm2;

    .line 271
    .line 272
    invoke-direct {v13}, Lmm2;-><init>()V

    .line 273
    .line 274
    .line 275
    iput-object v6, v13, Lmm2;->a:Landroid/content/Context;

    .line 276
    .line 277
    iput-object v2, v13, Lmm2;->b:Ljava/lang/Object;

    .line 278
    .line 279
    new-instance v2, Lmm2;

    .line 280
    .line 281
    invoke-direct {v2, v13}, Lmm2;-><init>(Lmm2;)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v4, v10, v8}, Lep2;->d(Ljo2;Ljava/util/concurrent/Executor;)V

    .line 285
    .line 286
    .line 287
    new-instance v6, Lup2;

    .line 288
    .line 289
    invoke-direct {v6, v10, v8}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v12, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    new-instance v6, Lup2;

    .line 296
    .line 297
    invoke-direct {v6, v10, v8}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v11, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    invoke-virtual {v4, v10, v8}, Lep2;->a(Lwm2;Ljava/util/concurrent/Executor;)V

    .line 304
    .line 305
    .line 306
    new-instance v6, Lup2;

    .line 307
    .line 308
    invoke-direct {v6, v10, v8}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 309
    .line 310
    .line 311
    iget-object v11, v4, Lep2;->c:Ljava/lang/Object;

    .line 312
    .line 313
    check-cast v11, Ljava/util/HashSet;

    .line 314
    .line 315
    invoke-virtual {v11, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    invoke-virtual {v4, v10, v8}, Lep2;->c(Lxp2;Ljava/util/concurrent/Executor;)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v4, v10, v8}, Lep2;->b(Lb8;Ljava/util/concurrent/Executor;)V

    .line 322
    .line 323
    .line 324
    new-instance v6, Lup2;

    .line 325
    .line 326
    invoke-direct {v6, v10, v8}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 327
    .line 328
    .line 329
    iget-object v11, v4, Lep2;->m:Ljava/lang/Object;

    .line 330
    .line 331
    check-cast v11, Ljava/util/HashSet;

    .line 332
    .line 333
    invoke-virtual {v11, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    new-instance v6, Lup2;

    .line 337
    .line 338
    invoke-direct {v6, v10, v8}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 339
    .line 340
    .line 341
    iget-object v10, v4, Lep2;->l:Ljava/lang/Object;

    .line 342
    .line 343
    check-cast v10, Ljava/util/HashSet;

    .line 344
    .line 345
    invoke-virtual {v10, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    new-instance v6, Lfp2;

    .line 349
    .line 350
    invoke-direct {v6, v4}, Lfp2;-><init>(Lep2;)V

    .line 351
    .line 352
    .line 353
    new-instance v4, Lf23;

    .line 354
    .line 355
    iget-object v10, v1, Lq73;->f:Lvz1;

    .line 356
    .line 357
    const/4 v11, 0x0

    .line 358
    invoke-direct {v4, v11, v10}, Lf23;-><init>(ILjava/lang/Object;)V

    .line 359
    .line 360
    .line 361
    new-instance v15, Lei2;

    .line 362
    .line 363
    new-instance v10, Ltv2;

    .line 364
    .line 365
    const/4 v12, 0x0

    .line 366
    invoke-direct {v10, v11, v12}, Ltv2;-><init>(IB)V

    .line 367
    .line 368
    .line 369
    new-instance v11, Lf23;

    .line 370
    .line 371
    const/16 v12, 0x19

    .line 372
    .line 373
    invoke-direct {v11, v12}, Lf23;-><init>(I)V

    .line 374
    .line 375
    .line 376
    const/16 v22, 0x0

    .line 377
    .line 378
    const/16 v23, 0x0

    .line 379
    .line 380
    move-object/from16 v19, v2

    .line 381
    .line 382
    move-object/from16 v21, v4

    .line 383
    .line 384
    move-object/from16 v16, v5

    .line 385
    .line 386
    move-object/from16 v18, v6

    .line 387
    .line 388
    move-object/from16 v17, v10

    .line 389
    .line 390
    move-object/from16 v20, v11

    .line 391
    .line 392
    invoke-direct/range {v15 .. v23}, Lei2;-><init>(Lth2;Ltv2;Lfp2;Lmm2;Lf23;Lf23;Lm73;Lb73;)V

    .line 393
    .line 394
    .line 395
    move-object v5, v15

    .line 396
    :goto_0
    sget-object v2, Ln02;->c:Lso1;

    .line 397
    .line 398
    invoke-virtual {v2}, Lso1;->w()Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v2

    .line 402
    check-cast v2, Ljava/lang/Boolean;

    .line 403
    .line 404
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 405
    .line 406
    .line 407
    move-result v2

    .line 408
    if-eqz v2, :cond_5

    .line 409
    .line 410
    iget-object v2, v5, Lei2;->h:Lba4;

    .line 411
    .line 412
    invoke-virtual {v2}, Lba4;->d()Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v2

    .line 416
    check-cast v2, Lda3;

    .line 417
    .line 418
    invoke-virtual {v2, v7}, Lda3;->i(I)V

    .line 419
    .line 420
    .line 421
    iget-object v4, v0, Lpc4;->u:Ljava/lang/String;

    .line 422
    .line 423
    invoke-virtual {v2, v4}, Lda3;->c(Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    iget-object v0, v0, Lpc4;->r:Landroid/os/Bundle;

    .line 427
    .line 428
    invoke-virtual {v2, v0}, Lda3;->d(Landroid/os/Bundle;)V

    .line 429
    .line 430
    .line 431
    goto :goto_1

    .line 432
    :cond_5
    const/4 v2, 0x0

    .line 433
    :goto_1
    iget-object v0, v5, Lei2;->m:Lba4;

    .line 434
    .line 435
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object v0

    .line 439
    check-cast v0, Lnl2;

    .line 440
    .line 441
    invoke-virtual {v0}, Lnl2;->b()Lq93;

    .line 442
    .line 443
    .line 444
    move-result-object v4

    .line 445
    invoke-virtual {v0, v4}, Lnl2;->c(Ln70;)Lq93;

    .line 446
    .line 447
    .line 448
    move-result-object v10

    .line 449
    iput-object v10, v1, Lq73;->i:Lq93;

    .line 450
    .line 451
    new-instance v0, Lg4;

    .line 452
    .line 453
    const/16 v6, 0xe

    .line 454
    .line 455
    const/4 v7, 0x0

    .line 456
    move-object v4, v3

    .line 457
    move-object v3, v2

    .line 458
    move-object/from16 v2, p4

    .line 459
    .line 460
    invoke-direct/range {v0 .. v7}, Lg4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 461
    .line 462
    .line 463
    new-instance v1, Ljq3;

    .line 464
    .line 465
    const/4 v2, 0x0

    .line 466
    invoke-direct {v1, v10, v0, v2}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 467
    .line 468
    .line 469
    invoke-virtual {v10, v1, v8}, Lq93;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 470
    .line 471
    .line 472
    return v9
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lq73;->i:Lq93;

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
