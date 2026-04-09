.class public final Lch1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Llf1;


# instance fields
.field public final a:Lkz2;

.field public final b:Lkz2;

.field public final c:Lkz2;

.field public final d:Lkz2;

.field public final e:Ldh1;

.field public f:Lnf1;

.field public g:I

.field public h:Z

.field public i:J

.field public j:I

.field public k:I

.field public l:I

.field public m:J

.field public n:Z

.field public o:Lbh1;

.field public p:Lfh1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget v0, Lbd2;->o:I

    .line 2
    .line 3
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lkz2;

    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    invoke-direct {v0, v1}, Lkz2;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lch1;->a:Lkz2;

    .line 11
    .line 12
    new-instance v0, Lkz2;

    .line 13
    .line 14
    const/16 v1, 0x9

    .line 15
    .line 16
    invoke-direct {v0, v1}, Lkz2;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lch1;->b:Lkz2;

    .line 20
    .line 21
    new-instance v0, Lkz2;

    .line 22
    .line 23
    const/16 v1, 0xb

    .line 24
    .line 25
    invoke-direct {v0, v1}, Lkz2;-><init>(I)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lch1;->c:Lkz2;

    .line 29
    .line 30
    new-instance v0, Lkz2;

    .line 31
    .line 32
    invoke-direct {v0}, Lkz2;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lch1;->d:Lkz2;

    .line 36
    .line 37
    new-instance v0, Ldh1;

    .line 38
    .line 39
    new-instance v1, Lgf1;

    .line 40
    .line 41
    invoke-direct {v1}, Lgf1;-><init>()V

    .line 42
    .line 43
    .line 44
    const/4 v2, 0x5

    .line 45
    invoke-direct {v0, v2, v1}, Lf74;-><init>(ILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    iput-wide v1, v0, Ldh1;->i:J

    .line 54
    .line 55
    const/4 v1, 0x0

    .line 56
    new-array v2, v1, [J

    .line 57
    .line 58
    iput-object v2, v0, Ldh1;->j:[J

    .line 59
    .line 60
    new-array v1, v1, [J

    .line 61
    .line 62
    iput-object v1, v0, Ldh1;->k:[J

    .line 63
    .line 64
    iput-object v0, p0, Lch1;->e:Ldh1;

    .line 65
    .line 66
    const/4 v0, 0x1

    .line 67
    iput v0, p0, Lch1;->g:I

    .line 68
    .line 69
    return-void
.end method


# virtual methods
.method public final a(Lmf1;)Lkz2;
    .locals 5

    .line 1
    iget v0, p0, Lch1;->l:I

    .line 2
    .line 3
    iget-object v1, p0, Lch1;->d:Lkz2;

    .line 4
    .line 5
    iget-object v2, v1, Lkz2;->a:[B

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    const/4 v4, 0x0

    .line 9
    if-le v0, v3, :cond_0

    .line 10
    .line 11
    array-length v2, v2

    .line 12
    add-int/2addr v2, v2

    .line 13
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    new-array v0, v0, [B

    .line 18
    .line 19
    invoke-virtual {v1, v4, v0}, Lkz2;->z(I[B)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v1, v4}, Lkz2;->E(I)V

    .line 24
    .line 25
    .line 26
    :goto_0
    iget v0, p0, Lch1;->l:I

    .line 27
    .line 28
    invoke-virtual {v1, v0}, Lkz2;->C(I)V

    .line 29
    .line 30
    .line 31
    iget-object v0, v1, Lkz2;->a:[B

    .line 32
    .line 33
    iget v2, p0, Lch1;->l:I

    .line 34
    .line 35
    invoke-interface {p1, v0, v4, v2}, Lmf1;->x([BII)V

    .line 36
    .line 37
    .line 38
    return-object v1
.end method

.method public final b(Lmf1;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lch1;->a:Lkz2;

    .line 2
    .line 3
    iget-object v1, v0, Lkz2;->a:[B

    .line 4
    .line 5
    check-cast p1, Ldf1;

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-virtual {p1, v1, v3, v2, v3}, Ldf1;->B([BIIZ)Z

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v3}, Lkz2;->E(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lkz2;->O()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const v2, 0x464c56

    .line 20
    .line 21
    .line 22
    if-eq v1, v2, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v1, v0, Lkz2;->a:[B

    .line 26
    .line 27
    const/4 v2, 0x2

    .line 28
    invoke-virtual {p1, v1, v3, v2, v3}, Ldf1;->B([BIIZ)Z

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v3}, Lkz2;->E(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Lkz2;->L()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    and-int/lit16 v1, v1, 0xfa

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    iget-object v1, v0, Lkz2;->a:[B

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    invoke-virtual {p1, v1, v3, v2, v3}, Ldf1;->B([BIIZ)Z

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v3}, Lkz2;->E(I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Lkz2;->b()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    iput v3, p1, Ldf1;->k:I

    .line 57
    .line 58
    invoke-virtual {p1, v1, v3}, Ldf1;->e(IZ)Z

    .line 59
    .line 60
    .line 61
    iget-object v1, v0, Lkz2;->a:[B

    .line 62
    .line 63
    invoke-virtual {p1, v1, v3, v2, v3}, Ldf1;->B([BIIZ)Z

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v3}, Lkz2;->E(I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Lkz2;->b()I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-nez p1, :cond_2

    .line 74
    .line 75
    const/4 p1, 0x1

    .line 76
    return p1

    .line 77
    :cond_2
    :goto_0
    return v3
.end method

.method public final c(Lmf1;Lpf1;)I
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lch1;->f:Lnf1;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    :cond_0
    :goto_0
    iget v1, v0, Lch1;->g:I

    .line 9
    .line 10
    const/16 v2, 0x9

    .line 11
    .line 12
    const/16 v3, 0x8

    .line 13
    .line 14
    const/4 v4, 0x2

    .line 15
    const/4 v5, 0x4

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v7, 0x1

    .line 18
    if-eq v1, v7, :cond_28

    .line 19
    .line 20
    const/4 v8, 0x3

    .line 21
    if-eq v1, v4, :cond_27

    .line 22
    .line 23
    if-eq v1, v8, :cond_25

    .line 24
    .line 25
    if-ne v1, v5, :cond_24

    .line 26
    .line 27
    iget-boolean v1, v0, Lch1;->h:Z

    .line 28
    .line 29
    const-wide/16 v8, 0x0

    .line 30
    .line 31
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    iget-object v12, v0, Lch1;->e:Ldh1;

    .line 37
    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    iget-wide v13, v0, Lch1;->i:J

    .line 41
    .line 42
    iget-wide v4, v0, Lch1;->m:J

    .line 43
    .line 44
    add-long/2addr v13, v4

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    iget-wide v4, v12, Ldh1;->i:J

    .line 47
    .line 48
    cmp-long v4, v4, v10

    .line 49
    .line 50
    if-nez v4, :cond_2

    .line 51
    .line 52
    move-wide v13, v8

    .line 53
    :goto_1
    move-wide/from16 v16, v13

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    iget-wide v13, v0, Lch1;->m:J

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :goto_2
    iget v4, v0, Lch1;->k:I

    .line 60
    .line 61
    if-ne v4, v3, :cond_f

    .line 62
    .line 63
    iget-object v4, v0, Lch1;->o:Lbh1;

    .line 64
    .line 65
    if-eqz v4, :cond_10

    .line 66
    .line 67
    iget-boolean v2, v0, Lch1;->n:Z

    .line 68
    .line 69
    if-nez v2, :cond_3

    .line 70
    .line 71
    iget-object v2, v0, Lch1;->f:Lnf1;

    .line 72
    .line 73
    new-instance v3, Lqf1;

    .line 74
    .line 75
    invoke-direct {v3, v10, v11, v8, v9}, Lqf1;-><init>(JJ)V

    .line 76
    .line 77
    .line 78
    invoke-interface {v2, v3}, Lnf1;->v(Lcg1;)V

    .line 79
    .line 80
    .line 81
    iput-boolean v7, v0, Lch1;->n:Z

    .line 82
    .line 83
    :cond_3
    iget-object v2, v0, Lch1;->o:Lbh1;

    .line 84
    .line 85
    invoke-virtual/range {p0 .. p1}, Lch1;->a(Lmf1;)Lkz2;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    iget-object v4, v2, Lf74;->g:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v4, Ljg1;

    .line 92
    .line 93
    iget-boolean v5, v2, Lbh1;->i:Z

    .line 94
    .line 95
    const/4 v13, 0x1

    .line 96
    if-nez v5, :cond_9

    .line 97
    .line 98
    invoke-virtual {v3}, Lkz2;->K()I

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    shr-int/lit8 v14, v5, 0x4

    .line 103
    .line 104
    iput v14, v2, Lbh1;->k:I

    .line 105
    .line 106
    const-string v15, "video/x-flv"

    .line 107
    .line 108
    const/4 v1, 0x2

    .line 109
    if-ne v14, v1, :cond_4

    .line 110
    .line 111
    shr-int/lit8 v1, v5, 0x2

    .line 112
    .line 113
    and-int/lit8 v1, v1, 0x3

    .line 114
    .line 115
    sget-object v5, Lbh1;->l:[I

    .line 116
    .line 117
    aget v1, v5, v1

    .line 118
    .line 119
    new-instance v5, Lgg4;

    .line 120
    .line 121
    invoke-direct {v5}, Lgg4;-><init>()V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v5, v15}, Lgg4;->d(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    const-string v14, "audio/mpeg"

    .line 128
    .line 129
    invoke-virtual {v5, v14}, Lgg4;->e(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    iput v13, v5, Lgg4;->D:I

    .line 133
    .line 134
    iput v1, v5, Lgg4;->E:I

    .line 135
    .line 136
    new-instance v1, Lph4;

    .line 137
    .line 138
    invoke-direct {v1, v5}, Lph4;-><init>(Lgg4;)V

    .line 139
    .line 140
    .line 141
    invoke-interface {v4, v1}, Ljg1;->d(Lph4;)V

    .line 142
    .line 143
    .line 144
    iput-boolean v13, v2, Lbh1;->j:Z

    .line 145
    .line 146
    goto :goto_5

    .line 147
    :cond_4
    const/4 v1, 0x7

    .line 148
    if-eq v14, v1, :cond_7

    .line 149
    .line 150
    const/16 v5, 0x8

    .line 151
    .line 152
    if-ne v14, v5, :cond_5

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_5
    const/16 v1, 0xa

    .line 156
    .line 157
    if-ne v14, v1, :cond_6

    .line 158
    .line 159
    goto :goto_5

    .line 160
    :cond_6
    new-instance v1, Leh1;

    .line 161
    .line 162
    invoke-static {v14}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    new-instance v3, Ljava/lang/StringBuilder;

    .line 171
    .line 172
    add-int/lit8 v2, v2, 0x1c

    .line 173
    .line 174
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 175
    .line 176
    .line 177
    const-string v2, "Audio format not supported: "

    .line 178
    .line 179
    invoke-static {v3, v2, v14}, Lex0;->j(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    invoke-direct {v1, v2}, Leh1;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    throw v1

    .line 187
    :cond_7
    :goto_3
    new-instance v5, Lgg4;

    .line 188
    .line 189
    invoke-direct {v5}, Lgg4;-><init>()V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v5, v15}, Lgg4;->d(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    if-ne v14, v1, :cond_8

    .line 196
    .line 197
    const-string v1, "audio/g711-alaw"

    .line 198
    .line 199
    goto :goto_4

    .line 200
    :cond_8
    const-string v1, "audio/g711-mlaw"

    .line 201
    .line 202
    :goto_4
    invoke-virtual {v5, v1}, Lgg4;->e(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    iput v13, v5, Lgg4;->D:I

    .line 206
    .line 207
    const/16 v1, 0x1f40

    .line 208
    .line 209
    iput v1, v5, Lgg4;->E:I

    .line 210
    .line 211
    new-instance v1, Lph4;

    .line 212
    .line 213
    invoke-direct {v1, v5}, Lph4;-><init>(Lgg4;)V

    .line 214
    .line 215
    .line 216
    invoke-interface {v4, v1}, Ljg1;->d(Lph4;)V

    .line 217
    .line 218
    .line 219
    iput-boolean v13, v2, Lbh1;->j:Z

    .line 220
    .line 221
    :goto_5
    iput-boolean v13, v2, Lbh1;->i:Z

    .line 222
    .line 223
    goto :goto_6

    .line 224
    :cond_9
    invoke-virtual {v3, v13}, Lkz2;->G(I)V

    .line 225
    .line 226
    .line 227
    :goto_6
    iget-object v1, v2, Lf74;->g:Ljava/lang/Object;

    .line 228
    .line 229
    move-object v15, v1

    .line 230
    check-cast v15, Ljg1;

    .line 231
    .line 232
    iget v1, v2, Lbh1;->k:I

    .line 233
    .line 234
    const/4 v4, 0x2

    .line 235
    const/4 v5, 0x1

    .line 236
    const/4 v13, 0x0

    .line 237
    if-ne v1, v4, :cond_a

    .line 238
    .line 239
    invoke-virtual {v3}, Lkz2;->B()I

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    invoke-interface {v15, v3, v1, v13}, Ljg1;->a(Lkz2;II)V

    .line 244
    .line 245
    .line 246
    const/16 v20, 0x0

    .line 247
    .line 248
    const/16 v21, 0x0

    .line 249
    .line 250
    const/16 v18, 0x1

    .line 251
    .line 252
    move/from16 v19, v1

    .line 253
    .line 254
    invoke-interface/range {v15 .. v21}, Ljg1;->c(JIIILig1;)V

    .line 255
    .line 256
    .line 257
    goto :goto_8

    .line 258
    :cond_a
    invoke-virtual {v3}, Lkz2;->K()I

    .line 259
    .line 260
    .line 261
    move-result v1

    .line 262
    if-nez v1, :cond_d

    .line 263
    .line 264
    iget-boolean v4, v2, Lbh1;->j:Z

    .line 265
    .line 266
    if-eqz v4, :cond_b

    .line 267
    .line 268
    goto :goto_7

    .line 269
    :cond_b
    invoke-virtual {v3}, Lkz2;->B()I

    .line 270
    .line 271
    .line 272
    move-result v1

    .line 273
    new-array v4, v1, [B

    .line 274
    .line 275
    invoke-virtual {v3, v4, v13, v1}, Lkz2;->H([BII)V

    .line 276
    .line 277
    .line 278
    new-instance v3, Llg1;

    .line 279
    .line 280
    invoke-direct {v3, v1, v4}, Llg1;-><init>(I[B)V

    .line 281
    .line 282
    .line 283
    invoke-static {v3, v13}, Li30;->g0(Llg1;Z)Lqe1;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    new-instance v3, Lgg4;

    .line 288
    .line 289
    invoke-direct {v3}, Lgg4;-><init>()V

    .line 290
    .line 291
    .line 292
    const-string v14, "video/x-flv"

    .line 293
    .line 294
    invoke-virtual {v3, v14}, Lgg4;->d(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    const-string v14, "audio/mp4a-latm"

    .line 298
    .line 299
    invoke-virtual {v3, v14}, Lgg4;->e(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    iget-object v14, v1, Lqe1;->a:Ljava/lang/String;

    .line 303
    .line 304
    iput-object v14, v3, Lgg4;->i:Ljava/lang/String;

    .line 305
    .line 306
    iget v14, v1, Lqe1;->c:I

    .line 307
    .line 308
    iput v14, v3, Lgg4;->D:I

    .line 309
    .line 310
    iget v1, v1, Lqe1;->b:I

    .line 311
    .line 312
    iput v1, v3, Lgg4;->E:I

    .line 313
    .line 314
    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    iput-object v1, v3, Lgg4;->o:Ljava/util/List;

    .line 319
    .line 320
    new-instance v1, Lph4;

    .line 321
    .line 322
    invoke-direct {v1, v3}, Lph4;-><init>(Lgg4;)V

    .line 323
    .line 324
    .line 325
    invoke-interface {v15, v1}, Ljg1;->d(Lph4;)V

    .line 326
    .line 327
    .line 328
    iput-boolean v5, v2, Lbh1;->j:Z

    .line 329
    .line 330
    :cond_c
    move v5, v13

    .line 331
    goto :goto_8

    .line 332
    :cond_d
    :goto_7
    iget v2, v2, Lbh1;->k:I

    .line 333
    .line 334
    const/16 v4, 0xa

    .line 335
    .line 336
    if-ne v2, v4, :cond_e

    .line 337
    .line 338
    if-ne v1, v5, :cond_c

    .line 339
    .line 340
    :cond_e
    invoke-virtual {v3}, Lkz2;->B()I

    .line 341
    .line 342
    .line 343
    move-result v1

    .line 344
    invoke-interface {v15, v3, v1, v13}, Ljg1;->a(Lkz2;II)V

    .line 345
    .line 346
    .line 347
    const/16 v20, 0x0

    .line 348
    .line 349
    const/16 v21, 0x0

    .line 350
    .line 351
    const/16 v18, 0x1

    .line 352
    .line 353
    move/from16 v19, v1

    .line 354
    .line 355
    invoke-interface/range {v15 .. v21}, Ljg1;->c(JIIILig1;)V

    .line 356
    .line 357
    .line 358
    :goto_8
    move v1, v7

    .line 359
    move-wide/from16 v29, v10

    .line 360
    .line 361
    goto/16 :goto_13

    .line 362
    .line 363
    :cond_f
    move v3, v4

    .line 364
    :cond_10
    if-ne v3, v2, :cond_1b

    .line 365
    .line 366
    iget-object v1, v0, Lch1;->p:Lfh1;

    .line 367
    .line 368
    if-eqz v1, :cond_1a

    .line 369
    .line 370
    iget-boolean v1, v0, Lch1;->n:Z

    .line 371
    .line 372
    if-nez v1, :cond_11

    .line 373
    .line 374
    iget-object v1, v0, Lch1;->f:Lnf1;

    .line 375
    .line 376
    new-instance v2, Lqf1;

    .line 377
    .line 378
    invoke-direct {v2, v10, v11, v8, v9}, Lqf1;-><init>(JJ)V

    .line 379
    .line 380
    .line 381
    invoke-interface {v1, v2}, Lnf1;->v(Lcg1;)V

    .line 382
    .line 383
    .line 384
    iput-boolean v7, v0, Lch1;->n:Z

    .line 385
    .line 386
    :cond_11
    iget-object v1, v0, Lch1;->p:Lfh1;

    .line 387
    .line 388
    invoke-virtual/range {p0 .. p1}, Lch1;->a(Lmf1;)Lkz2;

    .line 389
    .line 390
    .line 391
    move-result-object v2

    .line 392
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v2}, Lkz2;->K()I

    .line 396
    .line 397
    .line 398
    move-result v3

    .line 399
    shr-int/lit8 v4, v3, 0x4

    .line 400
    .line 401
    and-int/lit8 v3, v3, 0xf

    .line 402
    .line 403
    const/4 v5, 0x7

    .line 404
    if-ne v3, v5, :cond_19

    .line 405
    .line 406
    iput v4, v1, Lfh1;->n:I

    .line 407
    .line 408
    const/4 v3, 0x5

    .line 409
    if-eq v4, v3, :cond_12

    .line 410
    .line 411
    const/4 v3, 0x1

    .line 412
    goto :goto_9

    .line 413
    :cond_12
    const/4 v3, 0x0

    .line 414
    :goto_9
    if-eqz v3, :cond_18

    .line 415
    .line 416
    iget-object v3, v1, Lf74;->g:Ljava/lang/Object;

    .line 417
    .line 418
    check-cast v3, Ljg1;

    .line 419
    .line 420
    invoke-virtual {v2}, Lkz2;->K()I

    .line 421
    .line 422
    .line 423
    move-result v4

    .line 424
    const/4 v5, 0x3

    .line 425
    invoke-virtual {v2, v5}, Lkz2;->v(I)V

    .line 426
    .line 427
    .line 428
    iget-object v13, v2, Lkz2;->a:[B

    .line 429
    .line 430
    iget v14, v2, Lkz2;->b:I

    .line 431
    .line 432
    add-int/lit8 v15, v14, 0x1

    .line 433
    .line 434
    iput v15, v2, Lkz2;->b:I

    .line 435
    .line 436
    move/from16 v18, v5

    .line 437
    .line 438
    aget-byte v5, v13, v14

    .line 439
    .line 440
    and-int/lit16 v5, v5, 0xff

    .line 441
    .line 442
    add-int/lit8 v8, v14, 0x2

    .line 443
    .line 444
    iput v8, v2, Lkz2;->b:I

    .line 445
    .line 446
    aget-byte v9, v13, v15

    .line 447
    .line 448
    and-int/lit16 v9, v9, 0xff

    .line 449
    .line 450
    add-int/lit8 v14, v14, 0x3

    .line 451
    .line 452
    iput v14, v2, Lkz2;->b:I

    .line 453
    .line 454
    aget-byte v8, v13, v8

    .line 455
    .line 456
    and-int/lit16 v8, v8, 0xff

    .line 457
    .line 458
    shl-int/lit8 v5, v5, 0x18

    .line 459
    .line 460
    shr-int/lit8 v5, v5, 0x8

    .line 461
    .line 462
    shl-int/lit8 v9, v9, 0x8

    .line 463
    .line 464
    or-int/2addr v5, v9

    .line 465
    or-int/2addr v5, v8

    .line 466
    int-to-long v8, v5

    .line 467
    const/4 v5, 0x0

    .line 468
    const/4 v13, 0x1

    .line 469
    if-nez v4, :cond_14

    .line 470
    .line 471
    iget-boolean v4, v1, Lfh1;->l:Z

    .line 472
    .line 473
    if-nez v4, :cond_13

    .line 474
    .line 475
    new-instance v4, Lkz2;

    .line 476
    .line 477
    invoke-virtual {v2}, Lkz2;->B()I

    .line 478
    .line 479
    .line 480
    move-result v8

    .line 481
    new-array v8, v8, [B

    .line 482
    .line 483
    invoke-direct {v4, v8}, Lkz2;-><init>([B)V

    .line 484
    .line 485
    .line 486
    invoke-virtual {v2}, Lkz2;->B()I

    .line 487
    .line 488
    .line 489
    move-result v9

    .line 490
    invoke-virtual {v2, v8, v5, v9}, Lkz2;->H([BII)V

    .line 491
    .line 492
    .line 493
    invoke-static {v4}, Lve1;->a(Lkz2;)Lve1;

    .line 494
    .line 495
    .line 496
    move-result-object v2

    .line 497
    iget v4, v2, Lve1;->b:I

    .line 498
    .line 499
    iput v4, v1, Lfh1;->k:I

    .line 500
    .line 501
    new-instance v4, Lgg4;

    .line 502
    .line 503
    invoke-direct {v4}, Lgg4;-><init>()V

    .line 504
    .line 505
    .line 506
    const-string v8, "video/x-flv"

    .line 507
    .line 508
    invoke-virtual {v4, v8}, Lgg4;->d(Ljava/lang/String;)V

    .line 509
    .line 510
    .line 511
    const-string v8, "video/avc"

    .line 512
    .line 513
    invoke-virtual {v4, v8}, Lgg4;->e(Ljava/lang/String;)V

    .line 514
    .line 515
    .line 516
    iget-object v8, v2, Lve1;->l:Ljava/lang/String;

    .line 517
    .line 518
    iput-object v8, v4, Lgg4;->i:Ljava/lang/String;

    .line 519
    .line 520
    iget v8, v2, Lve1;->c:I

    .line 521
    .line 522
    iput v8, v4, Lgg4;->s:I

    .line 523
    .line 524
    iget v8, v2, Lve1;->d:I

    .line 525
    .line 526
    iput v8, v4, Lgg4;->t:I

    .line 527
    .line 528
    iget v8, v2, Lve1;->k:F

    .line 529
    .line 530
    iput v8, v4, Lgg4;->y:F

    .line 531
    .line 532
    iget-object v2, v2, Lve1;->a:Ljava/util/ArrayList;

    .line 533
    .line 534
    iput-object v2, v4, Lgg4;->o:Ljava/util/List;

    .line 535
    .line 536
    new-instance v2, Lph4;

    .line 537
    .line 538
    invoke-direct {v2, v4}, Lph4;-><init>(Lgg4;)V

    .line 539
    .line 540
    .line 541
    invoke-interface {v3, v2}, Ljg1;->d(Lph4;)V

    .line 542
    .line 543
    .line 544
    iput-boolean v13, v1, Lfh1;->l:Z

    .line 545
    .line 546
    :cond_13
    move-wide/from16 v29, v10

    .line 547
    .line 548
    goto/16 :goto_d

    .line 549
    .line 550
    :cond_14
    if-ne v4, v13, :cond_13

    .line 551
    .line 552
    iget-boolean v4, v1, Lfh1;->l:Z

    .line 553
    .line 554
    if-eqz v4, :cond_13

    .line 555
    .line 556
    iget v4, v1, Lfh1;->n:I

    .line 557
    .line 558
    if-ne v4, v13, :cond_15

    .line 559
    .line 560
    move v4, v13

    .line 561
    goto :goto_a

    .line 562
    :cond_15
    move v4, v5

    .line 563
    :goto_a
    iget-boolean v14, v1, Lfh1;->m:Z

    .line 564
    .line 565
    if-nez v14, :cond_16

    .line 566
    .line 567
    if-eqz v4, :cond_13

    .line 568
    .line 569
    move/from16 v25, v13

    .line 570
    .line 571
    goto :goto_b

    .line 572
    :cond_16
    move/from16 v25, v4

    .line 573
    .line 574
    :goto_b
    iget-object v4, v1, Lfh1;->j:Lkz2;

    .line 575
    .line 576
    iget-object v14, v4, Lkz2;->a:[B

    .line 577
    .line 578
    aput-byte v5, v14, v5

    .line 579
    .line 580
    aput-byte v5, v14, v13

    .line 581
    .line 582
    const/4 v15, 0x2

    .line 583
    aput-byte v5, v14, v15

    .line 584
    .line 585
    iget v14, v1, Lfh1;->k:I

    .line 586
    .line 587
    const/4 v15, 0x4

    .line 588
    rsub-int/lit8 v14, v14, 0x4

    .line 589
    .line 590
    move/from16 v26, v5

    .line 591
    .line 592
    :goto_c
    invoke-virtual {v2}, Lkz2;->B()I

    .line 593
    .line 594
    .line 595
    move-result v18

    .line 596
    if-lez v18, :cond_17

    .line 597
    .line 598
    move-wide/from16 v29, v10

    .line 599
    .line 600
    iget-object v10, v4, Lkz2;->a:[B

    .line 601
    .line 602
    iget v11, v1, Lfh1;->k:I

    .line 603
    .line 604
    invoke-virtual {v2, v10, v14, v11}, Lkz2;->H([BII)V

    .line 605
    .line 606
    .line 607
    invoke-virtual {v4, v5}, Lkz2;->E(I)V

    .line 608
    .line 609
    .line 610
    iget-object v10, v1, Lfh1;->i:Lkz2;

    .line 611
    .line 612
    invoke-virtual {v4}, Lkz2;->h()I

    .line 613
    .line 614
    .line 615
    move-result v11

    .line 616
    invoke-virtual {v10, v5}, Lkz2;->E(I)V

    .line 617
    .line 618
    .line 619
    invoke-interface {v3, v10, v15, v5}, Ljg1;->a(Lkz2;II)V

    .line 620
    .line 621
    .line 622
    add-int/lit8 v26, v26, 0x4

    .line 623
    .line 624
    invoke-interface {v3, v2, v11, v5}, Ljg1;->a(Lkz2;II)V

    .line 625
    .line 626
    .line 627
    add-int v26, v26, v11

    .line 628
    .line 629
    move-wide/from16 v10, v29

    .line 630
    .line 631
    goto :goto_c

    .line 632
    :cond_17
    move-wide/from16 v29, v10

    .line 633
    .line 634
    const-wide/16 v2, 0x3e8

    .line 635
    .line 636
    mul-long/2addr v8, v2

    .line 637
    add-long v23, v8, v16

    .line 638
    .line 639
    iget-object v2, v1, Lf74;->g:Ljava/lang/Object;

    .line 640
    .line 641
    move-object/from16 v22, v2

    .line 642
    .line 643
    check-cast v22, Ljg1;

    .line 644
    .line 645
    const/16 v27, 0x0

    .line 646
    .line 647
    const/16 v28, 0x0

    .line 648
    .line 649
    invoke-interface/range {v22 .. v28}, Ljg1;->c(JIIILig1;)V

    .line 650
    .line 651
    .line 652
    iput-boolean v13, v1, Lfh1;->m:Z

    .line 653
    .line 654
    move v5, v13

    .line 655
    :goto_d
    if-eqz v5, :cond_20

    .line 656
    .line 657
    move v5, v7

    .line 658
    goto :goto_e

    .line 659
    :cond_18
    move-wide/from16 v29, v10

    .line 660
    .line 661
    goto/16 :goto_11

    .line 662
    .line 663
    :goto_e
    move v1, v7

    .line 664
    goto/16 :goto_13

    .line 665
    .line 666
    :cond_19
    new-instance v1, Leh1;

    .line 667
    .line 668
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 669
    .line 670
    .line 671
    move-result-object v2

    .line 672
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 673
    .line 674
    .line 675
    move-result v2

    .line 676
    new-instance v4, Ljava/lang/StringBuilder;

    .line 677
    .line 678
    add-int/lit8 v2, v2, 0x1c

    .line 679
    .line 680
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 681
    .line 682
    .line 683
    const-string v2, "Video format not supported: "

    .line 684
    .line 685
    invoke-static {v4, v2, v3}, Lex0;->j(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 686
    .line 687
    .line 688
    move-result-object v2

    .line 689
    invoke-direct {v1, v2}, Leh1;-><init>(Ljava/lang/String;)V

    .line 690
    .line 691
    .line 692
    throw v1

    .line 693
    :cond_1a
    move-wide/from16 v29, v10

    .line 694
    .line 695
    goto/16 :goto_12

    .line 696
    .line 697
    :cond_1b
    move-wide/from16 v29, v10

    .line 698
    .line 699
    const/16 v1, 0x12

    .line 700
    .line 701
    if-ne v3, v1, :cond_21

    .line 702
    .line 703
    iget-boolean v1, v0, Lch1;->n:Z

    .line 704
    .line 705
    if-nez v1, :cond_21

    .line 706
    .line 707
    invoke-virtual/range {p0 .. p1}, Lch1;->a(Lmf1;)Lkz2;

    .line 708
    .line 709
    .line 710
    move-result-object v1

    .line 711
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 712
    .line 713
    .line 714
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 715
    .line 716
    .line 717
    invoke-virtual {v1}, Lkz2;->K()I

    .line 718
    .line 719
    .line 720
    move-result v2

    .line 721
    const/4 v3, 0x2

    .line 722
    if-eq v2, v3, :cond_1c

    .line 723
    .line 724
    goto/16 :goto_10

    .line 725
    .line 726
    :cond_1c
    invoke-static {v1}, Ldh1;->U1(Lkz2;)Ljava/lang/String;

    .line 727
    .line 728
    .line 729
    move-result-object v2

    .line 730
    const-string v3, "onMetaData"

    .line 731
    .line 732
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 733
    .line 734
    .line 735
    move-result v2

    .line 736
    if-eqz v2, :cond_1f

    .line 737
    .line 738
    invoke-virtual {v1}, Lkz2;->B()I

    .line 739
    .line 740
    .line 741
    move-result v2

    .line 742
    if-eqz v2, :cond_1f

    .line 743
    .line 744
    invoke-virtual {v1}, Lkz2;->K()I

    .line 745
    .line 746
    .line 747
    move-result v2

    .line 748
    const/16 v3, 0x8

    .line 749
    .line 750
    if-ne v2, v3, :cond_1f

    .line 751
    .line 752
    invoke-static {v1}, Ldh1;->V1(Lkz2;)Ljava/util/HashMap;

    .line 753
    .line 754
    .line 755
    move-result-object v1

    .line 756
    const-string v2, "duration"

    .line 757
    .line 758
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 759
    .line 760
    .line 761
    move-result-object v2

    .line 762
    instance-of v3, v2, Ljava/lang/Double;

    .line 763
    .line 764
    const-wide v4, 0x412e848000000000L    # 1000000.0

    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    if-eqz v3, :cond_1d

    .line 770
    .line 771
    check-cast v2, Ljava/lang/Double;

    .line 772
    .line 773
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 774
    .line 775
    .line 776
    move-result-wide v2

    .line 777
    const-wide/16 v8, 0x0

    .line 778
    .line 779
    cmpl-double v8, v2, v8

    .line 780
    .line 781
    if-lez v8, :cond_1d

    .line 782
    .line 783
    mul-double/2addr v2, v4

    .line 784
    double-to-long v2, v2

    .line 785
    iput-wide v2, v12, Ldh1;->i:J

    .line 786
    .line 787
    :cond_1d
    const-string v2, "keyframes"

    .line 788
    .line 789
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 790
    .line 791
    .line 792
    move-result-object v1

    .line 793
    instance-of v2, v1, Ljava/util/Map;

    .line 794
    .line 795
    if-eqz v2, :cond_1f

    .line 796
    .line 797
    check-cast v1, Ljava/util/Map;

    .line 798
    .line 799
    const-string v2, "filepositions"

    .line 800
    .line 801
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 802
    .line 803
    .line 804
    move-result-object v2

    .line 805
    const-string v3, "times"

    .line 806
    .line 807
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 808
    .line 809
    .line 810
    move-result-object v1

    .line 811
    instance-of v3, v2, Ljava/util/List;

    .line 812
    .line 813
    if-eqz v3, :cond_1f

    .line 814
    .line 815
    instance-of v3, v1, Ljava/util/List;

    .line 816
    .line 817
    if-eqz v3, :cond_1f

    .line 818
    .line 819
    check-cast v2, Ljava/util/List;

    .line 820
    .line 821
    check-cast v1, Ljava/util/List;

    .line 822
    .line 823
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 824
    .line 825
    .line 826
    move-result v3

    .line 827
    new-array v8, v3, [J

    .line 828
    .line 829
    iput-object v8, v12, Ldh1;->j:[J

    .line 830
    .line 831
    new-array v8, v3, [J

    .line 832
    .line 833
    iput-object v8, v12, Ldh1;->k:[J

    .line 834
    .line 835
    const/4 v8, 0x0

    .line 836
    move v9, v8

    .line 837
    :goto_f
    if-ge v9, v3, :cond_1f

    .line 838
    .line 839
    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 840
    .line 841
    .line 842
    move-result-object v10

    .line 843
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 844
    .line 845
    .line 846
    move-result-object v11

    .line 847
    instance-of v13, v11, Ljava/lang/Double;

    .line 848
    .line 849
    if-eqz v13, :cond_1e

    .line 850
    .line 851
    instance-of v13, v10, Ljava/lang/Double;

    .line 852
    .line 853
    if-eqz v13, :cond_1e

    .line 854
    .line 855
    iget-object v13, v12, Ldh1;->j:[J

    .line 856
    .line 857
    check-cast v11, Ljava/lang/Double;

    .line 858
    .line 859
    invoke-virtual {v11}, Ljava/lang/Double;->doubleValue()D

    .line 860
    .line 861
    .line 862
    move-result-wide v14

    .line 863
    mul-double/2addr v14, v4

    .line 864
    double-to-long v14, v14

    .line 865
    aput-wide v14, v13, v9

    .line 866
    .line 867
    iget-object v11, v12, Ldh1;->k:[J

    .line 868
    .line 869
    check-cast v10, Ljava/lang/Double;

    .line 870
    .line 871
    invoke-virtual {v10}, Ljava/lang/Double;->longValue()J

    .line 872
    .line 873
    .line 874
    move-result-wide v13

    .line 875
    aput-wide v13, v11, v9

    .line 876
    .line 877
    add-int/lit8 v9, v9, 0x1

    .line 878
    .line 879
    goto :goto_f

    .line 880
    :cond_1e
    new-array v1, v8, [J

    .line 881
    .line 882
    iput-object v1, v12, Ldh1;->j:[J

    .line 883
    .line 884
    new-array v1, v8, [J

    .line 885
    .line 886
    iput-object v1, v12, Ldh1;->k:[J

    .line 887
    .line 888
    :cond_1f
    :goto_10
    iget-wide v1, v12, Ldh1;->i:J

    .line 889
    .line 890
    cmp-long v3, v1, v29

    .line 891
    .line 892
    if-eqz v3, :cond_20

    .line 893
    .line 894
    iget-object v3, v0, Lch1;->f:Lnf1;

    .line 895
    .line 896
    new-instance v4, Lwf1;

    .line 897
    .line 898
    iget-object v5, v12, Ldh1;->k:[J

    .line 899
    .line 900
    iget-object v8, v12, Ldh1;->j:[J

    .line 901
    .line 902
    invoke-direct {v4, v1, v2, v5, v8}, Lwf1;-><init>(J[J[J)V

    .line 903
    .line 904
    .line 905
    invoke-interface {v3, v4}, Lnf1;->v(Lcg1;)V

    .line 906
    .line 907
    .line 908
    iput-boolean v7, v0, Lch1;->n:Z

    .line 909
    .line 910
    :cond_20
    :goto_11
    move v5, v6

    .line 911
    goto/16 :goto_e

    .line 912
    .line 913
    :cond_21
    :goto_12
    iget v1, v0, Lch1;->l:I

    .line 914
    .line 915
    move-object/from16 v2, p1

    .line 916
    .line 917
    check-cast v2, Ldf1;

    .line 918
    .line 919
    invoke-virtual {v2, v1, v6}, Ldf1;->c(IZ)Z

    .line 920
    .line 921
    .line 922
    move v1, v6

    .line 923
    move v5, v1

    .line 924
    :goto_13
    iget-boolean v2, v0, Lch1;->h:Z

    .line 925
    .line 926
    if-nez v2, :cond_23

    .line 927
    .line 928
    if-eqz v5, :cond_23

    .line 929
    .line 930
    iput-boolean v7, v0, Lch1;->h:Z

    .line 931
    .line 932
    iget-wide v2, v12, Ldh1;->i:J

    .line 933
    .line 934
    cmp-long v2, v2, v29

    .line 935
    .line 936
    if-nez v2, :cond_22

    .line 937
    .line 938
    iget-wide v2, v0, Lch1;->m:J

    .line 939
    .line 940
    neg-long v8, v2

    .line 941
    goto :goto_14

    .line 942
    :cond_22
    const-wide/16 v8, 0x0

    .line 943
    .line 944
    :goto_14
    iput-wide v8, v0, Lch1;->i:J

    .line 945
    .line 946
    :cond_23
    const/4 v2, 0x4

    .line 947
    iput v2, v0, Lch1;->j:I

    .line 948
    .line 949
    const/4 v2, 0x2

    .line 950
    iput v2, v0, Lch1;->g:I

    .line 951
    .line 952
    if-eqz v1, :cond_0

    .line 953
    .line 954
    return v6

    .line 955
    :cond_24
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 956
    .line 957
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 958
    .line 959
    .line 960
    throw v1

    .line 961
    :cond_25
    iget-object v2, v0, Lch1;->c:Lkz2;

    .line 962
    .line 963
    iget-object v3, v2, Lkz2;->a:[B

    .line 964
    .line 965
    const/16 v4, 0xb

    .line 966
    .line 967
    move-object/from16 v5, p1

    .line 968
    .line 969
    check-cast v5, Ldf1;

    .line 970
    .line 971
    invoke-virtual {v5, v3, v6, v4, v7}, Ldf1;->w([BIIZ)Z

    .line 972
    .line 973
    .line 974
    move-result v3

    .line 975
    if-nez v3, :cond_26

    .line 976
    .line 977
    goto :goto_15

    .line 978
    :cond_26
    invoke-virtual {v2, v6}, Lkz2;->E(I)V

    .line 979
    .line 980
    .line 981
    invoke-virtual {v2}, Lkz2;->K()I

    .line 982
    .line 983
    .line 984
    move-result v3

    .line 985
    iput v3, v0, Lch1;->k:I

    .line 986
    .line 987
    invoke-virtual {v2}, Lkz2;->O()I

    .line 988
    .line 989
    .line 990
    move-result v3

    .line 991
    iput v3, v0, Lch1;->l:I

    .line 992
    .line 993
    invoke-virtual {v2}, Lkz2;->O()I

    .line 994
    .line 995
    .line 996
    move-result v3

    .line 997
    int-to-long v3, v3

    .line 998
    iput-wide v3, v0, Lch1;->m:J

    .line 999
    .line 1000
    invoke-virtual {v2}, Lkz2;->K()I

    .line 1001
    .line 1002
    .line 1003
    move-result v3

    .line 1004
    shl-int/lit8 v3, v3, 0x18

    .line 1005
    .line 1006
    iget-wide v4, v0, Lch1;->m:J

    .line 1007
    .line 1008
    int-to-long v6, v3

    .line 1009
    or-long v3, v6, v4

    .line 1010
    .line 1011
    const-wide/16 v5, 0x3e8

    .line 1012
    .line 1013
    mul-long/2addr v3, v5

    .line 1014
    iput-wide v3, v0, Lch1;->m:J

    .line 1015
    .line 1016
    invoke-virtual {v2, v8}, Lkz2;->G(I)V

    .line 1017
    .line 1018
    .line 1019
    const/4 v1, 0x4

    .line 1020
    iput v1, v0, Lch1;->g:I

    .line 1021
    .line 1022
    goto/16 :goto_0

    .line 1023
    .line 1024
    :cond_27
    iget v1, v0, Lch1;->j:I

    .line 1025
    .line 1026
    move-object/from16 v2, p1

    .line 1027
    .line 1028
    check-cast v2, Ldf1;

    .line 1029
    .line 1030
    invoke-virtual {v2, v1, v6}, Ldf1;->c(IZ)Z

    .line 1031
    .line 1032
    .line 1033
    iput v6, v0, Lch1;->j:I

    .line 1034
    .line 1035
    iput v8, v0, Lch1;->g:I

    .line 1036
    .line 1037
    goto/16 :goto_0

    .line 1038
    .line 1039
    :cond_28
    iget-object v4, v0, Lch1;->b:Lkz2;

    .line 1040
    .line 1041
    iget-object v5, v4, Lkz2;->a:[B

    .line 1042
    .line 1043
    move-object/from16 v8, p1

    .line 1044
    .line 1045
    check-cast v8, Ldf1;

    .line 1046
    .line 1047
    invoke-virtual {v8, v5, v6, v2, v7}, Ldf1;->w([BIIZ)Z

    .line 1048
    .line 1049
    .line 1050
    move-result v5

    .line 1051
    if-nez v5, :cond_29

    .line 1052
    .line 1053
    :goto_15
    const/4 v1, -0x1

    .line 1054
    return v1

    .line 1055
    :cond_29
    invoke-virtual {v4, v6}, Lkz2;->E(I)V

    .line 1056
    .line 1057
    .line 1058
    const/4 v1, 0x4

    .line 1059
    invoke-virtual {v4, v1}, Lkz2;->G(I)V

    .line 1060
    .line 1061
    .line 1062
    invoke-virtual {v4}, Lkz2;->K()I

    .line 1063
    .line 1064
    .line 1065
    move-result v1

    .line 1066
    and-int/lit8 v5, v1, 0x4

    .line 1067
    .line 1068
    and-int/2addr v1, v7

    .line 1069
    if-eqz v5, :cond_2a

    .line 1070
    .line 1071
    iget-object v5, v0, Lch1;->o:Lbh1;

    .line 1072
    .line 1073
    if-nez v5, :cond_2a

    .line 1074
    .line 1075
    new-instance v5, Lbh1;

    .line 1076
    .line 1077
    iget-object v6, v0, Lch1;->f:Lnf1;

    .line 1078
    .line 1079
    invoke-interface {v6, v3, v7}, Lnf1;->z(II)Ljg1;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v3

    .line 1083
    const/4 v6, 0x5

    .line 1084
    invoke-direct {v5, v6, v3}, Lf74;-><init>(ILjava/lang/Object;)V

    .line 1085
    .line 1086
    .line 1087
    iput-object v5, v0, Lch1;->o:Lbh1;

    .line 1088
    .line 1089
    :cond_2a
    if-eqz v1, :cond_2b

    .line 1090
    .line 1091
    iget-object v1, v0, Lch1;->p:Lfh1;

    .line 1092
    .line 1093
    if-nez v1, :cond_2b

    .line 1094
    .line 1095
    new-instance v1, Lfh1;

    .line 1096
    .line 1097
    iget-object v3, v0, Lch1;->f:Lnf1;

    .line 1098
    .line 1099
    const/4 v5, 0x2

    .line 1100
    invoke-interface {v3, v2, v5}, Lnf1;->z(II)Ljg1;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v2

    .line 1104
    invoke-direct {v1, v2}, Lfh1;-><init>(Ljg1;)V

    .line 1105
    .line 1106
    .line 1107
    iput-object v1, v0, Lch1;->p:Lfh1;

    .line 1108
    .line 1109
    :cond_2b
    iget-object v1, v0, Lch1;->f:Lnf1;

    .line 1110
    .line 1111
    invoke-interface {v1}, Lnf1;->s()V

    .line 1112
    .line 1113
    .line 1114
    invoke-virtual {v4}, Lkz2;->b()I

    .line 1115
    .line 1116
    .line 1117
    move-result v1

    .line 1118
    add-int/lit8 v1, v1, -0x5

    .line 1119
    .line 1120
    iput v1, v0, Lch1;->j:I

    .line 1121
    .line 1122
    const/4 v2, 0x2

    .line 1123
    iput v2, v0, Lch1;->g:I

    .line 1124
    .line 1125
    goto/16 :goto_0
.end method

.method public final e(JJ)V
    .locals 0

    .line 1
    const-wide/16 p3, 0x0

    .line 2
    .line 3
    cmp-long p1, p1, p3

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    iput p1, p0, Lch1;->g:I

    .line 10
    .line 11
    iput-boolean p2, p0, Lch1;->h:Z

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x3

    .line 15
    iput p1, p0, Lch1;->g:I

    .line 16
    .line 17
    :goto_0
    iput p2, p0, Lch1;->j:I

    .line 18
    .line 19
    return-void
.end method

.method public final f(Lnf1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lch1;->f:Lnf1;

    .line 2
    .line 3
    return-void
.end method
