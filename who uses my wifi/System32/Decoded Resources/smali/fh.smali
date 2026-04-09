.class public final Lfh;
.super Lda;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public D:Lba;

.field public final E:Ljava/util/ArrayList;

.field public final F:Landroid/graphics/RectF;

.field public final G:Landroid/graphics/RectF;

.field public final H:Landroid/graphics/RectF;

.field public final I:Lpi0;

.field public final J:Lt3;

.field public K:F

.field public L:Z

.field public final M:Lpq;


# direct methods
.method public constructor <init>(Li90;Lf50;Ljava/util/List;Lu80;)V
    .locals 10

    .line 1
    invoke-direct {p0, p1, p2}, Lda;-><init>(Li90;Lf50;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lfh;->E:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Landroid/graphics/RectF;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lfh;->F:Landroid/graphics/RectF;

    .line 17
    .line 18
    new-instance v0, Landroid/graphics/RectF;

    .line 19
    .line 20
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lfh;->G:Landroid/graphics/RectF;

    .line 24
    .line 25
    new-instance v0, Landroid/graphics/RectF;

    .line 26
    .line 27
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lfh;->H:Landroid/graphics/RectF;

    .line 31
    .line 32
    new-instance v0, Lpi0;

    .line 33
    .line 34
    invoke-direct {v0}, Lpi0;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Lfh;->I:Lpi0;

    .line 38
    .line 39
    new-instance v0, Lt3;

    .line 40
    .line 41
    const/4 v1, 0x4

    .line 42
    const/4 v2, 0x0

    .line 43
    invoke-direct {v0, v1, v2}, Lt3;-><init>(IB)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Lfh;->J:Lt3;

    .line 47
    .line 48
    const/4 v0, 0x1

    .line 49
    iput-boolean v0, p0, Lfh;->L:Z

    .line 50
    .line 51
    iget-object p2, p2, Lf50;->s:Lc4;

    .line 52
    .line 53
    const/4 v1, 0x0

    .line 54
    if-eqz p2, :cond_0

    .line 55
    .line 56
    invoke-virtual {p2}, Lc4;->U1()Lpu;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    iput-object p2, p0, Lfh;->D:Lba;

    .line 61
    .line 62
    invoke-virtual {p0, p2}, Lda;->e(Lba;)V

    .line 63
    .line 64
    .line 65
    iget-object p2, p0, Lfh;->D:Lba;

    .line 66
    .line 67
    invoke-virtual {p2, p0}, Lba;->a(Lx9;)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    iput-object v1, p0, Lfh;->D:Lba;

    .line 72
    .line 73
    :goto_0
    new-instance p2, Ll80;

    .line 74
    .line 75
    iget-object v2, p4, Lu80;->j:Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    invoke-direct {p2, v2}, Ll80;-><init>(I)V

    .line 82
    .line 83
    .line 84
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    sub-int/2addr v2, v0

    .line 89
    move-object v3, v1

    .line 90
    :goto_1
    const/4 v4, 0x0

    .line 91
    if-ltz v2, :cond_a

    .line 92
    .line 93
    invoke-interface {p3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    check-cast v5, Lf50;

    .line 98
    .line 99
    iget v6, v5, Lf50;->e:I

    .line 100
    .line 101
    invoke-static {v6}, Lex0;->s(I)I

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    const/4 v7, 0x2

    .line 106
    if-eqz v6, :cond_6

    .line 107
    .line 108
    if-eq v6, v0, :cond_5

    .line 109
    .line 110
    if-eq v6, v7, :cond_4

    .line 111
    .line 112
    const/4 v8, 0x3

    .line 113
    if-eq v6, v8, :cond_3

    .line 114
    .line 115
    const/4 v8, 0x4

    .line 116
    if-eq v6, v8, :cond_2

    .line 117
    .line 118
    const/4 v8, 0x5

    .line 119
    if-eq v6, v8, :cond_1

    .line 120
    .line 121
    iget v6, v5, Lf50;->e:I

    .line 122
    .line 123
    packed-switch v6, :pswitch_data_0

    .line 124
    .line 125
    .line 126
    const-string v6, "null"

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :pswitch_0
    const-string v6, "UNKNOWN"

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :pswitch_1
    const-string v6, "TEXT"

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :pswitch_2
    const-string v6, "SHAPE"

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :pswitch_3
    const-string v6, "NULL"

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :pswitch_4
    const-string v6, "IMAGE"

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :pswitch_5
    const-string v6, "SOLID"

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :pswitch_6
    const-string v6, "PRE_COMP"

    .line 148
    .line 149
    :goto_2
    const-string v8, "Unknown layer type "

    .line 150
    .line 151
    invoke-virtual {v8, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v6

    .line 155
    invoke-static {v6}, Lj80;->b(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    move-object v6, v1

    .line 159
    goto :goto_3

    .line 160
    :cond_1
    new-instance v6, Le11;

    .line 161
    .line 162
    invoke-direct {v6, p1, v5}, Le11;-><init>(Li90;Lf50;)V

    .line 163
    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_2
    new-instance v6, Ldv0;

    .line 167
    .line 168
    invoke-direct {v6, p1, v5, p0, p4}, Ldv0;-><init>(Li90;Lf50;Lfh;Lu80;)V

    .line 169
    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_3
    new-instance v6, Lii0;

    .line 173
    .line 174
    invoke-direct {v6, p1, v5}, Lda;-><init>(Li90;Lf50;)V

    .line 175
    .line 176
    .line 177
    goto :goto_3

    .line 178
    :cond_4
    new-instance v6, Lh20;

    .line 179
    .line 180
    invoke-direct {v6, p1, v5}, Lh20;-><init>(Li90;Lf50;)V

    .line 181
    .line 182
    .line 183
    goto :goto_3

    .line 184
    :cond_5
    new-instance v6, Ldx0;

    .line 185
    .line 186
    invoke-direct {v6, p1, v5}, Ldx0;-><init>(Li90;Lf50;)V

    .line 187
    .line 188
    .line 189
    goto :goto_3

    .line 190
    :cond_6
    new-instance v6, Lfh;

    .line 191
    .line 192
    iget-object v8, v5, Lf50;->g:Ljava/lang/String;

    .line 193
    .line 194
    iget-object v9, p4, Lu80;->c:Ljava/util/HashMap;

    .line 195
    .line 196
    invoke-virtual {v9, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v8

    .line 200
    check-cast v8, Ljava/util/List;

    .line 201
    .line 202
    invoke-direct {v6, p1, v5, v8, p4}, Lfh;-><init>(Li90;Lf50;Ljava/util/List;Lu80;)V

    .line 203
    .line 204
    .line 205
    :goto_3
    if-nez v6, :cond_7

    .line 206
    .line 207
    goto :goto_4

    .line 208
    :cond_7
    iget-object v8, v6, Lda;->p:Lf50;

    .line 209
    .line 210
    iget-wide v8, v8, Lf50;->d:J

    .line 211
    .line 212
    invoke-virtual {p2, v8, v9, v6}, Ll80;->e(JLjava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    if-eqz v3, :cond_8

    .line 216
    .line 217
    iput-object v6, v3, Lda;->s:Lda;

    .line 218
    .line 219
    move-object v3, v1

    .line 220
    goto :goto_4

    .line 221
    :cond_8
    iget-object v8, p0, Lfh;->E:Ljava/util/ArrayList;

    .line 222
    .line 223
    invoke-virtual {v8, v4, v6}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    iget v4, v5, Lf50;->u:I

    .line 227
    .line 228
    invoke-static {v4}, Lex0;->s(I)I

    .line 229
    .line 230
    .line 231
    move-result v4

    .line 232
    if-eq v4, v0, :cond_9

    .line 233
    .line 234
    if-eq v4, v7, :cond_9

    .line 235
    .line 236
    goto :goto_4

    .line 237
    :cond_9
    move-object v3, v6

    .line 238
    :goto_4
    add-int/lit8 v2, v2, -0x1

    .line 239
    .line 240
    goto/16 :goto_1

    .line 241
    .line 242
    :cond_a
    :goto_5
    invoke-virtual {p2}, Ll80;->f()I

    .line 243
    .line 244
    .line 245
    move-result p1

    .line 246
    if-ge v4, p1, :cond_d

    .line 247
    .line 248
    invoke-virtual {p2, v4}, Ll80;->d(I)J

    .line 249
    .line 250
    .line 251
    move-result-wide p3

    .line 252
    invoke-virtual {p2, p3, p4}, Ll80;->b(J)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    check-cast p1, Lda;

    .line 257
    .line 258
    if-nez p1, :cond_b

    .line 259
    .line 260
    goto :goto_6

    .line 261
    :cond_b
    iget-object p3, p1, Lda;->p:Lf50;

    .line 262
    .line 263
    iget-wide p3, p3, Lf50;->f:J

    .line 264
    .line 265
    invoke-virtual {p2, p3, p4}, Ll80;->b(J)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object p3

    .line 269
    check-cast p3, Lda;

    .line 270
    .line 271
    if-eqz p3, :cond_c

    .line 272
    .line 273
    iput-object p3, p1, Lda;->t:Lda;

    .line 274
    .line 275
    :cond_c
    :goto_6
    add-int/lit8 v4, v4, 0x1

    .line 276
    .line 277
    goto :goto_5

    .line 278
    :cond_d
    iget-object p1, p0, Lda;->p:Lf50;

    .line 279
    .line 280
    iget-object p1, p1, Lf50;->x:Lg4;

    .line 281
    .line 282
    if-eqz p1, :cond_e

    .line 283
    .line 284
    new-instance p2, Lpq;

    .line 285
    .line 286
    invoke-direct {p2, p0, p0, p1}, Lpq;-><init>(Lda;Lda;Lg4;)V

    .line 287
    .line 288
    .line 289
    iput-object p2, p0, Lfh;->M:Lpq;

    .line 290
    .line 291
    :cond_e
    return-void

    .line 292
    nop

    .line 293
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lvq2;)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, Lda;->a(Ljava/lang/Object;Lvq2;)V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ln90;->z:Ljava/lang/Float;

    .line 5
    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    new-instance p1, Lm41;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-direct {p1, v0, p2}, Lm41;-><init>(Ljava/lang/Object;Lvq2;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lfh;->D:Lba;

    .line 15
    .line 16
    invoke-virtual {p1, p0}, Lba;->a(Lx9;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lfh;->D:Lba;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lda;->e(Lba;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    const/4 v0, 0x5

    .line 26
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v1, p0, Lfh;->M:Lpq;

    .line 31
    .line 32
    if-ne p1, v0, :cond_1

    .line 33
    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    iget-object p1, v1, Lpq;->c:Lfg;

    .line 37
    .line 38
    invoke-virtual {p1, p2}, Lba;->j(Lvq2;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    sget-object v0, Ln90;->B:Ljava/lang/Float;

    .line 43
    .line 44
    if-ne p1, v0, :cond_2

    .line 45
    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    invoke-virtual {v1, p2}, Lpq;->b(Lvq2;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_2
    sget-object v0, Ln90;->C:Ljava/lang/Float;

    .line 53
    .line 54
    if-ne p1, v0, :cond_3

    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    iget-object p1, v1, Lpq;->e:Lpu;

    .line 59
    .line 60
    invoke-virtual {p1, p2}, Lba;->j(Lvq2;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_3
    sget-object v0, Ln90;->D:Ljava/lang/Float;

    .line 65
    .line 66
    if-ne p1, v0, :cond_4

    .line 67
    .line 68
    if-eqz v1, :cond_4

    .line 69
    .line 70
    iget-object p1, v1, Lpq;->f:Lpu;

    .line 71
    .line 72
    invoke-virtual {p1, p2}, Lba;->j(Lvq2;)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_4
    sget-object v0, Ln90;->E:Ljava/lang/Float;

    .line 77
    .line 78
    if-ne p1, v0, :cond_5

    .line 79
    .line 80
    if-eqz v1, :cond_5

    .line 81
    .line 82
    iget-object p1, v1, Lpq;->g:Lpu;

    .line 83
    .line 84
    invoke-virtual {p1, p2}, Lba;->j(Lvq2;)V

    .line 85
    .line 86
    .line 87
    :cond_5
    return-void
.end method

.method public final b(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V
    .locals 4

    .line 1
    invoke-super {p0, p1, p2, p3}, Lda;->b(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, Lfh;->E:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result p3

    .line 10
    const/4 v0, 0x1

    .line 11
    sub-int/2addr p3, v0

    .line 12
    :goto_0
    if-ltz p3, :cond_0

    .line 13
    .line 14
    iget-object v1, p0, Lfh;->F:Landroid/graphics/RectF;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-virtual {v1, v2, v2, v2, v2}, Landroid/graphics/RectF;->set(FFFF)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Lda;

    .line 25
    .line 26
    iget-object v3, p0, Lda;->n:Landroid/graphics/Matrix;

    .line 27
    .line 28
    invoke-virtual {v2, v1, v3, v0}, Lda;->b(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v1}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    .line 32
    .line 33
    .line 34
    add-int/lit8 p3, p3, -0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    return-void
.end method

.method public final k(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILmq;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lfh;->M:Lpq;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-nez p4, :cond_1

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v3, v1

    .line 11
    goto :goto_1

    .line 12
    :cond_1
    :goto_0
    move v3, v2

    .line 13
    :goto_1
    iget-object v4, p0, Lda;->o:Li90;

    .line 14
    .line 15
    iget-boolean v5, v4, Li90;->x:Z

    .line 16
    .line 17
    const/16 v6, 0xff

    .line 18
    .line 19
    iget-object v7, p0, Lfh;->E:Ljava/util/ArrayList;

    .line 20
    .line 21
    if-eqz v5, :cond_2

    .line 22
    .line 23
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-le v5, v2, :cond_2

    .line 28
    .line 29
    if-ne p3, v6, :cond_3

    .line 30
    .line 31
    :cond_2
    if-eqz v3, :cond_4

    .line 32
    .line 33
    iget-boolean v3, v4, Li90;->y:Z

    .line 34
    .line 35
    if-eqz v3, :cond_4

    .line 36
    .line 37
    :cond_3
    move v3, v2

    .line 38
    goto :goto_2

    .line 39
    :cond_4
    move v3, v1

    .line 40
    :goto_2
    if-eqz v3, :cond_5

    .line 41
    .line 42
    goto :goto_3

    .line 43
    :cond_5
    move v6, p3

    .line 44
    :goto_3
    if-eqz v0, :cond_6

    .line 45
    .line 46
    invoke-virtual {v0, p2, v6}, Lpq;->a(Landroid/graphics/Matrix;I)Lmq;

    .line 47
    .line 48
    .line 49
    move-result-object p4

    .line 50
    :cond_6
    iget-boolean v0, p0, Lfh;->L:Z

    .line 51
    .line 52
    iget-object v4, p0, Lda;->p:Lf50;

    .line 53
    .line 54
    iget-object v5, p0, Lfh;->G:Landroid/graphics/RectF;

    .line 55
    .line 56
    if-nez v0, :cond_7

    .line 57
    .line 58
    const-string v0, "__container"

    .line 59
    .line 60
    iget-object v8, v4, Lf50;->c:Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_7

    .line 67
    .line 68
    invoke-virtual {v5}, Landroid/graphics/RectF;->setEmpty()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    :goto_4
    if-ge v1, v0, :cond_8

    .line 76
    .line 77
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    add-int/lit8 v1, v1, 0x1

    .line 82
    .line 83
    check-cast v4, Lda;

    .line 84
    .line 85
    iget-object v8, p0, Lfh;->H:Landroid/graphics/RectF;

    .line 86
    .line 87
    invoke-virtual {v4, v8, p2, v2}, Lda;->b(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v5, v8}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    .line 91
    .line 92
    .line 93
    goto :goto_4

    .line 94
    :cond_7
    iget v0, v4, Lf50;->o:F

    .line 95
    .line 96
    iget v1, v4, Lf50;->p:F

    .line 97
    .line 98
    const/4 v4, 0x0

    .line 99
    invoke-virtual {v5, v4, v4, v0, v1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p2, v5}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 103
    .line 104
    .line 105
    :cond_8
    iget-object v0, p0, Lfh;->I:Lpi0;

    .line 106
    .line 107
    if-eqz v3, :cond_b

    .line 108
    .line 109
    iget-object v1, p0, Lfh;->J:Lt3;

    .line 110
    .line 111
    const/4 v4, 0x0

    .line 112
    iput-object v4, v1, Lt3;->h:Ljava/lang/Object;

    .line 113
    .line 114
    iput p3, v1, Lt3;->g:I

    .line 115
    .line 116
    if-eqz p4, :cond_a

    .line 117
    .line 118
    iget p3, p4, Lmq;->d:I

    .line 119
    .line 120
    invoke-static {p3}, Landroid/graphics/Color;->alpha(I)I

    .line 121
    .line 122
    .line 123
    move-result p3

    .line 124
    if-lez p3, :cond_9

    .line 125
    .line 126
    iput-object p4, v1, Lt3;->h:Ljava/lang/Object;

    .line 127
    .line 128
    goto :goto_5

    .line 129
    :cond_9
    iput-object v4, v1, Lt3;->h:Ljava/lang/Object;

    .line 130
    .line 131
    :goto_5
    move-object p4, v4

    .line 132
    :cond_a
    invoke-virtual {v0, p1, v5, v1}, Lpi0;->e(Landroid/graphics/Canvas;Landroid/graphics/RectF;Lt3;)Landroid/graphics/Canvas;

    .line 133
    .line 134
    .line 135
    move-result-object p3

    .line 136
    goto :goto_6

    .line 137
    :cond_b
    move-object p3, p1

    .line 138
    :goto_6
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1, v5}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;)Z

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    if-eqz v1, :cond_c

    .line 146
    .line 147
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    sub-int/2addr v1, v2

    .line 152
    :goto_7
    if-ltz v1, :cond_c

    .line 153
    .line 154
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    check-cast v2, Lda;

    .line 159
    .line 160
    invoke-virtual {v2, p3, p2, v6, p4}, Lda;->g(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILmq;)V

    .line 161
    .line 162
    .line 163
    add-int/lit8 v1, v1, -0x1

    .line 164
    .line 165
    goto :goto_7

    .line 166
    :cond_c
    if-eqz v3, :cond_d

    .line 167
    .line 168
    invoke-virtual {v0}, Lpi0;->c()V

    .line 169
    .line 170
    .line 171
    :cond_d
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 172
    .line 173
    .line 174
    return-void
.end method

.method public final p(Lt40;ILjava/util/ArrayList;Lt40;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lfh;->E:Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-ge v0, v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Lda;

    .line 15
    .line 16
    invoke-virtual {v1, p1, p2, p3, p4}, Lda;->h(Lt40;ILjava/util/ArrayList;Lt40;)V

    .line 17
    .line 18
    .line 19
    add-int/lit8 v0, v0, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-void
.end method

.method public final q(Z)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Lda;->q(Z)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lfh;->E:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    :goto_0
    if-ge v2, v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    add-int/lit8 v2, v2, 0x1

    .line 18
    .line 19
    check-cast v3, Lda;

    .line 20
    .line 21
    invoke-virtual {v3, p1}, Lda;->q(Z)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
.end method

.method public final r(F)V
    .locals 4

    .line 1
    iput p1, p0, Lfh;->K:F

    .line 2
    .line 3
    invoke-super {p0, p1}, Lda;->r(F)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lfh;->D:Lba;

    .line 7
    .line 8
    iget-object v1, p0, Lda;->p:Lf50;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object p1, p0, Lda;->o:Li90;

    .line 13
    .line 14
    iget-object p1, p1, Li90;->f:Lu80;

    .line 15
    .line 16
    iget v2, p1, Lu80;->m:F

    .line 17
    .line 18
    iget p1, p1, Lu80;->l:F

    .line 19
    .line 20
    sub-float/2addr v2, p1

    .line 21
    const p1, 0x3c23d70a    # 0.01f

    .line 22
    .line 23
    .line 24
    add-float/2addr v2, p1

    .line 25
    iget-object p1, v1, Lf50;->b:Lu80;

    .line 26
    .line 27
    iget p1, p1, Lu80;->l:F

    .line 28
    .line 29
    invoke-virtual {v0}, Lba;->e()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Ljava/lang/Float;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    iget-object v3, v1, Lf50;->b:Lu80;

    .line 40
    .line 41
    iget v3, v3, Lu80;->n:F

    .line 42
    .line 43
    mul-float/2addr v0, v3

    .line 44
    sub-float/2addr v0, p1

    .line 45
    div-float p1, v0, v2

    .line 46
    .line 47
    :cond_0
    iget-object v0, p0, Lfh;->D:Lba;

    .line 48
    .line 49
    if-nez v0, :cond_1

    .line 50
    .line 51
    iget v0, v1, Lf50;->n:F

    .line 52
    .line 53
    iget-object v2, v1, Lf50;->b:Lu80;

    .line 54
    .line 55
    iget v3, v2, Lu80;->m:F

    .line 56
    .line 57
    iget v2, v2, Lu80;->l:F

    .line 58
    .line 59
    sub-float/2addr v3, v2

    .line 60
    div-float/2addr v0, v3

    .line 61
    sub-float/2addr p1, v0

    .line 62
    :cond_1
    iget v0, v1, Lf50;->m:F

    .line 63
    .line 64
    const/4 v2, 0x0

    .line 65
    cmpl-float v0, v0, v2

    .line 66
    .line 67
    if-eqz v0, :cond_2

    .line 68
    .line 69
    const-string v0, "__container"

    .line 70
    .line 71
    iget-object v2, v1, Lf50;->c:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_2

    .line 78
    .line 79
    iget v0, v1, Lf50;->m:F

    .line 80
    .line 81
    div-float/2addr p1, v0

    .line 82
    :cond_2
    iget-object v0, p0, Lfh;->E:Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    add-int/lit8 v1, v1, -0x1

    .line 89
    .line 90
    :goto_0
    if-ltz v1, :cond_3

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    check-cast v2, Lda;

    .line 97
    .line 98
    invoke-virtual {v2, p1}, Lda;->r(F)V

    .line 99
    .line 100
    .line 101
    add-int/lit8 v1, v1, -0x1

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_3
    return-void
.end method
