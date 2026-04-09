.class final Landroidx/compose/foundation/layout/g;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements LE0/B;


# instance fields
.field private n:Lz/n;

.field private o:F


# direct methods
.method public constructor <init>(Lz/n;F)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/layout/g;->n:Lz/n;

    iput p2, p0, Landroidx/compose/foundation/layout/g;->o:F

    return-void
.end method


# virtual methods
.method public final D2(Lz/n;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/layout/g;->n:Lz/n;

    return-void
.end method

.method public final E2(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/layout/g;->o:F

    return-void
.end method

.method public b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;
    .locals 7

    invoke-static {p3, p4}, LY0/b;->h(J)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/foundation/layout/g;->n:Lz/n;

    sget-object v1, Lz/n;->Vertical:Lz/n;

    if-eq v0, v1, :cond_0

    invoke-static {p3, p4}, LY0/b;->l(J)I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Landroidx/compose/foundation/layout/g;->o:F

    mul-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-static {p3, p4}, LY0/b;->n(J)I

    move-result v1

    invoke-static {p3, p4}, LY0/b;->l(J)I

    move-result v2

    invoke-static {v0, v1, v2}, Lsh/m;->k(III)I

    move-result v0

    move v1, v0

    goto :goto_0

    :cond_0
    invoke-static {p3, p4}, LY0/b;->n(J)I

    move-result v0

    invoke-static {p3, p4}, LY0/b;->l(J)I

    move-result v1

    :goto_0
    invoke-static {p3, p4}, LY0/b;->g(J)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Landroidx/compose/foundation/layout/g;->n:Lz/n;

    sget-object v3, Lz/n;->Horizontal:Lz/n;

    if-eq v2, v3, :cond_1

    invoke-static {p3, p4}, LY0/b;->k(J)I

    move-result v2

    int-to-float v2, v2

    iget v3, p0, Landroidx/compose/foundation/layout/g;->o:F

    mul-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-static {p3, p4}, LY0/b;->m(J)I

    move-result v3

    invoke-static {p3, p4}, LY0/b;->k(J)I

    move-result p3

    invoke-static {v2, v3, p3}, Lsh/m;->k(III)I

    move-result p3

    move p4, p3

    goto :goto_1

    :cond_1
    invoke-static {p3, p4}, LY0/b;->m(J)I

    move-result v2

    invoke-static {p3, p4}, LY0/b;->k(J)I

    move-result p3

    move p4, p3

    move p3, v2

    :goto_1
    invoke-static {v0, v1, p3, p4}, LY0/c;->a(IIII)J

    move-result-wide p3

    invoke-interface {p2, p3, p4}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v1

    invoke-virtual {p2}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v2

    new-instance v4, Landroidx/compose/foundation/layout/g$a;

    invoke-direct {v4, p2}, Landroidx/compose/foundation/layout/g$a;-><init>(Landroidx/compose/ui/layout/t;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object p1

    return-object p1
.end method
