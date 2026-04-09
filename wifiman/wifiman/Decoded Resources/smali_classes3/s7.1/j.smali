.class public final Ls7/j;
.super Ls7/b;
.source "SourceFile"


# instance fields
.field private final b:Ljava/lang/String;

.field private c:Ls7/c;

.field private final d:Ljava/util/SortedSet;


# direct methods
.method public constructor <init>(Ls7/c;)V
    .locals 1

    const-string/jumbo v0, "identification"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ls7/b;-><init>(Ljava/util/Map;)V

    invoke-virtual {p1}, Ls7/c;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ls7/j;->b:Ljava/lang/String;

    iput-object p1, p0, Ls7/j;->c:Ls7/c;

    const/4 p1, 0x0

    new-array p1, p1, [Lr7/a;

    invoke-static {p1}, LZg/d0;->d([Ljava/lang/Object;)Ljava/util/TreeSet;

    move-result-object p1

    iput-object p1, p0, Ls7/j;->d:Ljava/util/SortedSet;

    return-void
.end method


# virtual methods
.method public c()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Ls7/j;->d:Ljava/util/SortedSet;

    return-object v0
.end method

.method public final f(Ls7/a;I)V
    .locals 2

    const-string/jumbo v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ls7/j;->d:Ljava/util/SortedSet;

    new-instance v1, Lr7/a;

    invoke-direct {v1, p2, p1}, Lr7/a;-><init>(ILjava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ls7/j;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final h()Ls7/i;
    .locals 4

    new-instance v0, Ls7/i;

    invoke-virtual {p0}, Ls7/j;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Ls7/j;->c()Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, LZg/v;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v2

    invoke-virtual {p0}, Ls7/b;->b()Ljava/util/Map;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Ls7/i;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/util/Map;)V

    return-object v0
.end method

.method public final i(Ls7/g;I)V
    .locals 2

    const-string/jumbo v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ls7/j;->c:Ls7/c;

    invoke-virtual {p1}, Ls7/g;->c()Ls7/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Ls7/c;->f(Ls7/c;)V

    invoke-virtual {p1}, Ls7/g;->a()Ls7/a;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Ls7/j;->f(Ls7/a;I)V

    invoke-virtual {p1}, Ls7/g;->b()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls7/h;

    invoke-virtual {p0, v0, p2}, Ls7/b;->a(Ls7/h;I)V

    goto :goto_0

    :cond_0
    return-void
.end method
