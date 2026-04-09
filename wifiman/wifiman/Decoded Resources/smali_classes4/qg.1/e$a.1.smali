.class final Lqg/e$a;
.super Lyg/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:LDj/b;

.field final b:Lkg/n;

.field final c:[Lqg/e$b;

.field final d:LDg/i;

.field final e:[Ljava/lang/Object;

.field final f:Z

.field g:Z

.field h:I

.field i:I

.field volatile j:Z

.field final k:Ljava/util/concurrent/atomic/AtomicLong;

.field volatile l:Z

.field final m:Lzg/c;


# direct methods
.method constructor <init>(LDj/b;Lkg/n;IIZ)V
    .locals 1

    invoke-direct {p0}, Lyg/a;-><init>()V

    iput-object p1, p0, Lqg/e$a;->a:LDj/b;

    iput-object p2, p0, Lqg/e$a;->b:Lkg/n;

    new-array p1, p3, [Lqg/e$b;

    const/4 p2, 0x0

    :goto_0
    if-ge p2, p3, :cond_0

    new-instance v0, Lqg/e$b;

    invoke-direct {v0, p0, p2, p4}, Lqg/e$b;-><init>(Lqg/e$a;II)V

    aput-object v0, p1, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    iput-object p1, p0, Lqg/e$a;->c:[Lqg/e$b;

    new-array p1, p3, [Ljava/lang/Object;

    iput-object p1, p0, Lqg/e$a;->e:[Ljava/lang/Object;

    new-instance p1, LDg/i;

    invoke-direct {p1, p4}, LDg/i;-><init>(I)V

    iput-object p1, p0, Lqg/e$a;->d:LDg/i;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p1, p0, Lqg/e$a;->k:Ljava/util/concurrent/atomic/AtomicLong;

    new-instance p1, Lzg/c;

    invoke-direct {p1}, Lzg/c;-><init>()V

    iput-object p1, p0, Lqg/e$a;->m:Lzg/c;

    iput-boolean p5, p0, Lqg/e$a;->f:Z

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg/e$a;->j:Z

    invoke-virtual {p0}, Lqg/e$a;->d()V

    invoke-virtual {p0}, Lqg/e$a;->l()V

    return-void
.end method

.method public clear()V
    .locals 1

    iget-object v0, p0, Lqg/e$a;->d:LDg/i;

    invoke-virtual {v0}, LDg/i;->clear()V

    return-void
.end method

.method d()V
    .locals 4

    iget-object v0, p0, Lqg/e$a;->c:[Lqg/e$b;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lqg/e$b;->c()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method g(ZZLDj/b;LDg/i;)Z
    .locals 2

    iget-boolean v0, p0, Lqg/e$a;->j:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lqg/e$a;->d()V

    invoke-virtual {p4}, LDg/i;->clear()V

    iget-object p1, p0, Lqg/e$a;->m:Lzg/c;

    invoke-virtual {p1}, Lzg/c;->h()V

    return v1

    :cond_0
    if-eqz p1, :cond_3

    iget-boolean p1, p0, Lqg/e$a;->f:Z

    if-eqz p1, :cond_1

    if-eqz p2, :cond_3

    invoke-virtual {p0}, Lqg/e$a;->d()V

    iget-object p1, p0, Lqg/e$a;->m:Lzg/c;

    invoke-virtual {p1, p3}, Lzg/c;->j(LDj/b;)V

    return v1

    :cond_1
    iget-object p1, p0, Lqg/e$a;->m:Lzg/c;

    invoke-static {p1}, Lzg/h;->e(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_2

    sget-object v0, Lzg/h;->a:Ljava/lang/Throwable;

    if-eq p1, v0, :cond_2

    invoke-virtual {p0}, Lqg/e$a;->d()V

    invoke-virtual {p4}, LDg/i;->clear()V

    invoke-interface {p3, p1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    return v1

    :cond_2
    if-eqz p2, :cond_3

    invoke-virtual {p0}, Lqg/e$a;->d()V

    invoke-interface {p3}, LDj/b;->a()V

    return v1

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, Lqg/e$a;->d:LDg/i;

    invoke-virtual {v0}, LDg/i;->isEmpty()Z

    move-result v0

    return v0
.end method

.method l()V
    .locals 1

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, Lqg/e$a;->g:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lqg/e$a;->o()V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lqg/e$a;->n()V

    :goto_0
    return-void
.end method

.method n()V
    .locals 14

    iget-object v0, p0, Lqg/e$a;->a:LDj/b;

    iget-object v1, p0, Lqg/e$a;->d:LDg/i;

    const/4 v2, 0x1

    move v3, v2

    :cond_0
    iget-object v4, p0, Lqg/e$a;->k:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    move-wide v8, v6

    :goto_0
    cmp-long v10, v8, v4

    if-eqz v10, :cond_4

    iget-boolean v11, p0, Lqg/e$a;->l:Z

    invoke-virtual {v1}, LDg/i;->poll()Ljava/lang/Object;

    move-result-object v12

    if-nez v12, :cond_1

    move v13, v2

    goto :goto_1

    :cond_1
    const/4 v13, 0x0

    :goto_1
    invoke-virtual {p0, v11, v13, v0, v1}, Lqg/e$a;->g(ZZLDj/b;LDg/i;)Z

    move-result v11

    if-eqz v11, :cond_2

    return-void

    :cond_2
    if-eqz v13, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v1}, LDg/i;->poll()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, [Ljava/lang/Object;

    :try_start_0
    iget-object v11, p0, Lqg/e$a;->b:Lkg/n;

    invoke-interface {v11, v10}, Lkg/n;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    const-string v11, "The combiner returned a null value"

    invoke-static {v10, v11}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0, v10}, LDj/b;->h(Ljava/lang/Object;)V

    check-cast v12, Lqg/e$b;

    invoke-virtual {v12}, Lqg/e$b;->d()V

    const-wide/16 v10, 0x1

    add-long/2addr v8, v10

    goto :goto_0

    :catchall_0
    move-exception v1

    invoke-static {v1}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lqg/e$a;->d()V

    iget-object v2, p0, Lqg/e$a;->m:Lzg/c;

    invoke-static {v2, v1}, Lzg/h;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Throwable;)Z

    iget-object v1, p0, Lqg/e$a;->m:Lzg/c;

    invoke-static {v1}, Lzg/h;->e(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Throwable;

    move-result-object v1

    invoke-interface {v0, v1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_4
    :goto_2
    if-nez v10, :cond_5

    iget-boolean v10, p0, Lqg/e$a;->l:Z

    invoke-virtual {v1}, LDg/i;->isEmpty()Z

    move-result v11

    invoke-virtual {p0, v10, v11, v0, v1}, Lqg/e$a;->g(ZZLDj/b;LDg/i;)Z

    move-result v10

    if-eqz v10, :cond_5

    return-void

    :cond_5
    cmp-long v6, v8, v6

    if-eqz v6, :cond_6

    const-wide v6, 0x7fffffffffffffffL

    cmp-long v4, v4, v6

    if-eqz v4, :cond_6

    iget-object v4, p0, Lqg/e$a;->k:Ljava/util/concurrent/atomic/AtomicLong;

    neg-long v5, v8

    invoke-virtual {v4, v5, v6}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    :cond_6
    neg-int v3, v3

    invoke-virtual {p0, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v3

    if-nez v3, :cond_0

    return-void
.end method

.method o()V
    .locals 6

    iget-object v0, p0, Lqg/e$a;->a:LDj/b;

    iget-object v1, p0, Lqg/e$a;->d:LDg/i;

    const/4 v2, 0x1

    :cond_0
    iget-boolean v3, p0, Lqg/e$a;->j:Z

    if-eqz v3, :cond_1

    invoke-virtual {v1}, LDg/i;->clear()V

    return-void

    :cond_1
    iget-object v3, p0, Lqg/e$a;->m:Lzg/c;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Throwable;

    if-eqz v3, :cond_2

    invoke-virtual {v1}, LDg/i;->clear()V

    invoke-interface {v0, v3}, LDj/b;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_2
    iget-boolean v3, p0, Lqg/e$a;->l:Z

    invoke-virtual {v1}, LDg/i;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_3

    const/4 v5, 0x0

    invoke-interface {v0, v5}, LDj/b;->h(Ljava/lang/Object;)V

    :cond_3
    if-eqz v3, :cond_4

    if-eqz v4, :cond_4

    invoke-interface {v0}, LDj/b;->a()V

    return-void

    :cond_4
    neg-int v2, v2

    invoke-virtual {p0, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v2

    if-nez v2, :cond_0

    return-void
.end method

.method p(I)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lqg/e$a;->e:[Ljava/lang/Object;

    aget-object p1, v0, p1

    const/4 v1, 0x1

    if-eqz p1, :cond_1

    iget p1, p0, Lqg/e$a;->i:I

    add-int/2addr p1, v1

    array-length v0, v0

    if-ne p1, v0, :cond_0

    iput-boolean v1, p0, Lqg/e$a;->l:Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    iput p1, p0, Lqg/e$a;->i:I

    monitor-exit p0

    return-void

    :cond_1
    iput-boolean v1, p0, Lqg/e$a;->l:Z

    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lqg/e$a;->l()V

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public poll()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lqg/e$a;->d:LDg/i;

    invoke-virtual {v0}, LDg/i;->poll()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v1, p0, Lqg/e$a;->d:LDg/i;

    invoke-virtual {v1}, LDg/i;->poll()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/Object;

    iget-object v2, p0, Lqg/e$a;->b:Lkg/n;

    invoke-interface {v2, v1}, Lkg/n;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "The combiner returned a null value"

    invoke-static {v1, v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v0, Lqg/e$b;

    invoke-virtual {v0}, Lqg/e$b;->d()V

    return-object v1
.end method

.method r(ILjava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lqg/e$a;->m:Lzg/c;

    invoke-static {v0, p2}, Lzg/h;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean p2, p0, Lqg/e$a;->f:Z

    if-nez p2, :cond_0

    invoke-virtual {p0}, Lqg/e$a;->d()V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lqg/e$a;->l:Z

    invoke-virtual {p0}, Lqg/e$a;->l()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lqg/e$a;->p(I)V

    goto :goto_0

    :cond_1
    invoke-static {p2}, LEg/a;->v(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public request(J)V
    .locals 1

    invoke-static {p1, p2}, Lyg/g;->validate(J)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqg/e$a;->k:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v0, p1, p2}, Lzg/d;->a(Ljava/util/concurrent/atomic/AtomicLong;J)J

    invoke-virtual {p0}, Lqg/e$a;->l()V

    :cond_0
    return-void
.end method

.method public requestFusion(I)I
    .locals 2

    and-int/lit8 v0, p1, 0x4

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    and-int/lit8 p1, p1, 0x2

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    iput-boolean v1, p0, Lqg/e$a;->g:Z

    return p1
.end method

.method s(ILjava/lang/Object;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lqg/e$a;->e:[Ljava/lang/Object;

    iget v1, p0, Lqg/e$a;->h:I

    aget-object v2, v0, p1

    if-nez v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lqg/e$a;->h:I

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_0
    :goto_0
    aput-object p2, v0, p1

    array-length p2, v0

    if-ne p2, v1, :cond_1

    iget-object p2, p0, Lqg/e$a;->d:LDg/i;

    iget-object v1, p0, Lqg/e$a;->c:[Lqg/e$b;

    aget-object v1, v1, p1

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p2, v1, v0}, LDg/i;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    const/4 p2, 0x0

    goto :goto_1

    :cond_1
    const/4 p2, 0x1

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p2, :cond_2

    iget-object p2, p0, Lqg/e$a;->c:[Lqg/e$b;

    aget-object p1, p2, p1

    invoke-virtual {p1}, Lqg/e$b;->d()V

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Lqg/e$a;->l()V

    :goto_2
    return-void

    :goto_3
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method t([LDj/a;I)V
    .locals 4

    iget-object v0, p0, Lqg/e$a;->c:[Lqg/e$b;

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_1

    iget-boolean v2, p0, Lqg/e$a;->l:Z

    if-nez v2, :cond_1

    iget-boolean v2, p0, Lqg/e$a;->j:Z

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    aget-object v2, p1, v1

    aget-object v3, v0, v1

    invoke-interface {v2, v3}, LDj/a;->b(LDj/b;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method
