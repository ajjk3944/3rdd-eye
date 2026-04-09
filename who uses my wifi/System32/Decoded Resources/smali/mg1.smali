.class public final Lmg1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Llf1;


# static fields
.field public static final l:[I

.field public static final m:[I

.field public static final n:[B

.field public static final o:[B


# instance fields
.field public final a:[B

.field public b:Z

.field public c:J

.field public d:I

.field public e:I

.field public f:I

.field public g:Lnf1;

.field public h:Ljg1;

.field public i:Ljg1;

.field public j:Lqf1;

.field public k:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v1, v0, [I

    .line 4
    .line 5
    fill-array-data v1, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v1, Lmg1;->l:[I

    .line 9
    .line 10
    new-array v0, v0, [I

    .line 11
    .line 12
    fill-array-data v0, :array_1

    .line 13
    .line 14
    .line 15
    sput-object v0, Lmg1;->m:[I

    .line 16
    .line 17
    sget-object v0, Lv23;->a:Ljava/lang/String;

    .line 18
    .line 19
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 20
    .line 21
    const-string v1, "#!AMR\n"

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    sput-object v1, Lmg1;->n:[B

    .line 28
    .line 29
    const-string v1, "#!AMR-WB\n"

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lmg1;->o:[B

    .line 36
    .line 37
    return-void

    .line 38
    nop

    .line 39
    :array_0
    .array-data 4
        0xd
        0xe
        0x10
        0x12
        0x14
        0x15
        0x1b
        0x20
        0x6
        0x7
        0x6
        0x6
        0x1
        0x1
        0x1
        0x1
    .end array-data

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    :array_1
    .array-data 4
        0x12
        0x18
        0x21
        0x25
        0x29
        0x2f
        0x33
        0x3b
        0x3d
        0x6
        0x1
        0x1
        0x1
        0x1
        0x1
        0x1
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    new-array v0, v0, [B

    .line 6
    .line 7
    iput-object v0, p0, Lmg1;->a:[B

    .line 8
    .line 9
    const/4 v0, -0x1

    .line 10
    iput v0, p0, Lmg1;->f:I

    .line 11
    .line 12
    new-instance v0, Lgf1;

    .line 13
    .line 14
    invoke-direct {v0}, Lgf1;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lmg1;->i:Ljg1;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final a(Lmf1;)Z
    .locals 5

    .line 1
    invoke-interface {p1}, Lmf1;->i()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lmg1;->n:[B

    .line 5
    .line 6
    array-length v1, v0

    .line 7
    new-array v2, v1, [B

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-interface {p1, v2, v3, v1}, Lmf1;->u([BII)V

    .line 11
    .line 12
    .line 13
    invoke-static {v2, v0}, Ljava/util/Arrays;->equals([B[B)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    iput-boolean v3, p0, Lmg1;->b:Z

    .line 21
    .line 22
    array-length v0, v0

    .line 23
    invoke-interface {p1, v0}, Lmf1;->t(I)V

    .line 24
    .line 25
    .line 26
    return v2

    .line 27
    :cond_0
    invoke-interface {p1}, Lmf1;->i()V

    .line 28
    .line 29
    .line 30
    sget-object v0, Lmg1;->o:[B

    .line 31
    .line 32
    array-length v1, v0

    .line 33
    new-array v4, v1, [B

    .line 34
    .line 35
    invoke-interface {p1, v4, v3, v1}, Lmf1;->u([BII)V

    .line 36
    .line 37
    .line 38
    invoke-static {v4, v0}, Ljava/util/Arrays;->equals([B[B)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    iput-boolean v2, p0, Lmg1;->b:Z

    .line 45
    .line 46
    array-length v0, v0

    .line 47
    invoke-interface {p1, v0}, Lmf1;->t(I)V

    .line 48
    .line 49
    .line 50
    return v2

    .line 51
    :cond_1
    return v3
.end method

.method public final b(Lmf1;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lmg1;->a(Lmf1;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public final c(Lmf1;Lpf1;)I
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lmg1;->h:Ljg1;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object v2, Lv23;->a:Ljava/lang/String;

    .line 11
    .line 12
    move-object v2, v1

    .line 13
    check-cast v2, Ldf1;

    .line 14
    .line 15
    iget-wide v2, v2, Ldf1;->i:J

    .line 16
    .line 17
    const-wide/16 v4, 0x0

    .line 18
    .line 19
    cmp-long v2, v2, v4

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    invoke-virtual/range {p0 .. p1}, Lmg1;->a(Lmf1;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const-string v1, "Could not find AMR header."

    .line 32
    .line 33
    invoke-static {v3, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    throw v1

    .line 38
    :cond_1
    :goto_0
    iget-boolean v2, v0, Lmg1;->k:Z

    .line 39
    .line 40
    sget-object v6, Lmg1;->l:[I

    .line 41
    .line 42
    sget-object v7, Lmg1;->m:[I

    .line 43
    .line 44
    const/4 v8, 0x1

    .line 45
    if-nez v2, :cond_6

    .line 46
    .line 47
    iput-boolean v8, v0, Lmg1;->k:Z

    .line 48
    .line 49
    iget-boolean v2, v0, Lmg1;->b:Z

    .line 50
    .line 51
    const-string v9, "audio/amr-wb"

    .line 52
    .line 53
    if-eq v8, v2, :cond_2

    .line 54
    .line 55
    const-string v10, "audio/amr"

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    move-object v10, v9

    .line 59
    :goto_1
    if-eq v8, v2, :cond_3

    .line 60
    .line 61
    const-string v9, "audio/3gpp"

    .line 62
    .line 63
    :cond_3
    if-eq v8, v2, :cond_4

    .line 64
    .line 65
    const/16 v11, 0x1f40

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_4
    const/16 v11, 0x3e80

    .line 69
    .line 70
    :goto_2
    if-eqz v2, :cond_5

    .line 71
    .line 72
    const/16 v2, 0x8

    .line 73
    .line 74
    aget v2, v7, v2

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_5
    const/4 v2, 0x7

    .line 78
    aget v2, v6, v2

    .line 79
    .line 80
    :goto_3
    iget-object v12, v0, Lmg1;->h:Ljg1;

    .line 81
    .line 82
    new-instance v13, Lgg4;

    .line 83
    .line 84
    invoke-direct {v13}, Lgg4;-><init>()V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v13, v10}, Lgg4;->d(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v13, v9}, Lgg4;->e(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    iput v2, v13, Lgg4;->m:I

    .line 94
    .line 95
    iput v8, v13, Lgg4;->D:I

    .line 96
    .line 97
    iput v11, v13, Lgg4;->E:I

    .line 98
    .line 99
    new-instance v2, Lph4;

    .line 100
    .line 101
    invoke-direct {v2, v13}, Lph4;-><init>(Lgg4;)V

    .line 102
    .line 103
    .line 104
    invoke-interface {v12, v2}, Ljg1;->d(Lph4;)V

    .line 105
    .line 106
    .line 107
    :cond_6
    iget v2, v0, Lmg1;->e:I

    .line 108
    .line 109
    const/4 v9, 0x0

    .line 110
    const/4 v10, -0x1

    .line 111
    if-nez v2, :cond_d

    .line 112
    .line 113
    :try_start_0
    const-string v2, "Invalid padding bits for frame header "

    .line 114
    .line 115
    move-object v11, v1

    .line 116
    check-cast v11, Ldf1;

    .line 117
    .line 118
    iput v9, v11, Ldf1;->k:I

    .line 119
    .line 120
    iget-object v11, v0, Lmg1;->a:[B

    .line 121
    .line 122
    move-object v12, v1

    .line 123
    check-cast v12, Ldf1;

    .line 124
    .line 125
    invoke-virtual {v12, v11, v9, v8, v9}, Ldf1;->B([BIIZ)Z

    .line 126
    .line 127
    .line 128
    aget-byte v11, v11, v9

    .line 129
    .line 130
    and-int/lit16 v12, v11, 0x83

    .line 131
    .line 132
    if-gtz v12, :cond_c

    .line 133
    .line 134
    shr-int/lit8 v2, v11, 0x3

    .line 135
    .line 136
    const-string v11, "Illegal AMR "

    .line 137
    .line 138
    const-string v12, " frame type "

    .line 139
    .line 140
    iget-boolean v13, v0, Lmg1;->b:Z

    .line 141
    .line 142
    and-int/lit8 v2, v2, 0xf

    .line 143
    .line 144
    if-eqz v13, :cond_7

    .line 145
    .line 146
    const/16 v14, 0xa

    .line 147
    .line 148
    if-lt v2, v14, :cond_8

    .line 149
    .line 150
    const/16 v14, 0xd

    .line 151
    .line 152
    if-le v2, v14, :cond_7

    .line 153
    .line 154
    goto :goto_4

    .line 155
    :cond_7
    if-nez v13, :cond_a

    .line 156
    .line 157
    const/16 v14, 0xc

    .line 158
    .line 159
    if-lt v2, v14, :cond_8

    .line 160
    .line 161
    const/16 v14, 0xe

    .line 162
    .line 163
    if-gt v2, v14, :cond_8

    .line 164
    .line 165
    goto :goto_6

    .line 166
    :cond_8
    :goto_4
    if-eqz v13, :cond_9

    .line 167
    .line 168
    aget v2, v7, v2

    .line 169
    .line 170
    goto :goto_5

    .line 171
    :cond_9
    aget v2, v6, v2

    .line 172
    .line 173
    :goto_5
    iput v2, v0, Lmg1;->d:I
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 174
    .line 175
    iput v2, v0, Lmg1;->e:I

    .line 176
    .line 177
    iget v3, v0, Lmg1;->f:I

    .line 178
    .line 179
    if-ne v3, v10, :cond_d

    .line 180
    .line 181
    iput v2, v0, Lmg1;->f:I

    .line 182
    .line 183
    goto :goto_8

    .line 184
    :cond_a
    :goto_6
    :try_start_1
    const-string v1, "WB"

    .line 185
    .line 186
    const-string v6, "NB"

    .line 187
    .line 188
    if-eq v8, v13, :cond_b

    .line 189
    .line 190
    move-object v1, v6

    .line 191
    :cond_b
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 192
    .line 193
    .line 194
    move-result v6

    .line 195
    add-int/lit8 v6, v6, 0x18

    .line 196
    .line 197
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v7

    .line 201
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 202
    .line 203
    .line 204
    move-result v7

    .line 205
    add-int/2addr v6, v7

    .line 206
    new-instance v7, Ljava/lang/StringBuilder;

    .line 207
    .line 208
    invoke-direct {v7, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    invoke-static {v3, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    throw v1

    .line 232
    :cond_c
    invoke-static {v11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 237
    .line 238
    .line 239
    move-result v1

    .line 240
    add-int/lit8 v1, v1, 0x26

    .line 241
    .line 242
    new-instance v6, Ljava/lang/StringBuilder;

    .line 243
    .line 244
    invoke-direct {v6, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    invoke-static {v3, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    throw v1
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0

    .line 262
    :catch_0
    :goto_7
    move v1, v10

    .line 263
    goto :goto_a

    .line 264
    :cond_d
    :goto_8
    iget-object v3, v0, Lmg1;->i:Ljg1;

    .line 265
    .line 266
    invoke-interface {v3, v1, v2, v8}, Ljg1;->b(Lua4;IZ)I

    .line 267
    .line 268
    .line 269
    move-result v1

    .line 270
    if-ne v1, v10, :cond_e

    .line 271
    .line 272
    goto :goto_7

    .line 273
    :cond_e
    iget v2, v0, Lmg1;->e:I

    .line 274
    .line 275
    sub-int/2addr v2, v1

    .line 276
    iput v2, v0, Lmg1;->e:I

    .line 277
    .line 278
    if-lez v2, :cond_f

    .line 279
    .line 280
    :goto_9
    move v1, v9

    .line 281
    goto :goto_a

    .line 282
    :cond_f
    iget-object v11, v0, Lmg1;->i:Ljg1;

    .line 283
    .line 284
    iget-wide v12, v0, Lmg1;->c:J

    .line 285
    .line 286
    iget v15, v0, Lmg1;->d:I

    .line 287
    .line 288
    const/16 v16, 0x0

    .line 289
    .line 290
    const/16 v17, 0x0

    .line 291
    .line 292
    const/4 v14, 0x1

    .line 293
    invoke-interface/range {v11 .. v17}, Ljg1;->c(JIIILig1;)V

    .line 294
    .line 295
    .line 296
    iget-wide v1, v0, Lmg1;->c:J

    .line 297
    .line 298
    const-wide/16 v6, 0x4e20

    .line 299
    .line 300
    add-long/2addr v1, v6

    .line 301
    iput-wide v1, v0, Lmg1;->c:J

    .line 302
    .line 303
    goto :goto_9

    .line 304
    :goto_a
    iget-object v2, v0, Lmg1;->j:Lqf1;

    .line 305
    .line 306
    if-eqz v2, :cond_10

    .line 307
    .line 308
    goto :goto_b

    .line 309
    :cond_10
    new-instance v2, Lqf1;

    .line 310
    .line 311
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    invoke-direct {v2, v6, v7, v4, v5}, Lqf1;-><init>(JJ)V

    .line 317
    .line 318
    .line 319
    iput-object v2, v0, Lmg1;->j:Lqf1;

    .line 320
    .line 321
    iget-object v3, v0, Lmg1;->g:Lnf1;

    .line 322
    .line 323
    invoke-interface {v3, v2}, Lnf1;->v(Lcg1;)V

    .line 324
    .line 325
    .line 326
    :goto_b
    if-ne v1, v10, :cond_11

    .line 327
    .line 328
    return v10

    .line 329
    :cond_11
    return v9
.end method

.method public final e(JJ)V
    .locals 0

    .line 1
    const-wide/16 p1, 0x0

    .line 2
    .line 3
    iput-wide p1, p0, Lmg1;->c:J

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    iput p1, p0, Lmg1;->d:I

    .line 7
    .line 8
    iput p1, p0, Lmg1;->e:I

    .line 9
    .line 10
    return-void
.end method

.method public final f(Lnf1;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lmg1;->g:Lnf1;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    invoke-interface {p1, v0, v1}, Lnf1;->z(II)Ljg1;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lmg1;->h:Ljg1;

    .line 10
    .line 11
    iput-object v0, p0, Lmg1;->i:Ljg1;

    .line 12
    .line 13
    invoke-interface {p1}, Lnf1;->s()V

    .line 14
    .line 15
    .line 16
    return-void
.end method
