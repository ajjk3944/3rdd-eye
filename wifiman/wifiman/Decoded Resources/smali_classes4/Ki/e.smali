.class public LKi/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKi/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LKi/e$a;
    }
.end annotation


# static fields
.field private static final synthetic d:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field private static final synthetic e:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field private static final synthetic f:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field private static final synthetic g:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field private static final synthetic h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field private static final synthetic i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field private static final synthetic j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field private static final synthetic k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field private static final synthetic l:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _closeCause$volatile:Ljava/lang/Object;

.field private final a:I

.field public final b:Lmh/l;

.field private volatile synthetic bufferEnd$volatile:J

.field private volatile synthetic bufferEndSegment$volatile:Ljava/lang/Object;

.field private final c:Lmh/q;

.field private volatile synthetic closeHandler$volatile:Ljava/lang/Object;

.field private volatile synthetic completedExpandBuffersAndPauseFlag$volatile:J

.field private volatile synthetic receiveSegment$volatile:Ljava/lang/Object;

.field private volatile synthetic receivers$volatile:J

.field private volatile synthetic sendSegment$volatile:Ljava/lang/Object;

.field private volatile synthetic sendersAndCloseStatus$volatile:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "sendersAndCloseStatus$volatile"

    const-class v1, LKi/e;

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    sput-object v0, LKi/e;->d:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-string v0, "receivers$volatile"

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    sput-object v0, LKi/e;->e:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-string v0, "bufferEnd$volatile"

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    sput-object v0, LKi/e;->f:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-string v0, "completedExpandBuffersAndPauseFlag$volatile"

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    sput-object v0, LKi/e;->g:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-string v0, "sendSegment$volatile"

    const-class v2, Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LKi/e;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "receiveSegment$volatile"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LKi/e;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "bufferEndSegment$volatile"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LKi/e;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "_closeCause$volatile"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LKi/e;->k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "closeHandler$volatile"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LKi/e;->l:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(ILmh/l;)V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LKi/e;->a:I

    iput-object p2, p0, LKi/e;->b:Lmh/l;

    if-ltz p1, :cond_2

    invoke-static {p1}, LKi/f;->t(I)J

    move-result-wide v0

    iput-wide v0, p0, LKi/e;->bufferEnd$volatile:J

    invoke-direct {p0}, LKi/e;->Z()J

    move-result-wide v0

    iput-wide v0, p0, LKi/e;->completedExpandBuffersAndPauseFlag$volatile:J

    new-instance p1, LKi/m;

    const/4 v5, 0x0

    const/4 v7, 0x3

    const-wide/16 v3, 0x0

    move-object v2, p1

    move-object v6, p0

    invoke-direct/range {v2 .. v7}, LKi/m;-><init>(JLKi/m;LKi/e;I)V

    iput-object p1, p0, LKi/e;->sendSegment$volatile:Ljava/lang/Object;

    iput-object p1, p0, LKi/e;->receiveSegment$volatile:Ljava/lang/Object;

    invoke-direct {p0}, LKi/e;->x0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, LKi/f;->n()LKi/m;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    iput-object p1, p0, LKi/e;->bufferEndSegment$volatile:Ljava/lang/Object;

    if-eqz p2, :cond_1

    new-instance p1, LKi/b;

    invoke-direct {p1, p0}, LKi/b;-><init>(LKi/e;)V

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, LKi/e;->c:Lmh/q;

    invoke-static {}, LKi/f;->l()LNi/C;

    move-result-object p1

    iput-object p1, p0, LKi/e;->_closeCause$volatile:Ljava/lang/Object;

    return-void

    :cond_2
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Invalid channel capacity: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", should be >=0"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public static final synthetic A(LKi/e;LIi/n;)V
    .locals 0

    invoke-direct {p0, p1}, LKi/e;->H0(LIi/n;)V

    return-void
.end method

.method private final A0()V
    .locals 7

    invoke-static {}, LKi/e;->k0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v6

    :cond_0
    invoke-virtual {v6, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v2

    const-wide v0, 0xfffffffffffffffL

    and-long/2addr v0, v2

    const/4 v4, 0x3

    invoke-static {v0, v1, v4}, LKi/f;->b(JI)J

    move-result-wide v4

    move-object v0, v6

    move-object v1, p0

    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void
.end method

.method public static final synthetic B(LKi/e;Ljava/lang/Object;LIi/n;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LKi/e;->J0(Ljava/lang/Object;LIi/n;)V

    return-void
.end method

.method private final B0()V
    .locals 7

    invoke-static {}, LKi/e;->k0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v6

    :cond_0
    invoke-virtual {v6, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v2

    const/16 v0, 0x3c

    shr-long v0, v2, v0

    long-to-int v0, v0

    const-wide v4, 0xfffffffffffffffL

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    return-void

    :cond_1
    and-long v0, v2, v4

    const/4 v4, 0x3

    invoke-static {v0, v1, v4}, LKi/f;->b(JI)J

    move-result-wide v0

    :goto_0
    move-wide v4, v0

    goto :goto_1

    :cond_2
    and-long v0, v2, v4

    const/4 v4, 0x2

    invoke-static {v0, v1, v4}, LKi/f;->b(JI)J

    move-result-wide v0

    goto :goto_0

    :goto_1
    move-object v0, v6

    move-object v1, p0

    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void
.end method

.method public static final synthetic C(LKi/e;LIi/a1;LKi/m;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LKi/e;->O0(LIi/a1;LKi/m;I)V

    return-void
.end method

.method private final C0(JLKi/m;)V
    .locals 4

    :goto_0
    iget-wide v0, p3, LNi/z;->c:J

    cmp-long v0, v0, p1

    if-gez v0, :cond_1

    invoke-virtual {p3}, LNi/b;->f()LNi/b;

    move-result-object v0

    check-cast v0, LKi/m;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    move-object p3, v0

    goto :goto_0

    :cond_1
    :goto_1
    invoke-virtual {p3}, LNi/z;->k()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {p3}, LNi/b;->f()LNi/b;

    move-result-object p1

    check-cast p1, LKi/m;

    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    move-object p3, p1

    goto :goto_1

    :cond_3
    :goto_2
    invoke-static {}, LKi/e;->a0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p1

    :cond_4
    :goto_3
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LNi/z;

    iget-wide v0, p2, LNi/z;->c:J

    iget-wide v2, p3, LNi/z;->c:J

    cmp-long v0, v0, v2

    if-ltz v0, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual {p3}, LNi/z;->u()Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_1

    :cond_6
    invoke-static {p1, p0, p2, p3}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p2}, LNi/z;->p()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-virtual {p2}, LNi/b;->n()V

    :cond_7
    :goto_4
    return-void

    :cond_8
    invoke-virtual {p3}, LNi/z;->p()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-virtual {p3}, LNi/b;->n()V

    goto :goto_3
.end method

.method public static final synthetic D(LKi/e;LIi/a1;LKi/m;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LKi/e;->P0(LIi/a1;LKi/m;I)V

    return-void
.end method

.method private final D0(Ljava/lang/Throwable;Ljava/lang/Object;Ldh/i;)V
    .locals 0

    iget-object p1, p0, LKi/e;->b:Lmh/l;

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {p2}, LKi/k;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {p1, p2, p3}, LNi/v;->a(Lmh/l;Ljava/lang/Object;Ldh/i;)V

    return-void
.end method

.method public static final synthetic E(LKi/e;LKi/m;IJLdh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct/range {p0 .. p5}, LKi/e;->S0(LKi/m;IJLdh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final E0(Ljava/lang/Throwable;Ljava/lang/Object;Ldh/i;)V
    .locals 0

    iget-object p1, p0, LKi/e;->b:Lmh/l;

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {p1, p2, p3}, LNi/v;->a(Lmh/l;Ljava/lang/Object;Ldh/i;)V

    return-void
.end method

.method public static final synthetic F(LKi/e;LKi/m;IJLjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-direct/range {p0 .. p5}, LKi/e;->g1(LKi/m;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic G(LKi/e;LKi/m;ILjava/lang/Object;JLjava/lang/Object;Z)I
    .locals 0

    invoke-direct/range {p0 .. p7}, LKi/e;->i1(LKi/m;ILjava/lang/Object;JLjava/lang/Object;Z)I

    move-result p0

    return p0
.end method

.method private final G0(LIi/n;)V
    .locals 2

    sget-object v0, LYg/u;->b:LYg/u$a;

    sget-object v0, LKi/k;->b:LKi/k$b;

    invoke-virtual {p0}, LKi/e;->b0()Ljava/lang/Throwable;

    move-result-object v1

    invoke-virtual {v0, v1}, LKi/k$b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LKi/k;->b(Ljava/lang/Object;)LKi/k;

    move-result-object v0

    invoke-static {v0}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method private final H(Lmh/l;Ljava/lang/Object;)Lmh/q;
    .locals 1

    new-instance v0, LKi/c;

    invoke-direct {v0, p1, p2}, LKi/c;-><init>(Lmh/l;Ljava/lang/Object;)V

    return-object v0
.end method

.method private final H0(LIi/n;)V
    .locals 1

    sget-object v0, LYg/u;->b:LYg/u$a;

    invoke-direct {p0}, LKi/e;->e0()Ljava/lang/Throwable;

    move-result-object v0

    invoke-static {v0}, LYg/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method private final I(Lmh/l;)Lth/g;
    .locals 0

    new-instance p1, LKi/e$b;

    invoke-direct {p1, p0}, LKi/e$b;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method private final I0(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 4

    new-instance v0, LIi/p;

    invoke-static {p2}, Leh/b;->d(Ldh/e;)Ldh/e;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LIi/p;-><init>(Ldh/e;I)V

    invoke-virtual {v0}, LIi/p;->A()V

    iget-object v1, p0, LKi/e;->b:Lmh/l;

    if-eqz v1, :cond_0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v1, p1, v3, v2, v3}, LNi/v;->c(Lmh/l;Ljava/lang/Object;Lkotlinx/coroutines/internal/UndeliveredElementException;ILjava/lang/Object;)Lkotlinx/coroutines/internal/UndeliveredElementException;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LKi/e;->i0()Ljava/lang/Throwable;

    move-result-object v1

    invoke-static {p1, v1}, LYg/g;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    sget-object v1, LYg/u;->b:LYg/u$a;

    invoke-static {p1}, LYg/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LKi/e;->i0()Ljava/lang/Throwable;

    move-result-object p1

    sget-object v1, LYg/u;->b:LYg/u$a;

    invoke-static {p1}, LYg/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {v0}, LIi/p;->u()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_1

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->c(Ldh/e;)V

    :cond_1
    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method private static final J(Lmh/l;Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/Object;Ldh/i;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p4}, LNi/v;->a(Lmh/l;Ljava/lang/Object;Ldh/i;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private final J0(Ljava/lang/Object;LIi/n;)V
    .locals 2

    iget-object v0, p0, LKi/e;->b:Lmh/l;

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ldh/e;->getContext()Ldh/i;

    move-result-object v1

    invoke-static {v0, p1, v1}, LNi/v;->a(Lmh/l;Ljava/lang/Object;Ldh/i;)V

    :cond_0
    invoke-virtual {p0}, LKi/e;->i0()Ljava/lang/Throwable;

    move-result-object p1

    sget-object v0, LYg/u;->b:LYg/u$a;

    invoke-static {p1}, LYg/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p2, p1}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method private final K(Lmh/l;)Lth/g;
    .locals 0

    new-instance p1, LKi/e$c;

    invoke-direct {p1, p0}, LKi/e$c;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method private final L(J)Z
    .locals 4

    invoke-direct {p0}, LKi/e;->Z()J

    move-result-wide v0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_1

    invoke-virtual {p0}, LKi/e;->h0()J

    move-result-wide v0

    iget v2, p0, LKi/e;->a:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    cmp-long p1, p1, v0

    if-gez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method private static final M0(LKi/e;LSi/e;Ljava/lang/Object;Ljava/lang/Object;)Lmh/q;
    .locals 0

    new-instance p2, LKi/d;

    invoke-direct {p2, p3, p0, p1}, LKi/d;-><init>(Ljava/lang/Object;LKi/e;LSi/e;)V

    return-object p2
.end method

.method private final N(LKi/m;J)V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v1, v0}, LNi/i;->b(Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    const/4 v2, -0x1

    if-eqz p1, :cond_6

    sget v3, LKi/f;->b:I

    sub-int/2addr v3, v1

    :goto_1
    if-ge v2, v3, :cond_5

    iget-wide v4, p1, LNi/z;->c:J

    sget v6, LKi/f;->b:I

    int-to-long v6, v6

    mul-long/2addr v4, v6

    int-to-long v6, v3

    add-long/2addr v4, v6

    cmp-long v4, v4, p2

    if-ltz v4, :cond_6

    :cond_0
    invoke-virtual {p1, v3}, LKi/m;->B(I)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-static {}, LKi/f;->k()LNi/C;

    move-result-object v5

    if-ne v4, v5, :cond_1

    goto :goto_2

    :cond_1
    instance-of v5, v4, LKi/x;

    if-eqz v5, :cond_2

    invoke-static {}, LKi/f;->z()LNi/C;

    move-result-object v5

    invoke-virtual {p1, v3, v4, v5}, LKi/m;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    check-cast v4, LKi/x;

    iget-object v4, v4, LKi/x;->a:LIi/a1;

    invoke-static {v0, v4}, LNi/i;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v3, v1}, LKi/m;->C(IZ)V

    goto :goto_3

    :cond_2
    instance-of v5, v4, LIi/a1;

    if-eqz v5, :cond_4

    invoke-static {}, LKi/f;->z()LNi/C;

    move-result-object v5

    invoke-virtual {p1, v3, v4, v5}, LKi/m;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-static {v0, v4}, LNi/i;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v3, v1}, LKi/m;->C(IZ)V

    goto :goto_3

    :cond_3
    :goto_2
    invoke-static {}, LKi/f;->z()LNi/C;

    move-result-object v5

    invoke-virtual {p1, v3, v4, v5}, LKi/m;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {p1}, LNi/z;->t()V

    :cond_4
    :goto_3
    add-int/lit8 v3, v3, -0x1

    goto :goto_1

    :cond_5
    invoke-virtual {p1}, LNi/b;->h()LNi/b;

    move-result-object p1

    check-cast p1, LKi/m;

    goto :goto_0

    :cond_6
    if-eqz v0, :cond_8

    instance-of p1, v0, Ljava/util/ArrayList;

    if-nez p1, :cond_7

    check-cast v0, LIi/a1;

    invoke-direct {p0, v0}, LKi/e;->V0(LIi/a1;)V

    goto :goto_5

    :cond_7
    const-string p1, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    sub-int/2addr p1, v1

    :goto_4
    if-ge v2, p1, :cond_8

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LIi/a1;

    invoke-direct {p0, p2}, LKi/e;->V0(LIi/a1;)V

    add-int/lit8 p1, p1, -0x1

    goto :goto_4

    :cond_8
    :goto_5
    return-void
.end method

.method private static final N0(Ljava/lang/Object;LKi/e;LSi/e;Ljava/lang/Throwable;Ljava/lang/Object;Ldh/i;)LYg/J;
    .locals 0

    invoke-static {}, LKi/f;->z()LNi/C;

    move-result-object p3

    if-eq p0, p3, :cond_0

    iget-object p1, p1, LKi/e;->b:Lmh/l;

    invoke-interface {p2}, LSi/e;->getContext()Ldh/i;

    move-result-object p2

    invoke-static {p1, p0, p2}, LNi/v;->a(Lmh/l;Ljava/lang/Object;Ldh/i;)V

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private final O()LKi/m;
    .locals 6

    invoke-static {}, LKi/e;->a0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, LKi/e;->j0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LKi/m;

    iget-wide v2, v1, LNi/z;->c:J

    move-object v4, v0

    check-cast v4, LKi/m;

    iget-wide v4, v4, LNi/z;->c:J

    cmp-long v2, v2, v4

    if-lez v2, :cond_0

    move-object v0, v1

    :cond_0
    invoke-static {}, LKi/e;->f0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LKi/m;

    iget-wide v2, v1, LNi/z;->c:J

    move-object v4, v0

    check-cast v4, LKi/m;

    iget-wide v4, v4, LNi/z;->c:J

    cmp-long v2, v2, v4

    if-lez v2, :cond_1

    move-object v0, v1

    :cond_1
    check-cast v0, LNi/b;

    invoke-static {v0}, LNi/a;->b(LNi/b;)LNi/b;

    move-result-object v0

    check-cast v0, LKi/m;

    return-object v0
.end method

.method private final O0(LIi/a1;LKi/m;I)V
    .locals 0

    invoke-virtual {p0}, LKi/e;->L0()V

    invoke-interface {p1, p2, p3}, LIi/a1;->b(LNi/z;I)V

    return-void
.end method

.method private final P0(LIi/a1;LKi/m;I)V
    .locals 1

    sget v0, LKi/f;->b:I

    add-int/2addr p3, v0

    invoke-interface {p1, p2, p3}, LIi/a1;->b(LNi/z;I)V

    return-void
.end method

.method private final Q(J)V
    .locals 0

    invoke-direct {p0, p1, p2}, LKi/e;->R(J)LKi/m;

    move-result-object p1

    invoke-direct {p0, p1}, LKi/e;->U0(LKi/m;)V

    return-void
.end method

.method static synthetic Q0(LKi/e;Ldh/e;)Ljava/lang/Object;
    .locals 10

    invoke-static {}, LKi/e;->s()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LKi/m;

    :cond_0
    :goto_0
    invoke-virtual {p0}, LKi/e;->t0()Z

    move-result v1

    if-nez v1, :cond_6

    invoke-static {}, LKi/e;->t()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v8

    sget v1, LKi/f;->b:I

    int-to-long v2, v1

    div-long v2, v8, v2

    int-to-long v4, v1

    rem-long v4, v8, v4

    long-to-int v1, v4

    iget-wide v4, v0, LNi/z;->c:J

    cmp-long v4, v4, v2

    if-eqz v4, :cond_2

    invoke-static {p0, v2, v3, v0}, LKi/e;->p(LKi/e;JLKi/m;)LKi/m;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    move-object v0, v2

    :cond_2
    const/4 v7, 0x0

    move-object v2, p0

    move-object v3, v0

    move v4, v1

    move-wide v5, v8

    invoke-static/range {v2 .. v7}, LKi/e;->F(LKi/e;LKi/m;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {}, LKi/f;->r()LNi/C;

    move-result-object v3

    if-eq v2, v3, :cond_5

    invoke-static {}, LKi/f;->h()LNi/C;

    move-result-object v3

    if-ne v2, v3, :cond_3

    invoke-virtual {p0}, LKi/e;->l0()J

    move-result-wide v1

    cmp-long v1, v8, v1

    if-gez v1, :cond_0

    invoke-virtual {v0}, LNi/b;->c()V

    goto :goto_0

    :cond_3
    invoke-static {}, LKi/f;->s()LNi/C;

    move-result-object v3

    if-ne v2, v3, :cond_4

    move-object v2, p0

    move-object v3, v0

    move v4, v1

    move-wide v5, v8

    move-object v7, p1

    invoke-direct/range {v2 .. v7}, LKi/e;->T0(LKi/m;IJLdh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_4
    invoke-virtual {v0}, LNi/b;->c()V

    return-object v2

    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "unexpected"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    invoke-direct {p0}, LKi/e;->e0()Ljava/lang/Throwable;

    move-result-object p0

    invoke-static {p0}, LNi/B;->a(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p0

    throw p0
.end method

.method private final R(J)LKi/m;
    .locals 5

    invoke-direct {p0}, LKi/e;->O()LKi/m;

    move-result-object v0

    invoke-virtual {p0}, LKi/e;->w0()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0, v0}, LKi/e;->y0(LKi/m;)J

    move-result-wide v1

    const-wide/16 v3, -0x1

    cmp-long v3, v1, v3

    if-eqz v3, :cond_0

    invoke-virtual {p0, v1, v2}, LKi/e;->T(J)V

    :cond_0
    invoke-direct {p0, v0, p1, p2}, LKi/e;->N(LKi/m;J)V

    return-object v0
.end method

.method static synthetic R0(LKi/e;Ldh/e;)Ljava/lang/Object;
    .locals 13

    instance-of v0, p1, LKi/e$d;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LKi/e$d;

    iget v1, v0, LKi/e$d;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LKi/e$d;->c:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, LKi/e$d;

    invoke-direct {v0, p0, p1}, LKi/e$d;-><init>(LKi/e;Ldh/e;)V

    goto :goto_0

    :goto_1
    iget-object p1, v6, LKi/e$d;->a:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, v6, LKi/e$d;->c:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    check-cast p1, LKi/k;

    invoke-virtual {p1}, LKi/k;->l()Ljava/lang/Object;

    move-result-object p0

    goto/16 :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    invoke-static {}, LKi/e;->s()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LKi/m;

    :cond_3
    :goto_2
    invoke-virtual {p0}, LKi/e;->t0()Z

    move-result v1

    if-eqz v1, :cond_4

    sget-object p1, LKi/k;->b:LKi/k$b;

    invoke-virtual {p0}, LKi/e;->b0()Ljava/lang/Throwable;

    move-result-object p0

    invoke-virtual {p1, p0}, LKi/k$b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_3

    :cond_4
    invoke-static {}, LKi/e;->t()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v4

    sget v1, LKi/f;->b:I

    int-to-long v7, v1

    div-long v7, v4, v7

    int-to-long v9, v1

    rem-long v9, v4, v9

    long-to-int v3, v9

    iget-wide v9, p1, LNi/z;->c:J

    cmp-long v1, v9, v7

    if-eqz v1, :cond_6

    invoke-static {p0, v7, v8, p1}, LKi/e;->p(LKi/e;JLKi/m;)LKi/m;

    move-result-object v1

    if-nez v1, :cond_5

    goto :goto_2

    :cond_5
    move-object p1, v1

    :cond_6
    const/4 v12, 0x0

    move-object v7, p0

    move-object v8, p1

    move v9, v3

    move-wide v10, v4

    invoke-static/range {v7 .. v12}, LKi/e;->F(LKi/e;LKi/m;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, LKi/f;->r()LNi/C;

    move-result-object v7

    if-eq v1, v7, :cond_a

    invoke-static {}, LKi/f;->h()LNi/C;

    move-result-object v7

    if-ne v1, v7, :cond_7

    invoke-virtual {p0}, LKi/e;->l0()J

    move-result-wide v7

    cmp-long v1, v4, v7

    if-gez v1, :cond_3

    invoke-virtual {p1}, LNi/b;->c()V

    goto :goto_2

    :cond_7
    invoke-static {}, LKi/f;->s()LNi/C;

    move-result-object v7

    if-ne v1, v7, :cond_8

    iput v2, v6, LKi/e$d;->c:I

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, LKi/e;->S0(LKi/m;IJLdh/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_9

    return-object v0

    :cond_8
    invoke-virtual {p1}, LNi/b;->c()V

    sget-object p0, LKi/k;->b:LKi/k$b;

    invoke-virtual {p0, v1}, LKi/k$b;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :cond_9
    :goto_3
    return-object p0

    :cond_a
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "unexpected"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final S()V
    .locals 0

    invoke-virtual {p0}, LKi/e;->l()Z

    return-void
.end method

.method private final S0(LKi/m;IJLdh/e;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p5, LKi/e$e;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, LKi/e$e;

    iget v1, v0, LKi/e$e;->g:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LKi/e$e;->g:I

    goto :goto_0

    :cond_0
    new-instance v0, LKi/e$e;

    invoke-direct {v0, p0, p5}, LKi/e$e;-><init>(LKi/e;Ldh/e;)V

    :goto_0
    iget-object p5, v0, LKi/e$e;->e:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LKi/e$e;->g:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, LKi/e$e;->b:Ljava/lang/Object;

    check-cast p1, LKi/m;

    iget-object p1, v0, LKi/e$e;->a:Ljava/lang/Object;

    check-cast p1, LKi/e;

    invoke-static {p5}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p5}, LYg/v;->b(Ljava/lang/Object;)V

    iput-object p0, v0, LKi/e$e;->a:Ljava/lang/Object;

    iput-object p1, v0, LKi/e$e;->b:Ljava/lang/Object;

    iput p2, v0, LKi/e$e;->c:I

    iput-wide p3, v0, LKi/e$e;->d:J

    iput v3, v0, LKi/e$e;->g:I

    invoke-static {v0}, Leh/b;->d(Ldh/e;)Ldh/e;

    move-result-object p5

    invoke-static {p5}, LIi/r;->b(Ldh/e;)LIi/p;

    move-result-object p5

    :try_start_0
    new-instance v8, LKi/u;

    const-string v2, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<E of kotlinx.coroutines.channels.BufferedChannel>>"

    invoke-static {p5, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v8, p5}, LKi/u;-><init>(LIi/p;)V

    move-object v2, p0

    move-object v3, p1

    move v4, p2

    move-wide v5, p3

    move-object v7, v8

    invoke-static/range {v2 .. v7}, LKi/e;->F(LKi/e;LKi/m;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {}, LKi/f;->r()LNi/C;

    move-result-object v3

    if-ne v2, v3, :cond_3

    invoke-static {p0, v8, p1, p2}, LKi/e;->C(LKi/e;LIi/a1;LKi/m;I)V

    goto/16 :goto_3

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :cond_3
    invoke-static {}, LKi/f;->h()LNi/C;

    move-result-object p2

    const/4 v9, 0x0

    if-ne v2, p2, :cond_d

    invoke-virtual {p0}, LKi/e;->l0()J

    move-result-wide v2

    cmp-long p2, p3, v2

    if-gez p2, :cond_4

    invoke-virtual {p1}, LNi/b;->c()V

    :cond_4
    invoke-static {}, LKi/e;->s()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LKi/m;

    :cond_5
    :goto_1
    invoke-virtual {p0}, LKi/e;->t0()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-static {p0, p5}, LKi/e;->z(LKi/e;LIi/n;)V

    goto/16 :goto_3

    :cond_6
    invoke-static {}, LKi/e;->t()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object p2

    invoke-virtual {p2, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide p2

    sget p4, LKi/f;->b:I

    int-to-long v2, p4

    div-long v2, p2, v2

    int-to-long v4, p4

    rem-long v4, p2, v4

    long-to-int p4, v4

    iget-wide v4, p1, LNi/z;->c:J

    cmp-long v4, v4, v2

    if-eqz v4, :cond_8

    invoke-static {p0, v2, v3, p1}, LKi/e;->p(LKi/e;JLKi/m;)LKi/m;

    move-result-object v2

    if-nez v2, :cond_7

    goto :goto_1

    :cond_7
    move-object p1, v2

    :cond_8
    move-object v2, p0

    move-object v3, p1

    move v4, p4

    move-wide v5, p2

    move-object v7, v8

    invoke-static/range {v2 .. v7}, LKi/e;->F(LKi/e;LKi/m;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {}, LKi/f;->r()LNi/C;

    move-result-object v3

    if-ne v2, v3, :cond_9

    invoke-static {p0, v8, p1, p4}, LKi/e;->C(LKi/e;LIi/a1;LKi/m;I)V

    goto :goto_3

    :cond_9
    invoke-static {}, LKi/f;->h()LNi/C;

    move-result-object p4

    if-ne v2, p4, :cond_a

    invoke-virtual {p0}, LKi/e;->l0()J

    move-result-wide v2

    cmp-long p2, p2, v2

    if-gez p2, :cond_5

    invoke-virtual {p1}, LNi/b;->c()V

    goto :goto_1

    :cond_a
    invoke-static {}, LKi/f;->s()LNi/C;

    move-result-object p2

    if-eq v2, p2, :cond_c

    invoke-virtual {p1}, LNi/b;->c()V

    sget-object p1, LKi/k;->b:LKi/k$b;

    invoke-virtual {p1, v2}, LKi/k$b;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LKi/k;->b(Ljava/lang/Object;)LKi/k;

    move-result-object p1

    iget-object p2, p0, LKi/e;->b:Lmh/l;

    if-eqz p2, :cond_b

    invoke-static {p0, p2}, LKi/e;->o(LKi/e;Lmh/l;)Lth/g;

    move-result-object v9

    :cond_b
    check-cast v9, Lmh/q;

    :goto_2
    invoke-virtual {p5, p1, v9}, LIi/p;->b0(Ljava/lang/Object;Lmh/q;)V

    goto :goto_3

    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "unexpected"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d
    invoke-virtual {p1}, LNi/b;->c()V

    sget-object p1, LKi/k;->b:LKi/k$b;

    invoke-virtual {p1, v2}, LKi/k$b;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LKi/k;->b(Ljava/lang/Object;)LKi/k;

    move-result-object p1

    iget-object p2, p0, LKi/e;->b:Lmh/l;

    if-eqz p2, :cond_e

    invoke-static {p0, p2}, LKi/e;->o(LKi/e;Lmh/l;)Lth/g;

    move-result-object v9

    :cond_e
    check-cast v9, Lmh/q;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_3
    invoke-virtual {p5}, LIi/p;->u()Ljava/lang/Object;

    move-result-object p5

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p5, p1, :cond_f

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/h;->c(Ldh/e;)V

    :cond_f
    if-ne p5, v1, :cond_10

    return-object v1

    :cond_10
    :goto_4
    check-cast p5, LKi/k;

    invoke-virtual {p5}, LKi/k;->l()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :goto_5
    invoke-virtual {p5}, LIi/p;->K()V

    throw p1
.end method

.method private final T0(LKi/m;IJLdh/e;)Ljava/lang/Object;
    .locals 8

    invoke-static {p5}, Leh/b;->d(Ldh/e;)Ldh/e;

    move-result-object v0

    invoke-static {v0}, LIi/r;->b(Ldh/e;)LIi/p;

    move-result-object v0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-wide v4, p3

    move-object v6, v0

    :try_start_0
    invoke-static/range {v1 .. v6}, LKi/e;->F(LKi/e;LKi/m;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, LKi/f;->r()LNi/C;

    move-result-object v2

    if-ne v1, v2, :cond_0

    invoke-static {p0, v0, p1, p2}, LKi/e;->C(LKi/e;LIi/a1;LKi/m;I)V

    goto/16 :goto_2

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :cond_0
    invoke-static {}, LKi/f;->h()LNi/C;

    move-result-object p2

    const/4 v7, 0x0

    if-ne v1, p2, :cond_b

    invoke-virtual {p0}, LKi/e;->l0()J

    move-result-wide v1

    cmp-long p2, p3, v1

    if-gez p2, :cond_1

    invoke-virtual {p1}, LNi/b;->c()V

    :cond_1
    invoke-static {}, LKi/e;->s()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LKi/m;

    :cond_2
    :goto_0
    invoke-virtual {p0}, LKi/e;->t0()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-static {p0, v0}, LKi/e;->A(LKi/e;LIi/n;)V

    goto/16 :goto_2

    :cond_3
    invoke-static {}, LKi/e;->t()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object p2

    invoke-virtual {p2, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide p2

    sget p4, LKi/f;->b:I

    int-to-long v1, p4

    div-long v1, p2, v1

    int-to-long v3, p4

    rem-long v3, p2, v3

    long-to-int p4, v3

    iget-wide v3, p1, LNi/z;->c:J

    cmp-long v3, v3, v1

    if-eqz v3, :cond_5

    invoke-static {p0, v1, v2, p1}, LKi/e;->p(LKi/e;JLKi/m;)LKi/m;

    move-result-object v1

    if-nez v1, :cond_4

    goto :goto_0

    :cond_4
    move-object p1, v1

    :cond_5
    move-object v1, p0

    move-object v2, p1

    move v3, p4

    move-wide v4, p2

    move-object v6, v0

    invoke-static/range {v1 .. v6}, LKi/e;->F(LKi/e;LKi/m;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, LKi/f;->r()LNi/C;

    move-result-object v2

    if-ne v1, v2, :cond_7

    if-eqz v0, :cond_6

    move-object v7, v0

    :cond_6
    if-eqz v7, :cond_d

    invoke-static {p0, v7, p1, p4}, LKi/e;->C(LKi/e;LIi/a1;LKi/m;I)V

    goto :goto_2

    :cond_7
    invoke-static {}, LKi/f;->h()LNi/C;

    move-result-object p4

    if-ne v1, p4, :cond_8

    invoke-virtual {p0}, LKi/e;->l0()J

    move-result-wide v1

    cmp-long p2, p2, v1

    if-gez p2, :cond_2

    invoke-virtual {p1}, LNi/b;->c()V

    goto :goto_0

    :cond_8
    invoke-static {}, LKi/f;->s()LNi/C;

    move-result-object p2

    if-eq v1, p2, :cond_a

    invoke-virtual {p1}, LNi/b;->c()V

    iget-object p1, p0, LKi/e;->b:Lmh/l;

    if-eqz p1, :cond_9

    invoke-static {p0, p1}, LKi/e;->n(LKi/e;Lmh/l;)Lth/g;

    move-result-object v7

    :cond_9
    check-cast v7, Lmh/q;

    :goto_1
    invoke-virtual {v0, v1, v7}, LIi/p;->b0(Ljava/lang/Object;Lmh/q;)V

    goto :goto_2

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "unexpected"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    invoke-virtual {p1}, LNi/b;->c()V

    iget-object p1, p0, LKi/e;->b:Lmh/l;

    if-eqz p1, :cond_c

    invoke-static {p0, p1}, LKi/e;->n(LKi/e;Lmh/l;)Lth/g;

    move-result-object v7

    :cond_c
    check-cast v7, Lmh/q;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_d
    :goto_2
    invoke-virtual {v0}, LIi/p;->u()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_e

    invoke-static {p5}, Lkotlin/coroutines/jvm/internal/h;->c(Ldh/e;)V

    :cond_e
    return-object p1

    :goto_3
    invoke-virtual {v0}, LIi/p;->K()V

    throw p1
.end method

.method private final U()V
    .locals 14

    invoke-direct {p0}, LKi/e;->x0()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, LKi/e;->a0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LKi/m;

    :goto_0
    invoke-static {}, LKi/e;->Y()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v7

    sget v9, LKi/f;->b:I

    int-to-long v1, v9

    div-long v2, v7, v1

    invoke-virtual {p0}, LKi/e;->l0()J

    move-result-wide v4

    cmp-long v1, v4, v7

    const/4 v10, 0x0

    const/4 v11, 0x1

    const-wide/16 v12, 0x0

    if-gtz v1, :cond_2

    iget-wide v4, v0, LNi/z;->c:J

    cmp-long v1, v4, v2

    if-gez v1, :cond_1

    invoke-virtual {v0}, LNi/b;->f()LNi/b;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-direct {p0, v2, v3, v0}, LKi/e;->C0(JLKi/m;)V

    :cond_1
    invoke-static {p0, v12, v13, v11, v10}, LKi/e;->p0(LKi/e;JILjava/lang/Object;)V

    return-void

    :cond_2
    iget-wide v4, v0, LNi/z;->c:J

    cmp-long v1, v4, v2

    if-eqz v1, :cond_4

    move-object v1, p0

    move-object v4, v0

    move-wide v5, v7

    invoke-direct/range {v1 .. v6}, LKi/e;->V(JLKi/m;J)LKi/m;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    move-object v0, v1

    :cond_4
    int-to-long v1, v9

    rem-long v1, v7, v1

    long-to-int v1, v1

    invoke-direct {p0, v0, v1, v7, v8}, LKi/e;->e1(LKi/m;IJ)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {p0, v12, v13, v11, v10}, LKi/e;->p0(LKi/e;JILjava/lang/Object;)V

    return-void

    :cond_5
    invoke-static {p0, v12, v13, v11, v10}, LKi/e;->p0(LKi/e;JILjava/lang/Object;)V

    goto :goto_0
.end method

.method private final U0(LKi/m;)V
    .locals 11

    iget-object v0, p0, LKi/e;->b:Lmh/l;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v1, v2, v1}, LNi/i;->b(Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)Ljava/lang/Object;

    move-result-object v3

    :cond_0
    sget v4, LKi/f;->b:I

    sub-int/2addr v4, v2

    :goto_0
    const/4 v5, -0x1

    if-ge v5, v4, :cond_b

    iget-wide v6, p1, LNi/z;->c:J

    sget v8, LKi/f;->b:I

    int-to-long v8, v8

    mul-long/2addr v6, v8

    int-to-long v8, v4

    add-long/2addr v6, v8

    :cond_1
    invoke-virtual {p1, v4}, LKi/m;->B(I)Ljava/lang/Object;

    move-result-object v8

    invoke-static {}, LKi/f;->f()LNi/C;

    move-result-object v9

    if-eq v8, v9, :cond_c

    sget-object v9, LKi/f;->d:LNi/C;

    if-ne v8, v9, :cond_3

    invoke-virtual {p0}, LKi/e;->h0()J

    move-result-wide v9

    cmp-long v9, v6, v9

    if-ltz v9, :cond_c

    invoke-static {}, LKi/f;->z()LNi/C;

    move-result-object v9

    invoke-virtual {p1, v4, v8, v9}, LKi/m;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    if-eqz v0, :cond_2

    invoke-virtual {p1, v4}, LKi/m;->A(I)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v0, v5, v1}, LNi/v;->b(Lmh/l;Ljava/lang/Object;Lkotlinx/coroutines/internal/UndeliveredElementException;)Lkotlinx/coroutines/internal/UndeliveredElementException;

    move-result-object v1

    :cond_2
    invoke-virtual {p1, v4}, LKi/m;->w(I)V

    invoke-virtual {p1}, LNi/z;->t()V

    goto/16 :goto_4

    :cond_3
    invoke-static {}, LKi/f;->k()LNi/C;

    move-result-object v9

    if-eq v8, v9, :cond_a

    if-nez v8, :cond_4

    goto :goto_3

    :cond_4
    instance-of v9, v8, LIi/a1;

    if-nez v9, :cond_7

    instance-of v9, v8, LKi/x;

    if-eqz v9, :cond_5

    goto :goto_1

    :cond_5
    invoke-static {}, LKi/f;->p()LNi/C;

    move-result-object v9

    if-eq v8, v9, :cond_c

    invoke-static {}, LKi/f;->q()LNi/C;

    move-result-object v9

    if-ne v8, v9, :cond_6

    goto :goto_5

    :cond_6
    invoke-static {}, LKi/f;->p()LNi/C;

    move-result-object v9

    if-eq v8, v9, :cond_1

    goto :goto_4

    :cond_7
    :goto_1
    invoke-virtual {p0}, LKi/e;->h0()J

    move-result-wide v9

    cmp-long v9, v6, v9

    if-ltz v9, :cond_c

    instance-of v9, v8, LKi/x;

    if-eqz v9, :cond_8

    move-object v9, v8

    check-cast v9, LKi/x;

    iget-object v9, v9, LKi/x;->a:LIi/a1;

    goto :goto_2

    :cond_8
    move-object v9, v8

    check-cast v9, LIi/a1;

    :goto_2
    invoke-static {}, LKi/f;->z()LNi/C;

    move-result-object v10

    invoke-virtual {p1, v4, v8, v10}, LKi/m;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    if-eqz v0, :cond_9

    invoke-virtual {p1, v4}, LKi/m;->A(I)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v0, v5, v1}, LNi/v;->b(Lmh/l;Ljava/lang/Object;Lkotlinx/coroutines/internal/UndeliveredElementException;)Lkotlinx/coroutines/internal/UndeliveredElementException;

    move-result-object v1

    :cond_9
    invoke-static {v3, v9}, LNi/i;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p1, v4}, LKi/m;->w(I)V

    invoke-virtual {p1}, LNi/z;->t()V

    goto :goto_4

    :cond_a
    :goto_3
    invoke-static {}, LKi/f;->z()LNi/C;

    move-result-object v9

    invoke-virtual {p1, v4, v8, v9}, LKi/m;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-virtual {p1}, LNi/z;->t()V

    :goto_4
    add-int/lit8 v4, v4, -0x1

    goto/16 :goto_0

    :cond_b
    invoke-virtual {p1}, LNi/b;->h()LNi/b;

    move-result-object p1

    check-cast p1, LKi/m;

    if-nez p1, :cond_0

    :cond_c
    :goto_5
    if-eqz v3, :cond_e

    instance-of p1, v3, Ljava/util/ArrayList;

    if-nez p1, :cond_d

    check-cast v3, LIi/a1;

    invoke-direct {p0, v3}, LKi/e;->W0(LIi/a1;)V

    goto :goto_7

    :cond_d
    const-string p1, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>"

    invoke-static {v3, p1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result p1

    sub-int/2addr p1, v2

    :goto_6
    if-ge v5, p1, :cond_e

    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LIi/a1;

    invoke-direct {p0, v0}, LKi/e;->W0(LIi/a1;)V

    add-int/lit8 p1, p1, -0x1

    goto :goto_6

    :cond_e
    :goto_7
    if-nez v1, :cond_f

    return-void

    :cond_f
    throw v1
.end method

.method private final V(JLKi/m;J)LKi/m;
    .locals 15

    move-object v6, p0

    move-wide/from16 v0, p1

    invoke-static {}, LKi/e;->a0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v2

    invoke-static {}, LKi/f;->y()Lth/g;

    move-result-object v3

    check-cast v3, Lmh/p;

    move-object/from16 v4, p3

    :goto_0
    invoke-static {v4, v0, v1, v3}, LNi/a;->c(LNi/z;JLmh/p;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, LNi/A;->c(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_4

    invoke-static {v5}, LNi/A;->b(Ljava/lang/Object;)LNi/z;

    move-result-object v7

    :cond_0
    :goto_1
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LNi/z;

    iget-wide v9, v8, LNi/z;->c:J

    iget-wide v11, v7, LNi/z;->c:J

    cmp-long v9, v9, v11

    if-ltz v9, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {v7}, LNi/z;->u()Z

    move-result v9

    if-nez v9, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {v2, p0, v8, v7}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-virtual {v8}, LNi/z;->p()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {v8}, LNi/b;->n()V

    goto :goto_2

    :cond_3
    invoke-virtual {v7}, LNi/z;->p()Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-virtual {v7}, LNi/b;->n()V

    goto :goto_1

    :cond_4
    :goto_2
    invoke-static {v5}, LNi/A;->c(Ljava/lang/Object;)Z

    move-result v2

    const/4 v7, 0x1

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    if-eqz v2, :cond_5

    invoke-direct {p0}, LKi/e;->S()V

    invoke-direct/range {p0 .. p3}, LKi/e;->C0(JLKi/m;)V

    invoke-static {p0, v8, v9, v7, v10}, LKi/e;->p0(LKi/e;JILjava/lang/Object;)V

    goto :goto_3

    :cond_5
    invoke-static {v5}, LNi/A;->b(Ljava/lang/Object;)LNi/z;

    move-result-object v2

    move-object v11, v2

    check-cast v11, LKi/m;

    iget-wide v2, v11, LNi/z;->c:J

    cmp-long v0, v2, v0

    if-lez v0, :cond_7

    invoke-static {}, LKi/e;->Y()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    const-wide/16 v1, 0x1

    add-long v2, p4, v1

    iget-wide v4, v11, LNi/z;->c:J

    sget v12, LKi/f;->b:I

    int-to-long v13, v12

    mul-long/2addr v4, v13

    move-object v1, p0

    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-wide v0, v11, LNi/z;->c:J

    int-to-long v2, v12

    mul-long/2addr v0, v2

    sub-long v0, v0, p4

    invoke-direct {p0, v0, v1}, LKi/e;->o0(J)V

    goto :goto_3

    :cond_6
    invoke-static {p0, v8, v9, v7, v10}, LKi/e;->p0(LKi/e;JILjava/lang/Object;)V

    goto :goto_3

    :cond_7
    move-object v10, v11

    :goto_3
    return-object v10
.end method

.method private final V0(LIi/a1;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, LKi/e;->X0(LIi/a1;Z)V

    return-void
.end method

.method private final W(JLKi/m;)LKi/m;
    .locals 9

    invoke-static {}, LKi/e;->f0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-static {}, LKi/f;->y()Lth/g;

    move-result-object v1

    check-cast v1, Lmh/p;

    :goto_0
    invoke-static {p3, p1, p2, v1}, LNi/a;->c(LNi/z;JLmh/p;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, LNi/A;->c(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    invoke-static {v2}, LNi/A;->b(Ljava/lang/Object;)LNi/z;

    move-result-object v3

    :cond_0
    :goto_1
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LNi/z;

    iget-wide v5, v4, LNi/z;->c:J

    iget-wide v7, v3, LNi/z;->c:J

    cmp-long v5, v5, v7

    if-ltz v5, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {v3}, LNi/z;->u()Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {v0, p0, v4, v3}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {v4}, LNi/z;->p()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v4}, LNi/b;->n()V

    goto :goto_2

    :cond_3
    invoke-virtual {v3}, LNi/z;->p()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v3}, LNi/b;->n()V

    goto :goto_1

    :cond_4
    :goto_2
    invoke-static {v2}, LNi/A;->c(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    invoke-direct {p0}, LKi/e;->S()V

    iget-wide p1, p3, LNi/z;->c:J

    sget v0, LKi/f;->b:I

    int-to-long v2, v0

    mul-long/2addr p1, v2

    invoke-virtual {p0}, LKi/e;->l0()J

    move-result-wide v2

    cmp-long p1, p1, v2

    if-gez p1, :cond_a

    invoke-virtual {p3}, LNi/b;->c()V

    goto :goto_5

    :cond_5
    invoke-static {v2}, LNi/A;->b(Ljava/lang/Object;)LNi/z;

    move-result-object p3

    check-cast p3, LKi/m;

    invoke-direct {p0}, LKi/e;->x0()Z

    move-result v0

    if-nez v0, :cond_8

    invoke-direct {p0}, LKi/e;->Z()J

    move-result-wide v2

    sget v0, LKi/f;->b:I

    int-to-long v4, v0

    div-long/2addr v2, v4

    cmp-long v0, p1, v2

    if-gtz v0, :cond_8

    invoke-static {}, LKi/e;->a0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    :cond_6
    :goto_3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LNi/z;

    iget-wide v3, v2, LNi/z;->c:J

    iget-wide v5, p3, LNi/z;->c:J

    cmp-long v3, v3, v5

    if-gez v3, :cond_8

    invoke-virtual {p3}, LNi/z;->u()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-static {v0, p0, v2, p3}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {v2}, LNi/z;->p()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {v2}, LNi/b;->n()V

    goto :goto_4

    :cond_7
    invoke-virtual {p3}, LNi/z;->p()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-virtual {p3}, LNi/b;->n()V

    goto :goto_3

    :cond_8
    :goto_4
    iget-wide v2, p3, LNi/z;->c:J

    cmp-long p1, v2, p1

    if-lez p1, :cond_9

    sget p1, LKi/f;->b:I

    int-to-long v4, p1

    mul-long/2addr v2, v4

    invoke-direct {p0, v2, v3}, LKi/e;->k1(J)V

    iget-wide v2, p3, LNi/z;->c:J

    int-to-long p1, p1

    mul-long/2addr v2, p1

    invoke-virtual {p0}, LKi/e;->l0()J

    move-result-wide p1

    cmp-long p1, v2, p1

    if-gez p1, :cond_a

    invoke-virtual {p3}, LNi/b;->c()V

    goto :goto_5

    :cond_9
    move-object v1, p3

    :cond_a
    :goto_5
    return-object v1
.end method

.method private final W0(LIi/a1;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LKi/e;->X0(LIi/a1;Z)V

    return-void
.end method

.method private final X(JLKi/m;)LKi/m;
    .locals 9

    invoke-static {}, LKi/e;->j0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-static {}, LKi/f;->y()Lth/g;

    move-result-object v1

    check-cast v1, Lmh/p;

    :goto_0
    invoke-static {p3, p1, p2, v1}, LNi/a;->c(LNi/z;JLmh/p;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, LNi/A;->c(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    invoke-static {v2}, LNi/A;->b(Ljava/lang/Object;)LNi/z;

    move-result-object v3

    :cond_0
    :goto_1
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LNi/z;

    iget-wide v5, v4, LNi/z;->c:J

    iget-wide v7, v3, LNi/z;->c:J

    cmp-long v5, v5, v7

    if-ltz v5, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {v3}, LNi/z;->u()Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {v0, p0, v4, v3}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {v4}, LNi/z;->p()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v4}, LNi/b;->n()V

    goto :goto_2

    :cond_3
    invoke-virtual {v3}, LNi/z;->p()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v3}, LNi/b;->n()V

    goto :goto_1

    :cond_4
    :goto_2
    invoke-static {v2}, LNi/A;->c(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    invoke-direct {p0}, LKi/e;->S()V

    iget-wide p1, p3, LNi/z;->c:J

    sget v0, LKi/f;->b:I

    int-to-long v2, v0

    mul-long/2addr p1, v2

    invoke-virtual {p0}, LKi/e;->h0()J

    move-result-wide v2

    cmp-long p1, p1, v2

    if-gez p1, :cond_7

    invoke-virtual {p3}, LNi/b;->c()V

    goto :goto_3

    :cond_5
    invoke-static {v2}, LNi/A;->b(Ljava/lang/Object;)LNi/z;

    move-result-object p3

    check-cast p3, LKi/m;

    iget-wide v2, p3, LNi/z;->c:J

    cmp-long p1, v2, p1

    if-lez p1, :cond_6

    sget p1, LKi/f;->b:I

    int-to-long v4, p1

    mul-long/2addr v2, v4

    invoke-direct {p0, v2, v3}, LKi/e;->l1(J)V

    iget-wide v2, p3, LNi/z;->c:J

    int-to-long p1, p1

    mul-long/2addr v2, p1

    invoke-virtual {p0}, LKi/e;->h0()J

    move-result-wide p1

    cmp-long p1, v2, p1

    if-gez p1, :cond_7

    invoke-virtual {p3}, LNi/b;->c()V

    goto :goto_3

    :cond_6
    move-object v1, p3

    :cond_7
    :goto_3
    return-object v1
.end method

.method private final X0(LIi/a1;Z)V
    .locals 2

    instance-of v0, p1, LIi/n;

    if-eqz v0, :cond_1

    check-cast p1, Ldh/e;

    sget-object v0, LYg/u;->b:LYg/u$a;

    if-eqz p2, :cond_0

    invoke-direct {p0}, LKi/e;->e0()Ljava/lang/Throwable;

    move-result-object p2

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LKi/e;->i0()Ljava/lang/Throwable;

    move-result-object p2

    :goto_0
    invoke-static {p2}, LYg/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p1, p2}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    instance-of p2, p1, LKi/u;

    if-eqz p2, :cond_2

    check-cast p1, LKi/u;

    iget-object p1, p1, LKi/u;->a:LIi/p;

    sget-object p2, LYg/u;->b:LYg/u$a;

    sget-object p2, LKi/k;->b:LKi/k$b;

    invoke-virtual {p0}, LKi/e;->b0()Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p2, v0}, LKi/k$b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, LKi/k;->b(Ljava/lang/Object;)LKi/k;

    move-result-object p2

    invoke-static {p2}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p1, p2}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    instance-of p2, p1, LKi/e$a;

    if-eqz p2, :cond_3

    check-cast p1, LKi/e$a;

    invoke-virtual {p1}, LKi/e$a;->j()V

    :goto_1
    return-void

    :cond_3
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected waiter: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private static final synthetic Y()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
    .locals 1

    sget-object v0, LKi/e;->f:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    return-object v0
.end method

.method static synthetic Y0(LKi/e;Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 13

    invoke-static {}, LKi/e;->u()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LKi/m;

    :cond_0
    :goto_0
    invoke-static {}, LKi/e;->v()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v1

    const-wide v3, 0xfffffffffffffffL

    and-long/2addr v3, v1

    invoke-static {p0, v1, v2}, LKi/e;->w(LKi/e;J)Z

    move-result v1

    sget v2, LKi/f;->b:I

    int-to-long v5, v2

    div-long v5, v3, v5

    int-to-long v7, v2

    rem-long v7, v3, v7

    long-to-int v2, v7

    iget-wide v7, v0, LNi/z;->c:J

    cmp-long v7, v7, v5

    if-eqz v7, :cond_2

    invoke-static {p0, v5, v6, v0}, LKi/e;->q(LKi/e;JLKi/m;)LKi/m;

    move-result-object v5

    if-nez v5, :cond_1

    if-eqz v1, :cond_0

    invoke-direct {p0, p1, p2}, LKi/e;->I0(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_9

    return-object p0

    :cond_1
    move-object v0, v5

    :cond_2
    const/4 v11, 0x0

    move-object v5, p0

    move-object v6, v0

    move v7, v2

    move-object v8, p1

    move-wide v9, v3

    move v12, v1

    invoke-static/range {v5 .. v12}, LKi/e;->G(LKi/e;LKi/m;ILjava/lang/Object;JLjava/lang/Object;Z)I

    move-result v5

    if-eqz v5, :cond_8

    const/4 v6, 0x1

    if-eq v5, v6, :cond_9

    const/4 v6, 0x2

    if-eq v5, v6, :cond_7

    const/4 v1, 0x3

    if-eq v5, v1, :cond_6

    const/4 v1, 0x4

    if-eq v5, v1, :cond_4

    const/4 v1, 0x5

    if-eq v5, v1, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, LNi/b;->c()V

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, LKi/e;->h0()J

    move-result-wide v1

    cmp-long v1, v3, v1

    if-gez v1, :cond_5

    invoke-virtual {v0}, LNi/b;->c()V

    :cond_5
    invoke-direct {p0, p1, p2}, LKi/e;->I0(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_9

    return-object p0

    :cond_6
    move-object v5, p0

    move-object v6, v0

    move v7, v2

    move-object v8, p1

    move-wide v9, v3

    move-object v11, p2

    invoke-direct/range {v5 .. v11}, LKi/e;->Z0(LKi/m;ILjava/lang/Object;JLdh/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_9

    return-object p0

    :cond_7
    if-eqz v1, :cond_9

    invoke-virtual {v0}, LNi/z;->t()V

    invoke-direct {p0, p1, p2}, LKi/e;->I0(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_9

    return-object p0

    :cond_8
    invoke-virtual {v0}, LNi/b;->c()V

    :cond_9
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private final Z()J
    .locals 2

    invoke-static {}, LKi/e;->Y()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    return-wide v0
.end method

.method private final Z0(LKi/m;ILjava/lang/Object;JLdh/e;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v9, p0

    move-object/from16 v0, p3

    invoke-static/range {p6 .. p6}, Leh/b;->d(Ldh/e;)Ldh/e;

    move-result-object v1

    invoke-static {v1}, LIi/r;->b(Ldh/e;)LIi/p;

    move-result-object v10

    const/4 v8, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    move-wide/from16 v5, p4

    move-object v7, v10

    :try_start_0
    invoke-static/range {v1 .. v8}, LKi/e;->G(LKi/e;LKi/m;ILjava/lang/Object;JLjava/lang/Object;Z)I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_10

    const/4 v11, 0x1

    if-eq v1, v11, :cond_f

    const/4 v12, 0x2

    if-eq v1, v12, :cond_e

    const/4 v13, 0x4

    if-eq v1, v13, :cond_d

    const-string v14, "unexpected"

    const/4 v15, 0x5

    if-ne v1, v15, :cond_c

    :try_start_1
    invoke-virtual/range {p1 .. p1}, LNi/b;->c()V

    invoke-static {}, LKi/e;->u()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LKi/m;

    :cond_0
    :goto_0
    invoke-static {}, LKi/e;->v()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v2

    const-wide v4, 0xfffffffffffffffL

    and-long v16, v2, v4

    invoke-static {v9, v2, v3}, LKi/e;->w(LKi/e;J)Z

    move-result v18

    sget v2, LKi/f;->b:I

    int-to-long v3, v2

    div-long v3, v16, v3

    int-to-long v5, v2

    rem-long v5, v16, v5

    long-to-int v8, v5

    iget-wide v5, v1, LNi/z;->c:J

    cmp-long v2, v5, v3

    if-eqz v2, :cond_3

    invoke-static {v9, v3, v4, v1}, LKi/e;->q(LKi/e;JLKi/m;)LKi/m;

    move-result-object v2

    if-nez v2, :cond_2

    if-eqz v18, :cond_0

    :cond_1
    :goto_1
    invoke-static {v9, v0, v10}, LKi/e;->B(LKi/e;Ljava/lang/Object;LIi/n;)V

    goto/16 :goto_6

    :catchall_0
    move-exception v0

    goto/16 :goto_7

    :cond_2
    move-object v7, v2

    goto :goto_2

    :cond_3
    move-object v7, v1

    :goto_2
    move-object/from16 v1, p0

    move-object v2, v7

    move v3, v8

    move-object/from16 v4, p3

    move-wide/from16 v5, v16

    move-object/from16 p1, v7

    move-object v7, v10

    move/from16 v19, v8

    move/from16 v8, v18

    invoke-static/range {v1 .. v8}, LKi/e;->G(LKi/e;LKi/m;ILjava/lang/Object;JLjava/lang/Object;Z)I

    move-result v1

    if-eqz v1, :cond_b

    if-eq v1, v11, :cond_a

    if-eq v1, v12, :cond_7

    const/4 v2, 0x3

    if-eq v1, v2, :cond_6

    if-eq v1, v13, :cond_5

    if-eq v1, v15, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual/range {p1 .. p1}, LNi/b;->c()V

    :goto_3
    move-object/from16 v1, p1

    goto :goto_0

    :cond_5
    invoke-virtual/range {p0 .. p0}, LKi/e;->h0()J

    move-result-wide v1

    cmp-long v1, v16, v1

    if-gez v1, :cond_1

    invoke-virtual/range {p1 .. p1}, LNi/b;->c()V

    goto :goto_1

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v14}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    if-eqz v18, :cond_8

    invoke-virtual/range {p1 .. p1}, LNi/z;->t()V

    goto :goto_1

    :cond_8
    if-eqz v10, :cond_9

    move-object v0, v10

    goto :goto_4

    :cond_9
    const/4 v0, 0x0

    :goto_4
    if-eqz v0, :cond_11

    move-object/from16 v2, p1

    move/from16 v1, v19

    invoke-static {v9, v0, v2, v1}, LKi/e;->D(LKi/e;LIi/a1;LKi/m;I)V

    goto :goto_6

    :cond_a
    sget-object v0, LYg/u;->b:LYg/u$a;

    sget-object v0, LYg/J;->a:LYg/J;

    invoke-static {v0}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_5
    invoke-interface {v10, v0}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    goto :goto_6

    :cond_b
    move-object/from16 v2, p1

    invoke-virtual {v2}, LNi/b;->c()V

    sget-object v0, LYg/u;->b:LYg/u$a;

    sget-object v0, LYg/J;->a:LYg/J;

    invoke-static {v0}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_5

    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v14}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    invoke-virtual/range {p0 .. p0}, LKi/e;->h0()J

    move-result-wide v1

    cmp-long v1, p4, v1

    if-gez v1, :cond_1

    invoke-virtual/range {p1 .. p1}, LNi/b;->c()V

    goto/16 :goto_1

    :cond_e
    move-object/from16 v0, p1

    move/from16 v1, p2

    invoke-static {v9, v10, v0, v1}, LKi/e;->D(LKi/e;LIi/a1;LKi/m;I)V

    goto :goto_6

    :cond_f
    sget-object v0, LYg/u;->b:LYg/u$a;

    sget-object v0, LYg/J;->a:LYg/J;

    invoke-static {v0}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_5

    :cond_10
    move-object/from16 v0, p1

    invoke-virtual/range {p1 .. p1}, LNi/b;->c()V

    sget-object v0, LYg/u;->b:LYg/u$a;

    sget-object v0, LYg/J;->a:LYg/J;

    invoke-static {v0}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_5

    :cond_11
    :goto_6
    invoke-virtual {v10}, LIi/p;->u()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_12

    invoke-static/range {p6 .. p6}, Lkotlin/coroutines/jvm/internal/h;->c(Ldh/e;)V

    :cond_12
    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_13

    return-object v0

    :cond_13
    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0

    :goto_7
    invoke-virtual {v10}, LIi/p;->K()V

    throw v0
.end method

.method public static synthetic a(Ljava/lang/Object;LKi/e;LSi/e;Ljava/lang/Throwable;Ljava/lang/Object;Ldh/i;)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, LKi/e;->N0(Ljava/lang/Object;LKi/e;LSi/e;Ljava/lang/Throwable;Ljava/lang/Object;Ldh/i;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final synthetic a0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .locals 1

    sget-object v0, LKi/e;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method

.method private final a1(J)Z
    .locals 2

    invoke-direct {p0, p1, p2}, LKi/e;->v0(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const-wide v0, 0xfffffffffffffffL

    and-long/2addr p1, v0

    invoke-direct {p0, p1, p2}, LKi/e;->L(J)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method private final b1(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, LKi/u;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LKi/u;

    iget-object p1, p1, LKi/u;->a:LIi/p;

    sget-object v0, LKi/k;->b:LKi/k$b;

    invoke-virtual {v0, p2}, LKi/k$b;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, LKi/k;->b(Ljava/lang/Object;)LKi/k;

    move-result-object p2

    iget-object v0, p0, LKi/e;->b:Lmh/l;

    if-eqz v0, :cond_0

    invoke-direct {p0, v0}, LKi/e;->K(Lmh/l;)Lth/g;

    move-result-object v1

    :cond_0
    check-cast v1, Lmh/q;

    invoke-static {p1, p2, v1}, LKi/f;->u(LIi/n;Ljava/lang/Object;Lmh/q;)Z

    move-result p1

    goto :goto_0

    :cond_1
    instance-of v0, p1, LKi/e$a;

    if-eqz v0, :cond_2

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LKi/e$a;

    invoke-virtual {p1, p2}, LKi/e$a;->i(Ljava/lang/Object;)Z

    move-result p1

    goto :goto_0

    :cond_2
    instance-of v0, p1, LIi/n;

    if-eqz v0, :cond_4

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LIi/n;

    iget-object v0, p0, LKi/e;->b:Lmh/l;

    if-eqz v0, :cond_3

    invoke-direct {p0, v0}, LKi/e;->I(Lmh/l;)Lth/g;

    move-result-object v1

    :cond_3
    check-cast v1, Lmh/q;

    invoke-static {p1, p2, v1}, LKi/f;->u(LIi/n;Ljava/lang/Object;Lmh/q;)Z

    move-result p1

    :goto_0
    return p1

    :cond_4
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected receiver type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private static final synthetic c0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .locals 1

    sget-object v0, LKi/e;->l:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method

.method private final c1(Ljava/lang/Object;LKi/m;I)Z
    .locals 1

    instance-of p2, p1, LIi/n;

    if-eqz p2, :cond_0

    const-string p2, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LIi/n;

    sget-object p2, LYg/J;->a:LYg/J;

    const/4 p3, 0x2

    const/4 v0, 0x0

    invoke-static {p1, p2, v0, p3, v0}, LKi/f;->C(LIi/n;Ljava/lang/Object;Lmh/q;ILjava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unexpected waiter: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private static final synthetic d0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
    .locals 1

    sget-object v0, LKi/e;->g:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    return-object v0
.end method

.method private final e0()Ljava/lang/Throwable;
    .locals 2

    invoke-virtual {p0}, LKi/e;->b0()Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lkotlinx/coroutines/channels/ClosedReceiveChannelException;

    const-string v1, "Channel was closed"

    invoke-direct {v0, v1}, Lkotlinx/coroutines/channels/ClosedReceiveChannelException;-><init>(Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method

.method private final e1(LKi/m;IJ)Z
    .locals 3

    invoke-virtual {p1, p2}, LKi/m;->B(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LIi/a1;

    if-eqz v1, :cond_1

    invoke-static {}, LKi/e;->g0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v1

    cmp-long v1, p3, v1

    if-ltz v1, :cond_1

    invoke-static {}, LKi/f;->p()LNi/C;

    move-result-object v1

    invoke-virtual {p1, p2, v0, v1}, LKi/m;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-direct {p0, v0, p1, p2}, LKi/e;->c1(Ljava/lang/Object;LKi/m;I)Z

    move-result p3

    if-eqz p3, :cond_0

    sget-object p3, LKi/f;->d:LNi/C;

    invoke-virtual {p1, p2, p3}, LKi/m;->F(ILjava/lang/Object;)V

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    invoke-static {}, LKi/f;->j()LNi/C;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, LKi/m;->F(ILjava/lang/Object;)V

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p3}, LKi/m;->C(IZ)V

    move p1, p3

    :goto_0
    return p1

    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, LKi/e;->f1(LKi/m;IJ)Z

    move-result p1

    return p1
.end method

.method private static final synthetic f0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .locals 1

    sget-object v0, LKi/e;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method

.method private final f1(LKi/m;IJ)Z
    .locals 6

    :cond_0
    :goto_0
    invoke-virtual {p1, p2}, LKi/m;->B(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LIi/a1;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    invoke-static {}, LKi/e;->g0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v4

    cmp-long v1, p3, v4

    if-gez v1, :cond_1

    new-instance v1, LKi/x;

    move-object v2, v0

    check-cast v2, LIi/a1;

    invoke-direct {v1, v2}, LKi/x;-><init>(LIi/a1;)V

    invoke-virtual {p1, p2, v0, v1}, LKi/m;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v3

    :cond_1
    invoke-static {}, LKi/f;->p()LNi/C;

    move-result-object v1

    invoke-virtual {p1, p2, v0, v1}, LKi/m;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0, v0, p1, p2}, LKi/e;->c1(Ljava/lang/Object;LKi/m;I)Z

    move-result p3

    if-eqz p3, :cond_2

    sget-object p3, LKi/f;->d:LNi/C;

    invoke-virtual {p1, p2, p3}, LKi/m;->F(ILjava/lang/Object;)V

    move v2, v3

    goto :goto_1

    :cond_2
    invoke-static {}, LKi/f;->j()LNi/C;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, LKi/m;->F(ILjava/lang/Object;)V

    invoke-virtual {p1, p2, v2}, LKi/m;->C(IZ)V

    :goto_1
    return v2

    :cond_3
    invoke-static {}, LKi/f;->j()LNi/C;

    move-result-object v1

    if-ne v0, v1, :cond_4

    return v2

    :cond_4
    if-nez v0, :cond_5

    invoke-static {}, LKi/f;->k()LNi/C;

    move-result-object v1

    invoke-virtual {p1, p2, v0, v1}, LKi/m;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v3

    :cond_5
    sget-object v1, LKi/f;->d:LNi/C;

    if-ne v0, v1, :cond_6

    return v3

    :cond_6
    invoke-static {}, LKi/f;->o()LNi/C;

    move-result-object v1

    if-eq v0, v1, :cond_a

    invoke-static {}, LKi/f;->f()LNi/C;

    move-result-object v1

    if-eq v0, v1, :cond_a

    invoke-static {}, LKi/f;->i()LNi/C;

    move-result-object v1

    if-ne v0, v1, :cond_7

    goto :goto_2

    :cond_7
    invoke-static {}, LKi/f;->z()LNi/C;

    move-result-object v1

    if-ne v0, v1, :cond_8

    return v3

    :cond_8
    invoke-static {}, LKi/f;->q()LNi/C;

    move-result-object v1

    if-ne v0, v1, :cond_9

    goto/16 :goto_0

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Unexpected cell state: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    :goto_2
    return v3
.end method

.method private static final synthetic g0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
    .locals 1

    sget-object v0, LKi/e;->e:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    return-object v0
.end method

.method private final g1(LKi/m;IJLjava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-virtual {p1, p2}, LKi/m;->B(I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {}, LKi/e;->k0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v1

    const-wide v3, 0xfffffffffffffffL

    and-long/2addr v1, v3

    cmp-long v1, p3, v1

    if-ltz v1, :cond_2

    if-nez p5, :cond_0

    invoke-static {}, LKi/f;->s()LNi/C;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1, p2, v0, p5}, LKi/m;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0}, LKi/e;->U()V

    invoke-static {}, LKi/f;->r()LNi/C;

    move-result-object p1

    return-object p1

    :cond_1
    sget-object v1, LKi/f;->d:LNi/C;

    if-ne v0, v1, :cond_2

    invoke-static {}, LKi/f;->f()LNi/C;

    move-result-object v1

    invoke-virtual {p1, p2, v0, v1}, LKi/m;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0}, LKi/e;->U()V

    invoke-virtual {p1, p2}, LKi/m;->D(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-direct/range {p0 .. p5}, LKi/e;->h1(LKi/m;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic h(LKi/e;LSi/e;Ljava/lang/Object;Ljava/lang/Object;)Lmh/q;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LKi/e;->M0(LKi/e;LSi/e;Ljava/lang/Object;Ljava/lang/Object;)Lmh/q;

    move-result-object p0

    return-object p0
.end method

.method private final h1(LKi/m;IJLjava/lang/Object;)Ljava/lang/Object;
    .locals 5

    :cond_0
    invoke-virtual {p1, p2}, LKi/m;->B(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-static {}, LKi/f;->k()LNi/C;

    move-result-object v1

    if-ne v0, v1, :cond_1

    goto/16 :goto_1

    :cond_1
    sget-object v1, LKi/f;->d:LNi/C;

    if-ne v0, v1, :cond_2

    invoke-static {}, LKi/f;->f()LNi/C;

    move-result-object v1

    invoke-virtual {p1, p2, v0, v1}, LKi/m;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, LKi/e;->U()V

    invoke-virtual {p1, p2}, LKi/m;->D(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-static {}, LKi/f;->j()LNi/C;

    move-result-object v1

    if-ne v0, v1, :cond_3

    invoke-static {}, LKi/f;->h()LNi/C;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-static {}, LKi/f;->o()LNi/C;

    move-result-object v1

    if-ne v0, v1, :cond_4

    invoke-static {}, LKi/f;->h()LNi/C;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {}, LKi/f;->z()LNi/C;

    move-result-object v1

    if-ne v0, v1, :cond_5

    invoke-direct {p0}, LKi/e;->U()V

    invoke-static {}, LKi/f;->h()LNi/C;

    move-result-object p1

    return-object p1

    :cond_5
    invoke-static {}, LKi/f;->p()LNi/C;

    move-result-object v1

    if-eq v0, v1, :cond_0

    invoke-static {}, LKi/f;->q()LNi/C;

    move-result-object v1

    invoke-virtual {p1, p2, v0, v1}, LKi/m;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    instance-of p3, v0, LKi/x;

    if-eqz p3, :cond_6

    check-cast v0, LKi/x;

    iget-object v0, v0, LKi/x;->a:LIi/a1;

    :cond_6
    invoke-direct {p0, v0, p1, p2}, LKi/e;->c1(Ljava/lang/Object;LKi/m;I)Z

    move-result p4

    if-eqz p4, :cond_7

    invoke-static {}, LKi/f;->f()LNi/C;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, LKi/m;->F(ILjava/lang/Object;)V

    invoke-direct {p0}, LKi/e;->U()V

    invoke-virtual {p1, p2}, LKi/m;->D(I)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_7
    invoke-static {}, LKi/f;->j()LNi/C;

    move-result-object p4

    invoke-virtual {p1, p2, p4}, LKi/m;->F(ILjava/lang/Object;)V

    const/4 p4, 0x0

    invoke-virtual {p1, p2, p4}, LKi/m;->C(IZ)V

    if-eqz p3, :cond_8

    invoke-direct {p0}, LKi/e;->U()V

    :cond_8
    invoke-static {}, LKi/f;->h()LNi/C;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_9
    :goto_1
    invoke-static {}, LKi/e;->k0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v1

    const-wide v3, 0xfffffffffffffffL

    and-long/2addr v1, v3

    cmp-long v1, p3, v1

    if-gez v1, :cond_a

    invoke-static {}, LKi/f;->o()LNi/C;

    move-result-object v1

    invoke-virtual {p1, p2, v0, v1}, LKi/m;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, LKi/e;->U()V

    invoke-static {}, LKi/f;->h()LNi/C;

    move-result-object p1

    return-object p1

    :cond_a
    if-nez p5, :cond_b

    invoke-static {}, LKi/f;->s()LNi/C;

    move-result-object p1

    return-object p1

    :cond_b
    invoke-virtual {p1, p2, v0, p5}, LKi/m;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, LKi/e;->U()V

    invoke-static {}, LKi/f;->r()LNi/C;

    move-result-object p1

    return-object p1
.end method

.method private final i1(LKi/m;ILjava/lang/Object;JLjava/lang/Object;Z)I
    .locals 3

    invoke-virtual {p1, p2, p3}, LKi/m;->G(ILjava/lang/Object;)V

    if-eqz p7, :cond_0

    invoke-direct/range {p0 .. p7}, LKi/e;->j1(LKi/m;ILjava/lang/Object;JLjava/lang/Object;Z)I

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p1, p2}, LKi/m;->B(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_3

    invoke-direct {p0, p4, p5}, LKi/e;->L(J)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    sget-object v0, LKi/f;->d:LNi/C;

    invoke-virtual {p1, p2, v2, v0}, LKi/m;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    return v1

    :cond_1
    if-nez p6, :cond_2

    const/4 p1, 0x3

    return p1

    :cond_2
    invoke-virtual {p1, p2, v2, p6}, LKi/m;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/4 p1, 0x2

    return p1

    :cond_3
    instance-of v2, v0, LIi/a1;

    if-eqz v2, :cond_6

    invoke-virtual {p1, p2}, LKi/m;->w(I)V

    invoke-direct {p0, v0, p3}, LKi/e;->b1(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-static {}, LKi/f;->f()LNi/C;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, LKi/m;->F(ILjava/lang/Object;)V

    invoke-virtual {p0}, LKi/e;->K0()V

    const/4 p1, 0x0

    goto :goto_0

    :cond_4
    invoke-static {}, LKi/f;->i()LNi/C;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, LKi/m;->x(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    invoke-static {}, LKi/f;->i()LNi/C;

    move-result-object p4

    if-eq p3, p4, :cond_5

    invoke-virtual {p1, p2, v1}, LKi/m;->C(IZ)V

    :cond_5
    const/4 p1, 0x5

    :goto_0
    return p1

    :cond_6
    invoke-direct/range {p0 .. p7}, LKi/e;->j1(LKi/m;ILjava/lang/Object;JLjava/lang/Object;Z)I

    move-result p1

    return p1
.end method

.method public static synthetic j(Lmh/l;Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/Object;Ldh/i;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LKi/e;->J(Lmh/l;Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/Object;Ldh/i;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final synthetic j0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .locals 1

    sget-object v0, LKi/e;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method

.method private final j1(LKi/m;ILjava/lang/Object;JLjava/lang/Object;Z)I
    .locals 5

    :cond_0
    invoke-virtual {p1, p2}, LKi/m;->B(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x4

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v0, :cond_4

    invoke-direct {p0, p4, p5}, LKi/e;->L(J)Z

    move-result v0

    const/4 v4, 0x0

    if-eqz v0, :cond_1

    if-nez p7, :cond_1

    sget-object v0, LKi/f;->d:LNi/C;

    invoke-virtual {p1, p2, v4, v0}, LKi/m;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v3

    :cond_1
    if-eqz p7, :cond_2

    invoke-static {}, LKi/f;->j()LNi/C;

    move-result-object v0

    invoke-virtual {p1, p2, v4, v0}, LKi/m;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, p2, v2}, LKi/m;->C(IZ)V

    return v1

    :cond_2
    if-nez p6, :cond_3

    const/4 p1, 0x3

    return p1

    :cond_3
    invoke-virtual {p1, p2, v4, p6}, LKi/m;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x2

    return p1

    :cond_4
    invoke-static {}, LKi/f;->k()LNi/C;

    move-result-object v4

    if-ne v0, v4, :cond_5

    sget-object v1, LKi/f;->d:LNi/C;

    invoke-virtual {p1, p2, v0, v1}, LKi/m;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v3

    :cond_5
    invoke-static {}, LKi/f;->i()LNi/C;

    move-result-object p4

    const/4 p5, 0x5

    if-ne v0, p4, :cond_6

    invoke-virtual {p1, p2}, LKi/m;->w(I)V

    return p5

    :cond_6
    invoke-static {}, LKi/f;->o()LNi/C;

    move-result-object p4

    if-ne v0, p4, :cond_7

    invoke-virtual {p1, p2}, LKi/m;->w(I)V

    return p5

    :cond_7
    invoke-static {}, LKi/f;->z()LNi/C;

    move-result-object p4

    if-ne v0, p4, :cond_8

    invoke-virtual {p1, p2}, LKi/m;->w(I)V

    invoke-direct {p0}, LKi/e;->S()V

    return v1

    :cond_8
    invoke-virtual {p1, p2}, LKi/m;->w(I)V

    instance-of p4, v0, LKi/x;

    if-eqz p4, :cond_9

    check-cast v0, LKi/x;

    iget-object v0, v0, LKi/x;->a:LIi/a1;

    :cond_9
    invoke-direct {p0, v0, p3}, LKi/e;->b1(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_a

    invoke-static {}, LKi/f;->f()LNi/C;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, LKi/m;->F(ILjava/lang/Object;)V

    invoke-virtual {p0}, LKi/e;->K0()V

    goto :goto_0

    :cond_a
    invoke-static {}, LKi/f;->i()LNi/C;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, LKi/m;->x(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    invoke-static {}, LKi/f;->i()LNi/C;

    move-result-object p4

    if-eq p3, p4, :cond_b

    invoke-virtual {p1, p2, v3}, LKi/m;->C(IZ)V

    :cond_b
    move v2, p5

    :goto_0
    return v2
.end method

.method private static final synthetic k0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
    .locals 1

    sget-object v0, LKi/e;->d:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    return-object v0
.end method

.method private final k1(J)V
    .locals 7

    invoke-static {}, LKi/e;->g0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    :cond_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v3

    cmp-long v1, v3, p1

    if-ltz v1, :cond_1

    return-void

    :cond_1
    invoke-static {}, LKi/e;->g0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    move-object v2, p0

    move-wide v5, p1

    invoke-virtual/range {v1 .. v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void
.end method

.method private final l1(J)V
    .locals 7

    invoke-static {}, LKi/e;->k0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    :cond_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v3

    const-wide v1, 0xfffffffffffffffL

    and-long/2addr v1, v3

    cmp-long v5, v1, p1

    if-ltz v5, :cond_1

    return-void

    :cond_1
    const/16 v5, 0x3c

    shr-long v5, v3, v5

    long-to-int v5, v5

    invoke-static {v1, v2, v5}, LKi/f;->b(JI)J

    move-result-wide v5

    invoke-static {}, LKi/e;->k0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    move-object v2, p0

    invoke-virtual/range {v1 .. v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void
.end method

.method public static final synthetic m(LKi/e;Lmh/l;Ljava/lang/Object;)Lmh/q;
    .locals 0

    invoke-direct {p0, p1, p2}, LKi/e;->H(Lmh/l;Ljava/lang/Object;)Lmh/q;

    move-result-object p0

    return-object p0
.end method

.method private static final synthetic m0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .locals 1

    sget-object v0, LKi/e;->k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method

.method public static final synthetic n(LKi/e;Lmh/l;)Lth/g;
    .locals 0

    invoke-direct {p0, p1}, LKi/e;->I(Lmh/l;)Lth/g;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic o(LKi/e;Lmh/l;)Lth/g;
    .locals 0

    invoke-direct {p0, p1}, LKi/e;->K(Lmh/l;)Lth/g;

    move-result-object p0

    return-object p0
.end method

.method private final o0(J)V
    .locals 4

    invoke-static {}, LKi/e;->d0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    move-result-wide p1

    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    and-long/2addr p1, v0

    const-wide/16 v2, 0x0

    cmp-long p1, p1, v2

    if-eqz p1, :cond_0

    :goto_0
    invoke-static {}, LKi/e;->d0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide p1

    and-long/2addr p1, v0

    cmp-long p1, p1, v2

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static final synthetic p(LKi/e;JLKi/m;)LKi/m;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LKi/e;->W(JLKi/m;)LKi/m;

    move-result-object p0

    return-object p0
.end method

.method static synthetic p0(LKi/e;JILjava/lang/Object;)V
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const-wide/16 p1, 0x1

    :cond_0
    invoke-direct {p0, p1, p2}, LKi/e;->o0(J)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final synthetic q(LKi/e;JLKi/m;)LKi/m;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LKi/e;->X(JLKi/m;)LKi/m;

    move-result-object p0

    return-object p0
.end method

.method private final q0()V
    .locals 3

    invoke-static {}, LKi/e;->c0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    :cond_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-static {}, LKi/f;->d()LNi/C;

    move-result-object v2

    goto :goto_0

    :cond_1
    invoke-static {}, LKi/f;->e()LNi/C;

    move-result-object v2

    :goto_0
    invoke-static {v0, p0, v1, v2}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    if-nez v1, :cond_2

    return-void

    :cond_2
    const/4 v0, 0x1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/V;->f(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmh/l;

    check-cast v1, Lmh/l;

    invoke-virtual {p0}, LKi/e;->b0()Ljava/lang/Throwable;

    move-result-object v0

    invoke-interface {v1, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic r(LKi/e;)Ljava/lang/Throwable;
    .locals 0

    invoke-direct {p0}, LKi/e;->e0()Ljava/lang/Throwable;

    move-result-object p0

    return-object p0
.end method

.method private final r0(LKi/m;IJ)Z
    .locals 4

    :cond_0
    invoke-virtual {p1, p2}, LKi/m;->B(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_a

    invoke-static {}, LKi/f;->k()LNi/C;

    move-result-object v2

    if-ne v0, v2, :cond_1

    goto :goto_0

    :cond_1
    sget-object p1, LKi/f;->d:LNi/C;

    const/4 p2, 0x1

    if-ne v0, p1, :cond_2

    return p2

    :cond_2
    invoke-static {}, LKi/f;->j()LNi/C;

    move-result-object p1

    if-ne v0, p1, :cond_3

    return v1

    :cond_3
    invoke-static {}, LKi/f;->z()LNi/C;

    move-result-object p1

    if-ne v0, p1, :cond_4

    return v1

    :cond_4
    invoke-static {}, LKi/f;->f()LNi/C;

    move-result-object p1

    if-ne v0, p1, :cond_5

    return v1

    :cond_5
    invoke-static {}, LKi/f;->o()LNi/C;

    move-result-object p1

    if-ne v0, p1, :cond_6

    return v1

    :cond_6
    invoke-static {}, LKi/f;->p()LNi/C;

    move-result-object p1

    if-ne v0, p1, :cond_7

    return p2

    :cond_7
    invoke-static {}, LKi/f;->q()LNi/C;

    move-result-object p1

    if-ne v0, p1, :cond_8

    return v1

    :cond_8
    invoke-virtual {p0}, LKi/e;->h0()J

    move-result-wide v2

    cmp-long p1, p3, v2

    if-nez p1, :cond_9

    move v1, p2

    :cond_9
    return v1

    :cond_a
    :goto_0
    invoke-static {}, LKi/f;->o()LNi/C;

    move-result-object v2

    invoke-virtual {p1, p2, v0, v2}, LKi/m;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, LKi/e;->U()V

    return v1
.end method

.method public static final synthetic s()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .locals 1

    invoke-static {}, LKi/e;->f0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    return-object v0
.end method

.method private final s0(JZ)Z
    .locals 6

    const/16 v0, 0x3c

    shr-long v0, p1, v0

    long-to-int v0, v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    const/4 v2, 0x1

    if-eq v0, v2, :cond_3

    const/4 v3, 0x2

    const-wide v4, 0xfffffffffffffffL

    if-eq v0, v3, :cond_2

    const/4 p3, 0x3

    if-ne v0, p3, :cond_1

    and-long/2addr p1, v4

    invoke-direct {p0, p1, p2}, LKi/e;->Q(J)V

    :cond_0
    :goto_0
    move v1, v2

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "unexpected close status: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    and-long/2addr p1, v4

    invoke-direct {p0, p1, p2}, LKi/e;->R(J)LKi/m;

    if-eqz p3, :cond_0

    invoke-virtual {p0}, LKi/e;->n0()Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    :goto_1
    return v1
.end method

.method public static final synthetic t()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
    .locals 1

    invoke-static {}, LKi/e;->g0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic u()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .locals 1

    invoke-static {}, LKi/e;->j0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    return-object v0
.end method

.method private final u0(J)Z
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, LKi/e;->s0(JZ)Z

    move-result p1

    return p1
.end method

.method public static final synthetic v()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
    .locals 1

    invoke-static {}, LKi/e;->k0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    return-object v0
.end method

.method private final v0(J)Z
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, LKi/e;->s0(JZ)Z

    move-result p1

    return p1
.end method

.method public static final synthetic w(LKi/e;J)Z
    .locals 0

    invoke-direct {p0, p1, p2}, LKi/e;->v0(J)Z

    move-result p0

    return p0
.end method

.method public static final synthetic x(LKi/e;Ljava/lang/Throwable;Ljava/lang/Object;Ldh/i;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LKi/e;->D0(Ljava/lang/Throwable;Ljava/lang/Object;Ldh/i;)V

    return-void
.end method

.method private final x0()Z
    .locals 4

    invoke-direct {p0}, LKi/e;->Z()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-eqz v2, :cond_1

    const-wide v2, 0x7fffffffffffffffL

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

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

.method public static final synthetic y(LKi/e;Ljava/lang/Throwable;Ljava/lang/Object;Ldh/i;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LKi/e;->E0(Ljava/lang/Throwable;Ljava/lang/Object;Ldh/i;)V

    return-void
.end method

.method private final y0(LKi/m;)J
    .locals 7

    :cond_0
    sget v0, LKi/f;->b:I

    add-int/lit8 v0, v0, -0x1

    :goto_0
    const-wide/16 v1, -0x1

    const/4 v3, -0x1

    if-ge v3, v0, :cond_5

    iget-wide v3, p1, LNi/z;->c:J

    sget v5, LKi/f;->b:I

    int-to-long v5, v5

    mul-long/2addr v3, v5

    int-to-long v5, v0

    add-long/2addr v3, v5

    invoke-virtual {p0}, LKi/e;->h0()J

    move-result-wide v5

    cmp-long v5, v3, v5

    if-gez v5, :cond_1

    return-wide v1

    :cond_1
    invoke-virtual {p1, v0}, LKi/m;->B(I)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-static {}, LKi/f;->k()LNi/C;

    move-result-object v2

    if-ne v1, v2, :cond_2

    goto :goto_1

    :cond_2
    sget-object v2, LKi/f;->d:LNi/C;

    if-ne v1, v2, :cond_4

    return-wide v3

    :cond_3
    :goto_1
    invoke-static {}, LKi/f;->z()LNi/C;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, LKi/m;->v(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, LNi/z;->t()V

    :cond_4
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_5
    invoke-virtual {p1}, LNi/b;->h()LNi/b;

    move-result-object p1

    check-cast p1, LKi/m;

    if-nez p1, :cond_0

    return-wide v1
.end method

.method public static final synthetic z(LKi/e;LIi/n;)V
    .locals 0

    invoke-direct {p0, p1}, LKi/e;->G0(LIi/n;)V

    return-void
.end method

.method private final z0()V
    .locals 7

    invoke-static {}, LKi/e;->k0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v6

    :cond_0
    invoke-virtual {v6, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v2

    const/16 v0, 0x3c

    shr-long v0, v2, v0

    long-to-int v0, v0

    if-nez v0, :cond_1

    const-wide v0, 0xfffffffffffffffL

    and-long/2addr v0, v2

    const/4 v4, 0x1

    invoke-static {v0, v1, v4}, LKi/f;->b(JI)J

    move-result-wide v4

    move-object v0, v6

    move-object v1, p0

    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_1
    return-void
.end method


# virtual methods
.method protected F0()V
    .locals 0

    return-void
.end method

.method protected K0()V
    .locals 0

    return-void
.end method

.method protected L0()V
    .locals 0

    return-void
.end method

.method public M(Ljava/lang/Throwable;)Z
    .locals 1

    if-nez p1, :cond_0

    new-instance p1, Ljava/util/concurrent/CancellationException;

    const-string v0, "Channel was cancelled"

    invoke-direct {p1, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, LKi/e;->P(Ljava/lang/Throwable;Z)Z

    move-result p1

    return p1
.end method

.method protected P(Ljava/lang/Throwable;Z)Z
    .locals 2

    if-eqz p2, :cond_0

    invoke-direct {p0}, LKi/e;->z0()V

    :cond_0
    invoke-static {}, LKi/e;->m0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-static {}, LKi/f;->l()LNi/C;

    move-result-object v1

    invoke-static {v0, p0, v1, p1}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p2, :cond_1

    invoke-direct {p0}, LKi/e;->A0()V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, LKi/e;->B0()V

    :goto_0
    invoke-direct {p0}, LKi/e;->S()V

    invoke-virtual {p0}, LKi/e;->F0()V

    if-eqz p1, :cond_2

    invoke-direct {p0}, LKi/e;->q0()V

    :cond_2
    return p1
.end method

.method protected final T(J)V
    .locals 10

    invoke-static {}, LKi/e;->f0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LKi/m;

    :cond_0
    :goto_0
    invoke-static {}, LKi/e;->g0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v8

    iget v1, p0, LKi/e;->a:I

    int-to-long v1, v1

    add-long/2addr v1, v8

    invoke-direct {p0}, LKi/e;->Z()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    cmp-long v1, p1, v1

    if-gez v1, :cond_1

    return-void

    :cond_1
    invoke-static {}, LKi/e;->g0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v2

    const-wide/16 v3, 0x1

    add-long v6, v8, v3

    move-object v3, p0

    move-wide v4, v8

    invoke-virtual/range {v2 .. v7}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v1

    if-eqz v1, :cond_0

    sget v1, LKi/f;->b:I

    int-to-long v2, v1

    div-long v2, v8, v2

    int-to-long v4, v1

    rem-long v4, v8, v4

    long-to-int v4, v4

    iget-wide v5, v0, LNi/z;->c:J

    cmp-long v1, v5, v2

    if-eqz v1, :cond_3

    invoke-direct {p0, v2, v3, v0}, LKi/e;->W(JLKi/m;)LKi/m;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    move-object v0, v1

    :cond_3
    const/4 v7, 0x0

    move-object v2, p0

    move-object v3, v0

    move-wide v5, v8

    invoke-direct/range {v2 .. v7}, LKi/e;->g1(LKi/m;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, LKi/f;->h()LNi/C;

    move-result-object v2

    if-ne v1, v2, :cond_4

    invoke-virtual {p0}, LKi/e;->l0()J

    move-result-wide v1

    cmp-long v1, v8, v1

    if-gez v1, :cond_0

    invoke-virtual {v0}, LNi/b;->c()V

    goto :goto_0

    :cond_4
    invoke-virtual {v0}, LNi/b;->c()V

    iget-object v2, p0, LKi/e;->b:Lmh/l;

    if-eqz v2, :cond_0

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v2, v1, v4, v3, v4}, LNi/v;->c(Lmh/l;Ljava/lang/Object;Lkotlinx/coroutines/internal/UndeliveredElementException;ILjava/lang/Object;)Lkotlinx/coroutines/internal/UndeliveredElementException;

    move-result-object v1

    if-nez v1, :cond_5

    goto :goto_0

    :cond_5
    throw v1
.end method

.method public b(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, LKi/e;->Y0(LKi/e;Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected final b0()Ljava/lang/Throwable;
    .locals 1

    invoke-static {}, LKi/e;->m0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    return-object v0
.end method

.method public c(Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, LKi/e;->Q0(LKi/e;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final cancel(Ljava/util/concurrent/CancellationException;)V
    .locals 0

    invoke-virtual {p0, p1}, LKi/e;->M(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public d()Ljava/lang/Object;
    .locals 11

    invoke-static {}, LKi/e;->g0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    invoke-static {}, LKi/e;->k0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v2

    invoke-direct {p0, v2, v3}, LKi/e;->u0(J)Z

    move-result v4

    if-eqz v4, :cond_0

    sget-object v0, LKi/k;->b:LKi/k$b;

    invoke-virtual {p0}, LKi/e;->b0()Ljava/lang/Throwable;

    move-result-object v1

    invoke-virtual {v0, v1}, LKi/k$b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    const-wide v4, 0xfffffffffffffffL

    and-long/2addr v2, v4

    cmp-long v0, v0, v2

    if-ltz v0, :cond_1

    sget-object v0, LKi/k;->b:LKi/k$b;

    invoke-virtual {v0}, LKi/k$b;->b()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-static {}, LKi/f;->i()LNi/C;

    move-result-object v0

    invoke-static {}, LKi/e;->s()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LKi/m;

    :goto_0
    invoke-virtual {p0}, LKi/e;->t0()Z

    move-result v2

    if-eqz v2, :cond_2

    sget-object v0, LKi/k;->b:LKi/k$b;

    invoke-virtual {p0}, LKi/e;->b0()Ljava/lang/Throwable;

    move-result-object v1

    invoke-virtual {v0, v1}, LKi/k$b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    goto/16 :goto_3

    :cond_2
    invoke-static {}, LKi/e;->t()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v7

    sget v2, LKi/f;->b:I

    int-to-long v3, v2

    div-long v3, v7, v3

    int-to-long v5, v2

    rem-long v5, v7, v5

    long-to-int v9, v5

    iget-wide v5, v1, LNi/z;->c:J

    cmp-long v2, v5, v3

    if-eqz v2, :cond_4

    invoke-static {p0, v3, v4, v1}, LKi/e;->p(LKi/e;JLKi/m;)LKi/m;

    move-result-object v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_3
    move-object v10, v2

    goto :goto_1

    :cond_4
    move-object v10, v1

    :goto_1
    move-object v1, p0

    move-object v2, v10

    move v3, v9

    move-wide v4, v7

    move-object v6, v0

    invoke-static/range {v1 .. v6}, LKi/e;->F(LKi/e;LKi/m;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, LKi/f;->r()LNi/C;

    move-result-object v2

    if-ne v1, v2, :cond_7

    instance-of v1, v0, LIi/a1;

    if-eqz v1, :cond_5

    check-cast v0, LIi/a1;

    goto :goto_2

    :cond_5
    const/4 v0, 0x0

    :goto_2
    if-eqz v0, :cond_6

    invoke-static {p0, v0, v10, v9}, LKi/e;->C(LKi/e;LIi/a1;LKi/m;I)V

    :cond_6
    invoke-virtual {p0, v7, v8}, LKi/e;->m1(J)V

    invoke-virtual {v10}, LNi/z;->t()V

    sget-object v0, LKi/k;->b:LKi/k$b;

    invoke-virtual {v0}, LKi/k$b;->b()Ljava/lang/Object;

    move-result-object v0

    goto :goto_3

    :cond_7
    invoke-static {}, LKi/f;->h()LNi/C;

    move-result-object v2

    if-ne v1, v2, :cond_9

    invoke-virtual {p0}, LKi/e;->l0()J

    move-result-wide v1

    cmp-long v1, v7, v1

    if-gez v1, :cond_8

    invoke-virtual {v10}, LNi/b;->c()V

    :cond_8
    move-object v1, v10

    goto :goto_0

    :cond_9
    invoke-static {}, LKi/f;->s()LNi/C;

    move-result-object v0

    if-eq v1, v0, :cond_a

    invoke-virtual {v10}, LNi/b;->c()V

    sget-object v0, LKi/k;->b:LKi/k$b;

    invoke-virtual {v0, v1}, LKi/k$b;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_3
    return-object v0

    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "unexpected"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected final d1(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v8, p0

    sget-object v9, LKi/f;->d:LNi/C;

    invoke-static {}, LKi/e;->u()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LKi/m;

    :cond_0
    :goto_0
    invoke-static {}, LKi/e;->v()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v1

    const-wide v3, 0xfffffffffffffffL

    and-long v10, v1, v3

    invoke-static {v8, v1, v2}, LKi/e;->w(LKi/e;J)Z

    move-result v12

    sget v13, LKi/f;->b:I

    int-to-long v1, v13

    div-long v1, v10, v1

    int-to-long v3, v13

    rem-long v3, v10, v3

    long-to-int v14, v3

    iget-wide v3, v0, LNi/z;->c:J

    cmp-long v3, v3, v1

    if-eqz v3, :cond_2

    invoke-static {v8, v1, v2, v0}, LKi/e;->q(LKi/e;JLKi/m;)LKi/m;

    move-result-object v1

    if-nez v1, :cond_1

    if-eqz v12, :cond_0

    sget-object v0, LKi/k;->b:LKi/k$b;

    invoke-virtual/range {p0 .. p0}, LKi/e;->i0()Ljava/lang/Throwable;

    move-result-object v1

    invoke-virtual {v0, v1}, LKi/k$b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1
    move-object v15, v1

    goto :goto_1

    :cond_2
    move-object v15, v0

    :goto_1
    move-object/from16 v0, p0

    move-object v1, v15

    move v2, v14

    move-object/from16 v3, p1

    move-wide v4, v10

    move-object v6, v9

    move v7, v12

    invoke-static/range {v0 .. v7}, LKi/e;->G(LKi/e;LKi/m;ILjava/lang/Object;JLjava/lang/Object;Z)I

    move-result v0

    if-eqz v0, :cond_c

    const/4 v1, 0x1

    if-eq v0, v1, :cond_b

    const/4 v1, 0x2

    if-eq v0, v1, :cond_7

    const/4 v1, 0x3

    if-eq v0, v1, :cond_6

    const/4 v1, 0x4

    if-eq v0, v1, :cond_4

    const/4 v1, 0x5

    if-eq v0, v1, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v15}, LNi/b;->c()V

    :goto_2
    move-object v0, v15

    goto :goto_0

    :cond_4
    invoke-virtual/range {p0 .. p0}, LKi/e;->h0()J

    move-result-wide v0

    cmp-long v0, v10, v0

    if-gez v0, :cond_5

    invoke-virtual {v15}, LNi/b;->c()V

    :cond_5
    sget-object v0, LKi/k;->b:LKi/k$b;

    invoke-virtual/range {p0 .. p0}, LKi/e;->i0()Ljava/lang/Throwable;

    move-result-object v1

    invoke-virtual {v0, v1}, LKi/k$b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "unexpected"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    if-eqz v12, :cond_8

    invoke-virtual {v15}, LNi/z;->t()V

    sget-object v0, LKi/k;->b:LKi/k$b;

    invoke-virtual/range {p0 .. p0}, LKi/e;->i0()Ljava/lang/Throwable;

    move-result-object v1

    invoke-virtual {v0, v1}, LKi/k$b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_8
    instance-of v0, v9, LIi/a1;

    if-eqz v0, :cond_9

    check-cast v9, LIi/a1;

    goto :goto_3

    :cond_9
    const/4 v9, 0x0

    :goto_3
    if-eqz v9, :cond_a

    invoke-static {v8, v9, v15, v14}, LKi/e;->D(LKi/e;LIi/a1;LKi/m;I)V

    :cond_a
    iget-wide v0, v15, LNi/z;->c:J

    int-to-long v2, v13

    mul-long/2addr v0, v2

    int-to-long v2, v14

    add-long/2addr v0, v2

    invoke-virtual {v8, v0, v1}, LKi/e;->T(J)V

    sget-object v0, LKi/k;->b:LKi/k$b;

    sget-object v1, LYg/J;->a:LYg/J;

    invoke-virtual {v0, v1}, LKi/k$b;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_b
    sget-object v0, LKi/k;->b:LKi/k$b;

    sget-object v1, LYg/J;->a:LYg/J;

    invoke-virtual {v0, v1}, LKi/k$b;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_c
    invoke-virtual {v15}, LNi/b;->c()V

    sget-object v0, LKi/k;->b:LKi/k$b;

    sget-object v1, LYg/J;->a:LYg/J;

    invoke-virtual {v0, v1}, LKi/k$b;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public e(Lmh/l;)V
    .locals 4

    invoke-static {}, LKi/e;->c0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, p0, v1, p1}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, LKi/e;->c0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    :cond_1
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, LKi/f;->d()LNi/C;

    move-result-object v2

    if-ne v1, v2, :cond_2

    invoke-static {}, LKi/e;->c0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-static {}, LKi/f;->d()LNi/C;

    move-result-object v2

    invoke-static {}, LKi/f;->e()LNi/C;

    move-result-object v3

    invoke-static {v1, p0, v2, v3}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, LKi/e;->b0()Ljava/lang/Throwable;

    move-result-object v0

    invoke-interface {p1, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_2
    invoke-static {}, LKi/f;->e()LNi/C;

    move-result-object p1

    if-ne v1, p1, :cond_3

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Another handler was already registered and successfully invoked"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Another handler is already registered: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public f(Ljava/lang/Throwable;)Z
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LKi/e;->P(Ljava/lang/Throwable;Z)Z

    move-result p1

    return p1
.end method

.method public final h0()J
    .locals 2

    invoke-static {}, LKi/e;->g0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    return-wide v0
.end method

.method public i(Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, LKi/e;->R0(LKi/e;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected final i0()Ljava/lang/Throwable;
    .locals 2

    invoke-virtual {p0}, LKi/e;->b0()Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lkotlinx/coroutines/channels/ClosedSendChannelException;

    const-string v1, "Channel was closed"

    invoke-direct {v0, v1}, Lkotlinx/coroutines/channels/ClosedSendChannelException;-><init>(Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method

.method public iterator()LKi/i;
    .locals 1

    new-instance v0, LKi/e$a;

    invoke-direct {v0, p0}, LKi/e$a;-><init>(LKi/e;)V

    return-object v0
.end method

.method public k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    invoke-static {}, LKi/e;->k0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, LKi/e;->a1(J)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, LKi/k;->b:LKi/k$b;

    invoke-virtual {p1}, LKi/k$b;->b()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, LKi/f;->j()LNi/C;

    move-result-object v8

    invoke-static {}, LKi/e;->u()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LKi/m;

    :cond_1
    :goto_0
    invoke-static {}, LKi/e;->v()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v1

    const-wide v3, 0xfffffffffffffffL

    and-long v9, v1, v3

    invoke-static {p0, v1, v2}, LKi/e;->w(LKi/e;J)Z

    move-result v11

    sget v1, LKi/f;->b:I

    int-to-long v2, v1

    div-long v2, v9, v2

    int-to-long v4, v1

    rem-long v4, v9, v4

    long-to-int v12, v4

    iget-wide v4, v0, LNi/z;->c:J

    cmp-long v1, v4, v2

    if-eqz v1, :cond_4

    invoke-static {p0, v2, v3, v0}, LKi/e;->q(LKi/e;JLKi/m;)LKi/m;

    move-result-object v1

    if-nez v1, :cond_3

    if-eqz v11, :cond_1

    :cond_2
    :goto_1
    sget-object p1, LKi/k;->b:LKi/k$b;

    invoke-virtual {p0}, LKi/e;->i0()Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p1, v0}, LKi/k$b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_6

    :cond_3
    move-object v13, v1

    goto :goto_2

    :cond_4
    move-object v13, v0

    :goto_2
    move-object v0, p0

    move-object v1, v13

    move v2, v12

    move-object v3, p1

    move-wide v4, v9

    move-object v6, v8

    move v7, v11

    invoke-static/range {v0 .. v7}, LKi/e;->G(LKi/e;LKi/m;ILjava/lang/Object;JLjava/lang/Object;Z)I

    move-result v0

    if-eqz v0, :cond_d

    const/4 v1, 0x1

    if-eq v0, v1, :cond_c

    const/4 v1, 0x2

    if-eq v0, v1, :cond_8

    const/4 v1, 0x3

    if-eq v0, v1, :cond_7

    const/4 v1, 0x4

    if-eq v0, v1, :cond_6

    const/4 v1, 0x5

    if-eq v0, v1, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual {v13}, LNi/b;->c()V

    :goto_3
    move-object v0, v13

    goto :goto_0

    :cond_6
    invoke-virtual {p0}, LKi/e;->h0()J

    move-result-wide v0

    cmp-long p1, v9, v0

    if-gez p1, :cond_2

    invoke-virtual {v13}, LNi/b;->c()V

    goto :goto_1

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "unexpected"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    if-eqz v11, :cond_9

    invoke-virtual {v13}, LNi/z;->t()V

    goto :goto_1

    :cond_9
    instance-of p1, v8, LIi/a1;

    if-eqz p1, :cond_a

    check-cast v8, LIi/a1;

    goto :goto_4

    :cond_a
    const/4 v8, 0x0

    :goto_4
    if-eqz v8, :cond_b

    invoke-static {p0, v8, v13, v12}, LKi/e;->D(LKi/e;LIi/a1;LKi/m;I)V

    :cond_b
    invoke-virtual {v13}, LNi/z;->t()V

    sget-object p1, LKi/k;->b:LKi/k$b;

    invoke-virtual {p1}, LKi/k$b;->b()Ljava/lang/Object;

    move-result-object p1

    goto :goto_6

    :cond_c
    :goto_5
    sget-object p1, LKi/k;->b:LKi/k$b;

    sget-object v0, LYg/J;->a:LYg/J;

    invoke-virtual {p1, v0}, LKi/k$b;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_6

    :cond_d
    invoke-virtual {v13}, LNi/b;->c()V

    goto :goto_5

    :goto_6
    return-object p1
.end method

.method public l()Z
    .locals 2

    invoke-static {}, LKi/e;->k0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, LKi/e;->v0(J)Z

    move-result v0

    return v0
.end method

.method public final l0()J
    .locals 4

    invoke-static {}, LKi/e;->k0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    const-wide v2, 0xfffffffffffffffL

    and-long/2addr v0, v2

    return-wide v0
.end method

.method public final m1(J)V
    .locals 16

    move-object/from16 v6, p0

    invoke-direct/range {p0 .. p0}, LKi/e;->x0()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-direct/range {p0 .. p0}, LKi/e;->Z()J

    move-result-wide v0

    cmp-long v0, v0, p1

    if-lez v0, :cond_0

    invoke-static {}, LKi/f;->g()I

    move-result v0

    const/4 v7, 0x0

    move v1, v7

    :goto_0
    const-wide v8, 0x3fffffffffffffffL    # 1.9999999999999998

    if-ge v1, v0, :cond_2

    invoke-direct/range {p0 .. p0}, LKi/e;->Z()J

    move-result-wide v2

    invoke-static {}, LKi/e;->d0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v4

    invoke-virtual {v4, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v4

    and-long/2addr v4, v8

    cmp-long v4, v2, v4

    if-nez v4, :cond_1

    invoke-direct/range {p0 .. p0}, LKi/e;->Z()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-nez v2, :cond_1

    return-void

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    invoke-static {}, LKi/e;->d0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v10

    :cond_3
    invoke-virtual {v10, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v2

    and-long v0, v2, v8

    const/4 v11, 0x1

    invoke-static {v0, v1, v11}, LKi/f;->a(JZ)J

    move-result-wide v4

    move-object v0, v10

    move-object/from16 v1, p0

    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_4
    :goto_1
    invoke-direct/range {p0 .. p0}, LKi/e;->Z()J

    move-result-wide v0

    invoke-static {}, LKi/e;->d0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v2

    and-long v4, v2, v8

    const-wide/high16 v12, 0x4000000000000000L    # 2.0

    and-long/2addr v12, v2

    const-wide/16 v14, 0x0

    cmp-long v10, v12, v14

    if-eqz v10, :cond_5

    move v10, v11

    goto :goto_2

    :cond_5
    move v10, v7

    :goto_2
    cmp-long v12, v0, v4

    if-nez v12, :cond_7

    invoke-direct/range {p0 .. p0}, LKi/e;->Z()J

    move-result-wide v12

    cmp-long v0, v0, v12

    if-nez v0, :cond_7

    invoke-static {}, LKi/e;->d0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v12

    :cond_6
    invoke-virtual {v12, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v2

    and-long v0, v2, v8

    invoke-static {v0, v1, v7}, LKi/f;->a(JZ)J

    move-result-wide v4

    move-object v0, v12

    move-object/from16 v1, p0

    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v0

    if-eqz v0, :cond_6

    return-void

    :cond_7
    if-nez v10, :cond_4

    invoke-static {}, LKi/e;->d0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    invoke-static {v4, v5, v11}, LKi/f;->a(JZ)J

    move-result-wide v4

    move-object/from16 v1, p0

    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    goto :goto_1
.end method

.method public final n0()Z
    .locals 9

    :cond_0
    :goto_0
    invoke-static {}, LKi/e;->f0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LKi/m;

    invoke-virtual {p0}, LKi/e;->h0()J

    move-result-wide v3

    invoke-virtual {p0}, LKi/e;->l0()J

    move-result-wide v1

    cmp-long v1, v1, v3

    const/4 v2, 0x0

    if-gtz v1, :cond_1

    return v2

    :cond_1
    sget v1, LKi/f;->b:I

    int-to-long v5, v1

    div-long v5, v3, v5

    iget-wide v7, v0, LNi/z;->c:J

    cmp-long v7, v7, v5

    if-eqz v7, :cond_2

    invoke-direct {p0, v5, v6, v0}, LKi/e;->W(JLKi/m;)LKi/m;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-static {}, LKi/e;->f0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LKi/m;

    iget-wide v0, v0, LNi/z;->c:J

    cmp-long v0, v0, v5

    if-gez v0, :cond_0

    return v2

    :cond_2
    invoke-virtual {v0}, LNi/b;->c()V

    int-to-long v1, v1

    rem-long v1, v3, v1

    long-to-int v1, v1

    invoke-direct {p0, v0, v1, v3, v4}, LKi/e;->r0(LKi/m;IJ)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    return v0

    :cond_3
    invoke-static {}, LKi/e;->g0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    const-wide/16 v5, 0x1

    add-long/2addr v5, v3

    move-object v2, p0

    invoke-virtual/range {v1 .. v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    goto :goto_0
.end method

.method public t0()Z
    .locals 2

    invoke-static {}, LKi/e;->k0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, LKi/e;->u0(J)Z

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 16

    move-object/from16 v0, p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, LKi/e;->k0()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v2

    const/16 v4, 0x3c

    shr-long/2addr v2, v4

    long-to-int v2, v2

    const/4 v3, 0x3

    const/4 v4, 0x2

    if-eq v2, v4, :cond_1

    if-eq v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const-string v2, "cancelled,"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    const-string v2, "closed,"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "capacity="

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v5, v0, LKi/e;->a:I

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v5, 0x2c

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "data=["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-array v2, v3, [LKi/m;

    invoke-static {}, LKi/e;->f0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/4 v6, 0x0

    aput-object v3, v2, v6

    invoke-static {}, LKi/e;->j0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/4 v7, 0x1

    aput-object v3, v2, v7

    invoke-static {}, LKi/e;->a0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-static {v2}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v8, v4

    check-cast v8, LKi/m;

    invoke-static {}, LKi/f;->n()LKi/m;

    move-result-object v9

    if-eq v8, v9, :cond_2

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_16

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_2

    :cond_4
    move-object v4, v3

    check-cast v4, LKi/m;

    iget-wide v8, v4, LNi/z;->c:J

    :cond_5
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v10, v4

    check-cast v10, LKi/m;

    iget-wide v10, v10, LNi/z;->c:J

    cmp-long v12, v8, v10

    if-lez v12, :cond_6

    move-object v3, v4

    move-wide v8, v10

    :cond_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_5

    :goto_2
    check-cast v3, LKi/m;

    invoke-virtual/range {p0 .. p0}, LKi/e;->h0()J

    move-result-wide v10

    invoke-virtual/range {p0 .. p0}, LKi/e;->l0()J

    move-result-wide v12

    :goto_3
    sget v2, LKi/f;->b:I

    move v4, v6

    :goto_4
    if-ge v4, v2, :cond_12

    iget-wide v8, v3, LNi/z;->c:J

    sget v14, LKi/f;->b:I

    int-to-long v14, v14

    mul-long/2addr v8, v14

    int-to-long v14, v4

    add-long/2addr v8, v14

    cmp-long v14, v8, v12

    if-ltz v14, :cond_7

    cmp-long v15, v8, v10

    if-gez v15, :cond_13

    :cond_7
    invoke-virtual {v3, v4}, LKi/m;->B(I)Ljava/lang/Object;

    move-result-object v15

    invoke-virtual {v3, v4}, LKi/m;->A(I)Ljava/lang/Object;

    move-result-object v6

    instance-of v7, v15, LIi/n;

    if-eqz v7, :cond_a

    cmp-long v7, v8, v10

    if-gez v7, :cond_8

    if-ltz v14, :cond_8

    const-string v7, "receive"

    goto/16 :goto_6

    :cond_8
    if-gez v14, :cond_9

    if-ltz v7, :cond_9

    const-string v7, "send"

    goto/16 :goto_6

    :cond_9
    const-string v7, "cont"

    goto/16 :goto_6

    :cond_a
    instance-of v7, v15, LKi/u;

    if-eqz v7, :cond_b

    const-string v7, "receiveCatching"

    goto/16 :goto_6

    :cond_b
    instance-of v7, v15, LKi/x;

    if-eqz v7, :cond_c

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "EB("

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v8, 0x29

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    goto :goto_6

    :cond_c
    invoke-static {}, LKi/f;->q()LNi/C;

    move-result-object v7

    invoke-static {v15, v7}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_f

    invoke-static {}, LKi/f;->p()LNi/C;

    move-result-object v7

    invoke-static {v15, v7}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_d

    goto :goto_5

    :cond_d
    if-eqz v15, :cond_11

    invoke-static {}, LKi/f;->k()LNi/C;

    move-result-object v7

    invoke-static {v15, v7}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_11

    invoke-static {}, LKi/f;->f()LNi/C;

    move-result-object v7

    invoke-static {v15, v7}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_11

    invoke-static {}, LKi/f;->o()LNi/C;

    move-result-object v7

    invoke-static {v15, v7}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_11

    invoke-static {}, LKi/f;->i()LNi/C;

    move-result-object v7

    invoke-static {v15, v7}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_11

    invoke-static {}, LKi/f;->j()LNi/C;

    move-result-object v7

    invoke-static {v15, v7}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_11

    invoke-static {}, LKi/f;->z()LNi/C;

    move-result-object v7

    invoke-static {v15, v7}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_e

    goto :goto_7

    :cond_e
    invoke-virtual {v15}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    goto :goto_6

    :cond_f
    :goto_5
    const-string v7, "resuming_sender"

    :goto_6
    if-eqz v6, :cond_10

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v9, 0x28

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, "),"

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_7

    :cond_10
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_11
    :goto_7
    add-int/lit8 v4, v4, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x1

    goto/16 :goto_4

    :cond_12
    invoke-virtual {v3}, LNi/b;->f()LNi/b;

    move-result-object v2

    move-object v3, v2

    check-cast v3, LKi/m;

    if-nez v3, :cond_15

    :cond_13
    invoke-static {v1}, Lkotlin/text/t;->v1(Ljava/lang/CharSequence;)C

    move-result v2

    if-ne v2, v5, :cond_14

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    const/4 v4, 0x1

    sub-int/2addr v2, v4

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "deleteCharAt(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_14
    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1

    :cond_15
    const/4 v6, 0x0

    const/4 v7, 0x1

    goto/16 :goto_3

    :cond_16
    new-instance v1, Ljava/util/NoSuchElementException;

    invoke-direct {v1}, Ljava/util/NoSuchElementException;-><init>()V

    throw v1
.end method

.method protected w0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
