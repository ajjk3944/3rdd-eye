.class public LIi/D0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LIi/y0;
.implements LIi/w;
.implements LIi/M0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LIi/D0$a;,
        LIi/D0$b;,
        LIi/D0$c;,
        LIi/D0$d;,
        LIi/D0$e;
    }
.end annotation


# static fields
.field private static final synthetic a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field private static final synthetic b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _parentHandle$volatile:Ljava/lang/Object;

.field private volatile synthetic _state$volatile:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "_state$volatile"

    const-class v1, LIi/D0;

    const-class v2, Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LIi/D0;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "_parentHandle$volatile"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LIi/D0;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    invoke-static {}, LIi/E0;->c()LIi/h0;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, LIi/E0;->d()LIi/h0;

    move-result-object p1

    :goto_0
    iput-object p1, p0, LIi/D0;->_state$volatile:Ljava/lang/Object;

    return-void
.end method

.method private final D0(Ljava/lang/Object;)I
    .locals 4

    instance-of v0, p1, LIi/h0;

    const/4 v1, 0x1

    const/4 v2, -0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, LIi/h0;

    invoke-virtual {v0}, LIi/h0;->isActive()Z

    move-result v0

    if-eqz v0, :cond_0

    return v3

    :cond_0
    invoke-static {}, LIi/D0;->a0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-static {}, LIi/E0;->c()LIi/h0;

    move-result-object v3

    invoke-static {v0, p0, p1, v3}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, LIi/D0;->w0()V

    return v1

    :cond_2
    instance-of v0, p1, LIi/t0;

    if-eqz v0, :cond_4

    invoke-static {}, LIi/D0;->a0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    move-object v3, p1

    check-cast v3, LIi/t0;

    invoke-virtual {v3}, LIi/t0;->b()LIi/I0;

    move-result-object v3

    invoke-static {v0, p0, p1, v3}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    invoke-virtual {p0}, LIi/D0;->w0()V

    return v1

    :cond_4
    return v3
.end method

.method private final E0(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    instance-of v0, p1, LIi/D0$c;

    const-string v1, "Active"

    if-eqz v0, :cond_1

    check-cast p1, LIi/D0$c;

    invoke-virtual {p1}, LIi/D0$c;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v1, "Cancelling"

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LIi/D0$c;->j()Z

    move-result p1

    if-eqz p1, :cond_5

    const-string v1, "Completing"

    goto :goto_0

    :cond_1
    instance-of v0, p1, LIi/u0;

    if-eqz v0, :cond_3

    check-cast p1, LIi/u0;

    invoke-interface {p1}, LIi/u0;->isActive()Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const-string v1, "New"

    goto :goto_0

    :cond_3
    instance-of p1, p1, LIi/C;

    if-eqz p1, :cond_4

    const-string v1, "Cancelled"

    goto :goto_0

    :cond_4
    const-string v1, "Completed"

    :cond_5
    :goto_0
    return-object v1
.end method

.method private final F(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    :cond_0
    invoke-virtual {p0}, LIi/D0;->Y()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LIi/u0;

    if-eqz v1, :cond_2

    instance-of v1, v0, LIi/D0$c;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, LIi/D0$c;

    invoke-virtual {v1}, LIi/D0$c;->j()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance v1, LIi/C;

    invoke-direct {p0, p1}, LIi/D0;->M(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct {v1, v2, v5, v3, v4}, LIi/C;-><init>(Ljava/lang/Throwable;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0, v0, v1}, LIi/D0;->K0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, LIi/E0;->b()LNi/C;

    move-result-object v1

    if-eq v0, v1, :cond_0

    return-object v0

    :cond_2
    :goto_0
    invoke-static {}, LIi/E0;->a()LNi/C;

    move-result-object p1

    return-object p1
.end method

.method private final G(Ljava/lang/Throwable;)Z
    .locals 4

    invoke-virtual {p0}, LIi/D0;->i0()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    invoke-virtual {p0}, LIi/D0;->X()LIi/u;

    move-result-object v2

    if-eqz v2, :cond_4

    sget-object v3, LIi/K0;->a:LIi/K0;

    if-ne v2, v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v2, p1}, LIi/u;->a(Ljava/lang/Throwable;)Z

    move-result p1

    if-nez p1, :cond_3

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :cond_3
    :goto_0
    return v1

    :cond_4
    :goto_1
    return v0
.end method

.method public static synthetic G0(LIi/D0;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/concurrent/CancellationException;
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, LIi/D0;->F0(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: toCancellationException"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final I0(LIi/u0;Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, LIi/D0;->a0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-static {p2}, LIi/E0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p1, v1}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LIi/D0;->u0(Ljava/lang/Throwable;)V

    invoke-virtual {p0, p2}, LIi/D0;->v0(Ljava/lang/Object;)V

    invoke-direct {p0, p1, p2}, LIi/D0;->K(LIi/u0;Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method private final J0(LIi/u0;Ljava/lang/Throwable;)Z
    .locals 4

    invoke-direct {p0, p1}, LIi/D0;->W(LIi/u0;)LIi/I0;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    new-instance v2, LIi/D0$c;

    invoke-direct {v2, v0, v1, p2}, LIi/D0$c;-><init>(LIi/I0;ZLjava/lang/Throwable;)V

    invoke-static {}, LIi/D0;->a0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v3

    invoke-static {v3, p0, p1, v2}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    return v1

    :cond_1
    invoke-direct {p0, v0, p2}, LIi/D0;->q0(LIi/I0;Ljava/lang/Throwable;)V

    const/4 p1, 0x1

    return p1
.end method

.method private final K(LIi/u0;Ljava/lang/Object;)V
    .locals 3

    invoke-virtual {p0}, LIi/D0;->X()LIi/u;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, LIi/e0;->dispose()V

    sget-object v0, LIi/K0;->a:LIi/K0;

    invoke-virtual {p0, v0}, LIi/D0;->B0(LIi/u;)V

    :cond_0
    instance-of v0, p2, LIi/C;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p2, LIi/C;

    goto :goto_0

    :cond_1
    move-object p2, v1

    :goto_0
    if-eqz p2, :cond_2

    iget-object v1, p2, LIi/C;->a:Ljava/lang/Throwable;

    :cond_2
    instance-of p2, p1, LIi/C0;

    if-eqz p2, :cond_3

    :try_start_0
    move-object p2, p1

    check-cast p2, LIi/C0;

    invoke-virtual {p2, v1}, LIi/C0;->v(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    new-instance v0, Lkotlinx/coroutines/CompletionHandlerException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception in completion handler "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " for "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Lkotlinx/coroutines/CompletionHandlerException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0, v0}, LIi/D0;->e0(Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_3
    invoke-interface {p1}, LIi/u0;->b()LIi/I0;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-direct {p0, p1, v1}, LIi/D0;->r0(LIi/I0;Ljava/lang/Throwable;)V

    :cond_4
    :goto_1
    return-void
.end method

.method private final K0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p1, LIi/u0;

    if-nez v0, :cond_0

    invoke-static {}, LIi/E0;->a()LNi/C;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, LIi/h0;

    if-nez v0, :cond_1

    instance-of v0, p1, LIi/C0;

    if-eqz v0, :cond_3

    :cond_1
    instance-of v0, p1, LIi/v;

    if-nez v0, :cond_3

    instance-of v0, p2, LIi/C;

    if-nez v0, :cond_3

    check-cast p1, LIi/u0;

    invoke-direct {p0, p1, p2}, LIi/D0;->I0(LIi/u0;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return-object p2

    :cond_2
    invoke-static {}, LIi/E0;->b()LNi/C;

    move-result-object p1

    return-object p1

    :cond_3
    check-cast p1, LIi/u0;

    invoke-direct {p0, p1, p2}, LIi/D0;->L0(LIi/u0;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final L(LIi/D0$c;LIi/v;Ljava/lang/Object;)V
    .locals 2

    invoke-direct {p0, p2}, LIi/D0;->p0(LNi/n;)LIi/v;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, v0, p3}, LIi/D0;->M0(LIi/D0$c;LIi/v;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, LIi/D0$c;->b()LIi/I0;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, LNi/n;->f(I)V

    invoke-direct {p0, p2}, LIi/D0;->p0(LNi/n;)LIi/v;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-direct {p0, p1, p2, p3}, LIi/D0;->M0(LIi/D0$c;LIi/v;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    return-void

    :cond_1
    invoke-direct {p0, p1, p3}, LIi/D0;->N(LIi/D0$c;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, LIi/D0;->w(Ljava/lang/Object;)V

    return-void
.end method

.method private final L0(LIi/u0;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-direct {p0, p1}, LIi/D0;->W(LIi/u0;)LIi/I0;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, LIi/E0;->b()LNi/C;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v1, p1, LIi/D0$c;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v1, p1

    check-cast v1, LIi/D0$c;

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    const/4 v3, 0x0

    if-nez v1, :cond_2

    new-instance v1, LIi/D0$c;

    invoke-direct {v1, v0, v3, v2}, LIi/D0$c;-><init>(LIi/I0;ZLjava/lang/Throwable;)V

    :cond_2
    new-instance v3, Lkotlin/jvm/internal/N;

    invoke-direct {v3}, Lkotlin/jvm/internal/N;-><init>()V

    monitor-enter v1

    :try_start_0
    invoke-virtual {v1}, LIi/D0$c;->j()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {}, LIi/E0;->a()LNi/C;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_3
    const/4 v4, 0x1

    :try_start_1
    invoke-virtual {v1, v4}, LIi/D0$c;->m(Z)V

    if-eq v1, p1, :cond_4

    invoke-static {}, LIi/D0;->a0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v4

    invoke-static {v4, p0, p1, v1}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    invoke-static {}, LIi/E0;->b()LNi/C;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    return-object p1

    :cond_4
    :try_start_2
    invoke-virtual {v1}, LIi/D0$c;->i()Z

    move-result p1

    instance-of v4, p2, LIi/C;

    if-eqz v4, :cond_5

    move-object v4, p2

    check-cast v4, LIi/C;

    goto :goto_1

    :cond_5
    move-object v4, v2

    :goto_1
    if-eqz v4, :cond_6

    iget-object v4, v4, LIi/C;->a:Ljava/lang/Throwable;

    invoke-virtual {v1, v4}, LIi/D0$c;->a(Ljava/lang/Throwable;)V

    :cond_6
    invoke-virtual {v1}, LIi/D0$c;->e()Ljava/lang/Throwable;

    move-result-object v4

    if-nez p1, :cond_7

    move-object v2, v4

    :cond_7
    iput-object v2, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    sget-object p1, LYg/J;->a:LYg/J;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v1

    if-eqz v2, :cond_8

    invoke-direct {p0, v0, v2}, LIi/D0;->q0(LIi/I0;Ljava/lang/Throwable;)V

    :cond_8
    invoke-direct {p0, v0}, LIi/D0;->p0(LNi/n;)LIi/v;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-direct {p0, v1, p1, p2}, LIi/D0;->M0(LIi/D0$c;LIi/v;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    sget-object p1, LIi/E0;->b:LNi/C;

    return-object p1

    :cond_9
    const/4 p1, 0x2

    invoke-virtual {v0, p1}, LNi/n;->f(I)V

    invoke-direct {p0, v0}, LIi/D0;->p0(LNi/n;)LIi/v;

    move-result-object p1

    if-eqz p1, :cond_a

    invoke-direct {p0, v1, p1, p2}, LIi/D0;->M0(LIi/D0$c;LIi/v;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    sget-object p1, LIi/E0;->b:LNi/C;

    return-object p1

    :cond_a
    invoke-direct {p0, v1, p2}, LIi/D0;->N(LIi/D0$c;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :goto_2
    monitor-exit v1

    throw p1
.end method

.method private final M(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 2

    if-nez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ljava/lang/Throwable;

    :goto_0
    if-eqz v0, :cond_1

    check-cast p1, Ljava/lang/Throwable;

    if-nez p1, :cond_2

    new-instance p1, Lkotlinx/coroutines/JobCancellationException;

    invoke-static {p0}, LIi/D0;->m(LIi/D0;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1, p0}, Lkotlinx/coroutines/JobCancellationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;LIi/y0;)V

    goto :goto_1

    :cond_1
    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LIi/M0;

    invoke-interface {p1}, LIi/M0;->d0()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    :cond_2
    :goto_1
    return-object p1
.end method

.method private final M0(LIi/D0$c;LIi/v;Ljava/lang/Object;)Z
    .locals 3

    :cond_0
    iget-object v0, p2, LIi/v;->e:LIi/w;

    new-instance v1, LIi/D0$b;

    invoke-direct {v1, p0, p1, p2, p3}, LIi/D0$b;-><init>(LIi/D0;LIi/D0$c;LIi/v;Ljava/lang/Object;)V

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, LIi/A0;->n(LIi/y0;ZLIi/C0;)LIi/e0;

    move-result-object v0

    sget-object v1, LIi/K0;->a:LIi/K0;

    if-eq v0, v1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    invoke-direct {p0, p2}, LIi/D0;->p0(LNi/n;)LIi/v;

    move-result-object p2

    if-nez p2, :cond_0

    return v2
.end method

.method private final N(LIi/D0$c;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, LIi/C;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LIi/C;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, v0, LIi/C;->a:Ljava/lang/Throwable;

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    monitor-enter p1

    :try_start_0
    invoke-virtual {p1}, LIi/D0$c;->i()Z

    move-result v2

    invoke-virtual {p1, v0}, LIi/D0$c;->l(Ljava/lang/Throwable;)Ljava/util/List;

    move-result-object v3

    invoke-direct {p0, p1, v3}, LIi/D0;->Q(LIi/D0$c;Ljava/util/List;)Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-direct {p0, v4, v3}, LIi/D0;->u(Ljava/lang/Throwable;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p2

    goto :goto_4

    :cond_2
    :goto_2
    monitor-exit p1

    if-nez v4, :cond_3

    goto :goto_3

    :cond_3
    if-ne v4, v0, :cond_4

    goto :goto_3

    :cond_4
    new-instance p2, LIi/C;

    const/4 v0, 0x0

    const/4 v3, 0x2

    invoke-direct {p2, v4, v0, v3, v1}, LIi/C;-><init>(Ljava/lang/Throwable;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_3
    if-eqz v4, :cond_6

    invoke-direct {p0, v4}, LIi/D0;->G(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p0, v4}, LIi/D0;->c0(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_5
    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p2

    check-cast v0, LIi/C;

    invoke-virtual {v0}, LIi/C;->c()Z

    :cond_6
    if-nez v2, :cond_7

    invoke-virtual {p0, v4}, LIi/D0;->u0(Ljava/lang/Throwable;)V

    :cond_7
    invoke-virtual {p0, p2}, LIi/D0;->v0(Ljava/lang/Object;)V

    invoke-static {}, LIi/D0;->a0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-static {p2}, LIi/E0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p1, v1}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-direct {p0, p1, p2}, LIi/D0;->K(LIi/u0;Ljava/lang/Object;)V

    return-object p2

    :goto_4
    monitor-exit p1

    throw p2
.end method

.method private final P(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 2

    instance-of v0, p1, LIi/C;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, LIi/C;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_1

    iget-object v1, p1, LIi/C;->a:Ljava/lang/Throwable;

    :cond_1
    return-object v1
.end method

.method private final Q(LIi/D0$c;Ljava/util/List;)Ljava/lang/Throwable;
    .locals 4

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LIi/D0$c;->i()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lkotlinx/coroutines/JobCancellationException;

    invoke-static {p0}, LIi/D0;->m(LIi/D0;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, v1, p0}, Lkotlinx/coroutines/JobCancellationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;LIi/y0;)V

    return-object p1

    :cond_0
    return-object v1

    :cond_1
    move-object p1, p2

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/Throwable;

    instance-of v3, v3, Ljava/util/concurrent/CancellationException;

    if-nez v3, :cond_2

    goto :goto_0

    :cond_3
    move-object v2, v1

    :goto_0
    check-cast v2, Ljava/lang/Throwable;

    if-eqz v2, :cond_4

    return-object v2

    :cond_4
    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Throwable;

    instance-of v0, p2, Lkotlinx/coroutines/TimeoutCancellationException;

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Throwable;

    if-eq v2, p2, :cond_5

    instance-of v2, v2, Lkotlinx/coroutines/TimeoutCancellationException;

    if-eqz v2, :cond_5

    move-object v1, v0

    :cond_6
    check-cast v1, Ljava/lang/Throwable;

    if-eqz v1, :cond_7

    return-object v1

    :cond_7
    return-object p2
.end method

.method private final W(LIi/u0;)LIi/I0;
    .locals 3

    invoke-interface {p1}, LIi/u0;->b()LIi/I0;

    move-result-object v0

    if-nez v0, :cond_2

    instance-of v0, p1, LIi/h0;

    if-eqz v0, :cond_0

    new-instance v0, LIi/I0;

    invoke-direct {v0}, LIi/I0;-><init>()V

    goto :goto_0

    :cond_0
    instance-of v0, p1, LIi/C0;

    if-eqz v0, :cond_1

    check-cast p1, LIi/C0;

    invoke-direct {p0, p1}, LIi/D0;->y0(LIi/C0;)V

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "State should have list: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    return-object v0
.end method

.method private static final synthetic Z()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .locals 1

    sget-object v0, LIi/D0;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method

.method private static final synthetic a0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .locals 1

    sget-object v0, LIi/D0;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method

.method private final j0()Z
    .locals 2

    :cond_0
    invoke-virtual {p0}, LIi/D0;->Y()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LIi/u0;

    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    invoke-direct {p0, v0}, LIi/D0;->D0(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    return v0
.end method

.method private final k0(Ldh/e;)Ljava/lang/Object;
    .locals 5

    new-instance v0, LIi/p;

    invoke-static {p1}, Leh/b;->d(Ldh/e;)Ldh/e;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LIi/p;-><init>(Ldh/e;I)V

    invoke-virtual {v0}, LIi/p;->A()V

    new-instance v1, LIi/O0;

    invoke-direct {v1, v0}, LIi/O0;-><init>(Ldh/e;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {p0, v4, v1, v2, v3}, LIi/A0;->o(LIi/y0;ZLIi/C0;ILjava/lang/Object;)LIi/e0;

    move-result-object v1

    invoke-static {v0, v1}, LIi/r;->a(LIi/n;LIi/e0;)V

    invoke-virtual {v0}, LIi/p;->u()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/h;->c(Ldh/e;)V

    :cond_0
    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne v0, p1, :cond_1

    return-object v0

    :cond_1
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method private final l0(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    const/4 v0, 0x0

    move-object v1, v0

    :cond_0
    invoke-virtual {p0}, LIi/D0;->Y()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, LIi/D0$c;

    if-eqz v3, :cond_7

    monitor-enter v2

    :try_start_0
    move-object v3, v2

    check-cast v3, LIi/D0$c;

    invoke-virtual {v3}, LIi/D0$c;->k()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {}, LIi/E0;->f()LNi/C;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    :try_start_1
    move-object v3, v2

    check-cast v3, LIi/D0$c;

    invoke-virtual {v3}, LIi/D0$c;->i()Z

    move-result v3

    if-nez p1, :cond_2

    if-nez v3, :cond_4

    :cond_2
    if-nez v1, :cond_3

    invoke-direct {p0, p1}, LIi/D0;->M(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    :cond_3
    move-object p1, v2

    check-cast p1, LIi/D0$c;

    invoke-virtual {p1, v1}, LIi/D0$c;->a(Ljava/lang/Throwable;)V

    :cond_4
    move-object p1, v2

    check-cast p1, LIi/D0$c;

    invoke-virtual {p1}, LIi/D0$c;->e()Ljava/lang/Throwable;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v3, :cond_5

    move-object v0, p1

    :cond_5
    monitor-exit v2

    if-eqz v0, :cond_6

    check-cast v2, LIi/D0$c;

    invoke-virtual {v2}, LIi/D0$c;->b()LIi/I0;

    move-result-object p1

    invoke-direct {p0, p1, v0}, LIi/D0;->q0(LIi/I0;Ljava/lang/Throwable;)V

    :cond_6
    invoke-static {}, LIi/E0;->a()LNi/C;

    move-result-object p1

    return-object p1

    :goto_0
    monitor-exit v2

    throw p1

    :cond_7
    instance-of v3, v2, LIi/u0;

    if-eqz v3, :cond_b

    if-nez v1, :cond_8

    invoke-direct {p0, p1}, LIi/D0;->M(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    :cond_8
    move-object v3, v2

    check-cast v3, LIi/u0;

    invoke-interface {v3}, LIi/u0;->isActive()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-direct {p0, v3, v1}, LIi/D0;->J0(LIi/u0;Ljava/lang/Throwable;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {}, LIi/E0;->a()LNi/C;

    move-result-object p1

    return-object p1

    :cond_9
    new-instance v3, LIi/C;

    const/4 v4, 0x0

    const/4 v5, 0x2

    invoke-direct {v3, v1, v4, v5, v0}, LIi/C;-><init>(Ljava/lang/Throwable;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0, v2, v3}, LIi/D0;->K0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {}, LIi/E0;->a()LNi/C;

    move-result-object v4

    if-eq v3, v4, :cond_a

    invoke-static {}, LIi/E0;->b()LNi/C;

    move-result-object v2

    if-eq v3, v2, :cond_0

    return-object v3

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cannot happen in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    invoke-static {}, LIi/E0;->f()LNi/C;

    move-result-object p1

    return-object p1
.end method

.method public static final synthetic m(LIi/D0;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, LIi/D0;->H()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic n(LIi/D0;LIi/D0$c;LIi/v;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LIi/D0;->L(LIi/D0$c;LIi/v;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic o(LIi/D0;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, LIi/D0;->s0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final p0(LNi/n;)LIi/v;
    .locals 1

    :goto_0
    invoke-virtual {p1}, LNi/n;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LNi/n;->l()LNi/n;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LNi/n;->k()LNi/n;

    move-result-object p1

    invoke-virtual {p1}, LNi/n;->p()Z

    move-result v0

    if-nez v0, :cond_0

    instance-of v0, p1, LIi/v;

    if-eqz v0, :cond_1

    check-cast p1, LIi/v;

    return-object p1

    :cond_1
    instance-of v0, p1, LIi/I0;

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1
.end method

.method public static final synthetic q(LIi/D0;LSi/e;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LIi/D0;->t0(LSi/e;Ljava/lang/Object;)V

    return-void
.end method

.method private final q0(LIi/I0;Ljava/lang/Throwable;)V
    .locals 5

    invoke-virtual {p0, p2}, LIi/D0;->u0(Ljava/lang/Throwable;)V

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, LNi/n;->f(I)V

    invoke-virtual {p1}, LNi/n;->j()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LNi/n;

    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    instance-of v2, v0, LIi/C0;

    if-eqz v2, :cond_1

    move-object v2, v0

    check-cast v2, LIi/C0;

    invoke-virtual {v2}, LIi/C0;->u()Z

    move-result v2

    if-eqz v2, :cond_1

    :try_start_0
    move-object v2, v0

    check-cast v2, LIi/C0;

    invoke-virtual {v2, p2}, LIi/C0;->v(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v2

    if-eqz v1, :cond_0

    invoke-static {v1, v2}, LYg/g;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_0
    new-instance v1, Lkotlinx/coroutines/CompletionHandlerException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Exception in completion handler "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3, v2}, Lkotlinx/coroutines/CompletionHandlerException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v2, LYg/J;->a:LYg/J;

    :cond_1
    :goto_1
    invoke-virtual {v0}, LNi/n;->k()LNi/n;

    move-result-object v0

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {p0, v1}, LIi/D0;->e0(Ljava/lang/Throwable;)V

    :cond_3
    invoke-direct {p0, p2}, LIi/D0;->G(Ljava/lang/Throwable;)Z

    return-void
.end method

.method private final r0(LIi/I0;Ljava/lang/Throwable;)V
    .locals 5

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, LNi/n;->f(I)V

    invoke-virtual {p1}, LNi/n;->j()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LNi/n;

    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    instance-of v2, v0, LIi/C0;

    if-eqz v2, :cond_1

    :try_start_0
    move-object v2, v0

    check-cast v2, LIi/C0;

    invoke-virtual {v2, p2}, LIi/C0;->v(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v2

    if-eqz v1, :cond_0

    invoke-static {v1, v2}, LYg/g;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_0
    new-instance v1, Lkotlinx/coroutines/CompletionHandlerException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Exception in completion handler "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3, v2}, Lkotlinx/coroutines/CompletionHandlerException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v2, LYg/J;->a:LYg/J;

    :cond_1
    :goto_1
    invoke-virtual {v0}, LNi/n;->k()LNi/n;

    move-result-object v0

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {p0, v1}, LIi/D0;->e0(Ljava/lang/Throwable;)V

    :cond_3
    return-void
.end method

.method private final s0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    instance-of p1, p2, LIi/C;

    if-nez p1, :cond_0

    return-object p2

    :cond_0
    check-cast p2, LIi/C;

    iget-object p1, p2, LIi/C;->a:Ljava/lang/Throwable;

    throw p1
.end method

.method public static final synthetic t(LIi/D0;LSi/e;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LIi/D0;->z0(LSi/e;Ljava/lang/Object;)V

    return-void
.end method

.method private final t0(LSi/e;Ljava/lang/Object;)V
    .locals 3

    :cond_0
    invoke-virtual {p0}, LIi/D0;->Y()Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, LIi/u0;

    if-nez v0, :cond_2

    instance-of v0, p2, LIi/C;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p2}, LIi/E0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    :goto_0
    invoke-interface {p1, p2}, LSi/e;->b(Ljava/lang/Object;)V

    return-void

    :cond_2
    invoke-direct {p0, p2}, LIi/D0;->D0(Ljava/lang/Object;)I

    move-result p2

    if-ltz p2, :cond_0

    new-instance p2, LIi/D0$d;

    invoke-direct {p2, p0, p1}, LIi/D0$d;-><init>(LIi/D0;LSi/e;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, p2, v0, v1}, LIi/A0;->o(LIi/y0;ZLIi/C0;ILjava/lang/Object;)LIi/e0;

    move-result-object p2

    invoke-interface {p1, p2}, LSi/e;->a(LIi/e0;)V

    return-void
.end method

.method private final u(Ljava/lang/Throwable;Ljava/util/List;)V
    .locals 3

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    return-void

    :cond_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    new-instance v1, Ljava/util/IdentityHashMap;

    invoke-direct {v1, v0}, Ljava/util/IdentityHashMap;-><init>(I)V

    invoke-static {v1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Throwable;

    if-eq v1, p1, :cond_1

    if-eq v1, p1, :cond_1

    instance-of v2, v1, Ljava/util/concurrent/CancellationException;

    if-nez v2, :cond_1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p1, v1}, LYg/g;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method private final x0(LIi/h0;)V
    .locals 2

    new-instance v0, LIi/I0;

    invoke-direct {v0}, LIi/I0;-><init>()V

    invoke-virtual {p1}, LIi/h0;->isActive()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, LIi/t0;

    invoke-direct {v1, v0}, LIi/t0;-><init>(LIi/I0;)V

    move-object v0, v1

    :goto_0
    invoke-static {}, LIi/D0;->a0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-static {v1, p0, p1, v0}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method private final y0(LIi/C0;)V
    .locals 2

    new-instance v0, LIi/I0;

    invoke-direct {v0}, LIi/I0;-><init>()V

    invoke-virtual {p1, v0}, LNi/n;->e(LNi/n;)Z

    invoke-virtual {p1}, LNi/n;->k()LNi/n;

    move-result-object v0

    invoke-static {}, LIi/D0;->a0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-static {v1, p0, p1, v0}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method private final z(Ldh/e;)Ljava/lang/Object;
    .locals 5

    new-instance v0, LIi/D0$a;

    invoke-static {p1}, Leh/b;->d(Ldh/e;)Ldh/e;

    move-result-object v1

    invoke-direct {v0, v1, p0}, LIi/D0$a;-><init>(Ldh/e;LIi/D0;)V

    invoke-virtual {v0}, LIi/p;->A()V

    new-instance v1, LIi/N0;

    invoke-direct {v1, v0}, LIi/N0;-><init>(LIi/p;)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {p0, v4, v1, v2, v3}, LIi/A0;->o(LIi/y0;ZLIi/C0;ILjava/lang/Object;)LIi/e0;

    move-result-object v1

    invoke-static {v0, v1}, LIi/r;->a(LIi/n;LIi/e0;)V

    invoke-virtual {v0}, LIi/p;->u()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/h;->c(Ldh/e;)V

    :cond_0
    return-object v0
.end method

.method private final z0(LSi/e;Ljava/lang/Object;)V
    .locals 3

    invoke-direct {p0}, LIi/D0;->j0()Z

    move-result p2

    if-nez p2, :cond_0

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-interface {p1, p2}, LSi/e;->b(Ljava/lang/Object;)V

    return-void

    :cond_0
    new-instance p2, LIi/D0$e;

    invoke-direct {p2, p0, p1}, LIi/D0$e;-><init>(LIi/D0;LSi/e;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, p2, v0, v1}, LIi/A0;->o(LIi/y0;ZLIi/C0;ILjava/lang/Object;)LIi/e0;

    move-result-object p2

    invoke-interface {p1, p2}, LSi/e;->a(LIi/e0;)V

    return-void
.end method


# virtual methods
.method public final A(Ljava/lang/Throwable;)Z
    .locals 0

    invoke-virtual {p0, p1}, LIi/D0;->D(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final A0(LIi/C0;)V
    .locals 3

    :cond_0
    invoke-virtual {p0}, LIi/D0;->Y()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LIi/C0;

    if-eqz v1, :cond_2

    if-eq v0, p1, :cond_1

    return-void

    :cond_1
    invoke-static {}, LIi/D0;->a0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-static {}, LIi/E0;->c()LIi/h0;

    move-result-object v2

    invoke-static {v1, p0, v0, v2}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_2
    instance-of v1, v0, LIi/u0;

    if-eqz v1, :cond_3

    check-cast v0, LIi/u0;

    invoke-interface {v0}, LIi/u0;->b()LIi/I0;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, LNi/n;->q()Z

    :cond_3
    return-void
.end method

.method public final B0(LIi/u;)V
    .locals 1

    invoke-static {}, LIi/D0;->Z()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final D(Ljava/lang/Object;)Z
    .locals 3

    invoke-static {}, LIi/E0;->a()LNi/C;

    move-result-object v0

    invoke-virtual {p0}, LIi/D0;->V()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    invoke-direct {p0, p1}, LIi/D0;->F(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LIi/E0;->b:LNi/C;

    if-ne v0, v1, :cond_0

    return v2

    :cond_0
    invoke-static {}, LIi/E0;->a()LNi/C;

    move-result-object v1

    if-ne v0, v1, :cond_1

    invoke-direct {p0, p1}, LIi/D0;->l0(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :cond_1
    invoke-static {}, LIi/E0;->a()LNi/C;

    move-result-object p1

    if-ne v0, p1, :cond_2

    goto :goto_0

    :cond_2
    sget-object p1, LIi/E0;->b:LNi/C;

    if-ne v0, p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-static {}, LIi/E0;->f()LNi/C;

    move-result-object p1

    if-ne v0, p1, :cond_4

    const/4 v2, 0x0

    goto :goto_0

    :cond_4
    invoke-virtual {p0, v0}, LIi/D0;->w(Ljava/lang/Object;)V

    :goto_0
    return v2
.end method

.method public E(Ljava/lang/Throwable;)V
    .locals 0

    invoke-virtual {p0, p1}, LIi/D0;->D(Ljava/lang/Object;)Z

    return-void
.end method

.method protected final F0(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;
    .locals 1

    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/util/concurrent/CancellationException;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    new-instance v0, Lkotlinx/coroutines/JobCancellationException;

    if-nez p2, :cond_1

    invoke-static {p0}, LIi/D0;->m(LIi/D0;)Ljava/lang/String;

    move-result-object p2

    :cond_1
    invoke-direct {v0, p2, p1, p0}, Lkotlinx/coroutines/JobCancellationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;LIi/y0;)V

    :cond_2
    return-object v0
.end method

.method protected H()Ljava/lang/String;
    .locals 1

    const-string v0, "Job was cancelled"

    return-object v0
.end method

.method public final H0()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, LIi/D0;->o0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LIi/D0;->Y()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {p0, v1}, LIi/D0;->E0(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public I(Ljava/lang/Throwable;)Z
    .locals 2

    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0, p1}, LIi/D0;->D(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, LIi/D0;->R()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final O()Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, LIi/D0;->Y()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LIi/u0;

    if-nez v1, :cond_1

    instance-of v1, v0, LIi/C;

    if-nez v1, :cond_0

    invoke-static {v0}, LIi/E0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    check-cast v0, LIi/C;

    iget-object v0, v0, LIi/C;->a:Ljava/lang/Throwable;

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This job has not completed yet"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public R()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method protected final U()LSi/c;
    .locals 8

    new-instance v7, LSi/d;

    sget-object v0, LIi/D0$g;->a:LIi/D0$g;

    const-string v1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lkotlin/jvm/internal/V;->f(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lmh/q;

    sget-object v0, LIi/D0$h;->a:LIi/D0$h;

    const-string v3, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lkotlin/jvm/internal/V;->f(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lmh/q;

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v0, v7

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, LSi/d;-><init>(Ljava/lang/Object;Lmh/q;Lmh/q;Lmh/q;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7
.end method

.method public V()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final X()LIi/u;
    .locals 1

    invoke-static {}, LIi/D0;->Z()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LIi/u;

    return-object v0
.end method

.method public final Y()Ljava/lang/Object;
    .locals 1

    invoke-static {}, LIi/D0;->a0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final attachChild(LIi/w;)LIi/u;
    .locals 4

    new-instance v0, LIi/v;

    invoke-direct {v0, p1}, LIi/v;-><init>(LIi/w;)V

    invoke-virtual {v0, p0}, LIi/C0;->w(LIi/D0;)V

    :cond_0
    :goto_0
    invoke-virtual {p0}, LIi/D0;->Y()Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, LIi/h0;

    if-eqz v1, :cond_2

    move-object v1, p1

    check-cast v1, LIi/h0;

    invoke-virtual {v1}, LIi/h0;->isActive()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {}, LIi/D0;->a0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-static {v1, p0, p1, v0}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_3

    :cond_1
    invoke-direct {p0, v1}, LIi/D0;->x0(LIi/h0;)V

    goto :goto_0

    :cond_2
    instance-of v1, p1, LIi/u0;

    const/4 v2, 0x0

    if-eqz v1, :cond_9

    move-object v1, p1

    check-cast v1, LIi/u0;

    invoke-interface {v1}, LIi/u0;->b()LIi/I0;

    move-result-object v1

    if-nez v1, :cond_3

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.JobNode"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LIi/C0;

    invoke-direct {p0, p1}, LIi/D0;->y0(LIi/C0;)V

    goto :goto_0

    :cond_3
    const/4 p1, 0x7

    invoke-virtual {v1, v0, p1}, LNi/n;->c(LNi/n;I)Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_3

    :cond_4
    const/4 p1, 0x3

    invoke-virtual {v1, v0, p1}, LNi/n;->c(LNi/n;I)Z

    move-result p1

    invoke-virtual {p0}, LIi/D0;->Y()Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, LIi/D0$c;

    if-eqz v3, :cond_5

    check-cast v1, LIi/D0$c;

    invoke-virtual {v1}, LIi/D0$c;->e()Ljava/lang/Throwable;

    move-result-object v2

    goto :goto_2

    :cond_5
    instance-of v3, v1, LIi/C;

    if-eqz v3, :cond_6

    check-cast v1, LIi/C;

    goto :goto_1

    :cond_6
    move-object v1, v2

    :goto_1
    if-eqz v1, :cond_7

    iget-object v2, v1, LIi/C;->a:Ljava/lang/Throwable;

    :cond_7
    :goto_2
    invoke-virtual {v0, v2}, LIi/v;->v(Ljava/lang/Throwable;)V

    if-eqz p1, :cond_8

    :goto_3
    return-object v0

    :cond_8
    sget-object p1, LIi/K0;->a:LIi/K0;

    return-object p1

    :cond_9
    invoke-virtual {p0}, LIi/D0;->Y()Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, LIi/C;

    if-eqz v1, :cond_a

    check-cast p1, LIi/C;

    goto :goto_4

    :cond_a
    move-object p1, v2

    :goto_4
    if-eqz p1, :cond_b

    iget-object v2, p1, LIi/C;->a:Ljava/lang/Throwable;

    :cond_b
    invoke-virtual {v0, v2}, LIi/v;->v(Ljava/lang/Throwable;)V

    sget-object p1, LIi/K0;->a:LIi/K0;

    return-object p1
.end method

.method protected c0(Ljava/lang/Throwable;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public synthetic cancel()V
    .locals 0

    .line 1
    invoke-static {p0}, LIi/y0$a;->a(LIi/y0;)V

    return-void
.end method

.method public cancel(Ljava/util/concurrent/CancellationException;)V
    .locals 2

    if-nez p1, :cond_0

    .line 5
    new-instance p1, Lkotlinx/coroutines/JobCancellationException;

    invoke-static {p0}, LIi/D0;->m(LIi/D0;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1, p0}, Lkotlinx/coroutines/JobCancellationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;LIi/y0;)V

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, LIi/D0;->E(Ljava/lang/Throwable;)V

    return-void
.end method

.method public synthetic cancel(Ljava/lang/Throwable;)Z
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 2
    invoke-static {p0, p1, v1, v0, v1}, LIi/D0;->G0(LIi/D0;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/concurrent/CancellationException;

    move-result-object p1

    if-nez p1, :cond_1

    .line 3
    :cond_0
    new-instance p1, Lkotlinx/coroutines/JobCancellationException;

    invoke-static {p0}, LIi/D0;->m(LIi/D0;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p1, v2, v1, p0}, Lkotlinx/coroutines/JobCancellationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;LIi/y0;)V

    .line 4
    :cond_1
    invoke-virtual {p0, p1}, LIi/D0;->E(Ljava/lang/Throwable;)V

    return v0
.end method

.method public d0()Ljava/util/concurrent/CancellationException;
    .locals 5

    invoke-virtual {p0}, LIi/D0;->Y()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LIi/D0$c;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, LIi/D0$c;

    invoke-virtual {v1}, LIi/D0$c;->e()Ljava/lang/Throwable;

    move-result-object v1

    goto :goto_0

    :cond_0
    instance-of v1, v0, LIi/C;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, LIi/C;

    iget-object v1, v1, LIi/C;->a:Ljava/lang/Throwable;

    goto :goto_0

    :cond_1
    instance-of v1, v0, LIi/u0;

    if-nez v1, :cond_4

    move-object v1, v2

    :goto_0
    instance-of v3, v1, Ljava/util/concurrent/CancellationException;

    if-eqz v3, :cond_2

    move-object v2, v1

    check-cast v2, Ljava/util/concurrent/CancellationException;

    :cond_2
    if-nez v2, :cond_3

    new-instance v2, Lkotlinx/coroutines/JobCancellationException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Parent job is "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, v0}, LIi/D0;->E0(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, v1, p0}, Lkotlinx/coroutines/JobCancellationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;LIi/y0;)V

    :cond_3
    return-object v2

    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Cannot be cancelling child in this state: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public e0(Ljava/lang/Throwable;)V
    .locals 0

    throw p1
.end method

.method public fold(Ljava/lang/Object;Lmh/p;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, LIi/y0$a;->c(LIi/y0;Ljava/lang/Object;Lmh/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected final g0(LIi/y0;)V
    .locals 1

    if-nez p1, :cond_0

    sget-object p1, LIi/K0;->a:LIi/K0;

    invoke-virtual {p0, p1}, LIi/D0;->B0(LIi/u;)V

    return-void

    :cond_0
    invoke-interface {p1}, LIi/y0;->start()Z

    invoke-interface {p1, p0}, LIi/y0;->attachChild(LIi/w;)LIi/u;

    move-result-object p1

    invoke-virtual {p0, p1}, LIi/D0;->B0(LIi/u;)V

    invoke-virtual {p0}, LIi/D0;->isCompleted()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, LIi/e0;->dispose()V

    sget-object p1, LIi/K0;->a:LIi/K0;

    invoke-virtual {p0, p1}, LIi/D0;->B0(LIi/u;)V

    :cond_1
    return-void
.end method

.method public get(Ldh/i$c;)Ldh/i$b;
    .locals 0

    invoke-static {p0, p1}, LIi/y0$a;->d(LIi/y0;Ldh/i$c;)Ldh/i$b;

    move-result-object p1

    return-object p1
.end method

.method public final getCancellationException()Ljava/util/concurrent/CancellationException;
    .locals 4

    invoke-virtual {p0}, LIi/D0;->Y()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LIi/D0$c;

    const-string v2, "Job is still new or active: "

    if-eqz v1, :cond_1

    check-cast v0, LIi/D0$c;

    invoke-virtual {v0}, LIi/D0$c;->e()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, LIi/S;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " is cancelling"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, LIi/D0;->F0(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    instance-of v1, v0, LIi/u0;

    if-nez v1, :cond_3

    instance-of v1, v0, LIi/C;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast v0, LIi/C;

    iget-object v0, v0, LIi/C;->a:Ljava/lang/Throwable;

    const/4 v1, 0x1

    invoke-static {p0, v0, v2, v1, v2}, LIi/D0;->G0(LIi/D0;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/concurrent/CancellationException;

    move-result-object v0

    goto :goto_0

    :cond_2
    new-instance v0, Lkotlinx/coroutines/JobCancellationException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, LIi/S;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " has completed normally"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v2, p0}, Lkotlinx/coroutines/JobCancellationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;LIi/y0;)V

    :goto_0
    return-object v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getChildren()Lzi/j;
    .locals 2

    new-instance v0, LIi/D0$f;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LIi/D0$f;-><init>(LIi/D0;Ldh/e;)V

    invoke-static {v0}, Lzi/m;->b(Lmh/p;)Lzi/j;

    move-result-object v0

    return-object v0
.end method

.method public final getCompletionExceptionOrNull()Ljava/lang/Throwable;
    .locals 2

    invoke-virtual {p0}, LIi/D0;->Y()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LIi/u0;

    if-nez v1, :cond_0

    invoke-direct {p0, v0}, LIi/D0;->P(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This job has not completed yet"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getKey()Ldh/i$c;
    .locals 1

    sget-object v0, LIi/y0;->O:LIi/y0$b;

    return-object v0
.end method

.method public final getOnJoin()LSi/a;
    .locals 7

    new-instance v6, LSi/b;

    sget-object v0, LIi/D0$i;->a:LIi/D0$i;

    const-string v1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lkotlin/jvm/internal/V;->f(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lmh/q;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, LSi/b;-><init>(Ljava/lang/Object;Lmh/q;Lmh/q;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6
.end method

.method public getParent()LIi/y0;
    .locals 1

    invoke-virtual {p0}, LIi/D0;->X()LIi/u;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, LIi/u;->getParent()LIi/y0;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final h(LIi/M0;)V
    .locals 0

    invoke-virtual {p0, p1}, LIi/D0;->D(Ljava/lang/Object;)Z

    return-void
.end method

.method public final h0(ZLIi/C0;)LIi/e0;
    .locals 5

    invoke-virtual {p2, p0}, LIi/C0;->w(LIi/D0;)V

    :cond_0
    :goto_0
    invoke-virtual {p0}, LIi/D0;->Y()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LIi/h0;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    move-object v1, v0

    check-cast v1, LIi/h0;

    invoke-virtual {v1}, LIi/h0;->isActive()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-static {}, LIi/D0;->a0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-static {v1, p0, v0, p2}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_4

    :cond_1
    invoke-direct {p0, v1}, LIi/D0;->x0(LIi/h0;)V

    goto :goto_0

    :cond_2
    instance-of v1, v0, LIi/u0;

    if-eqz v1, :cond_9

    move-object v1, v0

    check-cast v1, LIi/u0;

    invoke-interface {v1}, LIi/u0;->b()LIi/I0;

    move-result-object v4

    if-nez v4, :cond_3

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.JobNode"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LIi/C0;

    invoke-direct {p0, v0}, LIi/D0;->y0(LIi/C0;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p2}, LIi/C0;->u()Z

    move-result v0

    if-eqz v0, :cond_8

    instance-of v0, v1, LIi/D0$c;

    if-eqz v0, :cond_4

    check-cast v1, LIi/D0$c;

    goto :goto_1

    :cond_4
    move-object v1, v3

    :goto_1
    if-eqz v1, :cond_5

    invoke-virtual {v1}, LIi/D0$c;->e()Ljava/lang/Throwable;

    move-result-object v0

    goto :goto_2

    :cond_5
    move-object v0, v3

    :goto_2
    if-nez v0, :cond_6

    const/4 v0, 0x5

    invoke-virtual {v4, p2, v0}, LNi/n;->c(LNi/n;I)Z

    move-result v0

    goto :goto_3

    :cond_6
    if-eqz p1, :cond_7

    invoke-virtual {p2, v0}, LIi/C0;->v(Ljava/lang/Throwable;)V

    :cond_7
    sget-object p1, LIi/K0;->a:LIi/K0;

    return-object p1

    :cond_8
    invoke-virtual {v4, p2, v2}, LNi/n;->c(LNi/n;I)Z

    move-result v0

    :goto_3
    if-eqz v0, :cond_0

    goto :goto_4

    :cond_9
    const/4 v2, 0x0

    :goto_4
    if-eqz v2, :cond_a

    return-object p2

    :cond_a
    if-eqz p1, :cond_d

    invoke-virtual {p0}, LIi/D0;->Y()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LIi/C;

    if-eqz v0, :cond_b

    check-cast p1, LIi/C;

    goto :goto_5

    :cond_b
    move-object p1, v3

    :goto_5
    if-eqz p1, :cond_c

    iget-object v3, p1, LIi/C;->a:Ljava/lang/Throwable;

    :cond_c
    invoke-virtual {p2, v3}, LIi/C0;->v(Ljava/lang/Throwable;)V

    :cond_d
    sget-object p1, LIi/K0;->a:LIi/K0;

    return-object p1
.end method

.method protected i0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final invokeOnCompletion(Lmh/l;)LIi/e0;
    .locals 1

    .line 1
    new-instance v0, LIi/x0;

    invoke-direct {v0, p1}, LIi/x0;-><init>(Lmh/l;)V

    const/4 p1, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, LIi/D0;->h0(ZLIi/C0;)LIi/e0;

    move-result-object p1

    return-object p1
.end method

.method public final invokeOnCompletion(ZZLmh/l;)LIi/e0;
    .locals 0

    if-eqz p1, :cond_0

    .line 3
    new-instance p1, LIi/w0;

    invoke-direct {p1, p3}, LIi/w0;-><init>(Lmh/l;)V

    goto :goto_0

    .line 4
    :cond_0
    new-instance p1, LIi/x0;

    invoke-direct {p1, p3}, LIi/x0;-><init>(Lmh/l;)V

    .line 5
    :goto_0
    invoke-virtual {p0, p2, p1}, LIi/D0;->h0(ZLIi/C0;)LIi/e0;

    move-result-object p1

    return-object p1
.end method

.method public isActive()Z
    .locals 2

    invoke-virtual {p0}, LIi/D0;->Y()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LIi/u0;

    if-eqz v1, :cond_0

    check-cast v0, LIi/u0;

    invoke-interface {v0}, LIi/u0;->isActive()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final isCancelled()Z
    .locals 2

    invoke-virtual {p0}, LIi/D0;->Y()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LIi/C;

    if-nez v1, :cond_1

    instance-of v1, v0, LIi/D0$c;

    if-eqz v1, :cond_0

    check-cast v0, LIi/D0$c;

    invoke-virtual {v0}, LIi/D0$c;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final isCompleted()Z
    .locals 1

    invoke-virtual {p0}, LIi/D0;->Y()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, LIi/u0;

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final join(Ldh/e;)Ljava/lang/Object;
    .locals 1

    invoke-direct {p0}, LIi/D0;->j0()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Ldh/e;->getContext()Ldh/i;

    move-result-object p1

    invoke-static {p1}, LIi/A0;->l(Ldh/i;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_0
    invoke-direct {p0, p1}, LIi/D0;->k0(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_1

    return-object p1

    :cond_1
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final m0(Ljava/lang/Object;)Z
    .locals 3

    :cond_0
    invoke-virtual {p0}, LIi/D0;->Y()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0, p1}, LIi/D0;->K0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, LIi/E0;->a()LNi/C;

    move-result-object v1

    if-ne v0, v1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    sget-object v1, LIi/E0;->b:LNi/C;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_2

    return v2

    :cond_2
    invoke-static {}, LIi/E0;->b()LNi/C;

    move-result-object v1

    if-eq v0, v1, :cond_0

    invoke-virtual {p0, v0}, LIi/D0;->w(Ljava/lang/Object;)V

    return v2
.end method

.method public minusKey(Ldh/i$c;)Ldh/i;
    .locals 0

    invoke-static {p0, p1}, LIi/y0$a;->e(LIi/y0;Ldh/i$c;)Ldh/i;

    move-result-object p1

    return-object p1
.end method

.method public final n0(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    :cond_0
    invoke-virtual {p0}, LIi/D0;->Y()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0, p1}, LIi/D0;->K0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, LIi/E0;->a()LNi/C;

    move-result-object v1

    if-eq v0, v1, :cond_1

    invoke-static {}, LIi/E0;->b()LNi/C;

    move-result-object v1

    if-eq v0, v1, :cond_0

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Job "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " is already complete or completing, but is being completed with "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1}, LIi/D0;->P(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public o0()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, LIi/S;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public plus(LIi/y0;)LIi/y0;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LIi/y0$a;->f(LIi/y0;LIi/y0;)LIi/y0;

    move-result-object p1

    return-object p1
.end method

.method public plus(Ldh/i;)Ldh/i;
    .locals 0

    .line 2
    invoke-static {p0, p1}, LIi/y0$a;->g(LIi/y0;Ldh/i;)Ldh/i;

    move-result-object p1

    return-object p1
.end method

.method public final start()Z
    .locals 2

    :goto_0
    invoke-virtual {p0}, LIi/D0;->Y()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, LIi/D0;->D0(Ljava/lang/Object;)I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, LIi/D0;->H0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, LIi/S;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected u0(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method protected v0(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method protected w(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method protected w0()V
    .locals 0

    return-void
.end method

.method protected final x(Ldh/e;)Ljava/lang/Object;
    .locals 2

    :cond_0
    invoke-virtual {p0}, LIi/D0;->Y()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LIi/u0;

    if-nez v1, :cond_2

    instance-of p1, v0, LIi/C;

    if-nez p1, :cond_1

    invoke-static {v0}, LIi/E0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    check-cast v0, LIi/C;

    iget-object p1, v0, LIi/C;->a:Ljava/lang/Throwable;

    throw p1

    :cond_2
    invoke-direct {p0, v0}, LIi/D0;->D0(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_0

    invoke-direct {p0, p1}, LIi/D0;->z(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
