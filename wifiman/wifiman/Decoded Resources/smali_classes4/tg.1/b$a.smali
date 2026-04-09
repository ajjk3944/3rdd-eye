.class final Ltg/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhg/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:Lgg/x;

.field final b:[Ltg/b$b;

.field final c:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method constructor <init>(Lgg/x;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Ltg/b$a;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object p1, p0, Ltg/b$a;->a:Lgg/x;

    new-array p1, p2, [Ltg/b$b;

    iput-object p1, p0, Ltg/b$a;->b:[Ltg/b$b;

    return-void
.end method


# virtual methods
.method public a([Lgg/v;)V
    .locals 7

    iget-object v0, p0, Ltg/b$a;->b:[Ltg/b$b;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    new-instance v4, Ltg/b$b;

    add-int/lit8 v5, v3, 0x1

    iget-object v6, p0, Ltg/b$a;->a:Lgg/x;

    invoke-direct {v4, p0, v5, v6}, Ltg/b$b;-><init>(Ltg/b$a;ILgg/x;)V

    aput-object v4, v0, v3

    move v3, v5

    goto :goto_0

    :cond_0
    iget-object v3, p0, Ltg/b$a;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v3, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->lazySet(I)V

    iget-object v3, p0, Ltg/b$a;->a:Lgg/x;

    invoke-interface {v3, p0}, Lgg/x;->c(Lhg/c;)V

    :goto_1
    if-ge v2, v1, :cond_2

    iget-object v3, p0, Ltg/b$a;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v3

    if-eqz v3, :cond_1

    return-void

    :cond_1
    aget-object v3, p1, v2

    aget-object v4, v0, v2

    invoke-interface {v3, v4}, Lgg/v;->d(Lgg/x;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public b(I)Z
    .locals 4

    iget-object v0, p0, Ltg/b$a;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_2

    iget-object v0, p0, Ltg/b$a;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, v1, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ltg/b$a;->b:[Ltg/b$b;

    array-length v2, v0

    :goto_0
    if-ge v1, v2, :cond_1

    add-int/lit8 v3, v1, 0x1

    if-eq v3, p1, :cond_0

    aget-object v1, v0, v1

    invoke-virtual {v1}, Ltg/b$b;->d()V

    :cond_0
    move v1, v3

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    return v1
.end method

.method public dispose()V
    .locals 4

    iget-object v0, p0, Ltg/b$a;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Ltg/b$a;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->lazySet(I)V

    iget-object v0, p0, Ltg/b$a;->b:[Ltg/b$b;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Ltg/b$b;->d()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public isDisposed()Z
    .locals 2

    iget-object v0, p0, Ltg/b$a;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
