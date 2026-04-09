.class public final LGi/c;
.super LZg/j;
.source "SourceFile"

# interfaces
.implements LCi/h$a;


# instance fields
.field private a:LGi/b;

.field private b:Ljava/lang/Object;

.field private c:Ljava/lang/Object;

.field private final d:LEi/f;


# direct methods
.method public constructor <init>(LGi/b;)V
    .locals 1

    const-string v0, "set"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LZg/j;-><init>()V

    iput-object p1, p0, LGi/c;->a:LGi/b;

    invoke-virtual {p1}, LGi/b;->y()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, LGi/c;->b:Ljava/lang/Object;

    invoke-virtual {p1}, LGi/b;->J()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, LGi/c;->c:Ljava/lang/Object;

    invoke-virtual {p1}, LGi/b;->C()LEi/d;

    move-result-object p1

    invoke-virtual {p1}, LEi/d;->q()LEi/f;

    move-result-object p1

    iput-object p1, p0, LGi/c;->d:LEi/f;

    return-void
.end method


# virtual methods
.method public a()LCi/h;
    .locals 5

    iget-object v0, p0, LGi/c;->a:LGi/b;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    iget-object v3, p0, LGi/c;->d:LEi/f;

    invoke-virtual {v3}, LEi/f;->h()LEi/d;

    move-result-object v3

    if-eqz v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    invoke-static {v3}, LHi/a;->a(Z)V

    iget-object v3, p0, LGi/c;->b:Ljava/lang/Object;

    invoke-virtual {v0}, LGi/b;->y()Ljava/lang/Object;

    move-result-object v4

    if-ne v3, v4, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    invoke-static {v3}, LHi/a;->a(Z)V

    iget-object v3, p0, LGi/c;->c:Ljava/lang/Object;

    invoke-virtual {v0}, LGi/b;->J()Ljava/lang/Object;

    move-result-object v4

    if-ne v3, v4, :cond_2

    move v1, v2

    :cond_2
    invoke-static {v1}, LHi/a;->a(Z)V

    goto :goto_2

    :cond_3
    iget-object v0, p0, LGi/c;->d:LEi/f;

    invoke-virtual {v0}, LEi/f;->h()LEi/d;

    move-result-object v0

    if-nez v0, :cond_4

    move v1, v2

    :cond_4
    invoke-static {v1}, LHi/a;->a(Z)V

    iget-object v0, p0, LGi/c;->d:LEi/f;

    invoke-virtual {v0}, LEi/f;->g()LEi/d;

    move-result-object v0

    new-instance v1, LGi/b;

    iget-object v2, p0, LGi/c;->b:Ljava/lang/Object;

    iget-object v3, p0, LGi/c;->c:Ljava/lang/Object;

    invoke-direct {v1, v2, v3, v0}, LGi/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;LEi/d;)V

    iput-object v1, p0, LGi/c;->a:LGi/b;

    move-object v0, v1

    :goto_2
    return-object v0
.end method

.method public add(Ljava/lang/Object;)Z
    .locals 4

    iget-object v0, p0, LGi/c;->d:LEi/f;

    invoke-virtual {v0, p1}, LEi/f;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, LGi/c;->a:LGi/b;

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iput-object p1, p0, LGi/c;->b:Ljava/lang/Object;

    iput-object p1, p0, LGi/c;->c:Ljava/lang/Object;

    iget-object v0, p0, LGi/c;->d:LEi/f;

    new-instance v2, LGi/a;

    invoke-direct {v2}, LGi/a;-><init>()V

    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v1

    :cond_1
    iget-object v0, p0, LGi/c;->d:LEi/f;

    iget-object v2, p0, LGi/c;->c:Ljava/lang/Object;

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v0, LGi/a;

    iget-object v2, p0, LGi/c;->d:LEi/f;

    iget-object v3, p0, LGi/c;->c:Ljava/lang/Object;

    invoke-virtual {v0, p1}, LGi/a;->e(Ljava/lang/Object;)LGi/a;

    move-result-object v0

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LGi/c;->d:LEi/f;

    new-instance v2, LGi/a;

    iget-object v3, p0, LGi/c;->c:Ljava/lang/Object;

    invoke-direct {v2, v3}, LGi/a;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, LGi/c;->c:Ljava/lang/Object;

    return v1
.end method

.method public clear()V
    .locals 1

    iget-object v0, p0, LGi/c;->d:LEi/f;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, LGi/c;->a:LGi/b;

    :cond_0
    iget-object v0, p0, LGi/c;->d:LEi/f;

    invoke-virtual {v0}, LEi/f;->clear()V

    sget-object v0, LHi/c;->a:LHi/c;

    iput-object v0, p0, LGi/c;->b:Ljava/lang/Object;

    iput-object v0, p0, LGi/c;->c:Ljava/lang/Object;

    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LGi/c;->d:LEi/f;

    invoke-virtual {v0, p1}, LEi/f;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Ljava/util/Set;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0}, LZg/j;->size()I

    move-result v0

    move-object v2, p1

    check-cast v2, Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->size()I

    move-result v3

    if-eq v0, v3, :cond_2

    return v1

    :cond_2
    instance-of v0, v2, LGi/b;

    if-eqz v0, :cond_3

    iget-object v0, p0, LGi/c;->d:LEi/f;

    invoke-virtual {v0}, LEi/f;->j()LEi/t;

    move-result-object v0

    check-cast p1, LGi/b;

    invoke-virtual {p1}, LGi/b;->C()LEi/d;

    move-result-object p1

    invoke-virtual {p1}, LEi/d;->t()LEi/t;

    move-result-object p1

    sget-object v1, LGi/c$a;->a:LGi/c$a;

    invoke-virtual {v0, p1, v1}, LEi/t;->k(LEi/t;Lmh/p;)Z

    move-result p1

    goto :goto_0

    :cond_3
    instance-of v0, v2, LGi/c;

    if-eqz v0, :cond_4

    iget-object v0, p0, LGi/c;->d:LEi/f;

    invoke-virtual {v0}, LEi/f;->j()LEi/t;

    move-result-object v0

    check-cast p1, LGi/c;

    iget-object p1, p1, LGi/c;->d:LEi/f;

    invoke-virtual {p1}, LEi/f;->j()LEi/t;

    move-result-object p1

    sget-object v1, LGi/c$b;->a:LGi/c$b;

    invoke-virtual {v0, p1, v1}, LEi/t;->k(LEi/t;Lmh/p;)Z

    move-result p1

    goto :goto_0

    :cond_4
    invoke-super {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    :goto_0
    return p1
.end method

.method public g()I
    .locals 1

    iget-object v0, p0, LGi/c;->d:LEi/f;

    invoke-virtual {v0}, LZg/i;->size()I

    move-result v0

    return v0
.end method

.method public hashCode()I
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, LGi/e;

    invoke-direct {v0, p0}, LGi/e;-><init>(LGi/c;)V

    return-object v0
.end method

.method public final j()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LGi/c;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 4

    iget-object v0, p0, LGi/c;->d:LEi/f;

    invoke-virtual {v0, p1}, LEi/f;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LGi/a;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, LGi/c;->a:LGi/b;

    invoke-virtual {p1}, LGi/a;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LGi/c;->d:LEi/f;

    invoke-virtual {p1}, LGi/a;->d()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v0, LGi/a;

    iget-object v1, p0, LGi/c;->d:LEi/f;

    invoke-virtual {p1}, LGi/a;->d()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p1}, LGi/a;->c()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v3}, LGi/a;->e(Ljava/lang/Object;)LGi/a;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, LGi/a;->c()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, LGi/c;->b:Ljava/lang/Object;

    :goto_0
    invoke-virtual {p1}, LGi/a;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LGi/c;->d:LEi/f;

    invoke-virtual {p1}, LGi/a;->c()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v0, LGi/a;

    iget-object v1, p0, LGi/c;->d:LEi/f;

    invoke-virtual {p1}, LGi/a;->c()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p1}, LGi/a;->d()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, LGi/a;->f(Ljava/lang/Object;)LGi/a;

    move-result-object p1

    invoke-interface {v1, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, LGi/a;->d()Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, LGi/c;->c:Ljava/lang/Object;

    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final s()LEi/f;
    .locals 1

    iget-object v0, p0, LGi/c;->d:LEi/f;

    return-object v0
.end method
