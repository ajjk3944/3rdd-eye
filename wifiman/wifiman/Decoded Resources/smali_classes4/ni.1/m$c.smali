.class final Lni/m$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lni/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field private final a:Ljava/util/Map;

.field private final b:Loi/h;

.field private final c:Loi/i;

.field final synthetic d:Lni/m;


# direct methods
.method public constructor <init>(Lni/m;)V
    .locals 5

    iput-object p1, p0, Lni/m$c;->d:Lni/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lni/m;->e1()LUh/c;

    move-result-object v0

    invoke-virtual {v0}, LUh/c;->M1()Ljava/util/List;

    move-result-object v0

    const-string v1, "getEnumEntryList(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    const/16 v1, 0xa

    invoke-static {v0, v1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-static {v1}, LZg/U;->d(I)I

    move-result v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Lsh/m;->d(II)I

    move-result v1

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, LUh/g;

    invoke-virtual {p1}, Lni/m;->d1()Lli/p;

    move-result-object v4

    invoke-virtual {v4}, Lli/p;->g()LWh/c;

    move-result-object v4

    invoke-virtual {v3}, LUh/g;->K0()I

    move-result v3

    invoke-static {v4, v3}, Lli/L;->b(LWh/c;I)LZh/f;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iput-object v2, p0, Lni/m$c;->a:Ljava/util/Map;

    iget-object p1, p0, Lni/m$c;->d:Lni/m;

    invoke-virtual {p1}, Lni/m;->d1()Lli/p;

    move-result-object p1

    invoke-virtual {p1}, Lli/p;->h()Loi/n;

    move-result-object p1

    iget-object v0, p0, Lni/m$c;->d:Lni/m;

    new-instance v1, Lni/o;

    invoke-direct {v1, p0, v0}, Lni/o;-><init>(Lni/m$c;Lni/m;)V

    invoke-interface {p1, v1}, Loi/n;->i(Lmh/l;)Loi/h;

    move-result-object p1

    iput-object p1, p0, Lni/m$c;->b:Loi/h;

    iget-object p1, p0, Lni/m$c;->d:Lni/m;

    invoke-virtual {p1}, Lni/m;->d1()Lli/p;

    move-result-object p1

    invoke-virtual {p1}, Lli/p;->h()Loi/n;

    move-result-object p1

    new-instance v0, Lni/p;

    invoke-direct {v0, p0}, Lni/p;-><init>(Lni/m$c;)V

    invoke-interface {p1, v0}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p1

    iput-object p1, p0, Lni/m$c;->c:Loi/i;

    return-void
.end method

.method static synthetic a(Lni/m$c;Lni/m;LZh/f;)LBh/e;
    .locals 0

    invoke-static {p0, p1, p2}, Lni/m$c;->f(Lni/m$c;Lni/m;LZh/f;)LBh/e;

    move-result-object p0

    return-object p0
.end method

.method static synthetic b(Lni/m$c;)Ljava/util/Set;
    .locals 0

    invoke-static {p0}, Lni/m$c;->h(Lni/m$c;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method static synthetic c(Lni/m;LUh/g;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Lni/m$c;->g(Lni/m;LUh/g;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private final e()Ljava/util/Set;
    .locals 5

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iget-object v1, p0, Lni/m$c;->d:Lni/m;

    invoke-virtual {v1}, Lni/m;->k()Lpi/v0;

    move-result-object v1

    invoke-interface {v1}, Lpi/v0;->a()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpi/S;

    invoke-virtual {v2}, Lpi/S;->r()Lii/k;

    move-result-object v2

    const/4 v3, 0x3

    const/4 v4, 0x0

    invoke-static {v2, v4, v4, v3, v4}, Lii/n$a;->a(Lii/n;Lii/d;Lmh/l;ILjava/lang/Object;)Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LBh/m;

    instance-of v4, v3, LBh/f0;

    if-nez v4, :cond_2

    instance-of v4, v3, LBh/Y;

    if-eqz v4, :cond_1

    :cond_2
    check-cast v3, LBh/b;

    invoke-interface {v3}, LBh/I;->getName()LZh/f;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    iget-object v1, p0, Lni/m$c;->d:Lni/m;

    invoke-virtual {v1}, Lni/m;->e1()LUh/c;

    move-result-object v1

    invoke-virtual {v1}, LUh/c;->R1()Ljava/util/List;

    move-result-object v1

    const-string v2, "getFunctionList(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    iget-object v2, p0, Lni/m$c;->d:Lni/m;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LUh/i;

    invoke-virtual {v2}, Lni/m;->d1()Lli/p;

    move-result-object v4

    invoke-virtual {v4}, Lli/p;->g()LWh/c;

    move-result-object v4

    invoke-virtual {v3}, LUh/i;->n1()I

    move-result v3

    invoke-static {v4, v3}, Lli/L;->b(LWh/c;I)LZh/f;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    iget-object v1, p0, Lni/m$c;->d:Lni/m;

    invoke-virtual {v1}, Lni/m;->e1()LUh/c;

    move-result-object v1

    invoke-virtual {v1}, LUh/c;->f2()Ljava/util/List;

    move-result-object v1

    const-string v2, "getPropertyList(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    iget-object v2, p0, Lni/m$c;->d:Lni/m;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LUh/n;

    invoke-virtual {v2}, Lni/m;->d1()Lli/p;

    move-result-object v4

    invoke-virtual {v4}, Lli/p;->g()LWh/c;

    move-result-object v4

    invoke-virtual {v3}, LUh/n;->m1()I

    move-result v3

    invoke-static {v4, v3}, Lli/L;->b(LWh/c;I)LZh/f;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    invoke-static {v0, v0}, LZg/d0;->l(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method private static final f(Lni/m$c;Lni/m;LZh/f;)LBh/e;
    .locals 8

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lni/m$c;->a:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LUh/g;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lni/m;->d1()Lli/p;

    move-result-object v1

    invoke-virtual {v1}, Lli/p;->h()Loi/n;

    move-result-object v2

    iget-object v5, p0, Lni/m$c;->c:Loi/i;

    new-instance v6, Lni/a;

    invoke-virtual {p1}, Lni/m;->d1()Lli/p;

    move-result-object p0

    invoke-virtual {p0}, Lli/p;->h()Loi/n;

    move-result-object p0

    new-instance v1, Lni/q;

    invoke-direct {v1, p1, v0}, Lni/q;-><init>(Lni/m;LUh/g;)V

    invoke-direct {v6, p0, v1}, Lni/a;-><init>(Loi/n;Lmh/a;)V

    sget-object v7, LBh/g0;->a:LBh/g0;

    move-object v3, p1

    move-object v4, p2

    invoke-static/range {v2 .. v7}, LDh/q;->L0(Loi/n;LBh/e;LZh/f;Loi/i;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/g0;)LDh/q;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method private static final g(Lni/m;LUh/g;)Ljava/util/List;
    .locals 1

    invoke-virtual {p0}, Lni/m;->d1()Lli/p;

    move-result-object v0

    invoke-virtual {v0}, Lli/p;->c()Lli/n;

    move-result-object v0

    invoke-virtual {v0}, Lli/n;->d()Lli/e;

    move-result-object v0

    invoke-virtual {p0}, Lni/m;->i1()Lli/N$a;

    move-result-object p0

    invoke-interface {v0, p0, p1}, Lli/h;->d(Lli/N;LUh/g;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Lni/m$c;)Ljava/util/Set;
    .locals 0

    invoke-direct {p0}, Lni/m$c;->e()Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final d()Ljava/util/Collection;
    .locals 3

    iget-object v0, p0, Lni/m$c;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

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

    check-cast v2, LZh/f;

    invoke-virtual {p0, v2}, Lni/m$c;->i(LZh/f;)LBh/e;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public final i(LZh/f;)LBh/e;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lni/m$c;->b:Loi/h;

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LBh/e;

    return-object p1
.end method
