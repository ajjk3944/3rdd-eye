.class public final Lli/X;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lli/p;

.field private final b:Lli/X;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Lmh/l;

.field private final f:Lmh/l;

.field private final g:Ljava/util/Map;


# direct methods
.method public constructor <init>(Lli/p;Lli/X;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    const-string v0, "c"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeParameterProtos"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "debugName"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "containerPresentableName"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lli/X;->a:Lli/p;

    iput-object p2, p0, Lli/X;->b:Lli/X;

    iput-object p4, p0, Lli/X;->c:Ljava/lang/String;

    iput-object p5, p0, Lli/X;->d:Ljava/lang/String;

    invoke-virtual {p1}, Lli/p;->h()Loi/n;

    move-result-object p2

    new-instance p4, Lli/S;

    invoke-direct {p4, p0}, Lli/S;-><init>(Lli/X;)V

    invoke-interface {p2, p4}, Loi/n;->i(Lmh/l;)Loi/h;

    move-result-object p2

    iput-object p2, p0, Lli/X;->e:Lmh/l;

    invoke-virtual {p1}, Lli/p;->h()Loi/n;

    move-result-object p1

    new-instance p2, Lli/T;

    invoke-direct {p2, p0}, Lli/T;-><init>(Lli/X;)V

    invoke-interface {p1, p2}, Loi/n;->i(Lmh/l;)Loi/h;

    move-result-object p1

    iput-object p1, p0, Lli/X;->f:Lmh/l;

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, LZg/U;->h()Ljava/util/Map;

    move-result-object p1

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast p3, Ljava/lang/Iterable;

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 p3, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_1

    add-int/lit8 p4, p3, 0x1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p5

    check-cast p5, LUh/s;

    invoke-virtual {p5}, LUh/s;->W0()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Lni/S;

    iget-object v2, p0, Lli/X;->a:Lli/p;

    invoke-direct {v1, v2, p5, p3}, Lni/S;-><init>(Lli/p;LUh/s;I)V

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move p3, p4

    goto :goto_0

    :cond_1
    :goto_1
    iput-object p1, p0, Lli/X;->g:Ljava/util/Map;

    return-void
.end method

.method private static final A(LUh/q;)I
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LUh/q;->e1()I

    move-result p0

    return p0
.end method

.method static synthetic a(Lli/X;I)LBh/h;
    .locals 0

    invoke-static {p0, p1}, Lli/X;->f(Lli/X;I)LBh/h;

    move-result-object p0

    return-object p0
.end method

.method static synthetic b(Lli/X;I)LBh/h;
    .locals 0

    invoke-static {p0, p1}, Lli/X;->v(Lli/X;I)LBh/h;

    move-result-object p0

    return-object p0
.end method

.method static synthetic c(Lli/X;LUh/q;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Lli/X;->r(Lli/X;LUh/q;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method static synthetic d(Lli/X;LUh/q;)LUh/q;
    .locals 0

    invoke-static {p0, p1}, Lli/X;->z(Lli/X;LUh/q;)LUh/q;

    move-result-object p0

    return-object p0
.end method

.method static synthetic e(LUh/q;)I
    .locals 0

    invoke-static {p0}, Lli/X;->A(LUh/q;)I

    move-result p0

    return p0
.end method

.method private static final f(Lli/X;I)LBh/h;
    .locals 0

    invoke-direct {p0, p1}, Lli/X;->g(I)LBh/h;

    move-result-object p0

    return-object p0
.end method

.method private final g(I)LBh/h;
    .locals 1

    iget-object v0, p0, Lli/X;->a:Lli/p;

    invoke-virtual {v0}, Lli/p;->g()LWh/c;

    move-result-object v0

    invoke-static {v0, p1}, Lli/L;->a(LWh/c;I)LZh/b;

    move-result-object p1

    invoke-virtual {p1}, LZh/b;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lli/X;->a:Lli/p;

    invoke-virtual {v0}, Lli/p;->c()Lli/n;

    move-result-object v0

    invoke-virtual {v0, p1}, Lli/n;->b(LZh/b;)LBh/e;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lli/X;->a:Lli/p;

    invoke-virtual {v0}, Lli/p;->c()Lli/n;

    move-result-object v0

    invoke-virtual {v0}, Lli/n;->q()LBh/G;

    move-result-object v0

    invoke-static {v0, p1}, LBh/y;->c(LBh/G;LZh/b;)LBh/h;

    move-result-object p1

    return-object p1
.end method

.method private final h(I)Lpi/d0;
    .locals 1

    iget-object v0, p0, Lli/X;->a:Lli/p;

    invoke-virtual {v0}, Lli/p;->g()LWh/c;

    move-result-object v0

    invoke-static {v0, p1}, Lli/L;->a(LWh/c;I)LZh/b;

    move-result-object p1

    invoke-virtual {p1}, LZh/b;->i()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lli/X;->a:Lli/p;

    invoke-virtual {p1}, Lli/p;->c()Lli/n;

    move-result-object p1

    invoke-virtual {p1}, Lli/n;->o()Lli/B;

    move-result-object p1

    invoke-interface {p1}, Lli/B;->a()Lpi/d0;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private final i(I)LBh/h;
    .locals 1

    iget-object v0, p0, Lli/X;->a:Lli/p;

    invoke-virtual {v0}, Lli/p;->g()LWh/c;

    move-result-object v0

    invoke-static {v0, p1}, Lli/L;->a(LWh/c;I)LZh/b;

    move-result-object p1

    invoke-virtual {p1}, LZh/b;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lli/X;->a:Lli/p;

    invoke-virtual {v0}, Lli/p;->c()Lli/n;

    move-result-object v0

    invoke-virtual {v0}, Lli/n;->q()LBh/G;

    move-result-object v0

    invoke-static {v0, p1}, LBh/y;->f(LBh/G;LZh/b;)LBh/k0;

    move-result-object p1

    return-object p1
.end method

.method private final j(Lpi/S;Lpi/S;)Lpi/d0;
    .locals 8

    invoke-static {p1}, Lsi/d;->n(Lpi/S;)Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object v0

    invoke-virtual {p1}, Lpi/S;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v1

    invoke-static {p1}, Lkotlin/reflect/jvm/internal/impl/builtins/h;->k(Lpi/S;)Lpi/S;

    move-result-object v2

    invoke-static {p1}, Lkotlin/reflect/jvm/internal/impl/builtins/h;->e(Lpi/S;)Ljava/util/List;

    move-result-object v3

    invoke-static {p1}, Lkotlin/reflect/jvm/internal/impl/builtins/h;->m(Lpi/S;)Ljava/util/List;

    move-result-object v4

    const/4 v5, 0x1

    invoke-static {v4, v5}, LZg/v;->i0(Ljava/util/List;I)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v4, v6}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpi/B0;

    invoke-interface {v6}, Lpi/B0;->getType()Lpi/S;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object v4, v5

    move-object v5, v6

    move-object v6, p2

    invoke-static/range {v0 .. v7}, Lkotlin/reflect/jvm/internal/impl/builtins/h;->b(Lkotlin/reflect/jvm/internal/impl/builtins/i;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;Lpi/S;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lpi/S;Z)Lpi/d0;

    move-result-object p2

    invoke-virtual {p1}, Lpi/S;->O0()Z

    move-result p1

    invoke-virtual {p2, p1}, Lpi/d0;->U0(Z)Lpi/d0;

    move-result-object p1

    return-object p1
.end method

.method private final k(Lpi/r0;Lpi/v0;Ljava/util/List;Z)Lpi/d0;
    .locals 8

    invoke-interface {p2}, Lpi/v0;->getParameters()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v1

    sub-int/2addr v0, v1

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    sub-int/2addr v0, v2

    if-ltz v0, :cond_2

    invoke-interface {p2}, Lpi/v0;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object v1

    invoke-virtual {v1, v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->X(I)LBh/e;

    move-result-object v0

    invoke-interface {v0}, LBh/h;->k()Lpi/v0;

    move-result-object v2

    const-string v0, "getTypeConstructor(...)"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0x10

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    move-object v3, p3

    move v4, p4

    invoke-static/range {v1 .. v7}, Lpi/V;->k(Lpi/r0;Lpi/v0;Ljava/util/List;ZLkotlin/reflect/jvm/internal/impl/types/checker/g;ILjava/lang/Object;)Lpi/d0;

    move-result-object v1

    goto :goto_0

    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lli/X;->l(Lpi/r0;Lpi/v0;Ljava/util/List;Z)Lpi/d0;

    move-result-object v1

    :cond_2
    :goto_0
    if-nez v1, :cond_3

    sget-object p1, Lkotlin/reflect/jvm/internal/impl/types/error/l;->a:Lkotlin/reflect/jvm/internal/impl/types/error/l;

    sget-object p4, Lkotlin/reflect/jvm/internal/impl/types/error/k;->INCONSISTENT_SUSPEND_FUNCTION:Lkotlin/reflect/jvm/internal/impl/types/error/k;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    invoke-virtual {p1, p4, p3, p2, v0}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->f(Lkotlin/reflect/jvm/internal/impl/types/error/k;Ljava/util/List;Lpi/v0;[Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/types/error/i;

    move-result-object v1

    :cond_3
    return-object v1
.end method

.method private final l(Lpi/r0;Lpi/v0;Ljava/util/List;Z)Lpi/d0;
    .locals 7

    const/16 v5, 0x10

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v0, p1

    move-object v1, p2

    move-object v2, p3

    move v3, p4

    invoke-static/range {v0 .. v6}, Lpi/V;->k(Lpi/r0;Lpi/v0;Ljava/util/List;ZLkotlin/reflect/jvm/internal/impl/types/checker/g;ILjava/lang/Object;)Lpi/d0;

    move-result-object p1

    invoke-static {p1}, Lkotlin/reflect/jvm/internal/impl/builtins/h;->q(Lpi/S;)Z

    move-result p2

    if-nez p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Lli/X;->t(Lpi/S;)Lpi/d0;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method private final n(I)LBh/l0;
    .locals 2

    iget-object v0, p0, Lli/X;->g:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LBh/l0;

    if-nez v0, :cond_1

    iget-object v0, p0, Lli/X;->b:Lli/X;

    if-eqz v0, :cond_0

    invoke-direct {v0, p1}, Lli/X;->n(I)LBh/l0;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    return-object v0
.end method

.method private static final p(LUh/q;Lli/X;)Ljava/util/List;
    .locals 2

    invoke-virtual {p0}, LUh/q;->f1()Ljava/util/List;

    move-result-object v0

    const-string v1, "getArgumentList(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/Collection;

    iget-object v1, p1, Lli/X;->a:Lli/p;

    invoke-virtual {v1}, Lli/p;->j()LWh/g;

    move-result-object v1

    invoke-static {p0, v1}, LWh/f;->j(LUh/q;LWh/g;)LUh/q;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0, p1}, Lli/X;->p(LUh/q;Lli/X;)Ljava/util/List;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p0

    :cond_1
    check-cast p0, Ljava/lang/Iterable;

    invoke-static {v0, p0}, LZg/v;->M0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lli/X;LUh/q;ZILjava/lang/Object;)Lpi/d0;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x1

    :cond_0
    invoke-virtual {p0, p1, p2}, Lli/X;->o(LUh/q;Z)Lpi/d0;

    move-result-object p0

    return-object p0
.end method

.method private static final r(Lli/X;LUh/q;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lli/X;->a:Lli/p;

    invoke-virtual {v0}, Lli/p;->c()Lli/n;

    move-result-object v0

    invoke-virtual {v0}, Lli/n;->d()Lli/e;

    move-result-object v0

    iget-object p0, p0, Lli/X;->a:Lli/p;

    invoke-virtual {p0}, Lli/p;->g()LWh/c;

    move-result-object p0

    invoke-interface {v0, p1, p0}, Lli/h;->j(LUh/q;LWh/c;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private final s(Ljava/util/List;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;Lpi/v0;LBh/m;)Lpi/r0;
    .locals 2

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

    check-cast v1, Lpi/q0;

    invoke-interface {v1, p2, p3, p4}, Lpi/q0;->a(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;Lpi/v0;LBh/m;)Lpi/r0;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0}, LZg/v;->y(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    sget-object p2, Lpi/r0;->b:Lpi/r0$a;

    invoke-virtual {p2, p1}, Lpi/r0$a;->i(Ljava/util/List;)Lpi/r0;

    move-result-object p1

    return-object p1
.end method

.method private final t(Lpi/S;)Lpi/d0;
    .locals 5

    invoke-static {p1}, Lkotlin/reflect/jvm/internal/impl/builtins/h;->m(Lpi/S;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LZg/v;->D0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpi/B0;

    const/4 v1, 0x0

    if-eqz v0, :cond_7

    invoke-interface {v0}, Lpi/B0;->getType()Lpi/S;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_3

    :cond_0
    invoke-virtual {v0}, Lpi/S;->N0()Lpi/v0;

    move-result-object v2

    invoke-interface {v2}, Lpi/v0;->c()LBh/h;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-static {v2}, Lfi/e;->o(LBh/m;)LZh/c;

    move-result-object v2

    goto :goto_0

    :cond_1
    move-object v2, v1

    :goto_0
    invoke-virtual {v0}, Lpi/S;->L0()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_6

    sget-object v3, Lkotlin/reflect/jvm/internal/impl/builtins/o;->v:LZh/c;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-static {}, Lli/Y;->a()LZh/c;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Lpi/S;->L0()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LZg/v;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpi/B0;

    invoke-interface {v0}, Lpi/B0;->getType()Lpi/S;

    move-result-object v0

    const-string v2, "getType(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lli/X;->a:Lli/p;

    invoke-virtual {v2}, Lli/p;->e()LBh/m;

    move-result-object v2

    instance-of v3, v2, LBh/a;

    if-eqz v3, :cond_3

    check-cast v2, LBh/a;

    goto :goto_1

    :cond_3
    move-object v2, v1

    :goto_1
    if-eqz v2, :cond_4

    invoke-static {v2}, Lfi/e;->k(LBh/m;)LZh/c;

    move-result-object v1

    :cond_4
    sget-object v2, Lli/Q;->a:LZh/c;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-direct {p0, p1, v0}, Lli/X;->j(Lpi/S;Lpi/S;)Lpi/d0;

    move-result-object p1

    return-object p1

    :cond_5
    invoke-direct {p0, p1, v0}, Lli/X;->j(Lpi/S;Lpi/S;)Lpi/d0;

    move-result-object p1

    return-object p1

    :cond_6
    :goto_2
    check-cast p1, Lpi/d0;

    return-object p1

    :cond_7
    :goto_3
    return-object v1
.end method

.method private static final v(Lli/X;I)LBh/h;
    .locals 0

    invoke-direct {p0, p1}, Lli/X;->i(I)LBh/h;

    move-result-object p0

    return-object p0
.end method

.method private final w(LBh/l0;LUh/q$b;)Lpi/B0;
    .locals 2

    invoke-virtual {p2}, LUh/q$b;->S()LUh/q$b$c;

    move-result-object v0

    sget-object v1, LUh/q$b$c;->STAR:LUh/q$b$c;

    if-ne v0, v1, :cond_1

    if-nez p1, :cond_0

    new-instance p1, Lpi/i0;

    iget-object p2, p0, Lli/X;->a:Lli/p;

    invoke-virtual {p2}, Lli/p;->c()Lli/n;

    move-result-object p2

    invoke-virtual {p2}, Lli/n;->q()LBh/G;

    move-result-object p2

    invoke-interface {p2}, LBh/G;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object p2

    invoke-direct {p1, p2}, Lpi/i0;-><init>(Lkotlin/reflect/jvm/internal/impl/builtins/i;)V

    goto :goto_0

    :cond_0
    new-instance p2, Lpi/k0;

    invoke-direct {p2, p1}, Lpi/k0;-><init>(LBh/l0;)V

    move-object p1, p2

    :goto_0
    return-object p1

    :cond_1
    sget-object p1, Lli/O;->a:Lli/O;

    invoke-virtual {p2}, LUh/q$b;->S()LUh/q$b$c;

    move-result-object v0

    const-string v1, "getProjection(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lli/O;->c(LUh/q$b$c;)Lpi/N0;

    move-result-object p1

    iget-object v0, p0, Lli/X;->a:Lli/p;

    invoke-virtual {v0}, Lli/p;->j()LWh/g;

    move-result-object v0

    invoke-static {p2, v0}, LWh/f;->p(LUh/q$b;LWh/g;)LUh/q;

    move-result-object v0

    if-nez v0, :cond_2

    new-instance p1, Lpi/D0;

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/error/k;->NO_RECORDED_TYPE:Lkotlin/reflect/jvm/internal/impl/types/error/k;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->d(Lkotlin/reflect/jvm/internal/impl/types/error/k;[Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/types/error/i;

    move-result-object p2

    invoke-direct {p1, p2}, Lpi/D0;-><init>(Lpi/S;)V

    return-object p1

    :cond_2
    new-instance p2, Lpi/D0;

    invoke-virtual {p0, v0}, Lli/X;->u(LUh/q;)Lpi/S;

    move-result-object v0

    invoke-direct {p2, p1, v0}, Lpi/D0;-><init>(Lpi/N0;Lpi/S;)V

    return-object p2
.end method

.method private final x(LUh/q;)Lpi/v0;
    .locals 3

    invoke-virtual {p1}, LUh/q;->v1()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lli/X;->e:Lmh/l;

    invoke-virtual {p1}, LUh/q;->g1()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LBh/h;

    if-nez v0, :cond_5

    invoke-virtual {p1}, LUh/q;->g1()I

    move-result v0

    invoke-static {p0, p1, v0}, Lli/X;->y(Lli/X;LUh/q;I)LBh/e;

    move-result-object v0

    goto/16 :goto_1

    :cond_0
    invoke-virtual {p1}, LUh/q;->E1()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LUh/q;->r1()I

    move-result v0

    invoke-direct {p0, v0}, Lli/X;->n(I)LBh/l0;

    move-result-object v0

    if-nez v0, :cond_5

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/error/l;->a:Lkotlin/reflect/jvm/internal/impl/types/error/l;

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/types/error/k;->CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER:Lkotlin/reflect/jvm/internal/impl/types/error/k;

    invoke-virtual {p1}, LUh/q;->r1()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    iget-object v2, p0, Lli/X;->d:Ljava/lang/String;

    filled-new-array {p1, v2}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->e(Lkotlin/reflect/jvm/internal/impl/types/error/k;[Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/types/error/j;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p1}, LUh/q;->F1()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lli/X;->a:Lli/p;

    invoke-virtual {v0}, Lli/p;->g()LWh/c;

    move-result-object v0

    invoke-virtual {p1}, LUh/q;->s1()I

    move-result p1

    invoke-interface {v0, p1}, LWh/c;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lli/X;->m()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LBh/l0;

    invoke-interface {v2}, LBh/I;->getName()LZh/f;

    move-result-object v2

    invoke-virtual {v2}, LZh/f;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :goto_0
    move-object v0, v1

    check-cast v0, LBh/l0;

    if-nez v0, :cond_5

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/error/l;->a:Lkotlin/reflect/jvm/internal/impl/types/error/l;

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/types/error/k;->CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME:Lkotlin/reflect/jvm/internal/impl/types/error/k;

    iget-object v2, p0, Lli/X;->a:Lli/p;

    invoke-virtual {v2}, Lli/p;->e()LBh/m;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    filled-new-array {p1, v2}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->e(Lkotlin/reflect/jvm/internal/impl/types/error/k;[Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/types/error/j;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-virtual {p1}, LUh/q;->D1()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lli/X;->f:Lmh/l;

    invoke-virtual {p1}, LUh/q;->q1()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LBh/h;

    if-nez v0, :cond_5

    invoke-virtual {p1}, LUh/q;->q1()I

    move-result v0

    invoke-static {p0, p1, v0}, Lli/X;->y(Lli/X;LUh/q;I)LBh/e;

    move-result-object v0

    :cond_5
    :goto_1
    invoke-interface {v0}, LBh/h;->k()Lpi/v0;

    move-result-object p1

    const-string v0, "getTypeConstructor(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_6
    sget-object p1, Lkotlin/reflect/jvm/internal/impl/types/error/l;->a:Lkotlin/reflect/jvm/internal/impl/types/error/l;

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/error/k;->UNKNOWN_TYPE:Lkotlin/reflect/jvm/internal/impl/types/error/k;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->e(Lkotlin/reflect/jvm/internal/impl/types/error/k;[Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/types/error/j;

    move-result-object p1

    return-object p1
.end method

.method private static final y(Lli/X;LUh/q;I)LBh/e;
    .locals 2

    iget-object v0, p0, Lli/X;->a:Lli/p;

    invoke-virtual {v0}, Lli/p;->g()LWh/c;

    move-result-object v0

    invoke-static {v0, p2}, Lli/L;->a(LWh/c;I)LZh/b;

    move-result-object p2

    new-instance v0, Lli/V;

    invoke-direct {v0, p0}, Lli/V;-><init>(Lli/X;)V

    invoke-static {p1, v0}, Lzi/m;->n(Ljava/lang/Object;Lmh/l;)Lzi/j;

    move-result-object p1

    sget-object v0, Lli/W;->a:Lli/W;

    invoke-static {p1, v0}, Lzi/m;->N(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object p1

    invoke-static {p1}, Lzi/m;->a0(Lzi/j;)Ljava/util/List;

    move-result-object p1

    sget-object v0, Lli/X$a;->b:Lli/X$a;

    invoke-static {p2, v0}, Lzi/m;->n(Ljava/lang/Object;Lmh/l;)Lzi/j;

    move-result-object v0

    invoke-static {v0}, Lzi/m;->x(Lzi/j;)I

    move-result v0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v1, v0, :cond_0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object p0, p0, Lli/X;->a:Lli/p;

    invoke-virtual {p0}, Lli/p;->c()Lli/n;

    move-result-object p0

    invoke-virtual {p0}, Lli/n;->r()LBh/L;

    move-result-object p0

    invoke-virtual {p0, p2, p1}, LBh/L;->d(LZh/b;Ljava/util/List;)LBh/e;

    move-result-object p0

    return-object p0
.end method

.method private static final z(Lli/X;LUh/q;)LUh/q;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lli/X;->a:Lli/p;

    invoke-virtual {p0}, Lli/p;->j()LWh/g;

    move-result-object p0

    invoke-static {p1, p0}, LWh/f;->j(LUh/q;LWh/g;)LUh/q;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final m()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lli/X;->g:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final o(LUh/q;Z)Lpi/d0;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "proto"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, LUh/q;->v1()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual/range {p1 .. p1}, LUh/q;->g1()I

    move-result v2

    invoke-direct {v0, v2}, Lli/X;->h(I)Lpi/d0;

    move-result-object v2

    goto :goto_0

    :cond_0
    invoke-virtual/range {p1 .. p1}, LUh/q;->D1()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual/range {p1 .. p1}, LUh/q;->q1()I

    move-result v2

    invoke-direct {v0, v2}, Lli/X;->h(I)Lpi/d0;

    move-result-object v2

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_2

    return-object v2

    :cond_2
    invoke-direct/range {p0 .. p1}, Lli/X;->x(LUh/q;)Lpi/v0;

    move-result-object v4

    invoke-interface {v4}, Lpi/v0;->c()LBh/h;

    move-result-object v2

    invoke-static {v2}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->m(LBh/m;)Z

    move-result v2

    if-eqz v2, :cond_3

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/types/error/l;->a:Lkotlin/reflect/jvm/internal/impl/types/error/l;

    sget-object v2, Lkotlin/reflect/jvm/internal/impl/types/error/k;->TYPE_FOR_ERROR_TYPE_CONSTRUCTOR:Lkotlin/reflect/jvm/internal/impl/types/error/k;

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v4, v3}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->c(Lkotlin/reflect/jvm/internal/impl/types/error/k;Lpi/v0;[Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/types/error/i;

    move-result-object v1

    return-object v1

    :cond_3
    new-instance v2, Lni/a;

    iget-object v3, v0, Lli/X;->a:Lli/p;

    invoke-virtual {v3}, Lli/p;->h()Loi/n;

    move-result-object v3

    new-instance v5, Lli/U;

    invoke-direct {v5, v0, v1}, Lli/U;-><init>(Lli/X;LUh/q;)V

    invoke-direct {v2, v3, v5}, Lni/a;-><init>(Loi/n;Lmh/a;)V

    iget-object v3, v0, Lli/X;->a:Lli/p;

    invoke-virtual {v3}, Lli/p;->c()Lli/n;

    move-result-object v3

    invoke-virtual {v3}, Lli/n;->v()Ljava/util/List;

    move-result-object v3

    iget-object v5, v0, Lli/X;->a:Lli/p;

    invoke-virtual {v5}, Lli/p;->e()LBh/m;

    move-result-object v5

    invoke-direct {v0, v3, v2, v4, v5}, Lli/X;->s(Ljava/util/List;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;Lpi/v0;LBh/m;)Lpi/r0;

    move-result-object v3

    invoke-static {v1, v0}, Lli/X;->p(LUh/q;Lli/X;)Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v5, v7}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v10, 0x0

    move v7, v10

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    add-int/lit8 v9, v7, 0x1

    if-gez v7, :cond_4

    invoke-static {}, LZg/v;->v()V

    :cond_4
    check-cast v8, LUh/q$b;

    invoke-interface {v4}, Lpi/v0;->getParameters()Ljava/util/List;

    move-result-object v11

    const-string v12, "getParameters(...)"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v11, v7}, LZg/v;->t0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LBh/l0;

    invoke-direct {v0, v7, v8}, Lli/X;->w(LBh/l0;LUh/q$b;)Lpi/B0;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v7, v9

    goto :goto_1

    :cond_5
    invoke-static {v6}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v4}, Lpi/v0;->c()LBh/h;

    move-result-object v6

    if-eqz p2, :cond_8

    instance-of v7, v6, LBh/k0;

    if-eqz v7, :cond_8

    check-cast v6, LBh/k0;

    invoke-static {v6, v5}, Lpi/V;->c(LBh/k0;Ljava/util/List;)Lpi/d0;

    move-result-object v3

    iget-object v5, v0, Lli/X;->a:Lli/p;

    invoke-virtual {v5}, Lli/p;->c()Lli/n;

    move-result-object v5

    invoke-virtual {v5}, Lli/n;->v()Ljava/util/List;

    move-result-object v5

    sget-object v6, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-virtual {v3}, Lpi/S;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v7

    invoke-static {v2, v7}, LZg/v;->K0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v6, v2}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->a(Ljava/util/List;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v2

    iget-object v6, v0, Lli/X;->a:Lli/p;

    invoke-virtual {v6}, Lli/p;->e()LBh/m;

    move-result-object v6

    invoke-direct {v0, v5, v2, v4, v6}, Lli/X;->s(Ljava/util/List;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;Lpi/v0;LBh/m;)Lpi/r0;

    move-result-object v2

    invoke-static {v3}, Lpi/W;->b(Lpi/S;)Z

    move-result v4

    if-nez v4, :cond_7

    invoke-virtual/range {p1 .. p1}, LUh/q;->n1()Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_2

    :cond_6
    move v4, v10

    goto :goto_3

    :cond_7
    :goto_2
    const/4 v4, 0x1

    :goto_3
    invoke-virtual {v3, v4}, Lpi/d0;->U0(Z)Lpi/d0;

    move-result-object v3

    invoke-virtual {v3, v2}, Lpi/d0;->V0(Lpi/r0;)Lpi/d0;

    move-result-object v2

    goto :goto_4

    :cond_8
    sget-object v2, LWh/b;->a:LWh/b$b;

    invoke-virtual/range {p1 .. p1}, LUh/q;->j1()I

    move-result v6

    invoke-virtual {v2, v6}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-virtual/range {p1 .. p1}, LUh/q;->n1()Z

    move-result v2

    invoke-direct {v0, v3, v4, v5, v2}, Lli/X;->k(Lpi/r0;Lpi/v0;Ljava/util/List;Z)Lpi/d0;

    move-result-object v2

    goto :goto_4

    :cond_9
    invoke-virtual/range {p1 .. p1}, LUh/q;->n1()Z

    move-result v6

    const/16 v8, 0x10

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v9}, Lpi/V;->k(Lpi/r0;Lpi/v0;Ljava/util/List;ZLkotlin/reflect/jvm/internal/impl/types/checker/g;ILjava/lang/Object;)Lpi/d0;

    move-result-object v2

    sget-object v3, LWh/b;->b:LWh/b$b;

    invoke-virtual/range {p1 .. p1}, LUh/q;->j1()I

    move-result v4

    invoke-virtual {v3, v4}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_b

    sget-object v11, Lpi/y;->d:Lpi/y$a;

    const/4 v15, 0x4

    const/16 v16, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x0

    move-object v12, v2

    invoke-static/range {v11 .. v16}, Lpi/y$a;->c(Lpi/y$a;Lpi/M0;ZZILjava/lang/Object;)Lpi/y;

    move-result-object v3

    if-eqz v3, :cond_a

    move-object v2, v3

    goto :goto_4

    :cond_a
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "null DefinitelyNotNullType for \'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v2, 0x27

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_b
    :goto_4
    iget-object v3, v0, Lli/X;->a:Lli/p;

    invoke-virtual {v3}, Lli/p;->j()LWh/g;

    move-result-object v3

    invoke-static {v1, v3}, LWh/f;->a(LUh/q;LWh/g;)LUh/q;

    move-result-object v1

    if-eqz v1, :cond_d

    invoke-virtual {v0, v1, v10}, Lli/X;->o(LUh/q;Z)Lpi/d0;

    move-result-object v1

    invoke-static {v2, v1}, Lpi/h0;->j(Lpi/d0;Lpi/d0;)Lpi/d0;

    move-result-object v1

    if-nez v1, :cond_c

    goto :goto_5

    :cond_c
    move-object v2, v1

    :cond_d
    :goto_5
    return-object v2
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lli/X;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lli/X;->b:Lli/X;

    if-nez v1, :cond_0

    const-string v1, ""

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ". Child of "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lli/X;->b:Lli/X;

    iget-object v2, v2, Lli/X;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(LUh/q;)Lpi/S;
    .locals 6

    const-string v0, "proto"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LUh/q;->x1()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lli/X;->a:Lli/p;

    invoke-virtual {v0}, Lli/p;->g()LWh/c;

    move-result-object v0

    invoke-virtual {p1}, LUh/q;->k1()I

    move-result v1

    invoke-interface {v0, v1}, LWh/c;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p0, p1, v1, v2, v3}, Lli/X;->q(Lli/X;LUh/q;ZILjava/lang/Object;)Lpi/d0;

    move-result-object v4

    iget-object v5, p0, Lli/X;->a:Lli/p;

    invoke-virtual {v5}, Lli/p;->j()LWh/g;

    move-result-object v5

    invoke-static {p1, v5}, LWh/f;->f(LUh/q;LWh/g;)LUh/q;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {p0, v5, v1, v2, v3}, Lli/X;->q(Lli/X;LUh/q;ZILjava/lang/Object;)Lpi/d0;

    move-result-object v1

    iget-object v2, p0, Lli/X;->a:Lli/p;

    invoke-virtual {v2}, Lli/p;->c()Lli/n;

    move-result-object v2

    invoke-virtual {v2}, Lli/n;->m()Lli/x;

    move-result-object v2

    invoke-interface {v2, p1, v0, v4, v1}, Lli/x;->a(LUh/q;Ljava/lang/String;Lpi/d0;Lpi/d0;)Lpi/S;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lli/X;->o(LUh/q;Z)Lpi/d0;

    move-result-object p1

    return-object p1
.end method
