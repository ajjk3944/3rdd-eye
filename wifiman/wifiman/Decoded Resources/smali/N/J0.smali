.class public abstract LN/J0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final a(LN/H0;Landroidx/compose/ui/e;Lmh/q;LT/l;II)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v4, p4

    const/4 v0, 0x2

    const/4 v2, 0x4

    const/4 v5, 0x6

    const v6, 0x795cf2bd

    move-object/from16 v7, p3

    invoke-interface {v7, v6}, LT/l;->r(I)LT/l;

    move-result-object v7

    const/4 v8, 0x1

    and-int/lit8 v9, p5, 0x1

    if-eqz v9, :cond_0

    or-int/lit8 v9, v4, 0x6

    goto :goto_2

    :cond_0
    and-int/lit8 v9, v4, 0x6

    if-nez v9, :cond_3

    and-int/lit8 v9, v4, 0x8

    if-nez v9, :cond_1

    invoke-interface {v7, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v9

    goto :goto_0

    :cond_1
    invoke-interface {v7, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v9

    :goto_0
    if-eqz v9, :cond_2

    move v9, v2

    goto :goto_1

    :cond_2
    move v9, v0

    :goto_1
    or-int/2addr v9, v4

    goto :goto_2

    :cond_3
    move v9, v4

    :goto_2
    and-int/lit8 v0, p5, 0x2

    if-eqz v0, :cond_5

    or-int/lit8 v9, v9, 0x30

    :cond_4
    move-object/from16 v10, p1

    goto :goto_4

    :cond_5
    and-int/lit8 v10, v4, 0x30

    if-nez v10, :cond_4

    move-object/from16 v10, p1

    invoke-interface {v7, v10}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_6

    const/16 v11, 0x20

    goto :goto_3

    :cond_6
    const/16 v11, 0x10

    :goto_3
    or-int/2addr v9, v11

    :goto_4
    and-int/lit8 v2, p5, 0x4

    if-eqz v2, :cond_7

    or-int/lit16 v9, v9, 0x180

    goto :goto_6

    :cond_7
    and-int/lit16 v2, v4, 0x180

    if-nez v2, :cond_9

    invoke-interface {v7, v3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    const/16 v2, 0x100

    goto :goto_5

    :cond_8
    const/16 v2, 0x80

    :goto_5
    or-int/2addr v9, v2

    :cond_9
    :goto_6
    and-int/lit16 v2, v9, 0x93

    const/16 v11, 0x92

    if-ne v2, v11, :cond_c

    invoke-interface {v7}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_a

    goto :goto_8

    :cond_a
    invoke-interface {v7}, LT/l;->C()V

    :cond_b
    :goto_7
    move-object v2, v10

    goto/16 :goto_e

    :cond_c
    :goto_8
    if-eqz v0, :cond_d

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v10, v0

    :cond_d
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_e

    const/4 v0, -0x1

    const-string v2, "androidx.compose.material.FadeInFadeOutWithScale (SnackbarHost.kt:263)"

    invoke-static {v6, v9, v0, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_e
    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_f

    new-instance v0, LN/S;

    invoke-direct {v0}, LN/S;-><init>()V

    invoke-interface {v7, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_f
    check-cast v0, LN/S;

    invoke-virtual {v0}, LN/S;->a()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/16 v6, 0x36

    const/4 v9, 0x0

    if-nez v2, :cond_13

    const v2, 0x5ab654fa

    invoke-interface {v7, v2}, LT/l;->U(I)V

    invoke-virtual {v0, v1}, LN/S;->d(Ljava/lang/Object;)V

    invoke-virtual {v0}, LN/S;->b()Ljava/util/List;

    move-result-object v2

    new-instance v12, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v13

    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v13

    const/4 v14, 0x0

    :goto_9
    if-ge v14, v13, :cond_10

    invoke-interface {v2, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, LN/Q;

    invoke-virtual {v15}, LN/Q;->c()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v15}, Lf/d;->a(Ljava/lang/Object;)V

    invoke-interface {v12, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/2addr v14, v8

    goto :goto_9

    :cond_10
    invoke-static {v12}, LZg/v;->l1(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_11

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_11
    invoke-virtual {v0}, LN/S;->b()Ljava/util/List;

    move-result-object v12

    invoke-interface {v12}, Ljava/util/List;->clear()V

    invoke-static {v2}, La1/a;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v12

    invoke-virtual {v0}, LN/S;->b()Ljava/util/List;

    move-result-object v13

    check-cast v13, Ljava/util/Collection;

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v14

    const/4 v15, 0x0

    :goto_a
    if-ge v15, v14, :cond_12

    invoke-interface {v12, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Lf/d;->a(Ljava/lang/Object;)V

    new-instance v5, LN/Q;

    new-instance v11, LN/J0$a;

    invoke-direct {v11, v9, v1, v2, v0}, LN/J0$a;-><init>(LN/H0;LN/H0;Ljava/util/List;LN/S;)V

    const v1, 0x57ae4c82

    invoke-static {v1, v8, v11, v7, v6}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v1

    invoke-direct {v5, v9, v1}, LN/Q;-><init>(Ljava/lang/Object;Lmh/q;)V

    invoke-interface {v13, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/2addr v15, v8

    const/4 v5, 0x6

    move-object/from16 v1, p0

    goto :goto_a

    :cond_12
    check-cast v13, Ljava/util/List;

    invoke-interface {v7}, LT/l;->J()V

    goto :goto_b

    :cond_13
    const v1, 0x5ad76609

    invoke-interface {v7, v1}, LT/l;->U(I)V

    invoke-interface {v7}, LT/l;->J()V

    :goto_b
    sget-object v1, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v1}, Lf0/c$a;->o()Lf0/c;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v1

    invoke-static {v7, v2}, LT/j;->a(LT/l;I)I

    move-result v5

    invoke-interface {v7}, LT/l;->G()LT/x;

    move-result-object v2

    invoke-static {v7, v10}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v11

    sget-object v12, LE0/g;->K:LE0/g$a;

    invoke-virtual {v12}, LE0/g$a;->a()Lmh/a;

    move-result-object v13

    invoke-interface {v7}, LT/l;->x()LT/f;

    move-result-object v14

    if-nez v14, :cond_14

    invoke-static {}, LT/j;->c()V

    :cond_14
    invoke-interface {v7}, LT/l;->u()V

    invoke-interface {v7}, LT/l;->o()Z

    move-result v14

    if-eqz v14, :cond_15

    invoke-interface {v7, v13}, LT/l;->D(Lmh/a;)V

    goto :goto_c

    :cond_15
    invoke-interface {v7}, LT/l;->I()V

    :goto_c
    invoke-static {v7}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v13

    invoke-virtual {v12}, LE0/g$a;->e()Lmh/p;

    move-result-object v14

    invoke-static {v13, v1, v14}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v12}, LE0/g$a;->g()Lmh/p;

    move-result-object v1

    invoke-static {v13, v2, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v12}, LE0/g$a;->b()Lmh/p;

    move-result-object v1

    invoke-interface {v13}, LT/l;->o()Z

    move-result v2

    if-nez v2, :cond_16

    invoke-interface {v13}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v2, v14}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_17

    :cond_16
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v13, v2}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v13, v2, v1}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_17
    invoke-virtual {v12}, LE0/g$a;->f()Lmh/p;

    move-result-object v1

    invoke-static {v13, v11, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v1, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    const/4 v1, 0x0

    invoke-static {v7, v1}, LT/j;->b(LT/l;I)LT/J0;

    move-result-object v2

    invoke-virtual {v0, v2}, LN/S;->e(LT/J0;)V

    const v2, 0x6b5facd8

    invoke-interface {v7, v2}, LT/l;->U(I)V

    invoke-virtual {v0}, LN/S;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    move v11, v1

    :goto_d
    if-ge v11, v2, :cond_18

    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LN/Q;

    invoke-virtual {v1}, LN/Q;->a()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Lf/d;->a(Ljava/lang/Object;)V

    invoke-virtual {v1}, LN/Q;->b()Lmh/q;

    move-result-object v1

    const v5, 0x7e995040

    invoke-interface {v7, v5, v9}, LT/l;->s(ILjava/lang/Object;)V

    new-instance v5, LN/J0$b;

    invoke-direct {v5, v3, v9}, LN/J0$b;-><init>(Lmh/q;LN/H0;)V

    const v12, 0x79b62c7c

    invoke-static {v12, v8, v5, v7, v6}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v5

    const/4 v12, 0x6

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-interface {v1, v5, v7, v13}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v7}, LT/l;->N()V

    add-int/2addr v11, v8

    goto :goto_d

    :cond_18
    invoke-interface {v7}, LT/l;->J()V

    invoke-interface {v7}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {}, LT/o;->P()V

    goto/16 :goto_7

    :goto_e
    invoke-interface {v7}, LT/l;->z()LT/X0;

    move-result-object v6

    if-eqz v6, :cond_19

    new-instance v7, LN/J0$c;

    move-object v0, v7

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, LN/J0$c;-><init>(LN/H0;Landroidx/compose/ui/e;Lmh/q;II)V

    invoke-interface {v6, v7}, LT/X0;->a(Lmh/p;)V

    :cond_19
    return-void
.end method

.method public static final b(LN/K0;Landroidx/compose/ui/e;Lmh/q;LT/l;II)V
    .locals 7

    const v0, 0x19b0b9fc

    invoke-interface {p3, v0}, LT/l;->r(I)LT/l;

    move-result-object p3

    and-int/lit8 v1, p5, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, p4, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, p4, 0x6

    if-nez v1, :cond_2

    invoke-interface {p3, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p4

    goto :goto_1

    :cond_2
    move v1, p4

    :goto_1
    and-int/lit8 v2, p5, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v3, p4, 0x30

    if-nez v3, :cond_5

    invoke-interface {p3, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x20

    goto :goto_2

    :cond_4
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    :cond_5
    :goto_3
    and-int/lit8 v3, p5, 0x4

    if-eqz v3, :cond_6

    or-int/lit16 v1, v1, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v4, p4, 0x180

    if-nez v4, :cond_8

    invoke-interface {p3, p2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    const/16 v4, 0x100

    goto :goto_4

    :cond_7
    const/16 v4, 0x80

    :goto_4
    or-int/2addr v1, v4

    :cond_8
    :goto_5
    and-int/lit16 v4, v1, 0x93

    const/16 v5, 0x92

    if-ne v4, v5, :cond_b

    invoke-interface {p3}, LT/l;->v()Z

    move-result v4

    if-nez v4, :cond_9

    goto :goto_7

    :cond_9
    invoke-interface {p3}, LT/l;->C()V

    :cond_a
    :goto_6
    move-object v3, p1

    move-object v4, p2

    goto :goto_8

    :cond_b
    :goto_7
    if-eqz v2, :cond_c

    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    :cond_c
    if-eqz v3, :cond_d

    sget-object p2, LN/q;->a:LN/q;

    invoke-virtual {p2}, LN/q;->a()Lmh/q;

    move-result-object p2

    :cond_d
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_e

    const/4 v2, -0x1

    const-string v3, "androidx.compose.material.SnackbarHost (SnackbarHost.kt:157)"

    invoke-static {v0, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_e
    invoke-virtual {p0}, LN/K0;->a()LN/H0;

    invoke-static {}, Landroidx/compose/ui/platform/k0;->c()LT/H0;

    move-result-object v0

    invoke-interface {p3, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/platform/i;

    const/4 v2, 0x0

    invoke-interface {p3, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {p3, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_f

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_10

    :cond_f
    new-instance v4, LN/J0$d;

    invoke-direct {v4, v2, v0, v2}, LN/J0$d;-><init>(LN/H0;Landroidx/compose/ui/platform/i;Ldh/e;)V

    invoke-interface {p3, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_10
    check-cast v4, Lmh/p;

    const/4 v0, 0x0

    invoke-static {v2, v4, p3, v0}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-virtual {p0}, LN/K0;->a()LN/H0;

    and-int/lit16 v5, v1, 0x3f0

    const/4 v6, 0x0

    const/4 v1, 0x0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-static/range {v1 .. v6}, LN/J0;->a(LN/H0;Landroidx/compose/ui/e;Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, LT/o;->P()V

    goto :goto_6

    :goto_8
    invoke-interface {p3}, LT/l;->z()LT/X0;

    move-result-object p1

    if-eqz p1, :cond_11

    new-instance p2, LN/J0$e;

    move-object v1, p2

    move-object v2, p0

    move v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, LN/J0$e;-><init>(LN/K0;Landroidx/compose/ui/e;Lmh/q;II)V

    invoke-interface {p1, p2}, LT/X0;->a(Lmh/p;)V

    :cond_11
    return-void
.end method

.method public static final synthetic c(LN/H0;Landroidx/compose/ui/e;Lmh/q;LT/l;II)V
    .locals 0

    invoke-static/range {p0 .. p5}, LN/J0;->a(LN/H0;Landroidx/compose/ui/e;Lmh/q;LT/l;II)V

    return-void
.end method

.method public static final synthetic d(Lr/i;ZLmh/a;LT/l;II)LT/z1;
    .locals 0

    invoke-static/range {p0 .. p5}, LN/J0;->f(Lr/i;ZLmh/a;LT/l;II)LT/z1;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lr/i;ZLT/l;I)LT/z1;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LN/J0;->g(Lr/i;ZLT/l;I)LT/z1;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Lr/i;ZLmh/a;LT/l;II)LT/z1;
    .locals 7

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    sget-object p2, LN/J0$f;->a:LN/J0$f;

    :cond_0
    move-object v4, p2

    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    const/4 p2, -0x1

    const-string p5, "androidx.compose.material.animatedOpacity (SnackbarHost.kt:353)"

    const v0, 0x3c954f6f

    invoke-static {v0, p4, p2, p5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_1
    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object p2

    sget-object p5, LT/l;->a:LT/l$a;

    invoke-virtual {p5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne p2, v0, :cond_3

    const/4 p2, 0x0

    if-nez p1, :cond_2

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_2
    move v0, p2

    :goto_0
    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, p2, v1, v2}, Lr/b;->b(FFILjava/lang/Object;)Lr/a;

    move-result-object p2

    invoke-interface {p3, p2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    check-cast p2, Lr/a;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-interface {p3, p2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    and-int/lit8 v1, p4, 0x70

    xor-int/lit8 v1, v1, 0x30

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/16 v5, 0x20

    if-le v1, v5, :cond_4

    invoke-interface {p3, p1}, LT/l;->c(Z)Z

    move-result v1

    if-nez v1, :cond_5

    :cond_4
    and-int/lit8 v1, p4, 0x30

    if-ne v1, v5, :cond_6

    :cond_5
    move v1, v3

    goto :goto_1

    :cond_6
    move v1, v2

    :goto_1
    or-int/2addr v0, v1

    invoke-interface {p3, p0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    and-int/lit16 v1, p4, 0x380

    xor-int/lit16 v1, v1, 0x180

    const/16 v5, 0x100

    if-le v1, v5, :cond_7

    invoke-interface {p3, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    :cond_7
    and-int/lit16 v1, p4, 0x180

    if-ne v1, v5, :cond_9

    :cond_8
    move v2, v3

    :cond_9
    or-int/2addr v0, v2

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_a

    invoke-virtual {p5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p5

    if-ne v1, p5, :cond_b

    :cond_a
    new-instance p5, LN/J0$g;

    const/4 v5, 0x0

    move-object v0, p5

    move-object v1, p2

    move v2, p1

    move-object v3, p0

    invoke-direct/range {v0 .. v5}, LN/J0$g;-><init>(Lr/a;ZLr/i;Lmh/a;Ldh/e;)V

    invoke-interface {p3, p5}, LT/l;->K(Ljava/lang/Object;)V

    move-object v1, p5

    :cond_b
    check-cast v1, Lmh/p;

    shr-int/lit8 p0, p4, 0x3

    and-int/lit8 p0, p0, 0xe

    invoke-static {v6, v1, p3, p0}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-virtual {p2}, Lr/a;->g()LT/z1;

    move-result-object p0

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_c

    invoke-static {}, LT/o;->P()V

    :cond_c
    return-object p0
.end method

.method private static final g(Lr/i;ZLT/l;I)LT/z1;
    .locals 7

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material.animatedScale (SnackbarHost.kt:366)"

    const v2, 0x776b0f5c

    invoke-static {v2, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x0

    if-ne v0, v2, :cond_2

    if-nez p1, :cond_1

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_1
    const v0, 0x3f4ccccd    # 0.8f

    :goto_0
    const/4 v2, 0x0

    const/4 v4, 0x2

    invoke-static {v0, v2, v4, v3}, Lr/b;->b(FFILjava/lang/Object;)Lr/a;

    move-result-object v0

    invoke-interface {p2, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast v0, Lr/a;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {p2, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    and-int/lit8 v5, p3, 0x70

    xor-int/lit8 v5, v5, 0x30

    const/16 v6, 0x20

    if-le v5, v6, :cond_3

    invoke-interface {p2, p1}, LT/l;->c(Z)Z

    move-result v5

    if-nez v5, :cond_4

    :cond_3
    and-int/lit8 v5, p3, 0x30

    if-ne v5, v6, :cond_5

    :cond_4
    const/4 v5, 0x1

    goto :goto_1

    :cond_5
    const/4 v5, 0x0

    :goto_1
    or-int/2addr v4, v5

    invoke-interface {p2, p0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_6

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v5, v1, :cond_7

    :cond_6
    new-instance v5, LN/J0$h;

    invoke-direct {v5, v0, p1, p0, v3}, LN/J0$h;-><init>(Lr/a;ZLr/i;Ldh/e;)V

    invoke-interface {p2, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_7
    check-cast v5, Lmh/p;

    shr-int/lit8 p0, p3, 0x3

    and-int/lit8 p0, p0, 0xe

    invoke-static {v2, v5, p2, p0}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-virtual {v0}, Lr/a;->g()LT/z1;

    move-result-object p0

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-static {}, LT/o;->P()V

    :cond_8
    return-object p0
.end method
