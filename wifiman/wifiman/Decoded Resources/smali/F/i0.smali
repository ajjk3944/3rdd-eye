.class public abstract LF/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LL0/M;LL0/d;LL0/U;Ljava/util/List;IZILY0/d;LY0/t;LQ0/k$b;J)Z
    .locals 2

    invoke-virtual {p0}, LL0/M;->l()LL0/L;

    move-result-object v0

    invoke-virtual {p0}, LL0/M;->w()LL0/k;

    move-result-object p0

    invoke-virtual {p0}, LL0/k;->j()LL0/l;

    move-result-object p0

    invoke-virtual {p0}, LL0/l;->c()Z

    move-result p0

    const/4 v1, 0x0

    if-eqz p0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, LL0/L;->j()LL0/d;

    move-result-object p0

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    invoke-virtual {v0}, LL0/L;->i()LL0/U;

    move-result-object p0

    invoke-virtual {p0, p2}, LL0/U;->G(LL0/U;)Z

    move-result p0

    if-eqz p0, :cond_4

    invoke-virtual {v0}, LL0/L;->g()Ljava/util/List;

    move-result-object p0

    invoke-static {p0, p3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    invoke-virtual {v0}, LL0/L;->e()I

    move-result p0

    if-ne p0, p4, :cond_4

    invoke-virtual {v0}, LL0/L;->h()Z

    move-result p0

    if-ne p0, p5, :cond_4

    invoke-virtual {v0}, LL0/L;->f()I

    move-result p0

    invoke-static {p0, p6}, LW0/t;->e(II)Z

    move-result p0

    if-eqz p0, :cond_4

    invoke-virtual {v0}, LL0/L;->b()LY0/d;

    move-result-object p0

    invoke-static {p0, p7}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    invoke-virtual {v0}, LL0/L;->d()LY0/t;

    move-result-object p0

    if-ne p0, p8, :cond_4

    invoke-virtual {v0}, LL0/L;->c()LQ0/k$b;

    move-result-object p0

    invoke-static {p0, p9}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p10, p11}, LY0/b;->n(J)I

    move-result p0

    invoke-virtual {v0}, LL0/L;->a()J

    move-result-wide p1

    invoke-static {p1, p2}, LY0/b;->n(J)I

    move-result p1

    if-eq p0, p1, :cond_2

    return v1

    :cond_2
    const/4 p0, 0x1

    if-nez p5, :cond_3

    sget-object p1, LW0/t;->a:LW0/t$a;

    invoke-virtual {p1}, LW0/t$a;->b()I

    move-result p1

    invoke-static {p6, p1}, LW0/t;->e(II)Z

    move-result p1

    if-nez p1, :cond_3

    return p0

    :cond_3
    invoke-static {p10, p11}, LY0/b;->l(J)I

    move-result p1

    invoke-virtual {v0}, LL0/L;->a()J

    move-result-wide p2

    invoke-static {p2, p3}, LY0/b;->l(J)I

    move-result p2

    if-ne p1, p2, :cond_4

    invoke-static {p10, p11}, LY0/b;->k(J)I

    move-result p1

    invoke-virtual {v0}, LL0/L;->a()J

    move-result-wide p2

    invoke-static {p2, p3}, LY0/b;->k(J)I

    move-result p2

    if-ne p1, p2, :cond_4

    move v1, p0

    :cond_4
    :goto_0
    return v1
.end method
