.class final LPi/d$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LPi/d;->r(LLi/h;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:LLi/h;

.field final synthetic d:LPi/d;


# direct methods
.method constructor <init>(LLi/h;LPi/d;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LPi/d$b;->c:LLi/h;

    iput-object p2, p0, LPi/d$b;->d:LPi/d;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance v0, LPi/d$b;

    iget-object v1, p0, LPi/d$b;->c:LLi/h;

    iget-object v2, p0, LPi/d$b;->d:LPi/d;

    invoke-direct {v0, v1, v2, p2}, LPi/d$b;-><init>(LLi/h;LPi/d;Ldh/e;)V

    iput-object p1, v0, LPi/d$b;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LPi/d$b;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LPi/d$b;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LPi/d$b;->b:Ljava/lang/Object;

    check-cast p1, LIi/N;

    iget-object v1, p0, LPi/d$b;->c:LLi/h;

    iget-object v3, p0, LPi/d$b;->d:LPi/d;

    iget-object v4, v3, LMi/d;->a:Ldh/i;

    invoke-static {p1, v4}, LIi/O;->j(LIi/N;Ldh/i;)LIi/N;

    move-result-object p1

    invoke-virtual {v3, p1}, LMi/d;->o(LIi/N;)LKi/v;

    move-result-object p1

    iput v2, p0, LPi/d$b;->a:I

    invoke-static {v1, p1, p0}, LLi/i;->s(LLi/h;LKi/v;Ldh/e;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, LPi/d$b;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LPi/d$b;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LPi/d$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
