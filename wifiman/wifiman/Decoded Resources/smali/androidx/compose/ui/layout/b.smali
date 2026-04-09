.class public interface abstract Landroidx/compose/ui/layout/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE0/B;


# virtual methods
.method public O(LC0/c;LC0/n;I)I
    .locals 2

    sget-object v0, LE0/g0;->a:LE0/g0;

    new-instance v1, Landroidx/compose/ui/layout/b$b;

    invoke-direct {v1, p0}, Landroidx/compose/ui/layout/b$b;-><init>(Landroidx/compose/ui/layout/b;)V

    invoke-virtual {v0, v1, p1, p2, p3}, LE0/g0;->c(LE0/g0$a;LC0/c;LC0/n;I)I

    move-result p1

    return p1
.end method

.method public abstract Q0(LC0/d;LC0/B;J)LC0/D;
.end method

.method public abstract S(J)Z
.end method

.method public V(LC0/c;LC0/n;I)I
    .locals 2

    sget-object v0, LE0/g0;->a:LE0/g0;

    new-instance v1, Landroidx/compose/ui/layout/b$d;

    invoke-direct {v1, p0}, Landroidx/compose/ui/layout/b$d;-><init>(Landroidx/compose/ui/layout/b;)V

    invoke-virtual {v0, v1, p1, p2, p3}, LE0/g0;->e(LE0/g0$a;LC0/c;LC0/n;I)I

    move-result p1

    return p1
.end method

.method public W0(LC0/c;LC0/n;I)I
    .locals 2

    sget-object v0, LE0/g0;->a:LE0/g0;

    new-instance v1, Landroidx/compose/ui/layout/b$a;

    invoke-direct {v1, p0}, Landroidx/compose/ui/layout/b$a;-><init>(Landroidx/compose/ui/layout/b;)V

    invoke-virtual {v0, v1, p1, p2, p3}, LE0/g0;->a(LE0/g0$a;LC0/c;LC0/n;I)I

    move-result p1

    return p1
.end method

.method public W1(LC0/c;LC0/n;I)I
    .locals 2

    sget-object v0, LE0/g0;->a:LE0/g0;

    new-instance v1, Landroidx/compose/ui/layout/b$e;

    invoke-direct {v1, p0}, Landroidx/compose/ui/layout/b$e;-><init>(Landroidx/compose/ui/layout/b;)V

    invoke-virtual {v0, v1, p1, p2, p3}, LE0/g0;->g(LE0/g0$a;LC0/c;LC0/n;I)I

    move-result p1

    return p1
.end method

.method public b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;
    .locals 7

    invoke-interface {p2, p3, p4}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v1

    invoke-virtual {p2}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v2

    new-instance v4, Landroidx/compose/ui/layout/b$c;

    invoke-direct {v4, p2}, Landroidx/compose/ui/layout/b$c;-><init>(Landroidx/compose/ui/layout/t;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object p1

    return-object p1
.end method

.method public abstract k0(Landroidx/compose/ui/layout/t$a;LC0/r;)Z
.end method
