.class final Lba/d$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lba/d$a;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/core/ui/sso/SSOAccountVM;

.field final synthetic b:Landroidx/fragment/app/Fragment;


# direct methods
.method constructor <init>(Lcom/ui/core/ui/sso/SSOAccountVM;Landroidx/fragment/app/Fragment;)V
    .locals 0

    iput-object p1, p0, Lba/d$a$a;->a:Lcom/ui/core/ui/sso/SSOAccountVM;

    iput-object p2, p0, Lba/d$a$a;->b:Landroidx/fragment/app/Fragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/ui/core/ui/sso/SSOAccountVM;LT/L;)LT/K;
    .locals 0

    invoke-static {p0, p1}, Lba/d$a$a;->c(Lcom/ui/core/ui/sso/SSOAccountVM;LT/L;)LT/K;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lcom/ui/core/ui/sso/SSOAccountVM;LT/L;)LT/K;
    .locals 1

    const-string v0, "$this$DisposableEffect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lba/d$a$a$b;

    invoke-direct {p1, p0}, Lba/d$a$a$b;-><init>(Lcom/ui/core/ui/sso/SSOAccountVM;)V

    return-object p1
.end method


# virtual methods
.method public final b(LT/l;I)V
    .locals 6

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/l;->C()V

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string/jumbo v1, "com.ui.core.ui.sso.password.UiResetPassword.<anonymous>.<anonymous> (UiResetPassword.kt:25)"

    const v2, -0x44d0d7b

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    const p2, -0x45846cf

    invoke-interface {p1, p2}, LT/l;->U(I)V

    iget-object p2, p0, Lba/d$a$a;->a:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-interface {p1, p2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result p2

    iget-object v0, p0, Lba/d$a$a;->a:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez p2, :cond_3

    sget-object p2, LT/l;->a:LT/l$a;

    invoke-virtual {p2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p2

    if-ne v1, p2, :cond_4

    :cond_3
    new-instance v1, Lba/d$a$a$a;

    const/4 p2, 0x0

    invoke-direct {v1, v0, p2}, Lba/d$a$a$a;-><init>(Lcom/ui/core/ui/sso/SSOAccountVM;Ldh/e;)V

    invoke-interface {p1, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v1, Lmh/p;

    invoke-interface {p1}, LT/l;->J()V

    const-string/jumbo p2, "resetPassword"

    const/4 v0, 0x6

    invoke-static {p2, v1, p1, v0}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    const v1, -0x458349e

    invoke-interface {p1, v1}, LT/l;->U(I)V

    iget-object v1, p0, Lba/d$a$a;->a:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-interface {p1, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, p0, Lba/d$a$a;->a:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_5

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v3, v1, :cond_6

    :cond_5
    new-instance v3, Lba/c;

    invoke-direct {v3, v2}, Lba/c;-><init>(Lcom/ui/core/ui/sso/SSOAccountVM;)V

    invoke-interface {p1, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    check-cast v3, Lmh/l;

    invoke-interface {p1}, LT/l;->J()V

    invoke-static {p2, v3, p1, v0}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    iget-object p2, p0, Lba/d$a$a;->b:Landroidx/fragment/app/Fragment;

    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->O()Landroidx/lifecycle/k;

    move-result-object v2

    const-string p2, "<get-lifecycle>(...)"

    invoke-static {v2, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x2

    const-class v0, Lba/l;

    const/4 v1, 0x0

    move-object v3, p1

    invoke-static/range {v0 .. v5}, LQ9/h;->m(Ljava/lang/Class;Landroid/os/Bundle;Landroidx/lifecycle/k;LT/l;II)LR9/a;

    move-result-object p2

    check-cast p2, Lba/l;

    const/4 v0, 0x0

    invoke-static {p2, p1, v0}, Lba/j;->f(Lba/l;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lba/d$a$a;->b(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
