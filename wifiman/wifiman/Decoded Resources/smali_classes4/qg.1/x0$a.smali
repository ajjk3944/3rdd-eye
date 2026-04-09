.class final Lqg/x0$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lgg/l;
.implements Lhg/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/x0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:Lqg/x0$c;

.field final b:J


# direct methods
.method constructor <init>(JLqg/x0$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-wide p1, p0, Lqg/x0$a;->b:J

    iput-object p3, p0, Lqg/x0$a;->a:Lqg/x0$c;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lyg/g;->CANCELLED:Lyg/g;

    if-eq v0, v1, :cond_0

    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    iget-object v0, p0, Lqg/x0$a;->a:Lqg/x0$c;

    iget-wide v1, p0, Lqg/x0$a;->b:J

    invoke-interface {v0, v1, v2}, Lqg/y0$d;->d(J)V

    :cond_0
    return-void
.end method

.method public dispose()V
    .locals 0

    invoke-static {p0}, Lyg/g;->cancel(Ljava/util/concurrent/atomic/AtomicReference;)Z

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 2

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LDj/c;

    sget-object v0, Lyg/g;->CANCELLED:Lyg/g;

    if-eq p1, v0, :cond_0

    invoke-interface {p1}, LDj/c;->cancel()V

    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    iget-object p1, p0, Lqg/x0$a;->a:Lqg/x0$c;

    iget-wide v0, p0, Lqg/x0$a;->b:J

    invoke-interface {p1, v0, v1}, Lqg/y0$d;->d(J)V

    :cond_0
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
    .locals 2

    const-wide v0, 0x7fffffffffffffffL

    invoke-static {p0, p1, v0, v1}, Lyg/g;->setOnce(Ljava/util/concurrent/atomic/AtomicReference;LDj/c;J)Z

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 3

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lyg/g;->CANCELLED:Lyg/g;

    if-eq v0, v1, :cond_0

    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    iget-object v0, p0, Lqg/x0$a;->a:Lqg/x0$c;

    iget-wide v1, p0, Lqg/x0$a;->b:J

    invoke-interface {v0, v1, v2, p1}, Lqg/x0$c;->g(JLjava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
