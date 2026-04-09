.class final LQi/i$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQi/i;->d(LLi/g;Ldh/i;)Lgg/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:LLi/g;

.field final synthetic d:Lgg/t;


# direct methods
.method constructor <init>(LLi/g;Lgg/t;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LQi/i$a;->c:LLi/g;

    iput-object p2, p0, LQi/i$a;->d:Lgg/t;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance v0, LQi/i$a;

    iget-object v1, p0, LQi/i$a;->c:LLi/g;

    iget-object v2, p0, LQi/i$a;->d:Lgg/t;

    invoke-direct {v0, v1, v2, p2}, LQi/i$a;-><init>(LLi/g;Lgg/t;Ldh/e;)V

    iput-object p1, v0, LQi/i$a;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LQi/i$a;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LQi/i$a;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, LQi/i$a;->b:Ljava/lang/Object;

    check-cast v0, LIi/N;

    :try_start_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LQi/i$a;->b:Ljava/lang/Object;

    check-cast p1, LIi/N;

    :try_start_1
    iget-object v1, p0, LQi/i$a;->c:LLi/g;

    new-instance v3, LQi/i$a$a;

    iget-object v4, p0, LQi/i$a;->d:Lgg/t;

    invoke-direct {v3, v4}, LQi/i$a$a;-><init>(Lgg/t;)V

    iput-object p1, p0, LQi/i$a;->b:Ljava/lang/Object;

    iput v2, p0, LQi/i$a;->a:I

    invoke-interface {v1, v3, p0}, LLi/g;->b(LLi/h;Ldh/e;)Ljava/lang/Object;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v1, v0, :cond_2

    return-object v0

    :cond_2
    move-object v0, p1

    :goto_0
    :try_start_2
    iget-object p1, p0, LQi/i$a;->d:Lgg/t;

    invoke-interface {p1}, Lgg/h;->a()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object v5, v0

    move-object v0, p1

    move-object p1, v5

    :goto_1
    instance-of v1, p1, Ljava/util/concurrent/CancellationException;

    if-nez v1, :cond_3

    iget-object v1, p0, LQi/i$a;->d:Lgg/t;

    invoke-interface {v1, p1}, Lgg/t;->c(Ljava/lang/Throwable;)Z

    move-result v1

    if-nez v1, :cond_4

    invoke-interface {v0}, LIi/N;->getCoroutineContext()Ldh/i;

    move-result-object v0

    invoke-static {p1, v0}, LQi/d;->a(Ljava/lang/Throwable;Ldh/i;)V

    goto :goto_2

    :cond_3
    iget-object p1, p0, LQi/i$a;->d:Lgg/t;

    invoke-interface {p1}, Lgg/h;->a()V

    :cond_4
    :goto_2
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LQi/i$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LQi/i$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LQi/i$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
