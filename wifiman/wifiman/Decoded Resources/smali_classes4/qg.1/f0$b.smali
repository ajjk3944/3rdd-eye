.class final Lqg/f0$b;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lgg/l;
.implements LDj/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/f0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field final a:LDj/a;

.field final b:Ljava/util/concurrent/atomic/AtomicReference;

.field final c:Ljava/util/concurrent/atomic/AtomicLong;

.field d:Lqg/f0$c;


# direct methods
.method constructor <init>(LDj/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Lqg/f0$b;->a:LDj/a;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lqg/f0$b;->b:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p1, p0, Lqg/f0$b;->c:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lqg/f0$b;->d:Lqg/f0$c;

    invoke-virtual {v0}, Lqg/f0$c;->cancel()V

    iget-object v0, p0, Lqg/f0$b;->d:Lqg/f0$c;

    iget-object v0, v0, Lqg/f0$c;->i:LDj/b;

    invoke-interface {v0}, LDj/b;->a()V

    return-void
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, Lqg/f0$b;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0}, Lyg/g;->cancel(Ljava/util/concurrent/atomic/AtomicReference;)Z

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p1

    if-nez p1, :cond_2

    :cond_0
    iget-object p1, p0, Lqg/f0$b;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lyg/g;->CANCELLED:Lyg/g;

    if-ne p1, v0, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Lqg/f0$b;->a:LDj/a;

    iget-object v0, p0, Lqg/f0$b;->d:Lqg/f0$c;

    invoke-interface {p1, v0}, LDj/a;->b(LDj/b;)V

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result p1

    if-nez p1, :cond_0

    :cond_2
    return-void
.end method

.method public j(LDj/c;)V
    .locals 2

    iget-object v0, p0, Lqg/f0$b;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v1, p0, Lqg/f0$b;->c:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v0, v1, p1}, Lyg/g;->deferredSetOnce(Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/atomic/AtomicLong;LDj/c;)Z

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lqg/f0$b;->d:Lqg/f0$c;

    invoke-virtual {v0}, Lqg/f0$c;->cancel()V

    iget-object v0, p0, Lqg/f0$b;->d:Lqg/f0$c;

    iget-object v0, v0, Lqg/f0$c;->i:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public request(J)V
    .locals 2

    iget-object v0, p0, Lqg/f0$b;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v1, p0, Lqg/f0$b;->c:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v0, v1, p1, p2}, Lyg/g;->deferredRequest(Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/atomic/AtomicLong;J)V

    return-void
.end method
