.class public abstract LY/f;
.super LZg/i;
.source "SourceFile"

# interfaces
.implements Ljava/util/Map;
.implements Lnh/e;


# instance fields
.field private a:LY/d;

.field private b:La0/e;

.field private c:LY/t;

.field private d:Ljava/lang/Object;

.field private e:I

.field private f:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LY/d;)V
    .locals 0

    invoke-direct {p0}, LZg/i;-><init>()V

    iput-object p1, p0, LY/f;->a:LY/d;

    new-instance p1, La0/e;

    invoke-direct {p1}, La0/e;-><init>()V

    iput-object p1, p0, LY/f;->b:La0/e;

    iget-object p1, p0, LY/f;->a:LY/d;

    invoke-virtual {p1}, LY/d;->s()LY/t;

    move-result-object p1

    iput-object p1, p0, LY/f;->c:LY/t;

    iget-object p1, p0, LY/f;->a:LY/d;

    invoke-virtual {p1}, LZg/f;->size()I

    move-result p1

    iput p1, p0, LY/f;->f:I

    return-void
.end method


# virtual methods
.method public b()Ljava/util/Set;
    .locals 1

    new-instance v0, LY/h;

    invoke-direct {v0, p0}, LY/h;-><init>(LY/f;)V

    return-object v0
.end method

.method public clear()V
    .locals 2

    sget-object v0, LY/t;->e:LY/t$a;

    invoke-virtual {v0}, LY/t$a;->a()LY/t;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LY/f;->c:LY/t;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LY/f;->q(I)V

    return-void
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 3

    iget-object v0, p0, LY/f;->c:LY/t;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    invoke-virtual {v0, v2, p1, v1}, LY/t;->k(ILjava/lang/Object;I)Z

    move-result p1

    return p1
.end method

.method public d()Ljava/util/Set;
    .locals 1

    new-instance v0, LY/j;

    invoke-direct {v0, p0}, LY/j;-><init>(LY/f;)V

    return-object v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, LY/f;->f:I

    return v0
.end method

.method public f()Ljava/util/Collection;
    .locals 1

    new-instance v0, LY/l;

    invoke-direct {v0, p0}, LY/l;-><init>(LY/f;)V

    return-object v0
.end method

.method public abstract g()LY/d;
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LY/f;->c:LY/t;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    invoke-virtual {v0, v2, p1, v1}, LY/t;->o(ILjava/lang/Object;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final h()I
    .locals 1

    iget v0, p0, LY/f;->e:I

    return v0
.end method

.method public final i()LY/t;
    .locals 1

    iget-object v0, p0, LY/f;->c:LY/t;

    return-object v0
.end method

.method public final j()La0/e;
    .locals 1

    iget-object v0, p0, LY/f;->b:La0/e;

    return-object v0
.end method

.method public final k(I)V
    .locals 0

    iput p1, p0, LY/f;->e:I

    return-void
.end method

.method public final n(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, LY/f;->d:Ljava/lang/Object;

    return-void
.end method

.method protected final p(La0/e;)V
    .locals 0

    iput-object p1, p0, LY/f;->b:La0/e;

    return-void
.end method

.method public put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    iput-object v0, p0, LY/f;->d:Ljava/lang/Object;

    iget-object v1, p0, LY/f;->c:LY/t;

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

    invoke-virtual/range {v1 .. v6}, LY/t;->D(ILjava/lang/Object;Ljava/lang/Object;ILY/f;)LY/t;

    move-result-object p1

    iput-object p1, p0, LY/f;->c:LY/t;

    iget-object p1, p0, LY/f;->d:Ljava/lang/Object;

    return-object p1
.end method

.method public putAll(Ljava/util/Map;)V
    .locals 6

    instance-of v0, p1, LY/d;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LY/d;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_3

    instance-of v0, p1, LY/f;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, LY/f;

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, LY/f;->g()LY/d;

    move-result-object v0

    goto :goto_2

    :cond_2
    move-object v0, v1

    :cond_3
    :goto_2
    if-eqz v0, :cond_4

    new-instance p1, La0/b;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {p1, v3, v2, v1}, La0/b;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, LZg/i;->size()I

    move-result v1

    iget-object v2, p0, LY/f;->c:LY/t;

    invoke-virtual {v0}, LY/d;->s()LY/t;

    move-result-object v4

    const-string v5, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v4, v3, p1, p0}, LY/t;->E(LY/t;ILa0/b;LY/f;)LY/t;

    move-result-object v2

    iput-object v2, p0, LY/f;->c:LY/t;

    invoke-virtual {v0}, LZg/f;->size()I

    move-result v0

    add-int/2addr v0, v1

    invoke-virtual {p1}, La0/b;->a()I

    move-result p1

    sub-int/2addr v0, p1

    if-eq v1, v0, :cond_5

    invoke-virtual {p0, v0}, LY/f;->q(I)V

    goto :goto_3

    :cond_4
    invoke-super {p0, p1}, Ljava/util/AbstractMap;->putAll(Ljava/util/Map;)V

    :cond_5
    :goto_3
    return-void
.end method

.method public q(I)V
    .locals 0

    iput p1, p0, LY/f;->f:I

    iget p1, p0, LY/f;->e:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, LY/f;->e:I

    return-void
.end method

.method public remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, LY/f;->d:Ljava/lang/Object;

    .line 2
    iget-object v0, p0, LY/f;->c:LY/t;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    invoke-virtual {v0, v2, p1, v1, p0}, LY/t;->G(ILjava/lang/Object;ILY/f;)LY/t;

    move-result-object p1

    if-nez p1, :cond_1

    sget-object p1, LY/t;->e:LY/t$a;

    invoke-virtual {p1}, LY/t$a;->a()LY/t;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    iput-object p1, p0, LY/f;->c:LY/t;

    .line 3
    iget-object p1, p0, LY/f;->d:Ljava/lang/Object;

    return-object p1
.end method

.method public final remove(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 8

    .line 4
    invoke-virtual {p0}, LZg/i;->size()I

    move-result v0

    .line 5
    iget-object v1, p0, LY/f;->c:LY/t;

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

    invoke-virtual/range {v1 .. v6}, LY/t;->H(ILjava/lang/Object;Ljava/lang/Object;ILY/f;)LY/t;

    move-result-object p1

    if-nez p1, :cond_1

    sget-object p1, LY/t;->e:LY/t$a;

    invoke-virtual {p1}, LY/t$a;->a()LY/t;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    iput-object p1, p0, LY/f;->c:LY/t;

    .line 6
    invoke-virtual {p0}, LZg/i;->size()I

    move-result p1

    if-eq v0, p1, :cond_2

    const/4 v7, 0x1

    :cond_2
    return v7
.end method
