.class public final Lzm1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Llf1;


# instance fields
.field public final a:Lx13;

.field public final b:Landroid/util/SparseArray;

.field public final c:Lkz2;

.field public final d:Lxm1;

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:J

.field public i:Lzg1;

.field public j:Lnf1;

.field public k:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget v0, Lou1;->u:I

    .line 2
    .line 3
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    new-instance v0, Lx13;

    .line 2
    .line 3
    invoke-direct {v0}, Lx13;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lzm1;->a:Lx13;

    .line 10
    .line 11
    new-instance v0, Lkz2;

    .line 12
    .line 13
    const/16 v1, 0x1000

    .line 14
    .line 15
    invoke-direct {v0, v1}, Lkz2;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lzm1;->c:Lkz2;

    .line 19
    .line 20
    new-instance v0, Landroid/util/SparseArray;

    .line 21
    .line 22
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lzm1;->b:Landroid/util/SparseArray;

    .line 26
    .line 27
    new-instance v0, Lxm1;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-direct {v0, v1}, Lxm1;-><init>(I)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lzm1;->d:Lxm1;

    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public final b(Lmf1;)Z
    .locals 9

    .line 1
    const/16 v0, 0xe

    .line 2
    .line 3
    new-array v1, v0, [B

    .line 4
    .line 5
    check-cast p1, Ldf1;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {p1, v1, v2, v0, v2}, Ldf1;->B([BIIZ)Z

    .line 9
    .line 10
    .line 11
    aget-byte v0, v1, v2

    .line 12
    .line 13
    and-int/lit16 v0, v0, 0xff

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    aget-byte v4, v1, v3

    .line 17
    .line 18
    and-int/lit16 v4, v4, 0xff

    .line 19
    .line 20
    const/4 v5, 0x2

    .line 21
    aget-byte v6, v1, v5

    .line 22
    .line 23
    and-int/lit16 v6, v6, 0xff

    .line 24
    .line 25
    const/4 v7, 0x3

    .line 26
    aget-byte v8, v1, v7

    .line 27
    .line 28
    and-int/lit16 v8, v8, 0xff

    .line 29
    .line 30
    shl-int/lit8 v0, v0, 0x18

    .line 31
    .line 32
    shl-int/lit8 v4, v4, 0x10

    .line 33
    .line 34
    or-int/2addr v0, v4

    .line 35
    const/16 v4, 0x8

    .line 36
    .line 37
    shl-int/2addr v6, v4

    .line 38
    or-int/2addr v0, v6

    .line 39
    or-int/2addr v0, v8

    .line 40
    const/16 v6, 0x1ba

    .line 41
    .line 42
    if-eq v0, v6, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/4 v0, 0x4

    .line 46
    aget-byte v6, v1, v0

    .line 47
    .line 48
    and-int/lit16 v6, v6, 0xc4

    .line 49
    .line 50
    const/16 v8, 0x44

    .line 51
    .line 52
    if-eq v6, v8, :cond_1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    const/4 v6, 0x6

    .line 56
    aget-byte v6, v1, v6

    .line 57
    .line 58
    and-int/2addr v6, v0

    .line 59
    if-eq v6, v0, :cond_2

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    aget-byte v6, v1, v4

    .line 63
    .line 64
    and-int/2addr v6, v0

    .line 65
    if-eq v6, v0, :cond_3

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    const/16 v0, 0x9

    .line 69
    .line 70
    aget-byte v0, v1, v0

    .line 71
    .line 72
    and-int/2addr v0, v3

    .line 73
    if-eq v0, v3, :cond_4

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_4
    const/16 v0, 0xc

    .line 77
    .line 78
    aget-byte v0, v1, v0

    .line 79
    .line 80
    and-int/2addr v0, v7

    .line 81
    if-eq v0, v7, :cond_5

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_5
    const/16 v0, 0xd

    .line 85
    .line 86
    aget-byte v0, v1, v0

    .line 87
    .line 88
    and-int/lit8 v0, v0, 0x7

    .line 89
    .line 90
    invoke-virtual {p1, v0, v2}, Ldf1;->e(IZ)Z

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, v1, v2, v7, v2}, Ldf1;->B([BIIZ)Z

    .line 94
    .line 95
    .line 96
    aget-byte p1, v1, v2

    .line 97
    .line 98
    and-int/lit16 p1, p1, 0xff

    .line 99
    .line 100
    shl-int/lit8 p1, p1, 0x10

    .line 101
    .line 102
    aget-byte v0, v1, v3

    .line 103
    .line 104
    and-int/lit16 v0, v0, 0xff

    .line 105
    .line 106
    shl-int/2addr v0, v4

    .line 107
    aget-byte v1, v1, v5

    .line 108
    .line 109
    and-int/lit16 v1, v1, 0xff

    .line 110
    .line 111
    or-int/2addr p1, v0

    .line 112
    or-int/2addr p1, v1

    .line 113
    if-ne p1, v3, :cond_6

    .line 114
    .line 115
    return v3

    .line 116
    :cond_6
    :goto_0
    return v2
.end method

.method public final c(Lmf1;Lpf1;)I
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    iget-object v3, v0, Lzm1;->j:Lnf1;

    .line 6
    .line 7
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-object/from16 v4, p1

    .line 11
    .line 12
    check-cast v4, Ldf1;

    .line 13
    .line 14
    iget-wide v14, v4, Ldf1;->h:J

    .line 15
    .line 16
    const-wide/16 v19, -0x1

    .line 17
    .line 18
    cmp-long v4, v14, v19

    .line 19
    .line 20
    const/16 v7, 0x1ba

    .line 21
    .line 22
    iget-object v8, v0, Lzm1;->d:Lxm1;

    .line 23
    .line 24
    const-wide/16 v9, 0x0

    .line 25
    .line 26
    const/4 v11, 0x1

    .line 27
    const/4 v12, 0x0

    .line 28
    if-eqz v4, :cond_b

    .line 29
    .line 30
    iget-boolean v13, v8, Lxm1;->c:Z

    .line 31
    .line 32
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    iget-object v5, v8, Lxm1;->b:Lkz2;

    .line 38
    .line 39
    if-eqz v13, :cond_0

    .line 40
    .line 41
    goto/16 :goto_4

    .line 42
    .line 43
    :cond_0
    iget-boolean v3, v8, Lxm1;->e:Z

    .line 44
    .line 45
    const-wide/16 v13, 0x4e20

    .line 46
    .line 47
    if-nez v3, :cond_4

    .line 48
    .line 49
    move-object/from16 v1, p1

    .line 50
    .line 51
    check-cast v1, Ldf1;

    .line 52
    .line 53
    iget-wide v3, v1, Ldf1;->h:J

    .line 54
    .line 55
    invoke-static {v13, v14, v3, v4}, Ljava/lang/Math;->min(JJ)J

    .line 56
    .line 57
    .line 58
    move-result-wide v9

    .line 59
    long-to-int v6, v9

    .line 60
    int-to-long v9, v6

    .line 61
    sub-long/2addr v3, v9

    .line 62
    iget-wide v9, v1, Ldf1;->i:J

    .line 63
    .line 64
    cmp-long v9, v9, v3

    .line 65
    .line 66
    if-eqz v9, :cond_1

    .line 67
    .line 68
    iput-wide v3, v2, Lpf1;->a:J

    .line 69
    .line 70
    return v11

    .line 71
    :cond_1
    invoke-virtual {v5, v6}, Lkz2;->y(I)V

    .line 72
    .line 73
    .line 74
    iput v12, v1, Ldf1;->k:I

    .line 75
    .line 76
    iget-object v2, v5, Lkz2;->a:[B

    .line 77
    .line 78
    invoke-virtual {v1, v2, v12, v6, v12}, Ldf1;->B([BIIZ)Z

    .line 79
    .line 80
    .line 81
    iget v1, v5, Lkz2;->b:I

    .line 82
    .line 83
    iget v2, v5, Lkz2;->c:I

    .line 84
    .line 85
    add-int/lit8 v2, v2, -0x4

    .line 86
    .line 87
    :goto_0
    if-lt v2, v1, :cond_3

    .line 88
    .line 89
    iget-object v3, v5, Lkz2;->a:[B

    .line 90
    .line 91
    invoke-static {v2, v3}, Lxm1;->c(I[B)I

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    if-ne v3, v7, :cond_2

    .line 96
    .line 97
    add-int/lit8 v3, v2, 0x4

    .line 98
    .line 99
    invoke-virtual {v5, v3}, Lkz2;->E(I)V

    .line 100
    .line 101
    .line 102
    invoke-static {v5}, Lxm1;->a(Lkz2;)J

    .line 103
    .line 104
    .line 105
    move-result-wide v3

    .line 106
    cmp-long v6, v3, v16

    .line 107
    .line 108
    if-eqz v6, :cond_2

    .line 109
    .line 110
    move-wide v5, v3

    .line 111
    goto :goto_1

    .line 112
    :cond_2
    add-int/lit8 v2, v2, -0x1

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_3
    move-wide/from16 v5, v16

    .line 116
    .line 117
    :goto_1
    iput-wide v5, v8, Lxm1;->g:J

    .line 118
    .line 119
    iput-boolean v11, v8, Lxm1;->e:Z

    .line 120
    .line 121
    return v12

    .line 122
    :cond_4
    iget-wide v3, v8, Lxm1;->g:J

    .line 123
    .line 124
    cmp-long v3, v3, v16

    .line 125
    .line 126
    if-nez v3, :cond_5

    .line 127
    .line 128
    sget-object v2, Lv23;->b:[B

    .line 129
    .line 130
    array-length v3, v2

    .line 131
    invoke-virtual {v5, v12, v2}, Lkz2;->z(I[B)V

    .line 132
    .line 133
    .line 134
    iput-boolean v11, v8, Lxm1;->c:Z

    .line 135
    .line 136
    move-object/from16 v1, p1

    .line 137
    .line 138
    check-cast v1, Ldf1;

    .line 139
    .line 140
    invoke-virtual {v1}, Ldf1;->i()V

    .line 141
    .line 142
    .line 143
    return v12

    .line 144
    :cond_5
    iget-boolean v3, v8, Lxm1;->d:Z

    .line 145
    .line 146
    if-nez v3, :cond_9

    .line 147
    .line 148
    move-object/from16 v1, p1

    .line 149
    .line 150
    check-cast v1, Ldf1;

    .line 151
    .line 152
    iget-wide v3, v1, Ldf1;->h:J

    .line 153
    .line 154
    invoke-static {v13, v14, v3, v4}, Ljava/lang/Math;->min(JJ)J

    .line 155
    .line 156
    .line 157
    move-result-wide v3

    .line 158
    long-to-int v3, v3

    .line 159
    iget-wide v13, v1, Ldf1;->i:J

    .line 160
    .line 161
    cmp-long v4, v13, v9

    .line 162
    .line 163
    if-eqz v4, :cond_6

    .line 164
    .line 165
    iput-wide v9, v2, Lpf1;->a:J

    .line 166
    .line 167
    return v11

    .line 168
    :cond_6
    invoke-virtual {v5, v3}, Lkz2;->y(I)V

    .line 169
    .line 170
    .line 171
    iput v12, v1, Ldf1;->k:I

    .line 172
    .line 173
    iget-object v2, v5, Lkz2;->a:[B

    .line 174
    .line 175
    invoke-virtual {v1, v2, v12, v3, v12}, Ldf1;->B([BIIZ)Z

    .line 176
    .line 177
    .line 178
    iget v1, v5, Lkz2;->b:I

    .line 179
    .line 180
    iget v2, v5, Lkz2;->c:I

    .line 181
    .line 182
    :goto_2
    add-int/lit8 v3, v2, -0x3

    .line 183
    .line 184
    if-ge v1, v3, :cond_8

    .line 185
    .line 186
    iget-object v3, v5, Lkz2;->a:[B

    .line 187
    .line 188
    invoke-static {v1, v3}, Lxm1;->c(I[B)I

    .line 189
    .line 190
    .line 191
    move-result v3

    .line 192
    if-ne v3, v7, :cond_7

    .line 193
    .line 194
    add-int/lit8 v3, v1, 0x4

    .line 195
    .line 196
    invoke-virtual {v5, v3}, Lkz2;->E(I)V

    .line 197
    .line 198
    .line 199
    invoke-static {v5}, Lxm1;->a(Lkz2;)J

    .line 200
    .line 201
    .line 202
    move-result-wide v3

    .line 203
    cmp-long v6, v3, v16

    .line 204
    .line 205
    if-eqz v6, :cond_7

    .line 206
    .line 207
    move-wide v5, v3

    .line 208
    goto :goto_3

    .line 209
    :cond_7
    add-int/lit8 v1, v1, 0x1

    .line 210
    .line 211
    goto :goto_2

    .line 212
    :cond_8
    move-wide/from16 v5, v16

    .line 213
    .line 214
    :goto_3
    iput-wide v5, v8, Lxm1;->f:J

    .line 215
    .line 216
    iput-boolean v11, v8, Lxm1;->d:Z

    .line 217
    .line 218
    return v12

    .line 219
    :cond_9
    iget-wide v2, v8, Lxm1;->f:J

    .line 220
    .line 221
    cmp-long v4, v2, v16

    .line 222
    .line 223
    if-nez v4, :cond_a

    .line 224
    .line 225
    sget-object v2, Lv23;->b:[B

    .line 226
    .line 227
    array-length v3, v2

    .line 228
    invoke-virtual {v5, v12, v2}, Lkz2;->z(I[B)V

    .line 229
    .line 230
    .line 231
    iput-boolean v11, v8, Lxm1;->c:Z

    .line 232
    .line 233
    move-object/from16 v1, p1

    .line 234
    .line 235
    check-cast v1, Ldf1;

    .line 236
    .line 237
    invoke-virtual {v1}, Ldf1;->i()V

    .line 238
    .line 239
    .line 240
    return v12

    .line 241
    :cond_a
    iget-object v4, v8, Lxm1;->a:Lx13;

    .line 242
    .line 243
    invoke-virtual {v4, v2, v3}, Lx13;->c(J)J

    .line 244
    .line 245
    .line 246
    move-result-wide v2

    .line 247
    iget-wide v6, v8, Lxm1;->g:J

    .line 248
    .line 249
    invoke-virtual {v4, v6, v7}, Lx13;->d(J)J

    .line 250
    .line 251
    .line 252
    move-result-wide v6

    .line 253
    sub-long/2addr v6, v2

    .line 254
    iput-wide v6, v8, Lxm1;->h:J

    .line 255
    .line 256
    sget-object v2, Lv23;->b:[B

    .line 257
    .line 258
    array-length v3, v2

    .line 259
    invoke-virtual {v5, v12, v2}, Lkz2;->z(I[B)V

    .line 260
    .line 261
    .line 262
    iput-boolean v11, v8, Lxm1;->c:Z

    .line 263
    .line 264
    move-object/from16 v1, p1

    .line 265
    .line 266
    check-cast v1, Ldf1;

    .line 267
    .line 268
    invoke-virtual {v1}, Ldf1;->i()V

    .line 269
    .line 270
    .line 271
    return v12

    .line 272
    :cond_b
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    :goto_4
    iget-boolean v5, v0, Lzm1;->k:Z

    .line 278
    .line 279
    if-nez v5, :cond_d

    .line 280
    .line 281
    iput-boolean v11, v0, Lzm1;->k:Z

    .line 282
    .line 283
    iget-wide v5, v8, Lxm1;->h:J

    .line 284
    .line 285
    cmp-long v13, v5, v16

    .line 286
    .line 287
    if-eqz v13, :cond_c

    .line 288
    .line 289
    move-wide/from16 v16, v5

    .line 290
    .line 291
    new-instance v5, Lzg1;

    .line 292
    .line 293
    iget-object v3, v8, Lxm1;->a:Lx13;

    .line 294
    .line 295
    new-instance v6, Lus0;

    .line 296
    .line 297
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 298
    .line 299
    .line 300
    move v8, v7

    .line 301
    new-instance v7, Lgw3;

    .line 302
    .line 303
    invoke-direct {v7, v3}, Lgw3;-><init>(Lx13;)V

    .line 304
    .line 305
    .line 306
    const-wide/16 v21, 0x1

    .line 307
    .line 308
    add-long v21, v16, v21

    .line 309
    .line 310
    move v3, v8

    .line 311
    move-wide/from16 v23, v9

    .line 312
    .line 313
    move-wide/from16 v8, v16

    .line 314
    .line 315
    const-wide/16 v16, 0xbc

    .line 316
    .line 317
    const/16 v18, 0x3e8

    .line 318
    .line 319
    move v10, v12

    .line 320
    const-wide/16 v12, 0x0

    .line 321
    .line 322
    move-wide/from16 v10, v21

    .line 323
    .line 324
    move-wide/from16 v1, v23

    .line 325
    .line 326
    invoke-direct/range {v5 .. v18}, Lzg1;-><init>(Lye1;Laf1;JJJJJI)V

    .line 327
    .line 328
    .line 329
    iput-object v5, v0, Lzm1;->i:Lzg1;

    .line 330
    .line 331
    iget-object v6, v0, Lzm1;->j:Lnf1;

    .line 332
    .line 333
    iget-object v5, v5, Lzg1;->a:Lwe1;

    .line 334
    .line 335
    invoke-interface {v6, v5}, Lnf1;->v(Lcg1;)V

    .line 336
    .line 337
    .line 338
    move v5, v3

    .line 339
    goto :goto_5

    .line 340
    :cond_c
    move-wide v1, v9

    .line 341
    move-wide v8, v5

    .line 342
    move v5, v7

    .line 343
    new-instance v6, Lqf1;

    .line 344
    .line 345
    invoke-direct {v6, v8, v9, v1, v2}, Lqf1;-><init>(JJ)V

    .line 346
    .line 347
    .line 348
    invoke-interface {v3, v6}, Lnf1;->v(Lcg1;)V

    .line 349
    .line 350
    .line 351
    goto :goto_5

    .line 352
    :cond_d
    move v5, v7

    .line 353
    move-wide v1, v9

    .line 354
    :goto_5
    iget-object v3, v0, Lzm1;->i:Lzg1;

    .line 355
    .line 356
    if-eqz v3, :cond_e

    .line 357
    .line 358
    iget-object v6, v3, Lzg1;->c:Lxe1;

    .line 359
    .line 360
    if-eqz v6, :cond_e

    .line 361
    .line 362
    move-object/from16 v6, p1

    .line 363
    .line 364
    move-object/from16 v7, p2

    .line 365
    .line 366
    invoke-virtual {v3, v6, v7}, Lzg1;->b(Lmf1;Lpf1;)I

    .line 367
    .line 368
    .line 369
    move-result v1

    .line 370
    return v1

    .line 371
    :cond_e
    move-object/from16 v6, p1

    .line 372
    .line 373
    move-object v3, v6

    .line 374
    check-cast v3, Ldf1;

    .line 375
    .line 376
    const/4 v10, 0x0

    .line 377
    iput v10, v3, Ldf1;->k:I

    .line 378
    .line 379
    if-eqz v4, :cond_f

    .line 380
    .line 381
    invoke-virtual {v3}, Ldf1;->n()J

    .line 382
    .line 383
    .line 384
    move-result-wide v6

    .line 385
    sub-long/2addr v14, v6

    .line 386
    goto :goto_6

    .line 387
    :cond_f
    move-wide/from16 v14, v19

    .line 388
    .line 389
    :goto_6
    cmp-long v4, v14, v19

    .line 390
    .line 391
    if-eqz v4, :cond_10

    .line 392
    .line 393
    const-wide/16 v6, 0x4

    .line 394
    .line 395
    cmp-long v4, v14, v6

    .line 396
    .line 397
    if-ltz v4, :cond_12

    .line 398
    .line 399
    :cond_10
    iget-object v4, v0, Lzm1;->c:Lkz2;

    .line 400
    .line 401
    iget-object v6, v4, Lkz2;->a:[B

    .line 402
    .line 403
    const/4 v7, 0x4

    .line 404
    const/4 v8, 0x1

    .line 405
    invoke-virtual {v3, v6, v10, v7, v8}, Ldf1;->B([BIIZ)Z

    .line 406
    .line 407
    .line 408
    move-result v6

    .line 409
    if-nez v6, :cond_11

    .line 410
    .line 411
    goto :goto_7

    .line 412
    :cond_11
    invoke-virtual {v4, v10}, Lkz2;->E(I)V

    .line 413
    .line 414
    .line 415
    invoke-virtual {v4}, Lkz2;->b()I

    .line 416
    .line 417
    .line 418
    move-result v6

    .line 419
    const/16 v9, 0x1b9

    .line 420
    .line 421
    if-ne v6, v9, :cond_13

    .line 422
    .line 423
    :cond_12
    :goto_7
    const/4 v1, -0x1

    .line 424
    return v1

    .line 425
    :cond_13
    if-ne v6, v5, :cond_14

    .line 426
    .line 427
    iget-object v1, v4, Lkz2;->a:[B

    .line 428
    .line 429
    const/16 v2, 0xa

    .line 430
    .line 431
    invoke-virtual {v3, v1, v10, v2, v10}, Ldf1;->B([BIIZ)Z

    .line 432
    .line 433
    .line 434
    const/16 v1, 0x9

    .line 435
    .line 436
    invoke-virtual {v4, v1}, Lkz2;->E(I)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v4}, Lkz2;->K()I

    .line 440
    .line 441
    .line 442
    move-result v1

    .line 443
    and-int/lit8 v1, v1, 0x7

    .line 444
    .line 445
    add-int/lit8 v1, v1, 0xe

    .line 446
    .line 447
    invoke-virtual {v3, v1, v10}, Ldf1;->c(IZ)Z

    .line 448
    .line 449
    .line 450
    return v10

    .line 451
    :cond_14
    const/16 v5, 0x1bb

    .line 452
    .line 453
    const/4 v9, 0x2

    .line 454
    const/4 v11, 0x6

    .line 455
    if-ne v6, v5, :cond_15

    .line 456
    .line 457
    iget-object v1, v4, Lkz2;->a:[B

    .line 458
    .line 459
    invoke-virtual {v3, v1, v10, v9, v10}, Ldf1;->B([BIIZ)Z

    .line 460
    .line 461
    .line 462
    invoke-virtual {v4, v10}, Lkz2;->E(I)V

    .line 463
    .line 464
    .line 465
    invoke-virtual {v4}, Lkz2;->L()I

    .line 466
    .line 467
    .line 468
    move-result v1

    .line 469
    add-int/2addr v1, v11

    .line 470
    invoke-virtual {v3, v1, v10}, Ldf1;->c(IZ)Z

    .line 471
    .line 472
    .line 473
    return v10

    .line 474
    :cond_15
    shr-int/lit8 v5, v6, 0x8

    .line 475
    .line 476
    if-eq v5, v8, :cond_16

    .line 477
    .line 478
    invoke-virtual {v3, v8, v10}, Ldf1;->c(IZ)Z

    .line 479
    .line 480
    .line 481
    return v10

    .line 482
    :cond_16
    and-int/lit16 v5, v6, 0xff

    .line 483
    .line 484
    iget-object v12, v0, Lzm1;->b:Landroid/util/SparseArray;

    .line 485
    .line 486
    invoke-virtual {v12, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v13

    .line 490
    check-cast v13, Lym1;

    .line 491
    .line 492
    iget-boolean v14, v0, Lzm1;->e:Z

    .line 493
    .line 494
    if-nez v14, :cond_1c

    .line 495
    .line 496
    if-nez v13, :cond_1a

    .line 497
    .line 498
    const/16 v14, 0xbd

    .line 499
    .line 500
    const-string v15, "video/mp2p"

    .line 501
    .line 502
    const/4 v1, 0x0

    .line 503
    if-ne v5, v14, :cond_17

    .line 504
    .line 505
    new-instance v2, Lzl1;

    .line 506
    .line 507
    const/4 v6, 0x0

    .line 508
    invoke-direct {v2, v10, v6, v1, v15}, Lzl1;-><init>(IILjava/lang/String;Ljava/lang/String;)V

    .line 509
    .line 510
    .line 511
    iput-boolean v8, v0, Lzm1;->f:Z

    .line 512
    .line 513
    iget-wide v14, v3, Ldf1;->i:J

    .line 514
    .line 515
    iput-wide v14, v0, Lzm1;->h:J

    .line 516
    .line 517
    :goto_8
    move-object v1, v2

    .line 518
    goto :goto_9

    .line 519
    :cond_17
    and-int/lit16 v2, v6, 0xe0

    .line 520
    .line 521
    const/16 v14, 0xc0

    .line 522
    .line 523
    if-ne v2, v14, :cond_18

    .line 524
    .line 525
    new-instance v2, Lum1;

    .line 526
    .line 527
    invoke-direct {v2, v10, v1, v15}, Lum1;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 528
    .line 529
    .line 530
    iput-boolean v8, v0, Lzm1;->f:Z

    .line 531
    .line 532
    iget-wide v14, v3, Ldf1;->i:J

    .line 533
    .line 534
    iput-wide v14, v0, Lzm1;->h:J

    .line 535
    .line 536
    goto :goto_8

    .line 537
    :cond_18
    and-int/lit16 v2, v6, 0xf0

    .line 538
    .line 539
    const/16 v6, 0xe0

    .line 540
    .line 541
    if-ne v2, v6, :cond_19

    .line 542
    .line 543
    new-instance v2, Lim1;

    .line 544
    .line 545
    invoke-direct {v2, v1, v15}, Lim1;-><init>(Lxb4;Ljava/lang/String;)V

    .line 546
    .line 547
    .line 548
    iput-boolean v8, v0, Lzm1;->g:Z

    .line 549
    .line 550
    iget-wide v14, v3, Ldf1;->i:J

    .line 551
    .line 552
    iput-wide v14, v0, Lzm1;->h:J

    .line 553
    .line 554
    goto :goto_8

    .line 555
    :cond_19
    :goto_9
    if-eqz v1, :cond_1a

    .line 556
    .line 557
    new-instance v2, Lin1;

    .line 558
    .line 559
    const/high16 v6, -0x80000000

    .line 560
    .line 561
    const/16 v13, 0x100

    .line 562
    .line 563
    invoke-direct {v2, v6, v5, v13}, Lin1;-><init>(III)V

    .line 564
    .line 565
    .line 566
    iget-object v6, v0, Lzm1;->j:Lnf1;

    .line 567
    .line 568
    invoke-interface {v1, v6, v2}, Lgm1;->e(Lnf1;Lin1;)V

    .line 569
    .line 570
    .line 571
    new-instance v13, Lym1;

    .line 572
    .line 573
    iget-object v2, v0, Lzm1;->a:Lx13;

    .line 574
    .line 575
    invoke-direct {v13, v1, v2}, Lym1;-><init>(Lgm1;Lx13;)V

    .line 576
    .line 577
    .line 578
    invoke-virtual {v12, v5, v13}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 579
    .line 580
    .line 581
    :cond_1a
    iget-boolean v1, v0, Lzm1;->f:Z

    .line 582
    .line 583
    const-wide/32 v5, 0x100000

    .line 584
    .line 585
    .line 586
    if-eqz v1, :cond_1b

    .line 587
    .line 588
    iget-boolean v1, v0, Lzm1;->g:Z

    .line 589
    .line 590
    if-eqz v1, :cond_1b

    .line 591
    .line 592
    iget-wide v1, v0, Lzm1;->h:J

    .line 593
    .line 594
    const-wide/16 v5, 0x2000

    .line 595
    .line 596
    add-long/2addr v5, v1

    .line 597
    :cond_1b
    iget-wide v1, v3, Ldf1;->i:J

    .line 598
    .line 599
    cmp-long v1, v1, v5

    .line 600
    .line 601
    if-lez v1, :cond_1c

    .line 602
    .line 603
    iput-boolean v8, v0, Lzm1;->e:Z

    .line 604
    .line 605
    iget-object v1, v0, Lzm1;->j:Lnf1;

    .line 606
    .line 607
    invoke-interface {v1}, Lnf1;->s()V

    .line 608
    .line 609
    .line 610
    :cond_1c
    iget-object v1, v4, Lkz2;->a:[B

    .line 611
    .line 612
    invoke-virtual {v3, v1, v10, v9, v10}, Ldf1;->B([BIIZ)Z

    .line 613
    .line 614
    .line 615
    invoke-virtual {v4, v10}, Lkz2;->E(I)V

    .line 616
    .line 617
    .line 618
    invoke-virtual {v4}, Lkz2;->L()I

    .line 619
    .line 620
    .line 621
    move-result v1

    .line 622
    add-int/2addr v1, v11

    .line 623
    if-nez v13, :cond_1d

    .line 624
    .line 625
    invoke-virtual {v3, v1, v10}, Ldf1;->c(IZ)Z

    .line 626
    .line 627
    .line 628
    return v10

    .line 629
    :cond_1d
    invoke-virtual {v4, v1}, Lkz2;->y(I)V

    .line 630
    .line 631
    .line 632
    iget-object v2, v4, Lkz2;->a:[B

    .line 633
    .line 634
    invoke-virtual {v3, v2, v10, v1, v10}, Ldf1;->w([BIIZ)Z

    .line 635
    .line 636
    .line 637
    invoke-virtual {v4, v11}, Lkz2;->E(I)V

    .line 638
    .line 639
    .line 640
    iget-object v1, v13, Lym1;->b:Lx13;

    .line 641
    .line 642
    iget-object v2, v13, Lym1;->c:Llg1;

    .line 643
    .line 644
    iget-object v3, v2, Llg1;->a:[B

    .line 645
    .line 646
    const/4 v5, 0x3

    .line 647
    invoke-virtual {v4, v3, v10, v5}, Lkz2;->H([BII)V

    .line 648
    .line 649
    .line 650
    invoke-virtual {v2, v10}, Llg1;->l(I)V

    .line 651
    .line 652
    .line 653
    const/16 v3, 0x8

    .line 654
    .line 655
    invoke-virtual {v2, v3}, Llg1;->o(I)V

    .line 656
    .line 657
    .line 658
    invoke-virtual {v2}, Llg1;->q()Z

    .line 659
    .line 660
    .line 661
    move-result v6

    .line 662
    iput-boolean v6, v13, Lym1;->d:Z

    .line 663
    .line 664
    invoke-virtual {v2}, Llg1;->q()Z

    .line 665
    .line 666
    .line 667
    move-result v6

    .line 668
    iput-boolean v6, v13, Lym1;->e:Z

    .line 669
    .line 670
    invoke-virtual {v2, v11}, Llg1;->o(I)V

    .line 671
    .line 672
    .line 673
    invoke-virtual {v2, v3}, Llg1;->r(I)I

    .line 674
    .line 675
    .line 676
    move-result v3

    .line 677
    iget-object v6, v2, Llg1;->a:[B

    .line 678
    .line 679
    invoke-virtual {v4, v6, v10, v3}, Lkz2;->H([BII)V

    .line 680
    .line 681
    .line 682
    invoke-virtual {v2, v10}, Llg1;->l(I)V

    .line 683
    .line 684
    .line 685
    iget-boolean v3, v13, Lym1;->d:Z

    .line 686
    .line 687
    if-eqz v3, :cond_1f

    .line 688
    .line 689
    invoke-virtual {v2, v7}, Llg1;->o(I)V

    .line 690
    .line 691
    .line 692
    invoke-virtual {v2, v5}, Llg1;->r(I)I

    .line 693
    .line 694
    .line 695
    move-result v3

    .line 696
    int-to-long v11, v3

    .line 697
    invoke-virtual {v2, v8}, Llg1;->o(I)V

    .line 698
    .line 699
    .line 700
    const/16 v3, 0xf

    .line 701
    .line 702
    invoke-virtual {v2, v3}, Llg1;->r(I)I

    .line 703
    .line 704
    .line 705
    move-result v6

    .line 706
    shl-int/2addr v6, v3

    .line 707
    invoke-virtual {v2, v8}, Llg1;->o(I)V

    .line 708
    .line 709
    .line 710
    invoke-virtual {v2, v3}, Llg1;->r(I)I

    .line 711
    .line 712
    .line 713
    move-result v9

    .line 714
    int-to-long v14, v9

    .line 715
    invoke-virtual {v2, v8}, Llg1;->o(I)V

    .line 716
    .line 717
    .line 718
    iget-boolean v9, v13, Lym1;->f:Z

    .line 719
    .line 720
    const/16 v16, 0x1e

    .line 721
    .line 722
    if-nez v9, :cond_1e

    .line 723
    .line 724
    iget-boolean v9, v13, Lym1;->e:Z

    .line 725
    .line 726
    if-eqz v9, :cond_1e

    .line 727
    .line 728
    invoke-virtual {v2, v7}, Llg1;->o(I)V

    .line 729
    .line 730
    .line 731
    invoke-virtual {v2, v5}, Llg1;->r(I)I

    .line 732
    .line 733
    .line 734
    move-result v5

    .line 735
    move-wide/from16 v17, v11

    .line 736
    .line 737
    int-to-long v10, v5

    .line 738
    shl-long v9, v10, v16

    .line 739
    .line 740
    invoke-virtual {v2, v8}, Llg1;->o(I)V

    .line 741
    .line 742
    .line 743
    invoke-virtual {v2, v3}, Llg1;->r(I)I

    .line 744
    .line 745
    .line 746
    move-result v5

    .line 747
    shl-int/2addr v5, v3

    .line 748
    invoke-virtual {v2, v8}, Llg1;->o(I)V

    .line 749
    .line 750
    .line 751
    invoke-virtual {v2, v3}, Llg1;->r(I)I

    .line 752
    .line 753
    .line 754
    move-result v3

    .line 755
    int-to-long v11, v3

    .line 756
    invoke-virtual {v2, v8}, Llg1;->o(I)V

    .line 757
    .line 758
    .line 759
    int-to-long v2, v5

    .line 760
    or-long/2addr v2, v9

    .line 761
    or-long/2addr v2, v11

    .line 762
    invoke-virtual {v1, v2, v3}, Lx13;->c(J)J

    .line 763
    .line 764
    .line 765
    iput-boolean v8, v13, Lym1;->f:Z

    .line 766
    .line 767
    goto :goto_a

    .line 768
    :cond_1e
    move-wide/from16 v17, v11

    .line 769
    .line 770
    :goto_a
    shl-long v2, v17, v16

    .line 771
    .line 772
    int-to-long v5, v6

    .line 773
    or-long/2addr v2, v5

    .line 774
    or-long/2addr v2, v14

    .line 775
    invoke-virtual {v1, v2, v3}, Lx13;->c(J)J

    .line 776
    .line 777
    .line 778
    move-result-wide v9

    .line 779
    goto :goto_b

    .line 780
    :cond_1f
    const-wide/16 v9, 0x0

    .line 781
    .line 782
    :goto_b
    iget-object v1, v13, Lym1;->a:Lgm1;

    .line 783
    .line 784
    invoke-interface {v1, v7, v9, v10}, Lgm1;->d(IJ)V

    .line 785
    .line 786
    .line 787
    invoke-interface {v1, v4}, Lgm1;->b(Lkz2;)V

    .line 788
    .line 789
    .line 790
    const/4 v10, 0x0

    .line 791
    invoke-interface {v1, v10}, Lgm1;->c(Z)V

    .line 792
    .line 793
    .line 794
    iget-object v1, v4, Lkz2;->a:[B

    .line 795
    .line 796
    array-length v1, v1

    .line 797
    invoke-virtual {v4, v1}, Lkz2;->C(I)V

    .line 798
    .line 799
    .line 800
    return v10
.end method

.method public final e(JJ)V
    .locals 4

    .line 1
    iget-object p1, p0, Lzm1;->a:Lx13;

    .line 2
    .line 3
    monitor-enter p1

    .line 4
    :try_start_0
    iget-wide v0, p1, Lx13;->b:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    monitor-exit p1

    .line 7
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    cmp-long p2, v0, v2

    .line 13
    .line 14
    if-eqz p2, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Lx13;->a()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    cmp-long p2, v0, v2

    .line 21
    .line 22
    if-eqz p2, :cond_1

    .line 23
    .line 24
    const-wide/16 v2, 0x0

    .line 25
    .line 26
    cmp-long p2, v0, v2

    .line 27
    .line 28
    if-eqz p2, :cond_1

    .line 29
    .line 30
    cmp-long p2, v0, p3

    .line 31
    .line 32
    if-eqz p2, :cond_1

    .line 33
    .line 34
    :cond_0
    invoke-virtual {p1, p3, p4}, Lx13;->b(J)V

    .line 35
    .line 36
    .line 37
    :cond_1
    iget-object p1, p0, Lzm1;->i:Lzg1;

    .line 38
    .line 39
    const/4 p2, 0x0

    .line 40
    if-eqz p1, :cond_2

    .line 41
    .line 42
    invoke-virtual {p1, p3, p4}, Lzg1;->a(J)V

    .line 43
    .line 44
    .line 45
    :cond_2
    move p1, p2

    .line 46
    :goto_0
    iget-object p3, p0, Lzm1;->b:Landroid/util/SparseArray;

    .line 47
    .line 48
    invoke-virtual {p3}, Landroid/util/SparseArray;->size()I

    .line 49
    .line 50
    .line 51
    move-result p4

    .line 52
    if-ge p1, p4, :cond_3

    .line 53
    .line 54
    invoke-virtual {p3, p1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p3

    .line 58
    check-cast p3, Lym1;

    .line 59
    .line 60
    iput-boolean p2, p3, Lym1;->f:Z

    .line 61
    .line 62
    iget-object p3, p3, Lym1;->a:Lgm1;

    .line 63
    .line 64
    invoke-interface {p3}, Lgm1;->a()V

    .line 65
    .line 66
    .line 67
    add-int/lit8 p1, p1, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_3
    return-void

    .line 71
    :catchall_0
    move-exception p2

    .line 72
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 73
    throw p2
.end method

.method public final f(Lnf1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lzm1;->j:Lnf1;

    .line 2
    .line 3
    return-void
.end method
