.class final Landroidx/compose/foundation/layout/t;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements LE0/B;


# instance fields
.field private n:F

.field private o:F


# direct methods
.method private constructor <init>(FF)V
    .locals 0

    .line 2
    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    .line 3
    iput p1, p0, Landroidx/compose/foundation/layout/t;->n:F

    .line 4
    iput p2, p0, Landroidx/compose/foundation/layout/t;->o:F

    return-void
.end method

.method public synthetic constructor <init>(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/layout/t;-><init>(FF)V

    return-void
.end method


# virtual methods
.method public A(LC0/o;LC0/n;I)I
    .locals 1

    invoke-interface {p2, p3}, LC0/n;->S(I)I

    move-result p2

    iget p3, p0, Landroidx/compose/foundation/layout/t;->n:F

    sget-object v0, LY0/h;->b:LY0/h$a;

    invoke-virtual {v0}, LY0/h$a;->c()F

    move-result v0

    invoke-static {p3, v0}, LY0/h;->n(FF)Z

    move-result p3

    if-nez p3, :cond_0

    iget p3, p0, Landroidx/compose/foundation/layout/t;->n:F

    invoke-interface {p1, p3}, LY0/d;->x1(F)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p2, p1}, Lsh/m;->d(II)I

    move-result p1

    return p1
.end method

.method public final D2(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/layout/t;->o:F

    return-void
.end method

.method public final E2(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/layout/t;->n:F

    return-void
.end method

.method public b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;
    .locals 7

    iget v0, p0, Landroidx/compose/foundation/layout/t;->n:F

    sget-object v1, LY0/h;->b:LY0/h$a;

    invoke-virtual {v1}, LY0/h$a;->c()F

    move-result v2

    invoke-static {v0, v2}, LY0/h;->n(FF)Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-static {p3, p4}, LY0/b;->n(J)I

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Landroidx/compose/foundation/layout/t;->n:F

    invoke-interface {p1, v0}, LY0/d;->x1(F)I

    move-result v0

    invoke-static {p3, p4}, LY0/b;->l(J)I

    move-result v3

    invoke-static {v0, v3}, Lsh/m;->g(II)I

    move-result v0

    invoke-static {v0, v2}, Lsh/m;->d(II)I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-static {p3, p4}, LY0/b;->n(J)I

    move-result v0

    :goto_0
    invoke-static {p3, p4}, LY0/b;->l(J)I

    move-result v3

    iget v4, p0, Landroidx/compose/foundation/layout/t;->o:F

    invoke-virtual {v1}, LY0/h$a;->c()F

    move-result v1

    invoke-static {v4, v1}, LY0/h;->n(FF)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {p3, p4}, LY0/b;->m(J)I

    move-result v1

    if-nez v1, :cond_1

    iget v1, p0, Landroidx/compose/foundation/layout/t;->o:F

    invoke-interface {p1, v1}, LY0/d;->x1(F)I

    move-result v1

    invoke-static {p3, p4}, LY0/b;->k(J)I

    move-result v4

    invoke-static {v1, v4}, Lsh/m;->g(II)I

    move-result v1

    invoke-static {v1, v2}, Lsh/m;->d(II)I

    move-result v1

    goto :goto_1

    :cond_1
    invoke-static {p3, p4}, LY0/b;->m(J)I

    move-result v1

    :goto_1
    invoke-static {p3, p4}, LY0/b;->k(J)I

    move-result p3

    invoke-static {v0, v3, v1, p3}, LY0/c;->a(IIII)J

    move-result-wide p3

    invoke-interface {p2, p3, p4}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v1

    invoke-virtual {p2}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v2

    new-instance v4, Landroidx/compose/foundation/layout/t$a;

    invoke-direct {v4, p2}, Landroidx/compose/foundation/layout/t$a;-><init>(Landroidx/compose/ui/layout/t;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object p1

    return-object p1
.end method

.method public p(LC0/o;LC0/n;I)I
    .locals 1

    invoke-interface {p2, p3}, LC0/n;->s0(I)I

    move-result p2

    iget p3, p0, Landroidx/compose/foundation/layout/t;->o:F

    sget-object v0, LY0/h;->b:LY0/h$a;

    invoke-virtual {v0}, LY0/h$a;->c()F

    move-result v0

    invoke-static {p3, v0}, LY0/h;->n(FF)Z

    move-result p3

    if-nez p3, :cond_0

    iget p3, p0, Landroidx/compose/foundation/layout/t;->o:F

    invoke-interface {p1, p3}, LY0/d;->x1(F)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p2, p1}, Lsh/m;->d(II)I

    move-result p1

    return p1
.end method

.method public r(LC0/o;LC0/n;I)I
    .locals 1

    invoke-interface {p2, p3}, LC0/n;->R(I)I

    move-result p2

    iget p3, p0, Landroidx/compose/foundation/layout/t;->n:F

    sget-object v0, LY0/h;->b:LY0/h$a;

    invoke-virtual {v0}, LY0/h$a;->c()F

    move-result v0

    invoke-static {p3, v0}, LY0/h;->n(FF)Z

    move-result p3

    if-nez p3, :cond_0

    iget p3, p0, Landroidx/compose/foundation/layout/t;->n:F

    invoke-interface {p1, p3}, LY0/d;->x1(F)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p2, p1}, Lsh/m;->d(II)I

    move-result p1

    return p1
.end method

.method public v(LC0/o;LC0/n;I)I
    .locals 1

    invoke-interface {p2, p3}, LC0/n;->s(I)I

    move-result p2

    iget p3, p0, Landroidx/compose/foundation/layout/t;->o:F

    sget-object v0, LY0/h;->b:LY0/h$a;

    invoke-virtual {v0}, LY0/h$a;->c()F

    move-result v0

    invoke-static {p3, v0}, LY0/h;->n(FF)Z

    move-result p3

    if-nez p3, :cond_0

    iget p3, p0, Landroidx/compose/foundation/layout/t;->o:F

    invoke-interface {p1, p3}, LY0/d;->x1(F)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p2, p1}, Lsh/m;->d(II)I

    move-result p1

    return p1
.end method
