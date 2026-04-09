.class final LJ/b$a;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ/b;->a(Ly0/G;LJ/c;Lmh/a;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field b:Ljava/lang/Object;

.field c:I

.field private synthetic d:Ljava/lang/Object;

.field final synthetic e:LJ/c;

.field final synthetic f:Lmh/a;


# direct methods
.method constructor <init>(LJ/c;Lmh/a;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LJ/b$a;->e:LJ/c;

    iput-object p2, p0, LJ/b$a;->f:Lmh/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance v0, LJ/b$a;

    iget-object v1, p0, LJ/b$a;->e:LJ/c;

    iget-object v2, p0, LJ/b$a;->f:Lmh/a;

    invoke-direct {v0, v1, v2, p2}, LJ/b$a;-><init>(LJ/c;Lmh/a;Ldh/e;)V

    iput-object p1, v0, LJ/b$a;->d:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly0/b;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LJ/b$a;->n(Ly0/b;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LJ/b$a;->c:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, LJ/b$a;->b:Ljava/lang/Object;

    check-cast v1, Ly0/y;

    iget-object v4, p0, LJ/b$a;->d:Ljava/lang/Object;

    check-cast v4, Ly0/b;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, LJ/b$a;->d:Ljava/lang/Object;

    check-cast v1, Ly0/b;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LJ/b$a;->d:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Ly0/b;

    iput-object v1, p0, LJ/b$a;->d:Ljava/lang/Object;

    iput v3, p0, LJ/b$a;->c:I

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x2

    const/4 v9, 0x0

    move-object v4, v1

    move-object v7, p0

    invoke-static/range {v4 .. v9}, Lw/B;->f(Ly0/b;ZLy0/p;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    check-cast p1, Ly0/y;

    iget-object v4, p0, LJ/b$a;->e:LJ/c;

    invoke-virtual {p1}, Ly0/y;->h()J

    move-result-wide v5

    invoke-interface {v4, v5, v6}, LJ/c;->a(J)V

    iget-object v4, p0, LJ/b$a;->f:Lmh/a;

    if-eqz v4, :cond_7

    move-object v4, v1

    move-object v1, p1

    :goto_1
    iput-object v4, p0, LJ/b$a;->d:Ljava/lang/Object;

    iput-object v1, p0, LJ/b$a;->b:Ljava/lang/Object;

    iput v2, p0, LJ/b$a;->c:I

    const/4 p1, 0x0

    invoke-static {v4, p1, p0, v3, p1}, Ly0/b;->s1(Ly0/b;Ly0/p;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_2
    check-cast p1, Ly0/n;

    invoke-virtual {p1}, Ly0/n;->c()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v5

    const/4 v6, 0x0

    :goto_3
    if-ge v6, v5, :cond_6

    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ly0/y;

    invoke-virtual {v7}, Ly0/y;->f()J

    move-result-wide v8

    invoke-virtual {v1}, Ly0/y;->f()J

    move-result-wide v10

    invoke-static {v8, v9, v10, v11}, Ly0/x;->d(JJ)Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-virtual {v7}, Ly0/y;->i()Z

    move-result v7

    if-eqz v7, :cond_5

    goto :goto_1

    :cond_5
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_6
    iget-object p1, p0, LJ/b$a;->f:Lmh/a;

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    :cond_7
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(Ly0/b;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LJ/b$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LJ/b$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LJ/b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
