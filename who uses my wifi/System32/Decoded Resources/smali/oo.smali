.class public final Loo;
.super Laq;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final D:Lno;


# instance fields
.field public A:Landroid/animation/TimeInterpolator;

.field public B:Landroid/animation/TimeInterpolator;

.field public C:Landroid/animation/TimeInterpolator;

.field public final s:Lm60;

.field public final t:Lox0;

.field public final u:Lnx0;

.field public final v:Lcq;

.field public w:F

.field public x:Z

.field public final y:Landroid/animation/ValueAnimator;

.field public z:Landroid/animation/ValueAnimator;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lno;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lno;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Loo;->D:Lno;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lv60;Lm60;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1, p2}, Laq;-><init>(Landroid/content/Context;Lv60;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Loo;->x:Z

    .line 6
    .line 7
    iput-object p3, p0, Loo;->s:Lm60;

    .line 8
    .line 9
    new-instance p1, Lcq;

    .line 10
    .line 11
    invoke-direct {p1}, Lcq;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Loo;->v:Lcq;

    .line 15
    .line 16
    const/4 p3, 0x1

    .line 17
    iput-boolean p3, p1, Lcq;->g:Z

    .line 18
    .line 19
    new-instance p1, Lox0;

    .line 20
    .line 21
    invoke-direct {p1}, Lox0;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Loo;->t:Lox0;

    .line 25
    .line 26
    const/high16 v0, 0x3f800000    # 1.0f

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Lox0;->a(F)V

    .line 29
    .line 30
    .line 31
    const/high16 v1, 0x42480000    # 50.0f

    .line 32
    .line 33
    invoke-virtual {p1, v1}, Lox0;->b(F)V

    .line 34
    .line 35
    .line 36
    new-instance v1, Lnx0;

    .line 37
    .line 38
    sget-object v2, Loo;->D:Lno;

    .line 39
    .line 40
    invoke-direct {v1, p0, v2}, Lnx0;-><init>(Ljava/lang/Object;Luk2;)V

    .line 41
    .line 42
    .line 43
    iput-object v1, p0, Loo;->u:Lnx0;

    .line 44
    .line 45
    iput-object p1, v1, Lnx0;->k:Lox0;

    .line 46
    .line 47
    new-instance p1, Landroid/animation/ValueAnimator;

    .line 48
    .line 49
    invoke-direct {p1}, Landroid/animation/ValueAnimator;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, Loo;->y:Landroid/animation/ValueAnimator;

    .line 53
    .line 54
    const-wide/16 v1, 0x3e8

    .line 55
    .line 56
    invoke-virtual {p1, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 57
    .line 58
    .line 59
    const/4 v1, 0x2

    .line 60
    new-array v1, v1, [F

    .line 61
    .line 62
    fill-array-data v1, :array_0

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v1}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    .line 66
    .line 67
    .line 68
    const/4 v1, -0x1

    .line 69
    invoke-virtual {p1, v1}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 70
    .line 71
    .line 72
    new-instance v1, Le5;

    .line 73
    .line 74
    invoke-direct {v1, p0, p2, p3}, Le5;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p2, p3}, Lv60;->c(Z)Z

    .line 81
    .line 82
    .line 83
    move-result p3

    .line 84
    if-eqz p3, :cond_0

    .line 85
    .line 86
    iget p2, p2, Lv60;->m:I

    .line 87
    .line 88
    if-eqz p2, :cond_0

    .line 89
    .line 90
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 91
    .line 92
    .line 93
    :cond_0
    iget p1, p0, Laq;->n:F

    .line 94
    .line 95
    cmpl-float p1, p1, v0

    .line 96
    .line 97
    if-eqz p1, :cond_1

    .line 98
    .line 99
    iput v0, p0, Laq;->n:F

    .line 100
    .line 101
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 102
    .line 103
    .line 104
    :cond_1
    return-void

    .line 105
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Landroid/graphics/Rect;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_9

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_9

    .line 18
    .line 19
    iget-object v1, v0, Laq;->q:Landroid/graphics/Rect;

    .line 20
    .line 21
    move-object/from16 v3, p1

    .line 22
    .line 23
    invoke-virtual {v3, v1}, Landroid/graphics/Canvas;->getClipBounds(Landroid/graphics/Rect;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    goto/16 :goto_8

    .line 30
    .line 31
    :cond_0
    invoke-virtual {v3}, Landroid/graphics/Canvas;->save()I

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-virtual {v0}, Laq;->b()F

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    iget-object v1, v0, Laq;->i:Landroid/animation/ObjectAnimator;

    .line 43
    .line 44
    const/4 v13, 0x1

    .line 45
    const/4 v14, 0x0

    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-nez v1, :cond_1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    move v6, v13

    .line 56
    goto :goto_1

    .line 57
    :cond_2
    :goto_0
    move v6, v14

    .line 58
    :goto_1
    iget-object v1, v0, Laq;->j:Landroid/animation/ObjectAnimator;

    .line 59
    .line 60
    if-eqz v1, :cond_4

    .line 61
    .line 62
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-nez v1, :cond_3

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_3
    move v7, v13

    .line 70
    goto :goto_3

    .line 71
    :cond_4
    :goto_2
    move v7, v14

    .line 72
    :goto_3
    iget-object v2, v0, Loo;->s:Lm60;

    .line 73
    .line 74
    invoke-virtual/range {v2 .. v7}, Leq;->c(Landroid/graphics/Canvas;Landroid/graphics/Rect;FZZ)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Laq;->c()F

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    iget-object v10, v0, Loo;->v:Lcq;

    .line 82
    .line 83
    iput v1, v10, Lcq;->f:F

    .line 84
    .line 85
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 86
    .line 87
    iget-object v4, v0, Laq;->o:Landroid/graphics/Paint;

    .line 88
    .line 89
    invoke-virtual {v4, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v4, v13}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 93
    .line 94
    .line 95
    iget-object v15, v0, Laq;->g:Lv60;

    .line 96
    .line 97
    iget-object v2, v15, Lv60;->e:[I

    .line 98
    .line 99
    aget v2, v2, v14

    .line 100
    .line 101
    iput v2, v10, Lcq;->c:I

    .line 102
    .line 103
    iget v2, v15, Lv60;->i:I

    .line 104
    .line 105
    const/4 v11, 0x0

    .line 106
    if-lez v2, :cond_6

    .line 107
    .line 108
    iget-object v3, v0, Loo;->s:Lm60;

    .line 109
    .line 110
    if-eqz v3, :cond_5

    .line 111
    .line 112
    :goto_4
    move v9, v2

    .line 113
    goto :goto_5

    .line 114
    :cond_5
    int-to-float v2, v2

    .line 115
    iget v3, v10, Lcq;->b:F

    .line 116
    .line 117
    const v5, 0x3c23d70a    # 0.01f

    .line 118
    .line 119
    .line 120
    invoke-static {v3, v11, v5}, Lbd2;->g(FFF)F

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    mul-float/2addr v3, v2

    .line 125
    div-float/2addr v3, v5

    .line 126
    float-to-int v2, v3

    .line 127
    goto :goto_4

    .line 128
    :goto_5
    iget v5, v10, Lcq;->b:F

    .line 129
    .line 130
    iget v7, v15, Lv60;->f:I

    .line 131
    .line 132
    iget v8, v0, Laq;->p:I

    .line 133
    .line 134
    iget-object v2, v0, Loo;->s:Lm60;

    .line 135
    .line 136
    const/high16 v6, 0x3f800000    # 1.0f

    .line 137
    .line 138
    move-object/from16 v3, p1

    .line 139
    .line 140
    invoke-virtual/range {v2 .. v9}, Lm60;->g(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFIII)V

    .line 141
    .line 142
    .line 143
    goto :goto_6

    .line 144
    :cond_6
    iget v7, v15, Lv60;->f:I

    .line 145
    .line 146
    iget v8, v0, Laq;->p:I

    .line 147
    .line 148
    const/4 v9, 0x0

    .line 149
    iget-object v2, v0, Loo;->s:Lm60;

    .line 150
    .line 151
    const/4 v5, 0x0

    .line 152
    const/high16 v6, 0x3f800000    # 1.0f

    .line 153
    .line 154
    move-object/from16 v3, p1

    .line 155
    .line 156
    invoke-virtual/range {v2 .. v9}, Lm60;->g(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFIII)V

    .line 157
    .line 158
    .line 159
    :goto_6
    iget v2, v0, Laq;->p:I

    .line 160
    .line 161
    iget-object v3, v0, Loo;->s:Lm60;

    .line 162
    .line 163
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    iget v5, v10, Lcq;->c:I

    .line 167
    .line 168
    invoke-static {v5, v2}, Li41;->b(II)I

    .line 169
    .line 170
    .line 171
    move-result v7

    .line 172
    iget-boolean v2, v10, Lcq;->g:Z

    .line 173
    .line 174
    iput-boolean v2, v3, Lm60;->m:Z

    .line 175
    .line 176
    iget v5, v10, Lcq;->a:F

    .line 177
    .line 178
    iget v6, v10, Lcq;->b:F

    .line 179
    .line 180
    iget v8, v10, Lcq;->d:I

    .line 181
    .line 182
    iget v2, v10, Lcq;->e:F

    .line 183
    .line 184
    iget v9, v10, Lcq;->f:F

    .line 185
    .line 186
    const/4 v12, 0x1

    .line 187
    move v10, v11

    .line 188
    move v11, v9

    .line 189
    move v9, v8

    .line 190
    move/from16 v16, v10

    .line 191
    .line 192
    move v10, v2

    .line 193
    move-object v2, v3

    .line 194
    move-object/from16 v3, p1

    .line 195
    .line 196
    invoke-virtual/range {v2 .. v12}, Lm60;->e(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFIIIFFZ)V

    .line 197
    .line 198
    .line 199
    iget-object v2, v15, Lv60;->e:[I

    .line 200
    .line 201
    aget v2, v2, v14

    .line 202
    .line 203
    iget v3, v0, Laq;->p:I

    .line 204
    .line 205
    iget-object v5, v0, Loo;->s:Lm60;

    .line 206
    .line 207
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    invoke-static {v2, v3}, Li41;->b(II)I

    .line 211
    .line 212
    .line 213
    move-result v2

    .line 214
    iput-boolean v14, v5, Lm60;->m:Z

    .line 215
    .line 216
    iget-object v3, v5, Leq;->a:Lv60;

    .line 217
    .line 218
    iget v6, v3, Lv60;->r:I

    .line 219
    .line 220
    if-lez v6, :cond_8

    .line 221
    .line 222
    if-eqz v2, :cond_8

    .line 223
    .line 224
    invoke-virtual {v4, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 228
    .line 229
    .line 230
    iget-object v1, v3, Lv60;->s:Ljava/lang/Integer;

    .line 231
    .line 232
    const/high16 v2, 0x40000000    # 2.0f

    .line 233
    .line 234
    if-eqz v1, :cond_7

    .line 235
    .line 236
    invoke-virtual {v1}, Ljava/lang/Integer;->floatValue()F

    .line 237
    .line 238
    .line 239
    move-result v1

    .line 240
    iget v6, v3, Lv60;->r:I

    .line 241
    .line 242
    int-to-float v6, v6

    .line 243
    div-float/2addr v6, v2

    .line 244
    add-float/2addr v6, v1

    .line 245
    goto :goto_7

    .line 246
    :cond_7
    iget v1, v5, Lm60;->g:F

    .line 247
    .line 248
    div-float v6, v1, v2

    .line 249
    .line 250
    :goto_7
    new-instance v1, Ldq;

    .line 251
    .line 252
    iget v7, v5, Lm60;->f:F

    .line 253
    .line 254
    div-float/2addr v7, v2

    .line 255
    sub-float/2addr v7, v6

    .line 256
    const/4 v2, 0x2

    .line 257
    new-array v6, v2, [F

    .line 258
    .line 259
    aput v7, v6, v14

    .line 260
    .line 261
    aput v16, v6, v13

    .line 262
    .line 263
    new-array v2, v2, [F

    .line 264
    .line 265
    fill-array-data v2, :array_0

    .line 266
    .line 267
    .line 268
    invoke-direct {v1, v6, v2}, Ldq;-><init>([F[F)V

    .line 269
    .line 270
    .line 271
    iget v2, v3, Lv60;->r:I

    .line 272
    .line 273
    int-to-float v6, v2

    .line 274
    iget v2, v5, Lm60;->h:F

    .line 275
    .line 276
    mul-float/2addr v2, v6

    .line 277
    iget v3, v5, Lm60;->g:F

    .line 278
    .line 279
    div-float v8, v2, v3

    .line 280
    .line 281
    const/4 v12, 0x0

    .line 282
    const/4 v13, 0x0

    .line 283
    const/4 v9, 0x0

    .line 284
    const/4 v10, 0x0

    .line 285
    const/4 v11, 0x0

    .line 286
    move v7, v6

    .line 287
    move-object/from16 v3, p1

    .line 288
    .line 289
    move-object v2, v5

    .line 290
    move-object v5, v1

    .line 291
    invoke-virtual/range {v2 .. v13}, Lm60;->f(Landroid/graphics/Canvas;Landroid/graphics/Paint;Ldq;FFFLdq;FFFZ)V

    .line 292
    .line 293
    .line 294
    :cond_8
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    .line 295
    .line 296
    .line 297
    :cond_9
    :goto_8
    return-void

    .line 298
    nop

    .line 299
    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public final e(ZZZ)Z
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Laq;->e(ZZZ)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget-object p2, p0, Laq;->h:Ls4;

    .line 6
    .line 7
    iget-object p3, p0, Laq;->f:Landroid/content/Context;

    .line 8
    .line 9
    invoke-virtual {p3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    const-string p2, "animator_duration_scale"

    .line 17
    .line 18
    const/high16 v0, 0x3f800000    # 1.0f

    .line 19
    .line 20
    invoke-static {p3, p2, v0}, Landroid/provider/Settings$Global;->getFloat(Landroid/content/ContentResolver;Ljava/lang/String;F)F

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    const/4 p3, 0x0

    .line 25
    cmpl-float p3, p2, p3

    .line 26
    .line 27
    if-nez p3, :cond_0

    .line 28
    .line 29
    const/4 p2, 0x1

    .line 30
    iput-boolean p2, p0, Loo;->x:Z

    .line 31
    .line 32
    return p1

    .line 33
    :cond_0
    const/4 p3, 0x0

    .line 34
    iput-boolean p3, p0, Loo;->x:Z

    .line 35
    .line 36
    const/high16 p3, 0x42480000    # 50.0f

    .line 37
    .line 38
    div-float/2addr p3, p2

    .line 39
    iget-object p2, p0, Loo;->t:Lox0;

    .line 40
    .line 41
    invoke-virtual {p2, p3}, Lox0;->b(F)V

    .line 42
    .line 43
    .line 44
    return p1
.end method

.method public final getIntrinsicHeight()I
    .locals 1

    .line 1
    iget-object v0, p0, Loo;->s:Lm60;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm60;->a()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final getIntrinsicWidth()I
    .locals 1

    .line 1
    iget-object v0, p0, Loo;->s:Lm60;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 v0, -0x1

    .line 7
    return v0
.end method

.method public final jumpToCurrentState()V
    .locals 2

    .line 1
    iget-object v0, p0, Loo;->u:Lnx0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lnx0;->d()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getLevel()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    int-to-float v0, v0

    .line 11
    const v1, 0x461c4000    # 10000.0f

    .line 12
    .line 13
    .line 14
    div-float/2addr v0, v1

    .line 15
    iget-object v1, p0, Loo;->v:Lcq;

    .line 16
    .line 17
    iput v0, v1, Lcq;->b:F

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final onLevelChange(I)Z
    .locals 6

    .line 1
    int-to-float p1, p1

    .line 2
    const/high16 v0, 0x447a0000    # 1000.0f

    .line 3
    .line 4
    cmpl-float v0, p1, v0

    .line 5
    .line 6
    if-ltz v0, :cond_0

    .line 7
    .line 8
    const v0, 0x460ca000    # 9000.0f

    .line 9
    .line 10
    .line 11
    cmpg-float v0, p1, v0

    .line 12
    .line 13
    if-gtz v0, :cond_0

    .line 14
    .line 15
    const/high16 v0, 0x3f800000    # 1.0f

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    iget-boolean v1, p0, Loo;->x:Z

    .line 20
    .line 21
    iget-object v2, p0, Loo;->v:Lcq;

    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    const v4, 0x461c4000    # 10000.0f

    .line 25
    .line 26
    .line 27
    iget-object v5, p0, Loo;->u:Lnx0;

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    invoke-virtual {v5}, Lnx0;->d()V

    .line 32
    .line 33
    .line 34
    div-float/2addr p1, v4

    .line 35
    iput p1, v2, Lcq;->b:F

    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 38
    .line 39
    .line 40
    iput v0, v2, Lcq;->e:F

    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 43
    .line 44
    .line 45
    return v3

    .line 46
    :cond_1
    iget v0, v2, Lcq;->b:F

    .line 47
    .line 48
    mul-float/2addr v0, v4

    .line 49
    iput v0, v5, Lnx0;->b:F

    .line 50
    .line 51
    iput-boolean v3, v5, Lnx0;->c:Z

    .line 52
    .line 53
    invoke-virtual {v5, p1}, Lnx0;->a(F)V

    .line 54
    .line 55
    .line 56
    return v3
.end method
