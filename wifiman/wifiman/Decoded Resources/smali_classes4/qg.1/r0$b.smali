.class final Lqg/r0$b;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lgg/l;
.implements LDj/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/r0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# static fields
.field static final l:Lqg/r0$a;


# instance fields
.field final a:LDj/b;

.field final b:Lkg/n;

.field final c:I

.field final d:Z

.field volatile e:Z

.field final f:Lzg/c;

.field volatile g:Z

.field h:LDj/c;

.field final i:Ljava/util/concurrent/atomic/AtomicReference;

.field final j:Ljava/util/concurrent/atomic/AtomicLong;

.field volatile k:J


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lqg/r0$a;

    const-wide/16 v1, -0x1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct {v0, v4, v1, v2, v3}, Lqg/r0$a;-><init>(Lqg/r0$b;JI)V

    sput-object v0, Lqg/r0$b;->l:Lqg/r0$a;

    invoke-virtual {v0}, Lqg/r0$a;->c()V

    return-void
.end method

.method constructor <init>(LDj/b;Lkg/n;IZ)V
    .locals 1

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lqg/r0$b;->i:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object v0, p0, Lqg/r0$b;->j:Ljava/util/concurrent/atomic/AtomicLong;

    iput-object p1, p0, Lqg/r0$b;->a:LDj/b;

    iput-object p2, p0, Lqg/r0$b;->b:Lkg/n;

    iput p3, p0, Lqg/r0$b;->c:I

    iput-boolean p4, p0, Lqg/r0$b;->d:Z

    new-instance p1, Lzg/c;

    invoke-direct {p1}, Lzg/c;-><init>()V

    iput-object p1, p0, Lqg/r0$b;->f:Lzg/c;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-boolean v0, p0, Lqg/r0$b;->e:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg/r0$b;->e:Z

    invoke-virtual {p0}, Lqg/r0$b;->d()V

    return-void
.end method

.method c()V
    .locals 2

    iget-object v0, p0, Lqg/r0$b;->i:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Lqg/r0$b;->l:Lqg/r0$a;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqg/r0$a;

    if-eq v0, v1, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lqg/r0$a;->c()V

    :cond_0
    return-void
.end method

.method public cancel()V
    .locals 1

    iget-boolean v0, p0, Lqg/r0$b;->g:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg/r0$b;->g:Z

    iget-object v0, p0, Lqg/r0$b;->h:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    invoke-virtual {p0}, Lqg/r0$b;->c()V

    iget-object v0, p0, Lqg/r0$b;->f:Lzg/c;

    invoke-virtual {v0}, Lzg/c;->h()V

    :cond_0
    return-void
.end method

.method d()V
    .locals 17

    move-object/from16 v1, p0

    invoke-virtual/range {p0 .. p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v2, v1, Lqg/r0$b;->a:LDj/b;

    const/4 v4, 0x1

    :cond_1
    :goto_0
    iget-boolean v0, v1, Lqg/r0$b;->g:Z

    if-eqz v0, :cond_2

    return-void

    :cond_2
    iget-boolean v0, v1, Lqg/r0$b;->e:Z

    if-eqz v0, :cond_5

    iget-boolean v0, v1, Lqg/r0$b;->d:Z

    if-eqz v0, :cond_3

    iget-object v0, v1, Lqg/r0$b;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_5

    iget-object v0, v1, Lqg/r0$b;->f:Lzg/c;

    invoke-virtual {v0, v2}, Lzg/c;->j(LDj/b;)V

    return-void

    :cond_3
    iget-object v0, v1, Lqg/r0$b;->f:Lzg/c;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    if-eqz v0, :cond_4

    invoke-virtual/range {p0 .. p0}, Lqg/r0$b;->c()V

    iget-object v0, v1, Lqg/r0$b;->f:Lzg/c;

    invoke-virtual {v0, v2}, Lzg/c;->j(LDj/b;)V

    return-void

    :cond_4
    iget-object v0, v1, Lqg/r0$b;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_5

    invoke-interface {v2}, LDj/b;->a()V

    return-void

    :cond_5
    iget-object v0, v1, Lqg/r0$b;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lqg/r0$a;

    const/4 v6, 0x0

    if-eqz v5, :cond_6

    iget-object v0, v5, Lqg/r0$a;->d:LDg/g;

    move-object v7, v0

    goto :goto_1

    :cond_6
    move-object v7, v6

    :goto_1
    if-eqz v7, :cond_14

    iget-object v0, v1, Lqg/r0$b;->j:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v8

    const-wide/16 v10, 0x0

    move-wide v12, v10

    :goto_2
    cmp-long v14, v12, v8

    if-eqz v14, :cond_e

    iget-boolean v0, v1, Lqg/r0$b;->g:Z

    if-eqz v0, :cond_7

    return-void

    :cond_7
    iget-boolean v0, v5, Lqg/r0$a;->e:Z

    :try_start_0
    invoke-interface {v7}, LDg/g;->poll()Ljava/lang/Object;

    move-result-object v16
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v3, v16

    goto :goto_3

    :catchall_0
    move-exception v0

    move-object/from16 v16, v0

    invoke-static/range {v16 .. v16}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-virtual {v5}, Lqg/r0$a;->c()V

    iget-object v0, v1, Lqg/r0$b;->f:Lzg/c;

    move-object/from16 v3, v16

    invoke-virtual {v0, v3}, Lzg/c;->g(Ljava/lang/Throwable;)Z

    move-object v3, v6

    const/4 v0, 0x1

    :goto_3
    if-nez v3, :cond_8

    const/16 v16, 0x1

    goto :goto_4

    :cond_8
    const/16 v16, 0x0

    :goto_4
    iget-object v15, v1, Lqg/r0$b;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v15}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v15

    if-eq v5, v15, :cond_9

    :goto_5
    const/4 v15, 0x1

    goto :goto_7

    :cond_9
    if-eqz v0, :cond_c

    iget-boolean v0, v1, Lqg/r0$b;->d:Z

    if-nez v0, :cond_b

    iget-object v0, v1, Lqg/r0$b;->f:Lzg/c;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    if-eqz v0, :cond_a

    iget-object v0, v1, Lqg/r0$b;->f:Lzg/c;

    invoke-virtual {v0, v2}, Lzg/c;->j(LDj/b;)V

    return-void

    :cond_a
    if-eqz v16, :cond_c

    iget-object v0, v1, Lqg/r0$b;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0, v5, v6}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_5

    :cond_b
    if-eqz v16, :cond_c

    iget-object v0, v1, Lqg/r0$b;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0, v5, v6}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_5

    :cond_c
    if-eqz v16, :cond_d

    goto :goto_6

    :cond_d
    invoke-interface {v2, v3}, LDj/b;->h(Ljava/lang/Object;)V

    const-wide/16 v14, 0x1

    add-long/2addr v12, v14

    goto :goto_2

    :cond_e
    :goto_6
    const/4 v15, 0x0

    :goto_7
    if-nez v14, :cond_11

    iget-boolean v0, v5, Lqg/r0$a;->e:Z

    if-eqz v0, :cond_11

    iget-boolean v0, v1, Lqg/r0$b;->d:Z

    if-nez v0, :cond_10

    iget-object v0, v1, Lqg/r0$b;->f:Lzg/c;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    if-eqz v0, :cond_f

    invoke-virtual/range {p0 .. p0}, Lqg/r0$b;->c()V

    iget-object v0, v1, Lqg/r0$b;->f:Lzg/c;

    invoke-virtual {v0, v2}, Lzg/c;->j(LDj/b;)V

    return-void

    :cond_f
    invoke-interface {v7}, LDg/g;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_11

    iget-object v0, v1, Lqg/r0$b;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0, v5, v6}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_10
    invoke-interface {v7}, LDg/g;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_11

    iget-object v0, v1, Lqg/r0$b;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0, v5, v6}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_11
    cmp-long v0, v12, v10

    if-eqz v0, :cond_13

    iget-boolean v0, v1, Lqg/r0$b;->g:Z

    if-nez v0, :cond_13

    const-wide v6, 0x7fffffffffffffffL

    cmp-long v0, v8, v6

    if-eqz v0, :cond_12

    iget-object v0, v1, Lqg/r0$b;->j:Ljava/util/concurrent/atomic/AtomicLong;

    neg-long v6, v12

    invoke-virtual {v0, v6, v7}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    :cond_12
    invoke-virtual {v5, v12, v13}, Lqg/r0$a;->d(J)V

    :cond_13
    if-eqz v15, :cond_14

    goto/16 :goto_0

    :cond_14
    neg-int v0, v4

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v4

    if-nez v4, :cond_1

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 4

    iget-boolean v0, p0, Lqg/r0$b;->e:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-wide v0, p0, Lqg/r0$b;->k:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lqg/r0$b;->k:J

    iget-object v2, p0, Lqg/r0$b;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lqg/r0$a;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lqg/r0$a;->c()V

    :cond_1
    :try_start_0
    iget-object v2, p0, Lqg/r0$b;->b:Lkg/n;

    invoke-interface {v2, p1}, Lkg/n;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v2, "The publisher returned is null"

    invoke-static {p1, v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, LDj/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v2, Lqg/r0$a;

    iget v3, p0, Lqg/r0$b;->c:I

    invoke-direct {v2, p0, v0, v1, v3}, Lqg/r0$a;-><init>(Lqg/r0$b;JI)V

    :cond_2
    iget-object v0, p0, Lqg/r0$b;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqg/r0$a;

    sget-object v1, Lqg/r0$b;->l:Lqg/r0$a;

    if-ne v0, v1, :cond_3

    goto :goto_0

    :cond_3
    iget-object v1, p0, Lqg/r0$b;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v1, v0, v2}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1, v2}, LDj/a;->b(LDj/b;)V

    :goto_0
    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lig/a;->b(Ljava/lang/Throwable;)V

    iget-object v0, p0, Lqg/r0$b;->h:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    invoke-virtual {p0, p1}, Lqg/r0$b;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public j(LDj/c;)V
    .locals 1

    iget-object v0, p0, Lqg/r0$b;->h:LDj/c;

    invoke-static {v0, p1}, Lyg/g;->validate(LDj/c;LDj/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lqg/r0$b;->h:LDj/c;

    iget-object p1, p0, Lqg/r0$b;->a:LDj/b;

    invoke-interface {p1, p0}, LDj/b;->j(LDj/c;)V

    :cond_0
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-boolean v0, p0, Lqg/r0$b;->e:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lqg/r0$b;->f:Lzg/c;

    invoke-virtual {v0, p1}, Lzg/c;->d(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean p1, p0, Lqg/r0$b;->d:Z

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lqg/r0$b;->c()V

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lqg/r0$b;->e:Z

    invoke-virtual {p0}, Lqg/r0$b;->d()V

    goto :goto_0

    :cond_1
    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public request(J)V
    .locals 2

    invoke-static {p1, p2}, Lyg/g;->validate(J)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lqg/r0$b;->j:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v0, p1, p2}, Lzg/d;->a(Ljava/util/concurrent/atomic/AtomicLong;J)J

    iget-wide p1, p0, Lqg/r0$b;->k:J

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-nez p1, :cond_0

    iget-object p1, p0, Lqg/r0$b;->h:LDj/c;

    const-wide v0, 0x7fffffffffffffffL

    invoke-interface {p1, v0, v1}, LDj/c;->request(J)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lqg/r0$b;->d()V

    :cond_1
    :goto_0
    return-void
.end method
