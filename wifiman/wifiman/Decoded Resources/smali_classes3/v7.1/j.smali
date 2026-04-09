.class public final Lv7/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv7/e;


# instance fields
.field private final a:Lgg/y;

.field private final b:Ljava/util/List;

.field private final c:LFg/c;


# direct methods
.method public constructor <init>(Lgg/y;)V
    .locals 1

    const-string/jumbo v0, "expirationScheduler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/j;->a:Lgg/y;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lv7/j;->b:Ljava/util/List;

    invoke-static {}, LFg/c;->j2()LFg/c;

    move-result-object p1

    const-string/jumbo v0, "create<Unit>()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lv7/j;->c:LFg/c;

    return-void
.end method

.method public static synthetic d(Lv7/j;)V
    .locals 0

    invoke-static {p0}, Lv7/j;->g(Lv7/j;)V

    return-void
.end method

.method public static final synthetic e(Lv7/j;)J
    .locals 2

    invoke-direct {p0}, Lv7/j;->f()J

    move-result-wide v0

    return-wide v0
.end method

.method private final f()J
    .locals 2

    iget-object v0, p0, Lv7/j;->a:Lgg/y;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1}, Lgg/y;->d(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    return-wide v0
.end method

.method private static final g(Lv7/j;)V
    .locals 1

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lv7/j;->c:LFg/c;

    sget-object v0, LYg/J;->a:LYg/J;

    invoke-virtual {p0, v0}, LFg/c;->k2(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 4

    iget-object v0, p0, Lv7/j;->b:Ljava/util/List;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lv7/j;->b:Ljava/util/List;

    new-instance v2, Lv7/j$a;

    invoke-direct {v2, p0}, Lv7/j$a;-><init>(Lv7/j;)V

    invoke-static {v1, v2}, LZg/v;->K(Ljava/util/List;Lmh/l;)Z

    iget-object v1, p0, Lv7/j;->b:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lv7/f;

    invoke-virtual {v3}, Lv7/f;->b()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    monitor-exit v0

    return-object v2

    :goto_1
    monitor-exit v0

    throw v1
.end method

.method public b(JLjava/lang/Object;)V
    .locals 5

    iget-object v0, p0, Lv7/j;->b:Ljava/util/List;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lv7/j;->b:Ljava/util/List;

    new-instance v2, Lv7/f;

    invoke-direct {p0}, Lv7/j;->f()J

    move-result-wide v3

    add-long/2addr v3, p1

    invoke-direct {v2, v3, v4, p3}, Lv7/f;-><init>(JLjava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    iget-object p3, p0, Lv7/j;->a:Lgg/y;

    new-instance v0, Lv7/i;

    invoke-direct {v0, p0}, Lv7/i;-><init>(Lv7/j;)V

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p3, v0, p1, p2, v1}, Lgg/y;->f(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lhg/c;

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public c()Lgg/i;
    .locals 1

    iget-object v0, p0, Lv7/j;->c:LFg/c;

    return-object v0
.end method
