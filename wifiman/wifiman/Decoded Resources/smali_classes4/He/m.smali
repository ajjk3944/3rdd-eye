.class public abstract LHe/m;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;Lof/a$c;Lmh/p;Lmh/q;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p7}, LHe/m;->c(Landroidx/compose/ui/e;Lof/a$c;Lmh/p;Lmh/q;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;Lof/a$c;Lmh/p;Lmh/q;LT/l;II)V
    .locals 21

    move-object/from16 v2, p1

    move/from16 v5, p5

    const-string v0, "accountVM"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x5c661ee3

    move-object/from16 v1, p4

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v1

    and-int/lit8 v3, p6, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v4, v5, 0x6

    move v6, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v5, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-interface {v1, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v5

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v6, v5

    :goto_1
    and-int/lit8 v7, p6, 0x2

    if-eqz v7, :cond_3

    or-int/lit8 v6, v6, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v7, v5, 0x30

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
    and-int/lit8 v7, p6, 0x4

    if-eqz v7, :cond_7

    or-int/lit16 v6, v6, 0x180

    :cond_6
    move-object/from16 v8, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v8, v5, 0x180

    if-nez v8, :cond_6

    move-object/from16 v8, p2

    invoke-interface {v1, v8}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x100

    goto :goto_4

    :cond_8
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v6, v9

    :goto_5
    and-int/lit8 v9, p6, 0x8

    if-eqz v9, :cond_a

    or-int/lit16 v6, v6, 0xc00

    :cond_9
    move-object/from16 v10, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v10, v5, 0xc00

    if-nez v10, :cond_9

    move-object/from16 v10, p3

    invoke-interface {v1, v10}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_b

    const/16 v11, 0x800

    goto :goto_6

    :cond_b
    const/16 v11, 0x400

    :goto_6
    or-int/2addr v6, v11

    :goto_7
    and-int/lit16 v11, v6, 0x493

    const/16 v12, 0x492

    if-ne v11, v12, :cond_d

    invoke-interface {v1}, LT/l;->v()Z

    move-result v11

    if-nez v11, :cond_c

    goto :goto_8

    :cond_c
    invoke-interface {v1}, LT/l;->C()V

    move-object v3, v4

    move-object v4, v8

    goto/16 :goto_c

    :cond_d
    :goto_8
    if-eqz v3, :cond_e

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_9

    :cond_e
    move-object v3, v4

    :goto_9
    if-eqz v7, :cond_f

    sget-object v4, LHe/a;->a:LHe/a;

    invoke-virtual {v4}, LHe/a;->a()Lmh/p;

    move-result-object v4

    goto :goto_a

    :cond_f
    move-object v4, v8

    :goto_a
    if-eqz v9, :cond_10

    sget-object v7, LHe/a;->a:LHe/a;

    invoke-virtual {v7}, LHe/a;->b()Lmh/q;

    move-result-object v7

    move-object/from16 v20, v7

    goto :goto_b

    :cond_10
    move-object/from16 v20, v10

    :goto_b
    invoke-static {}, LT/o;->H()Z

    move-result v7

    if-eqz v7, :cond_11

    const/4 v7, -0x1

    const-string v8, "com.ui.wifiman.ui.component.toolbar.WifimanToolbarBase (WifimanToolbarBase.kt:17)"

    invoke-static {v0, v6, v7, v8}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_11
    sget-object v0, LL9/w;->a:LL9/w;

    invoke-virtual {v0}, LL9/w;->d()F

    move-result v12

    sget-object v0, Lla/a;->a:Lla/a;

    sget v7, Lla/a;->b:I

    invoke-virtual {v0, v1, v7}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v0

    invoke-virtual {v0}, Lra/a;->a()Lra/b;

    move-result-object v0

    invoke-virtual {v0}, Lra/b;->a()Lra/b$a$a;

    move-result-object v0

    invoke-virtual {v0}, Lra/b$a$a;->c()F

    move-result v0

    invoke-static {v0}, Landroidx/compose/foundation/layout/o;->a(F)Lz/N;

    move-result-object v15

    new-instance v0, LHe/m$a;

    invoke-direct {v0, v2}, LHe/m$a;-><init>(Lof/a$c;)V

    const/16 v7, 0x36

    const v8, -0x6f117748

    const/4 v9, 0x1

    invoke-static {v8, v9, v0, v1, v7}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v8

    and-int/lit8 v0, v6, 0xe

    or-int/lit16 v0, v0, 0x180

    shr-int/lit8 v7, v6, 0x3

    and-int/lit8 v7, v7, 0x70

    or-int/2addr v0, v7

    and-int/lit16 v6, v6, 0x1c00

    or-int v18, v0, v6

    const/16 v19, 0x150

    const-wide/16 v10, 0x0

    const-wide/16 v13, 0x0

    const/16 v16, 0x0

    move-object v6, v3

    move-object v7, v4

    move-object/from16 v9, v20

    move-object/from16 v17, v1

    invoke-static/range {v6 .. v19}, LL9/q;->r(Landroidx/compose/ui/e;Lmh/p;Lmh/p;Lmh/q;JFJLz/N;FLT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-static {}, LT/o;->P()V

    :cond_12
    move-object/from16 v10, v20

    :goto_c
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v7

    if-eqz v7, :cond_13

    new-instance v8, LHe/l;

    move-object v0, v8

    move-object v1, v3

    move-object/from16 v2, p1

    move-object v3, v4

    move-object v4, v10

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, LHe/l;-><init>(Landroidx/compose/ui/e;Lof/a$c;Lmh/p;Lmh/q;II)V

    invoke-interface {v7, v8}, LT/X0;->a(Lmh/p;)V

    :cond_13
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;Lof/a$c;Lmh/p;Lmh/q;IILT/l;I)LYg/J;
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

    invoke-static/range {v0 .. v6}, LHe/m;->b(Landroidx/compose/ui/e;Lof/a$c;Lmh/p;Lmh/q;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
