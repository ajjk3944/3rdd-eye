.class public abstract LBh/q0;
.super Ljava/lang/Object;
.source "SourceFile"


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
    invoke-direct {p0}, LBh/q0;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(LZh/f;)Z
.end method

.method public final b(Lmh/l;)LBh/q0;
    .locals 4

    const-string v0, "transform"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LBh/A;

    if-eqz v0, :cond_0

    new-instance v0, LBh/A;

    move-object v1, p0

    check-cast v1, LBh/A;

    invoke-virtual {v1}, LBh/A;->c()LZh/f;

    move-result-object v2

    invoke-virtual {v1}, LBh/A;->d()Lri/j;

    move-result-object v1

    invoke-interface {p1, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lri/j;

    invoke-direct {v0, v2, p1}, LBh/A;-><init>(LZh/f;Lri/j;)V

    goto :goto_1

    :cond_0
    instance-of v0, p0, LBh/H;

    if-eqz v0, :cond_2

    move-object v0, p0

    check-cast v0, LBh/H;

    invoke-virtual {v0}, LBh/H;->c()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYg/s;

    invoke-virtual {v2}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LZh/f;

    invoke-virtual {v2}, LYg/s;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lri/j;

    invoke-interface {p1, v2}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3, v2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v0, LBh/H;

    invoke-direct {v0, v1}, LBh/H;-><init>(Ljava/util/List;)V

    :goto_1
    return-object v0

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
