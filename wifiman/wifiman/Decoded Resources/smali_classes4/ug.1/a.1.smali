.class public final Lug/a;
.super Lgg/z;
.source "SourceFile"

# interfaces
.implements Lgg/B;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lug/a$a;
    }
.end annotation


# static fields
.field static final f:[Lug/a$a;

.field static final g:[Lug/a$a;


# instance fields
.field final a:Lgg/D;

.field final b:Ljava/util/concurrent/atomic/AtomicInteger;

.field final c:Ljava/util/concurrent/atomic/AtomicReference;

.field d:Ljava/lang/Object;

.field e:Ljava/lang/Throwable;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    new-array v1, v0, [Lug/a$a;

    sput-object v1, Lug/a;->f:[Lug/a$a;

    new-array v0, v0, [Lug/a$a;

    sput-object v0, Lug/a;->g:[Lug/a$a;

    return-void
.end method

.method public constructor <init>(Lgg/D;)V
    .locals 1

    invoke-direct {p0}, Lgg/z;-><init>()V

    iput-object p1, p0, Lug/a;->a:Lgg/D;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Lug/a;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v0, Lug/a;->f:[Lug/a$a;

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lug/a;->c:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method protected N(Lgg/B;)V
    .locals 2

    new-instance v0, Lug/a$a;

    invoke-direct {v0, p1, p0}, Lug/a$a;-><init>(Lgg/B;Lug/a;)V

    invoke-interface {p1, v0}, Lgg/B;->c(Lhg/c;)V

    invoke-virtual {p0, v0}, Lug/a;->h0(Lug/a$a;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lug/a$a;->isDisposed()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, v0}, Lug/a;->i0(Lug/a$a;)V

    :cond_0
    iget-object p1, p0, Lug/a;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lug/a;->a:Lgg/D;

    invoke-interface {p1, p0}, Lgg/D;->a(Lgg/B;)V

    :cond_1
    return-void

    :cond_2
    iget-object v0, p0, Lug/a;->e:Ljava/lang/Throwable;

    if-eqz v0, :cond_3

    invoke-interface {p1, v0}, Lgg/B;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lug/a;->d:Ljava/lang/Object;

    invoke-interface {p1, v0}, Lgg/B;->onSuccess(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public c(Lhg/c;)V
    .locals 0

    return-void
.end method

.method h0(Lug/a$a;)Z
    .locals 4

    :cond_0
    iget-object v0, p0, Lug/a;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lug/a$a;

    sget-object v1, Lug/a;->g:[Lug/a$a;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    return v2

    :cond_1
    array-length v1, v0

    add-int/lit8 v3, v1, 0x1

    new-array v3, v3, [Lug/a$a;

    invoke-static {v0, v2, v3, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    aput-object p1, v3, v1

    iget-object v1, p0, Lug/a;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v1, v0, v3}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1
.end method

.method i0(Lug/a$a;)V
    .locals 6

    :cond_0
    iget-object v0, p0, Lug/a;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lug/a$a;

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

    sget-object v1, Lug/a;->f:[Lug/a$a;

    goto :goto_2

    :cond_5
    add-int/lit8 v5, v1, -0x1

    new-array v5, v5, [Lug/a$a;

    invoke-static {v0, v2, v5, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v2, v3, 0x1

    sub-int/2addr v1, v3

    sub-int/2addr v1, v4

    invoke-static {v0, v2, v5, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v1, v5

    :goto_2
    iget-object v2, p0, Lug/a;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v2, v0, v1}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 5

    iput-object p1, p0, Lug/a;->e:Ljava/lang/Throwable;

    iget-object v0, p0, Lug/a;->c:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Lug/a;->g:[Lug/a$a;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lug/a$a;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lug/a$a;->isDisposed()Z

    move-result v4

    if-nez v4, :cond_0

    iget-object v3, v3, Lug/a$a;->a:Lgg/B;

    invoke-interface {v3, p1}, Lgg/B;->onError(Ljava/lang/Throwable;)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 5

    iput-object p1, p0, Lug/a;->d:Ljava/lang/Object;

    iget-object v0, p0, Lug/a;->c:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Lug/a;->g:[Lug/a$a;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lug/a$a;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lug/a$a;->isDisposed()Z

    move-result v4

    if-nez v4, :cond_0

    iget-object v3, v3, Lug/a$a;->a:Lgg/B;

    invoke-interface {v3, p1}, Lgg/B;->onSuccess(Ljava/lang/Object;)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method
