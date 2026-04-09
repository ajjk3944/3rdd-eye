.class public final Lvj/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/kodein/di/h;


# instance fields
.field private final a:Ljava/util/List;

.field private final b:Ljava/util/List;

.field private final c:Ljava/util/Map;

.field private final d:Ljava/util/Map;

.field private final e:Ljava/util/Map;

.field private final f:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/util/Map;Ljava/util/List;Ljava/util/List;)V
    .locals 6

    const-string/jumbo v0, "map"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "externalSources"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "registeredTranslators"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lvj/g;->a:Ljava/util/List;

    iput-object p3, p0, Lvj/g;->b:Ljava/util/List;

    invoke-static {}, Lvj/j;->a()Ljava/util/Map;

    move-result-object p2

    iput-object p2, p0, Lvj/g;->c:Ljava/util/Map;

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lvj/g;->d:Ljava/util/Map;

    new-instance p2, Ljava/util/ArrayList;

    invoke-virtual {p0}, Lvj/g;->h()Ljava/util/List;

    move-result-object p3

    check-cast p3, Ljava/util/Collection;

    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object p2, p0, Lvj/g;->f:Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map$Entry;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lorg/kodein/di/DI$e;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    move-object v0, p2

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lrj/j2;

    instance-of v3, v2, Lrj/k2;

    if-eqz v3, :cond_0

    check-cast v2, Lrj/k2;

    goto :goto_2

    :cond_0
    new-instance v3, Lrj/k2;

    invoke-virtual {v2}, Lrj/j2;->a()Luj/e;

    move-result-object v4

    invoke-virtual {v2}, Lrj/j2;->b()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v4, v2, p0}, Lrj/k2;-><init>(Luj/e;Ljava/lang/String;Lorg/kodein/di/h;)V

    move-object v2, v3

    :goto_2
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lvj/g;->c:Ljava/util/Map;

    new-instance v2, LYg/y;

    const/4 v3, 0x0

    invoke-direct {v2, p3, v1, v3}, LYg/y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, p3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, LZg/v;->q0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lrj/j2;

    invoke-virtual {p2}, Lrj/j2;->a()Luj/e;

    move-result-object p2

    invoke-interface {p2}, Luj/e;->g()Z

    move-result p2

    if-eqz p2, :cond_2

    new-instance p2, Lvj/k$a;

    invoke-virtual {p3}, Lorg/kodein/di/DI$e;->l()Lorg/kodein/type/q;

    move-result-object v0

    invoke-direct {p2, v0}, Lvj/k$a;-><init>(Lorg/kodein/type/q;)V

    goto :goto_3

    :cond_2
    new-instance p2, Lvj/k$b;

    invoke-virtual {p3}, Lorg/kodein/di/DI$e;->l()Lorg/kodein/type/q;

    move-result-object v0

    invoke-direct {p2, v0}, Lvj/k$b;-><init>(Lorg/kodein/type/q;)V

    :goto_3
    iget-object v0, p0, Lvj/g;->d:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_3

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v0, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    check-cast v1, Ljava/util/Map;

    new-instance p2, Lvj/k$a;

    invoke-virtual {p3}, Lorg/kodein/di/DI$e;->g()Lorg/kodein/type/q;

    move-result-object v0

    invoke-direct {p2, v0}, Lvj/k$a;-><init>(Lorg/kodein/type/q;)V

    invoke-interface {v1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_4

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    check-cast v0, Ljava/util/Map;

    new-instance p2, Lvj/k$a;

    invoke-virtual {p3}, Lorg/kodein/di/DI$e;->d()Lorg/kodein/type/q;

    move-result-object v1

    invoke-direct {p2, v1}, Lvj/k$a;-><init>(Lorg/kodein/type/q;)V

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_5

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v0, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    check-cast v1, Ljava/util/Map;

    invoke-virtual {p3}, Lorg/kodein/di/DI$e;->k()Ljava/lang/Object;

    move-result-object p2

    invoke-interface {v1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_6
    iget-object p1, p0, Lvj/g;->c:Ljava/util/Map;

    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result p3

    invoke-static {p3}, LZg/U;->d(I)I

    move-result p3

    invoke-direct {p2, p3}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map$Entry;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LYg/y;

    invoke-virtual {p3}, LYg/y;->l()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/List;

    invoke-interface {p2, v0, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_7
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1, p2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object p1, p0, Lvj/g;->e:Ljava/util/Map;

    :cond_8
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iget-object p2, p0, Lvj/g;->f:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_9
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_e

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Luj/d;

    iget-object v0, p0, Lvj/g;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_a
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Luj/d;

    invoke-interface {v1}, Luj/d;->b()Lorg/kodein/type/q;

    move-result-object v2

    invoke-interface {p3}, Luj/d;->c()Lorg/kodein/type/q;

    move-result-object v3

    invoke-interface {v2, v3}, Lorg/kodein/type/q;->d(Lorg/kodein/type/q;)Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {p3}, Luj/d;->b()Lorg/kodein/type/q;

    move-result-object v2

    invoke-interface {v1}, Luj/d;->c()Lorg/kodein/type/q;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    iget-object v2, p0, Lvj/g;->f:Ljava/util/ArrayList;

    if-eqz v2, :cond_b

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_b

    goto :goto_6

    :cond_b
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Luj/d;

    invoke-interface {v3}, Luj/d;->b()Lorg/kodein/type/q;

    move-result-object v4

    invoke-interface {p3}, Luj/d;->b()Lorg/kodein/type/q;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-interface {v3}, Luj/d;->c()Lorg/kodein/type/q;

    move-result-object v3

    invoke-interface {v1}, Luj/d;->c()Lorg/kodein/type/q;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_c

    goto :goto_5

    :cond_d
    :goto_6
    new-instance v2, Luj/c;

    const-string/jumbo v3, "null cannot be cast to non-null type org.kodein.di.bindings.ContextTranslator<kotlin.Any, kotlin.Any>"

    invoke-static {p3, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, p3, v1}, Luj/c;-><init>(Luj/d;Luj/d;)V

    invoke-interface {p1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_e
    iget-object p2, p0, Lvj/g;->f:Ljava/util/ArrayList;

    invoke-static {p2, p1}, LZg/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_8

    return-void
.end method

.method public static final synthetic f(Lvj/g;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Lvj/g;->f:Ljava/util/ArrayList;

    return-object p0
.end method

.method private final g(Lrj/N5;)Ljava/util/List;
    .locals 3

    iget-object v0, p0, Lvj/g;->d:Ljava/util/Map;

    invoke-static {v0}, LZg/U;->y(Ljava/util/Map;)Lzi/j;

    move-result-object v0

    invoke-virtual {p1}, Lrj/N5;->d()Lorg/kodein/type/q;

    move-result-object v1

    if-eqz v1, :cond_0

    sget-object v2, Lorg/kodein/type/q;->a:Lorg/kodein/type/q$a;

    invoke-virtual {v2}, Lorg/kodein/type/q$a;->a()Lorg/kodein/type/q;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    new-instance v2, Lvj/g$a;

    invoke-direct {v2, v1}, Lvj/g$a;-><init>(Lorg/kodein/type/q;)V

    invoke-static {v0, v2}, Lzi/m;->C(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v0

    :cond_0
    sget-object v1, Lvj/g$f;->a:Lvj/g$f;

    invoke-static {v0, v1}, Lzi/m;->H(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v0

    invoke-virtual {p1}, Lrj/N5;->b()Lorg/kodein/type/q;

    move-result-object v1

    if-eqz v1, :cond_1

    new-instance v2, Lvj/g$b;

    invoke-direct {v2, v1, p0}, Lvj/g$b;-><init>(Lorg/kodein/type/q;Lvj/g;)V

    invoke-static {v0, v2}, Lzi/m;->O(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v0

    :cond_1
    sget-object v1, Lvj/g$e;->a:Lvj/g$e;

    invoke-static {v0, v1}, Lzi/m;->H(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v0

    invoke-virtual {p1}, Lrj/N5;->a()Lorg/kodein/type/q;

    move-result-object v1

    if-eqz v1, :cond_2

    new-instance v2, Lvj/g$c;

    invoke-direct {v2, v1}, Lvj/g$c;-><init>(Lorg/kodein/type/q;)V

    invoke-static {v0, v2}, Lzi/m;->C(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v0

    :cond_2
    sget-object v1, Lvj/g$h;->a:Lvj/g$h;

    invoke-static {v0, v1}, Lzi/m;->H(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v0

    invoke-virtual {p1}, Lrj/N5;->c()Ljava/lang/Object;

    move-result-object p1

    sget-object v1, Lrj/N5$a;->a:Lrj/N5$a;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    new-instance v1, Lvj/g$d;

    invoke-direct {v1, p1}, Lvj/g$d;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, v1}, Lzi/m;->C(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v0

    :cond_3
    sget-object p1, Lvj/g$g;->a:Lvj/g$g;

    invoke-static {v0, p1}, Lzi/m;->N(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object p1

    invoke-static {p1}, Lzi/m;->Z(Lzi/j;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private final i(Lorg/kodein/di/DI$e;Lorg/kodein/di/DI$e;)Ljava/lang/IllegalStateException;
    .locals 11

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Tree returned key "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/kodein/di/DI$e;->j()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " that is not in cache when searching for "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lorg/kodein/di/DI$e;->j()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".\nKeys in cache:\n"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lvj/g;->c:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Ljava/lang/Iterable;

    sget-object v8, Lvj/g$i;->a:Lvj/g$i;

    const/16 v9, 0x1e

    const/4 v10, 0x0

    const-string v3, "\n"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v10}, LZg/v;->z0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lvj/g;->e:Ljava/util/Map;

    return-object v0
.end method

.method public b(Lorg/kodein/di/DI$e;)LYg/y;
    .locals 1

    const-string/jumbo v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lvj/g;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LYg/y;

    return-object p1
.end method

.method public c()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lvj/g;->a:Ljava/util/List;

    return-object v0
.end method

.method public d(Lorg/kodein/di/DI$e;IZ)Ljava/util/List;
    .locals 9

    const-string/jumbo v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-nez p3, :cond_d

    iget-object p3, p0, Lvj/g;->c:Ljava/util/Map;

    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LYg/y;

    if-eqz p3, :cond_1

    invoke-virtual {p3}, LYg/y;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/kodein/di/DI$e;

    invoke-virtual {p3}, LYg/y;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-virtual {p3}, LYg/y;->d()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Luj/d;

    invoke-static {v0, p2}, LZg/v;->t0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lrj/k2;

    if-nez p2, :cond_0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, LYg/y;

    const-string/jumbo v1, "null cannot be cast to non-null type org.kodein.di.DI.Key<kotlin.Any, A of org.kodein.di.internal.DITreeImpl.find$lambda$7, T of org.kodein.di.internal.DITreeImpl.find$lambda$7>"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "null cannot be cast to non-null type org.kodein.di.DIDefinition<kotlin.Any, A of org.kodein.di.internal.DITreeImpl.find$lambda$7, T of org.kodein.di.internal.DITreeImpl.find$lambda$7>"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1, p2, p3}, LYg/y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p1}, Lorg/kodein/di/DI$e;->g()Lorg/kodein/type/q;

    move-result-object p3

    sget-object v1, Lorg/kodein/type/q;->a:Lorg/kodein/type/q$a;

    invoke-virtual {v1}, Lorg/kodein/type/q$a;->a()Lorg/kodein/type/q;

    move-result-object v2

    invoke-static {p3, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_4

    invoke-virtual {v1}, Lorg/kodein/type/q$a;->a()Lorg/kodein/type/q;

    move-result-object v3

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v8}, Lorg/kodein/di/DI$e;->c(Lorg/kodein/di/DI$e;Lorg/kodein/type/q;Lorg/kodein/type/q;Lorg/kodein/type/q;Ljava/lang/Object;ILjava/lang/Object;)Lorg/kodein/di/DI$e;

    move-result-object p3

    iget-object v1, p0, Lvj/g;->c:Ljava/util/Map;

    invoke-interface {v1, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LYg/y;

    if-eqz p3, :cond_4

    invoke-virtual {p3}, LYg/y;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/kodein/di/DI$e;

    invoke-virtual {p3}, LYg/y;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-virtual {p3}, LYg/y;->d()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Luj/d;

    if-eqz v3, :cond_2

    invoke-interface {v3}, Luj/d;->b()Lorg/kodein/type/q;

    move-result-object v4

    invoke-virtual {p1}, Lorg/kodein/di/DI$e;->g()Lorg/kodein/type/q;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lvj/g;->c:Ljava/util/Map;

    invoke-interface {v0, p1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v2, p2}, LZg/v;->t0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lrj/k2;

    if-nez p1, :cond_3

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance p2, LYg/y;

    const-string/jumbo p3, "null cannot be cast to non-null type org.kodein.di.DI.Key<kotlin.Any, A of org.kodein.di.internal.DITreeImpl.find$lambda$8, T of org.kodein.di.internal.DITreeImpl.find$lambda$8>"

    invoke-static {v1, p3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p3, "null cannot be cast to non-null type org.kodein.di.DIDefinition<kotlin.Any, A of org.kodein.di.internal.DITreeImpl.find$lambda$8, T of org.kodein.di.internal.DITreeImpl.find$lambda$8>"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2, v1, p1, v3}, LYg/y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p2}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_4
    :goto_0
    iget-object p3, p0, Lvj/g;->f:Ljava/util/ArrayList;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_5
    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Luj/d;

    invoke-interface {v3}, Luj/d;->b()Lorg/kodein/type/q;

    move-result-object v3

    invoke-virtual {p1}, Lorg/kodein/di/DI$e;->g()Lorg/kodein/type/q;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    iget-object p3, p0, Lvj/g;->f:Ljava/util/ArrayList;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_7
    :goto_2
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Luj/d;

    invoke-interface {v4}, Luj/d;->b()Lorg/kodein/type/q;

    move-result-object v4

    sget-object v5, Lorg/kodein/type/q;->a:Lorg/kodein/type/q$a;

    invoke-virtual {v5}, Lorg/kodein/type/q$a;->a()Lorg/kodein/type/q;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_8
    invoke-static {v1, v2}, LZg/v;->M0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_9
    :goto_3
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Luj/d;

    new-instance v2, Lorg/kodein/di/DI$e;

    invoke-interface {v1}, Luj/d;->c()Lorg/kodein/type/q;

    move-result-object v3

    invoke-virtual {p1}, Lorg/kodein/di/DI$e;->d()Lorg/kodein/type/q;

    move-result-object v4

    invoke-virtual {p1}, Lorg/kodein/di/DI$e;->l()Lorg/kodein/type/q;

    move-result-object v5

    invoke-virtual {p1}, Lorg/kodein/di/DI$e;->k()Ljava/lang/Object;

    move-result-object v6

    invoke-direct {v2, v3, v4, v5, v6}, Lorg/kodein/di/DI$e;-><init>(Lorg/kodein/type/q;Lorg/kodein/type/q;Lorg/kodein/type/q;Ljava/lang/Object;)V

    iget-object v3, p0, Lvj/g;->c:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYg/y;

    if-eqz v2, :cond_9

    invoke-virtual {v2}, LYg/y;->m()Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_a

    move-object v8, v2

    goto :goto_4

    :cond_a
    move-object v8, v0

    :goto_4
    if-eqz v8, :cond_9

    invoke-virtual {v8}, LYg/y;->m()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_b

    goto :goto_3

    :cond_b
    iget-object p3, p0, Lvj/g;->c:Ljava/util/Map;

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, v8

    move-object v5, v1

    invoke-static/range {v2 .. v7}, LYg/y;->h(LYg/y;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)LYg/y;

    move-result-object v0

    invoke-interface {p3, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v8}, LYg/y;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/kodein/di/DI$e;

    invoke-virtual {v8}, LYg/y;->c()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/List;

    invoke-static {p3, p2}, LZg/v;->t0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lrj/k2;

    if-nez p2, :cond_c

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_c
    new-instance p3, LYg/y;

    const-string/jumbo v0, "null cannot be cast to non-null type org.kodein.di.DI.Key<kotlin.Any, A of org.kodein.di.internal.DITreeImpl.find$lambda$12, T of org.kodein.di.internal.DITreeImpl.find$lambda$12>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "null cannot be cast to non-null type org.kodein.di.DIDefinition<kotlin.Any, A of org.kodein.di.internal.DITreeImpl.find$lambda$12, T of org.kodein.di.internal.DITreeImpl.find$lambda$12>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p3, p1, p2, v1}, LYg/y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p3}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_d
    new-instance p3, Lrj/N5;

    invoke-virtual {p1}, Lorg/kodein/di/DI$e;->g()Lorg/kodein/type/q;

    move-result-object v1

    invoke-virtual {p1}, Lorg/kodein/di/DI$e;->d()Lorg/kodein/type/q;

    move-result-object v2

    invoke-virtual {p1}, Lorg/kodein/di/DI$e;->l()Lorg/kodein/type/q;

    move-result-object v3

    invoke-virtual {p1}, Lorg/kodein/di/DI$e;->k()Ljava/lang/Object;

    move-result-object v4

    invoke-direct {p3, v1, v2, v3, v4}, Lrj/N5;-><init>(Lorg/kodein/type/q;Lorg/kodein/type/q;Lorg/kodein/type/q;Ljava/lang/Object;)V

    invoke-direct {p0, p3}, Lvj/g;->g(Lrj/N5;)Ljava/util/List;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_f

    invoke-static {p3}, LZg/v;->q0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYg/s;

    invoke-virtual {v1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/kodein/di/DI$e;

    invoke-virtual {v1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Luj/d;

    iget-object v1, p0, Lvj/g;->c:Ljava/util/Map;

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LYg/y;

    if-eqz v3, :cond_e

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, LYg/y;->h(LYg/y;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)LYg/y;

    move-result-object v3

    if-eqz v3, :cond_e

    invoke-interface {v1, p1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :cond_e
    invoke-direct {p0, v2, p1}, Lvj/g;->i(Lorg/kodein/di/DI$e;Lorg/kodein/di/DI$e;)Ljava/lang/IllegalStateException;

    move-result-object p1

    throw p1

    :cond_f
    :goto_5
    check-cast p3, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_10
    :goto_6
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_13

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYg/s;

    invoke-virtual {v2}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/kodein/di/DI$e;

    invoke-virtual {v2}, LYg/s;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Luj/d;

    iget-object v4, p0, Lvj/g;->c:Ljava/util/Map;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LYg/y;

    if-eqz v4, :cond_12

    invoke-virtual {v4}, LYg/y;->c()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4, p2}, LZg/v;->t0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lrj/k2;

    if-nez v4, :cond_11

    move-object v5, v0

    goto :goto_7

    :cond_11
    new-instance v5, LYg/y;

    const-string/jumbo v6, "null cannot be cast to non-null type org.kodein.di.DI.Key<kotlin.Any, A of org.kodein.di.internal.DITreeImpl.find$lambda$13, T of org.kodein.di.internal.DITreeImpl.find$lambda$13>"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v6, "null cannot be cast to non-null type org.kodein.di.DIDefinition<kotlin.Any, A of org.kodein.di.internal.DITreeImpl.find$lambda$13, T of org.kodein.di.internal.DITreeImpl.find$lambda$13>"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v5, v3, v4, v2}, LYg/y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_7
    if-eqz v5, :cond_10

    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_12
    invoke-direct {p0, v3, p1}, Lvj/g;->i(Lorg/kodein/di/DI$e;Lorg/kodein/di/DI$e;)Ljava/lang/IllegalStateException;

    move-result-object p1

    throw p1

    :cond_13
    return-object v1
.end method

.method public e(Lrj/N5;)Ljava/util/List;
    .locals 5

    const-string/jumbo v0, "search"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lvj/g;->g(Lrj/N5;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYg/s;

    invoke-virtual {v1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/kodein/di/DI$e;

    invoke-virtual {v1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Luj/d;

    new-instance v3, LYg/y;

    iget-object v4, p0, Lvj/g;->c:Ljava/util/Map;

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v4, LYg/y;

    invoke-virtual {v4}, LYg/y;->l()Ljava/lang/Object;

    move-result-object v4

    invoke-direct {v3, v2, v4, v1}, LYg/y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public h()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lvj/g;->b:Ljava/util/List;

    return-object v0
.end method
