.class final Lr/Z$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr/Z;->d(Lr/X;Lmh/l;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field c:Ljava/lang/Object;

.field d:I

.field private synthetic e:Ljava/lang/Object;

.field final synthetic f:Lr/X;

.field final synthetic g:Lr/Z;

.field final synthetic h:Lmh/l;


# direct methods
.method constructor <init>(Lr/X;Lr/Z;Lmh/l;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lr/Z$b;->f:Lr/X;

    iput-object p2, p0, Lr/Z$b;->g:Lr/Z;

    iput-object p3, p0, Lr/Z$b;->h:Lmh/l;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 4

    new-instance v0, Lr/Z$b;

    iget-object v1, p0, Lr/Z$b;->f:Lr/X;

    iget-object v2, p0, Lr/Z$b;->g:Lr/Z;

    iget-object v3, p0, Lr/Z$b;->h:Lmh/l;

    invoke-direct {v0, v1, v2, v3, p2}, Lr/Z$b;-><init>(Lr/X;Lr/Z;Lmh/l;Ldh/e;)V

    iput-object p1, v0, Lr/Z$b;->e:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lr/Z$b;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lr/Z$b;->d:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lr/Z$b;->b:Ljava/lang/Object;

    check-cast v0, Lr/Z;

    iget-object v1, p0, Lr/Z$b;->a:Ljava/lang/Object;

    check-cast v1, LTi/a;

    iget-object v2, p0, Lr/Z$b;->e:Ljava/lang/Object;

    check-cast v2, Lr/Z$a;

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
    iget-object v1, p0, Lr/Z$b;->c:Ljava/lang/Object;

    check-cast v1, Lr/Z;

    iget-object v3, p0, Lr/Z$b;->b:Ljava/lang/Object;

    check-cast v3, Lmh/l;

    iget-object v5, p0, Lr/Z$b;->a:Ljava/lang/Object;

    check-cast v5, LTi/a;

    iget-object v6, p0, Lr/Z$b;->e:Ljava/lang/Object;

    check-cast v6, Lr/Z$a;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    move-object p1, v5

    goto :goto_0

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lr/Z$b;->e:Ljava/lang/Object;

    check-cast p1, LIi/N;

    new-instance v1, Lr/Z$a;

    iget-object v5, p0, Lr/Z$b;->f:Lr/X;

    invoke-interface {p1}, LIi/N;->getCoroutineContext()Ldh/i;

    move-result-object p1

    sget-object v6, LIi/y0;->O:LIi/y0$b;

    invoke-interface {p1, v6}, Ldh/i;->get(Ldh/i$c;)Ldh/i$b;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast p1, LIi/y0;

    invoke-direct {v1, v5, p1}, Lr/Z$a;-><init>(Lr/X;LIi/y0;)V

    iget-object p1, p0, Lr/Z$b;->g:Lr/Z;

    invoke-static {p1, v1}, Lr/Z;->c(Lr/Z;Lr/Z$a;)V

    iget-object p1, p0, Lr/Z$b;->g:Lr/Z;

    invoke-static {p1}, Lr/Z;->b(Lr/Z;)LTi/a;

    move-result-object p1

    iget-object v5, p0, Lr/Z$b;->h:Lmh/l;

    iget-object v6, p0, Lr/Z$b;->g:Lr/Z;

    iput-object v1, p0, Lr/Z$b;->e:Ljava/lang/Object;

    iput-object p1, p0, Lr/Z$b;->a:Ljava/lang/Object;

    iput-object v5, p0, Lr/Z$b;->b:Ljava/lang/Object;

    iput-object v6, p0, Lr/Z$b;->c:Ljava/lang/Object;

    iput v3, p0, Lr/Z$b;->d:I

    invoke-interface {p1, v4, p0}, LTi/a;->a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_3

    return-object v0

    :cond_3
    move-object v3, v5

    move-object v7, v6

    move-object v6, v1

    move-object v1, v7

    :goto_0
    :try_start_1
    iput-object v6, p0, Lr/Z$b;->e:Ljava/lang/Object;

    iput-object p1, p0, Lr/Z$b;->a:Ljava/lang/Object;

    iput-object v1, p0, Lr/Z$b;->b:Ljava/lang/Object;

    iput-object v4, p0, Lr/Z$b;->c:Ljava/lang/Object;

    iput v2, p0, Lr/Z$b;->d:I

    invoke-interface {v3, p0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    if-ne v2, v0, :cond_4

    return-object v0

    :cond_4
    move-object v0, v1

    move-object v1, p1

    move-object p1, v2

    move-object v2, v6

    :goto_1
    :try_start_2
    invoke-static {v0}, Lr/Z;->a(Lr/Z;)Ljava/util/concurrent/atomic/AtomicReference;

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

    move-object v2, v6

    move-object v7, v1

    move-object v1, p1

    move-object p1, v0

    move-object v0, v7

    :goto_2
    :try_start_3
    invoke-static {v0}, Lr/Z;->a(Lr/Z;)Ljava/util/concurrent/atomic/AtomicReference;

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

    invoke-virtual {p0, p1, p2}, Lr/Z$b;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lr/Z$b;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lr/Z$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
