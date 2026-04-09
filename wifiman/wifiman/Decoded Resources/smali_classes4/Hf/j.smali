.class public abstract LHf/j;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Lf2/u;)LYg/J;
    .locals 0

    invoke-static {p0}, LHf/j;->d(Lf2/u;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LHf/c;IILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LHf/j;->e(LHf/c;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LHf/c;LT/l;II)V
    .locals 24

    move/from16 v0, p2

    move/from16 v1, p3

    const v2, 0x24316478

    move-object/from16 v3, p1

    invoke-interface {v3, v2}, LT/l;->r(I)LT/l;

    move-result-object v15

    and-int/lit8 v3, v0, 0x6

    const/4 v4, 0x2

    if-nez v3, :cond_2

    and-int/lit8 v3, v1, 0x1

    if-nez v3, :cond_0

    move-object/from16 v3, p0

    invoke-interface {v15, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

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

    invoke-interface {v15}, LT/l;->v()Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {v15}, LT/l;->C()V

    move-object v4, v15

    goto/16 :goto_7

    :cond_4
    :goto_2
    invoke-interface {v15}, LT/l;->q()V

    and-int/lit8 v4, v0, 0x1

    const/4 v14, 0x0

    if-eqz v4, :cond_7

    invoke-interface {v15}, LT/l;->H()Z

    move-result v4

    if-eqz v4, :cond_5

    goto :goto_4

    :cond_5
    invoke-interface {v15}, LT/l;->C()V

    and-int/lit8 v4, v1, 0x1

    if-eqz v4, :cond_6

    :goto_3
    and-int/lit8 v11, v11, -0xf

    :cond_6
    move-object/from16 v18, v3

    goto/16 :goto_5

    :cond_7
    :goto_4
    and-int/lit8 v4, v1, 0x1

    if-eqz v4, :cond_6

    const v3, -0x72e5f4af

    invoke-interface {v15, v3}, LT/l;->U(I)V

    sget-object v3, Lc2/a;->a:Lc2/a;

    sget v4, Lc2/a;->c:I

    invoke-virtual {v3, v15, v4}, Lc2/a;->a(LT/l;I)Landroidx/lifecycle/S;

    move-result-object v4

    if-eqz v4, :cond_a

    invoke-static {}, Lye/j;->c()LT/H0;

    move-result-object v3

    invoke-interface {v15, v3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Landroidx/lifecycle/P$c;

    const/4 v9, 0x0

    const/16 v10, 0x10

    const-class v3, LHf/c;

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v8, v15

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

    const-string v6, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Landroidx/appcompat/app/c;

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v6

    invoke-interface {v15, v6}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v6

    const v7, 0x318a4a49

    invoke-interface {v15, v7}, LT/l;->U(I)V

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

    if-nez v7, :cond_8

    sget-object v7, LT/l;->a:LT/l$a;

    invoke-virtual {v7}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v8, v7, :cond_9

    :cond_8
    new-instance v8, Lye/i;

    invoke-direct {v8, v3, v4, v5}, Lye/i;-><init>(Landroidx/lifecycle/N;Landroidx/lifecycle/o;Landroidx/appcompat/app/c;)V

    invoke-interface {v15, v8}, LT/l;->K(Ljava/lang/Object;)V

    :cond_9
    check-cast v8, Lmh/l;

    invoke-interface {v15}, LT/l;->J()V

    invoke-static {v6, v8, v15, v14}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-interface {v15}, LT/l;->J()V

    check-cast v3, LHf/c;

    goto/16 :goto_3

    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_5
    invoke-interface {v15}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_b

    const/4 v3, -0x1

    const-string v4, "com.ui.wifiman.ui.wizard.AppWizardUi (AppWizardUi.kt:19)"

    invoke-static {v2, v11, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_b
    new-array v2, v14, [Lf2/D;

    invoke-static {v2, v15, v14}, Lg2/l;->d([Lf2/D;LT/l;I)Lf2/w;

    move-result-object v2

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v4, 0x0

    const/4 v13, 0x1

    const/4 v12, 0x0

    invoke-static {v3, v4, v13, v12}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v5

    const v3, -0x71ebfd2d

    invoke-interface {v15, v3}, LT/l;->U(I)V

    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    sget-object v19, LT/l;->a:LT/l$a;

    invoke-virtual/range {v19 .. v19}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v3, v4, :cond_c

    new-instance v3, LHf/g;

    invoke-direct {v3}, LHf/g;-><init>()V

    invoke-interface {v15, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_c
    move-object/from16 v16, v3

    check-cast v16, Lmh/l;

    invoke-interface {v15}, LT/l;->J()V

    const/16 v17, 0x6

    const/16 v20, 0x3f8

    const-string v4, "empty"

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x1b0

    move-object v3, v2

    move-object/from16 v12, v21

    move-object/from16 v13, v16

    move-object v14, v15

    move-object/from16 v23, v15

    move/from16 v15, v22

    move/from16 v16, v17

    move/from16 v17, v20

    invoke-static/range {v3 .. v17}, Lg2/m;->b(Lf2/w;Ljava/lang/String;Landroidx/compose/ui/e;Lf0/c;Ljava/lang/String;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;LT/l;III)V

    invoke-virtual/range {v18 .. v18}, LHf/c;->n0()LLi/N;

    move-result-object v3

    move-object/from16 v4, v23

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v3, v7, v4, v5, v6}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v3

    invoke-interface {v3}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LHf/a;

    if-eqz v3, :cond_d

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v12

    goto :goto_6

    :cond_d
    move-object v12, v7

    :goto_6
    invoke-virtual/range {v18 .. v18}, LHf/c;->n0()LLi/N;

    move-result-object v3

    invoke-static {v3, v7, v4, v5, v6}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v3

    invoke-interface {v3}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v3

    const v6, -0x71eb9832

    invoke-interface {v4, v6}, LT/l;->U(I)V

    invoke-interface {v4, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v6

    invoke-interface {v4, v12}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v6, v8

    invoke-interface {v4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    if-nez v6, :cond_e

    invoke-virtual/range {v19 .. v19}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v8, v6, :cond_f

    :cond_e
    new-instance v8, LHf/j$a;

    invoke-direct {v8, v2, v12, v7}, LHf/j$a;-><init>(Lf2/w;Ljava/lang/String;Ldh/e;)V

    invoke-interface {v4, v8}, LT/l;->K(Ljava/lang/Object;)V

    :cond_f
    check-cast v8, Lmh/p;

    invoke-interface {v4}, LT/l;->J()V

    invoke-static {v3, v8, v4, v5}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-static {}, Lxe/t0;->d()LT/H0;

    move-result-object v3

    invoke-interface {v4, v3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lxe/r0;

    const v6, -0x71eb7e41

    invoke-interface {v4, v6}, LT/l;->U(I)V

    invoke-interface {v4, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v6

    invoke-interface {v4, v3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v6, v8

    invoke-interface {v4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    if-nez v6, :cond_10

    invoke-virtual/range {v19 .. v19}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v8, v6, :cond_11

    :cond_10
    new-instance v8, LHf/j$b;

    invoke-direct {v8, v2, v3, v7}, LHf/j$b;-><init>(Lf2/w;Lxe/r0;Ldh/e;)V

    invoke-interface {v4, v8}, LT/l;->K(Ljava/lang/Object;)V

    :cond_11
    check-cast v8, Lmh/p;

    invoke-interface {v4}, LT/l;->J()V

    invoke-static {v2, v8, v4, v5}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_12

    invoke-static {}, LT/o;->P()V

    :cond_12
    move-object/from16 v3, v18

    :goto_7
    invoke-interface {v4}, LT/l;->z()LT/X0;

    move-result-object v2

    if-eqz v2, :cond_13

    new-instance v4, LHf/h;

    invoke-direct {v4, v3, v0, v1}, LHf/h;-><init>(LHf/c;II)V

    invoke-interface {v2, v4}, LT/X0;->a(Lmh/p;)V

    :cond_13
    return-void
.end method

.method private static final d(Lf2/u;)LYg/J;
    .locals 15

    const-string v0, "$this$NavHost"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LHf/l;->a:LHf/l;

    invoke-virtual {v0}, LHf/l;->a()Lmh/q;

    move-result-object v5

    const/4 v6, 0x6

    const/4 v7, 0x0

    const-string v2, "empty"

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v7}, LAe/a;->c(Lf2/u;Ljava/lang/String;Ljava/util/List;LAe/n;Lmh/q;ILjava/lang/Object;)V

    invoke-virtual {v0}, LHf/l;->b()Lmh/q;

    move-result-object v12

    const/4 v13, 0x6

    const/4 v14, 0x0

    const-string v9, "LOCATION_PERMISSION"

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v8, p0

    invoke-static/range {v8 .. v14}, LAe/a;->c(Lf2/u;Ljava/lang/String;Ljava/util/List;LAe/n;Lmh/q;ILjava/lang/Object;)V

    invoke-virtual {v0}, LHf/l;->c()Lmh/q;

    move-result-object v5

    const-string v2, "BLUETOOTH_PERMISSION"

    invoke-static/range {v1 .. v7}, LAe/a;->c(Lf2/u;Ljava/lang/String;Ljava/util/List;LAe/n;Lmh/q;ILjava/lang/Object;)V

    invoke-virtual {v0}, LHf/l;->d()Lmh/q;

    move-result-object v12

    const-string v9, "APP_TO_APP_SPEEDTEST"

    invoke-static/range {v8 .. v14}, LAe/a;->c(Lf2/u;Ljava/lang/String;Ljava/util/List;LAe/n;Lmh/q;ILjava/lang/Object;)V

    invoke-virtual {v0}, LHf/l;->e()Lmh/q;

    move-result-object v5

    const-string v2, "NOTIFICATION_PERMISSION"

    invoke-static/range {v1 .. v7}, LAe/a;->c(Lf2/u;Ljava/lang/String;Ljava/util/List;LAe/n;Lmh/q;ILjava/lang/Object;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final e(LHf/c;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, LT/L0;->a(I)I

    move-result p1

    invoke-static {p0, p3, p1, p2}, LHf/j;->c(LHf/c;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
