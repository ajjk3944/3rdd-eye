.class public final Lvm1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lgm1;


# instance fields
.field public final a:Lkz2;

.field public final b:Llg1;

.field public final c:Lkz2;

.field public d:I

.field public e:Ljava/lang/String;

.field public f:Ljg1;

.field public g:D

.field public h:D

.field public i:Z

.field public j:Z

.field public k:I

.field public l:I

.field public m:Z

.field public n:I

.field public o:I

.field public final p:Lxi1;

.field public q:I

.field public r:I

.field public s:I

.field public t:J

.field public u:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lvm1;->d:I

    .line 6
    .line 7
    new-instance v0, Lkz2;

    .line 8
    .line 9
    const/16 v1, 0xf

    .line 10
    .line 11
    new-array v1, v1, [B

    .line 12
    .line 13
    const/4 v2, 0x2

    .line 14
    invoke-direct {v0, v2, v1}, Lkz2;-><init>(I[B)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lvm1;->a:Lkz2;

    .line 18
    .line 19
    new-instance v0, Llg1;

    .line 20
    .line 21
    invoke-direct {v0}, Llg1;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lvm1;->b:Llg1;

    .line 25
    .line 26
    new-instance v0, Lkz2;

    .line 27
    .line 28
    invoke-direct {v0}, Lkz2;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lvm1;->c:Lkz2;

    .line 32
    .line 33
    new-instance v0, Lxi1;

    .line 34
    .line 35
    invoke-direct {v0}, Lxi1;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Lvm1;->p:Lxi1;

    .line 39
    .line 40
    const v0, -0x7fffffff

    .line 41
    .line 42
    .line 43
    iput v0, p0, Lvm1;->q:I

    .line 44
    .line 45
    const/4 v0, -0x1

    .line 46
    iput v0, p0, Lvm1;->r:I

    .line 47
    .line 48
    const-wide/16 v0, -0x1

    .line 49
    .line 50
    iput-wide v0, p0, Lvm1;->t:J

    .line 51
    .line 52
    const/4 v0, 0x1

    .line 53
    iput-boolean v0, p0, Lvm1;->j:Z

    .line 54
    .line 55
    iput-boolean v0, p0, Lvm1;->m:Z

    .line 56
    .line 57
    const-wide/high16 v0, -0x3c20000000000000L    # -9.223372036854776E18

    .line 58
    .line 59
    iput-wide v0, p0, Lvm1;->g:D

    .line 60
    .line 61
    iput-wide v0, p0, Lvm1;->h:D

    .line 62
    .line 63
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lvm1;->d:I

    .line 3
    .line 4
    iput v0, p0, Lvm1;->l:I

    .line 5
    .line 6
    iget-object v1, p0, Lvm1;->a:Lkz2;

    .line 7
    .line 8
    const/4 v2, 0x2

    .line 9
    invoke-virtual {v1, v2}, Lkz2;->y(I)V

    .line 10
    .line 11
    .line 12
    iput v0, p0, Lvm1;->n:I

    .line 13
    .line 14
    iput v0, p0, Lvm1;->o:I

    .line 15
    .line 16
    const v1, -0x7fffffff

    .line 17
    .line 18
    .line 19
    iput v1, p0, Lvm1;->q:I

    .line 20
    .line 21
    const/4 v1, -0x1

    .line 22
    iput v1, p0, Lvm1;->r:I

    .line 23
    .line 24
    iput v0, p0, Lvm1;->s:I

    .line 25
    .line 26
    const-wide/16 v1, -0x1

    .line 27
    .line 28
    iput-wide v1, p0, Lvm1;->t:J

    .line 29
    .line 30
    iput-boolean v0, p0, Lvm1;->u:Z

    .line 31
    .line 32
    iput-boolean v0, p0, Lvm1;->i:Z

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    iput-boolean v0, p0, Lvm1;->m:Z

    .line 36
    .line 37
    iput-boolean v0, p0, Lvm1;->j:Z

    .line 38
    .line 39
    const-wide/high16 v0, -0x3c20000000000000L    # -9.223372036854776E18

    .line 40
    .line 41
    iput-wide v0, p0, Lvm1;->g:D

    .line 42
    .line 43
    iput-wide v0, p0, Lvm1;->h:D

    .line 44
    .line 45
    return-void
.end method

.method public final b(Lkz2;)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lvm1;->f:Ljg1;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    :cond_0
    :goto_0
    invoke-virtual {v1}, Lkz2;->B()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-lez v2, :cond_41

    .line 15
    .line 16
    iget v2, v0, Lvm1;->d:I

    .line 17
    .line 18
    const/16 v3, 0x8

    .line 19
    .line 20
    const/4 v4, 0x1

    .line 21
    const/4 v5, 0x0

    .line 22
    if-eqz v2, :cond_3d

    .line 23
    .line 24
    const/16 v6, 0x18

    .line 25
    .line 26
    const/4 v7, 0x3

    .line 27
    iget-object v9, v0, Lvm1;->p:Lxi1;

    .line 28
    .line 29
    const/16 v11, 0x11

    .line 30
    .line 31
    iget-object v12, v0, Lvm1;->c:Lkz2;

    .line 32
    .line 33
    const/4 v14, 0x2

    .line 34
    if-eq v2, v4, :cond_2e

    .line 35
    .line 36
    iget v2, v9, Lxi1;->g:I

    .line 37
    .line 38
    if-eq v2, v4, :cond_2

    .line 39
    .line 40
    if-ne v2, v11, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const/16 v16, 0x20

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    :goto_1
    iget v2, v1, Lkz2;->b:I

    .line 47
    .line 48
    invoke-virtual {v1}, Lkz2;->B()I

    .line 49
    .line 50
    .line 51
    move-result v15

    .line 52
    invoke-virtual {v12}, Lkz2;->B()I

    .line 53
    .line 54
    .line 55
    move-result v13

    .line 56
    invoke-static {v15, v13}, Ljava/lang/Math;->min(II)I

    .line 57
    .line 58
    .line 59
    move-result v13

    .line 60
    iget-object v15, v12, Lkz2;->a:[B

    .line 61
    .line 62
    const/16 v16, 0x20

    .line 63
    .line 64
    iget v8, v12, Lkz2;->b:I

    .line 65
    .line 66
    invoke-virtual {v1, v15, v8, v13}, Lkz2;->H([BII)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v12, v13}, Lkz2;->G(I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, v2}, Lkz2;->E(I)V

    .line 73
    .line 74
    .line 75
    :goto_2
    invoke-virtual {v1}, Lkz2;->B()I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    iget v8, v9, Lxi1;->i:I

    .line 80
    .line 81
    iget v13, v0, Lvm1;->n:I

    .line 82
    .line 83
    sub-int/2addr v8, v13

    .line 84
    invoke-static {v2, v8}, Ljava/lang/Math;->min(II)I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    iget-object v8, v0, Lvm1;->f:Ljg1;

    .line 89
    .line 90
    invoke-interface {v8, v1, v2, v5}, Ljg1;->a(Lkz2;II)V

    .line 91
    .line 92
    .line 93
    iget v8, v0, Lvm1;->n:I

    .line 94
    .line 95
    add-int/2addr v8, v2

    .line 96
    iput v8, v0, Lvm1;->n:I

    .line 97
    .line 98
    iget v2, v9, Lxi1;->i:I

    .line 99
    .line 100
    if-ne v8, v2, :cond_0

    .line 101
    .line 102
    iget v2, v9, Lxi1;->g:I

    .line 103
    .line 104
    if-ne v2, v4, :cond_28

    .line 105
    .line 106
    new-instance v2, Llg1;

    .line 107
    .line 108
    iget-object v11, v12, Lkz2;->a:[B

    .line 109
    .line 110
    array-length v12, v11

    .line 111
    invoke-direct {v2, v12, v11}, Llg1;-><init>(I[B)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2, v3}, Llg1;->r(I)I

    .line 115
    .line 116
    .line 117
    move-result v11

    .line 118
    const/4 v12, 0x5

    .line 119
    invoke-virtual {v2, v12}, Llg1;->r(I)I

    .line 120
    .line 121
    .line 122
    move-result v13

    .line 123
    const/16 v15, 0x1f

    .line 124
    .line 125
    if-ne v13, v15, :cond_3

    .line 126
    .line 127
    invoke-virtual {v2, v6}, Llg1;->r(I)I

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    goto/16 :goto_3

    .line 132
    .line 133
    :cond_3
    packed-switch v13, :pswitch_data_0

    .line 134
    .line 135
    .line 136
    :pswitch_0
    invoke-static {v13}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    new-instance v2, Ljava/lang/StringBuilder;

    .line 145
    .line 146
    add-int/lit8 v1, v1, 0x20

    .line 147
    .line 148
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 149
    .line 150
    .line 151
    const-string v1, "Unsupported sampling rate index "

    .line 152
    .line 153
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-static {v1}, Llq1;->b(Ljava/lang/String;)Llq1;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    throw v1

    .line 168
    :pswitch_1
    const/16 v6, 0x2580

    .line 169
    .line 170
    goto/16 :goto_3

    .line 171
    .line 172
    :pswitch_2
    const/16 v6, 0x3200

    .line 173
    .line 174
    goto/16 :goto_3

    .line 175
    .line 176
    :pswitch_3
    const/16 v6, 0x3840

    .line 177
    .line 178
    goto :goto_3

    .line 179
    :pswitch_4
    const/16 v6, 0x42b3

    .line 180
    .line 181
    goto :goto_3

    .line 182
    :pswitch_5
    const/16 v6, 0x4b00

    .line 183
    .line 184
    goto :goto_3

    .line 185
    :pswitch_6
    const/16 v6, 0x4e20

    .line 186
    .line 187
    goto :goto_3

    .line 188
    :pswitch_7
    const/16 v6, 0x6400

    .line 189
    .line 190
    goto :goto_3

    .line 191
    :pswitch_8
    const/16 v6, 0x7080

    .line 192
    .line 193
    goto :goto_3

    .line 194
    :pswitch_9
    const v6, 0x8566

    .line 195
    .line 196
    .line 197
    goto :goto_3

    .line 198
    :pswitch_a
    const v6, 0x9600

    .line 199
    .line 200
    .line 201
    goto :goto_3

    .line 202
    :pswitch_b
    const v6, 0x9c40

    .line 203
    .line 204
    .line 205
    goto :goto_3

    .line 206
    :pswitch_c
    const v6, 0xc800

    .line 207
    .line 208
    .line 209
    goto :goto_3

    .line 210
    :pswitch_d
    const v6, 0xe100

    .line 211
    .line 212
    .line 213
    goto :goto_3

    .line 214
    :pswitch_e
    const/16 v6, 0x1cb6

    .line 215
    .line 216
    goto :goto_3

    .line 217
    :pswitch_f
    const/16 v6, 0x1f40

    .line 218
    .line 219
    goto :goto_3

    .line 220
    :pswitch_10
    const/16 v6, 0x2b11

    .line 221
    .line 222
    goto :goto_3

    .line 223
    :pswitch_11
    const/16 v6, 0x2ee0

    .line 224
    .line 225
    goto :goto_3

    .line 226
    :pswitch_12
    const/16 v6, 0x3e80

    .line 227
    .line 228
    goto :goto_3

    .line 229
    :pswitch_13
    const/16 v6, 0x5622

    .line 230
    .line 231
    goto :goto_3

    .line 232
    :pswitch_14
    const/16 v6, 0x5dc0

    .line 233
    .line 234
    goto :goto_3

    .line 235
    :pswitch_15
    const/16 v6, 0x7d00

    .line 236
    .line 237
    goto :goto_3

    .line 238
    :pswitch_16
    const v6, 0xac44

    .line 239
    .line 240
    .line 241
    goto :goto_3

    .line 242
    :pswitch_17
    const v6, 0xbb80

    .line 243
    .line 244
    .line 245
    goto :goto_3

    .line 246
    :pswitch_18
    const v6, 0xfa00

    .line 247
    .line 248
    .line 249
    goto :goto_3

    .line 250
    :pswitch_19
    const v6, 0x15888

    .line 251
    .line 252
    .line 253
    goto :goto_3

    .line 254
    :pswitch_1a
    const v6, 0x17700

    .line 255
    .line 256
    .line 257
    :goto_3
    invoke-virtual {v2, v7}, Llg1;->r(I)I

    .line 258
    .line 259
    .line 260
    move-result v13

    .line 261
    const/4 v15, 0x4

    .line 262
    const-string v10, "Unsupported coreSbrFrameLengthIndex "

    .line 263
    .line 264
    const/16 v8, 0x24

    .line 265
    .line 266
    if-eqz v13, :cond_7

    .line 267
    .line 268
    if-eq v13, v4, :cond_6

    .line 269
    .line 270
    if-eq v13, v14, :cond_5

    .line 271
    .line 272
    if-eq v13, v7, :cond_5

    .line 273
    .line 274
    if-ne v13, v15, :cond_4

    .line 275
    .line 276
    const/16 v16, 0x1000

    .line 277
    .line 278
    :goto_4
    move/from16 v18, v16

    .line 279
    .line 280
    goto :goto_5

    .line 281
    :cond_4
    invoke-static {v13, v8}, Lga1;->f(II)I

    .line 282
    .line 283
    .line 284
    move-result v1

    .line 285
    new-instance v2, Ljava/lang/StringBuilder;

    .line 286
    .line 287
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    invoke-static {v1}, Llq1;->b(Ljava/lang/String;)Llq1;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    throw v1

    .line 305
    :cond_5
    const/16 v16, 0x800

    .line 306
    .line 307
    goto :goto_4

    .line 308
    :cond_6
    const/16 v16, 0x400

    .line 309
    .line 310
    goto :goto_4

    .line 311
    :cond_7
    const/16 v16, 0x300

    .line 312
    .line 313
    goto :goto_4

    .line 314
    :goto_5
    if-eqz v13, :cond_b

    .line 315
    .line 316
    if-eq v13, v4, :cond_b

    .line 317
    .line 318
    if-eq v13, v14, :cond_a

    .line 319
    .line 320
    if-eq v13, v7, :cond_9

    .line 321
    .line 322
    if-ne v13, v15, :cond_8

    .line 323
    .line 324
    move v8, v4

    .line 325
    goto :goto_6

    .line 326
    :cond_8
    invoke-static {v13, v8}, Lga1;->f(II)I

    .line 327
    .line 328
    .line 329
    move-result v1

    .line 330
    new-instance v2, Ljava/lang/StringBuilder;

    .line 331
    .line 332
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v1

    .line 345
    invoke-static {v1}, Llq1;->b(Ljava/lang/String;)Llq1;

    .line 346
    .line 347
    .line 348
    move-result-object v1

    .line 349
    throw v1

    .line 350
    :cond_9
    move v8, v7

    .line 351
    goto :goto_6

    .line 352
    :cond_a
    move v8, v14

    .line 353
    goto :goto_6

    .line 354
    :cond_b
    move v8, v5

    .line 355
    :goto_6
    invoke-virtual {v2, v14}, Llg1;->o(I)V

    .line 356
    .line 357
    .line 358
    invoke-static {v2}, Lob1;->D(Llg1;)V

    .line 359
    .line 360
    .line 361
    invoke-virtual {v2, v12}, Llg1;->r(I)I

    .line 362
    .line 363
    .line 364
    move-result v10

    .line 365
    move v13, v5

    .line 366
    move/from16 v16, v13

    .line 367
    .line 368
    :goto_7
    add-int/lit8 v5, v10, 0x1

    .line 369
    .line 370
    move/from16 v19, v4

    .line 371
    .line 372
    const/16 v4, 0x10

    .line 373
    .line 374
    if-ge v13, v5, :cond_e

    .line 375
    .line 376
    invoke-virtual {v2, v7}, Llg1;->r(I)I

    .line 377
    .line 378
    .line 379
    move-result v5

    .line 380
    invoke-static {v2, v12, v3, v4}, Lob1;->J(Llg1;III)I

    .line 381
    .line 382
    .line 383
    move-result v4

    .line 384
    add-int/lit8 v4, v4, 0x1

    .line 385
    .line 386
    add-int v16, v4, v16

    .line 387
    .line 388
    if-eqz v5, :cond_c

    .line 389
    .line 390
    if-ne v5, v14, :cond_d

    .line 391
    .line 392
    :cond_c
    invoke-virtual {v2}, Llg1;->q()Z

    .line 393
    .line 394
    .line 395
    move-result v4

    .line 396
    if-eqz v4, :cond_d

    .line 397
    .line 398
    invoke-static {v2}, Lob1;->D(Llg1;)V

    .line 399
    .line 400
    .line 401
    :cond_d
    add-int/lit8 v13, v13, 0x1

    .line 402
    .line 403
    move/from16 v4, v19

    .line 404
    .line 405
    goto :goto_7

    .line 406
    :cond_e
    invoke-static {v2, v15, v3, v4}, Lob1;->J(Llg1;III)I

    .line 407
    .line 408
    .line 409
    move-result v5

    .line 410
    add-int/lit8 v5, v5, 0x1

    .line 411
    .line 412
    invoke-virtual {v2}, Llg1;->m()V

    .line 413
    .line 414
    .line 415
    const/4 v10, 0x0

    .line 416
    :goto_8
    const-wide/high16 v20, 0x4000000000000000L    # 2.0

    .line 417
    .line 418
    if-ge v10, v5, :cond_20

    .line 419
    .line 420
    invoke-virtual {v2, v14}, Llg1;->r(I)I

    .line 421
    .line 422
    .line 423
    move-result v13

    .line 424
    if-eqz v13, :cond_1d

    .line 425
    .line 426
    move/from16 v12, v19

    .line 427
    .line 428
    if-eq v13, v12, :cond_12

    .line 429
    .line 430
    if-eq v13, v7, :cond_10

    .line 431
    .line 432
    :cond_f
    :goto_9
    const/4 v15, 0x5

    .line 433
    goto/16 :goto_c

    .line 434
    .line 435
    :cond_10
    invoke-static {v2, v15, v3, v4}, Lob1;->J(Llg1;III)I

    .line 436
    .line 437
    .line 438
    invoke-static {v2, v15, v3, v4}, Lob1;->J(Llg1;III)I

    .line 439
    .line 440
    .line 441
    move-result v12

    .line 442
    invoke-virtual {v2}, Llg1;->q()Z

    .line 443
    .line 444
    .line 445
    move-result v13

    .line 446
    if-eqz v13, :cond_11

    .line 447
    .line 448
    const/4 v13, 0x0

    .line 449
    invoke-static {v2, v3, v4, v13}, Lob1;->J(Llg1;III)I

    .line 450
    .line 451
    .line 452
    :cond_11
    invoke-virtual {v2}, Llg1;->m()V

    .line 453
    .line 454
    .line 455
    if-lez v12, :cond_f

    .line 456
    .line 457
    mul-int/lit8 v12, v12, 0x8

    .line 458
    .line 459
    invoke-virtual {v2, v12}, Llg1;->o(I)V

    .line 460
    .line 461
    .line 462
    goto :goto_9

    .line 463
    :cond_12
    invoke-virtual {v2, v7}, Llg1;->o(I)V

    .line 464
    .line 465
    .line 466
    invoke-virtual {v2}, Llg1;->q()Z

    .line 467
    .line 468
    .line 469
    move-result v12

    .line 470
    if-eqz v12, :cond_13

    .line 471
    .line 472
    const/16 v13, 0xd

    .line 473
    .line 474
    invoke-virtual {v2, v13}, Llg1;->o(I)V

    .line 475
    .line 476
    .line 477
    :cond_13
    if-eqz v12, :cond_14

    .line 478
    .line 479
    invoke-virtual {v2}, Llg1;->m()V

    .line 480
    .line 481
    .line 482
    :cond_14
    if-lez v8, :cond_15

    .line 483
    .line 484
    invoke-static {v2}, Lob1;->I(Llg1;)V

    .line 485
    .line 486
    .line 487
    invoke-virtual {v2, v14}, Llg1;->r(I)I

    .line 488
    .line 489
    .line 490
    move-result v12

    .line 491
    move v13, v8

    .line 492
    goto :goto_a

    .line 493
    :cond_15
    const/4 v12, 0x0

    .line 494
    const/4 v13, 0x0

    .line 495
    :goto_a
    if-lez v12, :cond_19

    .line 496
    .line 497
    const/4 v4, 0x6

    .line 498
    invoke-virtual {v2, v4}, Llg1;->o(I)V

    .line 499
    .line 500
    .line 501
    invoke-virtual {v2, v14}, Llg1;->r(I)I

    .line 502
    .line 503
    .line 504
    move-result v3

    .line 505
    invoke-virtual {v2, v15}, Llg1;->o(I)V

    .line 506
    .line 507
    .line 508
    invoke-virtual {v2}, Llg1;->q()Z

    .line 509
    .line 510
    .line 511
    move-result v23

    .line 512
    const/4 v15, 0x5

    .line 513
    if-eqz v23, :cond_16

    .line 514
    .line 515
    invoke-virtual {v2, v15}, Llg1;->o(I)V

    .line 516
    .line 517
    .line 518
    :cond_16
    if-eq v12, v14, :cond_17

    .line 519
    .line 520
    if-ne v12, v7, :cond_18

    .line 521
    .line 522
    :cond_17
    invoke-virtual {v2, v4}, Llg1;->o(I)V

    .line 523
    .line 524
    .line 525
    :cond_18
    if-ne v3, v14, :cond_1a

    .line 526
    .line 527
    invoke-virtual {v2}, Llg1;->m()V

    .line 528
    .line 529
    .line 530
    goto :goto_b

    .line 531
    :cond_19
    const/4 v15, 0x5

    .line 532
    :cond_1a
    :goto_b
    add-int/lit8 v3, v16, -0x1

    .line 533
    .line 534
    int-to-double v3, v3

    .line 535
    invoke-static {v3, v4}, Ljava/lang/Math;->log(D)D

    .line 536
    .line 537
    .line 538
    move-result-wide v3

    .line 539
    invoke-static/range {v20 .. v21}, Ljava/lang/Math;->log(D)D

    .line 540
    .line 541
    .line 542
    move-result-wide v20

    .line 543
    div-double v3, v3, v20

    .line 544
    .line 545
    invoke-static {v3, v4}, Ljava/lang/Math;->floor(D)D

    .line 546
    .line 547
    .line 548
    move-result-wide v3

    .line 549
    double-to-int v3, v3

    .line 550
    const/16 v19, 0x1

    .line 551
    .line 552
    add-int/lit8 v3, v3, 0x1

    .line 553
    .line 554
    invoke-virtual {v2, v14}, Llg1;->r(I)I

    .line 555
    .line 556
    .line 557
    move-result v4

    .line 558
    if-lez v4, :cond_1b

    .line 559
    .line 560
    invoke-virtual {v2}, Llg1;->q()Z

    .line 561
    .line 562
    .line 563
    move-result v12

    .line 564
    if-eqz v12, :cond_1b

    .line 565
    .line 566
    invoke-virtual {v2, v3}, Llg1;->o(I)V

    .line 567
    .line 568
    .line 569
    :cond_1b
    invoke-virtual {v2}, Llg1;->q()Z

    .line 570
    .line 571
    .line 572
    move-result v12

    .line 573
    if-eqz v12, :cond_1c

    .line 574
    .line 575
    invoke-virtual {v2, v3}, Llg1;->o(I)V

    .line 576
    .line 577
    .line 578
    :cond_1c
    if-nez v13, :cond_1f

    .line 579
    .line 580
    if-nez v4, :cond_1f

    .line 581
    .line 582
    invoke-virtual {v2}, Llg1;->m()V

    .line 583
    .line 584
    .line 585
    goto :goto_c

    .line 586
    :cond_1d
    move v15, v12

    .line 587
    invoke-virtual {v2, v7}, Llg1;->o(I)V

    .line 588
    .line 589
    .line 590
    invoke-virtual {v2}, Llg1;->q()Z

    .line 591
    .line 592
    .line 593
    move-result v3

    .line 594
    if-eqz v3, :cond_1e

    .line 595
    .line 596
    const/16 v13, 0xd

    .line 597
    .line 598
    invoke-virtual {v2, v13}, Llg1;->o(I)V

    .line 599
    .line 600
    .line 601
    :cond_1e
    if-lez v8, :cond_1f

    .line 602
    .line 603
    invoke-static {v2}, Lob1;->I(Llg1;)V

    .line 604
    .line 605
    .line 606
    :cond_1f
    :goto_c
    add-int/lit8 v10, v10, 0x1

    .line 607
    .line 608
    move v12, v15

    .line 609
    const/16 v3, 0x8

    .line 610
    .line 611
    const/16 v4, 0x10

    .line 612
    .line 613
    const/4 v15, 0x4

    .line 614
    const/16 v19, 0x1

    .line 615
    .line 616
    goto/16 :goto_8

    .line 617
    .line 618
    :cond_20
    invoke-virtual {v2}, Llg1;->q()Z

    .line 619
    .line 620
    .line 621
    move-result v3

    .line 622
    if-eqz v3, :cond_23

    .line 623
    .line 624
    const/4 v3, 0x4

    .line 625
    const/16 v4, 0x8

    .line 626
    .line 627
    invoke-static {v2, v14, v3, v4}, Lob1;->J(Llg1;III)I

    .line 628
    .line 629
    .line 630
    move-result v5

    .line 631
    const/16 v19, 0x1

    .line 632
    .line 633
    add-int/lit8 v5, v5, 0x1

    .line 634
    .line 635
    const/4 v7, 0x0

    .line 636
    const/4 v8, 0x0

    .line 637
    :goto_d
    if-ge v7, v5, :cond_24

    .line 638
    .line 639
    const/16 v10, 0x10

    .line 640
    .line 641
    invoke-static {v2, v3, v4, v10}, Lob1;->J(Llg1;III)I

    .line 642
    .line 643
    .line 644
    move-result v12

    .line 645
    invoke-static {v2, v3, v4, v10}, Lob1;->J(Llg1;III)I

    .line 646
    .line 647
    .line 648
    move-result v13

    .line 649
    const/4 v14, 0x7

    .line 650
    if-ne v12, v14, :cond_22

    .line 651
    .line 652
    invoke-virtual {v2, v3}, Llg1;->r(I)I

    .line 653
    .line 654
    .line 655
    move-result v8

    .line 656
    add-int/lit8 v8, v8, 0x1

    .line 657
    .line 658
    invoke-virtual {v2, v3}, Llg1;->o(I)V

    .line 659
    .line 660
    .line 661
    new-array v12, v8, [B

    .line 662
    .line 663
    const/4 v13, 0x0

    .line 664
    :goto_e
    if-ge v13, v8, :cond_21

    .line 665
    .line 666
    invoke-virtual {v2, v4}, Llg1;->r(I)I

    .line 667
    .line 668
    .line 669
    move-result v14

    .line 670
    int-to-byte v14, v14

    .line 671
    aput-byte v14, v12, v13

    .line 672
    .line 673
    add-int/lit8 v13, v13, 0x1

    .line 674
    .line 675
    goto :goto_e

    .line 676
    :cond_21
    move-object v8, v12

    .line 677
    goto :goto_f

    .line 678
    :cond_22
    mul-int/2addr v13, v4

    .line 679
    invoke-virtual {v2, v13}, Llg1;->o(I)V

    .line 680
    .line 681
    .line 682
    :goto_f
    add-int/lit8 v7, v7, 0x1

    .line 683
    .line 684
    const/16 v4, 0x8

    .line 685
    .line 686
    const/16 v19, 0x1

    .line 687
    .line 688
    goto :goto_d

    .line 689
    :cond_23
    const/4 v8, 0x0

    .line 690
    :cond_24
    sparse-switch v6, :sswitch_data_0

    .line 691
    .line 692
    .line 693
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 694
    .line 695
    .line 696
    move-result-object v1

    .line 697
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 698
    .line 699
    .line 700
    move-result v1

    .line 701
    new-instance v2, Ljava/lang/StringBuilder;

    .line 702
    .line 703
    add-int/lit8 v1, v1, 0x1a

    .line 704
    .line 705
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 706
    .line 707
    .line 708
    const-string v1, "Unsupported sampling rate "

    .line 709
    .line 710
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 711
    .line 712
    .line 713
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 714
    .line 715
    .line 716
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 717
    .line 718
    .line 719
    move-result-object v1

    .line 720
    invoke-static {v1}, Llq1;->b(Ljava/lang/String;)Llq1;

    .line 721
    .line 722
    .line 723
    move-result-object v1

    .line 724
    throw v1

    .line 725
    :sswitch_0
    const-wide/high16 v20, 0x3ff0000000000000L    # 1.0

    .line 726
    .line 727
    goto :goto_10

    .line 728
    :sswitch_1
    const-wide/high16 v20, 0x3ff8000000000000L    # 1.5

    .line 729
    .line 730
    goto :goto_10

    .line 731
    :sswitch_2
    const-wide/high16 v20, 0x4008000000000000L    # 3.0

    .line 732
    .line 733
    :goto_10
    :sswitch_3
    int-to-double v2, v6

    .line 734
    move/from16 v4, v18

    .line 735
    .line 736
    int-to-double v4, v4

    .line 737
    mul-double v4, v4, v20

    .line 738
    .line 739
    mul-double v2, v2, v20

    .line 740
    .line 741
    double-to-int v2, v2

    .line 742
    double-to-int v3, v4

    .line 743
    iput v2, v0, Lvm1;->q:I

    .line 744
    .line 745
    iput v3, v0, Lvm1;->r:I

    .line 746
    .line 747
    iget-wide v2, v0, Lvm1;->t:J

    .line 748
    .line 749
    iget-wide v4, v9, Lxi1;->h:J

    .line 750
    .line 751
    cmp-long v2, v2, v4

    .line 752
    .line 753
    if-eqz v2, :cond_27

    .line 754
    .line 755
    iput-wide v4, v0, Lvm1;->t:J

    .line 756
    .line 757
    const-string v2, "mhm1"

    .line 758
    .line 759
    const/4 v3, -0x1

    .line 760
    if-eq v11, v3, :cond_25

    .line 761
    .line 762
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 763
    .line 764
    .line 765
    move-result-object v3

    .line 766
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 767
    .line 768
    .line 769
    move-result-object v3

    .line 770
    const-string v4, ".%02X"

    .line 771
    .line 772
    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 773
    .line 774
    .line 775
    move-result-object v3

    .line 776
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 777
    .line 778
    .line 779
    move-result-object v2

    .line 780
    :cond_25
    if-eqz v8, :cond_26

    .line 781
    .line 782
    array-length v3, v8

    .line 783
    if-lez v3, :cond_26

    .line 784
    .line 785
    sget-object v3, Lv23;->b:[B

    .line 786
    .line 787
    invoke-static {v3, v8}, Lxm3;->j(Ljava/lang/Object;Ljava/lang/Object;)Lsn3;

    .line 788
    .line 789
    .line 790
    move-result-object v13

    .line 791
    goto :goto_11

    .line 792
    :cond_26
    const/4 v13, 0x0

    .line 793
    :goto_11
    new-instance v3, Lgg4;

    .line 794
    .line 795
    invoke-direct {v3}, Lgg4;-><init>()V

    .line 796
    .line 797
    .line 798
    iget-object v4, v0, Lvm1;->e:Ljava/lang/String;

    .line 799
    .line 800
    iput-object v4, v3, Lgg4;->a:Ljava/lang/String;

    .line 801
    .line 802
    const-string v4, "video/mp2t"

    .line 803
    .line 804
    invoke-virtual {v3, v4}, Lgg4;->d(Ljava/lang/String;)V

    .line 805
    .line 806
    .line 807
    const-string v4, "audio/mhm1"

    .line 808
    .line 809
    invoke-virtual {v3, v4}, Lgg4;->e(Ljava/lang/String;)V

    .line 810
    .line 811
    .line 812
    iget v4, v0, Lvm1;->q:I

    .line 813
    .line 814
    iput v4, v3, Lgg4;->E:I

    .line 815
    .line 816
    iput-object v2, v3, Lgg4;->i:Ljava/lang/String;

    .line 817
    .line 818
    iput-object v13, v3, Lgg4;->o:Ljava/util/List;

    .line 819
    .line 820
    new-instance v2, Lph4;

    .line 821
    .line 822
    invoke-direct {v2, v3}, Lph4;-><init>(Lgg4;)V

    .line 823
    .line 824
    .line 825
    iget-object v3, v0, Lvm1;->f:Ljg1;

    .line 826
    .line 827
    invoke-interface {v3, v2}, Ljg1;->d(Lph4;)V

    .line 828
    .line 829
    .line 830
    :cond_27
    const/4 v12, 0x1

    .line 831
    iput-boolean v12, v0, Lvm1;->u:Z

    .line 832
    .line 833
    goto :goto_16

    .line 834
    :cond_28
    if-ne v2, v11, :cond_2b

    .line 835
    .line 836
    new-instance v2, Llg1;

    .line 837
    .line 838
    iget-object v3, v12, Lkz2;->a:[B

    .line 839
    .line 840
    array-length v4, v3

    .line 841
    invoke-direct {v2, v4, v3}, Llg1;-><init>(I[B)V

    .line 842
    .line 843
    .line 844
    invoke-virtual {v2}, Llg1;->q()Z

    .line 845
    .line 846
    .line 847
    move-result v3

    .line 848
    if-eqz v3, :cond_29

    .line 849
    .line 850
    invoke-virtual {v2, v14}, Llg1;->o(I)V

    .line 851
    .line 852
    .line 853
    const/16 v13, 0xd

    .line 854
    .line 855
    invoke-virtual {v2, v13}, Llg1;->r(I)I

    .line 856
    .line 857
    .line 858
    move-result v5

    .line 859
    goto :goto_12

    .line 860
    :cond_29
    const/4 v5, 0x0

    .line 861
    :goto_12
    iput v5, v0, Lvm1;->s:I

    .line 862
    .line 863
    :cond_2a
    :goto_13
    const/4 v12, 0x1

    .line 864
    goto :goto_16

    .line 865
    :cond_2b
    if-ne v2, v14, :cond_2a

    .line 866
    .line 867
    iget-boolean v2, v0, Lvm1;->u:Z

    .line 868
    .line 869
    if-eqz v2, :cond_2c

    .line 870
    .line 871
    const/4 v13, 0x0

    .line 872
    iput-boolean v13, v0, Lvm1;->j:Z

    .line 873
    .line 874
    const/4 v5, 0x1

    .line 875
    goto :goto_14

    .line 876
    :cond_2c
    const/4 v5, 0x0

    .line 877
    :goto_14
    iget v2, v0, Lvm1;->r:I

    .line 878
    .line 879
    iget v3, v0, Lvm1;->s:I

    .line 880
    .line 881
    sub-int/2addr v2, v3

    .line 882
    iget v3, v0, Lvm1;->q:I

    .line 883
    .line 884
    int-to-double v3, v3

    .line 885
    iget-wide v6, v0, Lvm1;->g:D

    .line 886
    .line 887
    invoke-static {v6, v7}, Ljava/lang/Math;->round(D)J

    .line 888
    .line 889
    .line 890
    move-result-wide v6

    .line 891
    iget-boolean v8, v0, Lvm1;->i:Z

    .line 892
    .line 893
    if-eqz v8, :cond_2d

    .line 894
    .line 895
    const/4 v13, 0x0

    .line 896
    iput-boolean v13, v0, Lvm1;->i:Z

    .line 897
    .line 898
    iget-wide v2, v0, Lvm1;->h:D

    .line 899
    .line 900
    iput-wide v2, v0, Lvm1;->g:D

    .line 901
    .line 902
    goto :goto_15

    .line 903
    :cond_2d
    int-to-double v8, v2

    .line 904
    const-wide v10, 0x412e848000000000L    # 1000000.0

    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    mul-double/2addr v8, v10

    .line 910
    div-double/2addr v8, v3

    .line 911
    iget-wide v2, v0, Lvm1;->g:D

    .line 912
    .line 913
    add-double/2addr v2, v8

    .line 914
    iput-wide v2, v0, Lvm1;->g:D

    .line 915
    .line 916
    :goto_15
    iget-object v2, v0, Lvm1;->f:Ljg1;

    .line 917
    .line 918
    move-wide v3, v6

    .line 919
    iget v6, v0, Lvm1;->o:I

    .line 920
    .line 921
    const/4 v7, 0x0

    .line 922
    const/4 v8, 0x0

    .line 923
    invoke-interface/range {v2 .. v8}, Ljg1;->c(JIIILig1;)V

    .line 924
    .line 925
    .line 926
    const/4 v13, 0x0

    .line 927
    iput-boolean v13, v0, Lvm1;->u:Z

    .line 928
    .line 929
    iput v13, v0, Lvm1;->s:I

    .line 930
    .line 931
    iput v13, v0, Lvm1;->o:I

    .line 932
    .line 933
    goto :goto_13

    .line 934
    :goto_16
    iput v12, v0, Lvm1;->d:I

    .line 935
    .line 936
    goto/16 :goto_0

    .line 937
    .line 938
    :cond_2e
    const/16 v16, 0x20

    .line 939
    .line 940
    invoke-virtual {v1}, Lkz2;->B()I

    .line 941
    .line 942
    .line 943
    move-result v2

    .line 944
    iget-object v3, v0, Lvm1;->a:Lkz2;

    .line 945
    .line 946
    invoke-virtual {v3}, Lkz2;->B()I

    .line 947
    .line 948
    .line 949
    move-result v4

    .line 950
    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    .line 951
    .line 952
    .line 953
    move-result v2

    .line 954
    iget-object v4, v3, Lkz2;->a:[B

    .line 955
    .line 956
    iget v5, v3, Lkz2;->b:I

    .line 957
    .line 958
    invoke-virtual {v1, v4, v5, v2}, Lkz2;->H([BII)V

    .line 959
    .line 960
    .line 961
    invoke-virtual {v3, v2}, Lkz2;->G(I)V

    .line 962
    .line 963
    .line 964
    invoke-virtual {v3}, Lkz2;->B()I

    .line 965
    .line 966
    .line 967
    move-result v2

    .line 968
    if-nez v2, :cond_3c

    .line 969
    .line 970
    iget v2, v3, Lkz2;->c:I

    .line 971
    .line 972
    iget-object v4, v3, Lkz2;->a:[B

    .line 973
    .line 974
    iget-object v5, v0, Lvm1;->b:Llg1;

    .line 975
    .line 976
    iput-object v4, v5, Llg1;->a:[B

    .line 977
    .line 978
    const/4 v13, 0x0

    .line 979
    iput v13, v5, Llg1;->b:I

    .line 980
    .line 981
    iput v13, v5, Llg1;->c:I

    .line 982
    .line 983
    iput v2, v5, Llg1;->d:I

    .line 984
    .line 985
    invoke-virtual {v5}, Llg1;->i()I

    .line 986
    .line 987
    .line 988
    const/16 v4, 0x8

    .line 989
    .line 990
    invoke-static {v5, v7, v4, v4}, Lob1;->J(Llg1;III)I

    .line 991
    .line 992
    .line 993
    move-result v7

    .line 994
    iput v7, v9, Lxi1;->g:I

    .line 995
    .line 996
    const/4 v8, -0x1

    .line 997
    if-eq v7, v8, :cond_3b

    .line 998
    .line 999
    invoke-static {v14, v4}, Ljava/lang/Math;->max(II)I

    .line 1000
    .line 1001
    .line 1002
    move-result v7

    .line 1003
    move/from16 v4, v16

    .line 1004
    .line 1005
    invoke-static {v7, v4}, Ljava/lang/Math;->max(II)I

    .line 1006
    .line 1007
    .line 1008
    move-result v7

    .line 1009
    const/16 v4, 0x3f

    .line 1010
    .line 1011
    if-gt v7, v4, :cond_2f

    .line 1012
    .line 1013
    const/4 v4, 0x1

    .line 1014
    goto :goto_17

    .line 1015
    :cond_2f
    const/4 v4, 0x0

    .line 1016
    :goto_17
    invoke-static {v4}, Lzt0;->D(Z)V

    .line 1017
    .line 1018
    .line 1019
    const-wide/16 v7, 0x3

    .line 1020
    .line 1021
    move-object v10, v12

    .line 1022
    const-wide/16 v11, 0xff

    .line 1023
    .line 1024
    move-object v13, v5

    .line 1025
    invoke-static {v7, v8, v11, v12}, Ljava/lang/Math;->addExact(JJ)J

    .line 1026
    .line 1027
    .line 1028
    move-result-wide v4

    .line 1029
    move-wide/from16 v17, v7

    .line 1030
    .line 1031
    const-wide v7, 0x100000000L

    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    invoke-static {v4, v5, v7, v8}, Ljava/lang/Math;->addExact(JJ)J

    .line 1037
    .line 1038
    .line 1039
    invoke-virtual {v13}, Llg1;->f()I

    .line 1040
    .line 1041
    .line 1042
    move-result v4

    .line 1043
    const-wide/16 v7, -0x1

    .line 1044
    .line 1045
    if-ge v4, v14, :cond_30

    .line 1046
    .line 1047
    :goto_18
    move-wide v4, v7

    .line 1048
    goto :goto_19

    .line 1049
    :cond_30
    invoke-virtual {v13, v14}, Llg1;->t(I)J

    .line 1050
    .line 1051
    .line 1052
    move-result-wide v4

    .line 1053
    cmp-long v20, v4, v17

    .line 1054
    .line 1055
    if-nez v20, :cond_34

    .line 1056
    .line 1057
    invoke-virtual {v13}, Llg1;->f()I

    .line 1058
    .line 1059
    .line 1060
    move-result v4

    .line 1061
    const/16 v5, 0x8

    .line 1062
    .line 1063
    if-ge v4, v5, :cond_31

    .line 1064
    .line 1065
    goto :goto_18

    .line 1066
    :cond_31
    invoke-virtual {v13, v5}, Llg1;->t(I)J

    .line 1067
    .line 1068
    .line 1069
    move-result-wide v4

    .line 1070
    add-long v17, v4, v17

    .line 1071
    .line 1072
    cmp-long v4, v4, v11

    .line 1073
    .line 1074
    if-nez v4, :cond_33

    .line 1075
    .line 1076
    invoke-virtual {v13}, Llg1;->f()I

    .line 1077
    .line 1078
    .line 1079
    move-result v4

    .line 1080
    const/16 v5, 0x20

    .line 1081
    .line 1082
    if-ge v4, v5, :cond_32

    .line 1083
    .line 1084
    goto :goto_18

    .line 1085
    :cond_32
    invoke-virtual {v13, v5}, Llg1;->t(I)J

    .line 1086
    .line 1087
    .line 1088
    move-result-wide v4

    .line 1089
    add-long v4, v4, v17

    .line 1090
    .line 1091
    goto :goto_19

    .line 1092
    :cond_33
    move-wide/from16 v4, v17

    .line 1093
    .line 1094
    :cond_34
    :goto_19
    iput-wide v4, v9, Lxi1;->h:J

    .line 1095
    .line 1096
    cmp-long v7, v4, v7

    .line 1097
    .line 1098
    if-nez v7, :cond_35

    .line 1099
    .line 1100
    goto/16 :goto_1b

    .line 1101
    .line 1102
    :cond_35
    const-wide/16 v7, 0x10

    .line 1103
    .line 1104
    cmp-long v7, v4, v7

    .line 1105
    .line 1106
    if-gtz v7, :cond_3a

    .line 1107
    .line 1108
    const-wide/16 v7, 0x0

    .line 1109
    .line 1110
    cmp-long v4, v4, v7

    .line 1111
    .line 1112
    if-nez v4, :cond_39

    .line 1113
    .line 1114
    iget v4, v9, Lxi1;->g:I

    .line 1115
    .line 1116
    const/4 v12, 0x1

    .line 1117
    if-eq v4, v12, :cond_38

    .line 1118
    .line 1119
    if-eq v4, v14, :cond_37

    .line 1120
    .line 1121
    const/16 v15, 0x11

    .line 1122
    .line 1123
    if-eq v4, v15, :cond_36

    .line 1124
    .line 1125
    goto :goto_1a

    .line 1126
    :cond_36
    const-string v1, "AudioTruncation packet with invalid packet label 0"

    .line 1127
    .line 1128
    const/4 v2, 0x0

    .line 1129
    invoke-static {v2, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 1130
    .line 1131
    .line 1132
    move-result-object v1

    .line 1133
    throw v1

    .line 1134
    :cond_37
    const/4 v2, 0x0

    .line 1135
    const-string v1, "Mpegh3daFrame packet with invalid packet label 0"

    .line 1136
    .line 1137
    invoke-static {v2, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v1

    .line 1141
    throw v1

    .line 1142
    :cond_38
    const/4 v2, 0x0

    .line 1143
    const-string v1, "Mpegh3daConfig packet with invalid packet label 0"

    .line 1144
    .line 1145
    invoke-static {v2, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v1

    .line 1149
    throw v1

    .line 1150
    :cond_39
    :goto_1a
    const/16 v4, 0xb

    .line 1151
    .line 1152
    invoke-static {v13, v4, v6, v6}, Lob1;->J(Llg1;III)I

    .line 1153
    .line 1154
    .line 1155
    move-result v4

    .line 1156
    iput v4, v9, Lxi1;->i:I

    .line 1157
    .line 1158
    const/4 v8, -0x1

    .line 1159
    if-eq v4, v8, :cond_3b

    .line 1160
    .line 1161
    const/4 v13, 0x0

    .line 1162
    iput v13, v0, Lvm1;->n:I

    .line 1163
    .line 1164
    iget v5, v0, Lvm1;->o:I

    .line 1165
    .line 1166
    add-int/2addr v4, v2

    .line 1167
    add-int/2addr v4, v5

    .line 1168
    iput v4, v0, Lvm1;->o:I

    .line 1169
    .line 1170
    invoke-virtual {v3, v13}, Lkz2;->E(I)V

    .line 1171
    .line 1172
    .line 1173
    iget-object v2, v0, Lvm1;->f:Ljg1;

    .line 1174
    .line 1175
    iget v4, v3, Lkz2;->c:I

    .line 1176
    .line 1177
    invoke-interface {v2, v3, v4, v13}, Ljg1;->a(Lkz2;II)V

    .line 1178
    .line 1179
    .line 1180
    invoke-virtual {v3, v14}, Lkz2;->y(I)V

    .line 1181
    .line 1182
    .line 1183
    iget v2, v9, Lxi1;->i:I

    .line 1184
    .line 1185
    invoke-virtual {v10, v2}, Lkz2;->y(I)V

    .line 1186
    .line 1187
    .line 1188
    const/4 v12, 0x1

    .line 1189
    iput-boolean v12, v0, Lvm1;->m:Z

    .line 1190
    .line 1191
    iput v14, v0, Lvm1;->d:I

    .line 1192
    .line 1193
    goto/16 :goto_0

    .line 1194
    .line 1195
    :cond_3a
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v1

    .line 1199
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1200
    .line 1201
    .line 1202
    move-result v1

    .line 1203
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1204
    .line 1205
    add-int/lit8 v1, v1, 0x31

    .line 1206
    .line 1207
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1208
    .line 1209
    .line 1210
    const-string v1, "Contains sub-stream with an invalid packet label "

    .line 1211
    .line 1212
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1213
    .line 1214
    .line 1215
    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1216
    .line 1217
    .line 1218
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1219
    .line 1220
    .line 1221
    move-result-object v1

    .line 1222
    invoke-static {v1}, Llq1;->b(Ljava/lang/String;)Llq1;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v1

    .line 1226
    throw v1

    .line 1227
    :cond_3b
    :goto_1b
    iget v2, v3, Lkz2;->c:I

    .line 1228
    .line 1229
    const/16 v4, 0xf

    .line 1230
    .line 1231
    if-ge v2, v4, :cond_0

    .line 1232
    .line 1233
    add-int/lit8 v2, v2, 0x1

    .line 1234
    .line 1235
    invoke-virtual {v3, v2}, Lkz2;->C(I)V

    .line 1236
    .line 1237
    .line 1238
    :cond_3c
    const/4 v13, 0x0

    .line 1239
    iput-boolean v13, v0, Lvm1;->m:Z

    .line 1240
    .line 1241
    goto/16 :goto_0

    .line 1242
    .line 1243
    :cond_3d
    iget v2, v0, Lvm1;->k:I

    .line 1244
    .line 1245
    and-int/lit8 v3, v2, 0x2

    .line 1246
    .line 1247
    if-nez v3, :cond_3e

    .line 1248
    .line 1249
    iget v2, v1, Lkz2;->c:I

    .line 1250
    .line 1251
    invoke-virtual {v1, v2}, Lkz2;->E(I)V

    .line 1252
    .line 1253
    .line 1254
    goto/16 :goto_0

    .line 1255
    .line 1256
    :cond_3e
    and-int/lit8 v2, v2, 0x4

    .line 1257
    .line 1258
    if-nez v2, :cond_40

    .line 1259
    .line 1260
    :cond_3f
    invoke-virtual {v1}, Lkz2;->B()I

    .line 1261
    .line 1262
    .line 1263
    move-result v2

    .line 1264
    if-lez v2, :cond_0

    .line 1265
    .line 1266
    iget v2, v0, Lvm1;->l:I

    .line 1267
    .line 1268
    const/16 v22, 0x8

    .line 1269
    .line 1270
    shl-int/lit8 v2, v2, 0x8

    .line 1271
    .line 1272
    iput v2, v0, Lvm1;->l:I

    .line 1273
    .line 1274
    invoke-virtual {v1}, Lkz2;->K()I

    .line 1275
    .line 1276
    .line 1277
    move-result v3

    .line 1278
    or-int/2addr v2, v3

    .line 1279
    iput v2, v0, Lvm1;->l:I

    .line 1280
    .line 1281
    const v3, 0xffffff

    .line 1282
    .line 1283
    .line 1284
    and-int/2addr v2, v3

    .line 1285
    const v3, 0xc001a5

    .line 1286
    .line 1287
    .line 1288
    if-ne v2, v3, :cond_3f

    .line 1289
    .line 1290
    iget v2, v1, Lkz2;->b:I

    .line 1291
    .line 1292
    add-int/lit8 v2, v2, -0x3

    .line 1293
    .line 1294
    invoke-virtual {v1, v2}, Lkz2;->E(I)V

    .line 1295
    .line 1296
    .line 1297
    const/4 v13, 0x0

    .line 1298
    iput v13, v0, Lvm1;->l:I

    .line 1299
    .line 1300
    :cond_40
    const/4 v12, 0x1

    .line 1301
    iput v12, v0, Lvm1;->d:I

    .line 1302
    .line 1303
    goto/16 :goto_0

    .line 1304
    .line 1305
    :cond_41
    return-void

    .line 1306
    nop

    .line 1307
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
        :pswitch_0
        :pswitch_0
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
    .end packed-switch

    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    :sswitch_data_0
    .sparse-switch
        0x396c -> :sswitch_2
        0x3e80 -> :sswitch_2
        0x5622 -> :sswitch_3
        0x5dc0 -> :sswitch_3
        0x72d8 -> :sswitch_1
        0x7d00 -> :sswitch_1
        0xac44 -> :sswitch_0
        0xbb80 -> :sswitch_0
        0xe5b0 -> :sswitch_1
        0xfa00 -> :sswitch_1
        0x15888 -> :sswitch_0
        0x17700 -> :sswitch_0
    .end sparse-switch
.end method

.method public final c(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final d(IJ)V
    .locals 2

    .line 1
    iput p1, p0, Lvm1;->k:I

    .line 2
    .line 3
    iget-boolean p1, p0, Lvm1;->j:Z

    .line 4
    .line 5
    if-nez p1, :cond_1

    .line 6
    .line 7
    iget p1, p0, Lvm1;->o:I

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    iget-boolean p1, p0, Lvm1;->m:Z

    .line 12
    .line 13
    if-nez p1, :cond_1

    .line 14
    .line 15
    :cond_0
    const/4 p1, 0x1

    .line 16
    iput-boolean p1, p0, Lvm1;->i:Z

    .line 17
    .line 18
    :cond_1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    cmp-long p1, p2, v0

    .line 24
    .line 25
    if-eqz p1, :cond_3

    .line 26
    .line 27
    iget-boolean p1, p0, Lvm1;->i:Z

    .line 28
    .line 29
    long-to-double p2, p2

    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    iput-wide p2, p0, Lvm1;->h:D

    .line 33
    .line 34
    return-void

    .line 35
    :cond_2
    iput-wide p2, p0, Lvm1;->g:D

    .line 36
    .line 37
    :cond_3
    return-void
.end method

.method public final e(Lnf1;Lin1;)V
    .locals 1

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
    iput-object v0, p0, Lvm1;->e:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p2}, Lin1;->b()V

    .line 12
    .line 13
    .line 14
    iget p2, p2, Lin1;->d:I

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    invoke-interface {p1, p2, v0}, Lnf1;->z(II)Ljg1;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lvm1;->f:Ljg1;

    .line 22
    .line 23
    return-void
.end method
