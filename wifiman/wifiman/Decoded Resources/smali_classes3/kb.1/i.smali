.class final Lkb/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVi/b;


# static fields
.field public static final a:Lkb/i;

.field private static final b:LVi/b;

.field private static final c:LXi/f;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lkb/i;

    invoke-direct {v0}, Lkb/i;-><init>()V

    sput-object v0, Lkb/i;->a:Lkb/i;

    sget-object v0, Lkotlin/jvm/internal/U;->a:Lkotlin/jvm/internal/U;

    invoke-static {v0}, LWi/a;->K(Lkotlin/jvm/internal/U;)LVi/b;

    move-result-object v1

    invoke-static {v0}, LWi/a;->K(Lkotlin/jvm/internal/U;)LVi/b;

    move-result-object v0

    invoke-static {v0}, LWi/a;->h(LVi/b;)LVi/b;

    move-result-object v0

    invoke-static {v1, v0}, LWi/a;->k(LVi/b;LVi/b;)LVi/b;

    move-result-object v0

    sput-object v0, Lkb/i;->b:LVi/b;

    const-class v0, Lkb/g;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "getName(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    new-array v1, v1, [LXi/f;

    new-instance v2, Lkb/h;

    invoke-direct {v2}, Lkb/h;-><init>()V

    invoke-static {v0, v1, v2}, LXi/l;->c(Ljava/lang/String;[LXi/f;Lmh/l;)LXi/f;

    move-result-object v0

    sput-object v0, Lkb/i;->c:LXi/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic g(LXi/a;)LYg/J;
    .locals 0

    invoke-static {p0}, Lkb/i;->h(LXi/a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final h(LXi/a;)LYg/J;
    .locals 8

    const-string v0, "$this$buildClassSerialDescriptor"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkb/i;->b:LVi/b;

    invoke-interface {v0}, LVi/b;->a()LXi/f;

    move-result-object v3

    const/16 v6, 0xc

    const/4 v7, 0x0

    const-string/jumbo v2, "headers"

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v7}, LXi/a;->b(LXi/a;Ljava/lang/String;LXi/f;Ljava/util/List;ZILjava/lang/Object;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public a()LXi/f;
    .locals 1

    sget-object v0, Lkb/i;->c:LXi/f;

    return-object v0
.end method

.method public bridge synthetic c(LYi/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lkb/i;->i(LYi/e;)Lkb/g;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(LYi/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lkb/g;

    invoke-virtual {p0, p1, p2}, Lkb/i;->j(LYi/f;Lkb/g;)V

    return-void
.end method

.method public i(LYi/e;)Lkb/g;
    .locals 6

    const-string/jumbo v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Laj/i;

    if-eqz v0, :cond_0

    check-cast p1, Laj/i;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_4

    invoke-interface {p1}, Laj/i;->m()Laj/j;

    move-result-object p1

    invoke-static {p1}, Laj/k;->h(Laj/j;)Laj/E;

    move-result-object p1

    invoke-virtual {p1}, Laj/E;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    const/16 v0, 0xa

    invoke-static {p1, v0}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-static {v1}, LZg/U;->d(I)I

    move-result v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Lsh/m;->d(II)I

    move-result v1

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Laj/j;

    instance-of v4, v1, Laj/c;

    if-eqz v4, :cond_1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v1, v0}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Laj/j;

    invoke-static {v5}, Laj/k;->i(Laj/j;)Laj/G;

    move-result-object v5

    invoke-virtual {v5}, Laj/G;->b()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_1
    invoke-static {v1}, Laj/k;->i(Laj/j;)Laj/G;

    move-result-object v1

    invoke-virtual {v1}, Laj/G;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    :cond_2
    invoke-static {v3, v4}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v1

    invoke-virtual {v1}, LYg/s;->h()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1}, LYg/s;->j()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    new-instance p1, Lkb/g;

    invoke-direct {p1, v2}, Lkb/g;-><init>(Ljava/util/Map;)V

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string/jumbo v0, "Only JSON decoder supported"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public j(LYi/f;Lkb/g;)V
    .locals 1

    const-string/jumbo v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkb/i;->b:LVi/b;

    invoke-virtual {p2}, Lkb/g;->a()Ljava/util/Map;

    move-result-object p2

    invoke-interface {p1, v0, p2}, LYi/f;->z(LVi/o;Ljava/lang/Object;)V

    return-void
.end method
