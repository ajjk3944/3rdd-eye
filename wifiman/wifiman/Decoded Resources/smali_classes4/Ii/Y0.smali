.class public final LIi/Y0;
.super LNi/y;
.source "SourceFile"


# instance fields
.field private final e:Ljava/lang/ThreadLocal;

.field private volatile threadLocalIsSet:Z


# direct methods
.method public constructor <init>(Ldh/i;Ldh/e;)V
    .locals 2

    sget-object v0, LIi/Z0;->a:LIi/Z0;

    invoke-interface {p1, v0}, Ldh/i;->get(Ldh/i$c;)Ldh/i$b;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-interface {p1, v0}, Ldh/i;->plus(Ldh/i;)Ldh/i;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    invoke-direct {p0, v0, p2}, LNi/y;-><init>(Ldh/i;Ldh/e;)V

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, LIi/Y0;->e:Ljava/lang/ThreadLocal;

    invoke-interface {p2}, Ldh/e;->getContext()Ldh/i;

    move-result-object p2

    sget-object v0, Ldh/f;->m0:Ldh/f$b;

    invoke-interface {p2, v0}, Ldh/i;->get(Ldh/i$c;)Ldh/i$b;

    move-result-object p2

    instance-of p2, p2, LIi/J;

    if-nez p2, :cond_1

    const/4 p2, 0x0

    invoke-static {p1, p2}, LNi/J;->i(Ldh/i;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, LNi/J;->f(Ldh/i;Ljava/lang/Object;)V

    invoke-virtual {p0, p1, p2}, LIi/Y0;->U0(Ldh/i;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method private final T0()V
    .locals 2

    iget-boolean v0, p0, LIi/Y0;->threadLocalIsSet:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, LIi/Y0;->e:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYg/s;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ldh/i;

    invoke-virtual {v0}, LYg/s;->c()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1, v0}, LNi/J;->f(Ldh/i;Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, LIi/Y0;->e:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    :cond_1
    return-void
.end method


# virtual methods
.method protected N0(Ljava/lang/Object;)V
    .locals 5

    invoke-direct {p0}, LIi/Y0;->T0()V

    iget-object v0, p0, LNi/y;->d:Ldh/e;

    invoke-static {p1, v0}, LIi/D;->a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, LNi/y;->d:Ldh/e;

    invoke-interface {v0}, Ldh/e;->getContext()Ldh/i;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, LNi/J;->i(Ldh/i;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sget-object v4, LNi/J;->a:LNi/C;

    if-eq v3, v4, :cond_0

    invoke-static {v0, v1, v3}, LIi/H;->m(Ldh/e;Ldh/i;Ljava/lang/Object;)LIi/Y0;

    move-result-object v2

    :cond_0
    :try_start_0
    iget-object v0, p0, LNi/y;->d:Ldh/e;

    invoke-interface {v0, p1}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    sget-object p1, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_1

    invoke-virtual {v2}, LIi/Y0;->S0()Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    invoke-static {v1, v3}, LNi/J;->f(Ldh/i;Ljava/lang/Object;)V

    :cond_2
    return-void

    :catchall_0
    move-exception p1

    if-eqz v2, :cond_3

    invoke-virtual {v2}, LIi/Y0;->S0()Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    invoke-static {v1, v3}, LNi/J;->f(Ldh/i;Ljava/lang/Object;)V

    :cond_4
    throw p1
.end method

.method public R0()V
    .locals 0

    invoke-direct {p0}, LIi/Y0;->T0()V

    return-void
.end method

.method public final S0()Z
    .locals 3

    iget-boolean v0, p0, LIi/Y0;->threadLocalIsSet:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, LIi/Y0;->e:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, LIi/Y0;->e:Ljava/lang/ThreadLocal;

    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->remove()V

    xor-int/2addr v0, v1

    return v0
.end method

.method public final U0(Ldh/i;Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LIi/Y0;->threadLocalIsSet:Z

    iget-object v0, p0, LIi/Y0;->e:Ljava/lang/ThreadLocal;

    invoke-static {p1, p2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-void
.end method
