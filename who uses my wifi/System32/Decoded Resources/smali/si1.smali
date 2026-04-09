.class public final Lsi1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Llf1;


# instance fields
.field public final a:Lkz2;

.field public final b:Lxf1;

.field public final c:Luf1;

.field public final d:Lf20;

.field public e:Lnf1;

.field public f:Ljg1;

.field public g:Ljg1;

.field public h:I

.field public i:Lwn1;

.field public j:J

.field public k:J

.field public l:J

.field public m:J

.field public n:I

.field public o:Lui1;

.field public p:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget v0, Luk2;->o:I

    .line 2
    .line 3
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lkz2;

    .line 5
    .line 6
    const/16 v1, 0xa

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lkz2;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lsi1;->a:Lkz2;

    .line 12
    .line 13
    new-instance v0, Lxf1;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lsi1;->b:Lxf1;

    .line 19
    .line 20
    new-instance v0, Luf1;

    .line 21
    .line 22
    invoke-direct {v0}, Luf1;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lsi1;->c:Luf1;

    .line 26
    .line 27
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    iput-wide v0, p0, Lsi1;->j:J

    .line 33
    .line 34
    new-instance v0, Lf20;

    .line 35
    .line 36
    const/16 v1, 0xb

    .line 37
    .line 38
    invoke-direct {v0, v1}, Lf20;-><init>(I)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Lsi1;->d:Lf20;

    .line 42
    .line 43
    new-instance v0, Lgf1;

    .line 44
    .line 45
    invoke-direct {v0}, Lgf1;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, Lsi1;->g:Ljg1;

    .line 49
    .line 50
    const-wide/16 v0, -0x1

    .line 51
    .line 52
    iput-wide v0, p0, Lsi1;->m:J

    .line 53
    .line 54
    return-void
.end method


# virtual methods
.method public final a(Lmf1;Z)Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    invoke-interface {v1}, Lmf1;->i()V

    .line 8
    .line 9
    .line 10
    invoke-interface {v1}, Lmf1;->o()J

    .line 11
    .line 12
    .line 13
    move-result-wide v3

    .line 14
    const/4 v5, 0x1

    .line 15
    if-eq v5, v2, :cond_0

    .line 16
    .line 17
    const/high16 v6, 0x20000

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const v6, 0x8000

    .line 21
    .line 22
    .line 23
    :goto_0
    const-wide/16 v7, 0x0

    .line 24
    .line 25
    cmp-long v3, v3, v7

    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    if-nez v3, :cond_3

    .line 29
    .line 30
    iget-object v3, v0, Lsi1;->d:Lf20;

    .line 31
    .line 32
    const/4 v7, 0x0

    .line 33
    invoke-virtual {v3, v1, v7, v6}, Lf20;->k(Lmf1;Lus0;I)Lwn1;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    iput-object v3, v0, Lsi1;->i:Lwn1;

    .line 38
    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    iget-object v7, v0, Lsi1;->c:Luf1;

    .line 42
    .line 43
    invoke-virtual {v7, v3}, Luf1;->a(Lwn1;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    invoke-interface {v1}, Lmf1;->n()J

    .line 47
    .line 48
    .line 49
    move-result-wide v7

    .line 50
    long-to-int v3, v7

    .line 51
    if-nez v2, :cond_2

    .line 52
    .line 53
    invoke-interface {v1, v3}, Lmf1;->t(I)V

    .line 54
    .line 55
    .line 56
    :cond_2
    move v7, v4

    .line 57
    :goto_1
    move v8, v7

    .line 58
    move v9, v8

    .line 59
    goto :goto_2

    .line 60
    :cond_3
    move v3, v4

    .line 61
    move v7, v3

    .line 62
    goto :goto_1

    .line 63
    :goto_2
    invoke-virtual/range {p0 .. p1}, Lsi1;->g(Lmf1;)Z

    .line 64
    .line 65
    .line 66
    move-result v10

    .line 67
    if-eqz v10, :cond_5

    .line 68
    .line 69
    if-lez v8, :cond_4

    .line 70
    .line 71
    goto :goto_4

    .line 72
    :cond_4
    invoke-virtual {v0}, Lsi1;->h()V

    .line 73
    .line 74
    .line 75
    new-instance v1, Ljava/io/EOFException;

    .line 76
    .line 77
    invoke-direct {v1}, Ljava/io/EOFException;-><init>()V

    .line 78
    .line 79
    .line 80
    throw v1

    .line 81
    :cond_5
    iget-object v10, v0, Lsi1;->a:Lkz2;

    .line 82
    .line 83
    invoke-virtual {v10, v4}, Lkz2;->E(I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v10}, Lkz2;->b()I

    .line 87
    .line 88
    .line 89
    move-result v10

    .line 90
    if-eqz v7, :cond_6

    .line 91
    .line 92
    int-to-long v11, v7

    .line 93
    const v13, -0x1f400

    .line 94
    .line 95
    .line 96
    and-int/2addr v13, v10

    .line 97
    int-to-long v13, v13

    .line 98
    const-wide/32 v15, -0x1f400

    .line 99
    .line 100
    .line 101
    and-long/2addr v11, v15

    .line 102
    cmp-long v11, v13, v11

    .line 103
    .line 104
    if-nez v11, :cond_7

    .line 105
    .line 106
    :cond_6
    invoke-static {v10}, Li41;->G(I)I

    .line 107
    .line 108
    .line 109
    move-result v11

    .line 110
    const/4 v12, -0x1

    .line 111
    if-ne v11, v12, :cond_b

    .line 112
    .line 113
    :cond_7
    add-int/lit8 v7, v9, 0x1

    .line 114
    .line 115
    if-ne v9, v6, :cond_9

    .line 116
    .line 117
    if-eqz v2, :cond_8

    .line 118
    .line 119
    return v4

    .line 120
    :cond_8
    invoke-virtual {v0}, Lsi1;->h()V

    .line 121
    .line 122
    .line 123
    new-instance v1, Ljava/io/EOFException;

    .line 124
    .line 125
    invoke-direct {v1}, Ljava/io/EOFException;-><init>()V

    .line 126
    .line 127
    .line 128
    throw v1

    .line 129
    :cond_9
    if-eqz v2, :cond_a

    .line 130
    .line 131
    invoke-interface {v1}, Lmf1;->i()V

    .line 132
    .line 133
    .line 134
    add-int v8, v3, v7

    .line 135
    .line 136
    invoke-interface {v1, v8}, Lmf1;->A(I)V

    .line 137
    .line 138
    .line 139
    :goto_3
    move v8, v4

    .line 140
    move v9, v7

    .line 141
    move v7, v8

    .line 142
    goto :goto_2

    .line 143
    :cond_a
    invoke-interface {v1, v5}, Lmf1;->t(I)V

    .line 144
    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_b
    add-int/lit8 v8, v8, 0x1

    .line 148
    .line 149
    if-ne v8, v5, :cond_c

    .line 150
    .line 151
    iget-object v7, v0, Lsi1;->b:Lxf1;

    .line 152
    .line 153
    invoke-virtual {v7, v10}, Lxf1;->a(I)Z

    .line 154
    .line 155
    .line 156
    move v7, v10

    .line 157
    goto :goto_6

    .line 158
    :cond_c
    const/4 v10, 0x4

    .line 159
    if-ne v8, v10, :cond_e

    .line 160
    .line 161
    :goto_4
    if-eqz v2, :cond_d

    .line 162
    .line 163
    add-int/2addr v3, v9

    .line 164
    invoke-interface {v1, v3}, Lmf1;->t(I)V

    .line 165
    .line 166
    .line 167
    goto :goto_5

    .line 168
    :cond_d
    invoke-interface {v1}, Lmf1;->i()V

    .line 169
    .line 170
    .line 171
    :goto_5
    iput v7, v0, Lsi1;->h:I

    .line 172
    .line 173
    return v5

    .line 174
    :cond_e
    :goto_6
    add-int/lit8 v11, v11, -0x4

    .line 175
    .line 176
    invoke-interface {v1, v11}, Lmf1;->A(I)V

    .line 177
    .line 178
    .line 179
    goto :goto_2
.end method

.method public final b(Lmf1;)Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, Lsi1;->a(Lmf1;Z)Z

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    return p1
.end method

.method public final c(Lmf1;Lpf1;)I
    .locals 46

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lsi1;->f:Ljg1;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object v2, Lv23;->a:Ljava/lang/String;

    .line 11
    .line 12
    iget v2, v0, Lsi1;->h:I

    .line 13
    .line 14
    const/4 v3, -0x1

    .line 15
    const/4 v4, 0x0

    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    :try_start_0
    invoke-virtual {v0, v1, v4}, Lsi1;->a(Lmf1;Z)Z
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catch_0
    return v3

    .line 23
    :cond_0
    :goto_0
    iget-object v2, v0, Lsi1;->o:Lui1;

    .line 24
    .line 25
    iget-object v5, v0, Lsi1;->a:Lkz2;

    .line 26
    .line 27
    iget-object v6, v0, Lsi1;->b:Lxf1;

    .line 28
    .line 29
    const/4 v11, 0x1

    .line 30
    if-nez v2, :cond_34

    .line 31
    .line 32
    new-instance v2, Lkz2;

    .line 33
    .line 34
    iget v12, v6, Lxf1;->b:I

    .line 35
    .line 36
    invoke-direct {v2, v12}, Lkz2;-><init>(I)V

    .line 37
    .line 38
    .line 39
    iget-object v12, v2, Lkz2;->a:[B

    .line 40
    .line 41
    iget v13, v6, Lxf1;->b:I

    .line 42
    .line 43
    move-object v14, v1

    .line 44
    check-cast v14, Ldf1;

    .line 45
    .line 46
    invoke-virtual {v14, v12, v4, v13, v4}, Ldf1;->B([BIIZ)Z

    .line 47
    .line 48
    .line 49
    iget v12, v6, Lxf1;->a:I

    .line 50
    .line 51
    and-int/2addr v12, v11

    .line 52
    const/16 v13, 0x24

    .line 53
    .line 54
    const/16 v14, 0x15

    .line 55
    .line 56
    if-eqz v12, :cond_2

    .line 57
    .line 58
    iget v12, v6, Lxf1;->d:I

    .line 59
    .line 60
    if-eq v12, v11, :cond_1

    .line 61
    .line 62
    move v12, v13

    .line 63
    goto :goto_2

    .line 64
    :cond_1
    :goto_1
    move v12, v14

    .line 65
    goto :goto_2

    .line 66
    :cond_2
    iget v12, v6, Lxf1;->d:I

    .line 67
    .line 68
    if-eq v12, v11, :cond_3

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    const/16 v12, 0xd

    .line 72
    .line 73
    :goto_2
    iget v15, v2, Lkz2;->c:I

    .line 74
    .line 75
    const-wide/16 v16, 0x0

    .line 76
    .line 77
    add-int/lit8 v7, v12, 0x4

    .line 78
    .line 79
    const v8, 0x56425249

    .line 80
    .line 81
    .line 82
    const-wide v18, -0x7fffffffffffffffL    # -4.9E-324

    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    const v9, 0x496e666f

    .line 88
    .line 89
    .line 90
    const v10, 0x58696e67

    .line 91
    .line 92
    .line 93
    if-lt v15, v7, :cond_4

    .line 94
    .line 95
    invoke-virtual {v2, v12}, Lkz2;->E(I)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2}, Lkz2;->b()I

    .line 99
    .line 100
    .line 101
    move-result v7

    .line 102
    if-eq v7, v10, :cond_6

    .line 103
    .line 104
    if-ne v7, v9, :cond_4

    .line 105
    .line 106
    move v7, v9

    .line 107
    goto :goto_3

    .line 108
    :cond_4
    iget v7, v2, Lkz2;->c:I

    .line 109
    .line 110
    const/16 v12, 0x28

    .line 111
    .line 112
    if-lt v7, v12, :cond_5

    .line 113
    .line 114
    invoke-virtual {v2, v13}, Lkz2;->E(I)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2}, Lkz2;->b()I

    .line 118
    .line 119
    .line 120
    move-result v7

    .line 121
    if-ne v7, v8, :cond_5

    .line 122
    .line 123
    move v7, v8

    .line 124
    goto :goto_3

    .line 125
    :cond_5
    move v7, v4

    .line 126
    :cond_6
    :goto_3
    iget-object v12, v0, Lsi1;->c:Luf1;

    .line 127
    .line 128
    const-wide/16 v20, -0x1

    .line 129
    .line 130
    if-eq v7, v9, :cond_7

    .line 131
    .line 132
    if-eq v7, v8, :cond_8

    .line 133
    .line 134
    if-eq v7, v10, :cond_7

    .line 135
    .line 136
    move-object v2, v1

    .line 137
    check-cast v2, Ldf1;

    .line 138
    .line 139
    iput v4, v2, Ldf1;->k:I

    .line 140
    .line 141
    const/16 v26, 0x0

    .line 142
    .line 143
    goto/16 :goto_19

    .line 144
    .line 145
    :cond_7
    move-object/from16 v22, v12

    .line 146
    .line 147
    goto/16 :goto_8

    .line 148
    .line 149
    :cond_8
    move-object v7, v1

    .line 150
    check-cast v7, Ldf1;

    .line 151
    .line 152
    iget-wide v8, v7, Ldf1;->h:J

    .line 153
    .line 154
    iget-wide v3, v7, Ldf1;->i:J

    .line 155
    .line 156
    const/4 v10, 0x6

    .line 157
    invoke-virtual {v2, v10}, Lkz2;->G(I)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2}, Lkz2;->b()I

    .line 161
    .line 162
    .line 163
    move-result v10

    .line 164
    iget v14, v6, Lxf1;->b:I

    .line 165
    .line 166
    int-to-long v13, v14

    .line 167
    move-object/from16 v22, v12

    .line 168
    .line 169
    int-to-long v11, v10

    .line 170
    invoke-virtual {v2}, Lkz2;->b()I

    .line 171
    .line 172
    .line 173
    move-result v10

    .line 174
    if-gtz v10, :cond_9

    .line 175
    .line 176
    goto :goto_5

    .line 177
    :cond_9
    iget v15, v6, Lxf1;->c:I

    .line 178
    .line 179
    move-wide/from16 v24, v3

    .line 180
    .line 181
    iget v3, v6, Lxf1;->f:I

    .line 182
    .line 183
    int-to-long v3, v3

    .line 184
    move-wide/from16 v26, v3

    .line 185
    .line 186
    int-to-long v3, v10

    .line 187
    mul-long v3, v3, v26

    .line 188
    .line 189
    add-long v3, v3, v20

    .line 190
    .line 191
    invoke-static {v15, v3, v4}, Lv23;->s(IJ)J

    .line 192
    .line 193
    .line 194
    move-result-wide v29

    .line 195
    invoke-virtual {v2}, Lkz2;->L()I

    .line 196
    .line 197
    .line 198
    move-result v3

    .line 199
    invoke-virtual {v2}, Lkz2;->L()I

    .line 200
    .line 201
    .line 202
    move-result v4

    .line 203
    invoke-virtual {v2}, Lkz2;->L()I

    .line 204
    .line 205
    .line 206
    move-result v10

    .line 207
    const/4 v15, 0x2

    .line 208
    invoke-virtual {v2, v15}, Lkz2;->G(I)V

    .line 209
    .line 210
    .line 211
    iget v15, v6, Lxf1;->b:I

    .line 212
    .line 213
    move-wide/from16 v27, v11

    .line 214
    .line 215
    int-to-long v11, v15

    .line 216
    add-long v11, v24, v11

    .line 217
    .line 218
    new-array v15, v3, [J

    .line 219
    .line 220
    move-wide/from16 v31, v11

    .line 221
    .line 222
    new-array v11, v3, [J

    .line 223
    .line 224
    move-object/from16 v33, v11

    .line 225
    .line 226
    move-wide/from16 v11, v31

    .line 227
    .line 228
    move-wide/from16 v31, v13

    .line 229
    .line 230
    const/4 v13, 0x0

    .line 231
    :goto_4
    if-ge v13, v3, :cond_e

    .line 232
    .line 233
    move-object/from16 v34, v15

    .line 234
    .line 235
    int-to-long v14, v13

    .line 236
    mul-long v14, v14, v29

    .line 237
    .line 238
    move/from16 v35, v13

    .line 239
    .line 240
    move-wide/from16 v36, v14

    .line 241
    .line 242
    int-to-long v13, v3

    .line 243
    div-long v14, v36, v13

    .line 244
    .line 245
    aput-wide v14, v34, v35

    .line 246
    .line 247
    aput-wide v11, v33, v35

    .line 248
    .line 249
    const/4 v13, 0x1

    .line 250
    if-eq v10, v13, :cond_d

    .line 251
    .line 252
    const/4 v13, 0x2

    .line 253
    if-eq v10, v13, :cond_c

    .line 254
    .line 255
    const/4 v14, 0x3

    .line 256
    if-eq v10, v14, :cond_b

    .line 257
    .line 258
    const/4 v14, 0x4

    .line 259
    if-eq v10, v14, :cond_a

    .line 260
    .line 261
    :goto_5
    const/16 v26, 0x0

    .line 262
    .line 263
    goto/16 :goto_7

    .line 264
    .line 265
    :cond_a
    invoke-virtual {v2}, Lkz2;->h()I

    .line 266
    .line 267
    .line 268
    move-result v14

    .line 269
    goto :goto_6

    .line 270
    :cond_b
    invoke-virtual {v2}, Lkz2;->O()I

    .line 271
    .line 272
    .line 273
    move-result v14

    .line 274
    goto :goto_6

    .line 275
    :cond_c
    invoke-virtual {v2}, Lkz2;->L()I

    .line 276
    .line 277
    .line 278
    move-result v14

    .line 279
    goto :goto_6

    .line 280
    :cond_d
    const/4 v13, 0x2

    .line 281
    invoke-virtual {v2}, Lkz2;->K()I

    .line 282
    .line 283
    .line 284
    move-result v14

    .line 285
    :goto_6
    int-to-long v0, v4

    .line 286
    int-to-long v14, v14

    .line 287
    mul-long/2addr v14, v0

    .line 288
    add-long/2addr v11, v14

    .line 289
    add-int/lit8 v0, v35, 0x1

    .line 290
    .line 291
    move-object/from16 v1, p1

    .line 292
    .line 293
    move v13, v0

    .line 294
    move-object/from16 v15, v34

    .line 295
    .line 296
    move-object/from16 v0, p0

    .line 297
    .line 298
    goto :goto_4

    .line 299
    :cond_e
    move-object/from16 v34, v15

    .line 300
    .line 301
    add-long v3, v24, v31

    .line 302
    .line 303
    add-long v3, v3, v27

    .line 304
    .line 305
    cmp-long v0, v8, v20

    .line 306
    .line 307
    const-string v1, ", "

    .line 308
    .line 309
    if-eqz v0, :cond_f

    .line 310
    .line 311
    cmp-long v0, v8, v3

    .line 312
    .line 313
    if-eqz v0, :cond_f

    .line 314
    .line 315
    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 320
    .line 321
    .line 322
    move-result v0

    .line 323
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v2

    .line 327
    add-int/lit8 v0, v0, 0x1b

    .line 328
    .line 329
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 330
    .line 331
    .line 332
    move-result v2

    .line 333
    new-instance v10, Ljava/lang/StringBuilder;

    .line 334
    .line 335
    add-int/2addr v0, v2

    .line 336
    invoke-direct {v10, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 337
    .line 338
    .line 339
    const-string v0, "VBRI data size mismatch: "

    .line 340
    .line 341
    invoke-static {v10, v0, v8, v9, v1}, Lex0;->p(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v10, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    invoke-static {v0}, La30;->x(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    :cond_f
    cmp-long v0, v3, v11

    .line 355
    .line 356
    if-eqz v0, :cond_10

    .line 357
    .line 358
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 363
    .line 364
    .line 365
    move-result v0

    .line 366
    invoke-static {v11, v12}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v2

    .line 370
    add-int/lit8 v0, v0, 0x2b

    .line 371
    .line 372
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 373
    .line 374
    .line 375
    move-result v2

    .line 376
    add-int/2addr v2, v0

    .line 377
    new-instance v0, Ljava/lang/StringBuilder;

    .line 378
    .line 379
    add-int/lit8 v2, v2, 0x1c

    .line 380
    .line 381
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 382
    .line 383
    .line 384
    const-string v2, "VBRI bytes and ToC mismatch (using max): "

    .line 385
    .line 386
    invoke-static {v0, v2, v3, v4, v1}, Lex0;->p(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 387
    .line 388
    .line 389
    invoke-virtual {v0, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 390
    .line 391
    .line 392
    const-string v1, "\nSeeking will be inaccurate."

    .line 393
    .line 394
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    invoke-static {v0}, La30;->x(Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    invoke-static {v3, v4, v11, v12}, Ljava/lang/Math;->max(JJ)J

    .line 405
    .line 406
    .line 407
    move-result-wide v3

    .line 408
    :cond_10
    move-wide/from16 v31, v3

    .line 409
    .line 410
    new-instance v26, Lvi1;

    .line 411
    .line 412
    iget v0, v6, Lxf1;->e:I

    .line 413
    .line 414
    move-object/from16 v28, v33

    .line 415
    .line 416
    move-object/from16 v27, v34

    .line 417
    .line 418
    move/from16 v33, v0

    .line 419
    .line 420
    invoke-direct/range {v26 .. v33}, Lvi1;-><init>([J[JJJI)V

    .line 421
    .line 422
    .line 423
    :goto_7
    iget v0, v6, Lxf1;->b:I

    .line 424
    .line 425
    const/4 v1, 0x0

    .line 426
    invoke-virtual {v7, v0, v1}, Ldf1;->c(IZ)Z

    .line 427
    .line 428
    .line 429
    move-object/from16 v0, p0

    .line 430
    .line 431
    move-object/from16 v12, v22

    .line 432
    .line 433
    goto/16 :goto_19

    .line 434
    .line 435
    :goto_8
    invoke-virtual {v2}, Lkz2;->b()I

    .line 436
    .line 437
    .line 438
    move-result v0

    .line 439
    and-int/lit8 v1, v0, 0x1

    .line 440
    .line 441
    if-eqz v1, :cond_11

    .line 442
    .line 443
    invoke-virtual {v2}, Lkz2;->h()I

    .line 444
    .line 445
    .line 446
    move-result v1

    .line 447
    goto :goto_9

    .line 448
    :cond_11
    const/4 v1, -0x1

    .line 449
    :goto_9
    and-int/lit8 v3, v0, 0x2

    .line 450
    .line 451
    if-eqz v3, :cond_12

    .line 452
    .line 453
    invoke-virtual {v2}, Lkz2;->P()J

    .line 454
    .line 455
    .line 456
    move-result-wide v3

    .line 457
    move-wide/from16 v31, v3

    .line 458
    .line 459
    goto :goto_a

    .line 460
    :cond_12
    move-wide/from16 v31, v20

    .line 461
    .line 462
    :goto_a
    and-int/lit8 v3, v0, 0x4

    .line 463
    .line 464
    const/4 v4, 0x4

    .line 465
    if-ne v3, v4, :cond_14

    .line 466
    .line 467
    const/16 v3, 0x64

    .line 468
    .line 469
    new-array v4, v3, [J

    .line 470
    .line 471
    const/4 v8, 0x0

    .line 472
    :goto_b
    if-ge v8, v3, :cond_13

    .line 473
    .line 474
    invoke-virtual {v2}, Lkz2;->K()I

    .line 475
    .line 476
    .line 477
    move-result v9

    .line 478
    int-to-long v11, v9

    .line 479
    aput-wide v11, v4, v8

    .line 480
    .line 481
    add-int/lit8 v8, v8, 0x1

    .line 482
    .line 483
    goto :goto_b

    .line 484
    :cond_13
    move-object/from16 v33, v4

    .line 485
    .line 486
    goto :goto_c

    .line 487
    :cond_14
    const/16 v33, 0x0

    .line 488
    .line 489
    :goto_c
    and-int/lit8 v0, v0, 0x8

    .line 490
    .line 491
    if-eqz v0, :cond_15

    .line 492
    .line 493
    const/4 v4, 0x4

    .line 494
    invoke-virtual {v2, v4}, Lkz2;->G(I)V

    .line 495
    .line 496
    .line 497
    :cond_15
    invoke-virtual {v2}, Lkz2;->B()I

    .line 498
    .line 499
    .line 500
    move-result v0

    .line 501
    const/16 v3, 0x18

    .line 502
    .line 503
    if-lt v0, v3, :cond_16

    .line 504
    .line 505
    invoke-virtual {v2, v14}, Lkz2;->G(I)V

    .line 506
    .line 507
    .line 508
    invoke-virtual {v2}, Lkz2;->O()I

    .line 509
    .line 510
    .line 511
    move-result v0

    .line 512
    shr-int/lit8 v2, v0, 0xc

    .line 513
    .line 514
    and-int/lit16 v0, v0, 0xfff

    .line 515
    .line 516
    goto :goto_d

    .line 517
    :cond_16
    const/4 v0, -0x1

    .line 518
    const/4 v2, -0x1

    .line 519
    :goto_d
    int-to-long v3, v1

    .line 520
    iget v1, v6, Lxf1;->b:I

    .line 521
    .line 522
    iget v8, v6, Lxf1;->c:I

    .line 523
    .line 524
    iget v9, v6, Lxf1;->e:I

    .line 525
    .line 526
    iget v11, v6, Lxf1;->f:I

    .line 527
    .line 528
    move-object/from16 v12, v22

    .line 529
    .line 530
    iget v13, v12, Luf1;->a:I

    .line 531
    .line 532
    const/4 v14, -0x1

    .line 533
    if-eq v13, v14, :cond_17

    .line 534
    .line 535
    iget v13, v12, Luf1;->b:I

    .line 536
    .line 537
    if-eq v13, v14, :cond_17

    .line 538
    .line 539
    goto :goto_e

    .line 540
    :cond_17
    if-eq v2, v14, :cond_18

    .line 541
    .line 542
    if-eq v0, v14, :cond_18

    .line 543
    .line 544
    iput v2, v12, Luf1;->a:I

    .line 545
    .line 546
    iput v0, v12, Luf1;->b:I

    .line 547
    .line 548
    :cond_18
    :goto_e
    move-object/from16 v0, p1

    .line 549
    .line 550
    check-cast v0, Ldf1;

    .line 551
    .line 552
    iget-wide v13, v0, Ldf1;->h:J

    .line 553
    .line 554
    move v15, v11

    .line 555
    iget-wide v10, v0, Ldf1;->i:J

    .line 556
    .line 557
    cmp-long v22, v13, v20

    .line 558
    .line 559
    if-eqz v22, :cond_1a

    .line 560
    .line 561
    cmp-long v22, v31, v20

    .line 562
    .line 563
    if-eqz v22, :cond_1a

    .line 564
    .line 565
    move-wide/from16 v24, v3

    .line 566
    .line 567
    add-long v2, v10, v31

    .line 568
    .line 569
    cmp-long v22, v13, v2

    .line 570
    .line 571
    if-eqz v22, :cond_19

    .line 572
    .line 573
    invoke-static {v13, v14}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 574
    .line 575
    .line 576
    move-result-object v22

    .line 577
    invoke-virtual/range {v22 .. v22}, Ljava/lang/String;->length()I

    .line 578
    .line 579
    .line 580
    move-result v22

    .line 581
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 582
    .line 583
    .line 584
    move-result-object v26

    .line 585
    add-int/lit8 v22, v22, 0x35

    .line 586
    .line 587
    invoke-virtual/range {v26 .. v26}, Ljava/lang/String;->length()I

    .line 588
    .line 589
    .line 590
    move-result v26

    .line 591
    add-int v26, v26, v22

    .line 592
    .line 593
    new-instance v4, Ljava/lang/StringBuilder;

    .line 594
    .line 595
    move/from16 v27, v1

    .line 596
    .line 597
    add-int/lit8 v1, v26, 0x14

    .line 598
    .line 599
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 600
    .line 601
    .line 602
    const-string v1, "Data size mismatch between stream ("

    .line 603
    .line 604
    move/from16 v30, v9

    .line 605
    .line 606
    const-string v9, ") and Xing frame ("

    .line 607
    .line 608
    invoke-static {v4, v1, v13, v14, v9}, Lex0;->p(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 609
    .line 610
    .line 611
    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 612
    .line 613
    .line 614
    const-string v1, "), using Xing value."

    .line 615
    .line 616
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 617
    .line 618
    .line 619
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 620
    .line 621
    .line 622
    move-result-object v1

    .line 623
    invoke-static {v1}, La30;->u(Ljava/lang/String;)V

    .line 624
    .line 625
    .line 626
    goto :goto_10

    .line 627
    :cond_19
    move/from16 v27, v1

    .line 628
    .line 629
    :goto_f
    move/from16 v30, v9

    .line 630
    .line 631
    goto :goto_10

    .line 632
    :cond_1a
    move/from16 v27, v1

    .line 633
    .line 634
    move-wide/from16 v24, v3

    .line 635
    .line 636
    goto :goto_f

    .line 637
    :goto_10
    iget v1, v6, Lxf1;->b:I

    .line 638
    .line 639
    const/4 v2, 0x0

    .line 640
    invoke-virtual {v0, v1, v2}, Ldf1;->c(IZ)Z

    .line 641
    .line 642
    .line 643
    const v2, 0x58696e67

    .line 644
    .line 645
    .line 646
    if-ne v7, v2, :cond_1e

    .line 647
    .line 648
    cmp-long v0, v24, v20

    .line 649
    .line 650
    if-eqz v0, :cond_1c

    .line 651
    .line 652
    cmp-long v0, v24, v16

    .line 653
    .line 654
    if-nez v0, :cond_1b

    .line 655
    .line 656
    goto :goto_11

    .line 657
    :cond_1b
    int-to-long v0, v15

    .line 658
    mul-long v3, v24, v0

    .line 659
    .line 660
    add-long v3, v3, v20

    .line 661
    .line 662
    invoke-static {v8, v3, v4}, Lv23;->s(IJ)J

    .line 663
    .line 664
    .line 665
    move-result-wide v0

    .line 666
    move-wide/from16 v28, v0

    .line 667
    .line 668
    goto :goto_12

    .line 669
    :cond_1c
    :goto_11
    move-wide/from16 v28, v18

    .line 670
    .line 671
    :goto_12
    cmp-long v0, v28, v18

    .line 672
    .line 673
    if-nez v0, :cond_1d

    .line 674
    .line 675
    goto :goto_16

    .line 676
    :cond_1d
    new-instance v24, Lwi1;

    .line 677
    .line 678
    move-wide/from16 v25, v10

    .line 679
    .line 680
    invoke-direct/range {v24 .. v33}, Lwi1;-><init>(JIJIJ[J)V

    .line 681
    .line 682
    .line 683
    move-object/from16 v26, v24

    .line 684
    .line 685
    :goto_13
    move-object/from16 v0, p0

    .line 686
    .line 687
    goto :goto_19

    .line 688
    :cond_1e
    move-wide v1, v10

    .line 689
    move/from16 v0, v27

    .line 690
    .line 691
    cmp-long v3, v24, v20

    .line 692
    .line 693
    if-eqz v3, :cond_20

    .line 694
    .line 695
    cmp-long v3, v24, v16

    .line 696
    .line 697
    if-nez v3, :cond_1f

    .line 698
    .line 699
    goto :goto_14

    .line 700
    :cond_1f
    int-to-long v3, v15

    .line 701
    mul-long v3, v3, v24

    .line 702
    .line 703
    add-long v3, v3, v20

    .line 704
    .line 705
    invoke-static {v8, v3, v4}, Lv23;->s(IJ)J

    .line 706
    .line 707
    .line 708
    move-result-wide v3

    .line 709
    move-wide/from16 v37, v3

    .line 710
    .line 711
    goto :goto_15

    .line 712
    :cond_20
    :goto_14
    move-wide/from16 v37, v18

    .line 713
    .line 714
    :goto_15
    cmp-long v3, v37, v18

    .line 715
    .line 716
    if-nez v3, :cond_22

    .line 717
    .line 718
    :cond_21
    :goto_16
    const/16 v26, 0x0

    .line 719
    .line 720
    goto :goto_13

    .line 721
    :cond_22
    cmp-long v3, v31, v20

    .line 722
    .line 723
    if-eqz v3, :cond_23

    .line 724
    .line 725
    add-long v13, v1, v31

    .line 726
    .line 727
    int-to-long v3, v0

    .line 728
    sub-long v31, v31, v3

    .line 729
    .line 730
    :goto_17
    move-wide/from16 v42, v13

    .line 731
    .line 732
    move-wide/from16 v33, v31

    .line 733
    .line 734
    goto :goto_18

    .line 735
    :cond_23
    cmp-long v3, v13, v20

    .line 736
    .line 737
    if-eqz v3, :cond_21

    .line 738
    .line 739
    sub-long v3, v13, v1

    .line 740
    .line 741
    int-to-long v7, v0

    .line 742
    sub-long v31, v3, v7

    .line 743
    .line 744
    goto :goto_17

    .line 745
    :goto_18
    sget-object v39, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    .line 746
    .line 747
    const-wide/32 v35, 0x7a1200

    .line 748
    .line 749
    .line 750
    invoke-static/range {v33 .. v39}, Lv23;->t(JJJLjava/math/RoundingMode;)J

    .line 751
    .line 752
    .line 753
    move-result-wide v3

    .line 754
    move-wide/from16 v7, v33

    .line 755
    .line 756
    move-object/from16 v9, v39

    .line 757
    .line 758
    invoke-static {v3, v4}, Lzt0;->y(J)I

    .line 759
    .line 760
    .line 761
    move-result v40

    .line 762
    move-wide/from16 v3, v24

    .line 763
    .line 764
    invoke-static {v7, v8, v3, v4, v9}, Li30;->X(JJLjava/math/RoundingMode;)J

    .line 765
    .line 766
    .line 767
    move-result-wide v3

    .line 768
    invoke-static {v3, v4}, Lzt0;->y(J)I

    .line 769
    .line 770
    .line 771
    move-result v41

    .line 772
    new-instance v39, Lqi1;

    .line 773
    .line 774
    int-to-long v3, v0

    .line 775
    add-long v44, v1, v3

    .line 776
    .line 777
    invoke-direct/range {v39 .. v45}, Lqi1;-><init>(IIJJ)V

    .line 778
    .line 779
    .line 780
    move-object/from16 v0, p0

    .line 781
    .line 782
    move-object/from16 v26, v39

    .line 783
    .line 784
    :goto_19
    iget-object v1, v0, Lsi1;->i:Lwn1;

    .line 785
    .line 786
    move-object/from16 v2, p1

    .line 787
    .line 788
    check-cast v2, Ldf1;

    .line 789
    .line 790
    iget-wide v3, v2, Ldf1;->i:J

    .line 791
    .line 792
    if-nez v1, :cond_24

    .line 793
    .line 794
    :goto_1a
    const/4 v1, 0x0

    .line 795
    goto/16 :goto_23

    .line 796
    .line 797
    :cond_24
    iget-object v1, v1, Lwn1;->a:[Len1;

    .line 798
    .line 799
    array-length v7, v1

    .line 800
    const/4 v8, 0x0

    .line 801
    :goto_1b
    if-ge v8, v7, :cond_27

    .line 802
    .line 803
    aget-object v9, v1, v8

    .line 804
    .line 805
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 806
    .line 807
    .line 808
    move-result-object v10

    .line 809
    const-class v11, Lzh1;

    .line 810
    .line 811
    invoke-virtual {v11, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 812
    .line 813
    .line 814
    move-result v10

    .line 815
    if-eqz v10, :cond_25

    .line 816
    .line 817
    invoke-virtual {v11, v9}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 818
    .line 819
    .line 820
    move-result-object v9

    .line 821
    check-cast v9, Len1;

    .line 822
    .line 823
    sget-object v10, Lel3;->f:Lel3;

    .line 824
    .line 825
    invoke-virtual {v10, v9}, Lel3;->c(Ljava/lang/Object;)Z

    .line 826
    .line 827
    .line 828
    move-result v10

    .line 829
    if-eqz v10, :cond_25

    .line 830
    .line 831
    goto :goto_1c

    .line 832
    :cond_25
    const/4 v9, 0x0

    .line 833
    :goto_1c
    if-eqz v9, :cond_26

    .line 834
    .line 835
    goto :goto_1d

    .line 836
    :cond_26
    add-int/lit8 v8, v8, 0x1

    .line 837
    .line 838
    goto :goto_1b

    .line 839
    :cond_27
    const/4 v9, 0x0

    .line 840
    :goto_1d
    check-cast v9, Lzh1;

    .line 841
    .line 842
    if-nez v9, :cond_28

    .line 843
    .line 844
    goto :goto_1a

    .line 845
    :cond_28
    array-length v7, v1

    .line 846
    const/4 v8, 0x0

    .line 847
    :goto_1e
    if-ge v8, v7, :cond_2b

    .line 848
    .line 849
    aget-object v10, v1, v8

    .line 850
    .line 851
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 852
    .line 853
    .line 854
    move-result-object v11

    .line 855
    const-class v13, Lbi1;

    .line 856
    .line 857
    invoke-virtual {v13, v11}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 858
    .line 859
    .line 860
    move-result v11

    .line 861
    if-eqz v11, :cond_29

    .line 862
    .line 863
    invoke-virtual {v13, v10}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 864
    .line 865
    .line 866
    move-result-object v10

    .line 867
    check-cast v10, Len1;

    .line 868
    .line 869
    move-object v11, v10

    .line 870
    check-cast v11, Lbi1;

    .line 871
    .line 872
    iget-object v11, v11, Lwh1;->a:Ljava/lang/String;

    .line 873
    .line 874
    const-string v13, "TLEN"

    .line 875
    .line 876
    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 877
    .line 878
    .line 879
    move-result v11

    .line 880
    if-eqz v11, :cond_29

    .line 881
    .line 882
    goto :goto_1f

    .line 883
    :cond_29
    const/4 v10, 0x0

    .line 884
    :goto_1f
    if-eqz v10, :cond_2a

    .line 885
    .line 886
    goto :goto_20

    .line 887
    :cond_2a
    add-int/lit8 v8, v8, 0x1

    .line 888
    .line 889
    goto :goto_1e

    .line 890
    :cond_2b
    const/4 v10, 0x0

    .line 891
    :goto_20
    check-cast v10, Lbi1;

    .line 892
    .line 893
    if-nez v10, :cond_2c

    .line 894
    .line 895
    move-wide/from16 v10, v18

    .line 896
    .line 897
    const/4 v7, 0x0

    .line 898
    goto :goto_21

    .line 899
    :cond_2c
    iget-object v1, v10, Lbi1;->c:Lxm3;

    .line 900
    .line 901
    const/4 v7, 0x0

    .line 902
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 903
    .line 904
    .line 905
    move-result-object v1

    .line 906
    check-cast v1, Ljava/lang/String;

    .line 907
    .line 908
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 909
    .line 910
    .line 911
    move-result-wide v10

    .line 912
    invoke-static {v10, v11}, Lv23;->r(J)J

    .line 913
    .line 914
    .line 915
    move-result-wide v10

    .line 916
    :goto_21
    iget-object v1, v9, Lzh1;->e:[I

    .line 917
    .line 918
    array-length v8, v1

    .line 919
    add-int/lit8 v13, v8, 0x1

    .line 920
    .line 921
    new-array v14, v13, [J

    .line 922
    .line 923
    new-array v13, v13, [J

    .line 924
    .line 925
    aput-wide v3, v14, v7

    .line 926
    .line 927
    aput-wide v16, v13, v7

    .line 928
    .line 929
    move-wide/from16 v20, v16

    .line 930
    .line 931
    const/4 v7, 0x1

    .line 932
    :goto_22
    if-gt v7, v8, :cond_2d

    .line 933
    .line 934
    iget v15, v9, Lzh1;->c:I

    .line 935
    .line 936
    add-int/lit8 v22, v7, -0x1

    .line 937
    .line 938
    aget v24, v1, v22

    .line 939
    .line 940
    add-int v15, v15, v24

    .line 941
    .line 942
    move-wide/from16 v24, v3

    .line 943
    .line 944
    int-to-long v3, v15

    .line 945
    add-long v3, v24, v3

    .line 946
    .line 947
    iget v15, v9, Lzh1;->d:I

    .line 948
    .line 949
    move-object/from16 v24, v1

    .line 950
    .line 951
    iget-object v1, v9, Lzh1;->f:[I

    .line 952
    .line 953
    aget v1, v1, v22

    .line 954
    .line 955
    add-int/2addr v15, v1

    .line 956
    move-wide/from16 v27, v3

    .line 957
    .line 958
    int-to-long v3, v15

    .line 959
    add-long v20, v20, v3

    .line 960
    .line 961
    aput-wide v27, v14, v7

    .line 962
    .line 963
    aput-wide v20, v13, v7

    .line 964
    .line 965
    add-int/lit8 v7, v7, 0x1

    .line 966
    .line 967
    move-object/from16 v1, v24

    .line 968
    .line 969
    move-wide/from16 v3, v27

    .line 970
    .line 971
    goto :goto_22

    .line 972
    :cond_2d
    new-instance v1, Lri1;

    .line 973
    .line 974
    invoke-direct {v1, v10, v11, v14, v13}, Lri1;-><init>(J[J[J)V

    .line 975
    .line 976
    .line 977
    :goto_23
    iget-boolean v3, v0, Lsi1;->p:Z

    .line 978
    .line 979
    if-eqz v3, :cond_2e

    .line 980
    .line 981
    new-instance v1, Lti1;

    .line 982
    .line 983
    move-wide/from16 v3, v16

    .line 984
    .line 985
    move-wide/from16 v7, v18

    .line 986
    .line 987
    invoke-direct {v1, v7, v8, v3, v4}, Lqf1;-><init>(JJ)V

    .line 988
    .line 989
    .line 990
    goto :goto_25

    .line 991
    :cond_2e
    if-eqz v1, :cond_2f

    .line 992
    .line 993
    move-object v15, v1

    .line 994
    goto :goto_24

    .line 995
    :cond_2f
    if-nez v26, :cond_30

    .line 996
    .line 997
    const/4 v15, 0x0

    .line 998
    goto :goto_24

    .line 999
    :cond_30
    move-object/from16 v15, v26

    .line 1000
    .line 1001
    :goto_24
    if-nez v15, :cond_31

    .line 1002
    .line 1003
    iget-object v1, v5, Lkz2;->a:[B

    .line 1004
    .line 1005
    const/4 v4, 0x4

    .line 1006
    const/4 v7, 0x0

    .line 1007
    invoke-virtual {v2, v1, v7, v4, v7}, Ldf1;->B([BIIZ)Z

    .line 1008
    .line 1009
    .line 1010
    invoke-virtual {v5, v7}, Lkz2;->E(I)V

    .line 1011
    .line 1012
    .line 1013
    invoke-virtual {v5}, Lkz2;->b()I

    .line 1014
    .line 1015
    .line 1016
    move-result v1

    .line 1017
    invoke-virtual {v6, v1}, Lxf1;->a(I)Z

    .line 1018
    .line 1019
    .line 1020
    new-instance v22, Lqi1;

    .line 1021
    .line 1022
    iget-wide v3, v2, Ldf1;->h:J

    .line 1023
    .line 1024
    iget-wide v7, v2, Ldf1;->i:J

    .line 1025
    .line 1026
    iget v1, v6, Lxf1;->e:I

    .line 1027
    .line 1028
    iget v9, v6, Lxf1;->b:I

    .line 1029
    .line 1030
    move/from16 v23, v1

    .line 1031
    .line 1032
    move-wide/from16 v25, v3

    .line 1033
    .line 1034
    move-wide/from16 v27, v7

    .line 1035
    .line 1036
    move/from16 v24, v9

    .line 1037
    .line 1038
    invoke-direct/range {v22 .. v28}, Lqi1;-><init>(IIJJ)V

    .line 1039
    .line 1040
    .line 1041
    move-object/from16 v1, v22

    .line 1042
    .line 1043
    goto :goto_25

    .line 1044
    :cond_31
    move-object v1, v15

    .line 1045
    :goto_25
    iput-object v1, v0, Lsi1;->o:Lui1;

    .line 1046
    .line 1047
    iget-object v3, v0, Lsi1;->e:Lnf1;

    .line 1048
    .line 1049
    invoke-interface {v3, v1}, Lnf1;->v(Lcg1;)V

    .line 1050
    .line 1051
    .line 1052
    new-instance v1, Lgg4;

    .line 1053
    .line 1054
    invoke-direct {v1}, Lgg4;-><init>()V

    .line 1055
    .line 1056
    .line 1057
    const-string v3, "audio/mpeg"

    .line 1058
    .line 1059
    invoke-virtual {v1, v3}, Lgg4;->d(Ljava/lang/String;)V

    .line 1060
    .line 1061
    .line 1062
    iget-object v3, v6, Lxf1;->g:Ljava/io/Serializable;

    .line 1063
    .line 1064
    check-cast v3, Ljava/lang/String;

    .line 1065
    .line 1066
    invoke-virtual {v1, v3}, Lgg4;->e(Ljava/lang/String;)V

    .line 1067
    .line 1068
    .line 1069
    const/16 v3, 0x1000

    .line 1070
    .line 1071
    iput v3, v1, Lgg4;->m:I

    .line 1072
    .line 1073
    iget v3, v6, Lxf1;->d:I

    .line 1074
    .line 1075
    iput v3, v1, Lgg4;->D:I

    .line 1076
    .line 1077
    iget v3, v6, Lxf1;->c:I

    .line 1078
    .line 1079
    iput v3, v1, Lgg4;->E:I

    .line 1080
    .line 1081
    iget v3, v12, Luf1;->a:I

    .line 1082
    .line 1083
    iput v3, v1, Lgg4;->G:I

    .line 1084
    .line 1085
    iget v3, v12, Luf1;->b:I

    .line 1086
    .line 1087
    iput v3, v1, Lgg4;->H:I

    .line 1088
    .line 1089
    iget-object v3, v0, Lsi1;->i:Lwn1;

    .line 1090
    .line 1091
    iput-object v3, v1, Lgg4;->j:Lwn1;

    .line 1092
    .line 1093
    iget-object v3, v0, Lsi1;->o:Lui1;

    .line 1094
    .line 1095
    invoke-interface {v3}, Lui1;->e()I

    .line 1096
    .line 1097
    .line 1098
    move-result v3

    .line 1099
    const v4, -0x7fffffff

    .line 1100
    .line 1101
    .line 1102
    if-eq v3, v4, :cond_32

    .line 1103
    .line 1104
    iget-object v3, v0, Lsi1;->o:Lui1;

    .line 1105
    .line 1106
    invoke-interface {v3}, Lui1;->e()I

    .line 1107
    .line 1108
    .line 1109
    move-result v3

    .line 1110
    iput v3, v1, Lgg4;->g:I

    .line 1111
    .line 1112
    :cond_32
    iget-object v3, v0, Lsi1;->g:Ljg1;

    .line 1113
    .line 1114
    new-instance v4, Lph4;

    .line 1115
    .line 1116
    invoke-direct {v4, v1}, Lph4;-><init>(Lgg4;)V

    .line 1117
    .line 1118
    .line 1119
    invoke-interface {v3, v4}, Ljg1;->d(Lph4;)V

    .line 1120
    .line 1121
    .line 1122
    iget-wide v1, v2, Ldf1;->i:J

    .line 1123
    .line 1124
    iput-wide v1, v0, Lsi1;->l:J

    .line 1125
    .line 1126
    :cond_33
    const/4 v7, 0x0

    .line 1127
    goto :goto_26

    .line 1128
    :cond_34
    iget-wide v1, v0, Lsi1;->l:J

    .line 1129
    .line 1130
    const-wide/16 v16, 0x0

    .line 1131
    .line 1132
    cmp-long v3, v1, v16

    .line 1133
    .line 1134
    if-eqz v3, :cond_33

    .line 1135
    .line 1136
    move-object/from16 v3, p1

    .line 1137
    .line 1138
    check-cast v3, Ldf1;

    .line 1139
    .line 1140
    iget-wide v3, v3, Ldf1;->i:J

    .line 1141
    .line 1142
    cmp-long v7, v3, v1

    .line 1143
    .line 1144
    if-gez v7, :cond_33

    .line 1145
    .line 1146
    sub-long/2addr v1, v3

    .line 1147
    long-to-int v1, v1

    .line 1148
    move-object/from16 v2, p1

    .line 1149
    .line 1150
    check-cast v2, Ldf1;

    .line 1151
    .line 1152
    const/4 v7, 0x0

    .line 1153
    invoke-virtual {v2, v1, v7}, Ldf1;->c(IZ)Z

    .line 1154
    .line 1155
    .line 1156
    :goto_26
    iget v1, v0, Lsi1;->n:I

    .line 1157
    .line 1158
    if-nez v1, :cond_38

    .line 1159
    .line 1160
    move-object/from16 v1, p1

    .line 1161
    .line 1162
    check-cast v1, Ldf1;

    .line 1163
    .line 1164
    iput v7, v1, Ldf1;->k:I

    .line 1165
    .line 1166
    invoke-virtual/range {p0 .. p1}, Lsi1;->g(Lmf1;)Z

    .line 1167
    .line 1168
    .line 1169
    move-result v1

    .line 1170
    if-eqz v1, :cond_35

    .line 1171
    .line 1172
    const/4 v14, -0x1

    .line 1173
    goto :goto_29

    .line 1174
    :cond_35
    invoke-virtual {v5, v7}, Lkz2;->E(I)V

    .line 1175
    .line 1176
    .line 1177
    invoke-virtual {v5}, Lkz2;->b()I

    .line 1178
    .line 1179
    .line 1180
    move-result v1

    .line 1181
    iget v2, v0, Lsi1;->h:I

    .line 1182
    .line 1183
    int-to-long v2, v2

    .line 1184
    const v4, -0x1f400

    .line 1185
    .line 1186
    .line 1187
    and-int/2addr v4, v1

    .line 1188
    int-to-long v4, v4

    .line 1189
    const-wide/32 v7, -0x1f400

    .line 1190
    .line 1191
    .line 1192
    and-long/2addr v2, v7

    .line 1193
    cmp-long v2, v4, v2

    .line 1194
    .line 1195
    if-nez v2, :cond_39

    .line 1196
    .line 1197
    invoke-static {v1}, Li41;->G(I)I

    .line 1198
    .line 1199
    .line 1200
    move-result v2

    .line 1201
    const/4 v14, -0x1

    .line 1202
    if-ne v2, v14, :cond_36

    .line 1203
    .line 1204
    goto :goto_27

    .line 1205
    :cond_36
    invoke-virtual {v6, v1}, Lxf1;->a(I)Z

    .line 1206
    .line 1207
    .line 1208
    iget-wide v1, v0, Lsi1;->j:J

    .line 1209
    .line 1210
    const-wide v18, -0x7fffffffffffffffL    # -4.9E-324

    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    cmp-long v1, v1, v18

    .line 1216
    .line 1217
    if-nez v1, :cond_37

    .line 1218
    .line 1219
    iget-object v1, v0, Lsi1;->o:Lui1;

    .line 1220
    .line 1221
    move-object/from16 v2, p1

    .line 1222
    .line 1223
    check-cast v2, Ldf1;

    .line 1224
    .line 1225
    iget-wide v2, v2, Ldf1;->i:J

    .line 1226
    .line 1227
    invoke-interface {v1, v2, v3}, Lui1;->f(J)J

    .line 1228
    .line 1229
    .line 1230
    move-result-wide v1

    .line 1231
    iput-wide v1, v0, Lsi1;->j:J

    .line 1232
    .line 1233
    :cond_37
    iget v1, v6, Lxf1;->b:I

    .line 1234
    .line 1235
    iput v1, v0, Lsi1;->n:I

    .line 1236
    .line 1237
    move-object/from16 v2, p1

    .line 1238
    .line 1239
    check-cast v2, Ldf1;

    .line 1240
    .line 1241
    iget-wide v2, v2, Ldf1;->i:J

    .line 1242
    .line 1243
    int-to-long v4, v1

    .line 1244
    add-long/2addr v2, v4

    .line 1245
    iput-wide v2, v0, Lsi1;->m:J

    .line 1246
    .line 1247
    const/4 v7, 0x0

    .line 1248
    :cond_38
    const/4 v13, 0x1

    .line 1249
    goto :goto_28

    .line 1250
    :cond_39
    :goto_27
    move-object/from16 v1, p1

    .line 1251
    .line 1252
    check-cast v1, Ldf1;

    .line 1253
    .line 1254
    const/4 v7, 0x0

    .line 1255
    const/4 v13, 0x1

    .line 1256
    invoke-virtual {v1, v13, v7}, Ldf1;->c(IZ)Z

    .line 1257
    .line 1258
    .line 1259
    iput v7, v0, Lsi1;->h:I

    .line 1260
    .line 1261
    return v7

    .line 1262
    :goto_28
    iget-object v2, v0, Lsi1;->g:Ljg1;

    .line 1263
    .line 1264
    move-object/from16 v3, p1

    .line 1265
    .line 1266
    invoke-interface {v2, v3, v1, v13}, Ljg1;->b(Lua4;IZ)I

    .line 1267
    .line 1268
    .line 1269
    move-result v1

    .line 1270
    const/4 v14, -0x1

    .line 1271
    if-ne v1, v14, :cond_3a

    .line 1272
    .line 1273
    :goto_29
    return v14

    .line 1274
    :cond_3a
    iget v2, v0, Lsi1;->n:I

    .line 1275
    .line 1276
    sub-int/2addr v2, v1

    .line 1277
    iput v2, v0, Lsi1;->n:I

    .line 1278
    .line 1279
    if-lez v2, :cond_3b

    .line 1280
    .line 1281
    return v7

    .line 1282
    :cond_3b
    iget-object v8, v0, Lsi1;->g:Ljg1;

    .line 1283
    .line 1284
    iget-wide v1, v0, Lsi1;->k:J

    .line 1285
    .line 1286
    iget-wide v3, v0, Lsi1;->j:J

    .line 1287
    .line 1288
    iget v5, v6, Lxf1;->c:I

    .line 1289
    .line 1290
    int-to-long v9, v5

    .line 1291
    const-wide/32 v11, 0xf4240

    .line 1292
    .line 1293
    .line 1294
    mul-long/2addr v1, v11

    .line 1295
    div-long/2addr v1, v9

    .line 1296
    add-long v9, v1, v3

    .line 1297
    .line 1298
    iget v12, v6, Lxf1;->b:I

    .line 1299
    .line 1300
    const/4 v13, 0x0

    .line 1301
    const/4 v14, 0x0

    .line 1302
    const/4 v11, 0x1

    .line 1303
    invoke-interface/range {v8 .. v14}, Ljg1;->c(JIIILig1;)V

    .line 1304
    .line 1305
    .line 1306
    iget-wide v1, v0, Lsi1;->k:J

    .line 1307
    .line 1308
    iget v3, v6, Lxf1;->f:I

    .line 1309
    .line 1310
    int-to-long v3, v3

    .line 1311
    add-long/2addr v1, v3

    .line 1312
    iput-wide v1, v0, Lsi1;->k:J

    .line 1313
    .line 1314
    const/4 v7, 0x0

    .line 1315
    iput v7, v0, Lsi1;->n:I

    .line 1316
    .line 1317
    return v7
.end method

.method public final e(JJ)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lsi1;->h:I

    .line 3
    .line 4
    const-wide p2, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    iput-wide p2, p0, Lsi1;->j:J

    .line 10
    .line 11
    const-wide/16 p2, 0x0

    .line 12
    .line 13
    iput-wide p2, p0, Lsi1;->k:J

    .line 14
    .line 15
    iput p1, p0, Lsi1;->n:I

    .line 16
    .line 17
    return-void
.end method

.method public final f(Lnf1;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lsi1;->e:Lnf1;

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
    move-result-object p1

    .line 9
    iput-object p1, p0, Lsi1;->f:Ljg1;

    .line 10
    .line 11
    iput-object p1, p0, Lsi1;->g:Ljg1;

    .line 12
    .line 13
    iget-object p1, p0, Lsi1;->e:Lnf1;

    .line 14
    .line 15
    invoke-interface {p1}, Lnf1;->s()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final g(Lmf1;)Z
    .locals 8

    .line 1
    iget-object v0, p0, Lsi1;->o:Lui1;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, Lui1;->c()J

    .line 7
    .line 8
    .line 9
    move-result-wide v2

    .line 10
    const-wide/16 v4, -0x1

    .line 11
    .line 12
    cmp-long v0, v2, v4

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {p1}, Lmf1;->n()J

    .line 17
    .line 18
    .line 19
    move-result-wide v4

    .line 20
    const-wide/16 v6, -0x4

    .line 21
    .line 22
    add-long/2addr v2, v6

    .line 23
    cmp-long v0, v4, v2

    .line 24
    .line 25
    if-gtz v0, :cond_2

    .line 26
    .line 27
    :cond_0
    :try_start_0
    iget-object v0, p0, Lsi1;->a:Lkz2;

    .line 28
    .line 29
    iget-object v0, v0, Lkz2;->a:[B

    .line 30
    .line 31
    const/4 v2, 0x4

    .line 32
    const/4 v3, 0x0

    .line 33
    invoke-interface {p1, v0, v3, v2, v1}, Lmf1;->B([BIIZ)Z

    .line 34
    .line 35
    .line 36
    move-result p1
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    if-nez p1, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    return v3

    .line 41
    :catch_0
    :cond_2
    :goto_0
    return v1
.end method

.method public final h()V
    .locals 8

    .line 1
    iget-object v0, p0, Lsi1;->o:Lui1;

    .line 2
    .line 3
    instance-of v1, v0, Lqi1;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Lqi1;

    .line 8
    .line 9
    invoke-virtual {v0}, Lqi1;->d()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-wide v0, p0, Lsi1;->m:J

    .line 16
    .line 17
    const-wide/16 v2, -0x1

    .line 18
    .line 19
    cmp-long v2, v0, v2

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    iget-object v2, p0, Lsi1;->o:Lui1;

    .line 24
    .line 25
    invoke-interface {v2}, Lui1;->c()J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    cmp-long v0, v0, v2

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    iget-object v0, p0, Lsi1;->o:Lui1;

    .line 34
    .line 35
    check-cast v0, Lqi1;

    .line 36
    .line 37
    iget-wide v4, p0, Lsi1;->m:J

    .line 38
    .line 39
    iget-wide v6, v0, Lqi1;->g:J

    .line 40
    .line 41
    iget v2, v0, Lqi1;->h:I

    .line 42
    .line 43
    iget v3, v0, Lqi1;->i:I

    .line 44
    .line 45
    new-instance v1, Lqi1;

    .line 46
    .line 47
    invoke-direct/range {v1 .. v7}, Lqi1;-><init>(IIJJ)V

    .line 48
    .line 49
    .line 50
    iput-object v1, p0, Lsi1;->o:Lui1;

    .line 51
    .line 52
    iget-object v0, p0, Lsi1;->e:Lnf1;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    iget-object v1, p0, Lsi1;->o:Lui1;

    .line 58
    .line 59
    invoke-interface {v0, v1}, Lnf1;->v(Lcg1;)V

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, Lsi1;->f:Ljg1;

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, Lsi1;->o:Lui1;

    .line 68
    .line 69
    invoke-interface {v0}, Lcg1;->a()J

    .line 70
    .line 71
    .line 72
    :cond_0
    return-void
.end method
