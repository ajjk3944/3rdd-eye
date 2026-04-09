.class public abstract Lfe/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/HashMap;

.field private final b:LYg/m;

.field private final c:LYg/m;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lfe/s;->a:Ljava/util/HashMap;

    new-instance v0, Lfe/q;

    invoke-direct {v0, p0}, Lfe/q;-><init>(Lfe/s;)V

    invoke-static {v0}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object v0

    iput-object v0, p0, Lfe/s;->b:LYg/m;

    new-instance v0, Lfe/r;

    invoke-direct {v0, p0}, Lfe/r;-><init>(Lfe/s;)V

    invoke-static {v0}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object v0

    iput-object v0, p0, Lfe/s;->c:LYg/m;

    return-void
.end method

.method public static synthetic a(Lfe/s;Lgg/c;)V
    .locals 0

    invoke-static {p0, p1}, Lfe/s;->o(Lfe/s;Lgg/c;)V

    return-void
.end method

.method public static synthetic b(Lfe/s;)Lgg/i;
    .locals 0

    invoke-static {p0}, Lfe/s;->l(Lfe/s;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lfe/s;)LFg/a;
    .locals 0

    invoke-static {p0}, Lfe/s;->k(Lfe/s;)LFg/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lfe/s;Ljava/lang/Object;Lgg/c;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lfe/s;->n(Lfe/s;Ljava/lang/Object;Lgg/c;)V

    return-void
.end method

.method private final e()V
    .locals 6

    invoke-direct {p0}, Lfe/s;->h()LFg/a;

    move-result-object v0

    iget-object v1, p0, Lfe/s;->a:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    const-string v2, "<get-values>(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_0

    const/4 v1, 0x0

    goto :goto_1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_1

    :goto_0
    move-object v1, v2

    goto :goto_1

    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p0, v2}, Lfe/s;->j(Ljava/lang/Object;)I

    move-result v3

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p0, v4}, Lfe/s;->j(Ljava/lang/Object;)I

    move-result v5

    if-ge v3, v5, :cond_3

    move-object v2, v4

    move v3, v5

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_0

    :goto_1
    if-nez v1, :cond_4

    invoke-virtual {p0}, Lfe/s;->f()Ljava/lang/Object;

    move-result-object v1

    :cond_4
    invoke-virtual {v0, v1}, LFg/a;->h(Ljava/lang/Object;)V

    return-void
.end method

.method private final h()LFg/a;
    .locals 2

    iget-object v0, p0, Lfe/s;->b:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LFg/a;

    return-object v0
.end method

.method private static final k(Lfe/s;)LFg/a;
    .locals 0

    invoke-virtual {p0}, Lfe/s;->f()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object p0

    return-object p0
.end method

.method private static final l(Lfe/s;)Lgg/i;
    .locals 2

    invoke-direct {p0}, Lfe/s;->h()LFg/a;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    new-instance v1, Lfe/s$a;

    invoke-direct {v1, p0}, Lfe/s$a;-><init>(Lfe/s;)V

    invoke-virtual {v0, v1}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p0

    invoke-virtual {p0}, Lgg/i;->e1()Lgg/i;

    move-result-object p0

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p0, v0}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object p0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p0

    invoke-virtual {p0}, Ljg/a;->i2()Lgg/i;

    move-result-object p0

    const-string v0, "refCount(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final n(Lfe/s;Ljava/lang/Object;Lgg/c;)V
    .locals 2

    const-string v0, "emitter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lfe/p;

    invoke-direct {v0, p0, p2}, Lfe/p;-><init>(Lfe/s;Lgg/c;)V

    invoke-interface {p2, v0}, Lgg/c;->d(Lkg/e;)V

    iget-object v0, p0, Lfe/s;->a:Ljava/util/HashMap;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lfe/s;->a:Ljava/util/HashMap;

    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v1, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lfe/s;->e()V

    sget-object p0, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method private static final o(Lfe/s;Lgg/c;)V
    .locals 2

    iget-object v0, p0, Lfe/s;->a:Ljava/util/HashMap;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lfe/s;->a:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lfe/s;->e()V

    sget-object p0, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method


# virtual methods
.method protected abstract f()Ljava/lang/Object;
.end method

.method public final g()Lgg/i;
    .locals 1

    iget-object v0, p0, Lfe/s;->c:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgg/i;

    return-object v0
.end method

.method protected abstract i()Ljava/lang/String;
.end method

.method public abstract j(Ljava/lang/Object;)I
.end method

.method public final m(Ljava/lang/Object;)Lgg/b;
    .locals 1

    const-string v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lfe/o;

    invoke-direct {v0, p0, p1}, Lfe/o;-><init>(Lfe/s;Ljava/lang/Object;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string v0, "create(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
