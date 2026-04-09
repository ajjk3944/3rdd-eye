.class public final LPi/c;
.super LIi/a;
.source "SourceFile"

# interfaces
.implements LDj/c;


# static fields
.field private static final synthetic f:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field private static final synthetic g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile cancellationRequested:Z

.field public final d:LLi/g;

.field public final e:LDj/b;

.field private volatile synthetic producer$volatile:Ljava/lang/Object;

.field private volatile synthetic requested$volatile:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "requested$volatile"

    const-class v1, LPi/c;

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    sput-object v0, LPi/c;->f:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-class v0, Ljava/lang/Object;

    const-string v2, "producer$volatile"

    invoke-static {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LPi/c;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(LLi/g;LDj/b;Ldh/i;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, p3, v0, v1}, LIi/a;-><init>(Ldh/i;ZZ)V

    iput-object p1, p0, LPi/c;->d:LLi/g;

    iput-object p2, p0, LPi/c;->e:LDj/b;

    invoke-direct {p0}, LPi/c;->V0()Ldh/e;

    move-result-object p1

    iput-object p1, p0, LPi/c;->producer$volatile:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic R0(LPi/c;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, LPi/c;->W0(Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic S0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .locals 1

    invoke-static {}, LPi/c;->X0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic T0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
    .locals 1

    invoke-static {}, LPi/c;->Y0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    return-object v0
.end method

.method private final U0(Ldh/e;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LPi/c;->d:LLi/g;

    new-instance v1, LPi/c$a;

    invoke-direct {v1, p0}, LPi/c$a;-><init>(LPi/c;)V

    invoke-interface {v0, v1, p1}, LLi/g;->b(LLi/h;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method private final V0()Ldh/e;
    .locals 2

    invoke-virtual {p0}, LIi/a;->getCoroutineContext()Ldh/i;

    move-result-object v0

    new-instance v1, LPi/c$b;

    invoke-direct {v1, v0, p0}, LPi/c$b;-><init>(Ldh/i;LPi/c;)V

    return-object v1
.end method

.method private final W0(Ldh/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, LPi/c$d;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LPi/c$d;

    iget v1, v0, LPi/c$d;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LPi/c$d;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, LPi/c$d;

    invoke-direct {v0, p0, p1}, LPi/c$d;-><init>(LPi/c;Ldh/e;)V

    :goto_0
    iget-object p1, v0, LPi/c$d;->b:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LPi/c$d;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, LPi/c$d;->a:Ljava/lang/Object;

    check-cast v0, LPi/c;

    :try_start_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_1
    iput-object p0, v0, LPi/c$d;->a:Ljava/lang/Object;

    iput v3, v0, LPi/c$d;->d:I

    invoke-direct {p0, v0}, LPi/c;->U0(Ldh/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    :try_start_2
    iget-object p1, v0, LPi/c;->e:LDj/b;

    invoke-interface {p1}, LDj/b;->a()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, LIi/a;->getCoroutineContext()Ldh/i;

    move-result-object v0

    invoke-static {v0, p1}, LIi/L;->a(Ldh/i;Ljava/lang/Throwable;)V

    :goto_2
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :catchall_2
    move-exception p1

    move-object v0, p0

    :goto_3
    iget-boolean v1, v0, LPi/c;->cancellationRequested:Z

    if-eqz v1, :cond_4

    invoke-virtual {v0}, LIi/a;->isActive()Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {v0}, LIi/D0;->getCancellationException()Ljava/util/concurrent/CancellationException;

    move-result-object v1

    if-eq p1, v1, :cond_5

    :cond_4
    :try_start_3
    iget-object v1, v0, LPi/c;->e:LDj/b;

    invoke-interface {v1, p1}, LDj/b;->onError(Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_4

    :catchall_3
    move-exception v1

    invoke-static {p1, v1}, LYg/g;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    invoke-virtual {v0}, LIi/a;->getCoroutineContext()Ldh/i;

    move-result-object v0

    invoke-static {v0, p1}, LIi/L;->a(Ldh/i;Ljava/lang/Throwable;)V

    :cond_5
    :goto_4
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method private static final synthetic X0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .locals 1

    sget-object v0, LPi/c;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method

.method private static final synthetic Y0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
    .locals 1

    sget-object v0, LPi/c;->f:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    return-object v0
.end method


# virtual methods
.method public cancel()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LPi/c;->cancellationRequested:Z

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LIi/D0;->cancel(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public request(J)V
    .locals 11

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-gtz v2, :cond_0

    return-void

    :cond_0
    invoke-static {}, LPi/c;->Y0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v2

    :cond_1
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v9

    add-long v3, v9, p1

    cmp-long v5, v3, v0

    if-gtz v5, :cond_2

    const-wide v3, 0x7fffffffffffffffL

    :cond_2
    move-wide v7, v3

    move-object v3, v2

    move-object v4, p0

    move-wide v5, v9

    invoke-virtual/range {v3 .. v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v3

    if-eqz v3, :cond_1

    cmp-long p1, v9, v0

    if-gtz p1, :cond_4

    :goto_0
    invoke-static {}, LPi/c;->X0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p0, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ldh/e;

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    sget-object p2, LYg/u;->b:LYg/u$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-static {p2}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p1, p2}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    :cond_4
    return-void
.end method
