.class public final Lum1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lgm1;


# instance fields
.field public final a:Lkz2;

.field public final b:Lxf1;

.field public final c:Ljava/lang/String;

.field public final d:I

.field public final e:Ljava/lang/String;

.field public f:Ljg1;

.field public g:Ljava/lang/String;

.field public h:I

.field public i:I

.field public j:Z

.field public k:Z

.field public l:J

.field public m:I

.field public n:J


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lum1;->h:I

    .line 6
    .line 7
    new-instance v1, Lkz2;

    .line 8
    .line 9
    const/4 v2, 0x4

    .line 10
    invoke-direct {v1, v2}, Lkz2;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object v1, p0, Lum1;->a:Lkz2;

    .line 14
    .line 15
    iget-object v1, v1, Lkz2;->a:[B

    .line 16
    .line 17
    const/4 v2, -0x1

    .line 18
    aput-byte v2, v1, v0

    .line 19
    .line 20
    new-instance v0, Lxf1;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lum1;->b:Lxf1;

    .line 26
    .line 27
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    iput-wide v0, p0, Lum1;->n:J

    .line 33
    .line 34
    iput-object p2, p0, Lum1;->c:Ljava/lang/String;

    .line 35
    .line 36
    iput p1, p0, Lum1;->d:I

    .line 37
    .line 38
    iput-object p3, p0, Lum1;->e:Ljava/lang/String;

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lum1;->h:I

    .line 3
    .line 4
    iput v0, p0, Lum1;->i:I

    .line 5
    .line 6
    iput-boolean v0, p0, Lum1;->k:Z

    .line 7
    .line 8
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    iput-wide v0, p0, Lum1;->n:J

    .line 14
    .line 15
    return-void
.end method

.method public final b(Lkz2;)V
    .locals 12

    .line 1
    iget-object v0, p0, Lum1;->f:Ljg1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lkz2;->B()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-lez v0, :cond_a

    .line 11
    .line 12
    iget v0, p0, Lum1;->h:I

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    iget-object v2, p0, Lum1;->a:Lkz2;

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    const/4 v4, 0x0

    .line 19
    if-eqz v0, :cond_5

    .line 20
    .line 21
    if-eq v0, v3, :cond_2

    .line 22
    .line 23
    invoke-virtual {p1}, Lkz2;->B()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iget v1, p0, Lum1;->m:I

    .line 28
    .line 29
    iget v2, p0, Lum1;->i:I

    .line 30
    .line 31
    sub-int/2addr v1, v2

    .line 32
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-object v1, p0, Lum1;->f:Ljg1;

    .line 37
    .line 38
    invoke-interface {v1, p1, v0, v4}, Ljg1;->a(Lkz2;II)V

    .line 39
    .line 40
    .line 41
    iget v1, p0, Lum1;->i:I

    .line 42
    .line 43
    add-int/2addr v1, v0

    .line 44
    iput v1, p0, Lum1;->i:I

    .line 45
    .line 46
    iget v0, p0, Lum1;->m:I

    .line 47
    .line 48
    if-lt v1, v0, :cond_0

    .line 49
    .line 50
    iget-wide v0, p0, Lum1;->n:J

    .line 51
    .line 52
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    cmp-long v0, v0, v5

    .line 58
    .line 59
    if-eqz v0, :cond_1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    move v3, v4

    .line 63
    :goto_1
    invoke-static {v3}, Lzt0;->b0(Z)V

    .line 64
    .line 65
    .line 66
    iget-object v5, p0, Lum1;->f:Ljg1;

    .line 67
    .line 68
    iget-wide v6, p0, Lum1;->n:J

    .line 69
    .line 70
    iget v9, p0, Lum1;->m:I

    .line 71
    .line 72
    const/4 v10, 0x0

    .line 73
    const/4 v11, 0x0

    .line 74
    const/4 v8, 0x1

    .line 75
    invoke-interface/range {v5 .. v11}, Ljg1;->c(JIIILig1;)V

    .line 76
    .line 77
    .line 78
    iget-wide v0, p0, Lum1;->n:J

    .line 79
    .line 80
    iget-wide v2, p0, Lum1;->l:J

    .line 81
    .line 82
    add-long/2addr v0, v2

    .line 83
    iput-wide v0, p0, Lum1;->n:J

    .line 84
    .line 85
    iput v4, p0, Lum1;->i:I

    .line 86
    .line 87
    iput v4, p0, Lum1;->h:I

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_2
    invoke-virtual {p1}, Lkz2;->B()I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    iget v5, p0, Lum1;->i:I

    .line 95
    .line 96
    const/4 v6, 0x4

    .line 97
    rsub-int/lit8 v5, v5, 0x4

    .line 98
    .line 99
    invoke-static {v0, v5}, Ljava/lang/Math;->min(II)I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    iget-object v5, v2, Lkz2;->a:[B

    .line 104
    .line 105
    iget v7, p0, Lum1;->i:I

    .line 106
    .line 107
    invoke-virtual {p1, v5, v7, v0}, Lkz2;->H([BII)V

    .line 108
    .line 109
    .line 110
    iget v5, p0, Lum1;->i:I

    .line 111
    .line 112
    add-int/2addr v5, v0

    .line 113
    iput v5, p0, Lum1;->i:I

    .line 114
    .line 115
    if-lt v5, v6, :cond_0

    .line 116
    .line 117
    invoke-virtual {v2, v4}, Lkz2;->E(I)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2}, Lkz2;->b()I

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    iget-object v5, p0, Lum1;->b:Lxf1;

    .line 125
    .line 126
    invoke-virtual {v5, v0}, Lxf1;->a(I)Z

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    if-nez v0, :cond_3

    .line 131
    .line 132
    iput v4, p0, Lum1;->i:I

    .line 133
    .line 134
    iput v3, p0, Lum1;->h:I

    .line 135
    .line 136
    goto/16 :goto_0

    .line 137
    .line 138
    :cond_3
    iget v0, v5, Lxf1;->b:I

    .line 139
    .line 140
    iput v0, p0, Lum1;->m:I

    .line 141
    .line 142
    iget-boolean v0, p0, Lum1;->j:Z

    .line 143
    .line 144
    if-nez v0, :cond_4

    .line 145
    .line 146
    iget v0, v5, Lxf1;->f:I

    .line 147
    .line 148
    int-to-long v7, v0

    .line 149
    iget v0, v5, Lxf1;->c:I

    .line 150
    .line 151
    const-wide/32 v9, 0xf4240

    .line 152
    .line 153
    .line 154
    mul-long/2addr v7, v9

    .line 155
    int-to-long v9, v0

    .line 156
    div-long/2addr v7, v9

    .line 157
    iput-wide v7, p0, Lum1;->l:J

    .line 158
    .line 159
    new-instance v0, Lgg4;

    .line 160
    .line 161
    invoke-direct {v0}, Lgg4;-><init>()V

    .line 162
    .line 163
    .line 164
    iget-object v7, p0, Lum1;->g:Ljava/lang/String;

    .line 165
    .line 166
    iput-object v7, v0, Lgg4;->a:Ljava/lang/String;

    .line 167
    .line 168
    iget-object v7, p0, Lum1;->e:Ljava/lang/String;

    .line 169
    .line 170
    invoke-virtual {v0, v7}, Lgg4;->d(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    iget-object v7, v5, Lxf1;->g:Ljava/io/Serializable;

    .line 174
    .line 175
    check-cast v7, Ljava/lang/String;

    .line 176
    .line 177
    invoke-virtual {v0, v7}, Lgg4;->e(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    const/16 v7, 0x1000

    .line 181
    .line 182
    iput v7, v0, Lgg4;->m:I

    .line 183
    .line 184
    iget v7, v5, Lxf1;->d:I

    .line 185
    .line 186
    iput v7, v0, Lgg4;->D:I

    .line 187
    .line 188
    iget v5, v5, Lxf1;->c:I

    .line 189
    .line 190
    iput v5, v0, Lgg4;->E:I

    .line 191
    .line 192
    iget-object v5, p0, Lum1;->c:Ljava/lang/String;

    .line 193
    .line 194
    iput-object v5, v0, Lgg4;->d:Ljava/lang/String;

    .line 195
    .line 196
    iget v5, p0, Lum1;->d:I

    .line 197
    .line 198
    iput v5, v0, Lgg4;->f:I

    .line 199
    .line 200
    new-instance v5, Lph4;

    .line 201
    .line 202
    invoke-direct {v5, v0}, Lph4;-><init>(Lgg4;)V

    .line 203
    .line 204
    .line 205
    iget-object v0, p0, Lum1;->f:Ljg1;

    .line 206
    .line 207
    invoke-interface {v0, v5}, Ljg1;->d(Lph4;)V

    .line 208
    .line 209
    .line 210
    iput-boolean v3, p0, Lum1;->j:Z

    .line 211
    .line 212
    :cond_4
    invoke-virtual {v2, v4}, Lkz2;->E(I)V

    .line 213
    .line 214
    .line 215
    iget-object v0, p0, Lum1;->f:Ljg1;

    .line 216
    .line 217
    invoke-interface {v0, v2, v6, v4}, Ljg1;->a(Lkz2;II)V

    .line 218
    .line 219
    .line 220
    iput v1, p0, Lum1;->h:I

    .line 221
    .line 222
    goto/16 :goto_0

    .line 223
    .line 224
    :cond_5
    iget-object v0, p1, Lkz2;->a:[B

    .line 225
    .line 226
    iget v5, p1, Lkz2;->b:I

    .line 227
    .line 228
    iget v6, p1, Lkz2;->c:I

    .line 229
    .line 230
    :goto_2
    if-ge v5, v6, :cond_9

    .line 231
    .line 232
    add-int/lit8 v7, v5, 0x1

    .line 233
    .line 234
    aget-byte v8, v0, v5

    .line 235
    .line 236
    and-int/lit16 v9, v8, 0xff

    .line 237
    .line 238
    const/16 v10, 0xff

    .line 239
    .line 240
    if-ne v9, v10, :cond_6

    .line 241
    .line 242
    move v9, v3

    .line 243
    goto :goto_3

    .line 244
    :cond_6
    move v9, v4

    .line 245
    :goto_3
    iget-boolean v10, p0, Lum1;->k:Z

    .line 246
    .line 247
    if-eqz v10, :cond_7

    .line 248
    .line 249
    and-int/lit16 v8, v8, 0xe0

    .line 250
    .line 251
    const/16 v10, 0xe0

    .line 252
    .line 253
    if-ne v8, v10, :cond_7

    .line 254
    .line 255
    move v8, v3

    .line 256
    goto :goto_4

    .line 257
    :cond_7
    move v8, v4

    .line 258
    :goto_4
    iput-boolean v9, p0, Lum1;->k:Z

    .line 259
    .line 260
    if-eqz v8, :cond_8

    .line 261
    .line 262
    invoke-virtual {p1, v7}, Lkz2;->E(I)V

    .line 263
    .line 264
    .line 265
    iput-boolean v4, p0, Lum1;->k:Z

    .line 266
    .line 267
    iget-object v2, v2, Lkz2;->a:[B

    .line 268
    .line 269
    aget-byte v0, v0, v5

    .line 270
    .line 271
    aput-byte v0, v2, v3

    .line 272
    .line 273
    iput v1, p0, Lum1;->i:I

    .line 274
    .line 275
    iput v3, p0, Lum1;->h:I

    .line 276
    .line 277
    goto/16 :goto_0

    .line 278
    .line 279
    :cond_8
    move v5, v7

    .line 280
    goto :goto_2

    .line 281
    :cond_9
    invoke-virtual {p1, v6}, Lkz2;->E(I)V

    .line 282
    .line 283
    .line 284
    goto/16 :goto_0

    .line 285
    .line 286
    :cond_a
    return-void
.end method

.method public final c(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final d(IJ)V
    .locals 0

    .line 1
    iput-wide p2, p0, Lum1;->n:J

    .line 2
    .line 3
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
    iput-object v0, p0, Lum1;->g:Ljava/lang/String;

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
    iput-object p1, p0, Lum1;->f:Ljg1;

    .line 22
    .line 23
    return-void
.end method
