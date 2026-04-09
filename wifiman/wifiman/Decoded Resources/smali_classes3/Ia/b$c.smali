.class final LIa/b$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIa/b;->b(Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LIa/b;


# direct methods
.method constructor <init>(LIa/b;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LIa/b$c;->b:LIa/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 1

    new-instance p1, LIa/b$c;

    iget-object v0, p0, LIa/b$c;->b:LIa/b;

    invoke-direct {p1, v0, p2}, LIa/b$c;-><init>(LIa/b;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LIa/b$c;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, LIa/b$c;->a:I

    if-nez v0, :cond_c

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LIa/b$c;->b:LIa/b;

    invoke-static {p1}, LIa/b;->h(LIa/b;)Lspeedtest/DirectoryServerApi;

    move-result-object p1

    invoke-interface {p1}, Lspeedtest/DirectoryServerApi;->fetchIpStats()Lspeedtest/SpeedtestApiIpStats;

    move-result-object p1

    invoke-virtual {p1}, Lspeedtest/SpeedtestApiIpStats;->getError()Lspeedtest/SpeedtestError;

    move-result-object v0

    if-nez v0, :cond_b

    invoke-virtual {p1}, Lspeedtest/SpeedtestApiIpStats;->getIp()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "it"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v3

    :goto_0
    if-eqz v0, :cond_1

    :try_start_0
    invoke-static {v0}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v0
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v2

    new-instance v4, LIa/b$c$d;

    invoke-direct {v4, v0}, LIa/b$c$d;-><init>(Ljava/lang/String;)V

    invoke-static {v4, v2}, LLa/a;->c(Lmh/a;Ljava/lang/Throwable;)V

    :goto_1
    move-object v0, v3

    goto :goto_2

    :catch_1
    move-exception v2

    new-instance v4, LIa/b$c$c;

    invoke-direct {v4, v0}, LIa/b$c$c;-><init>(Ljava/lang/String;)V

    invoke-static {v4, v2}, LLa/a;->c(Lmh/a;Ljava/lang/Throwable;)V

    goto :goto_1

    :goto_2
    move-object v5, v0

    goto :goto_3

    :cond_1
    move-object v5, v3

    :goto_3
    invoke-virtual {p1}, Lspeedtest/SpeedtestApiIpStats;->getIsp()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    move-object v6, v0

    goto :goto_4

    :cond_2
    move-object v6, v3

    :goto_4
    invoke-virtual {p1}, Lspeedtest/SpeedtestApiIpStats;->getIspIcon()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_5

    :cond_3
    move-object v0, v3

    :goto_5
    if-eqz v0, :cond_4

    :try_start_1
    new-instance v2, Ljava/net/URL;

    invoke-direct {v2, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/net/MalformedURLException; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_6

    :catch_2
    move-exception v2

    new-instance v4, LIa/b$c$e;

    invoke-direct {v4, v0}, LIa/b$c$e;-><init>(Ljava/lang/String;)V

    invoke-static {v4, v2}, LLa/a;->c(Lmh/a;Ljava/lang/Throwable;)V

    move-object v2, v3

    :goto_6
    move-object v7, v2

    goto :goto_7

    :cond_4
    move-object v7, v3

    :goto_7
    invoke-virtual {p1}, Lspeedtest/SpeedtestApiIpStats;->getCountry()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_5

    move-object v8, v0

    goto :goto_8

    :cond_5
    move-object v8, v3

    :goto_8
    invoke-virtual {p1}, Lspeedtest/SpeedtestApiIpStats;->getCountryCode()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_6

    move-object v9, v0

    goto :goto_9

    :cond_6
    move-object v9, v3

    :goto_9
    invoke-virtual {p1}, Lspeedtest/SpeedtestApiIpStats;->getLocation()Lspeedtest/LocationCoordinates;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lspeedtest/LocationCoordinates;->getLatitude()D

    move-result-wide v10

    invoke-static {v10, v11}, Lkotlin/coroutines/jvm/internal/b;->b(D)Ljava/lang/Double;

    move-result-object v0

    move-object v10, v0

    goto :goto_a

    :cond_7
    move-object v10, v3

    :goto_a
    invoke-virtual {p1}, Lspeedtest/SpeedtestApiIpStats;->getLocation()Lspeedtest/LocationCoordinates;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lspeedtest/LocationCoordinates;->getLongitude()D

    move-result-wide v11

    invoke-static {v11, v12}, Lkotlin/coroutines/jvm/internal/b;->b(D)Ljava/lang/Double;

    move-result-object v0

    move-object v11, v0

    goto :goto_b

    :cond_8
    move-object v11, v3

    :goto_b
    invoke-virtual {p1}, Lspeedtest/SpeedtestApiIpStats;->getTimezone()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_c

    :cond_9
    move-object p1, v3

    :goto_c
    if-eqz p1, :cond_a

    :try_start_2
    invoke-static {p1}, Ljava/time/ZoneId;->of(Ljava/lang/String;)Ljava/time/ZoneId;

    move-result-object v0

    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/time/ZoneId;)Ljava/util/TimeZone;

    move-result-object v3
    :try_end_2
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/time/DateTimeException; {:try_start_2 .. :try_end_2} :catch_3

    goto :goto_f

    :catch_3
    move-exception v0

    goto :goto_d

    :catch_4
    move-exception v0

    goto :goto_e

    :goto_d
    new-instance v1, LIa/b$c$b;

    invoke-direct {v1, p1}, LIa/b$c$b;-><init>(Ljava/lang/String;)V

    invoke-static {v1, v0}, LLa/a;->c(Lmh/a;Ljava/lang/Throwable;)V

    goto :goto_f

    :goto_e
    new-instance v1, LIa/b$c$a;

    invoke-direct {v1, p1}, LIa/b$c$a;-><init>(Ljava/lang/String;)V

    invoke-static {v1, v0}, LLa/a;->c(Lmh/a;Ljava/lang/Throwable;)V

    :cond_a
    :goto_f
    move-object v12, v3

    new-instance p1, LLa/b;

    move-object v4, p1

    invoke-direct/range {v4 .. v12}, LLa/b;-><init>(Ljava/net/InetAddress;Ljava/lang/String;Ljava/net/URL;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/TimeZone;)V

    return-object p1

    :cond_b
    invoke-static {v0}, Lcom/ui/speedtest/a;->a(Lspeedtest/SpeedtestError;)Lcom/ui/speedtest/UiSpeedtestLib$Error;

    move-result-object p1

    throw p1

    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LIa/b$c;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LIa/b$c;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LIa/b$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
