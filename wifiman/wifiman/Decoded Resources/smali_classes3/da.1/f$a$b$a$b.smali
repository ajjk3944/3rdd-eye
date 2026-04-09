.class final Lda/f$a$b$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lda/f$a$b$a;->b(LT/l;I)V
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

    iput-object p1, p0, Lda/f$a$b$a$b;->a:Lcom/ui/core/ui/sso/SSOAccountVM;

    iput-object p2, p0, Lda/f$a$b$a$b;->b:Landroidx/fragment/app/Fragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/ui/core/ui/sso/SSOAccountVM;LT/L;)LT/K;
    .locals 0

    invoke-static {p0, p1}, Lda/f$a$b$a$b;->c(Lcom/ui/core/ui/sso/SSOAccountVM;LT/L;)LT/K;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lcom/ui/core/ui/sso/SSOAccountVM;LT/L;)LT/K;
    .locals 1

    const-string v0, "$this$DisposableEffect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lda/f$a$b$a$b$b;

    invoke-direct {p1, p0}, Lda/f$a$b$a$b$b;-><init>(Lcom/ui/core/ui/sso/SSOAccountVM;)V

    return-object p1
.end method


# virtual methods
.method public final b(Lq/b;Lf2/k;LT/l;I)V
    .locals 6

    const-string v0, "$this$composable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p1, "it"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string/jumbo p2, "com.ui.core.ui.sso.register.UiRegister.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UiRegister.kt:104)"

    const v0, 0x7da9bc81

    invoke-static {v0, p4, p1, p2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    const p1, -0x680495ec

    invoke-interface {p3, p1}, LT/l;->U(I)V

    iget-object p1, p0, Lda/f$a$b$a$b;->a:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-interface {p3, p1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result p1

    iget-object p2, p0, Lda/f$a$b$a$b;->a:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object p4

    if-nez p1, :cond_1

    sget-object p1, LT/l;->a:LT/l$a;

    invoke-virtual {p1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p1

    if-ne p4, p1, :cond_2

    :cond_1
    new-instance p4, Lda/f$a$b$a$b$a;

    const/4 p1, 0x0

    invoke-direct {p4, p2, p1}, Lda/f$a$b$a$b$a;-><init>(Lcom/ui/core/ui/sso/SSOAccountVM;Ldh/e;)V

    invoke-interface {p3, p4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast p4, Lmh/p;

    invoke-interface {p3}, LT/l;->J()V

    const-string/jumbo p1, "verify"

    const/4 p2, 0x6

    invoke-static {p1, p4, p3, p2}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    const p4, -0x68048043

    invoke-interface {p3, p4}, LT/l;->U(I)V

    iget-object p4, p0, Lda/f$a$b$a$b;->a:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-interface {p3, p4}, LT/l;->l(Ljava/lang/Object;)Z

    move-result p4

    iget-object v0, p0, Lda/f$a$b$a$b;->a:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez p4, :cond_3

    sget-object p4, LT/l;->a:LT/l$a;

    invoke-virtual {p4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p4

    if-ne v1, p4, :cond_4

    :cond_3
    new-instance v1, Lda/i;

    invoke-direct {v1, v0}, Lda/i;-><init>(Lcom/ui/core/ui/sso/SSOAccountVM;)V

    invoke-interface {p3, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v1, Lmh/l;

    invoke-interface {p3}, LT/l;->J()V

    invoke-static {p1, v1, p3, p2}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    iget-object p1, p0, Lda/f$a$b$a$b;->b:Landroidx/fragment/app/Fragment;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->O()Landroidx/lifecycle/k;

    move-result-object v2

    const-string p1, "<get-lifecycle>(...)"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x2

    const-class v0, Lea/e;

    const/4 v1, 0x0

    move-object v3, p3

    invoke-static/range {v0 .. v5}, LQ9/h;->m(Ljava/lang/Class;Landroid/os/Bundle;Landroidx/lifecycle/k;LT/l;II)LR9/a;

    move-result-object p1

    check-cast p1, Lea/e;

    const/4 p2, 0x0

    invoke-static {p1, p3, p2}, Lea/d;->d(Lea/e;LT/l;I)V

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

    invoke-virtual {p0, p1, p2, p3, p4}, Lda/f$a$b$a$b;->b(Lq/b;Lf2/k;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
