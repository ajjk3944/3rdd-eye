.class public abstract LUe/q;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;Ls9/d;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, LUe/q;->c(Landroidx/compose/ui/e;Ls9/d;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;Ls9/d;LT/l;II)V
    .locals 33

    move-object/from16 v0, p1

    move/from16 v1, p3

    move/from16 v2, p4

    const/4 v3, 0x2

    const/4 v4, 0x6

    const-string v5, "ssid"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v5, 0x79931e35

    move-object/from16 v6, p2

    invoke-interface {v6, v5}, LT/l;->r(I)LT/l;

    move-result-object v15

    and-int/lit8 v6, v2, 0x1

    if-eqz v6, :cond_0

    or-int/lit8 v7, v1, 0x6

    move v8, v7

    move-object/from16 v7, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v7, v1, 0x6

    if-nez v7, :cond_2

    move-object/from16 v7, p0

    invoke-interface {v15, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    const/4 v8, 0x4

    goto :goto_0

    :cond_1
    move v8, v3

    :goto_0
    or-int/2addr v8, v1

    goto :goto_1

    :cond_2
    move-object/from16 v7, p0

    move v8, v1

    :goto_1
    and-int/2addr v3, v2

    if-eqz v3, :cond_4

    or-int/lit8 v8, v8, 0x30

    :cond_3
    :goto_2
    move v3, v8

    goto :goto_4

    :cond_4
    and-int/lit8 v3, v1, 0x30

    if-nez v3, :cond_3

    invoke-interface {v15, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    const/16 v3, 0x20

    goto :goto_3

    :cond_5
    const/16 v3, 0x10

    :goto_3
    or-int/2addr v8, v3

    goto :goto_2

    :goto_4
    and-int/lit8 v8, v3, 0x13

    const/16 v9, 0x12

    if-ne v8, v9, :cond_7

    invoke-interface {v15}, LT/l;->v()Z

    move-result v8

    if-nez v8, :cond_6

    goto :goto_5

    :cond_6
    invoke-interface {v15}, LT/l;->C()V

    move-object v4, v7

    move-object v3, v15

    goto/16 :goto_8

    :cond_7
    :goto_5
    if-eqz v6, :cond_8

    sget-object v6, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v14, v6

    goto :goto_6

    :cond_8
    move-object v14, v7

    :goto_6
    invoke-static {}, LT/o;->H()Z

    move-result v6

    if-eqz v6, :cond_9

    const/4 v6, -0x1

    const-string v7, "com.ui.wifiman.ui.signal.floorplan.component.FloorplanConnectionInfoBar (FloorplanConnectionInfoBar.kt:23)"

    invoke-static {v5, v3, v6, v7}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_9
    sget-object v5, Lz/c;->a:Lz/c;

    invoke-virtual {v5}, Lz/c;->b()Lz/c$f;

    move-result-object v5

    sget-object v6, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v6}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v6

    const/16 v7, 0x36

    invoke-static {v5, v6, v15, v7}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v15, v6}, LT/j;->a(LT/l;I)I

    move-result v6

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v7

    invoke-static {v15, v14}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v8

    sget-object v9, LE0/g;->K:LE0/g$a;

    invoke-virtual {v9}, LE0/g$a;->a()Lmh/a;

    move-result-object v10

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v11

    if-nez v11, :cond_a

    invoke-static {}, LT/j;->c()V

    :cond_a
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v11

    if-eqz v11, :cond_b

    invoke-interface {v15, v10}, LT/l;->D(Lmh/a;)V

    goto :goto_7

    :cond_b
    invoke-interface {v15}, LT/l;->I()V

    :goto_7
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v10

    invoke-virtual {v9}, LE0/g$a;->e()Lmh/p;

    move-result-object v11

    invoke-static {v10, v5, v11}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->g()Lmh/p;

    move-result-object v5

    invoke-static {v10, v7, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->b()Lmh/p;

    move-result-object v5

    invoke-interface {v10}, LT/l;->o()Z

    move-result v7

    if-nez v7, :cond_c

    invoke-interface {v10}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v7, v11}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_d

    :cond_c
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v10, v7}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v10, v6, v5}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_d
    invoke-virtual {v9}, LE0/g$a;->f()Lmh/p;

    move-result-object v5

    invoke-static {v10, v8, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v5, Lz/Z;->a:Lz/Z;

    sget-object v5, LPe/a;->a:LPe/a;

    invoke-virtual {v5}, LPe/a;->d0()Ls9/b;

    move-result-object v6

    sget-object v5, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 v7, 0x14

    int-to-float v7, v7

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v7

    invoke-static {v5, v7}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v7

    sget-object v13, Lla/a;->a:Lla/a;

    sget v12, Lla/a;->b:I

    invoke-virtual {v13, v15, v12}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v8

    invoke-virtual {v8}, Lma/a;->a()Lma/a$a;

    move-result-object v8

    invoke-virtual {v8}, Lma/a$a;->d()Lr9/a$a;

    move-result-object v8

    invoke-virtual {v8}, Lr9/a$a;->f()J

    move-result-wide v8

    invoke-static {v8, v9}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v8

    const/16 v11, 0x36

    const/16 v16, 0x4

    const/4 v9, 0x0

    move-object v10, v15

    move/from16 v32, v12

    move/from16 v12, v16

    invoke-static/range {v6 .. v12}, Lta/c;->c(Ls9/b;Landroidx/compose/ui/e;Lm0/v0;Ljava/lang/String;LT/l;II)V

    int-to-float v6, v4

    invoke-static {v6}, LY0/h;->j(F)F

    move-result v6

    invoke-static {v5, v6}, Landroidx/compose/foundation/layout/r;->z(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v5

    invoke-static {v5, v15, v4}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    shr-int/lit8 v3, v3, 0x3

    and-int/lit8 v3, v3, 0xe

    invoke-static {v0, v15, v3}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v6

    move/from16 v3, v32

    invoke-virtual {v13, v15, v3}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v4

    invoke-virtual {v4}, Lpa/c;->b()Lpa/b;

    move-result-object v4

    invoke-virtual {v4}, Lpa/b;->a()LL0/U;

    move-result-object v27

    invoke-virtual {v13, v15, v3}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->f()Lma/a$f;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$f;->c()J

    move-result-wide v8

    sget-object v3, LW0/t;->a:LW0/t$a;

    invoke-virtual {v3}, LW0/t$a;->b()I

    move-result v21

    const/16 v30, 0xc30

    const v31, 0x1d7fa

    const/4 v7, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v3, 0x0

    move-object v4, v14

    move-object v14, v3

    const-wide/16 v16, 0x0

    move-object v3, v15

    move-wide/from16 v15, v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x1

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v29, 0x0

    move-object/from16 v28, v3

    invoke-static/range {v6 .. v31}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-interface {v3}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v5

    if-eqz v5, :cond_e

    invoke-static {}, LT/o;->P()V

    :cond_e
    :goto_8
    invoke-interface {v3}, LT/l;->z()LT/X0;

    move-result-object v3

    if-eqz v3, :cond_f

    new-instance v5, LUe/p;

    invoke-direct {v5, v4, v0, v1, v2}, LUe/p;-><init>(Landroidx/compose/ui/e;Ls9/d;II)V

    invoke-interface {v3, v5}, LT/X0;->a(Lmh/p;)V

    :cond_f
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;Ls9/d;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, LUe/q;->b(Landroidx/compose/ui/e;Ls9/d;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
