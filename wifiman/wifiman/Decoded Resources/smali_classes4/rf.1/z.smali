.class public abstract Lrf/z;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;Ls9/d;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, Lrf/z;->f(Landroidx/compose/ui/e;Ls9/d;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;Ls9/d;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, Lrf/z;->d(Landroidx/compose/ui/e;Ls9/d;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/e;Ls9/d;LT/l;II)V
    .locals 31

    move-object/from16 v0, p1

    move/from16 v1, p3

    move/from16 v2, p4

    const-string v3, "text"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, -0x10ed1061

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LT/l;->r(I)LT/l;

    move-result-object v5

    and-int/lit8 v4, v2, 0x1

    if-eqz v4, :cond_0

    or-int/lit8 v6, v1, 0x6

    move v7, v6

    move-object/from16 v6, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v6, v1, 0x6

    if-nez v6, :cond_2

    move-object/from16 v6, p0

    invoke-interface {v5, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v7, 0x4

    goto :goto_0

    :cond_1
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v1

    goto :goto_1

    :cond_2
    move-object/from16 v6, p0

    move v7, v1

    :goto_1
    and-int/lit8 v8, v2, 0x2

    if-eqz v8, :cond_4

    or-int/lit8 v7, v7, 0x30

    :cond_3
    :goto_2
    move v8, v7

    goto :goto_4

    :cond_4
    and-int/lit8 v8, v1, 0x30

    if-nez v8, :cond_3

    invoke-interface {v5, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    const/16 v8, 0x20

    goto :goto_3

    :cond_5
    const/16 v8, 0x10

    :goto_3
    or-int/2addr v7, v8

    goto :goto_2

    :goto_4
    and-int/lit8 v7, v8, 0x13

    const/16 v9, 0x12

    if-ne v7, v9, :cond_7

    invoke-interface {v5}, LT/l;->v()Z

    move-result v7

    if-nez v7, :cond_6

    goto :goto_5

    :cond_6
    invoke-interface {v5}, LT/l;->C()V

    move-object v3, v5

    goto :goto_7

    :cond_7
    :goto_5
    if-eqz v4, :cond_8

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object/from16 v30, v4

    goto :goto_6

    :cond_8
    move-object/from16 v30, v6

    :goto_6
    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_9

    const/4 v4, -0x1

    const-string v6, "com.ui.wifiman.ui.teleport.component.TeleportWizardHeaderSubtitle (TeleportWizardHeader.kt:26)"

    invoke-static {v3, v8, v4, v6}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_9
    sget-object v3, Lla/a;->a:Lla/a;

    sget v4, Lla/a;->b:I

    invoke-virtual {v3, v5, v4}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v6

    invoke-virtual {v6}, Lpa/c;->b()Lpa/b;

    move-result-object v6

    invoke-virtual {v6}, Lpa/b;->a()LL0/U;

    move-result-object v25

    invoke-virtual {v3, v5, v4}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->f()Lma/a$f;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$f;->c()J

    move-result-wide v6

    shr-int/lit8 v3, v8, 0x3

    and-int/lit8 v3, v3, 0xe

    invoke-static {v0, v5, v3}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v4

    shl-int/lit8 v3, v8, 0x3

    and-int/lit8 v27, v3, 0x70

    const/16 v28, 0x0

    const v29, 0x1fff8

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object v3, v5

    move-object/from16 v5, v30

    move-object/from16 v26, v3

    invoke-static/range {v4 .. v29}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-static {}, LT/o;->P()V

    :cond_a
    move-object/from16 v6, v30

    :goto_7
    invoke-interface {v3}, LT/l;->z()LT/X0;

    move-result-object v3

    if-eqz v3, :cond_b

    new-instance v4, Lrf/x;

    invoke-direct {v4, v6, v0, v1, v2}, Lrf/x;-><init>(Landroidx/compose/ui/e;Ls9/d;II)V

    invoke-interface {v3, v4}, LT/X0;->a(Lmh/p;)V

    :cond_b
    return-void
.end method

.method private static final d(Landroidx/compose/ui/e;Ls9/d;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lrf/z;->c(Landroidx/compose/ui/e;Ls9/d;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/e;Ls9/d;LT/l;II)V
    .locals 31

    move-object/from16 v0, p1

    move/from16 v1, p3

    move/from16 v2, p4

    const-string v3, "text"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, 0x184dc661

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LT/l;->r(I)LT/l;

    move-result-object v5

    and-int/lit8 v4, v2, 0x1

    if-eqz v4, :cond_0

    or-int/lit8 v6, v1, 0x6

    move v7, v6

    move-object/from16 v6, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v6, v1, 0x6

    if-nez v6, :cond_2

    move-object/from16 v6, p0

    invoke-interface {v5, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v7, 0x4

    goto :goto_0

    :cond_1
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v1

    goto :goto_1

    :cond_2
    move-object/from16 v6, p0

    move v7, v1

    :goto_1
    and-int/lit8 v8, v2, 0x2

    if-eqz v8, :cond_4

    or-int/lit8 v7, v7, 0x30

    :cond_3
    :goto_2
    move v8, v7

    goto :goto_4

    :cond_4
    and-int/lit8 v8, v1, 0x30

    if-nez v8, :cond_3

    invoke-interface {v5, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    const/16 v8, 0x20

    goto :goto_3

    :cond_5
    const/16 v8, 0x10

    :goto_3
    or-int/2addr v7, v8

    goto :goto_2

    :goto_4
    and-int/lit8 v7, v8, 0x13

    const/16 v9, 0x12

    if-ne v7, v9, :cond_7

    invoke-interface {v5}, LT/l;->v()Z

    move-result v7

    if-nez v7, :cond_6

    goto :goto_5

    :cond_6
    invoke-interface {v5}, LT/l;->C()V

    move-object v3, v5

    goto :goto_7

    :cond_7
    :goto_5
    if-eqz v4, :cond_8

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object/from16 v30, v4

    goto :goto_6

    :cond_8
    move-object/from16 v30, v6

    :goto_6
    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_9

    const/4 v4, -0x1

    const-string v6, "com.ui.wifiman.ui.teleport.component.TeleportWizardHeaderTitle (TeleportWizardHeader.kt:13)"

    invoke-static {v3, v8, v4, v6}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_9
    sget-object v3, Lla/a;->a:Lla/a;

    sget v6, Lla/a;->b:I

    invoke-virtual {v3, v5, v6}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v4

    invoke-virtual {v4}, Lpa/c;->a()Lpa/b;

    move-result-object v4

    invoke-virtual {v4}, Lpa/b;->e()LL0/U;

    move-result-object v25

    shr-int/lit8 v4, v8, 0x3

    and-int/lit8 v4, v4, 0xe

    invoke-static {v0, v5, v4}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v4

    invoke-virtual {v3, v5, v6}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->f()Lma/a$f;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$f;->a()J

    move-result-wide v6

    shl-int/lit8 v3, v8, 0x3

    and-int/lit8 v27, v3, 0x70

    const/16 v28, 0x0

    const v29, 0x1fff8

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object v3, v5

    move-object/from16 v5, v30

    move-object/from16 v26, v3

    invoke-static/range {v4 .. v29}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-static {}, LT/o;->P()V

    :cond_a
    move-object/from16 v6, v30

    :goto_7
    invoke-interface {v3}, LT/l;->z()LT/X0;

    move-result-object v3

    if-eqz v3, :cond_b

    new-instance v4, Lrf/y;

    invoke-direct {v4, v6, v0, v1, v2}, Lrf/y;-><init>(Landroidx/compose/ui/e;Ls9/d;II)V

    invoke-interface {v3, v4}, LT/X0;->a(Lmh/p;)V

    :cond_b
    return-void
.end method

.method private static final f(Landroidx/compose/ui/e;Ls9/d;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lrf/z;->e(Landroidx/compose/ui/e;Ls9/d;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
