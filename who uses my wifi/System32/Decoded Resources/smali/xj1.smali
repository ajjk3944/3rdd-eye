.class public final Lxj1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Llf1;


# instance fields
.field public a:Lnf1;

.field public b:Lck1;

.field public c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget v0, Lum;->x:I

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public final a(Lmf1;)Z
    .locals 8

    .line 1
    new-instance v0, Lzj1;

    .line 2
    .line 3
    invoke-direct {v0}, Lzj1;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-virtual {v0, p1, v1}, Lzj1;->b(Lmf1;Z)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v2, :cond_3

    .line 13
    .line 14
    iget v2, v0, Lzj1;->a:I

    .line 15
    .line 16
    const/4 v4, 0x2

    .line 17
    and-int/2addr v2, v4

    .line 18
    if-eq v2, v4, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget v0, v0, Lzj1;->e:I

    .line 22
    .line 23
    const/16 v2, 0x8

    .line 24
    .line 25
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    new-instance v2, Lkz2;

    .line 30
    .line 31
    invoke-direct {v2, v0}, Lkz2;-><init>(I)V

    .line 32
    .line 33
    .line 34
    iget-object v4, v2, Lkz2;->a:[B

    .line 35
    .line 36
    invoke-interface {p1, v4, v3, v0}, Lmf1;->u([BII)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, v3}, Lkz2;->E(I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, Lkz2;->B()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    const/4 v0, 0x5

    .line 47
    if-lt p1, v0, :cond_1

    .line 48
    .line 49
    invoke-virtual {v2}, Lkz2;->K()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    const/16 v0, 0x7f

    .line 54
    .line 55
    if-ne p1, v0, :cond_1

    .line 56
    .line 57
    invoke-virtual {v2}, Lkz2;->P()J

    .line 58
    .line 59
    .line 60
    move-result-wide v4

    .line 61
    const-wide/32 v6, 0x464c4143

    .line 62
    .line 63
    .line 64
    cmp-long p1, v4, v6

    .line 65
    .line 66
    if-nez p1, :cond_1

    .line 67
    .line 68
    new-instance p1, Lwj1;

    .line 69
    .line 70
    invoke-direct {p1}, Lck1;-><init>()V

    .line 71
    .line 72
    .line 73
    iput-object p1, p0, Lxj1;->b:Lck1;

    .line 74
    .line 75
    return v1

    .line 76
    :cond_1
    invoke-virtual {v2, v3}, Lkz2;->E(I)V

    .line 77
    .line 78
    .line 79
    :try_start_0
    invoke-static {v1, v2, v1}, Lpu1;->F(ILkz2;Z)Z

    .line 80
    .line 81
    .line 82
    move-result p1
    :try_end_0
    .catch Llq1; {:try_start_0 .. :try_end_0} :catch_0

    .line 83
    if-eqz p1, :cond_2

    .line 84
    .line 85
    new-instance p1, Ldk1;

    .line 86
    .line 87
    invoke-direct {p1}, Lck1;-><init>()V

    .line 88
    .line 89
    .line 90
    iput-object p1, p0, Lxj1;->b:Lck1;

    .line 91
    .line 92
    return v1

    .line 93
    :catch_0
    :cond_2
    invoke-virtual {v2, v3}, Lkz2;->E(I)V

    .line 94
    .line 95
    .line 96
    sget-object p1, Lbk1;->o:[B

    .line 97
    .line 98
    invoke-static {v2, p1}, Lbk1;->e(Lkz2;[B)Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-eqz p1, :cond_3

    .line 103
    .line 104
    new-instance p1, Lbk1;

    .line 105
    .line 106
    invoke-direct {p1}, Lck1;-><init>()V

    .line 107
    .line 108
    .line 109
    iput-object p1, p0, Lxj1;->b:Lck1;

    .line 110
    .line 111
    return v1

    .line 112
    :cond_3
    :goto_0
    return v3
.end method

.method public final b(Lmf1;)Z
    .locals 0

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Lxj1;->a(Lmf1;)Z

    .line 2
    .line 3
    .line 4
    move-result p1
    :try_end_0
    .catch Llq1; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return p1

    .line 6
    :catch_0
    const/4 p1, 0x0

    .line 7
    return p1
.end method

.method public final c(Lmf1;Lpf1;)I
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lxj1;->a:Lnf1;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v2, v0, Lxj1;->b:Lck1;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    if-nez v2, :cond_1

    .line 14
    .line 15
    invoke-virtual/range {p0 .. p1}, Lxj1;->a(Lmf1;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    move-object v2, v1

    .line 22
    check-cast v2, Ldf1;

    .line 23
    .line 24
    iput v3, v2, Ldf1;->k:I

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const-string v1, "Failed to determine bitstream type"

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-static {v2, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    throw v1

    .line 35
    :cond_1
    :goto_0
    iget-boolean v2, v0, Lxj1;->c:Z

    .line 36
    .line 37
    const/4 v4, 0x1

    .line 38
    if-nez v2, :cond_2

    .line 39
    .line 40
    iget-object v2, v0, Lxj1;->a:Lnf1;

    .line 41
    .line 42
    invoke-interface {v2, v3, v4}, Lnf1;->z(II)Ljg1;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    iget-object v5, v0, Lxj1;->a:Lnf1;

    .line 47
    .line 48
    invoke-interface {v5}, Lnf1;->s()V

    .line 49
    .line 50
    .line 51
    iget-object v5, v0, Lxj1;->b:Lck1;

    .line 52
    .line 53
    iget-object v6, v0, Lxj1;->a:Lnf1;

    .line 54
    .line 55
    iput-object v6, v5, Lck1;->c:Lnf1;

    .line 56
    .line 57
    iput-object v2, v5, Lck1;->b:Ljg1;

    .line 58
    .line 59
    invoke-virtual {v5, v4}, Lck1;->a(Z)V

    .line 60
    .line 61
    .line 62
    iput-boolean v4, v0, Lxj1;->c:Z

    .line 63
    .line 64
    :cond_2
    iget-object v8, v0, Lxj1;->b:Lck1;

    .line 65
    .line 66
    iget-object v2, v8, Lck1;->a:Lyj1;

    .line 67
    .line 68
    iget-object v5, v8, Lck1;->b:Ljg1;

    .line 69
    .line 70
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    sget-object v5, Lv23;->a:Ljava/lang/String;

    .line 74
    .line 75
    iget v5, v8, Lck1;->h:I

    .line 76
    .line 77
    const/4 v6, 0x3

    .line 78
    const-wide/16 v9, -0x1

    .line 79
    .line 80
    const/4 v7, -0x1

    .line 81
    const/4 v11, 0x2

    .line 82
    if-eqz v5, :cond_b

    .line 83
    .line 84
    if-eq v5, v4, :cond_a

    .line 85
    .line 86
    if-eq v5, v11, :cond_3

    .line 87
    .line 88
    return v7

    .line 89
    :cond_3
    iget-object v5, v8, Lck1;->d:Lak1;

    .line 90
    .line 91
    invoke-interface {v5, v1}, Lak1;->b(Lmf1;)J

    .line 92
    .line 93
    .line 94
    move-result-wide v11

    .line 95
    const-wide/16 v13, 0x0

    .line 96
    .line 97
    cmp-long v5, v11, v13

    .line 98
    .line 99
    if-ltz v5, :cond_4

    .line 100
    .line 101
    move-object/from16 v5, p2

    .line 102
    .line 103
    iput-wide v11, v5, Lpf1;->a:J

    .line 104
    .line 105
    return v4

    .line 106
    :cond_4
    cmp-long v5, v11, v9

    .line 107
    .line 108
    if-gez v5, :cond_5

    .line 109
    .line 110
    const-wide/16 v15, 0x2

    .line 111
    .line 112
    add-long/2addr v11, v15

    .line 113
    neg-long v11, v11

    .line 114
    invoke-virtual {v8, v11, v12}, Lck1;->d(J)V

    .line 115
    .line 116
    .line 117
    :cond_5
    iget-boolean v5, v8, Lck1;->l:Z

    .line 118
    .line 119
    if-nez v5, :cond_6

    .line 120
    .line 121
    iget-object v5, v8, Lck1;->d:Lak1;

    .line 122
    .line 123
    invoke-interface {v5}, Lak1;->h()Lcg1;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    iget-object v11, v8, Lck1;->c:Lnf1;

    .line 131
    .line 132
    invoke-interface {v11, v5}, Lnf1;->v(Lcg1;)V

    .line 133
    .line 134
    .line 135
    invoke-interface {v5}, Lcg1;->a()J

    .line 136
    .line 137
    .line 138
    iput-boolean v4, v8, Lck1;->l:Z

    .line 139
    .line 140
    :cond_6
    iget-wide v4, v8, Lck1;->k:J

    .line 141
    .line 142
    cmp-long v4, v4, v13

    .line 143
    .line 144
    if-gtz v4, :cond_8

    .line 145
    .line 146
    invoke-virtual {v2, v1}, Lyj1;->a(Lmf1;)Z

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    if-eqz v1, :cond_7

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_7
    iput v6, v8, Lck1;->h:I

    .line 154
    .line 155
    return v7

    .line 156
    :cond_8
    :goto_1
    iput-wide v13, v8, Lck1;->k:J

    .line 157
    .line 158
    iget-object v1, v2, Lyj1;->b:Lkz2;

    .line 159
    .line 160
    invoke-virtual {v8, v1}, Lck1;->b(Lkz2;)J

    .line 161
    .line 162
    .line 163
    move-result-wide v4

    .line 164
    cmp-long v2, v4, v13

    .line 165
    .line 166
    if-ltz v2, :cond_9

    .line 167
    .line 168
    iget-wide v6, v8, Lck1;->g:J

    .line 169
    .line 170
    add-long v11, v6, v4

    .line 171
    .line 172
    iget-wide v13, v8, Lck1;->e:J

    .line 173
    .line 174
    cmp-long v2, v11, v13

    .line 175
    .line 176
    if-ltz v2, :cond_9

    .line 177
    .line 178
    iget v2, v8, Lck1;->i:I

    .line 179
    .line 180
    int-to-long v11, v2

    .line 181
    const-wide/32 v13, 0xf4240

    .line 182
    .line 183
    .line 184
    mul-long/2addr v6, v13

    .line 185
    div-long v14, v6, v11

    .line 186
    .line 187
    iget-object v2, v8, Lck1;->b:Ljg1;

    .line 188
    .line 189
    iget v6, v1, Lkz2;->c:I

    .line 190
    .line 191
    invoke-interface {v2, v1, v6, v3}, Ljg1;->a(Lkz2;II)V

    .line 192
    .line 193
    .line 194
    iget-object v13, v8, Lck1;->b:Ljg1;

    .line 195
    .line 196
    iget v1, v1, Lkz2;->c:I

    .line 197
    .line 198
    const/16 v18, 0x0

    .line 199
    .line 200
    const/16 v19, 0x0

    .line 201
    .line 202
    const/16 v16, 0x1

    .line 203
    .line 204
    move/from16 v17, v1

    .line 205
    .line 206
    invoke-interface/range {v13 .. v19}, Ljg1;->c(JIIILig1;)V

    .line 207
    .line 208
    .line 209
    iput-wide v9, v8, Lck1;->e:J

    .line 210
    .line 211
    :cond_9
    iget-wide v1, v8, Lck1;->g:J

    .line 212
    .line 213
    add-long/2addr v1, v4

    .line 214
    iput-wide v1, v8, Lck1;->g:J

    .line 215
    .line 216
    return v3

    .line 217
    :cond_a
    iget-wide v4, v8, Lck1;->f:J

    .line 218
    .line 219
    long-to-int v2, v4

    .line 220
    check-cast v1, Ldf1;

    .line 221
    .line 222
    invoke-virtual {v1, v2, v3}, Ldf1;->c(IZ)Z

    .line 223
    .line 224
    .line 225
    iput v11, v8, Lck1;->h:I

    .line 226
    .line 227
    return v3

    .line 228
    :cond_b
    :goto_2
    invoke-virtual {v2, v1}, Lyj1;->a(Lmf1;)Z

    .line 229
    .line 230
    .line 231
    move-result v5

    .line 232
    iget-object v12, v2, Lyj1;->b:Lkz2;

    .line 233
    .line 234
    if-nez v5, :cond_c

    .line 235
    .line 236
    iput v6, v8, Lck1;->h:I

    .line 237
    .line 238
    return v7

    .line 239
    :cond_c
    move-object v5, v1

    .line 240
    check-cast v5, Ldf1;

    .line 241
    .line 242
    iget-wide v13, v5, Ldf1;->i:J

    .line 243
    .line 244
    iget-wide v6, v8, Lck1;->f:J

    .line 245
    .line 246
    sub-long/2addr v13, v6

    .line 247
    iput-wide v13, v8, Lck1;->k:J

    .line 248
    .line 249
    iget-object v13, v8, Lck1;->j:Ll92;

    .line 250
    .line 251
    invoke-virtual {v8, v12, v6, v7, v13}, Lck1;->c(Lkz2;JLl92;)Z

    .line 252
    .line 253
    .line 254
    move-result v6

    .line 255
    if-eqz v6, :cond_d

    .line 256
    .line 257
    move-object v6, v1

    .line 258
    check-cast v6, Ldf1;

    .line 259
    .line 260
    iget-wide v6, v6, Ldf1;->i:J

    .line 261
    .line 262
    iput-wide v6, v8, Lck1;->f:J

    .line 263
    .line 264
    const/4 v6, 0x3

    .line 265
    const/4 v7, -0x1

    .line 266
    goto :goto_2

    .line 267
    :cond_d
    iget-object v5, v8, Lck1;->j:Ll92;

    .line 268
    .line 269
    iget-object v5, v5, Ll92;->f:Ljava/lang/Object;

    .line 270
    .line 271
    check-cast v5, Lph4;

    .line 272
    .line 273
    iget v6, v5, Lph4;->F:I

    .line 274
    .line 275
    iput v6, v8, Lck1;->i:I

    .line 276
    .line 277
    iget-boolean v6, v8, Lck1;->m:Z

    .line 278
    .line 279
    if-nez v6, :cond_e

    .line 280
    .line 281
    iget-object v6, v8, Lck1;->b:Ljg1;

    .line 282
    .line 283
    invoke-interface {v6, v5}, Ljg1;->d(Lph4;)V

    .line 284
    .line 285
    .line 286
    iput-boolean v4, v8, Lck1;->m:Z

    .line 287
    .line 288
    :cond_e
    iget-object v5, v8, Lck1;->j:Ll92;

    .line 289
    .line 290
    iget-object v5, v5, Ll92;->g:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast v5, Lcj1;

    .line 293
    .line 294
    if-eqz v5, :cond_f

    .line 295
    .line 296
    iput-object v5, v8, Lck1;->d:Lak1;

    .line 297
    .line 298
    :goto_3
    move v2, v11

    .line 299
    move-object v1, v12

    .line 300
    goto :goto_5

    .line 301
    :cond_f
    check-cast v1, Ldf1;

    .line 302
    .line 303
    iget-wide v5, v1, Ldf1;->h:J

    .line 304
    .line 305
    cmp-long v1, v5, v9

    .line 306
    .line 307
    if-nez v1, :cond_10

    .line 308
    .line 309
    new-instance v1, Lts0;

    .line 310
    .line 311
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 312
    .line 313
    .line 314
    iput-object v1, v8, Lck1;->d:Lak1;

    .line 315
    .line 316
    goto :goto_3

    .line 317
    :cond_10
    iget-object v1, v2, Lyj1;->a:Lzj1;

    .line 318
    .line 319
    iget v2, v1, Lzj1;->a:I

    .line 320
    .line 321
    and-int/lit8 v2, v2, 0x4

    .line 322
    .line 323
    if-eqz v2, :cond_11

    .line 324
    .line 325
    move/from16 v17, v4

    .line 326
    .line 327
    goto :goto_4

    .line 328
    :cond_11
    move/from16 v17, v3

    .line 329
    .line 330
    :goto_4
    new-instance v7, Lvj1;

    .line 331
    .line 332
    iget-wide v9, v8, Lck1;->f:J

    .line 333
    .line 334
    iget v2, v1, Lzj1;->d:I

    .line 335
    .line 336
    iget v4, v1, Lzj1;->e:I

    .line 337
    .line 338
    add-int/2addr v2, v4

    .line 339
    iget-wide v13, v1, Lzj1;->b:J

    .line 340
    .line 341
    int-to-long v1, v2

    .line 342
    move-wide v15, v13

    .line 343
    move-wide v13, v1

    .line 344
    move v2, v11

    .line 345
    move-object v1, v12

    .line 346
    move-wide v11, v5

    .line 347
    invoke-direct/range {v7 .. v17}, Lvj1;-><init>(Lck1;JJJJZ)V

    .line 348
    .line 349
    .line 350
    iput-object v7, v8, Lck1;->d:Lak1;

    .line 351
    .line 352
    :goto_5
    iput v2, v8, Lck1;->h:I

    .line 353
    .line 354
    iget-object v2, v1, Lkz2;->a:[B

    .line 355
    .line 356
    array-length v4, v2

    .line 357
    const v5, 0xfe01

    .line 358
    .line 359
    .line 360
    if-ne v4, v5, :cond_12

    .line 361
    .line 362
    return v3

    .line 363
    :cond_12
    iget v4, v1, Lkz2;->c:I

    .line 364
    .line 365
    invoke-static {v5, v4}, Ljava/lang/Math;->max(II)I

    .line 366
    .line 367
    .line 368
    move-result v4

    .line 369
    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 370
    .line 371
    .line 372
    move-result-object v2

    .line 373
    iget v4, v1, Lkz2;->c:I

    .line 374
    .line 375
    invoke-virtual {v1, v4, v2}, Lkz2;->z(I[B)V

    .line 376
    .line 377
    .line 378
    return v3
.end method

.method public final e(JJ)V
    .locals 6

    .line 1
    iget-object v0, p0, Lxj1;->b:Lck1;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, v0, Lck1;->a:Lyj1;

    .line 6
    .line 7
    iget-object v2, v1, Lyj1;->a:Lzj1;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    iput v3, v2, Lzj1;->a:I

    .line 11
    .line 12
    const-wide/16 v4, 0x0

    .line 13
    .line 14
    iput-wide v4, v2, Lzj1;->b:J

    .line 15
    .line 16
    iput v3, v2, Lzj1;->c:I

    .line 17
    .line 18
    iput v3, v2, Lzj1;->d:I

    .line 19
    .line 20
    iput v3, v2, Lzj1;->e:I

    .line 21
    .line 22
    iget-object v2, v1, Lyj1;->b:Lkz2;

    .line 23
    .line 24
    invoke-virtual {v2, v3}, Lkz2;->y(I)V

    .line 25
    .line 26
    .line 27
    const/4 v2, -0x1

    .line 28
    iput v2, v1, Lyj1;->c:I

    .line 29
    .line 30
    iput-boolean v3, v1, Lyj1;->e:Z

    .line 31
    .line 32
    cmp-long p1, p1, v4

    .line 33
    .line 34
    if-nez p1, :cond_0

    .line 35
    .line 36
    iget-boolean p1, v0, Lck1;->l:Z

    .line 37
    .line 38
    xor-int/lit8 p1, p1, 0x1

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Lck1;->a(Z)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_0
    iget p1, v0, Lck1;->h:I

    .line 45
    .line 46
    if-eqz p1, :cond_1

    .line 47
    .line 48
    iget p1, v0, Lck1;->i:I

    .line 49
    .line 50
    int-to-long p1, p1

    .line 51
    mul-long/2addr p1, p3

    .line 52
    const-wide/32 p3, 0xf4240

    .line 53
    .line 54
    .line 55
    div-long/2addr p1, p3

    .line 56
    iput-wide p1, v0, Lck1;->e:J

    .line 57
    .line 58
    iget-object p3, v0, Lck1;->d:Lak1;

    .line 59
    .line 60
    sget-object p4, Lv23;->a:Ljava/lang/String;

    .line 61
    .line 62
    invoke-interface {p3, p1, p2}, Lak1;->d(J)V

    .line 63
    .line 64
    .line 65
    const/4 p1, 0x2

    .line 66
    iput p1, v0, Lck1;->h:I

    .line 67
    .line 68
    :cond_1
    return-void
.end method

.method public final f(Lnf1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxj1;->a:Lnf1;

    .line 2
    .line 3
    return-void
.end method
