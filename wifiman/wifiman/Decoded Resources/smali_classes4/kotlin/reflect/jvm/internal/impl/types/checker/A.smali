.class public abstract Lkotlin/reflect/jvm/internal/impl/types/checker/A;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final a(Lpi/S;)Lpi/S;
    .locals 0

    invoke-static {p0}, Lti/c;->b(Lpi/S;)Lti/a;

    move-result-object p0

    invoke-virtual {p0}, Lti/a;->d()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpi/S;

    return-object p0
.end method

.method private static final b(Lpi/v0;)Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/reflect/jvm/internal/impl/types/checker/A;->c(Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "hashCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/reflect/jvm/internal/impl/types/checker/A;->c(Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "javaClass: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/reflect/jvm/internal/impl/types/checker/A;->c(Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    invoke-interface {p0}, Lpi/v0;->c()LBh/h;

    move-result-object p0

    :goto_0
    if-eqz p0, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "fqName: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Lkotlin/reflect/jvm/internal/impl/renderer/n;->h:Lkotlin/reflect/jvm/internal/impl/renderer/n;

    invoke-virtual {v3, p0}, Lkotlin/reflect/jvm/internal/impl/renderer/n;->O(LBh/m;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/reflect/jvm/internal/impl/types/checker/A;->c(Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/reflect/jvm/internal/impl/types/checker/A;->c(Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    invoke-interface {p0}, LBh/m;->b()LBh/m;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "toString(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final c(Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "append(...)"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0xa

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p1, p0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public static final d(Lpi/S;Lpi/S;Lkotlin/reflect/jvm/internal/impl/types/checker/x;)Lpi/S;
    .locals 9

    const-string v0, "subtype"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "supertype"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeCheckingProcedureCallbacks"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    new-instance v1, Lkotlin/reflect/jvm/internal/impl/types/checker/u;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lkotlin/reflect/jvm/internal/impl/types/checker/u;-><init>(Lpi/S;Lkotlin/reflect/jvm/internal/impl/types/checker/u;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lpi/S;->N0()Lpi/v0;

    move-result-object p0

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_9

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/reflect/jvm/internal/impl/types/checker/u;

    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/u;->b()Lpi/S;

    move-result-object v1

    invoke-virtual {v1}, Lpi/S;->N0()Lpi/v0;

    move-result-object v3

    invoke-interface {p2, v3, p0}, Lkotlin/reflect/jvm/internal/impl/types/checker/x;->a(Lpi/v0;Lpi/v0;)Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-virtual {v1}, Lpi/S;->O0()Z

    move-result v0

    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/u;->a()Lkotlin/reflect/jvm/internal/impl/types/checker/u;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/u;->b()Lpi/S;

    move-result-object v3

    invoke-virtual {v3}, Lpi/S;->L0()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    instance-of v5, v4, Ljava/util/Collection;

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v5, :cond_1

    move-object v5, v4

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpi/B0;

    invoke-interface {v5}, Lpi/B0;->a()Lpi/N0;

    move-result-object v5

    sget-object v8, Lpi/N0;->INVARIANT:Lpi/N0;

    if-eq v5, v8, :cond_2

    sget-object v4, Lpi/w0;->c:Lpi/w0$a;

    invoke-virtual {v4, v3}, Lpi/w0$a;->a(Lpi/S;)Lpi/E0;

    move-result-object v4

    invoke-static {v4, v7, v6, v2}, Lci/e;->h(Lpi/E0;ZILjava/lang/Object;)Lpi/E0;

    move-result-object v4

    invoke-virtual {v4}, Lpi/E0;->c()Lpi/G0;

    move-result-object v4

    invoke-virtual {v4, v1, v8}, Lpi/G0;->n(Lpi/S;Lpi/N0;)Lpi/S;

    move-result-object v1

    const-string v4, "safeSubstitute(...)"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lkotlin/reflect/jvm/internal/impl/types/checker/A;->a(Lpi/S;)Lpi/S;

    move-result-object v1

    goto :goto_2

    :cond_3
    :goto_1
    sget-object v4, Lpi/w0;->c:Lpi/w0$a;

    invoke-virtual {v4, v3}, Lpi/w0$a;->a(Lpi/S;)Lpi/E0;

    move-result-object v4

    invoke-virtual {v4}, Lpi/E0;->c()Lpi/G0;

    move-result-object v4

    sget-object v5, Lpi/N0;->INVARIANT:Lpi/N0;

    invoke-virtual {v4, v1, v5}, Lpi/G0;->n(Lpi/S;Lpi/N0;)Lpi/S;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :goto_2
    if-nez v0, :cond_5

    invoke-virtual {v3}, Lpi/S;->O0()Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_3

    :cond_4
    move v0, v7

    goto :goto_4

    :cond_5
    :goto_3
    move v0, v6

    :goto_4
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/u;->a()Lkotlin/reflect/jvm/internal/impl/types/checker/u;

    move-result-object p1

    goto :goto_0

    :cond_6
    invoke-virtual {v1}, Lpi/S;->N0()Lpi/v0;

    move-result-object p1

    invoke-interface {p2, p1, p0}, Lkotlin/reflect/jvm/internal/impl/types/checker/x;->a(Lpi/v0;Lpi/v0;)Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-static {v1, v0}, Lpi/J0;->p(Lpi/S;Z)Lpi/S;

    move-result-object p0

    return-object p0

    :cond_7
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Type constructors should be equals!\nsubstitutedSuperType: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/A;->b(Lpi/v0;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", \n\nsupertype: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/types/checker/A;->b(Lpi/v0;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " \n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2, p1, p0}, Lkotlin/reflect/jvm/internal/impl/types/checker/x;->a(Lpi/v0;Lpi/v0;)Z

    move-result p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_8
    invoke-interface {v3}, Lpi/v0;->a()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpi/S;

    new-instance v4, Lkotlin/reflect/jvm/internal/impl/types/checker/u;

    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {v4, v3, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/u;-><init>(Lpi/S;Lkotlin/reflect/jvm/internal/impl/types/checker/u;)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_9
    return-object v2
.end method
