.class final Lug/d$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lgg/d;
.implements Lhg/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lug/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:Lgg/B;

.field final b:Lgg/D;


# direct methods
.method constructor <init>(Lgg/B;Lgg/D;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lug/d$a;->a:Lgg/B;

    iput-object p2, p0, Lug/d$a;->b:Lgg/D;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Lug/d$a;->b:Lgg/D;

    new-instance v1, Log/k;

    iget-object v2, p0, Lug/d$a;->a:Lgg/B;

    invoke-direct {v1, p0, v2}, Log/k;-><init>(Ljava/util/concurrent/atomic/AtomicReference;Lgg/B;)V

    invoke-interface {v0, v1}, Lgg/D;->a(Lgg/B;)V

    return-void
.end method

.method public c(Lhg/c;)V
    .locals 0

    invoke-static {p0, p1}, Llg/b;->setOnce(Ljava/util/concurrent/atomic/AtomicReference;Lhg/c;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lug/d$a;->a:Lgg/B;

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
    .locals 1

    iget-object v0, p0, Lug/d$a;->a:Lgg/B;

    invoke-interface {v0, p1}, Lgg/B;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
