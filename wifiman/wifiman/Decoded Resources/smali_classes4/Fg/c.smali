.class public final LFg/c;
.super LFg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LFg/c$a;
    }
.end annotation


# static fields
.field static final d:[LFg/c$a;

.field static final e:[LFg/c$a;


# instance fields
.field final b:Ljava/util/concurrent/atomic/AtomicReference;

.field c:Ljava/lang/Throwable;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    new-array v1, v0, [LFg/c$a;

    sput-object v1, LFg/c;->d:[LFg/c$a;

    new-array v0, v0, [LFg/c$a;

    sput-object v0, LFg/c;->e:[LFg/c$a;

    return-void
.end method

.method constructor <init>()V
    .locals 2

    invoke-direct {p0}, LFg/b;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, LFg/c;->e:[LFg/c$a;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, LFg/c;->b:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public static j2()LFg/c;
    .locals 1

    new-instance v0, LFg/c;

    invoke-direct {v0}, LFg/c;-><init>()V

    return-object v0
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 2

    new-instance v0, LFg/c$a;

    invoke-direct {v0, p1, p0}, LFg/c$a;-><init>(LDj/b;LFg/c;)V

    invoke-interface {p1, v0}, LDj/b;->j(LDj/c;)V

    invoke-virtual {p0, v0}, LFg/c;->i2(LFg/c$a;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, LFg/c$a;->a()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0, v0}, LFg/c;->l2(LFg/c$a;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LFg/c;->c:Ljava/lang/Throwable;

    if-eqz v0, :cond_1

    invoke-interface {p1, v0}, LDj/b;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    invoke-interface {p1}, LDj/b;->a()V

    :cond_2
    :goto_0
    return-void
.end method

.method public a()V
    .locals 4

    iget-object v0, p0, LFg/c;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LFg/c;->d:[LFg/c$a;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LFg/c;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LFg/c$a;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, LFg/c$a;->d()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 4

    const-string v0, "onNext called with a null value."

    invoke-static {p1, v0}, Lzg/h;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v0, p0, LFg/c;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LFg/c$a;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3, p1}, LFg/c$a;->h(Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method i2(LFg/c$a;)Z
    .locals 4

    :cond_0
    iget-object v0, p0, LFg/c;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LFg/c$a;

    sget-object v1, LFg/c;->d:[LFg/c$a;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    return v2

    :cond_1
    array-length v1, v0

    add-int/lit8 v3, v1, 0x1

    new-array v3, v3, [LFg/c$a;

    invoke-static {v0, v2, v3, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    aput-object p1, v3, v1

    iget-object v1, p0, LFg/c;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v1, v0, v3}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1
.end method

.method public j(LDj/c;)V
    .locals 2

    iget-object v0, p0, LFg/c;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LFg/c;->d:[LFg/c$a;

    if-ne v0, v1, :cond_0

    invoke-interface {p1}, LDj/c;->cancel()V

    return-void

    :cond_0
    const-wide v0, 0x7fffffffffffffffL

    invoke-interface {p1, v0, v1}, LDj/c;->request(J)V

    return-void
.end method

.method public k2(Ljava/lang/Object;)Z
    .locals 5

    const-string v0, "offer called with a null value."

    invoke-static {p1, v0}, Lzg/h;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v0, p0, LFg/c;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LFg/c$a;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    invoke-virtual {v4}, LFg/c$a;->c()Z

    move-result v4

    if-eqz v4, :cond_0

    return v2

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    array-length v1, v0

    :goto_1
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    invoke-virtual {v3, p1}, LFg/c$a;->h(Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method l2(LFg/c$a;)V
    .locals 6

    :cond_0
    iget-object v0, p0, LFg/c;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LFg/c$a;

    sget-object v1, LFg/c;->d:[LFg/c$a;

    if-eq v0, v1, :cond_6

    sget-object v1, LFg/c;->e:[LFg/c$a;

    if-ne v0, v1, :cond_1

    goto :goto_3

    :cond_1
    array-length v1, v0

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

    sget-object v1, LFg/c;->e:[LFg/c$a;

    goto :goto_2

    :cond_5
    add-int/lit8 v5, v1, -0x1

    new-array v5, v5, [LFg/c$a;

    invoke-static {v0, v2, v5, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v2, v3, 0x1

    sub-int/2addr v1, v3

    sub-int/2addr v1, v4

    invoke-static {v0, v2, v5, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v1, v5

    :goto_2
    iget-object v2, p0, LFg/c;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v2, v0, v1}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_6
    :goto_3
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 4

    const-string v0, "onError called with a null Throwable."

    invoke-static {p1, v0}, Lzg/h;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v0, p0, LFg/c;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LFg/c;->d:[LFg/c$a;

    if-ne v0, v1, :cond_0

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iput-object p1, p0, LFg/c;->c:Ljava/lang/Throwable;

    iget-object v0, p0, LFg/c;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LFg/c$a;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3, p1}, LFg/c$a;->g(Ljava/lang/Throwable;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method
