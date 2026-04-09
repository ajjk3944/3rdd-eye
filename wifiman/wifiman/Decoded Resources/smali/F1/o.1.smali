.class public LF1/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF1/o$b;,
        LF1/o$a;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:LF1/p;

.field private final c:LF1/o$b;

.field private final d:LF1/o$a;

.field private e:Landroid/view/VelocityTracker;

.field private f:F

.field private g:I

.field private h:I

.field private i:I

.field private final j:[I


# direct methods
.method public constructor <init>(Landroid/content/Context;LF1/p;)V
    .locals 2

    .line 1
    new-instance v0, LF1/m;

    invoke-direct {v0}, LF1/m;-><init>()V

    new-instance v1, LF1/n;

    invoke-direct {v1}, LF1/n;-><init>()V

    invoke-direct {p0, p1, p2, v0, v1}, LF1/o;-><init>(Landroid/content/Context;LF1/p;LF1/o$b;LF1/o$a;)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;LF1/p;LF1/o$b;LF1/o$a;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 3
    iput v0, p0, LF1/o;->g:I

    .line 4
    iput v0, p0, LF1/o;->h:I

    .line 5
    iput v0, p0, LF1/o;->i:I

    const v0, 0x7fffffff

    const/4 v1, 0x0

    .line 6
    filled-new-array {v0, v1}, [I

    move-result-object v0

    iput-object v0, p0, LF1/o;->j:[I

    .line 7
    iput-object p1, p0, LF1/o;->a:Landroid/content/Context;

    .line 8
    iput-object p2, p0, LF1/o;->b:LF1/p;

    .line 9
    iput-object p3, p0, LF1/o;->c:LF1/o$b;

    .line 10
    iput-object p4, p0, LF1/o;->d:LF1/o$a;

    return-void
.end method

.method public static synthetic a(Landroid/content/Context;[ILandroid/view/MotionEvent;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, LF1/o;->c(Landroid/content/Context;[ILandroid/view/MotionEvent;I)V

    return-void
.end method

.method public static synthetic b(Landroid/view/VelocityTracker;Landroid/view/MotionEvent;I)F
    .locals 0

    invoke-static {p0, p1, p2}, LF1/o;->f(Landroid/view/VelocityTracker;Landroid/view/MotionEvent;I)F

    move-result p0

    return p0
.end method

.method private static c(Landroid/content/Context;[ILandroid/view/MotionEvent;I)V
    .locals 3

    invoke-static {p0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getDeviceId()I

    move-result v1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getSource()I

    move-result v2

    invoke-static {p0, v0, v1, p3, v2}, LF1/Z;->g(Landroid/content/Context;Landroid/view/ViewConfiguration;III)I

    move-result v1

    const/4 v2, 0x0

    aput v1, p1, v2

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getDeviceId()I

    move-result v1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getSource()I

    move-result p2

    invoke-static {p0, v0, v1, p3, p2}, LF1/Z;->f(Landroid/content/Context;Landroid/view/ViewConfiguration;III)I

    move-result p0

    const/4 p2, 0x1

    aput p0, p1, p2

    return-void
.end method

.method private d(Landroid/view/MotionEvent;I)Z
    .locals 5

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getDeviceId()I

    move-result v1

    iget v2, p0, LF1/o;->h:I

    if-ne v2, v0, :cond_1

    iget v2, p0, LF1/o;->i:I

    if-ne v2, v1, :cond_1

    iget v2, p0, LF1/o;->g:I

    if-eq v2, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    iget-object v2, p0, LF1/o;->c:LF1/o$b;

    iget-object v3, p0, LF1/o;->a:Landroid/content/Context;

    iget-object v4, p0, LF1/o;->j:[I

    invoke-interface {v2, v3, v4, p1, p2}, LF1/o$b;->a(Landroid/content/Context;[ILandroid/view/MotionEvent;I)V

    iput v0, p0, LF1/o;->h:I

    iput v1, p0, LF1/o;->i:I

    iput p2, p0, LF1/o;->g:I

    const/4 p1, 0x1

    return p1
.end method

.method private e(Landroid/view/MotionEvent;I)F
    .locals 2

    iget-object v0, p0, LF1/o;->e:Landroid/view/VelocityTracker;

    if-nez v0, :cond_0

    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, LF1/o;->e:Landroid/view/VelocityTracker;

    :cond_0
    iget-object v0, p0, LF1/o;->d:LF1/o$a;

    iget-object v1, p0, LF1/o;->e:Landroid/view/VelocityTracker;

    invoke-interface {v0, v1, p1, p2}, LF1/o$a;->a(Landroid/view/VelocityTracker;Landroid/view/MotionEvent;I)F

    move-result p1

    return p1
.end method

.method private static f(Landroid/view/VelocityTracker;Landroid/view/MotionEvent;I)F
    .locals 0

    invoke-static {p0, p1}, LF1/T;->a(Landroid/view/VelocityTracker;Landroid/view/MotionEvent;)V

    const/16 p1, 0x3e8

    invoke-static {p0, p1}, LF1/T;->b(Landroid/view/VelocityTracker;I)V

    invoke-static {p0, p2}, LF1/T;->d(Landroid/view/VelocityTracker;I)F

    move-result p0

    return p0
.end method


# virtual methods
.method public g(Landroid/view/MotionEvent;I)V
    .locals 4

    invoke-direct {p0, p1, p2}, LF1/o;->d(Landroid/view/MotionEvent;I)Z

    move-result v0

    iget-object v1, p0, LF1/o;->j:[I

    const/4 v2, 0x0

    aget v1, v1, v2

    const v3, 0x7fffffff

    if-ne v1, v3, :cond_1

    iget-object p1, p0, LF1/o;->e:Landroid/view/VelocityTracker;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/view/VelocityTracker;->recycle()V

    const/4 p1, 0x0

    iput-object p1, p0, LF1/o;->e:Landroid/view/VelocityTracker;

    :cond_0
    return-void

    :cond_1
    invoke-direct {p0, p1, p2}, LF1/o;->e(Landroid/view/MotionEvent;I)F

    move-result p1

    iget-object p2, p0, LF1/o;->b:LF1/p;

    invoke-interface {p2}, LF1/p;->b()F

    move-result p2

    mul-float/2addr p1, p2

    invoke-static {p1}, Ljava/lang/Math;->signum(F)F

    move-result p2

    const/4 v1, 0x0

    if-nez v0, :cond_2

    iget v0, p0, LF1/o;->f:F

    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    move-result v0

    cmpl-float v0, p2, v0

    if-eqz v0, :cond_3

    cmpl-float p2, p2, v1

    if-eqz p2, :cond_3

    :cond_2
    iget-object p2, p0, LF1/o;->b:LF1/p;

    invoke-interface {p2}, LF1/p;->c()V

    :cond_3
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p2

    iget-object v0, p0, LF1/o;->j:[I

    aget v2, v0, v2

    int-to-float v2, v2

    cmpg-float p2, p2, v2

    if-gez p2, :cond_4

    return-void

    :cond_4
    const/4 p2, 0x1

    aget p2, v0, p2

    neg-int v0, p2

    int-to-float v0, v0

    int-to-float p2, p2

    invoke-static {p1, p2}, Ljava/lang/Math;->min(FF)F

    move-result p1

    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    iget-object p2, p0, LF1/o;->b:LF1/p;

    invoke-interface {p2, p1}, LF1/p;->a(F)Z

    move-result p2

    if-eqz p2, :cond_5

    move v1, p1

    :cond_5
    iput v1, p0, LF1/o;->f:F

    return-void
.end method
