.class public final LJh/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LJh/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LJh/m;

    invoke-direct {v0}, LJh/m;-><init>()V

    sput-object v0, LJh/m;->a:LJh/m;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(LBh/b;)Z
    .locals 0

    invoke-static {p0}, LJh/m;->c(LBh/b;)Z

    move-result p0

    return p0
.end method

.method private static final c(LBh/b;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LJh/m;->a:LJh/m;

    invoke-virtual {v0, p0}, LJh/m;->d(LBh/b;)Z

    move-result p0

    return p0
.end method

.method private final e(LBh/b;)Z
    .locals 4

    sget-object v0, LJh/j;->a:LJh/j;

    invoke-virtual {v0}, LJh/j;->c()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {p1}, Lfi/e;->k(LBh/m;)LZh/c;

    move-result-object v1

    invoke-static {v0, v1}, LZg/v;->f0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-interface {p1}, LBh/a;->i()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-static {p1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->g0(LBh/m;)Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    invoke-interface {p1}, LBh/b;->f()Ljava/util/Collection;

    move-result-object p1

    const-string v0, "getOverriddenDescriptors(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    move v1, v2

    goto :goto_0

    :cond_3
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LBh/b;

    sget-object v3, LJh/m;->a:LJh/m;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v3, v0}, LJh/m;->d(LBh/b;)Z

    move-result v0

    if-eqz v0, :cond_4

    :goto_0
    return v1
.end method


# virtual methods
.method public final b(LBh/b;)Ljava/lang/String;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->g0(LBh/m;)Z

    invoke-static {p1}, Lfi/e;->w(LBh/b;)LBh/b;

    move-result-object p1

    sget-object v0, LJh/l;->a:LJh/l;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p1, v2, v0, v1, v3}, Lfi/e;->i(LBh/b;ZLmh/l;ILjava/lang/Object;)LBh/b;

    move-result-object p1

    if-nez p1, :cond_0

    return-object v3

    :cond_0
    sget-object v0, LJh/j;->a:LJh/j;

    invoke-virtual {v0}, LJh/j;->a()Ljava/util/Map;

    move-result-object v0

    invoke-static {p1}, Lfi/e;->o(LBh/m;)LZh/c;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LZh/f;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LZh/f;->b()Ljava/lang/String;

    move-result-object v3

    :cond_1
    return-object v3
.end method

.method public final d(LBh/b;)Z
    .locals 2

    const-string v0, "callableMemberDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LJh/j;->a:LJh/j;

    invoke-virtual {v0}, LJh/j;->d()Ljava/util/Set;

    move-result-object v0

    invoke-interface {p1}, LBh/I;->getName()LZh/f;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-direct {p0, p1}, LJh/m;->e(LBh/b;)Z

    move-result p1

    return p1
.end method
