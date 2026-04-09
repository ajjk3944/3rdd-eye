.class public final Lgi/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LMh/j;

.field private final b:LKh/j;


# direct methods
.method public constructor <init>(LMh/j;LKh/j;)V
    .locals 1

    const-string v0, "packageFragmentProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaResolverCache"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgi/c;->a:LMh/j;

    iput-object p2, p0, Lgi/c;->b:LKh/j;

    return-void
.end method


# virtual methods
.method public final a()LMh/j;
    .locals 1

    iget-object v0, p0, Lgi/c;->a:LMh/j;

    return-object v0
.end method

.method public final b(LQh/g;)LBh/e;
    .locals 4

    const-string v0, "javaClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LQh/g;->e()LZh/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, LQh/g;->I()LQh/D;

    move-result-object v1

    sget-object v2, LQh/D;->SOURCE:LQh/D;

    if-ne v1, v2, :cond_0

    iget-object p1, p0, Lgi/c;->b:LKh/j;

    invoke-interface {p1, v0}, LKh/j;->e(LZh/c;)LBh/e;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {p1}, LQh/g;->f()LQh/g;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    invoke-virtual {p0, v1}, Lgi/c;->b(LQh/g;)LBh/e;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, LBh/e;->y0()Lii/k;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_2

    invoke-interface {p1}, LQh/t;->getName()LZh/f;

    move-result-object p1

    sget-object v1, LIh/d;->FROM_JAVA_LOADER:LIh/d;

    invoke-interface {v0, p1, v1}, Lii/n;->g(LZh/f;LIh/b;)LBh/h;

    move-result-object p1

    goto :goto_1

    :cond_2
    move-object p1, v2

    :goto_1
    instance-of v0, p1, LBh/e;

    if-eqz v0, :cond_3

    move-object v2, p1

    check-cast v2, LBh/e;

    :cond_3
    return-object v2

    :cond_4
    if-nez v0, :cond_5

    return-object v2

    :cond_5
    iget-object v1, p0, Lgi/c;->a:LMh/j;

    invoke-virtual {v0}, LZh/c;->e()LZh/c;

    move-result-object v0

    const-string v3, "parent(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, LMh/j;->c(LZh/c;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LNh/D;

    if-eqz v0, :cond_6

    invoke-virtual {v0, p1}, LNh/D;->N0(LQh/g;)LBh/e;

    move-result-object v2

    :cond_6
    return-object v2
.end method
