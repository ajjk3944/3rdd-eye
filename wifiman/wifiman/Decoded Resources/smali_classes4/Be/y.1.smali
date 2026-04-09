.class public abstract LBe/y;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;JLs9/b;Ls9/d;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p8}, LBe/y;->c(Landroidx/compose/ui/e;JLs9/b;Ls9/d;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;JLs9/b;Ls9/d;LT/l;II)V
    .locals 42

    move-object/from16 v5, p4

    move/from16 v6, p6

    const/4 v0, 0x2

    const-string v1, "text"

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, -0x2216544d

    move-object/from16 v2, p5

    invoke-interface {v2, v1}, LT/l;->r(I)LT/l;

    move-result-object v2

    const/4 v3, 0x1

    and-int/lit8 v4, p7, 0x1

    const/4 v7, 0x4

    if-eqz v4, :cond_0

    or-int/lit8 v8, v6, 0x6

    move v9, v8

    move-object/from16 v8, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v8, v6, 0x6

    if-nez v8, :cond_2

    move-object/from16 v8, p0

    invoke-interface {v2, v8}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    move v9, v7

    goto :goto_0

    :cond_1
    move v9, v0

    :goto_0
    or-int/2addr v9, v6

    goto :goto_1

    :cond_2
    move-object/from16 v8, p0

    move v9, v6

    :goto_1
    and-int/lit8 v10, v6, 0x30

    const/16 v11, 0x10

    if-nez v10, :cond_4

    and-int/lit8 v10, p7, 0x2

    move-wide/from16 v12, p1

    if-nez v10, :cond_3

    invoke-interface {v2, v12, v13}, LT/l;->j(J)Z

    move-result v10

    if-eqz v10, :cond_3

    const/16 v10, 0x20

    goto :goto_2

    :cond_3
    move v10, v11

    :goto_2
    or-int/2addr v9, v10

    goto :goto_3

    :cond_4
    move-wide/from16 v12, p1

    :goto_3
    and-int/lit16 v10, v6, 0x180

    if-nez v10, :cond_7

    and-int/lit8 v10, p7, 0x4

    if-nez v10, :cond_5

    move-object/from16 v10, p3

    invoke-interface {v2, v10}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_6

    const/16 v14, 0x100

    goto :goto_4

    :cond_5
    move-object/from16 v10, p3

    :cond_6
    const/16 v14, 0x80

    :goto_4
    or-int/2addr v9, v14

    goto :goto_5

    :cond_7
    move-object/from16 v10, p3

    :goto_5
    and-int/lit8 v14, p7, 0x8

    if-eqz v14, :cond_8

    or-int/lit16 v9, v9, 0xc00

    goto :goto_7

    :cond_8
    and-int/lit16 v14, v6, 0xc00

    if-nez v14, :cond_a

    invoke-interface {v2, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_9

    const/16 v14, 0x800

    goto :goto_6

    :cond_9
    const/16 v14, 0x400

    :goto_6
    or-int/2addr v9, v14

    :cond_a
    :goto_7
    and-int/lit16 v14, v9, 0x493

    const/16 v15, 0x492

    if-ne v14, v15, :cond_c

    invoke-interface {v2}, LT/l;->v()Z

    move-result v14

    if-nez v14, :cond_b

    goto :goto_8

    :cond_b
    invoke-interface {v2}, LT/l;->C()V

    move-object v1, v8

    move-object v4, v10

    move-wide/from16 v40, v12

    goto/16 :goto_d

    :cond_c
    :goto_8
    invoke-interface {v2}, LT/l;->q()V

    and-int/lit8 v14, v6, 0x1

    if-eqz v14, :cond_10

    invoke-interface {v2}, LT/l;->H()Z

    move-result v14

    if-eqz v14, :cond_d

    goto :goto_a

    :cond_d
    invoke-interface {v2}, LT/l;->C()V

    and-int/lit8 v0, p7, 0x2

    if-eqz v0, :cond_e

    and-int/lit8 v9, v9, -0x71

    :cond_e
    and-int/lit8 v0, p7, 0x4

    if-eqz v0, :cond_f

    and-int/lit16 v9, v9, -0x381

    :cond_f
    move-object v0, v8

    move-object v4, v10

    :goto_9
    move-wide v13, v12

    move v12, v9

    goto :goto_b

    :cond_10
    :goto_a
    if-eqz v4, :cond_11

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v8, v4

    :cond_11
    and-int/lit8 v0, p7, 0x2

    if-eqz v0, :cond_12

    sget-object v0, Lla/a;->a:Lla/a;

    sget v4, Lla/a;->b:I

    invoke-virtual {v0, v2, v4}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a;->a()Lma/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lr9/a$a;->f()J

    move-result-wide v12

    and-int/lit8 v9, v9, -0x71

    :cond_12
    and-int/lit8 v0, p7, 0x4

    if-eqz v0, :cond_f

    sget-object v0, LN9/b;->a:LN9/b;

    invoke-virtual {v0}, LN9/b;->A()Ls9/b;

    move-result-object v0

    and-int/lit16 v9, v9, -0x381

    move-object v4, v0

    move-object v0, v8

    goto :goto_9

    :goto_b
    invoke-interface {v2}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v8

    if-eqz v8, :cond_13

    const/4 v8, -0x1

    const-string v9, "com.ui.wifiman.ui.component.NoteBox (NoteBox.kt:35)"

    invoke-static {v1, v12, v8, v9}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_13
    int-to-float v1, v3

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    int-to-float v3, v7

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v3}, LE/h;->d(F)LE/g;

    move-result-object v3

    invoke-static {v0, v1, v13, v14, v3}, Ls/e;->f(Landroidx/compose/ui/e;FJLm0/i1;)Landroidx/compose/ui/e;

    move-result-object v1

    int-to-float v3, v11

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v7

    invoke-static {v1, v7}, Landroidx/compose/foundation/layout/o;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v7, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v7}, Lf0/c$a;->l()Lf0/c$c;

    move-result-object v7

    sget-object v8, Lz/c;->a:Lz/c;

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    invoke-virtual {v8, v3}, Lz/c;->n(F)Lz/c$f;

    move-result-object v3

    const/16 v8, 0x36

    invoke-static {v3, v7, v2, v8}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v3

    const/4 v7, 0x0

    invoke-static {v2, v7}, LT/j;->a(LT/l;I)I

    move-result v7

    invoke-interface {v2}, LT/l;->G()LT/x;

    move-result-object v8

    invoke-static {v2, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v9, LE0/g;->K:LE0/g$a;

    invoke-virtual {v9}, LE0/g$a;->a()Lmh/a;

    move-result-object v10

    invoke-interface {v2}, LT/l;->x()LT/f;

    move-result-object v11

    if-nez v11, :cond_14

    invoke-static {}, LT/j;->c()V

    :cond_14
    invoke-interface {v2}, LT/l;->u()V

    invoke-interface {v2}, LT/l;->o()Z

    move-result v11

    if-eqz v11, :cond_15

    invoke-interface {v2, v10}, LT/l;->D(Lmh/a;)V

    goto :goto_c

    :cond_15
    invoke-interface {v2}, LT/l;->I()V

    :goto_c
    invoke-static {v2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v10

    invoke-virtual {v9}, LE0/g$a;->e()Lmh/p;

    move-result-object v11

    invoke-static {v10, v3, v11}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v10, v8, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v10}, LT/l;->o()Z

    move-result v8

    if-nez v8, :cond_16

    invoke-interface {v10}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v8, v11}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_17

    :cond_16
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v10, v8}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v10, v7, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_17
    invoke-virtual {v9}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v10, v1, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v1, Lz/Z;->a:Lz/Z;

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v15, v1

    const/16 v3, 0x18

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v8

    invoke-static {v13, v14}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v9

    shr-int/lit8 v1, v12, 0x6

    and-int/lit8 v1, v1, 0xe

    or-int/lit8 v1, v1, 0x30

    shl-int/lit8 v3, v12, 0x3

    and-int/lit16 v3, v3, 0x380

    or-int/2addr v1, v3

    const/4 v3, 0x4

    const/4 v10, 0x0

    move-object v7, v4

    move-object v11, v2

    move/from16 v16, v12

    move v12, v1

    move-wide/from16 v40, v13

    move v13, v3

    invoke-static/range {v7 .. v13}, Lta/c;->c(Ls9/b;Landroidx/compose/ui/e;Lm0/v0;Ljava/lang/String;LT/l;II)V

    shr-int/lit8 v1, v16, 0x9

    and-int/lit8 v1, v1, 0xe

    invoke-static {v5, v2, v1}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v14

    sget-object v1, Lla/a;->a:Lla/a;

    sget v3, Lla/a;->b:I

    invoke-virtual {v1, v2, v3}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v7

    invoke-virtual {v7}, Lpa/c;->b()Lpa/b;

    move-result-object v7

    invoke-virtual {v7}, Lpa/b;->a()LL0/U;

    move-result-object v35

    invoke-virtual {v1, v2, v3}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a;->f()Lma/a$f;

    move-result-object v1

    invoke-virtual {v1}, Lma/a$f;->a()J

    move-result-wide v16

    const/16 v38, 0x0

    const v39, 0x1fff8

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const-wide/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v37, 0x30

    move-object/from16 v36, v2

    invoke-static/range {v14 .. v39}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-interface {v2}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_18

    invoke-static {}, LT/o;->P()V

    :cond_18
    move-object v1, v0

    :goto_d
    invoke-interface {v2}, LT/l;->z()LT/X0;

    move-result-object v8

    if-eqz v8, :cond_19

    new-instance v9, LBe/x;

    move-object v0, v9

    move-wide/from16 v2, v40

    move-object/from16 v5, p4

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, LBe/x;-><init>(Landroidx/compose/ui/e;JLs9/b;Ls9/d;II)V

    invoke-interface {v8, v9}, LT/X0;->a(Lmh/p;)V

    :cond_19
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;JLs9/b;Ls9/d;IILT/l;I)LYg/J;
    .locals 9

    or-int/lit8 v0, p5, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v7

    move-object v1, p0

    move-wide v2, p1

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p7

    move v8, p6

    invoke-static/range {v1 .. v8}, LBe/y;->b(Landroidx/compose/ui/e;JLs9/b;Ls9/d;LT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
