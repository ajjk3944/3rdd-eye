.class public final Lgn1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Llf1;


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Lkz2;

.field public final c:Landroid/util/SparseIntArray;

.field public final d:Ldm1;

.field public final e:Lus0;

.field public final f:Landroid/util/SparseArray;

.field public final g:Landroid/util/SparseBooleanArray;

.field public final h:Landroid/util/SparseBooleanArray;

.field public final i:Lxm1;

.field public j:Lzg1;

.field public k:Lnf1;

.field public l:Z

.field public m:Z

.field public n:Z

.field public o:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget v0, Lpu1;->u:I

    .line 2
    .line 3
    return-void
.end method

.method public constructor <init>(Lus0;Lx13;Ldm1;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lgn1;->d:Ldm1;

    .line 5
    .line 6
    iput-object p1, p0, Lgn1;->e:Lus0;

    .line 7
    .line 8
    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lgn1;->a:Ljava/util/List;

    .line 13
    .line 14
    new-instance p1, Lkz2;

    .line 15
    .line 16
    const/16 p2, 0x24b8

    .line 17
    .line 18
    new-array p2, p2, [B

    .line 19
    .line 20
    const/4 p3, 0x0

    .line 21
    invoke-direct {p1, p3, p2}, Lkz2;-><init>(I[B)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lgn1;->b:Lkz2;

    .line 25
    .line 26
    new-instance p1, Landroid/util/SparseBooleanArray;

    .line 27
    .line 28
    invoke-direct {p1}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lgn1;->g:Landroid/util/SparseBooleanArray;

    .line 32
    .line 33
    new-instance p2, Landroid/util/SparseBooleanArray;

    .line 34
    .line 35
    invoke-direct {p2}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object p2, p0, Lgn1;->h:Landroid/util/SparseBooleanArray;

    .line 39
    .line 40
    new-instance p2, Landroid/util/SparseArray;

    .line 41
    .line 42
    invoke-direct {p2}, Landroid/util/SparseArray;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object p2, p0, Lgn1;->f:Landroid/util/SparseArray;

    .line 46
    .line 47
    new-instance v0, Landroid/util/SparseIntArray;

    .line 48
    .line 49
    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object v0, p0, Lgn1;->c:Landroid/util/SparseIntArray;

    .line 53
    .line 54
    new-instance v0, Lxm1;

    .line 55
    .line 56
    const/4 v1, 0x1

    .line 57
    invoke-direct {v0, v1}, Lxm1;-><init>(I)V

    .line 58
    .line 59
    .line 60
    iput-object v0, p0, Lgn1;->i:Lxm1;

    .line 61
    .line 62
    sget-object v0, Lnf1;->d:Lts0;

    .line 63
    .line 64
    iput-object v0, p0, Lgn1;->k:Lnf1;

    .line 65
    .line 66
    const/4 v0, -0x1

    .line 67
    iput v0, p0, Lgn1;->o:I

    .line 68
    .line 69
    invoke-virtual {p1}, Landroid/util/SparseBooleanArray;->clear()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p2}, Landroid/util/SparseArray;->clear()V

    .line 73
    .line 74
    .line 75
    new-instance p1, Landroid/util/SparseArray;

    .line 76
    .line 77
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    move v0, p3

    .line 85
    :goto_0
    if-ge v0, p2, :cond_0

    .line 86
    .line 87
    iget-object v1, p0, Lgn1;->f:Landroid/util/SparseArray;

    .line 88
    .line 89
    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->keyAt(I)I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    check-cast v3, Ljn1;

    .line 98
    .line 99
    invoke-virtual {v1, v2, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    add-int/lit8 v0, v0, 0x1

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_0
    iget-object p1, p0, Lgn1;->f:Landroid/util/SparseArray;

    .line 106
    .line 107
    new-instance p2, Lbn1;

    .line 108
    .line 109
    new-instance v0, Ll92;

    .line 110
    .line 111
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 112
    .line 113
    .line 114
    iput-object p0, v0, Ll92;->g:Ljava/lang/Object;

    .line 115
    .line 116
    new-instance v1, Llg1;

    .line 117
    .line 118
    const/4 v2, 0x4

    .line 119
    new-array v3, v2, [B

    .line 120
    .line 121
    invoke-direct {v1, v2, v3}, Llg1;-><init>(I[B)V

    .line 122
    .line 123
    .line 124
    iput-object v1, v0, Ll92;->f:Ljava/lang/Object;

    .line 125
    .line 126
    invoke-direct {p2, v0}, Lbn1;-><init>(Lan1;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1, p3, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    return-void
.end method


# virtual methods
.method public final b(Lmf1;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lgn1;->b:Lkz2;

    .line 2
    .line 3
    iget-object v0, v0, Lkz2;->a:[B

    .line 4
    .line 5
    check-cast p1, Ldf1;

    .line 6
    .line 7
    const/16 v1, 0x3ac

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {p1, v0, v2, v1, v2}, Ldf1;->B([BIIZ)Z

    .line 11
    .line 12
    .line 13
    move v1, v2

    .line 14
    :goto_0
    const/16 v3, 0xbc

    .line 15
    .line 16
    if-ge v1, v3, :cond_2

    .line 17
    .line 18
    move v3, v2

    .line 19
    :goto_1
    const/4 v4, 0x5

    .line 20
    if-ge v3, v4, :cond_1

    .line 21
    .line 22
    mul-int/lit16 v4, v3, 0xbc

    .line 23
    .line 24
    add-int/2addr v4, v1

    .line 25
    aget-byte v4, v0, v4

    .line 26
    .line 27
    const/16 v5, 0x47

    .line 28
    .line 29
    if-eq v4, v5, :cond_0

    .line 30
    .line 31
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-virtual {p1, v1, v2}, Ldf1;->c(IZ)Z

    .line 38
    .line 39
    .line 40
    const/4 p1, 0x1

    .line 41
    return p1

    .line 42
    :cond_2
    return v2
.end method

.method public final c(Lmf1;Lpf1;)I
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object v3, v1

    .line 8
    check-cast v3, Ldf1;

    .line 9
    .line 10
    iget-wide v13, v3, Ldf1;->h:J

    .line 11
    .line 12
    iget-boolean v3, v0, Lgn1;->l:Z

    .line 13
    .line 14
    const/16 v4, 0x47

    .line 15
    .line 16
    const-wide/16 v18, -0x1

    .line 17
    .line 18
    const/4 v5, 0x1

    .line 19
    const/4 v6, 0x0

    .line 20
    if-eqz v3, :cond_16

    .line 21
    .line 22
    cmp-long v3, v13, v18

    .line 23
    .line 24
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    iget-object v9, v0, Lgn1;->i:Lxm1;

    .line 30
    .line 31
    const-wide/16 v10, 0x0

    .line 32
    .line 33
    if-eqz v3, :cond_0

    .line 34
    .line 35
    iget-boolean v3, v9, Lxm1;->c:Z

    .line 36
    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    :cond_0
    move-wide/from16 v16, v7

    .line 40
    .line 41
    goto/16 :goto_7

    .line 42
    .line 43
    :cond_1
    iget v3, v0, Lgn1;->o:I

    .line 44
    .line 45
    iget-object v12, v9, Lxm1;->b:Lkz2;

    .line 46
    .line 47
    if-gtz v3, :cond_2

    .line 48
    .line 49
    invoke-virtual {v9, v1}, Lxm1;->b(Lmf1;)V

    .line 50
    .line 51
    .line 52
    return v6

    .line 53
    :cond_2
    iget-boolean v13, v9, Lxm1;->e:Z

    .line 54
    .line 55
    const-wide/32 v14, 0x1b8a0

    .line 56
    .line 57
    .line 58
    if-nez v13, :cond_9

    .line 59
    .line 60
    check-cast v1, Ldf1;

    .line 61
    .line 62
    iget-wide v10, v1, Ldf1;->h:J

    .line 63
    .line 64
    invoke-static {v14, v15, v10, v11}, Ljava/lang/Math;->min(JJ)J

    .line 65
    .line 66
    .line 67
    move-result-wide v13

    .line 68
    long-to-int v13, v13

    .line 69
    int-to-long v14, v13

    .line 70
    sub-long/2addr v10, v14

    .line 71
    iget-wide v14, v1, Ldf1;->i:J

    .line 72
    .line 73
    cmp-long v14, v14, v10

    .line 74
    .line 75
    if-eqz v14, :cond_3

    .line 76
    .line 77
    iput-wide v10, v2, Lpf1;->a:J

    .line 78
    .line 79
    return v5

    .line 80
    :cond_3
    invoke-virtual {v12, v13}, Lkz2;->y(I)V

    .line 81
    .line 82
    .line 83
    iput v6, v1, Ldf1;->k:I

    .line 84
    .line 85
    iget-object v2, v12, Lkz2;->a:[B

    .line 86
    .line 87
    invoke-virtual {v1, v2, v6, v13, v6}, Ldf1;->B([BIIZ)Z

    .line 88
    .line 89
    .line 90
    iget v1, v12, Lkz2;->b:I

    .line 91
    .line 92
    iget v2, v12, Lkz2;->c:I

    .line 93
    .line 94
    add-int/lit16 v10, v2, -0xbc

    .line 95
    .line 96
    :goto_0
    if-lt v10, v1, :cond_8

    .line 97
    .line 98
    iget-object v11, v12, Lkz2;->a:[B

    .line 99
    .line 100
    const/4 v13, -0x4

    .line 101
    move v14, v6

    .line 102
    :goto_1
    const/4 v15, 0x4

    .line 103
    if-gt v13, v15, :cond_7

    .line 104
    .line 105
    mul-int/lit16 v15, v13, 0xbc

    .line 106
    .line 107
    add-int/2addr v15, v10

    .line 108
    if-lt v15, v1, :cond_4

    .line 109
    .line 110
    if-ge v15, v2, :cond_4

    .line 111
    .line 112
    aget-byte v15, v11, v15

    .line 113
    .line 114
    if-eq v15, v4, :cond_5

    .line 115
    .line 116
    :cond_4
    move v14, v6

    .line 117
    goto :goto_2

    .line 118
    :cond_5
    add-int/2addr v14, v5

    .line 119
    const/4 v15, 0x5

    .line 120
    if-ne v14, v15, :cond_6

    .line 121
    .line 122
    invoke-static {v12, v10, v3}, Lg82;->z(Lkz2;II)J

    .line 123
    .line 124
    .line 125
    move-result-wide v13

    .line 126
    cmp-long v11, v13, v7

    .line 127
    .line 128
    if-eqz v11, :cond_7

    .line 129
    .line 130
    move-wide v7, v13

    .line 131
    goto :goto_3

    .line 132
    :cond_6
    :goto_2
    add-int/lit8 v13, v13, 0x1

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_7
    add-int/lit8 v10, v10, -0x1

    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_8
    :goto_3
    iput-wide v7, v9, Lxm1;->g:J

    .line 139
    .line 140
    iput-boolean v5, v9, Lxm1;->e:Z

    .line 141
    .line 142
    return v6

    .line 143
    :cond_9
    move-wide/from16 v16, v7

    .line 144
    .line 145
    iget-wide v7, v9, Lxm1;->g:J

    .line 146
    .line 147
    cmp-long v7, v7, v16

    .line 148
    .line 149
    if-nez v7, :cond_a

    .line 150
    .line 151
    invoke-virtual {v9, v1}, Lxm1;->b(Lmf1;)V

    .line 152
    .line 153
    .line 154
    return v6

    .line 155
    :cond_a
    iget-boolean v7, v9, Lxm1;->d:Z

    .line 156
    .line 157
    if-nez v7, :cond_f

    .line 158
    .line 159
    check-cast v1, Ldf1;

    .line 160
    .line 161
    iget-wide v7, v1, Ldf1;->h:J

    .line 162
    .line 163
    invoke-static {v14, v15, v7, v8}, Ljava/lang/Math;->min(JJ)J

    .line 164
    .line 165
    .line 166
    move-result-wide v7

    .line 167
    long-to-int v7, v7

    .line 168
    iget-wide v13, v1, Ldf1;->i:J

    .line 169
    .line 170
    cmp-long v8, v13, v10

    .line 171
    .line 172
    if-eqz v8, :cond_b

    .line 173
    .line 174
    iput-wide v10, v2, Lpf1;->a:J

    .line 175
    .line 176
    return v5

    .line 177
    :cond_b
    invoke-virtual {v12, v7}, Lkz2;->y(I)V

    .line 178
    .line 179
    .line 180
    iput v6, v1, Ldf1;->k:I

    .line 181
    .line 182
    iget-object v2, v12, Lkz2;->a:[B

    .line 183
    .line 184
    invoke-virtual {v1, v2, v6, v7, v6}, Ldf1;->B([BIIZ)Z

    .line 185
    .line 186
    .line 187
    iget v1, v12, Lkz2;->b:I

    .line 188
    .line 189
    iget v2, v12, Lkz2;->c:I

    .line 190
    .line 191
    :goto_4
    if-ge v1, v2, :cond_e

    .line 192
    .line 193
    iget-object v7, v12, Lkz2;->a:[B

    .line 194
    .line 195
    aget-byte v7, v7, v1

    .line 196
    .line 197
    if-eq v7, v4, :cond_c

    .line 198
    .line 199
    goto :goto_5

    .line 200
    :cond_c
    invoke-static {v12, v1, v3}, Lg82;->z(Lkz2;II)J

    .line 201
    .line 202
    .line 203
    move-result-wide v7

    .line 204
    cmp-long v10, v7, v16

    .line 205
    .line 206
    if-eqz v10, :cond_d

    .line 207
    .line 208
    goto :goto_6

    .line 209
    :cond_d
    :goto_5
    add-int/lit8 v1, v1, 0x1

    .line 210
    .line 211
    goto :goto_4

    .line 212
    :cond_e
    move-wide/from16 v7, v16

    .line 213
    .line 214
    :goto_6
    iput-wide v7, v9, Lxm1;->f:J

    .line 215
    .line 216
    iput-boolean v5, v9, Lxm1;->d:Z

    .line 217
    .line 218
    return v6

    .line 219
    :cond_f
    iget-wide v2, v9, Lxm1;->f:J

    .line 220
    .line 221
    cmp-long v4, v2, v16

    .line 222
    .line 223
    if-nez v4, :cond_10

    .line 224
    .line 225
    invoke-virtual {v9, v1}, Lxm1;->b(Lmf1;)V

    .line 226
    .line 227
    .line 228
    return v6

    .line 229
    :cond_10
    iget-object v4, v9, Lxm1;->a:Lx13;

    .line 230
    .line 231
    invoke-virtual {v4, v2, v3}, Lx13;->c(J)J

    .line 232
    .line 233
    .line 234
    move-result-wide v2

    .line 235
    iget-wide v7, v9, Lxm1;->g:J

    .line 236
    .line 237
    invoke-virtual {v4, v7, v8}, Lx13;->d(J)J

    .line 238
    .line 239
    .line 240
    move-result-wide v4

    .line 241
    sub-long/2addr v4, v2

    .line 242
    iput-wide v4, v9, Lxm1;->h:J

    .line 243
    .line 244
    invoke-virtual {v9, v1}, Lxm1;->b(Lmf1;)V

    .line 245
    .line 246
    .line 247
    return v6

    .line 248
    :goto_7
    iget-boolean v3, v0, Lgn1;->m:Z

    .line 249
    .line 250
    if-nez v3, :cond_12

    .line 251
    .line 252
    iput-boolean v5, v0, Lgn1;->m:Z

    .line 253
    .line 254
    iget-wide v7, v9, Lxm1;->h:J

    .line 255
    .line 256
    cmp-long v3, v7, v16

    .line 257
    .line 258
    if-eqz v3, :cond_11

    .line 259
    .line 260
    move v3, v4

    .line 261
    new-instance v4, Lzg1;

    .line 262
    .line 263
    iget-object v9, v9, Lxm1;->a:Lx13;

    .line 264
    .line 265
    iget v12, v0, Lgn1;->o:I

    .line 266
    .line 267
    move v15, v5

    .line 268
    new-instance v5, Lus0;

    .line 269
    .line 270
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 271
    .line 272
    .line 273
    move/from16 v16, v6

    .line 274
    .line 275
    new-instance v6, Lso1;

    .line 276
    .line 277
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 278
    .line 279
    .line 280
    iput v12, v6, Lso1;->f:I

    .line 281
    .line 282
    iput-object v9, v6, Lso1;->g:Ljava/lang/Object;

    .line 283
    .line 284
    new-instance v9, Lkz2;

    .line 285
    .line 286
    invoke-direct {v9}, Lkz2;-><init>()V

    .line 287
    .line 288
    .line 289
    iput-object v9, v6, Lso1;->h:Ljava/lang/Object;

    .line 290
    .line 291
    const-wide/16 v20, 0x1

    .line 292
    .line 293
    add-long v20, v7, v20

    .line 294
    .line 295
    move v9, v15

    .line 296
    move/from16 v12, v16

    .line 297
    .line 298
    const-wide/16 v15, 0xbc

    .line 299
    .line 300
    const/16 v17, 0x3ac

    .line 301
    .line 302
    move-wide/from16 v22, v10

    .line 303
    .line 304
    move v10, v12

    .line 305
    const-wide/16 v11, 0x0

    .line 306
    .line 307
    move v3, v10

    .line 308
    move-wide/from16 v1, v22

    .line 309
    .line 310
    move-wide/from16 v24, v20

    .line 311
    .line 312
    move/from16 v20, v9

    .line 313
    .line 314
    move-wide/from16 v9, v24

    .line 315
    .line 316
    invoke-direct/range {v4 .. v17}, Lzg1;-><init>(Lye1;Laf1;JJJJJI)V

    .line 317
    .line 318
    .line 319
    iput-object v4, v0, Lgn1;->j:Lzg1;

    .line 320
    .line 321
    iget-object v5, v0, Lgn1;->k:Lnf1;

    .line 322
    .line 323
    iget-object v4, v4, Lzg1;->a:Lwe1;

    .line 324
    .line 325
    invoke-interface {v5, v4}, Lnf1;->v(Lcg1;)V

    .line 326
    .line 327
    .line 328
    goto :goto_8

    .line 329
    :cond_11
    move/from16 v20, v5

    .line 330
    .line 331
    move v3, v6

    .line 332
    move-wide v1, v10

    .line 333
    iget-object v4, v0, Lgn1;->k:Lnf1;

    .line 334
    .line 335
    new-instance v5, Lqf1;

    .line 336
    .line 337
    invoke-direct {v5, v7, v8, v1, v2}, Lqf1;-><init>(JJ)V

    .line 338
    .line 339
    .line 340
    invoke-interface {v4, v5}, Lnf1;->v(Lcg1;)V

    .line 341
    .line 342
    .line 343
    goto :goto_8

    .line 344
    :cond_12
    move/from16 v20, v5

    .line 345
    .line 346
    move v3, v6

    .line 347
    move-wide v1, v10

    .line 348
    :goto_8
    iget-boolean v4, v0, Lgn1;->n:Z

    .line 349
    .line 350
    if-eqz v4, :cond_13

    .line 351
    .line 352
    iput-boolean v3, v0, Lgn1;->n:Z

    .line 353
    .line 354
    invoke-virtual {v0, v1, v2, v1, v2}, Lgn1;->e(JJ)V

    .line 355
    .line 356
    .line 357
    move-object/from16 v4, p1

    .line 358
    .line 359
    check-cast v4, Ldf1;

    .line 360
    .line 361
    iget-wide v4, v4, Ldf1;->i:J

    .line 362
    .line 363
    cmp-long v4, v4, v1

    .line 364
    .line 365
    if-nez v4, :cond_14

    .line 366
    .line 367
    :cond_13
    move-object/from16 v4, p2

    .line 368
    .line 369
    goto :goto_9

    .line 370
    :cond_14
    move-object/from16 v4, p2

    .line 371
    .line 372
    iput-wide v1, v4, Lpf1;->a:J

    .line 373
    .line 374
    return v20

    .line 375
    :goto_9
    iget-object v1, v0, Lgn1;->j:Lzg1;

    .line 376
    .line 377
    if-eqz v1, :cond_15

    .line 378
    .line 379
    iget-object v2, v1, Lzg1;->c:Lxe1;

    .line 380
    .line 381
    if-eqz v2, :cond_15

    .line 382
    .line 383
    move-object/from16 v2, p1

    .line 384
    .line 385
    invoke-virtual {v1, v2, v4}, Lzg1;->b(Lmf1;Lpf1;)I

    .line 386
    .line 387
    .line 388
    move-result v1

    .line 389
    return v1

    .line 390
    :cond_15
    move-object/from16 v2, p1

    .line 391
    .line 392
    goto :goto_a

    .line 393
    :cond_16
    move-object v2, v1

    .line 394
    move/from16 v20, v5

    .line 395
    .line 396
    move v3, v6

    .line 397
    :goto_a
    iget-object v1, v0, Lgn1;->b:Lkz2;

    .line 398
    .line 399
    iget-object v4, v1, Lkz2;->a:[B

    .line 400
    .line 401
    iget v5, v1, Lkz2;->b:I

    .line 402
    .line 403
    rsub-int v5, v5, 0x24b8

    .line 404
    .line 405
    const/16 v6, 0xbc

    .line 406
    .line 407
    if-lt v5, v6, :cond_17

    .line 408
    .line 409
    goto :goto_b

    .line 410
    :cond_17
    invoke-virtual {v1}, Lkz2;->B()I

    .line 411
    .line 412
    .line 413
    move-result v5

    .line 414
    if-lez v5, :cond_18

    .line 415
    .line 416
    iget v7, v1, Lkz2;->b:I

    .line 417
    .line 418
    invoke-static {v4, v7, v4, v3, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 419
    .line 420
    .line 421
    :cond_18
    invoke-virtual {v1, v5, v4}, Lkz2;->z(I[B)V

    .line 422
    .line 423
    .line 424
    :goto_b
    invoke-virtual {v1}, Lkz2;->B()I

    .line 425
    .line 426
    .line 427
    move-result v5

    .line 428
    iget-object v7, v0, Lgn1;->f:Landroid/util/SparseArray;

    .line 429
    .line 430
    const/4 v8, -0x1

    .line 431
    if-ge v5, v6, :cond_1c

    .line 432
    .line 433
    iget v5, v1, Lkz2;->c:I

    .line 434
    .line 435
    rsub-int v9, v5, 0x24b8

    .line 436
    .line 437
    move-object v10, v2

    .line 438
    check-cast v10, Ldf1;

    .line 439
    .line 440
    invoke-virtual {v10, v4, v5, v9}, Ldf1;->d([BII)I

    .line 441
    .line 442
    .line 443
    move-result v9

    .line 444
    if-ne v9, v8, :cond_1b

    .line 445
    .line 446
    move v6, v3

    .line 447
    :goto_c
    invoke-virtual {v7}, Landroid/util/SparseArray;->size()I

    .line 448
    .line 449
    .line 450
    move-result v1

    .line 451
    if-ge v6, v1, :cond_1a

    .line 452
    .line 453
    invoke-virtual {v7, v6}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v1

    .line 457
    check-cast v1, Ljn1;

    .line 458
    .line 459
    instance-of v2, v1, Lwm1;

    .line 460
    .line 461
    if-eqz v2, :cond_19

    .line 462
    .line 463
    check-cast v1, Lwm1;

    .line 464
    .line 465
    iget v2, v1, Lwm1;->c:I

    .line 466
    .line 467
    const/4 v3, 0x3

    .line 468
    if-ne v2, v3, :cond_19

    .line 469
    .line 470
    iget v2, v1, Lwm1;->j:I

    .line 471
    .line 472
    if-ne v2, v8, :cond_19

    .line 473
    .line 474
    new-instance v2, Lkz2;

    .line 475
    .line 476
    invoke-direct {v2}, Lkz2;-><init>()V

    .line 477
    .line 478
    .line 479
    move/from16 v15, v20

    .line 480
    .line 481
    invoke-virtual {v1, v15, v2}, Lwm1;->a(ILkz2;)V

    .line 482
    .line 483
    .line 484
    :cond_19
    add-int/lit8 v6, v6, 0x1

    .line 485
    .line 486
    const/16 v20, 0x1

    .line 487
    .line 488
    goto :goto_c

    .line 489
    :cond_1a
    return v8

    .line 490
    :cond_1b
    add-int/2addr v5, v9

    .line 491
    invoke-virtual {v1, v5}, Lkz2;->C(I)V

    .line 492
    .line 493
    .line 494
    const/16 v20, 0x1

    .line 495
    .line 496
    goto :goto_b

    .line 497
    :cond_1c
    iget v2, v1, Lkz2;->b:I

    .line 498
    .line 499
    iget v4, v1, Lkz2;->c:I

    .line 500
    .line 501
    iget-object v5, v1, Lkz2;->a:[B

    .line 502
    .line 503
    :goto_d
    if-ge v2, v4, :cond_1d

    .line 504
    .line 505
    aget-byte v9, v5, v2

    .line 506
    .line 507
    const/16 v10, 0x47

    .line 508
    .line 509
    if-eq v9, v10, :cond_1d

    .line 510
    .line 511
    add-int/lit8 v2, v2, 0x1

    .line 512
    .line 513
    goto :goto_d

    .line 514
    :cond_1d
    invoke-virtual {v1, v2}, Lkz2;->E(I)V

    .line 515
    .line 516
    .line 517
    add-int/2addr v2, v6

    .line 518
    iget v4, v1, Lkz2;->c:I

    .line 519
    .line 520
    if-le v2, v4, :cond_1e

    .line 521
    .line 522
    return v3

    .line 523
    :cond_1e
    invoke-virtual {v1}, Lkz2;->b()I

    .line 524
    .line 525
    .line 526
    move-result v5

    .line 527
    const/high16 v6, 0x800000

    .line 528
    .line 529
    and-int/2addr v6, v5

    .line 530
    if-eqz v6, :cond_1f

    .line 531
    .line 532
    invoke-virtual {v1, v2}, Lkz2;->E(I)V

    .line 533
    .line 534
    .line 535
    return v3

    .line 536
    :cond_1f
    const/high16 v6, 0x400000

    .line 537
    .line 538
    and-int/2addr v6, v5

    .line 539
    if-eqz v6, :cond_20

    .line 540
    .line 541
    const/4 v6, 0x1

    .line 542
    goto :goto_e

    .line 543
    :cond_20
    move v6, v3

    .line 544
    :goto_e
    shr-int/lit8 v9, v5, 0x8

    .line 545
    .line 546
    and-int/lit8 v10, v5, 0x20

    .line 547
    .line 548
    and-int/lit8 v11, v5, 0x10

    .line 549
    .line 550
    and-int/lit16 v9, v9, 0x1fff

    .line 551
    .line 552
    if-eqz v11, :cond_21

    .line 553
    .line 554
    invoke-virtual {v7, v9}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 555
    .line 556
    .line 557
    move-result-object v7

    .line 558
    check-cast v7, Ljn1;

    .line 559
    .line 560
    goto :goto_f

    .line 561
    :cond_21
    const/4 v7, 0x0

    .line 562
    :goto_f
    if-nez v7, :cond_22

    .line 563
    .line 564
    invoke-virtual {v1, v2}, Lkz2;->E(I)V

    .line 565
    .line 566
    .line 567
    return v3

    .line 568
    :cond_22
    and-int/lit8 v5, v5, 0xf

    .line 569
    .line 570
    add-int/lit8 v11, v5, -0x1

    .line 571
    .line 572
    iget-object v12, v0, Lgn1;->c:Landroid/util/SparseIntArray;

    .line 573
    .line 574
    invoke-virtual {v12, v9, v11}, Landroid/util/SparseIntArray;->get(II)I

    .line 575
    .line 576
    .line 577
    move-result v11

    .line 578
    invoke-virtual {v12, v9, v5}, Landroid/util/SparseIntArray;->put(II)V

    .line 579
    .line 580
    .line 581
    if-ne v11, v5, :cond_23

    .line 582
    .line 583
    invoke-virtual {v1, v2}, Lkz2;->E(I)V

    .line 584
    .line 585
    .line 586
    return v3

    .line 587
    :cond_23
    const/16 v20, 0x1

    .line 588
    .line 589
    add-int/lit8 v11, v11, 0x1

    .line 590
    .line 591
    and-int/lit8 v11, v11, 0xf

    .line 592
    .line 593
    if-eq v5, v11, :cond_24

    .line 594
    .line 595
    invoke-interface {v7}, Ljn1;->d()V

    .line 596
    .line 597
    .line 598
    :cond_24
    if-eqz v10, :cond_26

    .line 599
    .line 600
    invoke-virtual {v1}, Lkz2;->K()I

    .line 601
    .line 602
    .line 603
    move-result v5

    .line 604
    invoke-virtual {v1}, Lkz2;->K()I

    .line 605
    .line 606
    .line 607
    move-result v10

    .line 608
    and-int/lit8 v10, v10, 0x40

    .line 609
    .line 610
    if-eqz v10, :cond_25

    .line 611
    .line 612
    const/4 v10, 0x2

    .line 613
    goto :goto_10

    .line 614
    :cond_25
    move v10, v3

    .line 615
    :goto_10
    or-int/2addr v6, v10

    .line 616
    add-int/2addr v5, v8

    .line 617
    invoke-virtual {v1, v5}, Lkz2;->G(I)V

    .line 618
    .line 619
    .line 620
    :cond_26
    iget-boolean v5, v0, Lgn1;->l:Z

    .line 621
    .line 622
    if-nez v5, :cond_27

    .line 623
    .line 624
    iget-object v8, v0, Lgn1;->h:Landroid/util/SparseBooleanArray;

    .line 625
    .line 626
    invoke-virtual {v8, v9, v3}, Landroid/util/SparseBooleanArray;->get(IZ)Z

    .line 627
    .line 628
    .line 629
    move-result v8

    .line 630
    if-nez v8, :cond_28

    .line 631
    .line 632
    :cond_27
    invoke-virtual {v1, v2}, Lkz2;->C(I)V

    .line 633
    .line 634
    .line 635
    invoke-interface {v7, v6, v1}, Ljn1;->a(ILkz2;)V

    .line 636
    .line 637
    .line 638
    invoke-virtual {v1, v4}, Lkz2;->C(I)V

    .line 639
    .line 640
    .line 641
    if-nez v5, :cond_29

    .line 642
    .line 643
    :cond_28
    iget-boolean v4, v0, Lgn1;->l:Z

    .line 644
    .line 645
    if-eqz v4, :cond_29

    .line 646
    .line 647
    cmp-long v4, v13, v18

    .line 648
    .line 649
    if-eqz v4, :cond_29

    .line 650
    .line 651
    const/4 v15, 0x1

    .line 652
    iput-boolean v15, v0, Lgn1;->n:Z

    .line 653
    .line 654
    :cond_29
    invoke-virtual {v1, v2}, Lkz2;->E(I)V

    .line 655
    .line 656
    .line 657
    return v3
.end method

.method public final e(JJ)V
    .locals 9

    .line 1
    iget-object p1, p0, Lgn1;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    const/4 v0, 0x0

    .line 8
    move v1, v0

    .line 9
    :goto_0
    const-wide/16 v2, 0x0

    .line 10
    .line 11
    if-ge v1, p2, :cond_2

    .line 12
    .line 13
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    check-cast v4, Lx13;

    .line 18
    .line 19
    monitor-enter v4

    .line 20
    :try_start_0
    iget-wide v5, v4, Lx13;->b:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    monitor-exit v4

    .line 23
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    cmp-long v5, v5, v7

    .line 29
    .line 30
    if-eqz v5, :cond_0

    .line 31
    .line 32
    invoke-virtual {v4}, Lx13;->a()J

    .line 33
    .line 34
    .line 35
    move-result-wide v5

    .line 36
    cmp-long v7, v5, v7

    .line 37
    .line 38
    if-eqz v7, :cond_1

    .line 39
    .line 40
    cmp-long v2, v5, v2

    .line 41
    .line 42
    if-eqz v2, :cond_1

    .line 43
    .line 44
    cmp-long v2, v5, p3

    .line 45
    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    :cond_0
    invoke-virtual {v4, p3, p4}, Lx13;->b(J)V

    .line 49
    .line 50
    .line 51
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    move-exception p1

    .line 55
    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    throw p1

    .line 57
    :cond_2
    cmp-long p1, p3, v2

    .line 58
    .line 59
    if-eqz p1, :cond_3

    .line 60
    .line 61
    iget-object p1, p0, Lgn1;->j:Lzg1;

    .line 62
    .line 63
    if-eqz p1, :cond_3

    .line 64
    .line 65
    invoke-virtual {p1, p3, p4}, Lzg1;->a(J)V

    .line 66
    .line 67
    .line 68
    :cond_3
    iget-object p1, p0, Lgn1;->b:Lkz2;

    .line 69
    .line 70
    invoke-virtual {p1, v0}, Lkz2;->y(I)V

    .line 71
    .line 72
    .line 73
    iget-object p1, p0, Lgn1;->c:Landroid/util/SparseIntArray;

    .line 74
    .line 75
    invoke-virtual {p1}, Landroid/util/SparseIntArray;->clear()V

    .line 76
    .line 77
    .line 78
    :goto_1
    iget-object p1, p0, Lgn1;->f:Landroid/util/SparseArray;

    .line 79
    .line 80
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    if-ge v0, p2, :cond_4

    .line 85
    .line 86
    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    check-cast p1, Ljn1;

    .line 91
    .line 92
    invoke-interface {p1}, Ljn1;->d()V

    .line 93
    .line 94
    .line 95
    add-int/lit8 v0, v0, 0x1

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_4
    return-void
.end method

.method public final f(Lnf1;)V
    .locals 2

    .line 1
    new-instance v0, Lrl;

    .line 2
    .line 3
    iget-object v1, p0, Lgn1;->e:Lus0;

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, Lrl;-><init>(Lnf1;Ljk1;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lgn1;->k:Lnf1;

    .line 9
    .line 10
    return-void
.end method
