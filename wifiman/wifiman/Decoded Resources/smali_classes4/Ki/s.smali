.class final LKi/s;
.super LKi/h;
.source "SourceFile"

# interfaces
.implements LKi/t;


# direct methods
.method public constructor <init>(Ldh/i;LKi/g;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0, v0}, LKi/h;-><init>(Ldh/i;LKi/g;ZZ)V

    return-void
.end method


# virtual methods
.method protected O0(Ljava/lang/Throwable;Z)V
    .locals 1

    invoke-virtual {p0}, LKi/h;->S0()LKi/g;

    move-result-object v0

    invoke-interface {v0, p1}, LKi/w;->f(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_0

    if-nez p2, :cond_0

    invoke-virtual {p0}, LIi/a;->getContext()Ldh/i;

    move-result-object p2

    invoke-static {p2, p1}, LIi/L;->a(Ldh/i;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic P0(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LYg/J;

    invoke-virtual {p0, p1}, LKi/s;->T0(LYg/J;)V

    return-void
.end method

.method protected T0(LYg/J;)V
    .locals 2

    invoke-virtual {p0}, LKi/h;->S0()LKi/g;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, LKi/w$a;->a(LKi/w;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    return-void
.end method

.method public bridge synthetic g()LKi/w;
    .locals 1

    invoke-virtual {p0}, LKi/h;->R0()LKi/g;

    move-result-object v0

    return-object v0
.end method

.method public isActive()Z
    .locals 1

    invoke-super {p0}, LIi/a;->isActive()Z

    move-result v0

    return v0
.end method
