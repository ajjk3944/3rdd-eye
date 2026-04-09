.class public abstract LM/s;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(LM/x;LM/c;)LM/l;
    .locals 0

    invoke-static {p0, p1}, LM/s;->e(LM/x;LM/c;)LM/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(LM/k;IIIZZ)LM/l$a;
    .locals 0

    invoke-static/range {p0 .. p5}, LM/s;->k(LM/k;IIIZZ)LM/l$a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(LM/x;LM/k;LM/l$a;)LM/l$a;
    .locals 0

    invoke-static {p0, p1, p2}, LM/s;->l(LM/x;LM/k;LM/l$a;)LM/l$a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(LYg/m;)I
    .locals 0

    invoke-static {p0}, LM/s;->m(LYg/m;)I

    move-result p0

    return p0
.end method

.method private static final e(LM/x;LM/c;)LM/l;
    .locals 6

    invoke-interface {p0}, LM/x;->i()LM/e;

    move-result-object v0

    sget-object v1, LM/e;->CROSSED:LM/e;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    new-instance v1, LM/l;

    invoke-interface {p0}, LM/x;->k()LM/k;

    move-result-object v4

    invoke-interface {p0}, LM/x;->l()I

    move-result v5

    invoke-static {v4, v0, v3, v5, p1}, LM/s;->f(LM/k;ZZILM/c;)LM/l$a;

    move-result-object v3

    invoke-interface {p0}, LM/x;->h()LM/k;

    move-result-object v4

    invoke-interface {p0}, LM/x;->g()I

    move-result p0

    invoke-static {v4, v0, v2, p0, p1}, LM/s;->f(LM/k;ZZILM/c;)LM/l$a;

    move-result-object p0

    invoke-direct {v1, v3, p0, v0}, LM/l;-><init>(LM/l$a;LM/l$a;Z)V

    return-object v1
.end method

.method private static final f(LM/k;ZZILM/c;)LM/l$a;
    .locals 2

    if-eqz p2, :cond_0

    invoke-virtual {p0}, LM/k;->g()I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LM/k;->e()I

    move-result v0

    :goto_0
    invoke-virtual {p0}, LM/k;->i()I

    move-result v1

    if-eq p3, v1, :cond_1

    invoke-virtual {p0, v0}, LM/k;->a(I)LM/l$a;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-interface {p4, p0, v0}, LM/c;->a(LM/k;I)J

    move-result-wide p3

    xor-int/2addr p1, p2

    if-eqz p1, :cond_2

    invoke-static {p3, p4}, LL0/S;->n(J)I

    move-result p1

    goto :goto_1

    :cond_2
    invoke-static {p3, p4}, LL0/S;->i(J)I

    move-result p1

    :goto_1
    invoke-virtual {p0, p1}, LM/k;->a(I)LM/l$a;

    move-result-object p0

    return-object p0
.end method

.method private static final g(LM/l$a;LM/k;I)LM/l$a;
    .locals 7

    invoke-virtual {p1}, LM/k;->k()LL0/M;

    move-result-object p1

    invoke-virtual {p1, p2}, LL0/M;->c(I)LW0/i;

    move-result-object v1

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-wide/16 v3, 0x0

    move-object v0, p0

    move v2, p2

    invoke-static/range {v0 .. v6}, LM/l$a;->b(LM/l$a;LW0/i;IJILjava/lang/Object;)LM/l$a;

    move-result-object p0

    return-object p0
.end method

.method public static final h(LM/l;LM/x;)LM/l;
    .locals 3

    invoke-static {p0, p1}, LM/y;->d(LM/l;LM/x;)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    invoke-interface {p1}, LM/x;->c()LM/k;

    move-result-object v0

    invoke-virtual {v0}, LM/k;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, LM/x;->a()I

    move-result v1

    const/4 v2, 0x1

    if-gt v1, v2, :cond_2

    invoke-interface {p1}, LM/x;->d()LM/l;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p0, p1}, LM/s;->i(LM/l;LM/x;)LM/l;

    move-result-object p0

    :cond_2
    :goto_0
    return-object p0
.end method

.method private static final i(LM/l;LM/x;)LM/l;
    .locals 12

    invoke-interface {p1}, LM/x;->c()LM/k;

    move-result-object v0

    invoke-virtual {v0}, LM/k;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, LM/k;->g()I

    move-result v2

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x0

    if-nez v2, :cond_1

    invoke-static {v1, v4}, LF/N;->a(Ljava/lang/String;I)I

    move-result v1

    invoke-interface {p1}, LM/x;->b()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LM/l;->e()LM/l$a;

    move-result-object p1

    invoke-static {p1, v0, v1}, LM/s;->g(LM/l$a;LM/k;I)LM/l$a;

    move-result-object v3

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    move-object v2, p0

    invoke-static/range {v2 .. v7}, LM/l;->b(LM/l;LM/l$a;LM/l$a;ZILjava/lang/Object;)LM/l;

    move-result-object p0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {p0}, LM/l;->c()LM/l$a;

    move-result-object p1

    invoke-static {p1, v0, v1}, LM/s;->g(LM/l$a;LM/k;I)LM/l$a;

    move-result-object v4

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v7}, LM/l;->b(LM/l;LM/l$a;LM/l$a;ZILjava/lang/Object;)LM/l;

    move-result-object p0

    goto/16 :goto_2

    :cond_1
    if-ne v2, v3, :cond_3

    invoke-static {v1, v3}, LF/N;->b(Ljava/lang/String;I)I

    move-result v1

    invoke-interface {p1}, LM/x;->b()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, LM/l;->e()LM/l$a;

    move-result-object p1

    invoke-static {p1, v0, v1}, LM/s;->g(LM/l$a;LM/k;I)LM/l$a;

    move-result-object v3

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v7}, LM/l;->b(LM/l;LM/l$a;LM/l$a;ZILjava/lang/Object;)LM/l;

    move-result-object p0

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, LM/l;->c()LM/l$a;

    move-result-object p1

    invoke-static {p1, v0, v1}, LM/s;->g(LM/l$a;LM/k;I)LM/l$a;

    move-result-object v4

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x1

    move-object v2, p0

    invoke-static/range {v2 .. v7}, LM/l;->b(LM/l;LM/l$a;LM/l$a;ZILjava/lang/Object;)LM/l;

    move-result-object p0

    goto :goto_2

    :cond_3
    invoke-interface {p1}, LM/x;->d()LM/l;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {v3}, LM/l;->d()Z

    move-result v3

    const/4 v5, 0x1

    if-ne v3, v5, :cond_4

    move v9, v5

    goto :goto_0

    :cond_4
    move v9, v4

    :goto_0
    invoke-interface {p1}, LM/x;->b()Z

    move-result v3

    xor-int/2addr v3, v9

    if-eqz v3, :cond_5

    invoke-static {v1, v2}, LF/N;->b(Ljava/lang/String;I)I

    move-result v1

    goto :goto_1

    :cond_5
    invoke-static {v1, v2}, LF/N;->a(Ljava/lang/String;I)I

    move-result v1

    :goto_1
    invoke-interface {p1}, LM/x;->b()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-virtual {p0}, LM/l;->e()LM/l$a;

    move-result-object p1

    invoke-static {p1, v0, v1}, LM/s;->g(LM/l$a;LM/k;I)LM/l$a;

    move-result-object v7

    const/4 v10, 0x2

    const/4 v11, 0x0

    const/4 v8, 0x0

    move-object v6, p0

    invoke-static/range {v6 .. v11}, LM/l;->b(LM/l;LM/l$a;LM/l$a;ZILjava/lang/Object;)LM/l;

    move-result-object p0

    goto :goto_2

    :cond_6
    invoke-virtual {p0}, LM/l;->c()LM/l$a;

    move-result-object p1

    invoke-static {p1, v0, v1}, LM/s;->g(LM/l$a;LM/k;I)LM/l$a;

    move-result-object v8

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v7, 0x0

    move-object v6, p0

    invoke-static/range {v6 .. v11}, LM/l;->b(LM/l;LM/l$a;LM/l$a;ZILjava/lang/Object;)LM/l;

    move-result-object p0

    :goto_2
    return-object p0
.end method

.method private static final j(LM/k;IZ)Z
    .locals 4

    invoke-virtual {p0}, LM/k;->f()I

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    return v2

    :cond_0
    invoke-virtual {p0}, LM/k;->f()I

    move-result v0

    const/4 v1, 0x0

    if-ne p1, v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0}, LM/k;->d()LM/e;

    move-result-object v0

    sget-object v3, LM/e;->CROSSED:LM/e;

    if-ne v0, v3, :cond_2

    move v0, v2

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    xor-int/2addr p2, v0

    if-eqz p2, :cond_4

    invoke-virtual {p0}, LM/k;->f()I

    move-result p0

    if-ge p1, p0, :cond_3

    goto :goto_1

    :cond_3
    move v2, v1

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, LM/k;->f()I

    move-result p0

    if-le p1, p0, :cond_3

    :goto_1
    return v2
.end method

.method private static final k(LM/k;IIIZZ)LM/l$a;
    .locals 5

    invoke-virtual {p0}, LM/k;->k()LL0/M;

    move-result-object v0

    invoke-virtual {v0, p2}, LL0/M;->C(I)J

    move-result-wide v0

    invoke-virtual {p0}, LM/k;->k()LL0/M;

    move-result-object v2

    invoke-static {v0, v1}, LL0/S;->n(J)I

    move-result v3

    invoke-virtual {v2, v3}, LL0/M;->q(I)I

    move-result v2

    if-ne v2, p1, :cond_0

    invoke-static {v0, v1}, LL0/S;->n(J)I

    move-result v2

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LM/k;->k()LL0/M;

    move-result-object v2

    invoke-virtual {v2}, LL0/M;->n()I

    move-result v2

    if-lt p1, v2, :cond_1

    invoke-virtual {p0}, LM/k;->k()LL0/M;

    move-result-object v2

    invoke-virtual {p0}, LM/k;->k()LL0/M;

    move-result-object v3

    invoke-virtual {v3}, LL0/M;->n()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {v2, v3}, LL0/M;->u(I)I

    move-result v2

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, LM/k;->k()LL0/M;

    move-result-object v2

    invoke-virtual {v2, p1}, LL0/M;->u(I)I

    move-result v2

    :goto_0
    invoke-virtual {p0}, LM/k;->k()LL0/M;

    move-result-object v3

    invoke-static {v0, v1}, LL0/S;->i(J)I

    move-result v4

    invoke-virtual {v3, v4}, LL0/M;->q(I)I

    move-result v3

    if-ne v3, p1, :cond_2

    invoke-static {v0, v1}, LL0/S;->i(J)I

    move-result p1

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, LM/k;->k()LL0/M;

    move-result-object v0

    invoke-virtual {v0}, LL0/M;->n()I

    move-result v0

    const/4 v1, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-lt p1, v0, :cond_3

    invoke-virtual {p0}, LM/k;->k()LL0/M;

    move-result-object p1

    invoke-virtual {p0}, LM/k;->k()LL0/M;

    move-result-object v0

    invoke-virtual {v0}, LL0/M;->n()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {p1, v0, v4, v3, v1}, LL0/M;->p(LL0/M;IZILjava/lang/Object;)I

    move-result p1

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, LM/k;->k()LL0/M;

    move-result-object v0

    invoke-static {v0, p1, v4, v3, v1}, LL0/M;->p(LL0/M;IZILjava/lang/Object;)I

    move-result p1

    :goto_1
    if-ne v2, p3, :cond_4

    invoke-virtual {p0, p1}, LM/k;->a(I)LM/l$a;

    move-result-object p0

    return-object p0

    :cond_4
    if-ne p1, p3, :cond_5

    invoke-virtual {p0, v2}, LM/k;->a(I)LM/l$a;

    move-result-object p0

    return-object p0

    :cond_5
    xor-int p3, p4, p5

    if-eqz p3, :cond_6

    if-gt p2, p1, :cond_7

    goto :goto_2

    :cond_6
    if-lt p2, v2, :cond_8

    :cond_7
    move v2, p1

    :cond_8
    :goto_2
    invoke-virtual {p0, v2}, LM/k;->a(I)LM/l$a;

    move-result-object p0

    return-object p0
.end method

.method private static final l(LM/x;LM/k;LM/l$a;)LM/l$a;
    .locals 10

    invoke-interface {p0}, LM/x;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LM/k;->g()I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LM/k;->e()I

    move-result v0

    :goto_0
    invoke-interface {p0}, LM/x;->b()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, LM/x;->l()I

    move-result v1

    goto :goto_1

    :cond_1
    invoke-interface {p0}, LM/x;->g()I

    move-result v1

    :goto_1
    invoke-virtual {p1}, LM/k;->i()I

    move-result v2

    if-eq v1, v2, :cond_2

    invoke-virtual {p1, v0}, LM/k;->a(I)LM/l$a;

    move-result-object p0

    return-object p0

    :cond_2
    sget-object v7, LYg/q;->NONE:LYg/q;

    new-instance v1, LM/s$b;

    invoke-direct {v1, p1, v0}, LM/s$b;-><init>(LM/k;I)V

    invoke-static {v7, v1}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object v8

    invoke-interface {p0}, LM/x;->b()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p1}, LM/k;->e()I

    move-result v1

    :goto_2
    move v4, v1

    goto :goto_3

    :cond_3
    invoke-virtual {p1}, LM/k;->g()I

    move-result v1

    goto :goto_2

    :goto_3
    new-instance v9, LM/s$a;

    move-object v1, v9

    move-object v2, p1

    move v3, v0

    move-object v5, p0

    move-object v6, v8

    invoke-direct/range {v1 .. v6}, LM/s$a;-><init>(LM/k;IILM/x;LYg/m;)V

    invoke-static {v7, v9}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object v1

    invoke-virtual {p1}, LM/k;->h()J

    move-result-wide v2

    invoke-virtual {p2}, LM/l$a;->d()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-eqz v2, :cond_4

    invoke-static {v1}, LM/s;->n(LYg/m;)LM/l$a;

    move-result-object p0

    return-object p0

    :cond_4
    invoke-virtual {p1}, LM/k;->f()I

    move-result v2

    if-ne v0, v2, :cond_5

    return-object p2

    :cond_5
    invoke-virtual {p1}, LM/k;->k()LL0/M;

    move-result-object v3

    invoke-virtual {v3, v2}, LL0/M;->q(I)I

    move-result v2

    invoke-static {v8}, LM/s;->m(LYg/m;)I

    move-result v3

    if-eq v3, v2, :cond_6

    invoke-static {v1}, LM/s;->n(LYg/m;)LM/l$a;

    move-result-object p0

    return-object p0

    :cond_6
    invoke-virtual {p2}, LM/l$a;->c()I

    move-result p2

    invoke-virtual {p1}, LM/k;->k()LL0/M;

    move-result-object v2

    invoke-virtual {v2, p2}, LL0/M;->C(I)J

    move-result-wide v2

    invoke-interface {p0}, LM/x;->b()Z

    move-result p0

    invoke-static {p1, v0, p0}, LM/s;->j(LM/k;IZ)Z

    move-result p0

    if-nez p0, :cond_7

    invoke-virtual {p1, v0}, LM/k;->a(I)LM/l$a;

    move-result-object p0

    return-object p0

    :cond_7
    invoke-static {v2, v3}, LL0/S;->n(J)I

    move-result p0

    if-eq p2, p0, :cond_9

    invoke-static {v2, v3}, LL0/S;->i(J)I

    move-result p0

    if-ne p2, p0, :cond_8

    goto :goto_4

    :cond_8
    invoke-virtual {p1, v0}, LM/k;->a(I)LM/l$a;

    move-result-object p0

    return-object p0

    :cond_9
    :goto_4
    invoke-static {v1}, LM/s;->n(LYg/m;)LM/l$a;

    move-result-object p0

    return-object p0
.end method

.method private static final m(LYg/m;)I
    .locals 0

    invoke-interface {p0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method private static final n(LYg/m;)LM/l$a;
    .locals 0

    invoke-interface {p0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LM/l$a;

    return-object p0
.end method
