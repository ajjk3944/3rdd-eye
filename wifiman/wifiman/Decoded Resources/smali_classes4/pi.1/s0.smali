.class public abstract Lpi/s0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lpi/r0;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)Lpi/r0;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newAnnotations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lpi/t;->a(Lpi/r0;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v0

    if-ne v0, p1, :cond_0

    return-object p0

    :cond_0
    invoke-static {p0}, Lpi/t;->b(Lpi/r0;)Lpi/s;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0, v0}, Lpi/r0;->u(Lpi/p0;)Lpi/r0;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    move-object p0, v0

    :cond_2
    :goto_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-interface {p1}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    return-object p0

    :cond_3
    new-instance v0, Lpi/s;

    invoke-direct {v0, p1}, Lpi/s;-><init>(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)V

    invoke-virtual {p0, v0}, Lpi/r0;->s(Lpi/p0;)Lpi/r0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)Lpi/r0;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lpi/x;->a:Lpi/x;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v6}, Lpi/q0$a;->a(Lpi/q0;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;Lpi/v0;LBh/m;ILjava/lang/Object;)Lpi/r0;

    move-result-object p0

    return-object p0
.end method
