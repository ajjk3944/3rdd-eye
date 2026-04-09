.class public final Lha1;
.super Luk2;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final A:Ljava/lang/Object;

.field public static y:Lha1;

.field public static z:Lha1;


# instance fields
.field public final p:Landroid/content/Context;

.field public final q:Lru0;

.field public final r:Landroidx/work/impl/WorkDatabase;

.field public final s:Lxb4;

.field public final t:Ljava/util/List;

.field public final u:Lom0;

.field public final v:Lkf3;

.field public w:Z

.field public x:Landroid/content/BroadcastReceiver$PendingResult;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "WorkManagerImpl"

    .line 2
    .line 3
    invoke-static {v0}, Lh80;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    sput-object v0, Lha1;->y:Lha1;

    .line 8
    .line 9
    sput-object v0, Lha1;->z:Lha1;

    .line 10
    .line 11
    new-instance v0, Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lha1;->A:Ljava/lang/Object;

    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lru0;Lxb4;)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v4, p2

    .line 4
    .line 5
    move-object/from16 v5, p3

    .line 6
    .line 7
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const v2, 0x7f050007

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    iget-object v3, v5, Lxb4;->g:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v3, Llu0;

    .line 25
    .line 26
    sget v6, Landroidx/work/impl/WorkDatabase;->k:I

    .line 27
    .line 28
    const/4 v6, 0x1

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    new-instance v0, Loq0;

    .line 32
    .line 33
    const/4 v7, 0x0

    .line 34
    invoke-direct {v0, v2, v7}, Loq0;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iput-boolean v6, v0, Loq0;->g:Z

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    sget-object v0, Lba1;->a:[Ljava/lang/String;

    .line 41
    .line 42
    const-string v0, "androidx.work.workdb"

    .line 43
    .line 44
    new-instance v7, Loq0;

    .line 45
    .line 46
    invoke-direct {v7, v2, v0}, Loq0;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    new-instance v0, Lx91;

    .line 50
    .line 51
    invoke-direct {v0, v2}, Lx91;-><init>(Landroid/content/Context;)V

    .line 52
    .line 53
    .line 54
    iput-object v0, v7, Loq0;->f:Ljz0;

    .line 55
    .line 56
    move-object v0, v7

    .line 57
    :goto_0
    iput-object v3, v0, Loq0;->d:Ljava/util/concurrent/Executor;

    .line 58
    .line 59
    new-instance v3, Ly91;

    .line 60
    .line 61
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 62
    .line 63
    .line 64
    iget-object v7, v0, Loq0;->c:Ljava/util/ArrayList;

    .line 65
    .line 66
    if-nez v7, :cond_1

    .line 67
    .line 68
    new-instance v7, Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 71
    .line 72
    .line 73
    iput-object v7, v0, Loq0;->c:Ljava/util/ArrayList;

    .line 74
    .line 75
    :cond_1
    iget-object v7, v0, Loq0;->c:Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    new-array v3, v6, [Lse0;

    .line 81
    .line 82
    sget-object v7, Lum;->i:Lz91;

    .line 83
    .line 84
    const/4 v8, 0x0

    .line 85
    aput-object v7, v3, v8

    .line 86
    .line 87
    invoke-virtual {v0, v3}, Loq0;->a([Lse0;)V

    .line 88
    .line 89
    .line 90
    new-instance v3, Laa1;

    .line 91
    .line 92
    const/4 v7, 0x2

    .line 93
    const/4 v9, 0x3

    .line 94
    invoke-direct {v3, v2, v7, v9}, Laa1;-><init>(Landroid/content/Context;II)V

    .line 95
    .line 96
    .line 97
    new-array v10, v6, [Lse0;

    .line 98
    .line 99
    aput-object v3, v10, v8

    .line 100
    .line 101
    invoke-virtual {v0, v10}, Loq0;->a([Lse0;)V

    .line 102
    .line 103
    .line 104
    new-array v3, v6, [Lse0;

    .line 105
    .line 106
    sget-object v10, Lum;->j:Lz91;

    .line 107
    .line 108
    aput-object v10, v3, v8

    .line 109
    .line 110
    invoke-virtual {v0, v3}, Loq0;->a([Lse0;)V

    .line 111
    .line 112
    .line 113
    new-array v3, v6, [Lse0;

    .line 114
    .line 115
    sget-object v10, Lum;->k:Lz91;

    .line 116
    .line 117
    aput-object v10, v3, v8

    .line 118
    .line 119
    invoke-virtual {v0, v3}, Loq0;->a([Lse0;)V

    .line 120
    .line 121
    .line 122
    new-instance v3, Laa1;

    .line 123
    .line 124
    const/4 v10, 0x5

    .line 125
    const/4 v11, 0x6

    .line 126
    invoke-direct {v3, v2, v10, v11}, Laa1;-><init>(Landroid/content/Context;II)V

    .line 127
    .line 128
    .line 129
    new-array v10, v6, [Lse0;

    .line 130
    .line 131
    aput-object v3, v10, v8

    .line 132
    .line 133
    invoke-virtual {v0, v10}, Loq0;->a([Lse0;)V

    .line 134
    .line 135
    .line 136
    new-array v3, v6, [Lse0;

    .line 137
    .line 138
    sget-object v10, Lum;->l:Lz91;

    .line 139
    .line 140
    aput-object v10, v3, v8

    .line 141
    .line 142
    invoke-virtual {v0, v3}, Loq0;->a([Lse0;)V

    .line 143
    .line 144
    .line 145
    new-array v3, v6, [Lse0;

    .line 146
    .line 147
    sget-object v10, Lum;->m:Lz91;

    .line 148
    .line 149
    aput-object v10, v3, v8

    .line 150
    .line 151
    invoke-virtual {v0, v3}, Loq0;->a([Lse0;)V

    .line 152
    .line 153
    .line 154
    new-array v3, v6, [Lse0;

    .line 155
    .line 156
    sget-object v10, Lum;->n:Lz91;

    .line 157
    .line 158
    aput-object v10, v3, v8

    .line 159
    .line 160
    invoke-virtual {v0, v3}, Loq0;->a([Lse0;)V

    .line 161
    .line 162
    .line 163
    new-instance v3, Laa1;

    .line 164
    .line 165
    invoke-direct {v3, v2}, Laa1;-><init>(Landroid/content/Context;)V

    .line 166
    .line 167
    .line 168
    new-array v10, v6, [Lse0;

    .line 169
    .line 170
    aput-object v3, v10, v8

    .line 171
    .line 172
    invoke-virtual {v0, v10}, Loq0;->a([Lse0;)V

    .line 173
    .line 174
    .line 175
    new-instance v3, Laa1;

    .line 176
    .line 177
    const/16 v10, 0xa

    .line 178
    .line 179
    const/16 v12, 0xb

    .line 180
    .line 181
    invoke-direct {v3, v2, v10, v12}, Laa1;-><init>(Landroid/content/Context;II)V

    .line 182
    .line 183
    .line 184
    new-array v2, v6, [Lse0;

    .line 185
    .line 186
    aput-object v3, v2, v8

    .line 187
    .line 188
    invoke-virtual {v0, v2}, Loq0;->a([Lse0;)V

    .line 189
    .line 190
    .line 191
    new-array v2, v6, [Lse0;

    .line 192
    .line 193
    sget-object v3, Lum;->o:Lz91;

    .line 194
    .line 195
    aput-object v3, v2, v8

    .line 196
    .line 197
    invoke-virtual {v0, v2}, Loq0;->a([Lse0;)V

    .line 198
    .line 199
    .line 200
    iput-boolean v8, v0, Loq0;->h:Z

    .line 201
    .line 202
    iput-boolean v6, v0, Loq0;->i:Z

    .line 203
    .line 204
    const-class v2, Landroidx/work/impl/WorkDatabase;

    .line 205
    .line 206
    iget-object v3, v0, Loq0;->b:Landroid/content/Context;

    .line 207
    .line 208
    if-eqz v3, :cond_b

    .line 209
    .line 210
    iget-object v10, v0, Loq0;->d:Ljava/util/concurrent/Executor;

    .line 211
    .line 212
    if-nez v10, :cond_2

    .line 213
    .line 214
    iget-object v12, v0, Loq0;->e:Ljava/util/concurrent/Executor;

    .line 215
    .line 216
    if-nez v12, :cond_2

    .line 217
    .line 218
    sget-object v10, Lj8;->F:Li8;

    .line 219
    .line 220
    iput-object v10, v0, Loq0;->e:Ljava/util/concurrent/Executor;

    .line 221
    .line 222
    iput-object v10, v0, Loq0;->d:Ljava/util/concurrent/Executor;

    .line 223
    .line 224
    goto :goto_1

    .line 225
    :cond_2
    if-eqz v10, :cond_3

    .line 226
    .line 227
    iget-object v12, v0, Loq0;->e:Ljava/util/concurrent/Executor;

    .line 228
    .line 229
    if-nez v12, :cond_3

    .line 230
    .line 231
    iput-object v10, v0, Loq0;->e:Ljava/util/concurrent/Executor;

    .line 232
    .line 233
    goto :goto_1

    .line 234
    :cond_3
    if-nez v10, :cond_4

    .line 235
    .line 236
    iget-object v10, v0, Loq0;->e:Ljava/util/concurrent/Executor;

    .line 237
    .line 238
    if-eqz v10, :cond_4

    .line 239
    .line 240
    iput-object v10, v0, Loq0;->d:Ljava/util/concurrent/Executor;

    .line 241
    .line 242
    :cond_4
    :goto_1
    iget-object v10, v0, Loq0;->f:Ljz0;

    .line 243
    .line 244
    if-nez v10, :cond_5

    .line 245
    .line 246
    new-instance v10, Lpz;

    .line 247
    .line 248
    const/16 v12, 0x16

    .line 249
    .line 250
    invoke-direct {v10, v12}, Lpz;-><init>(I)V

    .line 251
    .line 252
    .line 253
    iput-object v10, v0, Loq0;->f:Ljz0;

    .line 254
    .line 255
    :cond_5
    new-instance v10, Lqm;

    .line 256
    .line 257
    iget-object v12, v0, Loq0;->a:Ljava/lang/String;

    .line 258
    .line 259
    iget-object v13, v0, Loq0;->f:Ljz0;

    .line 260
    .line 261
    iget-object v14, v0, Loq0;->j:Lhm;

    .line 262
    .line 263
    iget-object v15, v0, Loq0;->c:Ljava/util/ArrayList;

    .line 264
    .line 265
    iget-boolean v11, v0, Loq0;->g:Z

    .line 266
    .line 267
    const-string v7, "activity"

    .line 268
    .line 269
    invoke-virtual {v3, v7}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v7

    .line 273
    check-cast v7, Landroid/app/ActivityManager;

    .line 274
    .line 275
    if-eqz v7, :cond_6

    .line 276
    .line 277
    invoke-virtual {v7}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    .line 278
    .line 279
    .line 280
    move-result v7

    .line 281
    if-nez v7, :cond_6

    .line 282
    .line 283
    move v7, v9

    .line 284
    :goto_2
    move/from16 v16, v6

    .line 285
    .line 286
    goto :goto_3

    .line 287
    :cond_6
    const/4 v7, 0x2

    .line 288
    goto :goto_2

    .line 289
    :goto_3
    iget-object v6, v0, Loq0;->d:Ljava/util/concurrent/Executor;

    .line 290
    .line 291
    iget-object v8, v0, Loq0;->e:Ljava/util/concurrent/Executor;

    .line 292
    .line 293
    iget-boolean v9, v0, Loq0;->h:Z

    .line 294
    .line 295
    iget-boolean v0, v0, Loq0;->i:Z

    .line 296
    .line 297
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 298
    .line 299
    .line 300
    iput-object v13, v10, Lqm;->c:Ljava/lang/Object;

    .line 301
    .line 302
    iput-object v3, v10, Lqm;->d:Ljava/lang/Object;

    .line 303
    .line 304
    iput-object v12, v10, Lqm;->e:Ljava/io/Serializable;

    .line 305
    .line 306
    iput-object v14, v10, Lqm;->f:Ljava/lang/Object;

    .line 307
    .line 308
    iput-object v6, v10, Lqm;->g:Ljava/lang/Object;

    .line 309
    .line 310
    iput-object v8, v10, Lqm;->h:Ljava/lang/Object;

    .line 311
    .line 312
    iput-boolean v9, v10, Lqm;->a:Z

    .line 313
    .line 314
    iput-boolean v0, v10, Lqm;->b:Z

    .line 315
    .line 316
    const-string v0, "_Impl"

    .line 317
    .line 318
    invoke-virtual {v2}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    .line 319
    .line 320
    .line 321
    move-result-object v3

    .line 322
    invoke-virtual {v3}, Ljava/lang/Package;->getName()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v3

    .line 326
    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v8

    .line 330
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 331
    .line 332
    .line 333
    move-result v9

    .line 334
    if-eqz v9, :cond_7

    .line 335
    .line 336
    goto :goto_4

    .line 337
    :cond_7
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 338
    .line 339
    .line 340
    move-result v9

    .line 341
    add-int/lit8 v9, v9, 0x1

    .line 342
    .line 343
    invoke-virtual {v8, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v8

    .line 347
    :goto_4
    new-instance v9, Ljava/lang/StringBuilder;

    .line 348
    .line 349
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 350
    .line 351
    .line 352
    const/16 v12, 0x2e

    .line 353
    .line 354
    const/16 v13, 0x5f

    .line 355
    .line 356
    invoke-virtual {v8, v12, v13}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v8

    .line 360
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    :try_start_0
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 371
    .line 372
    .line 373
    move-result v8

    .line 374
    if-eqz v8, :cond_8

    .line 375
    .line 376
    move-object v3, v0

    .line 377
    goto :goto_5

    .line 378
    :cond_8
    new-instance v8, Ljava/lang/StringBuilder;

    .line 379
    .line 380
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 381
    .line 382
    .line 383
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 384
    .line 385
    .line 386
    const-string v3, "."

    .line 387
    .line 388
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v3

    .line 398
    :goto_5
    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 399
    .line 400
    .line 401
    move-result-object v3

    .line 402
    invoke-virtual {v3}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 406
    check-cast v0, Lpq0;

    .line 407
    .line 408
    invoke-virtual {v0, v10}, Lpq0;->e(Lqm;)Lkz0;

    .line 409
    .line 410
    .line 411
    move-result-object v2

    .line 412
    iput-object v2, v0, Lpq0;->c:Lkz0;

    .line 413
    .line 414
    const/4 v3, 0x3

    .line 415
    if-ne v7, v3, :cond_9

    .line 416
    .line 417
    move/from16 v3, v16

    .line 418
    .line 419
    goto :goto_6

    .line 420
    :cond_9
    const/4 v3, 0x0

    .line 421
    :goto_6
    invoke-interface {v2, v3}, Lkz0;->setWriteAheadLoggingEnabled(Z)V

    .line 422
    .line 423
    .line 424
    iput-object v15, v0, Lpq0;->g:Ljava/util/List;

    .line 425
    .line 426
    iput-object v6, v0, Lpq0;->b:Ljava/util/concurrent/Executor;

    .line 427
    .line 428
    new-instance v2, Ljava/util/ArrayDeque;

    .line 429
    .line 430
    invoke-direct {v2}, Ljava/util/ArrayDeque;-><init>()V

    .line 431
    .line 432
    .line 433
    iput-boolean v11, v0, Lpq0;->e:Z

    .line 434
    .line 435
    iput-boolean v3, v0, Lpq0;->f:Z

    .line 436
    .line 437
    move-object v6, v0

    .line 438
    check-cast v6, Landroidx/work/impl/WorkDatabase;

    .line 439
    .line 440
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 441
    .line 442
    .line 443
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    new-instance v2, Lh80;

    .line 448
    .line 449
    iget v3, v4, Lru0;->a:I

    .line 450
    .line 451
    const/4 v7, 0x0

    .line 452
    invoke-direct {v2, v3, v7}, Lh80;-><init>(II)V

    .line 453
    .line 454
    .line 455
    const-class v3, Lh80;

    .line 456
    .line 457
    monitor-enter v3

    .line 458
    :try_start_1
    sput-object v2, Lh80;->h:Lh80;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 459
    .line 460
    monitor-exit v3

    .line 461
    sget v2, Lgt0;->a:I

    .line 462
    .line 463
    new-instance v2, Lvz0;

    .line 464
    .line 465
    invoke-direct {v2, v0, v1}, Lvz0;-><init>(Landroid/content/Context;Lha1;)V

    .line 466
    .line 467
    .line 468
    const-class v3, Landroidx/work/impl/background/systemjob/SystemJobService;

    .line 469
    .line 470
    move/from16 v7, v16

    .line 471
    .line 472
    invoke-static {v0, v3, v7}, Lyj0;->a(Landroid/content/Context;Ljava/lang/Class;Z)V

    .line 473
    .line 474
    .line 475
    invoke-static {}, Lh80;->d()Lh80;

    .line 476
    .line 477
    .line 478
    move-result-object v3

    .line 479
    const/4 v8, 0x0

    .line 480
    new-array v9, v8, [Ljava/lang/Throwable;

    .line 481
    .line 482
    invoke-virtual {v3, v9}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 483
    .line 484
    .line 485
    new-instance v3, Lzz;

    .line 486
    .line 487
    invoke-direct {v3, v0, v4, v5, v1}, Lzz;-><init>(Landroid/content/Context;Lru0;Lxb4;Lha1;)V

    .line 488
    .line 489
    .line 490
    const/4 v0, 0x2

    .line 491
    new-array v0, v0, [Let0;

    .line 492
    .line 493
    aput-object v2, v0, v8

    .line 494
    .line 495
    aput-object v3, v0, v7

    .line 496
    .line 497
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 498
    .line 499
    .line 500
    move-result-object v7

    .line 501
    new-instance v2, Lom0;

    .line 502
    .line 503
    move-object/from16 v3, p1

    .line 504
    .line 505
    invoke-direct/range {v2 .. v7}, Lom0;-><init>(Landroid/content/Context;Lru0;Lxb4;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    .line 506
    .line 507
    .line 508
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 509
    .line 510
    .line 511
    move-result-object v0

    .line 512
    iput-object v0, v1, Lha1;->p:Landroid/content/Context;

    .line 513
    .line 514
    iput-object v4, v1, Lha1;->q:Lru0;

    .line 515
    .line 516
    iput-object v5, v1, Lha1;->s:Lxb4;

    .line 517
    .line 518
    iput-object v6, v1, Lha1;->r:Landroidx/work/impl/WorkDatabase;

    .line 519
    .line 520
    iput-object v7, v1, Lha1;->t:Ljava/util/List;

    .line 521
    .line 522
    iput-object v2, v1, Lha1;->u:Lom0;

    .line 523
    .line 524
    new-instance v2, Lkf3;

    .line 525
    .line 526
    const/4 v3, 0x6

    .line 527
    invoke-direct {v2, v3, v6}, Lkf3;-><init>(ILjava/lang/Object;)V

    .line 528
    .line 529
    .line 530
    iput-object v2, v1, Lha1;->v:Lkf3;

    .line 531
    .line 532
    const/4 v7, 0x0

    .line 533
    iput-boolean v7, v1, Lha1;->w:Z

    .line 534
    .line 535
    invoke-virtual {v0}, Landroid/content/Context;->isDeviceProtectedStorage()Z

    .line 536
    .line 537
    .line 538
    move-result v2

    .line 539
    if-nez v2, :cond_a

    .line 540
    .line 541
    iget-object v2, v1, Lha1;->s:Lxb4;

    .line 542
    .line 543
    new-instance v3, Lxv;

    .line 544
    .line 545
    invoke-direct {v3, v0, v1}, Lxv;-><init>(Landroid/content/Context;Lha1;)V

    .line 546
    .line 547
    .line 548
    invoke-virtual {v2, v3}, Lxb4;->j(Ljava/lang/Runnable;)V

    .line 549
    .line 550
    .line 551
    return-void

    .line 552
    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 553
    .line 554
    const-string v2, "Cannot initialize WorkManager in direct boot mode"

    .line 555
    .line 556
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 557
    .line 558
    .line 559
    throw v0

    .line 560
    :catchall_0
    move-exception v0

    .line 561
    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 562
    throw v0

    .line 563
    :catch_0
    new-instance v0, Ljava/lang/RuntimeException;

    .line 564
    .line 565
    new-instance v3, Ljava/lang/StringBuilder;

    .line 566
    .line 567
    const-string v4, "Failed to create an instance of "

    .line 568
    .line 569
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 570
    .line 571
    .line 572
    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 573
    .line 574
    .line 575
    move-result-object v2

    .line 576
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 577
    .line 578
    .line 579
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 580
    .line 581
    .line 582
    move-result-object v2

    .line 583
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 584
    .line 585
    .line 586
    throw v0

    .line 587
    :catch_1
    new-instance v0, Ljava/lang/RuntimeException;

    .line 588
    .line 589
    new-instance v3, Ljava/lang/StringBuilder;

    .line 590
    .line 591
    const-string v4, "Cannot access the constructor"

    .line 592
    .line 593
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 594
    .line 595
    .line 596
    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 597
    .line 598
    .line 599
    move-result-object v2

    .line 600
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 601
    .line 602
    .line 603
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 604
    .line 605
    .line 606
    move-result-object v2

    .line 607
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 608
    .line 609
    .line 610
    throw v0

    .line 611
    :catch_2
    new-instance v3, Ljava/lang/RuntimeException;

    .line 612
    .line 613
    new-instance v4, Ljava/lang/StringBuilder;

    .line 614
    .line 615
    const-string v5, "cannot find implementation for "

    .line 616
    .line 617
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 618
    .line 619
    .line 620
    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 621
    .line 622
    .line 623
    move-result-object v2

    .line 624
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 625
    .line 626
    .line 627
    const-string v2, ". "

    .line 628
    .line 629
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 630
    .line 631
    .line 632
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 633
    .line 634
    .line 635
    const-string v0, " does not exist"

    .line 636
    .line 637
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 638
    .line 639
    .line 640
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 641
    .line 642
    .line 643
    move-result-object v0

    .line 644
    invoke-direct {v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 645
    .line 646
    .line 647
    throw v3

    .line 648
    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 649
    .line 650
    const-string v2, "Cannot provide null context for the database."

    .line 651
    .line 652
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 653
    .line 654
    .line 655
    throw v0
.end method

.method public static j0(Landroid/content/Context;)Lha1;
    .locals 2

    .line 1
    sget-object v0, Lha1;->A:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5
    :try_start_1
    sget-object v1, Lha1;->y:Lha1;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    monitor-exit v0

    .line 10
    goto :goto_0

    .line 11
    :catchall_0
    move-exception p0

    .line 12
    goto :goto_1

    .line 13
    :cond_0
    sget-object v1, Lha1;->z:Lha1;

    .line 14
    .line 15
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    :goto_0
    if-eqz v1, :cond_1

    .line 17
    .line 18
    :try_start_2
    monitor-exit v0

    .line 19
    return-object v1

    .line 20
    :catchall_1
    move-exception p0

    .line 21
    goto :goto_2

    .line 22
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v1, "WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider."

    .line 28
    .line 29
    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 33
    :goto_1
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 34
    :try_start_4
    throw p0

    .line 35
    :goto_2
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 36
    throw p0
.end method

.method public static k0(Landroid/content/Context;Lru0;)V
    .locals 4

    .line 1
    sget-object v0, Lha1;->A:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lha1;->y:Lha1;

    .line 5
    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    sget-object v2, Lha1;->z:Lha1;

    .line 9
    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 14
    .line 15
    const-string p1, "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    :goto_0
    if-nez v1, :cond_3

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    sget-object v1, Lha1;->z:Lha1;

    .line 30
    .line 31
    if-nez v1, :cond_2

    .line 32
    .line 33
    new-instance v1, Lha1;

    .line 34
    .line 35
    new-instance v2, Lxb4;

    .line 36
    .line 37
    iget-object v3, p1, Lru0;->e:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v3, Ljava/util/concurrent/ExecutorService;

    .line 40
    .line 41
    invoke-direct {v2, v3}, Lxb4;-><init>(Ljava/util/concurrent/ExecutorService;)V

    .line 42
    .line 43
    .line 44
    invoke-direct {v1, p0, p1, v2}, Lha1;-><init>(Landroid/content/Context;Lru0;Lxb4;)V

    .line 45
    .line 46
    .line 47
    sput-object v1, Lha1;->z:Lha1;

    .line 48
    .line 49
    :cond_2
    sget-object p0, Lha1;->z:Lha1;

    .line 50
    .line 51
    sput-object p0, Lha1;->y:Lha1;

    .line 52
    .line 53
    :cond_3
    monitor-exit v0

    .line 54
    return-void

    .line 55
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    throw p0
.end method


# virtual methods
.method public final l0()V
    .locals 2

    .line 1
    sget-object v0, Lha1;->A:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    iput-boolean v1, p0, Lha1;->w:Z

    .line 6
    .line 7
    iget-object v1, p0, Lha1;->x:Landroid/content/BroadcastReceiver$PendingResult;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    iput-object v1, p0, Lha1;->x:Landroid/content/BroadcastReceiver$PendingResult;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception v1

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    :goto_0
    monitor-exit v0

    .line 21
    return-void

    .line 22
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    throw v1
.end method

.method public final m0()V
    .locals 5

    .line 1
    sget-object v0, Lvz0;->j:Ljava/lang/String;

    .line 2
    .line 3
    const-string v0, "jobscheduler"

    .line 4
    .line 5
    iget-object v1, p0, Lha1;->p:Landroid/content/Context;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/app/job/JobScheduler;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {v1, v0}, Lvz0;->c(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/ArrayList;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-nez v2, :cond_0

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    const/4 v3, 0x0

    .line 32
    :goto_0
    if-ge v3, v2, :cond_0

    .line 33
    .line 34
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    add-int/lit8 v3, v3, 0x1

    .line 39
    .line 40
    check-cast v4, Landroid/app/job/JobInfo;

    .line 41
    .line 42
    invoke-virtual {v4}, Landroid/app/job/JobInfo;->getId()I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    invoke-static {v0, v4}, Lvz0;->a(Landroid/app/job/JobScheduler;I)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    iget-object v0, p0, Lha1;->r:Landroidx/work/impl/WorkDatabase;

    .line 51
    .line 52
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->n()Lh2;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    iget-object v2, v1, Lh2;->a:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v2, Landroidx/work/impl/WorkDatabase_Impl;

    .line 59
    .line 60
    invoke-virtual {v2}, Lpq0;->b()V

    .line 61
    .line 62
    .line 63
    iget-object v1, v1, Lh2;->i:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, Ltz0;

    .line 66
    .line 67
    invoke-virtual {v1}, Lsv0;->a()Lpx;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-virtual {v2}, Lpq0;->c()V

    .line 72
    .line 73
    .line 74
    :try_start_0
    iget-object v4, v3, Lpx;->i:Landroid/database/sqlite/SQLiteStatement;

    .line 75
    .line 76
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteStatement;->executeUpdateDelete()I

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2}, Lpq0;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2}, Lpq0;->f()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, v3}, Lsv0;->c(Lpx;)V

    .line 86
    .line 87
    .line 88
    iget-object v1, p0, Lha1;->q:Lru0;

    .line 89
    .line 90
    iget-object v2, p0, Lha1;->t:Ljava/util/List;

    .line 91
    .line 92
    invoke-static {v1, v0, v2}, Lgt0;->a(Lru0;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :catchall_0
    move-exception v0

    .line 97
    invoke-virtual {v2}, Lpq0;->f()V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1, v3}, Lsv0;->c(Lpx;)V

    .line 101
    .line 102
    .line 103
    throw v0
.end method

.method public final n0(Ljava/lang/String;Lt83;)V
    .locals 2

    .line 1
    new-instance v0, Lgi;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1}, Lgi;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iput-object p0, v0, Lgi;->g:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p1, v0, Lgi;->h:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p2, v0, Lgi;->i:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object p1, p0, Lha1;->s:Lxb4;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lxb4;->j(Ljava/lang/Runnable;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final o0(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Liy0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p1, v1}, Liy0;-><init>(Lha1;Ljava/lang/String;Z)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lha1;->s:Lxb4;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Lxb4;->j(Ljava/lang/Runnable;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
