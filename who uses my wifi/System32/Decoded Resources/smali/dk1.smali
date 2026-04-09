.class public final Ldk1;
.super Lck1;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public n:Lpj4;

.field public o:I

.field public p:Z

.field public q:Lxf1;

.field public r:Lug0;


# virtual methods
.method public final a(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lck1;->a(Z)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Ldk1;->n:Lpj4;

    .line 8
    .line 9
    iput-object p1, p0, Ldk1;->q:Lxf1;

    .line 10
    .line 11
    iput-object p1, p0, Ldk1;->r:Lug0;

    .line 12
    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    iput p1, p0, Ldk1;->o:I

    .line 15
    .line 16
    iput-boolean p1, p0, Ldk1;->p:Z

    .line 17
    .line 18
    return-void
.end method

.method public final b(Lkz2;)J
    .locals 12

    .line 1
    iget-object v0, p1, Lkz2;->a:[B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-byte v0, v0, v1

    .line 5
    .line 6
    and-int/lit8 v2, v0, 0x1

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    const-wide/16 v0, -0x1

    .line 12
    .line 13
    return-wide v0

    .line 14
    :cond_0
    iget-object v2, p0, Ldk1;->n:Lpj4;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v4, v2, Lpj4;->g:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v4, Lxf1;

    .line 22
    .line 23
    iget v5, v2, Lpj4;->f:I

    .line 24
    .line 25
    shr-int/2addr v0, v3

    .line 26
    iget-object v2, v2, Lpj4;->j:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, [Lkj1;

    .line 29
    .line 30
    const/16 v6, 0xff

    .line 31
    .line 32
    const/16 v7, 0x8

    .line 33
    .line 34
    rsub-int/lit8 v5, v5, 0x8

    .line 35
    .line 36
    ushr-int v5, v6, v5

    .line 37
    .line 38
    and-int/2addr v0, v5

    .line 39
    aget-object v0, v2, v0

    .line 40
    .line 41
    iget-boolean v0, v0, Lkj1;->g:Z

    .line 42
    .line 43
    if-nez v0, :cond_1

    .line 44
    .line 45
    iget v0, v4, Lxf1;->e:I

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    iget v0, v4, Lxf1;->f:I

    .line 49
    .line 50
    :goto_0
    iget-boolean v2, p0, Ldk1;->p:Z

    .line 51
    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    iget v1, p0, Ldk1;->o:I

    .line 55
    .line 56
    add-int/2addr v1, v0

    .line 57
    div-int/lit8 v1, v1, 0x4

    .line 58
    .line 59
    :cond_2
    iget-object v2, p1, Lkz2;->a:[B

    .line 60
    .line 61
    array-length v4, v2

    .line 62
    iget v5, p1, Lkz2;->c:I

    .line 63
    .line 64
    add-int/lit8 v6, v5, 0x4

    .line 65
    .line 66
    if-ge v4, v6, :cond_3

    .line 67
    .line 68
    add-int/lit8 v5, v5, 0x4

    .line 69
    .line 70
    invoke-static {v2, v5}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    array-length v4, v2

    .line 75
    invoke-virtual {p1, v4, v2}, Lkz2;->z(I[B)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    add-int/lit8 v5, v5, 0x4

    .line 80
    .line 81
    invoke-virtual {p1, v5}, Lkz2;->C(I)V

    .line 82
    .line 83
    .line 84
    :goto_1
    int-to-long v1, v1

    .line 85
    iget-object v4, p1, Lkz2;->a:[B

    .line 86
    .line 87
    iget p1, p1, Lkz2;->c:I

    .line 88
    .line 89
    add-int/lit8 v5, p1, -0x4

    .line 90
    .line 91
    const-wide/16 v8, 0xff

    .line 92
    .line 93
    and-long v10, v1, v8

    .line 94
    .line 95
    long-to-int v6, v10

    .line 96
    int-to-byte v6, v6

    .line 97
    aput-byte v6, v4, v5

    .line 98
    .line 99
    add-int/lit8 v5, p1, -0x3

    .line 100
    .line 101
    ushr-long v6, v1, v7

    .line 102
    .line 103
    and-long/2addr v6, v8

    .line 104
    long-to-int v6, v6

    .line 105
    int-to-byte v6, v6

    .line 106
    aput-byte v6, v4, v5

    .line 107
    .line 108
    add-int/lit8 v5, p1, -0x2

    .line 109
    .line 110
    const/16 v6, 0x10

    .line 111
    .line 112
    ushr-long v6, v1, v6

    .line 113
    .line 114
    and-long/2addr v6, v8

    .line 115
    long-to-int v6, v6

    .line 116
    int-to-byte v6, v6

    .line 117
    aput-byte v6, v4, v5

    .line 118
    .line 119
    add-int/lit8 p1, p1, -0x1

    .line 120
    .line 121
    const/16 v5, 0x18

    .line 122
    .line 123
    ushr-long v5, v1, v5

    .line 124
    .line 125
    and-long/2addr v5, v8

    .line 126
    long-to-int v5, v5

    .line 127
    int-to-byte v5, v5

    .line 128
    aput-byte v5, v4, p1

    .line 129
    .line 130
    iput-boolean v3, p0, Ldk1;->p:Z

    .line 131
    .line 132
    iput v0, p0, Ldk1;->o:I

    .line 133
    .line 134
    return-wide v1
.end method

.method public final c(Lkz2;JLl92;)Z
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    iget-object v3, v0, Ldk1;->n:Lpj4;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-eqz v3, :cond_0

    .line 11
    .line 12
    iget-object v1, v2, Ll92;->f:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lph4;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    return v4

    .line 20
    :cond_0
    iget-object v6, v0, Ldk1;->q:Lxf1;

    .line 21
    .line 22
    const/4 v5, 0x4

    .line 23
    const/4 v11, 0x1

    .line 24
    if-nez v6, :cond_3

    .line 25
    .line 26
    invoke-static {v11, v1, v4}, Lpu1;->F(ILkz2;Z)Z

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Lkz2;->i()I

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Lkz2;->K()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    invoke-virtual {v1}, Lkz2;->i()I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    invoke-virtual {v1}, Lkz2;->c()I

    .line 41
    .line 42
    .line 43
    move-result v8

    .line 44
    if-gtz v8, :cond_1

    .line 45
    .line 46
    const/4 v8, -0x1

    .line 47
    :cond_1
    invoke-virtual {v1}, Lkz2;->c()I

    .line 48
    .line 49
    .line 50
    move-result v9

    .line 51
    if-gtz v9, :cond_2

    .line 52
    .line 53
    const/4 v3, -0x1

    .line 54
    goto :goto_0

    .line 55
    :cond_2
    move v3, v9

    .line 56
    :goto_0
    invoke-virtual {v1}, Lkz2;->c()I

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Lkz2;->K()I

    .line 60
    .line 61
    .line 62
    move-result v9

    .line 63
    and-int/lit8 v10, v9, 0xf

    .line 64
    .line 65
    int-to-double v12, v10

    .line 66
    const-wide/high16 v14, 0x4000000000000000L    # 2.0

    .line 67
    .line 68
    invoke-static {v14, v15, v12, v13}, Ljava/lang/Math;->pow(DD)D

    .line 69
    .line 70
    .line 71
    move-result-wide v12

    .line 72
    double-to-int v10, v12

    .line 73
    and-int/lit16 v9, v9, 0xf0

    .line 74
    .line 75
    shr-int/lit8 v5, v9, 0x4

    .line 76
    .line 77
    int-to-double v12, v5

    .line 78
    invoke-static {v14, v15, v12, v13}, Ljava/lang/Math;->pow(DD)D

    .line 79
    .line 80
    .line 81
    move-result-wide v12

    .line 82
    double-to-int v5, v12

    .line 83
    invoke-virtual {v1}, Lkz2;->K()I

    .line 84
    .line 85
    .line 86
    iget-object v9, v1, Lkz2;->a:[B

    .line 87
    .line 88
    iget v1, v1, Lkz2;->c:I

    .line 89
    .line 90
    invoke-static {v9, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    new-instance v9, Lxf1;

    .line 95
    .line 96
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 97
    .line 98
    .line 99
    iput v4, v9, Lxf1;->a:I

    .line 100
    .line 101
    iput v6, v9, Lxf1;->b:I

    .line 102
    .line 103
    iput v8, v9, Lxf1;->c:I

    .line 104
    .line 105
    iput v3, v9, Lxf1;->d:I

    .line 106
    .line 107
    iput v10, v9, Lxf1;->e:I

    .line 108
    .line 109
    iput v5, v9, Lxf1;->f:I

    .line 110
    .line 111
    iput-object v1, v9, Lxf1;->g:Ljava/io/Serializable;

    .line 112
    .line 113
    iput-object v9, v0, Ldk1;->q:Lxf1;

    .line 114
    .line 115
    :goto_1
    const/4 v7, 0x0

    .line 116
    goto/16 :goto_22

    .line 117
    .line 118
    :cond_3
    iget-object v8, v0, Ldk1;->r:Lug0;

    .line 119
    .line 120
    if-nez v8, :cond_4

    .line 121
    .line 122
    invoke-static {v1, v11, v11}, Lpu1;->v(Lkz2;ZZ)Lug0;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    iput-object v1, v0, Ldk1;->r:Lug0;

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_4
    iget v9, v1, Lkz2;->c:I

    .line 130
    .line 131
    move-object v10, v8

    .line 132
    new-array v8, v9, [B

    .line 133
    .line 134
    iget-object v12, v1, Lkz2;->a:[B

    .line 135
    .line 136
    invoke-static {v12, v4, v8, v4, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 137
    .line 138
    .line 139
    iget v9, v6, Lxf1;->a:I

    .line 140
    .line 141
    const/4 v12, 0x5

    .line 142
    invoke-static {v12, v1, v4}, Lpu1;->F(ILkz2;Z)Z

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1}, Lkz2;->K()I

    .line 146
    .line 147
    .line 148
    move-result v13

    .line 149
    add-int/2addr v13, v11

    .line 150
    new-instance v14, Llg1;

    .line 151
    .line 152
    iget-object v15, v1, Lkz2;->a:[B

    .line 153
    .line 154
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    .line 155
    .line 156
    .line 157
    iput-object v15, v14, Llg1;->a:[B

    .line 158
    .line 159
    array-length v15, v15

    .line 160
    iput v15, v14, Llg1;->b:I

    .line 161
    .line 162
    iget v1, v1, Lkz2;->b:I

    .line 163
    .line 164
    const/16 v15, 0x8

    .line 165
    .line 166
    mul-int/2addr v1, v15

    .line 167
    invoke-virtual {v14, v1}, Llg1;->g(I)V

    .line 168
    .line 169
    .line 170
    move v1, v4

    .line 171
    :goto_2
    const/16 v3, 0x18

    .line 172
    .line 173
    const/4 v4, 0x2

    .line 174
    move/from16 p1, v15

    .line 175
    .line 176
    const/16 v15, 0x10

    .line 177
    .line 178
    if-ge v1, v13, :cond_10

    .line 179
    .line 180
    invoke-virtual {v14, v3}, Llg1;->d(I)I

    .line 181
    .line 182
    .line 183
    move-result v7

    .line 184
    const v11, 0x564342

    .line 185
    .line 186
    .line 187
    if-ne v7, v11, :cond_f

    .line 188
    .line 189
    invoke-virtual {v14, v15}, Llg1;->d(I)I

    .line 190
    .line 191
    .line 192
    move-result v7

    .line 193
    invoke-virtual {v14, v3}, Llg1;->d(I)I

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    invoke-virtual {v14}, Llg1;->c()Z

    .line 198
    .line 199
    .line 200
    move-result v11

    .line 201
    if-nez v11, :cond_7

    .line 202
    .line 203
    invoke-virtual {v14}, Llg1;->c()Z

    .line 204
    .line 205
    .line 206
    move-result v11

    .line 207
    const/4 v15, 0x0

    .line 208
    :goto_3
    if-ge v15, v3, :cond_9

    .line 209
    .line 210
    if-eqz v11, :cond_5

    .line 211
    .line 212
    invoke-virtual {v14}, Llg1;->c()Z

    .line 213
    .line 214
    .line 215
    move-result v17

    .line 216
    if-eqz v17, :cond_6

    .line 217
    .line 218
    invoke-virtual {v14, v12}, Llg1;->g(I)V

    .line 219
    .line 220
    .line 221
    goto :goto_4

    .line 222
    :cond_5
    invoke-virtual {v14, v12}, Llg1;->g(I)V

    .line 223
    .line 224
    .line 225
    :cond_6
    :goto_4
    add-int/lit8 v15, v15, 0x1

    .line 226
    .line 227
    goto :goto_3

    .line 228
    :cond_7
    invoke-virtual {v14, v12}, Llg1;->g(I)V

    .line 229
    .line 230
    .line 231
    const/4 v11, 0x0

    .line 232
    :goto_5
    if-ge v11, v3, :cond_9

    .line 233
    .line 234
    sub-int v15, v3, v11

    .line 235
    .line 236
    const/4 v12, 0x0

    .line 237
    :goto_6
    if-lez v15, :cond_8

    .line 238
    .line 239
    ushr-int/lit8 v15, v15, 0x1

    .line 240
    .line 241
    add-int/lit8 v12, v12, 0x1

    .line 242
    .line 243
    goto :goto_6

    .line 244
    :cond_8
    invoke-virtual {v14, v12}, Llg1;->d(I)I

    .line 245
    .line 246
    .line 247
    move-result v12

    .line 248
    add-int/2addr v11, v12

    .line 249
    const/4 v12, 0x5

    .line 250
    goto :goto_5

    .line 251
    :cond_9
    invoke-virtual {v14, v5}, Llg1;->d(I)I

    .line 252
    .line 253
    .line 254
    move-result v11

    .line 255
    if-gt v11, v4, :cond_e

    .line 256
    .line 257
    const/4 v12, 0x1

    .line 258
    if-eq v11, v12, :cond_b

    .line 259
    .line 260
    if-ne v11, v4, :cond_a

    .line 261
    .line 262
    goto :goto_7

    .line 263
    :cond_a
    move-object v12, v6

    .line 264
    goto :goto_9

    .line 265
    :cond_b
    move v4, v11

    .line 266
    :goto_7
    const/16 v11, 0x20

    .line 267
    .line 268
    invoke-virtual {v14, v11}, Llg1;->g(I)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v14, v11}, Llg1;->g(I)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v14, v5}, Llg1;->d(I)I

    .line 275
    .line 276
    .line 277
    move-result v11

    .line 278
    add-int/2addr v11, v12

    .line 279
    invoke-virtual {v14, v12}, Llg1;->g(I)V

    .line 280
    .line 281
    .line 282
    if-ne v4, v12, :cond_d

    .line 283
    .line 284
    if-eqz v7, :cond_c

    .line 285
    .line 286
    int-to-long v3, v3

    .line 287
    move-object v12, v6

    .line 288
    int-to-long v5, v7

    .line 289
    long-to-double v5, v5

    .line 290
    long-to-double v3, v3

    .line 291
    const-wide/high16 v18, 0x3ff0000000000000L    # 1.0

    .line 292
    .line 293
    div-double v5, v18, v5

    .line 294
    .line 295
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->pow(DD)D

    .line 296
    .line 297
    .line 298
    move-result-wide v3

    .line 299
    invoke-static {v3, v4}, Ljava/lang/Math;->floor(D)D

    .line 300
    .line 301
    .line 302
    move-result-wide v3

    .line 303
    double-to-long v3, v3

    .line 304
    goto :goto_8

    .line 305
    :cond_c
    move-object v12, v6

    .line 306
    const-wide/16 v3, 0x0

    .line 307
    .line 308
    goto :goto_8

    .line 309
    :cond_d
    move-object v12, v6

    .line 310
    int-to-long v4, v7

    .line 311
    int-to-long v6, v3

    .line 312
    mul-long v3, v6, v4

    .line 313
    .line 314
    :goto_8
    int-to-long v5, v11

    .line 315
    mul-long/2addr v3, v5

    .line 316
    long-to-int v3, v3

    .line 317
    invoke-virtual {v14, v3}, Llg1;->g(I)V

    .line 318
    .line 319
    .line 320
    :goto_9
    add-int/lit8 v1, v1, 0x1

    .line 321
    .line 322
    move/from16 v15, p1

    .line 323
    .line 324
    move-object v6, v12

    .line 325
    const/4 v4, 0x0

    .line 326
    const/4 v5, 0x4

    .line 327
    const/4 v11, 0x1

    .line 328
    const/4 v12, 0x5

    .line 329
    goto/16 :goto_2

    .line 330
    .line 331
    :cond_e
    invoke-static {v11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v1

    .line 335
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 336
    .line 337
    .line 338
    move-result v1

    .line 339
    new-instance v2, Ljava/lang/StringBuilder;

    .line 340
    .line 341
    add-int/lit8 v1, v1, 0x2a

    .line 342
    .line 343
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 344
    .line 345
    .line 346
    const-string v1, "lookup type greater than 2 not decodable: "

    .line 347
    .line 348
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v1

    .line 358
    const/4 v2, 0x0

    .line 359
    invoke-static {v2, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 360
    .line 361
    .line 362
    move-result-object v1

    .line 363
    throw v1

    .line 364
    :cond_f
    iget v1, v14, Llg1;->c:I

    .line 365
    .line 366
    mul-int/lit8 v1, v1, 0x8

    .line 367
    .line 368
    iget v2, v14, Llg1;->d:I

    .line 369
    .line 370
    add-int/2addr v1, v2

    .line 371
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v2

    .line 375
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 376
    .line 377
    .line 378
    move-result v2

    .line 379
    new-instance v3, Ljava/lang/StringBuilder;

    .line 380
    .line 381
    add-int/lit8 v2, v2, 0x37

    .line 382
    .line 383
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 384
    .line 385
    .line 386
    const-string v2, "expected code book to start with [0x56, 0x43, 0x42] at "

    .line 387
    .line 388
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v1

    .line 398
    const/4 v2, 0x0

    .line 399
    invoke-static {v2, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 400
    .line 401
    .line 402
    move-result-object v1

    .line 403
    throw v1

    .line 404
    :cond_10
    move-object v12, v6

    .line 405
    const/4 v1, 0x6

    .line 406
    invoke-virtual {v14, v1}, Llg1;->d(I)I

    .line 407
    .line 408
    .line 409
    move-result v5

    .line 410
    const/16 v16, 0x1

    .line 411
    .line 412
    add-int/lit8 v5, v5, 0x1

    .line 413
    .line 414
    const/4 v6, 0x0

    .line 415
    :goto_a
    if-ge v6, v5, :cond_12

    .line 416
    .line 417
    invoke-virtual {v14, v15}, Llg1;->d(I)I

    .line 418
    .line 419
    .line 420
    move-result v7

    .line 421
    if-nez v7, :cond_11

    .line 422
    .line 423
    add-int/lit8 v6, v6, 0x1

    .line 424
    .line 425
    goto :goto_a

    .line 426
    :cond_11
    const-string v1, "placeholder of time domain transforms not zeroed out"

    .line 427
    .line 428
    const/4 v2, 0x0

    .line 429
    invoke-static {v2, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 430
    .line 431
    .line 432
    move-result-object v1

    .line 433
    throw v1

    .line 434
    :cond_12
    invoke-virtual {v14, v1}, Llg1;->d(I)I

    .line 435
    .line 436
    .line 437
    move-result v5

    .line 438
    const/4 v6, 0x1

    .line 439
    add-int/2addr v5, v6

    .line 440
    const/4 v7, 0x0

    .line 441
    :goto_b
    const/4 v11, 0x3

    .line 442
    const/16 v13, 0x29

    .line 443
    .line 444
    if-ge v7, v5, :cond_1c

    .line 445
    .line 446
    invoke-virtual {v14, v15}, Llg1;->d(I)I

    .line 447
    .line 448
    .line 449
    move-result v3

    .line 450
    if-eqz v3, :cond_1a

    .line 451
    .line 452
    if-ne v3, v6, :cond_19

    .line 453
    .line 454
    const/4 v6, 0x5

    .line 455
    invoke-virtual {v14, v6}, Llg1;->d(I)I

    .line 456
    .line 457
    .line 458
    move-result v3

    .line 459
    new-array v6, v3, [I

    .line 460
    .line 461
    const/4 v1, -0x1

    .line 462
    const/4 v13, 0x0

    .line 463
    :goto_c
    if-ge v13, v3, :cond_14

    .line 464
    .line 465
    const/4 v15, 0x4

    .line 466
    invoke-virtual {v14, v15}, Llg1;->d(I)I

    .line 467
    .line 468
    .line 469
    move-result v4

    .line 470
    aput v4, v6, v13

    .line 471
    .line 472
    if-le v4, v1, :cond_13

    .line 473
    .line 474
    move v1, v4

    .line 475
    :cond_13
    add-int/lit8 v13, v13, 0x1

    .line 476
    .line 477
    const/4 v4, 0x2

    .line 478
    const/16 v15, 0x10

    .line 479
    .line 480
    goto :goto_c

    .line 481
    :cond_14
    add-int/lit8 v1, v1, 0x1

    .line 482
    .line 483
    new-array v4, v1, [I

    .line 484
    .line 485
    const/4 v13, 0x0

    .line 486
    :goto_d
    if-ge v13, v1, :cond_17

    .line 487
    .line 488
    invoke-virtual {v14, v11}, Llg1;->d(I)I

    .line 489
    .line 490
    .line 491
    move-result v15

    .line 492
    const/16 v16, 0x1

    .line 493
    .line 494
    add-int/lit8 v15, v15, 0x1

    .line 495
    .line 496
    aput v15, v4, v13

    .line 497
    .line 498
    const/4 v15, 0x2

    .line 499
    invoke-virtual {v14, v15}, Llg1;->d(I)I

    .line 500
    .line 501
    .line 502
    move-result v20

    .line 503
    if-lez v20, :cond_15

    .line 504
    .line 505
    move/from16 v15, p1

    .line 506
    .line 507
    invoke-virtual {v14, v15}, Llg1;->g(I)V

    .line 508
    .line 509
    .line 510
    :goto_e
    move/from16 v22, v1

    .line 511
    .line 512
    const/4 v11, 0x0

    .line 513
    goto :goto_f

    .line 514
    :cond_15
    move/from16 v15, p1

    .line 515
    .line 516
    goto :goto_e

    .line 517
    :goto_f
    shl-int v1, v16, v20

    .line 518
    .line 519
    if-ge v11, v1, :cond_16

    .line 520
    .line 521
    invoke-virtual {v14, v15}, Llg1;->g(I)V

    .line 522
    .line 523
    .line 524
    add-int/lit8 v11, v11, 0x1

    .line 525
    .line 526
    const/16 v15, 0x8

    .line 527
    .line 528
    const/16 v16, 0x1

    .line 529
    .line 530
    goto :goto_f

    .line 531
    :cond_16
    add-int/lit8 v13, v13, 0x1

    .line 532
    .line 533
    move/from16 v1, v22

    .line 534
    .line 535
    const/16 p1, 0x8

    .line 536
    .line 537
    const/4 v11, 0x3

    .line 538
    goto :goto_d

    .line 539
    :cond_17
    const/4 v15, 0x2

    .line 540
    invoke-virtual {v14, v15}, Llg1;->g(I)V

    .line 541
    .line 542
    .line 543
    const/4 v15, 0x4

    .line 544
    invoke-virtual {v14, v15}, Llg1;->d(I)I

    .line 545
    .line 546
    .line 547
    move-result v1

    .line 548
    const/4 v11, 0x0

    .line 549
    const/4 v13, 0x0

    .line 550
    const/4 v15, 0x0

    .line 551
    :goto_10
    if-ge v11, v3, :cond_1b

    .line 552
    .line 553
    aget v20, v6, v11

    .line 554
    .line 555
    aget v20, v4, v20

    .line 556
    .line 557
    add-int v13, v13, v20

    .line 558
    .line 559
    :goto_11
    if-ge v15, v13, :cond_18

    .line 560
    .line 561
    invoke-virtual {v14, v1}, Llg1;->g(I)V

    .line 562
    .line 563
    .line 564
    add-int/lit8 v15, v15, 0x1

    .line 565
    .line 566
    goto :goto_11

    .line 567
    :cond_18
    add-int/lit8 v11, v11, 0x1

    .line 568
    .line 569
    goto :goto_10

    .line 570
    :cond_19
    invoke-static {v3, v13}, Lga1;->f(II)I

    .line 571
    .line 572
    .line 573
    move-result v1

    .line 574
    new-instance v2, Ljava/lang/StringBuilder;

    .line 575
    .line 576
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 577
    .line 578
    .line 579
    const-string v1, "floor type greater than 1 not decodable: "

    .line 580
    .line 581
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 582
    .line 583
    .line 584
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 585
    .line 586
    .line 587
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 588
    .line 589
    .line 590
    move-result-object v1

    .line 591
    const/4 v2, 0x0

    .line 592
    invoke-static {v2, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 593
    .line 594
    .line 595
    move-result-object v1

    .line 596
    throw v1

    .line 597
    :cond_1a
    move/from16 v15, p1

    .line 598
    .line 599
    invoke-virtual {v14, v15}, Llg1;->g(I)V

    .line 600
    .line 601
    .line 602
    const/16 v1, 0x10

    .line 603
    .line 604
    invoke-virtual {v14, v1}, Llg1;->g(I)V

    .line 605
    .line 606
    .line 607
    invoke-virtual {v14, v1}, Llg1;->g(I)V

    .line 608
    .line 609
    .line 610
    const/4 v1, 0x6

    .line 611
    invoke-virtual {v14, v1}, Llg1;->g(I)V

    .line 612
    .line 613
    .line 614
    invoke-virtual {v14, v15}, Llg1;->g(I)V

    .line 615
    .line 616
    .line 617
    const/4 v1, 0x4

    .line 618
    invoke-virtual {v14, v1}, Llg1;->d(I)I

    .line 619
    .line 620
    .line 621
    move-result v3

    .line 622
    const/16 v16, 0x1

    .line 623
    .line 624
    add-int/lit8 v3, v3, 0x1

    .line 625
    .line 626
    const/4 v1, 0x0

    .line 627
    :goto_12
    if-ge v1, v3, :cond_1b

    .line 628
    .line 629
    invoke-virtual {v14, v15}, Llg1;->g(I)V

    .line 630
    .line 631
    .line 632
    add-int/lit8 v1, v1, 0x1

    .line 633
    .line 634
    const/16 v15, 0x8

    .line 635
    .line 636
    goto :goto_12

    .line 637
    :cond_1b
    add-int/lit8 v7, v7, 0x1

    .line 638
    .line 639
    const/16 p1, 0x8

    .line 640
    .line 641
    const/4 v1, 0x6

    .line 642
    const/16 v3, 0x18

    .line 643
    .line 644
    const/4 v4, 0x2

    .line 645
    const/4 v6, 0x1

    .line 646
    const/16 v15, 0x10

    .line 647
    .line 648
    goto/16 :goto_b

    .line 649
    .line 650
    :cond_1c
    invoke-virtual {v14, v1}, Llg1;->d(I)I

    .line 651
    .line 652
    .line 653
    move-result v3

    .line 654
    const/16 v16, 0x1

    .line 655
    .line 656
    add-int/lit8 v3, v3, 0x1

    .line 657
    .line 658
    const/4 v4, 0x0

    .line 659
    :goto_13
    if-ge v4, v3, :cond_23

    .line 660
    .line 661
    const/16 v5, 0x10

    .line 662
    .line 663
    invoke-virtual {v14, v5}, Llg1;->d(I)I

    .line 664
    .line 665
    .line 666
    move-result v6

    .line 667
    const/4 v15, 0x2

    .line 668
    if-gt v6, v15, :cond_22

    .line 669
    .line 670
    const/16 v5, 0x18

    .line 671
    .line 672
    invoke-virtual {v14, v5}, Llg1;->g(I)V

    .line 673
    .line 674
    .line 675
    invoke-virtual {v14, v5}, Llg1;->g(I)V

    .line 676
    .line 677
    .line 678
    invoke-virtual {v14, v5}, Llg1;->g(I)V

    .line 679
    .line 680
    .line 681
    invoke-virtual {v14, v1}, Llg1;->d(I)I

    .line 682
    .line 683
    .line 684
    move-result v6

    .line 685
    add-int/lit8 v6, v6, 0x1

    .line 686
    .line 687
    const/16 v15, 0x8

    .line 688
    .line 689
    invoke-virtual {v14, v15}, Llg1;->g(I)V

    .line 690
    .line 691
    .line 692
    new-array v1, v6, [I

    .line 693
    .line 694
    const/4 v7, 0x0

    .line 695
    :goto_14
    if-ge v7, v6, :cond_1e

    .line 696
    .line 697
    const/4 v11, 0x3

    .line 698
    invoke-virtual {v14, v11}, Llg1;->d(I)I

    .line 699
    .line 700
    .line 701
    move-result v18

    .line 702
    invoke-virtual {v14}, Llg1;->c()Z

    .line 703
    .line 704
    .line 705
    move-result v20

    .line 706
    if-eqz v20, :cond_1d

    .line 707
    .line 708
    const/4 v5, 0x5

    .line 709
    invoke-virtual {v14, v5}, Llg1;->d(I)I

    .line 710
    .line 711
    .line 712
    move-result v17

    .line 713
    goto :goto_15

    .line 714
    :cond_1d
    const/4 v5, 0x5

    .line 715
    const/16 v17, 0x0

    .line 716
    .line 717
    :goto_15
    mul-int/lit8 v17, v17, 0x8

    .line 718
    .line 719
    add-int v17, v17, v18

    .line 720
    .line 721
    aput v17, v1, v7

    .line 722
    .line 723
    add-int/lit8 v7, v7, 0x1

    .line 724
    .line 725
    const/16 v5, 0x18

    .line 726
    .line 727
    goto :goto_14

    .line 728
    :cond_1e
    const/4 v11, 0x3

    .line 729
    const/4 v7, 0x0

    .line 730
    :goto_16
    const/4 v5, 0x5

    .line 731
    if-ge v7, v6, :cond_21

    .line 732
    .line 733
    const/4 v5, 0x0

    .line 734
    :goto_17
    if-ge v5, v15, :cond_20

    .line 735
    .line 736
    aget v18, v1, v7

    .line 737
    .line 738
    const/16 v16, 0x1

    .line 739
    .line 740
    shl-int v21, v16, v5

    .line 741
    .line 742
    and-int v18, v18, v21

    .line 743
    .line 744
    if-eqz v18, :cond_1f

    .line 745
    .line 746
    invoke-virtual {v14, v15}, Llg1;->g(I)V

    .line 747
    .line 748
    .line 749
    :cond_1f
    add-int/lit8 v5, v5, 0x1

    .line 750
    .line 751
    const/16 v15, 0x8

    .line 752
    .line 753
    goto :goto_17

    .line 754
    :cond_20
    add-int/lit8 v7, v7, 0x1

    .line 755
    .line 756
    const/16 v15, 0x8

    .line 757
    .line 758
    goto :goto_16

    .line 759
    :cond_21
    add-int/lit8 v4, v4, 0x1

    .line 760
    .line 761
    const/4 v1, 0x6

    .line 762
    const/16 v16, 0x1

    .line 763
    .line 764
    goto :goto_13

    .line 765
    :cond_22
    const-string v1, "residueType greater than 2 is not decodable"

    .line 766
    .line 767
    const/4 v2, 0x0

    .line 768
    invoke-static {v2, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 769
    .line 770
    .line 771
    move-result-object v1

    .line 772
    throw v1

    .line 773
    :cond_23
    invoke-virtual {v14, v1}, Llg1;->d(I)I

    .line 774
    .line 775
    .line 776
    move-result v3

    .line 777
    const/16 v16, 0x1

    .line 778
    .line 779
    add-int/lit8 v3, v3, 0x1

    .line 780
    .line 781
    const/4 v1, 0x0

    .line 782
    :goto_18
    if-ge v1, v3, :cond_2c

    .line 783
    .line 784
    const/16 v5, 0x10

    .line 785
    .line 786
    invoke-virtual {v14, v5}, Llg1;->d(I)I

    .line 787
    .line 788
    .line 789
    move-result v4

    .line 790
    if-eqz v4, :cond_24

    .line 791
    .line 792
    invoke-static {v4, v13}, Lga1;->f(II)I

    .line 793
    .line 794
    .line 795
    move-result v5

    .line 796
    new-instance v6, Ljava/lang/StringBuilder;

    .line 797
    .line 798
    invoke-direct {v6, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 799
    .line 800
    .line 801
    const-string v5, "mapping type other than 0 not supported: "

    .line 802
    .line 803
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 804
    .line 805
    .line 806
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 807
    .line 808
    .line 809
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 810
    .line 811
    .line 812
    move-result-object v4

    .line 813
    const-string v5, "VorbisUtil"

    .line 814
    .line 815
    invoke-static {v5, v4}, La30;->A(Ljava/lang/String;Ljava/lang/String;)V

    .line 816
    .line 817
    .line 818
    const/4 v6, 0x4

    .line 819
    const/4 v15, 0x2

    .line 820
    goto/16 :goto_1f

    .line 821
    .line 822
    :cond_24
    invoke-virtual {v14}, Llg1;->c()Z

    .line 823
    .line 824
    .line 825
    move-result v4

    .line 826
    if-eqz v4, :cond_25

    .line 827
    .line 828
    const/4 v15, 0x4

    .line 829
    invoke-virtual {v14, v15}, Llg1;->d(I)I

    .line 830
    .line 831
    .line 832
    move-result v4

    .line 833
    const/16 v16, 0x1

    .line 834
    .line 835
    add-int/lit8 v4, v4, 0x1

    .line 836
    .line 837
    goto :goto_19

    .line 838
    :cond_25
    const/16 v16, 0x1

    .line 839
    .line 840
    move/from16 v4, v16

    .line 841
    .line 842
    :goto_19
    invoke-virtual {v14}, Llg1;->c()Z

    .line 843
    .line 844
    .line 845
    move-result v5

    .line 846
    if-eqz v5, :cond_28

    .line 847
    .line 848
    const/16 v15, 0x8

    .line 849
    .line 850
    invoke-virtual {v14, v15}, Llg1;->d(I)I

    .line 851
    .line 852
    .line 853
    move-result v5

    .line 854
    add-int/lit8 v5, v5, 0x1

    .line 855
    .line 856
    const/4 v6, 0x0

    .line 857
    :goto_1a
    if-ge v6, v5, :cond_28

    .line 858
    .line 859
    add-int/lit8 v7, v9, -0x1

    .line 860
    .line 861
    move v11, v7

    .line 862
    const/4 v15, 0x0

    .line 863
    :goto_1b
    if-lez v11, :cond_26

    .line 864
    .line 865
    ushr-int/lit8 v11, v11, 0x1

    .line 866
    .line 867
    add-int/lit8 v15, v15, 0x1

    .line 868
    .line 869
    goto :goto_1b

    .line 870
    :cond_26
    invoke-virtual {v14, v15}, Llg1;->g(I)V

    .line 871
    .line 872
    .line 873
    const/4 v11, 0x0

    .line 874
    :goto_1c
    if-lez v7, :cond_27

    .line 875
    .line 876
    ushr-int/lit8 v7, v7, 0x1

    .line 877
    .line 878
    add-int/lit8 v11, v11, 0x1

    .line 879
    .line 880
    goto :goto_1c

    .line 881
    :cond_27
    invoke-virtual {v14, v11}, Llg1;->g(I)V

    .line 882
    .line 883
    .line 884
    add-int/lit8 v6, v6, 0x1

    .line 885
    .line 886
    goto :goto_1a

    .line 887
    :cond_28
    const/4 v15, 0x2

    .line 888
    invoke-virtual {v14, v15}, Llg1;->d(I)I

    .line 889
    .line 890
    .line 891
    move-result v5

    .line 892
    if-nez v5, :cond_2b

    .line 893
    .line 894
    const/4 v6, 0x1

    .line 895
    if-le v4, v6, :cond_29

    .line 896
    .line 897
    const/4 v5, 0x0

    .line 898
    :goto_1d
    if-ge v5, v9, :cond_29

    .line 899
    .line 900
    const/4 v6, 0x4

    .line 901
    invoke-virtual {v14, v6}, Llg1;->g(I)V

    .line 902
    .line 903
    .line 904
    add-int/lit8 v5, v5, 0x1

    .line 905
    .line 906
    goto :goto_1d

    .line 907
    :cond_29
    const/4 v6, 0x4

    .line 908
    const/4 v5, 0x0

    .line 909
    :goto_1e
    if-ge v5, v4, :cond_2a

    .line 910
    .line 911
    const/16 v7, 0x8

    .line 912
    .line 913
    invoke-virtual {v14, v7}, Llg1;->g(I)V

    .line 914
    .line 915
    .line 916
    invoke-virtual {v14, v7}, Llg1;->g(I)V

    .line 917
    .line 918
    .line 919
    invoke-virtual {v14, v7}, Llg1;->g(I)V

    .line 920
    .line 921
    .line 922
    add-int/lit8 v5, v5, 0x1

    .line 923
    .line 924
    goto :goto_1e

    .line 925
    :cond_2a
    :goto_1f
    add-int/lit8 v1, v1, 0x1

    .line 926
    .line 927
    goto/16 :goto_18

    .line 928
    .line 929
    :cond_2b
    const-string v1, "to reserved bits must be zero after mapping coupling steps"

    .line 930
    .line 931
    const/4 v2, 0x0

    .line 932
    invoke-static {v2, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 933
    .line 934
    .line 935
    move-result-object v1

    .line 936
    throw v1

    .line 937
    :cond_2c
    const/4 v1, 0x6

    .line 938
    invoke-virtual {v14, v1}, Llg1;->d(I)I

    .line 939
    .line 940
    .line 941
    move-result v1

    .line 942
    add-int/lit8 v3, v1, 0x1

    .line 943
    .line 944
    new-array v9, v3, [Lkj1;

    .line 945
    .line 946
    const/4 v4, 0x0

    .line 947
    :goto_20
    if-ge v4, v3, :cond_2d

    .line 948
    .line 949
    invoke-virtual {v14}, Llg1;->c()Z

    .line 950
    .line 951
    .line 952
    move-result v5

    .line 953
    const/16 v6, 0x10

    .line 954
    .line 955
    invoke-virtual {v14, v6}, Llg1;->d(I)I

    .line 956
    .line 957
    .line 958
    invoke-virtual {v14, v6}, Llg1;->d(I)I

    .line 959
    .line 960
    .line 961
    const/16 v15, 0x8

    .line 962
    .line 963
    invoke-virtual {v14, v15}, Llg1;->d(I)I

    .line 964
    .line 965
    .line 966
    new-instance v7, Lkj1;

    .line 967
    .line 968
    const/4 v11, 0x2

    .line 969
    invoke-direct {v7, v11, v5}, Lkj1;-><init>(IZ)V

    .line 970
    .line 971
    .line 972
    aput-object v7, v9, v4

    .line 973
    .line 974
    add-int/lit8 v4, v4, 0x1

    .line 975
    .line 976
    goto :goto_20

    .line 977
    :cond_2d
    invoke-virtual {v14}, Llg1;->c()Z

    .line 978
    .line 979
    .line 980
    move-result v3

    .line 981
    if-eqz v3, :cond_30

    .line 982
    .line 983
    new-instance v5, Lpj4;

    .line 984
    .line 985
    const/4 v4, 0x0

    .line 986
    :goto_21
    if-lez v1, :cond_2e

    .line 987
    .line 988
    ushr-int/lit8 v1, v1, 0x1

    .line 989
    .line 990
    add-int/lit8 v4, v4, 0x1

    .line 991
    .line 992
    goto :goto_21

    .line 993
    :cond_2e
    move-object v7, v10

    .line 994
    move-object v6, v12

    .line 995
    move v10, v4

    .line 996
    invoke-direct/range {v5 .. v10}, Lpj4;-><init>(Lxf1;Lug0;[B[Lkj1;I)V

    .line 997
    .line 998
    .line 999
    move-object v7, v5

    .line 1000
    :goto_22
    iput-object v7, v0, Ldk1;->n:Lpj4;

    .line 1001
    .line 1002
    if-nez v7, :cond_2f

    .line 1003
    .line 1004
    const/16 v16, 0x1

    .line 1005
    .line 1006
    return v16

    .line 1007
    :cond_2f
    new-instance v1, Ljava/util/ArrayList;

    .line 1008
    .line 1009
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1010
    .line 1011
    .line 1012
    iget-object v3, v7, Lpj4;->g:Ljava/lang/Object;

    .line 1013
    .line 1014
    check-cast v3, Lxf1;

    .line 1015
    .line 1016
    iget-object v4, v3, Lxf1;->g:Ljava/io/Serializable;

    .line 1017
    .line 1018
    check-cast v4, [B

    .line 1019
    .line 1020
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1021
    .line 1022
    .line 1023
    iget-object v4, v7, Lpj4;->i:Ljava/lang/Object;

    .line 1024
    .line 1025
    check-cast v4, [B

    .line 1026
    .line 1027
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1028
    .line 1029
    .line 1030
    iget-object v4, v7, Lpj4;->h:Ljava/lang/Object;

    .line 1031
    .line 1032
    check-cast v4, Lug0;

    .line 1033
    .line 1034
    iget-object v4, v4, Lug0;->g:Ljava/lang/Object;

    .line 1035
    .line 1036
    check-cast v4, [Ljava/lang/String;

    .line 1037
    .line 1038
    invoke-static {v4}, Lxm3;->n([Ljava/lang/Object;)Lsn3;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v4

    .line 1042
    invoke-static {v4}, Lpu1;->A(Ljava/util/List;)Lwn1;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v4

    .line 1046
    new-instance v5, Lgg4;

    .line 1047
    .line 1048
    invoke-direct {v5}, Lgg4;-><init>()V

    .line 1049
    .line 1050
    .line 1051
    const-string v6, "audio/ogg"

    .line 1052
    .line 1053
    invoke-virtual {v5, v6}, Lgg4;->d(Ljava/lang/String;)V

    .line 1054
    .line 1055
    .line 1056
    const-string v6, "audio/vorbis"

    .line 1057
    .line 1058
    invoke-virtual {v5, v6}, Lgg4;->e(Ljava/lang/String;)V

    .line 1059
    .line 1060
    .line 1061
    iget v6, v3, Lxf1;->d:I

    .line 1062
    .line 1063
    iput v6, v5, Lgg4;->g:I

    .line 1064
    .line 1065
    iget v6, v3, Lxf1;->c:I

    .line 1066
    .line 1067
    iput v6, v5, Lgg4;->h:I

    .line 1068
    .line 1069
    iget v6, v3, Lxf1;->a:I

    .line 1070
    .line 1071
    iput v6, v5, Lgg4;->D:I

    .line 1072
    .line 1073
    iget v3, v3, Lxf1;->b:I

    .line 1074
    .line 1075
    iput v3, v5, Lgg4;->E:I

    .line 1076
    .line 1077
    iput-object v1, v5, Lgg4;->o:Ljava/util/List;

    .line 1078
    .line 1079
    iput-object v4, v5, Lgg4;->j:Lwn1;

    .line 1080
    .line 1081
    new-instance v1, Lph4;

    .line 1082
    .line 1083
    invoke-direct {v1, v5}, Lph4;-><init>(Lgg4;)V

    .line 1084
    .line 1085
    .line 1086
    iput-object v1, v2, Ll92;->f:Ljava/lang/Object;

    .line 1087
    .line 1088
    const/16 v16, 0x1

    .line 1089
    .line 1090
    return v16

    .line 1091
    :cond_30
    const-string v1, "framing bit after modes not set as expected"

    .line 1092
    .line 1093
    const/4 v2, 0x0

    .line 1094
    invoke-static {v2, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v1

    .line 1098
    throw v1
.end method

.method public final d(J)V
    .locals 2

    .line 1
    iput-wide p1, p0, Lck1;->g:J

    .line 2
    .line 3
    const-wide/16 v0, 0x0

    .line 4
    .line 5
    cmp-long p1, p1, v0

    .line 6
    .line 7
    const/4 p2, 0x0

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move p1, p2

    .line 13
    :goto_0
    iput-boolean p1, p0, Ldk1;->p:Z

    .line 14
    .line 15
    iget-object p1, p0, Ldk1;->q:Lxf1;

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    iget p2, p1, Lxf1;->e:I

    .line 20
    .line 21
    :cond_1
    iput p2, p0, Ldk1;->o:I

    .line 22
    .line 23
    return-void
.end method
