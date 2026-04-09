.class public final LEi/d;
.super LZg/f;
.source "SourceFile"

# interfaces
.implements LCi/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LEi/d$a;
    }
.end annotation


# static fields
.field public static final d:LEi/d$a;

.field private static final e:LEi/d;


# instance fields
.field private final b:LEi/t;

.field private final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LEi/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LEi/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LEi/d;->d:LEi/d$a;

    new-instance v0, LEi/d;

    sget-object v1, LEi/t;->e:LEi/t$a;

    invoke-virtual {v1}, LEi/t$a;->a()LEi/t;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LEi/d;-><init>(LEi/t;I)V

    sput-object v0, LEi/d;->e:LEi/d;

    return-void
.end method

.method public constructor <init>(LEi/t;I)V
    .locals 1

    const-string v0, "node"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LZg/f;-><init>()V

    iput-object p1, p0, LEi/d;->b:LEi/t;

    iput p2, p0, LEi/d;->c:I

    return-void
.end method

.method public static final synthetic p()LEi/d;
    .locals 1

    sget-object v0, LEi/d;->e:LEi/d;

    return-object v0
.end method

.method private final r()LCi/e;
    .locals 1

    new-instance v0, LEi/n;

    invoke-direct {v0, p0}, LEi/n;-><init>(LEi/d;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic c()LCi/g$a;
    .locals 1

    invoke-virtual {p0}, LEi/d;->q()LEi/f;

    move-result-object v0

    return-object v0
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 3

    iget-object v0, p0, LEi/d;->b:LEi/t;

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
    invoke-virtual {p0}, LZg/f;->size()I

    move-result v0

    move-object v2, p1

    check-cast v2, Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v3

    if-eq v0, v3, :cond_2

    return v1

    :cond_2
    instance-of v0, v2, LFi/c;

    if-eqz v0, :cond_3

    iget-object v0, p0, LEi/d;->b:LEi/t;

    check-cast p1, LFi/c;

    invoke-virtual {p1}, LFi/c;->s()LEi/d;

    move-result-object p1

    iget-object p1, p1, LEi/d;->b:LEi/t;

    sget-object v1, LEi/d$b;->a:LEi/d$b;

    invoke-virtual {v0, p1, v1}, LEi/t;->k(LEi/t;Lmh/p;)Z

    move-result p1

    goto :goto_0

    :cond_3
    instance-of v0, v2, LFi/d;

    if-eqz v0, :cond_4

    iget-object v0, p0, LEi/d;->b:LEi/t;

    check-cast p1, LFi/d;

    invoke-virtual {p1}, LFi/d;->h()LEi/f;

    move-result-object p1

    invoke-virtual {p1}, LEi/f;->j()LEi/t;

    move-result-object p1

    sget-object v1, LEi/d$c;->a:LEi/d$c;

    invoke-virtual {v0, p1, v1}, LEi/t;->k(LEi/t;Lmh/p;)Z

    move-result p1

    goto :goto_0

    :cond_4
    instance-of v0, v2, LEi/d;

    if-eqz v0, :cond_5

    iget-object v0, p0, LEi/d;->b:LEi/t;

    check-cast p1, LEi/d;

    iget-object p1, p1, LEi/d;->b:LEi/t;

    sget-object v1, LEi/d$d;->a:LEi/d$d;

    invoke-virtual {v0, p1, v1}, LEi/t;->k(LEi/t;Lmh/p;)Z

    move-result p1

    goto :goto_0

    :cond_5
    instance-of v0, v2, LEi/f;

    if-eqz v0, :cond_6

    iget-object v0, p0, LEi/d;->b:LEi/t;

    check-cast p1, LEi/f;

    invoke-virtual {p1}, LEi/f;->j()LEi/t;

    move-result-object p1

    sget-object v1, LEi/d$e;->a:LEi/d$e;

    invoke-virtual {v0, p1, v1}, LEi/t;->k(LEi/t;Lmh/p;)Z

    move-result p1

    goto :goto_0

    :cond_6
    invoke-super {p0, p1}, LZg/f;->equals(Ljava/lang/Object;)Z

    move-result p1

    :goto_0
    return p1
.end method

.method public final f()Ljava/util/Set;
    .locals 1

    invoke-direct {p0}, LEi/d;->r()LCi/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g()Ljava/util/Set;
    .locals 1

    invoke-virtual {p0}, LEi/d;->s()LCi/e;

    move-result-object v0

    return-object v0
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LEi/d;->b:LEi/t;

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

.method public h()I
    .locals 1

    iget v0, p0, LEi/d;->c:I

    return v0
.end method

.method public hashCode()I
    .locals 1

    invoke-super {p0}, LZg/f;->hashCode()I

    move-result v0

    return v0
.end method

.method public bridge synthetic i()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, LEi/d;->u()LCi/b;

    move-result-object v0

    return-object v0
.end method

.method public putAll(Ljava/util/Map;)LCi/g;
    .locals 1

    const-string v0, "m"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    const-string v0, "null cannot be cast to non-null type kotlinx.collections.immutable.PersistentMap<K of kotlinx.collections.immutable.ExtensionsKt.mutate, V of kotlinx.collections.immutable.ExtensionsKt.mutate>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LCi/g;->c()LCi/g$a;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    invoke-interface {v0}, LCi/g$a;->a()LCi/g;

    move-result-object p1

    return-object p1
.end method

.method public q()LEi/f;
    .locals 1

    new-instance v0, LEi/f;

    invoke-direct {v0, p0}, LEi/f;-><init>(LEi/d;)V

    return-object v0
.end method

.method public s()LCi/e;
    .locals 1

    new-instance v0, LEi/p;

    invoke-direct {v0, p0}, LEi/p;-><init>(LEi/d;)V

    return-object v0
.end method

.method public final t()LEi/t;
    .locals 1

    iget-object v0, p0, LEi/d;->b:LEi/t;

    return-object v0
.end method

.method public u()LCi/b;
    .locals 1

    new-instance v0, LEi/r;

    invoke-direct {v0, p0}, LEi/r;-><init>(LEi/d;)V

    return-object v0
.end method
