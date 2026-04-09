.class final Ltg/W$a;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lgg/x;
.implements Lhg/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltg/W;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/W$a$a;
    }
.end annotation


# instance fields
.field final a:Lgg/x;

.field final b:Ljava/util/concurrent/atomic/AtomicInteger;

.field final c:Lzg/c;

.field final d:LHg/d;

.field final e:Ltg/W$a$a;

.field final f:Ljava/util/concurrent/atomic/AtomicReference;

.field final g:Lgg/v;

.field volatile h:Z


# direct methods
.method constructor <init>(Lgg/x;LHg/d;Lgg/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Ltg/W$a;->a:Lgg/x;

    iput-object p2, p0, Ltg/W$a;->d:LHg/d;

    iput-object p3, p0, Ltg/W$a;->g:Lgg/v;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Ltg/W$a;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance p1, Lzg/c;

    invoke-direct {p1}, Lzg/c;-><init>()V

    iput-object p1, p0, Ltg/W$a;->c:Lzg/c;

    new-instance p1, Ltg/W$a$a;

    invoke-direct {p1, p0}, Ltg/W$a$a;-><init>(Ltg/W$a;)V

    iput-object p1, p0, Ltg/W$a;->e:Ltg/W$a$a;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Ltg/W$a;->f:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Ltg/W$a;->f:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Llg/b;->replace(Ljava/util/concurrent/atomic/AtomicReference;Lhg/c;)Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Ltg/W$a;->h:Z

    iget-object v1, p0, Ltg/W$a;->d:LHg/d;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Lgg/x;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public c(Lhg/c;)V
    .locals 1

    iget-object v0, p0, Ltg/W$a;->f:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0, p1}, Llg/b;->setOnce(Ljava/util/concurrent/atomic/AtomicReference;Lhg/c;)Z

    return-void
.end method

.method d()V
    .locals 2

    iget-object v0, p0, Ltg/W$a;->f:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0}, Llg/b;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    iget-object v0, p0, Ltg/W$a;->a:Lgg/x;

    iget-object v1, p0, Ltg/W$a;->c:Lzg/c;

    invoke-static {v0, p0, v1}, Lzg/i;->b(Lgg/x;Ljava/util/concurrent/atomic/AtomicInteger;Lzg/c;)V

    return-void
.end method

.method public dispose()V
    .locals 1

    iget-object v0, p0, Ltg/W$a;->f:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0}, Llg/b;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    iget-object v0, p0, Ltg/W$a;->e:Ltg/W$a$a;

    invoke-static {v0}, Llg/b;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    return-void
.end method

.method g(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Ltg/W$a;->f:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0}, Llg/b;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    iget-object v0, p0, Ltg/W$a;->a:Lgg/x;

    iget-object v1, p0, Ltg/W$a;->c:Lzg/c;

    invoke-static {v0, p1, p0, v1}, Lzg/i;->d(Lgg/x;Ljava/lang/Throwable;Ljava/util/concurrent/atomic/AtomicInteger;Lzg/c;)V

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Ltg/W$a;->a:Lgg/x;

    iget-object v1, p0, Ltg/W$a;->c:Lzg/c;

    invoke-static {v0, p1, p0, v1}, Lzg/i;->e(Lgg/x;Ljava/lang/Object;Ljava/util/concurrent/atomic/AtomicInteger;Lzg/c;)V

    return-void
.end method

.method public isDisposed()Z
    .locals 1

    iget-object v0, p0, Ltg/W$a;->f:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhg/c;

    invoke-static {v0}, Llg/b;->isDisposed(Lhg/c;)Z

    move-result v0

    return v0
.end method

.method j()V
    .locals 0

    invoke-virtual {p0}, Ltg/W$a;->m()V

    return-void
.end method

.method m()V
    .locals 1

    iget-object v0, p0, Ltg/W$a;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_3

    :cond_0
    invoke-virtual {p0}, Ltg/W$a;->isDisposed()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-boolean v0, p0, Ltg/W$a;->h:Z

    if-nez v0, :cond_2

    const/4 v0, 0x1

    iput-boolean v0, p0, Ltg/W$a;->h:Z

    iget-object v0, p0, Ltg/W$a;->g:Lgg/v;

    invoke-interface {v0, p0}, Lgg/v;->d(Lgg/x;)V

    :cond_2
    iget-object v0, p0, Ltg/W$a;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-nez v0, :cond_0

    :cond_3
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Ltg/W$a;->e:Ltg/W$a$a;

    invoke-static {v0}, Llg/b;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    iget-object v0, p0, Ltg/W$a;->a:Lgg/x;

    iget-object v1, p0, Ltg/W$a;->c:Lzg/c;

    invoke-static {v0, p1, p0, v1}, Lzg/i;->d(Lgg/x;Ljava/lang/Throwable;Ljava/util/concurrent/atomic/AtomicInteger;Lzg/c;)V

    return-void
.end method
