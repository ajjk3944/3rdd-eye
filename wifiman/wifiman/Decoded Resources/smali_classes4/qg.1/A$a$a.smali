.class final Lqg/A$a$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lgg/B;
.implements Lhg/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/A$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lqg/A$a;


# direct methods
.method constructor <init>(Lqg/A$a;)V
    .locals 0

    iput-object p1, p0, Lqg/A$a$a;->a:Lqg/A$a;

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lhg/c;)V
    .locals 0

    invoke-static {p0, p1}, Llg/b;->setOnce(Ljava/util/concurrent/atomic/AtomicReference;Lhg/c;)Z

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

    iget-object v0, p0, Lqg/A$a$a;->a:Lqg/A$a;

    invoke-virtual {v0, p0, p1}, Lqg/A$a;->n(Lqg/A$a$a;Ljava/lang/Throwable;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lqg/A$a$a;->a:Lqg/A$a;

    invoke-virtual {v0, p0, p1}, Lqg/A$a;->o(Lqg/A$a$a;Ljava/lang/Object;)V

    return-void
.end method
