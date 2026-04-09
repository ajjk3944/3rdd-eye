.class public abstract LGe/l;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(LCi/c;Lmh/l;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LGe/l;->i(LCi/c;Lmh/l;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LGe/g;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, LGe/l;->g(LGe/g;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LCi/c;Lmh/l;LA/y;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, LGe/l;->f(LCi/c;Lmh/l;LA/y;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(LGe/g;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, LGe/l;->h(LGe/g;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final e(LCi/c;Lmh/l;LT/l;I)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "notification"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onNotificationCloseClicked"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, 0x3680f80b

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LT/l;->r(I)LT/l;

    move-result-object v15

    and-int/lit8 v4, v2, 0x6

    const/4 v5, 0x4

    if-nez v4, :cond_2

    and-int/lit8 v4, v2, 0x8

    if-nez v4, :cond_0

    invoke-interface {v15, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_0

    :cond_0
    invoke-interface {v15, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    :goto_0
    if-eqz v4, :cond_1

    move v4, v5

    goto :goto_1

    :cond_1
    const/4 v4, 0x2

    :goto_1
    or-int/2addr v4, v2

    goto :goto_2

    :cond_2
    move v4, v2

    :goto_2
    and-int/lit8 v6, v2, 0x30

    const/16 v7, 0x20

    if-nez v6, :cond_4

    invoke-interface {v15, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    move v6, v7

    goto :goto_3

    :cond_3
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v4, v6

    :cond_4
    and-int/lit8 v6, v4, 0x13

    const/16 v8, 0x12

    if-ne v6, v8, :cond_6

    invoke-interface {v15}, LT/l;->v()Z

    move-result v6

    if-nez v6, :cond_5

    goto :goto_4

    :cond_5
    invoke-interface {v15}, LT/l;->C()V

    move-object v3, v15

    goto/16 :goto_8

    :cond_6
    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result v6

    if-eqz v6, :cond_7

    const/4 v6, -0x1

    const-string v8, "com.ui.wifiman.ui.component.notification.InAppNotificationContainer (InAppNotificationContainer.kt:17)"

    invoke-static {v3, v4, v6, v8}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_7
    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    invoke-static {v3, v6, v9, v8}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-static {v3}, Lz/j0;->c(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v6, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v6}, Lf0/c$a;->g()Lf0/c$b;

    move-result-object v10

    const v6, -0x833453

    invoke-interface {v15, v6}, LT/l;->U(I)V

    and-int/lit8 v6, v4, 0xe

    const/4 v8, 0x0

    if-eq v6, v5, :cond_9

    and-int/lit8 v5, v4, 0x8

    if-eqz v5, :cond_8

    invoke-interface {v15, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    goto :goto_5

    :cond_8
    move v5, v8

    goto :goto_6

    :cond_9
    :goto_5
    move v5, v9

    :goto_6
    and-int/lit8 v4, v4, 0x70

    if-ne v4, v7, :cond_a

    goto :goto_7

    :cond_a
    move v9, v8

    :goto_7
    or-int v4, v5, v9

    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_b

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v5, v4, :cond_c

    :cond_b
    new-instance v5, LGe/h;

    invoke-direct {v5, v0, v1}, LGe/h;-><init>(LCi/c;Lmh/l;)V

    invoke-interface {v15, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_c
    move-object v12, v5

    check-cast v12, Lmh/l;

    invoke-interface {v15}, LT/l;->J()V

    const/high16 v14, 0xc30000

    const/16 v16, 0x5e

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    move-object v4, v3

    move-object v9, v10

    move-object v10, v11

    move v11, v13

    move-object v13, v15

    move-object v3, v15

    move/from16 v15, v16

    invoke-static/range {v4 .. v15}, LA/b;->a(Landroidx/compose/ui/e;LA/B;Lz/N;ZLz/c$m;Lf0/c$b;Lw/n;ZLmh/l;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_d

    invoke-static {}, LT/o;->P()V

    :cond_d
    :goto_8
    invoke-interface {v3}, LT/l;->z()LT/X0;

    move-result-object v3

    if-eqz v3, :cond_e

    new-instance v4, LGe/i;

    invoke-direct {v4, v0, v1, v2}, LGe/i;-><init>(LCi/c;Lmh/l;I)V

    invoke-interface {v3, v4}, LT/X0;->a(Lmh/p;)V

    :cond_e
    return-void
.end method

.method private static final f(LCi/c;Lmh/l;LA/y;)LYg/J;
    .locals 4

    const-string v0, "$this$LazyColumn"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LGe/j;

    invoke-direct {v0}, LGe/j;-><init>()V

    new-instance v1, LGe/k;

    invoke-direct {v1}, LGe/k;-><init>()V

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    new-instance v3, LGe/l$b;

    invoke-direct {v3, v0, p0}, LGe/l$b;-><init>(Lmh/l;Ljava/util/List;)V

    new-instance v0, LGe/l$c;

    invoke-direct {v0, v1, p0}, LGe/l$c;-><init>(Lmh/l;Ljava/util/List;)V

    new-instance v1, LGe/l$d;

    invoke-direct {v1, p0, p1}, LGe/l$d;-><init>(Ljava/util/List;Lmh/l;)V

    const p0, -0x25b7f321

    const/4 p1, 0x1

    invoke-static {p0, p1, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object p0

    invoke-interface {p2, v2, v3, v0, p0}, LA/y;->a(ILmh/l;Lmh/l;Lmh/r;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final g(LGe/g;)Ljava/lang/Object;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LGe/g;->getId()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final h(LGe/g;)Ljava/lang/Object;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LGe/g;->getType()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final i(LCi/c;Lmh/l;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, LGe/l;->e(LCi/c;Lmh/l;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
