.class public abstract Lkf/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;Lkf/b;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, Lkf/f;->c(Landroidx/compose/ui/e;Lkf/b;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;Lkf/b;LT/l;II)V
    .locals 18

    move-object/from16 v0, p1

    move/from16 v1, p3

    move/from16 v2, p4

    const-string v3, "vm"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, 0xfffeadd

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LT/l;->r(I)LT/l;

    move-result-object v15

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

    invoke-interface {v15, v5}, LT/l;->T(Ljava/lang/Object;)Z

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

    invoke-interface {v15, v0}, LT/l;->T(Ljava/lang/Object;)Z

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

    invoke-interface {v15}, LT/l;->v()Z

    move-result v7

    if-nez v7, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {v15}, LT/l;->C()V

    move-object v3, v5

    move-object/from16 v16, v15

    goto/16 :goto_6

    :cond_7
    :goto_4
    if-eqz v4, :cond_8

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v14, v4

    goto :goto_5

    :cond_8
    move-object v14, v5

    :goto_5
    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_9

    const/4 v4, -0x1

    const-string v5, "com.ui.wifiman.ui.speedtest.results.SpeedtestResultsContentUi (SpeedtestResultsContentUi.kt:19)"

    invoke-static {v3, v6, v4, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_9
    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v14, v3, v4, v5}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lkf/b;->n0()LLi/N;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v6, v5, v15, v7, v4}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v6

    invoke-interface {v6}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LEe/g;

    invoke-virtual/range {p1 .. p1}, Lkf/b;->p0()LLi/N;

    move-result-object v8

    invoke-static {v8, v5, v15, v7, v4}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v5

    invoke-interface {v5}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    new-instance v5, Lkf/f$a;

    invoke-direct {v5, v0}, Lkf/f$a;-><init>(Lkf/b;)V

    const v8, 0x5d82882

    const/16 v9, 0x36

    invoke-static {v8, v4, v5, v15, v9}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v11

    new-instance v5, Lkf/f$b;

    invoke-direct {v5, v0}, Lkf/f$b;-><init>(Lkf/b;)V

    const v8, -0x996ea3c

    invoke-static {v8, v4, v5, v15, v9}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v12

    const/high16 v16, 0x6c00000

    const/16 v17, 0x78

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x0

    move-object v4, v3

    move-object v5, v6

    move v6, v7

    move-object v7, v8

    move v8, v9

    move v9, v10

    move-object v10, v13

    move-object v13, v15

    move-object v3, v14

    move/from16 v14, v16

    move-object/from16 v16, v15

    move/from16 v15, v17

    invoke-static/range {v4 .. v15}, LEe/z;->B(Landroidx/compose/ui/e;LEe/g;ZLmh/l;ZZLmh/r;Lmh/r;Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-static {}, LT/o;->P()V

    :cond_a
    :goto_6
    invoke-interface/range {v16 .. v16}, LT/l;->z()LT/X0;

    move-result-object v4

    if-eqz v4, :cond_b

    new-instance v5, Lkf/c;

    invoke-direct {v5, v3, v0, v1, v2}, Lkf/c;-><init>(Landroidx/compose/ui/e;Lkf/b;II)V

    invoke-interface {v4, v5}, LT/X0;->a(Lmh/p;)V

    :cond_b
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;Lkf/b;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lkf/f;->b(Landroidx/compose/ui/e;Lkf/b;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
