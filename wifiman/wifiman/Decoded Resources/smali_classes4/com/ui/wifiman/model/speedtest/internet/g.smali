.class public abstract Lcom/ui/wifiman/model/speedtest/internet/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lcom/ui/wifiman/model/speedtest/internet/f;)Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/ui/wifiman/model/speedtest/internet/f;->o()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object p0

    invoke-virtual {p0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d$a;

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    instance-of v1, p0, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d$a$b;

    if-eqz v1, :cond_1

    check-cast p0, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d$a$b;

    invoke-virtual {p0}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d$a$b;->a()Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;

    move-result-object v0

    goto :goto_0

    :cond_1
    instance-of v1, p0, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d$a$a;

    if-nez v1, :cond_3

    instance-of p0, p0, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d$a$c;

    if-eqz p0, :cond_2

    goto :goto_0

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_3
    :goto_0
    return-object v0
.end method

.method public static final b(Lcom/ui/wifiman/model/speedtest/internet/f;)Ljava/util/List;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/ui/wifiman/model/speedtest/internet/f;->o()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object p0

    invoke-virtual {p0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d$a;

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    instance-of v1, p0, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d$a$b;

    if-eqz v1, :cond_1

    check-cast p0, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d$a$b;

    invoke-virtual {p0}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d$a$b;->b()Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_1
    instance-of v1, p0, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d$a$a;

    if-nez v1, :cond_3

    instance-of p0, p0, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d$a$c;

    if-eqz p0, :cond_2

    goto :goto_0

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_3
    :goto_0
    return-object v0
.end method

.method public static final c(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Ljava/lang/Integer;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/ui/wifiman/model/speedtest/Speedtest$d;->d()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object p0

    invoke-virtual {p0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    return-object p0
.end method

.method public static final d(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Ljava/lang/Integer;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/ui/wifiman/model/speedtest/Speedtest$d;->e()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object p0

    invoke-virtual {p0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    return-object p0
.end method
