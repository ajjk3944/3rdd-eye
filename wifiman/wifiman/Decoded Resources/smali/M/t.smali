.class public abstract LM/t;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(Ly0/b;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, LM/t;->h(Ly0/b;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Landroidx/compose/ui/platform/w1;Ly0/y;Ly0/y;)Z
    .locals 0

    invoke-static {p0, p1, p2}, LM/t;->i(Landroidx/compose/ui/platform/w1;Ly0/y;Ly0/y;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic c(Ly0/b;LM/i;LM/d;Ly0/n;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LM/t;->k(Ly0/b;LM/i;LM/d;Ly0/n;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Ly0/b;LM/i;LM/d;Ly0/n;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LM/t;->l(Ly0/b;LM/i;LM/d;Ly0/n;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Ly0/b;LF/U;Ly0/n;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LM/t;->o(Ly0/b;LF/U;Ly0/n;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Ly0/b;LF/U;Ly0/n;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LM/t;->p(Ly0/b;LF/U;Ly0/n;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Ly0/b;LF/U;Ly0/n;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LM/t;->q(Ly0/b;LF/U;Ly0/n;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Ly0/b;Ldh/e;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p1, LM/t$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LM/t$a;

    iget v1, v0, LM/t$a;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LM/t$a;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, LM/t$a;

    invoke-direct {v0, p1}, LM/t$a;-><init>(Ldh/e;)V

    :goto_0
    iget-object p1, v0, LM/t$a;->b:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LM/t$a;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LM/t$a;->a:Ljava/lang/Object;

    check-cast p0, Ly0/b;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    :goto_1
    sget-object p1, Ly0/p;->Main:Ly0/p;

    iput-object p0, v0, LM/t$a;->a:Ljava/lang/Object;

    iput v3, v0, LM/t$a;->c:I

    invoke-interface {p0, p1, v0}, Ly0/b;->A1(Ly0/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_2
    check-cast p1, Ly0/n;

    invoke-virtual {p1}, Ly0/n;->c()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x0

    :goto_3
    if-ge v5, v4, :cond_5

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ly0/y;

    invoke-static {v6}, Ly0/o;->b(Ly0/y;)Z

    move-result v6

    if-nez v6, :cond_4

    goto :goto_1

    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_5
    return-object p1
.end method

.method private static final i(Landroidx/compose/ui/platform/w1;Ly0/y;Ly0/y;)Z
    .locals 2

    invoke-virtual {p1}, Ly0/y;->n()I

    move-result v0

    invoke-static {p0, v0}, Lw/j;->j(Landroidx/compose/ui/platform/w1;I)F

    move-result p0

    invoke-virtual {p1}, Ly0/y;->h()J

    move-result-wide v0

    invoke-virtual {p2}, Ly0/y;->h()J

    move-result-wide p1

    invoke-static {v0, v1, p1, p2}, Ll0/g;->q(JJ)J

    move-result-wide p1

    invoke-static {p1, p2}, Ll0/g;->k(J)F

    move-result p1

    cmpg-float p0, p1, p0

    if-gez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final j(Ly0/n;)Z
    .locals 5

    invoke-virtual {p0}, Ly0/n;->c()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly0/y;

    invoke-virtual {v3}, Ly0/y;->n()I

    move-result v3

    sget-object v4, Ly0/L;->a:Ly0/L$a;

    invoke-virtual {v4}, Ly0/L$a;->b()I

    move-result v4

    invoke-static {v3, v4}, Ly0/L;->g(II)Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x1

    :goto_1
    return v1
.end method

.method private static final k(Ly0/b;LM/i;LM/d;Ly0/n;Ldh/e;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p4, LM/t$b;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, LM/t$b;

    iget v1, v0, LM/t$b;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LM/t$b;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, LM/t$b;

    invoke-direct {v0, p4}, LM/t$b;-><init>(Ldh/e;)V

    :goto_0
    iget-object p4, v0, LM/t$b;->c:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LM/t$b;->d:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p0, v0, LM/t$b;->b:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, LM/i;

    iget-object p0, v0, LM/t$b;->a:Ljava/lang/Object;

    check-cast p0, Ly0/b;

    invoke-static {p4}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v0, LM/t$b;->b:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, LM/i;

    iget-object p0, v0, LM/t$b;->a:Ljava/lang/Object;

    check-cast p0, Ly0/b;

    invoke-static {p4}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p4}, LYg/v;->b(Ljava/lang/Object;)V

    invoke-virtual {p2, p3}, LM/d;->d(Ly0/n;)V

    invoke-virtual {p3}, Ly0/n;->c()Ljava/util/List;

    move-result-object p4

    invoke-interface {p4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ly0/y;

    invoke-static {p3}, LM/I;->b(Ly0/n;)Z

    move-result p3

    if-eqz p3, :cond_7

    invoke-virtual {p4}, Ly0/y;->h()J

    move-result-wide p2

    invoke-interface {p1, p2, p3}, LM/i;->e(J)Z

    move-result p2

    if-eqz p2, :cond_d

    invoke-virtual {p4}, Ly0/y;->f()J

    move-result-wide p2

    new-instance p4, LM/t$c;

    invoke-direct {p4, p1}, LM/t$c;-><init>(LM/i;)V

    iput-object p0, v0, LM/t$b;->a:Ljava/lang/Object;

    iput-object p1, v0, LM/t$b;->b:Ljava/lang/Object;

    iput v5, v0, LM/t$b;->d:I

    invoke-static {p0, p2, p3, p4, v0}, Lw/j;->h(Ly0/b;JLmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    check-cast p4, Ljava/lang/Boolean;

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-interface {p0}, Ly0/b;->Z()Ly0/n;

    move-result-object p0

    invoke-virtual {p0}, Ly0/n;->c()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p2

    :goto_2
    if-ge v3, p2, :cond_6

    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ly0/y;

    invoke-static {p3}, Ly0/o;->c(Ly0/y;)Z

    move-result p4

    if-eqz p4, :cond_5

    invoke-virtual {p3}, Ly0/y;->a()V

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_6
    invoke-interface {p1}, LM/i;->d()V

    goto :goto_6

    :cond_7
    invoke-virtual {p2}, LM/d;->a()I

    move-result p2

    if-eq p2, v5, :cond_9

    if-eq p2, v4, :cond_8

    sget-object p2, LM/r;->a:LM/r$a;

    invoke-virtual {p2}, LM/r$a;->n()LM/r;

    move-result-object p2

    goto :goto_3

    :cond_8
    sget-object p2, LM/r;->a:LM/r$a;

    invoke-virtual {p2}, LM/r$a;->o()LM/r;

    move-result-object p2

    goto :goto_3

    :cond_9
    sget-object p2, LM/r;->a:LM/r$a;

    invoke-virtual {p2}, LM/r$a;->m()LM/r;

    move-result-object p2

    :goto_3
    invoke-virtual {p4}, Ly0/y;->h()J

    move-result-wide v5

    invoke-interface {p1, v5, v6, p2}, LM/i;->c(JLM/r;)Z

    move-result p3

    if-eqz p3, :cond_d

    invoke-virtual {p4}, Ly0/y;->f()J

    move-result-wide p3

    new-instance v2, LM/t$d;

    invoke-direct {v2, p1, p2}, LM/t$d;-><init>(LM/i;LM/r;)V

    iput-object p0, v0, LM/t$b;->a:Ljava/lang/Object;

    iput-object p1, v0, LM/t$b;->b:Ljava/lang/Object;

    iput v4, v0, LM/t$b;->d:I

    invoke-static {p0, p3, p4, v2, v0}, Lw/j;->h(Ly0/b;JLmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_a

    return-object v1

    :cond_a
    :goto_4
    check-cast p4, Ljava/lang/Boolean;

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_c

    invoke-interface {p0}, Ly0/b;->Z()Ly0/n;

    move-result-object p0

    invoke-virtual {p0}, Ly0/n;->c()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p2

    :goto_5
    if-ge v3, p2, :cond_c

    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ly0/y;

    invoke-static {p3}, Ly0/o;->c(Ly0/y;)Z

    move-result p4

    if-eqz p4, :cond_b

    invoke-virtual {p3}, Ly0/y;->a()V

    :cond_b
    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_c
    invoke-interface {p1}, LM/i;->d()V

    :cond_d
    :goto_6
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final l(Ly0/b;LM/i;LM/d;Ly0/n;Ldh/e;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p4, LM/t$e;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, LM/t$e;

    iget v1, v0, LM/t$e;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LM/t$e;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, LM/t$e;

    invoke-direct {v0, p4}, LM/t$e;-><init>(Ldh/e;)V

    :goto_0
    iget-object p4, v0, LM/t$e;->c:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LM/t$e;->d:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p0, v0, LM/t$e;->b:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, LM/i;

    iget-object p0, v0, LM/t$e;->a:Ljava/lang/Object;

    check-cast p0, Ly0/b;

    :try_start_0
    invoke-static {p4}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_5

    :catchall_0
    move-exception p0

    goto/16 :goto_7

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v0, LM/t$e;->b:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, LM/i;

    iget-object p0, v0, LM/t$e;->a:Ljava/lang/Object;

    check-cast p0, Ly0/b;

    :try_start_1
    invoke-static {p4}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p0

    goto :goto_3

    :cond_3
    invoke-static {p4}, LYg/v;->b(Ljava/lang/Object;)V

    invoke-virtual {p3}, Ly0/n;->c()Ljava/util/List;

    move-result-object p4

    invoke-interface {p4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ly0/y;

    invoke-static {p3}, LM/I;->b(Ly0/n;)Z

    move-result p3

    if-eqz p3, :cond_7

    invoke-virtual {p4}, Ly0/y;->h()J

    move-result-wide p2

    invoke-interface {p1, p2, p3}, LM/i;->e(J)Z

    move-result p2

    if-eqz p2, :cond_d

    :try_start_2
    invoke-virtual {p4}, Ly0/y;->a()V

    invoke-virtual {p4}, Ly0/y;->f()J

    move-result-wide p2

    new-instance p4, LM/t$f;

    invoke-direct {p4, p1}, LM/t$f;-><init>(LM/i;)V

    iput-object p0, v0, LM/t$e;->a:Ljava/lang/Object;

    iput-object p1, v0, LM/t$e;->b:Ljava/lang/Object;

    iput v5, v0, LM/t$e;->d:I

    invoke-static {p0, p2, p3, p4, v0}, Lw/j;->h(Ly0/b;JLmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    check-cast p4, Ljava/lang/Boolean;

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-interface {p0}, Ly0/b;->Z()Ly0/n;

    move-result-object p0

    invoke-virtual {p0}, Ly0/n;->c()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p2

    :goto_2
    if-ge v3, p2, :cond_6

    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ly0/y;

    invoke-static {p3}, Ly0/o;->c(Ly0/y;)Z

    move-result p4

    if-eqz p4, :cond_5

    invoke-virtual {p3}, Ly0/y;->a()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_6
    invoke-interface {p1}, LM/i;->d()V

    goto/16 :goto_8

    :goto_3
    invoke-interface {p1}, LM/i;->d()V

    throw p0

    :cond_7
    invoke-virtual {p2}, LM/d;->a()I

    move-result p2

    if-eq p2, v5, :cond_9

    if-eq p2, v4, :cond_8

    sget-object p2, LM/r;->a:LM/r$a;

    invoke-virtual {p2}, LM/r$a;->n()LM/r;

    move-result-object p2

    goto :goto_4

    :cond_8
    sget-object p2, LM/r;->a:LM/r$a;

    invoke-virtual {p2}, LM/r$a;->o()LM/r;

    move-result-object p2

    goto :goto_4

    :cond_9
    sget-object p2, LM/r;->a:LM/r$a;

    invoke-virtual {p2}, LM/r$a;->m()LM/r;

    move-result-object p2

    :goto_4
    invoke-virtual {p4}, Ly0/y;->h()J

    move-result-wide v5

    invoke-interface {p1, v5, v6, p2}, LM/i;->c(JLM/r;)Z

    move-result p3

    if-eqz p3, :cond_d

    :try_start_3
    invoke-virtual {p4}, Ly0/y;->a()V

    invoke-virtual {p4}, Ly0/y;->f()J

    move-result-wide p3

    new-instance v2, LM/t$g;

    invoke-direct {v2, p1, p2}, LM/t$g;-><init>(LM/i;LM/r;)V

    iput-object p0, v0, LM/t$e;->a:Ljava/lang/Object;

    iput-object p1, v0, LM/t$e;->b:Ljava/lang/Object;

    iput v4, v0, LM/t$e;->d:I

    invoke-static {p0, p3, p4, v2, v0}, Lw/j;->h(Ly0/b;JLmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_a

    return-object v1

    :cond_a
    :goto_5
    check-cast p4, Ljava/lang/Boolean;

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_c

    invoke-interface {p0}, Ly0/b;->Z()Ly0/n;

    move-result-object p0

    invoke-virtual {p0}, Ly0/n;->c()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p2

    :goto_6
    if-ge v3, p2, :cond_c

    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ly0/y;

    invoke-static {p3}, Ly0/o;->c(Ly0/y;)Z

    move-result p4

    if-eqz p4, :cond_b

    invoke-virtual {p3}, Ly0/y;->a()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_b
    add-int/lit8 v3, v3, 0x1

    goto :goto_6

    :cond_c
    invoke-interface {p1}, LM/i;->d()V

    goto :goto_8

    :goto_7
    invoke-interface {p1}, LM/i;->d()V

    throw p0

    :cond_d
    :goto_8
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final m(Landroidx/compose/ui/e;LM/i;LF/U;)Landroidx/compose/ui/e;
    .locals 2

    new-instance v0, LM/t$h;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, LM/t$h;-><init>(LM/i;LF/U;Ldh/e;)V

    invoke-static {p0, p1, p2, v0}, Ly0/P;->c(Landroidx/compose/ui/e;Ljava/lang/Object;Ljava/lang/Object;Lmh/p;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method

.method public static final n(Ly0/G;LM/i;LF/U;Ldh/e;)Ljava/lang/Object;
    .locals 3

    new-instance v0, LM/d;

    invoke-interface {p0}, Ly0/G;->getViewConfiguration()Landroidx/compose/ui/platform/w1;

    move-result-object v1

    invoke-direct {v0, v1}, LM/d;-><init>(Landroidx/compose/ui/platform/w1;)V

    new-instance v1, LM/t$i;

    const/4 v2, 0x0

    invoke-direct {v1, v0, p1, p2, v2}, LM/t$i;-><init>(LM/d;LM/i;LF/U;Ldh/e;)V

    invoke-static {p0, v1, p3}, Lw/o;->d(Ly0/G;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final o(Ly0/b;LF/U;Ly0/n;Ldh/e;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p3, LM/t$j;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, LM/t$j;

    iget v1, v0, LM/t$j;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LM/t$j;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, LM/t$j;

    invoke-direct {v0, p3}, LM/t$j;-><init>(Ldh/e;)V

    :goto_0
    iget-object p3, v0, LM/t$j;->d:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LM/t$j;->e:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LM/t$j;->b:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, LF/U;

    iget-object p0, v0, LM/t$j;->a:Ljava/lang/Object;

    check-cast p0, Ly0/b;

    :try_start_0
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p0

    goto/16 :goto_5

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v0, LM/t$j;->c:Ljava/lang/Object;

    check-cast p0, Ly0/y;

    iget-object p1, v0, LM/t$j;->b:Ljava/lang/Object;

    check-cast p1, LF/U;

    iget-object p2, v0, LM/t$j;->a:Ljava/lang/Object;

    check-cast p2, Ly0/b;

    :try_start_1
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    move-object v7, p2

    move-object p2, p0

    move-object p0, v7

    goto :goto_1

    :cond_3
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_2
    invoke-virtual {p2}, Ly0/n;->c()Ljava/util/List;

    move-result-object p2

    invoke-static {p2}, LZg/v;->q0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ly0/y;

    invoke-virtual {p2}, Ly0/y;->f()J

    move-result-wide v5

    iput-object p0, v0, LM/t$j;->a:Ljava/lang/Object;

    iput-object p1, v0, LM/t$j;->b:Ljava/lang/Object;

    iput-object p2, v0, LM/t$j;->c:Ljava/lang/Object;

    iput v4, v0, LM/t$j;->e:I

    invoke-static {p0, v5, v6, v0}, Lw/j;->c(Ly0/b;JLdh/e;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    check-cast p3, Ly0/y;

    if-eqz p3, :cond_9

    invoke-interface {p0}, Ly0/b;->getViewConfiguration()Landroidx/compose/ui/platform/w1;

    move-result-object v2

    invoke-static {v2, p2, p3}, LM/t;->i(Landroidx/compose/ui/platform/w1;Ly0/y;Ly0/y;)Z

    move-result p2

    if-eqz p2, :cond_9

    invoke-virtual {p3}, Ly0/y;->h()J

    move-result-wide v4

    invoke-interface {p1, v4, v5}, LF/U;->c(J)V

    invoke-virtual {p3}, Ly0/y;->f()J

    move-result-wide p2

    new-instance v2, LM/t$k;

    invoke-direct {v2, p1}, LM/t$k;-><init>(LF/U;)V

    iput-object p0, v0, LM/t$j;->a:Ljava/lang/Object;

    iput-object p1, v0, LM/t$j;->b:Ljava/lang/Object;

    const/4 v4, 0x0

    iput-object v4, v0, LM/t$j;->c:Ljava/lang/Object;

    iput v3, v0, LM/t$j;->e:I

    invoke-static {p0, p2, p3, v2, v0}, Lw/j;->h(Ly0/b;JLmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_8

    invoke-interface {p0}, Ly0/b;->Z()Ly0/n;

    move-result-object p0

    invoke-virtual {p0}, Ly0/n;->c()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p2

    const/4 p3, 0x0

    :goto_3
    if-ge p3, p2, :cond_7

    invoke-interface {p0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly0/y;

    invoke-static {v0}, Ly0/o;->c(Ly0/y;)Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {v0}, Ly0/y;->a()V

    :cond_6
    add-int/lit8 p3, p3, 0x1

    goto :goto_3

    :cond_7
    invoke-interface {p1}, LF/U;->a()V

    goto :goto_4

    :cond_8
    invoke-interface {p1}, LF/U;->onCancel()V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0

    :cond_9
    :goto_4
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0

    :goto_5
    invoke-interface {p1}, LF/U;->onCancel()V

    throw p0
.end method

.method private static final p(Ly0/b;LF/U;Ly0/n;Ldh/e;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p3, LM/t$l;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, LM/t$l;

    iget v1, v0, LM/t$l;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LM/t$l;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, LM/t$l;

    invoke-direct {v0, p3}, LM/t$l;-><init>(Ldh/e;)V

    :goto_0
    iget-object p3, v0, LM/t$l;->d:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LM/t$l;->e:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LM/t$l;->b:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, LF/U;

    iget-object p0, v0, LM/t$l;->a:Ljava/lang/Object;

    check-cast p0, Ly0/b;

    :try_start_0
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p0

    goto/16 :goto_5

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v0, LM/t$l;->c:Ljava/lang/Object;

    check-cast p0, Ly0/y;

    iget-object p1, v0, LM/t$l;->b:Ljava/lang/Object;

    check-cast p1, LF/U;

    iget-object p2, v0, LM/t$l;->a:Ljava/lang/Object;

    check-cast p2, Ly0/b;

    :try_start_1
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    move-object v7, p2

    move-object p2, p0

    move-object p0, v7

    goto :goto_1

    :cond_3
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_2
    invoke-virtual {p2}, Ly0/n;->c()Ljava/util/List;

    move-result-object p2

    invoke-static {p2}, LZg/v;->q0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ly0/y;

    invoke-virtual {p2}, Ly0/y;->f()J

    move-result-wide v5

    iput-object p0, v0, LM/t$l;->a:Ljava/lang/Object;

    iput-object p1, v0, LM/t$l;->b:Ljava/lang/Object;

    iput-object p2, v0, LM/t$l;->c:Ljava/lang/Object;

    iput v4, v0, LM/t$l;->e:I

    invoke-static {p0, v5, v6, v0}, Lw/j;->c(Ly0/b;JLdh/e;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    check-cast p3, Ly0/y;

    if-eqz p3, :cond_9

    invoke-interface {p0}, Ly0/b;->getViewConfiguration()Landroidx/compose/ui/platform/w1;

    move-result-object v2

    invoke-static {v2, p2, p3}, LM/t;->i(Landroidx/compose/ui/platform/w1;Ly0/y;Ly0/y;)Z

    move-result p2

    if-eqz p2, :cond_9

    invoke-virtual {p3}, Ly0/y;->h()J

    move-result-wide v4

    invoke-interface {p1, v4, v5}, LF/U;->c(J)V

    invoke-virtual {p3}, Ly0/y;->f()J

    move-result-wide p2

    new-instance v2, LM/t$m;

    invoke-direct {v2, p1}, LM/t$m;-><init>(LF/U;)V

    iput-object p0, v0, LM/t$l;->a:Ljava/lang/Object;

    iput-object p1, v0, LM/t$l;->b:Ljava/lang/Object;

    const/4 v4, 0x0

    iput-object v4, v0, LM/t$l;->c:Ljava/lang/Object;

    iput v3, v0, LM/t$l;->e:I

    invoke-static {p0, p2, p3, v2, v0}, Lw/j;->h(Ly0/b;JLmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_8

    invoke-interface {p0}, Ly0/b;->Z()Ly0/n;

    move-result-object p0

    invoke-virtual {p0}, Ly0/n;->c()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p2

    const/4 p3, 0x0

    :goto_3
    if-ge p3, p2, :cond_7

    invoke-interface {p0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly0/y;

    invoke-static {v0}, Ly0/o;->c(Ly0/y;)Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {v0}, Ly0/y;->a()V

    :cond_6
    add-int/lit8 p3, p3, 0x1

    goto :goto_3

    :cond_7
    invoke-interface {p1}, LF/U;->a()V

    goto :goto_4

    :cond_8
    invoke-interface {p1}, LF/U;->onCancel()V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0

    :cond_9
    :goto_4
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0

    :goto_5
    invoke-interface {p1}, LF/U;->onCancel()V

    throw p0
.end method

.method private static final q(Ly0/b;LF/U;Ly0/n;Ldh/e;)Ljava/lang/Object;
    .locals 12

    instance-of v0, p3, LM/t$n;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, LM/t$n;

    iget v1, v0, LM/t$n;->g:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LM/t$n;->g:I

    goto :goto_0

    :cond_0
    new-instance v0, LM/t$n;

    invoke-direct {v0, p3}, LM/t$n;-><init>(Ldh/e;)V

    :goto_0
    iget-object p3, v0, LM/t$n;->f:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LM/t$n;->g:I

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LM/t$n;->b:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, LF/U;

    iget-object p0, v0, LM/t$n;->a:Ljava/lang/Object;

    check-cast p0, Ly0/b;

    :try_start_0
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_2

    :catch_0
    move-exception p0

    goto/16 :goto_5

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-wide p0, v0, LM/t$n;->e:J

    iget-object p2, v0, LM/t$n;->d:Ljava/lang/Object;

    check-cast p2, Lkotlin/jvm/internal/M;

    iget-object v2, v0, LM/t$n;->c:Ljava/lang/Object;

    check-cast v2, Ly0/y;

    iget-object v5, v0, LM/t$n;->b:Ljava/lang/Object;

    check-cast v5, LF/U;

    iget-object v6, v0, LM/t$n;->a:Ljava/lang/Object;

    check-cast v6, Ly0/b;

    :try_start_1
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1

    move-object v10, v6

    move-object v6, p2

    move-object v11, v5

    move-object v5, p3

    move-wide p2, p0

    move-object p1, v11

    move-object p0, v10

    goto :goto_1

    :catch_1
    move-exception p0

    move-object p1, v5

    goto/16 :goto_5

    :cond_3
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_2
    invoke-virtual {p2}, Ly0/n;->c()Ljava/util/List;

    move-result-object p2

    invoke-static {p2}, LZg/v;->q0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    move-object v2, p2

    check-cast v2, Ly0/y;

    invoke-virtual {v2}, Ly0/y;->f()J

    move-result-wide p2

    new-instance v6, Lkotlin/jvm/internal/M;

    invoke-direct {v6}, Lkotlin/jvm/internal/M;-><init>()V

    sget-object v7, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v7}, Ll0/g$a;->b()J

    move-result-wide v7

    iput-wide v7, v6, Lkotlin/jvm/internal/M;->a:J

    invoke-interface {p0}, Ly0/b;->getViewConfiguration()Landroidx/compose/ui/platform/w1;

    move-result-object v7

    invoke-interface {v7}, Landroidx/compose/ui/platform/w1;->c()J

    move-result-wide v7

    new-instance v9, LM/t$o;

    invoke-direct {v9, p2, p3, v6, v4}, LM/t$o;-><init>(JLkotlin/jvm/internal/M;Ldh/e;)V

    iput-object p0, v0, LM/t$n;->a:Ljava/lang/Object;

    iput-object p1, v0, LM/t$n;->b:Ljava/lang/Object;

    iput-object v2, v0, LM/t$n;->c:Ljava/lang/Object;

    iput-object v6, v0, LM/t$n;->d:Ljava/lang/Object;

    iput-wide p2, v0, LM/t$n;->e:J

    iput v5, v0, LM/t$n;->g:I

    invoke-interface {p0, v7, v8, v9, v0}, Ly0/b;->T1(JLmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    check-cast v5, LM/f;

    if-nez v5, :cond_5

    sget-object v5, LM/f;->Timeout:LM/f;

    :cond_5
    sget-object v7, LM/f;->Cancel:LM/f;

    if-ne v5, v7, :cond_6

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0

    :cond_6
    invoke-virtual {v2}, Ly0/y;->h()J

    move-result-wide v7

    invoke-interface {p1, v7, v8}, LF/U;->c(J)V

    sget-object v2, LM/f;->Up:LM/f;

    if-ne v5, v2, :cond_7

    invoke-interface {p1}, LF/U;->a()V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0

    :cond_7
    sget-object v2, LM/f;->Drag:LM/f;

    if-ne v5, v2, :cond_8

    iget-wide v5, v6, Lkotlin/jvm/internal/M;->a:J

    invoke-interface {p1, v5, v6}, LF/U;->e(J)V

    :cond_8
    new-instance v2, LM/t$p;

    invoke-direct {v2, p1}, LM/t$p;-><init>(LF/U;)V

    iput-object p0, v0, LM/t$n;->a:Ljava/lang/Object;

    iput-object p1, v0, LM/t$n;->b:Ljava/lang/Object;

    iput-object v4, v0, LM/t$n;->c:Ljava/lang/Object;

    iput-object v4, v0, LM/t$n;->d:Ljava/lang/Object;

    iput v3, v0, LM/t$n;->g:I

    invoke-static {p0, p2, p3, v2, v0}, Lw/j;->h(Ly0/b;JLmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_9

    return-object v1

    :cond_9
    :goto_2
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_c

    invoke-interface {p0}, Ly0/b;->Z()Ly0/n;

    move-result-object p0

    invoke-virtual {p0}, Ly0/n;->c()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p2

    const/4 p3, 0x0

    :goto_3
    if-ge p3, p2, :cond_b

    invoke-interface {p0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly0/y;

    invoke-static {v0}, Ly0/o;->c(Ly0/y;)Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-virtual {v0}, Ly0/y;->a()V

    :cond_a
    add-int/lit8 p3, p3, 0x1

    goto :goto_3

    :cond_b
    invoke-interface {p1}, LF/U;->a()V

    goto :goto_4

    :cond_c
    invoke-interface {p1}, LF/U;->onCancel()V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0

    :goto_4
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0

    :goto_5
    invoke-interface {p1}, LF/U;->onCancel()V

    throw p0
.end method

.method public static final r(Landroidx/compose/ui/e;Lmh/l;)Landroidx/compose/ui/e;
    .locals 3

    const v0, 0x845fed

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LM/t$q;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, LM/t$q;-><init>(Lmh/l;Ldh/e;)V

    invoke-static {p0, v0, v1}, Ly0/P;->d(Landroidx/compose/ui/e;Ljava/lang/Object;Lmh/p;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method
