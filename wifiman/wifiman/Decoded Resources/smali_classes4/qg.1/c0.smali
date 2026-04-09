.class public final Lqg/c0;
.super Lgg/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/c0$b;,
        Lqg/c0$a;
    }
.end annotation


# instance fields
.field final b:Ljg/a;

.field final c:I

.field final d:J

.field final e:Ljava/util/concurrent/TimeUnit;

.field final f:Lgg/y;

.field g:Lqg/c0$a;


# direct methods
.method public constructor <init>(Ljg/a;)V
    .locals 7

    .line 1
    sget-object v5, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    const/4 v6, 0x0

    const/4 v2, 0x1

    const-wide/16 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v6}, Lqg/c0;-><init>(Ljg/a;IJLjava/util/concurrent/TimeUnit;Lgg/y;)V

    return-void
.end method

.method public constructor <init>(Ljg/a;IJLjava/util/concurrent/TimeUnit;Lgg/y;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lgg/i;-><init>()V

    .line 3
    iput-object p1, p0, Lqg/c0;->b:Ljg/a;

    .line 4
    iput p2, p0, Lqg/c0;->c:I

    .line 5
    iput-wide p3, p0, Lqg/c0;->d:J

    .line 6
    iput-object p5, p0, Lqg/c0;->e:Ljava/util/concurrent/TimeUnit;

    .line 7
    iput-object p6, p0, Lqg/c0;->f:Lgg/y;

    return-void
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lqg/c0;->g:Lqg/c0$a;

    if-nez v0, :cond_0

    new-instance v0, Lqg/c0$a;

    invoke-direct {v0, p0}, Lqg/c0$a;-><init>(Lqg/c0;)V

    iput-object v0, p0, Lqg/c0;->g:Lqg/c0$a;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    iget-wide v1, v0, Lqg/c0$a;->c:J

    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    if-nez v3, :cond_1

    iget-object v3, v0, Lqg/c0$a;->b:Lhg/c;

    if-eqz v3, :cond_1

    invoke-interface {v3}, Lhg/c;->dispose()V

    :cond_1
    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, v0, Lqg/c0$a;->c:J

    iget-boolean v3, v0, Lqg/c0$a;->d:Z

    if-nez v3, :cond_2

    iget v3, p0, Lqg/c0;->c:I

    int-to-long v3, v3

    cmp-long v1, v1, v3

    if-nez v1, :cond_2

    const/4 v1, 0x1

    iput-boolean v1, v0, Lqg/c0$a;->d:Z

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v2, p0, Lqg/c0;->b:Ljg/a;

    new-instance v3, Lqg/c0$b;

    invoke-direct {v3, p1, p0, v0}, Lqg/c0$b;-><init>(LDj/b;Lqg/c0;Lqg/c0$a;)V

    invoke-virtual {v2, v3}, Lgg/i;->D1(Lgg/l;)V

    if-eqz v1, :cond_3

    iget-object p1, p0, Lqg/c0;->b:Ljg/a;

    invoke-virtual {p1, v0}, Ljg/a;->h2(Lkg/f;)V

    :cond_3
    return-void

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method h2(Lqg/c0$a;)V
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lqg/c0;->g:Lqg/c0$a;

    if-eqz v0, :cond_4

    if-eq v0, p1, :cond_0

    goto :goto_1

    :cond_0
    iget-wide v0, p1, Lqg/c0$a;->c:J

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    iput-wide v0, p1, Lqg/c0$a;->c:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_3

    iget-boolean v0, p1, Lqg/c0$a;->d:Z

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    iget-wide v0, p0, Lqg/c0;->d:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    invoke-virtual {p0, p1}, Lqg/c0;->j2(Lqg/c0$a;)V

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    new-instance v0, Llg/e;

    invoke-direct {v0}, Llg/e;-><init>()V

    iput-object v0, p1, Lqg/c0$a;->b:Lhg/c;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Lqg/c0;->f:Lgg/y;

    iget-wide v2, p0, Lqg/c0;->d:J

    iget-object v4, p0, Lqg/c0;->e:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, p1, v2, v3, v4}, Lgg/y;->f(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lhg/c;

    move-result-object p1

    invoke-virtual {v0, p1}, Llg/e;->a(Lhg/c;)Z

    return-void

    :cond_3
    :goto_0
    :try_start_1
    monitor-exit p0

    return-void

    :cond_4
    :goto_1
    monitor-exit p0

    return-void

    :goto_2
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method i2(Lqg/c0$a;)V
    .locals 6

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lqg/c0;->g:Lqg/c0$a;

    if-ne v0, p1, :cond_1

    iget-object v0, p1, Lqg/c0$a;->b:Lhg/c;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lhg/c;->dispose()V

    iput-object v1, p1, Lqg/c0$a;->b:Lhg/c;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-wide v2, p1, Lqg/c0$a;->c:J

    const-wide/16 v4, 0x1

    sub-long/2addr v2, v4

    iput-wide v2, p1, Lqg/c0$a;->c:J

    const-wide/16 v4, 0x0

    cmp-long p1, v2, v4

    if-nez p1, :cond_1

    iput-object v1, p0, Lqg/c0;->g:Lqg/c0$a;

    iget-object p1, p0, Lqg/c0;->b:Ljg/a;

    invoke-virtual {p1}, Ljg/a;->l2()V

    :cond_1
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method j2(Lqg/c0$a;)V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-wide v0, p1, Lqg/c0$a;->c:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    iget-object v0, p0, Lqg/c0;->g:Lqg/c0$a;

    if-ne p1, v0, :cond_1

    const/4 v0, 0x0

    iput-object v0, p0, Lqg/c0;->g:Lqg/c0$a;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhg/c;

    invoke-static {p1}, Llg/b;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p1, Lqg/c0$a;->e:Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    iget-object p1, p0, Lqg/c0;->b:Ljg/a;

    invoke-virtual {p1}, Ljg/a;->l2()V

    :cond_1
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
