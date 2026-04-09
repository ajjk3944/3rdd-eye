.class final Lqg/g0$c;
.super Ljava/util/concurrent/atomic/AtomicLong;
.source "SourceFile"

# interfaces
.implements LDj/c;
.implements Lhg/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "c"
.end annotation


# instance fields
.field final a:Lqg/g0$h;

.field final b:LDj/b;

.field c:Ljava/lang/Object;

.field final d:Ljava/util/concurrent/atomic/AtomicLong;

.field e:Z

.field f:Z


# direct methods
.method constructor <init>(Lqg/g0$h;LDj/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p1, p0, Lqg/g0$c;->a:Lqg/g0$h;

    iput-object p2, p0, Lqg/g0$c;->b:LDj/b;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p1, p0, Lqg/g0$c;->d:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method


# virtual methods
.method a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lqg/g0$c;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public c(J)J
    .locals 0

    invoke-static {p0, p1, p2}, Lzg/d;->e(Ljava/util/concurrent/atomic/AtomicLong;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public cancel()V
    .locals 0

    invoke-virtual {p0}, Lqg/g0$c;->dispose()V

    return-void
.end method

.method public dispose()V
    .locals 4

    const-wide/high16 v0, -0x8000000000000000L

    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;->getAndSet(J)J

    move-result-wide v2

    cmp-long v0, v2, v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqg/g0$c;->a:Lqg/g0$h;

    invoke-virtual {v0, p0}, Lqg/g0$h;->g(Lqg/g0$c;)V

    iget-object v0, p0, Lqg/g0$c;->a:Lqg/g0$h;

    invoke-virtual {v0}, Lqg/g0$h;->d()V

    const/4 v0, 0x0

    iput-object v0, p0, Lqg/g0$c;->c:Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public isDisposed()Z
    .locals 4

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public request(J)V
    .locals 4

    invoke-static {p1, p2}, Lyg/g;->validate(J)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0, p1, p2}, Lzg/d;->b(Ljava/util/concurrent/atomic/AtomicLong;J)J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqg/g0$c;->d:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v0, p1, p2}, Lzg/d;->a(Ljava/util/concurrent/atomic/AtomicLong;J)J

    iget-object p1, p0, Lqg/g0$c;->a:Lqg/g0$h;

    invoke-virtual {p1}, Lqg/g0$h;->d()V

    iget-object p1, p0, Lqg/g0$c;->a:Lqg/g0$h;

    iget-object p1, p1, Lqg/g0$h;->a:Lqg/g0$e;

    invoke-interface {p1, p0}, Lqg/g0$e;->S(Lqg/g0$c;)V

    :cond_0
    return-void
.end method
