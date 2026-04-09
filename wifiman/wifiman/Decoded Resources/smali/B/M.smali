.class public abstract LB/M;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LT/q0;)V
    .locals 0

    invoke-interface {p0}, LT/q0;->getValue()Ljava/lang/Object;

    return-void
.end method

.method public static b(LT/q0;)LT/q0;
    .locals 0

    return-object p0
.end method

.method public static synthetic c(LT/q0;ILkotlin/jvm/internal/DefaultConstructorMarker;)LT/q0;
    .locals 0

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    sget-object p0, LYg/J;->a:LYg/J;

    invoke-static {}, LT/o1;->j()LT/n1;

    move-result-object p1

    invoke-static {p0, p1}, LT/o1;->h(Ljava/lang/Object;LT/n1;)LT/q0;

    move-result-object p0

    :cond_0
    invoke-static {p0}, LB/M;->b(LT/q0;)LT/q0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(LT/q0;)V
    .locals 1

    sget-object v0, LYg/J;->a:LYg/J;

    invoke-interface {p0, v0}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method
