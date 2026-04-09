.class final Lm7/d$b;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm7/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field private a:F

.field private b:F

.field private c:I

.field final synthetic d:Lm7/d;


# direct methods
.method public constructor <init>(Lm7/d;)V
    .locals 0

    iput-object p1, p0, Lm7/d$b;->d:Lm7/d;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    const/high16 p1, -0x40800000    # -1.0f

    iput p1, p0, Lm7/d$b;->a:F

    iput p1, p0, Lm7/d$b;->b:F

    return-void
.end method


# virtual methods
.method public onDown(Landroid/view/MotionEvent;)Z
    .locals 1

    const-string/jumbo v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lm7/d$b;->d:Lm7/d;

    invoke-static {v0}, Lm7/d;->e(Lm7/d;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lm7/d$b;->d:Lm7/d;

    invoke-virtual {v0}, Lm7/d;->o()V

    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result p1

    iput p1, p0, Lm7/d$b;->c:I

    const/4 p1, 0x0

    iput p1, p0, Lm7/d$b;->a:F

    iput p1, p0, Lm7/d$b;->b:F

    const/4 p1, 0x1

    return p1
.end method

.method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 9

    const-string/jumbo v0, "e2"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object p2, p0, Lm7/d$b;->d:Lm7/d;

    invoke-static {p2}, Lm7/d;->d(Lm7/d;)Landroid/widget/Scroller;

    move-result-object v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p2

    float-to-int v1, p2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    float-to-int v2, p1

    const/high16 p1, 0x3f800000    # 1.0f

    div-float/2addr p3, p1

    float-to-int v3, p3

    neg-float p2, p4

    div-float/2addr p2, p1

    float-to-int v4, p2

    const/high16 v7, -0x80000000

    const v8, 0x7fffffff

    const/high16 v5, -0x80000000

    const v6, 0x7fffffff

    invoke-virtual/range {v0 .. v8}, Landroid/widget/Scroller;->fling(IIIIIIII)V

    iget-object p1, p0, Lm7/d$b;->d:Lm7/d;

    invoke-static {p1}, Lm7/d;->c(Lm7/d;)Landroid/animation/ValueAnimator;

    move-result-object p1

    iget-object p2, p0, Lm7/d$b;->d:Lm7/d;

    invoke-static {p2}, Lm7/d;->d(Lm7/d;)Landroid/widget/Scroller;

    move-result-object p2

    invoke-virtual {p2}, Landroid/widget/Scroller;->getDuration()I

    move-result p2

    int-to-long p2, p2

    invoke-virtual {p1, p2, p3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    iget-object p1, p0, Lm7/d$b;->d:Lm7/d;

    invoke-static {p1}, Lm7/d;->c(Lm7/d;)Landroid/animation/ValueAnimator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    const/4 p1, 0x1

    return p1
.end method

.method public onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 1

    const-string/jumbo p3, "e2"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p4

    sub-float/2addr p3, p4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p4

    sub-float/2addr p1, p4

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result p4

    iget v0, p0, Lm7/d$b;->c:I

    if-eq p4, v0, :cond_1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result p2

    iput p2, p0, Lm7/d$b;->c:I

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lm7/d$b;->d:Lm7/d;

    iget p4, p0, Lm7/d$b;->a:F

    sub-float p4, p3, p4

    iget v0, p0, Lm7/d$b;->b:F

    sub-float v0, p1, v0

    invoke-static {p2, p4, v0}, Lm7/d;->f(Lm7/d;FF)V

    :goto_0
    iput p3, p0, Lm7/d$b;->a:F

    iput p1, p0, Lm7/d$b;->b:F

    const/4 p1, 0x1

    return p1
.end method
