.class public final LJh/z$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJh/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LJh/z$a;-><init>()V

    return-void
.end method

.method private final b(LBh/z;)Z
    .locals 5

    invoke-interface {p1}, LBh/a;->i()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_0

    return v1

    :cond_0
    invoke-interface {p1}, LBh/z;->b()LBh/m;

    move-result-object v0

    instance-of v3, v0, LBh/e;

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    check-cast v0, LBh/e;

    goto :goto_0

    :cond_1
    move-object v0, v4

    :goto_0
    if-nez v0, :cond_2

    return v1

    :cond_2
    invoke-interface {p1}, LBh/a;->i()Ljava/util/List;

    move-result-object p1

    const-string v3, "getValueParameters(...)"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LZg/v;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LBh/s0;

    invoke-interface {p1}, LBh/r0;->getType()Lpi/S;

    move-result-object p1

    invoke-virtual {p1}, Lpi/S;->N0()Lpi/v0;

    move-result-object p1

    invoke-interface {p1}, Lpi/v0;->c()LBh/h;

    move-result-object p1

    instance-of v3, p1, LBh/e;

    if-eqz v3, :cond_3

    move-object v4, p1

    check-cast v4, LBh/e;

    :cond_3
    if-nez v4, :cond_4

    return v1

    :cond_4
    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->r0(LBh/e;)Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {v0}, Lfi/e;->o(LBh/m;)LZh/c;

    move-result-object p1

    invoke-static {v4}, Lfi/e;->o(LBh/m;)LZh/c;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    move v1, v2

    :cond_5
    return v1
.end method

.method private final c(LBh/z;LBh/s0;)LSh/s;
    .locals 2

    invoke-static {p1}, LSh/C;->e(LBh/a;)Z

    move-result v0

    const-string v1, "getType(...)"

    if-nez v0, :cond_1

    invoke-direct {p0, p1}, LJh/z$a;->b(LBh/z;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, LBh/r0;->getType()Lpi/S;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LSh/C;->g(Lpi/S;)LSh/s;

    move-result-object p1

    goto :goto_1

    :cond_1
    :goto_0
    invoke-interface {p2}, LBh/r0;->getType()Lpi/S;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lsi/d;->B(Lpi/S;)Lpi/S;

    move-result-object p1

    invoke-static {p1}, LSh/C;->g(Lpi/S;)LSh/s;

    move-result-object p1

    :goto_1
    return-object p1
.end method


# virtual methods
.method public final a(LBh/a;LBh/a;)Z
    .locals 5

    const-string v0, "superDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subDescriptor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, LLh/e;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    instance-of v0, p1, LBh/z;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, p2

    check-cast v0, LLh/e;

    invoke-virtual {v0}, LDh/s;->i()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    check-cast p1, LBh/z;

    invoke-interface {p1}, LBh/a;->i()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    invoke-virtual {v0}, LDh/O;->m1()LBh/f0;

    move-result-object v0

    invoke-interface {v0}, LBh/a;->i()Ljava/util/List;

    move-result-object v0

    const-string v2, "getValueParameters(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {p1}, LBh/z;->a()LBh/z;

    move-result-object v3

    invoke-interface {v3}, LBh/a;->i()Ljava/util/List;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v0, v3}, LZg/v;->s1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYg/s;

    invoke-virtual {v2}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LBh/s0;

    invoke-virtual {v2}, LYg/s;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LBh/s0;

    move-object v4, p2

    check-cast v4, LBh/z;

    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {p0, v4, v3}, LJh/z$a;->c(LBh/z;LBh/s0;)LSh/s;

    move-result-object v3

    instance-of v3, v3, LSh/s$d;

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {p0, p1, v2}, LJh/z$a;->c(LBh/z;LBh/s0;)LSh/s;

    move-result-object v2

    instance-of v2, v2, LSh/s$d;

    if-eq v3, v2, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_0
    return v1
.end method
