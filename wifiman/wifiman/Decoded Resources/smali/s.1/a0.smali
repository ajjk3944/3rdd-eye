.class public final Ls/a0;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements LE0/B;


# instance fields
.field private n:Landroidx/compose/foundation/o;

.field private o:Z

.field private p:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/foundation/o;ZZ)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    iput-object p1, p0, Ls/a0;->n:Landroidx/compose/foundation/o;

    iput-boolean p2, p0, Ls/a0;->o:Z

    iput-boolean p3, p0, Ls/a0;->p:Z

    return-void
.end method


# virtual methods
.method public A(LC0/o;LC0/n;I)I
    .locals 0

    iget-boolean p1, p0, Ls/a0;->p:Z

    if-eqz p1, :cond_0

    const p1, 0x7fffffff

    invoke-interface {p2, p1}, LC0/n;->S(I)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-interface {p2, p3}, LC0/n;->S(I)I

    move-result p1

    :goto_0
    return p1
.end method

.method public final D2()Landroidx/compose/foundation/o;
    .locals 1

    iget-object v0, p0, Ls/a0;->n:Landroidx/compose/foundation/o;

    return-object v0
.end method

.method public final E2()Z
    .locals 1

    iget-boolean v0, p0, Ls/a0;->o:Z

    return v0
.end method

.method public final F2()Z
    .locals 1

    iget-boolean v0, p0, Ls/a0;->p:Z

    return v0
.end method

.method public final G2(Z)V
    .locals 0

    iput-boolean p1, p0, Ls/a0;->o:Z

    return-void
.end method

.method public final H2(Landroidx/compose/foundation/o;)V
    .locals 0

    iput-object p1, p0, Ls/a0;->n:Landroidx/compose/foundation/o;

    return-void
.end method

.method public final I2(Z)V
    .locals 0

    iput-boolean p1, p0, Ls/a0;->p:Z

    return-void
.end method

.method public b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;
    .locals 10

    iget-boolean v0, p0, Ls/a0;->p:Z

    if-eqz v0, :cond_0

    sget-object v0, Lw/q;->Vertical:Lw/q;

    goto :goto_0

    :cond_0
    sget-object v0, Lw/q;->Horizontal:Lw/q;

    :goto_0
    invoke-static {p3, p4, v0}, Ls/j;->a(JLw/q;)V

    iget-boolean v0, p0, Ls/a0;->p:Z

    const v1, 0x7fffffff

    if-eqz v0, :cond_1

    move v7, v1

    goto :goto_1

    :cond_1
    invoke-static {p3, p4}, LY0/b;->k(J)I

    move-result v0

    move v7, v0

    :goto_1
    iget-boolean v0, p0, Ls/a0;->p:Z

    if-eqz v0, :cond_2

    invoke-static {p3, p4}, LY0/b;->l(J)I

    move-result v1

    :cond_2
    move v5, v1

    const/4 v8, 0x5

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-wide v2, p3

    invoke-static/range {v2 .. v9}, LY0/b;->d(JIIIIILjava/lang/Object;)J

    move-result-wide v0

    invoke-interface {p2, v0, v1}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v0

    invoke-static {p3, p4}, LY0/b;->l(J)I

    move-result v1

    invoke-static {v0, v1}, Lsh/m;->g(II)I

    move-result v3

    invoke-virtual {p2}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v0

    invoke-static {p3, p4}, LY0/b;->k(J)I

    move-result p3

    invoke-static {v0, p3}, Lsh/m;->g(II)I

    move-result v4

    invoke-virtual {p2}, Landroidx/compose/ui/layout/t;->C0()I

    move-result p3

    sub-int/2addr p3, v4

    invoke-virtual {p2}, Landroidx/compose/ui/layout/t;->I0()I

    move-result p4

    sub-int/2addr p4, v3

    iget-boolean v0, p0, Ls/a0;->p:Z

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    move p3, p4

    :goto_2
    iget-object p4, p0, Ls/a0;->n:Landroidx/compose/foundation/o;

    invoke-virtual {p4, p3}, Landroidx/compose/foundation/o;->n(I)V

    iget-object p4, p0, Ls/a0;->n:Landroidx/compose/foundation/o;

    iget-boolean v0, p0, Ls/a0;->p:Z

    if-eqz v0, :cond_4

    move v0, v4

    goto :goto_3

    :cond_4
    move v0, v3

    :goto_3
    invoke-virtual {p4, v0}, Landroidx/compose/foundation/o;->p(I)V

    new-instance v6, Ls/a0$a;

    invoke-direct {v6, p0, p3, p2}, Ls/a0$a;-><init>(Ls/a0;ILandroidx/compose/ui/layout/t;)V

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v8}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object p1

    return-object p1
.end method

.method public p(LC0/o;LC0/n;I)I
    .locals 0

    iget-boolean p1, p0, Ls/a0;->p:Z

    if-eqz p1, :cond_0

    invoke-interface {p2, p3}, LC0/n;->s0(I)I

    move-result p1

    goto :goto_0

    :cond_0
    const p1, 0x7fffffff

    invoke-interface {p2, p1}, LC0/n;->s0(I)I

    move-result p1

    :goto_0
    return p1
.end method

.method public r(LC0/o;LC0/n;I)I
    .locals 0

    iget-boolean p1, p0, Ls/a0;->p:Z

    if-eqz p1, :cond_0

    const p1, 0x7fffffff

    invoke-interface {p2, p1}, LC0/n;->R(I)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-interface {p2, p3}, LC0/n;->R(I)I

    move-result p1

    :goto_0
    return p1
.end method

.method public v(LC0/o;LC0/n;I)I
    .locals 0

    iget-boolean p1, p0, Ls/a0;->p:Z

    if-eqz p1, :cond_0

    invoke-interface {p2, p3}, LC0/n;->s(I)I

    move-result p1

    goto :goto_0

    :cond_0
    const p1, 0x7fffffff

    invoke-interface {p2, p1}, LC0/n;->s(I)I

    move-result p1

    :goto_0
    return p1
.end method
