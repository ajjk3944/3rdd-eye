.class final Ltg/i0$a;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lgg/x;
.implements Lhg/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltg/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/i0$a$a;
    }
.end annotation


# instance fields
.field final a:Lgg/x;

.field final b:Ljava/util/concurrent/atomic/AtomicReference;

.field final c:Ltg/i0$a$a;

.field final d:Lzg/c;


# direct methods
.method constructor <init>(Lgg/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Ltg/i0$a;->a:Lgg/x;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Ltg/i0$a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance p1, Ltg/i0$a$a;

    invoke-direct {p1, p0}, Ltg/i0$a$a;-><init>(Ltg/i0$a;)V

    iput-object p1, p0, Ltg/i0$a;->c:Ltg/i0$a$a;

    new-instance p1, Lzg/c;

    invoke-direct {p1}, Lzg/c;-><init>()V

    iput-object p1, p0, Ltg/i0$a;->d:Lzg/c;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Ltg/i0$a;->c:Ltg/i0$a$a;

    invoke-static {v0}, Llg/b;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    iget-object v0, p0, Ltg/i0$a;->a:Lgg/x;

    iget-object v1, p0, Ltg/i0$a;->d:Lzg/c;

    invoke-static {v0, p0, v1}, Lzg/i;->b(Lgg/x;Ljava/util/concurrent/atomic/AtomicInteger;Lzg/c;)V

    return-void
.end method

.method public c(Lhg/c;)V
    .locals 1

    iget-object v0, p0, Ltg/i0$a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0, p1}, Llg/b;->setOnce(Ljava/util/concurrent/atomic/AtomicReference;Lhg/c;)Z

    return-void
.end method

.method d()V
    .locals 2

    iget-object v0, p0, Ltg/i0$a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0}, Llg/b;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    iget-object v0, p0, Ltg/i0$a;->a:Lgg/x;

    iget-object v1, p0, Ltg/i0$a;->d:Lzg/c;

    invoke-static {v0, p0, v1}, Lzg/i;->b(Lgg/x;Ljava/util/concurrent/atomic/AtomicInteger;Lzg/c;)V

    return-void
.end method

.method public dispose()V
    .locals 1

    iget-object v0, p0, Ltg/i0$a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0}, Llg/b;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    iget-object v0, p0, Ltg/i0$a;->c:Ltg/i0$a$a;

    invoke-static {v0}, Llg/b;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    return-void
.end method

.method g(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Ltg/i0$a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0}, Llg/b;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    iget-object v0, p0, Ltg/i0$a;->a:Lgg/x;

    iget-object v1, p0, Ltg/i0$a;->d:Lzg/c;

    invoke-static {v0, p1, p0, v1}, Lzg/i;->d(Lgg/x;Ljava/lang/Throwable;Ljava/util/concurrent/atomic/AtomicInteger;Lzg/c;)V

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Ltg/i0$a;->a:Lgg/x;

    iget-object v1, p0, Ltg/i0$a;->d:Lzg/c;

    invoke-static {v0, p1, p0, v1}, Lzg/i;->e(Lgg/x;Ljava/lang/Object;Ljava/util/concurrent/atomic/AtomicInteger;Lzg/c;)V

    return-void
.end method

.method public isDisposed()Z
    .locals 1

    iget-object v0, p0, Ltg/i0$a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhg/c;

    invoke-static {v0}, Llg/b;->isDisposed(Lhg/c;)Z

    move-result v0

    return v0
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Ltg/i0$a;->c:Ltg/i0$a$a;

    invoke-static {v0}, Llg/b;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    iget-object v0, p0, Ltg/i0$a;->a:Lgg/x;

    iget-object v1, p0, Ltg/i0$a;->d:Lzg/c;

    invoke-static {v0, p1, p0, v1}, Lzg/i;->d(Lgg/x;Ljava/lang/Throwable;Ljava/util/concurrent/atomic/AtomicInteger;Lzg/c;)V

    return-void
.end method
