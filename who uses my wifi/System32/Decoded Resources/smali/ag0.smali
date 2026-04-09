.class public final Lag0;
.super Ltn0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public k:I

.field public l:I

.field public m:I

.field public n:[B

.field public o:[B

.field public p:Ll31;


# virtual methods
.method public final k(Lcm;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcm;->i()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iput v0, p0, Lag0;->k:I

    .line 6
    .line 7
    invoke-virtual {p1}, Lcm;->i()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iput v0, p0, Lag0;->l:I

    .line 12
    .line 13
    invoke-virtual {p1}, Lcm;->f()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iput v0, p0, Lag0;->m:I

    .line 18
    .line 19
    invoke-virtual {p1}, Lcm;->i()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-lez v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Lcm;->c(I)[B

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, Lag0;->n:[B

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 v0, 0x0

    .line 33
    iput-object v0, p0, Lag0;->n:[B

    .line 34
    .line 35
    :goto_0
    invoke-virtual {p1}, Lcm;->i()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    invoke-virtual {p1, v0}, Lcm;->c(I)[B

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iput-object v0, p0, Lag0;->o:[B

    .line 44
    .line 45
    new-instance v0, Ll31;

    .line 46
    .line 47
    invoke-direct {v0, p1}, Ll31;-><init>(Lcm;)V

    .line 48
    .line 49
    .line 50
    iput-object v0, p0, Lag0;->p:Ll31;

    .line 51
    .line 52
    return-void
.end method

.method public final l()Ljava/lang/String;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    iget v2, v0, Lag0;->k:I

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 v2, 0x20

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v3, v0, Lag0;->l:I

    .line 19
    .line 20
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    iget v3, v0, Lag0;->m:I

    .line 27
    .line 28
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    iget-object v3, v0, Lag0;->n:[B

    .line 35
    .line 36
    if-nez v3, :cond_0

    .line 37
    .line 38
    const/16 v3, 0x2d

    .line 39
    .line 40
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-static {v3}, Lyb;->s([B)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    iget-object v3, v0, Lag0;->o:[B

    .line 55
    .line 56
    new-instance v4, Ljava/io/ByteArrayOutputStream;

    .line 57
    .line 58
    invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 59
    .line 60
    .line 61
    const/4 v5, 0x0

    .line 62
    move v6, v5

    .line 63
    :goto_1
    array-length v7, v3

    .line 64
    const/4 v8, 0x4

    .line 65
    add-int/2addr v7, v8

    .line 66
    const/4 v9, 0x5

    .line 67
    div-int/2addr v7, v9

    .line 68
    if-ge v6, v7, :cond_9

    .line 69
    .line 70
    new-array v7, v9, [S

    .line 71
    .line 72
    move v10, v5

    .line 73
    move v11, v9

    .line 74
    :goto_2
    if-ge v10, v9, :cond_2

    .line 75
    .line 76
    mul-int/lit8 v12, v6, 0x5

    .line 77
    .line 78
    add-int/2addr v12, v10

    .line 79
    array-length v13, v3

    .line 80
    if-ge v12, v13, :cond_1

    .line 81
    .line 82
    aget-byte v12, v3, v12

    .line 83
    .line 84
    and-int/lit16 v12, v12, 0xff

    .line 85
    .line 86
    int-to-short v12, v12

    .line 87
    aput-short v12, v7, v10

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_1
    aput-short v5, v7, v10

    .line 91
    .line 92
    add-int/lit8 v11, v11, -0x1

    .line 93
    .line 94
    :goto_3
    add-int/lit8 v10, v10, 0x1

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_2
    const/4 v10, 0x2

    .line 98
    const/4 v12, 0x3

    .line 99
    const/4 v13, 0x1

    .line 100
    if-eq v11, v13, :cond_7

    .line 101
    .line 102
    if-eq v11, v10, :cond_6

    .line 103
    .line 104
    if-eq v11, v12, :cond_5

    .line 105
    .line 106
    if-eq v11, v8, :cond_4

    .line 107
    .line 108
    if-eq v11, v9, :cond_3

    .line 109
    .line 110
    const/4 v9, -0x1

    .line 111
    goto :goto_4

    .line 112
    :cond_3
    move v9, v5

    .line 113
    goto :goto_4

    .line 114
    :cond_4
    move v9, v13

    .line 115
    goto :goto_4

    .line 116
    :cond_5
    move v9, v12

    .line 117
    goto :goto_4

    .line 118
    :cond_6
    move v9, v8

    .line 119
    goto :goto_4

    .line 120
    :cond_7
    const/4 v9, 0x6

    .line 121
    :goto_4
    aget-short v11, v7, v5

    .line 122
    .line 123
    shr-int/lit8 v14, v11, 0x3

    .line 124
    .line 125
    and-int/lit8 v14, v14, 0x1f

    .line 126
    .line 127
    int-to-byte v15, v14

    .line 128
    and-int/lit8 v11, v11, 0x7

    .line 129
    .line 130
    shl-int/2addr v11, v10

    .line 131
    aget-short v14, v7, v13

    .line 132
    .line 133
    shr-int/lit8 v16, v14, 0x6

    .line 134
    .line 135
    and-int/lit8 v16, v16, 0x3

    .line 136
    .line 137
    or-int v11, v11, v16

    .line 138
    .line 139
    int-to-byte v11, v11

    .line 140
    shr-int/lit8 v16, v14, 0x1

    .line 141
    .line 142
    and-int/lit8 v5, v16, 0x1f

    .line 143
    .line 144
    int-to-byte v5, v5

    .line 145
    and-int/2addr v14, v13

    .line 146
    shl-int/2addr v14, v8

    .line 147
    aget-short v10, v7, v10

    .line 148
    .line 149
    shr-int/lit8 v16, v10, 0x4

    .line 150
    .line 151
    and-int/lit8 v16, v16, 0xf

    .line 152
    .line 153
    or-int v14, v14, v16

    .line 154
    .line 155
    int-to-byte v14, v14

    .line 156
    and-int/lit8 v10, v10, 0xf

    .line 157
    .line 158
    shl-int/2addr v10, v13

    .line 159
    aget-short v16, v7, v12

    .line 160
    .line 161
    shr-int/lit8 v17, v16, 0x7

    .line 162
    .line 163
    and-int/lit8 v13, v17, 0x1

    .line 164
    .line 165
    or-int/2addr v10, v13

    .line 166
    int-to-byte v10, v10

    .line 167
    shr-int/lit8 v13, v16, 0x2

    .line 168
    .line 169
    and-int/lit8 v13, v13, 0x1f

    .line 170
    .line 171
    int-to-byte v13, v13

    .line 172
    and-int/lit8 v16, v16, 0x3

    .line 173
    .line 174
    shl-int/lit8 v12, v16, 0x3

    .line 175
    .line 176
    aget-short v7, v7, v8

    .line 177
    .line 178
    shr-int/lit8 v8, v7, 0x5

    .line 179
    .line 180
    and-int/lit8 v8, v8, 0x7

    .line 181
    .line 182
    or-int/2addr v8, v12

    .line 183
    int-to-byte v8, v8

    .line 184
    and-int/lit8 v7, v7, 0x1f

    .line 185
    .line 186
    int-to-byte v7, v7

    .line 187
    move/from16 v17, v5

    .line 188
    .line 189
    move/from16 v22, v7

    .line 190
    .line 191
    move/from16 v21, v8

    .line 192
    .line 193
    move/from16 v19, v10

    .line 194
    .line 195
    move/from16 v16, v11

    .line 196
    .line 197
    move/from16 v20, v13

    .line 198
    .line 199
    move/from16 v18, v14

    .line 200
    .line 201
    filled-new-array/range {v15 .. v22}, [I

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    const/4 v7, 0x0

    .line 206
    :goto_5
    rsub-int/lit8 v8, v9, 0x8

    .line 207
    .line 208
    if-ge v7, v8, :cond_8

    .line 209
    .line 210
    const-string v8, "0123456789ABCDEFGHIJKLMNOPQRSTUV="

    .line 211
    .line 212
    aget v10, v5, v7

    .line 213
    .line 214
    invoke-virtual {v8, v10}, Ljava/lang/String;->charAt(I)C

    .line 215
    .line 216
    .line 217
    move-result v8

    .line 218
    invoke-virtual {v4, v8}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 219
    .line 220
    .line 221
    add-int/lit8 v7, v7, 0x1

    .line 222
    .line 223
    goto :goto_5

    .line 224
    :cond_8
    add-int/lit8 v6, v6, 0x1

    .line 225
    .line 226
    const/4 v5, 0x0

    .line 227
    goto/16 :goto_1

    .line 228
    .line 229
    :cond_9
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toString()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v3

    .line 233
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    iget-object v3, v0, Lag0;->p:Ll31;

    .line 237
    .line 238
    iget-object v3, v3, Ll31;->f:Ljava/util/TreeSet;

    .line 239
    .line 240
    invoke-virtual {v3}, Ljava/util/TreeSet;->isEmpty()Z

    .line 241
    .line 242
    .line 243
    move-result v3

    .line 244
    if-nez v3, :cond_a

    .line 245
    .line 246
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    iget-object v2, v0, Lag0;->p:Ll31;

    .line 250
    .line 251
    invoke-virtual {v2}, Ll31;->toString()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    :cond_a
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    return-object v1
.end method

.method public final m(Lt3;Ljh;Z)V
    .locals 0

    .line 1
    iget p2, p0, Lag0;->k:I

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lt3;->q(I)V

    .line 4
    .line 5
    .line 6
    iget p2, p0, Lag0;->l:I

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Lt3;->q(I)V

    .line 9
    .line 10
    .line 11
    iget p2, p0, Lag0;->m:I

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lt3;->m(I)V

    .line 14
    .line 15
    .line 16
    iget-object p2, p0, Lag0;->n:[B

    .line 17
    .line 18
    if-eqz p2, :cond_0

    .line 19
    .line 20
    array-length p2, p2

    .line 21
    invoke-virtual {p1, p2}, Lt3;->q(I)V

    .line 22
    .line 23
    .line 24
    iget-object p2, p0, Lag0;->n:[B

    .line 25
    .line 26
    invoke-virtual {p1, p2}, Lt3;->j([B)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p2, 0x0

    .line 31
    invoke-virtual {p1, p2}, Lt3;->q(I)V

    .line 32
    .line 33
    .line 34
    :goto_0
    iget-object p2, p0, Lag0;->o:[B

    .line 35
    .line 36
    array-length p2, p2

    .line 37
    invoke-virtual {p1, p2}, Lt3;->q(I)V

    .line 38
    .line 39
    .line 40
    iget-object p2, p0, Lag0;->o:[B

    .line 41
    .line 42
    invoke-virtual {p1, p2}, Lt3;->j([B)V

    .line 43
    .line 44
    .line 45
    iget-object p2, p0, Lag0;->p:Ll31;

    .line 46
    .line 47
    invoke-virtual {p2, p1}, Ll31;->b(Lt3;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method
