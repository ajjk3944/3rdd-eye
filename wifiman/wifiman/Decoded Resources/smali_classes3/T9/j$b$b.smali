.class final LT9/j$b$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT9/j$b;->b(LA9/i;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Lcom/ui/core/ui/sso/login/g;


# direct methods
.method constructor <init>(Lcom/ui/core/ui/sso/login/g;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LT9/j$b$b;->c:Lcom/ui/core/ui/sso/login/g;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance v0, LT9/j$b$b;

    iget-object v1, p0, LT9/j$b$b;->c:Lcom/ui/core/ui/sso/login/g;

    invoke-direct {v0, v1, p2}, LT9/j$b$b;-><init>(Lcom/ui/core/ui/sso/login/g;Ldh/e;)V

    iput-object p1, v0, LT9/j$b$b;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LT9/j$b$b;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, LT9/j$b$b;->a:I

    if-nez v0, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LT9/j$b$b;->b:Ljava/lang/Object;

    check-cast p1, LIi/N;

    iget-object v0, p0, LT9/j$b$b;->c:Lcom/ui/core/ui/sso/login/g;

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/login/g;->l0()LH/l;

    move-result-object v0

    invoke-static {v0}, Lja/b;->b(LH/l;)LLi/g;

    move-result-object v0

    iget-object v1, p0, LT9/j$b$b;->c:Lcom/ui/core/ui/sso/login/g;

    invoke-virtual {v1}, Lcom/ui/core/ui/sso/login/g;->k0()LH/l;

    move-result-object v1

    invoke-static {v1}, Lja/b;->b(LH/l;)LLi/g;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [LLi/g;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    invoke-static {v2}, LLi/i;->G([LLi/g;)LLi/g;

    move-result-object v0

    new-instance v1, LT9/j$b$b$a;

    iget-object v2, p0, LT9/j$b$b;->c:Lcom/ui/core/ui/sso/login/g;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, LT9/j$b$b$a;-><init>(Lcom/ui/core/ui/sso/login/g;Ldh/e;)V

    invoke-static {v0, v1}, LLi/i;->I(LLi/g;Lmh/p;)LLi/g;

    move-result-object v0

    invoke-static {v0, p1}, LLi/i;->D(LLi/g;LIi/N;)LIi/y0;

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LT9/j$b$b;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LT9/j$b$b;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LT9/j$b$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
