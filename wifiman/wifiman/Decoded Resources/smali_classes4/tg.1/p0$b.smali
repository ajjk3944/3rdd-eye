.class final Ltg/p0$b;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lgg/x;
.implements Lhg/c;
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltg/p0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# static fields
.field static final k:Ljava/lang/Object;


# instance fields
.field final a:Lgg/x;

.field final b:I

.field final c:Ltg/p0$a;

.field final d:Ljava/util/concurrent/atomic/AtomicReference;

.field final e:Ljava/util/concurrent/atomic/AtomicInteger;

.field final f:Lvg/a;

.field final g:Lzg/c;

.field final h:Ljava/util/concurrent/atomic/AtomicBoolean;

.field volatile i:Z

.field j:LHg/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ltg/p0$b;->k:Ljava/lang/Object;

    return-void
.end method

.method constructor <init>(Lgg/x;I)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Ltg/p0$b;->a:Lgg/x;

    iput p2, p0, Ltg/p0$b;->b:I

    new-instance p1, Ltg/p0$a;

    invoke-direct {p1, p0}, Ltg/p0$a;-><init>(Ltg/p0$b;)V

    iput-object p1, p0, Ltg/p0$b;->c:Ltg/p0$a;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Ltg/p0$b;->d:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p1, p0, Ltg/p0$b;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance p1, Lvg/a;

    invoke-direct {p1}, Lvg/a;-><init>()V

    iput-object p1, p0, Ltg/p0$b;->f:Lvg/a;

    new-instance p1, Lzg/c;

    invoke-direct {p1}, Lzg/c;-><init>()V

    iput-object p1, p0, Ltg/p0$b;->g:Lzg/c;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object p1, p0, Ltg/p0$b;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Ltg/p0$b;->c:Ltg/p0$a;

    invoke-virtual {v0}, LCg/a;->dispose()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Ltg/p0$b;->i:Z

    invoke-virtual {p0}, Ltg/p0$b;->d()V

    return-void
.end method

.method public c(Lhg/c;)V
    .locals 1

    iget-object v0, p0, Ltg/p0$b;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0, p1}, Llg/b;->setOnce(Ljava/util/concurrent/atomic/AtomicReference;Lhg/c;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Ltg/p0$b;->m()V

    :cond_0
    return-void
.end method

.method d()V
    .locals 10

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ltg/p0$b;->a:Lgg/x;

    iget-object v1, p0, Ltg/p0$b;->f:Lvg/a;

    iget-object v2, p0, Ltg/p0$b;->g:Lzg/c;

    const/4 v3, 0x1

    move v4, v3

    :cond_1
    :goto_0
    iget-object v5, p0, Ltg/p0$b;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v5

    const/4 v6, 0x0

    if-nez v5, :cond_2

    invoke-virtual {v1}, Lvg/a;->clear()V

    iput-object v6, p0, Ltg/p0$b;->j:LHg/e;

    return-void

    :cond_2
    iget-object v5, p0, Ltg/p0$b;->j:LHg/e;

    iget-boolean v7, p0, Ltg/p0$b;->i:Z

    if-eqz v7, :cond_4

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_4

    invoke-virtual {v1}, Lvg/a;->clear()V

    invoke-virtual {v2}, Lzg/c;->c()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v5, :cond_3

    iput-object v6, p0, Ltg/p0$b;->j:LHg/e;

    invoke-virtual {v5, v1}, LHg/e;->onError(Ljava/lang/Throwable;)V

    :cond_3
    invoke-interface {v0, v1}, Lgg/x;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_4
    invoke-virtual {v1}, Lvg/a;->poll()Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_5

    move v9, v3

    goto :goto_1

    :cond_5
    const/4 v9, 0x0

    :goto_1
    if-eqz v7, :cond_9

    if-eqz v9, :cond_9

    invoke-virtual {v2}, Lzg/c;->c()Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_7

    if-eqz v5, :cond_6

    iput-object v6, p0, Ltg/p0$b;->j:LHg/e;

    invoke-virtual {v5}, LHg/e;->a()V

    :cond_6
    invoke-interface {v0}, Lgg/x;->a()V

    goto :goto_2

    :cond_7
    if-eqz v5, :cond_8

    iput-object v6, p0, Ltg/p0$b;->j:LHg/e;

    invoke-virtual {v5, v1}, LHg/e;->onError(Ljava/lang/Throwable;)V

    :cond_8
    invoke-interface {v0, v1}, Lgg/x;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void

    :cond_9
    if-eqz v9, :cond_a

    neg-int v4, v4

    invoke-virtual {p0, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v4

    if-nez v4, :cond_1

    return-void

    :cond_a
    sget-object v7, Ltg/p0$b;->k:Ljava/lang/Object;

    if-eq v8, v7, :cond_b

    invoke-virtual {v5, v8}, LHg/e;->h(Ljava/lang/Object;)V

    goto :goto_0

    :cond_b
    if-eqz v5, :cond_c

    iput-object v6, p0, Ltg/p0$b;->j:LHg/e;

    invoke-virtual {v5}, LHg/e;->a()V

    :cond_c
    iget-object v5, p0, Ltg/p0$b;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v5

    if-nez v5, :cond_1

    iget v5, p0, Ltg/p0$b;->b:I

    invoke-static {v5, p0}, LHg/e;->j1(ILjava/lang/Runnable;)LHg/e;

    move-result-object v5

    iput-object v5, p0, Ltg/p0$b;->j:LHg/e;

    iget-object v6, p0, Ltg/p0$b;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    new-instance v6, Ltg/q0;

    invoke-direct {v6, v5}, Ltg/q0;-><init>(LHg/d;)V

    invoke-interface {v0, v6}, Lgg/x;->h(Ljava/lang/Object;)V

    invoke-virtual {v6}, Ltg/q0;->i1()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-virtual {v5}, LHg/e;->a()V

    goto/16 :goto_0
.end method

.method public dispose()V
    .locals 3

    iget-object v0, p0, Ltg/p0$b;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ltg/p0$b;->c:Ltg/p0$a;

    invoke-virtual {v0}, LCg/a;->dispose()V

    iget-object v0, p0, Ltg/p0$b;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ltg/p0$b;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0}, Llg/b;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    :cond_0
    return-void
.end method

.method g()V
    .locals 1

    iget-object v0, p0, Ltg/p0$b;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0}, Llg/b;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Ltg/p0$b;->i:Z

    invoke-virtual {p0}, Ltg/p0$b;->d()V

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Ltg/p0$b;->f:Lvg/a;

    invoke-virtual {v0, p1}, Lvg/a;->offer(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Ltg/p0$b;->d()V

    return-void
.end method

.method public isDisposed()Z
    .locals 1

    iget-object v0, p0, Ltg/p0$b;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method j(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Ltg/p0$b;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0}, Llg/b;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    iget-object v0, p0, Ltg/p0$b;->g:Lzg/c;

    invoke-virtual {v0, p1}, Lzg/c;->g(Ljava/lang/Throwable;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Ltg/p0$b;->i:Z

    invoke-virtual {p0}, Ltg/p0$b;->d()V

    :cond_0
    return-void
.end method

.method m()V
    .locals 2

    iget-object v0, p0, Ltg/p0$b;->f:Lvg/a;

    sget-object v1, Ltg/p0$b;->k:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lvg/a;->offer(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Ltg/p0$b;->d()V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Ltg/p0$b;->c:Ltg/p0$a;

    invoke-virtual {v0}, LCg/a;->dispose()V

    iget-object v0, p0, Ltg/p0$b;->g:Lzg/c;

    invoke-virtual {v0, p1}, Lzg/c;->g(Ljava/lang/Throwable;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Ltg/p0$b;->i:Z

    invoke-virtual {p0}, Ltg/p0$b;->d()V

    :cond_0
    return-void
.end method

.method public run()V
    .locals 1

    iget-object v0, p0, Ltg/p0$b;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ltg/p0$b;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0}, Llg/b;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    :cond_0
    return-void
.end method
