.class public abstract LIa/j;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lspeedtest/InternetSpeedTestServer;)LIa/c;
    .locals 15

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lspeedtest/InternetSpeedTestServer;->getURL()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "it"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move-object v5, v0

    goto :goto_0

    :cond_0
    move-object v5, v3

    :goto_0
    if-nez v5, :cond_1

    return-object v3

    :cond_1
    invoke-virtual {p0}, Lspeedtest/InternetSpeedTestServer;->getLocation()Lspeedtest/LocationCoordinates;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lspeedtest/LocationCoordinates;->getLatitude()D

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    goto :goto_1

    :cond_2
    move-object v0, v3

    :goto_1
    const-wide/16 v6, 0x0

    invoke-static {v0, v6, v7}, Lkotlin/jvm/internal/s;->a(Ljava/lang/Double;D)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_2

    :cond_3
    move-object v0, v3

    :goto_2
    invoke-virtual {p0}, Lspeedtest/InternetSpeedTestServer;->getLocation()Lspeedtest/LocationCoordinates;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lspeedtest/LocationCoordinates;->getLongitude()D

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v8

    cmpg-double v4, v8, v6

    if-nez v4, :cond_4

    const/4 v4, 0x1

    goto :goto_3

    :cond_4
    const/4 v4, 0x0

    :goto_3
    if-nez v4, :cond_5

    move-object v7, v2

    goto :goto_4

    :cond_5
    move-object v7, v3

    :goto_4
    invoke-virtual {p0}, Lspeedtest/InternetSpeedTestServer;->getProvider()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_6

    move-object v8, v2

    goto :goto_5

    :cond_6
    move-object v8, v3

    :goto_5
    invoke-virtual {p0}, Lspeedtest/InternetSpeedTestServer;->getProviderURL()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-static {v2}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_7

    move-object v9, v2

    goto :goto_6

    :cond_7
    move-object v9, v3

    :goto_6
    invoke-virtual {p0}, Lspeedtest/InternetSpeedTestServer;->getCity()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_8

    move-object v10, v2

    goto :goto_7

    :cond_8
    move-object v10, v3

    :goto_7
    invoke-virtual {p0}, Lspeedtest/InternetSpeedTestServer;->getCountry()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_9

    move-object v11, v2

    goto :goto_8

    :cond_9
    move-object v11, v3

    :goto_8
    invoke-virtual {p0}, Lspeedtest/InternetSpeedTestServer;->getCountryCode()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_a

    move-object v12, v2

    goto :goto_9

    :cond_a
    move-object v12, v3

    :goto_9
    invoke-virtual {p0}, Lspeedtest/InternetSpeedTestServer;->getSpeedMbps()Lspeedtest/LinkSpeed;

    move-result-object p0

    invoke-virtual {p0}, Lspeedtest/LinkSpeed;->getBps()J

    move-result-wide v1

    const-wide/16 v13, 0x0

    cmp-long v1, v1, v13

    if-lez v1, :cond_b

    goto :goto_a

    :cond_b
    move-object p0, v3

    :goto_a
    if-eqz p0, :cond_c

    invoke-virtual {p0}, Lspeedtest/LinkSpeed;->getBps()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    :cond_c
    move-object v13, v3

    new-instance p0, LIa/c;

    move-object v4, p0

    move-object v6, v0

    invoke-direct/range {v4 .. v13}, LIa/c;-><init>(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    return-object p0
.end method
