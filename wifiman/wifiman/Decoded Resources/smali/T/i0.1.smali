.class public abstract LT/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ldh/i;)LT/g0;
    .locals 1

    sget-object v0, LT/g0;->a0:LT/g0$b;

    invoke-interface {p0, v0}, Ldh/i;->get(Ldh/i$c;)Ldh/i$b;

    move-result-object p0

    check-cast p0, LT/g0;

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext."

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final b(Lmh/l;Ldh/e;)Ljava/lang/Object;
    .locals 2

    invoke-interface {p1}, Ldh/e;->getContext()Ldh/i;

    move-result-object v0

    invoke-static {v0}, LT/i0;->a(Ldh/i;)LT/g0;

    move-result-object v0

    new-instance v1, LT/h0;

    invoke-direct {v1, p0}, LT/h0;-><init>(Lmh/l;)V

    invoke-interface {v0, v1, p1}, LT/g0;->j(Lmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lmh/l;Ldh/e;)Ljava/lang/Object;
    .locals 1

    invoke-interface {p1}, Ldh/e;->getContext()Ldh/i;

    move-result-object v0

    invoke-static {v0}, LT/i0;->a(Ldh/i;)LT/g0;

    move-result-object v0

    invoke-interface {v0, p0, p1}, LT/g0;->j(Lmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
