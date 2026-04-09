.class abstract Lqg/T$a;
.super Lyg/a;
.source "SourceFile"

# interfaces
.implements Lgg/l;
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/T;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "a"
.end annotation


# instance fields
.field final a:Lgg/y$c;

.field final b:Z

.field final c:I

.field final d:I

.field final e:Ljava/util/concurrent/atomic/AtomicLong;

.field f:LDj/c;

.field g:LDg/g;

.field volatile h:Z

.field volatile i:Z

.field j:Ljava/lang/Throwable;

.field k:I

.field l:J

.field m:Z


# direct methods
.method constructor <init>(Lgg/y$c;ZI)V
    .locals 0

    invoke-direct {p0}, Lyg/a;-><init>()V

    iput-object p1, p0, Lqg/T$a;->a:Lgg/y$c;

    iput-boolean p2, p0, Lqg/T$a;->b:Z

    iput p3, p0, Lqg/T$a;->c:I

    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p1, p0, Lqg/T$a;->e:Ljava/util/concurrent/atomic/AtomicLong;

    shr-int/lit8 p1, p3, 0x2

    sub-int/2addr p3, p1

    iput p3, p0, Lqg/T$a;->d:I

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-boolean v0, p0, Lqg/T$a;->i:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg/T$a;->i:Z

    invoke-virtual {p0}, Lqg/T$a;->o()V

    :cond_0
    return-void
.end method

.method public final cancel()V
    .locals 1

    iget-boolean v0, p0, Lqg/T$a;->h:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg/T$a;->h:Z

    iget-object v0, p0, Lqg/T$a;->f:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    iget-object v0, p0, Lqg/T$a;->a:Lgg/y$c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    iget-boolean v0, p0, Lqg/T$a;->m:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lqg/T$a;->g:LDg/g;

    invoke-interface {v0}, LDg/g;->clear()V

    :cond_1
    return-void
.end method

.method public final clear()V
    .locals 1

    iget-object v0, p0, Lqg/T$a;->g:LDg/g;

    invoke-interface {v0}, LDg/g;->clear()V

    return-void
.end method

.method final d(ZZLDj/b;)Z
    .locals 2

    iget-boolean v0, p0, Lqg/T$a;->h:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lqg/T$a;->clear()V

    return v1

    :cond_0
    if-eqz p1, :cond_4

    iget-boolean p1, p0, Lqg/T$a;->b:Z

    if-eqz p1, :cond_2

    if-eqz p2, :cond_4

    iput-boolean v1, p0, Lqg/T$a;->h:Z

    iget-object p1, p0, Lqg/T$a;->j:Ljava/lang/Throwable;

    if-eqz p1, :cond_1

    invoke-interface {p3, p1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    invoke-interface {p3}, LDj/b;->a()V

    :goto_0
    iget-object p1, p0, Lqg/T$a;->a:Lgg/y$c;

    invoke-interface {p1}, Lhg/c;->dispose()V

    return v1

    :cond_2
    iget-object p1, p0, Lqg/T$a;->j:Ljava/lang/Throwable;

    if-eqz p1, :cond_3

    iput-boolean v1, p0, Lqg/T$a;->h:Z

    invoke-virtual {p0}, Lqg/T$a;->clear()V

    invoke-interface {p3, p1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    iget-object p1, p0, Lqg/T$a;->a:Lgg/y$c;

    invoke-interface {p1}, Lhg/c;->dispose()V

    return v1

    :cond_3
    if-eqz p2, :cond_4

    iput-boolean v1, p0, Lqg/T$a;->h:Z

    invoke-interface {p3}, LDj/b;->a()V

    iget-object p1, p0, Lqg/T$a;->a:Lgg/y$c;

    invoke-interface {p1}, Lhg/c;->dispose()V

    return v1

    :cond_4
    const/4 p1, 0x0

    return p1
.end method

.method abstract g()V
.end method

.method public final h(Ljava/lang/Object;)V
    .locals 2

    iget-boolean v0, p0, Lqg/T$a;->i:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Lqg/T$a;->k:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lqg/T$a;->o()V

    return-void

    :cond_1
    iget-object v0, p0, Lqg/T$a;->g:LDg/g;

    invoke-interface {v0, p1}, LDg/g;->offer(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lqg/T$a;->f:LDj/c;

    invoke-interface {p1}, LDj/c;->cancel()V

    new-instance p1, Lio/reactivex/rxjava3/exceptions/QueueOverflowException;

    invoke-direct {p1}, Lio/reactivex/rxjava3/exceptions/QueueOverflowException;-><init>()V

    iput-object p1, p0, Lqg/T$a;->j:Ljava/lang/Throwable;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lqg/T$a;->i:Z

    :cond_2
    invoke-virtual {p0}, Lqg/T$a;->o()V

    return-void
.end method

.method public final isEmpty()Z
    .locals 1

    iget-object v0, p0, Lqg/T$a;->g:LDg/g;

    invoke-interface {v0}, LDg/g;->isEmpty()Z

    move-result v0

    return v0
.end method

.method abstract l()V
.end method

.method abstract n()V
.end method

.method final o()V
    .locals 1

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lqg/T$a;->a:Lgg/y$c;

    invoke-virtual {v0, p0}, Lgg/y$c;->b(Ljava/lang/Runnable;)Lhg/c;

    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-boolean v0, p0, Lqg/T$a;->i:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iput-object p1, p0, Lqg/T$a;->j:Ljava/lang/Throwable;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lqg/T$a;->i:Z

    invoke-virtual {p0}, Lqg/T$a;->o()V

    return-void
.end method

.method public final request(J)V
    .locals 1

    invoke-static {p1, p2}, Lyg/g;->validate(J)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqg/T$a;->e:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v0, p1, p2}, Lzg/d;->a(Ljava/util/concurrent/atomic/AtomicLong;J)J

    invoke-virtual {p0}, Lqg/T$a;->o()V

    :cond_0
    return-void
.end method

.method public final requestFusion(I)I
    .locals 1

    const/4 v0, 0x2

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lqg/T$a;->m:Z

    return v0

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final run()V
    .locals 2

    iget-boolean v0, p0, Lqg/T$a;->m:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lqg/T$a;->l()V

    goto :goto_0

    :cond_0
    iget v0, p0, Lqg/T$a;->k:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lqg/T$a;->n()V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lqg/T$a;->g()V

    :goto_0
    return-void
.end method
