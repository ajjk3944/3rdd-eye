.class public final Lii/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lii/k;


# instance fields
.field private final b:Lii/k;

.field private final c:LYg/m;

.field private final d:Lpi/G0;

.field private e:Ljava/util/Map;

.field private final f:LYg/m;


# direct methods
.method public constructor <init>(Lii/k;Lpi/G0;)V
    .locals 2

    const-string v0, "workerScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "givenSubstitutor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lii/t;->b:Lii/k;

    new-instance p1, Lii/r;

    invoke-direct {p1, p2}, Lii/r;-><init>(Lpi/G0;)V

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lii/t;->c:LYg/m;

    invoke-virtual {p2}, Lpi/G0;->j()Lpi/E0;

    move-result-object p1

    const-string p2, "getSubstitution(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v1, p2, v0}, Lci/e;->h(Lpi/E0;ZILjava/lang/Object;)Lpi/E0;

    move-result-object p1

    invoke-virtual {p1}, Lpi/E0;->c()Lpi/G0;

    move-result-object p1

    iput-object p1, p0, Lii/t;->d:Lpi/G0;

    new-instance p1, Lii/s;

    invoke-direct {p1, p0}, Lii/s;-><init>(Lii/t;)V

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lii/t;->f:LYg/m;

    return-void
.end method

.method private static final h(Lii/t;)Ljava/util/Collection;
    .locals 3

    iget-object v0, p0, Lii/t;->b:Lii/k;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-static {v0, v1, v1, v2, v1}, Lii/n$a;->a(Lii/n;Lii/d;Lmh/l;ILjava/lang/Object;)Ljava/util/Collection;

    move-result-object v0

    invoke-direct {p0, v0}, Lii/t;->m(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method static synthetic i(Lpi/G0;)Lpi/G0;
    .locals 0

    invoke-static {p0}, Lii/t;->n(Lpi/G0;)Lpi/G0;

    move-result-object p0

    return-object p0
.end method

.method static synthetic j(Lii/t;)Ljava/util/Collection;
    .locals 0

    invoke-static {p0}, Lii/t;->h(Lii/t;)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method private final k()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, Lii/t;->f:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method private final l(LBh/m;)LBh/m;
    .locals 3

    iget-object v0, p0, Lii/t;->d:Lpi/G0;

    invoke-virtual {v0}, Lpi/G0;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    iget-object v0, p0, Lii/t;->e:Ljava/util/Map;

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lii/t;->e:Ljava/util/Map;

    :cond_1
    iget-object v0, p0, Lii/t;->e:Ljava/util/Map;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_4

    instance-of v1, p1, LBh/i0;

    if-eqz v1, :cond_3

    move-object v1, p1

    check-cast v1, LBh/i0;

    iget-object v2, p0, Lii/t;->d:Lpi/G0;

    invoke-interface {v1, v2}, LBh/i0;->c(Lpi/G0;)LBh/n;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " substitution fails"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown descriptor in scope: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_0
    check-cast v1, LBh/m;

    const-string p1, "null cannot be cast to non-null type D of org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1
.end method

.method private final m(Ljava/util/Collection;)Ljava/util/Collection;
    .locals 2

    iget-object v0, p0, Lii/t;->d:Lpi/G0;

    invoke-virtual {v0}, Lpi/G0;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v0

    invoke-static {v0}, Lxi/a;->g(I)Ljava/util/LinkedHashSet;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LBh/m;

    invoke-direct {p0, v1}, Lii/t;->l(LBh/m;)LBh/m;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method private static final n(Lpi/G0;)Lpi/G0;
    .locals 0

    invoke-virtual {p0}, Lpi/G0;->j()Lpi/E0;

    move-result-object p0

    invoke-virtual {p0}, Lpi/E0;->c()Lpi/G0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lii/t;->b:Lii/k;

    invoke-interface {v0}, Lii/k;->a()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public b(LZh/f;LIh/b;)Ljava/util/Collection;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lii/t;->b:Lii/k;

    invoke-interface {v0, p1, p2}, Lii/k;->b(LZh/f;LIh/b;)Ljava/util/Collection;

    move-result-object p1

    invoke-direct {p0, p1}, Lii/t;->m(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lii/t;->b:Lii/k;

    invoke-interface {v0}, Lii/k;->c()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public d(LZh/f;LIh/b;)Ljava/util/Collection;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lii/t;->b:Lii/k;

    invoke-interface {v0, p1, p2}, Lii/k;->d(LZh/f;LIh/b;)Ljava/util/Collection;

    move-result-object p1

    invoke-direct {p0, p1}, Lii/t;->m(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public e(Lii/d;Lmh/l;)Ljava/util/Collection;
    .locals 1

    const-string v0, "kindFilter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "nameFilter"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lii/t;->k()Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public f()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lii/t;->b:Lii/k;

    invoke-interface {v0}, Lii/k;->f()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public g(LZh/f;LIh/b;)LBh/h;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lii/t;->b:Lii/k;

    invoke-interface {v0, p1, p2}, Lii/n;->g(LZh/f;LIh/b;)LBh/h;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-direct {p0, p1}, Lii/t;->l(LBh/m;)LBh/m;

    move-result-object p1

    check-cast p1, LBh/h;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method
