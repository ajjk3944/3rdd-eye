.class public final LJi/f;
.super LJi/g;
.source "SourceFile"

# interfaces
.implements LIi/X;


# instance fields
.field private final c:Landroid/os/Handler;

.field private final d:Ljava/lang/String;

.field private final e:Z

.field private final f:LJi/f;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 8
    invoke-direct {p0, p1, p2, v0}, LJi/f;-><init>(Landroid/os/Handler;Ljava/lang/String;Z)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/os/Handler;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2}, LJi/f;-><init>(Landroid/os/Handler;Ljava/lang/String;)V

    return-void
.end method

.method private constructor <init>(Landroid/os/Handler;Ljava/lang/String;Z)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, LJi/g;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 2
    iput-object p1, p0, LJi/f;->c:Landroid/os/Handler;

    .line 3
    iput-object p2, p0, LJi/f;->d:Ljava/lang/String;

    .line 4
    iput-boolean p3, p0, LJi/f;->e:Z

    if-eqz p3, :cond_0

    move-object p3, p0

    goto :goto_0

    .line 5
    :cond_0
    new-instance p3, LJi/f;

    const/4 v0, 0x1

    invoke-direct {p3, p1, p2, v0}, LJi/f;-><init>(Landroid/os/Handler;Ljava/lang/String;Z)V

    .line 6
    :goto_0
    iput-object p3, p0, LJi/f;->f:LJi/f;

    return-void
.end method

.method public static synthetic s0(LIi/n;LJi/f;)V
    .locals 0

    invoke-static {p0, p1}, LJi/f;->y0(LIi/n;LJi/f;)V

    return-void
.end method

.method public static synthetic t0(LJi/f;Ljava/lang/Runnable;)V
    .locals 0

    invoke-static {p0, p1}, LJi/f;->x0(LJi/f;Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic u0(LJi/f;Ljava/lang/Runnable;Ljava/lang/Throwable;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, LJi/f;->z0(LJi/f;Ljava/lang/Runnable;Ljava/lang/Throwable;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private final v0(Ldh/i;Ljava/lang/Runnable;)V
    .locals 3

    new-instance v0, Ljava/util/concurrent/CancellationException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "The task was rejected, the handler underlying the dispatcher \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "\' was closed"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v0}, LIi/A0;->d(Ldh/i;Ljava/util/concurrent/CancellationException;)V

    invoke-static {}, LIi/c0;->b()LIi/J;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LIi/J;->Y(Ldh/i;Ljava/lang/Runnable;)V

    return-void
.end method

.method private static final x0(LJi/f;Ljava/lang/Runnable;)V
    .locals 0

    iget-object p0, p0, LJi/f;->c:Landroid/os/Handler;

    invoke-virtual {p0, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static final y0(LIi/n;LJi/f;)V
    .locals 1

    sget-object v0, LYg/J;->a:LYg/J;

    invoke-interface {p0, p1, v0}, LIi/n;->J(LIi/J;Ljava/lang/Object;)V

    return-void
.end method

.method private static final z0(LJi/f;Ljava/lang/Runnable;Ljava/lang/Throwable;)LYg/J;
    .locals 0

    iget-object p0, p0, LJi/f;->c:Landroid/os/Handler;

    invoke-virtual {p0, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public J(JLIi/n;)V
    .locals 4

    new-instance v0, LJi/d;

    invoke-direct {v0, p3, p0}, LJi/d;-><init>(LIi/n;LJi/f;)V

    iget-object v1, p0, LJi/f;->c:Landroid/os/Handler;

    const-wide v2, 0x3fffffffffffffffL    # 1.9999999999999998

    invoke-static {p1, p2, v2, v3}, Lsh/m;->h(JJ)J

    move-result-wide p1

    invoke-virtual {v1, v0, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, LJi/e;

    invoke-direct {p1, p0, v0}, LJi/e;-><init>(LJi/f;Ljava/lang/Runnable;)V

    invoke-interface {p3, p1}, LIi/n;->B(Lmh/l;)V

    goto :goto_0

    :cond_0
    invoke-interface {p3}, Ldh/e;->getContext()Ldh/i;

    move-result-object p1

    invoke-direct {p0, p1, v0}, LJi/f;->v0(Ldh/i;Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method public Y(Ldh/i;Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, LJi/f;->c:Landroid/os/Handler;

    invoke-virtual {v0, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0, p1, p2}, LJi/f;->v0(Ldh/i;Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, LJi/f;

    if-eqz v0, :cond_0

    check-cast p1, LJi/f;

    iget-object v0, p1, LJi/f;->c:Landroid/os/Handler;

    iget-object v1, p0, LJi/f;->c:Landroid/os/Handler;

    if-ne v0, v1, :cond_0

    iget-boolean p1, p1, LJi/f;->e:Z

    iget-boolean v0, p0, LJi/f;->e:Z

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LJi/f;->c:Landroid/os/Handler;

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    iget-boolean v1, p0, LJi/f;->e:Z

    if-eqz v1, :cond_0

    const/16 v1, 0x4cf

    goto :goto_0

    :cond_0
    const/16 v1, 0x4d5

    :goto_0
    xor-int/2addr v0, v1

    return v0
.end method

.method public m0(Ldh/i;)Z
    .locals 1

    iget-boolean p1, p0, LJi/f;->e:Z

    if-eqz p1, :cond_1

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    iget-object v0, p0, LJi/f;->c:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

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

.method public p(JLjava/lang/Runnable;Ldh/i;)LIi/e0;
    .locals 3

    iget-object v0, p0, LJi/f;->c:Landroid/os/Handler;

    const-wide v1, 0x3fffffffffffffffL    # 1.9999999999999998

    invoke-static {p1, p2, v1, v2}, Lsh/m;->h(JJ)J

    move-result-wide p1

    invoke-virtual {v0, p3, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, LJi/c;

    invoke-direct {p1, p0, p3}, LJi/c;-><init>(LJi/f;Ljava/lang/Runnable;)V

    return-object p1

    :cond_0
    invoke-direct {p0, p4, p3}, LJi/f;->v0(Ldh/i;Ljava/lang/Runnable;)V

    sget-object p1, LIi/K0;->a:LIi/K0;

    return-object p1
.end method

.method public bridge synthetic p0()LIi/H0;
    .locals 1

    invoke-virtual {p0}, LJi/f;->w0()LJi/f;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic r0()LJi/g;
    .locals 1

    invoke-virtual {p0}, LJi/f;->w0()LJi/f;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, LIi/H0;->q0()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, LJi/f;->d:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, LJi/f;->c:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    iget-boolean v1, p0, LJi/f;->e:Z

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ".immediate"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public w0()LJi/f;
    .locals 1

    iget-object v0, p0, LJi/f;->f:LJi/f;

    return-object v0
.end method
