.class final Lqg/k0$a;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lgg/l;
.implements LDj/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/k0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:LDj/b;

.field final b:Lkg/b;

.field final c:LDg/f;

.field final d:Ljava/util/concurrent/atomic/AtomicLong;

.field final e:I

.field final f:I

.field volatile g:Z

.field volatile h:Z

.field i:Ljava/lang/Throwable;

.field j:LDj/c;

.field k:Ljava/lang/Object;

.field l:I


# direct methods
.method constructor <init>(LDj/b;Lkg/b;Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Lqg/k0$a;->a:LDj/b;

    iput-object p2, p0, Lqg/k0$a;->b:Lkg/b;

    iput-object p3, p0, Lqg/k0$a;->k:Ljava/lang/Object;

    iput p4, p0, Lqg/k0$a;->e:I

    shr-int/lit8 p1, p4, 0x2

    sub-int p1, p4, p1

    iput p1, p0, Lqg/k0$a;->f:I

    new-instance p1, LDg/h;

    invoke-direct {p1, p4}, LDg/h;-><init>(I)V

    iput-object p1, p0, Lqg/k0$a;->c:LDg/f;

    invoke-interface {p1, p3}, LDg/g;->offer(Ljava/lang/Object;)Z

    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p1, p0, Lqg/k0$a;->d:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-boolean v0, p0, Lqg/k0$a;->h:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg/k0$a;->h:Z

    invoke-virtual {p0}, Lqg/k0$a;->c()V

    return-void
.end method

.method c()V
    .locals 18

    move-object/from16 v0, p0

    invoke-virtual/range {p0 .. p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    iget-object v1, v0, Lqg/k0$a;->a:LDj/b;

    iget-object v2, v0, Lqg/k0$a;->c:LDg/f;

    iget v3, v0, Lqg/k0$a;->f:I

    iget v4, v0, Lqg/k0$a;->l:I

    const/4 v5, 0x1

    move v6, v5

    :cond_1
    iget-object v7, v0, Lqg/k0$a;->d:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v7

    const-wide/16 v9, 0x0

    move-wide v11, v9

    :cond_2
    :goto_0
    cmp-long v13, v11, v7

    if-eqz v13, :cond_8

    iget-boolean v14, v0, Lqg/k0$a;->g:Z

    if-eqz v14, :cond_3

    invoke-interface {v2}, LDg/g;->clear()V

    return-void

    :cond_3
    iget-boolean v14, v0, Lqg/k0$a;->h:Z

    if-eqz v14, :cond_4

    iget-object v15, v0, Lqg/k0$a;->i:Ljava/lang/Throwable;

    if-eqz v15, :cond_4

    invoke-interface {v2}, LDg/g;->clear()V

    invoke-interface {v1, v15}, LDj/b;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_4
    invoke-interface {v2}, LDg/f;->poll()Ljava/lang/Object;

    move-result-object v15

    const/16 v16, 0x0

    if-nez v15, :cond_5

    move/from16 v17, v5

    goto :goto_1

    :cond_5
    move/from16 v17, v16

    :goto_1
    if-eqz v14, :cond_6

    if-eqz v17, :cond_6

    invoke-interface {v1}, LDj/b;->a()V

    return-void

    :cond_6
    if-eqz v17, :cond_7

    goto :goto_2

    :cond_7
    invoke-interface {v1, v15}, LDj/b;->h(Ljava/lang/Object;)V

    const-wide/16 v13, 0x1

    add-long/2addr v11, v13

    add-int/lit8 v4, v4, 0x1

    if-ne v4, v3, :cond_2

    iget-object v4, v0, Lqg/k0$a;->j:LDj/c;

    int-to-long v13, v3

    invoke-interface {v4, v13, v14}, LDj/c;->request(J)V

    move/from16 v4, v16

    goto :goto_0

    :cond_8
    :goto_2
    if-nez v13, :cond_a

    iget-boolean v7, v0, Lqg/k0$a;->h:Z

    if-eqz v7, :cond_a

    iget-object v7, v0, Lqg/k0$a;->i:Ljava/lang/Throwable;

    if-eqz v7, :cond_9

    invoke-interface {v2}, LDg/g;->clear()V

    invoke-interface {v1, v7}, LDj/b;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_9
    invoke-interface {v2}, LDg/g;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-interface {v1}, LDj/b;->a()V

    return-void

    :cond_a
    cmp-long v7, v11, v9

    if-eqz v7, :cond_b

    iget-object v7, v0, Lqg/k0$a;->d:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v7, v11, v12}, Lzg/d;->d(Ljava/util/concurrent/atomic/AtomicLong;J)J

    :cond_b
    iput v4, v0, Lqg/k0$a;->l:I

    neg-int v6, v6

    invoke-virtual {v0, v6}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v6

    if-nez v6, :cond_1

    return-void
.end method

.method public cancel()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg/k0$a;->g:Z

    iget-object v0, p0, Lqg/k0$a;->j:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lqg/k0$a;->c:LDg/f;

    invoke-interface {v0}, LDg/g;->clear()V

    :cond_0
    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 2

    iget-boolean v0, p0, Lqg/k0$a;->h:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lqg/k0$a;->k:Ljava/lang/Object;

    :try_start_0
    iget-object v1, p0, Lqg/k0$a;->b:Lkg/b;

    invoke-interface {v1, v0, p1}, Lkg/b;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "The accumulator returned a null value"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object p1, p0, Lqg/k0$a;->k:Ljava/lang/Object;

    iget-object v0, p0, Lqg/k0$a;->c:LDg/f;

    invoke-interface {v0, p1}, LDg/g;->offer(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lqg/k0$a;->c()V

    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lig/a;->b(Ljava/lang/Throwable;)V

    iget-object v0, p0, Lqg/k0$a;->j:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    invoke-virtual {p0, p1}, Lqg/k0$a;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public j(LDj/c;)V
    .locals 2

    iget-object v0, p0, Lqg/k0$a;->j:LDj/c;

    invoke-static {v0, p1}, Lyg/g;->validate(LDj/c;LDj/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lqg/k0$a;->j:LDj/c;

    iget-object v0, p0, Lqg/k0$a;->a:LDj/b;

    invoke-interface {v0, p0}, LDj/b;->j(LDj/c;)V

    iget v0, p0, Lqg/k0$a;->e:I

    add-int/lit8 v0, v0, -0x1

    int-to-long v0, v0

    invoke-interface {p1, v0, v1}, LDj/c;->request(J)V

    :cond_0
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-boolean v0, p0, Lqg/k0$a;->h:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iput-object p1, p0, Lqg/k0$a;->i:Ljava/lang/Throwable;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lqg/k0$a;->h:Z

    invoke-virtual {p0}, Lqg/k0$a;->c()V

    return-void
.end method

.method public request(J)V
    .locals 1

    invoke-static {p1, p2}, Lyg/g;->validate(J)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqg/k0$a;->d:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v0, p1, p2}, Lzg/d;->a(Ljava/util/concurrent/atomic/AtomicLong;J)J

    invoke-virtual {p0}, Lqg/k0$a;->c()V

    :cond_0
    return-void
.end method
