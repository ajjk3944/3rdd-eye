.class public abstract LJh/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJh/b$a;
    }
.end annotation


# static fields
.field private static final c:LJh/b$a;

.field private static final d:Ljava/util/Map;


# instance fields
.field private final a:LJh/D;

.field private final b:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, LJh/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LJh/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LJh/b;->c:LJh/b$a;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-static {}, LJh/c;->values()[LJh/c;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, LJh/c;->getJavaTarget()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_0

    invoke-interface {v0, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    sput-object v0, LJh/b;->d:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(LJh/D;)V
    .locals 1

    const-string v0, "javaTypeEnhancementState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJh/b;->a:LJh/D;

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, LJh/b;->b:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method static synthetic a(Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0}, LJh/b;->f(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private final b(Ljava/util/Set;)Ljava/util/Set;
    .locals 2

    sget-object v0, LJh/c;->TYPE_USE:LJh/c;

    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, LJh/c;->values()[LJh/c;

    move-result-object v0

    invoke-static {v0}, LZg/n;->p1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sget-object v1, LJh/c;->TYPE_PARAMETER_BOUNDS:LJh/c;

    invoke-static {v0, v1}, LZg/d0;->k(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {v0, p1}, LZg/d0;->l(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method private final e(Ljava/lang/Object;)LJh/w;
    .locals 10

    invoke-direct {p0, p1}, LJh/b;->u(Ljava/lang/Object;)LJh/w;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-direct {p0, p1}, LJh/b;->w(Ljava/lang/Object;)LYg/s;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    invoke-virtual {v0}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0}, LYg/s;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    invoke-direct {p0, p1}, LJh/b;->t(Ljava/lang/Object;)LJh/O;

    move-result-object p1

    if-nez p1, :cond_2

    invoke-direct {p0, v2}, LJh/b;->s(Ljava/lang/Object;)LJh/O;

    move-result-object p1

    :cond_2
    invoke-virtual {p1}, LJh/O;->isIgnore()Z

    move-result v3

    if-eqz v3, :cond_3

    return-object v1

    :cond_3
    sget-object v3, LJh/a;->a:LJh/a;

    invoke-direct {p0, v2, v3}, LJh/b;->i(Ljava/lang/Object;Lmh/l;)LRh/l;

    move-result-object v2

    if-nez v2, :cond_4

    return-object v1

    :cond_4
    new-instance v9, LJh/w;

    invoke-virtual {p1}, LJh/O;->isWarning()Z

    move-result p1

    const/4 v3, 0x1

    invoke-static {v2, v1, p1, v3, v1}, LRh/l;->b(LRh/l;LRh/k;ZILjava/lang/Object;)LRh/l;

    move-result-object v4

    move-object v5, v0

    check-cast v5, Ljava/util/Collection;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v3, v9

    invoke-direct/range {v3 .. v8}, LJh/w;-><init>(LRh/l;Ljava/util/Collection;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v9
.end method

.method private static final f(Ljava/lang/Object;)Z
    .locals 1

    const-string v0, "$this$extractNullability"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0
.end method

.method private final i(Ljava/lang/Object;Lmh/l;)LRh/l;
    .locals 3

    invoke-interface {p2, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-direct {p0, p1, v0}, LJh/b;->q(Ljava/lang/Object;Z)LRh/l;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0, p1}, LJh/b;->v(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    invoke-direct {p0, p1}, LJh/b;->s(Ljava/lang/Object;)LJh/O;

    move-result-object p1

    invoke-virtual {p1}, LJh/O;->isIgnore()Z

    move-result v2

    if-eqz v2, :cond_2

    return-object v1

    :cond_2
    invoke-interface {p2, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-direct {p0, v0, p2}, LJh/b;->q(Ljava/lang/Object;Z)LRh/l;

    move-result-object p2

    if-eqz p2, :cond_3

    invoke-virtual {p1}, LJh/O;->isWarning()Z

    move-result p1

    const/4 v0, 0x1

    invoke-static {p2, v1, p1, v0, v1}, LRh/l;->b(LRh/l;LRh/k;ZILjava/lang/Object;)LRh/l;

    move-result-object v1

    :cond_3
    return-object v1
.end method

.method private final j(Ljava/lang/Object;LZh/c;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0, p1}, LJh/b;->m(Ljava/lang/Object;)Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, LJh/b;->k(Ljava/lang/Object;)LZh/c;

    move-result-object v1

    invoke-static {v1, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method private final n(Ljava/lang/Object;LZh/c;)Z
    .locals 2

    invoke-virtual {p0, p1}, LJh/b;->m(Ljava/lang/Object;)Ljava/lang/Iterable;

    move-result-object p1

    instance-of v0, p1, Ljava/util/Collection;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, LJh/b;->k(Ljava/lang/Object;)LZh/c;

    move-result-object v0

    invoke-static {v0, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    :cond_2
    :goto_0
    return v1
.end method

.method private final q(Ljava/lang/Object;Z)LRh/l;
    .locals 5

    invoke-virtual {p0, p1}, LJh/b;->k(Ljava/lang/Object;)LZh/c;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget-object v2, p0, LJh/b;->a:LJh/D;

    invoke-virtual {v2}, LJh/D;->c()Lmh/l;

    move-result-object v2

    invoke-interface {v2, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LJh/O;

    invoke-virtual {v2}, LJh/O;->isIgnore()Z

    move-result v3

    if-eqz v3, :cond_1

    return-object v1

    :cond_1
    invoke-static {}, LJh/J;->m()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    sget-object p1, LRh/k;->NOT_NULL:LRh/k;

    goto :goto_2

    :cond_2
    invoke-static {}, LJh/J;->n()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    sget-object p1, LRh/k;->NULLABLE:LRh/k;

    goto :goto_2

    :cond_3
    invoke-static {}, LJh/J;->b()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    sget-object p1, LRh/k;->FORCE_FLEXIBILITY:LRh/k;

    goto :goto_2

    :cond_4
    invoke-static {}, LJh/J;->c()LZh/c;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-virtual {p0, p1, v4}, LJh/b;->c(Ljava/lang/Object;Z)Ljava/lang/Iterable;

    move-result-object p1

    invoke-static {p1}, LZg/v;->r0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "ALWAYS"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    goto :goto_1

    :sswitch_1
    const-string v0, "UNKNOWN"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_0

    :cond_5
    sget-object p1, LRh/k;->FORCE_FLEXIBILITY:LRh/k;

    goto :goto_2

    :sswitch_2
    const-string v0, "NEVER"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_0

    :sswitch_3
    const-string v0, "MAYBE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    :cond_6
    :goto_0
    return-object v1

    :cond_7
    sget-object p1, LRh/k;->NULLABLE:LRh/k;

    goto :goto_2

    :cond_8
    :goto_1
    sget-object p1, LRh/k;->NOT_NULL:LRh/k;

    :goto_2
    new-instance v0, LRh/l;

    invoke-virtual {v2}, LJh/O;->isWarning()Z

    move-result v1

    if-nez v1, :cond_9

    if-eqz p2, :cond_a

    :cond_9
    const/4 v4, 0x1

    :cond_a
    invoke-direct {v0, p1, v4}, LRh/l;-><init>(LRh/k;Z)V

    return-object v0

    :cond_b
    return-object v1

    nop

    :sswitch_data_0
    .sparse-switch
        0x45bf448 -> :sswitch_3
        0x46bd26c -> :sswitch_2
        0x19d1382a -> :sswitch_1
        0x7342860f -> :sswitch_0
    .end sparse-switch
.end method

.method private final r(Ljava/lang/Object;)LJh/O;
    .locals 2

    invoke-virtual {p0, p1}, LJh/b;->k(Ljava/lang/Object;)LZh/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, LJh/x;->b()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object p1, p0, LJh/b;->a:LJh/D;

    invoke-virtual {p1}, LJh/D;->c()Lmh/l;

    move-result-object p1

    invoke-interface {p1, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LJh/O;

    return-object p1

    :cond_0
    invoke-direct {p0, p1}, LJh/b;->s(Ljava/lang/Object;)LJh/O;

    move-result-object p1

    return-object p1
.end method

.method private final s(Ljava/lang/Object;)LJh/O;
    .locals 0

    invoke-direct {p0, p1}, LJh/b;->t(Ljava/lang/Object;)LJh/O;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    iget-object p1, p0, LJh/b;->a:LJh/D;

    invoke-virtual {p1}, LJh/D;->d()LJh/G;

    move-result-object p1

    invoke-virtual {p1}, LJh/G;->c()LJh/O;

    move-result-object p1

    return-object p1
.end method

.method private final t(Ljava/lang/Object;)LJh/O;
    .locals 3

    iget-object v0, p0, LJh/b;->a:LJh/D;

    invoke-virtual {v0}, LJh/D;->d()LJh/G;

    move-result-object v0

    invoke-virtual {v0}, LJh/G;->e()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0, p1}, LJh/b;->k(Ljava/lang/Object;)LZh/c;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJh/O;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-static {}, LJh/J;->p()LZh/c;

    move-result-object v0

    invoke-direct {p0, p1, v0}, LJh/b;->j(Ljava/lang/Object;LZh/c;)Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_9

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1}, LJh/b;->c(Ljava/lang/Object;Z)Ljava/lang/Iterable;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-static {p1}, LZg/v;->r0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, LJh/b;->a:LJh/D;

    invoke-virtual {v1}, LJh/D;->d()LJh/G;

    move-result-object v1

    invoke-virtual {v1}, LJh/G;->d()LJh/O;

    move-result-object v1

    if-nez v1, :cond_8

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v2, -0x7f610e2e

    if-eq v1, v2, :cond_6

    const v2, -0x6d97ad37

    if-eq v1, v2, :cond_4

    const v2, 0x288a86

    if-eq v1, v2, :cond_2

    goto :goto_0

    :cond_2
    const-string v1, "WARN"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    sget-object v0, LJh/O;->WARN:LJh/O;

    goto :goto_0

    :cond_4
    const-string v1, "STRICT"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_0

    :cond_5
    sget-object v0, LJh/O;->STRICT:LJh/O;

    goto :goto_0

    :cond_6
    const-string v1, "IGNORE"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_0

    :cond_7
    sget-object v0, LJh/O;->IGNORE:LJh/O;

    goto :goto_0

    :cond_8
    move-object v0, v1

    :cond_9
    :goto_0
    return-object v0
.end method

.method private final u(Ljava/lang/Object;)LJh/w;
    .locals 8

    iget-object v0, p0, LJh/b;->a:LJh/D;

    invoke-virtual {v0}, LJh/D;->b()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    invoke-static {}, LJh/x;->a()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0, p1}, LJh/b;->k(Ljava/lang/Object;)LZh/c;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LJh/w;

    if-eqz v2, :cond_3

    invoke-direct {p0, p1}, LJh/b;->r(Ljava/lang/Object;)LJh/O;

    move-result-object p1

    sget-object v0, LJh/O;->IGNORE:LJh/O;

    if-eq p1, v0, :cond_1

    goto :goto_0

    :cond_1
    move-object p1, v1

    :goto_0
    if-nez p1, :cond_2

    return-object v1

    :cond_2
    invoke-virtual {v2}, LJh/w;->d()LRh/l;

    move-result-object v0

    invoke-virtual {p1}, LJh/O;->isWarning()Z

    move-result p1

    const/4 v3, 0x1

    invoke-static {v0, v1, p1, v3, v1}, LRh/l;->b(LRh/l;LRh/k;ZILjava/lang/Object;)LRh/l;

    move-result-object v3

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, LJh/w;->b(LJh/w;LRh/l;Ljava/util/Collection;ZILjava/lang/Object;)LJh/w;

    move-result-object v1

    :cond_3
    return-object v1
.end method

.method private final w(Ljava/lang/Object;)LYg/s;
    .locals 4

    iget-object v0, p0, LJh/b;->a:LJh/D;

    invoke-virtual {v0}, LJh/D;->d()LJh/G;

    move-result-object v0

    invoke-virtual {v0}, LJh/G;->f()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    invoke-static {}, LJh/J;->g()LZh/c;

    move-result-object v0

    invoke-direct {p0, p1, v0}, LJh/b;->j(Ljava/lang/Object;LZh/c;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    invoke-virtual {p0, p1}, LJh/b;->m(Ljava/lang/Object;)Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p0, v2}, LJh/b;->v(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_3
    move-object v2, v1

    :goto_0
    if-nez v2, :cond_4

    return-object v1

    :cond_4
    const/4 p1, 0x1

    invoke-virtual {p0, v0, p1}, LJh/b;->c(Ljava/lang/Object;Z)Ljava/lang/Iterable;

    move-result-object p1

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    sget-object v3, LJh/b;->d:Ljava/util/Map;

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LJh/c;

    if-eqz v1, :cond_5

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    new-instance p1, LYg/s;

    invoke-direct {p0, v0}, LJh/b;->b(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    invoke-direct {p1, v2, v0}, LYg/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method


# virtual methods
.method protected abstract c(Ljava/lang/Object;Z)Ljava/lang/Iterable;
.end method

.method public final d(LJh/E;Ljava/lang/Iterable;)LJh/E;
    .locals 9

    const-string v0, "annotations"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LJh/b;->a:LJh/D;

    invoke-virtual {v0}, LJh/D;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {p0, v1}, LJh/b;->e(Ljava/lang/Object;)LJh/w;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_3

    return-object p1

    :cond_3
    new-instance p2, Ljava/util/EnumMap;

    const-class v1, LJh/c;

    invoke-direct {p2, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LJh/w;

    invoke-virtual {v2}, LJh/w;->e()Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LJh/c;

    invoke-interface {p2, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-virtual {p0}, LJh/b;->o()Z

    move-result v5

    if-nez v5, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual {p2, v4}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LJh/w;

    if-nez v5, :cond_6

    goto :goto_1

    :cond_6
    invoke-virtual {v5}, LJh/w;->d()LRh/l;

    move-result-object v6

    invoke-virtual {v2}, LJh/w;->d()LRh/l;

    move-result-object v7

    invoke-static {v7, v6}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    goto :goto_2

    :cond_7
    invoke-virtual {v7}, LRh/l;->d()Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-virtual {v6}, LRh/l;->d()Z

    move-result v8

    if-nez v8, :cond_8

    goto :goto_2

    :cond_8
    invoke-virtual {v7}, LRh/l;->d()Z

    move-result v5

    if-nez v5, :cond_9

    invoke-virtual {v6}, LRh/l;->d()Z

    move-result v5

    if-eqz v5, :cond_9

    move-object v5, v2

    goto :goto_2

    :cond_9
    const/4 v5, 0x0

    :goto_2
    invoke-interface {p2, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_a
    :goto_3
    invoke-interface {p2, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_b
    if-eqz p1, :cond_c

    invoke-virtual {p1}, LJh/E;->b()Ljava/util/EnumMap;

    move-result-object v0

    if-eqz v0, :cond_c

    new-instance v1, Ljava/util/EnumMap;

    invoke-direct {v1, v0}, Ljava/util/EnumMap;-><init>(Ljava/util/EnumMap;)V

    goto :goto_4

    :cond_c
    new-instance v0, Ljava/util/EnumMap;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    move-object v1, v0

    :goto_4
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v0, 0x0

    :cond_d
    :goto_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LJh/c;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LJh/w;

    if-eqz v2, :cond_d

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    goto :goto_5

    :cond_e
    if-nez v0, :cond_f

    goto :goto_6

    :cond_f
    new-instance p1, LJh/E;

    invoke-direct {p1, v1}, LJh/E;-><init>(Ljava/util/EnumMap;)V

    :goto_6
    return-object p1
.end method

.method public final g(Ljava/lang/Iterable;)LRh/i;
    .locals 4

    const-string v0, "annotations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    move-object v1, v0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p0, v2}, LJh/b;->k(Ljava/lang/Object;)LZh/c;

    move-result-object v2

    invoke-static {}, LJh/J;->o()Ljava/util/Set;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v3, v2}, LZg/v;->f0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    sget-object v2, LRh/i;->READ_ONLY:LRh/i;

    goto :goto_1

    :cond_1
    invoke-static {}, LJh/J;->l()Ljava/util/Set;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v3, v2}, LZg/v;->f0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v2, LRh/i;->MUTABLE:LRh/i;

    :goto_1
    if-eqz v1, :cond_2

    if-eq v1, v2, :cond_2

    return-object v0

    :cond_2
    move-object v1, v2

    goto :goto_0

    :cond_3
    return-object v1
.end method

.method public final h(Ljava/lang/Iterable;Lmh/l;)LRh/l;
    .locals 4

    const-string v0, "annotations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "forceWarning"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    move-object v1, v0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-direct {p0, v2, p2}, LJh/b;->i(Ljava/lang/Object;Lmh/l;)LRh/l;

    move-result-object v2

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    if-eqz v2, :cond_0

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v2}, LRh/l;->d()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v1}, LRh/l;->d()Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, LRh/l;->d()Z

    move-result v3

    if-nez v3, :cond_4

    invoke-virtual {v1}, LRh/l;->d()Z

    move-result v1

    if-eqz v1, :cond_4

    :goto_1
    move-object v1, v2

    goto :goto_0

    :cond_4
    return-object v0

    :cond_5
    return-object v1
.end method

.method protected abstract k(Ljava/lang/Object;)LZh/c;
.end method

.method protected abstract l(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method protected abstract m(Ljava/lang/Object;)Ljava/lang/Iterable;
.end method

.method public abstract o()Z
.end method

.method public final p(Ljava/lang/Object;)Z
    .locals 3

    const-string v0, "annotation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->H:LZh/c;

    invoke-direct {p0, p1, v0}, LJh/b;->j(Ljava/lang/Object;LZh/c;)Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0, p1, v0}, LJh/b;->c(Ljava/lang/Object;Z)Ljava/lang/Iterable;

    move-result-object p1

    instance-of v1, p1, Ljava/util/Collection;

    if-eqz v1, :cond_1

    move-object v1, p1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "TYPE"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v0, 0x1

    :cond_3
    :goto_0
    return v0
.end method

.method public final v(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    const-string v0, "annotation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LJh/b;->a:LJh/D;

    invoke-virtual {v0}, LJh/D;->d()LJh/G;

    move-result-object v0

    invoke-virtual {v0}, LJh/G;->f()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    invoke-static {}, LJh/J;->a()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-virtual {p0, p1}, LJh/b;->k(Ljava/lang/Object;)LZh/c;

    move-result-object v2

    invoke-static {v0, v2}, LZg/v;->f0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    invoke-static {}, LJh/J;->f()LZh/c;

    move-result-object v0

    invoke-direct {p0, p1, v0}, LJh/b;->n(Ljava/lang/Object;LZh/c;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_2

    :cond_1
    invoke-static {}, LJh/J;->h()LZh/c;

    move-result-object v0

    invoke-direct {p0, p1, v0}, LJh/b;->n(Ljava/lang/Object;LZh/c;)Z

    move-result v0

    if-nez v0, :cond_2

    return-object v1

    :cond_2
    iget-object v0, p0, LJh/b;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p0, p1}, LJh/b;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_7

    invoke-virtual {p0, p1}, LJh/b;->m(Ljava/lang/Object;)Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v3}, LJh/b;->v(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_3

    goto :goto_0

    :cond_4
    move-object v3, v1

    :goto_0
    if-nez v3, :cond_5

    return-object v1

    :cond_5
    invoke-interface {v0, v2, v3}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_6

    goto :goto_1

    :cond_6
    move-object v3, p1

    :cond_7
    :goto_1
    return-object v3

    :cond_8
    :goto_2
    return-object p1
.end method
