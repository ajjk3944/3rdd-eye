.class public final Lnb1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final l:Li80;


# instance fields
.field public final a:Lgg0;

.field public final b:I

.field public final c:I

.field public d:Lvq2;

.field public final e:Ljava/net/SocketAddress;

.field public f:Lxz0;

.field public g:Ljava/time/Duration;

.field public h:I

.field public i:J

.field public j:J

.field public k:Ltn0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lnb1;

    .line 2
    .line 3
    invoke-static {v0}, Lk80;->d(Ljava/lang/Class;)Li80;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lnb1;->l:Li80;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lgg0;Ljava/net/SocketAddress;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0xf

    .line 5
    .line 6
    invoke-static {v0, v1}, Ljava/time/Duration;->ofMinutes(J)Ljava/time/Duration;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lnb1;->g:Ljava/time/Duration;

    .line 11
    .line 12
    iput-object p2, p0, Lnb1;->e:Ljava/net/SocketAddress;

    .line 13
    .line 14
    invoke-virtual {p1}, Lgg0;->isAbsolute()Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-eqz p2, :cond_0

    .line 19
    .line 20
    iput-object p1, p0, Lnb1;->a:Lgg0;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    :try_start_0
    sget-object p2, Lgg0;->l:Lgg0;

    .line 24
    .line 25
    invoke-static {p1, p2}, Lgg0;->e(Lgg0;Lgg0;)Lgg0;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, Lnb1;->a:Lgg0;
    :try_end_0
    .catch Lhg0; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    :goto_0
    const/16 p1, 0xfc

    .line 32
    .line 33
    iput p1, p0, Lnb1;->b:I

    .line 34
    .line 35
    const/4 p1, 0x1

    .line 36
    iput p1, p0, Lnb1;->c:I

    .line 37
    .line 38
    const/4 p1, 0x0

    .line 39
    iput p1, p0, Lnb1;->h:I

    .line 40
    .line 41
    return-void

    .line 42
    :catch_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 43
    .line 44
    const-string p2, "ZoneTransferIn: name too long"

    .line 45
    .line 46
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1
.end method

.method public static b(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Llb1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    throw v0
.end method


# virtual methods
.method public final a()V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lnb1;->a:Lgg0;

    .line 4
    .line 5
    iget v2, v1, Lnb1;->b:I

    .line 6
    .line 7
    iget v3, v1, Lnb1;->c:I

    .line 8
    .line 9
    const-wide/16 v4, 0x0

    .line 10
    .line 11
    invoke-static {v0, v2, v3, v4, v5}, Ltn0;->i(Lgg0;IIJ)Ltn0;

    .line 12
    .line 13
    .line 14
    move-result-object v6

    .line 15
    new-instance v7, Lme0;

    .line 16
    .line 17
    invoke-direct {v7}, Lme0;-><init>()V

    .line 18
    .line 19
    .line 20
    iget-object v8, v7, Lme0;->f:Ll00;

    .line 21
    .line 22
    invoke-virtual {v8}, Ll00;->e()V

    .line 23
    .line 24
    .line 25
    const/4 v8, 0x0

    .line 26
    invoke-virtual {v7, v6, v8}, Lme0;->b(Ltn0;I)V

    .line 27
    .line 28
    .line 29
    const/4 v6, 0x2

    .line 30
    const/16 v9, 0xfb

    .line 31
    .line 32
    if-ne v2, v9, :cond_0

    .line 33
    .line 34
    new-instance v10, Lrr0;

    .line 35
    .line 36
    sget-object v11, Lgg0;->l:Lgg0;

    .line 37
    .line 38
    const/4 v12, 0x6

    .line 39
    invoke-direct {v10, v0, v12, v3}, Ltn0;-><init>(Lgg0;II)V

    .line 40
    .line 41
    .line 42
    const-string v0, "host"

    .line 43
    .line 44
    invoke-static {v0, v11}, Ltn0;->b(Ljava/lang/String;Lgg0;)V

    .line 45
    .line 46
    .line 47
    iput-object v11, v10, Lrr0;->k:Lgg0;

    .line 48
    .line 49
    const-string v0, "admin"

    .line 50
    .line 51
    invoke-static {v0, v11}, Ltn0;->b(Ljava/lang/String;Lgg0;)V

    .line 52
    .line 53
    .line 54
    iput-object v11, v10, Lrr0;->l:Lgg0;

    .line 55
    .line 56
    iput-wide v4, v10, Lrr0;->m:J

    .line 57
    .line 58
    iput-wide v4, v10, Lrr0;->n:J

    .line 59
    .line 60
    iput-wide v4, v10, Lrr0;->o:J

    .line 61
    .line 62
    iput-wide v4, v10, Lrr0;->p:J

    .line 63
    .line 64
    iput-wide v4, v10, Lrr0;->q:J

    .line 65
    .line 66
    invoke-virtual {v7, v10, v6}, Lme0;->b(Ltn0;I)V

    .line 67
    .line 68
    .line 69
    :cond_0
    new-instance v0, Lt3;

    .line 70
    .line 71
    invoke-direct {v0, v6, v8}, Lt3;-><init>(IB)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v7, v0}, Lme0;->l(Lt3;)Z

    .line 75
    .line 76
    .line 77
    iget v3, v0, Lt3;->g:I

    .line 78
    .line 79
    iput v3, v7, Lme0;->h:I

    .line 80
    .line 81
    invoke-virtual {v0}, Lt3;->i()[B

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iget-object v3, v1, Lnb1;->f:Lxz0;

    .line 86
    .line 87
    iget-object v7, v3, Lxz0;->h:Ljava/nio/channels/SelectionKey;

    .line 88
    .line 89
    invoke-virtual {v7}, Ljava/nio/channels/SelectionKey;->channel()Ljava/nio/channels/SelectableChannel;

    .line 90
    .line 91
    .line 92
    move-result-object v10

    .line 93
    check-cast v10, Ljava/nio/channels/SocketChannel;

    .line 94
    .line 95
    invoke-virtual {v10}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    .line 96
    .line 97
    .line 98
    move-result-object v11

    .line 99
    invoke-virtual {v11}, Ljava/net/Socket;->getLocalSocketAddress()Ljava/net/SocketAddress;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v10}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    .line 103
    .line 104
    .line 105
    move-result-object v11

    .line 106
    invoke-virtual {v11}, Ljava/net/Socket;->getRemoteSocketAddress()Ljava/net/SocketAddress;

    .line 107
    .line 108
    .line 109
    const-string v11, "TCP write"

    .line 110
    .line 111
    invoke-static {v11, v0}, Ldh0;->d(Ljava/lang/String;[B)V

    .line 112
    .line 113
    .line 114
    array-length v11, v0

    .line 115
    ushr-int/lit8 v11, v11, 0x8

    .line 116
    .line 117
    int-to-byte v11, v11

    .line 118
    array-length v12, v0

    .line 119
    and-int/lit16 v12, v12, 0xff

    .line 120
    .line 121
    int-to-byte v12, v12

    .line 122
    new-array v13, v6, [B

    .line 123
    .line 124
    aput-byte v11, v13, v8

    .line 125
    .line 126
    const/4 v11, 0x1

    .line 127
    aput-byte v12, v13, v11

    .line 128
    .line 129
    invoke-static {v13}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 130
    .line 131
    .line 132
    move-result-object v12

    .line 133
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 134
    .line 135
    .line 136
    move-result-object v13

    .line 137
    filled-new-array {v12, v13}, [Ljava/nio/ByteBuffer;

    .line 138
    .line 139
    .line 140
    move-result-object v12

    .line 141
    const/4 v13, 0x4

    .line 142
    invoke-virtual {v7, v13}, Ljava/nio/channels/SelectionKey;->interestOps(I)Ljava/nio/channels/SelectionKey;

    .line 143
    .line 144
    .line 145
    move v14, v8

    .line 146
    :goto_0
    :try_start_0
    array-length v15, v0

    .line 147
    add-int/2addr v15, v6

    .line 148
    if-ge v14, v15, :cond_5

    .line 149
    .line 150
    invoke-virtual {v7}, Ljava/nio/channels/SelectionKey;->isWritable()Z

    .line 151
    .line 152
    .line 153
    move-result v15

    .line 154
    if-eqz v15, :cond_4

    .line 155
    .line 156
    move-wide v15, v4

    .line 157
    invoke-virtual {v10, v12}, Ljava/nio/channels/SocketChannel;->write([Ljava/nio/ByteBuffer;)J

    .line 158
    .line 159
    .line 160
    move-result-wide v4

    .line 161
    cmp-long v17, v4, v15

    .line 162
    .line 163
    if-ltz v17, :cond_3

    .line 164
    .line 165
    long-to-int v4, v4

    .line 166
    add-int/2addr v14, v4

    .line 167
    array-length v4, v0

    .line 168
    add-int/2addr v4, v6

    .line 169
    if-ge v14, v4, :cond_2

    .line 170
    .line 171
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 172
    .line 173
    .line 174
    move-result-wide v4

    .line 175
    move/from16 v18, v14

    .line 176
    .line 177
    iget-wide v13, v3, Lxz0;->f:J

    .line 178
    .line 179
    sub-long/2addr v4, v13

    .line 180
    iget-object v13, v3, Lxz0;->g:Ljava/time/Duration;

    .line 181
    .line 182
    invoke-virtual {v13}, Ljava/time/Duration;->toNanos()J

    .line 183
    .line 184
    .line 185
    move-result-wide v13

    .line 186
    cmp-long v4, v4, v13

    .line 187
    .line 188
    if-gez v4, :cond_1

    .line 189
    .line 190
    goto :goto_1

    .line 191
    :cond_1
    new-instance v0, Ljava/net/SocketTimeoutException;

    .line 192
    .line 193
    invoke-direct {v0}, Ljava/net/SocketTimeoutException;-><init>()V

    .line 194
    .line 195
    .line 196
    throw v0

    .line 197
    :catchall_0
    move-exception v0

    .line 198
    goto/16 :goto_7

    .line 199
    .line 200
    :cond_2
    move/from16 v18, v14

    .line 201
    .line 202
    :goto_1
    move-wide v4, v15

    .line 203
    move/from16 v14, v18

    .line 204
    .line 205
    :goto_2
    const/4 v13, 0x4

    .line 206
    goto :goto_0

    .line 207
    :cond_3
    new-instance v0, Ljava/io/EOFException;

    .line 208
    .line 209
    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    .line 210
    .line 211
    .line 212
    throw v0

    .line 213
    :cond_4
    move-wide v15, v4

    .line 214
    invoke-virtual {v3, v7}, Lxz0;->a(Ljava/nio/channels/SelectionKey;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 215
    .line 216
    .line 217
    move-wide v4, v15

    .line 218
    goto :goto_2

    .line 219
    :cond_5
    invoke-virtual {v7}, Ljava/nio/channels/SelectionKey;->isValid()Z

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    if-eqz v0, :cond_6

    .line 224
    .line 225
    invoke-virtual {v7, v8}, Ljava/nio/channels/SelectionKey;->interestOps(I)Ljava/nio/channels/SelectionKey;

    .line 226
    .line 227
    .line 228
    :cond_6
    iget v0, v1, Lnb1;->h:I

    .line 229
    .line 230
    const/4 v3, 0x7

    .line 231
    if-eq v0, v3, :cond_10

    .line 232
    .line 233
    iget-object v0, v1, Lnb1;->f:Lxz0;

    .line 234
    .line 235
    invoke-virtual {v0, v6}, Lxz0;->c(I)[B

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    aget-byte v4, v3, v8

    .line 240
    .line 241
    and-int/lit16 v4, v4, 0xff

    .line 242
    .line 243
    shl-int/lit8 v4, v4, 0x8

    .line 244
    .line 245
    aget-byte v3, v3, v11

    .line 246
    .line 247
    and-int/lit16 v3, v3, 0xff

    .line 248
    .line 249
    add-int/2addr v4, v3

    .line 250
    invoke-virtual {v0, v4}, Lxz0;->c(I)[B

    .line 251
    .line 252
    .line 253
    move-result-object v3

    .line 254
    iget-object v0, v0, Lxz0;->h:Ljava/nio/channels/SelectionKey;

    .line 255
    .line 256
    invoke-virtual {v0}, Ljava/nio/channels/SelectionKey;->channel()Ljava/nio/channels/SelectableChannel;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    check-cast v0, Ljava/nio/channels/SocketChannel;

    .line 261
    .line 262
    invoke-virtual {v0}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    .line 263
    .line 264
    .line 265
    move-result-object v4

    .line 266
    invoke-virtual {v4}, Ljava/net/Socket;->getLocalSocketAddress()Ljava/net/SocketAddress;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v0}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    invoke-virtual {v0}, Ljava/net/Socket;->getRemoteSocketAddress()Ljava/net/SocketAddress;

    .line 274
    .line 275
    .line 276
    const-string v0, "TCP read"

    .line 277
    .line 278
    invoke-static {v0, v3}, Ldh0;->d(Ljava/lang/String;[B)V

    .line 279
    .line 280
    .line 281
    :try_start_1
    new-instance v0, Lme0;

    .line 282
    .line 283
    invoke-direct {v0, v3}, Lme0;-><init>([B)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 284
    .line 285
    .line 286
    sget-object v3, Ltt0;->a:Lue0;

    .line 287
    .line 288
    invoke-virtual {v3, v11}, Lue0;->d(I)V

    .line 289
    .line 290
    .line 291
    iget-object v3, v0, Lme0;->g:[Ljava/util/List;

    .line 292
    .line 293
    aget-object v3, v3, v11

    .line 294
    .line 295
    if-nez v3, :cond_7

    .line 296
    .line 297
    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 298
    .line 299
    goto :goto_3

    .line 300
    :cond_7
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 301
    .line 302
    .line 303
    move-result-object v3

    .line 304
    :goto_3
    iget-object v4, v0, Lme0;->f:Ll00;

    .line 305
    .line 306
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 307
    .line 308
    .line 309
    iget v4, v1, Lnb1;->h:I

    .line 310
    .line 311
    if-nez v4, :cond_d

    .line 312
    .line 313
    invoke-virtual {v0}, Lme0;->f()I

    .line 314
    .line 315
    .line 316
    move-result v4

    .line 317
    const-string v5, "server doesn\'t support IXFR"

    .line 318
    .line 319
    const/4 v7, 0x0

    .line 320
    if-eqz v4, :cond_9

    .line 321
    .line 322
    if-ne v2, v9, :cond_8

    .line 323
    .line 324
    const/4 v10, 0x4

    .line 325
    if-ne v4, v10, :cond_8

    .line 326
    .line 327
    invoke-static {v5}, Lnb1;->b(Ljava/lang/String;)V

    .line 328
    .line 329
    .line 330
    throw v7

    .line 331
    :cond_8
    sget-object v0, Lpn0;->a:Lue0;

    .line 332
    .line 333
    invoke-virtual {v0, v4}, Lue0;->e(I)Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    invoke-static {v0}, Lnb1;->b(Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    throw v7

    .line 341
    :cond_9
    const/4 v10, 0x4

    .line 342
    invoke-virtual {v0}, Lme0;->e()Ltn0;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    if-eqz v0, :cond_b

    .line 347
    .line 348
    iget v0, v0, Ltn0;->g:I

    .line 349
    .line 350
    if-ne v0, v2, :cond_a

    .line 351
    .line 352
    goto :goto_4

    .line 353
    :cond_a
    const-string v0, "invalid question section"

    .line 354
    .line 355
    invoke-static {v0}, Lnb1;->b(Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    throw v7

    .line 359
    :cond_b
    :goto_4
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 360
    .line 361
    .line 362
    move-result v0

    .line 363
    if-eqz v0, :cond_e

    .line 364
    .line 365
    if-eq v2, v9, :cond_c

    .line 366
    .line 367
    goto :goto_5

    .line 368
    :cond_c
    invoke-static {v5}, Lnb1;->b(Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    throw v7

    .line 372
    :cond_d
    const/4 v10, 0x4

    .line 373
    :cond_e
    :goto_5
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 378
    .line 379
    .line 380
    move-result v3

    .line 381
    if-eqz v3, :cond_6

    .line 382
    .line 383
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v3

    .line 387
    check-cast v3, Ltn0;

    .line 388
    .line 389
    invoke-virtual {v1, v3}, Lnb1;->d(Ltn0;)V

    .line 390
    .line 391
    .line 392
    goto :goto_6

    .line 393
    :catch_0
    move-exception v0

    .line 394
    instance-of v2, v0, Lt91;

    .line 395
    .line 396
    if-eqz v2, :cond_f

    .line 397
    .line 398
    check-cast v0, Lt91;

    .line 399
    .line 400
    throw v0

    .line 401
    :cond_f
    new-instance v2, Lt91;

    .line 402
    .line 403
    const-string v3, "Error parsing message"

    .line 404
    .line 405
    invoke-direct {v2, v3, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 406
    .line 407
    .line 408
    throw v2

    .line 409
    :cond_10
    return-void

    .line 410
    :goto_7
    invoke-virtual {v7}, Ljava/nio/channels/SelectionKey;->isValid()Z

    .line 411
    .line 412
    .line 413
    move-result v2

    .line 414
    if-eqz v2, :cond_11

    .line 415
    .line 416
    invoke-virtual {v7, v8}, Ljava/nio/channels/SelectionKey;->interestOps(I)Ljava/nio/channels/SelectionKey;

    .line 417
    .line 418
    .line 419
    :cond_11
    throw v0
.end method

.method public final c()V
    .locals 5

    .line 1
    iget-object v0, p0, Lnb1;->g:Ljava/time/Duration;

    .line 2
    .line 3
    new-instance v1, Lxz0;

    .line 4
    .line 5
    invoke-direct {v1, v0}, Lxz0;-><init>(Ljava/time/Duration;)V

    .line 6
    .line 7
    .line 8
    iput-object v1, p0, Lnb1;->f:Lxz0;

    .line 9
    .line 10
    iget-object v0, v1, Lxz0;->h:Ljava/nio/channels/SelectionKey;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/nio/channels/SelectionKey;->channel()Ljava/nio/channels/SelectableChannel;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, Ljava/nio/channels/SocketChannel;

    .line 17
    .line 18
    iget-object v3, p0, Lnb1;->e:Ljava/net/SocketAddress;

    .line 19
    .line 20
    invoke-virtual {v2, v3}, Ljava/nio/channels/SocketChannel;->connect(Ljava/net/SocketAddress;)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    const/16 v3, 0x8

    .line 28
    .line 29
    invoke-virtual {v0, v3}, Ljava/nio/channels/SelectionKey;->interestOps(I)Ljava/nio/channels/SelectionKey;

    .line 30
    .line 31
    .line 32
    :cond_1
    :goto_0
    const/4 v3, 0x0

    .line 33
    :try_start_0
    invoke-virtual {v2}, Ljava/nio/channels/SocketChannel;->finishConnect()Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-nez v4, :cond_2

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/nio/channels/SelectionKey;->isConnectable()Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-nez v4, :cond_1

    .line 44
    .line 45
    invoke-virtual {v1, v0}, Lxz0;->a(Ljava/nio/channels/SelectionKey;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception v1

    .line 50
    goto :goto_2

    .line 51
    :cond_2
    invoke-virtual {v0}, Ljava/nio/channels/SelectionKey;->isValid()Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_3

    .line 56
    .line 57
    invoke-virtual {v0, v3}, Ljava/nio/channels/SelectionKey;->interestOps(I)Ljava/nio/channels/SelectionKey;

    .line 58
    .line 59
    .line 60
    :cond_3
    :goto_1
    return-void

    .line 61
    :goto_2
    invoke-virtual {v0}, Ljava/nio/channels/SelectionKey;->isValid()Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_4

    .line 66
    .line 67
    invoke-virtual {v0, v3}, Ljava/nio/channels/SelectionKey;->interestOps(I)Ljava/nio/channels/SelectionKey;

    .line 68
    .line 69
    .line 70
    :cond_4
    throw v1
.end method

.method public final d(Ltn0;)V
    .locals 13

    .line 1
    iget v0, p1, Ltn0;->g:I

    .line 2
    .line 3
    iget v1, p0, Lnb1;->h:I

    .line 4
    .line 5
    iget-object v2, p0, Lnb1;->a:Lgg0;

    .line 6
    .line 7
    const-string v3, "{}: {}"

    .line 8
    .line 9
    sget-object v4, Lnb1;->l:Li80;

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const-wide/16 v6, 0x0

    .line 13
    .line 14
    const/16 v8, 0xfb

    .line 15
    .line 16
    const/4 v9, 0x2

    .line 17
    const/4 v10, 0x7

    .line 18
    const/4 v11, 0x1

    .line 19
    const/4 v12, 0x6

    .line 20
    packed-switch v1, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    const-string p1, "invalid state"

    .line 24
    .line 25
    invoke-static {p1}, Lnb1;->b(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw v5

    .line 29
    :pswitch_0
    const-string p1, "extra data"

    .line 30
    .line 31
    invoke-static {p1}, Lnb1;->b(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v5

    .line 35
    :pswitch_1
    if-ne v0, v11, :cond_0

    .line 36
    .line 37
    iget v1, p1, Ltn0;->h:I

    .line 38
    .line 39
    iget v2, p0, Lnb1;->c:I

    .line 40
    .line 41
    if-eq v1, v2, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    iget-object v1, p0, Lnb1;->d:Lvq2;

    .line 45
    .line 46
    invoke-virtual {v1, p1}, Lvq2;->l(Ltn0;)V

    .line 47
    .line 48
    .line 49
    if-ne v0, v12, :cond_1

    .line 50
    .line 51
    iput v10, p0, Lnb1;->h:I

    .line 52
    .line 53
    :cond_1
    :goto_0
    return-void

    .line 54
    :pswitch_2
    if-ne v0, v12, :cond_4

    .line 55
    .line 56
    move-object v0, p1

    .line 57
    check-cast v0, Lrr0;

    .line 58
    .line 59
    iget-wide v0, v0, Lrr0;->m:J

    .line 60
    .line 61
    iget-wide v2, p0, Lnb1;->i:J

    .line 62
    .line 63
    cmp-long v2, v0, v2

    .line 64
    .line 65
    if-nez v2, :cond_2

    .line 66
    .line 67
    iput v10, p0, Lnb1;->h:I

    .line 68
    .line 69
    return-void

    .line 70
    :cond_2
    iget-wide v2, p0, Lnb1;->j:J

    .line 71
    .line 72
    cmp-long v2, v0, v2

    .line 73
    .line 74
    if-nez v2, :cond_3

    .line 75
    .line 76
    iput v9, p0, Lnb1;->h:I

    .line 77
    .line 78
    invoke-virtual {p0, p1}, Lnb1;->d(Ltn0;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    const-string v2, "IXFR out of sync: expected serial "

    .line 85
    .line 86
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    iget-wide v2, p0, Lnb1;->j:J

    .line 90
    .line 91
    invoke-virtual {p1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v2, " , got "

    .line 95
    .line 96
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-static {p1}, Lnb1;->b(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw v5

    .line 110
    :cond_4
    iget-object v0, p0, Lnb1;->d:Lvq2;

    .line 111
    .line 112
    invoke-virtual {v0, p1}, Lvq2;->l(Ltn0;)V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :pswitch_3
    iget-object v0, p0, Lnb1;->d:Lvq2;

    .line 117
    .line 118
    iget-object v0, v0, Lvq2;->h:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v0, Ljava/util/ArrayList;

    .line 121
    .line 122
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    sub-int/2addr v1, v11

    .line 127
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    check-cast v0, Lmb1;

    .line 132
    .line 133
    iget-object v0, v0, Lmb1;->a:Ljava/util/ArrayList;

    .line 134
    .line 135
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    check-cast p1, Lrr0;

    .line 139
    .line 140
    const/4 p1, 0x5

    .line 141
    iput p1, p0, Lnb1;->h:I

    .line 142
    .line 143
    return-void

    .line 144
    :pswitch_4
    if-ne v0, v12, :cond_5

    .line 145
    .line 146
    move-object v0, p1

    .line 147
    check-cast v0, Lrr0;

    .line 148
    .line 149
    iget-wide v0, v0, Lrr0;->m:J

    .line 150
    .line 151
    iput-wide v0, p0, Lnb1;->j:J

    .line 152
    .line 153
    const/4 v0, 0x4

    .line 154
    iput v0, p0, Lnb1;->h:I

    .line 155
    .line 156
    invoke-virtual {p0, p1}, Lnb1;->d(Ltn0;)V

    .line 157
    .line 158
    .line 159
    return-void

    .line 160
    :cond_5
    iget-object v0, p0, Lnb1;->d:Lvq2;

    .line 161
    .line 162
    invoke-virtual {v0, p1}, Lvq2;->l(Ltn0;)V

    .line 163
    .line 164
    .line 165
    return-void

    .line 166
    :pswitch_5
    iget-object v0, p0, Lnb1;->d:Lvq2;

    .line 167
    .line 168
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    new-instance v1, Lmb1;

    .line 172
    .line 173
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 174
    .line 175
    .line 176
    new-instance v2, Ljava/util/ArrayList;

    .line 177
    .line 178
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 179
    .line 180
    .line 181
    iput-object v2, v1, Lmb1;->a:Ljava/util/ArrayList;

    .line 182
    .line 183
    new-instance v2, Ljava/util/ArrayList;

    .line 184
    .line 185
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 186
    .line 187
    .line 188
    iput-object v2, v1, Lmb1;->b:Ljava/util/ArrayList;

    .line 189
    .line 190
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    check-cast p1, Lrr0;

    .line 194
    .line 195
    iget-object p1, v0, Lvq2;->h:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast p1, Ljava/util/ArrayList;

    .line 198
    .line 199
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    const/4 p1, 0x3

    .line 203
    iput p1, p0, Lnb1;->h:I

    .line 204
    .line 205
    return-void

    .line 206
    :pswitch_6
    iget v1, p0, Lnb1;->b:I

    .line 207
    .line 208
    if-ne v1, v8, :cond_6

    .line 209
    .line 210
    if-ne v0, v12, :cond_6

    .line 211
    .line 212
    move-object v0, p1

    .line 213
    check-cast v0, Lrr0;

    .line 214
    .line 215
    iget-wide v0, v0, Lrr0;->m:J

    .line 216
    .line 217
    cmp-long v0, v0, v6

    .line 218
    .line 219
    if-nez v0, :cond_6

    .line 220
    .line 221
    iget-object v0, p0, Lnb1;->d:Lvq2;

    .line 222
    .line 223
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    new-instance v1, Ljava/util/ArrayList;

    .line 227
    .line 228
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 229
    .line 230
    .line 231
    iput-object v1, v0, Lvq2;->h:Ljava/lang/Object;

    .line 232
    .line 233
    const-string v0, "got incremental response"

    .line 234
    .line 235
    invoke-interface {v4, v3, v2, v0}, Li80;->f(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    iput v9, p0, Lnb1;->h:I

    .line 239
    .line 240
    goto :goto_1

    .line 241
    :cond_6
    iget-object v0, p0, Lnb1;->d:Lvq2;

    .line 242
    .line 243
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    new-instance v1, Ljava/util/ArrayList;

    .line 247
    .line 248
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 249
    .line 250
    .line 251
    iput-object v1, v0, Lvq2;->g:Ljava/lang/Object;

    .line 252
    .line 253
    iget-object v0, p0, Lnb1;->d:Lvq2;

    .line 254
    .line 255
    iget-object v1, p0, Lnb1;->k:Ltn0;

    .line 256
    .line 257
    invoke-virtual {v0, v1}, Lvq2;->l(Ltn0;)V

    .line 258
    .line 259
    .line 260
    const-string v0, "got nonincremental response"

    .line 261
    .line 262
    invoke-interface {v4, v3, v2, v0}, Li80;->f(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    iput v12, p0, Lnb1;->h:I

    .line 266
    .line 267
    :goto_1
    invoke-virtual {p0, p1}, Lnb1;->d(Ltn0;)V

    .line 268
    .line 269
    .line 270
    return-void

    .line 271
    :pswitch_7
    if-ne v0, v12, :cond_a

    .line 272
    .line 273
    iput-object p1, p0, Lnb1;->k:Ltn0;

    .line 274
    .line 275
    check-cast p1, Lrr0;

    .line 276
    .line 277
    iget-wide v0, p1, Lrr0;->m:J

    .line 278
    .line 279
    iput-wide v0, p0, Lnb1;->i:J

    .line 280
    .line 281
    iget p1, p0, Lnb1;->b:I

    .line 282
    .line 283
    if-ne p1, v8, :cond_9

    .line 284
    .line 285
    cmp-long p1, v0, v6

    .line 286
    .line 287
    if-ltz p1, :cond_8

    .line 288
    .line 289
    const-wide v5, 0xffffffffL

    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    cmp-long p1, v0, v5

    .line 295
    .line 296
    if-gtz p1, :cond_8

    .line 297
    .line 298
    cmp-long p1, v0, v5

    .line 299
    .line 300
    if-ltz p1, :cond_7

    .line 301
    .line 302
    const-wide v5, 0x100000000L

    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    sub-long/2addr v0, v5

    .line 308
    :cond_7
    long-to-int p1, v0

    .line 309
    if-gtz p1, :cond_9

    .line 310
    .line 311
    const-string p1, "up to date"

    .line 312
    .line 313
    invoke-interface {v4, v3, v2, p1}, Li80;->f(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    iput v10, p0, Lnb1;->h:I

    .line 317
    .line 318
    return-void

    .line 319
    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 320
    .line 321
    new-instance v2, Ljava/lang/StringBuilder;

    .line 322
    .line 323
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 327
    .line 328
    .line 329
    const-string v0, " out of range"

    .line 330
    .line 331
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    throw p1

    .line 342
    :cond_9
    iput v11, p0, Lnb1;->h:I

    .line 343
    .line 344
    return-void

    .line 345
    :cond_a
    const-string p1, "missing initial SOA"

    .line 346
    .line 347
    invoke-static {p1}, Lnb1;->b(Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    throw v5

    .line 351
    :pswitch_data_0
    .packed-switch 0x0
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
