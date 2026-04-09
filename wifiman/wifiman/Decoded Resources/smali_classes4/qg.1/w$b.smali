.class final Lqg/w$b;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lgg/l;
.implements LDj/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# static fields
.field static final r:[Lqg/w$a;

.field static final s:[Lqg/w$a;


# instance fields
.field final a:LDj/b;

.field final b:Lkg/n;

.field final c:Z

.field final d:I

.field final e:I

.field volatile f:LDg/f;

.field volatile g:Z

.field final h:Lzg/c;

.field volatile i:Z

.field final j:Ljava/util/concurrent/atomic/AtomicReference;

.field final k:Ljava/util/concurrent/atomic/AtomicLong;

.field l:LDj/c;

.field m:J

.field n:J

.field o:I

.field p:I

.field final q:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    new-array v1, v0, [Lqg/w$a;

    sput-object v1, Lqg/w$b;->r:[Lqg/w$a;

    new-array v0, v0, [Lqg/w$a;

    sput-object v0, Lqg/w$b;->s:[Lqg/w$a;

    return-void
.end method

.method constructor <init>(LDj/b;Lkg/n;ZII)V
    .locals 2

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    new-instance v0, Lzg/c;

    invoke-direct {v0}, Lzg/c;-><init>()V

    iput-object v0, p0, Lqg/w$b;->h:Lzg/c;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lqg/w$b;->j:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object v1, p0, Lqg/w$b;->k:Ljava/util/concurrent/atomic/AtomicLong;

    iput-object p1, p0, Lqg/w$b;->a:LDj/b;

    iput-object p2, p0, Lqg/w$b;->b:Lkg/n;

    iput-boolean p3, p0, Lqg/w$b;->c:Z

    iput p4, p0, Lqg/w$b;->d:I

    iput p5, p0, Lqg/w$b;->e:I

    const/4 p1, 0x1

    shr-int/lit8 p2, p4, 0x1

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lqg/w$b;->q:I

    sget-object p1, Lqg/w$b;->r:[Lqg/w$a;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-boolean v0, p0, Lqg/w$b;->g:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg/w$b;->g:Z

    invoke-virtual {p0}, Lqg/w$b;->n()V

    return-void
.end method

.method c(Lqg/w$a;)Z
    .locals 4

    :cond_0
    iget-object v0, p0, Lqg/w$b;->j:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lqg/w$a;

    sget-object v1, Lqg/w$b;->s:[Lqg/w$a;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Lqg/w$a;->dispose()V

    return v2

    :cond_1
    array-length v1, v0

    add-int/lit8 v3, v1, 0x1

    new-array v3, v3, [Lqg/w$a;

    invoke-static {v0, v2, v3, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    aput-object p1, v3, v1

    iget-object v1, p0, Lqg/w$b;->j:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v1, v0, v3}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1
.end method

.method public cancel()V
    .locals 1

    iget-boolean v0, p0, Lqg/w$b;->i:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg/w$b;->i:Z

    iget-object v0, p0, Lqg/w$b;->l:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    invoke-virtual {p0}, Lqg/w$b;->l()V

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lqg/w$b;->f:LDg/f;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LDg/g;->clear()V

    :cond_0
    return-void
.end method

.method d()Z
    .locals 3

    iget-boolean v0, p0, Lqg/w$b;->i:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lqg/w$b;->g()V

    return v1

    :cond_0
    iget-boolean v0, p0, Lqg/w$b;->c:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lqg/w$b;->h:Lzg/c;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lqg/w$b;->g()V

    iget-object v0, p0, Lqg/w$b;->h:Lzg/c;

    iget-object v2, p0, Lqg/w$b;->a:LDj/b;

    invoke-virtual {v0, v2}, Lzg/c;->j(LDj/b;)V

    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method g()V
    .locals 1

    iget-object v0, p0, Lqg/w$b;->f:LDg/f;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LDg/g;->clear()V

    :cond_0
    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 6

    iget-boolean v0, p0, Lqg/w$b;->g:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lqg/w$b;->b:Lkg/n;

    invoke-interface {v0, p1}, Lkg/n;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "The mapper returned a null Publisher"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, LDj/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    instance-of v0, p1, Lkg/q;

    if-eqz v0, :cond_2

    :try_start_1
    check-cast p1, Lkg/q;

    invoke-interface {p1}, Lkg/q;->get()Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p1, :cond_1

    invoke-virtual {p0, p1}, Lqg/w$b;->v(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    iget p1, p0, Lqg/w$b;->d:I

    const v0, 0x7fffffff

    if-eq p1, v0, :cond_3

    iget-boolean p1, p0, Lqg/w$b;->i:Z

    if-nez p1, :cond_3

    iget p1, p0, Lqg/w$b;->p:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lqg/w$b;->p:I

    iget v0, p0, Lqg/w$b;->q:I

    if-ne p1, v0, :cond_3

    const/4 p1, 0x0

    iput p1, p0, Lqg/w$b;->p:I

    iget-object p1, p0, Lqg/w$b;->l:LDj/c;

    int-to-long v0, v0

    invoke-interface {p1, v0, v1}, LDj/c;->request(J)V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lig/a;->b(Ljava/lang/Throwable;)V

    iget-object v0, p0, Lqg/w$b;->h:Lzg/c;

    invoke-virtual {v0, p1}, Lzg/c;->g(Ljava/lang/Throwable;)Z

    invoke-virtual {p0}, Lqg/w$b;->n()V

    return-void

    :cond_2
    new-instance v0, Lqg/w$a;

    iget v1, p0, Lqg/w$b;->e:I

    iget-wide v2, p0, Lqg/w$b;->m:J

    const-wide/16 v4, 0x1

    add-long/2addr v4, v2

    iput-wide v4, p0, Lqg/w$b;->m:J

    invoke-direct {v0, p0, v1, v2, v3}, Lqg/w$a;-><init>(Lqg/w$b;IJ)V

    invoke-virtual {p0, v0}, Lqg/w$b;->c(Lqg/w$a;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1, v0}, LDj/a;->b(LDj/b;)V

    :cond_3
    :goto_0
    return-void

    :catchall_1
    move-exception p1

    invoke-static {p1}, Lig/a;->b(Ljava/lang/Throwable;)V

    iget-object v0, p0, Lqg/w$b;->l:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    invoke-virtual {p0, p1}, Lqg/w$b;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public j(LDj/c;)V
    .locals 2

    iget-object v0, p0, Lqg/w$b;->l:LDj/c;

    invoke-static {v0, p1}, Lyg/g;->validate(LDj/c;LDj/c;)Z

    move-result v0

    if-eqz v0, :cond_1

    iput-object p1, p0, Lqg/w$b;->l:LDj/c;

    iget-object v0, p0, Lqg/w$b;->a:LDj/b;

    invoke-interface {v0, p0}, LDj/b;->j(LDj/c;)V

    iget-boolean v0, p0, Lqg/w$b;->i:Z

    if-nez v0, :cond_1

    iget v0, p0, Lqg/w$b;->d:I

    const v1, 0x7fffffff

    if-ne v0, v1, :cond_0

    const-wide v0, 0x7fffffffffffffffL

    invoke-interface {p1, v0, v1}, LDj/c;->request(J)V

    goto :goto_0

    :cond_0
    int-to-long v0, v0

    invoke-interface {p1, v0, v1}, LDj/c;->request(J)V

    :cond_1
    :goto_0
    return-void
.end method

.method l()V
    .locals 4

    iget-object v0, p0, Lqg/w$b;->j:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Lqg/w$b;->s:[Lqg/w$a;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lqg/w$a;

    if-eq v0, v1, :cond_1

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lqg/w$a;->dispose()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lqg/w$b;->h:Lzg/c;

    invoke-virtual {v0}, Lzg/c;->h()V

    :cond_1
    return-void
.end method

.method n()V
    .locals 1

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lqg/w$b;->o()V

    :cond_0
    return-void
.end method

.method o()V
    .locals 24

    move-object/from16 v1, p0

    iget-object v2, v1, Lqg/w$b;->a:LDj/b;

    const/4 v4, 0x1

    :cond_0
    :goto_0
    invoke-virtual/range {p0 .. p0}, Lqg/w$b;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object v0, v1, Lqg/w$b;->f:LDg/f;

    iget-object v5, v1, Lqg/w$b;->k:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v5

    const-wide v7, 0x7fffffffffffffffL

    cmp-long v9, v5, v7

    if-nez v9, :cond_2

    const/4 v9, 0x1

    goto :goto_1

    :cond_2
    const/4 v9, 0x0

    :goto_1
    const-wide/16 v11, 0x1

    const-wide/16 v13, 0x0

    if-eqz v0, :cond_7

    move-wide v7, v13

    move-wide v15, v7

    :goto_2
    cmp-long v17, v5, v13

    if-eqz v17, :cond_5

    invoke-interface {v0}, LDg/f;->poll()Ljava/lang/Object;

    move-result-object v10

    invoke-virtual/range {p0 .. p0}, Lqg/w$b;->d()Z

    move-result v18

    if-eqz v18, :cond_3

    return-void

    :cond_3
    if-nez v10, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v2, v10}, LDj/b;->h(Ljava/lang/Object;)V

    add-long/2addr v15, v11

    add-long/2addr v7, v11

    sub-long/2addr v5, v11

    goto :goto_2

    :cond_5
    :goto_3
    cmp-long v0, v7, v13

    if-eqz v0, :cond_8

    if-eqz v9, :cond_6

    const-wide v5, 0x7fffffffffffffffL

    goto :goto_4

    :cond_6
    iget-object v0, v1, Lqg/w$b;->k:Ljava/util/concurrent/atomic/AtomicLong;

    neg-long v5, v7

    invoke-virtual {v0, v5, v6}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    move-result-wide v5

    goto :goto_4

    :cond_7
    move-wide v15, v13

    :cond_8
    :goto_4
    iget-boolean v0, v1, Lqg/w$b;->g:Z

    iget-object v7, v1, Lqg/w$b;->f:LDg/f;

    iget-object v8, v1, Lqg/w$b;->j:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v8}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, [Lqg/w$a;

    array-length v10, v8

    if-eqz v0, :cond_a

    if-eqz v7, :cond_9

    invoke-interface {v7}, LDg/g;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_a

    :cond_9
    if-nez v10, :cond_a

    iget-object v0, v1, Lqg/w$b;->h:Lzg/c;

    iget-object v2, v1, Lqg/w$b;->a:LDj/b;

    invoke-virtual {v0, v2}, Lzg/c;->j(LDj/b;)V

    return-void

    :cond_a
    move/from16 v18, v4

    if-eqz v10, :cond_22

    iget-wide v3, v1, Lqg/w$b;->n:J

    iget v0, v1, Lqg/w$b;->o:I

    if-le v10, v0, :cond_b

    aget-object v7, v8, v0

    iget-wide v11, v7, Lqg/w$a;->a:J

    cmp-long v7, v11, v3

    if-eqz v7, :cond_10

    :cond_b
    if-gt v10, v0, :cond_c

    const/4 v0, 0x0

    :cond_c
    const/4 v7, 0x0

    :goto_5
    if-ge v7, v10, :cond_f

    aget-object v11, v8, v0

    iget-wide v11, v11, Lqg/w$a;->a:J

    cmp-long v11, v11, v3

    if-nez v11, :cond_d

    goto :goto_6

    :cond_d
    add-int/lit8 v0, v0, 0x1

    if-ne v0, v10, :cond_e

    const/4 v0, 0x0

    :cond_e
    add-int/lit8 v7, v7, 0x1

    goto :goto_5

    :cond_f
    :goto_6
    iput v0, v1, Lqg/w$b;->o:I

    aget-object v3, v8, v0

    iget-wide v3, v3, Lqg/w$a;->a:J

    iput-wide v3, v1, Lqg/w$b;->n:J

    :cond_10
    move v3, v0

    const/4 v0, 0x0

    const/4 v4, 0x0

    :goto_7
    if-ge v4, v10, :cond_21

    invoke-virtual/range {p0 .. p0}, Lqg/w$b;->d()Z

    move-result v7

    if-eqz v7, :cond_11

    return-void

    :cond_11
    aget-object v7, v8, v3

    const/4 v11, 0x0

    :goto_8
    iget-object v12, v7, Lqg/w$a;->f:LDg/g;

    if-nez v12, :cond_12

    move/from16 v21, v10

    goto/16 :goto_e

    :cond_12
    move/from16 v21, v10

    move-object/from16 v22, v11

    move-wide v10, v13

    :goto_9
    cmp-long v23, v5, v13

    if-eqz v23, :cond_18

    invoke-virtual/range {p0 .. p0}, Lqg/w$b;->d()Z

    move-result v22

    if-eqz v22, :cond_13

    return-void

    :cond_13
    :try_start_0
    invoke-interface {v12}, LDg/g;->poll()Ljava/lang/Object;

    move-result-object v13
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v13, :cond_14

    move-object/from16 v22, v13

    const-wide/16 v12, 0x0

    goto :goto_b

    :cond_14
    invoke-interface {v2, v13}, LDj/b;->h(Ljava/lang/Object;)V

    const-wide/16 v19, 0x1

    sub-long v5, v5, v19

    add-long v10, v10, v19

    move-object/from16 v22, v13

    const-wide/16 v13, 0x0

    goto :goto_9

    :catchall_0
    move-exception v0

    move-object v10, v0

    invoke-static {v10}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-virtual {v7}, Lqg/w$a;->dispose()V

    iget-object v0, v1, Lqg/w$b;->h:Lzg/c;

    invoke-virtual {v0, v10}, Lzg/c;->g(Ljava/lang/Throwable;)Z

    iget-boolean v0, v1, Lqg/w$b;->c:Z

    if-nez v0, :cond_15

    iget-object v0, v1, Lqg/w$b;->l:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    :cond_15
    invoke-virtual/range {p0 .. p0}, Lqg/w$b;->d()Z

    move-result v0

    if-eqz v0, :cond_16

    return-void

    :cond_16
    invoke-virtual {v1, v7}, Lqg/w$b;->s(Lqg/w$a;)V

    add-int/lit8 v4, v4, 0x1

    move/from16 v7, v21

    const/4 v0, 0x1

    const-wide/16 v10, 0x1

    :cond_17
    :goto_a
    const/4 v12, 0x1

    goto/16 :goto_11

    :cond_18
    move-wide v12, v13

    :goto_b
    cmp-long v14, v10, v12

    if-eqz v14, :cond_1a

    if-nez v9, :cond_19

    iget-object v5, v1, Lqg/w$b;->k:Ljava/util/concurrent/atomic/AtomicLong;

    neg-long v12, v10

    invoke-virtual {v5, v12, v13}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    move-result-wide v5

    goto :goto_c

    :cond_19
    const-wide v5, 0x7fffffffffffffffL

    :goto_c
    invoke-virtual {v7, v10, v11}, Lqg/w$a;->c(J)V

    const-wide/16 v10, 0x0

    goto :goto_d

    :cond_1a
    move-wide v10, v12

    :goto_d
    cmp-long v12, v5, v10

    if-eqz v12, :cond_1c

    if-nez v22, :cond_1b

    goto :goto_e

    :cond_1b
    move/from16 v10, v21

    move-object/from16 v11, v22

    const-wide/16 v13, 0x0

    goto/16 :goto_8

    :cond_1c
    :goto_e
    iget-boolean v10, v7, Lqg/w$a;->e:Z

    iget-object v11, v7, Lqg/w$a;->f:LDg/g;

    if-eqz v10, :cond_1d

    if-eqz v11, :cond_1e

    invoke-interface {v11}, LDg/g;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_1d

    goto :goto_f

    :cond_1d
    const-wide/16 v10, 0x1

    goto :goto_10

    :cond_1e
    :goto_f
    invoke-virtual {v1, v7}, Lqg/w$b;->s(Lqg/w$a;)V

    invoke-virtual/range {p0 .. p0}, Lqg/w$b;->d()Z

    move-result v0

    if-eqz v0, :cond_1f

    return-void

    :cond_1f
    const-wide/16 v10, 0x1

    add-long/2addr v15, v10

    const/4 v0, 0x1

    :goto_10
    const-wide/16 v12, 0x0

    cmp-long v7, v5, v12

    if-nez v7, :cond_20

    move v10, v0

    const/4 v12, 0x1

    goto :goto_12

    :cond_20
    add-int/lit8 v3, v3, 0x1

    move/from16 v7, v21

    if-ne v3, v7, :cond_17

    const/4 v3, 0x0

    goto :goto_a

    :goto_11
    add-int/2addr v4, v12

    move v10, v7

    const-wide/16 v13, 0x0

    goto/16 :goto_7

    :cond_21
    const/4 v12, 0x1

    move v10, v0

    :goto_12
    iput v3, v1, Lqg/w$b;->o:I

    aget-object v0, v8, v3

    iget-wide v3, v0, Lqg/w$a;->a:J

    iput-wide v3, v1, Lqg/w$b;->n:J

    move-wide v3, v15

    const-wide/16 v5, 0x0

    goto :goto_13

    :cond_22
    const/4 v12, 0x1

    move-wide v5, v13

    move-wide v3, v15

    const/4 v10, 0x0

    :goto_13
    cmp-long v0, v3, v5

    if-eqz v0, :cond_23

    iget-boolean v0, v1, Lqg/w$b;->i:Z

    if-nez v0, :cond_23

    iget-object v0, v1, Lqg/w$b;->l:LDj/c;

    invoke-interface {v0, v3, v4}, LDj/c;->request(J)V

    :cond_23
    if-eqz v10, :cond_24

    move/from16 v4, v18

    goto/16 :goto_0

    :cond_24
    move/from16 v3, v18

    neg-int v0, v3

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v4

    if-nez v4, :cond_0

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 3

    iget-boolean v0, p0, Lqg/w$b;->g:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iget-object v0, p0, Lqg/w$b;->h:Lzg/c;

    invoke-virtual {v0, p1}, Lzg/c;->g(Ljava/lang/Throwable;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    iput-boolean p1, p0, Lqg/w$b;->g:Z

    iget-boolean p1, p0, Lqg/w$b;->c:Z

    if-nez p1, :cond_1

    iget-object p1, p0, Lqg/w$b;->j:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v0, Lqg/w$b;->s:[Lqg/w$a;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lqg/w$a;

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    invoke-virtual {v2}, Lqg/w$a;->dispose()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lqg/w$b;->n()V

    :cond_2
    return-void
.end method

.method p()LDg/g;
    .locals 2

    iget-object v0, p0, Lqg/w$b;->f:LDg/f;

    if-nez v0, :cond_1

    iget v0, p0, Lqg/w$b;->d:I

    const v1, 0x7fffffff

    if-ne v0, v1, :cond_0

    new-instance v0, LDg/i;

    iget v1, p0, Lqg/w$b;->e:I

    invoke-direct {v0, v1}, LDg/i;-><init>(I)V

    goto :goto_0

    :cond_0
    new-instance v0, LDg/h;

    iget v1, p0, Lqg/w$b;->d:I

    invoke-direct {v0, v1}, LDg/h;-><init>(I)V

    :goto_0
    iput-object v0, p0, Lqg/w$b;->f:LDg/f;

    :cond_1
    return-object v0
.end method

.method r(Lqg/w$a;Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lqg/w$b;->h:Lzg/c;

    invoke-virtual {v0, p2}, Lzg/c;->g(Ljava/lang/Throwable;)Z

    move-result p2

    if-eqz p2, :cond_1

    const/4 p2, 0x1

    iput-boolean p2, p1, Lqg/w$a;->e:Z

    iget-boolean p1, p0, Lqg/w$b;->c:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lqg/w$b;->l:LDj/c;

    invoke-interface {p1}, LDj/c;->cancel()V

    iget-object p1, p0, Lqg/w$b;->j:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object p2, Lqg/w$b;->s:[Lqg/w$a;

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lqg/w$a;

    array-length p2, p1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_0

    aget-object v1, p1, v0

    invoke-virtual {v1}, Lqg/w$a;->dispose()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lqg/w$b;->n()V

    :cond_1
    return-void
.end method

.method public request(J)V
    .locals 1

    invoke-static {p1, p2}, Lyg/g;->validate(J)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqg/w$b;->k:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v0, p1, p2}, Lzg/d;->a(Ljava/util/concurrent/atomic/AtomicLong;J)J

    invoke-virtual {p0}, Lqg/w$b;->n()V

    :cond_0
    return-void
.end method

.method s(Lqg/w$a;)V
    .locals 6

    :cond_0
    iget-object v0, p0, Lqg/w$b;->j:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lqg/w$a;

    array-length v1, v0

    if-nez v1, :cond_1

    return-void

    :cond_1
    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_3

    aget-object v4, v0, v3

    if-ne v4, p1, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    const/4 v3, -0x1

    :goto_1
    if-gez v3, :cond_4

    return-void

    :cond_4
    const/4 v4, 0x1

    if-ne v1, v4, :cond_5

    sget-object v1, Lqg/w$b;->r:[Lqg/w$a;

    goto :goto_2

    :cond_5
    add-int/lit8 v5, v1, -0x1

    new-array v5, v5, [Lqg/w$a;

    invoke-static {v0, v2, v5, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v2, v3, 0x1

    sub-int/2addr v1, v3

    sub-int/2addr v1, v4

    invoke-static {v0, v2, v5, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v1, v5

    :goto_2
    iget-object v2, p0, Lqg/w$b;->j:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v2, v0, v1}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void
.end method

.method t(Ljava/lang/Object;Lqg/w$a;)V
    .locals 5

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-nez v0, :cond_5

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lqg/w$b;->k:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    iget-object v2, p2, Lqg/w$a;->f:LDg/g;

    const-wide/16 v3, 0x0

    cmp-long v3, v0, v3

    if-eqz v3, :cond_2

    if-eqz v2, :cond_0

    invoke-interface {v2}, LDg/g;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    :cond_0
    iget-object v2, p0, Lqg/w$b;->a:LDj/b;

    invoke-interface {v2, p1}, LDj/b;->h(Ljava/lang/Object;)V

    const-wide v2, 0x7fffffffffffffffL

    cmp-long p1, v0, v2

    if-eqz p1, :cond_1

    iget-object p1, p0, Lqg/w$b;->k:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->decrementAndGet()J

    :cond_1
    const-wide/16 v0, 0x1

    invoke-virtual {p2, v0, v1}, Lqg/w$a;->c(J)V

    goto :goto_0

    :cond_2
    if-nez v2, :cond_3

    new-instance v2, LDg/h;

    iget v0, p0, Lqg/w$b;->e:I

    invoke-direct {v2, v0}, LDg/h;-><init>(I)V

    iput-object v2, p2, Lqg/w$a;->f:LDg/g;

    :cond_3
    invoke-interface {v2, p1}, LDg/g;->offer(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    new-instance p1, Lio/reactivex/rxjava3/exceptions/QueueOverflowException;

    invoke-direct {p1}, Lio/reactivex/rxjava3/exceptions/QueueOverflowException;-><init>()V

    invoke-virtual {p0, p1}, Lqg/w$b;->onError(Ljava/lang/Throwable;)V

    :cond_4
    :goto_0
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result p1

    if-nez p1, :cond_8

    return-void

    :cond_5
    iget-object v0, p2, Lqg/w$a;->f:LDg/g;

    if-nez v0, :cond_6

    new-instance v0, LDg/h;

    iget v1, p0, Lqg/w$b;->e:I

    invoke-direct {v0, v1}, LDg/h;-><init>(I)V

    iput-object v0, p2, Lqg/w$a;->f:LDg/g;

    :cond_6
    invoke-interface {v0, p1}, LDg/g;->offer(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    new-instance p1, Lio/reactivex/rxjava3/exceptions/QueueOverflowException;

    invoke-direct {p1}, Lio/reactivex/rxjava3/exceptions/QueueOverflowException;-><init>()V

    invoke-virtual {p0, p1}, Lqg/w$b;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_7
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p1

    if-eqz p1, :cond_8

    return-void

    :cond_8
    invoke-virtual {p0}, Lqg/w$b;->o()V

    return-void
.end method

.method v(Ljava/lang/Object;)V
    .locals 7

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-nez v0, :cond_5

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, p0, Lqg/w$b;->k:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v2

    iget-object v4, p0, Lqg/w$b;->f:LDg/f;

    const-wide/16 v5, 0x0

    cmp-long v5, v2, v5

    if-eqz v5, :cond_2

    if-eqz v4, :cond_0

    invoke-interface {v4}, LDg/g;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_2

    :cond_0
    iget-object v4, p0, Lqg/w$b;->a:LDj/b;

    invoke-interface {v4, p1}, LDj/b;->h(Ljava/lang/Object;)V

    const-wide v4, 0x7fffffffffffffffL

    cmp-long p1, v2, v4

    if-eqz p1, :cond_1

    iget-object p1, p0, Lqg/w$b;->k:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->decrementAndGet()J

    :cond_1
    iget p1, p0, Lqg/w$b;->d:I

    const v2, 0x7fffffff

    if-eq p1, v2, :cond_4

    iget-boolean p1, p0, Lqg/w$b;->i:Z

    if-nez p1, :cond_4

    iget p1, p0, Lqg/w$b;->p:I

    add-int/2addr p1, v1

    iput p1, p0, Lqg/w$b;->p:I

    iget v1, p0, Lqg/w$b;->q:I

    if-ne p1, v1, :cond_4

    iput v0, p0, Lqg/w$b;->p:I

    iget-object p1, p0, Lqg/w$b;->l:LDj/c;

    int-to-long v0, v1

    invoke-interface {p1, v0, v1}, LDj/c;->request(J)V

    goto :goto_0

    :cond_2
    if-nez v4, :cond_3

    invoke-virtual {p0}, Lqg/w$b;->p()LDg/g;

    move-result-object v4

    :cond_3
    invoke-interface {v4, p1}, LDg/g;->offer(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    new-instance p1, Lio/reactivex/rxjava3/exceptions/QueueOverflowException;

    invoke-direct {p1}, Lio/reactivex/rxjava3/exceptions/QueueOverflowException;-><init>()V

    invoke-virtual {p0, p1}, Lqg/w$b;->onError(Ljava/lang/Throwable;)V

    :cond_4
    :goto_0
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result p1

    if-nez p1, :cond_7

    return-void

    :cond_5
    invoke-virtual {p0}, Lqg/w$b;->p()LDg/g;

    move-result-object v0

    invoke-interface {v0, p1}, LDg/g;->offer(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    new-instance p1, Lio/reactivex/rxjava3/exceptions/QueueOverflowException;

    invoke-direct {p1}, Lio/reactivex/rxjava3/exceptions/QueueOverflowException;-><init>()V

    invoke-virtual {p0, p1}, Lqg/w$b;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_6
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p1

    if-eqz p1, :cond_7

    return-void

    :cond_7
    invoke-virtual {p0}, Lqg/w$b;->o()V

    return-void
.end method
