.class public final Lri3;
.super Lti3;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic f:I

.field public final g:Ljava/util/Map;

.field public final h:Ljava/lang/Object;

.field public final i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lfr1;Lgi3;Leg3;Landroid/content/Context;Ljava/util/Map;Lgk3;)V
    .locals 7

    const/4 v0, 0x0

    iput v0, p0, Lri3;->f:I

    const/16 v0, 0x79

    .line 3
    invoke-virtual {p6, v0}, Lgk3;->a(I)Lfk3;

    move-result-object v6

    const-string v2, "3U4DEAJT9Pq66npH/ZEsiPizUaU6oaGuzbq27Rp3Iz/R6ssq6OsViFqc+1XsG+SQ"

    const-string v3, "oHImj5OTIs8LNvX9EwNQkQ3bSJ9XioOM1m8VTLsnF8I="

    move-object v1, p0

    move-object v4, p1

    move-object v5, p2

    .line 4
    invoke-direct/range {v1 .. v6}, Lti3;-><init>(Ljava/lang/String;Ljava/lang/String;Lfr1;Lgi3;Lfk3;)V

    iput-object p3, v1, Lri3;->h:Ljava/lang/Object;

    iput-object p4, v1, Lri3;->i:Ljava/lang/Object;

    iput-object p5, v1, Lri3;->g:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Lfr1;Lgi3;Ljava/util/Map;Landroid/util/DisplayMetrics;Lgk3;)V
    .locals 7

    const/4 v0, 0x1

    iput v0, p0, Lri3;->f:I

    const/16 v0, 0x7b

    .line 1
    invoke-virtual {p5, v0}, Lgk3;->a(I)Lfk3;

    move-result-object v6

    const-string v2, "gbI2a8ruQFsh7iJbKP5csiDrRqRaAG+o51RWglq6SF+q1HNUXOxpmDRR6GgQlE1Z"

    const-string v3, "C7gHksN/1NwyNvzCHdeBzJsOxB75cHtIeny2v2KpeXA="

    move-object v1, p0

    move-object v4, p1

    move-object v5, p2

    .line 2
    invoke-direct/range {v1 .. v6}, Lti3;-><init>(Ljava/lang/String;Ljava/lang/String;Lfr1;Lgi3;Lfk3;)V

    iput-object v5, v1, Lri3;->h:Ljava/lang/Object;

    iput-object p3, v1, Lri3;->g:Ljava/util/Map;

    iput-object p4, v1, Lri3;->i:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/reflect/Method;Lfr1;)V
    .locals 16

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
    iget v3, v1, Lri3;->f:I

    .line 8
    .line 9
    packed-switch v3, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v3, v1, Lri3;->g:Ljava/util/Map;

    .line 13
    .line 14
    const-string v4, "nv"

    .line 15
    .line 16
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    check-cast v4, Landroid/view/MotionEvent;

    .line 21
    .line 22
    iget-object v5, v1, Lri3;->i:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v5, Landroid/util/DisplayMetrics;

    .line 25
    .line 26
    filled-new-array {v4, v5}, [Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    const-string v6, ""

    .line 31
    .line 32
    invoke-virtual {v0, v6, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, [Ljava/lang/Object;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-static {}, Lnr1;->A()Lmr1;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    const/4 v6, 0x0

    .line 46
    aget-object v7, v0, v6

    .line 47
    .line 48
    const/4 v8, 0x1

    .line 49
    if-eqz v7, :cond_0

    .line 50
    .line 51
    aget-object v9, v0, v8

    .line 52
    .line 53
    if-eqz v9, :cond_0

    .line 54
    .line 55
    check-cast v7, Ljava/lang/Long;

    .line 56
    .line 57
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 58
    .line 59
    .line 60
    move-result-wide v9

    .line 61
    invoke-virtual {v4}, Ln54;->b()V

    .line 62
    .line 63
    .line 64
    iget-object v7, v4, Ln54;->g:Lp54;

    .line 65
    .line 66
    check-cast v7, Lnr1;

    .line 67
    .line 68
    invoke-virtual {v7, v9, v10}, Lnr1;->B(J)V

    .line 69
    .line 70
    .line 71
    aget-object v7, v0, v8

    .line 72
    .line 73
    check-cast v7, Ljava/lang/Long;

    .line 74
    .line 75
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 76
    .line 77
    .line 78
    move-result-wide v9

    .line 79
    invoke-virtual {v4}, Ln54;->b()V

    .line 80
    .line 81
    .line 82
    iget-object v7, v4, Ln54;->g:Lp54;

    .line 83
    .line 84
    check-cast v7, Lnr1;

    .line 85
    .line 86
    invoke-virtual {v7, v9, v10}, Lnr1;->C(J)V

    .line 87
    .line 88
    .line 89
    :cond_0
    const/4 v7, 0x2

    .line 90
    aget-object v9, v0, v7

    .line 91
    .line 92
    if-eqz v9, :cond_1

    .line 93
    .line 94
    check-cast v9, Ljava/lang/Long;

    .line 95
    .line 96
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 97
    .line 98
    .line 99
    move-result-wide v9

    .line 100
    invoke-virtual {v4}, Ln54;->b()V

    .line 101
    .line 102
    .line 103
    iget-object v11, v4, Ln54;->g:Lp54;

    .line 104
    .line 105
    check-cast v11, Lnr1;

    .line 106
    .line 107
    invoke-virtual {v11, v9, v10}, Lnr1;->I(J)V

    .line 108
    .line 109
    .line 110
    :cond_1
    const/4 v9, 0x3

    .line 111
    aget-object v10, v0, v9

    .line 112
    .line 113
    if-eqz v10, :cond_2

    .line 114
    .line 115
    check-cast v10, Ljava/lang/Long;

    .line 116
    .line 117
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 118
    .line 119
    .line 120
    move-result-wide v10

    .line 121
    invoke-virtual {v4}, Ln54;->b()V

    .line 122
    .line 123
    .line 124
    iget-object v12, v4, Ln54;->g:Lp54;

    .line 125
    .line 126
    check-cast v12, Lnr1;

    .line 127
    .line 128
    invoke-virtual {v12, v10, v11}, Lnr1;->G(J)V

    .line 129
    .line 130
    .line 131
    :cond_2
    const/4 v10, 0x4

    .line 132
    aget-object v11, v0, v10

    .line 133
    .line 134
    if-eqz v11, :cond_3

    .line 135
    .line 136
    check-cast v11, Ljava/lang/Long;

    .line 137
    .line 138
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    .line 139
    .line 140
    .line 141
    move-result-wide v11

    .line 142
    invoke-virtual {v4}, Ln54;->b()V

    .line 143
    .line 144
    .line 145
    iget-object v13, v4, Ln54;->g:Lp54;

    .line 146
    .line 147
    check-cast v13, Lnr1;

    .line 148
    .line 149
    invoke-virtual {v13, v11, v12}, Lnr1;->D(J)V

    .line 150
    .line 151
    .line 152
    :cond_3
    const/4 v11, 0x5

    .line 153
    aget-object v11, v0, v11

    .line 154
    .line 155
    const-wide/16 v12, 0x0

    .line 156
    .line 157
    if-eqz v11, :cond_5

    .line 158
    .line 159
    check-cast v11, Ljava/lang/Long;

    .line 160
    .line 161
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    .line 162
    .line 163
    .line 164
    move-result-wide v14

    .line 165
    cmp-long v11, v14, v12

    .line 166
    .line 167
    if-eqz v11, :cond_4

    .line 168
    .line 169
    move v11, v7

    .line 170
    goto :goto_0

    .line 171
    :cond_4
    move v11, v8

    .line 172
    :goto_0
    invoke-virtual {v4}, Ln54;->b()V

    .line 173
    .line 174
    .line 175
    iget-object v14, v4, Ln54;->g:Lp54;

    .line 176
    .line 177
    check-cast v14, Lnr1;

    .line 178
    .line 179
    invoke-virtual {v14, v11}, Lnr1;->T(I)V

    .line 180
    .line 181
    .line 182
    :cond_5
    const/4 v11, 0x6

    .line 183
    aget-object v11, v0, v11

    .line 184
    .line 185
    if-eqz v11, :cond_6

    .line 186
    .line 187
    check-cast v11, Ljava/lang/Long;

    .line 188
    .line 189
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    .line 190
    .line 191
    .line 192
    move-result-wide v14

    .line 193
    invoke-virtual {v4}, Ln54;->b()V

    .line 194
    .line 195
    .line 196
    iget-object v11, v4, Ln54;->g:Lp54;

    .line 197
    .line 198
    check-cast v11, Lnr1;

    .line 199
    .line 200
    invoke-virtual {v11, v14, v15}, Lnr1;->K(J)V

    .line 201
    .line 202
    .line 203
    :cond_6
    const/4 v11, 0x7

    .line 204
    aget-object v11, v0, v11

    .line 205
    .line 206
    if-eqz v11, :cond_7

    .line 207
    .line 208
    check-cast v11, Ljava/lang/Long;

    .line 209
    .line 210
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    .line 211
    .line 212
    .line 213
    move-result-wide v14

    .line 214
    invoke-virtual {v4}, Ln54;->b()V

    .line 215
    .line 216
    .line 217
    iget-object v11, v4, Ln54;->g:Lp54;

    .line 218
    .line 219
    check-cast v11, Lnr1;

    .line 220
    .line 221
    invoke-virtual {v11, v14, v15}, Lnr1;->J(J)V

    .line 222
    .line 223
    .line 224
    :cond_7
    const/16 v11, 0x8

    .line 225
    .line 226
    aget-object v0, v0, v11

    .line 227
    .line 228
    if-eqz v0, :cond_9

    .line 229
    .line 230
    check-cast v0, Ljava/lang/Long;

    .line 231
    .line 232
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 233
    .line 234
    .line 235
    move-result-wide v14

    .line 236
    cmp-long v0, v14, v12

    .line 237
    .line 238
    if-eqz v0, :cond_8

    .line 239
    .line 240
    move v0, v7

    .line 241
    goto :goto_1

    .line 242
    :cond_8
    move v0, v8

    .line 243
    :goto_1
    invoke-virtual {v4}, Ln54;->b()V

    .line 244
    .line 245
    .line 246
    iget-object v11, v4, Ln54;->g:Lp54;

    .line 247
    .line 248
    check-cast v11, Lnr1;

    .line 249
    .line 250
    invoke-virtual {v11, v0}, Lnr1;->U(I)V

    .line 251
    .line 252
    .line 253
    :cond_9
    monitor-enter p2

    .line 254
    :try_start_0
    iget-object v0, v1, Lri3;->h:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast v0, Lgi3;

    .line 257
    .line 258
    const-string v11, "TJcXhplO1c7oeAIzyyjGCjnhXIAfNaFNWGhya9KHb9++zv8J1h9atpUrZL1Yjg6v"

    .line 259
    .line 260
    const-string v14, "v7ewhEi0QRfAHjcos6RExS5aIOB6pcbb0aW+P30gIsQ="

    .line 261
    .line 262
    invoke-virtual {v0, v11, v14}, Lgi3;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    const/4 v11, 0x0

    .line 267
    if-eqz v0, :cond_1d

    .line 268
    .line 269
    const-string v14, "nv"

    .line 270
    .line 271
    invoke-interface {v3, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v14

    .line 275
    check-cast v14, Landroid/view/MotionEvent;

    .line 276
    .line 277
    const-string v15, ""

    .line 278
    .line 279
    filled-new-array {v14, v5}, [Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v14

    .line 283
    invoke-virtual {v0, v15, v14}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    check-cast v0, [Ljava/lang/Object;

    .line 288
    .line 289
    if-eqz v0, :cond_1c

    .line 290
    .line 291
    aget-object v14, v0, v6

    .line 292
    .line 293
    if-eqz v14, :cond_a

    .line 294
    .line 295
    check-cast v14, Ljava/lang/Long;

    .line 296
    .line 297
    invoke-virtual {v14}, Ljava/lang/Long;->longValue()J

    .line 298
    .line 299
    .line 300
    move-result-wide v14

    .line 301
    invoke-virtual {v2}, Ln54;->b()V

    .line 302
    .line 303
    .line 304
    iget-object v6, v2, Ln54;->g:Lp54;

    .line 305
    .line 306
    check-cast v6, Lqr1;

    .line 307
    .line 308
    invoke-virtual {v6, v14, v15}, Lqr1;->L0(J)V

    .line 309
    .line 310
    .line 311
    goto :goto_2

    .line 312
    :catchall_0
    move-exception v0

    .line 313
    goto/16 :goto_8

    .line 314
    .line 315
    :cond_a
    :goto_2
    aget-object v6, v0, v8

    .line 316
    .line 317
    if-eqz v6, :cond_b

    .line 318
    .line 319
    check-cast v6, Ljava/lang/Long;

    .line 320
    .line 321
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 322
    .line 323
    .line 324
    move-result-wide v14

    .line 325
    invoke-virtual {v2}, Ln54;->b()V

    .line 326
    .line 327
    .line 328
    iget-object v6, v2, Ln54;->g:Lp54;

    .line 329
    .line 330
    check-cast v6, Lqr1;

    .line 331
    .line 332
    invoke-virtual {v6, v14, v15}, Lqr1;->M0(J)V

    .line 333
    .line 334
    .line 335
    :cond_b
    aget-object v6, v0, v7

    .line 336
    .line 337
    if-eqz v6, :cond_c

    .line 338
    .line 339
    check-cast v6, Ljava/lang/Long;

    .line 340
    .line 341
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 342
    .line 343
    .line 344
    move-result-wide v6

    .line 345
    invoke-virtual {v2}, Ln54;->b()V

    .line 346
    .line 347
    .line 348
    iget-object v14, v2, Ln54;->g:Lp54;

    .line 349
    .line 350
    check-cast v14, Lqr1;

    .line 351
    .line 352
    invoke-virtual {v14, v6, v7}, Lqr1;->N0(J)V

    .line 353
    .line 354
    .line 355
    :cond_c
    aget-object v6, v0, v9

    .line 356
    .line 357
    if-eqz v6, :cond_d

    .line 358
    .line 359
    check-cast v6, Ljava/lang/Long;

    .line 360
    .line 361
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 362
    .line 363
    .line 364
    move-result-wide v6

    .line 365
    invoke-virtual {v2}, Ln54;->b()V

    .line 366
    .line 367
    .line 368
    iget-object v9, v2, Ln54;->g:Lp54;

    .line 369
    .line 370
    check-cast v9, Lqr1;

    .line 371
    .line 372
    invoke-virtual {v9, v6, v7}, Lqr1;->G(J)V

    .line 373
    .line 374
    .line 375
    :cond_d
    aget-object v0, v0, v10

    .line 376
    .line 377
    if-eqz v0, :cond_e

    .line 378
    .line 379
    check-cast v0, Ljava/lang/Long;

    .line 380
    .line 381
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 382
    .line 383
    .line 384
    move-result-wide v6

    .line 385
    invoke-virtual {v2}, Ln54;->b()V

    .line 386
    .line 387
    .line 388
    iget-object v0, v2, Ln54;->g:Lp54;

    .line 389
    .line 390
    check-cast v0, Lqr1;

    .line 391
    .line 392
    invoke-virtual {v0, v6, v7}, Lqr1;->H(J)V

    .line 393
    .line 394
    .line 395
    :cond_e
    const-string v0, "oe"

    .line 396
    .line 397
    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    check-cast v0, Lqh3;

    .line 402
    .line 403
    if-nez v0, :cond_f

    .line 404
    .line 405
    goto :goto_3

    .line 406
    :cond_f
    iget-wide v6, v0, Lqh3;->a:J

    .line 407
    .line 408
    cmp-long v9, v6, v12

    .line 409
    .line 410
    if-lez v9, :cond_10

    .line 411
    .line 412
    invoke-virtual {v2}, Ln54;->b()V

    .line 413
    .line 414
    .line 415
    iget-object v9, v2, Ln54;->g:Lp54;

    .line 416
    .line 417
    check-cast v9, Lqr1;

    .line 418
    .line 419
    invoke-virtual {v9, v6, v7}, Lqr1;->K(J)V

    .line 420
    .line 421
    .line 422
    :cond_10
    iget-wide v6, v0, Lqh3;->b:J

    .line 423
    .line 424
    cmp-long v9, v6, v12

    .line 425
    .line 426
    if-lez v9, :cond_11

    .line 427
    .line 428
    invoke-virtual {v2}, Ln54;->b()V

    .line 429
    .line 430
    .line 431
    iget-object v9, v2, Ln54;->g:Lp54;

    .line 432
    .line 433
    check-cast v9, Lqr1;

    .line 434
    .line 435
    invoke-virtual {v9, v6, v7}, Lqr1;->J(J)V

    .line 436
    .line 437
    .line 438
    :cond_11
    iget-wide v6, v0, Lqh3;->c:J

    .line 439
    .line 440
    cmp-long v9, v6, v12

    .line 441
    .line 442
    if-lez v9, :cond_12

    .line 443
    .line 444
    invoke-virtual {v2}, Ln54;->b()V

    .line 445
    .line 446
    .line 447
    iget-object v9, v2, Ln54;->g:Lp54;

    .line 448
    .line 449
    check-cast v9, Lqr1;

    .line 450
    .line 451
    invoke-virtual {v9, v6, v7}, Lqr1;->I(J)V

    .line 452
    .line 453
    .line 454
    :cond_12
    iget-wide v6, v0, Lqh3;->d:J

    .line 455
    .line 456
    cmp-long v0, v6, v12

    .line 457
    .line 458
    if-lez v0, :cond_13

    .line 459
    .line 460
    invoke-virtual {v2}, Ln54;->b()V

    .line 461
    .line 462
    .line 463
    iget-object v0, v2, Ln54;->g:Lp54;

    .line 464
    .line 465
    check-cast v0, Lqr1;

    .line 466
    .line 467
    invoke-virtual {v0, v6, v7}, Lqr1;->L(J)V

    .line 468
    .line 469
    .line 470
    :cond_13
    :goto_3
    const-string v0, "oe"

    .line 471
    .line 472
    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object v0

    .line 476
    check-cast v0, Lqh3;

    .line 477
    .line 478
    const/4 v6, 0x0

    .line 479
    if-nez v0, :cond_14

    .line 480
    .line 481
    goto/16 :goto_5

    .line 482
    .line 483
    :cond_14
    iget-wide v9, v0, Lqh3;->a:J

    .line 484
    .line 485
    cmp-long v7, v9, v12

    .line 486
    .line 487
    if-eqz v7, :cond_18

    .line 488
    .line 489
    if-eqz v5, :cond_15

    .line 490
    .line 491
    iget v7, v5, Landroid/util/DisplayMetrics;->density:F

    .line 492
    .line 493
    cmpl-float v7, v7, v6

    .line 494
    .line 495
    if-eqz v7, :cond_15

    .line 496
    .line 497
    move v7, v8

    .line 498
    goto :goto_4

    .line 499
    :cond_15
    const/4 v7, 0x0

    .line 500
    :goto_4
    if-eqz v7, :cond_18

    .line 501
    .line 502
    iget-wide v9, v0, Lqh3;->g:D

    .line 503
    .line 504
    if-eqz v5, :cond_17

    .line 505
    .line 506
    iget v7, v5, Landroid/util/DisplayMetrics;->density:F

    .line 507
    .line 508
    float-to-double v14, v7

    .line 509
    div-double/2addr v9, v14

    .line 510
    invoke-static {v9, v10}, Ljava/lang/Math;->round(D)J

    .line 511
    .line 512
    .line 513
    move-result-wide v9

    .line 514
    invoke-virtual {v4}, Ln54;->b()V

    .line 515
    .line 516
    .line 517
    iget-object v7, v4, Ln54;->g:Lp54;

    .line 518
    .line 519
    check-cast v7, Lnr1;

    .line 520
    .line 521
    invoke-virtual {v7, v9, v10}, Lnr1;->M(J)V

    .line 522
    .line 523
    .line 524
    iget v7, v0, Lqh3;->j:F

    .line 525
    .line 526
    iget v9, v0, Lqh3;->h:F

    .line 527
    .line 528
    sub-float/2addr v7, v9

    .line 529
    float-to-double v9, v7

    .line 530
    iget v7, v5, Landroid/util/DisplayMetrics;->density:F

    .line 531
    .line 532
    float-to-double v14, v7

    .line 533
    div-double/2addr v9, v14

    .line 534
    invoke-static {v9, v10}, Ljava/lang/Math;->round(D)J

    .line 535
    .line 536
    .line 537
    move-result-wide v9

    .line 538
    invoke-virtual {v4}, Ln54;->b()V

    .line 539
    .line 540
    .line 541
    iget-object v7, v4, Ln54;->g:Lp54;

    .line 542
    .line 543
    check-cast v7, Lnr1;

    .line 544
    .line 545
    invoke-virtual {v7, v9, v10}, Lnr1;->N(J)V

    .line 546
    .line 547
    .line 548
    iget v7, v0, Lqh3;->k:F

    .line 549
    .line 550
    iget v9, v0, Lqh3;->i:F

    .line 551
    .line 552
    sub-float/2addr v7, v9

    .line 553
    float-to-double v9, v7

    .line 554
    iget v7, v5, Landroid/util/DisplayMetrics;->density:F

    .line 555
    .line 556
    float-to-double v14, v7

    .line 557
    div-double/2addr v9, v14

    .line 558
    invoke-static {v9, v10}, Ljava/lang/Math;->round(D)J

    .line 559
    .line 560
    .line 561
    move-result-wide v9

    .line 562
    invoke-virtual {v4}, Ln54;->b()V

    .line 563
    .line 564
    .line 565
    iget-object v7, v4, Ln54;->g:Lp54;

    .line 566
    .line 567
    check-cast v7, Lnr1;

    .line 568
    .line 569
    invoke-virtual {v7, v9, v10}, Lnr1;->O(J)V

    .line 570
    .line 571
    .line 572
    iget v7, v0, Lqh3;->h:F

    .line 573
    .line 574
    float-to-double v9, v7

    .line 575
    iget v7, v5, Landroid/util/DisplayMetrics;->density:F

    .line 576
    .line 577
    float-to-double v14, v7

    .line 578
    div-double/2addr v9, v14

    .line 579
    invoke-static {v9, v10}, Ljava/lang/Math;->round(D)J

    .line 580
    .line 581
    .line 582
    move-result-wide v9

    .line 583
    invoke-virtual {v4}, Ln54;->b()V

    .line 584
    .line 585
    .line 586
    iget-object v7, v4, Ln54;->g:Lp54;

    .line 587
    .line 588
    check-cast v7, Lnr1;

    .line 589
    .line 590
    invoke-virtual {v7, v9, v10}, Lnr1;->R(J)V

    .line 591
    .line 592
    .line 593
    iget v7, v0, Lqh3;->i:F

    .line 594
    .line 595
    float-to-double v9, v7

    .line 596
    iget v7, v5, Landroid/util/DisplayMetrics;->density:F

    .line 597
    .line 598
    float-to-double v14, v7

    .line 599
    div-double/2addr v9, v14

    .line 600
    invoke-static {v9, v10}, Ljava/lang/Math;->round(D)J

    .line 601
    .line 602
    .line 603
    move-result-wide v9

    .line 604
    invoke-virtual {v4}, Ln54;->b()V

    .line 605
    .line 606
    .line 607
    iget-object v7, v4, Ln54;->g:Lp54;

    .line 608
    .line 609
    check-cast v7, Lnr1;

    .line 610
    .line 611
    invoke-virtual {v7, v9, v10}, Lnr1;->S(J)V

    .line 612
    .line 613
    .line 614
    const-string v7, "nv"

    .line 615
    .line 616
    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 617
    .line 618
    .line 619
    move-result-object v7

    .line 620
    check-cast v7, Landroid/view/MotionEvent;

    .line 621
    .line 622
    if-eqz v7, :cond_18

    .line 623
    .line 624
    iget v9, v0, Lqh3;->h:F

    .line 625
    .line 626
    iget v10, v0, Lqh3;->j:F

    .line 627
    .line 628
    sub-float/2addr v9, v10

    .line 629
    invoke-virtual {v7}, Landroid/view/MotionEvent;->getRawX()F

    .line 630
    .line 631
    .line 632
    move-result v10

    .line 633
    add-float/2addr v9, v10

    .line 634
    invoke-virtual {v7}, Landroid/view/MotionEvent;->getX()F

    .line 635
    .line 636
    .line 637
    move-result v10

    .line 638
    sub-float/2addr v9, v10

    .line 639
    float-to-double v9, v9

    .line 640
    iget v14, v5, Landroid/util/DisplayMetrics;->density:F

    .line 641
    .line 642
    float-to-double v14, v14

    .line 643
    div-double/2addr v9, v14

    .line 644
    invoke-static {v9, v10}, Ljava/lang/Math;->round(D)J

    .line 645
    .line 646
    .line 647
    move-result-wide v9

    .line 648
    cmp-long v14, v9, v12

    .line 649
    .line 650
    if-eqz v14, :cond_16

    .line 651
    .line 652
    invoke-virtual {v4}, Ln54;->b()V

    .line 653
    .line 654
    .line 655
    iget-object v14, v4, Ln54;->g:Lp54;

    .line 656
    .line 657
    check-cast v14, Lnr1;

    .line 658
    .line 659
    invoke-virtual {v14, v9, v10}, Lnr1;->P(J)V

    .line 660
    .line 661
    .line 662
    :cond_16
    iget v9, v0, Lqh3;->i:F

    .line 663
    .line 664
    iget v0, v0, Lqh3;->k:F

    .line 665
    .line 666
    sub-float/2addr v9, v0

    .line 667
    invoke-virtual {v7}, Landroid/view/MotionEvent;->getRawY()F

    .line 668
    .line 669
    .line 670
    move-result v0

    .line 671
    add-float/2addr v9, v0

    .line 672
    invoke-virtual {v7}, Landroid/view/MotionEvent;->getY()F

    .line 673
    .line 674
    .line 675
    move-result v0

    .line 676
    sub-float/2addr v9, v0

    .line 677
    float-to-double v9, v9

    .line 678
    iget v0, v5, Landroid/util/DisplayMetrics;->density:F

    .line 679
    .line 680
    float-to-double v14, v0

    .line 681
    div-double/2addr v9, v14

    .line 682
    invoke-static {v9, v10}, Ljava/lang/Math;->round(D)J

    .line 683
    .line 684
    .line 685
    move-result-wide v9

    .line 686
    cmp-long v0, v9, v12

    .line 687
    .line 688
    if-eqz v0, :cond_18

    .line 689
    .line 690
    invoke-virtual {v4}, Ln54;->b()V

    .line 691
    .line 692
    .line 693
    iget-object v0, v4, Ln54;->g:Lp54;

    .line 694
    .line 695
    check-cast v0, Lnr1;

    .line 696
    .line 697
    invoke-virtual {v0, v9, v10}, Lnr1;->Q(J)V

    .line 698
    .line 699
    .line 700
    goto :goto_5

    .line 701
    :cond_17
    throw v11

    .line 702
    :cond_18
    :goto_5
    invoke-virtual {v2}, Ln54;->b()V

    .line 703
    .line 704
    .line 705
    iget-object v0, v2, Ln54;->g:Lp54;

    .line 706
    .line 707
    check-cast v0, Lqr1;

    .line 708
    .line 709
    invoke-virtual {v4}, Ln54;->d()Lp54;

    .line 710
    .line 711
    .line 712
    move-result-object v4

    .line 713
    check-cast v4, Lnr1;

    .line 714
    .line 715
    invoke-virtual {v0, v4}, Lqr1;->T(Lnr1;)V

    .line 716
    .line 717
    .line 718
    const-string v0, "ro"

    .line 719
    .line 720
    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 721
    .line 722
    .line 723
    move-result-object v0

    .line 724
    check-cast v0, [Lrh3;

    .line 725
    .line 726
    if-eqz v0, :cond_1b

    .line 727
    .line 728
    if-eqz v5, :cond_19

    .line 729
    .line 730
    iget v3, v5, Landroid/util/DisplayMetrics;->density:F

    .line 731
    .line 732
    cmpl-float v3, v3, v6

    .line 733
    .line 734
    if-eqz v3, :cond_19

    .line 735
    .line 736
    goto :goto_6

    .line 737
    :cond_19
    const/4 v8, 0x0

    .line 738
    :goto_6
    if-eqz v8, :cond_1b

    .line 739
    .line 740
    const/4 v6, 0x0

    .line 741
    :goto_7
    array-length v3, v0

    .line 742
    add-int/lit8 v3, v3, -0x2

    .line 743
    .line 744
    if-gt v6, v3, :cond_1b

    .line 745
    .line 746
    aget-object v3, v0, v6

    .line 747
    .line 748
    invoke-static {}, Lnr1;->A()Lmr1;

    .line 749
    .line 750
    .line 751
    move-result-object v4

    .line 752
    iget v7, v3, Lrh3;->a:F

    .line 753
    .line 754
    float-to-double v7, v7

    .line 755
    if-eqz v5, :cond_1a

    .line 756
    .line 757
    iget v9, v5, Landroid/util/DisplayMetrics;->density:F

    .line 758
    .line 759
    float-to-double v9, v9

    .line 760
    div-double/2addr v7, v9

    .line 761
    invoke-static {v7, v8}, Ljava/lang/Math;->round(D)J

    .line 762
    .line 763
    .line 764
    move-result-wide v7

    .line 765
    invoke-virtual {v4}, Ln54;->b()V

    .line 766
    .line 767
    .line 768
    iget-object v9, v4, Ln54;->g:Lp54;

    .line 769
    .line 770
    check-cast v9, Lnr1;

    .line 771
    .line 772
    invoke-virtual {v9, v7, v8}, Lnr1;->B(J)V

    .line 773
    .line 774
    .line 775
    iget v3, v3, Lrh3;->b:F

    .line 776
    .line 777
    float-to-double v7, v3

    .line 778
    iget v3, v5, Landroid/util/DisplayMetrics;->density:F

    .line 779
    .line 780
    float-to-double v9, v3

    .line 781
    div-double/2addr v7, v9

    .line 782
    invoke-static {v7, v8}, Ljava/lang/Math;->round(D)J

    .line 783
    .line 784
    .line 785
    move-result-wide v7

    .line 786
    invoke-virtual {v4}, Ln54;->b()V

    .line 787
    .line 788
    .line 789
    iget-object v3, v4, Ln54;->g:Lp54;

    .line 790
    .line 791
    check-cast v3, Lnr1;

    .line 792
    .line 793
    invoke-virtual {v3, v7, v8}, Lnr1;->C(J)V

    .line 794
    .line 795
    .line 796
    invoke-virtual {v4}, Ln54;->d()Lp54;

    .line 797
    .line 798
    .line 799
    move-result-object v3

    .line 800
    check-cast v3, Lnr1;

    .line 801
    .line 802
    invoke-virtual {v2}, Ln54;->b()V

    .line 803
    .line 804
    .line 805
    iget-object v4, v2, Ln54;->g:Lp54;

    .line 806
    .line 807
    check-cast v4, Lqr1;

    .line 808
    .line 809
    invoke-virtual {v4, v3}, Lqr1;->U(Lnr1;)V

    .line 810
    .line 811
    .line 812
    add-int/lit8 v6, v6, 0x1

    .line 813
    .line 814
    goto :goto_7

    .line 815
    :cond_1a
    throw v11

    .line 816
    :cond_1b
    monitor-exit p2

    .line 817
    return-void

    .line 818
    :cond_1c
    throw v11

    .line 819
    :cond_1d
    throw v11

    .line 820
    :goto_8
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 821
    throw v0

    .line 822
    :pswitch_0
    iget-object v3, v1, Lri3;->h:Ljava/lang/Object;

    .line 823
    .line 824
    check-cast v3, Leg3;

    .line 825
    .line 826
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 827
    .line 828
    .line 829
    move-result v4

    .line 830
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 831
    .line 832
    .line 833
    move-result-object v4

    .line 834
    iget-object v5, v1, Lri3;->i:Ljava/lang/Object;

    .line 835
    .line 836
    check-cast v5, Landroid/content/Context;

    .line 837
    .line 838
    iget-object v6, v1, Lri3;->g:Ljava/util/Map;

    .line 839
    .line 840
    const-string v7, "up"

    .line 841
    .line 842
    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 843
    .line 844
    .line 845
    move-result-object v6

    .line 846
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 847
    .line 848
    if-eqz v6, :cond_1e

    .line 849
    .line 850
    goto :goto_9

    .line 851
    :cond_1e
    move-object v6, v7

    .line 852
    :goto_9
    filled-new-array {v4, v5, v6}, [Ljava/lang/Object;

    .line 853
    .line 854
    .line 855
    move-result-object v4

    .line 856
    const-string v5, ""

    .line 857
    .line 858
    invoke-virtual {v0, v5, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 859
    .line 860
    .line 861
    move-result-object v0

    .line 862
    check-cast v0, [Ljava/lang/Object;

    .line 863
    .line 864
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 865
    .line 866
    .line 867
    monitor-enter p2

    .line 868
    :try_start_1
    sget-object v4, Leg3;->f:Leg3;

    .line 869
    .line 870
    if-ne v3, v4, :cond_21

    .line 871
    .line 872
    const/4 v3, 0x0

    .line 873
    aget-object v3, v0, v3

    .line 874
    .line 875
    const-wide/16 v4, -0x1

    .line 876
    .line 877
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 878
    .line 879
    .line 880
    move-result-object v4

    .line 881
    if-eqz v3, :cond_1f

    .line 882
    .line 883
    goto :goto_a

    .line 884
    :cond_1f
    move-object v3, v4

    .line 885
    :goto_a
    check-cast v3, Ljava/lang/Long;

    .line 886
    .line 887
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 888
    .line 889
    .line 890
    move-result-wide v5

    .line 891
    invoke-virtual {v2}, Ln54;->b()V

    .line 892
    .line 893
    .line 894
    iget-object v3, v2, Ln54;->g:Lp54;

    .line 895
    .line 896
    check-cast v3, Lqr1;

    .line 897
    .line 898
    invoke-virtual {v3, v5, v6}, Lqr1;->B(J)V

    .line 899
    .line 900
    .line 901
    const/4 v3, 0x1

    .line 902
    aget-object v3, v0, v3

    .line 903
    .line 904
    if-eqz v3, :cond_20

    .line 905
    .line 906
    move-object v4, v3

    .line 907
    :cond_20
    check-cast v4, Ljava/lang/Long;

    .line 908
    .line 909
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 910
    .line 911
    .line 912
    move-result-wide v3

    .line 913
    invoke-virtual {v2}, Ln54;->b()V

    .line 914
    .line 915
    .line 916
    iget-object v5, v2, Ln54;->g:Lp54;

    .line 917
    .line 918
    check-cast v5, Lqr1;

    .line 919
    .line 920
    invoke-virtual {v5, v3, v4}, Lqr1;->C(J)V

    .line 921
    .line 922
    .line 923
    goto :goto_b

    .line 924
    :catchall_1
    move-exception v0

    .line 925
    goto :goto_c

    .line 926
    :cond_21
    :goto_b
    const/4 v3, 0x2

    .line 927
    aget-object v3, v0, v3

    .line 928
    .line 929
    check-cast v3, Ljava/lang/Long;

    .line 930
    .line 931
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 932
    .line 933
    .line 934
    move-result-wide v3

    .line 935
    invoke-virtual {v2}, Ln54;->b()V

    .line 936
    .line 937
    .line 938
    iget-object v5, v2, Ln54;->g:Lp54;

    .line 939
    .line 940
    check-cast v5, Lqr1;

    .line 941
    .line 942
    invoke-virtual {v5, v3, v4}, Lqr1;->K0(J)V

    .line 943
    .line 944
    .line 945
    const/4 v3, 0x3

    .line 946
    aget-object v0, v0, v3

    .line 947
    .line 948
    check-cast v0, Ljava/lang/Long;

    .line 949
    .line 950
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 951
    .line 952
    .line 953
    move-result-wide v3

    .line 954
    invoke-virtual {v2}, Ln54;->b()V

    .line 955
    .line 956
    .line 957
    iget-object v0, v2, Ln54;->g:Lp54;

    .line 958
    .line 959
    check-cast v0, Lqr1;

    .line 960
    .line 961
    invoke-virtual {v0, v3, v4}, Lqr1;->b0(J)V

    .line 962
    .line 963
    .line 964
    monitor-exit p2

    .line 965
    return-void

    .line 966
    :goto_c
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 967
    throw v0

    .line 968
    nop

    .line 969
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
