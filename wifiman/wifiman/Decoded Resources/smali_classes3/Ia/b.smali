.class public final LIa/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LIa/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LIa/b$a;
    }
.end annotation


# instance fields
.field private final b:Lspeedtest/SpeedtestApplicationInfo;

.field private final c:LYg/m;


# direct methods
.method public constructor <init>(Ljava/lang/String;LLa/c;LIa/a$b;)V
    .locals 1

    const-string/jumbo v0, "clientApp"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "environment"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2}, LLa/d;->a(LLa/c;)Lspeedtest/SpeedtestApplicationInfo;

    move-result-object p2

    iput-object p2, p0, LIa/b;->b:Lspeedtest/SpeedtestApplicationInfo;

    new-instance p2, LIa/b$d;

    invoke-direct {p2, p1, p0, p3}, LIa/b$d;-><init>(Ljava/lang/String;LIa/b;LIa/a$b;)V

    invoke-static {p2}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LIa/b;->c:LYg/m;

    return-void
.end method

.method public static final synthetic e(LIa/b;LIa/k;Lspeedtest/SpeedtestApplicationInfo;)LIa/b$a;
    .locals 0

    invoke-direct {p0, p1, p2}, LIa/b;->i(LIa/k;Lspeedtest/SpeedtestApplicationInfo;)LIa/b$a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(LIa/b;LIa/k$a;)Lspeedtest/SpeedtestApiTestReportLocalParams;
    .locals 0

    invoke-direct {p0, p1}, LIa/b;->j(LIa/k$a;)Lspeedtest/SpeedtestApiTestReportLocalParams;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(LIa/b;)Lspeedtest/SpeedtestApplicationInfo;
    .locals 0

    iget-object p0, p0, LIa/b;->b:Lspeedtest/SpeedtestApplicationInfo;

    return-object p0
.end method

.method public static final synthetic h(LIa/b;)Lspeedtest/DirectoryServerApi;
    .locals 0

    invoke-direct {p0}, LIa/b;->k()Lspeedtest/DirectoryServerApi;

    move-result-object p0

    return-object p0
.end method

.method private final i(LIa/k;Lspeedtest/SpeedtestApplicationInfo;)LIa/b$a;
    .locals 5

    new-instance v0, Lspeedtest/SpeedTestApiTestReportClientInfo;

    invoke-direct {v0}, Lspeedtest/SpeedTestApiTestReportClientInfo;-><init>()V

    const-string/jumbo v1, "mobile"

    invoke-virtual {v0, v1}, Lspeedtest/SpeedTestApiTestReportClientInfo;->setSource(Ljava/lang/String;)V

    const-string/jumbo v1, "android"

    invoke-virtual {v0, v1}, Lspeedtest/SpeedTestApiTestReportClientInfo;->setPlatform(Ljava/lang/String;)V

    invoke-virtual {p2}, Lspeedtest/SpeedtestApplicationInfo;->getAppName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lspeedtest/SpeedTestApiTestReportClientInfo;->setAppName(Ljava/lang/String;)V

    invoke-virtual {p2}, Lspeedtest/SpeedtestApplicationInfo;->getAppVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lspeedtest/SpeedTestApiTestReportClientInfo;->setAppVersion(Ljava/lang/String;)V

    invoke-virtual {p2}, Lspeedtest/SpeedtestApplicationInfo;->getOs()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lspeedtest/SpeedTestApiTestReportClientInfo;->setOs(Ljava/lang/String;)V

    invoke-virtual {p2}, Lspeedtest/SpeedtestApplicationInfo;->getOsVersion()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lspeedtest/SpeedTestApiTestReportClientInfo;->setOsVersion(Ljava/lang/String;)V

    sget-object p2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v0, p2}, Lspeedtest/SpeedTestApiTestReportClientInfo;->setDeviceModel(Ljava/lang/String;)V

    sget-object p2, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v0, p2}, Lspeedtest/SpeedTestApiTestReportClientInfo;->setDeviceManufacturer(Ljava/lang/String;)V

    invoke-virtual {p1}, LIa/k;->b()Ljava/lang/Long;

    move-result-object p2

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    new-instance p2, Lspeedtest/Duration;

    invoke-direct {p2}, Lspeedtest/Duration;-><init>()V

    invoke-virtual {p2, v2, v3}, Lspeedtest/Duration;->setMs(J)V

    goto :goto_0

    :cond_0
    move-object p2, v1

    :goto_0
    invoke-virtual {p1}, LIa/k;->a()Ljava/lang/Long;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    new-instance v4, Lspeedtest/LinkSpeed;

    invoke-direct {v4}, Lspeedtest/LinkSpeed;-><init>()V

    invoke-virtual {v4, v2, v3}, Lspeedtest/LinkSpeed;->setBps(J)V

    goto :goto_1

    :cond_1
    move-object v4, v1

    :goto_1
    invoke-virtual {p1}, LIa/k;->c()Ljava/lang/Long;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    new-instance p1, Lspeedtest/LinkSpeed;

    invoke-direct {p1}, Lspeedtest/LinkSpeed;-><init>()V

    invoke-virtual {p1, v1, v2}, Lspeedtest/LinkSpeed;->setBps(J)V

    move-object v1, p1

    :cond_2
    new-instance p1, LIa/b$a;

    invoke-direct {p1, v0, p2, v4, v1}, LIa/b$a;-><init>(Lspeedtest/SpeedTestApiTestReportClientInfo;Lspeedtest/Duration;Lspeedtest/LinkSpeed;Lspeedtest/LinkSpeed;)V

    return-object p1
.end method

.method private final j(LIa/k$a;)Lspeedtest/SpeedtestApiTestReportLocalParams;
    .locals 4

    new-instance v0, Lspeedtest/SpeedtestApiTestReportLocalParams;

    invoke-direct {v0}, Lspeedtest/SpeedtestApiTestReportLocalParams;-><init>()V

    invoke-virtual {p1}, LIa/k$a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lspeedtest/SpeedtestApiTestReportLocalParams;->setFrom(Ljava/lang/String;)V

    invoke-virtual {p1}, LIa/k$a;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lspeedtest/SpeedtestApiTestReportLocalParams;->setTo(Ljava/lang/String;)V

    invoke-virtual {p1}, LIa/k$a;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lspeedtest/SpeedtestApiTestReportLocalParams;->setApModel(Ljava/lang/String;)V

    invoke-virtual {p1}, LIa/k$a;->f()Ljava/lang/Double;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, LIa/k$a;->g()Ljava/lang/Double;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v1, Lspeedtest/LocationCoordinates;

    invoke-direct {v1}, Lspeedtest/LocationCoordinates;-><init>()V

    invoke-virtual {p1}, LIa/k$a;->f()Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lspeedtest/LocationCoordinates;->setLatitude(D)V

    invoke-virtual {p1}, LIa/k$a;->g()Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lspeedtest/LocationCoordinates;->setLongitude(D)V

    invoke-virtual {v0, v1}, Lspeedtest/SpeedtestApiTestReportLocalParams;->setCoordinates(Lspeedtest/LocationCoordinates;)V

    :cond_0
    return-object v0
.end method

.method private final k()Lspeedtest/DirectoryServerApi;
    .locals 2

    iget-object v0, p0, LIa/b;->c:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-goApi>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lspeedtest/DirectoryServerApi;

    return-object v0
.end method


# virtual methods
.method public a(LIa/k;Ldh/e;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, LIi/c0;->b()LIi/J;

    move-result-object v0

    new-instance v1, LIa/b$e;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, LIa/b$e;-><init>(LIa/b;LIa/k;Ldh/e;)V

    invoke-static {v0, v1, p2}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(Ldh/e;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, LIi/c0;->b()LIi/J;

    move-result-object v0

    new-instance v1, LIa/b$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, LIa/b$c;-><init>(LIa/b;Ldh/e;)V

    invoke-static {v0, v1, p1}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public c(Ldh/e;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, LIi/c0;->b()LIi/J;

    move-result-object v0

    new-instance v1, LIa/b$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, LIa/b$b;-><init>(LIa/b;Ldh/e;)V

    invoke-static {v0, v1, p1}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public d(LIa/d;)LLi/g;
    .locals 1

    const-string/jumbo v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LIa/b;->k()Lspeedtest/DirectoryServerApi;

    move-result-object v0

    invoke-static {v0, p1}, LIa/i;->a(Lspeedtest/DirectoryServerApi;LIa/d;)LLi/g;

    move-result-object p1

    return-object p1
.end method
