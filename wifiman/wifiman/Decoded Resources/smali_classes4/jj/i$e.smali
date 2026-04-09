.class final Ljj/i$e;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljj/i;->J(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Ljj/i;

.field final synthetic c:Ljava/lang/Object;

.field final synthetic d:Ljava/lang/Object;


# direct methods
.method constructor <init>(Ljj/i;Ljava/lang/Object;Ljava/lang/Object;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Ljj/i$e;->b:Ljj/i;

    iput-object p2, p0, Ljj/i$e;->c:Ljava/lang/Object;

    iput-object p3, p0, Ljj/i$e;->d:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance p1, Ljj/i$e;

    iget-object v0, p0, Ljj/i$e;->b:Ljj/i;

    iget-object v1, p0, Ljj/i$e;->c:Ljava/lang/Object;

    iget-object v2, p0, Ljj/i$e;->d:Ljava/lang/Object;

    invoke-direct {p1, v0, v1, v2, p2}, Ljj/i$e;-><init>(Ljj/i;Ljava/lang/Object;Ljava/lang/Object;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Ljj/i$e;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Ljj/i$e;->a:I

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

    iget-object p1, p0, Ljj/i$e;->b:Ljj/i;

    invoke-static {p1}, Ljj/i;->f(Ljj/i;)Lmh/p;

    move-result-object p1

    new-instance v1, Ljj/d;

    iget-object v3, p0, Ljj/i$e;->b:Ljj/i;

    iget-object v4, p0, Ljj/i$e;->c:Ljava/lang/Object;

    invoke-virtual {v3, v4}, Ljj/i;->x(Ljava/lang/Object;)I

    move-result v3

    iget-object v4, p0, Ljj/i$e;->b:Ljj/i;

    iget-object v5, p0, Ljj/i$e;->c:Ljava/lang/Object;

    invoke-virtual {v4, v5}, Ljj/i;->y(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-direct {v1, v3, v4}, Ljj/d;-><init>(ILjava/lang/Object;)V

    new-instance v3, Ljj/d;

    iget-object v4, p0, Ljj/i$e;->b:Ljj/i;

    iget-object v5, p0, Ljj/i$e;->d:Ljava/lang/Object;

    invoke-virtual {v4, v5}, Ljj/i;->x(Ljava/lang/Object;)I

    move-result v4

    iget-object v5, p0, Ljj/i$e;->b:Ljj/i;

    iget-object v6, p0, Ljj/i$e;->d:Ljava/lang/Object;

    invoke-virtual {v5, v6}, Ljj/i;->y(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Ljj/d;-><init>(ILjava/lang/Object;)V

    invoke-interface {p1, v1, v3}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Ljj/i$e;->b:Ljj/i;

    invoke-virtual {p1}, Ljj/i;->t()I

    move-result v1

    iget-object v3, p0, Ljj/i$e;->b:Ljj/i;

    invoke-virtual {v3}, Ljj/i;->u()I

    move-result v3

    iput v2, p0, Ljj/i$e;->a:I

    invoke-virtual {p1, v1, v3, p0}, Ljj/i;->M(IILdh/e;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Ljj/i$e;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Ljj/i$e;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Ljj/i$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
