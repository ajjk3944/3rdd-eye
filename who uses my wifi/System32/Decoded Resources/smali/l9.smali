.class public final Ll9;
.super Loe;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public j:Landroid/graphics/Matrix;

.field public k:Landroid/graphics/Matrix;

.field public l:Laa0;

.field public m:Laa0;

.field public n:F

.field public o:F

.field public p:F

.field public q:Ll60;

.field public r:Landroid/view/VelocityTracker;

.field public s:J

.field public t:Laa0;

.field public u:Laa0;

.field public v:F

.field public w:F


# direct methods
.method public static d(Landroid/view/MotionEvent;)F
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/MotionEvent;->getX(I)F

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const/4 v2, 0x1

    .line 7
    invoke-virtual {p0, v2}, Landroid/view/MotionEvent;->getX(I)F

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    sub-float/2addr v1, v3

    .line 12
    invoke-virtual {p0, v0}, Landroid/view/MotionEvent;->getY(I)F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-virtual {p0, v2}, Landroid/view/MotionEvent;->getY(I)F

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    sub-float/2addr v0, p0

    .line 21
    mul-float/2addr v1, v1

    .line 22
    mul-float/2addr v0, v0

    .line 23
    add-float/2addr v0, v1

    .line 24
    float-to-double v0, v0

    .line 25
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    double-to-float p0, v0

    .line 30
    return p0
.end method


# virtual methods
.method public final a(FF)Laa0;
    .locals 3

    .line 1
    iget-object v0, p0, Loe;->i:Lcom/github/mikephil/charting/charts/LineChart;

    .line 2
    .line 3
    invoke-virtual {v0}, Lje;->getViewPortHandler()Lu61;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, v1, Lu61;->b:Landroid/graphics/RectF;

    .line 8
    .line 9
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 10
    .line 11
    sub-float/2addr p1, v2

    .line 12
    invoke-virtual {p0}, Ll9;->b()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    int-to-float v0, v0

    .line 20
    sub-float/2addr v0, p2

    .line 21
    iget p2, v1, Lu61;->d:F

    .line 22
    .line 23
    iget-object v1, v1, Lu61;->b:Landroid/graphics/RectF;

    .line 24
    .line 25
    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    .line 26
    .line 27
    sub-float/2addr p2, v1

    .line 28
    sub-float/2addr v0, p2

    .line 29
    neg-float p2, v0

    .line 30
    invoke-static {p1, p2}, Laa0;->b(FF)Laa0;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1
.end method

.method public final b()V
    .locals 3

    .line 1
    iget-object v0, p0, Loe;->i:Lcom/github/mikephil/charting/charts/LineChart;

    .line 2
    .line 3
    iget-object v1, p0, Ll9;->q:Ll60;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget-object v1, v0, Lk9;->a0:Leb1;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, Lk9;->b0:Leb1;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object v1, p0, Ll9;->q:Ll60;

    .line 18
    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    iget v1, v1, Ll60;->d:I

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    if-ne v1, v2, :cond_1

    .line 25
    .line 26
    iget-object v0, v0, Lk9;->a0:Leb1;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    iget-object v0, v0, Lk9;->b0:Leb1;

    .line 30
    .line 31
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    :cond_2
    return-void
.end method

.method public final c(Landroid/view/MotionEvent;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ll9;->k:Landroid/graphics/Matrix;

    .line 2
    .line 3
    iget-object v1, p0, Ll9;->j:Landroid/graphics/Matrix;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Ll9;->l:Laa0;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    iput v1, v0, Laa0;->g:F

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    iput v1, v0, Laa0;->h:F

    .line 21
    .line 22
    iget-object v0, p0, Loe;->i:Lcom/github/mikephil/charting/charts/LineChart;

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    invoke-virtual {v0, v1, p1}, Lje;->b(FF)Lv00;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    if-eqz p1, :cond_0

    .line 37
    .line 38
    iget-object v0, v0, Lje;->g:Lle;

    .line 39
    .line 40
    check-cast v0, Lm9;

    .line 41
    .line 42
    iget p1, p1, Lv00;->e:I

    .line 43
    .line 44
    invoke-virtual {v0, p1}, Lle;->d(I)Lq10;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Ll60;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    const/4 p1, 0x0

    .line 52
    :goto_0
    iput-object p1, p0, Ll9;->q:Ll60;

    .line 53
    .line 54
    return-void
.end method

.method public final onDoubleTap(Landroid/view/MotionEvent;)Z
    .locals 9

    .line 1
    iget-object v0, p0, Loe;->i:Lcom/github/mikephil/charting/charts/LineChart;

    .line 2
    .line 3
    invoke-virtual {v0}, Lje;->getOnChartGestureListener()Lbj0;

    .line 4
    .line 5
    .line 6
    iget-boolean v1, v0, Lk9;->K:Z

    .line 7
    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    invoke-virtual {v0}, Lje;->getData()Lle;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Lm9;

    .line 15
    .line 16
    invoke-virtual {v1}, Lle;->e()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-lez v1, :cond_2

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-virtual {p0, v1, v2}, Ll9;->a(FF)Laa0;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iget-boolean v2, v0, Lk9;->O:Z

    .line 35
    .line 36
    const/high16 v3, 0x3f800000    # 1.0f

    .line 37
    .line 38
    const v4, 0x3fb33333    # 1.4f

    .line 39
    .line 40
    .line 41
    if-eqz v2, :cond_0

    .line 42
    .line 43
    move v2, v4

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    move v2, v3

    .line 46
    :goto_0
    iget-boolean v5, v0, Lk9;->P:Z

    .line 47
    .line 48
    if-eqz v5, :cond_1

    .line 49
    .line 50
    move v3, v4

    .line 51
    :cond_1
    iget v4, v1, Laa0;->g:F

    .line 52
    .line 53
    iget v5, v1, Laa0;->h:F

    .line 54
    .line 55
    iget-object v6, v0, Lje;->w:Lu61;

    .line 56
    .line 57
    neg-float v5, v5

    .line 58
    iget-object v7, v0, Lk9;->i0:Landroid/graphics/Matrix;

    .line 59
    .line 60
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v7}, Landroid/graphics/Matrix;->reset()V

    .line 64
    .line 65
    .line 66
    iget-object v8, v6, Lu61;->a:Landroid/graphics/Matrix;

    .line 67
    .line 68
    invoke-virtual {v7, v8}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v7, v2, v3, v4, v5}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 72
    .line 73
    .line 74
    const/4 v2, 0x0

    .line 75
    invoke-virtual {v6, v7, v0, v2}, Lu61;->e(Landroid/graphics/Matrix;Landroid/view/View;Z)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Lk9;->a()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Landroid/view/View;->postInvalidate()V

    .line 82
    .line 83
    .line 84
    iget-boolean v0, v0, Lje;->f:Z

    .line 85
    .line 86
    sget-object v0, Laa0;->i:Lni0;

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Lni0;->c(Lmi0;)V

    .line 89
    .line 90
    .line 91
    :cond_2
    invoke-super {p0, p1}, Landroid/view/GestureDetector$SimpleOnGestureListener;->onDoubleTap(Landroid/view/MotionEvent;)Z

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    return p1
.end method

.method public final onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 1

    .line 1
    iget-object v0, p0, Loe;->i:Lcom/github/mikephil/charting/charts/LineChart;

    .line 2
    .line 3
    invoke-virtual {v0}, Lje;->getOnChartGestureListener()Lbj0;

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/GestureDetector$SimpleOnGestureListener;->onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method

.method public final onLongPress(Landroid/view/MotionEvent;)V
    .locals 0

    .line 1
    iget-object p1, p0, Loe;->i:Lcom/github/mikephil/charting/charts/LineChart;

    .line 2
    .line 3
    invoke-virtual {p1}, Lje;->getOnChartGestureListener()Lbj0;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Loe;->i:Lcom/github/mikephil/charting/charts/LineChart;

    .line 2
    .line 3
    invoke-virtual {v0}, Lje;->getOnChartGestureListener()Lbj0;

    .line 4
    .line 5
    .line 6
    iget-boolean v1, v0, Lje;->h:Z

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    return p1

    .line 12
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-virtual {v0, v1, v2}, Lje;->b(FF)Lv00;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_3

    .line 25
    .line 26
    iget-object v2, p0, Loe;->g:Lv00;

    .line 27
    .line 28
    if-nez v2, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    iget v3, v1, Lv00;->e:I

    .line 32
    .line 33
    iget v4, v2, Lv00;->e:I

    .line 34
    .line 35
    if-ne v3, v4, :cond_2

    .line 36
    .line 37
    iget v3, v1, Lv00;->a:F

    .line 38
    .line 39
    iget v2, v2, Lv00;->a:F

    .line 40
    .line 41
    cmpl-float v2, v3, v2

    .line 42
    .line 43
    if-nez v2, :cond_2

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    :goto_0
    invoke-virtual {v0, v1}, Lje;->c(Lv00;)V

    .line 47
    .line 48
    .line 49
    iput-object v1, p0, Loe;->g:Lv00;

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_3
    :goto_1
    const/4 v1, 0x0

    .line 53
    invoke-virtual {v0, v1}, Lje;->c(Lv00;)V

    .line 54
    .line 55
    .line 56
    iput-object v1, p0, Loe;->g:Lv00;

    .line 57
    .line 58
    :goto_2
    invoke-super {p0, p1}, Landroid/view/GestureDetector$SimpleOnGestureListener;->onSingleTapUp(Landroid/view/MotionEvent;)Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    return p1
.end method

.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v0, Ll9;->k:Landroid/graphics/Matrix;

    .line 6
    .line 7
    iget-object v3, v0, Ll9;->u:Laa0;

    .line 8
    .line 9
    iget-object v4, v0, Ll9;->t:Laa0;

    .line 10
    .line 11
    iget-object v5, v0, Ll9;->m:Laa0;

    .line 12
    .line 13
    iget-object v6, v0, Ll9;->l:Laa0;

    .line 14
    .line 15
    iget-object v7, v0, Loe;->i:Lcom/github/mikephil/charting/charts/LineChart;

    .line 16
    .line 17
    iget-object v8, v0, Ll9;->r:Landroid/view/VelocityTracker;

    .line 18
    .line 19
    if-nez v8, :cond_0

    .line 20
    .line 21
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    .line 22
    .line 23
    .line 24
    move-result-object v8

    .line 25
    iput-object v8, v0, Ll9;->r:Landroid/view/VelocityTracker;

    .line 26
    .line 27
    :cond_0
    iget-object v8, v0, Ll9;->r:Landroid/view/VelocityTracker;

    .line 28
    .line 29
    invoke-virtual {v8, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 33
    .line 34
    .line 35
    move-result v8

    .line 36
    const/4 v9, 0x0

    .line 37
    const/4 v10, 0x3

    .line 38
    if-ne v8, v10, :cond_1

    .line 39
    .line 40
    iget-object v8, v0, Ll9;->r:Landroid/view/VelocityTracker;

    .line 41
    .line 42
    if-eqz v8, :cond_1

    .line 43
    .line 44
    invoke-virtual {v8}, Landroid/view/VelocityTracker;->recycle()V

    .line 45
    .line 46
    .line 47
    iput-object v9, v0, Ll9;->r:Landroid/view/VelocityTracker;

    .line 48
    .line 49
    :cond_1
    iget v8, v0, Loe;->f:I

    .line 50
    .line 51
    if-nez v8, :cond_2

    .line 52
    .line 53
    iget-object v8, v0, Loe;->h:Landroid/view/GestureDetector;

    .line 54
    .line 55
    invoke-virtual {v8, v1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 56
    .line 57
    .line 58
    :cond_2
    iget-boolean v8, v7, Lk9;->M:Z

    .line 59
    .line 60
    const/4 v11, 0x1

    .line 61
    if-nez v8, :cond_4

    .line 62
    .line 63
    iget-boolean v8, v7, Lk9;->N:Z

    .line 64
    .line 65
    if-eqz v8, :cond_3

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    iget-boolean v8, v7, Lk9;->O:Z

    .line 69
    .line 70
    if-nez v8, :cond_4

    .line 71
    .line 72
    iget-boolean v8, v7, Lk9;->P:Z

    .line 73
    .line 74
    if-nez v8, :cond_4

    .line 75
    .line 76
    return v11

    .line 77
    :cond_4
    :goto_0
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getAction()I

    .line 78
    .line 79
    .line 80
    move-result v8

    .line 81
    and-int/lit16 v8, v8, 0xff

    .line 82
    .line 83
    if-eqz v8, :cond_34

    .line 84
    .line 85
    const/16 v13, 0x3e8

    .line 86
    .line 87
    const/4 v14, 0x5

    .line 88
    const/4 v15, 0x4

    .line 89
    const/4 v9, 0x0

    .line 90
    const/16 v16, 0x0

    .line 91
    .line 92
    const/4 v12, 0x2

    .line 93
    if-eq v8, v11, :cond_2d

    .line 94
    .line 95
    if-eq v8, v12, :cond_11

    .line 96
    .line 97
    if-eq v8, v10, :cond_10

    .line 98
    .line 99
    if-eq v8, v14, :cond_9

    .line 100
    .line 101
    const/4 v2, 0x6

    .line 102
    if-eq v8, v2, :cond_5

    .line 103
    .line 104
    goto/16 :goto_12

    .line 105
    .line 106
    :cond_5
    iget-object v2, v0, Ll9;->r:Landroid/view/VelocityTracker;

    .line 107
    .line 108
    sget v3, Lk41;->c:I

    .line 109
    .line 110
    int-to-float v3, v3

    .line 111
    invoke-virtual {v2, v13, v3}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    invoke-virtual {v2, v4}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    invoke-virtual {v2, v4}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 131
    .line 132
    .line 133
    move-result v6

    .line 134
    :goto_1
    if-ge v9, v6, :cond_8

    .line 135
    .line 136
    if-ne v9, v3, :cond_6

    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_6
    invoke-virtual {v1, v9}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 140
    .line 141
    .line 142
    move-result v8

    .line 143
    invoke-virtual {v2, v8}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    .line 144
    .line 145
    .line 146
    move-result v10

    .line 147
    mul-float/2addr v10, v5

    .line 148
    invoke-virtual {v2, v8}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    .line 149
    .line 150
    .line 151
    move-result v8

    .line 152
    mul-float/2addr v8, v4

    .line 153
    add-float/2addr v8, v10

    .line 154
    cmpg-float v8, v8, v16

    .line 155
    .line 156
    if-gez v8, :cond_7

    .line 157
    .line 158
    invoke-virtual {v2}, Landroid/view/VelocityTracker;->clear()V

    .line 159
    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_7
    :goto_2
    add-int/lit8 v9, v9, 0x1

    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_8
    :goto_3
    iput v14, v0, Loe;->f:I

    .line 166
    .line 167
    goto/16 :goto_12

    .line 168
    .line 169
    :cond_9
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    if-lt v2, v12, :cond_35

    .line 174
    .line 175
    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    if-eqz v2, :cond_a

    .line 180
    .line 181
    invoke-interface {v2, v11}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 182
    .line 183
    .line 184
    :cond_a
    invoke-virtual {v0, v1}, Ll9;->c(Landroid/view/MotionEvent;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v1, v9}, Landroid/view/MotionEvent;->getX(I)F

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    invoke-virtual {v1, v11}, Landroid/view/MotionEvent;->getX(I)F

    .line 192
    .line 193
    .line 194
    move-result v3

    .line 195
    sub-float/2addr v2, v3

    .line 196
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    iput v2, v0, Ll9;->n:F

    .line 201
    .line 202
    invoke-virtual {v1, v9}, Landroid/view/MotionEvent;->getY(I)F

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    invoke-virtual {v1, v11}, Landroid/view/MotionEvent;->getY(I)F

    .line 207
    .line 208
    .line 209
    move-result v3

    .line 210
    sub-float/2addr v2, v3

    .line 211
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    iput v2, v0, Ll9;->o:F

    .line 216
    .line 217
    invoke-static {v1}, Ll9;->d(Landroid/view/MotionEvent;)F

    .line 218
    .line 219
    .line 220
    move-result v2

    .line 221
    iput v2, v0, Ll9;->p:F

    .line 222
    .line 223
    const/high16 v3, 0x41200000    # 10.0f

    .line 224
    .line 225
    cmpl-float v2, v2, v3

    .line 226
    .line 227
    if-lez v2, :cond_f

    .line 228
    .line 229
    iget-boolean v2, v7, Lk9;->J:Z

    .line 230
    .line 231
    if-eqz v2, :cond_b

    .line 232
    .line 233
    iput v15, v0, Loe;->f:I

    .line 234
    .line 235
    goto :goto_4

    .line 236
    :cond_b
    iget-boolean v2, v7, Lk9;->O:Z

    .line 237
    .line 238
    iget-boolean v3, v7, Lk9;->P:Z

    .line 239
    .line 240
    if-eq v2, v3, :cond_d

    .line 241
    .line 242
    if-eqz v2, :cond_c

    .line 243
    .line 244
    move v10, v12

    .line 245
    :cond_c
    iput v10, v0, Loe;->f:I

    .line 246
    .line 247
    goto :goto_4

    .line 248
    :cond_d
    iget v2, v0, Ll9;->n:F

    .line 249
    .line 250
    iget v3, v0, Ll9;->o:F

    .line 251
    .line 252
    cmpl-float v2, v2, v3

    .line 253
    .line 254
    if-lez v2, :cond_e

    .line 255
    .line 256
    move v10, v12

    .line 257
    :cond_e
    iput v10, v0, Loe;->f:I

    .line 258
    .line 259
    :cond_f
    :goto_4
    invoke-virtual {v1, v9}, Landroid/view/MotionEvent;->getX(I)F

    .line 260
    .line 261
    .line 262
    move-result v2

    .line 263
    invoke-virtual {v1, v11}, Landroid/view/MotionEvent;->getX(I)F

    .line 264
    .line 265
    .line 266
    move-result v3

    .line 267
    add-float/2addr v3, v2

    .line 268
    invoke-virtual {v1, v9}, Landroid/view/MotionEvent;->getY(I)F

    .line 269
    .line 270
    .line 271
    move-result v2

    .line 272
    invoke-virtual {v1, v11}, Landroid/view/MotionEvent;->getY(I)F

    .line 273
    .line 274
    .line 275
    move-result v1

    .line 276
    add-float/2addr v1, v2

    .line 277
    const/high16 v2, 0x40000000    # 2.0f

    .line 278
    .line 279
    div-float/2addr v3, v2

    .line 280
    iput v3, v5, Laa0;->g:F

    .line 281
    .line 282
    div-float/2addr v1, v2

    .line 283
    iput v1, v5, Laa0;->h:F

    .line 284
    .line 285
    goto/16 :goto_12

    .line 286
    .line 287
    :cond_10
    iput v9, v0, Loe;->f:I

    .line 288
    .line 289
    invoke-virtual {v7}, Lje;->getOnChartGestureListener()Lbj0;

    .line 290
    .line 291
    .line 292
    goto/16 :goto_12

    .line 293
    .line 294
    :cond_11
    iget v3, v0, Loe;->f:I

    .line 295
    .line 296
    if-ne v3, v11, :cond_15

    .line 297
    .line 298
    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 299
    .line 300
    .line 301
    move-result-object v3

    .line 302
    if-eqz v3, :cond_12

    .line 303
    .line 304
    invoke-interface {v3, v11}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 305
    .line 306
    .line 307
    :cond_12
    iget-boolean v3, v7, Lk9;->M:Z

    .line 308
    .line 309
    if-eqz v3, :cond_13

    .line 310
    .line 311
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getX()F

    .line 312
    .line 313
    .line 314
    move-result v3

    .line 315
    iget v4, v6, Laa0;->g:F

    .line 316
    .line 317
    sub-float/2addr v3, v4

    .line 318
    goto :goto_5

    .line 319
    :cond_13
    move/from16 v3, v16

    .line 320
    .line 321
    :goto_5
    iget-boolean v4, v7, Lk9;->N:Z

    .line 322
    .line 323
    if-eqz v4, :cond_14

    .line 324
    .line 325
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getY()F

    .line 326
    .line 327
    .line 328
    move-result v1

    .line 329
    iget v4, v6, Laa0;->h:F

    .line 330
    .line 331
    sub-float v12, v1, v4

    .line 332
    .line 333
    goto :goto_6

    .line 334
    :cond_14
    move/from16 v12, v16

    .line 335
    .line 336
    :goto_6
    iget-object v1, v0, Ll9;->j:Landroid/graphics/Matrix;

    .line 337
    .line 338
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v7}, Lje;->getOnChartGestureListener()Lbj0;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v0}, Ll9;->b()V

    .line 345
    .line 346
    .line 347
    iget-object v1, v0, Ll9;->j:Landroid/graphics/Matrix;

    .line 348
    .line 349
    invoke-virtual {v1, v3, v12}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 350
    .line 351
    .line 352
    goto/16 :goto_12

    .line 353
    .line 354
    :cond_15
    const/high16 v4, 0x3f800000    # 1.0f

    .line 355
    .line 356
    if-eq v3, v12, :cond_1d

    .line 357
    .line 358
    if-eq v3, v10, :cond_1d

    .line 359
    .line 360
    if-ne v3, v15, :cond_16

    .line 361
    .line 362
    goto/16 :goto_8

    .line 363
    .line 364
    :cond_16
    if-nez v3, :cond_35

    .line 365
    .line 366
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getX()F

    .line 367
    .line 368
    .line 369
    move-result v2

    .line 370
    iget v3, v6, Laa0;->g:F

    .line 371
    .line 372
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getY()F

    .line 373
    .line 374
    .line 375
    move-result v5

    .line 376
    iget v8, v6, Laa0;->h:F

    .line 377
    .line 378
    sub-float/2addr v2, v3

    .line 379
    sub-float/2addr v5, v8

    .line 380
    mul-float/2addr v2, v2

    .line 381
    mul-float/2addr v5, v5

    .line 382
    add-float/2addr v5, v2

    .line 383
    float-to-double v2, v5

    .line 384
    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    .line 385
    .line 386
    .line 387
    move-result-wide v2

    .line 388
    double-to-float v2, v2

    .line 389
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 390
    .line 391
    .line 392
    move-result v2

    .line 393
    iget v3, v0, Ll9;->v:F

    .line 394
    .line 395
    cmpl-float v2, v2, v3

    .line 396
    .line 397
    if-lez v2, :cond_35

    .line 398
    .line 399
    iget-boolean v2, v7, Lk9;->M:Z

    .line 400
    .line 401
    if-nez v2, :cond_17

    .line 402
    .line 403
    iget-boolean v2, v7, Lk9;->N:Z

    .line 404
    .line 405
    if-eqz v2, :cond_35

    .line 406
    .line 407
    :cond_17
    iget-object v2, v7, Lje;->w:Lu61;

    .line 408
    .line 409
    iget v3, v2, Lu61;->i:F

    .line 410
    .line 411
    iget v5, v2, Lu61;->g:F

    .line 412
    .line 413
    cmpl-float v3, v3, v5

    .line 414
    .line 415
    if-gtz v3, :cond_1a

    .line 416
    .line 417
    cmpl-float v3, v5, v4

    .line 418
    .line 419
    if-gtz v3, :cond_1a

    .line 420
    .line 421
    iget v3, v2, Lu61;->j:F

    .line 422
    .line 423
    iget v5, v2, Lu61;->e:F

    .line 424
    .line 425
    cmpl-float v3, v3, v5

    .line 426
    .line 427
    if-gtz v3, :cond_1a

    .line 428
    .line 429
    cmpl-float v3, v5, v4

    .line 430
    .line 431
    if-gtz v3, :cond_1a

    .line 432
    .line 433
    iget v3, v2, Lu61;->l:F

    .line 434
    .line 435
    cmpg-float v3, v3, v16

    .line 436
    .line 437
    if-gtz v3, :cond_1a

    .line 438
    .line 439
    iget v2, v2, Lu61;->m:F

    .line 440
    .line 441
    cmpg-float v2, v2, v16

    .line 442
    .line 443
    if-gtz v2, :cond_1a

    .line 444
    .line 445
    iget-boolean v2, v7, Lk9;->L:Z

    .line 446
    .line 447
    if-eqz v2, :cond_35

    .line 448
    .line 449
    if-eqz v2, :cond_35

    .line 450
    .line 451
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getX()F

    .line 452
    .line 453
    .line 454
    move-result v2

    .line 455
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getY()F

    .line 456
    .line 457
    .line 458
    move-result v1

    .line 459
    invoke-virtual {v7, v2, v1}, Lje;->b(FF)Lv00;

    .line 460
    .line 461
    .line 462
    move-result-object v1

    .line 463
    if-eqz v1, :cond_35

    .line 464
    .line 465
    iget-object v2, v0, Loe;->g:Lv00;

    .line 466
    .line 467
    if-nez v2, :cond_18

    .line 468
    .line 469
    goto :goto_7

    .line 470
    :cond_18
    iget v3, v1, Lv00;->e:I

    .line 471
    .line 472
    iget v4, v2, Lv00;->e:I

    .line 473
    .line 474
    if-ne v3, v4, :cond_19

    .line 475
    .line 476
    iget v3, v1, Lv00;->a:F

    .line 477
    .line 478
    iget v2, v2, Lv00;->a:F

    .line 479
    .line 480
    cmpl-float v2, v3, v2

    .line 481
    .line 482
    if-nez v2, :cond_19

    .line 483
    .line 484
    goto/16 :goto_12

    .line 485
    .line 486
    :cond_19
    :goto_7
    iput-object v1, v0, Loe;->g:Lv00;

    .line 487
    .line 488
    invoke-virtual {v7, v1}, Lje;->c(Lv00;)V

    .line 489
    .line 490
    .line 491
    goto/16 :goto_12

    .line 492
    .line 493
    :cond_1a
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getX()F

    .line 494
    .line 495
    .line 496
    move-result v2

    .line 497
    iget v3, v6, Laa0;->g:F

    .line 498
    .line 499
    sub-float/2addr v2, v3

    .line 500
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 501
    .line 502
    .line 503
    move-result v2

    .line 504
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getY()F

    .line 505
    .line 506
    .line 507
    move-result v1

    .line 508
    iget v3, v6, Laa0;->h:F

    .line 509
    .line 510
    sub-float/2addr v1, v3

    .line 511
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 512
    .line 513
    .line 514
    move-result v1

    .line 515
    iget-boolean v3, v7, Lk9;->M:Z

    .line 516
    .line 517
    if-nez v3, :cond_1b

    .line 518
    .line 519
    cmpl-float v3, v1, v2

    .line 520
    .line 521
    if-ltz v3, :cond_35

    .line 522
    .line 523
    :cond_1b
    iget-boolean v3, v7, Lk9;->N:Z

    .line 524
    .line 525
    if-nez v3, :cond_1c

    .line 526
    .line 527
    cmpg-float v1, v1, v2

    .line 528
    .line 529
    if-gtz v1, :cond_35

    .line 530
    .line 531
    :cond_1c
    iput v11, v0, Loe;->f:I

    .line 532
    .line 533
    goto/16 :goto_12

    .line 534
    .line 535
    :cond_1d
    :goto_8
    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 536
    .line 537
    .line 538
    move-result-object v3

    .line 539
    if-eqz v3, :cond_1e

    .line 540
    .line 541
    invoke-interface {v3, v11}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 542
    .line 543
    .line 544
    :cond_1e
    iget-boolean v3, v7, Lk9;->O:Z

    .line 545
    .line 546
    if-nez v3, :cond_1f

    .line 547
    .line 548
    iget-boolean v3, v7, Lk9;->P:Z

    .line 549
    .line 550
    if-eqz v3, :cond_35

    .line 551
    .line 552
    :cond_1f
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 553
    .line 554
    .line 555
    move-result v3

    .line 556
    if-lt v3, v12, :cond_35

    .line 557
    .line 558
    invoke-virtual {v7}, Lje;->getOnChartGestureListener()Lbj0;

    .line 559
    .line 560
    .line 561
    invoke-static {v1}, Ll9;->d(Landroid/view/MotionEvent;)F

    .line 562
    .line 563
    .line 564
    move-result v3

    .line 565
    iget v6, v0, Ll9;->w:F

    .line 566
    .line 567
    cmpl-float v6, v3, v6

    .line 568
    .line 569
    if-lez v6, :cond_35

    .line 570
    .line 571
    iget v6, v5, Laa0;->g:F

    .line 572
    .line 573
    iget v5, v5, Laa0;->h:F

    .line 574
    .line 575
    invoke-virtual {v0, v6, v5}, Ll9;->a(FF)Laa0;

    .line 576
    .line 577
    .line 578
    move-result-object v5

    .line 579
    invoke-virtual {v7}, Lje;->getViewPortHandler()Lu61;

    .line 580
    .line 581
    .line 582
    move-result-object v6

    .line 583
    iget v8, v0, Loe;->f:I

    .line 584
    .line 585
    if-ne v8, v15, :cond_28

    .line 586
    .line 587
    iget v1, v0, Ll9;->p:F

    .line 588
    .line 589
    div-float/2addr v3, v1

    .line 590
    cmpg-float v1, v3, v4

    .line 591
    .line 592
    if-gez v1, :cond_20

    .line 593
    .line 594
    move v1, v11

    .line 595
    goto :goto_9

    .line 596
    :cond_20
    move v1, v9

    .line 597
    :goto_9
    if-eqz v1, :cond_22

    .line 598
    .line 599
    iget v8, v6, Lu61;->i:F

    .line 600
    .line 601
    iget v10, v6, Lu61;->g:F

    .line 602
    .line 603
    cmpl-float v8, v8, v10

    .line 604
    .line 605
    if-lez v8, :cond_21

    .line 606
    .line 607
    :goto_a
    move v8, v11

    .line 608
    goto :goto_b

    .line 609
    :cond_21
    move v8, v9

    .line 610
    goto :goto_b

    .line 611
    :cond_22
    iget v8, v6, Lu61;->i:F

    .line 612
    .line 613
    iget v10, v6, Lu61;->h:F

    .line 614
    .line 615
    cmpg-float v8, v8, v10

    .line 616
    .line 617
    if-gez v8, :cond_21

    .line 618
    .line 619
    goto :goto_a

    .line 620
    :goto_b
    if-eqz v1, :cond_23

    .line 621
    .line 622
    iget v1, v6, Lu61;->j:F

    .line 623
    .line 624
    iget v6, v6, Lu61;->e:F

    .line 625
    .line 626
    cmpl-float v1, v1, v6

    .line 627
    .line 628
    if-lez v1, :cond_24

    .line 629
    .line 630
    :goto_c
    move v9, v11

    .line 631
    goto :goto_d

    .line 632
    :cond_23
    iget v1, v6, Lu61;->j:F

    .line 633
    .line 634
    iget v6, v6, Lu61;->f:F

    .line 635
    .line 636
    cmpg-float v1, v1, v6

    .line 637
    .line 638
    if-gez v1, :cond_24

    .line 639
    .line 640
    goto :goto_c

    .line 641
    :cond_24
    :goto_d
    iget-boolean v1, v7, Lk9;->O:Z

    .line 642
    .line 643
    if-eqz v1, :cond_25

    .line 644
    .line 645
    move v1, v3

    .line 646
    goto :goto_e

    .line 647
    :cond_25
    move v1, v4

    .line 648
    :goto_e
    iget-boolean v6, v7, Lk9;->P:Z

    .line 649
    .line 650
    if-eqz v6, :cond_26

    .line 651
    .line 652
    move v4, v3

    .line 653
    :cond_26
    if-nez v9, :cond_27

    .line 654
    .line 655
    if-eqz v8, :cond_2c

    .line 656
    .line 657
    :cond_27
    iget-object v3, v0, Ll9;->j:Landroid/graphics/Matrix;

    .line 658
    .line 659
    invoke-virtual {v3, v2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 660
    .line 661
    .line 662
    iget-object v2, v0, Ll9;->j:Landroid/graphics/Matrix;

    .line 663
    .line 664
    iget v3, v5, Laa0;->g:F

    .line 665
    .line 666
    iget v6, v5, Laa0;->h:F

    .line 667
    .line 668
    invoke-virtual {v2, v1, v4, v3, v6}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 669
    .line 670
    .line 671
    goto/16 :goto_11

    .line 672
    .line 673
    :cond_28
    if-ne v8, v12, :cond_2a

    .line 674
    .line 675
    iget-boolean v3, v7, Lk9;->O:Z

    .line 676
    .line 677
    if-eqz v3, :cond_2a

    .line 678
    .line 679
    invoke-virtual {v1, v9}, Landroid/view/MotionEvent;->getX(I)F

    .line 680
    .line 681
    .line 682
    move-result v3

    .line 683
    invoke-virtual {v1, v11}, Landroid/view/MotionEvent;->getX(I)F

    .line 684
    .line 685
    .line 686
    move-result v1

    .line 687
    sub-float/2addr v3, v1

    .line 688
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 689
    .line 690
    .line 691
    move-result v1

    .line 692
    iget v3, v0, Ll9;->n:F

    .line 693
    .line 694
    div-float/2addr v1, v3

    .line 695
    cmpg-float v3, v1, v4

    .line 696
    .line 697
    if-gez v3, :cond_29

    .line 698
    .line 699
    iget v3, v6, Lu61;->i:F

    .line 700
    .line 701
    iget v6, v6, Lu61;->g:F

    .line 702
    .line 703
    cmpl-float v3, v3, v6

    .line 704
    .line 705
    if-lez v3, :cond_2c

    .line 706
    .line 707
    goto :goto_f

    .line 708
    :cond_29
    iget v3, v6, Lu61;->i:F

    .line 709
    .line 710
    iget v6, v6, Lu61;->h:F

    .line 711
    .line 712
    cmpg-float v3, v3, v6

    .line 713
    .line 714
    if-gez v3, :cond_2c

    .line 715
    .line 716
    :goto_f
    iget-object v3, v0, Ll9;->j:Landroid/graphics/Matrix;

    .line 717
    .line 718
    invoke-virtual {v3, v2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 719
    .line 720
    .line 721
    iget-object v2, v0, Ll9;->j:Landroid/graphics/Matrix;

    .line 722
    .line 723
    iget v3, v5, Laa0;->g:F

    .line 724
    .line 725
    iget v6, v5, Laa0;->h:F

    .line 726
    .line 727
    invoke-virtual {v2, v1, v4, v3, v6}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 728
    .line 729
    .line 730
    goto :goto_11

    .line 731
    :cond_2a
    if-ne v8, v10, :cond_2c

    .line 732
    .line 733
    iget-boolean v3, v7, Lk9;->P:Z

    .line 734
    .line 735
    if-eqz v3, :cond_2c

    .line 736
    .line 737
    invoke-virtual {v1, v9}, Landroid/view/MotionEvent;->getY(I)F

    .line 738
    .line 739
    .line 740
    move-result v3

    .line 741
    invoke-virtual {v1, v11}, Landroid/view/MotionEvent;->getY(I)F

    .line 742
    .line 743
    .line 744
    move-result v1

    .line 745
    sub-float/2addr v3, v1

    .line 746
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 747
    .line 748
    .line 749
    move-result v1

    .line 750
    iget v3, v0, Ll9;->o:F

    .line 751
    .line 752
    div-float/2addr v1, v3

    .line 753
    cmpg-float v3, v1, v4

    .line 754
    .line 755
    if-gez v3, :cond_2b

    .line 756
    .line 757
    iget v3, v6, Lu61;->j:F

    .line 758
    .line 759
    iget v6, v6, Lu61;->e:F

    .line 760
    .line 761
    cmpl-float v3, v3, v6

    .line 762
    .line 763
    if-lez v3, :cond_2c

    .line 764
    .line 765
    goto :goto_10

    .line 766
    :cond_2b
    iget v3, v6, Lu61;->j:F

    .line 767
    .line 768
    iget v6, v6, Lu61;->f:F

    .line 769
    .line 770
    cmpg-float v3, v3, v6

    .line 771
    .line 772
    if-gez v3, :cond_2c

    .line 773
    .line 774
    :goto_10
    iget-object v3, v0, Ll9;->j:Landroid/graphics/Matrix;

    .line 775
    .line 776
    invoke-virtual {v3, v2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 777
    .line 778
    .line 779
    iget-object v2, v0, Ll9;->j:Landroid/graphics/Matrix;

    .line 780
    .line 781
    iget v3, v5, Laa0;->g:F

    .line 782
    .line 783
    iget v6, v5, Laa0;->h:F

    .line 784
    .line 785
    invoke-virtual {v2, v4, v1, v3, v6}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 786
    .line 787
    .line 788
    :cond_2c
    :goto_11
    sget-object v1, Laa0;->i:Lni0;

    .line 789
    .line 790
    invoke-virtual {v1, v5}, Lni0;->c(Lmi0;)V

    .line 791
    .line 792
    .line 793
    goto/16 :goto_12

    .line 794
    .line 795
    :cond_2d
    iget-object v2, v0, Ll9;->r:Landroid/view/VelocityTracker;

    .line 796
    .line 797
    invoke-virtual {v1, v9}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 798
    .line 799
    .line 800
    move-result v5

    .line 801
    sget v6, Lk41;->c:I

    .line 802
    .line 803
    int-to-float v6, v6

    .line 804
    invoke-virtual {v2, v13, v6}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 805
    .line 806
    .line 807
    invoke-virtual {v2, v5}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    .line 808
    .line 809
    .line 810
    move-result v6

    .line 811
    invoke-virtual {v2, v5}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    .line 812
    .line 813
    .line 814
    move-result v2

    .line 815
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 816
    .line 817
    .line 818
    move-result v5

    .line 819
    sget v8, Lk41;->b:I

    .line 820
    .line 821
    int-to-float v8, v8

    .line 822
    cmpl-float v5, v5, v8

    .line 823
    .line 824
    if-gtz v5, :cond_2e

    .line 825
    .line 826
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    .line 827
    .line 828
    .line 829
    move-result v5

    .line 830
    sget v8, Lk41;->b:I

    .line 831
    .line 832
    int-to-float v8, v8

    .line 833
    cmpl-float v5, v5, v8

    .line 834
    .line 835
    if-lez v5, :cond_2f

    .line 836
    .line 837
    :cond_2e
    iget v5, v0, Loe;->f:I

    .line 838
    .line 839
    if-ne v5, v11, :cond_2f

    .line 840
    .line 841
    iget-boolean v5, v7, Lje;->i:Z

    .line 842
    .line 843
    if-eqz v5, :cond_2f

    .line 844
    .line 845
    move/from16 v5, v16

    .line 846
    .line 847
    iput v5, v3, Laa0;->g:F

    .line 848
    .line 849
    iput v5, v3, Laa0;->h:F

    .line 850
    .line 851
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 852
    .line 853
    .line 854
    move-result-wide v14

    .line 855
    iput-wide v14, v0, Ll9;->s:J

    .line 856
    .line 857
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getX()F

    .line 858
    .line 859
    .line 860
    move-result v13

    .line 861
    iput v13, v4, Laa0;->g:F

    .line 862
    .line 863
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getY()F

    .line 864
    .line 865
    .line 866
    move-result v1

    .line 867
    iput v1, v4, Laa0;->h:F

    .line 868
    .line 869
    iput v2, v3, Laa0;->g:F

    .line 870
    .line 871
    iput v6, v3, Laa0;->h:F

    .line 872
    .line 873
    invoke-virtual {v7}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 874
    .line 875
    .line 876
    :cond_2f
    iget v1, v0, Loe;->f:I

    .line 877
    .line 878
    if-eq v1, v12, :cond_30

    .line 879
    .line 880
    if-eq v1, v10, :cond_30

    .line 881
    .line 882
    const/4 v8, 0x4

    .line 883
    if-eq v1, v8, :cond_30

    .line 884
    .line 885
    const/4 v5, 0x5

    .line 886
    if-ne v1, v5, :cond_31

    .line 887
    .line 888
    :cond_30
    invoke-virtual {v7}, Lk9;->a()V

    .line 889
    .line 890
    .line 891
    invoke-virtual {v7}, Landroid/view/View;->postInvalidate()V

    .line 892
    .line 893
    .line 894
    :cond_31
    iput v9, v0, Loe;->f:I

    .line 895
    .line 896
    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 897
    .line 898
    .line 899
    move-result-object v1

    .line 900
    if-eqz v1, :cond_32

    .line 901
    .line 902
    invoke-interface {v1, v9}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 903
    .line 904
    .line 905
    :cond_32
    iget-object v1, v0, Ll9;->r:Landroid/view/VelocityTracker;

    .line 906
    .line 907
    if-eqz v1, :cond_33

    .line 908
    .line 909
    invoke-virtual {v1}, Landroid/view/VelocityTracker;->recycle()V

    .line 910
    .line 911
    .line 912
    const/4 v1, 0x0

    .line 913
    iput-object v1, v0, Ll9;->r:Landroid/view/VelocityTracker;

    .line 914
    .line 915
    :cond_33
    invoke-virtual {v7}, Lje;->getOnChartGestureListener()Lbj0;

    .line 916
    .line 917
    .line 918
    goto :goto_12

    .line 919
    :cond_34
    invoke-virtual {v7}, Lje;->getOnChartGestureListener()Lbj0;

    .line 920
    .line 921
    .line 922
    const/4 v5, 0x0

    .line 923
    iput v5, v3, Laa0;->g:F

    .line 924
    .line 925
    iput v5, v3, Laa0;->h:F

    .line 926
    .line 927
    invoke-virtual {v0, v1}, Ll9;->c(Landroid/view/MotionEvent;)V

    .line 928
    .line 929
    .line 930
    :cond_35
    :goto_12
    invoke-virtual {v7}, Lje;->getViewPortHandler()Lu61;

    .line 931
    .line 932
    .line 933
    move-result-object v1

    .line 934
    iget-object v2, v0, Ll9;->j:Landroid/graphics/Matrix;

    .line 935
    .line 936
    invoke-virtual {v1, v2, v7, v11}, Lu61;->e(Landroid/graphics/Matrix;Landroid/view/View;Z)V

    .line 937
    .line 938
    .line 939
    iput-object v2, v0, Ll9;->j:Landroid/graphics/Matrix;

    .line 940
    .line 941
    return v11
.end method
