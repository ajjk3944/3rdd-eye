.class public abstract LSh/j;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LBh/e;LSh/G;)Ljava/lang/String;
    .locals 8

    const-string v0, "klass"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeMappingConfiguration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p0}, LSh/G;->e(LBh/e;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-interface {p0}, LBh/e;->b()LBh/m;

    move-result-object v0

    const-string v1, "getContainingDeclaration(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LBh/I;->getName()LZh/f;

    move-result-object v1

    invoke-static {v1}, LZh/h;->b(LZh/f;)LZh/f;

    move-result-object v1

    invoke-virtual {v1}, LZh/f;->d()Ljava/lang/String;

    move-result-object v1

    const-string v2, "getIdentifier(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, v0, LBh/M;

    if-eqz v2, :cond_2

    check-cast v0, LBh/M;

    invoke-interface {v0}, LBh/M;->e()LZh/c;

    move-result-object p0

    invoke-virtual {p0}, LZh/c;->d()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, LZh/c;->b()Ljava/lang/String;

    move-result-object v2

    const-string p0, "asString(...)"

    invoke-static {v2, p0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/16 v3, 0x2e

    const/16 v4, 0x2f

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lkotlin/text/t;->K(Ljava/lang/String;CCZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x2f

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_0
    return-object v1

    :cond_2
    instance-of v2, v0, LBh/e;

    if-eqz v2, :cond_3

    move-object v2, v0

    check-cast v2, LBh/e;

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_5

    invoke-interface {p1, v2}, LSh/G;->b(LBh/e;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_4

    invoke-static {v2, p1}, LSh/j;->a(LBh/e;LSh/G;)Ljava/lang/String;

    move-result-object p0

    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x24

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected container: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " for "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic b(LBh/e;LSh/G;ILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_0

    sget-object p1, LSh/H;->a:LSh/H;

    :cond_0
    invoke-static {p0, p1}, LSh/j;->a(LBh/e;LSh/G;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LBh/a;)Z
    .locals 2

    const-string v0, "descriptor"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LBh/l;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-interface {p0}, LBh/a;->getReturnType()Lpi/S;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->C0(Lpi/S;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, LBh/a;->getReturnType()Lpi/S;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {v0}, Lpi/J0;->l(Lpi/S;)Z

    move-result v0

    if-nez v0, :cond_1

    instance-of p0, p0, LBh/Z;

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public static final d(Lpi/S;LSh/t;LSh/I;LSh/G;LSh/q;Lmh/q;)Ljava/lang/Object;
    .locals 8

    const-string v0, "kotlinType"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "factory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeMappingConfiguration"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "writeGenericType"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p3, p0}, LSh/G;->d(Lpi/S;)Lpi/S;

    move-result-object v1

    if-eqz v1, :cond_0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-static/range {v1 .. v6}, LSh/j;->d(Lpi/S;LSh/t;LSh/I;LSh/G;LSh/q;Lmh/q;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/h;->r(Lpi/S;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/p;->a(Lpi/S;)Lpi/d0;

    move-result-object v1

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-static/range {v1 .. v6}, LSh/j;->d(Lpi/S;LSh/t;LSh/I;LSh/G;LSh/q;Lmh/q;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/checker/s;->a:Lkotlin/reflect/jvm/internal/impl/types/checker/s;

    invoke-static {v0, p0, p1, p2}, LSh/J;->b(Lpi/H0;Lri/i;LSh/t;LSh/I;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {p2}, LSh/I;->d()Z

    move-result p3

    invoke-static {p1, v1, p3}, LSh/J;->a(LSh/t;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p5, p0, p1, p2}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1

    :cond_2
    invoke-virtual {p0}, Lpi/S;->N0()Lpi/v0;

    move-result-object v1

    instance-of v2, v1, Lpi/Q;

    if-eqz v2, :cond_4

    check-cast v1, Lpi/Q;

    invoke-virtual {v1}, Lpi/Q;->l()Lpi/S;

    move-result-object p0

    if-nez p0, :cond_3

    invoke-virtual {v1}, Lpi/Q;->a()Ljava/util/Collection;

    move-result-object p0

    invoke-interface {p3, p0}, LSh/G;->c(Ljava/util/Collection;)Lpi/S;

    move-result-object p0

    :cond_3
    invoke-static {p0}, Lsi/d;->D(Lpi/S;)Lpi/S;

    move-result-object v0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-static/range {v0 .. v5}, LSh/j;->d(Lpi/S;LSh/t;LSh/I;LSh/G;LSh/q;Lmh/q;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_4
    invoke-interface {v1}, Lpi/v0;->c()LBh/h;

    move-result-object v1

    if-eqz v1, :cond_11

    invoke-static {v1}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->m(LBh/m;)Z

    move-result v2

    if-eqz v2, :cond_5

    const-string p2, "error/NonExistentClass"

    invoke-interface {p1, p2}, LSh/t;->c(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast v1, LBh/e;

    invoke-interface {p3, p0, v1}, LSh/G;->a(Lpi/S;LBh/e;)V

    return-object p1

    :cond_5
    instance-of v2, v1, LBh/e;

    if-eqz v2, :cond_8

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->c0(Lpi/S;)Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-virtual {p0}, Lpi/S;->L0()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_7

    invoke-virtual {p0}, Lpi/S;->L0()Ljava/util/List;

    move-result-object p0

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpi/B0;

    invoke-interface {p0}, Lpi/B0;->getType()Lpi/S;

    move-result-object v2

    const-string v0, "getType(...)"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lpi/B0;->a()Lpi/N0;

    move-result-object v0

    sget-object v3, Lpi/N0;->IN_VARIANCE:Lpi/N0;

    if-ne v0, v3, :cond_6

    const-string p0, "java/lang/Object"

    invoke-interface {p1, p0}, LSh/t;->c(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :cond_6
    invoke-interface {p0}, Lpi/B0;->a()Lpi/N0;

    move-result-object p0

    const-string v0, "getProjectionKind(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, p0, v1}, LSh/I;->f(Lpi/N0;Z)LSh/I;

    move-result-object v4

    move-object v3, p1

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-static/range {v2 .. v7}, LSh/j;->d(Lpi/S;LSh/t;LSh/I;LSh/G;LSh/q;Lmh/q;)Ljava/lang/Object;

    move-result-object p0

    :goto_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const/16 p3, 0x5b

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-interface {p1, p0}, LSh/t;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p0}, LSh/t;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_7
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "arrays must have one type argument"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8
    if-eqz v2, :cond_d

    invoke-static {v1}, Lbi/k;->b(LBh/m;)Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-virtual {p2}, LSh/I;->c()Z

    move-result v2

    if-nez v2, :cond_9

    invoke-static {v0, p0}, Lpi/H;->a(Lpi/H0;Lri/i;)Lri/i;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lpi/S;

    if-eqz v2, :cond_9

    invoke-virtual {p2}, LSh/I;->g()LSh/I;

    move-result-object v4

    move-object v3, p1

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-static/range {v2 .. v7}, LSh/j;->d(Lpi/S;LSh/t;LSh/I;LSh/G;LSh/q;Lmh/q;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_9
    invoke-virtual {p2}, LSh/I;->e()Z

    move-result p4

    if-eqz p4, :cond_a

    move-object p4, v1

    check-cast p4, LBh/e;

    invoke-static {p4}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->l0(LBh/e;)Z

    move-result p4

    if-eqz p4, :cond_a

    invoke-interface {p1}, LSh/t;->e()Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_a
    check-cast v1, LBh/e;

    invoke-interface {v1}, LBh/e;->a()LBh/e;

    move-result-object p4

    const-string v0, "getOriginal(...)"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p3, p4}, LSh/G;->f(LBh/e;)Ljava/lang/Object;

    move-result-object p4

    if-nez p4, :cond_c

    invoke-interface {v1}, LBh/e;->h()LBh/f;

    move-result-object p4

    sget-object v2, LBh/f;->ENUM_ENTRY:LBh/f;

    if-ne p4, v2, :cond_b

    invoke-interface {v1}, LBh/e;->b()LBh/m;

    move-result-object p4

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    invoke-static {p4, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p4

    check-cast v1, LBh/e;

    :cond_b
    invoke-interface {v1}, LBh/e;->a()LBh/e;

    move-result-object p4

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4, p3}, LSh/j;->a(LBh/e;LSh/G;)Ljava/lang/String;

    move-result-object p3

    invoke-interface {p1, p3}, LSh/t;->c(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_c
    move-object p1, p4

    :goto_1
    invoke-interface {p5, p0, p1, p2}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1

    :cond_d
    instance-of v0, v1, LBh/l0;

    if-eqz v0, :cond_f

    check-cast v1, LBh/l0;

    invoke-static {v1}, Lsi/d;->o(LBh/l0;)Lpi/S;

    move-result-object p4

    invoke-virtual {p0}, Lpi/S;->O0()Z

    move-result p0

    if-eqz p0, :cond_e

    invoke-static {p4}, Lsi/d;->B(Lpi/S;)Lpi/S;

    move-result-object p4

    :cond_e
    move-object v0, p4

    invoke-static {}, Lxi/j;->l()Lmh/q;

    move-result-object v5

    const/4 v4, 0x0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-static/range {v0 .. v5}, LSh/j;->d(Lpi/S;LSh/t;LSh/I;LSh/G;LSh/q;Lmh/q;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_f
    instance-of v0, v1, LBh/k0;

    if-eqz v0, :cond_10

    invoke-virtual {p2}, LSh/I;->b()Z

    move-result v0

    if-eqz v0, :cond_10

    check-cast v1, LBh/k0;

    invoke-interface {v1}, LBh/k0;->U()Lpi/d0;

    move-result-object v2

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-static/range {v2 .. v7}, LSh/j;->d(Lpi/S;LSh/t;LSh/I;LSh/G;LSh/q;Lmh/q;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_10
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Unknown type "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_11
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "no descriptor for type constructor of "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic e(Lpi/S;LSh/t;LSh/I;LSh/G;LSh/q;Lmh/q;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 6

    and-int/lit8 p6, p6, 0x20

    if-eqz p6, :cond_0

    invoke-static {}, Lxi/j;->l()Lmh/q;

    move-result-object p5

    :cond_0
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-static/range {v0 .. v5}, LSh/j;->d(Lpi/S;LSh/t;LSh/I;LSh/G;LSh/q;Lmh/q;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
