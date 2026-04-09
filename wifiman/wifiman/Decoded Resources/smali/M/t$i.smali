.class final LM/t$i;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM/t;->n(Ly0/G;LM/i;LF/U;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field b:I

.field private synthetic c:Ljava/lang/Object;

.field final synthetic d:LM/d;

.field final synthetic e:LM/i;

.field final synthetic f:LF/U;


# direct methods
.method constructor <init>(LM/d;LM/i;LF/U;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LM/t$i;->d:LM/d;

    iput-object p2, p0, LM/t$i;->e:LM/i;

    iput-object p3, p0, LM/t$i;->f:LF/U;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 4

    new-instance v0, LM/t$i;

    iget-object v1, p0, LM/t$i;->d:LM/d;

    iget-object v2, p0, LM/t$i;->e:LM/i;

    iget-object v3, p0, LM/t$i;->f:LF/U;

    invoke-direct {v0, v1, v2, v3, p2}, LM/t$i;-><init>(LM/d;LM/i;LF/U;Ldh/e;)V

    iput-object p1, v0, LM/t$i;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly0/b;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LM/t$i;->n(Ly0/b;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LM/t$i;->b:I

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v5, :cond_2

    if-eq v1, v4, :cond_1

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_2
    iget-object v1, p0, LM/t$i;->c:Ljava/lang/Object;

    check-cast v1, Ly0/b;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LM/t$i;->c:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Ly0/b;

    iput-object v1, p0, LM/t$i;->c:Ljava/lang/Object;

    iput v5, p0, LM/t$i;->b:I

    invoke-static {v1, p0}, LM/t;->a(Ly0/b;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    check-cast p1, Ly0/n;

    iget-object v6, p0, LM/t$i;->d:LM/d;

    invoke-virtual {v6, p1}, LM/d;->d(Ly0/n;)V

    invoke-static {p1}, LM/t;->j(Ly0/n;)Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_7

    invoke-virtual {p1}, Ly0/n;->b()I

    move-result v8

    invoke-static {v8}, Ly0/r;->b(I)Z

    move-result v8

    if-eqz v8, :cond_7

    invoke-virtual {p1}, Ly0/n;->c()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v9

    const/4 v10, 0x0

    :goto_2
    if-ge v10, v9, :cond_6

    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ly0/y;

    invoke-virtual {v11}, Ly0/y;->p()Z

    move-result v11

    if-eqz v11, :cond_5

    goto :goto_3

    :cond_5
    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    :cond_6
    iget-object v2, p0, LM/t$i;->e:LM/i;

    iget-object v3, p0, LM/t$i;->d:LM/d;

    iput-object v7, p0, LM/t$i;->c:Ljava/lang/Object;

    iput v4, p0, LM/t$i;->b:I

    invoke-static {v1, v2, v3, p1, p0}, LM/t;->d(Ly0/b;LM/i;LM/d;Ly0/n;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_9

    return-object v0

    :cond_7
    :goto_3
    if-nez v6, :cond_9

    iget-object v4, p0, LM/t$i;->d:LM/d;

    invoke-virtual {v4}, LM/d;->a()I

    move-result v4

    if-ne v4, v5, :cond_8

    iget-object v2, p0, LM/t$i;->f:LF/U;

    iput-object v7, p0, LM/t$i;->c:Ljava/lang/Object;

    iput v3, p0, LM/t$i;->b:I

    invoke-static {v1, v2, p1, p0}, LM/t;->f(Ly0/b;LF/U;Ly0/n;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_9

    return-object v0

    :cond_8
    iget-object v3, p0, LM/t$i;->f:LF/U;

    iput-object v7, p0, LM/t$i;->c:Ljava/lang/Object;

    iput v2, p0, LM/t$i;->b:I

    invoke-static {v1, v3, p1, p0}, LM/t;->g(Ly0/b;LF/U;Ly0/n;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_9

    return-object v0

    :cond_9
    :goto_4
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(Ly0/b;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LM/t$i;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LM/t$i;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LM/t$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
