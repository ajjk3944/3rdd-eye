.class public abstract LIi/k0;
.super LIi/i0;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LIi/i0;-><init>()V

    return-void
.end method


# virtual methods
.method protected abstract B0()Ljava/lang/Thread;
.end method

.method protected C0(JLIi/j0$c;)V
    .locals 1

    sget-object v0, LIi/T;->i:LIi/T;

    invoke-virtual {v0, p1, p2, p3}, LIi/j0;->Q0(JLIi/j0$c;)V

    return-void
.end method

.method protected final D0()V
    .locals 2

    invoke-virtual {p0}, LIi/k0;->B0()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-eq v1, v0, :cond_0

    invoke-static {}, LIi/c;->a()LIi/b;

    invoke-static {v0}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    :cond_0
    return-void
.end method
