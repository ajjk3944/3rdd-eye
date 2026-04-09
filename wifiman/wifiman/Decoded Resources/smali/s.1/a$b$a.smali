.class final Ls/a$b$a;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls/a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field b:I

.field private synthetic c:Ljava/lang/Object;

.field final synthetic d:Ls/a;


# direct methods
.method constructor <init>(Ls/a;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Ls/a$b$a;->d:Ls/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance v0, Ls/a$b$a;

    iget-object v1, p0, Ls/a$b$a;->d:Ls/a;

    invoke-direct {v0, v1, p2}, Ls/a$b$a;-><init>(Ls/a;Ldh/e;)V

    iput-object p1, v0, Ls/a$b$a;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly0/b;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Ls/a$b$a;->n(Ly0/b;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Ls/a$b$a;->b:I

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Ls/a$b$a;->c:Ljava/lang/Object;

    check-cast v1, Ly0/b;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Ls/a$b$a;->c:Ljava/lang/Object;

    check-cast v1, Ly0/b;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Ls/a$b$a;->c:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Ly0/b;

    iput-object v1, p0, Ls/a$b$a;->c:Ljava/lang/Object;

    iput v4, p0, Ls/a$b$a;->b:I

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x2

    const/4 v10, 0x0

    move-object v5, v1

    move-object v8, p0

    invoke-static/range {v5 .. v10}, Lw/B;->f(Ly0/b;ZLy0/p;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    check-cast p1, Ly0/y;

    iget-object v5, p0, Ls/a$b$a;->d:Ls/a;

    invoke-virtual {p1}, Ly0/y;->f()J

    move-result-wide v6

    invoke-static {v6, v7}, Ly0/x;->a(J)Ly0/x;

    move-result-object v6

    invoke-static {v5, v6}, Ls/a;->f(Ls/a;Ly0/x;)V

    iget-object v5, p0, Ls/a$b$a;->d:Ls/a;

    invoke-virtual {p1}, Ly0/y;->h()J

    move-result-wide v6

    invoke-static {v6, v7}, Ll0/g;->d(J)Ll0/g;

    move-result-object p1

    invoke-static {v5, p1}, Ls/a;->g(Ls/a;Ll0/g;)V

    :cond_4
    iput-object v1, p0, Ls/a$b$a;->c:Ljava/lang/Object;

    iput v2, p0, Ls/a$b$a;->b:I

    invoke-static {v1, v3, p0, v4, v3}, Ly0/b;->s1(Ly0/b;Ly0/p;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_1
    check-cast p1, Ly0/n;

    invoke-virtual {p1}, Ly0/n;->c()Ljava/util/List;

    move-result-object p1

    new-instance v5, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v6

    const/4 v7, 0x0

    move v8, v7

    :goto_2
    if-ge v8, v6, :cond_7

    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Ly0/y;

    invoke-virtual {v10}, Ly0/y;->i()Z

    move-result v10

    if-eqz v10, :cond_6

    invoke-interface {v5, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_6
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_7
    iget-object p1, p0, Ls/a$b$a;->d:Ls/a;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    :goto_3
    if-ge v7, v6, :cond_9

    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Ly0/y;

    invoke-virtual {v9}, Ly0/y;->f()J

    move-result-wide v9

    invoke-static {p1}, Ls/a;->e(Ls/a;)Ly0/x;

    move-result-object v11

    invoke-static {v9, v10, v11}, Ly0/x;->c(JLjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    goto :goto_4

    :cond_8
    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_9
    move-object v8, v3

    :goto_4
    check-cast v8, Ly0/y;

    if-nez v8, :cond_a

    invoke-static {v5}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    move-object v8, p1

    check-cast v8, Ly0/y;

    :cond_a
    if-eqz v8, :cond_b

    iget-object p1, p0, Ls/a$b$a;->d:Ls/a;

    invoke-virtual {v8}, Ly0/y;->f()J

    move-result-wide v6

    invoke-static {v6, v7}, Ly0/x;->a(J)Ly0/x;

    move-result-object v6

    invoke-static {p1, v6}, Ls/a;->f(Ls/a;Ly0/x;)V

    iget-object p1, p0, Ls/a$b$a;->d:Ls/a;

    invoke-virtual {v8}, Ly0/y;->h()J

    move-result-wide v6

    invoke-static {v6, v7}, Ll0/g;->d(J)Ll0/g;

    move-result-object v6

    invoke-static {p1, v6}, Ls/a;->g(Ls/a;Ll0/g;)V

    :cond_b
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Ls/a$b$a;->d:Ls/a;

    invoke-static {p1, v3}, Ls/a;->f(Ls/a;Ly0/x;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(Ly0/b;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Ls/a$b$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Ls/a$b$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Ls/a$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
