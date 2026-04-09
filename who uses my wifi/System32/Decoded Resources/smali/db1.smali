.class public final Ldb1;
.super Le9;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public n:Lcb1;

.field public o:Landroid/graphics/Path;

.field public p:[F

.field public q:Landroid/graphics/RectF;

.field public r:[F


# virtual methods
.method public final U1(FF)V
    .locals 6

    .line 1
    iget-object v0, p0, Lf74;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lu61;

    .line 4
    .line 5
    iget-object v1, v0, Lu61;->b:Landroid/graphics/RectF;

    .line 6
    .line 7
    iget-object v2, v0, Lu61;->b:Landroid/graphics/RectF;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/high16 v3, 0x41200000    # 10.0f

    .line 14
    .line 15
    cmpl-float v1, v1, v3

    .line 16
    .line 17
    if-lez v1, :cond_1

    .line 18
    .line 19
    iget v1, v0, Lu61;->i:F

    .line 20
    .line 21
    iget v0, v0, Lu61;->g:F

    .line 22
    .line 23
    cmpl-float v1, v1, v0

    .line 24
    .line 25
    if-gtz v1, :cond_0

    .line 26
    .line 27
    const/high16 v1, 0x3f800000    # 1.0f

    .line 28
    .line 29
    cmpl-float v0, v0, v1

    .line 30
    .line 31
    if-gtz v0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iget p1, v2, Landroid/graphics/RectF;->left:F

    .line 35
    .line 36
    iget p2, v2, Landroid/graphics/RectF;->top:F

    .line 37
    .line 38
    iget-object v0, p0, Le9;->j:Luk1;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    sget-object v1, Lz90;->i:Lni0;

    .line 44
    .line 45
    invoke-virtual {v1}, Lni0;->b()Lmi0;

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
    iget p1, v2, Landroid/graphics/RectF;->right:F

    .line 61
    .line 62
    iget p2, v2, Landroid/graphics/RectF;->top:F

    .line 63
    .line 64
    invoke-virtual {v1}, Lni0;->b()Lmi0;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    check-cast v2, Lz90;

    .line 69
    .line 70
    iput-wide v4, v2, Lz90;->g:D

    .line 71
    .line 72
    iput-wide v4, v2, Lz90;->h:D

    .line 73
    .line 74
    invoke-virtual {v0, p1, p2, v2}, Luk1;->b(FFLz90;)V

    .line 75
    .line 76
    .line 77
    iget-wide p1, v3, Lz90;->g:D

    .line 78
    .line 79
    double-to-float p1, p1

    .line 80
    iget-wide v4, v2, Lz90;->g:D

    .line 81
    .line 82
    double-to-float p2, v4

    .line 83
    invoke-virtual {v1, v3}, Lni0;->c(Lmi0;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1, v2}, Lni0;->c(Lmi0;)V

    .line 87
    .line 88
    .line 89
    :cond_1
    :goto_0
    invoke-virtual {p0, p1, p2}, Ldb1;->V1(FF)V

    .line 90
    .line 91
    .line 92
    return-void
.end method

.method public final V1(FF)V
    .locals 8

    .line 1
    invoke-super {p0, p1, p2}, Le9;->V1(FF)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Ldb1;->n:Lcb1;

    .line 5
    .line 6
    invoke-virtual {p1}, Ld9;->b()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    const/4 v0, 0x0

    .line 11
    iget-object v1, p0, Le9;->l:Landroid/graphics/Paint;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 14
    .line 15
    .line 16
    iget v0, p1, Ldh;->d:F

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 19
    .line 20
    .line 21
    invoke-static {v1, p2}, Lk41;->b(Landroid/graphics/Paint;Ljava/lang/String;)Lxt;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    iget v0, p2, Lxt;->g:F

    .line 26
    .line 27
    const-string v2, "Q"

    .line 28
    .line 29
    invoke-static {v1, v2}, Lk41;->a(Landroid/graphics/Paint;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    int-to-float v1, v1

    .line 34
    const/4 v2, 0x0

    .line 35
    float-to-double v2, v2

    .line 36
    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    .line 37
    .line 38
    .line 39
    move-result-wide v4

    .line 40
    double-to-float v4, v4

    .line 41
    mul-float/2addr v4, v0

    .line 42
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    .line 47
    .line 48
    .line 49
    move-result-wide v5

    .line 50
    double-to-float v5, v5

    .line 51
    mul-float/2addr v5, v1

    .line 52
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    add-float/2addr v5, v4

    .line 57
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    .line 58
    .line 59
    .line 60
    move-result-wide v6

    .line 61
    double-to-float v4, v6

    .line 62
    mul-float/2addr v4, v0

    .line 63
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    .line 68
    .line 69
    .line 70
    move-result-wide v2

    .line 71
    double-to-float v2, v2

    .line 72
    mul-float/2addr v2, v1

    .line 73
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    add-float/2addr v2, v4

    .line 78
    sget-object v3, Lxt;->i:Lni0;

    .line 79
    .line 80
    invoke-virtual {v3}, Lni0;->b()Lmi0;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    check-cast v4, Lxt;

    .line 85
    .line 86
    iput v5, v4, Lxt;->g:F

    .line 87
    .line 88
    iput v2, v4, Lxt;->h:F

    .line 89
    .line 90
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 91
    .line 92
    .line 93
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 94
    .line 95
    .line 96
    iget v0, v4, Lxt;->g:F

    .line 97
    .line 98
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 99
    .line 100
    .line 101
    iget v0, v4, Lxt;->h:F

    .line 102
    .line 103
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    iput v0, p1, Lcb1;->y:I

    .line 108
    .line 109
    invoke-virtual {v3, v4}, Lni0;->c(Lmi0;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v3, p2}, Lni0;->c(Lmi0;)V

    .line 113
    .line 114
    .line 115
    return-void
.end method

.method public final W1(Landroid/graphics/Canvas;FLaa0;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    iget-object v2, v0, Ldb1;->n:Lcb1;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget v3, v2, Ld9;->l:I

    .line 11
    .line 12
    mul-int/lit8 v3, v3, 0x2

    .line 13
    .line 14
    new-array v4, v3, [F

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    move v6, v5

    .line 18
    :goto_0
    if-ge v6, v3, :cond_0

    .line 19
    .line 20
    iget-object v7, v2, Ld9;->k:[F

    .line 21
    .line 22
    div-int/lit8 v8, v6, 0x2

    .line 23
    .line 24
    aget v7, v7, v8

    .line 25
    .line 26
    aput v7, v4, v6

    .line 27
    .line 28
    add-int/lit8 v6, v6, 0x2

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget-object v6, v0, Le9;->j:Luk1;

    .line 32
    .line 33
    invoke-virtual {v6, v4}, Luk1;->e([F)V

    .line 34
    .line 35
    .line 36
    move v6, v5

    .line 37
    :goto_1
    if-ge v6, v3, :cond_4

    .line 38
    .line 39
    aget v7, v4, v6

    .line 40
    .line 41
    iget-object v8, v0, Lf74;->g:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v8, Lu61;

    .line 44
    .line 45
    invoke-virtual {v8, v7}, Lu61;->b(F)Z

    .line 46
    .line 47
    .line 48
    move-result v9

    .line 49
    if-eqz v9, :cond_3

    .line 50
    .line 51
    invoke-virtual {v8, v7}, Lu61;->c(F)Z

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    if-eqz v8, :cond_3

    .line 56
    .line 57
    invoke-virtual {v2}, Ld9;->c()Ln41;

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    iget-object v9, v2, Ld9;->k:[F

    .line 62
    .line 63
    div-int/lit8 v10, v6, 0x2

    .line 64
    .line 65
    aget v9, v9, v10

    .line 66
    .line 67
    invoke-virtual {v8, v9}, Ln41;->a(F)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v8

    .line 71
    sget-object v9, Lk41;->i:Landroid/graphics/Paint$FontMetrics;

    .line 72
    .line 73
    iget-object v10, v0, Le9;->l:Landroid/graphics/Paint;

    .line 74
    .line 75
    invoke-virtual {v10, v9}, Landroid/graphics/Paint;->getFontMetrics(Landroid/graphics/Paint$FontMetrics;)F

    .line 76
    .line 77
    .line 78
    move-result v11

    .line 79
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 80
    .line 81
    .line 82
    move-result v12

    .line 83
    sget-object v13, Lk41;->h:Landroid/graphics/Rect;

    .line 84
    .line 85
    invoke-virtual {v10, v8, v5, v12, v13}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 86
    .line 87
    .line 88
    iget v12, v13, Landroid/graphics/Rect;->left:I

    .line 89
    .line 90
    int-to-float v12, v12

    .line 91
    const/4 v14, 0x0

    .line 92
    sub-float v12, v14, v12

    .line 93
    .line 94
    iget v9, v9, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 95
    .line 96
    neg-float v9, v9

    .line 97
    add-float/2addr v9, v14

    .line 98
    invoke-virtual {v10}, Landroid/graphics/Paint;->getTextAlign()Landroid/graphics/Paint$Align;

    .line 99
    .line 100
    .line 101
    move-result-object v15

    .line 102
    sget-object v5, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    .line 103
    .line 104
    invoke-virtual {v10, v5}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 105
    .line 106
    .line 107
    iget v5, v1, Laa0;->g:F

    .line 108
    .line 109
    cmpl-float v5, v5, v14

    .line 110
    .line 111
    if-nez v5, :cond_1

    .line 112
    .line 113
    iget v5, v1, Laa0;->h:F

    .line 114
    .line 115
    cmpl-float v5, v5, v14

    .line 116
    .line 117
    if-eqz v5, :cond_2

    .line 118
    .line 119
    :cond_1
    invoke-virtual {v13}, Landroid/graphics/Rect;->width()I

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    int-to-float v5, v5

    .line 124
    iget v13, v1, Laa0;->g:F

    .line 125
    .line 126
    mul-float/2addr v5, v13

    .line 127
    sub-float/2addr v12, v5

    .line 128
    iget v5, v1, Laa0;->h:F

    .line 129
    .line 130
    mul-float/2addr v11, v5

    .line 131
    sub-float/2addr v9, v11

    .line 132
    :cond_2
    add-float/2addr v12, v7

    .line 133
    add-float v9, v9, p2

    .line 134
    .line 135
    move-object/from16 v5, p1

    .line 136
    .line 137
    invoke-virtual {v5, v8, v12, v9, v10}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v10, v15}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 141
    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_3
    move-object/from16 v5, p1

    .line 145
    .line 146
    :goto_2
    add-int/lit8 v6, v6, 0x2

    .line 147
    .line 148
    const/4 v5, 0x0

    .line 149
    goto :goto_1

    .line 150
    :cond_4
    return-void
.end method

.method public final X1(Landroid/graphics/Canvas;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lf74;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lu61;

    .line 4
    .line 5
    iget-object v1, p0, Ldb1;->n:Lcb1;

    .line 6
    .line 7
    iget-boolean v2, v1, Ld9;->p:Z

    .line 8
    .line 9
    if-eqz v2, :cond_4

    .line 10
    .line 11
    iget-boolean v2, v1, Ldh;->a:Z

    .line 12
    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    goto/16 :goto_2

    .line 16
    .line 17
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    iget-object v3, p0, Ldb1;->q:Landroid/graphics/RectF;

    .line 22
    .line 23
    iget-object v4, v0, Lu61;->b:Landroid/graphics/RectF;

    .line 24
    .line 25
    iget-object v0, v0, Lu61;->b:Landroid/graphics/RectF;

    .line 26
    .line 27
    invoke-virtual {v3, v4}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 28
    .line 29
    .line 30
    iget-object v4, p0, Le9;->i:Ld9;

    .line 31
    .line 32
    iget v5, v4, Ld9;->h:F

    .line 33
    .line 34
    neg-float v5, v5

    .line 35
    const/4 v6, 0x0

    .line 36
    invoke-virtual {v3, v5, v6}, Landroid/graphics/RectF;->inset(FF)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;)Z

    .line 40
    .line 41
    .line 42
    iget-object v3, p0, Ldb1;->p:[F

    .line 43
    .line 44
    array-length v3, v3

    .line 45
    iget v4, v4, Ld9;->l:I

    .line 46
    .line 47
    mul-int/lit8 v4, v4, 0x2

    .line 48
    .line 49
    if-eq v3, v4, :cond_1

    .line 50
    .line 51
    iget v3, v1, Ld9;->l:I

    .line 52
    .line 53
    mul-int/lit8 v3, v3, 0x2

    .line 54
    .line 55
    new-array v3, v3, [F

    .line 56
    .line 57
    iput-object v3, p0, Ldb1;->p:[F

    .line 58
    .line 59
    :cond_1
    iget-object v3, p0, Ldb1;->p:[F

    .line 60
    .line 61
    const/4 v4, 0x0

    .line 62
    move v5, v4

    .line 63
    :goto_0
    array-length v6, v3

    .line 64
    if-ge v5, v6, :cond_2

    .line 65
    .line 66
    iget-object v6, v1, Ld9;->k:[F

    .line 67
    .line 68
    div-int/lit8 v7, v5, 0x2

    .line 69
    .line 70
    aget v8, v6, v7

    .line 71
    .line 72
    aput v8, v3, v5

    .line 73
    .line 74
    add-int/lit8 v8, v5, 0x1

    .line 75
    .line 76
    aget v6, v6, v7

    .line 77
    .line 78
    aput v6, v3, v8

    .line 79
    .line 80
    add-int/lit8 v5, v5, 0x2

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_2
    iget-object v5, p0, Le9;->j:Luk1;

    .line 84
    .line 85
    invoke-virtual {v5, v3}, Luk1;->e([F)V

    .line 86
    .line 87
    .line 88
    iget v5, v1, Ld9;->g:I

    .line 89
    .line 90
    iget-object v6, p0, Le9;->k:Landroid/graphics/Paint;

    .line 91
    .line 92
    invoke-virtual {v6, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 93
    .line 94
    .line 95
    iget v1, v1, Ld9;->h:F

    .line 96
    .line 97
    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 98
    .line 99
    .line 100
    const/4 v1, 0x0

    .line 101
    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 102
    .line 103
    .line 104
    iget-object v1, p0, Ldb1;->o:Landroid/graphics/Path;

    .line 105
    .line 106
    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    .line 107
    .line 108
    .line 109
    :goto_1
    array-length v5, v3

    .line 110
    if-ge v4, v5, :cond_3

    .line 111
    .line 112
    aget v5, v3, v4

    .line 113
    .line 114
    add-int/lit8 v7, v4, 0x1

    .line 115
    .line 116
    aget v7, v3, v7

    .line 117
    .line 118
    iget v7, v0, Landroid/graphics/RectF;->bottom:F

    .line 119
    .line 120
    invoke-virtual {v1, v5, v7}, Landroid/graphics/Path;->moveTo(FF)V

    .line 121
    .line 122
    .line 123
    iget v7, v0, Landroid/graphics/RectF;->top:F

    .line 124
    .line 125
    invoke-virtual {v1, v5, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1, v1, v6}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    .line 132
    .line 133
    .line 134
    add-int/lit8 v4, v4, 0x2

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_3
    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 138
    .line 139
    .line 140
    :cond_4
    :goto_2
    return-void
.end method
