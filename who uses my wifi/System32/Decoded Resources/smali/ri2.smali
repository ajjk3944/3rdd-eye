.class public final Lri2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final synthetic a:I

.field public final b:Lga4;


# direct methods
.method public synthetic constructor <init>(Lga4;I)V
    .locals 0

    .line 1
    iput p2, p0, Lri2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lri2;->b:Lga4;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()Liy2;
    .locals 7

    .line 1
    iget-object v0, p0, Lri2;->b:Lga4;

    .line 2
    .line 3
    check-cast v0, Lhh2;

    .line 4
    .line 5
    invoke-virtual {v0}, Lhh2;->a()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    new-instance v4, Liy2;

    .line 10
    .line 11
    invoke-direct {v4}, Lfy2;-><init>()V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    iput v0, v4, Liy2;->m:I

    .line 16
    .line 17
    sget-object v0, Lhg4;->C:Lhg4;

    .line 18
    .line 19
    iget-object v0, v0, Lhg4;->t:Lr2;

    .line 20
    .line 21
    invoke-virtual {v0}, Lr2;->a()Landroid/os/Looper;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    new-instance v1, Lvw1;

    .line 26
    .line 27
    const/4 v6, 0x2

    .line 28
    move-object v5, v4

    .line 29
    invoke-direct/range {v1 .. v6}, Lvw1;-><init>(Landroid/content/Context;Landroid/os/Looper;Lt9;Lu9;I)V

    .line 30
    .line 31
    .line 32
    iput-object v1, v4, Lfy2;->k:Lvw1;

    .line 33
    .line 34
    return-object v4
.end method

.method public final d()Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lri2;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object v3, p0, Lri2;->b:Lga4;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, Lmd2;->a:Lld2;

    .line 11
    .line 12
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    check-cast v3, Lhh2;

    .line 16
    .line 17
    invoke-virtual {v3}, Lhh2;->a()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    new-instance v2, Lo33;

    .line 22
    .line 23
    const/4 v3, 0x4

    .line 24
    invoke-direct {v2, v0, v1, v3}, Lo33;-><init>(Lpq3;Landroid/content/Context;I)V

    .line 25
    .line 26
    .line 27
    return-object v2

    .line 28
    :pswitch_0
    check-cast v3, Lhh2;

    .line 29
    .line 30
    invoke-virtual {v3}, Lhh2;->a()Landroid/content/Context;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sget-object v1, Lmd2;->a:Lld2;

    .line 35
    .line 36
    invoke-static {v1}, Li41;->M(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    new-instance v2, Lo33;

    .line 40
    .line 41
    const/4 v3, 0x3

    .line 42
    invoke-direct {v2, v0, v1, v3}, Lo33;-><init>(Landroid/content/Context;Lpq3;I)V

    .line 43
    .line 44
    .line 45
    return-object v2

    .line 46
    :pswitch_1
    sget-object v0, Lmd2;->a:Lld2;

    .line 47
    .line 48
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    new-instance v1, Lg43;

    .line 52
    .line 53
    invoke-direct {v1, v0, v2}, Lg43;-><init>(Lpq3;I)V

    .line 54
    .line 55
    .line 56
    invoke-interface {v3}, Lga4;->d()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    check-cast v0, Ljava/util/concurrent/ScheduledExecutorService;

    .line 61
    .line 62
    new-instance v2, Lx43;

    .line 63
    .line 64
    sget-object v3, Lmz1;->Zc:Liz1;

    .line 65
    .line 66
    sget-object v4, Ltw1;->e:Ltw1;

    .line 67
    .line 68
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 69
    .line 70
    invoke-virtual {v4, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    check-cast v3, Ljava/lang/Integer;

    .line 75
    .line 76
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    int-to-long v3, v3

    .line 81
    invoke-direct {v2, v1, v3, v4, v0}, Lx43;-><init>(Lq53;JLjava/util/concurrent/ScheduledExecutorService;)V

    .line 82
    .line 83
    .line 84
    return-object v2

    .line 85
    :pswitch_2
    sget-object v0, Lmd2;->a:Lld2;

    .line 86
    .line 87
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    new-instance v2, Lg43;

    .line 91
    .line 92
    invoke-direct {v2, v0, v1}, Lg43;-><init>(Lpq3;I)V

    .line 93
    .line 94
    .line 95
    invoke-interface {v3}, Lga4;->d()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, Ljava/util/concurrent/ScheduledExecutorService;

    .line 100
    .line 101
    sget-object v1, Lmz1;->x4:Liz1;

    .line 102
    .line 103
    sget-object v3, Ltw1;->e:Ltw1;

    .line 104
    .line 105
    iget-object v4, v3, Ltw1;->c:Lkz1;

    .line 106
    .line 107
    invoke-virtual {v4, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    check-cast v1, Ljava/lang/Boolean;

    .line 112
    .line 113
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    if-eqz v1, :cond_0

    .line 118
    .line 119
    new-instance v1, Lx43;

    .line 120
    .line 121
    sget-object v4, Lmz1;->y4:Liz1;

    .line 122
    .line 123
    iget-object v3, v3, Ltw1;->c:Lkz1;

    .line 124
    .line 125
    invoke-virtual {v3, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    check-cast v3, Ljava/lang/Integer;

    .line 130
    .line 131
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    int-to-long v3, v3

    .line 136
    invoke-direct {v1, v2, v3, v4, v0}, Lx43;-><init>(Lq53;JLjava/util/concurrent/ScheduledExecutorService;)V

    .line 137
    .line 138
    .line 139
    sget v0, Ldn3;->h:I

    .line 140
    .line 141
    new-instance v0, Len3;

    .line 142
    .line 143
    invoke-direct {v0, v1}, Len3;-><init>(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_0
    sget v0, Ldn3;->h:I

    .line 148
    .line 149
    sget-object v0, Lyn3;->o:Lyn3;

    .line 150
    .line 151
    :goto_0
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    return-object v0

    .line 155
    :pswitch_3
    sget-object v0, Lmd2;->a:Lld2;

    .line 156
    .line 157
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    check-cast v3, Lhh2;

    .line 161
    .line 162
    invoke-virtual {v3}, Lhh2;->a()Landroid/content/Context;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    new-instance v3, Lo33;

    .line 167
    .line 168
    invoke-direct {v3, v0, v2, v1}, Lo33;-><init>(Lpq3;Landroid/content/Context;I)V

    .line 169
    .line 170
    .line 171
    return-object v3

    .line 172
    :pswitch_4
    invoke-interface {v3}, Lga4;->d()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    check-cast v0, Ljava/util/Set;

    .line 177
    .line 178
    new-instance v1, Lb33;

    .line 179
    .line 180
    invoke-direct {v1, v2, v0}, Lb33;-><init>(ILjava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    return-object v1

    .line 184
    :pswitch_5
    invoke-interface {v3}, Lga4;->d()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    check-cast v0, Lmv2;

    .line 189
    .line 190
    new-instance v1, Ls23;

    .line 191
    .line 192
    invoke-direct {v1, v0}, Ls23;-><init>(Lmv2;)V

    .line 193
    .line 194
    .line 195
    return-object v1

    .line 196
    :pswitch_6
    invoke-interface {v3}, Lga4;->d()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    check-cast v0, Lyu2;

    .line 201
    .line 202
    new-instance v1, Lh23;

    .line 203
    .line 204
    invoke-direct {v1, v0}, Lh23;-><init>(Lyu2;)V

    .line 205
    .line 206
    .line 207
    return-object v1

    .line 208
    :pswitch_7
    check-cast v3, Lhh2;

    .line 209
    .line 210
    invoke-virtual {v3}, Lhh2;->a()Landroid/content/Context;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    new-instance v1, Lx91;

    .line 215
    .line 216
    invoke-direct {v1, v0}, Lx91;-><init>(Landroid/content/Context;)V

    .line 217
    .line 218
    .line 219
    return-object v1

    .line 220
    :pswitch_8
    check-cast v3, Lhh2;

    .line 221
    .line 222
    invoke-virtual {v3}, Lhh2;->a()Landroid/content/Context;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    new-instance v1, Lyz2;

    .line 227
    .line 228
    invoke-direct {v1, v0}, Lyz2;-><init>(Landroid/content/Context;)V

    .line 229
    .line 230
    .line 231
    return-object v1

    .line 232
    :pswitch_9
    check-cast v3, Lhh2;

    .line 233
    .line 234
    invoke-virtual {v3}, Lhh2;->a()Landroid/content/Context;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    new-instance v1, Lcz2;

    .line 239
    .line 240
    invoke-direct {v1, v0}, Lcz2;-><init>(Landroid/content/Context;)V

    .line 241
    .line 242
    .line 243
    return-object v1

    .line 244
    :pswitch_a
    check-cast v3, Lrh2;

    .line 245
    .line 246
    invoke-virtual {v3}, Lrh2;->a()Lg4;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    new-instance v1, Lzs1;

    .line 251
    .line 252
    const/16 v2, 0x17

    .line 253
    .line 254
    invoke-direct {v1, v2, v0}, Lzs1;-><init>(ILjava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    return-object v1

    .line 258
    :pswitch_b
    invoke-virtual {p0}, Lri2;->a()Liy2;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    return-object v0

    .line 263
    :pswitch_c
    check-cast v3, Lhh2;

    .line 264
    .line 265
    invoke-virtual {v3}, Lhh2;->a()Landroid/content/Context;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    sget-object v1, Lmd2;->a:Lld2;

    .line 270
    .line 271
    invoke-static {v1}, Li41;->M(Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    new-instance v3, Lay2;

    .line 275
    .line 276
    invoke-direct {v3, v0, v1, v2}, Lay2;-><init>(Landroid/content/Context;Lld2;I)V

    .line 277
    .line 278
    .line 279
    return-object v3

    .line 280
    :pswitch_d
    check-cast v3, Lhh2;

    .line 281
    .line 282
    invoke-virtual {v3}, Lhh2;->a()Landroid/content/Context;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    return-object v0

    .line 294
    :pswitch_e
    check-cast v3, Lph2;

    .line 295
    .line 296
    invoke-virtual {v3}, Lph2;->a()Le51;

    .line 297
    .line 298
    .line 299
    move-result-object v6

    .line 300
    new-instance v4, Lmv1;

    .line 301
    .line 302
    sget-object v0, Lhg4;->C:Lhg4;

    .line 303
    .line 304
    iget-object v0, v0, Lhg4;->c:Llf4;

    .line 305
    .line 306
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v5

    .line 314
    new-instance v8, Lorg/json/JSONObject;

    .line 315
    .line 316
    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    .line 317
    .line 318
    .line 319
    const/4 v9, 0x1

    .line 320
    const-string v7, "native"

    .line 321
    .line 322
    invoke-direct/range {v4 .. v9}, Lmv1;-><init>(Ljava/lang/String;Le51;Ljava/lang/String;Lorg/json/JSONObject;Z)V

    .line 323
    .line 324
    .line 325
    return-object v4

    .line 326
    :pswitch_f
    check-cast v3, Lhk2;

    .line 327
    .line 328
    invoke-virtual {v3}, Lhk2;->a()Lgo2;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    return-object v0

    .line 333
    :pswitch_10
    invoke-interface {v3}, Lga4;->d()Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    check-cast v0, Lvl2;

    .line 338
    .line 339
    new-instance v1, Lup2;

    .line 340
    .line 341
    sget-object v2, Lmd2;->g:Lld2;

    .line 342
    .line 343
    invoke-direct {v1, v0, v2}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 344
    .line 345
    .line 346
    return-object v1

    .line 347
    :pswitch_11
    invoke-interface {v3}, Lga4;->d()Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    check-cast v0, Lvl2;

    .line 352
    .line 353
    new-instance v1, Lup2;

    .line 354
    .line 355
    sget-object v2, Lmd2;->g:Lld2;

    .line 356
    .line 357
    invoke-direct {v1, v0, v2}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 358
    .line 359
    .line 360
    return-object v1

    .line 361
    :pswitch_12
    check-cast v3, Lbl2;

    .line 362
    .line 363
    iget-object v0, v3, Lbl2;->a:Ll92;

    .line 364
    .line 365
    iget-object v0, v0, Ll92;->f:Ljava/lang/Object;

    .line 366
    .line 367
    check-cast v0, Lgo2;

    .line 368
    .line 369
    new-instance v2, Lup2;

    .line 370
    .line 371
    new-instance v3, Lkk2;

    .line 372
    .line 373
    invoke-direct {v3, v1, v0}, Lkk2;-><init>(ILjava/lang/Object;)V

    .line 374
    .line 375
    .line 376
    sget-object v0, Lmd2;->g:Lld2;

    .line 377
    .line 378
    invoke-direct {v2, v3, v0}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 379
    .line 380
    .line 381
    return-object v2

    .line 382
    :pswitch_13
    invoke-interface {v3}, Lga4;->d()Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    check-cast v0, Li62;

    .line 387
    .line 388
    new-instance v1, Ll62;

    .line 389
    .line 390
    iget-object v0, v0, Li62;->a:Lmm2;

    .line 391
    .line 392
    invoke-direct {v1, v0}, Ll62;-><init>(Lmm2;)V

    .line 393
    .line 394
    .line 395
    return-object v1

    .line 396
    :pswitch_14
    invoke-interface {v3}, Lga4;->d()Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    check-cast v0, Lzw2;

    .line 401
    .line 402
    new-instance v1, Lxi2;

    .line 403
    .line 404
    invoke-direct {v1, v0, v2}, Lxi2;-><init>(Lzw2;I)V

    .line 405
    .line 406
    .line 407
    return-object v1

    .line 408
    :pswitch_15
    check-cast v3, Lqi2;

    .line 409
    .line 410
    iget-object v0, v3, Lqi2;->a:Lhh2;

    .line 411
    .line 412
    invoke-virtual {v0}, Lhh2;->a()Landroid/content/Context;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    invoke-static {v0}, Lmc2;->m(Landroid/content/Context;)Lmc2;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    iget-object v3, v0, Lmc2;->i:Ljava/lang/Object;

    .line 421
    .line 422
    check-cast v3, Lba4;

    .line 423
    .line 424
    new-instance v4, Lgw3;

    .line 425
    .line 426
    invoke-virtual {v3}, Lba4;->d()Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v3

    .line 430
    check-cast v3, Lvb2;

    .line 431
    .line 432
    iget-object v0, v0, Lmc2;->g:Ljava/lang/Object;

    .line 433
    .line 434
    check-cast v0, Lym;

    .line 435
    .line 436
    const/16 v5, 0x18

    .line 437
    .line 438
    invoke-direct {v4, v0, v3, v5, v1}, Lgw3;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 439
    .line 440
    .line 441
    new-instance v0, Lzi2;

    .line 442
    .line 443
    invoke-direct {v0, v2, v4}, Lzi2;-><init>(ILjava/lang/Object;)V

    .line 444
    .line 445
    .line 446
    return-object v0

    .line 447
    :pswitch_16
    invoke-interface {v3}, Lga4;->d()Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v0

    .line 451
    check-cast v0, Lz73;

    .line 452
    .line 453
    new-instance v1, Lyi2;

    .line 454
    .line 455
    invoke-direct {v1, v2, v0}, Lyi2;-><init>(ILjava/lang/Object;)V

    .line 456
    .line 457
    .line 458
    return-object v1

    .line 459
    :pswitch_17
    check-cast v3, Lhh2;

    .line 460
    .line 461
    invoke-virtual {v3}, Lhh2;->a()Landroid/content/Context;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    new-instance v1, Lbj2;

    .line 466
    .line 467
    invoke-direct {v1, v0}, Lbj2;-><init>(Landroid/content/Context;)V

    .line 468
    .line 469
    .line 470
    return-object v1

    .line 471
    :pswitch_18
    invoke-interface {v3}, Lga4;->d()Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v0

    .line 475
    check-cast v0, Lzw2;

    .line 476
    .line 477
    new-instance v2, Lzi2;

    .line 478
    .line 479
    invoke-direct {v2, v1, v0}, Lzi2;-><init>(ILjava/lang/Object;)V

    .line 480
    .line 481
    .line 482
    return-object v2

    .line 483
    :pswitch_19
    invoke-interface {v3}, Lga4;->d()Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v0

    .line 487
    check-cast v0, Lzw2;

    .line 488
    .line 489
    new-instance v2, Lxi2;

    .line 490
    .line 491
    invoke-direct {v2, v0, v1}, Lxi2;-><init>(Lzw2;I)V

    .line 492
    .line 493
    .line 494
    return-object v2

    .line 495
    :pswitch_1a
    check-cast v3, Lfh2;

    .line 496
    .line 497
    invoke-virtual {v3}, Lfh2;->a()Lra4;

    .line 498
    .line 499
    .line 500
    move-result-object v0

    .line 501
    new-instance v1, Lti2;

    .line 502
    .line 503
    invoke-direct {v1, v0, v2}, Lti2;-><init>(Lra4;I)V

    .line 504
    .line 505
    .line 506
    return-object v1

    .line 507
    :pswitch_1b
    check-cast v3, Lfh2;

    .line 508
    .line 509
    invoke-virtual {v3}, Lfh2;->a()Lra4;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    new-instance v2, Lti2;

    .line 514
    .line 515
    invoke-direct {v2, v0, v1}, Lti2;-><init>(Lra4;I)V

    .line 516
    .line 517
    .line 518
    return-object v2

    .line 519
    :pswitch_1c
    check-cast v3, Lhh2;

    .line 520
    .line 521
    invoke-virtual {v3}, Lhh2;->a()Landroid/content/Context;

    .line 522
    .line 523
    .line 524
    move-result-object v0

    .line 525
    new-instance v1, Lp32;

    .line 526
    .line 527
    invoke-direct {v1, v0}, Lp32;-><init>(Landroid/content/Context;)V

    .line 528
    .line 529
    .line 530
    return-object v1

    .line 531
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
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
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
