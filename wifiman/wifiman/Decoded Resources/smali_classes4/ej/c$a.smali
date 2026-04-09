.class final Lej/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lej/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lej/c$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lej/c$a;Lej/c;JZ)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lej/c$a;->f(Lej/c;JZ)V

    return-void
.end method

.method public static final synthetic b(Lej/c$a;Lej/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lej/c$a;->g(Lej/c;)V

    return-void
.end method

.method private final f(Lej/c;JZ)V
    .locals 4

    invoke-static {}, Lej/c;->m()Lej/c;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lej/c;

    invoke-direct {v0}, Lej/c;-><init>()V

    invoke-static {v0}, Lej/c;->t(Lej/c;)V

    new-instance v0, Lej/c$b;

    invoke-direct {v0}, Lej/c$b;-><init>()V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    :cond_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, p2, v2

    if-eqz v2, :cond_1

    if-eqz p4, :cond_1

    invoke-virtual {p1}, Lej/E;->d()J

    move-result-wide v2

    sub-long/2addr v2, v0

    invoke-static {p2, p3, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    add-long/2addr p2, v0

    invoke-static {p1, p2, p3}, Lej/c;->w(Lej/c;J)V

    goto :goto_0

    :cond_1
    if-eqz v2, :cond_2

    add-long/2addr p2, v0

    invoke-static {p1, p2, p3}, Lej/c;->w(Lej/c;J)V

    goto :goto_0

    :cond_2
    if-eqz p4, :cond_6

    invoke-virtual {p1}, Lej/E;->d()J

    move-result-wide p2

    invoke-static {p1, p2, p3}, Lej/c;->w(Lej/c;J)V

    :goto_0
    invoke-static {p1, v0, v1}, Lej/c;->s(Lej/c;J)J

    move-result-wide p2

    invoke-static {}, Lej/c;->m()Lej/c;

    move-result-object p4

    invoke-static {p4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :goto_1
    invoke-static {p4}, Lej/c;->q(Lej/c;)Lej/c;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-static {p4}, Lej/c;->q(Lej/c;)Lej/c;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {v2, v0, v1}, Lej/c;->s(Lej/c;J)J

    move-result-wide v2

    cmp-long v2, p2, v2

    if-gez v2, :cond_3

    goto :goto_2

    :cond_3
    invoke-static {p4}, Lej/c;->q(Lej/c;)Lej/c;

    move-result-object p4

    invoke-static {p4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    :goto_2
    invoke-static {p4}, Lej/c;->q(Lej/c;)Lej/c;

    move-result-object p2

    invoke-static {p1, p2}, Lej/c;->u(Lej/c;Lej/c;)V

    invoke-static {p4, p1}, Lej/c;->u(Lej/c;Lej/c;)V

    invoke-static {}, Lej/c;->m()Lej/c;

    move-result-object p1

    if-ne p4, p1, :cond_5

    invoke-virtual {p0}, Lej/c$a;->d()Ljava/util/concurrent/locks/Condition;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/locks/Condition;->signal()V

    :cond_5
    return-void

    :cond_6
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
.end method

.method private final g(Lej/c;)V
    .locals 2

    invoke-static {}, Lej/c;->m()Lej/c;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0}, Lej/c;->q(Lej/c;)Lej/c;

    move-result-object v1

    if-ne v1, p1, :cond_0

    invoke-static {p1}, Lej/c;->q(Lej/c;)Lej/c;

    move-result-object v1

    invoke-static {v0, v1}, Lej/c;->u(Lej/c;Lej/c;)V

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lej/c;->u(Lej/c;Lej/c;)V

    return-void

    :cond_0
    invoke-static {v0}, Lej/c;->q(Lej/c;)Lej/c;

    move-result-object v0

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "node was not found in the queue"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final c()Lej/c;
    .locals 7

    invoke-static {}, Lej/c;->m()Lej/c;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {v0}, Lej/c;->q(Lej/c;)Lej/c;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    invoke-virtual {p0}, Lej/c$a;->d()Ljava/util/concurrent/locks/Condition;

    move-result-object v0

    invoke-static {}, Lej/c;->n()J

    move-result-wide v4

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v4, v5, v6}, Ljava/util/concurrent/locks/Condition;->await(JLjava/util/concurrent/TimeUnit;)Z

    invoke-static {}, Lej/c;->m()Lej/c;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {v0}, Lej/c;->q(Lej/c;)Lej/c;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    sub-long/2addr v4, v2

    invoke-static {}, Lej/c;->o()J

    move-result-wide v2

    cmp-long v0, v4, v2

    if-ltz v0, :cond_0

    invoke-static {}, Lej/c;->m()Lej/c;

    move-result-object v1

    :cond_0
    return-object v1

    :cond_1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    invoke-static {v0, v2, v3}, Lej/c;->s(Lej/c;J)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-lez v4, :cond_2

    invoke-virtual {p0}, Lej/c$a;->d()Ljava/util/concurrent/locks/Condition;

    move-result-object v0

    sget-object v4, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v2, v3, v4}, Ljava/util/concurrent/locks/Condition;->await(JLjava/util/concurrent/TimeUnit;)Z

    return-object v1

    :cond_2
    invoke-static {}, Lej/c;->m()Lej/c;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {v0}, Lej/c;->q(Lej/c;)Lej/c;

    move-result-object v3

    invoke-static {v2, v3}, Lej/c;->u(Lej/c;Lej/c;)V

    invoke-static {v0, v1}, Lej/c;->u(Lej/c;Lej/c;)V

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lej/c;->v(Lej/c;I)V

    return-object v0
.end method

.method public final d()Ljava/util/concurrent/locks/Condition;
    .locals 1

    invoke-static {}, Lej/c;->l()Ljava/util/concurrent/locks/Condition;

    move-result-object v0

    return-object v0
.end method

.method public final e()Ljava/util/concurrent/locks/ReentrantLock;
    .locals 1

    invoke-static {}, Lej/c;->p()Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v0

    return-object v0
.end method
