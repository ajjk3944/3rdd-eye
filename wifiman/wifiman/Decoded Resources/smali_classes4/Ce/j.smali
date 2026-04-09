.class public abstract LCe/j;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Lz/j;LCi/c;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LCe/j;->s(Lz/j;LCi/c;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;LCe/b;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, LCe/j;->u(Landroidx/compose/ui/e;LCe/b;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/e;LCe/a$d;Ljava/lang/String;Lmh/q;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p7}, LCe/j;->i(Landroidx/compose/ui/e;LCe/a$d;Ljava/lang/String;Lmh/q;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/e;LCe/a$c;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LCe/j;->o(Landroidx/compose/ui/e;LCe/a$c;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroidx/compose/ui/e;LCe/a$a;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LCe/j;->k(Landroidx/compose/ui/e;LCe/a$a;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Landroidx/compose/ui/e;LCe/a$e;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LCe/j;->q(Landroidx/compose/ui/e;LCe/a$e;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Landroidx/compose/ui/e;LCe/a$b;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LCe/j;->m(Landroidx/compose/ui/e;LCe/a$b;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Landroidx/compose/ui/e;LCe/a$d;Ljava/lang/String;Lmh/q;LT/l;II)V
    .locals 19

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    const v0, 0x1790d5ee

    move-object/from16 v1, p4

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v1

    and-int/lit8 v2, p6, 0x1

    const/4 v6, 0x4

    if-eqz v2, :cond_0

    or-int/lit8 v7, v5, 0x6

    move v8, v7

    move-object/from16 v7, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v7, v5, 0x6

    if-nez v7, :cond_2

    move-object/from16 v7, p0

    invoke-interface {v1, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    move v8, v6

    goto :goto_0

    :cond_1
    const/4 v8, 0x2

    :goto_0
    or-int/2addr v8, v5

    goto :goto_1

    :cond_2
    move-object/from16 v7, p0

    move v8, v5

    :goto_1
    and-int/lit8 v9, p6, 0x2

    if-eqz v9, :cond_4

    or-int/lit8 v8, v8, 0x30

    :cond_3
    move-object/from16 v10, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v10, v5, 0x30

    if-nez v10, :cond_3

    move-object/from16 v10, p1

    invoke-interface {v1, v10}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_5

    const/16 v11, 0x20

    goto :goto_2

    :cond_5
    const/16 v11, 0x10

    :goto_2
    or-int/2addr v8, v11

    :goto_3
    and-int/lit8 v11, p6, 0x4

    if-eqz v11, :cond_6

    or-int/lit16 v8, v8, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v11, v5, 0x180

    if-nez v11, :cond_8

    invoke-interface {v1, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    const/16 v11, 0x100

    goto :goto_4

    :cond_7
    const/16 v11, 0x80

    :goto_4
    or-int/2addr v8, v11

    :cond_8
    :goto_5
    and-int/lit8 v11, p6, 0x8

    if-eqz v11, :cond_9

    or-int/lit16 v8, v8, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v11, v5, 0xc00

    if-nez v11, :cond_b

    invoke-interface {v1, v4}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    const/16 v11, 0x800

    goto :goto_6

    :cond_a
    const/16 v11, 0x400

    :goto_6
    or-int/2addr v8, v11

    :cond_b
    :goto_7
    and-int/lit16 v11, v8, 0x493

    const/16 v12, 0x492

    if-ne v11, v12, :cond_d

    invoke-interface {v1}, LT/l;->v()Z

    move-result v11

    if-nez v11, :cond_c

    goto :goto_8

    :cond_c
    invoke-interface {v1}, LT/l;->C()V

    move-object v2, v7

    goto/16 :goto_b

    :cond_d
    :goto_8
    if-eqz v2, :cond_e

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_9

    :cond_e
    move-object v2, v7

    :goto_9
    const/4 v7, 0x0

    if-eqz v9, :cond_f

    move-object v15, v7

    goto :goto_a

    :cond_f
    move-object v15, v10

    :goto_a
    invoke-static {}, LT/o;->H()Z

    move-result v9

    if-eqz v9, :cond_10

    const/4 v9, -0x1

    const-string v10, "com.ui.wifiman.ui.component.compliance.CountryBox (ProductComplianceUi.kt:151)"

    invoke-static {v0, v8, v9, v10}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_10
    const/4 v0, 0x0

    const/4 v8, 0x1

    invoke-static {v2, v0, v8, v7}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    int-to-float v6, v6

    invoke-static {v6}, LY0/h;->j(F)F

    move-result v6

    invoke-static {v6}, LE/h;->d(F)LE/g;

    move-result-object v7

    sget-object v6, Lla/a;->a:Lla/a;

    sget v9, Lla/a;->b:I

    invoke-virtual {v6, v1, v9}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v6

    invoke-virtual {v6}, Lma/a;->e()Lma/a$e;

    move-result-object v6

    invoke-virtual {v6}, Lma/a$e;->a()J

    move-result-wide v9

    new-instance v6, LCe/j$a;

    invoke-direct {v6, v15, v2, v3, v4}, LCe/j$a;-><init>(LCe/a$d;Landroidx/compose/ui/e;Ljava/lang/String;Lmh/q;)V

    const/16 v11, 0x36

    const v12, 0x5bb6bc2a

    invoke-static {v12, v8, v6, v1, v11}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v14

    const/high16 v16, 0x180000

    const/16 v17, 0x38

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/16 v18, 0x0

    move-object v6, v0

    move-wide v8, v9

    move-wide v10, v11

    move-object v12, v13

    move/from16 v13, v18

    move-object v0, v15

    move-object v15, v1

    invoke-static/range {v6 .. v17}, LN/O0;->a(Landroidx/compose/ui/e;Lm0/i1;JJLs/g;FLmh/p;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-static {}, LT/o;->P()V

    :cond_11
    move-object v10, v0

    :goto_b
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v7

    if-eqz v7, :cond_12

    new-instance v8, LCe/e;

    move-object v0, v8

    move-object v1, v2

    move-object v2, v10

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, LCe/e;-><init>(Landroidx/compose/ui/e;LCe/a$d;Ljava/lang/String;Lmh/q;II)V

    invoke-interface {v7, v8}, LT/X0;->a(Lmh/p;)V

    :cond_12
    return-void
.end method

.method private static final i(Landroidx/compose/ui/e;LCe/a$d;Ljava/lang/String;Lmh/q;IILT/l;I)LYg/J;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, LT/L0;->a(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p6

    move v6, p5

    invoke-static/range {v0 .. v6}, LCe/j;->h(Landroidx/compose/ui/e;LCe/a$d;Ljava/lang/String;Lmh/q;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final j(Landroidx/compose/ui/e;LCe/a$a;LT/l;I)V
    .locals 9

    const v0, -0x7624e547

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

    const-string v3, "com.ui.wifiman.ui.component.compliance.CountryInfoAU (ProductComplianceUi.kt:305)"

    invoke-static {v0, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    sget-object v0, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v0}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v0

    sget-object v1, Lz/c;->a:Lz/c;

    invoke-virtual {v1}, Lz/c;->f()Lz/c$e;

    move-result-object v1

    const/16 v2, 0x30

    invoke-static {v1, v0, p2, v2}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p2, v1}, LT/j;->a(LT/l;I)I

    move-result v2

    invoke-interface {p2}, LT/l;->G()LT/x;

    move-result-object v3

    invoke-static {p2, p0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v4

    sget-object v5, LE0/g;->K:LE0/g$a;

    invoke-virtual {v5}, LE0/g$a;->a()Lmh/a;

    move-result-object v6

    invoke-interface {p2}, LT/l;->x()LT/f;

    move-result-object v7

    if-nez v7, :cond_7

    invoke-static {}, LT/j;->c()V

    :cond_7
    invoke-interface {p2}, LT/l;->u()V

    invoke-interface {p2}, LT/l;->o()Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-interface {p2, v6}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_8
    invoke-interface {p2}, LT/l;->I()V

    :goto_4
    invoke-static {p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v6

    invoke-virtual {v5}, LE0/g$a;->e()Lmh/p;

    move-result-object v7

    invoke-static {v6, v0, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v5}, LE0/g$a;->g()Lmh/p;

    move-result-object v0

    invoke-static {v6, v3, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v5}, LE0/g$a;->b()Lmh/p;

    move-result-object v0

    invoke-interface {v6}, LT/l;->o()Z

    move-result v3

    if-nez v3, :cond_9

    invoke-interface {v6}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v3, v7}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    :cond_9
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v6, v3}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v6, v2, v0}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_a
    invoke-virtual {v5}, LE0/g$a;->f()Lmh/p;

    move-result-object v0

    invoke-static {v6, v4, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v0, Lz/Z;->a:Lz/Z;

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x1

    invoke-interface {v0, v2, v3, v4}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-static {v0, p2, v1}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    const/16 v0, 0xc

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/r;->z(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v0, p2, v1}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    const v0, -0x710344c3

    invoke-interface {p2, v0}, LT/l;->U(I)V

    invoke-virtual {p1}, LCe/a$a;->a()Z

    move-result v0

    if-eqz v0, :cond_b

    new-instance v1, Ls9/b$a;

    sget v4, Lm8/a;->x0:I

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v8}, Ls9/b$a;-><init>(ILs9/b$b;Ls9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v0, 0x38

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v2

    sget-object v0, Lla/a;->a:Lla/a;

    sget v3, Lla/a;->b:I

    invoke-virtual {v0, p2, v3}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a;->f()Lma/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lma/a$f;->b()J

    move-result-wide v3

    invoke-static {v3, v4}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v3

    const/16 v6, 0x30

    const/4 v7, 0x4

    const/4 v4, 0x0

    move-object v5, p2

    invoke-static/range {v1 .. v7}, Lta/c;->c(Ls9/b;Landroidx/compose/ui/e;Lm0/v0;Ljava/lang/String;LT/l;II)V

    :cond_b
    invoke-interface {p2}, LT/l;->J()V

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

    new-instance v0, LCe/i;

    invoke-direct {v0, p0, p1, p3}, LCe/i;-><init>(Landroidx/compose/ui/e;LCe/a$a;I)V

    invoke-interface {p2, v0}, LT/X0;->a(Lmh/p;)V

    :cond_d
    return-void
.end method

.method private static final k(Landroidx/compose/ui/e;LCe/a$a;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, LCe/j;->j(Landroidx/compose/ui/e;LCe/a$a;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final l(Landroidx/compose/ui/e;LCe/a$b;LT/l;I)V
    .locals 32

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const/16 v3, 0x30

    const v4, 0x1d4a7cf1

    move-object/from16 v5, p2

    invoke-interface {v5, v4}, LT/l;->r(I)LT/l;

    move-result-object v15

    const/4 v14, 0x6

    and-int/lit8 v5, v2, 0x6

    const/4 v13, 0x2

    if-nez v5, :cond_1

    invoke-interface {v15, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    move v5, v13

    :goto_0
    or-int/2addr v5, v2

    goto :goto_1

    :cond_1
    move v5, v2

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
    or-int/2addr v5, v6

    :cond_3
    and-int/lit8 v6, v5, 0x13

    const/16 v7, 0x12

    if-ne v6, v7, :cond_5

    invoke-interface {v15}, LT/l;->v()Z

    move-result v6

    if-nez v6, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v15}, LT/l;->C()V

    move-object v4, v15

    goto/16 :goto_6

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v6

    if-eqz v6, :cond_6

    const/4 v6, -0x1

    const-string v7, "com.ui.wifiman.ui.component.compliance.CountryInfoBR (ProductComplianceUi.kt:280)"

    invoke-static {v4, v5, v6, v7}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    sget-object v4, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v4}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v5

    sget-object v6, Lz/c;->a:Lz/c;

    invoke-virtual {v6}, Lz/c;->f()Lz/c$e;

    move-result-object v7

    invoke-static {v7, v5, v15, v3}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v3

    const/4 v5, 0x0

    invoke-static {v15, v5}, LT/j;->a(LT/l;I)I

    move-result v7

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v8

    invoke-static {v15, v0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v9

    sget-object v10, LE0/g;->K:LE0/g$a;

    invoke-virtual {v10}, LE0/g$a;->a()Lmh/a;

    move-result-object v11

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v12

    if-nez v12, :cond_7

    invoke-static {}, LT/j;->c()V

    :cond_7
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v12

    if-eqz v12, :cond_8

    invoke-interface {v15, v11}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_8
    invoke-interface {v15}, LT/l;->I()V

    :goto_4
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v11

    invoke-virtual {v10}, LE0/g$a;->e()Lmh/p;

    move-result-object v12

    invoke-static {v11, v3, v12}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v10}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v11, v8, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v10}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v11}, LT/l;->o()Z

    move-result v8

    if-nez v8, :cond_9

    invoke-interface {v11}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v8, v12}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_a

    :cond_9
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v11, v8}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v11, v7, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_a
    invoke-virtual {v10}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v11, v9, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Lz/Z;->a:Lz/Z;

    sget-object v12, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/high16 v7, 0x3f800000    # 1.0f

    const/4 v8, 0x1

    invoke-interface {v3, v12, v7, v8}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-static {v3, v15, v5}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    const/16 v3, 0xc

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v12, v3}, Landroidx/compose/foundation/layout/r;->z(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-static {v3, v15, v14}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-virtual {v6}, Lz/c;->g()Lz/c$m;

    move-result-object v3

    invoke-virtual {v4}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v4

    invoke-static {v3, v4, v15, v5}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v3

    invoke-static {v15, v5}, LT/j;->a(LT/l;I)I

    move-result v4

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v5

    invoke-static {v15, v12}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v6

    invoke-virtual {v10}, LE0/g$a;->a()Lmh/a;

    move-result-object v7

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v8

    if-nez v8, :cond_b

    invoke-static {}, LT/j;->c()V

    :cond_b
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v8

    if-eqz v8, :cond_c

    invoke-interface {v15, v7}, LT/l;->D(Lmh/a;)V

    goto :goto_5

    :cond_c
    invoke-interface {v15}, LT/l;->I()V

    :goto_5
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v7

    invoke-virtual {v10}, LE0/g$a;->e()Lmh/p;

    move-result-object v8

    invoke-static {v7, v3, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v10}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v7, v5, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v10}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v7}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_d

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_e

    :cond_d
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v7, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v7, v4, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_e
    invoke-virtual {v10}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v7, v6, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Lz/k;->a:Lz/k;

    new-instance v5, Ls9/c$a;

    sget v3, Lm8/a;->v0:I

    const/4 v4, 0x0

    invoke-direct {v5, v3, v4, v13, v4}, Ls9/c$a;-><init>(ILs9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v3, 0x1f

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v12, v3}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v6

    const/16 v3, 0x30

    const/16 v16, 0xfe

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/16 v17, 0x0

    move-object/from16 v30, v12

    move v12, v4

    move v4, v13

    move-object/from16 v13, v17

    move-object v14, v15

    move-object/from16 v31, v15

    move v15, v3

    invoke-static/range {v5 .. v16}, Lta/c;->e(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;Lf0/c;LC0/h;FLm0/w0;LT/l;II)V

    int-to-float v3, v4

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    move-object/from16 v4, v30

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v3

    move-object/from16 v4, v31

    const/4 v5, 0x6

    invoke-static {v3, v4, v5}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-virtual/range {p1 .. p1}, LCe/a$b;->a()Ljava/lang/String;

    move-result-object v5

    sget-object v3, Lla/a;->a:Lla/a;

    sget v6, Lla/a;->b:I

    invoke-virtual {v3, v4, v6}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v7

    invoke-virtual {v7}, Lpa/c;->b()Lpa/b;

    move-result-object v7

    invoke-virtual {v7}, Lpa/b;->a()LL0/U;

    move-result-object v25

    invoke-virtual {v3, v4, v6}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->f()Lma/a$f;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$f;->b()J

    move-result-wide v7

    const/16 v28, 0x0

    const v29, 0xfffa

    const/4 v6, 0x0

    const-wide/16 v9, 0x0

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

    const/16 v27, 0x0

    move-object/from16 v26, v4

    invoke-static/range {v5 .. v29}, LN/a1;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILmh/l;LL0/U;LT/l;III)V

    invoke-interface {v4}, LT/l;->R()V

    invoke-interface {v4}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_f

    invoke-static {}, LT/o;->P()V

    :cond_f
    :goto_6
    invoke-interface {v4}, LT/l;->z()LT/X0;

    move-result-object v3

    if-eqz v3, :cond_10

    new-instance v4, LCe/f;

    invoke-direct {v4, v0, v1, v2}, LCe/f;-><init>(Landroidx/compose/ui/e;LCe/a$b;I)V

    invoke-interface {v3, v4}, LT/X0;->a(Lmh/p;)V

    :cond_10
    return-void
.end method

.method private static final m(Landroidx/compose/ui/e;LCe/a$b;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, LCe/j;->l(Landroidx/compose/ui/e;LCe/a$b;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final n(Landroidx/compose/ui/e;LCe/a$c;LT/l;I)V
    .locals 33

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const/16 v3, 0x30

    const v4, -0x18fdd1f3

    move-object/from16 v5, p2

    invoke-interface {v5, v4}, LT/l;->r(I)LT/l;

    move-result-object v14

    const/4 v15, 0x6

    and-int/lit8 v5, v2, 0x6

    const/4 v13, 0x4

    if-nez v5, :cond_1

    invoke-interface {v14, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    move v5, v13

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v2

    goto :goto_1

    :cond_1
    move v5, v2

    :goto_1
    and-int/lit8 v6, v2, 0x30

    if-nez v6, :cond_3

    invoke-interface {v14, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_3
    and-int/lit8 v6, v5, 0x13

    const/16 v7, 0x12

    if-ne v6, v7, :cond_5

    invoke-interface {v14}, LT/l;->v()Z

    move-result v6

    if-nez v6, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v14}, LT/l;->C()V

    move-object/from16 v30, v14

    goto/16 :goto_6

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v6

    if-eqz v6, :cond_6

    const/4 v6, -0x1

    const-string v7, "com.ui.wifiman.ui.component.compliance.CountryInfoCA (ProductComplianceUi.kt:251)"

    invoke-static {v4, v5, v6, v7}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    sget-object v4, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v4}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v5

    sget-object v6, Lz/c;->a:Lz/c;

    invoke-virtual {v6}, Lz/c;->f()Lz/c$e;

    move-result-object v7

    invoke-static {v7, v5, v14, v3}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v3

    const/4 v12, 0x0

    invoke-static {v14, v12}, LT/j;->a(LT/l;I)I

    move-result v5

    invoke-interface {v14}, LT/l;->G()LT/x;

    move-result-object v7

    invoke-static {v14, v0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v8

    sget-object v9, LE0/g;->K:LE0/g$a;

    invoke-virtual {v9}, LE0/g$a;->a()Lmh/a;

    move-result-object v10

    invoke-interface {v14}, LT/l;->x()LT/f;

    move-result-object v11

    if-nez v11, :cond_7

    invoke-static {}, LT/j;->c()V

    :cond_7
    invoke-interface {v14}, LT/l;->u()V

    invoke-interface {v14}, LT/l;->o()Z

    move-result v11

    if-eqz v11, :cond_8

    invoke-interface {v14, v10}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_8
    invoke-interface {v14}, LT/l;->I()V

    :goto_4
    invoke-static {v14}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v10

    invoke-virtual {v9}, LE0/g$a;->e()Lmh/p;

    move-result-object v11

    invoke-static {v10, v3, v11}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v10, v7, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v10}, LT/l;->o()Z

    move-result v7

    if-nez v7, :cond_9

    invoke-interface {v10}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v7, v11}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_a

    :cond_9
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v10, v7}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v10, v5, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_a
    invoke-virtual {v9}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v10, v8, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Lz/Z;->a:Lz/Z;

    sget-object v11, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v10, 0x1

    invoke-interface {v3, v11, v5, v10}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-static {v3, v14, v12}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    const/16 v3, 0xc

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v11, v3}, Landroidx/compose/foundation/layout/r;->z(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-static {v3, v14, v15}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-virtual {v6}, Lz/c;->g()Lz/c$m;

    move-result-object v3

    invoke-virtual {v4}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v4

    invoke-static {v3, v4, v14, v12}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v3

    invoke-static {v14, v12}, LT/j;->a(LT/l;I)I

    move-result v4

    invoke-interface {v14}, LT/l;->G()LT/x;

    move-result-object v5

    invoke-static {v14, v11}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v6

    invoke-virtual {v9}, LE0/g$a;->a()Lmh/a;

    move-result-object v7

    invoke-interface {v14}, LT/l;->x()LT/f;

    move-result-object v8

    if-nez v8, :cond_b

    invoke-static {}, LT/j;->c()V

    :cond_b
    invoke-interface {v14}, LT/l;->u()V

    invoke-interface {v14}, LT/l;->o()Z

    move-result v8

    if-eqz v8, :cond_c

    invoke-interface {v14, v7}, LT/l;->D(Lmh/a;)V

    goto :goto_5

    :cond_c
    invoke-interface {v14}, LT/l;->I()V

    :goto_5
    invoke-static {v14}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v7

    invoke-virtual {v9}, LE0/g$a;->e()Lmh/p;

    move-result-object v8

    invoke-static {v7, v3, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v7, v5, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v7}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_d

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_e

    :cond_d
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v7, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v7, v4, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_e
    invoke-virtual {v9}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v7, v6, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Lz/k;->a:Lz/k;

    sget v3, Lm8/c;->y0:I

    invoke-static {v3, v14, v12}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, LCe/a$c;->b()Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    move-object v5, v3

    const-string v4, "format(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lla/a;->a:Lla/a;

    sget v9, Lla/a;->b:I

    invoke-virtual {v3, v14, v9}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v6

    invoke-virtual {v6}, Lpa/c;->b()Lpa/b;

    move-result-object v6

    invoke-virtual {v6}, Lpa/b;->a()LL0/U;

    move-result-object v25

    invoke-virtual {v3, v14, v9}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v6

    invoke-virtual {v6}, Lma/a;->f()Lma/a$f;

    move-result-object v6

    invoke-virtual {v6}, Lma/a$f;->b()J

    move-result-wide v7

    const/16 v28, 0x0

    const v29, 0xfffa

    const/4 v6, 0x0

    const-wide/16 v16, 0x0

    move/from16 v31, v9

    move-wide/from16 v9, v16

    const/16 v16, 0x0

    move-object/from16 v32, v11

    move-object/from16 v11, v16

    move-object/from16 v12, v16

    move-object/from16 v13, v16

    const-wide/16 v16, 0x0

    move-object/from16 p2, v14

    move-wide/from16 v14, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v27, 0x0

    move-object/from16 v26, p2

    invoke-static/range {v5 .. v29}, LN/a1;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILmh/l;LL0/U;LT/l;III)V

    const/4 v5, 0x4

    int-to-float v5, v5

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    move-object/from16 v6, v32

    invoke-static {v6, v5}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v5

    move-object/from16 v14, p2

    const/4 v6, 0x6

    invoke-static {v5, v14, v6}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    sget v5, Lm8/c;->z0:I

    const/4 v6, 0x0

    invoke-static {v5, v14, v6}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, LCe/a$c;->a()Ljava/lang/String;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    const/4 v7, 0x1

    invoke-static {v6, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    move-object v5, v6

    invoke-static {v6, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move/from16 v4, v31

    invoke-virtual {v3, v14, v4}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v6

    invoke-virtual {v6}, Lpa/c;->b()Lpa/b;

    move-result-object v6

    invoke-virtual {v6}, Lpa/b;->a()LL0/U;

    move-result-object v25

    invoke-virtual {v3, v14, v4}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->f()Lma/a$f;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$f;->b()J

    move-result-wide v7

    const/4 v6, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v3, 0x0

    move-object/from16 v30, v14

    move-wide v14, v3

    move-object/from16 v26, v30

    invoke-static/range {v5 .. v29}, LN/a1;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILmh/l;LL0/U;LT/l;III)V

    invoke-interface/range {v30 .. v30}, LT/l;->R()V

    invoke-interface/range {v30 .. v30}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_f

    invoke-static {}, LT/o;->P()V

    :cond_f
    :goto_6
    invoke-interface/range {v30 .. v30}, LT/l;->z()LT/X0;

    move-result-object v3

    if-eqz v3, :cond_10

    new-instance v4, LCe/g;

    invoke-direct {v4, v0, v1, v2}, LCe/g;-><init>(Landroidx/compose/ui/e;LCe/a$c;I)V

    invoke-interface {v3, v4}, LT/X0;->a(Lmh/p;)V

    :cond_10
    return-void
.end method

.method private static final o(Landroidx/compose/ui/e;LCe/a$c;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, LCe/j;->n(Landroidx/compose/ui/e;LCe/a$c;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final p(Landroidx/compose/ui/e;LCe/a$e;LT/l;I)V
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const v3, -0x10b5bd93

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LT/l;->r(I)LT/l;

    move-result-object v15

    and-int/lit8 v4, v2, 0x6

    if-nez v4, :cond_1

    invoke-interface {v15, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

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
    and-int/lit8 v5, v4, 0x13

    const/16 v6, 0x12

    if-ne v5, v6, :cond_5

    invoke-interface {v15}, LT/l;->v()Z

    move-result v5

    if-nez v5, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v15}, LT/l;->C()V

    move-object/from16 v29, v15

    goto/16 :goto_5

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v5

    if-eqz v5, :cond_6

    const/4 v5, -0x1

    const-string v6, "com.ui.wifiman.ui.component.compliance.CountryInfoUS (ProductComplianceUi.kt:227)"

    invoke-static {v3, v4, v5, v6}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    sget-object v3, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v3}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v3

    sget-object v4, Lz/c;->a:Lz/c;

    invoke-virtual {v4}, Lz/c;->f()Lz/c$e;

    move-result-object v4

    const/16 v5, 0x30

    invoke-static {v4, v3, v15, v5}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v3

    const/4 v11, 0x0

    invoke-static {v15, v11}, LT/j;->a(LT/l;I)I

    move-result v4

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v5

    invoke-static {v15, v0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v6

    sget-object v7, LE0/g;->K:LE0/g$a;

    invoke-virtual {v7}, LE0/g$a;->a()Lmh/a;

    move-result-object v8

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v9

    if-nez v9, :cond_7

    invoke-static {}, LT/j;->c()V

    :cond_7
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v9

    if-eqz v9, :cond_8

    invoke-interface {v15, v8}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_8
    invoke-interface {v15}, LT/l;->I()V

    :goto_4
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v8

    invoke-virtual {v7}, LE0/g$a;->e()Lmh/p;

    move-result-object v9

    invoke-static {v8, v3, v9}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v7}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v8, v5, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v7}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v8}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_9

    invoke-interface {v8}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v5, v9}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_a

    :cond_9
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v8, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v8, v4, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_a
    invoke-virtual {v7}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v8, v6, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Lz/Z;->a:Lz/Z;

    sget-object v12, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v13, 0x1

    invoke-interface {v3, v12, v4, v13}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-static {v3, v15, v11}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    sget-object v3, LPe/a;->a:LPe/a;

    invoke-virtual {v3}, LPe/a;->A()Ls9/b;

    move-result-object v4

    const/16 v3, 0x1c

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v12, v3}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v5

    sget-object v3, Lla/a;->a:Lla/a;

    sget v14, Lla/a;->b:I

    invoke-virtual {v3, v15, v14}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v6

    invoke-virtual {v6}, Lma/a;->f()Lma/a$f;

    move-result-object v6

    invoke-virtual {v6}, Lma/a$f;->b()J

    move-result-wide v6

    invoke-static {v6, v7}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v6

    const/16 v9, 0x36

    const/4 v10, 0x4

    const/4 v7, 0x0

    move-object v8, v15

    invoke-static/range {v4 .. v10}, Lta/c;->c(Ls9/b;Landroidx/compose/ui/e;Lm0/v0;Ljava/lang/String;LT/l;II)V

    const/16 v4, 0xc

    int-to-float v4, v4

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    invoke-static {v12, v4}, Landroidx/compose/foundation/layout/r;->z(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v4

    const/4 v5, 0x6

    invoke-static {v4, v15, v5}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    sget v4, Lm8/c;->A0:I

    invoke-static {v4, v15, v11}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, LCe/a$e;->a()Ljava/lang/String;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    move-object v4, v5

    const-string v6, "format(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v15, v14}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v5

    invoke-virtual {v5}, Lpa/c;->b()Lpa/b;

    move-result-object v5

    invoke-virtual {v5}, Lpa/b;->a()LL0/U;

    move-result-object v24

    invoke-virtual {v3, v15, v14}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->f()Lma/a$f;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$f;->b()J

    move-result-wide v6

    const/16 v27, 0x0

    const v28, 0xfffa

    const/4 v5, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v3, 0x0

    move-object/from16 v29, v15

    move-object v15, v3

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v26, 0x0

    move-object/from16 v25, v29

    invoke-static/range {v4 .. v28}, LN/a1;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILmh/l;LL0/U;LT/l;III)V

    invoke-interface/range {v29 .. v29}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-static {}, LT/o;->P()V

    :cond_b
    :goto_5
    invoke-interface/range {v29 .. v29}, LT/l;->z()LT/X0;

    move-result-object v3

    if-eqz v3, :cond_c

    new-instance v4, LCe/d;

    invoke-direct {v4, v0, v1, v2}, LCe/d;-><init>(Landroidx/compose/ui/e;LCe/a$e;I)V

    invoke-interface {v3, v4}, LT/X0;->a(Lmh/p;)V

    :cond_c
    return-void
.end method

.method private static final q(Landroidx/compose/ui/e;LCe/a$e;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, LCe/j;->p(Landroidx/compose/ui/e;LCe/a$e;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final r(Lz/j;LCi/c;LT/l;I)V
    .locals 31

    move-object/from16 v0, p1

    move/from16 v1, p3

    const v2, -0x3d1cde68

    move-object/from16 v3, p2

    invoke-interface {v3, v2}, LT/l;->r(I)LT/l;

    move-result-object v14

    and-int/lit8 v3, v1, 0x30

    const/16 v12, 0x10

    if-nez v3, :cond_1

    invoke-interface {v14, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x20

    goto :goto_0

    :cond_0
    move v3, v12

    :goto_0
    or-int/2addr v3, v1

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    and-int/lit8 v4, v3, 0x11

    if-ne v4, v12, :cond_3

    invoke-interface {v14}, LT/l;->v()Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {v14}, LT/l;->C()V

    move-object/from16 v30, v14

    goto/16 :goto_5

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_4

    const/4 v4, -0x1

    const-string v5, "com.ui.wifiman.ui.component.compliance.CountryWarningInfo (ProductComplianceUi.kt:323)"

    invoke-static {v2, v3, v4, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    invoke-interface/range {p1 .. p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v28, v3, 0x1

    if-gez v3, :cond_5

    invoke-static {}, LZg/v;->v()V

    :cond_5
    move-object/from16 v24, v4

    check-cast v24, Ljava/lang/String;

    const v4, 0x78136d39

    invoke-interface {v14, v4}, LT/l;->U(I)V

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/4 v11, 0x1

    if-eqz v3, :cond_6

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v3, v15, v11, v13}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    const/4 v10, 0x6

    const/16 v16, 0x1e

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v9, v14

    move v12, v11

    move/from16 v11, v16

    invoke-static/range {v3 .. v11}, Lz9/b;->b(Landroidx/compose/ui/e;JFFFLT/l;II)V

    goto :goto_4

    :cond_6
    move v12, v11

    :goto_4
    invoke-interface {v14}, LT/l;->J()V

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v3, v15, v12, v13}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    const/16 v11, 0x10

    int-to-float v4, v11

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    invoke-static {v3, v15, v4, v12, v13}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    sget-object v3, Lla/a;->a:Lla/a;

    sget v5, Lla/a;->b:I

    invoke-virtual {v3, v14, v5}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v6

    invoke-virtual {v6}, Lpa/c;->b()Lpa/b;

    move-result-object v6

    invoke-virtual {v6}, Lpa/b;->f()LL0/U;

    move-result-object v23

    invoke-virtual {v3, v14, v5}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->f()Lma/a$f;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$f;->c()J

    move-result-wide v5

    sget-object v3, LW0/j;->b:LW0/j$a;

    invoke-virtual {v3}, LW0/j$a;->f()I

    move-result v3

    invoke-static {v3}, LW0/j;->h(I)LW0/j;

    move-result-object v15

    const/16 v26, 0x0

    const v27, 0xfdf8

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v3, 0x0

    move v12, v11

    move-object v11, v3

    const-wide/16 v16, 0x0

    move/from16 v29, v12

    move-wide/from16 v12, v16

    move-object/from16 v30, v14

    move-object v14, v3

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v25, 0x30

    move-object/from16 v3, v24

    move-object/from16 v24, v30

    invoke-static/range {v3 .. v27}, LN/a1;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILmh/l;LL0/U;LT/l;III)V

    move/from16 v3, v28

    move/from16 v12, v29

    move-object/from16 v14, v30

    goto/16 :goto_3

    :cond_7
    move-object/from16 v30, v14

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-static {}, LT/o;->P()V

    :cond_8
    :goto_5
    invoke-interface/range {v30 .. v30}, LT/l;->z()LT/X0;

    move-result-object v2

    if-eqz v2, :cond_9

    new-instance v3, LCe/h;

    move-object/from16 v4, p0

    invoke-direct {v3, v4, v0, v1}, LCe/h;-><init>(Lz/j;LCi/c;I)V

    invoke-interface {v2, v3}, LT/X0;->a(Lmh/p;)V

    :cond_9
    return-void
.end method

.method private static final s(Lz/j;LCi/c;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, LCe/j;->r(Lz/j;LCi/c;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final t(Landroidx/compose/ui/e;LCe/b;LT/l;II)V
    .locals 20

    move-object/from16 v0, p1

    move/from16 v1, p3

    move/from16 v2, p4

    const-string v3, "vm"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, -0x50e02db1

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LT/l;->r(I)LT/l;

    move-result-object v11

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

    invoke-interface {v11, v5}, LT/l;->T(Ljava/lang/Object;)Z

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

    const/16 v12, 0x10

    if-eqz v7, :cond_3

    or-int/lit8 v6, v6, 0x30

    goto :goto_4

    :cond_3
    and-int/lit8 v7, v1, 0x30

    if-nez v7, :cond_6

    and-int/lit8 v7, v1, 0x40

    if-nez v7, :cond_4

    invoke-interface {v11, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    goto :goto_2

    :cond_4
    invoke-interface {v11, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v7

    :goto_2
    if-eqz v7, :cond_5

    const/16 v7, 0x20

    goto :goto_3

    :cond_5
    move v7, v12

    :goto_3
    or-int/2addr v6, v7

    :cond_6
    :goto_4
    and-int/lit8 v7, v6, 0x13

    const/16 v8, 0x12

    if-ne v7, v8, :cond_8

    invoke-interface {v11}, LT/l;->v()Z

    move-result v7

    if-nez v7, :cond_7

    goto :goto_5

    :cond_7
    invoke-interface {v11}, LT/l;->C()V

    move-object v13, v5

    goto/16 :goto_10

    :cond_8
    :goto_5
    if-eqz v4, :cond_9

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v13, v4

    goto :goto_6

    :cond_9
    move-object v13, v5

    :goto_6
    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_a

    const/4 v4, -0x1

    const-string v5, "com.ui.wifiman.ui.component.compliance.ProductComplianceContent (ProductComplianceUi.kt:96)"

    invoke-static {v3, v6, v4, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_a
    sget-object v3, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v3}, Lf0/c$a;->g()Lf0/c$b;

    move-result-object v3

    sget-object v4, Lz/c;->a:Lz/c;

    invoke-virtual {v4}, Lz/c;->g()Lz/c$m;

    move-result-object v4

    const/16 v5, 0x30

    invoke-static {v4, v3, v11, v5}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v11, v4}, LT/j;->a(LT/l;I)I

    move-result v5

    invoke-interface {v11}, LT/l;->G()LT/x;

    move-result-object v6

    invoke-static {v11, v13}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v7

    sget-object v8, LE0/g;->K:LE0/g$a;

    invoke-virtual {v8}, LE0/g$a;->a()Lmh/a;

    move-result-object v9

    invoke-interface {v11}, LT/l;->x()LT/f;

    move-result-object v10

    if-nez v10, :cond_b

    invoke-static {}, LT/j;->c()V

    :cond_b
    invoke-interface {v11}, LT/l;->u()V

    invoke-interface {v11}, LT/l;->o()Z

    move-result v10

    if-eqz v10, :cond_c

    invoke-interface {v11, v9}, LT/l;->D(Lmh/a;)V

    goto :goto_7

    :cond_c
    invoke-interface {v11}, LT/l;->I()V

    :goto_7
    invoke-static {v11}, LT/E1;->a(LT/l;)LT/l;

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

    if-nez v6, :cond_d

    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v6, v10}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_e

    :cond_d
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v9, v6}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v9, v5, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_e
    invoke-virtual {v8}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v9, v7, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Lz/k;->a:Lz/k;

    invoke-interface/range {p1 .. p1}, LCe/b;->z()LLi/N;

    move-result-object v5

    const/4 v14, 0x0

    const/4 v15, 0x1

    invoke-static {v5, v14, v11, v4, v15}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v4

    invoke-interface {v4}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v16, v4

    check-cast v16, LCe/a;

    invoke-virtual/range {v16 .. v16}, LCe/a;->d()LCe/a$d;

    move-result-object v4

    invoke-virtual/range {v16 .. v16}, LCe/a;->e()LCe/a$e;

    move-result-object v10

    const v5, -0x6a21eeff

    invoke-interface {v11, v5}, LT/l;->U(I)V

    const/16 v9, 0x36

    const/4 v8, 0x6

    if-nez v10, :cond_f

    move v14, v8

    goto :goto_9

    :cond_f
    if-eqz v4, :cond_10

    move-object v5, v4

    move-object/from16 v17, v14

    goto :goto_8

    :cond_10
    move-object/from16 v17, v4

    move-object v5, v14

    :goto_8
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v6, "US"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, LCe/j;->z(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    new-instance v4, LCe/j$b;

    invoke-direct {v4, v10}, LCe/j$b;-><init>(LCe/a$e;)V

    const v7, 0x4965a597

    invoke-static {v7, v15, v4, v11, v9}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    const/16 v18, 0xc00

    const/16 v19, 0x1

    const/4 v4, 0x0

    move v14, v8

    move-object v8, v11

    move/from16 v9, v18

    move-object/from16 v18, v10

    move/from16 v10, v19

    invoke-static/range {v4 .. v10}, LCe/j;->h(Landroidx/compose/ui/e;LCe/a$d;Ljava/lang/String;Lmh/q;LT/l;II)V

    const v4, -0x6a21cf99

    invoke-interface {v11, v4}, LT/l;->U(I)V

    invoke-virtual/range {v18 .. v18}, LCe/a$e;->b()LCi/c;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_11

    invoke-virtual/range {v18 .. v18}, LCe/a$e;->b()LCi/c;

    move-result-object v4

    invoke-static {v3, v4, v11, v14}, LCe/j;->r(Lz/j;LCi/c;LT/l;I)V

    :cond_11
    invoke-interface {v11}, LT/l;->J()V

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    int-to-float v5, v12

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v4

    invoke-static {v4, v11, v14}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    move-object/from16 v4, v17

    :goto_9
    invoke-interface {v11}, LT/l;->J()V

    invoke-virtual/range {v16 .. v16}, LCe/a;->c()LCe/a$c;

    move-result-object v10

    const v5, -0x6a21b9bb

    invoke-interface {v11, v5}, LT/l;->U(I)V

    if-nez v10, :cond_12

    goto :goto_b

    :cond_12
    if-eqz v4, :cond_13

    move-object v5, v4

    const/16 v17, 0x0

    goto :goto_a

    :cond_13
    move-object/from16 v17, v4

    const/4 v5, 0x0

    :goto_a
    sget-object v4, Ljava/util/Locale;->CANADA:Ljava/util/Locale;

    const-string v6, "CANADA"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, LCe/j;->z(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    new-instance v4, LCe/j$c;

    invoke-direct {v4, v10}, LCe/j$c;-><init>(LCe/a$c;)V

    const v7, 0x658ddea0

    const/16 v9, 0x36

    invoke-static {v7, v15, v4, v11, v9}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    const/16 v18, 0xc00

    const/16 v19, 0x1

    const/4 v4, 0x0

    move-object v8, v11

    move/from16 v9, v18

    move-object/from16 v18, v10

    move/from16 v10, v19

    invoke-static/range {v4 .. v10}, LCe/j;->h(Landroidx/compose/ui/e;LCe/a$d;Ljava/lang/String;Lmh/q;LT/l;II)V

    const v4, -0x6a2199d9

    invoke-interface {v11, v4}, LT/l;->U(I)V

    invoke-virtual/range {v18 .. v18}, LCe/a$c;->c()LCi/c;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_14

    invoke-virtual/range {v18 .. v18}, LCe/a$c;->c()LCi/c;

    move-result-object v4

    invoke-static {v3, v4, v11, v14}, LCe/j;->r(Lz/j;LCi/c;LT/l;I)V

    :cond_14
    invoke-interface {v11}, LT/l;->J()V

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    int-to-float v4, v12

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-static {v3, v11, v14}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    move-object/from16 v4, v17

    :goto_b
    invoke-interface {v11}, LT/l;->J()V

    invoke-virtual/range {v16 .. v16}, LCe/a;->a()LCe/a$a;

    move-result-object v3

    const v5, -0x6a21843e

    invoke-interface {v11, v5}, LT/l;->U(I)V

    if-nez v3, :cond_15

    goto :goto_d

    :cond_15
    if-eqz v4, :cond_16

    move-object v5, v4

    const/16 v17, 0x0

    goto :goto_c

    :cond_16
    move-object/from16 v17, v4

    const/4 v5, 0x0

    :goto_c
    new-instance v4, Ljava/util/Locale;

    const-string v6, "en"

    const-string v7, "au"

    invoke-direct {v4, v6, v7}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v4}, LCe/j;->z(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    new-instance v4, LCe/j$d;

    invoke-direct {v4, v3}, LCe/j$d;-><init>(LCe/a$a;)V

    const v3, 0x7cc0a4a9

    const/16 v10, 0x36

    invoke-static {v3, v15, v4, v11, v10}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    const/16 v9, 0xc00

    const/4 v3, 0x1

    const/4 v4, 0x0

    move-object v8, v11

    move v10, v3

    invoke-static/range {v4 .. v10}, LCe/j;->h(Landroidx/compose/ui/e;LCe/a$d;Ljava/lang/String;Lmh/q;LT/l;II)V

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    int-to-float v4, v12

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-static {v3, v11, v14}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    move-object/from16 v4, v17

    :goto_d
    invoke-interface {v11}, LT/l;->J()V

    invoke-virtual/range {v16 .. v16}, LCe/a;->b()LCe/a$b;

    move-result-object v3

    const v5, -0x6a2156de

    invoke-interface {v11, v5}, LT/l;->U(I)V

    if-nez v3, :cond_17

    goto :goto_f

    :cond_17
    if-eqz v4, :cond_18

    move-object v5, v4

    goto :goto_e

    :cond_18
    const/4 v5, 0x0

    :goto_e
    new-instance v4, Ljava/util/Locale;

    const-string v6, "pt"

    const-string v7, "br"

    invoke-direct {v4, v6, v7}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v4}, LCe/j;->z(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    new-instance v4, LCe/j$e;

    invoke-direct {v4, v3}, LCe/j$e;-><init>(LCe/a$b;)V

    const v3, 0x77f5e92c

    const/16 v7, 0x36

    invoke-static {v3, v15, v4, v11, v7}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    const/16 v9, 0xc00

    const/4 v10, 0x1

    const/4 v4, 0x0

    move-object v8, v11

    invoke-static/range {v4 .. v10}, LCe/j;->h(Landroidx/compose/ui/e;LCe/a$d;Ljava/lang/String;Lmh/q;LT/l;II)V

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    int-to-float v4, v12

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-static {v3, v11, v14}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    :goto_f
    invoke-interface {v11}, LT/l;->J()V

    invoke-interface {v11}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_19

    invoke-static {}, LT/o;->P()V

    :cond_19
    :goto_10
    invoke-interface {v11}, LT/l;->z()LT/X0;

    move-result-object v3

    if-eqz v3, :cond_1a

    new-instance v4, LCe/c;

    invoke-direct {v4, v13, v0, v1, v2}, LCe/c;-><init>(Landroidx/compose/ui/e;LCe/b;II)V

    invoke-interface {v3, v4}, LT/X0;->a(Lmh/p;)V

    :cond_1a
    return-void
.end method

.method private static final u(Landroidx/compose/ui/e;LCe/b;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, LCe/j;->t(Landroidx/compose/ui/e;LCe/b;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final synthetic v(Landroidx/compose/ui/e;LCe/a$a;LT/l;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, LCe/j;->j(Landroidx/compose/ui/e;LCe/a$a;LT/l;I)V

    return-void
.end method

.method public static final synthetic w(Landroidx/compose/ui/e;LCe/a$b;LT/l;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, LCe/j;->l(Landroidx/compose/ui/e;LCe/a$b;LT/l;I)V

    return-void
.end method

.method public static final synthetic x(Landroidx/compose/ui/e;LCe/a$c;LT/l;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, LCe/j;->n(Landroidx/compose/ui/e;LCe/a$c;LT/l;I)V

    return-void
.end method

.method public static final synthetic y(Landroidx/compose/ui/e;LCe/a$e;LT/l;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, LCe/j;->p(Landroidx/compose/ui/e;LCe/a$e;LT/l;I)V

    return-void
.end method

.method private static final z(Ljava/util/Locale;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/util/Locale;->getDisplayCountry(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "us locale unavailable"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
