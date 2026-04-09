.class public abstract LBh/y;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static synthetic a(LZh/b;)I
    .locals 0

    invoke-static {p0}, LBh/y;->e(LZh/b;)I

    move-result p0

    return p0
.end method

.method public static final b(LBh/G;LZh/b;)LBh/e;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "classId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, LBh/y;->c(LBh/G;LZh/b;)LBh/h;

    move-result-object p0

    instance-of p1, p0, LBh/e;

    if-eqz p1, :cond_0

    check-cast p0, LBh/e;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final c(LBh/G;LZh/b;)LBh/h;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "classId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lbi/s;->a(LBh/G;)LBh/G;

    move-result-object v0

    const/4 v1, 0x1

    const-string v2, "first(...)"

    const-string v3, "pathSegments(...)"

    const/4 v4, 0x0

    if-nez v0, :cond_4

    invoke-virtual {p1}, LZh/b;->f()LZh/c;

    move-result-object v0

    invoke-interface {p0, v0}, LBh/G;->y(LZh/c;)LBh/U;

    move-result-object p0

    invoke-virtual {p1}, LZh/b;->g()LZh/c;

    move-result-object p1

    invoke-virtual {p1}, LZh/c;->f()Ljava/util/List;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LBh/U;->r()Lii/k;

    move-result-object p0

    invoke-static {p1}, LZg/v;->q0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LZh/f;

    sget-object v2, LIh/d;->FROM_DESERIALIZATION:LIh/d;

    invoke-interface {p0, v0, v2}, Lii/n;->g(LZh/f;LIh/b;)LBh/h;

    move-result-object p0

    if-nez p0, :cond_0

    goto/16 :goto_8

    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p1, v1, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZh/f;

    instance-of v1, p0, LBh/e;

    if-nez v1, :cond_1

    goto/16 :goto_8

    :cond_1
    check-cast p0, LBh/e;

    invoke-interface {p0}, LBh/e;->y0()Lii/k;

    move-result-object p0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    sget-object v1, LIh/d;->FROM_DESERIALIZATION:LIh/d;

    invoke-interface {p0, v0, v1}, Lii/n;->g(LZh/f;LIh/b;)LBh/h;

    move-result-object p0

    instance-of v0, p0, LBh/e;

    if-eqz v0, :cond_2

    check-cast p0, LBh/e;

    goto :goto_1

    :cond_2
    move-object p0, v4

    :goto_1
    if-eqz p0, :cond_e

    goto :goto_0

    :cond_3
    move-object v4, p0

    goto/16 :goto_8

    :cond_4
    invoke-virtual {p1}, LZh/b;->f()LZh/c;

    move-result-object v5

    invoke-interface {v0, v5}, LBh/G;->y(LZh/c;)LBh/U;

    move-result-object v0

    invoke-virtual {p1}, LZh/b;->g()LZh/c;

    move-result-object v5

    invoke-virtual {v5}, LZh/c;->f()Ljava/util/List;

    move-result-object v5

    invoke-static {v5, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, LBh/U;->r()Lii/k;

    move-result-object v0

    invoke-static {v5}, LZg/v;->q0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, LZh/f;

    sget-object v7, LIh/d;->FROM_DESERIALIZATION:LIh/d;

    invoke-interface {v0, v6, v7}, Lii/n;->g(LZh/f;LIh/b;)LBh/h;

    move-result-object v0

    if-nez v0, :cond_6

    :cond_5
    :goto_2
    move-object v0, v4

    goto :goto_5

    :cond_6
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    invoke-interface {v5, v1, v6}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LZh/f;

    instance-of v7, v0, LBh/e;

    if-nez v7, :cond_7

    goto :goto_2

    :cond_7
    check-cast v0, LBh/e;

    invoke-interface {v0}, LBh/e;->y0()Lii/k;

    move-result-object v0

    invoke-static {v6}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    sget-object v7, LIh/d;->FROM_DESERIALIZATION:LIh/d;

    invoke-interface {v0, v6, v7}, Lii/n;->g(LZh/f;LIh/b;)LBh/h;

    move-result-object v0

    instance-of v6, v0, LBh/e;

    if-eqz v6, :cond_8

    check-cast v0, LBh/e;

    goto :goto_4

    :cond_8
    move-object v0, v4

    :goto_4
    if-eqz v0, :cond_5

    goto :goto_3

    :cond_9
    :goto_5
    if-nez v0, :cond_d

    invoke-virtual {p1}, LZh/b;->f()LZh/c;

    move-result-object v0

    invoke-interface {p0, v0}, LBh/G;->y(LZh/c;)LBh/U;

    move-result-object p0

    invoke-virtual {p1}, LZh/b;->g()LZh/c;

    move-result-object p1

    invoke-virtual {p1}, LZh/c;->f()Ljava/util/List;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LBh/U;->r()Lii/k;

    move-result-object p0

    invoke-static {p1}, LZg/v;->q0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LZh/f;

    sget-object v2, LIh/d;->FROM_DESERIALIZATION:LIh/d;

    invoke-interface {p0, v0, v2}, Lii/n;->g(LZh/f;LIh/b;)LBh/h;

    move-result-object p0

    if-nez p0, :cond_a

    goto :goto_8

    :cond_a
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p1, v1, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZh/f;

    instance-of v1, p0, LBh/e;

    if-nez v1, :cond_b

    goto :goto_8

    :cond_b
    check-cast p0, LBh/e;

    invoke-interface {p0}, LBh/e;->y0()Lii/k;

    move-result-object p0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    sget-object v1, LIh/d;->FROM_DESERIALIZATION:LIh/d;

    invoke-interface {p0, v0, v1}, Lii/n;->g(LZh/f;LIh/b;)LBh/h;

    move-result-object p0

    instance-of v0, p0, LBh/e;

    if-eqz v0, :cond_c

    check-cast p0, LBh/e;

    goto :goto_7

    :cond_c
    move-object p0, v4

    :goto_7
    if-eqz p0, :cond_e

    goto :goto_6

    :cond_d
    move-object v4, v0

    :cond_e
    :goto_8
    return-object v4
.end method

.method public static final d(LBh/G;LZh/b;LBh/L;)LBh/e;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "classId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notFoundClasses"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, LBh/y;->b(LBh/G;LZh/b;)LBh/e;

    move-result-object p0

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    sget-object p0, LBh/y$a;->b:LBh/y$a;

    invoke-static {p1, p0}, Lzi/m;->n(Ljava/lang/Object;Lmh/l;)Lzi/j;

    move-result-object p0

    sget-object v0, LBh/x;->a:LBh/x;

    invoke-static {p0, v0}, Lzi/m;->N(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object p0

    invoke-static {p0}, Lzi/m;->Z(Lzi/j;)Ljava/util/List;

    move-result-object p0

    invoke-virtual {p2, p1, p0}, LBh/L;->d(LZh/b;Ljava/util/List;)LBh/e;

    move-result-object p0

    return-object p0
.end method

.method private static final e(LZh/b;)I
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0
.end method

.method public static final f(LBh/G;LZh/b;)LBh/k0;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "classId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, LBh/y;->c(LBh/G;LZh/b;)LBh/h;

    move-result-object p0

    instance-of p1, p0, LBh/k0;

    if-eqz p1, :cond_0

    check-cast p0, LBh/k0;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method
