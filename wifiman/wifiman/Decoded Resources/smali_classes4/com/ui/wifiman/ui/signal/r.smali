.class public abstract Lcom/ui/wifiman/ui/signal/r;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Ljava/util/List;Lcom/ui/wifiman/ui/signal/m;LA/y;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ui/wifiman/ui/signal/r;->g(Ljava/util/List;Lcom/ui/wifiman/ui/signal/m;LA/y;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/ui/wifiman/ui/signal/c;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/ui/signal/r;->i(Lcom/ui/wifiman/ui/signal/c;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/signal/m;Lcom/ui/wifiman/ui/signal/l$a;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/ui/wifiman/ui/signal/r;->f(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/signal/m;Lcom/ui/wifiman/ui/signal/l$a;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/ui/wifiman/ui/signal/c;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/ui/signal/r;->h(Lcom/ui/wifiman/ui/signal/c;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/signal/m;Lcom/ui/wifiman/ui/signal/l$a;LT/l;II)V
    .locals 18

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    const-string v0, "vm"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x7a90c1d5

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v1

    and-int/lit8 v5, p5, 0x1

    if-eqz v5, :cond_0

    or-int/lit8 v6, v4, 0x6

    move v7, v6

    move-object/from16 v6, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v6, v4, 0x6

    if-nez v6, :cond_2

    move-object/from16 v6, p0

    invoke-interface {v1, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v7, 0x4

    goto :goto_0

    :cond_1
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v4

    goto :goto_1

    :cond_2
    move-object/from16 v6, p0

    move v7, v4

    :goto_1
    and-int/lit8 v8, p5, 0x2

    const/16 v9, 0x20

    if-eqz v8, :cond_3

    or-int/lit8 v7, v7, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v8, v4, 0x30

    if-nez v8, :cond_5

    invoke-interface {v1, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    move v8, v9

    goto :goto_2

    :cond_4
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v7, v8

    :cond_5
    :goto_3
    and-int/lit8 v8, p5, 0x4

    if-eqz v8, :cond_6

    or-int/lit16 v7, v7, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v8, v4, 0x180

    if-nez v8, :cond_8

    invoke-interface {v1, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_4

    :cond_7
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v7, v8

    :cond_8
    :goto_5
    and-int/lit16 v8, v7, 0x93

    const/16 v10, 0x92

    if-ne v8, v10, :cond_a

    invoke-interface {v1}, LT/l;->v()Z

    move-result v8

    if-nez v8, :cond_9

    goto :goto_6

    :cond_9
    invoke-interface {v1}, LT/l;->C()V

    move-object/from16 v17, v6

    goto/16 :goto_9

    :cond_a
    :goto_6
    if-eqz v5, :cond_b

    sget-object v5, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object/from16 v17, v5

    goto :goto_7

    :cond_b
    move-object/from16 v17, v6

    :goto_7
    invoke-static {}, LT/o;->H()Z

    move-result v5

    if-eqz v5, :cond_c

    const/4 v5, -0x1

    const-string v6, "com.ui.wifiman.ui.signal.SignalTabFloorplanUiContent (SignalTabFloorplanUiContent.kt:36)"

    invoke-static {v0, v7, v5, v6}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_c
    shr-int/lit8 v0, v7, 0x6

    and-int/lit8 v0, v0, 0xe

    invoke-static {v3, v1, v0}, Lcom/ui/wifiman/ui/signal/r;->k(Lcom/ui/wifiman/ui/signal/l;LT/l;I)Ljava/util/List;

    move-result-object v0

    sget-object v5, Lla/a;->a:Lla/a;

    sget v6, Lla/a;->b:I

    invoke-virtual {v5, v1, v6}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v5

    invoke-virtual {v5}, Lra/a;->a()Lra/b;

    move-result-object v5

    invoke-virtual {v5}, Lra/b;->b()Lra/b$a$b;

    move-result-object v5

    invoke-virtual {v5}, Lra/b$a$b;->c()F

    move-result v11

    const/16 v14, 0xd

    const/4 v15, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/layout/o;->e(FFFFILjava/lang/Object;)Lz/N;

    move-result-object v8

    const v5, -0x1a6c0675

    invoke-interface {v1, v5}, LT/l;->U(I)V

    invoke-interface {v1, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    and-int/lit8 v6, v7, 0x70

    if-ne v6, v9, :cond_d

    const/4 v6, 0x1

    goto :goto_8

    :cond_d
    const/4 v6, 0x0

    :goto_8
    or-int/2addr v5, v6

    invoke-interface {v1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_e

    sget-object v5, LT/l;->a:LT/l$a;

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v6, v5, :cond_f

    :cond_e
    new-instance v6, Lcom/ui/wifiman/ui/signal/n;

    invoke-direct {v6, v0, v2}, Lcom/ui/wifiman/ui/signal/n;-><init>(Ljava/util/List;Lcom/ui/wifiman/ui/signal/m;)V

    invoke-interface {v1, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_f
    move-object v13, v6

    check-cast v13, Lmh/l;

    invoke-interface {v1}, LT/l;->J()V

    and-int/lit8 v15, v7, 0xe

    const/16 v16, 0xfa

    const/4 v6, 0x0

    const/4 v0, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v5, v17

    move-object v7, v8

    move v8, v0

    move-object v14, v1

    invoke-static/range {v5 .. v16}, LA/b;->a(Landroidx/compose/ui/e;LA/B;Lz/N;ZLz/c$m;Lf0/c$b;Lw/n;ZLmh/l;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-static {}, LT/o;->P()V

    :cond_10
    :goto_9
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v6

    if-eqz v6, :cond_11

    new-instance v7, Lcom/ui/wifiman/ui/signal/o;

    move-object v0, v7

    move-object/from16 v1, v17

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/ui/wifiman/ui/signal/o;-><init>(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/signal/m;Lcom/ui/wifiman/ui/signal/l$a;II)V

    invoke-interface {v6, v7}, LT/X0;->a(Lmh/p;)V

    :cond_11
    return-void
.end method

.method private static final f(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/signal/m;Lcom/ui/wifiman/ui/signal/l$a;IILT/l;I)LYg/J;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, LT/L0;->a(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p5

    move v5, p4

    invoke-static/range {v0 .. v5}, Lcom/ui/wifiman/ui/signal/r;->e(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/signal/m;Lcom/ui/wifiman/ui/signal/l$a;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final g(Ljava/util/List;Lcom/ui/wifiman/ui/signal/m;LA/y;)LYg/J;
    .locals 4

    const-string v0, "$this$LazyColumn"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wifiman/ui/signal/p;

    invoke-direct {v0}, Lcom/ui/wifiman/ui/signal/p;-><init>()V

    new-instance v1, Lcom/ui/wifiman/ui/signal/q;

    invoke-direct {v1}, Lcom/ui/wifiman/ui/signal/q;-><init>()V

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    new-instance v3, Lcom/ui/wifiman/ui/signal/r$g;

    invoke-direct {v3, v0, p0}, Lcom/ui/wifiman/ui/signal/r$g;-><init>(Lmh/l;Ljava/util/List;)V

    new-instance v0, Lcom/ui/wifiman/ui/signal/r$h;

    invoke-direct {v0, v1, p0}, Lcom/ui/wifiman/ui/signal/r$h;-><init>(Lmh/l;Ljava/util/List;)V

    new-instance v1, Lcom/ui/wifiman/ui/signal/r$i;

    invoke-direct {v1, p0, p1}, Lcom/ui/wifiman/ui/signal/r$i;-><init>(Ljava/util/List;Lcom/ui/wifiman/ui/signal/m;)V

    const p0, -0x25b7f321

    const/4 p1, 0x1

    invoke-static {p0, p1, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object p0

    invoke-interface {p2, v2, v3, v0, p0}, LA/y;->a(ILmh/l;Lmh/l;Lmh/r;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final h(Lcom/ui/wifiman/ui/signal/c;)Ljava/lang/Object;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/signal/c;->a()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final i(Lcom/ui/wifiman/ui/signal/c;)Ljava/lang/Object;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/signal/c;->b()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic j(Lcom/ui/wifiman/ui/signal/l$b$b$d;)Ls9/d;
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/ui/signal/r;->l(Lcom/ui/wifiman/ui/signal/l$b$b$d;)Ls9/d;

    move-result-object p0

    return-object p0
.end method

.method private static final k(Lcom/ui/wifiman/ui/signal/l;LT/l;I)Ljava/util/List;
    .locals 4

    const v0, -0x2eee6700

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.signal.listItems (SignalTabFloorplanUiContent.kt:121)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    instance-of p2, p0, Lcom/ui/wifiman/ui/signal/l$a;

    if-eqz p2, :cond_5

    check-cast p0, Lcom/ui/wifiman/ui/signal/l$a;

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/signal/l$a;->e()Z

    move-result p2

    const/16 v0, 0xa

    if-eqz p2, :cond_1

    const/4 p0, 0x0

    const/4 p2, 0x2

    invoke-static {p0, p2}, Lsh/m;->s(II)Lsh/i;

    move-result-object p0

    new-instance p2, Ljava/util/ArrayList;

    invoke-static {p0, v0}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    move-object v0, p0

    check-cast v0, LZg/Q;

    invoke-virtual {v0}, LZg/Q;->d()I

    move-result v0

    new-instance v1, Lcom/ui/wifiman/ui/signal/c$a;

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/ui/wifiman/ui/signal/c$a;-><init>(Ljava/lang/String;)V

    invoke-interface {p2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/signal/l$a;->d()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ui/wifiman/ui/signal/l$b$b$d;

    new-instance v3, Lcom/ui/wifiman/ui/signal/c$c;

    invoke-direct {v3, v2}, Lcom/ui/wifiman/ui/signal/c$c;-><init>(Lcom/ui/wifiman/ui/signal/l$b$b$d;)V

    invoke-interface {p2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lcom/ui/wifiman/ui/signal/l$a;->a()Z

    move-result v1

    if-eqz v1, :cond_3

    new-instance v1, Lcom/ui/wifiman/ui/signal/c$d;

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/signal/l$a;->b()Z

    move-result v2

    invoke-direct {v1, v2}, Lcom/ui/wifiman/ui/signal/c$d;-><init>(Z)V

    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    invoke-virtual {p0}, Lcom/ui/wifiman/ui/signal/l$a;->c()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {p0, v0}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTe/p;

    new-instance v2, Lcom/ui/wifiman/ui/signal/c$b;

    invoke-direct {v2, v0}, Lcom/ui/wifiman/ui/signal/c$b;-><init>(LTe/p;)V

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    invoke-interface {p2, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_3

    :cond_5
    instance-of p0, p0, Lcom/ui/wifiman/ui/signal/l$b;

    if-eqz p0, :cond_8

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p2

    :cond_6
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    invoke-interface {p1}, LT/l;->J()V

    return-object p2

    :cond_8
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final l(Lcom/ui/wifiman/ui/signal/l$b$b$d;)Ls9/d;
    .locals 1

    instance-of v0, p0, Lcom/ui/wifiman/ui/signal/l$b$b$d$b;

    if-eqz v0, :cond_0

    new-instance p0, Ls9/d$b;

    sget v0, Lm8/c;->H1:I

    invoke-direct {p0, v0}, Ls9/d$b;-><init>(I)V

    goto :goto_0

    :cond_0
    instance-of v0, p0, Lcom/ui/wifiman/ui/signal/l$b$b$d$c;

    if-eqz v0, :cond_1

    new-instance p0, Ls9/d$b;

    sget v0, Lm8/c;->I1:I

    invoke-direct {p0, v0}, Ls9/d$b;-><init>(I)V

    goto :goto_0

    :cond_1
    instance-of p0, p0, Lcom/ui/wifiman/ui/signal/l$b$b$d$a;

    if-eqz p0, :cond_2

    new-instance p0, Ls9/d$b;

    sget v0, Lm8/c;->A1:I

    invoke-direct {p0, v0}, Ls9/d$b;-><init>(I)V

    :goto_0
    return-object p0

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
