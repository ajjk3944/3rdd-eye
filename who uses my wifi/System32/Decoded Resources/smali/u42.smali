.class public final Lu42;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lyp3;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lu42;->a:I

    iput-object p2, p0, Lu42;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lgc3;Lz71;)V
    .locals 0

    const/16 p2, 0xd

    iput p2, p0, Lu42;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu42;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lij;Lq42;)V
    .locals 0

    const/4 p1, 0x0

    iput p1, p0, Lu42;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lu42;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lnh3;)V
    .locals 1

    const/16 v0, 0xf

    iput v0, p0, Lu42;->a:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lu42;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)Ln70;
    .locals 12

    .line 1
    iget v0, p0, Lu42;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lu42;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lpj3;

    .line 9
    .line 10
    check-cast p1, Ljava/lang/Integer;

    .line 11
    .line 12
    iget-object p1, v0, Lpj3;->f:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p1, Lrj3;

    .line 15
    .line 16
    invoke-virtual {p1}, Lrj3;->a()Lar3;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1

    .line 21
    :pswitch_0
    iget-object v0, p0, Lu42;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Lmj3;

    .line 24
    .line 25
    check-cast p1, Ljh3;

    .line 26
    .line 27
    iget-object v1, v0, Lmj3;->a:Luj3;

    .line 28
    .line 29
    invoke-interface {v1, p1}, Luj3;->a(Ljh3;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    iget-object p1, v0, Lmj3;->b:Lrj3;

    .line 36
    .line 37
    iget v1, p1, Lrj3;->a:I

    .line 38
    .line 39
    packed-switch v1, :pswitch_data_1

    .line 40
    .line 41
    .line 42
    iget-object v1, p1, Lrj3;->c:Llg3;

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    new-instance v2, Lw53;

    .line 48
    .line 49
    const/4 v3, 0x5

    .line 50
    invoke-direct {v2, v3, v1}, Lw53;-><init>(ILjava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object v1, v1, Llg3;->b:Ljava/util/concurrent/ExecutorService;

    .line 54
    .line 55
    invoke-static {v2, v1}, Lpu1;->D(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lar3;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    iget-object p1, p1, Lrj3;->e:Lgk3;

    .line 60
    .line 61
    const/16 v2, 0x4f50

    .line 62
    .line 63
    invoke-virtual {p1, v2, v1}, Lgk3;->d(ILn70;)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :pswitch_1
    iget-object v1, p1, Lrj3;->c:Llg3;

    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    new-instance v2, Lw53;

    .line 73
    .line 74
    const/4 v3, 0x5

    .line 75
    invoke-direct {v2, v3, v1}, Lw53;-><init>(ILjava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iget-object v1, v1, Llg3;->b:Ljava/util/concurrent/ExecutorService;

    .line 79
    .line 80
    invoke-static {v2, v1}, Lpu1;->D(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lar3;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    iget-object p1, p1, Lrj3;->e:Lgk3;

    .line 85
    .line 86
    const/16 v2, 0x3bc8

    .line 87
    .line 88
    invoke-virtual {p1, v2, v1}, Lgk3;->d(ILn70;)V

    .line 89
    .line 90
    .line 91
    :goto_0
    new-instance p1, Lvn1;

    .line 92
    .line 93
    const/16 v2, 0xd

    .line 94
    .line 95
    invoke-direct {p1, v2, v0}, Lvn1;-><init>(ILjava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    sget-object v0, Ldq3;->f:Ldq3;

    .line 99
    .line 100
    invoke-static {v1, p1, v0}, Lpu1;->P(Ln70;Lzk3;Ljava/util/concurrent/Executor;)Lrp3;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    return-object p1

    .line 105
    :cond_0
    iget-object p1, v0, Lmj3;->e:Lgk3;

    .line 106
    .line 107
    const/16 v0, 0x4e87

    .line 108
    .line 109
    invoke-virtual {p1, v0}, Lgk3;->b(I)V

    .line 110
    .line 111
    .line 112
    new-instance p1, Lrg;

    .line 113
    .line 114
    const/4 v0, 0x1

    .line 115
    invoke-direct {p1, v0}, Lrg;-><init>(I)V

    .line 116
    .line 117
    .line 118
    throw p1

    .line 119
    :pswitch_2
    iget-object v0, p0, Lu42;->b:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v0, Lxi3;

    .line 122
    .line 123
    check-cast p1, Lej3;

    .line 124
    .line 125
    iget-object p1, v0, Lxi3;->b:Lz94;

    .line 126
    .line 127
    invoke-interface {p1}, Lz94;->d()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    check-cast p1, Lkj3;

    .line 132
    .line 133
    invoke-interface {p1}, Lkj3;->d()Lgq3;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    return-object p1

    .line 138
    :pswitch_3
    check-cast p1, Lkh3;

    .line 139
    .line 140
    if-eqz p1, :cond_1

    .line 141
    .line 142
    invoke-static {p1}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    goto :goto_1

    .line 147
    :cond_1
    iget-object p1, p0, Lu42;->b:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast p1, Lnh3;

    .line 150
    .line 151
    iget-object v0, p1, Lnh3;->e:Lgk3;

    .line 152
    .line 153
    const/16 v1, 0x33

    .line 154
    .line 155
    invoke-virtual {v0, v1}, Lgk3;->b(I)V

    .line 156
    .line 157
    .line 158
    new-instance v0, Lmh3;

    .line 159
    .line 160
    const/4 v1, 0x2

    .line 161
    invoke-direct {v0, p1, v1}, Lmh3;-><init>(Lnh3;I)V

    .line 162
    .line 163
    .line 164
    iget-object p1, p1, Lnh3;->d:Ljava/util/concurrent/ExecutorService;

    .line 165
    .line 166
    invoke-static {v0, p1}, Lpu1;->D(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lar3;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    invoke-static {p1}, Lgq3;->r(Ln70;)Lgq3;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    sget-object v0, Lfi1;->o:Lfi1;

    .line 175
    .line 176
    sget-object v1, Ldq3;->f:Ldq3;

    .line 177
    .line 178
    invoke-static {p1, v0, v1}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    :goto_1
    return-object p1

    .line 183
    :pswitch_4
    iget-object v0, p0, Lu42;->b:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v0, Lo93;

    .line 186
    .line 187
    invoke-interface {v0, p1}, Lo93;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    invoke-static {p1}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    return-object p1

    .line 196
    :pswitch_5
    iget-object v0, p0, Lu42;->b:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v0, Lgc3;

    .line 199
    .line 200
    check-cast p1, Ljava/lang/Exception;

    .line 201
    .line 202
    monitor-enter v0

    .line 203
    const/4 v1, 0x1

    .line 204
    :try_start_0
    iput-boolean v1, v0, Lgc3;->b:Z

    .line 205
    .line 206
    throw p1

    .line 207
    :catchall_0
    move-exception p1

    .line 208
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 209
    throw p1

    .line 210
    :pswitch_6
    iget-object v0, p0, Lu42;->b:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v0, Lbu1;

    .line 213
    .line 214
    check-cast p1, Lk93;

    .line 215
    .line 216
    if-eqz p1, :cond_2

    .line 217
    .line 218
    iget-object v1, p1, Lk93;->a:Le93;

    .line 219
    .line 220
    if-eqz v1, :cond_2

    .line 221
    .line 222
    iget-object p1, p1, Lk93;->b:La73;

    .line 223
    .line 224
    if-eqz p1, :cond_2

    .line 225
    .line 226
    invoke-static {}, Lgy1;->A()Lby1;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    invoke-static {}, Lay1;->B()Lzx1;

    .line 231
    .line 232
    .line 233
    move-result-object v3

    .line 234
    invoke-virtual {v3}, Ln54;->b()V

    .line 235
    .line 236
    .line 237
    iget-object v4, v3, Ln54;->g:Lp54;

    .line 238
    .line 239
    check-cast v4, Lay1;

    .line 240
    .line 241
    invoke-virtual {v4}, Lay1;->C()V

    .line 242
    .line 243
    .line 244
    invoke-static {}, Ldy1;->B()Ldy1;

    .line 245
    .line 246
    .line 247
    move-result-object v4

    .line 248
    invoke-virtual {v3}, Ln54;->b()V

    .line 249
    .line 250
    .line 251
    iget-object v5, v3, Ln54;->g:Lp54;

    .line 252
    .line 253
    check-cast v5, Lay1;

    .line 254
    .line 255
    invoke-virtual {v5, v4}, Lay1;->D(Ldy1;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2}, Ln54;->b()V

    .line 259
    .line 260
    .line 261
    iget-object v4, v2, Ln54;->g:Lp54;

    .line 262
    .line 263
    check-cast v4, Lgy1;

    .line 264
    .line 265
    invoke-virtual {v3}, Ln54;->d()Lp54;

    .line 266
    .line 267
    .line 268
    move-result-object v3

    .line 269
    check-cast v3, Lay1;

    .line 270
    .line 271
    invoke-virtual {v4, v3}, Lgy1;->B(Lay1;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v2}, Ln54;->d()Lp54;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    check-cast v2, Lgy1;

    .line 279
    .line 280
    iget-object v3, v1, Le93;->a:Llm2;

    .line 281
    .line 282
    invoke-interface {v3}, Llm2;->a()Lnl2;

    .line 283
    .line 284
    .line 285
    move-result-object v3

    .line 286
    iget-object v3, v3, Lnl2;->f:Lzo2;

    .line 287
    .line 288
    invoke-virtual {v3, v2}, Lzo2;->A0(Lgy1;)V

    .line 289
    .line 290
    .line 291
    iget-object p1, p1, La73;->b:Llv2;

    .line 292
    .line 293
    invoke-virtual {v0, v1, p1}, Lbu1;->w(Le93;Llv2;)Ln70;

    .line 294
    .line 295
    .line 296
    move-result-object p1

    .line 297
    return-object p1

    .line 298
    :cond_2
    new-instance p1, Lhx2;

    .line 299
    .line 300
    const/4 v0, 0x1

    .line 301
    const-string v1, "Empty prefetch"

    .line 302
    .line 303
    invoke-direct {p1, v1, v0}, Lhx2;-><init>(Ljava/lang/String;I)V

    .line 304
    .line 305
    .line 306
    throw p1

    .line 307
    :pswitch_7
    iget-object v0, p0, Lu42;->b:Ljava/lang/Object;

    .line 308
    .line 309
    check-cast v0, Lg33;

    .line 310
    .line 311
    check-cast p1, Ljava/lang/Throwable;

    .line 312
    .line 313
    new-instance p1, Lj33;

    .line 314
    .line 315
    iget-object v0, v0, Lg33;->c:Ljava/lang/Object;

    .line 316
    .line 317
    check-cast v0, Ljava/lang/String;

    .line 318
    .line 319
    const/4 v1, 0x4

    .line 320
    invoke-direct {p1, v0, v1}, Lj33;-><init>(Ljava/lang/String;I)V

    .line 321
    .line 322
    .line 323
    invoke-static {p1}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 324
    .line 325
    .line 326
    move-result-object p1

    .line 327
    return-object p1

    .line 328
    :pswitch_8
    iget-object v0, p0, Lu42;->b:Ljava/lang/Object;

    .line 329
    .line 330
    check-cast v0, Ly53;

    .line 331
    .line 332
    check-cast p1, Ljava/lang/Throwable;

    .line 333
    .line 334
    const-string v1, ""

    .line 335
    .line 336
    new-instance v2, Lbs2;

    .line 337
    .line 338
    const/16 v3, 0xd

    .line 339
    .line 340
    invoke-direct {v2, v3, p1}, Lbs2;-><init>(ILjava/lang/Object;)V

    .line 341
    .line 342
    .line 343
    iget-object v0, v0, Ly53;->c:Lpq3;

    .line 344
    .line 345
    check-cast v0, Lld2;

    .line 346
    .line 347
    invoke-virtual {v0, v2}, Lld2;->a(Ljava/lang/Runnable;)Ln70;

    .line 348
    .line 349
    .line 350
    instance-of v0, p1, Ljava/lang/SecurityException;

    .line 351
    .line 352
    if-eqz v0, :cond_3

    .line 353
    .line 354
    new-instance p1, Lt33;

    .line 355
    .line 356
    const/4 v0, 0x2

    .line 357
    const/4 v2, 0x1

    .line 358
    invoke-direct {p1, v1, v0, v2}, Lt33;-><init>(Ljava/lang/String;II)V

    .line 359
    .line 360
    .line 361
    goto :goto_2

    .line 362
    :cond_3
    instance-of v0, p1, Ljava/lang/IllegalStateException;

    .line 363
    .line 364
    if-eqz v0, :cond_4

    .line 365
    .line 366
    new-instance p1, Lt33;

    .line 367
    .line 368
    const/4 v0, 0x3

    .line 369
    const/4 v2, 0x1

    .line 370
    invoke-direct {p1, v1, v0, v2}, Lt33;-><init>(Ljava/lang/String;II)V

    .line 371
    .line 372
    .line 373
    goto :goto_2

    .line 374
    :cond_4
    instance-of v0, p1, Ljava/lang/IllegalArgumentException;

    .line 375
    .line 376
    if-eqz v0, :cond_5

    .line 377
    .line 378
    new-instance p1, Lt33;

    .line 379
    .line 380
    const/4 v0, 0x4

    .line 381
    const/4 v2, 0x1

    .line 382
    invoke-direct {p1, v1, v0, v2}, Lt33;-><init>(Ljava/lang/String;II)V

    .line 383
    .line 384
    .line 385
    goto :goto_2

    .line 386
    :cond_5
    instance-of p1, p1, Ljava/util/concurrent/TimeoutException;

    .line 387
    .line 388
    if-eqz p1, :cond_6

    .line 389
    .line 390
    new-instance p1, Lt33;

    .line 391
    .line 392
    const/4 v0, 0x5

    .line 393
    const/4 v2, 0x1

    .line 394
    invoke-direct {p1, v1, v0, v2}, Lt33;-><init>(Ljava/lang/String;II)V

    .line 395
    .line 396
    .line 397
    goto :goto_2

    .line 398
    :cond_6
    new-instance p1, Lt33;

    .line 399
    .line 400
    const/4 v0, 0x0

    .line 401
    const/4 v2, 0x1

    .line 402
    invoke-direct {p1, v1, v0, v2}, Lt33;-><init>(Ljava/lang/String;II)V

    .line 403
    .line 404
    .line 405
    :goto_2
    invoke-static {p1}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 406
    .line 407
    .line 408
    move-result-object p1

    .line 409
    return-object p1

    .line 410
    :pswitch_9
    iget-object v0, p0, Lu42;->b:Ljava/lang/Object;

    .line 411
    .line 412
    check-cast v0, Lx43;

    .line 413
    .line 414
    check-cast p1, Ljava/lang/Throwable;

    .line 415
    .line 416
    sget-object v1, Lmz1;->v2:Liz1;

    .line 417
    .line 418
    sget-object v2, Ltw1;->e:Ltw1;

    .line 419
    .line 420
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 421
    .line 422
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v1

    .line 426
    check-cast v1, Ljava/lang/Boolean;

    .line 427
    .line 428
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 429
    .line 430
    .line 431
    move-result v1

    .line 432
    if-eqz v1, :cond_7

    .line 433
    .line 434
    iget-object v0, v0, Lx43;->a:Lq53;

    .line 435
    .line 436
    sget-object v1, Lhg4;->C:Lhg4;

    .line 437
    .line 438
    iget-object v1, v1, Lhg4;->h:Lgd2;

    .line 439
    .line 440
    invoke-interface {v0}, Lq53;->d()I

    .line 441
    .line 442
    .line 443
    move-result v0

    .line 444
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v2

    .line 448
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 449
    .line 450
    .line 451
    move-result v2

    .line 452
    new-instance v3, Ljava/lang/StringBuilder;

    .line 453
    .line 454
    add-int/lit8 v2, v2, 0x16

    .line 455
    .line 456
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 457
    .line 458
    .line 459
    const-string v2, "OptionalSignalTimeout:"

    .line 460
    .line 461
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 462
    .line 463
    .line 464
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 465
    .line 466
    .line 467
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    invoke-virtual {v1, v0, p1}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 472
    .line 473
    .line 474
    :cond_7
    sget-object p1, Llq3;->g:Llq3;

    .line 475
    .line 476
    return-object p1

    .line 477
    :pswitch_a
    check-cast p1, Ljava/lang/String;

    .line 478
    .line 479
    new-instance v0, Lorg/json/JSONObject;

    .line 480
    .line 481
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 482
    .line 483
    .line 484
    new-instance v1, Lorg/json/JSONObject;

    .line 485
    .line 486
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 487
    .line 488
    .line 489
    new-instance v2, Lorg/json/JSONObject;

    .line 490
    .line 491
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 492
    .line 493
    .line 494
    iget-object v3, p0, Lu42;->b:Ljava/lang/Object;

    .line 495
    .line 496
    check-cast v3, Ljava/lang/String;

    .line 497
    .line 498
    :try_start_1
    const-string v4, "headers"

    .line 499
    .line 500
    new-instance v5, Lorg/json/JSONObject;

    .line 501
    .line 502
    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 503
    .line 504
    .line 505
    invoke-virtual {v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 506
    .line 507
    .line 508
    const-string v4, "body"

    .line 509
    .line 510
    invoke-virtual {v2, v4, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 511
    .line 512
    .line 513
    const-string p1, "base_url"

    .line 514
    .line 515
    const-string v4, ""

    .line 516
    .line 517
    invoke-virtual {v1, p1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 518
    .line 519
    .line 520
    const-string p1, "signals"

    .line 521
    .line 522
    new-instance v4, Lorg/json/JSONObject;

    .line 523
    .line 524
    invoke-direct {v4, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 525
    .line 526
    .line 527
    invoke-virtual {v1, p1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 528
    .line 529
    .line 530
    const-string p1, "request"

    .line 531
    .line 532
    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 533
    .line 534
    .line 535
    const-string p1, "response"

    .line 536
    .line 537
    invoke-virtual {v0, p1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 538
    .line 539
    .line 540
    const-string p1, "flags"

    .line 541
    .line 542
    new-instance v1, Lorg/json/JSONObject;

    .line 543
    .line 544
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 545
    .line 546
    .line 547
    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 548
    .line 549
    .line 550
    invoke-static {v0}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 551
    .line 552
    .line 553
    move-result-object p1

    .line 554
    return-object p1

    .line 555
    :catch_0
    move-exception p1

    .line 556
    new-instance v0, Lorg/json/JSONException;

    .line 557
    .line 558
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 559
    .line 560
    .line 561
    move-result-object p1

    .line 562
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 563
    .line 564
    .line 565
    move-result-object p1

    .line 566
    const-string v1, "Preloaded loader: "

    .line 567
    .line 568
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 569
    .line 570
    .line 571
    move-result-object p1

    .line 572
    invoke-direct {v0, p1}, Lorg/json/JSONException;-><init>(Ljava/lang/String;)V

    .line 573
    .line 574
    .line 575
    throw v0

    .line 576
    :pswitch_b
    iget-object v0, p0, Lu42;->b:Ljava/lang/Object;

    .line 577
    .line 578
    check-cast v0, Lzx2;

    .line 579
    .line 580
    check-cast p1, Lorg/json/JSONObject;

    .line 581
    .line 582
    new-instance v1, Lh83;

    .line 583
    .line 584
    new-instance v2, Lf20;

    .line 585
    .line 586
    iget-object v3, v0, Lzx2;->d:Ll83;

    .line 587
    .line 588
    const/16 v4, 0x1a

    .line 589
    .line 590
    invoke-direct {v2, v4, v3}, Lf20;-><init>(ILjava/lang/Object;)V

    .line 591
    .line 592
    .line 593
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 594
    .line 595
    .line 596
    move-result-object p1

    .line 597
    iget-object v0, v0, Lzx2;->o:Landroid/os/Bundle;

    .line 598
    .line 599
    new-instance v3, Ljava/io/StringReader;

    .line 600
    .line 601
    invoke-direct {v3, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 602
    .line 603
    .line 604
    invoke-static {v3, v0}, Lp21;->y(Ljava/io/Reader;Landroid/os/Bundle;)Lp21;

    .line 605
    .line 606
    .line 607
    move-result-object p1

    .line 608
    invoke-direct {v1, v2, p1}, Lh83;-><init>(Lf20;Lp21;)V

    .line 609
    .line 610
    .line 611
    invoke-static {v1}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 612
    .line 613
    .line 614
    move-result-object p1

    .line 615
    return-object p1

    .line 616
    :pswitch_c
    iget-object v0, p0, Lu42;->b:Ljava/lang/Object;

    .line 617
    .line 618
    check-cast v0, Lyx2;

    .line 619
    .line 620
    check-cast p1, Lny2;

    .line 621
    .line 622
    new-instance v1, Lh83;

    .line 623
    .line 624
    new-instance v2, Lf20;

    .line 625
    .line 626
    iget-object v0, v0, Lyx2;->c:Ll83;

    .line 627
    .line 628
    const/16 v3, 0x1a

    .line 629
    .line 630
    invoke-direct {v2, v3, v0}, Lf20;-><init>(ILjava/lang/Object;)V

    .line 631
    .line 632
    .line 633
    new-instance v0, Ljava/io/InputStreamReader;

    .line 634
    .line 635
    iget-object v3, p1, Lny2;->a:Ljava/io/InputStream;

    .line 636
    .line 637
    invoke-direct {v0, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 638
    .line 639
    .line 640
    iget-object p1, p1, Lny2;->b:Lfa2;

    .line 641
    .line 642
    iget-object p1, p1, Lfa2;->r:Landroid/os/Bundle;

    .line 643
    .line 644
    invoke-static {v0, p1}, Lp21;->y(Ljava/io/Reader;Landroid/os/Bundle;)Lp21;

    .line 645
    .line 646
    .line 647
    move-result-object p1

    .line 648
    invoke-direct {v1, v2, p1}, Lh83;-><init>(Lf20;Lp21;)V

    .line 649
    .line 650
    .line 651
    invoke-static {v1}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 652
    .line 653
    .line 654
    move-result-object p1

    .line 655
    return-object p1

    .line 656
    :pswitch_d
    if-eqz p1, :cond_8

    .line 657
    .line 658
    iget-object p1, p0, Lu42;->b:Ljava/lang/Object;

    .line 659
    .line 660
    check-cast p1, Lrp3;

    .line 661
    .line 662
    goto :goto_3

    .line 663
    :cond_8
    new-instance p1, Lr13;

    .line 664
    .line 665
    const/4 v0, 0x1

    .line 666
    const-string v1, "Retrieve required value in native ad response failed."

    .line 667
    .line 668
    invoke-direct {p1, v1, v0}, Lhx2;-><init>(Ljava/lang/String;I)V

    .line 669
    .line 670
    .line 671
    invoke-static {p1}, Lpu1;->B(Ljava/lang/Throwable;)Lkq3;

    .line 672
    .line 673
    .line 674
    move-result-object p1

    .line 675
    :goto_3
    return-object p1

    .line 676
    :pswitch_e
    iget-object v0, p0, Lu42;->b:Ljava/lang/Object;

    .line 677
    .line 678
    check-cast v0, Lky2;

    .line 679
    .line 680
    check-cast p1, Lfa2;

    .line 681
    .line 682
    invoke-virtual {v0, p1}, Lky2;->e(Lfa2;)Ln70;

    .line 683
    .line 684
    .line 685
    move-result-object p1

    .line 686
    return-object p1

    .line 687
    :pswitch_f
    iget-object v0, p0, Lu42;->b:Ljava/lang/Object;

    .line 688
    .line 689
    check-cast v0, Lg4;

    .line 690
    .line 691
    check-cast p1, Ljava/lang/Throwable;

    .line 692
    .line 693
    invoke-virtual {v0, p1}, Lg4;->s(Ljava/lang/Throwable;)V

    .line 694
    .line 695
    .line 696
    sget-object p1, Llq3;->g:Llq3;

    .line 697
    .line 698
    return-object p1

    .line 699
    :pswitch_10
    sget-object p1, Lmz1;->Ya:Liz1;

    .line 700
    .line 701
    sget-object v0, Ltw1;->e:Ltw1;

    .line 702
    .line 703
    iget-object v0, v0, Ltw1;->c:Lkz1;

    .line 704
    .line 705
    invoke-virtual {v0, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 706
    .line 707
    .line 708
    move-result-object p1

    .line 709
    check-cast p1, Ljava/lang/String;

    .line 710
    .line 711
    const-string v0, "12"

    .line 712
    .line 713
    iget-object v1, p0, Lu42;->b:Ljava/lang/Object;

    .line 714
    .line 715
    check-cast v1, Landroid/net/Uri$Builder;

    .line 716
    .line 717
    invoke-virtual {v1, p1, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 718
    .line 719
    .line 720
    invoke-virtual {v1}, Landroid/net/Uri$Builder;->toString()Ljava/lang/String;

    .line 721
    .line 722
    .line 723
    move-result-object p1

    .line 724
    invoke-static {p1}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 725
    .line 726
    .line 727
    move-result-object p1

    .line 728
    return-object p1

    .line 729
    :pswitch_11
    iget-object v0, p0, Lu42;->b:Ljava/lang/Object;

    .line 730
    .line 731
    check-cast v0, Lqb2;

    .line 732
    .line 733
    check-cast p1, Ljava/util/Map;

    .line 734
    .line 735
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 736
    .line 737
    .line 738
    :try_start_2
    const-string v1, "Cannot find the corresponding resource object for "

    .line 739
    .line 740
    const/4 v2, 0x1

    .line 741
    if-nez p1, :cond_9

    .line 742
    .line 743
    goto/16 :goto_7

    .line 744
    .line 745
    :cond_9
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 746
    .line 747
    .line 748
    move-result-object v3

    .line 749
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 750
    .line 751
    .line 752
    move-result-object v3

    .line 753
    :cond_a
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 754
    .line 755
    .line 756
    move-result v4

    .line 757
    if-eqz v4, :cond_e

    .line 758
    .line 759
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 760
    .line 761
    .line 762
    move-result-object v4

    .line 763
    check-cast v4, Ljava/lang/String;

    .line 764
    .line 765
    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 766
    .line 767
    .line 768
    move-result-object v5

    .line 769
    check-cast v5, Ljava/lang/String;

    .line 770
    .line 771
    new-instance v6, Lorg/json/JSONObject;

    .line 772
    .line 773
    invoke-direct {v6, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 774
    .line 775
    .line 776
    const-string v5, "matches"

    .line 777
    .line 778
    invoke-virtual {v6, v5}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 779
    .line 780
    .line 781
    move-result-object v5

    .line 782
    if-eqz v5, :cond_a

    .line 783
    .line 784
    iget-object v6, v0, Lqb2;->h:Ljava/lang/Object;

    .line 785
    .line 786
    monitor-enter v6
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    .line 787
    :try_start_3
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    .line 788
    .line 789
    .line 790
    move-result v7

    .line 791
    monitor-enter v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 792
    :try_start_4
    iget-object v8, v0, Lqb2;->b:Ljava/util/LinkedHashMap;

    .line 793
    .line 794
    invoke-virtual {v8, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 795
    .line 796
    .line 797
    move-result-object v8

    .line 798
    check-cast v8, Lu84;

    .line 799
    .line 800
    monitor-exit v6
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 801
    if-nez v8, :cond_b

    .line 802
    .line 803
    :try_start_5
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 804
    .line 805
    .line 806
    move-result-object v5

    .line 807
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 808
    .line 809
    .line 810
    move-result v5

    .line 811
    add-int/lit8 v5, v5, 0x32

    .line 812
    .line 813
    new-instance v7, Ljava/lang/StringBuilder;

    .line 814
    .line 815
    invoke-direct {v7, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 816
    .line 817
    .line 818
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 819
    .line 820
    .line 821
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 822
    .line 823
    .line 824
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 825
    .line 826
    .line 827
    move-result-object v4

    .line 828
    invoke-static {v4}, Lwl2;->F(Ljava/lang/String;)V

    .line 829
    .line 830
    .line 831
    monitor-exit v6

    .line 832
    goto :goto_4

    .line 833
    :catchall_1
    move-exception p1

    .line 834
    goto :goto_6

    .line 835
    :cond_b
    const/4 v4, 0x0

    .line 836
    move v9, v4

    .line 837
    :goto_5
    if-ge v9, v7, :cond_c

    .line 838
    .line 839
    invoke-virtual {v5, v9}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 840
    .line 841
    .line 842
    move-result-object v10

    .line 843
    const-string v11, "threat_type"

    .line 844
    .line 845
    invoke-virtual {v10, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 846
    .line 847
    .line 848
    move-result-object v10

    .line 849
    invoke-virtual {v8}, Ln54;->b()V

    .line 850
    .line 851
    .line 852
    iget-object v11, v8, Ln54;->g:Lp54;

    .line 853
    .line 854
    check-cast v11, Lv84;

    .line 855
    .line 856
    invoke-virtual {v11, v10}, Lv84;->G(Ljava/lang/String;)V

    .line 857
    .line 858
    .line 859
    add-int/lit8 v9, v9, 0x1

    .line 860
    .line 861
    goto :goto_5

    .line 862
    :cond_c
    iget-boolean v5, v0, Lqb2;->f:Z

    .line 863
    .line 864
    if-lez v7, :cond_d

    .line 865
    .line 866
    move v4, v2

    .line 867
    :cond_d
    or-int/2addr v4, v5

    .line 868
    iput-boolean v4, v0, Lqb2;->f:Z

    .line 869
    .line 870
    monitor-exit v6
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 871
    goto :goto_4

    .line 872
    :catchall_2
    move-exception p1

    .line 873
    :try_start_6
    monitor-exit v6
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 874
    :try_start_7
    throw p1

    .line 875
    :goto_6
    monitor-exit v6
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 876
    :try_start_8
    throw p1

    .line 877
    :cond_e
    :goto_7
    iget-boolean p1, v0, Lqb2;->f:Z

    .line 878
    .line 879
    if-eqz p1, :cond_f

    .line 880
    .line 881
    iget-object p1, v0, Lqb2;->h:Ljava/lang/Object;

    .line 882
    .line 883
    monitor-enter p1
    :try_end_8
    .catch Lorg/json/JSONException; {:try_start_8 .. :try_end_8} :catch_1

    .line 884
    :try_start_9
    iget-object v1, v0, Lqb2;->a:Ly74;

    .line 885
    .line 886
    invoke-virtual {v1}, Ln54;->b()V

    .line 887
    .line 888
    .line 889
    iget-object v1, v1, Ln54;->g:Lp54;

    .line 890
    .line 891
    check-cast v1, Lc94;

    .line 892
    .line 893
    const/16 v3, 0xa

    .line 894
    .line 895
    invoke-virtual {v1, v3}, Lc94;->O(I)V

    .line 896
    .line 897
    .line 898
    monitor-exit p1

    .line 899
    goto :goto_8

    .line 900
    :catchall_3
    move-exception v0

    .line 901
    monitor-exit p1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 902
    :try_start_a
    throw v0

    .line 903
    :cond_f
    :goto_8
    const-string p1, "Sending SB report\n  url: "

    .line 904
    .line 905
    const-string v1, "\n  clickUrl: "

    .line 906
    .line 907
    const-string v3, "\n  resources: \n"

    .line 908
    .line 909
    iget-boolean v4, v0, Lqb2;->f:Z

    .line 910
    .line 911
    if-eqz v4, :cond_10

    .line 912
    .line 913
    iget-object v5, v0, Lqb2;->g:Lrb2;

    .line 914
    .line 915
    iget-boolean v5, v5, Lrb2;->l:Z

    .line 916
    .line 917
    if-nez v5, :cond_12

    .line 918
    .line 919
    :cond_10
    iget-boolean v5, v0, Lqb2;->k:Z

    .line 920
    .line 921
    if-eqz v5, :cond_11

    .line 922
    .line 923
    iget-object v5, v0, Lqb2;->g:Lrb2;

    .line 924
    .line 925
    iget-boolean v5, v5, Lrb2;->k:Z

    .line 926
    .line 927
    if-nez v5, :cond_12

    .line 928
    .line 929
    :cond_11
    if-nez v4, :cond_17

    .line 930
    .line 931
    iget-object v4, v0, Lqb2;->g:Lrb2;

    .line 932
    .line 933
    iget-boolean v4, v4, Lrb2;->i:Z

    .line 934
    .line 935
    if-eqz v4, :cond_17

    .line 936
    .line 937
    :cond_12
    iget-object v4, v0, Lqb2;->h:Ljava/lang/Object;

    .line 938
    .line 939
    monitor-enter v4
    :try_end_a
    .catch Lorg/json/JSONException; {:try_start_a .. :try_end_a} :catch_1

    .line 940
    :try_start_b
    iget-object v5, v0, Lqb2;->b:Ljava/util/LinkedHashMap;

    .line 941
    .line 942
    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 943
    .line 944
    .line 945
    move-result-object v5

    .line 946
    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 947
    .line 948
    .line 949
    move-result-object v5

    .line 950
    :goto_9
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 951
    .line 952
    .line 953
    move-result v6

    .line 954
    if-eqz v6, :cond_13

    .line 955
    .line 956
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 957
    .line 958
    .line 959
    move-result-object v6

    .line 960
    check-cast v6, Lu84;

    .line 961
    .line 962
    iget-object v7, v0, Lqb2;->a:Ly74;

    .line 963
    .line 964
    invoke-virtual {v6}, Ln54;->d()Lp54;

    .line 965
    .line 966
    .line 967
    move-result-object v6

    .line 968
    check-cast v6, Lv84;

    .line 969
    .line 970
    invoke-virtual {v7}, Ln54;->b()V

    .line 971
    .line 972
    .line 973
    iget-object v7, v7, Ln54;->g:Lp54;

    .line 974
    .line 975
    check-cast v7, Lc94;

    .line 976
    .line 977
    invoke-virtual {v7, v6}, Lc94;->H(Lv84;)V

    .line 978
    .line 979
    .line 980
    goto :goto_9

    .line 981
    :catchall_4
    move-exception p1

    .line 982
    goto/16 :goto_b

    .line 983
    .line 984
    :cond_13
    iget-object v5, v0, Lqb2;->a:Ly74;

    .line 985
    .line 986
    iget-object v6, v0, Lqb2;->c:Ljava/util/ArrayList;

    .line 987
    .line 988
    invoke-virtual {v5}, Ln54;->b()V

    .line 989
    .line 990
    .line 991
    iget-object v7, v5, Ln54;->g:Lp54;

    .line 992
    .line 993
    check-cast v7, Lc94;

    .line 994
    .line 995
    invoke-virtual {v7, v6}, Lc94;->M(Ljava/util/ArrayList;)V

    .line 996
    .line 997
    .line 998
    iget-object v6, v0, Lqb2;->d:Ljava/util/ArrayList;

    .line 999
    .line 1000
    invoke-virtual {v5}, Ln54;->b()V

    .line 1001
    .line 1002
    .line 1003
    iget-object v7, v5, Ln54;->g:Lp54;

    .line 1004
    .line 1005
    check-cast v7, Lc94;

    .line 1006
    .line 1007
    invoke-virtual {v7, v6}, Lc94;->N(Ljava/util/ArrayList;)V

    .line 1008
    .line 1009
    .line 1010
    sget-object v6, Le12;->a:Lso1;

    .line 1011
    .line 1012
    invoke-virtual {v6}, Lso1;->w()Ljava/lang/Object;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v6

    .line 1016
    check-cast v6, Ljava/lang/Boolean;

    .line 1017
    .line 1018
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1019
    .line 1020
    .line 1021
    move-result v6

    .line 1022
    if-eqz v6, :cond_15

    .line 1023
    .line 1024
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1025
    .line 1026
    iget-object v7, v5, Ln54;->g:Lp54;

    .line 1027
    .line 1028
    check-cast v7, Lc94;

    .line 1029
    .line 1030
    invoke-virtual {v7}, Lc94;->A()Ljava/lang/String;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v7

    .line 1034
    iget-object v8, v5, Ln54;->g:Lp54;

    .line 1035
    .line 1036
    check-cast v8, Lc94;

    .line 1037
    .line 1038
    invoke-virtual {v8}, Lc94;->C()Ljava/lang/String;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v8

    .line 1042
    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v9

    .line 1046
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 1047
    .line 1048
    .line 1049
    move-result v9

    .line 1050
    add-int/lit8 v9, v9, 0x26

    .line 1051
    .line 1052
    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v10

    .line 1056
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 1057
    .line 1058
    .line 1059
    move-result v10

    .line 1060
    add-int/2addr v9, v10

    .line 1061
    add-int/lit8 v9, v9, 0xf

    .line 1062
    .line 1063
    new-instance v10, Ljava/lang/StringBuilder;

    .line 1064
    .line 1065
    invoke-direct {v10, v9}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1066
    .line 1067
    .line 1068
    invoke-virtual {v10, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1069
    .line 1070
    .line 1071
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1072
    .line 1073
    .line 1074
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1075
    .line 1076
    .line 1077
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1078
    .line 1079
    .line 1080
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1081
    .line 1082
    .line 1083
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1084
    .line 1085
    .line 1086
    move-result-object p1

    .line 1087
    invoke-direct {v6, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1088
    .line 1089
    .line 1090
    iget-object p1, v5, Ln54;->g:Lp54;

    .line 1091
    .line 1092
    check-cast p1, Lc94;

    .line 1093
    .line 1094
    invoke-virtual {p1}, Lc94;->B()Lx54;

    .line 1095
    .line 1096
    .line 1097
    move-result-object p1

    .line 1098
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 1099
    .line 1100
    .line 1101
    move-result-object p1

    .line 1102
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1103
    .line 1104
    .line 1105
    move-result-object p1

    .line 1106
    :goto_a
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1107
    .line 1108
    .line 1109
    move-result v1

    .line 1110
    if-eqz v1, :cond_14

    .line 1111
    .line 1112
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v1

    .line 1116
    check-cast v1, Lv84;

    .line 1117
    .line 1118
    const-string v3, "    ["

    .line 1119
    .line 1120
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1121
    .line 1122
    .line 1123
    invoke-virtual {v1}, Lv84;->B()I

    .line 1124
    .line 1125
    .line 1126
    move-result v3

    .line 1127
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1128
    .line 1129
    .line 1130
    const-string v3, "] "

    .line 1131
    .line 1132
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1133
    .line 1134
    .line 1135
    invoke-virtual {v1}, Lv84;->A()Ljava/lang/String;

    .line 1136
    .line 1137
    .line 1138
    move-result-object v1

    .line 1139
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1140
    .line 1141
    .line 1142
    goto :goto_a

    .line 1143
    :cond_14
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1144
    .line 1145
    .line 1146
    move-result-object p1

    .line 1147
    invoke-static {p1}, Lwl2;->F(Ljava/lang/String;)V

    .line 1148
    .line 1149
    .line 1150
    :cond_15
    invoke-virtual {v5}, Ln54;->d()Lp54;

    .line 1151
    .line 1152
    .line 1153
    move-result-object p1

    .line 1154
    check-cast p1, Lc94;

    .line 1155
    .line 1156
    invoke-virtual {p1}, Ls44;->b()[B

    .line 1157
    .line 1158
    .line 1159
    move-result-object p1

    .line 1160
    iget-object v1, v0, Lqb2;->g:Lrb2;

    .line 1161
    .line 1162
    iget-object v1, v1, Lrb2;->g:Ljava/lang/String;

    .line 1163
    .line 1164
    new-instance v3, Lp32;

    .line 1165
    .line 1166
    iget-object v0, v0, Lqb2;->e:Landroid/content/Context;

    .line 1167
    .line 1168
    invoke-direct {v3, v0}, Lp32;-><init>(Landroid/content/Context;)V

    .line 1169
    .line 1170
    .line 1171
    const/4 v0, 0x0

    .line 1172
    invoke-virtual {v3, v2, v1, v0, p1}, Lp32;->a(ILjava/lang/String;Ljava/util/HashMap;[B)Lt12;

    .line 1173
    .line 1174
    .line 1175
    move-result-object p1

    .line 1176
    sget-object v0, Le12;->a:Lso1;

    .line 1177
    .line 1178
    invoke-virtual {v0}, Lso1;->w()Ljava/lang/Object;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v0

    .line 1182
    check-cast v0, Ljava/lang/Boolean;

    .line 1183
    .line 1184
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1185
    .line 1186
    .line 1187
    move-result v0

    .line 1188
    if-eqz v0, :cond_16

    .line 1189
    .line 1190
    sget-object v0, Lvr;->g:Lvr;

    .line 1191
    .line 1192
    sget-object v1, Lmd2;->a:Lld2;

    .line 1193
    .line 1194
    iget-object v2, p1, Lpd2;->f:Lwq3;

    .line 1195
    .line 1196
    invoke-virtual {v2, v0, v1}, Lgp3;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 1197
    .line 1198
    .line 1199
    :cond_16
    sget-object v0, Lgj1;->f:Lgj1;

    .line 1200
    .line 1201
    sget-object v1, Lmd2;->g:Lld2;

    .line 1202
    .line 1203
    invoke-static {p1, v0, v1}, Lpu1;->P(Ln70;Lzk3;Ljava/util/concurrent/Executor;)Lrp3;

    .line 1204
    .line 1205
    .line 1206
    move-result-object p1

    .line 1207
    monitor-exit v4

    .line 1208
    goto :goto_c

    .line 1209
    :goto_b
    monitor-exit v4
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 1210
    :try_start_c
    throw p1

    .line 1211
    :cond_17
    sget-object p1, Llq3;->g:Llq3;
    :try_end_c
    .catch Lorg/json/JSONException; {:try_start_c .. :try_end_c} :catch_1

    .line 1212
    .line 1213
    goto :goto_c

    .line 1214
    :catch_1
    sget-object p1, Le12;->a:Lso1;

    .line 1215
    .line 1216
    invoke-virtual {p1}, Lso1;->w()Ljava/lang/Object;

    .line 1217
    .line 1218
    .line 1219
    move-result-object p1

    .line 1220
    check-cast p1, Ljava/lang/Boolean;

    .line 1221
    .line 1222
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1223
    .line 1224
    .line 1225
    move-result p1

    .line 1226
    if-eqz p1, :cond_18

    .line 1227
    .line 1228
    const/4 p1, 0x3

    .line 1229
    invoke-static {p1}, Lgi2;->q0(I)Z

    .line 1230
    .line 1231
    .line 1232
    :cond_18
    new-instance p1, Ljava/lang/Exception;

    .line 1233
    .line 1234
    const-string v0, "Safebrowsing report transmission failed."

    .line 1235
    .line 1236
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 1237
    .line 1238
    .line 1239
    invoke-static {p1}, Lpu1;->B(Ljava/lang/Throwable;)Lkq3;

    .line 1240
    .line 1241
    .line 1242
    move-result-object p1

    .line 1243
    :goto_c
    return-object p1

    .line 1244
    :pswitch_12
    check-cast p1, Ls42;

    .line 1245
    .line 1246
    new-instance v0, Lpd2;

    .line 1247
    .line 1248
    invoke-direct {v0}, Lpd2;-><init>()V

    .line 1249
    .line 1250
    .line 1251
    new-instance v1, Lt42;

    .line 1252
    .line 1253
    invoke-direct {v1, p0, v0}, Lt42;-><init>(Lu42;Lpd2;)V

    .line 1254
    .line 1255
    .line 1256
    iget-object v2, p0, Lu42;->b:Ljava/lang/Object;

    .line 1257
    .line 1258
    check-cast v2, Lq42;

    .line 1259
    .line 1260
    invoke-virtual {p1}, Lsb1;->U()Landroid/os/Parcel;

    .line 1261
    .line 1262
    .line 1263
    move-result-object v3

    .line 1264
    invoke-static {v3, v2}, Liv1;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 1265
    .line 1266
    .line 1267
    invoke-static {v3, v1}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 1268
    .line 1269
    .line 1270
    const/4 v1, 0x2

    .line 1271
    invoke-virtual {p1, v3, v1}, Lsb1;->X0(Landroid/os/Parcel;I)V

    .line 1272
    .line 1273
    .line 1274
    return-object v0

    .line 1275
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_12
        :pswitch_11
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
        :pswitch_0
    .end packed-switch

    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch
.end method
