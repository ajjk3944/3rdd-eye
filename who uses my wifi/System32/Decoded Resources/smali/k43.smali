.class public final Lk43;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final synthetic a:I

.field public final b:Lga4;

.field public final c:Lga4;


# direct methods
.method public constructor <init>(Lba4;Ltm2;)V
    .locals 1

    const/16 v0, 0xf

    iput v0, p0, Lk43;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk43;->b:Lga4;

    iput-object p2, p0, Lk43;->c:Lga4;

    return-void
.end method

.method public synthetic constructor <init>(Lga4;Lga4;I)V
    .locals 0

    .line 2
    iput p3, p0, Lk43;->a:I

    iput-object p1, p0, Lk43;->c:Lga4;

    iput-object p2, p0, Lk43;->b:Lga4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lk43;->a:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const/4 v2, 0x5

    .line 5
    const/4 v3, 0x3

    .line 6
    iget-object v4, p0, Lk43;->b:Lga4;

    .line 7
    .line 8
    iget-object v5, p0, Lk43;->c:Lga4;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast v5, Lba4;

    .line 14
    .line 15
    invoke-virtual {v5}, Lba4;->d()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lbk3;

    .line 20
    .line 21
    check-cast v4, Lha4;

    .line 22
    .line 23
    invoke-virtual {v4}, Lha4;->b()Ljava/util/Set;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    new-instance v2, Lxj3;

    .line 28
    .line 29
    invoke-direct {v2, v0, v1}, Lxj3;-><init>(Lbk3;Ljava/util/Set;)V

    .line 30
    .line 31
    .line 32
    return-object v2

    .line 33
    :pswitch_0
    sget-object v0, Lmd2;->a:Lld2;

    .line 34
    .line 35
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-interface {v4}, Lga4;->d()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Ljava/util/concurrent/ScheduledExecutorService;

    .line 43
    .line 44
    check-cast v5, Ltm2;

    .line 45
    .line 46
    iget-object v2, v5, Ltm2;->b:Lha4;

    .line 47
    .line 48
    invoke-virtual {v2}, Lha4;->b()Ljava/util/Set;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    new-instance v3, Lt93;

    .line 53
    .line 54
    invoke-direct {v3, v2}, Lf74;-><init>(Ljava/util/Set;)V

    .line 55
    .line 56
    .line 57
    new-instance v2, Lu93;

    .line 58
    .line 59
    invoke-direct {v2, v0, v1, v3}, Lu93;-><init>(Lpq3;Ljava/util/concurrent/ScheduledExecutorService;Lt93;)V

    .line 60
    .line 61
    .line 62
    return-object v2

    .line 63
    :pswitch_1
    check-cast v5, Lu43;

    .line 64
    .line 65
    sget-object v0, Lmd2;->a:Lld2;

    .line 66
    .line 67
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    iget-object v1, v5, Lu43;->b:Lga4;

    .line 71
    .line 72
    check-cast v1, Lhh2;

    .line 73
    .line 74
    invoke-virtual {v1}, Lhh2;->a()Landroid/content/Context;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    new-instance v3, Lo33;

    .line 79
    .line 80
    invoke-direct {v3, v0, v1, v2}, Lo33;-><init>(Lpq3;Landroid/content/Context;I)V

    .line 81
    .line 82
    .line 83
    invoke-interface {v4}, Lga4;->d()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    check-cast v0, Ljava/util/concurrent/ScheduledExecutorService;

    .line 88
    .line 89
    new-instance v1, Lx43;

    .line 90
    .line 91
    sget-object v2, Lmz1;->Qc:Liz1;

    .line 92
    .line 93
    sget-object v4, Ltw1;->e:Ltw1;

    .line 94
    .line 95
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 96
    .line 97
    invoke-virtual {v4, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    check-cast v2, Ljava/lang/Integer;

    .line 102
    .line 103
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    int-to-long v4, v2

    .line 108
    invoke-direct {v1, v3, v4, v5, v0}, Lx43;-><init>(Lq53;JLjava/util/concurrent/ScheduledExecutorService;)V

    .line 109
    .line 110
    .line 111
    return-object v1

    .line 112
    :pswitch_2
    check-cast v5, Lqk2;

    .line 113
    .line 114
    iget-object v0, v5, Lqk2;->b:Lga4;

    .line 115
    .line 116
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    check-cast v0, Loc2;

    .line 121
    .line 122
    sget-object v1, Lmd2;->a:Lld2;

    .line 123
    .line 124
    invoke-static {v1}, Li41;->M(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    iget-object v2, v5, Lqk2;->c:Lga4;

    .line 128
    .line 129
    check-cast v2, Lhh2;

    .line 130
    .line 131
    invoke-virtual {v2}, Lhh2;->a()Landroid/content/Context;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    new-instance v5, Lk33;

    .line 136
    .line 137
    invoke-direct {v5, v0, v1, v2, v3}, Lk33;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 138
    .line 139
    .line 140
    invoke-interface {v4}, Lga4;->d()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    check-cast v0, Ljava/util/concurrent/ScheduledExecutorService;

    .line 145
    .line 146
    new-instance v1, Lx43;

    .line 147
    .line 148
    sget-object v2, Lmz1;->Sc:Liz1;

    .line 149
    .line 150
    sget-object v3, Ltw1;->e:Ltw1;

    .line 151
    .line 152
    iget-object v3, v3, Ltw1;->c:Lkz1;

    .line 153
    .line 154
    invoke-virtual {v3, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    check-cast v2, Ljava/lang/Integer;

    .line 159
    .line 160
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    int-to-long v2, v2

    .line 165
    invoke-direct {v1, v5, v2, v3, v0}, Lx43;-><init>(Lq53;JLjava/util/concurrent/ScheduledExecutorService;)V

    .line 166
    .line 167
    .line 168
    return-object v1

    .line 169
    :pswitch_3
    check-cast v5, Lql2;

    .line 170
    .line 171
    invoke-virtual {v5}, Lql2;->b()Le33;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-interface {v4}, Lga4;->d()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    check-cast v1, Ljava/util/concurrent/ScheduledExecutorService;

    .line 180
    .line 181
    new-instance v2, Lx43;

    .line 182
    .line 183
    sget-object v3, Lmz1;->Tc:Liz1;

    .line 184
    .line 185
    sget-object v4, Ltw1;->e:Ltw1;

    .line 186
    .line 187
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 188
    .line 189
    invoke-virtual {v4, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    check-cast v3, Ljava/lang/Integer;

    .line 194
    .line 195
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 196
    .line 197
    .line 198
    move-result v3

    .line 199
    int-to-long v3, v3

    .line 200
    invoke-direct {v2, v0, v3, v4, v1}, Lx43;-><init>(Lq53;JLjava/util/concurrent/ScheduledExecutorService;)V

    .line 201
    .line 202
    .line 203
    return-object v2

    .line 204
    :pswitch_4
    check-cast v5, Lu43;

    .line 205
    .line 206
    sget-object v0, Lmd2;->a:Lld2;

    .line 207
    .line 208
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    iget-object v1, v5, Lu43;->b:Lga4;

    .line 212
    .line 213
    invoke-interface {v1}, Lga4;->d()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    check-cast v1, Lxv2;

    .line 218
    .line 219
    new-instance v2, Lg33;

    .line 220
    .line 221
    const/4 v3, 0x6

    .line 222
    invoke-direct {v2, v0, v1, v3}, Lg33;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 223
    .line 224
    .line 225
    invoke-interface {v4}, Lga4;->d()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    check-cast v0, Ljava/util/concurrent/ScheduledExecutorService;

    .line 230
    .line 231
    new-instance v1, Lx43;

    .line 232
    .line 233
    sget-object v3, Lmz1;->Xc:Liz1;

    .line 234
    .line 235
    sget-object v4, Ltw1;->e:Ltw1;

    .line 236
    .line 237
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 238
    .line 239
    invoke-virtual {v4, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    check-cast v3, Ljava/lang/Integer;

    .line 244
    .line 245
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 246
    .line 247
    .line 248
    move-result v3

    .line 249
    int-to-long v3, v3

    .line 250
    invoke-direct {v1, v2, v3, v4, v0}, Lx43;-><init>(Lq53;JLjava/util/concurrent/ScheduledExecutorService;)V

    .line 251
    .line 252
    .line 253
    return-object v1

    .line 254
    :pswitch_5
    check-cast v5, Lu43;

    .line 255
    .line 256
    sget-object v0, Lmd2;->a:Lld2;

    .line 257
    .line 258
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    iget-object v1, v5, Lu43;->b:Lga4;

    .line 262
    .line 263
    check-cast v1, Lhh2;

    .line 264
    .line 265
    invoke-virtual {v1}, Lhh2;->a()Landroid/content/Context;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    new-instance v2, Lg43;

    .line 270
    .line 271
    invoke-direct {v2, v1, v0}, Lg43;-><init>(Landroid/content/Context;Lpq3;)V

    .line 272
    .line 273
    .line 274
    invoke-interface {v4}, Lga4;->d()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    check-cast v0, Ljava/util/concurrent/ScheduledExecutorService;

    .line 279
    .line 280
    new-instance v1, Lx43;

    .line 281
    .line 282
    sget-object v3, Lmz1;->Vc:Liz1;

    .line 283
    .line 284
    sget-object v4, Ltw1;->e:Ltw1;

    .line 285
    .line 286
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 287
    .line 288
    invoke-virtual {v4, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v3

    .line 292
    check-cast v3, Ljava/lang/Integer;

    .line 293
    .line 294
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 295
    .line 296
    .line 297
    move-result v3

    .line 298
    int-to-long v3, v3

    .line 299
    invoke-direct {v1, v2, v3, v4, v0}, Lx43;-><init>(Lq53;JLjava/util/concurrent/ScheduledExecutorService;)V

    .line 300
    .line 301
    .line 302
    return-object v1

    .line 303
    :pswitch_6
    check-cast v5, Lu43;

    .line 304
    .line 305
    iget-object v0, v5, Lu43;->b:Lga4;

    .line 306
    .line 307
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    check-cast v0, Lz73;

    .line 312
    .line 313
    new-instance v2, Lb33;

    .line 314
    .line 315
    invoke-direct {v2, v1, v0}, Lb33;-><init>(ILjava/lang/Object;)V

    .line 316
    .line 317
    .line 318
    invoke-interface {v4}, Lga4;->d()Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    check-cast v0, Ljava/util/concurrent/ScheduledExecutorService;

    .line 323
    .line 324
    new-instance v1, Lx43;

    .line 325
    .line 326
    sget-object v3, Lmz1;->od:Liz1;

    .line 327
    .line 328
    sget-object v4, Ltw1;->e:Ltw1;

    .line 329
    .line 330
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 331
    .line 332
    invoke-virtual {v4, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v3

    .line 336
    check-cast v3, Ljava/lang/Integer;

    .line 337
    .line 338
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 339
    .line 340
    .line 341
    move-result v3

    .line 342
    int-to-long v3, v3

    .line 343
    invoke-direct {v1, v2, v3, v4, v0}, Lx43;-><init>(Lq53;JLjava/util/concurrent/ScheduledExecutorService;)V

    .line 344
    .line 345
    .line 346
    return-object v1

    .line 347
    :pswitch_7
    check-cast v5, Lu43;

    .line 348
    .line 349
    sget-object v0, Lmd2;->a:Lld2;

    .line 350
    .line 351
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    iget-object v1, v5, Lu43;->b:Lga4;

    .line 355
    .line 356
    invoke-interface {v1}, Lga4;->d()Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v1

    .line 360
    check-cast v1, Lzw2;

    .line 361
    .line 362
    new-instance v3, Lg33;

    .line 363
    .line 364
    invoke-direct {v3, v0, v1, v2}, Lg33;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 365
    .line 366
    .line 367
    invoke-interface {v4}, Lga4;->d()Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    check-cast v0, Ljava/util/concurrent/ScheduledExecutorService;

    .line 372
    .line 373
    new-instance v1, Lx43;

    .line 374
    .line 375
    sget-object v2, Lmz1;->Yc:Liz1;

    .line 376
    .line 377
    sget-object v4, Ltw1;->e:Ltw1;

    .line 378
    .line 379
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 380
    .line 381
    invoke-virtual {v4, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v2

    .line 385
    check-cast v2, Ljava/lang/Integer;

    .line 386
    .line 387
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 388
    .line 389
    .line 390
    move-result v2

    .line 391
    int-to-long v4, v2

    .line 392
    invoke-direct {v1, v3, v4, v5, v0}, Lx43;-><init>(Lq53;JLjava/util/concurrent/ScheduledExecutorService;)V

    .line 393
    .line 394
    .line 395
    return-object v1

    .line 396
    :pswitch_8
    check-cast v5, Lku2;

    .line 397
    .line 398
    sget-object v0, Lmd2;->a:Lld2;

    .line 399
    .line 400
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 401
    .line 402
    .line 403
    iget-object v1, v5, Lku2;->b:Lqm2;

    .line 404
    .line 405
    invoke-virtual {v1}, Lqm2;->a()Ll83;

    .line 406
    .line 407
    .line 408
    move-result-object v1

    .line 409
    new-instance v2, Lg33;

    .line 410
    .line 411
    invoke-direct {v2, v0, v1, v3}, Lg33;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 412
    .line 413
    .line 414
    invoke-interface {v4}, Lga4;->d()Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    check-cast v0, Ljava/util/concurrent/ScheduledExecutorService;

    .line 419
    .line 420
    new-instance v1, Lx43;

    .line 421
    .line 422
    sget-object v3, Lmz1;->nd:Liz1;

    .line 423
    .line 424
    sget-object v4, Ltw1;->e:Ltw1;

    .line 425
    .line 426
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 427
    .line 428
    invoke-virtual {v4, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v3

    .line 432
    check-cast v3, Ljava/lang/Integer;

    .line 433
    .line 434
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 435
    .line 436
    .line 437
    move-result v3

    .line 438
    int-to-long v3, v3

    .line 439
    invoke-direct {v1, v2, v3, v4, v0}, Lx43;-><init>(Lq53;JLjava/util/concurrent/ScheduledExecutorService;)V

    .line 440
    .line 441
    .line 442
    return-object v1

    .line 443
    :pswitch_9
    check-cast v5, Lri2;

    .line 444
    .line 445
    sget-object v0, Lmd2;->a:Lld2;

    .line 446
    .line 447
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 448
    .line 449
    .line 450
    iget-object v2, v5, Lri2;->b:Lga4;

    .line 451
    .line 452
    check-cast v2, Lhh2;

    .line 453
    .line 454
    invoke-virtual {v2}, Lhh2;->a()Landroid/content/Context;

    .line 455
    .line 456
    .line 457
    move-result-object v2

    .line 458
    new-instance v3, Lo33;

    .line 459
    .line 460
    invoke-direct {v3, v0, v2, v1}, Lo33;-><init>(Lpq3;Landroid/content/Context;I)V

    .line 461
    .line 462
    .line 463
    check-cast v4, Lhh2;

    .line 464
    .line 465
    invoke-virtual {v4}, Lhh2;->a()Landroid/content/Context;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    sget-object v1, Lmz1;->gc:Liz1;

    .line 470
    .line 471
    sget-object v2, Ltw1;->e:Ltw1;

    .line 472
    .line 473
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 474
    .line 475
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    move-result-object v1

    .line 479
    check-cast v1, Ljava/lang/Boolean;

    .line 480
    .line 481
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 482
    .line 483
    .line 484
    move-result v1

    .line 485
    if-eqz v1, :cond_0

    .line 486
    .line 487
    sget-object v1, Lhg4;->C:Lhg4;

    .line 488
    .line 489
    iget-object v1, v1, Lhg4;->c:Llf4;

    .line 490
    .line 491
    invoke-static {v0}, Llf4;->d(Landroid/content/Context;)Z

    .line 492
    .line 493
    .line 494
    move-result v0

    .line 495
    if-eqz v0, :cond_0

    .line 496
    .line 497
    sget v0, Ldn3;->h:I

    .line 498
    .line 499
    new-instance v0, Len3;

    .line 500
    .line 501
    invoke-direct {v0, v3}, Len3;-><init>(Ljava/lang/Object;)V

    .line 502
    .line 503
    .line 504
    goto :goto_0

    .line 505
    :cond_0
    sget v0, Ldn3;->h:I

    .line 506
    .line 507
    sget-object v0, Lyn3;->o:Lyn3;

    .line 508
    .line 509
    :goto_0
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 510
    .line 511
    .line 512
    return-object v0

    .line 513
    :pswitch_a
    check-cast v5, Lri2;

    .line 514
    .line 515
    iget-object v0, v5, Lri2;->b:Lga4;

    .line 516
    .line 517
    check-cast v0, Lhh2;

    .line 518
    .line 519
    invoke-virtual {v0}, Lhh2;->a()Landroid/content/Context;

    .line 520
    .line 521
    .line 522
    move-result-object v0

    .line 523
    sget-object v1, Lmd2;->a:Lld2;

    .line 524
    .line 525
    invoke-static {v1}, Li41;->M(Ljava/lang/Object;)V

    .line 526
    .line 527
    .line 528
    new-instance v2, Lo33;

    .line 529
    .line 530
    invoke-direct {v2, v0, v1, v3}, Lo33;-><init>(Landroid/content/Context;Lpq3;I)V

    .line 531
    .line 532
    .line 533
    invoke-interface {v4}, Lga4;->d()Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    check-cast v0, Ljava/util/concurrent/ScheduledExecutorService;

    .line 538
    .line 539
    new-instance v1, Lx43;

    .line 540
    .line 541
    sget-object v3, Lmz1;->ad:Liz1;

    .line 542
    .line 543
    sget-object v4, Ltw1;->e:Ltw1;

    .line 544
    .line 545
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 546
    .line 547
    invoke-virtual {v4, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    move-result-object v3

    .line 551
    check-cast v3, Ljava/lang/Integer;

    .line 552
    .line 553
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 554
    .line 555
    .line 556
    move-result v3

    .line 557
    int-to-long v3, v3

    .line 558
    invoke-direct {v1, v2, v3, v4, v0}, Lx43;-><init>(Lq53;JLjava/util/concurrent/ScheduledExecutorService;)V

    .line 559
    .line 560
    .line 561
    return-object v1

    .line 562
    :pswitch_b
    check-cast v5, Lql2;

    .line 563
    .line 564
    invoke-virtual {v5}, Lql2;->a()Le33;

    .line 565
    .line 566
    .line 567
    move-result-object v0

    .line 568
    invoke-interface {v4}, Lga4;->d()Ljava/lang/Object;

    .line 569
    .line 570
    .line 571
    move-result-object v1

    .line 572
    check-cast v1, Ljava/util/concurrent/ScheduledExecutorService;

    .line 573
    .line 574
    new-instance v2, Lx43;

    .line 575
    .line 576
    sget-object v3, Lmz1;->jd:Liz1;

    .line 577
    .line 578
    sget-object v4, Ltw1;->e:Ltw1;

    .line 579
    .line 580
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 581
    .line 582
    invoke-virtual {v4, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 583
    .line 584
    .line 585
    move-result-object v3

    .line 586
    check-cast v3, Ljava/lang/Integer;

    .line 587
    .line 588
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 589
    .line 590
    .line 591
    move-result v3

    .line 592
    int-to-long v3, v3

    .line 593
    invoke-direct {v2, v0, v3, v4, v1}, Lx43;-><init>(Lq53;JLjava/util/concurrent/ScheduledExecutorService;)V

    .line 594
    .line 595
    .line 596
    return-object v2

    .line 597
    :pswitch_c
    check-cast v5, Law2;

    .line 598
    .line 599
    iget-object v0, v5, Law2;->b:Lda4;

    .line 600
    .line 601
    iget-object v0, v0, Lda4;->a:Ljava/lang/Object;

    .line 602
    .line 603
    check-cast v0, Lb73;

    .line 604
    .line 605
    new-instance v1, Lb33;

    .line 606
    .line 607
    invoke-direct {v1, v3, v0}, Lb33;-><init>(ILjava/lang/Object;)V

    .line 608
    .line 609
    .line 610
    invoke-interface {v4}, Lga4;->d()Ljava/lang/Object;

    .line 611
    .line 612
    .line 613
    move-result-object v0

    .line 614
    check-cast v0, Ljava/util/concurrent/ScheduledExecutorService;

    .line 615
    .line 616
    new-instance v2, Lx43;

    .line 617
    .line 618
    sget-object v3, Lmz1;->bd:Liz1;

    .line 619
    .line 620
    sget-object v4, Ltw1;->e:Ltw1;

    .line 621
    .line 622
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 623
    .line 624
    invoke-virtual {v4, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 625
    .line 626
    .line 627
    move-result-object v3

    .line 628
    check-cast v3, Ljava/lang/Integer;

    .line 629
    .line 630
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 631
    .line 632
    .line 633
    move-result v3

    .line 634
    int-to-long v3, v3

    .line 635
    invoke-direct {v2, v1, v3, v4, v0}, Lx43;-><init>(Lq53;JLjava/util/concurrent/ScheduledExecutorService;)V

    .line 636
    .line 637
    .line 638
    return-object v2

    .line 639
    :pswitch_d
    check-cast v5, Lri2;

    .line 640
    .line 641
    sget-object v0, Lmd2;->a:Lld2;

    .line 642
    .line 643
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 644
    .line 645
    .line 646
    iget-object v1, v5, Lri2;->b:Lga4;

    .line 647
    .line 648
    check-cast v1, Lhh2;

    .line 649
    .line 650
    invoke-virtual {v1}, Lhh2;->a()Landroid/content/Context;

    .line 651
    .line 652
    .line 653
    move-result-object v1

    .line 654
    new-instance v2, Lo33;

    .line 655
    .line 656
    const/4 v3, 0x0

    .line 657
    invoke-direct {v2, v0, v1, v3}, Lo33;-><init>(Lpq3;Landroid/content/Context;I)V

    .line 658
    .line 659
    .line 660
    invoke-interface {v4}, Lga4;->d()Ljava/lang/Object;

    .line 661
    .line 662
    .line 663
    move-result-object v0

    .line 664
    check-cast v0, Ljava/util/concurrent/ScheduledExecutorService;

    .line 665
    .line 666
    new-instance v1, Lx43;

    .line 667
    .line 668
    sget-object v3, Lmz1;->qd:Liz1;

    .line 669
    .line 670
    sget-object v4, Ltw1;->e:Ltw1;

    .line 671
    .line 672
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 673
    .line 674
    invoke-virtual {v4, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 675
    .line 676
    .line 677
    move-result-object v3

    .line 678
    check-cast v3, Ljava/lang/Integer;

    .line 679
    .line 680
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 681
    .line 682
    .line 683
    move-result v3

    .line 684
    int-to-long v3, v3

    .line 685
    invoke-direct {v1, v2, v3, v4, v0}, Lx43;-><init>(Lq53;JLjava/util/concurrent/ScheduledExecutorService;)V

    .line 686
    .line 687
    .line 688
    return-object v1

    .line 689
    :pswitch_e
    check-cast v5, Lq13;

    .line 690
    .line 691
    invoke-virtual {v5}, Lq13;->a()Le33;

    .line 692
    .line 693
    .line 694
    move-result-object v0

    .line 695
    invoke-interface {v4}, Lga4;->d()Ljava/lang/Object;

    .line 696
    .line 697
    .line 698
    move-result-object v1

    .line 699
    check-cast v1, Ljava/util/concurrent/ScheduledExecutorService;

    .line 700
    .line 701
    new-instance v2, Lx43;

    .line 702
    .line 703
    sget-object v3, Lmz1;->id:Liz1;

    .line 704
    .line 705
    sget-object v4, Ltw1;->e:Ltw1;

    .line 706
    .line 707
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 708
    .line 709
    invoke-virtual {v4, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 710
    .line 711
    .line 712
    move-result-object v3

    .line 713
    check-cast v3, Ljava/lang/Integer;

    .line 714
    .line 715
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 716
    .line 717
    .line 718
    move-result v3

    .line 719
    int-to-long v3, v3

    .line 720
    invoke-direct {v2, v0, v3, v4, v1}, Lx43;-><init>(Lq53;JLjava/util/concurrent/ScheduledExecutorService;)V

    .line 721
    .line 722
    .line 723
    return-object v2

    .line 724
    :pswitch_f
    check-cast v5, Lwx2;

    .line 725
    .line 726
    invoke-virtual {v5}, Lwx2;->a()Le33;

    .line 727
    .line 728
    .line 729
    move-result-object v0

    .line 730
    invoke-interface {v4}, Lga4;->d()Ljava/lang/Object;

    .line 731
    .line 732
    .line 733
    move-result-object v1

    .line 734
    check-cast v1, Ljava/util/concurrent/ScheduledExecutorService;

    .line 735
    .line 736
    new-instance v2, Lx43;

    .line 737
    .line 738
    sget-object v3, Lmz1;->gd:Liz1;

    .line 739
    .line 740
    sget-object v4, Ltw1;->e:Ltw1;

    .line 741
    .line 742
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 743
    .line 744
    invoke-virtual {v4, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 745
    .line 746
    .line 747
    move-result-object v3

    .line 748
    check-cast v3, Ljava/lang/Integer;

    .line 749
    .line 750
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 751
    .line 752
    .line 753
    move-result v3

    .line 754
    int-to-long v3, v3

    .line 755
    invoke-direct {v2, v0, v3, v4, v1}, Lx43;-><init>(Lq53;JLjava/util/concurrent/ScheduledExecutorService;)V

    .line 756
    .line 757
    .line 758
    return-object v2

    .line 759
    :pswitch_data_0
    .packed-switch 0x0
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
