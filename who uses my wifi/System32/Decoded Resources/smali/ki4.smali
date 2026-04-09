.class public final Lki4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljg1;


# instance fields
.field public A:Z

.field public final a:Lii4;

.field public final b:Llk1;

.field public final c:Lso1;

.field public final d:Lpz;

.field public e:Lbi4;

.field public f:Lph4;

.field public g:Lci3;

.field public h:I

.field public i:[J

.field public j:[J

.field public k:[I

.field public l:[I

.field public m:[J

.field public n:[Lig1;

.field public o:I

.field public p:I

.field public q:I

.field public r:I

.field public s:J

.field public t:J

.field public u:J

.field public v:Z

.field public w:Z

.field public x:Z

.field public y:Lph4;

.field public z:Z


# direct methods
.method public constructor <init>(Lrj4;Lpz;Llv2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lki4;->d:Lpz;

    .line 5
    .line 6
    new-instance p2, Lii4;

    .line 7
    .line 8
    invoke-direct {p2, p1}, Lii4;-><init>(Lrj4;)V

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, Lki4;->a:Lii4;

    .line 12
    .line 13
    new-instance p1, Llk1;

    .line 14
    .line 15
    invoke-direct {p1}, Llk1;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lki4;->b:Llk1;

    .line 19
    .line 20
    const/16 p1, 0x3e8

    .line 21
    .line 22
    iput p1, p0, Lki4;->h:I

    .line 23
    .line 24
    new-array p2, p1, [J

    .line 25
    .line 26
    iput-object p2, p0, Lki4;->i:[J

    .line 27
    .line 28
    new-array p2, p1, [J

    .line 29
    .line 30
    iput-object p2, p0, Lki4;->j:[J

    .line 31
    .line 32
    new-array p2, p1, [J

    .line 33
    .line 34
    iput-object p2, p0, Lki4;->m:[J

    .line 35
    .line 36
    new-array p2, p1, [I

    .line 37
    .line 38
    iput-object p2, p0, Lki4;->l:[I

    .line 39
    .line 40
    new-array p2, p1, [I

    .line 41
    .line 42
    iput-object p2, p0, Lki4;->k:[I

    .line 43
    .line 44
    new-array p1, p1, [Lig1;

    .line 45
    .line 46
    iput-object p1, p0, Lki4;->n:[Lig1;

    .line 47
    .line 48
    new-instance p1, Lso1;

    .line 49
    .line 50
    const/16 p2, 0xf

    .line 51
    .line 52
    const/4 p3, 0x0

    .line 53
    invoke-direct {p1, p2, p3}, Lso1;-><init>(IZ)V

    .line 54
    .line 55
    .line 56
    iput-object p1, p0, Lki4;->c:Lso1;

    .line 57
    .line 58
    const-wide/high16 p1, -0x8000000000000000L

    .line 59
    .line 60
    iput-wide p1, p0, Lki4;->s:J

    .line 61
    .line 62
    iput-wide p1, p0, Lki4;->t:J

    .line 63
    .line 64
    iput-wide p1, p0, Lki4;->u:J

    .line 65
    .line 66
    const/4 p1, 0x1

    .line 67
    iput-boolean p1, p0, Lki4;->x:Z

    .line 68
    .line 69
    iput-boolean p1, p0, Lki4;->w:Z

    .line 70
    .line 71
    iput-boolean p1, p0, Lki4;->z:Z

    .line 72
    .line 73
    return-void
.end method


# virtual methods
.method public final a(Lkz2;II)V
    .locals 8

    .line 1
    :cond_0
    :goto_0
    iget-object p3, p0, Lki4;->a:Lii4;

    .line 2
    .line 3
    if-lez p2, :cond_1

    .line 4
    .line 5
    invoke-virtual {p3, p2}, Lii4;->b(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p3, Lii4;->e:Lcj1;

    .line 10
    .line 11
    iget-object v2, v1, Lcj1;->h:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Lqj4;

    .line 14
    .line 15
    iget-object v3, v2, Lqj4;->a:[B

    .line 16
    .line 17
    iget-wide v4, p3, Lii4;->f:J

    .line 18
    .line 19
    iget-wide v6, v1, Lcj1;->f:J

    .line 20
    .line 21
    sub-long/2addr v4, v6

    .line 22
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    long-to-int v1, v4

    .line 26
    invoke-virtual {p1, v3, v1, v0}, Lkz2;->H([BII)V

    .line 27
    .line 28
    .line 29
    sub-int/2addr p2, v0

    .line 30
    iget-wide v1, p3, Lii4;->f:J

    .line 31
    .line 32
    int-to-long v3, v0

    .line 33
    add-long/2addr v1, v3

    .line 34
    iput-wide v1, p3, Lii4;->f:J

    .line 35
    .line 36
    iget-object v0, p3, Lii4;->e:Lcj1;

    .line 37
    .line 38
    iget-wide v3, v0, Lcj1;->g:J

    .line 39
    .line 40
    cmp-long v1, v1, v3

    .line 41
    .line 42
    if-nez v1, :cond_0

    .line 43
    .line 44
    iget-object v0, v0, Lcj1;->i:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Lcj1;

    .line 47
    .line 48
    iput-object v0, p3, Lii4;->e:Lcj1;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final b(Lua4;IZ)I
    .locals 8

    .line 1
    iget-object v0, p0, Lki4;->a:Lii4;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Lii4;->b(I)I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    iget-object v1, v0, Lii4;->e:Lcj1;

    .line 8
    .line 9
    iget-object v2, v1, Lcj1;->h:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lqj4;

    .line 12
    .line 13
    iget-object v3, v2, Lqj4;->a:[B

    .line 14
    .line 15
    iget-wide v4, v0, Lii4;->f:J

    .line 16
    .line 17
    iget-wide v6, v1, Lcj1;->f:J

    .line 18
    .line 19
    sub-long/2addr v4, v6

    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    long-to-int v1, v4

    .line 24
    invoke-interface {p1, v3, v1, p2}, Lua4;->d([BII)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    const/4 p2, -0x1

    .line 29
    if-ne p1, p2, :cond_1

    .line 30
    .line 31
    if-eqz p3, :cond_0

    .line 32
    .line 33
    return p2

    .line 34
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    .line 35
    .line 36
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 37
    .line 38
    .line 39
    throw p1

    .line 40
    :cond_1
    iget-wide p2, v0, Lii4;->f:J

    .line 41
    .line 42
    int-to-long v1, p1

    .line 43
    add-long/2addr p2, v1

    .line 44
    iput-wide p2, v0, Lii4;->f:J

    .line 45
    .line 46
    iget-object v1, v0, Lii4;->e:Lcj1;

    .line 47
    .line 48
    iget-wide v2, v1, Lcj1;->g:J

    .line 49
    .line 50
    cmp-long p2, p2, v2

    .line 51
    .line 52
    if-nez p2, :cond_2

    .line 53
    .line 54
    iget-object p2, v1, Lcj1;->i:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p2, Lcj1;

    .line 57
    .line 58
    iput-object p2, v0, Lii4;->e:Lcj1;

    .line 59
    .line 60
    :cond_2
    return p1
.end method

.method public final c(JIIILig1;)V
    .locals 9

    .line 1
    iget-boolean v0, p0, Lki4;->w:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    and-int/lit8 v0, p3, 0x1

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iput-boolean v1, p0, Lki4;->w:Z

    .line 12
    .line 13
    :cond_1
    iget-boolean v0, p0, Lki4;->z:Z

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    if-eqz v0, :cond_4

    .line 17
    .line 18
    iget-wide v3, p0, Lki4;->s:J

    .line 19
    .line 20
    cmp-long v0, p1, v3

    .line 21
    .line 22
    if-ltz v0, :cond_3

    .line 23
    .line 24
    and-int/lit8 v0, p3, 0x1

    .line 25
    .line 26
    if-nez v0, :cond_4

    .line 27
    .line 28
    iget-boolean v0, p0, Lki4;->A:Z

    .line 29
    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    iget-object v0, p0, Lki4;->y:Lph4;

    .line 33
    .line 34
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-string v3, "Overriding unexpected non-sync sample for format: "

    .line 39
    .line 40
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v0}, La30;->x(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iput-boolean v2, p0, Lki4;->A:Z

    .line 48
    .line 49
    :cond_2
    or-int/lit8 p3, p3, 0x1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_3
    :goto_0
    return-void

    .line 53
    :cond_4
    :goto_1
    iget-object v0, p0, Lki4;->a:Lii4;

    .line 54
    .line 55
    int-to-long v3, p4

    .line 56
    iget-wide v5, v0, Lii4;->f:J

    .line 57
    .line 58
    sub-long/2addr v5, v3

    .line 59
    int-to-long v3, p5

    .line 60
    sub-long/2addr v5, v3

    .line 61
    monitor-enter p0

    .line 62
    :try_start_0
    iget p5, p0, Lki4;->o:I

    .line 63
    .line 64
    const/4 v0, -0x1

    .line 65
    if-lez p5, :cond_6

    .line 66
    .line 67
    add-int/2addr p5, v0

    .line 68
    invoke-virtual {p0, p5}, Lki4;->h(I)I

    .line 69
    .line 70
    .line 71
    move-result p5

    .line 72
    iget-object v3, p0, Lki4;->j:[J

    .line 73
    .line 74
    aget-wide v7, v3, p5

    .line 75
    .line 76
    iget-object v3, p0, Lki4;->k:[I

    .line 77
    .line 78
    aget p5, v3, p5

    .line 79
    .line 80
    int-to-long v3, p5

    .line 81
    add-long/2addr v7, v3

    .line 82
    cmp-long p5, v7, v5

    .line 83
    .line 84
    if-gtz p5, :cond_5

    .line 85
    .line 86
    move p5, v2

    .line 87
    goto :goto_2

    .line 88
    :cond_5
    move p5, v1

    .line 89
    :goto_2
    invoke-static {p5}, Lzt0;->D(Z)V

    .line 90
    .line 91
    .line 92
    goto :goto_3

    .line 93
    :catchall_0
    move-exception p1

    .line 94
    goto/16 :goto_8

    .line 95
    .line 96
    :cond_6
    :goto_3
    const/high16 p5, 0x20000000

    .line 97
    .line 98
    and-int/2addr p5, p3

    .line 99
    if-eqz p5, :cond_7

    .line 100
    .line 101
    move p5, v2

    .line 102
    goto :goto_4

    .line 103
    :cond_7
    move p5, v1

    .line 104
    :goto_4
    iput-boolean p5, p0, Lki4;->v:Z

    .line 105
    .line 106
    iget-wide v3, p0, Lki4;->u:J

    .line 107
    .line 108
    invoke-static {v3, v4, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 109
    .line 110
    .line 111
    move-result-wide v3

    .line 112
    iput-wide v3, p0, Lki4;->u:J

    .line 113
    .line 114
    iget p5, p0, Lki4;->o:I

    .line 115
    .line 116
    invoke-virtual {p0, p5}, Lki4;->h(I)I

    .line 117
    .line 118
    .line 119
    move-result p5

    .line 120
    iget-object v3, p0, Lki4;->m:[J

    .line 121
    .line 122
    aput-wide p1, v3, p5

    .line 123
    .line 124
    iget-object p1, p0, Lki4;->j:[J

    .line 125
    .line 126
    aput-wide v5, p1, p5

    .line 127
    .line 128
    iget-object p1, p0, Lki4;->k:[I

    .line 129
    .line 130
    aput p4, p1, p5

    .line 131
    .line 132
    iget-object p1, p0, Lki4;->l:[I

    .line 133
    .line 134
    aput p3, p1, p5

    .line 135
    .line 136
    iget-object p1, p0, Lki4;->n:[Lig1;

    .line 137
    .line 138
    aput-object p6, p1, p5

    .line 139
    .line 140
    iget-object p1, p0, Lki4;->i:[J

    .line 141
    .line 142
    const-wide/16 p2, 0x0

    .line 143
    .line 144
    aput-wide p2, p1, p5

    .line 145
    .line 146
    iget-object p1, p0, Lki4;->c:Lso1;

    .line 147
    .line 148
    iget-object p2, p1, Lso1;->g:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast p2, Landroid/util/SparseArray;

    .line 151
    .line 152
    invoke-virtual {p2}, Landroid/util/SparseArray;->size()I

    .line 153
    .line 154
    .line 155
    move-result p2

    .line 156
    if-nez p2, :cond_8

    .line 157
    .line 158
    move p2, v2

    .line 159
    goto :goto_5

    .line 160
    :cond_8
    move p2, v1

    .line 161
    :goto_5
    if-nez p2, :cond_9

    .line 162
    .line 163
    iget-object p2, p1, Lso1;->g:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast p2, Landroid/util/SparseArray;

    .line 166
    .line 167
    invoke-virtual {p2}, Landroid/util/SparseArray;->size()I

    .line 168
    .line 169
    .line 170
    move-result p3

    .line 171
    add-int/2addr p3, v0

    .line 172
    invoke-virtual {p2, p3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p2

    .line 176
    check-cast p2, Lji4;

    .line 177
    .line 178
    iget-object p2, p2, Lji4;->a:Lph4;

    .line 179
    .line 180
    iget-object p3, p0, Lki4;->y:Lph4;

    .line 181
    .line 182
    invoke-virtual {p2, p3}, Lph4;->equals(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result p2

    .line 186
    if-nez p2, :cond_e

    .line 187
    .line 188
    :cond_9
    iget-object p2, p0, Lki4;->y:Lph4;

    .line 189
    .line 190
    if-eqz p2, :cond_10

    .line 191
    .line 192
    iget p3, p0, Lki4;->p:I

    .line 193
    .line 194
    iget p4, p0, Lki4;->o:I

    .line 195
    .line 196
    add-int/2addr p3, p4

    .line 197
    new-instance p4, Lji4;

    .line 198
    .line 199
    invoke-direct {p4, p2}, Lji4;-><init>(Lph4;)V

    .line 200
    .line 201
    .line 202
    iget-object p2, p1, Lso1;->g:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast p2, Landroid/util/SparseArray;

    .line 205
    .line 206
    iget p5, p1, Lso1;->f:I

    .line 207
    .line 208
    if-ne p5, v0, :cond_b

    .line 209
    .line 210
    invoke-virtual {p2}, Landroid/util/SparseArray;->size()I

    .line 211
    .line 212
    .line 213
    move-result p5

    .line 214
    if-nez p5, :cond_a

    .line 215
    .line 216
    move p5, v2

    .line 217
    goto :goto_6

    .line 218
    :cond_a
    move p5, v1

    .line 219
    :goto_6
    invoke-static {p5}, Lzt0;->b0(Z)V

    .line 220
    .line 221
    .line 222
    iput v1, p1, Lso1;->f:I

    .line 223
    .line 224
    :cond_b
    invoke-virtual {p2}, Landroid/util/SparseArray;->size()I

    .line 225
    .line 226
    .line 227
    move-result p5

    .line 228
    if-lez p5, :cond_d

    .line 229
    .line 230
    invoke-virtual {p2}, Landroid/util/SparseArray;->size()I

    .line 231
    .line 232
    .line 233
    move-result p5

    .line 234
    add-int/2addr p5, v0

    .line 235
    invoke-virtual {p2, p5}, Landroid/util/SparseArray;->keyAt(I)I

    .line 236
    .line 237
    .line 238
    move-result p5

    .line 239
    if-lt p3, p5, :cond_c

    .line 240
    .line 241
    move p6, v2

    .line 242
    goto :goto_7

    .line 243
    :cond_c
    move p6, v1

    .line 244
    :goto_7
    invoke-static {p6}, Lzt0;->D(Z)V

    .line 245
    .line 246
    .line 247
    if-ne p5, p3, :cond_d

    .line 248
    .line 249
    iget-object p1, p1, Lso1;->h:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast p1, Lhd4;

    .line 252
    .line 253
    invoke-virtual {p2}, Landroid/util/SparseArray;->size()I

    .line 254
    .line 255
    .line 256
    move-result p5

    .line 257
    add-int/2addr p5, v0

    .line 258
    invoke-virtual {p2, p5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object p5

    .line 262
    invoke-virtual {p1, p5}, Lhd4;->c(Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    :cond_d
    invoke-virtual {p2, p3, p4}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    :cond_e
    iget p1, p0, Lki4;->o:I

    .line 269
    .line 270
    add-int/2addr p1, v2

    .line 271
    iput p1, p0, Lki4;->o:I

    .line 272
    .line 273
    iget p2, p0, Lki4;->h:I

    .line 274
    .line 275
    if-ne p1, p2, :cond_f

    .line 276
    .line 277
    add-int/lit16 p1, p2, 0x3e8

    .line 278
    .line 279
    new-array p3, p1, [J

    .line 280
    .line 281
    new-array p4, p1, [J

    .line 282
    .line 283
    new-array p5, p1, [J

    .line 284
    .line 285
    new-array p6, p1, [I

    .line 286
    .line 287
    new-array v0, p1, [I

    .line 288
    .line 289
    new-array v2, p1, [Lig1;

    .line 290
    .line 291
    iget v3, p0, Lki4;->q:I

    .line 292
    .line 293
    sub-int/2addr p2, v3

    .line 294
    iget-object v4, p0, Lki4;->j:[J

    .line 295
    .line 296
    invoke-static {v4, v3, p4, v1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 297
    .line 298
    .line 299
    iget-object v3, p0, Lki4;->m:[J

    .line 300
    .line 301
    iget v4, p0, Lki4;->q:I

    .line 302
    .line 303
    invoke-static {v3, v4, p5, v1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 304
    .line 305
    .line 306
    iget-object v3, p0, Lki4;->l:[I

    .line 307
    .line 308
    iget v4, p0, Lki4;->q:I

    .line 309
    .line 310
    invoke-static {v3, v4, p6, v1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 311
    .line 312
    .line 313
    iget-object v3, p0, Lki4;->k:[I

    .line 314
    .line 315
    iget v4, p0, Lki4;->q:I

    .line 316
    .line 317
    invoke-static {v3, v4, v0, v1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 318
    .line 319
    .line 320
    iget-object v3, p0, Lki4;->n:[Lig1;

    .line 321
    .line 322
    iget v4, p0, Lki4;->q:I

    .line 323
    .line 324
    invoke-static {v3, v4, v2, v1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 325
    .line 326
    .line 327
    iget-object v3, p0, Lki4;->i:[J

    .line 328
    .line 329
    iget v4, p0, Lki4;->q:I

    .line 330
    .line 331
    invoke-static {v3, v4, p3, v1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 332
    .line 333
    .line 334
    iget v3, p0, Lki4;->q:I

    .line 335
    .line 336
    iget-object v4, p0, Lki4;->j:[J

    .line 337
    .line 338
    invoke-static {v4, v1, p4, p2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 339
    .line 340
    .line 341
    iget-object v4, p0, Lki4;->m:[J

    .line 342
    .line 343
    invoke-static {v4, v1, p5, p2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 344
    .line 345
    .line 346
    iget-object v4, p0, Lki4;->l:[I

    .line 347
    .line 348
    invoke-static {v4, v1, p6, p2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 349
    .line 350
    .line 351
    iget-object v4, p0, Lki4;->k:[I

    .line 352
    .line 353
    invoke-static {v4, v1, v0, p2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 354
    .line 355
    .line 356
    iget-object v4, p0, Lki4;->n:[Lig1;

    .line 357
    .line 358
    invoke-static {v4, v1, v2, p2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 359
    .line 360
    .line 361
    iget-object v4, p0, Lki4;->i:[J

    .line 362
    .line 363
    invoke-static {v4, v1, p3, p2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 364
    .line 365
    .line 366
    iput-object p4, p0, Lki4;->j:[J

    .line 367
    .line 368
    iput-object p5, p0, Lki4;->m:[J

    .line 369
    .line 370
    iput-object p6, p0, Lki4;->l:[I

    .line 371
    .line 372
    iput-object v0, p0, Lki4;->k:[I

    .line 373
    .line 374
    iput-object v2, p0, Lki4;->n:[Lig1;

    .line 375
    .line 376
    iput-object p3, p0, Lki4;->i:[J

    .line 377
    .line 378
    iput v1, p0, Lki4;->q:I

    .line 379
    .line 380
    iput p1, p0, Lki4;->h:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 381
    .line 382
    monitor-exit p0

    .line 383
    return-void

    .line 384
    :cond_f
    monitor-exit p0

    .line 385
    return-void

    .line 386
    :cond_10
    const/4 p1, 0x0

    .line 387
    :try_start_1
    throw p1

    .line 388
    :goto_8
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 389
    throw p1
.end method

.method public final d(Lph4;)V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x0

    .line 3
    :try_start_0
    iput-boolean v0, p0, Lki4;->x:Z

    .line 4
    .line 5
    iget-object v1, p0, Lki4;->y:Lph4;

    .line 6
    .line 7
    invoke-static {p1, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    monitor-exit p0

    .line 14
    goto :goto_2

    .line 15
    :cond_0
    :try_start_1
    iget-object v1, p0, Lki4;->c:Lso1;

    .line 16
    .line 17
    iget-object v2, v1, Lso1;->g:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Landroid/util/SparseArray;

    .line 20
    .line 21
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/4 v3, 0x1

    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    move v2, v3

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move v2, v0

    .line 31
    :goto_0
    if-nez v2, :cond_2

    .line 32
    .line 33
    iget-object v2, v1, Lso1;->g:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v2, Landroid/util/SparseArray;

    .line 36
    .line 37
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    add-int/lit8 v4, v4, -0x1

    .line 42
    .line 43
    invoke-virtual {v2, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Lji4;

    .line 48
    .line 49
    iget-object v2, v2, Lji4;->a:Lph4;

    .line 50
    .line 51
    invoke-virtual {v2, p1}, Lph4;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_2

    .line 56
    .line 57
    iget-object p1, v1, Lso1;->g:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p1, Landroid/util/SparseArray;

    .line 60
    .line 61
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    add-int/lit8 v1, v1, -0x1

    .line 66
    .line 67
    invoke-virtual {p1, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    check-cast p1, Lji4;

    .line 72
    .line 73
    iget-object p1, p1, Lji4;->a:Lph4;

    .line 74
    .line 75
    iput-object p1, p0, Lki4;->y:Lph4;

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :catchall_0
    move-exception p1

    .line 79
    goto :goto_3

    .line 80
    :cond_2
    iput-object p1, p0, Lki4;->y:Lph4;

    .line 81
    .line 82
    :goto_1
    iget-boolean p1, p0, Lki4;->z:Z

    .line 83
    .line 84
    iget-object v1, p0, Lki4;->y:Lph4;

    .line 85
    .line 86
    iget-object v2, v1, Lph4;->m:Ljava/lang/String;

    .line 87
    .line 88
    iget-object v1, v1, Lph4;->j:Ljava/lang/String;

    .line 89
    .line 90
    invoke-static {v2, v1}, Lpp1;->d(Ljava/lang/String;Ljava/lang/String;)Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    and-int/2addr p1, v1

    .line 95
    iput-boolean p1, p0, Lki4;->z:Z

    .line 96
    .line 97
    iput-boolean v0, p0, Lki4;->A:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 98
    .line 99
    monitor-exit p0

    .line 100
    move v0, v3

    .line 101
    :goto_2
    iget-object p1, p0, Lki4;->e:Lbi4;

    .line 102
    .line 103
    if-eqz p1, :cond_3

    .line 104
    .line 105
    if-eqz v0, :cond_3

    .line 106
    .line 107
    iget-object v0, p1, Lbi4;->t:Landroid/os/Handler;

    .line 108
    .line 109
    iget-object p1, p1, Lbi4;->r:Lyh4;

    .line 110
    .line 111
    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 112
    .line 113
    .line 114
    :cond_3
    return-void

    .line 115
    :goto_3
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 116
    throw p1
.end method

.method public final e(Lph4;Lmr2;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lki4;->f:Lph4;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    move-object v2, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v2, v0, Lph4;->q:Lie4;

    .line 9
    .line 10
    :goto_0
    iput-object p1, p0, Lki4;->f:Lph4;

    .line 11
    .line 12
    iget-object v3, p1, Lph4;->q:Lie4;

    .line 13
    .line 14
    iget-object v4, p0, Lki4;->d:Lpz;

    .line 15
    .line 16
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    const/4 v4, 0x1

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    const/4 v4, 0x0

    .line 24
    :goto_1
    new-instance v5, Lgg4;

    .line 25
    .line 26
    invoke-direct {v5, p1}, Lgg4;-><init>(Lph4;)V

    .line 27
    .line 28
    .line 29
    iput v4, v5, Lgg4;->K:I

    .line 30
    .line 31
    new-instance p1, Lph4;

    .line 32
    .line 33
    invoke-direct {p1, v5}, Lph4;-><init>(Lgg4;)V

    .line 34
    .line 35
    .line 36
    iput-object p1, p2, Lmr2;->h:Ljava/lang/Object;

    .line 37
    .line 38
    iget-object p1, p0, Lki4;->g:Lci3;

    .line 39
    .line 40
    iput-object p1, p2, Lmr2;->g:Ljava/lang/Object;

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    return-void

    .line 51
    :cond_2
    if-nez v3, :cond_3

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_3
    new-instance v1, Lci3;

    .line 55
    .line 56
    new-instance p1, Lif4;

    .line 57
    .line 58
    new-instance v0, Lrf4;

    .line 59
    .line 60
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-direct {p1, v0}, Lif4;-><init>(Lrf4;)V

    .line 64
    .line 65
    .line 66
    const/4 v0, 0x7

    .line 67
    invoke-direct {v1, v0, p1}, Lci3;-><init>(ILjava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :goto_2
    iput-object v1, p0, Lki4;->g:Lci3;

    .line 71
    .line 72
    iput-object v1, p2, Lmr2;->g:Ljava/lang/Object;

    .line 73
    .line 74
    return-void
.end method

.method public final f(IIJZ)I
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, -0x1

    .line 3
    move v2, v0

    .line 4
    :goto_0
    if-ge v2, p2, :cond_4

    .line 5
    .line 6
    iget-object v3, p0, Lki4;->m:[J

    .line 7
    .line 8
    aget-wide v4, v3, p1

    .line 9
    .line 10
    cmp-long v3, v4, p3

    .line 11
    .line 12
    if-gtz v3, :cond_4

    .line 13
    .line 14
    if-eqz p5, :cond_0

    .line 15
    .line 16
    iget-object v4, p0, Lki4;->l:[I

    .line 17
    .line 18
    aget v4, v4, p1

    .line 19
    .line 20
    and-int/lit8 v4, v4, 0x1

    .line 21
    .line 22
    if-eqz v4, :cond_2

    .line 23
    .line 24
    :cond_0
    if-nez v3, :cond_1

    .line 25
    .line 26
    return v2

    .line 27
    :cond_1
    move v1, v2

    .line 28
    :cond_2
    add-int/lit8 p1, p1, 0x1

    .line 29
    .line 30
    iget v3, p0, Lki4;->h:I

    .line 31
    .line 32
    if-ne p1, v3, :cond_3

    .line 33
    .line 34
    move p1, v0

    .line 35
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_4
    return v1
.end method

.method public final g(I)J
    .locals 11

    .line 1
    iget-wide v0, p0, Lki4;->t:J

    .line 2
    .line 3
    const-wide/high16 v2, -0x8000000000000000L

    .line 4
    .line 5
    const/4 v4, 0x0

    .line 6
    const/4 v5, -0x1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    add-int/lit8 v6, p1, -0x1

    .line 11
    .line 12
    invoke-virtual {p0, v6}, Lki4;->h(I)I

    .line 13
    .line 14
    .line 15
    move-result v6

    .line 16
    move v7, v4

    .line 17
    :goto_0
    if-ge v7, p1, :cond_3

    .line 18
    .line 19
    iget-object v8, p0, Lki4;->m:[J

    .line 20
    .line 21
    aget-wide v9, v8, v6

    .line 22
    .line 23
    invoke-static {v2, v3, v9, v10}, Ljava/lang/Math;->max(JJ)J

    .line 24
    .line 25
    .line 26
    move-result-wide v2

    .line 27
    iget-object v8, p0, Lki4;->l:[I

    .line 28
    .line 29
    aget v8, v8, v6

    .line 30
    .line 31
    and-int/lit8 v8, v8, 0x1

    .line 32
    .line 33
    if-eqz v8, :cond_1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    add-int/lit8 v6, v6, -0x1

    .line 37
    .line 38
    if-ne v6, v5, :cond_2

    .line 39
    .line 40
    iget v6, p0, Lki4;->h:I

    .line 41
    .line 42
    add-int/2addr v6, v5

    .line 43
    :cond_2
    add-int/lit8 v7, v7, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    :goto_1
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 47
    .line 48
    .line 49
    move-result-wide v0

    .line 50
    iput-wide v0, p0, Lki4;->t:J

    .line 51
    .line 52
    iget v0, p0, Lki4;->o:I

    .line 53
    .line 54
    sub-int/2addr v0, p1

    .line 55
    iput v0, p0, Lki4;->o:I

    .line 56
    .line 57
    iget v0, p0, Lki4;->p:I

    .line 58
    .line 59
    add-int/2addr v0, p1

    .line 60
    iput v0, p0, Lki4;->p:I

    .line 61
    .line 62
    iget v1, p0, Lki4;->q:I

    .line 63
    .line 64
    add-int/2addr v1, p1

    .line 65
    iput v1, p0, Lki4;->q:I

    .line 66
    .line 67
    iget v2, p0, Lki4;->h:I

    .line 68
    .line 69
    if-lt v1, v2, :cond_4

    .line 70
    .line 71
    sub-int/2addr v1, v2

    .line 72
    iput v1, p0, Lki4;->q:I

    .line 73
    .line 74
    :cond_4
    iget v1, p0, Lki4;->r:I

    .line 75
    .line 76
    sub-int/2addr v1, p1

    .line 77
    iput v1, p0, Lki4;->r:I

    .line 78
    .line 79
    if-gez v1, :cond_5

    .line 80
    .line 81
    iput v4, p0, Lki4;->r:I

    .line 82
    .line 83
    :cond_5
    :goto_2
    iget-object p1, p0, Lki4;->c:Lso1;

    .line 84
    .line 85
    iget-object v1, p1, Lso1;->g:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v1, Landroid/util/SparseArray;

    .line 88
    .line 89
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    add-int/2addr v2, v5

    .line 94
    if-ge v4, v2, :cond_7

    .line 95
    .line 96
    add-int/lit8 v2, v4, 0x1

    .line 97
    .line 98
    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->keyAt(I)I

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    if-lt v0, v3, :cond_7

    .line 103
    .line 104
    iget-object v3, p1, Lso1;->h:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v3, Lhd4;

    .line 107
    .line 108
    invoke-virtual {v1, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    invoke-virtual {v3, v6}, Lhd4;->c(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1, v4}, Landroid/util/SparseArray;->removeAt(I)V

    .line 116
    .line 117
    .line 118
    iget v1, p1, Lso1;->f:I

    .line 119
    .line 120
    if-lez v1, :cond_6

    .line 121
    .line 122
    add-int/lit8 v1, v1, -0x1

    .line 123
    .line 124
    iput v1, p1, Lso1;->f:I

    .line 125
    .line 126
    :cond_6
    move v4, v2

    .line 127
    goto :goto_2

    .line 128
    :cond_7
    iget p1, p0, Lki4;->o:I

    .line 129
    .line 130
    if-nez p1, :cond_9

    .line 131
    .line 132
    iget p1, p0, Lki4;->q:I

    .line 133
    .line 134
    if-nez p1, :cond_8

    .line 135
    .line 136
    iget p1, p0, Lki4;->h:I

    .line 137
    .line 138
    :cond_8
    add-int/2addr p1, v5

    .line 139
    iget-object v0, p0, Lki4;->j:[J

    .line 140
    .line 141
    aget-wide v1, v0, p1

    .line 142
    .line 143
    iget-object v0, p0, Lki4;->k:[I

    .line 144
    .line 145
    aget p1, v0, p1

    .line 146
    .line 147
    int-to-long v3, p1

    .line 148
    add-long/2addr v1, v3

    .line 149
    return-wide v1

    .line 150
    :cond_9
    iget-object p1, p0, Lki4;->j:[J

    .line 151
    .line 152
    iget v0, p0, Lki4;->q:I

    .line 153
    .line 154
    aget-wide v0, p1, v0

    .line 155
    .line 156
    return-wide v0
.end method

.method public final h(I)I
    .locals 1

    .line 1
    iget v0, p0, Lki4;->q:I

    .line 2
    .line 3
    add-int/2addr v0, p1

    .line 4
    iget p1, p0, Lki4;->h:I

    .line 5
    .line 6
    if-ge v0, p1, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    sub-int/2addr v0, p1

    .line 10
    return v0
.end method

.method public final i(Z)V
    .locals 11

    .line 1
    iget-object v0, p0, Lki4;->a:Lii4;

    .line 2
    .line 3
    iget-object v1, v0, Lii4;->a:Lrj4;

    .line 4
    .line 5
    iget-object v2, v0, Lii4;->c:Lcj1;

    .line 6
    .line 7
    iget-object v3, v2, Lcj1;->h:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, Lqj4;

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    invoke-interface {v1, v2}, Lrj4;->b(Lcj1;)V

    .line 15
    .line 16
    .line 17
    iput-object v4, v2, Lcj1;->h:Ljava/lang/Object;

    .line 18
    .line 19
    iput-object v4, v2, Lcj1;->i:Ljava/lang/Object;

    .line 20
    .line 21
    :cond_0
    iget-object v2, v0, Lii4;->c:Lcj1;

    .line 22
    .line 23
    iget-object v3, v2, Lcj1;->h:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v3, Lqj4;

    .line 26
    .line 27
    const/4 v5, 0x1

    .line 28
    const/4 v6, 0x0

    .line 29
    if-nez v3, :cond_1

    .line 30
    .line 31
    move v3, v5

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    move v3, v6

    .line 34
    :goto_0
    invoke-static {v3}, Lzt0;->b0(Z)V

    .line 35
    .line 36
    .line 37
    const-wide/16 v7, 0x0

    .line 38
    .line 39
    iput-wide v7, v2, Lcj1;->f:J

    .line 40
    .line 41
    const-wide/32 v9, 0x10000

    .line 42
    .line 43
    .line 44
    iput-wide v9, v2, Lcj1;->g:J

    .line 45
    .line 46
    iget-object v2, v0, Lii4;->c:Lcj1;

    .line 47
    .line 48
    iput-object v2, v0, Lii4;->d:Lcj1;

    .line 49
    .line 50
    iput-object v2, v0, Lii4;->e:Lcj1;

    .line 51
    .line 52
    iput-wide v7, v0, Lii4;->f:J

    .line 53
    .line 54
    invoke-interface {v1}, Lrj4;->l()V

    .line 55
    .line 56
    .line 57
    iput v6, p0, Lki4;->o:I

    .line 58
    .line 59
    iput v6, p0, Lki4;->p:I

    .line 60
    .line 61
    iput v6, p0, Lki4;->q:I

    .line 62
    .line 63
    iput v6, p0, Lki4;->r:I

    .line 64
    .line 65
    iput-boolean v5, p0, Lki4;->w:Z

    .line 66
    .line 67
    const-wide/high16 v0, -0x8000000000000000L

    .line 68
    .line 69
    iput-wide v0, p0, Lki4;->s:J

    .line 70
    .line 71
    iput-wide v0, p0, Lki4;->t:J

    .line 72
    .line 73
    iput-wide v0, p0, Lki4;->u:J

    .line 74
    .line 75
    iput-boolean v6, p0, Lki4;->v:Z

    .line 76
    .line 77
    :goto_1
    iget-object v0, p0, Lki4;->c:Lso1;

    .line 78
    .line 79
    iget-object v1, v0, Lso1;->g:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v1, Landroid/util/SparseArray;

    .line 82
    .line 83
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-ge v6, v2, :cond_2

    .line 88
    .line 89
    iget-object v0, v0, Lso1;->h:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v0, Lhd4;

    .line 92
    .line 93
    invoke-virtual {v1, v6}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {v0, v1}, Lhd4;->c(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    add-int/lit8 v6, v6, 0x1

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_2
    const/4 v2, -0x1

    .line 104
    iput v2, v0, Lso1;->f:I

    .line 105
    .line 106
    invoke-virtual {v1}, Landroid/util/SparseArray;->clear()V

    .line 107
    .line 108
    .line 109
    if-eqz p1, :cond_3

    .line 110
    .line 111
    iput-object v4, p0, Lki4;->y:Lph4;

    .line 112
    .line 113
    iput-boolean v5, p0, Lki4;->x:Z

    .line 114
    .line 115
    iput-boolean v5, p0, Lki4;->z:Z

    .line 116
    .line 117
    :cond_3
    return-void
.end method

.method public final declared-synchronized j(Z)Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Lki4;->r:I

    .line 3
    .line 4
    iget v1, p0, Lki4;->o:I

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x1

    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    move v1, v3

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v1, v2

    .line 13
    :goto_0
    if-nez v1, :cond_4

    .line 14
    .line 15
    if-nez p1, :cond_1

    .line 16
    .line 17
    iget-boolean p1, p0, Lki4;->v:Z

    .line 18
    .line 19
    if-nez p1, :cond_1

    .line 20
    .line 21
    iget-object p1, p0, Lki4;->y:Lph4;

    .line 22
    .line 23
    if-eqz p1, :cond_3

    .line 24
    .line 25
    iget-object v0, p0, Lki4;->f:Lph4;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    if-eq p1, v0, :cond_2

    .line 28
    .line 29
    :cond_1
    move v2, v3

    .line 30
    goto :goto_1

    .line 31
    :cond_2
    monitor-exit p0

    .line 32
    return v2

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    goto :goto_3

    .line 35
    :cond_3
    :goto_1
    monitor-exit p0

    .line 36
    return v2

    .line 37
    :cond_4
    :try_start_1
    iget-object p1, p0, Lki4;->c:Lso1;

    .line 38
    .line 39
    iget v1, p0, Lki4;->p:I

    .line 40
    .line 41
    add-int/2addr v1, v0

    .line 42
    invoke-virtual {p1, v1}, Lso1;->n(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    check-cast p1, Lji4;

    .line 47
    .line 48
    iget-object p1, p1, Lji4;->a:Lph4;

    .line 49
    .line 50
    iget-object v0, p0, Lki4;->f:Lph4;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    .line 52
    if-eq p1, v0, :cond_5

    .line 53
    .line 54
    monitor-exit p0

    .line 55
    return v3

    .line 56
    :cond_5
    :try_start_2
    iget p1, p0, Lki4;->r:I

    .line 57
    .line 58
    invoke-virtual {p0, p1}, Lki4;->h(I)I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    iget-object v0, p0, Lki4;->g:Lci3;

    .line 63
    .line 64
    if-eqz v0, :cond_6

    .line 65
    .line 66
    iget-object v0, p0, Lki4;->l:[I

    .line 67
    .line 68
    aget p1, v0, p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_6
    move v2, v3

    .line 72
    :goto_2
    monitor-exit p0

    .line 73
    return v2

    .line 74
    :goto_3
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 75
    throw p1
.end method

.method public final declared-synchronized k(JZ)Z
    .locals 10

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 3
    const/4 v0, 0x0

    .line 4
    :try_start_1
    iput v0, p0, Lki4;->r:I

    .line 5
    .line 6
    iget-object v1, p0, Lki4;->a:Lii4;

    .line 7
    .line 8
    iget-object v2, v1, Lii4;->c:Lcj1;

    .line 9
    .line 10
    iput-object v2, v1, Lii4;->d:Lcj1;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 11
    .line 12
    :try_start_2
    monitor-exit p0

    .line 13
    invoke-virtual {p0, v0}, Lki4;->h(I)I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    iget v1, p0, Lki4;->r:I

    .line 18
    .line 19
    iget v5, p0, Lki4;->o:I

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    if-eq v1, v5, :cond_0

    .line 23
    .line 24
    move v1, v2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v1, v0

    .line 27
    :goto_0
    if-eqz v1, :cond_1

    .line 28
    .line 29
    iget-object v1, p0, Lki4;->m:[J

    .line 30
    .line 31
    aget-wide v6, v1, v4

    .line 32
    .line 33
    cmp-long v1, p1, v6

    .line 34
    .line 35
    if-ltz v1, :cond_1

    .line 36
    .line 37
    iget-wide v6, p0, Lki4;->u:J

    .line 38
    .line 39
    cmp-long v1, p1, v6

    .line 40
    .line 41
    if-lez v1, :cond_2

    .line 42
    .line 43
    if-eqz p3, :cond_1

    .line 44
    .line 45
    move p3, v2

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move-object v3, p0

    .line 48
    goto :goto_5

    .line 49
    :cond_2
    :goto_1
    iget-boolean v1, p0, Lki4;->z:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 50
    .line 51
    const/4 v9, -0x1

    .line 52
    if-eqz v1, :cond_7

    .line 53
    .line 54
    move v1, v0

    .line 55
    :goto_2
    if-ge v1, v5, :cond_5

    .line 56
    .line 57
    :try_start_3
    iget-object v3, p0, Lki4;->m:[J

    .line 58
    .line 59
    aget-wide v6, v3, v4

    .line 60
    .line 61
    cmp-long v3, v6, p1

    .line 62
    .line 63
    if-gez v3, :cond_4

    .line 64
    .line 65
    add-int/lit8 v4, v4, 0x1

    .line 66
    .line 67
    iget v3, p0, Lki4;->h:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 68
    .line 69
    if-ne v4, v3, :cond_3

    .line 70
    .line 71
    move v4, v0

    .line 72
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :catchall_0
    move-exception v0

    .line 76
    move-object p1, v0

    .line 77
    move-object v3, p0

    .line 78
    goto :goto_7

    .line 79
    :cond_4
    move-object v3, p0

    .line 80
    move-wide v6, p1

    .line 81
    move v5, v1

    .line 82
    goto :goto_3

    .line 83
    :cond_5
    move-object v3, p0

    .line 84
    move-wide v6, p1

    .line 85
    if-eqz p3, :cond_6

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_6
    move v5, v9

    .line 89
    goto :goto_3

    .line 90
    :cond_7
    const/4 v8, 0x1

    .line 91
    move-object v3, p0

    .line 92
    move-wide v6, p1

    .line 93
    :try_start_4
    invoke-virtual/range {v3 .. v8}, Lki4;->f(IIJZ)I

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    :goto_3
    if-ne v5, v9, :cond_8

    .line 98
    .line 99
    goto :goto_5

    .line 100
    :cond_8
    iput-wide v6, v3, Lki4;->s:J

    .line 101
    .line 102
    iget p1, v3, Lki4;->r:I

    .line 103
    .line 104
    add-int/2addr p1, v5

    .line 105
    iput p1, v3, Lki4;->r:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 106
    .line 107
    monitor-exit p0

    .line 108
    return v2

    .line 109
    :catchall_1
    move-exception v0

    .line 110
    :goto_4
    move-object p1, v0

    .line 111
    goto :goto_7

    .line 112
    :catchall_2
    move-exception v0

    .line 113
    move-object v3, p0

    .line 114
    goto :goto_4

    .line 115
    :goto_5
    monitor-exit p0

    .line 116
    return v0

    .line 117
    :catchall_3
    move-exception v0

    .line 118
    move-object v3, p0

    .line 119
    :goto_6
    move-object p1, v0

    .line 120
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 121
    :try_start_6
    throw p1

    .line 122
    :catchall_4
    move-exception v0

    .line 123
    goto :goto_6

    .line 124
    :goto_7
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 125
    throw p1
.end method

.method public final l()V
    .locals 3

    .line 1
    iget-object v0, p0, Lki4;->a:Lii4;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget v1, p0, Lki4;->o:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    monitor-exit p0

    .line 9
    const-wide/16 v1, -0x1

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    :try_start_1
    invoke-virtual {p0, v1}, Lki4;->g(I)J

    .line 13
    .line 14
    .line 15
    move-result-wide v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    monitor-exit p0

    .line 17
    :goto_0
    invoke-virtual {v0, v1, v2}, Lii4;->a(J)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 23
    throw v0
.end method
