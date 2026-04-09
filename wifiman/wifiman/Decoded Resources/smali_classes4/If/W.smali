.class public abstract LIf/W;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;LIf/U;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LIf/W;->c(Landroidx/compose/ui/e;LIf/U;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;LIf/U;LT/l;I)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "modifier"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "vm"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, 0x747d9a2d

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LT/l;->r(I)LT/l;

    move-result-object v4

    and-int/lit8 v5, v2, 0x6

    const/4 v6, 0x2

    if-nez v5, :cond_1

    invoke-interface {v4, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    move v5, v6

    :goto_0
    or-int/2addr v5, v2

    goto :goto_1

    :cond_1
    move v5, v2

    :goto_1
    and-int/lit8 v7, v2, 0x30

    const/16 v8, 0x20

    if-nez v7, :cond_3

    invoke-interface {v4, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    move v7, v8

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v5, v7

    :cond_3
    and-int/lit8 v7, v5, 0x13

    const/16 v9, 0x12

    if-ne v7, v9, :cond_5

    invoke-interface {v4}, LT/l;->v()Z

    move-result v7

    if-nez v7, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v4}, LT/l;->C()V

    goto :goto_4

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v7

    if-eqz v7, :cond_6

    const/4 v7, -0x1

    const-string v9, "com.ui.wifiman.ui.wmw.WmwStatusProductCompliance (WmwStatusProductCompliance.kt:23)"

    invoke-static {v3, v5, v7, v9}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    const/4 v3, 0x0

    const/4 v7, 0x1

    const/4 v9, 0x0

    invoke-static {v0, v3, v7, v9}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v10

    int-to-float v8, v8

    invoke-static {v8}, LY0/h;->j(F)F

    move-result v12

    const/16 v15, 0xd

    const/16 v16, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v10 .. v16}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v8

    sget-object v10, Lla/a;->a:Lla/a;

    sget v11, Lla/a;->b:I

    invoke-virtual {v10, v4, v11}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v10

    invoke-virtual {v10}, Lra/a;->a()Lra/b;

    move-result-object v10

    invoke-virtual {v10}, Lra/b;->a()Lra/b$a$a;

    move-result-object v10

    const/16 v11, 0x14

    int-to-float v11, v11

    invoke-static {v11}, LY0/h;->j(F)F

    move-result v11

    invoke-virtual {v10, v11}, Lra/b$a;->a(F)F

    move-result v10

    invoke-static {v8, v10, v3, v6, v9}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v11

    const/4 v3, 0x0

    invoke-static {v3, v4, v3, v7}, Landroidx/compose/foundation/m;->a(ILT/l;II)Landroidx/compose/foundation/o;

    move-result-object v12

    const/16 v16, 0xe

    const/16 v17, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v11 .. v17}, Landroidx/compose/foundation/m;->d(Landroidx/compose/ui/e;Landroidx/compose/foundation/o;ZLw/n;ZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v6

    and-int/lit8 v5, v5, 0x70

    invoke-static {v6, v1, v4, v5, v3}, LCe/j;->t(Landroidx/compose/ui/e;LCe/b;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    :goto_4
    invoke-interface {v4}, LT/l;->z()LT/X0;

    move-result-object v3

    if-eqz v3, :cond_8

    new-instance v4, LIf/V;

    invoke-direct {v4, v0, v1, v2}, LIf/V;-><init>(Landroidx/compose/ui/e;LIf/U;I)V

    invoke-interface {v3, v4}, LT/X0;->a(Lmh/p;)V

    :cond_8
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;LIf/U;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, LIf/W;->b(Landroidx/compose/ui/e;LIf/U;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
