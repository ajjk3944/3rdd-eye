.class abstract Lqg/g$b;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lgg/l;
.implements Lqg/g$f;
.implements LDj/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "b"
.end annotation


# instance fields
.field final a:Lqg/g$e;

.field final b:Lkg/n;

.field final c:I

.field final d:I

.field e:LDj/c;

.field f:I

.field g:LDg/g;

.field volatile h:Z

.field volatile i:Z

.field final j:Lzg/c;

.field volatile k:Z

.field l:I


# direct methods
.method constructor <init>(Lkg/n;I)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Lqg/g$b;->b:Lkg/n;

    iput p2, p0, Lqg/g$b;->c:I

    shr-int/lit8 p1, p2, 0x2

    sub-int/2addr p2, p1

    iput p2, p0, Lqg/g$b;->d:I

    new-instance p1, Lqg/g$e;

    invoke-direct {p1, p0}, Lqg/g$e;-><init>(Lqg/g$f;)V

    iput-object p1, p0, Lqg/g$b;->a:Lqg/g$e;

    new-instance p1, Lzg/c;

    invoke-direct {p1}, Lzg/c;-><init>()V

    iput-object p1, p0, Lqg/g$b;->j:Lzg/c;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg/g$b;->h:Z

    invoke-virtual {p0}, Lqg/g$b;->l()V

    return-void
.end method

.method public final d()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lqg/g$b;->k:Z

    invoke-virtual {p0}, Lqg/g$b;->l()V

    return-void
.end method

.method public final h(Ljava/lang/Object;)V
    .locals 2

    iget v0, p0, Lqg/g$b;->l:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lqg/g$b;->g:LDg/g;

    invoke-interface {v0, p1}, LDg/g;->offer(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lqg/g$b;->e:LDj/c;

    invoke-interface {p1}, LDj/c;->cancel()V

    new-instance p1, Lio/reactivex/rxjava3/exceptions/QueueOverflowException;

    invoke-direct {p1}, Lio/reactivex/rxjava3/exceptions/QueueOverflowException;-><init>()V

    invoke-interface {p0, p1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lqg/g$b;->l()V

    return-void
.end method

.method public final j(LDj/c;)V
    .locals 3

    iget-object v0, p0, Lqg/g$b;->e:LDj/c;

    invoke-static {v0, p1}, Lyg/g;->validate(LDj/c;LDj/c;)Z

    move-result v0

    if-eqz v0, :cond_2

    iput-object p1, p0, Lqg/g$b;->e:LDj/c;

    instance-of v0, p1, LDg/d;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, LDg/d;

    const/4 v1, 0x7

    invoke-interface {v0, v1}, LDg/c;->requestFusion(I)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    iput v1, p0, Lqg/g$b;->l:I

    iput-object v0, p0, Lqg/g$b;->g:LDg/g;

    iput-boolean v2, p0, Lqg/g$b;->h:Z

    invoke-virtual {p0}, Lqg/g$b;->n()V

    invoke-virtual {p0}, Lqg/g$b;->l()V

    return-void

    :cond_0
    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    iput v1, p0, Lqg/g$b;->l:I

    iput-object v0, p0, Lqg/g$b;->g:LDg/g;

    invoke-virtual {p0}, Lqg/g$b;->n()V

    iget v0, p0, Lqg/g$b;->c:I

    int-to-long v0, v0

    invoke-interface {p1, v0, v1}, LDj/c;->request(J)V

    return-void

    :cond_1
    new-instance v0, LDg/h;

    iget v1, p0, Lqg/g$b;->c:I

    invoke-direct {v0, v1}, LDg/h;-><init>(I)V

    iput-object v0, p0, Lqg/g$b;->g:LDg/g;

    invoke-virtual {p0}, Lqg/g$b;->n()V

    iget v0, p0, Lqg/g$b;->c:I

    int-to-long v0, v0

    invoke-interface {p1, v0, v1}, LDj/c;->request(J)V

    :cond_2
    return-void
.end method

.method abstract l()V
.end method

.method abstract n()V
.end method
