.class public abstract LBh/s;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LBh/m;)LBh/h;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LBh/m;->b()LBh/m;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    instance-of p0, p0, LBh/M;

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v0}, LBh/s;->b(LBh/m;)Z

    move-result p0

    if-nez p0, :cond_1

    invoke-static {v0}, LBh/s;->a(LBh/m;)LBh/h;

    move-result-object v1

    goto :goto_0

    :cond_1
    instance-of p0, v0, LBh/h;

    if-eqz p0, :cond_2

    move-object v1, v0

    check-cast v1, LBh/h;

    :cond_2
    :goto_0
    return-object v1
.end method

.method public static final b(LBh/m;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LBh/m;->b()LBh/m;

    move-result-object p0

    instance-of p0, p0, LBh/M;

    return p0
.end method

.method public static final c(LBh/z;)Z
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LBh/z;->b()LBh/m;

    move-result-object v0

    instance-of v1, v0, LBh/e;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, LBh/e;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_5

    invoke-static {v0}, Lbi/k;->g(LBh/m;)Z

    move-result v3

    if-eqz v3, :cond_1

    move-object v2, v0

    :cond_1
    if-eqz v2, :cond_5

    invoke-interface {v2}, LBh/e;->u()Lpi/d0;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-static {v0}, Lsi/d;->D(Lpi/S;)Lpi/S;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {p0}, LBh/a;->getReturnType()Lpi/S;

    move-result-object v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    invoke-interface {p0}, LBh/I;->getName()LZh/f;

    move-result-object v3

    sget-object v4, Lui/t;->e:LZh/f;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-static {v2}, Lsi/d;->s(Lpi/S;)Z

    move-result v3

    if-nez v3, :cond_4

    invoke-static {v2}, Lsi/d;->t(Lpi/S;)Z

    move-result v2

    if-eqz v2, :cond_5

    :cond_4
    invoke-interface {p0}, LBh/a;->i()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_5

    invoke-interface {p0}, LBh/a;->i()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LBh/s0;

    invoke-interface {v2}, LBh/r0;->getType()Lpi/S;

    move-result-object v2

    const-string v4, "getType(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lsi/d;->D(Lpi/S;)Lpi/S;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p0}, LBh/a;->p0()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p0}, LBh/a;->k0()LBh/b0;

    move-result-object p0

    if-nez p0, :cond_5

    move v1, v3

    :cond_5
    :goto_1
    return v1
.end method

.method public static final d(LBh/G;LZh/c;LIh/b;)LBh/e;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lookupLocation"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LZh/c;->d()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p1}, LZh/c;->e()LZh/c;

    move-result-object v0

    const-string v2, "parent(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, v0}, LBh/G;->y(LZh/c;)LBh/U;

    move-result-object v0

    invoke-interface {v0}, LBh/U;->r()Lii/k;

    move-result-object v0

    invoke-virtual {p1}, LZh/c;->g()LZh/f;

    move-result-object v3

    const-string v4, "shortName(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v3, p2}, Lii/n;->g(LZh/f;LIh/b;)LBh/h;

    move-result-object v0

    instance-of v3, v0, LBh/e;

    if-eqz v3, :cond_1

    check-cast v0, LBh/e;

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_2

    return-object v0

    :cond_2
    invoke-virtual {p1}, LZh/c;->e()LZh/c;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, v0, p2}, LBh/s;->d(LBh/G;LZh/c;LIh/b;)LBh/e;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-interface {p0}, LBh/e;->y0()Lii/k;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-virtual {p1}, LZh/c;->g()LZh/f;

    move-result-object p1

    invoke-static {p1, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1, p2}, Lii/n;->g(LZh/f;LIh/b;)LBh/h;

    move-result-object p0

    goto :goto_1

    :cond_3
    move-object p0, v1

    :goto_1
    instance-of p1, p0, LBh/e;

    if-eqz p1, :cond_4

    move-object v1, p0

    check-cast v1, LBh/e;

    :cond_4
    return-object v1
.end method
