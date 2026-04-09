.class public final LNh/a0;
.super LNh/b0;
.source "SourceFile"


# instance fields
.field private final n:LQh/g;

.field private final o:LLh/c;


# direct methods
.method public constructor <init>(LMh/k;LQh/g;LLh/c;)V
    .locals 1

    const-string v0, "c"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jClass"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownerDescriptor"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LNh/b0;-><init>(LMh/k;)V

    iput-object p2, p0, LNh/a0;->n:LQh/g;

    iput-object p3, p0, LNh/a0;->o:LLh/c;

    return-void
.end method

.method static synthetic g0(LQh/q;)Z
    .locals 0

    invoke-static {p0}, LNh/a0;->m0(LQh/q;)Z

    move-result p0

    return p0
.end method

.method static synthetic h0(Lii/k;)Ljava/util/Collection;
    .locals 0

    invoke-static {p0}, LNh/a0;->o0(Lii/k;)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method static synthetic i0(LZh/f;Lii/k;)Ljava/util/Collection;
    .locals 0

    invoke-static {p0, p1}, LNh/a0;->n0(LZh/f;Lii/k;)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method static synthetic j0(LBh/e;)Ljava/lang/Iterable;
    .locals 0

    invoke-static {p0}, LNh/a0;->q0(LBh/e;)Ljava/lang/Iterable;

    move-result-object p0

    return-object p0
.end method

.method static synthetic k0(Lpi/S;)LBh/e;
    .locals 0

    invoke-static {p0}, LNh/a0;->r0(Lpi/S;)LBh/e;

    move-result-object p0

    return-object p0
.end method

.method private static final m0(LQh/q;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LQh/s;->Q()Z

    move-result p0

    return p0
.end method

.method private static final n0(LZh/f;Lii/k;)Ljava/util/Collection;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LIh/d;->WHEN_GET_SUPER_MEMBERS:LIh/d;

    invoke-interface {p1, p0, v0}, Lii/k;->d(LZh/f;LIh/b;)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method private static final o0(Lii/k;)Ljava/util/Collection;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lii/k;->c()Ljava/util/Set;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    return-object p0
.end method

.method private final p0(LBh/e;Ljava/util/Set;Lmh/l;)Ljava/util/Set;
    .locals 3

    invoke-static {p1}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    sget-object v1, LNh/Y;->a:LNh/Y;

    new-instance v2, LNh/a0$a;

    invoke-direct {v2, p1, p2, p3}, LNh/a0$a;-><init>(LBh/e;Ljava/util/Set;Lmh/l;)V

    invoke-static {v0, v1, v2}, Lxi/b;->b(Ljava/util/Collection;Lxi/b$c;Lxi/b$d;)Ljava/lang/Object;

    return-object p2
.end method

.method private static final q0(LBh/e;)Ljava/lang/Iterable;
    .locals 1

    invoke-interface {p0}, LBh/h;->k()Lpi/v0;

    move-result-object p0

    invoke-interface {p0}, Lpi/v0;->a()Ljava/util/Collection;

    move-result-object p0

    const-string v0, "getSupertypes(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, LZg/v;->d0(Ljava/lang/Iterable;)Lzi/j;

    move-result-object p0

    sget-object v0, LNh/Z;->a:LNh/Z;

    invoke-static {p0, v0}, Lzi/m;->O(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object p0

    invoke-static {p0}, Lzi/m;->w(Lzi/j;)Ljava/lang/Iterable;

    move-result-object p0

    return-object p0
.end method

.method private static final r0(Lpi/S;)LBh/e;
    .locals 1

    invoke-virtual {p0}, Lpi/S;->N0()Lpi/v0;

    move-result-object p0

    invoke-interface {p0}, Lpi/v0;->c()LBh/h;

    move-result-object p0

    instance-of v0, p0, LBh/e;

    if-eqz v0, :cond_0

    check-cast p0, LBh/e;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method private final t0(LBh/Y;)LBh/Y;
    .locals 2

    invoke-interface {p1}, LBh/b;->h()LBh/b$a;

    move-result-object v0

    invoke-virtual {v0}, LBh/b$a;->isReal()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    invoke-interface {p1}, LBh/Y;->f()Ljava/util/Collection;

    move-result-object p1

    const-string v0, "getOverriddenDescriptors(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

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

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LBh/Y;

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {p0, v1}, LNh/a0;->t0(LBh/Y;)LBh/Y;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v0}, LZg/v;->g0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, LZg/v;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LBh/Y;

    return-object p1
.end method

.method private final u0(LZh/f;LBh/e;)Ljava/util/Set;
    .locals 1

    invoke-static {p2}, LLh/h;->b(LBh/e;)LNh/a0;

    move-result-object p2

    if-nez p2, :cond_0

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, LIh/d;->WHEN_GET_SUPER_MEMBERS:LIh/d;

    invoke-virtual {p2, p1, v0}, LNh/U;->b(LZh/f;LIh/b;)Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, LZg/v;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method protected B(Ljava/util/Collection;LZh/f;)V
    .locals 7

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LNh/a0;->s0()LLh/c;

    move-result-object v0

    invoke-direct {p0, p2, v0}, LNh/a0;->u0(LZh/f;LBh/e;)Ljava/util/Set;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-virtual {p0}, LNh/a0;->s0()LLh/c;

    move-result-object v4

    invoke-virtual {p0}, LNh/U;->L()LMh/k;

    move-result-object v0

    invoke-virtual {v0}, LMh/k;->a()LMh/d;

    move-result-object v0

    invoke-virtual {v0}, LMh/d;->c()Lli/w;

    move-result-object v5

    invoke-virtual {p0}, LNh/U;->L()LMh/k;

    move-result-object v0

    invoke-virtual {v0}, LMh/k;->a()LMh/d;

    move-result-object v0

    invoke-virtual {v0}, LMh/d;->k()Lkotlin/reflect/jvm/internal/impl/types/checker/p;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/reflect/jvm/internal/impl/types/checker/p;->a()Lbi/o;

    move-result-object v6

    move-object v1, p2

    move-object v3, p1

    invoke-static/range {v1 .. v6}, LKh/a;->e(LZh/f;Ljava/util/Collection;Ljava/util/Collection;LBh/e;Lli/w;Lbi/o;)Ljava/util/Collection;

    move-result-object v0

    const-string v1, "resolveOverridesForStaticMembers(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, LNh/a0;->n:LQh/g;

    invoke-interface {v0}, LQh/g;->A()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o;->f:LZh/f;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LNh/a0;->s0()LLh/c;

    move-result-object p2

    invoke-static {p2}, Lbi/h;->g(LBh/e;)LBh/f0;

    move-result-object p2

    const-string v0, "createEnumValueOfMethod(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o;->d:LZh/f;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p0}, LNh/a0;->s0()LLh/c;

    move-result-object p2

    invoke-static {p2}, Lbi/h;->h(LBh/e;)LBh/f0;

    move-result-object p2

    const-string v0, "createEnumValuesMethod(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    return-void
.end method

.method protected C(LZh/f;Ljava/util/Collection;)V
    .locals 10

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LNh/a0;->s0()LLh/c;

    move-result-object v0

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    new-instance v2, LNh/X;

    invoke-direct {v2, p1}, LNh/X;-><init>(LZh/f;)V

    invoke-direct {p0, v0, v1, v2}, LNh/a0;->p0(LBh/e;Ljava/util/Set;Lmh/l;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    const-string v2, "resolveOverridesForStaticMembers(...)"

    if-nez v1, :cond_0

    move-object v4, v0

    check-cast v4, Ljava/util/Collection;

    invoke-virtual {p0}, LNh/a0;->s0()LLh/c;

    move-result-object v6

    invoke-virtual {p0}, LNh/U;->L()LMh/k;

    move-result-object v0

    invoke-virtual {v0}, LMh/k;->a()LMh/d;

    move-result-object v0

    invoke-virtual {v0}, LMh/d;->c()Lli/w;

    move-result-object v7

    invoke-virtual {p0}, LNh/U;->L()LMh/k;

    move-result-object v0

    invoke-virtual {v0}, LMh/k;->a()LMh/d;

    move-result-object v0

    invoke-virtual {v0}, LMh/d;->k()Lkotlin/reflect/jvm/internal/impl/types/checker/p;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/reflect/jvm/internal/impl/types/checker/p;->a()Lbi/o;

    move-result-object v8

    move-object v3, p1

    move-object v5, p2

    invoke-static/range {v3 .. v8}, LKh/a;->e(LZh/f;Ljava/util/Collection;Ljava/util/Collection;LBh/e;Lli/w;Lbi/o;)Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, v0}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    goto/16 :goto_2

    :cond_0
    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, LBh/Y;

    invoke-direct {p0, v4}, LNh/a0;->t0(LBh/Y;)LBh/Y;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_1

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    check-cast v5, Ljava/util/List;

    invoke-interface {v5, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Ljava/util/Collection;

    invoke-virtual {p0}, LNh/a0;->s0()LLh/c;

    move-result-object v7

    invoke-virtual {p0}, LNh/U;->L()LMh/k;

    move-result-object v3

    invoke-virtual {v3}, LMh/k;->a()LMh/d;

    move-result-object v3

    invoke-virtual {v3}, LMh/d;->c()Lli/w;

    move-result-object v8

    invoke-virtual {p0}, LNh/U;->L()LMh/k;

    move-result-object v3

    invoke-virtual {v3}, LMh/k;->a()LMh/d;

    move-result-object v3

    invoke-virtual {v3}, LMh/d;->k()Lkotlin/reflect/jvm/internal/impl/types/checker/p;

    move-result-object v3

    invoke-interface {v3}, Lkotlin/reflect/jvm/internal/impl/types/checker/p;->a()Lbi/o;

    move-result-object v9

    move-object v4, p1

    move-object v6, p2

    invoke-static/range {v4 .. v9}, LKh/a;->e(LZh/f;Ljava/util/Collection;Ljava/util/Collection;LBh/e;Lli/w;Lbi/o;)Ljava/util/Collection;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v0, v3}, LZg/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_1

    :cond_3
    invoke-interface {p2, v0}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    :goto_2
    iget-object v0, p0, LNh/a0;->n:LQh/g;

    invoke-interface {v0}, LQh/g;->A()Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o;->e:LZh/f;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {p0}, LNh/a0;->s0()LLh/c;

    move-result-object p1

    invoke-static {p1}, Lbi/h;->f(LBh/e;)LBh/Y;

    move-result-object p1

    invoke-static {p2, p1}, Lxi/a;->a(Ljava/util/Collection;Ljava/lang/Object;)V

    :cond_4
    return-void
.end method

.method protected D(Lii/d;Lmh/l;)Ljava/util/Set;
    .locals 1

    const-string p2, "kindFilter"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LNh/U;->N()Loi/i;

    move-result-object p1

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LNh/c;

    invoke-interface {p1}, LNh/c;->e()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, LZg/v;->m1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    invoke-virtual {p0}, LNh/a0;->s0()LLh/c;

    move-result-object p2

    sget-object v0, LNh/W;->a:LNh/W;

    invoke-direct {p0, p2, p1, v0}, LNh/a0;->p0(LBh/e;Ljava/util/Set;Lmh/l;)Ljava/util/Set;

    iget-object p2, p0, LNh/a0;->n:LQh/g;

    invoke-interface {p2}, LQh/g;->A()Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p2, Lkotlin/reflect/jvm/internal/impl/builtins/o;->e:LZh/f;

    invoke-interface {p1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object p1
.end method

.method public bridge synthetic R()LBh/m;
    .locals 1

    invoke-virtual {p0}, LNh/a0;->s0()LLh/c;

    move-result-object v0

    return-object v0
.end method

.method public g(LZh/f;LIh/b;)LBh/h;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "location"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method protected l0()LNh/b;
    .locals 3

    new-instance v0, LNh/b;

    iget-object v1, p0, LNh/a0;->n:LQh/g;

    sget-object v2, LNh/V;->a:LNh/V;

    invoke-direct {v0, v1, v2}, LNh/b;-><init>(LQh/g;Lmh/l;)V

    return-object v0
.end method

.method protected s0()LLh/c;
    .locals 1

    iget-object v0, p0, LNh/a0;->o:LLh/c;

    return-object v0
.end method

.method protected v(Lii/d;Lmh/l;)Ljava/util/Set;
    .locals 0

    const-string p2, "kindFilter"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method protected x(Lii/d;Lmh/l;)Ljava/util/Set;
    .locals 2

    const-string p2, "kindFilter"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LNh/U;->N()Loi/i;

    move-result-object p1

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LNh/c;

    invoke-interface {p1}, LNh/c;->a()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, LZg/v;->m1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    invoke-virtual {p0}, LNh/a0;->s0()LLh/c;

    move-result-object p2

    invoke-static {p2}, LLh/h;->b(LBh/e;)LNh/a0;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p2}, LNh/U;->a()Ljava/util/Set;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-nez p2, :cond_1

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object p2

    :cond_1
    check-cast p2, Ljava/util/Collection;

    invoke-interface {p1, p2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    iget-object p2, p0, LNh/a0;->n:LQh/g;

    invoke-interface {p2}, LQh/g;->A()Z

    move-result p2

    if-eqz p2, :cond_2

    sget-object p2, Lkotlin/reflect/jvm/internal/impl/builtins/o;->f:LZh/f;

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o;->d:LZh/f;

    filled-new-array {p2, v0}, [LZh/f;

    move-result-object p2

    invoke-static {p2}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p1, p2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    :cond_2
    invoke-virtual {p0}, LNh/U;->L()LMh/k;

    move-result-object p2

    invoke-virtual {p2}, LMh/k;->a()LMh/d;

    move-result-object p2

    invoke-virtual {p2}, LMh/d;->w()Lgi/f;

    move-result-object p2

    invoke-virtual {p0}, LNh/a0;->s0()LLh/c;

    move-result-object v0

    invoke-virtual {p0}, LNh/U;->L()LMh/k;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lgi/f;->c(LBh/e;LMh/k;)Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p1, p2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-object p1
.end method

.method protected y(Ljava/util/Collection;LZh/f;)V
    .locals 3

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LNh/U;->L()LMh/k;

    move-result-object v0

    invoke-virtual {v0}, LMh/k;->a()LMh/d;

    move-result-object v0

    invoke-virtual {v0}, LMh/d;->w()Lgi/f;

    move-result-object v0

    invoke-virtual {p0}, LNh/a0;->s0()LLh/c;

    move-result-object v1

    invoke-virtual {p0}, LNh/U;->L()LMh/k;

    move-result-object v2

    invoke-interface {v0, v1, p2, p1, v2}, Lgi/f;->h(LBh/e;LZh/f;Ljava/util/Collection;LMh/k;)V

    return-void
.end method

.method public bridge synthetic z()LNh/c;
    .locals 1

    invoke-virtual {p0}, LNh/a0;->l0()LNh/b;

    move-result-object v0

    return-object v0
.end method
