.class public abstract Lcom/ui/wifiman/ui/teleport/consoles/u;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/ui/teleport/consoles/u$i;
    }
.end annotation


# direct methods
.method private static final A(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/consoles/h$a;LT/l;I)V
    .locals 32

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const v3, -0x2e80dc7

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LT/l;->r(I)LT/l;

    move-result-object v15

    and-int/lit8 v4, v2, 0x6

    const/4 v5, 0x4

    if-nez v4, :cond_1

    invoke-interface {v15, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    move v4, v5

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v2

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    and-int/lit8 v6, v2, 0x30

    if-nez v6, :cond_3

    invoke-interface {v15, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v4, v6

    :cond_3
    and-int/lit8 v6, v4, 0x13

    const/16 v13, 0x12

    if-ne v6, v13, :cond_5

    invoke-interface {v15}, LT/l;->v()Z

    move-result v6

    if-nez v6, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v15}, LT/l;->C()V

    move-object v11, v15

    goto/16 :goto_7

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v6

    if-eqz v6, :cond_6

    const/4 v6, -0x1

    const-string v7, "com.ui.wifiman.ui.teleport.consoles.TeleportConsoleTitleRow (TeleportConsolePickerUi.kt:183)"

    invoke-static {v3, v4, v6, v7}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    sget-object v3, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v3}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v3

    sget-object v4, Lz/c;->a:Lz/c;

    int-to-float v5, v5

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    invoke-virtual {v4, v5}, Lz/c;->n(F)Lz/c$f;

    move-result-object v4

    const/16 v5, 0x36

    invoke-static {v4, v3, v15, v5}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v15, v4}, LT/j;->a(LT/l;I)I

    move-result v5

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v6

    invoke-static {v15, v0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v7

    sget-object v8, LE0/g;->K:LE0/g$a;

    invoke-virtual {v8}, LE0/g$a;->a()Lmh/a;

    move-result-object v9

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v10

    if-nez v10, :cond_7

    invoke-static {}, LT/j;->c()V

    :cond_7
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-interface {v15, v9}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_8
    invoke-interface {v15}, LT/l;->I()V

    :goto_4
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v9

    invoke-virtual {v8}, LE0/g$a;->e()Lmh/p;

    move-result-object v10

    invoke-static {v9, v3, v10}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v8}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v9, v6, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v8}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v9}, LT/l;->o()Z

    move-result v6

    if-nez v6, :cond_9

    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v6, v10}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_a

    :cond_9
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v9, v6}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v9, v5, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_a
    invoke-virtual {v8}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v9, v7, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Lz/Z;->a:Lz/Z;

    sget-object v14, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-interface {v3, v14, v5, v4}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->i()Ls9/d;

    move-result-object v3

    invoke-static {v3, v15, v4}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v4

    sget-object v3, Lla/a;->a:Lla/a;

    sget v12, Lla/a;->b:I

    invoke-virtual {v3, v15, v12}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v6

    invoke-virtual {v6}, Lma/a;->f()Lma/a$f;

    move-result-object v6

    invoke-virtual {v6}, Lma/a$f;->a()J

    move-result-wide v6

    invoke-virtual {v3, v15, v12}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v8

    invoke-virtual {v8}, Lpa/c;->b()Lpa/b;

    move-result-object v8

    invoke-virtual {v8}, Lpa/b;->b()LL0/U;

    move-result-object v25

    sget-object v8, LW0/t;->a:LW0/t$a;

    invoke-virtual {v8}, LW0/t$a;->b()I

    move-result v19

    const/16 v28, 0xc30

    const v29, 0x1d7f8

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v16, 0x0

    move/from16 v30, v12

    move-object/from16 v12, v16

    const-wide/16 v16, 0x0

    move-object/from16 v31, v14

    move-wide/from16 v13, v16

    const/16 v16, 0x0

    move-object/from16 p2, v15

    move-object/from16 v15, v16

    const-wide/16 v17, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x1

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v27, 0x0

    move-object/from16 v26, p2

    invoke-static/range {v4 .. v29}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->b()Lcom/ui/wifiman/ui/teleport/consoles/h$a$a;

    move-result-object v4

    const v5, 0x1707e469

    move-object/from16 v11, p2

    invoke-interface {v11, v5}, LT/l;->U(I)V

    sget-object v5, Lcom/ui/wifiman/ui/teleport/consoles/h$a$a;->CONNECTED:Lcom/ui/wifiman/ui/teleport/consoles/h$a$a;

    if-ne v4, v5, :cond_b

    sget-object v4, LPe/a;->a:LPe/a;

    invoke-virtual {v4}, LPe/a;->S()Ls9/b;

    move-result-object v4

    const/16 v5, 0x18

    int-to-float v5, v5

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    move-object/from16 v12, v31

    invoke-static {v12, v5}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v5

    move/from16 v13, v30

    invoke-virtual {v3, v11, v13}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v6

    invoke-virtual {v6}, Lma/a;->a()Lma/a$a;

    move-result-object v6

    invoke-virtual {v6}, Lma/a$a;->i()J

    move-result-wide v6

    invoke-static {v6, v7}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v6

    const/16 v9, 0x36

    const/4 v10, 0x4

    const/4 v7, 0x0

    move-object v8, v11

    invoke-static/range {v4 .. v10}, Lta/c;->c(Ls9/b;Landroidx/compose/ui/e;Lm0/v0;Ljava/lang/String;LT/l;II)V

    goto :goto_5

    :cond_b
    move/from16 v13, v30

    move-object/from16 v12, v31

    sget-object v5, Lcom/ui/wifiman/ui/teleport/consoles/h$a$a;->CONNECTABLE:Lcom/ui/wifiman/ui/teleport/consoles/h$a$a;

    if-eq v4, v5, :cond_d

    sget-object v5, Lcom/ui/wifiman/ui/teleport/consoles/h$a$a;->CONNECTION_NOT_POSSIBLE:Lcom/ui/wifiman/ui/teleport/consoles/h$a$a;

    if-eq v4, v5, :cond_d

    if-nez v4, :cond_c

    goto :goto_5

    :cond_c
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_d
    :goto_5
    invoke-interface {v11}, LT/l;->J()V

    const v4, 0x17082bb7    # 4.3999146E-25f

    invoke-interface {v11, v4}, LT/l;->U(I)V

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->f()Z

    move-result v4

    if-eqz v4, :cond_f

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->j()Ljava/lang/Boolean;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_e

    const v4, -0x3601a595

    invoke-interface {v11, v4}, LT/l;->U(I)V

    sget-object v4, LPe/a;->a:LPe/a;

    invoke-virtual {v4}, LPe/a;->u()Ls9/b;

    move-result-object v4

    const/16 v5, 0x12

    int-to-float v5, v5

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    invoke-static {v12, v5}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v5

    invoke-virtual {v3, v11, v13}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->a()Lma/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$a;->j()J

    move-result-wide v6

    invoke-static {v6, v7}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v6

    const/16 v9, 0x36

    const/4 v10, 0x4

    const/4 v7, 0x0

    move-object v8, v11

    invoke-static/range {v4 .. v10}, Lta/c;->c(Ls9/b;Landroidx/compose/ui/e;Lm0/v0;Ljava/lang/String;LT/l;II)V

    invoke-interface {v11}, LT/l;->J()V

    goto :goto_6

    :cond_e
    const/16 v5, 0x12

    const v4, -0x35fdb9b7

    invoke-interface {v11, v4}, LT/l;->U(I)V

    sget-object v4, LPe/a;->a:LPe/a;

    invoke-virtual {v4}, LPe/a;->v()Ls9/b;

    move-result-object v4

    int-to-float v5, v5

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    invoke-static {v12, v5}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v5

    invoke-virtual {v3, v11, v13}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->f()Lma/a$f;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$f;->c()J

    move-result-wide v6

    invoke-static {v6, v7}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v6

    const/16 v9, 0x36

    const/4 v10, 0x4

    const/4 v7, 0x0

    move-object v8, v11

    invoke-static/range {v4 .. v10}, Lta/c;->c(Ls9/b;Landroidx/compose/ui/e;Lm0/v0;Ljava/lang/String;LT/l;II)V

    invoke-interface {v11}, LT/l;->J()V

    :cond_f
    :goto_6
    invoke-interface {v11}, LT/l;->J()V

    invoke-interface {v11}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_10

    invoke-static {}, LT/o;->P()V

    :cond_10
    :goto_7
    invoke-interface {v11}, LT/l;->z()LT/X0;

    move-result-object v3

    if-eqz v3, :cond_11

    new-instance v4, Lcom/ui/wifiman/ui/teleport/consoles/t;

    invoke-direct {v4, v0, v1, v2}, Lcom/ui/wifiman/ui/teleport/consoles/t;-><init>(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/consoles/h$a;I)V

    invoke-interface {v3, v4}, LT/X0;->a(Lmh/p;)V

    :cond_11
    return-void
.end method

.method private static final B(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/consoles/h$a;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lcom/ui/wifiman/ui/teleport/consoles/u;->A(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/consoles/h$a;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final C(Landroidx/compose/ui/e;FLcom/ui/wifiman/ui/teleport/consoles/h$a;Lmh/a;ILT/l;I)LYg/J;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, LT/L0;->a(I)I

    move-result v5

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lcom/ui/wifiman/ui/teleport/consoles/u;->q(Landroidx/compose/ui/e;FLcom/ui/wifiman/ui/teleport/consoles/h$a;Lmh/a;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final synthetic D(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/consoles/h$c;LT/l;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/teleport/consoles/u;->l(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/consoles/h$c;LT/l;I)V

    return-void
.end method

.method public static final synthetic E(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/consoles/i;LT/l;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/teleport/consoles/u;->n(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/consoles/i;LT/l;I)V

    return-void
.end method

.method public static final synthetic F(Landroidx/compose/ui/e;FLcom/ui/wifiman/ui/teleport/consoles/h$a;Lmh/a;LT/l;I)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/ui/wifiman/ui/teleport/consoles/u;->q(Landroidx/compose/ui/e;FLcom/ui/wifiman/ui/teleport/consoles/h$a;Lmh/a;LT/l;I)V

    return-void
.end method

.method public static final synthetic G(Landroidx/compose/ui/e;LT/l;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ui/wifiman/ui/teleport/consoles/u;->r(Landroidx/compose/ui/e;LT/l;I)V

    return-void
.end method

.method public static synthetic a(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/consoles/i;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/ui/wifiman/ui/teleport/consoles/u;->p(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/consoles/i;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/consoles/i;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/ui/wifiman/ui/teleport/consoles/u;->x(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/consoles/i;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/consoles/h$a;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/ui/wifiman/ui/teleport/consoles/u;->z(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/consoles/h$a;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/ui/wifiman/ui/teleport/consoles/h;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/ui/teleport/consoles/u;->w(Lcom/ui/wifiman/ui/teleport/consoles/h;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroidx/compose/ui/e;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/teleport/consoles/u;->s(Landroidx/compose/ui/e;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ljava/util/List;LIi/N;Lcom/ui/wifiman/ui/teleport/consoles/i;FLA/y;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/ui/wifiman/ui/teleport/consoles/u;->u(Ljava/util/List;LIi/N;Lcom/ui/wifiman/ui/teleport/consoles/i;FLA/y;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(LIi/N;Lcom/ui/wifiman/ui/teleport/consoles/i;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wifiman/ui/teleport/consoles/u;->o(LIi/N;Lcom/ui/wifiman/ui/teleport/consoles/i;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Landroidx/compose/ui/e;FLcom/ui/wifiman/ui/teleport/consoles/h$a;Lmh/a;ILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/ui/wifiman/ui/teleport/consoles/u;->C(Landroidx/compose/ui/e;FLcom/ui/wifiman/ui/teleport/consoles/h$a;Lmh/a;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/consoles/h$c;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/ui/wifiman/ui/teleport/consoles/u;->m(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/consoles/h$c;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/consoles/h$a;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/ui/wifiman/ui/teleport/consoles/u;->B(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/consoles/h$a;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lcom/ui/wifiman/ui/teleport/consoles/h;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/ui/teleport/consoles/u;->v(Lcom/ui/wifiman/ui/teleport/consoles/h;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final l(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/consoles/h$c;LT/l;I)V
    .locals 27

    move-object/from16 v1, p0

    move-object/from16 v13, p1

    move/from16 v14, p3

    const v0, 0x3dbc0f6e

    move-object/from16 v2, p2

    invoke-interface {v2, v0}, LT/l;->r(I)LT/l;

    move-result-object v12

    and-int/lit8 v2, v14, 0x6

    if-nez v2, :cond_1

    invoke-interface {v12, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v14

    goto :goto_1

    :cond_1
    move v2, v14

    :goto_1
    and-int/lit8 v3, v14, 0x30

    if-nez v3, :cond_3

    invoke-interface {v12, v13}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_3
    move v4, v2

    and-int/lit8 v2, v4, 0x13

    const/16 v3, 0x12

    if-ne v2, v3, :cond_5

    invoke-interface {v12}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v12}, LT/l;->C()V

    move-object/from16 v26, v12

    goto :goto_4

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_6

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.teleport.consoles.Header (TeleportConsolePickerUi.kt:168)"

    invoke-static {v0, v4, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/ui/teleport/consoles/h$c;->b()Ls9/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v0, v12, v2}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v0

    sget-object v5, Lla/a;->a:Lla/a;

    sget v6, Lla/a;->b:I

    invoke-virtual {v5, v12, v6}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->f()Lma/a$f;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$f;->a()J

    move-result-wide v2

    invoke-virtual {v5, v12, v6}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v5

    invoke-virtual {v5}, Lpa/c;->a()Lpa/b;

    move-result-object v5

    invoke-virtual {v5}, Lpa/b;->a()LL0/U;

    move-result-object v21

    sget-object v5, LW0/t;->a:LW0/t$a;

    invoke-virtual {v5}, LW0/t$a;->b()I

    move-result v15

    shl-int/lit8 v4, v4, 0x3

    and-int/lit8 v23, v4, 0x70

    const/16 v24, 0xc30

    const v25, 0x1d7f8

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/16 v16, 0x0

    move-object/from16 v26, v12

    move-object/from16 v12, v16

    const-wide/16 v16, 0x0

    move-wide/from16 v13, v16

    const/16 v16, 0x0

    const/16 v17, 0x1

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v1, p0

    move-object/from16 v22, v26

    invoke-static/range {v0 .. v25}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    :goto_4
    invoke-interface/range {v26 .. v26}, LT/l;->z()LT/X0;

    move-result-object v0

    if-eqz v0, :cond_8

    new-instance v1, Lcom/ui/wifiman/ui/teleport/consoles/o;

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move/from16 v4, p3

    invoke-direct {v1, v2, v3, v4}, Lcom/ui/wifiman/ui/teleport/consoles/o;-><init>(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/consoles/h$c;I)V

    invoke-interface {v0, v1}, LT/X0;->a(Lmh/p;)V

    :cond_8
    return-void
.end method

.method private static final m(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/consoles/h$c;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lcom/ui/wifiman/ui/teleport/consoles/u;->l(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/consoles/h$c;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final n(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/consoles/i;LT/l;I)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const v3, -0xb663c8d

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LT/l;->r(I)LT/l;

    move-result-object v15

    and-int/lit8 v4, v2, 0x6

    const/4 v5, 0x4

    if-nez v4, :cond_1

    invoke-interface {v15, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    move v4, v5

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v2

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    and-int/lit8 v6, v2, 0x30

    const/16 v7, 0x20

    if-nez v6, :cond_3

    invoke-interface {v15, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    move v6, v7

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v4, v6

    :cond_3
    and-int/lit8 v6, v4, 0x13

    const/16 v8, 0x12

    if-ne v6, v8, :cond_5

    invoke-interface {v15}, LT/l;->v()Z

    move-result v6

    if-nez v6, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v15}, LT/l;->C()V

    goto/16 :goto_5

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v6

    if-eqz v6, :cond_6

    const/4 v6, -0x1

    const-string v8, "com.ui.wifiman.ui.teleport.consoles.NoAccountInfo (TeleportConsolePickerUi.kt:270)"

    invoke-static {v3, v4, v6, v8}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    sget-object v6, LT/l;->a:LT/l$a;

    invoke-virtual {v6}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v8

    if-ne v3, v8, :cond_7

    sget-object v3, Ldh/j;->a:Ldh/j;

    invoke-static {v3, v15}, LT/O;->i(Ldh/i;LT/l;)LIi/N;

    move-result-object v3

    new-instance v8, LT/A;

    invoke-direct {v8, v3}, LT/A;-><init>(LIi/N;)V

    invoke-interface {v15, v8}, LT/l;->K(Ljava/lang/Object;)V

    move-object v3, v8

    :cond_7
    check-cast v3, LT/A;

    invoke-virtual {v3}, LT/A;->a()LIi/N;

    move-result-object v3

    int-to-float v5, v5

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x1

    invoke-static {v0, v9, v5, v10, v8}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v5

    sget-object v8, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v8}, Lf0/c$a;->o()Lf0/c;

    move-result-object v8

    const/4 v9, 0x0

    invoke-static {v8, v9}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v8

    invoke-static {v15, v9}, LT/j;->a(LT/l;I)I

    move-result v11

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v12

    invoke-static {v15, v5}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v5

    sget-object v13, LE0/g;->K:LE0/g$a;

    invoke-virtual {v13}, LE0/g$a;->a()Lmh/a;

    move-result-object v14

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v16

    if-nez v16, :cond_8

    invoke-static {}, LT/j;->c()V

    :cond_8
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v16

    if-eqz v16, :cond_9

    invoke-interface {v15, v14}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_9
    invoke-interface {v15}, LT/l;->I()V

    :goto_4
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v14

    invoke-virtual {v13}, LE0/g$a;->e()Lmh/p;

    move-result-object v10

    invoke-static {v14, v8, v10}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v13}, LE0/g$a;->g()Lmh/p;

    move-result-object v8

    invoke-static {v14, v12, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v13}, LE0/g$a;->b()Lmh/p;

    move-result-object v8

    invoke-interface {v14}, LT/l;->o()Z

    move-result v10

    if-nez v10, :cond_a

    invoke-interface {v14}, LT/l;->f()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v10, v12}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_b

    :cond_a
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v14, v10}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v14, v10, v8}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_b
    invoke-virtual {v13}, LE0/g$a;->f()Lmh/p;

    move-result-object v8

    invoke-static {v14, v5, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v5, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    sget v5, Lm8/c;->i4:I

    invoke-static {v5, v15, v9}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v10

    const v5, -0x264eb02a

    invoke-interface {v15, v5}, LT/l;->U(I)V

    invoke-interface {v15, v3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    and-int/lit8 v4, v4, 0x70

    if-ne v4, v7, :cond_c

    const/4 v9, 0x1

    :cond_c
    or-int v4, v5, v9

    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_d

    invoke-virtual {v6}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v5, v4, :cond_e

    :cond_d
    new-instance v5, Lcom/ui/wifiman/ui/teleport/consoles/r;

    invoke-direct {v5, v3, v1}, Lcom/ui/wifiman/ui/teleport/consoles/r;-><init>(LIi/N;Lcom/ui/wifiman/ui/teleport/consoles/i;)V

    invoke-interface {v15, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_e
    check-cast v5, Lmh/a;

    invoke-interface {v15}, LT/l;->J()V

    const/4 v13, 0x0

    const/16 v14, 0xbd

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    move-object v12, v15

    invoke-static/range {v4 .. v14}, Lw9/k;->c(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Lw9/h;Ljava/lang/String;Lz/c$e;LT/l;II)V

    invoke-interface {v15}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_f

    invoke-static {}, LT/o;->P()V

    :cond_f
    :goto_5
    invoke-interface {v15}, LT/l;->z()LT/X0;

    move-result-object v3

    if-eqz v3, :cond_10

    new-instance v4, Lcom/ui/wifiman/ui/teleport/consoles/s;

    invoke-direct {v4, v0, v1, v2}, Lcom/ui/wifiman/ui/teleport/consoles/s;-><init>(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/consoles/i;I)V

    invoke-interface {v3, v4}, LT/X0;->a(Lmh/p;)V

    :cond_10
    return-void
.end method

.method private static final o(LIi/N;Lcom/ui/wifiman/ui/teleport/consoles/i;)LYg/J;
    .locals 6

    new-instance v3, Lcom/ui/wifiman/ui/teleport/consoles/u$a;

    const/4 v0, 0x0

    invoke-direct {v3, p1, v0}, Lcom/ui/wifiman/ui/teleport/consoles/u$a;-><init>(Lcom/ui/wifiman/ui/teleport/consoles/i;Ldh/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final p(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/consoles/i;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lcom/ui/wifiman/ui/teleport/consoles/u;->n(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/consoles/i;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final q(Landroidx/compose/ui/e;FLcom/ui/wifiman/ui/teleport/consoles/h$a;Lmh/a;LT/l;I)V
    .locals 27

    move-object/from16 v1, p0

    move/from16 v9, p1

    move-object/from16 v10, p2

    move-object/from16 v11, p3

    move/from16 v12, p5

    const/16 v0, 0x30

    const v2, -0x546d748b

    move-object/from16 v3, p4

    invoke-interface {v3, v2}, LT/l;->r(I)LT/l;

    move-result-object v8

    const/4 v3, 0x6

    and-int/lit8 v4, v12, 0x6

    if-nez v4, :cond_1

    invoke-interface {v8, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v12

    goto :goto_1

    :cond_1
    move v4, v12

    :goto_1
    and-int/lit8 v7, v12, 0x30

    if-nez v7, :cond_3

    invoke-interface {v8, v9}, LT/l;->g(F)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v4, v7

    :cond_3
    and-int/lit16 v7, v12, 0x180

    if-nez v7, :cond_5

    invoke-interface {v8, v10}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v4, v7

    :cond_5
    and-int/lit16 v7, v12, 0xc00

    if-nez v7, :cond_7

    invoke-interface {v8, v11}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x800

    goto :goto_4

    :cond_6
    const/16 v7, 0x400

    :goto_4
    or-int/2addr v4, v7

    :cond_7
    and-int/lit16 v7, v4, 0x493

    const/16 v13, 0x492

    if-ne v7, v13, :cond_9

    invoke-interface {v8}, LT/l;->v()Z

    move-result v7

    if-nez v7, :cond_8

    goto :goto_5

    :cond_8
    invoke-interface {v8}, LT/l;->C()V

    move-object v1, v8

    goto/16 :goto_e

    :cond_9
    :goto_5
    invoke-static {}, LT/o;->H()Z

    move-result v7

    const/4 v15, -0x1

    if-eqz v7, :cond_a

    const-string v7, "com.ui.wifiman.ui.teleport.consoles.TeleportConsole (TeleportConsolePickerUi.kt:66)"

    invoke-static {v2, v4, v15, v7}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_a
    int-to-float v2, v0

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v7

    const/4 v14, 0x0

    const/4 v13, 0x1

    const/4 v3, 0x0

    invoke-static {v1, v14, v7, v13, v3}, Landroidx/compose/foundation/layout/r;->b(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v7

    sget-object v6, Lz/c;->a:Lz/c;

    invoke-virtual {v6}, Lz/c;->g()Lz/c$m;

    move-result-object v15

    sget-object v24, Lf0/c;->a:Lf0/c$a;

    invoke-virtual/range {v24 .. v24}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v0

    const/4 v5, 0x0

    invoke-static {v15, v0, v8, v5}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v0

    invoke-static {v8, v5}, LT/j;->a(LT/l;I)I

    move-result v15

    invoke-interface {v8}, LT/l;->G()LT/x;

    move-result-object v5

    invoke-static {v8, v7}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v7

    sget-object v25, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v25 .. v25}, LE0/g$a;->a()Lmh/a;

    move-result-object v3

    invoke-interface {v8}, LT/l;->x()LT/f;

    move-result-object v18

    if-nez v18, :cond_b

    invoke-static {}, LT/j;->c()V

    :cond_b
    invoke-interface {v8}, LT/l;->u()V

    invoke-interface {v8}, LT/l;->o()Z

    move-result v18

    if-eqz v18, :cond_c

    invoke-interface {v8, v3}, LT/l;->D(Lmh/a;)V

    goto :goto_6

    :cond_c
    invoke-interface {v8}, LT/l;->I()V

    :goto_6
    invoke-static {v8}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v3

    invoke-virtual/range {v25 .. v25}, LE0/g$a;->e()Lmh/p;

    move-result-object v13

    invoke-static {v3, v0, v13}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v25 .. v25}, LE0/g$a;->g()Lmh/p;

    move-result-object v0

    invoke-static {v3, v5, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v25 .. v25}, LE0/g$a;->b()Lmh/p;

    move-result-object v0

    invoke-interface {v3}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_d

    invoke-interface {v3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v5, v13}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_e

    :cond_d
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v3, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v3, v5, v0}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_e
    invoke-virtual/range {v25 .. v25}, LE0/g$a;->f()Lmh/p;

    move-result-object v0

    invoke-static {v3, v7, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v0, Lz/k;->a:Lz/k;

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v3, 0x1

    const/4 v5, 0x0

    invoke-static {v0, v14, v3, v5}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v7

    const/4 v13, 0x4

    int-to-float v15, v13

    invoke-static {v15}, LY0/h;->j(F)F

    move-result v13

    invoke-static {v7, v14, v13, v3, v5}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v7

    invoke-virtual/range {v24 .. v24}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v3

    invoke-virtual {v6}, Lz/c;->f()Lz/c$e;

    move-result-object v5

    const/16 v13, 0x30

    invoke-static {v5, v3, v8, v13}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v3

    const/4 v5, 0x0

    invoke-static {v8, v5}, LT/j;->a(LT/l;I)I

    move-result v13

    invoke-interface {v8}, LT/l;->G()LT/x;

    move-result-object v5

    invoke-static {v8, v7}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v7

    invoke-virtual/range {v25 .. v25}, LE0/g$a;->a()Lmh/a;

    move-result-object v14

    invoke-interface {v8}, LT/l;->x()LT/f;

    move-result-object v19

    if-nez v19, :cond_f

    invoke-static {}, LT/j;->c()V

    :cond_f
    invoke-interface {v8}, LT/l;->u()V

    invoke-interface {v8}, LT/l;->o()Z

    move-result v19

    if-eqz v19, :cond_10

    invoke-interface {v8, v14}, LT/l;->D(Lmh/a;)V

    goto :goto_7

    :cond_10
    invoke-interface {v8}, LT/l;->I()V

    :goto_7
    invoke-static {v8}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v14

    invoke-virtual/range {v25 .. v25}, LE0/g$a;->e()Lmh/p;

    move-result-object v1

    invoke-static {v14, v3, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v25 .. v25}, LE0/g$a;->g()Lmh/p;

    move-result-object v1

    invoke-static {v14, v5, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v25 .. v25}, LE0/g$a;->b()Lmh/p;

    move-result-object v1

    invoke-interface {v14}, LT/l;->o()Z

    move-result v3

    if-nez v3, :cond_11

    invoke-interface {v14}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_12

    :cond_11
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v14, v3}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v14, v3, v1}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_12
    invoke-virtual/range {v25 .. v25}, LE0/g$a;->f()Lmh/p;

    move-result-object v1

    invoke-static {v14, v7, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v1, Lz/Z;->a:Lz/Z;

    invoke-virtual/range {p2 .. p2}, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->e()Z

    move-result v3

    if-eqz v3, :cond_13

    invoke-virtual/range {p2 .. p2}, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->c()Z

    move-result v3

    if-eqz v3, :cond_13

    const/4 v14, 0x1

    goto :goto_8

    :cond_13
    const/4 v14, 0x0

    :goto_8
    new-instance v3, Lcom/ui/wifiman/ui/teleport/consoles/u$b;

    invoke-direct {v3, v9, v11}, Lcom/ui/wifiman/ui/teleport/consoles/u$b;-><init>(FLmh/a;)V

    const/16 v5, 0x36

    const v7, -0x5019bfd

    const/4 v13, 0x1

    invoke-static {v7, v13, v3, v8, v5}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v19

    const v21, 0x180006

    const/16 v22, 0x1e

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/16 v18, 0x0

    move-object v13, v1

    move/from16 v26, v15

    move-object v15, v3

    move-object/from16 v16, v5

    move-object/from16 v17, v7

    move-object/from16 v20, v8

    invoke-static/range {v13 .. v22}, Lq/d;->e(Lz/Y;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    const/4 v3, 0x0

    const/4 v5, 0x1

    const/4 v7, 0x0

    invoke-static {v0, v3, v5, v7}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v13

    const/4 v14, 0x2

    invoke-static {v13, v9, v3, v14, v7}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v13

    invoke-virtual/range {v24 .. v24}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v7

    invoke-virtual {v6}, Lz/c;->f()Lz/c$e;

    move-result-object v14

    const/16 v15, 0x30

    invoke-static {v14, v7, v8, v15}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v7

    const/4 v14, 0x0

    invoke-static {v8, v14}, LT/j;->a(LT/l;I)I

    move-result v15

    invoke-interface {v8}, LT/l;->G()LT/x;

    move-result-object v14

    invoke-static {v8, v13}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v13

    invoke-virtual/range {v25 .. v25}, LE0/g$a;->a()Lmh/a;

    move-result-object v3

    invoke-interface {v8}, LT/l;->x()LT/f;

    move-result-object v16

    if-nez v16, :cond_14

    invoke-static {}, LT/j;->c()V

    :cond_14
    invoke-interface {v8}, LT/l;->u()V

    invoke-interface {v8}, LT/l;->o()Z

    move-result v16

    if-eqz v16, :cond_15

    invoke-interface {v8, v3}, LT/l;->D(Lmh/a;)V

    goto :goto_9

    :cond_15
    invoke-interface {v8}, LT/l;->I()V

    :goto_9
    invoke-static {v8}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v3

    invoke-virtual/range {v25 .. v25}, LE0/g$a;->e()Lmh/p;

    move-result-object v5

    invoke-static {v3, v7, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v25 .. v25}, LE0/g$a;->g()Lmh/p;

    move-result-object v5

    invoke-static {v3, v14, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v25 .. v25}, LE0/g$a;->b()Lmh/p;

    move-result-object v5

    invoke-interface {v3}, LT/l;->o()Z

    move-result v7

    if-nez v7, :cond_16

    invoke-interface {v3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v7, v14}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_17

    :cond_16
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v3, v7}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v3, v7, v5}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_17
    invoke-virtual/range {v25 .. v25}, LE0/g$a;->f()Lmh/p;

    move-result-object v5

    invoke-static {v3, v13, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {p2 .. p2}, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->d()Ls9/a;

    move-result-object v13

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v14

    sget-object v2, Lla/a;->a:Lla/a;

    sget v3, Lla/a;->b:I

    invoke-virtual {v2, v8, v3}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->a()Lma/a$a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$a;->j()J

    move-result-wide v19

    const/16 v22, 0x30

    const/16 v23, 0x1e

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v21, v8

    invoke-static/range {v13 .. v23}, LBe/w;->b(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;FJLT/l;II)V

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x1

    invoke-interface {v1, v0, v2, v3}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v2

    const/16 v3, 0x8

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    const/4 v5, 0x2

    const/4 v7, 0x0

    const/4 v13, 0x0

    invoke-static {v2, v3, v7, v5, v13}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-static/range {v26 .. v26}, LY0/h;->j(F)F

    move-result v3

    invoke-virtual {v6, v3}, Lz/c;->n(F)Lz/c$f;

    move-result-object v3

    invoke-virtual/range {v24 .. v24}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v5

    const/4 v6, 0x6

    invoke-static {v3, v5, v8, v6}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v3

    const/4 v5, 0x0

    invoke-static {v8, v5}, LT/j;->a(LT/l;I)I

    move-result v6

    invoke-interface {v8}, LT/l;->G()LT/x;

    move-result-object v7

    invoke-static {v8, v2}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-virtual/range {v25 .. v25}, LE0/g$a;->a()Lmh/a;

    move-result-object v13

    invoke-interface {v8}, LT/l;->x()LT/f;

    move-result-object v14

    if-nez v14, :cond_18

    invoke-static {}, LT/j;->c()V

    :cond_18
    invoke-interface {v8}, LT/l;->u()V

    invoke-interface {v8}, LT/l;->o()Z

    move-result v14

    if-eqz v14, :cond_19

    invoke-interface {v8, v13}, LT/l;->D(Lmh/a;)V

    goto :goto_a

    :cond_19
    invoke-interface {v8}, LT/l;->I()V

    :goto_a
    invoke-static {v8}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v13

    invoke-virtual/range {v25 .. v25}, LE0/g$a;->e()Lmh/p;

    move-result-object v14

    invoke-static {v13, v3, v14}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v25 .. v25}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v13, v7, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v25 .. v25}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v13}, LT/l;->o()Z

    move-result v7

    if-nez v7, :cond_1a

    invoke-interface {v13}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v7, v14}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1b

    :cond_1a
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v13, v7}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v13, v6, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_1b
    invoke-virtual/range {v25 .. v25}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v13, v2, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v6, 0x0

    invoke-static {v0, v2, v3, v6}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v7

    const/4 v13, 0x3

    shr-int/2addr v4, v13

    and-int/lit8 v4, v4, 0x70

    const/4 v14, 0x6

    or-int/2addr v4, v14

    invoke-static {v7, v10, v8, v4}, Lcom/ui/wifiman/ui/teleport/consoles/u;->A(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/consoles/h$a;LT/l;I)V

    invoke-static {v0, v2, v3, v6}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v7

    invoke-static {v7, v10, v8, v4}, Lcom/ui/wifiman/ui/teleport/consoles/u;->y(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/consoles/h$a;LT/l;I)V

    invoke-interface {v8}, LT/l;->R()V

    invoke-virtual/range {p2 .. p2}, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->b()Lcom/ui/wifiman/ui/teleport/consoles/h$a$a;

    move-result-object v2

    if-nez v2, :cond_1c

    const/4 v2, -0x1

    const/4 v15, -0x1

    goto :goto_b

    :cond_1c
    sget-object v4, Lcom/ui/wifiman/ui/teleport/consoles/u$i;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v15, v4, v2

    const/4 v2, -0x1

    :goto_b
    if-eq v15, v2, :cond_1f

    if-eq v15, v3, :cond_1e

    const/4 v2, 0x2

    if-eq v15, v2, :cond_1f

    if-ne v15, v13, :cond_1d

    goto :goto_c

    :cond_1d
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1e
    invoke-virtual/range {p2 .. p2}, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->e()Z

    move-result v2

    if-nez v2, :cond_1f

    const/4 v14, 0x1

    goto :goto_d

    :cond_1f
    :goto_c
    move v14, v5

    :goto_d
    sget-object v2, Lcom/ui/wifiman/ui/teleport/consoles/a;->a:Lcom/ui/wifiman/ui/teleport/consoles/a;

    invoke-virtual {v2}, Lcom/ui/wifiman/ui/teleport/consoles/a;->a()Lmh/q;

    move-result-object v19

    const/16 v22, 0x1e

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const v3, 0x180006

    move-object v13, v1

    move-object/from16 v20, v8

    move/from16 v21, v3

    invoke-static/range {v13 .. v22}, Lq/d;->e(Lz/Y;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-virtual/range {p2 .. p2}, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->e()Z

    move-result v4

    const/4 v5, 0x1

    xor-int/lit8 v14, v4, 0x1

    invoke-virtual {v2}, Lcom/ui/wifiman/ui/teleport/consoles/a;->b()Lmh/q;

    move-result-object v19

    const/16 v22, 0x1e

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object v13, v1

    move-object/from16 v20, v8

    move/from16 v21, v3

    invoke-static/range {v13 .. v22}, Lq/d;->e(Lz/Y;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-interface {v8}, LT/l;->R()V

    invoke-interface {v8}, LT/l;->R()V

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    const/16 v7, 0xe

    const/4 v0, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move/from16 v3, p1

    move-object v1, v8

    move-object v8, v0

    invoke-static/range {v2 .. v8}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v13

    const/16 v20, 0x0

    const/16 v21, 0x1e

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v19, v1

    invoke-static/range {v13 .. v21}, Lz9/b;->b(Landroidx/compose/ui/e;JFFFLT/l;II)V

    invoke-interface {v1}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_20

    invoke-static {}, LT/o;->P()V

    :cond_20
    :goto_e
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v6

    if-eqz v6, :cond_21

    new-instance v7, Lcom/ui/wifiman/ui/teleport/consoles/p;

    move-object v0, v7

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/ui/wifiman/ui/teleport/consoles/p;-><init>(Landroidx/compose/ui/e;FLcom/ui/wifiman/ui/teleport/consoles/h$a;Lmh/a;I)V

    invoke-interface {v6, v7}, LT/X0;->a(Lmh/p;)V

    :cond_21
    return-void
.end method

.method private static final r(Landroidx/compose/ui/e;LT/l;I)V
    .locals 13

    const v0, -0x71ae833e

    invoke-interface {p1, v0}, LT/l;->r(I)LT/l;

    move-result-object p1

    and-int/lit8 v1, p2, 0x6

    const/4 v2, 0x2

    if-nez v1, :cond_1

    invoke-interface {p1, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr v1, p2

    goto :goto_1

    :cond_1
    move v1, p2

    :goto_1
    and-int/lit8 v3, v1, 0x3

    if-ne v3, v2, :cond_3

    invoke-interface {p1}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p1}, LT/l;->C()V

    goto :goto_3

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, -0x1

    const-string v4, "com.ui.wifiman.ui.teleport.consoles.TeleportConsoleLoading (TeleportConsolePickerUi.kt:153)"

    invoke-static {v0, v1, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    const/16 v0, 0x30

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    const/4 v1, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {p0, v1, v0, v3, v4}, Landroidx/compose/foundation/layout/r;->b(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    invoke-static {v0, v1, v2, v3, v4}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, LH9/a;->a(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v0, Lla/a;->a:Lla/a;

    sget v2, Lla/a;->b:I

    invoke-virtual {v0, p1, v2}, Lla/a;->b(LT/l;I)Loa/a;

    move-result-object v3

    invoke-virtual {v3}, Loa/a;->b()Loa/a$a;

    move-result-object v3

    invoke-virtual {v3}, Loa/a$a;->a()F

    move-result v3

    invoke-static {v3}, LE/h;->d(F)LE/g;

    move-result-object v3

    invoke-virtual {v0, p1, v2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a;->a()Lma/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v0

    invoke-virtual {v0}, Lr9/a$b;->b()J

    move-result-wide v4

    sget-object v0, Lcom/ui/wifiman/ui/teleport/consoles/a;->a:Lcom/ui/wifiman/ui/teleport/consoles/a;

    invoke-virtual {v0}, Lcom/ui/wifiman/ui/teleport/consoles/a;->c()Lmh/p;

    move-result-object v9

    const/high16 v11, 0x180000

    const/16 v12, 0x38

    const-wide/16 v6, 0x0

    const/4 v0, 0x0

    const/4 v8, 0x0

    move-object v2, v3

    move-wide v3, v4

    move-wide v5, v6

    move-object v7, v0

    move-object v10, p1

    invoke-static/range {v1 .. v12}, LN/O0;->a(Landroidx/compose/ui/e;Lm0/i1;JJLs/g;FLmh/p;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    :goto_3
    invoke-interface {p1}, LT/l;->z()LT/X0;

    move-result-object p1

    if-eqz p1, :cond_6

    new-instance v0, Lcom/ui/wifiman/ui/teleport/consoles/q;

    invoke-direct {v0, p0, p2}, Lcom/ui/wifiman/ui/teleport/consoles/q;-><init>(Landroidx/compose/ui/e;I)V

    invoke-interface {p1, v0}, LT/X0;->a(Lmh/p;)V

    :cond_6
    return-void
.end method

.method private static final s(Landroidx/compose/ui/e;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, LT/L0;->a(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lcom/ui/wifiman/ui/teleport/consoles/u;->r(Landroidx/compose/ui/e;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final t(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/consoles/i;LT/l;II)V
    .locals 18

    move-object/from16 v0, p1

    move/from16 v1, p3

    move/from16 v2, p4

    const-string v3, "vm"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, 0x5c7d4cdf

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

    const/16 v8, 0x20

    if-eqz v7, :cond_3

    or-int/lit8 v6, v6, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v7, v1, 0x30

    if-nez v7, :cond_5

    invoke-interface {v15, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    move v7, v8

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_5
    :goto_3
    and-int/lit8 v7, v6, 0x13

    const/16 v9, 0x12

    if-ne v7, v9, :cond_7

    invoke-interface {v15}, LT/l;->v()Z

    move-result v7

    if-nez v7, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {v15}, LT/l;->C()V

    move-object/from16 v17, v15

    goto/16 :goto_6

    :cond_7
    :goto_4
    if-eqz v4, :cond_8

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object/from16 v16, v4

    goto :goto_5

    :cond_8
    move-object/from16 v16, v5

    :goto_5
    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_9

    const/4 v4, -0x1

    const-string v5, "com.ui.wifiman.ui.teleport.consoles.TeleportConsolePickerUi (TeleportConsolePickerUi.kt:291)"

    invoke-static {v3, v6, v4, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_9
    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v3, v5, :cond_a

    sget-object v3, Ldh/j;->a:Ldh/j;

    invoke-static {v3, v15}, LT/O;->i(Ldh/i;LT/l;)LIi/N;

    move-result-object v3

    new-instance v5, LT/A;

    invoke-direct {v5, v3}, LT/A;-><init>(LIi/N;)V

    invoke-interface {v15, v5}, LT/l;->K(Ljava/lang/Object;)V

    move-object v3, v5

    :cond_a
    check-cast v3, LT/A;

    invoke-virtual {v3}, LT/A;->a()LIi/N;

    move-result-object v3

    sget-object v5, Lla/a;->a:Lla/a;

    sget v7, Lla/a;->b:I

    invoke-virtual {v5, v15, v7}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v5

    invoke-virtual {v5}, Lra/a;->a()Lra/b;

    move-result-object v5

    invoke-virtual {v5}, Lra/b;->a()Lra/b$a$a;

    move-result-object v5

    invoke-virtual {v5}, Lra/b$a$a;->c()F

    move-result v5

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/ui/teleport/consoles/i;->n0()LLi/N;

    move-result-object v7

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x1

    invoke-static {v7, v9, v15, v10, v11}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v7

    invoke-interface {v7}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    const v9, -0x12fd2a79

    invoke-interface {v15, v9}, LT/l;->U(I)V

    invoke-interface {v15, v7}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v9

    invoke-interface {v15, v3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v9, v12

    and-int/lit8 v12, v6, 0x70

    if-ne v12, v8, :cond_b

    move v10, v11

    :cond_b
    or-int v8, v9, v10

    invoke-interface {v15, v5}, LT/l;->g(F)Z

    move-result v9

    or-int/2addr v8, v9

    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_c

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v9, v4, :cond_d

    :cond_c
    new-instance v9, Lcom/ui/wifiman/ui/teleport/consoles/j;

    invoke-direct {v9, v7, v3, v0, v5}, Lcom/ui/wifiman/ui/teleport/consoles/j;-><init>(Ljava/util/List;LIi/N;Lcom/ui/wifiman/ui/teleport/consoles/i;F)V

    invoke-interface {v15, v9}, LT/l;->K(Ljava/lang/Object;)V

    :cond_d
    move-object v12, v9

    check-cast v12, Lmh/l;

    invoke-interface {v15}, LT/l;->J()V

    and-int/lit8 v14, v6, 0xe

    const/16 v3, 0xfe

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v4, v16

    move-object v13, v15

    move-object/from16 v17, v15

    move v15, v3

    invoke-static/range {v4 .. v15}, LA/b;->a(Landroidx/compose/ui/e;LA/B;Lz/N;ZLz/c$m;Lf0/c$b;Lw/n;ZLmh/l;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_e

    invoke-static {}, LT/o;->P()V

    :cond_e
    move-object/from16 v5, v16

    :goto_6
    invoke-interface/range {v17 .. v17}, LT/l;->z()LT/X0;

    move-result-object v3

    if-eqz v3, :cond_f

    new-instance v4, Lcom/ui/wifiman/ui/teleport/consoles/l;

    invoke-direct {v4, v5, v0, v1, v2}, Lcom/ui/wifiman/ui/teleport/consoles/l;-><init>(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/consoles/i;II)V

    invoke-interface {v3, v4}, LT/X0;->a(Lmh/p;)V

    :cond_f
    return-void
.end method

.method private static final u(Ljava/util/List;LIi/N;Lcom/ui/wifiman/ui/teleport/consoles/i;FLA/y;)LYg/J;
    .locals 4

    const-string v0, "$this$LazyColumn"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wifiman/ui/teleport/consoles/m;

    invoke-direct {v0}, Lcom/ui/wifiman/ui/teleport/consoles/m;-><init>()V

    new-instance v1, Lcom/ui/wifiman/ui/teleport/consoles/n;

    invoke-direct {v1}, Lcom/ui/wifiman/ui/teleport/consoles/n;-><init>()V

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    new-instance v3, Lcom/ui/wifiman/ui/teleport/consoles/u$e;

    invoke-direct {v3, v0, p0}, Lcom/ui/wifiman/ui/teleport/consoles/u$e;-><init>(Lmh/l;Ljava/util/List;)V

    new-instance v0, Lcom/ui/wifiman/ui/teleport/consoles/u$f;

    invoke-direct {v0, v1, p0}, Lcom/ui/wifiman/ui/teleport/consoles/u$f;-><init>(Lmh/l;Ljava/util/List;)V

    new-instance v1, Lcom/ui/wifiman/ui/teleport/consoles/u$g;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/ui/wifiman/ui/teleport/consoles/u$g;-><init>(Ljava/util/List;LIi/N;Lcom/ui/wifiman/ui/teleport/consoles/i;F)V

    const p0, -0x25b7f321

    const/4 p1, 0x1

    invoke-static {p0, p1, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object p0

    invoke-interface {p4, v2, v3, v0, p0}, LA/y;->a(ILmh/l;Lmh/l;Lmh/r;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final v(Lcom/ui/wifiman/ui/teleport/consoles/h;)Ljava/lang/Object;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/teleport/consoles/h;->a()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final w(Lcom/ui/wifiman/ui/teleport/consoles/h;)Ljava/lang/Object;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    instance-of v0, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$b;

    if-eqz v0, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    instance-of v0, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$d;

    if-eqz v0, :cond_2

    const/4 p0, 0x2

    goto :goto_0

    :cond_2
    instance-of p0, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$c;

    if-eqz p0, :cond_3

    const/4 p0, 0x3

    :goto_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final x(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/consoles/i;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lcom/ui/wifiman/ui/teleport/consoles/u;->t(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/consoles/i;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final y(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/consoles/h$a;LT/l;I)V
    .locals 12

    const v0, 0x32485a71

    invoke-interface {p2, v0}, LT/l;->r(I)LT/l;

    move-result-object p2

    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_1

    invoke-interface {p2, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p3

    goto :goto_1

    :cond_1
    move v1, p3

    :goto_1
    and-int/lit8 v2, p3, 0x30

    if-nez v2, :cond_3

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit8 v2, v1, 0x13

    const/16 v3, 0x12

    if-ne v2, v3, :cond_5

    invoke-interface {p2}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {p2}, LT/l;->C()V

    goto/16 :goto_5

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_6

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.teleport.consoles.TeleportConsoleSubtitleTitleRow (TeleportConsolePickerUi.kt:235)"

    invoke-static {v0, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    sget-object v0, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v0}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v0

    sget-object v1, Lz/c;->a:Lz/c;

    const/16 v2, 0x8

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    invoke-virtual {v1, v2}, Lz/c;->n(F)Lz/c$f;

    move-result-object v1

    const/16 v7, 0x36

    invoke-static {v1, v0, p2, v7}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v0

    const/4 v8, 0x0

    invoke-static {p2, v8}, LT/j;->a(LT/l;I)I

    move-result v1

    invoke-interface {p2}, LT/l;->G()LT/x;

    move-result-object v2

    invoke-static {p2, p0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v4, LE0/g;->K:LE0/g$a;

    invoke-virtual {v4}, LE0/g$a;->a()Lmh/a;

    move-result-object v5

    invoke-interface {p2}, LT/l;->x()LT/f;

    move-result-object v6

    if-nez v6, :cond_7

    invoke-static {}, LT/j;->c()V

    :cond_7
    invoke-interface {p2}, LT/l;->u()V

    invoke-interface {p2}, LT/l;->o()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-interface {p2, v5}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_8
    invoke-interface {p2}, LT/l;->I()V

    :goto_4
    invoke-static {p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v5

    invoke-virtual {v4}, LE0/g$a;->e()Lmh/p;

    move-result-object v6

    invoke-static {v5, v0, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v4}, LE0/g$a;->g()Lmh/p;

    move-result-object v0

    invoke-static {v5, v2, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v4}, LE0/g$a;->b()Lmh/p;

    move-result-object v0

    invoke-interface {v5}, LT/l;->o()Z

    move-result v2

    if-nez v2, :cond_9

    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v2, v6}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    :cond_9
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v5, v2}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v1, v0}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_a
    invoke-virtual {v4}, LE0/g$a;->f()Lmh/p;

    move-result-object v0

    invoke-static {v5, v3, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v0, Lz/Z;->a:Lz/Z;

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->g()Lcom/ui/wifiman/ui/teleport/z;

    move-result-object v2

    invoke-static {v2, p2, v8}, Lcom/ui/wifiman/ui/teleport/C;->c(Lcom/ui/wifiman/ui/teleport/z;LT/l;I)LT/z1;

    move-result-object v2

    invoke-interface {v2}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm0/v0;

    invoke-virtual {v2}, Lm0/v0;->u()J

    move-result-wide v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v4, p2

    invoke-static/range {v1 .. v6}, LBe/E;->b(Landroidx/compose/ui/e;JLT/l;II)V

    invoke-virtual {p1}, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->h()Ls9/d;

    move-result-object v1

    const/4 v2, 0x1

    if-eqz v1, :cond_b

    move v8, v2

    :cond_b
    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x3

    invoke-static {v1, v3, v4, v1}, Landroidx/compose/animation/g;->o(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/i;

    move-result-object v5

    invoke-static {v1, v3, v4, v1}, Landroidx/compose/animation/g;->q(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/k;

    move-result-object v6

    new-instance v1, Lcom/ui/wifiman/ui/teleport/consoles/u$h;

    invoke-direct {v1, p1, v0}, Lcom/ui/wifiman/ui/teleport/consoles/u$h;-><init>(Lcom/ui/wifiman/ui/teleport/consoles/h$a;Lz/Y;)V

    const v3, -0x7a466653

    invoke-static {v3, v2, v1, p2, v7}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    const v9, 0x186c06

    const/16 v10, 0x12

    const/4 v3, 0x0

    const/4 v11, 0x0

    move-object v1, v0

    move v2, v8

    move-object v4, v5

    move-object v5, v6

    move-object v6, v11

    move-object v8, p2

    invoke-static/range {v1 .. v10}, Lq/d;->e(Lz/Y;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-interface {p2}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-static {}, LT/o;->P()V

    :cond_c
    :goto_5
    invoke-interface {p2}, LT/l;->z()LT/X0;

    move-result-object p2

    if-eqz p2, :cond_d

    new-instance v0, Lcom/ui/wifiman/ui/teleport/consoles/k;

    invoke-direct {v0, p0, p1, p3}, Lcom/ui/wifiman/ui/teleport/consoles/k;-><init>(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/consoles/h$a;I)V

    invoke-interface {p2, v0}, LT/X0;->a(Lmh/p;)V

    :cond_d
    return-void
.end method

.method private static final z(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/consoles/h$a;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lcom/ui/wifiman/ui/teleport/consoles/u;->y(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/consoles/h$a;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
