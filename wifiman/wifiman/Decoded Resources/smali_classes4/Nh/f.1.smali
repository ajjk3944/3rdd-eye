.class public final LNh/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lii/k;


# static fields
.field static final synthetic f:[Lth/l;


# instance fields
.field private final b:LMh/k;

.field private final c:LNh/D;

.field private final d:LNh/G;

.field private final e:Loi/i;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LNh/f;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v1

    const-string v2, "kotlinScopes"

    const-string v3, "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"

    invoke-direct {v0, v1, v2, v3}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lth/l;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, LNh/f;->f:[Lth/l;

    return-void
.end method

.method public constructor <init>(LMh/k;LQh/u;LNh/D;)V
    .locals 1

    const-string v0, "c"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jPackage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "packageFragment"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNh/f;->b:LMh/k;

    iput-object p3, p0, LNh/f;->c:LNh/D;

    new-instance v0, LNh/G;

    invoke-direct {v0, p1, p2, p3}, LNh/G;-><init>(LMh/k;LQh/u;LNh/D;)V

    iput-object v0, p0, LNh/f;->d:LNh/G;

    invoke-virtual {p1}, LMh/k;->e()Loi/n;

    move-result-object p1

    new-instance p2, LNh/e;

    invoke-direct {p2, p0}, LNh/e;-><init>(LNh/f;)V

    invoke-interface {p1, p2}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p1

    iput-object p1, p0, LNh/f;->e:Loi/i;

    return-void
.end method

.method static synthetic h(LNh/f;)[Lii/k;
    .locals 0

    invoke-static {p0}, LNh/f;->k(LNh/f;)[Lii/k;

    move-result-object p0

    return-object p0
.end method

.method private final j()[Lii/k;
    .locals 3

    iget-object v0, p0, LNh/f;->e:Loi/i;

    sget-object v1, LNh/f;->f:[Lth/l;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, Loi/m;->a(Loi/i;Ljava/lang/Object;Lth/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lii/k;

    return-object v0
.end method

.method private static final k(LNh/f;)[Lii/k;
    .locals 5

    iget-object v0, p0, LNh/f;->c:LNh/D;

    invoke-virtual {v0}, LNh/D;->O0()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LSh/x;

    iget-object v3, p0, LNh/f;->b:LMh/k;

    invoke-virtual {v3}, LMh/k;->a()LMh/d;

    move-result-object v3

    invoke-virtual {v3}, LMh/d;->b()LSh/n;

    move-result-object v3

    iget-object v4, p0, LNh/f;->c:LNh/D;

    invoke-virtual {v3, v4, v2}, LSh/n;->c(LBh/M;LSh/x;)Lii/k;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v1}, Lwi/a;->b(Ljava/lang/Iterable;)Lxi/k;

    move-result-object p0

    const/4 v0, 0x0

    new-array v0, v0, [Lii/k;

    invoke-interface {p0, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Lii/k;

    return-object p0
.end method


# virtual methods
.method public a()Ljava/util/Set;
    .locals 5

    invoke-direct {p0}, LNh/f;->j()[Lii/k;

    move-result-object v0

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v0, v3

    invoke-interface {v4}, Lii/k;->a()Ljava/util/Set;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v1, v4}, LZg/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, LNh/f;->d:LNh/G;

    invoke-virtual {v0}, LNh/U;->a()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-object v1
.end method

.method public b(LZh/f;LIh/b;)Ljava/util/Collection;
    .locals 5

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, LNh/f;->l(LZh/f;LIh/b;)V

    iget-object v0, p0, LNh/f;->d:LNh/G;

    invoke-direct {p0}, LNh/f;->j()[Lii/k;

    move-result-object v1

    invoke-interface {v0, p1, p2}, Lii/k;->b(LZh/f;LIh/b;)Ljava/util/Collection;

    move-result-object v0

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    invoke-interface {v4, p1, p2}, Lii/k;->b(LZh/f;LIh/b;)Ljava/util/Collection;

    move-result-object v4

    invoke-static {v0, v4}, Lwi/a;->a(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    if-nez v0, :cond_1

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    :cond_1
    return-object v0
.end method

.method public c()Ljava/util/Set;
    .locals 5

    invoke-direct {p0}, LNh/f;->j()[Lii/k;

    move-result-object v0

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v0, v3

    invoke-interface {v4}, Lii/k;->c()Ljava/util/Set;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v1, v4}, LZg/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, LNh/f;->d:LNh/G;

    invoke-virtual {v0}, LNh/U;->c()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-object v1
.end method

.method public d(LZh/f;LIh/b;)Ljava/util/Collection;
    .locals 5

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, LNh/f;->l(LZh/f;LIh/b;)V

    iget-object v0, p0, LNh/f;->d:LNh/G;

    invoke-direct {p0}, LNh/f;->j()[Lii/k;

    move-result-object v1

    invoke-interface {v0, p1, p2}, Lii/k;->d(LZh/f;LIh/b;)Ljava/util/Collection;

    move-result-object v0

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    invoke-interface {v4, p1, p2}, Lii/k;->d(LZh/f;LIh/b;)Ljava/util/Collection;

    move-result-object v4

    invoke-static {v0, v4}, Lwi/a;->a(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    if-nez v0, :cond_1

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    :cond_1
    return-object v0
.end method

.method public e(Lii/d;Lmh/l;)Ljava/util/Collection;
    .locals 5

    const-string v0, "kindFilter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameFilter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LNh/f;->d:LNh/G;

    invoke-direct {p0}, LNh/f;->j()[Lii/k;

    move-result-object v1

    invoke-interface {v0, p1, p2}, Lii/n;->e(Lii/d;Lmh/l;)Ljava/util/Collection;

    move-result-object v0

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    invoke-interface {v4, p1, p2}, Lii/n;->e(Lii/d;Lmh/l;)Ljava/util/Collection;

    move-result-object v4

    invoke-static {v0, v4}, Lwi/a;->a(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    if-nez v0, :cond_1

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    :cond_1
    return-object v0
.end method

.method public f()Ljava/util/Set;
    .locals 2

    invoke-direct {p0}, LNh/f;->j()[Lii/k;

    move-result-object v0

    invoke-static {v0}, LZg/n;->P([Ljava/lang/Object;)Ljava/lang/Iterable;

    move-result-object v0

    invoke-static {v0}, Lii/m;->a(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LNh/f;->d:LNh/G;

    invoke-virtual {v1}, LNh/U;->f()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public g(LZh/f;LIh/b;)LBh/h;
    .locals 6

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, LNh/f;->l(LZh/f;LIh/b;)V

    iget-object v0, p0, LNh/f;->d:LNh/G;

    invoke-virtual {v0, p1, p2}, LNh/G;->l0(LZh/f;LIh/b;)LBh/e;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-direct {p0}, LNh/f;->j()[Lii/k;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_3

    aget-object v4, v0, v3

    invoke-interface {v4, p1, p2}, Lii/n;->g(LZh/f;LIh/b;)LBh/h;

    move-result-object v4

    if-eqz v4, :cond_2

    instance-of v5, v4, LBh/i;

    if-eqz v5, :cond_1

    move-object v5, v4

    check-cast v5, LBh/C;

    invoke-interface {v5}, LBh/C;->L()Z

    move-result v5

    if-eqz v5, :cond_1

    if-nez v2, :cond_2

    move-object v2, v4

    goto :goto_1

    :cond_1
    move-object v2, v4

    goto :goto_2

    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    :goto_2
    return-object v2
.end method

.method public final i()LNh/G;
    .locals 1

    iget-object v0, p0, LNh/f;->d:LNh/G;

    return-object v0
.end method

.method public l(LZh/f;LIh/b;)V
    .locals 2

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LNh/f;->b:LMh/k;

    invoke-virtual {v0}, LMh/k;->a()LMh/d;

    move-result-object v0

    invoke-virtual {v0}, LMh/d;->l()LIh/c;

    move-result-object v0

    iget-object v1, p0, LNh/f;->c:LNh/D;

    invoke-static {v0, p2, v1, p1}, LHh/a;->b(LIh/c;LIh/b;LBh/M;LZh/f;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "scope for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LNh/f;->c:LNh/D;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
