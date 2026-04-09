.class public abstract Lpi/d0;
.super Lpi/M0;
.source "SourceFile"

# interfaces
.implements Lri/j;
.implements Lri/k;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lpi/M0;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public abstract U0(Z)Lpi/d0;
.end method

.method public abstract V0(Lpi/r0;)Lpi/d0;
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lpi/S;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;

    sget-object v2, Lkotlin/reflect/jvm/internal/impl/renderer/n;->k:Lkotlin/reflect/jvm/internal/impl/renderer/n;

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v2, v1, v4, v3, v4}, Lkotlin/reflect/jvm/internal/impl/renderer/n;->Q(Lkotlin/reflect/jvm/internal/impl/renderer/n;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/e;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "] "

    const-string v3, "["

    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v10, v1}, Lkotlin/text/t;->m(Ljava/lang/StringBuilder;[Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lpi/S;->N0()Lpi/v0;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpi/S;->L0()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lpi/S;->L0()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    const/16 v8, 0x70

    const/4 v9, 0x0

    const-string v2, ", "

    const-string v3, "<"

    const-string v4, ">"

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, v10

    invoke-static/range {v0 .. v9}, LZg/v;->x0(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/Appendable;

    :cond_1
    invoke-virtual {p0}, Lpi/S;->O0()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "?"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
