.class public abstract Lba/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lba/d;->e(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;Lq2/f;Landroid/os/Bundle;)Landroidx/lifecycle/P$c;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lba/d;->d(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;Lq2/f;Landroid/os/Bundle;)Landroidx/lifecycle/P$c;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;LT/l;I)V
    .locals 6

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "sessionVM"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x6fca10e5

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

    const-string/jumbo v3, "com.ui.core.ui.sso.password.UiResetPassword (UiResetPassword.kt:17)"

    invoke-static {v0, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    const v0, 0x6873ff76

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
    new-instance v2, Lba/a;

    invoke-direct {v2, p0, p1}, Lba/a;-><init>(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;)V

    invoke-interface {p2, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
    check-cast v2, Lmh/p;

    invoke-interface {p2}, LT/l;->J()V

    new-instance v0, Lba/d$a;

    invoke-direct {v0, p1, p0}, Lba/d$a;-><init>(Lcom/ui/core/ui/sso/SSOAccountVM;Landroidx/fragment/app/Fragment;)V

    const/16 v3, 0x36

    const v4, 0x360d0049

    const/4 v5, 0x1

    invoke-static {v4, v5, v0, p2, v3}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v0

    and-int/lit8 v1, v1, 0xe

    or-int/lit16 v1, v1, 0x180

    invoke-static {p0, v2, v0, p2, v1}, LR9/i;->c(Landroidx/fragment/app/Fragment;Lmh/p;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, LT/o;->P()V

    :cond_9
    :goto_4
    invoke-interface {p2}, LT/l;->z()LT/X0;

    move-result-object p2

    if-eqz p2, :cond_a

    new-instance v0, Lba/b;

    invoke-direct {v0, p0, p1, p3}, Lba/b;-><init>(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;I)V

    invoke-interface {p2, v0}, LT/X0;->a(Lmh/p;)V

    :cond_a
    return-void
.end method

.method private static final d(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;Lq2/f;Landroid/os/Bundle;)Landroidx/lifecycle/P$c;
    .locals 2

    const-string/jumbo v0, "savedStateRegistryOwner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "arguments"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lba/m;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o1()Landroidx/fragment/app/j;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object p0

    const-string/jumbo v1, "getApplication(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p0, p1, p2, p3}, Lba/m;-><init>(Landroid/app/Application;Lcom/ui/core/ui/sso/SSOAccountVM;Lq2/f;Landroid/os/Bundle;)V

    return-object v0
.end method

.method private static final e(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lba/d;->c(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
