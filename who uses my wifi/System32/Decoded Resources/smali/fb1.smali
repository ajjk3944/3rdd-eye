.class public final Lfb1;
.super Le9;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final n:Leb1;

.field public final o:Landroid/graphics/Path;

.field public final p:Landroid/graphics/RectF;

.field public q:[F

.field public final r:Landroid/graphics/Path;

.field public final s:[F


# direct methods
.method public constructor <init>(Lu61;Leb1;Luk1;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p3, p2}, Le9;-><init>(Lu61;Luk1;Ld9;)V

    .line 2
    .line 3
    .line 4
    new-instance p3, Landroid/graphics/Path;

    .line 5
    .line 6
    invoke-direct {p3}, Landroid/graphics/Path;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p3, p0, Lfb1;->o:Landroid/graphics/Path;

    .line 10
    .line 11
    new-instance p3, Landroid/graphics/RectF;

    .line 12
    .line 13
    invoke-direct {p3}, Landroid/graphics/RectF;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p3, p0, Lfb1;->p:Landroid/graphics/RectF;

    .line 17
    .line 18
    const/4 p3, 0x2

    .line 19
    new-array v0, p3, [F

    .line 20
    .line 21
    iput-object v0, p0, Lfb1;->q:[F

    .line 22
    .line 23
    new-instance v0, Landroid/graphics/Path;

    .line 24
    .line 25
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 26
    .line 27
    .line 28
    new-instance v0, Landroid/graphics/RectF;

    .line 29
    .line 30
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 31
    .line 32
    .line 33
    new-instance v0, Landroid/graphics/Path;

    .line 34
    .line 35
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Lfb1;->r:Landroid/graphics/Path;

    .line 39
    .line 40
    new-array p3, p3, [F

    .line 41
    .line 42
    iput-object p3, p0, Lfb1;->s:[F

    .line 43
    .line 44
    new-instance p3, Landroid/graphics/RectF;

    .line 45
    .line 46
    invoke-direct {p3}, Landroid/graphics/RectF;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object p2, p0, Lfb1;->n:Leb1;

    .line 50
    .line 51
    if-eqz p1, :cond_0

    .line 52
    .line 53
    iget-object p1, p0, Le9;->l:Landroid/graphics/Paint;

    .line 54
    .line 55
    const/high16 p2, -0x1000000

    .line 56
    .line 57
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 58
    .line 59
    .line 60
    iget-object p1, p0, Le9;->l:Landroid/graphics/Paint;

    .line 61
    .line 62
    const/high16 p2, 0x41200000    # 10.0f

    .line 63
    .line 64
    invoke-static {p2}, Lk41;->c(F)F

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 69
    .line 70
    .line 71
    new-instance p1, Landroid/graphics/Paint;

    .line 72
    .line 73
    const/4 p2, 0x1

    .line 74
    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    .line 75
    .line 76
    .line 77
    const p2, -0x777778

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 81
    .line 82
    .line 83
    const/high16 p2, 0x3f800000    # 1.0f

    .line 84
    .line 85
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 86
    .line 87
    .line 88
    sget-object p2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 89
    .line 90
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 91
    .line 92
    .line 93
    :cond_0
    return-void
.end method


# virtual methods
.method public final W1()[F
    .locals 6

    .line 1
    iget-object v0, p0, Lfb1;->q:[F

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    iget-object v1, p0, Lfb1;->n:Leb1;

    .line 5
    .line 6
    iget v2, v1, Ld9;->l:I

    .line 7
    .line 8
    mul-int/lit8 v3, v2, 0x2

    .line 9
    .line 10
    if-eq v0, v3, :cond_0

    .line 11
    .line 12
    mul-int/lit8 v2, v2, 0x2

    .line 13
    .line 14
    new-array v0, v2, [F

    .line 15
    .line 16
    iput-object v0, p0, Lfb1;->q:[F

    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lfb1;->q:[F

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    :goto_0
    array-length v3, v0

    .line 22
    if-ge v2, v3, :cond_1

    .line 23
    .line 24
    add-int/lit8 v3, v2, 0x1

    .line 25
    .line 26
    iget-object v4, v1, Ld9;->k:[F

    .line 27
    .line 28
    div-int/lit8 v5, v2, 0x2

    .line 29
    .line 30
    aget v4, v4, v5

    .line 31
    .line 32
    aput v4, v0, v3

    .line 33
    .line 34
    add-int/lit8 v2, v2, 0x2

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    iget-object v1, p0, Le9;->j:Luk1;

    .line 38
    .line 39
    invoke-virtual {v1, v0}, Luk1;->e([F)V

    .line 40
    .line 41
    .line 42
    return-object v0
.end method

.method public final X1(Landroid/graphics/Canvas;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lf74;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lu61;

    .line 4
    .line 5
    iget-object v1, p0, Lfb1;->n:Leb1;

    .line 6
    .line 7
    iget-boolean v2, v1, Ldh;->a:Z

    .line 8
    .line 9
    if-eqz v2, :cond_7

    .line 10
    .line 11
    iget-boolean v2, v1, Ld9;->r:Z

    .line 12
    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    goto/16 :goto_6

    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0}, Lfb1;->W1()[F

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    const/4 v3, 0x0

    .line 22
    iget-object v4, p0, Le9;->l:Landroid/graphics/Paint;

    .line 23
    .line 24
    invoke-virtual {v4, v3}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 25
    .line 26
    .line 27
    iget v3, v1, Ldh;->d:F

    .line 28
    .line 29
    invoke-virtual {v4, v3}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 30
    .line 31
    .line 32
    iget v3, v1, Ldh;->e:I

    .line 33
    .line 34
    invoke-virtual {v4, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 35
    .line 36
    .line 37
    iget v3, v1, Ldh;->b:F

    .line 38
    .line 39
    const-string v5, "A"

    .line 40
    .line 41
    invoke-static {v4, v5}, Lk41;->a(Landroid/graphics/Paint;Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    int-to-float v5, v5

    .line 46
    const/high16 v6, 0x40200000    # 2.5f

    .line 47
    .line 48
    div-float/2addr v5, v6

    .line 49
    iget v6, v1, Ldh;->c:F

    .line 50
    .line 51
    add-float/2addr v5, v6

    .line 52
    iget v6, v1, Leb1;->D:I

    .line 53
    .line 54
    iget v7, v1, Leb1;->C:I

    .line 55
    .line 56
    const/4 v8, 0x1

    .line 57
    if-ne v6, v8, :cond_2

    .line 58
    .line 59
    if-ne v7, v8, :cond_1

    .line 60
    .line 61
    sget-object v6, Landroid/graphics/Paint$Align;->RIGHT:Landroid/graphics/Paint$Align;

    .line 62
    .line 63
    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 64
    .line 65
    .line 66
    iget-object v0, v0, Lu61;->b:Landroid/graphics/RectF;

    .line 67
    .line 68
    iget v0, v0, Landroid/graphics/RectF;->left:F

    .line 69
    .line 70
    :goto_0
    sub-float/2addr v0, v3

    .line 71
    goto :goto_2

    .line 72
    :cond_1
    sget-object v6, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    .line 73
    .line 74
    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 75
    .line 76
    .line 77
    iget-object v0, v0, Lu61;->b:Landroid/graphics/RectF;

    .line 78
    .line 79
    iget v0, v0, Landroid/graphics/RectF;->left:F

    .line 80
    .line 81
    :goto_1
    add-float/2addr v0, v3

    .line 82
    goto :goto_2

    .line 83
    :cond_2
    if-ne v7, v8, :cond_3

    .line 84
    .line 85
    sget-object v6, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    .line 86
    .line 87
    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 88
    .line 89
    .line 90
    iget-object v0, v0, Lu61;->b:Landroid/graphics/RectF;

    .line 91
    .line 92
    iget v0, v0, Landroid/graphics/RectF;->right:F

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_3
    sget-object v6, Landroid/graphics/Paint$Align;->RIGHT:Landroid/graphics/Paint$Align;

    .line 96
    .line 97
    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 98
    .line 99
    .line 100
    iget-object v0, v0, Lu61;->b:Landroid/graphics/RectF;

    .line 101
    .line 102
    iget v0, v0, Landroid/graphics/RectF;->right:F

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :goto_2
    iget-boolean v3, v1, Leb1;->y:Z

    .line 106
    .line 107
    xor-int/2addr v3, v8

    .line 108
    iget-boolean v6, v1, Leb1;->z:Z

    .line 109
    .line 110
    if-eqz v6, :cond_4

    .line 111
    .line 112
    iget v6, v1, Ld9;->l:I

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_4
    iget v6, v1, Ld9;->l:I

    .line 116
    .line 117
    sub-int/2addr v6, v8

    .line 118
    :goto_3
    if-ge v3, v6, :cond_7

    .line 119
    .line 120
    if-ltz v3, :cond_6

    .line 121
    .line 122
    iget-object v7, v1, Ld9;->k:[F

    .line 123
    .line 124
    array-length v7, v7

    .line 125
    if-lt v3, v7, :cond_5

    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_5
    invoke-virtual {v1}, Ld9;->c()Ln41;

    .line 129
    .line 130
    .line 131
    move-result-object v7

    .line 132
    iget-object v9, v1, Ld9;->k:[F

    .line 133
    .line 134
    aget v9, v9, v3

    .line 135
    .line 136
    invoke-virtual {v7, v9}, Ln41;->a(F)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v7

    .line 140
    goto :goto_5

    .line 141
    :cond_6
    :goto_4
    const-string v7, ""

    .line 142
    .line 143
    :goto_5
    mul-int/lit8 v9, v3, 0x2

    .line 144
    .line 145
    add-int/2addr v9, v8

    .line 146
    aget v9, v2, v9

    .line 147
    .line 148
    add-float/2addr v9, v5

    .line 149
    invoke-virtual {p1, v7, v0, v9, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 150
    .line 151
    .line 152
    add-int/lit8 v3, v3, 0x1

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_7
    :goto_6
    return-void
.end method

.method public final Y1(Landroid/graphics/Canvas;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lf74;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lu61;

    .line 4
    .line 5
    iget-object v1, p0, Lfb1;->n:Leb1;

    .line 6
    .line 7
    iget-boolean v2, v1, Ldh;->a:Z

    .line 8
    .line 9
    if-eqz v2, :cond_2

    .line 10
    .line 11
    iget-boolean v2, v1, Ld9;->q:Z

    .line 12
    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget v2, v1, Ld9;->i:I

    .line 17
    .line 18
    iget-object v8, p0, Le9;->m:Landroid/graphics/Paint;

    .line 19
    .line 20
    invoke-virtual {v8, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 21
    .line 22
    .line 23
    iget v2, v1, Ld9;->j:F

    .line 24
    .line 25
    invoke-virtual {v8, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 26
    .line 27
    .line 28
    iget v1, v1, Leb1;->D:I

    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    if-ne v1, v2, :cond_1

    .line 32
    .line 33
    iget-object v0, v0, Lu61;->b:Landroid/graphics/RectF;

    .line 34
    .line 35
    iget v4, v0, Landroid/graphics/RectF;->left:F

    .line 36
    .line 37
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 38
    .line 39
    iget v7, v0, Landroid/graphics/RectF;->bottom:F

    .line 40
    .line 41
    move v6, v4

    .line 42
    move-object v3, p1

    .line 43
    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    move-object v3, p1

    .line 48
    iget-object p1, v0, Lu61;->b:Landroid/graphics/RectF;

    .line 49
    .line 50
    iget v4, p1, Landroid/graphics/RectF;->right:F

    .line 51
    .line 52
    iget v5, p1, Landroid/graphics/RectF;->top:F

    .line 53
    .line 54
    iget v7, p1, Landroid/graphics/RectF;->bottom:F

    .line 55
    .line 56
    move v6, v4

    .line 57
    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 58
    .line 59
    .line 60
    :cond_2
    :goto_0
    return-void
.end method

.method public final Z1(Landroid/graphics/Canvas;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lf74;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lu61;

    .line 4
    .line 5
    iget-object v1, p0, Lfb1;->n:Leb1;

    .line 6
    .line 7
    iget-boolean v2, v1, Ldh;->a:Z

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    iget-boolean v2, v1, Ld9;->p:Z

    .line 13
    .line 14
    if-eqz v2, :cond_2

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    iget-object v3, v0, Lu61;->b:Landroid/graphics/RectF;

    .line 21
    .line 22
    iget-object v0, v0, Lu61;->b:Landroid/graphics/RectF;

    .line 23
    .line 24
    iget-object v4, p0, Lfb1;->p:Landroid/graphics/RectF;

    .line 25
    .line 26
    invoke-virtual {v4, v3}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 27
    .line 28
    .line 29
    iget-object v3, p0, Le9;->i:Ld9;

    .line 30
    .line 31
    iget v3, v3, Ld9;->h:F

    .line 32
    .line 33
    neg-float v3, v3

    .line 34
    const/4 v5, 0x0

    .line 35
    invoke-virtual {v4, v5, v3}, Landroid/graphics/RectF;->inset(FF)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;)Z

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lfb1;->W1()[F

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    iget v4, v1, Ld9;->g:I

    .line 46
    .line 47
    iget-object v5, p0, Le9;->k:Landroid/graphics/Paint;

    .line 48
    .line 49
    invoke-virtual {v5, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 50
    .line 51
    .line 52
    iget v1, v1, Ld9;->h:F

    .line 53
    .line 54
    invoke-virtual {v5, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 55
    .line 56
    .line 57
    const/4 v1, 0x0

    .line 58
    invoke-virtual {v5, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 59
    .line 60
    .line 61
    iget-object v1, p0, Lfb1;->o:Landroid/graphics/Path;

    .line 62
    .line 63
    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    .line 64
    .line 65
    .line 66
    const/4 v4, 0x0

    .line 67
    :goto_0
    array-length v6, v3

    .line 68
    if-ge v4, v6, :cond_1

    .line 69
    .line 70
    iget v6, v0, Landroid/graphics/RectF;->left:F

    .line 71
    .line 72
    add-int/lit8 v7, v4, 0x1

    .line 73
    .line 74
    aget v8, v3, v7

    .line 75
    .line 76
    invoke-virtual {v1, v6, v8}, Landroid/graphics/Path;->moveTo(FF)V

    .line 77
    .line 78
    .line 79
    iget v6, v0, Landroid/graphics/RectF;->right:F

    .line 80
    .line 81
    aget v7, v3, v7

    .line 82
    .line 83
    invoke-virtual {v1, v6, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, v1, v5}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    .line 90
    .line 91
    .line 92
    add-int/lit8 v4, v4, 0x2

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_1
    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 96
    .line 97
    .line 98
    :cond_2
    :goto_1
    return-void
.end method

.method public final a2()V
    .locals 5

    .line 1
    iget-object v0, p0, Lfb1;->n:Leb1;

    .line 2
    .line 3
    iget-object v0, v0, Ld9;->s:Ljava/util/ArrayList;

    .line 4
    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-gtz v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v1, p0, Lfb1;->s:[F

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    aput v3, v1, v2

    .line 19
    .line 20
    const/4 v4, 0x1

    .line 21
    aput v3, v1, v4

    .line 22
    .line 23
    iget-object v1, p0, Lfb1;->r:Landroid/graphics/Path;

    .line 24
    .line 25
    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-gtz v1, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    new-instance v0, Ljava/lang/ClassCastException;

    .line 43
    .line 44
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 45
    .line 46
    .line 47
    throw v0

    .line 48
    :cond_2
    :goto_0
    return-void
.end method
