.class final Lqg/g$d;
.super Lqg/g$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "d"
.end annotation


# instance fields
.field final m:LDj/b;

.field final n:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method constructor <init>(LDj/b;Lkg/n;I)V
    .locals 0

    invoke-direct {p0, p2, p3}, Lqg/g$b;-><init>(Lkg/n;I)V

    iput-object p1, p0, Lqg/g$d;->m:LDj/b;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Lqg/g$d;->n:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lqg/g$d;->m:LDj/b;

    iget-object v1, p0, Lqg/g$b;->j:Lzg/c;

    invoke-static {v0, p1, p0, v1}, Lzg/i;->f(LDj/b;Ljava/lang/Object;Ljava/util/concurrent/atomic/AtomicInteger;Lzg/c;)Z

    return-void
.end method

.method public cancel()V
    .locals 1

    iget-boolean v0, p0, Lqg/g$b;->i:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg/g$b;->i:Z

    iget-object v0, p0, Lqg/g$b;->a:Lqg/g$e;

    invoke-virtual {v0}, Lyg/f;->cancel()V

    iget-object v0, p0, Lqg/g$b;->e:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    iget-object v0, p0, Lqg/g$b;->j:Lzg/c;

    invoke-virtual {v0}, Lzg/c;->h()V

    :cond_0
    return-void
.end method

.method public g(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lqg/g$b;->e:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    iget-object v0, p0, Lqg/g$d;->m:LDj/b;

    iget-object v1, p0, Lqg/g$b;->j:Lzg/c;

    invoke-static {v0, p1, p0, v1}, Lzg/i;->c(LDj/b;Ljava/lang/Throwable;Ljava/util/concurrent/atomic/AtomicInteger;Lzg/c;)V

    return-void
.end method

.method l()V
    .locals 6

    iget-object v0, p0, Lqg/g$d;->n:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_a

    :cond_0
    :goto_0
    iget-boolean v0, p0, Lqg/g$b;->i:Z

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-boolean v0, p0, Lqg/g$b;->k:Z

    if-nez v0, :cond_9

    iget-boolean v0, p0, Lqg/g$b;->h:Z

    :try_start_0
    iget-object v1, p0, Lqg/g$b;->g:LDg/g;

    invoke-interface {v1}, LDg/g;->poll()Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_2

    move v4, v3

    goto :goto_1

    :cond_2
    move v4, v2

    :goto_1
    if-eqz v0, :cond_3

    if-eqz v4, :cond_3

    iget-object v0, p0, Lqg/g$d;->m:LDj/b;

    invoke-interface {v0}, LDj/b;->a()V

    return-void

    :cond_3
    if-nez v4, :cond_9

    :try_start_1
    iget-object v0, p0, Lqg/g$b;->b:Lkg/n;

    invoke-interface {v0, v1}, Lkg/n;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "The mapper returned a null Publisher"

    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v0, LDj/a;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    iget v1, p0, Lqg/g$b;->l:I

    if-eq v1, v3, :cond_5

    iget v1, p0, Lqg/g$b;->f:I

    add-int/2addr v1, v3

    iget v4, p0, Lqg/g$b;->d:I

    if-ne v1, v4, :cond_4

    iput v2, p0, Lqg/g$b;->f:I

    iget-object v2, p0, Lqg/g$b;->e:LDj/c;

    int-to-long v4, v1

    invoke-interface {v2, v4, v5}, LDj/c;->request(J)V

    goto :goto_2

    :cond_4
    iput v1, p0, Lqg/g$b;->f:I

    :cond_5
    :goto_2
    instance-of v1, v0, Lkg/q;

    if-eqz v1, :cond_8

    check-cast v0, Lkg/q;

    :try_start_2
    invoke-interface {v0}, Lkg/q;->get()Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v0, :cond_6

    goto :goto_0

    :cond_6
    iget-object v1, p0, Lqg/g$b;->a:Lqg/g$e;

    invoke-virtual {v1}, Lyg/f;->o()Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, p0, Lqg/g$d;->m:LDj/b;

    iget-object v2, p0, Lqg/g$b;->j:Lzg/c;

    invoke-static {v1, v0, p0, v2}, Lzg/i;->f(LDj/b;Ljava/lang/Object;Ljava/util/concurrent/atomic/AtomicInteger;Lzg/c;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_7
    iput-boolean v3, p0, Lqg/g$b;->k:Z

    iget-object v1, p0, Lqg/g$b;->a:Lqg/g$e;

    new-instance v2, Lqg/g$g;

    iget-object v3, p0, Lqg/g$b;->a:Lqg/g$e;

    invoke-direct {v2, v0, v3}, Lqg/g$g;-><init>(Ljava/lang/Object;LDj/b;)V

    invoke-virtual {v1, v2}, Lyg/f;->r(LDj/c;)V

    goto :goto_3

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    iget-object v1, p0, Lqg/g$b;->e:LDj/c;

    invoke-interface {v1}, LDj/c;->cancel()V

    iget-object v1, p0, Lqg/g$b;->j:Lzg/c;

    invoke-virtual {v1, v0}, Lzg/c;->g(Ljava/lang/Throwable;)Z

    iget-object v0, p0, Lqg/g$b;->j:Lzg/c;

    iget-object v1, p0, Lqg/g$d;->m:LDj/b;

    invoke-virtual {v0, v1}, Lzg/c;->j(LDj/b;)V

    return-void

    :cond_8
    iput-boolean v3, p0, Lqg/g$b;->k:Z

    iget-object v1, p0, Lqg/g$b;->a:Lqg/g$e;

    invoke-interface {v0, v1}, LDj/a;->b(LDj/b;)V

    goto :goto_3

    :catchall_1
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    iget-object v1, p0, Lqg/g$b;->e:LDj/c;

    invoke-interface {v1}, LDj/c;->cancel()V

    iget-object v1, p0, Lqg/g$b;->j:Lzg/c;

    invoke-virtual {v1, v0}, Lzg/c;->g(Ljava/lang/Throwable;)Z

    iget-object v0, p0, Lqg/g$b;->j:Lzg/c;

    iget-object v1, p0, Lqg/g$d;->m:LDj/b;

    invoke-virtual {v0, v1}, Lzg/c;->j(LDj/b;)V

    return-void

    :catchall_2
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    iget-object v1, p0, Lqg/g$b;->e:LDj/c;

    invoke-interface {v1}, LDj/c;->cancel()V

    iget-object v1, p0, Lqg/g$b;->j:Lzg/c;

    invoke-virtual {v1, v0}, Lzg/c;->g(Ljava/lang/Throwable;)Z

    iget-object v0, p0, Lqg/g$b;->j:Lzg/c;

    iget-object v1, p0, Lqg/g$d;->m:LDj/b;

    invoke-virtual {v0, v1}, Lzg/c;->j(LDj/b;)V

    return-void

    :cond_9
    :goto_3
    iget-object v0, p0, Lqg/g$d;->n:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-nez v0, :cond_0

    :cond_a
    return-void
.end method

.method n()V
    .locals 1

    iget-object v0, p0, Lqg/g$d;->m:LDj/b;

    invoke-interface {v0, p0}, LDj/b;->j(LDj/c;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lqg/g$b;->a:Lqg/g$e;

    invoke-virtual {v0}, Lyg/f;->cancel()V

    iget-object v0, p0, Lqg/g$d;->m:LDj/b;

    iget-object v1, p0, Lqg/g$b;->j:Lzg/c;

    invoke-static {v0, p1, p0, v1}, Lzg/i;->c(LDj/b;Ljava/lang/Throwable;Ljava/util/concurrent/atomic/AtomicInteger;Lzg/c;)V

    return-void
.end method

.method public request(J)V
    .locals 1

    iget-object v0, p0, Lqg/g$b;->a:Lqg/g$e;

    invoke-virtual {v0, p1, p2}, Lyg/f;->request(J)V

    return-void
.end method
