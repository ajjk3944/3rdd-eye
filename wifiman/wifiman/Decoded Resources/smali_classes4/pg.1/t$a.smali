.class final Lpg/t$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lgg/d;
.implements Lhg/c;
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpg/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:Lgg/d;

.field final b:Lgg/y;

.field c:Ljava/lang/Throwable;


# direct methods
.method constructor <init>(Lgg/d;Lgg/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lpg/t$a;->a:Lgg/d;

    iput-object p2, p0, Lpg/t$a;->b:Lgg/y;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lpg/t$a;->b:Lgg/y;

    invoke-virtual {v0, p0}, Lgg/y;->e(Ljava/lang/Runnable;)Lhg/c;

    move-result-object v0

    invoke-static {p0, v0}, Llg/b;->replace(Ljava/util/concurrent/atomic/AtomicReference;Lhg/c;)Z

    return-void
.end method

.method public c(Lhg/c;)V
    .locals 0

    invoke-static {p0, p1}, Llg/b;->setOnce(Ljava/util/concurrent/atomic/AtomicReference;Lhg/c;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lpg/t$a;->a:Lgg/d;

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
    .locals 0

    iput-object p1, p0, Lpg/t$a;->c:Ljava/lang/Throwable;

    iget-object p1, p0, Lpg/t$a;->b:Lgg/y;

    invoke-virtual {p1, p0}, Lgg/y;->e(Ljava/lang/Runnable;)Lhg/c;

    move-result-object p1

    invoke-static {p0, p1}, Llg/b;->replace(Ljava/util/concurrent/atomic/AtomicReference;Lhg/c;)Z

    return-void
.end method

.method public run()V
    .locals 2

    iget-object v0, p0, Lpg/t$a;->c:Ljava/lang/Throwable;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    iput-object v1, p0, Lpg/t$a;->c:Ljava/lang/Throwable;

    iget-object v1, p0, Lpg/t$a;->a:Lgg/d;

    invoke-interface {v1, v0}, Lgg/d;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lpg/t$a;->a:Lgg/d;

    invoke-interface {v0}, Lgg/d;->a()V

    :goto_0
    return-void
.end method
