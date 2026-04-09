.class public final Lni/m;
.super LDh/a;
.source "SourceFile"

# interfaces
.implements LBh/m;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lni/m$a;,
        Lni/m$b;,
        Lni/m$c;
    }
.end annotation


# instance fields
.field private final f:LUh/c;

.field private final g:LWh/a;

.field private final h:LBh/g0;

.field private final i:LZh/b;

.field private final j:LBh/D;

.field private final k:LBh/u;

.field private final l:LBh/f;

.field private final m:Lli/p;

.field private final n:Z

.field private final o:Lii/l;

.field private final p:Lni/m$b;

.field private final q:LBh/e0;

.field private final r:Lni/m$c;

.field private final s:LBh/m;

.field private final t:Loi/j;

.field private final u:Loi/i;

.field private final v:Loi/j;

.field private final w:Loi/i;

.field private final x:Loi/j;

.field private final y:Lli/N$a;

.field private final z:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;


# direct methods
.method public constructor <init>(Lli/p;LUh/c;LWh/c;LWh/a;LBh/g0;)V
    .locals 8

    const-string v0, "outerContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "classProto"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metadataVersion"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sourceElement"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lli/p;->h()Loi/n;

    move-result-object v0

    invoke-virtual {p2}, LUh/c;->O1()I

    move-result v1

    invoke-static {p3, v1}, Lli/L;->a(LWh/c;I)LZh/b;

    move-result-object v1

    invoke-virtual {v1}, LZh/b;->h()LZh/f;

    move-result-object v1

    invoke-direct {p0, v0, v1}, LDh/a;-><init>(Loi/n;LZh/f;)V

    iput-object p2, p0, Lni/m;->f:LUh/c;

    iput-object p4, p0, Lni/m;->g:LWh/a;

    iput-object p5, p0, Lni/m;->h:LBh/g0;

    invoke-virtual {p2}, LUh/c;->O1()I

    move-result v0

    invoke-static {p3, v0}, Lli/L;->a(LWh/c;I)LZh/b;

    move-result-object v0

    iput-object v0, p0, Lni/m;->i:LZh/b;

    sget-object v0, Lli/O;->a:Lli/O;

    sget-object v1, LWh/b;->e:LWh/b$d;

    invoke-virtual {p2}, LUh/c;->N1()I

    move-result v2

    invoke-virtual {v1, v2}, LWh/b$d;->d(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LUh/k;

    invoke-virtual {v0, v1}, Lli/O;->b(LUh/k;)LBh/D;

    move-result-object v1

    iput-object v1, p0, Lni/m;->j:LBh/D;

    sget-object v1, LWh/b;->d:LWh/b$d;

    invoke-virtual {p2}, LUh/c;->N1()I

    move-result v2

    invoke-virtual {v1, v2}, LWh/b$d;->d(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LUh/x;

    invoke-static {v0, v1}, Lli/P;->a(Lli/O;LUh/x;)LBh/u;

    move-result-object v1

    iput-object v1, p0, Lni/m;->k:LBh/u;

    sget-object v1, LWh/b;->f:LWh/b$d;

    invoke-virtual {p2}, LUh/c;->N1()I

    move-result v2

    invoke-virtual {v1, v2}, LWh/b$d;->d(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LUh/c$c;

    invoke-virtual {v0, v1}, Lli/O;->a(LUh/c$c;)LBh/f;

    move-result-object v0

    iput-object v0, p0, Lni/m;->l:LBh/f;

    invoke-virtual {p2}, LUh/c;->q2()Ljava/util/List;

    move-result-object v3

    const-string v1, "getTypeParameterList(...)"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, LWh/g;

    invoke-virtual {p2}, LUh/c;->r2()LUh/t;

    move-result-object v1

    const-string v2, "getTypeTable(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v5, v1}, LWh/g;-><init>(LUh/t;)V

    sget-object v1, LWh/h;->b:LWh/h$a;

    invoke-virtual {p2}, LUh/c;->t2()LUh/w;

    move-result-object v2

    const-string v4, "getVersionRequirementTable(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, LWh/h$a;->a(LUh/w;)LWh/h;

    move-result-object v6

    move-object v1, p1

    move-object v2, p0

    move-object v4, p3

    move-object v7, p4

    invoke-virtual/range {v1 .. v7}, Lli/p;->a(LBh/m;Ljava/util/List;LWh/c;LWh/g;LWh/h;LWh/a;)Lli/p;

    move-result-object p3

    iput-object p3, p0, Lni/m;->m:Lli/p;

    sget-object p4, LWh/b;->m:LWh/b$b;

    invoke-virtual {p2}, LUh/c;->N1()I

    move-result v1

    invoke-virtual {p4, v1}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object p4

    const-string v1, "get(...)"

    invoke-static {p4, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p4

    iput-boolean p4, p0, Lni/m;->n:Z

    sget-object v1, LBh/f;->ENUM_CLASS:LBh/f;

    if-ne v0, v1, :cond_2

    if-nez p4, :cond_1

    invoke-virtual {p3}, Lli/p;->c()Lli/n;

    move-result-object p4

    invoke-virtual {p4}, Lli/n;->i()Lli/v;

    move-result-object p4

    invoke-interface {p4}, Lli/v;->a()Ljava/lang/Boolean;

    move-result-object p4

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p4, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_0

    goto :goto_0

    :cond_0
    const/4 p4, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p4, 0x1

    :goto_1
    new-instance v2, Lii/q;

    invoke-virtual {p3}, Lli/p;->h()Loi/n;

    move-result-object v3

    invoke-direct {v2, v3, p0, p4}, Lii/q;-><init>(Loi/n;LBh/e;Z)V

    goto :goto_2

    :cond_2
    sget-object v2, Lii/k$b;->b:Lii/k$b;

    :goto_2
    iput-object v2, p0, Lni/m;->o:Lii/l;

    new-instance p4, Lni/m$b;

    invoke-direct {p4, p0}, Lni/m$b;-><init>(Lni/m;)V

    iput-object p4, p0, Lni/m;->p:Lni/m$b;

    sget-object p4, LBh/e0;->e:LBh/e0$a;

    invoke-virtual {p3}, Lli/p;->h()Loi/n;

    move-result-object v2

    invoke-virtual {p3}, Lli/p;->c()Lli/n;

    move-result-object v3

    invoke-virtual {v3}, Lli/n;->n()Lkotlin/reflect/jvm/internal/impl/types/checker/p;

    move-result-object v3

    invoke-interface {v3}, Lkotlin/reflect/jvm/internal/impl/types/checker/p;->d()Lkotlin/reflect/jvm/internal/impl/types/checker/g;

    move-result-object v3

    new-instance v4, Lni/m$f;

    invoke-direct {v4, p0}, Lni/m$f;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p4, p0, v2, v3, v4}, LBh/e0$a;->a(LBh/e;Loi/n;Lkotlin/reflect/jvm/internal/impl/types/checker/g;Lmh/l;)LBh/e0;

    move-result-object p4

    iput-object p4, p0, Lni/m;->q:LBh/e0;

    const/4 p4, 0x0

    if-ne v0, v1, :cond_3

    new-instance v0, Lni/m$c;

    invoke-direct {v0, p0}, Lni/m$c;-><init>(Lni/m;)V

    goto :goto_3

    :cond_3
    move-object v0, p4

    :goto_3
    iput-object v0, p0, Lni/m;->r:Lni/m$c;

    invoke-virtual {p1}, Lli/p;->e()LBh/m;

    move-result-object p1

    iput-object p1, p0, Lni/m;->s:LBh/m;

    invoke-virtual {p3}, Lli/p;->h()Loi/n;

    move-result-object v0

    new-instance v1, Lni/d;

    invoke-direct {v1, p0}, Lni/d;-><init>(Lni/m;)V

    invoke-interface {v0, v1}, Loi/n;->b(Lmh/a;)Loi/j;

    move-result-object v0

    iput-object v0, p0, Lni/m;->t:Loi/j;

    invoke-virtual {p3}, Lli/p;->h()Loi/n;

    move-result-object v0

    new-instance v1, Lni/e;

    invoke-direct {v1, p0}, Lni/e;-><init>(Lni/m;)V

    invoke-interface {v0, v1}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object v0

    iput-object v0, p0, Lni/m;->u:Loi/i;

    invoke-virtual {p3}, Lli/p;->h()Loi/n;

    move-result-object v0

    new-instance v1, Lni/f;

    invoke-direct {v1, p0}, Lni/f;-><init>(Lni/m;)V

    invoke-interface {v0, v1}, Loi/n;->b(Lmh/a;)Loi/j;

    move-result-object v0

    iput-object v0, p0, Lni/m;->v:Loi/j;

    invoke-virtual {p3}, Lli/p;->h()Loi/n;

    move-result-object v0

    new-instance v1, Lni/g;

    invoke-direct {v1, p0}, Lni/g;-><init>(Lni/m;)V

    invoke-interface {v0, v1}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object v0

    iput-object v0, p0, Lni/m;->w:Loi/i;

    invoke-virtual {p3}, Lli/p;->h()Loi/n;

    move-result-object v0

    new-instance v1, Lni/h;

    invoke-direct {v1, p0}, Lni/h;-><init>(Lni/m;)V

    invoke-interface {v0, v1}, Loi/n;->b(Lmh/a;)Loi/j;

    move-result-object v0

    iput-object v0, p0, Lni/m;->x:Loi/j;

    new-instance v0, Lli/N$a;

    invoke-virtual {p3}, Lli/p;->g()LWh/c;

    move-result-object v3

    invoke-virtual {p3}, Lli/p;->j()LWh/g;

    move-result-object v4

    instance-of v1, p1, Lni/m;

    if-eqz v1, :cond_4

    check-cast p1, Lni/m;

    goto :goto_4

    :cond_4
    move-object p1, p4

    :goto_4
    if-eqz p1, :cond_5

    iget-object p4, p1, Lni/m;->y:Lli/N$a;

    :cond_5
    move-object v6, p4

    move-object v1, v0

    move-object v2, p2

    move-object v5, p5

    invoke-direct/range {v1 .. v6}, Lli/N$a;-><init>(LUh/c;LWh/c;LWh/g;LBh/g0;Lli/N$a;)V

    iput-object v0, p0, Lni/m;->y:Lli/N$a;

    sget-object p1, LWh/b;->c:LWh/b$b;

    invoke-virtual {p2}, LUh/c;->N1()I

    move-result p2

    invoke-virtual {p1, p2}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_6

    sget-object p1, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->b()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object p1

    goto :goto_5

    :cond_6
    new-instance p1, Lni/T;

    invoke-virtual {p3}, Lli/p;->h()Loi/n;

    move-result-object p2

    new-instance p3, Lni/i;

    invoke-direct {p3, p0}, Lni/i;-><init>(Lni/m;)V

    invoke-direct {p1, p2, p3}, Lni/T;-><init>(Loi/n;Lmh/a;)V

    :goto_5
    iput-object p1, p0, Lni/m;->z:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    return-void
.end method

.method public static final synthetic K0(Lni/m;)LZh/b;
    .locals 0

    iget-object p0, p0, Lni/m;->i:LZh/b;

    return-object p0
.end method

.method public static final synthetic L0(Lni/m;)Lni/m$c;
    .locals 0

    iget-object p0, p0, Lni/m;->r:Lni/m$c;

    return-object p0
.end method

.method public static final synthetic M0(Lni/m;)Lni/m$b;
    .locals 0

    iget-object p0, p0, Lni/m;->p:Lni/m$b;

    return-object p0
.end method

.method public static final synthetic N0(Lni/m;LZh/f;)Lpi/d0;
    .locals 0

    invoke-direct {p0, p1}, Lni/m;->j1(LZh/f;)Lpi/d0;

    move-result-object p0

    return-object p0
.end method

.method static synthetic O0(Lni/m;)LBh/d;
    .locals 0

    invoke-static {p0}, Lni/m;->l1(Lni/m;)LBh/d;

    move-result-object p0

    return-object p0
.end method

.method static synthetic P0(Lni/m;)Ljava/util/Collection;
    .locals 0

    invoke-static {p0}, Lni/m;->c1(Lni/m;)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method static synthetic Q0(Lni/m;)LBh/e;
    .locals 0

    invoke-static {p0}, Lni/m;->V0(Lni/m;)LBh/e;

    move-result-object p0

    return-object p0
.end method

.method static synthetic R0(Lni/m;)Ljava/util/Collection;
    .locals 0

    invoke-static {p0}, Lni/m;->m1(Lni/m;)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method static synthetic S0(Lni/m;)LBh/q0;
    .locals 0

    invoke-static {p0}, Lni/m;->n1(Lni/m;)LBh/q0;

    move-result-object p0

    return-object p0
.end method

.method static synthetic T0(Lni/m;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lni/m;->U0(Lni/m;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final U0(Lni/m;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lni/m;->m:Lli/p;

    invoke-virtual {v0}, Lli/p;->c()Lli/n;

    move-result-object v0

    invoke-virtual {v0}, Lli/n;->d()Lli/e;

    move-result-object v0

    iget-object p0, p0, Lni/m;->y:Lli/N$a;

    invoke-interface {v0, p0}, Lli/h;->a(Lli/N$a;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final V0(Lni/m;)LBh/e;
    .locals 0

    invoke-direct {p0}, Lni/m;->W0()LBh/e;

    move-result-object p0

    return-object p0
.end method

.method private final W0()LBh/e;
    .locals 4

    iget-object v0, p0, Lni/m;->f:LUh/c;

    invoke-virtual {v0}, LUh/c;->u2()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget-object v0, p0, Lni/m;->m:Lli/p;

    invoke-virtual {v0}, Lli/p;->g()LWh/c;

    move-result-object v0

    iget-object v2, p0, Lni/m;->f:LUh/c;

    invoke-virtual {v2}, LUh/c;->A1()I

    move-result v2

    invoke-static {v0, v2}, Lli/L;->b(LWh/c;I)LZh/f;

    move-result-object v0

    invoke-direct {p0}, Lni/m;->f1()Lni/m$a;

    move-result-object v2

    sget-object v3, LIh/d;->FROM_DESERIALIZATION:LIh/d;

    invoke-virtual {v2, v0, v3}, Lni/m$a;->g(LZh/f;LIh/b;)LBh/h;

    move-result-object v0

    instance-of v2, v0, LBh/e;

    if-eqz v2, :cond_1

    move-object v1, v0

    check-cast v1, LBh/e;

    :cond_1
    return-object v1
.end method

.method private final X0()Ljava/util/Collection;
    .locals 2

    invoke-direct {p0}, Lni/m;->Z0()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {p0}, Lni/m;->P()LBh/d;

    move-result-object v1

    invoke-static {v1}, LZg/v;->p(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, LZg/v;->M0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    iget-object v1, p0, Lni/m;->m:Lli/p;

    invoke-virtual {v1}, Lli/p;->c()Lli/n;

    move-result-object v1

    invoke-virtual {v1}, Lli/n;->c()LCh/a;

    move-result-object v1

    invoke-interface {v1, p0}, LCh/a;->a(LBh/e;)Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, LZg/v;->M0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method private final Y0()LBh/d;
    .locals 5

    iget-object v0, p0, Lni/m;->l:LBh/f;

    invoke-virtual {v0}, LBh/f;->isSingleton()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, LBh/g0;->a:LBh/g0;

    invoke-static {p0, v0}, Lbi/h;->l(LBh/e;LBh/g0;)LDh/i;

    move-result-object v0

    invoke-virtual {p0}, LDh/a;->u()Lpi/d0;

    move-result-object v1

    invoke-virtual {v0, v1}, LDh/s;->g1(Lpi/S;)V

    return-object v0

    :cond_0
    iget-object v0, p0, Lni/m;->f:LUh/c;

    invoke-virtual {v0}, LUh/c;->D1()Ljava/util/List;

    move-result-object v0

    const-string v1, "getConstructorList(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, LUh/d;

    sget-object v4, LWh/b;->n:LWh/b$b;

    invoke-virtual {v3}, LUh/d;->T0()I

    move-result v3

    invoke-virtual {v4, v3}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_2
    move-object v1, v2

    :goto_0
    check-cast v1, LUh/d;

    if-eqz v1, :cond_3

    iget-object v0, p0, Lni/m;->m:Lli/p;

    invoke-virtual {v0}, Lli/p;->f()Lli/K;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lli/K;->r(LUh/d;Z)LBh/d;

    move-result-object v2

    :cond_3
    return-object v2
.end method

.method private final Z0()Ljava/util/List;
    .locals 5

    iget-object v0, p0, Lni/m;->f:LUh/c;

    invoke-virtual {v0}, LUh/c;->D1()Ljava/util/List;

    move-result-object v0

    const-string v1, "getConstructorList(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

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

    move-object v3, v2

    check-cast v3, LUh/d;

    sget-object v4, LWh/b;->n:LWh/b$b;

    invoke-virtual {v3}, LUh/d;->T0()I

    move-result v3

    invoke-virtual {v4, v3}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v3

    const-string v4, "get(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v1, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LUh/d;

    iget-object v3, p0, Lni/m;->m:Lli/p;

    invoke-virtual {v3}, Lli/p;->f()Lli/K;

    move-result-object v3

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    const/4 v4, 0x0

    invoke-virtual {v3, v2, v4}, Lli/K;->r(LUh/d;Z)LBh/d;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    return-object v0
.end method

.method private final a1()Ljava/util/Collection;
    .locals 5

    iget-object v0, p0, Lni/m;->j:LBh/D;

    sget-object v1, LBh/D;->SEALED:LBh/D;

    if-eq v0, v1, :cond_0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0

    :cond_0
    iget-object v0, p0, Lni/m;->f:LUh/c;

    invoke-virtual {v0}, LUh/c;->g2()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    iget-object v3, p0, Lni/m;->m:Lli/p;

    invoke-virtual {v3}, Lli/p;->c()Lli/n;

    move-result-object v3

    iget-object v4, p0, Lni/m;->m:Lli/p;

    invoke-virtual {v4}, Lli/p;->g()LWh/c;

    move-result-object v4

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v4, v2}, Lli/L;->a(LWh/c;I)LZh/b;

    move-result-object v2

    invoke-virtual {v3, v2}, Lli/n;->b(LZh/b;)LBh/e;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v1

    :cond_3
    sget-object v0, Lbi/a;->a:Lbi/a;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Lbi/a;->a(LBh/e;Z)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method private final b1()LBh/q0;
    .locals 6

    invoke-virtual {p0}, Lni/m;->isInline()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lni/m;->o()Z

    move-result v0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget-object v0, p0, Lni/m;->f:LUh/c;

    iget-object v2, p0, Lni/m;->m:Lli/p;

    invoke-virtual {v2}, Lli/p;->g()LWh/c;

    move-result-object v2

    iget-object v3, p0, Lni/m;->m:Lli/p;

    invoke-virtual {v3}, Lli/p;->j()LWh/g;

    move-result-object v3

    new-instance v4, Lni/m$d;

    iget-object v5, p0, Lni/m;->m:Lli/p;

    invoke-virtual {v5}, Lli/p;->i()Lli/X;

    move-result-object v5

    invoke-direct {v4, v5}, Lni/m$d;-><init>(Ljava/lang/Object;)V

    new-instance v5, Lni/m$e;

    invoke-direct {v5, p0}, Lni/m$e;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, v2, v3, v4, v5}, Lli/Z;->a(LUh/c;LWh/c;LWh/g;Lmh/l;Lmh/l;)LBh/q0;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    iget-object v0, p0, Lni/m;->g:LWh/a;

    const/4 v2, 0x5

    const/4 v3, 0x1

    invoke-virtual {v0, v3, v2, v3}, LWh/a;->c(III)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p0}, Lni/m;->P()LBh/d;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-interface {v0}, LBh/a;->i()Ljava/util/List;

    move-result-object v0

    const-string v1, "getValueParameters(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LZg/v;->q0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LBh/s0;

    invoke-interface {v0}, LBh/I;->getName()LZh/f;

    move-result-object v0

    const-string v1, "getName(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lni/m;->j1(LZh/f;)Lpi/d0;

    move-result-object v1

    if-eqz v1, :cond_2

    new-instance v2, LBh/A;

    invoke-direct {v2, v0, v1}, LBh/A;-><init>(LZh/f;Lri/j;)V

    return-object v2

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Value class has no underlying property: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Inline class has no primary constructor: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    return-object v1
.end method

.method private static final c1(Lni/m;)Ljava/util/Collection;
    .locals 0

    invoke-direct {p0}, Lni/m;->X0()Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method private final f1()Lni/m$a;
    .locals 2

    iget-object v0, p0, Lni/m;->q:LBh/e0;

    iget-object v1, p0, Lni/m;->m:Lli/p;

    invoke-virtual {v1}, Lli/p;->c()Lli/n;

    move-result-object v1

    invoke-virtual {v1}, Lli/n;->n()Lkotlin/reflect/jvm/internal/impl/types/checker/p;

    move-result-object v1

    invoke-interface {v1}, Lkotlin/reflect/jvm/internal/impl/types/checker/p;->d()Lkotlin/reflect/jvm/internal/impl/types/checker/g;

    move-result-object v1

    invoke-virtual {v0, v1}, LBh/e0;->c(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lii/k;

    move-result-object v0

    check-cast v0, Lni/m$a;

    return-object v0
.end method

.method private final j1(LZh/f;)Lpi/d0;
    .locals 5

    invoke-direct {p0}, Lni/m;->f1()Lni/m$a;

    move-result-object v0

    sget-object v1, LIh/d;->FROM_DESERIALIZATION:LIh/d;

    invoke-virtual {v0, p1, v1}, Lni/m$a;->d(LZh/f;LIh/b;)Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    move-object v2, v0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, LBh/Y;

    invoke-interface {v4}, LBh/a;->k0()LBh/b0;

    move-result-object v4

    if-nez v4, :cond_0

    if-eqz v1, :cond_1

    :goto_1
    move-object v2, v0

    goto :goto_2

    :cond_1
    const/4 v1, 0x1

    move-object v2, v3

    goto :goto_0

    :cond_2
    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    :goto_2
    check-cast v2, LBh/Y;

    if-eqz v2, :cond_4

    invoke-interface {v2}, LBh/r0;->getType()Lpi/S;

    move-result-object v0

    :cond_4
    check-cast v0, Lpi/d0;

    return-object v0
.end method

.method private static final l1(Lni/m;)LBh/d;
    .locals 0

    invoke-direct {p0}, Lni/m;->Y0()LBh/d;

    move-result-object p0

    return-object p0
.end method

.method private static final m1(Lni/m;)Ljava/util/Collection;
    .locals 0

    invoke-direct {p0}, Lni/m;->a1()Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method private static final n1(Lni/m;)LBh/q0;
    .locals 0

    invoke-direct {p0}, Lni/m;->b1()LBh/q0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public D()Z
    .locals 2

    sget-object v0, LWh/b;->l:LWh/b$b;

    iget-object v1, p0, Lni/m;->f:LUh/c;

    invoke-virtual {v1}, LUh/c;->N1()I

    move-result v1

    invoke-virtual {v0, v1}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "get(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public F0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public H0()Ljava/util/List;
    .locals 7

    iget-object v0, p0, Lni/m;->f:LUh/c;

    iget-object v1, p0, Lni/m;->m:Lli/p;

    invoke-virtual {v1}, Lli/p;->j()LWh/g;

    move-result-object v1

    invoke-static {v0, v1}, LWh/f;->b(LUh/c;LWh/g;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LUh/q;

    iget-object v3, p0, Lni/m;->m:Lli/p;

    invoke-virtual {v3}, Lli/p;->i()Lli/X;

    move-result-object v3

    invoke-virtual {v3, v2}, Lli/X;->u(LUh/q;)Lpi/S;

    move-result-object v2

    new-instance v3, LDh/N;

    invoke-virtual {p0}, LDh/a;->J0()LBh/b0;

    move-result-object v4

    new-instance v5, Lji/b;

    const/4 v6, 0x0

    invoke-direct {v5, p0, v2, v6, v6}, Lji/b;-><init>(LBh/e;Lpi/S;LZh/f;Lji/g;)V

    sget-object v2, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-virtual {v2}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->b()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v2

    invoke-direct {v3, v4, v5, v2}, LDh/N;-><init>(LBh/m;Lji/g;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)V

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public I0()Z
    .locals 2

    sget-object v0, LWh/b;->h:LWh/b$b;

    iget-object v1, p0, Lni/m;->f:LUh/c;

    invoke-virtual {v1}, LUh/c;->N1()I

    move-result v1

    invoke-virtual {v0, v1}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "get(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public L()Z
    .locals 2

    sget-object v0, LWh/b;->j:LWh/b$b;

    iget-object v1, p0, Lni/m;->f:LUh/c;

    invoke-virtual {v1}, LUh/c;->N1()I

    move-result v1

    invoke-virtual {v0, v1}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "get(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public M()Z
    .locals 2

    sget-object v0, LWh/b;->g:LWh/b$b;

    iget-object v1, p0, Lni/m;->f:LUh/c;

    invoke-virtual {v1}, LUh/c;->N1()I

    move-result v1

    invoke-virtual {v0, v1}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "get(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public P()LBh/d;
    .locals 1

    iget-object v0, p0, Lni/m;->t:Loi/j;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LBh/d;

    return-object v0
.end method

.method public bridge synthetic Q()Lii/k;
    .locals 1

    invoke-virtual {p0}, Lni/m;->h1()Lii/l;

    move-result-object v0

    return-object v0
.end method

.method public S()LBh/e;
    .locals 1

    iget-object v0, p0, Lni/m;->v:Loi/j;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LBh/e;

    return-object v0
.end method

.method public b()LBh/m;
    .locals 1

    iget-object v0, p0, Lni/m;->s:LBh/m;

    return-object v0
.end method

.method public final d1()Lli/p;
    .locals 1

    iget-object v0, p0, Lni/m;->m:Lli/p;

    return-object v0
.end method

.method public final e1()LUh/c;
    .locals 1

    iget-object v0, p0, Lni/m;->f:LUh/c;

    return-object v0
.end method

.method public final g1()LWh/a;
    .locals 1

    iget-object v0, p0, Lni/m;->g:LWh/a;

    return-object v0
.end method

.method public getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;
    .locals 1

    iget-object v0, p0, Lni/m;->z:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    return-object v0
.end method

.method public getVisibility()LBh/u;
    .locals 1

    iget-object v0, p0, Lni/m;->k:LBh/u;

    return-object v0
.end method

.method public h()LBh/f;
    .locals 1

    iget-object v0, p0, Lni/m;->l:LBh/f;

    return-object v0
.end method

.method public h1()Lii/l;
    .locals 1

    iget-object v0, p0, Lni/m;->o:Lii/l;

    return-object v0
.end method

.method protected i0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lii/k;
    .locals 1

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lni/m;->q:LBh/e0;

    invoke-virtual {v0, p1}, LBh/e0;->c(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lii/k;

    move-result-object p1

    return-object p1
.end method

.method public final i1()Lli/N$a;
    .locals 1

    iget-object v0, p0, Lni/m;->y:Lli/N$a;

    return-object v0
.end method

.method public isExternal()Z
    .locals 2

    sget-object v0, LWh/b;->i:LWh/b$b;

    iget-object v1, p0, Lni/m;->f:LUh/c;

    invoke-virtual {v1}, LUh/c;->N1()I

    move-result v1

    invoke-virtual {v0, v1}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "get(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isInline()Z
    .locals 3

    sget-object v0, LWh/b;->k:LWh/b$b;

    iget-object v1, p0, Lni/m;->f:LUh/c;

    invoke-virtual {v1}, LUh/c;->N1()I

    move-result v1

    invoke-virtual {v0, v1}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lni/m;->g:LWh/a;

    const/4 v1, 0x4

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1, v2}, LWh/a;->e(III)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    return v2
.end method

.method public j()LBh/g0;
    .locals 1

    iget-object v0, p0, Lni/m;->h:LBh/g0;

    return-object v0
.end method

.method public k()Lpi/v0;
    .locals 1

    iget-object v0, p0, Lni/m;->p:Lni/m$b;

    return-object v0
.end method

.method public final k1(LZh/f;)Z
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lni/m;->f1()Lni/m$a;

    move-result-object v0

    invoke-virtual {v0}, Lni/w;->t()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public l()LBh/D;
    .locals 1

    iget-object v0, p0, Lni/m;->j:LBh/D;

    return-object v0
.end method

.method public m()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, Lni/m;->u:Loi/i;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public n()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, Lni/m;->w:Loi/i;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public o()Z
    .locals 4

    sget-object v0, LWh/b;->k:LWh/b$b;

    iget-object v1, p0, Lni/m;->f:LUh/c;

    invoke-virtual {v1}, LUh/c;->N1()I

    move-result v1

    invoke-virtual {v0, v1}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lni/m;->g:LWh/a;

    const/4 v1, 0x4

    const/4 v2, 0x2

    const/4 v3, 0x1

    invoke-virtual {v0, v3, v1, v2}, LWh/a;->c(III)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    return v3
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "deserialized "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lni/m;->L()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "expect "

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "class "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LDh/a;->getName()LZh/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public w()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lni/m;->m:Lli/p;

    invoke-virtual {v0}, Lli/p;->i()Lli/X;

    move-result-object v0

    invoke-virtual {v0}, Lli/X;->m()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public z()Z
    .locals 2

    sget-object v0, LWh/b;->f:LWh/b$d;

    iget-object v1, p0, Lni/m;->f:LUh/c;

    invoke-virtual {v1}, LUh/c;->N1()I

    move-result v1

    invoke-virtual {v0, v1}, LWh/b$d;->d(I)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LUh/c$c;->COMPANION_OBJECT:LUh/c$c;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public z0()LBh/q0;
    .locals 1

    iget-object v0, p0, Lni/m;->x:Loi/j;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LBh/q0;

    return-object v0
.end method
