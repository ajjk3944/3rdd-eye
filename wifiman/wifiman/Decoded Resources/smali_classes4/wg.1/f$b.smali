.class final Lwg/f$b;
.super Lgg/y$c;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private final a:Lhg/b;

.field private final b:Lwg/f$a;

.field private final c:Lwg/f$c;

.field final d:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method constructor <init>(Lwg/f$a;)V
    .locals 1

    invoke-direct {p0}, Lgg/y$c;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Lwg/f$b;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p1, p0, Lwg/f$b;->b:Lwg/f$a;

    new-instance v0, Lhg/b;

    invoke-direct {v0}, Lhg/b;-><init>()V

    iput-object v0, p0, Lwg/f$b;->a:Lhg/b;

    invoke-virtual {p1}, Lwg/f$a;->b()Lwg/f$c;

    move-result-object p1

    iput-object p1, p0, Lwg/f$b;->c:Lwg/f$c;

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lhg/c;
    .locals 6

    iget-object v0, p0, Lwg/f$b;->a:Lhg/b;

    invoke-virtual {v0}, Lhg/b;->isDisposed()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Llg/c;->INSTANCE:Llg/c;

    return-object p1

    :cond_0
    iget-object v0, p0, Lwg/f$b;->c:Lwg/f$c;

    iget-object v5, p0, Lwg/f$b;->a:Lhg/b;

    move-object v1, p1

    move-wide v2, p2

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Lwg/h;->e(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;Lhg/d;)Lwg/m;

    move-result-object p1

    return-object p1
.end method

.method public dispose()V
    .locals 7

    iget-object v0, p0, Lwg/f$b;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lwg/f$b;->a:Lhg/b;

    invoke-virtual {v0}, Lhg/b;->dispose()V

    sget-boolean v0, Lwg/f;->j:Z

    if-eqz v0, :cond_0

    iget-object v1, p0, Lwg/f$b;->c:Lwg/f$c;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    const/4 v6, 0x0

    const-wide/16 v3, 0x0

    move-object v2, p0

    invoke-virtual/range {v1 .. v6}, Lwg/h;->e(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;Lhg/d;)Lwg/m;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lwg/f$b;->b:Lwg/f$a;

    iget-object v1, p0, Lwg/f$b;->c:Lwg/f$c;

    invoke-virtual {v0, v1}, Lwg/f$a;->d(Lwg/f$c;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public isDisposed()Z
    .locals 1

    iget-object v0, p0, Lwg/f$b;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public run()V
    .locals 2

    iget-object v0, p0, Lwg/f$b;->b:Lwg/f$a;

    iget-object v1, p0, Lwg/f$b;->c:Lwg/f$c;

    invoke-virtual {v0, v1}, Lwg/f$a;->d(Lwg/f$c;)V

    return-void
.end method
