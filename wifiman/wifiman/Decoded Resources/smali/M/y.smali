.class public abstract LM/y;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(LL0/M;I)LW0/i;
    .locals 0

    invoke-static {p0, p1}, LM/y;->b(LL0/M;I)LW0/i;

    move-result-object p0

    return-object p0
.end method

.method private static final b(LL0/M;I)LW0/i;
    .locals 1

    invoke-static {p0, p1}, LM/y;->e(LL0/M;I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, LL0/M;->y(I)LW0/i;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, LL0/M;->c(I)LW0/i;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static final c(LL0/M;IIIJZZ)LM/x;
    .locals 11

    move-object v7, p0

    new-instance v8, LM/E;

    if-eqz p6, :cond_0

    const/4 v0, 0x0

    :goto_0
    move-object v9, v0

    goto :goto_1

    :cond_0
    new-instance v0, LM/l;

    new-instance v1, LM/l$a;

    invoke-static/range {p4 .. p5}, LL0/S;->n(J)I

    move-result v2

    invoke-static {p0, v2}, LM/y;->b(LL0/M;I)LW0/i;

    move-result-object v2

    invoke-static/range {p4 .. p5}, LL0/S;->n(J)I

    move-result v3

    const-wide/16 v4, 0x1

    invoke-direct {v1, v2, v3, v4, v5}, LM/l$a;-><init>(LW0/i;IJ)V

    new-instance v2, LM/l$a;

    invoke-static/range {p4 .. p5}, LL0/S;->i(J)I

    move-result v3

    invoke-static {p0, v3}, LM/y;->b(LL0/M;I)LW0/i;

    move-result-object v3

    invoke-static/range {p4 .. p5}, LL0/S;->i(J)I

    move-result v6

    invoke-direct {v2, v3, v6, v4, v5}, LM/l$a;-><init>(LW0/i;IJ)V

    invoke-static/range {p4 .. p5}, LL0/S;->m(J)Z

    move-result v3

    invoke-direct {v0, v1, v2, v3}, LM/l;-><init>(LM/l$a;LM/l$a;Z)V

    goto :goto_0

    :goto_1
    new-instance v10, LM/k;

    const-wide/16 v1, 0x1

    const/4 v3, 0x1

    move-object v0, v10

    move v4, p1

    move v5, p2

    move v6, p3

    move-object v7, p0

    invoke-direct/range {v0 .. v7}, LM/k;-><init>(JIIIILL0/M;)V

    const/4 v0, 0x1

    const/4 v1, 0x1

    move-object p0, v8

    move/from16 p1, p7

    move p2, v0

    move p3, v1

    move-object p4, v9

    move-object/from16 p5, v10

    invoke-direct/range {p0 .. p5}, LM/E;-><init>(ZIILM/l;LM/k;)V

    return-object v8
.end method

.method public static final d(LM/l;LM/x;)Z
    .locals 5

    const/4 v0, 0x1

    if-nez p0, :cond_0

    return v0

    :cond_0
    if-nez p1, :cond_1

    return v0

    :cond_1
    invoke-virtual {p0}, LM/l;->e()LM/l$a;

    move-result-object v1

    invoke-virtual {v1}, LM/l$a;->d()J

    move-result-wide v1

    invoke-virtual {p0}, LM/l;->c()LM/l$a;

    move-result-object v3

    invoke-virtual {v3}, LM/l$a;->d()J

    move-result-wide v3

    cmp-long v1, v1, v3

    const/4 v2, 0x0

    if-nez v1, :cond_3

    invoke-virtual {p0}, LM/l;->e()LM/l$a;

    move-result-object p1

    invoke-virtual {p1}, LM/l$a;->c()I

    move-result p1

    invoke-virtual {p0}, LM/l;->c()LM/l$a;

    move-result-object p0

    invoke-virtual {p0}, LM/l$a;->c()I

    move-result p0

    if-ne p1, p0, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0

    :cond_3
    invoke-virtual {p0}, LM/l;->d()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p0}, LM/l;->e()LM/l$a;

    move-result-object v1

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, LM/l;->c()LM/l$a;

    move-result-object v1

    :goto_1
    invoke-virtual {v1}, LM/l$a;->c()I

    move-result v1

    if-eqz v1, :cond_5

    return v2

    :cond_5
    invoke-virtual {p0}, LM/l;->d()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {p0}, LM/l;->c()LM/l$a;

    move-result-object p0

    goto :goto_2

    :cond_6
    invoke-virtual {p0}, LM/l;->e()LM/l$a;

    move-result-object p0

    :goto_2
    invoke-interface {p1}, LM/x;->e()LM/k;

    move-result-object v1

    invoke-virtual {v1}, LM/k;->l()I

    move-result v1

    invoke-virtual {p0}, LM/l$a;->c()I

    move-result p0

    if-eq v1, p0, :cond_7

    return v2

    :cond_7
    new-instance p0, Lkotlin/jvm/internal/J;

    invoke-direct {p0}, Lkotlin/jvm/internal/J;-><init>()V

    iput-boolean v0, p0, Lkotlin/jvm/internal/J;->a:Z

    new-instance v0, LM/y$a;

    invoke-direct {v0, p0}, LM/y$a;-><init>(Lkotlin/jvm/internal/J;)V

    invoke-interface {p1, v0}, LM/x;->f(Lmh/l;)V

    iget-boolean p0, p0, Lkotlin/jvm/internal/J;->a:Z

    return p0
.end method

.method private static final e(LL0/M;I)Z
    .locals 3

    invoke-virtual {p0}, LL0/M;->l()LL0/L;

    move-result-object v0

    invoke-virtual {v0}, LL0/L;->j()LL0/d;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, LL0/M;->q(I)I

    move-result v0

    if-eqz p1, :cond_1

    add-int/lit8 v2, p1, -0x1

    invoke-virtual {p0, v2}, LL0/M;->q(I)I

    move-result v2

    if-eq v0, v2, :cond_2

    :cond_1
    invoke-virtual {p0}, LL0/M;->l()LL0/L;

    move-result-object v2

    invoke-virtual {v2}, LL0/L;->j()LL0/d;

    move-result-object v2

    invoke-virtual {v2}, LL0/d;->length()I

    move-result v2

    if-eq p1, v2, :cond_3

    add-int/2addr p1, v1

    invoke-virtual {p0, p1}, LL0/M;->q(I)I

    move-result p0

    if-eq v0, p0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :cond_3
    :goto_0
    return v1
.end method
