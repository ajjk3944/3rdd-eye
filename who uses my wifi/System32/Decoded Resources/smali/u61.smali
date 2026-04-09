.class public final Lu61;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Landroid/graphics/Matrix;

.field public final b:Landroid/graphics/RectF;

.field public c:F

.field public d:F

.field public final e:F

.field public final f:F

.field public g:F

.field public h:F

.field public i:F

.field public j:F

.field public k:F

.field public l:F

.field public m:F

.field public final n:Landroid/graphics/Matrix;

.field public final o:[F


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Matrix;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lu61;->a:Landroid/graphics/Matrix;

    .line 10
    .line 11
    new-instance v0, Landroid/graphics/RectF;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lu61;->b:Landroid/graphics/RectF;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput v0, p0, Lu61;->c:F

    .line 20
    .line 21
    iput v0, p0, Lu61;->d:F

    .line 22
    .line 23
    const/high16 v1, 0x3f800000    # 1.0f

    .line 24
    .line 25
    iput v1, p0, Lu61;->e:F

    .line 26
    .line 27
    const v2, 0x7f7fffff    # Float.MAX_VALUE

    .line 28
    .line 29
    .line 30
    iput v2, p0, Lu61;->f:F

    .line 31
    .line 32
    iput v1, p0, Lu61;->g:F

    .line 33
    .line 34
    iput v2, p0, Lu61;->h:F

    .line 35
    .line 36
    iput v1, p0, Lu61;->i:F

    .line 37
    .line 38
    iput v1, p0, Lu61;->j:F

    .line 39
    .line 40
    iput v0, p0, Lu61;->k:F

    .line 41
    .line 42
    iput v0, p0, Lu61;->l:F

    .line 43
    .line 44
    iput v0, p0, Lu61;->m:F

    .line 45
    .line 46
    new-instance v0, Landroid/graphics/Matrix;

    .line 47
    .line 48
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, Lu61;->n:Landroid/graphics/Matrix;

    .line 52
    .line 53
    const/16 v0, 0x9

    .line 54
    .line 55
    new-array v0, v0, [F

    .line 56
    .line 57
    iput-object v0, p0, Lu61;->o:[F

    .line 58
    .line 59
    return-void
.end method


# virtual methods
.method public final a([FLandroid/view/View;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lu61;->n:Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lu61;->a:Landroid/graphics/Matrix;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    aget v1, p1, v1

    .line 13
    .line 14
    iget-object v2, p0, Lu61;->b:Landroid/graphics/RectF;

    .line 15
    .line 16
    iget v3, v2, Landroid/graphics/RectF;->left:F

    .line 17
    .line 18
    sub-float/2addr v1, v3

    .line 19
    const/4 v3, 0x1

    .line 20
    aget p1, p1, v3

    .line 21
    .line 22
    iget v2, v2, Landroid/graphics/RectF;->top:F

    .line 23
    .line 24
    sub-float/2addr p1, v2

    .line 25
    neg-float v1, v1

    .line 26
    neg-float p1, p1

    .line 27
    invoke-virtual {v0, v1, p1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v0, p2, v3}, Lu61;->e(Landroid/graphics/Matrix;Landroid/view/View;Z)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final b(F)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lu61;->b:Landroid/graphics/RectF;

    .line 2
    .line 3
    iget v0, v0, Landroid/graphics/RectF;->left:F

    .line 4
    .line 5
    const/high16 v1, 0x3f800000    # 1.0f

    .line 6
    .line 7
    add-float/2addr p1, v1

    .line 8
    cmpg-float p1, v0, p1

    .line 9
    .line 10
    if-gtz p1, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    return p1

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    return p1
.end method

.method public final c(F)Z
    .locals 2

    .line 1
    const/high16 v0, 0x42c80000    # 100.0f

    .line 2
    .line 3
    mul-float/2addr p1, v0

    .line 4
    float-to-int p1, p1

    .line 5
    int-to-float p1, p1

    .line 6
    div-float/2addr p1, v0

    .line 7
    iget-object v0, p0, Lu61;->b:Landroid/graphics/RectF;

    .line 8
    .line 9
    iget v0, v0, Landroid/graphics/RectF;->right:F

    .line 10
    .line 11
    const/high16 v1, 0x3f800000    # 1.0f

    .line 12
    .line 13
    sub-float/2addr p1, v1

    .line 14
    cmpl-float p1, v0, p1

    .line 15
    .line 16
    if-ltz p1, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    return p1

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    return p1
.end method

.method public final d(Landroid/graphics/Matrix;Landroid/graphics/RectF;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lu61;->o:[F

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->getValues([F)V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    aget v2, v0, v1

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    aget v4, v0, v3

    .line 11
    .line 12
    const/4 v5, 0x5

    .line 13
    aget v6, v0, v5

    .line 14
    .line 15
    const/4 v7, 0x4

    .line 16
    aget v8, v0, v7

    .line 17
    .line 18
    iget v9, p0, Lu61;->g:F

    .line 19
    .line 20
    invoke-static {v9, v4}, Ljava/lang/Math;->max(FF)F

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    iget v9, p0, Lu61;->h:F

    .line 25
    .line 26
    invoke-static {v4, v9}, Ljava/lang/Math;->min(FF)F

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    iput v4, p0, Lu61;->i:F

    .line 31
    .line 32
    iget v4, p0, Lu61;->e:F

    .line 33
    .line 34
    invoke-static {v4, v8}, Ljava/lang/Math;->max(FF)F

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    iget v8, p0, Lu61;->f:F

    .line 39
    .line 40
    invoke-static {v4, v8}, Ljava/lang/Math;->min(FF)F

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    iput v4, p0, Lu61;->j:F

    .line 45
    .line 46
    if-eqz p2, :cond_0

    .line 47
    .line 48
    invoke-virtual {p2}, Landroid/graphics/RectF;->width()F

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    invoke-virtual {p2}, Landroid/graphics/RectF;->height()F

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    const/4 v4, 0x0

    .line 58
    move p2, v4

    .line 59
    :goto_0
    neg-float v4, v4

    .line 60
    iget v8, p0, Lu61;->i:F

    .line 61
    .line 62
    const/high16 v9, 0x3f800000    # 1.0f

    .line 63
    .line 64
    sub-float/2addr v8, v9

    .line 65
    mul-float/2addr v8, v4

    .line 66
    iget v4, p0, Lu61;->l:F

    .line 67
    .line 68
    sub-float/2addr v8, v4

    .line 69
    invoke-static {v2, v8}, Ljava/lang/Math;->max(FF)F

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    iget v4, p0, Lu61;->l:F

    .line 74
    .line 75
    invoke-static {v2, v4}, Ljava/lang/Math;->min(FF)F

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    iput v2, p0, Lu61;->k:F

    .line 80
    .line 81
    iget v2, p0, Lu61;->j:F

    .line 82
    .line 83
    sub-float/2addr v2, v9

    .line 84
    mul-float/2addr v2, p2

    .line 85
    iget p2, p0, Lu61;->m:F

    .line 86
    .line 87
    add-float/2addr v2, p2

    .line 88
    invoke-static {v6, v2}, Ljava/lang/Math;->min(FF)F

    .line 89
    .line 90
    .line 91
    move-result p2

    .line 92
    iget v2, p0, Lu61;->m:F

    .line 93
    .line 94
    neg-float v2, v2

    .line 95
    invoke-static {p2, v2}, Ljava/lang/Math;->max(FF)F

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    iget v2, p0, Lu61;->k:F

    .line 100
    .line 101
    aput v2, v0, v1

    .line 102
    .line 103
    iget v1, p0, Lu61;->i:F

    .line 104
    .line 105
    aput v1, v0, v3

    .line 106
    .line 107
    aput p2, v0, v5

    .line 108
    .line 109
    iget p2, p0, Lu61;->j:F

    .line 110
    .line 111
    aput p2, v0, v7

    .line 112
    .line 113
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->setValues([F)V

    .line 114
    .line 115
    .line 116
    return-void
.end method

.method public final e(Landroid/graphics/Matrix;Landroid/view/View;Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lu61;->a:Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lu61;->b:Landroid/graphics/RectF;

    .line 7
    .line 8
    invoke-virtual {p0, v0, v1}, Lu61;->d(Landroid/graphics/Matrix;Landroid/graphics/RectF;)V

    .line 9
    .line 10
    .line 11
    if-eqz p3, :cond_0

    .line 12
    .line 13
    invoke-virtual {p2}, Landroid/view/View;->invalidate()V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
