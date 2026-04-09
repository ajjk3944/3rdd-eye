.class public final Lif2;
.super Lff2;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lws3;


# static fields
.field public static final t:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field public i:Ljava/lang/String;

.field public final j:Lje2;

.field public k:Z

.field public final l:Lue;

.field public final m:Lpf1;

.field public n:Ljava/nio/ByteBuffer;

.field public o:Z

.field public final p:Ljava/lang/Object;

.field public final q:Ljava/lang/String;

.field public final r:I

.field public s:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lif2;->t:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lag2;Lje2;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lff2;-><init>(Lag2;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lif2;->j:Lje2;

    .line 5
    .line 6
    new-instance p2, Lue;

    .line 7
    .line 8
    const/4 v0, 0x5

    .line 9
    invoke-direct {p2, v0}, Lue;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iput-object p2, p0, Lif2;->l:Lue;

    .line 13
    .line 14
    new-instance p2, Lpf1;

    .line 15
    .line 16
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p2, p0, Lif2;->m:Lpf1;

    .line 20
    .line 21
    new-instance p2, Ljava/lang/Object;

    .line 22
    .line 23
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p2, p0, Lif2;->p:Ljava/lang/Object;

    .line 27
    .line 28
    invoke-interface {p1}, Lag2;->o()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    if-nez p2, :cond_0

    .line 33
    .line 34
    sget-object p2, Lxk3;->f:Lxk3;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance v0, Lfl3;

    .line 38
    .line 39
    invoke-direct {v0, p2}, Lfl3;-><init>(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    move-object p2, v0

    .line 43
    :goto_0
    invoke-virtual {p2}, Ljq0;->b()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    check-cast p2, Ljava/lang/String;

    .line 48
    .line 49
    iput-object p2, p0, Lif2;->q:Ljava/lang/String;

    .line 50
    .line 51
    invoke-interface {p1}, Lag2;->q()I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    iput p1, p0, Lif2;->r:I

    .line 56
    .line 57
    sget-object p1, Lif2;->t:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 60
    .line 61
    .line 62
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    sget-object v0, Lif2;->t:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final b(Ljava/lang/String;)Z
    .locals 27

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    iput-object v2, v1, Lif2;->i:Ljava/lang/String;

    .line 6
    .line 7
    const-string v6, "error"

    .line 8
    .line 9
    const-string v0, "MD5"

    .line 10
    .line 11
    invoke-static {v2, v0}, Lj63;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v3, "cache:"

    .line 20
    .line 21
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    const-string v0, " bytes"

    .line 26
    .line 27
    const-string v4, "Precache abort at "

    .line 28
    .line 29
    const-string v5, " sec"

    .line 30
    .line 31
    const-string v7, "Timeout exceeded. Limit: "

    .line 32
    .line 33
    :try_start_0
    new-instance v15, Lmr2;

    .line 34
    .line 35
    const/16 v10, 0xc

    .line 36
    .line 37
    invoke-direct {v15, v10}, Lmr2;-><init>(I)V

    .line 38
    .line 39
    .line 40
    iget-object v11, v1, Lff2;->g:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v10, v1, Lif2;->j:Lje2;

    .line 43
    .line 44
    iget v12, v10, Lje2;->d:I

    .line 45
    .line 46
    iget v13, v10, Lje2;->e:I

    .line 47
    .line 48
    move-object v14, v10

    .line 49
    new-instance v10, Lbl3;

    .line 50
    .line 51
    move-object/from16 v16, v14

    .line 52
    .line 53
    const/4 v14, 0x1

    .line 54
    move-object/from16 v8, v16

    .line 55
    .line 56
    invoke-direct/range {v10 .. v15}, Lbl3;-><init>(Ljava/lang/String;IIZLmr2;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v10, v1}, Lzd3;->b(Lws3;)V

    .line 60
    .line 61
    .line 62
    iget-boolean v11, v8, Lje2;->i:Z

    .line 63
    .line 64
    if-eqz v11, :cond_0

    .line 65
    .line 66
    new-instance v11, Lte2;

    .line 67
    .line 68
    iget-object v12, v1, Lff2;->f:Landroid/content/Context;

    .line 69
    .line 70
    iget-object v13, v1, Lif2;->q:Ljava/lang/String;

    .line 71
    .line 72
    iget v14, v1, Lif2;->r:I

    .line 73
    .line 74
    invoke-direct {v11, v12, v10, v13, v14}, Lte2;-><init>(Landroid/content/Context;Lbl3;Ljava/lang/String;I)V

    .line 75
    .line 76
    .line 77
    move-object v10, v11

    .line 78
    goto :goto_1

    .line 79
    :catch_0
    move-exception v0

    .line 80
    :goto_0
    move-object/from16 v21, v6

    .line 81
    .line 82
    goto/16 :goto_5

    .line 83
    .line 84
    :cond_0
    :goto_1
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 85
    .line 86
    .line 87
    move-result-object v12

    .line 88
    new-instance v11, Lij3;

    .line 89
    .line 90
    const-wide/16 v13, 0x0

    .line 91
    .line 92
    const-wide/16 v15, -0x1

    .line 93
    .line 94
    invoke-direct/range {v11 .. v16}, Lij3;-><init>(Landroid/net/Uri;JJ)V

    .line 95
    .line 96
    .line 97
    invoke-interface {v10, v11}, Lth3;->a(Lij3;)J

    .line 98
    .line 99
    .line 100
    iget-object v11, v1, Lff2;->h:Ljava/lang/ref/WeakReference;

    .line 101
    .line 102
    invoke-virtual {v11}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v11

    .line 106
    check-cast v11, Lag2;

    .line 107
    .line 108
    if-eqz v11, :cond_1

    .line 109
    .line 110
    invoke-interface {v11, v3, v1}, Lag2;->d1(Ljava/lang/String;Lff2;)V

    .line 111
    .line 112
    .line 113
    :cond_1
    sget-object v11, Lhg4;->C:Lhg4;

    .line 114
    .line 115
    iget-object v11, v11, Lhg4;->k:Lym;

    .line 116
    .line 117
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 121
    .line 122
    .line 123
    move-result-wide v11

    .line 124
    sget-object v13, Lmz1;->K:Liz1;

    .line 125
    .line 126
    sget-object v14, Ltw1;->e:Ltw1;

    .line 127
    .line 128
    iget-object v15, v14, Ltw1;->c:Lkz1;

    .line 129
    .line 130
    invoke-virtual {v15, v13}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v13

    .line 134
    check-cast v13, Ljava/lang/Long;

    .line 135
    .line 136
    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    .line 137
    .line 138
    .line 139
    move-result-wide v15

    .line 140
    sget-object v13, Lmz1;->J:Liz1;

    .line 141
    .line 142
    iget-object v14, v14, Ltw1;->c:Lkz1;

    .line 143
    .line 144
    invoke-virtual {v14, v13}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v13

    .line 148
    check-cast v13, Ljava/lang/Long;

    .line 149
    .line 150
    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    .line 151
    .line 152
    .line 153
    move-result-wide v13

    .line 154
    iget v8, v8, Lje2;->c:I

    .line 155
    .line 156
    invoke-static {v8}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 157
    .line 158
    .line 159
    move-result-object v8

    .line 160
    iput-object v8, v1, Lif2;->n:Ljava/nio/ByteBuffer;

    .line 161
    .line 162
    const/16 v8, 0x2000

    .line 163
    .line 164
    new-array v9, v8, [B

    .line 165
    .line 166
    move-wide/from16 v19, v11

    .line 167
    .line 168
    :goto_2
    iget-object v8, v1, Lif2;->n:Ljava/nio/ByteBuffer;

    .line 169
    .line 170
    invoke-virtual {v8}, Ljava/nio/Buffer;->remaining()I

    .line 171
    .line 172
    .line 173
    move-result v8
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 174
    const/16 v2, 0x2000

    .line 175
    .line 176
    :try_start_1
    invoke-static {v8, v2}, Ljava/lang/Math;->min(II)I

    .line 177
    .line 178
    .line 179
    move-result v8

    .line 180
    const/4 v2, 0x0

    .line 181
    invoke-interface {v10, v9, v2, v8}, Lua4;->d([BII)I

    .line 182
    .line 183
    .line 184
    move-result v8

    .line 185
    const/4 v2, -0x1

    .line 186
    if-ne v8, v2, :cond_2

    .line 187
    .line 188
    const/4 v2, 0x1

    .line 189
    iput-boolean v2, v1, Lif2;->s:Z

    .line 190
    .line 191
    iget-object v0, v1, Lif2;->m:Lpf1;

    .line 192
    .line 193
    iget-object v2, v1, Lif2;->n:Ljava/nio/ByteBuffer;

    .line 194
    .line 195
    invoke-virtual {v0, v2}, Lpf1;->a(Ljava/nio/ByteBuffer;)J

    .line 196
    .line 197
    .line 198
    move-result-wide v4

    .line 199
    long-to-int v0, v4

    .line 200
    int-to-long v4, v0

    .line 201
    sget-object v7, Lj63;->b:Lwc1;

    .line 202
    .line 203
    new-instance v0, Lef2;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 204
    .line 205
    move-object/from16 v2, p1

    .line 206
    .line 207
    :try_start_2
    invoke-direct/range {v0 .. v5}, Lef2;-><init>(Lff2;Ljava/lang/String;Ljava/lang/String;J)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v7, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 211
    .line 212
    .line 213
    const/16 v17, 0x1

    .line 214
    .line 215
    return v17

    .line 216
    :catch_1
    move-exception v0

    .line 217
    move-object/from16 v2, p1

    .line 218
    .line 219
    goto/16 :goto_0

    .line 220
    .line 221
    :cond_2
    move-object/from16 v2, p1

    .line 222
    .line 223
    move-object/from16 v21, v6

    .line 224
    .line 225
    :try_start_3
    iget-object v6, v1, Lif2;->p:Ljava/lang/Object;

    .line 226
    .line 227
    monitor-enter v6
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 228
    move-object/from16 v22, v10

    .line 229
    .line 230
    :try_start_4
    iget-boolean v10, v1, Lif2;->k:Z

    .line 231
    .line 232
    if-nez v10, :cond_3

    .line 233
    .line 234
    iget-object v10, v1, Lif2;->n:Ljava/nio/ByteBuffer;

    .line 235
    .line 236
    move-wide/from16 v23, v11

    .line 237
    .line 238
    const/4 v11, 0x0

    .line 239
    invoke-virtual {v10, v9, v11, v8}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 240
    .line 241
    .line 242
    goto :goto_3

    .line 243
    :catchall_0
    move-exception v0

    .line 244
    goto/16 :goto_4

    .line 245
    .line 246
    :cond_3
    move-wide/from16 v23, v11

    .line 247
    .line 248
    :goto_3
    monitor-exit v6
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 249
    :try_start_5
    iget-object v6, v1, Lif2;->n:Ljava/nio/ByteBuffer;

    .line 250
    .line 251
    invoke-virtual {v6}, Ljava/nio/Buffer;->remaining()I

    .line 252
    .line 253
    .line 254
    move-result v6

    .line 255
    if-gtz v6, :cond_4

    .line 256
    .line 257
    invoke-virtual {v1}, Lif2;->o()V

    .line 258
    .line 259
    .line 260
    const/16 v17, 0x1

    .line 261
    .line 262
    return v17

    .line 263
    :catch_2
    move-exception v0

    .line 264
    goto/16 :goto_5

    .line 265
    .line 266
    :cond_4
    iget-boolean v6, v1, Lif2;->k:Z

    .line 267
    .line 268
    if-nez v6, :cond_7

    .line 269
    .line 270
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 271
    .line 272
    .line 273
    move-result-wide v10

    .line 274
    sub-long v25, v10, v19

    .line 275
    .line 276
    cmp-long v6, v25, v15

    .line 277
    .line 278
    if-ltz v6, :cond_5

    .line 279
    .line 280
    invoke-virtual {v1}, Lif2;->o()V

    .line 281
    .line 282
    .line 283
    move-wide/from16 v19, v10

    .line 284
    .line 285
    :cond_5
    sub-long v10, v10, v23

    .line 286
    .line 287
    const-wide/16 v25, 0x3e8

    .line 288
    .line 289
    mul-long v25, v25, v13

    .line 290
    .line 291
    cmp-long v6, v10, v25

    .line 292
    .line 293
    if-gtz v6, :cond_6

    .line 294
    .line 295
    move-object/from16 v6, v21

    .line 296
    .line 297
    move-object/from16 v10, v22

    .line 298
    .line 299
    move-wide/from16 v11, v23

    .line 300
    .line 301
    goto/16 :goto_2

    .line 302
    .line 303
    :cond_6
    const-string v6, "downloadTimeout"
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    .line 304
    .line 305
    :try_start_6
    invoke-static {v13, v14}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 310
    .line 311
    .line 312
    move-result v0

    .line 313
    add-int/lit8 v0, v0, 0x1d

    .line 314
    .line 315
    new-instance v4, Ljava/lang/StringBuilder;

    .line 316
    .line 317
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v4, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    new-instance v4, Ljava/io/IOException;

    .line 334
    .line 335
    invoke-direct {v4, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    throw v4
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    .line 339
    :catch_3
    move-exception v0

    .line 340
    goto :goto_6

    .line 341
    :cond_7
    :try_start_7
    const-string v6, "externalAbort"
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2

    .line 342
    .line 343
    :try_start_8
    new-instance v5, Ljava/io/IOException;

    .line 344
    .line 345
    iget-object v7, v1, Lif2;->n:Ljava/nio/ByteBuffer;

    .line 346
    .line 347
    invoke-virtual {v7}, Ljava/nio/Buffer;->limit()I

    .line 348
    .line 349
    .line 350
    move-result v7

    .line 351
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v8

    .line 355
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 356
    .line 357
    .line 358
    move-result v8

    .line 359
    add-int/lit8 v8, v8, 0x18

    .line 360
    .line 361
    new-instance v9, Ljava/lang/StringBuilder;

    .line 362
    .line 363
    invoke-direct {v9, v8}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 364
    .line 365
    .line 366
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 370
    .line 371
    .line 372
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    invoke-direct {v5, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    throw v5
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_3

    .line 383
    :goto_4
    :try_start_9
    monitor-exit v6
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 384
    :try_start_a
    throw v0
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_2

    .line 385
    :goto_5
    move-object/from16 v6, v21

    .line 386
    .line 387
    :goto_6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 388
    .line 389
    .line 390
    move-result-object v4

    .line 391
    invoke-virtual {v4}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v4

    .line 395
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v5

    .line 403
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 404
    .line 405
    .line 406
    move-result v5

    .line 407
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v7

    .line 411
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 412
    .line 413
    .line 414
    move-result v7

    .line 415
    new-instance v8, Ljava/lang/StringBuilder;

    .line 416
    .line 417
    const/16 v17, 0x1

    .line 418
    .line 419
    add-int/lit8 v5, v5, 0x1

    .line 420
    .line 421
    add-int/2addr v5, v7

    .line 422
    invoke-direct {v8, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 423
    .line 424
    .line 425
    const-string v5, ":"

    .line 426
    .line 427
    invoke-static {v8, v4, v5, v0}, Lex0;->l(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v4

    .line 435
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 436
    .line 437
    .line 438
    move-result v4

    .line 439
    new-instance v5, Ljava/lang/StringBuilder;

    .line 440
    .line 441
    add-int/lit8 v4, v4, 0x22

    .line 442
    .line 443
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 444
    .line 445
    .line 446
    move-result v7

    .line 447
    add-int/2addr v7, v4

    .line 448
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 449
    .line 450
    .line 451
    const-string v4, "Failed to preload url "

    .line 452
    .line 453
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 454
    .line 455
    .line 456
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 457
    .line 458
    .line 459
    const-string v4, " Exception: "

    .line 460
    .line 461
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 462
    .line 463
    .line 464
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 465
    .line 466
    .line 467
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v4

    .line 471
    invoke-static {v4}, Lgi2;->i0(Ljava/lang/String;)V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v1, v2, v3, v6, v0}, Lff2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 475
    .line 476
    .line 477
    const/16 v18, 0x0

    .line 478
    .line 479
    return v18
.end method

.method public final c(Lij3;Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final e(Lzd3;Lij3;Z)V
    .locals 0

    .line 1
    instance-of p2, p1, Lbl3;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    check-cast p1, Lbl3;

    .line 6
    .line 7
    iget-object p2, p0, Lif2;->l:Lue;

    .line 8
    .line 9
    iget-object p2, p2, Lue;->h:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p2, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final f(Lij3;ZI)V
    .locals 0

    .line 1
    return-void
.end method

.method public final l()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lif2;->k:Z

    .line 3
    .line 4
    return-void
.end method

.method public final o()V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lif2;->l:Lue;

    .line 4
    .line 5
    iget-object v2, v0, Lue;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const/4 v4, 0x0

    .line 18
    if-eqz v3, :cond_2

    .line 19
    .line 20
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, Lbl3;

    .line 25
    .line 26
    invoke-virtual {v3}, Lbl3;->g()Ljava/util/Map;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    :catch_0
    :cond_0
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-eqz v5, :cond_1

    .line 43
    .line 44
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    check-cast v5, Ljava/util/Map$Entry;

    .line 49
    .line 50
    :try_start_0
    const-string v6, "content-length"

    .line 51
    .line 52
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    check-cast v7, Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v6, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    if-eqz v6, :cond_0

    .line 63
    .line 64
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    check-cast v5, Ljava/util/List;

    .line 69
    .line 70
    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    check-cast v5, Ljava/lang/String;

    .line 75
    .line 76
    invoke-static {v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 77
    .line 78
    .line 79
    move-result-wide v5

    .line 80
    iget-wide v7, v0, Lue;->g:J

    .line 81
    .line 82
    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 83
    .line 84
    .line 85
    move-result-wide v5

    .line 86
    iput-wide v5, v0, Lue;->g:J
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_2
    iget-wide v2, v0, Lue;->g:J

    .line 94
    .line 95
    long-to-int v5, v2

    .line 96
    iget-object v0, v1, Lif2;->m:Lpf1;

    .line 97
    .line 98
    iget-object v2, v1, Lif2;->n:Ljava/nio/ByteBuffer;

    .line 99
    .line 100
    invoke-virtual {v0, v2}, Lpf1;->a(Ljava/nio/ByteBuffer;)J

    .line 101
    .line 102
    .line 103
    move-result-wide v2

    .line 104
    long-to-int v0, v2

    .line 105
    iget-object v2, v1, Lif2;->n:Ljava/nio/ByteBuffer;

    .line 106
    .line 107
    invoke-virtual {v2}, Ljava/nio/Buffer;->position()I

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    int-to-float v3, v2

    .line 112
    int-to-float v6, v5

    .line 113
    int-to-float v7, v0

    .line 114
    div-float/2addr v3, v6

    .line 115
    mul-float/2addr v3, v7

    .line 116
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    sget-object v6, Lsf2;->z:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 121
    .line 122
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 123
    .line 124
    .line 125
    move-result v11

    .line 126
    sget-object v6, Lsf2;->A:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 127
    .line 128
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 129
    .line 130
    .line 131
    move-result v12

    .line 132
    move v6, v4

    .line 133
    move v4, v2

    .line 134
    iget-object v2, v1, Lif2;->i:Ljava/lang/String;

    .line 135
    .line 136
    const-string v7, "MD5"

    .line 137
    .line 138
    invoke-static {v2, v7}, Lj63;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v7

    .line 142
    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v7

    .line 146
    const-string v8, "cache:"

    .line 147
    .line 148
    invoke-virtual {v8, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v7

    .line 152
    move v9, v6

    .line 153
    move-object v8, v7

    .line 154
    int-to-long v6, v3

    .line 155
    if-lez v3, :cond_3

    .line 156
    .line 157
    const/4 v3, 0x1

    .line 158
    move v10, v3

    .line 159
    goto :goto_2

    .line 160
    :cond_3
    move v10, v9

    .line 161
    :goto_2
    int-to-long v13, v0

    .line 162
    sget-object v15, Lj63;->b:Lwc1;

    .line 163
    .line 164
    new-instance v0, Lcf2;

    .line 165
    .line 166
    move-object v3, v8

    .line 167
    move-wide v8, v13

    .line 168
    invoke-direct/range {v0 .. v12}, Lcf2;-><init>(Lif2;Ljava/lang/String;Ljava/lang/String;IIJJZII)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v15, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 172
    .line 173
    .line 174
    return-void
.end method
