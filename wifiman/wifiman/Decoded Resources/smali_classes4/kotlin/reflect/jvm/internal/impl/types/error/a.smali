.class public final Lkotlin/reflect/jvm/internal/impl/types/error/a;
.super LDh/k;
.source "SourceFile"


# direct methods
.method public constructor <init>(LZh/f;)V
    .locals 12

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/error/l;->a:Lkotlin/reflect/jvm/internal/impl/types/error/l;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->i()LBh/G;

    move-result-object v2

    sget-object v4, LBh/D;->OPEN:LBh/D;

    sget-object v5, LBh/f;->CLASS:LBh/f;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Ljava/util/Collection;

    sget-object v10, LBh/g0;->a:LBh/g0;

    const/4 v8, 0x0

    sget-object v9, Loi/f;->e:Loi/n;

    move-object v1, p0

    move-object v3, p1

    move-object v7, v10

    invoke-direct/range {v1 .. v9}, LDh/k;-><init>(LBh/m;LZh/f;LBh/D;LBh/f;Ljava/util/Collection;LBh/g0;ZLoi/n;)V

    sget-object p1, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->b()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object p1

    const/4 v1, 0x1

    invoke-static {p0, p1, v1, v10}, LDh/i;->n1(LBh/e;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;ZLBh/g0;)LDh/i;

    move-result-object p1

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v1

    sget-object v2, LBh/t;->d:LBh/u;

    invoke-virtual {p1, v1, v2}, LDh/i;->q1(Ljava/util/List;LBh/u;)LDh/i;

    const-string v1, "apply(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/types/error/h;->SCOPE_FOR_ERROR_CLASS:Lkotlin/reflect/jvm/internal/impl/types/error/h;

    invoke-virtual {p1}, LDh/m;->getName()LZh/f;

    move-result-object v2

    invoke-virtual {v2}, LZh/f;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, ""

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->b(Lkotlin/reflect/jvm/internal/impl/types/error/h;[Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/types/error/g;

    move-result-object v1

    new-instance v2, Lkotlin/reflect/jvm/internal/impl/types/error/i;

    sget-object v6, Lkotlin/reflect/jvm/internal/impl/types/error/k;->ERROR_CLASS:Lkotlin/reflect/jvm/internal/impl/types/error/k;

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/String;

    invoke-virtual {v0, v6, v4}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->e(Lkotlin/reflect/jvm/internal/impl/types/error/k;[Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/types/error/j;

    move-result-object v4

    new-array v9, v3, [Ljava/lang/String;

    const/16 v10, 0x18

    const/4 v11, 0x0

    const/4 v7, 0x0

    move-object v3, v2

    move-object v5, v1

    invoke-direct/range {v3 .. v11}, Lkotlin/reflect/jvm/internal/impl/types/error/i;-><init>(Lpi/v0;Lii/k;Lkotlin/reflect/jvm/internal/impl/types/error/k;Ljava/util/List;Z[Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v2}, LDh/s;->g1(Lpi/S;)V

    invoke-static {p1}, LZg/d0;->c(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p0, v1, v0, p1}, LDh/k;->K0(Lii/k;Ljava/util/Set;LBh/d;)V

    return-void
.end method


# virtual methods
.method public G0(Lpi/G0;)LBh/e;
    .locals 1

    const-string v0, "substitutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public I(Lpi/E0;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lii/k;
    .locals 1

    const-string v0, "typeSubstitution"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lkotlin/reflect/jvm/internal/impl/types/error/h;->SCOPE_FOR_ERROR_CLASS:Lkotlin/reflect/jvm/internal/impl/types/error/h;

    invoke-virtual {p0}, LDh/a;->getName()LZh/f;

    move-result-object v0

    invoke-virtual {v0}, LZh/f;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {v0, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->b(Lkotlin/reflect/jvm/internal/impl/types/error/h;[Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/types/error/g;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(Lpi/G0;)LBh/n;
    .locals 0

    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/error/a;->G0(Lpi/G0;)LBh/e;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, LDh/a;->getName()LZh/f;

    move-result-object v0

    invoke-virtual {v0}, LZh/f;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "asString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
