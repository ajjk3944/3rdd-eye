.class public final LI0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ScrollCaptureCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI0/d$a;
    }
.end annotation


# instance fields
.field private final a:LJ0/n;

.field private final b:LY0/p;

.field private final c:LI0/d$a;

.field private final d:LIi/N;

.field private final e:LI0/h;

.field private f:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LJ0/n;LY0/p;LIi/N;LI0/d$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI0/d;->a:LJ0/n;

    iput-object p2, p0, LI0/d;->b:LY0/p;

    iput-object p4, p0, LI0/d;->c:LI0/d$a;

    sget-object p1, LI0/g;->a:LI0/g;

    invoke-static {p3, p1}, LIi/O;->j(LIi/N;Ldh/i;)LIi/N;

    move-result-object p1

    iput-object p1, p0, LI0/d;->d:LIi/N;

    new-instance p1, LI0/h;

    invoke-virtual {p2}, LY0/p;->e()I

    move-result p2

    new-instance p3, LI0/d$f;

    const/4 p4, 0x0

    invoke-direct {p3, p0, p4}, LI0/d$f;-><init>(LI0/d;Ldh/e;)V

    invoke-direct {p1, p2, p3}, LI0/h;-><init>(ILmh/p;)V

    iput-object p1, p0, LI0/d;->e:LI0/h;

    return-void
.end method

.method public static final synthetic a(LI0/d;)LI0/d$a;
    .locals 0

    iget-object p0, p0, LI0/d;->c:LI0/d$a;

    return-object p0
.end method

.method public static final synthetic b(LI0/d;)LJ0/n;
    .locals 0

    iget-object p0, p0, LI0/d;->a:LJ0/n;

    return-object p0
.end method

.method public static final synthetic c(LI0/d;)LI0/h;
    .locals 0

    iget-object p0, p0, LI0/d;->e:LI0/h;

    return-object p0
.end method

.method public static final synthetic d(LI0/d;Landroid/view/ScrollCaptureSession;LY0/p;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LI0/d;->e(Landroid/view/ScrollCaptureSession;LY0/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final e(Landroid/view/ScrollCaptureSession;LY0/p;Ldh/e;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p3, LI0/d$d;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, LI0/d$d;

    iget v1, v0, LI0/d$d;->h:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LI0/d$d;->h:I

    goto :goto_0

    :cond_0
    new-instance v0, LI0/d$d;

    invoke-direct {v0, p0, p3}, LI0/d$d;-><init>(LI0/d;Ldh/e;)V

    :goto_0
    iget-object p3, v0, LI0/d$d;->f:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LI0/d$d;->h:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, LI0/d$d;->e:I

    iget p2, v0, LI0/d$d;->d:I

    iget-object v1, v0, LI0/d$d;->c:Ljava/lang/Object;

    check-cast v1, LY0/p;

    iget-object v2, v0, LI0/d$d;->b:Ljava/lang/Object;

    invoke-static {v2}, LI0/a;->a(Ljava/lang/Object;)Landroid/view/ScrollCaptureSession;

    move-result-object v2

    iget-object v0, v0, LI0/d$d;->a:Ljava/lang/Object;

    check-cast v0, LI0/d;

    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    move-object p3, v2

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, LI0/d$d;->e:I

    iget p2, v0, LI0/d$d;->d:I

    iget-object v2, v0, LI0/d$d;->c:Ljava/lang/Object;

    check-cast v2, LY0/p;

    iget-object v4, v0, LI0/d$d;->b:Ljava/lang/Object;

    invoke-static {v4}, LI0/a;->a(Ljava/lang/Object;)Landroid/view/ScrollCaptureSession;

    move-result-object v4

    iget-object v5, v0, LI0/d$d;->a:Ljava/lang/Object;

    check-cast v5, LI0/d;

    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    move p3, p2

    move-object p2, v2

    move v2, p1

    move-object p1, v4

    goto :goto_1

    :cond_3
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    invoke-virtual {p2}, LY0/p;->h()I

    move-result p3

    invoke-virtual {p2}, LY0/p;->d()I

    move-result v2

    iget-object v5, p0, LI0/d;->e:LI0/h;

    iput-object p0, v0, LI0/d$d;->a:Ljava/lang/Object;

    iput-object p1, v0, LI0/d$d;->b:Ljava/lang/Object;

    iput-object p2, v0, LI0/d$d;->c:Ljava/lang/Object;

    iput p3, v0, LI0/d$d;->d:I

    iput v2, v0, LI0/d$d;->e:I

    iput v4, v0, LI0/d$d;->h:I

    invoke-virtual {v5, p3, v2, v0}, LI0/h;->f(IILdh/e;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_4

    return-object v1

    :cond_4
    move-object v5, p0

    :goto_1
    sget-object v4, LI0/d$e;->a:LI0/d$e;

    iput-object v5, v0, LI0/d$d;->a:Ljava/lang/Object;

    iput-object p1, v0, LI0/d$d;->b:Ljava/lang/Object;

    iput-object p2, v0, LI0/d$d;->c:Ljava/lang/Object;

    iput p3, v0, LI0/d$d;->d:I

    iput v2, v0, LI0/d$d;->e:I

    iput v3, v0, LI0/d$d;->h:I

    invoke-static {v4, v0}, LT/i0;->c(Lmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_5

    return-object v1

    :cond_5
    move-object v1, p2

    move p2, p3

    move-object v0, v5

    move-object p3, p1

    move p1, v2

    :goto_2
    iget-object v2, v0, LI0/d;->e:LI0/h;

    invoke-virtual {v2, p2}, LI0/h;->c(I)I

    move-result p2

    iget-object v2, v0, LI0/d;->e:LI0/h;

    invoke-virtual {v2, p1}, LI0/h;->c(I)I

    move-result p1

    const/4 v6, 0x5

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    move v3, p2

    move v5, p1

    invoke-static/range {v1 .. v7}, LY0/p;->c(LY0/p;IIIIILjava/lang/Object;)LY0/p;

    move-result-object v1

    if-ne p2, p1, :cond_6

    sget-object p1, LY0/p;->e:LY0/p$a;

    invoke-virtual {p1}, LY0/p$a;->a()LY0/p;

    move-result-object p1

    return-object p1

    :cond_6
    iget-object p1, v0, LI0/d;->a:LJ0/n;

    invoke-virtual {p1}, LJ0/n;->e()LE0/c0;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-static {p3}, LI0/b;->a(Landroid/view/ScrollCaptureSession;)Landroid/view/Surface;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/Surface;->lockHardwareCanvas()Landroid/graphics/Canvas;

    move-result-object p2

    :try_start_0
    invoke-static {}, Lm0/a;->a()Landroid/graphics/BlendMode;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {p2, v3, v2}, LI0/c;->a(Landroid/graphics/Canvas;ILandroid/graphics/BlendMode;)V

    invoke-static {p2}, Lm0/H;->b(Landroid/graphics/Canvas;)Lm0/n0;

    move-result-object v2

    invoke-virtual {v1}, LY0/p;->f()I

    move-result v4

    int-to-float v4, v4

    neg-float v4, v4

    invoke-virtual {v1}, LY0/p;->h()I

    move-result v5

    int-to-float v5, v5

    neg-float v5, v5

    invoke-interface {v2, v4, v5}, Lm0/n0;->c(FF)V

    const/4 v4, 0x0

    invoke-virtual {p1, v2, v4}, LE0/c0;->p2(Lm0/n0;Lp0/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p3}, LI0/b;->a(Landroid/view/ScrollCaptureSession;)Landroid/view/Surface;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/view/Surface;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    iget-object p1, v0, LI0/d;->e:LI0/h;

    invoke-virtual {p1}, LI0/h;->b()F

    move-result p1

    invoke-static {p1}, Loh/b;->e(F)I

    move-result p1

    invoke-virtual {v1, v3, p1}, LY0/p;->l(II)LY0/p;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    invoke-static {p3}, LI0/b;->a(Landroid/view/ScrollCaptureSession;)Landroid/view/Surface;

    move-result-object p3

    invoke-virtual {p3, p2}, Landroid/view/Surface;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    throw p1

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Could not find coordinator for semantics node."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public onScrollCaptureEnd(Ljava/lang/Runnable;)V
    .locals 6

    iget-object v0, p0, LI0/d;->d:LIi/N;

    sget-object v1, LIi/J0;->b:LIi/J0;

    new-instance v3, LI0/d$b;

    const/4 v2, 0x0

    invoke-direct {v3, p0, p1, v2}, LI0/d$b;-><init>(LI0/d;Ljava/lang/Runnable;Ldh/e;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    return-void
.end method

.method public onScrollCaptureImageRequest(Landroid/view/ScrollCaptureSession;Landroid/os/CancellationSignal;Landroid/graphics/Rect;Ljava/util/function/Consumer;)V
    .locals 8

    iget-object v0, p0, LI0/d;->d:LIi/N;

    new-instance v7, LI0/d$c;

    const/4 v6, 0x0

    move-object v1, v7

    move-object v2, p0

    move-object v3, p1

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v6}, LI0/d$c;-><init>(LI0/d;Landroid/view/ScrollCaptureSession;Landroid/graphics/Rect;Ljava/util/function/Consumer;Ldh/e;)V

    invoke-static {v0, p2, v7}, LI0/f;->b(LIi/N;Landroid/os/CancellationSignal;Lmh/p;)LIi/y0;

    return-void
.end method

.method public onScrollCaptureSearch(Landroid/os/CancellationSignal;Ljava/util/function/Consumer;)V
    .locals 0

    iget-object p1, p0, LI0/d;->b:LY0/p;

    invoke-static {p1}, Lm0/b1;->a(LY0/p;)Landroid/graphics/Rect;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public onScrollCaptureStart(Landroid/view/ScrollCaptureSession;Landroid/os/CancellationSignal;Ljava/lang/Runnable;)V
    .locals 0

    iget-object p1, p0, LI0/d;->e:LI0/h;

    invoke-virtual {p1}, LI0/h;->d()V

    const/4 p1, 0x0

    iput p1, p0, LI0/d;->f:I

    iget-object p1, p0, LI0/d;->c:LI0/d$a;

    invoke-interface {p1}, LI0/d$a;->a()V

    invoke-interface {p3}, Ljava/lang/Runnable;->run()V

    return-void
.end method
