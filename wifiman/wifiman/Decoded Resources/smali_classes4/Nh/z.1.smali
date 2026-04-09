.class public final LNh/z;
.super LNh/U;
.source "SourceFile"


# instance fields
.field private final n:LBh/e;

.field private final o:LQh/g;

.field private final p:Z

.field private final q:Loi/i;

.field private final r:Loi/i;

.field private final s:Loi/i;

.field private final t:Loi/i;

.field private final u:Loi/h;


# direct methods
.method public constructor <init>(LMh/k;LBh/e;LQh/g;ZLNh/z;)V
    .locals 1

    const-string v0, "c"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownerDescriptor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jClass"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p5}, LNh/U;-><init>(LMh/k;LNh/U;)V

    .line 3
    iput-object p2, p0, LNh/z;->n:LBh/e;

    .line 4
    iput-object p3, p0, LNh/z;->o:LQh/g;

    .line 5
    iput-boolean p4, p0, LNh/z;->p:Z

    .line 6
    invoke-virtual {p1}, LMh/k;->e()Loi/n;

    move-result-object p2

    new-instance p3, LNh/p;

    invoke-direct {p3, p0, p1}, LNh/p;-><init>(LNh/z;LMh/k;)V

    invoke-interface {p2, p3}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p2

    iput-object p2, p0, LNh/z;->q:Loi/i;

    .line 7
    invoke-virtual {p1}, LMh/k;->e()Loi/n;

    move-result-object p2

    new-instance p3, LNh/q;

    invoke-direct {p3, p0}, LNh/q;-><init>(LNh/z;)V

    invoke-interface {p2, p3}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p2

    iput-object p2, p0, LNh/z;->r:Loi/i;

    .line 8
    invoke-virtual {p1}, LMh/k;->e()Loi/n;

    move-result-object p2

    new-instance p3, LNh/r;

    invoke-direct {p3, p1, p0}, LNh/r;-><init>(LMh/k;LNh/z;)V

    invoke-interface {p2, p3}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p2

    iput-object p2, p0, LNh/z;->s:Loi/i;

    .line 9
    invoke-virtual {p1}, LMh/k;->e()Loi/n;

    move-result-object p2

    new-instance p3, LNh/s;

    invoke-direct {p3, p0}, LNh/s;-><init>(LNh/z;)V

    invoke-interface {p2, p3}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p2

    iput-object p2, p0, LNh/z;->t:Loi/i;

    .line 10
    invoke-virtual {p1}, LMh/k;->e()Loi/n;

    move-result-object p2

    new-instance p3, LNh/t;

    invoke-direct {p3, p0, p1}, LNh/t;-><init>(LNh/z;LMh/k;)V

    invoke-interface {p2, p3}, Loi/n;->i(Lmh/l;)Loi/h;

    move-result-object p1

    iput-object p1, p0, LNh/z;->u:Loi/h;

    return-void
.end method

.method public synthetic constructor <init>(LMh/k;LBh/e;LQh/g;ZLNh/z;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    .line 1
    invoke-direct/range {v0 .. v5}, LNh/z;-><init>(LMh/k;LBh/e;LQh/g;ZLNh/z;)V

    return-void
.end method

.method private static final A0(LNh/z;LZh/f;)Ljava/util/Collection;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LNh/z;->q1(LZh/f;)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method private static final B0(LNh/z;LZh/f;)Ljava/util/Collection;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LNh/z;->r1(LZh/f;)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method private final C0()Ljava/util/Collection;
    .locals 2

    iget-boolean v0, p0, LNh/z;->p:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LNh/z;->c1()LBh/e;

    move-result-object v0

    invoke-interface {v0}, LBh/h;->k()Lpi/v0;

    move-result-object v0

    invoke-interface {v0}, Lpi/v0;->a()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "getSupertypes(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_0
    invoke-virtual {p0}, LNh/U;->L()LMh/k;

    move-result-object v0

    invoke-virtual {v0}, LMh/k;->a()LMh/d;

    move-result-object v0

    invoke-virtual {v0}, LMh/d;->k()Lkotlin/reflect/jvm/internal/impl/types/checker/p;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/reflect/jvm/internal/impl/types/checker/p;->d()Lkotlin/reflect/jvm/internal/impl/types/checker/g;

    move-result-object v0

    invoke-virtual {p0}, LNh/z;->c1()LBh/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/reflect/jvm/internal/impl/types/checker/g;->g(LBh/e;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method private static final D0(LNh/z;LMh/k;)Ljava/util/List;
    .locals 8

    iget-object v0, p0, LNh/z;->o:LQh/g;

    invoke-interface {v0}, LQh/g;->m()Ljava/util/Collection;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LQh/k;

    invoke-direct {p0, v2}, LNh/z;->o1(LQh/k;)LLh/b;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, LNh/z;->o:LQh/g;

    invoke-interface {v0}, LQh/g;->p()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-direct {p0}, LNh/z;->G0()LBh/d;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v0, v2, v2, v3, v4}, LSh/C;->c(LBh/z;ZZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LBh/d;

    invoke-static {v7, v2, v2, v3, v4}, LSh/C;->c(LBh/z;ZZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v5}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    goto :goto_2

    :cond_3
    :goto_1
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, LMh/k;->a()LMh/d;

    move-result-object v2

    invoke-virtual {v2}, LMh/d;->h()LKh/j;

    move-result-object v2

    iget-object v3, p0, LNh/z;->o:LQh/g;

    invoke-interface {v2, v3, v0}, LKh/j;->c(LQh/l;LBh/l;)V

    :cond_4
    :goto_2
    invoke-virtual {p1}, LMh/k;->a()LMh/d;

    move-result-object v0

    invoke-virtual {v0}, LMh/d;->w()Lgi/f;

    move-result-object v0

    invoke-virtual {p0}, LNh/z;->c1()LBh/e;

    move-result-object v2

    invoke-interface {v0, v2, v1, p1}, Lgi/f;->a(LBh/e;Ljava/util/List;LMh/k;)V

    invoke-virtual {p1}, LMh/k;->a()LMh/d;

    move-result-object v0

    invoke-virtual {v0}, LMh/d;->r()LRh/e0;

    move-result-object v0

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-direct {p0}, LNh/z;->F0()LBh/d;

    move-result-object p0

    invoke-static {p0}, LZg/v;->p(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    move-object v1, p0

    check-cast v1, Ljava/util/Collection;

    :cond_5
    invoke-virtual {v0, p1, v1}, LRh/e0;->p(LMh/k;Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private final E0(LDh/i;)Ljava/util/List;
    .locals 12

    iget-object v0, p0, LNh/z;->o:LQh/g;

    invoke-interface {v0}, LQh/g;->M()Ljava/util/Collection;

    move-result-object v0

    new-instance v8, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-direct {v8, v1}, Ljava/util/ArrayList;-><init>(I)V

    sget-object v2, Lpi/I0;->COMMON:Lpi/I0;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, LOh/b;->b(Lpi/I0;ZZLBh/l0;ILjava/lang/Object;)LOh/a;

    move-result-object v9

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, LQh/r;

    invoke-interface {v4}, LQh/t;->getName()LZh/f;

    move-result-object v4

    sget-object v5, LJh/I;->c:LZh/f;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v0, LYg/s;

    invoke-direct {v0, v1, v2}, LYg/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-virtual {v0}, LYg/s;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    invoke-static {v1}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    check-cast v10, LQh/r;

    const/4 v11, 0x1

    if-eqz v10, :cond_3

    invoke-interface {v10}, LQh/r;->getReturnType()LQh/x;

    move-result-object v1

    instance-of v2, v1, LQh/f;

    if-eqz v2, :cond_2

    new-instance v2, LYg/s;

    invoke-virtual {p0}, LNh/U;->L()LMh/k;

    move-result-object v3

    invoke-virtual {v3}, LMh/k;->g()LOh/e;

    move-result-object v3

    check-cast v1, LQh/f;

    invoke-virtual {v3, v1, v9, v11}, LOh/e;->l(LQh/f;LOh/a;Z)Lpi/S;

    move-result-object v3

    invoke-virtual {p0}, LNh/U;->L()LMh/k;

    move-result-object v4

    invoke-virtual {v4}, LMh/k;->g()LOh/e;

    move-result-object v4

    invoke-interface {v1}, LQh/f;->k()LQh/x;

    move-result-object v1

    invoke-virtual {v4, v1, v9}, LOh/e;->p(LQh/x;LOh/a;)Lpi/S;

    move-result-object v1

    invoke-direct {v2, v3, v1}, LYg/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    new-instance v2, LYg/s;

    invoke-virtual {p0}, LNh/U;->L()LMh/k;

    move-result-object v3

    invoke-virtual {v3}, LMh/k;->g()LOh/e;

    move-result-object v3

    invoke-virtual {v3, v1, v9}, LOh/e;->p(LQh/x;LOh/a;)Lpi/S;

    move-result-object v1

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3}, LYg/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_1
    invoke-virtual {v2}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lpi/S;

    invoke-virtual {v2}, LYg/s;->c()Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lpi/S;

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, v8

    move-object v3, p1

    move-object v5, v10

    invoke-direct/range {v1 .. v7}, LNh/z;->s0(Ljava/util/List;LBh/l;ILQh/r;Lpi/S;Lpi/S;)V

    :cond_3
    const/4 v1, 0x0

    if-eqz v10, :cond_4

    goto :goto_2

    :cond_4
    move v11, v1

    :goto_2
    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    add-int/lit8 v10, v1, 0x1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, LQh/r;

    invoke-virtual {p0}, LNh/U;->L()LMh/k;

    move-result-object v2

    invoke-virtual {v2}, LMh/k;->g()LOh/e;

    move-result-object v2

    invoke-interface {v5}, LQh/r;->getReturnType()LQh/x;

    move-result-object v3

    invoke-virtual {v2, v3, v9}, LOh/e;->p(LQh/x;LOh/a;)Lpi/S;

    move-result-object v6

    add-int v4, v1, v11

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, v8

    move-object v3, p1

    invoke-direct/range {v1 .. v7}, LNh/z;->s0(Ljava/util/List;LBh/l;ILQh/r;Lpi/S;Lpi/S;)V

    move v1, v10

    goto :goto_3

    :cond_5
    return-object v8
.end method

.method private final F0()LBh/d;
    .locals 5

    iget-object v0, p0, LNh/z;->o:LQh/g;

    invoke-interface {v0}, LQh/g;->n()Z

    move-result v0

    iget-object v1, p0, LNh/z;->o:LQh/g;

    invoke-interface {v1}, LQh/g;->H()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, LNh/z;->o:LQh/g;

    invoke-interface {v1}, LQh/g;->t()Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    if-nez v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    invoke-virtual {p0}, LNh/z;->c1()LBh/e;

    move-result-object v1

    sget-object v2, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-virtual {v2}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->b()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v2

    invoke-virtual {p0}, LNh/U;->L()LMh/k;

    move-result-object v3

    invoke-virtual {v3}, LMh/k;->a()LMh/d;

    move-result-object v3

    invoke-virtual {v3}, LMh/d;->t()LPh/b;

    move-result-object v3

    iget-object v4, p0, LNh/z;->o:LQh/g;

    invoke-interface {v3, v4}, LPh/b;->a(LQh/l;)LPh/a;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v1, v2, v4, v3}, LLh/b;->t1(LBh/e;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;ZLBh/g0;)LLh/b;

    move-result-object v2

    const-string v3, "createJavaConstructor(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v0, :cond_2

    invoke-direct {p0, v2}, LNh/z;->E0(LDh/i;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_2
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    :goto_0
    const/4 v3, 0x0

    invoke-virtual {v2, v3}, LLh/b;->Z0(Z)V

    invoke-direct {p0, v1}, LNh/z;->Z0(LBh/e;)LBh/u;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, LDh/i;->q1(Ljava/util/List;LBh/u;)LDh/i;

    invoke-virtual {v2, v4}, LLh/b;->Y0(Z)V

    invoke-interface {v1}, LBh/e;->u()Lpi/d0;

    move-result-object v0

    invoke-virtual {v2, v0}, LDh/s;->g1(Lpi/S;)V

    invoke-virtual {p0}, LNh/U;->L()LMh/k;

    move-result-object v0

    invoke-virtual {v0}, LMh/k;->a()LMh/d;

    move-result-object v0

    invoke-virtual {v0}, LMh/d;->h()LKh/j;

    move-result-object v0

    iget-object v1, p0, LNh/z;->o:LQh/g;

    invoke-interface {v0, v1, v2}, LKh/j;->c(LQh/l;LBh/l;)V

    return-object v2
.end method

.method private final G0()LBh/d;
    .locals 5

    invoke-virtual {p0}, LNh/z;->c1()LBh/e;

    move-result-object v0

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->b()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v1

    invoke-virtual {p0}, LNh/U;->L()LMh/k;

    move-result-object v2

    invoke-virtual {v2}, LMh/k;->a()LMh/d;

    move-result-object v2

    invoke-virtual {v2}, LMh/d;->t()LPh/b;

    move-result-object v2

    iget-object v3, p0, LNh/z;->o:LQh/g;

    invoke-interface {v2, v3}, LPh/b;->a(LQh/l;)LPh/a;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v0, v1, v3, v2}, LLh/b;->t1(LBh/e;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;ZLBh/g0;)LLh/b;

    move-result-object v1

    const-string v2, "createJavaConstructor(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v1}, LNh/z;->M0(LDh/i;)Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, LLh/b;->Z0(Z)V

    invoke-direct {p0, v0}, LNh/z;->Z0(LBh/e;)LBh/u;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, LDh/i;->q1(Ljava/util/List;LBh/u;)LDh/i;

    invoke-virtual {v1, v3}, LLh/b;->Y0(Z)V

    invoke-interface {v0}, LBh/e;->u()Lpi/d0;

    move-result-object v0

    invoke-virtual {v1, v0}, LDh/s;->g1(Lpi/S;)V

    return-object v1
.end method

.method private final H0(LBh/f0;LBh/a;Ljava/util/Collection;)LBh/f0;
    .locals 2

    check-cast p3, Ljava/lang/Iterable;

    instance-of v0, p3, Ljava/util/Collection;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LBh/f0;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {v0}, LBh/z;->a0()LBh/z;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-direct {p0, v0, p2}, LNh/z;->Q0(LBh/a;LBh/a;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, LBh/f0;->v()LBh/z$a;

    move-result-object p1

    invoke-interface {p1}, LBh/z$a;->q()LBh/z$a;

    move-result-object p1

    invoke-interface {p1}, LBh/z$a;->a()LBh/z;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast p1, LBh/f0;

    :cond_2
    :goto_0
    return-object p1
.end method

.method private final I0(LBh/z;Lmh/l;)LBh/f0;
    .locals 5

    invoke-interface {p1}, LBh/I;->getName()LZh/f;

    move-result-object v0

    const-string v1, "getName(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LBh/f0;

    invoke-direct {p0, v2, p1}, LNh/z;->e1(LBh/f0;LBh/z;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    check-cast v0, LBh/f0;

    if-eqz v0, :cond_3

    invoke-interface {v0}, LBh/f0;->v()LBh/z$a;

    move-result-object p2

    invoke-interface {p1}, LBh/a;->i()Ljava/util/List;

    move-result-object v1

    const-string v2, "getValueParameters(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LBh/s0;

    invoke-interface {v4}, LBh/r0;->getType()Lpi/S;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-interface {v0}, LBh/a;->i()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/Collection;

    invoke-static {v3, v0, p1}, LLh/h;->a(Ljava/util/Collection;Ljava/util/Collection;LBh/a;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p2, p1}, LBh/z$a;->d(Ljava/util/List;)LBh/z$a;

    invoke-interface {p2}, LBh/z$a;->u()LBh/z$a;

    invoke-interface {p2}, LBh/z$a;->i()LBh/z$a;

    sget-object p1, LLh/e;->H:LBh/a$a;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p2, p1, v0}, LBh/z$a;->k(LBh/a$a;Ljava/lang/Object;)LBh/z$a;

    invoke-interface {p2}, LBh/z$a;->a()LBh/z;

    move-result-object p1

    move-object v1, p1

    check-cast v1, LBh/f0;

    :cond_3
    return-object v1
.end method

.method private final J0(LBh/Y;Lmh/l;)LLh/f;
    .locals 11

    invoke-direct {p0, p1, p2}, LNh/z;->P0(LBh/Y;Lmh/l;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-direct {p0, p1, p2}, LNh/z;->W0(LBh/Y;Lmh/l;)LBh/f0;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {p1}, LBh/t0;->h0()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-direct {p0, p1, p2}, LNh/z;->X0(LBh/Y;Lmh/l;)LBh/f0;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    move-object p2, v1

    :goto_0
    if-eqz p2, :cond_2

    invoke-interface {p2}, LBh/C;->l()LBh/D;

    invoke-interface {v0}, LBh/C;->l()LBh/D;

    :cond_2
    new-instance v10, LLh/d;

    invoke-virtual {p0}, LNh/z;->c1()LBh/e;

    move-result-object v2

    invoke-direct {v10, v2, v0, p2, p1}, LLh/d;-><init>(LBh/e;LBh/f0;LBh/f0;LBh/Y;)V

    invoke-interface {v0}, LBh/a;->getReturnType()Lpi/S;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v4

    invoke-virtual {p0}, LNh/z;->O()LBh/b0;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v7

    move-object v2, v10

    invoke-virtual/range {v2 .. v7}, LDh/K;->b1(Lpi/S;Ljava/util/List;LBh/b0;LBh/b0;Ljava/util/List;)V

    invoke-interface {v0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v3

    const/4 v6, 0x0

    invoke-interface {v0}, LBh/p;->j()LBh/g0;

    move-result-object v7

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lbi/h;->k(LBh/Y;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;ZZZLBh/g0;)LDh/L;

    move-result-object p1

    invoke-virtual {p1, v0}, LDh/J;->M0(LBh/z;)V

    invoke-virtual {v10}, LDh/X;->getType()Lpi/S;

    move-result-object v0

    invoke-virtual {p1, v0}, LDh/L;->P0(Lpi/S;)V

    const-string v0, "apply(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_4

    invoke-interface {p2}, LBh/a;->i()Ljava/util/List;

    move-result-object v0

    const-string v1, "getValueParameters(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LBh/s0;

    if-eqz v0, :cond_3

    invoke-interface {p2}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v3

    invoke-interface {v0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v4

    invoke-interface {p2}, LBh/C;->getVisibility()LBh/u;

    move-result-object v8

    invoke-interface {p2}, LBh/p;->j()LBh/g0;

    move-result-object v9

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, v10

    invoke-static/range {v2 .. v9}, Lbi/h;->m(LBh/Y;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;ZZZLBh/u;LBh/g0;)LDh/M;

    move-result-object v1

    invoke-virtual {v1, p2}, LDh/J;->M0(LBh/z;)V

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/AssertionError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "No parameter found for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_4
    :goto_1
    invoke-virtual {v10, p1, v1}, LDh/K;->U0(LDh/L;LBh/a0;)V

    return-object v10
.end method

.method private final K0(LQh/r;Lpi/S;LBh/D;)LLh/f;
    .locals 15

    move-object/from16 v6, p1

    invoke-virtual {p0}, LNh/U;->L()LMh/k;

    move-result-object v0

    invoke-static {v0, v6}, LMh/h;->a(LMh/k;LQh/d;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v8

    invoke-virtual {p0}, LNh/z;->c1()LBh/e;

    move-result-object v7

    invoke-interface/range {p1 .. p1}, LQh/s;->getVisibility()LBh/w0;

    move-result-object v0

    invoke-static {v0}, LJh/V;->d(LBh/w0;)LBh/u;

    move-result-object v10

    invoke-interface/range {p1 .. p1}, LQh/t;->getName()LZh/f;

    move-result-object v12

    invoke-virtual {p0}, LNh/U;->L()LMh/k;

    move-result-object v0

    invoke-virtual {v0}, LMh/k;->a()LMh/d;

    move-result-object v0

    invoke-virtual {v0}, LMh/d;->t()LPh/b;

    move-result-object v0

    invoke-interface {v0, v6}, LPh/b;->a(LQh/l;)LPh/a;

    move-result-object v13

    const/4 v14, 0x0

    const/4 v11, 0x0

    move-object/from16 v9, p3

    invoke-static/range {v7 .. v14}, LLh/f;->f1(LBh/m;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/D;LBh/u;ZLZh/f;LBh/g0;Z)LLh/f;

    move-result-object v7

    const-string v0, "create(...)"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->b()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v0

    invoke-static {v7, v0}, Lbi/h;->d(LBh/Y;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)LDh/L;

    move-result-object v8

    const-string v0, "createDefaultGetter(...)"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {v7, v8, v0}, LDh/K;->U0(LDh/L;LBh/a0;)V

    if-nez p2, :cond_0

    invoke-virtual {p0}, LNh/U;->L()LMh/k;

    move-result-object v0

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v1, v7

    move-object/from16 v2, p1

    invoke-static/range {v0 .. v5}, LMh/c;->i(LMh/k;LBh/m;LQh/z;IILjava/lang/Object;)LMh/k;

    move-result-object v0

    move-object v9, p0

    invoke-virtual {p0, v6, v0}, LNh/U;->A(LQh/r;LMh/k;)Lpi/S;

    move-result-object v0

    move-object v6, v0

    goto :goto_0

    :cond_0
    move-object v9, p0

    move-object/from16 v6, p2

    :goto_0
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0}, LNh/z;->O()LBh/b0;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v5

    move-object v0, v7

    move-object v1, v6

    invoke-virtual/range {v0 .. v5}, LDh/K;->b1(Lpi/S;Ljava/util/List;LBh/b0;LBh/b0;Ljava/util/List;)V

    invoke-virtual {v8, v6}, LDh/L;->P0(Lpi/S;)V

    return-object v7
.end method

.method static synthetic L0(LNh/z;LQh/r;Lpi/S;LBh/D;ILjava/lang/Object;)LLh/f;
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, LNh/z;->K0(LQh/r;Lpi/S;LBh/D;)LLh/f;

    move-result-object p0

    return-object p0
.end method

.method private final M0(LDh/i;)Ljava/util/List;
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, LNh/z;->o:LQh/g;

    invoke-interface {v1}, LQh/g;->g()Ljava/util/Collection;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    sget-object v4, Lpi/I0;->COMMON:Lpi/I0;

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, LOh/b;->b(Lpi/I0;ZZLBh/l0;ILjava/lang/Object;)LOh/a;

    move-result-object v3

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v4, 0x0

    :goto_0
    move v8, v4

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    add-int/lit8 v4, v8, 0x1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LQh/w;

    invoke-virtual/range {p0 .. p0}, LNh/U;->L()LMh/k;

    move-result-object v6

    invoke-virtual {v6}, LMh/k;->g()LOh/e;

    move-result-object v6

    invoke-interface {v5}, LQh/w;->getType()LQh/x;

    move-result-object v7

    invoke-virtual {v6, v7, v3}, LOh/e;->p(LQh/x;LOh/a;)Lpi/S;

    move-result-object v11

    invoke-interface {v5}, LQh/w;->c()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-virtual/range {p0 .. p0}, LNh/U;->L()LMh/k;

    move-result-object v6

    invoke-virtual {v6}, LMh/k;->a()LMh/d;

    move-result-object v6

    invoke-virtual {v6}, LMh/d;->m()LBh/G;

    move-result-object v6

    invoke-interface {v6}, LBh/G;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object v6

    invoke-virtual {v6, v11}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->k(Lpi/S;)Lpi/S;

    move-result-object v6

    :goto_1
    move-object v15, v6

    goto :goto_2

    :cond_0
    const/4 v6, 0x0

    goto :goto_1

    :goto_2
    new-instance v14, LDh/V;

    sget-object v6, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-virtual {v6}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->b()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v9

    invoke-interface {v5}, LQh/t;->getName()LZh/f;

    move-result-object v10

    invoke-virtual/range {p0 .. p0}, LNh/U;->L()LMh/k;

    move-result-object v6

    invoke-virtual {v6}, LMh/k;->a()LMh/d;

    move-result-object v6

    invoke-virtual {v6}, LMh/d;->t()LPh/b;

    move-result-object v6

    invoke-interface {v6, v5}, LPh/b;->a(LQh/l;)LPh/a;

    move-result-object v16

    const/4 v7, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v17, 0x0

    move-object v5, v14

    move-object/from16 v6, p1

    move-object/from16 v18, v14

    move/from16 v14, v17

    invoke-direct/range {v5 .. v16}, LDh/V;-><init>(LBh/a;LBh/s0;ILkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;Lpi/S;ZZZLpi/S;LBh/g0;)V

    move-object/from16 v5, v18

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v2
.end method

.method private final N0(LBh/f0;LZh/f;)LBh/f0;
    .locals 0

    invoke-interface {p1}, LBh/f0;->v()LBh/z$a;

    move-result-object p1

    invoke-interface {p1, p2}, LBh/z$a;->n(LZh/f;)LBh/z$a;

    invoke-interface {p1}, LBh/z$a;->u()LBh/z$a;

    invoke-interface {p1}, LBh/z$a;->i()LBh/z$a;

    invoke-interface {p1}, LBh/z$a;->a()LBh/z;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast p1, LBh/f0;

    return-object p1
.end method

.method private final O0(LBh/f0;)LBh/f0;
    .locals 5

    invoke-interface {p1}, LBh/a;->i()Ljava/util/List;

    move-result-object v0

    const-string v1, "getValueParameters(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LZg/v;->D0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LBh/s0;

    const/4 v2, 0x0

    if-eqz v0, :cond_5

    invoke-interface {v0}, LBh/r0;->getType()Lpi/S;

    move-result-object v3

    invoke-virtual {v3}, Lpi/S;->N0()Lpi/v0;

    move-result-object v3

    invoke-interface {v3}, Lpi/v0;->c()LBh/h;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-static {v3}, Lfi/e;->p(LBh/m;)LZh/d;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, LZh/d;->f()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    move-object v3, v2

    :goto_0
    if-eqz v3, :cond_1

    invoke-virtual {v3}, LZh/d;->l()LZh/c;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object v3, v2

    :goto_1
    sget-object v4, Lkotlin/reflect/jvm/internal/impl/builtins/o;->v:LZh/c;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    move-object v0, v2

    :goto_2
    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    invoke-interface {p1}, LBh/f0;->v()LBh/z$a;

    move-result-object v2

    invoke-interface {p1}, LBh/a;->i()Ljava/util/List;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-static {p1, v1}, LZg/v;->i0(Ljava/util/List;I)Ljava/util/List;

    move-result-object p1

    invoke-interface {v2, p1}, LBh/z$a;->d(Ljava/util/List;)LBh/z$a;

    move-result-object p1

    invoke-interface {v0}, LBh/r0;->getType()Lpi/S;

    move-result-object v0

    invoke-virtual {v0}, Lpi/S;->L0()Ljava/util/List;

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpi/B0;

    invoke-interface {v0}, Lpi/B0;->getType()Lpi/S;

    move-result-object v0

    invoke-interface {p1, v0}, LBh/z$a;->g(Lpi/S;)LBh/z$a;

    move-result-object p1

    invoke-interface {p1}, LBh/z$a;->a()LBh/z;

    move-result-object p1

    check-cast p1, LBh/f0;

    move-object v0, p1

    check-cast v0, LDh/O;

    if-eqz v0, :cond_4

    invoke-virtual {v0, v1}, LDh/s;->h1(Z)V

    :cond_4
    return-object p1

    :cond_5
    :goto_3
    return-object v2
.end method

.method private final P0(LBh/Y;Lmh/l;)Z
    .locals 3

    invoke-static {p1}, LNh/d;->a(LBh/Y;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-direct {p0, p1, p2}, LNh/z;->W0(LBh/Y;Lmh/l;)LBh/f0;

    move-result-object v0

    invoke-direct {p0, p1, p2}, LNh/z;->X0(LBh/Y;Lmh/l;)LBh/f0;

    move-result-object p2

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-interface {p1}, LBh/t0;->h0()Z

    move-result p1

    const/4 v2, 0x1

    if-nez p1, :cond_2

    return v2

    :cond_2
    if-eqz p2, :cond_3

    invoke-interface {p2}, LBh/C;->l()LBh/D;

    move-result-object p1

    invoke-interface {v0}, LBh/C;->l()LBh/D;

    move-result-object p2

    if-ne p1, p2, :cond_3

    move v1, v2

    :cond_3
    return v1
.end method

.method private final Q0(LBh/a;LBh/a;)Z
    .locals 3

    sget-object v0, Lbi/o;->f:Lbi/o;

    const/4 v1, 0x1

    invoke-virtual {v0, p2, p1, v1}, Lbi/o;->F(LBh/a;LBh/a;Z)Lbi/o$i;

    move-result-object v0

    invoke-virtual {v0}, Lbi/o$i;->c()Lbi/o$i$a;

    move-result-object v0

    const-string v2, "getResult(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lbi/o$i$a;->OVERRIDABLE:Lbi/o$i$a;

    if-ne v0, v2, :cond_0

    sget-object v0, LJh/z;->a:LJh/z$a;

    invoke-virtual {v0, p2, p1}, LJh/z$a;->a(LBh/a;LBh/a;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method private final R0(LBh/f0;)Z
    .locals 6

    sget-object v0, LJh/U;->a:LJh/U$a;

    invoke-interface {p1}, LBh/I;->getName()LZh/f;

    move-result-object v1

    const-string v2, "getName(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LJh/U$a;->b(LZh/f;)LZh/f;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-direct {p0, v0}, LNh/z;->b1(LZh/f;)Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, LBh/f0;

    invoke-static {v5}, LJh/T;->d(LBh/b;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_3

    return v1

    :cond_3
    invoke-direct {p0, p1, v0}, LNh/z;->N0(LBh/f0;LZh/f;)LBh/f0;

    move-result-object p1

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_1

    :cond_4
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LBh/f0;

    invoke-direct {p0, v2, p1}, LNh/z;->S0(LBh/f0;LBh/z;)Z

    move-result v2

    if-eqz v2, :cond_5

    const/4 v1, 0x1

    :cond_6
    :goto_1
    return v1
.end method

.method private final S0(LBh/f0;LBh/z;)Z
    .locals 1

    sget-object v0, LJh/f;->o:LJh/f;

    invoke-virtual {v0, p1}, LJh/f;->m(LBh/f0;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, LBh/z;->a()LBh/z;

    move-result-object p2

    :cond_0
    invoke-static {p2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {p0, p2, p1}, LNh/z;->Q0(LBh/a;LBh/a;)Z

    move-result p1

    return p1
.end method

.method private final T0(LBh/f0;)Z
    .locals 4

    invoke-direct {p0, p1}, LNh/z;->O0(LBh/f0;)LBh/f0;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-interface {p1}, LBh/I;->getName()LZh/f;

    move-result-object p1

    const-string v2, "getName(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LNh/z;->b1(LZh/f;)Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    instance-of v2, p1, Ljava/util/Collection;

    if-eqz v2, :cond_1

    move-object v2, p1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LBh/f0;

    invoke-interface {v2}, LBh/z;->isSuspend()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-direct {p0, v0, v2}, LNh/z;->Q0(LBh/a;LBh/a;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v1, 0x1

    :cond_3
    :goto_0
    return v1
.end method

.method private static final U0(LNh/z;)Ljava/util/Map;
    .locals 3

    iget-object p0, p0, LNh/z;->o:LQh/g;

    invoke-interface {p0}, LQh/g;->C()Ljava/util/Collection;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LQh/n;

    invoke-interface {v2}, LQh/n;->G()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    const/16 p0, 0xa

    invoke-static {v0, p0}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result p0

    invoke-static {p0}, LZg/U;->d(I)I

    move-result p0

    const/16 v1, 0x10

    invoke-static {p0, v1}, Lsh/m;->d(II)I

    move-result p0

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1, p0}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LQh/n;

    invoke-interface {v2}, LQh/t;->getName()LZh/f;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    return-object v1
.end method

.method private final V0(LBh/Y;Ljava/lang/String;Lmh/l;)LBh/f0;
    .locals 4

    invoke-static {p2}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object p2

    const-string v0, "identifier(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p3, p2}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    const/4 v0, 0x0

    if-eqz p3, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LBh/f0;

    invoke-interface {p3}, LBh/a;->i()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    sget-object v1, Lkotlin/reflect/jvm/internal/impl/types/checker/e;->a:Lkotlin/reflect/jvm/internal/impl/types/checker/e;

    invoke-interface {p3}, LBh/a;->getReturnType()Lpi/S;

    move-result-object v2

    if-nez v2, :cond_2

    const/4 v1, 0x0

    goto :goto_0

    :cond_2
    invoke-interface {p1}, LBh/r0;->getType()Lpi/S;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lkotlin/reflect/jvm/internal/impl/types/checker/e;->c(Lpi/S;Lpi/S;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_3

    move-object v0, p3

    :cond_3
    :goto_1
    if-eqz v0, :cond_0

    :cond_4
    return-object v0
.end method

.method private final W0(LBh/Y;Lmh/l;)LBh/f0;
    .locals 3

    invoke-interface {p1}, LBh/Y;->d()LBh/Z;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, LJh/T;->g(LBh/b;)LBh/b;

    move-result-object v0

    check-cast v0, LBh/Z;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    sget-object v1, LJh/m;->a:LJh/m;

    invoke-virtual {v1, v0}, LJh/m;->b(LBh/b;)Ljava/lang/String;

    move-result-object v1

    :cond_1
    if-eqz v1, :cond_2

    invoke-virtual {p0}, LNh/z;->c1()LBh/e;

    move-result-object v2

    invoke-static {v2, v0}, LJh/T;->l(LBh/e;LBh/a;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-direct {p0, p1, v1, p2}, LNh/z;->V0(LBh/Y;Ljava/lang/String;Lmh/l;)LBh/f0;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-interface {p1}, LBh/I;->getName()LZh/f;

    move-result-object v0

    invoke-virtual {v0}, LZh/f;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "asString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LJh/H;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0, p2}, LNh/z;->V0(LBh/Y;Ljava/lang/String;Lmh/l;)LBh/f0;

    move-result-object p1

    return-object p1
.end method

.method private final X0(LBh/Y;Lmh/l;)LBh/f0;
    .locals 5

    invoke-interface {p1}, LBh/I;->getName()LZh/f;

    move-result-object v0

    invoke-virtual {v0}, LZh/f;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "asString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LJh/H;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v0

    const-string v1, "identifier(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LBh/f0;

    invoke-interface {v0}, LBh/a;->i()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v0}, LBh/a;->getReturnType()Lpi/S;

    move-result-object v2

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {v2}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->C0(Lpi/S;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_3
    sget-object v2, Lkotlin/reflect/jvm/internal/impl/types/checker/e;->a:Lkotlin/reflect/jvm/internal/impl/types/checker/e;

    invoke-interface {v0}, LBh/a;->i()Ljava/util/List;

    move-result-object v3

    const-string v4, "getValueParameters(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, LZg/v;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LBh/s0;

    invoke-interface {v3}, LBh/r0;->getType()Lpi/S;

    move-result-object v3

    invoke-interface {p1}, LBh/r0;->getType()Lpi/S;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Lkotlin/reflect/jvm/internal/impl/types/checker/e;->b(Lpi/S;Lpi/S;)Z

    move-result v2

    if-eqz v2, :cond_4

    move-object v1, v0

    :cond_4
    :goto_0
    if-eqz v1, :cond_0

    :cond_5
    return-object v1
.end method

.method private static final Y0(LMh/k;LNh/z;)Ljava/util/Set;
    .locals 1

    invoke-virtual {p0}, LMh/k;->a()LMh/d;

    move-result-object v0

    invoke-virtual {v0}, LMh/d;->w()Lgi/f;

    move-result-object v0

    invoke-virtual {p1}, LNh/z;->c1()LBh/e;

    move-result-object p1

    invoke-interface {v0, p1, p0}, Lgi/f;->g(LBh/e;LMh/k;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, LZg/v;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method private final Z0(LBh/e;)LBh/u;
    .locals 1

    invoke-interface {p1}, LBh/e;->getVisibility()LBh/u;

    move-result-object p1

    const-string v0, "getVisibility(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LJh/y;->b:LBh/u;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, LJh/y;->c:LBh/u;

    const-string v0, "PROTECTED_AND_PACKAGE"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    return-object p1
.end method

.method private final b1(LZh/f;)Ljava/util/Set;
    .locals 4

    invoke-direct {p0}, LNh/z;->C0()Ljava/util/Collection;

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

    sget-object v3, LIh/d;->WHEN_GET_SUPER_MEMBERS:LIh/d;

    invoke-interface {v2, p1, v3}, Lii/k;->b(LZh/f;LIh/b;)Ljava/util/Collection;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v1, v2}, LZg/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method private final d1(LZh/f;)Ljava/util/Set;
    .locals 5

    invoke-direct {p0}, LNh/z;->C0()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

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

    sget-object v3, LIh/d;->WHEN_GET_SUPER_MEMBERS:LIh/d;

    invoke-interface {v2, p1, v3}, Lii/k;->d(LZh/f;LIh/b;)Ljava/util/Collection;

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

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LBh/Y;

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    invoke-static {v1, v3}, LZg/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_0

    :cond_1
    invoke-static {v1}, LZg/v;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method private final e1(LBh/f0;LBh/z;)Z
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v0, v0, v1, v2}, LSh/C;->c(LBh/z;ZZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {p2}, LBh/z;->a()LBh/z;

    move-result-object v4

    const-string v5, "getOriginal(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v0, v0, v1, v2}, LSh/C;->c(LBh/z;ZZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0, p1, p2}, LNh/z;->Q0(LBh/a;LBh/a;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method private final f1(LBh/f0;)Z
    .locals 5

    invoke-interface {p1}, LBh/I;->getName()LZh/f;

    move-result-object v0

    const-string v1, "getName(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LJh/N;->a(LZh/f;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LZh/f;

    invoke-direct {p0, v1}, LNh/z;->d1(LZh/f;)Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    instance-of v3, v1, Ljava/util/Collection;

    if-eqz v3, :cond_2

    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LBh/Y;

    new-instance v4, LNh/v;

    invoke-direct {v4, p1, p0}, LNh/v;-><init>(LBh/f0;LNh/z;)V

    invoke-direct {p0, v3, v4}, LNh/z;->P0(LBh/Y;Lmh/l;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, LBh/t0;->h0()Z

    move-result v3

    if-nez v3, :cond_4

    invoke-interface {p1}, LBh/I;->getName()LZh/f;

    move-result-object v3

    invoke-virtual {v3}, LZh/f;->b()Ljava/lang/String;

    move-result-object v3

    const-string v4, "asString(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, LJh/H;->d(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3

    :cond_4
    return v2

    :cond_5
    :goto_1
    invoke-direct {p0, p1}, LNh/z;->R0(LBh/f0;)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-direct {p0, p1}, LNh/z;->s1(LBh/f0;)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-direct {p0, p1}, LNh/z;->T0(LBh/f0;)Z

    move-result p1

    if-nez p1, :cond_6

    const/4 v2, 0x1

    :cond_6
    return v2
.end method

.method public static final synthetic g0(LNh/z;LZh/f;)Ljava/util/Collection;
    .locals 0

    invoke-direct {p0, p1}, LNh/z;->q1(LZh/f;)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method private static final g1(LBh/f0;LNh/z;LZh/f;)Ljava/util/Collection;
    .locals 1

    const-string v0, "accessorName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LBh/I;->getName()LZh/f;

    move-result-object v0

    invoke-static {v0, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    goto :goto_0

    :cond_0
    invoke-direct {p1, p2}, LNh/z;->q1(LZh/f;)Ljava/util/Collection;

    move-result-object p0

    invoke-direct {p1, p2}, LNh/z;->r1(LZh/f;)Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p0, p1}, LZg/v;->M0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    :goto_0
    return-object p0
.end method

.method public static final synthetic h0(LNh/z;LZh/f;)Ljava/util/Collection;
    .locals 0

    invoke-direct {p0, p1}, LNh/z;->r1(LZh/f;)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method private static final h1(LNh/z;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, LNh/z;->o:LQh/g;

    invoke-interface {p0}, LQh/g;->K()Ljava/util/Collection;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, LZg/v;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method static synthetic i0(LNh/z;LMh/k;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, LNh/z;->D0(LNh/z;LMh/k;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final i1(LNh/z;LMh/k;LZh/f;)LBh/e;
    .locals 14

    move-object v0, p0

    move-object v7, p1

    move-object/from16 v2, p2

    const-string v1, "name"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, LNh/z;->r:Loi/i;

    invoke-interface {v1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Set;

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {p1}, LMh/k;->a()LMh/d;

    move-result-object v1

    invoke-virtual {v1}, LMh/d;->d()LJh/u;

    move-result-object v1

    new-instance v4, LJh/u$a;

    invoke-virtual {p0}, LNh/z;->c1()LBh/e;

    move-result-object v5

    invoke-static {v5}, Lfi/e;->n(LBh/h;)LZh/b;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v5, v2}, LZh/b;->d(LZh/f;)LZh/b;

    move-result-object v9

    iget-object v11, v0, LNh/z;->o:LQh/g;

    const/4 v12, 0x2

    const/4 v13, 0x0

    const/4 v10, 0x0

    move-object v8, v4

    invoke-direct/range {v8 .. v13}, LJh/u$a;-><init>(LZh/b;[BLQh/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v4}, LJh/u;->c(LJh/u$a;)LQh/g;

    move-result-object v4

    if-eqz v4, :cond_3

    new-instance v8, LNh/n;

    invoke-virtual {p0}, LNh/z;->c1()LBh/e;

    move-result-object v2

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v9, 0x0

    move-object v0, v8

    move-object v1, p1

    move-object v3, v4

    move-object v4, v9

    invoke-direct/range {v0 .. v6}, LNh/n;-><init>(LMh/k;LBh/m;LQh/g;LBh/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1}, LMh/k;->a()LMh/d;

    move-result-object v0

    invoke-virtual {v0}, LMh/d;->e()LJh/v;

    move-result-object v0

    invoke-interface {v0, v8}, LJh/v;->a(LLh/c;)V

    move-object v3, v8

    goto/16 :goto_0

    :cond_0
    iget-object v1, v0, LNh/z;->s:Loi/i;

    invoke-interface {v1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Set;

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {}, LZg/v;->c()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, LMh/k;->a()LMh/d;

    move-result-object v4

    invoke-virtual {v4}, LMh/d;->w()Lgi/f;

    move-result-object v4

    invoke-virtual {p0}, LNh/z;->c1()LBh/e;

    move-result-object v0

    invoke-interface {v4, v0, v2, v1, p1}, Lgi/f;->b(LBh/e;LZh/f;Ljava/util/List;LMh/k;)V

    invoke-static {v1}, LZg/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-eqz v1, :cond_3

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    invoke-static {v0}, LZg/v;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LBh/e;

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Multiple classes with same name are generated: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v1, v0, LNh/z;->t:Loi/i;

    invoke-interface {v1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LQh/n;

    if-eqz v1, :cond_3

    invoke-virtual {p1}, LMh/k;->e()Loi/n;

    move-result-object v3

    new-instance v4, LNh/y;

    invoke-direct {v4, p0}, LNh/y;-><init>(LNh/z;)V

    invoke-interface {v3, v4}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object v3

    invoke-virtual {p1}, LMh/k;->e()Loi/n;

    move-result-object v4

    invoke-virtual {p0}, LNh/z;->c1()LBh/e;

    move-result-object v5

    invoke-static {p1, v1}, LMh/h;->a(LMh/k;LQh/d;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v6

    invoke-virtual {p1}, LMh/k;->a()LMh/d;

    move-result-object v0

    invoke-virtual {v0}, LMh/d;->t()LPh/b;

    move-result-object v0

    invoke-interface {v0, v1}, LPh/b;->a(LQh/l;)LPh/a;

    move-result-object v7

    move-object v0, v4

    move-object v1, v5

    move-object/from16 v2, p2

    move-object v4, v6

    move-object v5, v7

    invoke-static/range {v0 .. v5}, LDh/q;->L0(Loi/n;LBh/e;LZh/f;Loi/i;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/g0;)LDh/q;

    move-result-object v3

    :cond_3
    :goto_0
    return-object v3
.end method

.method static synthetic j0(LNh/z;)Ljava/util/Set;
    .locals 0

    invoke-static {p0}, LNh/z;->h1(LNh/z;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method private static final j1(LNh/z;)Ljava/util/Set;
    .locals 1

    invoke-virtual {p0}, LNh/U;->a()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p0}, LNh/U;->c()Ljava/util/Set;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {v0, p0}, LZg/d0;->l(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method static synthetic k0(LMh/k;LNh/z;)Ljava/util/Set;
    .locals 0

    invoke-static {p0, p1}, LNh/z;->Y0(LMh/k;LNh/z;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method private final k1(LBh/f0;Lmh/l;Ljava/util/Collection;)LBh/f0;
    .locals 2

    invoke-static {p1}, LJh/i;->l(LBh/z;)LBh/z;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    invoke-direct {p0, p1, p2}, LNh/z;->I0(LBh/z;Lmh/l;)LBh/f0;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-direct {p0, p2}, LNh/z;->f1(LBh/f0;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    move-object p2, v0

    :goto_0
    if-eqz p2, :cond_2

    invoke-direct {p0, p2, p1, p3}, LNh/z;->H0(LBh/f0;LBh/a;Ljava/util/Collection;)LBh/f0;

    move-result-object v0

    :cond_2
    return-object v0
.end method

.method static synthetic l0(LNh/z;)Ljava/util/Map;
    .locals 0

    invoke-static {p0}, LNh/z;->U0(LNh/z;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private final l1(LBh/f0;Lmh/l;LZh/f;Ljava/util/Collection;)LBh/f0;
    .locals 3

    invoke-static {p1}, LJh/T;->g(LBh/b;)LBh/b;

    move-result-object p1

    check-cast p1, LBh/f0;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    invoke-static {p1}, LJh/T;->e(LBh/b;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {v1}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v1

    const-string v2, "identifier(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LBh/f0;

    invoke-direct {p0, v1, p3}, LNh/z;->N0(LBh/f0;LZh/f;)LBh/f0;

    move-result-object v1

    invoke-direct {p0, p1, v1}, LNh/z;->S0(LBh/f0;LBh/z;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-direct {p0, v1, p1, p4}, LNh/z;->H0(LBh/f0;LBh/a;Ljava/util/Collection;)LBh/f0;

    move-result-object p1

    return-object p1

    :cond_2
    return-object v0
.end method

.method static synthetic m0(LNh/z;LMh/k;LZh/f;)LBh/e;
    .locals 0

    invoke-static {p0, p1, p2}, LNh/z;->i1(LNh/z;LMh/k;LZh/f;)LBh/e;

    move-result-object p0

    return-object p0
.end method

.method private final m1(LBh/f0;Lmh/l;)LBh/f0;
    .locals 3

    invoke-interface {p1}, LBh/z;->isSuspend()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-interface {p1}, LBh/I;->getName()LZh/f;

    move-result-object v0

    const-string v2, "getName(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LBh/f0;

    invoke-direct {p0, v0}, LNh/z;->O0(LBh/f0;)LBh/f0;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-direct {p0, v0, p1}, LNh/z;->Q0(LBh/a;LBh/a;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    move-object v1, v0

    :cond_3
    return-object v1
.end method

.method static synthetic n0(LQh/q;)Z
    .locals 0

    invoke-static {p0}, LNh/z;->z0(LQh/q;)Z

    move-result p0

    return p0
.end method

.method static synthetic o0(LBh/f0;LNh/z;LZh/f;)Ljava/util/Collection;
    .locals 0

    invoke-static {p0, p1, p2}, LNh/z;->g1(LBh/f0;LNh/z;LZh/f;)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method private final o1(LQh/k;)LLh/b;
    .locals 10

    invoke-virtual {p0}, LNh/z;->c1()LBh/e;

    move-result-object v0

    invoke-virtual {p0}, LNh/U;->L()LMh/k;

    move-result-object v1

    invoke-static {v1, p1}, LMh/h;->a(LMh/k;LQh/d;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v1

    invoke-virtual {p0}, LNh/U;->L()LMh/k;

    move-result-object v2

    invoke-virtual {v2}, LMh/k;->a()LMh/d;

    move-result-object v2

    invoke-virtual {v2}, LMh/d;->t()LPh/b;

    move-result-object v2

    invoke-interface {v2, p1}, LPh/b;->a(LQh/l;)LPh/a;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v0, v1, v3, v2}, LLh/b;->t1(LBh/e;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;ZLBh/g0;)LLh/b;

    move-result-object v1

    const-string v2, "createJavaConstructor(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LNh/U;->L()LMh/k;

    move-result-object v2

    invoke-interface {v0}, LBh/e;->w()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-static {v2, v1, p1, v4}, LMh/c;->h(LMh/k;LBh/m;LQh/z;I)LMh/k;

    move-result-object v2

    invoke-interface {p1}, LQh/k;->i()Ljava/util/List;

    move-result-object v4

    invoke-virtual {p0, v2, v1, v4}, LNh/U;->d0(LMh/k;LBh/z;Ljava/util/List;)LNh/U$b;

    move-result-object v4

    invoke-interface {v0}, LBh/e;->w()Ljava/util/List;

    move-result-object v5

    const-string v6, "getDeclaredTypeParameters(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Ljava/util/Collection;

    invoke-interface {p1}, LQh/z;->getTypeParameters()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v6, v8}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LQh/y;

    invoke-virtual {v2}, LMh/k;->f()LMh/p;

    move-result-object v9

    invoke-interface {v9, v8}, LMh/p;->a(LQh/y;)LBh/l0;

    move-result-object v8

    invoke-static {v8}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v7, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v5, v7}, LZg/v;->M0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v5

    invoke-virtual {v4}, LNh/U$b;->a()Ljava/util/List;

    move-result-object v6

    invoke-interface {p1}, LQh/s;->getVisibility()LBh/w0;

    move-result-object v7

    invoke-static {v7}, LJh/V;->d(LBh/w0;)LBh/u;

    move-result-object v7

    invoke-virtual {v1, v6, v7, v5}, LDh/i;->r1(Ljava/util/List;LBh/u;Ljava/util/List;)LDh/i;

    invoke-virtual {v1, v3}, LLh/b;->Y0(Z)V

    invoke-virtual {v4}, LNh/U$b;->b()Z

    move-result v3

    invoke-virtual {v1, v3}, LLh/b;->Z0(Z)V

    invoke-interface {v0}, LBh/e;->u()Lpi/d0;

    move-result-object v0

    invoke-virtual {v1, v0}, LDh/s;->g1(Lpi/S;)V

    invoke-virtual {v2}, LMh/k;->a()LMh/d;

    move-result-object v0

    invoke-virtual {v0}, LMh/d;->h()LKh/j;

    move-result-object v0

    invoke-interface {v0, p1, v1}, LKh/j;->c(LQh/l;LBh/l;)V

    return-object v1
.end method

.method static synthetic p0(LNh/z;LZh/f;)Ljava/util/Collection;
    .locals 0

    invoke-static {p0, p1}, LNh/z;->A0(LNh/z;LZh/f;)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method private final p1(LQh/w;)LLh/e;
    .locals 16

    move-object/from16 v0, p1

    invoke-virtual/range {p0 .. p0}, LNh/U;->L()LMh/k;

    move-result-object v1

    invoke-static {v1, v0}, LMh/h;->a(LMh/k;LQh/d;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, LNh/z;->c1()LBh/e;

    move-result-object v2

    invoke-interface/range {p1 .. p1}, LQh/t;->getName()LZh/f;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, LNh/U;->L()LMh/k;

    move-result-object v4

    invoke-virtual {v4}, LMh/k;->a()LMh/d;

    move-result-object v4

    invoke-virtual {v4}, LMh/d;->t()LPh/b;

    move-result-object v4

    invoke-interface {v4, v0}, LPh/b;->a(LQh/l;)LPh/a;

    move-result-object v4

    const/4 v5, 0x1

    invoke-static {v2, v1, v3, v4, v5}, LLh/e;->p1(LBh/m;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;LBh/g0;Z)LLh/e;

    move-result-object v1

    const-string v2, "createJavaMethod(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Lpi/I0;->COMMON:Lpi/I0;

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, LOh/b;->b(Lpi/I0;ZZLBh/l0;ILjava/lang/Object;)LOh/a;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, LNh/U;->L()LMh/k;

    move-result-object v3

    invoke-virtual {v3}, LMh/k;->g()LOh/e;

    move-result-object v3

    invoke-interface/range {p1 .. p1}, LQh/w;->getType()LQh/x;

    move-result-object v4

    invoke-virtual {v3, v4, v2}, LOh/e;->p(LQh/x;LOh/a;)Lpi/S;

    move-result-object v12

    invoke-virtual/range {p0 .. p0}, LNh/z;->O()LBh/b0;

    move-result-object v8

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v9

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v10

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v11

    sget-object v2, LBh/D;->Companion:LBh/D$a;

    const/4 v3, 0x0

    invoke-virtual {v2, v3, v3, v5}, LBh/D$a;->a(ZZZ)LBh/D;

    move-result-object v13

    sget-object v14, LBh/t;->e:LBh/u;

    const/4 v15, 0x0

    const/4 v7, 0x0

    move-object v6, v1

    invoke-virtual/range {v6 .. v15}, LLh/e;->o1(LBh/b0;LBh/b0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lpi/S;LBh/D;LBh/u;Ljava/util/Map;)LDh/O;

    invoke-virtual {v1, v3, v3}, LLh/e;->s1(ZZ)V

    invoke-virtual/range {p0 .. p0}, LNh/U;->L()LMh/k;

    move-result-object v2

    invoke-virtual {v2}, LMh/k;->a()LMh/d;

    move-result-object v2

    invoke-virtual {v2}, LMh/d;->h()LKh/j;

    move-result-object v2

    invoke-interface {v2, v0, v1}, LKh/j;->a(LQh/q;LBh/f0;)V

    return-object v1
.end method

.method static synthetic q0(LNh/z;LZh/f;)Ljava/util/Collection;
    .locals 0

    invoke-static {p0, p1}, LNh/z;->B0(LNh/z;LZh/f;)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method private final q1(LZh/f;)Ljava/util/Collection;
    .locals 2

    invoke-virtual {p0}, LNh/U;->N()Loi/i;

    move-result-object v0

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LNh/c;

    invoke-interface {v0, p1}, LNh/c;->b(LZh/f;)Ljava/util/Collection;

    move-result-object p1

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

    check-cast v1, LQh/r;

    invoke-virtual {p0, v1}, LNh/U;->Z(LQh/r;)LLh/e;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method static synthetic r0(LNh/z;)Ljava/util/Set;
    .locals 0

    invoke-static {p0}, LNh/z;->j1(LNh/z;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method private final r1(LZh/f;)Ljava/util/Collection;
    .locals 4

    invoke-direct {p0, p1}, LNh/z;->b1(LZh/f;)Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LBh/f0;

    invoke-static {v2}, LJh/T;->d(LBh/b;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-static {v2}, LJh/i;->l(LBh/z;)LBh/z;

    move-result-object v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method private final s0(Ljava/util/List;LBh/l;ILQh/r;Lpi/S;Lpi/S;)V
    .locals 13

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->b()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v5

    invoke-interface/range {p4 .. p4}, LQh/t;->getName()LZh/f;

    move-result-object v6

    invoke-static/range {p5 .. p5}, Lpi/J0;->n(Lpi/S;)Lpi/S;

    move-result-object v7

    const-string v0, "makeNotNullable(...)"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface/range {p4 .. p4}, LQh/r;->L()Z

    move-result v8

    if-eqz p6, :cond_0

    invoke-static/range {p6 .. p6}, Lpi/J0;->n(Lpi/S;)Lpi/S;

    move-result-object v0

    :goto_0
    move-object v11, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    invoke-virtual {p0}, LNh/U;->L()LMh/k;

    move-result-object v0

    invoke-virtual {v0}, LMh/k;->a()LMh/d;

    move-result-object v0

    invoke-virtual {v0}, LMh/d;->t()LPh/b;

    move-result-object v0

    move-object/from16 v1, p4

    invoke-interface {v0, v1}, LPh/b;->a(LQh/l;)LPh/a;

    move-result-object v12

    new-instance v0, LDh/V;

    const/4 v3, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v1, v0

    move-object v2, p2

    move/from16 v4, p3

    invoke-direct/range {v1 .. v12}, LDh/V;-><init>(LBh/a;LBh/s0;ILkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;Lpi/S;ZZZLpi/S;LBh/g0;)V

    move-object v1, p1

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private final s1(LBh/f0;)Z
    .locals 4

    sget-object v0, LJh/i;->o:LJh/i;

    invoke-interface {p1}, LBh/I;->getName()LZh/f;

    move-result-object v1

    const-string v2, "getName(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LJh/i;->n(LZh/f;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-interface {p1}, LBh/I;->getName()LZh/f;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, LNh/z;->b1(LZh/f;)Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LBh/f0;

    invoke-static {v3}, LJh/i;->l(LBh/z;)LBh/z;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LBh/z;

    invoke-direct {p0, p1, v2}, LNh/z;->e1(LBh/f0;LBh/z;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v1, 0x1

    :cond_5
    :goto_1
    return v1
.end method

.method private final t0(Ljava/util/Collection;LZh/f;Ljava/util/Collection;Z)V
    .locals 6

    invoke-virtual {p0}, LNh/z;->c1()LBh/e;

    move-result-object v3

    invoke-virtual {p0}, LNh/U;->L()LMh/k;

    move-result-object v0

    invoke-virtual {v0}, LMh/k;->a()LMh/d;

    move-result-object v0

    invoke-virtual {v0}, LMh/d;->c()Lli/w;

    move-result-object v4

    invoke-virtual {p0}, LNh/U;->L()LMh/k;

    move-result-object v0

    invoke-virtual {v0}, LMh/k;->a()LMh/d;

    move-result-object v0

    invoke-virtual {v0}, LMh/d;->k()Lkotlin/reflect/jvm/internal/impl/types/checker/p;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/reflect/jvm/internal/impl/types/checker/p;->a()Lbi/o;

    move-result-object v5

    move-object v0, p2

    move-object v1, p3

    move-object v2, p1

    invoke-static/range {v0 .. v5}, LKh/a;->d(LZh/f;Ljava/util/Collection;Ljava/util/Collection;LBh/e;Lli/w;Lbi/o;)Ljava/util/Collection;

    move-result-object p2

    const-string p3, "resolveOverridesForNonStaticMembers(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p4, :cond_0

    invoke-interface {p1, p2}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    goto :goto_2

    :cond_0
    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p1, p2}, LZg/v;->M0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p3

    new-instance p4, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p2, v0}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p4, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LBh/f0;

    invoke-static {v0}, LJh/T;->j(LBh/b;)LBh/b;

    move-result-object v1

    check-cast v1, LBh/f0;

    if-nez v1, :cond_1

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    move-object v2, p3

    check-cast v2, Ljava/util/Collection;

    invoke-direct {p0, v0, v1, v2}, LNh/z;->H0(LBh/f0;LBh/a;Ljava/util/Collection;)LBh/f0;

    move-result-object v0

    :goto_1
    invoke-interface {p4, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {p1, p4}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    :goto_2
    return-void
.end method

.method private final u0(LZh/f;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Lmh/l;)V
    .locals 2

    invoke-interface {p3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LBh/f0;

    invoke-direct {p0, v0, p5, p1, p2}, LNh/z;->l1(LBh/f0;Lmh/l;LZh/f;Ljava/util/Collection;)LBh/f0;

    move-result-object v1

    invoke-static {p4, v1}, Lxi/a;->a(Ljava/util/Collection;Ljava/lang/Object;)V

    invoke-direct {p0, v0, p5, p2}, LNh/z;->k1(LBh/f0;Lmh/l;Ljava/util/Collection;)LBh/f0;

    move-result-object v1

    invoke-static {p4, v1}, Lxi/a;->a(Ljava/util/Collection;Ljava/lang/Object;)V

    invoke-direct {p0, v0, p5}, LNh/z;->m1(LBh/f0;Lmh/l;)LBh/f0;

    move-result-object v0

    invoke-static {p4, v0}, Lxi/a;->a(Ljava/util/Collection;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private final v0(Ljava/util/Set;Ljava/util/Collection;Ljava/util/Set;Lmh/l;)V
    .locals 2

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LBh/Y;

    invoke-direct {p0, v0, p4}, LNh/z;->J0(LBh/Y;Lmh/l;)LLh/f;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {p2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    if-eqz p3, :cond_1

    invoke-interface {p3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method

.method private final w0(LZh/f;Ljava/util/Collection;)V
    .locals 6

    invoke-virtual {p0}, LNh/U;->N()Loi/i;

    move-result-object v0

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LNh/c;

    invoke-interface {v0, p1}, LNh/c;->b(LZh/f;)Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, LZg/v;->S0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, LQh/r;

    if-nez v1, :cond_0

    return-void

    :cond_0
    sget-object v3, LBh/D;->FINAL:LBh/D;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, LNh/z;->L0(LNh/z;LQh/r;Lpi/S;LBh/D;ILjava/lang/Object;)LLh/f;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private static final z0(LQh/q;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LQh/s;->Q()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method


# virtual methods
.method protected B(Ljava/util/Collection;LZh/f;)V
    .locals 9

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2}, LNh/z;->b1(LZh/f;)Ljava/util/Set;

    move-result-object v6

    sget-object v0, LJh/U;->a:LJh/U$a;

    invoke-virtual {v0, p2}, LJh/U$a;->k(LZh/f;)Z

    move-result v0

    if-nez v0, :cond_5

    sget-object v0, LJh/i;->o:LJh/i;

    invoke-virtual {v0, p2}, LJh/i;->n(LZh/f;)Z

    move-result v0

    if-nez v0, :cond_5

    move-object v0, v6

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LBh/z;

    invoke-interface {v2}, LBh/z;->isSuspend()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_2

    :cond_2
    :goto_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, LBh/f0;

    invoke-direct {p0, v3}, LNh/z;->f1(LBh/f0;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v1, v0}, LNh/z;->t0(Ljava/util/Collection;LZh/f;Ljava/util/Collection;Z)V

    return-void

    :cond_5
    :goto_2
    sget-object v0, Lxi/l;->c:Lxi/l$b;

    invoke-virtual {v0}, Lxi/l$b;->a()Lxi/l;

    move-result-object v7

    move-object v1, v6

    check-cast v1, Ljava/util/Collection;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-virtual {p0}, LNh/z;->c1()LBh/e;

    move-result-object v3

    sget-object v4, Lli/w;->a:Lli/w;

    invoke-virtual {p0}, LNh/U;->L()LMh/k;

    move-result-object v0

    invoke-virtual {v0}, LMh/k;->a()LMh/d;

    move-result-object v0

    invoke-virtual {v0}, LMh/d;->k()Lkotlin/reflect/jvm/internal/impl/types/checker/p;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/reflect/jvm/internal/impl/types/checker/p;->a()Lbi/o;

    move-result-object v5

    move-object v0, p2

    invoke-static/range {v0 .. v5}, LKh/a;->d(LZh/f;Ljava/util/Collection;Ljava/util/Collection;LBh/e;Lli/w;Lbi/o;)Ljava/util/Collection;

    move-result-object v8

    const-string v0, "resolveOverridesForNonStaticMembers(...)"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, LNh/z$a;

    invoke-direct {v5, p0}, LNh/z$a;-><init>(Ljava/lang/Object;)V

    move-object v0, p0

    move-object v1, p2

    move-object v2, p1

    move-object v3, v8

    move-object v4, p1

    invoke-direct/range {v0 .. v5}, LNh/z;->u0(LZh/f;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Lmh/l;)V

    new-instance v5, LNh/z$b;

    invoke-direct {v5, p0}, LNh/z$b;-><init>(Ljava/lang/Object;)V

    move-object v4, v7

    invoke-direct/range {v0 .. v5}, LNh/z;->u0(LZh/f;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Lmh/l;)V

    check-cast v6, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_6
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, LBh/f0;

    invoke-direct {p0, v3}, LNh/z;->f1(LBh/f0;)Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_7
    invoke-static {v0, v7}, LZg/v;->M0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    const/4 v1, 0x1

    invoke-direct {p0, p1, p2, v0, v1}, LNh/z;->t0(Ljava/util/Collection;LZh/f;Ljava/util/Collection;Z)V

    return-void
.end method

.method protected C(LZh/f;Ljava/util/Collection;)V
    .locals 7

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LNh/z;->o:LQh/g;

    invoke-interface {v0}, LQh/g;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2}, LNh/z;->w0(LZh/f;Ljava/util/Collection;)V

    :cond_0
    invoke-direct {p0, p1}, LNh/z;->d1(LZh/f;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    :cond_1
    sget-object v1, Lxi/l;->c:Lxi/l$b;

    invoke-virtual {v1}, Lxi/l$b;->a()Lxi/l;

    move-result-object v2

    invoke-virtual {v1}, Lxi/l$b;->a()Lxi/l;

    move-result-object v1

    new-instance v3, LNh/w;

    invoke-direct {v3, p0}, LNh/w;-><init>(LNh/z;)V

    invoke-direct {p0, v0, p2, v2, v3}, LNh/z;->v0(Ljava/util/Set;Ljava/util/Collection;Ljava/util/Set;Lmh/l;)V

    invoke-static {v0, v2}, LZg/d0;->j(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v2

    new-instance v3, LNh/x;

    invoke-direct {v3, p0}, LNh/x;-><init>(LNh/z;)V

    const/4 v4, 0x0

    invoke-direct {p0, v2, v1, v4, v3}, LNh/z;->v0(Ljava/util/Set;Ljava/util/Collection;Ljava/util/Set;Lmh/l;)V

    invoke-static {v0, v1}, LZg/d0;->l(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-virtual {p0}, LNh/z;->c1()LBh/e;

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

    move-object v1, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, LKh/a;->d(LZh/f;Ljava/util/Collection;Ljava/util/Collection;LBh/e;Lli/w;Lbi/o;)Ljava/util/Collection;

    move-result-object p1

    const-string v0, "resolveOverridesForNonStaticMembers(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, p1}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method protected D(Lii/d;Lmh/l;)Ljava/util/Set;
    .locals 1

    const-string p2, "kindFilter"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LNh/z;->o:LQh/g;

    invoke-interface {p1}, LQh/g;->n()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LNh/U;->a()Ljava/util/Set;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-virtual {p0}, LNh/U;->N()Loi/i;

    move-result-object p2

    invoke-interface {p2}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LNh/c;

    invoke-interface {p2}, LNh/c;->e()Ljava/util/Set;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    invoke-direct {p1, p2}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p0}, LNh/z;->c1()LBh/e;

    move-result-object p2

    invoke-interface {p2}, LBh/h;->k()Lpi/v0;

    move-result-object p2

    invoke-interface {p2}, Lpi/v0;->a()Ljava/util/Collection;

    move-result-object p2

    const-string v0, "getSupertypes(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpi/S;

    invoke-virtual {v0}, Lpi/S;->r()Lii/k;

    move-result-object v0

    invoke-interface {v0}, Lii/k;->c()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {p1, v0}, LZg/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_0

    :cond_1
    return-object p1
.end method

.method protected O()LBh/b0;
    .locals 1

    invoke-virtual {p0}, LNh/z;->c1()LBh/e;

    move-result-object v0

    invoke-static {v0}, Lbi/i;->l(LBh/m;)LBh/b0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic R()LBh/m;
    .locals 1

    invoke-virtual {p0}, LNh/z;->c1()LBh/e;

    move-result-object v0

    return-object v0
.end method

.method protected V(LLh/e;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LNh/z;->o:LQh/g;

    invoke-interface {v0}, LQh/g;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-direct {p0, p1}, LNh/z;->f1(LBh/f0;)Z

    move-result p1

    return p1
.end method

.method protected Y(LQh/r;Ljava/util/List;Lpi/S;Ljava/util/List;)LNh/U$a;
    .locals 8

    const-string v0, "method"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "methodTypeParameters"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "returnType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "valueParameters"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LNh/U;->L()LMh/k;

    move-result-object v0

    invoke-virtual {v0}, LMh/k;->a()LMh/d;

    move-result-object v0

    invoke-virtual {v0}, LMh/d;->s()LKh/o;

    move-result-object v1

    invoke-virtual {p0}, LNh/z;->c1()LBh/e;

    move-result-object v3

    const/4 v5, 0x0

    move-object v2, p1

    move-object v4, p3

    move-object v6, p4

    move-object v7, p2

    invoke-interface/range {v1 .. v7}, LKh/o;->b(LQh/r;LBh/e;Lpi/S;Lpi/S;Ljava/util/List;Ljava/util/List;)LKh/o$b;

    move-result-object p1

    const-string p2, "resolvePropagatedSignature(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, LNh/U$a;

    invoke-virtual {p1}, LKh/o$b;->d()Lpi/S;

    move-result-object v1

    const-string p3, "getReturnType(...)"

    invoke-static {v1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LKh/o$b;->c()Lpi/S;

    move-result-object v2

    invoke-virtual {p1}, LKh/o$b;->f()Ljava/util/List;

    move-result-object v3

    const-string p3, "getValueParameters(...)"

    invoke-static {v3, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LKh/o$b;->e()Ljava/util/List;

    move-result-object v4

    const-string p3, "getTypeParameters(...)"

    invoke-static {v4, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LKh/o$b;->g()Z

    move-result v5

    invoke-virtual {p1}, LKh/o$b;->b()Ljava/util/List;

    move-result-object v6

    const-string p1, "getErrors(...)"

    invoke-static {v6, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p2

    invoke-direct/range {v0 .. v6}, LNh/U$a;-><init>(Lpi/S;Lpi/S;Ljava/util/List;Ljava/util/List;ZLjava/util/List;)V

    return-object p2
.end method

.method public final a1()Loi/i;
    .locals 1

    iget-object v0, p0, LNh/z;->q:Loi/i;

    return-object v0
.end method

.method public b(LZh/f;LIh/b;)Ljava/util/Collection;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, LNh/z;->n1(LZh/f;LIh/b;)V

    invoke-super {p0, p1, p2}, LNh/U;->b(LZh/f;LIh/b;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method protected c1()LBh/e;
    .locals 1

    iget-object v0, p0, LNh/z;->n:LBh/e;

    return-object v0
.end method

.method public d(LZh/f;LIh/b;)Ljava/util/Collection;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, LNh/z;->n1(LZh/f;LIh/b;)V

    invoke-super {p0, p1, p2}, LNh/U;->d(LZh/f;LIh/b;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public g(LZh/f;LIh/b;)LBh/h;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, LNh/z;->n1(LZh/f;LIh/b;)V

    invoke-virtual {p0}, LNh/U;->Q()LNh/U;

    move-result-object p2

    check-cast p2, LNh/z;

    if-eqz p2, :cond_0

    iget-object p2, p2, LNh/z;->u:Loi/h;

    if-eqz p2, :cond_0

    invoke-interface {p2, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LBh/e;

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p0, LNh/z;->u:Loi/h;

    invoke-interface {p2, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object p2, p1

    check-cast p2, LBh/h;

    :goto_0
    return-object p2
.end method

.method public n1(LZh/f;LIh/b;)V
    .locals 2

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LNh/U;->L()LMh/k;

    move-result-object v0

    invoke-virtual {v0}, LMh/k;->a()LMh/d;

    move-result-object v0

    invoke-virtual {v0}, LMh/d;->l()LIh/c;

    move-result-object v0

    invoke-virtual {p0}, LNh/z;->c1()LBh/e;

    move-result-object v1

    invoke-static {v0, p2, v1, p1}, LHh/a;->a(LIh/c;LIh/b;LBh/e;LZh/f;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Lazy Java member scope for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LNh/z;->o:LQh/g;

    invoke-interface {v1}, LQh/g;->e()LZh/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected v(Lii/d;Lmh/l;)Ljava/util/Set;
    .locals 0

    const-string p2, "kindFilter"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LNh/z;->r:Loi/i;

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    iget-object p2, p0, LNh/z;->t:Loi/i;

    invoke-interface {p2}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map;

    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p1, p2}, LZg/d0;->l(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic x(Lii/d;Lmh/l;)Ljava/util/Set;
    .locals 0

    invoke-virtual {p0, p1, p2}, LNh/z;->x0(Lii/d;Lmh/l;)Ljava/util/LinkedHashSet;

    move-result-object p1

    return-object p1
.end method

.method protected x0(Lii/d;Lmh/l;)Ljava/util/LinkedHashSet;
    .locals 3

    const-string v0, "kindFilter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LNh/z;->c1()LBh/e;

    move-result-object v0

    invoke-interface {v0}, LBh/h;->k()Lpi/v0;

    move-result-object v0

    invoke-interface {v0}, Lpi/v0;->a()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "getSupertypes(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-virtual {p0}, LNh/U;->N()Loi/i;

    move-result-object v0

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LNh/c;

    invoke-interface {v0}, LNh/c;->a()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {v1, v0}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0}, LNh/U;->N()Loi/i;

    move-result-object v0

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LNh/c;

    invoke-interface {v0}, LNh/c;->d()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {v1, v0}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0, p1, p2}, LNh/z;->v(Lii/d;Lmh/l;)Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {v1, p1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0}, LNh/U;->L()LMh/k;

    move-result-object p1

    invoke-virtual {p1}, LMh/k;->a()LMh/d;

    move-result-object p1

    invoke-virtual {p1}, LMh/d;->w()Lgi/f;

    move-result-object p1

    invoke-virtual {p0}, LNh/z;->c1()LBh/e;

    move-result-object p2

    invoke-virtual {p0}, LNh/U;->L()LMh/k;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lgi/f;->e(LBh/e;LMh/k;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {v1, p1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    return-object v1
.end method

.method protected y(Ljava/util/Collection;LZh/f;)V
    .locals 3

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LNh/z;->o:LQh/g;

    invoke-interface {v0}, LQh/g;->p()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, LNh/U;->N()Loi/i;

    move-result-object v0

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LNh/c;

    invoke-interface {v0, p2}, LNh/c;->f(LZh/f;)LQh/w;

    move-result-object v0

    if-eqz v0, :cond_3

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LBh/f0;

    invoke-interface {v1}, LBh/a;->i()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_2
    :goto_0
    invoke-virtual {p0}, LNh/U;->N()Loi/i;

    move-result-object v0

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LNh/c;

    invoke-interface {v0, p2}, LNh/c;->f(LZh/f;)LQh/w;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {p0, v0}, LNh/z;->p1(LQh/w;)LLh/e;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_3
    :goto_1
    invoke-virtual {p0}, LNh/U;->L()LMh/k;

    move-result-object v0

    invoke-virtual {v0}, LMh/k;->a()LMh/d;

    move-result-object v0

    invoke-virtual {v0}, LMh/d;->w()Lgi/f;

    move-result-object v0

    invoke-virtual {p0}, LNh/z;->c1()LBh/e;

    move-result-object v1

    invoke-virtual {p0}, LNh/U;->L()LMh/k;

    move-result-object v2

    invoke-interface {v0, v1, p2, p1, v2}, Lgi/f;->f(LBh/e;LZh/f;Ljava/util/Collection;LMh/k;)V

    return-void
.end method

.method protected y0()LNh/b;
    .locals 3

    new-instance v0, LNh/b;

    iget-object v1, p0, LNh/z;->o:LQh/g;

    sget-object v2, LNh/u;->a:LNh/u;

    invoke-direct {v0, v1, v2}, LNh/b;-><init>(LQh/g;Lmh/l;)V

    return-object v0
.end method

.method public bridge synthetic z()LNh/c;
    .locals 1

    invoke-virtual {p0}, LNh/z;->y0()LNh/b;

    move-result-object v0

    return-object v0
.end method
