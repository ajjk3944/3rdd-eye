.class public Lcom/google/android/material/progressindicator/LinearProgressIndicator;
.super Lga;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lga;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1, p2}, Lga;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lm60;

    .line 5
    .line 6
    iget-object p2, p0, Lga;->f:Lv60;

    .line 7
    .line 8
    invoke-direct {p1, p2}, Leq;-><init>(Lv60;)V

    .line 9
    .line 10
    .line 11
    const/high16 v0, 0x43960000    # 300.0f

    .line 12
    .line 13
    iput v0, p1, Lm60;->f:F

    .line 14
    .line 15
    new-instance v0, Landroid/util/Pair;

    .line 16
    .line 17
    new-instance v1, Ldq;

    .line 18
    .line 19
    invoke-direct {v1}, Ldq;-><init>()V

    .line 20
    .line 21
    .line 22
    new-instance v2, Ldq;

    .line 23
    .line 24
    invoke-direct {v2}, Ldq;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-direct {v0, v1, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p1, Lm60;->o:Landroid/util/Pair;

    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    new-instance v1, Ln20;

    .line 37
    .line 38
    iget v2, p2, Lv60;->o:I

    .line 39
    .line 40
    if-nez v2, :cond_0

    .line 41
    .line 42
    new-instance v2, Ln60;

    .line 43
    .line 44
    invoke-direct {v2, p2}, Ln60;-><init>(Lv60;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    new-instance v2, Lp60;

    .line 49
    .line 50
    invoke-direct {v2, v0, p2}, Lp60;-><init>(Landroid/content/Context;Lv60;)V

    .line 51
    .line 52
    .line 53
    :goto_0
    invoke-direct {v1, v0, p2}, Laq;-><init>(Landroid/content/Context;Lv60;)V

    .line 54
    .line 55
    .line 56
    iput-object p1, v1, Ln20;->s:Lm60;

    .line 57
    .line 58
    iput-object v2, v1, Ln20;->t:Le6;

    .line 59
    .line 60
    iput-object v1, v2, Le6;->a:Ljava/lang/Object;

    .line 61
    .line 62
    invoke-virtual {p0, v1}, Lga;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    new-instance v1, Loo;

    .line 70
    .line 71
    invoke-direct {v1, v0, p2, p1}, Loo;-><init>(Landroid/content/Context;Lv60;Lm60;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v1}, Lga;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 75
    .line 76
    .line 77
    const/4 p1, 0x1

    .line 78
    iput-boolean p1, p0, Lga;->m:Z

    .line 79
    .line 80
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lga;->f:Lv60;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, v0, Lv60;->o:I

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->isIndeterminate()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-super {p0, p1}, Lga;->a(I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public getIndeterminateAnimationType()I
    .locals 1

    .line 1
    iget-object v0, p0, Lga;->f:Lv60;

    .line 2
    .line 3
    iget v0, v0, Lv60;->o:I

    .line 4
    .line 5
    return v0
.end method

.method public getIndicatorDirection()I
    .locals 1

    .line 1
    iget-object v0, p0, Lga;->f:Lv60;

    .line 2
    .line 3
    iget v0, v0, Lv60;->p:I

    .line 4
    .line 5
    return v0
.end method

.method public getTrackInnerCornerRadius()I
    .locals 1

    .line 1
    iget-object v0, p0, Lga;->f:Lv60;

    .line 2
    .line 3
    iget v0, v0, Lv60;->t:I

    .line 4
    .line 5
    return v0
.end method

.method public getTrackStopIndicatorPadding()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lga;->f:Lv60;

    .line 2
    .line 3
    iget-object v0, v0, Lv60;->s:Ljava/lang/Integer;

    .line 4
    .line 5
    return-object v0
.end method

.method public getTrackStopIndicatorSize()I
    .locals 1

    .line 1
    iget-object v0, p0, Lga;->f:Lv60;

    .line 2
    .line 3
    iget v0, v0, Lv60;->r:I

    .line 4
    .line 5
    return v0
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Lga;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    move-object p1, p0

    .line 5
    iget-object p2, p1, Lga;->f:Lv60;

    .line 6
    .line 7
    iget p3, p2, Lv60;->p:I

    .line 8
    .line 9
    const/4 p4, 0x1

    .line 10
    if-eq p3, p4, :cond_2

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 13
    .line 14
    .line 15
    move-result p3

    .line 16
    if-ne p3, p4, :cond_0

    .line 17
    .line 18
    iget p3, p2, Lv60;->p:I

    .line 19
    .line 20
    const/4 p5, 0x2

    .line 21
    if-eq p3, p5, :cond_2

    .line 22
    .line 23
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 24
    .line 25
    .line 26
    move-result p3

    .line 27
    if-nez p3, :cond_1

    .line 28
    .line 29
    iget p3, p2, Lv60;->p:I

    .line 30
    .line 31
    const/4 p5, 0x3

    .line 32
    if-ne p3, p5, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 p4, 0x0

    .line 36
    :cond_2
    :goto_0
    iput-boolean p4, p2, Lv60;->q:Z

    .line 37
    .line 38
    return-void
.end method

.method public final onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 6
    .line 7
    .line 8
    move-result p4

    .line 9
    add-int/2addr p4, p3

    .line 10
    sub-int/2addr p1, p4

    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 12
    .line 13
    .line 14
    move-result p3

    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 16
    .line 17
    .line 18
    move-result p4

    .line 19
    add-int/2addr p4, p3

    .line 20
    sub-int/2addr p2, p4

    .line 21
    invoke-virtual {p0}, Lga;->getIndeterminateDrawable()Ln20;

    .line 22
    .line 23
    .line 24
    move-result-object p3

    .line 25
    const/4 p4, 0x0

    .line 26
    if-eqz p3, :cond_0

    .line 27
    .line 28
    invoke-virtual {p3, p4, p4, p1, p2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-virtual {p0}, Lga;->getProgressDrawable()Loo;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    if-eqz p3, :cond_1

    .line 36
    .line 37
    invoke-virtual {p3, p4, p4, p1, p2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 38
    .line 39
    .line 40
    :cond_1
    return-void
.end method

.method public setIndeterminateAnimationType(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lga;->f:Lv60;

    .line 2
    .line 3
    iget v1, v0, Lv60;->o:I

    .line 4
    .line 5
    if-ne v1, p1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0}, Lga;->b()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_2

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->isIndeterminate()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v0, "Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode."

    .line 24
    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_2
    :goto_0
    iput p1, v0, Lv60;->o:I

    .line 30
    .line 31
    invoke-virtual {v0}, Lv60;->d()V

    .line 32
    .line 33
    .line 34
    if-nez p1, :cond_3

    .line 35
    .line 36
    invoke-virtual {p0}, Lga;->getIndeterminateDrawable()Ln20;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    new-instance v1, Ln60;

    .line 41
    .line 42
    invoke-direct {v1, v0}, Ln60;-><init>(Lv60;)V

    .line 43
    .line 44
    .line 45
    iput-object v1, p1, Ln20;->t:Le6;

    .line 46
    .line 47
    iput-object p1, v1, Le6;->a:Ljava/lang/Object;

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_3
    invoke-virtual {p0}, Lga;->getIndeterminateDrawable()Ln20;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    new-instance v1, Lp60;

    .line 55
    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-direct {v1, v2, v0}, Lp60;-><init>(Landroid/content/Context;Lv60;)V

    .line 61
    .line 62
    .line 63
    iput-object v1, p1, Ln20;->t:Le6;

    .line 64
    .line 65
    iput-object p1, v1, Le6;->a:Ljava/lang/Object;

    .line 66
    .line 67
    :goto_1
    invoke-virtual {p0}, Lga;->getProgressDrawable()Loo;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    if-eqz p1, :cond_4

    .line 72
    .line 73
    invoke-virtual {p0}, Lga;->getIndeterminateDrawable()Ln20;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    if-eqz p1, :cond_4

    .line 78
    .line 79
    invoke-virtual {p0}, Lga;->getIndeterminateDrawable()Ln20;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iget-object p1, p1, Ln20;->t:Le6;

    .line 84
    .line 85
    iget-object v0, p0, Lga;->p:Lfa;

    .line 86
    .line 87
    invoke-virtual {p1, v0}, Le6;->m(Lfa;)V

    .line 88
    .line 89
    .line 90
    :cond_4
    invoke-virtual {p0}, Lga;->invalidate()V

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method public varargs setIndicatorColor([I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lga;->setIndicatorColor([I)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lga;->f:Lv60;

    .line 5
    .line 6
    invoke-virtual {p1}, Lv60;->d()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setIndicatorDirection(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lga;->f:Lv60;

    .line 2
    .line 3
    iput p1, v0, Lv60;->p:I

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-eq p1, v1, :cond_2

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-ne v2, v1, :cond_0

    .line 13
    .line 14
    iget v2, v0, Lv60;->p:I

    .line 15
    .line 16
    const/4 v3, 0x2

    .line 17
    if-eq v2, v3, :cond_2

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    const/4 v2, 0x3

    .line 26
    if-ne p1, v2, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 v1, 0x0

    .line 30
    :cond_2
    :goto_0
    iput-boolean v1, v0, Lv60;->q:Z

    .line 31
    .line 32
    invoke-virtual {p0}, Lga;->invalidate()V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public setTrackCornerRadius(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lga;->setTrackCornerRadius(I)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lga;->f:Lv60;

    .line 5
    .line 6
    invoke-virtual {p1}, Lv60;->d()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lga;->invalidate()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setTrackInnerCornerRadius(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lga;->f:Lv60;

    .line 2
    .line 3
    iget v1, v0, Lv60;->t:I

    .line 4
    .line 5
    if-eq v1, p1, :cond_0

    .line 6
    .line 7
    int-to-float p1, p1

    .line 8
    iget v1, v0, Lv60;->a:I

    .line 9
    .line 10
    int-to-float v1, v1

    .line 11
    const/high16 v2, 0x40000000    # 2.0f

    .line 12
    .line 13
    div-float/2addr v1, v2

    .line 14
    invoke-static {p1, v1}, Ljava/lang/Math;->min(FF)F

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    iput p1, v0, Lv60;->t:I

    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    iput-boolean p1, v0, Lv60;->v:Z

    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    iput-boolean p1, v0, Lv60;->w:Z

    .line 29
    .line 30
    invoke-virtual {v0}, Lv60;->d()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lga;->invalidate()V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method

.method public setTrackInnerCornerRadiusFraction(F)V
    .locals 2

    .line 1
    iget-object v0, p0, Lga;->f:Lv60;

    .line 2
    .line 3
    iget v1, v0, Lv60;->u:F

    .line 4
    .line 5
    cmpl-float v1, v1, p1

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const/high16 v1, 0x3f000000    # 0.5f

    .line 10
    .line 11
    invoke-static {p1, v1}, Ljava/lang/Math;->min(FF)F

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    iput p1, v0, Lv60;->u:F

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    iput-boolean p1, v0, Lv60;->v:Z

    .line 19
    .line 20
    iput-boolean p1, v0, Lv60;->w:Z

    .line 21
    .line 22
    invoke-virtual {v0}, Lv60;->d()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lga;->invalidate()V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public setTrackStopIndicatorPadding(Ljava/lang/Integer;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lga;->f:Lv60;

    .line 2
    .line 3
    iget-object v1, v0, Lv60;->s:Ljava/lang/Integer;

    .line 4
    .line 5
    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    iput-object p1, v0, Lv60;->s:Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p0}, Lga;->invalidate()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public setTrackStopIndicatorSize(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lga;->f:Lv60;

    .line 2
    .line 3
    iget v1, v0, Lv60;->r:I

    .line 4
    .line 5
    if-eq v1, p1, :cond_0

    .line 6
    .line 7
    iget v1, v0, Lv60;->a:I

    .line 8
    .line 9
    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    iput p1, v0, Lv60;->r:I

    .line 14
    .line 15
    invoke-virtual {v0}, Lv60;->d()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lga;->invalidate()V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method
