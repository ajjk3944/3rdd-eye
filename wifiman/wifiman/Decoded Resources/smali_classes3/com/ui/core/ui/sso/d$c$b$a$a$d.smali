.class final Lcom/ui/core/ui/sso/d$c$b$a$a$d;
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


# direct methods
.method constructor <init>(Lcom/ui/core/ui/sso/d;Lcom/ui/core/ui/sso/SSOAccountVM;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/core/ui/sso/d$c$b$a$a$d;->a:Lcom/ui/core/ui/sso/d;

    iput-object p2, p0, Lcom/ui/core/ui/sso/d$c$b$a$a$d;->b:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/ui/core/ui/sso/d;)LYg/J;
    .locals 0

    invoke-static {p0}, Lcom/ui/core/ui/sso/d$c$b$a$a$d;->c(Lcom/ui/core/ui/sso/d;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lcom/ui/core/ui/sso/d;)LYg/J;
    .locals 0

    invoke-static {p0}, Lcom/ui/core/ui/sso/d;->F1(Lcom/ui/core/ui/sso/d;)Lcom/ui/core/ui/sso/d$b;

    move-result-object p0

    invoke-interface {p0}, Lcom/ui/core/ui/sso/d$b;->H()V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(Lq/b;Lf2/k;LT/l;I)V
    .locals 10

    const-string v0, "$this$composable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p1, "it"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string/jumbo p2, "com.ui.core.ui.sso.UiSSOAccountFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UiSSOAccountFragment.kt:172)"

    const v0, -0x4f7d12

    invoke-static {v0, p4, p1, p2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object v1, p0, Lcom/ui/core/ui/sso/d$c$b$a$a$d;->a:Lcom/ui/core/ui/sso/d;

    iget-object v2, p0, Lcom/ui/core/ui/sso/d$c$b$a$a$d;->b:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-static {v1}, Lcom/ui/core/ui/sso/d;->E1(Lcom/ui/core/ui/sso/d;)Z

    move-result v3

    iget-object p1, p0, Lcom/ui/core/ui/sso/d$c$b$a$a$d;->a:Lcom/ui/core/ui/sso/d;

    invoke-static {p1}, Lcom/ui/core/ui/sso/d;->D1(Lcom/ui/core/ui/sso/d;)Lcom/ui/core/ui/sso/UiSSO$c;

    move-result-object p1

    sget-object p2, Lcom/ui/core/ui/sso/UiSSO$c;->REGISTER:Lcom/ui/core/ui/sso/UiSSO$c;

    if-ne p1, p2, :cond_1

    const/4 p1, 0x1

    :goto_0
    move v4, p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    goto :goto_0

    :goto_1
    iget-object p1, p0, Lcom/ui/core/ui/sso/d$c$b$a$a$d;->a:Lcom/ui/core/ui/sso/d;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->q()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_2

    const-string/jumbo p2, "login_extra_button_label"

    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_2
    move-object v5, p1

    goto :goto_3

    :cond_2
    const/4 p1, 0x0

    goto :goto_2

    :goto_3
    const p1, -0x19e8626e    # -1.78996E23f

    invoke-interface {p3, p1}, LT/l;->U(I)V

    iget-object p1, p0, Lcom/ui/core/ui/sso/d$c$b$a$a$d;->a:Lcom/ui/core/ui/sso/d;

    invoke-interface {p3, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p1

    iget-object p2, p0, Lcom/ui/core/ui/sso/d$c$b$a$a$d;->a:Lcom/ui/core/ui/sso/d;

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object p4

    if-nez p1, :cond_3

    sget-object p1, LT/l;->a:LT/l$a;

    invoke-virtual {p1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p1

    if-ne p4, p1, :cond_4

    :cond_3
    new-instance p4, Lcom/ui/core/ui/sso/n;

    invoke-direct {p4, p2}, Lcom/ui/core/ui/sso/n;-><init>(Lcom/ui/core/ui/sso/d;)V

    invoke-interface {p3, p4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    move-object v6, p4

    check-cast v6, Lmh/a;

    invoke-interface {p3}, LT/l;->J()V

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v7, p3

    invoke-static/range {v1 .. v9}, Lda/f;->c(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;ZZLjava/lang/String;Lmh/a;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
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

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/ui/core/ui/sso/d$c$b$a$a$d;->b(Lq/b;Lf2/k;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
