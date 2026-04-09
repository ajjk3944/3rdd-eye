.class public final Lfv0;
.super Lkv0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final c:Lhv0;


# direct methods
.method public constructor <init>(Lhv0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lkv0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lfv0;->c:Lhv0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Matrix;Lru0;ILandroid/graphics/Canvas;)V
    .locals 22

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    move/from16 v1, p3

    .line 4
    .line 5
    move-object/from16 v2, p0

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    iget-object v4, v2, Lfv0;->c:Lhv0;

    .line 10
    .line 11
    iget v5, v4, Lhv0;->f:F

    .line 12
    .line 13
    iget v6, v4, Lhv0;->g:F

    .line 14
    .line 15
    new-instance v7, Landroid/graphics/RectF;

    .line 16
    .line 17
    iget v8, v4, Lhv0;->b:F

    .line 18
    .line 19
    iget v9, v4, Lhv0;->c:F

    .line 20
    .line 21
    iget v10, v4, Lhv0;->d:F

    .line 22
    .line 23
    iget v4, v4, Lhv0;->e:F

    .line 24
    .line 25
    invoke-direct {v7, v8, v9, v10, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 26
    .line 27
    .line 28
    iget-object v4, v0, Lru0;->e:Ljava/lang/Object;

    .line 29
    .line 30
    move-object v8, v4

    .line 31
    check-cast v8, Landroid/graphics/Paint;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    cmpg-float v9, v6, v4

    .line 35
    .line 36
    const/4 v10, 0x1

    .line 37
    const/4 v11, 0x0

    .line 38
    if-gez v9, :cond_0

    .line 39
    .line 40
    move v9, v10

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move v9, v11

    .line 43
    :goto_0
    iget-object v12, v0, Lru0;->h:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v12, Landroid/graphics/Path;

    .line 46
    .line 47
    const/4 v13, 0x3

    .line 48
    const/4 v14, 0x2

    .line 49
    sget-object v19, Lru0;->k:[I

    .line 50
    .line 51
    if-eqz v9, :cond_1

    .line 52
    .line 53
    aput v11, v19, v11

    .line 54
    .line 55
    iget v11, v0, Lru0;->c:I

    .line 56
    .line 57
    aput v11, v19, v10

    .line 58
    .line 59
    iget v11, v0, Lru0;->b:I

    .line 60
    .line 61
    aput v11, v19, v14

    .line 62
    .line 63
    iget v11, v0, Lru0;->a:I

    .line 64
    .line 65
    aput v11, v19, v13

    .line 66
    .line 67
    move/from16 v16, v4

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    invoke-virtual {v12}, Landroid/graphics/Path;->rewind()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v7}, Landroid/graphics/RectF;->centerX()F

    .line 74
    .line 75
    .line 76
    move-result v15

    .line 77
    move/from16 v16, v4

    .line 78
    .line 79
    invoke-virtual {v7}, Landroid/graphics/RectF;->centerY()F

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    invoke-virtual {v12, v15, v4}, Landroid/graphics/Path;->moveTo(FF)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v12, v7, v5, v6}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v12}, Landroid/graphics/Path;->close()V

    .line 90
    .line 91
    .line 92
    neg-int v4, v1

    .line 93
    int-to-float v4, v4

    .line 94
    invoke-virtual {v7, v4, v4}, Landroid/graphics/RectF;->inset(FF)V

    .line 95
    .line 96
    .line 97
    aput v11, v19, v11

    .line 98
    .line 99
    iget v4, v0, Lru0;->a:I

    .line 100
    .line 101
    aput v4, v19, v10

    .line 102
    .line 103
    iget v4, v0, Lru0;->b:I

    .line 104
    .line 105
    aput v4, v19, v14

    .line 106
    .line 107
    iget v4, v0, Lru0;->c:I

    .line 108
    .line 109
    aput v4, v19, v13

    .line 110
    .line 111
    :goto_1
    invoke-virtual {v7}, Landroid/graphics/RectF;->width()F

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    const/high16 v11, 0x40000000    # 2.0f

    .line 116
    .line 117
    div-float v18, v4, v11

    .line 118
    .line 119
    cmpg-float v4, v18, v16

    .line 120
    .line 121
    if-gtz v4, :cond_2

    .line 122
    .line 123
    return-void

    .line 124
    :cond_2
    int-to-float v1, v1

    .line 125
    div-float v1, v1, v18

    .line 126
    .line 127
    const/high16 v4, 0x3f800000    # 1.0f

    .line 128
    .line 129
    sub-float v1, v4, v1

    .line 130
    .line 131
    sub-float v13, v4, v1

    .line 132
    .line 133
    div-float/2addr v13, v11

    .line 134
    add-float/2addr v13, v1

    .line 135
    sget-object v20, Lru0;->l:[F

    .line 136
    .line 137
    aput v1, v20, v10

    .line 138
    .line 139
    aput v13, v20, v14

    .line 140
    .line 141
    new-instance v15, Landroid/graphics/RadialGradient;

    .line 142
    .line 143
    invoke-virtual {v7}, Landroid/graphics/RectF;->centerX()F

    .line 144
    .line 145
    .line 146
    move-result v16

    .line 147
    invoke-virtual {v7}, Landroid/graphics/RectF;->centerY()F

    .line 148
    .line 149
    .line 150
    move-result v17

    .line 151
    sget-object v21, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 152
    .line 153
    invoke-direct/range {v15 .. v21}, Landroid/graphics/RadialGradient;-><init>(FFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v8, v15}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v3}, Landroid/graphics/Canvas;->save()I

    .line 160
    .line 161
    .line 162
    move-object/from16 v1, p1

    .line 163
    .line 164
    invoke-virtual {v3, v1}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v7}, Landroid/graphics/RectF;->height()F

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    invoke-virtual {v7}, Landroid/graphics/RectF;->width()F

    .line 172
    .line 173
    .line 174
    move-result v10

    .line 175
    div-float/2addr v1, v10

    .line 176
    invoke-virtual {v3, v4, v1}, Landroid/graphics/Canvas;->scale(FF)V

    .line 177
    .line 178
    .line 179
    if-nez v9, :cond_3

    .line 180
    .line 181
    sget-object v1, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    .line 182
    .line 183
    invoke-virtual {v3, v12, v1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z

    .line 184
    .line 185
    .line 186
    iget-object v0, v0, Lru0;->g:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v0, Landroid/graphics/Paint;

    .line 189
    .line 190
    invoke-virtual {v3, v12, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 191
    .line 192
    .line 193
    :cond_3
    move-object v4, v7

    .line 194
    const/4 v7, 0x1

    .line 195
    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {p4 .. p4}, Landroid/graphics/Canvas;->restore()V

    .line 199
    .line 200
    .line 201
    return-void
.end method
