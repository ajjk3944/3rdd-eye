.class final Landroidx/compose/foundation/layout/s;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements LE0/B;


# instance fields
.field private n:F

.field private o:F

.field private p:F

.field private q:F

.field private r:Z


# direct methods
.method private constructor <init>(FFFFZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    .line 3
    iput p1, p0, Landroidx/compose/foundation/layout/s;->n:F

    .line 4
    iput p2, p0, Landroidx/compose/foundation/layout/s;->o:F

    .line 5
    iput p3, p0, Landroidx/compose/foundation/layout/s;->p:F

    .line 6
    iput p4, p0, Landroidx/compose/foundation/layout/s;->q:F

    .line 7
    iput-boolean p5, p0, Landroidx/compose/foundation/layout/s;->r:Z

    return-void
.end method

.method public synthetic constructor <init>(FFFFZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Landroidx/compose/foundation/layout/s;-><init>(FFFFZ)V

    return-void
.end method

.method private final D2(LY0/d;)J
    .locals 7

    iget v0, p0, Landroidx/compose/foundation/layout/s;->p:F

    sget-object v1, LY0/h;->b:LY0/h$a;

    invoke-virtual {v1}, LY0/h$a;->c()F

    move-result v2

    invoke-static {v0, v2}, LY0/h;->n(FF)Z

    move-result v0

    const v2, 0x7fffffff

    const/4 v3, 0x0

    if-nez v0, :cond_0

    iget v0, p0, Landroidx/compose/foundation/layout/s;->p:F

    invoke-interface {p1, v0}, LY0/d;->x1(F)I

    move-result v0

    invoke-static {v0, v3}, Lsh/m;->d(II)I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iget v4, p0, Landroidx/compose/foundation/layout/s;->q:F

    invoke-virtual {v1}, LY0/h$a;->c()F

    move-result v5

    invoke-static {v4, v5}, LY0/h;->n(FF)Z

    move-result v4

    if-nez v4, :cond_1

    iget v4, p0, Landroidx/compose/foundation/layout/s;->q:F

    invoke-interface {p1, v4}, LY0/d;->x1(F)I

    move-result v4

    invoke-static {v4, v3}, Lsh/m;->d(II)I

    move-result v4

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    iget v5, p0, Landroidx/compose/foundation/layout/s;->n:F

    invoke-virtual {v1}, LY0/h$a;->c()F

    move-result v6

    invoke-static {v5, v6}, LY0/h;->n(FF)Z

    move-result v5

    if-nez v5, :cond_2

    iget v5, p0, Landroidx/compose/foundation/layout/s;->n:F

    invoke-interface {p1, v5}, LY0/d;->x1(F)I

    move-result v5

    invoke-static {v5, v0}, Lsh/m;->g(II)I

    move-result v5

    invoke-static {v5, v3}, Lsh/m;->d(II)I

    move-result v5

    if-eq v5, v2, :cond_2

    goto :goto_2

    :cond_2
    move v5, v3

    :goto_2
    iget v6, p0, Landroidx/compose/foundation/layout/s;->o:F

    invoke-virtual {v1}, LY0/h$a;->c()F

    move-result v1

    invoke-static {v6, v1}, LY0/h;->n(FF)Z

    move-result v1

    if-nez v1, :cond_3

    iget v1, p0, Landroidx/compose/foundation/layout/s;->o:F

    invoke-interface {p1, v1}, LY0/d;->x1(F)I

    move-result p1

    invoke-static {p1, v4}, Lsh/m;->g(II)I

    move-result p1

    invoke-static {p1, v3}, Lsh/m;->d(II)I

    move-result p1

    if-eq p1, v2, :cond_3

    move v3, p1

    :cond_3
    invoke-static {v5, v0, v3, v4}, LY0/c;->a(IIII)J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public A(LC0/o;LC0/n;I)I
    .locals 2

    invoke-direct {p0, p1}, Landroidx/compose/foundation/layout/s;->D2(LY0/d;)J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/b;->j(J)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {v0, v1}, LY0/b;->l(J)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-interface {p2, p3}, LC0/n;->S(I)I

    move-result p1

    invoke-static {v0, v1, p1}, LY0/c;->i(JI)I

    move-result p1

    :goto_0
    return p1
.end method

.method public final E2(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/layout/s;->r:Z

    return-void
.end method

.method public final F2(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/layout/s;->q:F

    return-void
.end method

.method public final G2(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/layout/s;->p:F

    return-void
.end method

.method public final H2(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/layout/s;->o:F

    return-void
.end method

.method public final I2(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/layout/s;->n:F

    return-void
.end method

.method public b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;
    .locals 7

    invoke-direct {p0, p1}, Landroidx/compose/foundation/layout/s;->D2(LY0/d;)J

    move-result-wide v0

    iget-boolean v2, p0, Landroidx/compose/foundation/layout/s;->r:Z

    if-eqz v2, :cond_0

    invoke-static {p3, p4, v0, v1}, LY0/c;->g(JJ)J

    move-result-wide p3

    goto/16 :goto_4

    :cond_0
    iget v2, p0, Landroidx/compose/foundation/layout/s;->n:F

    sget-object v3, LY0/h;->b:LY0/h$a;

    invoke-virtual {v3}, LY0/h$a;->c()F

    move-result v4

    invoke-static {v2, v4}, LY0/h;->n(FF)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {v0, v1}, LY0/b;->n(J)I

    move-result v2

    goto :goto_0

    :cond_1
    invoke-static {p3, p4}, LY0/b;->n(J)I

    move-result v2

    invoke-static {v0, v1}, LY0/b;->l(J)I

    move-result v4

    invoke-static {v2, v4}, Lsh/m;->g(II)I

    move-result v2

    :goto_0
    iget v4, p0, Landroidx/compose/foundation/layout/s;->p:F

    invoke-virtual {v3}, LY0/h$a;->c()F

    move-result v5

    invoke-static {v4, v5}, LY0/h;->n(FF)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-static {v0, v1}, LY0/b;->l(J)I

    move-result v4

    goto :goto_1

    :cond_2
    invoke-static {p3, p4}, LY0/b;->l(J)I

    move-result v4

    invoke-static {v0, v1}, LY0/b;->n(J)I

    move-result v5

    invoke-static {v4, v5}, Lsh/m;->d(II)I

    move-result v4

    :goto_1
    iget v5, p0, Landroidx/compose/foundation/layout/s;->o:F

    invoke-virtual {v3}, LY0/h$a;->c()F

    move-result v6

    invoke-static {v5, v6}, LY0/h;->n(FF)Z

    move-result v5

    if-nez v5, :cond_3

    invoke-static {v0, v1}, LY0/b;->m(J)I

    move-result v5

    goto :goto_2

    :cond_3
    invoke-static {p3, p4}, LY0/b;->m(J)I

    move-result v5

    invoke-static {v0, v1}, LY0/b;->k(J)I

    move-result v6

    invoke-static {v5, v6}, Lsh/m;->g(II)I

    move-result v5

    :goto_2
    iget v6, p0, Landroidx/compose/foundation/layout/s;->q:F

    invoke-virtual {v3}, LY0/h$a;->c()F

    move-result v3

    invoke-static {v6, v3}, LY0/h;->n(FF)Z

    move-result v3

    if-nez v3, :cond_4

    invoke-static {v0, v1}, LY0/b;->k(J)I

    move-result p3

    goto :goto_3

    :cond_4
    invoke-static {p3, p4}, LY0/b;->k(J)I

    move-result p3

    invoke-static {v0, v1}, LY0/b;->m(J)I

    move-result p4

    invoke-static {p3, p4}, Lsh/m;->d(II)I

    move-result p3

    :goto_3
    invoke-static {v2, v4, v5, p3}, LY0/c;->a(IIII)J

    move-result-wide p3

    :goto_4
    invoke-interface {p2, p3, p4}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v1

    invoke-virtual {p2}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v2

    new-instance v4, Landroidx/compose/foundation/layout/s$a;

    invoke-direct {v4, p2}, Landroidx/compose/foundation/layout/s$a;-><init>(Landroidx/compose/ui/layout/t;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object p1

    return-object p1
.end method

.method public p(LC0/o;LC0/n;I)I
    .locals 2

    invoke-direct {p0, p1}, Landroidx/compose/foundation/layout/s;->D2(LY0/d;)J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/b;->i(J)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {v0, v1}, LY0/b;->k(J)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-interface {p2, p3}, LC0/n;->s0(I)I

    move-result p1

    invoke-static {v0, v1, p1}, LY0/c;->h(JI)I

    move-result p1

    :goto_0
    return p1
.end method

.method public r(LC0/o;LC0/n;I)I
    .locals 2

    invoke-direct {p0, p1}, Landroidx/compose/foundation/layout/s;->D2(LY0/d;)J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/b;->j(J)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {v0, v1}, LY0/b;->l(J)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-interface {p2, p3}, LC0/n;->R(I)I

    move-result p1

    invoke-static {v0, v1, p1}, LY0/c;->i(JI)I

    move-result p1

    :goto_0
    return p1
.end method

.method public v(LC0/o;LC0/n;I)I
    .locals 2

    invoke-direct {p0, p1}, Landroidx/compose/foundation/layout/s;->D2(LY0/d;)J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/b;->i(J)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {v0, v1}, LY0/b;->k(J)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-interface {p2, p3}, LC0/n;->s(I)I

    move-result p1

    invoke-static {v0, v1, p1}, LY0/c;->h(JI)I

    move-result p1

    :goto_0
    return p1
.end method
