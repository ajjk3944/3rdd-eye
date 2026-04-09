.class public abstract LQi/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(LIi/N;Ldh/i;Lmh/p;Lgg/c;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, LQi/g;->e(LIi/N;Ldh/i;Lmh/p;Lgg/c;)V

    return-void
.end method

.method public static final b(Ldh/i;Lmh/p;)Lgg/b;
    .locals 1

    sget-object v0, LIi/y0;->O:LIi/y0$b;

    invoke-interface {p0, v0}, Ldh/i;->get(Ldh/i$c;)Ldh/i$b;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, LIi/s0;->a:LIi/s0;

    invoke-static {v0, p0, p1}, LQi/g;->d(LIi/N;Ldh/i;Lmh/p;)Lgg/b;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Completable context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic c(Ldh/i;Lmh/p;ILjava/lang/Object;)Lgg/b;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p0, Ldh/j;->a:Ldh/j;

    :cond_0
    invoke-static {p0, p1}, LQi/g;->b(Ldh/i;Lmh/p;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method private static final d(LIi/N;Ldh/i;Lmh/p;)Lgg/b;
    .locals 1

    new-instance v0, LQi/f;

    invoke-direct {v0, p0, p1, p2}, LQi/f;-><init>(LIi/N;Ldh/i;Lmh/p;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method private static final e(LIi/N;Ldh/i;Lmh/p;Lgg/c;)V
    .locals 0

    invoke-static {p0, p1}, LIi/H;->j(LIi/N;Ldh/i;)Ldh/i;

    move-result-object p0

    new-instance p1, LQi/e;

    invoke-direct {p1, p0, p3}, LQi/e;-><init>(Ldh/i;Lgg/c;)V

    new-instance p0, LQi/c;

    invoke-direct {p0, p1}, LQi/c;-><init>(LIi/y0;)V

    invoke-interface {p3, p0}, Lgg/c;->d(Lkg/e;)V

    sget-object p0, LIi/P;->DEFAULT:LIi/P;

    invoke-virtual {p1, p0, p1, p2}, LIi/a;->Q0(LIi/P;Ljava/lang/Object;Lmh/p;)V

    return-void
.end method
