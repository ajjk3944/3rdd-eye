.class public abstract LSh/d;
.super LSh/e;
.source "SourceFile"

# interfaces
.implements Lli/e;


# instance fields
.field private final c:Loi/g;


# direct methods
.method public constructor <init>(Loi/n;LSh/v;)V
    .locals 1

    const-string v0, "storageManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinClassFinder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2}, LSh/e;-><init>(LSh/v;)V

    new-instance p2, LSh/a;

    invoke-direct {p2, p0}, LSh/a;-><init>(LSh/d;)V

    invoke-interface {p1, p2}, Loi/n;->e(Lmh/l;)Loi/g;

    move-result-object p1

    iput-object p1, p0, LSh/d;->c:Loi/g;

    return-void
.end method

.method static synthetic B(LSh/d;LSh/x;)LSh/g;
    .locals 0

    invoke-static {p0, p1}, LSh/d;->L(LSh/d;LSh/x;)LSh/g;

    move-result-object p0

    return-object p0
.end method

.method static synthetic C(LSh/g;LSh/A;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, LSh/d;->G(LSh/g;LSh/A;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method static synthetic D(LSh/g;LSh/A;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, LSh/d;->K(LSh/g;LSh/A;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final G(LSh/g;LSh/A;)Ljava/lang/Object;
    .locals 1

    const-string v0, "$this$loadConstantFromProperty"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LSh/g;->b()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final H(LSh/x;)LSh/g;
    .locals 10

    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    new-instance v9, LSh/d$a;

    move-object v0, v9

    move-object v1, p0

    move-object v2, v6

    move-object v3, p1

    move-object v4, v8

    move-object v5, v7

    invoke-direct/range {v0 .. v5}, LSh/d$a;-><init>(LSh/d;Ljava/util/HashMap;LSh/x;Ljava/util/HashMap;Ljava/util/HashMap;)V

    invoke-virtual {p0, p1}, LSh/e;->r(LSh/x;)[B

    move-result-object v0

    invoke-interface {p1, v9, v0}, LSh/x;->c(LSh/x$d;[B)V

    new-instance p1, LSh/g;

    invoke-direct {p1, v6, v7, v8}, LSh/g;-><init>(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V

    return-object p1
.end method

.method private final J(Lli/N;LUh/n;Lli/d;Lpi/S;Lmh/p;)Ljava/lang/Object;
    .locals 10

    sget-object v0, LSh/e;->b:LSh/e$b;

    sget-object v1, LWh/b;->B:LWh/b$b;

    invoke-virtual {p2}, LUh/n;->k1()I

    move-result v2

    invoke-virtual {v1, v2}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {p2}, LYh/i;->f(LUh/n;)Z

    move-result v5

    invoke-virtual {p0}, LSh/e;->v()LSh/v;

    move-result-object v6

    invoke-virtual {p0}, LSh/e;->u()LYh/e;

    move-result-object v7

    const/4 v2, 0x1

    const/4 v3, 0x1

    move-object v1, p1

    invoke-virtual/range {v0 .. v7}, LSh/e$b;->a(Lli/N;ZZLjava/lang/Boolean;ZLSh/v;LYh/e;)LSh/x;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, LSh/e;->p(Lli/N;LSh/x;)LSh/x;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-interface {v0}, LSh/x;->a()LTh/a;

    move-result-object v2

    invoke-virtual {v2}, LTh/a;->d()LYh/e;

    move-result-object v2

    sget-object v3, LSh/n;->b:LSh/n$a;

    invoke-virtual {v3}, LSh/n$a;->a()LYh/e;

    move-result-object v3

    invoke-virtual {v2, v3}, LWh/a;->d(LWh/a;)Z

    move-result v9

    invoke-virtual {p1}, Lli/N;->b()LWh/c;

    move-result-object v6

    invoke-virtual {p1}, Lli/N;->d()LWh/g;

    move-result-object v7

    move-object v4, p0

    move-object v5, p2

    move-object v8, p3

    invoke-virtual/range {v4 .. v9}, LSh/e;->s(Lkotlin/reflect/jvm/internal/impl/protobuf/n;LWh/c;LWh/g;Lli/d;Z)LSh/A;

    move-result-object p1

    if-nez p1, :cond_1

    return-object v1

    :cond_1
    iget-object p2, p0, LSh/d;->c:Loi/g;

    invoke-interface {p2, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p5, p2, p1}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_2

    return-object v1

    :cond_2
    invoke-static {p4}, Lkotlin/reflect/jvm/internal/impl/builtins/s;->d(Lpi/S;)Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-virtual {p0, p1}, LSh/d;->M(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :cond_3
    return-object p1
.end method

.method private static final K(LSh/g;LSh/A;)Ljava/lang/Object;
    .locals 1

    const-string v0, "$this$loadConstantFromProperty"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LSh/g;->c()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final L(LSh/d;LSh/x;)LSh/g;
    .locals 1

    const-string v0, "kotlinClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LSh/d;->H(LSh/x;)LSh/g;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method protected E(LSh/x;)LSh/g;
    .locals 1

    const-string v0, "binaryClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LSh/d;->c:Loi/g;

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LSh/g;

    return-object p1
.end method

.method protected final F(LZh/b;Ljava/util/Map;)Z
    .locals 2

    const-string v0, "annotationClassId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lyh/a;->a:Lyh/a;

    invoke-virtual {v0}, Lyh/a;->a()LZh/b;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    const-string p1, "value"

    invoke-static {p1}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ldi/s;

    const/4 v1, 0x0

    if-eqz p2, :cond_1

    check-cast p1, Ldi/s;

    goto :goto_0

    :cond_1
    move-object p1, v1

    :goto_0
    if-nez p1, :cond_2

    return v0

    :cond_2
    invoke-virtual {p1}, Ldi/g;->b()Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ldi/s$b$b;

    if-eqz p2, :cond_3

    move-object v1, p1

    check-cast v1, Ldi/s$b$b;

    :cond_3
    if-nez v1, :cond_4

    return v0

    :cond_4
    invoke-virtual {v1}, Ldi/s$b$b;->b()LZh/b;

    move-result-object p1

    invoke-virtual {p0, p1}, LSh/e;->w(LZh/b;)Z

    move-result p1

    return p1
.end method

.method protected abstract I(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method protected abstract M(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public c(Lli/N;LUh/n;Lpi/S;)Ljava/lang/Object;
    .locals 7

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proto"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "expectedType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Lli/d;->PROPERTY_GETTER:Lli/d;

    sget-object v6, LSh/b;->a:LSh/b;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, LSh/d;->J(Lli/N;LUh/n;Lli/d;Lpi/S;Lmh/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public e(Lli/N;LUh/n;Lpi/S;)Ljava/lang/Object;
    .locals 7

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proto"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "expectedType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Lli/d;->PROPERTY:Lli/d;

    sget-object v6, LSh/c;->a:LSh/c;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, LSh/d;->J(Lli/N;LUh/n;Lli/d;Lpi/S;Lmh/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic q(LSh/x;)LSh/e$a;
    .locals 0

    invoke-virtual {p0, p1}, LSh/d;->E(LSh/x;)LSh/g;

    move-result-object p1

    return-object p1
.end method
