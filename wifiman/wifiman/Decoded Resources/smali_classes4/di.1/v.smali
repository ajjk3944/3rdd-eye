.class public abstract Ldi/v;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LBh/G;)Ljava/util/Collection;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LBh/G;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->D()Lpi/d0;

    move-result-object v0

    invoke-interface {p0}, LBh/G;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object v1

    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->F()Lpi/d0;

    move-result-object v1

    invoke-interface {p0}, LBh/G;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object v2

    invoke-virtual {v2}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->t()Lpi/d0;

    move-result-object v2

    invoke-interface {p0}, LBh/G;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object p0

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->T()Lpi/d0;

    move-result-object p0

    filled-new-array {v0, v1, v2, p0}, [Lpi/d0;

    move-result-object p0

    invoke-static {p0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    return-object p0
.end method
