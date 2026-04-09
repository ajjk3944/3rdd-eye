.class final Lqg/v0$a;
.super Ljava/util/concurrent/atomic/AtomicLong;
.source "SourceFile"

# interfaces
.implements Lgg/l;
.implements LDj/c;
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/v0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:LDj/b;

.field final b:J

.field final c:Ljava/util/concurrent/TimeUnit;

.field final d:Lgg/y$c;

.field final e:Lkg/f;

.field f:LDj/c;

.field final g:Llg/e;

.field volatile h:Z

.field i:Z


# direct methods
.method constructor <init>(LDj/b;JLjava/util/concurrent/TimeUnit;Lgg/y$c;Lkg/f;)V
    .locals 1

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    new-instance v0, Llg/e;

    invoke-direct {v0}, Llg/e;-><init>()V

    iput-object v0, p0, Lqg/v0$a;->g:Llg/e;

    iput-object p1, p0, Lqg/v0$a;->a:LDj/b;

    iput-wide p2, p0, Lqg/v0$a;->b:J

    iput-object p4, p0, Lqg/v0$a;->c:Ljava/util/concurrent/TimeUnit;

    iput-object p5, p0, Lqg/v0$a;->d:Lgg/y$c;

    iput-object p6, p0, Lqg/v0$a;->e:Lkg/f;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-boolean v0, p0, Lqg/v0$a;->i:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg/v0$a;->i:Z

    iget-object v0, p0, Lqg/v0$a;->a:LDj/b;

    invoke-interface {v0}, LDj/b;->a()V

    iget-object v0, p0, Lqg/v0$a;->d:Lgg/y$c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    return-void
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, Lqg/v0$a;->f:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    iget-object v0, p0, Lqg/v0$a;->d:Lgg/y$c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 6

    iget-boolean v0, p0, Lqg/v0$a;->i:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, Lqg/v0$a;->h:Z

    const/4 v1, 0x1

    if-nez v0, :cond_3

    iput-boolean v1, p0, Lqg/v0$a;->h:Z

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-eqz v0, :cond_2

    iget-object v0, p0, Lqg/v0$a;->a:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->h(Ljava/lang/Object;)V

    const-wide/16 v0, 0x1

    invoke-static {p0, v0, v1}, Lzg/d;->d(Ljava/util/concurrent/atomic/AtomicLong;J)J

    iget-object p1, p0, Lqg/v0$a;->g:Llg/e;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lhg/c;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lhg/c;->dispose()V

    :cond_1
    iget-object p1, p0, Lqg/v0$a;->g:Llg/e;

    iget-object v0, p0, Lqg/v0$a;->d:Lgg/y$c;

    iget-wide v1, p0, Lqg/v0$a;->b:J

    iget-object v3, p0, Lqg/v0$a;->c:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, p0, v1, v2, v3}, Lgg/y$c;->c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lhg/c;

    move-result-object v0

    invoke-virtual {p1, v0}, Llg/e;->a(Lhg/c;)Z

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lqg/v0$a;->f:LDj/c;

    invoke-interface {p1}, LDj/c;->cancel()V

    iput-boolean v1, p0, Lqg/v0$a;->i:Z

    iget-object p1, p0, Lqg/v0$a;->a:LDj/b;

    invoke-static {}, Lio/reactivex/rxjava3/exceptions/MissingBackpressureException;->a()Lio/reactivex/rxjava3/exceptions/MissingBackpressureException;

    move-result-object v0

    invoke-interface {p1, v0}, LDj/b;->onError(Ljava/lang/Throwable;)V

    iget-object p1, p0, Lqg/v0$a;->d:Lgg/y$c;

    invoke-interface {p1}, Lhg/c;->dispose()V

    return-void

    :cond_3
    iget-object v0, p0, Lqg/v0$a;->e:Lkg/f;

    if-eqz v0, :cond_4

    :try_start_0
    invoke-interface {v0, p1}, Lkg/f;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lig/a;->b(Ljava/lang/Throwable;)V

    iget-object v0, p0, Lqg/v0$a;->f:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    iput-boolean v1, p0, Lqg/v0$a;->i:Z

    iget-object v0, p0, Lqg/v0$a;->a:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    iget-object p1, p0, Lqg/v0$a;->d:Lgg/y$c;

    invoke-interface {p1}, Lhg/c;->dispose()V

    :cond_4
    :goto_0
    return-void
.end method

.method public j(LDj/c;)V
    .locals 2

    iget-object v0, p0, Lqg/v0$a;->f:LDj/c;

    invoke-static {v0, p1}, Lyg/g;->validate(LDj/c;LDj/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lqg/v0$a;->f:LDj/c;

    iget-object v0, p0, Lqg/v0$a;->a:LDj/b;

    invoke-interface {v0, p0}, LDj/b;->j(LDj/c;)V

    const-wide v0, 0x7fffffffffffffffL

    invoke-interface {p1, v0, v1}, LDj/c;->request(J)V

    :cond_0
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-boolean v0, p0, Lqg/v0$a;->i:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg/v0$a;->i:Z

    iget-object v0, p0, Lqg/v0$a;->a:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    iget-object p1, p0, Lqg/v0$a;->d:Lgg/y$c;

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

.method public run()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lqg/v0$a;->h:Z

    return-void
.end method
