.class public final Lh20;
.super Lda;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final D:Ld50;

.field public final E:Landroid/graphics/Rect;

.field public final F:Landroid/graphics/Rect;

.field public final G:Landroid/graphics/RectF;

.field public final H:Ll90;

.field public I:Lm41;

.field public J:Lm41;

.field public final K:Lpq;

.field public L:Lpi0;

.field public M:Lt3;


# direct methods
.method public constructor <init>(Li90;Lf50;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1, p2}, Lda;-><init>(Li90;Lf50;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ld50;

    .line 5
    .line 6
    const/4 v1, 0x3

    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v0, v1, v2}, Ld50;-><init>(II)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lh20;->D:Ld50;

    .line 12
    .line 13
    new-instance v0, Landroid/graphics/Rect;

    .line 14
    .line 15
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lh20;->E:Landroid/graphics/Rect;

    .line 19
    .line 20
    new-instance v0, Landroid/graphics/Rect;

    .line 21
    .line 22
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lh20;->F:Landroid/graphics/Rect;

    .line 26
    .line 27
    new-instance v0, Landroid/graphics/RectF;

    .line 28
    .line 29
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lh20;->G:Landroid/graphics/RectF;

    .line 33
    .line 34
    iget-object p2, p2, Lf50;->g:Ljava/lang/String;

    .line 35
    .line 36
    iget-object p1, p1, Li90;->f:Lu80;

    .line 37
    .line 38
    if-nez p1, :cond_0

    .line 39
    .line 40
    const/4 p1, 0x0

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-virtual {p1}, Lu80;->c()Ljava/util/Map;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    check-cast p1, Ljava/util/HashMap;

    .line 47
    .line 48
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    check-cast p1, Ll90;

    .line 53
    .line 54
    :goto_0
    iput-object p1, p0, Lh20;->H:Ll90;

    .line 55
    .line 56
    iget-object p1, p0, Lda;->p:Lf50;

    .line 57
    .line 58
    iget-object p1, p1, Lf50;->x:Lg4;

    .line 59
    .line 60
    if-eqz p1, :cond_1

    .line 61
    .line 62
    new-instance p2, Lpq;

    .line 63
    .line 64
    invoke-direct {p2, p0, p0, p1}, Lpq;-><init>(Lda;Lda;Lg4;)V

    .line 65
    .line 66
    .line 67
    iput-object p2, p0, Lh20;->K:Lpq;

    .line 68
    .line 69
    :cond_1
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lvq2;)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, Lda;->a(Ljava/lang/Object;Lvq2;)V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ln90;->F:Landroid/graphics/ColorFilter;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    new-instance p1, Lm41;

    .line 10
    .line 11
    invoke-direct {p1, v1, p2}, Lm41;-><init>(Ljava/lang/Object;Lvq2;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lh20;->I:Lm41;

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    sget-object v0, Ln90;->I:Landroid/graphics/Bitmap;

    .line 18
    .line 19
    if-ne p1, v0, :cond_1

    .line 20
    .line 21
    new-instance p1, Lm41;

    .line 22
    .line 23
    invoke-direct {p1, v1, p2}, Lm41;-><init>(Ljava/lang/Object;Lvq2;)V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lh20;->J:Lm41;

    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    const/4 v0, 0x5

    .line 30
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iget-object v1, p0, Lh20;->K:Lpq;

    .line 35
    .line 36
    if-ne p1, v0, :cond_2

    .line 37
    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    iget-object p1, v1, Lpq;->c:Lfg;

    .line 41
    .line 42
    invoke-virtual {p1, p2}, Lba;->j(Lvq2;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_2
    sget-object v0, Ln90;->B:Ljava/lang/Float;

    .line 47
    .line 48
    if-ne p1, v0, :cond_3

    .line 49
    .line 50
    if-eqz v1, :cond_3

    .line 51
    .line 52
    invoke-virtual {v1, p2}, Lpq;->b(Lvq2;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_3
    sget-object v0, Ln90;->C:Ljava/lang/Float;

    .line 57
    .line 58
    if-ne p1, v0, :cond_4

    .line 59
    .line 60
    if-eqz v1, :cond_4

    .line 61
    .line 62
    iget-object p1, v1, Lpq;->e:Lpu;

    .line 63
    .line 64
    invoke-virtual {p1, p2}, Lba;->j(Lvq2;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_4
    sget-object v0, Ln90;->D:Ljava/lang/Float;

    .line 69
    .line 70
    if-ne p1, v0, :cond_5

    .line 71
    .line 72
    if-eqz v1, :cond_5

    .line 73
    .line 74
    iget-object p1, v1, Lpq;->f:Lpu;

    .line 75
    .line 76
    invoke-virtual {p1, p2}, Lba;->j(Lvq2;)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :cond_5
    sget-object v0, Ln90;->E:Ljava/lang/Float;

    .line 81
    .line 82
    if-ne p1, v0, :cond_6

    .line 83
    .line 84
    if-eqz v1, :cond_6

    .line 85
    .line 86
    iget-object p1, v1, Lpq;->g:Lpu;

    .line 87
    .line 88
    invoke-virtual {p1, p2}, Lba;->j(Lvq2;)V

    .line 89
    .line 90
    .line 91
    :cond_6
    return-void
.end method

.method public final b(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V
    .locals 3

    .line 1
    invoke-super {p0, p1, p2, p3}, Lda;->b(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, Lh20;->H:Ll90;

    .line 5
    .line 6
    if-eqz p2, :cond_2

    .line 7
    .line 8
    iget p3, p2, Ll90;->b:I

    .line 9
    .line 10
    iget p2, p2, Ll90;->a:I

    .line 11
    .line 12
    invoke-static {}, Ll41;->c()F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v1, p0, Lda;->o:Li90;

    .line 17
    .line 18
    iget-boolean v1, v1, Li90;->r:Z

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    int-to-float p2, p2

    .line 24
    mul-float/2addr p2, v0

    .line 25
    int-to-float p3, p3

    .line 26
    mul-float/2addr p3, v0

    .line 27
    invoke-virtual {p1, v2, v2, p2, p3}, Landroid/graphics/RectF;->set(FFFF)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {p0}, Lh20;->s()Landroid/graphics/Bitmap;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    int-to-float p2, p2

    .line 42
    mul-float/2addr p2, v0

    .line 43
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 44
    .line 45
    .line 46
    move-result p3

    .line 47
    int-to-float p3, p3

    .line 48
    mul-float/2addr p3, v0

    .line 49
    invoke-virtual {p1, v2, v2, p2, p3}, Landroid/graphics/RectF;->set(FFFF)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    int-to-float p2, p2

    .line 54
    mul-float/2addr p2, v0

    .line 55
    int-to-float p3, p3

    .line 56
    mul-float/2addr p3, v0

    .line 57
    invoke-virtual {p1, v2, v2, p2, p3}, Landroid/graphics/RectF;->set(FFFF)V

    .line 58
    .line 59
    .line 60
    :goto_0
    iget-object p2, p0, Lda;->n:Landroid/graphics/Matrix;

    .line 61
    .line 62
    invoke-virtual {p2, p1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 63
    .line 64
    .line 65
    :cond_2
    return-void
.end method

.method public final k(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILmq;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lh20;->s()Landroid/graphics/Bitmap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_9

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_9

    .line 12
    .line 13
    iget-object v1, p0, Lh20;->H:Ll90;

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    goto/16 :goto_1

    .line 18
    .line 19
    :cond_0
    invoke-static {}, Ll41;->c()F

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    iget-object v3, p0, Lh20;->D:Ld50;

    .line 24
    .line 25
    invoke-virtual {v3, p3}, Ld50;->setAlpha(I)V

    .line 26
    .line 27
    .line 28
    iget-object v4, p0, Lh20;->I:Lm41;

    .line 29
    .line 30
    if-eqz v4, :cond_1

    .line 31
    .line 32
    invoke-virtual {v4}, Lm41;->e()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    check-cast v4, Landroid/graphics/ColorFilter;

    .line 37
    .line 38
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 39
    .line 40
    .line 41
    :cond_1
    iget-object v4, p0, Lh20;->K:Lpq;

    .line 42
    .line 43
    if-eqz v4, :cond_2

    .line 44
    .line 45
    invoke-virtual {v4, p2, p3}, Lpq;->a(Landroid/graphics/Matrix;I)Lmq;

    .line 46
    .line 47
    .line 48
    move-result-object p4

    .line 49
    :cond_2
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    iget-object v6, p0, Lh20;->E:Landroid/graphics/Rect;

    .line 58
    .line 59
    const/4 v7, 0x0

    .line 60
    invoke-virtual {v6, v7, v7, v4, v5}, Landroid/graphics/Rect;->set(IIII)V

    .line 61
    .line 62
    .line 63
    iget-object v4, p0, Lda;->o:Li90;

    .line 64
    .line 65
    iget-boolean v4, v4, Li90;->r:Z

    .line 66
    .line 67
    iget-object v5, p0, Lh20;->F:Landroid/graphics/Rect;

    .line 68
    .line 69
    if-eqz v4, :cond_3

    .line 70
    .line 71
    iget v4, v1, Ll90;->a:I

    .line 72
    .line 73
    int-to-float v4, v4

    .line 74
    mul-float/2addr v4, v2

    .line 75
    float-to-int v4, v4

    .line 76
    iget v1, v1, Ll90;->b:I

    .line 77
    .line 78
    int-to-float v1, v1

    .line 79
    mul-float/2addr v1, v2

    .line 80
    float-to-int v1, v1

    .line 81
    invoke-virtual {v5, v7, v7, v4, v1}, Landroid/graphics/Rect;->set(IIII)V

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_3
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    int-to-float v1, v1

    .line 90
    mul-float/2addr v1, v2

    .line 91
    float-to-int v1, v1

    .line 92
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    int-to-float v4, v4

    .line 97
    mul-float/2addr v4, v2

    .line 98
    float-to-int v2, v4

    .line 99
    invoke-virtual {v5, v7, v7, v1, v2}, Landroid/graphics/Rect;->set(IIII)V

    .line 100
    .line 101
    .line 102
    :goto_0
    if-eqz p4, :cond_4

    .line 103
    .line 104
    const/4 v7, 0x1

    .line 105
    :cond_4
    if-eqz v7, :cond_7

    .line 106
    .line 107
    iget-object v1, p0, Lh20;->L:Lpi0;

    .line 108
    .line 109
    if-nez v1, :cond_5

    .line 110
    .line 111
    new-instance v1, Lpi0;

    .line 112
    .line 113
    invoke-direct {v1}, Lpi0;-><init>()V

    .line 114
    .line 115
    .line 116
    iput-object v1, p0, Lh20;->L:Lpi0;

    .line 117
    .line 118
    :cond_5
    iget-object v1, p0, Lh20;->M:Lt3;

    .line 119
    .line 120
    if-nez v1, :cond_6

    .line 121
    .line 122
    new-instance v1, Lt3;

    .line 123
    .line 124
    const/4 v2, 0x4

    .line 125
    const/4 v4, 0x0

    .line 126
    invoke-direct {v1, v2, v4}, Lt3;-><init>(IB)V

    .line 127
    .line 128
    .line 129
    iput-object v1, p0, Lh20;->M:Lt3;

    .line 130
    .line 131
    :cond_6
    iget-object v1, p0, Lh20;->M:Lt3;

    .line 132
    .line 133
    const/16 v2, 0xff

    .line 134
    .line 135
    iput v2, v1, Lt3;->g:I

    .line 136
    .line 137
    const/4 v2, 0x0

    .line 138
    iput-object v2, v1, Lt3;->h:Ljava/lang/Object;

    .line 139
    .line 140
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    new-instance v2, Lmq;

    .line 144
    .line 145
    invoke-direct {v2, p4}, Lmq;-><init>(Lmq;)V

    .line 146
    .line 147
    .line 148
    iput-object v2, v1, Lt3;->h:Ljava/lang/Object;

    .line 149
    .line 150
    invoke-virtual {v2, p3}, Lmq;->b(I)V

    .line 151
    .line 152
    .line 153
    iget p3, v5, Landroid/graphics/Rect;->left:I

    .line 154
    .line 155
    int-to-float p3, p3

    .line 156
    iget p4, v5, Landroid/graphics/Rect;->top:I

    .line 157
    .line 158
    int-to-float p4, p4

    .line 159
    iget v1, v5, Landroid/graphics/Rect;->right:I

    .line 160
    .line 161
    int-to-float v1, v1

    .line 162
    iget v2, v5, Landroid/graphics/Rect;->bottom:I

    .line 163
    .line 164
    int-to-float v2, v2

    .line 165
    iget-object v4, p0, Lh20;->G:Landroid/graphics/RectF;

    .line 166
    .line 167
    invoke-virtual {v4, p3, p4, v1, v2}, Landroid/graphics/RectF;->set(FFFF)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p2, v4}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 171
    .line 172
    .line 173
    iget-object p3, p0, Lh20;->L:Lpi0;

    .line 174
    .line 175
    iget-object p4, p0, Lh20;->M:Lt3;

    .line 176
    .line 177
    invoke-virtual {p3, p1, v4, p4}, Lpi0;->e(Landroid/graphics/Canvas;Landroid/graphics/RectF;Lt3;)Landroid/graphics/Canvas;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    :cond_7
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 182
    .line 183
    .line 184
    invoke-virtual {p1, p2}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p1, v0, v6, v5, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 188
    .line 189
    .line 190
    if-eqz v7, :cond_8

    .line 191
    .line 192
    iget-object p2, p0, Lh20;->L:Lpi0;

    .line 193
    .line 194
    invoke-virtual {p2}, Lpi0;->c()V

    .line 195
    .line 196
    .line 197
    iget-object p2, p0, Lh20;->L:Lpi0;

    .line 198
    .line 199
    iget p2, p2, Lpi0;->c:I

    .line 200
    .line 201
    const/4 p3, 0x4

    .line 202
    if-ne p2, p3, :cond_8

    .line 203
    .line 204
    goto :goto_1

    .line 205
    :cond_8
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 206
    .line 207
    .line 208
    :cond_9
    :goto_1
    return-void
.end method

.method public final s()Landroid/graphics/Bitmap;
    .locals 15

    .line 1
    iget-object v0, p0, Lh20;->J:Lm41;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lm41;->e()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/graphics/Bitmap;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    iget-object v0, p0, Lda;->p:Lf50;

    .line 15
    .line 16
    iget-object v0, v0, Lf50;->g:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v1, p0, Lda;->o:Li90;

    .line 19
    .line 20
    iget-object v2, v1, Li90;->l:Lxb4;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    if-eqz v2, :cond_4

    .line 24
    .line 25
    invoke-virtual {v1}, Li90;->h()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    iget-object v2, v2, Lxb4;->g:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v2, Landroid/content/Context;

    .line 32
    .line 33
    if-nez v4, :cond_1

    .line 34
    .line 35
    if-nez v2, :cond_3

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    instance-of v5, v2, Landroid/app/Application;

    .line 39
    .line 40
    if-eqz v5, :cond_2

    .line 41
    .line 42
    invoke-virtual {v4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    :cond_2
    if-ne v4, v2, :cond_3

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_3
    iput-object v3, v1, Li90;->l:Lxb4;

    .line 50
    .line 51
    :cond_4
    :goto_0
    iget-object v2, v1, Li90;->l:Lxb4;

    .line 52
    .line 53
    if-nez v2, :cond_5

    .line 54
    .line 55
    new-instance v2, Lxb4;

    .line 56
    .line 57
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    iget-object v5, v1, Li90;->m:Ljava/lang/String;

    .line 62
    .line 63
    iget-object v6, v1, Li90;->f:Lu80;

    .line 64
    .line 65
    invoke-virtual {v6}, Lu80;->c()Ljava/util/Map;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    invoke-direct {v2, v4, v5, v6}, Lxb4;-><init>(Landroid/graphics/drawable/Drawable$Callback;Ljava/lang/String;Ljava/util/Map;)V

    .line 70
    .line 71
    .line 72
    iput-object v2, v1, Li90;->l:Lxb4;

    .line 73
    .line 74
    :cond_5
    iget-object v1, v1, Li90;->l:Lxb4;

    .line 75
    .line 76
    if-eqz v1, :cond_9

    .line 77
    .line 78
    iget-object v2, v1, Lxb4;->h:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v2, Ljava/lang/String;

    .line 81
    .line 82
    const-string v4, "`."

    .line 83
    .line 84
    const-string v5, "Unable to decode image `"

    .line 85
    .line 86
    const-string v6, "` is null."

    .line 87
    .line 88
    const-string v7, "Decoded image `"

    .line 89
    .line 90
    iget-object v8, v1, Lxb4;->i:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v8, Ljava/util/Map;

    .line 93
    .line 94
    invoke-interface {v8, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v8

    .line 98
    check-cast v8, Ll90;

    .line 99
    .line 100
    if-nez v8, :cond_6

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_6
    iget v9, v8, Ll90;->b:I

    .line 104
    .line 105
    iget v10, v8, Ll90;->a:I

    .line 106
    .line 107
    iget-object v11, v8, Ll90;->f:Landroid/graphics/Bitmap;

    .line 108
    .line 109
    if-eqz v11, :cond_7

    .line 110
    .line 111
    goto/16 :goto_3

    .line 112
    .line 113
    :cond_7
    iget-object v11, v1, Lxb4;->g:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v11, Landroid/content/Context;

    .line 116
    .line 117
    if-nez v11, :cond_8

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_8
    iget-object v8, v8, Ll90;->d:Ljava/lang/String;

    .line 121
    .line 122
    new-instance v12, Landroid/graphics/BitmapFactory$Options;

    .line 123
    .line 124
    invoke-direct {v12}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 125
    .line 126
    .line 127
    const/4 v13, 0x1

    .line 128
    iput-boolean v13, v12, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 129
    .line 130
    const/16 v14, 0xa0

    .line 131
    .line 132
    iput v14, v12, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 133
    .line 134
    const-string v14, "data:"

    .line 135
    .line 136
    invoke-virtual {v8, v14}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 137
    .line 138
    .line 139
    move-result v14

    .line 140
    if-eqz v14, :cond_b

    .line 141
    .line 142
    const-string v14, "base64,"

    .line 143
    .line 144
    invoke-virtual {v8, v14}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 145
    .line 146
    .line 147
    move-result v14

    .line 148
    if-lez v14, :cond_b

    .line 149
    .line 150
    const/16 v2, 0x2c

    .line 151
    .line 152
    :try_start_0
    invoke-virtual {v8, v2}, Ljava/lang/String;->indexOf(I)I

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    add-int/2addr v2, v13

    .line 157
    invoke-virtual {v8, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    const/4 v8, 0x0

    .line 162
    invoke-static {v2, v8}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 163
    .line 164
    .line 165
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    .line 166
    :try_start_1
    array-length v11, v2

    .line 167
    invoke-static {v2, v8, v11, v12}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 168
    .line 169
    .line 170
    move-result-object v2
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    .line 171
    if-nez v2, :cond_a

    .line 172
    .line 173
    new-instance v1, Ljava/lang/StringBuilder;

    .line 174
    .line 175
    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-static {v0}, Lj80;->b(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    :cond_9
    :goto_1
    move-object v11, v3

    .line 192
    goto/16 :goto_3

    .line 193
    .line 194
    :cond_a
    invoke-static {v2, v10, v9}, Ll41;->d(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    .line 195
    .line 196
    .line 197
    move-result-object v11

    .line 198
    sget-object v2, Lxb4;->k:Ljava/lang/Object;

    .line 199
    .line 200
    monitor-enter v2

    .line 201
    :try_start_2
    iget-object v1, v1, Lxb4;->i:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v1, Ljava/util/Map;

    .line 204
    .line 205
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    check-cast v0, Ll90;

    .line 210
    .line 211
    iput-object v11, v0, Ll90;->f:Landroid/graphics/Bitmap;

    .line 212
    .line 213
    monitor-exit v2

    .line 214
    goto/16 :goto_3

    .line 215
    .line 216
    :catchall_0
    move-exception v0

    .line 217
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 218
    throw v0

    .line 219
    :catch_0
    move-exception v1

    .line 220
    new-instance v2, Ljava/lang/StringBuilder;

    .line 221
    .line 222
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    invoke-static {v0, v1}, Lj80;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 236
    .line 237
    .line 238
    goto :goto_1

    .line 239
    :catch_1
    move-exception v0

    .line 240
    const-string v1, "data URL did not have correct base64 format."

    .line 241
    .line 242
    invoke-static {v1, v0}, Lj80;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 243
    .line 244
    .line 245
    goto :goto_1

    .line 246
    :cond_b
    :try_start_3
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 247
    .line 248
    .line 249
    move-result v13

    .line 250
    if-nez v13, :cond_d

    .line 251
    .line 252
    invoke-virtual {v11}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 253
    .line 254
    .line 255
    move-result-object v11

    .line 256
    new-instance v13, Ljava/lang/StringBuilder;

    .line 257
    .line 258
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    invoke-virtual {v11, v2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 272
    .line 273
    .line 274
    move-result-object v2
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    .line 275
    :try_start_4
    invoke-static {v2, v3, v12}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 276
    .line 277
    .line 278
    move-result-object v2
    :try_end_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_2

    .line 279
    if-nez v2, :cond_c

    .line 280
    .line 281
    new-instance v1, Ljava/lang/StringBuilder;

    .line 282
    .line 283
    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    invoke-static {v0}, Lj80;->b(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    goto :goto_1

    .line 300
    :cond_c
    invoke-static {v2, v10, v9}, Ll41;->d(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    .line 301
    .line 302
    .line 303
    move-result-object v11

    .line 304
    sget-object v2, Lxb4;->k:Ljava/lang/Object;

    .line 305
    .line 306
    monitor-enter v2

    .line 307
    :try_start_5
    iget-object v1, v1, Lxb4;->i:Ljava/lang/Object;

    .line 308
    .line 309
    check-cast v1, Ljava/util/Map;

    .line 310
    .line 311
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    check-cast v0, Ll90;

    .line 316
    .line 317
    iput-object v11, v0, Ll90;->f:Landroid/graphics/Bitmap;

    .line 318
    .line 319
    monitor-exit v2

    .line 320
    goto :goto_3

    .line 321
    :catchall_1
    move-exception v0

    .line 322
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 323
    throw v0

    .line 324
    :catch_2
    move-exception v1

    .line 325
    new-instance v2, Ljava/lang/StringBuilder;

    .line 326
    .line 327
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    invoke-static {v0, v1}, Lj80;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 341
    .line 342
    .line 343
    goto/16 :goto_1

    .line 344
    .line 345
    :catch_3
    move-exception v0

    .line 346
    goto :goto_2

    .line 347
    :cond_d
    :try_start_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 348
    .line 349
    const-string v1, "You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder"

    .line 350
    .line 351
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    throw v0
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3

    .line 355
    :goto_2
    const-string v1, "Unable to open asset."

    .line 356
    .line 357
    invoke-static {v1, v0}, Lj80;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 358
    .line 359
    .line 360
    goto/16 :goto_1

    .line 361
    .line 362
    :goto_3
    if-eqz v11, :cond_e

    .line 363
    .line 364
    return-object v11

    .line 365
    :cond_e
    iget-object v0, p0, Lh20;->H:Ll90;

    .line 366
    .line 367
    if-eqz v0, :cond_f

    .line 368
    .line 369
    iget-object v0, v0, Ll90;->f:Landroid/graphics/Bitmap;

    .line 370
    .line 371
    return-object v0

    .line 372
    :cond_f
    return-object v3
.end method
