.class public final Lef4;
.super Lkg4;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lob4;


# instance fields
.field public final A0:Lwt2;

.field public final B0:Ldf4;

.field public final C0:Lwt2;

.field public D0:I

.field public E0:Z

.field public F0:Lph4;

.field public G0:Lph4;

.field public H0:J

.field public I0:Z

.field public J0:Z

.field public K0:Z

.field public L0:I

.field public M0:Z

.field public N0:J


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcy2;Landroid/os/Handler;Loa4;Ldf4;)V
    .locals 4

    .line 1
    sget-object v0, Lhd4;->g:Lhd4;

    .line 2
    .line 3
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 4
    .line 5
    const/16 v2, 0x23

    .line 6
    .line 7
    if-lt v1, v2, :cond_0

    .line 8
    .line 9
    new-instance v1, Lwt2;

    .line 10
    .line 11
    const/16 v2, 0xd

    .line 12
    .line 13
    invoke-direct {v1, v2}, Lwt2;-><init>(I)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v1, 0x0

    .line 18
    :goto_0
    const/4 v2, 0x1

    .line 19
    const v3, 0x472c4400    # 44100.0f

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, v2, p2, v0, v3}, Lkg4;-><init>(ILcy2;Lhd4;F)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    iput-object p5, p0, Lef4;->B0:Ldf4;

    .line 29
    .line 30
    iput-object v1, p0, Lef4;->C0:Lwt2;

    .line 31
    .line 32
    const/16 p1, -0x3e8

    .line 33
    .line 34
    iput p1, p0, Lef4;->L0:I

    .line 35
    .line 36
    new-instance p1, Lwt2;

    .line 37
    .line 38
    const/16 p2, 0xb

    .line 39
    .line 40
    const/4 v0, 0x0

    .line 41
    invoke-direct {p1, p3, p4, p2, v0}, Lwt2;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lef4;->A0:Lwt2;

    .line 45
    .line 46
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    iput-wide p1, p0, Lef4;->N0:J

    .line 52
    .line 53
    new-instance p1, Lbi3;

    .line 54
    .line 55
    const/4 p2, 0x5

    .line 56
    invoke-direct {p1, p2, p0}, Lbi3;-><init>(ILjava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iput-object p1, p5, Ldf4;->n:Lbi3;

    .line 60
    .line 61
    return-void
.end method


# virtual methods
.method public final K(Lhd4;Lph4;)I
    .locals 18

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    iget-object v1, v0, Lph4;->m:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, v0, Lph4;->m:Ljava/lang/String;

    .line 6
    .line 7
    iget v3, v0, Lph4;->E:I

    .line 8
    .line 9
    iget v4, v0, Lph4;->F:I

    .line 10
    .line 11
    invoke-static {v1}, Lpp1;->a(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    const/16 v6, 0x80

    .line 16
    .line 17
    if-nez v5, :cond_0

    .line 18
    .line 19
    return v6

    .line 20
    :cond_0
    iget v5, v0, Lph4;->L:I

    .line 21
    .line 22
    const/4 v7, 0x0

    .line 23
    if-eqz v5, :cond_1

    .line 24
    .line 25
    move v9, v7

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 v9, 0x1

    .line 28
    :goto_0
    const-string v11, "audio/raw"

    .line 29
    .line 30
    const/16 v12, 0x20

    .line 31
    .line 32
    move-object/from16 v14, p0

    .line 33
    .line 34
    iget-object v15, v14, Lef4;->B0:Ldf4;

    .line 35
    .line 36
    if-eqz v9, :cond_15

    .line 37
    .line 38
    if-eqz v5, :cond_4

    .line 39
    .line 40
    invoke-static {v11, v7, v7}, Log4;->a(Ljava/lang/String;ZZ)Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 45
    .line 46
    .line 47
    move-result v16

    .line 48
    if-eqz v16, :cond_2

    .line 49
    .line 50
    const/4 v5, 0x0

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    check-cast v5, Lbg4;

    .line 57
    .line 58
    :goto_1
    if-eqz v5, :cond_3

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_3
    move v6, v7

    .line 62
    goto/16 :goto_d

    .line 63
    .line 64
    :cond_4
    :goto_2
    iget-boolean v5, v15, Ldf4;->V:Z

    .line 65
    .line 66
    if-eqz v5, :cond_5

    .line 67
    .line 68
    sget-object v5, Lde4;->d:Lde4;

    .line 69
    .line 70
    goto/16 :goto_a

    .line 71
    .line 72
    :cond_5
    iget-object v5, v15, Ldf4;->e0:Lwt2;

    .line 73
    .line 74
    iget-object v10, v15, Ldf4;->v:Lin2;

    .line 75
    .line 76
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 83
    .line 84
    const/16 v7, 0x1d

    .line 85
    .line 86
    if-lt v6, v7, :cond_11

    .line 87
    .line 88
    const/4 v7, -0x1

    .line 89
    if-ne v4, v7, :cond_6

    .line 90
    .line 91
    goto/16 :goto_9

    .line 92
    .line 93
    :cond_6
    iget-object v7, v5, Lwt2;->g:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v7, Landroid/content/Context;

    .line 96
    .line 97
    iget-object v8, v5, Lwt2;->h:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v8, Ljava/lang/Boolean;

    .line 100
    .line 101
    if-eqz v8, :cond_7

    .line 102
    .line 103
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    goto :goto_5

    .line 108
    :cond_7
    if-eqz v7, :cond_9

    .line 109
    .line 110
    invoke-static {v7}, Lbd2;->B(Landroid/content/Context;)Landroid/media/AudioManager;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    const-string v8, "offloadVariableRateSupported"

    .line 115
    .line 116
    invoke-virtual {v7, v8}, Landroid/media/AudioManager;->getParameters(Ljava/lang/String;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    if-eqz v7, :cond_8

    .line 121
    .line 122
    const-string v8, "offloadVariableRateSupported=1"

    .line 123
    .line 124
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v7

    .line 128
    if-eqz v7, :cond_8

    .line 129
    .line 130
    const/4 v7, 0x1

    .line 131
    goto :goto_3

    .line 132
    :cond_8
    const/4 v7, 0x0

    .line 133
    :goto_3
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    iput-object v7, v5, Lwt2;->h:Ljava/lang/Object;

    .line 138
    .line 139
    goto :goto_4

    .line 140
    :cond_9
    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 141
    .line 142
    iput-object v7, v5, Lwt2;->h:Ljava/lang/Object;

    .line 143
    .line 144
    :goto_4
    iget-object v5, v5, Lwt2;->h:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v5, Ljava/lang/Boolean;

    .line 147
    .line 148
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 149
    .line 150
    .line 151
    move-result v5

    .line 152
    :goto_5
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    iget-object v7, v0, Lph4;->j:Ljava/lang/String;

    .line 156
    .line 157
    invoke-static {v2, v7}, Lpp1;->h(Ljava/lang/String;Ljava/lang/String;)I

    .line 158
    .line 159
    .line 160
    move-result v7

    .line 161
    if-eqz v7, :cond_10

    .line 162
    .line 163
    invoke-static {v7}, Lv23;->c(I)I

    .line 164
    .line 165
    .line 166
    move-result v8

    .line 167
    if-ge v6, v8, :cond_a

    .line 168
    .line 169
    goto/16 :goto_8

    .line 170
    .line 171
    :cond_a
    invoke-static {v3}, Lv23;->b(I)I

    .line 172
    .line 173
    .line 174
    move-result v8

    .line 175
    if-eqz v8, :cond_f

    .line 176
    .line 177
    :try_start_0
    new-instance v13, Landroid/media/AudioFormat$Builder;

    .line 178
    .line 179
    invoke-direct {v13}, Landroid/media/AudioFormat$Builder;-><init>()V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v13, v4}, Landroid/media/AudioFormat$Builder;->setSampleRate(I)Landroid/media/AudioFormat$Builder;

    .line 183
    .line 184
    .line 185
    move-result-object v13

    .line 186
    invoke-virtual {v13, v8}, Landroid/media/AudioFormat$Builder;->setChannelMask(I)Landroid/media/AudioFormat$Builder;

    .line 187
    .line 188
    .line 189
    move-result-object v8

    .line 190
    invoke-virtual {v8, v7}, Landroid/media/AudioFormat$Builder;->setEncoding(I)Landroid/media/AudioFormat$Builder;

    .line 191
    .line 192
    .line 193
    move-result-object v7

    .line 194
    invoke-virtual {v7}, Landroid/media/AudioFormat$Builder;->build()Landroid/media/AudioFormat;

    .line 195
    .line 196
    .line 197
    move-result-object v7
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 198
    const/16 v8, 0x1f

    .line 199
    .line 200
    if-lt v6, v8, :cond_d

    .line 201
    .line 202
    invoke-virtual {v10}, Lin2;->a()Landroid/media/AudioAttributes;

    .line 203
    .line 204
    .line 205
    move-result-object v8

    .line 206
    invoke-static {v7, v8}, Lzd4;->a(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)I

    .line 207
    .line 208
    .line 209
    move-result v7

    .line 210
    if-nez v7, :cond_b

    .line 211
    .line 212
    sget-object v5, Lde4;->d:Lde4;

    .line 213
    .line 214
    goto :goto_a

    .line 215
    :cond_b
    new-instance v8, Lk51;

    .line 216
    .line 217
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 218
    .line 219
    .line 220
    if-le v6, v12, :cond_c

    .line 221
    .line 222
    const/4 v6, 0x2

    .line 223
    if-ne v7, v6, :cond_c

    .line 224
    .line 225
    const/4 v6, 0x1

    .line 226
    :goto_6
    const/4 v7, 0x1

    .line 227
    goto :goto_7

    .line 228
    :cond_c
    const/4 v6, 0x0

    .line 229
    goto :goto_6

    .line 230
    :goto_7
    iput-boolean v7, v8, Lk51;->a:Z

    .line 231
    .line 232
    iput-boolean v6, v8, Lk51;->b:Z

    .line 233
    .line 234
    iput-boolean v5, v8, Lk51;->c:Z

    .line 235
    .line 236
    invoke-virtual {v8}, Lk51;->a()Lde4;

    .line 237
    .line 238
    .line 239
    move-result-object v5

    .line 240
    goto :goto_a

    .line 241
    :cond_d
    invoke-virtual {v10}, Lin2;->a()Landroid/media/AudioAttributes;

    .line 242
    .line 243
    .line 244
    move-result-object v6

    .line 245
    invoke-static {v7, v6}, Li71;->y(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)Z

    .line 246
    .line 247
    .line 248
    move-result v6

    .line 249
    if-nez v6, :cond_e

    .line 250
    .line 251
    sget-object v5, Lde4;->d:Lde4;

    .line 252
    .line 253
    goto :goto_a

    .line 254
    :cond_e
    new-instance v6, Lk51;

    .line 255
    .line 256
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 257
    .line 258
    .line 259
    const/4 v7, 0x1

    .line 260
    iput-boolean v7, v6, Lk51;->a:Z

    .line 261
    .line 262
    iput-boolean v5, v6, Lk51;->c:Z

    .line 263
    .line 264
    invoke-virtual {v6}, Lk51;->a()Lde4;

    .line 265
    .line 266
    .line 267
    move-result-object v5

    .line 268
    goto :goto_a

    .line 269
    :catch_0
    sget-object v5, Lde4;->d:Lde4;

    .line 270
    .line 271
    goto :goto_a

    .line 272
    :cond_f
    sget-object v5, Lde4;->d:Lde4;

    .line 273
    .line 274
    goto :goto_a

    .line 275
    :cond_10
    :goto_8
    sget-object v5, Lde4;->d:Lde4;

    .line 276
    .line 277
    goto :goto_a

    .line 278
    :cond_11
    :goto_9
    sget-object v5, Lde4;->d:Lde4;

    .line 279
    .line 280
    :goto_a
    iget-boolean v6, v5, Lde4;->a:Z

    .line 281
    .line 282
    if-nez v6, :cond_12

    .line 283
    .line 284
    const/4 v6, 0x0

    .line 285
    goto :goto_c

    .line 286
    :cond_12
    iget-boolean v6, v5, Lde4;->b:Z

    .line 287
    .line 288
    const/4 v7, 0x1

    .line 289
    if-eq v7, v6, :cond_13

    .line 290
    .line 291
    const/16 v6, 0x200

    .line 292
    .line 293
    goto :goto_b

    .line 294
    :cond_13
    const/16 v6, 0x600

    .line 295
    .line 296
    :goto_b
    iget-boolean v5, v5, Lde4;->c:Z

    .line 297
    .line 298
    if-eqz v5, :cond_14

    .line 299
    .line 300
    or-int/lit16 v6, v6, 0x800

    .line 301
    .line 302
    :cond_14
    :goto_c
    invoke-virtual {v15, v0}, Ldf4;->o(Lph4;)I

    .line 303
    .line 304
    .line 305
    move-result v5

    .line 306
    if-eqz v5, :cond_16

    .line 307
    .line 308
    or-int/lit16 v0, v6, 0xac

    .line 309
    .line 310
    return v0

    .line 311
    :cond_15
    const/4 v6, 0x0

    .line 312
    :cond_16
    :goto_d
    invoke-virtual {v11, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result v1

    .line 316
    if-eqz v1, :cond_18

    .line 317
    .line 318
    invoke-virtual {v15, v0}, Ldf4;->o(Lph4;)I

    .line 319
    .line 320
    .line 321
    move-result v1

    .line 322
    if-eqz v1, :cond_17

    .line 323
    .line 324
    goto :goto_f

    .line 325
    :cond_17
    :goto_e
    const/16 v0, 0x80

    .line 326
    .line 327
    const/4 v8, 0x1

    .line 328
    goto/16 :goto_1b

    .line 329
    .line 330
    :cond_18
    :goto_f
    new-instance v1, Lgg4;

    .line 331
    .line 332
    invoke-direct {v1}, Lgg4;-><init>()V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v1, v11}, Lgg4;->e(Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    iput v3, v1, Lgg4;->D:I

    .line 339
    .line 340
    iput v4, v1, Lgg4;->E:I

    .line 341
    .line 342
    const/4 v3, 0x2

    .line 343
    iput v3, v1, Lgg4;->F:I

    .line 344
    .line 345
    new-instance v4, Lph4;

    .line 346
    .line 347
    invoke-direct {v4, v1}, Lph4;-><init>(Lgg4;)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {v15, v4}, Ldf4;->o(Lph4;)I

    .line 351
    .line 352
    .line 353
    move-result v1

    .line 354
    if-eqz v1, :cond_25

    .line 355
    .line 356
    if-nez v2, :cond_19

    .line 357
    .line 358
    sget-object v1, Lsn3;->j:Lsn3;

    .line 359
    .line 360
    const/4 v7, 0x0

    .line 361
    goto :goto_13

    .line 362
    :cond_19
    invoke-virtual {v15, v0}, Ldf4;->o(Lph4;)I

    .line 363
    .line 364
    .line 365
    move-result v1

    .line 366
    if-eqz v1, :cond_1c

    .line 367
    .line 368
    const/4 v7, 0x0

    .line 369
    invoke-static {v11, v7, v7}, Log4;->a(Ljava/lang/String;ZZ)Ljava/util/List;

    .line 370
    .line 371
    .line 372
    move-result-object v1

    .line 373
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 374
    .line 375
    .line 376
    move-result v2

    .line 377
    if-eqz v2, :cond_1a

    .line 378
    .line 379
    const/4 v10, 0x0

    .line 380
    goto :goto_10

    .line 381
    :cond_1a
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v1

    .line 385
    move-object v10, v1

    .line 386
    check-cast v10, Lbg4;

    .line 387
    .line 388
    :goto_10
    if-eqz v10, :cond_1b

    .line 389
    .line 390
    invoke-static {v10}, Lxm3;->i(Ljava/lang/Object;)Lsn3;

    .line 391
    .line 392
    .line 393
    move-result-object v1

    .line 394
    goto :goto_13

    .line 395
    :cond_1b
    :goto_11
    move-object/from16 v1, p1

    .line 396
    .line 397
    goto :goto_12

    .line 398
    :cond_1c
    const/4 v7, 0x0

    .line 399
    goto :goto_11

    .line 400
    :goto_12
    invoke-static {v1, v0, v7, v7}, Log4;->b(Lhd4;Lph4;ZZ)Lsn3;

    .line 401
    .line 402
    .line 403
    move-result-object v1

    .line 404
    :goto_13
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 405
    .line 406
    .line 407
    move-result v2

    .line 408
    if-eqz v2, :cond_1d

    .line 409
    .line 410
    goto :goto_e

    .line 411
    :cond_1d
    if-nez v9, :cond_1e

    .line 412
    .line 413
    move v8, v3

    .line 414
    :goto_14
    const/16 v0, 0x80

    .line 415
    .line 416
    goto :goto_1b

    .line 417
    :cond_1e
    invoke-virtual {v1, v7}, Lsn3;->get(I)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v2

    .line 421
    check-cast v2, Lbg4;

    .line 422
    .line 423
    invoke-virtual {v2, v0}, Lbg4;->b(Lph4;)Z

    .line 424
    .line 425
    .line 426
    move-result v3

    .line 427
    if-nez v3, :cond_20

    .line 428
    .line 429
    const/4 v4, 0x1

    .line 430
    :goto_15
    iget v5, v1, Lsn3;->i:I

    .line 431
    .line 432
    if-ge v4, v5, :cond_20

    .line 433
    .line 434
    invoke-virtual {v1, v4}, Lsn3;->get(I)Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    move-result-object v5

    .line 438
    check-cast v5, Lbg4;

    .line 439
    .line 440
    invoke-virtual {v5, v0}, Lbg4;->b(Lph4;)Z

    .line 441
    .line 442
    .line 443
    move-result v8

    .line 444
    if-eqz v8, :cond_1f

    .line 445
    .line 446
    move-object v2, v5

    .line 447
    move v1, v7

    .line 448
    const/4 v3, 0x1

    .line 449
    :goto_16
    const/4 v4, 0x1

    .line 450
    goto :goto_17

    .line 451
    :cond_1f
    add-int/lit8 v4, v4, 0x1

    .line 452
    .line 453
    goto :goto_15

    .line 454
    :cond_20
    const/4 v1, 0x1

    .line 455
    goto :goto_16

    .line 456
    :goto_17
    if-eq v4, v3, :cond_21

    .line 457
    .line 458
    const/4 v4, 0x3

    .line 459
    goto :goto_18

    .line 460
    :cond_21
    const/4 v4, 0x4

    .line 461
    :goto_18
    const/16 v5, 0x8

    .line 462
    .line 463
    if-eqz v3, :cond_22

    .line 464
    .line 465
    invoke-virtual {v2, v0}, Lbg4;->c(Lph4;)Z

    .line 466
    .line 467
    .line 468
    move-result v0

    .line 469
    if-eqz v0, :cond_22

    .line 470
    .line 471
    const/16 v5, 0x10

    .line 472
    .line 473
    :cond_22
    iget-boolean v0, v2, Lbg4;->g:Z

    .line 474
    .line 475
    const/4 v2, 0x1

    .line 476
    if-eq v2, v0, :cond_23

    .line 477
    .line 478
    move v0, v7

    .line 479
    goto :goto_19

    .line 480
    :cond_23
    const/16 v0, 0x40

    .line 481
    .line 482
    :goto_19
    if-eq v2, v1, :cond_24

    .line 483
    .line 484
    move/from16 v17, v7

    .line 485
    .line 486
    goto :goto_1a

    .line 487
    :cond_24
    const/16 v17, 0x80

    .line 488
    .line 489
    :goto_1a
    or-int v1, v4, v5

    .line 490
    .line 491
    or-int/2addr v1, v12

    .line 492
    or-int/2addr v0, v1

    .line 493
    or-int v0, v0, v17

    .line 494
    .line 495
    or-int/2addr v0, v6

    .line 496
    return v0

    .line 497
    :cond_25
    const/4 v2, 0x1

    .line 498
    move v8, v2

    .line 499
    goto :goto_14

    .line 500
    :goto_1b
    or-int/2addr v0, v8

    .line 501
    return v0
.end method

.method public final M(Lhd4;Lph4;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    iget-object v0, p2, Lph4;->m:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object p1, Lsn3;->j:Lsn3;

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-object v0, p0, Lef4;->B0:Ldf4;

    .line 9
    .line 10
    invoke-virtual {v0, p2}, Ldf4;->o(Lph4;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    const-string v0, "audio/raw"

    .line 18
    .line 19
    invoke-static {v0, v1, v1}, Log4;->a(Ljava/lang/String;ZZ)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lbg4;

    .line 36
    .line 37
    :goto_0
    if-eqz v0, :cond_2

    .line 38
    .line 39
    invoke-static {v0}, Lxm3;->i(Ljava/lang/Object;)Lsn3;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    invoke-static {p1, p2, v1, v1}, Log4;->b(Lhd4;Lph4;ZZ)Lsn3;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    :goto_1
    sget-object v0, Log4;->a:Ljava/util/HashMap;

    .line 49
    .line 50
    new-instance v0, Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 53
    .line 54
    .line 55
    new-instance p1, Lld4;

    .line 56
    .line 57
    invoke-direct {p1, p2}, Lld4;-><init>(Lph4;)V

    .line 58
    .line 59
    .line 60
    new-instance p2, Lsb3;

    .line 61
    .line 62
    const/4 v1, 0x1

    .line 63
    invoke-direct {p2, v1, p1}, Lsb3;-><init>(ILjava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-static {v0, p2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 67
    .line 68
    .line 69
    return-object v0
.end method

.method public final N(Lph4;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkg4;->l()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lef4;->B0:Ldf4;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ldf4;->o(Lph4;)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    return p1

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    return p1
.end method

.method public final O(Lbg4;Lph4;F)Lg4;
    .locals 13

    .line 1
    move-object v3, p2

    .line 2
    move/from16 v0, p3

    .line 3
    .line 4
    iget-object v2, p0, Lkg4;->o:[Lph4;

    .line 5
    .line 6
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    array-length v4, v2

    .line 10
    iget-object v5, p1, Lbg4;->a:Ljava/lang/String;

    .line 11
    .line 12
    const-string v6, "OMX.google.raw.decoder"

    .line 13
    .line 14
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    iget v7, v3, Lph4;->n:I

    .line 18
    .line 19
    const/4 v8, 0x0

    .line 20
    const/4 v9, 0x1

    .line 21
    if-ne v4, v9, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    move v10, v8

    .line 25
    :goto_0
    if-ge v10, v4, :cond_2

    .line 26
    .line 27
    aget-object v11, v2, v10

    .line 28
    .line 29
    invoke-virtual {p1, p2, v11}, Lbg4;->d(Lph4;Lph4;)Lw34;

    .line 30
    .line 31
    .line 32
    move-result-object v12

    .line 33
    iget v12, v12, Lw34;->d:I

    .line 34
    .line 35
    if-eqz v12, :cond_1

    .line 36
    .line 37
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    iget v11, v11, Lph4;->n:I

    .line 41
    .line 42
    invoke-static {v7, v11}, Ljava/lang/Math;->max(II)I

    .line 43
    .line 44
    .line 45
    move-result v7

    .line 46
    :cond_1
    add-int/lit8 v10, v10, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    :goto_1
    iput v7, p0, Lef4;->D0:I

    .line 50
    .line 51
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 52
    .line 53
    const-string v4, "OMX.google.opus.decoder"

    .line 54
    .line 55
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-nez v4, :cond_3

    .line 60
    .line 61
    const-string v4, "c2.android.opus.decoder"

    .line 62
    .line 63
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-nez v4, :cond_3

    .line 68
    .line 69
    const-string v4, "OMX.google.vorbis.decoder"

    .line 70
    .line 71
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-nez v4, :cond_3

    .line 76
    .line 77
    const-string v4, "c2.android.vorbis.decoder"

    .line 78
    .line 79
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    if-eqz v4, :cond_4

    .line 84
    .line 85
    :cond_3
    move v4, v9

    .line 86
    goto :goto_2

    .line 87
    :cond_4
    move v4, v8

    .line 88
    :goto_2
    iput-boolean v4, p0, Lef4;->E0:Z

    .line 89
    .line 90
    iget-object v4, p1, Lbg4;->c:Ljava/lang/String;

    .line 91
    .line 92
    iget v5, p0, Lef4;->D0:I

    .line 93
    .line 94
    new-instance v6, Landroid/media/MediaFormat;

    .line 95
    .line 96
    invoke-direct {v6}, Landroid/media/MediaFormat;-><init>()V

    .line 97
    .line 98
    .line 99
    const-string v7, "mime"

    .line 100
    .line 101
    invoke-virtual {v6, v7, v4}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    iget v4, v3, Lph4;->E:I

    .line 105
    .line 106
    const-string v7, "channel-count"

    .line 107
    .line 108
    invoke-virtual {v6, v7, v4}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 109
    .line 110
    .line 111
    iget v7, v3, Lph4;->F:I

    .line 112
    .line 113
    const-string v10, "sample-rate"

    .line 114
    .line 115
    invoke-virtual {v6, v10, v7}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 116
    .line 117
    .line 118
    iget-object v10, v3, Lph4;->p:Ljava/util/List;

    .line 119
    .line 120
    invoke-static {v6, v10}, Lgi2;->F(Landroid/media/MediaFormat;Ljava/util/List;)V

    .line 121
    .line 122
    .line 123
    const-string v10, "max-input-size"

    .line 124
    .line 125
    invoke-static {v6, v10, v5}, Lgi2;->K(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    .line 126
    .line 127
    .line 128
    const-string v5, "priority"

    .line 129
    .line 130
    invoke-virtual {v6, v5, v8}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 131
    .line 132
    .line 133
    const/high16 v5, -0x40800000    # -1.0f

    .line 134
    .line 135
    cmpl-float v5, v0, v5

    .line 136
    .line 137
    if-eqz v5, :cond_5

    .line 138
    .line 139
    const-string v5, "operating-rate"

    .line 140
    .line 141
    invoke-virtual {v6, v5, v0}, Landroid/media/MediaFormat;->setFloat(Ljava/lang/String;F)V

    .line 142
    .line 143
    .line 144
    :cond_5
    iget-object v0, v3, Lph4;->m:Ljava/lang/String;

    .line 145
    .line 146
    const-string v5, "audio/ac4"

    .line 147
    .line 148
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v5

    .line 152
    if-eqz v5, :cond_7

    .line 153
    .line 154
    invoke-static {p2}, Lmo2;->b(Lph4;)Landroid/util/Pair;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    if-eqz v5, :cond_6

    .line 159
    .line 160
    iget-object v10, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v10, Ljava/lang/Integer;

    .line 163
    .line 164
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 165
    .line 166
    .line 167
    move-result v10

    .line 168
    const-string v11, "profile"

    .line 169
    .line 170
    invoke-static {v6, v11, v10}, Lgi2;->K(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    .line 171
    .line 172
    .line 173
    iget-object v5, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v5, Ljava/lang/Integer;

    .line 176
    .line 177
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 178
    .line 179
    .line 180
    move-result v5

    .line 181
    const-string v10, "level"

    .line 182
    .line 183
    invoke-static {v6, v10, v5}, Lgi2;->K(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    .line 184
    .line 185
    .line 186
    :cond_6
    const/16 v5, 0x1c

    .line 187
    .line 188
    if-gt v2, v5, :cond_7

    .line 189
    .line 190
    const-string v5, "ac4-is-sync"

    .line 191
    .line 192
    invoke-virtual {v6, v5, v9}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 193
    .line 194
    .line 195
    :cond_7
    new-instance v5, Lgg4;

    .line 196
    .line 197
    invoke-direct {v5}, Lgg4;-><init>()V

    .line 198
    .line 199
    .line 200
    const-string v9, "audio/raw"

    .line 201
    .line 202
    invoke-virtual {v5, v9}, Lgg4;->e(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    iput v4, v5, Lgg4;->D:I

    .line 206
    .line 207
    iput v7, v5, Lgg4;->E:I

    .line 208
    .line 209
    const/4 v4, 0x4

    .line 210
    iput v4, v5, Lgg4;->F:I

    .line 211
    .line 212
    new-instance v7, Lph4;

    .line 213
    .line 214
    invoke-direct {v7, v5}, Lph4;-><init>(Lgg4;)V

    .line 215
    .line 216
    .line 217
    iget-object v5, p0, Lef4;->B0:Ldf4;

    .line 218
    .line 219
    invoke-virtual {v5, v7}, Ldf4;->o(Lph4;)I

    .line 220
    .line 221
    .line 222
    move-result v5

    .line 223
    const/4 v7, 0x2

    .line 224
    if-ne v5, v7, :cond_8

    .line 225
    .line 226
    const-string v5, "pcm-encoding"

    .line 227
    .line 228
    invoke-virtual {v6, v5, v4}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 229
    .line 230
    .line 231
    :cond_8
    const/16 v4, 0x20

    .line 232
    .line 233
    if-lt v2, v4, :cond_9

    .line 234
    .line 235
    const-string v4, "max-output-channel-count"

    .line 236
    .line 237
    const/16 v5, 0x63

    .line 238
    .line 239
    invoke-virtual {v6, v4, v5}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 240
    .line 241
    .line 242
    :cond_9
    const/16 v4, 0x23

    .line 243
    .line 244
    if-lt v2, v4, :cond_a

    .line 245
    .line 246
    iget v2, p0, Lef4;->L0:I

    .line 247
    .line 248
    neg-int v2, v2

    .line 249
    invoke-static {v8, v2}, Ljava/lang/Math;->max(II)I

    .line 250
    .line 251
    .line 252
    move-result v2

    .line 253
    const-string v4, "importance"

    .line 254
    .line 255
    invoke-virtual {v6, v4, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 256
    .line 257
    .line 258
    :cond_a
    iget-object v2, p1, Lbg4;->b:Ljava/lang/String;

    .line 259
    .line 260
    invoke-virtual {v9, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-result v2

    .line 264
    const/4 v4, 0x0

    .line 265
    if-eqz v2, :cond_b

    .line 266
    .line 267
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    if-nez v0, :cond_b

    .line 272
    .line 273
    move-object v4, v3

    .line 274
    :cond_b
    iput-object v4, p0, Lef4;->G0:Lph4;

    .line 275
    .line 276
    new-instance v0, Lg4;

    .line 277
    .line 278
    const/4 v4, 0x0

    .line 279
    move-object v2, v6

    .line 280
    const/16 v6, 0x13

    .line 281
    .line 282
    iget-object v5, p0, Lef4;->C0:Lwt2;

    .line 283
    .line 284
    move-object v1, p1

    .line 285
    invoke-direct/range {v0 .. v6}, Lg4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 286
    .line 287
    .line 288
    return-object v0
.end method

.method public final P(Lbg4;Lph4;Lph4;)Lw34;
    .locals 8

    .line 1
    invoke-virtual {p1, p2, p3}, Lbg4;->d(Lph4;Lph4;)Lw34;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, v0, Lw34;->e:I

    .line 6
    .line 7
    iget-object v2, p0, Lkg4;->K:Lci3;

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p3}, Lef4;->N(Lph4;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    const v2, 0x8000

    .line 18
    .line 19
    .line 20
    or-int/2addr v1, v2

    .line 21
    :cond_0
    const-string v2, "OMX.google.raw.decoder"

    .line 22
    .line 23
    iget-object v3, p1, Lbg4;->a:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    iget v2, p3, Lph4;->n:I

    .line 29
    .line 30
    iget v3, p0, Lef4;->D0:I

    .line 31
    .line 32
    if-le v2, v3, :cond_1

    .line 33
    .line 34
    or-int/lit8 v1, v1, 0x40

    .line 35
    .line 36
    :cond_1
    iget-object v3, p1, Lbg4;->a:Ljava/lang/String;

    .line 37
    .line 38
    new-instance v2, Lw34;

    .line 39
    .line 40
    const/4 p1, 0x0

    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    move v6, p1

    .line 44
    move v7, v1

    .line 45
    :goto_0
    move-object v4, p2

    .line 46
    move-object v5, p3

    .line 47
    goto :goto_1

    .line 48
    :cond_2
    iget v0, v0, Lw34;->d:I

    .line 49
    .line 50
    move v7, p1

    .line 51
    move v6, v0

    .line 52
    goto :goto_0

    .line 53
    :goto_1
    invoke-direct/range {v2 .. v7}, Lw34;-><init>(Ljava/lang/String;Lph4;Lph4;II)V

    .line 54
    .line 55
    .line 56
    return-object v2
.end method

.method public final Q(JJ)J
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lef4;->B0:Ldf4;

    .line 4
    .line 5
    invoke-virtual {v1}, Ldf4;->s()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x1

    .line 10
    const/4 v4, 0x0

    .line 11
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    iget-wide v7, v0, Lef4;->N0:J

    .line 19
    .line 20
    cmp-long v2, v7, v5

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    move v2, v3

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v2, v4

    .line 27
    :goto_0
    iget-boolean v7, v0, Lef4;->M0:Z

    .line 28
    .line 29
    const-wide/16 v8, 0x2710

    .line 30
    .line 31
    if-nez v7, :cond_2

    .line 32
    .line 33
    if-nez v2, :cond_1

    .line 34
    .line 35
    iget-boolean v1, v0, Lkg4;->r0:Z

    .line 36
    .line 37
    if-eqz v1, :cond_8

    .line 38
    .line 39
    :cond_1
    const-wide/32 v1, 0xf4240

    .line 40
    .line 41
    .line 42
    return-wide v1

    .line 43
    :cond_2
    invoke-virtual {v1}, Ldf4;->h()Z

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    if-nez v7, :cond_3

    .line 48
    .line 49
    move-wide v3, v5

    .line 50
    goto :goto_2

    .line 51
    :cond_3
    iget-object v7, v1, Ldf4;->p:Lse4;

    .line 52
    .line 53
    iget v10, v7, Lse4;->c:I

    .line 54
    .line 55
    if-nez v10, :cond_4

    .line 56
    .line 57
    iget-object v3, v1, Ldf4;->r:Landroid/media/AudioTrack;

    .line 58
    .line 59
    invoke-virtual {v3}, Landroid/media/AudioTrack;->getBufferSizeInFrames()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    int-to-long v3, v3

    .line 64
    iget v7, v7, Lse4;->e:I

    .line 65
    .line 66
    invoke-static {v7, v3, v4}, Lv23;->s(IJ)J

    .line 67
    .line 68
    .line 69
    move-result-wide v3

    .line 70
    goto :goto_2

    .line 71
    :cond_4
    iget-object v7, v1, Ldf4;->r:Landroid/media/AudioTrack;

    .line 72
    .line 73
    invoke-virtual {v7}, Landroid/media/AudioTrack;->getBufferSizeInFrames()I

    .line 74
    .line 75
    .line 76
    move-result v7

    .line 77
    int-to-long v10, v7

    .line 78
    iget-object v7, v1, Ldf4;->p:Lse4;

    .line 79
    .line 80
    iget v7, v7, Lse4;->g:I

    .line 81
    .line 82
    invoke-static {v7}, Lqb1;->M(I)I

    .line 83
    .line 84
    .line 85
    move-result v7

    .line 86
    const v12, -0x7fffffff

    .line 87
    .line 88
    .line 89
    if-eq v7, v12, :cond_5

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_5
    move v3, v4

    .line 93
    :goto_1
    invoke-static {v3}, Lzt0;->b0(Z)V

    .line 94
    .line 95
    .line 96
    int-to-long v14, v7

    .line 97
    sget-object v16, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 98
    .line 99
    const-wide/32 v12, 0xf4240

    .line 100
    .line 101
    .line 102
    invoke-static/range {v10 .. v16}, Lv23;->t(JJJLjava/math/RoundingMode;)J

    .line 103
    .line 104
    .line 105
    move-result-wide v3

    .line 106
    :goto_2
    if-eqz v2, :cond_8

    .line 107
    .line 108
    cmp-long v2, v3, v5

    .line 109
    .line 110
    if-nez v2, :cond_6

    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_6
    iget-wide v5, v0, Lef4;->N0:J

    .line 114
    .line 115
    sub-long v5, v5, p1

    .line 116
    .line 117
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->min(JJ)J

    .line 118
    .line 119
    .line 120
    move-result-wide v2

    .line 121
    long-to-float v2, v2

    .line 122
    iget-object v1, v1, Ldf4;->y:Lsr1;

    .line 123
    .line 124
    if-eqz v1, :cond_7

    .line 125
    .line 126
    iget v1, v1, Lsr1;->a:F

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_7
    const/high16 v1, 0x3f800000    # 1.0f

    .line 130
    .line 131
    :goto_3
    div-float/2addr v2, v1

    .line 132
    iget-object v1, v0, Lkg4;->l:Lpz;

    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 138
    .line 139
    .line 140
    move-result-wide v3

    .line 141
    invoke-static {v3, v4}, Lv23;->r(J)J

    .line 142
    .line 143
    .line 144
    move-result-wide v3

    .line 145
    sub-long v3, v3, p3

    .line 146
    .line 147
    const/high16 v1, 0x40000000    # 2.0f

    .line 148
    .line 149
    div-float/2addr v2, v1

    .line 150
    float-to-long v1, v2

    .line 151
    sub-long/2addr v1, v3

    .line 152
    invoke-static {v8, v9, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 153
    .line 154
    .line 155
    move-result-wide v1

    .line 156
    return-wide v1

    .line 157
    :cond_8
    :goto_4
    return-wide v8
.end method

.method public final R(FLph4;[Lph4;)F
    .locals 3

    .line 1
    const/4 p2, 0x0

    .line 2
    const/4 v0, -0x1

    .line 3
    move v1, v0

    .line 4
    :goto_0
    array-length v2, p3

    .line 5
    if-ge p2, v2, :cond_1

    .line 6
    .line 7
    aget-object v2, p3, p2

    .line 8
    .line 9
    iget v2, v2, Lph4;->F:I

    .line 10
    .line 11
    if-eq v2, v0, :cond_0

    .line 12
    .line 13
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    :cond_0
    add-int/lit8 p2, p2, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    if-ne v1, v0, :cond_2

    .line 21
    .line 22
    const/high16 p1, -0x40800000    # -1.0f

    .line 23
    .line 24
    return p1

    .line 25
    :cond_2
    int-to-float p2, v1

    .line 26
    mul-float/2addr p2, p1

    .line 27
    return p2
.end method

.method public final S(JJLjava/lang/String;)V
    .locals 8

    .line 1
    iget-object v1, p0, Lef4;->A0:Lwt2;

    .line 2
    .line 3
    iget-object v0, v1, Lwt2;->g:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v7, v0

    .line 6
    check-cast v7, Landroid/os/Handler;

    .line 7
    .line 8
    if-eqz v7, :cond_0

    .line 9
    .line 10
    new-instance v0, Lee4;

    .line 11
    .line 12
    move-wide v3, p1

    .line 13
    move-wide v5, p3

    .line 14
    move-object v2, p5

    .line 15
    invoke-direct/range {v0 .. v6}, Lee4;-><init>(Lwt2;Ljava/lang/String;JJ)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v7, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final T(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lef4;->A0:Lwt2;

    .line 2
    .line 3
    iget-object v1, v0, Lwt2;->g:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Landroid/os/Handler;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    new-instance v2, Lee4;

    .line 10
    .line 11
    const/4 v3, 0x4

    .line 12
    invoke-direct {v2, v0, p1, v3}, Lee4;-><init>(Lwt2;Ljava/lang/Object;I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final U(Ljava/lang/Exception;)V
    .locals 4

    .line 1
    const-string v0, "MediaCodecAudioRenderer"

    .line 2
    .line 3
    const-string v1, "Audio codec error"

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, La30;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lef4;->A0:Lwt2;

    .line 9
    .line 10
    iget-object v1, v0, Lwt2;->g:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Landroid/os/Handler;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    new-instance v2, Lee4;

    .line 17
    .line 18
    const/4 v3, 0x6

    .line 19
    invoke-direct {v2, v0, p1, v3}, Lee4;-><init>(Lwt2;Ljava/lang/Object;I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public final V(Lmr2;)Lw34;
    .locals 5

    .line 1
    iget-object v0, p1, Lmr2;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lph4;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lef4;->F0:Lph4;

    .line 9
    .line 10
    invoke-super {p0, p1}, Lkg4;->V(Lmr2;)Lw34;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object v1, p0, Lef4;->A0:Lwt2;

    .line 15
    .line 16
    iget-object v2, v1, Lwt2;->g:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Landroid/os/Handler;

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    new-instance v3, Lgi;

    .line 23
    .line 24
    const/16 v4, 0x1c

    .line 25
    .line 26
    invoke-direct {v3, v1, v0, p1, v4}, Lgi;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 30
    .line 31
    .line 32
    :cond_0
    return-object p1
.end method

.method public final W(Lph4;Landroid/media/MediaFormat;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lef4;->G0:Lph4;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object p1, v0

    .line 9
    goto/16 :goto_1

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lkg4;->P:Lzf4;

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    goto/16 :goto_1

    .line 16
    .line 17
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object v0, p1, Lph4;->m:Ljava/lang/String;

    .line 21
    .line 22
    const-string v4, "audio/raw"

    .line 23
    .line 24
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const/4 v5, 0x2

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    iget v0, p1, Lph4;->G:I

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    const-string v0, "pcm-encoding"

    .line 35
    .line 36
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    if-eqz v6, :cond_3

    .line 41
    .line 42
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    goto :goto_0

    .line 47
    :cond_3
    const-string v0, "v-bits-per-sample"

    .line 48
    .line 49
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    if-eqz v6, :cond_4

    .line 54
    .line 55
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    sget-object v6, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 60
    .line 61
    invoke-static {v0, v6}, Lv23;->y(ILjava/nio/ByteOrder;)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    goto :goto_0

    .line 66
    :cond_4
    move v0, v5

    .line 67
    :goto_0
    new-instance v6, Lgg4;

    .line 68
    .line 69
    invoke-direct {v6}, Lgg4;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v6, v4}, Lgg4;->e(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    iput v0, v6, Lgg4;->F:I

    .line 76
    .line 77
    iget v0, p1, Lph4;->H:I

    .line 78
    .line 79
    iput v0, v6, Lgg4;->G:I

    .line 80
    .line 81
    iget v0, p1, Lph4;->I:I

    .line 82
    .line 83
    iput v0, v6, Lgg4;->H:I

    .line 84
    .line 85
    iget-object v0, p1, Lph4;->k:Lwn1;

    .line 86
    .line 87
    iput-object v0, v6, Lgg4;->j:Lwn1;

    .line 88
    .line 89
    iget-object v0, p1, Lph4;->a:Ljava/lang/String;

    .line 90
    .line 91
    iput-object v0, v6, Lgg4;->a:Ljava/lang/String;

    .line 92
    .line 93
    iget-object v0, p1, Lph4;->b:Ljava/lang/String;

    .line 94
    .line 95
    iput-object v0, v6, Lgg4;->b:Ljava/lang/String;

    .line 96
    .line 97
    iget-object v0, p1, Lph4;->c:Lxm3;

    .line 98
    .line 99
    invoke-static {v0}, Lxm3;->m(Ljava/util/Collection;)Lxm3;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    iput-object v0, v6, Lgg4;->c:Lxm3;

    .line 104
    .line 105
    iget-object v0, p1, Lph4;->d:Ljava/lang/String;

    .line 106
    .line 107
    iput-object v0, v6, Lgg4;->d:Ljava/lang/String;

    .line 108
    .line 109
    iget v0, p1, Lph4;->e:I

    .line 110
    .line 111
    iput v0, v6, Lgg4;->e:I

    .line 112
    .line 113
    iget p1, p1, Lph4;->f:I

    .line 114
    .line 115
    iput p1, v6, Lgg4;->f:I

    .line 116
    .line 117
    const-string p1, "channel-count"

    .line 118
    .line 119
    invoke-virtual {p2, p1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    iput p1, v6, Lgg4;->D:I

    .line 124
    .line 125
    const-string p1, "sample-rate"

    .line 126
    .line 127
    invoke-virtual {p2, p1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    iput p1, v6, Lgg4;->E:I

    .line 132
    .line 133
    new-instance p1, Lph4;

    .line 134
    .line 135
    invoke-direct {p1, v6}, Lph4;-><init>(Lgg4;)V

    .line 136
    .line 137
    .line 138
    iget-boolean p2, p0, Lef4;->E0:Z

    .line 139
    .line 140
    if-eqz p2, :cond_a

    .line 141
    .line 142
    const/4 p2, 0x3

    .line 143
    iget v0, p1, Lph4;->E:I

    .line 144
    .line 145
    if-eq v0, p2, :cond_9

    .line 146
    .line 147
    const/4 v4, 0x4

    .line 148
    const/4 v6, 0x5

    .line 149
    if-eq v0, v6, :cond_8

    .line 150
    .line 151
    const/4 v7, 0x6

    .line 152
    if-eq v0, v7, :cond_7

    .line 153
    .line 154
    const/4 v8, 0x7

    .line 155
    if-eq v0, v8, :cond_6

    .line 156
    .line 157
    const/16 v9, 0x8

    .line 158
    .line 159
    if-eq v0, v9, :cond_5

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_5
    new-array v1, v9, [I

    .line 163
    .line 164
    aput v3, v1, v3

    .line 165
    .line 166
    aput v5, v1, v2

    .line 167
    .line 168
    aput v2, v1, v5

    .line 169
    .line 170
    aput v8, v1, p2

    .line 171
    .line 172
    aput v6, v1, v4

    .line 173
    .line 174
    aput v7, v1, v6

    .line 175
    .line 176
    aput p2, v1, v7

    .line 177
    .line 178
    aput v4, v1, v8

    .line 179
    .line 180
    goto :goto_1

    .line 181
    :cond_6
    new-array v1, v8, [I

    .line 182
    .line 183
    aput v3, v1, v3

    .line 184
    .line 185
    aput v5, v1, v2

    .line 186
    .line 187
    aput v2, v1, v5

    .line 188
    .line 189
    aput v7, v1, p2

    .line 190
    .line 191
    aput v6, v1, v4

    .line 192
    .line 193
    aput p2, v1, v6

    .line 194
    .line 195
    aput v4, v1, v7

    .line 196
    .line 197
    goto :goto_1

    .line 198
    :cond_7
    new-array v1, v7, [I

    .line 199
    .line 200
    aput v3, v1, v3

    .line 201
    .line 202
    aput v5, v1, v2

    .line 203
    .line 204
    aput v2, v1, v5

    .line 205
    .line 206
    aput v6, v1, p2

    .line 207
    .line 208
    aput p2, v1, v4

    .line 209
    .line 210
    aput v4, v1, v6

    .line 211
    .line 212
    goto :goto_1

    .line 213
    :cond_8
    new-array v1, v6, [I

    .line 214
    .line 215
    aput v3, v1, v3

    .line 216
    .line 217
    aput v5, v1, v2

    .line 218
    .line 219
    aput v2, v1, v5

    .line 220
    .line 221
    aput p2, v1, p2

    .line 222
    .line 223
    aput v4, v1, v4

    .line 224
    .line 225
    goto :goto_1

    .line 226
    :cond_9
    new-array v1, p2, [I

    .line 227
    .line 228
    aput v3, v1, v3

    .line 229
    .line 230
    aput v5, v1, v2

    .line 231
    .line 232
    aput v2, v1, v5

    .line 233
    .line 234
    :cond_a
    :goto_1
    :try_start_0
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 235
    .line 236
    const/16 v0, 0x1d

    .line 237
    .line 238
    if-lt p2, v0, :cond_d

    .line 239
    .line 240
    iget-boolean v4, p0, Lkg4;->f0:Z

    .line 241
    .line 242
    if-eqz v4, :cond_b

    .line 243
    .line 244
    invoke-virtual {p0}, Lkg4;->l()V

    .line 245
    .line 246
    .line 247
    goto :goto_2

    .line 248
    :catch_0
    move-exception p1

    .line 249
    goto :goto_4

    .line 250
    :cond_b
    :goto_2
    if-lt p2, v0, :cond_c

    .line 251
    .line 252
    goto :goto_3

    .line 253
    :cond_c
    move v2, v3

    .line 254
    :goto_3
    invoke-static {v2}, Lzt0;->b0(Z)V

    .line 255
    .line 256
    .line 257
    :cond_d
    iget-object p2, p0, Lef4;->B0:Ldf4;

    .line 258
    .line 259
    invoke-virtual {p2, p1, v1}, Ldf4;->p(Lph4;[I)V
    :try_end_0
    .catch Lme4; {:try_start_0 .. :try_end_0} :catch_0

    .line 260
    .line 261
    .line 262
    return-void

    .line 263
    :goto_4
    iget-object p2, p1, Lme4;->f:Lph4;

    .line 264
    .line 265
    const/16 v0, 0x1389

    .line 266
    .line 267
    invoke-virtual {p0, p1, p2, v3, v0}, Lkg4;->m(Ljava/lang/Exception;Lph4;ZI)Lb84;

    .line 268
    .line 269
    .line 270
    move-result-object p1

    .line 271
    throw p1
.end method

.method public final X()V
    .locals 2

    .line 1
    iget-object v0, p0, Lef4;->B0:Ldf4;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, v0, Ldf4;->F:Z

    .line 5
    .line 6
    return-void
.end method

.method public final Y(JJLzf4;Ljava/nio/ByteBuffer;IIIJZZLph4;)Z
    .locals 0

    .line 1
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    iput-wide p1, p0, Lef4;->N0:J

    .line 10
    .line 11
    iget-object p1, p0, Lef4;->G0:Lph4;

    .line 12
    .line 13
    const/4 p2, 0x1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    and-int/lit8 p1, p8, 0x2

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-interface {p5, p7}, Lzf4;->I(I)V

    .line 24
    .line 25
    .line 26
    return p2

    .line 27
    :cond_0
    iget-object p1, p0, Lef4;->B0:Ldf4;

    .line 28
    .line 29
    if-eqz p12, :cond_2

    .line 30
    .line 31
    if-eqz p5, :cond_1

    .line 32
    .line 33
    invoke-interface {p5, p7}, Lzf4;->I(I)V

    .line 34
    .line 35
    .line 36
    :cond_1
    iget-object p3, p0, Lkg4;->t0:Ln34;

    .line 37
    .line 38
    iget p4, p3, Ln34;->f:I

    .line 39
    .line 40
    add-int/2addr p4, p9

    .line 41
    iput p4, p3, Ln34;->f:I

    .line 42
    .line 43
    iput-boolean p2, p1, Ldf4;->F:Z

    .line 44
    .line 45
    return p2

    .line 46
    :cond_2
    :try_start_0
    invoke-virtual {p1, p6, p10, p11, p9}, Ldf4;->r(Ljava/nio/ByteBuffer;JI)Z

    .line 47
    .line 48
    .line 49
    move-result p1
    :try_end_0
    .catch Lne4; {:try_start_0 .. :try_end_0} :catch_1
    .catch Loe4; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    if-eqz p1, :cond_4

    .line 51
    .line 52
    if-eqz p5, :cond_3

    .line 53
    .line 54
    invoke-interface {p5, p7}, Lzf4;->I(I)V

    .line 55
    .line 56
    .line 57
    :cond_3
    iget-object p1, p0, Lkg4;->t0:Ln34;

    .line 58
    .line 59
    iget p3, p1, Ln34;->e:I

    .line 60
    .line 61
    add-int/2addr p3, p9

    .line 62
    iput p3, p1, Ln34;->e:I

    .line 63
    .line 64
    return p2

    .line 65
    :cond_4
    iput-wide p10, p0, Lef4;->N0:J

    .line 66
    .line 67
    const/4 p1, 0x0

    .line 68
    return p1

    .line 69
    :catch_0
    move-exception p1

    .line 70
    iget-boolean p2, p0, Lkg4;->f0:Z

    .line 71
    .line 72
    if-nez p2, :cond_5

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_5
    invoke-virtual {p0}, Lkg4;->l()V

    .line 76
    .line 77
    .line 78
    :goto_0
    iget-boolean p2, p1, Loe4;->g:Z

    .line 79
    .line 80
    const/16 p3, 0x138a

    .line 81
    .line 82
    invoke-virtual {p0, p1, p14, p2, p3}, Lkg4;->m(Ljava/lang/Exception;Lph4;ZI)Lb84;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    throw p1

    .line 87
    :catch_1
    move-exception p1

    .line 88
    iget-object p2, p0, Lef4;->F0:Lph4;

    .line 89
    .line 90
    iget-boolean p3, p0, Lkg4;->f0:Z

    .line 91
    .line 92
    if-eqz p3, :cond_6

    .line 93
    .line 94
    invoke-virtual {p0}, Lkg4;->l()V

    .line 95
    .line 96
    .line 97
    :cond_6
    iget-boolean p3, p1, Lne4;->g:Z

    .line 98
    .line 99
    const/16 p4, 0x1389

    .line 100
    .line 101
    invoke-virtual {p0, p1, p2, p3, p4}, Lkg4;->m(Ljava/lang/Exception;Lph4;ZI)Lb84;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    throw p1
.end method

.method public final Z()V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    :try_start_0
    iget-object v1, p0, Lef4;->B0:Ldf4;

    .line 3
    .line 4
    iget-boolean v2, v1, Ldf4;->M:Z

    .line 5
    .line 6
    if-nez v2, :cond_0

    .line 7
    .line 8
    invoke-virtual {v1}, Ldf4;->h()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {v1}, Ldf4;->d()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {v1}, Ldf4;->m()V

    .line 21
    .line 22
    .line 23
    iput-boolean v0, v1, Ldf4;->M:Z

    .line 24
    .line 25
    :cond_0
    iget-object v1, p0, Lkg4;->u0:Ljg4;

    .line 26
    .line 27
    iget-wide v1, v1, Ljg4;->e:J

    .line 28
    .line 29
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    cmp-long v3, v1, v3

    .line 35
    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    iput-wide v1, p0, Lef4;->N0:J
    :try_end_0
    .catch Loe4; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    .line 40
    return-void

    .line 41
    :catch_0
    move-exception v1

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    return-void

    .line 44
    :goto_0
    iget-boolean v2, p0, Lkg4;->f0:Z

    .line 45
    .line 46
    if-eq v0, v2, :cond_2

    .line 47
    .line 48
    const/16 v0, 0x138a

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    const/16 v0, 0x138b

    .line 52
    .line 53
    :goto_1
    iget-object v2, v1, Loe4;->h:Lph4;

    .line 54
    .line 55
    iget-boolean v3, v1, Loe4;->g:Z

    .line 56
    .line 57
    invoke-virtual {p0, v1, v2, v3, v0}, Lkg4;->m(Ljava/lang/Exception;Lph4;ZI)Lb84;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    throw v0
.end method

.method public final a(ILjava/lang/Object;)V
    .locals 8

    .line 1
    const/4 v0, 0x2

    .line 2
    iget-object v1, p0, Lef4;->B0:Ldf4;

    .line 3
    .line 4
    if-eq p1, v0, :cond_e

    .line 5
    .line 6
    const/4 v0, 0x3

    .line 7
    if-eq p1, v0, :cond_b

    .line 8
    .line 9
    const/4 v0, 0x6

    .line 10
    if-eq p1, v0, :cond_8

    .line 11
    .line 12
    const/16 v0, 0xc

    .line 13
    .line 14
    if-eq p1, v0, :cond_6

    .line 15
    .line 16
    const/16 v0, 0x10

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    const/16 v3, 0x23

    .line 20
    .line 21
    if-eq p1, v0, :cond_5

    .line 22
    .line 23
    const/16 v0, 0x9

    .line 24
    .line 25
    if-eq p1, v0, :cond_3

    .line 26
    .line 27
    const/16 v0, 0xa

    .line 28
    .line 29
    if-eq p1, v0, :cond_0

    .line 30
    .line 31
    const/16 v0, 0xb

    .line 32
    .line 33
    if-ne p1, v0, :cond_f

    .line 34
    .line 35
    check-cast p2, Lza4;

    .line 36
    .line 37
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    iput-object p2, p0, Lkg4;->L:Lza4;

    .line 41
    .line 42
    return-void

    .line 43
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    check-cast p2, Ljava/lang/Integer;

    .line 47
    .line 48
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    iget-boolean p2, v1, Ldf4;->R:Z

    .line 53
    .line 54
    if-eqz p2, :cond_1

    .line 55
    .line 56
    iget p2, v1, Ldf4;->Q:I

    .line 57
    .line 58
    if-ne p2, p1, :cond_2

    .line 59
    .line 60
    iput-boolean v2, v1, Ldf4;->R:Z

    .line 61
    .line 62
    :cond_1
    iget p2, v1, Ldf4;->Q:I

    .line 63
    .line 64
    if-eq p2, p1, :cond_2

    .line 65
    .line 66
    iput p1, v1, Ldf4;->Q:I

    .line 67
    .line 68
    invoke-virtual {v1}, Ldf4;->t()V

    .line 69
    .line 70
    .line 71
    :cond_2
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 72
    .line 73
    if-lt p2, v3, :cond_f

    .line 74
    .line 75
    iget-object p2, p0, Lef4;->C0:Lwt2;

    .line 76
    .line 77
    if-eqz p2, :cond_f

    .line 78
    .line 79
    invoke-virtual {p2, p1}, Lwt2;->d(I)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    check-cast p2, Ljava/lang/Boolean;

    .line 87
    .line 88
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    iput-boolean p1, v1, Ldf4;->z:Z

    .line 93
    .line 94
    iget-object v3, v1, Ldf4;->y:Lsr1;

    .line 95
    .line 96
    new-instance v2, Lue4;

    .line 97
    .line 98
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    move-wide v6, v4

    .line 104
    invoke-direct/range {v2 .. v7}, Lue4;-><init>(Lsr1;JJ)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1}, Ldf4;->h()Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-eqz p1, :cond_4

    .line 112
    .line 113
    iput-object v2, v1, Ldf4;->w:Lue4;

    .line 114
    .line 115
    return-void

    .line 116
    :cond_4
    iput-object v2, v1, Ldf4;->x:Lue4;

    .line 117
    .line 118
    return-void

    .line 119
    :cond_5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    check-cast p2, Ljava/lang/Integer;

    .line 123
    .line 124
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    iput p1, p0, Lef4;->L0:I

    .line 129
    .line 130
    iget-object p1, p0, Lkg4;->P:Lzf4;

    .line 131
    .line 132
    if-eqz p1, :cond_f

    .line 133
    .line 134
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 135
    .line 136
    if-lt p2, v3, :cond_f

    .line 137
    .line 138
    new-instance p2, Landroid/os/Bundle;

    .line 139
    .line 140
    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    .line 141
    .line 142
    .line 143
    iget v0, p0, Lef4;->L0:I

    .line 144
    .line 145
    neg-int v0, v0

    .line 146
    const-string v1, "importance"

    .line 147
    .line 148
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    invoke-virtual {p2, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 153
    .line 154
    .line 155
    invoke-interface {p1, p2}, Lzf4;->c0(Landroid/os/Bundle;)V

    .line 156
    .line 157
    .line 158
    return-void

    .line 159
    :cond_6
    check-cast p2, Landroid/media/AudioDeviceInfo;

    .line 160
    .line 161
    iput-object p2, v1, Ldf4;->T:Landroid/media/AudioDeviceInfo;

    .line 162
    .line 163
    iget-object p1, v1, Ldf4;->t:Lx03;

    .line 164
    .line 165
    if-eqz p1, :cond_7

    .line 166
    .line 167
    invoke-virtual {p1, p2}, Lx03;->a(Landroid/media/AudioDeviceInfo;)V

    .line 168
    .line 169
    .line 170
    :cond_7
    iget-object p1, v1, Ldf4;->r:Landroid/media/AudioTrack;

    .line 171
    .line 172
    if-eqz p1, :cond_f

    .line 173
    .line 174
    iget-object p2, v1, Ldf4;->T:Landroid/media/AudioDeviceInfo;

    .line 175
    .line 176
    invoke-virtual {p1, p2}, Landroid/media/AudioTrack;->setPreferredDevice(Landroid/media/AudioDeviceInfo;)Z

    .line 177
    .line 178
    .line 179
    return-void

    .line 180
    :cond_8
    check-cast p2, Ljx2;

    .line 181
    .line 182
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    iget-object p1, v1, Ldf4;->S:Ljx2;

    .line 186
    .line 187
    invoke-virtual {p1, p2}, Ljx2;->equals(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result p1

    .line 191
    if-eqz p1, :cond_9

    .line 192
    .line 193
    goto :goto_0

    .line 194
    :cond_9
    iget-object p1, v1, Ldf4;->r:Landroid/media/AudioTrack;

    .line 195
    .line 196
    if-eqz p1, :cond_a

    .line 197
    .line 198
    iget-object p1, v1, Ldf4;->S:Ljx2;

    .line 199
    .line 200
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    :cond_a
    iput-object p2, v1, Ldf4;->S:Ljx2;

    .line 204
    .line 205
    return-void

    .line 206
    :cond_b
    check-cast p2, Lin2;

    .line 207
    .line 208
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    iget-object p1, v1, Ldf4;->v:Lin2;

    .line 212
    .line 213
    invoke-virtual {p1, p2}, Lin2;->equals(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result p1

    .line 217
    if-eqz p1, :cond_c

    .line 218
    .line 219
    goto :goto_0

    .line 220
    :cond_c
    iput-object p2, v1, Ldf4;->v:Lin2;

    .line 221
    .line 222
    iget-object p1, v1, Ldf4;->t:Lx03;

    .line 223
    .line 224
    if-eqz p1, :cond_d

    .line 225
    .line 226
    iput-object p2, p1, Lx03;->o:Ljava/lang/Object;

    .line 227
    .line 228
    iget-object v0, p1, Lx03;->n:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v0, Landroid/media/AudioDeviceInfo;

    .line 231
    .line 232
    iget-object v2, p1, Lx03;->g:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v2, Landroid/content/Context;

    .line 235
    .line 236
    invoke-static {v2, p2, v0}, Lae4;->a(Landroid/content/Context;Lin2;Landroid/media/AudioDeviceInfo;)Lae4;

    .line 237
    .line 238
    .line 239
    move-result-object p2

    .line 240
    invoke-virtual {p1, p2}, Lx03;->b(Lae4;)V

    .line 241
    .line 242
    .line 243
    :cond_d
    invoke-virtual {v1}, Ldf4;->t()V

    .line 244
    .line 245
    .line 246
    return-void

    .line 247
    :cond_e
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    check-cast p2, Ljava/lang/Float;

    .line 251
    .line 252
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 253
    .line 254
    .line 255
    move-result p1

    .line 256
    iget p2, v1, Ldf4;->I:F

    .line 257
    .line 258
    cmpl-float p2, p2, p1

    .line 259
    .line 260
    if-eqz p2, :cond_f

    .line 261
    .line 262
    iput p1, v1, Ldf4;->I:F

    .line 263
    .line 264
    invoke-virtual {v1}, Ldf4;->h()Z

    .line 265
    .line 266
    .line 267
    move-result p1

    .line 268
    if-eqz p1, :cond_f

    .line 269
    .line 270
    iget-object p1, v1, Ldf4;->r:Landroid/media/AudioTrack;

    .line 271
    .line 272
    iget p2, v1, Ldf4;->I:F

    .line 273
    .line 274
    invoke-virtual {p1, p2}, Landroid/media/AudioTrack;->setVolume(F)I

    .line 275
    .line 276
    .line 277
    :cond_f
    :goto_0
    return-void
.end method

.method public final a0(Lvw3;)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p1, Lvw3;->c:Lph4;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Lph4;->m:Ljava/lang/String;

    .line 12
    .line 13
    const-string v1, "audio/opus"

    .line 14
    .line 15
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-boolean v0, p0, Lkg4;->f0:Z

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object v0, p1, Lvw3;->h:Ljava/nio/ByteBuffer;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object p1, p1, Lvw3;->c:Lph4;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    const/16 v1, 0x8

    .line 40
    .line 41
    if-ne p1, v1, :cond_0

    .line 42
    .line 43
    sget-object p1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 44
    .line 45
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getLong()J

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Lef4;->B0:Ldf4;

    .line 53
    .line 54
    iget-object p1, p1, Ldf4;->r:Landroid/media/AudioTrack;

    .line 55
    .line 56
    if-eqz p1, :cond_0

    .line 57
    .line 58
    invoke-static {p1}, Ldf4;->l(Landroid/media/AudioTrack;)Z

    .line 59
    .line 60
    .line 61
    :cond_0
    return-void
.end method

.method public final b(Lsr1;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lef4;->B0:Ldf4;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, Lsr1;

    .line 7
    .line 8
    iget v2, p1, Lsr1;->a:F

    .line 9
    .line 10
    sget-object v3, Lv23;->a:Ljava/lang/String;

    .line 11
    .line 12
    const/high16 v3, 0x41000000    # 8.0f

    .line 13
    .line 14
    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const v4, 0x3dcccccd    # 0.1f

    .line 19
    .line 20
    .line 21
    invoke-static {v4, v2}, Ljava/lang/Math;->max(FF)F

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    iget v5, p1, Lsr1;->b:F

    .line 26
    .line 27
    invoke-static {v5, v3}, Ljava/lang/Math;->min(FF)F

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    invoke-static {v4, v3}, Ljava/lang/Math;->max(FF)F

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    invoke-direct {v1, v2, v3}, Lsr1;-><init>(FF)V

    .line 36
    .line 37
    .line 38
    iput-object v1, v0, Ldf4;->y:Lsr1;

    .line 39
    .line 40
    new-instance v4, Lue4;

    .line 41
    .line 42
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    move-wide v8, v6

    .line 48
    move-object v5, p1

    .line 49
    invoke-direct/range {v4 .. v9}, Lue4;-><init>(Lsr1;JJ)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ldf4;->h()Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-eqz p1, :cond_0

    .line 57
    .line 58
    iput-object v4, v0, Ldf4;->w:Lue4;

    .line 59
    .line 60
    return-void

    .line 61
    :cond_0
    iput-object v4, v0, Ldf4;->x:Lue4;

    .line 62
    .line 63
    return-void
.end method

.method public final c(JZZ)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Lkg4;->c(JZZ)V

    .line 2
    .line 3
    .line 4
    iget-object p3, p0, Lef4;->B0:Ldf4;

    .line 5
    .line 6
    invoke-virtual {p3}, Ldf4;->t()V

    .line 7
    .line 8
    .line 9
    iput-wide p1, p0, Lef4;->H0:J

    .line 10
    .line 11
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    iput-wide p1, p0, Lef4;->N0:J

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    iput-boolean p1, p0, Lef4;->K0:Z

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    iput-boolean p1, p0, Lef4;->I0:Z

    .line 23
    .line 24
    return-void
.end method

.method public final d()V
    .locals 1

    .line 1
    iget-object v0, p0, Lef4;->B0:Ldf4;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldf4;->q()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lef4;->M0:Z

    .line 8
    .line 9
    return-void
.end method

.method public final e()J
    .locals 2

    .line 1
    iget v0, p0, Lkg4;->m:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lef4;->r0()V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lef4;->H0:J

    .line 10
    .line 11
    return-wide v0
.end method

.method public final f()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lef4;->K0:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, p0, Lef4;->K0:Z

    .line 5
    .line 6
    return v0
.end method

.method public final g()Lsr1;
    .locals 1

    .line 1
    iget-object v0, p0, Lef4;->B0:Ldf4;

    .line 2
    .line 3
    iget-object v0, v0, Ldf4;->y:Lsr1;

    .line 4
    .line 5
    return-object v0
.end method

.method public final h()V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lef4;->r0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lef4;->M0:Z

    .line 6
    .line 7
    iget-object v1, p0, Lef4;->B0:Ldf4;

    .line 8
    .line 9
    iput-boolean v0, v1, Ldf4;->P:Z

    .line 10
    .line 11
    invoke-virtual {v1}, Ldf4;->h()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_2

    .line 16
    .line 17
    iget-object v2, v1, Ldf4;->g:Lqe4;

    .line 18
    .line 19
    const-wide/16 v3, 0x0

    .line 20
    .line 21
    iput-wide v3, v2, Lqe4;->j:J

    .line 22
    .line 23
    iput v0, v2, Lqe4;->t:I

    .line 24
    .line 25
    iput v0, v2, Lqe4;->s:I

    .line 26
    .line 27
    iput-wide v3, v2, Lqe4;->k:J

    .line 28
    .line 29
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    iput-wide v3, v2, Lqe4;->z:J

    .line 35
    .line 36
    iput-wide v3, v2, Lqe4;->A:J

    .line 37
    .line 38
    iput-boolean v0, v2, Lqe4;->h:Z

    .line 39
    .line 40
    iget-wide v5, v2, Lqe4;->u:J

    .line 41
    .line 42
    cmp-long v3, v5, v3

    .line 43
    .line 44
    if-nez v3, :cond_0

    .line 45
    .line 46
    iget-object v3, v2, Lqe4;->d:Lpe4;

    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3, v0}, Lpe4;->a(I)V

    .line 52
    .line 53
    .line 54
    :cond_0
    invoke-virtual {v2}, Lqe4;->e()J

    .line 55
    .line 56
    .line 57
    move-result-wide v3

    .line 58
    iput-wide v3, v2, Lqe4;->w:J

    .line 59
    .line 60
    iget-boolean v0, v1, Ldf4;->N:Z

    .line 61
    .line 62
    if-eqz v0, :cond_1

    .line 63
    .line 64
    iget-object v0, v1, Ldf4;->r:Landroid/media/AudioTrack;

    .line 65
    .line 66
    invoke-static {v0}, Ldf4;->l(Landroid/media/AudioTrack;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_2

    .line 71
    .line 72
    :cond_1
    iget-object v0, v1, Ldf4;->r:Landroid/media/AudioTrack;

    .line 73
    .line 74
    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V

    .line 75
    .line 76
    .line 77
    :cond_2
    return-void
.end method

.method public final i()V
    .locals 6

    .line 1
    iget-object v0, p0, Lef4;->A0:Lwt2;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, p0, Lef4;->J0:Z

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput-object v1, p0, Lef4;->F0:Lph4;

    .line 8
    .line 9
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    iput-wide v1, p0, Lef4;->N0:J

    .line 15
    .line 16
    :try_start_0
    iget-object v1, p0, Lef4;->B0:Ldf4;

    .line 17
    .line 18
    invoke-virtual {v1}, Ldf4;->t()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 19
    .line 20
    .line 21
    :try_start_1
    invoke-super {p0}, Lkg4;->i()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lkg4;->t0:Ln34;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    monitor-enter v1

    .line 30
    monitor-exit v1

    .line 31
    iget-object v2, v0, Lwt2;->g:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v2, Landroid/os/Handler;

    .line 34
    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    new-instance v3, Lsz2;

    .line 38
    .line 39
    const/16 v4, 0x1d

    .line 40
    .line 41
    invoke-direct {v3, v0, v1, v4}, Lsz2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 45
    .line 46
    .line 47
    :cond_0
    return-void

    .line 48
    :catchall_0
    move-exception v1

    .line 49
    goto :goto_0

    .line 50
    :catchall_1
    move-exception v1

    .line 51
    :try_start_2
    invoke-super {p0}, Lkg4;->i()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 52
    .line 53
    .line 54
    iget-object v2, p0, Lkg4;->t0:Ln34;

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    monitor-enter v2

    .line 60
    monitor-exit v2

    .line 61
    iget-object v3, v0, Lwt2;->g:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v3, Landroid/os/Handler;

    .line 64
    .line 65
    if-eqz v3, :cond_1

    .line 66
    .line 67
    new-instance v4, Lsz2;

    .line 68
    .line 69
    const/16 v5, 0x1d

    .line 70
    .line 71
    invoke-direct {v4, v0, v2, v5}, Lsz2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 75
    .line 76
    .line 77
    :cond_1
    throw v1

    .line 78
    :goto_0
    iget-object v2, p0, Lkg4;->t0:Ln34;

    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    monitor-enter v2

    .line 84
    monitor-exit v2

    .line 85
    iget-object v3, v0, Lwt2;->g:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v3, Landroid/os/Handler;

    .line 88
    .line 89
    if-eqz v3, :cond_2

    .line 90
    .line 91
    new-instance v4, Lsz2;

    .line 92
    .line 93
    const/16 v5, 0x1d

    .line 94
    .line 95
    invoke-direct {v4, v0, v2, v5}, Lsz2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 99
    .line 100
    .line 101
    :cond_2
    throw v1
.end method

.method public final j()V
    .locals 4

    .line 1
    iget-object v0, p0, Lef4;->B0:Ldf4;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, p0, Lef4;->K0:Z

    .line 5
    .line 6
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    iput-wide v2, p0, Lef4;->N0:J

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    :try_start_0
    iput-boolean v1, p0, Lkg4;->f0:Z

    .line 15
    .line 16
    invoke-virtual {p0}, Lkg4;->b0()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lkg4;->x()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 20
    .line 21
    .line 22
    :try_start_1
    iput-object v2, p0, Lkg4;->K:Lci3;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    .line 24
    iget-boolean v2, p0, Lef4;->J0:Z

    .line 25
    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    iput-boolean v1, p0, Lef4;->J0:Z

    .line 29
    .line 30
    invoke-virtual {v0}, Ldf4;->a()V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void

    .line 34
    :catchall_0
    move-exception v2

    .line 35
    goto :goto_0

    .line 36
    :catchall_1
    move-exception v3

    .line 37
    :try_start_2
    iput-object v2, p0, Lkg4;->K:Lci3;

    .line 38
    .line 39
    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 40
    :goto_0
    iget-boolean v3, p0, Lef4;->J0:Z

    .line 41
    .line 42
    if-nez v3, :cond_1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    iput-boolean v1, p0, Lef4;->J0:Z

    .line 46
    .line 47
    invoke-virtual {v0}, Ldf4;->a()V

    .line 48
    .line 49
    .line 50
    :goto_1
    throw v2
.end method

.method public final k()V
    .locals 4

    .line 1
    iget-object v0, p0, Lef4;->B0:Ldf4;

    .line 2
    .line 3
    iget-object v0, v0, Ldf4;->t:Lx03;

    .line 4
    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    iget-boolean v1, v0, Lx03;->f:Z

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    iput-object v1, v0, Lx03;->m:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v1, v0, Lx03;->g:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Landroid/content/Context;

    .line 18
    .line 19
    iget-object v2, v0, Lx03;->j:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Lbe4;

    .line 22
    .line 23
    invoke-static {v1}, Lbd2;->B(Landroid/content/Context;)Landroid/media/AudioManager;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v3, v2}, Landroid/media/AudioManager;->unregisterAudioDeviceCallback(Landroid/media/AudioDeviceCallback;)V

    .line 28
    .line 29
    .line 30
    iget-object v2, v0, Lx03;->k:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v2, Ld6;

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 35
    .line 36
    .line 37
    iget-object v1, v0, Lx03;->l:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, Lce4;

    .line 40
    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    iget-object v2, v1, Lce4;->a:Landroid/content/ContentResolver;

    .line 44
    .line 45
    invoke-virtual {v2, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    const/4 v1, 0x0

    .line 49
    iput-boolean v1, v0, Lx03;->f:Z

    .line 50
    .line 51
    :cond_2
    :goto_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 52
    .line 53
    const/16 v1, 0x23

    .line 54
    .line 55
    if-lt v0, v1, :cond_3

    .line 56
    .line 57
    iget-object v0, p0, Lef4;->C0:Lwt2;

    .line 58
    .line 59
    if-eqz v0, :cond_3

    .line 60
    .line 61
    iget-object v1, v0, Lwt2;->g:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v1, Ljava/util/HashSet;

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/util/HashSet;->clear()V

    .line 66
    .line 67
    .line 68
    iget-object v0, v0, Lwt2;->h:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, Landroid/media/LoudnessCodecController;

    .line 71
    .line 72
    if-eqz v0, :cond_3

    .line 73
    .line 74
    invoke-static {v0}, Lsf4;->b(Landroid/media/LoudnessCodecController;)V

    .line 75
    .line 76
    .line 77
    :cond_3
    return-void
.end method

.method public final m0()Lob4;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final o()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "MediaCodecAudioRenderer"

    .line 2
    .line 3
    return-object v0
.end method

.method public final p0(ZZ)V
    .locals 3

    .line 1
    new-instance p1, Ln34;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lkg4;->t0:Ln34;

    .line 7
    .line 8
    iget-object p2, p0, Lef4;->A0:Lwt2;

    .line 9
    .line 10
    iget-object v0, p2, Lwt2;->g:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Landroid/os/Handler;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    new-instance v1, Lee4;

    .line 17
    .line 18
    const/16 v2, 0x8

    .line 19
    .line 20
    invoke-direct {v1, p2, p1, v2}, Lee4;-><init>(Lwt2;Ljava/lang/Object;I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {p0}, Lkg4;->l()V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lkg4;->k:Lxd4;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget-object p2, p0, Lef4;->B0:Ldf4;

    .line 35
    .line 36
    iput-object p1, p2, Ldf4;->m:Lxd4;

    .line 37
    .line 38
    iget-object p1, p0, Lkg4;->l:Lpz;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    iget-object p2, p2, Ldf4;->g:Lqe4;

    .line 44
    .line 45
    iput-object p1, p2, Lqe4;->B:Lpz;

    .line 46
    .line 47
    return-void
.end method

.method public final r0()V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Lef4;->u()Z

    .line 4
    .line 5
    .line 6
    iget-object v1, v0, Lef4;->B0:Ldf4;

    .line 7
    .line 8
    iget-object v2, v1, Ldf4;->d0:Ljr3;

    .line 9
    .line 10
    invoke-virtual {v1}, Ldf4;->h()Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    iget-boolean v3, v1, Ldf4;->G:Z

    .line 17
    .line 18
    if-eqz v3, :cond_1

    .line 19
    .line 20
    :cond_0
    const-wide/high16 v18, -0x8000000000000000L

    .line 21
    .line 22
    goto/16 :goto_3

    .line 23
    .line 24
    :cond_1
    iget-object v3, v1, Ldf4;->g:Lqe4;

    .line 25
    .line 26
    invoke-virtual {v3}, Lqe4;->b()J

    .line 27
    .line 28
    .line 29
    move-result-wide v6

    .line 30
    iget-object v3, v1, Ldf4;->p:Lse4;

    .line 31
    .line 32
    invoke-virtual {v1}, Ldf4;->j()J

    .line 33
    .line 34
    .line 35
    move-result-wide v8

    .line 36
    iget v3, v3, Lse4;->e:I

    .line 37
    .line 38
    invoke-static {v3, v8, v9}, Lv23;->s(IJ)J

    .line 39
    .line 40
    .line 41
    move-result-wide v8

    .line 42
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->min(JJ)J

    .line 43
    .line 44
    .line 45
    move-result-wide v6

    .line 46
    :goto_0
    iget-object v3, v1, Ldf4;->h:Ljava/util/ArrayDeque;

    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 49
    .line 50
    .line 51
    move-result v8

    .line 52
    if-nez v8, :cond_2

    .line 53
    .line 54
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->getFirst()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    check-cast v8, Lue4;

    .line 59
    .line 60
    iget-wide v8, v8, Lue4;->c:J

    .line 61
    .line 62
    cmp-long v8, v6, v8

    .line 63
    .line 64
    if-ltz v8, :cond_2

    .line 65
    .line 66
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    check-cast v3, Lue4;

    .line 71
    .line 72
    iput-object v3, v1, Ldf4;->x:Lue4;

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    iget-object v8, v1, Ldf4;->x:Lue4;

    .line 76
    .line 77
    iget-wide v9, v8, Lue4;->c:J

    .line 78
    .line 79
    sub-long v11, v6, v9

    .line 80
    .line 81
    iget-object v6, v8, Lue4;->a:Lsr1;

    .line 82
    .line 83
    iget v6, v6, Lsr1;->a:F

    .line 84
    .line 85
    invoke-static {v11, v12, v6}, Lv23;->v(JF)J

    .line 86
    .line 87
    .line 88
    move-result-wide v6

    .line 89
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-eqz v3, :cond_6

    .line 94
    .line 95
    iget-object v3, v2, Ljr3;->i:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v3, Lxg2;

    .line 98
    .line 99
    invoke-virtual {v3}, Lxg2;->h()Z

    .line 100
    .line 101
    .line 102
    move-result v8

    .line 103
    if-eqz v8, :cond_5

    .line 104
    .line 105
    iget-wide v8, v3, Lxg2;->o:J

    .line 106
    .line 107
    const-wide/16 v13, 0x400

    .line 108
    .line 109
    cmp-long v10, v8, v13

    .line 110
    .line 111
    if-ltz v10, :cond_4

    .line 112
    .line 113
    iget-wide v13, v3, Lxg2;->n:J

    .line 114
    .line 115
    iget-object v10, v3, Lxg2;->j:Lmg2;

    .line 116
    .line 117
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    iget v15, v10, Lmg2;->k:I

    .line 121
    .line 122
    iget v10, v10, Lmg2;->b:I

    .line 123
    .line 124
    mul-int/2addr v15, v10

    .line 125
    add-int/2addr v15, v15

    .line 126
    const-wide/high16 v18, -0x8000000000000000L

    .line 127
    .line 128
    int-to-long v4, v15

    .line 129
    sub-long/2addr v13, v4

    .line 130
    iget-object v4, v3, Lxg2;->h:Lce2;

    .line 131
    .line 132
    iget v4, v4, Lce2;->a:I

    .line 133
    .line 134
    iget-object v3, v3, Lxg2;->g:Lce2;

    .line 135
    .line 136
    iget v3, v3, Lce2;->a:I

    .line 137
    .line 138
    if-ne v4, v3, :cond_3

    .line 139
    .line 140
    sget-object v17, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 141
    .line 142
    move-wide v15, v8

    .line 143
    invoke-static/range {v11 .. v17}, Lv23;->t(JJJLjava/math/RoundingMode;)J

    .line 144
    .line 145
    .line 146
    move-result-wide v11

    .line 147
    goto :goto_1

    .line 148
    :cond_3
    move-wide v15, v8

    .line 149
    int-to-long v4, v4

    .line 150
    mul-long/2addr v13, v4

    .line 151
    int-to-long v3, v3

    .line 152
    mul-long/2addr v15, v3

    .line 153
    sget-object v17, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 154
    .line 155
    invoke-static/range {v11 .. v17}, Lv23;->t(JJJLjava/math/RoundingMode;)J

    .line 156
    .line 157
    .line 158
    move-result-wide v11

    .line 159
    goto :goto_1

    .line 160
    :cond_4
    const-wide/high16 v18, -0x8000000000000000L

    .line 161
    .line 162
    iget v3, v3, Lxg2;->c:F

    .line 163
    .line 164
    float-to-double v3, v3

    .line 165
    long-to-double v8, v11

    .line 166
    mul-double/2addr v3, v8

    .line 167
    double-to-long v11, v3

    .line 168
    goto :goto_1

    .line 169
    :cond_5
    const-wide/high16 v18, -0x8000000000000000L

    .line 170
    .line 171
    :goto_1
    iget-object v3, v1, Ldf4;->x:Lue4;

    .line 172
    .line 173
    iget-wide v4, v3, Lue4;->b:J

    .line 174
    .line 175
    add-long/2addr v4, v11

    .line 176
    sub-long/2addr v11, v6

    .line 177
    iput-wide v11, v3, Lue4;->d:J

    .line 178
    .line 179
    goto :goto_2

    .line 180
    :cond_6
    const-wide/high16 v18, -0x8000000000000000L

    .line 181
    .line 182
    iget-object v3, v1, Ldf4;->x:Lue4;

    .line 183
    .line 184
    iget-wide v4, v3, Lue4;->b:J

    .line 185
    .line 186
    add-long/2addr v4, v6

    .line 187
    iget-wide v6, v3, Lue4;->d:J

    .line 188
    .line 189
    add-long/2addr v4, v6

    .line 190
    :goto_2
    iget-object v2, v2, Ljr3;->h:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v2, Lff4;

    .line 193
    .line 194
    iget-wide v2, v2, Lff4;->l:J

    .line 195
    .line 196
    iget-object v6, v1, Ldf4;->p:Lse4;

    .line 197
    .line 198
    iget v6, v6, Lse4;->e:I

    .line 199
    .line 200
    invoke-static {v6, v2, v3}, Lv23;->s(IJ)J

    .line 201
    .line 202
    .line 203
    move-result-wide v6

    .line 204
    add-long/2addr v6, v4

    .line 205
    iget-wide v4, v1, Ldf4;->X:J

    .line 206
    .line 207
    cmp-long v8, v2, v4

    .line 208
    .line 209
    if-lez v8, :cond_8

    .line 210
    .line 211
    iget-object v8, v1, Ldf4;->p:Lse4;

    .line 212
    .line 213
    iget v8, v8, Lse4;->e:I

    .line 214
    .line 215
    sub-long v4, v2, v4

    .line 216
    .line 217
    invoke-static {v8, v4, v5}, Lv23;->s(IJ)J

    .line 218
    .line 219
    .line 220
    move-result-wide v4

    .line 221
    iput-wide v2, v1, Ldf4;->X:J

    .line 222
    .line 223
    iget-wide v2, v1, Ldf4;->Y:J

    .line 224
    .line 225
    add-long/2addr v2, v4

    .line 226
    iput-wide v2, v1, Ldf4;->Y:J

    .line 227
    .line 228
    iget-object v2, v1, Ldf4;->Z:Landroid/os/Handler;

    .line 229
    .line 230
    if-nez v2, :cond_7

    .line 231
    .line 232
    new-instance v2, Landroid/os/Handler;

    .line 233
    .line 234
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 239
    .line 240
    .line 241
    iput-object v2, v1, Ldf4;->Z:Landroid/os/Handler;

    .line 242
    .line 243
    :cond_7
    iget-object v2, v1, Ldf4;->Z:Landroid/os/Handler;

    .line 244
    .line 245
    const/4 v3, 0x0

    .line 246
    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    iget-object v2, v1, Ldf4;->Z:Landroid/os/Handler;

    .line 250
    .line 251
    new-instance v3, Lbh3;

    .line 252
    .line 253
    const/16 v4, 0xd

    .line 254
    .line 255
    invoke-direct {v3, v4, v1}, Lbh3;-><init>(ILjava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    const-wide/16 v4, 0x64

    .line 259
    .line 260
    invoke-virtual {v2, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 261
    .line 262
    .line 263
    goto :goto_4

    .line 264
    :goto_3
    move-wide/from16 v6, v18

    .line 265
    .line 266
    :cond_8
    :goto_4
    cmp-long v1, v6, v18

    .line 267
    .line 268
    if-eqz v1, :cond_a

    .line 269
    .line 270
    iget-boolean v1, v0, Lef4;->I0:Z

    .line 271
    .line 272
    if-eqz v1, :cond_9

    .line 273
    .line 274
    goto :goto_5

    .line 275
    :cond_9
    iget-wide v1, v0, Lef4;->H0:J

    .line 276
    .line 277
    invoke-static {v1, v2, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 278
    .line 279
    .line 280
    move-result-wide v6

    .line 281
    :goto_5
    iput-wide v6, v0, Lef4;->H0:J

    .line 282
    .line 283
    const/4 v1, 0x0

    .line 284
    iput-boolean v1, v0, Lef4;->I0:Z

    .line 285
    .line 286
    :cond_a
    return-void
.end method

.method public final t()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lef4;->B0:Ldf4;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldf4;->s()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final u()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lkg4;->r0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lef4;->B0:Ldf4;

    .line 6
    .line 7
    invoke-virtual {v0}, Ldf4;->h()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-boolean v1, v0, Ldf4;->M:Z

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0}, Ldf4;->s()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    :cond_0
    const/4 v0, 0x1

    .line 24
    return v0

    .line 25
    :cond_1
    const/4 v0, 0x0

    .line 26
    return v0
.end method
