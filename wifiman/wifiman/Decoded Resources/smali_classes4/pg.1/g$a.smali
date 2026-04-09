.class final Lpg/g$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lgg/d;
.implements Ljava/lang/Runnable;
.implements Lhg/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpg/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:Lgg/d;

.field final b:J

.field final c:Ljava/util/concurrent/TimeUnit;

.field final d:Lgg/y;

.field final e:Z

.field f:Ljava/lang/Throwable;


# direct methods
.method constructor <init>(Lgg/d;JLjava/util/concurrent/TimeUnit;Lgg/y;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lpg/g$a;->a:Lgg/d;

    iput-wide p2, p0, Lpg/g$a;->b:J

    iput-object p4, p0, Lpg/g$a;->c:Ljava/util/concurrent/TimeUnit;

    iput-object p5, p0, Lpg/g$a;->d:Lgg/y;

    iput-boolean p6, p0, Lpg/g$a;->e:Z

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    iget-object v0, p0, Lpg/g$a;->d:Lgg/y;

    iget-wide v1, p0, Lpg/g$a;->b:J

    iget-object v3, p0, Lpg/g$a;->c:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, p0, v1, v2, v3}, Lgg/y;->f(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lhg/c;

    move-result-object v0

    invoke-static {p0, v0}, Llg/b;->replace(Ljava/util/concurrent/atomic/AtomicReference;Lhg/c;)Z

    return-void
.end method

.method public c(Lhg/c;)V
    .locals 0

    invoke-static {p0, p1}, Llg/b;->setOnce(Ljava/util/concurrent/atomic/AtomicReference;Lhg/c;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lpg/g$a;->a:Lgg/d;

    invoke-interface {p1, p0}, Lgg/d;->c(Lhg/c;)V

    :cond_0
    return-void
.end method

.method public dispose()V
    .locals 0

    invoke-static {p0}, Llg/b;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    return-void
.end method

.method public isDisposed()Z
    .locals 1

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhg/c;

    invoke-static {v0}, Llg/b;->isDisposed(Lhg/c;)Z

    move-result v0

    return v0
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 3

    iput-object p1, p0, Lpg/g$a;->f:Ljava/lang/Throwable;

    iget-object p1, p0, Lpg/g$a;->d:Lgg/y;

    iget-boolean v0, p0, Lpg/g$a;->e:Z

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lpg/g$a;->b:J

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    iget-object v2, p0, Lpg/g$a;->c:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, p0, v0, v1, v2}, Lgg/y;->f(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lhg/c;

    move-result-object p1

    invoke-static {p0, p1}, Llg/b;->replace(Ljava/util/concurrent/atomic/AtomicReference;Lhg/c;)Z

    return-void
.end method

.method public run()V
    .locals 2

    iget-object v0, p0, Lpg/g$a;->f:Ljava/lang/Throwable;

    const/4 v1, 0x0

    iput-object v1, p0, Lpg/g$a;->f:Ljava/lang/Throwable;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lpg/g$a;->a:Lgg/d;

    invoke-interface {v1, v0}, Lgg/d;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lpg/g$a;->a:Lgg/d;

    invoke-interface {v0}, Lgg/d;->a()V

    :goto_0
    return-void
.end method
