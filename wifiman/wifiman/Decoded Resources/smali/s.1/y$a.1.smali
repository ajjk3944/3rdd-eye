.class final Ls/y$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls/y;->E2(Ly/m;Ly/j;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Ly/m;

.field final synthetic c:Ly/j;

.field final synthetic d:LIi/e0;


# direct methods
.method constructor <init>(Ly/m;Ly/j;LIi/e0;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Ls/y$a;->b:Ly/m;

    iput-object p2, p0, Ls/y$a;->c:Ly/j;

    iput-object p3, p0, Ls/y$a;->d:LIi/e0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance p1, Ls/y$a;

    iget-object v0, p0, Ls/y$a;->b:Ly/m;

    iget-object v1, p0, Ls/y$a;->c:Ly/j;

    iget-object v2, p0, Ls/y$a;->d:LIi/e0;

    invoke-direct {p1, v0, v1, v2, p2}, Ls/y$a;-><init>(Ly/m;Ly/j;LIi/e0;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Ls/y$a;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Ls/y$a;->a:I

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

    iget-object p1, p0, Ls/y$a;->b:Ly/m;

    iget-object v1, p0, Ls/y$a;->c:Ly/j;

    iput v2, p0, Ls/y$a;->a:I

    invoke-interface {p1, v1, p0}, Ly/m;->a(Ly/j;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, Ls/y$a;->d:LIi/e0;

    if-eqz p1, :cond_3

    invoke-interface {p1}, LIi/e0;->dispose()V

    :cond_3
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Ls/y$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Ls/y$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Ls/y$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
