.class final Lcom/ui/core/ui/sso/d$c$b$a$a$c;
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

.field final synthetic c:LU9/h;

.field final synthetic d:Lf2/w;


# direct methods
.method constructor <init>(Lcom/ui/core/ui/sso/d;Lcom/ui/core/ui/sso/SSOAccountVM;LU9/h;Lf2/w;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/core/ui/sso/d$c$b$a$a$c;->a:Lcom/ui/core/ui/sso/d;

    iput-object p2, p0, Lcom/ui/core/ui/sso/d$c$b$a$a$c;->b:Lcom/ui/core/ui/sso/SSOAccountVM;

    iput-object p3, p0, Lcom/ui/core/ui/sso/d$c$b$a$a$c;->c:LU9/h;

    iput-object p4, p0, Lcom/ui/core/ui/sso/d$c$b$a$a$c;->d:Lf2/w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lf2/w;)LYg/J;
    .locals 0

    invoke-static {p0}, Lcom/ui/core/ui/sso/d$c$b$a$a$c;->e(Lf2/w;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/ui/core/ui/sso/SSOAccountVM;Lf2/w;Lcom/ui/core/ui/sso/UiSSO$a;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ui/core/ui/sso/d$c$b$a$a$c;->f(Lcom/ui/core/ui/sso/SSOAccountVM;Lf2/w;Lcom/ui/core/ui/sso/UiSSO$a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lf2/w;)LYg/J;
    .locals 7

    sget-object v0, Lcom/ui/core/ui/sso/a$c;->a:Lcom/ui/core/ui/sso/a$c;

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/a$c;->a()Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final f(Lcom/ui/core/ui/sso/SSOAccountVM;Lf2/w;Lcom/ui/core/ui/sso/UiSSO$a;)LYg/J;
    .locals 6

    const-string/jumbo v0, "authResponse"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Lcom/ui/core/ui/sso/SSOAccountVM;->u0(Lcom/ui/core/ui/sso/UiSSO$a;)V

    sget-object p0, Lcom/ui/core/ui/sso/a$e;->a:Lcom/ui/core/ui/sso/a$e;

    invoke-virtual {p0}, Lcom/ui/core/ui/sso/a$e;->a()Ljava/lang/String;

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

    const-string/jumbo p2, "com.ui.core.ui.sso.UiSSOAccountFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UiSSOAccountFragment.kt:156)"

    const v0, 0x82b878f

    invoke-static {v0, p4, p1, p2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object v1, p0, Lcom/ui/core/ui/sso/d$c$b$a$a$c;->a:Lcom/ui/core/ui/sso/d;

    iget-object v2, p0, Lcom/ui/core/ui/sso/d$c$b$a$a$c;->b:Lcom/ui/core/ui/sso/SSOAccountVM;

    iget-object v3, p0, Lcom/ui/core/ui/sso/d$c$b$a$a$c;->c:LU9/h;

    const p1, -0x19e8fcac

    invoke-interface {p3, p1}, LT/l;->U(I)V

    iget-object p1, p0, Lcom/ui/core/ui/sso/d$c$b$a$a$c;->d:Lf2/w;

    invoke-interface {p3, p1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result p1

    iget-object p2, p0, Lcom/ui/core/ui/sso/d$c$b$a$a$c;->d:Lf2/w;

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object p4

    if-nez p1, :cond_1

    sget-object p1, LT/l;->a:LT/l$a;

    invoke-virtual {p1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p1

    if-ne p4, p1, :cond_2

    :cond_1
    new-instance p4, Lcom/ui/core/ui/sso/l;

    invoke-direct {p4, p2}, Lcom/ui/core/ui/sso/l;-><init>(Lf2/w;)V

    invoke-interface {p3, p4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    move-object v4, p4

    check-cast v4, Lmh/a;

    invoke-interface {p3}, LT/l;->J()V

    const p1, -0x19e8ea61

    invoke-interface {p3, p1}, LT/l;->U(I)V

    iget-object p1, p0, Lcom/ui/core/ui/sso/d$c$b$a$a$c;->b:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-interface {p3, p1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result p1

    iget-object p2, p0, Lcom/ui/core/ui/sso/d$c$b$a$a$c;->d:Lf2/w;

    invoke-interface {p3, p2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result p2

    or-int/2addr p1, p2

    iget-object p2, p0, Lcom/ui/core/ui/sso/d$c$b$a$a$c;->b:Lcom/ui/core/ui/sso/SSOAccountVM;

    iget-object p4, p0, Lcom/ui/core/ui/sso/d$c$b$a$a$c;->d:Lf2/w;

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    if-nez p1, :cond_3

    sget-object p1, LT/l;->a:LT/l$a;

    invoke-virtual {p1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p1

    if-ne v0, p1, :cond_4

    :cond_3
    new-instance v0, Lcom/ui/core/ui/sso/m;

    invoke-direct {v0, p2, p4}, Lcom/ui/core/ui/sso/m;-><init>(Lcom/ui/core/ui/sso/SSOAccountVM;Lf2/w;)V

    invoke-interface {p3, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    move-object v5, v0

    check-cast v5, Lmh/l;

    invoke-interface {p3}, LT/l;->J()V

    const/4 v7, 0x0

    move-object v6, p3

    invoke-static/range {v1 .. v7}, LU9/y;->C(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;LU9/h;Lmh/a;Lmh/l;LT/l;I)V

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

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/ui/core/ui/sso/d$c$b$a$a$c;->c(Lq/b;Lf2/k;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
