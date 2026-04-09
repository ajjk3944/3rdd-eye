.class final Lni/w$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lni/w$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lni/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# static fields
.field static final synthetic j:[Lth/l;


# instance fields
.field private final a:Ljava/util/Map;

.field private final b:Ljava/util/Map;

.field private final c:Ljava/util/Map;

.field private final d:Loi/g;

.field private final e:Loi/g;

.field private final f:Loi/h;

.field private final g:Loi/i;

.field private final h:Loi/i;

.field final synthetic i:Lni/w;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, Lni/w$c;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v2

    const-string v3, "functionNames"

    const-string v4, "getFunctionNames()Ljava/util/Set;"

    invoke-direct {v0, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v1

    const-string v3, "variableNames"

    const-string v4, "getVariableNames()Ljava/util/Set;"

    invoke-direct {v2, v1, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lth/l;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    sput-object v2, Lni/w$c;->j:[Lth/l;

    return-void
.end method

.method public constructor <init>(Lni/w;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 4

    const-string v0, "functionList"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "propertyList"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeAliasList"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lni/w$c;->i:Lni/w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    check-cast p2, Ljava/util/Collection;

    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    invoke-virtual {p1}, Lni/w;->s()Lli/p;

    move-result-object v3

    invoke-virtual {v3}, Lli/p;->g()LWh/c;

    move-result-object v3

    check-cast v2, LUh/i;

    invoke-virtual {v2}, LUh/i;->n1()I

    move-result v2

    invoke-static {v3, v2}, Lli/L;->b(LWh/c;I)LZh/f;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_0

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    check-cast v3, Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-direct {p0, v0}, Lni/w$c;->r(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lni/w$c;->a:Ljava/util/Map;

    check-cast p3, Ljava/util/Collection;

    check-cast p3, Ljava/lang/Iterable;

    iget-object p1, p0, Lni/w$c;->i:Lni/w;

    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    invoke-virtual {p1}, Lni/w;->s()Lli/p;

    move-result-object v2

    invoke-virtual {v2}, Lli/p;->g()LWh/c;

    move-result-object v2

    check-cast v1, LUh/n;

    invoke-virtual {v1}, LUh/n;->m1()I

    move-result v1

    invoke-static {v2, v1}, Lli/L;->b(LWh/c;I)LZh/f;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_2

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    check-cast v2, Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-direct {p0, p2}, Lni/w$c;->r(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lni/w$c;->b:Ljava/util/Map;

    iget-object p1, p0, Lni/w$c;->i:Lni/w;

    invoke-virtual {p1}, Lni/w;->s()Lli/p;

    move-result-object p1

    invoke-virtual {p1}, Lli/p;->c()Lli/n;

    move-result-object p1

    invoke-virtual {p1}, Lli/n;->g()Lli/o;

    move-result-object p1

    invoke-interface {p1}, Lli/o;->g()Z

    move-result p1

    if-eqz p1, :cond_6

    check-cast p4, Ljava/util/Collection;

    check-cast p4, Ljava/lang/Iterable;

    iget-object p1, p0, Lni/w$c;->i:Lni/w;

    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_2
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_5

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    move-object v0, p4

    check-cast v0, Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    invoke-virtual {p1}, Lni/w;->s()Lli/p;

    move-result-object v1

    invoke-virtual {v1}, Lli/p;->g()LWh/c;

    move-result-object v1

    check-cast v0, LUh/r;

    invoke-virtual {v0}, LUh/r;->g1()I

    move-result v0

    invoke-static {v1, v0}, Lli/L;->b(LWh/c;I)LZh/f;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_4

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    check-cast v1, Ljava/util/List;

    invoke-interface {v1, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    invoke-direct {p0, p2}, Lni/w$c;->r(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    goto :goto_3

    :cond_6
    invoke-static {}, LZg/U;->h()Ljava/util/Map;

    move-result-object p1

    :goto_3
    iput-object p1, p0, Lni/w$c;->c:Ljava/util/Map;

    iget-object p1, p0, Lni/w$c;->i:Lni/w;

    invoke-virtual {p1}, Lni/w;->s()Lli/p;

    move-result-object p1

    invoke-virtual {p1}, Lli/p;->h()Loi/n;

    move-result-object p1

    new-instance p2, Lni/H;

    invoke-direct {p2, p0}, Lni/H;-><init>(Lni/w$c;)V

    invoke-interface {p1, p2}, Loi/n;->e(Lmh/l;)Loi/g;

    move-result-object p1

    iput-object p1, p0, Lni/w$c;->d:Loi/g;

    iget-object p1, p0, Lni/w$c;->i:Lni/w;

    invoke-virtual {p1}, Lni/w;->s()Lli/p;

    move-result-object p1

    invoke-virtual {p1}, Lli/p;->h()Loi/n;

    move-result-object p1

    new-instance p2, Lni/I;

    invoke-direct {p2, p0}, Lni/I;-><init>(Lni/w$c;)V

    invoke-interface {p1, p2}, Loi/n;->e(Lmh/l;)Loi/g;

    move-result-object p1

    iput-object p1, p0, Lni/w$c;->e:Loi/g;

    iget-object p1, p0, Lni/w$c;->i:Lni/w;

    invoke-virtual {p1}, Lni/w;->s()Lli/p;

    move-result-object p1

    invoke-virtual {p1}, Lli/p;->h()Loi/n;

    move-result-object p1

    new-instance p2, Lni/J;

    invoke-direct {p2, p0}, Lni/J;-><init>(Lni/w$c;)V

    invoke-interface {p1, p2}, Loi/n;->i(Lmh/l;)Loi/h;

    move-result-object p1

    iput-object p1, p0, Lni/w$c;->f:Loi/h;

    iget-object p1, p0, Lni/w$c;->i:Lni/w;

    invoke-virtual {p1}, Lni/w;->s()Lli/p;

    move-result-object p1

    invoke-virtual {p1}, Lli/p;->h()Loi/n;

    move-result-object p1

    iget-object p2, p0, Lni/w$c;->i:Lni/w;

    new-instance p3, Lni/K;

    invoke-direct {p3, p0, p2}, Lni/K;-><init>(Lni/w$c;Lni/w;)V

    invoke-interface {p1, p3}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p1

    iput-object p1, p0, Lni/w$c;->g:Loi/i;

    iget-object p1, p0, Lni/w$c;->i:Lni/w;

    invoke-virtual {p1}, Lni/w;->s()Lli/p;

    move-result-object p1

    invoke-virtual {p1}, Lli/p;->h()Loi/n;

    move-result-object p1

    iget-object p2, p0, Lni/w$c;->i:Lni/w;

    new-instance p3, Lni/L;

    invoke-direct {p3, p0, p2}, Lni/L;-><init>(Lni/w$c;Lni/w;)V

    invoke-interface {p1, p3}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p1

    iput-object p1, p0, Lni/w$c;->h:Loi/i;

    return-void
.end method

.method static synthetic h(Lni/w$c;LZh/f;)Ljava/util/Collection;
    .locals 0

    invoke-static {p0, p1}, Lni/w$c;->q(Lni/w$c;LZh/f;)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method static synthetic i(Lni/w$c;LZh/f;)Ljava/util/Collection;
    .locals 0

    invoke-static {p0, p1}, Lni/w$c;->s(Lni/w$c;LZh/f;)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method static synthetic j(Lni/w$c;LZh/f;)LBh/k0;
    .locals 0

    invoke-static {p0, p1}, Lni/w$c;->t(Lni/w$c;LZh/f;)LBh/k0;

    move-result-object p0

    return-object p0
.end method

.method static synthetic k(Lni/w$c;Lni/w;)Ljava/util/Set;
    .locals 0

    invoke-static {p0, p1}, Lni/w$c;->p(Lni/w$c;Lni/w;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method static synthetic l(Lni/w$c;Lni/w;)Ljava/util/Set;
    .locals 0

    invoke-static {p0, p1}, Lni/w$c;->u(Lni/w$c;Lni/w;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method private final m(LZh/f;)Ljava/util/Collection;
    .locals 5

    iget-object v0, p0, Lni/w$c;->a:Ljava/util/Map;

    sget-object v1, LUh/i;->w:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    const-string v2, "PARSER"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lni/w$c;->i:Lni/w;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    if-eqz v0, :cond_0

    iget-object v3, p0, Lni/w$c;->i:Lni/w;

    new-instance v4, Ljava/io/ByteArrayInputStream;

    invoke-direct {v4, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    new-instance v0, Lni/w$c$a;

    invoke-direct {v0, v1, v4, v3}, Lni/w$c$a;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/p;Ljava/io/ByteArrayInputStream;Lni/w;)V

    invoke-static {v0}, Lzi/m;->o(Lmh/a;)Lzi/j;

    move-result-object v0

    invoke-static {v0}, Lzi/m;->Z(Lzi/j;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    check-cast v0, Ljava/util/Collection;

    goto :goto_0

    :cond_0
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    :goto_0
    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LUh/i;

    invoke-virtual {v2}, Lni/w;->s()Lli/p;

    move-result-object v4

    invoke-virtual {v4}, Lli/p;->f()Lli/K;

    move-result-object v4

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v4, v1}, Lli/K;->s(LUh/i;)LBh/f0;

    move-result-object v1

    invoke-virtual {v2, v1}, Lni/w;->A(LBh/f0;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    if-eqz v1, :cond_1

    invoke-interface {v3, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-virtual {v2, p1, v3}, Lni/w;->n(LZh/f;Ljava/util/List;)V

    invoke-static {v3}, Lxi/a;->c(Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method private final n(LZh/f;)Ljava/util/Collection;
    .locals 5

    iget-object v0, p0, Lni/w$c;->b:Ljava/util/Map;

    sget-object v1, LUh/n;->w:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    const-string v2, "PARSER"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lni/w$c;->i:Lni/w;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    if-eqz v0, :cond_0

    iget-object v3, p0, Lni/w$c;->i:Lni/w;

    new-instance v4, Ljava/io/ByteArrayInputStream;

    invoke-direct {v4, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    new-instance v0, Lni/w$c$a;

    invoke-direct {v0, v1, v4, v3}, Lni/w$c$a;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/p;Ljava/io/ByteArrayInputStream;Lni/w;)V

    invoke-static {v0}, Lzi/m;->o(Lmh/a;)Lzi/j;

    move-result-object v0

    invoke-static {v0}, Lzi/m;->Z(Lzi/j;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    check-cast v0, Ljava/util/Collection;

    goto :goto_0

    :cond_0
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    :goto_0
    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LUh/n;

    invoke-virtual {v2}, Lni/w;->s()Lli/p;

    move-result-object v4

    invoke-virtual {v4}, Lli/p;->f()Lli/K;

    move-result-object v4

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v4, v1}, Lli/K;->u(LUh/n;)LBh/Y;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {v3, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-virtual {v2, p1, v3}, Lni/w;->o(LZh/f;Ljava/util/List;)V

    invoke-static {v3}, Lxi/a;->c(Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method private final o(LZh/f;)LBh/k0;
    .locals 2

    iget-object v0, p0, Lni/w$c;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Ljava/io/ByteArrayInputStream;

    invoke-direct {v1, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    iget-object p1, p0, Lni/w$c;->i:Lni/w;

    invoke-virtual {p1}, Lni/w;->s()Lli/p;

    move-result-object p1

    invoke-virtual {p1}, Lli/p;->c()Lli/n;

    move-result-object p1

    invoke-virtual {p1}, Lli/n;->k()Lkotlin/reflect/jvm/internal/impl/protobuf/f;

    move-result-object p1

    invoke-static {v1, p1}, LUh/r;->x1(Ljava/io/InputStream;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LUh/r;

    move-result-object p1

    if-nez p1, :cond_1

    return-object v0

    :cond_1
    iget-object v0, p0, Lni/w$c;->i:Lni/w;

    invoke-virtual {v0}, Lni/w;->s()Lli/p;

    move-result-object v0

    invoke-virtual {v0}, Lli/p;->f()Lli/K;

    move-result-object v0

    invoke-virtual {v0, p1}, Lli/K;->z(LUh/r;)LBh/k0;

    move-result-object p1

    return-object p1
.end method

.method private static final p(Lni/w$c;Lni/w;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Lni/w$c;->a:Ljava/util/Map;

    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p0

    invoke-virtual {p1}, Lni/w;->w()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p0, p1}, LZg/d0;->l(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method private static final q(Lni/w$c;LZh/f;)Ljava/util/Collection;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lni/w$c;->m(LZh/f;)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method private final r(Ljava/util/Map;)Ljava/util/Map;
    .locals 6

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    invoke-static {v1}, LZg/U;->d(I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    new-instance v3, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v1, v5}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lkotlin/reflect/jvm/internal/impl/protobuf/a;

    invoke-virtual {v5, v3}, Lkotlin/reflect/jvm/internal/impl/protobuf/a;->j(Ljava/io/OutputStream;)V

    sget-object v5, LYg/J;->a:LYg/J;

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private static final s(Lni/w$c;LZh/f;)Ljava/util/Collection;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lni/w$c;->n(LZh/f;)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method private static final t(Lni/w$c;LZh/f;)LBh/k0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lni/w$c;->o(LZh/f;)LBh/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final u(Lni/w$c;Lni/w;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Lni/w$c;->b:Ljava/util/Map;

    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p0

    invoke-virtual {p1}, Lni/w;->x()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p0, p1}, LZg/d0;->l(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Ljava/util/Set;
    .locals 3

    iget-object v0, p0, Lni/w$c;->g:Loi/i;

    sget-object v1, Lni/w$c;->j:[Lth/l;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, Loi/m;->a(Loi/i;Ljava/lang/Object;Lth/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    return-object v0
.end method

.method public b(LZh/f;LIh/b;)Ljava/util/Collection;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lni/w$c;->a()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1

    :cond_0
    iget-object p2, p0, Lni/w$c;->d:Loi/g;

    invoke-interface {p2, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method public c()Ljava/util/Set;
    .locals 3

    iget-object v0, p0, Lni/w$c;->h:Loi/i;

    sget-object v1, Lni/w$c;->j:[Lth/l;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, Loi/m;->a(Loi/i;Ljava/lang/Object;Lth/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    return-object v0
.end method

.method public d(LZh/f;LIh/b;)Ljava/util/Collection;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lni/w$c;->c()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1

    :cond_0
    iget-object p2, p0, Lni/w$c;->e:Loi/g;

    invoke-interface {p2, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method public e(LZh/f;)LBh/k0;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lni/w$c;->f:Loi/h;

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LBh/k0;

    return-object p1
.end method

.method public f(Ljava/util/Collection;Lii/d;Lmh/l;LIh/b;)V
    .locals 5

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kindFilter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameFilter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lii/d;->c:Lii/d$a;

    invoke-virtual {v0}, Lii/d$a;->i()I

    move-result v0

    invoke-virtual {p2, v0}, Lii/d;->a(I)Z

    move-result v0

    const-string v1, "INSTANCE"

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lni/w$c;->c()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LZh/f;

    invoke-interface {p3, v3}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {p0, v3, p4}, Lni/w$c;->d(LZh/f;LIh/b;)Ljava/util/Collection;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_1
    sget-object v0, Lbi/l;->a:Lbi/l;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v0}, LZg/v;->B(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-interface {p1, v2}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    :cond_2
    sget-object v0, Lii/d;->c:Lii/d$a;

    invoke-virtual {v0}, Lii/d$a;->d()I

    move-result v0

    invoke-virtual {p2, v0}, Lii/d;->a(I)Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-virtual {p0}, Lni/w$c;->a()Ljava/util/Set;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_3
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LZh/f;

    invoke-interface {p3, v2}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {p0, v2, p4}, Lni/w$c;->b(LZh/f;LIh/b;)Ljava/util/Collection;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    :cond_4
    sget-object p2, Lbi/l;->a:Lbi/l;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p2}, LZg/v;->B(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-interface {p1, v0}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    :cond_5
    return-void
.end method

.method public g()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lni/w$c;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
