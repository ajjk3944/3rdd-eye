.class public abstract LJ/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ly0/G;LJ/c;Lmh/a;Ldh/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, LJ/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, LJ/b$a;-><init>(LJ/c;Lmh/a;Ldh/e;)V

    invoke-static {p0, v0, p3}, Lw/o;->d(Ly0/G;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
