.class public final Lbi/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lbi/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lbi/g;

    invoke-direct {v0}, Lbi/g;-><init>()V

    sput-object v0, Lbi/g;->a:Lbi/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(LBh/m;LBh/m;)Z
    .locals 0

    invoke-static {p0, p1}, Lbi/g;->p(LBh/m;LBh/m;)Z

    move-result p0

    return p0
.end method

.method static synthetic b(LBh/m;LBh/m;)Z
    .locals 0

    invoke-static {p0, p1}, Lbi/g;->g(LBh/m;LBh/m;)Z

    move-result p0

    return p0
.end method

.method static synthetic c(ZLBh/a;LBh/a;Lpi/v0;Lpi/v0;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lbi/g;->h(ZLBh/a;LBh/a;Lpi/v0;Lpi/v0;)Z

    move-result p0

    return p0
.end method

.method static synthetic d(LBh/a;LBh/a;LBh/m;LBh/m;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lbi/g;->i(LBh/a;LBh/a;LBh/m;LBh/m;)Z

    move-result p0

    return p0
.end method

.method public static synthetic f(Lbi/g;LBh/a;LBh/a;ZZZLkotlin/reflect/jvm/internal/impl/types/checker/g;ILjava/lang/Object;)Z
    .locals 7

    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_0

    const/4 p4, 0x1

    :cond_0
    move v4, p4

    and-int/lit8 p4, p7, 0x10

    if-eqz p4, :cond_1

    const/4 p5, 0x0

    :cond_1
    move v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lbi/g;->e(LBh/a;LBh/a;ZZZLkotlin/reflect/jvm/internal/impl/types/checker/g;)Z

    move-result p0

    return p0
.end method

.method private static final g(LBh/m;LBh/m;)Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method private static final h(ZLBh/a;LBh/a;Lpi/v0;Lpi/v0;)Z
    .locals 2

    const-string v0, "c1"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "c2"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, p4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    invoke-interface {p3}, Lpi/v0;->c()LBh/h;

    move-result-object p3

    invoke-interface {p4}, Lpi/v0;->c()LBh/h;

    move-result-object p4

    instance-of v0, p3, LBh/l0;

    if-eqz v0, :cond_2

    instance-of v0, p4, LBh/l0;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    sget-object v0, Lbi/g;->a:Lbi/g;

    check-cast p3, LBh/l0;

    check-cast p4, LBh/l0;

    new-instance v1, Lbi/f;

    invoke-direct {v1, p1, p2}, Lbi/f;-><init>(LBh/a;LBh/a;)V

    invoke-virtual {v0, p3, p4, p0, v1}, Lbi/g;->n(LBh/l0;LBh/l0;ZLmh/p;)Z

    move-result p0

    return p0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final i(LBh/a;LBh/a;LBh/m;LBh/m;)Z
    .locals 0

    invoke-static {p2, p0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {p3, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private final j(LBh/e;LBh/e;)Z
    .locals 0

    invoke-interface {p1}, LBh/h;->k()Lpi/v0;

    move-result-object p1

    invoke-interface {p2}, LBh/h;->k()Lpi/v0;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public static synthetic l(Lbi/g;LBh/m;LBh/m;ZZILjava/lang/Object;)Z
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x1

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lbi/g;->k(LBh/m;LBh/m;ZZ)Z

    move-result p0

    return p0
.end method

.method public static synthetic o(Lbi/g;LBh/l0;LBh/l0;ZLmh/p;ILjava/lang/Object;)Z
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    sget-object p4, Lbi/c;->a:Lbi/c;

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lbi/g;->n(LBh/l0;LBh/l0;ZLmh/p;)Z

    move-result p0

    return p0
.end method

.method private static final p(LBh/m;LBh/m;)Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method private final q(LBh/m;LBh/m;Lmh/p;Z)Z
    .locals 7

    invoke-interface {p1}, LBh/m;->b()LBh/m;

    move-result-object v1

    invoke-interface {p2}, LBh/m;->b()LBh/m;

    move-result-object v2

    instance-of p1, v1, LBh/b;

    if-nez p1, :cond_1

    instance-of p1, v2, LBh/b;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move v3, p4

    invoke-static/range {v0 .. v6}, Lbi/g;->l(Lbi/g;LBh/m;LBh/m;ZZILjava/lang/Object;)Z

    move-result p1

    goto :goto_1

    :cond_1
    :goto_0
    invoke-interface {p3, v1, v2}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    :goto_1
    return p1
.end method

.method private final r(LBh/a;)LBh/g0;
    .locals 3

    :goto_0
    instance-of v0, p1, LBh/b;

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, LBh/b;

    invoke-interface {v0}, LBh/b;->h()LBh/b$a;

    move-result-object v1

    sget-object v2, LBh/b$a;->FAKE_OVERRIDE:LBh/b$a;

    if-eq v1, v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {v0}, LBh/b;->f()Ljava/util/Collection;

    move-result-object p1

    const-string v0, "getOverriddenDescriptors(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, LZg/v;->S0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LBh/b;

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1

    :cond_2
    :goto_1
    invoke-interface {p1}, LBh/p;->j()LBh/g0;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final e(LBh/a;LBh/a;ZZZLkotlin/reflect/jvm/internal/impl/types/checker/g;)Z
    .locals 3

    const-string v0, "a"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "b"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-interface {p1}, LBh/I;->getName()LZh/f;

    move-result-object v0

    invoke-interface {p2}, LBh/I;->getName()LZh/f;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    if-eqz p4, :cond_2

    instance-of p4, p1, LBh/C;

    if-eqz p4, :cond_2

    instance-of p4, p2, LBh/C;

    if-eqz p4, :cond_2

    move-object p4, p1

    check-cast p4, LBh/C;

    invoke-interface {p4}, LBh/C;->L()Z

    move-result p4

    move-object v0, p2

    check-cast v0, LBh/C;

    invoke-interface {v0}, LBh/C;->L()Z

    move-result v0

    if-eq p4, v0, :cond_2

    return v2

    :cond_2
    invoke-interface {p1}, LBh/n;->b()LBh/m;

    move-result-object p4

    invoke-interface {p2}, LBh/n;->b()LBh/m;

    move-result-object v0

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_4

    if-nez p3, :cond_3

    return v2

    :cond_3
    invoke-direct {p0, p1}, Lbi/g;->r(LBh/a;)LBh/g0;

    move-result-object p4

    invoke-direct {p0, p2}, Lbi/g;->r(LBh/a;)LBh/g0;

    move-result-object v0

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p4

    if-nez p4, :cond_4

    return v2

    :cond_4
    invoke-static {p1}, Lbi/i;->E(LBh/m;)Z

    move-result p4

    if-nez p4, :cond_8

    invoke-static {p2}, Lbi/i;->E(LBh/m;)Z

    move-result p4

    if-eqz p4, :cond_5

    goto :goto_1

    :cond_5
    sget-object p4, Lbi/d;->a:Lbi/d;

    invoke-direct {p0, p1, p2, p4, p3}, Lbi/g;->q(LBh/m;LBh/m;Lmh/p;Z)Z

    move-result p4

    if-nez p4, :cond_6

    return v2

    :cond_6
    new-instance p4, Lbi/e;

    invoke-direct {p4, p3, p1, p2}, Lbi/e;-><init>(ZLBh/a;LBh/a;)V

    invoke-static {p6, p4}, Lbi/o;->i(Lkotlin/reflect/jvm/internal/impl/types/checker/g;Lkotlin/reflect/jvm/internal/impl/types/checker/e$a;)Lbi/o;

    move-result-object p3

    const-string p4, "create(...)"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    xor-int/lit8 p4, p5, 0x1

    const/4 p6, 0x0

    invoke-virtual {p3, p1, p2, p6, p4}, Lbi/o;->E(LBh/a;LBh/a;LBh/e;Z)Lbi/o$i;

    move-result-object p4

    invoke-virtual {p4}, Lbi/o$i;->c()Lbi/o$i$a;

    move-result-object p4

    sget-object v0, Lbi/o$i$a;->OVERRIDABLE:Lbi/o$i$a;

    if-ne p4, v0, :cond_7

    xor-int/lit8 p4, p5, 0x1

    invoke-virtual {p3, p2, p1, p6, p4}, Lbi/o;->E(LBh/a;LBh/a;LBh/e;Z)Lbi/o$i;

    move-result-object p1

    invoke-virtual {p1}, Lbi/o$i;->c()Lbi/o$i$a;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto :goto_0

    :cond_7
    move v1, v2

    :goto_0
    return v1

    :cond_8
    :goto_1
    return v2
.end method

.method public final k(LBh/m;LBh/m;ZZ)Z
    .locals 10

    instance-of v0, p1, LBh/e;

    if-eqz v0, :cond_0

    instance-of v0, p2, LBh/e;

    if-eqz v0, :cond_0

    check-cast p1, LBh/e;

    check-cast p2, LBh/e;

    invoke-direct {p0, p1, p2}, Lbi/g;->j(LBh/e;LBh/e;)Z

    move-result p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, LBh/l0;

    if-eqz v0, :cond_1

    instance-of v0, p2, LBh/l0;

    if-eqz v0, :cond_1

    move-object v2, p1

    check-cast v2, LBh/l0;

    move-object v3, p2

    check-cast v3, LBh/l0;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move v4, p3

    invoke-static/range {v1 .. v7}, Lbi/g;->o(Lbi/g;LBh/l0;LBh/l0;ZLmh/p;ILjava/lang/Object;)Z

    move-result p1

    goto :goto_0

    :cond_1
    instance-of v0, p1, LBh/a;

    if-eqz v0, :cond_2

    instance-of v0, p2, LBh/a;

    if-eqz v0, :cond_2

    move-object v2, p1

    check-cast v2, LBh/a;

    move-object v3, p2

    check-cast v3, LBh/a;

    sget-object v7, Lkotlin/reflect/jvm/internal/impl/types/checker/g$a;->a:Lkotlin/reflect/jvm/internal/impl/types/checker/g$a;

    const/16 v8, 0x10

    const/4 v9, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move v4, p3

    move v5, p4

    invoke-static/range {v1 .. v9}, Lbi/g;->f(Lbi/g;LBh/a;LBh/a;ZZZLkotlin/reflect/jvm/internal/impl/types/checker/g;ILjava/lang/Object;)Z

    move-result p1

    goto :goto_0

    :cond_2
    instance-of p3, p1, LBh/M;

    if-eqz p3, :cond_3

    instance-of p3, p2, LBh/M;

    if-eqz p3, :cond_3

    check-cast p1, LBh/M;

    invoke-interface {p1}, LBh/M;->e()LZh/c;

    move-result-object p1

    check-cast p2, LBh/M;

    invoke-interface {p2}, LBh/M;->e()LZh/c;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    goto :goto_0

    :cond_3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    :goto_0
    return p1
.end method

.method public final m(LBh/l0;LBh/l0;Z)Z
    .locals 8

    const-string v0, "a"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "b"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    invoke-static/range {v1 .. v7}, Lbi/g;->o(Lbi/g;LBh/l0;LBh/l0;ZLmh/p;ILjava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final n(LBh/l0;LBh/l0;ZLmh/p;)Z
    .locals 3

    const-string v0, "a"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "b"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "equivalentCallables"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-interface {p1}, LBh/n;->b()LBh/m;

    move-result-object v0

    invoke-interface {p2}, LBh/n;->b()LBh/m;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    return v2

    :cond_1
    invoke-direct {p0, p1, p2, p4, p3}, Lbi/g;->q(LBh/m;LBh/m;Lmh/p;Z)Z

    move-result p3

    if-nez p3, :cond_2

    return v2

    :cond_2
    invoke-interface {p1}, LBh/l0;->getIndex()I

    move-result p1

    invoke-interface {p2}, LBh/l0;->getIndex()I

    move-result p2

    if-ne p1, p2, :cond_3

    goto :goto_0

    :cond_3
    move v1, v2

    :goto_0
    return v1
.end method
