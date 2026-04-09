.class public abstract LTe/M0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LTe/M0;->c(Landroidx/compose/ui/e;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;LT/l;I)V
    .locals 30

    move-object/from16 v0, p0

    move/from16 v1, p2

    const-string v2, "modifier"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x4c89a199    # 7.215841E7f

    move-object/from16 v3, p1

    invoke-interface {v3, v2}, LT/l;->r(I)LT/l;

    move-result-object v15

    and-int/lit8 v3, v1, 0x6

    const/4 v14, 0x2

    if-nez v3, :cond_1

    invoke-interface {v15, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move v3, v14

    :goto_0
    or-int/2addr v3, v1

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    and-int/lit8 v4, v3, 0x3

    if-ne v4, v14, :cond_3

    invoke-interface {v15}, LT/l;->v()Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {v15}, LT/l;->C()V

    move-object/from16 v29, v15

    goto/16 :goto_5

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_4

    const/4 v4, -0x1

    const-string v5, "com.ui.wifiman.ui.signal.components.SignalTabThroughputOnlyOnUDM (SignalTabThroughputOnlyOnUDM.kt:27)"

    invoke-static {v2, v3, v4, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    const/16 v2, 0xc0

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v0, v3}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v16, Lf0/c;->a:Lf0/c$a;

    invoke-virtual/range {v16 .. v16}, Lf0/c$a;->b()Lf0/c;

    move-result-object v4

    const/4 v13, 0x0

    invoke-static {v4, v13}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v4

    invoke-static {v15, v13}, LT/j;->a(LT/l;I)I

    move-result v5

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v6

    invoke-static {v15, v3}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v17, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->a()Lmh/a;

    move-result-object v7

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v8

    if-nez v8, :cond_5

    invoke-static {}, LT/j;->c()V

    :cond_5
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-interface {v15, v7}, LT/l;->D(Lmh/a;)V

    goto :goto_3

    :cond_6
    invoke-interface {v15}, LT/l;->I()V

    :goto_3
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v7

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->e()Lmh/p;

    move-result-object v8

    invoke-static {v7, v4, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->g()Lmh/p;

    move-result-object v4

    invoke-static {v7, v6, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->b()Lmh/p;

    move-result-object v4

    invoke-interface {v7}, LT/l;->o()Z

    move-result v6

    if-nez v6, :cond_7

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_8

    :cond_7
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v7, v6}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v7, v5, v4}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_8
    invoke-virtual/range {v17 .. v17}, LE0/g$a;->f()Lmh/p;

    move-result-object v4

    invoke-static {v7, v3, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    new-instance v3, Ls9/c$a;

    sget v4, Lm8/a;->r0:I

    const/4 v12, 0x0

    invoke-direct {v3, v4, v12, v14, v12}, Ls9/c$a;-><init>(ILs9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v11, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    invoke-static {v11, v2}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v4

    const/16 v2, 0x30

    const/16 v18, 0xfe

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v19, 0x0

    move-object/from16 v29, v11

    move-object/from16 v11, v19

    move-object v12, v15

    move v13, v2

    move v2, v14

    move/from16 v14, v18

    invoke-static/range {v3 .. v14}, Lta/c;->e(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;Lf0/c;LC0/h;FLm0/w0;LT/l;II)V

    const/high16 v3, 0x3f000000    # 0.5f

    move-object/from16 v4, v29

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/r;->c(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v3

    const/16 v4, 0x18

    int-to-float v4, v4

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v2, v6}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-virtual/range {v16 .. v16}, Lf0/c$a;->e()Lf0/c;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v3

    invoke-static {v15, v4}, LT/j;->a(LT/l;I)I

    move-result v5

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v6

    invoke-static {v15, v2}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->a()Lmh/a;

    move-result-object v7

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v8

    if-nez v8, :cond_9

    invoke-static {}, LT/j;->c()V

    :cond_9
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v8

    if-eqz v8, :cond_a

    invoke-interface {v15, v7}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_a
    invoke-interface {v15}, LT/l;->I()V

    :goto_4
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v7

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->e()Lmh/p;

    move-result-object v8

    invoke-static {v7, v3, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v7, v6, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v7}, LT/l;->o()Z

    move-result v6

    if-nez v6, :cond_b

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_c

    :cond_b
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v7, v6}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v7, v5, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_c
    invoke-virtual/range {v17 .. v17}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v7, v2, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    new-instance v2, Ls9/d$b;

    sget v3, Lm8/c;->F2:I

    invoke-direct {v2, v3}, Ls9/d$b;-><init>(I)V

    invoke-static {v2, v15, v4}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v3

    sget-object v2, Lla/a;->a:Lla/a;

    sget v4, Lla/a;->b:I

    invoke-virtual {v2, v15, v4}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v5

    invoke-virtual {v5}, Lpa/c;->b()Lpa/b;

    move-result-object v5

    invoke-virtual {v5}, Lpa/b;->a()LL0/U;

    move-result-object v24

    invoke-virtual {v2, v15, v4}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->f()Lma/a$f;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$f;->c()J

    move-result-wide v5

    sget-object v2, LW0/j;->b:LW0/j$a;

    invoke-virtual {v2}, LW0/j$a;->a()I

    move-result v2

    invoke-static {v2}, LW0/j;->h(I)LW0/j;

    move-result-object v2

    move-object/from16 v29, v15

    move-object v15, v2

    const/16 v27, 0x0

    const v28, 0x1fdfa

    const/4 v4, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v26, 0x0

    move-object/from16 v25, v29

    invoke-static/range {v3 .. v28}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-interface/range {v29 .. v29}, LT/l;->R()V

    invoke-interface/range {v29 .. v29}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-static {}, LT/o;->P()V

    :cond_d
    :goto_5
    invoke-interface/range {v29 .. v29}, LT/l;->z()LT/X0;

    move-result-object v2

    if-eqz v2, :cond_e

    new-instance v3, LTe/L0;

    invoke-direct {v3, v0, v1}, LTe/L0;-><init>(Landroidx/compose/ui/e;I)V

    invoke-interface {v2, v3}, LT/X0;->a(Lmh/p;)V

    :cond_e
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, LT/L0;->a(I)I

    move-result p1

    invoke-static {p0, p2, p1}, LTe/M0;->b(Landroidx/compose/ui/e;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
