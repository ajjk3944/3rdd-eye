.class abstract Landroidx/compose/foundation/layout/j;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements LE0/B;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    return-void
.end method


# virtual methods
.method public A(LC0/o;LC0/n;I)I
    .locals 0

    invoke-interface {p2, p3}, LC0/n;->S(I)I

    move-result p1

    return p1
.end method

.method public abstract D2(Landroidx/compose/ui/layout/m;LC0/B;J)J
.end method

.method public abstract E2()Z
.end method

.method public final b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;
    .locals 7

    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/layout/j;->D2(Landroidx/compose/ui/layout/m;LC0/B;J)J

    move-result-wide v0

    invoke-virtual {p0}, Landroidx/compose/foundation/layout/j;->E2()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {p3, p4, v0, v1}, LY0/c;->g(JJ)J

    move-result-wide v0

    :cond_0
    invoke-interface {p2, v0, v1}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v1

    invoke-virtual {p2}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v2

    new-instance v4, Landroidx/compose/foundation/layout/j$a;

    invoke-direct {v4, p2}, Landroidx/compose/foundation/layout/j$a;-><init>(Landroidx/compose/ui/layout/t;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object p1

    return-object p1
.end method

.method public p(LC0/o;LC0/n;I)I
    .locals 0

    invoke-interface {p2, p3}, LC0/n;->s0(I)I

    move-result p1

    return p1
.end method

.method public r(LC0/o;LC0/n;I)I
    .locals 0

    invoke-interface {p2, p3}, LC0/n;->R(I)I

    move-result p1

    return p1
.end method

.method public v(LC0/o;LC0/n;I)I
    .locals 0

    invoke-interface {p2, p3}, LC0/n;->s(I)I

    move-result p1

    return p1
.end method
