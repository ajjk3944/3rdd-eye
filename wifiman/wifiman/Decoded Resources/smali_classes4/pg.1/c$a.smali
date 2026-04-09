.class final Lpg/c$a;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lgg/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpg/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:Lgg/d;

.field final b:[Lgg/f;

.field c:I

.field final d:Llg/e;


# direct methods
.method constructor <init>(Lgg/d;[Lgg/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Lpg/c$a;->a:Lgg/d;

    iput-object p2, p0, Lpg/c$a;->b:[Lgg/f;

    new-instance p1, Llg/e;

    invoke-direct {p1}, Llg/e;-><init>()V

    iput-object p1, p0, Lpg/c$a;->d:Llg/e;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    invoke-virtual {p0}, Lpg/c$a;->d()V

    return-void
.end method

.method public c(Lhg/c;)V
    .locals 1

    iget-object v0, p0, Lpg/c$a;->d:Llg/e;

    invoke-virtual {v0, p1}, Llg/e;->a(Lhg/c;)Z

    return-void
.end method

.method d()V
    .locals 3

    iget-object v0, p0, Lpg/c$a;->d:Llg/e;

    invoke-virtual {v0}, Llg/e;->isDisposed()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lpg/c$a;->b:[Lgg/f;

    :cond_2
    iget-object v1, p0, Lpg/c$a;->d:Llg/e;

    invoke-virtual {v1}, Llg/e;->isDisposed()Z

    move-result v1

    if-eqz v1, :cond_3

    return-void

    :cond_3
    iget v1, p0, Lpg/c$a;->c:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lpg/c$a;->c:I

    array-length v2, v0

    if-ne v1, v2, :cond_4

    iget-object v0, p0, Lpg/c$a;->a:Lgg/d;

    invoke-interface {v0}, Lgg/d;->a()V

    return-void

    :cond_4
    aget-object v1, v0, v1

    invoke-interface {v1, p0}, Lgg/f;->e(Lgg/d;)V

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v1

    if-nez v1, :cond_2

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lpg/c$a;->a:Lgg/d;

    invoke-interface {v0, p1}, Lgg/d;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
