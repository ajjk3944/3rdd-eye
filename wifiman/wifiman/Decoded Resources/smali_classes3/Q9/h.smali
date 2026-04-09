.class public abstract LQ9/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LT/H0;

.field private static final b:LT/H0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LQ9/b;

    invoke-direct {v0}, LQ9/b;-><init>()V

    invoke-static {v0}, LT/w;->f(Lmh/a;)LT/H0;

    move-result-object v0

    sput-object v0, LQ9/h;->a:LT/H0;

    new-instance v0, LQ9/c;

    invoke-direct {v0}, LQ9/c;-><init>()V

    invoke-static {v0}, LT/w;->f(Lmh/a;)LT/H0;

    move-result-object v0

    sput-object v0, LQ9/h;->b:LT/H0;

    return-void
.end method

.method public static synthetic a()LR9/f;
    .locals 1

    invoke-static {}, LQ9/h;->f()LR9/f;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Landroid/app/Activity;Lmh/a;Ljava/lang/String;Lmh/a;Lf2/w;Lmh/q;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p9}, LQ9/h;->i(Landroid/app/Activity;Lmh/a;Ljava/lang/String;Lmh/a;Lf2/w;Lmh/q;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()LQ9/j;
    .locals 1

    invoke-static {}, LQ9/h;->e()LQ9/j;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(Landroid/app/Activity;)LYg/J;
    .locals 0

    invoke-static {p0}, LQ9/h;->h(Landroid/app/Activity;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final e()LQ9/j;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "No view router set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final f()LR9/f;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "No vm provider set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final g(Landroid/app/Activity;Lmh/a;Ljava/lang/String;Lmh/a;Lf2/w;Lmh/q;LT/l;II)V
    .locals 17

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    move-object/from16 v9, p2

    move-object/from16 v10, p5

    move/from16 v11, p7

    const-string/jumbo v0, "activity"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "viewRouterFactory"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "startDestination"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "content"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x520f6b62

    move-object/from16 v1, p6

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v12

    and-int/lit8 v1, p8, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v11, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v11, 0x6

    if-nez v1, :cond_2

    invoke-interface {v12, v7}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v11

    goto :goto_1

    :cond_2
    move v1, v11

    :goto_1
    and-int/lit8 v2, p8, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v2, v11, 0x30

    if-nez v2, :cond_5

    invoke-interface {v12, v8}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x20

    goto :goto_2

    :cond_4
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_5
    :goto_3
    and-int/lit8 v2, p8, 0x4

    const/16 v3, 0x100

    if-eqz v2, :cond_6

    or-int/lit16 v1, v1, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v2, v11, 0x180

    if-nez v2, :cond_8

    invoke-interface {v12, v9}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    move v2, v3

    goto :goto_4

    :cond_7
    const/16 v2, 0x80

    :goto_4
    or-int/2addr v1, v2

    :cond_8
    :goto_5
    and-int/lit16 v2, v11, 0xc00

    const/16 v4, 0x800

    if-nez v2, :cond_b

    and-int/lit8 v2, p8, 0x8

    if-nez v2, :cond_9

    move-object/from16 v2, p3

    invoke-interface {v12, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    move v5, v4

    goto :goto_6

    :cond_9
    move-object/from16 v2, p3

    :cond_a
    const/16 v5, 0x400

    :goto_6
    or-int/2addr v1, v5

    goto :goto_7

    :cond_b
    move-object/from16 v2, p3

    :goto_7
    and-int/lit16 v5, v11, 0x6000

    if-nez v5, :cond_e

    and-int/lit8 v5, p8, 0x10

    if-nez v5, :cond_c

    move-object/from16 v5, p4

    invoke-interface {v12, v5}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_d

    const/16 v6, 0x4000

    goto :goto_8

    :cond_c
    move-object/from16 v5, p4

    :cond_d
    const/16 v6, 0x2000

    :goto_8
    or-int/2addr v1, v6

    goto :goto_9

    :cond_e
    move-object/from16 v5, p4

    :goto_9
    and-int/lit8 v6, p8, 0x20

    const/high16 v13, 0x30000

    if-eqz v6, :cond_f

    or-int/2addr v1, v13

    goto :goto_b

    :cond_f
    and-int v6, v11, v13

    if-nez v6, :cond_11

    invoke-interface {v12, v10}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_10

    const/high16 v6, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v6, 0x10000

    :goto_a
    or-int/2addr v1, v6

    :cond_11
    :goto_b
    const v6, 0x12493

    and-int/2addr v6, v1

    const v13, 0x12492

    if-ne v6, v13, :cond_13

    invoke-interface {v12}, LT/l;->v()Z

    move-result v6

    if-nez v6, :cond_12

    goto :goto_c

    :cond_12
    invoke-interface {v12}, LT/l;->C()V

    move-object v4, v2

    goto/16 :goto_14

    :cond_13
    :goto_c
    invoke-interface {v12}, LT/l;->q()V

    and-int/lit8 v6, v11, 0x1

    const v13, -0xe001

    const/4 v14, 0x0

    if-eqz v6, :cond_17

    invoke-interface {v12}, LT/l;->H()Z

    move-result v6

    if-eqz v6, :cond_14

    goto :goto_e

    :cond_14
    invoke-interface {v12}, LT/l;->C()V

    and-int/lit8 v6, p8, 0x8

    if-eqz v6, :cond_15

    and-int/lit16 v1, v1, -0x1c01

    :cond_15
    and-int/lit8 v6, p8, 0x10

    if-eqz v6, :cond_16

    :goto_d
    and-int/2addr v1, v13

    :cond_16
    move-object v13, v2

    move-object v15, v5

    goto :goto_f

    :cond_17
    :goto_e
    and-int/lit8 v6, p8, 0x8

    if-eqz v6, :cond_1a

    const v2, -0x5bccc3e7

    invoke-interface {v12, v2}, LT/l;->U(I)V

    invoke-interface {v12, v7}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v2, :cond_18

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v6, v2, :cond_19

    :cond_18
    new-instance v6, LQ9/d;

    invoke-direct {v6, v7}, LQ9/d;-><init>(Landroid/app/Activity;)V

    invoke-interface {v12, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_19
    move-object v2, v6

    check-cast v2, Lmh/a;

    invoke-interface {v12}, LT/l;->J()V

    and-int/lit16 v1, v1, -0x1c01

    :cond_1a
    and-int/lit8 v6, p8, 0x10

    if-eqz v6, :cond_16

    new-array v5, v14, [Lf2/D;

    invoke-static {v5, v12, v14}, Lg2/l;->d([Lf2/D;LT/l;I)Lf2/w;

    move-result-object v5

    goto :goto_d

    :goto_f
    invoke-interface {v12}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_1b

    const/4 v2, -0x1

    const-string/jumbo v5, "com.ui.core.ui.sso.arch.routing.Navigation (Navigation.kt:29)"

    invoke-static {v0, v1, v2, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_1b
    const v0, -0x5bccae5c

    invoke-interface {v12, v0}, LT/l;->U(I)V

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v0, v5, :cond_1c

    invoke-interface/range {p1 .. p1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LQ9/j;

    invoke-interface {v12, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1c
    move-object v6, v0

    check-cast v6, LQ9/j;

    invoke-interface {v12}, LT/l;->J()V

    const v0, -0x5bcc9f97

    invoke-interface {v12, v0}, LT/l;->U(I)V

    invoke-interface {v12, v6}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {v12, v15}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v0, v5

    and-int/lit16 v5, v1, 0x1c00

    xor-int/lit16 v5, v5, 0xc00

    if-le v5, v4, :cond_1d

    invoke-interface {v12, v13}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1e

    :cond_1d
    and-int/lit16 v5, v1, 0xc00

    if-ne v5, v4, :cond_1f

    :cond_1e
    const/4 v4, 0x1

    goto :goto_10

    :cond_1f
    const/4 v4, 0x0

    :goto_10
    or-int/2addr v0, v4

    and-int/lit16 v1, v1, 0x380

    if-ne v1, v3, :cond_20

    const/4 v1, 0x1

    goto :goto_11

    :cond_20
    const/4 v1, 0x0

    :goto_11
    or-int/2addr v0, v1

    invoke-interface {v12, v7}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_22

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_21

    goto :goto_12

    :cond_21
    move-object v7, v6

    goto :goto_13

    :cond_22
    :goto_12
    new-instance v5, LQ9/h$a;

    const/16 v16, 0x0

    move-object v0, v5

    move-object v1, v6

    move-object v2, v15

    move-object v3, v13

    move-object/from16 v4, p0

    move-object v14, v5

    move-object/from16 v5, p2

    move-object v7, v6

    move-object/from16 v6, v16

    invoke-direct/range {v0 .. v6}, LQ9/h$a;-><init>(LQ9/j;Lf2/w;Lmh/a;Landroid/app/Activity;Ljava/lang/String;Ldh/e;)V

    invoke-interface {v12, v14}, LT/l;->K(Ljava/lang/Object;)V

    move-object v1, v14

    :goto_13
    check-cast v1, Lmh/p;

    invoke-interface {v12}, LT/l;->J()V

    const-string/jumbo v0, "navigation"

    const/4 v2, 0x6

    invoke-static {v0, v1, v12, v2}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    sget-object v0, LQ9/h;->b:LT/H0;

    invoke-virtual {v0, v7}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v0

    new-instance v1, LQ9/h$b;

    invoke-direct {v1, v10, v15}, LQ9/h$b;-><init>(Lmh/q;Lf2/w;)V

    const/16 v2, 0x36

    const v3, 0x4eab7ea2

    const/4 v4, 0x1

    invoke-static {v3, v4, v1, v12, v2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v1

    sget v2, LT/I0;->i:I

    or-int/lit8 v2, v2, 0x30

    invoke-static {v0, v1, v12, v2}, LT/w;->a(LT/I0;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_23

    invoke-static {}, LT/o;->P()V

    :cond_23
    move-object v4, v13

    move-object v5, v15

    :goto_14
    invoke-interface {v12}, LT/l;->z()LT/X0;

    move-result-object v12

    if-eqz v12, :cond_24

    new-instance v13, LQ9/e;

    move-object v0, v13

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v6, p5

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, LQ9/e;-><init>(Landroid/app/Activity;Lmh/a;Ljava/lang/String;Lmh/a;Lf2/w;Lmh/q;II)V

    invoke-interface {v12, v13}, LT/X0;->a(Lmh/p;)V

    :cond_24
    return-void
.end method

.method private static final h(Landroid/app/Activity;)LYg/J;
    .locals 0

    invoke-virtual {p0}, Landroid/app/Activity;->onBackPressed()V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final i(Landroid/app/Activity;Lmh/a;Ljava/lang/String;Lmh/a;Lf2/w;Lmh/q;IILT/l;I)LYg/J;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p8

    move/from16 v9, p7

    invoke-static/range {v1 .. v9}, LQ9/h;->g(Landroid/app/Activity;Lmh/a;Ljava/lang/String;Lmh/a;Lf2/w;Lmh/q;LT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method public static final j()LT/H0;
    .locals 1

    sget-object v0, LQ9/h;->b:LT/H0;

    return-object v0
.end method

.method public static final k()LT/H0;
    .locals 1

    sget-object v0, LQ9/h;->a:LT/H0;

    return-object v0
.end method

.method public static final l(Lf2/k;Ljava/lang/Class;LT/l;I)LR9/a;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x73a9e99b

    invoke-interface {p2, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string/jumbo v2, "com.ui.core.ui.sso.arch.routing.vm (Navigation.kt:81)"

    invoke-static {v0, p3, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, Lf2/k;->d()Landroid/os/Bundle;

    move-result-object v4

    invoke-virtual {p0}, Lf2/k;->O()Landroidx/lifecycle/k;

    move-result-object v5

    shr-int/lit8 p0, p3, 0x3

    and-int/lit8 v7, p0, 0xe

    const/4 v8, 0x0

    move-object v3, p1

    move-object v6, p2

    invoke-static/range {v3 .. v8}, LQ9/h;->m(Ljava/lang/Class;Landroid/os/Bundle;Landroidx/lifecycle/k;LT/l;II)LR9/a;

    move-result-object p0

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    invoke-interface {p2}, LT/l;->J()V

    return-object p0
.end method

.method public static final m(Ljava/lang/Class;Landroid/os/Bundle;Landroidx/lifecycle/k;LT/l;II)LR9/a;
    .locals 8

    const-string/jumbo v0, "modelClass"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "lifecycle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x34d9277d    # -1.0934403E7f

    invoke-interface {p3, v0}, LT/l;->U(I)V

    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {}, LT/o;->H()Z

    move-result p5

    if-eqz p5, :cond_1

    const/4 p5, -0x1

    const-string/jumbo v1, "com.ui.core.ui.sso.arch.routing.vm (Navigation.kt:94)"

    invoke-static {v0, p4, p5, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_1
    sget-object p5, LQ9/h;->a:LT/H0;

    invoke-interface {p3, p5}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, LR9/f;

    invoke-virtual {p5}, LR9/f;->a()Lmh/p;

    move-result-object p5

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->j()LT/H0;

    move-result-object v0

    invoke-interface {p3, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    if-nez p1, :cond_2

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    :cond_2
    invoke-interface {p5, v0, p1}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Landroidx/lifecycle/P$c;

    and-int/lit8 v6, p4, 0xe

    const/16 v7, 0x16

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v5, p3

    invoke-static/range {v0 .. v7}, Lc2/c;->b(Ljava/lang/Class;Landroidx/lifecycle/S;Ljava/lang/String;Landroidx/lifecycle/P$c;Lb2/a;LT/l;II)Landroidx/lifecycle/N;

    move-result-object p0

    check-cast p0, LR9/a;

    shr-int/lit8 p1, p4, 0x3

    and-int/lit8 p1, p1, 0x70

    invoke-static {p0, p2, p3, p1}, LR9/e;->d(LR9/a;Landroidx/lifecycle/k;LT/l;I)V

    const/4 p1, 0x0

    invoke-static {p0, p3, p1}, LR9/e;->g(LR9/a;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    invoke-interface {p3}, LT/l;->J()V

    return-object p0
.end method
