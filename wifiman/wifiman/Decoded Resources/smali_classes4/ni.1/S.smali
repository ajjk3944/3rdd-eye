.class public final Lni/S;
.super LDh/b;
.source "SourceFile"


# instance fields
.field private final k:Lli/p;

.field private final l:LUh/s;

.field private final m:Lni/a;


# direct methods
.method public constructor <init>(Lli/p;LUh/s;I)V
    .locals 11

    const-string v0, "c"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proto"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lli/p;->h()Loi/n;

    move-result-object v2

    invoke-virtual {p1}, Lli/p;->e()LBh/m;

    move-result-object v3

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->b()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v4

    invoke-virtual {p1}, Lli/p;->g()LWh/c;

    move-result-object v0

    invoke-virtual {p2}, LUh/s;->X0()I

    move-result v1

    invoke-static {v0, v1}, Lli/L;->b(LWh/c;I)LZh/f;

    move-result-object v5

    sget-object v0, Lli/O;->a:Lli/O;

    invoke-virtual {p2}, LUh/s;->d1()LUh/s$c;

    move-result-object v1

    const-string v6, "getVariance(...)"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lli/O;->d(LUh/s$c;)Lpi/N0;

    move-result-object v6

    invoke-virtual {p2}, LUh/s;->Y0()Z

    move-result v7

    sget-object v9, LBh/g0;->a:LBh/g0;

    sget-object v10, LBh/j0$a;->a:LBh/j0$a;

    move-object v1, p0

    move v8, p3

    invoke-direct/range {v1 .. v10}, LDh/b;-><init>(Loi/n;LBh/m;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;Lpi/N0;ZILBh/g0;LBh/j0;)V

    iput-object p1, p0, Lni/S;->k:Lli/p;

    iput-object p2, p0, Lni/S;->l:LUh/s;

    new-instance p2, Lni/a;

    invoke-virtual {p1}, Lli/p;->h()Loi/n;

    move-result-object p1

    new-instance p3, Lni/Q;

    invoke-direct {p3, p0}, Lni/Q;-><init>(Lni/S;)V

    invoke-direct {p2, p1, p3}, Lni/a;-><init>(Loi/n;Lmh/a;)V

    iput-object p2, p0, Lni/S;->m:Lni/a;

    return-void
.end method

.method static synthetic M0(Lni/S;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lni/S;->N0(Lni/S;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final N0(Lni/S;)Ljava/util/List;
    .locals 2

    iget-object v0, p0, Lni/S;->k:Lli/p;

    invoke-virtual {v0}, Lli/p;->c()Lli/n;

    move-result-object v0

    invoke-virtual {v0}, Lli/n;->d()Lli/e;

    move-result-object v0

    iget-object v1, p0, Lni/S;->l:LUh/s;

    iget-object p0, p0, Lni/S;->k:Lli/p;

    invoke-virtual {p0}, Lli/p;->g()LWh/c;

    move-result-object p0

    invoke-interface {v0, v1, p0}, Lli/h;->i(LUh/s;LWh/c;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic K0(Lpi/S;)V
    .locals 0

    invoke-virtual {p0, p1}, Lni/S;->P0(Lpi/S;)Ljava/lang/Void;

    return-void
.end method

.method protected L0()Ljava/util/List;
    .locals 4

    iget-object v0, p0, Lni/S;->l:LUh/s;

    iget-object v1, p0, Lni/S;->k:Lli/p;

    invoke-virtual {v1}, Lli/p;->j()LWh/g;

    move-result-object v1

    invoke-static {v0, v1}, LWh/f;->s(LUh/s;LWh/g;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0}, Lfi/e;->m(LBh/m;)Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->y()Lpi/d0;

    move-result-object v0

    invoke-static {v0}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    check-cast v0, Ljava/lang/Iterable;

    iget-object v1, p0, Lni/S;->k:Lli/p;

    invoke-virtual {v1}, Lli/p;->i()Lli/X;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LUh/q;

    invoke-virtual {v1, v3}, Lli/X;->u(LUh/q;)Lpi/S;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v2
.end method

.method public O0()Lni/a;
    .locals 1

    iget-object v0, p0, Lni/S;->m:Lni/a;

    return-object v0
.end method

.method protected P0(Lpi/S;)Ljava/lang/Void;
    .locals 2

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "There should be no cycles for deserialized type parameters, but found for: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;
    .locals 1

    invoke-virtual {p0}, Lni/S;->O0()Lni/a;

    move-result-object v0

    return-object v0
.end method
