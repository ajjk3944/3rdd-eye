.class public abstract Luf/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Luf/a;IILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Luf/e;->e(Luf/a;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Luf/a;)LYg/J;
    .locals 0

    invoke-static {p0}, Luf/e;->d(Luf/a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Luf/a;LT/l;II)V
    .locals 19

    move/from16 v0, p2

    move/from16 v1, p3

    const v2, -0x5e120c8a

    move-object/from16 v3, p1

    invoke-interface {v3, v2}, LT/l;->r(I)LT/l;

    move-result-object v13

    and-int/lit8 v3, v0, 0x6

    const/4 v4, 0x2

    const/4 v14, 0x4

    if-nez v3, :cond_2

    and-int/lit8 v3, v1, 0x1

    if-nez v3, :cond_0

    move-object/from16 v3, p0

    invoke-interface {v13, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    move v5, v14

    goto :goto_0

    :cond_0
    move-object/from16 v3, p0

    :cond_1
    move v5, v4

    :goto_0
    or-int/2addr v5, v0

    move v11, v5

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v11, v0

    :goto_1
    and-int/lit8 v5, v11, 0x3

    if-ne v5, v4, :cond_4

    invoke-interface {v13}, LT/l;->v()Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {v13}, LT/l;->C()V

    move-object v2, v3

    goto/16 :goto_7

    :cond_4
    :goto_2
    invoke-interface {v13}, LT/l;->q()V

    and-int/lit8 v4, v0, 0x1

    const/4 v15, 0x0

    if-eqz v4, :cond_7

    invoke-interface {v13}, LT/l;->H()Z

    move-result v4

    if-eqz v4, :cond_5

    goto :goto_4

    :cond_5
    invoke-interface {v13}, LT/l;->C()V

    and-int/lit8 v4, v1, 0x1

    if-eqz v4, :cond_6

    :goto_3
    and-int/lit8 v11, v11, -0xf

    :cond_6
    move-object v12, v3

    goto/16 :goto_5

    :cond_7
    :goto_4
    and-int/lit8 v4, v1, 0x1

    if-eqz v4, :cond_6

    const v3, -0x72e5f4af

    invoke-interface {v13, v3}, LT/l;->U(I)V

    sget-object v3, Lc2/a;->a:Lc2/a;

    sget v4, Lc2/a;->c:I

    invoke-virtual {v3, v13, v4}, Lc2/a;->a(LT/l;I)Landroidx/lifecycle/S;

    move-result-object v4

    if-eqz v4, :cond_a

    invoke-static {}, Lye/j;->c()LT/H0;

    move-result-object v3

    invoke-interface {v13, v3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Landroidx/lifecycle/P$c;

    const/4 v9, 0x0

    const/16 v10, 0x10

    const-class v3, Luf/a;

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v8, v13

    invoke-static/range {v3 .. v10}, Lc2/c;->b(Ljava/lang/Class;Landroidx/lifecycle/S;Ljava/lang/String;Landroidx/lifecycle/P$c;Lb2/a;LT/l;II)Landroidx/lifecycle/N;

    move-result-object v3

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v4

    invoke-interface {v13, v4}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/lifecycle/o;

    invoke-static {}, Ld/c;->a()LT/H0;

    move-result-object v5

    invoke-interface {v13, v5}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v5

    const-string v6, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Landroidx/appcompat/app/c;

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v6

    invoke-interface {v13, v6}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v6

    const v7, 0x318a4a49

    invoke-interface {v13, v7}, LT/l;->U(I)V

    invoke-interface {v13, v3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v7

    invoke-interface {v13, v5}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-interface {v13, v4}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-interface {v13}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_8

    sget-object v7, LT/l;->a:LT/l$a;

    invoke-virtual {v7}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v8, v7, :cond_9

    :cond_8
    new-instance v8, Lye/i;

    invoke-direct {v8, v3, v4, v5}, Lye/i;-><init>(Landroidx/lifecycle/N;Landroidx/lifecycle/o;Landroidx/appcompat/app/c;)V

    invoke-interface {v13, v8}, LT/l;->K(Ljava/lang/Object;)V

    :cond_9
    check-cast v8, Lmh/l;

    invoke-interface {v13}, LT/l;->J()V

    invoke-static {v6, v8, v13, v15}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-interface {v13}, LT/l;->J()V

    check-cast v3, Luf/a;

    goto/16 :goto_3

    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_5
    invoke-interface {v13}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_b

    const/4 v3, -0x1

    const-string v4, "com.ui.wifiman.ui.ubiquiti.console.DirectConsoleConnectionPopupUi (DirectConsoleConnectionPopupUi.kt:64)"

    invoke-static {v2, v11, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_b
    sget-object v2, Lla/a;->a:Lla/a;

    sget v3, Lla/a;->b:I

    invoke-virtual {v2, v13, v3}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->e()Lma/a$e;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$e;->b()J

    move-result-wide v4

    new-instance v2, Luf/e$a;

    invoke-direct {v2, v12}, Luf/e$a;-><init>(Luf/a;)V

    const v3, -0xd7e5090

    const/4 v10, 0x1

    const/16 v6, 0x36

    invoke-static {v3, v10, v2, v13, v6}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v2

    new-instance v3, Luf/e$b;

    invoke-direct {v3, v12}, Luf/e$b;-><init>(Luf/a;)V

    const v7, -0x1b706d0d

    invoke-static {v7, v10, v3, v13, v6}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v9

    const v16, 0x30180

    const/16 v17, 0x19

    const/4 v3, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v6, v2

    move v2, v10

    move-object v10, v13

    move/from16 v18, v11

    move/from16 v11, v16

    move-object v2, v12

    move/from16 v12, v17

    invoke-static/range {v3 .. v12}, LFe/g;->b(Landroidx/compose/ui/e;JLmh/q;ZFLmh/q;LT/l;II)V

    const v3, -0x49181167

    invoke-interface {v13, v3}, LT/l;->U(I)V

    and-int/lit8 v3, v18, 0xe

    xor-int/lit8 v3, v3, 0x6

    if-le v3, v14, :cond_c

    invoke-interface {v13, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_d

    :cond_c
    and-int/lit8 v3, v18, 0x6

    if-ne v3, v14, :cond_e

    :cond_d
    const/4 v10, 0x1

    goto :goto_6

    :cond_e
    move v10, v15

    :goto_6
    invoke-interface {v13}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v10, :cond_f

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v3, v4, :cond_10

    :cond_f
    new-instance v3, Luf/c;

    invoke-direct {v3, v2}, Luf/c;-><init>(Luf/a;)V

    invoke-interface {v13, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_10
    check-cast v3, Lmh/a;

    invoke-interface {v13}, LT/l;->J()V

    const/4 v4, 0x1

    invoke-static {v15, v3, v13, v15, v4}, Ld/a;->a(ZLmh/a;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_11

    invoke-static {}, LT/o;->P()V

    :cond_11
    :goto_7
    invoke-interface {v13}, LT/l;->z()LT/X0;

    move-result-object v3

    if-eqz v3, :cond_12

    new-instance v4, Luf/d;

    invoke-direct {v4, v2, v0, v1}, Luf/d;-><init>(Luf/a;II)V

    invoke-interface {v3, v4}, LT/X0;->a(Lmh/p;)V

    :cond_12
    return-void
.end method

.method private static final d(Luf/a;)LYg/J;
    .locals 0

    invoke-virtual {p0}, Luf/a;->p0()V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final e(Luf/a;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, LT/L0;->a(I)I

    move-result p1

    invoke-static {p0, p3, p1, p2}, Luf/e;->c(Luf/a;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
