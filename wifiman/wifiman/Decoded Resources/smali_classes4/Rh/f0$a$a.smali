.class public final LRh/f0$a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LRh/f0$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/util/List;

.field private d:LYg/s;

.field final synthetic e:LRh/f0$a;


# direct methods
.method public constructor <init>(LRh/f0$a;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "functionName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LRh/f0$a$a;->e:LRh/f0$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LRh/f0$a$a;->a:Ljava/lang/String;

    iput-object p3, p0, LRh/f0$a$a;->b:Ljava/lang/String;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LRh/f0$a$a;->c:Ljava/util/List;

    const-string p1, "V"

    const/4 p2, 0x0

    invoke-static {p1, p2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p1

    iput-object p1, p0, LRh/f0$a$a;->d:LYg/s;

    return-void
.end method


# virtual methods
.method public final a()LYg/s;
    .locals 7

    sget-object v0, LSh/F;->a:LSh/F;

    iget-object v1, p0, LRh/f0$a$a;->e:LRh/f0$a;

    invoke-virtual {v1}, LRh/f0$a;->c()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, LRh/f0$a$a;->a:Ljava/lang/String;

    iget-object v3, p0, LRh/f0$a$a;->c:Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v3, v5}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LYg/s;

    invoke-virtual {v6}, LYg/s;->h()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v3, p0, LRh/f0$a$a;->d:LYg/s;

    invoke-virtual {v3}, LYg/s;->h()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v0, v2, v4, v3}, LSh/F;->j(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LSh/F;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LRh/f0$a$a;->d:LYg/s;

    invoke-virtual {v1}, LYg/s;->j()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LRh/j0;

    iget-object v2, p0, LRh/f0$a$a;->c:Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v2, v5}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LYg/s;

    invoke-virtual {v4}, LYg/s;->j()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LRh/j0;

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    iget-object v2, p0, LRh/f0$a$a;->b:Ljava/lang/String;

    new-instance v4, LRh/Y;

    invoke-direct {v4, v1, v3, v2}, LRh/Y;-><init>(LRh/j0;Ljava/util/List;Ljava/lang/String;)V

    invoke-static {v0, v4}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v0

    return-object v0
.end method

.method public final varargs b(Ljava/lang/String;[LRh/h;)V
    .locals 4

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "qualifiers"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LRh/f0$a$a;->c:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    array-length v1, p2

    if-nez v1, :cond_0

    const/4 p2, 0x0

    goto :goto_1

    :cond_0
    invoke-static {p2}, LZg/n;->q1([Ljava/lang/Object;)Ljava/lang/Iterable;

    move-result-object p2

    const/16 v1, 0xa

    invoke-static {p2, v1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-static {v1}, LZg/U;->d(I)I

    move-result v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Lsh/m;->d(II)I

    move-result v1

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LZg/N;

    invoke-virtual {v1}, LZg/N;->c()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1}, LZg/N;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LRh/h;

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    new-instance p2, LRh/j0;

    invoke-direct {p2, v2}, LRh/j0;-><init>(Ljava/util/Map;)V

    :goto_1
    invoke-static {p1, p2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final c(Lgi/e;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lgi/e;->getDesc()Ljava/lang/String;

    move-result-object p1

    const-string v0, "getDesc(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-static {p1, v0}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p1

    iput-object p1, p0, LRh/f0$a$a;->d:LYg/s;

    return-void
.end method

.method public final varargs d(Ljava/lang/String;[LRh/h;)V
    .locals 3

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "qualifiers"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, LZg/n;->q1([Ljava/lang/Object;)Ljava/lang/Iterable;

    move-result-object p2

    const/16 v0, 0xa

    invoke-static {p2, v0}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-static {v0}, LZg/U;->d(I)I

    move-result v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Lsh/m;->d(II)I

    move-result v0

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZg/N;

    invoke-virtual {v0}, LZg/N;->c()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0}, LZg/N;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LRh/h;

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance p2, LRh/j0;

    invoke-direct {p2, v1}, LRh/j0;-><init>(Ljava/util/Map;)V

    invoke-static {p1, p2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p1

    iput-object p1, p0, LRh/f0$a$a;->d:LYg/s;

    return-void
.end method
