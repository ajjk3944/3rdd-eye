.class final Lug/f$a;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lgg/B;
.implements Lhg/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lug/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:Lgg/B;

.field final b:Lkg/a;

.field c:Lhg/c;


# direct methods
.method constructor <init>(Lgg/B;Lkg/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Lug/f$a;->a:Lgg/B;

    iput-object p2, p0, Lug/f$a;->b:Lkg/a;

    return-void
.end method


# virtual methods
.method a()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lug/f$a;->b:Lkg/a;

    invoke-interface {v0}, Lkg/a;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-static {v0}, LEg/a;->v(Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    return-void
.end method

.method public c(Lhg/c;)V
    .locals 1

    iget-object v0, p0, Lug/f$a;->c:Lhg/c;

    invoke-static {v0, p1}, Llg/b;->validate(Lhg/c;Lhg/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lug/f$a;->c:Lhg/c;

    iget-object p1, p0, Lug/f$a;->a:Lgg/B;

    invoke-interface {p1, p0}, Lgg/B;->c(Lhg/c;)V

    :cond_0
    return-void
.end method

.method public dispose()V
    .locals 1

    iget-object v0, p0, Lug/f$a;->c:Lhg/c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    invoke-virtual {p0}, Lug/f$a;->a()V

    return-void
.end method

.method public isDisposed()Z
    .locals 1

    iget-object v0, p0, Lug/f$a;->c:Lhg/c;

    invoke-interface {v0}, Lhg/c;->isDisposed()Z

    move-result v0

    return v0
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lug/f$a;->a:Lgg/B;

    invoke-interface {v0, p1}, Lgg/B;->onError(Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lug/f$a;->a()V

    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lug/f$a;->a:Lgg/B;

    invoke-interface {v0, p1}, Lgg/B;->onSuccess(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lug/f$a;->a()V

    return-void
.end method
