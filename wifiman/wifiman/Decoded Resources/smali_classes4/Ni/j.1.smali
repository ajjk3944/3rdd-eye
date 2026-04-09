.class public final LNi/j;
.super LIi/J;
.source "SourceFile"

# interfaces
.implements LIi/X;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LNi/j$a;
    }
.end annotation


# static fields
.field private static final synthetic i:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private final synthetic c:LIi/X;

.field private final d:LIi/J;

.field private final e:I

.field private final f:Ljava/lang/String;

.field private final g:LNi/o;

.field private final h:Ljava/lang/Object;

.field private volatile synthetic runningWorkers$volatile:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, LNi/j;

    const-string v1, "runningWorkers$volatile"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, LNi/j;->i:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(LIi/J;ILjava/lang/String;)V
    .locals 1

    invoke-direct {p0}, LIi/J;-><init>()V

    instance-of v0, p1, LIi/X;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LIi/X;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    invoke-static {}, LIi/U;->a()LIi/X;

    move-result-object v0

    :cond_1
    iput-object v0, p0, LNi/j;->c:LIi/X;

    iput-object p1, p0, LNi/j;->d:LIi/J;

    iput p2, p0, LNi/j;->e:I

    iput-object p3, p0, LNi/j;->f:Ljava/lang/String;

    new-instance p1, LNi/o;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, LNi/o;-><init>(Z)V

    iput-object p1, p0, LNi/j;->g:LNi/o;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNi/j;->h:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic p0(LNi/j;)LIi/J;
    .locals 0

    iget-object p0, p0, LNi/j;->d:LIi/J;

    return-object p0
.end method

.method public static final synthetic q0(LNi/j;)Ljava/lang/Runnable;
    .locals 0

    invoke-direct {p0}, LNi/j;->s0()Ljava/lang/Runnable;

    move-result-object p0

    return-object p0
.end method

.method private static final synthetic r0()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;
    .locals 1

    sget-object v0, LNi/j;->i:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-object v0
.end method

.method private final s0()Ljava/lang/Runnable;
    .locals 2

    :goto_0
    iget-object v0, p0, LNi/j;->g:LNi/o;

    invoke-virtual {v0}, LNi/o;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    if-nez v0, :cond_1

    iget-object v0, p0, LNi/j;->h:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {}, LNi/j;->r0()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I

    iget-object v1, p0, LNi/j;->g:LNi/o;

    invoke-virtual {v1}, LNi/o;->c()I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    monitor-exit v0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    :try_start_1
    invoke-static {}, LNi/j;->r0()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    :cond_1
    return-object v0
.end method

.method private final t0()Z
    .locals 3

    iget-object v0, p0, LNi/j;->h:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {}, LNi/j;->r0()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v1

    iget v2, p0, LNi/j;->e:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lt v1, v2, :cond_0

    monitor-exit v0

    const/4 v0, 0x0

    return v0

    :cond_0
    :try_start_1
    invoke-static {}, LNi/j;->r0()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    const/4 v0, 0x1

    return v0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method


# virtual methods
.method public J(JLIi/n;)V
    .locals 1

    iget-object v0, p0, LNi/j;->c:LIi/X;

    invoke-interface {v0, p1, p2, p3}, LIi/X;->J(JLIi/n;)V

    return-void
.end method

.method public Y(Ldh/i;Ljava/lang/Runnable;)V
    .locals 0

    iget-object p1, p0, LNi/j;->g:LNi/o;

    invoke-virtual {p1, p2}, LNi/o;->a(Ljava/lang/Object;)Z

    invoke-static {}, LNi/j;->r0()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result p1

    iget p2, p0, LNi/j;->e:I

    if-ge p1, p2, :cond_1

    invoke-direct {p0}, LNi/j;->t0()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-direct {p0}, LNi/j;->s0()Ljava/lang/Runnable;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p2, LNi/j$a;

    invoke-direct {p2, p0, p1}, LNi/j$a;-><init>(LNi/j;Ljava/lang/Runnable;)V

    iget-object p1, p0, LNi/j;->d:LIi/J;

    invoke-static {p1, p0, p2}, LNi/h;->c(LIi/J;Ldh/i;Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public b0(Ldh/i;Ljava/lang/Runnable;)V
    .locals 0

    iget-object p1, p0, LNi/j;->g:LNi/o;

    invoke-virtual {p1, p2}, LNi/o;->a(Ljava/lang/Object;)Z

    invoke-static {}, LNi/j;->r0()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result p1

    iget p2, p0, LNi/j;->e:I

    if-ge p1, p2, :cond_1

    invoke-direct {p0}, LNi/j;->t0()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-direct {p0}, LNi/j;->s0()Ljava/lang/Runnable;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p2, LNi/j$a;

    invoke-direct {p2, p0, p1}, LNi/j$a;-><init>(LNi/j;Ljava/lang/Runnable;)V

    iget-object p1, p0, LNi/j;->d:LIi/J;

    invoke-virtual {p1, p0, p2}, LIi/J;->b0(Ldh/i;Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public n0(ILjava/lang/String;)LIi/J;
    .locals 1

    invoke-static {p1}, LNi/k;->a(I)V

    iget v0, p0, LNi/j;->e:I

    if-lt p1, v0, :cond_0

    invoke-static {p0, p2}, LNi/k;->b(LIi/J;Ljava/lang/String;)LIi/J;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-super {p0, p1, p2}, LIi/J;->n0(ILjava/lang/String;)LIi/J;

    move-result-object p1

    return-object p1
.end method

.method public p(JLjava/lang/Runnable;Ldh/i;)LIi/e0;
    .locals 1

    iget-object v0, p0, LNi/j;->c:LIi/X;

    invoke-interface {v0, p1, p2, p3, p4}, LIi/X;->p(JLjava/lang/Runnable;Ldh/i;)LIi/e0;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, LNi/j;->f:Ljava/lang/String;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LNi/j;->d:LIi/J;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".limitedParallelism("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LNi/j;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method
