.class final LNh/n$b;
.super Lpi/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LNh/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field private final d:Loi/i;

.field final synthetic e:LNh/n;


# direct methods
.method public constructor <init>(LNh/n;)V
    .locals 2

    iput-object p1, p0, LNh/n$b;->e:LNh/n;

    invoke-static {p1}, LNh/n;->L0(LNh/n;)LMh/k;

    move-result-object v0

    invoke-virtual {v0}, LMh/k;->e()Loi/n;

    move-result-object v0

    invoke-direct {p0, v0}, Lpi/b;-><init>(Loi/n;)V

    invoke-static {p1}, LNh/n;->L0(LNh/n;)LMh/k;

    move-result-object v0

    invoke-virtual {v0}, LMh/k;->e()Loi/n;

    move-result-object v0

    new-instance v1, LNh/o;

    invoke-direct {v1, p1}, LNh/o;-><init>(LNh/n;)V

    invoke-interface {v0, v1}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p1

    iput-object p1, p0, LNh/n$b;->d:Loi/i;

    return-void
.end method

.method static synthetic J(LNh/n;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, LNh/n$b;->M(LNh/n;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private final K()Lpi/S;
    .locals 8

    invoke-direct {p0}, LNh/n$b;->L()LZh/c;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LZh/c;->d()Z

    move-result v2

    if-nez v2, :cond_0

    sget-object v2, Lkotlin/reflect/jvm/internal/impl/builtins/o;->z:LZh/f;

    invoke-virtual {v0, v2}, LZh/c;->i(LZh/f;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_1

    sget-object v2, LJh/r;->a:LJh/r;

    iget-object v3, p0, LNh/n$b;->e:LNh/n;

    invoke-static {v3}, Lfi/e;->o(LBh/m;)LZh/c;

    move-result-object v3

    invoke-virtual {v2, v3}, LJh/r;->b(LZh/c;)LZh/c;

    move-result-object v2

    if-nez v2, :cond_2

    return-object v1

    :cond_1
    move-object v2, v0

    :cond_2
    iget-object v3, p0, LNh/n$b;->e:LNh/n;

    invoke-static {v3}, LNh/n;->L0(LNh/n;)LMh/k;

    move-result-object v3

    invoke-virtual {v3}, LMh/k;->d()LBh/G;

    move-result-object v3

    sget-object v4, LIh/d;->FROM_JAVA_LOADER:LIh/d;

    invoke-static {v3, v2, v4}, Lfi/e;->B(LBh/G;LZh/c;LIh/b;)LBh/e;

    move-result-object v2

    if-nez v2, :cond_3

    return-object v1

    :cond_3
    invoke-interface {v2}, LBh/h;->k()Lpi/v0;

    move-result-object v3

    invoke-interface {v3}, Lpi/v0;->getParameters()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    iget-object v4, p0, LNh/n$b;->e:LNh/n;

    invoke-virtual {v4}, LNh/n;->k()Lpi/v0;

    move-result-object v4

    invoke-interface {v4}, Lpi/v0;->getParameters()Ljava/util/List;

    move-result-object v4

    const-string v5, "getParameters(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    const/16 v6, 0xa

    if-ne v5, v3, :cond_4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {v4, v6}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LBh/l0;

    new-instance v4, Lpi/D0;

    sget-object v5, Lpi/N0;->INVARIANT:Lpi/N0;

    invoke-interface {v3}, LBh/h;->u()Lpi/d0;

    move-result-object v3

    invoke-direct {v4, v5, v3}, Lpi/D0;-><init>(Lpi/N0;Lpi/S;)V

    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    const/4 v7, 0x1

    if-ne v5, v7, :cond_7

    if-le v3, v7, :cond_7

    if-nez v0, :cond_7

    new-instance v0, Lpi/D0;

    sget-object v1, Lpi/N0;->INVARIANT:Lpi/N0;

    invoke-static {v4}, LZg/v;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LBh/l0;

    invoke-interface {v4}, LBh/h;->u()Lpi/d0;

    move-result-object v4

    invoke-direct {v0, v1, v4}, Lpi/D0;-><init>(Lpi/N0;Lpi/S;)V

    new-instance v1, Lsh/i;

    invoke-direct {v1, v7, v3}, Lsh/i;-><init>(II)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v1, v6}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    move-object v4, v1

    check-cast v4, LZg/Q;

    invoke-virtual {v4}, LZg/Q;->d()I

    invoke-interface {v3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    move-object v0, v3

    :cond_6
    sget-object v1, Lpi/r0;->b:Lpi/r0$a;

    invoke-virtual {v1}, Lpi/r0$a;->j()Lpi/r0;

    move-result-object v1

    invoke-static {v1, v2, v0}, Lpi/V;->h(Lpi/r0;LBh/e;Ljava/util/List;)Lpi/d0;

    move-result-object v0

    return-object v0

    :cond_7
    return-object v1
.end method

.method private final L()LZh/c;
    .locals 3

    iget-object v0, p0, LNh/n$b;->e:LNh/n;

    invoke-virtual {v0}, LNh/n;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v0

    sget-object v1, LJh/I;->r:LZh/c;

    const-string v2, "PURELY_IMPLEMENTS_ANNOTATION"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->l(LZh/c;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-interface {v0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;->a()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, LZg/v;->S0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Ldi/x;

    if-eqz v2, :cond_1

    check-cast v0, Ldi/x;

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ldi/g;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {v0}, LZh/e;->e(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_3

    return-object v1

    :cond_3
    new-instance v1, LZh/c;

    invoke-direct {v1, v0}, LZh/c;-><init>(Ljava/lang/String;)V

    :cond_4
    :goto_1
    return-object v1
.end method

.method private static final M(LNh/n;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, LBh/p0;->g(LBh/i;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public I()LBh/e;
    .locals 1

    iget-object v0, p0, LNh/n$b;->e:LNh/n;

    return-object v0
.end method

.method public bridge synthetic c()LBh/h;
    .locals 1

    invoke-virtual {p0}, LNh/n$b;->I()LBh/e;

    move-result-object v0

    return-object v0
.end method

.method public d()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public getParameters()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LNh/n$b;->d:Loi/i;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method protected r()Ljava/util/Collection;
    .locals 13

    iget-object v0, p0, LNh/n$b;->e:LNh/n;

    invoke-virtual {v0}, LNh/n;->S0()LQh/g;

    move-result-object v0

    invoke-interface {v0}, LQh/g;->a()Ljava/util/Collection;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v2, Ljava/util/ArrayList;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-direct {p0}, LNh/n$b;->K()Lpi/S;

    move-result-object v3

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LQh/j;

    iget-object v6, p0, LNh/n$b;->e:LNh/n;

    invoke-static {v6}, LNh/n;->L0(LNh/n;)LMh/k;

    move-result-object v6

    invoke-virtual {v6}, LMh/k;->g()LOh/e;

    move-result-object v6

    sget-object v7, Lpi/I0;->SUPERTYPE:Lpi/I0;

    const/4 v11, 0x7

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, LOh/b;->b(Lpi/I0;ZZLBh/l0;ILjava/lang/Object;)LOh/a;

    move-result-object v7

    invoke-virtual {v6, v4, v7}, LOh/e;->p(LQh/x;LOh/a;)Lpi/S;

    move-result-object v6

    iget-object v7, p0, LNh/n$b;->e:LNh/n;

    invoke-static {v7}, LNh/n;->L0(LNh/n;)LMh/k;

    move-result-object v7

    invoke-virtual {v7}, LMh/k;->a()LMh/d;

    move-result-object v7

    invoke-virtual {v7}, LMh/d;->r()LRh/e0;

    move-result-object v7

    iget-object v8, p0, LNh/n$b;->e:LNh/n;

    invoke-static {v8}, LNh/n;->L0(LNh/n;)LMh/k;

    move-result-object v8

    invoke-virtual {v7, v6, v8}, LRh/e0;->q(Lpi/S;LMh/k;)Lpi/S;

    move-result-object v6

    invoke-virtual {v6}, Lpi/S;->N0()Lpi/v0;

    move-result-object v7

    invoke-interface {v7}, Lpi/v0;->c()LBh/h;

    move-result-object v7

    instance-of v7, v7, LBh/L$b;

    if-eqz v7, :cond_1

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-virtual {v6}, Lpi/S;->N0()Lpi/v0;

    move-result-object v4

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lpi/S;->N0()Lpi/v0;

    move-result-object v5

    :cond_2
    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_0

    :cond_3
    invoke-static {v6}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->b0(Lpi/S;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    iget-object v0, p0, LNh/n$b;->e:LNh/n;

    invoke-static {v0}, LNh/n;->K0(LNh/n;)LBh/e;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v4, p0, LNh/n$b;->e:LNh/n;

    invoke-static {v0, v4}, LAh/y;->a(LBh/e;LBh/e;)Lpi/w0;

    move-result-object v4

    invoke-virtual {v4}, Lpi/E0;->c()Lpi/G0;

    move-result-object v4

    invoke-interface {v0}, LBh/e;->u()Lpi/d0;

    move-result-object v0

    sget-object v5, Lpi/N0;->INVARIANT:Lpi/N0;

    invoke-virtual {v4, v0, v5}, Lpi/G0;->p(Lpi/S;Lpi/N0;)Lpi/S;

    move-result-object v5

    :cond_5
    invoke-static {v1, v5}, Lxi/a;->a(Ljava/util/Collection;Ljava/lang/Object;)V

    invoke-static {v1, v3}, Lxi/a;->a(Ljava/util/Collection;Ljava/lang/Object;)V

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, p0, LNh/n$b;->e:LNh/n;

    invoke-static {v0}, LNh/n;->L0(LNh/n;)LMh/k;

    move-result-object v0

    invoke-virtual {v0}, LMh/k;->a()LMh/d;

    move-result-object v0

    invoke-virtual {v0}, LMh/d;->c()Lli/w;

    move-result-object v0

    invoke-virtual {p0}, LNh/n$b;->I()LBh/e;

    move-result-object v3

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v2, v5}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LQh/x;

    const-string v6, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, LQh/j;

    invoke-interface {v5}, LQh/j;->s()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    invoke-interface {v0, v3, v4}, Lli/w;->b(LBh/e;Ljava/util/List;)V

    :cond_7
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    invoke-static {v1}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    :goto_2
    check-cast v0, Ljava/util/Collection;

    goto :goto_3

    :cond_8
    iget-object v0, p0, LNh/n$b;->e:LNh/n;

    invoke-static {v0}, LNh/n;->L0(LNh/n;)LMh/k;

    move-result-object v0

    invoke-virtual {v0}, LMh/k;->d()LBh/G;

    move-result-object v0

    invoke-interface {v0}, LBh/G;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->i()Lpi/d0;

    move-result-object v0

    invoke-static {v0}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_2

    :goto_3
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, LNh/n$b;->e:LNh/n;

    invoke-virtual {v0}, LDh/a;->getName()LZh/f;

    move-result-object v0

    invoke-virtual {v0}, LZh/f;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "asString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method protected v()LBh/j0;
    .locals 1

    iget-object v0, p0, LNh/n$b;->e:LNh/n;

    invoke-static {v0}, LNh/n;->L0(LNh/n;)LMh/k;

    move-result-object v0

    invoke-virtual {v0}, LMh/k;->a()LMh/d;

    move-result-object v0

    invoke-virtual {v0}, LMh/d;->v()LBh/j0;

    move-result-object v0

    return-object v0
.end method
