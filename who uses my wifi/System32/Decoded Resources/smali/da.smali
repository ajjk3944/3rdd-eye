.class public abstract Lda;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lbq;
.implements Lx9;
.implements Lu40;


# instance fields
.field public A:F

.field public B:Landroid/graphics/BlurMaskFilter;

.field public C:Ld50;

.field public final a:Landroid/graphics/Path;

.field public final b:Landroid/graphics/Matrix;

.field public final c:Landroid/graphics/Matrix;

.field public final d:Ld50;

.field public final e:Ld50;

.field public final f:Ld50;

.field public final g:Ld50;

.field public final h:Ld50;

.field public final i:Landroid/graphics/RectF;

.field public final j:Landroid/graphics/RectF;

.field public final k:Landroid/graphics/RectF;

.field public final l:Landroid/graphics/RectF;

.field public final m:Landroid/graphics/RectF;

.field public final n:Landroid/graphics/Matrix;

.field public final o:Li90;

.field public final p:Lf50;

.field public final q:Lxb4;

.field public final r:Lpu;

.field public s:Lda;

.field public t:Lda;

.field public u:Ljava/util/List;

.field public final v:Ljava/util/ArrayList;

.field public final w:Lq21;

.field public x:Z

.field public y:Z

.field public z:Ld50;


# direct methods
.method public constructor <init>(Li90;Lf50;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Path;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lda;->a:Landroid/graphics/Path;

    .line 10
    .line 11
    new-instance v0, Landroid/graphics/Matrix;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lda;->b:Landroid/graphics/Matrix;

    .line 17
    .line 18
    new-instance v0, Landroid/graphics/Matrix;

    .line 19
    .line 20
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lda;->c:Landroid/graphics/Matrix;

    .line 24
    .line 25
    new-instance v0, Ld50;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    const/4 v2, 0x1

    .line 29
    invoke-direct {v0, v2, v1}, Ld50;-><init>(II)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lda;->d:Ld50;

    .line 33
    .line 34
    new-instance v0, Ld50;

    .line 35
    .line 36
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->DST_IN:Landroid/graphics/PorterDuff$Mode;

    .line 37
    .line 38
    invoke-direct {v0, v1}, Ld50;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Lda;->e:Ld50;

    .line 42
    .line 43
    new-instance v0, Ld50;

    .line 44
    .line 45
    sget-object v3, Landroid/graphics/PorterDuff$Mode;->DST_OUT:Landroid/graphics/PorterDuff$Mode;

    .line 46
    .line 47
    invoke-direct {v0, v3}, Ld50;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 48
    .line 49
    .line 50
    iput-object v0, p0, Lda;->f:Ld50;

    .line 51
    .line 52
    new-instance v0, Ld50;

    .line 53
    .line 54
    const/4 v4, 0x0

    .line 55
    invoke-direct {v0, v2, v4}, Ld50;-><init>(II)V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, Lda;->g:Ld50;

    .line 59
    .line 60
    new-instance v4, Ld50;

    .line 61
    .line 62
    sget-object v5, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 63
    .line 64
    invoke-direct {v4}, Ld50;-><init>()V

    .line 65
    .line 66
    .line 67
    new-instance v6, Landroid/graphics/PorterDuffXfermode;

    .line 68
    .line 69
    invoke-direct {v6, v5}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 73
    .line 74
    .line 75
    iput-object v4, p0, Lda;->h:Ld50;

    .line 76
    .line 77
    new-instance v4, Landroid/graphics/RectF;

    .line 78
    .line 79
    invoke-direct {v4}, Landroid/graphics/RectF;-><init>()V

    .line 80
    .line 81
    .line 82
    iput-object v4, p0, Lda;->i:Landroid/graphics/RectF;

    .line 83
    .line 84
    new-instance v4, Landroid/graphics/RectF;

    .line 85
    .line 86
    invoke-direct {v4}, Landroid/graphics/RectF;-><init>()V

    .line 87
    .line 88
    .line 89
    iput-object v4, p0, Lda;->j:Landroid/graphics/RectF;

    .line 90
    .line 91
    new-instance v4, Landroid/graphics/RectF;

    .line 92
    .line 93
    invoke-direct {v4}, Landroid/graphics/RectF;-><init>()V

    .line 94
    .line 95
    .line 96
    iput-object v4, p0, Lda;->k:Landroid/graphics/RectF;

    .line 97
    .line 98
    new-instance v4, Landroid/graphics/RectF;

    .line 99
    .line 100
    invoke-direct {v4}, Landroid/graphics/RectF;-><init>()V

    .line 101
    .line 102
    .line 103
    iput-object v4, p0, Lda;->l:Landroid/graphics/RectF;

    .line 104
    .line 105
    new-instance v4, Landroid/graphics/RectF;

    .line 106
    .line 107
    invoke-direct {v4}, Landroid/graphics/RectF;-><init>()V

    .line 108
    .line 109
    .line 110
    iput-object v4, p0, Lda;->m:Landroid/graphics/RectF;

    .line 111
    .line 112
    new-instance v4, Landroid/graphics/Matrix;

    .line 113
    .line 114
    invoke-direct {v4}, Landroid/graphics/Matrix;-><init>()V

    .line 115
    .line 116
    .line 117
    iput-object v4, p0, Lda;->n:Landroid/graphics/Matrix;

    .line 118
    .line 119
    new-instance v4, Ljava/util/ArrayList;

    .line 120
    .line 121
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 122
    .line 123
    .line 124
    iput-object v4, p0, Lda;->v:Ljava/util/ArrayList;

    .line 125
    .line 126
    iput-boolean v2, p0, Lda;->x:Z

    .line 127
    .line 128
    const/4 v4, 0x0

    .line 129
    iput v4, p0, Lda;->A:F

    .line 130
    .line 131
    iput-object p1, p0, Lda;->o:Li90;

    .line 132
    .line 133
    iput-object p2, p0, Lda;->p:Lf50;

    .line 134
    .line 135
    iget-object p1, p2, Lf50;->h:Ljava/util/List;

    .line 136
    .line 137
    iget v4, p2, Lf50;->u:I

    .line 138
    .line 139
    const/4 v5, 0x3

    .line 140
    if-ne v4, v5, :cond_0

    .line 141
    .line 142
    new-instance v1, Landroid/graphics/PorterDuffXfermode;

    .line 143
    .line 144
    invoke-direct {v1, v3}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 148
    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_0
    new-instance v3, Landroid/graphics/PorterDuffXfermode;

    .line 152
    .line 153
    invoke-direct {v3, v1}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 157
    .line 158
    .line 159
    :goto_0
    iget-object p2, p2, Lf50;->i:Lh4;

    .line 160
    .line 161
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    new-instance v0, Lq21;

    .line 165
    .line 166
    invoke-direct {v0, p2}, Lq21;-><init>(Lh4;)V

    .line 167
    .line 168
    .line 169
    iput-object v0, p0, Lda;->w:Lq21;

    .line 170
    .line 171
    invoke-virtual {v0, p0}, Lq21;->b(Lx9;)V

    .line 172
    .line 173
    .line 174
    const/4 p2, 0x0

    .line 175
    if-eqz p1, :cond_2

    .line 176
    .line 177
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    if-nez v0, :cond_2

    .line 182
    .line 183
    new-instance v0, Lxb4;

    .line 184
    .line 185
    const/4 v1, 0x6

    .line 186
    invoke-direct {v0, v1, p1}, Lxb4;-><init>(ILjava/util/List;)V

    .line 187
    .line 188
    .line 189
    iput-object v0, p0, Lda;->q:Lxb4;

    .line 190
    .line 191
    iget-object p1, v0, Lxb4;->g:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast p1, Ljava/util/ArrayList;

    .line 194
    .line 195
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    move v1, p2

    .line 200
    :goto_1
    if-ge v1, v0, :cond_1

    .line 201
    .line 202
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    add-int/lit8 v1, v1, 0x1

    .line 207
    .line 208
    check-cast v3, Lba;

    .line 209
    .line 210
    invoke-virtual {v3, p0}, Lba;->a(Lx9;)V

    .line 211
    .line 212
    .line 213
    goto :goto_1

    .line 214
    :cond_1
    iget-object p1, p0, Lda;->q:Lxb4;

    .line 215
    .line 216
    iget-object p1, p1, Lxb4;->h:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast p1, Ljava/util/ArrayList;

    .line 219
    .line 220
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    move v1, p2

    .line 225
    :goto_2
    if-ge v1, v0, :cond_2

    .line 226
    .line 227
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    add-int/lit8 v1, v1, 0x1

    .line 232
    .line 233
    check-cast v3, Lba;

    .line 234
    .line 235
    invoke-virtual {p0, v3}, Lda;->e(Lba;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v3, p0}, Lba;->a(Lx9;)V

    .line 239
    .line 240
    .line 241
    goto :goto_2

    .line 242
    :cond_2
    iget-object p1, p0, Lda;->p:Lf50;

    .line 243
    .line 244
    iget-object v0, p1, Lf50;->t:Ljava/util/List;

    .line 245
    .line 246
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 247
    .line 248
    .line 249
    move-result v0

    .line 250
    if-nez v0, :cond_5

    .line 251
    .line 252
    new-instance v0, Lpu;

    .line 253
    .line 254
    iget-object p1, p1, Lf50;->t:Ljava/util/List;

    .line 255
    .line 256
    invoke-direct {v0, p1}, Lba;-><init>(Ljava/util/List;)V

    .line 257
    .line 258
    .line 259
    iput-object v0, p0, Lda;->r:Lpu;

    .line 260
    .line 261
    iput-boolean v2, v0, Lba;->b:Z

    .line 262
    .line 263
    new-instance p1, Lca;

    .line 264
    .line 265
    invoke-direct {p1, p0}, Lca;-><init>(Lda;)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v0, p1}, Lba;->a(Lx9;)V

    .line 269
    .line 270
    .line 271
    iget-object p1, p0, Lda;->r:Lpu;

    .line 272
    .line 273
    invoke-virtual {p1}, Lba;->e()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    check-cast p1, Ljava/lang/Float;

    .line 278
    .line 279
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 280
    .line 281
    .line 282
    move-result p1

    .line 283
    const/high16 v0, 0x3f800000    # 1.0f

    .line 284
    .line 285
    cmpl-float p1, p1, v0

    .line 286
    .line 287
    if-nez p1, :cond_3

    .line 288
    .line 289
    goto :goto_3

    .line 290
    :cond_3
    move v2, p2

    .line 291
    :goto_3
    iget-boolean p1, p0, Lda;->x:Z

    .line 292
    .line 293
    if-eq v2, p1, :cond_4

    .line 294
    .line 295
    iput-boolean v2, p0, Lda;->x:Z

    .line 296
    .line 297
    iget-object p1, p0, Lda;->o:Li90;

    .line 298
    .line 299
    invoke-virtual {p1}, Li90;->invalidateSelf()V

    .line 300
    .line 301
    .line 302
    :cond_4
    iget-object p1, p0, Lda;->r:Lpu;

    .line 303
    .line 304
    invoke-virtual {p0, p1}, Lda;->e(Lba;)V

    .line 305
    .line 306
    .line 307
    return-void

    .line 308
    :cond_5
    iget-boolean p1, p0, Lda;->x:Z

    .line 309
    .line 310
    if-eq v2, p1, :cond_6

    .line 311
    .line 312
    iput-boolean v2, p0, Lda;->x:Z

    .line 313
    .line 314
    iget-object p1, p0, Lda;->o:Li90;

    .line 315
    .line 316
    invoke-virtual {p1}, Li90;->invalidateSelf()V

    .line 317
    .line 318
    .line 319
    :cond_6
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Lvq2;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lda;->w:Lq21;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lq21;->c(Ljava/lang/Object;Lvq2;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V
    .locals 1

    .line 1
    iget-object p1, p0, Lda;->i:Landroid/graphics/RectF;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1, v0, v0, v0, v0}, Landroid/graphics/RectF;->set(FFFF)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lda;->i()V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lda;->n:Landroid/graphics/Matrix;

    .line 11
    .line 12
    invoke-virtual {p1, p2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 13
    .line 14
    .line 15
    if-eqz p3, :cond_1

    .line 16
    .line 17
    iget-object p2, p0, Lda;->u:Ljava/util/List;

    .line 18
    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    add-int/lit8 p2, p2, -0x1

    .line 26
    .line 27
    :goto_0
    if-ltz p2, :cond_1

    .line 28
    .line 29
    iget-object p3, p0, Lda;->u:Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {p3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    check-cast p3, Lda;

    .line 36
    .line 37
    iget-object p3, p3, Lda;->w:Lq21;

    .line 38
    .line 39
    invoke-virtual {p3}, Lq21;->e()Landroid/graphics/Matrix;

    .line 40
    .line 41
    .line 42
    move-result-object p3

    .line 43
    invoke-virtual {p1, p3}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 44
    .line 45
    .line 46
    add-int/lit8 p2, p2, -0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    iget-object p2, p0, Lda;->t:Lda;

    .line 50
    .line 51
    if-eqz p2, :cond_1

    .line 52
    .line 53
    iget-object p2, p2, Lda;->w:Lq21;

    .line 54
    .line 55
    invoke-virtual {p2}, Lq21;->e()Landroid/graphics/Matrix;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    invoke-virtual {p1, p2}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 60
    .line 61
    .line 62
    :cond_1
    iget-object p2, p0, Lda;->w:Lq21;

    .line 63
    .line 64
    invoke-virtual {p2}, Lq21;->e()Landroid/graphics/Matrix;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    invoke-virtual {p1, p2}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public final c()V
    .locals 1

    .line 1
    iget-object v0, p0, Lda;->o:Li90;

    .line 2
    .line 3
    invoke-virtual {v0}, Li90;->invalidateSelf()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d(Ljava/util/List;Ljava/util/List;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final e(Lba;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lda;->v:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final g(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILmq;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v7, p2

    .line 6
    .line 7
    move/from16 v8, p3

    .line 8
    .line 9
    move-object/from16 v9, p4

    .line 10
    .line 11
    iget-boolean v2, v0, Lda;->x:Z

    .line 12
    .line 13
    if-eqz v2, :cond_2c

    .line 14
    .line 15
    iget-object v2, v0, Lda;->p:Lf50;

    .line 16
    .line 17
    iget-boolean v3, v2, Lf50;->v:Z

    .line 18
    .line 19
    iget v4, v2, Lf50;->y:I

    .line 20
    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    goto/16 :goto_13

    .line 24
    .line 25
    :cond_0
    invoke-virtual {v0}, Lda;->i()V

    .line 26
    .line 27
    .line 28
    iget-object v10, v0, Lda;->b:Landroid/graphics/Matrix;

    .line 29
    .line 30
    invoke-virtual {v10}, Landroid/graphics/Matrix;->reset()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v10, v7}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 34
    .line 35
    .line 36
    iget-object v3, v0, Lda;->u:Ljava/util/List;

    .line 37
    .line 38
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    const/4 v11, 0x1

    .line 43
    sub-int/2addr v3, v11

    .line 44
    :goto_0
    if-ltz v3, :cond_1

    .line 45
    .line 46
    iget-object v5, v0, Lda;->u:Ljava/util/List;

    .line 47
    .line 48
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    check-cast v5, Lda;

    .line 53
    .line 54
    iget-object v5, v5, Lda;->w:Lq21;

    .line 55
    .line 56
    invoke-virtual {v5}, Lq21;->e()Landroid/graphics/Matrix;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    invoke-virtual {v10, v5}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 61
    .line 62
    .line 63
    add-int/lit8 v3, v3, -0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    iget-object v3, v0, Lda;->w:Lq21;

    .line 67
    .line 68
    iget-object v5, v3, Lq21;->j:Lba;

    .line 69
    .line 70
    if-eqz v5, :cond_2

    .line 71
    .line 72
    invoke-virtual {v5}, Lba;->e()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    check-cast v5, Ljava/lang/Integer;

    .line 77
    .line 78
    if-eqz v5, :cond_2

    .line 79
    .line 80
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    goto :goto_1

    .line 85
    :cond_2
    const/16 v5, 0x64

    .line 86
    .line 87
    :goto_1
    int-to-float v6, v8

    .line 88
    const/high16 v12, 0x437f0000    # 255.0f

    .line 89
    .line 90
    div-float/2addr v6, v12

    .line 91
    int-to-float v5, v5

    .line 92
    mul-float/2addr v6, v5

    .line 93
    const/high16 v5, 0x42c80000    # 100.0f

    .line 94
    .line 95
    div-float/2addr v6, v5

    .line 96
    mul-float/2addr v6, v12

    .line 97
    float-to-int v12, v6

    .line 98
    iget-object v5, v0, Lda;->s:Lda;

    .line 99
    .line 100
    if-eqz v5, :cond_3

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_3
    invoke-virtual {v0}, Lda;->m()Z

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    if-nez v5, :cond_4

    .line 108
    .line 109
    if-ne v4, v11, :cond_4

    .line 110
    .line 111
    invoke-virtual {v3}, Lq21;->e()Landroid/graphics/Matrix;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-virtual {v10, v2}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v1, v10, v12, v9}, Lda;->k(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILmq;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Lda;->n()V

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :cond_4
    :goto_2
    iget-object v13, v0, Lda;->i:Landroid/graphics/RectF;

    .line 126
    .line 127
    const/4 v14, 0x0

    .line 128
    invoke-virtual {v0, v13, v10, v14}, Lda;->b(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    .line 129
    .line 130
    .line 131
    iget-object v5, v0, Lda;->s:Lda;

    .line 132
    .line 133
    const/4 v15, 0x3

    .line 134
    const/4 v6, 0x0

    .line 135
    if-eqz v5, :cond_6

    .line 136
    .line 137
    iget v2, v2, Lf50;->u:I

    .line 138
    .line 139
    if-ne v2, v15, :cond_5

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_5
    iget-object v2, v0, Lda;->l:Landroid/graphics/RectF;

    .line 143
    .line 144
    invoke-virtual {v2, v6, v6, v6, v6}, Landroid/graphics/RectF;->set(FFFF)V

    .line 145
    .line 146
    .line 147
    iget-object v5, v0, Lda;->s:Lda;

    .line 148
    .line 149
    invoke-virtual {v5, v2, v7, v11}, Lda;->b(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v13, v2}, Landroid/graphics/RectF;->intersect(Landroid/graphics/RectF;)Z

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    if-nez v2, :cond_6

    .line 157
    .line 158
    invoke-virtual {v13, v6, v6, v6, v6}, Landroid/graphics/RectF;->set(FFFF)V

    .line 159
    .line 160
    .line 161
    :cond_6
    :goto_3
    invoke-virtual {v3}, Lq21;->e()Landroid/graphics/Matrix;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    invoke-virtual {v10, v2}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 166
    .line 167
    .line 168
    iget-object v2, v0, Lda;->k:Landroid/graphics/RectF;

    .line 169
    .line 170
    invoke-virtual {v2, v6, v6, v6, v6}, Landroid/graphics/RectF;->set(FFFF)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0}, Lda;->m()Z

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    iget-object v5, v0, Lda;->q:Lxb4;

    .line 178
    .line 179
    iget-object v6, v0, Lda;->a:Landroid/graphics/Path;

    .line 180
    .line 181
    if-nez v3, :cond_9

    .line 182
    .line 183
    :cond_7
    :goto_4
    move-object/from16 v18, v5

    .line 184
    .line 185
    move-object/from16 v19, v6

    .line 186
    .line 187
    :cond_8
    const/4 v2, 0x0

    .line 188
    goto/16 :goto_9

    .line 189
    .line 190
    :cond_9
    iget-object v3, v5, Lxb4;->i:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v3, Ljava/util/List;

    .line 193
    .line 194
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 195
    .line 196
    .line 197
    move-result v3

    .line 198
    const/4 v15, 0x0

    .line 199
    :goto_5
    if-ge v15, v3, :cond_e

    .line 200
    .line 201
    iget-object v14, v5, Lxb4;->i:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v14, Ljava/util/List;

    .line 204
    .line 205
    invoke-interface {v14, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v14

    .line 209
    check-cast v14, Lib0;

    .line 210
    .line 211
    iget-object v11, v5, Lxb4;->g:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast v11, Ljava/util/ArrayList;

    .line 214
    .line 215
    invoke-virtual {v11, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v11

    .line 219
    check-cast v11, Lba;

    .line 220
    .line 221
    invoke-virtual {v11}, Lba;->e()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v11

    .line 225
    check-cast v11, Landroid/graphics/Path;

    .line 226
    .line 227
    if-nez v11, :cond_a

    .line 228
    .line 229
    move/from16 v17, v3

    .line 230
    .line 231
    :goto_6
    move-object/from16 v18, v5

    .line 232
    .line 233
    move-object/from16 v19, v6

    .line 234
    .line 235
    goto :goto_8

    .line 236
    :cond_a
    invoke-virtual {v6, v11}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v6, v10}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 240
    .line 241
    .line 242
    iget v11, v14, Lib0;->a:I

    .line 243
    .line 244
    invoke-static {v11}, Lex0;->s(I)I

    .line 245
    .line 246
    .line 247
    move-result v11

    .line 248
    move/from16 v17, v3

    .line 249
    .line 250
    if-eqz v11, :cond_b

    .line 251
    .line 252
    const/4 v3, 0x1

    .line 253
    if-eq v11, v3, :cond_7

    .line 254
    .line 255
    const/4 v3, 0x2

    .line 256
    if-eq v11, v3, :cond_b

    .line 257
    .line 258
    const/4 v3, 0x3

    .line 259
    if-eq v11, v3, :cond_7

    .line 260
    .line 261
    goto :goto_7

    .line 262
    :cond_b
    iget-boolean v3, v14, Lib0;->d:Z

    .line 263
    .line 264
    if-eqz v3, :cond_c

    .line 265
    .line 266
    goto :goto_4

    .line 267
    :cond_c
    :goto_7
    iget-object v3, v0, Lda;->m:Landroid/graphics/RectF;

    .line 268
    .line 269
    const/4 v11, 0x0

    .line 270
    invoke-virtual {v6, v3, v11}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 271
    .line 272
    .line 273
    if-nez v15, :cond_d

    .line 274
    .line 275
    invoke-virtual {v2, v3}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 276
    .line 277
    .line 278
    goto :goto_6

    .line 279
    :cond_d
    iget v14, v2, Landroid/graphics/RectF;->left:F

    .line 280
    .line 281
    iget v11, v3, Landroid/graphics/RectF;->left:F

    .line 282
    .line 283
    invoke-static {v14, v11}, Ljava/lang/Math;->min(FF)F

    .line 284
    .line 285
    .line 286
    move-result v11

    .line 287
    iget v14, v2, Landroid/graphics/RectF;->top:F

    .line 288
    .line 289
    move-object/from16 v18, v5

    .line 290
    .line 291
    iget v5, v3, Landroid/graphics/RectF;->top:F

    .line 292
    .line 293
    invoke-static {v14, v5}, Ljava/lang/Math;->min(FF)F

    .line 294
    .line 295
    .line 296
    move-result v5

    .line 297
    iget v14, v2, Landroid/graphics/RectF;->right:F

    .line 298
    .line 299
    move-object/from16 v19, v6

    .line 300
    .line 301
    iget v6, v3, Landroid/graphics/RectF;->right:F

    .line 302
    .line 303
    invoke-static {v14, v6}, Ljava/lang/Math;->max(FF)F

    .line 304
    .line 305
    .line 306
    move-result v6

    .line 307
    iget v14, v2, Landroid/graphics/RectF;->bottom:F

    .line 308
    .line 309
    iget v3, v3, Landroid/graphics/RectF;->bottom:F

    .line 310
    .line 311
    invoke-static {v14, v3}, Ljava/lang/Math;->max(FF)F

    .line 312
    .line 313
    .line 314
    move-result v3

    .line 315
    invoke-virtual {v2, v11, v5, v6, v3}, Landroid/graphics/RectF;->set(FFFF)V

    .line 316
    .line 317
    .line 318
    :goto_8
    add-int/lit8 v15, v15, 0x1

    .line 319
    .line 320
    move/from16 v3, v17

    .line 321
    .line 322
    move-object/from16 v5, v18

    .line 323
    .line 324
    move-object/from16 v6, v19

    .line 325
    .line 326
    const/4 v11, 0x1

    .line 327
    goto/16 :goto_5

    .line 328
    .line 329
    :cond_e
    move-object/from16 v18, v5

    .line 330
    .line 331
    move-object/from16 v19, v6

    .line 332
    .line 333
    invoke-virtual {v13, v2}, Landroid/graphics/RectF;->intersect(Landroid/graphics/RectF;)Z

    .line 334
    .line 335
    .line 336
    move-result v2

    .line 337
    if-nez v2, :cond_8

    .line 338
    .line 339
    const/4 v2, 0x0

    .line 340
    invoke-virtual {v13, v2, v2, v2, v2}, Landroid/graphics/RectF;->set(FFFF)V

    .line 341
    .line 342
    .line 343
    :goto_9
    invoke-virtual {v1}, Landroid/graphics/Canvas;->getWidth()I

    .line 344
    .line 345
    .line 346
    move-result v3

    .line 347
    int-to-float v3, v3

    .line 348
    invoke-virtual {v1}, Landroid/graphics/Canvas;->getHeight()I

    .line 349
    .line 350
    .line 351
    move-result v5

    .line 352
    int-to-float v5, v5

    .line 353
    iget-object v6, v0, Lda;->j:Landroid/graphics/RectF;

    .line 354
    .line 355
    invoke-virtual {v6, v2, v2, v3, v5}, Landroid/graphics/RectF;->set(FFFF)V

    .line 356
    .line 357
    .line 358
    iget-object v3, v0, Lda;->c:Landroid/graphics/Matrix;

    .line 359
    .line 360
    invoke-virtual {v1, v3}, Landroid/graphics/Canvas;->getMatrix(Landroid/graphics/Matrix;)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v3}, Landroid/graphics/Matrix;->isIdentity()Z

    .line 364
    .line 365
    .line 366
    move-result v5

    .line 367
    if-nez v5, :cond_f

    .line 368
    .line 369
    invoke-virtual {v3, v3}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 370
    .line 371
    .line 372
    invoke-virtual {v3, v6}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 373
    .line 374
    .line 375
    :cond_f
    invoke-virtual {v13, v6}, Landroid/graphics/RectF;->intersect(Landroid/graphics/RectF;)Z

    .line 376
    .line 377
    .line 378
    move-result v3

    .line 379
    if-nez v3, :cond_10

    .line 380
    .line 381
    invoke-virtual {v13, v2, v2, v2, v2}, Landroid/graphics/RectF;->set(FFFF)V

    .line 382
    .line 383
    .line 384
    :cond_10
    invoke-virtual {v13}, Landroid/graphics/RectF;->width()F

    .line 385
    .line 386
    .line 387
    move-result v2

    .line 388
    const/high16 v3, 0x3f800000    # 1.0f

    .line 389
    .line 390
    cmpl-float v2, v2, v3

    .line 391
    .line 392
    if-ltz v2, :cond_2a

    .line 393
    .line 394
    invoke-virtual {v13}, Landroid/graphics/RectF;->height()F

    .line 395
    .line 396
    .line 397
    move-result v2

    .line 398
    cmpl-float v2, v2, v3

    .line 399
    .line 400
    if-ltz v2, :cond_2a

    .line 401
    .line 402
    iget-object v11, v0, Lda;->d:Ld50;

    .line 403
    .line 404
    const/16 v14, 0xff

    .line 405
    .line 406
    invoke-virtual {v11, v14}, Ld50;->setAlpha(I)V

    .line 407
    .line 408
    .line 409
    invoke-static {v4}, Lex0;->s(I)I

    .line 410
    .line 411
    .line 412
    move-result v2

    .line 413
    const/4 v15, 0x4

    .line 414
    const/16 v5, 0x1d

    .line 415
    .line 416
    const/4 v6, 0x0

    .line 417
    move/from16 v16, v3

    .line 418
    .line 419
    const/4 v3, 0x1

    .line 420
    if-eq v2, v3, :cond_16

    .line 421
    .line 422
    const/4 v3, 0x2

    .line 423
    if-eq v2, v3, :cond_15

    .line 424
    .line 425
    const/4 v3, 0x3

    .line 426
    if-eq v2, v3, :cond_14

    .line 427
    .line 428
    if-eq v2, v15, :cond_13

    .line 429
    .line 430
    const/4 v3, 0x5

    .line 431
    if-eq v2, v3, :cond_12

    .line 432
    .line 433
    const/16 v3, 0x10

    .line 434
    .line 435
    if-eq v2, v3, :cond_11

    .line 436
    .line 437
    move-object v2, v6

    .line 438
    goto :goto_a

    .line 439
    :cond_11
    sget-object v2, Lxa;->f:Lxa;

    .line 440
    .line 441
    goto :goto_a

    .line 442
    :cond_12
    sget-object v2, Lxa;->k:Lxa;

    .line 443
    .line 444
    goto :goto_a

    .line 445
    :cond_13
    sget-object v2, Lxa;->j:Lxa;

    .line 446
    .line 447
    goto :goto_a

    .line 448
    :cond_14
    sget-object v2, Lxa;->i:Lxa;

    .line 449
    .line 450
    goto :goto_a

    .line 451
    :cond_15
    sget-object v2, Lxa;->h:Lxa;

    .line 452
    .line 453
    goto :goto_a

    .line 454
    :cond_16
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 455
    .line 456
    if-lt v2, v5, :cond_17

    .line 457
    .line 458
    sget-object v2, Lxa;->l:Lxa;

    .line 459
    .line 460
    goto :goto_a

    .line 461
    :cond_17
    sget-object v2, Lxa;->g:Lxa;

    .line 462
    .line 463
    :goto_a
    invoke-static {v11, v2}, Lfk0;->a(Ld50;Lxa;)V

    .line 464
    .line 465
    .line 466
    sget-object v2, Ll41;->a:Landroid/graphics/Matrix;

    .line 467
    .line 468
    invoke-virtual {v1, v13, v11}, Landroid/graphics/Canvas;->saveLayer(Landroid/graphics/RectF;Landroid/graphics/Paint;)I

    .line 469
    .line 470
    .line 471
    const/4 v3, 0x2

    .line 472
    if-eq v4, v3, :cond_19

    .line 473
    .line 474
    invoke-virtual/range {p0 .. p1}, Lda;->j(Landroid/graphics/Canvas;)V

    .line 475
    .line 476
    .line 477
    :cond_18
    move-object/from16 v14, v18

    .line 478
    .line 479
    move-object/from16 v20, v19

    .line 480
    .line 481
    goto :goto_b

    .line 482
    :cond_19
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 483
    .line 484
    if-ge v2, v5, :cond_18

    .line 485
    .line 486
    iget-object v2, v0, Lda;->C:Ld50;

    .line 487
    .line 488
    if-nez v2, :cond_1a

    .line 489
    .line 490
    new-instance v2, Ld50;

    .line 491
    .line 492
    invoke-direct {v2}, Ld50;-><init>()V

    .line 493
    .line 494
    .line 495
    iput-object v2, v0, Lda;->C:Ld50;

    .line 496
    .line 497
    const/4 v3, -0x1

    .line 498
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 499
    .line 500
    .line 501
    :cond_1a
    iget v2, v13, Landroid/graphics/RectF;->left:F

    .line 502
    .line 503
    sub-float v2, v2, v16

    .line 504
    .line 505
    iget v3, v13, Landroid/graphics/RectF;->top:F

    .line 506
    .line 507
    sub-float v3, v3, v16

    .line 508
    .line 509
    iget v4, v13, Landroid/graphics/RectF;->right:F

    .line 510
    .line 511
    add-float v4, v4, v16

    .line 512
    .line 513
    iget v5, v13, Landroid/graphics/RectF;->bottom:F

    .line 514
    .line 515
    add-float v5, v5, v16

    .line 516
    .line 517
    move-object/from16 v16, v6

    .line 518
    .line 519
    iget-object v6, v0, Lda;->C:Ld50;

    .line 520
    .line 521
    move-object/from16 v14, v18

    .line 522
    .line 523
    move-object/from16 v20, v19

    .line 524
    .line 525
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 526
    .line 527
    .line 528
    :goto_b
    invoke-virtual {v0, v1, v10, v12, v9}, Lda;->k(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILmq;)V

    .line 529
    .line 530
    .line 531
    invoke-virtual {v0}, Lda;->m()Z

    .line 532
    .line 533
    .line 534
    move-result v2

    .line 535
    if-eqz v2, :cond_28

    .line 536
    .line 537
    iget-object v2, v0, Lda;->e:Ld50;

    .line 538
    .line 539
    invoke-virtual {v1, v13, v2}, Landroid/graphics/Canvas;->saveLayer(Landroid/graphics/RectF;Landroid/graphics/Paint;)I

    .line 540
    .line 541
    .line 542
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 543
    .line 544
    const/16 v4, 0x1c

    .line 545
    .line 546
    if-ge v3, v4, :cond_1b

    .line 547
    .line 548
    invoke-virtual/range {p0 .. p1}, Lda;->j(Landroid/graphics/Canvas;)V

    .line 549
    .line 550
    .line 551
    :cond_1b
    const/4 v3, 0x0

    .line 552
    :goto_c
    iget-object v4, v14, Lxb4;->i:Ljava/lang/Object;

    .line 553
    .line 554
    check-cast v4, Ljava/util/List;

    .line 555
    .line 556
    iget-object v5, v14, Lxb4;->g:Ljava/lang/Object;

    .line 557
    .line 558
    check-cast v5, Ljava/util/ArrayList;

    .line 559
    .line 560
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 561
    .line 562
    .line 563
    move-result v6

    .line 564
    if-ge v3, v6, :cond_27

    .line 565
    .line 566
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    move-result-object v6

    .line 570
    check-cast v6, Lib0;

    .line 571
    .line 572
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 573
    .line 574
    .line 575
    move-result-object v9

    .line 576
    check-cast v9, Lba;

    .line 577
    .line 578
    iget-object v12, v14, Lxb4;->h:Ljava/lang/Object;

    .line 579
    .line 580
    check-cast v12, Ljava/util/ArrayList;

    .line 581
    .line 582
    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 583
    .line 584
    .line 585
    move-result-object v12

    .line 586
    check-cast v12, Lba;

    .line 587
    .line 588
    iget v15, v6, Lib0;->a:I

    .line 589
    .line 590
    iget-boolean v6, v6, Lib0;->d:Z

    .line 591
    .line 592
    invoke-static {v15}, Lex0;->s(I)I

    .line 593
    .line 594
    .line 595
    move-result v15

    .line 596
    move/from16 v18, v3

    .line 597
    .line 598
    iget-object v3, v0, Lda;->f:Ld50;

    .line 599
    .line 600
    const v19, 0x40233333    # 2.55f

    .line 601
    .line 602
    .line 603
    if-eqz v15, :cond_25

    .line 604
    .line 605
    move-object/from16 p4, v5

    .line 606
    .line 607
    const/4 v5, 0x1

    .line 608
    if-eq v15, v5, :cond_22

    .line 609
    .line 610
    const/4 v5, 0x2

    .line 611
    if-eq v15, v5, :cond_20

    .line 612
    .line 613
    const/4 v5, 0x3

    .line 614
    if-eq v15, v5, :cond_1c

    .line 615
    .line 616
    move-object/from16 v4, v20

    .line 617
    .line 618
    const/16 v5, 0xff

    .line 619
    .line 620
    const/4 v15, 0x4

    .line 621
    goto/16 :goto_12

    .line 622
    .line 623
    :cond_1c
    invoke-virtual/range {p4 .. p4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 624
    .line 625
    .line 626
    move-result v3

    .line 627
    if-eqz v3, :cond_1d

    .line 628
    .line 629
    const/4 v15, 0x4

    .line 630
    goto :goto_e

    .line 631
    :cond_1d
    const/4 v3, 0x0

    .line 632
    :goto_d
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 633
    .line 634
    .line 635
    move-result v6

    .line 636
    if-ge v3, v6, :cond_1f

    .line 637
    .line 638
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 639
    .line 640
    .line 641
    move-result-object v6

    .line 642
    check-cast v6, Lib0;

    .line 643
    .line 644
    iget v6, v6, Lib0;->a:I

    .line 645
    .line 646
    const/4 v15, 0x4

    .line 647
    if-eq v6, v15, :cond_1e

    .line 648
    .line 649
    :goto_e
    move-object/from16 v4, v20

    .line 650
    .line 651
    :goto_f
    const/16 v5, 0xff

    .line 652
    .line 653
    goto/16 :goto_12

    .line 654
    .line 655
    :cond_1e
    add-int/lit8 v3, v3, 0x1

    .line 656
    .line 657
    goto :goto_d

    .line 658
    :cond_1f
    const/16 v3, 0xff

    .line 659
    .line 660
    const/4 v15, 0x4

    .line 661
    invoke-virtual {v11, v3}, Ld50;->setAlpha(I)V

    .line 662
    .line 663
    .line 664
    invoke-virtual {v1, v13, v11}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 665
    .line 666
    .line 667
    goto :goto_e

    .line 668
    :cond_20
    const/4 v5, 0x3

    .line 669
    const/4 v15, 0x4

    .line 670
    if-eqz v6, :cond_21

    .line 671
    .line 672
    sget-object v4, Ll41;->a:Landroid/graphics/Matrix;

    .line 673
    .line 674
    invoke-virtual {v1, v13, v2}, Landroid/graphics/Canvas;->saveLayer(Landroid/graphics/RectF;Landroid/graphics/Paint;)I

    .line 675
    .line 676
    .line 677
    invoke-virtual {v1, v13, v11}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 678
    .line 679
    .line 680
    invoke-virtual {v12}, Lba;->e()Ljava/lang/Object;

    .line 681
    .line 682
    .line 683
    move-result-object v4

    .line 684
    check-cast v4, Ljava/lang/Integer;

    .line 685
    .line 686
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 687
    .line 688
    .line 689
    move-result v4

    .line 690
    int-to-float v4, v4

    .line 691
    mul-float v4, v4, v19

    .line 692
    .line 693
    float-to-int v4, v4

    .line 694
    invoke-virtual {v3, v4}, Ld50;->setAlpha(I)V

    .line 695
    .line 696
    .line 697
    invoke-virtual {v9}, Lba;->e()Ljava/lang/Object;

    .line 698
    .line 699
    .line 700
    move-result-object v4

    .line 701
    check-cast v4, Landroid/graphics/Path;

    .line 702
    .line 703
    move-object/from16 v6, v20

    .line 704
    .line 705
    invoke-virtual {v6, v4}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    .line 706
    .line 707
    .line 708
    invoke-virtual {v6, v10}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 709
    .line 710
    .line 711
    invoke-virtual {v1, v6, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 712
    .line 713
    .line 714
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 715
    .line 716
    .line 717
    :goto_10
    move-object v4, v6

    .line 718
    goto :goto_f

    .line 719
    :cond_21
    move-object/from16 v6, v20

    .line 720
    .line 721
    sget-object v3, Ll41;->a:Landroid/graphics/Matrix;

    .line 722
    .line 723
    invoke-virtual {v1, v13, v2}, Landroid/graphics/Canvas;->saveLayer(Landroid/graphics/RectF;Landroid/graphics/Paint;)I

    .line 724
    .line 725
    .line 726
    invoke-virtual {v9}, Lba;->e()Ljava/lang/Object;

    .line 727
    .line 728
    .line 729
    move-result-object v3

    .line 730
    check-cast v3, Landroid/graphics/Path;

    .line 731
    .line 732
    invoke-virtual {v6, v3}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    .line 733
    .line 734
    .line 735
    invoke-virtual {v6, v10}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 736
    .line 737
    .line 738
    invoke-virtual {v12}, Lba;->e()Ljava/lang/Object;

    .line 739
    .line 740
    .line 741
    move-result-object v3

    .line 742
    check-cast v3, Ljava/lang/Integer;

    .line 743
    .line 744
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 745
    .line 746
    .line 747
    move-result v3

    .line 748
    int-to-float v3, v3

    .line 749
    mul-float v3, v3, v19

    .line 750
    .line 751
    float-to-int v3, v3

    .line 752
    invoke-virtual {v11, v3}, Ld50;->setAlpha(I)V

    .line 753
    .line 754
    .line 755
    invoke-virtual {v1, v6, v11}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 756
    .line 757
    .line 758
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 759
    .line 760
    .line 761
    goto :goto_10

    .line 762
    :cond_22
    move-object/from16 v4, v20

    .line 763
    .line 764
    const/4 v5, 0x3

    .line 765
    const/4 v15, 0x4

    .line 766
    if-nez v18, :cond_23

    .line 767
    .line 768
    const/high16 v5, -0x1000000

    .line 769
    .line 770
    invoke-virtual {v11, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 771
    .line 772
    .line 773
    const/16 v5, 0xff

    .line 774
    .line 775
    invoke-virtual {v11, v5}, Ld50;->setAlpha(I)V

    .line 776
    .line 777
    .line 778
    invoke-virtual {v1, v13, v11}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 779
    .line 780
    .line 781
    goto :goto_11

    .line 782
    :cond_23
    const/16 v5, 0xff

    .line 783
    .line 784
    :goto_11
    if-eqz v6, :cond_24

    .line 785
    .line 786
    sget-object v6, Ll41;->a:Landroid/graphics/Matrix;

    .line 787
    .line 788
    invoke-virtual {v1, v13, v3}, Landroid/graphics/Canvas;->saveLayer(Landroid/graphics/RectF;Landroid/graphics/Paint;)I

    .line 789
    .line 790
    .line 791
    invoke-virtual {v1, v13, v11}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 792
    .line 793
    .line 794
    invoke-virtual {v12}, Lba;->e()Ljava/lang/Object;

    .line 795
    .line 796
    .line 797
    move-result-object v6

    .line 798
    check-cast v6, Ljava/lang/Integer;

    .line 799
    .line 800
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 801
    .line 802
    .line 803
    move-result v6

    .line 804
    int-to-float v6, v6

    .line 805
    mul-float v6, v6, v19

    .line 806
    .line 807
    float-to-int v6, v6

    .line 808
    invoke-virtual {v3, v6}, Ld50;->setAlpha(I)V

    .line 809
    .line 810
    .line 811
    invoke-virtual {v9}, Lba;->e()Ljava/lang/Object;

    .line 812
    .line 813
    .line 814
    move-result-object v6

    .line 815
    check-cast v6, Landroid/graphics/Path;

    .line 816
    .line 817
    invoke-virtual {v4, v6}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    .line 818
    .line 819
    .line 820
    invoke-virtual {v4, v10}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 821
    .line 822
    .line 823
    invoke-virtual {v1, v4, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 824
    .line 825
    .line 826
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 827
    .line 828
    .line 829
    goto :goto_12

    .line 830
    :cond_24
    invoke-virtual {v9}, Lba;->e()Ljava/lang/Object;

    .line 831
    .line 832
    .line 833
    move-result-object v6

    .line 834
    check-cast v6, Landroid/graphics/Path;

    .line 835
    .line 836
    invoke-virtual {v4, v6}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    .line 837
    .line 838
    .line 839
    invoke-virtual {v4, v10}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 840
    .line 841
    .line 842
    invoke-virtual {v1, v4, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 843
    .line 844
    .line 845
    goto :goto_12

    .line 846
    :cond_25
    move-object/from16 v4, v20

    .line 847
    .line 848
    const/16 v5, 0xff

    .line 849
    .line 850
    const/4 v15, 0x4

    .line 851
    if-eqz v6, :cond_26

    .line 852
    .line 853
    sget-object v6, Ll41;->a:Landroid/graphics/Matrix;

    .line 854
    .line 855
    invoke-virtual {v1, v13, v11}, Landroid/graphics/Canvas;->saveLayer(Landroid/graphics/RectF;Landroid/graphics/Paint;)I

    .line 856
    .line 857
    .line 858
    invoke-virtual {v1, v13, v11}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 859
    .line 860
    .line 861
    invoke-virtual {v9}, Lba;->e()Ljava/lang/Object;

    .line 862
    .line 863
    .line 864
    move-result-object v6

    .line 865
    check-cast v6, Landroid/graphics/Path;

    .line 866
    .line 867
    invoke-virtual {v4, v6}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    .line 868
    .line 869
    .line 870
    invoke-virtual {v4, v10}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 871
    .line 872
    .line 873
    invoke-virtual {v12}, Lba;->e()Ljava/lang/Object;

    .line 874
    .line 875
    .line 876
    move-result-object v6

    .line 877
    check-cast v6, Ljava/lang/Integer;

    .line 878
    .line 879
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 880
    .line 881
    .line 882
    move-result v6

    .line 883
    int-to-float v6, v6

    .line 884
    mul-float v6, v6, v19

    .line 885
    .line 886
    float-to-int v6, v6

    .line 887
    invoke-virtual {v11, v6}, Ld50;->setAlpha(I)V

    .line 888
    .line 889
    .line 890
    invoke-virtual {v1, v4, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 891
    .line 892
    .line 893
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 894
    .line 895
    .line 896
    goto :goto_12

    .line 897
    :cond_26
    invoke-virtual {v9}, Lba;->e()Ljava/lang/Object;

    .line 898
    .line 899
    .line 900
    move-result-object v3

    .line 901
    check-cast v3, Landroid/graphics/Path;

    .line 902
    .line 903
    invoke-virtual {v4, v3}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    .line 904
    .line 905
    .line 906
    invoke-virtual {v4, v10}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 907
    .line 908
    .line 909
    invoke-virtual {v12}, Lba;->e()Ljava/lang/Object;

    .line 910
    .line 911
    .line 912
    move-result-object v3

    .line 913
    check-cast v3, Ljava/lang/Integer;

    .line 914
    .line 915
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 916
    .line 917
    .line 918
    move-result v3

    .line 919
    int-to-float v3, v3

    .line 920
    mul-float v3, v3, v19

    .line 921
    .line 922
    float-to-int v3, v3

    .line 923
    invoke-virtual {v11, v3}, Ld50;->setAlpha(I)V

    .line 924
    .line 925
    .line 926
    invoke-virtual {v1, v4, v11}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 927
    .line 928
    .line 929
    :goto_12
    add-int/lit8 v3, v18, 0x1

    .line 930
    .line 931
    move-object/from16 v20, v4

    .line 932
    .line 933
    goto/16 :goto_c

    .line 934
    .line 935
    :cond_27
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 936
    .line 937
    .line 938
    :cond_28
    iget-object v2, v0, Lda;->s:Lda;

    .line 939
    .line 940
    if-eqz v2, :cond_29

    .line 941
    .line 942
    iget-object v2, v0, Lda;->g:Ld50;

    .line 943
    .line 944
    invoke-virtual {v1, v13, v2}, Landroid/graphics/Canvas;->saveLayer(Landroid/graphics/RectF;Landroid/graphics/Paint;)I

    .line 945
    .line 946
    .line 947
    invoke-virtual/range {p0 .. p1}, Lda;->j(Landroid/graphics/Canvas;)V

    .line 948
    .line 949
    .line 950
    iget-object v2, v0, Lda;->s:Lda;

    .line 951
    .line 952
    const/4 v3, 0x0

    .line 953
    invoke-virtual {v2, v1, v7, v8, v3}, Lda;->g(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILmq;)V

    .line 954
    .line 955
    .line 956
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 957
    .line 958
    .line 959
    :cond_29
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 960
    .line 961
    .line 962
    :cond_2a
    iget-boolean v2, v0, Lda;->y:Z

    .line 963
    .line 964
    if-eqz v2, :cond_2b

    .line 965
    .line 966
    iget-object v2, v0, Lda;->z:Ld50;

    .line 967
    .line 968
    if-eqz v2, :cond_2b

    .line 969
    .line 970
    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 971
    .line 972
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 973
    .line 974
    .line 975
    iget-object v2, v0, Lda;->z:Ld50;

    .line 976
    .line 977
    const v3, -0x3d7fd

    .line 978
    .line 979
    .line 980
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 981
    .line 982
    .line 983
    iget-object v2, v0, Lda;->z:Ld50;

    .line 984
    .line 985
    const/high16 v3, 0x40800000    # 4.0f

    .line 986
    .line 987
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 988
    .line 989
    .line 990
    iget-object v2, v0, Lda;->z:Ld50;

    .line 991
    .line 992
    invoke-virtual {v1, v13, v2}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 993
    .line 994
    .line 995
    iget-object v2, v0, Lda;->z:Ld50;

    .line 996
    .line 997
    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 998
    .line 999
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 1000
    .line 1001
    .line 1002
    iget-object v2, v0, Lda;->z:Ld50;

    .line 1003
    .line 1004
    const v3, 0x50ebebeb

    .line 1005
    .line 1006
    .line 1007
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 1008
    .line 1009
    .line 1010
    iget-object v2, v0, Lda;->z:Ld50;

    .line 1011
    .line 1012
    invoke-virtual {v1, v13, v2}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 1013
    .line 1014
    .line 1015
    :cond_2b
    invoke-virtual {v0}, Lda;->n()V

    .line 1016
    .line 1017
    .line 1018
    :cond_2c
    :goto_13
    return-void
.end method

.method public final h(Lt40;ILjava/util/ArrayList;Lt40;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lda;->s:Lda;

    .line 2
    .line 3
    iget-object v1, p0, Lda;->p:Lf50;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v0, v0, Lda;->p:Lf50;

    .line 8
    .line 9
    iget-object v0, v0, Lf50;->c:Ljava/lang/String;

    .line 10
    .line 11
    new-instance v2, Lt40;

    .line 12
    .line 13
    invoke-direct {v2, p4}, Lt40;-><init>(Lt40;)V

    .line 14
    .line 15
    .line 16
    iget-object v3, v2, Lt40;->a:Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lda;->s:Lda;

    .line 22
    .line 23
    iget-object v0, v0, Lda;->p:Lf50;

    .line 24
    .line 25
    iget-object v0, v0, Lf50;->c:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {p1, v0, p2}, Lt40;->a(Ljava/lang/String;I)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    iget-object v0, p0, Lda;->s:Lda;

    .line 34
    .line 35
    new-instance v3, Lt40;

    .line 36
    .line 37
    invoke-direct {v3, v2}, Lt40;-><init>(Lt40;)V

    .line 38
    .line 39
    .line 40
    iput-object v0, v3, Lt40;->b:Lu40;

    .line 41
    .line 42
    invoke-virtual {p3, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    :cond_0
    iget-object v0, p0, Lda;->s:Lda;

    .line 46
    .line 47
    iget-object v0, v0, Lda;->p:Lf50;

    .line 48
    .line 49
    iget-object v0, v0, Lf50;->c:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {p1, v0, p2}, Lt40;->c(Ljava/lang/String;I)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    iget-object v0, v1, Lf50;->c:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {p1, v0, p2}, Lt40;->d(Ljava/lang/String;I)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_1

    .line 64
    .line 65
    iget-object v0, p0, Lda;->s:Lda;

    .line 66
    .line 67
    iget-object v0, v0, Lda;->p:Lf50;

    .line 68
    .line 69
    iget-object v0, v0, Lf50;->c:Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {p1, v0, p2}, Lt40;->b(Ljava/lang/String;I)I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    add-int/2addr v0, p2

    .line 76
    iget-object v3, p0, Lda;->s:Lda;

    .line 77
    .line 78
    invoke-virtual {v3, p1, v0, p3, v2}, Lda;->p(Lt40;ILjava/util/ArrayList;Lt40;)V

    .line 79
    .line 80
    .line 81
    :cond_1
    iget-object v0, v1, Lf50;->c:Ljava/lang/String;

    .line 82
    .line 83
    iget-object v1, v1, Lf50;->c:Ljava/lang/String;

    .line 84
    .line 85
    invoke-virtual {p1, v0, p2}, Lt40;->c(Ljava/lang/String;I)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-nez v0, :cond_2

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_2
    const-string v0, "__container"

    .line 93
    .line 94
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-nez v0, :cond_4

    .line 99
    .line 100
    new-instance v0, Lt40;

    .line 101
    .line 102
    invoke-direct {v0, p4}, Lt40;-><init>(Lt40;)V

    .line 103
    .line 104
    .line 105
    iget-object p4, v0, Lt40;->a:Ljava/util/List;

    .line 106
    .line 107
    invoke-interface {p4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1, v1, p2}, Lt40;->a(Ljava/lang/String;I)Z

    .line 111
    .line 112
    .line 113
    move-result p4

    .line 114
    if-eqz p4, :cond_3

    .line 115
    .line 116
    new-instance p4, Lt40;

    .line 117
    .line 118
    invoke-direct {p4, v0}, Lt40;-><init>(Lt40;)V

    .line 119
    .line 120
    .line 121
    iput-object p0, p4, Lt40;->b:Lu40;

    .line 122
    .line 123
    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    :cond_3
    move-object p4, v0

    .line 127
    :cond_4
    invoke-virtual {p1, v1, p2}, Lt40;->d(Ljava/lang/String;I)Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-eqz v0, :cond_5

    .line 132
    .line 133
    invoke-virtual {p1, v1, p2}, Lt40;->b(Ljava/lang/String;I)I

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    add-int/2addr v0, p2

    .line 138
    invoke-virtual {p0, p1, v0, p3, p4}, Lda;->p(Lt40;ILjava/util/ArrayList;Lt40;)V

    .line 139
    .line 140
    .line 141
    :cond_5
    :goto_0
    return-void
.end method

.method public final i()V
    .locals 2

    .line 1
    iget-object v0, p0, Lda;->u:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    iget-object v0, p0, Lda;->t:Lda;

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 11
    .line 12
    iput-object v0, p0, Lda;->u:Ljava/util/List;

    .line 13
    .line 14
    return-void

    .line 15
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lda;->u:Ljava/util/List;

    .line 21
    .line 22
    iget-object v0, p0, Lda;->t:Lda;

    .line 23
    .line 24
    :goto_0
    if-eqz v0, :cond_2

    .line 25
    .line 26
    iget-object v1, p0, Lda;->u:Ljava/util/List;

    .line 27
    .line 28
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    iget-object v0, v0, Lda;->t:Lda;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    :goto_1
    return-void
.end method

.method public final j(Landroid/graphics/Canvas;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lda;->i:Landroid/graphics/RectF;

    .line 2
    .line 3
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 4
    .line 5
    const/high16 v2, 0x3f800000    # 1.0f

    .line 6
    .line 7
    sub-float v4, v1, v2

    .line 8
    .line 9
    iget v1, v0, Landroid/graphics/RectF;->top:F

    .line 10
    .line 11
    sub-float v5, v1, v2

    .line 12
    .line 13
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 14
    .line 15
    add-float v6, v1, v2

    .line 16
    .line 17
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 18
    .line 19
    add-float v7, v0, v2

    .line 20
    .line 21
    iget-object v8, p0, Lda;->h:Ld50;

    .line 22
    .line 23
    move-object v3, p1

    .line 24
    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public abstract k(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILmq;)V
.end method

.method public l()Lkf3;
    .locals 1

    .line 1
    iget-object v0, p0, Lda;->p:Lf50;

    .line 2
    .line 3
    iget-object v0, v0, Lf50;->w:Lkf3;

    .line 4
    .line 5
    return-object v0
.end method

.method public final m()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lda;->q:Lxb4;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lxb4;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public final n()V
    .locals 5

    .line 1
    iget-object v0, p0, Lda;->o:Li90;

    .line 2
    .line 3
    iget-object v0, v0, Li90;->f:Lu80;

    .line 4
    .line 5
    iget-object v0, v0, Lu80;->a:Lqk0;

    .line 6
    .line 7
    iget-object v1, p0, Lda;->p:Lf50;

    .line 8
    .line 9
    iget-object v1, v1, Lf50;->c:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v2, v0, Lqk0;->c:Ljava/util/HashMap;

    .line 12
    .line 13
    iget-boolean v3, v0, Lqk0;->a:Z

    .line 14
    .line 15
    if-nez v3, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    check-cast v3, Lsc0;

    .line 23
    .line 24
    if-nez v3, :cond_1

    .line 25
    .line 26
    new-instance v3, Lsc0;

    .line 27
    .line 28
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    :cond_1
    iget v2, v3, Lsc0;->a:I

    .line 35
    .line 36
    add-int/lit8 v2, v2, 0x1

    .line 37
    .line 38
    iput v2, v3, Lsc0;->a:I

    .line 39
    .line 40
    const v4, 0x7fffffff

    .line 41
    .line 42
    .line 43
    if-ne v2, v4, :cond_2

    .line 44
    .line 45
    div-int/lit8 v2, v2, 0x2

    .line 46
    .line 47
    iput v2, v3, Lsc0;->a:I

    .line 48
    .line 49
    :cond_2
    const-string v2, "__container"

    .line 50
    .line 51
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_4

    .line 56
    .line 57
    iget-object v0, v0, Lqk0;->b:Lu8;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    new-instance v1, Lo8;

    .line 63
    .line 64
    invoke-direct {v1, v0}, Lo8;-><init>(Lu8;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1}, Lo8;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-nez v0, :cond_3

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_3
    invoke-virtual {v1}, Lo8;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    new-instance v0, Ljava/lang/ClassCastException;

    .line 82
    .line 83
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 84
    .line 85
    .line 86
    throw v0

    .line 87
    :cond_4
    :goto_0
    return-void
.end method

.method public final o(Lba;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lda;->v:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public p(Lt40;ILjava/util/ArrayList;Lt40;)V
    .locals 0

    .line 1
    return-void
.end method

.method public q(Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lda;->z:Ld50;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ld50;

    .line 8
    .line 9
    invoke-direct {v0}, Ld50;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lda;->z:Ld50;

    .line 13
    .line 14
    :cond_0
    iput-boolean p1, p0, Lda;->y:Z

    .line 15
    .line 16
    return-void
.end method

.method public r(F)V
    .locals 4

    .line 1
    iget-object v0, p0, Lda;->w:Lq21;

    .line 2
    .line 3
    iget-object v1, v0, Lq21;->j:Lba;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v1, p1}, Lba;->i(F)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v1, v0, Lq21;->m:Lba;

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-virtual {v1, p1}, Lba;->i(F)V

    .line 15
    .line 16
    .line 17
    :cond_1
    iget-object v1, v0, Lq21;->n:Lba;

    .line 18
    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    invoke-virtual {v1, p1}, Lba;->i(F)V

    .line 22
    .line 23
    .line 24
    :cond_2
    iget-object v1, v0, Lq21;->f:Lba;

    .line 25
    .line 26
    if-eqz v1, :cond_3

    .line 27
    .line 28
    invoke-virtual {v1, p1}, Lba;->i(F)V

    .line 29
    .line 30
    .line 31
    :cond_3
    iget-object v1, v0, Lq21;->g:Lba;

    .line 32
    .line 33
    if-eqz v1, :cond_4

    .line 34
    .line 35
    invoke-virtual {v1, p1}, Lba;->i(F)V

    .line 36
    .line 37
    .line 38
    :cond_4
    iget-object v1, v0, Lq21;->h:Lba;

    .line 39
    .line 40
    if-eqz v1, :cond_5

    .line 41
    .line 42
    invoke-virtual {v1, p1}, Lba;->i(F)V

    .line 43
    .line 44
    .line 45
    :cond_5
    iget-object v1, v0, Lq21;->i:Lba;

    .line 46
    .line 47
    if-eqz v1, :cond_6

    .line 48
    .line 49
    invoke-virtual {v1, p1}, Lba;->i(F)V

    .line 50
    .line 51
    .line 52
    :cond_6
    iget-object v1, v0, Lq21;->k:Lpu;

    .line 53
    .line 54
    if-eqz v1, :cond_7

    .line 55
    .line 56
    invoke-virtual {v1, p1}, Lba;->i(F)V

    .line 57
    .line 58
    .line 59
    :cond_7
    iget-object v0, v0, Lq21;->l:Lpu;

    .line 60
    .line 61
    if-eqz v0, :cond_8

    .line 62
    .line 63
    invoke-virtual {v0, p1}, Lba;->i(F)V

    .line 64
    .line 65
    .line 66
    :cond_8
    const/4 v0, 0x0

    .line 67
    iget-object v1, p0, Lda;->q:Lxb4;

    .line 68
    .line 69
    if-eqz v1, :cond_9

    .line 70
    .line 71
    iget-object v1, v1, Lxb4;->g:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v1, Ljava/util/ArrayList;

    .line 74
    .line 75
    move v2, v0

    .line 76
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-ge v2, v3, :cond_9

    .line 81
    .line 82
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    check-cast v3, Lba;

    .line 87
    .line 88
    invoke-virtual {v3, p1}, Lba;->i(F)V

    .line 89
    .line 90
    .line 91
    add-int/lit8 v2, v2, 0x1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_9
    iget-object v1, p0, Lda;->r:Lpu;

    .line 95
    .line 96
    if-eqz v1, :cond_a

    .line 97
    .line 98
    invoke-virtual {v1, p1}, Lba;->i(F)V

    .line 99
    .line 100
    .line 101
    :cond_a
    iget-object v1, p0, Lda;->s:Lda;

    .line 102
    .line 103
    if-eqz v1, :cond_b

    .line 104
    .line 105
    invoke-virtual {v1, p1}, Lda;->r(F)V

    .line 106
    .line 107
    .line 108
    :cond_b
    :goto_1
    iget-object v1, p0, Lda;->v:Ljava/util/ArrayList;

    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-ge v0, v2, :cond_c

    .line 115
    .line 116
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    check-cast v1, Lba;

    .line 121
    .line 122
    invoke-virtual {v1, p1}, Lba;->i(F)V

    .line 123
    .line 124
    .line 125
    add-int/lit8 v0, v0, 0x1

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_c
    return-void
.end method
