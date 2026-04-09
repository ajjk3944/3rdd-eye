.class final Landroidx/compose/foundation/layout/u;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements LE0/B;


# instance fields
.field private n:Lz/n;

.field private o:Z

.field private p:Lmh/p;


# direct methods
.method public constructor <init>(Lz/n;ZLmh/p;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/layout/u;->n:Lz/n;

    iput-boolean p2, p0, Landroidx/compose/foundation/layout/u;->o:Z

    iput-object p3, p0, Landroidx/compose/foundation/layout/u;->p:Lmh/p;

    return-void
.end method


# virtual methods
.method public final D2()Lmh/p;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/layout/u;->p:Lmh/p;

    return-object v0
.end method

.method public final E2(Lmh/p;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/layout/u;->p:Lmh/p;

    return-void
.end method

.method public final F2(Lz/n;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/layout/u;->n:Lz/n;

    return-void
.end method

.method public final G2(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/layout/u;->o:Z

    return-void
.end method

.method public b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;
    .locals 14

    move-object v6, p0

    iget-object v0, v6, Landroidx/compose/foundation/layout/u;->n:Lz/n;

    sget-object v1, Lz/n;->Vertical:Lz/n;

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    invoke-static/range {p3 .. p4}, LY0/b;->n(J)I

    move-result v0

    :goto_0
    iget-object v3, v6, Landroidx/compose/foundation/layout/u;->n:Lz/n;

    sget-object v4, Lz/n;->Horizontal:Lz/n;

    if-eq v3, v4, :cond_1

    goto :goto_1

    :cond_1
    invoke-static/range {p3 .. p4}, LY0/b;->m(J)I

    move-result v2

    :goto_1
    iget-object v3, v6, Landroidx/compose/foundation/layout/u;->n:Lz/n;

    const v5, 0x7fffffff

    if-eq v3, v1, :cond_2

    iget-boolean v1, v6, Landroidx/compose/foundation/layout/u;->o:Z

    if-eqz v1, :cond_2

    move v1, v5

    goto :goto_2

    :cond_2
    invoke-static/range {p3 .. p4}, LY0/b;->l(J)I

    move-result v1

    :goto_2
    iget-object v3, v6, Landroidx/compose/foundation/layout/u;->n:Lz/n;

    if-eq v3, v4, :cond_3

    iget-boolean v3, v6, Landroidx/compose/foundation/layout/u;->o:Z

    if-eqz v3, :cond_3

    goto :goto_3

    :cond_3
    invoke-static/range {p3 .. p4}, LY0/b;->k(J)I

    move-result v5

    :goto_3
    invoke-static {v0, v1, v2, v5}, LY0/c;->a(IIII)J

    move-result-wide v0

    move-object/from16 v2, p2

    invoke-interface {v2, v0, v1}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v0

    invoke-static/range {p3 .. p4}, LY0/b;->n(J)I

    move-result v1

    invoke-static/range {p3 .. p4}, LY0/b;->l(J)I

    move-result v2

    invoke-static {v0, v1, v2}, Lsh/m;->k(III)I

    move-result v8

    invoke-virtual {v3}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v0

    invoke-static/range {p3 .. p4}, LY0/b;->m(J)I

    move-result v1

    invoke-static/range {p3 .. p4}, LY0/b;->k(J)I

    move-result v2

    invoke-static {v0, v1, v2}, Lsh/m;->k(III)I

    move-result v9

    new-instance v11, Landroidx/compose/foundation/layout/u$a;

    move-object v0, v11

    move-object v1, p0

    move v2, v8

    move v4, v9

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/layout/u$a;-><init>(Landroidx/compose/foundation/layout/u;ILandroidx/compose/ui/layout/t;ILandroidx/compose/ui/layout/m;)V

    const/4 v12, 0x4

    const/4 v13, 0x0

    const/4 v10, 0x0

    move-object v7, p1

    invoke-static/range {v7 .. v13}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object v0

    return-object v0
.end method
