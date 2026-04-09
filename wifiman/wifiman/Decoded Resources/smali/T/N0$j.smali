.class final LT/N0$j;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT/N0;->t0(Lmh/q;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:I

.field private synthetic c:Ljava/lang/Object;

.field final synthetic d:LT/N0;

.field final synthetic e:Lmh/q;

.field final synthetic f:LT/g0;


# direct methods
.method constructor <init>(LT/N0;Lmh/q;LT/g0;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LT/N0$j;->d:LT/N0;

    iput-object p2, p0, LT/N0$j;->e:Lmh/q;

    iput-object p3, p0, LT/N0$j;->f:LT/g0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 4

    new-instance v0, LT/N0$j;

    iget-object v1, p0, LT/N0$j;->d:LT/N0;

    iget-object v2, p0, LT/N0$j;->e:Lmh/q;

    iget-object v3, p0, LT/N0$j;->f:LT/g0;

    invoke-direct {v0, v1, v2, v3, p2}, LT/N0$j;-><init>(LT/N0;Lmh/q;LT/g0;Ldh/e;)V

    iput-object p1, v0, LT/N0$j;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LT/N0$j;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LT/N0$j;->b:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v0, p0, LT/N0$j;->a:Ljava/lang/Object;

    check-cast v0, Ld0/b;

    iget-object v1, p0, LT/N0$j;->c:Ljava/lang/Object;

    check-cast v1, LIi/y0;

    :try_start_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_1

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LT/N0$j;->c:Ljava/lang/Object;

    check-cast p1, LIi/N;

    invoke-interface {p1}, LIi/N;->getCoroutineContext()Ldh/i;

    move-result-object p1

    invoke-static {p1}, LIi/A0;->m(Ldh/i;)LIi/y0;

    move-result-object v1

    iget-object p1, p0, LT/N0$j;->d:LT/N0;

    invoke-static {p1, v1}, LT/N0;->P(LT/N0;LIi/y0;)V

    sget-object p1, Landroidx/compose/runtime/snapshots/g;->e:Landroidx/compose/runtime/snapshots/g$a;

    new-instance v4, LT/N0$j$b;

    iget-object v5, p0, LT/N0$j;->d:LT/N0;

    invoke-direct {v4, v5}, LT/N0$j$b;-><init>(LT/N0;)V

    invoke-virtual {p1, v4}, Landroidx/compose/runtime/snapshots/g$a;->i(Lmh/p;)Ld0/b;

    move-result-object p1

    sget-object v4, LT/N0;->y:LT/N0$a;

    iget-object v5, p0, LT/N0$j;->d:LT/N0;

    invoke-static {v5}, LT/N0;->C(LT/N0;)LT/N0$c;

    move-result-object v5

    invoke-static {v4, v5}, LT/N0$a;->a(LT/N0$a;LT/N0$c;)V

    :try_start_1
    iget-object v4, p0, LT/N0$j;->d:LT/N0;

    invoke-static {v4}, LT/N0;->G(LT/N0;)Ljava/lang/Object;

    move-result-object v4

    iget-object v5, p0, LT/N0$j;->d:LT/N0;

    monitor-enter v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-static {v5}, LT/N0;->B(LT/N0;)Ljava/util/List;

    move-result-object v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    :try_start_3
    monitor-exit v4

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v4, :cond_2

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LT/E;

    invoke-interface {v7}, LT/E;->w()V

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object v8, v0

    move-object v0, p1

    move-object p1, v8

    goto :goto_4

    :cond_2
    new-instance v4, LT/N0$j$a;

    iget-object v5, p0, LT/N0$j;->e:Lmh/q;

    iget-object v6, p0, LT/N0$j;->f:LT/g0;

    invoke-direct {v4, v5, v6, v2}, LT/N0$j$a;-><init>(Lmh/q;LT/g0;Ldh/e;)V

    iput-object v1, p0, LT/N0$j;->c:Ljava/lang/Object;

    iput-object p1, p0, LT/N0$j;->a:Ljava/lang/Object;

    iput v3, p0, LT/N0$j;->b:I

    invoke-static {v4, p0}, LIi/O;->g(Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-ne v3, v0, :cond_3

    return-object v0

    :cond_3
    move-object v0, p1

    :goto_1
    invoke-interface {v0}, Ld0/b;->dispose()V

    iget-object p1, p0, LT/N0$j;->d:LT/N0;

    invoke-static {p1}, LT/N0;->G(LT/N0;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, LT/N0$j;->d:LT/N0;

    monitor-enter p1

    :try_start_4
    invoke-static {v0}, LT/N0;->D(LT/N0;)LIi/y0;

    move-result-object v3

    if-ne v3, v1, :cond_4

    invoke-static {v0, v2}, LT/N0;->T(LT/N0;LIi/y0;)V

    goto :goto_2

    :catchall_2
    move-exception v0

    goto :goto_3

    :cond_4
    :goto_2
    invoke-static {v0}, LT/N0;->t(LT/N0;)LIi/n;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    monitor-exit p1

    sget-object p1, LT/N0;->y:LT/N0$a;

    iget-object v0, p0, LT/N0$j;->d:LT/N0;

    invoke-static {v0}, LT/N0;->C(LT/N0;)LT/N0$c;

    move-result-object v0

    invoke-static {p1, v0}, LT/N0$a;->b(LT/N0$a;LT/N0$c;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :goto_3
    monitor-exit p1

    throw v0

    :catchall_3
    move-exception v0

    :try_start_5
    monitor-exit v4

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :goto_4
    invoke-interface {v0}, Ld0/b;->dispose()V

    iget-object v0, p0, LT/N0$j;->d:LT/N0;

    invoke-static {v0}, LT/N0;->G(LT/N0;)Ljava/lang/Object;

    move-result-object v0

    iget-object v3, p0, LT/N0$j;->d:LT/N0;

    monitor-enter v0

    :try_start_6
    invoke-static {v3}, LT/N0;->D(LT/N0;)LIi/y0;

    move-result-object v4

    if-ne v4, v1, :cond_5

    invoke-static {v3, v2}, LT/N0;->T(LT/N0;LIi/y0;)V

    goto :goto_5

    :catchall_4
    move-exception p1

    goto :goto_6

    :cond_5
    :goto_5
    invoke-static {v3}, LT/N0;->t(LT/N0;)LIi/n;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    monitor-exit v0

    sget-object v0, LT/N0;->y:LT/N0$a;

    iget-object v1, p0, LT/N0$j;->d:LT/N0;

    invoke-static {v1}, LT/N0;->C(LT/N0;)LT/N0$c;

    move-result-object v1

    invoke-static {v0, v1}, LT/N0$a;->b(LT/N0$a;LT/N0$c;)V

    throw p1

    :goto_6
    monitor-exit v0

    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LT/N0$j;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LT/N0$j;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LT/N0$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
