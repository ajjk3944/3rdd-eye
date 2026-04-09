.class public abstract LR9/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(LR9/a;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LR9/e;->h(LR9/a;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LR9/a;Landroidx/lifecycle/k;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LR9/e;->f(LR9/a;Landroidx/lifecycle/k;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LR9/a;Landroidx/lifecycle/k;LT/L;)LT/K;
    .locals 0

    invoke-static {p0, p1, p2}, LR9/e;->e(LR9/a;Landroidx/lifecycle/k;LT/L;)LT/K;

    move-result-object p0

    return-object p0
.end method

.method public static final d(LR9/a;Landroidx/lifecycle/k;LT/l;I)V
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "lifecycle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x6bfebd1b

    invoke-interface {p2, v0}, LT/l;->r(I)LT/l;

    move-result-object p2

    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_1

    invoke-interface {p2, p0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p3

    goto :goto_1

    :cond_1
    move v1, p3

    :goto_1
    and-int/lit8 v2, p3, 0x30

    if-nez v2, :cond_3

    invoke-interface {p2, p1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit8 v2, v1, 0x13

    const/16 v3, 0x12

    if-ne v2, v3, :cond_5

    invoke-interface {p2}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {p2}, LT/l;->C()V

    goto :goto_4

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_6

    const/4 v2, -0x1

    const-string/jumbo v3, "com.ui.core.ui.sso.arch.vm.AttachLifecycleCallbacks (UiViewModel.kt:47)"

    invoke-static {v0, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    const v0, 0x255cf6f4

    invoke-interface {p2, v0}, LT/l;->U(I)V

    invoke-interface {p2, p0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p2, p1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_7

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_8

    :cond_7
    new-instance v2, LR9/b;

    invoke-direct {v2, p0, p1}, LR9/b;-><init>(LR9/a;Landroidx/lifecycle/k;)V

    invoke-interface {p2, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
    check-cast v2, Lmh/l;

    invoke-interface {p2}, LT/l;->J()V

    and-int/lit8 v0, v1, 0xe

    invoke-static {p0, v2, p2, v0}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, LT/o;->P()V

    :cond_9
    :goto_4
    invoke-interface {p2}, LT/l;->z()LT/X0;

    move-result-object p2

    if-eqz p2, :cond_a

    new-instance v0, LR9/c;

    invoke-direct {v0, p0, p1, p3}, LR9/c;-><init>(LR9/a;Landroidx/lifecycle/k;I)V

    invoke-interface {p2, v0}, LT/X0;->a(Lmh/p;)V

    :cond_a
    return-void
.end method

.method private static final e(LR9/a;Landroidx/lifecycle/k;LT/L;)LT/K;
    .locals 1

    const-string v0, "$this$DisposableEffect"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LR9/a;->Y()V

    invoke-virtual {p1, p0}, Landroidx/lifecycle/k;->a(Landroidx/lifecycle/n;)V

    new-instance p2, LR9/e$a;

    invoke-direct {p2, p1, p0}, LR9/e$a;-><init>(Landroidx/lifecycle/k;LR9/a;)V

    return-object p2
.end method

.method private static final f(LR9/a;Landroidx/lifecycle/k;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, LR9/e;->d(LR9/a;Landroidx/lifecycle/k;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final g(LR9/a;LT/l;I)V
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x3fb8233

    invoke-interface {p1, v0}, LT/l;->r(I)LT/l;

    move-result-object p1

    and-int/lit8 v1, p2, 0x6

    const/4 v2, 0x2

    if-nez v1, :cond_1

    invoke-interface {p1, p0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr v1, p2

    goto :goto_1

    :cond_1
    move v1, p2

    :goto_1
    and-int/lit8 v3, v1, 0x3

    if-ne v3, v2, :cond_3

    invoke-interface {p1}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p1}, LT/l;->C()V

    goto :goto_3

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, -0x1

    const-string/jumbo v3, "com.ui.core.ui.sso.arch.vm.AttachViewRouter (UiViewModel.kt:61)"

    invoke-static {v0, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    invoke-static {}, LQ9/h;->j()LT/H0;

    move-result-object v0

    invoke-interface {p1, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LQ9/j;

    invoke-virtual {p0, v0}, LR9/a;->b0(LQ9/j;)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    :goto_3
    invoke-interface {p1}, LT/l;->z()LT/X0;

    move-result-object p1

    if-eqz p1, :cond_6

    new-instance v0, LR9/d;

    invoke-direct {v0, p0, p2}, LR9/d;-><init>(LR9/a;I)V

    invoke-interface {p1, v0}, LT/X0;->a(Lmh/p;)V

    :cond_6
    return-void
.end method

.method private static final h(LR9/a;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, LT/L0;->a(I)I

    move-result p1

    invoke-static {p0, p2, p1}, LR9/e;->g(LR9/a;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
