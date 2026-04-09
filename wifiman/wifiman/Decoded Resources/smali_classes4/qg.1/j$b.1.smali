.class final Lqg/j$b;
.super Ljava/util/concurrent/atomic/AtomicLong;
.source "SourceFile"

# interfaces
.implements Lgg/l;
.implements LDj/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field final a:LDj/b;

.field final b:J

.field final c:Ljava/util/concurrent/TimeUnit;

.field final d:Lgg/y$c;

.field final e:Lkg/f;

.field f:LDj/c;

.field g:Lqg/j$a;

.field volatile h:J

.field i:Z


# direct methods
.method constructor <init>(LDj/b;JLjava/util/concurrent/TimeUnit;Lgg/y$c;Lkg/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p1, p0, Lqg/j$b;->a:LDj/b;

    iput-wide p2, p0, Lqg/j$b;->b:J

    iput-object p4, p0, Lqg/j$b;->c:Ljava/util/concurrent/TimeUnit;

    iput-object p5, p0, Lqg/j$b;->d:Lgg/y$c;

    iput-object p6, p0, Lqg/j$b;->e:Lkg/f;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-boolean v0, p0, Lqg/j$b;->i:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg/j$b;->i:Z

    iget-object v0, p0, Lqg/j$b;->g:Lqg/j$a;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lqg/j$a;->dispose()V

    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lqg/j$a;->a()V

    :cond_2
    iget-object v0, p0, Lqg/j$b;->a:LDj/b;

    invoke-interface {v0}, LDj/b;->a()V

    iget-object v0, p0, Lqg/j$b;->d:Lgg/y$c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    return-void
.end method

.method c(JLjava/lang/Object;Lqg/j$a;)V
    .locals 2

    iget-wide v0, p0, Lqg/j$b;->h:J

    cmp-long p1, p1, v0

    if-nez p1, :cond_1

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lqg/j$b;->a:LDj/b;

    invoke-interface {p1, p3}, LDj/b;->h(Ljava/lang/Object;)V

    const-wide/16 p1, 0x1

    invoke-static {p0, p1, p2}, Lzg/d;->d(Ljava/util/concurrent/atomic/AtomicLong;J)J

    invoke-virtual {p4}, Lqg/j$a;->dispose()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lqg/j$b;->cancel()V

    iget-object p1, p0, Lqg/j$b;->a:LDj/b;

    invoke-static {}, Lio/reactivex/rxjava3/exceptions/MissingBackpressureException;->a()Lio/reactivex/rxjava3/exceptions/MissingBackpressureException;

    move-result-object p2

    invoke-interface {p1, p2}, LDj/b;->onError(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, Lqg/j$b;->f:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    iget-object v0, p0, Lqg/j$b;->d:Lgg/y$c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 4

    iget-boolean v0, p0, Lqg/j$b;->i:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-wide v0, p0, Lqg/j$b;->h:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lqg/j$b;->h:J

    iget-object v2, p0, Lqg/j$b;->g:Lqg/j$a;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lqg/j$a;->dispose()V

    :cond_1
    iget-object v3, p0, Lqg/j$b;->e:Lkg/f;

    if-eqz v3, :cond_2

    if-eqz v2, :cond_2

    :try_start_0
    iget-object v2, v2, Lqg/j$a;->a:Ljava/lang/Object;

    invoke-interface {v3, v2}, Lkg/f;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    invoke-static {v2}, Lig/a;->b(Ljava/lang/Throwable;)V

    iget-object v3, p0, Lqg/j$b;->f:LDj/c;

    invoke-interface {v3}, LDj/c;->cancel()V

    const/4 v3, 0x1

    iput-boolean v3, p0, Lqg/j$b;->i:Z

    iget-object v3, p0, Lqg/j$b;->a:LDj/b;

    invoke-interface {v3, v2}, LDj/b;->onError(Ljava/lang/Throwable;)V

    iget-object v2, p0, Lqg/j$b;->d:Lgg/y$c;

    invoke-interface {v2}, Lhg/c;->dispose()V

    :cond_2
    :goto_0
    new-instance v2, Lqg/j$a;

    invoke-direct {v2, p1, v0, v1, p0}, Lqg/j$a;-><init>(Ljava/lang/Object;JLqg/j$b;)V

    iput-object v2, p0, Lqg/j$b;->g:Lqg/j$a;

    iget-object p1, p0, Lqg/j$b;->d:Lgg/y$c;

    iget-wide v0, p0, Lqg/j$b;->b:J

    iget-object v3, p0, Lqg/j$b;->c:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v2, v0, v1, v3}, Lgg/y$c;->c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lhg/c;

    move-result-object p1

    invoke-virtual {v2, p1}, Lqg/j$a;->c(Lhg/c;)V

    return-void
.end method

.method public j(LDj/c;)V
    .locals 2

    iget-object v0, p0, Lqg/j$b;->f:LDj/c;

    invoke-static {v0, p1}, Lyg/g;->validate(LDj/c;LDj/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lqg/j$b;->f:LDj/c;

    iget-object v0, p0, Lqg/j$b;->a:LDj/b;

    invoke-interface {v0, p0}, LDj/b;->j(LDj/c;)V

    const-wide v0, 0x7fffffffffffffffL

    invoke-interface {p1, v0, v1}, LDj/c;->request(J)V

    :cond_0
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-boolean v0, p0, Lqg/j$b;->i:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg/j$b;->i:Z

    iget-object v0, p0, Lqg/j$b;->g:Lqg/j$a;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lhg/c;->dispose()V

    :cond_1
    iget-object v0, p0, Lqg/j$b;->a:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    iget-object p1, p0, Lqg/j$b;->d:Lgg/y$c;

    invoke-interface {p1}, Lhg/c;->dispose()V

    return-void
.end method

.method public request(J)V
    .locals 1

    invoke-static {p1, p2}, Lyg/g;->validate(J)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0, p1, p2}, Lzg/d;->a(Ljava/util/concurrent/atomic/AtomicLong;J)J

    :cond_0
    return-void
.end method
