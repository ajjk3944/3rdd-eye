.class final Ltg/v$b;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lhg/c;
.implements Lgg/x;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltg/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# static fields
.field static final p:[Ltg/v$a;

.field static final q:[Ltg/v$a;


# instance fields
.field final a:Lgg/x;

.field final b:Lkg/n;

.field final c:Z

.field final d:I

.field final e:I

.field volatile f:LDg/f;

.field volatile g:Z

.field final h:Lzg/c;

.field volatile i:Z

.field final j:Ljava/util/concurrent/atomic/AtomicReference;

.field k:Lhg/c;

.field l:J

.field m:I

.field n:Ljava/util/Queue;

.field o:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    new-array v1, v0, [Ltg/v$a;

    sput-object v1, Ltg/v$b;->p:[Ltg/v$a;

    new-array v0, v0, [Ltg/v$a;

    sput-object v0, Ltg/v$b;->q:[Ltg/v$a;

    return-void
.end method

.method constructor <init>(Lgg/x;Lkg/n;ZII)V
    .locals 1

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    new-instance v0, Lzg/c;

    invoke-direct {v0}, Lzg/c;-><init>()V

    iput-object v0, p0, Ltg/v$b;->h:Lzg/c;

    iput-object p1, p0, Ltg/v$b;->a:Lgg/x;

    iput-object p2, p0, Ltg/v$b;->b:Lkg/n;

    iput-boolean p3, p0, Ltg/v$b;->c:Z

    iput p4, p0, Ltg/v$b;->d:I

    iput p5, p0, Ltg/v$b;->e:I

    const p1, 0x7fffffff

    if-eq p4, p1, :cond_0

    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1, p4}, Ljava/util/ArrayDeque;-><init>(I)V

    iput-object p1, p0, Ltg/v$b;->n:Ljava/util/Queue;

    :cond_0
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object p2, Ltg/v$b;->p:[Ltg/v$a;

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Ltg/v$b;->j:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method B(Lkg/q;)Z
    .locals 4

    const/4 v0, 0x1

    :try_start_0
    invoke-interface {p1}, Lkg/q;->get()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    invoke-virtual {p0, v2, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ltg/v$b;->a:Lgg/x;

    invoke-interface {v1, p1}, Lgg/x;->h(Ljava/lang/Object;)V

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result p1

    if-nez p1, :cond_4

    return v0

    :cond_1
    iget-object v1, p0, Ltg/v$b;->f:LDg/f;

    if-nez v1, :cond_3

    iget v1, p0, Ltg/v$b;->d:I

    const v3, 0x7fffffff

    if-ne v1, v3, :cond_2

    new-instance v1, LDg/i;

    iget v3, p0, Ltg/v$b;->e:I

    invoke-direct {v1, v3}, LDg/i;-><init>(I)V

    goto :goto_0

    :cond_2
    new-instance v1, LDg/h;

    iget v3, p0, Ltg/v$b;->d:I

    invoke-direct {v1, v3}, LDg/h;-><init>(I)V

    :goto_0
    iput-object v1, p0, Ltg/v$b;->f:LDg/f;

    :cond_3
    invoke-interface {v1, p1}, LDg/g;->offer(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p1

    if-eqz p1, :cond_4

    return v2

    :cond_4
    invoke-virtual {p0}, Ltg/v$b;->o()V

    return v0

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lig/a;->b(Ljava/lang/Throwable;)V

    iget-object v1, p0, Ltg/v$b;->h:Lzg/c;

    invoke-virtual {v1, p1}, Lzg/c;->g(Ljava/lang/Throwable;)Z

    invoke-virtual {p0}, Ltg/v$b;->m()V

    return v0
.end method

.method public a()V
    .locals 1

    iget-boolean v0, p0, Ltg/v$b;->g:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Ltg/v$b;->g:Z

    invoke-virtual {p0}, Ltg/v$b;->m()V

    return-void
.end method

.method public c(Lhg/c;)V
    .locals 1

    iget-object v0, p0, Ltg/v$b;->k:Lhg/c;

    invoke-static {v0, p1}, Llg/b;->validate(Lhg/c;Lhg/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Ltg/v$b;->k:Lhg/c;

    iget-object p1, p0, Ltg/v$b;->a:Lgg/x;

    invoke-interface {p1, p0}, Lgg/x;->c(Lhg/c;)V

    :cond_0
    return-void
.end method

.method d(Ltg/v$a;)Z
    .locals 4

    :cond_0
    iget-object v0, p0, Ltg/v$b;->j:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ltg/v$a;

    sget-object v1, Ltg/v$b;->q:[Ltg/v$a;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Ltg/v$a;->d()V

    return v2

    :cond_1
    array-length v1, v0

    add-int/lit8 v3, v1, 0x1

    new-array v3, v3, [Ltg/v$a;

    invoke-static {v0, v2, v3, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    aput-object p1, v3, v1

    iget-object v1, p0, Ltg/v$b;->j:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v1, v0, v3}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1
.end method

.method public dispose()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ltg/v$b;->i:Z

    invoke-virtual {p0}, Ltg/v$b;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ltg/v$b;->h:Lzg/c;

    invoke-virtual {v0}, Lzg/c;->h()V

    :cond_0
    return-void
.end method

.method g()Z
    .locals 3

    iget-boolean v0, p0, Ltg/v$b;->i:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Ltg/v$b;->h:Lzg/c;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    iget-boolean v2, p0, Ltg/v$b;->c:Z

    if-nez v2, :cond_1

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ltg/v$b;->j()Z

    iget-object v0, p0, Ltg/v$b;->h:Lzg/c;

    iget-object v2, p0, Ltg/v$b;->a:Lgg/x;

    invoke-virtual {v0, v2}, Lzg/c;->n(Lgg/x;)V

    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public h(Ljava/lang/Object;)V
    .locals 2

    iget-boolean v0, p0, Ltg/v$b;->g:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Ltg/v$b;->b:Lkg/n;

    invoke-interface {v0, p1}, Lkg/n;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "The mapper returned a null ObservableSource"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, Lgg/v;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    iget v0, p0, Ltg/v$b;->d:I

    const v1, 0x7fffffff

    if-eq v0, v1, :cond_2

    monitor-enter p0

    :try_start_1
    iget v0, p0, Ltg/v$b;->o:I

    iget v1, p0, Ltg/v$b;->d:I

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Ltg/v$b;->n:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ltg/v$b;->o:I

    monitor-exit p0

    goto :goto_1

    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_2
    :goto_1
    invoke-virtual {p0, p1}, Ltg/v$b;->t(Lgg/v;)V

    return-void

    :catchall_1
    move-exception p1

    invoke-static {p1}, Lig/a;->b(Ljava/lang/Throwable;)V

    iget-object v0, p0, Ltg/v$b;->k:Lhg/c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    invoke-virtual {p0, p1}, Ltg/v$b;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public isDisposed()Z
    .locals 1

    iget-boolean v0, p0, Ltg/v$b;->i:Z

    return v0
.end method

.method j()Z
    .locals 4

    iget-object v0, p0, Ltg/v$b;->k:Lhg/c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    iget-object v0, p0, Ltg/v$b;->j:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Ltg/v$b;->q:[Ltg/v$a;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ltg/v$a;

    const/4 v2, 0x0

    if-eq v0, v1, :cond_1

    array-length v1, v0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Ltg/v$a;->d()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    return v2
.end method

.method m()V
    .locals 1

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ltg/v$b;->o()V

    :cond_0
    return-void
.end method

.method o()V
    .locals 12

    iget-object v0, p0, Ltg/v$b;->a:Lgg/x;

    const/4 v1, 0x1

    :cond_0
    :goto_0
    invoke-virtual {p0}, Ltg/v$b;->g()Z

    move-result v2

    if-eqz v2, :cond_1

    return-void

    :cond_1
    iget-object v2, p0, Ltg/v$b;->f:LDg/f;

    const/4 v3, 0x0

    move v4, v3

    if-eqz v2, :cond_4

    :goto_1
    invoke-virtual {p0}, Ltg/v$b;->g()Z

    move-result v5

    if-eqz v5, :cond_2

    return-void

    :cond_2
    invoke-interface {v2}, LDg/f;->poll()Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {v0, v5}, Lgg/x;->h(Ljava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_4
    :goto_2
    const v2, 0x7fffffff

    if-eqz v4, :cond_5

    iget v3, p0, Ltg/v$b;->d:I

    if-eq v3, v2, :cond_0

    invoke-virtual {p0, v4}, Ltg/v$b;->v(I)V

    goto :goto_0

    :cond_5
    iget-boolean v5, p0, Ltg/v$b;->g:Z

    iget-object v6, p0, Ltg/v$b;->f:LDg/f;

    iget-object v7, p0, Ltg/v$b;->j:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, [Ltg/v$a;

    array-length v8, v7

    iget v9, p0, Ltg/v$b;->d:I

    if-eq v9, v2, :cond_6

    monitor-enter p0

    :try_start_0
    iget-object v9, p0, Ltg/v$b;->n:Ljava/util/Queue;

    invoke-interface {v9}, Ljava/util/Collection;->size()I

    move-result v9

    monitor-exit p0

    goto :goto_3

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_6
    move v9, v3

    :goto_3
    if-eqz v5, :cond_8

    if-eqz v6, :cond_7

    invoke-interface {v6}, LDg/g;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_8

    :cond_7
    if-nez v8, :cond_8

    if-nez v9, :cond_8

    iget-object v0, p0, Ltg/v$b;->h:Lzg/c;

    iget-object v1, p0, Ltg/v$b;->a:Lgg/x;

    invoke-virtual {v0, v1}, Lzg/c;->n(Lgg/x;)V

    return-void

    :cond_8
    if-eqz v8, :cond_12

    add-int/lit8 v5, v8, -0x1

    iget v6, p0, Ltg/v$b;->m:I

    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    move-result v5

    move v6, v3

    :goto_4
    if-ge v6, v8, :cond_11

    invoke-virtual {p0}, Ltg/v$b;->g()Z

    move-result v9

    if-eqz v9, :cond_9

    return-void

    :cond_9
    aget-object v9, v7, v5

    iget-object v10, v9, Ltg/v$a;->d:LDg/g;

    if-eqz v10, :cond_d

    :cond_a
    :try_start_1
    invoke-interface {v10}, LDg/g;->poll()Ljava/lang/Object;

    move-result-object v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-nez v11, :cond_b

    goto :goto_5

    :cond_b
    invoke-interface {v0, v11}, Lgg/x;->h(Ljava/lang/Object;)V

    invoke-virtual {p0}, Ltg/v$b;->g()Z

    move-result v11

    if-eqz v11, :cond_a

    return-void

    :catchall_1
    move-exception v10

    invoke-static {v10}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-virtual {v9}, Ltg/v$a;->d()V

    iget-object v11, p0, Ltg/v$b;->h:Lzg/c;

    invoke-virtual {v11, v10}, Lzg/c;->g(Ljava/lang/Throwable;)Z

    invoke-virtual {p0}, Ltg/v$b;->g()Z

    move-result v10

    if-eqz v10, :cond_c

    return-void

    :cond_c
    invoke-virtual {p0, v9}, Ltg/v$b;->s(Ltg/v$a;)V

    add-int/lit8 v4, v4, 0x1

    add-int/lit8 v5, v5, 0x1

    if-ne v5, v8, :cond_10

    goto :goto_6

    :cond_d
    :goto_5
    iget-boolean v10, v9, Ltg/v$a;->c:Z

    iget-object v11, v9, Ltg/v$a;->d:LDg/g;

    if-eqz v10, :cond_f

    if-eqz v11, :cond_e

    invoke-interface {v11}, LDg/g;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_f

    :cond_e
    invoke-virtual {p0, v9}, Ltg/v$b;->s(Ltg/v$a;)V

    add-int/lit8 v4, v4, 0x1

    :cond_f
    add-int/lit8 v5, v5, 0x1

    if-ne v5, v8, :cond_10

    :goto_6
    move v5, v3

    :cond_10
    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    :cond_11
    iput v5, p0, Ltg/v$b;->m:I

    :cond_12
    if-eqz v4, :cond_13

    iget v3, p0, Ltg/v$b;->d:I

    if-eq v3, v2, :cond_0

    invoke-virtual {p0, v4}, Ltg/v$b;->v(I)V

    goto/16 :goto_0

    :cond_13
    neg-int v1, v1

    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v1

    if-nez v1, :cond_0

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-boolean v0, p0, Ltg/v$b;->g:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iget-object v0, p0, Ltg/v$b;->h:Lzg/c;

    invoke-virtual {v0, p1}, Lzg/c;->g(Ljava/lang/Throwable;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, p0, Ltg/v$b;->g:Z

    invoke-virtual {p0}, Ltg/v$b;->m()V

    :cond_1
    return-void
.end method

.method s(Ltg/v$a;)V
    .locals 6

    :cond_0
    iget-object v0, p0, Ltg/v$b;->j:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ltg/v$a;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_2

    aget-object v4, v0, v3

    if-ne v4, p1, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    const/4 v3, -0x1

    :goto_1
    if-gez v3, :cond_3

    return-void

    :cond_3
    const/4 v4, 0x1

    if-ne v1, v4, :cond_4

    sget-object v1, Ltg/v$b;->p:[Ltg/v$a;

    goto :goto_2

    :cond_4
    add-int/lit8 v5, v1, -0x1

    new-array v5, v5, [Ltg/v$a;

    invoke-static {v0, v2, v5, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v2, v3, 0x1

    sub-int/2addr v1, v3

    sub-int/2addr v1, v4

    invoke-static {v0, v2, v5, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v1, v5

    :goto_2
    iget-object v2, p0, Ltg/v$b;->j:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v2, v0, v1}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void
.end method

.method t(Lgg/v;)V
    .locals 5

    :cond_0
    instance-of v0, p1, Lkg/q;

    if-eqz v0, :cond_2

    check-cast p1, Lkg/q;

    invoke-virtual {p0, p1}, Ltg/v$b;->B(Lkg/q;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget p1, p0, Ltg/v$b;->d:I

    const v0, 0x7fffffff

    if-eq p1, v0, :cond_3

    monitor-enter p0

    :try_start_0
    iget-object p1, p0, Ltg/v$b;->n:Ljava/util/Queue;

    invoke-interface {p1}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lgg/v;

    if-nez p1, :cond_1

    iget v0, p0, Ltg/v$b;->o:I

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    iput v0, p0, Ltg/v$b;->o:I

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Ltg/v$b;->m()V

    goto :goto_2

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_2
    new-instance v0, Ltg/v$a;

    iget-wide v1, p0, Ltg/v$b;->l:J

    const-wide/16 v3, 0x1

    add-long/2addr v3, v1

    iput-wide v3, p0, Ltg/v$b;->l:J

    invoke-direct {v0, p0, v1, v2}, Ltg/v$a;-><init>(Ltg/v$b;J)V

    invoke-virtual {p0, v0}, Ltg/v$b;->d(Ltg/v$a;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1, v0}, Lgg/v;->d(Lgg/x;)V

    :cond_3
    :goto_2
    return-void
.end method

.method v(I)V
    .locals 1

    :goto_0
    add-int/lit8 v0, p1, -0x1

    if-eqz p1, :cond_1

    monitor-enter p0

    :try_start_0
    iget-object p1, p0, Ltg/v$b;->n:Ljava/util/Queue;

    invoke-interface {p1}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lgg/v;

    if-nez p1, :cond_0

    iget p1, p0, Ltg/v$b;->o:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ltg/v$b;->o:I

    monitor-exit p0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, p1}, Ltg/v$b;->t(Lgg/v;)V

    :goto_1
    move p1, v0

    goto :goto_0

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_1
    return-void
.end method

.method y(Ljava/lang/Object;Ltg/v$a;)V
    .locals 2

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p2, p0, Ltg/v$b;->a:Lgg/x;

    invoke-interface {p2, p1}, Lgg/x;->h(Ljava/lang/Object;)V

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result p1

    if-nez p1, :cond_2

    return-void

    :cond_0
    iget-object v0, p2, Ltg/v$a;->d:LDg/g;

    if-nez v0, :cond_1

    new-instance v0, LDg/i;

    iget v1, p0, Ltg/v$b;->e:I

    invoke-direct {v0, v1}, LDg/i;-><init>(I)V

    iput-object v0, p2, Ltg/v$a;->d:LDg/g;

    :cond_1
    invoke-interface {v0, p1}, LDg/g;->offer(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p1

    if-eqz p1, :cond_2

    return-void

    :cond_2
    invoke-virtual {p0}, Ltg/v$b;->o()V

    return-void
.end method
