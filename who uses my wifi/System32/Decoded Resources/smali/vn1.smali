.class public final synthetic Lvn1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lzk3;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lvn1;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lvn1;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 41

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lvn1;->a:I

    .line 4
    .line 5
    const/4 v2, 0x5

    .line 6
    const/16 v3, 0x22

    .line 7
    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x1

    .line 10
    const/4 v6, -0x1

    .line 11
    const/4 v7, 0x0

    .line 12
    const/4 v8, 0x0

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget-object v0, v1, Lvn1;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lzj3;

    .line 19
    .line 20
    move-object/from16 v2, p1

    .line 21
    .line 22
    check-cast v2, Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v2}, Lyc0;->s(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_3

    .line 29
    .line 30
    iget-object v0, v0, Lzj3;->b:Landroid/content/Context;

    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/content/Context;->getPackageResourcePath()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    new-instance v2, Ljava/io/File;

    .line 37
    .line 38
    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/io/File;->canRead()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_0

    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_0
    :try_start_0
    new-instance v3, Ljava/io/FileInputStream;

    .line 55
    .line 56
    invoke-direct {v3, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    .line 58
    .line 59
    const/16 v0, 0x4000

    .line 60
    .line 61
    :try_start_1
    new-array v0, v0, [B

    .line 62
    .line 63
    const-string v2, "SHA256"

    .line 64
    .line 65
    invoke-static {v2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v3, v0}, Ljava/io/FileInputStream;->read([B)I

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    :goto_0
    if-eq v4, v6, :cond_1

    .line 74
    .line 75
    invoke-virtual {v2, v0, v7, v4}, Ljava/security/MessageDigest;->update([BII)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3, v0}, Ljava/io/FileInputStream;->read([B)I

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    goto :goto_0

    .line 83
    :catchall_0
    move-exception v0

    .line 84
    move-object v2, v0

    .line 85
    goto :goto_1

    .line 86
    :cond_1
    sget-object v0, Ljo3;->f:Lgo3;

    .line 87
    .line 88
    invoke-virtual {v0}, Ljo3;->f()Ljo3;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-virtual {v2}, Ljava/security/MessageDigest;->digest()[B

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    array-length v4, v2

    .line 97
    invoke-virtual {v0, v4, v2}, Ljo3;->g(I[B)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 101
    :try_start_2
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_2 .. :try_end_2} :catch_0

    .line 102
    .line 103
    .line 104
    goto :goto_4

    .line 105
    :goto_1
    :try_start_3
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 106
    .line 107
    .line 108
    goto :goto_2

    .line 109
    :catchall_1
    move-exception v0

    .line 110
    :try_start_4
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 111
    .line 112
    .line 113
    :goto_2
    throw v2
    :try_end_4
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_4 .. :try_end_4} :catch_0

    .line 114
    :catch_0
    :cond_2
    :goto_3
    const-string v2, ""

    .line 115
    .line 116
    :cond_3
    :goto_4
    return-object v2

    .line 117
    :pswitch_0
    iget-object v0, v1, Lvn1;->b:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v0, Lpj3;

    .line 120
    .line 121
    move-object/from16 v2, p1

    .line 122
    .line 123
    check-cast v2, Lgg3;

    .line 124
    .line 125
    iget-object v3, v0, Lpj3;->d:Lgk3;

    .line 126
    .line 127
    iget v6, v2, Lgg3;->a:I

    .line 128
    .line 129
    const/16 v7, 0xc8

    .line 130
    .line 131
    if-eq v6, v7, :cond_4

    .line 132
    .line 133
    new-instance v13, Ljava/lang/String;

    .line 134
    .line 135
    invoke-static {}, Lyb;->z()[B

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 140
    .line 141
    invoke-direct {v13, v0, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 142
    .line 143
    .line 144
    iget-object v0, v3, Lgk3;->a:Lpg3;

    .line 145
    .line 146
    const/4 v12, 0x0

    .line 147
    move-object v8, v0

    .line 148
    check-cast v8, Lwg3;

    .line 149
    .line 150
    const/16 v9, 0x4e22

    .line 151
    .line 152
    const-wide/16 v10, -0x1

    .line 153
    .line 154
    invoke-virtual/range {v8 .. v13}, Lwg3;->b(IJLjava/lang/Throwable;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    const/4 v0, 0x7

    .line 158
    invoke-static {v0}, Lpj3;->a(I)Lyg3;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    goto/16 :goto_7

    .line 163
    .line 164
    :cond_4
    :try_start_5
    new-instance v6, Ljava/lang/String;

    .line 165
    .line 166
    iget-object v2, v2, Lgg3;->b:[B

    .line 167
    .line 168
    invoke-direct {v6, v2}, Ljava/lang/String;-><init>([B)V

    .line 169
    .line 170
    .line 171
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    const/16 v7, 0x8

    .line 176
    .line 177
    const/16 v8, 0x4e24

    .line 178
    .line 179
    if-eqz v2, :cond_5

    .line 180
    .line 181
    invoke-virtual {v3, v8}, Lgk3;->b(I)V

    .line 182
    .line 183
    .line 184
    invoke-static {v7}, Lpj3;->a(I)Lyg3;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    goto/16 :goto_7

    .line 189
    .line 190
    :catchall_2
    move-exception v0

    .line 191
    goto/16 :goto_6

    .line 192
    .line 193
    :cond_5
    invoke-static {v6, v5}, Lm54;->M(Ljava/lang/String;Z)[B

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    invoke-static {}, Lh54;->a()Lh54;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    invoke-static {v2, v5}, Lku1;->B([BLh54;)Lku1;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    invoke-virtual {v2}, Lku1;->A()Lcv1;

    .line 206
    .line 207
    .line 208
    move-result-object v5

    .line 209
    invoke-virtual {v5}, Lcv1;->C()Z

    .line 210
    .line 211
    .line 212
    move-result v5

    .line 213
    if-eqz v5, :cond_8

    .line 214
    .line 215
    invoke-virtual {v2}, Lku1;->A()Lcv1;

    .line 216
    .line 217
    .line 218
    move-result-object v5

    .line 219
    invoke-virtual {v5}, Lcv1;->A()Z

    .line 220
    .line 221
    .line 222
    move-result v5

    .line 223
    if-nez v5, :cond_6

    .line 224
    .line 225
    goto :goto_5

    .line 226
    :cond_6
    iget-object v0, v0, Lpj3;->h:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast v0, Lqj3;

    .line 229
    .line 230
    invoke-virtual {v0, v2}, Lqj3;->a(Lku1;)Z

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    if-nez v0, :cond_7

    .line 235
    .line 236
    const/16 v0, 0x4e26

    .line 237
    .line 238
    invoke-virtual {v3, v0}, Lgk3;->b(I)V

    .line 239
    .line 240
    .line 241
    const/16 v0, 0xc

    .line 242
    .line 243
    invoke-static {v0}, Lpj3;->a(I)Lyg3;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    goto :goto_7

    .line 248
    :cond_7
    invoke-static {}, Lyg3;->D()Lxg3;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    invoke-static {}, Ljh3;->D()Lzg3;

    .line 253
    .line 254
    .line 255
    move-result-object v5

    .line 256
    invoke-virtual {v2}, Lku1;->A()Lcv1;

    .line 257
    .line 258
    .line 259
    move-result-object v6

    .line 260
    invoke-virtual {v6}, Lcv1;->B()Ldv1;

    .line 261
    .line 262
    .line 263
    move-result-object v6

    .line 264
    invoke-virtual {v5}, Ln54;->b()V

    .line 265
    .line 266
    .line 267
    iget-object v7, v5, Ln54;->g:Lp54;

    .line 268
    .line 269
    check-cast v7, Ljh3;

    .line 270
    .line 271
    invoke-virtual {v7, v6}, Ljh3;->G(Ldv1;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v0}, Ln54;->b()V

    .line 275
    .line 276
    .line 277
    iget-object v6, v0, Ln54;->g:Lp54;

    .line 278
    .line 279
    check-cast v6, Lyg3;

    .line 280
    .line 281
    invoke-virtual {v5}, Ln54;->d()Lp54;

    .line 282
    .line 283
    .line 284
    move-result-object v5

    .line 285
    check-cast v5, Ljh3;

    .line 286
    .line 287
    invoke-virtual {v6, v5}, Lyg3;->E(Ljh3;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v2}, Lku1;->A()Lcv1;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    invoke-virtual {v2}, Lcv1;->D()La54;

    .line 295
    .line 296
    .line 297
    move-result-object v2

    .line 298
    invoke-virtual {v0}, Ln54;->b()V

    .line 299
    .line 300
    .line 301
    iget-object v5, v0, Ln54;->g:Lp54;

    .line 302
    .line 303
    check-cast v5, Lyg3;

    .line 304
    .line 305
    invoke-virtual {v5, v2}, Lyg3;->F(La54;)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v0}, Ln54;->b()V

    .line 309
    .line 310
    .line 311
    iget-object v2, v0, Ln54;->g:Lp54;

    .line 312
    .line 313
    check-cast v2, Lyg3;

    .line 314
    .line 315
    invoke-virtual {v2, v4}, Lyg3;->I(I)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v0}, Ln54;->d()Lp54;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    check-cast v0, Lyg3;

    .line 323
    .line 324
    goto :goto_7

    .line 325
    :cond_8
    :goto_5
    invoke-virtual {v3, v8}, Lgk3;->b(I)V

    .line 326
    .line 327
    .line 328
    invoke-static {v7}, Lpj3;->a(I)Lyg3;

    .line 329
    .line 330
    .line 331
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 332
    goto :goto_7

    .line 333
    :goto_6
    const/16 v2, 0x4e25

    .line 334
    .line 335
    invoke-virtual {v3, v2, v0}, Lgk3;->c(ILjava/lang/Throwable;)V

    .line 336
    .line 337
    .line 338
    const/4 v0, 0x6

    .line 339
    invoke-static {v0}, Lpj3;->a(I)Lyg3;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    :goto_7
    return-object v0

    .line 344
    :pswitch_1
    iget-object v0, v1, Lvn1;->b:Ljava/lang/Object;

    .line 345
    .line 346
    check-cast v0, Lmj3;

    .line 347
    .line 348
    move-object/from16 v2, p1

    .line 349
    .line 350
    check-cast v2, [B

    .line 351
    .line 352
    new-instance v3, Lnb;

    .line 353
    .line 354
    const/4 v4, 0x3

    .line 355
    invoke-direct {v3, v4}, Lnb;-><init>(I)V

    .line 356
    .line 357
    .line 358
    iget-object v4, v0, Lmj3;->e:Lgk3;

    .line 359
    .line 360
    const/16 v5, 0x4e86

    .line 361
    .line 362
    invoke-virtual {v4, v5}, Lgk3;->a(I)Lfk3;

    .line 363
    .line 364
    .line 365
    move-result-object v4

    .line 366
    :try_start_6
    invoke-virtual {v4}, Lfk3;->a()V

    .line 367
    .line 368
    .line 369
    iget-object v5, v0, Lmj3;->f:Ljava/lang/Object;

    .line 370
    .line 371
    monitor-enter v5
    :try_end_6
    .catch Lkp1; {:try_start_6 .. :try_end_6} :catch_2
    .catch Lhp1; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 372
    :try_start_7
    invoke-static {v3, v2}, Lcj1;->a(Lnb;[B)Lcj1;

    .line 373
    .line 374
    .line 375
    move-result-object v2

    .line 376
    iput-object v2, v0, Lmj3;->j:Lcj1;

    .line 377
    .line 378
    monitor-exit v5
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 379
    invoke-virtual {v4}, Lfk3;->c()V

    .line 380
    .line 381
    .line 382
    return-object v8

    .line 383
    :catchall_3
    move-exception v0

    .line 384
    :try_start_8
    monitor-exit v5
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 385
    :try_start_9
    throw v0
    :try_end_9
    .catch Lkp1; {:try_start_9 .. :try_end_9} :catch_2
    .catch Lhp1; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 386
    :catchall_4
    move-exception v0

    .line 387
    goto :goto_8

    .line 388
    :catch_1
    move-exception v0

    .line 389
    goto :goto_9

    .line 390
    :catch_2
    move-exception v0

    .line 391
    goto :goto_9

    .line 392
    :goto_8
    :try_start_a
    invoke-virtual {v4, v0}, Lfk3;->b(Ljava/lang/Throwable;)V

    .line 393
    .line 394
    .line 395
    throw v0

    .line 396
    :catchall_5
    move-exception v0

    .line 397
    goto :goto_a

    .line 398
    :goto_9
    invoke-virtual {v4, v0}, Lfk3;->b(Ljava/lang/Throwable;)V

    .line 399
    .line 400
    .line 401
    new-instance v2, Lrg;

    .line 402
    .line 403
    const-string v3, "r: 2"

    .line 404
    .line 405
    invoke-direct {v2, v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 406
    .line 407
    .line 408
    throw v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 409
    :goto_a
    invoke-virtual {v4}, Lfk3;->c()V

    .line 410
    .line 411
    .line 412
    throw v0

    .line 413
    :pswitch_2
    iget-object v0, v1, Lvn1;->b:Ljava/lang/Object;

    .line 414
    .line 415
    check-cast v0, Llj3;

    .line 416
    .line 417
    move-object/from16 v2, p1

    .line 418
    .line 419
    check-cast v2, Ljh3;

    .line 420
    .line 421
    iget-object v4, v0, Llj3;->e:Lgk3;

    .line 422
    .line 423
    iget-object v6, v0, Llj3;->c:Luj3;

    .line 424
    .line 425
    invoke-interface {v6, v2}, Luj3;->a(Ljh3;)Z

    .line 426
    .line 427
    .line 428
    move-result v6

    .line 429
    if-eqz v6, :cond_a

    .line 430
    .line 431
    if-eqz v2, :cond_a

    .line 432
    .line 433
    iget-object v5, v0, Llj3;->b:Lrj3;

    .line 434
    .line 435
    iget v6, v5, Lrj3;->a:I

    .line 436
    .line 437
    packed-switch v6, :pswitch_data_1

    .line 438
    .line 439
    .line 440
    iget-object v6, v5, Lrj3;->d:Lz94;

    .line 441
    .line 442
    invoke-interface {v6}, Lz94;->d()Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v6

    .line 446
    check-cast v6, Llg3;

    .line 447
    .line 448
    iget-object v6, v6, Llg3;->a:Ljava/io/File;

    .line 449
    .line 450
    goto :goto_b

    .line 451
    :pswitch_3
    iget-object v6, v5, Lrj3;->d:Lz94;

    .line 452
    .line 453
    invoke-interface {v6}, Lz94;->d()Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v6

    .line 457
    check-cast v6, Llg3;

    .line 458
    .line 459
    iget-object v6, v6, Llg3;->a:Ljava/io/File;

    .line 460
    .line 461
    :goto_b
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 462
    .line 463
    if-lt v7, v3, :cond_9

    .line 464
    .line 465
    invoke-virtual {v6}, Ljava/io/File;->setReadOnly()Z

    .line 466
    .line 467
    .line 468
    :cond_9
    iget-object v3, v0, Llj3;->d:Ljava/io/File;

    .line 469
    .line 470
    new-instance v7, Lg4;

    .line 471
    .line 472
    invoke-virtual {v2}, Ljh3;->A()Lfv1;

    .line 473
    .line 474
    .line 475
    move-result-object v9

    .line 476
    iget v10, v5, Lrj3;->a:I

    .line 477
    .line 478
    packed-switch v10, :pswitch_data_2

    .line 479
    .line 480
    .line 481
    iget-object v5, v5, Lrj3;->c:Llg3;

    .line 482
    .line 483
    iget-object v5, v5, Llg3;->a:Ljava/io/File;

    .line 484
    .line 485
    goto :goto_c

    .line 486
    :pswitch_4
    iget-object v5, v5, Lrj3;->c:Llg3;

    .line 487
    .line 488
    iget-object v5, v5, Llg3;->a:Ljava/io/File;

    .line 489
    .line 490
    :goto_c
    invoke-direct {v7, v9, v6, v5, v3}, Lg4;-><init>(Lfv1;Ljava/io/File;Ljava/io/File;Ljava/io/File;)V

    .line 491
    .line 492
    .line 493
    new-instance v3, Lgi;

    .line 494
    .line 495
    const/16 v5, 0x15

    .line 496
    .line 497
    invoke-direct {v3, v0, v7, v2, v5}, Lgi;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 498
    .line 499
    .line 500
    const/16 v0, 0x3a9a

    .line 501
    .line 502
    invoke-virtual {v4, v0, v3}, Lgk3;->e(ILjava/lang/Runnable;)V

    .line 503
    .line 504
    .line 505
    return-object v8

    .line 506
    :cond_a
    const/16 v0, 0x3a9b

    .line 507
    .line 508
    invoke-virtual {v4, v0}, Lgk3;->b(I)V

    .line 509
    .line 510
    .line 511
    new-instance v0, Lrg;

    .line 512
    .line 513
    invoke-direct {v0, v5}, Lrg;-><init>(I)V

    .line 514
    .line 515
    .line 516
    throw v0

    .line 517
    :pswitch_5
    iget-object v0, v1, Lvn1;->b:Ljava/lang/Object;

    .line 518
    .line 519
    check-cast v0, Lfj3;

    .line 520
    .line 521
    move-object/from16 v2, p1

    .line 522
    .line 523
    check-cast v2, Ljh3;

    .line 524
    .line 525
    iget-object v0, v0, Lfj3;->a:Luj3;

    .line 526
    .line 527
    invoke-interface {v0, v2}, Luj3;->b(Ljh3;)Z

    .line 528
    .line 529
    .line 530
    move-result v0

    .line 531
    if-eqz v0, :cond_b

    .line 532
    .line 533
    new-instance v0, Ljava/lang/Integer;

    .line 534
    .line 535
    invoke-direct {v0, v7}, Ljava/lang/Integer;-><init>(I)V

    .line 536
    .line 537
    .line 538
    return-object v0

    .line 539
    :cond_b
    new-instance v0, Lzi3;

    .line 540
    .line 541
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 542
    .line 543
    .line 544
    throw v0

    .line 545
    :pswitch_6
    iget-object v0, v1, Lvn1;->b:Ljava/lang/Object;

    .line 546
    .line 547
    check-cast v0, Loh3;

    .line 548
    .line 549
    move-object/from16 v2, p1

    .line 550
    .line 551
    check-cast v2, Lkh3;

    .line 552
    .line 553
    iget-object v0, v0, Loh3;->f:Ljava/util/concurrent/atomic/AtomicReference;

    .line 554
    .line 555
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 556
    .line 557
    .line 558
    return-object v2

    .line 559
    :pswitch_7
    move-object/from16 v0, p1

    .line 560
    .line 561
    check-cast v0, Ljava/lang/Void;

    .line 562
    .line 563
    iget-object v0, v1, Lvn1;->b:Ljava/lang/Object;

    .line 564
    .line 565
    check-cast v0, Lkh3;

    .line 566
    .line 567
    return-object v0

    .line 568
    :pswitch_8
    iget-object v0, v1, Lvn1;->b:Ljava/lang/Object;

    .line 569
    .line 570
    check-cast v0, Le93;

    .line 571
    .line 572
    move-object/from16 v2, p1

    .line 573
    .line 574
    check-cast v2, Lel2;

    .line 575
    .line 576
    iput-object v2, v0, Le93;->c:Lel2;

    .line 577
    .line 578
    return-object v0

    .line 579
    :pswitch_9
    iget-object v0, v1, Lvn1;->b:Ljava/lang/Object;

    .line 580
    .line 581
    check-cast v0, Lo63;

    .line 582
    .line 583
    move-object/from16 v3, p1

    .line 584
    .line 585
    check-cast v3, Ljava/lang/Exception;

    .line 586
    .line 587
    const-string v4, "TrustlessTokenSignal"

    .line 588
    .line 589
    iget-object v0, v0, Lo63;->a:Lgd2;

    .line 590
    .line 591
    invoke-virtual {v0, v4, v3}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 592
    .line 593
    .line 594
    new-instance v0, Lj33;

    .line 595
    .line 596
    invoke-direct {v0, v8, v2}, Lj33;-><init>(Ljava/lang/String;I)V

    .line 597
    .line 598
    .line 599
    return-object v0

    .line 600
    :pswitch_a
    iget-object v0, v1, Lvn1;->b:Ljava/lang/Object;

    .line 601
    .line 602
    check-cast v0, Lk33;

    .line 603
    .line 604
    move-object/from16 v2, p1

    .line 605
    .line 606
    check-cast v2, Ljava/lang/Exception;

    .line 607
    .line 608
    const-string v3, "AppSetIdInfoGmscoreSignal"

    .line 609
    .line 610
    iget-object v0, v0, Lk33;->b:Ljava/lang/Object;

    .line 611
    .line 612
    check-cast v0, Lgd2;

    .line 613
    .line 614
    invoke-virtual {v0, v3, v2}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 615
    .line 616
    .line 617
    new-instance v0, Lt33;

    .line 618
    .line 619
    invoke-direct {v0, v8, v6, v4}, Lt33;-><init>(Ljava/lang/String;II)V

    .line 620
    .line 621
    .line 622
    return-object v0

    .line 623
    :pswitch_b
    iget-object v0, v1, Lvn1;->b:Ljava/lang/Object;

    .line 624
    .line 625
    check-cast v0, Ls33;

    .line 626
    .line 627
    iget-object v0, v0, Ls33;->a:Lgd2;

    .line 628
    .line 629
    move-object/from16 v2, p1

    .line 630
    .line 631
    check-cast v2, Ljava/lang/Exception;

    .line 632
    .line 633
    const-string v3, "AppSetIdInfoSignal"

    .line 634
    .line 635
    invoke-virtual {v0, v3, v2}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 636
    .line 637
    .line 638
    new-instance v0, Lt33;

    .line 639
    .line 640
    invoke-direct {v0, v8, v6, v7}, Lt33;-><init>(Ljava/lang/String;II)V

    .line 641
    .line 642
    .line 643
    return-object v0

    .line 644
    :pswitch_c
    iget-object v0, v1, Lvn1;->b:Ljava/lang/Object;

    .line 645
    .line 646
    check-cast v0, Le33;

    .line 647
    .line 648
    move-object/from16 v2, p1

    .line 649
    .line 650
    check-cast v2, Lu53;

    .line 651
    .line 652
    const-string v2, "|"

    .line 653
    .line 654
    iget-object v4, v0, Le33;->b:Ljava/lang/Object;

    .line 655
    .line 656
    check-cast v4, Ll83;

    .line 657
    .line 658
    iget-object v10, v4, Ll83;->f:Lxe4;

    .line 659
    .line 660
    iget-object v9, v10, Lxe4;->l:[Lxe4;

    .line 661
    .line 662
    if-nez v9, :cond_c

    .line 663
    .line 664
    iget-object v11, v10, Lxe4;->f:Ljava/lang/String;

    .line 665
    .line 666
    iget-boolean v12, v10, Lxe4;->n:Z

    .line 667
    .line 668
    goto :goto_e

    .line 669
    :cond_c
    move v12, v7

    .line 670
    move v13, v12

    .line 671
    move v14, v13

    .line 672
    move v15, v14

    .line 673
    move-object v11, v8

    .line 674
    :goto_d
    array-length v5, v9

    .line 675
    if-ge v13, v5, :cond_11

    .line 676
    .line 677
    aget-object v5, v9, v13

    .line 678
    .line 679
    iget-boolean v8, v5, Lxe4;->n:Z

    .line 680
    .line 681
    if-nez v8, :cond_d

    .line 682
    .line 683
    if-nez v14, :cond_d

    .line 684
    .line 685
    iget-object v5, v5, Lxe4;->f:Ljava/lang/String;

    .line 686
    .line 687
    move-object v11, v5

    .line 688
    const/4 v14, 0x1

    .line 689
    :cond_d
    if-eqz v8, :cond_f

    .line 690
    .line 691
    if-nez v15, :cond_e

    .line 692
    .line 693
    const/4 v12, 0x1

    .line 694
    :cond_e
    const/4 v15, 0x1

    .line 695
    :cond_f
    if-eqz v14, :cond_10

    .line 696
    .line 697
    if-nez v15, :cond_11

    .line 698
    .line 699
    :cond_10
    add-int/lit8 v13, v13, 0x1

    .line 700
    .line 701
    const/4 v8, 0x0

    .line 702
    goto :goto_d

    .line 703
    :cond_11
    :goto_e
    iget-object v5, v0, Le33;->c:Ljava/lang/Object;

    .line 704
    .line 705
    check-cast v5, Landroid/content/Context;

    .line 706
    .line 707
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 708
    .line 709
    .line 710
    move-result-object v8

    .line 711
    if-eqz v8, :cond_12

    .line 712
    .line 713
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 714
    .line 715
    .line 716
    move-result-object v8

    .line 717
    if-eqz v8, :cond_12

    .line 718
    .line 719
    iget-object v14, v0, Le33;->e:Ljava/lang/Object;

    .line 720
    .line 721
    check-cast v14, Lgd2;

    .line 722
    .line 723
    iget v15, v8, Landroid/util/DisplayMetrics;->density:F

    .line 724
    .line 725
    const/16 p1, 0x0

    .line 726
    .line 727
    iget v13, v8, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 728
    .line 729
    iget v8, v8, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 730
    .line 731
    invoke-virtual {v14}, Lgd2;->g()Lra4;

    .line 732
    .line 733
    .line 734
    move-result-object v14

    .line 735
    invoke-virtual {v14}, Lra4;->p()Ljava/lang/String;

    .line 736
    .line 737
    .line 738
    move-result-object v14

    .line 739
    move-object/from16 v17, v14

    .line 740
    .line 741
    move v14, v15

    .line 742
    goto :goto_f

    .line 743
    :cond_12
    const/16 p1, 0x0

    .line 744
    .line 745
    move/from16 v14, p1

    .line 746
    .line 747
    move v8, v7

    .line 748
    move v13, v8

    .line 749
    const/16 v17, 0x0

    .line 750
    .line 751
    :goto_f
    sget-object v15, Lmz1;->de:Liz1;

    .line 752
    .line 753
    sget-object v7, Ltw1;->e:Ltw1;

    .line 754
    .line 755
    iget-object v6, v7, Ltw1;->c:Lkz1;

    .line 756
    .line 757
    invoke-virtual {v6, v15}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 758
    .line 759
    .line 760
    move-result-object v6

    .line 761
    check-cast v6, Ljava/lang/Boolean;

    .line 762
    .line 763
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 764
    .line 765
    .line 766
    move-result v6

    .line 767
    if-eqz v6, :cond_13

    .line 768
    .line 769
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 770
    .line 771
    const/16 v15, 0x23

    .line 772
    .line 773
    if-lt v6, v15, :cond_13

    .line 774
    .line 775
    invoke-virtual {v0, v14}, Le33;->b(F)Ly20;

    .line 776
    .line 777
    .line 778
    move-result-object v6

    .line 779
    move-object/from16 v18, v6

    .line 780
    .line 781
    goto :goto_10

    .line 782
    :cond_13
    const/16 v18, 0x0

    .line 783
    .line 784
    :goto_10
    sget-object v6, Lmz1;->ee:Liz1;

    .line 785
    .line 786
    iget-object v7, v7, Ltw1;->c:Lkz1;

    .line 787
    .line 788
    invoke-virtual {v7, v6}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 789
    .line 790
    .line 791
    move-result-object v6

    .line 792
    check-cast v6, Ljava/lang/Boolean;

    .line 793
    .line 794
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 795
    .line 796
    .line 797
    move-result v6

    .line 798
    if-eqz v6, :cond_15

    .line 799
    .line 800
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 801
    .line 802
    if-gt v6, v3, :cond_15

    .line 803
    .line 804
    const/16 v3, 0x1c

    .line 805
    .line 806
    if-lt v6, v3, :cond_15

    .line 807
    .line 808
    const-string v3, "window"

    .line 809
    .line 810
    invoke-virtual {v5, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 811
    .line 812
    .line 813
    move-result-object v3

    .line 814
    check-cast v3, Landroid/view/WindowManager;

    .line 815
    .line 816
    if-eqz v3, :cond_15

    .line 817
    .line 818
    const/16 v5, 0x1e

    .line 819
    .line 820
    if-lt v6, v5, :cond_14

    .line 821
    .line 822
    invoke-static {v3}, Lm91;->i(Landroid/view/WindowManager;)Landroid/view/WindowMetrics;

    .line 823
    .line 824
    .line 825
    move-result-object v3

    .line 826
    invoke-static {v3}, Lm91;->e(Landroid/view/WindowMetrics;)Landroid/graphics/Rect;

    .line 827
    .line 828
    .line 829
    move-result-object v5

    .line 830
    invoke-virtual {v5}, Landroid/graphics/Rect;->width()I

    .line 831
    .line 832
    .line 833
    move-result v5

    .line 834
    invoke-static {v3}, Lm91;->e(Landroid/view/WindowMetrics;)Landroid/graphics/Rect;

    .line 835
    .line 836
    .line 837
    move-result-object v3

    .line 838
    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    .line 839
    .line 840
    .line 841
    move-result v3

    .line 842
    move v8, v3

    .line 843
    move v13, v5

    .line 844
    goto :goto_11

    .line 845
    :cond_14
    new-instance v5, Landroid/graphics/Point;

    .line 846
    .line 847
    invoke-direct {v5}, Landroid/graphics/Point;-><init>()V

    .line 848
    .line 849
    .line 850
    invoke-interface {v3}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 851
    .line 852
    .line 853
    move-result-object v3

    .line 854
    invoke-virtual {v3, v5}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    .line 855
    .line 856
    .line 857
    iget v3, v5, Landroid/graphics/Point;->x:I

    .line 858
    .line 859
    iget v5, v5, Landroid/graphics/Point;->y:I

    .line 860
    .line 861
    move v13, v3

    .line 862
    move v8, v5

    .line 863
    :goto_11
    invoke-virtual {v0, v14}, Le33;->b(F)Ly20;

    .line 864
    .line 865
    .line 866
    move-result-object v18

    .line 867
    :cond_15
    move v15, v13

    .line 868
    new-instance v0, Ljava/lang/StringBuilder;

    .line 869
    .line 870
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 871
    .line 872
    .line 873
    if-eqz v9, :cond_1e

    .line 874
    .line 875
    const/4 v3, 0x0

    .line 876
    const/4 v5, 0x0

    .line 877
    :goto_12
    array-length v6, v9

    .line 878
    if-ge v3, v6, :cond_1c

    .line 879
    .line 880
    aget-object v6, v9, v3

    .line 881
    .line 882
    iget-boolean v7, v6, Lxe4;->n:Z

    .line 883
    .line 884
    if-eqz v7, :cond_16

    .line 885
    .line 886
    const/4 v5, 0x1

    .line 887
    goto :goto_15

    .line 888
    :cond_16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 889
    .line 890
    .line 891
    move-result v7

    .line 892
    if-eqz v7, :cond_17

    .line 893
    .line 894
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 895
    .line 896
    .line 897
    :cond_17
    iget v7, v6, Lxe4;->j:I

    .line 898
    .line 899
    const/4 v13, -0x1

    .line 900
    if-ne v7, v13, :cond_19

    .line 901
    .line 902
    cmpl-float v7, v14, p1

    .line 903
    .line 904
    if-eqz v7, :cond_18

    .line 905
    .line 906
    iget v7, v6, Lxe4;->k:I

    .line 907
    .line 908
    int-to-float v7, v7

    .line 909
    div-float/2addr v7, v14

    .line 910
    float-to-int v7, v7

    .line 911
    goto :goto_13

    .line 912
    :cond_18
    move v7, v13

    .line 913
    :cond_19
    :goto_13
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 914
    .line 915
    .line 916
    const-string v7, "x"

    .line 917
    .line 918
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 919
    .line 920
    .line 921
    iget v7, v6, Lxe4;->g:I

    .line 922
    .line 923
    const/4 v13, -0x2

    .line 924
    if-ne v7, v13, :cond_1b

    .line 925
    .line 926
    cmpl-float v7, v14, p1

    .line 927
    .line 928
    if-eqz v7, :cond_1a

    .line 929
    .line 930
    iget v6, v6, Lxe4;->h:I

    .line 931
    .line 932
    int-to-float v6, v6

    .line 933
    div-float/2addr v6, v14

    .line 934
    float-to-int v7, v6

    .line 935
    goto :goto_14

    .line 936
    :cond_1a
    move v7, v13

    .line 937
    :cond_1b
    :goto_14
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 938
    .line 939
    .line 940
    :goto_15
    add-int/lit8 v3, v3, 0x1

    .line 941
    .line 942
    goto :goto_12

    .line 943
    :cond_1c
    if-eqz v5, :cond_1e

    .line 944
    .line 945
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 946
    .line 947
    .line 948
    move-result v3

    .line 949
    if-eqz v3, :cond_1d

    .line 950
    .line 951
    const/4 v3, 0x0

    .line 952
    invoke-virtual {v0, v3, v2}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 953
    .line 954
    .line 955
    goto :goto_16

    .line 956
    :cond_1d
    const/4 v3, 0x0

    .line 957
    :goto_16
    const-string v2, "320x50"

    .line 958
    .line 959
    invoke-virtual {v0, v3, v2}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 960
    .line 961
    .line 962
    :cond_1e
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 963
    .line 964
    .line 965
    move-result-object v13

    .line 966
    iget-boolean v0, v4, Ll83;->r:Z

    .line 967
    .line 968
    new-instance v9, Ll33;

    .line 969
    .line 970
    move/from16 v16, v8

    .line 971
    .line 972
    move-object/from16 v19, v18

    .line 973
    .line 974
    move/from16 v18, v0

    .line 975
    .line 976
    invoke-direct/range {v9 .. v19}, Ll33;-><init>(Lxe4;Ljava/lang/String;ZLjava/lang/String;FIILjava/lang/String;ZLy20;)V

    .line 977
    .line 978
    .line 979
    return-object v9

    .line 980
    :pswitch_d
    iget-object v0, v1, Lvn1;->b:Ljava/lang/Object;

    .line 981
    .line 982
    check-cast v0, Lai2;

    .line 983
    .line 984
    invoke-virtual {v0}, Lai2;->z()Lik2;

    .line 985
    .line 986
    .line 987
    move-result-object v0

    .line 988
    return-object v0

    .line 989
    :pswitch_e
    iget-object v0, v1, Lvn1;->b:Ljava/lang/Object;

    .line 990
    .line 991
    check-cast v0, Lau2;

    .line 992
    .line 993
    move-object/from16 v2, p1

    .line 994
    .line 995
    check-cast v2, Lag2;

    .line 996
    .line 997
    const-string v3, "/result"

    .line 998
    .line 999
    iget-object v4, v0, Lau2;->h:Lv32;

    .line 1000
    .line 1001
    invoke-interface {v2, v3, v4}, Lag2;->v0(Ljava/lang/String;Ly32;)V

    .line 1002
    .line 1003
    .line 1004
    invoke-interface {v2}, Lag2;->e0()Lsg2;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v19

    .line 1008
    new-instance v3, Lsu1;

    .line 1009
    .line 1010
    iget-object v4, v0, Lau2;->c:Landroid/content/Context;

    .line 1011
    .line 1012
    const/4 v5, 0x0

    .line 1013
    invoke-direct {v3, v4, v5}, Lsu1;-><init>(Landroid/content/Context;Lsb2;)V

    .line 1014
    .line 1015
    .line 1016
    iget-object v4, v0, Lau2;->i:Ljz2;

    .line 1017
    .line 1018
    iget-object v5, v0, Lau2;->j:Leb3;

    .line 1019
    .line 1020
    iget-object v6, v0, Lau2;->d:Lmv2;

    .line 1021
    .line 1022
    iget-object v0, v0, Lau2;->a:Lvt2;

    .line 1023
    .line 1024
    const/16 v39, 0x0

    .line 1025
    .line 1026
    const/16 v40, 0x0

    .line 1027
    .line 1028
    const/16 v20, 0x0

    .line 1029
    .line 1030
    const/16 v25, 0x0

    .line 1031
    .line 1032
    const/16 v26, 0x0

    .line 1033
    .line 1034
    const/16 v28, 0x0

    .line 1035
    .line 1036
    const/16 v29, 0x0

    .line 1037
    .line 1038
    const/16 v33, 0x0

    .line 1039
    .line 1040
    const/16 v34, 0x0

    .line 1041
    .line 1042
    const/16 v35, 0x0

    .line 1043
    .line 1044
    const/16 v36, 0x0

    .line 1045
    .line 1046
    const/16 v37, 0x0

    .line 1047
    .line 1048
    const/16 v38, 0x0

    .line 1049
    .line 1050
    move-object/from16 v22, v0

    .line 1051
    .line 1052
    move-object/from16 v23, v0

    .line 1053
    .line 1054
    move-object/from16 v24, v0

    .line 1055
    .line 1056
    move-object/from16 v21, v0

    .line 1057
    .line 1058
    move-object/from16 v27, v3

    .line 1059
    .line 1060
    move-object/from16 v30, v4

    .line 1061
    .line 1062
    move-object/from16 v31, v5

    .line 1063
    .line 1064
    move-object/from16 v32, v6

    .line 1065
    .line 1066
    invoke-virtual/range {v19 .. v40}, Lsg2;->p(Lfd1;Ll32;Lye4;Lm32;Lkf1;ZLe42;Lsu1;Lof3;Lsb2;Ljz2;Leb3;Lmv2;Lz32;Lxp2;Lk32;Lk32;Lz32;Lgj2;Lxv2;Lim2;)V

    .line 1067
    .line 1068
    .line 1069
    return-object v2

    .line 1070
    :pswitch_f
    iget-object v0, v1, Lvn1;->b:Ljava/lang/Object;

    .line 1071
    .line 1072
    check-cast v0, Lg4;

    .line 1073
    .line 1074
    move-object/from16 v3, p1

    .line 1075
    .line 1076
    check-cast v3, Lorg/json/JSONObject;

    .line 1077
    .line 1078
    const-string v4, "flag_configuration"

    .line 1079
    .line 1080
    sget-object v5, Lmz1;->a:Liz1;

    .line 1081
    .line 1082
    sget-object v5, Ltw1;->e:Ltw1;

    .line 1083
    .line 1084
    iget-object v6, v5, Ltw1;->b:Lus0;

    .line 1085
    .line 1086
    iget-object v5, v5, Ltw1;->a:Lxb4;

    .line 1087
    .line 1088
    iget-object v6, v0, Lg4;->j:Ljava/lang/Object;

    .line 1089
    .line 1090
    check-cast v6, Landroid/content/Context;

    .line 1091
    .line 1092
    :try_start_b
    const-string v7, "google_ads_flags"

    .line 1093
    .line 1094
    const/4 v8, 0x0

    .line 1095
    invoke-virtual {v6, v7, v8}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v15
    :try_end_b
    .catch Ljava/lang/IllegalStateException; {:try_start_b .. :try_end_b} :catch_3

    .line 1099
    goto :goto_17

    .line 1100
    :catch_3
    invoke-static {v2}, Lgi2;->q0(I)Z

    .line 1101
    .line 1102
    .line 1103
    const/4 v15, 0x0

    .line 1104
    :goto_17
    if-nez v15, :cond_20

    .line 1105
    .line 1106
    :cond_1f
    :goto_18
    const/16 v17, 0x0

    .line 1107
    .line 1108
    goto/16 :goto_1e

    .line 1109
    .line 1110
    :cond_20
    invoke-interface {v15}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v7

    .line 1114
    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1115
    .line 1116
    .line 1117
    iget-object v5, v5, Lxb4;->g:Ljava/lang/Object;

    .line 1118
    .line 1119
    check-cast v5, Ljava/util/ArrayList;

    .line 1120
    .line 1121
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 1122
    .line 1123
    .line 1124
    move-result v8

    .line 1125
    const/4 v9, 0x0

    .line 1126
    :cond_21
    :goto_19
    if-ge v9, v8, :cond_22

    .line 1127
    .line 1128
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v10

    .line 1132
    add-int/lit8 v9, v9, 0x1

    .line 1133
    .line 1134
    check-cast v10, Liz1;

    .line 1135
    .line 1136
    iget v11, v10, Liz1;->a:I

    .line 1137
    .line 1138
    const/4 v12, 0x1

    .line 1139
    if-ne v11, v12, :cond_21

    .line 1140
    .line 1141
    invoke-virtual {v10, v3}, Liz1;->a(Lorg/json/JSONObject;)Ljava/lang/Object;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v11

    .line 1145
    iget v13, v10, Liz1;->e:I

    .line 1146
    .line 1147
    packed-switch v13, :pswitch_data_3

    .line 1148
    .line 1149
    .line 1150
    check-cast v11, Ljava/lang/String;

    .line 1151
    .line 1152
    iget-object v10, v10, Liz1;->b:Ljava/lang/String;

    .line 1153
    .line 1154
    invoke-interface {v7, v10, v11}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 1155
    .line 1156
    .line 1157
    goto :goto_19

    .line 1158
    :pswitch_10
    check-cast v11, Ljava/lang/Float;

    .line 1159
    .line 1160
    iget-object v10, v10, Liz1;->b:Ljava/lang/String;

    .line 1161
    .line 1162
    invoke-virtual {v11}, Ljava/lang/Float;->floatValue()F

    .line 1163
    .line 1164
    .line 1165
    move-result v11

    .line 1166
    invoke-interface {v7, v10, v11}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    .line 1167
    .line 1168
    .line 1169
    goto :goto_19

    .line 1170
    :pswitch_11
    check-cast v11, Ljava/lang/Long;

    .line 1171
    .line 1172
    iget-object v10, v10, Liz1;->b:Ljava/lang/String;

    .line 1173
    .line 1174
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    .line 1175
    .line 1176
    .line 1177
    move-result-wide v13

    .line 1178
    invoke-interface {v7, v10, v13, v14}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 1179
    .line 1180
    .line 1181
    goto :goto_19

    .line 1182
    :pswitch_12
    check-cast v11, Ljava/lang/Integer;

    .line 1183
    .line 1184
    iget-object v10, v10, Liz1;->b:Ljava/lang/String;

    .line 1185
    .line 1186
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 1187
    .line 1188
    .line 1189
    move-result v11

    .line 1190
    invoke-interface {v7, v10, v11}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 1191
    .line 1192
    .line 1193
    goto :goto_19

    .line 1194
    :pswitch_13
    check-cast v11, Ljava/lang/Boolean;

    .line 1195
    .line 1196
    iget-object v10, v10, Liz1;->b:Ljava/lang/String;

    .line 1197
    .line 1198
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1199
    .line 1200
    .line 1201
    move-result v11

    .line 1202
    invoke-interface {v7, v10, v11}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 1203
    .line 1204
    .line 1205
    goto :goto_19

    .line 1206
    :cond_22
    if-eqz v3, :cond_23

    .line 1207
    .line 1208
    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 1209
    .line 1210
    .line 1211
    move-result-object v5

    .line 1212
    invoke-interface {v7, v4, v5}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 1213
    .line 1214
    .line 1215
    goto :goto_1a

    .line 1216
    :cond_23
    const-string v5, "Flag Json is null."

    .line 1217
    .line 1218
    invoke-static {v5}, Lgi2;->Z(Ljava/lang/String;)V

    .line 1219
    .line 1220
    .line 1221
    :goto_1a
    sget-object v5, Ltw1;->e:Ltw1;

    .line 1222
    .line 1223
    iget-object v5, v5, Ltw1;->b:Lus0;

    .line 1224
    .line 1225
    invoke-interface {v7}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 1226
    .line 1227
    .line 1228
    sget-object v5, Ls02;->c:Lso1;

    .line 1229
    .line 1230
    invoke-virtual {v5}, Lso1;->w()Ljava/lang/Object;

    .line 1231
    .line 1232
    .line 1233
    move-result-object v5

    .line 1234
    check-cast v5, Ljava/lang/Boolean;

    .line 1235
    .line 1236
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1237
    .line 1238
    .line 1239
    move-result v5

    .line 1240
    if-eqz v5, :cond_27

    .line 1241
    .line 1242
    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 1243
    .line 1244
    .line 1245
    move-result-object v5

    .line 1246
    const-string v7, "com.google.android.gms"

    .line 1247
    .line 1248
    invoke-static {v5, v7}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 1249
    .line 1250
    .line 1251
    move-result v5

    .line 1252
    if-eqz v5, :cond_24

    .line 1253
    .line 1254
    goto :goto_1d

    .line 1255
    :cond_24
    :try_start_c
    const-string v5, "google_adapter_flags"

    .line 1256
    .line 1257
    const/4 v8, 0x0

    .line 1258
    invoke-virtual {v6, v5, v8}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 1259
    .line 1260
    .line 1261
    move-result-object v15
    :try_end_c
    .catch Ljava/lang/IllegalStateException; {:try_start_c .. :try_end_c} :catch_4

    .line 1262
    goto :goto_1b

    .line 1263
    :catch_4
    invoke-static {v2}, Lgi2;->q0(I)Z

    .line 1264
    .line 1265
    .line 1266
    const/4 v15, 0x0

    .line 1267
    :goto_1b
    if-eqz v15, :cond_27

    .line 1268
    .line 1269
    invoke-interface {v15}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 1270
    .line 1271
    .line 1272
    move-result-object v2

    .line 1273
    new-instance v5, Lorg/json/JSONObject;

    .line 1274
    .line 1275
    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 1276
    .line 1277
    .line 1278
    invoke-virtual {v3}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 1279
    .line 1280
    .line 1281
    move-result-object v6

    .line 1282
    :catch_5
    :cond_25
    :goto_1c
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1283
    .line 1284
    .line 1285
    move-result v7

    .line 1286
    if-eqz v7, :cond_26

    .line 1287
    .line 1288
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1289
    .line 1290
    .line 1291
    move-result-object v7

    .line 1292
    check-cast v7, Ljava/lang/String;

    .line 1293
    .line 1294
    const-string v8, "adapter:"

    .line 1295
    .line 1296
    invoke-virtual {v7, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1297
    .line 1298
    .line 1299
    move-result v8

    .line 1300
    if-eqz v8, :cond_25

    .line 1301
    .line 1302
    :try_start_d
    invoke-virtual {v3, v7}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 1303
    .line 1304
    .line 1305
    move-result-object v8

    .line 1306
    invoke-virtual {v5, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_d
    .catch Lorg/json/JSONException; {:try_start_d .. :try_end_d} :catch_5

    .line 1307
    .line 1308
    .line 1309
    goto :goto_1c

    .line 1310
    :cond_26
    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 1311
    .line 1312
    .line 1313
    move-result-object v3

    .line 1314
    invoke-interface {v2, v4, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 1315
    .line 1316
    .line 1317
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 1318
    .line 1319
    .line 1320
    :cond_27
    :goto_1d
    iget-object v0, v0, Lg4;->h:Ljava/lang/Object;

    .line 1321
    .line 1322
    check-cast v0, Landroid/content/SharedPreferences;

    .line 1323
    .line 1324
    if-eqz v0, :cond_1f

    .line 1325
    .line 1326
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 1327
    .line 1328
    .line 1329
    move-result-object v0

    .line 1330
    sget-object v2, Lhg4;->C:Lhg4;

    .line 1331
    .line 1332
    iget-object v2, v2, Lhg4;->k:Lym;

    .line 1333
    .line 1334
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1335
    .line 1336
    .line 1337
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1338
    .line 1339
    .line 1340
    move-result-wide v2

    .line 1341
    const-string v4, "js_last_update"

    .line 1342
    .line 1343
    invoke-interface {v0, v4, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 1344
    .line 1345
    .line 1346
    move-result-object v0

    .line 1347
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1348
    .line 1349
    .line 1350
    goto/16 :goto_18

    .line 1351
    .line 1352
    :goto_1e
    return-object v17

    .line 1353
    :pswitch_14
    iget-object v0, v1, Lvn1;->b:Ljava/lang/Object;

    .line 1354
    .line 1355
    check-cast v0, Landroid/net/Uri;

    .line 1356
    .line 1357
    move-object/from16 v2, p1

    .line 1358
    .line 1359
    check-cast v2, Ljava/lang/String;

    .line 1360
    .line 1361
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1362
    .line 1363
    .line 1364
    move-result v3

    .line 1365
    if-nez v3, :cond_28

    .line 1366
    .line 1367
    const-string v3, "nas"

    .line 1368
    .line 1369
    invoke-static {v0, v3, v2}, Lcr1;->I3(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 1370
    .line 1371
    .line 1372
    move-result-object v0

    .line 1373
    :cond_28
    return-object v0

    .line 1374
    nop

    .line 1375
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_14
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
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_3
    .end packed-switch

    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_4
    .end packed-switch

    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
    .end packed-switch
.end method
