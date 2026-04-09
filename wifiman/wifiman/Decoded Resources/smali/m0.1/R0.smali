.class public abstract Lm0/R0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lo0/f;Lm0/Q0;Lm0/l0;FLo0/g;Lm0/w0;I)V
    .locals 14

    move-object v0, p1

    instance-of v1, v0, Lm0/Q0$b;

    if-eqz v1, :cond_0

    check-cast v0, Lm0/Q0$b;

    invoke-virtual {v0}, Lm0/Q0$b;->b()Ll0/i;

    move-result-object v0

    invoke-static {v0}, Lm0/R0;->g(Ll0/i;)J

    move-result-wide v3

    invoke-static {v0}, Lm0/R0;->e(Ll0/i;)J

    move-result-wide v5

    move-object v1, p0

    move-object/from16 v2, p2

    move/from16 v7, p3

    move-object/from16 v8, p4

    move-object/from16 v9, p5

    move/from16 v10, p6

    invoke-interface/range {v1 .. v10}, Lo0/f;->p0(Lm0/l0;JJFLo0/g;Lm0/w0;I)V

    goto :goto_1

    :cond_0
    instance-of v1, v0, Lm0/Q0$c;

    if-eqz v1, :cond_2

    check-cast v0, Lm0/Q0$c;

    invoke-virtual {v0}, Lm0/Q0$c;->c()Lm0/U0;

    move-result-object v2

    if-eqz v2, :cond_1

    :goto_0
    move-object v1, p0

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    invoke-interface/range {v1 .. v7}, Lo0/f;->l1(Lm0/U0;Lm0/l0;FLo0/g;Lm0/w0;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lm0/Q0$c;->b()Ll0/k;

    move-result-object v0

    invoke-virtual {v0}, Ll0/k;->b()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/a;->d(J)F

    move-result v1

    invoke-static {v0}, Lm0/R0;->h(Ll0/k;)J

    move-result-wide v4

    invoke-static {v0}, Lm0/R0;->f(Ll0/k;)J

    move-result-wide v6

    const/4 v0, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v1, v3, v0, v2}, Ll0/b;->b(FFILjava/lang/Object;)J

    move-result-wide v8

    move-object v2, p0

    move-object/from16 v3, p2

    move/from16 v10, p3

    move-object/from16 v11, p4

    move-object/from16 v12, p5

    move/from16 v13, p6

    invoke-interface/range {v2 .. v13}, Lo0/f;->m1(Lm0/l0;JJJFLo0/g;Lm0/w0;I)V

    goto :goto_1

    :cond_2
    instance-of v1, v0, Lm0/Q0$a;

    if-eqz v1, :cond_3

    check-cast v0, Lm0/Q0$a;

    invoke-virtual {v0}, Lm0/Q0$a;->b()Lm0/U0;

    move-result-object v2

    goto :goto_0

    :goto_1
    return-void

    :cond_3
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public static synthetic b(Lo0/f;Lm0/Q0;Lm0/l0;FLo0/g;Lm0/w0;IILjava/lang/Object;)V
    .locals 7

    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_0

    const/high16 p3, 0x3f800000    # 1.0f

    :cond_0
    move v3, p3

    and-int/lit8 p3, p7, 0x8

    if-eqz p3, :cond_1

    sget-object p4, Lo0/j;->a:Lo0/j;

    :cond_1
    move-object v4, p4

    and-int/lit8 p3, p7, 0x10

    if-eqz p3, :cond_2

    const/4 p5, 0x0

    :cond_2
    move-object v5, p5

    and-int/lit8 p3, p7, 0x20

    if-eqz p3, :cond_3

    sget-object p3, Lo0/f;->d1:Lo0/f$a;

    invoke-virtual {p3}, Lo0/f$a;->a()I

    move-result p6

    :cond_3
    move v6, p6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v6}, Lm0/R0;->a(Lo0/f;Lm0/Q0;Lm0/l0;FLo0/g;Lm0/w0;I)V

    return-void
.end method

.method public static final c(Lo0/f;Lm0/Q0;JFLo0/g;Lm0/w0;I)V
    .locals 15

    move-object/from16 v0, p1

    instance-of v1, v0, Lm0/Q0$b;

    if-eqz v1, :cond_0

    check-cast v0, Lm0/Q0$b;

    invoke-virtual {v0}, Lm0/Q0$b;->b()Ll0/i;

    move-result-object v0

    invoke-static {v0}, Lm0/R0;->g(Ll0/i;)J

    move-result-wide v4

    invoke-static {v0}, Lm0/R0;->e(Ll0/i;)J

    move-result-wide v6

    move-object v1, p0

    move-wide/from16 v2, p2

    move/from16 v8, p4

    move-object/from16 v9, p5

    move-object/from16 v10, p6

    move/from16 v11, p7

    invoke-interface/range {v1 .. v11}, Lo0/f;->j0(JJJFLo0/g;Lm0/w0;I)V

    goto :goto_1

    :cond_0
    instance-of v1, v0, Lm0/Q0$c;

    if-eqz v1, :cond_2

    check-cast v0, Lm0/Q0$c;

    invoke-virtual {v0}, Lm0/Q0$c;->c()Lm0/U0;

    move-result-object v2

    if-eqz v2, :cond_1

    :goto_0
    move-object v1, p0

    move-wide/from16 v3, p2

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    invoke-interface/range {v1 .. v8}, Lo0/f;->t0(Lm0/U0;JFLo0/g;Lm0/w0;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lm0/Q0$c;->b()Ll0/k;

    move-result-object v0

    invoke-virtual {v0}, Ll0/k;->b()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/a;->d(J)F

    move-result v1

    invoke-static {v0}, Lm0/R0;->h(Ll0/k;)J

    move-result-wide v5

    invoke-static {v0}, Lm0/R0;->f(Ll0/k;)J

    move-result-wide v7

    const/4 v0, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v1, v3, v0, v2}, Ll0/b;->b(FFILjava/lang/Object;)J

    move-result-wide v9

    move-object v2, p0

    move-wide/from16 v3, p2

    move-object/from16 v11, p5

    move/from16 v12, p4

    move-object/from16 v13, p6

    move/from16 v14, p7

    invoke-interface/range {v2 .. v14}, Lo0/f;->j1(JJJJLo0/g;FLm0/w0;I)V

    goto :goto_1

    :cond_2
    instance-of v1, v0, Lm0/Q0$a;

    if-eqz v1, :cond_3

    check-cast v0, Lm0/Q0$a;

    invoke-virtual {v0}, Lm0/Q0$a;->b()Lm0/U0;

    move-result-object v2

    goto :goto_0

    :goto_1
    return-void

    :cond_3
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public static synthetic d(Lo0/f;Lm0/Q0;JFLo0/g;Lm0/w0;IILjava/lang/Object;)V
    .locals 9

    and-int/lit8 v0, p8, 0x4

    if-eqz v0, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    move v5, v0

    goto :goto_0

    :cond_0
    move v5, p4

    :goto_0
    and-int/lit8 v0, p8, 0x8

    if-eqz v0, :cond_1

    sget-object v0, Lo0/j;->a:Lo0/j;

    move-object v6, v0

    goto :goto_1

    :cond_1
    move-object v6, p5

    :goto_1
    and-int/lit8 v0, p8, 0x10

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    move-object v7, v0

    goto :goto_2

    :cond_2
    move-object v7, p6

    :goto_2
    and-int/lit8 v0, p8, 0x20

    if-eqz v0, :cond_3

    sget-object v0, Lo0/f;->d1:Lo0/f$a;

    invoke-virtual {v0}, Lo0/f$a;->a()I

    move-result v0

    move v8, v0

    goto :goto_3

    :cond_3
    move/from16 v8, p7

    :goto_3
    move-object v1, p0

    move-object v2, p1

    move-wide v3, p2

    invoke-static/range {v1 .. v8}, Lm0/R0;->c(Lo0/f;Lm0/Q0;JFLo0/g;Lm0/w0;I)V

    return-void
.end method

.method private static final e(Ll0/i;)J
    .locals 2

    invoke-virtual {p0}, Ll0/i;->r()F

    move-result v0

    invoke-virtual {p0}, Ll0/i;->j()F

    move-result p0

    invoke-static {v0, p0}, Ll0/n;->a(FF)J

    move-result-wide v0

    return-wide v0
.end method

.method private static final f(Ll0/k;)J
    .locals 2

    invoke-virtual {p0}, Ll0/k;->j()F

    move-result v0

    invoke-virtual {p0}, Ll0/k;->d()F

    move-result p0

    invoke-static {v0, p0}, Ll0/n;->a(FF)J

    move-result-wide v0

    return-wide v0
.end method

.method private static final g(Ll0/i;)J
    .locals 2

    invoke-virtual {p0}, Ll0/i;->k()F

    move-result v0

    invoke-virtual {p0}, Ll0/i;->n()F

    move-result p0

    invoke-static {v0, p0}, Ll0/h;->a(FF)J

    move-result-wide v0

    return-wide v0
.end method

.method private static final h(Ll0/k;)J
    .locals 2

    invoke-virtual {p0}, Ll0/k;->e()F

    move-result v0

    invoke-virtual {p0}, Ll0/k;->g()F

    move-result p0

    invoke-static {v0, p0}, Ll0/h;->a(FF)J

    move-result-wide v0

    return-wide v0
.end method
