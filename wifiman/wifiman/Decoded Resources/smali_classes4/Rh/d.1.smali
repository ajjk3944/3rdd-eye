.class public abstract LRh/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LRh/d$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final G(LRh/l;LRh/l;)LRh/l;
    .locals 2

    if-nez p1, :cond_0

    return-object p2

    :cond_0
    if-nez p2, :cond_1

    return-object p1

    :cond_1
    invoke-virtual {p1}, LRh/l;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p2}, LRh/l;->d()Z

    move-result v0

    if-nez v0, :cond_2

    return-object p2

    :cond_2
    invoke-virtual {p1}, LRh/l;->d()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p2}, LRh/l;->d()Z

    move-result v0

    if-eqz v0, :cond_3

    return-object p1

    :cond_3
    invoke-virtual {p1}, LRh/l;->c()LRh/k;

    move-result-object v0

    invoke-virtual {p2}, LRh/l;->c()LRh/k;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-gez v0, :cond_4

    return-object p2

    :cond_4
    invoke-virtual {p1}, LRh/l;->c()LRh/k;

    move-result-object v0

    invoke-virtual {p2}, LRh/l;->c()LRh/k;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-lez v0, :cond_5

    return-object p1

    :cond_5
    return-object p2
.end method

.method private final H(Lri/i;)Ljava/util/List;
    .locals 4

    invoke-virtual {p0}, LRh/d;->A()Lri/o;

    move-result-object v0

    new-instance v1, LRh/d$a;

    invoke-virtual {p0}, LRh/d;->r()LJh/E;

    move-result-object v2

    invoke-direct {p0, p1, v2}, LRh/d;->f(Lri/i;LJh/E;)LJh/E;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v1, p1, v2, v3}, LRh/d$a;-><init>(Lri/i;LJh/E;Lri/n;)V

    new-instance p1, LRh/c;

    invoke-direct {p1, p0, v0}, LRh/c;-><init>(LRh/d;Lri/o;)V

    invoke-direct {p0, v1, p1}, LRh/d;->j(Ljava/lang/Object;Lmh/l;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private static final I(LRh/d;Lri/o;LRh/d$a;)Ljava/lang/Iterable;
    .locals 8

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LRh/d;->z()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, LRh/d$a;->b()Lri/i;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1, v0}, Lri/o;->R(Lri/i;)Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p2}, LRh/d$a;->b()Lri/i;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-interface {p1, v0}, Lri/o;->f0(Lri/i;)Lri/m;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-interface {p1, v0}, Lri/o;->j0(Lri/m;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    check-cast v0, Ljava/lang/Iterable;

    invoke-virtual {p2}, LRh/d$a;->b()Lri/i;

    move-result-object v2

    invoke-interface {p1, v2}, Lri/o;->H(Lri/i;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v0, v6}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-static {v2, v6}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(I)V

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lri/l;

    check-cast v0, Lri/n;

    invoke-interface {p1, v2}, Lri/o;->p(Lri/l;)Z

    move-result v6

    if-eqz v6, :cond_1

    new-instance v2, LRh/d$a;

    invoke-virtual {p2}, LRh/d$a;->a()LJh/E;

    move-result-object v6

    invoke-direct {v2, v1, v6, v0}, LRh/d$a;-><init>(Lri/i;LJh/E;Lri/n;)V

    goto :goto_1

    :cond_1
    invoke-interface {p1, v2}, Lri/o;->j(Lri/l;)Lri/i;

    move-result-object v2

    new-instance v6, LRh/d$a;

    invoke-virtual {p2}, LRh/d$a;->a()LJh/E;

    move-result-object v7

    invoke-direct {p0, v2, v7}, LRh/d;->f(Lri/i;LJh/E;)LJh/E;

    move-result-object v7

    invoke-direct {v6, v2, v7, v0}, LRh/d$a;-><init>(Lri/i;LJh/E;Lri/n;)V

    move-object v2, v6

    :goto_1
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    move-object v1, v5

    :cond_3
    return-object v1
.end method

.method static synthetic a(LRh/d;LRh/d$a;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1, p2}, LRh/d;->i(LRh/d;LRh/d$a;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method static synthetic b(LRh/j0;[LRh/h;I)LRh/h;
    .locals 0

    invoke-static {p0, p1, p2}, LRh/d;->e(LRh/j0;[LRh/h;I)LRh/h;

    move-result-object p0

    return-object p0
.end method

.method static synthetic c(LRh/d;Lri/o;LRh/d$a;)Ljava/lang/Iterable;
    .locals 0

    invoke-static {p0, p1, p2}, LRh/d;->I(LRh/d;Lri/o;LRh/d$a;)Ljava/lang/Iterable;

    move-result-object p0

    return-object p0
.end method

.method private static final e(LRh/j0;[LRh/h;I)LRh/h;
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LRh/j0;->b()Ljava/util/Map;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LRh/h;

    if-nez p0, :cond_2

    :cond_0
    if-ltz p2, :cond_1

    array-length p0, p1

    if-ge p2, p0, :cond_1

    aget-object p0, p1, p2

    goto :goto_0

    :cond_1
    sget-object p0, LRh/h;->e:LRh/h$a;

    invoke-virtual {p0}, LRh/h$a;->a()LRh/h;

    move-result-object p0

    :cond_2
    :goto_0
    return-object p0
.end method

.method private final f(Lri/i;LJh/E;)LJh/E;
    .locals 1

    invoke-virtual {p0}, LRh/d;->m()LJh/b;

    move-result-object v0

    invoke-virtual {p0, p1}, LRh/d;->n(Lri/i;)Ljava/lang/Iterable;

    move-result-object p1

    invoke-virtual {v0, p2, p1}, LJh/b;->d(LJh/E;Ljava/lang/Iterable;)LJh/E;

    move-result-object p1

    return-object p1
.end method

.method private final g(Lri/i;)LRh/h;
    .locals 6

    invoke-direct {p0, p1}, LRh/d;->y(Lri/i;)LRh/k;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, LRh/d;->v(Lri/i;)Lri/i;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-direct {p0, v2}, LRh/d;->y(Lri/i;)LRh/k;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    goto :goto_0

    :cond_1
    move-object v2, v0

    :goto_0
    invoke-virtual {p0}, LRh/d;->A()Lri/o;

    move-result-object v3

    sget-object v4, LAh/c;->a:LAh/c;

    invoke-interface {v3, p1}, Lri/o;->b0(Lri/i;)Lri/j;

    move-result-object v5

    invoke-virtual {p0, v5}, LRh/d;->x(Lri/i;)LZh/d;

    move-result-object v5

    invoke-virtual {v4, v5}, LAh/c;->l(LZh/d;)Z

    move-result v5

    if-eqz v5, :cond_2

    sget-object v1, LRh/i;->READ_ONLY:LRh/i;

    goto :goto_1

    :cond_2
    invoke-interface {v3, p1}, Lri/o;->F0(Lri/i;)Lri/j;

    move-result-object v3

    invoke-virtual {p0, v3}, LRh/d;->x(Lri/i;)LZh/d;

    move-result-object v3

    invoke-virtual {v4, v3}, LAh/c;->k(LZh/d;)Z

    move-result v3

    if-eqz v3, :cond_3

    sget-object v1, LRh/i;->MUTABLE:LRh/i;

    :cond_3
    :goto_1
    invoke-virtual {p0}, LRh/d;->A()Lri/o;

    move-result-object v3

    invoke-interface {v3, p1}, Lri/o;->K(Lri/i;)Z

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-nez v3, :cond_5

    invoke-virtual {p0, p1}, LRh/d;->F(Lri/i;)Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_2

    :cond_4
    move p1, v5

    goto :goto_3

    :cond_5
    :goto_2
    move p1, v4

    :goto_3
    new-instance v3, LRh/h;

    if-eq v2, v0, :cond_6

    goto :goto_4

    :cond_6
    move v4, v5

    :goto_4
    invoke-direct {v3, v2, v1, p1, v4}, LRh/h;-><init>(LRh/k;LRh/i;ZZ)V

    return-object v3
.end method

.method private final h(LRh/d$a;)LRh/h;
    .locals 11

    invoke-virtual {p1}, LRh/d$a;->b()Lri/i;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-virtual {p0}, LRh/d;->A()Lri/o;

    move-result-object v0

    invoke-virtual {p1}, LRh/d$a;->c()Lri/n;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v2}, Lri/o;->E(Lri/n;)Lri/s;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    sget-object v2, Lri/s;->IN:Lri/s;

    if-ne v0, v2, :cond_1

    sget-object p1, LRh/h;->e:LRh/h$a;

    invoke-virtual {p1}, LRh/h$a;->a()LRh/h;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p1}, LRh/d$a;->c()Lri/n;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v0, :cond_2

    move v0, v3

    goto :goto_1

    :cond_2
    move v0, v2

    :goto_1
    invoke-virtual {p1}, LRh/d$a;->b()Lri/i;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {p0, v4}, LRh/d;->n(Lri/i;)Ljava/lang/Iterable;

    move-result-object v4

    if-nez v4, :cond_4

    :cond_3
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    :cond_4
    invoke-virtual {p0}, LRh/d;->A()Lri/o;

    move-result-object v5

    invoke-virtual {p1}, LRh/d$a;->b()Lri/i;

    move-result-object v6

    if-eqz v6, :cond_5

    invoke-interface {v5, v6}, Lri/o;->f0(Lri/i;)Lri/m;

    move-result-object v6

    if-eqz v6, :cond_5

    invoke-interface {v5, v6}, Lri/o;->e0(Lri/m;)Lri/n;

    move-result-object v5

    goto :goto_2

    :cond_5
    move-object v5, v1

    :goto_2
    invoke-virtual {p0}, LRh/d;->q()LJh/c;

    move-result-object v6

    sget-object v7, LJh/c;->TYPE_PARAMETER_BOUNDS:LJh/c;

    if-ne v6, v7, :cond_6

    move v6, v3

    goto :goto_3

    :cond_6
    move v6, v2

    :goto_3
    if-nez v0, :cond_7

    goto :goto_5

    :cond_7
    if-nez v6, :cond_a

    invoke-virtual {p0}, LRh/d;->u()Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-virtual {p1}, LRh/d$a;->b()Lri/i;

    move-result-object v7

    if-eqz v7, :cond_a

    invoke-virtual {p0, v7}, LRh/d;->B(Lri/i;)Z

    move-result v7

    if-ne v7, v3, :cond_a

    invoke-virtual {p0}, LRh/d;->p()Ljava/lang/Iterable;

    move-result-object v7

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_8
    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_9

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {p0}, LRh/d;->m()LJh/b;

    move-result-object v10

    invoke-virtual {v10, v9}, LJh/b;->p(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_8

    invoke-interface {v8, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_9
    invoke-static {v8, v4}, LZg/v;->M0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    goto :goto_5

    :cond_a
    invoke-virtual {p0}, LRh/d;->p()Ljava/lang/Iterable;

    move-result-object v7

    invoke-static {v7, v4}, LZg/v;->K0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    :goto_5
    invoke-virtual {p0}, LRh/d;->m()LJh/b;

    move-result-object v7

    invoke-virtual {v7, v4}, LJh/b;->g(Ljava/lang/Iterable;)LRh/i;

    move-result-object v7

    invoke-virtual {p0}, LRh/d;->m()LJh/b;

    move-result-object v8

    new-instance v9, LRh/a;

    invoke-direct {v9, p0, p1}, LRh/a;-><init>(LRh/d;LRh/d$a;)V

    invoke-virtual {v8, v4, v9}, LJh/b;->h(Ljava/lang/Iterable;Lmh/l;)LRh/l;

    move-result-object v4

    if-eqz v4, :cond_c

    new-instance p1, LRh/h;

    invoke-virtual {v4}, LRh/l;->c()LRh/k;

    move-result-object v0

    invoke-virtual {v4}, LRh/l;->c()LRh/k;

    move-result-object v1

    sget-object v6, LRh/k;->NOT_NULL:LRh/k;

    if-ne v1, v6, :cond_b

    if-eqz v5, :cond_b

    move v2, v3

    :cond_b
    invoke-virtual {v4}, LRh/l;->d()Z

    move-result v1

    invoke-direct {p1, v0, v7, v2, v1}, LRh/h;-><init>(LRh/k;LRh/i;ZZ)V

    return-object p1

    :cond_c
    if-nez v0, :cond_e

    if-eqz v6, :cond_d

    goto :goto_6

    :cond_d
    sget-object v0, LJh/c;->TYPE_USE:LJh/c;

    goto :goto_7

    :cond_e
    :goto_6
    invoke-virtual {p0}, LRh/d;->q()LJh/c;

    move-result-object v0

    :goto_7
    invoke-virtual {p1}, LRh/d$a;->a()LJh/E;

    move-result-object v4

    if-eqz v4, :cond_f

    invoke-virtual {v4, v0}, LJh/E;->a(LJh/c;)LJh/w;

    move-result-object v0

    goto :goto_8

    :cond_f
    move-object v0, v1

    :goto_8
    if-eqz v5, :cond_10

    invoke-direct {p0, v5}, LRh/d;->o(Lri/n;)LRh/l;

    move-result-object v4

    goto :goto_9

    :cond_10
    move-object v4, v1

    :goto_9
    invoke-virtual {p0, v4, v0}, LRh/d;->t(LRh/l;LJh/w;)LRh/l;

    move-result-object v6

    if-eqz v4, :cond_11

    invoke-virtual {v4}, LRh/l;->c()LRh/k;

    move-result-object v4

    goto :goto_a

    :cond_11
    move-object v4, v1

    :goto_a
    sget-object v8, LRh/k;->NOT_NULL:LRh/k;

    if-eq v4, v8, :cond_13

    if-eqz v5, :cond_12

    if-eqz v0, :cond_12

    invoke-virtual {v0}, LJh/w;->c()Z

    move-result v0

    if-ne v0, v3, :cond_12

    goto :goto_b

    :cond_12
    move v0, v2

    goto :goto_c

    :cond_13
    :goto_b
    move v0, v3

    :goto_c
    invoke-virtual {p1}, LRh/d$a;->c()Lri/n;

    move-result-object p1

    if-eqz p1, :cond_14

    invoke-direct {p0, p1}, LRh/d;->o(Lri/n;)LRh/l;

    move-result-object p1

    if-eqz p1, :cond_14

    invoke-virtual {p1}, LRh/l;->c()LRh/k;

    move-result-object v4

    sget-object v5, LRh/k;->NULLABLE:LRh/k;

    if-ne v4, v5, :cond_15

    sget-object v4, LRh/k;->FORCE_FLEXIBILITY:LRh/k;

    const/4 v5, 0x2

    invoke-static {p1, v4, v2, v5, v1}, LRh/l;->b(LRh/l;LRh/k;ZILjava/lang/Object;)LRh/l;

    move-result-object p1

    goto :goto_d

    :cond_14
    move-object p1, v1

    :cond_15
    :goto_d
    invoke-direct {p0, p1, v6}, LRh/d;->G(LRh/l;LRh/l;)LRh/l;

    move-result-object p1

    new-instance v4, LRh/h;

    if-eqz p1, :cond_16

    invoke-virtual {p1}, LRh/l;->c()LRh/k;

    move-result-object v1

    :cond_16
    if-eqz p1, :cond_17

    invoke-virtual {p1}, LRh/l;->d()Z

    move-result p1

    if-ne p1, v3, :cond_17

    move v2, v3

    :cond_17
    invoke-direct {v4, v1, v7, v0, v2}, LRh/h;-><init>(LRh/k;LRh/i;ZZ)V

    return-object v4
.end method

.method private static final i(LRh/d;LRh/d$a;Ljava/lang/Object;)Z
    .locals 1

    const-string v0, "$this$extractNullability"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LRh/d$a;->b()Lri/i;

    move-result-object p1

    invoke-virtual {p0, p2, p1}, LRh/d;->l(Ljava/lang/Object;Lri/i;)Z

    move-result p0

    return p0
.end method

.method private final j(Ljava/lang/Object;Lmh/l;)Ljava/util/List;
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-direct {p0, p1, v0, p2}, LRh/d;->k(Ljava/lang/Object;Ljava/util/List;Lmh/l;)V

    return-object v0
.end method

.method private final k(Ljava/lang/Object;Ljava/util/List;Lmh/l;)V
    .locals 1

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p3, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0, p2, p3}, LRh/d;->k(Ljava/lang/Object;Ljava/util/List;Lmh/l;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private final o(Lri/n;)LRh/l;
    .locals 6

    invoke-virtual {p0}, LRh/d;->A()Lri/o;

    move-result-object v0

    invoke-virtual {p0, p1}, LRh/d;->E(Lri/n;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return-object v2

    :cond_0
    invoke-interface {v0, p1}, Lri/o;->S(Lri/n;)Ljava/util/List;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Ljava/lang/Iterable;

    instance-of v3, v1, Ljava/util/Collection;

    if-eqz v3, :cond_1

    move-object v4, v1

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_1

    goto/16 :goto_6

    :cond_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_e

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lri/i;

    invoke-interface {v0, v5}, Lri/o;->w0(Lri/i;)Z

    move-result v5

    if-nez v5, :cond_2

    if-eqz v3, :cond_3

    move-object v4, v1

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_0

    :cond_3
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lri/i;

    invoke-direct {p0, v5}, LRh/d;->y(Lri/i;)LRh/k;

    move-result-object v5

    if-eqz v5, :cond_4

    move-object v2, p1

    goto :goto_2

    :cond_5
    :goto_0
    if-eqz v3, :cond_6

    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_6

    goto/16 :goto_6

    :cond_6
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_e

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lri/i;

    invoke-virtual {p0, v4}, LRh/d;->v(Lri/i;)Lri/i;

    move-result-object v4

    if-eqz v4, :cond_7

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_8
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lri/i;

    invoke-virtual {p0, v3}, LRh/d;->v(Lri/i;)Lri/i;

    move-result-object v3

    if-eqz v3, :cond_8

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_9
    :goto_2
    move-object v1, v2

    check-cast v1, Ljava/lang/Iterable;

    instance-of v3, v1, Ljava/util/Collection;

    if-eqz v3, :cond_a

    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_a

    goto :goto_3

    :cond_a
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lri/i;

    invoke-interface {v0, v3}, Lri/o;->v0(Lri/i;)Z

    move-result v3

    if-nez v3, :cond_b

    sget-object v0, LRh/k;->NOT_NULL:LRh/k;

    goto :goto_4

    :cond_c
    :goto_3
    sget-object v0, LRh/k;->NULLABLE:LRh/k;

    :goto_4
    new-instance v1, LRh/l;

    if-eq v2, p1, :cond_d

    const/4 p1, 0x1

    goto :goto_5

    :cond_d
    const/4 p1, 0x0

    :goto_5
    invoke-direct {v1, v0, p1}, LRh/l;-><init>(LRh/k;Z)V

    return-object v1

    :cond_e
    :goto_6
    return-object v2
.end method

.method private final y(Lri/i;)LRh/k;
    .locals 2

    invoke-virtual {p0}, LRh/d;->A()Lri/o;

    move-result-object v0

    invoke-interface {v0, p1}, Lri/o;->b0(Lri/i;)Lri/j;

    move-result-object v1

    invoke-interface {v0, v1}, Lri/o;->t(Lri/j;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object p1, LRh/k;->NULLABLE:LRh/k;

    goto :goto_0

    :cond_0
    invoke-interface {v0, p1}, Lri/o;->F0(Lri/i;)Lri/j;

    move-result-object p1

    invoke-interface {v0, p1}, Lri/o;->t(Lri/j;)Z

    move-result p1

    if-nez p1, :cond_1

    sget-object p1, LRh/k;->NOT_NULL:LRh/k;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method


# virtual methods
.method public abstract A()Lri/o;
.end method

.method public abstract B(Lri/i;)Z
.end method

.method public abstract C()Z
.end method

.method public abstract D(Lri/i;Lri/i;)Z
.end method

.method public abstract E(Lri/n;)Z
.end method

.method public abstract F(Lri/i;)Z
.end method

.method public final d(Lri/i;Ljava/lang/Iterable;LRh/j0;Z)Lmh/l;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "overrides"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LRh/d;->H(Lri/i;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p2, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lri/i;

    invoke-direct {p0, v3}, LRh/d;->H(Lri/i;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LRh/d;->w()Z

    move-result v2

    const/4 v3, 0x1

    if-nez v2, :cond_4

    invoke-virtual {p0}, LRh/d;->C()Z

    move-result v2

    if-eqz v2, :cond_3

    instance-of v2, p2, Ljava/util/Collection;

    if-eqz v2, :cond_1

    move-object v2, p2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lri/i;

    invoke-virtual {p0, p1, v2}, LRh/d;->D(Lri/i;Lri/i;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    goto :goto_3

    :cond_4
    :goto_2
    move p1, v3

    :goto_3
    new-array p2, p1, [LRh/h;

    const/4 v2, 0x0

    move v4, v2

    :goto_4
    if-ge v4, p1, :cond_a

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LRh/d$a;

    invoke-direct {p0, v5}, LRh/d;->h(LRh/d$a;)LRh/h;

    move-result-object v5

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_5
    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_7

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v8, v4}, LZg/v;->t0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LRh/d$a;

    if-eqz v8, :cond_6

    invoke-virtual {v8}, LRh/d$a;->b()Lri/i;

    move-result-object v8

    if-eqz v8, :cond_6

    invoke-direct {p0, v8}, LRh/d;->g(Lri/i;)LRh/h;

    move-result-object v8

    goto :goto_6

    :cond_6
    const/4 v8, 0x0

    :goto_6
    if-eqz v8, :cond_5

    invoke-interface {v6, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_7
    if-nez v4, :cond_8

    invoke-virtual {p0}, LRh/d;->C()Z

    move-result v7

    if-eqz v7, :cond_8

    move v7, v3

    goto :goto_7

    :cond_8
    move v7, v2

    :goto_7
    if-nez v4, :cond_9

    invoke-virtual {p0}, LRh/d;->s()Z

    move-result v8

    if-eqz v8, :cond_9

    move v8, v3

    goto :goto_8

    :cond_9
    move v8, v2

    :goto_8
    invoke-static {v5, v6, v7, v8, p4}, LRh/l0;->a(LRh/h;Ljava/util/Collection;ZZZ)LRh/h;

    move-result-object v5

    aput-object v5, p2, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_a
    new-instance p1, LRh/b;

    invoke-direct {p1, p3, p2}, LRh/b;-><init>(LRh/j0;[LRh/h;)V

    return-object p1
.end method

.method public abstract l(Ljava/lang/Object;Lri/i;)Z
.end method

.method public abstract m()LJh/b;
.end method

.method public abstract n(Lri/i;)Ljava/lang/Iterable;
.end method

.method public abstract p()Ljava/lang/Iterable;
.end method

.method public abstract q()LJh/c;
.end method

.method public abstract r()LJh/E;
.end method

.method public abstract s()Z
.end method

.method protected abstract t(LRh/l;LJh/w;)LRh/l;
.end method

.method public abstract u()Z
.end method

.method public abstract v(Lri/i;)Lri/i;
.end method

.method public w()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract x(Lri/i;)LZh/d;
.end method

.method public abstract z()Z
.end method
