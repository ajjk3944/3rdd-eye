.class final Ls/o;
.super Landroidx/compose/ui/platform/C0;
.source "SourceFile"

# interfaces
.implements Lj0/g;


# instance fields
.field private final b:Ls/a;

.field private final c:Ls/w;

.field private final d:Ls/P;


# direct methods
.method public constructor <init>(Ls/a;Ls/w;Ls/P;Lmh/l;)V
    .locals 0

    invoke-direct {p0, p4}, Landroidx/compose/ui/platform/C0;-><init>(Lmh/l;)V

    iput-object p1, p0, Ls/o;->b:Ls/a;

    iput-object p2, p0, Ls/o;->c:Ls/w;

    iput-object p3, p0, Ls/o;->d:Ls/P;

    return-void
.end method

.method private final a(Lo0/f;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z
    .locals 8

    iget-object v0, p0, Ls/o;->d:Ls/P;

    invoke-virtual {v0}, Ls/P;->a()Lz/N;

    move-result-object v0

    invoke-interface {v0}, Lz/N;->c()F

    move-result v0

    invoke-interface {p1, v0}, LY0/d;->d1(F)F

    move-result v0

    invoke-interface {p1}, Lo0/f;->c()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/m;->i(J)F

    move-result v1

    neg-float v1, v1

    invoke-interface {p1}, Lo0/f;->c()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll0/m;->g(J)F

    move-result p1

    neg-float p1, p1

    add-float/2addr p1, v0

    invoke-static {v1, p1}, Ll0/h;->a(FF)J

    move-result-wide v4

    const/high16 v3, 0x43340000    # 180.0f

    move-object v2, p0

    move-object v6, p2

    move-object v7, p3

    invoke-direct/range {v2 .. v7}, Ls/o;->f(FJLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    move-result p1

    return p1
.end method

.method private final c(Lo0/f;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z
    .locals 7

    invoke-interface {p1}, Lo0/f;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/m;->g(J)F

    move-result v0

    neg-float v0, v0

    iget-object v1, p0, Ls/o;->d:Ls/P;

    invoke-virtual {v1}, Ls/P;->a()Lz/N;

    move-result-object v1

    invoke-interface {p1}, Lo0/f;->getLayoutDirection()LY0/t;

    move-result-object v2

    invoke-interface {v1, v2}, Lz/N;->a(LY0/t;)F

    move-result v1

    invoke-interface {p1, v1}, LY0/d;->d1(F)F

    move-result p1

    invoke-static {v0, p1}, Ll0/h;->a(FF)J

    move-result-wide v3

    const/high16 v2, 0x43870000    # 270.0f

    move-object v1, p0

    move-object v5, p2

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, Ls/o;->f(FJLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    move-result p1

    return p1
.end method

.method private final d(Lo0/f;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z
    .locals 7

    invoke-interface {p1}, Lo0/f;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/m;->i(J)F

    move-result v0

    invoke-static {v0}, Loh/b;->e(F)I

    move-result v0

    iget-object v1, p0, Ls/o;->d:Ls/P;

    invoke-virtual {v1}, Ls/P;->a()Lz/N;

    move-result-object v1

    invoke-interface {p1}, Lo0/f;->getLayoutDirection()LY0/t;

    move-result-object v2

    invoke-interface {v1, v2}, Lz/N;->b(LY0/t;)F

    move-result v1

    int-to-float v0, v0

    neg-float v0, v0

    invoke-interface {p1, v1}, LY0/d;->d1(F)F

    move-result p1

    add-float/2addr v0, p1

    const/4 p1, 0x0

    invoke-static {p1, v0}, Ll0/h;->a(FF)J

    move-result-wide v3

    const/high16 v2, 0x42b40000    # 90.0f

    move-object v1, p0

    move-object v5, p2

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, Ls/o;->f(FJLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    move-result p1

    return p1
.end method

.method private final e(Lo0/f;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z
    .locals 7

    iget-object v0, p0, Ls/o;->d:Ls/P;

    invoke-virtual {v0}, Ls/P;->a()Lz/N;

    move-result-object v0

    invoke-interface {v0}, Lz/N;->d()F

    move-result v0

    invoke-interface {p1, v0}, LY0/d;->d1(F)F

    move-result p1

    const/4 v0, 0x0

    invoke-static {v0, p1}, Ll0/h;->a(FF)J

    move-result-wide v3

    const/4 v2, 0x0

    move-object v1, p0

    move-object v5, p2

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, Ls/o;->f(FJLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    move-result p1

    return p1
.end method

.method private final f(FJLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z
    .locals 1

    invoke-virtual {p5}, Landroid/graphics/Canvas;->save()I

    move-result v0

    invoke-virtual {p5, p1}, Landroid/graphics/Canvas;->rotate(F)V

    invoke-static {p2, p3}, Ll0/g;->m(J)F

    move-result p1

    invoke-static {p2, p3}, Ll0/g;->n(J)F

    move-result p2

    invoke-virtual {p5, p1, p2}, Landroid/graphics/Canvas;->translate(FF)V

    invoke-virtual {p4, p5}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result p1

    invoke-virtual {p5, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return p1
.end method


# virtual methods
.method public J(Lo0/c;)V
    .locals 6

    iget-object v0, p0, Ls/o;->b:Ls/a;

    invoke-interface {p1}, Lo0/f;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ls/a;->r(J)V

    invoke-interface {p1}, Lo0/f;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/m;->k(J)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lo0/c;->X1()V

    return-void

    :cond_0
    invoke-interface {p1}, Lo0/c;->X1()V

    iget-object v0, p0, Ls/o;->b:Ls/a;

    invoke-virtual {v0}, Ls/a;->j()LT/q0;

    move-result-object v0

    invoke-interface {v0}, LT/q0;->getValue()Ljava/lang/Object;

    invoke-interface {p1}, Lo0/f;->k1()Lo0/d;

    move-result-object v0

    invoke-interface {v0}, Lo0/d;->d()Lm0/n0;

    move-result-object v0

    invoke-static {v0}, Lm0/H;->d(Lm0/n0;)Landroid/graphics/Canvas;

    move-result-object v0

    iget-object v1, p0, Ls/o;->c:Ls/w;

    invoke-virtual {v1}, Ls/w;->r()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Ls/w;->h()Landroid/widget/EdgeEffect;

    move-result-object v2

    invoke-direct {p0, p1, v2, v0}, Ls/o;->c(Lo0/f;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    move-result v2

    goto :goto_0

    :cond_1
    move v2, v3

    :goto_0
    invoke-virtual {v1}, Ls/w;->y()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_4

    invoke-virtual {v1}, Ls/w;->l()Landroid/widget/EdgeEffect;

    move-result-object v4

    invoke-direct {p0, p1, v4, v0}, Ls/o;->e(Lo0/f;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    move-result v4

    if-nez v4, :cond_3

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    move v2, v3

    goto :goto_2

    :cond_3
    :goto_1
    move v2, v5

    :cond_4
    :goto_2
    invoke-virtual {v1}, Ls/w;->u()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-virtual {v1}, Ls/w;->j()Landroid/widget/EdgeEffect;

    move-result-object v4

    invoke-direct {p0, p1, v4, v0}, Ls/o;->d(Lo0/f;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    move-result v4

    if-nez v4, :cond_6

    if-eqz v2, :cond_5

    goto :goto_3

    :cond_5
    move v2, v3

    goto :goto_4

    :cond_6
    :goto_3
    move v2, v5

    :cond_7
    :goto_4
    invoke-virtual {v1}, Ls/w;->o()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-virtual {v1}, Ls/w;->f()Landroid/widget/EdgeEffect;

    move-result-object v1

    invoke-direct {p0, p1, v1, v0}, Ls/o;->a(Lo0/f;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    move-result p1

    if-nez p1, :cond_8

    if-eqz v2, :cond_9

    :cond_8
    move v3, v5

    :cond_9
    move v2, v3

    :cond_a
    if-eqz v2, :cond_b

    iget-object p1, p0, Ls/o;->b:Ls/a;

    invoke-virtual {p1}, Ls/a;->k()V

    :cond_b
    return-void
.end method
