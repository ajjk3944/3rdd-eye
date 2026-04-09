.class public abstract Lrf/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrf/j$e;
    }
.end annotation


# direct methods
.method public static synthetic a(Lrf/A;JILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, Lrf/j;->e(Lrf/A;JILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;Lrf/e;Lmh/q;Lmh/q;Lmh/q;JIILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p10}, Lrf/j;->g(Landroidx/compose/ui/e;Lrf/e;Lmh/q;Lmh/q;Lmh/q;JIILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/e;Lrf/f;JIILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p7}, Lrf/j;->i(Landroidx/compose/ui/e;Lrf/f;JIILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lrf/A;JLT/l;I)V
    .locals 10

    const v0, 0x7b802156

    invoke-interface {p3, v0}, LT/l;->r(I)LT/l;

    move-result-object p3

    and-int/lit8 v1, p4, 0x6

    const/4 v2, 0x2

    if-nez v1, :cond_1

    invoke-interface {p3, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr v1, p4

    goto :goto_1

    :cond_1
    move v1, p4

    :goto_1
    and-int/lit8 v3, p4, 0x30

    if-nez v3, :cond_3

    invoke-interface {p3, p1, p2}, LT/l;->j(J)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    :cond_3
    and-int/lit8 v3, v1, 0x13

    const/16 v4, 0x12

    if-ne v3, v4, :cond_5

    invoke-interface {p3}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {p3}, LT/l;->C()V

    goto/16 :goto_5

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_6

    const/4 v3, -0x1

    const-string v4, "com.ui.wifiman.ui.teleport.component.Icon (TeleportTunnelNetworkTopology.kt:260)"

    invoke-static {v0, v1, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    sget-object v0, Lrf/j$e;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v0, v0, v3

    const/4 v3, 0x1

    const/4 v4, 0x3

    if-eq v0, v3, :cond_9

    if-eq v0, v2, :cond_8

    if-ne v0, v4, :cond_7

    const v0, -0x42b54be9

    invoke-interface {p3, v0}, LT/l;->U(I)V

    invoke-interface {p3}, LT/l;->J()V

    goto :goto_4

    :cond_7
    const p0, 0x6933c826

    invoke-interface {p3, p0}, LT/l;->U(I)V

    invoke-interface {p3}, LT/l;->J()V

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_8
    const v0, 0x6933eada

    invoke-interface {p3, v0}, LT/l;->U(I)V

    sget-object v0, Lla/a;->a:Lla/a;

    sget v1, Lla/a;->b:I

    invoke-virtual {v0, p3, v1}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a;->a()Lma/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lr9/a$a;->f()J

    move-result-wide v5

    const/4 v8, 0x0

    const/16 v9, 0xf

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v7, p3

    invoke-static/range {v1 .. v9}, LBe/C;->c(Landroidx/compose/ui/e;IFLBe/z;JLT/l;II)V

    invoke-interface {p3}, LT/l;->J()V

    goto :goto_4

    :cond_9
    const v0, 0x6933d1d1

    invoke-interface {p3, v0}, LT/l;->U(I)V

    sget-object v0, LN9/b;->a:LN9/b;

    invoke-virtual {v0}, LN9/b;->p()Ls9/b;

    move-result-object v0

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    sget-object v3, Lrf/d;->a:Lrf/d;

    invoke-virtual {v3}, Lrf/d;->a()I

    move-result v3

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-static {p1, p2}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v3

    shl-int/2addr v1, v4

    and-int/lit16 v1, v1, 0x380

    or-int/lit8 v6, v1, 0x30

    const/4 v7, 0x4

    const/4 v4, 0x0

    move-object v1, v0

    move-object v5, p3

    invoke-static/range {v1 .. v7}, Lta/c;->c(Ls9/b;Landroidx/compose/ui/e;Lm0/v0;Ljava/lang/String;LT/l;II)V

    invoke-interface {p3}, LT/l;->J()V

    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, LT/o;->P()V

    :cond_a
    :goto_5
    invoke-interface {p3}, LT/l;->z()LT/X0;

    move-result-object p3

    if-eqz p3, :cond_b

    new-instance v0, Lrf/g;

    invoke-direct {v0, p0, p1, p2, p4}, Lrf/g;-><init>(Lrf/A;JI)V

    invoke-interface {p3, v0}, LT/X0;->a(Lmh/p;)V

    :cond_b
    return-void
.end method

.method private static final e(Lrf/A;JILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, LT/L0;->a(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lrf/j;->d(Lrf/A;JLT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final f(Landroidx/compose/ui/e;Lrf/e;Lmh/q;Lmh/q;Lmh/q;JLT/l;II)V
    .locals 28

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v8, p8

    const/16 v0, 0x10

    const/16 v3, 0x20

    const/4 v4, 0x2

    const/16 v5, 0x30

    const/4 v6, 0x6

    const-string v7, "modifier"

    invoke-static {v1, v7}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "item"

    invoke-static {v2, v7}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v7, 0x1063602

    move-object/from16 v9, p7

    invoke-interface {v9, v7}, LT/l;->r(I)LT/l;

    move-result-object v15

    const/4 v9, 0x1

    and-int/lit8 v10, p9, 0x1

    const/4 v14, 0x4

    if-eqz v10, :cond_0

    or-int/lit8 v10, v8, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v10, v8, 0x6

    if-nez v10, :cond_2

    invoke-interface {v15, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    move v10, v14

    goto :goto_0

    :cond_1
    move v10, v4

    :goto_0
    or-int/2addr v10, v8

    goto :goto_1

    :cond_2
    move v10, v8

    :goto_1
    and-int/lit8 v4, p9, 0x2

    if-eqz v4, :cond_3

    or-int/2addr v10, v5

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v8, 0x30

    if-nez v4, :cond_5

    invoke-interface {v15, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    move v4, v3

    goto :goto_2

    :cond_4
    move v4, v0

    :goto_2
    or-int/2addr v10, v4

    :cond_5
    :goto_3
    and-int/lit8 v4, p9, 0x4

    if-eqz v4, :cond_7

    or-int/lit16 v10, v10, 0x180

    :cond_6
    move-object/from16 v11, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v11, v8, 0x180

    if-nez v11, :cond_6

    move-object/from16 v11, p2

    invoke-interface {v15, v11}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8

    const/16 v12, 0x100

    goto :goto_4

    :cond_8
    const/16 v12, 0x80

    :goto_4
    or-int/2addr v10, v12

    :goto_5
    and-int/lit8 v12, p9, 0x8

    if-eqz v12, :cond_a

    or-int/lit16 v10, v10, 0xc00

    :cond_9
    move-object/from16 v13, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v13, v8, 0xc00

    if-nez v13, :cond_9

    move-object/from16 v13, p3

    invoke-interface {v15, v13}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_b

    const/16 v16, 0x800

    goto :goto_6

    :cond_b
    const/16 v16, 0x400

    :goto_6
    or-int v10, v10, v16

    :goto_7
    and-int/lit8 v0, p9, 0x10

    if-eqz v0, :cond_d

    or-int/lit16 v10, v10, 0x6000

    :cond_c
    move-object/from16 v14, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v14, v8, 0x6000

    if-nez v14, :cond_c

    move-object/from16 v14, p4

    invoke-interface {v15, v14}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_e

    const/16 v16, 0x4000

    goto :goto_8

    :cond_e
    const/16 v16, 0x2000

    :goto_8
    or-int v10, v10, v16

    :goto_9
    and-int/lit8 v3, p9, 0x20

    const/high16 v16, 0x30000

    if-eqz v3, :cond_f

    or-int v10, v10, v16

    move-wide/from16 v5, p5

    goto :goto_b

    :cond_f
    and-int v16, v8, v16

    move-wide/from16 v5, p5

    if-nez v16, :cond_11

    invoke-interface {v15, v5, v6}, LT/l;->j(J)Z

    move-result v18

    if-eqz v18, :cond_10

    const/high16 v18, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v18, 0x10000

    :goto_a
    or-int v10, v10, v18

    :cond_11
    :goto_b
    const v18, 0x12493

    and-int v7, v10, v18

    const v9, 0x12492

    if-ne v7, v9, :cond_13

    invoke-interface {v15}, LT/l;->v()Z

    move-result v7

    if-nez v7, :cond_12

    goto :goto_c

    :cond_12
    invoke-interface {v15}, LT/l;->C()V

    move-wide v6, v5

    move-object v3, v11

    move-object v4, v13

    move-object v5, v14

    move-object v10, v15

    goto/16 :goto_12

    :cond_13
    :goto_c
    if-eqz v4, :cond_14

    sget-object v4, Lrf/a;->a:Lrf/a;

    invoke-virtual {v4}, Lrf/a;->a()Lmh/q;

    move-result-object v4

    goto :goto_d

    :cond_14
    move-object v4, v11

    :goto_d
    if-eqz v12, :cond_15

    new-instance v7, Lrf/j$a;

    invoke-direct {v7, v2}, Lrf/j$a;-><init>(Lrf/e;)V

    const/16 v9, 0x36

    const v11, -0x3cdbfaf7

    const/4 v12, 0x1

    invoke-static {v11, v12, v7, v15, v9}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    goto :goto_e

    :cond_15
    const/4 v12, 0x1

    move-object v7, v13

    :goto_e
    if-eqz v0, :cond_16

    sget-object v0, Lrf/a;->a:Lrf/a;

    invoke-virtual {v0}, Lrf/a;->b()Lmh/q;

    move-result-object v0

    goto :goto_f

    :cond_16
    move-object v0, v14

    :goto_f
    if-eqz v3, :cond_17

    sget-object v3, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v3}, Lm0/v0$a;->e()J

    move-result-wide v5

    :cond_17
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_18

    const/4 v3, -0x1

    const-string v9, "com.ui.wifiman.ui.teleport.component.TeleportTopologyItem (TeleportTunnelNetworkTopology.kt:214)"

    const v11, 0x1063602

    invoke-static {v11, v10, v3, v9}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_18
    sget-object v3, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v3}, Lf0/c$a;->g()Lf0/c$b;

    move-result-object v3

    sget-object v9, Lz/c;->a:Lz/c;

    invoke-virtual {v9}, Lz/c;->g()Lz/c$m;

    move-result-object v9

    const/16 v11, 0x30

    invoke-static {v9, v3, v15, v11}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v3

    const/4 v9, 0x0

    invoke-static {v15, v9}, LT/j;->a(LT/l;I)I

    move-result v11

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v13

    invoke-static {v15, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v14

    sget-object v16, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->a()Lmh/a;

    move-result-object v9

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v18

    if-nez v18, :cond_19

    invoke-static {}, LT/j;->c()V

    :cond_19
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v18

    if-eqz v18, :cond_1a

    invoke-interface {v15, v9}, LT/l;->D(Lmh/a;)V

    goto :goto_10

    :cond_1a
    invoke-interface {v15}, LT/l;->I()V

    :goto_10
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v9

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->e()Lmh/p;

    move-result-object v12

    invoke-static {v9, v3, v12}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v9, v13, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v9}, LT/l;->o()Z

    move-result v12

    if-nez v12, :cond_1b

    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_1c

    :cond_1b
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v9, v12}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v9, v11, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_1c
    invoke-virtual/range {v16 .. v16}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v9, v14, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Lz/k;->a:Lz/k;

    invoke-virtual/range {p1 .. p1}, Lrf/e;->a()Ls9/a;

    move-result-object v9

    const v3, 0x784bfdf9

    invoke-interface {v15, v3}, LT/l;->U(I)V

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 v11, 0x40

    int-to-float v11, v11

    invoke-static {v11}, LY0/h;->j(F)F

    move-result v11

    invoke-static {v3, v11}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v11

    const v12, 0x784c0759

    invoke-interface {v15, v12}, LT/l;->U(I)V

    sget-object v12, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v12}, Lm0/v0$a;->e()J

    move-result-wide v12

    invoke-static {v5, v6, v12, v13}, Lm0/v0;->m(JJ)Z

    move-result v12

    if-nez v12, :cond_20

    const v12, 0x739120f7

    invoke-interface {v15, v12}, LT/l;->U(I)V

    const/high16 v12, 0x70000

    and-int/2addr v12, v10

    const/high16 v13, 0x20000

    if-ne v12, v13, :cond_1d

    const/16 v18, 0x1

    goto :goto_11

    :cond_1d
    const/16 v18, 0x0

    :goto_11
    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v12

    if-nez v18, :cond_1e

    sget-object v13, LT/l;->a:LT/l$a;

    invoke-virtual {v13}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v13

    if-ne v12, v13, :cond_1f

    :cond_1e
    sget-object v12, Lm0/l0;->b:Lm0/l0$a;

    invoke-static {v5, v6}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v13

    invoke-static {v5, v6}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v14

    const/16 v26, 0xe

    const/16 v27, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    move-wide/from16 v20, v5

    invoke-static/range {v20 .. v27}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v16

    invoke-static/range {v16 .. v17}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v1

    filled-new-array {v13, v14, v1}, [Lm0/v0;

    move-result-object v1

    invoke-static {v1}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v21

    const-wide/16 v22, 0x0

    const/16 v25, 0x0

    move-object/from16 v20, v12

    invoke-static/range {v20 .. v27}, Lm0/l0$a;->f(Lm0/l0$a;Ljava/util/List;JFIILjava/lang/Object;)Lm0/l0;

    move-result-object v12

    invoke-interface {v15, v12}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1f
    move-object/from16 v21, v12

    check-cast v21, Lm0/l0;

    invoke-interface {v15}, LT/l;->J()V

    const/16 v24, 0x6

    const/16 v25, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v20, v11

    invoke-static/range {v20 .. v25}, Landroidx/compose/foundation/b;->b(Landroidx/compose/ui/e;Lm0/l0;Lm0/i1;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    move-object v11, v1

    :cond_20
    invoke-interface {v15}, LT/l;->J()V

    invoke-interface {v15}, LT/l;->J()V

    const/16 v18, 0x0

    const/16 v19, 0x3e

    const/4 v1, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v16, 0x0

    move/from16 v20, v10

    move-object v10, v11

    move-object v11, v1

    const/4 v1, 0x4

    move-object/from16 p2, v15

    move-wide/from16 v15, v16

    move-object/from16 v17, p2

    invoke-static/range {v9 .. v19}, LBe/w;->b(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;FJLT/l;II)V

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v9

    invoke-static {v3, v9}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v9

    move-object/from16 v10, p2

    const/4 v11, 0x6

    invoke-static {v9, v10, v11}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    shr-int/lit8 v9, v20, 0x3

    and-int/lit8 v12, v9, 0xe

    and-int/lit8 v9, v9, 0x7e

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v4, v2, v10, v9}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v3, v1}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v1, v10, v11}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    shr-int/lit8 v1, v20, 0x6

    and-int/lit8 v1, v1, 0x70

    or-int/2addr v1, v12

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v7, v2, v10, v1}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    shr-int/lit8 v1, v20, 0x9

    and-int/lit8 v1, v1, 0x70

    or-int/2addr v1, v12

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v2, v10, v1}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v10}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_21

    invoke-static {}, LT/o;->P()V

    :cond_21
    move-object v3, v4

    move-object v4, v7

    move-wide v6, v5

    move-object v5, v0

    :goto_12
    invoke-interface {v10}, LT/l;->z()LT/X0;

    move-result-object v10

    if-eqz v10, :cond_22

    new-instance v11, Lrf/i;

    move-object v0, v11

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lrf/i;-><init>(Landroidx/compose/ui/e;Lrf/e;Lmh/q;Lmh/q;Lmh/q;JII)V

    invoke-interface {v10, v11}, LT/X0;->a(Lmh/p;)V

    :cond_22
    return-void
.end method

.method private static final g(Landroidx/compose/ui/e;Lrf/e;Lmh/q;Lmh/q;Lmh/q;JIILT/l;I)LYg/J;
    .locals 11

    or-int/lit8 v0, p7, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-wide/from16 v6, p5

    move-object/from16 v8, p9

    move/from16 v10, p8

    invoke-static/range {v1 .. v10}, Lrf/j;->f(Landroidx/compose/ui/e;Lrf/e;Lmh/q;Lmh/q;Lmh/q;JLT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method public static final h(Landroidx/compose/ui/e;Lrf/f;JLT/l;II)V
    .locals 19

    move-object/from16 v11, p0

    move-object/from16 v12, p1

    move/from16 v13, p5

    const-string v0, "modifier"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0xe4e398f

    move-object/from16 v1, p4

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v14

    and-int/lit8 v1, p6, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v13, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v13, 0x6

    if-nez v1, :cond_2

    invoke-interface {v14, v11}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v13

    goto :goto_1

    :cond_2
    move v1, v13

    :goto_1
    and-int/lit8 v2, p6, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v2, v13, 0x30

    if-nez v2, :cond_5

    invoke-interface {v14, v12}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x20

    goto :goto_2

    :cond_4
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_5
    :goto_3
    and-int/lit16 v2, v13, 0x180

    if-nez v2, :cond_8

    and-int/lit8 v2, p6, 0x4

    if-nez v2, :cond_6

    move-wide/from16 v2, p2

    invoke-interface {v14, v2, v3}, LT/l;->j(J)Z

    move-result v4

    if-eqz v4, :cond_7

    const/16 v4, 0x100

    goto :goto_4

    :cond_6
    move-wide/from16 v2, p2

    :cond_7
    const/16 v4, 0x80

    :goto_4
    or-int/2addr v1, v4

    goto :goto_5

    :cond_8
    move-wide/from16 v2, p2

    :goto_5
    and-int/lit16 v4, v1, 0x93

    const/16 v5, 0x92

    if-ne v4, v5, :cond_a

    invoke-interface {v14}, LT/l;->v()Z

    move-result v4

    if-nez v4, :cond_9

    goto :goto_6

    :cond_9
    invoke-interface {v14}, LT/l;->C()V

    move-wide v3, v2

    goto/16 :goto_a

    :cond_a
    :goto_6
    invoke-interface {v14}, LT/l;->q()V

    and-int/lit8 v4, v13, 0x1

    if-eqz v4, :cond_d

    invoke-interface {v14}, LT/l;->H()Z

    move-result v4

    if-eqz v4, :cond_b

    goto :goto_8

    :cond_b
    invoke-interface {v14}, LT/l;->C()V

    and-int/lit8 v4, p6, 0x4

    if-eqz v4, :cond_c

    :goto_7
    and-int/lit16 v1, v1, -0x381

    :cond_c
    move-wide v9, v2

    goto :goto_9

    :cond_d
    :goto_8
    and-int/lit8 v4, p6, 0x4

    if-eqz v4, :cond_c

    sget-object v2, Lla/a;->a:Lla/a;

    sget v3, Lla/a;->b:I

    invoke-virtual {v2, v14, v3}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->e()Lma/a$e;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$e;->b()J

    move-result-wide v2

    goto :goto_7

    :goto_9
    invoke-interface {v14}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_e

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.teleport.component.TeleportTunnelNetworkTopology (TeleportTunnelNetworkTopology.kt:105)"

    invoke-static {v0, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_e
    new-instance v2, Lrf/j$b;

    invoke-direct {v2, v12}, Lrf/j$b;-><init>(Lrf/f;)V

    sget-object v0, Lcom/ui/wifiman/ui/component/network/q;->a:Lcom/ui/wifiman/ui/component/network/q;

    invoke-virtual {v0}, Lcom/ui/wifiman/ui/component/network/q;->b()Lmh/r;

    move-result-object v4

    new-instance v0, Lrf/j$c;

    invoke-direct {v0, v9, v10}, Lrf/j$c;-><init>(J)V

    const v3, -0x5d07db88

    const/4 v5, 0x1

    const/16 v6, 0x36

    invoke-static {v3, v5, v0, v14, v6}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    new-instance v0, Lrf/j$d;

    invoke-direct {v0, v12}, Lrf/j$d;-><init>(Lrf/f;)V

    const v3, 0x4fe96c06

    invoke-static {v3, v5, v0, v14, v6}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v8

    and-int/lit8 v0, v1, 0xe

    const/high16 v1, 0xd80000

    or-int v15, v0, v1

    const/16 v16, 0x2c

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v0, p0

    move-object v1, v2

    move v2, v3

    move v3, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v14

    move-wide/from16 v17, v9

    move v9, v15

    move/from16 v10, v16

    invoke-static/range {v0 .. v10}, Lcom/ui/wifiman/ui/component/network/B;->k(Landroidx/compose/ui/e;Lmh/q;ZFLmh/r;Lmh/s;Lmh/s;Lmh/t;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-static {}, LT/o;->P()V

    :cond_f
    move-wide/from16 v3, v17

    :goto_a
    invoke-interface {v14}, LT/l;->z()LT/X0;

    move-result-object v7

    if-eqz v7, :cond_10

    new-instance v8, Lrf/h;

    move-object v0, v8

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Lrf/h;-><init>(Landroidx/compose/ui/e;Lrf/f;JII)V

    invoke-interface {v7, v8}, LT/X0;->a(Lmh/p;)V

    :cond_10
    return-void
.end method

.method private static final i(Landroidx/compose/ui/e;Lrf/f;JIILT/l;I)LYg/J;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, LT/L0;->a(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-object v4, p6

    move v6, p5

    invoke-static/range {v0 .. v6}, Lrf/j;->h(Landroidx/compose/ui/e;Lrf/f;JLT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final synthetic j(Lrf/A;JLT/l;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lrf/j;->d(Lrf/A;JLT/l;I)V

    return-void
.end method

.method public static final synthetic k(Lcom/ui/wifiman/ui/teleport/y;)Lrf/A;
    .locals 0

    invoke-static {p0}, Lrf/j;->m(Lcom/ui/wifiman/ui/teleport/y;)Lrf/A;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic l(LT/l;I)Lrf/f;
    .locals 0

    invoke-static {p0, p1}, Lrf/j;->n(LT/l;I)Lrf/f;

    move-result-object p0

    return-object p0
.end method

.method private static final m(Lcom/ui/wifiman/ui/teleport/y;)Lrf/A;
    .locals 1

    instance-of v0, p0, Lcom/ui/wifiman/ui/teleport/y$a;

    if-eqz v0, :cond_0

    sget-object p0, Lrf/A;->CHECKMARK:Lrf/A;

    goto :goto_0

    :cond_0
    instance-of v0, p0, Lcom/ui/wifiman/ui/teleport/y$b;

    if-eqz v0, :cond_1

    sget-object p0, Lrf/A;->DOTS:Lrf/A;

    goto :goto_0

    :cond_1
    instance-of p0, p0, Lcom/ui/wifiman/ui/teleport/y$c;

    if-eqz p0, :cond_2

    sget-object p0, Lrf/A;->NONE:Lrf/A;

    :goto_0
    return-object p0

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final n(LT/l;I)Lrf/f;
    .locals 17

    const v0, 0x52d0c615

    move-object/from16 v1, p0

    invoke-interface {v1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.teleport.component.previewTopologyState (TeleportTunnelNetworkTopology.kt:272)"

    move/from16 v4, p1

    invoke-static {v0, v4, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    new-instance v0, Lrf/f;

    new-instance v8, Lrf/e;

    new-instance v9, Ls9/b$a;

    sget v10, Lm8/a;->l0:I

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, v9

    move v3, v10

    invoke-direct/range {v2 .. v7}, Ls9/b$a;-><init>(ILs9/b$b;Ls9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Ls9/d$c;

    const-string v2, "Console"

    invoke-direct {v5, v2}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    new-instance v6, Ls9/d$c;

    const-string v2, "Online"

    invoke-direct {v6, v2}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    sget-object v7, Lcom/ui/wifiman/ui/teleport/z;->ONLINE:Lcom/ui/wifiman/ui/teleport/z;

    const-string v3, "0"

    move-object v2, v8

    move-object v4, v9

    invoke-direct/range {v2 .. v7}, Lrf/e;-><init>(Ljava/lang/String;Ls9/a;Ls9/d;Ls9/d;Lcom/ui/wifiman/ui/teleport/z;)V

    new-instance v9, Lrf/e;

    new-instance v13, Ls9/b$a;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, v13

    move v3, v10

    invoke-direct/range {v2 .. v7}, Ls9/b$a;-><init>(ILs9/b$b;Ls9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v14, Ls9/d$c;

    const-string v2, "Myself"

    invoke-direct {v14, v2}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    new-instance v15, Ls9/d$c;

    const-string v2, "Your Device"

    invoke-direct {v15, v2}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    sget-object v16, Lcom/ui/wifiman/ui/teleport/z;->OFFLINE:Lcom/ui/wifiman/ui/teleport/z;

    const-string v12, "1"

    move-object v11, v9

    invoke-direct/range {v11 .. v16}, Lrf/e;-><init>(Ljava/lang/String;Ls9/a;Ls9/d;Ls9/d;Lcom/ui/wifiman/ui/teleport/z;)V

    new-instance v2, Lcom/ui/wifiman/ui/teleport/y$b;

    const v3, 0x3f19999a    # 0.6f

    invoke-direct {v2, v3}, Lcom/ui/wifiman/ui/teleport/y$b;-><init>(F)V

    invoke-direct {v0, v8, v9, v2}, Lrf/f;-><init>(Lrf/e;Lrf/e;Lcom/ui/wifiman/ui/teleport/y;)V

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    invoke-interface/range {p0 .. p0}, LT/l;->J()V

    return-object v0
.end method
