.class public abstract Lii/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lii/k;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Set;
    .locals 1

    invoke-virtual {p0}, Lii/a;->i()Lii/k;

    move-result-object v0

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

    invoke-virtual {p0}, Lii/a;->i()Lii/k;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lii/k;->b(LZh/f;LIh/b;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/util/Set;
    .locals 1

    invoke-virtual {p0}, Lii/a;->i()Lii/k;

    move-result-object v0

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

    invoke-virtual {p0}, Lii/a;->i()Lii/k;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lii/k;->d(LZh/f;LIh/b;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public e(Lii/d;Lmh/l;)Ljava/util/Collection;
    .locals 1

    const-string v0, "kindFilter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameFilter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lii/a;->i()Lii/k;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lii/n;->e(Lii/d;Lmh/l;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public f()Ljava/util/Set;
    .locals 1

    invoke-virtual {p0}, Lii/a;->i()Lii/k;

    move-result-object v0

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

    invoke-virtual {p0}, Lii/a;->i()Lii/k;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lii/n;->g(LZh/f;LIh/b;)LBh/h;

    move-result-object p1

    return-object p1
.end method

.method public final h()Lii/k;
    .locals 2

    invoke-virtual {p0}, Lii/a;->i()Lii/k;

    move-result-object v0

    instance-of v0, v0, Lii/a;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lii/a;->i()Lii/k;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lii/a;

    invoke-virtual {v0}, Lii/a;->h()Lii/k;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lii/a;->i()Lii/k;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method protected abstract i()Lii/k;
.end method
