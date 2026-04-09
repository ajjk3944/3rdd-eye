.class public final Lpg/b;
.super Lgg/b;
.source "SourceFile"

# interfaces
.implements Lgg/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpg/b$a;
    }
.end annotation


# static fields
.field static final e:[Lpg/b$a;

.field static final f:[Lpg/b$a;


# instance fields
.field final a:Lgg/f;

.field final b:Ljava/util/concurrent/atomic/AtomicReference;

.field final c:Ljava/util/concurrent/atomic/AtomicBoolean;

.field d:Ljava/lang/Throwable;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    new-array v1, v0, [Lpg/b$a;

    sput-object v1, Lpg/b;->e:[Lpg/b$a;

    new-array v0, v0, [Lpg/b$a;

    sput-object v0, Lpg/b;->f:[Lpg/b$a;

    return-void
.end method

.method public constructor <init>(Lgg/f;)V
    .locals 1

    invoke-direct {p0}, Lgg/b;-><init>()V

    iput-object p1, p0, Lpg/b;->a:Lgg/f;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v0, Lpg/b;->e:[Lpg/b$a;

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpg/b;->b:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object p1, p0, Lpg/b;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method


# virtual methods
.method protected V(Lgg/d;)V
    .locals 2

    new-instance v0, Lpg/b$a;

    invoke-direct {v0, p0, p1}, Lpg/b$a;-><init>(Lpg/b;Lgg/d;)V

    invoke-interface {p1, v0}, Lgg/d;->c(Lhg/c;)V

    invoke-virtual {p0, v0}, Lpg/b;->k0(Lpg/b$a;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lpg/b$a;->isDisposed()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, v0}, Lpg/b;->l0(Lpg/b$a;)V

    :cond_0
    iget-object p1, p0, Lpg/b;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lpg/b;->a:Lgg/f;

    invoke-interface {p1, p0}, Lgg/f;->e(Lgg/d;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lpg/b;->d:Ljava/lang/Throwable;

    if-eqz v0, :cond_2

    invoke-interface {p1, v0}, Lgg/d;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_2
    invoke-interface {p1}, Lgg/d;->a()V

    :cond_3
    :goto_0
    return-void
.end method

.method public a()V
    .locals 5

    iget-object v0, p0, Lpg/b;->b:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Lpg/b;->f:[Lpg/b$a;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lpg/b$a;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v4

    if-nez v4, :cond_0

    iget-object v3, v3, Lpg/b$a;->a:Lgg/d;

    invoke-interface {v3}, Lgg/d;->a()V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public c(Lhg/c;)V
    .locals 0

    return-void
.end method

.method k0(Lpg/b$a;)Z
    .locals 4

    :cond_0
    iget-object v0, p0, Lpg/b;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lpg/b$a;

    sget-object v1, Lpg/b;->f:[Lpg/b$a;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    return v2

    :cond_1
    array-length v1, v0

    add-int/lit8 v3, v1, 0x1

    new-array v3, v3, [Lpg/b$a;

    invoke-static {v0, v2, v3, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    aput-object p1, v3, v1

    iget-object v1, p0, Lpg/b;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v1, v0, v3}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1
.end method

.method l0(Lpg/b$a;)V
    .locals 6

    :cond_0
    iget-object v0, p0, Lpg/b;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lpg/b$a;

    array-length v1, v0

    if-nez v1, :cond_1

    return-void

    :cond_1
    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_3

    aget-object v4, v0, v3

    if-ne v4, p1, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    const/4 v3, -0x1

    :goto_1
    if-gez v3, :cond_4

    return-void

    :cond_4
    const/4 v4, 0x1

    if-ne v1, v4, :cond_5

    sget-object v1, Lpg/b;->e:[Lpg/b$a;

    goto :goto_2

    :cond_5
    add-int/lit8 v5, v1, -0x1

    new-array v5, v5, [Lpg/b$a;

    invoke-static {v0, v2, v5, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v2, v3, 0x1

    sub-int/2addr v1, v3

    sub-int/2addr v1, v4

    invoke-static {v0, v2, v5, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v1, v5

    :goto_2
    iget-object v2, p0, Lpg/b;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v2, v0, v1}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 5

    iput-object p1, p0, Lpg/b;->d:Ljava/lang/Throwable;

    iget-object v0, p0, Lpg/b;->b:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Lpg/b;->f:[Lpg/b$a;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lpg/b$a;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v4

    if-nez v4, :cond_0

    iget-object v3, v3, Lpg/b$a;->a:Lgg/d;

    invoke-interface {v3, p1}, Lgg/d;->onError(Ljava/lang/Throwable;)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method
