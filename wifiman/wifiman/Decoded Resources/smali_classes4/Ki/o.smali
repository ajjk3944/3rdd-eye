.class abstract synthetic LKi/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LKi/w;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-interface {p0, p1}, LKi/w;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LKi/k$c;

    if-nez v1, :cond_0

    check-cast v0, LYg/J;

    sget-object p0, LKi/k;->b:LKi/k$b;

    sget-object p1, LYg/J;->a:LYg/J;

    invoke-virtual {p0, p1}, LKi/k$b;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, LKi/o$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, LKi/o$a;-><init>(LKi/w;Ljava/lang/Object;Ldh/e;)V

    const/4 p0, 0x1

    invoke-static {v1, v0, p0, v1}, LIi/i;->f(Ldh/i;Lmh/p;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LKi/k;

    invoke-virtual {p0}, LKi/k;->l()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
