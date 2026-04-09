.class final Lcom/ui/core/ui/sso/d$c$b$a$b$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/core/ui/sso/d$c$b$a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lcom/ui/core/ui/sso/SSOAccountVM;

.field final synthetic c:Lcom/ui/core/ui/sso/d;


# direct methods
.method constructor <init>(Lcom/ui/core/ui/sso/SSOAccountVM;Lcom/ui/core/ui/sso/d;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/core/ui/sso/d$c$b$a$b$a;->b:Lcom/ui/core/ui/sso/SSOAccountVM;

    iput-object p2, p0, Lcom/ui/core/ui/sso/d$c$b$a$b$a;->c:Lcom/ui/core/ui/sso/d;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance p1, Lcom/ui/core/ui/sso/d$c$b$a$b$a;

    iget-object v0, p0, Lcom/ui/core/ui/sso/d$c$b$a$b$a;->b:Lcom/ui/core/ui/sso/SSOAccountVM;

    iget-object v1, p0, Lcom/ui/core/ui/sso/d$c$b$a$b$a;->c:Lcom/ui/core/ui/sso/d;

    invoke-direct {p1, v0, v1, p2}, Lcom/ui/core/ui/sso/d$c$b$a$b$a;-><init>(Lcom/ui/core/ui/sso/SSOAccountVM;Lcom/ui/core/ui/sso/d;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lcom/ui/core/ui/sso/d$c$b$a$b$a;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/ui/core/ui/sso/d$c$b$a$b$a;->a:I

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

    iget-object p1, p0, Lcom/ui/core/ui/sso/d$c$b$a$b$a;->b:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-virtual {p1}, Lcom/ui/core/ui/sso/SSOAccountVM;->q0()LLi/g;

    move-result-object p1

    new-instance v1, Lcom/ui/core/ui/sso/d$c$b$a$b$a$a;

    iget-object v3, p0, Lcom/ui/core/ui/sso/d$c$b$a$b$a;->c:Lcom/ui/core/ui/sso/d;

    invoke-direct {v1, v3}, Lcom/ui/core/ui/sso/d$c$b$a$b$a$a;-><init>(Lcom/ui/core/ui/sso/d;)V

    iput v2, p0, Lcom/ui/core/ui/sso/d$c$b$a$b$a;->a:I

    invoke-interface {p1, v1, p0}, LLi/g;->b(LLi/h;Ldh/e;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/ui/core/ui/sso/d$c$b$a$b$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lcom/ui/core/ui/sso/d$c$b$a$b$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lcom/ui/core/ui/sso/d$c$b$a$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
