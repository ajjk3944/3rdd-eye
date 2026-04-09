.class final Lqg/Q$a;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lgg/l;
.implements LDj/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/Q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/Q$a$a;
    }
.end annotation


# instance fields
.field final a:LDj/b;

.field final b:Ljava/util/concurrent/atomic/AtomicReference;

.field final c:Lqg/Q$a$a;

.field final d:Lzg/c;

.field final e:Ljava/util/concurrent/atomic/AtomicLong;

.field final f:I

.field final g:I

.field volatile h:LDg/f;

.field i:Ljava/lang/Object;

.field volatile j:Z

.field volatile k:Z

.field volatile l:I

.field m:J

.field n:I


# direct methods
.method constructor <init>(LDj/b;)V
    .locals 1

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Lqg/Q$a;->a:LDj/b;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lqg/Q$a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance p1, Lqg/Q$a$a;

    invoke-direct {p1, p0}, Lqg/Q$a$a;-><init>(Lqg/Q$a;)V

    iput-object p1, p0, Lqg/Q$a;->c:Lqg/Q$a$a;

    new-instance p1, Lzg/c;

    invoke-direct {p1}, Lzg/c;-><init>()V

    iput-object p1, p0, Lqg/Q$a;->d:Lzg/c;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p1, p0, Lqg/Q$a;->e:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {}, Lgg/i;->i()I

    move-result p1

    iput p1, p0, Lqg/Q$a;->f:I

    shr-int/lit8 v0, p1, 0x2

    sub-int/2addr p1, v0

    iput p1, p0, Lqg/Q$a;->g:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg/Q$a;->k:Z

    invoke-virtual {p0}, Lqg/Q$a;->c()V

    return-void
.end method

.method c()V
    .locals 1

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lqg/Q$a;->d()V

    :cond_0
    return-void
.end method

.method public cancel()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg/Q$a;->j:Z

    iget-object v0, p0, Lqg/Q$a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0}, Lyg/g;->cancel(Ljava/util/concurrent/atomic/AtomicReference;)Z

    iget-object v0, p0, Lqg/Q$a;->c:Lqg/Q$a$a;

    invoke-static {v0}, Llg/b;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    iget-object v0, p0, Lqg/Q$a;->d:Lzg/c;

    invoke-virtual {v0}, Lzg/c;->h()V

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lqg/Q$a;->h:LDg/f;

    iput-object v0, p0, Lqg/Q$a;->i:Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method d()V
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, Lqg/Q$a;->a:LDj/b;

    iget-wide v2, v0, Lqg/Q$a;->m:J

    iget v4, v0, Lqg/Q$a;->n:I

    iget v5, v0, Lqg/Q$a;->g:I

    const/4 v6, 0x1

    move v7, v6

    :goto_0
    iget-object v8, v0, Lqg/Q$a;->e:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v8}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v8

    :goto_1
    cmp-long v10, v2, v8

    const/4 v12, 0x2

    const/4 v13, 0x0

    if-eqz v10, :cond_8

    iget-boolean v14, v0, Lqg/Q$a;->j:Z

    if-eqz v14, :cond_0

    iput-object v13, v0, Lqg/Q$a;->i:Ljava/lang/Object;

    iput-object v13, v0, Lqg/Q$a;->h:LDg/f;

    return-void

    :cond_0
    iget-object v14, v0, Lqg/Q$a;->d:Lzg/c;

    invoke-virtual {v14}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v14

    if-eqz v14, :cond_1

    iput-object v13, v0, Lqg/Q$a;->i:Ljava/lang/Object;

    iput-object v13, v0, Lqg/Q$a;->h:LDg/f;

    iget-object v1, v0, Lqg/Q$a;->d:Lzg/c;

    iget-object v2, v0, Lqg/Q$a;->a:LDj/b;

    invoke-virtual {v1, v2}, Lzg/c;->j(LDj/b;)V

    return-void

    :cond_1
    iget v14, v0, Lqg/Q$a;->l:I

    const-wide/16 v15, 0x1

    if-ne v14, v6, :cond_2

    iget-object v10, v0, Lqg/Q$a;->i:Ljava/lang/Object;

    iput-object v13, v0, Lqg/Q$a;->i:Ljava/lang/Object;

    iput v12, v0, Lqg/Q$a;->l:I

    invoke-interface {v1, v10}, LDj/b;->h(Ljava/lang/Object;)V

    add-long/2addr v2, v15

    goto :goto_1

    :cond_2
    iget-boolean v6, v0, Lqg/Q$a;->k:Z

    iget-object v11, v0, Lqg/Q$a;->h:LDg/f;

    if-eqz v11, :cond_3

    invoke-interface {v11}, LDg/f;->poll()Ljava/lang/Object;

    move-result-object v11

    goto :goto_2

    :cond_3
    move-object v11, v13

    :goto_2
    if-nez v11, :cond_4

    const/16 v17, 0x1

    goto :goto_3

    :cond_4
    const/16 v17, 0x0

    :goto_3
    if-eqz v6, :cond_5

    if-eqz v17, :cond_5

    if-ne v14, v12, :cond_5

    iput-object v13, v0, Lqg/Q$a;->h:LDg/f;

    invoke-interface {v1}, LDj/b;->a()V

    return-void

    :cond_5
    if-eqz v17, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {v1, v11}, LDj/b;->h(Ljava/lang/Object;)V

    add-long/2addr v2, v15

    add-int/lit8 v4, v4, 0x1

    if-ne v4, v5, :cond_7

    iget-object v4, v0, Lqg/Q$a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LDj/c;

    int-to-long v10, v5

    invoke-interface {v4, v10, v11}, LDj/c;->request(J)V

    const/4 v4, 0x0

    :cond_7
    const/4 v6, 0x1

    goto :goto_1

    :cond_8
    :goto_4
    if-nez v10, :cond_d

    iget-boolean v6, v0, Lqg/Q$a;->j:Z

    if-eqz v6, :cond_9

    iput-object v13, v0, Lqg/Q$a;->i:Ljava/lang/Object;

    iput-object v13, v0, Lqg/Q$a;->h:LDg/f;

    return-void

    :cond_9
    iget-object v6, v0, Lqg/Q$a;->d:Lzg/c;

    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_a

    iput-object v13, v0, Lqg/Q$a;->i:Ljava/lang/Object;

    iput-object v13, v0, Lqg/Q$a;->h:LDg/f;

    iget-object v1, v0, Lqg/Q$a;->d:Lzg/c;

    iget-object v2, v0, Lqg/Q$a;->a:LDj/b;

    invoke-virtual {v1, v2}, Lzg/c;->j(LDj/b;)V

    return-void

    :cond_a
    iget-boolean v6, v0, Lqg/Q$a;->k:Z

    iget-object v8, v0, Lqg/Q$a;->h:LDg/f;

    if-eqz v8, :cond_c

    invoke-interface {v8}, LDg/g;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_b

    goto :goto_5

    :cond_b
    const/4 v11, 0x0

    goto :goto_6

    :cond_c
    :goto_5
    const/4 v11, 0x1

    :goto_6
    if-eqz v6, :cond_d

    if-eqz v11, :cond_d

    iget v6, v0, Lqg/Q$a;->l:I

    if-ne v6, v12, :cond_d

    iput-object v13, v0, Lqg/Q$a;->h:LDg/f;

    invoke-interface {v1}, LDj/b;->a()V

    return-void

    :cond_d
    iput-wide v2, v0, Lqg/Q$a;->m:J

    iput v4, v0, Lqg/Q$a;->n:I

    neg-int v6, v7

    invoke-virtual {v0, v6}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v7

    if-nez v7, :cond_e

    return-void

    :cond_e
    const/4 v6, 0x1

    goto/16 :goto_0
.end method

.method g()LDg/f;
    .locals 2

    iget-object v0, p0, Lqg/Q$a;->h:LDg/f;

    if-nez v0, :cond_0

    new-instance v0, LDg/h;

    invoke-static {}, Lgg/i;->i()I

    move-result v1

    invoke-direct {v0, v1}, LDg/h;-><init>(I)V

    iput-object v0, p0, Lqg/Q$a;->h:LDg/f;

    :cond_0
    return-object v0
.end method

.method public h(Ljava/lang/Object;)V
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-wide v2, p0, Lqg/Q$a;->m:J

    iget-object v4, p0, Lqg/Q$a;->e:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v4

    cmp-long v4, v4, v2

    if-eqz v4, :cond_3

    iget-object v4, p0, Lqg/Q$a;->h:LDg/f;

    if-eqz v4, :cond_1

    invoke-interface {v4}, LDg/g;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v4, p1}, LDg/g;->offer(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    :goto_0
    const-wide/16 v4, 0x1

    add-long/2addr v2, v4

    iput-wide v2, p0, Lqg/Q$a;->m:J

    iget-object v2, p0, Lqg/Q$a;->a:LDj/b;

    invoke-interface {v2, p1}, LDj/b;->h(Ljava/lang/Object;)V

    iget p1, p0, Lqg/Q$a;->n:I

    add-int/2addr p1, v1

    iget v1, p0, Lqg/Q$a;->g:I

    if-ne p1, v1, :cond_2

    iput v0, p0, Lqg/Q$a;->n:I

    iget-object v0, p0, Lqg/Q$a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LDj/c;

    int-to-long v1, p1

    invoke-interface {v0, v1, v2}, LDj/c;->request(J)V

    goto :goto_1

    :cond_2
    iput p1, p0, Lqg/Q$a;->n:I

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lqg/Q$a;->g()LDg/f;

    move-result-object v0

    invoke-interface {v0, p1}, LDg/g;->offer(Ljava/lang/Object;)Z

    :goto_1
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result p1

    if-nez p1, :cond_5

    return-void

    :cond_4
    invoke-virtual {p0}, Lqg/Q$a;->g()LDg/f;

    move-result-object v0

    invoke-interface {v0, p1}, LDg/g;->offer(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p1

    if-eqz p1, :cond_5

    return-void

    :cond_5
    invoke-virtual {p0}, Lqg/Q$a;->d()V

    return-void
.end method

.method public j(LDj/c;)V
    .locals 3

    iget-object v0, p0, Lqg/Q$a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iget v1, p0, Lqg/Q$a;->f:I

    int-to-long v1, v1

    invoke-static {v0, p1, v1, v2}, Lyg/g;->setOnce(Ljava/util/concurrent/atomic/AtomicReference;LDj/c;J)Z

    return-void
.end method

.method l()V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lqg/Q$a;->l:I

    invoke-virtual {p0}, Lqg/Q$a;->c()V

    return-void
.end method

.method n(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lqg/Q$a;->d:Lzg/c;

    invoke-virtual {v0, p1}, Lzg/c;->g(Ljava/lang/Throwable;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lqg/Q$a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {p1}, Lyg/g;->cancel(Ljava/util/concurrent/atomic/AtomicReference;)Z

    invoke-virtual {p0}, Lqg/Q$a;->c()V

    :cond_0
    return-void
.end method

.method o(Ljava/lang/Object;)V
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-wide v2, p0, Lqg/Q$a;->m:J

    iget-object v0, p0, Lqg/Q$a;->e:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v4

    cmp-long v0, v4, v2

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x1

    add-long/2addr v2, v0

    iput-wide v2, p0, Lqg/Q$a;->m:J

    iget-object v0, p0, Lqg/Q$a;->a:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->h(Ljava/lang/Object;)V

    const/4 p1, 0x2

    iput p1, p0, Lqg/Q$a;->l:I

    goto :goto_0

    :cond_0
    iput-object p1, p0, Lqg/Q$a;->i:Ljava/lang/Object;

    iput v1, p0, Lqg/Q$a;->l:I

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result p1

    if-nez p1, :cond_2

    return-void

    :cond_1
    iput-object p1, p0, Lqg/Q$a;->i:Ljava/lang/Object;

    iput v1, p0, Lqg/Q$a;->l:I

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p1

    if-eqz p1, :cond_2

    return-void

    :cond_2
    :goto_0
    invoke-virtual {p0}, Lqg/Q$a;->d()V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lqg/Q$a;->d:Lzg/c;

    invoke-virtual {v0, p1}, Lzg/c;->g(Ljava/lang/Throwable;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lqg/Q$a;->c:Lqg/Q$a$a;

    invoke-static {p1}, Llg/b;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    invoke-virtual {p0}, Lqg/Q$a;->c()V

    :cond_0
    return-void
.end method

.method public request(J)V
    .locals 1

    iget-object v0, p0, Lqg/Q$a;->e:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v0, p1, p2}, Lzg/d;->a(Ljava/util/concurrent/atomic/AtomicLong;J)J

    invoke-virtual {p0}, Lqg/Q$a;->c()V

    return-void
.end method
