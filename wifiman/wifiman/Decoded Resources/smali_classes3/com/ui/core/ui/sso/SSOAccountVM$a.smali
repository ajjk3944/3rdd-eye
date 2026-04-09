.class final Lcom/ui/core/ui/sso/SSOAccountVM$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/core/ui/sso/SSOAccountVM;-><init>(Lcom/ui/sso/api/UiAccountApi$b;Landroidx/lifecycle/E;LP9/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lcom/ui/core/ui/sso/SSOAccountVM;


# direct methods
.method constructor <init>(Lcom/ui/core/ui/sso/SSOAccountVM;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/core/ui/sso/SSOAccountVM$a;->b:Lcom/ui/core/ui/sso/SSOAccountVM;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 1

    new-instance p1, Lcom/ui/core/ui/sso/SSOAccountVM$a;

    iget-object v0, p0, Lcom/ui/core/ui/sso/SSOAccountVM$a;->b:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-direct {p1, v0, p2}, Lcom/ui/core/ui/sso/SSOAccountVM$a;-><init>(Lcom/ui/core/ui/sso/SSOAccountVM;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lcom/ui/core/ui/sso/SSOAccountVM$a;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/ui/core/ui/sso/SSOAccountVM$a;->a:I

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

    iget-object p1, p0, Lcom/ui/core/ui/sso/SSOAccountVM$a;->b:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-static {p1}, Lcom/ui/core/ui/sso/SSOAccountVM;->j0(Lcom/ui/core/ui/sso/SSOAccountVM;)Lcom/ui/sso/api/UiAccountApi$b;

    move-result-object p1

    sget-object v1, LIi/s0;->a:LIi/s0;

    invoke-interface {p1, v1}, Lcom/ui/sso/api/UiAccountApi$b;->a(LIi/N;)LLi/g;

    move-result-object p1

    iput v2, p0, Lcom/ui/core/ui/sso/SSOAccountVM$a;->a:I

    invoke-static {p1, p0}, LLi/i;->x(LLi/g;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    return-object p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/ui/core/ui/sso/SSOAccountVM$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lcom/ui/core/ui/sso/SSOAccountVM$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lcom/ui/core/ui/sso/SSOAccountVM$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
