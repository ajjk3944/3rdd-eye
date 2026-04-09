.class final Lug/A$b;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lhg/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lug/A;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field final a:Lgg/B;

.field final b:Lkg/n;

.field final c:[Lug/A$c;

.field d:[Ljava/lang/Object;


# direct methods
.method constructor <init>(Lgg/B;ILkg/n;)V
    .locals 1

    invoke-direct {p0, p2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p1, p0, Lug/A$b;->a:Lgg/B;

    iput-object p3, p0, Lug/A$b;->b:Lkg/n;

    new-array p1, p2, [Lug/A$c;

    const/4 p3, 0x0

    :goto_0
    if-ge p3, p2, :cond_0

    new-instance v0, Lug/A$c;

    invoke-direct {v0, p0, p3}, Lug/A$c;-><init>(Lug/A$b;I)V

    aput-object v0, p1, p3

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_0
    iput-object p1, p0, Lug/A$b;->c:[Lug/A$c;

    new-array p1, p2, [Ljava/lang/Object;

    iput-object p1, p0, Lug/A$b;->d:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method a(I)V
    .locals 4

    iget-object v0, p0, Lug/A$b;->c:[Lug/A$c;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lug/A$c;->a()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    add-int/lit8 p1, p1, 0x1

    if-ge p1, v1, :cond_1

    aget-object v2, v0, p1

    invoke-virtual {v2}, Lug/A$c;->a()V

    goto :goto_1

    :cond_1
    return-void
.end method

.method c(Ljava/lang/Throwable;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndSet(I)I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0, p2}, Lug/A$b;->a(I)V

    const/4 p2, 0x0

    iput-object p2, p0, Lug/A$b;->d:[Ljava/lang/Object;

    iget-object p2, p0, Lug/A$b;->a:Lgg/B;

    invoke-interface {p2, p1}, Lgg/B;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method d(Ljava/lang/Object;I)V
    .locals 1

    iget-object v0, p0, Lug/A$b;->d:[Ljava/lang/Object;

    if-eqz v0, :cond_0

    aput-object p1, v0, p2

    :cond_0
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x0

    :try_start_0
    iget-object p2, p0, Lug/A$b;->b:Lkg/n;

    invoke-interface {p2, v0}, Lkg/n;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    const-string v0, "The zipper returned a null value"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object p1, p0, Lug/A$b;->d:[Ljava/lang/Object;

    iget-object p1, p0, Lug/A$b;->a:Lgg/B;

    invoke-interface {p1, p2}, Lgg/B;->onSuccess(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p2

    invoke-static {p2}, Lig/a;->b(Ljava/lang/Throwable;)V

    iput-object p1, p0, Lug/A$b;->d:[Ljava/lang/Object;

    iget-object p1, p0, Lug/A$b;->a:Lgg/B;

    invoke-interface {p1, p2}, Lgg/B;->onError(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public dispose()V
    .locals 4

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndSet(I)I

    move-result v1

    if-lez v1, :cond_1

    iget-object v1, p0, Lug/A$b;->c:[Lug/A$c;

    array-length v2, v1

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, v1, v0

    invoke-virtual {v3}, Lug/A$c;->a()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lug/A$b;->d:[Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public isDisposed()Z
    .locals 1

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
