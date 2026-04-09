.class final Lf0/k$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf0/k;->d(Ljava/util/concurrent/atomic/AtomicReference;Lmh/l;Lmh/p;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Lmh/l;

.field final synthetic d:Ljava/util/concurrent/atomic/AtomicReference;

.field final synthetic e:Lmh/p;


# direct methods
.method constructor <init>(Lmh/l;Ljava/util/concurrent/atomic/AtomicReference;Lmh/p;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lf0/k$b;->c:Lmh/l;

    iput-object p2, p0, Lf0/k$b;->d:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p3, p0, Lf0/k$b;->e:Lmh/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 4

    new-instance v0, Lf0/k$b;

    iget-object v1, p0, Lf0/k$b;->c:Lmh/l;

    iget-object v2, p0, Lf0/k$b;->d:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v3, p0, Lf0/k$b;->e:Lmh/p;

    invoke-direct {v0, v1, v2, v3, p2}, Lf0/k$b;-><init>(Lmh/l;Ljava/util/concurrent/atomic/AtomicReference;Lmh/p;Ldh/e;)V

    iput-object p1, v0, Lf0/k$b;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lf0/k$b;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lf0/k$b;->a:I

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v0, p0, Lf0/k$b;->b:Ljava/lang/Object;

    check-cast v0, Lf0/k$a;

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
    iget-object v1, p0, Lf0/k$b;->b:Ljava/lang/Object;

    check-cast v1, Lf0/k$a;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lf0/k$b;->b:Ljava/lang/Object;

    check-cast p1, LIi/N;

    new-instance v1, Lf0/k$a;

    invoke-interface {p1}, LIi/N;->getCoroutineContext()Ldh/i;

    move-result-object v5

    invoke-static {v5}, LIi/A0;->m(Ldh/i;)LIi/y0;

    move-result-object v5

    iget-object v6, p0, Lf0/k$b;->c:Lmh/l;

    invoke-interface {v6, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v1, v5, p1}, Lf0/k$a;-><init>(LIi/y0;Ljava/lang/Object;)V

    iget-object p1, p0, Lf0/k$b;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf0/k$a;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lf0/k$a;->a()LIi/y0;

    move-result-object p1

    if-eqz p1, :cond_3

    iput-object v1, p0, Lf0/k$b;->b:Ljava/lang/Object;

    iput v4, p0, Lf0/k$b;->a:I

    invoke-static {p1, p0}, LIi/A0;->g(LIi/y0;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    :try_start_1
    iget-object p1, p0, Lf0/k$b;->e:Lmh/p;

    invoke-virtual {v1}, Lf0/k$a;->b()Ljava/lang/Object;

    move-result-object v4

    iput-object v1, p0, Lf0/k$b;->b:Ljava/lang/Object;

    iput v3, p0, Lf0/k$b;->a:I

    invoke-interface {p1, v4, p0}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    move-object v0, v1

    :goto_1
    iget-object v1, p0, Lf0/k$b;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v1, v0, v2}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-object p1

    :catchall_1
    move-exception p1

    move-object v0, v1

    :goto_2
    iget-object v1, p0, Lf0/k$b;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v1, v0, v2}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lf0/k$b;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lf0/k$b;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lf0/k$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
