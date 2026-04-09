.class public final Lmg2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:F

.field public final d:F

.field public final e:F

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:[S

.field public j:[S

.field public k:I

.field public l:[S

.field public m:I

.field public n:[S

.field public o:I

.field public p:I

.field public q:I

.field public r:I

.field public s:I

.field public t:I

.field public u:I

.field public v:I

.field public w:D


# direct methods
.method public constructor <init>(IIFFI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lmg2;->a:I

    .line 5
    .line 6
    iput p2, p0, Lmg2;->b:I

    .line 7
    .line 8
    iput p3, p0, Lmg2;->c:F

    .line 9
    .line 10
    iput p4, p0, Lmg2;->d:F

    .line 11
    .line 12
    int-to-float p3, p1

    .line 13
    int-to-float p4, p5

    .line 14
    div-float/2addr p3, p4

    .line 15
    iput p3, p0, Lmg2;->e:F

    .line 16
    .line 17
    div-int/lit16 p3, p1, 0x190

    .line 18
    .line 19
    iput p3, p0, Lmg2;->f:I

    .line 20
    .line 21
    div-int/lit8 p1, p1, 0x41

    .line 22
    .line 23
    iput p1, p0, Lmg2;->g:I

    .line 24
    .line 25
    add-int/2addr p1, p1

    .line 26
    iput p1, p0, Lmg2;->h:I

    .line 27
    .line 28
    new-array p3, p1, [S

    .line 29
    .line 30
    iput-object p3, p0, Lmg2;->i:[S

    .line 31
    .line 32
    mul-int/2addr p1, p2

    .line 33
    new-array p2, p1, [S

    .line 34
    .line 35
    iput-object p2, p0, Lmg2;->j:[S

    .line 36
    .line 37
    new-array p2, p1, [S

    .line 38
    .line 39
    iput-object p2, p0, Lmg2;->l:[S

    .line 40
    .line 41
    new-array p1, p1, [S

    .line 42
    .line 43
    iput-object p1, p0, Lmg2;->n:[S

    .line 44
    .line 45
    return-void
.end method

.method public static f(II[SI[SI[SI)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    if-ge v1, p1, :cond_1

    .line 4
    .line 5
    mul-int v2, p3, p1

    .line 6
    .line 7
    mul-int v3, p7, p1

    .line 8
    .line 9
    mul-int v4, p5, p1

    .line 10
    .line 11
    add-int/2addr v4, v1

    .line 12
    add-int/2addr v3, v1

    .line 13
    add-int/2addr v2, v1

    .line 14
    move v5, v0

    .line 15
    :goto_1
    if-ge v5, p0, :cond_0

    .line 16
    .line 17
    aget-short v6, p4, v4

    .line 18
    .line 19
    sub-int v7, p0, v5

    .line 20
    .line 21
    mul-int/2addr v7, v6

    .line 22
    aget-short v6, p6, v3

    .line 23
    .line 24
    mul-int/2addr v6, v5

    .line 25
    add-int/2addr v6, v7

    .line 26
    div-int/2addr v6, p0

    .line 27
    int-to-short v6, v6

    .line 28
    aput-short v6, p2, v2

    .line 29
    .line 30
    add-int/2addr v2, p1

    .line 31
    add-int/2addr v4, p1

    .line 32
    add-int/2addr v3, p1

    .line 33
    add-int/lit8 v5, v5, 0x1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    return-void
.end method


# virtual methods
.method public final a([SII)[S
    .locals 2

    .line 1
    array-length v0, p1

    .line 2
    iget v1, p0, Lmg2;->b:I

    .line 3
    .line 4
    div-int/2addr v0, v1

    .line 5
    add-int/2addr p2, p3

    .line 6
    if-gt p2, v0, :cond_0

    .line 7
    .line 8
    return-object p1

    .line 9
    :cond_0
    mul-int/lit8 v0, v0, 0x3

    .line 10
    .line 11
    div-int/lit8 v0, v0, 0x2

    .line 12
    .line 13
    add-int/2addr v0, p3

    .line 14
    mul-int/2addr v0, v1

    .line 15
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([SI)[S

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
.end method

.method public final b([SII)V
    .locals 4

    .line 1
    iget-object v0, p0, Lmg2;->l:[S

    .line 2
    .line 3
    iget v1, p0, Lmg2;->m:I

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1, p3}, Lmg2;->a([SII)[S

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lmg2;->l:[S

    .line 10
    .line 11
    iget v1, p0, Lmg2;->m:I

    .line 12
    .line 13
    iget v2, p0, Lmg2;->b:I

    .line 14
    .line 15
    mul-int/2addr v1, v2

    .line 16
    mul-int v3, p3, v2

    .line 17
    .line 18
    mul-int/2addr p2, v2

    .line 19
    invoke-static {p1, p2, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 20
    .line 21
    .line 22
    iget p1, p0, Lmg2;->m:I

    .line 23
    .line 24
    add-int/2addr p1, p3

    .line 25
    iput p1, p0, Lmg2;->m:I

    .line 26
    .line 27
    return-void
.end method

.method public final c([SII)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget v2, p0, Lmg2;->h:I

    .line 4
    .line 5
    div-int/2addr v2, p3

    .line 6
    if-ge v1, v2, :cond_1

    .line 7
    .line 8
    move v2, v0

    .line 9
    move v3, v2

    .line 10
    :goto_1
    iget v4, p0, Lmg2;->b:I

    .line 11
    .line 12
    mul-int v5, v4, p3

    .line 13
    .line 14
    if-ge v2, v5, :cond_0

    .line 15
    .line 16
    mul-int/2addr v4, p2

    .line 17
    mul-int/2addr v5, v1

    .line 18
    add-int/2addr v5, v4

    .line 19
    add-int/2addr v5, v2

    .line 20
    aget-short v4, p1, v5

    .line 21
    .line 22
    add-int/2addr v3, v4

    .line 23
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    div-int/2addr v3, v5

    .line 27
    iget-object v2, p0, Lmg2;->i:[S

    .line 28
    .line 29
    int-to-short v3, v3

    .line 30
    aput-short v3, v2, v1

    .line 31
    .line 32
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    return-void
.end method

.method public final d([SIII)I
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const/16 v2, 0xff

    .line 4
    .line 5
    move v3, v0

    .line 6
    move v4, v3

    .line 7
    :goto_0
    if-gt p3, p4, :cond_5

    .line 8
    .line 9
    move v5, v0

    .line 10
    move v6, v5

    .line 11
    :goto_1
    if-ge v5, p3, :cond_0

    .line 12
    .line 13
    iget v7, p0, Lmg2;->b:I

    .line 14
    .line 15
    mul-int/2addr v7, p2

    .line 16
    add-int v8, v7, v5

    .line 17
    .line 18
    aget-short v8, p1, v8

    .line 19
    .line 20
    add-int/2addr v7, p3

    .line 21
    add-int/2addr v7, v5

    .line 22
    aget-short v7, p1, v7

    .line 23
    .line 24
    sub-int/2addr v8, v7

    .line 25
    invoke-static {v8}, Ljava/lang/Math;->abs(I)I

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    add-int/2addr v6, v7

    .line 30
    add-int/lit8 v5, v5, 0x1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    mul-int v5, v6, v3

    .line 34
    .line 35
    mul-int v7, v1, p3

    .line 36
    .line 37
    if-ge v5, v7, :cond_1

    .line 38
    .line 39
    move v1, v6

    .line 40
    :cond_1
    if-ge v5, v7, :cond_2

    .line 41
    .line 42
    move v3, p3

    .line 43
    :cond_2
    mul-int v5, v6, v2

    .line 44
    .line 45
    mul-int v7, v4, p3

    .line 46
    .line 47
    if-le v5, v7, :cond_3

    .line 48
    .line 49
    move v4, v6

    .line 50
    :cond_3
    if-le v5, v7, :cond_4

    .line 51
    .line 52
    move v2, p3

    .line 53
    :cond_4
    add-int/lit8 p3, p3, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_5
    div-int/2addr v1, v3

    .line 57
    iput v1, p0, Lmg2;->u:I

    .line 58
    .line 59
    div-int/2addr v4, v2

    .line 60
    iput v4, p0, Lmg2;->v:I

    .line 61
    .line 62
    return v3
.end method

.method public final e()V
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lmg2;->c:F

    .line 4
    .line 5
    iget v2, v0, Lmg2;->d:F

    .line 6
    .line 7
    div-float/2addr v1, v2

    .line 8
    float-to-double v3, v1

    .line 9
    const-wide v5, 0x3ff0000a80000000L    # 1.0000100135803223

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    cmpl-double v1, v3, v5

    .line 15
    .line 16
    iget v5, v0, Lmg2;->m:I

    .line 17
    .line 18
    iget v6, v0, Lmg2;->a:I

    .line 19
    .line 20
    iget v7, v0, Lmg2;->b:I

    .line 21
    .line 22
    const/4 v8, 0x0

    .line 23
    const/4 v9, 0x1

    .line 24
    if-gtz v1, :cond_1

    .line 25
    .line 26
    const-wide v10, 0x3fefffeb00000000L    # 0.9999899864196777

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    cmpg-double v1, v3, v10

    .line 32
    .line 33
    if-gez v1, :cond_0

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    iget-object v1, v0, Lmg2;->j:[S

    .line 37
    .line 38
    iget v3, v0, Lmg2;->k:I

    .line 39
    .line 40
    invoke-virtual {v0, v1, v8, v3}, Lmg2;->b([SII)V

    .line 41
    .line 42
    .line 43
    iput v8, v0, Lmg2;->k:I

    .line 44
    .line 45
    :goto_0
    move/from16 v21, v2

    .line 46
    .line 47
    goto/16 :goto_e

    .line 48
    .line 49
    :cond_1
    :goto_1
    iget v1, v0, Lmg2;->k:I

    .line 50
    .line 51
    iget v10, v0, Lmg2;->h:I

    .line 52
    .line 53
    if-ge v1, v10, :cond_2

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    move v11, v8

    .line 57
    :goto_2
    iget v12, v0, Lmg2;->r:I

    .line 58
    .line 59
    if-lez v12, :cond_3

    .line 60
    .line 61
    invoke-static {v10, v12}, Ljava/lang/Math;->min(II)I

    .line 62
    .line 63
    .line 64
    move-result v12

    .line 65
    iget-object v13, v0, Lmg2;->j:[S

    .line 66
    .line 67
    invoke-virtual {v0, v13, v11, v12}, Lmg2;->b([SII)V

    .line 68
    .line 69
    .line 70
    iget v13, v0, Lmg2;->r:I

    .line 71
    .line 72
    sub-int/2addr v13, v12

    .line 73
    iput v13, v0, Lmg2;->r:I

    .line 74
    .line 75
    add-int/2addr v11, v12

    .line 76
    move/from16 v21, v2

    .line 77
    .line 78
    move-wide/from16 v22, v3

    .line 79
    .line 80
    goto/16 :goto_d

    .line 81
    .line 82
    :cond_3
    iget-object v12, v0, Lmg2;->j:[S

    .line 83
    .line 84
    const/16 v13, 0xfa0

    .line 85
    .line 86
    if-le v6, v13, :cond_4

    .line 87
    .line 88
    div-int/lit16 v13, v6, 0xfa0

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_4
    move v13, v9

    .line 92
    :goto_3
    iget v14, v0, Lmg2;->g:I

    .line 93
    .line 94
    iget v15, v0, Lmg2;->f:I

    .line 95
    .line 96
    if-ne v7, v9, :cond_6

    .line 97
    .line 98
    if-ne v13, v9, :cond_5

    .line 99
    .line 100
    invoke-virtual {v0, v12, v11, v15, v14}, Lmg2;->d([SIII)I

    .line 101
    .line 102
    .line 103
    move-result v12

    .line 104
    move/from16 v21, v2

    .line 105
    .line 106
    move-wide/from16 v22, v3

    .line 107
    .line 108
    :goto_4
    move/from16 v19, v9

    .line 109
    .line 110
    goto :goto_9

    .line 111
    :cond_5
    move/from16 v19, v9

    .line 112
    .line 113
    goto :goto_5

    .line 114
    :cond_6
    move/from16 v19, v7

    .line 115
    .line 116
    :goto_5
    invoke-virtual {v0, v12, v11, v13}, Lmg2;->c([SII)V

    .line 117
    .line 118
    .line 119
    div-int v9, v14, v13

    .line 120
    .line 121
    move/from16 v21, v2

    .line 122
    .line 123
    div-int v2, v15, v13

    .line 124
    .line 125
    move-wide/from16 v22, v3

    .line 126
    .line 127
    iget-object v3, v0, Lmg2;->i:[S

    .line 128
    .line 129
    invoke-virtual {v0, v3, v8, v2, v9}, Lmg2;->d([SIII)I

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    const/4 v4, 0x1

    .line 134
    if-eq v13, v4, :cond_a

    .line 135
    .line 136
    mul-int/2addr v2, v13

    .line 137
    mul-int/lit8 v13, v13, 0x4

    .line 138
    .line 139
    sub-int v4, v2, v13

    .line 140
    .line 141
    if-ge v4, v15, :cond_7

    .line 142
    .line 143
    goto :goto_6

    .line 144
    :cond_7
    move v15, v4

    .line 145
    :goto_6
    add-int/2addr v2, v13

    .line 146
    if-le v2, v14, :cond_8

    .line 147
    .line 148
    :goto_7
    move/from16 v9, v19

    .line 149
    .line 150
    const/4 v4, 0x1

    .line 151
    goto :goto_8

    .line 152
    :cond_8
    move v14, v2

    .line 153
    goto :goto_7

    .line 154
    :goto_8
    if-ne v9, v4, :cond_9

    .line 155
    .line 156
    invoke-virtual {v0, v12, v11, v15, v14}, Lmg2;->d([SIII)I

    .line 157
    .line 158
    .line 159
    move-result v12

    .line 160
    goto :goto_4

    .line 161
    :cond_9
    invoke-virtual {v0, v12, v11, v4}, Lmg2;->c([SII)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, v3, v8, v15, v14}, Lmg2;->d([SIII)I

    .line 165
    .line 166
    .line 167
    move-result v12

    .line 168
    goto :goto_4

    .line 169
    :cond_a
    move/from16 v9, v19

    .line 170
    .line 171
    move v12, v2

    .line 172
    :goto_9
    iget v2, v0, Lmg2;->u:I

    .line 173
    .line 174
    iget v3, v0, Lmg2;->v:I

    .line 175
    .line 176
    if-eqz v2, :cond_d

    .line 177
    .line 178
    iget v4, v0, Lmg2;->s:I

    .line 179
    .line 180
    if-nez v4, :cond_b

    .line 181
    .line 182
    goto :goto_a

    .line 183
    :cond_b
    mul-int/lit8 v9, v2, 0x3

    .line 184
    .line 185
    if-le v3, v9, :cond_c

    .line 186
    .line 187
    goto :goto_a

    .line 188
    :cond_c
    add-int v3, v2, v2

    .line 189
    .line 190
    iget v9, v0, Lmg2;->t:I

    .line 191
    .line 192
    mul-int/lit8 v9, v9, 0x3

    .line 193
    .line 194
    if-gt v3, v9, :cond_e

    .line 195
    .line 196
    :cond_d
    :goto_a
    move v4, v12

    .line 197
    :cond_e
    add-int v16, v11, v4

    .line 198
    .line 199
    iput v2, v0, Lmg2;->t:I

    .line 200
    .line 201
    iput v12, v0, Lmg2;->s:I

    .line 202
    .line 203
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    .line 204
    .line 205
    cmpl-double v9, v22, v2

    .line 206
    .line 207
    int-to-double v12, v4

    .line 208
    const-wide/high16 v14, -0x4010000000000000L    # -1.0

    .line 209
    .line 210
    if-lez v9, :cond_10

    .line 211
    .line 212
    move-wide/from16 v17, v14

    .line 213
    .line 214
    iget-object v15, v0, Lmg2;->j:[S

    .line 215
    .line 216
    add-double v2, v22, v17

    .line 217
    .line 218
    const-wide/high16 v17, 0x4000000000000000L    # 2.0

    .line 219
    .line 220
    cmpl-double v9, v22, v17

    .line 221
    .line 222
    if-ltz v9, :cond_f

    .line 223
    .line 224
    iget-wide v8, v0, Lmg2;->w:D

    .line 225
    .line 226
    div-double/2addr v12, v2

    .line 227
    add-double/2addr v12, v8

    .line 228
    invoke-static {v12, v13}, Ljava/lang/Math;->round(D)J

    .line 229
    .line 230
    .line 231
    move-result-wide v2

    .line 232
    long-to-int v2, v2

    .line 233
    int-to-double v8, v2

    .line 234
    sub-double/2addr v12, v8

    .line 235
    iput-wide v12, v0, Lmg2;->w:D

    .line 236
    .line 237
    goto :goto_b

    .line 238
    :cond_f
    sub-double v17, v17, v22

    .line 239
    .line 240
    iget-wide v8, v0, Lmg2;->w:D

    .line 241
    .line 242
    mul-double v12, v12, v17

    .line 243
    .line 244
    div-double/2addr v12, v2

    .line 245
    add-double/2addr v12, v8

    .line 246
    invoke-static {v12, v13}, Ljava/lang/Math;->round(D)J

    .line 247
    .line 248
    .line 249
    move-result-wide v2

    .line 250
    long-to-int v2, v2

    .line 251
    iput v2, v0, Lmg2;->r:I

    .line 252
    .line 253
    int-to-double v2, v2

    .line 254
    sub-double/2addr v12, v2

    .line 255
    iput-wide v12, v0, Lmg2;->w:D

    .line 256
    .line 257
    move v2, v4

    .line 258
    :goto_b
    iget-object v3, v0, Lmg2;->l:[S

    .line 259
    .line 260
    iget v8, v0, Lmg2;->m:I

    .line 261
    .line 262
    invoke-virtual {v0, v3, v8, v2}, Lmg2;->a([SII)[S

    .line 263
    .line 264
    .line 265
    move-result-object v13

    .line 266
    iput-object v13, v0, Lmg2;->l:[S

    .line 267
    .line 268
    iget v14, v0, Lmg2;->m:I

    .line 269
    .line 270
    move-object/from16 v17, v15

    .line 271
    .line 272
    move/from16 v18, v16

    .line 273
    .line 274
    move/from16 v12, v19

    .line 275
    .line 276
    move/from16 v16, v11

    .line 277
    .line 278
    move v11, v2

    .line 279
    invoke-static/range {v11 .. v18}, Lmg2;->f(II[SI[SI[SI)V

    .line 280
    .line 281
    .line 282
    iget v2, v0, Lmg2;->m:I

    .line 283
    .line 284
    add-int/2addr v2, v11

    .line 285
    iput v2, v0, Lmg2;->m:I

    .line 286
    .line 287
    add-int/2addr v4, v11

    .line 288
    add-int v4, v4, v16

    .line 289
    .line 290
    move v11, v4

    .line 291
    goto/16 :goto_d

    .line 292
    .line 293
    :cond_10
    move/from16 v9, v16

    .line 294
    .line 295
    move/from16 v16, v11

    .line 296
    .line 297
    move v11, v9

    .line 298
    move-wide/from16 v17, v14

    .line 299
    .line 300
    move/from16 v9, v19

    .line 301
    .line 302
    iget-object v15, v0, Lmg2;->j:[S

    .line 303
    .line 304
    sub-double v2, v2, v22

    .line 305
    .line 306
    const-wide/high16 v24, 0x3fe0000000000000L    # 0.5

    .line 307
    .line 308
    cmpg-double v8, v22, v24

    .line 309
    .line 310
    if-gez v8, :cond_11

    .line 311
    .line 312
    mul-double v12, v12, v22

    .line 313
    .line 314
    move-wide/from16 v24, v2

    .line 315
    .line 316
    iget-wide v2, v0, Lmg2;->w:D

    .line 317
    .line 318
    div-double v12, v12, v24

    .line 319
    .line 320
    add-double/2addr v12, v2

    .line 321
    invoke-static {v12, v13}, Ljava/lang/Math;->round(D)J

    .line 322
    .line 323
    .line 324
    move-result-wide v2

    .line 325
    long-to-int v2, v2

    .line 326
    move v8, v4

    .line 327
    int-to-double v3, v2

    .line 328
    sub-double/2addr v12, v3

    .line 329
    iput-wide v12, v0, Lmg2;->w:D

    .line 330
    .line 331
    goto :goto_c

    .line 332
    :cond_11
    move-wide/from16 v24, v2

    .line 333
    .line 334
    move v8, v4

    .line 335
    add-double v3, v22, v22

    .line 336
    .line 337
    add-double v3, v3, v17

    .line 338
    .line 339
    move-wide/from16 v17, v3

    .line 340
    .line 341
    iget-wide v2, v0, Lmg2;->w:D

    .line 342
    .line 343
    mul-double v12, v12, v17

    .line 344
    .line 345
    div-double v12, v12, v24

    .line 346
    .line 347
    add-double/2addr v12, v2

    .line 348
    invoke-static {v12, v13}, Ljava/lang/Math;->round(D)J

    .line 349
    .line 350
    .line 351
    move-result-wide v2

    .line 352
    long-to-int v2, v2

    .line 353
    iput v2, v0, Lmg2;->r:I

    .line 354
    .line 355
    int-to-double v2, v2

    .line 356
    sub-double/2addr v12, v2

    .line 357
    iput-wide v12, v0, Lmg2;->w:D

    .line 358
    .line 359
    move v2, v8

    .line 360
    :goto_c
    iget-object v3, v0, Lmg2;->l:[S

    .line 361
    .line 362
    iget v4, v0, Lmg2;->m:I

    .line 363
    .line 364
    add-int v12, v8, v2

    .line 365
    .line 366
    invoke-virtual {v0, v3, v4, v12}, Lmg2;->a([SII)[S

    .line 367
    .line 368
    .line 369
    move-result-object v3

    .line 370
    iput-object v3, v0, Lmg2;->l:[S

    .line 371
    .line 372
    mul-int v4, v16, v9

    .line 373
    .line 374
    iget v13, v0, Lmg2;->m:I

    .line 375
    .line 376
    mul-int/2addr v13, v9

    .line 377
    mul-int v14, v8, v9

    .line 378
    .line 379
    invoke-static {v15, v4, v3, v13, v14}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 380
    .line 381
    .line 382
    iget-object v13, v0, Lmg2;->l:[S

    .line 383
    .line 384
    iget v3, v0, Lmg2;->m:I

    .line 385
    .line 386
    add-int v14, v3, v8

    .line 387
    .line 388
    move-object/from16 v17, v15

    .line 389
    .line 390
    move v4, v12

    .line 391
    move/from16 v18, v16

    .line 392
    .line 393
    move v12, v9

    .line 394
    move/from16 v16, v11

    .line 395
    .line 396
    move v11, v2

    .line 397
    invoke-static/range {v11 .. v18}, Lmg2;->f(II[SI[SI[SI)V

    .line 398
    .line 399
    .line 400
    move/from16 v16, v18

    .line 401
    .line 402
    iget v2, v0, Lmg2;->m:I

    .line 403
    .line 404
    add-int/2addr v2, v4

    .line 405
    iput v2, v0, Lmg2;->m:I

    .line 406
    .line 407
    add-int v11, v16, v11

    .line 408
    .line 409
    :goto_d
    add-int v2, v11, v10

    .line 410
    .line 411
    if-le v2, v1, :cond_1a

    .line 412
    .line 413
    iget v1, v0, Lmg2;->k:I

    .line 414
    .line 415
    sub-int/2addr v1, v11

    .line 416
    iget-object v2, v0, Lmg2;->j:[S

    .line 417
    .line 418
    mul-int/2addr v11, v7

    .line 419
    mul-int v3, v1, v7

    .line 420
    .line 421
    const/4 v4, 0x0

    .line 422
    invoke-static {v2, v11, v2, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 423
    .line 424
    .line 425
    iput v1, v0, Lmg2;->k:I

    .line 426
    .line 427
    :goto_e
    iget v1, v0, Lmg2;->e:F

    .line 428
    .line 429
    mul-float v1, v1, v21

    .line 430
    .line 431
    const/high16 v2, 0x3f800000    # 1.0f

    .line 432
    .line 433
    cmpl-float v2, v1, v2

    .line 434
    .line 435
    if-eqz v2, :cond_19

    .line 436
    .line 437
    iget v2, v0, Lmg2;->m:I

    .line 438
    .line 439
    if-ne v2, v5, :cond_12

    .line 440
    .line 441
    goto/16 :goto_14

    .line 442
    .line 443
    :cond_12
    int-to-float v2, v6

    .line 444
    div-float/2addr v2, v1

    .line 445
    int-to-long v3, v6

    .line 446
    float-to-long v1, v2

    .line 447
    :goto_f
    const-wide/16 v8, 0x0

    .line 448
    .line 449
    cmp-long v6, v1, v8

    .line 450
    .line 451
    if-eqz v6, :cond_13

    .line 452
    .line 453
    cmp-long v6, v3, v8

    .line 454
    .line 455
    if-eqz v6, :cond_13

    .line 456
    .line 457
    const-wide/16 v10, 0x2

    .line 458
    .line 459
    rem-long v12, v1, v10

    .line 460
    .line 461
    cmp-long v6, v12, v8

    .line 462
    .line 463
    if-nez v6, :cond_13

    .line 464
    .line 465
    rem-long v12, v3, v10

    .line 466
    .line 467
    cmp-long v6, v12, v8

    .line 468
    .line 469
    if-nez v6, :cond_13

    .line 470
    .line 471
    div-long/2addr v1, v10

    .line 472
    div-long/2addr v3, v10

    .line 473
    goto :goto_f

    .line 474
    :cond_13
    iget v6, v0, Lmg2;->m:I

    .line 475
    .line 476
    sub-int/2addr v6, v5

    .line 477
    iget-object v8, v0, Lmg2;->n:[S

    .line 478
    .line 479
    iget v9, v0, Lmg2;->o:I

    .line 480
    .line 481
    invoke-virtual {v0, v8, v9, v6}, Lmg2;->a([SII)[S

    .line 482
    .line 483
    .line 484
    move-result-object v8

    .line 485
    iput-object v8, v0, Lmg2;->n:[S

    .line 486
    .line 487
    iget-object v9, v0, Lmg2;->l:[S

    .line 488
    .line 489
    mul-int v10, v5, v7

    .line 490
    .line 491
    iget v11, v0, Lmg2;->o:I

    .line 492
    .line 493
    mul-int/2addr v11, v7

    .line 494
    mul-int v12, v6, v7

    .line 495
    .line 496
    invoke-static {v9, v10, v8, v11, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 497
    .line 498
    .line 499
    iput v5, v0, Lmg2;->m:I

    .line 500
    .line 501
    iget v5, v0, Lmg2;->o:I

    .line 502
    .line 503
    add-int/2addr v5, v6

    .line 504
    iput v5, v0, Lmg2;->o:I

    .line 505
    .line 506
    const/4 v5, 0x0

    .line 507
    :goto_10
    iget v6, v0, Lmg2;->o:I

    .line 508
    .line 509
    add-int/lit8 v8, v6, -0x1

    .line 510
    .line 511
    if-ge v5, v8, :cond_18

    .line 512
    .line 513
    :goto_11
    iget v6, v0, Lmg2;->p:I

    .line 514
    .line 515
    const/4 v8, 0x1

    .line 516
    add-int/2addr v6, v8

    .line 517
    int-to-long v9, v6

    .line 518
    mul-long v11, v9, v1

    .line 519
    .line 520
    iget v13, v0, Lmg2;->q:I

    .line 521
    .line 522
    int-to-long v13, v13

    .line 523
    mul-long v15, v13, v3

    .line 524
    .line 525
    cmp-long v11, v11, v15

    .line 526
    .line 527
    if-lez v11, :cond_15

    .line 528
    .line 529
    iget-object v6, v0, Lmg2;->l:[S

    .line 530
    .line 531
    iget v9, v0, Lmg2;->m:I

    .line 532
    .line 533
    invoke-virtual {v0, v6, v9, v8}, Lmg2;->a([SII)[S

    .line 534
    .line 535
    .line 536
    move-result-object v6

    .line 537
    iput-object v6, v0, Lmg2;->l:[S

    .line 538
    .line 539
    const/4 v6, 0x0

    .line 540
    :goto_12
    if-ge v6, v7, :cond_14

    .line 541
    .line 542
    iget-object v8, v0, Lmg2;->l:[S

    .line 543
    .line 544
    iget v9, v0, Lmg2;->m:I

    .line 545
    .line 546
    mul-int/2addr v9, v7

    .line 547
    iget-object v10, v0, Lmg2;->n:[S

    .line 548
    .line 549
    mul-int v11, v5, v7

    .line 550
    .line 551
    add-int/2addr v11, v6

    .line 552
    aget-short v12, v10, v11

    .line 553
    .line 554
    add-int/2addr v11, v7

    .line 555
    aget-short v10, v10, v11

    .line 556
    .line 557
    iget v11, v0, Lmg2;->q:I

    .line 558
    .line 559
    int-to-long v13, v11

    .line 560
    mul-long/2addr v13, v3

    .line 561
    iget v11, v0, Lmg2;->p:I

    .line 562
    .line 563
    move-wide v15, v1

    .line 564
    int-to-long v1, v11

    .line 565
    mul-long/2addr v1, v15

    .line 566
    const/16 v20, 0x1

    .line 567
    .line 568
    add-int/lit8 v11, v11, 0x1

    .line 569
    .line 570
    move-wide/from16 v17, v1

    .line 571
    .line 572
    int-to-long v1, v11

    .line 573
    mul-long/2addr v1, v15

    .line 574
    int-to-long v11, v12

    .line 575
    move-wide/from16 v21, v1

    .line 576
    .line 577
    int-to-long v1, v10

    .line 578
    sub-long v17, v21, v17

    .line 579
    .line 580
    sub-long v13, v21, v13

    .line 581
    .line 582
    sub-long v21, v17, v13

    .line 583
    .line 584
    mul-long/2addr v13, v11

    .line 585
    mul-long v21, v21, v1

    .line 586
    .line 587
    add-long v21, v21, v13

    .line 588
    .line 589
    div-long v1, v21, v17

    .line 590
    .line 591
    long-to-int v1, v1

    .line 592
    add-int/2addr v9, v6

    .line 593
    int-to-short v1, v1

    .line 594
    aput-short v1, v8, v9

    .line 595
    .line 596
    add-int/lit8 v6, v6, 0x1

    .line 597
    .line 598
    move-wide v1, v15

    .line 599
    goto :goto_12

    .line 600
    :cond_14
    move-wide v15, v1

    .line 601
    iget v1, v0, Lmg2;->q:I

    .line 602
    .line 603
    const/16 v20, 0x1

    .line 604
    .line 605
    add-int/lit8 v1, v1, 0x1

    .line 606
    .line 607
    iput v1, v0, Lmg2;->q:I

    .line 608
    .line 609
    iget v1, v0, Lmg2;->m:I

    .line 610
    .line 611
    add-int/lit8 v1, v1, 0x1

    .line 612
    .line 613
    iput v1, v0, Lmg2;->m:I

    .line 614
    .line 615
    move-wide v1, v15

    .line 616
    goto :goto_11

    .line 617
    :cond_15
    move-wide v15, v1

    .line 618
    move/from16 v20, v8

    .line 619
    .line 620
    iput v6, v0, Lmg2;->p:I

    .line 621
    .line 622
    cmp-long v1, v9, v3

    .line 623
    .line 624
    const/4 v2, 0x0

    .line 625
    if-nez v1, :cond_17

    .line 626
    .line 627
    iput v2, v0, Lmg2;->p:I

    .line 628
    .line 629
    cmp-long v1, v13, v15

    .line 630
    .line 631
    if-nez v1, :cond_16

    .line 632
    .line 633
    move/from16 v1, v20

    .line 634
    .line 635
    goto :goto_13

    .line 636
    :cond_16
    move v1, v2

    .line 637
    :goto_13
    invoke-static {v1}, Lzt0;->b0(Z)V

    .line 638
    .line 639
    .line 640
    iput v2, v0, Lmg2;->q:I

    .line 641
    .line 642
    :cond_17
    add-int/lit8 v5, v5, 0x1

    .line 643
    .line 644
    move-wide v1, v15

    .line 645
    goto/16 :goto_10

    .line 646
    .line 647
    :cond_18
    const/4 v2, 0x0

    .line 648
    if-eqz v8, :cond_19

    .line 649
    .line 650
    iget-object v1, v0, Lmg2;->n:[S

    .line 651
    .line 652
    mul-int v3, v8, v7

    .line 653
    .line 654
    sub-int/2addr v6, v8

    .line 655
    mul-int/2addr v6, v7

    .line 656
    invoke-static {v1, v3, v1, v2, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 657
    .line 658
    .line 659
    iget v1, v0, Lmg2;->o:I

    .line 660
    .line 661
    sub-int/2addr v1, v8

    .line 662
    iput v1, v0, Lmg2;->o:I

    .line 663
    .line 664
    :cond_19
    :goto_14
    return-void

    .line 665
    :cond_1a
    const/16 v20, 0x1

    .line 666
    .line 667
    move/from16 v9, v20

    .line 668
    .line 669
    move/from16 v2, v21

    .line 670
    .line 671
    move-wide/from16 v3, v22

    .line 672
    .line 673
    const/4 v8, 0x0

    .line 674
    goto/16 :goto_2
.end method
