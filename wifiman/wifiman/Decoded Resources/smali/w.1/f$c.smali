.class final Lw/f$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/f;->W2()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Lw/f;

.field final synthetic d:Lw/G;

.field final synthetic e:Lw/d;


# direct methods
.method constructor <init>(Lw/f;Lw/G;Lw/d;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lw/f$c;->c:Lw/f;

    iput-object p2, p0, Lw/f$c;->d:Lw/G;

    iput-object p3, p0, Lw/f$c;->e:Lw/d;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 4

    new-instance v0, Lw/f$c;

    iget-object v1, p0, Lw/f$c;->c:Lw/f;

    iget-object v2, p0, Lw/f$c;->d:Lw/G;

    iget-object v3, p0, Lw/f$c;->e:Lw/d;

    invoke-direct {v0, v1, v2, v3, p2}, Lw/f$c;-><init>(Lw/f;Lw/G;Lw/d;Ldh/e;)V

    iput-object p1, v0, Lw/f$c;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lw/f$c;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lw/f$c;->a:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    :try_start_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    move-object v4, p1

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lw/f$c;->b:Ljava/lang/Object;

    check-cast p1, LIi/N;

    invoke-interface {p1}, LIi/N;->getCoroutineContext()Ldh/i;

    move-result-object p1

    invoke-static {p1}, LIi/A0;->m(Ldh/i;)LIi/y0;

    move-result-object v9

    :try_start_1
    iget-object p1, p0, Lw/f$c;->c:Lw/f;

    invoke-static {p1, v2}, Lw/f;->L2(Lw/f;Z)V

    iget-object p1, p0, Lw/f$c;->c:Lw/f;

    invoke-static {p1}, Lw/f;->H2(Lw/f;)Lw/A;

    move-result-object p1

    sget-object v1, Ls/L;->Default:Ls/L;

    new-instance v11, Lw/f$c$a;

    iget-object v6, p0, Lw/f$c;->d:Lw/G;

    iget-object v7, p0, Lw/f$c;->c:Lw/f;

    iget-object v8, p0, Lw/f$c;->e:Lw/d;

    const/4 v10, 0x0

    move-object v5, v11

    invoke-direct/range {v5 .. v10}, Lw/f$c$a;-><init>(Lw/G;Lw/f;Lw/d;LIi/y0;Ldh/e;)V

    iput v2, p0, Lw/f$c;->a:I

    invoke-virtual {p1, v1, v11, p0}, Lw/A;->v(Ls/L;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, Lw/f$c;->c:Lw/f;

    invoke-static {p1}, Lw/f;->E2(Lw/f;)Lw/c;

    move-result-object p1

    invoke-virtual {p1}, Lw/c;->d()V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object p1, p0, Lw/f$c;->c:Lw/f;

    invoke-static {p1, v3}, Lw/f;->L2(Lw/f;Z)V

    iget-object p1, p0, Lw/f$c;->c:Lw/f;

    invoke-static {p1}, Lw/f;->E2(Lw/f;)Lw/c;

    move-result-object p1

    invoke-virtual {p1, v4}, Lw/c;->b(Ljava/lang/Throwable;)V

    iget-object p1, p0, Lw/f$c;->c:Lw/f;

    invoke-static {p1, v3}, Lw/f;->M2(Lw/f;Z)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :goto_1
    :try_start_2
    throw v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_2
    iget-object v0, p0, Lw/f$c;->c:Lw/f;

    invoke-static {v0, v3}, Lw/f;->L2(Lw/f;Z)V

    iget-object v0, p0, Lw/f$c;->c:Lw/f;

    invoke-static {v0}, Lw/f;->E2(Lw/f;)Lw/c;

    move-result-object v0

    invoke-virtual {v0, v4}, Lw/c;->b(Ljava/lang/Throwable;)V

    iget-object v0, p0, Lw/f$c;->c:Lw/f;

    invoke-static {v0, v3}, Lw/f;->M2(Lw/f;Z)V

    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lw/f$c;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lw/f$c;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lw/f$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
