.class final Lug/s$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lgg/B;
.implements Lhg/c;
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lug/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:Lgg/B;

.field final b:Lgg/y;

.field c:Ljava/lang/Object;

.field d:Ljava/lang/Throwable;


# direct methods
.method constructor <init>(Lgg/B;Lgg/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lug/s$a;->a:Lgg/B;

    iput-object p2, p0, Lug/s$a;->b:Lgg/y;

    return-void
.end method


# virtual methods
.method public c(Lhg/c;)V
    .locals 0

    invoke-static {p0, p1}, Llg/b;->setOnce(Ljava/util/concurrent/atomic/AtomicReference;Lhg/c;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lug/s$a;->a:Lgg/B;

    invoke-interface {p1, p0}, Lgg/B;->c(Lhg/c;)V

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

    iput-object p1, p0, Lug/s$a;->d:Ljava/lang/Throwable;

    iget-object p1, p0, Lug/s$a;->b:Lgg/y;

    invoke-virtual {p1, p0}, Lgg/y;->e(Ljava/lang/Runnable;)Lhg/c;

    move-result-object p1

    invoke-static {p0, p1}, Llg/b;->replace(Ljava/util/concurrent/atomic/AtomicReference;Lhg/c;)Z

    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lug/s$a;->c:Ljava/lang/Object;

    iget-object p1, p0, Lug/s$a;->b:Lgg/y;

    invoke-virtual {p1, p0}, Lgg/y;->e(Ljava/lang/Runnable;)Lhg/c;

    move-result-object p1

    invoke-static {p0, p1}, Llg/b;->replace(Ljava/util/concurrent/atomic/AtomicReference;Lhg/c;)Z

    return-void
.end method

.method public run()V
    .locals 2

    iget-object v0, p0, Lug/s$a;->d:Ljava/lang/Throwable;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lug/s$a;->a:Lgg/B;

    invoke-interface {v1, v0}, Lgg/B;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lug/s$a;->a:Lgg/B;

    iget-object v1, p0, Lug/s$a;->c:Ljava/lang/Object;

    invoke-interface {v0, v1}, Lgg/B;->onSuccess(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
