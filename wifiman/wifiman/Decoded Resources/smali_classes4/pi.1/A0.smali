.class public final Lpi/A0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpi/A0$a;,
        Lpi/A0$b;
    }
.end annotation


# static fields
.field public static final f:Lpi/A0$a;


# instance fields
.field private final a:Lpi/F;

.field private final b:Lpi/x0;

.field private final c:Loi/f;

.field private final d:LYg/m;

.field private final e:Loi/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpi/A0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpi/A0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpi/A0;->f:Lpi/A0$a;

    return-void
.end method

.method public constructor <init>(Lpi/F;Lpi/x0;)V
    .locals 1

    const-string v0, "projectionComputer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lpi/A0;->a:Lpi/F;

    .line 3
    iput-object p2, p0, Lpi/A0;->b:Lpi/x0;

    .line 4
    new-instance p1, Loi/f;

    const-string p2, "Type parameter upper bound erasure results"

    invoke-direct {p1, p2}, Loi/f;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lpi/A0;->c:Loi/f;

    .line 5
    new-instance p2, Lpi/y0;

    invoke-direct {p2, p0}, Lpi/y0;-><init>(Lpi/A0;)V

    invoke-static {p2}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p2

    iput-object p2, p0, Lpi/A0;->d:LYg/m;

    .line 6
    new-instance p2, Lpi/z0;

    invoke-direct {p2, p0}, Lpi/z0;-><init>(Lpi/A0;)V

    invoke-virtual {p1, p2}, Loi/f;->e(Lmh/l;)Loi/g;

    move-result-object p1

    const-string p2, "createMemoizedFunction(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpi/A0;->e:Loi/g;

    return-void
.end method

.method public synthetic constructor <init>(Lpi/F;Lpi/x0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 7
    new-instance p2, Lpi/x0;

    const/4 p3, 0x0

    invoke-direct {p2, p3, p3}, Lpi/x0;-><init>(ZZ)V

    .line 8
    :cond_0
    invoke-direct {p0, p1, p2}, Lpi/A0;-><init>(Lpi/F;Lpi/x0;)V

    return-void
.end method

.method static synthetic a(Lpi/A0;)Lkotlin/reflect/jvm/internal/impl/types/error/i;
    .locals 0

    invoke-static {p0}, Lpi/A0;->c(Lpi/A0;)Lkotlin/reflect/jvm/internal/impl/types/error/i;

    move-result-object p0

    return-object p0
.end method

.method static synthetic b(Lpi/A0;Lpi/A0$b;)Lpi/S;
    .locals 0

    invoke-static {p0, p1}, Lpi/A0;->f(Lpi/A0;Lpi/A0$b;)Lpi/S;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lpi/A0;)Lkotlin/reflect/jvm/internal/impl/types/error/i;
    .locals 1

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/error/k;->CANNOT_COMPUTE_ERASED_BOUND:Lkotlin/reflect/jvm/internal/impl/types/error/k;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->d(Lkotlin/reflect/jvm/internal/impl/types/error/k;[Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/types/error/i;

    move-result-object p0

    return-object p0
.end method

.method private final d(Lpi/G;)Lpi/S;
    .locals 0

    invoke-virtual {p1}, Lpi/G;->a()Lpi/d0;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Lsi/d;->D(Lpi/S;)Lpi/S;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    invoke-direct {p0}, Lpi/A0;->h()Lkotlin/reflect/jvm/internal/impl/types/error/i;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method private static final f(Lpi/A0;Lpi/A0$b;)Lpi/S;
    .locals 1

    invoke-virtual {p1}, Lpi/A0$b;->b()LBh/l0;

    move-result-object v0

    invoke-virtual {p1}, Lpi/A0$b;->a()Lpi/G;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lpi/A0;->g(LBh/l0;Lpi/G;)Lpi/S;

    move-result-object p0

    return-object p0
.end method

.method private final g(LBh/l0;Lpi/G;)Lpi/S;
    .locals 7

    invoke-virtual {p2}, Lpi/G;->c()Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, LBh/l0;->a()LBh/l0;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0, p2}, Lpi/A0;->d(Lpi/G;)Lpi/S;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {p1}, LBh/h;->u()Lpi/d0;

    move-result-object v1

    const-string v2, "getDefaultType(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v0}, Lsi/d;->l(Lpi/S;Ljava/util/Set;)Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    const/16 v2, 0xa

    invoke-static {v1, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-static {v3}, LZg/U;->d(I)I

    move-result v3

    const/16 v4, 0x10

    invoke-static {v3, v4}, Lsh/m;->d(II)I

    move-result v3

    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LBh/l0;

    if-eqz v0, :cond_2

    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {v3, p2}, Lpi/J0;->t(LBh/l0;Lpi/G;)Lpi/B0;

    move-result-object v5

    const-string v6, "makeStarProjection(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    :goto_1
    iget-object v5, p0, Lpi/A0;->a:Lpi/F;

    invoke-virtual {p2, p1}, Lpi/G;->d(LBh/l0;)Lpi/G;

    move-result-object v6

    invoke-virtual {p0, v3, v6}, Lpi/A0;->e(LBh/l0;Lpi/G;)Lpi/S;

    move-result-object v6

    invoke-virtual {v5, v3, p2, p0, v6}, Lpi/F;->a(LBh/l0;Lpi/G;Lpi/A0;Lpi/S;)Lpi/B0;

    move-result-object v5

    :goto_2
    invoke-interface {v3}, LBh/l0;->k()Lpi/v0;

    move-result-object v3

    invoke-static {v3, v5}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v3

    invoke-virtual {v3}, LYg/s;->h()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v3}, LYg/s;->j()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v4, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    sget-object v0, Lpi/w0;->c:Lpi/w0$a;

    const/4 v1, 0x2

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static {v0, v4, v5, v1, v3}, Lpi/w0$a;->e(Lpi/w0$a;Ljava/util/Map;ZILjava/lang/Object;)Lpi/w0;

    move-result-object v0

    invoke-static {v0}, Lpi/G0;->g(Lpi/E0;)Lpi/G0;

    move-result-object v0

    const-string v1, "create(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LBh/l0;->getUpperBounds()Ljava/util/List;

    move-result-object p1

    const-string v1, "getUpperBounds(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0, p1, p2}, Lpi/A0;->i(Lpi/G0;Ljava/util/List;Lpi/G;)Ljava/util/Set;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    iget-object p2, p0, Lpi/A0;->b:Lpi/x0;

    invoke-virtual {p2}, Lpi/x0;->a()Z

    move-result p2

    if-nez p2, :cond_5

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result p2

    const/4 v0, 0x1

    if-ne p2, v0, :cond_4

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, LZg/v;->Q0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpi/S;

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Should only be one computed upper bound if no need to intersect all bounds"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/ArrayList;

    invoke-static {p1, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpi/S;

    invoke-virtual {v0}, Lpi/S;->Q0()Lpi/M0;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_6
    invoke-static {p2}, Lkotlin/reflect/jvm/internal/impl/types/checker/d;->a(Ljava/util/Collection;)Lpi/M0;

    move-result-object p1

    return-object p1

    :cond_7
    invoke-direct {p0, p2}, Lpi/A0;->d(Lpi/G;)Lpi/S;

    move-result-object p1

    return-object p1
.end method

.method private final h()Lkotlin/reflect/jvm/internal/impl/types/error/i;
    .locals 1

    iget-object v0, p0, Lpi/A0;->d:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/reflect/jvm/internal/impl/types/error/i;

    return-object v0
.end method

.method private final i(Lpi/G0;Ljava/util/List;Lpi/G;)Ljava/util/Set;
    .locals 5

    invoke-static {}, LZg/d0;->b()Ljava/util/Set;

    move-result-object v0

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpi/S;

    invoke-virtual {v1}, Lpi/S;->N0()Lpi/v0;

    move-result-object v2

    invoke-interface {v2}, Lpi/v0;->c()LBh/h;

    move-result-object v2

    instance-of v3, v2, LBh/e;

    if-eqz v3, :cond_1

    sget-object v2, Lpi/A0;->f:Lpi/A0$a;

    invoke-virtual {p3}, Lpi/G;->c()Ljava/util/Set;

    move-result-object v3

    iget-object v4, p0, Lpi/A0;->b:Lpi/x0;

    invoke-virtual {v4}, Lpi/x0;->b()Z

    move-result v4

    invoke-virtual {v2, v1, p1, v3, v4}, Lpi/A0$a;->a(Lpi/S;Lpi/G0;Ljava/util/Set;Z)Lpi/S;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    instance-of v1, v2, LBh/l0;

    if-eqz v1, :cond_3

    invoke-virtual {p3}, Lpi/G;->c()Ljava/util/Set;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    const/4 v3, 0x1

    if-ne v1, v3, :cond_2

    invoke-direct {p0, p3}, Lpi/A0;->d(Lpi/G;)Lpi/S;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    check-cast v2, LBh/l0;

    invoke-interface {v2}, LBh/l0;->getUpperBounds()Ljava/util/List;

    move-result-object v1

    const-string v2, "getUpperBounds(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, v1, p3}, Lpi/A0;->i(Lpi/G0;Ljava/util/List;Lpi/G;)Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    :cond_3
    :goto_0
    iget-object v1, p0, Lpi/A0;->b:Lpi/x0;

    invoke-virtual {v1}, Lpi/x0;->a()Z

    move-result v1

    if-nez v1, :cond_0

    :cond_4
    invoke-static {v0}, LZg/d0;->a(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final e(LBh/l0;Lpi/G;)Lpi/S;
    .locals 2

    const-string v0, "typeParameter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeAttr"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpi/A0;->e:Loi/g;

    new-instance v1, Lpi/A0$b;

    invoke-direct {v1, p1, p2}, Lpi/A0$b;-><init>(LBh/l0;Lpi/G;)V

    invoke-interface {v0, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "invoke(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lpi/S;

    return-object p1
.end method
