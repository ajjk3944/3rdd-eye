.class final Lni/m$a;
.super Lni/w;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lni/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private final g:Lkotlin/reflect/jvm/internal/impl/types/checker/g;

.field private final h:Loi/i;

.field private final i:Loi/i;

.field final synthetic j:Lni/m;


# direct methods
.method public constructor <init>(Lni/m;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)V
    .locals 7

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lni/m$a;->j:Lni/m;

    invoke-virtual {p1}, Lni/m;->d1()Lli/p;

    move-result-object v2

    invoke-virtual {p1}, Lni/m;->e1()LUh/c;

    move-result-object v0

    invoke-virtual {v0}, LUh/c;->R1()Ljava/util/List;

    move-result-object v3

    const-string v0, "getFunctionList(...)"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lni/m;->e1()LUh/c;

    move-result-object v0

    invoke-virtual {v0}, LUh/c;->f2()Ljava/util/List;

    move-result-object v4

    const-string v0, "getPropertyList(...)"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lni/m;->e1()LUh/c;

    move-result-object v0

    invoke-virtual {v0}, LUh/c;->n2()Ljava/util/List;

    move-result-object v5

    const-string v0, "getTypeAliasList(...)"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lni/m;->e1()LUh/c;

    move-result-object v0

    invoke-virtual {v0}, LUh/c;->c2()Ljava/util/List;

    move-result-object v0

    const-string v1, "getNestedClassNameList(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-virtual {p1}, Lni/m;->d1()Lli/p;

    move-result-object p1

    invoke-virtual {p1}, Lli/p;->g()LWh/c;

    move-result-object p1

    new-instance v1, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v0, v6}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v1, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    invoke-static {p1, v6}, Lli/L;->b(LWh/c;I)LZh/f;

    move-result-object v6

    invoke-interface {v1, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v6, Lni/j;

    invoke-direct {v6, v1}, Lni/j;-><init>(Ljava/util/List;)V

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Lni/w;-><init>(Lli/p;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lmh/a;)V

    iput-object p2, p0, Lni/m$a;->g:Lkotlin/reflect/jvm/internal/impl/types/checker/g;

    invoke-virtual {p0}, Lni/w;->s()Lli/p;

    move-result-object p1

    invoke-virtual {p1}, Lli/p;->h()Loi/n;

    move-result-object p1

    new-instance p2, Lni/k;

    invoke-direct {p2, p0}, Lni/k;-><init>(Lni/m$a;)V

    invoke-interface {p1, p2}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p1

    iput-object p1, p0, Lni/m$a;->h:Loi/i;

    invoke-virtual {p0}, Lni/w;->s()Lli/p;

    move-result-object p1

    invoke-virtual {p1}, Lli/p;->h()Loi/n;

    move-result-object p1

    new-instance p2, Lni/l;

    invoke-direct {p2, p0}, Lni/l;-><init>(Lni/m$a;)V

    invoke-interface {p1, p2}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p1

    iput-object p1, p0, Lni/m$a;->i:Loi/i;

    return-void
.end method

.method private static final B(Ljava/util/List;)Ljava/util/List;
    .locals 0

    return-object p0
.end method

.method static synthetic C(Ljava/util/List;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lni/m$a;->B(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method static synthetic D(Lni/m$a;)Ljava/util/Collection;
    .locals 0

    invoke-static {p0}, Lni/m$a;->F(Lni/m$a;)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method static synthetic E(Lni/m$a;)Ljava/util/Collection;
    .locals 0

    invoke-static {p0}, Lni/m$a;->J(Lni/m$a;)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method private static final F(Lni/m$a;)Ljava/util/Collection;
    .locals 3

    sget-object v0, Lii/d;->o:Lii/d;

    sget-object v1, Lii/k;->a:Lii/k$a;

    invoke-virtual {v1}, Lii/k$a;->c()Lmh/l;

    move-result-object v1

    sget-object v2, LIh/d;->WHEN_GET_ALL_DESCRIPTORS:LIh/d;

    invoke-virtual {p0, v0, v1, v2}, Lni/w;->m(Lii/d;Lmh/l;LIh/b;)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method private final G(LZh/f;Ljava/util/Collection;Ljava/util/List;)V
    .locals 6

    new-instance v3, Ljava/util/ArrayList;

    move-object v0, p3

    check-cast v0, Ljava/util/Collection;

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p0}, Lni/w;->s()Lli/p;

    move-result-object v0

    invoke-virtual {v0}, Lli/p;->c()Lli/n;

    move-result-object v0

    invoke-virtual {v0}, Lli/n;->n()Lkotlin/reflect/jvm/internal/impl/types/checker/p;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/reflect/jvm/internal/impl/types/checker/p;->a()Lbi/o;

    move-result-object v0

    invoke-direct {p0}, Lni/m$a;->H()Lni/m;

    move-result-object v4

    new-instance v5, Lni/m$a$a;

    invoke-direct {v5, p3}, Lni/m$a$a;-><init>(Ljava/util/List;)V

    move-object v1, p1

    move-object v2, p2

    invoke-virtual/range {v0 .. v5}, Lbi/o;->v(LZh/f;Ljava/util/Collection;Ljava/util/Collection;LBh/e;Lbi/n;)V

    return-void
.end method

.method private final H()Lni/m;
    .locals 1

    iget-object v0, p0, Lni/m$a;->j:Lni/m;

    return-object v0
.end method

.method private static final J(Lni/m$a;)Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, Lni/m$a;->g:Lkotlin/reflect/jvm/internal/impl/types/checker/g;

    invoke-direct {p0}, Lni/m$a;->H()Lni/m;

    move-result-object p0

    invoke-virtual {v0, p0}, Lkotlin/reflect/jvm/internal/impl/types/checker/g;->g(LBh/e;)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method protected A(LBh/f0;)Z
    .locals 2

    const-string v0, "function"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lni/w;->s()Lli/p;

    move-result-object v0

    invoke-virtual {v0}, Lli/p;->c()Lli/n;

    move-result-object v0

    invoke-virtual {v0}, Lli/n;->t()LCh/c;

    move-result-object v0

    iget-object v1, p0, Lni/m$a;->j:Lni/m;

    invoke-interface {v0, v1, p1}, LCh/c;->b(LBh/e;LBh/f0;)Z

    move-result p1

    return p1
.end method

.method public I(LZh/f;LIh/b;)V
    .locals 2

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lni/w;->s()Lli/p;

    move-result-object v0

    invoke-virtual {v0}, Lli/p;->c()Lli/n;

    move-result-object v0

    invoke-virtual {v0}, Lli/n;->p()LIh/c;

    move-result-object v0

    invoke-direct {p0}, Lni/m$a;->H()Lni/m;

    move-result-object v1

    invoke-static {v0, p2, v1, p1}, LHh/a;->a(LIh/c;LIh/b;LBh/e;LZh/f;)V

    return-void
.end method

.method public b(LZh/f;LIh/b;)Ljava/util/Collection;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lni/m$a;->I(LZh/f;LIh/b;)V

    invoke-super {p0, p1, p2}, Lni/w;->b(LZh/f;LIh/b;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public d(LZh/f;LIh/b;)Ljava/util/Collection;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lni/m$a;->I(LZh/f;LIh/b;)V

    invoke-super {p0, p1, p2}, Lni/w;->d(LZh/f;LIh/b;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public e(Lii/d;Lmh/l;)Ljava/util/Collection;
    .locals 1

    const-string v0, "kindFilter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "nameFilter"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lni/m$a;->h:Loi/i;

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method public g(LZh/f;LIh/b;)LBh/h;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lni/m$a;->I(LZh/f;LIh/b;)V

    invoke-direct {p0}, Lni/m$a;->H()Lni/m;

    move-result-object v0

    invoke-static {v0}, Lni/m;->L0(Lni/m;)Lni/m$c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lni/m$c;->i(LZh/f;)LBh/e;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-super {p0, p1, p2}, Lni/w;->g(LZh/f;LIh/b;)LBh/h;

    move-result-object p1

    return-object p1
.end method

.method protected j(Ljava/util/Collection;Lmh/l;)V
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameFilter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lni/m$a;->H()Lni/m;

    move-result-object p2

    invoke-static {p2}, Lni/m;->L0(Lni/m;)Lni/m$c;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lni/m$c;->d()Ljava/util/Collection;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-nez p2, :cond_1

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    :cond_1
    invoke-interface {p1, p2}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method protected n(LZh/f;Ljava/util/List;)V
    .locals 4

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "functions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lni/m$a;->i:Loi/i;

    invoke-interface {v1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpi/S;

    invoke-virtual {v2}, Lpi/S;->r()Lii/k;

    move-result-object v2

    sget-object v3, LIh/d;->FOR_ALREADY_TRACKED:LIh/d;

    invoke-interface {v2, p1, v3}, Lii/k;->b(LZh/f;LIh/b;)Ljava/util/Collection;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lni/w;->s()Lli/p;

    move-result-object v1

    invoke-virtual {v1}, Lli/p;->c()Lli/n;

    move-result-object v1

    invoke-virtual {v1}, Lli/n;->c()LCh/a;

    move-result-object v1

    iget-object v2, p0, Lni/m$a;->j:Lni/m;

    invoke-interface {v1, p1, v2}, LCh/a;->d(LZh/f;LBh/e;)Ljava/util/Collection;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-direct {p0, p1, v0, p2}, Lni/m$a;->G(LZh/f;Ljava/util/Collection;Ljava/util/List;)V

    return-void
.end method

.method protected o(LZh/f;Ljava/util/List;)V
    .locals 4

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptors"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lni/m$a;->i:Loi/i;

    invoke-interface {v1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpi/S;

    invoke-virtual {v2}, Lpi/S;->r()Lii/k;

    move-result-object v2

    sget-object v3, LIh/d;->FOR_ALREADY_TRACKED:LIh/d;

    invoke-interface {v2, p1, v3}, Lii/k;->d(LZh/f;LIh/b;)Ljava/util/Collection;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1, v0, p2}, Lni/m$a;->G(LZh/f;Ljava/util/Collection;Ljava/util/List;)V

    return-void
.end method

.method protected p(LZh/f;)LZh/b;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lni/m$a;->j:Lni/m;

    invoke-static {v0}, Lni/m;->K0(Lni/m;)LZh/b;

    move-result-object v0

    invoke-virtual {v0, p1}, LZh/b;->d(LZh/f;)LZh/b;

    move-result-object p1

    return-object p1
.end method

.method protected v()Ljava/util/Set;
    .locals 3

    invoke-direct {p0}, Lni/m$a;->H()Lni/m;

    move-result-object v0

    invoke-static {v0}, Lni/m;->M0(Lni/m;)Lni/m$b;

    move-result-object v0

    invoke-virtual {v0}, Lpi/p;->w()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpi/S;

    invoke-virtual {v2}, Lpi/S;->r()Lii/k;

    move-result-object v2

    invoke-interface {v2}, Lii/k;->f()Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    if-nez v2, :cond_0

    const/4 v1, 0x0

    goto :goto_1

    :cond_0
    invoke-static {v1, v2}, LZg/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_0

    :cond_1
    :goto_1
    return-object v1
.end method

.method protected w()Ljava/util/Set;
    .locals 3

    invoke-direct {p0}, Lni/m$a;->H()Lni/m;

    move-result-object v0

    invoke-static {v0}, Lni/m;->M0(Lni/m;)Lni/m$b;

    move-result-object v0

    invoke-virtual {v0}, Lpi/p;->w()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpi/S;

    invoke-virtual {v2}, Lpi/S;->r()Lii/k;

    move-result-object v2

    invoke-interface {v2}, Lii/k;->a()Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v1, v2}, LZg/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lni/m$a;->j:Lni/m;

    invoke-virtual {p0}, Lni/w;->s()Lli/p;

    move-result-object v2

    invoke-virtual {v2}, Lli/p;->c()Lli/n;

    move-result-object v2

    invoke-virtual {v2}, Lli/n;->c()LCh/a;

    move-result-object v2

    invoke-interface {v2, v0}, LCh/a;->e(LBh/e;)Ljava/util/Collection;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    return-object v1
.end method

.method protected x()Ljava/util/Set;
    .locals 3

    invoke-direct {p0}, Lni/m$a;->H()Lni/m;

    move-result-object v0

    invoke-static {v0}, Lni/m;->M0(Lni/m;)Lni/m$b;

    move-result-object v0

    invoke-virtual {v0}, Lpi/p;->w()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpi/S;

    invoke-virtual {v2}, Lpi/S;->r()Lii/k;

    move-result-object v2

    invoke-interface {v2}, Lii/k;->c()Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v1, v2}, LZg/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method
