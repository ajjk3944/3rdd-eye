.class final Lcom/ui/core/ui/sso/d$c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/core/ui/sso/d$c;->b(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/core/ui/sso/d;

.field final synthetic b:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/ui/core/ui/sso/d;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/core/ui/sso/d$c$b;->a:Lcom/ui/core/ui/sso/d;

    iput-object p2, p0, Lcom/ui/core/ui/sso/d$c$b;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/ui/core/ui/sso/d;Lq2/f;Landroid/os/Bundle;)Landroidx/lifecycle/P$c;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ui/core/ui/sso/d$c$b;->c(Lcom/ui/core/ui/sso/d;Lq2/f;Landroid/os/Bundle;)Landroidx/lifecycle/P$c;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lcom/ui/core/ui/sso/d;Lq2/f;Landroid/os/Bundle;)Landroidx/lifecycle/P$c;
    .locals 3

    const-string/jumbo v0, "savedStateRegistryOwner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "arguments"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/ui/sso/api/UiAccountApi$b;->a:Lcom/ui/sso/api/UiAccountApi$b$a;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p1()Landroid/content/Context;

    move-result-object v1

    const-string/jumbo v2, "requireContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ui/sso/api/UiAccountApi$b$a;->a(Landroid/content/Context;)Lcom/ui/sso/api/UiAccountApi$b;

    move-result-object v0

    invoke-static {p0}, Lcom/ui/core/ui/sso/d;->F1(Lcom/ui/core/ui/sso/d;)Lcom/ui/core/ui/sso/d$b;

    move-result-object v1

    invoke-interface {v1}, Lcom/ui/core/ui/sso/d$b;->A()LP9/k;

    invoke-virtual {p2}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q()Landroid/os/Bundle;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p2, p0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    new-instance p0, LP9/f;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p1, p2}, LP9/f;-><init>(Lcom/ui/sso/api/UiAccountApi$b;LP9/k;Lq2/f;Landroid/os/Bundle;)V

    return-object p0
.end method


# virtual methods
.method public final b(Lf2/w;LT/l;I)V
    .locals 4

    const-string/jumbo v0, "navController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string/jumbo v1, "com.ui.core.ui.sso.UiSSOAccountFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (UiSSOAccountFragment.kt:103)"

    const v2, -0x700f9e4c

    invoke-static {v2, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object p3, p0, Lcom/ui/core/ui/sso/d$c$b;->a:Lcom/ui/core/ui/sso/d;

    const v0, 0x10e8f046

    invoke-interface {p2, v0}, LT/l;->U(I)V

    iget-object v0, p0, Lcom/ui/core/ui/sso/d$c$b;->a:Lcom/ui/core/ui/sso/d;

    invoke-interface {p2, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, Lcom/ui/core/ui/sso/d$c$b;->a:Lcom/ui/core/ui/sso/d;

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_1

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_2

    :cond_1
    new-instance v2, Lcom/ui/core/ui/sso/f;

    invoke-direct {v2, v1}, Lcom/ui/core/ui/sso/f;-><init>(Lcom/ui/core/ui/sso/d;)V

    invoke-interface {p2, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast v2, Lmh/p;

    invoke-interface {p2}, LT/l;->J()V

    new-instance v0, Lcom/ui/core/ui/sso/d$c$b$a;

    iget-object v1, p0, Lcom/ui/core/ui/sso/d$c$b;->a:Lcom/ui/core/ui/sso/d;

    iget-object v3, p0, Lcom/ui/core/ui/sso/d$c$b;->b:Ljava/lang/String;

    invoke-direct {v0, v1, p1, v3}, Lcom/ui/core/ui/sso/d$c$b$a;-><init>(Lcom/ui/core/ui/sso/d;Lf2/w;Ljava/lang/String;)V

    const/16 p1, 0x36

    const v1, -0x3a9de29e

    const/4 v3, 0x1

    invoke-static {v1, v3, v0, p2, p1}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object p1

    const/16 v0, 0x180

    invoke-static {p3, v2, p1, p2, v0}, LR9/i;->c(Landroidx/fragment/app/Fragment;Lmh/p;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lf2/w;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/core/ui/sso/d$c$b;->b(Lf2/w;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
