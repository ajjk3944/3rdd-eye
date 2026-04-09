.class public abstract LQi/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Lhg/c;Ljava/lang/Throwable;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LQi/b;->e(Lhg/c;Ljava/lang/Throwable;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lgg/f;Ldh/e;)Ljava/lang/Object;
    .locals 3

    new-instance v0, LIi/p;

    invoke-static {p1}, Leh/b;->d(Ldh/e;)Ldh/e;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LIi/p;-><init>(Ldh/e;I)V

    invoke-virtual {v0}, LIi/p;->A()V

    new-instance v1, LQi/b$a;

    invoke-direct {v1, v0}, LQi/b$a;-><init>(LIi/n;)V

    invoke-interface {p0, v1}, Lgg/f;->e(Lgg/d;)V

    invoke-virtual {v0}, LIi/p;->u()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_0

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/h;->c(Ldh/e;)V

    :cond_0
    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_1

    return-object p0

    :cond_1
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final c(Lgg/D;Ldh/e;)Ljava/lang/Object;
    .locals 3

    new-instance v0, LIi/p;

    invoke-static {p1}, Leh/b;->d(Ldh/e;)Ldh/e;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LIi/p;-><init>(Ldh/e;I)V

    invoke-virtual {v0}, LIi/p;->A()V

    new-instance v1, LQi/b$b;

    invoke-direct {v1, v0}, LQi/b$b;-><init>(LIi/n;)V

    invoke-interface {p0, v1}, Lgg/D;->a(Lgg/B;)V

    invoke-virtual {v0}, LIi/p;->u()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_0

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/h;->c(Ldh/e;)V

    :cond_0
    return-object p0
.end method

.method public static final d(LIi/n;Lhg/c;)V
    .locals 1

    new-instance v0, LQi/a;

    invoke-direct {v0, p1}, LQi/a;-><init>(Lhg/c;)V

    invoke-interface {p0, v0}, LIi/n;->B(Lmh/l;)V

    return-void
.end method

.method private static final e(Lhg/c;Ljava/lang/Throwable;)LYg/J;
    .locals 0

    invoke-interface {p0}, Lhg/c;->dispose()V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
