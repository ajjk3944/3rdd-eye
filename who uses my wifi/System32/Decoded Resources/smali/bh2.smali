.class public final Lbh2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final synthetic a:I

.field public final b:Lba4;

.field public final c:Lba4;


# direct methods
.method public synthetic constructor <init>(Lba4;Lba4;I)V
    .locals 0

    .line 1
    iput p3, p0, Lbh2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lbh2;->b:Lba4;

    .line 4
    .line 5
    iput-object p2, p0, Lbh2;->c:Lba4;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lbh2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lbh2;->b:Lba4;

    .line 7
    .line 8
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lrf3;

    .line 13
    .line 14
    iget-object v1, p0, Lbh2;->c:Lba4;

    .line 15
    .line 16
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lpg3;

    .line 21
    .line 22
    new-instance v2, Lgk3;

    .line 23
    .line 24
    invoke-direct {v2, v0, v1}, Lgk3;-><init>(Lrf3;Lpg3;)V

    .line 25
    .line 26
    .line 27
    return-object v2

    .line 28
    :pswitch_0
    iget-object v0, p0, Lbh2;->b:Lba4;

    .line 29
    .line 30
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Lpm;

    .line 35
    .line 36
    sget-object v1, Lmd2;->a:Lld2;

    .line 37
    .line 38
    invoke-static {v1}, Li41;->M(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    new-instance v2, Lkf3;

    .line 42
    .line 43
    const/16 v3, 0x1b

    .line 44
    .line 45
    invoke-direct {v2, v3, v1}, Lkf3;-><init>(ILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lbh2;->c:Lba4;

    .line 49
    .line 50
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    check-cast v1, Lvu2;

    .line 55
    .line 56
    new-instance v3, Ltv2;

    .line 57
    .line 58
    const/16 v4, 0xb

    .line 59
    .line 60
    const/4 v5, 0x0

    .line 61
    invoke-direct {v3, v4, v5}, Ltv2;-><init>(IB)V

    .line 62
    .line 63
    .line 64
    new-instance v4, Lmu2;

    .line 65
    .line 66
    invoke-direct {v4, v0, v2, v1, v3}, Lmu2;-><init>(Lpm;Lkf3;Lvu2;Ltv2;)V

    .line 67
    .line 68
    .line 69
    return-object v4

    .line 70
    :pswitch_1
    iget-object v0, p0, Lbh2;->b:Lba4;

    .line 71
    .line 72
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, Lnb3;

    .line 77
    .line 78
    iget-object v1, p0, Lbh2;->c:Lba4;

    .line 79
    .line 80
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    check-cast v1, Lgb3;

    .line 85
    .line 86
    new-instance v2, Lmb3;

    .line 87
    .line 88
    invoke-direct {v2, v0, v1}, Lmb3;-><init>(Lnb3;Lgb3;)V

    .line 89
    .line 90
    .line 91
    return-object v2

    .line 92
    :pswitch_2
    iget-object v0, p0, Lbh2;->b:Lba4;

    .line 93
    .line 94
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    check-cast v0, Ljava/lang/String;

    .line 99
    .line 100
    iget-object v1, p0, Lbh2;->c:Lba4;

    .line 101
    .line 102
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    check-cast v1, Ljava/lang/Integer;

    .line 107
    .line 108
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    new-instance v2, Lc53;

    .line 113
    .line 114
    invoke-direct {v2, v0, v1}, Lc53;-><init>(Ljava/lang/String;I)V

    .line 115
    .line 116
    .line 117
    return-object v2

    .line 118
    :pswitch_3
    iget-object v0, p0, Lbh2;->b:Lba4;

    .line 119
    .line 120
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    check-cast v0, Lym;

    .line 125
    .line 126
    iget-object v1, p0, Lbh2;->c:Lba4;

    .line 127
    .line 128
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    check-cast v1, Lmv2;

    .line 133
    .line 134
    new-instance v2, Lz73;

    .line 135
    .line 136
    invoke-direct {v2, v0, v1}, Lz73;-><init>(Lym;Lmv2;)V

    .line 137
    .line 138
    .line 139
    return-object v2

    .line 140
    :pswitch_4
    sget-object v8, Lmd2;->a:Lld2;

    .line 141
    .line 142
    invoke-static {v8}, Li41;->M(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    new-instance v4, Lg43;

    .line 146
    .line 147
    const/4 v0, 0x2

    .line 148
    invoke-direct {v4, v8, v0}, Lg43;-><init>(Lpq3;I)V

    .line 149
    .line 150
    .line 151
    iget-object v0, p0, Lbh2;->b:Lba4;

    .line 152
    .line 153
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    move-object v7, v0

    .line 158
    check-cast v7, Lym;

    .line 159
    .line 160
    invoke-static {v8}, Li41;->M(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    iget-object v0, p0, Lbh2;->c:Lba4;

    .line 164
    .line 165
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    move-object v9, v0

    .line 170
    check-cast v9, Lmv2;

    .line 171
    .line 172
    new-instance v3, Lf43;

    .line 173
    .line 174
    sget-object v0, Lk02;->f:Lso1;

    .line 175
    .line 176
    invoke-virtual {v0}, Lso1;->w()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    check-cast v0, Ljava/lang/Long;

    .line 181
    .line 182
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 183
    .line 184
    .line 185
    move-result-wide v5

    .line 186
    invoke-direct/range {v3 .. v9}, Lf43;-><init>(Lq53;JLym;Lld2;Lmv2;)V

    .line 187
    .line 188
    .line 189
    return-object v3

    .line 190
    :pswitch_5
    iget-object v0, p0, Lbh2;->b:Lba4;

    .line 191
    .line 192
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    move-object v2, v0

    .line 197
    check-cast v2, Lu93;

    .line 198
    .line 199
    iget-object v0, p0, Lbh2;->c:Lba4;

    .line 200
    .line 201
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    check-cast v0, Landroid/content/Context;

    .line 206
    .line 207
    sget-object v0, Lhg4;->C:Lhg4;

    .line 208
    .line 209
    iget-object v0, v0, Lhg4;->f:Lnh4;

    .line 210
    .line 211
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    invoke-static {}, Lbd2;->D()Landroid/webkit/CookieManager;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    new-instance v1, Lxs1;

    .line 222
    .line 223
    const/4 v3, 0x5

    .line 224
    invoke-direct {v1, v3, v0}, Lxs1;-><init>(ILjava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    iget-object v0, v2, Lu93;->a:Lpq3;

    .line 228
    .line 229
    sget-object v5, Lu93;->d:Llq3;

    .line 230
    .line 231
    sget-object v6, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 232
    .line 233
    check-cast v0, Lld2;

    .line 234
    .line 235
    invoke-virtual {v0, v1}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 240
    .line 241
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 242
    .line 243
    move-object v3, v1

    .line 244
    new-instance v1, Lbu1;

    .line 245
    .line 246
    iget-object v4, v2, Lu93;->b:Ljava/util/concurrent/ScheduledExecutorService;

    .line 247
    .line 248
    const-wide/16 v7, 0x1

    .line 249
    .line 250
    invoke-static {v0, v7, v8, v3, v4}, Lpu1;->N(Ln70;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Ln70;

    .line 251
    .line 252
    .line 253
    move-result-object v7

    .line 254
    sget-object v3, Ls93;->x:Ls93;

    .line 255
    .line 256
    const/4 v4, 0x0

    .line 257
    invoke-direct/range {v1 .. v7}, Lbu1;-><init>(Lu93;Ljava/lang/Object;Ljava/lang/String;Ln70;Ljava/util/List;Ln70;)V

    .line 258
    .line 259
    .line 260
    new-instance v0, Lfi1;

    .line 261
    .line 262
    const/16 v2, 0xf

    .line 263
    .line 264
    invoke-direct {v0, v2}, Lfi1;-><init>(I)V

    .line 265
    .line 266
    .line 267
    new-instance v3, Lbu1;

    .line 268
    .line 269
    iget-object v2, v1, Lbu1;->l:Ljava/lang/Object;

    .line 270
    .line 271
    move-object v4, v2

    .line 272
    check-cast v4, Lu93;

    .line 273
    .line 274
    iget-object v2, v4, Lu93;->a:Lpq3;

    .line 275
    .line 276
    iget-object v5, v1, Lbu1;->k:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast v5, Ln70;

    .line 279
    .line 280
    move-object v6, v5

    .line 281
    iget-object v5, v1, Lbu1;->g:Ljava/lang/Object;

    .line 282
    .line 283
    iget-object v7, v1, Lbu1;->h:Ljava/lang/Object;

    .line 284
    .line 285
    check-cast v7, Ljava/lang/String;

    .line 286
    .line 287
    iget-object v8, v1, Lbu1;->i:Ljava/lang/Object;

    .line 288
    .line 289
    check-cast v8, Ln70;

    .line 290
    .line 291
    iget-object v1, v1, Lbu1;->j:Ljava/lang/Object;

    .line 292
    .line 293
    check-cast v1, Ljava/util/List;

    .line 294
    .line 295
    const-class v9, Ljava/lang/Exception;

    .line 296
    .line 297
    invoke-static {v6, v9, v0, v2}, Lpu1;->L(Ln70;Ljava/lang/Class;Lyp3;Ljava/util/concurrent/Executor;)Lwo3;

    .line 298
    .line 299
    .line 300
    move-result-object v9

    .line 301
    move-object v6, v7

    .line 302
    move-object v7, v8

    .line 303
    move-object v8, v1

    .line 304
    invoke-direct/range {v3 .. v9}, Lbu1;-><init>(Lu93;Ljava/lang/Object;Ljava/lang/String;Ln70;Ljava/util/List;Ln70;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v3}, Lbu1;->A()Lq93;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    return-object v0

    .line 312
    :pswitch_6
    iget-object v0, p0, Lbh2;->b:Lba4;

    .line 313
    .line 314
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    check-cast v0, Lmw2;

    .line 319
    .line 320
    iget-object v1, p0, Lbh2;->c:Lba4;

    .line 321
    .line 322
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    check-cast v1, Lxu2;

    .line 327
    .line 328
    new-instance v2, Lvw2;

    .line 329
    .line 330
    invoke-direct {v2, v0, v1}, Lvw2;-><init>(Lmw2;Lxu2;)V

    .line 331
    .line 332
    .line 333
    return-object v2

    .line 334
    :pswitch_7
    iget-object v0, p0, Lbh2;->b:Lba4;

    .line 335
    .line 336
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    check-cast v0, Ljava/lang/String;

    .line 341
    .line 342
    iget-object v1, p0, Lbh2;->c:Lba4;

    .line 343
    .line 344
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    check-cast v1, Lpv2;

    .line 349
    .line 350
    new-instance v2, Lrv2;

    .line 351
    .line 352
    invoke-direct {v2, v0, v1}, Lrv2;-><init>(Ljava/lang/String;Lpv2;)V

    .line 353
    .line 354
    .line 355
    return-object v2

    .line 356
    :pswitch_8
    iget-object v0, p0, Lbh2;->b:Lba4;

    .line 357
    .line 358
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    check-cast v0, Lxn2;

    .line 363
    .line 364
    iget-object v1, p0, Lbh2;->c:Lba4;

    .line 365
    .line 366
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v1

    .line 370
    check-cast v1, Lrp2;

    .line 371
    .line 372
    new-instance v2, Loq2;

    .line 373
    .line 374
    invoke-direct {v2, v0, v1}, Loq2;-><init>(Lxn2;Lrp2;)V

    .line 375
    .line 376
    .line 377
    return-object v2

    .line 378
    :pswitch_9
    iget-object v0, p0, Lbh2;->b:Lba4;

    .line 379
    .line 380
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    check-cast v0, Lxj2;

    .line 385
    .line 386
    sget-object v1, Lmd2;->a:Lld2;

    .line 387
    .line 388
    invoke-static {v1}, Li41;->M(Ljava/lang/Object;)V

    .line 389
    .line 390
    .line 391
    iget-object v2, p0, Lbh2;->c:Lba4;

    .line 392
    .line 393
    invoke-virtual {v2}, Lba4;->d()Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v2

    .line 397
    check-cast v2, Lorg/json/JSONObject;

    .line 398
    .line 399
    if-nez v2, :cond_0

    .line 400
    .line 401
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 402
    .line 403
    goto :goto_0

    .line 404
    :cond_0
    new-instance v2, Lup2;

    .line 405
    .line 406
    invoke-direct {v2, v0, v1}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 407
    .line 408
    .line 409
    invoke-static {v2}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    :goto_0
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 414
    .line 415
    .line 416
    return-object v0

    .line 417
    :pswitch_a
    iget-object v0, p0, Lbh2;->b:Lba4;

    .line 418
    .line 419
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    check-cast v0, Lxj2;

    .line 424
    .line 425
    sget-object v1, Lmd2;->a:Lld2;

    .line 426
    .line 427
    invoke-static {v1}, Li41;->M(Ljava/lang/Object;)V

    .line 428
    .line 429
    .line 430
    iget-object v2, p0, Lbh2;->c:Lba4;

    .line 431
    .line 432
    invoke-virtual {v2}, Lba4;->d()Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v2

    .line 436
    check-cast v2, Lorg/json/JSONObject;

    .line 437
    .line 438
    if-nez v2, :cond_1

    .line 439
    .line 440
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 441
    .line 442
    goto :goto_1

    .line 443
    :cond_1
    new-instance v2, Lup2;

    .line 444
    .line 445
    invoke-direct {v2, v0, v1}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 446
    .line 447
    .line 448
    invoke-static {v2}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    :goto_1
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 453
    .line 454
    .line 455
    return-object v0

    .line 456
    :pswitch_b
    iget-object v0, p0, Lbh2;->b:Lba4;

    .line 457
    .line 458
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    check-cast v0, Lxj2;

    .line 463
    .line 464
    sget-object v1, Lmd2;->a:Lld2;

    .line 465
    .line 466
    invoke-static {v1}, Li41;->M(Ljava/lang/Object;)V

    .line 467
    .line 468
    .line 469
    iget-object v2, p0, Lbh2;->c:Lba4;

    .line 470
    .line 471
    invoke-virtual {v2}, Lba4;->d()Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v2

    .line 475
    check-cast v2, Lorg/json/JSONObject;

    .line 476
    .line 477
    if-nez v2, :cond_2

    .line 478
    .line 479
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 480
    .line 481
    goto :goto_2

    .line 482
    :cond_2
    new-instance v2, Lup2;

    .line 483
    .line 484
    invoke-direct {v2, v0, v1}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 485
    .line 486
    .line 487
    invoke-static {v2}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 488
    .line 489
    .line 490
    move-result-object v0

    .line 491
    :goto_2
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 492
    .line 493
    .line 494
    return-object v0

    .line 495
    :pswitch_c
    iget-object v0, p0, Lbh2;->b:Lba4;

    .line 496
    .line 497
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    move-result-object v0

    .line 501
    check-cast v0, Lxj2;

    .line 502
    .line 503
    sget-object v1, Lmd2;->a:Lld2;

    .line 504
    .line 505
    invoke-static {v1}, Li41;->M(Ljava/lang/Object;)V

    .line 506
    .line 507
    .line 508
    iget-object v2, p0, Lbh2;->c:Lba4;

    .line 509
    .line 510
    invoke-virtual {v2}, Lba4;->d()Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v2

    .line 514
    check-cast v2, Lorg/json/JSONObject;

    .line 515
    .line 516
    if-nez v2, :cond_3

    .line 517
    .line 518
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 519
    .line 520
    goto :goto_3

    .line 521
    :cond_3
    new-instance v2, Lup2;

    .line 522
    .line 523
    invoke-direct {v2, v0, v1}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 524
    .line 525
    .line 526
    invoke-static {v2}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 527
    .line 528
    .line 529
    move-result-object v0

    .line 530
    :goto_3
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 531
    .line 532
    .line 533
    return-object v0

    .line 534
    :pswitch_d
    iget-object v0, p0, Lbh2;->b:Lba4;

    .line 535
    .line 536
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    check-cast v0, Lmv1;

    .line 541
    .line 542
    iget-object v1, p0, Lbh2;->c:Lba4;

    .line 543
    .line 544
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 545
    .line 546
    .line 547
    move-result-object v1

    .line 548
    check-cast v1, Ll62;

    .line 549
    .line 550
    sget-object v2, Lmz1;->g6:Liz1;

    .line 551
    .line 552
    sget-object v3, Ltw1;->e:Ltw1;

    .line 553
    .line 554
    iget-object v4, v3, Ltw1;->c:Lkz1;

    .line 555
    .line 556
    invoke-virtual {v4, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 557
    .line 558
    .line 559
    move-result-object v2

    .line 560
    check-cast v2, Ljava/lang/Boolean;

    .line 561
    .line 562
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 563
    .line 564
    .line 565
    move-result v2

    .line 566
    if-eqz v2, :cond_4

    .line 567
    .line 568
    sget-object v2, Lmd2;->c:Lld2;

    .line 569
    .line 570
    goto :goto_4

    .line 571
    :cond_4
    sget-object v2, Lmz1;->f6:Liz1;

    .line 572
    .line 573
    iget-object v3, v3, Ltw1;->c:Lkz1;

    .line 574
    .line 575
    invoke-virtual {v3, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 576
    .line 577
    .line 578
    move-result-object v2

    .line 579
    check-cast v2, Ljava/lang/Boolean;

    .line 580
    .line 581
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 582
    .line 583
    .line 584
    move-result v2

    .line 585
    if-eqz v2, :cond_5

    .line 586
    .line 587
    sget-object v2, Lmd2;->a:Lld2;

    .line 588
    .line 589
    goto :goto_4

    .line 590
    :cond_5
    sget-object v2, Lmd2;->f:Lld2;

    .line 591
    .line 592
    :goto_4
    invoke-static {v2}, Li41;->M(Ljava/lang/Object;)V

    .line 593
    .line 594
    .line 595
    new-instance v3, Lqj2;

    .line 596
    .line 597
    iget-object v0, v0, Lmv1;->c:Ljava/lang/String;

    .line 598
    .line 599
    invoke-direct {v3, v0, v1, v2}, Lqj2;-><init>(Ljava/lang/String;Ll62;Lld2;)V

    .line 600
    .line 601
    .line 602
    return-object v3

    .line 603
    :pswitch_e
    sget-object v0, Lmz1;->d3:Liz1;

    .line 604
    .line 605
    sget-object v1, Ltw1;->e:Ltw1;

    .line 606
    .line 607
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 608
    .line 609
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 610
    .line 611
    .line 612
    move-result-object v0

    .line 613
    check-cast v0, Ljava/lang/Boolean;

    .line 614
    .line 615
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 616
    .line 617
    .line 618
    move-result v0

    .line 619
    if-eqz v0, :cond_6

    .line 620
    .line 621
    new-instance v0, Lvs1;

    .line 622
    .line 623
    iget-object v1, p0, Lbh2;->c:Lba4;

    .line 624
    .line 625
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 626
    .line 627
    .line 628
    move-result-object v1

    .line 629
    check-cast v1, Lrs1;

    .line 630
    .line 631
    invoke-direct {v0, v1}, Lvs1;-><init>(Lrs1;)V

    .line 632
    .line 633
    .line 634
    goto :goto_5

    .line 635
    :cond_6
    new-instance v0, Lvs1;

    .line 636
    .line 637
    iget-object v1, p0, Lbh2;->b:Lba4;

    .line 638
    .line 639
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 640
    .line 641
    .line 642
    move-result-object v1

    .line 643
    check-cast v1, Lrs1;

    .line 644
    .line 645
    invoke-direct {v0, v1}, Lvs1;-><init>(Lrs1;)V

    .line 646
    .line 647
    .line 648
    :goto_5
    return-object v0

    .line 649
    :pswitch_f
    iget-object v0, p0, Lbh2;->b:Lba4;

    .line 650
    .line 651
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 652
    .line 653
    .line 654
    move-result-object v0

    .line 655
    check-cast v0, Lwg2;

    .line 656
    .line 657
    iget-object v0, p0, Lbh2;->c:Lba4;

    .line 658
    .line 659
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 660
    .line 661
    .line 662
    move-result-object v0

    .line 663
    check-cast v0, Ljava/util/concurrent/ScheduledExecutorService;

    .line 664
    .line 665
    new-instance v1, Lch2;

    .line 666
    .line 667
    invoke-direct {v1, v0}, Lch2;-><init>(Ljava/util/concurrent/ScheduledExecutorService;)V

    .line 668
    .line 669
    .line 670
    return-object v1

    .line 671
    :pswitch_10
    iget-object v0, p0, Lbh2;->b:Lba4;

    .line 672
    .line 673
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 674
    .line 675
    .line 676
    move-result-object v0

    .line 677
    check-cast v0, Lwg2;

    .line 678
    .line 679
    iget-object v1, p0, Lbh2;->c:Lba4;

    .line 680
    .line 681
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 682
    .line 683
    .line 684
    move-result-object v1

    .line 685
    check-cast v1, Lmv2;

    .line 686
    .line 687
    new-instance v2, Lah2;

    .line 688
    .line 689
    invoke-direct {v2, v0, v1}, Lah2;-><init>(Lwg2;Lmv2;)V

    .line 690
    .line 691
    .line 692
    return-object v2

    .line 693
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
