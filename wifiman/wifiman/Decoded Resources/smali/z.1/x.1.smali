.class public interface abstract Lz/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz/T;


# virtual methods
.method public a(I[I[ILandroidx/compose/ui/layout/m;)V
    .locals 7

    invoke-interface {p0}, Lz/x;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Lz/x;->o()Lz/c$e;

    move-result-object v1

    invoke-interface {p4}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v5

    move-object v2, p4

    move v3, p1

    move-object v4, p2

    move-object v6, p3

    invoke-interface/range {v1 .. v6}, Lz/c$e;->c(LY0/d;I[ILY0/t;[I)V

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Lz/x;->p()Lz/c$m;

    move-result-object v0

    invoke-interface {v0, p4, p1, p2, p3}, Lz/c$m;->b(LY0/d;I[I[I)V

    :goto_0
    return-void
.end method

.method public d([Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/m;I[III[IIII)LC0/D;
    .locals 14

    invoke-interface {p0}, Lz/x;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    move/from16 v0, p5

    move/from16 v1, p6

    goto :goto_0

    :cond_0
    move/from16 v1, p5

    move/from16 v0, p6

    :goto_0
    new-instance v13, Lz/x$a;

    move-object v2, v13

    move-object/from16 v3, p7

    move/from16 v4, p8

    move/from16 v5, p9

    move/from16 v6, p10

    move-object v7, p1

    move-object v8, p0

    move/from16 v9, p6

    move-object/from16 v10, p2

    move/from16 v11, p3

    move-object/from16 v12, p4

    invoke-direct/range {v2 .. v12}, Lz/x$a;-><init>([IIII[Landroidx/compose/ui/layout/t;Lz/x;ILandroidx/compose/ui/layout/m;I[I)V

    const/4 v2, 0x4

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 p1, p2

    move/from16 p2, v0

    move/from16 p3, v1

    move-object/from16 p4, v4

    move-object/from16 p5, v13

    move/from16 p6, v2

    move-object/from16 p7, v3

    invoke-static/range {p1 .. p7}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object v0

    return-object v0
.end method

.method public g(IIIIZ)J
    .locals 1

    invoke-interface {p0}, Lz/x;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p5, p1, p2, p3, p4}, Lz/W;->a(ZIIII)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    invoke-static {p5, p1, p2, p3, p4}, Lz/h;->b(ZIIII)J

    move-result-wide p1

    :goto_0
    return-wide p1
.end method

.method public h(Landroidx/compose/ui/layout/t;)I
    .locals 1

    invoke-interface {p0}, Lz/x;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroidx/compose/ui/layout/t;->G0()I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroidx/compose/ui/layout/t;->D0()I

    move-result p1

    :goto_0
    return p1
.end method

.method public abstract j()Z
.end method

.method public k(Landroidx/compose/ui/layout/t;)I
    .locals 1

    invoke-interface {p0}, Lz/x;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroidx/compose/ui/layout/t;->D0()I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroidx/compose/ui/layout/t;->G0()I

    move-result p1

    :goto_0
    return p1
.end method

.method public abstract l()Lz/m;
.end method

.method public m(Landroidx/compose/ui/layout/t;Lz/V;ILY0/t;I)I
    .locals 1

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lz/V;->a()Lz/m;

    move-result-object p2

    if-nez p2, :cond_1

    :cond_0
    invoke-interface {p0}, Lz/x;->l()Lz/m;

    move-result-object p2

    :cond_1
    invoke-interface {p0, p1}, Lz/x;->k(Landroidx/compose/ui/layout/t;)I

    move-result v0

    sub-int/2addr p3, v0

    invoke-interface {p0}, Lz/x;->j()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p4, LY0/t;->Ltr:LY0/t;

    :cond_2
    invoke-virtual {p2, p3, p4, p1, p5}, Lz/m;->a(ILY0/t;Landroidx/compose/ui/layout/t;I)I

    move-result p1

    return p1
.end method

.method public abstract o()Lz/c$e;
.end method

.method public abstract p()Lz/c$m;
.end method
