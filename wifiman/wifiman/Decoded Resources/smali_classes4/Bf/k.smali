.class public abstract LBf/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LBf/k$a;
    }
.end annotation


# direct methods
.method public static synthetic a(LS8/e;)F
    .locals 0

    invoke-static {p0}, LBf/k;->p(LS8/e;)F

    move-result p0

    return p0
.end method

.method public static synthetic b(LS8/c;LS8/e;)Z
    .locals 0

    invoke-static {p0, p1}, LBf/k;->q(LS8/c;LS8/e;)Z

    move-result p0

    return p0
.end method

.method public static synthetic c(LBf/c;)Z
    .locals 0

    invoke-static {p0}, LBf/k;->f(LBf/c;)Z

    move-result p0

    return p0
.end method

.method public static synthetic d(Landroidx/compose/ui/e;LBf/b;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LBf/k;->g(Landroidx/compose/ui/e;LBf/b;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/e;LBf/b;LT/l;I)V
    .locals 40

    move-object/from16 v6, p0

    move-object/from16 v3, p1

    move/from16 v2, p3

    const-string v0, "modifier"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "model"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x12e58732

    move-object/from16 v1, p2

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v5

    and-int/lit8 v1, v2, 0x6

    if-nez v1, :cond_1

    invoke-interface {v5, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v2

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    and-int/lit8 v4, v2, 0x30

    if-nez v4, :cond_3

    invoke-interface {v5, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v1, v4

    :cond_3
    move v4, v1

    and-int/lit8 v1, v4, 0x13

    const/16 v7, 0x12

    if-ne v1, v7, :cond_5

    invoke-interface {v5}, LT/l;->v()Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v5}, LT/l;->C()V

    move-object/from16 v21, v5

    goto/16 :goto_5

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v1, -0x1

    const-string v7, "com.ui.wifiman.ui.wifi.component.chart.WifiSpectrumChart (WifiSpectrumChart.kt:89)"

    invoke-static {v0, v4, v1, v7}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    shr-int/lit8 v0, v4, 0x3

    and-int/lit8 v0, v0, 0xe

    invoke-static {v3, v5, v0}, LBf/e;->b(LBf/b;LT/l;I)LLi/N;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v14, 0x0

    const/4 v7, 0x1

    invoke-static {v0, v1, v5, v14, v7}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v0

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LBf/b;

    invoke-static {v5, v14}, LBf/k;->n(LT/l;I)LBf/f;

    move-result-object v0

    invoke-virtual {v0}, LBf/f;->a()J

    move-result-wide v8

    int-to-float v7, v7

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v10

    const/high16 v7, 0x3f000000    # 0.5f

    invoke-static {v7}, LE/h;->a(F)LE/g;

    move-result-object v11

    const/16 v17, 0x30

    const/16 v18, 0x78

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const-wide/16 v19, 0x0

    move-wide v7, v8

    move v9, v10

    move-object v10, v11

    move-object v11, v12

    move-object v12, v13

    move v13, v15

    move-wide/from16 v14, v19

    move-object/from16 v16, v5

    invoke-static/range {v7 .. v18}, LP5/a;->a(JFLm0/i1;Lr6/b;Lw6/b;FJLT/l;II)Lo6/b;

    move-result-object v35

    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0x1a

    if-le v7, v8, :cond_7

    const v7, 0x165aeb2

    invoke-interface {v5, v7}, LT/l;->U(I)V

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->g()LT/H0;

    move-result-object v7

    invoke-interface {v5, v7}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    sget v8, Lm8/b;->a:I

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getFont(I)Landroid/graphics/Typeface;

    move-result-object v7

    invoke-interface {v5}, LT/l;->J()V

    move-object/from16 v24, v7

    const/4 v15, 0x0

    goto :goto_4

    :cond_7
    const v7, 0x166f188

    invoke-interface {v5, v7}, LT/l;->U(I)V

    const/4 v15, 0x0

    invoke-static {v5, v15}, LW5/b;->a(LT/l;I)LW5/a;

    move-result-object v7

    invoke-virtual {v7}, LW5/a;->a()LW5/a$a;

    move-result-object v7

    invoke-virtual {v7}, LW5/a$a;->h()Landroid/graphics/Typeface;

    move-result-object v7

    invoke-interface {v5}, LT/l;->J()V

    move-object/from16 v24, v7

    :goto_4
    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    sget-object v26, LY5/c$b$b;->a:LY5/c$b$b;

    invoke-static {v5, v15}, LBf/k;->r(LT/l;I)Ljava/util/List;

    move-result-object v27

    sget-object v14, Lla/a;->a:Lla/a;

    sget v13, Lla/a;->b:I

    invoke-virtual {v14, v5, v13}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v7

    invoke-virtual {v7}, Lma/a;->f()Lma/a$f;

    move-result-object v7

    invoke-virtual {v7}, Lma/a$f;->c()J

    move-result-wide v7

    const/16 v22, 0x0

    const/16 v23, 0x5fe

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x0

    move/from16 v36, v13

    move/from16 v13, v16

    const/16 v16, 0x0

    move-object/from16 v37, v14

    move/from16 v14, v16

    move/from16 v15, v16

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    move-object/from16 v18, v24

    move-object/from16 v20, v5

    invoke-static/range {v7 .. v23}, LL5/a;->a(JJLo6/d;Landroid/text/TextUtils$TruncateAt;IFFFFLandroid/graphics/Typeface;Landroid/graphics/Paint$Align;LT/l;III)Lt6/b;

    move-result-object v29

    const/4 v15, 0x0

    invoke-static {v5, v15}, LBf/k;->m(LT/l;I)Lz6/c;

    move-result-object v28

    new-instance v38, LIe/d;

    const/16 v33, 0x40

    const/16 v34, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    move-object/from16 v25, v38

    move-object/from16 v30, v35

    invoke-direct/range {v25 .. v34}, LIe/d;-><init>(LY5/c$b;Ljava/util/List;Lz6/c;Lt6/b;Lo6/b;Lo6/b;LY5/a$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, LBf/b;->c()LS8/c;

    move-result-object v7

    invoke-static {v7, v5, v15}, LBf/k;->o(LS8/c;LT/l;I)Ljava/util/List;

    move-result-object v26

    move/from16 v8, v36

    move-object/from16 v7, v37

    invoke-virtual {v7, v5, v8}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v7

    invoke-virtual {v7}, Lma/a;->f()Lma/a$f;

    move-result-object v7

    invoke-virtual {v7}, Lma/a$f;->c()J

    move-result-wide v7

    const/4 v13, 0x0

    const/4 v14, 0x0

    move/from16 v15, v16

    invoke-static/range {v7 .. v23}, LL5/a;->a(JJLo6/d;Landroid/text/TextUtils$TruncateAt;IFFFFLandroid/graphics/Typeface;Landroid/graphics/Paint$Align;LT/l;III)Lt6/b;

    move-result-object v28

    invoke-virtual {v1}, LBf/b;->c()LS8/c;

    move-result-object v7

    const/4 v15, 0x0

    invoke-static {v7, v5, v15}, LBf/k;->l(LS8/c;LT/l;I)Lz6/c;

    move-result-object v27

    new-instance v20, LIe/c;

    move-object/from16 v25, v20

    move-object/from16 v29, v35

    invoke-direct/range {v25 .. v30}, LIe/c;-><init>(Ljava/util/List;Lz6/c;Lt6/b;Lo6/b;Lo6/b;)V

    const v7, 0x18d22e18

    invoke-interface {v5, v7}, LT/l;->U(I)V

    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    sget-object v8, LT/l;->a:LT/l$a;

    invoke-virtual {v8}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v9

    if-ne v7, v9, :cond_8

    new-instance v7, Lb6/d;

    const/high16 v9, 0x40000000    # 2.0f

    invoke-direct {v7, v9}, Lb6/d;-><init>(F)V

    invoke-interface {v5, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
    check-cast v7, Lb6/d;

    invoke-interface {v5}, LT/l;->J()V

    invoke-virtual {v1}, LBf/b;->d()Ljava/util/List;

    move-result-object v9

    check-cast v9, Ljava/lang/Iterable;

    invoke-static {v9}, LZg/v;->d0(Ljava/lang/Iterable;)Lzi/j;

    move-result-object v9

    const v10, 0x18d2495f

    invoke-interface {v5, v10}, LT/l;->U(I)V

    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v8}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v8

    if-ne v10, v8, :cond_9

    new-instance v10, LBf/g;

    invoke-direct {v10}, LBf/g;-><init>()V

    invoke-interface {v5, v10}, LT/l;->K(Ljava/lang/Object;)V

    :cond_9
    check-cast v10, Lmh/l;

    invoke-interface {v5}, LT/l;->J()V

    invoke-static {v9, v10}, Lzi/m;->C(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v14

    invoke-virtual {v0}, LBf/f;->b()F

    move-result v0

    invoke-static {v14, v7, v0, v5, v15}, LBf/k;->j(Lzi/j;Lh6/a$a$a;FLT/l;I)Ljava/util/List;

    move-result-object v7

    invoke-virtual {v1}, LBf/b;->c()LS8/c;

    move-result-object v0

    invoke-static {v0, v5, v15}, LBf/k;->k(LS8/c;LT/l;I)Lk6/a;

    move-result-object v12

    sget-object v9, Lh6/a$b;->Start:Lh6/a$b;

    const/16 v0, 0x180

    const/16 v16, 0x5a

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    move-object/from16 v39, v14

    move-object v14, v5

    move v15, v0

    invoke-static/range {v7 .. v16}, LN5/a;->a(Ljava/util/List;FLh6/a$b;Ljava/util/List;Ljava/util/Map;Lk6/a;LY5/c$b;LT/l;II)Lh6/a;

    move-result-object v0

    invoke-virtual {v1}, LBf/b;->c()LS8/c;

    move-result-object v1

    move-object/from16 v8, v39

    const/4 v7, 0x0

    invoke-static {v1, v8, v5, v7}, LBf/k;->h(LS8/c;Lzi/j;LT/l;I)Lx6/b;

    move-result-object v1

    const/4 v12, 0x6

    const/16 v13, 0xe

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v11, v5

    invoke-static/range {v7 .. v13}, LO5/b;->a(ZLE6/d;LE6/c;Lr/i;LT/l;II)LO5/a;

    move-result-object v10

    shl-int/lit8 v4, v4, 0x6

    and-int/lit16 v4, v4, 0x380

    move/from16 v17, v4

    const/16 v18, 0x30

    const v19, 0xf3b0

    const/4 v4, 0x0

    const/4 v7, 0x0

    move-object/from16 v21, v5

    move-object v5, v7

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v2, p0

    move-object/from16 v3, v38

    move-object/from16 v6, v20

    move-object/from16 v16, v21

    invoke-static/range {v0 .. v19}, LM5/a;->a(Lb6/b;Lx6/b;Landroidx/compose/ui/e;LY5/d;LY5/d;LY5/d;LY5/d;LC6/a;LC6/b;LB6/a;LO5/a;ZLx6/b;Lf6/a;Li6/a;LO5/c;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, LT/o;->P()V

    :cond_a
    :goto_5
    invoke-interface/range {v21 .. v21}, LT/l;->z()LT/X0;

    move-result-object v0

    if-eqz v0, :cond_b

    new-instance v1, LBf/h;

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move/from16 v4, p3

    invoke-direct {v1, v2, v3, v4}, LBf/h;-><init>(Landroidx/compose/ui/e;LBf/b;I)V

    invoke-interface {v0, v1}, LT/X0;->a(Lmh/p;)V

    :cond_b
    return-void
.end method

.method private static final f(LBf/c;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LBf/c;->f()Ljava/lang/Float;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static final g(Landroidx/compose/ui/e;LBf/b;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, LBf/k;->e(Landroidx/compose/ui/e;LBf/b;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final h(LS8/c;Lzi/j;LT/l;I)Lx6/b;
    .locals 14

    const v0, 0x2bca267b

    move-object/from16 v1, p2

    invoke-interface {v1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.wifi.component.chart.chartEntryModel (WifiSpectrumChart.kt:332)"

    move/from16 v4, p3

    invoke-static {v0, v4, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Lzi/j;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LBf/c;

    invoke-virtual {v2}, LBf/c;->f()Ljava/lang/Float;

    move-result-object v3

    if-eqz v3, :cond_1

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2}, LBf/c;->c()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LBf/c$a;

    new-instance v7, Lx6/c;

    invoke-virtual {v6}, LBf/c$a;->a()F

    move-result v8

    invoke-virtual {v6}, LBf/c$a;->b()F

    move-result v9

    const/4 v10, 0x2

    int-to-float v10, v10

    div-float/2addr v9, v10

    sub-float/2addr v8, v9

    const/high16 v9, -0x3d420000    # -95.0f

    invoke-direct {v7, v8, v9}, Lx6/c;-><init>(FF)V

    invoke-interface {v3, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    new-instance v7, Lx6/c;

    invoke-virtual {v6}, LBf/c$a;->a()F

    move-result v8

    invoke-virtual {v6}, LBf/c$a;->b()F

    move-result v11

    div-float/2addr v11, v10

    const v12, 0x3f4ccccd    # 0.8f

    mul-float/2addr v11, v12

    sub-float/2addr v8, v11

    invoke-virtual {v2}, LBf/c;->f()Ljava/lang/Float;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/Float;->floatValue()F

    move-result v11

    const/high16 v13, -0x3e100000    # -30.0f

    invoke-static {v13, v11}, Ljava/lang/Math;->min(FF)F

    move-result v11

    invoke-direct {v7, v8, v11}, Lx6/c;-><init>(FF)V

    invoke-interface {v3, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    new-instance v7, Lx6/c;

    invoke-virtual {v6}, LBf/c$a;->a()F

    move-result v8

    invoke-virtual {v6}, LBf/c$a;->b()F

    move-result v11

    div-float/2addr v11, v10

    mul-float/2addr v11, v12

    add-float/2addr v8, v11

    invoke-virtual {v2}, LBf/c;->f()Ljava/lang/Float;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/Float;->floatValue()F

    move-result v11

    invoke-static {v13, v11}, Ljava/lang/Math;->min(FF)F

    move-result v11

    invoke-direct {v7, v8, v11}, Lx6/c;-><init>(FF)V

    invoke-interface {v3, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    new-instance v7, Lx6/c;

    invoke-virtual {v6}, LBf/c$a;->a()F

    move-result v8

    invoke-virtual {v6}, LBf/c$a;->b()F

    move-result v6

    div-float/2addr v6, v10

    add-float/2addr v8, v6

    invoke-direct {v7, v8, v9}, Lx6/c;-><init>(FF)V

    invoke-interface {v3, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-interface {v5, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_3
    invoke-static {p0}, LBf/k;->s(LS8/c;)Lsh/i;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v13

    invoke-virtual {v0}, Lsh/g;->i()I

    move-result v2

    int-to-float v6, v2

    invoke-virtual {v0}, Lsh/g;->j()I

    move-result v0

    int-to-float v7, v0

    new-instance v0, LBf/a;

    const/high16 v11, -0x3d420000    # -95.0f

    const/high16 v12, 0x3f800000    # 1.0f

    const/high16 v8, -0x3d420000    # -95.0f

    const/high16 v9, -0x3e100000    # -30.0f

    const/high16 v10, -0x3d420000    # -95.0f

    move-object v4, v0

    invoke-direct/range {v4 .. v13}, LBf/a;-><init>(Ljava/util/List;FFFFFFFI)V

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    return-object v0
.end method

.method private static final i(LBf/c;LT/l;I)J
    .locals 3

    const v0, -0x6cd713ce

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.wifi.component.chart.color (WifiSpectrumChart.kt:146)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, LBf/c;->g()Ljava/lang/Boolean;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p0}, LBf/c;->g()Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_1

    const p0, 0x512a4ef

    invoke-interface {p1, p0}, LT/l;->U(I)V

    sget-object p0, Lla/a;->a:Lla/a;

    sget p2, Lla/a;->b:I

    invoke-virtual {p0, p1, p2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a;->a()Lma/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a$a;->b()Lr9/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lr9/a$a;->f()J

    move-result-wide v0

    invoke-interface {p1}, LT/l;->J()V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, LBf/c;->g()Ljava/lang/Boolean;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-virtual {p0}, LBf/c;->g()Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_2

    const p0, 0x512af2f

    invoke-interface {p1, p0}, LT/l;->U(I)V

    sget-object p0, Lla/a;->a:Lla/a;

    sget p2, Lla/a;->b:I

    invoke-virtual {p0, p1, p2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a;->a()Lma/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a$a;->g()Lr9/a$b;

    move-result-object p0

    invoke-virtual {p0}, Lr9/a$b;->f()J

    move-result-wide v0

    invoke-interface {p1}, LT/l;->J()V

    goto :goto_0

    :cond_2
    const p2, 0x512b192

    invoke-interface {p1, p2}, LT/l;->U(I)V

    invoke-interface {p1}, LT/l;->J()V

    invoke-virtual {p0}, LBf/c;->d()J

    move-result-wide v0

    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    invoke-interface {p1}, LT/l;->J()V

    return-wide v0
.end method

.method private static final j(Lzi/j;Lh6/a$a$a;FLT/l;I)Ljava/util/List;
    .locals 21

    move-object/from16 v0, p3

    const v1, 0x49b05608    # 1444545.0f

    invoke-interface {v0, v1}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.wifi.component.chart.lineSpecs (WifiSpectrumChart.kt:280)"

    move/from16 v4, p4

    invoke-static {v1, v4, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static/range {p0 .. p0}, Lzi/m;->x(Lzi/j;)I

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v1}, Lm0/v0$a;->d()J

    move-result-wide v2

    invoke-static {v2, v3}, Lm0/x0;->j(J)I

    move-result v5

    sget-object v6, Lm0/l0;->b:Lm0/l0$a;

    invoke-virtual {v1}, Lm0/v0$a;->d()J

    move-result-wide v1

    invoke-static {v1, v2}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v3

    invoke-static {v1, v2}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v1

    filled-new-array {v3, v1}, [Lm0/v0;

    move-result-object v1

    invoke-static {v1}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    const/16 v11, 0xe

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v6 .. v12}, Lm0/l0$a;->i(Lm0/l0$a;Ljava/util/List;FFIILjava/lang/Object;)Lm0/l0;

    move-result-object v1

    new-instance v7, LR5/a;

    invoke-direct {v7, v1}, LR5/a;-><init>(Lm0/l0;)V

    new-instance v1, Lh6/a$a;

    const/16 v16, 0x3fa

    const/16 v17, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v4, v1

    move-object/from16 v15, p1

    invoke-direct/range {v4 .. v17}, Lh6/a$a;-><init>(IFLr6/b;Landroid/graphics/Paint$Cap;Lm6/a;FLt6/b;Lt6/c;Lz6/c;FLh6/a$a$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    goto :goto_1

    :cond_1
    invoke-static {}, LZg/v;->c()Ljava/util/List;

    move-result-object v1

    const v2, 0x6c44812d

    invoke-interface {v0, v2}, LT/l;->U(I)V

    invoke-interface/range {p0 .. p0}, Lzi/j;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LBf/c;

    const/4 v4, 0x0

    invoke-static {v3, v0, v4}, LBf/k;->i(LBf/c;LT/l;I)J

    move-result-wide v5

    invoke-static {v5, v6}, Lm0/x0;->j(J)I

    move-result v3

    sget-object v4, Lm0/l0;->b:Lm0/l0$a;

    const/16 v11, 0xe

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move/from16 v7, p2

    invoke-static/range {v5 .. v12}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v5

    invoke-static {v5, v6}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v7

    invoke-static {v5, v6}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v5

    filled-new-array {v7, v5}, [Lm0/v0;

    move-result-object v5

    invoke-static {v5}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const/16 v12, 0xe

    const/4 v13, 0x0

    const/4 v11, 0x0

    move-object v7, v4

    invoke-static/range {v7 .. v13}, Lm0/l0$a;->i(Lm0/l0$a;Ljava/util/List;FFIILjava/lang/Object;)Lm0/l0;

    move-result-object v4

    new-instance v10, LR5/a;

    invoke-direct {v10, v4}, LR5/a;-><init>(Lm0/l0;)V

    new-instance v4, Lh6/a$a;

    const/16 v19, 0x3fa

    const/16 v20, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v7, v4

    move v8, v3

    move-object/from16 v18, p1

    invoke-direct/range {v7 .. v20}, Lh6/a$a;-><init>(IFLr6/b;Landroid/graphics/Paint$Cap;Lm6/a;FLt6/b;Lt6/c;Lz6/c;FLh6/a$a$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    invoke-static {v1}, LZg/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    return-object v1
.end method

.method private static final k(LS8/c;LT/l;I)Lk6/a;
    .locals 3

    const v0, 0x7a869dbd

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.wifi.component.chart.rememberChartAxisValuesOverrider (WifiSpectrumChart.kt:265)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    const v0, 0x57cf9d25

    invoke-interface {p1, v0}, LT/l;->U(I)V

    and-int/lit8 v0, p2, 0xe

    xor-int/lit8 v0, v0, 0x6

    const/4 v1, 0x4

    if-le v0, v1, :cond_1

    invoke-interface {p1, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    and-int/lit8 p2, p2, 0x6

    if-ne p2, v1, :cond_3

    :cond_2
    const/4 p2, 0x1

    goto :goto_0

    :cond_3
    const/4 p2, 0x0

    :goto_0
    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    if-nez p2, :cond_4

    sget-object p2, LT/l;->a:LT/l$a;

    invoke-virtual {p2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p2

    if-ne v0, p2, :cond_5

    :cond_4
    invoke-static {p0}, LBf/k;->s(LS8/c;)Lsh/i;

    move-result-object p0

    sget-object p2, Lk6/a;->a:Lk6/a$a;

    invoke-virtual {p0}, Lsh/g;->i()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0}, Lsh/g;->j()I

    move-result p0

    int-to-float p0, p0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    const/high16 v1, -0x3d420000    # -95.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/high16 v2, -0x3e100000    # -30.0f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {p2, v0, p0, v1, v2}, Lk6/a$a;->a(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)Lk6/a;

    move-result-object v0

    invoke-interface {p1, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_5
    check-cast v0, Lk6/a;

    invoke-interface {p1}, LT/l;->J()V

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_6

    invoke-static {}, LT/o;->P()V

    :cond_6
    invoke-interface {p1}, LT/l;->J()V

    return-object v0
.end method

.method private static final l(LS8/c;LT/l;I)Lz6/c;
    .locals 3

    const v0, 0x47d47d9f

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.wifi.component.chart.rememberFrequencyValueFormatter (WifiSpectrumChart.kt:182)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    const v0, 0x59d3a7c7

    invoke-interface {p1, v0}, LT/l;->U(I)V

    and-int/lit8 v0, p2, 0xe

    xor-int/lit8 v0, v0, 0x6

    const/4 v1, 0x4

    if-le v0, v1, :cond_1

    invoke-interface {p1, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    and-int/lit8 p2, p2, 0x6

    if-ne p2, v1, :cond_3

    :cond_2
    const/4 p2, 0x1

    goto :goto_0

    :cond_3
    const/4 p2, 0x0

    :goto_0
    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    if-nez p2, :cond_4

    sget-object p2, LT/l;->a:LT/l$a;

    invoke-virtual {p2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p2

    if-ne v0, p2, :cond_5

    :cond_4
    new-instance v0, LBf/k$b;

    invoke-direct {v0, p0}, LBf/k$b;-><init>(LS8/c;)V

    invoke-interface {p1, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_5
    check-cast v0, LBf/k$b;

    invoke-interface {p1}, LT/l;->J()V

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_6

    invoke-static {}, LT/o;->P()V

    :cond_6
    invoke-interface {p1}, LT/l;->J()V

    return-object v0
.end method

.method private static final m(LT/l;I)Lz6/c;
    .locals 3

    const v0, 0x27569933

    invoke-interface {p0, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.wifi.component.chart.rememberSignalValueFormatter (WifiSpectrumChart.kt:173)"

    invoke-static {v0, p1, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    const p1, -0x2e7ce2d8

    invoke-interface {p0, p1}, LT/l;->U(I)V

    invoke-interface {p0}, LT/l;->f()Ljava/lang/Object;

    move-result-object p1

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_1

    new-instance p1, LBf/k$c;

    invoke-direct {p1}, LBf/k$c;-><init>()V

    invoke-interface {p0, p1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1
    check-cast p1, LBf/k$c;

    invoke-interface {p0}, LT/l;->J()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
    invoke-interface {p0}, LT/l;->J()V

    return-object p1
.end method

.method private static final n(LT/l;I)LBf/f;
    .locals 9

    const v0, -0x21b767fe

    invoke-interface {p0, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.wifi.component.chart.rememberUiTabLayoutColors (WifiSpectrumChart.kt:153)"

    invoke-static {v0, p1, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p1, Lla/a;->a:Lla/a;

    sget v0, Lla/a;->b:I

    invoke-virtual {p1, p0, v0}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object p1

    const v0, 0x77fdc274

    invoke-interface {p0, v0}, LT/l;->U(I)V

    invoke-interface {p0, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p0}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_1

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_2

    :cond_1
    new-instance v1, LBf/f;

    invoke-virtual {p1}, Lma/a;->a()Lma/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v0

    invoke-virtual {v0}, Lr9/a$b;->f()J

    move-result-wide v3

    invoke-virtual {p1}, Lma/a;->f()Lma/a$f;

    move-result-object p1

    invoke-virtual {p1}, Lma/a$f;->c()J

    move-result-wide v5

    const v7, 0x3e19999a    # 0.15f

    const/4 v8, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v8}, LBf/f;-><init>(JJFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast v1, LBf/f;

    invoke-interface {p0}, LT/l;->J()V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    invoke-interface {p0}, LT/l;->J()V

    return-object v1
.end method

.method private static final o(LS8/c;LT/l;I)Ljava/util/List;
    .locals 3

    const v0, -0x5620dde9

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.wifi.component.chart.rememberXAxisLabels (WifiSpectrumChart.kt:223)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    const v0, 0x31581549

    invoke-interface {p1, v0}, LT/l;->U(I)V

    and-int/lit8 v0, p2, 0xe

    xor-int/lit8 v0, v0, 0x6

    const/4 v1, 0x4

    if-le v0, v1, :cond_1

    invoke-interface {p1, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    and-int/lit8 p2, p2, 0x6

    if-ne p2, v1, :cond_3

    :cond_2
    const/4 p2, 0x1

    goto :goto_0

    :cond_3
    const/4 p2, 0x0

    :goto_0
    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    if-nez p2, :cond_4

    sget-object p2, LT/l;->a:LT/l$a;

    invoke-virtual {p2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p2

    if-ne v0, p2, :cond_7

    :cond_4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, LS8/c;->getChannels()Ljava/util/Set;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p2}, LZg/v;->d0(Ljava/lang/Iterable;)Lzi/j;

    move-result-object p2

    new-instance v1, LBf/i;

    invoke-direct {v1, p0}, LBf/i;-><init>(LS8/c;)V

    invoke-static {p2, v1}, Lzi/m;->C(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object p2

    new-instance v1, LBf/j;

    invoke-direct {v1}, LBf/j;-><init>()V

    invoke-static {p2, v1}, Lzi/m;->N(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object p2

    invoke-static {p2}, Lzi/m;->y(Lzi/j;)Lzi/j;

    move-result-object p2

    invoke-interface {p2}, Lzi/j;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    sget-object p2, LS8/c;->GHZ_2_4:LS8/c;

    if-ne p0, p2, :cond_6

    const p0, 0x451b4000    # 2484.0f

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_6
    invoke-interface {p1, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_7
    check-cast v0, Ljava/util/List;

    invoke-interface {p1}, LT/l;->J()V

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_8

    invoke-static {}, LT/o;->P()V

    :cond_8
    invoke-interface {p1}, LT/l;->J()V

    return-object v0
.end method

.method private static final p(LS8/e;)F
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LS8/e;->e()LS8/e$b;

    move-result-object p0

    instance-of v0, p0, LS8/e$b$b;

    if-eqz v0, :cond_0

    check-cast p0, LS8/e$b$b;

    invoke-virtual {p0}, LS8/e$b$b;->a()I

    move-result p0

    goto :goto_0

    :cond_0
    instance-of v0, p0, LS8/e$b$a;

    if-eqz v0, :cond_1

    check-cast p0, LS8/e$b$a;

    invoke-virtual {p0}, LS8/e$b$a;->d()I

    move-result p0

    :goto_0
    int-to-float p0, p0

    return p0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final q(LS8/c;LS8/e;)Z
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LBf/k$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v1, 0x2

    if-eq p0, v1, :cond_1

    const/4 p1, 0x3

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    invoke-virtual {p1}, LS8/e;->e()LS8/e$b;

    move-result-object p0

    invoke-virtual {p0}, LS8/e$b;->a()I

    move-result p0

    const/16 p1, 0x170c

    if-ge p0, p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :cond_3
    :goto_0
    return v0
.end method

.method private static final r(LT/l;I)Ljava/util/List;
    .locals 6

    const v0, -0xfefc6d4

    invoke-interface {p0, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.wifi.component.chart.rememberYAxisLabels (WifiSpectrumChart.kt:218)"

    invoke-static {v0, p1, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    const p1, 0x1fdb0651

    invoke-interface {p0, p1}, LT/l;->U(I)V

    invoke-interface {p0}, LT/l;->f()Ljava/lang/Object;

    move-result-object p1

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_1

    const/high16 p1, -0x3de00000    # -40.0f

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const/high16 p1, -0x3db80000    # -50.0f

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/high16 p1, -0x3d900000    # -60.0f

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/high16 p1, -0x3d740000    # -70.0f

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const/high16 p1, -0x3d600000    # -80.0f

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    const/high16 p1, -0x3d4c0000    # -90.0f

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    filled-new-array/range {v0 .. v5}, [Ljava/lang/Float;

    move-result-object p1

    invoke-static {p1}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p0, p1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1
    check-cast p1, Ljava/util/List;

    invoke-interface {p0}, LT/l;->J()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
    invoke-interface {p0}, LT/l;->J()V

    return-object p1
.end method

.method private static final s(LS8/c;)Lsh/i;
    .locals 2

    sget-object v0, LBf/k$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    new-instance p0, Lsh/i;

    const/16 v0, 0x1739

    const/16 v1, 0x1bd5

    invoke-direct {p0, v0, v1}, Lsh/i;-><init>(II)V

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    new-instance p0, Lsh/i;

    const/16 v0, 0x141e

    const/16 v1, 0x1707

    invoke-direct {p0, v0, v1}, Lsh/i;-><init>(II)V

    goto :goto_0

    :cond_2
    new-instance p0, Lsh/i;

    const/16 v0, 0x961

    const/16 v1, 0x9bf

    invoke-direct {p0, v0, v1}, Lsh/i;-><init>(II)V

    :goto_0
    return-object p0
.end method
