.class final Landroidx/compose/foundation/layout/q;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements LE0/B;


# instance fields
.field private n:Lz/N;


# direct methods
.method public constructor <init>(Lz/N;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/layout/q;->n:Lz/N;

    return-void
.end method


# virtual methods
.method public final D2()Lz/N;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/layout/q;->n:Lz/N;

    return-object v0
.end method

.method public final E2(Lz/N;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/layout/q;->n:Lz/N;

    return-void
.end method

.method public b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;
    .locals 10

    iget-object v0, p0, Landroidx/compose/foundation/layout/q;->n:Lz/N;

    invoke-interface {p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v1

    invoke-interface {v0, v1}, Lz/N;->a(LY0/t;)F

    move-result v0

    const/4 v1, 0x0

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v2

    invoke-static {v0, v2}, LY0/h;->h(FF)I

    move-result v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/foundation/layout/q;->n:Lz/N;

    invoke-interface {v0}, Lz/N;->d()F

    move-result v0

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v2

    invoke-static {v0, v2}, LY0/h;->h(FF)I

    move-result v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/foundation/layout/q;->n:Lz/N;

    invoke-interface {p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v2

    invoke-interface {v0, v2}, Lz/N;->b(LY0/t;)F

    move-result v0

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v2

    invoke-static {v0, v2}, LY0/h;->h(FF)I

    move-result v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/foundation/layout/q;->n:Lz/N;

    invoke-interface {v0}, Lz/N;->c()F

    move-result v0

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v0, v1}, LY0/h;->h(FF)I

    move-result v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/foundation/layout/q;->n:Lz/N;

    invoke-interface {p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v1

    invoke-interface {v0, v1}, Lz/N;->a(LY0/t;)F

    move-result v0

    invoke-interface {p1, v0}, LY0/d;->x1(F)I

    move-result v0

    iget-object v1, p0, Landroidx/compose/foundation/layout/q;->n:Lz/N;

    invoke-interface {p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v2

    invoke-interface {v1, v2}, Lz/N;->b(LY0/t;)F

    move-result v1

    invoke-interface {p1, v1}, LY0/d;->x1(F)I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Landroidx/compose/foundation/layout/q;->n:Lz/N;

    invoke-interface {v1}, Lz/N;->d()F

    move-result v1

    invoke-interface {p1, v1}, LY0/d;->x1(F)I

    move-result v1

    iget-object v2, p0, Landroidx/compose/foundation/layout/q;->n:Lz/N;

    invoke-interface {v2}, Lz/N;->c()F

    move-result v2

    invoke-interface {p1, v2}, LY0/d;->x1(F)I

    move-result v2

    add-int/2addr v1, v2

    neg-int v2, v0

    neg-int v3, v1

    invoke-static {p3, p4, v2, v3}, LY0/c;->n(JII)J

    move-result-wide v2

    invoke-interface {p2, v2, v3}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v2

    add-int/2addr v2, v0

    invoke-static {p3, p4, v2}, LY0/c;->i(JI)I

    move-result v4

    invoke-virtual {p2}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v0

    add-int/2addr v0, v1

    invoke-static {p3, p4, v0}, LY0/c;->h(JI)I

    move-result v5

    new-instance v7, Landroidx/compose/foundation/layout/q$a;

    invoke-direct {v7, p2, p1, p0}, Landroidx/compose/foundation/layout/q$a;-><init>(Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/m;Landroidx/compose/foundation/layout/q;)V

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v6, 0x0

    move-object v3, p1

    invoke-static/range {v3 .. v9}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Padding must be non-negative"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
