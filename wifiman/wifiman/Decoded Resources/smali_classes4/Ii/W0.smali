.class public abstract LIi/W0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(JLIi/X;LIi/y0;)Lkotlinx/coroutines/TimeoutCancellationException;
    .locals 1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Timed out waiting for "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, " ms"

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Lkotlinx/coroutines/TimeoutCancellationException;

    invoke-direct {p1, p0, p3}, Lkotlinx/coroutines/TimeoutCancellationException;-><init>(Ljava/lang/String;LIi/y0;)V

    return-object p1
.end method

.method private static final b(LIi/V0;Lmh/p;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, LNi/y;->d:Ldh/e;

    invoke-interface {v0}, Ldh/e;->getContext()Ldh/i;

    move-result-object v0

    invoke-static {v0}, LIi/Y;->b(Ldh/i;)LIi/X;

    move-result-object v0

    iget-wide v1, p0, LIi/V0;->e:J

    invoke-virtual {p0}, LIi/a;->getContext()Ldh/i;

    move-result-object v3

    invoke-interface {v0, v1, v2, p0, v3}, LIi/X;->p(JLjava/lang/Runnable;Ldh/i;)LIi/e0;

    move-result-object v0

    invoke-static {p0, v0}, LIi/A0;->j(LIi/y0;LIi/e0;)LIi/e0;

    invoke-static {p0, p0, p1}, LOi/b;->c(LNi/y;Ljava/lang/Object;Lmh/p;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final c(JLmh/p;Ldh/e;)Ljava/lang/Object;
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-lez v0, :cond_1

    new-instance v0, LIi/V0;

    invoke-direct {v0, p0, p1, p3}, LIi/V0;-><init>(JLdh/e;)V

    invoke-static {v0, p2}, LIi/W0;->b(LIi/V0;Lmh/p;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/h;->c(Ldh/e;)V

    :cond_0
    return-object p0

    :cond_1
    new-instance p0, Lkotlinx/coroutines/TimeoutCancellationException;

    const-string p1, "Timed out immediately"

    invoke-direct {p0, p1}, Lkotlinx/coroutines/TimeoutCancellationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final d(JLmh/p;Ldh/e;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p3, LIi/W0$a;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, LIi/W0$a;

    iget v1, v0, LIi/W0$a;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LIi/W0$a;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, LIi/W0$a;

    invoke-direct {v0, p3}, LIi/W0$a;-><init>(Ldh/e;)V

    :goto_0
    iget-object p3, v0, LIi/W0$a;->d:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LIi/W0$a;->e:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p0, v0, LIi/W0$a;->c:Ljava/lang/Object;

    check-cast p0, Lkotlin/jvm/internal/N;

    iget-object p1, v0, LIi/W0$a;->b:Ljava/lang/Object;

    check-cast p1, Lmh/p;

    :try_start_0
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lkotlinx/coroutines/TimeoutCancellationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    const-wide/16 v5, 0x0

    cmp-long p3, p0, v5

    if-gtz p3, :cond_3

    return-object v3

    :cond_3
    new-instance p3, Lkotlin/jvm/internal/N;

    invoke-direct {p3}, Lkotlin/jvm/internal/N;-><init>()V

    :try_start_1
    iput-object p2, v0, LIi/W0$a;->b:Ljava/lang/Object;

    iput-object p3, v0, LIi/W0$a;->c:Ljava/lang/Object;

    iput-wide p0, v0, LIi/W0$a;->a:J

    iput v4, v0, LIi/W0$a;->e:I

    new-instance v2, LIi/V0;

    invoke-direct {v2, p0, p1, v0}, LIi/V0;-><init>(JLdh/e;)V

    iput-object v2, p3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {v2, p2}, LIi/W0;->b(LIi/V0;Lmh/p;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_4

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/h;->c(Ldh/e;)V
    :try_end_1
    .catch Lkotlinx/coroutines/TimeoutCancellationException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    move-object p0, p3

    goto :goto_3

    :cond_4
    :goto_1
    if-ne p0, v1, :cond_5

    return-object v1

    :cond_5
    move-object p3, p0

    :goto_2
    return-object p3

    :goto_3
    iget-object p2, p1, Lkotlinx/coroutines/TimeoutCancellationException;->a:LIi/y0;

    iget-object p0, p0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-ne p2, p0, :cond_6

    return-object v3

    :cond_6
    throw p1
.end method
