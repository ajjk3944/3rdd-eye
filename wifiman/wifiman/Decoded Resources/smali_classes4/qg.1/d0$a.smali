.class final Lqg/d0$a;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lgg/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:LDj/b;

.field final b:Lyg/f;

.field final c:LDj/a;

.field d:J

.field e:J


# direct methods
.method constructor <init>(LDj/b;JLyg/f;LDj/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Lqg/d0$a;->a:LDj/b;

    iput-object p4, p0, Lqg/d0$a;->b:Lyg/f;

    iput-object p5, p0, Lqg/d0$a;->c:LDj/a;

    iput-wide p2, p0, Lqg/d0$a;->d:J

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    iget-wide v0, p0, Lqg/d0$a;->d:J

    const-wide v2, 0x7fffffffffffffffL

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    const-wide/16 v2, 0x1

    sub-long v2, v0, v2

    iput-wide v2, p0, Lqg/d0$a;->d:J

    :cond_0
    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lqg/d0$a;->c()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lqg/d0$a;->a:LDj/b;

    invoke-interface {v0}, LDj/b;->a()V

    :goto_0
    return-void
.end method

.method c()V
    .locals 6

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_3

    const/4 v0, 0x1

    :cond_0
    iget-object v1, p0, Lqg/d0$a;->b:Lyg/f;

    invoke-virtual {v1}, Lyg/f;->n()Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    :cond_1
    iget-wide v1, p0, Lqg/d0$a;->e:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-eqz v5, :cond_2

    iput-wide v3, p0, Lqg/d0$a;->e:J

    iget-object v3, p0, Lqg/d0$a;->b:Lyg/f;

    invoke-virtual {v3, v1, v2}, Lyg/f;->p(J)V

    :cond_2
    iget-object v1, p0, Lqg/d0$a;->c:LDj/a;

    invoke-interface {v1, p0}, LDj/a;->b(LDj/b;)V

    neg-int v0, v0

    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v0

    if-nez v0, :cond_0

    :cond_3
    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 4

    iget-wide v0, p0, Lqg/d0$a;->e:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lqg/d0$a;->e:J

    iget-object v0, p0, Lqg/d0$a;->a:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public j(LDj/c;)V
    .locals 1

    iget-object v0, p0, Lqg/d0$a;->b:Lyg/f;

    invoke-virtual {v0, p1}, Lyg/f;->r(LDj/c;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lqg/d0$a;->a:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
