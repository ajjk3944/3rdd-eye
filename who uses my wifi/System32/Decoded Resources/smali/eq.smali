.class public abstract Leq;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Lv60;

.field public final b:Landroid/graphics/Path;

.field public final c:Landroid/graphics/Path;

.field public final d:Landroid/graphics/PathMeasure;

.field public final e:Landroid/graphics/Matrix;


# direct methods
.method public constructor <init>(Lv60;)V
    .locals 3

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
    iput-object v0, p0, Leq;->b:Landroid/graphics/Path;

    .line 10
    .line 11
    new-instance v1, Landroid/graphics/Path;

    .line 12
    .line 13
    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Leq;->c:Landroid/graphics/Path;

    .line 17
    .line 18
    new-instance v1, Landroid/graphics/PathMeasure;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-direct {v1, v0, v2}, Landroid/graphics/PathMeasure;-><init>(Landroid/graphics/Path;Z)V

    .line 22
    .line 23
    .line 24
    iput-object v1, p0, Leq;->d:Landroid/graphics/PathMeasure;

    .line 25
    .line 26
    iput-object p1, p0, Leq;->a:Lv60;

    .line 27
    .line 28
    new-instance p1, Landroid/graphics/Matrix;

    .line 29
    .line 30
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Leq;->e:Landroid/graphics/Matrix;

    .line 34
    .line 35
    return-void
.end method

.method public static d([F)F
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    aget v0, p0, v0

    .line 3
    .line 4
    float-to-double v0, v0

    .line 5
    const/4 v2, 0x0

    .line 6
    aget p0, p0, v2

    .line 7
    .line 8
    float-to-double v2, p0

    .line 9
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->atan2(DD)D

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    invoke-static {v0, v1}, Ljava/lang/Math;->toDegrees(D)D

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    double-to-float p0, v0

    .line 18
    return p0
.end method


# virtual methods
.method public abstract a()I
.end method

.method public abstract b()V
.end method

.method public final c(Landroid/graphics/Canvas;Landroid/graphics/Rect;FZZ)V
    .locals 9

    .line 1
    iget-object v0, p0, Leq;->a:Lv60;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv60;->d()V

    .line 4
    .line 5
    .line 6
    move-object v0, p0

    .line 7
    check-cast v0, Lm60;

    .line 8
    .line 9
    iget v1, v0, Lm60;->f:F

    .line 10
    .line 11
    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    int-to-float v2, v2

    .line 16
    cmpl-float v1, v1, v2

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    int-to-float v1, v1

    .line 25
    iput v1, v0, Lm60;->f:F

    .line 26
    .line 27
    invoke-virtual {v0}, Lm60;->b()V

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-virtual {v0}, Lm60;->a()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    int-to-float v1, v1

    .line 35
    iget v2, p2, Landroid/graphics/Rect;->left:I

    .line 36
    .line 37
    int-to-float v2, v2

    .line 38
    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    int-to-float v3, v3

    .line 43
    const/high16 v4, 0x40000000    # 2.0f

    .line 44
    .line 45
    div-float/2addr v3, v4

    .line 46
    add-float/2addr v3, v2

    .line 47
    iget v2, p2, Landroid/graphics/Rect;->top:I

    .line 48
    .line 49
    int-to-float v2, v2

    .line 50
    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    int-to-float v5, v5

    .line 55
    div-float/2addr v5, v4

    .line 56
    add-float/2addr v5, v2

    .line 57
    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    int-to-float p2, p2

    .line 62
    sub-float/2addr p2, v1

    .line 63
    div-float/2addr p2, v4

    .line 64
    const/4 v2, 0x0

    .line 65
    invoke-static {v2, p2}, Ljava/lang/Math;->max(FF)F

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    add-float/2addr p2, v5

    .line 70
    invoke-virtual {p1, v3, p2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 71
    .line 72
    .line 73
    iget-object p2, v0, Leq;->a:Lv60;

    .line 74
    .line 75
    iget-boolean v3, p2, Lv60;->q:Z

    .line 76
    .line 77
    const/high16 v5, -0x40800000    # -1.0f

    .line 78
    .line 79
    const/high16 v6, 0x3f800000    # 1.0f

    .line 80
    .line 81
    if-eqz v3, :cond_1

    .line 82
    .line 83
    invoke-virtual {p1, v5, v6}, Landroid/graphics/Canvas;->scale(FF)V

    .line 84
    .line 85
    .line 86
    :cond_1
    iget v3, v0, Lm60;->f:F

    .line 87
    .line 88
    div-float/2addr v3, v4

    .line 89
    div-float/2addr v1, v4

    .line 90
    neg-float v7, v3

    .line 91
    neg-float v8, v1

    .line 92
    invoke-virtual {p1, v7, v8, v3, v1}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 93
    .line 94
    .line 95
    iget v1, p2, Lv60;->a:I

    .line 96
    .line 97
    int-to-float v3, v1

    .line 98
    mul-float/2addr v3, p3

    .line 99
    iput v3, v0, Lm60;->g:F

    .line 100
    .line 101
    const/4 v3, 0x2

    .line 102
    div-int/2addr v1, v3

    .line 103
    invoke-virtual {p2}, Lv60;->a()I

    .line 104
    .line 105
    .line 106
    move-result v7

    .line 107
    invoke-static {v1, v7}, Ljava/lang/Math;->min(II)I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    int-to-float v1, v1

    .line 112
    mul-float/2addr v1, p3

    .line 113
    iput v1, v0, Lm60;->h:F

    .line 114
    .line 115
    iget v1, p2, Lv60;->l:I

    .line 116
    .line 117
    int-to-float v1, v1

    .line 118
    mul-float/2addr v1, p3

    .line 119
    iput v1, v0, Lm60;->j:F

    .line 120
    .line 121
    iget v1, p2, Lv60;->a:I

    .line 122
    .line 123
    int-to-float v1, v1

    .line 124
    div-float/2addr v1, v4

    .line 125
    invoke-virtual {p2}, Lv60;->b()I

    .line 126
    .line 127
    .line 128
    move-result v7

    .line 129
    int-to-float v7, v7

    .line 130
    invoke-static {v1, v7}, Ljava/lang/Math;->min(FF)F

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    mul-float/2addr v1, p3

    .line 135
    iput v1, v0, Lm60;->i:F

    .line 136
    .line 137
    const/4 v1, 0x3

    .line 138
    if-nez p4, :cond_2

    .line 139
    .line 140
    if-eqz p5, :cond_7

    .line 141
    .line 142
    :cond_2
    if-eqz p4, :cond_3

    .line 143
    .line 144
    iget v7, p2, Lv60;->g:I

    .line 145
    .line 146
    if-eq v7, v3, :cond_4

    .line 147
    .line 148
    :cond_3
    if-eqz p5, :cond_5

    .line 149
    .line 150
    iget v3, p2, Lv60;->h:I

    .line 151
    .line 152
    const/4 v7, 0x1

    .line 153
    if-ne v3, v7, :cond_5

    .line 154
    .line 155
    :cond_4
    invoke-virtual {p1, v6, v5}, Landroid/graphics/Canvas;->scale(FF)V

    .line 156
    .line 157
    .line 158
    :cond_5
    if-nez p4, :cond_6

    .line 159
    .line 160
    if-eqz p5, :cond_7

    .line 161
    .line 162
    iget p4, p2, Lv60;->h:I

    .line 163
    .line 164
    if-eq p4, v1, :cond_7

    .line 165
    .line 166
    :cond_6
    iget p4, p2, Lv60;->a:I

    .line 167
    .line 168
    int-to-float p4, p4

    .line 169
    sub-float v3, v6, p3

    .line 170
    .line 171
    mul-float/2addr v3, p4

    .line 172
    div-float/2addr v3, v4

    .line 173
    invoke-virtual {p1, v2, v3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 174
    .line 175
    .line 176
    :cond_7
    if-eqz p5, :cond_8

    .line 177
    .line 178
    iget p1, p2, Lv60;->h:I

    .line 179
    .line 180
    if-ne p1, v1, :cond_8

    .line 181
    .line 182
    iput p3, v0, Lm60;->n:F

    .line 183
    .line 184
    return-void

    .line 185
    :cond_8
    iput v6, v0, Lm60;->n:F

    .line 186
    .line 187
    return-void
.end method
