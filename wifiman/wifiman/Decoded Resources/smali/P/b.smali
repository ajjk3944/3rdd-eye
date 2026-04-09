.class public final LP/b;
.super LP/q;
.source "SourceFile"

# interfaces
.implements LP/k;


# instance fields
.field private y:LP/j;

.field private z:LP/n;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Ly/k;ZFLm0/y0;Lmh/a;)V
    .locals 7

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 2
    invoke-direct/range {v0 .. v6}, LP/q;-><init>(Ly/k;ZFLm0/y0;Lmh/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Ly/k;ZFLm0/y0;Lmh/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, LP/b;-><init>(Ly/k;ZFLm0/y0;Lmh/a;)V

    return-void
.end method

.method private final R2()LP/j;
    .locals 1

    iget-object v0, p0, LP/b;->y:LP/j;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    return-object v0

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->k()LT/H0;

    move-result-object v0

    invoke-static {p0, v0}, LE0/i;->a(LE0/h;LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-static {v0}, LP/t;->b(Landroid/view/View;)Landroid/view/ViewGroup;

    move-result-object v0

    invoke-static {v0}, LP/t;->a(Landroid/view/ViewGroup;)LP/j;

    move-result-object v0

    iput-object v0, p0, LP/b;->y:LP/j;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    return-object v0
.end method

.method private final S2(LP/n;)V
    .locals 0

    iput-object p1, p0, LP/b;->z:LP/n;

    invoke-static {p0}, LE0/s;->a(LE0/r;)V

    return-void
.end method


# virtual methods
.method public E0()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LP/b;->S2(LP/n;)V

    return-void
.end method

.method public I2(Ly/o$b;JF)V
    .locals 11

    invoke-direct {p0}, LP/b;->R2()LP/j;

    move-result-object v0

    invoke-virtual {v0, p0}, LP/j;->b(LP/k;)LP/n;

    move-result-object v0

    invoke-virtual {p0}, LP/q;->K2()Z

    move-result v3

    invoke-static {p4}, Loh/b;->e(F)I

    move-result v6

    invoke-virtual {p0}, LP/q;->M2()J

    move-result-wide v7

    invoke-virtual {p0}, LP/q;->L2()Lmh/a;

    move-result-object p4

    invoke-interface {p4}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, LP/g;

    invoke-virtual {p4}, LP/g;->d()F

    move-result v9

    new-instance v10, LP/b$a;

    invoke-direct {v10, p0}, LP/b$a;-><init>(LP/b;)V

    move-object v1, v0

    move-object v2, p1

    move-wide v4, p2

    invoke-virtual/range {v1 .. v10}, LP/n;->b(Ly/o$b;ZJIJFLmh/a;)V

    invoke-direct {p0, v0}, LP/b;->S2(LP/n;)V

    return-void
.end method

.method public J2(Lo0/f;)V
    .locals 7

    invoke-interface {p1}, Lo0/f;->k1()Lo0/d;

    move-result-object p1

    invoke-interface {p1}, Lo0/d;->d()Lm0/n0;

    move-result-object p1

    iget-object v6, p0, LP/b;->z:LP/n;

    if-eqz v6, :cond_0

    invoke-virtual {p0}, LP/q;->N2()J

    move-result-wide v1

    invoke-virtual {p0}, LP/q;->M2()J

    move-result-wide v3

    invoke-virtual {p0}, LP/q;->L2()Lmh/a;

    move-result-object v0

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LP/g;

    invoke-virtual {v0}, LP/g;->d()F

    move-result v5

    move-object v0, v6

    invoke-virtual/range {v0 .. v5}, LP/n;->f(JJF)V

    invoke-static {p1}, Lm0/H;->d(Lm0/n0;)Landroid/graphics/Canvas;

    move-result-object p1

    invoke-virtual {v6, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    :cond_0
    return-void
.end method

.method public P2(Ly/o$b;)V
    .locals 0

    iget-object p1, p0, LP/b;->z:LP/n;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LP/n;->e()V

    :cond_0
    return-void
.end method

.method public o2()V
    .locals 1

    iget-object v0, p0, LP/b;->y:LP/j;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, LP/j;->a(LP/k;)V

    :cond_0
    return-void
.end method
