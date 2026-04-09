.class public final LNh/c0;
.super LDh/b;
.source "SourceFile"


# instance fields
.field private final k:LMh/k;

.field private final l:LQh/y;


# direct methods
.method public constructor <init>(LMh/k;LQh/y;ILBh/m;)V
    .locals 11

    const-string v0, "c"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaTypeParameter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "containingDeclaration"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LMh/k;->e()Loi/n;

    move-result-object v2

    new-instance v0, LMh/g;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v3, v0

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v3 .. v8}, LMh/g;-><init>(LMh/k;LQh/d;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p2}, LQh/t;->getName()LZh/f;

    move-result-object v5

    sget-object v6, Lpi/N0;->INVARIANT:Lpi/N0;

    sget-object v9, LBh/g0;->a:LBh/g0;

    invoke-virtual {p1}, LMh/k;->a()LMh/d;

    move-result-object v1

    invoke-virtual {v1}, LMh/d;->v()LBh/j0;

    move-result-object v10

    const/4 v7, 0x0

    move-object v1, p0

    move-object v3, p4

    move-object v4, v0

    move v8, p3

    invoke-direct/range {v1 .. v10}, LDh/b;-><init>(Loi/n;LBh/m;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;Lpi/N0;ZILBh/g0;LBh/j0;)V

    iput-object p1, p0, LNh/c0;->k:LMh/k;

    iput-object p2, p0, LNh/c0;->l:LQh/y;

    return-void
.end method

.method private final M0()Ljava/util/List;
    .locals 10

    iget-object v0, p0, LNh/c0;->l:LQh/y;

    invoke-interface {v0}, LQh/y;->getUpperBounds()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, LNh/c0;->k:LMh/k;

    invoke-virtual {v0}, LMh/k;->d()LBh/G;

    move-result-object v0

    invoke-interface {v0}, LBh/G;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->i()Lpi/d0;

    move-result-object v0

    const-string v1, "getAnyType(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LNh/c0;->k:LMh/k;

    invoke-virtual {v1}, LMh/k;->d()LBh/G;

    move-result-object v1

    invoke-interface {v1}, LBh/G;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object v1

    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->I()Lpi/d0;

    move-result-object v1

    const-string v2, "getNullableAnyType(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lpi/V;->e(Lpi/d0;Lpi/d0;)Lpi/M0;

    move-result-object v0

    invoke-static {v0}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LQh/j;

    iget-object v3, p0, LNh/c0;->k:LMh/k;

    invoke-virtual {v3}, LMh/k;->g()LOh/e;

    move-result-object v3

    sget-object v4, Lpi/I0;->COMMON:Lpi/I0;

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v7, p0

    invoke-static/range {v4 .. v9}, LOh/b;->b(Lpi/I0;ZZLBh/l0;ILjava/lang/Object;)LOh/a;

    move-result-object v4

    invoke-virtual {v3, v2, v4}, LOh/e;->p(LQh/x;LOh/a;)Lpi/S;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1
.end method


# virtual methods
.method protected G0(Ljava/util/List;)Ljava/util/List;
    .locals 2

    const-string v0, "bounds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LNh/c0;->k:LMh/k;

    invoke-virtual {v0}, LMh/k;->a()LMh/d;

    move-result-object v0

    invoke-virtual {v0}, LMh/d;->r()LRh/e0;

    move-result-object v0

    iget-object v1, p0, LNh/c0;->k:LMh/k;

    invoke-virtual {v0, p0, p1, v1}, LRh/e0;->r(LBh/l0;Ljava/util/List;LMh/k;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method protected K0(Lpi/S;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method protected L0()Ljava/util/List;
    .locals 1

    invoke-direct {p0}, LNh/c0;->M0()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
