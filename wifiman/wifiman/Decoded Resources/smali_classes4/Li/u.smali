.class abstract synthetic LLi/u;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LLi/g;Ldh/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, LLi/u$c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LLi/u$c;

    iget v1, v0, LLi/u$c;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LLi/u$c;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, LLi/u$c;

    invoke-direct {v0, p1}, LLi/u$c;-><init>(Ldh/e;)V

    :goto_0
    iget-object p1, v0, LLi/u$c;->c:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LLi/u$c;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LLi/u$c;->b:Ljava/lang/Object;

    check-cast p0, LLi/u$a;

    iget-object v1, v0, LLi/u$c;->a:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/N;

    :try_start_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lkotlinx/coroutines/flow/internal/AbortFlowException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    new-instance p1, Lkotlin/jvm/internal/N;

    invoke-direct {p1}, Lkotlin/jvm/internal/N;-><init>()V

    sget-object v2, LMi/r;->a:LNi/C;

    iput-object v2, p1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    new-instance v2, LLi/u$a;

    invoke-direct {v2, p1}, LLi/u$a;-><init>(Lkotlin/jvm/internal/N;)V

    :try_start_1
    iput-object p1, v0, LLi/u$c;->a:Ljava/lang/Object;

    iput-object v2, v0, LLi/u$c;->b:Ljava/lang/Object;

    iput v3, v0, LLi/u$c;->d:I

    invoke-interface {p0, v2, v0}, LLi/g;->b(LLi/h;Ldh/e;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch Lkotlinx/coroutines/flow/internal/AbortFlowException; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v1, p1

    goto :goto_2

    :catch_1
    move-exception p0

    move-object v1, p1

    move-object p1, p0

    move-object p0, v2

    :goto_1
    invoke-static {p1, p0}, LMi/n;->a(Lkotlinx/coroutines/flow/internal/AbortFlowException;Ljava/lang/Object;)V

    invoke-interface {v0}, Ldh/e;->getContext()Ldh/i;

    move-result-object p0

    invoke-static {p0}, LIi/A0;->l(Ldh/i;)V

    :goto_2
    iget-object p0, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    sget-object p1, LMi/r;->a:LNi/C;

    if-eq p0, p1, :cond_4

    return-object p0

    :cond_4
    new-instance p0, Ljava/util/NoSuchElementException;

    const-string p1, "Expected at least one element"

    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final b(LLi/g;Lmh/p;Ldh/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, LLi/u$d;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LLi/u$d;

    iget v1, v0, LLi/u$d;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LLi/u$d;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, LLi/u$d;

    invoke-direct {v0, p2}, LLi/u$d;-><init>(Ldh/e;)V

    :goto_0
    iget-object p2, v0, LLi/u$d;->c:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LLi/u$d;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LLi/u$d;->b:Ljava/lang/Object;

    check-cast p0, LLi/u$b;

    iget-object p1, v0, LLi/u$d;->a:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/internal/N;

    :try_start_0
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lkotlinx/coroutines/flow/internal/AbortFlowException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p2

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    new-instance p2, Lkotlin/jvm/internal/N;

    invoke-direct {p2}, Lkotlin/jvm/internal/N;-><init>()V

    sget-object v2, LMi/r;->a:LNi/C;

    iput-object v2, p2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    new-instance v2, LLi/u$b;

    invoke-direct {v2, p1, p2}, LLi/u$b;-><init>(Lmh/p;Lkotlin/jvm/internal/N;)V

    :try_start_1
    iput-object p2, v0, LLi/u$d;->a:Ljava/lang/Object;

    iput-object v2, v0, LLi/u$d;->b:Ljava/lang/Object;

    iput v3, v0, LLi/u$d;->d:I

    invoke-interface {p0, v2, v0}, LLi/g;->b(LLi/h;Ldh/e;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch Lkotlinx/coroutines/flow/internal/AbortFlowException; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p2

    goto :goto_2

    :catch_1
    move-exception p0

    move-object p1, p2

    move-object p2, p0

    move-object p0, v2

    :goto_1
    invoke-static {p2, p0}, LMi/n;->a(Lkotlinx/coroutines/flow/internal/AbortFlowException;Ljava/lang/Object;)V

    invoke-interface {v0}, Ldh/e;->getContext()Ldh/i;

    move-result-object p0

    invoke-static {p0}, LIi/A0;->l(Ldh/i;)V

    :goto_2
    iget-object p0, p1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    sget-object p1, LMi/r;->a:LNi/C;

    if-eq p0, p1, :cond_4

    return-object p0

    :cond_4
    new-instance p0, Ljava/util/NoSuchElementException;

    const-string p1, "Expected at least one element matching the predicate"

    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final c(LLi/g;Ldh/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, LLi/u$f;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LLi/u$f;

    iget v1, v0, LLi/u$f;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LLi/u$f;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, LLi/u$f;

    invoke-direct {v0, p1}, LLi/u$f;-><init>(Ldh/e;)V

    :goto_0
    iget-object p1, v0, LLi/u$f;->c:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LLi/u$f;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LLi/u$f;->b:Ljava/lang/Object;

    check-cast p0, LLi/u$e;

    iget-object v1, v0, LLi/u$f;->a:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/N;

    :try_start_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lkotlinx/coroutines/flow/internal/AbortFlowException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    new-instance p1, Lkotlin/jvm/internal/N;

    invoke-direct {p1}, Lkotlin/jvm/internal/N;-><init>()V

    new-instance v2, LLi/u$e;

    invoke-direct {v2, p1}, LLi/u$e;-><init>(Lkotlin/jvm/internal/N;)V

    :try_start_1
    iput-object p1, v0, LLi/u$f;->a:Ljava/lang/Object;

    iput-object v2, v0, LLi/u$f;->b:Ljava/lang/Object;

    iput v3, v0, LLi/u$f;->d:I

    invoke-interface {p0, v2, v0}, LLi/g;->b(LLi/h;Ldh/e;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch Lkotlinx/coroutines/flow/internal/AbortFlowException; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v1, p1

    goto :goto_2

    :catch_1
    move-exception p0

    move-object v1, p1

    move-object p1, p0

    move-object p0, v2

    :goto_1
    invoke-static {p1, p0}, LMi/n;->a(Lkotlinx/coroutines/flow/internal/AbortFlowException;Ljava/lang/Object;)V

    invoke-interface {v0}, Ldh/e;->getContext()Ldh/i;

    move-result-object p0

    invoke-static {p0}, LIi/A0;->l(Ldh/i;)V

    :goto_2
    iget-object p0, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    return-object p0
.end method
