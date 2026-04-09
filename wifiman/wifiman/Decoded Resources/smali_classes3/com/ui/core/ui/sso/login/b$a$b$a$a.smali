.class final Lcom/ui/core/ui/sso/login/b$a$b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/core/ui/sso/login/b$a$b$a;->b(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lmh/a;

.field final synthetic d:Z

.field final synthetic e:Lcom/ui/core/ui/sso/SSOAccountVM;

.field final synthetic f:Lf2/w;

.field final synthetic g:Landroidx/fragment/app/Fragment;

.field final synthetic h:Lmh/l;


# direct methods
.method constructor <init>(ZLjava/lang/String;Lmh/a;ZLcom/ui/core/ui/sso/SSOAccountVM;Lf2/w;Landroidx/fragment/app/Fragment;Lmh/l;)V
    .locals 0

    iput-boolean p1, p0, Lcom/ui/core/ui/sso/login/b$a$b$a$a;->a:Z

    iput-object p2, p0, Lcom/ui/core/ui/sso/login/b$a$b$a$a;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/ui/core/ui/sso/login/b$a$b$a$a;->c:Lmh/a;

    iput-boolean p4, p0, Lcom/ui/core/ui/sso/login/b$a$b$a$a;->d:Z

    iput-object p5, p0, Lcom/ui/core/ui/sso/login/b$a$b$a$a;->e:Lcom/ui/core/ui/sso/SSOAccountVM;

    iput-object p6, p0, Lcom/ui/core/ui/sso/login/b$a$b$a$a;->f:Lf2/w;

    iput-object p7, p0, Lcom/ui/core/ui/sso/login/b$a$b$a$a;->g:Landroidx/fragment/app/Fragment;

    iput-object p8, p0, Lcom/ui/core/ui/sso/login/b$a$b$a$a;->h:Lmh/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lmh/a;)LYg/J;
    .locals 0

    invoke-static {p0}, Lcom/ui/core/ui/sso/login/b$a$b$a$a;->e(Lmh/a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/ui/core/ui/sso/SSOAccountVM;LT/L;)LT/K;
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/core/ui/sso/login/b$a$b$a$a;->f(Lcom/ui/core/ui/sso/SSOAccountVM;LT/L;)LT/K;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lmh/a;)LYg/J;
    .locals 0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lmh/a;->invoke()Ljava/lang/Object;

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final f(Lcom/ui/core/ui/sso/SSOAccountVM;LT/L;)LT/K;
    .locals 1

    const-string v0, "$this$DisposableEffect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/ui/core/ui/sso/login/b$a$b$a$a$c;

    invoke-direct {p1, p0}, Lcom/ui/core/ui/sso/login/b$a$b$a$a$c;-><init>(Lcom/ui/core/ui/sso/SSOAccountVM;)V

    return-object p1
.end method


# virtual methods
.method public final c(Lq/b;Lf2/k;LT/l;I)V
    .locals 8

    const-string v0, "$this$composable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p1, "it"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string/jumbo v0, "com.ui.core.ui.sso.login.UiLogin.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UiLogin.kt:65)"

    const v1, 0x2623720f

    invoke-static {v1, p4, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    shr-int/lit8 p1, p4, 0x3

    and-int/lit8 p1, p1, 0xe

    const-class p4, Lcom/ui/core/ui/sso/login/g;

    invoke-static {p2, p4, p3, p1}, LQ9/h;->l(Lf2/k;Ljava/lang/Class;LT/l;I)LR9/a;

    move-result-object p1

    check-cast p1, Lcom/ui/core/ui/sso/login/g;

    iget-boolean v1, p0, Lcom/ui/core/ui/sso/login/b$a$b$a$a;->a:Z

    iget-object v2, p0, Lcom/ui/core/ui/sso/login/b$a$b$a$a;->b:Ljava/lang/String;

    const p2, -0x6dd2bf2d

    invoke-interface {p3, p2}, LT/l;->U(I)V

    iget-object p2, p0, Lcom/ui/core/ui/sso/login/b$a$b$a$a;->c:Lmh/a;

    invoke-interface {p3, p2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p2

    iget-object p4, p0, Lcom/ui/core/ui/sso/login/b$a$b$a$a;->c:Lmh/a;

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    if-nez p2, :cond_1

    sget-object p2, LT/l;->a:LT/l$a;

    invoke-virtual {p2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p2

    if-ne v0, p2, :cond_2

    :cond_1
    new-instance v0, Lcom/ui/core/ui/sso/login/d;

    invoke-direct {v0, p4}, Lcom/ui/core/ui/sso/login/d;-><init>(Lmh/a;)V

    invoke-interface {p3, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    move-object v3, v0

    check-cast v3, Lmh/a;

    invoke-interface {p3}, LT/l;->J()V

    iget-boolean v4, p0, Lcom/ui/core/ui/sso/login/b$a$b$a$a;->d:Z

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p1

    move-object v5, p3

    invoke-static/range {v0 .. v7}, LT9/j;->h(Lcom/ui/core/ui/sso/login/g;ZLjava/lang/String;Lmh/a;ZLT/l;II)V

    const p2, -0x6dd2a95e

    invoke-interface {p3, p2}, LT/l;->U(I)V

    iget-object p2, p0, Lcom/ui/core/ui/sso/login/b$a$b$a$a;->e:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-interface {p3, p2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result p2

    iget-object p4, p0, Lcom/ui/core/ui/sso/login/b$a$b$a$a;->e:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-nez p2, :cond_3

    sget-object p2, LT/l;->a:LT/l$a;

    invoke-virtual {p2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p2

    if-ne v0, p2, :cond_4

    :cond_3
    new-instance v0, Lcom/ui/core/ui/sso/login/b$a$b$a$a$a;

    invoke-direct {v0, p4, v1}, Lcom/ui/core/ui/sso/login/b$a$b$a$a$a;-><init>(Lcom/ui/core/ui/sso/SSOAccountVM;Ldh/e;)V

    invoke-interface {p3, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v0, Lmh/p;

    invoke-interface {p3}, LT/l;->J()V

    const-string/jumbo p2, "login"

    const/4 p4, 0x6

    invoke-static {p2, v0, p3, p4}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    const v0, -0x6dd293d5

    invoke-interface {p3, v0}, LT/l;->U(I)V

    iget-object v0, p0, Lcom/ui/core/ui/sso/login/b$a$b$a$a;->e:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-interface {p3, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    iget-object v2, p0, Lcom/ui/core/ui/sso/login/b$a$b$a$a;->e:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_5

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v3, v0, :cond_6

    :cond_5
    new-instance v3, Lcom/ui/core/ui/sso/login/e;

    invoke-direct {v3, v2}, Lcom/ui/core/ui/sso/login/e;-><init>(Lcom/ui/core/ui/sso/SSOAccountVM;)V

    invoke-interface {p3, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    check-cast v3, Lmh/l;

    invoke-interface {p3}, LT/l;->J()V

    invoke-static {p2, v3, p3, p4}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    iget-object p2, p0, Lcom/ui/core/ui/sso/login/b$a$b$a$a;->f:Lf2/w;

    const p4, -0x6dd273a4

    invoke-interface {p3, p4}, LT/l;->U(I)V

    iget-object p4, p0, Lcom/ui/core/ui/sso/login/b$a$b$a$a;->g:Landroidx/fragment/app/Fragment;

    invoke-interface {p3, p4}, LT/l;->l(Ljava/lang/Object;)Z

    move-result p4

    invoke-interface {p3, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p4, v0

    iget-object v0, p0, Lcom/ui/core/ui/sso/login/b$a$b$a$a;->h:Lmh/l;

    invoke-interface {p3, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p4, v0

    iget-object v0, p0, Lcom/ui/core/ui/sso/login/b$a$b$a$a;->g:Landroidx/fragment/app/Fragment;

    iget-object v2, p0, Lcom/ui/core/ui/sso/login/b$a$b$a$a;->h:Lmh/l;

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez p4, :cond_7

    sget-object p4, LT/l;->a:LT/l$a;

    invoke-virtual {p4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p4

    if-ne v3, p4, :cond_8

    :cond_7
    new-instance v3, Lcom/ui/core/ui/sso/login/b$a$b$a$a$b;

    invoke-direct {v3, v0, p1, v2, v1}, Lcom/ui/core/ui/sso/login/b$a$b$a$a$b;-><init>(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/login/g;Lmh/l;Ldh/e;)V

    invoke-interface {p3, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
    check-cast v3, Lmh/p;

    invoke-interface {p3}, LT/l;->J()V

    const/4 p1, 0x0

    invoke-static {p2, v3, p3, p1}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-static {}, LT/o;->P()V

    :cond_9
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

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/ui/core/ui/sso/login/b$a$b$a$a;->c(Lq/b;Lf2/k;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
