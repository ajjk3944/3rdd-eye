.class final Landroidx/compose/material/b;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements LE0/B;


# instance fields
.field private n:LN/b;

.field private o:Lmh/p;

.field private p:Lw/q;

.field private q:Z


# direct methods
.method public constructor <init>(LN/b;Lmh/p;Lw/q;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    iput-object p1, p0, Landroidx/compose/material/b;->n:LN/b;

    iput-object p2, p0, Landroidx/compose/material/b;->o:Lmh/p;

    iput-object p3, p0, Landroidx/compose/material/b;->p:Lw/q;

    return-void
.end method


# virtual methods
.method public final D2()Lw/q;
    .locals 1

    iget-object v0, p0, Landroidx/compose/material/b;->p:Lw/q;

    return-object v0
.end method

.method public final E2()LN/b;
    .locals 1

    iget-object v0, p0, Landroidx/compose/material/b;->n:LN/b;

    return-object v0
.end method

.method public final F2(Lmh/p;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/material/b;->o:Lmh/p;

    return-void
.end method

.method public final G2(Lw/q;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/material/b;->p:Lw/q;

    return-void
.end method

.method public final H2(LN/b;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/material/b;->n:LN/b;

    return-void
.end method

.method public b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;
    .locals 7

    invoke-interface {p2, p3, p4}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object p2

    invoke-interface {p1}, LC0/o;->a1()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroidx/compose/material/b;->q:Z

    if-nez v0, :cond_1

    :cond_0
    invoke-virtual {p2}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v0

    invoke-virtual {p2}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v1

    invoke-static {v0, v1}, LY0/s;->a(II)J

    move-result-wide v0

    iget-object v2, p0, Landroidx/compose/material/b;->o:Lmh/p;

    invoke-static {v0, v1}, LY0/r;->b(J)LY0/r;

    move-result-object v0

    invoke-static {p3, p4}, LY0/b;->a(J)LY0/b;

    move-result-object p3

    invoke-interface {v2, v0, p3}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LYg/s;

    iget-object p4, p0, Landroidx/compose/material/b;->n:LN/b;

    invoke-virtual {p3}, LYg/s;->h()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LN/D;

    invoke-virtual {p3}, LYg/s;->j()Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p4, v0, p3}, LN/b;->I(LN/D;Ljava/lang/Object;)V

    :cond_1
    invoke-interface {p1}, LC0/o;->a1()Z

    move-result p3

    if-nez p3, :cond_3

    iget-boolean p3, p0, Landroidx/compose/material/b;->q:Z

    if-eqz p3, :cond_2

    goto :goto_0

    :cond_2
    const/4 p3, 0x0

    goto :goto_1

    :cond_3
    :goto_0
    const/4 p3, 0x1

    :goto_1
    iput-boolean p3, p0, Landroidx/compose/material/b;->q:Z

    invoke-virtual {p2}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v1

    invoke-virtual {p2}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v2

    new-instance v4, Landroidx/compose/material/b$a;

    invoke-direct {v4, p1, p0, p2}, Landroidx/compose/material/b$a;-><init>(Landroidx/compose/ui/layout/m;Landroidx/compose/material/b;Landroidx/compose/ui/layout/t;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object p1

    return-object p1
.end method

.method public o2()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/compose/material/b;->q:Z

    return-void
.end method
