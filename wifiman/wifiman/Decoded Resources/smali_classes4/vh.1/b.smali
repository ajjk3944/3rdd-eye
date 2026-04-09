.class public abstract Lvh/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lth/e;)Lth/d;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lth/d;

    if-eqz v0, :cond_0

    check-cast p0, Lth/d;

    goto :goto_0

    :cond_0
    instance-of v0, p0, Lth/q;

    if-eqz v0, :cond_7

    check-cast p0, Lth/q;

    invoke-interface {p0}, Lth/q;->getUpperBounds()Ljava/util/List;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lth/p;

    const-string v4, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lwh/U0;

    invoke-virtual {v3}, Lwh/U0;->u()Lpi/S;

    move-result-object v3

    invoke-virtual {v3}, Lpi/S;->N0()Lpi/v0;

    move-result-object v3

    invoke-interface {v3}, Lpi/v0;->c()LBh/h;

    move-result-object v3

    instance-of v4, v3, LBh/e;

    if-eqz v4, :cond_2

    move-object v2, v3

    check-cast v2, LBh/e;

    :cond_2
    if-eqz v2, :cond_1

    invoke-interface {v2}, LBh/e;->h()LBh/f;

    move-result-object v3

    sget-object v4, LBh/f;->INTERFACE:LBh/f;

    if-eq v3, v4, :cond_1

    invoke-interface {v2}, LBh/e;->h()LBh/f;

    move-result-object v2

    sget-object v3, LBh/f;->ANNOTATION_CLASS:LBh/f;

    if-eq v2, v3, :cond_1

    move-object v2, v1

    :cond_3
    check-cast v2, Lth/p;

    if-nez v2, :cond_4

    invoke-static {p0}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    move-object v2, p0

    check-cast v2, Lth/p;

    :cond_4
    if-eqz v2, :cond_5

    invoke-static {v2}, Lvh/b;->b(Lth/p;)Lth/d;

    move-result-object p0

    if-nez p0, :cond_6

    :cond_5
    const-class p0, Ljava/lang/Object;

    invoke-static {p0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object p0

    :cond_6
    :goto_0
    return-object p0

    :cond_7
    new-instance v0, Lwh/Y0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot calculate JVM erasure for type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lwh/Y0;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final b(Lth/p;)Lth/d;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lth/p;->r()Lth/e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lvh/b;->a(Lth/e;)Lth/d;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lwh/Y0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot calculate JVM erasure for type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lwh/Y0;-><init>(Ljava/lang/String;)V

    throw v0
.end method
