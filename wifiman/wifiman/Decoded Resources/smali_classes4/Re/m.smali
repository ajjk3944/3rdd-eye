.class public abstract LRe/m;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(LRe/a;Lof/a$c;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, LRe/m;->d(LRe/a;Lof/a$c;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;LRe/a;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, LRe/m;->f(Landroidx/compose/ui/e;LRe/a;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LRe/a;Lof/a$c;LT/l;II)V
    .locals 32

    move/from16 v0, p3

    move/from16 v1, p4

    const v2, 0x2941b9e5

    move-object/from16 v3, p2

    invoke-interface {v3, v2}, LT/l;->r(I)LT/l;

    move-result-object v15

    and-int/lit8 v3, v0, 0x6

    if-nez v3, :cond_2

    and-int/lit8 v3, v1, 0x1

    if-nez v3, :cond_0

    move-object/from16 v3, p0

    invoke-interface {v15, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    move-object/from16 v3, p0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v0

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v0

    :goto_1
    and-int/lit8 v5, v0, 0x30

    if-nez v5, :cond_4

    and-int/lit8 v5, v1, 0x2

    move-object/from16 v11, p1

    if-nez v5, :cond_3

    invoke-interface {v15, v11}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_2

    :cond_3
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :goto_3
    move v12, v4

    goto :goto_4

    :cond_4
    move-object/from16 v11, p1

    goto :goto_3

    :goto_4
    and-int/lit8 v4, v12, 0x13

    const/16 v5, 0x12

    if-ne v4, v5, :cond_6

    invoke-interface {v15}, LT/l;->v()Z

    move-result v4

    if-nez v4, :cond_5

    goto :goto_5

    :cond_5
    invoke-interface {v15}, LT/l;->C()V

    move-object v2, v3

    move-object/from16 v31, v15

    goto/16 :goto_a

    :cond_6
    :goto_5
    invoke-interface {v15}, LT/l;->q()V

    and-int/lit8 v4, v0, 0x1

    if-eqz v4, :cond_a

    invoke-interface {v15}, LT/l;->H()Z

    move-result v4

    if-eqz v4, :cond_7

    goto :goto_6

    :cond_7
    invoke-interface {v15}, LT/l;->C()V

    and-int/lit8 v4, v1, 0x1

    if-eqz v4, :cond_8

    and-int/lit8 v12, v12, -0xf

    :cond_8
    and-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_9

    and-int/lit8 v12, v12, -0x71

    :cond_9
    move-object v2, v3

    move-object v14, v11

    goto/16 :goto_9

    :cond_a
    :goto_6
    and-int/lit8 v4, v1, 0x1

    const v14, 0x318a4a49

    const-string v10, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"

    const-string v9, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    const v8, -0x72e5f4af

    if-eqz v4, :cond_e

    invoke-interface {v15, v8}, LT/l;->U(I)V

    sget-object v3, Lc2/a;->a:Lc2/a;

    sget v4, Lc2/a;->c:I

    invoke-virtual {v3, v15, v4}, Lc2/a;->a(LT/l;I)Landroidx/lifecycle/S;

    move-result-object v4

    if-eqz v4, :cond_d

    invoke-static {}, Lye/j;->c()LT/H0;

    move-result-object v3

    invoke-interface {v15, v3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Landroidx/lifecycle/P$c;

    const/16 v16, 0x0

    const/16 v17, 0x10

    const-class v3, LRe/a;

    const/4 v5, 0x0

    const/4 v7, 0x0

    move v2, v8

    move-object v8, v15

    move-object v2, v9

    move/from16 v9, v16

    move-object v13, v10

    move/from16 v10, v17

    invoke-static/range {v3 .. v10}, Lc2/c;->b(Ljava/lang/Class;Landroidx/lifecycle/S;Ljava/lang/String;Landroidx/lifecycle/P$c;Lb2/a;LT/l;II)Landroidx/lifecycle/N;

    move-result-object v3

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v4

    invoke-interface {v15, v4}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/lifecycle/o;

    invoke-static {}, Ld/c;->a()LT/H0;

    move-result-object v5

    invoke-interface {v15, v5}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5, v13}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Landroidx/appcompat/app/c;

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v6

    invoke-interface {v15, v6}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v15, v14}, LT/l;->U(I)V

    invoke-interface {v15, v3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v7

    invoke-interface {v15, v5}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-interface {v15, v4}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_b

    sget-object v7, LT/l;->a:LT/l$a;

    invoke-virtual {v7}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v8, v7, :cond_c

    :cond_b
    new-instance v8, Lye/i;

    invoke-direct {v8, v3, v4, v5}, Lye/i;-><init>(Landroidx/lifecycle/N;Landroidx/lifecycle/o;Landroidx/appcompat/app/c;)V

    invoke-interface {v15, v8}, LT/l;->K(Ljava/lang/Object;)V

    :cond_c
    check-cast v8, Lmh/l;

    invoke-interface {v15}, LT/l;->J()V

    const/4 v4, 0x0

    invoke-static {v6, v8, v15, v4}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-interface {v15}, LT/l;->J()V

    check-cast v3, LRe/a;

    and-int/lit8 v12, v12, -0xf

    :goto_7
    move/from16 v16, v12

    move-object v12, v3

    goto :goto_8

    :cond_d
    move-object v2, v9

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    move-object v2, v9

    move-object v13, v10

    goto :goto_7

    :goto_8
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_12

    const v3, -0x72e5f4af

    invoke-interface {v15, v3}, LT/l;->U(I)V

    sget-object v3, Lc2/a;->a:Lc2/a;

    sget v4, Lc2/a;->c:I

    invoke-virtual {v3, v15, v4}, Lc2/a;->a(LT/l;I)Landroidx/lifecycle/S;

    move-result-object v4

    if-eqz v4, :cond_11

    invoke-static {}, Lye/j;->c()LT/H0;

    move-result-object v2

    invoke-interface {v15, v2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Landroidx/lifecycle/P$c;

    const/4 v9, 0x0

    const/16 v10, 0x10

    const-class v3, Lof/a$c;

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v8, v15

    invoke-static/range {v3 .. v10}, Lc2/c;->b(Ljava/lang/Class;Landroidx/lifecycle/S;Ljava/lang/String;Landroidx/lifecycle/P$c;Lb2/a;LT/l;II)Landroidx/lifecycle/N;

    move-result-object v2

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v3

    invoke-interface {v15, v3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/lifecycle/o;

    invoke-static {}, Ld/c;->a()LT/H0;

    move-result-object v4

    invoke-interface {v15, v4}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4, v13}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Landroidx/appcompat/app/c;

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v5

    invoke-interface {v15, v5}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v15, v14}, LT/l;->U(I)V

    invoke-interface {v15, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v6

    invoke-interface {v15, v4}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    invoke-interface {v15, v3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_f

    sget-object v6, LT/l;->a:LT/l$a;

    invoke-virtual {v6}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v7, v6, :cond_10

    :cond_f
    new-instance v7, Lye/i;

    invoke-direct {v7, v2, v3, v4}, Lye/i;-><init>(Landroidx/lifecycle/N;Landroidx/lifecycle/o;Landroidx/appcompat/app/c;)V

    invoke-interface {v15, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_10
    check-cast v7, Lmh/l;

    invoke-interface {v15}, LT/l;->J()V

    const/4 v3, 0x0

    invoke-static {v5, v7, v15, v3}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-interface {v15}, LT/l;->J()V

    check-cast v2, Lof/a$c;

    and-int/lit8 v3, v16, -0x71

    move-object v14, v2

    move-object v2, v12

    move v12, v3

    goto :goto_9

    :cond_11
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_12
    move-object v14, v11

    move-object v2, v12

    move/from16 v12, v16

    :goto_9
    invoke-interface {v15}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_13

    const/4 v3, -0x1

    const-string v4, "com.ui.wifiman.ui.settings.AppSettings (AppSettingsUi.kt:56)"

    const v5, 0x2941b9e5

    invoke-static {v5, v12, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_13
    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v3, v4, :cond_14

    sget-object v3, Ldh/j;->a:Ldh/j;

    invoke-static {v3, v15}, LT/O;->i(Ldh/i;LT/l;)LIi/N;

    move-result-object v3

    new-instance v4, LT/A;

    invoke-direct {v4, v3}, LT/A;-><init>(LIi/N;)V

    invoke-interface {v15, v4}, LT/l;->K(Ljava/lang/Object;)V

    move-object v3, v4

    :cond_14
    check-cast v3, LT/A;

    invoke-virtual {v3}, LT/A;->a()LIi/N;

    move-result-object v4

    invoke-static {}, Lxe/B;->K()LT/H0;

    move-result-object v3

    invoke-interface {v15, v3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Lxe/f$b;

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-static {v3, v6, v8, v7}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v6, Lla/a;->a:Lla/a;

    sget v7, Lla/a;->b:I

    invoke-virtual {v6, v15, v7}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v6

    invoke-virtual {v6}, Lma/a;->e()Lma/a$e;

    move-result-object v6

    invoke-virtual {v6}, Lma/a$e;->a()J

    move-result-wide v21

    new-instance v6, LRe/m$a;

    invoke-direct {v6, v5, v4, v2}, LRe/m$a;-><init>(Lxe/f$b;LIi/N;LRe/a;)V

    const v5, 0x105cc7ea

    const/16 v7, 0x36

    invoke-static {v5, v8, v6, v15, v7}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v5

    new-instance v6, LRe/m$b;

    invoke-direct {v6, v2, v14, v4}, LRe/m$b;-><init>(LRe/a;Lof/a$c;LIi/N;)V

    const v4, -0x6ac7e5dd

    invoke-static {v4, v8, v6, v15, v7}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v25

    const/high16 v28, 0xc00000

    const v29, 0x17ffa

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    move-object/from16 v30, v14

    move/from16 v14, v16

    const-wide/16 v16, 0x0

    move-object/from16 v31, v15

    move-wide/from16 v15, v16

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v23, 0x0

    const/16 v27, 0x186

    move-object/from16 v26, v31

    invoke-static/range {v3 .. v29}, LN/C0;->a(Landroidx/compose/ui/e;LN/E0;Lmh/p;Lmh/p;Lmh/q;Lmh/p;IZLmh/q;ZLm0/i1;FJJJJJLmh/q;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_15

    invoke-static {}, LT/o;->P()V

    :cond_15
    move-object/from16 v11, v30

    :goto_a
    invoke-interface/range {v31 .. v31}, LT/l;->z()LT/X0;

    move-result-object v3

    if-eqz v3, :cond_16

    new-instance v4, LRe/i;

    invoke-direct {v4, v2, v11, v0, v1}, LRe/i;-><init>(LRe/a;Lof/a$c;II)V

    invoke-interface {v3, v4}, LT/X0;->a(Lmh/p;)V

    :cond_16
    return-void
.end method

.method private static final d(LRe/a;Lof/a$c;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, LRe/m;->c(LRe/a;Lof/a$c;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final e(Landroidx/compose/ui/e;LRe/a;LT/l;II)V
    .locals 11

    const v0, 0x69f6040

    invoke-interface {p2, v0}, LT/l;->r(I)LT/l;

    move-result-object p2

    and-int/lit8 v1, p4, 0x1

    const/4 v2, 0x4

    if-eqz v1, :cond_0

    or-int/lit8 v3, p3, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v3, p3, 0x6

    if-nez v3, :cond_2

    invoke-interface {p2, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    move v3, v2

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, p3

    goto :goto_1

    :cond_2
    move v3, p3

    :goto_1
    and-int/lit8 v4, p4, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v3, v3, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_5

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_5
    :goto_3
    and-int/lit8 v4, v3, 0x13

    const/16 v5, 0x12

    if-ne v4, v5, :cond_7

    invoke-interface {p2}, LT/l;->v()Z

    move-result v4

    if-nez v4, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {p2}, LT/l;->C()V

    goto/16 :goto_5

    :cond_7
    :goto_4
    if-eqz v1, :cond_8

    sget-object p0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    :cond_8
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_9

    const/4 v1, -0x1

    const-string v4, "com.ui.wifiman.ui.settings.FooterRow (AppSettingsUi.kt:244)"

    invoke-static {v0, v3, v1, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_9
    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_a

    sget-object v0, Ldh/j;->a:Ldh/j;

    invoke-static {v0, p2}, LT/O;->i(Ldh/i;LT/l;)LIi/N;

    move-result-object v0

    new-instance v1, LT/A;

    invoke-direct {v1, v0}, LT/A;-><init>(LIi/N;)V

    invoke-interface {p2, v1}, LT/l;->K(Ljava/lang/Object;)V

    move-object v0, v1

    :cond_a
    check-cast v0, LT/A;

    invoke-virtual {v0}, LT/A;->a()LIi/N;

    move-result-object v0

    sget-object v1, Lz/c;->a:Lz/c;

    const/16 v4, 0x8

    int-to-float v4, v4

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    invoke-virtual {v1, v4}, Lz/c;->n(F)Lz/c$f;

    move-result-object v4

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    invoke-virtual {v1, v2}, Lz/c;->n(F)Lz/c$f;

    move-result-object v5

    new-instance v1, LRe/m$c;

    invoke-direct {v1, p1, v0}, LRe/m$c;-><init>(LRe/a;LIi/N;)V

    const/16 v0, 0x36

    const v2, 0x177331e5

    const/4 v6, 0x1

    invoke-static {v2, v6, v1, p2, v0}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    and-int/lit8 v0, v3, 0xe

    const v1, 0x1801b0

    or-int v9, v0, v1

    const/16 v10, 0x38

    const/4 v0, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v1, p0

    move-object v2, v4

    move-object v3, v5

    move v4, v0

    move v5, v6

    move-object v6, v8

    move-object v8, p2

    invoke-static/range {v1 .. v10}, Lz/t;->a(Landroidx/compose/ui/e;Lz/c$e;Lz/c$m;IILz/z;Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {}, LT/o;->P()V

    :cond_b
    :goto_5
    invoke-interface {p2}, LT/l;->z()LT/X0;

    move-result-object p2

    if-eqz p2, :cond_c

    new-instance v0, LRe/j;

    invoke-direct {v0, p0, p1, p3, p4}, LRe/j;-><init>(Landroidx/compose/ui/e;LRe/a;II)V

    invoke-interface {p2, v0}, LT/X0;->a(Lmh/p;)V

    :cond_c
    return-void
.end method

.method private static final f(Landroidx/compose/ui/e;LRe/a;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, LRe/m;->e(Landroidx/compose/ui/e;LRe/a;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final synthetic g(Landroidx/compose/ui/e;LRe/a;LT/l;II)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LRe/m;->e(Landroidx/compose/ui/e;LRe/a;LT/l;II)V

    return-void
.end method

.method public static final synthetic h(LT/l;I)Lz/c$m;
    .locals 0

    invoke-static {p0, p1}, LRe/m;->i(LT/l;I)Lz/c$m;

    move-result-object p0

    return-object p0
.end method

.method private static final i(LT/l;I)Lz/c$m;
    .locals 3

    const v0, 0x3208bba4

    invoke-interface {p0, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.settings.verticalArrangementWithLatestOnBottom (AppSettingsUi.kt:289)"

    invoke-static {v0, p1, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    new-instance p1, LRe/m$d;

    invoke-direct {p1}, LRe/m$d;-><init>()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    invoke-interface {p0}, LT/l;->J()V

    return-object p1
.end method
