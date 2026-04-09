.class abstract Ltg/X$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Ltg/X$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltg/X;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "a"
.end annotation


# instance fields
.field a:Ltg/X$d;

.field b:I

.field final c:Z


# direct methods
.method constructor <init>(Z)V
    .locals 1

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-boolean p1, p0, Ltg/X$a;->c:Z

    new-instance p1, Ltg/X$d;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ltg/X$d;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Ltg/X$a;->a:Ltg/X$d;

    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Throwable;)V
    .locals 1

    invoke-static {p1}, Lzg/j;->error(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Ltg/X$a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    new-instance v0, Ltg/X$d;

    invoke-direct {v0, p1}, Ltg/X$d;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Ltg/X$a;->a(Ltg/X$d;)V

    invoke-virtual {p0}, Ltg/X$a;->p()V

    return-void
.end method

.method public final S(Ltg/X$c;)V
    .locals 5

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    :cond_1
    invoke-virtual {p1}, Ltg/X$c;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ltg/X$d;

    if-nez v1, :cond_2

    invoke-virtual {p0}, Ltg/X$a;->d()Ltg/X$d;

    move-result-object v1

    iput-object v1, p1, Ltg/X$c;->c:Ljava/lang/Object;

    :cond_2
    :goto_0
    invoke-virtual {p1}, Ltg/X$c;->isDisposed()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    iput-object v3, p1, Ltg/X$c;->c:Ljava/lang/Object;

    return-void

    :cond_3
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ltg/X$d;

    if-eqz v2, :cond_5

    iget-object v1, v2, Ltg/X$d;->a:Ljava/lang/Object;

    invoke-virtual {p0, v1}, Ltg/X$a;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iget-object v4, p1, Ltg/X$c;->b:Lgg/x;

    invoke-static {v1, v4}, Lzg/j;->accept(Ljava/lang/Object;Lgg/x;)Z

    move-result v1

    if-eqz v1, :cond_4

    iput-object v3, p1, Ltg/X$c;->c:Ljava/lang/Object;

    return-void

    :cond_4
    move-object v1, v2

    goto :goto_0

    :cond_5
    iput-object v1, p1, Ltg/X$c;->c:Ljava/lang/Object;

    neg-int v0, v0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v0

    if-nez v0, :cond_1

    return-void
.end method

.method final a(Ltg/X$d;)V
    .locals 1

    iget-object v0, p0, Ltg/X$a;->a:Ltg/X$d;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iput-object p1, p0, Ltg/X$a;->a:Ltg/X$d;

    iget p1, p0, Ltg/X$a;->b:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ltg/X$a;->b:I

    return-void
.end method

.method c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    return-object p1
.end method

.method d()Ltg/X$d;
    .locals 1

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltg/X$d;

    return-object v0
.end method

.method g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    return-object p1
.end method

.method final h()V
    .locals 2

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltg/X$d;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltg/X$d;

    iget v1, p0, Ltg/X$a;->b:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Ltg/X$a;->b:I

    invoke-virtual {p0, v0}, Ltg/X$a;->j(Ltg/X$d;)V

    return-void
.end method

.method final j(Ltg/X$d;)V
    .locals 2

    iget-boolean v0, p0, Ltg/X$a;->c:Z

    if-eqz v0, :cond_0

    new-instance v0, Ltg/X$d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ltg/X$d;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    move-object p1, v0

    :cond_0
    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

.method final l()V
    .locals 3

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltg/X$d;

    iget-object v1, v0, Ltg/X$d;->a:Ljava/lang/Object;

    if-eqz v1, :cond_0

    new-instance v1, Ltg/X$d;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ltg/X$d;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final m()V
    .locals 2

    invoke-static {}, Lzg/j;->complete()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Ltg/X$a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    new-instance v1, Ltg/X$d;

    invoke-direct {v1, v0}, Ltg/X$d;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p0, v1}, Ltg/X$a;->a(Ltg/X$d;)V

    invoke-virtual {p0}, Ltg/X$a;->p()V

    return-void
.end method

.method abstract n()V
.end method

.method public final o(Ljava/lang/Object;)V
    .locals 1

    invoke-static {p1}, Lzg/j;->next(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Ltg/X$a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    new-instance v0, Ltg/X$d;

    invoke-direct {v0, p1}, Ltg/X$d;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Ltg/X$a;->a(Ltg/X$d;)V

    invoke-virtual {p0}, Ltg/X$a;->n()V

    return-void
.end method

.method p()V
    .locals 0

    invoke-virtual {p0}, Ltg/X$a;->l()V

    return-void
.end method
