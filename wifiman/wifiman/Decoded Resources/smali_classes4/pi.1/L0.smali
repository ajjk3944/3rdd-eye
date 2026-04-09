.class public abstract Lpi/L0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lpi/S;)Lpi/S;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lpi/K0;

    if-eqz v0, :cond_0

    check-cast p0, Lpi/K0;

    invoke-interface {p0}, Lpi/K0;->I()Lpi/S;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final b(Lpi/M0;Lpi/S;)Lpi/M0;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "origin"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lpi/L0;->a(Lpi/S;)Lpi/S;

    move-result-object p1

    invoke-static {p0, p1}, Lpi/L0;->d(Lpi/M0;Lpi/S;)Lpi/M0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lpi/M0;Lpi/S;Lmh/l;)Lpi/M0;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "origin"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transform"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lpi/L0;->a(Lpi/S;)Lpi/S;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p2, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpi/S;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p0, p1}, Lpi/L0;->d(Lpi/M0;Lpi/S;)Lpi/M0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lpi/M0;Lpi/S;)Lpi/M0;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lpi/K0;

    if-eqz v0, :cond_0

    check-cast p0, Lpi/K0;

    invoke-interface {p0}, Lpi/K0;->G0()Lpi/M0;

    move-result-object p0

    invoke-static {p0, p1}, Lpi/L0;->d(Lpi/M0;Lpi/S;)Lpi/M0;

    move-result-object p0

    return-object p0

    :cond_0
    if-eqz p1, :cond_4

    invoke-static {p1, p0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    instance-of v0, p0, Lpi/d0;

    if-eqz v0, :cond_2

    new-instance v0, Lpi/g0;

    check-cast p0, Lpi/d0;

    invoke-direct {v0, p0, p1}, Lpi/g0;-><init>(Lpi/d0;Lpi/S;)V

    goto :goto_0

    :cond_2
    instance-of v0, p0, Lpi/I;

    if-eqz v0, :cond_3

    new-instance v0, Lpi/K;

    check-cast p0, Lpi/I;

    invoke-direct {v0, p0, p1}, Lpi/K;-><init>(Lpi/I;Lpi/S;)V

    :goto_0
    return-object v0

    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_4
    :goto_1
    return-object p0
.end method
