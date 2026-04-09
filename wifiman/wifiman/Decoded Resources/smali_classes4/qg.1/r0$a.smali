.class final Lqg/r0$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lgg/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/r0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:Lqg/r0$b;

.field final b:J

.field final c:I

.field volatile d:LDg/g;

.field volatile e:Z

.field f:I


# direct methods
.method constructor <init>(Lqg/r0$b;JI)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lqg/r0$a;->a:Lqg/r0$b;

    iput-wide p2, p0, Lqg/r0$a;->b:J

    iput p4, p0, Lqg/r0$a;->c:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    iget-object v0, p0, Lqg/r0$a;->a:Lqg/r0$b;

    iget-wide v1, p0, Lqg/r0$a;->b:J

    iget-wide v3, v0, Lqg/r0$b;->k:J

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, p0, Lqg/r0$a;->e:Z

    invoke-virtual {v0}, Lqg/r0$b;->d()V

    :cond_0
    return-void
.end method

.method public c()V
    .locals 0

    invoke-static {p0}, Lyg/g;->cancel(Ljava/util/concurrent/atomic/AtomicReference;)Z

    return-void
.end method

.method public d(J)V
    .locals 2

    iget v0, p0, Lqg/r0$a;->f:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LDj/c;

    invoke-interface {v0, p1, p2}, LDj/c;->request(J)V

    :cond_0
    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 5

    iget-object v0, p0, Lqg/r0$a;->a:Lqg/r0$b;

    iget-wide v1, p0, Lqg/r0$a;->b:J

    iget-wide v3, v0, Lqg/r0$b;->k:J

    cmp-long v1, v1, v3

    if-nez v1, :cond_1

    iget v1, p0, Lqg/r0$a;->f:I

    if-nez v1, :cond_0

    iget-object v1, p0, Lqg/r0$a;->d:LDg/g;

    invoke-interface {v1, p1}, LDg/g;->offer(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    new-instance p1, Lio/reactivex/rxjava3/exceptions/QueueOverflowException;

    invoke-direct {p1}, Lio/reactivex/rxjava3/exceptions/QueueOverflowException;-><init>()V

    invoke-virtual {p0, p1}, Lqg/r0$a;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    invoke-virtual {v0}, Lqg/r0$b;->d()V

    :cond_1
    return-void
.end method

.method public j(LDj/c;)V
    .locals 3

    invoke-static {p0, p1}, Lyg/g;->setOnce(Ljava/util/concurrent/atomic/AtomicReference;LDj/c;)Z

    move-result v0

    if-eqz v0, :cond_2

    instance-of v0, p1, LDg/d;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, LDg/d;

    const/4 v1, 0x7

    invoke-interface {v0, v1}, LDg/c;->requestFusion(I)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    iput v1, p0, Lqg/r0$a;->f:I

    iput-object v0, p0, Lqg/r0$a;->d:LDg/g;

    iput-boolean v2, p0, Lqg/r0$a;->e:Z

    iget-object p1, p0, Lqg/r0$a;->a:Lqg/r0$b;

    invoke-virtual {p1}, Lqg/r0$b;->d()V

    return-void

    :cond_0
    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    iput v1, p0, Lqg/r0$a;->f:I

    iput-object v0, p0, Lqg/r0$a;->d:LDg/g;

    iget v0, p0, Lqg/r0$a;->c:I

    int-to-long v0, v0

    invoke-interface {p1, v0, v1}, LDj/c;->request(J)V

    return-void

    :cond_1
    new-instance v0, LDg/h;

    iget v1, p0, Lqg/r0$a;->c:I

    invoke-direct {v0, v1}, LDg/h;-><init>(I)V

    iput-object v0, p0, Lqg/r0$a;->d:LDg/g;

    iget v0, p0, Lqg/r0$a;->c:I

    int-to-long v0, v0

    invoke-interface {p1, v0, v1}, LDj/c;->request(J)V

    :cond_2
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 5

    iget-object v0, p0, Lqg/r0$a;->a:Lqg/r0$b;

    iget-wide v1, p0, Lqg/r0$a;->b:J

    iget-wide v3, v0, Lqg/r0$b;->k:J

    cmp-long v1, v1, v3

    if-nez v1, :cond_1

    iget-object v1, v0, Lqg/r0$b;->f:Lzg/c;

    invoke-virtual {v1, p1}, Lzg/c;->d(Ljava/lang/Throwable;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-boolean p1, v0, Lqg/r0$b;->d:Z

    const/4 v1, 0x1

    if-nez p1, :cond_0

    iget-object p1, v0, Lqg/r0$b;->h:LDj/c;

    invoke-interface {p1}, LDj/c;->cancel()V

    iput-boolean v1, v0, Lqg/r0$b;->e:Z

    :cond_0
    iput-boolean v1, p0, Lqg/r0$a;->e:Z

    invoke-virtual {v0}, Lqg/r0$b;->d()V

    goto :goto_0

    :cond_1
    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
