.class public final LHg/a;
.super LHg/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LHg/a$a;
    }
.end annotation


# static fields
.field static final h:[LHg/a$a;

.field static final i:[LHg/a$a;


# instance fields
.field final a:Ljava/util/concurrent/atomic/AtomicReference;

.field final b:Ljava/util/concurrent/atomic/AtomicReference;

.field final c:Ljava/util/concurrent/locks/ReadWriteLock;

.field final d:Ljava/util/concurrent/locks/Lock;

.field final e:Ljava/util/concurrent/locks/Lock;

.field final f:Ljava/util/concurrent/atomic/AtomicReference;

.field g:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    new-array v1, v0, [LHg/a$a;

    sput-object v1, LHg/a;->h:[LHg/a$a;

    new-array v0, v0, [LHg/a$a;

    sput-object v0, LHg/a;->i:[LHg/a$a;

    return-void
.end method

.method constructor <init>(Ljava/lang/Object;)V
    .locals 2

    invoke-direct {p0}, LHg/d;-><init>()V

    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    iput-object v0, p0, LHg/a;->c:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    iput-object v1, p0, LHg/a;->d:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    iput-object v0, p0, LHg/a;->e:Ljava/util/concurrent/locks/Lock;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, LHg/a;->h:[LHg/a$a;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, LHg/a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, LHg/a;->a:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, LHg/a;->f:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public static k1()LHg/a;
    .locals 2

    new-instance v0, LHg/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LHg/a;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static l1(Ljava/lang/Object;)LHg/a;
    .locals 1

    const-string v0, "defaultValue is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, LHg/a;

    invoke-direct {v0, p0}, LHg/a;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method protected L0(Lgg/x;)V
    .locals 2

    new-instance v0, LHg/a$a;

    invoke-direct {v0, p1, p0}, LHg/a$a;-><init>(Lgg/x;LHg/a;)V

    invoke-interface {p1, v0}, Lgg/x;->c(Lhg/c;)V

    invoke-virtual {p0, v0}, LHg/a;->j1(LHg/a$a;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-boolean p1, v0, LHg/a$a;->g:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0, v0}, LHg/a;->p1(LHg/a$a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LHg/a$a;->a()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, LHg/a;->f:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    sget-object v1, Lzg/h;->a:Ljava/lang/Throwable;

    if-ne v0, v1, :cond_2

    invoke-interface {p1}, Lgg/x;->a()V

    goto :goto_0

    :cond_2
    invoke-interface {p1, v0}, Lgg/x;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public a()V
    .locals 7

    iget-object v0, p0, LHg/a;->f:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    sget-object v2, Lzg/h;->a:Ljava/lang/Throwable;

    invoke-static {v0, v1, v2}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lzg/j;->complete()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, LHg/a;->r1(Ljava/lang/Object;)[LHg/a$a;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    iget-wide v5, p0, LHg/a;->g:J

    invoke-virtual {v4, v0, v5, v6}, LHg/a$a;->c(Ljava/lang/Object;J)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public c(Lhg/c;)V
    .locals 1

    iget-object v0, p0, LHg/a;->f:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lhg/c;->dispose()V

    :cond_0
    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 6

    const-string v0, "onNext called with a null value."

    invoke-static {p1, v0}, Lzg/h;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v0, p0, LHg/a;->f:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {p1}, Lzg/j;->next(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, LHg/a;->q1(Ljava/lang/Object;)V

    iget-object v0, p0, LHg/a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LHg/a$a;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    iget-wide v4, p0, LHg/a;->g:J

    invoke-virtual {v3, p1, v4, v5}, LHg/a$a;->c(Ljava/lang/Object;J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method j1(LHg/a$a;)Z
    .locals 4

    :cond_0
    iget-object v0, p0, LHg/a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LHg/a$a;

    sget-object v1, LHg/a;->i:[LHg/a$a;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    return v2

    :cond_1
    array-length v1, v0

    add-int/lit8 v3, v1, 0x1

    new-array v3, v3, [LHg/a$a;

    invoke-static {v0, v2, v3, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    aput-object p1, v3, v1

    iget-object v1, p0, LHg/a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v1, v0, v3}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1
.end method

.method public m1()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LHg/a;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lzg/j;->isComplete(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v0}, Lzg/j;->isError(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lzg/j;->getValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public n1()Z
    .locals 1

    iget-object v0, p0, LHg/a;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lzg/j;->isComplete(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public o1()Z
    .locals 1

    iget-object v0, p0, LHg/a;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lzg/j;->isError(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 6

    const-string v0, "onError called with a null Throwable."

    invoke-static {p1, v0}, Lzg/h;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v0, p0, LHg/a;->f:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-static {v0, v1, p1}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    invoke-static {p1}, Lzg/j;->error(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, LHg/a;->r1(Ljava/lang/Object;)[LHg/a$a;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    iget-wide v4, p0, LHg/a;->g:J

    invoke-virtual {v3, p1, v4, v5}, LHg/a$a;->c(Ljava/lang/Object;J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method p1(LHg/a$a;)V
    .locals 6

    :cond_0
    iget-object v0, p0, LHg/a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LHg/a$a;

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

    sget-object v1, LHg/a;->h:[LHg/a$a;

    goto :goto_2

    :cond_5
    add-int/lit8 v5, v1, -0x1

    new-array v5, v5, [LHg/a$a;

    invoke-static {v0, v2, v5, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v2, v3, 0x1

    sub-int/2addr v1, v3

    sub-int/2addr v1, v4

    invoke-static {v0, v2, v5, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v1, v5

    :goto_2
    iget-object v2, p0, LHg/a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v2, v0, v1}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void
.end method

.method q1(Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, LHg/a;->e:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    iget-wide v0, p0, LHg/a;->g:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, LHg/a;->g:J

    iget-object v0, p0, LHg/a;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    iget-object p1, p0, LHg/a;->e:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void
.end method

.method r1(Ljava/lang/Object;)[LHg/a$a;
    .locals 1

    invoke-virtual {p0, p1}, LHg/a;->q1(Ljava/lang/Object;)V

    iget-object p1, p0, LHg/a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v0, LHg/a;->i:[LHg/a$a;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [LHg/a$a;

    return-object p1
.end method
