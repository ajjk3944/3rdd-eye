.class public abstract LT/E1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(LT/l;)LT/l;
    .locals 0

    return-object p0
.end method

.method public static final b(LT/l;Lmh/l;)V
    .locals 2

    invoke-interface {p0}, LT/l;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, LYg/J;->a:LYg/J;

    new-instance v1, LT/E1$a;

    invoke-direct {v1, p1}, LT/E1$a;-><init>(Lmh/l;)V

    invoke-interface {p0, v0, v1}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_0
    return-void
.end method

.method public static final c(LT/l;Ljava/lang/Object;Lmh/p;)V
    .locals 1

    invoke-interface {p0}, LT/l;->o()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p0}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-interface {p0, p1}, LT/l;->K(Ljava/lang/Object;)V

    invoke-interface {p0, p1, p2}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_1
    return-void
.end method
