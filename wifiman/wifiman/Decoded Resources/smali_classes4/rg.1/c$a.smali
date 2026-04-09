.class final Lrg/c$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lgg/p;
.implements Lhg/c;
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrg/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:Lgg/p;

.field final b:J

.field final c:Ljava/util/concurrent/TimeUnit;

.field final d:Lgg/y;

.field final e:Z

.field f:Ljava/lang/Object;

.field g:Ljava/lang/Throwable;


# direct methods
.method constructor <init>(Lgg/p;JLjava/util/concurrent/TimeUnit;Lgg/y;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lrg/c$a;->a:Lgg/p;

    iput-wide p2, p0, Lrg/c$a;->b:J

    iput-object p4, p0, Lrg/c$a;->c:Ljava/util/concurrent/TimeUnit;

    iput-object p5, p0, Lrg/c$a;->d:Lgg/y;

    iput-boolean p6, p0, Lrg/c$a;->e:Z

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-wide v0, p0, Lrg/c$a;->b:J

    invoke-virtual {p0, v0, v1}, Lrg/c$a;->d(J)V

    return-void
.end method

.method public c(Lhg/c;)V
    .locals 0

    invoke-static {p0, p1}, Llg/b;->setOnce(Ljava/util/concurrent/atomic/AtomicReference;Lhg/c;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lrg/c$a;->a:Lgg/p;

    invoke-interface {p1, p0}, Lgg/p;->c(Lhg/c;)V

    :cond_0
    return-void
.end method

.method d(J)V
    .locals 2

    iget-object v0, p0, Lrg/c$a;->d:Lgg/y;

    iget-object v1, p0, Lrg/c$a;->c:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, p0, p1, p2, v1}, Lgg/y;->f(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lhg/c;

    move-result-object p1

    invoke-static {p0, p1}, Llg/b;->replace(Ljava/util/concurrent/atomic/AtomicReference;Lhg/c;)Z

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
    .locals 2

    iput-object p1, p0, Lrg/c$a;->g:Ljava/lang/Throwable;

    iget-boolean p1, p0, Lrg/c$a;->e:Z

    if-eqz p1, :cond_0

    iget-wide v0, p0, Lrg/c$a;->b:J

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0, v1}, Lrg/c$a;->d(J)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 2

    iput-object p1, p0, Lrg/c$a;->f:Ljava/lang/Object;

    iget-wide v0, p0, Lrg/c$a;->b:J

    invoke-virtual {p0, v0, v1}, Lrg/c$a;->d(J)V

    return-void
.end method

.method public run()V
    .locals 2

    iget-object v0, p0, Lrg/c$a;->g:Ljava/lang/Throwable;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lrg/c$a;->a:Lgg/p;

    invoke-interface {v1, v0}, Lgg/p;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lrg/c$a;->f:Ljava/lang/Object;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lrg/c$a;->a:Lgg/p;

    invoke-interface {v1, v0}, Lgg/p;->onSuccess(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lrg/c$a;->a:Lgg/p;

    invoke-interface {v0}, Lgg/p;->a()V

    :goto_0
    return-void
.end method
