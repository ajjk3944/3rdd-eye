.class public final Lm7/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm7/d$a;,
        Lm7/d$b;,
        Lm7/d$c;,
        Lm7/d$d;
    }
.end annotation


# static fields
.field public static final j:Lm7/d$a;


# instance fields
.field private final a:Lm7/e;

.field private final b:Lm7/b;

.field private c:Landroid/view/GestureDetector;

.field private d:Landroid/view/ScaleGestureDetector;

.field private e:Lf7/a;

.field private f:Landroid/widget/Scroller;

.field private g:Landroid/animation/ValueAnimator;

.field private h:F

.field private i:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lm7/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lm7/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lm7/d;->j:Lm7/d$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lm7/e;Lm7/b;)V
    .locals 1

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "renderer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "controller"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lm7/d;->a:Lm7/e;

    iput-object p3, p0, Lm7/d;->b:Lm7/b;

    new-instance p2, Landroid/view/GestureDetector;

    new-instance p3, Lm7/d$b;

    invoke-direct {p3, p0}, Lm7/d$b;-><init>(Lm7/d;)V

    invoke-direct {p2, p1, p3}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object p2, p0, Lm7/d;->c:Landroid/view/GestureDetector;

    new-instance p2, Landroid/view/ScaleGestureDetector;

    new-instance p3, Lm7/d$d;

    invoke-direct {p3, p0}, Lm7/d$d;-><init>(Lm7/d;)V

    invoke-direct {p2, p1, p3}, Landroid/view/ScaleGestureDetector;-><init>(Landroid/content/Context;Landroid/view/ScaleGestureDetector$OnScaleGestureListener;)V

    iput-object p2, p0, Lm7/d;->d:Landroid/view/ScaleGestureDetector;

    new-instance p2, Lf7/a;

    new-instance p3, Lm7/d$c;

    invoke-direct {p3, p0}, Lm7/d$c;-><init>(Lm7/d;)V

    invoke-direct {p2, p3}, Lf7/a;-><init>(Lf7/a$b;)V

    iput-object p2, p0, Lm7/d;->e:Lf7/a;

    new-instance p2, Landroid/widget/Scroller;

    const/4 p3, 0x0

    const/4 v0, 0x1

    invoke-direct {p2, p1, p3, v0}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;Z)V

    iput-object p2, p0, Lm7/d;->f:Landroid/widget/Scroller;

    const/4 p1, 0x2

    new-array p1, p1, [F

    fill-array-data p1, :array_0

    invoke-static {p1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object p1

    const-string/jumbo p2, "ofFloat(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lm7/d;->g:Landroid/animation/ValueAnimator;

    new-instance p2, Lm7/c;

    invoke-direct {p2, p0}, Lm7/c;-><init>(Lm7/d;)V

    invoke-virtual {p1, p2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    const/high16 p1, -0x40800000    # -1.0f

    iput p1, p0, Lm7/d;->h:F

    iput p1, p0, Lm7/d;->i:F

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public static synthetic a(Lm7/d;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-static {p0, p1}, Lm7/d;->b(Lm7/d;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method private static final b(Lm7/d;Landroid/animation/ValueAnimator;)V
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lm7/d;->p()V

    return-void
.end method

.method public static final synthetic c(Lm7/d;)Landroid/animation/ValueAnimator;
    .locals 0

    iget-object p0, p0, Lm7/d;->g:Landroid/animation/ValueAnimator;

    return-object p0
.end method

.method public static final synthetic d(Lm7/d;)Landroid/widget/Scroller;
    .locals 0

    iget-object p0, p0, Lm7/d;->f:Landroid/widget/Scroller;

    return-object p0
.end method

.method public static final synthetic e(Lm7/d;)Z
    .locals 0

    invoke-direct {p0}, Lm7/d;->i()Z

    move-result p0

    return p0
.end method

.method public static final synthetic f(Lm7/d;FF)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lm7/d;->j(FF)V

    return-void
.end method

.method public static final synthetic g(Lm7/d;F)V
    .locals 0

    invoke-direct {p0, p1}, Lm7/d;->m(F)V

    return-void
.end method

.method public static final synthetic h(Lm7/d;F)V
    .locals 0

    invoke-direct {p0, p1}, Lm7/d;->n(F)V

    return-void
.end method

.method private final i()Z
    .locals 1

    iget-object v0, p0, Lm7/d;->f:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->isFinished()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method private final j(FF)V
    .locals 3

    iget-object v0, p0, Lm7/d;->a:Lm7/e;

    new-instance v1, Landroid/graphics/PointF;

    invoke-direct {v1, p1, p2}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-virtual {v0, v1}, Lm7/e;->b(Landroid/graphics/PointF;)Landroid/graphics/PointF;

    move-result-object p1

    iget-object p2, p0, Lm7/d;->b:Lm7/b;

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lm7/b;->d(Z)V

    iget-object p2, p0, Lm7/d;->b:Lm7/b;

    invoke-virtual {p2, v0}, Lm7/b;->f(Z)V

    iget-object p2, p0, Lm7/d;->b:Lm7/b;

    new-instance v0, Landroid/graphics/PointF;

    iget-object v1, p0, Lm7/d;->b:Lm7/b;

    invoke-virtual {v1}, Lm7/b;->a()Landroid/graphics/PointF;

    move-result-object v1

    iget v1, v1, Landroid/graphics/PointF;->x:F

    iget v2, p1, Landroid/graphics/PointF;->x:F

    add-float/2addr v1, v2

    iget-object v2, p0, Lm7/d;->b:Lm7/b;

    invoke-virtual {v2}, Lm7/b;->a()Landroid/graphics/PointF;

    move-result-object v2

    iget v2, v2, Landroid/graphics/PointF;->y:F

    iget p1, p1, Landroid/graphics/PointF;->y:F

    add-float/2addr v2, p1

    invoke-direct {v0, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-virtual {p2, v0}, Lm7/b;->e(Landroid/graphics/PointF;)V

    return-void
.end method

.method private final k()V
    .locals 0

    return-void
.end method

.method private final m(F)V
    .locals 2

    iget-object v0, p0, Lm7/d;->b:Lm7/b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lm7/b;->f(Z)V

    iget-object v0, p0, Lm7/d;->b:Lm7/b;

    invoke-virtual {v0}, Lm7/b;->b()F

    move-result v1

    add-float/2addr v1, p1

    invoke-virtual {v0, v1}, Lm7/b;->g(F)V

    return-void
.end method

.method private final n(F)V
    .locals 2

    iget-object v0, p0, Lm7/d;->b:Lm7/b;

    invoke-virtual {v0}, Lm7/b;->c()F

    move-result v1

    div-float/2addr v1, p1

    invoke-virtual {v0, v1}, Lm7/b;->h(F)V

    return-void
.end method

.method private final p()V
    .locals 3

    iget-object v0, p0, Lm7/d;->f:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->isFinished()Z

    move-result v0

    const/high16 v1, -0x40800000    # -1.0f

    if-nez v0, :cond_1

    iget-object v0, p0, Lm7/d;->f:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->computeScrollOffset()Z

    iget v0, p0, Lm7/d;->h:F

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lm7/d;->f:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->getCurrX()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lm7/d;->h:F

    sub-float/2addr v0, v1

    iget-object v1, p0, Lm7/d;->f:Landroid/widget/Scroller;

    invoke-virtual {v1}, Landroid/widget/Scroller;->getCurrY()I

    move-result v1

    int-to-float v1, v1

    iget v2, p0, Lm7/d;->i:F

    sub-float/2addr v1, v2

    invoke-direct {p0, v0, v1}, Lm7/d;->j(FF)V

    :goto_0
    iget-object v0, p0, Lm7/d;->f:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->getCurrX()I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lm7/d;->h:F

    iget-object v0, p0, Lm7/d;->f:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->getCurrY()I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lm7/d;->i:F

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lm7/d;->g:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    iput v1, p0, Lm7/d;->h:F

    iput v1, p0, Lm7/d;->i:F

    invoke-direct {p0}, Lm7/d;->k()V

    :goto_1
    return-void
.end method


# virtual methods
.method public final l(Landroid/view/MotionEvent;)Z
    .locals 4

    const-string/jumbo v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lm7/d;->d:Landroid/view/ScaleGestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/ScaleGestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    iget-object v1, p0, Lm7/d;->e:Lf7/a;

    invoke-virtual {v1, p1}, Lf7/a;->b(Landroid/view/MotionEvent;)Z

    move-result v1

    iget-object v2, p0, Lm7/d;->c:Landroid/view/GestureDetector;

    invoke-virtual {v2, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    const/4 v3, 0x1

    if-ne p1, v3, :cond_0

    invoke-virtual {p0}, Lm7/d;->o()V

    :cond_0
    or-int p1, v0, v2

    or-int/2addr p1, v1

    return p1
.end method

.method public final o()V
    .locals 2

    iget-object v0, p0, Lm7/d;->f:Landroid/widget/Scroller;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Scroller;->forceFinished(Z)V

    invoke-direct {p0}, Lm7/d;->k()V

    return-void
.end method
