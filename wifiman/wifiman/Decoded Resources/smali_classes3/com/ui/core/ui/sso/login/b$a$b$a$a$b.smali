.class final Lcom/ui/core/ui/sso/login/b$a$b$a$a$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/core/ui/sso/login/b$a$b$a$a;->c(Lq/b;Lf2/k;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Landroidx/fragment/app/Fragment;

.field final synthetic c:Lcom/ui/core/ui/sso/login/g;

.field final synthetic d:Lmh/l;


# direct methods
.method constructor <init>(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/login/g;Lmh/l;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/core/ui/sso/login/b$a$b$a$a$b;->b:Landroidx/fragment/app/Fragment;

    iput-object p2, p0, Lcom/ui/core/ui/sso/login/b$a$b$a$a$b;->c:Lcom/ui/core/ui/sso/login/g;

    iput-object p3, p0, Lcom/ui/core/ui/sso/login/b$a$b$a$a$b;->d:Lmh/l;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance p1, Lcom/ui/core/ui/sso/login/b$a$b$a$a$b;

    iget-object v0, p0, Lcom/ui/core/ui/sso/login/b$a$b$a$a$b;->b:Landroidx/fragment/app/Fragment;

    iget-object v1, p0, Lcom/ui/core/ui/sso/login/b$a$b$a$a$b;->c:Lcom/ui/core/ui/sso/login/g;

    iget-object v2, p0, Lcom/ui/core/ui/sso/login/b$a$b$a$a$b;->d:Lmh/l;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/ui/core/ui/sso/login/b$a$b$a$a$b;-><init>(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/login/g;Lmh/l;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lcom/ui/core/ui/sso/login/b$a$b$a$a$b;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/ui/core/ui/sso/login/b$a$b$a$a$b;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/ui/core/ui/sso/login/b$a$b$a$a$b;->b:Landroidx/fragment/app/Fragment;

    sget-object v1, Landroidx/lifecycle/k$b;->STARTED:Landroidx/lifecycle/k$b;

    new-instance v3, Lcom/ui/core/ui/sso/login/b$a$b$a$a$b$a;

    iget-object v4, p0, Lcom/ui/core/ui/sso/login/b$a$b$a$a$b;->c:Lcom/ui/core/ui/sso/login/g;

    iget-object v5, p0, Lcom/ui/core/ui/sso/login/b$a$b$a$a$b;->d:Lmh/l;

    const/4 v6, 0x0

    invoke-direct {v3, v4, v5, v6}, Lcom/ui/core/ui/sso/login/b$a$b$a$a$b$a;-><init>(Lcom/ui/core/ui/sso/login/g;Lmh/l;Ldh/e;)V

    iput v2, p0, Lcom/ui/core/ui/sso/login/b$a$b$a$a$b;->a:I

    invoke-static {p1, v1, v3, p0}, Landroidx/lifecycle/A;->b(Landroidx/lifecycle/o;Landroidx/lifecycle/k$b;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/ui/core/ui/sso/login/b$a$b$a$a$b;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lcom/ui/core/ui/sso/login/b$a$b$a$a$b;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lcom/ui/core/ui/sso/login/b$a$b$a$a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
