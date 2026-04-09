.class public abstract LNh/U;
.super Lii/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LNh/U$a;,
        LNh/U$b;
    }
.end annotation


# static fields
.field static final synthetic m:[Lth/l;


# instance fields
.field private final b:LMh/k;

.field private final c:LNh/U;

.field private final d:Loi/i;

.field private final e:Loi/i;

.field private final f:Loi/g;

.field private final g:Loi/h;

.field private final h:Loi/g;

.field private final i:Loi/i;

.field private final j:Loi/i;

.field private final k:Loi/i;

.field private final l:Loi/g;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LNh/U;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v2

    const-string v3, "functionNamesLazy"

    const-string v4, "getFunctionNamesLazy()Ljava/util/Set;"

    invoke-direct {v0, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v3

    const-string v4, "propertyNamesLazy"

    const-string v5, "getPropertyNamesLazy()Ljava/util/Set;"

    invoke-direct {v2, v3, v4, v5}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v2

    new-instance v3, Lkotlin/jvm/internal/F;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v1

    const-string v4, "classNamesLazy"

    const-string v5, "getClassNamesLazy()Ljava/util/Set;"

    invoke-direct {v3, v1, v4, v5}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v3}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v1

    const/4 v3, 0x3

    new-array v3, v3, [Lth/l;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v2, v3, v0

    const/4 v0, 0x2

    aput-object v1, v3, v0

    sput-object v3, LNh/U;->m:[Lth/l;

    return-void
.end method

.method public constructor <init>(LMh/k;LNh/U;)V
    .locals 2

    const-string v0, "c"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lii/l;-><init>()V

    .line 3
    iput-object p1, p0, LNh/U;->b:LMh/k;

    .line 4
    iput-object p2, p0, LNh/U;->c:LNh/U;

    .line 5
    invoke-virtual {p1}, LMh/k;->e()Loi/n;

    move-result-object p2

    new-instance v0, LNh/H;

    invoke-direct {v0, p0}, LNh/H;-><init>(LNh/U;)V

    .line 6
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v1

    .line 7
    invoke-interface {p2, v0, v1}, Loi/n;->g(Lmh/a;Ljava/lang/Object;)Loi/i;

    move-result-object p2

    iput-object p2, p0, LNh/U;->d:Loi/i;

    .line 8
    invoke-virtual {p1}, LMh/k;->e()Loi/n;

    move-result-object p2

    new-instance v0, LNh/K;

    invoke-direct {v0, p0}, LNh/K;-><init>(LNh/U;)V

    invoke-interface {p2, v0}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p2

    iput-object p2, p0, LNh/U;->e:Loi/i;

    .line 9
    invoke-virtual {p1}, LMh/k;->e()Loi/n;

    move-result-object p2

    new-instance v0, LNh/L;

    invoke-direct {v0, p0}, LNh/L;-><init>(LNh/U;)V

    invoke-interface {p2, v0}, Loi/n;->e(Lmh/l;)Loi/g;

    move-result-object p2

    iput-object p2, p0, LNh/U;->f:Loi/g;

    .line 10
    invoke-virtual {p1}, LMh/k;->e()Loi/n;

    move-result-object p2

    new-instance v0, LNh/M;

    invoke-direct {v0, p0}, LNh/M;-><init>(LNh/U;)V

    invoke-interface {p2, v0}, Loi/n;->i(Lmh/l;)Loi/h;

    move-result-object p2

    iput-object p2, p0, LNh/U;->g:Loi/h;

    .line 11
    invoke-virtual {p1}, LMh/k;->e()Loi/n;

    move-result-object p2

    new-instance v0, LNh/N;

    invoke-direct {v0, p0}, LNh/N;-><init>(LNh/U;)V

    invoke-interface {p2, v0}, Loi/n;->e(Lmh/l;)Loi/g;

    move-result-object p2

    iput-object p2, p0, LNh/U;->h:Loi/g;

    .line 12
    invoke-virtual {p1}, LMh/k;->e()Loi/n;

    move-result-object p2

    new-instance v0, LNh/O;

    invoke-direct {v0, p0}, LNh/O;-><init>(LNh/U;)V

    invoke-interface {p2, v0}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p2

    iput-object p2, p0, LNh/U;->i:Loi/i;

    .line 13
    invoke-virtual {p1}, LMh/k;->e()Loi/n;

    move-result-object p2

    new-instance v0, LNh/P;

    invoke-direct {v0, p0}, LNh/P;-><init>(LNh/U;)V

    invoke-interface {p2, v0}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p2

    iput-object p2, p0, LNh/U;->j:Loi/i;

    .line 14
    invoke-virtual {p1}, LMh/k;->e()Loi/n;

    move-result-object p2

    new-instance v0, LNh/Q;

    invoke-direct {v0, p0}, LNh/Q;-><init>(LNh/U;)V

    invoke-interface {p2, v0}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p2

    iput-object p2, p0, LNh/U;->k:Loi/i;

    .line 15
    invoke-virtual {p1}, LMh/k;->e()Loi/n;

    move-result-object p1

    new-instance p2, LNh/S;

    invoke-direct {p2, p0}, LNh/S;-><init>(LNh/U;)V

    invoke-interface {p1, p2}, Loi/n;->e(Lmh/l;)Loi/g;

    move-result-object p1

    iput-object p1, p0, LNh/U;->l:Loi/g;

    return-void
.end method

.method public synthetic constructor <init>(LMh/k;LNh/U;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2}, LNh/U;-><init>(LMh/k;LNh/U;)V

    return-void
.end method

.method private final E(LQh/n;)LDh/K;
    .locals 9

    invoke-interface {p1}, LQh/s;->isFinal()Z

    move-result v0

    xor-int/lit8 v5, v0, 0x1

    iget-object v0, p0, LNh/U;->b:LMh/k;

    invoke-static {v0, p1}, LMh/h;->a(LMh/k;LQh/d;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v2

    invoke-virtual {p0}, LNh/U;->R()LBh/m;

    move-result-object v1

    sget-object v3, LBh/D;->FINAL:LBh/D;

    invoke-interface {p1}, LQh/s;->getVisibility()LBh/w0;

    move-result-object v0

    invoke-static {v0}, LJh/V;->d(LBh/w0;)LBh/u;

    move-result-object v4

    invoke-interface {p1}, LQh/t;->getName()LZh/f;

    move-result-object v6

    iget-object v0, p0, LNh/U;->b:LMh/k;

    invoke-virtual {v0}, LMh/k;->a()LMh/d;

    move-result-object v0

    invoke-virtual {v0}, LMh/d;->t()LPh/b;

    move-result-object v0

    invoke-interface {v0, p1}, LPh/b;->a(LQh/l;)LPh/a;

    move-result-object v7

    invoke-direct {p0, p1}, LNh/U;->U(LQh/n;)Z

    move-result v8

    invoke-static/range {v1 .. v8}, LLh/f;->f1(LBh/m;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/D;LBh/u;ZLZh/f;LBh/g0;Z)LLh/f;

    move-result-object p1

    const-string v0, "create(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final F(LNh/U;LZh/f;)LBh/Y;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LNh/U;->c:LNh/U;

    if-eqz v0, :cond_0

    iget-object p0, v0, LNh/U;->g:Loi/h;

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LBh/Y;

    return-object p0

    :cond_0
    iget-object v0, p0, LNh/U;->e:Loi/i;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LNh/c;

    invoke-interface {v0, p1}, LNh/c;->c(LZh/f;)LQh/n;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, LQh/n;->G()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0, p1}, LNh/U;->a0(LQh/n;)LBh/Y;

    move-result-object p0

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method private static final G(LNh/U;LZh/f;)Ljava/util/Collection;
    .locals 5

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LNh/U;->c:LNh/U;

    if-eqz v0, :cond_0

    iget-object p0, v0, LNh/U;->f:Loi/g;

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    return-object p0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, LNh/U;->e:Loi/i;

    invoke-interface {v1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LNh/c;

    invoke-interface {v1, p1}, LNh/c;->b(LZh/f;)Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LQh/r;

    invoke-virtual {p0, v2}, LNh/U;->Z(LQh/r;)LLh/e;

    move-result-object v3

    invoke-virtual {p0, v3}, LNh/U;->V(LLh/e;)Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v4, p0, LNh/U;->b:LMh/k;

    invoke-virtual {v4}, LMh/k;->a()LMh/d;

    move-result-object v4

    invoke-virtual {v4}, LMh/d;->h()LKh/j;

    move-result-object v4

    invoke-interface {v4, v2, v3}, LKh/j;->a(LQh/q;LBh/f0;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v0, p1}, LNh/U;->y(Ljava/util/Collection;LZh/f;)V

    return-object v0
.end method

.method private static final H(LNh/U;)LNh/c;
    .locals 0

    invoke-virtual {p0}, LNh/U;->z()LNh/c;

    move-result-object p0

    return-object p0
.end method

.method private static final I(LNh/U;)Ljava/util/Set;
    .locals 2

    sget-object v0, Lii/d;->v:Lii/d;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, LNh/U;->x(Lii/d;Lmh/l;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method private static final J(LNh/U;LZh/f;)Ljava/util/Collection;
    .locals 2

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/LinkedHashSet;

    iget-object v1, p0, LNh/U;->f:Loi/g;

    invoke-interface {v1, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-direct {v0, v1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    invoke-direct {p0, v0}, LNh/U;->e0(Ljava/util/Set;)V

    invoke-virtual {p0, v0, p1}, LNh/U;->B(Ljava/util/Collection;LZh/f;)V

    iget-object p1, p0, LNh/U;->b:LMh/k;

    invoke-virtual {p1}, LMh/k;->a()LMh/d;

    move-result-object p1

    invoke-virtual {p1}, LMh/d;->r()LRh/e0;

    move-result-object p1

    iget-object p0, p0, LNh/U;->b:LMh/k;

    invoke-virtual {p1, p0, v0}, LRh/e0;->p(LMh/k;Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    return-object p0
.end method

.method private final M()Ljava/util/Set;
    .locals 3

    iget-object v0, p0, LNh/U;->k:Loi/i;

    sget-object v1, LNh/U;->m:[Lth/l;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, Loi/m;->a(Loi/i;Ljava/lang/Object;Lth/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    return-object v0
.end method

.method private final P()Ljava/util/Set;
    .locals 3

    iget-object v0, p0, LNh/U;->i:Loi/i;

    sget-object v1, LNh/U;->m:[Lth/l;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, Loi/m;->a(Loi/i;Ljava/lang/Object;Lth/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    return-object v0
.end method

.method private final S()Ljava/util/Set;
    .locals 3

    iget-object v0, p0, LNh/U;->j:Loi/i;

    sget-object v1, LNh/U;->m:[Lth/l;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, Loi/m;->a(Loi/i;Ljava/lang/Object;Lth/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    return-object v0
.end method

.method private final T(LQh/n;)Lpi/S;
    .locals 8

    iget-object v0, p0, LNh/U;->b:LMh/k;

    invoke-virtual {v0}, LMh/k;->g()LOh/e;

    move-result-object v0

    invoke-interface {p1}, LQh/n;->getType()LQh/x;

    move-result-object v1

    sget-object v2, Lpi/I0;->COMMON:Lpi/I0;

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, LOh/b;->b(Lpi/I0;ZZLBh/l0;ILjava/lang/Object;)LOh/a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LOh/e;->p(LQh/x;LOh/a;)Lpi/S;

    move-result-object v0

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->s0(Lpi/S;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->v0(Lpi/S;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    invoke-direct {p0, p1}, LNh/U;->U(LQh/n;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, LQh/n;->O()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {v0}, Lpi/J0;->n(Lpi/S;)Lpi/S;

    move-result-object p1

    const-string v0, "makeNotNullable(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_1
    return-object v0
.end method

.method private final U(LQh/n;)Z
    .locals 1

    invoke-interface {p1}, LQh/s;->isFinal()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, LQh/s;->Q()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private static final W(LNh/U;LZh/f;)Ljava/util/List;
    .locals 2

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, LNh/U;->g:Loi/h;

    invoke-interface {v1, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lxi/a;->a(Ljava/util/Collection;Ljava/lang/Object;)V

    invoke-virtual {p0, p1, v0}, LNh/U;->C(LZh/f;Ljava/util/Collection;)V

    invoke-virtual {p0}, LNh/U;->R()LBh/m;

    move-result-object p1

    invoke-static {p1}, Lbi/i;->t(LBh/m;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {v0}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    goto :goto_0

    :cond_0
    iget-object p1, p0, LNh/U;->b:LMh/k;

    invoke-virtual {p1}, LMh/k;->a()LMh/d;

    move-result-object p1

    invoke-virtual {p1}, LMh/d;->r()LRh/e0;

    move-result-object p1

    iget-object p0, p0, LNh/U;->b:LMh/k;

    invoke-virtual {p1, p0, v0}, LRh/e0;->p(LMh/k;Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method private static final X(LNh/U;)Ljava/util/Set;
    .locals 2

    sget-object v0, Lii/d;->w:Lii/d;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, LNh/U;->D(Lii/d;Lmh/l;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method private final a0(LQh/n;)LBh/Y;
    .locals 9

    new-instance v0, Lkotlin/jvm/internal/N;

    invoke-direct {v0}, Lkotlin/jvm/internal/N;-><init>()V

    invoke-direct {p0, p1}, LNh/U;->E(LQh/n;)LDh/K;

    move-result-object v1

    iput-object v1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v2, v2, v2}, LDh/K;->V0(LDh/L;LBh/a0;LBh/w;LBh/w;)V

    invoke-direct {p0, p1}, LNh/U;->T(LQh/n;)Lpi/S;

    move-result-object v4

    iget-object v1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, LDh/K;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v5

    invoke-virtual {p0}, LNh/U;->O()LBh/b0;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v8

    invoke-virtual/range {v3 .. v8}, LDh/K;->b1(Lpi/S;Ljava/util/List;LBh/b0;LBh/b0;Ljava/util/List;)V

    invoke-virtual {p0}, LNh/U;->R()LBh/m;

    move-result-object v1

    instance-of v3, v1, LBh/e;

    if-eqz v3, :cond_0

    move-object v2, v1

    check-cast v2, LBh/e;

    :cond_0
    if-eqz v2, :cond_1

    iget-object v1, p0, LNh/U;->b:LMh/k;

    invoke-virtual {v1}, LMh/k;->a()LMh/d;

    move-result-object v1

    invoke-virtual {v1}, LMh/d;->w()Lgi/f;

    move-result-object v1

    iget-object v3, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v3, LDh/K;

    iget-object v4, p0, LNh/U;->b:LMh/k;

    invoke-interface {v1, v2, v3, v4}, Lgi/f;->d(LBh/e;LDh/K;LMh/k;)LDh/K;

    move-result-object v1

    iput-object v1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    :cond_1
    iget-object v1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, LBh/t0;

    check-cast v1, LDh/K;

    invoke-virtual {v1}, LDh/X;->getType()Lpi/S;

    move-result-object v1

    invoke-static {v2, v1}, Lbi/i;->K(LBh/t0;Lpi/S;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v1, LDh/K;

    new-instance v2, LNh/I;

    invoke-direct {v2, p0, p1, v0}, LNh/I;-><init>(LNh/U;LQh/n;Lkotlin/jvm/internal/N;)V

    invoke-virtual {v1, v2}, LDh/Y;->L0(Lmh/a;)V

    :cond_2
    iget-object v1, p0, LNh/U;->b:LMh/k;

    invoke-virtual {v1}, LMh/k;->a()LMh/d;

    move-result-object v1

    invoke-virtual {v1}, LMh/d;->h()LKh/j;

    move-result-object v1

    iget-object v2, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v2, LBh/Y;

    invoke-interface {v1, p1, v2}, LKh/j;->d(LQh/n;LBh/Y;)V

    iget-object p1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast p1, LBh/Y;

    return-object p1
.end method

.method private static final b0(LNh/U;LQh/n;Lkotlin/jvm/internal/N;)Loi/j;
    .locals 2

    iget-object v0, p0, LNh/U;->b:LMh/k;

    invoke-virtual {v0}, LMh/k;->e()Loi/n;

    move-result-object v0

    new-instance v1, LNh/J;

    invoke-direct {v1, p0, p1, p2}, LNh/J;-><init>(LNh/U;LQh/n;Lkotlin/jvm/internal/N;)V

    invoke-interface {v0, v1}, Loi/n;->b(Lmh/a;)Loi/j;

    move-result-object p0

    return-object p0
.end method

.method private static final c0(LNh/U;LQh/n;Lkotlin/jvm/internal/N;)Ldi/g;
    .locals 0

    iget-object p0, p0, LNh/U;->b:LMh/k;

    invoke-virtual {p0}, LMh/k;->a()LMh/d;

    move-result-object p0

    invoke-virtual {p0}, LMh/d;->g()LKh/i;

    move-result-object p0

    iget-object p2, p2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast p2, LBh/Y;

    invoke-interface {p0, p1, p2}, LKh/i;->a(LQh/n;LBh/Y;)Ldi/g;

    move-result-object p0

    return-object p0
.end method

.method private final e0(Ljava/util/Set;)V
    .locals 7

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, LBh/f0;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static {v3, v6, v6, v4, v5}, LSh/C;->c(LBh/z;ZZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_0

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    check-cast v4, Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_2

    check-cast v1, Ljava/util/Collection;

    sget-object v2, LNh/T;->a:LNh/T;

    invoke-static {v1, v2}, Lbi/r;->b(Ljava/util/Collection;Lmh/l;)Ljava/util/Collection;

    move-result-object v2

    invoke-interface {p1, v1}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    invoke-interface {p1, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    :cond_3
    return-void
.end method

.method private static final f0(LBh/f0;)LBh/a;
    .locals 1

    const-string v0, "$this$selectMostSpecificInEachOverridableGroup"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method static synthetic h(LNh/U;)Ljava/util/Collection;
    .locals 0

    invoke-static {p0}, LNh/U;->t(LNh/U;)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method static synthetic i(LNh/U;)LNh/c;
    .locals 0

    invoke-static {p0}, LNh/U;->H(LNh/U;)LNh/c;

    move-result-object p0

    return-object p0
.end method

.method static synthetic j(LNh/U;LQh/n;Lkotlin/jvm/internal/N;)Loi/j;
    .locals 0

    invoke-static {p0, p1, p2}, LNh/U;->b0(LNh/U;LQh/n;Lkotlin/jvm/internal/N;)Loi/j;

    move-result-object p0

    return-object p0
.end method

.method static synthetic k(LNh/U;LQh/n;Lkotlin/jvm/internal/N;)Ldi/g;
    .locals 0

    invoke-static {p0, p1, p2}, LNh/U;->c0(LNh/U;LQh/n;Lkotlin/jvm/internal/N;)Ldi/g;

    move-result-object p0

    return-object p0
.end method

.method static synthetic l(LNh/U;LZh/f;)Ljava/util/Collection;
    .locals 0

    invoke-static {p0, p1}, LNh/U;->G(LNh/U;LZh/f;)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method static synthetic m(LNh/U;LZh/f;)LBh/Y;
    .locals 0

    invoke-static {p0, p1}, LNh/U;->F(LNh/U;LZh/f;)LBh/Y;

    move-result-object p0

    return-object p0
.end method

.method static synthetic n(LNh/U;LZh/f;)Ljava/util/Collection;
    .locals 0

    invoke-static {p0, p1}, LNh/U;->J(LNh/U;LZh/f;)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method static synthetic o(LNh/U;)Ljava/util/Set;
    .locals 0

    invoke-static {p0}, LNh/U;->I(LNh/U;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method static synthetic p(LNh/U;)Ljava/util/Set;
    .locals 0

    invoke-static {p0}, LNh/U;->X(LNh/U;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method static synthetic q(LNh/U;)Ljava/util/Set;
    .locals 0

    invoke-static {p0}, LNh/U;->u(LNh/U;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method static synthetic r(LNh/U;LZh/f;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, LNh/U;->W(LNh/U;LZh/f;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method static synthetic s(LBh/f0;)LBh/a;
    .locals 0

    invoke-static {p0}, LNh/U;->f0(LBh/f0;)LBh/a;

    move-result-object p0

    return-object p0
.end method

.method private static final t(LNh/U;)Ljava/util/Collection;
    .locals 2

    sget-object v0, Lii/d;->o:Lii/d;

    sget-object v1, Lii/k;->a:Lii/k$a;

    invoke-virtual {v1}, Lii/k$a;->c()Lmh/l;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, LNh/U;->w(Lii/d;Lmh/l;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    return-object p0
.end method

.method private static final u(LNh/U;)Ljava/util/Set;
    .locals 2

    sget-object v0, Lii/d;->t:Lii/d;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, LNh/U;->v(Lii/d;Lmh/l;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method protected final A(LQh/r;LMh/k;)Lpi/S;
    .locals 7

    const-string v0, "method"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "c"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LQh/q;->P()LQh/g;

    move-result-object v0

    invoke-interface {v0}, LQh/g;->n()Z

    move-result v2

    sget-object v1, Lpi/I0;->COMMON:Lpi/I0;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LOh/b;->b(Lpi/I0;ZZLBh/l0;ILjava/lang/Object;)LOh/a;

    move-result-object v0

    invoke-virtual {p2}, LMh/k;->g()LOh/e;

    move-result-object p2

    invoke-interface {p1}, LQh/r;->getReturnType()LQh/x;

    move-result-object p1

    invoke-virtual {p2, p1, v0}, LOh/e;->p(LQh/x;LOh/a;)Lpi/S;

    move-result-object p1

    return-object p1
.end method

.method protected abstract B(Ljava/util/Collection;LZh/f;)V
.end method

.method protected abstract C(LZh/f;Ljava/util/Collection;)V
.end method

.method protected abstract D(Lii/d;Lmh/l;)Ljava/util/Set;
.end method

.method protected final K()Loi/i;
    .locals 1

    iget-object v0, p0, LNh/U;->d:Loi/i;

    return-object v0
.end method

.method protected final L()LMh/k;
    .locals 1

    iget-object v0, p0, LNh/U;->b:LMh/k;

    return-object v0
.end method

.method protected final N()Loi/i;
    .locals 1

    iget-object v0, p0, LNh/U;->e:Loi/i;

    return-object v0
.end method

.method protected abstract O()LBh/b0;
.end method

.method protected final Q()LNh/U;
    .locals 1

    iget-object v0, p0, LNh/U;->c:LNh/U;

    return-object v0
.end method

.method protected abstract R()LBh/m;
.end method

.method protected V(LLh/e;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method

.method protected abstract Y(LQh/r;Ljava/util/List;Lpi/S;Ljava/util/List;)LNh/U$a;
.end method

.method protected final Z(LQh/r;)LLh/e;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    const-string v1, "method"

    invoke-static {v7, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, LNh/U;->b:LMh/k;

    invoke-static {v1, v7}, LMh/h;->a(LMh/k;LQh/d;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, LNh/U;->R()LBh/m;

    move-result-object v2

    invoke-interface/range {p1 .. p1}, LQh/t;->getName()LZh/f;

    move-result-object v3

    iget-object v4, v0, LNh/U;->b:LMh/k;

    invoke-virtual {v4}, LMh/k;->a()LMh/d;

    move-result-object v4

    invoke-virtual {v4}, LMh/d;->t()LPh/b;

    move-result-object v4

    invoke-interface {v4, v7}, LPh/b;->a(LQh/l;)LPh/a;

    move-result-object v4

    iget-object v5, v0, LNh/U;->e:Loi/i;

    invoke-interface {v5}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LNh/c;

    invoke-interface/range {p1 .. p1}, LQh/t;->getName()LZh/f;

    move-result-object v6

    invoke-interface {v5, v6}, LNh/c;->f(LZh/f;)LQh/w;

    move-result-object v5

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eqz v5, :cond_0

    invoke-interface/range {p1 .. p1}, LQh/r;->i()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_0

    move v5, v9

    goto :goto_0

    :cond_0
    move v5, v8

    :goto_0
    invoke-static {v2, v1, v3, v4, v5}, LLh/e;->p1(LBh/m;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;LBh/g0;Z)LLh/e;

    move-result-object v15

    const-string v1, "createJavaMethod(...)"

    invoke-static {v15, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, LNh/U;->b:LMh/k;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, v15

    move-object/from16 v3, p1

    invoke-static/range {v1 .. v6}, LMh/c;->i(LMh/k;LBh/m;LQh/z;IILjava/lang/Object;)LMh/k;

    move-result-object v1

    invoke-interface/range {p1 .. p1}, LQh/z;->getTypeParameters()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, LZg/v;->w(Ljava/lang/Iterable;I)I

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

    check-cast v4, LQh/y;

    invoke-virtual {v1}, LMh/k;->f()LMh/p;

    move-result-object v5

    invoke-interface {v5, v4}, LMh/p;->a(LQh/y;)LBh/l0;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-interface/range {p1 .. p1}, LQh/r;->i()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v15, v2}, LNh/U;->d0(LMh/k;LBh/z;Ljava/util/List;)LNh/U$b;

    move-result-object v2

    invoke-virtual {v0, v7, v1}, LNh/U;->A(LQh/r;LMh/k;)Lpi/S;

    move-result-object v4

    invoke-virtual {v2}, LNh/U$b;->a()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v0, v7, v3, v4, v5}, LNh/U;->Y(LQh/r;Ljava/util/List;Lpi/S;Ljava/util/List;)LNh/U$a;

    move-result-object v3

    invoke-virtual {v3}, LNh/U$a;->c()Lpi/S;

    move-result-object v4

    if-eqz v4, :cond_2

    sget-object v5, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-virtual {v5}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->b()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v5

    invoke-static {v15, v4, v5}, Lbi/h;->i(LBh/a;Lpi/S;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)LBh/b0;

    move-result-object v4

    :goto_2
    move-object v11, v4

    goto :goto_3

    :cond_2
    const/4 v4, 0x0

    goto :goto_2

    :goto_3
    invoke-virtual/range {p0 .. p0}, LNh/U;->O()LBh/b0;

    move-result-object v12

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v13

    invoke-virtual {v3}, LNh/U$a;->e()Ljava/util/List;

    move-result-object v14

    invoke-virtual {v3}, LNh/U$a;->f()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v3}, LNh/U$a;->d()Lpi/S;

    move-result-object v16

    sget-object v5, LBh/D;->Companion:LBh/D$a;

    invoke-interface/range {p1 .. p1}, LQh/s;->isAbstract()Z

    move-result v6

    invoke-interface/range {p1 .. p1}, LQh/s;->isFinal()Z

    move-result v10

    xor-int/2addr v9, v10

    invoke-virtual {v5, v8, v6, v9}, LBh/D$a;->a(ZZZ)LBh/D;

    move-result-object v17

    invoke-interface/range {p1 .. p1}, LQh/s;->getVisibility()LBh/w0;

    move-result-object v5

    invoke-static {v5}, LJh/V;->d(LBh/w0;)LBh/u;

    move-result-object v18

    invoke-virtual {v3}, LNh/U$a;->c()Lpi/S;

    move-result-object v5

    if-eqz v5, :cond_3

    sget-object v5, LLh/e;->G:LBh/a$a;

    invoke-virtual {v2}, LNh/U$b;->a()Ljava/util/List;

    move-result-object v6

    invoke-static {v6}, LZg/v;->q0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5, v6}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v5

    invoke-static {v5}, LZg/U;->e(LYg/s;)Ljava/util/Map;

    move-result-object v5

    :goto_4
    move-object/from16 v19, v5

    goto :goto_5

    :cond_3
    invoke-static {}, LZg/U;->h()Ljava/util/Map;

    move-result-object v5

    goto :goto_4

    :goto_5
    move-object v10, v15

    move-object v5, v15

    move-object v15, v4

    invoke-virtual/range {v10 .. v19}, LLh/e;->o1(LBh/b0;LBh/b0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lpi/S;LBh/D;LBh/u;Ljava/util/Map;)LDh/O;

    invoke-virtual {v3}, LNh/U$a;->b()Z

    move-result v4

    invoke-virtual {v2}, LNh/U$b;->b()Z

    move-result v2

    invoke-virtual {v5, v4, v2}, LLh/e;->s1(ZZ)V

    invoke-virtual {v3}, LNh/U$a;->a()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {v1}, LMh/k;->a()LMh/d;

    move-result-object v1

    invoke-virtual {v1}, LMh/d;->s()LKh/o;

    move-result-object v1

    invoke-virtual {v3}, LNh/U$a;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v5, v2}, LKh/o;->a(LBh/b;Ljava/util/List;)V

    :cond_4
    return-object v5
.end method

.method public a()Ljava/util/Set;
    .locals 1

    invoke-direct {p0}, LNh/U;->P()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public b(LZh/f;LIh/b;)Ljava/util/Collection;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LNh/U;->a()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1

    :cond_0
    iget-object p2, p0, LNh/U;->h:Loi/g;

    invoke-interface {p2, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method public c()Ljava/util/Set;
    .locals 1

    invoke-direct {p0}, LNh/U;->S()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public d(LZh/f;LIh/b;)Ljava/util/Collection;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LNh/U;->c()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1

    :cond_0
    iget-object p2, p0, LNh/U;->l:Loi/g;

    invoke-interface {p2, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method protected final d0(LMh/k;LBh/z;Ljava/util/List;)LNh/U$b;
    .locals 20

    move-object/from16 v0, p1

    move-object/from16 v1, p3

    const-string v2, "c"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "function"

    move-object/from16 v15, p2

    invoke-static {v15, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "jValueParameters"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, LZg/v;->q1(Ljava/lang/Iterable;)Ljava/lang/Iterable;

    move-result-object v2

    new-instance v14, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v2, v3}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v14, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LZg/N;

    invoke-virtual {v4}, LZg/N;->a()I

    move-result v6

    invoke-virtual {v4}, LZg/N;->b()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LQh/B;

    invoke-static {v0, v4}, LMh/h;->a(LMh/k;LQh/d;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v7

    sget-object v8, Lpi/I0;->COMMON:Lpi/I0;

    const/4 v12, 0x7

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, LOh/b;->b(Lpi/I0;ZZLBh/l0;ILjava/lang/Object;)LOh/a;

    move-result-object v5

    invoke-interface {v4}, LQh/B;->c()Z

    move-result v8

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eqz v8, :cond_2

    invoke-interface {v4}, LQh/B;->getType()LQh/x;

    move-result-object v8

    instance-of v11, v8, LQh/f;

    if-eqz v11, :cond_0

    move-object v9, v8

    check-cast v9, LQh/f;

    :cond_0
    if-eqz v9, :cond_1

    invoke-virtual/range {p1 .. p1}, LMh/k;->g()LOh/e;

    move-result-object v8

    invoke-virtual {v8, v9, v5, v10}, LOh/e;->l(LQh/f;LOh/a;Z)Lpi/S;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, LMh/k;->d()LBh/G;

    move-result-object v8

    invoke-interface {v8}, LBh/G;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object v8

    invoke-virtual {v8, v5}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->k(Lpi/S;)Lpi/S;

    move-result-object v8

    invoke-static {v5, v8}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v5

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Vararg parameter should be an array: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_2
    invoke-virtual/range {p1 .. p1}, LMh/k;->g()LOh/e;

    move-result-object v8

    invoke-interface {v4}, LQh/B;->getType()LQh/x;

    move-result-object v11

    invoke-virtual {v8, v11, v5}, LOh/e;->p(LQh/x;LOh/a;)Lpi/S;

    move-result-object v5

    invoke-static {v5, v9}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v5

    :goto_1
    invoke-virtual {v5}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lpi/S;

    invoke-virtual {v5}, LYg/s;->c()Ljava/lang/Object;

    move-result-object v5

    move-object v13, v5

    check-cast v13, Lpi/S;

    invoke-interface/range {p2 .. p2}, LBh/I;->getName()LZh/f;

    move-result-object v5

    invoke-virtual {v5}, LZh/f;->b()Ljava/lang/String;

    move-result-object v5

    const-string v8, "equals"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    move-result v5

    if-ne v5, v10, :cond_4

    invoke-virtual/range {p1 .. p1}, LMh/k;->d()LBh/G;

    move-result-object v5

    invoke-interface {v5}, LBh/G;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object v5

    invoke-virtual {v5}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->I()Lpi/d0;

    move-result-object v5

    invoke-static {v5, v9}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const-string v5, "other"

    invoke-static {v5}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v5

    :cond_3
    :goto_2
    move/from16 v16, v3

    move-object v8, v5

    goto :goto_3

    :cond_4
    invoke-interface {v4}, LQh/B;->getName()LZh/f;

    move-result-object v5

    if-nez v5, :cond_5

    move v3, v10

    :cond_5
    if-nez v5, :cond_3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v8, 0x70

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v5

    const-string v8, "identifier(...)"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    :goto_3
    invoke-static {v8}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    new-instance v12, LDh/V;

    invoke-virtual/range {p1 .. p1}, LMh/k;->a()LMh/d;

    move-result-object v3

    invoke-virtual {v3}, LMh/d;->t()LPh/b;

    move-result-object v3

    invoke-interface {v3, v4}, LPh/b;->a(LQh/l;)LPh/a;

    move-result-object v17

    const/4 v5, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v18, 0x0

    move-object v3, v12

    move-object/from16 v4, p2

    move-object/from16 v19, v12

    move/from16 v12, v18

    move-object v0, v14

    move-object/from16 v14, v17

    invoke-direct/range {v3 .. v14}, LDh/V;-><init>(LBh/a;LBh/s0;ILkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;Lpi/S;ZZZLpi/S;LBh/g0;)V

    move-object/from16 v3, v19

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v14, v0

    move/from16 v3, v16

    move-object/from16 v0, p1

    goto/16 :goto_0

    :cond_6
    move-object v0, v14

    invoke-static {v0}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    new-instance v1, LNh/U$b;

    invoke-direct {v1, v0, v3}, LNh/U$b;-><init>(Ljava/util/List;Z)V

    return-object v1
.end method

.method public e(Lii/d;Lmh/l;)Ljava/util/Collection;
    .locals 1

    const-string v0, "kindFilter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "nameFilter"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LNh/U;->d:Loi/i;

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method public f()Ljava/util/Set;
    .locals 1

    invoke-direct {p0}, LNh/U;->M()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Lazy scope for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LNh/U;->R()LBh/m;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected abstract v(Lii/d;Lmh/l;)Ljava/util/Set;
.end method

.method protected final w(Lii/d;Lmh/l;)Ljava/util/List;
    .locals 5

    const-string v0, "kindFilter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameFilter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LIh/d;->WHEN_GET_ALL_DESCRIPTORS:LIh/d;

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    sget-object v2, Lii/d;->c:Lii/d$a;

    invoke-virtual {v2}, Lii/d$a;->c()I

    move-result v2

    invoke-virtual {p1, v2}, Lii/d;->a(I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0, p1, p2}, LNh/U;->v(Lii/d;Lmh/l;)Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LZh/f;

    invoke-interface {p2, v3}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {p0, v3, v0}, Lii/l;->g(LZh/f;LIh/b;)LBh/h;

    move-result-object v3

    invoke-static {v1, v3}, Lxi/a;->a(Ljava/util/Collection;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    sget-object v2, Lii/d;->c:Lii/d$a;

    invoke-virtual {v2}, Lii/d$a;->d()I

    move-result v2

    invoke-virtual {p1, v2}, Lii/d;->a(I)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p1}, Lii/d;->l()Ljava/util/List;

    move-result-object v2

    sget-object v3, Lii/c$a;->a:Lii/c$a;

    invoke-interface {v2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    invoke-virtual {p0, p1, p2}, LNh/U;->x(Lii/d;Lmh/l;)Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LZh/f;

    invoke-interface {p2, v3}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {p0, v3, v0}, LNh/U;->b(LZh/f;LIh/b;)Ljava/util/Collection;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    :cond_3
    sget-object v2, Lii/d;->c:Lii/d$a;

    invoke-virtual {v2}, Lii/d$a;->i()I

    move-result v2

    invoke-virtual {p1, v2}, Lii/d;->a(I)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {p1}, Lii/d;->l()Ljava/util/List;

    move-result-object v2

    sget-object v3, Lii/c$a;->a:Lii/c$a;

    invoke-interface {v2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    invoke-virtual {p0, p1, p2}, LNh/U;->D(Lii/d;Lmh/l;)Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LZh/f;

    invoke-interface {p2, v2}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {p0, v2, v0}, LNh/U;->d(LZh/f;LIh/b;)Ljava/util/Collection;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    goto :goto_2

    :cond_5
    invoke-static {v1}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method protected abstract x(Lii/d;Lmh/l;)Ljava/util/Set;
.end method

.method protected y(Ljava/util/Collection;LZh/f;)V
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "name"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method protected abstract z()LNh/c;
.end method
