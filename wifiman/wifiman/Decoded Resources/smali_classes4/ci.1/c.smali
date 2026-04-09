.class public final Lci/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lci/b;


# instance fields
.field private final a:Lpi/B0;

.field private b:Lkotlin/reflect/jvm/internal/impl/types/checker/n;


# direct methods
.method public constructor <init>(Lpi/B0;)V
    .locals 1

    const-string v0, "projection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lci/c;->a:Lpi/B0;

    invoke-virtual {p0}, Lci/c;->e()Lpi/B0;

    move-result-object p1

    invoke-interface {p1}, Lpi/B0;->a()Lpi/N0;

    sget-object p1, Lpi/N0;->INVARIANT:Lpi/N0;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Collection;
    .locals 2

    invoke-virtual {p0}, Lci/c;->e()Lpi/B0;

    move-result-object v0

    invoke-interface {v0}, Lpi/B0;->a()Lpi/N0;

    move-result-object v0

    sget-object v1, Lpi/N0;->OUT_VARIANCE:Lpi/N0;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lci/c;->e()Lpi/B0;

    move-result-object v0

    invoke-interface {v0}, Lpi/B0;->getType()Lpi/S;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lci/c;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->I()Lpi/d0;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {v0}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public bridge synthetic b(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/v0;
    .locals 0

    invoke-virtual {p0, p1}, Lci/c;->h(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lci/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c()LBh/h;
    .locals 1

    invoke-virtual {p0}, Lci/c;->f()Ljava/lang/Void;

    move-result-object v0

    check-cast v0, LBh/h;

    return-object v0
.end method

.method public d()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public e()Lpi/B0;
    .locals 1

    iget-object v0, p0, Lci/c;->a:Lpi/B0;

    return-object v0
.end method

.method public f()Ljava/lang/Void;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final g()Lkotlin/reflect/jvm/internal/impl/types/checker/n;
    .locals 1

    iget-object v0, p0, Lci/c;->b:Lkotlin/reflect/jvm/internal/impl/types/checker/n;

    return-object v0
.end method

.method public getParameters()Ljava/util/List;
    .locals 1

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public h(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lci/c;
    .locals 2

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lci/c;

    invoke-virtual {p0}, Lci/c;->e()Lpi/B0;

    move-result-object v1

    invoke-interface {v1, p1}, Lpi/B0;->b(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/B0;

    move-result-object p1

    const-string v1, "refine(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1}, Lci/c;-><init>(Lpi/B0;)V

    return-object v0
.end method

.method public final i(Lkotlin/reflect/jvm/internal/impl/types/checker/n;)V
    .locals 0

    iput-object p1, p0, Lci/c;->b:Lkotlin/reflect/jvm/internal/impl/types/checker/n;

    return-void
.end method

.method public q()Lkotlin/reflect/jvm/internal/impl/builtins/i;
    .locals 2

    invoke-virtual {p0}, Lci/c;->e()Lpi/B0;

    move-result-object v0

    invoke-interface {v0}, Lpi/B0;->getType()Lpi/S;

    move-result-object v0

    invoke-virtual {v0}, Lpi/S;->N0()Lpi/v0;

    move-result-object v0

    invoke-interface {v0}, Lpi/v0;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object v0

    const-string v1, "getBuiltIns(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CapturedTypeConstructor("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lci/c;->e()Lpi/B0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
