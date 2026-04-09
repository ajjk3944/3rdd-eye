.class public abstract Lpi/L;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lpi/S;)Lpi/I;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lpi/S;->Q0()Lpi/M0;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lpi/I;

    return-object p0
.end method

.method public static final b(Lpi/S;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lpi/S;->Q0()Lpi/M0;

    move-result-object p0

    instance-of p0, p0, Lpi/I;

    return p0
.end method

.method public static final c(Lpi/S;)Lpi/d0;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lpi/S;->Q0()Lpi/M0;

    move-result-object p0

    instance-of v0, p0, Lpi/I;

    if-eqz v0, :cond_0

    check-cast p0, Lpi/I;

    invoke-virtual {p0}, Lpi/I;->V0()Lpi/d0;

    move-result-object p0

    goto :goto_0

    :cond_0
    instance-of v0, p0, Lpi/d0;

    if-eqz v0, :cond_1

    check-cast p0, Lpi/d0;

    :goto_0
    return-object p0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final d(Lpi/S;)Lpi/d0;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lpi/S;->Q0()Lpi/M0;

    move-result-object p0

    instance-of v0, p0, Lpi/I;

    if-eqz v0, :cond_0

    check-cast p0, Lpi/I;

    invoke-virtual {p0}, Lpi/I;->W0()Lpi/d0;

    move-result-object p0

    goto :goto_0

    :cond_0
    instance-of v0, p0, Lpi/d0;

    if-eqz v0, :cond_1

    check-cast p0, Lpi/d0;

    :goto_0
    return-object p0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
