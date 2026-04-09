.class public abstract Lcom/ui/wifiman/ui/signal/M;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/ui/signal/M$b;
    }
.end annotation


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/signal/N;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/ui/wifiman/ui/signal/M;->e(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/signal/N;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/ui/wifiman/ui/signal/N;Ljava/lang/String;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wifiman/ui/signal/M;->d(Lcom/ui/wifiman/ui/signal/N;Ljava/lang/String;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/signal/N;LT/l;II)V
    .locals 18

    move/from16 v0, p3

    move/from16 v1, p4

    const v2, 0x2856cefc

    move-object/from16 v3, p2

    invoke-interface {v3, v2}, LT/l;->r(I)LT/l;

    move-result-object v14

    and-int/lit8 v3, v1, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v4, v0, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v0, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-interface {v14, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v0

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v5, v0

    :goto_1
    and-int/lit8 v6, v0, 0x30

    const/16 v11, 0x20

    if-nez v6, :cond_5

    and-int/lit8 v6, v1, 0x2

    if-nez v6, :cond_3

    move-object/from16 v6, p1

    invoke-interface {v14, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    move v7, v11

    goto :goto_2

    :cond_3
    move-object/from16 v6, p1

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v5, v7

    :goto_3
    move v12, v5

    goto :goto_4

    :cond_5
    move-object/from16 v6, p1

    goto :goto_3

    :goto_4
    and-int/lit8 v5, v12, 0x13

    const/16 v7, 0x12

    if-ne v5, v7, :cond_7

    invoke-interface {v14}, LT/l;->v()Z

    move-result v5

    if-nez v5, :cond_6

    goto :goto_5

    :cond_6
    invoke-interface {v14}, LT/l;->C()V

    move-object v15, v4

    move-object v2, v6

    goto/16 :goto_9

    :cond_7
    :goto_5
    invoke-interface {v14}, LT/l;->q()V

    and-int/lit8 v5, v0, 0x1

    const/4 v13, 0x0

    if-eqz v5, :cond_b

    invoke-interface {v14}, LT/l;->H()Z

    move-result v5

    if-eqz v5, :cond_8

    goto :goto_6

    :cond_8
    invoke-interface {v14}, LT/l;->C()V

    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_9

    and-int/lit8 v12, v12, -0x71

    :cond_9
    move-object v15, v4

    :cond_a
    move v3, v12

    move-object v12, v6

    goto/16 :goto_8

    :cond_b
    :goto_6
    if-eqz v3, :cond_c

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v15, v3

    goto :goto_7

    :cond_c
    move-object v15, v4

    :goto_7
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_a

    const v3, -0x72e5f4af

    invoke-interface {v14, v3}, LT/l;->U(I)V

    sget-object v3, Lc2/a;->a:Lc2/a;

    sget v4, Lc2/a;->c:I

    invoke-virtual {v3, v14, v4}, Lc2/a;->a(LT/l;I)Landroidx/lifecycle/S;

    move-result-object v4

    if-eqz v4, :cond_f

    invoke-static {}, Lye/j;->c()LT/H0;

    move-result-object v3

    invoke-interface {v14, v3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Landroidx/lifecycle/P$c;

    const/4 v9, 0x0

    const/16 v10, 0x10

    const-class v3, Lcom/ui/wifiman/ui/signal/N;

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v8, v14

    invoke-static/range {v3 .. v10}, Lc2/c;->b(Ljava/lang/Class;Landroidx/lifecycle/S;Ljava/lang/String;Landroidx/lifecycle/P$c;Lb2/a;LT/l;II)Landroidx/lifecycle/N;

    move-result-object v3

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v4

    invoke-interface {v14, v4}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/lifecycle/o;

    invoke-static {}, Ld/c;->a()LT/H0;

    move-result-object v5

    invoke-interface {v14, v5}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v5

    const-string v6, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Landroidx/appcompat/app/c;

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v6

    invoke-interface {v14, v6}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v6

    const v7, 0x318a4a49

    invoke-interface {v14, v7}, LT/l;->U(I)V

    invoke-interface {v14, v3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v7

    invoke-interface {v14, v5}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-interface {v14, v4}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-interface {v14}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_d

    sget-object v7, LT/l;->a:LT/l$a;

    invoke-virtual {v7}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v8, v7, :cond_e

    :cond_d
    new-instance v8, Lye/i;

    invoke-direct {v8, v3, v4, v5}, Lye/i;-><init>(Landroidx/lifecycle/N;Landroidx/lifecycle/o;Landroidx/appcompat/app/c;)V

    invoke-interface {v14, v8}, LT/l;->K(Ljava/lang/Object;)V

    :cond_e
    check-cast v8, Lmh/l;

    invoke-interface {v14}, LT/l;->J()V

    invoke-static {v6, v8, v14, v13}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-interface {v14}, LT/l;->J()V

    check-cast v3, Lcom/ui/wifiman/ui/signal/N;

    and-int/lit8 v12, v12, -0x71

    move/from16 v17, v12

    move-object v12, v3

    move/from16 v3, v17

    goto :goto_8

    :cond_f
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_8
    invoke-interface {v14}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_10

    const/4 v4, -0x1

    const-string v5, "com.ui.wifiman.ui.signal.SignalMapperTabSignalUi (SignalTabSignalStrengthUi.kt:46)"

    invoke-static {v2, v3, v4, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_10
    const/4 v2, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v15, v2, v4, v5}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-virtual {v12}, Lcom/ui/wifiman/ui/signal/N;->o0()LLi/N;

    move-result-object v6

    invoke-static {v6, v5, v14, v13, v4}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v5

    invoke-interface {v5}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LEe/g;

    sget-object v6, Lcom/ui/wifiman/ui/signal/b;->a:Lcom/ui/wifiman/ui/signal/b;

    invoke-virtual {v6}, Lcom/ui/wifiman/ui/signal/b;->a()Lmh/r;

    move-result-object v8

    const v6, -0x55270a1a

    invoke-interface {v14, v6}, LT/l;->U(I)V

    and-int/lit8 v6, v3, 0x70

    xor-int/lit8 v6, v6, 0x30

    if-le v6, v11, :cond_11

    invoke-interface {v14, v12}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_12

    :cond_11
    and-int/lit8 v3, v3, 0x30

    if-ne v3, v11, :cond_13

    :cond_12
    move v13, v4

    :cond_13
    invoke-interface {v14}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v13, :cond_14

    sget-object v6, LT/l;->a:LT/l$a;

    invoke-virtual {v6}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v3, v6, :cond_15

    :cond_14
    new-instance v3, Lcom/ui/wifiman/ui/signal/H;

    invoke-direct {v3, v12}, Lcom/ui/wifiman/ui/signal/H;-><init>(Lcom/ui/wifiman/ui/signal/N;)V

    invoke-interface {v14, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_15
    move-object v9, v3

    check-cast v9, Lmh/l;

    invoke-interface {v14}, LT/l;->J()V

    new-instance v3, Lcom/ui/wifiman/ui/signal/M$a;

    invoke-direct {v3, v12}, Lcom/ui/wifiman/ui/signal/M$a;-><init>(Lcom/ui/wifiman/ui/signal/N;)V

    const/16 v6, 0x36

    const v7, -0x19b2ab3b

    invoke-static {v7, v4, v3, v14, v6}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v10

    const/high16 v13, 0xc30000

    const/16 v16, 0x1c

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v11, 0x0

    move-object v3, v2

    move-object v4, v5

    move-object v5, v6

    move v6, v7

    move v7, v11

    move-object v11, v14

    move-object v2, v12

    move v12, v13

    move/from16 v13, v16

    invoke-static/range {v3 .. v13}, LEe/z;->L(Landroidx/compose/ui/e;LEe/g;LA/B;ZZLmh/r;Lmh/l;Lmh/r;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_16

    invoke-static {}, LT/o;->P()V

    :cond_16
    :goto_9
    invoke-interface {v14}, LT/l;->z()LT/X0;

    move-result-object v3

    if-eqz v3, :cond_17

    new-instance v4, Lcom/ui/wifiman/ui/signal/I;

    invoke-direct {v4, v15, v2, v0, v1}, Lcom/ui/wifiman/ui/signal/I;-><init>(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/signal/N;II)V

    invoke-interface {v3, v4}, LT/X0;->a(Lmh/p;)V

    :cond_17
    return-void
.end method

.method private static final d(Lcom/ui/wifiman/ui/signal/N;Ljava/lang/String;)LYg/J;
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/signal/N;->u0()V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final e(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/signal/N;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lcom/ui/wifiman/ui/signal/M;->c(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/signal/N;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final synthetic f(LTe/K0$k;)LJ9/j;
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/ui/signal/M;->g(LTe/K0$k;)LJ9/j;

    move-result-object p0

    return-object p0
.end method

.method private static final g(LTe/K0$k;)LJ9/j;
    .locals 13

    invoke-virtual {p0}, LTe/K0$k;->b()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lgc/b;

    new-instance v12, LJ9/a;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    new-instance v5, Ls9/d$b;

    sget-object v3, Lcom/ui/wifiman/ui/signal/M$b;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v3, v3, v6

    const/4 v6, 0x1

    if-eq v3, v6, :cond_2

    const/4 v7, 0x2

    if-eq v3, v7, :cond_1

    const/4 v7, 0x3

    if-ne v3, v7, :cond_0

    sget v3, Lm8/c;->l2:I

    goto :goto_1

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget v3, Lm8/c;->n2:I

    goto :goto_1

    :cond_2
    sget v3, Lm8/c;->m2:I

    :goto_1
    invoke-direct {v5, v3}, Ls9/d$b;-><init>(I)V

    invoke-virtual {p0}, LTe/K0$k;->a()Lgc/b;

    move-result-object v3

    if-ne v2, v3, :cond_3

    move v7, v6

    goto :goto_2

    :cond_3
    const/4 v2, 0x0

    move v7, v2

    :goto_2
    const/16 v10, 0x30

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v3, v12

    invoke-direct/range {v3 .. v11}, LJ9/a;-><init>(ILs9/d;Ls9/b;ZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    new-instance p0, LJ9/j;

    invoke-direct {p0, v1}, LJ9/j;-><init>(Ljava/util/List;)V

    return-object p0
.end method
