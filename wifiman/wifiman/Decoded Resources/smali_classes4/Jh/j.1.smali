.class public final LJh/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LJh/j;

.field private static final b:Ljava/util/Map;

.field private static final c:Ljava/util/Map;

.field private static final d:Ljava/util/Set;

.field private static final e:Ljava/util/Set;

.field private static final f:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, LJh/j;

    invoke-direct {v0}, LJh/j;-><init>()V

    sput-object v0, LJh/j;->a:LJh/j;

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->s:LZh/d;

    const-string v1, "name"

    invoke-static {v0, v1}, LJh/k;->b(LZh/d;Ljava/lang/String;)LZh/c;

    move-result-object v1

    sget-object v2, Lkotlin/reflect/jvm/internal/impl/builtins/o;->m:LZh/f;

    invoke-static {v1, v2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v3

    const-string v1, "ordinal"

    invoke-static {v0, v1}, LJh/k;->b(LZh/d;Ljava/lang/String;)LZh/c;

    move-result-object v0

    invoke-static {v1}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v1

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v4

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->X:LZh/c;

    const-string v1, "size"

    invoke-static {v0, v1}, LJh/k;->a(LZh/c;Ljava/lang/String;)LZh/c;

    move-result-object v0

    invoke-static {v1}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v2

    invoke-static {v0, v2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v5

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->b0:LZh/c;

    invoke-static {v0, v1}, LJh/k;->a(LZh/c;Ljava/lang/String;)LZh/c;

    move-result-object v2

    invoke-static {v1}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v1

    invoke-static {v2, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v6

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->g:LZh/d;

    const-string v2, "length"

    invoke-static {v1, v2}, LJh/k;->b(LZh/d;Ljava/lang/String;)LZh/c;

    move-result-object v1

    invoke-static {v2}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v2

    invoke-static {v1, v2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v7

    const-string v1, "keys"

    invoke-static {v0, v1}, LJh/k;->a(LZh/c;Ljava/lang/String;)LZh/c;

    move-result-object v1

    const-string v2, "keySet"

    invoke-static {v2}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v2

    invoke-static {v1, v2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v8

    const-string v1, "values"

    invoke-static {v0, v1}, LJh/k;->a(LZh/c;Ljava/lang/String;)LZh/c;

    move-result-object v2

    invoke-static {v1}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v1

    invoke-static {v2, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v9

    const-string v1, "entries"

    invoke-static {v0, v1}, LJh/k;->a(LZh/c;Ljava/lang/String;)LZh/c;

    move-result-object v0

    const-string v1, "entrySet"

    invoke-static {v1}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v1

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v10

    filled-new-array/range {v3 .. v10}, [LYg/s;

    move-result-object v0

    invoke-static {v0}, LZg/U;->k([LYg/s;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, LJh/j;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    new-instance v4, LYg/s;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LZh/c;

    invoke-virtual {v5}, LZh/c;->g()LZh/f;

    move-result-object v5

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-direct {v4, v5, v3}, LYg/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LYg/s;

    invoke-virtual {v3}, LYg/s;->j()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LZh/f;

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_1

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    check-cast v5, Ljava/util/List;

    invoke-virtual {v3}, LYg/s;->h()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LZh/f;

    invoke-interface {v5, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v3

    invoke-static {v3}, LZg/U;->d(I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v3}, LZg/v;->g0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_3
    sput-object v1, LJh/j;->c:Ljava/util/Map;

    sget-object v0, LJh/j;->b:Ljava/util/Map;

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    sget-object v4, LAh/c;->a:LAh/c;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LZh/c;

    invoke-virtual {v5}, LZh/c;->e()LZh/c;

    move-result-object v5

    invoke-virtual {v5}, LZh/c;->j()LZh/d;

    move-result-object v5

    const-string v6, "toUnsafe(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v5}, LAh/c;->n(LZh/d;)LZh/b;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v4}, LZh/b;->a()LZh/c;

    move-result-object v4

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LZh/f;

    invoke-virtual {v4, v3}, LZh/c;->c(LZh/f;)LZh/c;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    sput-object v1, LJh/j;->d:Ljava/util/Set;

    sget-object v0, LJh/j;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    sput-object v0, LJh/j;->e:Ljava/util/Set;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LZh/c;

    invoke-virtual {v2}, LZh/c;->g()LZh/f;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_5
    invoke-static {v1}, LZg/v;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, LJh/j;->f:Ljava/util/Set;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 1

    sget-object v0, LJh/j;->b:Ljava/util/Map;

    return-object v0
.end method

.method public final b(LZh/f;)Ljava/util/List;
    .locals 1

    const-string v0, "name1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LJh/j;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public final c()Ljava/util/Set;
    .locals 1

    sget-object v0, LJh/j;->e:Ljava/util/Set;

    return-object v0
.end method

.method public final d()Ljava/util/Set;
    .locals 1

    sget-object v0, LJh/j;->f:Ljava/util/Set;

    return-object v0
.end method
