.class public final Lli/K;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lli/p;

.field private final b:Lli/g;


# direct methods
.method public constructor <init>(Lli/p;)V
    .locals 2

    const-string v0, "c"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lli/K;->a:Lli/p;

    new-instance v0, Lli/g;

    invoke-virtual {p1}, Lli/p;->c()Lli/n;

    move-result-object v1

    invoke-virtual {v1}, Lli/n;->q()LBh/G;

    move-result-object v1

    invoke-virtual {p1}, Lli/p;->c()Lli/n;

    move-result-object p1

    invoke-virtual {p1}, Lli/n;->r()LBh/L;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lli/g;-><init>(LBh/G;LBh/L;)V

    iput-object v0, p0, Lli/K;->b:Lli/g;

    return-void
.end method

.method private final A(LUh/q;Lli/p;LBh/a;I)LBh/b0;
    .locals 1

    invoke-virtual {p2}, Lli/p;->i()Lli/X;

    move-result-object p2

    invoke-virtual {p2, p1}, Lli/X;->u(LUh/q;)Lpi/S;

    move-result-object p1

    sget-object p2, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-virtual {p2}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->b()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object p2

    const/4 v0, 0x0

    invoke-static {p3, p1, v0, p2, p4}, Lbi/h;->b(LBh/a;Lpi/S;LZh/f;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;I)LBh/b0;

    move-result-object p1

    return-object p1
.end method

.method private final B(Ljava/util/List;Lkotlin/reflect/jvm/internal/impl/protobuf/n;Lli/d;)Ljava/util/List;
    .locals 25

    move-object/from16 v7, p0

    iget-object v0, v7, Lli/K;->a:Lli/p;

    invoke-virtual {v0}, Lli/p;->e()LBh/m;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v20, v0

    check-cast v20, LBh/a;

    invoke-interface/range {v20 .. v20}, LBh/n;->b()LBh/m;

    move-result-object v0

    const-string v1, "getContainingDeclaration(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v7, v0}, Lli/K;->i(LBh/m;)Lli/N;

    move-result-object v21

    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v15, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v15, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v22

    const/16 v23, 0x0

    move/from16 v11, v23

    :goto_0
    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    add-int/lit8 v24, v11, 0x1

    if-gez v11, :cond_0

    invoke-static {}, LZg/v;->v()V

    :cond_0
    move-object v8, v0

    check-cast v8, LUh/u;

    invoke-virtual {v8}, LUh/u;->a1()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v8}, LUh/u;->U0()I

    move-result v0

    move v9, v0

    goto :goto_1

    :cond_1
    move/from16 v9, v23

    :goto_1
    if-eqz v21, :cond_2

    sget-object v0, LWh/b;->c:LWh/b$b;

    invoke-virtual {v0, v9}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v10, Lni/T;

    iget-object v0, v7, Lli/K;->a:Lli/p;

    invoke-virtual {v0}, Lli/p;->h()Loi/n;

    move-result-object v12

    new-instance v13, Lli/H;

    move-object v0, v13

    move-object/from16 v1, p0

    move-object/from16 v2, v21

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move v5, v11

    move-object v6, v8

    invoke-direct/range {v0 .. v6}, Lli/H;-><init>(Lli/K;Lli/N;Lkotlin/reflect/jvm/internal/impl/protobuf/n;Lli/d;ILUh/u;)V

    invoke-direct {v10, v12, v13}, Lni/T;-><init>(Loi/n;Lmh/a;)V

    move-object v12, v10

    goto :goto_2

    :cond_2
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->b()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v0

    move-object v12, v0

    :goto_2
    iget-object v0, v7, Lli/K;->a:Lli/p;

    invoke-virtual {v0}, Lli/p;->g()LWh/c;

    move-result-object v0

    invoke-virtual {v8}, LUh/u;->V0()I

    move-result v1

    invoke-static {v0, v1}, Lli/L;->b(LWh/c;I)LZh/f;

    move-result-object v13

    iget-object v0, v7, Lli/K;->a:Lli/p;

    invoke-virtual {v0}, Lli/p;->i()Lli/X;

    move-result-object v0

    iget-object v1, v7, Lli/K;->a:Lli/p;

    invoke-virtual {v1}, Lli/p;->j()LWh/g;

    move-result-object v1

    invoke-static {v8, v1}, LWh/f;->q(LUh/u;LWh/g;)LUh/q;

    move-result-object v1

    invoke-virtual {v0, v1}, Lli/X;->u(LUh/q;)Lpi/S;

    move-result-object v14

    sget-object v0, LWh/b;->H:LWh/b$b;

    invoke-virtual {v0, v9}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "get(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    sget-object v2, LWh/b;->I:LWh/b$b;

    invoke-virtual {v2, v9}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v16

    sget-object v2, LWh/b;->J:LWh/b$b;

    invoke-virtual {v2, v9}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v17

    iget-object v1, v7, Lli/K;->a:Lli/p;

    invoke-virtual {v1}, Lli/p;->j()LWh/g;

    move-result-object v1

    invoke-static {v8, v1}, LWh/f;->t(LUh/u;LWh/g;)LUh/q;

    move-result-object v1

    if-eqz v1, :cond_3

    iget-object v2, v7, Lli/K;->a:Lli/p;

    invoke-virtual {v2}, Lli/p;->i()Lli/X;

    move-result-object v2

    invoke-virtual {v2, v1}, Lli/X;->u(LUh/q;)Lpi/S;

    move-result-object v1

    :goto_3
    move-object/from16 v18, v1

    goto :goto_4

    :cond_3
    const/4 v1, 0x0

    goto :goto_3

    :goto_4
    sget-object v1, LBh/g0;->a:LBh/g0;

    const-string v2, "NO_SOURCE"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, LDh/V;

    const/4 v10, 0x0

    move-object v8, v2

    move-object/from16 v9, v20

    move-object v3, v15

    move v15, v0

    move-object/from16 v19, v1

    invoke-direct/range {v8 .. v19}, LDh/V;-><init>(LBh/a;LBh/s0;ILkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;Lpi/S;ZZZLpi/S;LBh/g0;)V

    invoke-interface {v3, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v15, v3

    move/from16 v11, v24

    goto/16 :goto_0

    :cond_4
    move-object v3, v15

    invoke-static {v3}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private static final C(Lli/K;Lli/N;Lkotlin/reflect/jvm/internal/impl/protobuf/n;Lli/d;ILUh/u;)Ljava/util/List;
    .locals 6

    iget-object p0, p0, Lli/K;->a:Lli/p;

    invoke-virtual {p0}, Lli/p;->c()Lli/n;

    move-result-object p0

    invoke-virtual {p0}, Lli/n;->d()Lli/e;

    move-result-object v0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lli/h;->b(Lli/N;Lkotlin/reflect/jvm/internal/impl/protobuf/n;Lli/d;ILUh/u;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method static synthetic a(Lli/K;LUh/n;Lni/N;)Loi/j;
    .locals 0

    invoke-static {p0, p1, p2}, Lli/K;->v(Lli/K;LUh/n;Lni/N;)Loi/j;

    move-result-object p0

    return-object p0
.end method

.method static synthetic b(Lli/K;LUh/n;Lni/N;)Loi/j;
    .locals 0

    invoke-static {p0, p1, p2}, Lli/K;->x(Lli/K;LUh/n;Lni/N;)Loi/j;

    move-result-object p0

    return-object p0
.end method

.method static synthetic c(Lli/K;Lkotlin/reflect/jvm/internal/impl/protobuf/n;Lli/d;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2}, Lli/K;->k(Lli/K;Lkotlin/reflect/jvm/internal/impl/protobuf/n;Lli/d;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method static synthetic d(Lli/K;ZLUh/n;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2}, Lli/K;->n(Lli/K;ZLUh/n;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method static synthetic e(Lli/K;Lkotlin/reflect/jvm/internal/impl/protobuf/n;Lli/d;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2}, Lli/K;->p(Lli/K;Lkotlin/reflect/jvm/internal/impl/protobuf/n;Lli/d;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method static synthetic f(Lli/K;Lli/N;Lkotlin/reflect/jvm/internal/impl/protobuf/n;Lli/d;ILUh/u;)Ljava/util/List;
    .locals 0

    invoke-static/range {p0 .. p5}, Lli/K;->C(Lli/K;Lli/N;Lkotlin/reflect/jvm/internal/impl/protobuf/n;Lli/d;ILUh/u;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method static synthetic g(Lli/K;LUh/n;Lni/N;)Ldi/g;
    .locals 0

    invoke-static {p0, p1, p2}, Lli/K;->w(Lli/K;LUh/n;Lni/N;)Ldi/g;

    move-result-object p0

    return-object p0
.end method

.method static synthetic h(Lli/K;LUh/n;Lni/N;)Ldi/g;
    .locals 0

    invoke-static {p0, p1, p2}, Lli/K;->y(Lli/K;LUh/n;Lni/N;)Ldi/g;

    move-result-object p0

    return-object p0
.end method

.method private final i(LBh/m;)Lli/N;
    .locals 4

    instance-of v0, p1, LBh/M;

    if-eqz v0, :cond_0

    new-instance v0, Lli/N$b;

    check-cast p1, LBh/M;

    invoke-interface {p1}, LBh/M;->e()LZh/c;

    move-result-object p1

    iget-object v1, p0, Lli/K;->a:Lli/p;

    invoke-virtual {v1}, Lli/p;->g()LWh/c;

    move-result-object v1

    iget-object v2, p0, Lli/K;->a:Lli/p;

    invoke-virtual {v2}, Lli/p;->j()LWh/g;

    move-result-object v2

    iget-object v3, p0, Lli/K;->a:Lli/p;

    invoke-virtual {v3}, Lli/p;->d()Lni/s;

    move-result-object v3

    invoke-direct {v0, p1, v1, v2, v3}, Lli/N$b;-><init>(LZh/c;LWh/c;LWh/g;LBh/g0;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lni/m;

    if-eqz v0, :cond_1

    check-cast p1, Lni/m;

    invoke-virtual {p1}, Lni/m;->i1()Lli/N$a;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method private final j(Lkotlin/reflect/jvm/internal/impl/protobuf/n;ILli/d;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;
    .locals 2

    sget-object v0, LWh/b;->c:LWh/b$b;

    invoke-virtual {v0, p2}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_0

    sget-object p1, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->b()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p2, Lni/T;

    iget-object v0, p0, Lli/K;->a:Lli/p;

    invoke-virtual {v0}, Lli/p;->h()Loi/n;

    move-result-object v0

    new-instance v1, Lli/E;

    invoke-direct {v1, p0, p1, p3}, Lli/E;-><init>(Lli/K;Lkotlin/reflect/jvm/internal/impl/protobuf/n;Lli/d;)V

    invoke-direct {p2, v0, v1}, Lni/T;-><init>(Loi/n;Lmh/a;)V

    return-object p2
.end method

.method private static final k(Lli/K;Lkotlin/reflect/jvm/internal/impl/protobuf/n;Lli/d;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lli/K;->a:Lli/p;

    invoke-virtual {v0}, Lli/p;->e()LBh/m;

    move-result-object v0

    invoke-direct {p0, v0}, Lli/K;->i(LBh/m;)Lli/N;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lli/K;->a:Lli/p;

    invoke-virtual {p0}, Lli/p;->c()Lli/n;

    move-result-object p0

    invoke-virtual {p0}, Lli/n;->d()Lli/e;

    move-result-object p0

    invoke-interface {p0, v0, p1, p2}, Lli/h;->h(Lli/N;Lkotlin/reflect/jvm/internal/impl/protobuf/n;Lli/d;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p0

    :cond_1
    return-object p0
.end method

.method private final l()LBh/b0;
    .locals 3

    iget-object v0, p0, Lli/K;->a:Lli/p;

    invoke-virtual {v0}, Lli/p;->e()LBh/m;

    move-result-object v0

    instance-of v1, v0, LBh/e;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, LBh/e;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {v0}, LBh/e;->J0()LBh/b0;

    move-result-object v2

    :cond_1
    return-object v2
.end method

.method private final m(LUh/n;Z)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;
    .locals 3

    sget-object v0, LWh/b;->c:LWh/b$b;

    invoke-virtual {p1}, LUh/n;->k1()I

    move-result v1

    invoke-virtual {v0, v1}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->b()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Lni/T;

    iget-object v1, p0, Lli/K;->a:Lli/p;

    invoke-virtual {v1}, Lli/p;->h()Loi/n;

    move-result-object v1

    new-instance v2, Lli/F;

    invoke-direct {v2, p0, p2, p1}, Lli/F;-><init>(Lli/K;ZLUh/n;)V

    invoke-direct {v0, v1, v2}, Lni/T;-><init>(Loi/n;Lmh/a;)V

    return-object v0
.end method

.method private static final n(Lli/K;ZLUh/n;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lli/K;->a:Lli/p;

    invoke-virtual {v0}, Lli/p;->e()LBh/m;

    move-result-object v0

    invoke-direct {p0, v0}, Lli/K;->i(LBh/m;)Lli/N;

    move-result-object v0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    iget-object p0, p0, Lli/K;->a:Lli/p;

    invoke-virtual {p0}, Lli/p;->c()Lli/n;

    move-result-object p0

    invoke-virtual {p0}, Lli/n;->d()Lli/e;

    move-result-object p0

    invoke-interface {p0, v0, p2}, Lli/h;->f(Lli/N;LUh/n;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    goto :goto_0

    :cond_0
    iget-object p0, p0, Lli/K;->a:Lli/p;

    invoke-virtual {p0}, Lli/p;->c()Lli/n;

    move-result-object p0

    invoke-virtual {p0}, Lli/n;->d()Lli/e;

    move-result-object p0

    invoke-interface {p0, v0, p2}, Lli/h;->g(Lli/N;LUh/n;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_2

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p0

    :cond_2
    return-object p0
.end method

.method private final o(Lkotlin/reflect/jvm/internal/impl/protobuf/n;Lli/d;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;
    .locals 3

    new-instance v0, Lni/a;

    iget-object v1, p0, Lli/K;->a:Lli/p;

    invoke-virtual {v1}, Lli/p;->h()Loi/n;

    move-result-object v1

    new-instance v2, Lli/G;

    invoke-direct {v2, p0, p1, p2}, Lli/G;-><init>(Lli/K;Lkotlin/reflect/jvm/internal/impl/protobuf/n;Lli/d;)V

    invoke-direct {v0, v1, v2}, Lni/a;-><init>(Loi/n;Lmh/a;)V

    return-object v0
.end method

.method private static final p(Lli/K;Lkotlin/reflect/jvm/internal/impl/protobuf/n;Lli/d;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lli/K;->a:Lli/p;

    invoke-virtual {v0}, Lli/p;->e()LBh/m;

    move-result-object v0

    invoke-direct {p0, v0}, Lli/K;->i(LBh/m;)Lli/N;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lli/K;->a:Lli/p;

    invoke-virtual {p0}, Lli/p;->c()Lli/n;

    move-result-object p0

    invoke-virtual {p0}, Lli/n;->d()Lli/e;

    move-result-object p0

    invoke-interface {p0, v0, p1, p2}, Lli/h;->k(Lli/N;Lkotlin/reflect/jvm/internal/impl/protobuf/n;Lli/d;)Ljava/util/List;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p0

    :cond_1
    return-object p0
.end method

.method private final q(Lni/O;LBh/b0;LBh/b0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lpi/S;LBh/D;LBh/u;Ljava/util/Map;)V
    .locals 0

    invoke-virtual/range {p1 .. p10}, LDh/O;->o1(LBh/b0;LBh/b0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lpi/S;LBh/D;LBh/u;Ljava/util/Map;)LDh/O;

    return-void
.end method

.method private final t(I)I
    .locals 1

    and-int/lit8 v0, p1, 0x3f

    shr-int/lit8 p1, p1, 0x8

    shl-int/lit8 p1, p1, 0x6

    add-int/2addr v0, p1

    return v0
.end method

.method private static final v(Lli/K;LUh/n;Lni/N;)Loi/j;
    .locals 2

    iget-object v0, p0, Lli/K;->a:Lli/p;

    invoke-virtual {v0}, Lli/p;->h()Loi/n;

    move-result-object v0

    new-instance v1, Lli/I;

    invoke-direct {v1, p0, p1, p2}, Lli/I;-><init>(Lli/K;LUh/n;Lni/N;)V

    invoke-interface {v0, v1}, Loi/n;->b(Lmh/a;)Loi/j;

    move-result-object p0

    return-object p0
.end method

.method private static final w(Lli/K;LUh/n;Lni/N;)Ldi/g;
    .locals 2

    iget-object v0, p0, Lli/K;->a:Lli/p;

    invoke-virtual {v0}, Lli/p;->e()LBh/m;

    move-result-object v0

    invoke-direct {p0, v0}, Lli/K;->i(LBh/m;)Lli/N;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object p0, p0, Lli/K;->a:Lli/p;

    invoke-virtual {p0}, Lli/p;->c()Lli/n;

    move-result-object p0

    invoke-virtual {p0}, Lli/n;->d()Lli/e;

    move-result-object p0

    invoke-virtual {p2}, LDh/K;->getReturnType()Lpi/S;

    move-result-object p2

    const-string v1, "getReturnType(...)"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, v0, p1, p2}, Lli/e;->e(Lli/N;LUh/n;Lpi/S;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ldi/g;

    return-object p0
.end method

.method private static final x(Lli/K;LUh/n;Lni/N;)Loi/j;
    .locals 2

    iget-object v0, p0, Lli/K;->a:Lli/p;

    invoke-virtual {v0}, Lli/p;->h()Loi/n;

    move-result-object v0

    new-instance v1, Lli/J;

    invoke-direct {v1, p0, p1, p2}, Lli/J;-><init>(Lli/K;LUh/n;Lni/N;)V

    invoke-interface {v0, v1}, Loi/n;->b(Lmh/a;)Loi/j;

    move-result-object p0

    return-object p0
.end method

.method private static final y(Lli/K;LUh/n;Lni/N;)Ldi/g;
    .locals 2

    iget-object v0, p0, Lli/K;->a:Lli/p;

    invoke-virtual {v0}, Lli/p;->e()LBh/m;

    move-result-object v0

    invoke-direct {p0, v0}, Lli/K;->i(LBh/m;)Lli/N;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object p0, p0, Lli/K;->a:Lli/p;

    invoke-virtual {p0}, Lli/p;->c()Lli/n;

    move-result-object p0

    invoke-virtual {p0}, Lli/n;->d()Lli/e;

    move-result-object p0

    invoke-virtual {p2}, LDh/K;->getReturnType()Lpi/S;

    move-result-object p2

    const-string v1, "getReturnType(...)"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, v0, p1, p2}, Lli/e;->c(Lli/N;LUh/n;Lpi/S;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ldi/g;

    return-object p0
.end method


# virtual methods
.method public final r(LUh/d;Z)LBh/d;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v15, p1

    const-string v1, "proto"

    invoke-static {v15, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Lli/K;->a:Lli/p;

    invoke-virtual {v1}, Lli/p;->e()LBh/m;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v16, v1

    check-cast v16, LBh/e;

    new-instance v14, Lni/c;

    invoke-virtual/range {p1 .. p1}, LUh/d;->T0()I

    move-result v1

    sget-object v13, Lli/d;->FUNCTION:Lli/d;

    invoke-direct {v0, v15, v1, v13}, Lli/K;->j(Lkotlin/reflect/jvm/internal/impl/protobuf/n;ILli/d;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v4

    sget-object v6, LBh/b$a;->DECLARATION:LBh/b$a;

    iget-object v1, v0, Lli/K;->a:Lli/p;

    invoke-virtual {v1}, Lli/p;->g()LWh/c;

    move-result-object v8

    iget-object v1, v0, Lli/K;->a:Lli/p;

    invoke-virtual {v1}, Lli/p;->j()LWh/g;

    move-result-object v9

    iget-object v1, v0, Lli/K;->a:Lli/p;

    invoke-virtual {v1}, Lli/p;->k()LWh/h;

    move-result-object v10

    iget-object v1, v0, Lli/K;->a:Lli/p;

    invoke-virtual {v1}, Lli/p;->d()Lni/s;

    move-result-object v11

    const/16 v17, 0x400

    const/16 v18, 0x0

    const/4 v3, 0x0

    const/4 v12, 0x0

    move-object v1, v14

    move-object/from16 v2, v16

    move/from16 v5, p2

    move-object/from16 v7, p1

    move-object/from16 v19, v13

    move/from16 v13, v17

    move-object/from16 p2, v14

    move-object/from16 v14, v18

    invoke-direct/range {v1 .. v14}, Lni/c;-><init>(LBh/e;LBh/l;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;ZLBh/b$a;LUh/d;LWh/c;LWh/g;LWh/h;Lni/s;LBh/g0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v1, v0, Lli/K;->a:Lli/p;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v3

    const/16 v8, 0x3c

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v2, p2

    invoke-static/range {v1 .. v9}, Lli/p;->b(Lli/p;LBh/m;Ljava/util/List;LWh/c;LWh/g;LWh/h;LWh/a;ILjava/lang/Object;)Lli/p;

    move-result-object v1

    invoke-virtual {v1}, Lli/p;->f()Lli/K;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, LUh/d;->W0()Ljava/util/List;

    move-result-object v2

    const-string v3, "getValueParameterList(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v3, v19

    invoke-direct {v1, v2, v15, v3}, Lli/K;->B(Ljava/util/List;Lkotlin/reflect/jvm/internal/impl/protobuf/n;Lli/d;)Ljava/util/List;

    move-result-object v1

    sget-object v2, Lli/O;->a:Lli/O;

    sget-object v3, LWh/b;->d:LWh/b$d;

    invoke-virtual/range {p1 .. p1}, LUh/d;->T0()I

    move-result v4

    invoke-virtual {v3, v4}, LWh/b$d;->d(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LUh/x;

    invoke-static {v2, v3}, Lli/P;->a(Lli/O;LUh/x;)LBh/u;

    move-result-object v2

    move-object/from16 v3, p2

    invoke-virtual {v3, v1, v2}, LDh/i;->q1(Ljava/util/List;LBh/u;)LDh/i;

    invoke-interface/range {v16 .. v16}, LBh/e;->u()Lpi/d0;

    move-result-object v1

    invoke-virtual {v3, v1}, LDh/s;->g1(Lpi/S;)V

    invoke-interface/range {v16 .. v16}, LBh/C;->L()Z

    move-result v1

    invoke-virtual {v3, v1}, LDh/s;->W0(Z)V

    sget-object v1, LWh/b;->o:LWh/b$b;

    invoke-virtual/range {p1 .. p1}, LUh/d;->T0()I

    move-result v2

    invoke-virtual {v1, v2}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-virtual {v3, v1}, LDh/s;->Y0(Z)V

    return-object v3
.end method

.method public final s(LUh/i;)LBh/f0;
    .locals 31

    move-object/from16 v11, p0

    move-object/from16 v10, p1

    const-string v0, "proto"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, LUh/i;->C1()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual/range {p1 .. p1}, LUh/i;->m1()I

    move-result v0

    :goto_0
    move v9, v0

    goto :goto_1

    :cond_0
    invoke-virtual/range {p1 .. p1}, LUh/i;->o1()I

    move-result v0

    invoke-direct {v11, v0}, Lli/K;->t(I)I

    move-result v0

    goto :goto_0

    :goto_1
    sget-object v0, Lli/d;->FUNCTION:Lli/d;

    invoke-direct {v11, v10, v9, v0}, Lli/K;->j(Lkotlin/reflect/jvm/internal/impl/protobuf/n;ILli/d;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v15

    invoke-static/range {p1 .. p1}, LWh/f;->g(LUh/i;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-direct {v11, v10, v0}, Lli/K;->o(Lkotlin/reflect/jvm/internal/impl/protobuf/n;Lli/d;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v0

    goto :goto_2

    :cond_1
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->b()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v0

    :goto_2
    iget-object v1, v11, Lli/K;->a:Lli/p;

    invoke-virtual {v1}, Lli/p;->e()LBh/m;

    move-result-object v1

    invoke-static {v1}, Lfi/e;->o(LBh/m;)LZh/c;

    move-result-object v1

    iget-object v2, v11, Lli/K;->a:Lli/p;

    invoke-virtual {v2}, Lli/p;->g()LWh/c;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, LUh/i;->n1()I

    move-result v3

    invoke-static {v2, v3}, Lli/L;->b(LWh/c;I)LZh/f;

    move-result-object v2

    invoke-virtual {v1, v2}, LZh/c;->c(LZh/f;)LZh/c;

    move-result-object v1

    sget-object v2, Lli/Q;->a:LZh/c;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v1, LWh/h;->b:LWh/h$a;

    invoke-virtual {v1}, LWh/h$a;->b()LWh/h;

    move-result-object v1

    :goto_3
    move-object/from16 v21, v1

    goto :goto_4

    :cond_2
    iget-object v1, v11, Lli/K;->a:Lli/p;

    invoke-virtual {v1}, Lli/p;->k()LWh/h;

    move-result-object v1

    goto :goto_3

    :goto_4
    new-instance v8, Lni/O;

    iget-object v1, v11, Lli/K;->a:Lli/p;

    invoke-virtual {v1}, Lli/p;->e()LBh/m;

    move-result-object v13

    iget-object v1, v11, Lli/K;->a:Lli/p;

    invoke-virtual {v1}, Lli/p;->g()LWh/c;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, LUh/i;->n1()I

    move-result v2

    invoke-static {v1, v2}, Lli/L;->b(LWh/c;I)LZh/f;

    move-result-object v16

    sget-object v1, Lli/O;->a:Lli/O;

    sget-object v2, LWh/b;->p:LWh/b$d;

    invoke-virtual {v2, v9}, LWh/b$d;->d(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LUh/j;

    invoke-static {v1, v2}, Lli/P;->b(Lli/O;LUh/j;)LBh/b$a;

    move-result-object v17

    iget-object v1, v11, Lli/K;->a:Lli/p;

    invoke-virtual {v1}, Lli/p;->g()LWh/c;

    move-result-object v19

    iget-object v1, v11, Lli/K;->a:Lli/p;

    invoke-virtual {v1}, Lli/p;->j()LWh/g;

    move-result-object v20

    iget-object v1, v11, Lli/K;->a:Lli/p;

    invoke-virtual {v1}, Lli/p;->d()Lni/s;

    move-result-object v22

    const/16 v24, 0x400

    const/16 v25, 0x0

    const/4 v14, 0x0

    const/16 v23, 0x0

    move-object v12, v8

    move-object/from16 v18, p1

    invoke-direct/range {v12 .. v25}, Lni/O;-><init>(LBh/m;LBh/f0;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;LBh/b$a;LUh/i;LWh/c;LWh/g;LWh/h;Lni/s;LBh/g0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v1, v11, Lli/K;->a:Lli/p;

    invoke-virtual/range {p1 .. p1}, LUh/i;->v1()Ljava/util/List;

    move-result-object v2

    const-string v3, "getTypeParameterList(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v29, 0x3c

    const/16 v30, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    move-object/from16 v22, v1

    move-object/from16 v23, v8

    move-object/from16 v24, v2

    invoke-static/range {v22 .. v30}, Lli/p;->b(Lli/p;LBh/m;Ljava/util/List;LWh/c;LWh/g;LWh/h;LWh/a;ILjava/lang/Object;)Lli/p;

    move-result-object v12

    iget-object v1, v11, Lli/K;->a:Lli/p;

    invoke-virtual {v1}, Lli/p;->j()LWh/g;

    move-result-object v1

    invoke-static {v10, v1}, LWh/f;->k(LUh/i;LWh/g;)LUh/q;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v12}, Lli/p;->i()Lli/X;

    move-result-object v2

    invoke-virtual {v2, v1}, Lli/X;->u(LUh/q;)Lpi/S;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-static {v8, v1, v0}, Lbi/h;->i(LBh/a;Lpi/S;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)LBh/b0;

    move-result-object v0

    :goto_5
    move-object v2, v0

    goto :goto_6

    :cond_3
    const/4 v0, 0x0

    goto :goto_5

    :goto_6
    invoke-direct/range {p0 .. p0}, Lli/K;->l()LBh/b0;

    move-result-object v3

    iget-object v0, v11, Lli/K;->a:Lli/p;

    invoke-virtual {v0}, Lli/p;->j()LWh/g;

    move-result-object v0

    invoke-static {v10, v0}, LWh/f;->c(LUh/i;LWh/g;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v6, v1, 0x1

    if-gez v1, :cond_4

    invoke-static {}, LZg/v;->v()V

    :cond_4
    check-cast v5, LUh/q;

    invoke-direct {v11, v5, v12, v8, v1}, Lli/K;->A(LUh/q;Lli/p;LBh/a;I)LBh/b0;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-interface {v4, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_5
    move v1, v6

    goto :goto_7

    :cond_6
    invoke-virtual {v12}, Lli/p;->i()Lli/X;

    move-result-object v0

    invoke-virtual {v0}, Lli/X;->m()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v12}, Lli/p;->f()Lli/K;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, LUh/i;->z1()Ljava/util/List;

    move-result-object v1

    const-string v6, "getValueParameterList(...)"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Lli/d;->FUNCTION:Lli/d;

    invoke-direct {v0, v1, v10, v6}, Lli/K;->B(Ljava/util/List;Lkotlin/reflect/jvm/internal/impl/protobuf/n;Lli/d;)Ljava/util/List;

    move-result-object v6

    invoke-virtual {v12}, Lli/p;->i()Lli/X;

    move-result-object v0

    iget-object v1, v11, Lli/K;->a:Lli/p;

    invoke-virtual {v1}, Lli/p;->j()LWh/g;

    move-result-object v1

    invoke-static {v10, v1}, LWh/f;->m(LUh/i;LWh/g;)LUh/q;

    move-result-object v1

    invoke-virtual {v0, v1}, Lli/X;->u(LUh/q;)Lpi/S;

    move-result-object v7

    sget-object v0, Lli/O;->a:Lli/O;

    sget-object v1, LWh/b;->e:LWh/b$d;

    invoke-virtual {v1, v9}, LWh/b$d;->d(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LUh/k;

    invoke-virtual {v0, v1}, Lli/O;->b(LUh/k;)LBh/D;

    move-result-object v13

    sget-object v1, LWh/b;->d:LWh/b$d;

    invoke-virtual {v1, v9}, LWh/b$d;->d(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LUh/x;

    invoke-static {v0, v1}, Lli/P;->a(Lli/O;LUh/x;)LBh/u;

    move-result-object v14

    invoke-static {}, LZg/U;->h()Ljava/util/Map;

    move-result-object v15

    move-object/from16 v0, p0

    move-object v1, v8

    move-object/from16 v16, v12

    move-object v12, v8

    move-object v8, v13

    move v13, v9

    move-object v9, v14

    move-object v14, v10

    move-object v10, v15

    invoke-direct/range {v0 .. v10}, Lli/K;->q(Lni/O;LBh/b0;LBh/b0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lpi/S;LBh/D;LBh/u;Ljava/util/Map;)V

    sget-object v0, LWh/b;->q:LWh/b$b;

    invoke-virtual {v0, v13}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {v12, v0}, LDh/s;->f1(Z)V

    sget-object v0, LWh/b;->r:LWh/b$b;

    invoke-virtual {v0, v13}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {v12, v0}, LDh/s;->c1(Z)V

    sget-object v0, LWh/b;->u:LWh/b$b;

    invoke-virtual {v0, v13}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {v12, v0}, LDh/s;->X0(Z)V

    sget-object v0, LWh/b;->s:LWh/b$b;

    invoke-virtual {v0, v13}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {v12, v0}, LDh/s;->e1(Z)V

    sget-object v0, LWh/b;->t:LWh/b$b;

    invoke-virtual {v0, v13}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {v12, v0}, LDh/s;->i1(Z)V

    sget-object v0, LWh/b;->v:LWh/b$b;

    invoke-virtual {v0, v13}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {v12, v0}, LDh/s;->h1(Z)V

    sget-object v0, LWh/b;->w:LWh/b$b;

    invoke-virtual {v0, v13}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {v12, v0}, LDh/s;->W0(Z)V

    sget-object v0, LWh/b;->x:LWh/b$b;

    invoke-virtual {v0, v13}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {v12, v0}, LDh/s;->Y0(Z)V

    iget-object v0, v11, Lli/K;->a:Lli/p;

    invoke-virtual {v0}, Lli/p;->c()Lli/n;

    move-result-object v0

    invoke-virtual {v0}, Lli/n;->h()Lli/m;

    move-result-object v0

    iget-object v1, v11, Lli/K;->a:Lli/p;

    invoke-virtual {v1}, Lli/p;->j()LWh/g;

    move-result-object v1

    invoke-virtual/range {v16 .. v16}, Lli/p;->i()Lli/X;

    move-result-object v2

    invoke-interface {v0, v14, v12, v1, v2}, Lli/m;->a(LUh/i;LBh/z;LWh/g;Lli/X;)LYg/s;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, LYg/s;->h()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LBh/a$a;

    invoke-virtual {v0}, LYg/s;->j()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v12, v1, v0}, LDh/s;->U0(LBh/a$a;Ljava/lang/Object;)V

    :cond_7
    return-object v12
.end method

.method public final u(LUh/n;)LBh/Y;
    .locals 36

    move-object/from16 v0, p0

    move-object/from16 v15, p1

    const-string v1, "proto"

    invoke-static {v15, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, LUh/n;->y1()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual/range {p1 .. p1}, LUh/n;->k1()I

    move-result v1

    :goto_0
    move v3, v1

    goto :goto_1

    :cond_0
    invoke-virtual/range {p1 .. p1}, LUh/n;->n1()I

    move-result v1

    invoke-direct {v0, v1}, Lli/K;->t(I)I

    move-result v1

    goto :goto_0

    :goto_1
    new-instance v14, Lni/N;

    move-object v1, v14

    iget-object v2, v0, Lli/K;->a:Lli/p;

    invoke-virtual {v2}, Lli/p;->e()LBh/m;

    move-result-object v2

    sget-object v4, Lli/d;->PROPERTY:Lli/d;

    invoke-direct {v0, v15, v3, v4}, Lli/K;->j(Lkotlin/reflect/jvm/internal/impl/protobuf/n;ILli/d;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v4

    sget-object v9, Lli/O;->a:Lli/O;

    sget-object v5, LWh/b;->e:LWh/b$d;

    invoke-virtual {v5, v3}, LWh/b$d;->d(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LUh/k;

    invoke-virtual {v9, v5}, Lli/O;->b(LUh/k;)LBh/D;

    move-result-object v5

    sget-object v6, LWh/b;->d:LWh/b$d;

    invoke-virtual {v6, v3}, LWh/b$d;->d(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LUh/x;

    invoke-static {v9, v6}, Lli/P;->a(Lli/O;LUh/x;)LBh/u;

    move-result-object v6

    sget-object v7, LWh/b;->y:LWh/b$b;

    invoke-virtual {v7, v3}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v7

    const-string v13, "get(...)"

    invoke-static {v7, v13}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    iget-object v8, v0, Lli/K;->a:Lli/p;

    invoke-virtual {v8}, Lli/p;->g()LWh/c;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, LUh/n;->m1()I

    move-result v10

    invoke-static {v8, v10}, Lli/L;->b(LWh/c;I)LZh/f;

    move-result-object v8

    sget-object v10, LWh/b;->p:LWh/b$d;

    invoke-virtual {v10, v3}, LWh/b$d;->d(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LUh/j;

    invoke-static {v9, v10}, Lli/P;->b(Lli/O;LUh/j;)LBh/b$a;

    move-result-object v9

    sget-object v10, LWh/b;->C:LWh/b$b;

    invoke-virtual {v10, v3}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v10

    invoke-static {v10, v13}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    sget-object v11, LWh/b;->B:LWh/b$b;

    invoke-virtual {v11, v3}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v11

    invoke-static {v11, v13}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    sget-object v12, LWh/b;->E:LWh/b$b;

    invoke-virtual {v12, v3}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v12

    invoke-static {v12, v13}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    move-object/from16 v16, v14

    sget-object v14, LWh/b;->F:LWh/b$b;

    invoke-virtual {v14, v3}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v14

    invoke-static {v14, v13}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v14

    move-object/from16 v20, v1

    move-object v1, v13

    move v13, v14

    sget-object v14, LWh/b;->G:LWh/b$b;

    invoke-virtual {v14, v3}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v14

    invoke-static {v14, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v14

    move-object/from16 v21, v16

    move-object/from16 v22, v1

    iget-object v1, v0, Lli/K;->a:Lli/p;

    invoke-virtual {v1}, Lli/p;->g()LWh/c;

    move-result-object v16

    iget-object v1, v0, Lli/K;->a:Lli/p;

    invoke-virtual {v1}, Lli/p;->j()LWh/g;

    move-result-object v17

    iget-object v1, v0, Lli/K;->a:Lli/p;

    invoke-virtual {v1}, Lli/p;->k()LWh/h;

    move-result-object v18

    iget-object v1, v0, Lli/K;->a:Lli/p;

    invoke-virtual {v1}, Lli/p;->d()Lni/s;

    move-result-object v19

    const/4 v1, 0x0

    move/from16 v23, v3

    move-object v3, v1

    move-object v1, v15

    move-object/from16 v15, p1

    move-object/from16 v1, v20

    move-object/from16 v24, v22

    invoke-direct/range {v1 .. v19}, Lni/N;-><init>(LBh/m;LBh/Y;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/D;LBh/u;ZLZh/f;LBh/b$a;ZZZZZLUh/n;LWh/c;LWh/g;LWh/h;Lni/s;)V

    iget-object v4, v0, Lli/K;->a:Lli/p;

    invoke-virtual/range {p1 .. p1}, LUh/n;->w1()Ljava/util/List;

    move-result-object v6

    const-string v1, "getTypeParameterList(...)"

    invoke-static {v6, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v11, 0x3c

    const/4 v12, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v5, v21

    invoke-static/range {v4 .. v12}, Lli/p;->b(Lli/p;LBh/m;Ljava/util/List;LWh/c;LWh/g;LWh/h;LWh/a;ILjava/lang/Object;)Lli/p;

    move-result-object v1

    sget-object v2, LWh/b;->z:LWh/b$b;

    move/from16 v3, v23

    invoke-virtual {v2, v3}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v2

    move-object/from16 v15, v24

    invoke-static {v2, v15}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static/range {p1 .. p1}, LWh/f;->h(LUh/n;)Z

    move-result v4

    if-eqz v4, :cond_1

    sget-object v4, Lli/d;->PROPERTY_GETTER:Lli/d;

    move-object/from16 v14, p1

    invoke-direct {v0, v14, v4}, Lli/K;->o(Lkotlin/reflect/jvm/internal/impl/protobuf/n;Lli/d;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v4

    goto :goto_2

    :cond_1
    move-object/from16 v14, p1

    sget-object v4, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-virtual {v4}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->b()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v4

    :goto_2
    invoke-virtual {v1}, Lli/p;->i()Lli/X;

    move-result-object v5

    iget-object v6, v0, Lli/K;->a:Lli/p;

    invoke-virtual {v6}, Lli/p;->j()LWh/g;

    move-result-object v6

    invoke-static {v14, v6}, LWh/f;->n(LUh/n;LWh/g;)LUh/q;

    move-result-object v6

    invoke-virtual {v5, v6}, Lli/X;->u(LUh/q;)Lpi/S;

    move-result-object v5

    invoke-virtual {v1}, Lli/p;->i()Lli/X;

    move-result-object v6

    invoke-virtual {v6}, Lli/X;->m()Ljava/util/List;

    move-result-object v6

    invoke-direct/range {p0 .. p0}, Lli/K;->l()LBh/b0;

    move-result-object v7

    iget-object v8, v0, Lli/K;->a:Lli/p;

    invoke-virtual {v8}, Lli/p;->j()LWh/g;

    move-result-object v8

    invoke-static {v14, v8}, LWh/f;->l(LUh/n;LWh/g;)LUh/q;

    move-result-object v8

    const/16 v16, 0x0

    if-eqz v8, :cond_2

    invoke-virtual {v1}, Lli/p;->i()Lli/X;

    move-result-object v9

    invoke-virtual {v9, v8}, Lli/X;->u(LUh/q;)Lpi/S;

    move-result-object v8

    if-eqz v8, :cond_2

    move-object/from16 v13, v21

    invoke-static {v13, v8, v4}, Lbi/h;->i(LBh/a;Lpi/S;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)LBh/b0;

    move-result-object v4

    move-object v8, v4

    goto :goto_3

    :cond_2
    move-object/from16 v13, v21

    move-object/from16 v8, v16

    :goto_3
    iget-object v4, v0, Lli/K;->a:Lli/p;

    invoke-virtual {v4}, Lli/p;->j()LWh/g;

    move-result-object v4

    invoke-static {v14, v4}, LWh/f;->d(LUh/n;LWh/g;)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    const/16 v10, 0xa

    invoke-static {v4, v10}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v12, 0x0

    move v10, v12

    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    add-int/lit8 v17, v10, 0x1

    if-gez v10, :cond_3

    invoke-static {}, LZg/v;->v()V

    :cond_3
    check-cast v11, LUh/q;

    invoke-direct {v0, v11, v1, v13, v10}, Lli/K;->A(LUh/q;Lli/p;LBh/a;I)LBh/b0;

    move-result-object v10

    invoke-interface {v9, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move/from16 v10, v17

    goto :goto_4

    :cond_4
    move-object v4, v13

    invoke-virtual/range {v4 .. v9}, LDh/K;->b1(Lpi/S;Ljava/util/List;LBh/b0;LBh/b0;Ljava/util/List;)V

    sget-object v4, LWh/b;->c:LWh/b$b;

    invoke-virtual {v4, v3}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {v4, v15}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    sget-object v11, LWh/b;->d:LWh/b$d;

    invoke-virtual {v11, v3}, LWh/b$d;->d(I)Ljava/lang/Object;

    move-result-object v4

    move-object v6, v4

    check-cast v6, LUh/x;

    sget-object v4, LWh/b;->e:LWh/b$d;

    invoke-virtual {v4, v3}, LWh/b$d;->d(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LUh/k;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, LWh/b;->b(ZLUh/x;LUh/k;ZZZ)I

    move-result v17

    const/4 v10, 0x1

    if-eqz v2, :cond_7

    invoke-virtual/range {p1 .. p1}, LUh/n;->z1()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual/range {p1 .. p1}, LUh/n;->l1()I

    move-result v2

    goto :goto_5

    :cond_5
    move/from16 v2, v17

    :goto_5
    sget-object v5, LWh/b;->K:LWh/b$b;

    invoke-virtual {v5, v2}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v5

    invoke-static {v5, v15}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    sget-object v6, LWh/b;->L:LWh/b$b;

    invoke-virtual {v6, v2}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v6

    invoke-static {v6, v15}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v18

    sget-object v6, LWh/b;->M:LWh/b$b;

    invoke-virtual {v6, v2}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v6

    invoke-static {v6, v15}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v19

    sget-object v6, Lli/d;->PROPERTY_GETTER:Lli/d;

    invoke-direct {v0, v14, v2, v6}, Lli/K;->j(Lkotlin/reflect/jvm/internal/impl/protobuf/n;ILli/d;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v6

    if-eqz v5, :cond_6

    new-instance v20, LDh/L;

    sget-object v7, Lli/O;->a:Lli/O;

    invoke-virtual {v4, v2}, LWh/b$d;->d(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LUh/k;

    invoke-virtual {v7, v8}, Lli/O;->b(LUh/k;)LBh/D;

    move-result-object v8

    invoke-virtual {v11, v2}, LWh/b$d;->d(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LUh/x;

    invoke-static {v7, v2}, Lli/P;->a(Lli/O;LUh/x;)LBh/u;

    move-result-object v2

    xor-int/lit8 v9, v5, 0x1

    invoke-virtual {v13}, LDh/K;->h()LBh/b$a;

    move-result-object v21

    const/16 v22, 0x0

    sget-object v23, LBh/g0;->a:LBh/g0;

    move-object v7, v4

    move-object/from16 v4, v20

    move-object v5, v13

    move-object/from16 v34, v7

    move-object v7, v8

    move-object v8, v2

    move v2, v10

    move/from16 v10, v18

    move-object v2, v11

    move/from16 v11, v19

    move-object/from16 v12, v21

    move-object/from16 v19, v1

    move-object v1, v13

    move-object/from16 v13, v22

    move-object/from16 v21, v2

    move-object v2, v14

    move-object/from16 v14, v23

    invoke-direct/range {v4 .. v14}, LDh/L;-><init>(LBh/Y;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/D;LBh/u;ZZZLBh/b$a;LBh/Z;LBh/g0;)V

    goto :goto_6

    :cond_6
    move-object/from16 v19, v1

    move-object/from16 v34, v4

    move-object/from16 v21, v11

    move-object v1, v13

    move-object v2, v14

    invoke-static {v1, v6}, Lbi/h;->d(LBh/Y;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)LDh/L;

    move-result-object v20

    invoke-static/range {v20 .. v20}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    move-object/from16 v4, v20

    :goto_6
    invoke-virtual {v1}, LDh/K;->getReturnType()Lpi/S;

    move-result-object v5

    invoke-virtual {v4, v5}, LDh/L;->P0(Lpi/S;)V

    move-object v14, v4

    goto :goto_7

    :cond_7
    move-object/from16 v19, v1

    move-object/from16 v34, v4

    move-object/from16 v21, v11

    move-object v1, v13

    move-object v2, v14

    move-object/from16 v14, v16

    :goto_7
    sget-object v4, LWh/b;->A:LWh/b$b;

    invoke-virtual {v4, v3}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-virtual/range {p1 .. p1}, LUh/n;->G1()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-virtual/range {p1 .. p1}, LUh/n;->s1()I

    move-result v17

    :cond_8
    move/from16 v4, v17

    sget-object v5, LWh/b;->K:LWh/b$b;

    invoke-virtual {v5, v4}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v5

    invoke-static {v5, v15}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    sget-object v6, LWh/b;->L:LWh/b$b;

    invoke-virtual {v6, v4}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v6

    invoke-static {v6, v15}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    sget-object v6, LWh/b;->M:LWh/b$b;

    invoke-virtual {v6, v4}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v6

    invoke-static {v6, v15}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    sget-object v15, Lli/d;->PROPERTY_SETTER:Lli/d;

    invoke-direct {v0, v2, v4, v15}, Lli/K;->j(Lkotlin/reflect/jvm/internal/impl/protobuf/n;ILli/d;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v6

    if-eqz v5, :cond_9

    new-instance v13, LDh/M;

    sget-object v7, Lli/O;->a:Lli/O;

    move-object/from16 v8, v34

    invoke-virtual {v8, v4}, LWh/b$d;->d(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LUh/k;

    invoke-virtual {v7, v8}, Lli/O;->b(LUh/k;)LBh/D;

    move-result-object v8

    move-object/from16 v9, v21

    invoke-virtual {v9, v4}, LWh/b$d;->d(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LUh/x;

    invoke-static {v7, v4}, Lli/P;->a(Lli/O;LUh/x;)LBh/u;

    move-result-object v9

    const/4 v4, 0x1

    xor-int/lit8 v12, v5, 0x1

    invoke-virtual {v1}, LDh/K;->h()LBh/b$a;

    move-result-object v17

    const/16 v20, 0x0

    sget-object v21, LBh/g0;->a:LBh/g0;

    move-object v4, v13

    move-object v5, v1

    move-object v7, v8

    move-object v8, v9

    move v9, v12

    move-object/from16 v12, v17

    move-object/from16 v17, v13

    move-object/from16 v13, v20

    move-object/from16 v35, v14

    move-object/from16 v14, v21

    invoke-direct/range {v4 .. v14}, LDh/M;-><init>(LBh/Y;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/D;LBh/u;ZZZLBh/b$a;LBh/a0;LBh/g0;)V

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v27

    const/16 v32, 0x3c

    const/16 v33, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    move-object/from16 v25, v19

    move-object/from16 v26, v17

    invoke-static/range {v25 .. v33}, Lli/p;->b(Lli/p;LBh/m;Ljava/util/List;LWh/c;LWh/g;LWh/h;LWh/a;ILjava/lang/Object;)Lli/p;

    move-result-object v4

    invoke-virtual {v4}, Lli/p;->f()Lli/K;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, LUh/n;->t1()LUh/u;

    move-result-object v5

    invoke-static {v5}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-direct {v4, v5, v2, v15}, Lli/K;->B(Ljava/util/List;Lkotlin/reflect/jvm/internal/impl/protobuf/n;Lli/d;)Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, LZg/v;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LBh/s0;

    move-object/from16 v5, v17

    invoke-virtual {v5, v4}, LDh/M;->Q0(LBh/s0;)V

    move-object v13, v5

    goto :goto_8

    :cond_9
    move-object/from16 v35, v14

    sget-object v4, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-virtual {v4}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->b()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v4

    invoke-static {v1, v6, v4}, Lbi/h;->e(LBh/Y;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)LDh/M;

    move-result-object v13

    invoke-static {v13}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_8

    :cond_a
    move-object/from16 v35, v14

    move-object/from16 v13, v16

    :goto_8
    sget-object v4, LWh/b;->D:LWh/b$b;

    invoke-virtual {v4, v3}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_b

    new-instance v3, Lli/C;

    invoke-direct {v3, v0, v2, v1}, Lli/C;-><init>(Lli/K;LUh/n;Lni/N;)V

    invoke-virtual {v1, v3}, LDh/Y;->L0(Lmh/a;)V

    :cond_b
    iget-object v3, v0, Lli/K;->a:Lli/p;

    invoke-virtual {v3}, Lli/p;->e()LBh/m;

    move-result-object v3

    instance-of v4, v3, LBh/e;

    if-eqz v4, :cond_c

    check-cast v3, LBh/e;

    goto :goto_9

    :cond_c
    move-object/from16 v3, v16

    :goto_9
    if-eqz v3, :cond_d

    invoke-interface {v3}, LBh/e;->h()LBh/f;

    move-result-object v16

    :cond_d
    move-object/from16 v3, v16

    sget-object v4, LBh/f;->ANNOTATION_CLASS:LBh/f;

    if-ne v3, v4, :cond_e

    new-instance v3, Lli/D;

    invoke-direct {v3, v0, v2, v1}, Lli/D;-><init>(Lli/K;LUh/n;Lni/N;)V

    invoke-virtual {v1, v3}, LDh/Y;->L0(Lmh/a;)V

    :cond_e
    new-instance v3, LDh/r;

    const/4 v4, 0x0

    invoke-direct {v0, v2, v4}, Lli/K;->m(LUh/n;Z)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v4

    invoke-direct {v3, v4, v1}, LDh/r;-><init>(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/Y;)V

    new-instance v4, LDh/r;

    const/4 v5, 0x1

    invoke-direct {v0, v2, v5}, Lli/K;->m(LUh/n;Z)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v2

    invoke-direct {v4, v2, v1}, LDh/r;-><init>(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/Y;)V

    move-object/from16 v2, v35

    invoke-virtual {v1, v2, v13, v3, v4}, LDh/K;->V0(LDh/L;LBh/a0;LBh/w;LBh/w;)V

    return-object v1
.end method

.method public final z(LUh/r;)LBh/k0;
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v12, p1

    const-string v1, "proto"

    invoke-static {v12, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-virtual/range {p1 .. p1}, LUh/r;->a1()Ljava/util/List;

    move-result-object v2

    const-string v3, "getAnnotationList(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LUh/b;

    iget-object v5, v0, Lli/K;->b:Lli/g;

    invoke-static {v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v6, v0, Lli/K;->a:Lli/p;

    invoke-virtual {v6}, Lli/p;->g()LWh/c;

    move-result-object v6

    invoke-virtual {v5, v4, v6}, Lli/g;->a(LUh/b;LWh/c;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v3}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->a(Ljava/util/List;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v4

    sget-object v1, Lli/O;->a:Lli/O;

    sget-object v2, LWh/b;->d:LWh/b$d;

    invoke-virtual/range {p1 .. p1}, LUh/r;->f1()I

    move-result v3

    invoke-virtual {v2, v3}, LWh/b$d;->d(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LUh/x;

    invoke-static {v1, v2}, Lli/P;->a(Lli/O;LUh/x;)LBh/u;

    move-result-object v6

    new-instance v15, Lni/P;

    iget-object v1, v0, Lli/K;->a:Lli/p;

    invoke-virtual {v1}, Lli/p;->h()Loi/n;

    move-result-object v2

    iget-object v1, v0, Lli/K;->a:Lli/p;

    invoke-virtual {v1}, Lli/p;->e()LBh/m;

    move-result-object v3

    iget-object v1, v0, Lli/K;->a:Lli/p;

    invoke-virtual {v1}, Lli/p;->g()LWh/c;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, LUh/r;->g1()I

    move-result v5

    invoke-static {v1, v5}, Lli/L;->b(LWh/c;I)LZh/f;

    move-result-object v5

    iget-object v1, v0, Lli/K;->a:Lli/p;

    invoke-virtual {v1}, Lli/p;->g()LWh/c;

    move-result-object v8

    iget-object v1, v0, Lli/K;->a:Lli/p;

    invoke-virtual {v1}, Lli/p;->j()LWh/g;

    move-result-object v9

    iget-object v1, v0, Lli/K;->a:Lli/p;

    invoke-virtual {v1}, Lli/p;->k()LWh/h;

    move-result-object v10

    iget-object v1, v0, Lli/K;->a:Lli/p;

    invoke-virtual {v1}, Lli/p;->d()Lni/s;

    move-result-object v11

    move-object v1, v15

    move-object/from16 v7, p1

    invoke-direct/range {v1 .. v11}, Lni/P;-><init>(Loi/n;LBh/m;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;LBh/u;LUh/r;LWh/c;LWh/g;LWh/h;Lni/s;)V

    iget-object v13, v0, Lli/K;->a:Lli/p;

    invoke-virtual/range {p1 .. p1}, LUh/r;->j1()Ljava/util/List;

    move-result-object v1

    const-string v2, "getTypeParameterList(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v20, 0x3c

    const/16 v21, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object v14, v15

    move-object v2, v15

    move-object v15, v1

    invoke-static/range {v13 .. v21}, Lli/p;->b(Lli/p;LBh/m;Ljava/util/List;LWh/c;LWh/g;LWh/h;LWh/a;ILjava/lang/Object;)Lli/p;

    move-result-object v1

    invoke-virtual {v1}, Lli/p;->i()Lli/X;

    move-result-object v3

    invoke-virtual {v3}, Lli/X;->m()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1}, Lli/p;->i()Lli/X;

    move-result-object v4

    iget-object v5, v0, Lli/K;->a:Lli/p;

    invoke-virtual {v5}, Lli/p;->j()LWh/g;

    move-result-object v5

    invoke-static {v12, v5}, LWh/f;->r(LUh/r;LWh/g;)LUh/q;

    move-result-object v5

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6}, Lli/X;->o(LUh/q;Z)Lpi/d0;

    move-result-object v4

    invoke-virtual {v1}, Lli/p;->i()Lli/X;

    move-result-object v1

    iget-object v5, v0, Lli/K;->a:Lli/p;

    invoke-virtual {v5}, Lli/p;->j()LWh/g;

    move-result-object v5

    invoke-static {v12, v5}, LWh/f;->e(LUh/r;LWh/g;)LUh/q;

    move-result-object v5

    invoke-virtual {v1, v5, v6}, Lli/X;->o(LUh/q;Z)Lpi/d0;

    move-result-object v1

    invoke-virtual {v2, v3, v4, v1}, Lni/P;->W0(Ljava/util/List;Lpi/d0;Lpi/d0;)V

    return-object v2
.end method
