.class abstract Le2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le2/c$e;,
        Le2/c$h;,
        Le2/c$f;,
        Le2/c$g;
    }
.end annotation


# static fields
.field private static final f:Ljava/util/concurrent/ThreadFactory;

.field private static final g:Ljava/util/concurrent/BlockingQueue;

.field public static final h:Ljava/util/concurrent/Executor;

.field private static i:Le2/c$f;

.field private static volatile j:Ljava/util/concurrent/Executor;


# instance fields
.field private final a:Le2/c$h;

.field private final b:Ljava/util/concurrent/FutureTask;

.field private volatile c:Le2/c$g;

.field final d:Ljava/util/concurrent/atomic/AtomicBoolean;

.field final e:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v7, Le2/c$a;

    invoke-direct {v7}, Le2/c$a;-><init>()V

    sput-object v7, Le2/c;->f:Ljava/util/concurrent/ThreadFactory;

    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    const/16 v0, 0xa

    invoke-direct {v6, v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    sput-object v6, Le2/c;->g:Ljava/util/concurrent/BlockingQueue;

    new-instance v8, Ljava/util/concurrent/ThreadPoolExecutor;

    const-wide/16 v3, 0x1

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const/4 v1, 0x5

    const/16 v2, 0x80

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    sput-object v8, Le2/c;->h:Ljava/util/concurrent/Executor;

    sput-object v8, Le2/c;->j:Ljava/util/concurrent/Executor;

    return-void
.end method

.method constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Le2/c$g;->PENDING:Le2/c$g;

    iput-object v0, p0, Le2/c;->c:Le2/c$g;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Le2/c;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Le2/c;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Le2/c$b;

    invoke-direct {v0, p0}, Le2/c$b;-><init>(Le2/c;)V

    iput-object v0, p0, Le2/c;->a:Le2/c$h;

    new-instance v1, Le2/c$c;

    invoke-direct {v1, p0, v0}, Le2/c$c;-><init>(Le2/c;Ljava/util/concurrent/Callable;)V

    iput-object v1, p0, Le2/c;->b:Ljava/util/concurrent/FutureTask;

    return-void
.end method

.method private static e()Landroid/os/Handler;
    .locals 2

    const-class v0, Le2/c;

    monitor-enter v0

    :try_start_0
    sget-object v1, Le2/c;->i:Le2/c$f;

    if-nez v1, :cond_0

    new-instance v1, Le2/c$f;

    invoke-direct {v1}, Le2/c$f;-><init>()V

    sput-object v1, Le2/c;->i:Le2/c$f;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v1, Le2/c;->i:Le2/c$f;

    monitor-exit v0

    return-object v1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public final a(Z)Z
    .locals 2

    iget-object v0, p0, Le2/c;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v0, p0, Le2/c;->b:Ljava/util/concurrent/FutureTask;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/FutureTask;->cancel(Z)Z

    move-result p1

    return p1
.end method

.method protected varargs abstract b([Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public final varargs c(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Le2/c;
    .locals 2

    iget-object v0, p0, Le2/c;->c:Le2/c$g;

    sget-object v1, Le2/c$g;->PENDING:Le2/c$g;

    if-eq v0, v1, :cond_2

    sget-object p1, Le2/c$d;->a:[I

    iget-object p2, p0, Le2/c;->c:Le2/c$g;

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    const/4 p2, 0x1

    if-eq p1, p2, :cond_1

    const/4 p2, 0x2

    if-eq p1, p2, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "We should never reach this state"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot execute task: the task has already been executed (a task can be executed only once)"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot execute task: the task is already running."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    sget-object v0, Le2/c$g;->RUNNING:Le2/c$g;

    iput-object v0, p0, Le2/c;->c:Le2/c$g;

    invoke-virtual {p0}, Le2/c;->i()V

    iget-object v0, p0, Le2/c;->a:Le2/c$h;

    iput-object p2, v0, Le2/c$h;->a:[Ljava/lang/Object;

    iget-object p2, p0, Le2/c;->b:Ljava/util/concurrent/FutureTask;

    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-object p0
.end method

.method d(Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, Le2/c;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Le2/c;->g(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Le2/c;->h(Ljava/lang/Object;)V

    :goto_0
    sget-object p1, Le2/c$g;->FINISHED:Le2/c$g;

    iput-object p1, p0, Le2/c;->c:Le2/c$g;

    return-void
.end method

.method public final f()Z
    .locals 1

    iget-object v0, p0, Le2/c;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method protected abstract g(Ljava/lang/Object;)V
.end method

.method protected abstract h(Ljava/lang/Object;)V
.end method

.method protected i()V
    .locals 0

    return-void
.end method

.method protected varargs j([Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Le2/c;->e()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Le2/c$e;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Le2/c$e;-><init>(Le2/c;[Ljava/lang/Object;)V

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    return-object p1
.end method

.method l(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Le2/c;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Le2/c;->k(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
