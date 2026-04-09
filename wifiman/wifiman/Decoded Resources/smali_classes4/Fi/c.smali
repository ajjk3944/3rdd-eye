.class public final LFi/c;
.super LZg/f;
.source "SourceFile"

# interfaces
.implements LCi/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LFi/c$a;
    }
.end annotation


# static fields
.field public static final e:LFi/c$a;

.field private static final f:LFi/c;


# instance fields
.field private final b:Ljava/lang/Object;

.field private final c:Ljava/lang/Object;

.field private final d:LEi/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LFi/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LFi/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LFi/c;->e:LFi/c$a;

    new-instance v0, LFi/c;

    sget-object v1, LHi/c;->a:LHi/c;

    sget-object v2, LEi/d;->d:LEi/d$a;

    invoke-virtual {v2}, LEi/d$a;->a()LEi/d;

    move-result-object v2

    invoke-direct {v0, v1, v1, v2}, LFi/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;LEi/d;)V

    sput-object v0, LFi/c;->f:LFi/c;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;LEi/d;)V
    .locals 1

    const-string v0, "hashMap"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LZg/f;-><init>()V

    iput-object p1, p0, LFi/c;->b:Ljava/lang/Object;

    iput-object p2, p0, LFi/c;->c:Ljava/lang/Object;

    iput-object p3, p0, LFi/c;->d:LEi/d;

    return-void
.end method

.method public static final synthetic p()LFi/c;
    .locals 1

    sget-object v0, LFi/c;->f:LFi/c;

    return-object v0
.end method

.method private final q()LCi/e;
    .locals 1

    new-instance v0, LFi/l;

    invoke-direct {v0, p0}, LFi/l;-><init>(LFi/c;)V

    return-object v0
.end method


# virtual methods
.method public c()LCi/g$a;
    .locals 1

    new-instance v0, LFi/d;

    invoke-direct {v0, p0}, LFi/d;-><init>(LFi/c;)V

    return-object v0
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LFi/c;->d:LEi/d;

    invoke-virtual {v0, p1}, LEi/d;->containsKey(Ljava/lang/Object;)Z

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

    iget-object v0, p0, LFi/c;->d:LEi/d;

    invoke-virtual {v0}, LEi/d;->t()LEi/t;

    move-result-object v0

    check-cast p1, LFi/c;

    iget-object p1, p1, LFi/c;->d:LEi/d;

    invoke-virtual {p1}, LEi/d;->t()LEi/t;

    move-result-object p1

    sget-object v1, LFi/c$b;->a:LFi/c$b;

    invoke-virtual {v0, p1, v1}, LEi/t;->k(LEi/t;Lmh/p;)Z

    move-result p1

    goto :goto_0

    :cond_3
    instance-of v0, v2, LFi/d;

    if-eqz v0, :cond_4

    iget-object v0, p0, LFi/c;->d:LEi/d;

    invoke-virtual {v0}, LEi/d;->t()LEi/t;

    move-result-object v0

    check-cast p1, LFi/d;

    invoke-virtual {p1}, LFi/d;->h()LEi/f;

    move-result-object p1

    invoke-virtual {p1}, LEi/f;->j()LEi/t;

    move-result-object p1

    sget-object v1, LFi/c$c;->a:LFi/c$c;

    invoke-virtual {v0, p1, v1}, LEi/t;->k(LEi/t;Lmh/p;)Z

    move-result p1

    goto :goto_0

    :cond_4
    instance-of v0, v2, LEi/d;

    if-eqz v0, :cond_5

    iget-object v0, p0, LFi/c;->d:LEi/d;

    invoke-virtual {v0}, LEi/d;->t()LEi/t;

    move-result-object v0

    check-cast p1, LEi/d;

    invoke-virtual {p1}, LEi/d;->t()LEi/t;

    move-result-object p1

    sget-object v1, LFi/c$d;->a:LFi/c$d;

    invoke-virtual {v0, p1, v1}, LEi/t;->k(LEi/t;Lmh/p;)Z

    move-result p1

    goto :goto_0

    :cond_5
    instance-of v0, v2, LEi/f;

    if-eqz v0, :cond_6

    iget-object v0, p0, LFi/c;->d:LEi/d;

    invoke-virtual {v0}, LEi/d;->t()LEi/t;

    move-result-object v0

    check-cast p1, LEi/f;

    invoke-virtual {p1}, LEi/f;->j()LEi/t;

    move-result-object p1

    sget-object v1, LFi/c$e;->a:LFi/c$e;

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

    invoke-direct {p0}, LFi/c;->q()LCi/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g()Ljava/util/Set;
    .locals 1

    invoke-virtual {p0}, LFi/c;->t()LCi/e;

    move-result-object v0

    return-object v0
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LFi/c;->d:LEi/d;

    invoke-virtual {v0, p1}, LEi/d;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LFi/a;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LFi/a;->e()Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public h()I
    .locals 1

    iget-object v0, p0, LFi/c;->d:LEi/d;

    invoke-virtual {v0}, LZg/f;->size()I

    move-result v0

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

    invoke-virtual {p0}, LFi/c;->v()LCi/b;

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

.method public final r()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LFi/c;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public final s()LEi/d;
    .locals 1

    iget-object v0, p0, LFi/c;->d:LEi/d;

    return-object v0
.end method

.method public t()LCi/e;
    .locals 1

    new-instance v0, LFi/n;

    invoke-direct {v0, p0}, LFi/n;-><init>(LFi/c;)V

    return-object v0
.end method

.method public final u()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LFi/c;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public v()LCi/b;
    .locals 1

    new-instance v0, LFi/q;

    invoke-direct {v0, p0}, LFi/q;-><init>(LFi/c;)V

    return-object v0
.end method
