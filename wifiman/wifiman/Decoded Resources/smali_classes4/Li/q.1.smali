.class abstract synthetic LLi/q;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(LLi/h;Lmh/q;Ljava/lang/Throwable;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LLi/q;->c(LLi/h;Lmh/q;Ljava/lang/Throwable;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final b(LLi/h;)V
    .locals 1

    instance-of v0, p0, LLi/S;

    if-nez v0, :cond_0

    return-void

    :cond_0
    check-cast p0, LLi/S;

    iget-object p0, p0, LLi/S;->a:Ljava/lang/Throwable;

    throw p0
.end method

.method private static final c(LLi/h;Lmh/q;Ljava/lang/Throwable;Ldh/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p3, LLi/q$a;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, LLi/q$a;

    iget v1, v0, LLi/q$a;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LLi/q$a;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, LLi/q$a;

    invoke-direct {v0, p3}, LLi/q$a;-><init>(Ldh/e;)V

    :goto_0
    iget-object p3, v0, LLi/q$a;->b:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LLi/q$a;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LLi/q$a;->a:Ljava/lang/Object;

    move-object p2, p0

    check-cast p2, Ljava/lang/Throwable;

    :try_start_0
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_1
    iput-object p2, v0, LLi/q$a;->a:Ljava/lang/Object;

    iput v3, v0, LLi/q$a;->c:I

    invoke-interface {p1, p0, p2, v0}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0

    :goto_2
    if-eqz p2, :cond_4

    if-eq p2, p0, :cond_4

    invoke-static {p0, p2}, LYg/g;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_4
    throw p0
.end method

.method public static final d(LLi/g;Lmh/q;)LLi/g;
    .locals 1

    new-instance v0, LLi/q$b;

    invoke-direct {v0, p0, p1}, LLi/q$b;-><init>(LLi/g;Lmh/q;)V

    return-object v0
.end method

.method public static final e(LLi/g;Lmh/p;)LLi/g;
    .locals 1

    new-instance v0, LLi/q$c;

    invoke-direct {v0, p1, p0}, LLi/q$c;-><init>(Lmh/p;LLi/g;)V

    return-object v0
.end method
