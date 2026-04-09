.class public abstract Lda/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;Lda/u$a;Ljava/util/List;Lmh/a;LLi/g;ILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p7}, Lda/b;->c(Landroidx/compose/ui/e;Lda/u$a;Ljava/util/List;Lmh/a;LLi/g;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;Lda/u$a;Ljava/util/List;Lmh/a;LLi/g;LT/l;I)V
    .locals 67

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v12, p3

    move-object/from16 v13, p4

    move/from16 v14, p6

    const/16 v0, 0x30

    const-string/jumbo v5, "modifier"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v5, "passwordStrength"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v15, "suggestions"

    invoke-static {v3, v15}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v5, "onPasswordSuggestionsClicked"

    invoke-static {v12, v5}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v5, "showDialogEventFlow"

    invoke-static {v13, v5}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v5, 0x4c89eaf

    move-object/from16 v6, p5

    invoke-interface {v6, v5}, LT/l;->r(I)LT/l;

    move-result-object v11

    and-int/lit8 v6, v14, 0x6

    if-nez v6, :cond_1

    invoke-interface {v11, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    const/4 v6, 0x4

    goto :goto_0

    :cond_0
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v14

    goto :goto_1

    :cond_1
    move v6, v14

    :goto_1
    and-int/lit8 v9, v14, 0x30

    if-nez v9, :cond_3

    invoke-interface {v11, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    const/16 v9, 0x20

    goto :goto_2

    :cond_2
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v6, v9

    :cond_3
    and-int/lit16 v9, v14, 0x180

    if-nez v9, :cond_5

    invoke-interface {v11, v3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x100

    goto :goto_3

    :cond_4
    const/16 v9, 0x80

    :goto_3
    or-int/2addr v6, v9

    :cond_5
    and-int/lit16 v9, v14, 0xc00

    if-nez v9, :cond_7

    invoke-interface {v11, v12}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    const/16 v9, 0x800

    goto :goto_4

    :cond_6
    const/16 v9, 0x400

    :goto_4
    or-int/2addr v6, v9

    :cond_7
    and-int/lit16 v9, v14, 0x6000

    if-nez v9, :cond_9

    invoke-interface {v11, v13}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x4000

    goto :goto_5

    :cond_8
    const/16 v9, 0x2000

    :goto_5
    or-int/2addr v6, v9

    :cond_9
    move v10, v6

    and-int/lit16 v6, v10, 0x2493

    const/16 v9, 0x2492

    if-ne v6, v9, :cond_b

    invoke-interface {v11}, LT/l;->v()Z

    move-result v6

    if-nez v6, :cond_a

    goto :goto_6

    :cond_a
    invoke-interface {v11}, LT/l;->C()V

    move-object v8, v11

    goto/16 :goto_14

    :cond_b
    :goto_6
    invoke-static {}, LT/o;->H()Z

    move-result v6

    if-eqz v6, :cond_c

    const/4 v6, -0x1

    const-string/jumbo v9, "com.ui.core.ui.sso.register.PasswordStrengthComponent (PasswordStrengthComponent.kt:43)"

    invoke-static {v5, v10, v6, v9}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_c
    sget-object v5, Lz/c;->a:Lz/c;

    invoke-virtual {v5}, Lz/c;->e()Lz/c$f;

    move-result-object v6

    sget-object v9, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v9}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v7

    const/16 v0, 0x36

    invoke-static {v6, v7, v11, v0}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v11, v7}, LT/j;->a(LT/l;I)I

    move-result v17

    invoke-interface {v11}, LT/l;->G()LT/x;

    move-result-object v0

    invoke-static {v11, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v8

    sget-object v18, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->a()Lmh/a;

    move-result-object v4

    invoke-interface {v11}, LT/l;->x()LT/f;

    move-result-object v19

    if-nez v19, :cond_d

    invoke-static {}, LT/j;->c()V

    :cond_d
    invoke-interface {v11}, LT/l;->u()V

    invoke-interface {v11}, LT/l;->o()Z

    move-result v19

    if-eqz v19, :cond_e

    invoke-interface {v11, v4}, LT/l;->D(Lmh/a;)V

    goto :goto_7

    :cond_e
    invoke-interface {v11}, LT/l;->I()V

    :goto_7
    invoke-static {v11}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v4

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->e()Lmh/p;

    move-result-object v7

    invoke-static {v4, v6, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->g()Lmh/p;

    move-result-object v6

    invoke-static {v4, v0, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->b()Lmh/p;

    move-result-object v0

    invoke-interface {v4}, LT/l;->o()Z

    move-result v6

    if-nez v6, :cond_f

    invoke-interface {v4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_10

    :cond_f
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v4, v6}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v4, v6, v0}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_10
    invoke-virtual/range {v18 .. v18}, LE0/g$a;->f()Lmh/p;

    move-result-object v0

    invoke-static {v4, v8, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v0, Lz/Z;->a:Lz/Z;

    sget-object v0, Lda/u$a$a;->a:Lda/u$a$a;

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_14

    sget-object v4, Lda/u$a$f;->a:Lda/u$a$f;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_14

    instance-of v4, v2, Lda/u$a$e;

    if-nez v4, :cond_14

    instance-of v4, v2, Lda/u$a$g;

    if-nez v4, :cond_14

    instance-of v4, v2, Lda/u$a$d;

    if-eqz v4, :cond_11

    goto :goto_a

    :cond_11
    sget-object v4, Lda/u$a$b;->a:Lda/u$a$b;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_13

    sget-object v4, Lda/u$a$c;->a:Lda/u$a$c;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_12

    goto :goto_8

    :cond_12
    const v0, -0x69f61e50

    invoke-interface {v11, v0}, LT/l;->U(I)V

    invoke-interface {v11}, LT/l;->J()V

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_13
    :goto_8
    const v4, -0x69f5e912

    invoke-interface {v11, v4}, LT/l;->U(I)V

    sget-object v4, Lla/a;->a:Lla/a;

    sget v6, Lla/a;->b:I

    invoke-virtual {v4, v11, v6}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v4

    invoke-virtual {v4}, Lma/a;->a()Lma/a$a;

    move-result-object v4

    invoke-virtual {v4}, Lma/a$a;->d()Lr9/a$a;

    move-result-object v4

    invoke-virtual {v4}, Lr9/a$a;->f()J

    move-result-wide v6

    invoke-interface {v11}, LT/l;->J()V

    :goto_9
    move-wide/from16 v65, v6

    goto :goto_b

    :cond_14
    :goto_a
    const v4, -0x69f5f932

    invoke-interface {v11, v4}, LT/l;->U(I)V

    sget-object v4, Lla/a;->a:Lla/a;

    sget v6, Lla/a;->b:I

    invoke-virtual {v4, v11, v6}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v4

    invoke-virtual {v4}, Lma/a;->a()Lma/a$a;

    move-result-object v4

    invoke-virtual {v4}, Lma/a$a;->l()Lr9/a$a;

    move-result-object v4

    invoke-virtual {v4}, Lr9/a$a;->f()J

    move-result-wide v6

    invoke-interface {v11}, LT/l;->J()V

    goto :goto_9

    :goto_b
    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const-string/jumbo v4, "getString(...)"

    const/4 v8, 0x1

    const/4 v6, 0x0

    if-nez v0, :cond_18

    sget-object v0, Lda/u$a$f;->a:Lda/u$a$f;

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_15

    goto/16 :goto_d

    :cond_15
    instance-of v0, v2, Lda/u$a$e;

    if-nez v0, :cond_17

    instance-of v0, v2, Lda/u$a$g;

    if-nez v0, :cond_17

    instance-of v0, v2, Lda/u$a$d;

    if-nez v0, :cond_17

    sget-object v0, Lda/u$a$b;->a:Lda/u$a$b;

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_17

    sget-object v0, Lda/u$a$c;->a:Lda/u$a$c;

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_16

    goto :goto_c

    :cond_16
    const v0, -0x69f5e109

    invoke-interface {v11, v0}, LT/l;->U(I)V

    invoke-interface {v11}, LT/l;->J()V

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_17
    :goto_c
    const v0, 0x2b412df0

    invoke-interface {v11, v0}, LT/l;->U(I)V

    new-instance v0, LL0/d$a;

    const/4 v7, 0x0

    invoke-direct {v0, v7, v8, v6}, LL0/d$a;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v7, LL0/d;

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->g()LT/H0;

    move-result-object v8

    invoke-interface {v11, v8}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/content/Context;

    sget v6, LP9/b;->k0:I

    invoke-virtual {v8, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v24, 0x6

    const/16 v25, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v20, v7

    move-object/from16 v21, v6

    invoke-direct/range {v20 .. v25}, LL0/d;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v7}, LL0/d$a;->g(LL0/d;)V

    const-string v4, " "

    invoke-virtual {v0, v4}, LL0/d$a;->i(Ljava/lang/String;)V

    const/4 v4, 0x3

    shr-int/lit8 v6, v10, 0x3

    and-int/lit8 v4, v6, 0xe

    invoke-static {v2, v11, v4}, Lda/b;->f(Lda/u$a;LT/l;I)Ljava/lang/String;

    move-result-object v4

    new-instance v6, LL0/D;

    move-object/from16 v42, v6

    const v63, 0xfffe

    const/16 v64, 0x0

    const-wide/16 v45, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const-wide/16 v52, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const-wide/16 v57, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    move-wide/from16 v43, v65

    invoke-direct/range {v42 .. v64}, LL0/D;-><init>(JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;LL0/A;Lo0/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v7, 0x4

    const/4 v8, 0x0

    invoke-static {v4, v6, v8, v7, v8}, LL0/e;->b(Ljava/lang/String;LL0/D;LL0/v;ILjava/lang/Object;)LL0/d;

    move-result-object v4

    invoke-virtual {v0, v4}, LL0/d$a;->g(LL0/d;)V

    invoke-virtual {v0}, LL0/d$a;->p()LL0/d;

    move-result-object v0

    invoke-interface {v11}, LT/l;->J()V

    goto :goto_e

    :cond_18
    :goto_d
    const v0, 0x2b3b3d3e

    invoke-interface {v11, v0}, LT/l;->U(I)V

    new-instance v0, LL0/d;

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->g()LT/H0;

    move-result-object v6

    invoke-interface {v11, v6}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/content/Context;

    sget v7, LP9/b;->j0:I

    invoke-virtual {v6, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v24, 0x6

    const/16 v25, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v20, v0

    move-object/from16 v21, v6

    invoke-direct/range {v20 .. v25}, LL0/d;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v11}, LT/l;->J()V

    :goto_e
    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 v6, 0x14

    int-to-float v6, v6

    invoke-static {v6}, LY0/h;->j(F)F

    move-result v7

    const/4 v8, 0x0

    const/4 v1, 0x1

    const/4 v12, 0x0

    invoke-static {v4, v8, v7, v1, v12}, Landroidx/compose/foundation/layout/r;->b(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v7

    const/4 v1, 0x0

    const/4 v8, 0x3

    invoke-static {v7, v12, v1, v8, v12}, Landroidx/compose/foundation/layout/r;->F(Landroidx/compose/ui/e;Lf0/c;ZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v7

    invoke-virtual {v9}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v8

    invoke-virtual {v5}, Lz/c;->f()Lz/c$e;

    move-result-object v5

    const/16 v9, 0x30

    invoke-static {v5, v8, v11, v9}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v5

    invoke-static {v11, v1}, LT/j;->a(LT/l;I)I

    move-result v8

    invoke-interface {v11}, LT/l;->G()LT/x;

    move-result-object v1

    invoke-static {v11, v7}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v7

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->a()Lmh/a;

    move-result-object v9

    invoke-interface {v11}, LT/l;->x()LT/f;

    move-result-object v12

    if-nez v12, :cond_19

    invoke-static {}, LT/j;->c()V

    :cond_19
    invoke-interface {v11}, LT/l;->u()V

    invoke-interface {v11}, LT/l;->o()Z

    move-result v12

    if-eqz v12, :cond_1a

    invoke-interface {v11, v9}, LT/l;->D(Lmh/a;)V

    goto :goto_f

    :cond_1a
    invoke-interface {v11}, LT/l;->I()V

    :goto_f
    invoke-static {v11}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v9

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->e()Lmh/p;

    move-result-object v12

    invoke-static {v9, v5, v12}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->g()Lmh/p;

    move-result-object v5

    invoke-static {v9, v1, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->b()Lmh/p;

    move-result-object v1

    invoke-interface {v9}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_1b

    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v5, v12}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1c

    :cond_1b
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v9, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v9, v5, v1}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_1c
    invoke-virtual/range {v18 .. v18}, LE0/g$a;->f()Lmh/p;

    move-result-object v1

    invoke-static {v9, v7, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    const/4 v1, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x3

    invoke-static {v4, v5, v1, v7, v5}, Landroidx/compose/foundation/layout/r;->F(Landroidx/compose/ui/e;Lf0/c;ZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v17

    sget-object v1, Lla/a;->a:Lla/a;

    sget v4, Lla/a;->b:I

    invoke-virtual {v1, v11, v4}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v5

    invoke-virtual {v5}, Lma/a;->f()Lma/a$f;

    move-result-object v5

    invoke-virtual {v5}, Lma/a$f;->c()J

    move-result-wide v18

    invoke-virtual {v1, v11, v4}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v1

    invoke-virtual {v1}, Lpa/c;->b()Lpa/b;

    move-result-object v1

    invoke-virtual {v1}, Lpa/b;->f()LL0/U;

    move-result-object v37

    const/16 v40, 0x0

    const v41, 0x1fff8

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const-wide/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v39, 0x30

    move-object/from16 v16, v0

    move-object/from16 v38, v11

    invoke-static/range {v16 .. v41}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    const v0, 0x21c670e1

    invoke-interface {v11, v0}, LT/l;->U(I)V

    move-object v0, v3

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_1e

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1e

    :cond_1d
    move/from16 v29, v10

    move-object v8, v11

    const/16 v28, 0x0

    goto/16 :goto_10

    :cond_1e
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1f

    new-instance v0, Ls9/c$a;

    sget v1, LN9/a;->K2:I

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-direct {v0, v1, v5, v4, v5}, Ls9/c$a;-><init>(ILs9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v16, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v1, 0x4

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v17

    const/16 v21, 0xe

    const/16 v22, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v6}, LY0/h;->j(F)F

    move-result v4

    invoke-static {v1, v4}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v4

    invoke-static {}, Ly/l;->a()Ly/m;

    move-result-object v5

    const/16 v1, 0xf

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v6

    const/4 v7, 0x3

    shl-int/lit8 v1, v10, 0x3

    const v7, 0xe000

    and-int/2addr v1, v7

    or-int/lit16 v1, v1, 0x186

    const/4 v12, 0x4

    const/4 v7, 0x0

    const/4 v9, 0x1

    const/16 v28, 0x0

    move-object/from16 v8, p3

    move-object v9, v11

    move/from16 v29, v10

    move v10, v1

    move-object v1, v11

    move v11, v12

    invoke-static/range {v4 .. v11}, LM9/i;->f(Landroidx/compose/ui/e;Ly/m;FZLmh/a;LT/l;II)Landroidx/compose/ui/e;

    move-result-object v17

    sget-object v4, Lm0/w0;->b:Lm0/w0$a;

    sget-object v5, Lla/a;->a:Lla/a;

    sget v6, Lla/a;->b:I

    invoke-virtual {v5, v1, v6}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v5

    invoke-virtual {v5}, Lma/a;->a()Lma/a$a;

    move-result-object v5

    invoke-virtual {v5}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v5

    invoke-virtual {v5}, Lr9/a$a;->f()J

    move-result-wide v5

    const/4 v8, 0x2

    const/4 v9, 0x0

    invoke-static/range {v4 .. v9}, Lm0/w0$a;->b(Lm0/w0$a;JIILjava/lang/Object;)Lm0/w0;

    move-result-object v24

    const/16 v26, 0x0

    const/16 v27, 0x7e

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    move-object/from16 v16, v0

    move-object/from16 v25, v1

    invoke-static/range {v16 .. v27}, Lta/c;->e(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;Lf0/c;LC0/h;FLm0/w0;LT/l;II)V

    move-object v8, v1

    :goto_10
    invoke-interface {v8}, LT/l;->J()V

    invoke-interface {v8}, LT/l;->R()V

    sget-object v0, Lda/u$a$a;->a:Lda/u$a$a;

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_26

    sget-object v0, Lda/u$a$f;->a:Lda/u$a$f;

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_20

    goto :goto_12

    :cond_20
    instance-of v0, v2, Lda/u$a$e;

    if-eqz v0, :cond_21

    const v0, 0x3e4ccccd    # 0.2f

    :goto_11
    move/from16 v16, v0

    goto :goto_13

    :cond_21
    instance-of v0, v2, Lda/u$a$g;

    if-eqz v0, :cond_22

    const v0, 0x3e99999a    # 0.3f

    goto :goto_11

    :cond_22
    instance-of v0, v2, Lda/u$a$d;

    if-eqz v0, :cond_23

    const/high16 v0, 0x3f000000    # 0.5f

    goto :goto_11

    :cond_23
    sget-object v0, Lda/u$a$b;->a:Lda/u$a$b;

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_24

    const/high16 v0, 0x3f400000    # 0.75f

    goto :goto_11

    :cond_24
    sget-object v0, Lda/u$a$c;->a:Lda/u$a$c;

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_25

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_11

    :cond_25
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_26
    :goto_12
    move/from16 v16, v28

    :goto_13
    const/16 v22, 0xc00

    const/16 v23, 0x16

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-string/jumbo v19, "password strength"

    const/16 v20, 0x0

    move-object/from16 v21, v8

    invoke-static/range {v16 .. v23}, Lr/c;->d(FLr/i;FLjava/lang/String;Lmh/l;LT/l;II)LT/z1;

    move-result-object v0

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v16

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 v1, 0x50

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/r;->z(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v0

    const/16 v1, 0x8

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v17

    sget-object v0, Lla/a;->a:Lla/a;

    sget v1, Lla/a;->b:I

    invoke-virtual {v0, v8, v1}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a;->a()Lma/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v0

    invoke-virtual {v0}, Lr9/a$b;->f()J

    move-result-wide v20

    sget-object v0, Lm0/k1;->a:Lm0/k1$a;

    invoke-virtual {v0}, Lm0/k1$a;->b()I

    move-result v22

    const/16 v24, 0x30

    const/16 v25, 0x0

    move-wide/from16 v18, v65

    move-object/from16 v23, v8

    invoke-static/range {v16 .. v25}, LN/t0;->g(FLandroidx/compose/ui/e;JJILT/l;II)V

    invoke-interface {v8}, LT/l;->R()V

    new-instance v0, Lda/b$a;

    invoke-direct {v0, v2, v3}, Lda/b$a;-><init>(Lda/u$a;Ljava/util/List;)V

    const v1, 0x2fafaaae

    const/16 v4, 0x36

    const/4 v5, 0x1

    invoke-static {v1, v5, v0, v8, v4}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v0

    shr-int/lit8 v1, v29, 0xc

    and-int/lit8 v1, v1, 0xe

    or-int/lit16 v1, v1, 0x1b0

    invoke-static {v13, v15, v0, v8, v1}, Ly9/s;->c(LLi/g;Ljava/lang/Object;Lmh/r;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_27

    invoke-static {}, LT/o;->P()V

    :cond_27
    :goto_14
    invoke-interface {v8}, LT/l;->z()LT/X0;

    move-result-object v7

    if-eqz v7, :cond_28

    new-instance v8, Lda/a;

    move-object v0, v8

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Lda/a;-><init>(Landroidx/compose/ui/e;Lda/u$a;Ljava/util/List;Lmh/a;LLi/g;I)V

    invoke-interface {v7, v8}, LT/X0;->a(Lmh/p;)V

    :cond_28
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;Lda/u$a;Ljava/util/List;Lmh/a;LLi/g;ILT/l;I)LYg/J;
    .locals 7

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, LT/L0;->a(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p6

    invoke-static/range {v0 .. v6}, Lda/b;->b(Landroidx/compose/ui/e;Lda/u$a;Ljava/util/List;Lmh/a;LLi/g;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final synthetic d(Lda/u$a;LT/l;I)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1, p2}, Lda/b;->f(Lda/u$a;LT/l;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Ljava/util/List;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lda/b;->g(Ljava/util/List;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Lda/u$a;LT/l;I)Ljava/lang/String;
    .locals 3

    const v0, -0x40fb51f3

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string/jumbo v2, "com.ui.core.ui.sso.register.getPasswordStrengthString (PasswordStrengthComponent.kt:168)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->g()LT/H0;

    move-result-object p2

    invoke-interface {p1, p2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/content/Context;

    sget-object v0, Lda/u$a$a;->a:Lda/u$a$a;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget p0, LP9/b;->m0:I

    goto :goto_0

    :cond_1
    sget-object v0, Lda/u$a$f;->a:Lda/u$a$f;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget p0, LP9/b;->r0:I

    goto :goto_0

    :cond_2
    sget-object v0, Lda/u$a$b;->a:Lda/u$a$b;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget p0, LP9/b;->n0:I

    goto :goto_0

    :cond_3
    sget-object v0, Lda/u$a$c;->a:Lda/u$a$c;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget p0, LP9/b;->o0:I

    goto :goto_0

    :cond_4
    instance-of v0, p0, Lda/u$a$d;

    if-eqz v0, :cond_5

    sget p0, LP9/b;->p0:I

    goto :goto_0

    :cond_5
    instance-of v0, p0, Lda/u$a$e;

    if-eqz v0, :cond_6

    sget p0, LP9/b;->q0:I

    goto :goto_0

    :cond_6
    instance-of p0, p0, Lda/u$a$g;

    if-eqz p0, :cond_8

    sget p0, LP9/b;->s0:I

    :goto_0
    invoke-virtual {p2, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    const-string/jumbo p2, "getString(...)"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    invoke-interface {p1}, LT/l;->J()V

    return-object p0

    :cond_8
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final g(Ljava/util/List;)Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "\u2022 "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string/jumbo v0, "toString(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
