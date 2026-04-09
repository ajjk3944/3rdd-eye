.class public final Lo32;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ly32;


# static fields
.field public static final synthetic g:Lo32;

.field public static final synthetic h:Lo32;

.field public static final synthetic i:Lo32;

.field public static final synthetic j:Lo32;

.field public static final synthetic k:Lo32;

.field public static final synthetic l:Lo32;


# instance fields
.field public final synthetic f:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lo32;

    .line 2
    .line 3
    const/16 v1, 0x14

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lo32;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lo32;->g:Lo32;

    .line 9
    .line 10
    new-instance v0, Lo32;

    .line 11
    .line 12
    const/16 v1, 0x15

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lo32;-><init>(I)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lo32;->h:Lo32;

    .line 18
    .line 19
    new-instance v0, Lo32;

    .line 20
    .line 21
    const/16 v1, 0x16

    .line 22
    .line 23
    invoke-direct {v0, v1}, Lo32;-><init>(I)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lo32;->i:Lo32;

    .line 27
    .line 28
    new-instance v0, Lo32;

    .line 29
    .line 30
    const/16 v1, 0x17

    .line 31
    .line 32
    invoke-direct {v0, v1}, Lo32;-><init>(I)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lo32;->j:Lo32;

    .line 36
    .line 37
    new-instance v0, Lo32;

    .line 38
    .line 39
    const/16 v1, 0x18

    .line 40
    .line 41
    invoke-direct {v0, v1}, Lo32;-><init>(I)V

    .line 42
    .line 43
    .line 44
    sput-object v0, Lo32;->k:Lo32;

    .line 45
    .line 46
    new-instance v0, Lo32;

    .line 47
    .line 48
    const/16 v1, 0x1b

    .line 49
    .line 50
    invoke-direct {v0, v1}, Lo32;-><init>(I)V

    .line 51
    .line 52
    .line 53
    sput-object v0, Lo32;->l:Lo32;

    .line 54
    .line 55
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lo32;->f:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final a(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 12

    .line 1
    check-cast p1, Lag2;

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    invoke-static {v0}, Lgi2;->q0(I)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Lorg/json/JSONObject;

    .line 11
    .line 12
    invoke-direct {v0, p2}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 13
    .line 14
    .line 15
    const-string v1, "google.afma.Notify_dt"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v1, "Precache GMSG: "

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {v0}, Lgi2;->U(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    sget-object v0, Lhg4;->C:Lhg4;

    .line 34
    .line 35
    iget-object v0, v0, Lhg4;->A:Lxe2;

    .line 36
    .line 37
    const-string v1, "abort"

    .line 38
    .line 39
    invoke-interface {p2, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    invoke-virtual {v0, p1}, Lxe2;->a(Lag2;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-nez p1, :cond_1c

    .line 50
    .line 51
    const-string p1, "Precache abort but no precache task running."

    .line 52
    .line 53
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_1
    const-string v1, "src"

    .line 58
    .line 59
    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    check-cast v1, Ljava/lang/String;

    .line 64
    .line 65
    const-string v2, "periodicReportIntervalMs"

    .line 66
    .line 67
    invoke-static {v2, p2}, Lo32;->b(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    const-string v3, "exoPlayerRenderingIntervalMs"

    .line 72
    .line 73
    invoke-static {v3, p2}, Lo32;->b(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    const-string v3, "exoPlayerIdleIntervalMs"

    .line 77
    .line 78
    invoke-static {v3, p2}, Lo32;->b(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Integer;

    .line 79
    .line 80
    .line 81
    new-instance v3, Lje2;

    .line 82
    .line 83
    const-string v4, "flags"

    .line 84
    .line 85
    invoke-interface {p2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    check-cast v4, Ljava/lang/String;

    .line 90
    .line 91
    invoke-direct {v3, v4}, Lje2;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    const/4 v4, 0x0

    .line 95
    const/4 v5, 0x0

    .line 96
    if-eqz v1, :cond_16

    .line 97
    .line 98
    const/4 v6, 0x1

    .line 99
    new-array v7, v6, [Ljava/lang/String;

    .line 100
    .line 101
    aput-object v1, v7, v5

    .line 102
    .line 103
    const-string v8, "demuxed"

    .line 104
    .line 105
    invoke-interface {p2, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v8

    .line 109
    check-cast v8, Ljava/lang/String;

    .line 110
    .line 111
    if-eqz v8, :cond_3

    .line 112
    .line 113
    :try_start_0
    new-instance v7, Lorg/json/JSONArray;

    .line 114
    .line 115
    invoke-direct {v7, v8}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v7}, Lorg/json/JSONArray;->length()I

    .line 119
    .line 120
    .line 121
    move-result v9

    .line 122
    new-array v9, v9, [Ljava/lang/String;

    .line 123
    .line 124
    move v10, v5

    .line 125
    :goto_0
    invoke-virtual {v7}, Lorg/json/JSONArray;->length()I

    .line 126
    .line 127
    .line 128
    move-result v11

    .line 129
    if-ge v10, v11, :cond_2

    .line 130
    .line 131
    invoke-virtual {v7, v10}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v11

    .line 135
    aput-object v11, v9, v10
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 136
    .line 137
    add-int/lit8 v10, v10, 0x1

    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_2
    move-object v7, v9

    .line 141
    goto :goto_1

    .line 142
    :catch_0
    const-string v7, "Malformed demuxed URL list for precache: "

    .line 143
    .line 144
    invoke-virtual {v7, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    invoke-static {v7}, Lgi2;->i0(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    move-object v7, v4

    .line 152
    :cond_3
    :goto_1
    if-nez v7, :cond_4

    .line 153
    .line 154
    new-array v7, v6, [Ljava/lang/String;

    .line 155
    .line 156
    aput-object v1, v7, v5

    .line 157
    .line 158
    :cond_4
    iget-boolean v8, v3, Lje2;->k:Z

    .line 159
    .line 160
    if-eqz v8, :cond_7

    .line 161
    .line 162
    iget-object v0, v0, Lxe2;->f:Ljava/util/ArrayList;

    .line 163
    .line 164
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 165
    .line 166
    .line 167
    move-result v8

    .line 168
    move v9, v5

    .line 169
    :cond_5
    if-ge v9, v8, :cond_6

    .line 170
    .line 171
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v10

    .line 175
    add-int/lit8 v9, v9, 0x1

    .line 176
    .line 177
    check-cast v10, Lwe2;

    .line 178
    .line 179
    iget-object v11, v10, Lwe2;->i:Lag2;

    .line 180
    .line 181
    if-ne v11, p1, :cond_5

    .line 182
    .line 183
    iget-object v11, v10, Lwe2;->k:Ljava/lang/String;

    .line 184
    .line 185
    invoke-virtual {v1, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v11

    .line 189
    if-eqz v11, :cond_5

    .line 190
    .line 191
    goto :goto_2

    .line 192
    :cond_6
    move-object v10, v4

    .line 193
    goto :goto_2

    .line 194
    :cond_7
    iget-object v0, v0, Lxe2;->f:Ljava/util/ArrayList;

    .line 195
    .line 196
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 197
    .line 198
    .line 199
    move-result v8

    .line 200
    move v9, v5

    .line 201
    :cond_8
    if-ge v9, v8, :cond_6

    .line 202
    .line 203
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v10

    .line 207
    add-int/lit8 v9, v9, 0x1

    .line 208
    .line 209
    check-cast v10, Lwe2;

    .line 210
    .line 211
    iget-object v11, v10, Lwe2;->i:Lag2;

    .line 212
    .line 213
    if-ne v11, p1, :cond_8

    .line 214
    .line 215
    :goto_2
    if-eqz v10, :cond_9

    .line 216
    .line 217
    const-string p1, "Precache task is already running."

    .line 218
    .line 219
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    return-void

    .line 223
    :cond_9
    invoke-interface {p1}, Lag2;->k()Ll92;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    if-nez v0, :cond_a

    .line 228
    .line 229
    const-string p1, "Precache requires a dependency provider."

    .line 230
    .line 231
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    return-void

    .line 235
    :cond_a
    const-string v0, "player"

    .line 236
    .line 237
    invoke-static {v0, p2}, Lo32;->b(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Integer;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    if-nez v0, :cond_b

    .line 242
    .line 243
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    :cond_b
    if-eqz v2, :cond_c

    .line 248
    .line 249
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 250
    .line 251
    .line 252
    move-result v2

    .line 253
    invoke-interface {p1, v2}, Lag2;->b1(I)V

    .line 254
    .line 255
    .line 256
    :cond_c
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    invoke-interface {p1}, Lag2;->k()Ll92;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    iget-object v2, v2, Ll92;->g:Ljava/lang/Object;

    .line 265
    .line 266
    if-lez v0, :cond_10

    .line 267
    .line 268
    sget-object v0, Lsf2;->A:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 269
    .line 270
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    iget v2, v3, Lje2;->g:I

    .line 275
    .line 276
    if-ge v0, v2, :cond_d

    .line 277
    .line 278
    new-instance v0, Ljf2;

    .line 279
    .line 280
    invoke-direct {v0, p1}, Lff2;-><init>(Lag2;)V

    .line 281
    .line 282
    .line 283
    invoke-interface {p1}, Lag2;->getContext()Landroid/content/Context;

    .line 284
    .line 285
    .line 286
    move-result-object v2

    .line 287
    new-instance v5, Lsf2;

    .line 288
    .line 289
    iget-object v6, v0, Lff2;->h:Ljava/lang/ref/WeakReference;

    .line 290
    .line 291
    invoke-virtual {v6}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v6

    .line 295
    check-cast v6, Lag2;

    .line 296
    .line 297
    invoke-direct {v5, v2, v3, v6, v4}, Lsf2;-><init>(Landroid/content/Context;Lje2;Lag2;Ljava/lang/Integer;)V

    .line 298
    .line 299
    .line 300
    const-string v2, "ExoPlayerAdapter initialized."

    .line 301
    .line 302
    invoke-static {v2}, Lgi2;->f0(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    iput-object v5, v0, Ljf2;->i:Lsf2;

    .line 306
    .line 307
    iput-object v0, v5, Lsf2;->o:Lfe2;

    .line 308
    .line 309
    goto/16 :goto_4

    .line 310
    .line 311
    :cond_d
    sget-object v2, Lmz1;->q:Liz1;

    .line 312
    .line 313
    sget-object v4, Ltw1;->e:Ltw1;

    .line 314
    .line 315
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 316
    .line 317
    invoke-virtual {v4, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v2

    .line 321
    check-cast v2, Ljava/lang/Boolean;

    .line 322
    .line 323
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 324
    .line 325
    .line 326
    move-result v2

    .line 327
    if-eqz v2, :cond_e

    .line 328
    .line 329
    sget-object v0, Lif2;->t:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 330
    .line 331
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 332
    .line 333
    .line 334
    move-result v0

    .line 335
    :cond_e
    iget v2, v3, Lje2;->b:I

    .line 336
    .line 337
    if-ge v0, v2, :cond_f

    .line 338
    .line 339
    new-instance v0, Lif2;

    .line 340
    .line 341
    invoke-direct {v0, p1, v3}, Lif2;-><init>(Lag2;Lje2;)V

    .line 342
    .line 343
    .line 344
    goto :goto_4

    .line 345
    :cond_f
    new-instance v0, Lhf2;

    .line 346
    .line 347
    invoke-direct {v0, p1}, Lff2;-><init>(Lag2;)V

    .line 348
    .line 349
    .line 350
    goto :goto_4

    .line 351
    :cond_10
    new-instance v0, Lgf2;

    .line 352
    .line 353
    invoke-direct {v0, p1}, Lff2;-><init>(Lag2;)V

    .line 354
    .line 355
    .line 356
    iget-object v2, v0, Lff2;->f:Landroid/content/Context;

    .line 357
    .line 358
    invoke-virtual {v2}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 359
    .line 360
    .line 361
    move-result-object v2

    .line 362
    if-nez v2, :cond_11

    .line 363
    .line 364
    const-string v2, "Context.getCacheDir() returned null"

    .line 365
    .line 366
    invoke-static {v2}, Lgi2;->i0(Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    goto :goto_4

    .line 370
    :cond_11
    new-instance v3, Ljava/io/File;

    .line 371
    .line 372
    new-instance v8, Ljava/io/File;

    .line 373
    .line 374
    const-string v9, "admobVideoStreams"

    .line 375
    .line 376
    invoke-direct {v8, v2, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v8}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v2

    .line 383
    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    iput-object v3, v0, Lgf2;->i:Ljava/io/File;

    .line 387
    .line 388
    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    .line 389
    .line 390
    .line 391
    move-result v2

    .line 392
    if-nez v2, :cond_13

    .line 393
    .line 394
    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    .line 395
    .line 396
    .line 397
    move-result v2

    .line 398
    if-eqz v2, :cond_12

    .line 399
    .line 400
    goto :goto_3

    .line 401
    :cond_12
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v2

    .line 405
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v2

    .line 409
    const-string v3, "Could not create preload cache directory at "

    .line 410
    .line 411
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v2

    .line 415
    invoke-static {v2}, Lgi2;->i0(Ljava/lang/String;)V

    .line 416
    .line 417
    .line 418
    iput-object v4, v0, Lgf2;->i:Ljava/io/File;

    .line 419
    .line 420
    goto :goto_4

    .line 421
    :cond_13
    :goto_3
    invoke-virtual {v3, v6, v5}, Ljava/io/File;->setReadable(ZZ)Z

    .line 422
    .line 423
    .line 424
    move-result v2

    .line 425
    if-eqz v2, :cond_14

    .line 426
    .line 427
    invoke-virtual {v3, v6, v5}, Ljava/io/File;->setExecutable(ZZ)Z

    .line 428
    .line 429
    .line 430
    move-result v2

    .line 431
    if-nez v2, :cond_15

    .line 432
    .line 433
    :cond_14
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v2

    .line 437
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object v2

    .line 441
    const-string v3, "Could not set cache file permissions at "

    .line 442
    .line 443
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object v2

    .line 447
    invoke-static {v2}, Lgi2;->i0(Ljava/lang/String;)V

    .line 448
    .line 449
    .line 450
    iput-object v4, v0, Lgf2;->i:Ljava/io/File;

    .line 451
    .line 452
    :cond_15
    :goto_4
    new-instance v2, Lwe2;

    .line 453
    .line 454
    invoke-direct {v2, p1, v0, v1, v7}, Lwe2;-><init>(Lag2;Lff2;Ljava/lang/String;[Ljava/lang/String;)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {v2}, Lwe2;->r1()Ln70;

    .line 458
    .line 459
    .line 460
    goto :goto_5

    .line 461
    :cond_16
    iget-object v0, v0, Lxe2;->f:Ljava/util/ArrayList;

    .line 462
    .line 463
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 464
    .line 465
    .line 466
    move-result v1

    .line 467
    :cond_17
    if-ge v5, v1, :cond_18

    .line 468
    .line 469
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object v2

    .line 473
    add-int/lit8 v5, v5, 0x1

    .line 474
    .line 475
    check-cast v2, Lwe2;

    .line 476
    .line 477
    iget-object v3, v2, Lwe2;->i:Lag2;

    .line 478
    .line 479
    if-ne v3, p1, :cond_17

    .line 480
    .line 481
    move-object v4, v2

    .line 482
    :cond_18
    if-eqz v4, :cond_1d

    .line 483
    .line 484
    iget-object v0, v4, Lwe2;->j:Lff2;

    .line 485
    .line 486
    :goto_5
    const-string p1, "minBufferMs"

    .line 487
    .line 488
    invoke-static {p1, p2}, Lo32;->b(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Integer;

    .line 489
    .line 490
    .line 491
    move-result-object p1

    .line 492
    if-eqz p1, :cond_19

    .line 493
    .line 494
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 495
    .line 496
    .line 497
    move-result p1

    .line 498
    invoke-virtual {v0, p1}, Lff2;->i(I)V

    .line 499
    .line 500
    .line 501
    :cond_19
    const-string p1, "maxBufferMs"

    .line 502
    .line 503
    invoke-static {p1, p2}, Lo32;->b(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Integer;

    .line 504
    .line 505
    .line 506
    move-result-object p1

    .line 507
    if-eqz p1, :cond_1a

    .line 508
    .line 509
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 510
    .line 511
    .line 512
    move-result p1

    .line 513
    invoke-virtual {v0, p1}, Lff2;->h(I)V

    .line 514
    .line 515
    .line 516
    :cond_1a
    const-string p1, "bufferForPlaybackMs"

    .line 517
    .line 518
    invoke-static {p1, p2}, Lo32;->b(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Integer;

    .line 519
    .line 520
    .line 521
    move-result-object p1

    .line 522
    if-eqz p1, :cond_1b

    .line 523
    .line 524
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 525
    .line 526
    .line 527
    move-result p1

    .line 528
    invoke-virtual {v0, p1}, Lff2;->j(I)V

    .line 529
    .line 530
    .line 531
    :cond_1b
    const-string p1, "bufferForPlaybackAfterRebufferMs"

    .line 532
    .line 533
    invoke-static {p1, p2}, Lo32;->b(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Integer;

    .line 534
    .line 535
    .line 536
    move-result-object p1

    .line 537
    if-eqz p1, :cond_1c

    .line 538
    .line 539
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 540
    .line 541
    .line 542
    move-result p1

    .line 543
    invoke-virtual {v0, p1}, Lff2;->k(I)V

    .line 544
    .line 545
    .line 546
    :cond_1c
    return-void

    .line 547
    :cond_1d
    const-string p1, "Precache must specify a source."

    .line 548
    .line 549
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 550
    .line 551
    .line 552
    return-void
.end method

.method public static final b(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Integer;
    .locals 4

    .line 1
    invoke-interface {p1, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    :try_start_0
    invoke-interface {p1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    return-object p0

    .line 24
    :catch_0
    invoke-interface {p1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    add-int/lit8 v0, v0, 0x27

    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    new-instance v3, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    add-int/2addr v0, v2

    .line 47
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 48
    .line 49
    .line 50
    const-string v0, "Precache invalid numeric parameter \'"

    .line 51
    .line 52
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string p0, "\': "

    .line 59
    .line 60
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-static {p0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-object v1
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    iget v2, v1, Lo32;->f:I

    .line 6
    .line 7
    const/high16 v3, 0x10000

    .line 8
    .line 9
    const/4 v4, 0x3

    .line 10
    const/4 v6, 0x2

    .line 11
    const/4 v7, 0x1

    .line 12
    const/4 v8, 0x0

    .line 13
    packed-switch v2, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object/from16 v0, p1

    .line 17
    .line 18
    check-cast v0, Lag2;

    .line 19
    .line 20
    const-string v2, "Show native ad policy validator overlay."

    .line 21
    .line 22
    invoke-static {v2}, Lgi2;->U(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Lag2;->p0()Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_0
    invoke-direct/range {p0 .. p2}, Lo32;->a(Ljava/lang/Object;Ljava/util/Map;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_1
    const-string v2, "duration"

    .line 38
    .line 39
    const-string v3, "1"

    .line 40
    .line 41
    move-object/from16 v5, p1

    .line 42
    .line 43
    check-cast v5, Lag2;

    .line 44
    .line 45
    invoke-interface {v5}, Lag2;->f()Lqg2;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    const-string v7, " , aspectRatio : "

    .line 50
    .line 51
    const-string v9, " , playbackState : "

    .line 52
    .line 53
    const-string v10, " , isMuted : "

    .line 54
    .line 55
    const-string v11, " , duration : "

    .line 56
    .line 57
    const-string v12, "Video Meta GMSG: currentTime : "

    .line 58
    .line 59
    if-nez v6, :cond_0

    .line 60
    .line 61
    :try_start_0
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    check-cast v6, Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {v6}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    const-string v13, "customControlsAllowed"

    .line 72
    .line 73
    invoke-interface {v0, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v13

    .line 77
    invoke-virtual {v3, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v13

    .line 81
    const-string v14, "clickToExpandAllowed"

    .line 82
    .line 83
    invoke-interface {v0, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v14

    .line 87
    invoke-virtual {v3, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v14

    .line 91
    new-instance v15, Lqg2;

    .line 92
    .line 93
    invoke-direct {v15, v5, v6, v13, v14}, Lqg2;-><init>(Lag2;FZZ)V

    .line 94
    .line 95
    .line 96
    invoke-interface {v5, v15}, Lag2;->V0(Lqg2;)V

    .line 97
    .line 98
    .line 99
    move-object v6, v15

    .line 100
    goto :goto_0

    .line 101
    :catch_0
    move-exception v0

    .line 102
    goto/16 :goto_3

    .line 103
    .line 104
    :catch_1
    move-exception v0

    .line 105
    goto/16 :goto_3

    .line 106
    .line 107
    :cond_0
    :goto_0
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    check-cast v2, Ljava/lang/String;

    .line 112
    .line 113
    invoke-static {v2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    const-string v5, "muted"

    .line 118
    .line 119
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    const-string v5, "currentTime"

    .line 128
    .line 129
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    check-cast v5, Ljava/lang/String;

    .line 134
    .line 135
    invoke-static {v5}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    const-string v13, "playbackState"

    .line 140
    .line 141
    invoke-interface {v0, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v13

    .line 145
    check-cast v13, Ljava/lang/String;

    .line 146
    .line 147
    invoke-static {v13}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 148
    .line 149
    .line 150
    move-result v13

    .line 151
    if-ltz v13, :cond_2

    .line 152
    .line 153
    if-le v13, v4, :cond_1

    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_1
    move v8, v13

    .line 157
    :cond_2
    :goto_1
    const-string v13, "aspectRatio"

    .line 158
    .line 159
    invoke-interface {v0, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    check-cast v0, Ljava/lang/String;

    .line 164
    .line 165
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 166
    .line 167
    .line 168
    move-result v13

    .line 169
    if-eqz v13, :cond_3

    .line 170
    .line 171
    const/4 v13, 0x0

    .line 172
    goto :goto_2

    .line 173
    :cond_3
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 174
    .line 175
    .line 176
    move-result v13

    .line 177
    :goto_2
    invoke-static {v4}, Lgi2;->q0(I)Z

    .line 178
    .line 179
    .line 180
    move-result v4

    .line 181
    if-eqz v4, :cond_4

    .line 182
    .line 183
    invoke-static {v5}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 188
    .line 189
    .line 190
    move-result v4

    .line 191
    add-int/lit8 v4, v4, 0x2d

    .line 192
    .line 193
    invoke-static {v2}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v14

    .line 197
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    .line 198
    .line 199
    .line 200
    move-result v14

    .line 201
    add-int/2addr v4, v14

    .line 202
    add-int/lit8 v4, v4, 0xd

    .line 203
    .line 204
    invoke-static {v3}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v14

    .line 208
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    .line 209
    .line 210
    .line 211
    move-result v14

    .line 212
    add-int/2addr v4, v14

    .line 213
    add-int/lit8 v4, v4, 0x13

    .line 214
    .line 215
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v14

    .line 219
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    .line 220
    .line 221
    .line 222
    move-result v14

    .line 223
    add-int/2addr v4, v14

    .line 224
    add-int/lit8 v4, v4, 0x11

    .line 225
    .line 226
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v14

    .line 230
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    .line 231
    .line 232
    .line 233
    move-result v14

    .line 234
    add-int/2addr v4, v14

    .line 235
    new-instance v14, Ljava/lang/StringBuilder;

    .line 236
    .line 237
    invoke-direct {v14, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v14, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    invoke-static {v0}, Lgi2;->U(Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    :cond_4
    move v4, v2

    .line 278
    move-object v2, v6

    .line 279
    move v7, v13

    .line 280
    move v6, v3

    .line 281
    move v3, v5

    .line 282
    move v5, v8

    .line 283
    invoke-virtual/range {v2 .. v7}, Lqg2;->D3(FFIZF)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 284
    .line 285
    .line 286
    goto :goto_4

    .line 287
    :goto_3
    const-string v2, "Unable to parse videoMeta message."

    .line 288
    .line 289
    invoke-static {v2, v0}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 290
    .line 291
    .line 292
    const-string v2, "VideoMetaGmsgHandler.onGmsg"

    .line 293
    .line 294
    sget-object v3, Lhg4;->C:Lhg4;

    .line 295
    .line 296
    iget-object v3, v3, Lhg4;->h:Lgd2;

    .line 297
    .line 298
    invoke-virtual {v3, v2, v0}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 299
    .line 300
    .line 301
    :goto_4
    return-void

    .line 302
    :pswitch_2
    const-string v2, ";"

    .line 303
    .line 304
    move-object/from16 v4, p1

    .line 305
    .line 306
    check-cast v4, Lag2;

    .line 307
    .line 308
    sget-object v5, Lx32;->a:Lo32;

    .line 309
    .line 310
    const-string v5, "urls"

    .line 311
    .line 312
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    check-cast v0, Ljava/lang/String;

    .line 317
    .line 318
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 319
    .line 320
    .line 321
    move-result v5

    .line 322
    if-eqz v5, :cond_5

    .line 323
    .line 324
    const-string v0, "URLs missing in canOpenURLs GMSG."

    .line 325
    .line 326
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    goto/16 :goto_8

    .line 330
    .line 331
    :cond_5
    const-string v5, ","

    .line 332
    .line 333
    invoke-virtual {v0, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    new-instance v5, Ljava/util/HashMap;

    .line 338
    .line 339
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 340
    .line 341
    .line 342
    invoke-interface {v4}, Lag2;->getContext()Landroid/content/Context;

    .line 343
    .line 344
    .line 345
    move-result-object v9

    .line 346
    invoke-virtual {v9}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 347
    .line 348
    .line 349
    move-result-object v9

    .line 350
    array-length v10, v0

    .line 351
    move v11, v8

    .line 352
    :goto_5
    if-ge v11, v10, :cond_8

    .line 353
    .line 354
    aget-object v12, v0, v11

    .line 355
    .line 356
    invoke-virtual {v12, v2, v6}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v13

    .line 360
    aget-object v14, v13, v8

    .line 361
    .line 362
    invoke-virtual {v14}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v14

    .line 366
    array-length v15, v13

    .line 367
    if-le v15, v7, :cond_6

    .line 368
    .line 369
    aget-object v13, v13, v7

    .line 370
    .line 371
    invoke-virtual {v13}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v13

    .line 375
    goto :goto_6

    .line 376
    :cond_6
    const-string v13, "android.intent.action.VIEW"

    .line 377
    .line 378
    :goto_6
    invoke-static {v14}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 379
    .line 380
    .line 381
    move-result-object v14

    .line 382
    new-instance v15, Landroid/content/Intent;

    .line 383
    .line 384
    invoke-direct {v15, v13, v14}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v9, v15, v3}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    .line 388
    .line 389
    .line 390
    move-result-object v13

    .line 391
    if-eqz v13, :cond_7

    .line 392
    .line 393
    move v13, v7

    .line 394
    goto :goto_7

    .line 395
    :cond_7
    move v13, v8

    .line 396
    :goto_7
    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 397
    .line 398
    .line 399
    move-result-object v13

    .line 400
    invoke-virtual {v5, v12, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 404
    .line 405
    .line 406
    move-result v14

    .line 407
    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v15

    .line 411
    add-int/lit8 v14, v14, 0xe

    .line 412
    .line 413
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 414
    .line 415
    .line 416
    move-result v15

    .line 417
    move/from16 v16, v7

    .line 418
    .line 419
    new-instance v7, Ljava/lang/StringBuilder;

    .line 420
    .line 421
    add-int/2addr v14, v15

    .line 422
    invoke-direct {v7, v14}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 423
    .line 424
    .line 425
    const-string v14, "/canOpenURLs;"

    .line 426
    .line 427
    invoke-virtual {v7, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 434
    .line 435
    .line 436
    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 437
    .line 438
    .line 439
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v7

    .line 443
    invoke-static {v7}, Lgi2;->G(Ljava/lang/String;)V

    .line 444
    .line 445
    .line 446
    add-int/lit8 v11, v11, 0x1

    .line 447
    .line 448
    move/from16 v7, v16

    .line 449
    .line 450
    goto :goto_5

    .line 451
    :cond_8
    const-string v0, "openableURLs"

    .line 452
    .line 453
    invoke-interface {v4, v0, v5}, Ll52;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 454
    .line 455
    .line 456
    :goto_8
    return-void

    .line 457
    :pswitch_3
    move-object/from16 v2, p1

    .line 458
    .line 459
    check-cast v2, Lag2;

    .line 460
    .line 461
    sget-object v3, Lx32;->a:Lo32;

    .line 462
    .line 463
    const-string v3, "tx"

    .line 464
    .line 465
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v3

    .line 469
    check-cast v3, Ljava/lang/String;

    .line 470
    .line 471
    const-string v4, "ty"

    .line 472
    .line 473
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v4

    .line 477
    check-cast v4, Ljava/lang/String;

    .line 478
    .line 479
    const-string v5, "td"

    .line 480
    .line 481
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    check-cast v0, Ljava/lang/String;

    .line 486
    .line 487
    :try_start_1
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 488
    .line 489
    .line 490
    move-result v3

    .line 491
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 492
    .line 493
    .line 494
    move-result v4

    .line 495
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 496
    .line 497
    .line 498
    move-result v0

    .line 499
    invoke-interface {v2}, Lag2;->W()Lvs1;

    .line 500
    .line 501
    .line 502
    move-result-object v2

    .line 503
    if-eqz v2, :cond_9

    .line 504
    .line 505
    iget-object v2, v2, Lvs1;->b:Lrs1;

    .line 506
    .line 507
    invoke-interface {v2, v3, v4, v0}, Lrs1;->a(III)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_2

    .line 508
    .line 509
    .line 510
    goto :goto_9

    .line 511
    :catch_2
    const-string v0, "Could not parse touch parameters from gmsg."

    .line 512
    .line 513
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 514
    .line 515
    .line 516
    :cond_9
    :goto_9
    return-void

    .line 517
    :pswitch_4
    move-object/from16 v2, p1

    .line 518
    .line 519
    check-cast v2, Lag2;

    .line 520
    .line 521
    sget-object v3, Lx32;->a:Lo32;

    .line 522
    .line 523
    const-string v3, "u"

    .line 524
    .line 525
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object v0

    .line 529
    check-cast v0, Ljava/lang/String;

    .line 530
    .line 531
    if-nez v0, :cond_a

    .line 532
    .line 533
    const-string v0, "URL missing from httpTrack GMSG."

    .line 534
    .line 535
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 536
    .line 537
    .line 538
    goto :goto_c

    .line 539
    :cond_a
    sget-object v3, Lmz1;->f:Liz1;

    .line 540
    .line 541
    sget-object v4, Ltw1;->e:Ltw1;

    .line 542
    .line 543
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 544
    .line 545
    invoke-virtual {v4, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 546
    .line 547
    .line 548
    move-result-object v3

    .line 549
    check-cast v3, Ljava/lang/Boolean;

    .line 550
    .line 551
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 552
    .line 553
    .line 554
    move-result v3

    .line 555
    if-eqz v3, :cond_c

    .line 556
    .line 557
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 558
    .line 559
    .line 560
    move-result v3

    .line 561
    if-nez v3, :cond_b

    .line 562
    .line 563
    goto :goto_a

    .line 564
    :cond_b
    const-string v0, "URL is empty from httpTrack GMSG."

    .line 565
    .line 566
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 567
    .line 568
    .line 569
    goto :goto_c

    .line 570
    :cond_c
    :goto_a
    invoke-interface {v2}, Lag2;->F()La83;

    .line 571
    .line 572
    .line 573
    move-result-object v3

    .line 574
    if-eqz v3, :cond_d

    .line 575
    .line 576
    invoke-interface {v2}, Lag2;->F()La83;

    .line 577
    .line 578
    .line 579
    move-result-object v3

    .line 580
    iget-object v5, v3, La83;->x0:Lx34;

    .line 581
    .line 582
    goto :goto_b

    .line 583
    :cond_d
    const/4 v5, 0x0

    .line 584
    :goto_b
    new-instance v3, Lw72;

    .line 585
    .line 586
    invoke-interface {v2}, Lag2;->getContext()Landroid/content/Context;

    .line 587
    .line 588
    .line 589
    move-result-object v4

    .line 590
    invoke-interface {v2}, Lag2;->u()Le51;

    .line 591
    .line 592
    .line 593
    move-result-object v2

    .line 594
    iget-object v2, v2, Le51;->f:Ljava/lang/String;

    .line 595
    .line 596
    invoke-direct {v3, v4, v2, v0, v5}, Lw72;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lx34;)V

    .line 597
    .line 598
    .line 599
    invoke-virtual {v3}, Lf74;->r1()Ln70;

    .line 600
    .line 601
    .line 602
    :goto_c
    return-void

    .line 603
    :pswitch_5
    move/from16 v16, v7

    .line 604
    .line 605
    move-object/from16 v2, p1

    .line 606
    .line 607
    check-cast v2, Lag2;

    .line 608
    .line 609
    sget-object v4, Lx32;->a:Lo32;

    .line 610
    .line 611
    const-string v4, "openableIntents"

    .line 612
    .line 613
    invoke-interface {v2}, Lag2;->getContext()Landroid/content/Context;

    .line 614
    .line 615
    .line 616
    move-result-object v7

    .line 617
    invoke-virtual {v7}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 618
    .line 619
    .line 620
    move-result-object v7

    .line 621
    const-string v9, "data"

    .line 622
    .line 623
    invoke-interface {v0, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 624
    .line 625
    .line 626
    move-result-object v0

    .line 627
    check-cast v0, Ljava/lang/String;

    .line 628
    .line 629
    :try_start_2
    new-instance v9, Lorg/json/JSONObject;

    .line 630
    .line 631
    invoke-direct {v9, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_8

    .line 632
    .line 633
    .line 634
    :try_start_3
    const-string v0, "intents"

    .line 635
    .line 636
    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 637
    .line 638
    .line 639
    move-result-object v9
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_7

    .line 640
    new-instance v10, Lorg/json/JSONObject;

    .line 641
    .line 642
    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    .line 643
    .line 644
    .line 645
    move v11, v8

    .line 646
    :goto_d
    invoke-virtual {v9}, Lorg/json/JSONArray;->length()I

    .line 647
    .line 648
    .line 649
    move-result v0

    .line 650
    if-ge v11, v0, :cond_15

    .line 651
    .line 652
    :try_start_4
    invoke-virtual {v9, v11}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 653
    .line 654
    .line 655
    move-result-object v0
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_6

    .line 656
    const-string v12, "id"

    .line 657
    .line 658
    invoke-virtual {v0, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 659
    .line 660
    .line 661
    move-result-object v12

    .line 662
    const-string v13, "u"

    .line 663
    .line 664
    invoke-virtual {v0, v13}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 665
    .line 666
    .line 667
    move-result-object v13

    .line 668
    const-string v14, "i"

    .line 669
    .line 670
    invoke-virtual {v0, v14}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 671
    .line 672
    .line 673
    move-result-object v14

    .line 674
    const-string v15, "m"

    .line 675
    .line 676
    invoke-virtual {v0, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 677
    .line 678
    .line 679
    move-result-object v15

    .line 680
    const-string v5, "p"

    .line 681
    .line 682
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 683
    .line 684
    .line 685
    move-result-object v5

    .line 686
    const-string v3, "c"

    .line 687
    .line 688
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 689
    .line 690
    .line 691
    move-result-object v3

    .line 692
    const-string v6, "intent_url"

    .line 693
    .line 694
    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 695
    .line 696
    .line 697
    move-result-object v6

    .line 698
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 699
    .line 700
    .line 701
    move-result v0

    .line 702
    if-nez v0, :cond_e

    .line 703
    .line 704
    :try_start_5
    invoke-static {v6, v8}, Landroid/content/Intent;->parseUri(Ljava/lang/String;I)Landroid/content/Intent;

    .line 705
    .line 706
    .line 707
    move-result-object v0
    :try_end_5
    .catch Ljava/net/URISyntaxException; {:try_start_5 .. :try_end_5} :catch_3

    .line 708
    move/from16 v18, v8

    .line 709
    .line 710
    goto :goto_f

    .line 711
    :catch_3
    move-exception v0

    .line 712
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 713
    .line 714
    .line 715
    move-result-object v6

    .line 716
    move/from16 v18, v8

    .line 717
    .line 718
    const-string v8, "Error parsing the url: "

    .line 719
    .line 720
    invoke-virtual {v8, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 721
    .line 722
    .line 723
    move-result-object v6

    .line 724
    invoke-static {v6, v0}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 725
    .line 726
    .line 727
    :goto_e
    const/4 v0, 0x0

    .line 728
    goto :goto_f

    .line 729
    :cond_e
    move/from16 v18, v8

    .line 730
    .line 731
    goto :goto_e

    .line 732
    :goto_f
    if-nez v0, :cond_13

    .line 733
    .line 734
    new-instance v0, Landroid/content/Intent;

    .line 735
    .line 736
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 737
    .line 738
    .line 739
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 740
    .line 741
    .line 742
    move-result v6

    .line 743
    if-nez v6, :cond_f

    .line 744
    .line 745
    invoke-static {v13}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 746
    .line 747
    .line 748
    move-result-object v6

    .line 749
    invoke-virtual {v0, v6}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 750
    .line 751
    .line 752
    :cond_f
    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 753
    .line 754
    .line 755
    move-result v6

    .line 756
    if-nez v6, :cond_10

    .line 757
    .line 758
    invoke-virtual {v0, v14}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 759
    .line 760
    .line 761
    :cond_10
    invoke-static {v15}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 762
    .line 763
    .line 764
    move-result v6

    .line 765
    if-nez v6, :cond_11

    .line 766
    .line 767
    invoke-virtual {v0, v15}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 768
    .line 769
    .line 770
    :cond_11
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 771
    .line 772
    .line 773
    move-result v6

    .line 774
    if-nez v6, :cond_12

    .line 775
    .line 776
    invoke-virtual {v0, v5}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 777
    .line 778
    .line 779
    :cond_12
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 780
    .line 781
    .line 782
    move-result v5

    .line 783
    if-nez v5, :cond_13

    .line 784
    .line 785
    const-string v5, "/"

    .line 786
    .line 787
    const/4 v6, 0x2

    .line 788
    invoke-virtual {v3, v5, v6}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 789
    .line 790
    .line 791
    move-result-object v3

    .line 792
    array-length v5, v3

    .line 793
    if-ne v5, v6, :cond_13

    .line 794
    .line 795
    new-instance v5, Landroid/content/ComponentName;

    .line 796
    .line 797
    aget-object v6, v3, v18

    .line 798
    .line 799
    aget-object v3, v3, v16

    .line 800
    .line 801
    invoke-direct {v5, v6, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 802
    .line 803
    .line 804
    invoke-virtual {v0, v5}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 805
    .line 806
    .line 807
    :cond_13
    move-object v3, v0

    .line 808
    const/high16 v5, 0x10000

    .line 809
    .line 810
    :try_start_6
    invoke-virtual {v7, v3, v5}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    .line 811
    .line 812
    .line 813
    move-result-object v0
    :try_end_6
    .catch Ljava/lang/NullPointerException; {:try_start_6 .. :try_end_6} :catch_4

    .line 814
    goto :goto_10

    .line 815
    :catch_4
    move-exception v0

    .line 816
    sget-object v6, Lhg4;->C:Lhg4;

    .line 817
    .line 818
    iget-object v6, v6, Lhg4;->h:Lgd2;

    .line 819
    .line 820
    invoke-virtual {v3}, Landroid/content/Intent;->toString()Ljava/lang/String;

    .line 821
    .line 822
    .line 823
    move-result-object v3

    .line 824
    invoke-virtual {v6, v3, v0}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 825
    .line 826
    .line 827
    const/4 v0, 0x0

    .line 828
    :goto_10
    if-eqz v0, :cond_14

    .line 829
    .line 830
    move/from16 v0, v16

    .line 831
    .line 832
    goto :goto_11

    .line 833
    :cond_14
    move/from16 v0, v18

    .line 834
    .line 835
    :goto_11
    :try_start_7
    invoke-virtual {v10, v12, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_7
    .catch Lorg/json/JSONException; {:try_start_7 .. :try_end_7} :catch_5

    .line 836
    .line 837
    .line 838
    goto :goto_12

    .line 839
    :catch_5
    move-exception v0

    .line 840
    const-string v3, "Error constructing openable urls response."

    .line 841
    .line 842
    invoke-static {v3, v0}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 843
    .line 844
    .line 845
    goto :goto_12

    .line 846
    :catch_6
    move-exception v0

    .line 847
    move v5, v3

    .line 848
    move/from16 v18, v8

    .line 849
    .line 850
    const-string v3, "Error parsing the intent data."

    .line 851
    .line 852
    invoke-static {v3, v0}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 853
    .line 854
    .line 855
    :goto_12
    add-int/lit8 v11, v11, 0x1

    .line 856
    .line 857
    move v3, v5

    .line 858
    move/from16 v8, v18

    .line 859
    .line 860
    const/4 v6, 0x2

    .line 861
    goto/16 :goto_d

    .line 862
    .line 863
    :cond_15
    invoke-interface {v2, v4, v10}, Ll52;->c(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 864
    .line 865
    .line 866
    goto :goto_13

    .line 867
    :catch_7
    new-instance v0, Lorg/json/JSONObject;

    .line 868
    .line 869
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 870
    .line 871
    .line 872
    invoke-interface {v2, v4, v0}, Ll52;->c(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 873
    .line 874
    .line 875
    goto :goto_13

    .line 876
    :catch_8
    new-instance v0, Lorg/json/JSONObject;

    .line 877
    .line 878
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 879
    .line 880
    .line 881
    invoke-interface {v2, v4, v0}, Ll52;->c(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 882
    .line 883
    .line 884
    :goto_13
    return-void

    .line 885
    :pswitch_6
    move/from16 v16, v7

    .line 886
    .line 887
    move/from16 v18, v8

    .line 888
    .line 889
    move-object/from16 v2, p1

    .line 890
    .line 891
    check-cast v2, Lag2;

    .line 892
    .line 893
    sget-object v3, Lx32;->a:Lo32;

    .line 894
    .line 895
    sget-object v3, Lmz1;->S8:Liz1;

    .line 896
    .line 897
    sget-object v4, Ltw1;->e:Ltw1;

    .line 898
    .line 899
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 900
    .line 901
    invoke-virtual {v4, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 902
    .line 903
    .line 904
    move-result-object v3

    .line 905
    check-cast v3, Ljava/lang/Boolean;

    .line 906
    .line 907
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 908
    .line 909
    .line 910
    move-result v3

    .line 911
    if-nez v3, :cond_16

    .line 912
    .line 913
    const-string v0, "canOpenAppGmsgHandler disabled."

    .line 914
    .line 915
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 916
    .line 917
    .line 918
    goto :goto_15

    .line 919
    :cond_16
    const-string v3, "package_name"

    .line 920
    .line 921
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 922
    .line 923
    .line 924
    move-result-object v0

    .line 925
    check-cast v0, Ljava/lang/String;

    .line 926
    .line 927
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 928
    .line 929
    .line 930
    move-result v3

    .line 931
    if-eqz v3, :cond_17

    .line 932
    .line 933
    const-string v0, "Package name missing in canOpenApp GMSG."

    .line 934
    .line 935
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 936
    .line 937
    .line 938
    goto :goto_15

    .line 939
    :cond_17
    new-instance v3, Ljava/util/HashMap;

    .line 940
    .line 941
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 942
    .line 943
    .line 944
    invoke-interface {v2}, Lag2;->getContext()Landroid/content/Context;

    .line 945
    .line 946
    .line 947
    move-result-object v4

    .line 948
    invoke-virtual {v4}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 949
    .line 950
    .line 951
    move-result-object v4

    .line 952
    invoke-virtual {v4, v0}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 953
    .line 954
    .line 955
    move-result-object v4

    .line 956
    if-eqz v4, :cond_18

    .line 957
    .line 958
    move/from16 v7, v16

    .line 959
    .line 960
    goto :goto_14

    .line 961
    :cond_18
    move/from16 v7, v18

    .line 962
    .line 963
    :goto_14
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 964
    .line 965
    .line 966
    move-result-object v4

    .line 967
    invoke-virtual {v3, v0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 968
    .line 969
    .line 970
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 971
    .line 972
    .line 973
    move-result-object v5

    .line 974
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 975
    .line 976
    .line 977
    move-result v5

    .line 978
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 979
    .line 980
    .line 981
    move-result-object v6

    .line 982
    add-int/lit8 v5, v5, 0xd

    .line 983
    .line 984
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 985
    .line 986
    .line 987
    move-result v6

    .line 988
    new-instance v7, Ljava/lang/StringBuilder;

    .line 989
    .line 990
    add-int/2addr v5, v6

    .line 991
    invoke-direct {v7, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 992
    .line 993
    .line 994
    const-string v5, "/canOpenApp;"

    .line 995
    .line 996
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 997
    .line 998
    .line 999
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1000
    .line 1001
    .line 1002
    const-string v0, ";"

    .line 1003
    .line 1004
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1005
    .line 1006
    .line 1007
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1008
    .line 1009
    .line 1010
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v0

    .line 1014
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 1015
    .line 1016
    .line 1017
    const-string v0, "openableApp"

    .line 1018
    .line 1019
    invoke-interface {v2, v0, v3}, Ll52;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 1020
    .line 1021
    .line 1022
    :goto_15
    return-void

    .line 1023
    :pswitch_7
    move/from16 v16, v7

    .line 1024
    .line 1025
    move/from16 v18, v8

    .line 1026
    .line 1027
    const-string v2, "start"

    .line 1028
    .line 1029
    move-object/from16 v3, p1

    .line 1030
    .line 1031
    check-cast v3, Lag2;

    .line 1032
    .line 1033
    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1034
    .line 1035
    .line 1036
    move-result v2

    .line 1037
    if-eqz v2, :cond_19

    .line 1038
    .line 1039
    move/from16 v2, v16

    .line 1040
    .line 1041
    invoke-interface {v3, v2}, Lag2;->e1(Z)V

    .line 1042
    .line 1043
    .line 1044
    :cond_19
    const-string v2, "stop"

    .line 1045
    .line 1046
    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1047
    .line 1048
    .line 1049
    move-result v0

    .line 1050
    if-eqz v0, :cond_1a

    .line 1051
    .line 1052
    move/from16 v2, v18

    .line 1053
    .line 1054
    invoke-interface {v3, v2}, Lag2;->e1(Z)V

    .line 1055
    .line 1056
    .line 1057
    :cond_1a
    return-void

    .line 1058
    :pswitch_8
    const-string v2, "start"

    .line 1059
    .line 1060
    move-object/from16 v3, p1

    .line 1061
    .line 1062
    check-cast v3, Lag2;

    .line 1063
    .line 1064
    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1065
    .line 1066
    .line 1067
    move-result v2

    .line 1068
    if-eqz v2, :cond_1b

    .line 1069
    .line 1070
    invoke-interface {v3}, Lag2;->e0()Lsg2;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v0

    .line 1074
    iget-object v2, v0, Lsg2;->i:Ljava/lang/Object;

    .line 1075
    .line 1076
    monitor-enter v2

    .line 1077
    :try_start_8
    monitor-exit v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 1078
    iget v2, v0, Lsg2;->H:I

    .line 1079
    .line 1080
    const/16 v16, 0x1

    .line 1081
    .line 1082
    add-int/lit8 v2, v2, 0x1

    .line 1083
    .line 1084
    iput v2, v0, Lsg2;->H:I

    .line 1085
    .line 1086
    invoke-virtual {v0}, Lsg2;->Y()V

    .line 1087
    .line 1088
    .line 1089
    goto :goto_16

    .line 1090
    :catchall_0
    move-exception v0

    .line 1091
    :try_start_9
    monitor-exit v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 1092
    throw v0

    .line 1093
    :cond_1b
    const-string v2, "stop"

    .line 1094
    .line 1095
    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1096
    .line 1097
    .line 1098
    move-result v2

    .line 1099
    if-eqz v2, :cond_1c

    .line 1100
    .line 1101
    invoke-interface {v3}, Lag2;->e0()Lsg2;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v0

    .line 1105
    iget v2, v0, Lsg2;->H:I

    .line 1106
    .line 1107
    add-int/lit8 v2, v2, -0x1

    .line 1108
    .line 1109
    iput v2, v0, Lsg2;->H:I

    .line 1110
    .line 1111
    invoke-virtual {v0}, Lsg2;->Y()V

    .line 1112
    .line 1113
    .line 1114
    goto :goto_16

    .line 1115
    :cond_1c
    const-string v2, "cancel"

    .line 1116
    .line 1117
    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1118
    .line 1119
    .line 1120
    move-result v0

    .line 1121
    if-eqz v0, :cond_1e

    .line 1122
    .line 1123
    invoke-interface {v3}, Lag2;->e0()Lsg2;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v0

    .line 1127
    iget-object v2, v0, Lsg2;->g:Lcx1;

    .line 1128
    .line 1129
    if-eqz v2, :cond_1d

    .line 1130
    .line 1131
    const/16 v3, 0x2715

    .line 1132
    .line 1133
    invoke-virtual {v2, v3}, Lcx1;->b(I)V

    .line 1134
    .line 1135
    .line 1136
    :cond_1d
    const/4 v2, 0x1

    .line 1137
    iput-boolean v2, v0, Lsg2;->G:Z

    .line 1138
    .line 1139
    const/16 v2, 0x2714

    .line 1140
    .line 1141
    iput v2, v0, Lsg2;->s:I

    .line 1142
    .line 1143
    const-string v2, "Page loaded delay cancel."

    .line 1144
    .line 1145
    iput-object v2, v0, Lsg2;->t:Ljava/lang/String;

    .line 1146
    .line 1147
    invoke-virtual {v0}, Lsg2;->Y()V

    .line 1148
    .line 1149
    .line 1150
    iget-object v0, v0, Lsg2;->f:Ljg2;

    .line 1151
    .line 1152
    invoke-virtual {v0}, Ljg2;->destroy()V

    .line 1153
    .line 1154
    .line 1155
    :cond_1e
    :goto_16
    return-void

    .line 1156
    :pswitch_9
    const-string v2, "action"

    .line 1157
    .line 1158
    move-object/from16 v3, p1

    .line 1159
    .line 1160
    check-cast v3, Lag2;

    .line 1161
    .line 1162
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v0

    .line 1166
    check-cast v0, Ljava/lang/String;

    .line 1167
    .line 1168
    const-string v2, "pause"

    .line 1169
    .line 1170
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1171
    .line 1172
    .line 1173
    move-result v2

    .line 1174
    if-eqz v2, :cond_1f

    .line 1175
    .line 1176
    invoke-interface {v3}, Lgd4;->O()V

    .line 1177
    .line 1178
    .line 1179
    goto :goto_17

    .line 1180
    :cond_1f
    const-string v2, "resume"

    .line 1181
    .line 1182
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1183
    .line 1184
    .line 1185
    move-result v0

    .line 1186
    if-eqz v0, :cond_20

    .line 1187
    .line 1188
    invoke-interface {v3}, Lgd4;->e()V

    .line 1189
    .line 1190
    .line 1191
    :cond_20
    :goto_17
    return-void

    .line 1192
    :pswitch_a
    const-string v2, "disabled"

    .line 1193
    .line 1194
    move-object/from16 v3, p1

    .line 1195
    .line 1196
    check-cast v3, Lag2;

    .line 1197
    .line 1198
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v0

    .line 1202
    check-cast v0, Ljava/lang/String;

    .line 1203
    .line 1204
    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 1205
    .line 1206
    .line 1207
    move-result v0

    .line 1208
    const/16 v16, 0x1

    .line 1209
    .line 1210
    xor-int/lit8 v0, v0, 0x1

    .line 1211
    .line 1212
    invoke-interface {v3, v0}, Lag2;->X0(Z)V

    .line 1213
    .line 1214
    .line 1215
    return-void

    .line 1216
    :pswitch_b
    move-object/from16 v0, p1

    .line 1217
    .line 1218
    check-cast v0, Lag2;

    .line 1219
    .line 1220
    invoke-interface {v0}, Lag2;->C0()Lq12;

    .line 1221
    .line 1222
    .line 1223
    move-result-object v0

    .line 1224
    if-eqz v0, :cond_21

    .line 1225
    .line 1226
    invoke-interface {v0}, Lq12;->a()V

    .line 1227
    .line 1228
    .line 1229
    :cond_21
    return-void

    .line 1230
    :pswitch_c
    const-string v2, "string"

    .line 1231
    .line 1232
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v0

    .line 1236
    check-cast v0, Ljava/lang/String;

    .line 1237
    .line 1238
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1239
    .line 1240
    .line 1241
    move-result-object v0

    .line 1242
    const-string v2, "Received log message: "

    .line 1243
    .line 1244
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1245
    .line 1246
    .line 1247
    move-result-object v0

    .line 1248
    invoke-static {v0}, Lgi2;->f0(Ljava/lang/String;)V

    .line 1249
    .line 1250
    .line 1251
    return-void

    .line 1252
    :pswitch_d
    const-string v2, "custom_close"

    .line 1253
    .line 1254
    move-object/from16 v3, p1

    .line 1255
    .line 1256
    check-cast v3, Lag2;

    .line 1257
    .line 1258
    const-string v4, "1"

    .line 1259
    .line 1260
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1261
    .line 1262
    .line 1263
    move-result-object v0

    .line 1264
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1265
    .line 1266
    .line 1267
    move-result v0

    .line 1268
    invoke-interface {v3, v0}, Lag2;->y0(Z)V

    .line 1269
    .line 1270
    .line 1271
    return-void

    .line 1272
    :pswitch_e
    move-object/from16 v0, p1

    .line 1273
    .line 1274
    check-cast v0, Lag2;

    .line 1275
    .line 1276
    invoke-interface {v0}, Lag2;->X()Lfw1;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v2

    .line 1280
    if-eqz v2, :cond_22

    .line 1281
    .line 1282
    invoke-interface {v0}, Lag2;->X()Lfw1;

    .line 1283
    .line 1284
    .line 1285
    move-result-object v2

    .line 1286
    check-cast v2, Ly63;

    .line 1287
    .line 1288
    invoke-virtual {v2, v4}, Ly63;->B3(I)V

    .line 1289
    .line 1290
    .line 1291
    :cond_22
    invoke-interface {v0}, Lag2;->z0()Ljh1;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v2

    .line 1295
    if-eqz v2, :cond_23

    .line 1296
    .line 1297
    invoke-virtual {v2}, Ljh1;->y()V

    .line 1298
    .line 1299
    .line 1300
    goto :goto_18

    .line 1301
    :cond_23
    invoke-interface {v0}, Lag2;->O0()Ljh1;

    .line 1302
    .line 1303
    .line 1304
    move-result-object v0

    .line 1305
    if-eqz v0, :cond_24

    .line 1306
    .line 1307
    invoke-virtual {v0}, Ljh1;->y()V

    .line 1308
    .line 1309
    .line 1310
    goto :goto_18

    .line 1311
    :cond_24
    const-string v0, "A GMSG tried to close something that wasn\'t an overlay."

    .line 1312
    .line 1313
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 1314
    .line 1315
    .line 1316
    :goto_18
    return-void

    .line 1317
    :pswitch_f
    const-string v2, "args"

    .line 1318
    .line 1319
    move-object/from16 v3, p1

    .line 1320
    .line 1321
    check-cast v3, Lag2;

    .line 1322
    .line 1323
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1324
    .line 1325
    .line 1326
    move-result-object v0

    .line 1327
    check-cast v0, Ljava/lang/String;

    .line 1328
    .line 1329
    :try_start_a
    new-instance v2, Lorg/json/JSONArray;

    .line 1330
    .line 1331
    invoke-direct {v2, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 1332
    .line 1333
    .line 1334
    invoke-interface {v3}, Lag2;->getContext()Landroid/content/Context;

    .line 1335
    .line 1336
    .line 1337
    move-result-object v0

    .line 1338
    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 1339
    .line 1340
    .line 1341
    move-result-object v0

    .line 1342
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 1343
    .line 1344
    .line 1345
    move-result-object v0

    .line 1346
    const/4 v8, 0x0

    .line 1347
    :goto_19
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    .line 1348
    .line 1349
    .line 1350
    move-result v3

    .line 1351
    if-ge v8, v3, :cond_25

    .line 1352
    .line 1353
    invoke-virtual {v2, v8}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 1354
    .line 1355
    .line 1356
    move-result-object v3

    .line 1357
    invoke-interface {v0, v3}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 1358
    .line 1359
    .line 1360
    add-int/lit8 v8, v8, 0x1

    .line 1361
    .line 1362
    goto :goto_19

    .line 1363
    :catch_9
    move-exception v0

    .line 1364
    goto :goto_1a

    .line 1365
    :cond_25
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_a
    .catch Lorg/json/JSONException; {:try_start_a .. :try_end_a} :catch_9

    .line 1366
    .line 1367
    .line 1368
    goto :goto_1b

    .line 1369
    :goto_1a
    const-string v2, "GMSG clear local storage keys handler"

    .line 1370
    .line 1371
    sget-object v3, Lhg4;->C:Lhg4;

    .line 1372
    .line 1373
    iget-object v3, v3, Lhg4;->h:Lgd2;

    .line 1374
    .line 1375
    invoke-virtual {v3, v2, v0}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1376
    .line 1377
    .line 1378
    :goto_1b
    return-void

    .line 1379
    :pswitch_10
    const-string v2, "args"

    .line 1380
    .line 1381
    move-object/from16 v3, p1

    .line 1382
    .line 1383
    check-cast v3, Lag2;

    .line 1384
    .line 1385
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1386
    .line 1387
    .line 1388
    move-result-object v0

    .line 1389
    check-cast v0, Ljava/lang/String;

    .line 1390
    .line 1391
    :try_start_b
    new-instance v2, Lorg/json/JSONObject;

    .line 1392
    .line 1393
    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 1394
    .line 1395
    .line 1396
    invoke-virtual {v2}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 1397
    .line 1398
    .line 1399
    move-result-object v0

    .line 1400
    invoke-interface {v3}, Lag2;->getContext()Landroid/content/Context;

    .line 1401
    .line 1402
    .line 1403
    move-result-object v3

    .line 1404
    invoke-static {v3}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 1405
    .line 1406
    .line 1407
    move-result-object v3

    .line 1408
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 1409
    .line 1410
    .line 1411
    move-result-object v3

    .line 1412
    :cond_26
    :goto_1c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1413
    .line 1414
    .line 1415
    move-result v4

    .line 1416
    if-eqz v4, :cond_2c

    .line 1417
    .line 1418
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1419
    .line 1420
    .line 1421
    move-result-object v4

    .line 1422
    check-cast v4, Ljava/lang/String;

    .line 1423
    .line 1424
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 1425
    .line 1426
    .line 1427
    move-result-object v5

    .line 1428
    instance-of v6, v5, Ljava/lang/Integer;

    .line 1429
    .line 1430
    if-eqz v6, :cond_27

    .line 1431
    .line 1432
    check-cast v5, Ljava/lang/Integer;

    .line 1433
    .line 1434
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 1435
    .line 1436
    .line 1437
    move-result v5

    .line 1438
    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 1439
    .line 1440
    .line 1441
    goto :goto_1c

    .line 1442
    :catch_a
    move-exception v0

    .line 1443
    goto :goto_1d

    .line 1444
    :cond_27
    instance-of v6, v5, Ljava/lang/Long;

    .line 1445
    .line 1446
    if-eqz v6, :cond_28

    .line 1447
    .line 1448
    check-cast v5, Ljava/lang/Long;

    .line 1449
    .line 1450
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 1451
    .line 1452
    .line 1453
    move-result-wide v5

    .line 1454
    invoke-interface {v3, v4, v5, v6}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 1455
    .line 1456
    .line 1457
    goto :goto_1c

    .line 1458
    :cond_28
    instance-of v6, v5, Ljava/lang/Double;

    .line 1459
    .line 1460
    if-eqz v6, :cond_29

    .line 1461
    .line 1462
    check-cast v5, Ljava/lang/Double;

    .line 1463
    .line 1464
    invoke-virtual {v5}, Ljava/lang/Double;->floatValue()F

    .line 1465
    .line 1466
    .line 1467
    move-result v5

    .line 1468
    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    .line 1469
    .line 1470
    .line 1471
    goto :goto_1c

    .line 1472
    :cond_29
    instance-of v6, v5, Ljava/lang/Float;

    .line 1473
    .line 1474
    if-eqz v6, :cond_2a

    .line 1475
    .line 1476
    check-cast v5, Ljava/lang/Float;

    .line 1477
    .line 1478
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    .line 1479
    .line 1480
    .line 1481
    move-result v5

    .line 1482
    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    .line 1483
    .line 1484
    .line 1485
    goto :goto_1c

    .line 1486
    :cond_2a
    instance-of v6, v5, Ljava/lang/Boolean;

    .line 1487
    .line 1488
    if-eqz v6, :cond_2b

    .line 1489
    .line 1490
    check-cast v5, Ljava/lang/Boolean;

    .line 1491
    .line 1492
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1493
    .line 1494
    .line 1495
    move-result v5

    .line 1496
    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 1497
    .line 1498
    .line 1499
    goto :goto_1c

    .line 1500
    :cond_2b
    instance-of v6, v5, Ljava/lang/String;

    .line 1501
    .line 1502
    if-eqz v6, :cond_26

    .line 1503
    .line 1504
    check-cast v5, Ljava/lang/String;

    .line 1505
    .line 1506
    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 1507
    .line 1508
    .line 1509
    goto :goto_1c

    .line 1510
    :cond_2c
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_b
    .catch Lorg/json/JSONException; {:try_start_b .. :try_end_b} :catch_a

    .line 1511
    .line 1512
    .line 1513
    goto :goto_1e

    .line 1514
    :goto_1d
    const-string v2, "GMSG write local storage KV pairs handler"

    .line 1515
    .line 1516
    sget-object v3, Lhg4;->C:Lhg4;

    .line 1517
    .line 1518
    iget-object v3, v3, Lhg4;->h:Lgd2;

    .line 1519
    .line 1520
    invoke-virtual {v3, v2, v0}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1521
    .line 1522
    .line 1523
    :goto_1e
    return-void

    .line 1524
    :pswitch_11
    move-object/from16 v2, p1

    .line 1525
    .line 1526
    check-cast v2, Lag2;

    .line 1527
    .line 1528
    :try_start_c
    const-string v3, "enabled"

    .line 1529
    .line 1530
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1531
    .line 1532
    .line 1533
    move-result-object v0

    .line 1534
    check-cast v0, Ljava/lang/String;

    .line 1535
    .line 1536
    sget-object v3, Lx32;->a:Lo32;

    .line 1537
    .line 1538
    const-string v3, "true"

    .line 1539
    .line 1540
    invoke-static {v3, v0}, Lum;->L(Ljava/lang/String;Ljava/lang/CharSequence;)Z

    .line 1541
    .line 1542
    .line 1543
    move-result v3

    .line 1544
    if-nez v3, :cond_2d

    .line 1545
    .line 1546
    const-string v3, "false"

    .line 1547
    .line 1548
    invoke-static {v3, v0}, Lum;->L(Ljava/lang/String;Ljava/lang/CharSequence;)Z

    .line 1549
    .line 1550
    .line 1551
    move-result v3

    .line 1552
    if-eqz v3, :cond_2e

    .line 1553
    .line 1554
    goto :goto_1f

    .line 1555
    :catch_b
    move-exception v0

    .line 1556
    goto :goto_20

    .line 1557
    :cond_2d
    :goto_1f
    invoke-interface {v2}, Lag2;->getContext()Landroid/content/Context;

    .line 1558
    .line 1559
    .line 1560
    move-result-object v2

    .line 1561
    invoke-static {v2}, Lkf3;->U(Landroid/content/Context;)Lkf3;

    .line 1562
    .line 1563
    .line 1564
    move-result-object v2

    .line 1565
    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 1566
    .line 1567
    .line 1568
    move-result v0

    .line 1569
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1570
    .line 1571
    .line 1572
    const-class v3, Lkf3;

    .line 1573
    .line 1574
    monitor-enter v3
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_b

    .line 1575
    :try_start_d
    iget-object v2, v2, Lkf3;->g:Ljava/lang/Object;

    .line 1576
    .line 1577
    check-cast v2, Lwt2;

    .line 1578
    .line 1579
    const-string v4, "paidv2_user_option"

    .line 1580
    .line 1581
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1582
    .line 1583
    .line 1584
    move-result-object v0

    .line 1585
    invoke-virtual {v2, v0, v4}, Lwt2;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1586
    .line 1587
    .line 1588
    monitor-exit v3

    .line 1589
    goto :goto_21

    .line 1590
    :catchall_1
    move-exception v0

    .line 1591
    monitor-exit v3
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    .line 1592
    :try_start_e
    throw v0
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_b

    .line 1593
    :goto_20
    const-string v2, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled"

    .line 1594
    .line 1595
    sget-object v3, Lhg4;->C:Lhg4;

    .line 1596
    .line 1597
    iget-object v3, v3, Lhg4;->h:Lgd2;

    .line 1598
    .line 1599
    invoke-virtual {v3, v2, v0}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1600
    .line 1601
    .line 1602
    :cond_2e
    :goto_21
    return-void

    .line 1603
    :pswitch_12
    move-object/from16 v0, p1

    .line 1604
    .line 1605
    check-cast v0, Lag2;

    .line 1606
    .line 1607
    :try_start_f
    invoke-interface {v0}, Lag2;->getContext()Landroid/content/Context;

    .line 1608
    .line 1609
    .line 1610
    move-result-object v2

    .line 1611
    invoke-static {v2}, Lmf3;->f(Landroid/content/Context;)Lmf3;

    .line 1612
    .line 1613
    .line 1614
    move-result-object v2

    .line 1615
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1616
    .line 1617
    .line 1618
    const-class v3, Lmf3;

    .line 1619
    .line 1620
    monitor-enter v3
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_c

    .line 1621
    const/4 v4, 0x0

    .line 1622
    :try_start_10
    invoke-virtual {v2, v4}, Llf3;->c(Z)V

    .line 1623
    .line 1624
    .line 1625
    monitor-exit v3
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_2

    .line 1626
    :try_start_11
    invoke-interface {v0}, Lag2;->getContext()Landroid/content/Context;

    .line 1627
    .line 1628
    .line 1629
    move-result-object v2

    .line 1630
    invoke-static {v2}, Lnf3;->f(Landroid/content/Context;)Lnf3;

    .line 1631
    .line 1632
    .line 1633
    move-result-object v2

    .line 1634
    invoke-virtual {v2}, Lnf3;->h()V

    .line 1635
    .line 1636
    .line 1637
    invoke-interface {v0}, Lag2;->getContext()Landroid/content/Context;

    .line 1638
    .line 1639
    .line 1640
    move-result-object v0

    .line 1641
    invoke-static {v0}, Lof3;->f(Landroid/content/Context;)Lof3;

    .line 1642
    .line 1643
    .line 1644
    move-result-object v0

    .line 1645
    invoke-virtual {v0}, Lof3;->h()V
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_c

    .line 1646
    .line 1647
    .line 1648
    goto :goto_23

    .line 1649
    :catch_c
    move-exception v0

    .line 1650
    goto :goto_22

    .line 1651
    :catchall_2
    move-exception v0

    .line 1652
    :try_start_12
    monitor-exit v3
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_2

    .line 1653
    :try_start_13
    throw v0
    :try_end_13
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_c

    .line 1654
    :goto_22
    const-string v2, "DefaultGmsgHandlers.ResetPaid"

    .line 1655
    .line 1656
    sget-object v3, Lhg4;->C:Lhg4;

    .line 1657
    .line 1658
    iget-object v3, v3, Lhg4;->h:Lgd2;

    .line 1659
    .line 1660
    invoke-virtual {v3, v2, v0}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1661
    .line 1662
    .line 1663
    :goto_23
    return-void

    .line 1664
    :pswitch_13
    move-object/from16 v0, p1

    .line 1665
    .line 1666
    check-cast v0, Lag2;

    .line 1667
    .line 1668
    sget-object v0, Lhg4;->C:Lhg4;

    .line 1669
    .line 1670
    iget-object v0, v0, Lhg4;->s:Lzb1;

    .line 1671
    .line 1672
    iget-boolean v2, v0, Lzb1;->f:Z

    .line 1673
    .line 1674
    if-eqz v2, :cond_34

    .line 1675
    .line 1676
    iget-object v2, v0, Lzb1;->j:Ljava/lang/Object;

    .line 1677
    .line 1678
    check-cast v2, Lrc3;

    .line 1679
    .line 1680
    if-nez v2, :cond_2f

    .line 1681
    .line 1682
    goto/16 :goto_26

    .line 1683
    .line 1684
    :cond_2f
    sget-object v3, Lmz1;->mc:Liz1;

    .line 1685
    .line 1686
    sget-object v4, Ltw1;->e:Ltw1;

    .line 1687
    .line 1688
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 1689
    .line 1690
    invoke-virtual {v4, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1691
    .line 1692
    .line 1693
    move-result-object v3

    .line 1694
    check-cast v3, Ljava/lang/Boolean;

    .line 1695
    .line 1696
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1697
    .line 1698
    .line 1699
    move-result v3

    .line 1700
    if-eqz v3, :cond_30

    .line 1701
    .line 1702
    iget-object v3, v0, Lzb1;->h:Ljava/lang/Object;

    .line 1703
    .line 1704
    check-cast v3, Ljava/lang/String;

    .line 1705
    .line 1706
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1707
    .line 1708
    .line 1709
    move-result v3

    .line 1710
    if-nez v3, :cond_30

    .line 1711
    .line 1712
    iget-object v3, v0, Lzb1;->h:Ljava/lang/Object;

    .line 1713
    .line 1714
    check-cast v3, Ljava/lang/String;

    .line 1715
    .line 1716
    :goto_24
    const/4 v5, 0x0

    .line 1717
    goto :goto_25

    .line 1718
    :cond_30
    iget-object v3, v0, Lzb1;->g:Ljava/lang/Object;

    .line 1719
    .line 1720
    check-cast v3, Ljava/lang/String;

    .line 1721
    .line 1722
    if-eqz v3, :cond_31

    .line 1723
    .line 1724
    move-object v5, v3

    .line 1725
    const/4 v3, 0x0

    .line 1726
    goto :goto_25

    .line 1727
    :cond_31
    const-string v3, "Missing session token and/or appId"

    .line 1728
    .line 1729
    const-string v4, "onLMDupdate"

    .line 1730
    .line 1731
    invoke-virtual {v0, v3, v4}, Lzb1;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1732
    .line 1733
    .line 1734
    const/4 v3, 0x0

    .line 1735
    goto :goto_24

    .line 1736
    :goto_25
    new-instance v4, Llk3;

    .line 1737
    .line 1738
    invoke-direct {v4, v5, v3}, Llk3;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1739
    .line 1740
    .line 1741
    iget-object v0, v0, Lzb1;->k:Ljava/lang/Object;

    .line 1742
    .line 1743
    check-cast v0, Lit3;

    .line 1744
    .line 1745
    iget-object v2, v2, Lrc3;->g:Ljava/lang/Object;

    .line 1746
    .line 1747
    check-cast v2, Lrk3;

    .line 1748
    .line 1749
    iget-object v6, v2, Lrk3;->a:Lx03;

    .line 1750
    .line 1751
    if-nez v6, :cond_32

    .line 1752
    .line 1753
    sget-object v0, Lrk3;->c:Ler3;

    .line 1754
    .line 1755
    const-string v2, "Play Store not found."

    .line 1756
    .line 1757
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 1758
    .line 1759
    .line 1760
    move-result-object v2

    .line 1761
    const-string v3, "error: %s"

    .line 1762
    .line 1763
    invoke-virtual {v0, v3, v2}, Ler3;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1764
    .line 1765
    .line 1766
    goto :goto_27

    .line 1767
    :cond_32
    filled-new-array {v5, v3}, [Ljava/lang/String;

    .line 1768
    .line 1769
    .line 1770
    move-result-object v3

    .line 1771
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1772
    .line 1773
    .line 1774
    move-result-object v3

    .line 1775
    const-string v5, "Failed to apply OverlayDisplayDismissRequest: missing appId and sessionToken."

    .line 1776
    .line 1777
    invoke-static {v0, v5, v3}, Lrk3;->c(Lit3;Ljava/lang/String;Ljava/util/List;)Z

    .line 1778
    .line 1779
    .line 1780
    move-result v3

    .line 1781
    if-nez v3, :cond_33

    .line 1782
    .line 1783
    goto :goto_27

    .line 1784
    :cond_33
    new-instance v3, Lgi;

    .line 1785
    .line 1786
    const/16 v5, 0x17

    .line 1787
    .line 1788
    invoke-direct {v3, v2, v4, v0, v5}, Lgi;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1789
    .line 1790
    .line 1791
    new-instance v0, Lvk3;

    .line 1792
    .line 1793
    const/4 v2, 0x0

    .line 1794
    invoke-direct {v0, v6, v3, v2}, Lvk3;-><init>(Lx03;Ljava/lang/Runnable;I)V

    .line 1795
    .line 1796
    .line 1797
    invoke-virtual {v6, v0}, Lx03;->c(Ljava/lang/Runnable;)V

    .line 1798
    .line 1799
    .line 1800
    goto :goto_27

    .line 1801
    :cond_34
    :goto_26
    const-string v0, "LastMileDelivery not connected"

    .line 1802
    .line 1803
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 1804
    .line 1805
    .line 1806
    :goto_27
    return-void

    .line 1807
    :pswitch_14
    move-object/from16 v0, p1

    .line 1808
    .line 1809
    check-cast v0, Lag2;

    .line 1810
    .line 1811
    sget-object v0, Lhg4;->C:Lhg4;

    .line 1812
    .line 1813
    iget-object v0, v0, Lhg4;->s:Lzb1;

    .line 1814
    .line 1815
    iget-boolean v2, v0, Lzb1;->f:Z

    .line 1816
    .line 1817
    if-eqz v2, :cond_36

    .line 1818
    .line 1819
    iget-object v2, v0, Lzb1;->j:Ljava/lang/Object;

    .line 1820
    .line 1821
    check-cast v2, Lrc3;

    .line 1822
    .line 1823
    if-nez v2, :cond_35

    .line 1824
    .line 1825
    goto :goto_28

    .line 1826
    :cond_35
    invoke-virtual {v0}, Lzb1;->g()Lpk3;

    .line 1827
    .line 1828
    .line 1829
    move-result-object v3

    .line 1830
    iget-object v4, v0, Lzb1;->k:Ljava/lang/Object;

    .line 1831
    .line 1832
    check-cast v4, Lit3;

    .line 1833
    .line 1834
    iget-object v2, v2, Lrc3;->g:Ljava/lang/Object;

    .line 1835
    .line 1836
    check-cast v2, Lrk3;

    .line 1837
    .line 1838
    const/4 v6, 0x2

    .line 1839
    invoke-virtual {v2, v3, v4, v6}, Lrk3;->a(Lpk3;Lit3;I)V

    .line 1840
    .line 1841
    .line 1842
    const-string v2, "onLMDOverlayCollapse"

    .line 1843
    .line 1844
    new-instance v3, Ljava/util/HashMap;

    .line 1845
    .line 1846
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 1847
    .line 1848
    .line 1849
    invoke-virtual {v0, v2, v3}, Lzb1;->f(Ljava/lang/String;Ljava/util/HashMap;)V

    .line 1850
    .line 1851
    .line 1852
    goto :goto_29

    .line 1853
    :cond_36
    :goto_28
    const-string v0, "LastMileDelivery not connected"

    .line 1854
    .line 1855
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 1856
    .line 1857
    .line 1858
    :goto_29
    return-void

    .line 1859
    :pswitch_15
    move-object/from16 v0, p1

    .line 1860
    .line 1861
    check-cast v0, Lag2;

    .line 1862
    .line 1863
    sget-object v0, Lhg4;->C:Lhg4;

    .line 1864
    .line 1865
    iget-object v0, v0, Lhg4;->s:Lzb1;

    .line 1866
    .line 1867
    iget-boolean v2, v0, Lzb1;->f:Z

    .line 1868
    .line 1869
    if-eqz v2, :cond_38

    .line 1870
    .line 1871
    iget-object v2, v0, Lzb1;->j:Ljava/lang/Object;

    .line 1872
    .line 1873
    check-cast v2, Lrc3;

    .line 1874
    .line 1875
    if-nez v2, :cond_37

    .line 1876
    .line 1877
    goto :goto_2a

    .line 1878
    :cond_37
    invoke-virtual {v0}, Lzb1;->g()Lpk3;

    .line 1879
    .line 1880
    .line 1881
    move-result-object v3

    .line 1882
    iget-object v4, v0, Lzb1;->k:Ljava/lang/Object;

    .line 1883
    .line 1884
    check-cast v4, Lit3;

    .line 1885
    .line 1886
    iget-object v2, v2, Lrc3;->g:Ljava/lang/Object;

    .line 1887
    .line 1888
    check-cast v2, Lrk3;

    .line 1889
    .line 1890
    const/4 v5, 0x1

    .line 1891
    invoke-virtual {v2, v3, v4, v5}, Lrk3;->a(Lpk3;Lit3;I)V

    .line 1892
    .line 1893
    .line 1894
    const-string v2, "onLMDOverlayExpand"

    .line 1895
    .line 1896
    new-instance v3, Ljava/util/HashMap;

    .line 1897
    .line 1898
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 1899
    .line 1900
    .line 1901
    invoke-virtual {v0, v2, v3}, Lzb1;->f(Ljava/lang/String;Ljava/util/HashMap;)V

    .line 1902
    .line 1903
    .line 1904
    goto :goto_2b

    .line 1905
    :cond_38
    :goto_2a
    const-string v0, "LastMileDelivery not connected"

    .line 1906
    .line 1907
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 1908
    .line 1909
    .line 1910
    :goto_2b
    return-void

    .line 1911
    :pswitch_16
    const-string v2, "enifd"

    .line 1912
    .line 1913
    const-string v3, "verticalMargin"

    .line 1914
    .line 1915
    const-string v4, "gravityY"

    .line 1916
    .line 1917
    const-string v5, "gravityX"

    .line 1918
    .line 1919
    const-string v6, "appId"

    .line 1920
    .line 1921
    move-object/from16 v7, p1

    .line 1922
    .line 1923
    check-cast v7, Lag2;

    .line 1924
    .line 1925
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1926
    .line 1927
    .line 1928
    move-result-object v8

    .line 1929
    check-cast v8, Ljava/lang/CharSequence;

    .line 1930
    .line 1931
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1932
    .line 1933
    .line 1934
    move-result v8

    .line 1935
    if-eqz v8, :cond_39

    .line 1936
    .line 1937
    const-string v0, "Missing App Id, cannot show LMD Overlay without it"

    .line 1938
    .line 1939
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 1940
    .line 1941
    .line 1942
    goto/16 :goto_2e

    .line 1943
    .line 1944
    :cond_39
    new-instance v8, Lmk3;

    .line 1945
    .line 1946
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 1947
    .line 1948
    .line 1949
    const v9, 0x800053

    .line 1950
    .line 1951
    .line 1952
    iput v9, v8, Lmk3;->c:I

    .line 1953
    .line 1954
    iget-byte v9, v8, Lmk3;->g:B

    .line 1955
    .line 1956
    const/16 v16, 0x1

    .line 1957
    .line 1958
    or-int/lit8 v9, v9, 0x1

    .line 1959
    .line 1960
    int-to-byte v9, v9

    .line 1961
    const/high16 v10, -0x40800000    # -1.0f

    .line 1962
    .line 1963
    iput v10, v8, Lmk3;->d:F

    .line 1964
    .line 1965
    const/16 v17, 0x2

    .line 1966
    .line 1967
    or-int/lit8 v9, v9, 0x2

    .line 1968
    .line 1969
    int-to-byte v9, v9

    .line 1970
    or-int/lit8 v9, v9, 0x4

    .line 1971
    .line 1972
    int-to-byte v9, v9

    .line 1973
    or-int/lit8 v9, v9, 0x8

    .line 1974
    .line 1975
    int-to-byte v9, v9

    .line 1976
    iput-byte v9, v8, Lmk3;->g:B

    .line 1977
    .line 1978
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1979
    .line 1980
    .line 1981
    move-result-object v6

    .line 1982
    check-cast v6, Ljava/lang/String;

    .line 1983
    .line 1984
    iput-object v6, v8, Lmk3;->b:Ljava/lang/String;

    .line 1985
    .line 1986
    invoke-interface {v7}, Lag2;->getWidth()I

    .line 1987
    .line 1988
    .line 1989
    move-result v6

    .line 1990
    iput v6, v8, Lmk3;->e:I

    .line 1991
    .line 1992
    iget-byte v6, v8, Lmk3;->g:B

    .line 1993
    .line 1994
    or-int/lit8 v6, v6, 0x10

    .line 1995
    .line 1996
    int-to-byte v6, v6

    .line 1997
    iput-byte v6, v8, Lmk3;->g:B

    .line 1998
    .line 1999
    invoke-interface {v7}, Lag2;->p0()Landroid/view/View;

    .line 2000
    .line 2001
    .line 2002
    move-result-object v6

    .line 2003
    invoke-virtual {v6}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 2004
    .line 2005
    .line 2006
    move-result-object v6

    .line 2007
    if-eqz v6, :cond_3d

    .line 2008
    .line 2009
    iput-object v6, v8, Lmk3;->a:Landroid/os/IBinder;

    .line 2010
    .line 2011
    invoke-interface {v0, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 2012
    .line 2013
    .line 2014
    move-result v6

    .line 2015
    if-eqz v6, :cond_3a

    .line 2016
    .line 2017
    invoke-interface {v0, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 2018
    .line 2019
    .line 2020
    move-result v6

    .line 2021
    if-eqz v6, :cond_3a

    .line 2022
    .line 2023
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2024
    .line 2025
    .line 2026
    move-result-object v4

    .line 2027
    check-cast v4, Ljava/lang/String;

    .line 2028
    .line 2029
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 2030
    .line 2031
    .line 2032
    move-result v4

    .line 2033
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2034
    .line 2035
    .line 2036
    move-result-object v5

    .line 2037
    check-cast v5, Ljava/lang/String;

    .line 2038
    .line 2039
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 2040
    .line 2041
    .line 2042
    move-result v5

    .line 2043
    or-int/2addr v4, v5

    .line 2044
    iput v4, v8, Lmk3;->c:I

    .line 2045
    .line 2046
    iget-byte v4, v8, Lmk3;->g:B

    .line 2047
    .line 2048
    const/16 v16, 0x1

    .line 2049
    .line 2050
    or-int/lit8 v4, v4, 0x1

    .line 2051
    .line 2052
    int-to-byte v4, v4

    .line 2053
    iput-byte v4, v8, Lmk3;->g:B

    .line 2054
    .line 2055
    goto :goto_2c

    .line 2056
    :cond_3a
    const/16 v16, 0x1

    .line 2057
    .line 2058
    const/16 v4, 0x51

    .line 2059
    .line 2060
    iput v4, v8, Lmk3;->c:I

    .line 2061
    .line 2062
    iget-byte v4, v8, Lmk3;->g:B

    .line 2063
    .line 2064
    or-int/lit8 v4, v4, 0x1

    .line 2065
    .line 2066
    int-to-byte v4, v4

    .line 2067
    iput-byte v4, v8, Lmk3;->g:B

    .line 2068
    .line 2069
    :goto_2c
    invoke-interface {v0, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 2070
    .line 2071
    .line 2072
    move-result v4

    .line 2073
    if-eqz v4, :cond_3b

    .line 2074
    .line 2075
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2076
    .line 2077
    .line 2078
    move-result-object v3

    .line 2079
    check-cast v3, Ljava/lang/String;

    .line 2080
    .line 2081
    invoke-static {v3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 2082
    .line 2083
    .line 2084
    move-result v3

    .line 2085
    iput v3, v8, Lmk3;->d:F

    .line 2086
    .line 2087
    iget-byte v3, v8, Lmk3;->g:B

    .line 2088
    .line 2089
    const/16 v17, 0x2

    .line 2090
    .line 2091
    or-int/lit8 v3, v3, 0x2

    .line 2092
    .line 2093
    int-to-byte v3, v3

    .line 2094
    iput-byte v3, v8, Lmk3;->g:B

    .line 2095
    .line 2096
    goto :goto_2d

    .line 2097
    :cond_3b
    const/16 v17, 0x2

    .line 2098
    .line 2099
    const v3, 0x3ca3d70a    # 0.02f

    .line 2100
    .line 2101
    .line 2102
    iput v3, v8, Lmk3;->d:F

    .line 2103
    .line 2104
    iget-byte v3, v8, Lmk3;->g:B

    .line 2105
    .line 2106
    or-int/lit8 v3, v3, 0x2

    .line 2107
    .line 2108
    int-to-byte v3, v3

    .line 2109
    iput-byte v3, v8, Lmk3;->g:B

    .line 2110
    .line 2111
    :goto_2d
    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 2112
    .line 2113
    .line 2114
    move-result v3

    .line 2115
    if-eqz v3, :cond_3c

    .line 2116
    .line 2117
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2118
    .line 2119
    .line 2120
    move-result-object v0

    .line 2121
    check-cast v0, Ljava/lang/String;

    .line 2122
    .line 2123
    iput-object v0, v8, Lmk3;->f:Ljava/lang/String;

    .line 2124
    .line 2125
    :cond_3c
    :try_start_14
    sget-object v0, Lhg4;->C:Lhg4;

    .line 2126
    .line 2127
    iget-object v0, v0, Lhg4;->s:Lzb1;

    .line 2128
    .line 2129
    invoke-virtual {v8}, Lmk3;->a()Lnk3;

    .line 2130
    .line 2131
    .line 2132
    move-result-object v2

    .line 2133
    invoke-virtual {v0, v7, v2}, Lzb1;->c(Lag2;Lnk3;)V
    :try_end_14
    .catch Ljava/lang/NullPointerException; {:try_start_14 .. :try_end_14} :catch_d

    .line 2134
    .line 2135
    .line 2136
    goto :goto_2e

    .line 2137
    :catch_d
    move-exception v0

    .line 2138
    const-string v2, "DefaultGmsgHandlers.ShowLMDOverlay"

    .line 2139
    .line 2140
    sget-object v3, Lhg4;->C:Lhg4;

    .line 2141
    .line 2142
    iget-object v3, v3, Lhg4;->h:Lgd2;

    .line 2143
    .line 2144
    invoke-virtual {v3, v2, v0}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2145
    .line 2146
    .line 2147
    const-string v0, "Missing parameters for LMD Overlay show request"

    .line 2148
    .line 2149
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 2150
    .line 2151
    .line 2152
    :goto_2e
    return-void

    .line 2153
    :cond_3d
    new-instance v0, Ljava/lang/NullPointerException;

    .line 2154
    .line 2155
    const-string v2, "Null windowToken"

    .line 2156
    .line 2157
    invoke-direct {v0, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 2158
    .line 2159
    .line 2160
    throw v0

    .line 2161
    :pswitch_17
    move-object/from16 v0, p1

    .line 2162
    .line 2163
    check-cast v0, Lag2;

    .line 2164
    .line 2165
    sget-object v2, Lhg4;->C:Lhg4;

    .line 2166
    .line 2167
    iget-object v2, v2, Lhg4;->s:Lzb1;

    .line 2168
    .line 2169
    invoke-interface {v0}, Lag2;->getContext()Landroid/content/Context;

    .line 2170
    .line 2171
    .line 2172
    move-result-object v3

    .line 2173
    monitor-enter v2

    .line 2174
    :try_start_15
    iput-object v0, v2, Lzb1;->i:Ljava/lang/Object;

    .line 2175
    .line 2176
    invoke-virtual {v2, v3}, Lzb1;->b(Landroid/content/Context;)Z

    .line 2177
    .line 2178
    .line 2179
    move-result v0

    .line 2180
    if-nez v0, :cond_3e

    .line 2181
    .line 2182
    const-string v0, "Unable to bind"

    .line 2183
    .line 2184
    const-string v3, "on_play_store_bind"

    .line 2185
    .line 2186
    invoke-virtual {v2, v0, v3}, Lzb1;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_3

    .line 2187
    .line 2188
    .line 2189
    monitor-exit v2

    .line 2190
    goto :goto_2f

    .line 2191
    :catchall_3
    move-exception v0

    .line 2192
    goto :goto_30

    .line 2193
    :cond_3e
    :try_start_16
    new-instance v0, Ljava/util/HashMap;

    .line 2194
    .line 2195
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 2196
    .line 2197
    .line 2198
    const-string v3, "action"

    .line 2199
    .line 2200
    const-string v4, "fetch_completed"

    .line 2201
    .line 2202
    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2203
    .line 2204
    .line 2205
    const-string v3, "on_play_store_bind"

    .line 2206
    .line 2207
    invoke-virtual {v2, v3, v0}, Lzb1;->f(Ljava/lang/String;Ljava/util/HashMap;)V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_3

    .line 2208
    .line 2209
    .line 2210
    monitor-exit v2

    .line 2211
    :goto_2f
    return-void

    .line 2212
    :goto_30
    :try_start_17
    monitor-exit v2
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_3

    .line 2213
    throw v0

    .line 2214
    :pswitch_18
    const-string v0, "nativeClickMetaReady"

    .line 2215
    .line 2216
    move-object/from16 v2, p1

    .line 2217
    .line 2218
    check-cast v2, Lag2;

    .line 2219
    .line 2220
    invoke-interface {v2}, Lag2;->C0()Lq12;

    .line 2221
    .line 2222
    .line 2223
    move-result-object v3

    .line 2224
    if-eqz v3, :cond_3f

    .line 2225
    .line 2226
    invoke-interface {v3}, Lq12;->l()Lorg/json/JSONObject;

    .line 2227
    .line 2228
    .line 2229
    move-result-object v3

    .line 2230
    if-eqz v3, :cond_3f

    .line 2231
    .line 2232
    invoke-interface {v2, v0, v3}, Ll52;->c(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 2233
    .line 2234
    .line 2235
    goto :goto_31

    .line 2236
    :cond_3f
    new-instance v3, Lorg/json/JSONObject;

    .line 2237
    .line 2238
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 2239
    .line 2240
    .line 2241
    invoke-interface {v2, v0, v3}, Ll52;->c(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 2242
    .line 2243
    .line 2244
    :goto_31
    return-void

    .line 2245
    :pswitch_19
    const-string v0, "nativeAdViewSignalsReady"

    .line 2246
    .line 2247
    move-object/from16 v2, p1

    .line 2248
    .line 2249
    check-cast v2, Lag2;

    .line 2250
    .line 2251
    invoke-interface {v2}, Lag2;->C0()Lq12;

    .line 2252
    .line 2253
    .line 2254
    move-result-object v3

    .line 2255
    if-eqz v3, :cond_40

    .line 2256
    .line 2257
    invoke-interface {v3}, Lq12;->h()Lorg/json/JSONObject;

    .line 2258
    .line 2259
    .line 2260
    move-result-object v3

    .line 2261
    if-eqz v3, :cond_40

    .line 2262
    .line 2263
    invoke-interface {v2, v0, v3}, Ll52;->c(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 2264
    .line 2265
    .line 2266
    goto :goto_32

    .line 2267
    :cond_40
    new-instance v3, Lorg/json/JSONObject;

    .line 2268
    .line 2269
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 2270
    .line 2271
    .line 2272
    invoke-interface {v2, v0, v3}, Ll52;->c(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 2273
    .line 2274
    .line 2275
    :goto_32
    return-void

    .line 2276
    :pswitch_1a
    move-object/from16 v0, p1

    .line 2277
    .line 2278
    check-cast v0, Lag2;

    .line 2279
    .line 2280
    invoke-interface {v0}, Lag2;->getContext()Landroid/content/Context;

    .line 2281
    .line 2282
    .line 2283
    move-result-object v2

    .line 2284
    const-string v3, "window"

    .line 2285
    .line 2286
    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 2287
    .line 2288
    .line 2289
    move-result-object v2

    .line 2290
    check-cast v2, Landroid/view/WindowManager;

    .line 2291
    .line 2292
    sget-object v3, Lhg4;->C:Lhg4;

    .line 2293
    .line 2294
    iget-object v3, v3, Lhg4;->c:Llf4;

    .line 2295
    .line 2296
    move-object v3, v0

    .line 2297
    check-cast v3, Landroid/view/View;

    .line 2298
    .line 2299
    new-instance v4, Landroid/util/DisplayMetrics;

    .line 2300
    .line 2301
    invoke-direct {v4}, Landroid/util/DisplayMetrics;-><init>()V

    .line 2302
    .line 2303
    .line 2304
    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 2305
    .line 2306
    .line 2307
    move-result-object v2

    .line 2308
    invoke-virtual {v2, v4}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 2309
    .line 2310
    .line 2311
    iget v2, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 2312
    .line 2313
    iget v4, v4, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 2314
    .line 2315
    const/4 v6, 0x2

    .line 2316
    new-array v5, v6, [I

    .line 2317
    .line 2318
    new-instance v6, Ljava/util/HashMap;

    .line 2319
    .line 2320
    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 2321
    .line 2322
    .line 2323
    invoke-virtual {v3, v5}, Landroid/view/View;->getLocationInWindow([I)V

    .line 2324
    .line 2325
    .line 2326
    const/16 v18, 0x0

    .line 2327
    .line 2328
    aget v3, v5, v18

    .line 2329
    .line 2330
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2331
    .line 2332
    .line 2333
    move-result-object v3

    .line 2334
    const-string v7, "xInPixels"

    .line 2335
    .line 2336
    invoke-virtual {v6, v7, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2337
    .line 2338
    .line 2339
    const/16 v16, 0x1

    .line 2340
    .line 2341
    aget v3, v5, v16

    .line 2342
    .line 2343
    const-string v5, "yInPixels"

    .line 2344
    .line 2345
    const-string v7, "windowWidthInPixels"

    .line 2346
    .line 2347
    invoke-static {v3, v6, v5, v2, v7}, Lga1;->m(ILjava/util/HashMap;Ljava/lang/String;ILjava/lang/String;)V

    .line 2348
    .line 2349
    .line 2350
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2351
    .line 2352
    .line 2353
    move-result-object v2

    .line 2354
    const-string v3, "windowHeightInPixels"

    .line 2355
    .line 2356
    invoke-virtual {v6, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2357
    .line 2358
    .line 2359
    const-string v2, "locationReady"

    .line 2360
    .line 2361
    invoke-interface {v0, v2, v6}, Ll52;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 2362
    .line 2363
    .line 2364
    const-string v0, "GET LOCATION COMPILED"

    .line 2365
    .line 2366
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 2367
    .line 2368
    .line 2369
    return-void

    .line 2370
    nop

    .line 2371
    :pswitch_data_0
    .packed-switch 0x0
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
