.class public final Lcm1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lgm1;


# static fields
.field public static final x:[B


# instance fields
.field public final a:Z

.field public final b:Llg1;

.field public final c:Lkz2;

.field public final d:Ljava/lang/String;

.field public final e:I

.field public final f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:Ljg1;

.field public i:Ljg1;

.field public j:I

.field public k:I

.field public l:I

.field public m:Z

.field public n:Z

.field public o:I

.field public p:I

.field public q:I

.field public r:Z

.field public s:J

.field public t:I

.field public u:J

.field public v:Ljg1;

.field public w:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcm1;->x:[B

    .line 8
    .line 9
    return-void

    .line 10
    nop

    .line 11
    :array_0
    .array-data 1
        0x49t
        0x44t
        0x33t
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Z)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Llg1;

    .line 5
    .line 6
    const/4 v1, 0x7

    .line 7
    new-array v2, v1, [B

    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Llg1;-><init>(I[B)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcm1;->b:Llg1;

    .line 13
    .line 14
    new-instance v0, Lkz2;

    .line 15
    .line 16
    sget-object v1, Lcm1;->x:[B

    .line 17
    .line 18
    const/16 v2, 0xa

    .line 19
    .line 20
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-direct {v0, v1}, Lkz2;-><init>([B)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lcm1;->c:Lkz2;

    .line 28
    .line 29
    const/4 v0, -0x1

    .line 30
    iput v0, p0, Lcm1;->o:I

    .line 31
    .line 32
    iput v0, p0, Lcm1;->p:I

    .line 33
    .line 34
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    iput-wide v0, p0, Lcm1;->s:J

    .line 40
    .line 41
    iput-wide v0, p0, Lcm1;->u:J

    .line 42
    .line 43
    iput-boolean p4, p0, Lcm1;->a:Z

    .line 44
    .line 45
    iput-object p1, p0, Lcm1;->d:Ljava/lang/String;

    .line 46
    .line 47
    iput p2, p0, Lcm1;->e:I

    .line 48
    .line 49
    iput-object p3, p0, Lcm1;->f:Ljava/lang/String;

    .line 50
    .line 51
    const/4 p1, 0x0

    .line 52
    iput p1, p0, Lcm1;->j:I

    .line 53
    .line 54
    iput p1, p0, Lcm1;->k:I

    .line 55
    .line 56
    const/16 p1, 0x100

    .line 57
    .line 58
    iput p1, p0, Lcm1;->l:I

    .line 59
    .line 60
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    iput-wide v0, p0, Lcm1;->u:J

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lcm1;->n:Z

    .line 10
    .line 11
    iput v0, p0, Lcm1;->j:I

    .line 12
    .line 13
    iput v0, p0, Lcm1;->k:I

    .line 14
    .line 15
    const/16 v0, 0x100

    .line 16
    .line 17
    iput v0, p0, Lcm1;->l:I

    .line 18
    .line 19
    return-void
.end method

.method public final b(Lkz2;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lcm1;->h:Ljg1;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object v2, Lv23;->a:Ljava/lang/String;

    .line 11
    .line 12
    :cond_0
    :goto_0
    invoke-virtual {v1}, Lkz2;->B()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-lez v2, :cond_21

    .line 17
    .line 18
    iget v2, v0, Lcm1;->j:I

    .line 19
    .line 20
    const/16 v3, 0x100

    .line 21
    .line 22
    iget-object v4, v0, Lcm1;->c:Lkz2;

    .line 23
    .line 24
    const/16 v5, 0xd

    .line 25
    .line 26
    iget-object v6, v0, Lcm1;->b:Llg1;

    .line 27
    .line 28
    const/4 v7, 0x7

    .line 29
    const/4 v8, 0x4

    .line 30
    const/4 v9, 0x3

    .line 31
    const/4 v10, -0x1

    .line 32
    const/4 v11, 0x2

    .line 33
    const/4 v12, 0x0

    .line 34
    const/4 v13, 0x1

    .line 35
    if-eqz v2, :cond_b

    .line 36
    .line 37
    if-eq v2, v13, :cond_8

    .line 38
    .line 39
    const/16 v10, 0xa

    .line 40
    .line 41
    if-eq v2, v11, :cond_7

    .line 42
    .line 43
    if-eq v2, v9, :cond_2

    .line 44
    .line 45
    invoke-virtual {v1}, Lkz2;->B()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    iget v4, v0, Lcm1;->t:I

    .line 50
    .line 51
    iget v5, v0, Lcm1;->k:I

    .line 52
    .line 53
    sub-int/2addr v4, v5

    .line 54
    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    iget-object v4, v0, Lcm1;->v:Ljg1;

    .line 59
    .line 60
    invoke-interface {v4, v1, v2, v12}, Ljg1;->a(Lkz2;II)V

    .line 61
    .line 62
    .line 63
    iget v4, v0, Lcm1;->k:I

    .line 64
    .line 65
    add-int/2addr v4, v2

    .line 66
    iput v4, v0, Lcm1;->k:I

    .line 67
    .line 68
    iget v2, v0, Lcm1;->t:I

    .line 69
    .line 70
    if-ne v4, v2, :cond_0

    .line 71
    .line 72
    iget-wide v4, v0, Lcm1;->u:J

    .line 73
    .line 74
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    cmp-long v2, v4, v6

    .line 80
    .line 81
    if-eqz v2, :cond_1

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_1
    move v13, v12

    .line 85
    :goto_1
    invoke-static {v13}, Lzt0;->b0(Z)V

    .line 86
    .line 87
    .line 88
    iget-object v4, v0, Lcm1;->v:Ljg1;

    .line 89
    .line 90
    iget-wide v5, v0, Lcm1;->u:J

    .line 91
    .line 92
    iget v8, v0, Lcm1;->t:I

    .line 93
    .line 94
    const/4 v9, 0x0

    .line 95
    const/4 v10, 0x0

    .line 96
    const/4 v7, 0x1

    .line 97
    invoke-interface/range {v4 .. v10}, Ljg1;->c(JIIILig1;)V

    .line 98
    .line 99
    .line 100
    iget-wide v4, v0, Lcm1;->u:J

    .line 101
    .line 102
    iget-wide v6, v0, Lcm1;->w:J

    .line 103
    .line 104
    add-long/2addr v4, v6

    .line 105
    iput-wide v4, v0, Lcm1;->u:J

    .line 106
    .line 107
    iput v12, v0, Lcm1;->j:I

    .line 108
    .line 109
    iput v12, v0, Lcm1;->k:I

    .line 110
    .line 111
    iput v3, v0, Lcm1;->l:I

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_2
    iget-boolean v2, v0, Lcm1;->m:Z

    .line 115
    .line 116
    const/4 v3, 0x5

    .line 117
    if-eq v13, v2, :cond_3

    .line 118
    .line 119
    move v2, v3

    .line 120
    goto :goto_2

    .line 121
    :cond_3
    move v2, v7

    .line 122
    :goto_2
    iget-object v4, v6, Llg1;->a:[B

    .line 123
    .line 124
    invoke-virtual {v1}, Lkz2;->B()I

    .line 125
    .line 126
    .line 127
    move-result v14

    .line 128
    iget v15, v0, Lcm1;->k:I

    .line 129
    .line 130
    sub-int v15, v2, v15

    .line 131
    .line 132
    invoke-static {v14, v15}, Ljava/lang/Math;->min(II)I

    .line 133
    .line 134
    .line 135
    move-result v14

    .line 136
    iget v15, v0, Lcm1;->k:I

    .line 137
    .line 138
    invoke-virtual {v1, v4, v15, v14}, Lkz2;->H([BII)V

    .line 139
    .line 140
    .line 141
    iget v4, v0, Lcm1;->k:I

    .line 142
    .line 143
    add-int/2addr v4, v14

    .line 144
    iput v4, v0, Lcm1;->k:I

    .line 145
    .line 146
    if-ne v4, v2, :cond_0

    .line 147
    .line 148
    invoke-virtual {v6, v12}, Llg1;->l(I)V

    .line 149
    .line 150
    .line 151
    iget-boolean v2, v0, Lcm1;->r:Z

    .line 152
    .line 153
    if-nez v2, :cond_5

    .line 154
    .line 155
    invoke-virtual {v6, v11}, Llg1;->r(I)I

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    add-int/2addr v2, v13

    .line 160
    if-eq v2, v11, :cond_4

    .line 161
    .line 162
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 167
    .line 168
    .line 169
    move-result v4

    .line 170
    new-instance v10, Ljava/lang/StringBuilder;

    .line 171
    .line 172
    add-int/lit8 v4, v4, 0x32

    .line 173
    .line 174
    invoke-direct {v10, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 175
    .line 176
    .line 177
    const-string v4, "Detected audio object type: "

    .line 178
    .line 179
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    const-string v2, ", but assuming AAC LC."

    .line 186
    .line 187
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    invoke-static {v2}, La30;->x(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    :cond_4
    invoke-virtual {v6, v3}, Llg1;->o(I)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v6, v9}, Llg1;->r(I)I

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    iget v3, v0, Lcm1;->p:I

    .line 205
    .line 206
    shr-int/lit8 v4, v3, 0x1

    .line 207
    .line 208
    and-int/2addr v4, v7

    .line 209
    or-int/lit8 v4, v4, 0x10

    .line 210
    .line 211
    int-to-byte v4, v4

    .line 212
    shl-int/2addr v3, v7

    .line 213
    shl-int/2addr v2, v9

    .line 214
    and-int/lit16 v3, v3, 0x80

    .line 215
    .line 216
    and-int/lit8 v2, v2, 0x78

    .line 217
    .line 218
    or-int/2addr v2, v3

    .line 219
    int-to-byte v2, v2

    .line 220
    new-array v3, v11, [B

    .line 221
    .line 222
    aput-byte v4, v3, v12

    .line 223
    .line 224
    aput-byte v2, v3, v13

    .line 225
    .line 226
    new-instance v2, Llg1;

    .line 227
    .line 228
    invoke-direct {v2, v11, v3}, Llg1;-><init>(I[B)V

    .line 229
    .line 230
    .line 231
    invoke-static {v2, v12}, Li30;->g0(Llg1;Z)Lqe1;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    new-instance v4, Lgg4;

    .line 236
    .line 237
    invoke-direct {v4}, Lgg4;-><init>()V

    .line 238
    .line 239
    .line 240
    iget-object v7, v0, Lcm1;->g:Ljava/lang/String;

    .line 241
    .line 242
    iput-object v7, v4, Lgg4;->a:Ljava/lang/String;

    .line 243
    .line 244
    iget-object v7, v0, Lcm1;->f:Ljava/lang/String;

    .line 245
    .line 246
    invoke-virtual {v4, v7}, Lgg4;->d(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    const-string v7, "audio/mp4a-latm"

    .line 250
    .line 251
    invoke-virtual {v4, v7}, Lgg4;->e(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    iget-object v7, v2, Lqe1;->a:Ljava/lang/String;

    .line 255
    .line 256
    iput-object v7, v4, Lgg4;->i:Ljava/lang/String;

    .line 257
    .line 258
    iget v7, v2, Lqe1;->c:I

    .line 259
    .line 260
    iput v7, v4, Lgg4;->D:I

    .line 261
    .line 262
    iget v2, v2, Lqe1;->b:I

    .line 263
    .line 264
    iput v2, v4, Lgg4;->E:I

    .line 265
    .line 266
    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    iput-object v2, v4, Lgg4;->o:Ljava/util/List;

    .line 271
    .line 272
    iget-object v2, v0, Lcm1;->d:Ljava/lang/String;

    .line 273
    .line 274
    iput-object v2, v4, Lgg4;->d:Ljava/lang/String;

    .line 275
    .line 276
    iget v2, v0, Lcm1;->e:I

    .line 277
    .line 278
    iput v2, v4, Lgg4;->f:I

    .line 279
    .line 280
    new-instance v2, Lph4;

    .line 281
    .line 282
    invoke-direct {v2, v4}, Lph4;-><init>(Lgg4;)V

    .line 283
    .line 284
    .line 285
    iget v3, v2, Lph4;->F:I

    .line 286
    .line 287
    int-to-long v3, v3

    .line 288
    const-wide/32 v9, 0x3d090000

    .line 289
    .line 290
    .line 291
    div-long/2addr v9, v3

    .line 292
    iput-wide v9, v0, Lcm1;->s:J

    .line 293
    .line 294
    iget-object v3, v0, Lcm1;->h:Ljg1;

    .line 295
    .line 296
    invoke-interface {v3, v2}, Ljg1;->d(Lph4;)V

    .line 297
    .line 298
    .line 299
    iput-boolean v13, v0, Lcm1;->r:Z

    .line 300
    .line 301
    goto :goto_3

    .line 302
    :cond_5
    invoke-virtual {v6, v10}, Llg1;->o(I)V

    .line 303
    .line 304
    .line 305
    :goto_3
    invoke-virtual {v6, v8}, Llg1;->o(I)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v6, v5}, Llg1;->r(I)I

    .line 309
    .line 310
    .line 311
    move-result v2

    .line 312
    add-int/lit8 v3, v2, -0x7

    .line 313
    .line 314
    iget-boolean v4, v0, Lcm1;->m:Z

    .line 315
    .line 316
    if-eqz v4, :cond_6

    .line 317
    .line 318
    add-int/lit8 v3, v2, -0x9

    .line 319
    .line 320
    :cond_6
    iget-object v2, v0, Lcm1;->h:Ljg1;

    .line 321
    .line 322
    iget-wide v4, v0, Lcm1;->s:J

    .line 323
    .line 324
    iput v8, v0, Lcm1;->j:I

    .line 325
    .line 326
    iput v12, v0, Lcm1;->k:I

    .line 327
    .line 328
    iput-object v2, v0, Lcm1;->v:Ljg1;

    .line 329
    .line 330
    iput-wide v4, v0, Lcm1;->w:J

    .line 331
    .line 332
    iput v3, v0, Lcm1;->t:I

    .line 333
    .line 334
    goto/16 :goto_0

    .line 335
    .line 336
    :cond_7
    iget-object v2, v4, Lkz2;->a:[B

    .line 337
    .line 338
    invoke-virtual {v1}, Lkz2;->B()I

    .line 339
    .line 340
    .line 341
    move-result v3

    .line 342
    iget v5, v0, Lcm1;->k:I

    .line 343
    .line 344
    rsub-int/lit8 v5, v5, 0xa

    .line 345
    .line 346
    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    .line 347
    .line 348
    .line 349
    move-result v3

    .line 350
    iget v5, v0, Lcm1;->k:I

    .line 351
    .line 352
    invoke-virtual {v1, v2, v5, v3}, Lkz2;->H([BII)V

    .line 353
    .line 354
    .line 355
    iget v2, v0, Lcm1;->k:I

    .line 356
    .line 357
    add-int/2addr v2, v3

    .line 358
    iput v2, v0, Lcm1;->k:I

    .line 359
    .line 360
    if-ne v2, v10, :cond_0

    .line 361
    .line 362
    iget-object v2, v0, Lcm1;->i:Ljg1;

    .line 363
    .line 364
    invoke-interface {v2, v4, v10, v12}, Ljg1;->a(Lkz2;II)V

    .line 365
    .line 366
    .line 367
    const/4 v2, 0x6

    .line 368
    invoke-virtual {v4, v2}, Lkz2;->E(I)V

    .line 369
    .line 370
    .line 371
    iget-object v2, v0, Lcm1;->i:Ljg1;

    .line 372
    .line 373
    invoke-virtual {v4}, Lkz2;->g()I

    .line 374
    .line 375
    .line 376
    move-result v3

    .line 377
    add-int/2addr v3, v10

    .line 378
    iput v8, v0, Lcm1;->j:I

    .line 379
    .line 380
    iput v10, v0, Lcm1;->k:I

    .line 381
    .line 382
    iput-object v2, v0, Lcm1;->v:Ljg1;

    .line 383
    .line 384
    const-wide/16 v4, 0x0

    .line 385
    .line 386
    iput-wide v4, v0, Lcm1;->w:J

    .line 387
    .line 388
    iput v3, v0, Lcm1;->t:I

    .line 389
    .line 390
    goto/16 :goto_0

    .line 391
    .line 392
    :cond_8
    invoke-virtual {v1}, Lkz2;->B()I

    .line 393
    .line 394
    .line 395
    move-result v2

    .line 396
    if-eqz v2, :cond_0

    .line 397
    .line 398
    iget-object v2, v6, Llg1;->a:[B

    .line 399
    .line 400
    iget-object v4, v1, Lkz2;->a:[B

    .line 401
    .line 402
    iget v5, v1, Lkz2;->b:I

    .line 403
    .line 404
    aget-byte v4, v4, v5

    .line 405
    .line 406
    aput-byte v4, v2, v12

    .line 407
    .line 408
    invoke-virtual {v6, v11}, Llg1;->l(I)V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v6, v8}, Llg1;->r(I)I

    .line 412
    .line 413
    .line 414
    move-result v2

    .line 415
    iget v4, v0, Lcm1;->p:I

    .line 416
    .line 417
    if-eq v4, v10, :cond_9

    .line 418
    .line 419
    if-eq v2, v4, :cond_9

    .line 420
    .line 421
    iput-boolean v12, v0, Lcm1;->n:Z

    .line 422
    .line 423
    iput v12, v0, Lcm1;->j:I

    .line 424
    .line 425
    iput v12, v0, Lcm1;->k:I

    .line 426
    .line 427
    iput v3, v0, Lcm1;->l:I

    .line 428
    .line 429
    goto/16 :goto_0

    .line 430
    .line 431
    :cond_9
    iget-boolean v3, v0, Lcm1;->n:Z

    .line 432
    .line 433
    if-nez v3, :cond_a

    .line 434
    .line 435
    iput-boolean v13, v0, Lcm1;->n:Z

    .line 436
    .line 437
    iget v3, v0, Lcm1;->q:I

    .line 438
    .line 439
    iput v3, v0, Lcm1;->o:I

    .line 440
    .line 441
    iput v2, v0, Lcm1;->p:I

    .line 442
    .line 443
    :cond_a
    iput v9, v0, Lcm1;->j:I

    .line 444
    .line 445
    iput v12, v0, Lcm1;->k:I

    .line 446
    .line 447
    goto/16 :goto_0

    .line 448
    .line 449
    :cond_b
    iget-object v2, v1, Lkz2;->a:[B

    .line 450
    .line 451
    iget v14, v1, Lkz2;->b:I

    .line 452
    .line 453
    iget v15, v1, Lkz2;->c:I

    .line 454
    .line 455
    :goto_4
    if-ge v14, v15, :cond_20

    .line 456
    .line 457
    add-int/lit8 v3, v14, 0x1

    .line 458
    .line 459
    move/from16 v16, v9

    .line 460
    .line 461
    aget-byte v9, v2, v14

    .line 462
    .line 463
    and-int/lit16 v7, v9, 0xff

    .line 464
    .line 465
    iget v5, v0, Lcm1;->l:I

    .line 466
    .line 467
    const/16 v11, 0x200

    .line 468
    .line 469
    if-ne v5, v11, :cond_1a

    .line 470
    .line 471
    int-to-byte v5, v7

    .line 472
    and-int/lit16 v5, v5, 0xff

    .line 473
    .line 474
    const v17, 0xff00

    .line 475
    .line 476
    .line 477
    or-int v5, v5, v17

    .line 478
    .line 479
    const v18, 0xfff6

    .line 480
    .line 481
    .line 482
    and-int v5, v5, v18

    .line 483
    .line 484
    const v11, 0xfff0

    .line 485
    .line 486
    .line 487
    if-ne v5, v11, :cond_1a

    .line 488
    .line 489
    iget-boolean v5, v0, Lcm1;->n:Z

    .line 490
    .line 491
    if-nez v5, :cond_f

    .line 492
    .line 493
    add-int/lit8 v5, v14, -0x1

    .line 494
    .line 495
    invoke-virtual {v1, v14}, Lkz2;->E(I)V

    .line 496
    .line 497
    .line 498
    iget-object v11, v6, Llg1;->a:[B

    .line 499
    .line 500
    invoke-virtual {v1}, Lkz2;->B()I

    .line 501
    .line 502
    .line 503
    move-result v10

    .line 504
    if-ge v10, v13, :cond_c

    .line 505
    .line 506
    move v5, v13

    .line 507
    :goto_5
    const/4 v12, -0x1

    .line 508
    goto/16 :goto_d

    .line 509
    .line 510
    :cond_c
    invoke-virtual {v1, v11, v12, v13}, Lkz2;->H([BII)V

    .line 511
    .line 512
    .line 513
    invoke-virtual {v6, v8}, Llg1;->l(I)V

    .line 514
    .line 515
    .line 516
    invoke-virtual {v6, v13}, Llg1;->r(I)I

    .line 517
    .line 518
    .line 519
    move-result v10

    .line 520
    iget v11, v0, Lcm1;->o:I

    .line 521
    .line 522
    const/4 v8, -0x1

    .line 523
    if-eq v11, v8, :cond_e

    .line 524
    .line 525
    if-ne v10, v11, :cond_d

    .line 526
    .line 527
    goto :goto_7

    .line 528
    :cond_d
    move v12, v8

    .line 529
    :goto_6
    move v5, v13

    .line 530
    goto/16 :goto_d

    .line 531
    .line 532
    :cond_e
    :goto_7
    iget v11, v0, Lcm1;->p:I

    .line 533
    .line 534
    if-eq v11, v8, :cond_12

    .line 535
    .line 536
    iget-object v8, v6, Llg1;->a:[B

    .line 537
    .line 538
    invoke-virtual {v1}, Lkz2;->B()I

    .line 539
    .line 540
    .line 541
    move-result v11

    .line 542
    if-ge v11, v13, :cond_10

    .line 543
    .line 544
    :cond_f
    move/from16 v19, v13

    .line 545
    .line 546
    goto/16 :goto_a

    .line 547
    .line 548
    :cond_10
    invoke-virtual {v1, v8, v12, v13}, Lkz2;->H([BII)V

    .line 549
    .line 550
    .line 551
    const/4 v8, 0x2

    .line 552
    invoke-virtual {v6, v8}, Llg1;->l(I)V

    .line 553
    .line 554
    .line 555
    const/4 v8, 0x4

    .line 556
    invoke-virtual {v6, v8}, Llg1;->r(I)I

    .line 557
    .line 558
    .line 559
    move-result v11

    .line 560
    move/from16 v19, v13

    .line 561
    .line 562
    iget v13, v0, Lcm1;->p:I

    .line 563
    .line 564
    if-ne v11, v13, :cond_11

    .line 565
    .line 566
    invoke-virtual {v1, v3}, Lkz2;->E(I)V

    .line 567
    .line 568
    .line 569
    goto :goto_8

    .line 570
    :cond_11
    move/from16 v5, v19

    .line 571
    .line 572
    goto :goto_5

    .line 573
    :cond_12
    move/from16 v19, v13

    .line 574
    .line 575
    const/4 v8, 0x4

    .line 576
    :goto_8
    iget-object v11, v6, Llg1;->a:[B

    .line 577
    .line 578
    invoke-virtual {v1}, Lkz2;->B()I

    .line 579
    .line 580
    .line 581
    move-result v13

    .line 582
    if-ge v13, v8, :cond_13

    .line 583
    .line 584
    goto :goto_a

    .line 585
    :cond_13
    invoke-virtual {v1, v11, v12, v8}, Lkz2;->H([BII)V

    .line 586
    .line 587
    .line 588
    const/16 v11, 0xe

    .line 589
    .line 590
    invoke-virtual {v6, v11}, Llg1;->l(I)V

    .line 591
    .line 592
    .line 593
    const/16 v11, 0xd

    .line 594
    .line 595
    invoke-virtual {v6, v11}, Llg1;->r(I)I

    .line 596
    .line 597
    .line 598
    move-result v13

    .line 599
    const/4 v8, 0x7

    .line 600
    if-lt v13, v8, :cond_16

    .line 601
    .line 602
    iget-object v8, v1, Lkz2;->a:[B

    .line 603
    .line 604
    iget v11, v1, Lkz2;->c:I

    .line 605
    .line 606
    add-int/2addr v5, v13

    .line 607
    if-ge v5, v11, :cond_17

    .line 608
    .line 609
    aget-byte v13, v8, v5

    .line 610
    .line 611
    const/4 v12, -0x1

    .line 612
    if-ne v13, v12, :cond_15

    .line 613
    .line 614
    add-int/lit8 v5, v5, 0x1

    .line 615
    .line 616
    if-eq v5, v11, :cond_17

    .line 617
    .line 618
    aget-byte v5, v8, v5

    .line 619
    .line 620
    and-int/lit16 v8, v5, 0xff

    .line 621
    .line 622
    or-int v8, v8, v17

    .line 623
    .line 624
    and-int v8, v8, v18

    .line 625
    .line 626
    const v11, 0xfff0

    .line 627
    .line 628
    .line 629
    if-ne v8, v11, :cond_14

    .line 630
    .line 631
    and-int/lit8 v5, v5, 0x8

    .line 632
    .line 633
    shr-int/lit8 v5, v5, 0x3

    .line 634
    .line 635
    if-ne v5, v10, :cond_14

    .line 636
    .line 637
    goto :goto_a

    .line 638
    :cond_14
    :goto_9
    move/from16 v5, v19

    .line 639
    .line 640
    goto :goto_d

    .line 641
    :cond_15
    const/16 v10, 0x49

    .line 642
    .line 643
    if-ne v13, v10, :cond_14

    .line 644
    .line 645
    add-int/lit8 v10, v5, 0x1

    .line 646
    .line 647
    if-eq v10, v11, :cond_17

    .line 648
    .line 649
    aget-byte v10, v8, v10

    .line 650
    .line 651
    const/16 v13, 0x44

    .line 652
    .line 653
    if-ne v10, v13, :cond_14

    .line 654
    .line 655
    add-int/lit8 v5, v5, 0x2

    .line 656
    .line 657
    if-eq v5, v11, :cond_17

    .line 658
    .line 659
    aget-byte v5, v8, v5

    .line 660
    .line 661
    const/16 v8, 0x33

    .line 662
    .line 663
    if-ne v5, v8, :cond_14

    .line 664
    .line 665
    goto :goto_a

    .line 666
    :cond_16
    const/4 v12, -0x1

    .line 667
    goto :goto_9

    .line 668
    :cond_17
    :goto_a
    and-int/lit8 v2, v9, 0x8

    .line 669
    .line 670
    shr-int/lit8 v2, v2, 0x3

    .line 671
    .line 672
    iput v2, v0, Lcm1;->q:I

    .line 673
    .line 674
    and-int/lit8 v2, v9, 0x1

    .line 675
    .line 676
    xor-int/lit8 v2, v2, 0x1

    .line 677
    .line 678
    move/from16 v5, v19

    .line 679
    .line 680
    if-eq v5, v2, :cond_18

    .line 681
    .line 682
    const/4 v2, 0x0

    .line 683
    goto :goto_b

    .line 684
    :cond_18
    move v2, v5

    .line 685
    :goto_b
    iput-boolean v2, v0, Lcm1;->m:Z

    .line 686
    .line 687
    iget-boolean v2, v0, Lcm1;->n:Z

    .line 688
    .line 689
    if-nez v2, :cond_19

    .line 690
    .line 691
    iput v5, v0, Lcm1;->j:I

    .line 692
    .line 693
    const/4 v2, 0x0

    .line 694
    iput v2, v0, Lcm1;->k:I

    .line 695
    .line 696
    goto :goto_c

    .line 697
    :cond_19
    move/from16 v4, v16

    .line 698
    .line 699
    const/4 v2, 0x0

    .line 700
    iput v4, v0, Lcm1;->j:I

    .line 701
    .line 702
    iput v2, v0, Lcm1;->k:I

    .line 703
    .line 704
    :goto_c
    invoke-virtual {v1, v3}, Lkz2;->E(I)V

    .line 705
    .line 706
    .line 707
    goto/16 :goto_0

    .line 708
    .line 709
    :cond_1a
    move v12, v10

    .line 710
    goto/16 :goto_6

    .line 711
    .line 712
    :goto_d
    iget v8, v0, Lcm1;->l:I

    .line 713
    .line 714
    or-int/2addr v7, v8

    .line 715
    const/16 v9, 0x149

    .line 716
    .line 717
    if-eq v7, v9, :cond_1f

    .line 718
    .line 719
    const/16 v9, 0x1ff

    .line 720
    .line 721
    if-eq v7, v9, :cond_1e

    .line 722
    .line 723
    const/16 v9, 0x344

    .line 724
    .line 725
    if-eq v7, v9, :cond_1d

    .line 726
    .line 727
    const/16 v9, 0x433

    .line 728
    .line 729
    if-eq v7, v9, :cond_1c

    .line 730
    .line 731
    const/16 v7, 0x100

    .line 732
    .line 733
    if-eq v8, v7, :cond_1b

    .line 734
    .line 735
    iput v7, v0, Lcm1;->l:I

    .line 736
    .line 737
    move v13, v5

    .line 738
    move v3, v7

    .line 739
    move v10, v12

    .line 740
    const/16 v5, 0xd

    .line 741
    .line 742
    const/4 v7, 0x7

    .line 743
    const/4 v8, 0x4

    .line 744
    const/4 v9, 0x3

    .line 745
    const/4 v11, 0x2

    .line 746
    const/4 v12, 0x0

    .line 747
    goto/16 :goto_4

    .line 748
    .line 749
    :cond_1b
    const/4 v8, 0x2

    .line 750
    const/4 v9, 0x3

    .line 751
    const/4 v10, 0x0

    .line 752
    goto :goto_f

    .line 753
    :cond_1c
    const/4 v8, 0x2

    .line 754
    iput v8, v0, Lcm1;->j:I

    .line 755
    .line 756
    const/4 v9, 0x3

    .line 757
    iput v9, v0, Lcm1;->k:I

    .line 758
    .line 759
    const/4 v10, 0x0

    .line 760
    iput v10, v0, Lcm1;->t:I

    .line 761
    .line 762
    invoke-virtual {v4, v10}, Lkz2;->E(I)V

    .line 763
    .line 764
    .line 765
    invoke-virtual {v1, v3}, Lkz2;->E(I)V

    .line 766
    .line 767
    .line 768
    goto/16 :goto_0

    .line 769
    .line 770
    :cond_1d
    const/16 v7, 0x100

    .line 771
    .line 772
    const/4 v8, 0x2

    .line 773
    const/4 v9, 0x3

    .line 774
    const/4 v10, 0x0

    .line 775
    const/16 v11, 0x400

    .line 776
    .line 777
    :goto_e
    iput v11, v0, Lcm1;->l:I

    .line 778
    .line 779
    goto :goto_f

    .line 780
    :cond_1e
    const/16 v7, 0x100

    .line 781
    .line 782
    const/4 v8, 0x2

    .line 783
    const/4 v9, 0x3

    .line 784
    const/4 v10, 0x0

    .line 785
    const/16 v11, 0x200

    .line 786
    .line 787
    goto :goto_e

    .line 788
    :cond_1f
    const/16 v7, 0x100

    .line 789
    .line 790
    const/4 v8, 0x2

    .line 791
    const/4 v9, 0x3

    .line 792
    const/4 v10, 0x0

    .line 793
    const/16 v11, 0x300

    .line 794
    .line 795
    goto :goto_e

    .line 796
    :goto_f
    move v11, v12

    .line 797
    move v12, v10

    .line 798
    move v10, v11

    .line 799
    move v14, v3

    .line 800
    move v13, v5

    .line 801
    move v3, v7

    .line 802
    move v11, v8

    .line 803
    const/16 v5, 0xd

    .line 804
    .line 805
    const/4 v7, 0x7

    .line 806
    const/4 v8, 0x4

    .line 807
    goto/16 :goto_4

    .line 808
    .line 809
    :cond_20
    invoke-virtual {v1, v14}, Lkz2;->E(I)V

    .line 810
    .line 811
    .line 812
    goto/16 :goto_0

    .line 813
    .line 814
    :cond_21
    return-void
.end method

.method public final c(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final d(IJ)V
    .locals 0

    .line 1
    iput-wide p2, p0, Lcm1;->u:J

    .line 2
    .line 3
    return-void
.end method

.method public final e(Lnf1;Lin1;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lin1;->a()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Lin1;->b()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p2, Lin1;->e:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v0, p0, Lcm1;->g:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p2}, Lin1;->b()V

    .line 12
    .line 13
    .line 14
    iget v0, p2, Lin1;->d:I

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-interface {p1, v0, v1}, Lnf1;->z(II)Ljg1;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lcm1;->h:Ljg1;

    .line 22
    .line 23
    iput-object v0, p0, Lcm1;->v:Ljg1;

    .line 24
    .line 25
    iget-boolean v0, p0, Lcm1;->a:Z

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p2}, Lin1;->a()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2}, Lin1;->b()V

    .line 33
    .line 34
    .line 35
    iget v0, p2, Lin1;->d:I

    .line 36
    .line 37
    const/4 v1, 0x5

    .line 38
    invoke-interface {p1, v0, v1}, Lnf1;->z(II)Ljg1;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iput-object p1, p0, Lcm1;->i:Ljg1;

    .line 43
    .line 44
    new-instance v0, Lgg4;

    .line 45
    .line 46
    invoke-direct {v0}, Lgg4;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2}, Lin1;->b()V

    .line 50
    .line 51
    .line 52
    iget-object p2, p2, Lin1;->e:Ljava/lang/String;

    .line 53
    .line 54
    iput-object p2, v0, Lgg4;->a:Ljava/lang/String;

    .line 55
    .line 56
    iget-object p2, p0, Lcm1;->f:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v0, p2}, Lgg4;->d(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const-string p2, "application/id3"

    .line 62
    .line 63
    invoke-virtual {v0, p2}, Lgg4;->e(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    new-instance p2, Lph4;

    .line 67
    .line 68
    invoke-direct {p2, v0}, Lph4;-><init>(Lgg4;)V

    .line 69
    .line 70
    .line 71
    invoke-interface {p1, p2}, Ljg1;->d(Lph4;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_0
    new-instance p1, Lgf1;

    .line 76
    .line 77
    invoke-direct {p1}, Lgf1;-><init>()V

    .line 78
    .line 79
    .line 80
    iput-object p1, p0, Lcm1;->i:Ljg1;

    .line 81
    .line 82
    return-void
.end method
