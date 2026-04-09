.class public abstract LI9/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(LT/q0;Lmh/l;Z)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, LI9/d;->f(LT/q0;Lmh/l;Z)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;ZLmh/l;ZIILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p7}, LI9/d;->e(Landroidx/compose/ui/e;ZLmh/l;ZIILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ZLT/q0;LI9/e;FFLT/z1;Lo0/f;)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p6}, LI9/d;->g(ZLT/q0;LI9/e;FFLT/z1;Lo0/f;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/e;ZLmh/l;ZLT/l;II)V
    .locals 29

    move/from16 v9, p1

    move-object/from16 v10, p2

    move/from16 v11, p5

    const v0, 0xc24a361

    move-object/from16 v1, p4

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v12

    and-int/lit8 v1, p6, 0x1

    const/4 v2, 0x2

    if-eqz v1, :cond_0

    or-int/lit8 v3, v11, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v11, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-interface {v12, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    move v4, v2

    :goto_0
    or-int/2addr v4, v11

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v11

    :goto_1
    and-int/lit8 v5, p6, 0x2

    const/16 v6, 0x10

    const/16 v7, 0x20

    if-eqz v5, :cond_3

    or-int/lit8 v4, v4, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v5, v11, 0x30

    if-nez v5, :cond_5

    invoke-interface {v12, v9}, LT/l;->c(Z)Z

    move-result v5

    if-eqz v5, :cond_4

    move v5, v7

    goto :goto_2

    :cond_4
    move v5, v6

    :goto_2
    or-int/2addr v4, v5

    :cond_5
    :goto_3
    and-int/lit8 v5, p6, 0x4

    const/16 v13, 0x100

    if-eqz v5, :cond_6

    or-int/lit16 v4, v4, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v5, v11, 0x180

    if-nez v5, :cond_8

    invoke-interface {v12, v10}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    move v5, v13

    goto :goto_4

    :cond_7
    const/16 v5, 0x80

    :goto_4
    or-int/2addr v4, v5

    :cond_8
    :goto_5
    and-int/lit8 v5, p6, 0x8

    if-eqz v5, :cond_a

    or-int/lit16 v4, v4, 0xc00

    :cond_9
    move/from16 v8, p3

    :goto_6
    move v15, v4

    goto :goto_8

    :cond_a
    and-int/lit16 v8, v11, 0xc00

    if-nez v8, :cond_9

    move/from16 v8, p3

    invoke-interface {v12, v8}, LT/l;->c(Z)Z

    move-result v15

    if-eqz v15, :cond_b

    const/16 v15, 0x800

    goto :goto_7

    :cond_b
    const/16 v15, 0x400

    :goto_7
    or-int/2addr v4, v15

    goto :goto_6

    :goto_8
    and-int/lit16 v4, v15, 0x493

    const/16 v14, 0x492

    if-ne v4, v14, :cond_d

    invoke-interface {v12}, LT/l;->v()Z

    move-result v4

    if-nez v4, :cond_c

    goto :goto_9

    :cond_c
    invoke-interface {v12}, LT/l;->C()V

    move-object v1, v3

    move v4, v8

    goto/16 :goto_11

    :cond_d
    :goto_9
    if-eqz v1, :cond_e

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v14, v1

    goto :goto_a

    :cond_e
    move-object v14, v3

    :goto_a
    const/16 v16, 0x1

    if-eqz v5, :cond_f

    move/from16 v24, v16

    goto :goto_b

    :cond_f
    move/from16 v24, v8

    :goto_b
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_10

    const/4 v1, -0x1

    const-string/jumbo v3, "com.ui.core.ui.component.switch.UiToggle (UiSwitch.kt:63)"

    invoke-static {v0, v15, v1, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_10
    const/4 v0, 0x0

    invoke-static {v12, v0}, LI9/d;->h(LT/l;I)LI9/e;

    move-result-object v8

    const v1, 0x5aab05db

    invoke-interface {v12, v1}, LT/l;->U(I)V

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    sget-object v17, LT/l;->a:LT/l$a;

    invoke-virtual/range {v17 .. v17}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v1, v3, :cond_11

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v3, 0x0

    invoke-static {v1, v3, v2, v3}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v1

    invoke-interface {v12, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_11
    move-object v5, v1

    check-cast v5, LT/q0;

    invoke-interface {v12}, LT/l;->J()V

    int-to-float v1, v7

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v7

    const/16 v1, 0x38

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v4

    int-to-float v1, v2

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v2

    int-to-float v3, v6

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v21

    invoke-static/range {p1 .. p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-interface {v5, v3}, LT/q0;->setValue(Ljava/lang/Object;)V

    div-float v1, v7, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    sub-float/2addr v1, v2

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v22

    invoke-interface {v5}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_12

    const v1, 0x5aab4172

    invoke-interface {v12, v1}, LT/l;->U(I)V

    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object v1

    invoke-interface {v12, v1}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LY0/d;

    sub-float v3, v4, v22

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    sub-float/2addr v3, v2

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v2

    invoke-interface {v1, v2}, LY0/d;->d1(F)F

    move-result v1

    invoke-interface {v12}, LT/l;->J()V

    goto :goto_c

    :cond_12
    const v1, 0x5aab4fca

    invoke-interface {v12, v1}, LT/l;->U(I)V

    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object v1

    invoke-interface {v12, v1}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LY0/d;

    add-float v2, v22, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    invoke-interface {v1, v2}, LY0/d;->d1(F)F

    move-result v1

    invoke-interface {v12}, LT/l;->J()V

    :goto_c
    const/16 v18, 0x0

    const/16 v19, 0x1e

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/16 v20, 0x0

    move/from16 v25, v4

    move-object v4, v6

    move-object v6, v5

    move-object/from16 v5, v20

    move-object/from16 v26, v6

    move-object v6, v12

    move/from16 v27, v7

    move/from16 v7, v18

    move-object/from16 v28, v8

    move/from16 v8, v19

    invoke-static/range {v1 .. v8}, Lr/c;->d(FLr/i;FLjava/lang/String;Lmh/l;LT/l;II)LT/z1;

    move-result-object v8

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const-string/jumbo v2, "ui_switch"

    invoke-static {v1, v2, v9}, LM9/i;->h(Landroidx/compose/ui/e;Ljava/lang/String;Z)Landroidx/compose/ui/e;

    move-result-object v1

    const v2, 0x5aab7ac0

    invoke-interface {v12, v2}, LT/l;->U(I)V

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual/range {v17 .. v17}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_13

    invoke-static {}, Ly/l;->a()Ly/m;

    move-result-object v2

    invoke-interface {v12, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_13
    check-cast v2, Ly/m;

    invoke-interface {v12}, LT/l;->J()V

    const v3, 0x5aab843d

    invoke-interface {v12, v3}, LT/l;->U(I)V

    and-int/lit16 v3, v15, 0x380

    if-ne v3, v13, :cond_14

    move/from16 v3, v16

    goto :goto_d

    :cond_14
    move v3, v0

    :goto_d
    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_16

    invoke-virtual/range {v17 .. v17}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_15

    goto :goto_e

    :cond_15
    move-object/from16 v13, v26

    goto :goto_f

    :cond_16
    :goto_e
    new-instance v4, LI9/a;

    move-object/from16 v13, v26

    invoke-direct {v4, v13, v10}, LI9/a;-><init>(LT/q0;Lmh/l;)V

    invoke-interface {v12, v4}, LT/l;->K(Ljava/lang/Object;)V

    :goto_f
    move-object v6, v4

    check-cast v6, Lmh/l;

    invoke-interface {v12}, LT/l;->J()V

    const/16 v7, 0x10

    const/16 v18, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    move v4, v0

    move-object v0, v1

    move/from16 v1, p1

    move/from16 v4, v24

    move-object v9, v8

    move-object/from16 v8, v18

    invoke-static/range {v0 .. v8}, Landroidx/compose/foundation/selection/c;->b(Landroidx/compose/ui/e;ZLy/m;Ls/G;ZLJ0/g;Lmh/l;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    move/from16 v2, v25

    move/from16 v1, v27

    invoke-static {v0, v2, v1}, Landroidx/compose/foundation/layout/r;->p(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-interface {v0, v14}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    const v1, 0x5aabac52

    invoke-interface {v12, v1}, LT/l;->U(I)V

    and-int/lit16 v1, v15, 0x1c00

    const/16 v2, 0x800

    if-ne v1, v2, :cond_17

    move-object/from16 v1, v28

    goto :goto_10

    :cond_17
    move-object/from16 v1, v28

    const/16 v16, 0x0

    :goto_10
    invoke-interface {v12, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    or-int v2, v16, v2

    invoke-interface {v12, v9}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_18

    invoke-virtual/range {v17 .. v17}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_19

    :cond_18
    new-instance v3, LI9/b;

    move-object/from16 v17, v3

    move/from16 v18, v24

    move-object/from16 v19, v13

    move-object/from16 v20, v1

    move-object/from16 v23, v9

    invoke-direct/range {v17 .. v23}, LI9/b;-><init>(ZLT/q0;LI9/e;FFLT/z1;)V

    invoke-interface {v12, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_19
    check-cast v3, Lmh/l;

    invoke-interface {v12}, LT/l;->J()V

    const/4 v1, 0x0

    invoke-static {v0, v3, v12, v1}, Ls/i;->a(Landroidx/compose/ui/e;Lmh/l;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_1a

    invoke-static {}, LT/o;->P()V

    :cond_1a
    move-object v1, v14

    move/from16 v4, v24

    :goto_11
    invoke-interface {v12}, LT/l;->z()LT/X0;

    move-result-object v7

    if-eqz v7, :cond_1b

    new-instance v8, LI9/c;

    move-object v0, v8

    move/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, LI9/c;-><init>(Landroidx/compose/ui/e;ZLmh/l;ZII)V

    invoke-interface {v7, v8}, LT/X0;->a(Lmh/p;)V

    :cond_1b
    return-void
.end method

.method private static final e(Landroidx/compose/ui/e;ZLmh/l;ZIILT/l;I)LYg/J;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, LT/L0;->a(I)I

    move-result v5

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p6

    move v6, p5

    invoke-static/range {v0 .. v6}, LI9/d;->d(Landroidx/compose/ui/e;ZLmh/l;ZLT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final f(LT/q0;Lmh/l;Z)LYg/J;
    .locals 0

    invoke-interface {p0}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    xor-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-interface {p0, p2}, LT/q0;->setValue(Ljava/lang/Object;)V

    if-eqz p1, :cond_0

    invoke-interface {p0}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p1, p0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final g(ZLT/q0;LI9/e;FFLT/z1;Lo0/f;)LYg/J;
    .locals 16

    move/from16 v0, p3

    move-object/from16 v15, p6

    const-string v1, "$this$Canvas"

    invoke-static {v15, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_1

    invoke-interface/range {p1 .. p1}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual/range {p2 .. p2}, LI9/e;->b()J

    move-result-wide v1

    goto :goto_0

    :cond_0
    invoke-virtual/range {p2 .. p2}, LI9/e;->h()J

    move-result-wide v1

    goto :goto_0

    :cond_1
    invoke-interface/range {p1 .. p1}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual/range {p2 .. p2}, LI9/e;->d()J

    move-result-wide v1

    goto :goto_0

    :cond_2
    invoke-virtual/range {p2 .. p2}, LI9/e;->f()J

    move-result-wide v1

    :goto_0
    invoke-interface {v15, v0}, LY0/d;->d1(F)F

    move-result v3

    invoke-interface {v15, v0}, LY0/d;->d1(F)F

    move-result v0

    invoke-static {v3, v0}, Ll0/b;->a(FF)J

    move-result-wide v7

    const/16 v13, 0xf6

    const/4 v14, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v0, p6

    invoke-static/range {v0 .. v14}, Lo0/f;->b1(Lo0/f;JJJJLo0/g;FLm0/w0;IILjava/lang/Object;)V

    if-eqz p0, :cond_4

    invoke-interface/range {p1 .. p1}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual/range {p2 .. p2}, LI9/e;->a()J

    move-result-wide v0

    :goto_1
    move-wide v1, v0

    move/from16 v0, p4

    goto :goto_2

    :cond_3
    invoke-virtual/range {p2 .. p2}, LI9/e;->g()J

    move-result-wide v0

    goto :goto_1

    :cond_4
    invoke-interface/range {p1 .. p1}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual/range {p2 .. p2}, LI9/e;->c()J

    move-result-wide v0

    goto :goto_1

    :cond_5
    invoke-virtual/range {p2 .. p2}, LI9/e;->e()J

    move-result-wide v0

    goto :goto_1

    :goto_2
    invoke-interface {v15, v0}, LY0/d;->d1(F)F

    move-result v3

    invoke-interface/range {p5 .. p5}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-interface/range {p6 .. p6}, Lo0/f;->c()J

    move-result-wide v4

    invoke-static {v4, v5}, Ll0/m;->g(J)F

    move-result v4

    const/4 v5, 0x2

    int-to-float v5, v5

    div-float/2addr v4, v5

    invoke-static {v0, v4}, Ll0/h;->a(FF)J

    move-result-wide v4

    const/16 v10, 0x78

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v0, p6

    invoke-static/range {v0 .. v11}, Lo0/f;->P1(Lo0/f;JFJFLo0/g;Lm0/w0;IILjava/lang/Object;)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final h(LT/l;I)LI9/e;
    .locals 22

    move-object/from16 v0, p0

    const v1, 0xebbc91c

    invoke-interface {v0, v1}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, -0x1

    const-string/jumbo v3, "com.ui.core.ui.component.switch.rememberUiSwitchColors (UiSwitch.kt:38)"

    move/from16 v4, p1

    invoke-static {v1, v4, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object v1, Lla/a;->a:Lla/a;

    sget v2, Lla/a;->b:I

    invoke-virtual {v1, v0, v2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v1

    const v2, -0x4237d859

    invoke-interface {v0, v2}, LT/l;->U(I)V

    invoke-interface {v0, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface/range {p0 .. p0}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_1

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_2

    :cond_1
    new-instance v3, LI9/e;

    move-object v4, v3

    sget-object v2, Lma/a$d;->a:Lma/a$d;

    invoke-virtual {v2}, Lma/a$d;->a()Lma/a$a;

    move-result-object v5

    invoke-virtual {v5}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v5

    invoke-virtual {v5}, Lr9/a$b;->a()J

    move-result-wide v5

    invoke-virtual {v2}, Lma/a$d;->a()Lma/a$a;

    move-result-object v7

    invoke-virtual {v7}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v7

    invoke-virtual {v7}, Lr9/a$b;->a()J

    move-result-wide v7

    invoke-virtual {v2}, Lma/a$d;->a()Lma/a$a;

    move-result-object v9

    invoke-virtual {v9}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v9

    invoke-virtual {v9}, Lr9/a$b;->a()J

    move-result-wide v9

    invoke-virtual {v2}, Lma/a$d;->a()Lma/a$a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v2

    invoke-virtual {v2}, Lr9/a$b;->a()J

    move-result-wide v11

    invoke-virtual {v1}, Lma/a;->a()Lma/a$a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v2

    invoke-virtual {v2}, Lr9/a$a;->f()J

    move-result-wide v13

    invoke-virtual {v1}, Lma/a;->a()Lma/a$a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v2

    invoke-virtual {v2}, Lr9/a$a;->c()J

    move-result-wide v15

    invoke-virtual {v1}, Lma/a;->a()Lma/a$a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v2

    invoke-virtual {v2}, Lr9/a$b;->h()J

    move-result-wide v17

    invoke-virtual {v1}, Lma/a;->a()Lma/a$a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v1

    invoke-virtual {v1}, Lr9/a$b;->e()J

    move-result-wide v19

    const/16 v21, 0x0

    invoke-direct/range {v4 .. v21}, LI9/e;-><init>(JJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast v3, LI9/e;

    invoke-interface/range {p0 .. p0}, LT/l;->J()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    invoke-interface/range {p0 .. p0}, LT/l;->J()V

    return-object v3
.end method
