.class public abstract LT0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/lang/String;LL0/U;Ljava/util/List;Ljava/util/List;LY0/d;LQ0/k$b;)LL0/s;
    .locals 8

    new-instance v7, LT0/d;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p5

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, LT0/d;-><init>(Ljava/lang/String;LL0/U;Ljava/util/List;Ljava/util/List;LQ0/k$b;LY0/d;)V

    return-object v7
.end method

.method public static final synthetic b(LL0/U;)Z
    .locals 0

    invoke-static {p0}, LT0/e;->c(LL0/U;)Z

    move-result p0

    return p0
.end method

.method private static final c(LL0/U;)Z
    .locals 1

    invoke-virtual {p0}, LL0/U;->w()LL0/B;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LL0/B;->a()LL0/z;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LL0/z;->b()I

    move-result p0

    invoke-static {p0}, LL0/h;->d(I)LL0/h;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    sget-object v0, LL0/h;->b:LL0/h$a;

    invoke-virtual {v0}, LL0/h$a;->c()I

    move-result v0

    if-nez p0, :cond_1

    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, LL0/h;->j()I

    move-result p0

    invoke-static {p0, v0}, LL0/h;->g(II)Z

    move-result p0

    :goto_1
    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static final d(ILS0/e;)I
    .locals 6

    sget-object v0, LW0/l;->b:LW0/l$a;

    invoke-virtual {v0}, LW0/l$a;->b()I

    move-result v1

    invoke-static {p0, v1}, LW0/l;->j(II)Z

    move-result v1

    const/4 v2, 0x2

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, LW0/l$a;->c()I

    move-result v1

    invoke-static {p0, v1}, LW0/l;->j(II)Z

    move-result v1

    const/4 v3, 0x3

    if-eqz v1, :cond_2

    :cond_1
    move v2, v3

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, LW0/l$a;->d()I

    move-result v1

    invoke-static {p0, v1}, LW0/l;->j(II)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_3

    move v2, v4

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, LW0/l$a;->e()I

    move-result v1

    invoke-static {p0, v1}, LW0/l;->j(II)Z

    move-result v1

    const/4 v5, 0x1

    if-eqz v1, :cond_4

    move v2, v5

    goto :goto_1

    :cond_4
    invoke-virtual {v0}, LW0/l$a;->a()I

    move-result v1

    invoke-static {p0, v1}, LW0/l;->j(II)Z

    move-result v1

    if-eqz v1, :cond_5

    move p0, v5

    goto :goto_0

    :cond_5
    invoke-virtual {v0}, LW0/l$a;->f()I

    move-result v0

    invoke-static {p0, v0}, LW0/l;->j(II)Z

    move-result p0

    :goto_0
    if-eqz p0, :cond_9

    if-eqz p1, :cond_6

    invoke-virtual {p1, v4}, LS0/e;->f(I)LS0/d;

    move-result-object p0

    invoke-virtual {p0}, LS0/d;->a()Ljava/util/Locale;

    move-result-object p0

    if-nez p0, :cond_7

    :cond_6
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p0

    :cond_7
    invoke-static {p0}, LD1/n;->a(Ljava/util/Locale;)I

    move-result p0

    if-eqz p0, :cond_8

    if-eq p0, v5, :cond_1

    :cond_8
    :goto_1
    return v2

    :cond_9
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Invalid TextDirection."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
