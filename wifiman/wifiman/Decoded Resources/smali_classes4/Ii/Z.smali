.class public final LIi/Z;
.super LNi/y;
.source "SourceFile"


# static fields
.field private static final synthetic e:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private volatile synthetic _decision$volatile:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, LIi/Z;

    const-string v1, "_decision$volatile"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, LIi/Z;->e:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(Ldh/i;Ldh/e;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LNi/y;-><init>(Ldh/i;Ldh/e;)V

    return-void
.end method

.method private static final synthetic T0()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;
    .locals 1

    sget-object v0, LIi/Z;->e:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-object v0
.end method

.method private final U0()Z
    .locals 5

    invoke-static {}, LIi/Z;->T0()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    :cond_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v3, :cond_1

    return v2

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already resumed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {}, LIi/Z;->T0()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v1

    const/4 v4, 0x2

    invoke-virtual {v1, p0, v2, v4}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v1

    if-eqz v1, :cond_0

    return v3
.end method

.method private final V0()Z
    .locals 4

    invoke-static {}, LIi/Z;->T0()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    :cond_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    const/4 v0, 0x2

    if-ne v1, v0, :cond_1

    return v2

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already suspended"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {}, LIi/Z;->T0()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v1

    const/4 v3, 0x1

    invoke-virtual {v1, p0, v2, v3}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v1

    if-eqz v1, :cond_0

    return v3
.end method


# virtual methods
.method protected N0(Ljava/lang/Object;)V
    .locals 2

    invoke-direct {p0}, LIi/Z;->U0()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LNi/y;->d:Ldh/e;

    invoke-static {v0}, Leh/b;->d(Ldh/e;)Ldh/e;

    move-result-object v0

    iget-object v1, p0, LNi/y;->d:Ldh/e;

    invoke-static {p1, v1}, LIi/D;->a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, LNi/h;->b(Ldh/e;Ljava/lang/Object;)V

    return-void
.end method

.method public final S0()Ljava/lang/Object;
    .locals 2

    invoke-direct {p0}, LIi/Z;->V0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {p0}, LIi/D0;->Y()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LIi/E0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LIi/C;

    if-nez v1, :cond_1

    return-object v0

    :cond_1
    check-cast v0, LIi/C;

    iget-object v0, v0, LIi/C;->a:Ljava/lang/Throwable;

    throw v0
.end method

.method protected w(Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, LIi/Z;->N0(Ljava/lang/Object;)V

    return-void
.end method
