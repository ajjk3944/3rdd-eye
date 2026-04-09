.class final LIi/D0$f;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIi/D0;->getChildren()Lzi/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field b:Ljava/lang/Object;

.field c:Ljava/lang/Object;

.field d:I

.field private synthetic e:Ljava/lang/Object;

.field final synthetic f:LIi/D0;


# direct methods
.method constructor <init>(LIi/D0;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LIi/D0$f;->f:LIi/D0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance v0, LIi/D0$f;

    iget-object v1, p0, LIi/D0$f;->f:LIi/D0;

    invoke-direct {v0, v1, p2}, LIi/D0$f;-><init>(LIi/D0;Ldh/e;)V

    iput-object p1, v0, LIi/D0$f;->e:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lzi/l;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LIi/D0$f;->n(Lzi/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LIi/D0$f;->d:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, LIi/D0$f;->c:Ljava/lang/Object;

    check-cast v1, LNi/n;

    iget-object v3, p0, LIi/D0$f;->b:Ljava/lang/Object;

    check-cast v3, LNi/m;

    iget-object v4, p0, LIi/D0$f;->e:Ljava/lang/Object;

    check-cast v4, Lzi/l;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LIi/D0$f;->e:Ljava/lang/Object;

    check-cast p1, Lzi/l;

    iget-object v1, p0, LIi/D0$f;->f:LIi/D0;

    invoke-virtual {v1}, LIi/D0;->Y()Ljava/lang/Object;

    move-result-object v1

    instance-of v4, v1, LIi/v;

    if-eqz v4, :cond_3

    check-cast v1, LIi/v;

    iget-object v1, v1, LIi/v;->e:LIi/w;

    iput v3, p0, LIi/D0$f;->d:I

    invoke-virtual {p1, v1, p0}, Lzi/l;->d(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_3
    instance-of v3, v1, LIi/u0;

    if-eqz v3, :cond_5

    check-cast v1, LIi/u0;

    invoke-interface {v1}, LIi/u0;->b()LIi/I0;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v1}, LNi/n;->j()Ljava/lang/Object;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, LNi/n;

    move-object v4, p1

    move-object v5, v3

    move-object v3, v1

    move-object v1, v5

    :goto_0
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    instance-of p1, v1, LIi/v;

    if-eqz p1, :cond_4

    move-object p1, v1

    check-cast p1, LIi/v;

    iget-object p1, p1, LIi/v;->e:LIi/w;

    iput-object v4, p0, LIi/D0$f;->e:Ljava/lang/Object;

    iput-object v3, p0, LIi/D0$f;->b:Ljava/lang/Object;

    iput-object v1, p0, LIi/D0$f;->c:Ljava/lang/Object;

    iput v2, p0, LIi/D0$f;->d:I

    invoke-virtual {v4, p1, p0}, Lzi/l;->d(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    invoke-virtual {v1}, LNi/n;->k()LNi/n;

    move-result-object v1

    goto :goto_0

    :cond_5
    :goto_2
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(Lzi/l;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LIi/D0$f;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LIi/D0$f;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LIi/D0$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
