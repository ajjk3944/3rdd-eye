.class public abstract Lqf/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Lqf/a;IILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lqf/d;->c(Lqf/a;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lqf/a;LT/l;II)V
    .locals 31

    move/from16 v0, p2

    move/from16 v1, p3

    const v2, 0x72b4903b

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

    move-object v2, v15

    goto/16 :goto_6

    :cond_4
    :goto_2
    invoke-interface {v15}, LT/l;->q()V

    and-int/lit8 v4, v0, 0x1

    const/4 v12, 0x0

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
    move-object/from16 v30, v3

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

    const-class v3, Lqf/a;

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

    invoke-static {v6, v8, v15, v12}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-interface {v15}, LT/l;->J()V

    check-cast v3, Lqf/a;

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

    const-string v4, "com.ui.wifiman.ui.sso.settings.SSOAccountSettingsUi (SSOAccountSettingsUi.kt:24)"

    invoke-static {v2, v11, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_b
    invoke-virtual/range {v30 .. v30}, Lqf/a;->n0()LLi/N;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v2, v3, v15, v12, v4}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v2

    invoke-interface {v2}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lqf/a$a;

    invoke-static {}, Lxe/B;->K()LT/H0;

    move-result-object v3

    invoke-interface {v15, v3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lxe/f$b;

    new-instance v5, Lqf/d$a;

    invoke-direct {v5, v3}, Lqf/d$a;-><init>(Lxe/f$b;)V

    const v3, 0x1630acd6

    const/16 v6, 0x36

    invoke-static {v3, v4, v5, v15, v6}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v5

    new-instance v3, Lqf/d$b;

    invoke-direct {v3, v2}, Lqf/d$b;-><init>(Lqf/a$a;)V

    const v2, 0x19ef3bd

    invoke-static {v2, v4, v3, v15, v6}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v25

    const/high16 v28, 0xc00000

    const v29, 0x1fffb

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v16, 0x0

    move-object v2, v15

    move-wide/from16 v15, v16

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const/16 v27, 0x180

    move-object/from16 v26, v2

    invoke-static/range {v3 .. v29}, LN/C0;->a(Landroidx/compose/ui/e;LN/E0;Lmh/p;Lmh/p;Lmh/q;Lmh/p;IZLmh/q;ZLm0/i1;FJJJJJLmh/q;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-static {}, LT/o;->P()V

    :cond_c
    move-object/from16 v3, v30

    :goto_6
    invoke-interface {v2}, LT/l;->z()LT/X0;

    move-result-object v2

    if-eqz v2, :cond_d

    new-instance v4, Lqf/b;

    invoke-direct {v4, v3, v0, v1}, Lqf/b;-><init>(Lqf/a;II)V

    invoke-interface {v2, v4}, LT/X0;->a(Lmh/p;)V

    :cond_d
    return-void
.end method

.method private static final c(Lqf/a;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, LT/L0;->a(I)I

    move-result p1

    invoke-static {p0, p3, p1, p2}, Lqf/d;->b(Lqf/a;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
