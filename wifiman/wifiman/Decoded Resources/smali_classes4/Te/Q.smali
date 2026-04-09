.class public abstract LTe/Q;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;LTe/J;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LTe/Q;->d(Landroidx/compose/ui/e;LTe/J;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lma/a;LTe/h;Lmh/p;LTe/H;)Lm0/l0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LTe/Q;->i(Lma/a;LTe/h;Lmh/p;LTe/H;)Lm0/l0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/e;LTe/J;LT/l;I)V
    .locals 41

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "modifier"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "model"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, -0x2d0777bd

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LT/l;->r(I)LT/l;

    move-result-object v15

    and-int/lit8 v4, v2, 0x6

    const/4 v14, 0x2

    if-nez v4, :cond_1

    invoke-interface {v15, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    move v4, v14

    :goto_0
    or-int/2addr v4, v2

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    and-int/lit8 v5, v2, 0x30

    if-nez v5, :cond_3

    invoke-interface {v15, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_3
    move v13, v4

    and-int/lit8 v4, v13, 0x13

    const/16 v5, 0x12

    if-ne v4, v5, :cond_5

    invoke-interface {v15}, LT/l;->v()Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v15}, LT/l;->C()V

    move-object v2, v15

    goto/16 :goto_b

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_6

    const/4 v4, -0x1

    const-string v5, "com.ui.wifiman.ui.signal.components.SignalMapperChart (SignalChart.kt:170)"

    invoke-static {v3, v13, v4, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1a

    const/4 v11, 0x0

    if-le v3, v4, :cond_7

    const v3, 0x52427fb5

    invoke-interface {v15, v3}, LT/l;->U(I)V

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->g()LT/H0;

    move-result-object v3

    invoke-interface {v15, v3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lm8/b;->a:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getFont(I)Landroid/graphics/Typeface;

    move-result-object v3

    invoke-interface {v15}, LT/l;->J()V

    goto :goto_4

    :cond_7
    const v3, 0x5243c28b

    invoke-interface {v15, v3}, LT/l;->U(I)V

    invoke-static {v15, v11}, LW5/b;->a(LT/l;I)LW5/a;

    move-result-object v3

    invoke-virtual {v3}, LW5/a;->a()LW5/a$a;

    move-result-object v3

    invoke-virtual {v3}, LW5/a$a;->h()Landroid/graphics/Typeface;

    move-result-object v3

    invoke-interface {v15}, LT/l;->J()V

    :goto_4
    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, LTe/J;->f()LTe/M;

    move-result-object v4

    invoke-static {v4, v15, v11}, LTe/Q;->j(LTe/M;LT/l;I)LTe/h;

    move-result-object v12

    invoke-static {v12, v15, v11}, LTe/Q;->h(LTe/h;LT/l;I)LTe/g;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, LTe/g;->a()J

    move-result-wide v4

    const/4 v6, 0x1

    int-to-float v6, v6

    invoke-static {v6}, LY0/h;->j(F)F

    move-result v6

    const/high16 v7, 0x3f000000    # 0.5f

    invoke-static {v7}, LE/h;->a(F)LE/g;

    move-result-object v7

    const/16 v16, 0x30

    const/16 v17, 0x78

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v18, 0x0

    move-object/from16 v22, v12

    move-wide/from16 v11, v18

    move/from16 v23, v13

    move-object v13, v15

    move/from16 v14, v16

    move-object v2, v15

    move/from16 v15, v17

    invoke-static/range {v4 .. v15}, LP5/a;->a(JFLm0/i1;Lr6/b;Lw6/b;FJLT/l;II)Lo6/b;

    move-result-object v24

    const v4, -0x59a8b9f

    invoke-interface {v2, v4}, LT/l;->U(I)V

    invoke-interface {v2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    sget-object v25, LT/l;->a:LT/l$a;

    invoke-virtual/range {v25 .. v25}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    const/4 v6, 0x0

    if-ne v4, v5, :cond_8

    const/4 v5, 0x2

    invoke-static {v6, v6, v5, v6}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v4

    invoke-interface {v2, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
    check-cast v4, LT/q0;

    invoke-interface {v2}, LT/l;->J()V

    invoke-interface {v4}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, LTe/J;->d()Lgc/b;

    move-result-object v7

    if-eq v5, v7, :cond_b

    const v5, 0x524b6cbf

    invoke-interface {v2, v5}, LT/l;->U(I)V

    invoke-virtual/range {p1 .. p1}, LTe/J;->d()Lgc/b;

    move-result-object v5

    invoke-interface {v4, v5}, LT/q0;->setValue(Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, LTe/J;->f()LTe/M;

    move-result-object v4

    const v5, -0x59a7084

    invoke-interface {v2, v5}, LT/l;->U(I)V

    invoke-interface {v2, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface {v2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_9

    invoke-virtual/range {v25 .. v25}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v5, v4, :cond_a

    :cond_9
    invoke-virtual/range {v22 .. v22}, LTe/h;->d()Lsh/i;

    move-result-object v4

    invoke-virtual {v4}, Lsh/g;->j()I

    move-result v4

    invoke-static {v4}, LT/f1;->a(I)LT/n0;

    move-result-object v5

    invoke-interface {v2, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_a
    check-cast v5, LT/n0;

    invoke-interface {v2}, LT/l;->J()V

    invoke-interface {v2}, LT/l;->J()V

    move-object/from16 v26, v5

    const/4 v15, 0x0

    goto :goto_5

    :cond_b
    const v4, 0x524d88b4

    invoke-interface {v2, v4}, LT/l;->U(I)V

    const/16 v4, 0x3e8

    const/4 v5, 0x6

    const/4 v15, 0x0

    invoke-static {v4, v15, v6, v5, v6}, Lr/j;->l(IILr/E;ILjava/lang/Object;)Lr/r0;

    move-result-object v5

    invoke-virtual/range {v22 .. v22}, LTe/h;->d()Lsh/i;

    move-result-object v4

    invoke-virtual {v4}, Lsh/g;->j()I

    move-result v4

    const/16 v9, 0x1b0

    const/16 v10, 0x8

    const-string v6, "y axis"

    const/4 v7, 0x0

    move-object v8, v2

    invoke-static/range {v4 .. v10}, Lr/c;->e(ILr/i;Ljava/lang/String;Lmh/l;LT/l;II)LT/z1;

    move-result-object v5

    invoke-interface {v2}, LT/l;->J()V

    move-object/from16 v26, v5

    :goto_5
    sget-object v34, LY5/c$b$a;->a:LY5/c$b$a;

    invoke-virtual/range {v22 .. v22}, LTe/h;->b()Ljava/util/List;

    move-result-object v35

    sget-object v4, Lla/a;->a:Lla/a;

    sget v5, Lla/a;->b:I

    invoke-virtual {v4, v2, v5}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v4

    invoke-virtual {v4}, Lma/a;->f()Lma/a$f;

    move-result-object v4

    invoke-virtual {v4}, Lma/a$f;->c()J

    move-result-wide v4

    const/16 v19, 0x0

    const/16 v20, 0x5fe

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    move-object v15, v3

    move-object/from16 v17, v2

    invoke-static/range {v4 .. v20}, LL5/a;->a(JJLo6/d;Landroid/text/TextUtils$TruncateAt;IFFFFLandroid/graphics/Typeface;Landroid/graphics/Paint$Align;LT/l;III)Lt6/b;

    move-result-object v37

    invoke-virtual/range {v22 .. v22}, LTe/h;->e()Lz6/c;

    move-result-object v36

    new-instance v3, LY5/a$a;

    invoke-virtual/range {v22 .. v22}, LTe/h;->c()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, LY5/a$a;-><init>(Ljava/lang/String;)V

    new-instance v16, LIe/d;

    const/16 v39, 0x0

    move-object/from16 v33, v16

    move-object/from16 v38, v24

    move-object/from16 v40, v3

    invoke-direct/range {v33 .. v40}, LIe/d;-><init>(LY5/c$b;Ljava/util/List;Lz6/c;Lt6/b;Lo6/b;Lo6/b;LY5/a$a;)V

    const v3, -0x59a16be

    invoke-interface {v2, v3}, LT/l;->U(I)V

    invoke-interface {v2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual/range {v25 .. v25}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v3, v4, :cond_c

    const v3, 0x461c4000    # 10000.0f

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const v4, 0x469c4000    # 20000.0f

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    filled-new-array {v3, v4}, [Ljava/lang/Float;

    move-result-object v3

    invoke-static {v3}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v2, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_c
    move-object/from16 v34, v3

    check-cast v34, Ljava/util/List;

    invoke-interface {v2}, LT/l;->J()V

    new-instance v17, LIe/c;

    const/16 v39, 0x6

    const/16 v40, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v38, 0x0

    move-object/from16 v33, v17

    move-object/from16 v37, v24

    invoke-direct/range {v33 .. v40}, LIe/c;-><init>(Ljava/util/List;Lz6/c;Lt6/b;Lo6/b;Lo6/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {p1 .. p1}, LTe/J;->a()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_e

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LTe/H;

    invoke-virtual {v5}, LTe/H;->a()Ljava/util/List;

    move-result-object v6

    invoke-static {v6}, LZg/v;->D0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LTe/G;

    if-eqz v6, :cond_d

    invoke-virtual/range {v21 .. v21}, LTe/g;->c()Lmh/p;

    move-result-object v7

    invoke-virtual {v6}, LTe/G;->c()F

    move-result v6

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-interface {v7, v5, v6}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lm0/v0;

    invoke-virtual {v6}, Lm0/v0;->u()J

    move-result-wide v6

    goto :goto_7

    :cond_d
    sget-object v6, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v6}, Lm0/v0$a;->a()J

    move-result-wide v6

    :goto_7
    invoke-static {v6, v7}, Lm0/x0;->j(J)I

    move-result v28

    new-instance v6, LR5/a;

    invoke-virtual/range {v21 .. v21}, LTe/g;->b()Lmh/l;

    move-result-object v7

    invoke-interface {v7, v5}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lm0/l0;

    invoke-direct {v6, v5}, LR5/a;-><init>(Lm0/l0;)V

    new-instance v5, Lh6/a$a;

    const/high16 v29, 0x3f800000    # 1.0f

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x7f8

    const/16 v40, 0x0

    move-object/from16 v27, v5

    move-object/from16 v30, v6

    invoke-direct/range {v27 .. v40}, Lh6/a$a;-><init>(IFLr6/b;Landroid/graphics/Paint$Cap;Lm6/a;FLt6/b;Lt6/c;Lz6/c;FLh6/a$a$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_e
    invoke-virtual/range {p1 .. p1}, LTe/J;->c()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_f

    new-instance v3, Lh6/a$a;

    sget-object v5, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v5}, Lm0/v0$a;->d()J

    move-result-wide v5

    invoke-static {v5, v6}, Lm0/x0;->j(J)I

    move-result v28

    new-instance v5, LR5/a;

    invoke-virtual/range {v21 .. v21}, LTe/g;->d()Lm0/l0;

    move-result-object v6

    invoke-direct {v5, v6}, LR5/a;-><init>(Lm0/l0;)V

    const/16 v39, 0x7fa

    const/16 v40, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    move-object/from16 v27, v3

    move-object/from16 v30, v5

    invoke-direct/range {v27 .. v40}, Lh6/a$a;-><init>(IFLr6/b;Landroid/graphics/Paint$Cap;Lm6/a;FLt6/b;Lt6/c;Lz6/c;FLh6/a$a$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_f
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_10

    new-instance v3, Lh6/a$a;

    const/16 v39, 0x7ff

    const/16 v40, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    move-object/from16 v27, v3

    invoke-direct/range {v27 .. v40}, Lh6/a$a;-><init>(IFLr6/b;Landroid/graphics/Paint$Cap;Lm6/a;FLt6/b;Lt6/c;Lz6/c;FLh6/a$a$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_10
    sget-object v6, Lh6/a$b;->Start:Lh6/a$b;

    const/16 v12, 0x180

    const/16 v13, 0x7a

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v11, v2

    invoke-static/range {v4 .. v13}, LN5/a;->a(Ljava/util/List;FLh6/a$b;Ljava/util/List;Ljava/util/Map;Lk6/a;LY5/c$b;LT/l;II)Lh6/a;

    move-result-object v11

    sget-object v3, LTe/V;->a:LTe/V;

    sget-object v12, Lma/a$b;->a:Lma/a$b;

    invoke-virtual {v12}, Lma/a$b;->f()Lma/a$f;

    move-result-object v4

    invoke-virtual {v4}, Lma/a$f;->b()J

    move-result-wide v5

    sget-object v13, Lla/a;->a:Lla/a;

    sget v14, Lla/a;->b:I

    invoke-virtual {v13, v2, v14}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v4

    invoke-virtual {v4}, Lma/a;->a()Lma/a$a;

    move-result-object v4

    invoke-virtual {v4}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v4

    invoke-virtual {v4}, Lr9/a$a;->f()J

    move-result-wide v7

    const/16 v10, 0x180

    move-object v4, v3

    move-object v9, v2

    invoke-virtual/range {v4 .. v10}, LTe/V;->a(JJLT/l;I)LTe/V$a;

    move-result-object v15

    invoke-virtual {v12}, Lma/a$b;->f()Lma/a$f;

    move-result-object v4

    invoke-virtual {v4}, Lma/a$f;->b()J

    move-result-wide v5

    invoke-virtual {v13, v2, v14}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v4

    instance-of v7, v4, Lma/a$d;

    if-eqz v7, :cond_11

    const v4, -0x59938de

    invoke-interface {v2, v4}, LT/l;->U(I)V

    invoke-virtual {v13, v2, v14}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v4

    invoke-virtual {v4}, Lma/a;->a()Lma/a$a;

    move-result-object v4

    invoke-virtual {v4}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v4

    invoke-virtual {v4}, Lr9/a$b;->c()J

    move-result-wide v7

    invoke-interface {v2}, LT/l;->J()V

    goto :goto_8

    :cond_11
    instance-of v4, v4, Lma/a$b;

    if-eqz v4, :cond_17

    const v4, -0x599301f

    invoke-interface {v2, v4}, LT/l;->U(I)V

    invoke-virtual {v13, v2, v14}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v4

    invoke-virtual {v4}, Lma/a;->a()Lma/a$a;

    move-result-object v4

    invoke-virtual {v4}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v4

    invoke-virtual {v4}, Lr9/a$b;->g()J

    move-result-wide v7

    invoke-interface {v2}, LT/l;->J()V

    :goto_8
    const/16 v10, 0x180

    move-object v4, v3

    move-object v9, v2

    invoke-virtual/range {v4 .. v10}, LTe/V;->a(JJLT/l;I)LTe/V$a;

    move-result-object v3

    const v4, -0x5991e47

    invoke-interface {v2, v4}, LT/l;->U(I)V

    invoke-virtual/range {p1 .. p1}, LTe/J;->b()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v4, v6}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_9
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_14

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LTe/I;

    instance-of v7, v6, LTe/I$a;

    if-eqz v7, :cond_12

    const v7, 0x66bbf79d

    invoke-interface {v2, v7}, LT/l;->U(I)V

    new-instance v7, LTe/V$b;

    check-cast v6, LTe/I$a;

    invoke-virtual {v6}, LTe/I$a;->b()F

    move-result v8

    invoke-virtual {v6}, LTe/I$a;->c()F

    move-result v9

    invoke-virtual {v6}, LTe/I$a;->a()Ls9/d;

    move-result-object v6

    const/4 v10, 0x0

    invoke-static {v6, v2, v10}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v7, v8, v9, v6, v15}, LTe/V$b;-><init>(FFLjava/lang/String;LTe/V$a;)V

    invoke-interface {v2}, LT/l;->J()V

    goto :goto_a

    :cond_12
    const/4 v10, 0x0

    instance-of v7, v6, LTe/I$b;

    if-eqz v7, :cond_13

    const v7, 0x66bc17fe

    invoke-interface {v2, v7}, LT/l;->U(I)V

    new-instance v7, LTe/V$b;

    check-cast v6, LTe/I$b;

    invoke-virtual {v6}, LTe/I$b;->b()F

    move-result v8

    invoke-virtual {v6}, LTe/I$b;->c()F

    move-result v9

    invoke-virtual {v6}, LTe/I$b;->a()Ls9/d;

    move-result-object v6

    invoke-static {v6, v2, v10}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v7, v8, v9, v6, v3}, LTe/V$b;-><init>(FFLjava/lang/String;LTe/V$a;)V

    invoke-interface {v2}, LT/l;->J()V

    :goto_a
    invoke-interface {v5, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_13
    const v0, 0x66bbef5c

    invoke-interface {v2, v0}, LT/l;->U(I)V

    invoke-interface {v2}, LT/l;->J()V

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_14
    invoke-interface {v2}, LT/l;->J()V

    invoke-virtual {v11, v5}, Lb6/a;->z(Ljava/util/List;)V

    const/16 v3, 0xc0

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v0, v3}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v13

    invoke-virtual/range {v22 .. v22}, LTe/h;->d()Lsh/i;

    move-result-object v3

    invoke-virtual {v3}, Lsh/g;->i()I

    move-result v3

    int-to-float v3, v3

    invoke-interface/range {v26 .. v26}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    int-to-float v4, v4

    shr-int/lit8 v5, v23, 0x3

    and-int/lit8 v5, v5, 0xe

    invoke-static {v1, v3, v4, v2, v5}, LTe/Q;->e(LTe/J;FFLT/l;I)Lx6/b;

    move-result-object v12

    const/4 v9, 0x6

    const/16 v10, 0xe

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v8, v2

    invoke-static/range {v4 .. v10}, LO5/b;->a(ZLE6/d;LE6/c;Lr/i;LT/l;II)LO5/a;

    move-result-object v21

    const/16 v29, 0x30

    const v30, 0xf398

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    move-object/from16 v27, v2

    invoke-static/range {v11 .. v30}, LM5/a;->a(Lb6/b;Lx6/b;Landroidx/compose/ui/e;LY5/d;LY5/d;LY5/d;LY5/d;LC6/a;LC6/b;LB6/a;LO5/a;ZLx6/b;Lf6/a;Li6/a;LO5/c;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_15

    invoke-static {}, LT/o;->P()V

    :cond_15
    :goto_b
    invoke-interface {v2}, LT/l;->z()LT/X0;

    move-result-object v2

    if-eqz v2, :cond_16

    new-instance v3, LTe/P;

    move/from16 v4, p3

    invoke-direct {v3, v0, v1, v4}, LTe/P;-><init>(Landroidx/compose/ui/e;LTe/J;I)V

    invoke-interface {v2, v3}, LT/X0;->a(Lmh/p;)V

    :cond_16
    return-void

    :cond_17
    move-object v0, v2

    const v1, -0x5994394

    invoke-interface {v0, v1}, LT/l;->U(I)V

    invoke-interface {v0}, LT/l;->J()V

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method private static final d(Landroidx/compose/ui/e;LTe/J;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, LTe/Q;->c(Landroidx/compose/ui/e;LTe/J;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final e(LTe/J;FFLT/l;I)Lx6/b;
    .locals 3

    const v0, 0x16867c7f

    invoke-interface {p3, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.signal.components.chartEntryModel (SignalChart.kt:493)"

    invoke-static {v0, p4, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    new-instance p4, LTe/Q$a;

    invoke-direct {p4, p0, p1, p2}, LTe/Q$a;-><init>(LTe/J;FF)V

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    invoke-interface {p3}, LT/l;->J()V

    return-object p4
.end method

.method private static final f(LTe/M;)Ljava/util/List;
    .locals 29

    move-object/from16 v0, p0

    instance-of v1, v0, LTe/M$b$b;

    const/high16 v2, -0x3d900000    # -60.0f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    const/high16 v2, -0x3d740000    # -70.0f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    const/high16 v2, -0x3d600000    # -80.0f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    const/high16 v2, -0x3d4c0000    # -90.0f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    if-eqz v1, :cond_0

    const/high16 v0, -0x3db80000    # -50.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const/high16 v1, -0x3de00000    # -40.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/high16 v2, -0x3e100000    # -30.0f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/high16 v3, -0x3e600000    # -20.0f

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    move-object v3, v6

    move-object v4, v7

    move-object v5, v8

    move-object v6, v9

    move-object v7, v0

    move-object v8, v1

    move-object v9, v2

    filled-new-array/range {v3 .. v10}, [Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_0

    :cond_0
    instance-of v1, v0, LTe/M$b$a$a;

    if-eqz v1, :cond_1

    const/high16 v0, -0x3d380000    # -100.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const/high16 v0, -0x3db80000    # -50.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const/high16 v1, -0x3de00000    # -40.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    move-object v4, v6

    move-object v5, v7

    move-object v6, v8

    move-object v7, v9

    move-object v8, v0

    move-object v9, v1

    filled-new-array/range {v3 .. v9}, [Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_0

    :cond_1
    instance-of v1, v0, LTe/M$b$a$b;

    if-eqz v1, :cond_2

    const/high16 v0, -0x3d100000    # -120.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const/high16 v0, -0x3d240000    # -110.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    const/high16 v0, -0x3d380000    # -100.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    filled-new-array/range {v3 .. v9}, [Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_0

    :cond_2
    instance-of v1, v0, LTe/M$c$f;

    const/high16 v2, 0x41f00000    # 30.0f

    const/high16 v3, 0x41200000    # 10.0f

    const/high16 v4, 0x42200000    # 40.0f

    const/high16 v5, 0x41a00000    # 20.0f

    const/high16 v6, 0x42480000    # 50.0f

    const/4 v7, 0x0

    if-eqz v1, :cond_3

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    const/high16 v0, 0x40a00000    # 5.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    const/high16 v0, 0x41700000    # 15.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v11

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v12

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v13

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v14

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v15

    filled-new-array/range {v8 .. v15}, [Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_0

    :cond_3
    instance-of v1, v0, LTe/M$c$j;

    const/high16 v8, 0x42c80000    # 100.0f

    if-eqz v1, :cond_4

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v11

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v12

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v13

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v14

    const/high16 v0, 0x42700000    # 60.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v15

    const/high16 v0, 0x42a00000    # 80.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v16

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v17

    filled-new-array/range {v9 .. v17}, [Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_0

    :cond_4
    instance-of v1, v0, LTe/M$c$c;

    const/high16 v9, 0x43160000    # 150.0f

    const/high16 v10, 0x43480000    # 200.0f

    if-eqz v1, :cond_5

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v11

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v12

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v13

    const/high16 v0, 0x42700000    # 60.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v14

    const/high16 v0, 0x42a00000    # 80.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v15

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v16

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v17

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v18

    filled-new-array/range {v11 .. v18}, [Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_0

    :cond_5
    instance-of v1, v0, LTe/M$c$e;

    const/high16 v11, 0x43960000    # 300.0f

    if-eqz v1, :cond_6

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v12

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v13

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v14

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v15

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v16

    const/high16 v0, 0x437a0000    # 250.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v17

    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v18

    filled-new-array/range {v12 .. v18}, [Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_0

    :cond_6
    instance-of v1, v0, LTe/M$c$g;

    const/high16 v12, 0x43fa0000    # 500.0f

    const/high16 v13, 0x43c80000    # 400.0f

    if-eqz v1, :cond_7

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v14

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v15

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v16

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v17

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v18

    const/high16 v0, 0x437a0000    # 250.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v19

    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v20

    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v21

    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v22

    filled-new-array/range {v14 .. v22}, [Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_0

    :cond_7
    instance-of v1, v0, LTe/M$c$i;

    const/high16 v14, 0x44480000    # 800.0f

    const/high16 v15, 0x44160000    # 600.0f

    const/high16 v16, 0x447a0000    # 1000.0f

    if-eqz v1, :cond_8

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v17

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v18

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v19

    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v20

    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v21

    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v22

    invoke-static {v15}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v23

    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v24

    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v25

    filled-new-array/range {v17 .. v25}, [Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_0

    :cond_8
    instance-of v1, v0, LTe/M$c$b;

    const v17, 0x44bb8000    # 1500.0f

    const/high16 v18, 0x44fa0000    # 2000.0f

    if-eqz v1, :cond_9

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v19

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v20

    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v21

    invoke-static {v15}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v22

    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v23

    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v24

    invoke-static/range {v17 .. v17}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v25

    invoke-static/range {v18 .. v18}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v26

    filled-new-array/range {v19 .. v26}, [Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_0

    :cond_9
    instance-of v1, v0, LTe/M$c$d;

    const v19, 0x453b8000    # 3000.0f

    if-eqz v1, :cond_a

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v20

    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v21

    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v22

    invoke-static/range {v17 .. v17}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v23

    invoke-static/range {v18 .. v18}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v24

    const v0, 0x451c4000    # 2500.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v25

    invoke-static/range {v19 .. v19}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v26

    filled-new-array/range {v20 .. v26}, [Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_0

    :cond_a
    instance-of v1, v0, LTe/M$c$h;

    if-eqz v1, :cond_b

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v20

    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v21

    invoke-static/range {v18 .. v18}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v22

    invoke-static/range {v19 .. v19}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v23

    const/high16 v0, 0x457a0000    # 4000.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v24

    const v0, 0x459c4000    # 5000.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v25

    const v0, 0x45bb8000    # 6000.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v26

    const/high16 v0, 0x45fa0000    # 8000.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v27

    const v0, 0x461c4000    # 10000.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v28

    filled-new-array/range {v20 .. v28}, [Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_0

    :cond_b
    instance-of v1, v0, LTe/M$c$a;

    if-eqz v1, :cond_c

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v20

    invoke-static/range {v18 .. v18}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v21

    const/high16 v0, 0x457a0000    # 4000.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v22

    const v0, 0x45bb8000    # 6000.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v23

    const/high16 v0, 0x45fa0000    # 8000.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v24

    const v0, 0x461c4000    # 10000.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v25

    const v0, 0x466a6000    # 15000.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v26

    const v0, 0x469c4000    # 20000.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v27

    filled-new-array/range {v20 .. v27}, [Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_0

    :cond_c
    instance-of v1, v0, LTe/M$a$f;

    if-eqz v1, :cond_d

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v20

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v21

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v22

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v23

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v24

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v25

    filled-new-array/range {v20 .. v25}, [Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_0

    :cond_d
    instance-of v1, v0, LTe/M$a$b;

    if-eqz v1, :cond_e

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v20

    const/high16 v0, 0x41c80000    # 25.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v21

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v22

    const/high16 v0, 0x42960000    # 75.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v23

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v24

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v25

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v26

    filled-new-array/range {v20 .. v26}, [Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_0

    :cond_e
    instance-of v1, v0, LTe/M$a$d;

    if-eqz v1, :cond_f

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v20

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v21

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v22

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v23

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v24

    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v25

    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v26

    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v27

    filled-new-array/range {v20 .. v27}, [Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_0

    :cond_f
    instance-of v1, v0, LTe/M$a$e;

    if-eqz v1, :cond_10

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v20

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v21

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v22

    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v23

    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v24

    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v25

    invoke-static {v15}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v26

    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v27

    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v28

    filled-new-array/range {v20 .. v28}, [Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_10
    instance-of v1, v0, LTe/M$a$a;

    if-eqz v1, :cond_11

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v20

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v21

    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v22

    invoke-static {v15}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v23

    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v24

    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v25

    invoke-static/range {v17 .. v17}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v26

    invoke-static/range {v18 .. v18}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v27

    filled-new-array/range {v20 .. v27}, [Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_11
    instance-of v0, v0, LTe/M$a$c;

    if-eqz v0, :cond_12

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v20

    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v21

    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v22

    invoke-static/range {v17 .. v17}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v23

    invoke-static/range {v18 .. v18}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v24

    const v0, 0x451c4000    # 2500.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v25

    invoke-static/range {v19 .. v19}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v26

    filled-new-array/range {v20 .. v26}, [Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_12
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method private static final g(LTe/M;)Lsh/i;
    .locals 4

    instance-of v0, p0, LTe/M$b$b;

    if-eqz v0, :cond_0

    new-instance p0, Lsh/i;

    const/16 v0, -0x5a

    const/16 v1, -0xf

    invoke-direct {p0, v0, v1}, Lsh/i;-><init>(II)V

    goto/16 :goto_0

    :cond_0
    instance-of v0, p0, LTe/M$b$a$a;

    if-eqz v0, :cond_1

    new-instance p0, Lsh/i;

    const/16 v0, -0x64

    const/16 v1, -0x1e

    invoke-direct {p0, v0, v1}, Lsh/i;-><init>(II)V

    goto/16 :goto_0

    :cond_1
    instance-of v0, p0, LTe/M$b$a$b;

    if-eqz v0, :cond_2

    new-instance p0, Lsh/i;

    const/16 v0, -0x78

    const/16 v1, -0x32

    invoke-direct {p0, v0, v1}, Lsh/i;-><init>(II)V

    goto/16 :goto_0

    :cond_2
    instance-of v0, p0, LTe/M$c$f;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    new-instance p0, Lsh/i;

    const/16 v0, 0x15

    invoke-direct {p0, v1, v0}, Lsh/i;-><init>(II)V

    goto/16 :goto_0

    :cond_3
    instance-of v0, p0, LTe/M$c$j;

    if-eqz v0, :cond_4

    new-instance p0, Lsh/i;

    const/16 v0, 0x37

    invoke-direct {p0, v1, v0}, Lsh/i;-><init>(II)V

    goto/16 :goto_0

    :cond_4
    instance-of v0, p0, LTe/M$c$c;

    if-eqz v0, :cond_5

    new-instance p0, Lsh/i;

    const/16 v0, 0x69

    invoke-direct {p0, v1, v0}, Lsh/i;-><init>(II)V

    goto/16 :goto_0

    :cond_5
    instance-of v0, p0, LTe/M$c$e;

    if-eqz v0, :cond_6

    new-instance p0, Lsh/i;

    const/16 v0, 0xcd

    invoke-direct {p0, v1, v0}, Lsh/i;-><init>(II)V

    goto/16 :goto_0

    :cond_6
    instance-of v0, p0, LTe/M$c$g;

    if-eqz v0, :cond_7

    new-instance p0, Lsh/i;

    const/16 v0, 0x136

    invoke-direct {p0, v1, v0}, Lsh/i;-><init>(II)V

    goto/16 :goto_0

    :cond_7
    instance-of v0, p0, LTe/M$c$i;

    if-eqz v0, :cond_8

    new-instance p0, Lsh/i;

    const/16 v0, 0x1fe

    invoke-direct {p0, v1, v0}, Lsh/i;-><init>(II)V

    goto/16 :goto_0

    :cond_8
    instance-of v0, p0, LTe/M$c$b;

    const/16 v2, 0x3f2

    if-eqz v0, :cond_9

    new-instance p0, Lsh/i;

    invoke-direct {p0, v1, v2}, Lsh/i;-><init>(II)V

    goto/16 :goto_0

    :cond_9
    instance-of v0, p0, LTe/M$c$d;

    const/16 v3, 0x7da

    if-eqz v0, :cond_a

    new-instance p0, Lsh/i;

    invoke-direct {p0, v1, v3}, Lsh/i;-><init>(II)V

    goto :goto_0

    :cond_a
    instance-of v0, p0, LTe/M$c$h;

    if-eqz v0, :cond_b

    new-instance p0, Lsh/i;

    const/16 v0, 0x1392

    invoke-direct {p0, v1, v0}, Lsh/i;-><init>(II)V

    goto :goto_0

    :cond_b
    instance-of v0, p0, LTe/M$c$a;

    if-eqz v0, :cond_c

    new-instance p0, Lsh/i;

    const/16 v0, 0x271a

    invoke-direct {p0, v1, v0}, Lsh/i;-><init>(II)V

    goto :goto_0

    :cond_c
    instance-of v0, p0, LTe/M$a$f;

    if-eqz v0, :cond_d

    new-instance p0, Lsh/i;

    const/16 v0, 0x33

    invoke-direct {p0, v1, v0}, Lsh/i;-><init>(II)V

    goto :goto_0

    :cond_d
    instance-of v0, p0, LTe/M$a$b;

    if-eqz v0, :cond_e

    new-instance p0, Lsh/i;

    const/16 v0, 0x65

    invoke-direct {p0, v1, v0}, Lsh/i;-><init>(II)V

    goto :goto_0

    :cond_e
    instance-of v0, p0, LTe/M$a$d;

    if-eqz v0, :cond_f

    new-instance p0, Lsh/i;

    const/16 v0, 0xc9

    invoke-direct {p0, v1, v0}, Lsh/i;-><init>(II)V

    goto :goto_0

    :cond_f
    instance-of v0, p0, LTe/M$a$e;

    if-eqz v0, :cond_10

    new-instance p0, Lsh/i;

    const/16 v0, 0x1f6

    invoke-direct {p0, v1, v0}, Lsh/i;-><init>(II)V

    goto :goto_0

    :cond_10
    instance-of v0, p0, LTe/M$a$a;

    if-eqz v0, :cond_11

    new-instance p0, Lsh/i;

    invoke-direct {p0, v1, v2}, Lsh/i;-><init>(II)V

    goto :goto_0

    :cond_11
    instance-of p0, p0, LTe/M$a$c;

    if-eqz p0, :cond_12

    new-instance p0, Lsh/i;

    invoke-direct {p0, v1, v3}, Lsh/i;-><init>(II)V

    :goto_0
    return-object p0

    :cond_12
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final h(LTe/h;LT/l;I)LTe/g;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    const v3, -0x4ce7519f

    invoke-interface {v1, v3}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, -0x1

    const-string v5, "com.ui.wifiman.ui.signal.components.rememberChartColors (SignalChart.kt:317)"

    invoke-static {v3, v2, v4, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object v3, Lla/a;->a:Lla/a;

    sget v4, Lla/a;->b:I

    invoke-virtual {v3, v1, v4}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    const v4, -0x24f01d9f

    invoke-interface {v1, v4}, LT/l;->U(I)V

    and-int/lit8 v4, v2, 0xe

    xor-int/lit8 v4, v4, 0x6

    const/4 v5, 0x4

    if-le v4, v5, :cond_1

    invoke-interface {v1, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    :cond_1
    and-int/lit8 v2, v2, 0x6

    if-ne v2, v5, :cond_3

    :cond_2
    const/4 v2, 0x1

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_4

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v4, v2, :cond_5

    :cond_4
    new-instance v10, LTe/Q$b;

    invoke-direct {v10, v0, v3}, LTe/Q$b;-><init>(LTe/h;Lma/a;)V

    new-instance v4, LTe/g;

    invoke-virtual {v3}, Lma/a;->a()Lma/a$a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v2

    invoke-virtual {v2}, Lr9/a$b;->f()J

    move-result-wide v6

    invoke-virtual {v3}, Lma/a;->f()Lma/a$f;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$f;->c()J

    move-result-wide v8

    new-instance v11, LTe/O;

    invoke-direct {v11, v3, v0, v10}, LTe/O;-><init>(Lma/a;LTe/h;Lmh/p;)V

    sget-object v12, Lm0/l0;->b:Lm0/l0$a;

    invoke-virtual {v3}, Lma/a;->a()Lma/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a$a;->l()Lr9/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lr9/a$a;->f()J

    move-result-wide v13

    const/16 v19, 0xe

    const/16 v20, 0x0

    const v15, 0x3ecccccd    # 0.4f

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v13 .. v20}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v13

    invoke-static {v13, v14}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v0

    invoke-virtual {v3}, Lma/a;->a()Lma/a$a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$a;->l()Lr9/a$a;

    move-result-object v2

    invoke-virtual {v2}, Lr9/a$a;->f()J

    move-result-wide v13

    invoke-static/range {v13 .. v20}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v2

    invoke-static {v2, v3}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v2

    filled-new-array {v0, v2}, [Lm0/v0;

    move-result-object v0

    invoke-static {v0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v13

    const/16 v17, 0xe

    const/16 v18, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v12 .. v18}, Lm0/l0$a;->i(Lm0/l0$a;Ljava/util/List;FFIILjava/lang/Object;)Lm0/l0;

    move-result-object v12

    const/4 v13, 0x0

    move-object v5, v4

    invoke-direct/range {v5 .. v13}, LTe/g;-><init>(JJLmh/p;Lmh/l;Lm0/l0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_5
    check-cast v4, LTe/g;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {}, LT/o;->P()V

    :cond_6
    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    return-object v4
.end method

.method private static final i(Lma/a;LTe/h;Lmh/p;LTe/H;)Lm0/l0;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    const-string v3, "line"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v3, v2, LTe/H$a;

    if-eqz v3, :cond_0

    sget-object v4, Lm0/l0;->b:Lm0/l0$a;

    move-object v1, v2

    check-cast v1, LTe/H$a;

    invoke-virtual {v1}, LTe/H$a;->b()LTe/N;

    move-result-object v2

    invoke-virtual {v2, v0}, LTe/N;->getColor-vNxB06k(Lma/a;)J

    move-result-wide v5

    const/16 v11, 0xe

    const/4 v12, 0x0

    const/high16 v7, 0x3f000000    # 0.5f

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v5 .. v12}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v2

    invoke-static {v2, v3}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v2

    invoke-virtual {v1}, LTe/H$a;->b()LTe/N;

    move-result-object v1

    invoke-virtual {v1, v0}, LTe/N;->getColor-vNxB06k(Lma/a;)J

    move-result-wide v5

    const/4 v7, 0x0

    invoke-static/range {v5 .. v12}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v0

    filled-new-array {v2, v0}, [Lm0/v0;

    move-result-object v0

    invoke-static {v0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const/16 v9, 0xe

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-static/range {v4 .. v10}, Lm0/l0$a;->i(Lm0/l0$a;Ljava/util/List;FFIILjava/lang/Object;)Lm0/l0;

    move-result-object v0

    goto/16 :goto_2

    :cond_0
    instance-of v0, v2, LTe/H$b;

    if-eqz v0, :cond_5

    invoke-virtual/range {p1 .. p1}, LTe/h;->a()LTe/M;

    move-result-object v0

    instance-of v2, v0, LTe/M$b;

    if-eqz v2, :cond_2

    invoke-virtual/range {p1 .. p1}, LTe/h;->d()Lsh/i;

    move-result-object v0

    invoke-virtual {v0}, Lsh/g;->i()I

    move-result v0

    invoke-virtual/range {p1 .. p1}, LTe/h;->d()Lsh/i;

    move-result-object v2

    invoke-virtual {v2}, Lsh/g;->j()I

    move-result v2

    sub-int/2addr v0, v2

    int-to-float v0, v0

    const/16 v2, 0xa

    int-to-float v3, v2

    div-float/2addr v0, v3

    sget-object v4, Lm0/l0;->b:Lm0/l0$a;

    const/4 v5, 0x0

    invoke-static {v5, v2}, Lsh/m;->s(II)Lsh/i;

    move-result-object v5

    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v5, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v6, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    move-object v5, v2

    check-cast v5, LZg/Q;

    invoke-virtual {v5}, LZg/Q;->d()I

    move-result v5

    sget-object v7, LTe/H$b;->b:LTe/H$b$a;

    invoke-virtual {v7}, LTe/H$b$a;->a()LTe/H$b;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, LTe/h;->d()Lsh/i;

    move-result-object v8

    invoke-virtual {v8}, Lsh/g;->j()I

    move-result v8

    int-to-float v8, v8

    int-to-float v5, v5

    mul-float v9, v0, v5

    add-float/2addr v8, v9

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    invoke-interface {v1, v7, v8}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lm0/v0;

    invoke-virtual {v7}, Lm0/v0;->u()J

    move-result-wide v8

    const/high16 v7, 0x3f000000    # 0.5f

    div-float v10, v7, v3

    mul-float/2addr v10, v5

    sub-float v10, v7, v10

    const/16 v14, 0xe

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v8 .. v15}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v7

    invoke-static {v7, v8}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v5

    invoke-interface {v6, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    const/16 v9, 0xe

    const/4 v10, 0x0

    const/4 v0, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v5, v6

    move v6, v0

    invoke-static/range {v4 .. v10}, Lm0/l0$a;->i(Lm0/l0$a;Ljava/util/List;FFIILjava/lang/Object;)Lm0/l0;

    move-result-object v0

    goto :goto_2

    :cond_2
    instance-of v2, v0, LTe/M$c;

    if-nez v2, :cond_4

    instance-of v0, v0, LTe/M$a;

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_4
    :goto_1
    sget-object v0, Lm0/l0;->b:Lm0/l0$a;

    sget-object v2, LTe/H$b;->b:LTe/H$b$a;

    invoke-virtual {v2}, LTe/H$b$a;->a()LTe/H$b;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-interface {v1, v3, v5}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm0/v0;

    invoke-virtual {v3}, Lm0/v0;->u()J

    move-result-wide v5

    const/16 v11, 0xe

    const/4 v12, 0x0

    const/high16 v7, 0x3f000000    # 0.5f

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v5 .. v12}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v5

    invoke-static {v5, v6}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v3

    invoke-virtual {v2}, LTe/H$b$a;->a()LTe/H$b;

    move-result-object v2

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-interface {v1, v2, v4}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm0/v0;

    invoke-virtual {v1}, Lm0/v0;->u()J

    move-result-wide v4

    const/16 v10, 0xe

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v11}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v1

    invoke-static {v1, v2}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v1

    filled-new-array {v3, v1}, [Lm0/v0;

    move-result-object v1

    invoke-static {v1}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, v0

    invoke-static/range {v1 .. v7}, Lm0/l0$a;->i(Lm0/l0$a;Ljava/util/List;FFIILjava/lang/Object;)Lm0/l0;

    move-result-object v0

    :goto_2
    return-object v0

    :cond_5
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method private static final j(LTe/M;LT/l;I)LTe/h;
    .locals 8

    const v0, 0x1e28c687

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.signal.components.rememberChartYAxis (SignalChart.kt:387)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->g()LT/H0;

    move-result-object v0

    invoke-interface {p1, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const v1, -0x3f18cf25

    invoke-interface {p1, v1}, LT/l;->U(I)V

    and-int/lit8 v1, p2, 0xe

    xor-int/lit8 v1, v1, 0x6

    const/4 v2, 0x4

    if-le v1, v2, :cond_1

    invoke-interface {p1, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    :cond_1
    and-int/lit8 p2, p2, 0x6

    if-ne p2, v2, :cond_3

    :cond_2
    const/4 p2, 0x1

    goto :goto_0

    :cond_3
    const/4 p2, 0x0

    :goto_0
    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez p2, :cond_4

    sget-object p2, LT/l;->a:LT/l$a;

    invoke-virtual {p2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p2

    if-ne v1, p2, :cond_9

    :cond_4
    invoke-static {p0}, LTe/Q;->g(LTe/M;)Lsh/i;

    move-result-object p2

    new-instance v7, LTe/h;

    invoke-static {p0}, LTe/Q;->g(LTe/M;)Lsh/i;

    move-result-object v3

    invoke-static {p0}, LTe/Q;->f(LTe/M;)Ljava/util/List;

    move-result-object v4

    new-instance v5, LTe/Q$c;

    invoke-direct {v5, p2, p0, v0}, LTe/Q$c;-><init>(Lsh/i;LTe/M;Landroid/content/Context;)V

    instance-of p2, p0, LTe/M$b$b;

    if-nez p2, :cond_8

    instance-of p2, p0, LTe/M$b$a$a;

    if-nez p2, :cond_8

    instance-of p2, p0, LTe/M$b$a$b;

    if-eqz p2, :cond_5

    goto :goto_2

    :cond_5
    instance-of p2, p0, LTe/M$c;

    if-eqz p2, :cond_6

    sget p2, Lm8/c;->s4:I

    invoke-virtual {v0, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    :goto_1
    move-object v6, p2

    goto :goto_3

    :cond_6
    instance-of p2, p0, LTe/M$a;

    if-eqz p2, :cond_7

    const-string p2, "2000"

    goto :goto_1

    :cond_7
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_8
    :goto_2
    sget p2, Lm8/c;->q4:I

    invoke-virtual {v0, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    :goto_3
    invoke-static {v6}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    move-object v1, v7

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, LTe/h;-><init>(LTe/M;Lsh/i;Ljava/util/List;Lz6/c;Ljava/lang/String;)V

    invoke-interface {p1, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_9
    check-cast v1, LTe/h;

    invoke-interface {p1}, LT/l;->J()V

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_a

    invoke-static {}, LT/o;->P()V

    :cond_a
    invoke-interface {p1}, LT/l;->J()V

    return-object v1
.end method
