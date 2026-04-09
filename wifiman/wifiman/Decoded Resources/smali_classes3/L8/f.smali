.class public abstract LL8/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Linet/ipaddr/g;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-static {p0, v0}, LL8/f;->b(Linet/ipaddr/g;Z)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static final b(Linet/ipaddr/g;Z)Ljava/lang/String;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Linet/ipaddr/g;->g1()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v0

    goto :goto_1

    :cond_1
    :goto_0
    move-object p1, p0

    :goto_1
    if-eqz p1, :cond_4

    instance-of p1, p0, Linet/ipaddr/ipv4/b;

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Linet/ipaddr/a;->Y()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_2
    instance-of p1, p0, Linet/ipaddr/ipv6/b;

    if-eqz p1, :cond_3

    check-cast p0, Linet/ipaddr/ipv6/b;

    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->Y()Ljava/lang/String;

    move-result-object p0

    const-string/jumbo p1, "toCanonicalString(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "%"

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lkotlin/text/t;->l1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    sget-object p1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, p1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    const-string/jumbo p1, "toUpperCase(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_4

    const-string p1, "::"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    move-object v0, p0

    goto :goto_2

    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    throw p0

    :cond_4
    :goto_2
    return-object v0
.end method
