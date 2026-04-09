.class final Ls/M$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls/M;->f(Ljava/lang/Object;Ls/L;Lmh/p;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field c:Ljava/lang/Object;

.field d:Ljava/lang/Object;

.field e:I

.field private synthetic f:Ljava/lang/Object;

.field final synthetic g:Ls/L;

.field final synthetic h:Ls/M;

.field final synthetic i:Lmh/p;

.field final synthetic j:Ljava/lang/Object;


# direct methods
.method constructor <init>(Ls/L;Ls/M;Lmh/p;Ljava/lang/Object;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Ls/M$c;->g:Ls/L;

    iput-object p2, p0, Ls/M$c;->h:Ls/M;

    iput-object p3, p0, Ls/M$c;->i:Lmh/p;

    iput-object p4, p0, Ls/M$c;->j:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 7

    new-instance v6, Ls/M$c;

    iget-object v1, p0, Ls/M$c;->g:Ls/L;

    iget-object v2, p0, Ls/M$c;->h:Ls/M;

    iget-object v3, p0, Ls/M$c;->i:Lmh/p;

    iget-object v4, p0, Ls/M$c;->j:Ljava/lang/Object;

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Ls/M$c;-><init>(Ls/L;Ls/M;Lmh/p;Ljava/lang/Object;Ldh/e;)V

    iput-object p1, v6, Ls/M$c;->f:Ljava/lang/Object;

    return-object v6
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Ls/M$c;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Ls/M$c;->e:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Ls/M$c;->b:Ljava/lang/Object;

    check-cast v0, Ls/M;

    iget-object v1, p0, Ls/M$c;->a:Ljava/lang/Object;

    check-cast v1, LTi/a;

    iget-object v2, p0, Ls/M$c;->f:Ljava/lang/Object;

    check-cast v2, Ls/M$a;

    :try_start_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_1

    :catchall_0
    move-exception p1

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Ls/M$c;->d:Ljava/lang/Object;

    check-cast v1, Ls/M;

    iget-object v3, p0, Ls/M$c;->c:Ljava/lang/Object;

    iget-object v5, p0, Ls/M$c;->b:Ljava/lang/Object;

    check-cast v5, Lmh/p;

    iget-object v6, p0, Ls/M$c;->a:Ljava/lang/Object;

    check-cast v6, LTi/a;

    iget-object v7, p0, Ls/M$c;->f:Ljava/lang/Object;

    check-cast v7, Ls/M$a;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    move-object p1, v6

    goto :goto_0

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Ls/M$c;->f:Ljava/lang/Object;

    check-cast p1, LIi/N;

    new-instance v1, Ls/M$a;

    iget-object v5, p0, Ls/M$c;->g:Ls/L;

    invoke-interface {p1}, LIi/N;->getCoroutineContext()Ldh/i;

    move-result-object p1

    sget-object v6, LIi/y0;->O:LIi/y0$b;

    invoke-interface {p1, v6}, Ldh/i;->get(Ldh/i$c;)Ldh/i$b;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast p1, LIi/y0;

    invoke-direct {v1, v5, p1}, Ls/M$a;-><init>(Ls/L;LIi/y0;)V

    iget-object p1, p0, Ls/M$c;->h:Ls/M;

    invoke-static {p1, v1}, Ls/M;->c(Ls/M;Ls/M$a;)V

    iget-object p1, p0, Ls/M$c;->h:Ls/M;

    invoke-static {p1}, Ls/M;->b(Ls/M;)LTi/a;

    move-result-object p1

    iget-object v5, p0, Ls/M$c;->i:Lmh/p;

    iget-object v6, p0, Ls/M$c;->j:Ljava/lang/Object;

    iget-object v7, p0, Ls/M$c;->h:Ls/M;

    iput-object v1, p0, Ls/M$c;->f:Ljava/lang/Object;

    iput-object p1, p0, Ls/M$c;->a:Ljava/lang/Object;

    iput-object v5, p0, Ls/M$c;->b:Ljava/lang/Object;

    iput-object v6, p0, Ls/M$c;->c:Ljava/lang/Object;

    iput-object v7, p0, Ls/M$c;->d:Ljava/lang/Object;

    iput v3, p0, Ls/M$c;->e:I

    invoke-interface {p1, v4, p0}, LTi/a;->a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_3

    return-object v0

    :cond_3
    move-object v3, v6

    move-object v8, v7

    move-object v7, v1

    move-object v1, v8

    :goto_0
    :try_start_1
    iput-object v7, p0, Ls/M$c;->f:Ljava/lang/Object;

    iput-object p1, p0, Ls/M$c;->a:Ljava/lang/Object;

    iput-object v1, p0, Ls/M$c;->b:Ljava/lang/Object;

    iput-object v4, p0, Ls/M$c;->c:Ljava/lang/Object;

    iput-object v4, p0, Ls/M$c;->d:Ljava/lang/Object;

    iput v2, p0, Ls/M$c;->e:I

    invoke-interface {v5, v3, p0}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    if-ne v2, v0, :cond_4

    return-object v0

    :cond_4
    move-object v0, v1

    move-object v1, p1

    move-object p1, v2

    move-object v2, v7

    :goto_1
    :try_start_2
    invoke-static {v0}, Ls/M;->a(Ls/M;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-static {v0, v2, v4}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-interface {v1, v4}, LTi/a;->d(Ljava/lang/Object;)V

    return-object p1

    :catchall_1
    move-exception p1

    goto :goto_3

    :catchall_2
    move-exception v0

    move-object v2, v7

    move-object v8, v1

    move-object v1, p1

    move-object p1, v0

    move-object v0, v8

    :goto_2
    :try_start_3
    invoke-static {v0}, Ls/M;->a(Ls/M;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-static {v0, v2, v4}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_3
    invoke-interface {v1, v4}, LTi/a;->d(Ljava/lang/Object;)V

    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Ls/M$c;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Ls/M$c;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Ls/M$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
