.class public abstract LX9/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(LX9/p;Lu9/d;ZLCi/e;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p7}, LX9/o;->d(LX9/p;Lu9/d;ZLCi/e;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(LX9/p;Lu9/d;ZLCi/e;LT/l;II)V
    .locals 40

    move-object/from16 v9, p0

    move/from16 v10, p5

    const-string/jumbo v0, "vm"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x48219a1a

    move-object/from16 v1, p4

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v15

    and-int/lit8 v1, p6, 0x1

    const/4 v2, 0x2

    if-eqz v1, :cond_0

    or-int/lit8 v1, v10, 0x6

    goto :goto_2

    :cond_0
    and-int/lit8 v1, v10, 0x6

    if-nez v1, :cond_3

    and-int/lit8 v1, v10, 0x8

    if-nez v1, :cond_1

    invoke-interface {v15, v9}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0

    :cond_1
    invoke-interface {v15, v9}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_2

    const/4 v1, 0x4

    goto :goto_1

    :cond_2
    move v1, v2

    :goto_1
    or-int/2addr v1, v10

    goto :goto_2

    :cond_3
    move v1, v10

    :goto_2
    and-int/lit8 v3, p6, 0x2

    if-eqz v3, :cond_5

    or-int/lit8 v1, v1, 0x30

    :cond_4
    move-object/from16 v4, p1

    goto :goto_4

    :cond_5
    and-int/lit8 v4, v10, 0x30

    if-nez v4, :cond_4

    move-object/from16 v4, p1

    invoke-interface {v15, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    const/16 v5, 0x20

    goto :goto_3

    :cond_6
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v1, v5

    :goto_4
    and-int/lit8 v5, p6, 0x4

    if-eqz v5, :cond_8

    or-int/lit16 v1, v1, 0x180

    :cond_7
    move/from16 v6, p2

    goto :goto_6

    :cond_8
    and-int/lit16 v6, v10, 0x180

    if-nez v6, :cond_7

    move/from16 v6, p2

    invoke-interface {v15, v6}, LT/l;->c(Z)Z

    move-result v7

    if-eqz v7, :cond_9

    const/16 v7, 0x100

    goto :goto_5

    :cond_9
    const/16 v7, 0x80

    :goto_5
    or-int/2addr v1, v7

    :goto_6
    and-int/lit8 v7, p6, 0x8

    if-eqz v7, :cond_b

    or-int/lit16 v1, v1, 0xc00

    :cond_a
    move-object/from16 v8, p3

    goto :goto_8

    :cond_b
    and-int/lit16 v8, v10, 0xc00

    if-nez v8, :cond_a

    move-object/from16 v8, p3

    invoke-interface {v15, v8}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_c

    const/16 v11, 0x800

    goto :goto_7

    :cond_c
    const/16 v11, 0x400

    :goto_7
    or-int/2addr v1, v11

    :goto_8
    and-int/lit16 v11, v1, 0x493

    const/16 v12, 0x492

    if-ne v11, v12, :cond_e

    invoke-interface {v15}, LT/l;->v()Z

    move-result v11

    if-nez v11, :cond_d

    goto :goto_9

    :cond_d
    invoke-interface {v15}, LT/l;->C()V

    move-object v2, v4

    move v3, v6

    move-object v4, v8

    move-object v1, v15

    goto/16 :goto_d

    :cond_e
    :goto_9
    if-eqz v3, :cond_f

    sget-object v3, Lu9/d;->MFA:Lu9/d;

    move-object/from16 v38, v3

    goto :goto_a

    :cond_f
    move-object/from16 v38, v4

    :goto_a
    if-eqz v5, :cond_10

    const/4 v3, 0x0

    move v14, v3

    goto :goto_b

    :cond_10
    move v14, v6

    :goto_b
    if-eqz v7, :cond_11

    invoke-static {}, LCi/a;->d()LCi/h;

    move-result-object v3

    move-object/from16 v39, v3

    goto :goto_c

    :cond_11
    move-object/from16 v39, v8

    :goto_c
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_12

    const/4 v3, -0x1

    const-string/jumbo v4, "com.ui.core.ui.sso.mfa.auth.code.UiMFAAuthCodeLayout (UiMFAAuthCodeLayout.kt:69)"

    invoke-static {v0, v1, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_12
    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v0, v3, :cond_13

    sget-object v0, Ldh/j;->a:Ldh/j;

    invoke-static {v0, v15}, LT/O;->i(Ldh/i;LT/l;)LIi/N;

    move-result-object v0

    new-instance v3, LT/A;

    invoke-direct {v3, v0}, LT/A;-><init>(LIi/N;)V

    invoke-interface {v15, v3}, LT/l;->K(Ljava/lang/Object;)V

    move-object v0, v3

    :cond_13
    check-cast v0, LT/A;

    invoke-virtual {v0}, LT/A;->a()LIi/N;

    move-result-object v4

    invoke-static {}, Landroidx/compose/ui/platform/k0;->q()LT/H0;

    move-result-object v0

    invoke-interface {v15, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroidx/compose/ui/platform/n1;

    const v0, -0x108ccde8

    invoke-interface {v15, v0}, LT/l;->U(I)V

    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v0, v5, :cond_14

    new-instance v0, Landroidx/compose/ui/focus/o;

    invoke-direct {v0}, Landroidx/compose/ui/focus/o;-><init>()V

    invoke-interface {v15, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_14
    move-object v7, v0

    check-cast v7, Landroidx/compose/ui/focus/o;

    invoke-interface {v15}, LT/l;->J()V

    invoke-static {}, Landroidx/compose/ui/platform/k0;->h()LT/H0;

    move-result-object v0

    invoke-interface {v15, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lk0/e;

    const v0, -0x108cb5eb

    invoke-interface {v15, v0}, LT/l;->U(I)V

    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_15

    new-instance v0, LR0/Q;

    invoke-interface/range {p0 .. p0}, LX9/p;->r()LLi/N;

    move-result-object v1

    invoke-interface {v1}, LLi/N;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v17, v1

    check-cast v17, Ljava/lang/String;

    const/16 v21, 0x6

    const/16 v22, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    move-object/from16 v16, v0

    invoke-direct/range {v16 .. v22}, LR0/Q;-><init>(Ljava/lang/String;JLL0/S;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x0

    invoke-static {v0, v1, v2, v1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v0

    invoke-interface {v15, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_15
    move-object v6, v0

    check-cast v6, LT/q0;

    invoke-interface {v15}, LT/l;->J()V

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v0, v7}, Landroidx/compose/ui/focus/p;->a(Landroidx/compose/ui/e;Landroidx/compose/ui/focus/o;)Landroidx/compose/ui/e;

    move-result-object v11

    new-instance v0, LX9/o$a;

    invoke-direct {v0, v14, v9, v4}, LX9/o$a;-><init>(ZLX9/p;LIi/N;)V

    const v1, 0x665ba0eb

    const/4 v12, 0x1

    const/16 v8, 0x36

    invoke-static {v1, v12, v0, v15, v8}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v13

    sget-object v0, Lla/a;->a:Lla/a;

    sget v1, Lla/a;->b:I

    invoke-virtual {v0, v15, v1}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a;->e()Lma/a$e;

    move-result-object v0

    invoke-virtual {v0}, Lma/a$e;->a()J

    move-result-wide v29

    new-instance v2, LX9/o$b;

    move-object v0, v2

    move-object/from16 v1, p0

    move-object v9, v2

    move-object v2, v5

    move-object/from16 v5, v38

    move v10, v8

    move-object/from16 v8, v39

    invoke-direct/range {v0 .. v8}, LX9/o$b;-><init>(LX9/p;Lk0/e;Landroidx/compose/ui/platform/n1;LIi/N;Lu9/d;LT/q0;Landroidx/compose/ui/focus/o;LCi/e;)V

    const v0, 0x670ef424

    invoke-static {v0, v12, v9, v15, v10}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v33

    const/high16 v36, 0xc00000

    const v37, 0x17ffa

    const/4 v12, 0x0

    const/4 v0, 0x0

    move v3, v14

    move-object v14, v0

    move-object v1, v15

    move-object v15, v0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const-wide/16 v27, 0x0

    const-wide/16 v31, 0x0

    const/16 v35, 0x180

    move-object/from16 v34, v1

    invoke-static/range {v11 .. v37}, LN/C0;->a(Landroidx/compose/ui/e;LN/E0;Lmh/p;Lmh/p;Lmh/q;Lmh/p;IZLmh/q;ZLm0/i1;FJJJJJLmh/q;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-static {}, LT/o;->P()V

    :cond_16
    move-object/from16 v2, v38

    move-object/from16 v4, v39

    :goto_d
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v7

    if-eqz v7, :cond_17

    new-instance v8, LX9/m;

    move-object v0, v8

    move-object/from16 v1, p0

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, LX9/m;-><init>(LX9/p;Lu9/d;ZLCi/e;II)V

    invoke-interface {v7, v8}, LT/X0;->a(Lmh/p;)V

    :cond_17
    return-void
.end method

.method private static final c(Lk0/e;Landroidx/compose/ui/platform/n1;)V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1}, Lk0/e;->c(Lk0/e;ZILjava/lang/Object;)V

    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroidx/compose/ui/platform/n1;->c()V

    :cond_0
    return-void
.end method

.method private static final d(LX9/p;Lu9/d;ZLCi/e;IILT/l;I)LYg/J;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, LT/L0;->a(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p6

    move v6, p5

    invoke-static/range {v0 .. v6}, LX9/o;->b(LX9/p;Lu9/d;ZLCi/e;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final synthetic e(Lk0/e;Landroidx/compose/ui/platform/n1;)V
    .locals 0

    invoke-static {p0, p1}, LX9/o;->c(Lk0/e;Landroidx/compose/ui/platform/n1;)V

    return-void
.end method
