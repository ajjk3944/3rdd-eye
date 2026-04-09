.class final Landroidx/lifecycle/A$a$a$a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/lifecycle/A$a$a$a;->j(Landroidx/lifecycle/o;Landroidx/lifecycle/k$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field c:I

.field final synthetic d:LTi/a;

.field final synthetic e:Lmh/p;


# direct methods
.method constructor <init>(LTi/a;Lmh/p;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/lifecycle/A$a$a$a$a;->d:LTi/a;

    iput-object p2, p0, Landroidx/lifecycle/A$a$a$a$a;->e:Lmh/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance p1, Landroidx/lifecycle/A$a$a$a$a;

    iget-object v0, p0, Landroidx/lifecycle/A$a$a$a$a;->d:LTi/a;

    iget-object v1, p0, Landroidx/lifecycle/A$a$a$a$a;->e:Lmh/p;

    invoke-direct {p1, v0, v1, p2}, Landroidx/lifecycle/A$a$a$a$a;-><init>(LTi/a;Lmh/p;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Landroidx/lifecycle/A$a$a$a$a;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Landroidx/lifecycle/A$a$a$a$a;->c:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Landroidx/lifecycle/A$a$a$a$a;->a:Ljava/lang/Object;

    check-cast v0, LTi/a;

    :try_start_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Landroidx/lifecycle/A$a$a$a$a;->b:Ljava/lang/Object;

    check-cast v1, Lmh/p;

    iget-object v3, p0, Landroidx/lifecycle/A$a$a$a$a;->a:Ljava/lang/Object;

    check-cast v3, LTi/a;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    move-object p1, v3

    goto :goto_0

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/lifecycle/A$a$a$a$a;->d:LTi/a;

    iget-object v1, p0, Landroidx/lifecycle/A$a$a$a$a;->e:Lmh/p;

    iput-object p1, p0, Landroidx/lifecycle/A$a$a$a$a;->a:Ljava/lang/Object;

    iput-object v1, p0, Landroidx/lifecycle/A$a$a$a$a;->b:Ljava/lang/Object;

    iput v3, p0, Landroidx/lifecycle/A$a$a$a$a;->c:I

    invoke-interface {p1, v4, p0}, LTi/a;->a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    :try_start_1
    new-instance v3, Landroidx/lifecycle/A$a$a$a$a$a;

    invoke-direct {v3, v1, v4}, Landroidx/lifecycle/A$a$a$a$a$a;-><init>(Lmh/p;Ldh/e;)V

    iput-object p1, p0, Landroidx/lifecycle/A$a$a$a$a;->a:Ljava/lang/Object;

    iput-object v4, p0, Landroidx/lifecycle/A$a$a$a$a;->b:Ljava/lang/Object;

    iput v2, p0, Landroidx/lifecycle/A$a$a$a$a;->c:I

    invoke-static {v3, p0}, LIi/O;->g(Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v1, v0, :cond_4

    return-object v0

    :cond_4
    move-object v0, p1

    :goto_1
    :try_start_2
    sget-object p1, LYg/J;->a:LYg/J;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-interface {v0, v4}, LTi/a;->d(Ljava/lang/Object;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :catchall_1
    move-exception v0

    move-object v5, v0

    move-object v0, p1

    move-object p1, v5

    :goto_2
    invoke-interface {v0, v4}, LTi/a;->d(Ljava/lang/Object;)V

    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/lifecycle/A$a$a$a$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Landroidx/lifecycle/A$a$a$a$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/A$a$a$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
