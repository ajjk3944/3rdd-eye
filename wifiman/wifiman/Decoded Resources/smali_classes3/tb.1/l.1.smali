.class public final Ltb/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:I

.field private final b:Lmh/a;

.field private final c:Ljava/util/List;

.field private final d:Ljava/util/concurrent/ArrayBlockingQueue;


# direct methods
.method public constructor <init>(ILmh/a;)V
    .locals 1

    const-string/jumbo v0, "requesterFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ltb/l;->a:I

    iput-object p2, p0, Ltb/l;->b:Lmh/a;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Ltb/l;->c:Ljava/util/List;

    new-instance p2, Ljava/util/concurrent/ArrayBlockingQueue;

    invoke-direct {p2, p1}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(I)V

    iput-object p2, p0, Ltb/l;->d:Ljava/util/concurrent/ArrayBlockingQueue;

    return-void
.end method

.method public static synthetic a(Ltb/q;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Ltb/l;->i(Ltb/q;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ltb/q;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Ltb/l;->h(Ltb/q;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method private final c()Ltb/q;
    .locals 6

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Ltb/l;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Ltb/l;->a:I

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Ltb/l;->b:Lmh/a;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ltb/q;

    sget-object v2, LSj/a;->a:LSj/a$b;

    invoke-virtual {v1}, Ltb/q;->d()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v5, "createRequester: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v2, v3, v4}, LSj/a$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v2, p0, Ltb/l;->c:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-direct {p0}, Ltb/l;->g()V

    check-cast v0, Ltb/q;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    :try_start_1
    sget-object v0, LYg/J;->a:LYg/J;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    :goto_0
    monitor-exit p0

    throw v0
.end method

.method private final g()V
    .locals 12

    sget-object v0, LSj/a;->a:LSj/a$b;

    iget-object v1, p0, Ltb/l;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Ltb/l;->c:Ljava/util/List;

    move-object v3, v2

    check-cast v3, Ljava/lang/Iterable;

    new-instance v9, Ltb/j;

    invoke-direct {v9}, Ltb/j;-><init>()V

    const/16 v10, 0x1f

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v3 .. v11}, LZg/v;->z0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v1, v2}, [Ljava/lang/Object;

    move-result-object v1

    const-string/jumbo v2, "requestersPool: %s %s"

    invoke-virtual {v0, v2, v1}, LSj/a$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v3, p0, Ltb/l;->d:Ljava/util/concurrent/ArrayBlockingQueue;

    new-instance v9, Ltb/k;

    invoke-direct {v9}, Ltb/k;-><init>()V

    invoke-static/range {v3 .. v11}, LZg/v;->z0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string/jumbo v2, "requestersFree: %s"

    invoke-virtual {v0, v2, v1}, LSj/a$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private static final h(Ltb/q;)Ljava/lang/CharSequence;
    .locals 2

    const-string/jumbo v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ltb/q;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ltb/q;->f()Ljava/lang/String;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "("

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final i(Ltb/q;)Ljava/lang/CharSequence;
    .locals 0

    invoke-virtual {p0}, Ltb/q;->d()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final d(Ltb/q;)V
    .locals 3

    const-string/jumbo v0, "requester"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LSj/a;->a:LSj/a$b;

    const-string/jumbo v1, "disposeRequester: %s"

    invoke-virtual {p1}, Ltb/q;->d()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LSj/a$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Ltb/l;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Ltb/l;->d:Ljava/util/concurrent/ArrayBlockingQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ArrayBlockingQueue;->remove(Ljava/lang/Object;)Z

    invoke-direct {p0}, Ltb/l;->g()V

    sget-object p1, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final e()Ltb/q;
    .locals 4

    iget-object v0, p0, Ltb/l;->d:Ljava/util/concurrent/ArrayBlockingQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ArrayBlockingQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltb/q;

    if-nez v0, :cond_0

    invoke-direct {p0}, Ltb/l;->c()Ltb/q;

    move-result-object v0

    :cond_0
    if-nez v0, :cond_1

    iget-object v0, p0, Ltb/l;->d:Ljava/util/concurrent/ArrayBlockingQueue;

    const-wide/16 v1, 0xa

    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/concurrent/ArrayBlockingQueue;->poll(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltb/q;

    :cond_1
    return-object v0
.end method

.method public final f(Ltb/q;)V
    .locals 2

    const-string/jumbo v0, "requester"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ltb/q;->o(Ljava/lang/String;)V

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p1, v0}, Ltb/q;->n(Z)V

    iget-object v0, p0, Ltb/l;->d:Ljava/util/concurrent/ArrayBlockingQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ArrayBlockingQueue;->add(Ljava/lang/Object;)Z

    sget-object v0, LSj/a;->a:LSj/a$b;

    const-string/jumbo v1, "pushFreeRequester: %s"

    invoke-virtual {p1}, Ltb/q;->d()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, LSj/a$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-direct {p0}, Ltb/l;->g()V

    sget-object p1, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
