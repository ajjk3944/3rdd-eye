.class public abstract Lsg/c;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lgg/l;


# instance fields
.field final a:Lzg/c;

.field final b:I

.field final c:Lzg/g;

.field d:LDg/g;

.field e:LDj/c;

.field volatile f:Z

.field volatile g:Z

.field h:Z


# direct methods
.method public constructor <init>(ILzg/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p2, p0, Lsg/c;->c:Lzg/g;

    new-instance p2, Lzg/c;

    invoke-direct {p2}, Lzg/c;-><init>()V

    iput-object p2, p0, Lsg/c;->a:Lzg/c;

    iput p1, p0, Lsg/c;->b:I

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lsg/c;->f:Z

    invoke-virtual {p0}, Lsg/c;->g()V

    return-void
.end method

.method c()V
    .locals 0

    return-void
.end method

.method abstract d()V
.end method

.method abstract g()V
.end method

.method public final h(Ljava/lang/Object;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lsg/c;->d:LDg/g;

    invoke-interface {v0, p1}, LDg/g;->offer(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lsg/c;->e:LDj/c;

    invoke-interface {p1}, LDj/c;->cancel()V

    new-instance p1, Lio/reactivex/rxjava3/exceptions/QueueOverflowException;

    invoke-direct {p1}, Lio/reactivex/rxjava3/exceptions/QueueOverflowException;-><init>()V

    invoke-virtual {p0, p1}, Lsg/c;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lsg/c;->g()V

    return-void
.end method

.method public final j(LDj/c;)V
    .locals 2

    iget-object v0, p0, Lsg/c;->e:LDj/c;

    invoke-static {v0, p1}, Lyg/g;->validate(LDj/c;LDj/c;)Z

    move-result v0

    if-eqz v0, :cond_2

    iput-object p1, p0, Lsg/c;->e:LDj/c;

    instance-of v0, p1, LDg/d;

    if-eqz v0, :cond_1

    check-cast p1, LDg/d;

    const/4 v0, 0x7

    invoke-interface {p1, v0}, LDg/c;->requestFusion(I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iput-object p1, p0, Lsg/c;->d:LDg/g;

    iput-boolean v1, p0, Lsg/c;->h:Z

    iput-boolean v1, p0, Lsg/c;->f:Z

    invoke-virtual {p0}, Lsg/c;->o()V

    invoke-virtual {p0}, Lsg/c;->g()V

    return-void

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iput-object p1, p0, Lsg/c;->d:LDg/g;

    invoke-virtual {p0}, Lsg/c;->o()V

    iget-object p1, p0, Lsg/c;->e:LDj/c;

    iget v0, p0, Lsg/c;->b:I

    int-to-long v0, v0

    invoke-interface {p1, v0, v1}, LDj/c;->request(J)V

    return-void

    :cond_1
    new-instance p1, LDg/h;

    iget v0, p0, Lsg/c;->b:I

    invoke-direct {p1, v0}, LDg/h;-><init>(I)V

    iput-object p1, p0, Lsg/c;->d:LDg/g;

    invoke-virtual {p0}, Lsg/c;->o()V

    iget-object p1, p0, Lsg/c;->e:LDj/c;

    iget v0, p0, Lsg/c;->b:I

    int-to-long v0, v0

    invoke-interface {p1, v0, v1}, LDj/c;->request(J)V

    :cond_2
    return-void
.end method

.method abstract o()V
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lsg/c;->a:Lzg/c;

    invoke-virtual {v0, p1}, Lzg/c;->g(Ljava/lang/Throwable;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lsg/c;->c:Lzg/g;

    sget-object v0, Lzg/g;->IMMEDIATE:Lzg/g;

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Lsg/c;->d()V

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lsg/c;->f:Z

    invoke-virtual {p0}, Lsg/c;->g()V

    :cond_1
    return-void
.end method

.method final s()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lsg/c;->g:Z

    iget-object v0, p0, Lsg/c;->e:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    invoke-virtual {p0}, Lsg/c;->d()V

    iget-object v0, p0, Lsg/c;->a:Lzg/c;

    invoke-virtual {v0}, Lzg/c;->h()V

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lsg/c;->d:LDg/g;

    invoke-interface {v0}, LDg/g;->clear()V

    invoke-virtual {p0}, Lsg/c;->c()V

    :cond_0
    return-void
.end method
