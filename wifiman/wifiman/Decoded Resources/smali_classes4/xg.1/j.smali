.class public abstract Lxg/j;
.super Ljava/util/concurrent/atomic/AtomicLong;
.source "SourceFile"

# interfaces
.implements Lgg/l;
.implements LDj/c;


# instance fields
.field protected final a:LDj/b;

.field protected b:LDj/c;

.field protected c:Ljava/lang/Object;

.field protected d:J


# direct methods
.method public constructor <init>(LDj/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p1, p0, Lxg/j;->a:LDj/b;

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 1

    iget-object v0, p0, Lxg/j;->b:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    return-void
.end method

.method protected final d(Ljava/lang/Object;)V
    .locals 8

    iget-wide v0, p0, Lxg/j;->d:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    invoke-static {p0, v0, v1}, Lzg/d;->d(Ljava/util/concurrent/atomic/AtomicLong;J)J

    :cond_0
    :goto_0
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    const-wide/high16 v4, -0x8000000000000000L

    and-long v6, v0, v4

    cmp-long v6, v6, v2

    if-eqz v6, :cond_1

    invoke-virtual {p0, p1}, Lxg/j;->g(Ljava/lang/Object;)V

    return-void

    :cond_1
    const-wide v6, 0x7fffffffffffffffL

    and-long/2addr v0, v6

    cmp-long v0, v0, v2

    if-eqz v0, :cond_2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;->lazySet(J)V

    iget-object v0, p0, Lxg/j;->a:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->h(Ljava/lang/Object;)V

    iget-object p1, p0, Lxg/j;->a:LDj/b;

    invoke-interface {p1}, LDj/b;->a()V

    return-void

    :cond_2
    iput-object p1, p0, Lxg/j;->c:Ljava/lang/Object;

    invoke-virtual {p0, v2, v3, v4, v5}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    move-result v0

    if-eqz v0, :cond_3

    return-void

    :cond_3
    const/4 v0, 0x0

    iput-object v0, p0, Lxg/j;->c:Ljava/lang/Object;

    goto :goto_0
.end method

.method protected g(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public j(LDj/c;)V
    .locals 1

    iget-object v0, p0, Lxg/j;->b:LDj/c;

    invoke-static {v0, p1}, Lyg/g;->validate(LDj/c;LDj/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lxg/j;->b:LDj/c;

    iget-object p1, p0, Lxg/j;->a:LDj/b;

    invoke-interface {p1, p0}, LDj/b;->j(LDj/c;)V

    :cond_0
    return-void
.end method

.method public final request(J)V
    .locals 8

    invoke-static {p1, p2}, Lyg/g;->validate(J)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_0
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    and-long v4, v0, v2

    const-wide/16 v6, 0x0

    cmp-long v4, v4, v6

    if-eqz v4, :cond_1

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    invoke-virtual {p0, v2, v3, p1, p2}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lxg/j;->a:LDj/b;

    iget-object p2, p0, Lxg/j;->c:Ljava/lang/Object;

    invoke-interface {p1, p2}, LDj/b;->h(Ljava/lang/Object;)V

    iget-object p1, p0, Lxg/j;->a:LDj/b;

    invoke-interface {p1}, LDj/b;->a()V

    goto :goto_0

    :cond_1
    invoke-static {v0, v1, p1, p2}, Lzg/d;->c(JJ)J

    move-result-wide v2

    invoke-virtual {p0, v0, v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lxg/j;->b:LDj/c;

    invoke-interface {v0, p1, p2}, LDj/c;->request(J)V

    :cond_2
    :goto_0
    return-void
.end method
