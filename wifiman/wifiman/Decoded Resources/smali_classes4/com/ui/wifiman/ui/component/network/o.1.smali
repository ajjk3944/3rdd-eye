.class public abstract Lcom/ui/wifiman/ui/component/network/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Lcom/ui/wifiman/ui/component/network/h;Landroidx/compose/ui/e;FILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/ui/wifiman/ui/component/network/o;->g(Lcom/ui/wifiman/ui/component/network/h;Landroidx/compose/ui/e;FILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;FFLcom/ui/wifiman/ui/component/network/k;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p7}, Lcom/ui/wifiman/ui/component/network/o;->i(Landroidx/compose/ui/e;FFLcom/ui/wifiman/ui/component/network/k;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/ui/wifiman/ui/component/network/i;Landroidx/compose/ui/e;FILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/ui/wifiman/ui/component/network/o;->f(Lcom/ui/wifiman/ui/component/network/i;Landroidx/compose/ui/e;FILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lcom/ui/wifiman/ui/component/network/h;Landroidx/compose/ui/e;FLT/l;I)V
    .locals 10

    const v0, 0x316a12f4

    invoke-interface {p3, v0}, LT/l;->r(I)LT/l;

    move-result-object p3

    and-int/lit8 v1, p4, 0x6

    if-nez v1, :cond_1

    invoke-interface {p3, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p4

    goto :goto_1

    :cond_1
    move v1, p4

    :goto_1
    and-int/lit8 v2, p4, 0x30

    if-nez v2, :cond_3

    invoke-interface {p3, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, p4, 0x180

    if-nez v2, :cond_5

    invoke-interface {p3, p2}, LT/l;->g(F)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit16 v2, v1, 0x93

    const/16 v3, 0x92

    if-ne v2, v3, :cond_7

    invoke-interface {p3}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {p3}, LT/l;->C()V

    goto :goto_7

    :cond_7
    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_8

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.component.network.Compose (NetworkConnectionProgress.kt:74)"

    invoke-static {v0, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_8
    sget-object v0, Lla/a;->a:Lla/a;

    sget v2, Lla/a;->b:I

    invoke-virtual {v0, p3, v2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a;->a()Lma/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lr9/a$a;->f()J

    move-result-wide v5

    instance-of v0, p0, Lcom/ui/wifiman/ui/component/network/h$a;

    if-eqz v0, :cond_9

    sget-object v0, LBe/z;->FINISHED:LBe/z;

    :goto_5
    move-object v4, v0

    goto :goto_6

    :cond_9
    instance-of v0, p0, Lcom/ui/wifiman/ui/component/network/h$b$a;

    if-eqz v0, :cond_a

    sget-object v0, LBe/z;->LTR:LBe/z;

    goto :goto_5

    :cond_a
    instance-of v0, p0, Lcom/ui/wifiman/ui/component/network/h$b$b;

    if-eqz v0, :cond_d

    sget-object v0, LBe/z;->RTL:LBe/z;

    goto :goto_5

    :goto_6
    shr-int/lit8 v0, v1, 0x3

    and-int/lit8 v0, v0, 0xe

    and-int/lit16 v1, v1, 0x380

    or-int v8, v0, v1

    const/4 v9, 0x2

    const/4 v2, 0x0

    move-object v1, p1

    move v3, p2

    move-object v7, p3

    invoke-static/range {v1 .. v9}, LBe/C;->c(Landroidx/compose/ui/e;IFLBe/z;JLT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {}, LT/o;->P()V

    :cond_b
    :goto_7
    invoke-interface {p3}, LT/l;->z()LT/X0;

    move-result-object p3

    if-eqz p3, :cond_c

    new-instance v0, Lcom/ui/wifiman/ui/component/network/n;

    invoke-direct {v0, p0, p1, p2, p4}, Lcom/ui/wifiman/ui/component/network/n;-><init>(Lcom/ui/wifiman/ui/component/network/h;Landroidx/compose/ui/e;FI)V

    invoke-interface {p3, v0}, LT/X0;->a(Lmh/p;)V

    :cond_c
    return-void

    :cond_d
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final e(Lcom/ui/wifiman/ui/component/network/i;Landroidx/compose/ui/e;FLT/l;I)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p4

    const v4, 0x74017d6

    move-object/from16 v5, p3

    invoke-interface {v5, v4}, LT/l;->r(I)LT/l;

    move-result-object v15

    and-int/lit8 v5, v3, 0x6

    if-nez v5, :cond_1

    invoke-interface {v15, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v3

    goto :goto_1

    :cond_1
    move v5, v3

    :goto_1
    and-int/lit8 v6, v3, 0x30

    if-nez v6, :cond_3

    invoke-interface {v15, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_3
    and-int/lit16 v6, v3, 0x180

    if-nez v6, :cond_5

    invoke-interface {v15, v2}, LT/l;->g(F)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v5, v6

    :cond_5
    and-int/lit16 v6, v5, 0x93

    const/16 v7, 0x92

    if-ne v6, v7, :cond_7

    invoke-interface {v15}, LT/l;->v()Z

    move-result v6

    if-nez v6, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {v15}, LT/l;->C()V

    move-object/from16 v16, v15

    goto :goto_5

    :cond_7
    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result v6

    if-eqz v6, :cond_8

    const/4 v6, -0x1

    const-string v7, "com.ui.wifiman.ui.component.network.Compose (NetworkConnectionProgress.kt:64)"

    invoke-static {v4, v5, v6, v7}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_8
    invoke-virtual/range {p0 .. p0}, Lcom/ui/wifiman/ui/component/network/i;->a()Ls9/a;

    move-result-object v5

    invoke-static/range {p1 .. p2}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v6

    const/4 v14, 0x0

    const/16 v4, 0x3e

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    move-object v13, v15

    move-object/from16 v16, v15

    move v15, v4

    invoke-static/range {v5 .. v15}, LBe/w;->b(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;FJLT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-static {}, LT/o;->P()V

    :cond_9
    :goto_5
    invoke-interface/range {v16 .. v16}, LT/l;->z()LT/X0;

    move-result-object v4

    if-eqz v4, :cond_a

    new-instance v5, Lcom/ui/wifiman/ui/component/network/m;

    invoke-direct {v5, v0, v1, v2, v3}, Lcom/ui/wifiman/ui/component/network/m;-><init>(Lcom/ui/wifiman/ui/component/network/i;Landroidx/compose/ui/e;FI)V

    invoke-interface {v4, v5}, LT/X0;->a(Lmh/p;)V

    :cond_a
    return-void
.end method

.method private static final f(Lcom/ui/wifiman/ui/component/network/i;Landroidx/compose/ui/e;FILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, LT/L0;->a(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lcom/ui/wifiman/ui/component/network/o;->e(Lcom/ui/wifiman/ui/component/network/i;Landroidx/compose/ui/e;FLT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final g(Lcom/ui/wifiman/ui/component/network/h;Landroidx/compose/ui/e;FILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, LT/L0;->a(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lcom/ui/wifiman/ui/component/network/o;->d(Lcom/ui/wifiman/ui/component/network/h;Landroidx/compose/ui/e;FLT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final h(Landroidx/compose/ui/e;FFLcom/ui/wifiman/ui/component/network/k;LT/l;II)V
    .locals 9

    const/4 v0, 0x2

    const/4 v1, 0x4

    const/16 v2, 0x30

    const/4 v3, 0x6

    const-string v4, "model"

    invoke-static {p3, v4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v4, 0x42fdaa85

    invoke-interface {p4, v4}, LT/l;->r(I)LT/l;

    move-result-object p4

    and-int/lit8 v5, p6, 0x1

    if-eqz v5, :cond_0

    or-int/lit8 v6, p5, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v6, p5, 0x6

    if-nez v6, :cond_2

    invoke-interface {p4, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    move v6, v1

    goto :goto_0

    :cond_1
    move v6, v0

    :goto_0
    or-int/2addr v6, p5

    goto :goto_1

    :cond_2
    move v6, p5

    :goto_1
    and-int/2addr v0, p6

    if-eqz v0, :cond_3

    or-int/2addr v6, v2

    goto :goto_3

    :cond_3
    and-int/lit8 v7, p5, 0x30

    if-nez v7, :cond_5

    invoke-interface {p4, p1}, LT/l;->g(F)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_5
    :goto_3
    and-int/2addr v1, p6

    if-eqz v1, :cond_6

    or-int/lit16 v6, v6, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v7, p5, 0x180

    if-nez v7, :cond_8

    invoke-interface {p4, p2}, LT/l;->g(F)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_4

    :cond_7
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v6, v7

    :cond_8
    :goto_5
    and-int/lit8 v7, p6, 0x8

    if-eqz v7, :cond_9

    or-int/lit16 v6, v6, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v7, p5, 0xc00

    if-nez v7, :cond_b

    invoke-interface {p4, p3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_a

    const/16 v7, 0x800

    goto :goto_6

    :cond_a
    const/16 v7, 0x400

    :goto_6
    or-int/2addr v6, v7

    :cond_b
    :goto_7
    and-int/lit16 v7, v6, 0x493

    const/16 v8, 0x492

    if-ne v7, v8, :cond_e

    invoke-interface {p4}, LT/l;->v()Z

    move-result v7

    if-nez v7, :cond_c

    goto :goto_9

    :cond_c
    invoke-interface {p4}, LT/l;->C()V

    :cond_d
    :goto_8
    move-object v2, p0

    move v3, p1

    move v4, p2

    goto/16 :goto_c

    :cond_e
    :goto_9
    if-eqz v5, :cond_f

    sget-object p0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    :cond_f
    if-eqz v0, :cond_10

    const/16 p1, 0x2a

    int-to-float p1, p1

    invoke-static {p1}, LY0/h;->j(F)F

    move-result p1

    :cond_10
    if-eqz v1, :cond_11

    int-to-float p2, v3

    invoke-static {p2}, LY0/h;->j(F)F

    move-result p2

    :cond_11
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_12

    const/4 v0, -0x1

    const-string v1, "com.ui.wifiman.ui.component.network.NetworkConnectionProgress (NetworkConnectionProgress.kt:93)"

    invoke-static {v4, v6, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_12
    sget-object v0, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v0}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v0

    sget-object v1, Lz/c;->a:Lz/c;

    const/high16 v3, 0x3fc00000    # 1.5f

    mul-float/2addr v3, p2

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    invoke-virtual {v1, v3}, Lz/c;->n(F)Lz/c$f;

    move-result-object v1

    invoke-static {v1, v0, p4, v2}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p4, v1}, LT/j;->a(LT/l;I)I

    move-result v1

    invoke-interface {p4}, LT/l;->G()LT/x;

    move-result-object v3

    invoke-static {p4, p0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v4

    sget-object v5, LE0/g;->K:LE0/g$a;

    invoke-virtual {v5}, LE0/g$a;->a()Lmh/a;

    move-result-object v7

    invoke-interface {p4}, LT/l;->x()LT/f;

    move-result-object v8

    if-nez v8, :cond_13

    invoke-static {}, LT/j;->c()V

    :cond_13
    invoke-interface {p4}, LT/l;->u()V

    invoke-interface {p4}, LT/l;->o()Z

    move-result v8

    if-eqz v8, :cond_14

    invoke-interface {p4, v7}, LT/l;->D(Lmh/a;)V

    goto :goto_a

    :cond_14
    invoke-interface {p4}, LT/l;->I()V

    :goto_a
    invoke-static {p4}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v7

    invoke-virtual {v5}, LE0/g$a;->e()Lmh/p;

    move-result-object v8

    invoke-static {v7, v0, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v5}, LE0/g$a;->g()Lmh/p;

    move-result-object v0

    invoke-static {v7, v3, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v5}, LE0/g$a;->b()Lmh/p;

    move-result-object v0

    invoke-interface {v7}, LT/l;->o()Z

    move-result v3

    if-nez v3, :cond_15

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v3, v8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_16

    :cond_15
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v7, v3}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v7, v1, v0}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_16
    invoke-virtual {v5}, LE0/g$a;->f()Lmh/p;

    move-result-object v0

    invoke-static {v7, v4, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v0, Lz/Z;->a:Lz/Z;

    invoke-virtual {p3}, Lcom/ui/wifiman/ui/component/network/k;->a()Lcom/ui/wifiman/ui/component/network/i;

    move-result-object v0

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    shl-int/lit8 v3, v6, 0x3

    and-int/lit16 v3, v3, 0x380

    or-int/2addr v3, v2

    invoke-static {v0, v1, p1, p4, v3}, Lcom/ui/wifiman/ui/component/network/o;->e(Lcom/ui/wifiman/ui/component/network/i;Landroidx/compose/ui/e;FLT/l;I)V

    const v0, -0x10a1e556

    invoke-interface {p4, v0}, LT/l;->U(I)V

    invoke-virtual {p3}, Lcom/ui/wifiman/ui/component/network/k;->b()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_17

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ui/wifiman/ui/component/network/j;

    invoke-virtual {v1}, Lcom/ui/wifiman/ui/component/network/j;->a()Lcom/ui/wifiman/ui/component/network/h;

    move-result-object v4

    sget-object v5, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    and-int/lit16 v7, v6, 0x380

    or-int/2addr v7, v2

    invoke-static {v4, v5, p2, p4, v7}, Lcom/ui/wifiman/ui/component/network/o;->d(Lcom/ui/wifiman/ui/component/network/h;Landroidx/compose/ui/e;FLT/l;I)V

    invoke-virtual {v1}, Lcom/ui/wifiman/ui/component/network/j;->b()Lcom/ui/wifiman/ui/component/network/i;

    move-result-object v1

    invoke-static {v1, v5, p1, p4, v3}, Lcom/ui/wifiman/ui/component/network/o;->e(Lcom/ui/wifiman/ui/component/network/i;Landroidx/compose/ui/e;FLT/l;I)V

    goto :goto_b

    :cond_17
    invoke-interface {p4}, LT/l;->J()V

    invoke-interface {p4}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {}, LT/o;->P()V

    goto/16 :goto_8

    :goto_c
    invoke-interface {p4}, LT/l;->z()LT/X0;

    move-result-object p0

    if-eqz p0, :cond_18

    new-instance p1, Lcom/ui/wifiman/ui/component/network/l;

    move-object v1, p1

    move-object v5, p3

    move v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/ui/wifiman/ui/component/network/l;-><init>(Landroidx/compose/ui/e;FFLcom/ui/wifiman/ui/component/network/k;II)V

    invoke-interface {p0, p1}, LT/X0;->a(Lmh/p;)V

    :cond_18
    return-void
.end method

.method private static final i(Landroidx/compose/ui/e;FFLcom/ui/wifiman/ui/component/network/k;IILT/l;I)LYg/J;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, LT/L0;->a(I)I

    move-result v5

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p6

    move v6, p5

    invoke-static/range {v0 .. v6}, Lcom/ui/wifiman/ui/component/network/o;->h(Landroidx/compose/ui/e;FFLcom/ui/wifiman/ui/component/network/k;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
