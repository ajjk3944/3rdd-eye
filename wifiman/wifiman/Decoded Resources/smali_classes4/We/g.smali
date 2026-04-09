.class public abstract LWe/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;LWe/b;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, LWe/g;->d(Landroidx/compose/ui/e;LWe/b;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;LWe/c;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, LWe/g;->f(Landroidx/compose/ui/e;LWe/c;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Landroidx/compose/ui/e;LWe/b;LT/l;II)V
    .locals 18

    move-object/from16 v0, p1

    move/from16 v1, p3

    move/from16 v2, p4

    const v3, -0x6d31337a

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LT/l;->r(I)LT/l;

    move-result-object v10

    and-int/lit8 v4, v2, 0x1

    if-eqz v4, :cond_0

    or-int/lit8 v5, v1, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v1, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-interface {v10, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v1

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v6, v1

    :goto_1
    and-int/lit8 v7, v2, 0x2

    if-eqz v7, :cond_3

    or-int/lit8 v6, v6, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v7, v1, 0x30

    if-nez v7, :cond_5

    invoke-interface {v10, v0}, LT/l;->T(Ljava/lang/Object;)Z

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
    and-int/lit8 v7, v6, 0x13

    const/16 v8, 0x12

    if-ne v7, v8, :cond_7

    invoke-interface {v10}, LT/l;->v()Z

    move-result v7

    if-nez v7, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {v10}, LT/l;->C()V

    goto/16 :goto_7

    :cond_7
    :goto_4
    if-eqz v4, :cond_8

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v11, v4

    goto :goto_5

    :cond_8
    move-object v11, v5

    :goto_5
    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_9

    const/4 v4, -0x1

    const-string v5, "com.ui.wifiman.ui.signal.floorplan.detail.FloorplanContainer (FloorplanDetailUi.kt:103)"

    invoke-static {v3, v6, v4, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_9
    sget-object v3, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v3}, Lf0/c$a;->o()Lf0/c;

    move-result-object v4

    const/4 v12, 0x0

    invoke-static {v4, v12}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v4

    invoke-static {v10, v12}, LT/j;->a(LT/l;I)I

    move-result v5

    invoke-interface {v10}, LT/l;->G()LT/x;

    move-result-object v6

    invoke-static {v10, v11}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v7

    sget-object v8, LE0/g;->K:LE0/g$a;

    invoke-virtual {v8}, LE0/g$a;->a()Lmh/a;

    move-result-object v9

    invoke-interface {v10}, LT/l;->x()LT/f;

    move-result-object v13

    if-nez v13, :cond_a

    invoke-static {}, LT/j;->c()V

    :cond_a
    invoke-interface {v10}, LT/l;->u()V

    invoke-interface {v10}, LT/l;->o()Z

    move-result v13

    if-eqz v13, :cond_b

    invoke-interface {v10, v9}, LT/l;->D(Lmh/a;)V

    goto :goto_6

    :cond_b
    invoke-interface {v10}, LT/l;->I()V

    :goto_6
    invoke-static {v10}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v9

    invoke-virtual {v8}, LE0/g$a;->e()Lmh/p;

    move-result-object v13

    invoke-static {v9, v4, v13}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v8}, LE0/g$a;->g()Lmh/p;

    move-result-object v4

    invoke-static {v9, v6, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v8}, LE0/g$a;->b()Lmh/p;

    move-result-object v4

    invoke-interface {v9}, LT/l;->o()Z

    move-result v6

    if-nez v6, :cond_c

    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v6, v13}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_d

    :cond_c
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v9, v6}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v9, v5, v4}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_d
    invoke-virtual {v8}, LE0/g$a;->f()Lmh/p;

    move-result-object v4

    invoke-static {v9, v7, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v13, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    sget-object v14, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v15, 0x0

    const/4 v9, 0x1

    const/4 v8, 0x0

    invoke-static {v14, v15, v9, v8}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, LWe/b;->a()LUe/g;

    move-result-object v5

    const/16 v16, 0x186

    const/16 v17, 0x0

    const/4 v6, 0x0

    move-object v7, v10

    move-object v12, v8

    move/from16 v8, v16

    move-object/from16 v16, v11

    move v11, v9

    move/from16 v9, v17

    invoke-static/range {v4 .. v9}, LUe/o;->h(Landroidx/compose/ui/e;LUe/g;ZLT/l;II)V

    invoke-static {v14, v15, v11, v12}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    sget-object v5, Lla/a;->a:Lla/a;

    sget v6, Lla/a;->b:I

    invoke-virtual {v5, v10, v6}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v7

    invoke-virtual {v7}, Lra/a;->a()Lra/b;

    move-result-object v7

    invoke-virtual {v7}, Lra/b;->a()Lra/b$a$a;

    move-result-object v7

    invoke-virtual {v7}, Lra/b$a$a;->c()F

    move-result v7

    invoke-virtual {v5, v10, v6}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v5

    invoke-virtual {v5}, Lra/a;->a()Lra/b;

    move-result-object v5

    invoke-virtual {v5}, Lra/b;->b()Lra/b$a$b;

    move-result-object v5

    invoke-virtual {v5}, Lra/b$a$b;->d()F

    move-result v5

    invoke-static {v4, v7, v5}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v4

    invoke-virtual {v3}, Lf0/c$a;->b()Lf0/c;

    move-result-object v3

    invoke-interface {v13, v4, v3}, Lz/d;->f(Landroidx/compose/ui/e;Lf0/c;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, LWe/b;->c()LTe/W;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v3, v4, v10, v5}, LTe/D;->n(Landroidx/compose/ui/e;LTe/W;LT/l;I)V

    invoke-interface {v10}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_e

    invoke-static {}, LT/o;->P()V

    :cond_e
    move-object/from16 v5, v16

    :goto_7
    invoke-interface {v10}, LT/l;->z()LT/X0;

    move-result-object v3

    if-eqz v3, :cond_f

    new-instance v4, LWe/e;

    invoke-direct {v4, v5, v0, v1, v2}, LWe/e;-><init>(Landroidx/compose/ui/e;LWe/b;II)V

    invoke-interface {v3, v4}, LT/X0;->a(Lmh/p;)V

    :cond_f
    return-void
.end method

.method private static final d(Landroidx/compose/ui/e;LWe/b;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, LWe/g;->c(Landroidx/compose/ui/e;LWe/b;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/e;LWe/c;LT/l;II)V
    .locals 10

    const v0, -0x1dc6f3e8

    invoke-interface {p2, v0}, LT/l;->r(I)LT/l;

    move-result-object p2

    and-int/lit8 v1, p4, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, p3, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_2

    invoke-interface {p2, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, p3

    goto :goto_1

    :cond_2
    move v2, p3

    :goto_1
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_4

    and-int/lit8 v3, p4, 0x2

    if-nez v3, :cond_3

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/16 v3, 0x20

    goto :goto_2

    :cond_3
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_4
    move v9, v2

    and-int/lit8 v2, v9, 0x13

    const/16 v3, 0x12

    if-ne v2, v3, :cond_6

    invoke-interface {p2}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_3

    :cond_5
    invoke-interface {p2}, LT/l;->C()V

    goto/16 :goto_7

    :cond_6
    :goto_3
    invoke-interface {p2}, LT/l;->q()V

    and-int/lit8 v2, p3, 0x1

    if-eqz v2, :cond_8

    invoke-interface {p2}, LT/l;->H()Z

    move-result v2

    if-eqz v2, :cond_7

    goto :goto_5

    :cond_7
    invoke-interface {p2}, LT/l;->C()V

    and-int/lit8 v1, p4, 0x2

    if-eqz v1, :cond_d

    :goto_4
    and-int/lit8 v9, v9, -0x71

    goto/16 :goto_6

    :cond_8
    :goto_5
    if-eqz v1, :cond_9

    sget-object p0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    :cond_9
    and-int/lit8 v1, p4, 0x2

    if-eqz v1, :cond_d

    const p1, -0x72e5f4af

    invoke-interface {p2, p1}, LT/l;->U(I)V

    sget-object p1, Lc2/a;->a:Lc2/a;

    sget v1, Lc2/a;->c:I

    invoke-virtual {p1, p2, v1}, Lc2/a;->a(LT/l;I)Landroidx/lifecycle/S;

    move-result-object v2

    if-eqz v2, :cond_c

    invoke-static {}, Lye/j;->c()LT/H0;

    move-result-object p1

    invoke-interface {p2, p1}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Landroidx/lifecycle/P$c;

    const/4 v7, 0x0

    const/16 v8, 0x10

    const-class v1, LWe/c;

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v6, p2

    invoke-static/range {v1 .. v8}, Lc2/c;->b(Ljava/lang/Class;Landroidx/lifecycle/S;Ljava/lang/String;Landroidx/lifecycle/P$c;Lb2/a;LT/l;II)Landroidx/lifecycle/N;

    move-result-object p1

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v1

    invoke-interface {p2, v1}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/o;

    invoke-static {}, Ld/c;->a()LT/H0;

    move-result-object v2

    invoke-interface {p2, v2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroidx/appcompat/app/c;

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v3

    invoke-interface {p2, v3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v3

    const v4, 0x318a4a49

    invoke-interface {p2, v4}, LT/l;->U(I)V

    invoke-interface {p2, p1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface {p2, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-interface {p2, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_a

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v5, v4, :cond_b

    :cond_a
    new-instance v5, Lye/i;

    invoke-direct {v5, p1, v1, v2}, Lye/i;-><init>(Landroidx/lifecycle/N;Landroidx/lifecycle/o;Landroidx/appcompat/app/c;)V

    invoke-interface {p2, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_b
    check-cast v5, Lmh/l;

    invoke-interface {p2}, LT/l;->J()V

    const/4 v1, 0x0

    invoke-static {v3, v5, p2, v1}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-interface {p2}, LT/l;->J()V

    check-cast p1, LWe/c;

    goto/16 :goto_4

    :cond_c
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_d
    :goto_6
    invoke-interface {p2}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_e

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.signal.floorplan.detail.FloorplanDetailUi (FloorplanDetailUi.kt:34)"

    invoke-static {v0, v9, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_e
    new-instance v0, LWe/g$a;

    invoke-direct {v0, p1, p0}, LWe/g$a;-><init>(LWe/c;Landroidx/compose/ui/e;)V

    const/16 v1, 0x36

    const v2, -0x63b68ffb

    const/4 v3, 0x1

    invoke-static {v2, v3, v0, p2, v1}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v3

    const/16 v5, 0x186

    const/4 v6, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    move-object v4, p2

    invoke-static/range {v1 .. v6}, Ltf/c;->b(ZLra/d;Lmh/p;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-static {}, LT/o;->P()V

    :cond_f
    :goto_7
    invoke-interface {p2}, LT/l;->z()LT/X0;

    move-result-object p2

    if-eqz p2, :cond_10

    new-instance v0, LWe/d;

    invoke-direct {v0, p0, p1, p3, p4}, LWe/d;-><init>(Landroidx/compose/ui/e;LWe/c;II)V

    invoke-interface {p2, v0}, LT/X0;->a(Lmh/p;)V

    :cond_10
    return-void
.end method

.method private static final f(Landroidx/compose/ui/e;LWe/c;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, LWe/g;->e(Landroidx/compose/ui/e;LWe/c;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final synthetic g(Landroidx/compose/ui/e;LWe/b;LT/l;II)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LWe/g;->c(Landroidx/compose/ui/e;LWe/b;LT/l;II)V

    return-void
.end method
