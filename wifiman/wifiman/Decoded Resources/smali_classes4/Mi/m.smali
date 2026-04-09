.class public abstract LMi/m;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lmh/p;Ldh/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, LMi/l;

    invoke-interface {p1}, Ldh/e;->getContext()Ldh/i;

    move-result-object v1

    invoke-direct {v0, v1, p1}, LMi/l;-><init>(Ldh/i;Ldh/e;)V

    invoke-static {v0, v0, p0}, LOi/b;->b(LNi/y;Ljava/lang/Object;Lmh/p;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_0

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/h;->c(Ldh/e;)V

    :cond_0
    return-object p0
.end method
