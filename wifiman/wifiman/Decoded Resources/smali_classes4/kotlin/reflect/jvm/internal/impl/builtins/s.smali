.class public final Lkotlin/reflect/jvm/internal/impl/builtins/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lkotlin/reflect/jvm/internal/impl/builtins/s;

.field private static final b:Ljava/util/Set;

.field private static final c:Ljava/util/Set;

.field private static final d:Ljava/util/HashMap;

.field private static final e:Ljava/util/HashMap;

.field private static final f:Ljava/util/HashMap;

.field private static final g:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/builtins/s;

    invoke-direct {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/s;-><init>()V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/s;->a:Lkotlin/reflect/jvm/internal/impl/builtins/s;

    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/builtins/r;->values()[Lkotlin/reflect/jvm/internal/impl/builtins/r;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    array-length v2, v0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, v0

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_0

    aget-object v5, v0, v4

    invoke-virtual {v5}, Lkotlin/reflect/jvm/internal/impl/builtins/r;->getTypeName()LZh/f;

    move-result-object v5

    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v1}, LZg/v;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/s;->b:Ljava/util/Set;

    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/builtins/q;->values()[Lkotlin/reflect/jvm/internal/impl/builtins/q;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    array-length v2, v0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, v0

    move v4, v3

    :goto_1
    if-ge v4, v2, :cond_1

    aget-object v5, v0, v4

    invoke-virtual {v5}, Lkotlin/reflect/jvm/internal/impl/builtins/q;->getTypeName()LZh/f;

    move-result-object v5

    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    invoke-static {v1}, LZg/v;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/s;->c:Ljava/util/Set;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/s;->d:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/s;->e:Ljava/util/HashMap;

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/q;->UBYTEARRAY:Lkotlin/reflect/jvm/internal/impl/builtins/q;

    const-string v1, "ubyteArrayOf"

    invoke-static {v1}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v1

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v0

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/builtins/q;->USHORTARRAY:Lkotlin/reflect/jvm/internal/impl/builtins/q;

    const-string v2, "ushortArrayOf"

    invoke-static {v2}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v2

    invoke-static {v1, v2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v1

    sget-object v2, Lkotlin/reflect/jvm/internal/impl/builtins/q;->UINTARRAY:Lkotlin/reflect/jvm/internal/impl/builtins/q;

    const-string v4, "uintArrayOf"

    invoke-static {v4}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v4

    invoke-static {v2, v4}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v2

    sget-object v4, Lkotlin/reflect/jvm/internal/impl/builtins/q;->ULONGARRAY:Lkotlin/reflect/jvm/internal/impl/builtins/q;

    const-string v5, "ulongArrayOf"

    invoke-static {v5}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v5

    invoke-static {v4, v5}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v4

    filled-new-array {v0, v1, v2, v4}, [LYg/s;

    move-result-object v0

    invoke-static {v0}, LZg/U;->j([LYg/s;)Ljava/util/HashMap;

    move-result-object v0

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/s;->f:Ljava/util/HashMap;

    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/builtins/r;->values()[Lkotlin/reflect/jvm/internal/impl/builtins/r;

    move-result-object v0

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    array-length v2, v0

    move v4, v3

    :goto_2
    if-ge v4, v2, :cond_2

    aget-object v5, v0, v4

    invoke-virtual {v5}, Lkotlin/reflect/jvm/internal/impl/builtins/r;->getArrayClassId()LZh/b;

    move-result-object v5

    invoke-virtual {v5}, LZh/b;->h()LZh/f;

    move-result-object v5

    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_2
    sput-object v1, Lkotlin/reflect/jvm/internal/impl/builtins/s;->g:Ljava/util/Set;

    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/builtins/r;->values()[Lkotlin/reflect/jvm/internal/impl/builtins/r;

    move-result-object v0

    array-length v1, v0

    :goto_3
    if-ge v3, v1, :cond_3

    aget-object v2, v0, v3

    sget-object v4, Lkotlin/reflect/jvm/internal/impl/builtins/s;->d:Ljava/util/HashMap;

    invoke-virtual {v2}, Lkotlin/reflect/jvm/internal/impl/builtins/r;->getArrayClassId()LZh/b;

    move-result-object v5

    invoke-virtual {v2}, Lkotlin/reflect/jvm/internal/impl/builtins/r;->getClassId()LZh/b;

    move-result-object v6

    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v4, Lkotlin/reflect/jvm/internal/impl/builtins/s;->e:Ljava/util/HashMap;

    invoke-virtual {v2}, Lkotlin/reflect/jvm/internal/impl/builtins/r;->getClassId()LZh/b;

    move-result-object v5

    invoke-virtual {v2}, Lkotlin/reflect/jvm/internal/impl/builtins/r;->getArrayClassId()LZh/b;

    move-result-object v2

    invoke-interface {v4, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_3
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final d(Lpi/S;)Z
    .locals 2

    const-string v0, "type"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lpi/J0;->w(Lpi/S;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Lpi/S;->N0()Lpi/v0;

    move-result-object p0

    invoke-interface {p0}, Lpi/v0;->c()LBh/h;

    move-result-object p0

    if-nez p0, :cond_1

    return v1

    :cond_1
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/s;->a:Lkotlin/reflect/jvm/internal/impl/builtins/s;

    invoke-virtual {v0, p0}, Lkotlin/reflect/jvm/internal/impl/builtins/s;->c(LBh/m;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final a(LZh/b;)LZh/b;
    .locals 1

    const-string v0, "arrayClassId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/s;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LZh/b;

    return-object p1
.end method

.method public final b(LZh/f;)Z
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/s;->g:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final c(LBh/m;)Z
    .locals 2

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LBh/m;->b()LBh/m;

    move-result-object v0

    instance-of v1, v0, LBh/M;

    if-eqz v1, :cond_0

    check-cast v0, LBh/M;

    invoke-interface {v0}, LBh/M;->e()LZh/c;

    move-result-object v0

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/builtins/o;->A:LZh/c;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/s;->b:Ljava/util/Set;

    invoke-interface {p1}, LBh/I;->getName()LZh/f;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
