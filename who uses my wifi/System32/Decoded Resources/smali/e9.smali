.class public abstract Le9;
.super Lf74;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final i:Ld9;

.field public final j:Luk1;

.field public final k:Landroid/graphics/Paint;

.field public final l:Landroid/graphics/Paint;

.field public final m:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Lu61;Luk1;Ld9;)V
    .locals 2

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-direct {p0, v0, p1}, Lf74;-><init>(ILjava/lang/Object;)V

    .line 3
    .line 4
    .line 5
    iput-object p2, p0, Le9;->j:Luk1;

    .line 6
    .line 7
    iput-object p3, p0, Le9;->i:Ld9;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    new-instance p1, Landroid/graphics/Paint;

    .line 12
    .line 13
    const/4 p2, 0x1

    .line 14
    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Le9;->l:Landroid/graphics/Paint;

    .line 18
    .line 19
    new-instance p1, Landroid/graphics/Paint;

    .line 20
    .line 21
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Le9;->k:Landroid/graphics/Paint;

    .line 25
    .line 26
    const p3, -0x777778

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 30
    .line 31
    .line 32
    const/high16 p3, 0x3f800000    # 1.0f

    .line 33
    .line 34
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 35
    .line 36
    .line 37
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 38
    .line 39
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 40
    .line 41
    .line 42
    const/16 v1, 0x5a

    .line 43
    .line 44
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 45
    .line 46
    .line 47
    new-instance p1, Landroid/graphics/Paint;

    .line 48
    .line 49
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, Le9;->m:Landroid/graphics/Paint;

    .line 53
    .line 54
    const/high16 v1, -0x1000000

    .line 55
    .line 56
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 63
    .line 64
    .line 65
    new-instance p1, Landroid/graphics/Paint;

    .line 66
    .line 67
    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 71
    .line 72
    .line 73
    :cond_0
    return-void
.end method


# virtual methods
.method public U1(FF)V
    .locals 6

    .line 1
    iget-object v0, p0, Lf74;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lu61;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v1, v0, Lu61;->b:Landroid/graphics/RectF;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/high16 v3, 0x41200000    # 10.0f

    .line 14
    .line 15
    cmpl-float v2, v2, v3

    .line 16
    .line 17
    if-lez v2, :cond_1

    .line 18
    .line 19
    iget v2, v0, Lu61;->j:F

    .line 20
    .line 21
    iget v0, v0, Lu61;->e:F

    .line 22
    .line 23
    cmpl-float v2, v2, v0

    .line 24
    .line 25
    if-gtz v2, :cond_0

    .line 26
    .line 27
    const/high16 v2, 0x3f800000    # 1.0f

    .line 28
    .line 29
    cmpl-float v0, v0, v2

    .line 30
    .line 31
    if-gtz v0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iget p1, v1, Landroid/graphics/RectF;->left:F

    .line 35
    .line 36
    iget p2, v1, Landroid/graphics/RectF;->top:F

    .line 37
    .line 38
    iget-object v0, p0, Le9;->j:Luk1;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    sget-object v2, Lz90;->i:Lni0;

    .line 44
    .line 45
    invoke-virtual {v2}, Lni0;->b()Lmi0;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    check-cast v3, Lz90;

    .line 50
    .line 51
    const-wide/16 v4, 0x0

    .line 52
    .line 53
    iput-wide v4, v3, Lz90;->g:D

    .line 54
    .line 55
    iput-wide v4, v3, Lz90;->h:D

    .line 56
    .line 57
    invoke-virtual {v0, p1, p2, v3}, Luk1;->b(FFLz90;)V

    .line 58
    .line 59
    .line 60
    iget p1, v1, Landroid/graphics/RectF;->left:F

    .line 61
    .line 62
    iget p2, v1, Landroid/graphics/RectF;->bottom:F

    .line 63
    .line 64
    invoke-virtual {v2}, Lni0;->b()Lmi0;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    check-cast v1, Lz90;

    .line 69
    .line 70
    iput-wide v4, v1, Lz90;->g:D

    .line 71
    .line 72
    iput-wide v4, v1, Lz90;->h:D

    .line 73
    .line 74
    invoke-virtual {v0, p1, p2, v1}, Luk1;->b(FFLz90;)V

    .line 75
    .line 76
    .line 77
    iget-wide p1, v1, Lz90;->h:D

    .line 78
    .line 79
    double-to-float p1, p1

    .line 80
    iget-wide v4, v3, Lz90;->h:D

    .line 81
    .line 82
    double-to-float p2, v4

    .line 83
    invoke-virtual {v2, v3}, Lni0;->c(Lmi0;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v1}, Lni0;->c(Lmi0;)V

    .line 87
    .line 88
    .line 89
    :cond_1
    :goto_0
    invoke-virtual {p0, p1, p2}, Le9;->V1(FF)V

    .line 90
    .line 91
    .line 92
    return-void
.end method

.method public V1(FF)V
    .locals 18

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v1, Le9;->i:Ld9;

    .line 8
    .line 9
    iget v4, v3, Ld9;->n:I

    .line 10
    .line 11
    sub-float v5, v2, v0

    .line 12
    .line 13
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    float-to-double v5, v5

    .line 18
    const/4 v7, 0x0

    .line 19
    if-eqz v4, :cond_e

    .line 20
    .line 21
    const-wide/16 v8, 0x0

    .line 22
    .line 23
    cmpg-double v10, v5, v8

    .line 24
    .line 25
    if-lez v10, :cond_e

    .line 26
    .line 27
    invoke-static {v5, v6}, Ljava/lang/Double;->isInfinite(D)Z

    .line 28
    .line 29
    .line 30
    move-result v10

    .line 31
    if-eqz v10, :cond_0

    .line 32
    .line 33
    goto/16 :goto_6

    .line 34
    .line 35
    :cond_0
    int-to-double v10, v4

    .line 36
    div-double v10, v5, v10

    .line 37
    .line 38
    invoke-static {v10, v11}, Lk41;->d(D)F

    .line 39
    .line 40
    .line 41
    move-result v10

    .line 42
    float-to-double v10, v10

    .line 43
    invoke-static {v10, v11}, Ljava/lang/Math;->log10(D)D

    .line 44
    .line 45
    .line 46
    move-result-wide v12

    .line 47
    double-to-int v12, v12

    .line 48
    int-to-double v12, v12

    .line 49
    const-wide/high16 v14, 0x4024000000000000L    # 10.0

    .line 50
    .line 51
    invoke-static {v14, v15, v12, v13}, Ljava/lang/Math;->pow(DD)D

    .line 52
    .line 53
    .line 54
    move-result-wide v12

    .line 55
    invoke-static {v12, v13}, Lk41;->d(D)F

    .line 56
    .line 57
    .line 58
    move-result v12

    .line 59
    float-to-double v12, v12

    .line 60
    move-wide/from16 v16, v8

    .line 61
    .line 62
    div-double v8, v10, v12

    .line 63
    .line 64
    double-to-int v8, v8

    .line 65
    const/4 v9, 0x5

    .line 66
    if-le v8, v9, :cond_1

    .line 67
    .line 68
    mul-double/2addr v12, v14

    .line 69
    invoke-static {v12, v13}, Ljava/lang/Math;->floor(D)D

    .line 70
    .line 71
    .line 72
    move-result-wide v10

    .line 73
    :cond_1
    iget-boolean v8, v3, Ld9;->o:Z

    .line 74
    .line 75
    if-eqz v8, :cond_3

    .line 76
    .line 77
    double-to-float v2, v5

    .line 78
    add-int/lit8 v5, v4, -0x1

    .line 79
    .line 80
    int-to-float v5, v5

    .line 81
    div-float/2addr v2, v5

    .line 82
    float-to-double v10, v2

    .line 83
    iput v4, v3, Ld9;->l:I

    .line 84
    .line 85
    iget-object v2, v3, Ld9;->k:[F

    .line 86
    .line 87
    array-length v2, v2

    .line 88
    if-ge v2, v4, :cond_2

    .line 89
    .line 90
    new-array v2, v4, [F

    .line 91
    .line 92
    iput-object v2, v3, Ld9;->k:[F

    .line 93
    .line 94
    :cond_2
    move v2, v7

    .line 95
    :goto_0
    if-ge v2, v4, :cond_c

    .line 96
    .line 97
    iget-object v5, v3, Ld9;->k:[F

    .line 98
    .line 99
    aput v0, v5, v2

    .line 100
    .line 101
    float-to-double v5, v0

    .line 102
    add-double/2addr v5, v10

    .line 103
    double-to-float v0, v5

    .line 104
    add-int/lit8 v2, v2, 0x1

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_3
    cmpl-double v4, v10, v16

    .line 108
    .line 109
    if-nez v4, :cond_4

    .line 110
    .line 111
    move-wide/from16 v5, v16

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_4
    float-to-double v5, v0

    .line 115
    div-double/2addr v5, v10

    .line 116
    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    .line 117
    .line 118
    .line 119
    move-result-wide v5

    .line 120
    mul-double/2addr v5, v10

    .line 121
    :goto_1
    if-nez v4, :cond_5

    .line 122
    .line 123
    move-wide/from16 v8, v16

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_5
    float-to-double v8, v2

    .line 127
    div-double/2addr v8, v10

    .line 128
    invoke-static {v8, v9}, Ljava/lang/Math;->floor(D)D

    .line 129
    .line 130
    .line 131
    move-result-wide v8

    .line 132
    mul-double/2addr v8, v10

    .line 133
    const-wide/high16 v12, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    .line 134
    .line 135
    cmpl-double v0, v8, v12

    .line 136
    .line 137
    if-nez v0, :cond_6

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_6
    add-double v8, v8, v16

    .line 141
    .line 142
    invoke-static {v8, v9}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 143
    .line 144
    .line 145
    move-result-wide v12

    .line 146
    cmpl-double v0, v8, v16

    .line 147
    .line 148
    if-ltz v0, :cond_7

    .line 149
    .line 150
    const-wide/16 v8, 0x1

    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_7
    const-wide/16 v8, -0x1

    .line 154
    .line 155
    :goto_2
    add-long/2addr v12, v8

    .line 156
    invoke-static {v12, v13}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 157
    .line 158
    .line 159
    move-result-wide v8

    .line 160
    :goto_3
    if-eqz v4, :cond_8

    .line 161
    .line 162
    move-wide v12, v5

    .line 163
    move v0, v7

    .line 164
    :goto_4
    cmpg-double v2, v12, v8

    .line 165
    .line 166
    if-gtz v2, :cond_9

    .line 167
    .line 168
    add-int/lit8 v0, v0, 0x1

    .line 169
    .line 170
    add-double/2addr v12, v10

    .line 171
    goto :goto_4

    .line 172
    :cond_8
    move v0, v7

    .line 173
    :cond_9
    iput v0, v3, Ld9;->l:I

    .line 174
    .line 175
    iget-object v2, v3, Ld9;->k:[F

    .line 176
    .line 177
    array-length v2, v2

    .line 178
    if-ge v2, v0, :cond_a

    .line 179
    .line 180
    new-array v2, v0, [F

    .line 181
    .line 182
    iput-object v2, v3, Ld9;->k:[F

    .line 183
    .line 184
    :cond_a
    move v2, v7

    .line 185
    :goto_5
    if-ge v2, v0, :cond_c

    .line 186
    .line 187
    cmpl-double v4, v5, v16

    .line 188
    .line 189
    if-nez v4, :cond_b

    .line 190
    .line 191
    move-wide/from16 v5, v16

    .line 192
    .line 193
    :cond_b
    iget-object v4, v3, Ld9;->k:[F

    .line 194
    .line 195
    double-to-float v8, v5

    .line 196
    aput v8, v4, v2

    .line 197
    .line 198
    add-double/2addr v5, v10

    .line 199
    add-int/lit8 v2, v2, 0x1

    .line 200
    .line 201
    goto :goto_5

    .line 202
    :cond_c
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    .line 203
    .line 204
    cmpg-double v0, v10, v4

    .line 205
    .line 206
    if-gez v0, :cond_d

    .line 207
    .line 208
    invoke-static {v10, v11}, Ljava/lang/Math;->log10(D)D

    .line 209
    .line 210
    .line 211
    move-result-wide v4

    .line 212
    neg-double v4, v4

    .line 213
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 214
    .line 215
    .line 216
    move-result-wide v4

    .line 217
    double-to-int v0, v4

    .line 218
    iput v0, v3, Ld9;->m:I

    .line 219
    .line 220
    return-void

    .line 221
    :cond_d
    iput v7, v3, Ld9;->m:I

    .line 222
    .line 223
    return-void

    .line 224
    :cond_e
    :goto_6
    new-array v0, v7, [F

    .line 225
    .line 226
    iput-object v0, v3, Ld9;->k:[F

    .line 227
    .line 228
    iput v7, v3, Ld9;->l:I

    .line 229
    .line 230
    return-void
.end method
