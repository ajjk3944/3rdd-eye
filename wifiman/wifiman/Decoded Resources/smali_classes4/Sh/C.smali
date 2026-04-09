.class public abstract LSh/C;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final a(Ljava/lang/StringBuilder;Lpi/S;)V
    .locals 0

    invoke-static {p1}, LSh/C;->g(Lpi/S;)LSh/s;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public static final b(LBh/z;ZZ)Ljava/lang/String;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    if-eqz p2, :cond_1

    instance-of p2, p0, LBh/l;

    if-eqz p2, :cond_0

    const-string p2, "<init>"

    goto :goto_0

    :cond_0
    invoke-interface {p0}, LBh/I;->getName()LZh/f;

    move-result-object p2

    invoke-virtual {p2}, LZh/f;->b()Ljava/lang/String;

    move-result-object p2

    const-string v1, "asString(...)"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    const-string p2, "("

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p0}, LBh/a;->k0()LBh/b0;

    move-result-object p2

    const-string v1, "getType(...)"

    if-eqz p2, :cond_2

    invoke-interface {p2}, LBh/r0;->getType()Lpi/S;

    move-result-object p2

    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p2}, LSh/C;->a(Ljava/lang/StringBuilder;Lpi/S;)V

    :cond_2
    invoke-interface {p0}, LBh/a;->i()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LBh/s0;

    invoke-interface {v2}, LBh/r0;->getType()Lpi/S;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v2}, LSh/C;->a(Ljava/lang/StringBuilder;Lpi/S;)V

    goto :goto_1

    :cond_3
    const-string p2, ")"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p1, :cond_5

    invoke-static {p0}, LSh/j;->c(LBh/a;)Z

    move-result p1

    if-eqz p1, :cond_4

    const-string p0, "V"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_4
    invoke-interface {p0}, LBh/a;->getReturnType()Lpi/S;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {v0, p0}, LSh/C;->a(Ljava/lang/StringBuilder;Lpi/S;)V

    :cond_5
    :goto_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "toString(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static synthetic c(LBh/z;ZZILjava/lang/Object;)Ljava/lang/String;
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x1

    if-eqz p4, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move p2, v0

    :cond_1
    invoke-static {p0, p1, p2}, LSh/C;->b(LBh/z;ZZ)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final d(LBh/a;)Ljava/lang/String;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LSh/F;->a:LSh/F;

    invoke-static {p0}, Lbi/i;->E(LBh/m;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return-object v2

    :cond_0
    invoke-interface {p0}, LBh/n;->b()LBh/m;

    move-result-object v1

    instance-of v3, v1, LBh/e;

    if-eqz v3, :cond_1

    check-cast v1, LBh/e;

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    if-nez v1, :cond_2

    return-object v2

    :cond_2
    invoke-interface {v1}, LBh/I;->getName()LZh/f;

    move-result-object v3

    invoke-virtual {v3}, LZh/f;->j()Z

    move-result v3

    if-eqz v3, :cond_3

    return-object v2

    :cond_3
    invoke-interface {p0}, LBh/a;->a()LBh/a;

    move-result-object p0

    instance-of v3, p0, LBh/f0;

    if-eqz v3, :cond_4

    check-cast p0, LBh/f0;

    goto :goto_1

    :cond_4
    move-object p0, v2

    :goto_1
    if-nez p0, :cond_5

    return-object v2

    :cond_5
    const/4 v3, 0x3

    const/4 v4, 0x0

    invoke-static {p0, v4, v4, v3, v2}, LSh/C;->c(LBh/z;ZZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, v1, p0}, LSh/B;->a(LSh/F;LBh/e;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final e(LBh/a;)Z
    .locals 7

    const-string v0, "f"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LBh/z;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    move-object v0, p0

    check-cast v0, LBh/z;

    invoke-interface {v0}, LBh/I;->getName()LZh/f;

    move-result-object v2

    invoke-virtual {v2}, LZh/f;->b()Ljava/lang/String;

    move-result-object v2

    const-string v3, "remove"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v0}, LBh/a;->i()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_6

    check-cast p0, LBh/b;

    invoke-static {p0}, LJh/T;->n(LBh/b;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto/16 :goto_1

    :cond_1
    invoke-interface {v0}, LBh/z;->a()LBh/z;

    move-result-object p0

    invoke-interface {p0}, LBh/a;->i()Ljava/util/List;

    move-result-object p0

    const-string v2, "getValueParameters(...)"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LZg/v;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LBh/s0;

    invoke-interface {p0}, LBh/r0;->getType()Lpi/S;

    move-result-object p0

    const-string v4, "getType(...)"

    invoke-static {p0, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LSh/C;->g(Lpi/S;)LSh/s;

    move-result-object p0

    instance-of v5, p0, LSh/s$d;

    const/4 v6, 0x0

    if-eqz v5, :cond_2

    check-cast p0, LSh/s$d;

    goto :goto_0

    :cond_2
    move-object p0, v6

    :goto_0
    if-eqz p0, :cond_3

    invoke-virtual {p0}, LSh/s$d;->i()Lgi/e;

    move-result-object v6

    :cond_3
    sget-object p0, Lgi/e;->INT:Lgi/e;

    if-eq v6, p0, :cond_4

    return v1

    :cond_4
    invoke-static {v0}, LJh/i;->l(LBh/z;)LBh/z;

    move-result-object p0

    if-nez p0, :cond_5

    return v1

    :cond_5
    invoke-interface {p0}, LBh/z;->a()LBh/z;

    move-result-object v0

    invoke-interface {v0}, LBh/a;->i()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LZg/v;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LBh/s0;

    invoke-interface {v0}, LBh/r0;->getType()Lpi/S;

    move-result-object v0

    invoke-static {v0, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LSh/C;->g(Lpi/S;)LSh/s;

    move-result-object v0

    invoke-interface {p0}, LBh/z;->b()LBh/m;

    move-result-object p0

    const-string v2, "getContainingDeclaration(...)"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lfi/e;->p(LBh/m;)LZh/d;

    move-result-object p0

    sget-object v2, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->f0:LZh/c;

    invoke-virtual {v2}, LZh/c;->j()LZh/d;

    move-result-object v2

    invoke-static {p0, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_6

    instance-of p0, v0, LSh/s$c;

    if-eqz p0, :cond_6

    check-cast v0, LSh/s$c;

    invoke-virtual {v0}, LSh/s$c;->i()Ljava/lang/String;

    move-result-object p0

    const-string v0, "java/lang/Object"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_6

    move v1, v3

    :cond_6
    :goto_1
    return v1
.end method

.method public static final f(LBh/e;)Ljava/lang/String;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LAh/c;->a:LAh/c;

    invoke-static {p0}, Lfi/e;->o(LBh/m;)LZh/c;

    move-result-object v1

    invoke-virtual {v1}, LZh/c;->j()LZh/d;

    move-result-object v1

    const-string v2, "toUnsafe(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LAh/c;->n(LZh/d;)LZh/b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lgi/d;->h(LZh/b;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "internalNameByClassId(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_0
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p0, v1, v0, v1}, LSh/j;->b(LBh/e;LSh/G;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lpi/S;)LSh/s;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, LSh/u;->a:LSh/u;

    sget-object v3, LSh/I;->o:LSh/I;

    sget-object v4, LSh/H;->a:LSh/H;

    const/16 v7, 0x20

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v8}, LSh/j;->e(Lpi/S;LSh/t;LSh/I;LSh/G;LSh/q;Lmh/q;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LSh/s;

    return-object p0
.end method
