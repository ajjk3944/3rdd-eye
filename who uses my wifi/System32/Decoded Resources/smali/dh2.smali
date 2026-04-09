.class public final Ldh2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lrs1;


# instance fields
.field public final f:Landroid/content/Context;

.field public final g:Lz71;


# direct methods
.method public constructor <init>(Landroid/content/Context;Le51;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldh2;->f:Landroid/content/Context;

    .line 5
    .line 6
    sget-object v0, Lmz1;->X2:Liz1;

    .line 7
    .line 8
    sget-object v1, Ltw1;->e:Ltw1;

    .line 9
    .line 10
    iget-object v2, v1, Ltw1;->c:Lkz1;

    .line 11
    .line 12
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v2, 0x2

    .line 23
    const/4 v3, 0x1

    .line 24
    if-eq v0, v3, :cond_1

    .line 25
    .line 26
    const/4 v4, 0x3

    .line 27
    if-eq v0, v2, :cond_2

    .line 28
    .line 29
    if-eq v0, v4, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 v4, 0x4

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move v4, v2

    .line 35
    :cond_2
    :goto_0
    invoke-static {}, Lag3;->E()Lzf3;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sget-object v5, Lmz1;->e3:Liz1;

    .line 40
    .line 41
    iget-object v6, v1, Ltw1;->c:Lkz1;

    .line 42
    .line 43
    invoke-virtual {v6, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    check-cast v5, Ljava/lang/Float;

    .line 48
    .line 49
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    invoke-virtual {v0}, Ln54;->b()V

    .line 54
    .line 55
    .line 56
    iget-object v6, v0, Ln54;->g:Lp54;

    .line 57
    .line 58
    check-cast v6, Lag3;

    .line 59
    .line 60
    invoke-virtual {v6, v5}, Lag3;->G(F)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Ln54;->d()Lp54;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    check-cast v0, Lag3;

    .line 68
    .line 69
    invoke-static {}, Lcg3;->E()Lbg3;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    sget-object v6, Lmz1;->f3:Liz1;

    .line 74
    .line 75
    iget-object v7, v1, Ltw1;->c:Lkz1;

    .line 76
    .line 77
    invoke-virtual {v7, v6}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    check-cast v6, Ljava/lang/Boolean;

    .line 82
    .line 83
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    invoke-virtual {v5}, Ln54;->b()V

    .line 88
    .line 89
    .line 90
    iget-object v7, v5, Ln54;->g:Lp54;

    .line 91
    .line 92
    check-cast v7, Lcg3;

    .line 93
    .line 94
    invoke-virtual {v7, v6}, Lcg3;->G(Z)V

    .line 95
    .line 96
    .line 97
    sget-object v6, Lmz1;->h3:Liz1;

    .line 98
    .line 99
    iget-object v7, v1, Ltw1;->c:Lkz1;

    .line 100
    .line 101
    invoke-virtual {v7, v6}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    check-cast v6, Ljava/lang/Long;

    .line 106
    .line 107
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 108
    .line 109
    .line 110
    move-result-wide v6

    .line 111
    invoke-virtual {v5}, Ln54;->b()V

    .line 112
    .line 113
    .line 114
    iget-object v8, v5, Ln54;->g:Lp54;

    .line 115
    .line 116
    check-cast v8, Lcg3;

    .line 117
    .line 118
    invoke-virtual {v8, v6, v7}, Lcg3;->H(J)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v5}, Ln54;->d()Lp54;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    check-cast v5, Lcg3;

    .line 126
    .line 127
    invoke-static {}, Lvf3;->U()Luf3;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    invoke-virtual {v6}, Ln54;->b()V

    .line 132
    .line 133
    .line 134
    iget-object v7, v6, Ln54;->g:Lp54;

    .line 135
    .line 136
    check-cast v7, Lvf3;

    .line 137
    .line 138
    invoke-virtual {v7, v4}, Lvf3;->C(I)V

    .line 139
    .line 140
    .line 141
    iget-object p2, p2, Le51;->f:Ljava/lang/String;

    .line 142
    .line 143
    invoke-virtual {v6}, Ln54;->b()V

    .line 144
    .line 145
    .line 146
    iget-object v4, v6, Ln54;->g:Lp54;

    .line 147
    .line 148
    check-cast v4, Lvf3;

    .line 149
    .line 150
    invoke-virtual {v4, p2}, Lvf3;->W(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    sget-object p2, Lmz1;->B2:Liz1;

    .line 154
    .line 155
    iget-object v4, v1, Ltw1;->c:Lkz1;

    .line 156
    .line 157
    invoke-virtual {v4, p2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    check-cast p2, Ljava/lang/Boolean;

    .line 162
    .line 163
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 164
    .line 165
    .line 166
    move-result p2

    .line 167
    invoke-virtual {v6}, Ln54;->b()V

    .line 168
    .line 169
    .line 170
    iget-object v4, v6, Ln54;->g:Lp54;

    .line 171
    .line 172
    check-cast v4, Lvf3;

    .line 173
    .line 174
    invoke-virtual {v4, p2}, Lvf3;->V(Z)V

    .line 175
    .line 176
    .line 177
    sget-object p2, Lmz1;->U2:Liz1;

    .line 178
    .line 179
    iget-object v4, v1, Ltw1;->c:Lkz1;

    .line 180
    .line 181
    invoke-virtual {v4, p2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object p2

    .line 185
    check-cast p2, Ljava/lang/Integer;

    .line 186
    .line 187
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 188
    .line 189
    .line 190
    move-result p2

    .line 191
    const/4 v4, -0x1

    .line 192
    if-ne p2, v4, :cond_3

    .line 193
    .line 194
    move p2, v3

    .line 195
    goto :goto_1

    .line 196
    :cond_3
    const/4 p2, 0x0

    .line 197
    :goto_1
    invoke-virtual {v6}, Ln54;->b()V

    .line 198
    .line 199
    .line 200
    iget-object v4, v6, Ln54;->g:Lp54;

    .line 201
    .line 202
    check-cast v4, Lvf3;

    .line 203
    .line 204
    invoke-virtual {v4, p2}, Lvf3;->A(Z)V

    .line 205
    .line 206
    .line 207
    sget-object p2, Lmz1;->W2:Liz1;

    .line 208
    .line 209
    iget-object v4, v1, Ltw1;->c:Lkz1;

    .line 210
    .line 211
    invoke-virtual {v4, p2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p2

    .line 215
    check-cast p2, Ljava/lang/Integer;

    .line 216
    .line 217
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 218
    .line 219
    .line 220
    move-result p2

    .line 221
    int-to-long v7, p2

    .line 222
    invoke-virtual {v6}, Ln54;->b()V

    .line 223
    .line 224
    .line 225
    iget-object p2, v6, Ln54;->g:Lp54;

    .line 226
    .line 227
    check-cast p2, Lvf3;

    .line 228
    .line 229
    invoke-virtual {p2, v7, v8}, Lvf3;->b0(J)V

    .line 230
    .line 231
    .line 232
    sget-object p2, Lmz1;->g3:Liz1;

    .line 233
    .line 234
    iget-object v4, v1, Ltw1;->c:Lkz1;

    .line 235
    .line 236
    invoke-virtual {v4, p2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object p2

    .line 240
    check-cast p2, Ljava/lang/Long;

    .line 241
    .line 242
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 243
    .line 244
    .line 245
    move-result-wide v7

    .line 246
    invoke-virtual {v6}, Ln54;->b()V

    .line 247
    .line 248
    .line 249
    iget-object p2, v6, Ln54;->g:Lp54;

    .line 250
    .line 251
    check-cast p2, Lvf3;

    .line 252
    .line 253
    invoke-virtual {p2, v7, v8}, Lvf3;->Z(J)V

    .line 254
    .line 255
    .line 256
    sget-object p2, Lmz1;->V2:Liz1;

    .line 257
    .line 258
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 259
    .line 260
    invoke-virtual {v1, p2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object p2

    .line 264
    check-cast p2, Ljava/lang/Integer;

    .line 265
    .line 266
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 267
    .line 268
    .line 269
    move-result p2

    .line 270
    int-to-long v7, p2

    .line 271
    invoke-virtual {v6}, Ln54;->b()V

    .line 272
    .line 273
    .line 274
    iget-object p2, v6, Ln54;->g:Lp54;

    .line 275
    .line 276
    check-cast p2, Lvf3;

    .line 277
    .line 278
    invoke-virtual {p2, v7, v8}, Lvf3;->Y(J)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v6}, Ln54;->b()V

    .line 282
    .line 283
    .line 284
    iget-object p2, v6, Ln54;->g:Lp54;

    .line 285
    .line 286
    check-cast p2, Lvf3;

    .line 287
    .line 288
    invoke-virtual {p2, v0}, Lvf3;->X(Lag3;)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v6}, Ln54;->b()V

    .line 292
    .line 293
    .line 294
    iget-object p2, v6, Ln54;->g:Lp54;

    .line 295
    .line 296
    check-cast p2, Lvf3;

    .line 297
    .line 298
    invoke-virtual {p2, v5}, Lvf3;->a0(Lcg3;)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v6}, Ln54;->d()Lp54;

    .line 302
    .line 303
    .line 304
    move-result-object p2

    .line 305
    check-cast p2, Lvf3;

    .line 306
    .line 307
    sget-object v0, Lmd2;->a:Lld2;

    .line 308
    .line 309
    sget-object v1, Lz71;->h:Ljava/lang/Object;

    .line 310
    .line 311
    monitor-enter v1

    .line 312
    :try_start_0
    sget-object v4, Lz71;->i:Lz71;

    .line 313
    .line 314
    if-nez v4, :cond_4

    .line 315
    .line 316
    new-instance v4, Lz71;

    .line 317
    .line 318
    invoke-direct {v4, p1, v0, p2}, Lz71;-><init>(Landroid/content/Context;Lld2;Lvf3;)V

    .line 319
    .line 320
    .line 321
    sput-object v4, Lz71;->i:Lz71;

    .line 322
    .line 323
    goto :goto_2

    .line 324
    :catchall_0
    move-exception p1

    .line 325
    goto/16 :goto_6

    .line 326
    .line 327
    :cond_4
    :goto_2
    sget-object p1, Lz71;->i:Lz71;

    .line 328
    .line 329
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 330
    iput-object p1, p0, Ldh2;->g:Lz71;

    .line 331
    .line 332
    iget-object p1, p1, Lz71;->g:Ljava/lang/Object;

    .line 333
    .line 334
    check-cast p1, Ltf3;

    .line 335
    .line 336
    iget-object p1, p1, Ltf3;->a:Log3;

    .line 337
    .line 338
    monitor-enter p1

    .line 339
    :try_start_1
    iget-object p2, p1, Log3;->e:Lrp3;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 340
    .line 341
    if-eqz p2, :cond_5

    .line 342
    .line 343
    monitor-exit p1

    .line 344
    return-void

    .line 345
    :cond_5
    :try_start_2
    iget-object p2, p1, Log3;->b:Lz94;

    .line 346
    .line 347
    invoke-interface {p2}, Lz94;->d()Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object p2

    .line 351
    check-cast p2, Ljava/util/Set;

    .line 352
    .line 353
    new-instance v0, Ljava/util/ArrayList;

    .line 354
    .line 355
    invoke-interface {p2}, Ljava/util/Set;->size()I

    .line 356
    .line 357
    .line 358
    move-result v1

    .line 359
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 360
    .line 361
    .line 362
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 363
    .line 364
    .line 365
    move-result-object p2

    .line 366
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 367
    .line 368
    .line 369
    move-result v1

    .line 370
    if-eqz v1, :cond_6

    .line 371
    .line 372
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v1

    .line 376
    check-cast v1, Lng3;

    .line 377
    .line 378
    invoke-interface {v1}, Lng3;->a()Ln70;

    .line 379
    .line 380
    .line 381
    move-result-object v1

    .line 382
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 383
    .line 384
    .line 385
    goto :goto_3

    .line 386
    :catchall_1
    move-exception p2

    .line 387
    goto :goto_5

    .line 388
    :cond_6
    iget-object p2, p1, Log3;->d:Lz94;

    .line 389
    .line 390
    invoke-interface {p2}, Lz94;->d()Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object p2

    .line 394
    check-cast p2, Lgk3;

    .line 395
    .line 396
    new-instance v1, Lzp3;

    .line 397
    .line 398
    invoke-static {v0}, Lxm3;->m(Ljava/util/Collection;)Lxm3;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    invoke-direct {v1, v0, v3}, Lzp3;-><init>(Lxm3;Z)V

    .line 403
    .line 404
    .line 405
    iget-object v0, p1, Log3;->c:Ljava/util/concurrent/ExecutorService;

    .line 406
    .line 407
    sget-object v3, Lgj1;->v:Lgj1;

    .line 408
    .line 409
    invoke-static {v1, v3, v0}, Lpu1;->P(Ln70;Lzk3;Ljava/util/concurrent/Executor;)Lrp3;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    invoke-virtual {p2, v2, v0}, Lgk3;->d(ILn70;)V

    .line 414
    .line 415
    .line 416
    iput-object v0, p1, Log3;->e:Lrp3;

    .line 417
    .line 418
    iget-object p2, p1, Log3;->a:Lz94;

    .line 419
    .line 420
    invoke-interface {p2}, Lz94;->d()Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object p2

    .line 424
    check-cast p2, Ljava/util/Set;

    .line 425
    .line 426
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 427
    .line 428
    .line 429
    move-result-object p2

    .line 430
    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 431
    .line 432
    .line 433
    move-result v0

    .line 434
    if-eqz v0, :cond_7

    .line 435
    .line 436
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v0

    .line 440
    check-cast v0, Lng3;

    .line 441
    .line 442
    invoke-interface {v0}, Lng3;->a()Ln70;

    .line 443
    .line 444
    .line 445
    goto :goto_4

    .line 446
    :cond_7
    iget-object p2, p1, Log3;->e:Lrp3;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 447
    .line 448
    if-eqz p2, :cond_8

    .line 449
    .line 450
    monitor-exit p1

    .line 451
    return-void

    .line 452
    :cond_8
    const/4 p2, 0x0

    .line 453
    :try_start_3
    throw p2

    .line 454
    :goto_5
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 455
    throw p2

    .line 456
    :goto_6
    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 457
    throw p1
.end method


# virtual methods
.method public final a(III)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    sget-object v3, Lsv1;->f:Lsv1;

    .line 8
    .line 9
    iget-object v3, v3, Lsv1;->a:Lj63;

    .line 10
    .line 11
    iget-object v3, v0, Ldh2;->f:Landroid/content/Context;

    .line 12
    .line 13
    invoke-static {v3, v1}, Lj63;->b(Landroid/content/Context;I)I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    int-to-float v10, v4

    .line 18
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-static {v4, v2}, Lj63;->m(Landroid/util/DisplayMetrics;I)I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    int-to-float v11, v4

    .line 31
    move/from16 v4, p3

    .line 32
    .line 33
    int-to-long v14, v4

    .line 34
    const/4 v9, 0x0

    .line 35
    const/4 v12, 0x0

    .line 36
    const-wide/16 v5, 0x0

    .line 37
    .line 38
    move-wide v7, v14

    .line 39
    invoke-static/range {v5 .. v12}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    iget-object v5, v0, Ldh2;->g:Lz71;

    .line 44
    .line 45
    invoke-virtual {v5, v4}, Lz71;->t(Landroid/view/MotionEvent;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4}, Landroid/view/MotionEvent;->recycle()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-static {v4, v1}, Lj63;->m(Landroid/util/DisplayMetrics;I)I

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    int-to-float v4, v4

    .line 64
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    invoke-static {v6, v2}, Lj63;->m(Landroid/util/DisplayMetrics;I)I

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    int-to-float v6, v6

    .line 77
    const/16 v19, 0x0

    .line 78
    .line 79
    const-wide/16 v12, 0x0

    .line 80
    .line 81
    const/16 v16, 0x2

    .line 82
    .line 83
    move/from16 v17, v4

    .line 84
    .line 85
    move/from16 v18, v6

    .line 86
    .line 87
    invoke-static/range {v12 .. v19}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-virtual {v5, v4}, Lz71;->t(Landroid/view/MotionEvent;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4}, Landroid/view/MotionEvent;->recycle()V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    invoke-static {v4, v1}, Lj63;->m(Landroid/util/DisplayMetrics;I)I

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    int-to-float v1, v1

    .line 110
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    invoke-static {v3, v2}, Lj63;->m(Landroid/util/DisplayMetrics;I)I

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    int-to-float v2, v2

    .line 123
    const/16 v16, 0x1

    .line 124
    .line 125
    move/from16 v17, v1

    .line 126
    .line 127
    move/from16 v18, v2

    .line 128
    .line 129
    invoke-static/range {v12 .. v19}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-virtual {v5, v1}, Lz71;->t(Landroid/view/MotionEvent;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V

    .line 137
    .line 138
    .line 139
    return-void
.end method

.method public final b(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Ldh2;->g:Lz71;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lz71;->o(Landroid/content/Context;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final c([Ljava/lang/StackTraceElement;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldh2;->g:Lz71;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, v0, Lz71;->g:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ltf3;

    .line 10
    .line 11
    iget-object v0, v0, Ltf3;->c:Lxj3;

    .line 12
    .line 13
    iget-object v0, v0, Lxj3;->b:Lbk3;

    .line 14
    .line 15
    monitor-enter v0

    .line 16
    :try_start_0
    iget-object v1, v0, Lbk3;->a:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    monitor-exit v0

    .line 25
    return-void

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    throw p1
.end method

.method public final d(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Ldh2;->g:Lz71;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lz71;->o(Landroid/content/Context;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final e(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final f(Landroid/view/MotionEvent;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Ldh2;->g:Lz71;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lz71;->t(Landroid/view/MotionEvent;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final g(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Ldh2;->g:Lz71;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lz71;->q(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final h(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p4, p0, Ldh2;->g:Lz71;

    .line 2
    .line 3
    invoke-virtual {p4, p1, p2, p3}, Lz71;->q(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final i(Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Ldh2;->g:Lz71;

    .line 2
    .line 3
    iget-object v0, v0, Lz71;->g:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ltf3;

    .line 6
    .line 7
    iget-object v1, v0, Ltf3;->d:Lgk3;

    .line 8
    .line 9
    const/4 v2, 0x4

    .line 10
    invoke-virtual {v1, v2}, Lgk3;->a(I)Lfk3;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :try_start_0
    invoke-virtual {v1}, Lfk3;->a()V

    .line 15
    .line 16
    .line 17
    iget-object v2, v0, Ltf3;->a:Log3;

    .line 18
    .line 19
    monitor-enter v2
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    :try_start_1
    iget-object v3, v2, Log3;->e:Lrp3;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 21
    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    :try_start_2
    monitor-exit v2

    .line 25
    new-instance v2, Lk62;

    .line 26
    .line 27
    invoke-direct {v2, v0, p1, p2, p3}, Lk62;-><init>(Ltf3;Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;)V

    .line 28
    .line 29
    .line 30
    sget-object p1, Ldq3;->f:Ldq3;

    .line 31
    .line 32
    invoke-static {v3, v2, p1}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iget-wide p2, v0, Ltf3;->e:J

    .line 37
    .line 38
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 39
    .line 40
    invoke-virtual {p1, p2, p3, v0}, Lgp3;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, Ljava/lang/String;
    :try_end_2
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 45
    .line 46
    goto :goto_4

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    goto :goto_0

    .line 49
    :catch_0
    move-exception p1

    .line 50
    goto :goto_1

    .line 51
    :catch_1
    move-exception p1

    .line 52
    goto :goto_2

    .line 53
    :catch_2
    move-exception p1

    .line 54
    goto :goto_3

    .line 55
    :cond_0
    const/4 p1, 0x0

    .line 56
    :try_start_3
    throw p1

    .line 57
    :catchall_1
    move-exception p1

    .line 58
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 59
    :try_start_4
    throw p1
    :try_end_4
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 60
    :goto_0
    :try_start_5
    invoke-virtual {v1, p1}, Lfk3;->b(Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    throw p1

    .line 64
    :catchall_2
    move-exception p1

    .line 65
    goto :goto_5

    .line 66
    :goto_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-virtual {p2}, Ljava/lang/Thread;->interrupt()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, p1}, Lfk3;->b(Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    const-string p1, ""

    .line 77
    .line 78
    goto :goto_4

    .line 79
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    if-eqz p2, :cond_1

    .line 84
    .line 85
    move-object p1, p2

    .line 86
    :cond_1
    invoke-virtual {v1, p1}, Lfk3;->b(Ljava/lang/Throwable;)V

    .line 87
    .line 88
    .line 89
    const/4 p1, 0x3

    .line 90
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    goto :goto_4

    .line 95
    :goto_3
    invoke-virtual {v1, p1}, Lfk3;->b(Ljava/lang/Throwable;)V

    .line 96
    .line 97
    .line 98
    const/16 p1, 0x11

    .line 99
    .line 100
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 104
    :goto_4
    invoke-virtual {v1}, Lfk3;->c()V

    .line 105
    .line 106
    .line 107
    return-object p1

    .line 108
    :goto_5
    invoke-virtual {v1}, Lfk3;->c()V

    .line 109
    .line 110
    .line 111
    throw p1
.end method
