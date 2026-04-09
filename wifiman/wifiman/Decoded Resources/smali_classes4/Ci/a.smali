.class public abstract LCi/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a()LCi/f;
    .locals 1

    invoke-static {}, LDi/l;->b()LCi/f;

    move-result-object v0

    return-object v0
.end method

.method public static final varargs b([Ljava/lang/Object;)LCi/f;
    .locals 1

    const-string v0, "elements"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LDi/l;->b()LCi/f;

    move-result-object v0

    invoke-static {p0}, LZg/n;->e([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    invoke-interface {v0, p0}, LCi/f;->addAll(Ljava/util/Collection;)LCi/f;

    move-result-object p0

    return-object p0
.end method

.method public static final c()LCi/g;
    .locals 1

    sget-object v0, LFi/c;->e:LFi/c$a;

    invoke-virtual {v0}, LFi/c$a;->a()LFi/c;

    move-result-object v0

    return-object v0
.end method

.method public static final d()LCi/h;
    .locals 1

    sget-object v0, LGi/b;->e:LGi/b$a;

    invoke-virtual {v0}, LGi/b$a;->a()LCi/h;

    move-result-object v0

    return-object v0
.end method

.method public static final varargs e([Ljava/lang/Object;)LCi/h;
    .locals 1

    const-string v0, "elements"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LGi/b;->e:LGi/b$a;

    invoke-virtual {v0}, LGi/b$a;->a()LCi/h;

    move-result-object v0

    invoke-static {p0}, LZg/n;->e([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    invoke-interface {v0, p0}, LCi/h;->addAll(Ljava/util/Collection;)LCi/h;

    move-result-object p0

    return-object p0
.end method

.method public static final f(LCi/f;Ljava/lang/Iterable;)LCi/f;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Ljava/util/Collection;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p0, p1}, LCi/f;->addAll(Ljava/util/Collection;)LCi/f;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, LCi/f;->c()LCi/f$a;

    move-result-object p0

    invoke-static {p0, p1}, LZg/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    invoke-interface {p0}, LCi/f$a;->a()LCi/f;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static final g(LCi/f;Lzi/j;)LCi/f;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LCi/f;->c()LCi/f$a;

    move-result-object p0

    invoke-static {p0, p1}, LZg/v;->D(Ljava/util/Collection;Lzi/j;)Z

    invoke-interface {p0}, LCi/f$a;->a()LCi/f;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Ljava/lang/Iterable;)LCi/c;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LCi/c;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, LCi/c;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    invoke-static {p0}, LCi/a;->k(Ljava/lang/Iterable;)LCi/f;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public static final i(Lzi/j;)LCi/c;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LCi/a;->l(Lzi/j;)LCi/f;

    move-result-object p0

    return-object p0
.end method

.method public static final j(Ljava/util/Map;)LCi/d;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LCi/d;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, LCi/d;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_4

    instance-of v0, p0, LCi/g$a;

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, LCi/g$a;

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_2

    invoke-interface {v0}, LCi/g$a;->a()LCi/g;

    move-result-object v1

    :cond_2
    if-eqz v1, :cond_3

    move-object v0, v1

    goto :goto_2

    :cond_3
    invoke-static {}, LCi/a;->c()LCi/g;

    move-result-object v0

    invoke-interface {v0, p0}, LCi/g;->putAll(Ljava/util/Map;)LCi/g;

    move-result-object v0

    :cond_4
    :goto_2
    return-object v0
.end method

.method public static final k(Ljava/lang/Iterable;)LCi/f;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LCi/f;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, LCi/f;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_4

    instance-of v0, p0, LCi/f$a;

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, LCi/f$a;

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_2

    invoke-interface {v0}, LCi/f$a;->a()LCi/f;

    move-result-object v1

    :cond_2
    if-nez v1, :cond_3

    invoke-static {}, LCi/a;->a()LCi/f;

    move-result-object v0

    invoke-static {v0, p0}, LCi/a;->f(LCi/f;Ljava/lang/Iterable;)LCi/f;

    move-result-object v0

    goto :goto_2

    :cond_3
    move-object v0, v1

    :cond_4
    :goto_2
    return-object v0
.end method

.method public static final l(Lzi/j;)LCi/f;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LCi/a;->a()LCi/f;

    move-result-object v0

    invoke-static {v0, p0}, LCi/a;->g(LCi/f;Lzi/j;)LCi/f;

    move-result-object p0

    return-object p0
.end method
