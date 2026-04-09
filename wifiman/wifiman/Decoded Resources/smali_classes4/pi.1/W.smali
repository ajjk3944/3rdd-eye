.class public abstract Lpi/W;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lpi/S;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lpi/S;->Q0()Lpi/M0;

    move-result-object p0

    instance-of v0, p0, Lkotlin/reflect/jvm/internal/impl/types/error/i;

    if-nez v0, :cond_1

    instance-of v0, p0, Lpi/I;

    if-eqz v0, :cond_0

    check-cast p0, Lpi/I;

    invoke-virtual {p0}, Lpi/I;->U0()Lpi/d0;

    move-result-object p0

    instance-of p0, p0, Lkotlin/reflect/jvm/internal/impl/types/error/i;

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static final b(Lpi/S;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lpi/J0;->l(Lpi/S;)Z

    move-result p0

    return p0
.end method
