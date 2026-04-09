.class public final Lzl2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final synthetic a:I

.field public final b:Lba4;


# direct methods
.method public synthetic constructor <init>(Lba4;I)V
    .locals 0

    .line 1
    iput p2, p0, Lzl2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lzl2;->b:Lba4;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lzl2;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lzl2;->b:Lba4;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lur2;

    .line 13
    .line 14
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_0
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lfn2;

    .line 23
    .line 24
    new-instance v1, Lsq2;

    .line 25
    .line 26
    invoke-direct {v1, v0}, Lsq2;-><init>(Lfn2;)V

    .line 27
    .line 28
    .line 29
    return-object v1

    .line 30
    :pswitch_1
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Lpp2;

    .line 35
    .line 36
    new-instance v1, Lup2;

    .line 37
    .line 38
    sget-object v2, Lmd2;->g:Lld2;

    .line 39
    .line 40
    invoke-direct {v1, v0, v2}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 41
    .line 42
    .line 43
    return-object v1

    .line 44
    :pswitch_2
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Lsq2;

    .line 49
    .line 50
    sget-object v1, Lmd2;->g:Lld2;

    .line 51
    .line 52
    new-instance v2, Lup2;

    .line 53
    .line 54
    invoke-direct {v2, v0, v1}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 55
    .line 56
    .line 57
    invoke-static {v2}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    return-object v0

    .line 65
    :pswitch_3
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    check-cast v0, Ltq2;

    .line 70
    .line 71
    sget-object v1, Lmd2;->a:Lld2;

    .line 72
    .line 73
    invoke-static {v1}, Li41;->M(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    new-instance v2, Lup2;

    .line 77
    .line 78
    invoke-direct {v2, v0, v1}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 79
    .line 80
    .line 81
    return-object v2

    .line 82
    :pswitch_4
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    check-cast v0, Lim2;

    .line 87
    .line 88
    new-instance v1, Lup2;

    .line 89
    .line 90
    sget-object v2, Lmd2;->f:Lld2;

    .line 91
    .line 92
    invoke-direct {v1, v0, v2}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 93
    .line 94
    .line 95
    return-object v1

    .line 96
    :pswitch_5
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    check-cast v0, Lfm2;

    .line 101
    .line 102
    new-instance v1, Lup2;

    .line 103
    .line 104
    sget-object v2, Lmd2;->g:Lld2;

    .line 105
    .line 106
    invoke-direct {v1, v0, v2}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 107
    .line 108
    .line 109
    invoke-static {v1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    return-object v0

    .line 117
    :pswitch_6
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    check-cast v0, Lhu2;

    .line 122
    .line 123
    new-instance v1, Lup2;

    .line 124
    .line 125
    sget-object v2, Lmd2;->g:Lld2;

    .line 126
    .line 127
    invoke-direct {v1, v0, v2}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 128
    .line 129
    .line 130
    return-object v1

    .line 131
    :pswitch_7
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    check-cast v0, Lrq2;

    .line 136
    .line 137
    new-instance v1, Lup2;

    .line 138
    .line 139
    sget-object v2, Lmd2;->f:Lld2;

    .line 140
    .line 141
    invoke-direct {v1, v0, v2}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 142
    .line 143
    .line 144
    return-object v1

    .line 145
    :pswitch_8
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    check-cast v0, Lrq2;

    .line 150
    .line 151
    new-instance v1, Lup2;

    .line 152
    .line 153
    sget-object v2, Lmd2;->f:Lld2;

    .line 154
    .line 155
    invoke-direct {v1, v0, v2}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 156
    .line 157
    .line 158
    return-object v1

    .line 159
    :pswitch_9
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    check-cast v0, Lrq2;

    .line 164
    .line 165
    new-instance v1, Lup2;

    .line 166
    .line 167
    sget-object v2, Lmd2;->f:Lld2;

    .line 168
    .line 169
    invoke-direct {v1, v0, v2}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 170
    .line 171
    .line 172
    return-object v1

    .line 173
    :pswitch_a
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    check-cast v0, Lgq2;

    .line 178
    .line 179
    new-instance v1, Lup2;

    .line 180
    .line 181
    sget-object v2, Lmd2;->f:Lld2;

    .line 182
    .line 183
    invoke-direct {v1, v0, v2}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 184
    .line 185
    .line 186
    return-object v1

    .line 187
    :pswitch_b
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    check-cast v0, Lgq2;

    .line 192
    .line 193
    new-instance v1, Lup2;

    .line 194
    .line 195
    sget-object v2, Lmd2;->f:Lld2;

    .line 196
    .line 197
    invoke-direct {v1, v0, v2}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 198
    .line 199
    .line 200
    return-object v1

    .line 201
    :pswitch_c
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    check-cast v0, Lfm2;

    .line 206
    .line 207
    sget-object v1, Lmd2;->g:Lld2;

    .line 208
    .line 209
    new-instance v2, Lup2;

    .line 210
    .line 211
    invoke-direct {v2, v0, v1}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 212
    .line 213
    .line 214
    invoke-static {v2}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    return-object v0

    .line 222
    :pswitch_d
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    check-cast v0, Lw93;

    .line 227
    .line 228
    new-instance v1, Lup2;

    .line 229
    .line 230
    sget-object v2, Lmd2;->g:Lld2;

    .line 231
    .line 232
    invoke-direct {v1, v0, v2}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 233
    .line 234
    .line 235
    return-object v1

    .line 236
    :pswitch_e
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    check-cast v0, Lw93;

    .line 241
    .line 242
    new-instance v1, Lup2;

    .line 243
    .line 244
    sget-object v2, Lmd2;->g:Lld2;

    .line 245
    .line 246
    invoke-direct {v1, v0, v2}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 247
    .line 248
    .line 249
    return-object v1

    .line 250
    :pswitch_f
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    check-cast v0, Lfm2;

    .line 255
    .line 256
    sget-object v1, Lmd2;->g:Lld2;

    .line 257
    .line 258
    new-instance v2, Lup2;

    .line 259
    .line 260
    invoke-direct {v2, v0, v1}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 261
    .line 262
    .line 263
    invoke-static {v2}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    return-object v0

    .line 271
    :pswitch_10
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    check-cast v0, Lrl2;

    .line 276
    .line 277
    iget-object v0, v0, Lrl2;->g:Ldd2;

    .line 278
    .line 279
    iget-object v0, v0, Ldd2;->e:Ljava/lang/String;

    .line 280
    .line 281
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    return-object v0

    .line 285
    :pswitch_11
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    check-cast v0, Lij2;

    .line 290
    .line 291
    sget-object v1, Lmd2;->a:Lld2;

    .line 292
    .line 293
    invoke-static {v1}, Li41;->M(Ljava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    new-instance v2, Lup2;

    .line 297
    .line 298
    invoke-direct {v2, v0, v1}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 299
    .line 300
    .line 301
    return-object v2

    .line 302
    :pswitch_12
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    check-cast v0, Lam2;

    .line 307
    .line 308
    new-instance v1, Lup2;

    .line 309
    .line 310
    sget-object v2, Lmd2;->g:Lld2;

    .line 311
    .line 312
    invoke-direct {v1, v0, v2}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 313
    .line 314
    .line 315
    return-object v1

    .line 316
    :pswitch_13
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    check-cast v0, Lam2;

    .line 321
    .line 322
    new-instance v1, Lup2;

    .line 323
    .line 324
    sget-object v2, Lmd2;->g:Lld2;

    .line 325
    .line 326
    invoke-direct {v1, v0, v2}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 327
    .line 328
    .line 329
    return-object v1

    .line 330
    :pswitch_14
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    check-cast v0, Lhm2;

    .line 335
    .line 336
    new-instance v1, Lup2;

    .line 337
    .line 338
    sget-object v2, Lmd2;->g:Lld2;

    .line 339
    .line 340
    invoke-direct {v1, v0, v2}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 341
    .line 342
    .line 343
    return-object v1

    .line 344
    :pswitch_15
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    check-cast v0, Lhm2;

    .line 349
    .line 350
    new-instance v1, Lup2;

    .line 351
    .line 352
    sget-object v2, Lmd2;->g:Lld2;

    .line 353
    .line 354
    invoke-direct {v1, v0, v2}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 355
    .line 356
    .line 357
    return-object v1

    .line 358
    :pswitch_16
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    check-cast v0, Lgv2;

    .line 363
    .line 364
    sget-object v1, Lmd2;->a:Lld2;

    .line 365
    .line 366
    invoke-static {v1}, Li41;->M(Ljava/lang/Object;)V

    .line 367
    .line 368
    .line 369
    new-instance v2, Lup2;

    .line 370
    .line 371
    invoke-direct {v2, v0, v1}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 372
    .line 373
    .line 374
    return-object v2

    .line 375
    :pswitch_17
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    check-cast v0, Lgv2;

    .line 380
    .line 381
    sget-object v1, Lmd2;->a:Lld2;

    .line 382
    .line 383
    invoke-static {v1}, Li41;->M(Ljava/lang/Object;)V

    .line 384
    .line 385
    .line 386
    new-instance v2, Lup2;

    .line 387
    .line 388
    invoke-direct {v2, v0, v1}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 389
    .line 390
    .line 391
    return-object v2

    .line 392
    :pswitch_18
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    check-cast v0, Lgv2;

    .line 397
    .line 398
    sget-object v1, Lmd2;->a:Lld2;

    .line 399
    .line 400
    invoke-static {v1}, Li41;->M(Ljava/lang/Object;)V

    .line 401
    .line 402
    .line 403
    new-instance v2, Lup2;

    .line 404
    .line 405
    invoke-direct {v2, v0, v1}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 406
    .line 407
    .line 408
    return-object v2

    .line 409
    :pswitch_19
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    check-cast v0, Lsl2;

    .line 414
    .line 415
    sget-object v1, Lmd2;->a:Lld2;

    .line 416
    .line 417
    invoke-static {v1}, Li41;->M(Ljava/lang/Object;)V

    .line 418
    .line 419
    .line 420
    new-instance v2, Lup2;

    .line 421
    .line 422
    invoke-direct {v2, v0, v1}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 423
    .line 424
    .line 425
    sget v0, Ldn3;->h:I

    .line 426
    .line 427
    new-instance v0, Len3;

    .line 428
    .line 429
    invoke-direct {v0, v2}, Len3;-><init>(Ljava/lang/Object;)V

    .line 430
    .line 431
    .line 432
    return-object v0

    .line 433
    :pswitch_1a
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    check-cast v0, Lgv2;

    .line 438
    .line 439
    sget-object v1, Lmd2;->a:Lld2;

    .line 440
    .line 441
    invoke-static {v1}, Li41;->M(Ljava/lang/Object;)V

    .line 442
    .line 443
    .line 444
    new-instance v2, Lup2;

    .line 445
    .line 446
    invoke-direct {v2, v0, v1}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 447
    .line 448
    .line 449
    return-object v2

    .line 450
    :pswitch_1b
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    check-cast v0, Lml2;

    .line 455
    .line 456
    new-instance v1, Lup2;

    .line 457
    .line 458
    sget-object v2, Lmd2;->g:Lld2;

    .line 459
    .line 460
    invoke-direct {v1, v0, v2}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 461
    .line 462
    .line 463
    return-object v1

    .line 464
    :pswitch_1c
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    check-cast v0, Lgv2;

    .line 469
    .line 470
    sget-object v1, Lmd2;->a:Lld2;

    .line 471
    .line 472
    invoke-static {v1}, Li41;->M(Ljava/lang/Object;)V

    .line 473
    .line 474
    .line 475
    new-instance v2, Lup2;

    .line 476
    .line 477
    invoke-direct {v2, v0, v1}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 478
    .line 479
    .line 480
    return-object v2

    .line 481
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
