.class public abstract Laf/N;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;Laf/I;Lmh/l;ILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, Laf/N;->c(Landroidx/compose/ui/e;Laf/I;Lmh/l;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;Laf/I;Lmh/l;LT/l;I)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p4

    const-string v4, "modifier"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "model"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onPermissionsActionClicked"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v4, 0x626c7dbf

    move-object/from16 v5, p3

    invoke-interface {v5, v4}, LT/l;->r(I)LT/l;

    move-result-object v15

    and-int/lit8 v5, v3, 0x6

    const/4 v6, 0x2

    if-nez v5, :cond_1

    invoke-interface {v15, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    move v5, v6

    :goto_0
    or-int/2addr v5, v3

    goto :goto_1

    :cond_1
    move v5, v3

    :goto_1
    and-int/lit8 v7, v3, 0x30

    if-nez v7, :cond_3

    invoke-interface {v15, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v5, v7

    :cond_3
    and-int/lit16 v7, v3, 0x180

    if-nez v7, :cond_5

    invoke-interface {v15, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v5, v7

    :cond_5
    and-int/lit16 v7, v5, 0x93

    const/16 v8, 0x92

    if-ne v7, v8, :cond_7

    invoke-interface {v15}, LT/l;->v()Z

    move-result v7

    if-nez v7, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {v15}, LT/l;->C()V

    goto/16 :goto_7

    :cond_7
    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result v7

    if-eqz v7, :cond_8

    const/4 v7, -0x1

    const-string v8, "com.ui.wifiman.ui.speed.component.SpeedTabPermissionCardUi (SpeedTabPermissionCardUi.kt:27)"

    invoke-static {v4, v5, v7, v8}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_8
    sget-object v4, Lla/a;->a:Lla/a;

    sget v5, Lla/a;->b:I

    invoke-virtual {v4, v15, v5}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v4

    invoke-virtual {v4}, Lra/a;->a()Lra/b;

    move-result-object v4

    invoke-virtual {v4}, Lra/b;->a()Lra/b$a$a;

    move-result-object v4

    invoke-virtual {v4}, Lra/b$a$a;->c()F

    move-result v4

    const/4 v14, 0x0

    const/4 v13, 0x0

    invoke-static {v0, v4, v14, v6, v13}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    const/4 v5, 0x3

    invoke-static {v4, v13, v13, v5, v13}, Landroidx/compose/animation/f;->b(Landroidx/compose/ui/e;Lr/H;Lmh/p;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    sget-object v5, Lz/c;->a:Lz/c;

    const/16 v6, 0x8

    int-to-float v6, v6

    invoke-static {v6}, LY0/h;->j(F)F

    move-result v6

    invoke-virtual {v5, v6}, Lz/c;->n(F)Lz/c$f;

    move-result-object v5

    sget-object v6, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v6}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v6

    const/4 v7, 0x6

    invoke-static {v5, v6, v15, v7}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v15, v6}, LT/j;->a(LT/l;I)I

    move-result v6

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v7

    invoke-static {v15, v4}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v4

    sget-object v8, LE0/g;->K:LE0/g$a;

    invoke-virtual {v8}, LE0/g$a;->a()Lmh/a;

    move-result-object v9

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v10

    if-nez v10, :cond_9

    invoke-static {}, LT/j;->c()V

    :cond_9
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v10

    if-eqz v10, :cond_a

    invoke-interface {v15, v9}, LT/l;->D(Lmh/a;)V

    goto :goto_5

    :cond_a
    invoke-interface {v15}, LT/l;->I()V

    :goto_5
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v9

    invoke-virtual {v8}, LE0/g$a;->e()Lmh/p;

    move-result-object v10

    invoke-static {v9, v5, v10}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v8}, LE0/g$a;->g()Lmh/p;

    move-result-object v5

    invoke-static {v9, v7, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v8}, LE0/g$a;->b()Lmh/p;

    move-result-object v5

    invoke-interface {v9}, LT/l;->o()Z

    move-result v7

    if-nez v7, :cond_b

    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_c

    :cond_b
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v9, v7}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v9, v6, v5}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_c
    invoke-virtual {v8}, LE0/g$a;->f()Lmh/p;

    move-result-object v5

    invoke-static {v9, v4, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v4, Lz/k;->a:Lz/k;

    invoke-virtual/range {p1 .. p1}, Laf/I;->a()Ljava/util/List;

    move-result-object v12

    const v5, 0x7ba60af5

    invoke-interface {v15, v5}, LT/l;->U(I)V

    invoke-static {}, Laf/J;->getEntries()Lfh/a;

    move-result-object v5

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_6
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Laf/J;

    sget-object v6, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v7, 0x1

    invoke-static {v6, v14, v7, v13}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v8

    invoke-interface {v12, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    new-instance v9, Laf/N$a;

    invoke-direct {v9, v5, v2}, Laf/N$a;-><init>(Laf/J;Lmh/l;)V

    const/16 v5, 0x36

    const v10, -0x20d08f14

    invoke-static {v10, v7, v9, v15, v5}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v11

    const v17, 0x180186

    const/16 v18, 0x1c

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v19, 0x0

    move-object v5, v4

    move-object v7, v8

    move-object v8, v9

    move-object v9, v10

    move-object/from16 v10, v19

    move-object/from16 v19, v12

    move-object v12, v15

    move-object/from16 v20, v13

    move/from16 v13, v17

    move/from16 v17, v14

    move/from16 v14, v18

    invoke-static/range {v5 .. v14}, Lq/d;->d(Lz/j;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    move/from16 v14, v17

    move-object/from16 v12, v19

    move-object/from16 v13, v20

    goto :goto_6

    :cond_d
    invoke-interface {v15}, LT/l;->J()V

    invoke-interface {v15}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_e

    invoke-static {}, LT/o;->P()V

    :cond_e
    :goto_7
    invoke-interface {v15}, LT/l;->z()LT/X0;

    move-result-object v4

    if-eqz v4, :cond_f

    new-instance v5, Laf/K;

    invoke-direct {v5, v0, v1, v2, v3}, Laf/K;-><init>(Landroidx/compose/ui/e;Laf/I;Lmh/l;I)V

    invoke-interface {v4, v5}, LT/X0;->a(Lmh/p;)V

    :cond_f
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;Laf/I;Lmh/l;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, LT/L0;->a(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Laf/N;->b(Landroidx/compose/ui/e;Laf/I;Lmh/l;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
