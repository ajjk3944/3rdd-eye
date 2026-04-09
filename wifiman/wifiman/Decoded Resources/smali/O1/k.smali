.class public final LO1/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LIi/N;

.field private final b:Lmh/p;

.field private final c:LKi/g;

.field private final d:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public constructor <init>(LIi/N;Lmh/l;Lmh/p;Lmh/p;)V
    .locals 2

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onComplete"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onUndeliveredElement"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consumeMessage"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LO1/k;->a:LIi/N;

    iput-object p4, p0, LO1/k;->b:Lmh/p;

    const/4 p4, 0x0

    const/4 v0, 0x6

    const v1, 0x7fffffff

    invoke-static {v1, p4, p4, v0, p4}, LKi/j;->b(ILKi/a;Lmh/l;ILjava/lang/Object;)LKi/g;

    move-result-object p4

    iput-object p4, p0, LO1/k;->c:LKi/g;

    new-instance p4, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v0, 0x0

    invoke-direct {p4, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p4, p0, LO1/k;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-interface {p1}, LIi/N;->getCoroutineContext()Ldh/i;

    move-result-object p1

    sget-object p4, LIi/y0;->O:LIi/y0$b;

    invoke-interface {p1, p4}, Ldh/i;->get(Ldh/i$c;)Ldh/i$b;

    move-result-object p1

    check-cast p1, LIi/y0;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p4, LO1/k$a;

    invoke-direct {p4, p2, p0, p3}, LO1/k$a;-><init>(Lmh/l;LO1/k;Lmh/p;)V

    invoke-interface {p1, p4}, LIi/y0;->invokeOnCompletion(Lmh/l;)LIi/e0;

    :goto_0
    return-void
.end method

.method public static final synthetic a(LO1/k;)Lmh/p;
    .locals 0

    iget-object p0, p0, LO1/k;->b:Lmh/p;

    return-object p0
.end method

.method public static final synthetic b(LO1/k;)LKi/g;
    .locals 0

    iget-object p0, p0, LO1/k;->c:LKi/g;

    return-object p0
.end method

.method public static final synthetic c(LO1/k;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    iget-object p0, p0, LO1/k;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object p0
.end method

.method public static final synthetic d(LO1/k;)LIi/N;
    .locals 0

    iget-object p0, p0, LO1/k;->a:LIi/N;

    return-object p0
.end method


# virtual methods
.method public final e(Ljava/lang/Object;)V
    .locals 6

    iget-object v0, p0, LO1/k;->c:LKi/g;

    invoke-interface {v0, p1}, LKi/w;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LKi/k$a;

    if-eqz v0, :cond_1

    invoke-static {p1}, LKi/k;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-nez p1, :cond_0

    new-instance p1, Lkotlinx/coroutines/channels/ClosedSendChannelException;

    const-string v0, "Channel was closed normally"

    invoke-direct {p1, v0}, Lkotlinx/coroutines/channels/ClosedSendChannelException;-><init>(Ljava/lang/String;)V

    :cond_0
    throw p1

    :cond_1
    invoke-static {p1}, LKi/k;->j(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, LO1/k;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p1

    if-nez p1, :cond_2

    iget-object v0, p0, LO1/k;->a:LIi/N;

    new-instance v3, LO1/k$b;

    const/4 p1, 0x0

    invoke-direct {v3, p0, p1}, LO1/k$b;-><init>(LO1/k;Ldh/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    :cond_2
    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Check failed."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
