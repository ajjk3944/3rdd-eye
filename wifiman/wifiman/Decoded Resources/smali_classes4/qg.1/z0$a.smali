.class final Lqg/z0$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements LDj/c;
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/z0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:LDj/b;

.field volatile b:Z


# direct methods
.method constructor <init>(LDj/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lqg/z0$a;->a:LDj/b;

    return-void
.end method


# virtual methods
.method public a(Lhg/c;)V
    .locals 0

    invoke-static {p0, p1}, Llg/b;->trySet(Ljava/util/concurrent/atomic/AtomicReference;Lhg/c;)Z

    return-void
.end method

.method public cancel()V
    .locals 0

    invoke-static {p0}, Llg/b;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    return-void
.end method

.method public request(J)V
    .locals 0

    invoke-static {p1, p2}, Lyg/g;->validate(J)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lqg/z0$a;->b:Z

    :cond_0
    return-void
.end method

.method public run()V
    .locals 3

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Llg/b;->DISPOSED:Llg/b;

    if-eq v0, v1, :cond_1

    iget-boolean v0, p0, Lqg/z0$a;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqg/z0$a;->a:LDj/b;

    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, LDj/b;->h(Ljava/lang/Object;)V

    sget-object v0, Llg/c;->INSTANCE:Llg/c;

    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    iget-object v0, p0, Lqg/z0$a;->a:LDj/b;

    invoke-interface {v0}, LDj/b;->a()V

    goto :goto_0

    :cond_0
    sget-object v0, Llg/c;->INSTANCE:Llg/c;

    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    iget-object v0, p0, Lqg/z0$a;->a:LDj/b;

    invoke-static {}, Lio/reactivex/rxjava3/exceptions/MissingBackpressureException;->a()Lio/reactivex/rxjava3/exceptions/MissingBackpressureException;

    move-result-object v1

    invoke-interface {v0, v1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-void
.end method
