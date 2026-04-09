.class public abstract LR9/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/fragment/app/Fragment;Lmh/p;Lmh/p;ILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, LR9/i;->e(Landroidx/fragment/app/Fragment;Lmh/p;Lmh/p;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lmh/p;Lq2/f;Landroid/os/Bundle;)Landroidx/lifecycle/P$c;
    .locals 0

    invoke-static {p0, p1, p2}, LR9/i;->d(Lmh/p;Lq2/f;Landroid/os/Bundle;)Landroidx/lifecycle/P$c;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/fragment/app/Fragment;Lmh/p;Lmh/p;LT/l;I)V
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "vmFactoryProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "content"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x7713fcbc

    invoke-interface {p3, v0}, LT/l;->r(I)LT/l;

    move-result-object p3

    and-int/lit8 v1, p4, 0x30

    if-nez v1, :cond_1

    invoke-interface {p3, p1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x20

    goto :goto_0

    :cond_0
    const/16 v1, 0x10

    :goto_0
    or-int/2addr v1, p4

    goto :goto_1

    :cond_1
    move v1, p4

    :goto_1
    and-int/lit16 v2, p4, 0x180

    if-nez v2, :cond_3

    invoke-interface {p3, p2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x100

    goto :goto_2

    :cond_2
    const/16 v2, 0x80

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, v1, 0x91

    const/16 v3, 0x90

    if-ne v2, v3, :cond_5

    invoke-interface {p3}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {p3}, LT/l;->C()V

    goto :goto_4

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_6

    const/4 v2, -0x1

    const-string/jumbo v3, "com.ui.core.ui.sso.arch.vm.withVmFactoryProvider (ViewModelFactoryProvider.kt:19)"

    invoke-static {v0, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    const v0, -0x5c363328

    invoke-interface {p3, v0}, LT/l;->U(I)V

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_7

    new-instance v0, LR9/f;

    new-instance v1, LR9/g;

    invoke-direct {v1, p1}, LR9/g;-><init>(Lmh/p;)V

    invoke-direct {v0, v1}, LR9/f;-><init>(Lmh/p;)V

    invoke-interface {p3, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_7
    check-cast v0, LR9/f;

    invoke-interface {p3}, LT/l;->J()V

    invoke-static {}, LQ9/h;->k()LT/H0;

    move-result-object v1

    invoke-virtual {v1, v0}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v0

    new-instance v1, LR9/i$a;

    invoke-direct {v1, p2}, LR9/i$a;-><init>(Lmh/p;)V

    const/16 v2, 0x36

    const v3, 0x2293d804

    const/4 v4, 0x1

    invoke-static {v3, v4, v1, p3, v2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v1

    sget v2, LT/I0;->i:I

    or-int/lit8 v2, v2, 0x30

    invoke-static {v0, v1, p3, v2}, LT/w;->a(LT/I0;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {}, LT/o;->P()V

    :cond_8
    :goto_4
    invoke-interface {p3}, LT/l;->z()LT/X0;

    move-result-object p3

    if-eqz p3, :cond_9

    new-instance v0, LR9/h;

    invoke-direct {v0, p0, p1, p2, p4}, LR9/h;-><init>(Landroidx/fragment/app/Fragment;Lmh/p;Lmh/p;I)V

    invoke-interface {p3, v0}, LT/X0;->a(Lmh/p;)V

    :cond_9
    return-void
.end method

.method private static final d(Lmh/p;Lq2/f;Landroid/os/Bundle;)Landroidx/lifecycle/P$c;
    .locals 1

    const-string/jumbo v0, "savedStateRegistryOwner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "arguments"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1, p2}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/lifecycle/P$c;

    return-object p0
.end method

.method private static final e(Landroidx/fragment/app/Fragment;Lmh/p;Lmh/p;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, LT/L0;->a(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, LR9/i;->c(Landroidx/fragment/app/Fragment;Lmh/p;Lmh/p;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
