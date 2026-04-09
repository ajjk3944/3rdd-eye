.class public final Lya4;
.super Lf74;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final synthetic g0:I


# instance fields
.field public final A:Luj4;

.field public final B:Lpz;

.field public final C:Loa4;

.field public final D:Lwa4;

.field public final E:Lkj1;

.field public final F:Lkj1;

.field public final G:J

.field public final H:Lfw3;

.field public final I:Lyc4;

.field public J:I

.field public K:I

.field public L:Z

.field public final M:Lkc4;

.field public final N:Llc4;

.field public final O:Lla4;

.field public P:Lts1;

.field public Q:Lrm1;

.field public R:Ljava/lang/Object;

.field public S:Landroid/view/Surface;

.field public final T:I

.field public U:Luz2;

.field public final V:Lin2;

.field public W:F

.field public X:Z

.field public final Y:Z

.field public Z:Z

.field public final a0:I

.field public b0:Lrm1;

.field public c0:Ldc4;

.field public d0:I

.field public e0:J

.field public f0:Lni4;

.field public final i:Lpj4;

.field public final j:Lts1;

.field public final k:Lhp2;

.field public final l:Landroid/content/Context;

.field public final m:Lmc4;

.field public final n:[Lkg4;

.field public final o:[Lkg4;

.field public final p:Llj4;

.field public final q:Ld13;

.field public final r:Lci3;

.field public final s:Ljb4;

.field public final t:Lmu2;

.field public final u:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public final v:Lsw1;

.field public final w:Ljava/util/ArrayList;

.field public final x:Z

.field public final y:Lmd4;

.field public final z:Landroid/os/Looper;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "media3.exoplayer"

    .line 2
    .line 3
    invoke-static {v0}, Lzk1;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Lka4;Lmc4;)V
    .locals 34

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    invoke-direct {v1, v2}, Lf74;-><init>(I)V

    .line 8
    .line 9
    .line 10
    new-instance v3, Lhp2;

    .line 11
    .line 12
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v3, v1, Lya4;->k:Lhp2;

    .line 16
    .line 17
    const-string v3, "]"

    .line 18
    .line 19
    const-string v4, " [AndroidXMedia3/1.8.0] ["

    .line 20
    .line 21
    const-string v5, "Init "

    .line 22
    .line 23
    :try_start_0
    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    sget-object v7, Lv23;->a:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v8

    .line 37
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 38
    .line 39
    .line 40
    move-result v8

    .line 41
    add-int/lit8 v8, v8, 0x1e

    .line 42
    .line 43
    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v9

    .line 47
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 48
    .line 49
    .line 50
    move-result v9

    .line 51
    add-int/2addr v8, v9

    .line 52
    const/4 v9, 0x1

    .line 53
    add-int/2addr v8, v9

    .line 54
    new-instance v10, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {v10, v8}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-static {v3}, La30;->u(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    iget-object v3, v0, Lka4;->a:Landroid/content/Context;

    .line 82
    .line 83
    iget-object v4, v0, Lka4;->b:Lpz;

    .line 84
    .line 85
    iget-object v5, v0, Lka4;->h:Landroid/os/Looper;

    .line 86
    .line 87
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    iput-object v6, v1, Lya4;->l:Landroid/content/Context;

    .line 92
    .line 93
    new-instance v6, Lmd4;

    .line 94
    .line 95
    invoke-direct {v6, v4}, Lmd4;-><init>(Lpz;)V

    .line 96
    .line 97
    .line 98
    iput-object v6, v1, Lya4;->y:Lmd4;

    .line 99
    .line 100
    iget v6, v0, Lka4;->i:I

    .line 101
    .line 102
    iput v6, v1, Lya4;->a0:I

    .line 103
    .line 104
    iget-object v6, v0, Lka4;->j:Lin2;

    .line 105
    .line 106
    iput-object v6, v1, Lya4;->V:Lin2;

    .line 107
    .line 108
    iget v6, v0, Lka4;->k:I

    .line 109
    .line 110
    iput v6, v1, Lya4;->T:I

    .line 111
    .line 112
    const/4 v8, 0x0

    .line 113
    iput-boolean v8, v1, Lya4;->X:Z

    .line 114
    .line 115
    iget-wide v6, v0, Lka4;->p:J

    .line 116
    .line 117
    iput-wide v6, v1, Lya4;->G:J

    .line 118
    .line 119
    new-instance v6, Loa4;

    .line 120
    .line 121
    invoke-direct {v6, v1}, Loa4;-><init>(Lya4;)V

    .line 122
    .line 123
    .line 124
    iput-object v6, v1, Lya4;->C:Loa4;

    .line 125
    .line 126
    new-instance v7, Lwa4;

    .line 127
    .line 128
    invoke-direct {v7, v8}, Lwa4;-><init>(I)V

    .line 129
    .line 130
    .line 131
    iput-object v7, v1, Lya4;->D:Lwa4;

    .line 132
    .line 133
    new-instance v7, Landroid/os/Handler;

    .line 134
    .line 135
    invoke-direct {v7, v5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 136
    .line 137
    .line 138
    iget-object v10, v0, Lka4;->c:Lrc3;

    .line 139
    .line 140
    iget-object v10, v10, Lrc3;->g:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v10, Lug0;

    .line 143
    .line 144
    invoke-virtual {v10, v7, v6, v6}, Lug0;->z(Landroid/os/Handler;Loa4;Loa4;)[Lkg4;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    iput-object v6, v1, Lya4;->n:[Lkg4;

    .line 149
    .line 150
    const/4 v10, 0x2

    .line 151
    new-array v6, v10, [Lkg4;

    .line 152
    .line 153
    iput-object v6, v1, Lya4;->o:[Lkg4;

    .line 154
    .line 155
    move v6, v8

    .line 156
    :goto_0
    iget-object v7, v1, Lya4;->o:[Lkg4;

    .line 157
    .line 158
    array-length v11, v7

    .line 159
    const/4 v11, 0x0

    .line 160
    if-ge v6, v10, :cond_0

    .line 161
    .line 162
    iget-object v12, v1, Lya4;->n:[Lkg4;

    .line 163
    .line 164
    aget-object v12, v12, v6

    .line 165
    .line 166
    aput-object v11, v7, v6

    .line 167
    .line 168
    add-int/lit8 v6, v6, 0x1

    .line 169
    .line 170
    goto :goto_0

    .line 171
    :catchall_0
    move-exception v0

    .line 172
    goto/16 :goto_5

    .line 173
    .line 174
    :cond_0
    iget-object v6, v0, Lka4;->e:Lll3;

    .line 175
    .line 176
    invoke-interface {v6}, Lll3;->a()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v6

    .line 180
    check-cast v6, Llj4;

    .line 181
    .line 182
    iput-object v6, v1, Lya4;->p:Llj4;

    .line 183
    .line 184
    iget-object v6, v0, Lka4;->d:Lcy2;

    .line 185
    .line 186
    invoke-virtual {v6}, Lcy2;->a()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    iget-object v6, v0, Lka4;->g:Llz1;

    .line 190
    .line 191
    invoke-virtual {v6}, Llz1;->a()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v6

    .line 195
    check-cast v6, Luj4;

    .line 196
    .line 197
    iput-object v6, v1, Lya4;->A:Luj4;

    .line 198
    .line 199
    iget-boolean v6, v0, Lka4;->l:Z

    .line 200
    .line 201
    iput-boolean v6, v1, Lya4;->x:Z

    .line 202
    .line 203
    iget-object v6, v0, Lka4;->m:Llc4;

    .line 204
    .line 205
    iput-object v6, v1, Lya4;->N:Llc4;

    .line 206
    .line 207
    iget-object v6, v0, Lka4;->n:Lkc4;

    .line 208
    .line 209
    iput-object v6, v1, Lya4;->M:Lkc4;

    .line 210
    .line 211
    iput-object v5, v1, Lya4;->z:Landroid/os/Looper;

    .line 212
    .line 213
    iput-object v4, v1, Lya4;->B:Lpz;

    .line 214
    .line 215
    move-object/from16 v6, p2

    .line 216
    .line 217
    iput-object v6, v1, Lya4;->m:Lmc4;

    .line 218
    .line 219
    new-instance v6, Lmu2;

    .line 220
    .line 221
    new-instance v7, Lt24;

    .line 222
    .line 223
    const/16 v12, 0x12

    .line 224
    .line 225
    invoke-direct {v7, v1, v12}, Lt24;-><init>(Lya4;I)V

    .line 226
    .line 227
    .line 228
    invoke-direct {v6, v5, v4, v7}, Lmu2;-><init>(Landroid/os/Looper;Lpz;Lvs2;)V

    .line 229
    .line 230
    .line 231
    iput-object v6, v1, Lya4;->t:Lmu2;

    .line 232
    .line 233
    new-instance v4, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 234
    .line 235
    invoke-direct {v4}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 236
    .line 237
    .line 238
    iput-object v4, v1, Lya4;->u:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 239
    .line 240
    new-instance v4, Ljava/util/ArrayList;

    .line 241
    .line 242
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 243
    .line 244
    .line 245
    iput-object v4, v1, Lya4;->w:Ljava/util/ArrayList;

    .line 246
    .line 247
    new-instance v4, Lni4;

    .line 248
    .line 249
    invoke-direct {v4}, Lni4;-><init>()V

    .line 250
    .line 251
    .line 252
    iput-object v4, v1, Lya4;->f0:Lni4;

    .line 253
    .line 254
    sget-object v4, Lla4;->a:Lla4;

    .line 255
    .line 256
    iput-object v4, v1, Lya4;->O:Lla4;

    .line 257
    .line 258
    new-instance v4, Lpj4;

    .line 259
    .line 260
    iget-object v6, v1, Lya4;->n:[Lkg4;

    .line 261
    .line 262
    array-length v6, v6

    .line 263
    new-array v6, v10, [Ljc4;

    .line 264
    .line 265
    new-array v7, v10, [Lnj4;

    .line 266
    .line 267
    sget-object v12, Lo42;->b:Lo42;

    .line 268
    .line 269
    invoke-direct {v4, v6, v7, v12, v11}, Lpj4;-><init>([Ljc4;[Lnj4;Lo42;Loj4;)V

    .line 270
    .line 271
    .line 272
    iput-object v4, v1, Lya4;->i:Lpj4;

    .line 273
    .line 274
    new-instance v4, Lsw1;

    .line 275
    .line 276
    invoke-direct {v4}, Lsw1;-><init>()V

    .line 277
    .line 278
    .line 279
    iput-object v4, v1, Lya4;->v:Lsw1;

    .line 280
    .line 281
    new-instance v4, Landroid/util/SparseBooleanArray;

    .line 282
    .line 283
    invoke-direct {v4}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 284
    .line 285
    .line 286
    const/16 v6, 0x14

    .line 287
    .line 288
    new-array v7, v6, [I

    .line 289
    .line 290
    fill-array-data v7, :array_0

    .line 291
    .line 292
    .line 293
    move v12, v8

    .line 294
    :goto_1
    if-ge v12, v6, :cond_1

    .line 295
    .line 296
    aget v13, v7, v12

    .line 297
    .line 298
    const/4 v14, 0x0

    .line 299
    xor-int/2addr v14, v9

    .line 300
    invoke-static {v14}, Lzt0;->b0(Z)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v4, v13, v9}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 304
    .line 305
    .line 306
    add-int/lit8 v12, v12, 0x1

    .line 307
    .line 308
    goto :goto_1

    .line 309
    :cond_1
    iget-object v6, v1, Lya4;->p:Llj4;

    .line 310
    .line 311
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    const/4 v6, 0x0

    .line 315
    xor-int/2addr v6, v9

    .line 316
    invoke-static {v6}, Lzt0;->b0(Z)V

    .line 317
    .line 318
    .line 319
    const/16 v6, 0x1d

    .line 320
    .line 321
    invoke-virtual {v4, v6, v9}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 322
    .line 323
    .line 324
    new-instance v6, Lts1;

    .line 325
    .line 326
    const/4 v7, 0x0

    .line 327
    xor-int/2addr v7, v9

    .line 328
    invoke-static {v7}, Lzt0;->b0(Z)V

    .line 329
    .line 330
    .line 331
    new-instance v7, Lof4;

    .line 332
    .line 333
    invoke-direct {v7, v4}, Lof4;-><init>(Landroid/util/SparseBooleanArray;)V

    .line 334
    .line 335
    .line 336
    invoke-direct {v6, v7}, Lts1;-><init>(Lof4;)V

    .line 337
    .line 338
    .line 339
    iput-object v6, v1, Lya4;->j:Lts1;

    .line 340
    .line 341
    new-instance v4, Landroid/util/SparseBooleanArray;

    .line 342
    .line 343
    invoke-direct {v4}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 344
    .line 345
    .line 346
    move v6, v8

    .line 347
    :goto_2
    iget-object v12, v7, Lof4;->a:Landroid/util/SparseBooleanArray;

    .line 348
    .line 349
    invoke-virtual {v12}, Landroid/util/SparseBooleanArray;->size()I

    .line 350
    .line 351
    .line 352
    move-result v12

    .line 353
    if-ge v6, v12, :cond_2

    .line 354
    .line 355
    invoke-virtual {v7, v6}, Lof4;->a(I)I

    .line 356
    .line 357
    .line 358
    move-result v12

    .line 359
    const/4 v13, 0x0

    .line 360
    xor-int/2addr v13, v9

    .line 361
    invoke-static {v13}, Lzt0;->b0(Z)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v4, v12, v9}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 365
    .line 366
    .line 367
    add-int/lit8 v6, v6, 0x1

    .line 368
    .line 369
    goto :goto_2

    .line 370
    :cond_2
    const/4 v6, 0x0

    .line 371
    xor-int/2addr v6, v9

    .line 372
    invoke-static {v6}, Lzt0;->b0(Z)V

    .line 373
    .line 374
    .line 375
    const/4 v12, 0x4

    .line 376
    invoke-virtual {v4, v12, v9}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 377
    .line 378
    .line 379
    const/4 v6, 0x0

    .line 380
    xor-int/2addr v6, v9

    .line 381
    invoke-static {v6}, Lzt0;->b0(Z)V

    .line 382
    .line 383
    .line 384
    invoke-virtual {v4, v2, v9}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 385
    .line 386
    .line 387
    new-instance v2, Lts1;

    .line 388
    .line 389
    const/4 v6, 0x0

    .line 390
    xor-int/2addr v6, v9

    .line 391
    invoke-static {v6}, Lzt0;->b0(Z)V

    .line 392
    .line 393
    .line 394
    new-instance v6, Lof4;

    .line 395
    .line 396
    invoke-direct {v6, v4}, Lof4;-><init>(Landroid/util/SparseBooleanArray;)V

    .line 397
    .line 398
    .line 399
    invoke-direct {v2, v6}, Lts1;-><init>(Lof4;)V

    .line 400
    .line 401
    .line 402
    iput-object v2, v1, Lya4;->P:Lts1;

    .line 403
    .line 404
    iget-object v2, v1, Lya4;->B:Lpz;

    .line 405
    .line 406
    iget-object v4, v1, Lya4;->z:Landroid/os/Looper;

    .line 407
    .line 408
    invoke-virtual {v2, v4, v11}, Lpz;->p(Landroid/os/Looper;Landroid/os/Handler$Callback;)Ld13;

    .line 409
    .line 410
    .line 411
    move-result-object v2

    .line 412
    iput-object v2, v1, Lya4;->q:Ld13;

    .line 413
    .line 414
    new-instance v2, Lci3;

    .line 415
    .line 416
    invoke-direct {v2, v12, v1}, Lci3;-><init>(ILjava/lang/Object;)V

    .line 417
    .line 418
    .line 419
    iput-object v2, v1, Lya4;->r:Lci3;

    .line 420
    .line 421
    iget-object v4, v1, Lya4;->i:Lpj4;

    .line 422
    .line 423
    invoke-static {v4}, Ldc4;->a(Lpj4;)Ldc4;

    .line 424
    .line 425
    .line 426
    move-result-object v4

    .line 427
    iput-object v4, v1, Lya4;->c0:Ldc4;

    .line 428
    .line 429
    iget-object v4, v1, Lya4;->y:Lmd4;

    .line 430
    .line 431
    iget-object v6, v1, Lya4;->m:Lmc4;

    .line 432
    .line 433
    iget-object v7, v1, Lya4;->z:Landroid/os/Looper;

    .line 434
    .line 435
    invoke-virtual {v4, v6, v7}, Lmd4;->A(Lmc4;Landroid/os/Looper;)V

    .line 436
    .line 437
    .line 438
    new-instance v4, Lxd4;

    .line 439
    .line 440
    iget-object v6, v0, Lka4;->w:Ljava/lang/String;

    .line 441
    .line 442
    invoke-direct {v4, v6}, Lxd4;-><init>(Ljava/lang/String;)V

    .line 443
    .line 444
    .line 445
    new-instance v13, Ljb4;

    .line 446
    .line 447
    iget-object v14, v1, Lya4;->l:Landroid/content/Context;

    .line 448
    .line 449
    iget-object v15, v1, Lya4;->n:[Lkg4;

    .line 450
    .line 451
    iget-object v6, v1, Lya4;->o:[Lkg4;

    .line 452
    .line 453
    iget-object v7, v1, Lya4;->p:Llj4;

    .line 454
    .line 455
    iget-object v10, v1, Lya4;->i:Lpj4;

    .line 456
    .line 457
    iget-object v12, v0, Lka4;->f:Lll3;

    .line 458
    .line 459
    invoke-interface {v12}, Lll3;->a()Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v12

    .line 463
    move-object/from16 v19, v12

    .line 464
    .line 465
    check-cast v19, Llb4;

    .line 466
    .line 467
    iget-object v12, v1, Lya4;->A:Luj4;

    .line 468
    .line 469
    move/from16 v31, v8

    .line 470
    .line 471
    iget-object v8, v1, Lya4;->y:Lmd4;

    .line 472
    .line 473
    iget-object v11, v1, Lya4;->N:Llc4;

    .line 474
    .line 475
    iget-object v9, v0, Lka4;->x:Lm44;

    .line 476
    .line 477
    move-object/from16 v28, v2

    .line 478
    .line 479
    move-object/from16 v32, v3

    .line 480
    .line 481
    iget-wide v2, v0, Lka4;->o:J

    .line 482
    .line 483
    move-wide/from16 v24, v2

    .line 484
    .line 485
    iget-object v2, v1, Lya4;->z:Landroid/os/Looper;

    .line 486
    .line 487
    iget-object v3, v1, Lya4;->B:Lpz;

    .line 488
    .line 489
    move-object/from16 v26, v2

    .line 490
    .line 491
    iget-object v2, v1, Lya4;->O:Lla4;

    .line 492
    .line 493
    move-object/from16 v30, v2

    .line 494
    .line 495
    move-object/from16 v27, v3

    .line 496
    .line 497
    move-object/from16 v29, v4

    .line 498
    .line 499
    move-object/from16 v16, v6

    .line 500
    .line 501
    move-object/from16 v17, v7

    .line 502
    .line 503
    move-object/from16 v21, v8

    .line 504
    .line 505
    move-object/from16 v23, v9

    .line 506
    .line 507
    move-object/from16 v18, v10

    .line 508
    .line 509
    move-object/from16 v22, v11

    .line 510
    .line 511
    move-object/from16 v20, v12

    .line 512
    .line 513
    invoke-direct/range {v13 .. v30}, Ljb4;-><init>(Landroid/content/Context;[Lkg4;[Lkg4;Llj4;Lpj4;Llb4;Luj4;Lmd4;Llc4;Lm44;JLandroid/os/Looper;Lpz;Lci3;Lxd4;Lla4;)V

    .line 514
    .line 515
    .line 516
    move-object/from16 v2, v29

    .line 517
    .line 518
    iget-object v3, v13, Ljb4;->o:Landroid/os/Looper;

    .line 519
    .line 520
    iget-object v8, v13, Ljb4;->m:Ld13;

    .line 521
    .line 522
    iput-object v13, v1, Lya4;->s:Ljb4;

    .line 523
    .line 524
    const/high16 v4, 0x3f800000    # 1.0f

    .line 525
    .line 526
    iput v4, v1, Lya4;->W:F

    .line 527
    .line 528
    sget-object v4, Lrm1;->B:Lrm1;

    .line 529
    .line 530
    iput-object v4, v1, Lya4;->Q:Lrm1;

    .line 531
    .line 532
    iput-object v4, v1, Lya4;->b0:Lrm1;

    .line 533
    .line 534
    const/4 v9, -0x1

    .line 535
    iput v9, v1, Lya4;->d0:I

    .line 536
    .line 537
    sget-object v4, Lui2;->a:Lhm3;

    .line 538
    .line 539
    const/4 v4, 0x1

    .line 540
    iput-boolean v4, v1, Lya4;->Y:Z

    .line 541
    .line 542
    iget-object v4, v1, Lya4;->y:Lmd4;

    .line 543
    .line 544
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 545
    .line 546
    .line 547
    iget-object v6, v1, Lya4;->t:Lmu2;

    .line 548
    .line 549
    invoke-virtual {v6, v4}, Lmu2;->a(Ljava/lang/Object;)V

    .line 550
    .line 551
    .line 552
    iget-object v4, v1, Lya4;->A:Luj4;

    .line 553
    .line 554
    new-instance v6, Landroid/os/Handler;

    .line 555
    .line 556
    iget-object v7, v1, Lya4;->z:Landroid/os/Looper;

    .line 557
    .line 558
    invoke-direct {v6, v7}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 559
    .line 560
    .line 561
    iget-object v7, v1, Lya4;->y:Lmd4;

    .line 562
    .line 563
    check-cast v4, Lxj4;

    .line 564
    .line 565
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 566
    .line 567
    .line 568
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 569
    .line 570
    .line 571
    iget-object v4, v4, Lxj4;->h:Lbi3;

    .line 572
    .line 573
    iget-object v10, v4, Lbi3;->g:Ljava/lang/Object;

    .line 574
    .line 575
    check-cast v10, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 576
    .line 577
    invoke-virtual {v10}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 578
    .line 579
    .line 580
    move-result-object v11

    .line 581
    :cond_3
    :goto_3
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 582
    .line 583
    .line 584
    move-result v12

    .line 585
    if-eqz v12, :cond_4

    .line 586
    .line 587
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    move-result-object v12

    .line 591
    check-cast v12, Ltj4;

    .line 592
    .line 593
    iget-object v13, v12, Ltj4;->b:Lmd4;

    .line 594
    .line 595
    if-ne v13, v7, :cond_3

    .line 596
    .line 597
    const/4 v13, 0x1

    .line 598
    iput-boolean v13, v12, Ltj4;->c:Z

    .line 599
    .line 600
    invoke-virtual {v10, v12}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 601
    .line 602
    .line 603
    goto :goto_3

    .line 604
    :cond_4
    new-instance v10, Ltj4;

    .line 605
    .line 606
    invoke-direct {v10, v6, v7}, Ltj4;-><init>(Landroid/os/Handler;Lmd4;)V

    .line 607
    .line 608
    .line 609
    iget-object v4, v4, Lbi3;->g:Ljava/lang/Object;

    .line 610
    .line 611
    check-cast v4, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 612
    .line 613
    invoke-virtual {v4, v10}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 614
    .line 615
    .line 616
    iget-object v4, v1, Lya4;->C:Loa4;

    .line 617
    .line 618
    iget-object v6, v1, Lya4;->u:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 619
    .line 620
    invoke-virtual {v6, v4}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 621
    .line 622
    .line 623
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 624
    .line 625
    const/16 v10, 0x1f

    .line 626
    .line 627
    if-lt v4, v10, :cond_5

    .line 628
    .line 629
    iget-object v4, v1, Lya4;->l:Landroid/content/Context;

    .line 630
    .line 631
    iget-boolean v6, v0, Lka4;->u:Z

    .line 632
    .line 633
    iget-object v7, v1, Lya4;->B:Lpz;

    .line 634
    .line 635
    const/4 v11, 0x0

    .line 636
    invoke-virtual {v7, v3, v11}, Lpz;->p(Landroid/os/Looper;Landroid/os/Handler$Callback;)Ld13;

    .line 637
    .line 638
    .line 639
    move-result-object v7

    .line 640
    new-instance v11, Lma4;

    .line 641
    .line 642
    invoke-direct {v11, v4, v6, v1, v2}, Lma4;-><init>(Landroid/content/Context;ZLya4;Lxd4;)V

    .line 643
    .line 644
    .line 645
    invoke-virtual {v7, v11}, Ld13;->d(Ljava/lang/Runnable;)Z

    .line 646
    .line 647
    .line 648
    :cond_5
    new-instance v2, Lfw3;

    .line 649
    .line 650
    invoke-static/range {v31 .. v31}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 651
    .line 652
    .line 653
    move-result-object v11

    .line 654
    iget-object v4, v1, Lya4;->z:Landroid/os/Looper;

    .line 655
    .line 656
    iget-object v6, v1, Lya4;->B:Lpz;

    .line 657
    .line 658
    new-instance v7, Lil3;

    .line 659
    .line 660
    const/4 v12, 0x3

    .line 661
    invoke-direct {v7, v12, v1}, Lil3;-><init>(ILjava/lang/Object;)V

    .line 662
    .line 663
    .line 664
    invoke-direct {v2, v3, v4, v6, v7}, Lfw3;-><init>(Landroid/os/Looper;Landroid/os/Looper;Lpz;Lil3;)V

    .line 665
    .line 666
    .line 667
    iput-object v2, v1, Lya4;->H:Lfw3;

    .line 668
    .line 669
    new-instance v4, Lbh3;

    .line 670
    .line 671
    const/16 v13, 0x9

    .line 672
    .line 673
    invoke-direct {v4, v13, v1}, Lbh3;-><init>(ILjava/lang/Object;)V

    .line 674
    .line 675
    .line 676
    iget-object v2, v2, Lfw3;->g:Ljava/lang/Object;

    .line 677
    .line 678
    check-cast v2, Ld13;

    .line 679
    .line 680
    iget-object v6, v2, Ld13;->a:Landroid/os/Handler;

    .line 681
    .line 682
    invoke-virtual {v6}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 683
    .line 684
    .line 685
    move-result-object v6

    .line 686
    invoke-virtual {v6}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 687
    .line 688
    .line 689
    move-result-object v6

    .line 690
    invoke-virtual {v6}, Ljava/lang/Thread;->isAlive()Z

    .line 691
    .line 692
    .line 693
    move-result v6

    .line 694
    if-nez v6, :cond_6

    .line 695
    .line 696
    goto :goto_4

    .line 697
    :cond_6
    invoke-virtual {v2, v4}, Ld13;->d(Ljava/lang/Runnable;)Z

    .line 698
    .line 699
    .line 700
    :goto_4
    new-instance v2, Ltt3;

    .line 701
    .line 702
    iget-object v4, v1, Lya4;->B:Lpz;

    .line 703
    .line 704
    const/16 v6, 0x13

    .line 705
    .line 706
    invoke-direct {v2, v6}, Ltt3;-><init>(I)V

    .line 707
    .line 708
    .line 709
    invoke-virtual/range {v32 .. v32}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 710
    .line 711
    .line 712
    const/4 v6, 0x0

    .line 713
    invoke-virtual {v4, v3, v6}, Lpz;->p(Landroid/os/Looper;Landroid/os/Handler$Callback;)Ld13;

    .line 714
    .line 715
    .line 716
    new-instance v7, Ld6;

    .line 717
    .line 718
    invoke-virtual {v4, v5, v6}, Lpz;->p(Landroid/os/Looper;Landroid/os/Handler$Callback;)Ld13;

    .line 719
    .line 720
    .line 721
    move-result-object v4

    .line 722
    invoke-direct {v7, v2, v4}, Ld6;-><init>(Ltt3;Ld13;)V

    .line 723
    .line 724
    .line 725
    new-instance v2, Lkj1;

    .line 726
    .line 727
    iget-object v4, v1, Lya4;->B:Lpz;

    .line 728
    .line 729
    const/4 v14, 0x6

    .line 730
    invoke-direct {v2, v14}, Lkj1;-><init>(I)V

    .line 731
    .line 732
    .line 733
    invoke-virtual/range {v32 .. v32}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 734
    .line 735
    .line 736
    const/4 v6, 0x0

    .line 737
    invoke-virtual {v4, v3, v6}, Lpz;->p(Landroid/os/Looper;Landroid/os/Handler$Callback;)Ld13;

    .line 738
    .line 739
    .line 740
    iput-object v2, v1, Lya4;->E:Lkj1;

    .line 741
    .line 742
    new-instance v2, Lkj1;

    .line 743
    .line 744
    iget-object v4, v1, Lya4;->B:Lpz;

    .line 745
    .line 746
    const/4 v5, 0x7

    .line 747
    invoke-direct {v2, v5}, Lkj1;-><init>(I)V

    .line 748
    .line 749
    .line 750
    invoke-virtual/range {v32 .. v32}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 751
    .line 752
    .line 753
    const/4 v6, 0x0

    .line 754
    invoke-virtual {v4, v3, v6}, Lpz;->p(Landroid/os/Looper;Landroid/os/Handler$Callback;)Ld13;

    .line 755
    .line 756
    .line 757
    iput-object v2, v1, Lya4;->F:Lkj1;

    .line 758
    .line 759
    sget v2, Ltc4;->a:I

    .line 760
    .line 761
    sget-object v2, Lt82;->d:Lt82;

    .line 762
    .line 763
    sget-object v2, Luz2;->c:Luz2;

    .line 764
    .line 765
    iput-object v2, v1, Lya4;->U:Luz2;

    .line 766
    .line 767
    new-instance v2, Lyc4;

    .line 768
    .line 769
    move-object v3, v2

    .line 770
    iget-object v2, v1, Lya4;->C:Loa4;

    .line 771
    .line 772
    move-object v4, v3

    .line 773
    iget-object v3, v1, Lya4;->B:Lpz;

    .line 774
    .line 775
    move-object v5, v4

    .line 776
    iget v4, v0, Lka4;->q:I

    .line 777
    .line 778
    move-object v6, v5

    .line 779
    iget v5, v0, Lka4;->r:I

    .line 780
    .line 781
    move-object v7, v6

    .line 782
    iget v6, v0, Lka4;->s:I

    .line 783
    .line 784
    iget v0, v0, Lka4;->t:I

    .line 785
    .line 786
    move-object/from16 v33, v7

    .line 787
    .line 788
    move v7, v0

    .line 789
    move-object/from16 v0, v33

    .line 790
    .line 791
    invoke-direct/range {v0 .. v7}, Lyc4;-><init>(Lya4;Loa4;Lpz;IIII)V

    .line 792
    .line 793
    .line 794
    iput-object v0, v1, Lya4;->I:Lyc4;

    .line 795
    .line 796
    iget-object v0, v1, Lya4;->M:Lkc4;

    .line 797
    .line 798
    const/16 v2, 0x26

    .line 799
    .line 800
    invoke-virtual {v8, v2, v0}, Ld13;->a(ILjava/lang/Object;)Lv03;

    .line 801
    .line 802
    .line 803
    move-result-object v0

    .line 804
    invoke-virtual {v0}, Lv03;->a()V

    .line 805
    .line 806
    .line 807
    iget-object v0, v1, Lya4;->V:Lin2;

    .line 808
    .line 809
    iget-object v2, v8, Ld13;->a:Landroid/os/Handler;

    .line 810
    .line 811
    invoke-static {}, Ld13;->f()Lv03;

    .line 812
    .line 813
    .line 814
    move-result-object v3

    .line 815
    move/from16 v4, v31

    .line 816
    .line 817
    invoke-virtual {v2, v10, v4, v4, v0}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 818
    .line 819
    .line 820
    move-result-object v0

    .line 821
    iput-object v0, v3, Lv03;->a:Landroid/os/Message;

    .line 822
    .line 823
    invoke-virtual {v3}, Lv03;->a()V

    .line 824
    .line 825
    .line 826
    iget-object v0, v1, Lya4;->V:Lin2;

    .line 827
    .line 828
    const/4 v4, 0x1

    .line 829
    invoke-virtual {v1, v4, v0, v12}, Lya4;->k2(ILjava/lang/Object;I)V

    .line 830
    .line 831
    .line 832
    iget v0, v1, Lya4;->T:I

    .line 833
    .line 834
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 835
    .line 836
    .line 837
    move-result-object v0

    .line 838
    const/4 v2, 0x4

    .line 839
    const/4 v3, 0x2

    .line 840
    invoke-virtual {v1, v3, v0, v2}, Lya4;->k2(ILjava/lang/Object;I)V

    .line 841
    .line 842
    .line 843
    const/4 v0, 0x5

    .line 844
    invoke-virtual {v1, v3, v11, v0}, Lya4;->k2(ILjava/lang/Object;I)V

    .line 845
    .line 846
    .line 847
    iget-boolean v0, v1, Lya4;->X:Z

    .line 848
    .line 849
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 850
    .line 851
    .line 852
    move-result-object v0

    .line 853
    const/4 v4, 0x1

    .line 854
    invoke-virtual {v1, v4, v0, v13}, Lya4;->k2(ILjava/lang/Object;I)V

    .line 855
    .line 856
    .line 857
    iget-object v0, v1, Lya4;->D:Lwa4;

    .line 858
    .line 859
    const/16 v2, 0x8

    .line 860
    .line 861
    invoke-virtual {v1, v14, v0, v2}, Lya4;->k2(ILjava/lang/Object;I)V

    .line 862
    .line 863
    .line 864
    iget v0, v1, Lya4;->a0:I

    .line 865
    .line 866
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 867
    .line 868
    .line 869
    move-result-object v0

    .line 870
    const/16 v2, 0x10

    .line 871
    .line 872
    invoke-virtual {v1, v9, v0, v2}, Lya4;->k2(ILjava/lang/Object;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 873
    .line 874
    .line 875
    iget-object v0, v1, Lya4;->k:Lhp2;

    .line 876
    .line 877
    invoke-virtual {v0}, Lhp2;->a()Z

    .line 878
    .line 879
    .line 880
    return-void

    .line 881
    :goto_5
    iget-object v2, v1, Lya4;->k:Lhp2;

    .line 882
    .line 883
    invoke-virtual {v2}, Lhp2;->a()Z

    .line 884
    .line 885
    .line 886
    throw v0

    .line 887
    :array_0
    .array-data 4
        0x1
        0x2
        0x3
        0xd
        0xe
        0xf
        0x10
        0x11
        0x12
        0x13
        0x1f
        0x14
        0x1e
        0x15
        0x23
        0x16
        0x18
        0x1b
        0x1c
        0x20
    .end array-data
.end method

.method public static d2(Ldc4;)J
    .locals 7

    .line 1
    new-instance v0, Lez1;

    .line 2
    .line 3
    invoke-direct {v0}, Lez1;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lsw1;

    .line 7
    .line 8
    invoke-direct {v1}, Lsw1;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Ldc4;->a:Loz1;

    .line 12
    .line 13
    iget-object v3, p0, Ldc4;->b:Lkh4;

    .line 14
    .line 15
    iget-object v3, v3, Lkh4;->a:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-virtual {v2, v3, v1}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 18
    .line 19
    .line 20
    iget-wide v3, p0, Ldc4;->c:J

    .line 21
    .line 22
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    cmp-long p0, v3, v5

    .line 28
    .line 29
    if-nez p0, :cond_0

    .line 30
    .line 31
    iget p0, v1, Lsw1;->c:I

    .line 32
    .line 33
    const-wide/16 v3, 0x0

    .line 34
    .line 35
    invoke-virtual {v2, p0, v0, v3, v4}, Loz1;->b(ILez1;J)Lez1;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    :cond_0
    return-wide v3
.end method

.method public static f2(Ldc4;I)Ldc4;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Ldc4;->d(I)Ldc4;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x1

    .line 6
    if-eq p1, v0, :cond_1

    .line 7
    .line 8
    const/4 v0, 0x4

    .line 9
    if-ne p1, v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-object p0

    .line 13
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 14
    invoke-virtual {p0, p1}, Ldc4;->f(Z)Ldc4;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method


# virtual methods
.method public final C1()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lya4;->j2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lya4;->c0:Ldc4;

    .line 5
    .line 6
    iget v0, v0, Ldc4;->e:I

    .line 7
    .line 8
    return v0
.end method

.method public final D1()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lya4;->j2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lya4;->c0:Ldc4;

    .line 5
    .line 6
    iget v0, v0, Ldc4;->n:I

    .line 7
    .line 8
    return v0
.end method

.method public final H1()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lya4;->j2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lya4;->c0:Ldc4;

    .line 5
    .line 6
    iget-boolean v0, v0, Ldc4;->l:Z

    .line 7
    .line 8
    return v0
.end method

.method public final I1()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lya4;->j2()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final J1()Lo42;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lya4;->j2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lya4;->c0:Ldc4;

    .line 5
    .line 6
    iget-object v0, v0, Ldc4;->i:Lpj4;

    .line 7
    .line 8
    iget-object v0, v0, Lpj4;->i:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lo42;

    .line 11
    .line 12
    return-object v0
.end method

.method public final K1()Loz1;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lya4;->j2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lya4;->c0:Ldc4;

    .line 5
    .line 6
    iget-object v0, v0, Ldc4;->a:Loz1;

    .line 7
    .line 8
    return-object v0
.end method

.method public final N1()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lya4;->j2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lya4;->c0:Ldc4;

    .line 5
    .line 6
    iget-object v0, v0, Ldc4;->a:Loz1;

    .line 7
    .line 8
    invoke-virtual {v0}, Loz1;->g()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    return v0

    .line 16
    :cond_0
    iget-object v0, p0, Lya4;->c0:Ldc4;

    .line 17
    .line 18
    iget-object v1, v0, Ldc4;->a:Loz1;

    .line 19
    .line 20
    iget-object v0, v0, Ldc4;->b:Lkh4;

    .line 21
    .line 22
    iget-object v0, v0, Lkh4;->a:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Loz1;->e(Ljava/lang/Object;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    return v0
.end method

.method public final O1()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lya4;->j2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lya4;->c0:Ldc4;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lya4;->Z1(Ldc4;)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, -0x1

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    :cond_0
    return v0
.end method

.method public final Q1()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lya4;->j2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lya4;->c0:Ldc4;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lya4;->b2(Ldc4;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    invoke-static {v0, v1}, Lv23;->q(J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    return-wide v0
.end method

.method public final R1()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lya4;->j2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lya4;->c0:Ldc4;

    .line 5
    .line 6
    iget-wide v0, v0, Ldc4;->q:J

    .line 7
    .line 8
    invoke-static {v0, v1}, Lv23;->q(J)J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
.end method

.method public final S1()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lya4;->j2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lya4;->c0:Ldc4;

    .line 5
    .line 6
    iget-object v0, v0, Ldc4;->b:Lkh4;

    .line 7
    .line 8
    invoke-virtual {v0}, Lkh4;->b()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public final T1()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lya4;->j2()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lya4;->S1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lya4;->c0:Ldc4;

    .line 11
    .line 12
    iget-object v0, v0, Ldc4;->b:Lkh4;

    .line 13
    .line 14
    iget v0, v0, Lkh4;->c:I

    .line 15
    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, -0x1

    .line 18
    return v0
.end method

.method public final U1(F)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lya4;->j2()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lv23;->a:Ljava/lang/String;

    .line 5
    .line 6
    const/high16 v0, 0x3f800000    # 1.0f

    .line 7
    .line 8
    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iget v0, p0, Lya4;->W:F

    .line 18
    .line 19
    cmpl-float v0, v0, p1

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    iput p1, p0, Lya4;->W:F

    .line 25
    .line 26
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v1, p0, Lya4;->s:Ljb4;

    .line 31
    .line 32
    iget-object v1, v1, Ljb4;->m:Ld13;

    .line 33
    .line 34
    const/16 v2, 0x20

    .line 35
    .line 36
    invoke-virtual {v1, v2, v0}, Ld13;->a(ILjava/lang/Object;)Lv03;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Lv03;->a()V

    .line 41
    .line 42
    .line 43
    new-instance v0, Lt24;

    .line 44
    .line 45
    invoke-direct {v0, p1}, Lt24;-><init>(F)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Lya4;->t:Lmu2;

    .line 49
    .line 50
    const/16 v1, 0x16

    .line 51
    .line 52
    invoke-virtual {p1, v1, v0}, Lmu2;->c(ILks2;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Lmu2;->d()V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final V1(Lbd4;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lya4;->y:Lmd4;

    .line 2
    .line 3
    iget-object v0, v0, Lmd4;->k:Lmu2;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lmu2;->a(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final W1(Lsf2;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lya4;->j2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lya4;->y:Lmd4;

    .line 5
    .line 6
    iget-object v0, v0, Lmd4;->k:Lmu2;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lmu2;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final X1()V
    .locals 7

    .line 1
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lv23;->a:Ljava/lang/String;

    .line 10
    .line 11
    sget-object v2, Lzk1;->a:Ljava/util/HashSet;

    .line 12
    .line 13
    const-class v2, Lzk1;

    .line 14
    .line 15
    monitor-enter v2

    .line 16
    :try_start_0
    sget-object v3, Lzk1;->b:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    monitor-exit v2

    .line 19
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    add-int/lit8 v2, v2, 0x21

    .line 44
    .line 45
    add-int/2addr v2, v4

    .line 46
    add-int/lit8 v2, v2, 0x3

    .line 47
    .line 48
    add-int/2addr v2, v5

    .line 49
    new-instance v4, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    const/4 v5, 0x1

    .line 52
    add-int/2addr v2, v5

    .line 53
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 54
    .line 55
    .line 56
    const-string v2, "Release "

    .line 57
    .line 58
    const-string v6, " [AndroidXMedia3/1.8.0] ["

    .line 59
    .line 60
    invoke-static {v4, v2, v0, v6, v1}, Lex0;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const-string v0, "] ["

    .line 64
    .line 65
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v0, "]"

    .line 72
    .line 73
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-static {v0}, La30;->u(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Lya4;->j2()V

    .line 84
    .line 85
    .line 86
    iget-object v0, p0, Lya4;->E:Lkj1;

    .line 87
    .line 88
    iget-boolean v1, v0, Lkj1;->g:Z

    .line 89
    .line 90
    const/4 v2, 0x0

    .line 91
    if-nez v1, :cond_0

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_0
    iput-boolean v2, v0, Lkj1;->g:Z

    .line 95
    .line 96
    :goto_0
    iget-object v0, p0, Lya4;->F:Lkj1;

    .line 97
    .line 98
    iget-boolean v1, v0, Lkj1;->g:Z

    .line 99
    .line 100
    if-nez v1, :cond_1

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_1
    iput-boolean v2, v0, Lkj1;->g:Z

    .line 104
    .line 105
    :goto_1
    iget-object v0, p0, Lya4;->I:Lyc4;

    .line 106
    .line 107
    iget-object v1, v0, Lyc4;->i:Ld13;

    .line 108
    .line 109
    iget-object v1, v1, Ld13;->a:Landroid/os/Handler;

    .line 110
    .line 111
    const/4 v2, 0x0

    .line 112
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    iget-object v1, v0, Lyc4;->f:Lya4;

    .line 116
    .line 117
    invoke-virtual {v1}, Lya4;->j2()V

    .line 118
    .line 119
    .line 120
    iget-object v1, v1, Lya4;->t:Lmu2;

    .line 121
    .line 122
    invoke-virtual {v1, v0}, Lmu2;->b(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    iget-object v0, p0, Lya4;->s:Ljb4;

    .line 126
    .line 127
    iget-boolean v1, v0, Ljb4;->M:Z

    .line 128
    .line 129
    if-nez v1, :cond_3

    .line 130
    .line 131
    iget-object v1, v0, Ljb4;->o:Landroid/os/Looper;

    .line 132
    .line 133
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-virtual {v1}, Ljava/lang/Thread;->isAlive()Z

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    if-nez v1, :cond_2

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_2
    iput-boolean v5, v0, Ljb4;->M:Z

    .line 145
    .line 146
    new-instance v1, Lhp2;

    .line 147
    .line 148
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 149
    .line 150
    .line 151
    iget-object v3, v0, Ljb4;->m:Ld13;

    .line 152
    .line 153
    const/4 v4, 0x7

    .line 154
    invoke-virtual {v3, v4, v1}, Ld13;->a(ILjava/lang/Object;)Lv03;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    invoke-virtual {v3}, Lv03;->a()V

    .line 159
    .line 160
    .line 161
    iget-wide v3, v0, Ljb4;->y:J

    .line 162
    .line 163
    invoke-virtual {v1, v3, v4}, Lhp2;->c(J)Z

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    goto :goto_3

    .line 168
    :cond_3
    :goto_2
    move v0, v5

    .line 169
    :goto_3
    if-nez v0, :cond_4

    .line 170
    .line 171
    iget-object v0, p0, Lya4;->t:Lmu2;

    .line 172
    .line 173
    const/16 v1, 0xa

    .line 174
    .line 175
    sget-object v3, Ly24;->m:Ly24;

    .line 176
    .line 177
    invoke-virtual {v0, v1, v3}, Lmu2;->c(ILks2;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0}, Lmu2;->d()V

    .line 181
    .line 182
    .line 183
    :cond_4
    iget-object v0, p0, Lya4;->t:Lmu2;

    .line 184
    .line 185
    invoke-virtual {v0}, Lmu2;->e()V

    .line 186
    .line 187
    .line 188
    iget-object v0, p0, Lya4;->q:Ld13;

    .line 189
    .line 190
    iget-object v0, v0, Ld13;->a:Landroid/os/Handler;

    .line 191
    .line 192
    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    iget-object v0, p0, Lya4;->A:Luj4;

    .line 196
    .line 197
    iget-object v1, p0, Lya4;->y:Lmd4;

    .line 198
    .line 199
    check-cast v0, Lxj4;

    .line 200
    .line 201
    iget-object v0, v0, Lxj4;->h:Lbi3;

    .line 202
    .line 203
    iget-object v0, v0, Lbi3;->g:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 206
    .line 207
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    :cond_5
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 212
    .line 213
    .line 214
    move-result v4

    .line 215
    if-eqz v4, :cond_6

    .line 216
    .line 217
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v4

    .line 221
    check-cast v4, Ltj4;

    .line 222
    .line 223
    iget-object v6, v4, Ltj4;->b:Lmd4;

    .line 224
    .line 225
    if-ne v6, v1, :cond_5

    .line 226
    .line 227
    iput-boolean v5, v4, Ltj4;->c:Z

    .line 228
    .line 229
    invoke-virtual {v0, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    goto :goto_4

    .line 233
    :cond_6
    iget-object v0, p0, Lya4;->c0:Ldc4;

    .line 234
    .line 235
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    iget-object v0, p0, Lya4;->c0:Ldc4;

    .line 239
    .line 240
    invoke-static {v0, v5}, Lya4;->f2(Ldc4;I)Ldc4;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    iput-object v0, p0, Lya4;->c0:Ldc4;

    .line 245
    .line 246
    iget-object v3, v0, Ldc4;->b:Lkh4;

    .line 247
    .line 248
    invoke-virtual {v0, v3}, Ldc4;->g(Lkh4;)Ldc4;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    iput-object v0, p0, Lya4;->c0:Ldc4;

    .line 253
    .line 254
    iget-wide v3, v0, Ldc4;->r:J

    .line 255
    .line 256
    iput-wide v3, v0, Ldc4;->p:J

    .line 257
    .line 258
    iget-object v0, p0, Lya4;->c0:Ldc4;

    .line 259
    .line 260
    const-wide/16 v3, 0x0

    .line 261
    .line 262
    iput-wide v3, v0, Ldc4;->q:J

    .line 263
    .line 264
    iget-object v0, v1, Lmd4;->m:Ld13;

    .line 265
    .line 266
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    new-instance v3, Lbh3;

    .line 270
    .line 271
    const/16 v4, 0xc

    .line 272
    .line 273
    invoke-direct {v3, v4, v1}, Lbh3;-><init>(ILjava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v0, v3}, Ld13;->d(Ljava/lang/Runnable;)Z

    .line 277
    .line 278
    .line 279
    iget-object v0, p0, Lya4;->S:Landroid/view/Surface;

    .line 280
    .line 281
    if-eqz v0, :cond_7

    .line 282
    .line 283
    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    .line 284
    .line 285
    .line 286
    iput-object v2, p0, Lya4;->S:Landroid/view/Surface;

    .line 287
    .line 288
    :cond_7
    sget-object v0, Lui2;->a:Lhm3;

    .line 289
    .line 290
    return-void

    .line 291
    :catchall_0
    move-exception v0

    .line 292
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 293
    throw v0
.end method

.method public final Y1(Lb84;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lya4;->c0:Ldc4;

    .line 2
    .line 3
    iget-object v1, v0, Ldc4;->b:Lkh4;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ldc4;->g(Lkh4;)Ldc4;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-wide v1, v0, Ldc4;->r:J

    .line 10
    .line 11
    iput-wide v1, v0, Ldc4;->p:J

    .line 12
    .line 13
    const-wide/16 v1, 0x0

    .line 14
    .line 15
    iput-wide v1, v0, Ldc4;->q:J

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-static {v0, v1}, Lya4;->f2(Ldc4;I)Ldc4;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ldc4;->e(Lb84;)Ldc4;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :cond_0
    move-object v3, v0

    .line 29
    iget p1, p0, Lya4;->J:I

    .line 30
    .line 31
    add-int/2addr p1, v1

    .line 32
    iput p1, p0, Lya4;->J:I

    .line 33
    .line 34
    iget-object p1, p0, Lya4;->s:Ljb4;

    .line 35
    .line 36
    iget-object p1, p1, Ljb4;->m:Ld13;

    .line 37
    .line 38
    iget-object p1, p1, Ld13;->a:Landroid/os/Handler;

    .line 39
    .line 40
    invoke-static {}, Ld13;->f()Lv03;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const/4 v1, 0x6

    .line 45
    invoke-virtual {p1, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iput-object p1, v0, Lv03;->a:Landroid/os/Message;

    .line 50
    .line 51
    invoke-virtual {v0}, Lv03;->a()V

    .line 52
    .line 53
    .line 54
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    const/4 v9, -0x1

    .line 60
    const/4 v4, 0x0

    .line 61
    const/4 v5, 0x0

    .line 62
    const/4 v6, 0x5

    .line 63
    move-object v2, p0

    .line 64
    invoke-virtual/range {v2 .. v9}, Lya4;->c2(Ldc4;IZIJI)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public final Z1(Ldc4;)I
    .locals 2

    .line 1
    iget-object v0, p1, Ldc4;->a:Loz1;

    .line 2
    .line 3
    invoke-virtual {v0}, Loz1;->g()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget p1, p0, Lya4;->d0:I

    .line 10
    .line 11
    return p1

    .line 12
    :cond_0
    iget-object p1, p1, Ldc4;->b:Lkh4;

    .line 13
    .line 14
    iget-object p1, p1, Lkh4;->a:Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v1, p0, Lya4;->v:Lsw1;

    .line 17
    .line 18
    invoke-virtual {v0, p1, v1}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget p1, p1, Lsw1;->c:I

    .line 23
    .line 24
    return p1
.end method

.method public final a2(Ldc4;)J
    .locals 10

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    invoke-static {v0, v1}, Lv23;->q(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v2

    .line 7
    iget-object v4, p1, Ldc4;->b:Lkh4;

    .line 8
    .line 9
    invoke-virtual {v4}, Lkh4;->b()Z

    .line 10
    .line 11
    .line 12
    move-result v5

    .line 13
    if-eqz v5, :cond_1

    .line 14
    .line 15
    iget-object v5, p1, Ldc4;->a:Loz1;

    .line 16
    .line 17
    iget-object v4, v4, Lkh4;->a:Ljava/lang/Object;

    .line 18
    .line 19
    iget-object v6, p0, Lya4;->v:Lsw1;

    .line 20
    .line 21
    invoke-virtual {v5, v4, v6}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 22
    .line 23
    .line 24
    iget-wide v6, p1, Ldc4;->c:J

    .line 25
    .line 26
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    cmp-long v4, v6, v8

    .line 32
    .line 33
    if-nez v4, :cond_0

    .line 34
    .line 35
    invoke-virtual {p0, p1}, Lya4;->Z1(Ldc4;)I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    iget-object v4, p0, Lf74;->g:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v4, Lez1;

    .line 42
    .line 43
    invoke-virtual {v5, p1, v4, v0, v1}, Loz1;->b(ILez1;J)Lez1;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    return-wide v2

    .line 51
    :cond_0
    invoke-static {v6, v7}, Lv23;->q(J)J

    .line 52
    .line 53
    .line 54
    move-result-wide v0

    .line 55
    add-long/2addr v0, v2

    .line 56
    return-wide v0

    .line 57
    :cond_1
    invoke-virtual {p0, p1}, Lya4;->b2(Ldc4;)J

    .line 58
    .line 59
    .line 60
    move-result-wide v0

    .line 61
    invoke-static {v0, v1}, Lv23;->q(J)J

    .line 62
    .line 63
    .line 64
    move-result-wide v0

    .line 65
    return-wide v0
.end method

.method public final b2(Ldc4;)J
    .locals 4

    .line 1
    iget-object v0, p1, Ldc4;->a:Loz1;

    .line 2
    .line 3
    invoke-virtual {v0}, Loz1;->g()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-wide v0, p0, Lya4;->e0:J

    .line 10
    .line 11
    invoke-static {v0, v1}, Lv23;->r(J)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    return-wide v0

    .line 16
    :cond_0
    iget-wide v1, p1, Ldc4;->r:J

    .line 17
    .line 18
    iget-object p1, p1, Ldc4;->b:Lkh4;

    .line 19
    .line 20
    invoke-virtual {p1}, Lkh4;->b()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    return-wide v1

    .line 27
    :cond_1
    iget-object p1, p1, Lkh4;->a:Ljava/lang/Object;

    .line 28
    .line 29
    iget-object v3, p0, Lya4;->v:Lsw1;

    .line 30
    .line 31
    invoke-virtual {v0, p1, v3}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 32
    .line 33
    .line 34
    return-wide v1
.end method

.method public final c2(Ldc4;IZIJI)V
    .locals 32

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p4

    const/4 v3, -0x1

    .line 1
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 2
    iget-object v5, v0, Lya4;->c0:Ldc4;

    iput-object v1, v0, Lya4;->c0:Ldc4;

    iget-object v6, v5, Ldc4;->a:Loz1;

    iget-object v7, v1, Ldc4;->a:Loz1;

    invoke-virtual {v6, v7}, Loz1;->equals(Ljava/lang/Object;)Z

    move-result v8

    .line 3
    invoke-virtual {v7}, Loz1;->g()Z

    move-result v9

    const/4 v11, 0x3

    const-wide/16 v12, 0x0

    if-eqz v9, :cond_0

    invoke-virtual {v6}, Loz1;->g()Z

    move-result v9

    if-eqz v9, :cond_0

    new-instance v9, Landroid/util/Pair;

    .line 4
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v9, v3, v4}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    move v3, v2

    const/16 v16, 0x0

    move/from16 v2, p3

    goto/16 :goto_5

    .line 5
    :cond_0
    invoke-virtual {v7}, Loz1;->g()Z

    move-result v3

    invoke-virtual {v6}, Loz1;->g()Z

    move-result v9

    if-eq v3, v9, :cond_1

    new-instance v9, Landroid/util/Pair;

    .line 6
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-direct {v9, v3, v4}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    .line 7
    :cond_1
    iget-object v3, v5, Ldc4;->b:Lkh4;

    iget-object v9, v3, Lkh4;->a:Ljava/lang/Object;

    const/16 v16, 0x0

    iget-object v15, v0, Lya4;->v:Lsw1;

    .line 8
    invoke-virtual {v6, v9, v15}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    move-result-object v9

    iget v9, v9, Lsw1;->c:I

    iget-object v11, v0, Lf74;->g:Ljava/lang/Object;

    check-cast v11, Lez1;

    .line 9
    invoke-virtual {v6, v9, v11, v12, v13}, Loz1;->b(ILez1;J)Lez1;

    move-result-object v9

    .line 10
    iget-object v9, v9, Lez1;->a:Ljava/lang/Object;

    .line 11
    iget-object v10, v1, Ldc4;->b:Lkh4;

    iget-object v14, v10, Lkh4;->a:Ljava/lang/Object;

    .line 12
    invoke-virtual {v7, v14, v15}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    move-result-object v14

    iget v14, v14, Lsw1;->c:I

    .line 13
    invoke-virtual {v7, v14, v11, v12, v13}, Loz1;->b(ILez1;J)Lez1;

    move-result-object v11

    .line 14
    iget-object v11, v11, Lez1;->a:Ljava/lang/Object;

    .line 15
    invoke-virtual {v9, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_6

    if-eqz p3, :cond_3

    if-nez v2, :cond_2

    move/from16 v2, v16

    const/4 v3, 0x1

    const/4 v4, 0x1

    goto :goto_2

    :cond_2
    const/4 v3, 0x1

    const/4 v4, 0x1

    goto :goto_1

    :cond_3
    move/from16 v3, v16

    move v4, v3

    :goto_1
    if-eqz v3, :cond_4

    const/4 v9, 0x1

    if-ne v2, v9, :cond_4

    move v3, v4

    const/4 v4, 0x2

    goto :goto_2

    :cond_4
    if-nez v8, :cond_5

    const/4 v4, 0x3

    :goto_2
    new-instance v9, Landroid/util/Pair;

    .line 16
    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-direct {v9, v10, v4}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move/from16 v31, v3

    move v3, v2

    move/from16 v2, v31

    goto :goto_5

    .line 17
    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 18
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    :cond_6
    if-eqz p3, :cond_9

    if-nez v2, :cond_8

    .line 19
    iget-wide v2, v3, Lkh4;->d:J

    iget-wide v9, v10, Lkh4;->d:J

    cmp-long v2, v2, v9

    if-gez v2, :cond_7

    new-instance v9, Landroid/util/Pair;

    .line 20
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v9, v2, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move/from16 v3, v16

    const/4 v2, 0x1

    goto :goto_5

    :cond_7
    move/from16 v3, v16

    :goto_3
    const/4 v2, 0x1

    goto :goto_4

    :cond_8
    move v3, v2

    goto :goto_3

    :cond_9
    move v3, v2

    move/from16 v2, v16

    :goto_4
    new-instance v9, Landroid/util/Pair;

    .line 21
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v9, v10, v4}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 22
    :goto_5
    iget-object v4, v9, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    .line 23
    iget-object v9, v9, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    if-eqz v4, :cond_b

    .line 24
    invoke-virtual {v7}, Loz1;->g()Z

    move-result v11

    if-nez v11, :cond_a

    .line 25
    iget-object v11, v1, Ldc4;->b:Lkh4;

    iget-object v11, v11, Lkh4;->a:Ljava/lang/Object;

    iget-object v14, v0, Lya4;->v:Lsw1;

    .line 26
    invoke-virtual {v7, v11, v14}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    move-result-object v11

    iget v11, v11, Lsw1;->c:I

    iget-object v14, v0, Lf74;->g:Ljava/lang/Object;

    check-cast v14, Lez1;

    .line 27
    invoke-virtual {v7, v11, v14, v12, v13}, Loz1;->b(ILez1;J)Lez1;

    move-result-object v7

    .line 28
    iget-object v7, v7, Lez1;->b:Lfk1;

    goto :goto_6

    :cond_a
    const/4 v7, 0x0

    .line 29
    :goto_6
    sget-object v11, Lrm1;->B:Lrm1;

    iput-object v11, v0, Lya4;->b0:Lrm1;

    goto :goto_7

    :cond_b
    const/4 v7, 0x0

    :goto_7
    if-nez v4, :cond_d

    .line 30
    iget-object v11, v5, Ldc4;->j:Ljava/util/List;

    iget-object v14, v1, Ldc4;->j:Ljava/util/List;

    .line 31
    invoke-virtual {v11, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_c

    goto :goto_8

    :cond_c
    move/from16 p4, v2

    goto :goto_b

    :cond_d
    :goto_8
    iget-object v11, v0, Lya4;->b0:Lrm1;

    .line 32
    invoke-virtual {v11}, Lrm1;->a()Lvl1;

    move-result-object v11

    iget-object v14, v1, Ldc4;->j:Ljava/util/List;

    move/from16 v15, v16

    .line 33
    :goto_9
    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v10

    if-ge v15, v10, :cond_f

    .line 34
    invoke-interface {v14, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lwn1;

    move/from16 v12, v16

    .line 35
    :goto_a
    iget-object v13, v10, Lwn1;->a:[Len1;

    move/from16 p4, v2

    .line 36
    array-length v2, v13

    if-ge v12, v2, :cond_e

    .line 37
    aget-object v2, v13, v12

    .line 38
    invoke-interface {v2, v11}, Len1;->a(Lvl1;)V

    add-int/lit8 v12, v12, 0x1

    move/from16 v2, p4

    goto :goto_a

    :cond_e
    add-int/lit8 v15, v15, 0x1

    move/from16 v2, p4

    const-wide/16 v12, 0x0

    goto :goto_9

    :cond_f
    move/from16 p4, v2

    .line 39
    new-instance v2, Lrm1;

    .line 40
    invoke-direct {v2, v11}, Lrm1;-><init>(Lvl1;)V

    .line 41
    iput-object v2, v0, Lya4;->b0:Lrm1;

    .line 42
    :goto_b
    invoke-virtual {v0}, Lya4;->K1()Loz1;

    move-result-object v2

    .line 43
    invoke-virtual {v2}, Loz1;->g()Z

    move-result v10

    if-eqz v10, :cond_10

    iget-object v2, v0, Lya4;->b0:Lrm1;

    goto/16 :goto_d

    .line 44
    :cond_10
    invoke-virtual {v0}, Lya4;->O1()I

    move-result v10

    iget-object v11, v0, Lf74;->g:Ljava/lang/Object;

    check-cast v11, Lez1;

    const-wide/16 v12, 0x0

    .line 45
    invoke-virtual {v2, v10, v11, v12, v13}, Loz1;->b(ILez1;J)Lez1;

    move-result-object v2

    .line 46
    iget-object v2, v2, Lez1;->b:Lfk1;

    iget-object v10, v0, Lya4;->b0:Lrm1;

    .line 47
    invoke-virtual {v10}, Lrm1;->a()Lvl1;

    move-result-object v10

    iget-object v2, v2, Lfk1;->d:Lrm1;

    if-nez v2, :cond_11

    goto/16 :goto_c

    .line 48
    :cond_11
    iget-object v11, v2, Lrm1;->a:Ljava/lang/CharSequence;

    if-eqz v11, :cond_12

    iput-object v11, v10, Lvl1;->a:Ljava/lang/CharSequence;

    :cond_12
    iget-object v11, v2, Lrm1;->b:Ljava/lang/CharSequence;

    if-eqz v11, :cond_13

    iput-object v11, v10, Lvl1;->b:Ljava/lang/CharSequence;

    :cond_13
    iget-object v11, v2, Lrm1;->c:Ljava/lang/CharSequence;

    if-eqz v11, :cond_14

    iput-object v11, v10, Lvl1;->c:Ljava/lang/CharSequence;

    :cond_14
    iget-object v11, v2, Lrm1;->d:Ljava/lang/CharSequence;

    if-eqz v11, :cond_15

    iput-object v11, v10, Lvl1;->d:Ljava/lang/CharSequence;

    :cond_15
    iget-object v11, v2, Lrm1;->e:Ljava/lang/CharSequence;

    if-eqz v11, :cond_16

    iput-object v11, v10, Lvl1;->e:Ljava/lang/CharSequence;

    :cond_16
    iget-object v11, v2, Lrm1;->f:[B

    if-eqz v11, :cond_17

    iget-object v12, v2, Lrm1;->g:Ljava/lang/Integer;

    invoke-virtual {v11}, [B->clone()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, [B

    iput-object v11, v10, Lvl1;->f:[B

    iput-object v12, v10, Lvl1;->g:Ljava/lang/Integer;

    :cond_17
    iget-object v11, v2, Lrm1;->h:Ljava/lang/Integer;

    if-eqz v11, :cond_18

    iput-object v11, v10, Lvl1;->h:Ljava/lang/Integer;

    :cond_18
    iget-object v11, v2, Lrm1;->i:Ljava/lang/Integer;

    if-eqz v11, :cond_19

    iput-object v11, v10, Lvl1;->i:Ljava/lang/Integer;

    :cond_19
    iget-object v11, v2, Lrm1;->j:Ljava/lang/Integer;

    if-eqz v11, :cond_1a

    iput-object v11, v10, Lvl1;->j:Ljava/lang/Integer;

    :cond_1a
    iget-object v11, v2, Lrm1;->k:Ljava/lang/Boolean;

    if-eqz v11, :cond_1b

    iput-object v11, v10, Lvl1;->k:Ljava/lang/Boolean;

    :cond_1b
    iget-object v11, v2, Lrm1;->l:Ljava/lang/Integer;

    if-eqz v11, :cond_1c

    iput-object v11, v10, Lvl1;->l:Ljava/lang/Integer;

    :cond_1c
    iget-object v11, v2, Lrm1;->m:Ljava/lang/Integer;

    if-eqz v11, :cond_1d

    iput-object v11, v10, Lvl1;->l:Ljava/lang/Integer;

    :cond_1d
    iget-object v11, v2, Lrm1;->n:Ljava/lang/Integer;

    if-eqz v11, :cond_1e

    iput-object v11, v10, Lvl1;->m:Ljava/lang/Integer;

    :cond_1e
    iget-object v11, v2, Lrm1;->o:Ljava/lang/Integer;

    if-eqz v11, :cond_1f

    iput-object v11, v10, Lvl1;->n:Ljava/lang/Integer;

    :cond_1f
    iget-object v11, v2, Lrm1;->p:Ljava/lang/Integer;

    if-eqz v11, :cond_20

    iput-object v11, v10, Lvl1;->o:Ljava/lang/Integer;

    :cond_20
    iget-object v11, v2, Lrm1;->q:Ljava/lang/Integer;

    if-eqz v11, :cond_21

    iput-object v11, v10, Lvl1;->p:Ljava/lang/Integer;

    :cond_21
    iget-object v11, v2, Lrm1;->r:Ljava/lang/Integer;

    if-eqz v11, :cond_22

    iput-object v11, v10, Lvl1;->q:Ljava/lang/Integer;

    :cond_22
    iget-object v11, v2, Lrm1;->s:Ljava/lang/CharSequence;

    if-eqz v11, :cond_23

    iput-object v11, v10, Lvl1;->r:Ljava/lang/CharSequence;

    :cond_23
    iget-object v11, v2, Lrm1;->t:Ljava/lang/CharSequence;

    if-eqz v11, :cond_24

    iput-object v11, v10, Lvl1;->s:Ljava/lang/CharSequence;

    :cond_24
    iget-object v11, v2, Lrm1;->u:Ljava/lang/CharSequence;

    if-eqz v11, :cond_25

    iput-object v11, v10, Lvl1;->t:Ljava/lang/CharSequence;

    :cond_25
    iget-object v11, v2, Lrm1;->v:Ljava/lang/Integer;

    if-eqz v11, :cond_26

    iput-object v11, v10, Lvl1;->u:Ljava/lang/Integer;

    :cond_26
    iget-object v11, v2, Lrm1;->w:Ljava/lang/Integer;

    if-eqz v11, :cond_27

    iput-object v11, v10, Lvl1;->v:Ljava/lang/Integer;

    :cond_27
    iget-object v11, v2, Lrm1;->x:Ljava/lang/CharSequence;

    if-eqz v11, :cond_28

    iput-object v11, v10, Lvl1;->w:Ljava/lang/CharSequence;

    :cond_28
    iget-object v11, v2, Lrm1;->y:Ljava/lang/CharSequence;

    if-eqz v11, :cond_29

    iput-object v11, v10, Lvl1;->x:Ljava/lang/CharSequence;

    :cond_29
    iget-object v11, v2, Lrm1;->z:Ljava/lang/Integer;

    if-eqz v11, :cond_2a

    iput-object v11, v10, Lvl1;->y:Ljava/lang/Integer;

    :cond_2a
    iget-object v2, v2, Lrm1;->A:Lxm3;

    .line 49
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v11

    if-nez v11, :cond_2b

    .line 50
    invoke-static {v2}, Lxm3;->m(Ljava/util/Collection;)Lxm3;

    move-result-object v2

    iput-object v2, v10, Lvl1;->z:Lxm3;

    .line 51
    :cond_2b
    :goto_c
    new-instance v2, Lrm1;

    .line 52
    invoke-direct {v2, v10}, Lrm1;-><init>(Lvl1;)V

    .line 53
    :goto_d
    iget-object v10, v0, Lya4;->Q:Lrm1;

    .line 54
    invoke-virtual {v2, v10}, Lrm1;->equals(Ljava/lang/Object;)Z

    move-result v10

    iput-object v2, v0, Lya4;->Q:Lrm1;

    .line 55
    iget-boolean v2, v5, Ldc4;->l:Z

    iget-boolean v11, v1, Ldc4;->l:Z

    if-eq v2, v11, :cond_2c

    const/4 v2, 0x1

    goto :goto_e

    :cond_2c
    move/from16 v2, v16

    .line 56
    :goto_e
    iget v11, v5, Ldc4;->e:I

    iget v12, v1, Ldc4;->e:I

    if-eq v11, v12, :cond_2d

    const/4 v11, 0x1

    goto :goto_f

    :cond_2d
    move/from16 v11, v16

    :goto_f
    if-nez v11, :cond_2e

    if-eqz v2, :cond_34

    .line 57
    :cond_2e
    iget-object v12, v0, Lya4;->F:Lkj1;

    iget-object v13, v0, Lya4;->E:Lkj1;

    invoke-virtual {v0}, Lya4;->C1()I

    move-result v14

    const/4 v15, 0x2

    if-eq v14, v15, :cond_31

    const/4 v15, 0x3

    if-eq v14, v15, :cond_31

    .line 58
    iget-boolean v14, v13, Lkj1;->g:Z

    if-nez v14, :cond_2f

    move/from16 v14, v16

    goto :goto_10

    :cond_2f
    move/from16 v14, v16

    iput-boolean v14, v13, Lkj1;->g:Z

    .line 59
    :goto_10
    iget-boolean v13, v12, Lkj1;->g:Z

    if-nez v13, :cond_30

    goto :goto_12

    :cond_30
    iput-boolean v14, v12, Lkj1;->g:Z

    goto :goto_12

    .line 60
    :cond_31
    invoke-virtual {v0}, Lya4;->j2()V

    iget-object v14, v0, Lya4;->c0:Ldc4;

    .line 61
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    invoke-virtual {v0}, Lya4;->H1()Z

    move-result v14

    .line 63
    iget-boolean v15, v13, Lkj1;->g:Z

    if-ne v15, v14, :cond_32

    goto :goto_11

    :cond_32
    iput-boolean v14, v13, Lkj1;->g:Z

    .line 64
    :goto_11
    invoke-virtual {v0}, Lya4;->H1()Z

    move-result v13

    .line 65
    iget-boolean v14, v12, Lkj1;->g:Z

    if-ne v14, v13, :cond_33

    goto :goto_12

    :cond_33
    iput-boolean v13, v12, Lkj1;->g:Z

    .line 66
    :cond_34
    :goto_12
    iget-boolean v12, v5, Ldc4;->g:Z

    iget-boolean v13, v1, Ldc4;->g:Z

    if-eq v12, v13, :cond_35

    const/4 v12, 0x1

    goto :goto_13

    :cond_35
    const/4 v12, 0x0

    :goto_13
    if-nez v8, :cond_36

    iget-object v8, v0, Lya4;->t:Lmu2;

    new-instance v13, Lpa4;

    move/from16 v14, p2

    invoke-direct {v13, v1, v14}, Lpa4;-><init>(Ldc4;I)V

    const/4 v14, 0x0

    .line 67
    invoke-virtual {v8, v14, v13}, Lmu2;->c(ILks2;)V

    :cond_36
    if-eqz p4, :cond_3e

    .line 68
    new-instance v13, Lsw1;

    invoke-direct {v13}, Lsw1;-><init>()V

    .line 69
    invoke-virtual {v6}, Loz1;->g()Z

    move-result v14

    if-nez v14, :cond_37

    .line 70
    iget-object v14, v5, Ldc4;->b:Lkh4;

    iget-object v14, v14, Lkh4;->a:Ljava/lang/Object;

    .line 71
    invoke-virtual {v6, v14, v13}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    iget v15, v13, Lsw1;->c:I

    .line 72
    invoke-virtual {v6, v14}, Loz1;->e(Ljava/lang/Object;)I

    move-result v17

    iget-object v8, v0, Lf74;->g:Ljava/lang/Object;

    check-cast v8, Lez1;

    move/from16 p4, v10

    move/from16 v18, v11

    const-wide/16 v10, 0x0

    .line 73
    invoke-virtual {v6, v15, v8, v10, v11}, Loz1;->b(ILez1;J)Lez1;

    move-result-object v6

    .line 74
    iget-object v6, v6, Lez1;->a:Ljava/lang/Object;

    iget-object v8, v8, Lez1;->b:Lfk1;

    move-object/from16 v20, v6

    move-object/from16 v22, v8

    move-object/from16 v23, v14

    move/from16 v21, v15

    move/from16 v24, v17

    goto :goto_14

    :cond_37
    move/from16 p4, v10

    move/from16 v18, v11

    move/from16 v21, p7

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, -0x1

    :goto_14
    if-nez v3, :cond_3a

    .line 75
    iget-object v6, v5, Ldc4;->b:Lkh4;

    invoke-virtual {v6}, Lkh4;->b()Z

    move-result v8

    if-eqz v8, :cond_38

    .line 76
    iget v8, v6, Lkh4;->b:I

    iget v6, v6, Lkh4;->c:I

    .line 77
    invoke-virtual {v13, v8, v6}, Lsw1;->b(II)J

    move-result-wide v10

    .line 78
    invoke-static {v5}, Lya4;->d2(Ldc4;)J

    move-result-wide v13

    goto :goto_16

    .line 79
    :cond_38
    iget v6, v6, Lkh4;->e:I

    const/4 v8, -0x1

    if-eq v6, v8, :cond_39

    iget-object v6, v0, Lya4;->c0:Ldc4;

    .line 80
    invoke-static {v6}, Lya4;->d2(Ldc4;)J

    move-result-wide v10

    :goto_15
    move-wide v13, v10

    goto :goto_16

    :cond_39
    iget-wide v10, v13, Lsw1;->d:J

    goto :goto_15

    .line 81
    :cond_3a
    iget-object v6, v5, Ldc4;->b:Lkh4;

    invoke-virtual {v6}, Lkh4;->b()Z

    move-result v6

    if-eqz v6, :cond_3b

    .line 82
    iget-wide v10, v5, Ldc4;->r:J

    .line 83
    invoke-static {v5}, Lya4;->d2(Ldc4;)J

    move-result-wide v13

    goto :goto_16

    .line 84
    :cond_3b
    iget-wide v10, v5, Ldc4;->r:J

    goto :goto_15

    .line 85
    :goto_16
    new-instance v19, Lxu1;

    .line 86
    sget-object v6, Lv23;->a:Ljava/lang/String;

    .line 87
    iget-object v6, v5, Ldc4;->b:Lkh4;

    iget v8, v6, Lkh4;->b:I

    iget v6, v6, Lkh4;->c:I

    invoke-static {v10, v11}, Lv23;->q(J)J

    move-result-wide v25

    invoke-static {v13, v14}, Lv23;->q(J)J

    move-result-wide v27

    move/from16 v30, v6

    move/from16 v29, v8

    invoke-direct/range {v19 .. v30}, Lxu1;-><init>(Ljava/lang/Object;ILfk1;Ljava/lang/Object;IJJII)V

    move-object/from16 v6, v19

    .line 88
    invoke-virtual {v0}, Lya4;->O1()I

    move-result v8

    iget-object v10, v0, Lya4;->c0:Ldc4;

    .line 89
    iget-object v10, v10, Ldc4;->a:Loz1;

    invoke-virtual {v10}, Loz1;->g()Z

    move-result v10

    if-nez v10, :cond_3c

    iget-object v10, v0, Lya4;->c0:Ldc4;

    .line 90
    iget-object v11, v10, Ldc4;->b:Lkh4;

    iget-object v11, v11, Lkh4;->a:Ljava/lang/Object;

    .line 91
    iget-object v10, v10, Ldc4;->a:Loz1;

    iget-object v13, v0, Lya4;->v:Lsw1;

    invoke-virtual {v10, v11, v13}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    iget-object v10, v0, Lya4;->c0:Ldc4;

    .line 92
    iget-object v10, v10, Ldc4;->a:Loz1;

    invoke-virtual {v10, v11}, Loz1;->e(Ljava/lang/Object;)I

    move-result v10

    iget-object v13, v0, Lya4;->c0:Ldc4;

    .line 93
    iget-object v13, v13, Ldc4;->a:Loz1;

    iget-object v14, v0, Lf74;->g:Ljava/lang/Object;

    check-cast v14, Lez1;

    move/from16 p3, v10

    move-object v15, v11

    const-wide/16 v10, 0x0

    .line 94
    invoke-virtual {v13, v8, v14, v10, v11}, Loz1;->b(ILez1;J)Lez1;

    move-result-object v13

    .line 95
    iget-object v10, v13, Lez1;->a:Ljava/lang/Object;

    iget-object v11, v14, Lez1;->b:Lfk1;

    move/from16 v24, p3

    move-object/from16 v20, v10

    move-object/from16 v22, v11

    move-object/from16 v23, v15

    goto :goto_17

    :cond_3c
    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, -0x1

    :goto_17
    invoke-static/range {p5 .. p6}, Lv23;->q(J)J

    move-result-wide v25

    new-instance v19, Lxu1;

    iget-object v10, v0, Lya4;->c0:Ldc4;

    .line 96
    iget-object v10, v10, Ldc4;->b:Lkh4;

    invoke-virtual {v10}, Lkh4;->b()Z

    move-result v10

    if-eqz v10, :cond_3d

    iget-object v10, v0, Lya4;->c0:Ldc4;

    .line 97
    invoke-static {v10}, Lya4;->d2(Ldc4;)J

    move-result-wide v10

    invoke-static {v10, v11}, Lv23;->q(J)J

    move-result-wide v10

    move-wide/from16 v27, v10

    goto :goto_18

    :cond_3d
    move-wide/from16 v27, v25

    :goto_18
    iget-object v10, v0, Lya4;->c0:Ldc4;

    .line 98
    iget-object v10, v10, Ldc4;->b:Lkh4;

    iget v11, v10, Lkh4;->b:I

    iget v10, v10, Lkh4;->c:I

    move/from16 v21, v8

    move/from16 v30, v10

    move/from16 v29, v11

    invoke-direct/range {v19 .. v30}, Lxu1;-><init>(Ljava/lang/Object;ILfk1;Ljava/lang/Object;IJJII)V

    move-object/from16 v8, v19

    iget-object v10, v0, Lya4;->t:Lmu2;

    new-instance v11, Lso1;

    invoke-direct {v11, v3, v6, v8}, Lso1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/16 v3, 0xb

    .line 99
    invoke-virtual {v10, v3, v11}, Lmu2;->c(ILks2;)V

    goto :goto_19

    :cond_3e
    move/from16 p4, v10

    move/from16 v18, v11

    :goto_19
    if-eqz v4, :cond_3f

    iget-object v3, v0, Lya4;->t:Lmu2;

    new-instance v4, Ly24;

    invoke-direct {v4, v7, v9}, Ly24;-><init>(Lfk1;I)V

    const/4 v9, 0x1

    .line 100
    invoke-virtual {v3, v9, v4}, Lmu2;->c(ILks2;)V

    goto :goto_1a

    :cond_3f
    const/4 v9, 0x1

    .line 101
    :goto_1a
    iget-object v3, v5, Ldc4;->f:Lb84;

    iget-object v4, v1, Ldc4;->f:Lb84;

    const/16 v6, 0xa

    if-eq v3, v4, :cond_40

    iget-object v3, v0, Lya4;->t:Lmu2;

    new-instance v7, Lqa4;

    invoke-direct {v7, v1, v9}, Lqa4;-><init>(Ldc4;I)V

    .line 102
    invoke-virtual {v3, v6, v7}, Lmu2;->c(ILks2;)V

    if-eqz v4, :cond_40

    new-instance v4, Lil3;

    const/4 v15, 0x2

    invoke-direct {v4, v15, v1}, Lil3;-><init>(ILjava/lang/Object;)V

    .line 103
    invoke-virtual {v3, v6, v4}, Lmu2;->c(ILks2;)V

    .line 104
    :cond_40
    iget-object v3, v5, Ldc4;->i:Lpj4;

    iget-object v4, v1, Ldc4;->i:Lpj4;

    if-eq v3, v4, :cond_41

    iget-object v3, v0, Lya4;->p:Llj4;

    .line 105
    iget-object v4, v4, Lpj4;->j:Ljava/lang/Object;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    check-cast v4, Loj4;

    .line 107
    iget-object v3, v0, Lya4;->t:Lmu2;

    new-instance v4, Lpa4;

    invoke-direct {v4, v1}, Lpa4;-><init>(Ldc4;)V

    const/4 v15, 0x2

    .line 108
    invoke-virtual {v3, v15, v4}, Lmu2;->c(ILks2;)V

    :cond_41
    if-nez p4, :cond_42

    iget-object v3, v0, Lya4;->Q:Lrm1;

    iget-object v4, v0, Lya4;->t:Lmu2;

    new-instance v7, Ly24;

    const/16 v8, 0xe

    invoke-direct {v7, v8, v3}, Ly24;-><init>(ILjava/lang/Object;)V

    .line 109
    invoke-virtual {v4, v8, v7}, Lmu2;->c(ILks2;)V

    :cond_42
    if-eqz v12, :cond_43

    iget-object v3, v0, Lya4;->t:Lmu2;

    new-instance v4, Lqa4;

    const/4 v14, 0x0

    invoke-direct {v4, v1, v14}, Lqa4;-><init>(Ldc4;I)V

    const/4 v15, 0x3

    .line 110
    invoke-virtual {v3, v15, v4}, Lmu2;->c(ILks2;)V

    :cond_43
    if-nez v18, :cond_44

    if-eqz v2, :cond_45

    :cond_44
    iget-object v3, v0, Lya4;->t:Lmu2;

    new-instance v4, Lx34;

    invoke-direct {v4, v1}, Lx34;-><init>(Ljava/lang/Object;)V

    const/4 v8, -0x1

    .line 111
    invoke-virtual {v3, v8, v4}, Lmu2;->c(ILks2;)V

    :cond_45
    const/4 v3, 0x4

    if-eqz v18, :cond_46

    iget-object v4, v0, Lya4;->t:Lmu2;

    new-instance v7, Lyf3;

    invoke-direct {v7, v1}, Lyf3;-><init>(Ljava/lang/Object;)V

    .line 112
    invoke-virtual {v4, v3, v7}, Lmu2;->c(ILks2;)V

    :cond_46
    const/4 v4, 0x5

    if-nez v2, :cond_47

    .line 113
    iget v2, v5, Ldc4;->m:I

    iget v7, v1, Ldc4;->m:I

    if-eq v2, v7, :cond_48

    :cond_47
    iget-object v2, v0, Lya4;->t:Lmu2;

    new-instance v7, Lit3;

    const/4 v15, 0x3

    invoke-direct {v7, v15, v1}, Lit3;-><init>(ILjava/lang/Object;)V

    .line 114
    invoke-virtual {v2, v4, v7}, Lmu2;->c(ILks2;)V

    .line 115
    :cond_48
    iget v2, v5, Ldc4;->n:I

    iget v7, v1, Ldc4;->n:I

    const/4 v8, 0x7

    const/4 v10, 0x6

    if-eq v2, v7, :cond_49

    iget-object v2, v0, Lya4;->t:Lmu2;

    new-instance v7, Lrc3;

    invoke-direct {v7, v8, v1}, Lrc3;-><init>(ILjava/lang/Object;)V

    .line 116
    invoke-virtual {v2, v10, v7}, Lmu2;->c(ILks2;)V

    .line 117
    :cond_49
    invoke-virtual {v5}, Ldc4;->i()Z

    move-result v2

    invoke-virtual {v1}, Ldc4;->i()Z

    move-result v7

    if-eq v2, v7, :cond_4a

    iget-object v2, v0, Lya4;->t:Lmu2;

    new-instance v7, Lbi3;

    const/4 v15, 0x3

    invoke-direct {v7, v15, v1}, Lbi3;-><init>(ILjava/lang/Object;)V

    .line 118
    invoke-virtual {v2, v8, v7}, Lmu2;->c(ILks2;)V

    .line 119
    :cond_4a
    iget-object v2, v5, Ldc4;->o:Lsr1;

    iget-object v5, v1, Ldc4;->o:Lsr1;

    invoke-virtual {v2, v5}, Lsr1;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/16 v5, 0xc

    if-nez v2, :cond_4b

    iget-object v2, v0, Lya4;->t:Lmu2;

    new-instance v7, Lci3;

    invoke-direct {v7, v4, v1}, Lci3;-><init>(ILjava/lang/Object;)V

    .line 120
    invoke-virtual {v2, v5, v7}, Lmu2;->c(ILks2;)V

    :cond_4b
    iget-object v1, v0, Lya4;->P:Lts1;

    iget-object v2, v0, Lya4;->m:Lmc4;

    iget-object v7, v0, Lya4;->j:Lts1;

    .line 121
    sget-object v11, Lv23;->a:Ljava/lang/String;

    .line 122
    invoke-virtual {v2}, Lmc4;->S1()Z

    move-result v11

    .line 123
    invoke-virtual {v2}, Lf74;->K1()Loz1;

    move-result-object v12

    .line 124
    invoke-virtual {v12}, Loz1;->g()Z

    move-result v13

    if-nez v13, :cond_4c

    invoke-virtual {v2}, Lf74;->O1()I

    move-result v13

    iget-object v14, v2, Lf74;->g:Ljava/lang/Object;

    check-cast v14, Lez1;

    const-wide/16 v5, 0x0

    .line 125
    invoke-virtual {v12, v13, v14, v5, v6}, Loz1;->b(ILez1;J)Lez1;

    move-result-object v12

    .line 126
    iget-boolean v5, v12, Lez1;->f:Z

    if-eqz v5, :cond_4c

    move v5, v9

    goto :goto_1b

    :cond_4c
    const/4 v5, 0x0

    .line 127
    :goto_1b
    invoke-virtual {v2}, Lf74;->K1()Loz1;

    move-result-object v6

    .line 128
    invoke-virtual {v6}, Loz1;->g()Z

    move-result v12

    if-eqz v12, :cond_4d

    const/4 v6, 0x0

    const/4 v12, -0x1

    goto :goto_1c

    .line 129
    :cond_4d
    invoke-virtual {v2}, Lf74;->O1()I

    move-result v12

    .line 130
    invoke-virtual {v2}, Lf74;->i()V

    .line 131
    invoke-virtual {v2}, Lf74;->I1()V

    .line 132
    invoke-virtual {v6, v12}, Loz1;->i(I)I

    move-result v6

    const/4 v12, -0x1

    if-eq v6, v12, :cond_4e

    move v6, v9

    goto :goto_1c

    :cond_4e
    const/4 v6, 0x0

    .line 133
    :goto_1c
    invoke-virtual {v2}, Lf74;->K1()Loz1;

    move-result-object v13

    .line 134
    invoke-virtual {v13}, Loz1;->g()Z

    move-result v14

    if-eqz v14, :cond_4f

    const/4 v15, 0x0

    const/16 v16, 0x0

    goto :goto_1d

    .line 135
    :cond_4f
    invoke-virtual {v2}, Lf74;->O1()I

    move-result v14

    .line 136
    invoke-virtual {v2}, Lf74;->i()V

    .line 137
    invoke-virtual {v2}, Lf74;->I1()V

    const/4 v15, 0x0

    .line 138
    invoke-virtual {v13, v14, v15, v15}, Loz1;->h(IIZ)I

    move-result v13

    if-eq v13, v12, :cond_50

    move/from16 v16, v9

    goto :goto_1d

    :cond_50
    move/from16 v16, v15

    .line 139
    :goto_1d
    invoke-virtual {v2}, Lf74;->K1()Loz1;

    move-result-object v12

    .line 140
    invoke-virtual {v12}, Loz1;->g()Z

    move-result v13

    if-nez v13, :cond_51

    invoke-virtual {v2}, Lf74;->O1()I

    move-result v13

    iget-object v14, v2, Lf74;->g:Ljava/lang/Object;

    check-cast v14, Lez1;

    const-wide/16 v8, 0x0

    .line 141
    invoke-virtual {v12, v13, v14, v8, v9}, Loz1;->b(ILez1;J)Lez1;

    move-result-object v12

    .line 142
    invoke-virtual {v12}, Lez1;->b()Z

    move-result v8

    if-eqz v8, :cond_51

    const/4 v9, 0x1

    goto :goto_1e

    :cond_51
    move v9, v15

    .line 143
    :goto_1e
    invoke-virtual {v2}, Lf74;->K1()Loz1;

    move-result-object v8

    .line 144
    invoke-virtual {v8}, Loz1;->g()Z

    move-result v12

    if-nez v12, :cond_53

    invoke-virtual {v2}, Lf74;->O1()I

    move-result v12

    iget-object v13, v2, Lf74;->g:Ljava/lang/Object;

    check-cast v13, Lez1;

    move/from16 p1, v5

    const-wide/16 v4, 0x0

    .line 145
    invoke-virtual {v8, v12, v13, v4, v5}, Loz1;->b(ILez1;J)Lez1;

    move-result-object v4

    .line 146
    iget-boolean v4, v4, Lez1;->g:Z

    if-eqz v4, :cond_52

    const/4 v4, 0x1

    goto :goto_20

    :cond_52
    :goto_1f
    move v4, v15

    goto :goto_20

    :cond_53
    move/from16 p1, v5

    goto :goto_1f

    .line 147
    :goto_20
    invoke-virtual {v2}, Lmc4;->K1()Loz1;

    move-result-object v2

    invoke-virtual {v2}, Loz1;->g()Z

    move-result v2

    .line 148
    new-instance v5, Lnb;

    invoke-direct {v5, v10}, Lnb;-><init>(I)V

    .line 149
    iget-object v7, v7, Lts1;->a:Lof4;

    move v14, v15

    .line 150
    :goto_21
    iget-object v8, v7, Lof4;->a:Landroid/util/SparseBooleanArray;

    .line 151
    invoke-virtual {v8}, Landroid/util/SparseBooleanArray;->size()I

    move-result v8

    if-ge v14, v8, :cond_54

    .line 152
    invoke-virtual {v7, v14}, Lof4;->a(I)I

    move-result v8

    invoke-virtual {v5, v8}, Lnb;->e(I)V

    add-int/lit8 v14, v14, 0x1

    goto :goto_21

    :cond_54
    if-nez v11, :cond_55

    .line 153
    invoke-virtual {v5, v3}, Lnb;->e(I)V

    :cond_55
    if-eqz p1, :cond_56

    if-nez v11, :cond_56

    const/4 v3, 0x1

    goto :goto_22

    :cond_56
    move v3, v15

    :goto_22
    if-eqz v3, :cond_57

    const/4 v3, 0x5

    .line 154
    invoke-virtual {v5, v3}, Lnb;->e(I)V

    :cond_57
    if-eqz v6, :cond_58

    if-nez v11, :cond_58

    const/4 v3, 0x1

    goto :goto_23

    :cond_58
    move v3, v15

    :goto_23
    if-eqz v3, :cond_59

    .line 155
    invoke-virtual {v5, v10}, Lnb;->e(I)V

    :cond_59
    if-nez v2, :cond_5a

    if-nez v6, :cond_5b

    if-eqz v9, :cond_5b

    if-eqz p1, :cond_5a

    goto :goto_24

    :cond_5a
    move v3, v15

    goto :goto_25

    :cond_5b
    :goto_24
    if-nez v11, :cond_5a

    const/4 v3, 0x1

    :goto_25
    if-eqz v3, :cond_5c

    const/4 v3, 0x7

    .line 156
    invoke-virtual {v5, v3}, Lnb;->e(I)V

    :cond_5c
    if-eqz v16, :cond_5d

    if-nez v11, :cond_5d

    const/4 v3, 0x1

    goto :goto_26

    :cond_5d
    move v3, v15

    :goto_26
    if-eqz v3, :cond_5e

    const/16 v3, 0x8

    .line 157
    invoke-virtual {v5, v3}, Lnb;->e(I)V

    :cond_5e
    if-nez v2, :cond_5f

    if-nez v16, :cond_60

    if-eqz v9, :cond_5f

    if-eqz v4, :cond_5f

    goto :goto_27

    :cond_5f
    move v9, v15

    goto :goto_28

    :cond_60
    :goto_27
    if-nez v11, :cond_5f

    const/4 v9, 0x1

    :goto_28
    if-eqz v9, :cond_61

    const/16 v2, 0x9

    .line 158
    invoke-virtual {v5, v2}, Lnb;->e(I)V

    :cond_61
    if-nez v11, :cond_62

    const/16 v2, 0xa

    .line 159
    invoke-virtual {v5, v2}, Lnb;->e(I)V

    :cond_62
    if-eqz p1, :cond_63

    if-nez v11, :cond_63

    const/4 v9, 0x1

    goto :goto_29

    :cond_63
    move v9, v15

    :goto_29
    if-eqz v9, :cond_64

    const/16 v3, 0xb

    .line 160
    invoke-virtual {v5, v3}, Lnb;->e(I)V

    :cond_64
    if-eqz p1, :cond_65

    if-nez v11, :cond_65

    const/4 v14, 0x1

    goto :goto_2a

    :cond_65
    move v14, v15

    :goto_2a
    if-eqz v14, :cond_66

    const/16 v2, 0xc

    .line 161
    invoke-virtual {v5, v2}, Lnb;->e(I)V

    .line 162
    :cond_66
    new-instance v2, Lts1;

    invoke-virtual {v5}, Lnb;->g()Lof4;

    move-result-object v3

    invoke-direct {v2, v3}, Lts1;-><init>(Lof4;)V

    .line 163
    iput-object v2, v0, Lya4;->P:Lts1;

    .line 164
    invoke-virtual {v2, v1}, Lts1;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_67

    iget-object v1, v0, Lya4;->t:Lmu2;

    new-instance v2, Lt24;

    const/16 v3, 0xf

    invoke-direct {v2, v0, v3}, Lt24;-><init>(Lya4;I)V

    const/16 v3, 0xd

    .line 165
    invoke-virtual {v1, v3, v2}, Lmu2;->c(ILks2;)V

    :cond_67
    iget-object v1, v0, Lya4;->t:Lmu2;

    .line 166
    invoke-virtual {v1}, Lmu2;->d()V

    return-void
.end method

.method public final d()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lya4;->j2()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lya4;->S1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lya4;->c0:Ldc4;

    .line 11
    .line 12
    iget-object v0, v0, Ldc4;->b:Lkh4;

    .line 13
    .line 14
    iget v0, v0, Lkh4;->b:I

    .line 15
    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, -0x1

    .line 18
    return v0
.end method

.method public final e2(Ldc4;Loz1;Landroid/util/Pair;)Ldc4;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    invoke-virtual {v1}, Loz1;->g()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    const/4 v4, 0x0

    .line 12
    if-nez v3, :cond_0

    .line 13
    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    :cond_0
    const/4 v3, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_1
    move v3, v4

    .line 19
    :goto_0
    invoke-static {v3}, Lzt0;->D(Z)V

    .line 20
    .line 21
    .line 22
    move-object/from16 v3, p1

    .line 23
    .line 24
    iget-object v6, v3, Ldc4;->a:Loz1;

    .line 25
    .line 26
    invoke-virtual/range {p0 .. p1}, Lya4;->a2(Ldc4;)J

    .line 27
    .line 28
    .line 29
    move-result-wide v7

    .line 30
    invoke-virtual/range {p1 .. p2}, Ldc4;->c(Loz1;)Ldc4;

    .line 31
    .line 32
    .line 33
    move-result-object v9

    .line 34
    invoke-virtual {v1}, Loz1;->g()Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_2

    .line 39
    .line 40
    sget-object v10, Ldc4;->t:Lkh4;

    .line 41
    .line 42
    iget-wide v1, v0, Lya4;->e0:J

    .line 43
    .line 44
    invoke-static {v1, v2}, Lv23;->r(J)J

    .line 45
    .line 46
    .line 47
    move-result-wide v11

    .line 48
    iget-object v1, v0, Lya4;->i:Lpj4;

    .line 49
    .line 50
    sget-object v19, Lri4;->d:Lri4;

    .line 51
    .line 52
    sget-object v21, Lsn3;->j:Lsn3;

    .line 53
    .line 54
    const-wide/16 v17, 0x0

    .line 55
    .line 56
    move-wide v13, v11

    .line 57
    move-wide v15, v11

    .line 58
    move-object/from16 v20, v1

    .line 59
    .line 60
    invoke-virtual/range {v9 .. v21}, Ldc4;->b(Lkh4;JJJJLri4;Lpj4;Ljava/util/List;)Ldc4;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v1, v10}, Ldc4;->g(Lkh4;)Ldc4;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    iget-wide v2, v1, Ldc4;->r:J

    .line 69
    .line 70
    iput-wide v2, v1, Ldc4;->p:J

    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_2
    iget-object v3, v9, Ldc4;->b:Lkh4;

    .line 74
    .line 75
    iget-object v10, v3, Lkh4;->a:Ljava/lang/Object;

    .line 76
    .line 77
    sget-object v11, Lv23;->a:Ljava/lang/String;

    .line 78
    .line 79
    iget-object v11, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 80
    .line 81
    invoke-virtual {v10, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v11

    .line 85
    const-wide/16 v12, -0x1

    .line 86
    .line 87
    if-nez v11, :cond_3

    .line 88
    .line 89
    new-instance v14, Lkh4;

    .line 90
    .line 91
    iget-object v15, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 92
    .line 93
    invoke-direct {v14, v12, v13, v15}, Lkh4;-><init>(JLjava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_3
    move-object v14, v3

    .line 98
    :goto_1
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v2, Ljava/lang/Long;

    .line 101
    .line 102
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 103
    .line 104
    .line 105
    move-result-wide v15

    .line 106
    invoke-static {v7, v8}, Lv23;->r(J)J

    .line 107
    .line 108
    .line 109
    move-result-wide v7

    .line 110
    invoke-virtual {v6}, Loz1;->g()Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-nez v2, :cond_4

    .line 115
    .line 116
    iget-object v2, v0, Lya4;->v:Lsw1;

    .line 117
    .line 118
    invoke-virtual {v6, v10, v2}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 119
    .line 120
    .line 121
    if-eqz v11, :cond_4

    .line 122
    .line 123
    sub-long v17, v7, v15

    .line 124
    .line 125
    const-wide/16 v19, 0x1

    .line 126
    .line 127
    cmp-long v17, v17, v19

    .line 128
    .line 129
    if-nez v17, :cond_4

    .line 130
    .line 131
    invoke-virtual {v6, v10, v2}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    const/4 v10, 0x1

    .line 136
    iget-wide v5, v2, Lsw1;->d:J

    .line 137
    .line 138
    cmp-long v2, v7, v5

    .line 139
    .line 140
    if-nez v2, :cond_5

    .line 141
    .line 142
    add-long/2addr v7, v12

    .line 143
    goto :goto_2

    .line 144
    :cond_4
    const/4 v10, 0x1

    .line 145
    :cond_5
    :goto_2
    if-eqz v11, :cond_6

    .line 146
    .line 147
    cmp-long v2, v15, v7

    .line 148
    .line 149
    if-gez v2, :cond_7

    .line 150
    .line 151
    :cond_6
    move v1, v11

    .line 152
    move-wide v11, v15

    .line 153
    goto/16 :goto_5

    .line 154
    .line 155
    :cond_7
    if-nez v2, :cond_b

    .line 156
    .line 157
    iget-object v2, v9, Ldc4;->k:Lkh4;

    .line 158
    .line 159
    iget-object v2, v2, Lkh4;->a:Ljava/lang/Object;

    .line 160
    .line 161
    invoke-virtual {v1, v2}, Loz1;->e(Ljava/lang/Object;)I

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    const/4 v3, -0x1

    .line 166
    if-eq v2, v3, :cond_9

    .line 167
    .line 168
    iget-object v3, v0, Lya4;->v:Lsw1;

    .line 169
    .line 170
    invoke-virtual {v1, v2, v3, v4}, Loz1;->d(ILsw1;Z)Lsw1;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    iget v2, v2, Lsw1;->c:I

    .line 175
    .line 176
    iget-object v4, v14, Lkh4;->a:Ljava/lang/Object;

    .line 177
    .line 178
    invoke-virtual {v1, v4, v3}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    iget v3, v3, Lsw1;->c:I

    .line 183
    .line 184
    if-eq v2, v3, :cond_8

    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_8
    return-object v9

    .line 188
    :cond_9
    :goto_3
    iget-object v2, v14, Lkh4;->a:Ljava/lang/Object;

    .line 189
    .line 190
    iget-object v3, v0, Lya4;->v:Lsw1;

    .line 191
    .line 192
    invoke-virtual {v1, v2, v3}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v14}, Lkh4;->b()Z

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    if-eqz v1, :cond_a

    .line 200
    .line 201
    iget v1, v14, Lkh4;->b:I

    .line 202
    .line 203
    iget v2, v14, Lkh4;->c:I

    .line 204
    .line 205
    invoke-virtual {v3, v1, v2}, Lsw1;->b(II)J

    .line 206
    .line 207
    .line 208
    move-result-wide v1

    .line 209
    goto :goto_4

    .line 210
    :cond_a
    iget-wide v1, v3, Lsw1;->d:J

    .line 211
    .line 212
    :goto_4
    iget-wide v11, v9, Ldc4;->r:J

    .line 213
    .line 214
    move-object v10, v14

    .line 215
    iget-wide v13, v9, Ldc4;->r:J

    .line 216
    .line 217
    iget-wide v3, v9, Ldc4;->d:J

    .line 218
    .line 219
    iget-wide v5, v9, Ldc4;->r:J

    .line 220
    .line 221
    sub-long v17, v1, v5

    .line 222
    .line 223
    iget-object v5, v9, Ldc4;->h:Lri4;

    .line 224
    .line 225
    iget-object v6, v9, Ldc4;->i:Lpj4;

    .line 226
    .line 227
    iget-object v7, v9, Ldc4;->j:Ljava/util/List;

    .line 228
    .line 229
    move-wide v15, v3

    .line 230
    move-object/from16 v19, v5

    .line 231
    .line 232
    move-object/from16 v20, v6

    .line 233
    .line 234
    move-object/from16 v21, v7

    .line 235
    .line 236
    invoke-virtual/range {v9 .. v21}, Ldc4;->b(Lkh4;JJJJLri4;Lpj4;Ljava/util/List;)Ldc4;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    move-object v14, v10

    .line 241
    invoke-virtual {v3, v14}, Ldc4;->g(Lkh4;)Ldc4;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    iput-wide v1, v3, Ldc4;->p:J

    .line 246
    .line 247
    return-object v3

    .line 248
    :cond_b
    invoke-virtual {v14}, Lkh4;->b()Z

    .line 249
    .line 250
    .line 251
    move-result v1

    .line 252
    xor-int/2addr v1, v10

    .line 253
    invoke-static {v1}, Lzt0;->b0(Z)V

    .line 254
    .line 255
    .line 256
    iget-wide v1, v9, Ldc4;->q:J

    .line 257
    .line 258
    sub-long v4, v15, v7

    .line 259
    .line 260
    sub-long/2addr v1, v4

    .line 261
    const-wide/16 v4, 0x0

    .line 262
    .line 263
    invoke-static {v4, v5, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 264
    .line 265
    .line 266
    move-result-wide v17

    .line 267
    iget-wide v1, v9, Ldc4;->p:J

    .line 268
    .line 269
    iget-object v4, v9, Ldc4;->k:Lkh4;

    .line 270
    .line 271
    invoke-virtual {v4, v3}, Lkh4;->equals(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result v3

    .line 275
    if-eqz v3, :cond_c

    .line 276
    .line 277
    add-long v1, v15, v17

    .line 278
    .line 279
    :cond_c
    iget-object v3, v9, Ldc4;->h:Lri4;

    .line 280
    .line 281
    iget-object v4, v9, Ldc4;->i:Lpj4;

    .line 282
    .line 283
    iget-object v5, v9, Ldc4;->j:Ljava/util/List;

    .line 284
    .line 285
    move-object v10, v14

    .line 286
    move-wide v13, v15

    .line 287
    move-wide v11, v15

    .line 288
    move-object/from16 v19, v3

    .line 289
    .line 290
    move-object/from16 v20, v4

    .line 291
    .line 292
    move-object/from16 v21, v5

    .line 293
    .line 294
    invoke-virtual/range {v9 .. v21}, Ldc4;->b(Lkh4;JJJJLri4;Lpj4;Ljava/util/List;)Ldc4;

    .line 295
    .line 296
    .line 297
    move-result-object v3

    .line 298
    iput-wide v1, v3, Ldc4;->p:J

    .line 299
    .line 300
    return-object v3

    .line 301
    :goto_5
    invoke-virtual {v14}, Lkh4;->b()Z

    .line 302
    .line 303
    .line 304
    move-result v2

    .line 305
    xor-int/2addr v2, v10

    .line 306
    invoke-static {v2}, Lzt0;->b0(Z)V

    .line 307
    .line 308
    .line 309
    if-nez v1, :cond_d

    .line 310
    .line 311
    sget-object v2, Lri4;->d:Lri4;

    .line 312
    .line 313
    :goto_6
    move-object/from16 v19, v2

    .line 314
    .line 315
    goto :goto_7

    .line 316
    :cond_d
    iget-object v2, v9, Ldc4;->h:Lri4;

    .line 317
    .line 318
    goto :goto_6

    .line 319
    :goto_7
    if-nez v1, :cond_e

    .line 320
    .line 321
    iget-object v2, v0, Lya4;->i:Lpj4;

    .line 322
    .line 323
    :goto_8
    move-object/from16 v20, v2

    .line 324
    .line 325
    goto :goto_9

    .line 326
    :cond_e
    iget-object v2, v9, Ldc4;->i:Lpj4;

    .line 327
    .line 328
    goto :goto_8

    .line 329
    :goto_9
    if-nez v1, :cond_f

    .line 330
    .line 331
    sget-object v1, Lxm3;->g:Lvm3;

    .line 332
    .line 333
    sget-object v1, Lsn3;->j:Lsn3;

    .line 334
    .line 335
    :goto_a
    move-object/from16 v21, v1

    .line 336
    .line 337
    goto :goto_b

    .line 338
    :cond_f
    iget-object v1, v9, Ldc4;->j:Ljava/util/List;

    .line 339
    .line 340
    goto :goto_a

    .line 341
    :goto_b
    const-wide/16 v17, 0x0

    .line 342
    .line 343
    move-object v10, v14

    .line 344
    move-wide v13, v11

    .line 345
    move-wide v15, v11

    .line 346
    invoke-virtual/range {v9 .. v21}, Ldc4;->b(Lkh4;JJJJLri4;Lpj4;Ljava/util/List;)Ldc4;

    .line 347
    .line 348
    .line 349
    move-result-object v1

    .line 350
    invoke-virtual {v1, v10}, Ldc4;->g(Lkh4;)Ldc4;

    .line 351
    .line 352
    .line 353
    move-result-object v1

    .line 354
    iput-wide v11, v1, Ldc4;->p:J

    .line 355
    .line 356
    return-object v1
.end method

.method public final g2(Loz1;IJ)Landroid/util/Pair;
    .locals 6

    .line 1
    invoke-virtual {p1}, Loz1;->g()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iput p2, p0, Lya4;->d0:I

    .line 10
    .line 11
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    cmp-long p1, p3, p1

    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    move-wide p3, v1

    .line 21
    :cond_0
    iput-wide p3, p0, Lya4;->e0:J

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    return-object p1

    .line 25
    :cond_1
    const/4 v0, -0x1

    .line 26
    if-eq p2, v0, :cond_3

    .line 27
    .line 28
    invoke-virtual {p1}, Loz1;->a()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-lt p2, v0, :cond_2

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    :goto_0
    move v3, p2

    .line 36
    goto :goto_2

    .line 37
    :cond_3
    :goto_1
    const/4 p2, 0x0

    .line 38
    invoke-virtual {p1, p2}, Loz1;->k(Z)I

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    iget-object p3, p0, Lf74;->g:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p3, Lez1;

    .line 45
    .line 46
    invoke-virtual {p1, p2, p3, v1, v2}, Loz1;->b(ILez1;J)Lez1;

    .line 47
    .line 48
    .line 49
    move-result-object p3

    .line 50
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-static {v1, v2}, Lv23;->q(J)J

    .line 54
    .line 55
    .line 56
    move-result-wide p3

    .line 57
    goto :goto_0

    .line 58
    :goto_2
    iget-object p2, p0, Lf74;->g:Ljava/lang/Object;

    .line 59
    .line 60
    move-object v1, p2

    .line 61
    check-cast v1, Lez1;

    .line 62
    .line 63
    iget-object v2, p0, Lya4;->v:Lsw1;

    .line 64
    .line 65
    invoke-static {p3, p4}, Lv23;->r(J)J

    .line 66
    .line 67
    .line 68
    move-result-wide v4

    .line 69
    move-object v0, p1

    .line 70
    invoke-virtual/range {v0 .. v5}, Loz1;->m(Lez1;Lsw1;IJ)Landroid/util/Pair;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    return-object p1
.end method

.method public final h2(Landroid/view/Surface;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lya4;->R:Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    if-eq v0, p1, :cond_0

    .line 8
    .line 9
    move v1, v2

    .line 10
    :cond_0
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    iget-wide v5, p0, Lya4;->G:J

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    move-wide v5, v3

    .line 21
    :goto_0
    iget-object v0, p0, Lya4;->s:Ljb4;

    .line 22
    .line 23
    iget-boolean v7, v0, Ljb4;->M:Z

    .line 24
    .line 25
    if-nez v7, :cond_3

    .line 26
    .line 27
    iget-object v7, v0, Ljb4;->o:Landroid/os/Looper;

    .line 28
    .line 29
    invoke-virtual {v7}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 30
    .line 31
    .line 32
    move-result-object v7

    .line 33
    invoke-virtual {v7}, Ljava/lang/Thread;->isAlive()Z

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    if-nez v7, :cond_2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    new-instance v7, Lhp2;

    .line 41
    .line 42
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 43
    .line 44
    .line 45
    iget-object v0, v0, Ljb4;->m:Ld13;

    .line 46
    .line 47
    new-instance v8, Landroid/util/Pair;

    .line 48
    .line 49
    invoke-direct {v8, p1, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    const/16 v9, 0x1e

    .line 53
    .line 54
    invoke-virtual {v0, v9, v8}, Ld13;->a(ILjava/lang/Object;)Lv03;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Lv03;->a()V

    .line 59
    .line 60
    .line 61
    cmp-long v0, v5, v3

    .line 62
    .line 63
    if-eqz v0, :cond_3

    .line 64
    .line 65
    invoke-virtual {v7, v5, v6}, Lhp2;->c(J)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    :cond_3
    :goto_1
    if-eqz v1, :cond_4

    .line 70
    .line 71
    iget-object v0, p0, Lya4;->R:Ljava/lang/Object;

    .line 72
    .line 73
    iget-object v1, p0, Lya4;->S:Landroid/view/Surface;

    .line 74
    .line 75
    if-ne v0, v1, :cond_4

    .line 76
    .line 77
    invoke-virtual {v1}, Landroid/view/Surface;->release()V

    .line 78
    .line 79
    .line 80
    const/4 v0, 0x0

    .line 81
    iput-object v0, p0, Lya4;->S:Landroid/view/Surface;

    .line 82
    .line 83
    :cond_4
    iput-object p1, p0, Lya4;->R:Ljava/lang/Object;

    .line 84
    .line 85
    if-nez v2, :cond_5

    .line 86
    .line 87
    new-instance p1, Lrg;

    .line 88
    .line 89
    const-string v0, "Detaching surface timed out."

    .line 90
    .line 91
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    new-instance v0, Lb84;

    .line 95
    .line 96
    const/4 v1, 0x2

    .line 97
    const/16 v2, 0x3eb

    .line 98
    .line 99
    invoke-direct {v0, v1, p1, v2}, Lb84;-><init>(ILjava/lang/Exception;I)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, v0}, Lya4;->Y1(Lb84;)V

    .line 103
    .line 104
    .line 105
    :cond_5
    return-void
.end method

.method public final i()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lya4;->j2()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final i2(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Lya4;->U:Luz2;

    .line 2
    .line 3
    iget v1, v0, Luz2;->a:I

    .line 4
    .line 5
    if-ne p1, v1, :cond_1

    .line 6
    .line 7
    iget v0, v0, Luz2;->b:I

    .line 8
    .line 9
    if-eq p2, v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-void

    .line 13
    :cond_1
    :goto_0
    new-instance v0, Luz2;

    .line 14
    .line 15
    invoke-direct {v0, p1, p2}, Luz2;-><init>(II)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lya4;->U:Luz2;

    .line 19
    .line 20
    new-instance v0, Ly24;

    .line 21
    .line 22
    invoke-direct {v0, p1, p2}, Ly24;-><init>(II)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lya4;->t:Lmu2;

    .line 26
    .line 27
    const/16 v2, 0x18

    .line 28
    .line 29
    invoke-virtual {v1, v2, v0}, Lmu2;->c(ILks2;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Lmu2;->d()V

    .line 33
    .line 34
    .line 35
    new-instance v0, Luz2;

    .line 36
    .line 37
    invoke-direct {v0, p1, p2}, Luz2;-><init>(II)V

    .line 38
    .line 39
    .line 40
    const/4 p1, 0x2

    .line 41
    const/16 p2, 0xe

    .line 42
    .line 43
    invoke-virtual {p0, p1, v0, p2}, Lya4;->k2(ILjava/lang/Object;I)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final j2()V
    .locals 4

    .line 1
    iget-object v0, p0, Lya4;->k:Lhp2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lhp2;->b()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lya4;->z:Landroid/os/Looper;

    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    if-eq v0, v2, :cond_2

    .line 17
    .line 18
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    sget-object v2, Lv23;->a:Ljava/lang/String;

    .line 35
    .line 36
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 37
    .line 38
    new-instance v2, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string v3, "Player is accessed on the wrong thread.\nCurrent thread: \'"

    .line 41
    .line 42
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v0, "\'\nExpected thread: \'"

    .line 49
    .line 50
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v0, "\'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread"

    .line 57
    .line 58
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iget-boolean v1, p0, Lya4;->Y:Z

    .line 66
    .line 67
    if-nez v1, :cond_1

    .line 68
    .line 69
    iget-boolean v1, p0, Lya4;->Z:Z

    .line 70
    .line 71
    if-eqz v1, :cond_0

    .line 72
    .line 73
    const/4 v1, 0x0

    .line 74
    goto :goto_0

    .line 75
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 76
    .line 77
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 78
    .line 79
    .line 80
    :goto_0
    invoke-static {v0, v1}, La30;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    const/4 v0, 0x1

    .line 84
    iput-boolean v0, p0, Lya4;->Z:Z

    .line 85
    .line 86
    return-void

    .line 87
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 88
    .line 89
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw v1

    .line 93
    :cond_2
    return-void
.end method

.method public final k2(ILjava/lang/Object;I)V
    .locals 8

    .line 1
    iget-object v0, p0, Lya4;->n:[Lkg4;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    move v2, v1

    .line 6
    :goto_0
    iget-object v3, p0, Lya4;->s:Ljb4;

    .line 7
    .line 8
    const/4 v4, -0x1

    .line 9
    const/4 v5, 0x2

    .line 10
    if-ge v2, v5, :cond_2

    .line 11
    .line 12
    aget-object v5, v0, v2

    .line 13
    .line 14
    if-eq p1, v4, :cond_0

    .line 15
    .line 16
    iget v4, v5, Lkg4;->g:I

    .line 17
    .line 18
    if-ne v4, p1, :cond_1

    .line 19
    .line 20
    :cond_0
    iget-object v4, p0, Lya4;->c0:Ldc4;

    .line 21
    .line 22
    invoke-virtual {p0, v4}, Lya4;->Z1(Ldc4;)I

    .line 23
    .line 24
    .line 25
    new-instance v4, Lgc4;

    .line 26
    .line 27
    iget-object v6, p0, Lya4;->c0:Ldc4;

    .line 28
    .line 29
    iget-object v6, v6, Ldc4;->a:Loz1;

    .line 30
    .line 31
    iget-object v6, v3, Ljb4;->o:Landroid/os/Looper;

    .line 32
    .line 33
    invoke-direct {v4, v3, v5, v6}, Lgc4;-><init>(Lec4;Lfc4;Landroid/os/Looper;)V

    .line 34
    .line 35
    .line 36
    iget-boolean v3, v4, Lgc4;->f:Z

    .line 37
    .line 38
    xor-int/lit8 v3, v3, 0x1

    .line 39
    .line 40
    invoke-static {v3}, Lzt0;->b0(Z)V

    .line 41
    .line 42
    .line 43
    iput p3, v4, Lgc4;->c:I

    .line 44
    .line 45
    iget-boolean v3, v4, Lgc4;->f:Z

    .line 46
    .line 47
    xor-int/lit8 v3, v3, 0x1

    .line 48
    .line 49
    invoke-static {v3}, Lzt0;->b0(Z)V

    .line 50
    .line 51
    .line 52
    iput-object p2, v4, Lgc4;->d:Ljava/lang/Object;

    .line 53
    .line 54
    invoke-virtual {v4}, Lgc4;->a()V

    .line 55
    .line 56
    .line 57
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    iget-object v0, p0, Lya4;->o:[Lkg4;

    .line 61
    .line 62
    array-length v2, v0

    .line 63
    :goto_1
    if-ge v1, v5, :cond_5

    .line 64
    .line 65
    aget-object v2, v0, v1

    .line 66
    .line 67
    if-eqz v2, :cond_4

    .line 68
    .line 69
    if-eq p1, v4, :cond_3

    .line 70
    .line 71
    iget v6, v2, Lkg4;->g:I

    .line 72
    .line 73
    if-ne v6, p1, :cond_4

    .line 74
    .line 75
    :cond_3
    iget-object v6, p0, Lya4;->c0:Ldc4;

    .line 76
    .line 77
    invoke-virtual {p0, v6}, Lya4;->Z1(Ldc4;)I

    .line 78
    .line 79
    .line 80
    new-instance v6, Lgc4;

    .line 81
    .line 82
    iget-object v7, p0, Lya4;->c0:Ldc4;

    .line 83
    .line 84
    iget-object v7, v7, Ldc4;->a:Loz1;

    .line 85
    .line 86
    iget-object v7, v3, Ljb4;->o:Landroid/os/Looper;

    .line 87
    .line 88
    invoke-direct {v6, v3, v2, v7}, Lgc4;-><init>(Lec4;Lfc4;Landroid/os/Looper;)V

    .line 89
    .line 90
    .line 91
    iget-boolean v2, v6, Lgc4;->f:Z

    .line 92
    .line 93
    xor-int/lit8 v2, v2, 0x1

    .line 94
    .line 95
    invoke-static {v2}, Lzt0;->b0(Z)V

    .line 96
    .line 97
    .line 98
    iput p3, v6, Lgc4;->c:I

    .line 99
    .line 100
    iget-boolean v2, v6, Lgc4;->f:Z

    .line 101
    .line 102
    xor-int/lit8 v2, v2, 0x1

    .line 103
    .line 104
    invoke-static {v2}, Lzt0;->b0(Z)V

    .line 105
    .line 106
    .line 107
    iput-object p2, v6, Lgc4;->d:Ljava/lang/Object;

    .line 108
    .line 109
    invoke-virtual {v6}, Lgc4;->a()V

    .line 110
    .line 111
    .line 112
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_5
    return-void
.end method

.method public final l2(Z)V
    .locals 12

    .line 1
    invoke-virtual {p0}, Lya4;->j2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lya4;->c0:Ldc4;

    .line 5
    .line 6
    iget v1, v0, Ldc4;->n:I

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x1

    .line 10
    if-ne v1, v3, :cond_1

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    move v1, v3

    .line 15
    move v2, v1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v1, v3

    .line 18
    :cond_1
    :goto_0
    iget-boolean v4, v0, Ldc4;->l:Z

    .line 19
    .line 20
    if-ne v4, p1, :cond_2

    .line 21
    .line 22
    if-ne v1, v2, :cond_2

    .line 23
    .line 24
    iget v1, v0, Ldc4;->m:I

    .line 25
    .line 26
    if-ne v1, v3, :cond_2

    .line 27
    .line 28
    return-void

    .line 29
    :cond_2
    iget v1, p0, Lya4;->J:I

    .line 30
    .line 31
    add-int/2addr v1, v3

    .line 32
    iput v1, p0, Lya4;->J:I

    .line 33
    .line 34
    invoke-virtual {v0, v3, v2, p1}, Ldc4;->h(IIZ)Ldc4;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    iget-object v0, p0, Lya4;->s:Ljb4;

    .line 39
    .line 40
    iget-object v0, v0, Ljb4;->m:Ld13;

    .line 41
    .line 42
    shl-int/lit8 v1, v2, 0x4

    .line 43
    .line 44
    or-int/2addr v1, v3

    .line 45
    iget-object v0, v0, Ld13;->a:Landroid/os/Handler;

    .line 46
    .line 47
    invoke-static {}, Ld13;->f()Lv03;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v0, v3, p1, v1}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iput-object p1, v2, Lv03;->a:Landroid/os/Message;

    .line 56
    .line 57
    invoke-virtual {v2}, Lv03;->a()V

    .line 58
    .line 59
    .line 60
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    const/4 v11, -0x1

    .line 66
    const/4 v6, 0x0

    .line 67
    const/4 v7, 0x0

    .line 68
    const/4 v8, 0x5

    .line 69
    move-object v4, p0

    .line 70
    invoke-virtual/range {v4 .. v11}, Lya4;->c2(Ldc4;IZIJI)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public final n2()J
    .locals 5

    .line 1
    invoke-virtual {p0}, Lya4;->j2()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lya4;->S1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, Lya4;->K1()Loz1;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Loz1;->g()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    return-wide v0

    .line 26
    :cond_0
    invoke-virtual {p0}, Lya4;->O1()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    iget-object v2, p0, Lf74;->g:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v2, Lez1;

    .line 33
    .line 34
    const-wide/16 v3, 0x0

    .line 35
    .line 36
    invoke-virtual {v0, v1, v2, v3, v4}, Loz1;->b(ILez1;J)Lez1;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iget-wide v0, v0, Lez1;->j:J

    .line 41
    .line 42
    invoke-static {v0, v1}, Lv23;->q(J)J

    .line 43
    .line 44
    .line 45
    move-result-wide v0

    .line 46
    return-wide v0

    .line 47
    :cond_1
    iget-object v0, p0, Lya4;->c0:Ldc4;

    .line 48
    .line 49
    iget-object v1, v0, Ldc4;->b:Lkh4;

    .line 50
    .line 51
    iget-object v0, v0, Ldc4;->a:Loz1;

    .line 52
    .line 53
    iget-object v2, v1, Lkh4;->a:Ljava/lang/Object;

    .line 54
    .line 55
    iget-object v3, p0, Lya4;->v:Lsw1;

    .line 56
    .line 57
    invoke-virtual {v0, v2, v3}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 58
    .line 59
    .line 60
    iget v0, v1, Lkh4;->b:I

    .line 61
    .line 62
    iget v1, v1, Lkh4;->c:I

    .line 63
    .line 64
    invoke-virtual {v3, v0, v1}, Lsw1;->b(II)J

    .line 65
    .line 66
    .line 67
    move-result-wide v0

    .line 68
    invoke-static {v0, v1}, Lv23;->q(J)J

    .line 69
    .line 70
    .line 71
    move-result-wide v0

    .line 72
    return-wide v0
.end method

.method public final o1()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lya4;->j2()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lya4;->c0:Ldc4;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lya4;->a2(Ldc4;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    return-wide v0
.end method

.method public final o2()J
    .locals 5

    .line 1
    invoke-virtual {p0}, Lya4;->j2()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lya4;->S1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lya4;->c0:Ldc4;

    .line 11
    .line 12
    iget-object v1, v0, Ldc4;->k:Lkh4;

    .line 13
    .line 14
    iget-object v0, v0, Ldc4;->b:Lkh4;

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Lkh4;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Lya4;->c0:Ldc4;

    .line 23
    .line 24
    iget-wide v0, v0, Ldc4;->p:J

    .line 25
    .line 26
    invoke-static {v0, v1}, Lv23;->q(J)J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    return-wide v0

    .line 31
    :cond_0
    invoke-virtual {p0}, Lya4;->n2()J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    return-wide v0

    .line 36
    :cond_1
    invoke-virtual {p0}, Lya4;->j2()V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lya4;->c0:Ldc4;

    .line 40
    .line 41
    iget-object v0, v0, Ldc4;->a:Loz1;

    .line 42
    .line 43
    invoke-virtual {v0}, Loz1;->g()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    iget-wide v0, p0, Lya4;->e0:J

    .line 50
    .line 51
    return-wide v0

    .line 52
    :cond_2
    iget-object v0, p0, Lya4;->c0:Ldc4;

    .line 53
    .line 54
    iget-object v1, v0, Ldc4;->k:Lkh4;

    .line 55
    .line 56
    iget-wide v1, v1, Lkh4;->d:J

    .line 57
    .line 58
    iget-object v3, v0, Ldc4;->b:Lkh4;

    .line 59
    .line 60
    iget-wide v3, v3, Lkh4;->d:J

    .line 61
    .line 62
    cmp-long v1, v1, v3

    .line 63
    .line 64
    const-wide/16 v2, 0x0

    .line 65
    .line 66
    if-eqz v1, :cond_3

    .line 67
    .line 68
    iget-object v0, v0, Ldc4;->a:Loz1;

    .line 69
    .line 70
    invoke-virtual {p0}, Lya4;->O1()I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    iget-object v4, p0, Lf74;->g:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v4, Lez1;

    .line 77
    .line 78
    invoke-virtual {v0, v1, v4, v2, v3}, Loz1;->b(ILez1;J)Lez1;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iget-wide v0, v0, Lez1;->j:J

    .line 83
    .line 84
    invoke-static {v0, v1}, Lv23;->q(J)J

    .line 85
    .line 86
    .line 87
    move-result-wide v0

    .line 88
    return-wide v0

    .line 89
    :cond_3
    iget-wide v0, v0, Ldc4;->p:J

    .line 90
    .line 91
    iget-object v4, p0, Lya4;->c0:Ldc4;

    .line 92
    .line 93
    iget-object v4, v4, Ldc4;->k:Lkh4;

    .line 94
    .line 95
    invoke-virtual {v4}, Lkh4;->b()Z

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    if-eqz v4, :cond_4

    .line 100
    .line 101
    iget-object v0, p0, Lya4;->c0:Ldc4;

    .line 102
    .line 103
    iget-object v1, v0, Ldc4;->a:Loz1;

    .line 104
    .line 105
    iget-object v0, v0, Ldc4;->k:Lkh4;

    .line 106
    .line 107
    iget-object v0, v0, Lkh4;->a:Ljava/lang/Object;

    .line 108
    .line 109
    iget-object v4, p0, Lya4;->v:Lsw1;

    .line 110
    .line 111
    invoke-virtual {v1, v0, v4}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    iget-object v1, p0, Lya4;->c0:Ldc4;

    .line 116
    .line 117
    iget-object v1, v1, Ldc4;->k:Lkh4;

    .line 118
    .line 119
    iget v1, v1, Lkh4;->b:I

    .line 120
    .line 121
    iget-object v0, v0, Lsw1;->f:Lzb2;

    .line 122
    .line 123
    invoke-virtual {v0, v1}, Lzb2;->a(I)Lcd1;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_4
    move-wide v2, v0

    .line 132
    :goto_0
    iget-object v0, p0, Lya4;->c0:Ldc4;

    .line 133
    .line 134
    iget-object v1, v0, Ldc4;->a:Loz1;

    .line 135
    .line 136
    iget-object v0, v0, Ldc4;->k:Lkh4;

    .line 137
    .line 138
    iget-object v0, v0, Lkh4;->a:Ljava/lang/Object;

    .line 139
    .line 140
    iget-object v4, p0, Lya4;->v:Lsw1;

    .line 141
    .line 142
    invoke-virtual {v1, v0, v4}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 143
    .line 144
    .line 145
    invoke-static {v2, v3}, Lv23;->q(J)J

    .line 146
    .line 147
    .line 148
    move-result-wide v0

    .line 149
    return-wide v0
.end method

.method public final p()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lya4;->j2()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, v0}, Lya4;->Y1(Lb84;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lui2;

    .line 9
    .line 10
    sget-object v1, Lsn3;->j:Lsn3;

    .line 11
    .line 12
    iget-object v2, p0, Lya4;->c0:Ldc4;

    .line 13
    .line 14
    iget-wide v2, v2, Ldc4;->r:J

    .line 15
    .line 16
    invoke-direct {v0, v1}, Lui2;-><init>(Lsn3;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final u1(IJ)V
    .locals 12

    .line 1
    invoke-virtual {p0}, Lya4;->j2()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    const/4 v1, 0x1

    .line 9
    if-ltz p1, :cond_1

    .line 10
    .line 11
    move v2, v1

    .line 12
    goto :goto_0

    .line 13
    :cond_1
    const/4 v2, 0x0

    .line 14
    :goto_0
    invoke-static {v2}, Lzt0;->D(Z)V

    .line 15
    .line 16
    .line 17
    iget-object v2, p0, Lya4;->c0:Ldc4;

    .line 18
    .line 19
    iget-object v2, v2, Ldc4;->a:Loz1;

    .line 20
    .line 21
    invoke-virtual {v2}, Loz1;->g()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-nez v3, :cond_3

    .line 26
    .line 27
    invoke-virtual {v2}, Loz1;->a()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-ge p1, v3, :cond_2

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_2
    :goto_1
    return-void

    .line 35
    :cond_3
    :goto_2
    iget-object v3, p0, Lya4;->y:Lmd4;

    .line 36
    .line 37
    iget-boolean v4, v3, Lmd4;->n:Z

    .line 38
    .line 39
    if-nez v4, :cond_4

    .line 40
    .line 41
    invoke-virtual {v3}, Lmd4;->t()Lad4;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    iput-boolean v1, v3, Lmd4;->n:Z

    .line 46
    .line 47
    new-instance v5, Ly24;

    .line 48
    .line 49
    const/16 v6, 0x1b

    .line 50
    .line 51
    invoke-direct {v5, v6}, Ly24;-><init>(I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3, v4, v0, v5}, Lmd4;->s(Lad4;ILks2;)V

    .line 55
    .line 56
    .line 57
    :cond_4
    iget v0, p0, Lya4;->J:I

    .line 58
    .line 59
    add-int/2addr v0, v1

    .line 60
    iput v0, p0, Lya4;->J:I

    .line 61
    .line 62
    invoke-virtual {p0}, Lya4;->S1()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_5

    .line 67
    .line 68
    const-string p1, "seekTo ignored because an ad is playing"

    .line 69
    .line 70
    invoke-static {p1}, La30;->x(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    new-instance p1, Lr60;

    .line 74
    .line 75
    iget-object p2, p0, Lya4;->c0:Ldc4;

    .line 76
    .line 77
    invoke-direct {p1, p2}, Lr60;-><init>(Ldc4;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, v1}, Lr60;->f(I)V

    .line 81
    .line 82
    .line 83
    iget-object p2, p0, Lya4;->r:Lci3;

    .line 84
    .line 85
    iget-object p2, p2, Lci3;->g:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast p2, Lya4;

    .line 88
    .line 89
    new-instance p3, Lsz2;

    .line 90
    .line 91
    const/16 v0, 0x14

    .line 92
    .line 93
    invoke-direct {p3, p2, p1, v0}, Lsz2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 94
    .line 95
    .line 96
    iget-object p1, p2, Lya4;->q:Ld13;

    .line 97
    .line 98
    invoke-virtual {p1, p3}, Ld13;->d(Ljava/lang/Runnable;)Z

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_5
    iget-object v0, p0, Lya4;->c0:Ldc4;

    .line 103
    .line 104
    iget v1, v0, Ldc4;->e:I

    .line 105
    .line 106
    const/4 v3, 0x3

    .line 107
    if-eq v1, v3, :cond_6

    .line 108
    .line 109
    const/4 v4, 0x4

    .line 110
    if-ne v1, v4, :cond_7

    .line 111
    .line 112
    invoke-virtual {v2}, Loz1;->g()Z

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    if-nez v1, :cond_7

    .line 117
    .line 118
    :cond_6
    iget-object v0, p0, Lya4;->c0:Ldc4;

    .line 119
    .line 120
    const/4 v1, 0x2

    .line 121
    invoke-virtual {v0, v1}, Ldc4;->d(I)Ldc4;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    :cond_7
    invoke-virtual {p0}, Lya4;->O1()I

    .line 126
    .line 127
    .line 128
    move-result v11

    .line 129
    invoke-virtual {p0, v2, p1, p2, p3}, Lya4;->g2(Loz1;IJ)Landroid/util/Pair;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-virtual {p0, v0, v2, v1}, Lya4;->e2(Ldc4;Loz1;Landroid/util/Pair;)Ldc4;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    invoke-static {p2, p3}, Lv23;->r(J)J

    .line 138
    .line 139
    .line 140
    move-result-wide p2

    .line 141
    iget-object v0, p0, Lya4;->s:Ljb4;

    .line 142
    .line 143
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    new-instance v1, Lib4;

    .line 147
    .line 148
    invoke-direct {v1, v2, p1, p2, p3}, Lib4;-><init>(Loz1;IJ)V

    .line 149
    .line 150
    .line 151
    iget-object p1, v0, Ljb4;->m:Ld13;

    .line 152
    .line 153
    invoke-virtual {p1, v3, v1}, Ld13;->a(ILjava/lang/Object;)Lv03;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    invoke-virtual {p1}, Lv03;->a()V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p0, v5}, Lya4;->b2(Ldc4;)J

    .line 161
    .line 162
    .line 163
    move-result-wide v9

    .line 164
    const/4 v6, 0x0

    .line 165
    const/4 v7, 0x1

    .line 166
    const/4 v8, 0x1

    .line 167
    move-object v4, p0

    .line 168
    invoke-virtual/range {v4 .. v11}, Lya4;->c2(Ldc4;IZIJI)V

    .line 169
    .line 170
    .line 171
    return-void
.end method
