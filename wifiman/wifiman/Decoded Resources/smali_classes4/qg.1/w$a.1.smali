.class final Lqg/w$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lgg/l;
.implements Lhg/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:J

.field final b:Lqg/w$b;

.field final c:I

.field final d:I

.field volatile e:Z

.field volatile f:LDg/g;

.field g:J

.field h:I


# direct methods
.method constructor <init>(Lqg/w$b;IJ)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-wide p3, p0, Lqg/w$a;->a:J

    iput-object p1, p0, Lqg/w$a;->b:Lqg/w$b;

    iput p2, p0, Lqg/w$a;->d:I

    shr-int/lit8 p1, p2, 0x2

    iput p1, p0, Lqg/w$a;->c:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg/w$a;->e:Z

    iget-object v0, p0, Lqg/w$a;->b:Lqg/w$b;

    invoke-virtual {v0}, Lqg/w$b;->n()V

    return-void
.end method

.method c(J)V
    .locals 2

    iget v0, p0, Lqg/w$a;->h:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    iget-wide v0, p0, Lqg/w$a;->g:J

    add-long/2addr v0, p1

    iget p1, p0, Lqg/w$a;->c:I

    int-to-long p1, p1

    cmp-long p1, v0, p1

    if-ltz p1, :cond_0

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lqg/w$a;->g:J

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LDj/c;

    invoke-interface {p1, v0, v1}, LDj/c;->request(J)V

    goto :goto_0

    :cond_0
    iput-wide v0, p0, Lqg/w$a;->g:J

    :cond_1
    :goto_0
    return-void
.end method

.method public dispose()V
    .locals 0

    invoke-static {p0}, Lyg/g;->cancel(Ljava/util/concurrent/atomic/AtomicReference;)Z

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 2

    iget v0, p0, Lqg/w$a;->h:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lqg/w$a;->b:Lqg/w$b;

    invoke-virtual {v0, p1, p0}, Lqg/w$b;->t(Ljava/lang/Object;Lqg/w$a;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lqg/w$a;->b:Lqg/w$b;

    invoke-virtual {p1}, Lqg/w$b;->n()V

    :goto_0
    return-void
.end method

.method public isDisposed()Z
    .locals 2

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lyg/g;->CANCELLED:Lyg/g;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
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

    iput v1, p0, Lqg/w$a;->h:I

    iput-object v0, p0, Lqg/w$a;->f:LDg/g;

    iput-boolean v2, p0, Lqg/w$a;->e:Z

    iget-object p1, p0, Lqg/w$a;->b:Lqg/w$b;

    invoke-virtual {p1}, Lqg/w$b;->n()V

    return-void

    :cond_0
    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    iput v1, p0, Lqg/w$a;->h:I

    iput-object v0, p0, Lqg/w$a;->f:LDg/g;

    :cond_1
    iget v0, p0, Lqg/w$a;->d:I

    int-to-long v0, v0

    invoke-interface {p1, v0, v1}, LDj/c;->request(J)V

    :cond_2
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    sget-object v0, Lyg/g;->CANCELLED:Lyg/g;

    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    iget-object v0, p0, Lqg/w$a;->b:Lqg/w$b;

    invoke-virtual {v0, p0, p1}, Lqg/w$b;->r(Lqg/w$a;Ljava/lang/Throwable;)V

    return-void
.end method
