.class public final LFi/d;
.super LZg/i;
.source "SourceFile"

# interfaces
.implements LCi/g$a;


# instance fields
.field private a:LFi/c;

.field private b:Ljava/lang/Object;

.field private c:Ljava/lang/Object;

.field private final d:LEi/f;


# direct methods
.method public constructor <init>(LFi/c;)V
    .locals 1

    const-string v0, "map"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LZg/i;-><init>()V

    iput-object p1, p0, LFi/d;->a:LFi/c;

    invoke-virtual {p1}, LFi/c;->r()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, LFi/d;->b:Ljava/lang/Object;

    invoke-virtual {p1}, LFi/c;->u()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, LFi/d;->c:Ljava/lang/Object;

    invoke-virtual {p1}, LFi/c;->s()LEi/d;

    move-result-object p1

    invoke-virtual {p1}, LEi/d;->q()LEi/f;

    move-result-object p1

    iput-object p1, p0, LFi/d;->d:LEi/f;

    return-void
.end method


# virtual methods
.method public a()LCi/g;
    .locals 5

    iget-object v0, p0, LFi/d;->a:LFi/c;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    iget-object v3, p0, LFi/d;->d:LEi/f;

    invoke-virtual {v3}, LEi/f;->h()LEi/d;

    move-result-object v3

    if-eqz v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    invoke-static {v3}, LHi/a;->a(Z)V

    iget-object v3, p0, LFi/d;->b:Ljava/lang/Object;

    invoke-virtual {v0}, LFi/c;->r()Ljava/lang/Object;

    move-result-object v4

    if-ne v3, v4, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    invoke-static {v3}, LHi/a;->a(Z)V

    iget-object v3, p0, LFi/d;->c:Ljava/lang/Object;

    invoke-virtual {v0}, LFi/c;->u()Ljava/lang/Object;

    move-result-object v4

    if-ne v3, v4, :cond_2

    move v1, v2

    :cond_2
    invoke-static {v1}, LHi/a;->a(Z)V

    goto :goto_2

    :cond_3
    iget-object v0, p0, LFi/d;->d:LEi/f;

    invoke-virtual {v0}, LEi/f;->h()LEi/d;

    move-result-object v0

    if-nez v0, :cond_4

    move v1, v2

    :cond_4
    invoke-static {v1}, LHi/a;->a(Z)V

    iget-object v0, p0, LFi/d;->d:LEi/f;

    invoke-virtual {v0}, LEi/f;->g()LEi/d;

    move-result-object v0

    new-instance v1, LFi/c;

    iget-object v2, p0, LFi/d;->b:Ljava/lang/Object;

    iget-object v3, p0, LFi/d;->c:Ljava/lang/Object;

    invoke-direct {v1, v2, v3, v0}, LFi/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;LEi/d;)V

    iput-object v1, p0, LFi/d;->a:LFi/c;

    move-object v0, v1

    :goto_2
    return-object v0
.end method

.method public b()Ljava/util/Set;
    .locals 1

    new-instance v0, LFi/e;

    invoke-direct {v0, p0}, LFi/e;-><init>(LFi/d;)V

    return-object v0
.end method

.method public clear()V
    .locals 1

    iget-object v0, p0, LFi/d;->d:LEi/f;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, LFi/d;->a:LFi/c;

    :cond_0
    iget-object v0, p0, LFi/d;->d:LEi/f;

    invoke-virtual {v0}, LEi/f;->clear()V

    sget-object v0, LHi/c;->a:LHi/c;

    iput-object v0, p0, LFi/d;->b:Ljava/lang/Object;

    iput-object v0, p0, LFi/d;->c:Ljava/lang/Object;

    return-void
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LFi/d;->d:LEi/f;

    invoke-virtual {v0, p1}, LEi/f;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public d()Ljava/util/Set;
    .locals 1

    new-instance v0, LFi/g;

    invoke-direct {v0, p0}, LFi/g;-><init>(LFi/d;)V

    return-object v0
.end method

.method public e()I
    .locals 1

    iget-object v0, p0, LFi/d;->d:LEi/f;

    invoke-virtual {v0}, LZg/i;->size()I

    move-result v0

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
    instance-of v0, v2, LFi/c;

    if-eqz v0, :cond_3

    iget-object v0, p0, LFi/d;->d:LEi/f;

    invoke-virtual {v0}, LEi/f;->j()LEi/t;

    move-result-object v0

    check-cast p1, LFi/c;

    invoke-virtual {p1}, LFi/c;->s()LEi/d;

    move-result-object p1

    invoke-virtual {p1}, LEi/d;->t()LEi/t;

    move-result-object p1

    sget-object v1, LFi/d$a;->a:LFi/d$a;

    invoke-virtual {v0, p1, v1}, LEi/t;->k(LEi/t;Lmh/p;)Z

    move-result p1

    goto :goto_0

    :cond_3
    instance-of v0, v2, LFi/d;

    if-eqz v0, :cond_4

    iget-object v0, p0, LFi/d;->d:LEi/f;

    invoke-virtual {v0}, LEi/f;->j()LEi/t;

    move-result-object v0

    check-cast p1, LFi/d;

    iget-object p1, p1, LFi/d;->d:LEi/f;

    invoke-virtual {p1}, LEi/f;->j()LEi/t;

    move-result-object p1

    sget-object v1, LFi/d$b;->a:LFi/d$b;

    invoke-virtual {v0, p1, v1}, LEi/t;->k(LEi/t;Lmh/p;)Z

    move-result p1

    goto :goto_0

    :cond_4
    instance-of v0, v2, LEi/d;

    if-eqz v0, :cond_5

    iget-object v0, p0, LFi/d;->d:LEi/f;

    invoke-virtual {v0}, LEi/f;->j()LEi/t;

    move-result-object v0

    check-cast p1, LEi/d;

    invoke-virtual {p1}, LEi/d;->t()LEi/t;

    move-result-object p1

    sget-object v1, LFi/d$c;->a:LFi/d$c;

    invoke-virtual {v0, p1, v1}, LEi/t;->k(LEi/t;Lmh/p;)Z

    move-result p1

    goto :goto_0

    :cond_5
    instance-of v0, v2, LEi/f;

    if-eqz v0, :cond_6

    iget-object v0, p0, LFi/d;->d:LEi/f;

    invoke-virtual {v0}, LEi/f;->j()LEi/t;

    move-result-object v0

    check-cast p1, LEi/f;

    invoke-virtual {p1}, LEi/f;->j()LEi/t;

    move-result-object p1

    sget-object v1, LFi/d$d;->a:LFi/d$d;

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

    new-instance v0, LFi/j;

    invoke-direct {v0, p0}, LFi/j;-><init>(LFi/d;)V

    return-object v0
.end method

.method public final g()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LFi/d;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LFi/d;->d:LEi/f;

    invoke-virtual {v0, p1}, LEi/f;->get(Ljava/lang/Object;)Ljava/lang/Object;

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

.method public final h()LEi/f;
    .locals 1

    iget-object v0, p0, LFi/d;->d:LEi/f;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    sget-object v0, LHi/e;->a:LHi/e;

    invoke-virtual {v0, p0}, LHi/e;->c(Ljava/util/Map;)I

    move-result v0

    return v0
.end method

.method public put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, LFi/d;->d:LEi/f;

    invoke-virtual {v0, p1}, LEi/f;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LFi/a;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LFi/a;->e()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, p2, :cond_0

    goto :goto_1

    :cond_0
    iput-object v1, p0, LFi/d;->a:LFi/c;

    iget-object v1, p0, LFi/d;->d:LEi/f;

    invoke-virtual {v0, p2}, LFi/a;->h(Ljava/lang/Object;)LFi/a;

    move-result-object p2

    invoke-interface {v1, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, LFi/a;->e()Ljava/lang/Object;

    move-result-object p2

    goto :goto_1

    :cond_1
    iput-object v1, p0, LFi/d;->a:LFi/c;

    invoke-virtual {p0}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    iput-object p1, p0, LFi/d;->b:Ljava/lang/Object;

    iput-object p1, p0, LFi/d;->c:Ljava/lang/Object;

    iget-object v0, p0, LFi/d;->d:LEi/f;

    new-instance v2, LFi/a;

    invoke-direct {v2, p2}, LFi/a;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    iget-object v0, p0, LFi/d;->c:Ljava/lang/Object;

    iget-object v2, p0, LFi/d;->d:LEi/f;

    invoke-virtual {v2, v0}, LEi/f;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v2, LFi/a;

    invoke-virtual {v2}, LFi/a;->a()Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    invoke-static {v3}, LHi/a;->a(Z)V

    iget-object v3, p0, LFi/d;->d:LEi/f;

    invoke-virtual {v2, p1}, LFi/a;->f(Ljava/lang/Object;)LFi/a;

    move-result-object v2

    invoke-interface {v3, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, LFi/d;->d:LEi/f;

    new-instance v3, LFi/a;

    invoke-direct {v3, p2, v0}, LFi/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v2, p1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, LFi/d;->c:Ljava/lang/Object;

    :goto_0
    move-object p2, v1

    :goto_1
    return-object p2
.end method

.method public remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, LFi/d;->d:LEi/f;

    invoke-virtual {v0, p1}, LEi/f;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LFi/a;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 2
    :cond_0
    iput-object v0, p0, LFi/d;->a:LFi/c;

    .line 3
    invoke-virtual {p1}, LFi/a;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, LFi/d;->d:LEi/f;

    invoke-virtual {p1}, LFi/a;->d()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v0, LFi/a;

    .line 5
    iget-object v1, p0, LFi/d;->d:LEi/f;

    invoke-virtual {p1}, LFi/a;->d()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p1}, LFi/a;->c()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v3}, LFi/a;->f(Ljava/lang/Object;)LFi/a;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 6
    :cond_1
    invoke-virtual {p1}, LFi/a;->c()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, LFi/d;->b:Ljava/lang/Object;

    .line 7
    :goto_0
    invoke-virtual {p1}, LFi/a;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 8
    iget-object v0, p0, LFi/d;->d:LEi/f;

    invoke-virtual {p1}, LFi/a;->c()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v0, LFi/a;

    .line 9
    iget-object v1, p0, LFi/d;->d:LEi/f;

    invoke-virtual {p1}, LFi/a;->c()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p1}, LFi/a;->d()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v3}, LFi/a;->g(Ljava/lang/Object;)LFi/a;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 10
    :cond_2
    invoke-virtual {p1}, LFi/a;->d()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, LFi/d;->c:Ljava/lang/Object;

    .line 11
    :goto_1
    invoke-virtual {p1}, LFi/a;->e()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final remove(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    .line 12
    iget-object v0, p0, LFi/d;->d:LEi/f;

    invoke-virtual {v0, p1}, LEi/f;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LFi/a;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 13
    :cond_0
    invoke-virtual {v0}, LFi/a;->e()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    goto :goto_0

    .line 14
    :cond_1
    invoke-virtual {p0, p1}, LFi/d;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x1

    :goto_0
    return v1
.end method
