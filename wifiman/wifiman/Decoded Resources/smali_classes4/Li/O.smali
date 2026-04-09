.class final LLi/O;
.super LMi/a;
.source "SourceFile"

# interfaces
.implements LLi/z;
.implements LLi/g;
.implements LMi/o;


# static fields
.field private static final synthetic f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _state$volatile:Ljava/lang/Object;

.field private e:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Ljava/lang/Object;

    const-string v1, "_state$volatile"

    const-class v2, LLi/O;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LLi/O;->f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, LMi/a;-><init>()V

    iput-object p1, p0, LLi/O;->_state$volatile:Ljava/lang/Object;

    return-void
.end method

.method private static final synthetic r()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .locals 1

    sget-object v0, LLi/O;->f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method

.method private final s(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    monitor-enter p0

    :try_start_0
    invoke-static {}, LLi/O;->r()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    monitor-exit p0

    return v2

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_0
    :try_start_1
    invoke-static {v1, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p1, :cond_1

    monitor-exit p0

    return v0

    :cond_1
    :try_start_2
    invoke-static {}, LLi/O;->r()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p1

    invoke-virtual {p1, p0, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    iget p1, p0, LLi/O;->e:I

    and-int/lit8 p2, p1, 0x1

    if-nez p2, :cond_5

    add-int/2addr p1, v0

    iput p1, p0, LLi/O;->e:I

    invoke-virtual {p0}, LMi/a;->o()[LMi/c;

    move-result-object p2

    sget-object v1, LYg/J;->a:LYg/J;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    :goto_0
    check-cast p2, [LLi/Q;

    if-eqz p2, :cond_3

    array-length v1, p2

    move v3, v2

    :goto_1
    if-ge v3, v1, :cond_3

    aget-object v4, p2, v3

    if-eqz v4, :cond_2

    invoke-virtual {v4}, LLi/Q;->g()V

    :cond_2
    add-int/2addr v3, v0

    goto :goto_1

    :cond_3
    monitor-enter p0

    :try_start_3
    iget p2, p0, LLi/O;->e:I

    if-ne p2, p1, :cond_4

    add-int/2addr p1, v0

    iput p1, p0, LLi/O;->e:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit p0

    return v0

    :catchall_1
    move-exception p1

    goto :goto_2

    :cond_4
    :try_start_4
    invoke-virtual {p0}, LMi/a;->o()[LMi/c;

    move-result-object p1

    sget-object v1, LYg/J;->a:LYg/J;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    monitor-exit p0

    move v5, p2

    move-object p2, p1

    move p1, v5

    goto :goto_0

    :goto_2
    monitor-exit p0

    throw p1

    :cond_5
    add-int/lit8 p1, p1, 0x2

    :try_start_5
    iput p1, p0, LLi/O;->e:I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    monitor-exit p0

    return v0

    :goto_3
    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LLi/O;->setValue(Ljava/lang/Object;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public b(LLi/h;Ldh/e;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p2, LLi/O$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LLi/O$a;

    iget v1, v0, LLi/O$a;->h:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LLi/O$a;->h:I

    goto :goto_0

    :cond_0
    new-instance v0, LLi/O$a;

    invoke-direct {v0, p0, p2}, LLi/O$a;-><init>(LLi/O;Ldh/e;)V

    :goto_0
    iget-object p2, v0, LLi/O$a;->f:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LLi/O$a;->h:I

    const/4 v3, 0x0

    const/4 v4, 0x3

    const/4 v5, 0x2

    if-eqz v2, :cond_4

    const/4 p1, 0x1

    if-eq v2, p1, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, LLi/O$a;->e:Ljava/lang/Object;

    iget-object v2, v0, LLi/O$a;->d:Ljava/lang/Object;

    check-cast v2, LIi/y0;

    iget-object v6, v0, LLi/O$a;->c:Ljava/lang/Object;

    check-cast v6, LLi/Q;

    iget-object v7, v0, LLi/O$a;->b:Ljava/lang/Object;

    check-cast v7, LLi/h;

    iget-object v8, v0, LLi/O$a;->a:Ljava/lang/Object;

    check-cast v8, LLi/O;

    :try_start_0
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, LLi/O$a;->e:Ljava/lang/Object;

    iget-object v2, v0, LLi/O$a;->d:Ljava/lang/Object;

    check-cast v2, LIi/y0;

    iget-object v6, v0, LLi/O$a;->c:Ljava/lang/Object;

    check-cast v6, LLi/Q;

    iget-object v7, v0, LLi/O$a;->b:Ljava/lang/Object;

    check-cast v7, LLi/h;

    iget-object v8, v0, LLi/O$a;->a:Ljava/lang/Object;

    check-cast v8, LLi/O;

    :try_start_1
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_4

    :cond_3
    iget-object p1, v0, LLi/O$a;->c:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, LLi/Q;

    iget-object p1, v0, LLi/O$a;->b:Ljava/lang/Object;

    check-cast p1, LLi/h;

    iget-object v2, v0, LLi/O$a;->a:Ljava/lang/Object;

    move-object v8, v2

    check-cast v8, LLi/O;

    :try_start_2
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :cond_4
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    invoke-virtual {p0}, LMi/a;->g()LMi/c;

    move-result-object p2

    check-cast p2, LLi/Q;

    move-object v8, p0

    move-object v6, p2

    :goto_1
    :try_start_3
    invoke-interface {v0}, Ldh/e;->getContext()Ldh/i;

    move-result-object p2

    sget-object v2, LIi/y0;->O:LIi/y0$b;

    invoke-interface {p2, v2}, Ldh/i;->get(Ldh/i$c;)Ldh/i$b;

    move-result-object p2

    check-cast p2, LIi/y0;

    move-object v7, p1

    move-object v2, p2

    move-object p1, v3

    :cond_5
    :goto_2
    invoke-static {}, LLi/O;->r()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p2

    invoke-virtual {p2, v8}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-eqz v2, :cond_6

    invoke-static {v2}, LIi/A0;->k(LIi/y0;)V

    :cond_6
    if-eqz p1, :cond_7

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_a

    :cond_7
    sget-object p1, LMi/r;->a:LNi/C;

    if-ne p2, p1, :cond_8

    move-object p1, v3

    goto :goto_3

    :cond_8
    move-object p1, p2

    :goto_3
    iput-object v8, v0, LLi/O$a;->a:Ljava/lang/Object;

    iput-object v7, v0, LLi/O$a;->b:Ljava/lang/Object;

    iput-object v6, v0, LLi/O$a;->c:Ljava/lang/Object;

    iput-object v2, v0, LLi/O$a;->d:Ljava/lang/Object;

    iput-object p2, v0, LLi/O$a;->e:Ljava/lang/Object;

    iput v5, v0, LLi/O$a;->h:I

    invoke-interface {v7, p1, v0}, LLi/h;->a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    return-object v1

    :cond_9
    move-object p1, p2

    :cond_a
    :goto_4
    invoke-virtual {v6}, LLi/Q;->h()Z

    move-result p2

    if-nez p2, :cond_5

    iput-object v8, v0, LLi/O$a;->a:Ljava/lang/Object;

    iput-object v7, v0, LLi/O$a;->b:Ljava/lang/Object;

    iput-object v6, v0, LLi/O$a;->c:Ljava/lang/Object;

    iput-object v2, v0, LLi/O$a;->d:Ljava/lang/Object;

    iput-object p1, v0, LLi/O$a;->e:Ljava/lang/Object;

    iput v4, v0, LLi/O$a;->h:I

    invoke-virtual {v6, v0}, LLi/Q;->e(Ldh/e;)Ljava/lang/Object;

    move-result-object p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-ne p2, v1, :cond_5

    return-object v1

    :goto_5
    invoke-virtual {v8, v6}, LMi/a;->m(LMi/c;)V

    throw p1
.end method

.method public c(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    if-nez p1, :cond_0

    sget-object p1, LMi/r;->a:LNi/C;

    :cond_0
    if-nez p2, :cond_1

    sget-object p2, LMi/r;->a:LNi/C;

    :cond_1
    invoke-direct {p0, p1, p2}, LLi/O;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public d(Ldh/i;ILKi/a;)LLi/g;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LLi/P;->d(LLi/N;Ldh/i;ILKi/a;)LLi/g;

    move-result-object p1

    return-object p1
.end method

.method public getValue()Ljava/lang/Object;
    .locals 2

    sget-object v0, LMi/r;->a:LNi/C;

    invoke-static {}, LLi/O;->r()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_0

    const/4 v1, 0x0

    :cond_0
    return-object v1
.end method

.method public h()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "MutableStateFlow.resetReplayCache is not supported"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge synthetic i()LMi/c;
    .locals 1

    invoke-virtual {p0}, LLi/O;->p()LLi/Q;

    move-result-object v0

    return-object v0
.end method

.method public j(Ljava/lang/Object;)Z
    .locals 0

    invoke-virtual {p0, p1}, LLi/O;->setValue(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public bridge synthetic k(I)[LMi/c;
    .locals 0

    invoke-virtual {p0, p1}, LLi/O;->q(I)[LLi/Q;

    move-result-object p1

    return-object p1
.end method

.method protected p()LLi/Q;
    .locals 1

    new-instance v0, LLi/Q;

    invoke-direct {v0}, LLi/Q;-><init>()V

    return-object v0
.end method

.method protected q(I)[LLi/Q;
    .locals 0

    new-array p1, p1, [LLi/Q;

    return-object p1
.end method

.method public setValue(Ljava/lang/Object;)V
    .locals 1

    if-nez p1, :cond_0

    sget-object p1, LMi/r;->a:LNi/C;

    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, LLi/O;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method
