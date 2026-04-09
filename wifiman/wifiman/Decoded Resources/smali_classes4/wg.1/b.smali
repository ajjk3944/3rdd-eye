.class public final Lwg/b;
.super Lgg/y;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwg/b$c;,
        Lwg/b$a;,
        Lwg/b$b;
    }
.end annotation


# static fields
.field static final e:Lwg/b$b;

.field static final f:Lwg/j;

.field static final g:I

.field static final h:Lwg/b$c;


# instance fields
.field final c:Ljava/util/concurrent/ThreadFactory;

.field final d:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0

    const-string v1, "rx3.computation-threads"

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ljava/lang/Integer;->getInteger(Ljava/lang/String;I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v0, v1}, Lwg/b;->i(II)I

    move-result v0

    sput v0, Lwg/b;->g:I

    new-instance v0, Lwg/b$c;

    new-instance v1, Lwg/j;

    const-string v3, "RxComputationShutdown"

    invoke-direct {v1, v3}, Lwg/j;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lwg/b$c;-><init>(Ljava/util/concurrent/ThreadFactory;)V

    sput-object v0, Lwg/b;->h:Lwg/b$c;

    invoke-virtual {v0}, Lwg/h;->dispose()V

    const-string v0, "rx3.computation-priority"

    const/4 v1, 0x5

    invoke-static {v0, v1}, Ljava/lang/Integer;->getInteger(Ljava/lang/String;I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0xa

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v1, 0x1

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    new-instance v3, Lwg/j;

    const-string v4, "RxComputationThreadPool"

    invoke-direct {v3, v4, v0, v1}, Lwg/j;-><init>(Ljava/lang/String;IZ)V

    sput-object v3, Lwg/b;->f:Lwg/j;

    new-instance v0, Lwg/b$b;

    invoke-direct {v0, v2, v3}, Lwg/b$b;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    sput-object v0, Lwg/b;->e:Lwg/b$b;

    invoke-virtual {v0}, Lwg/b$b;->b()V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Lwg/b;->f:Lwg/j;

    invoke-direct {p0, v0}, Lwg/b;-><init>(Ljava/util/concurrent/ThreadFactory;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/ThreadFactory;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Lgg/y;-><init>()V

    .line 3
    iput-object p1, p0, Lwg/b;->c:Ljava/util/concurrent/ThreadFactory;

    .line 4
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v0, Lwg/b;->e:Lwg/b$b;

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lwg/b;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 5
    invoke-virtual {p0}, Lwg/b;->j()V

    return-void
.end method

.method static i(II)I
    .locals 0

    if-lez p1, :cond_1

    if-le p1, p0, :cond_0

    goto :goto_0

    :cond_0
    move p0, p1

    :cond_1
    :goto_0
    return p0
.end method


# virtual methods
.method public c()Lgg/y$c;
    .locals 2

    new-instance v0, Lwg/b$a;

    iget-object v1, p0, Lwg/b;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwg/b$b;

    invoke-virtual {v1}, Lwg/b$b;->a()Lwg/b$c;

    move-result-object v1

    invoke-direct {v0, v1}, Lwg/b$a;-><init>(Lwg/b$c;)V

    return-object v0
.end method

.method public f(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lhg/c;
    .locals 1

    iget-object v0, p0, Lwg/b;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwg/b$b;

    invoke-virtual {v0}, Lwg/b$b;->a()Lwg/b$c;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Lwg/h;->f(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lhg/c;

    move-result-object p1

    return-object p1
.end method

.method public g(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Lhg/c;
    .locals 8

    iget-object v0, p0, Lwg/b;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwg/b$b;

    invoke-virtual {v0}, Lwg/b$b;->a()Lwg/b$c;

    move-result-object v1

    move-object v2, p1

    move-wide v3, p2

    move-wide v5, p4

    move-object v7, p6

    invoke-virtual/range {v1 .. v7}, Lwg/h;->g(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Lhg/c;

    move-result-object p1

    return-object p1
.end method

.method public h()V
    .locals 2

    iget-object v0, p0, Lwg/b;->d:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Lwg/b;->e:Lwg/b$b;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwg/b$b;

    if-eq v0, v1, :cond_0

    invoke-virtual {v0}, Lwg/b$b;->b()V

    :cond_0
    return-void
.end method

.method public j()V
    .locals 3

    new-instance v0, Lwg/b$b;

    sget v1, Lwg/b;->g:I

    iget-object v2, p0, Lwg/b;->c:Ljava/util/concurrent/ThreadFactory;

    invoke-direct {v0, v1, v2}, Lwg/b$b;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    iget-object v1, p0, Lwg/b;->d:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v2, Lwg/b;->e:Lwg/b$b;

    invoke-static {v1, v2, v0}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lwg/b$b;->b()V

    :cond_0
    return-void
.end method
