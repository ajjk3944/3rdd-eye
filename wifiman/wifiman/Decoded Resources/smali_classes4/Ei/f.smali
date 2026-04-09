.class public final LEi/f;
.super LZg/i;
.source "SourceFile"

# interfaces
.implements LCi/g$a;


# instance fields
.field private a:LEi/d;

.field private b:LHi/f;

.field private c:LEi/t;

.field private d:Ljava/lang/Object;

.field private e:I

.field private f:I


# direct methods
.method public constructor <init>(LEi/d;)V
    .locals 1

    const-string v0, "map"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LZg/i;-><init>()V

    iput-object p1, p0, LEi/f;->a:LEi/d;

    new-instance v0, LHi/f;

    invoke-direct {v0}, LHi/f;-><init>()V

    iput-object v0, p0, LEi/f;->b:LHi/f;

    invoke-virtual {p1}, LEi/d;->t()LEi/t;

    move-result-object v0

    iput-object v0, p0, LEi/f;->c:LEi/t;

    invoke-virtual {p1}, LZg/f;->size()I

    move-result p1

    iput p1, p0, LEi/f;->f:I

    return-void
.end method


# virtual methods
.method public bridge synthetic a()LCi/g;
    .locals 1

    invoke-virtual {p0}, LEi/f;->g()LEi/d;

    move-result-object v0

    return-object v0
.end method

.method public b()Ljava/util/Set;
    .locals 1

    new-instance v0, LEi/h;

    invoke-direct {v0, p0}, LEi/h;-><init>(LEi/f;)V

    return-object v0
.end method

.method public clear()V
    .locals 2

    sget-object v0, LEi/t;->e:LEi/t$a;

    invoke-virtual {v0}, LEi/t$a;->a()LEi/t;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, LEi/f;->p(LEi/t;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LEi/f;->r(I)V

    return-void
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 3

    iget-object v0, p0, LEi/f;->c:LEi/t;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    invoke-virtual {v0, v2, p1, v1}, LEi/t;->g(ILjava/lang/Object;I)Z

    move-result p1

    return p1
.end method

.method public d()Ljava/util/Set;
    .locals 1

    new-instance v0, LEi/j;

    invoke-direct {v0, p0}, LEi/j;-><init>(LEi/f;)V

    return-object v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, LEi/f;->f:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Ljava/util/Map;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0}, LZg/i;->size()I

    move-result v0

    move-object v2, p1

    check-cast v2, Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v3

    if-eq v0, v3, :cond_2

    return v1

    :cond_2
    instance-of v0, v2, LEi/d;

    if-eqz v0, :cond_3

    iget-object v0, p0, LEi/f;->c:LEi/t;

    check-cast p1, LEi/d;

    invoke-virtual {p1}, LEi/d;->t()LEi/t;

    move-result-object p1

    sget-object v1, LEi/f$a;->a:LEi/f$a;

    invoke-virtual {v0, p1, v1}, LEi/t;->k(LEi/t;Lmh/p;)Z

    move-result p1

    goto :goto_0

    :cond_3
    instance-of v0, v2, LEi/f;

    if-eqz v0, :cond_4

    iget-object v0, p0, LEi/f;->c:LEi/t;

    check-cast p1, LEi/f;

    iget-object p1, p1, LEi/f;->c:LEi/t;

    sget-object v1, LEi/f$b;->a:LEi/f$b;

    invoke-virtual {v0, p1, v1}, LEi/t;->k(LEi/t;Lmh/p;)Z

    move-result p1

    goto :goto_0

    :cond_4
    instance-of v0, v2, LFi/c;

    if-eqz v0, :cond_5

    iget-object v0, p0, LEi/f;->c:LEi/t;

    check-cast p1, LFi/c;

    invoke-virtual {p1}, LFi/c;->s()LEi/d;

    move-result-object p1

    invoke-virtual {p1}, LEi/d;->t()LEi/t;

    move-result-object p1

    sget-object v1, LEi/f$c;->a:LEi/f$c;

    invoke-virtual {v0, p1, v1}, LEi/t;->k(LEi/t;Lmh/p;)Z

    move-result p1

    goto :goto_0

    :cond_5
    instance-of v0, v2, LFi/d;

    if-eqz v0, :cond_6

    iget-object v0, p0, LEi/f;->c:LEi/t;

    check-cast p1, LFi/d;

    invoke-virtual {p1}, LFi/d;->h()LEi/f;

    move-result-object p1

    iget-object p1, p1, LEi/f;->c:LEi/t;

    sget-object v1, LEi/f$d;->a:LEi/f$d;

    invoke-virtual {v0, p1, v1}, LEi/t;->k(LEi/t;Lmh/p;)Z

    move-result p1

    goto :goto_0

    :cond_6
    sget-object p1, LHi/e;->a:LHi/e;

    invoke-virtual {p1, p0, v2}, LHi/e;->b(Ljava/util/Map;Ljava/util/Map;)Z

    move-result p1

    :goto_0
    return p1
.end method

.method public f()Ljava/util/Collection;
    .locals 1

    new-instance v0, LEi/l;

    invoke-direct {v0, p0}, LEi/l;-><init>(LEi/f;)V

    return-object v0
.end method

.method public g()LEi/d;
    .locals 3

    iget-object v0, p0, LEi/f;->a:LEi/d;

    if-nez v0, :cond_0

    new-instance v0, LEi/d;

    iget-object v1, p0, LEi/f;->c:LEi/t;

    invoke-virtual {p0}, LZg/i;->size()I

    move-result v2

    invoke-direct {v0, v1, v2}, LEi/d;-><init>(LEi/t;I)V

    iput-object v0, p0, LEi/f;->a:LEi/d;

    new-instance v1, LHi/f;

    invoke-direct {v1}, LHi/f;-><init>()V

    iput-object v1, p0, LEi/f;->b:LHi/f;

    :cond_0
    return-object v0
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LEi/f;->c:LEi/t;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    invoke-virtual {v0, v2, p1, v1}, LEi/t;->l(ILjava/lang/Object;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final h()LEi/d;
    .locals 1

    iget-object v0, p0, LEi/f;->a:LEi/d;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    sget-object v0, LHi/e;->a:LHi/e;

    invoke-virtual {v0, p0}, LHi/e;->c(Ljava/util/Map;)I

    move-result v0

    return v0
.end method

.method public final i()I
    .locals 1

    iget v0, p0, LEi/f;->e:I

    return v0
.end method

.method public final j()LEi/t;
    .locals 1

    iget-object v0, p0, LEi/f;->c:LEi/t;

    return-object v0
.end method

.method public final k()LHi/f;
    .locals 1

    iget-object v0, p0, LEi/f;->b:LHi/f;

    return-object v0
.end method

.method public final n(I)V
    .locals 0

    iput p1, p0, LEi/f;->e:I

    return-void
.end method

.method public final p(LEi/t;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LEi/f;->c:LEi/t;

    if-eq p1, v0, :cond_0

    iput-object p1, p0, LEi/f;->c:LEi/t;

    const/4 p1, 0x0

    iput-object p1, p0, LEi/f;->a:LEi/d;

    :cond_0
    return-void
.end method

.method public put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    iput-object v0, p0, LEi/f;->d:Ljava/lang/Object;

    iget-object v1, p0, LEi/f;->c:LEi/t;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    move v2, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    const/4 v5, 0x0

    move-object v3, p1

    move-object v4, p2

    move-object v6, p0

    invoke-virtual/range {v1 .. v6}, LEi/t;->y(ILjava/lang/Object;Ljava/lang/Object;ILEi/f;)LEi/t;

    move-result-object p1

    invoke-virtual {p0, p1}, LEi/f;->p(LEi/t;)V

    iget-object p1, p0, LEi/f;->d:Ljava/lang/Object;

    return-object p1
.end method

.method public putAll(Ljava/util/Map;)V
    .locals 6

    const-string v0, "from"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    instance-of v0, p1, LEi/d;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, LEi/d;

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_4

    instance-of v0, p1, LEi/f;

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, LEi/f;

    goto :goto_1

    :cond_2
    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_3

    invoke-virtual {v0}, LEi/f;->g()LEi/d;

    move-result-object v0

    goto :goto_2

    :cond_3
    move-object v0, v1

    :cond_4
    :goto_2
    if-eqz v0, :cond_5

    new-instance p1, LHi/b;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {p1, v3, v2, v1}, LHi/b;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, LZg/i;->size()I

    move-result v1

    iget-object v2, p0, LEi/f;->c:LEi/t;

    invoke-virtual {v0}, LEi/d;->t()LEi/t;

    move-result-object v4

    const-string v5, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v4, v3, p1, p0}, LEi/t;->z(LEi/t;ILHi/b;LEi/f;)LEi/t;

    move-result-object v2

    invoke-virtual {p0, v2}, LEi/f;->p(LEi/t;)V

    invoke-virtual {v0}, LZg/f;->size()I

    move-result v0

    add-int/2addr v0, v1

    invoke-virtual {p1}, LHi/b;->a()I

    move-result p1

    sub-int/2addr v0, p1

    if-eq v1, v0, :cond_6

    invoke-virtual {p0, v0}, LEi/f;->r(I)V

    goto :goto_3

    :cond_5
    invoke-super {p0, p1}, Ljava/util/AbstractMap;->putAll(Ljava/util/Map;)V

    :cond_6
    :goto_3
    return-void
.end method

.method public final q(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, LEi/f;->d:Ljava/lang/Object;

    return-void
.end method

.method public r(I)V
    .locals 0

    iput p1, p0, LEi/f;->f:I

    iget p1, p0, LEi/f;->e:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, LEi/f;->e:I

    return-void
.end method

.method public remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, LEi/f;->d:Ljava/lang/Object;

    .line 2
    iget-object v0, p0, LEi/f;->c:LEi/t;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    invoke-virtual {v0, v2, p1, v1, p0}, LEi/t;->B(ILjava/lang/Object;ILEi/f;)LEi/t;

    move-result-object p1

    if-nez p1, :cond_1

    sget-object p1, LEi/t;->e:LEi/t$a;

    invoke-virtual {p1}, LEi/t$a;->a()LEi/t;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p0, p1}, LEi/f;->p(LEi/t;)V

    .line 3
    iget-object p1, p0, LEi/f;->d:Ljava/lang/Object;

    return-object p1
.end method

.method public final remove(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 8

    .line 4
    invoke-virtual {p0}, LZg/i;->size()I

    move-result v0

    .line 5
    iget-object v1, p0, LEi/f;->c:LEi/t;

    const/4 v7, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v7

    :goto_0
    const/4 v5, 0x0

    move-object v3, p1

    move-object v4, p2

    move-object v6, p0

    invoke-virtual/range {v1 .. v6}, LEi/t;->C(ILjava/lang/Object;Ljava/lang/Object;ILEi/f;)LEi/t;

    move-result-object p1

    if-nez p1, :cond_1

    sget-object p1, LEi/t;->e:LEi/t$a;

    invoke-virtual {p1}, LEi/t$a;->a()LEi/t;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p0, p1}, LEi/f;->p(LEi/t;)V

    .line 6
    invoke-virtual {p0}, LZg/i;->size()I

    move-result p1

    if-eq v0, p1, :cond_2

    const/4 v7, 0x1

    :cond_2
    return v7
.end method
