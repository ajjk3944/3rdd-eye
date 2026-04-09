.class public abstract LAf/G;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;Ls9/d;Ls9/d;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p6}, LAf/G;->c(Landroidx/compose/ui/e;Ls9/d;Ls9/d;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;Ls9/d;Ls9/d;LT/l;II)V
    .locals 37

    move-object/from16 v2, p1

    move/from16 v4, p4

    const-string v0, "title"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x6e179c79

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v1

    and-int/lit8 v3, p5, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v5, v4, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v4, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-interface {v1, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v4

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v6, v4

    :goto_1
    and-int/lit8 v7, p5, 0x2

    if-eqz v7, :cond_3

    or-int/lit8 v6, v6, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v7, v4, 0x30

    if-nez v7, :cond_5

    invoke-interface {v1, v2}, LT/l;->T(Ljava/lang/Object;)Z

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
    and-int/lit8 v7, p5, 0x4

    if-eqz v7, :cond_7

    or-int/lit16 v6, v6, 0x180

    :cond_6
    move-object/from16 v8, p2

    :goto_4
    move v14, v6

    goto :goto_6

    :cond_7
    and-int/lit16 v8, v4, 0x180

    if-nez v8, :cond_6

    move-object/from16 v8, p2

    invoke-interface {v1, v8}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x100

    goto :goto_5

    :cond_8
    const/16 v9, 0x80

    :goto_5
    or-int/2addr v6, v9

    goto :goto_4

    :goto_6
    and-int/lit16 v6, v14, 0x93

    const/16 v9, 0x92

    if-ne v6, v9, :cond_a

    invoke-interface {v1}, LT/l;->v()Z

    move-result v6

    if-nez v6, :cond_9

    goto :goto_7

    :cond_9
    invoke-interface {v1}, LT/l;->C()V

    move-object v3, v5

    goto/16 :goto_c

    :cond_a
    :goto_7
    if-eqz v3, :cond_b

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_8

    :cond_b
    move-object v3, v5

    :goto_8
    if-eqz v7, :cond_c

    const/4 v5, 0x0

    move-object v15, v5

    goto :goto_9

    :cond_c
    move-object v15, v8

    :goto_9
    invoke-static {}, LT/o;->H()Z

    move-result v5

    if-eqz v5, :cond_d

    const/4 v5, -0x1

    const-string v6, "com.ui.wifiman.ui.wifi.component.WifiTopCollapsibleContentHeader (WifiTopCollapsibleContentHeader.kt:18)"

    invoke-static {v0, v14, v5, v6}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_d
    sget-object v0, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v0}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v0

    sget-object v5, Lz/c;->a:Lz/c;

    invoke-virtual {v5}, Lz/c;->f()Lz/c$e;

    move-result-object v5

    const/16 v6, 0x30

    invoke-static {v5, v0, v1, v6}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v0

    const/4 v13, 0x0

    invoke-static {v1, v13}, LT/j;->a(LT/l;I)I

    move-result v5

    invoke-interface {v1}, LT/l;->G()LT/x;

    move-result-object v6

    invoke-static {v1, v3}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v7

    sget-object v8, LE0/g;->K:LE0/g$a;

    invoke-virtual {v8}, LE0/g$a;->a()Lmh/a;

    move-result-object v9

    invoke-interface {v1}, LT/l;->x()LT/f;

    move-result-object v10

    if-nez v10, :cond_e

    invoke-static {}, LT/j;->c()V

    :cond_e
    invoke-interface {v1}, LT/l;->u()V

    invoke-interface {v1}, LT/l;->o()Z

    move-result v10

    if-eqz v10, :cond_f

    invoke-interface {v1, v9}, LT/l;->D(Lmh/a;)V

    goto :goto_a

    :cond_f
    invoke-interface {v1}, LT/l;->I()V

    :goto_a
    invoke-static {v1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v9

    invoke-virtual {v8}, LE0/g$a;->e()Lmh/p;

    move-result-object v10

    invoke-static {v9, v0, v10}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v8}, LE0/g$a;->g()Lmh/p;

    move-result-object v0

    invoke-static {v9, v6, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v8}, LE0/g$a;->b()Lmh/p;

    move-result-object v0

    invoke-interface {v9}, LT/l;->o()Z

    move-result v6

    if-nez v6, :cond_10

    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v6, v10}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_11

    :cond_10
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v9, v6}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v9, v5, v0}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_11
    invoke-virtual {v8}, LE0/g$a;->f()Lmh/p;

    move-result-object v0

    invoke-static {v9, v7, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v0, Lz/Z;->a:Lz/Z;

    sget-object v31, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object/from16 v6, v31

    shr-int/lit8 v5, v14, 0x3

    and-int/lit8 v5, v5, 0xe

    invoke-static {v2, v1, v5}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v5

    sget-object v12, Lla/a;->a:Lla/a;

    sget v11, Lla/a;->b:I

    invoke-virtual {v12, v1, v11}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v7

    invoke-virtual {v7}, Lpa/c;->a()Lpa/b;

    move-result-object v7

    invoke-virtual {v7}, Lpa/b;->a()LL0/U;

    move-result-object v26

    invoke-virtual {v12, v1, v11}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v7

    invoke-virtual {v7}, Lma/a;->f()Lma/a$f;

    move-result-object v7

    invoke-virtual {v7}, Lma/a$f;->a()J

    move-result-wide v7

    sget-object v32, LW0/j;->b:LW0/j$a;

    invoke-virtual/range {v32 .. v32}, LW0/j$a;->f()I

    move-result v9

    invoke-static {v9}, LW0/j;->h(I)LW0/j;

    move-result-object v17

    const/16 v29, 0x0

    const v30, 0x1fdf8

    const-wide/16 v9, 0x0

    const/16 v16, 0x0

    move/from16 v33, v11

    move-object/from16 v11, v16

    move-object/from16 v34, v12

    move-object/from16 v12, v16

    move-object/from16 v13, v16

    const-wide/16 v18, 0x0

    move/from16 v35, v14

    move-object/from16 v36, v15

    move-wide/from16 v14, v18

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v28, 0x30

    move-object/from16 v27, v1

    invoke-static/range {v5 .. v30}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    const/16 v20, 0x2

    const/16 v21, 0x0

    const/high16 v18, 0x3f800000    # 1.0f

    const/16 v19, 0x0

    move-object/from16 v16, v0

    move-object/from16 v17, v31

    invoke-static/range {v16 .. v21}, Lz/Y;->b(Lz/Y;Landroidx/compose/ui/e;FZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    const/4 v5, 0x0

    invoke-static {v0, v1, v5}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    const v0, -0x4c3ad358

    invoke-interface {v1, v0}, LT/l;->U(I)V

    move-object/from16 v0, v36

    if-nez v0, :cond_12

    goto :goto_b

    :cond_12
    shr-int/lit8 v5, v35, 0x6

    and-int/lit8 v5, v5, 0xe

    invoke-static {v0, v1, v5}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v5

    move/from16 v7, v33

    move-object/from16 v6, v34

    invoke-virtual {v6, v1, v7}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v8

    invoke-virtual {v8}, Lpa/c;->b()Lpa/b;

    move-result-object v8

    invoke-virtual {v8}, Lpa/b;->a()LL0/U;

    move-result-object v26

    invoke-virtual {v6, v1, v7}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v6

    invoke-virtual {v6}, Lma/a;->f()Lma/a$f;

    move-result-object v6

    invoke-virtual {v6}, Lma/a$f;->b()J

    move-result-wide v7

    invoke-virtual/range {v32 .. v32}, LW0/j$a;->b()I

    move-result v6

    invoke-static {v6}, LW0/j;->h(I)LW0/j;

    move-result-object v17

    const/16 v29, 0x0

    const v30, 0x1fdf8

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v28, 0x30

    move-object/from16 v6, v31

    move-object/from16 v27, v1

    invoke-static/range {v5 .. v30}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    :goto_b
    invoke-interface {v1}, LT/l;->J()V

    invoke-interface {v1}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v5

    if-eqz v5, :cond_13

    invoke-static {}, LT/o;->P()V

    :cond_13
    move-object v8, v0

    :goto_c
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v6

    if-eqz v6, :cond_14

    new-instance v7, LAf/F;

    move-object v0, v7

    move-object v1, v3

    move-object/from16 v2, p1

    move-object v3, v8

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, LAf/F;-><init>(Landroidx/compose/ui/e;Ls9/d;Ls9/d;II)V

    invoke-interface {v6, v7}, LT/X0;->a(Lmh/p;)V

    :cond_14
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;Ls9/d;Ls9/d;IILT/l;I)LYg/J;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, LT/L0;->a(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p5

    move v5, p4

    invoke-static/range {v0 .. v5}, LAf/G;->b(Landroidx/compose/ui/e;Ls9/d;Ls9/d;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
