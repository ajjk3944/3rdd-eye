.class final Lcom/ui/core/ui/sso/d$c$b$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/core/ui/sso/d$c$b$a$a;->e(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/core/ui/sso/d;

.field final synthetic b:Lcom/ui/core/ui/sso/SSOAccountVM;

.field final synthetic c:Lf2/w;


# direct methods
.method constructor <init>(Lcom/ui/core/ui/sso/d;Lcom/ui/core/ui/sso/SSOAccountVM;Lf2/w;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/core/ui/sso/d$c$b$a$a$a;->a:Lcom/ui/core/ui/sso/d;

    iput-object p2, p0, Lcom/ui/core/ui/sso/d$c$b$a$a$a;->b:Lcom/ui/core/ui/sso/SSOAccountVM;

    iput-object p3, p0, Lcom/ui/core/ui/sso/d$c$b$a$a$a;->c:Lf2/w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/ui/core/ui/sso/SSOAccountVM;Lf2/w;Lcom/ui/core/ui/sso/login/g$a$b;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ui/core/ui/sso/d$c$b$a$a$a;->e(Lcom/ui/core/ui/sso/SSOAccountVM;Lf2/w;Lcom/ui/core/ui/sso/login/g$a$b;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/ui/core/ui/sso/d;)LYg/J;
    .locals 0

    invoke-static {p0}, Lcom/ui/core/ui/sso/d$c$b$a$a$a;->f(Lcom/ui/core/ui/sso/d;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lcom/ui/core/ui/sso/SSOAccountVM;Lf2/w;Lcom/ui/core/ui/sso/login/g$a$b;)LYg/J;
    .locals 6

    const-string/jumbo v0, "mfaEvent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/ui/core/ui/sso/login/g$a$b;->a()Lcom/ui/core/ui/sso/UiSSO$d;

    move-result-object v0

    invoke-virtual {p2}, Lcom/ui/core/ui/sso/login/g$a$b;->b()Lcom/ui/core/ui/sso/UiSSO$e;

    move-result-object p2

    invoke-virtual {p0, v0, p2}, Lcom/ui/core/ui/sso/SSOAccountVM;->v0(Lcom/ui/core/ui/sso/UiSSO$d;Lcom/ui/core/ui/sso/UiSSO$e;)V

    sget-object p0, Lcom/ui/core/ui/sso/a$b;->a:Lcom/ui/core/ui/sso/a$b;

    invoke-virtual {p0}, Lcom/ui/core/ui/sso/a$b;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final f(Lcom/ui/core/ui/sso/d;)LYg/J;
    .locals 0

    invoke-static {p0}, Lcom/ui/core/ui/sso/d;->F1(Lcom/ui/core/ui/sso/d;)Lcom/ui/core/ui/sso/d$b;

    move-result-object p0

    invoke-interface {p0}, Lcom/ui/core/ui/sso/d$b;->C()V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final c(Lq/b;Lf2/k;LT/l;I)V
    .locals 11

    const-string v0, "$this$composable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p1, "it"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string/jumbo p2, "com.ui.core.ui.sso.UiSSOAccountFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UiSSOAccountFragment.kt:134)"

    const v0, -0x1fa72bf9

    invoke-static {v0, p4, p1, p2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object v1, p0, Lcom/ui/core/ui/sso/d$c$b$a$a$a;->a:Lcom/ui/core/ui/sso/d;

    iget-object v2, p0, Lcom/ui/core/ui/sso/d$c$b$a$a$a;->b:Lcom/ui/core/ui/sso/SSOAccountVM;

    const p1, -0x19e9b27d

    invoke-interface {p3, p1}, LT/l;->U(I)V

    iget-object p1, p0, Lcom/ui/core/ui/sso/d$c$b$a$a$a;->b:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-interface {p3, p1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result p1

    iget-object p2, p0, Lcom/ui/core/ui/sso/d$c$b$a$a$a;->c:Lf2/w;

    invoke-interface {p3, p2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result p2

    or-int/2addr p1, p2

    iget-object p2, p0, Lcom/ui/core/ui/sso/d$c$b$a$a$a;->b:Lcom/ui/core/ui/sso/SSOAccountVM;

    iget-object p4, p0, Lcom/ui/core/ui/sso/d$c$b$a$a$a;->c:Lf2/w;

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    if-nez p1, :cond_1

    sget-object p1, LT/l;->a:LT/l$a;

    invoke-virtual {p1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p1

    if-ne v0, p1, :cond_2

    :cond_1
    new-instance v0, Lcom/ui/core/ui/sso/j;

    invoke-direct {v0, p2, p4}, Lcom/ui/core/ui/sso/j;-><init>(Lcom/ui/core/ui/sso/SSOAccountVM;Lf2/w;)V

    invoke-interface {p3, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    move-object v3, v0

    check-cast v3, Lmh/l;

    invoke-interface {p3}, LT/l;->J()V

    iget-object p1, p0, Lcom/ui/core/ui/sso/d$c$b$a$a$a;->a:Lcom/ui/core/ui/sso/d;

    invoke-static {p1}, Lcom/ui/core/ui/sso/d;->E1(Lcom/ui/core/ui/sso/d;)Z

    move-result v4

    iget-object p1, p0, Lcom/ui/core/ui/sso/d$c$b$a$a$a;->a:Lcom/ui/core/ui/sso/d;

    invoke-static {p1}, Lcom/ui/core/ui/sso/d;->D1(Lcom/ui/core/ui/sso/d;)Lcom/ui/core/ui/sso/UiSSO$c;

    move-result-object p1

    sget-object p2, Lcom/ui/core/ui/sso/UiSSO$c;->LOGIN:Lcom/ui/core/ui/sso/UiSSO$c;

    if-ne p1, p2, :cond_3

    const/4 p1, 0x1

    :goto_0
    move v5, p1

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    goto :goto_0

    :goto_1
    iget-object p1, p0, Lcom/ui/core/ui/sso/d$c$b$a$a$a;->a:Lcom/ui/core/ui/sso/d;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->q()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_4

    const-string/jumbo p2, "login_extra_button_label"

    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_2
    move-object v6, p1

    goto :goto_3

    :cond_4
    const/4 p1, 0x0

    goto :goto_2

    :goto_3
    const p1, -0x19e96651

    invoke-interface {p3, p1}, LT/l;->U(I)V

    iget-object p1, p0, Lcom/ui/core/ui/sso/d$c$b$a$a$a;->a:Lcom/ui/core/ui/sso/d;

    invoke-interface {p3, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p1

    iget-object p2, p0, Lcom/ui/core/ui/sso/d$c$b$a$a$a;->a:Lcom/ui/core/ui/sso/d;

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object p4

    if-nez p1, :cond_5

    sget-object p1, LT/l;->a:LT/l$a;

    invoke-virtual {p1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p1

    if-ne p4, p1, :cond_6

    :cond_5
    new-instance p4, Lcom/ui/core/ui/sso/k;

    invoke-direct {p4, p2}, Lcom/ui/core/ui/sso/k;-><init>(Lcom/ui/core/ui/sso/d;)V

    invoke-interface {p3, p4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    move-object v7, p4

    check-cast v7, Lmh/a;

    invoke-interface {p3}, LT/l;->J()V

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v8, p3

    invoke-static/range {v1 .. v10}, Lcom/ui/core/ui/sso/login/b;->c(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;Lmh/l;ZZLjava/lang/String;Lmh/a;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    return-void
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq/b;

    check-cast p2, Lf2/k;

    check-cast p3, LT/l;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/ui/core/ui/sso/d$c$b$a$a$a;->c(Lq/b;Lf2/k;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
