.class public abstract LF/H;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(Ly0/G;LF/U;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, LF/H;->d(Ly0/G;LF/U;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Ly0/G;LF/U;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, LF/H;->e(Ly0/G;LF/U;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Ly0/G;LF/U;Ldh/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, LF/H$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, LF/H$a;-><init>(Ly0/G;LF/U;Ldh/e;)V

    invoke-static {v0, p2}, LIi/O;->g(Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final d(Ly0/G;LF/U;Ldh/e;)Ljava/lang/Object;
    .locals 6

    new-instance v1, LF/H$b;

    invoke-direct {v1, p1}, LF/H$b;-><init>(LF/U;)V

    new-instance v2, LF/H$c;

    invoke-direct {v2, p1}, LF/H$c;-><init>(LF/U;)V

    new-instance v3, LF/H$d;

    invoke-direct {v3, p1}, LF/H$d;-><init>(LF/U;)V

    new-instance v4, LF/H$e;

    invoke-direct {v4, p1}, LF/H$e;-><init>(LF/U;)V

    move-object v0, p0

    move-object v5, p2

    invoke-static/range {v0 .. v5}, Lw/j;->e(Ly0/G;Lmh/l;Lmh/a;Lmh/a;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final e(Ly0/G;LF/U;Ldh/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, LF/H$f;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LF/H$f;-><init>(LF/U;Ldh/e;)V

    invoke-static {p0, v0, p2}, Lw/o;->d(Ly0/G;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
