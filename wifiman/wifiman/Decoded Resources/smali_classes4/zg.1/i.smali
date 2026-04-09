.class public abstract Lzg/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(LDj/b;Ljava/util/concurrent/atomic/AtomicInteger;Lzg/c;)V
    .locals 0

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p2, p0}, Lzg/c;->j(LDj/b;)V

    :cond_0
    return-void
.end method

.method public static b(Lgg/x;Ljava/util/concurrent/atomic/AtomicInteger;Lzg/c;)V
    .locals 0

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p2, p0}, Lzg/c;->n(Lgg/x;)V

    :cond_0
    return-void
.end method

.method public static c(LDj/b;Ljava/lang/Throwable;Ljava/util/concurrent/atomic/AtomicInteger;Lzg/c;)V
    .locals 0

    invoke-virtual {p3, p1}, Lzg/c;->g(Ljava/lang/Throwable;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p3, p0}, Lzg/c;->j(LDj/b;)V

    :cond_0
    return-void
.end method

.method public static d(Lgg/x;Ljava/lang/Throwable;Ljava/util/concurrent/atomic/AtomicInteger;Lzg/c;)V
    .locals 0

    invoke-virtual {p3, p1}, Lzg/c;->g(Ljava/lang/Throwable;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p3, p0}, Lzg/c;->n(Lgg/x;)V

    :cond_0
    return-void
.end method

.method public static e(Lgg/x;Ljava/lang/Object;Ljava/util/concurrent/atomic/AtomicInteger;Lzg/c;)V
    .locals 2

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0, p1}, Lgg/x;->h(Ljava/lang/Object;)V

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p3, p0}, Lzg/c;->n(Lgg/x;)V

    :cond_0
    return-void
.end method

.method public static f(LDj/b;Ljava/lang/Object;Ljava/util/concurrent/atomic/AtomicInteger;Lzg/c;)Z
    .locals 3

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    invoke-virtual {p2, v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p0, p1}, LDj/b;->h(Ljava/lang/Object;)V

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result p1

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p3, p0}, Lzg/c;->j(LDj/b;)V

    :cond_1
    return v1
.end method
