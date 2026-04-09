.class public abstract Ldh/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lmh/p;Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completion"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ldh/k;

    invoke-static {p0, p1, p2}, Leh/b;->b(Lmh/p;Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p0

    invoke-static {p0}, Leh/b;->d(Ldh/e;)Ldh/e;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Ldh/k;-><init>(Ldh/e;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static final b(Lmh/p;Ljava/lang/Object;Ldh/e;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completion"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2}, Leh/b;->b(Lmh/p;Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p0

    invoke-static {p0}, Leh/b;->d(Ldh/e;)Ldh/e;

    move-result-object p0

    sget-object p1, LYg/u;->b:LYg/u$a;

    sget-object p1, LYg/J;->a:LYg/J;

    invoke-static {p1}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
