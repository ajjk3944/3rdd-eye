.class final Lni/w$b;
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
    name = "b"
.end annotation


# static fields
.field static final synthetic o:[Lth/l;


# instance fields
.field private final a:Ljava/util/List;

.field private final b:Ljava/util/List;

.field private final c:Ljava/util/List;

.field private final d:Loi/i;

.field private final e:Loi/i;

.field private final f:Loi/i;

.field private final g:Loi/i;

.field private final h:Loi/i;

.field private final i:Loi/i;

.field private final j:Loi/i;

.field private final k:Loi/i;

.field private final l:Loi/i;

.field private final m:Loi/i;

.field final synthetic n:Lni/w;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, Lni/w$b;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v2

    const-string v3, "declaredFunctions"

    const-string v4, "getDeclaredFunctions()Ljava/util/List;"

    invoke-direct {v0, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v3

    const-string v4, "declaredProperties"

    const-string v5, "getDeclaredProperties()Ljava/util/List;"

    invoke-direct {v2, v3, v4, v5}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v2

    new-instance v3, Lkotlin/jvm/internal/F;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v4

    const-string v5, "allTypeAliases"

    const-string v6, "getAllTypeAliases()Ljava/util/List;"

    invoke-direct {v3, v4, v5, v6}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v3}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v3

    new-instance v4, Lkotlin/jvm/internal/F;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v5

    const-string v6, "allFunctions"

    const-string v7, "getAllFunctions()Ljava/util/List;"

    invoke-direct {v4, v5, v6, v7}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v4}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v4

    new-instance v5, Lkotlin/jvm/internal/F;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v6

    const-string v7, "allProperties"

    const-string v8, "getAllProperties()Ljava/util/List;"

    invoke-direct {v5, v6, v7, v8}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v5}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v5

    new-instance v6, Lkotlin/jvm/internal/F;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v7

    const-string v8, "typeAliasesByName"

    const-string v9, "getTypeAliasesByName()Ljava/util/Map;"

    invoke-direct {v6, v7, v8, v9}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v6}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v6

    new-instance v7, Lkotlin/jvm/internal/F;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v8

    const-string v9, "functionsByName"

    const-string v10, "getFunctionsByName()Ljava/util/Map;"

    invoke-direct {v7, v8, v9, v10}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v7}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v7

    new-instance v8, Lkotlin/jvm/internal/F;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v9

    const-string v10, "propertiesByName"

    const-string v11, "getPropertiesByName()Ljava/util/Map;"

    invoke-direct {v8, v9, v10, v11}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v8}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v8

    new-instance v9, Lkotlin/jvm/internal/F;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v10

    const-string v11, "functionNames"

    const-string v12, "getFunctionNames()Ljava/util/Set;"

    invoke-direct {v9, v10, v11, v12}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v9}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v9

    new-instance v10, Lkotlin/jvm/internal/F;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v1

    const-string v11, "variableNames"

    const-string v12, "getVariableNames()Ljava/util/Set;"

    invoke-direct {v10, v1, v11, v12}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v10}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v1

    const/16 v10, 0xa

    new-array v10, v10, [Lth/l;

    const/4 v11, 0x0

    aput-object v0, v10, v11

    const/4 v0, 0x1

    aput-object v2, v10, v0

    const/4 v0, 0x2

    aput-object v3, v10, v0

    const/4 v0, 0x3

    aput-object v4, v10, v0

    const/4 v0, 0x4

    aput-object v5, v10, v0

    const/4 v0, 0x5

    aput-object v6, v10, v0

    const/4 v0, 0x6

    aput-object v7, v10, v0

    const/4 v0, 0x7

    aput-object v8, v10, v0

    const/16 v0, 0x8

    aput-object v9, v10, v0

    const/16 v0, 0x9

    aput-object v1, v10, v0

    sput-object v10, Lni/w$b;->o:[Lth/l;

    return-void
.end method

.method public constructor <init>(Lni/w;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 1

    const-string v0, "functionList"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "propertyList"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeAliasList"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lni/w$b;->n:Lni/w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lni/w$b;->a:Ljava/util/List;

    iput-object p3, p0, Lni/w$b;->b:Ljava/util/List;

    invoke-virtual {p1}, Lni/w;->s()Lli/p;

    move-result-object p2

    invoke-virtual {p2}, Lli/p;->c()Lli/n;

    move-result-object p2

    invoke-virtual {p2}, Lli/n;->g()Lli/o;

    move-result-object p2

    invoke-interface {p2}, Lli/o;->g()Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p4

    :goto_0
    iput-object p4, p0, Lni/w$b;->c:Ljava/util/List;

    invoke-virtual {p1}, Lni/w;->s()Lli/p;

    move-result-object p2

    invoke-virtual {p2}, Lli/p;->h()Loi/n;

    move-result-object p2

    new-instance p3, Lni/x;

    invoke-direct {p3, p0}, Lni/x;-><init>(Lni/w$b;)V

    invoke-interface {p2, p3}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p2

    iput-object p2, p0, Lni/w$b;->d:Loi/i;

    invoke-virtual {p1}, Lni/w;->s()Lli/p;

    move-result-object p2

    invoke-virtual {p2}, Lli/p;->h()Loi/n;

    move-result-object p2

    new-instance p3, Lni/y;

    invoke-direct {p3, p0}, Lni/y;-><init>(Lni/w$b;)V

    invoke-interface {p2, p3}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p2

    iput-object p2, p0, Lni/w$b;->e:Loi/i;

    invoke-virtual {p1}, Lni/w;->s()Lli/p;

    move-result-object p2

    invoke-virtual {p2}, Lli/p;->h()Loi/n;

    move-result-object p2

    new-instance p3, Lni/z;

    invoke-direct {p3, p0}, Lni/z;-><init>(Lni/w$b;)V

    invoke-interface {p2, p3}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p2

    iput-object p2, p0, Lni/w$b;->f:Loi/i;

    invoke-virtual {p1}, Lni/w;->s()Lli/p;

    move-result-object p2

    invoke-virtual {p2}, Lli/p;->h()Loi/n;

    move-result-object p2

    new-instance p3, Lni/A;

    invoke-direct {p3, p0}, Lni/A;-><init>(Lni/w$b;)V

    invoke-interface {p2, p3}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p2

    iput-object p2, p0, Lni/w$b;->g:Loi/i;

    invoke-virtual {p1}, Lni/w;->s()Lli/p;

    move-result-object p2

    invoke-virtual {p2}, Lli/p;->h()Loi/n;

    move-result-object p2

    new-instance p3, Lni/B;

    invoke-direct {p3, p0}, Lni/B;-><init>(Lni/w$b;)V

    invoke-interface {p2, p3}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p2

    iput-object p2, p0, Lni/w$b;->h:Loi/i;

    invoke-virtual {p1}, Lni/w;->s()Lli/p;

    move-result-object p2

    invoke-virtual {p2}, Lli/p;->h()Loi/n;

    move-result-object p2

    new-instance p3, Lni/C;

    invoke-direct {p3, p0}, Lni/C;-><init>(Lni/w$b;)V

    invoke-interface {p2, p3}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p2

    iput-object p2, p0, Lni/w$b;->i:Loi/i;

    invoke-virtual {p1}, Lni/w;->s()Lli/p;

    move-result-object p2

    invoke-virtual {p2}, Lli/p;->h()Loi/n;

    move-result-object p2

    new-instance p3, Lni/D;

    invoke-direct {p3, p0}, Lni/D;-><init>(Lni/w$b;)V

    invoke-interface {p2, p3}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p2

    iput-object p2, p0, Lni/w$b;->j:Loi/i;

    invoke-virtual {p1}, Lni/w;->s()Lli/p;

    move-result-object p2

    invoke-virtual {p2}, Lli/p;->h()Loi/n;

    move-result-object p2

    new-instance p3, Lni/E;

    invoke-direct {p3, p0}, Lni/E;-><init>(Lni/w$b;)V

    invoke-interface {p2, p3}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p2

    iput-object p2, p0, Lni/w$b;->k:Loi/i;

    invoke-virtual {p1}, Lni/w;->s()Lli/p;

    move-result-object p2

    invoke-virtual {p2}, Lli/p;->h()Loi/n;

    move-result-object p2

    new-instance p3, Lni/F;

    invoke-direct {p3, p0, p1}, Lni/F;-><init>(Lni/w$b;Lni/w;)V

    invoke-interface {p2, p3}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p2

    iput-object p2, p0, Lni/w$b;->l:Loi/i;

    invoke-virtual {p1}, Lni/w;->s()Lli/p;

    move-result-object p2

    invoke-virtual {p2}, Lli/p;->h()Loi/n;

    move-result-object p2

    new-instance p3, Lni/G;

    invoke-direct {p3, p0, p1}, Lni/G;-><init>(Lni/w$b;Lni/w;)V

    invoke-interface {p2, p3}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p1

    iput-object p1, p0, Lni/w$b;->m:Loi/i;

    return-void
.end method

.method private final A()Ljava/util/List;
    .locals 5

    iget-object v0, p0, Lni/w$b;->c:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    iget-object v1, p0, Lni/w$b;->n:Lni/w;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    invoke-virtual {v1}, Lni/w;->s()Lli/p;

    move-result-object v4

    invoke-virtual {v4}, Lli/p;->f()Lli/K;

    move-result-object v4

    check-cast v3, LUh/r;

    invoke-virtual {v4, v3}, Lli/K;->z(LUh/r;)LBh/k0;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v2
.end method

.method private static final B(Lni/w$b;)Ljava/util/List;
    .locals 0

    invoke-direct {p0}, Lni/w$b;->w()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final C(Lni/w$b;)Ljava/util/List;
    .locals 0

    invoke-direct {p0}, Lni/w$b;->z()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final D(Lni/w$b;Lni/w;)Ljava/util/Set;
    .locals 4

    iget-object v0, p0, Lni/w$b;->a:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    iget-object p0, p0, Lni/w$b;->n:Lni/w;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    invoke-virtual {p0}, Lni/w;->s()Lli/p;

    move-result-object v3

    invoke-virtual {v3}, Lli/p;->g()LWh/c;

    move-result-object v3

    check-cast v2, LUh/i;

    invoke-virtual {v2}, LUh/i;->n1()I

    move-result v2

    invoke-static {v3, v2}, Lli/L;->b(LWh/c;I)LZh/f;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lni/w;->w()Ljava/util/Set;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {v1, p0}, LZg/d0;->l(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method private static final E(Lni/w$b;)Ljava/util/Map;
    .locals 4

    invoke-direct {p0}, Lni/w$b;->F()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LBh/f0;

    invoke-interface {v2}, LBh/I;->getName()LZh/f;

    move-result-object v2

    const-string v3, "getName(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

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
    return-object v0
.end method

.method private final F()Ljava/util/List;
    .locals 3

    iget-object v0, p0, Lni/w$b;->g:Loi/i;

    sget-object v1, Lni/w$b;->o:[Lth/l;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, Loi/m;->a(Loi/i;Ljava/lang/Object;Lth/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method private final G()Ljava/util/List;
    .locals 3

    iget-object v0, p0, Lni/w$b;->h:Loi/i;

    sget-object v1, Lni/w$b;->o:[Lth/l;

    const/4 v2, 0x4

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, Loi/m;->a(Loi/i;Ljava/lang/Object;Lth/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method private final H()Ljava/util/List;
    .locals 3

    iget-object v0, p0, Lni/w$b;->f:Loi/i;

    sget-object v1, Lni/w$b;->o:[Lth/l;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, Loi/m;->a(Loi/i;Ljava/lang/Object;Lth/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method private final I()Ljava/util/List;
    .locals 3

    iget-object v0, p0, Lni/w$b;->d:Loi/i;

    sget-object v1, Lni/w$b;->o:[Lth/l;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, Loi/m;->a(Loi/i;Ljava/lang/Object;Lth/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method private final J()Ljava/util/List;
    .locals 3

    iget-object v0, p0, Lni/w$b;->e:Loi/i;

    sget-object v1, Lni/w$b;->o:[Lth/l;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, Loi/m;->a(Loi/i;Ljava/lang/Object;Lth/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method private final K()Ljava/util/Map;
    .locals 3

    iget-object v0, p0, Lni/w$b;->j:Loi/i;

    sget-object v1, Lni/w$b;->o:[Lth/l;

    const/4 v2, 0x6

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, Loi/m;->a(Loi/i;Ljava/lang/Object;Lth/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method private final L()Ljava/util/Map;
    .locals 3

    iget-object v0, p0, Lni/w$b;->k:Loi/i;

    sget-object v1, Lni/w$b;->o:[Lth/l;

    const/4 v2, 0x7

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, Loi/m;->a(Loi/i;Ljava/lang/Object;Lth/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method private final M()Ljava/util/Map;
    .locals 3

    iget-object v0, p0, Lni/w$b;->i:Loi/i;

    sget-object v1, Lni/w$b;->o:[Lth/l;

    const/4 v2, 0x5

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, Loi/m;->a(Loi/i;Ljava/lang/Object;Lth/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method private static final N(Lni/w$b;)Ljava/util/Map;
    .locals 4

    invoke-direct {p0}, Lni/w$b;->G()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LBh/Y;

    invoke-interface {v2}, LBh/I;->getName()LZh/f;

    move-result-object v2

    const-string v3, "getName(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

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
    return-object v0
.end method

.method private static final O(Lni/w$b;)Ljava/util/Map;
    .locals 4

    invoke-direct {p0}, Lni/w$b;->H()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    const/16 v0, 0xa

    invoke-static {p0, v0}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-static {v0}, LZg/U;->d(I)I

    move-result v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Lsh/m;->d(II)I

    move-result v0

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LBh/k0;

    invoke-interface {v2}, LBh/I;->getName()LZh/f;

    move-result-object v2

    const-string v3, "getName(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method private static final P(Lni/w$b;Lni/w;)Ljava/util/Set;
    .locals 4

    iget-object v0, p0, Lni/w$b;->b:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    iget-object p0, p0, Lni/w$b;->n:Lni/w;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    invoke-virtual {p0}, Lni/w;->s()Lli/p;

    move-result-object v3

    invoke-virtual {v3}, Lli/p;->g()LWh/c;

    move-result-object v3

    check-cast v2, LUh/n;

    invoke-virtual {v2}, LUh/n;->m1()I

    move-result v2

    invoke-static {v3, v2}, Lli/L;->b(LWh/c;I)LZh/f;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lni/w;->x()Ljava/util/Set;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {v1, p0}, LZg/d0;->l(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method static synthetic h(Lni/w$b;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lni/w$b;->B(Lni/w$b;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method static synthetic i(Lni/w$b;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lni/w$b;->C(Lni/w$b;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method static synthetic j(Lni/w$b;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lni/w$b;->t(Lni/w$b;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method static synthetic k(Lni/w$b;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lni/w$b;->r(Lni/w$b;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method static synthetic l(Lni/w$b;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lni/w$b;->s(Lni/w$b;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method static synthetic m(Lni/w$b;)Ljava/util/Map;
    .locals 0

    invoke-static {p0}, Lni/w$b;->O(Lni/w$b;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method static synthetic n(Lni/w$b;)Ljava/util/Map;
    .locals 0

    invoke-static {p0}, Lni/w$b;->E(Lni/w$b;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method static synthetic o(Lni/w$b;)Ljava/util/Map;
    .locals 0

    invoke-static {p0}, Lni/w$b;->N(Lni/w$b;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method static synthetic p(Lni/w$b;Lni/w;)Ljava/util/Set;
    .locals 0

    invoke-static {p0, p1}, Lni/w$b;->D(Lni/w$b;Lni/w;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method static synthetic q(Lni/w$b;Lni/w;)Ljava/util/Set;
    .locals 0

    invoke-static {p0, p1}, Lni/w$b;->P(Lni/w$b;Lni/w;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method private static final r(Lni/w$b;)Ljava/util/List;
    .locals 1

    invoke-direct {p0}, Lni/w$b;->I()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-direct {p0}, Lni/w$b;->u()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {v0, p0}, LZg/v;->M0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final s(Lni/w$b;)Ljava/util/List;
    .locals 1

    invoke-direct {p0}, Lni/w$b;->J()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-direct {p0}, Lni/w$b;->v()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {v0, p0}, LZg/v;->M0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final t(Lni/w$b;)Ljava/util/List;
    .locals 0

    invoke-direct {p0}, Lni/w$b;->A()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private final u()Ljava/util/List;
    .locals 3

    iget-object v0, p0, Lni/w$b;->n:Lni/w;

    invoke-virtual {v0}, Lni/w;->w()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LZh/f;

    invoke-direct {p0, v2}, Lni/w$b;->x(LZh/f;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v1, v2}, LZg/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method private final v()Ljava/util/List;
    .locals 3

    iget-object v0, p0, Lni/w$b;->n:Lni/w;

    invoke-virtual {v0}, Lni/w;->x()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LZh/f;

    invoke-direct {p0, v2}, Lni/w$b;->y(LZh/f;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v1, v2}, LZg/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method private final w()Ljava/util/List;
    .locals 5

    iget-object v0, p0, Lni/w$b;->a:Ljava/util/List;

    iget-object v1, p0, Lni/w$b;->n:Lni/w;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    invoke-virtual {v1}, Lni/w;->s()Lli/p;

    move-result-object v4

    invoke-virtual {v4}, Lli/p;->f()Lli/K;

    move-result-object v4

    check-cast v3, LUh/i;

    invoke-virtual {v4, v3}, Lli/K;->s(LUh/i;)LBh/f0;

    move-result-object v3

    invoke-virtual {v1, v3}, Lni/w;->A(LBh/f0;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_0

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v2
.end method

.method private final x(LZh/f;)Ljava/util/List;
    .locals 5

    invoke-direct {p0}, Lni/w$b;->I()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lni/w$b;->n:Lni/w;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, LBh/m;

    invoke-interface {v4}, LBh/I;->getName()LZh/f;

    move-result-object v4

    invoke-static {v4, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {v1, p1, v2}, Lni/w;->n(LZh/f;Ljava/util/List;)V

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result p1

    invoke-interface {v2, v0, p1}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private final y(LZh/f;)Ljava/util/List;
    .locals 5

    invoke-direct {p0}, Lni/w$b;->J()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lni/w$b;->n:Lni/w;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, LBh/m;

    invoke-interface {v4}, LBh/I;->getName()LZh/f;

    move-result-object v4

    invoke-static {v4, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {v1, p1, v2}, Lni/w;->o(LZh/f;Ljava/util/List;)V

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result p1

    invoke-interface {v2, v0, p1}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private final z()Ljava/util/List;
    .locals 5

    iget-object v0, p0, Lni/w$b;->b:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    iget-object v1, p0, Lni/w$b;->n:Lni/w;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    invoke-virtual {v1}, Lni/w;->s()Lli/p;

    move-result-object v4

    invoke-virtual {v4}, Lli/p;->f()Lli/K;

    move-result-object v4

    check-cast v3, LUh/n;

    invoke-virtual {v4, v3}, Lli/K;->u(LUh/n;)LBh/Y;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v2
.end method


# virtual methods
.method public a()Ljava/util/Set;
    .locals 3

    iget-object v0, p0, Lni/w$b;->l:Loi/i;

    sget-object v1, Lni/w$b;->o:[Lth/l;

    const/16 v2, 0x8

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

    invoke-virtual {p0}, Lni/w$b;->a()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1

    :cond_0
    invoke-direct {p0}, Lni/w$b;->K()Ljava/util/Map;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    if-nez p1, :cond_1

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    :cond_1
    return-object p1
.end method

.method public c()Ljava/util/Set;
    .locals 3

    iget-object v0, p0, Lni/w$b;->m:Loi/i;

    sget-object v1, Lni/w$b;->o:[Lth/l;

    const/16 v2, 0x9

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

    invoke-virtual {p0}, Lni/w$b;->c()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1

    :cond_0
    invoke-direct {p0}, Lni/w$b;->L()Ljava/util/Map;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    if-nez p1, :cond_1

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    :cond_1
    return-object p1
.end method

.method public e(LZh/f;)LBh/k0;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lni/w$b;->M()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LBh/k0;

    return-object p1
.end method

.method public f(Ljava/util/Collection;Lii/d;Lmh/l;LIh/b;)V
    .locals 3

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kindFilter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameFilter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p4, Lii/d;->c:Lii/d$a;

    invoke-virtual {p4}, Lii/d$a;->i()I

    move-result p4

    invoke-virtual {p2, p4}, Lii/d;->a(I)Z

    move-result p4

    const-string v0, "getName(...)"

    if-eqz p4, :cond_1

    invoke-direct {p0}, Lni/w$b;->G()Ljava/util/List;

    move-result-object p4

    check-cast p4, Ljava/lang/Iterable;

    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :cond_0
    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LBh/Y;

    invoke-interface {v2}, LBh/I;->getName()LZh/f;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p3, v2}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    sget-object p4, Lii/d;->c:Lii/d$a;

    invoke-virtual {p4}, Lii/d$a;->d()I

    move-result p4

    invoke-virtual {p2, p4}, Lii/d;->a(I)Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-direct {p0}, Lni/w$b;->F()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    move-object v1, p4

    check-cast v1, LBh/f0;

    invoke-interface {v1}, LBh/I;->getName()LZh/f;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p3, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    return-void
.end method

.method public g()Ljava/util/Set;
    .locals 5

    iget-object v0, p0, Lni/w$b;->c:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    iget-object v2, p0, Lni/w$b;->n:Lni/w;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    invoke-virtual {v2}, Lni/w;->s()Lli/p;

    move-result-object v4

    invoke-virtual {v4}, Lli/p;->g()LWh/c;

    move-result-object v4

    check-cast v3, LUh/r;

    invoke-virtual {v3}, LUh/r;->g1()I

    move-result v3

    invoke-static {v4, v3}, Lli/L;->b(LWh/c;I)LZh/f;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method
