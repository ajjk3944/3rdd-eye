.class final Lw/i$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/i;->c(Ls/L;Lmh/p;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lw/i;

.field final synthetic c:Ls/L;

.field final synthetic d:Lmh/p;


# direct methods
.method constructor <init>(Lw/i;Ls/L;Lmh/p;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lw/i$a;->b:Lw/i;

    iput-object p2, p0, Lw/i$a;->c:Ls/L;

    iput-object p3, p0, Lw/i$a;->d:Lmh/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance p1, Lw/i$a;

    iget-object v0, p0, Lw/i$a;->b:Lw/i;

    iget-object v1, p0, Lw/i$a;->c:Ls/L;

    iget-object v2, p0, Lw/i$a;->d:Lmh/p;

    invoke-direct {p1, v0, v1, v2, p2}, Lw/i$a;-><init>(Lw/i;Ls/L;Lmh/p;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lw/i$a;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lw/i$a;->a:I

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

    iget-object p1, p0, Lw/i$a;->b:Lw/i;

    invoke-static {p1}, Lw/i;->g(Lw/i;)Ls/M;

    move-result-object p1

    iget-object v1, p0, Lw/i$a;->b:Lw/i;

    invoke-static {v1}, Lw/i;->h(Lw/i;)Lw/v;

    move-result-object v1

    iget-object v3, p0, Lw/i$a;->c:Ls/L;

    new-instance v4, Lw/i$a$a;

    iget-object v5, p0, Lw/i$a;->b:Lw/i;

    iget-object v6, p0, Lw/i$a;->d:Lmh/p;

    const/4 v7, 0x0

    invoke-direct {v4, v5, v6, v7}, Lw/i$a$a;-><init>(Lw/i;Lmh/p;Ldh/e;)V

    iput v2, p0, Lw/i$a;->a:I

    invoke-virtual {p1, v1, v3, v4, p0}, Ls/M;->f(Ljava/lang/Object;Ls/L;Lmh/p;Ldh/e;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lw/i$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lw/i$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lw/i$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
