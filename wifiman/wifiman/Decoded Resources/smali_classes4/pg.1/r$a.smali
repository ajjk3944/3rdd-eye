.class final Lpg/r$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpg/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:Lgg/d;

.field final b:Lhg/b;

.field final c:Lzg/c;

.field final d:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method constructor <init>(Lgg/d;Lhg/b;Lzg/c;Ljava/util/concurrent/atomic/AtomicInteger;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpg/r$a;->a:Lgg/d;

    iput-object p2, p0, Lpg/r$a;->b:Lhg/b;

    iput-object p3, p0, Lpg/r$a;->c:Lzg/c;

    iput-object p4, p0, Lpg/r$a;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    invoke-virtual {p0}, Lpg/r$a;->b()V

    return-void
.end method

.method b()V
    .locals 2

    iget-object v0, p0, Lpg/r$a;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lpg/r$a;->c:Lzg/c;

    iget-object v1, p0, Lpg/r$a;->a:Lgg/d;

    invoke-virtual {v0, v1}, Lzg/c;->l(Lgg/d;)V

    :cond_0
    return-void
.end method

.method public c(Lhg/c;)V
    .locals 1

    iget-object v0, p0, Lpg/r$a;->b:Lhg/b;

    invoke-virtual {v0, p1}, Lhg/b;->a(Lhg/c;)Z

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lpg/r$a;->c:Lzg/c;

    invoke-virtual {v0, p1}, Lzg/c;->g(Ljava/lang/Throwable;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lpg/r$a;->b()V

    :cond_0
    return-void
.end method
