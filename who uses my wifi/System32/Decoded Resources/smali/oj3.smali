.class public final synthetic Loj3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lzk3;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lpj3;


# direct methods
.method public synthetic constructor <init>(Lpj3;I)V
    .locals 0

    .line 1
    iput p2, p0, Loj3;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Loj3;->b:Lpj3;

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
    .locals 9

    .line 1
    iget v0, p0, Loj3;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lav1;

    .line 7
    .line 8
    invoke-static {p1}, Lgi2;->H(Lav1;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    new-instance p1, Ljava/lang/Integer;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-direct {p1, v0}, Ljava/lang/Integer;-><init>(I)V

    .line 18
    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_0
    iget-object v0, p0, Loj3;->b:Lpj3;

    .line 22
    .line 23
    iget-object v0, v0, Lpj3;->d:Lgk3;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    iget-object p1, v0, Lgk3;->a:Lpg3;

    .line 30
    .line 31
    const/4 v5, 0x0

    .line 32
    move-object v1, p1

    .line 33
    check-cast v1, Lwg3;

    .line 34
    .line 35
    const/16 v2, 0x3b63

    .line 36
    .line 37
    const-wide/16 v3, -0x1

    .line 38
    .line 39
    invoke-virtual/range {v1 .. v6}, Lwg3;->b(IJLjava/lang/Throwable;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    new-instance p1, Lnj3;

    .line 43
    .line 44
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :pswitch_0
    check-cast p1, Ljh3;

    .line 49
    .line 50
    iget-object v0, p0, Loj3;->b:Lpj3;

    .line 51
    .line 52
    iget-object v1, v0, Lpj3;->e:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v1, Lz94;

    .line 55
    .line 56
    invoke-virtual {p1}, Ljh3;->A()Lfv1;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v2}, Lfv1;->A()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {p1}, Ljh3;->A()Lfv1;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-virtual {v3}, Lfv1;->B()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    iget-object v4, v0, Lpj3;->d:Lgk3;

    .line 73
    .line 74
    const/16 v5, 0x3b63

    .line 75
    .line 76
    invoke-virtual {v4, v5}, Lgk3;->a(I)Lfk3;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    :try_start_0
    invoke-virtual {v5}, Lfk3;->a()V

    .line 81
    .line 82
    .line 83
    iget-object v6, v0, Lpj3;->b:Landroid/content/Context;

    .line 84
    .line 85
    invoke-interface {v1}, Lz94;->d()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    check-cast v7, Lav1;

    .line 90
    .line 91
    iget-object v8, v0, Lpj3;->h:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v8, Lgd3;

    .line 94
    .line 95
    invoke-static {v6, v7, v2, v3, v8}, Lbd2;->G(Landroid/content/Context;Lav1;Ljava/lang/String;Ljava/lang/String;Lgd3;)Lce3;

    .line 96
    .line 97
    .line 98
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    iget v3, v2, Lce3;->h:I

    .line 100
    .line 101
    invoke-virtual {v5}, Lfk3;->c()V

    .line 102
    .line 103
    .line 104
    const/4 v5, 0x2

    .line 105
    const/4 v6, 0x4

    .line 106
    if-ne v3, v5, :cond_1

    .line 107
    .line 108
    const/16 p1, 0x3b68

    .line 109
    .line 110
    invoke-virtual {v4, p1}, Lgk3;->b(I)V

    .line 111
    .line 112
    .line 113
    invoke-static {v6}, Lpj3;->b(I)Lyg3;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    goto/16 :goto_8

    .line 118
    .line 119
    :cond_1
    iget-object v2, v2, Lce3;->g:[B

    .line 120
    .line 121
    if-eqz v2, :cond_d

    .line 122
    .line 123
    array-length v7, v2

    .line 124
    if-nez v7, :cond_2

    .line 125
    .line 126
    goto/16 :goto_7

    .line 127
    .line 128
    :cond_2
    :try_start_1
    invoke-static {}, Lh54;->a()Lh54;

    .line 129
    .line 130
    .line 131
    move-result-object v7

    .line 132
    invoke-static {v2, v7}, Lbv1;->E([BLh54;)Lbv1;

    .line 133
    .line 134
    .line 135
    move-result-object v2
    :try_end_1
    .catch La64; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_4

    .line 136
    invoke-virtual {v2}, Lbv1;->A()Lfv1;

    .line 137
    .line 138
    .line 139
    move-result-object v7

    .line 140
    invoke-virtual {v7}, Lfv1;->A()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v7

    .line 144
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    .line 145
    .line 146
    .line 147
    move-result v7

    .line 148
    if-nez v7, :cond_c

    .line 149
    .line 150
    invoke-virtual {v2}, Lbv1;->A()Lfv1;

    .line 151
    .line 152
    .line 153
    move-result-object v7

    .line 154
    invoke-virtual {v7}, Lfv1;->B()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v7

    .line 158
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    .line 159
    .line 160
    .line 161
    move-result v7

    .line 162
    if-nez v7, :cond_c

    .line 163
    .line 164
    invoke-virtual {v2}, Lbv1;->C()La54;

    .line 165
    .line 166
    .line 167
    move-result-object v7

    .line 168
    invoke-virtual {v7}, La54;->p()[B

    .line 169
    .line 170
    .line 171
    move-result-object v7

    .line 172
    array-length v7, v7

    .line 173
    if-nez v7, :cond_3

    .line 174
    .line 175
    goto/16 :goto_4

    .line 176
    .line 177
    :cond_3
    invoke-static {}, Ljh3;->E()Ljh3;

    .line 178
    .line 179
    .line 180
    move-result-object v7

    .line 181
    invoke-virtual {p1, v7}, Lp54;->equals(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v7

    .line 185
    if-eqz v7, :cond_4

    .line 186
    .line 187
    goto :goto_0

    .line 188
    :cond_4
    invoke-virtual {p1}, Ljh3;->A()Lfv1;

    .line 189
    .line 190
    .line 191
    move-result-object v7

    .line 192
    invoke-virtual {v7}, Lfv1;->A()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v7

    .line 196
    invoke-virtual {v2}, Lbv1;->A()Lfv1;

    .line 197
    .line 198
    .line 199
    move-result-object v8

    .line 200
    invoke-virtual {v8}, Lfv1;->A()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v8

    .line 204
    invoke-static {v7, v8}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 205
    .line 206
    .line 207
    move-result v7

    .line 208
    if-eqz v7, :cond_5

    .line 209
    .line 210
    invoke-virtual {p1}, Ljh3;->A()Lfv1;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    invoke-virtual {p1}, Lfv1;->B()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    invoke-virtual {v2}, Lbv1;->A()Lfv1;

    .line 219
    .line 220
    .line 221
    move-result-object v7

    .line 222
    invoke-virtual {v7}, Lfv1;->B()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v7

    .line 226
    invoke-static {p1, v7}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 227
    .line 228
    .line 229
    move-result p1

    .line 230
    if-eqz p1, :cond_5

    .line 231
    .line 232
    const/16 p1, 0x3b69

    .line 233
    .line 234
    invoke-virtual {v4, p1}, Lgk3;->b(I)V

    .line 235
    .line 236
    .line 237
    goto/16 :goto_5

    .line 238
    .line 239
    :cond_5
    :goto_0
    if-ne v3, v6, :cond_7

    .line 240
    .line 241
    iget-object p1, v0, Lpj3;->g:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast p1, Ljj3;

    .line 244
    .line 245
    invoke-virtual {v2}, Lbv1;->B()La54;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    invoke-virtual {v0}, La54;->p()[B

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    iget-object v3, p1, Ljj3;->a:Ljava/io/File;

    .line 254
    .line 255
    :try_start_2
    invoke-static {v3}, Lyb;->A(Ljava/io/File;)V

    .line 256
    .line 257
    .line 258
    invoke-static {v3, v0}, Lyb;->v(Ljava/io/File;[B)V

    .line 259
    .line 260
    .line 261
    iget-object v0, p1, Ljj3;->b:Lfd3;

    .line 262
    .line 263
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    invoke-static {v3}, Lfd3;->a(Ljava/io/File;)Z

    .line 267
    .line 268
    .line 269
    move-result p1
    :try_end_2
    .catch Ljava/security/GeneralSecurityException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 270
    goto :goto_2

    .line 271
    :catch_0
    move-exception v0

    .line 272
    goto :goto_1

    .line 273
    :catch_1
    move-exception v0

    .line 274
    :goto_1
    iget-object p1, p1, Ljj3;->c:Lgk3;

    .line 275
    .line 276
    const/16 v7, 0x7eb

    .line 277
    .line 278
    invoke-virtual {p1, v7, v0}, Lgk3;->c(ILjava/lang/Throwable;)V

    .line 279
    .line 280
    .line 281
    const/4 p1, 0x0

    .line 282
    :goto_2
    :try_start_3
    invoke-virtual {v3}, Ljava/io/File;->delete()Z
    :try_end_3
    .catch Ljava/lang/SecurityException; {:try_start_3 .. :try_end_3} :catch_2

    .line 283
    .line 284
    .line 285
    :catch_2
    if-nez p1, :cond_6

    .line 286
    .line 287
    const/16 p1, 0x3b66

    .line 288
    .line 289
    invoke-virtual {v4, p1}, Lgk3;->b(I)V

    .line 290
    .line 291
    .line 292
    const/16 p1, 0xc

    .line 293
    .line 294
    invoke-static {p1}, Lpj3;->b(I)Lyg3;

    .line 295
    .line 296
    .line 297
    move-result-object p1

    .line 298
    goto/16 :goto_8

    .line 299
    .line 300
    :cond_6
    move v3, v6

    .line 301
    :cond_7
    invoke-static {}, Lyg3;->D()Lxg3;

    .line 302
    .line 303
    .line 304
    move-result-object p1

    .line 305
    if-eq v3, v5, :cond_a

    .line 306
    .line 307
    const/4 v0, 0x3

    .line 308
    if-eq v3, v0, :cond_b

    .line 309
    .line 310
    if-eq v3, v6, :cond_9

    .line 311
    .line 312
    const/4 v0, 0x6

    .line 313
    if-eq v3, v0, :cond_8

    .line 314
    .line 315
    const/4 v5, 0x1

    .line 316
    goto :goto_3

    .line 317
    :cond_8
    const/4 v5, 0x5

    .line 318
    goto :goto_3

    .line 319
    :cond_9
    move v5, v0

    .line 320
    goto :goto_3

    .line 321
    :cond_a
    move v5, v6

    .line 322
    :cond_b
    :goto_3
    invoke-virtual {p1}, Ln54;->b()V

    .line 323
    .line 324
    .line 325
    iget-object v0, p1, Ln54;->g:Lp54;

    .line 326
    .line 327
    check-cast v0, Lyg3;

    .line 328
    .line 329
    invoke-virtual {v0, v5}, Lyg3;->I(I)V

    .line 330
    .line 331
    .line 332
    invoke-static {}, Ljh3;->D()Lzg3;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    invoke-virtual {v2}, Lbv1;->A()Lfv1;

    .line 337
    .line 338
    .line 339
    move-result-object v3

    .line 340
    invoke-virtual {v0}, Ln54;->b()V

    .line 341
    .line 342
    .line 343
    iget-object v4, v0, Ln54;->g:Lp54;

    .line 344
    .line 345
    check-cast v4, Ljh3;

    .line 346
    .line 347
    invoke-virtual {v4, v3}, Ljh3;->F(Lfv1;)V

    .line 348
    .line 349
    .line 350
    invoke-interface {v1}, Lz94;->d()Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v1

    .line 354
    check-cast v1, Lav1;

    .line 355
    .line 356
    invoke-virtual {v0}, Ln54;->b()V

    .line 357
    .line 358
    .line 359
    iget-object v3, v0, Ln54;->g:Lp54;

    .line 360
    .line 361
    check-cast v3, Ljh3;

    .line 362
    .line 363
    invoke-virtual {v3, v1}, Ljh3;->H(Lav1;)V

    .line 364
    .line 365
    .line 366
    invoke-virtual {v0}, Ln54;->d()Lp54;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    check-cast v0, Ljh3;

    .line 371
    .line 372
    invoke-virtual {p1}, Ln54;->b()V

    .line 373
    .line 374
    .line 375
    iget-object v1, p1, Ln54;->g:Lp54;

    .line 376
    .line 377
    check-cast v1, Lyg3;

    .line 378
    .line 379
    invoke-virtual {v1, v0}, Lyg3;->E(Ljh3;)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v2}, Lbv1;->B()La54;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    invoke-virtual {p1}, Ln54;->b()V

    .line 387
    .line 388
    .line 389
    iget-object v1, p1, Ln54;->g:Lp54;

    .line 390
    .line 391
    check-cast v1, Lyg3;

    .line 392
    .line 393
    invoke-virtual {v1, v0}, Lyg3;->G(La54;)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v2}, Lbv1;->C()La54;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    invoke-virtual {p1}, Ln54;->b()V

    .line 401
    .line 402
    .line 403
    iget-object v1, p1, Ln54;->g:Lp54;

    .line 404
    .line 405
    check-cast v1, Lyg3;

    .line 406
    .line 407
    invoke-virtual {v1, v0}, Lyg3;->F(La54;)V

    .line 408
    .line 409
    .line 410
    invoke-virtual {p1}, Ln54;->d()Lp54;

    .line 411
    .line 412
    .line 413
    move-result-object p1

    .line 414
    check-cast p1, Lyg3;

    .line 415
    .line 416
    goto :goto_8

    .line 417
    :cond_c
    :goto_4
    const/16 p1, 0x3b67

    .line 418
    .line 419
    invoke-virtual {v4, p1}, Lgk3;->b(I)V

    .line 420
    .line 421
    .line 422
    :goto_5
    const/16 p1, 0xb

    .line 423
    .line 424
    invoke-static {p1}, Lpj3;->b(I)Lyg3;

    .line 425
    .line 426
    .line 427
    move-result-object p1

    .line 428
    goto :goto_8

    .line 429
    :catch_3
    move-exception v0

    .line 430
    move-object p1, v0

    .line 431
    goto :goto_6

    .line 432
    :catch_4
    const/16 p1, 0x3b6a

    .line 433
    .line 434
    invoke-virtual {v4, p1}, Lgk3;->b(I)V

    .line 435
    .line 436
    .line 437
    const/16 p1, 0xa

    .line 438
    .line 439
    invoke-static {p1}, Lpj3;->b(I)Lyg3;

    .line 440
    .line 441
    .line 442
    move-result-object p1

    .line 443
    goto :goto_8

    .line 444
    :goto_6
    const/16 v0, 0x3b65

    .line 445
    .line 446
    invoke-virtual {v4, v0, p1}, Lgk3;->c(ILjava/lang/Throwable;)V

    .line 447
    .line 448
    .line 449
    const/16 p1, 0x9

    .line 450
    .line 451
    invoke-static {p1}, Lpj3;->b(I)Lyg3;

    .line 452
    .line 453
    .line 454
    move-result-object p1

    .line 455
    goto :goto_8

    .line 456
    :cond_d
    :goto_7
    const/16 p1, 0x1392

    .line 457
    .line 458
    invoke-virtual {v4, p1}, Lgk3;->b(I)V

    .line 459
    .line 460
    .line 461
    const/16 p1, 0x8

    .line 462
    .line 463
    invoke-static {p1}, Lpj3;->b(I)Lyg3;

    .line 464
    .line 465
    .line 466
    move-result-object p1

    .line 467
    :goto_8
    return-object p1

    .line 468
    :catchall_0
    move-exception v0

    .line 469
    move-object p1, v0

    .line 470
    :try_start_4
    invoke-virtual {v5, p1}, Lfk3;->b(Ljava/lang/Throwable;)V

    .line 471
    .line 472
    .line 473
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 474
    :catchall_1
    move-exception v0

    .line 475
    move-object p1, v0

    .line 476
    invoke-virtual {v5}, Lfk3;->c()V

    .line 477
    .line 478
    .line 479
    throw p1

    .line 480
    nop

    .line 481
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
