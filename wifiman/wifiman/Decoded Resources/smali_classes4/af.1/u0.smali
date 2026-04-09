.class public abstract Laf/u0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Laf/u0;->e(Landroidx/compose/ui/e;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;Laf/q0;Lmh/l;Lmh/l;ILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p6}, Laf/u0;->i(Landroidx/compose/ui/e;Laf/q0;Lmh/l;Lmh/l;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/e;Laf/q0$a;Lmh/l;Lmh/l;ILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p6}, Laf/u0;->g(Landroidx/compose/ui/e;Laf/q0$a;Lmh/l;Lmh/l;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Landroidx/compose/ui/e;LT/l;I)V
    .locals 12

    const/4 v0, 0x3

    const v1, 0x41fa565b

    invoke-interface {p1, v1}, LT/l;->r(I)LT/l;

    move-result-object p1

    const/4 v2, 0x6

    and-int/lit8 v3, p2, 0x6

    const/4 v4, 0x2

    if-nez v3, :cond_1

    invoke-interface {p1, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int/2addr v3, p2

    goto :goto_1

    :cond_1
    move v3, p2

    :goto_1
    and-int/lit8 v5, v3, 0x3

    if-ne v5, v4, :cond_3

    invoke-interface {p1}, LT/l;->v()Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p1}, LT/l;->C()V

    goto/16 :goto_5

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_4

    const/4 v4, -0x1

    const-string v5, "com.ui.wifiman.ui.speed.component.ContainerLoading (SpeedTabTopologyCardUi.kt:47)"

    invoke-static {v1, v3, v4, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    sget-object v1, Lla/a;->a:Lla/a;

    sget v4, Lla/a;->b:I

    invoke-virtual {v1, p1, v4}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a;->a()Lma/a$a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v1

    invoke-virtual {v1}, Lr9/a$b;->e()J

    move-result-wide v4

    and-int/lit8 v1, v3, 0xe

    invoke-static {p0, p1, v1}, LH9/a;->a(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v3, Lz/c;->a:Lz/c;

    invoke-virtual {v3}, Lz/c;->b()Lz/c$f;

    move-result-object v3

    sget-object v6, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v6}, Lf0/c$a;->l()Lf0/c$c;

    move-result-object v6

    invoke-static {v3, v6, p1, v2}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v3

    const/4 v6, 0x0

    invoke-static {p1, v6}, LT/j;->a(LT/l;I)I

    move-result v7

    invoke-interface {p1}, LT/l;->G()LT/x;

    move-result-object v8

    invoke-static {p1, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v9, LE0/g;->K:LE0/g$a;

    invoke-virtual {v9}, LE0/g$a;->a()Lmh/a;

    move-result-object v10

    invoke-interface {p1}, LT/l;->x()LT/f;

    move-result-object v11

    if-nez v11, :cond_5

    invoke-static {}, LT/j;->c()V

    :cond_5
    invoke-interface {p1}, LT/l;->u()V

    invoke-interface {p1}, LT/l;->o()Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-interface {p1, v10}, LT/l;->D(Lmh/a;)V

    goto :goto_3

    :cond_6
    invoke-interface {p1}, LT/l;->I()V

    :goto_3
    invoke-static {p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v10

    invoke-virtual {v9}, LE0/g$a;->e()Lmh/p;

    move-result-object v11

    invoke-static {v10, v3, v11}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v10, v8, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v10}, LT/l;->o()Z

    move-result v8

    if-nez v8, :cond_7

    invoke-interface {v10}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v8, v11}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_8

    :cond_7
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v10, v8}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v10, v7, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_8
    invoke-virtual {v9}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v10, v1, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v1, Lz/Z;->a:Lz/Z;

    const v1, -0x4ee2fe52

    invoke-interface {p1, v1}, LT/l;->U(I)V

    invoke-static {v6, v0}, Lsh/m;->s(II)Lsh/i;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    move-object v1, v0

    check-cast v1, LZg/Q;

    invoke-virtual {v1}, LZg/Q;->d()I

    move-result v1

    const v3, -0x4ee2fc58

    invoke-interface {p1, v3}, LT/l;->U(I)V

    if-eqz v1, :cond_9

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 v3, 0x32

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/r;->z(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v1, p1, v2}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    :cond_9
    invoke-interface {p1}, LT/l;->J()V

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 v3, 0x4e

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    const/16 v7, 0x5e

    int-to-float v7, v7

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v7

    invoke-static {v1, v3, v7}, Landroidx/compose/foundation/layout/r;->w(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v3, Lla/a;->a:Lla/a;

    sget v7, Lla/a;->b:I

    invoke-virtual {v3, p1, v7}, Lla/a;->b(LT/l;I)Loa/a;

    move-result-object v3

    invoke-virtual {v3}, Loa/a;->a()LE/a;

    move-result-object v3

    invoke-static {v1, v4, v5, v3}, Landroidx/compose/foundation/b;->c(Landroidx/compose/ui/e;JLm0/i1;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v1, p1, v6}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    goto :goto_4

    :cond_a
    invoke-interface {p1}, LT/l;->J()V

    invoke-interface {p1}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {}, LT/o;->P()V

    :cond_b
    :goto_5
    invoke-interface {p1}, LT/l;->z()LT/X0;

    move-result-object p1

    if-eqz p1, :cond_c

    new-instance v0, Laf/s0;

    invoke-direct {v0, p0, p2}, Laf/s0;-><init>(Landroidx/compose/ui/e;I)V

    invoke-interface {p1, v0}, LT/X0;->a(Lmh/p;)V

    :cond_c
    return-void
.end method

.method private static final e(Landroidx/compose/ui/e;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, LT/L0;->a(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Laf/u0;->d(Landroidx/compose/ui/e;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final f(Landroidx/compose/ui/e;Laf/q0$a;Lmh/l;Lmh/l;LT/l;I)V
    .locals 19

    move/from16 v5, p5

    const v0, 0x6a864e93

    move-object/from16 v1, p4

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v1

    and-int/lit8 v2, v5, 0x6

    if-nez v2, :cond_1

    move-object/from16 v2, p0

    invoke-interface {v1, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v5

    goto :goto_1

    :cond_1
    move-object/from16 v2, p0

    move v3, v5

    :goto_1
    and-int/lit8 v4, v5, 0x30

    if-nez v4, :cond_3

    move-object/from16 v4, p1

    invoke-interface {v1, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    goto :goto_3

    :cond_3
    move-object/from16 v4, p1

    :goto_3
    and-int/lit16 v6, v5, 0x180

    move-object/from16 v15, p2

    if-nez v6, :cond_5

    invoke-interface {v1, v15}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_4

    :cond_4
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v3, v6

    :cond_5
    and-int/lit16 v6, v5, 0xc00

    move-object/from16 v14, p3

    if-nez v6, :cond_7

    invoke-interface {v1, v14}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x800

    goto :goto_5

    :cond_6
    const/16 v6, 0x400

    :goto_5
    or-int/2addr v3, v6

    :cond_7
    and-int/lit16 v6, v3, 0x493

    const/16 v7, 0x492

    if-ne v6, v7, :cond_9

    invoke-interface {v1}, LT/l;->v()Z

    move-result v6

    if-nez v6, :cond_8

    goto :goto_6

    :cond_8
    invoke-interface {v1}, LT/l;->C()V

    goto :goto_7

    :cond_9
    :goto_6
    invoke-static {}, LT/o;->H()Z

    move-result v6

    if-eqz v6, :cond_a

    const/4 v6, -0x1

    const-string v7, "com.ui.wifiman.ui.speed.component.ContainerTopology (SpeedTabTopologyCardUi.kt:79)"

    invoke-static {v0, v3, v6, v7}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_a
    sget-object v0, Lla/a;->a:Lla/a;

    sget v6, Lla/a;->b:I

    invoke-virtual {v0, v1, v6}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v0

    invoke-virtual {v0}, Lra/a;->a()Lra/b;

    move-result-object v0

    invoke-virtual {v0}, Lra/b;->a()Lra/b$a$a;

    move-result-object v0

    invoke-virtual {v0}, Lra/b$a$a;->c()F

    move-result v12

    invoke-virtual/range {p1 .. p1}, Laf/q0$a;->a()Lcom/ui/wifiman/ui/component/network/N;

    move-result-object v7

    and-int/lit8 v0, v3, 0xe

    shl-int/lit8 v3, v3, 0xc

    const/high16 v6, 0x380000

    and-int/2addr v6, v3

    or-int/2addr v0, v6

    const/high16 v6, 0x1c00000

    and-int/2addr v3, v6

    or-int v17, v0, v3

    const/16 v18, 0x2c

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const/4 v13, 0x0

    move-object/from16 v6, p0

    move-object/from16 v14, p2

    move-object/from16 v15, p3

    move-object/from16 v16, v1

    invoke-static/range {v6 .. v18}, Lcom/ui/wifiman/ui/component/network/X;->p(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/N;JJFZLmh/l;Lmh/l;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {}, LT/o;->P()V

    :cond_b
    :goto_7
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v6

    if-eqz v6, :cond_c

    new-instance v7, Laf/t0;

    move-object v0, v7

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Laf/t0;-><init>(Landroidx/compose/ui/e;Laf/q0$a;Lmh/l;Lmh/l;I)V

    invoke-interface {v6, v7}, LT/X0;->a(Lmh/p;)V

    :cond_c
    return-void
.end method

.method private static final g(Landroidx/compose/ui/e;Laf/q0$a;Lmh/l;Lmh/l;ILT/l;I)LYg/J;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, LT/L0;->a(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Laf/u0;->f(Landroidx/compose/ui/e;Laf/q0$a;Lmh/l;Lmh/l;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final h(Landroidx/compose/ui/e;Laf/q0;Lmh/l;Lmh/l;LT/l;I)V
    .locals 9

    const-string v0, "modifier"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "model"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onItemSpeedtestClicked"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onItemClicked"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x58ddac0c

    invoke-interface {p4, v0}, LT/l;->r(I)LT/l;

    move-result-object p4

    const/4 v1, 0x6

    and-int/lit8 v2, p5, 0x6

    if-nez v2, :cond_1

    invoke-interface {p4, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, p5

    goto :goto_1

    :cond_1
    move v2, p5

    :goto_1
    and-int/lit8 v3, p5, 0x30

    if-nez v3, :cond_3

    invoke-interface {p4, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_3
    and-int/lit16 v3, p5, 0x180

    if-nez v3, :cond_5

    invoke-interface {p4, p2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x100

    goto :goto_3

    :cond_4
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v2, v3

    :cond_5
    and-int/lit16 v3, p5, 0xc00

    if-nez v3, :cond_7

    invoke-interface {p4, p3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    const/16 v3, 0x800

    goto :goto_4

    :cond_6
    const/16 v3, 0x400

    :goto_4
    or-int/2addr v2, v3

    :cond_7
    and-int/lit16 v3, v2, 0x493

    const/16 v4, 0x492

    if-ne v3, v4, :cond_9

    invoke-interface {p4}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_8

    goto :goto_5

    :cond_8
    invoke-interface {p4}, LT/l;->C()V

    goto/16 :goto_8

    :cond_9
    :goto_5
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_a

    const/4 v3, -0x1

    const-string v4, "com.ui.wifiman.ui.speed.component.SpeedTabTopologyCardUi (SpeedTabTopologyCardUi.kt:28)"

    invoke-static {v0, v2, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_a
    sget-object v0, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v0}, Lf0/c$a;->o()Lf0/c;

    move-result-object v0

    const/4 v3, 0x0

    invoke-static {v0, v3}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v0

    invoke-static {p4, v3}, LT/j;->a(LT/l;I)I

    move-result v3

    invoke-interface {p4}, LT/l;->G()LT/x;

    move-result-object v4

    invoke-static {p4, p0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v5

    sget-object v6, LE0/g;->K:LE0/g$a;

    invoke-virtual {v6}, LE0/g$a;->a()Lmh/a;

    move-result-object v7

    invoke-interface {p4}, LT/l;->x()LT/f;

    move-result-object v8

    if-nez v8, :cond_b

    invoke-static {}, LT/j;->c()V

    :cond_b
    invoke-interface {p4}, LT/l;->u()V

    invoke-interface {p4}, LT/l;->o()Z

    move-result v8

    if-eqz v8, :cond_c

    invoke-interface {p4, v7}, LT/l;->D(Lmh/a;)V

    goto :goto_6

    :cond_c
    invoke-interface {p4}, LT/l;->I()V

    :goto_6
    invoke-static {p4}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v7

    invoke-virtual {v6}, LE0/g$a;->e()Lmh/p;

    move-result-object v8

    invoke-static {v7, v0, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v6}, LE0/g$a;->g()Lmh/p;

    move-result-object v0

    invoke-static {v7, v4, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v6}, LE0/g$a;->b()Lmh/p;

    move-result-object v0

    invoke-interface {v7}, LT/l;->o()Z

    move-result v4

    if-nez v4, :cond_d

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v4, v8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_e

    :cond_d
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v7, v4}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v7, v3, v0}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_e
    invoke-virtual {v6}, LE0/g$a;->f()Lmh/p;

    move-result-object v0

    invoke-static {v7, v5, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v0, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    instance-of v0, p1, Laf/q0$b;

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v0, :cond_f

    const v0, 0x6b2f4dae

    invoke-interface {p4, v0}, LT/l;->U(I)V

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v0, v5, v4, v3}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-static {v0, p4, v1}, Laf/u0;->d(Landroidx/compose/ui/e;LT/l;I)V

    invoke-interface {p4}, LT/l;->J()V

    goto :goto_7

    :cond_f
    instance-of v0, p1, Laf/q0$a;

    if-eqz v0, :cond_12

    const v0, 0x6b2f5f1e

    invoke-interface {p4, v0}, LT/l;->U(I)V

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v0, v5, v4, v3}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    move-object v3, p1

    check-cast v3, Laf/q0$a;

    and-int/lit16 v4, v2, 0x380

    or-int/2addr v1, v4

    and-int/lit16 v2, v2, 0x1c00

    or-int v6, v1, v2

    move-object v1, v0

    move-object v2, v3

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-static/range {v1 .. v6}, Laf/u0;->f(Landroidx/compose/ui/e;Laf/q0$a;Lmh/l;Lmh/l;LT/l;I)V

    invoke-interface {p4}, LT/l;->J()V

    :goto_7
    invoke-interface {p4}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-static {}, LT/o;->P()V

    :cond_10
    :goto_8
    invoke-interface {p4}, LT/l;->z()LT/X0;

    move-result-object p4

    if-eqz p4, :cond_11

    new-instance v6, Laf/r0;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p5

    invoke-direct/range {v0 .. v5}, Laf/r0;-><init>(Landroidx/compose/ui/e;Laf/q0;Lmh/l;Lmh/l;I)V

    invoke-interface {p4, v6}, LT/X0;->a(Lmh/p;)V

    :cond_11
    return-void

    :cond_12
    const p0, 0x6b2f4693

    invoke-interface {p4, p0}, LT/l;->U(I)V

    invoke-interface {p4}, LT/l;->J()V

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final i(Landroidx/compose/ui/e;Laf/q0;Lmh/l;Lmh/l;ILT/l;I)LYg/J;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, LT/L0;->a(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Laf/u0;->h(Landroidx/compose/ui/e;Laf/q0;Lmh/l;Lmh/l;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
