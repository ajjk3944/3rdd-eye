.class public abstract LIi/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a([LIi/V;Ldh/e;)Ljava/lang/Object;
    .locals 1

    array-length v0, p0

    if-nez v0, :cond_0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, LIi/e;

    invoke-direct {v0, p0}, LIi/e;-><init>([LIi/V;)V

    invoke-virtual {v0, p1}, LIi/e;->c(Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ljava/util/Collection;Ldh/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, LIi/f$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LIi/f$b;

    iget v1, v0, LIi/f$b;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LIi/f$b;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, LIi/f$b;

    invoke-direct {v0, p1}, LIi/f$b;-><init>(Ldh/e;)V

    :goto_0
    iget-object p1, v0, LIi/f$b;->b:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LIi/f$b;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LIi/f$b;->a:Ljava/lang/Object;

    check-cast p0, Ljava/util/Iterator;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_3
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LIi/y0;

    iput-object p0, v0, LIi/f$b;->a:Ljava/lang/Object;

    iput v3, v0, LIi/f$b;->c:I

    invoke-interface {p1, v0}, LIi/y0;->join(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_4
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final c([LIi/y0;Ldh/e;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p1, LIi/f$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LIi/f$a;

    iget v1, v0, LIi/f$a;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LIi/f$a;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, LIi/f$a;

    invoke-direct {v0, p1}, LIi/f$a;-><init>(Ldh/e;)V

    :goto_0
    iget-object p1, v0, LIi/f$a;->d:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LIi/f$a;->e:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget p0, v0, LIi/f$a;->c:I

    iget v2, v0, LIi/f$a;->b:I

    iget-object v4, v0, LIi/f$a;->a:Ljava/lang/Object;

    check-cast v4, [LIi/y0;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    move-object p1, v4

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    array-length p1, p0

    const/4 v2, 0x0

    move v5, p1

    move-object p1, p0

    move p0, v5

    :goto_1
    if-ge v2, p0, :cond_4

    aget-object v4, p1, v2

    iput-object p1, v0, LIi/f$a;->a:Ljava/lang/Object;

    iput v2, v0, LIi/f$a;->b:I

    iput p0, v0, LIi/f$a;->c:I

    iput v3, v0, LIi/f$a;->e:I

    invoke-interface {v4, v0}, LIi/y0;->join(Ldh/e;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_3

    return-object v1

    :cond_3
    :goto_2
    add-int/2addr v2, v3

    goto :goto_1

    :cond_4
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
