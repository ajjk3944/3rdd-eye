.class public final Lvg/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LDg/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvg/a$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/atomic/AtomicReference;

.field private final b:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lvg/a;->a:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lvg/a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Lvg/a$a;

    invoke-direct {v0}, Lvg/a$a;-><init>()V

    invoke-virtual {p0, v0}, Lvg/a;->d(Lvg/a$a;)V

    invoke-virtual {p0, v0}, Lvg/a;->e(Lvg/a$a;)Lvg/a$a;

    return-void
.end method


# virtual methods
.method a()Lvg/a$a;
    .locals 1

    iget-object v0, p0, Lvg/a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvg/a$a;

    return-object v0
.end method

.method b()Lvg/a$a;
    .locals 1

    iget-object v0, p0, Lvg/a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvg/a$a;

    return-object v0
.end method

.method c()Lvg/a$a;
    .locals 1

    iget-object v0, p0, Lvg/a;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvg/a$a;

    return-object v0
.end method

.method public clear()V
    .locals 1

    :goto_0
    invoke-virtual {p0}, Lvg/a;->poll()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lvg/a;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-void
.end method

.method d(Lvg/a$a;)V
    .locals 1

    iget-object v0, p0, Lvg/a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    return-void
.end method

.method e(Lvg/a$a;)Lvg/a$a;
    .locals 1

    iget-object v0, p0, Lvg/a;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lvg/a$a;

    return-object p1
.end method

.method public isEmpty()Z
    .locals 2

    invoke-virtual {p0}, Lvg/a;->b()Lvg/a$a;

    move-result-object v0

    invoke-virtual {p0}, Lvg/a;->c()Lvg/a$a;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public offer(Ljava/lang/Object;)Z
    .locals 1

    if-eqz p1, :cond_0

    new-instance v0, Lvg/a$a;

    invoke-direct {v0, p1}, Lvg/a$a;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lvg/a;->e(Lvg/a$a;)Lvg/a$a;

    move-result-object p1

    invoke-virtual {p1, v0}, Lvg/a$a;->g(Lvg/a$a;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null is not a valid element"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public poll()Ljava/lang/Object;
    .locals 4

    invoke-virtual {p0}, Lvg/a;->a()Lvg/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lvg/a$a;->d()Lvg/a$a;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lvg/a$a;->a()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v1}, Lvg/a;->d(Lvg/a$a;)V

    invoke-virtual {v0, v2}, Lvg/a$a;->g(Lvg/a$a;)V

    return-object v3

    :cond_0
    invoke-virtual {p0}, Lvg/a;->c()Lvg/a$a;

    move-result-object v1

    if-eq v0, v1, :cond_2

    :goto_0
    invoke-virtual {v0}, Lvg/a$a;->d()Lvg/a$a;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lvg/a$a;->a()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v1}, Lvg/a;->d(Lvg/a$a;)V

    invoke-virtual {v0, v2}, Lvg/a$a;->g(Lvg/a$a;)V

    return-object v3

    :cond_2
    return-object v2
.end method
