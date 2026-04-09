.class public final Lpg/r;
.super Lgg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpg/r$a;,
        Lpg/r$b;
    }
.end annotation


# instance fields
.field final a:[Lgg/f;


# direct methods
.method public constructor <init>([Lgg/f;)V
    .locals 0

    invoke-direct {p0}, Lgg/b;-><init>()V

    iput-object p1, p0, Lpg/r;->a:[Lgg/f;

    return-void
.end method


# virtual methods
.method public V(Lgg/d;)V
    .locals 8

    new-instance v0, Lhg/b;

    invoke-direct {v0}, Lhg/b;-><init>()V

    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    iget-object v2, p0, Lpg/r;->a:[Lgg/f;

    array-length v2, v2

    add-int/lit8 v2, v2, 0x1

    invoke-direct {v1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    new-instance v2, Lzg/c;

    invoke-direct {v2}, Lzg/c;-><init>()V

    new-instance v3, Lpg/r$b;

    invoke-direct {v3, v2}, Lpg/r$b;-><init>(Lzg/c;)V

    invoke-virtual {v0, v3}, Lhg/b;->a(Lhg/c;)Z

    invoke-interface {p1, v0}, Lgg/d;->c(Lhg/c;)V

    iget-object v3, p0, Lpg/r;->a:[Lgg/f;

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_2

    aget-object v6, v3, v5

    invoke-virtual {v0}, Lhg/b;->isDisposed()Z

    move-result v7

    if-eqz v7, :cond_0

    return-void

    :cond_0
    if-nez v6, :cond_1

    new-instance v6, Ljava/lang/NullPointerException;

    const-string v7, "A completable source is null"

    invoke-direct {v6, v7}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v6}, Lzg/c;->g(Ljava/lang/Throwable;)Z

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    goto :goto_1

    :cond_1
    new-instance v7, Lpg/r$a;

    invoke-direct {v7, p1, v0, v2, v1}, Lpg/r$a;-><init>(Lgg/d;Lhg/b;Lzg/c;Ljava/util/concurrent/atomic/AtomicInteger;)V

    invoke-interface {v6, v7}, Lgg/f;->e(Lgg/d;)V

    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {v2, p1}, Lzg/c;->l(Lgg/d;)V

    :cond_3
    return-void
.end method
