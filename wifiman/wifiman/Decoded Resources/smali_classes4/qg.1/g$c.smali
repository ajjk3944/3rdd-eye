.class final Lqg/g$c;
.super Lqg/g$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "c"
.end annotation


# instance fields
.field final m:LDj/b;

.field final n:Z


# direct methods
.method constructor <init>(LDj/b;Lkg/n;IZ)V
    .locals 0

    invoke-direct {p0, p2, p3}, Lqg/g$b;-><init>(Lkg/n;I)V

    iput-object p1, p0, Lqg/g$c;->m:LDj/b;

    iput-boolean p4, p0, Lqg/g$c;->n:Z

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lqg/g$c;->m:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->h(Ljava/lang/Object;)V

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
    .locals 1

    iget-object v0, p0, Lqg/g$b;->j:Lzg/c;

    invoke-virtual {v0, p1}, Lzg/c;->g(Ljava/lang/Throwable;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-boolean p1, p0, Lqg/g$c;->n:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lqg/g$b;->e:LDj/c;

    invoke-interface {p1}, LDj/c;->cancel()V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lqg/g$b;->h:Z

    :cond_0
    const/4 p1, 0x0

    iput-boolean p1, p0, Lqg/g$b;->k:Z

    invoke-virtual {p0}, Lqg/g$c;->l()V

    :cond_1
    return-void
.end method

.method l()V
    .locals 6

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_c

    :cond_0
    :goto_0
    iget-boolean v0, p0, Lqg/g$b;->i:Z

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-boolean v0, p0, Lqg/g$b;->k:Z

    if-nez v0, :cond_b

    iget-boolean v0, p0, Lqg/g$b;->h:Z

    if-eqz v0, :cond_2

    iget-boolean v1, p0, Lqg/g$c;->n:Z

    if-nez v1, :cond_2

    iget-object v1, p0, Lqg/g$b;->j:Lzg/c;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Throwable;

    if-eqz v1, :cond_2

    iget-object v0, p0, Lqg/g$b;->j:Lzg/c;

    iget-object v1, p0, Lqg/g$c;->m:LDj/b;

    invoke-virtual {v0, v1}, Lzg/c;->j(LDj/b;)V

    return-void

    :cond_2
    :try_start_0
    iget-object v1, p0, Lqg/g$b;->g:LDg/g;

    invoke-interface {v1}, LDg/g;->poll()Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_3

    move v4, v3

    goto :goto_1

    :cond_3
    move v4, v2

    :goto_1
    if-eqz v0, :cond_4

    if-eqz v4, :cond_4

    iget-object v0, p0, Lqg/g$b;->j:Lzg/c;

    iget-object v1, p0, Lqg/g$c;->m:LDj/b;

    invoke-virtual {v0, v1}, Lzg/c;->j(LDj/b;)V

    return-void

    :cond_4
    if-nez v4, :cond_b

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

    if-eq v1, v3, :cond_6

    iget v1, p0, Lqg/g$b;->f:I

    add-int/2addr v1, v3

    iget v4, p0, Lqg/g$b;->d:I

    if-ne v1, v4, :cond_5

    iput v2, p0, Lqg/g$b;->f:I

    iget-object v2, p0, Lqg/g$b;->e:LDj/c;

    int-to-long v4, v1

    invoke-interface {v2, v4, v5}, LDj/c;->request(J)V

    goto :goto_2

    :cond_5
    iput v1, p0, Lqg/g$b;->f:I

    :cond_6
    :goto_2
    instance-of v1, v0, Lkg/q;

    if-eqz v1, :cond_a

    check-cast v0, Lkg/q;

    :try_start_2
    invoke-interface {v0}, Lkg/q;->get()Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    iget-object v1, p0, Lqg/g$b;->j:Lzg/c;

    invoke-virtual {v1, v0}, Lzg/c;->g(Ljava/lang/Throwable;)Z

    iget-boolean v0, p0, Lqg/g$c;->n:Z

    if-nez v0, :cond_7

    iget-object v0, p0, Lqg/g$b;->e:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    iget-object v0, p0, Lqg/g$b;->j:Lzg/c;

    iget-object v1, p0, Lqg/g$c;->m:LDj/b;

    invoke-virtual {v0, v1}, Lzg/c;->j(LDj/b;)V

    return-void

    :cond_7
    const/4 v0, 0x0

    :goto_3
    if-nez v0, :cond_8

    goto/16 :goto_0

    :cond_8
    iget-object v1, p0, Lqg/g$b;->a:Lqg/g$e;

    invoke-virtual {v1}, Lyg/f;->o()Z

    move-result v1

    if-eqz v1, :cond_9

    iget-object v1, p0, Lqg/g$c;->m:LDj/b;

    invoke-interface {v1, v0}, LDj/b;->h(Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_9
    iput-boolean v3, p0, Lqg/g$b;->k:Z

    iget-object v1, p0, Lqg/g$b;->a:Lqg/g$e;

    new-instance v2, Lqg/g$g;

    iget-object v3, p0, Lqg/g$b;->a:Lqg/g$e;

    invoke-direct {v2, v0, v3}, Lqg/g$g;-><init>(Ljava/lang/Object;LDj/b;)V

    invoke-virtual {v1, v2}, Lyg/f;->r(LDj/c;)V

    goto :goto_4

    :cond_a
    iput-boolean v3, p0, Lqg/g$b;->k:Z

    iget-object v1, p0, Lqg/g$b;->a:Lqg/g$e;

    invoke-interface {v0, v1}, LDj/a;->b(LDj/b;)V

    goto :goto_4

    :catchall_1
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    iget-object v1, p0, Lqg/g$b;->e:LDj/c;

    invoke-interface {v1}, LDj/c;->cancel()V

    iget-object v1, p0, Lqg/g$b;->j:Lzg/c;

    invoke-virtual {v1, v0}, Lzg/c;->g(Ljava/lang/Throwable;)Z

    iget-object v0, p0, Lqg/g$b;->j:Lzg/c;

    iget-object v1, p0, Lqg/g$c;->m:LDj/b;

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

    iget-object v1, p0, Lqg/g$c;->m:LDj/b;

    invoke-virtual {v0, v1}, Lzg/c;->j(LDj/b;)V

    return-void

    :cond_b
    :goto_4
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-nez v0, :cond_0

    :cond_c
    return-void
.end method

.method n()V
    .locals 1

    iget-object v0, p0, Lqg/g$c;->m:LDj/b;

    invoke-interface {v0, p0}, LDj/b;->j(LDj/c;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lqg/g$b;->j:Lzg/c;

    invoke-virtual {v0, p1}, Lzg/c;->g(Ljava/lang/Throwable;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lqg/g$b;->h:Z

    invoke-virtual {p0}, Lqg/g$c;->l()V

    :cond_0
    return-void
.end method

.method public request(J)V
    .locals 1

    iget-object v0, p0, Lqg/g$b;->a:Lqg/g$e;

    invoke-virtual {v0, p1, p2}, Lyg/f;->request(J)V

    return-void
.end method
