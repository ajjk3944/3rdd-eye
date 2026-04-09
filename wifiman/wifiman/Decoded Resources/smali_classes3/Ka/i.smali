.class public final LKa/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKa/h$a;


# instance fields
.field private final a:LYg/m;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, LKa/i$a;->a:LKa/i$a;

    invoke-static {v0}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LKa/i;->a:LYg/m;

    return-void
.end method

.method public static final synthetic e(LKa/i;LKa/h$b;)Lspeedtest/SpeedtestParams;
    .locals 0

    invoke-direct {p0, p1}, LKa/i;->g(LKa/h$b;)Lspeedtest/SpeedtestParams;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(LKa/i;)Lspeedtest/TcpSpeedtestServerApi;
    .locals 0

    invoke-direct {p0}, LKa/i;->h()Lspeedtest/TcpSpeedtestServerApi;

    move-result-object p0

    return-object p0
.end method

.method private final g(LKa/h$b;)Lspeedtest/SpeedtestParams;
    .locals 6

    invoke-virtual {p1}, LKa/h$b;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, LKa/h$b;->d()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {p1}, LKa/h$b;->c()J

    move-result-wide v3

    invoke-virtual {p1}, LKa/h$b;->a()Z

    move-result v5

    invoke-static/range {v0 .. v5}, Lspeedtest/Speedtest;->newTcpSpeedtestParams(Ljava/lang/String;JJZ)Lspeedtest/TcpSpeedTestParamsLocal;

    move-result-object p1

    const-string/jumbo v0, "newTcpSpeedtestParams(ho\u2026encyMs, durationInfinite)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final h()Lspeedtest/TcpSpeedtestServerApi;
    .locals 2

    iget-object v0, p0, LKa/i;->a:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-goApi>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lspeedtest/TcpSpeedtestServerApi;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)LLi/g;
    .locals 0

    check-cast p1, LKa/h$b;

    invoke-virtual {p0, p1}, LKa/i;->i(LKa/h$b;)LLi/g;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/String;Ldh/e;)Ljava/lang/Object;
    .locals 10

    invoke-direct {p0}, LKa/i;->h()Lspeedtest/TcpSpeedtestServerApi;

    move-result-object p2

    new-instance v0, Lspeedtest/SpeedtestServerEvaluationParams;

    invoke-direct {v0}, Lspeedtest/SpeedtestServerEvaluationParams;-><init>()V

    invoke-virtual {v0, p1}, Lspeedtest/SpeedtestServerEvaluationParams;->setUrl(Ljava/lang/String;)V

    invoke-interface {p2, v0}, Lspeedtest/TcpSpeedtestServerApi;->evaluate(Lspeedtest/SpeedtestServerEvaluationParams;)Lspeedtest/SpeedtestServerEvaluation;

    move-result-object p2

    invoke-virtual {p2}, Lspeedtest/SpeedtestServerEvaluation;->getErr()Lspeedtest/SpeedtestError;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string/jumbo v1, "err"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/ui/speedtest/a;->a(Lspeedtest/SpeedtestError;)Lcom/ui/speedtest/UiSpeedtestLib$Error;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    throw v0

    :cond_1
    :goto_0
    invoke-virtual {p2}, Lspeedtest/SpeedtestServerEvaluation;->getVersion()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    const-string/jumbo v2, "version"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    move-object v5, v0

    goto :goto_1

    :cond_2
    move-object v5, v1

    :goto_1
    invoke-virtual {p2}, Lspeedtest/SpeedtestServerEvaluation;->getLatency()Lspeedtest/Duration;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lspeedtest/Duration;->getMs()J

    move-result-wide v2

    invoke-static {v2, v3}, Lkotlin/coroutines/jvm/internal/b;->e(J)Ljava/lang/Long;

    move-result-object v0

    move-object v6, v0

    goto :goto_2

    :cond_3
    move-object v6, v1

    :goto_2
    invoke-virtual {p2}, Lspeedtest/SpeedtestServerEvaluation;->getJitter()Lspeedtest/Duration;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lspeedtest/Duration;->getMs()J

    move-result-wide v0

    invoke-static {v0, v1}, Lkotlin/coroutines/jvm/internal/b;->e(J)Ljava/lang/Long;

    move-result-object v1

    :cond_4
    move-object v7, v1

    invoke-virtual {p2}, Lspeedtest/SpeedtestServerEvaluation;->getPacketLoss()Z

    move-result v8

    new-instance p2, LLa/e;

    const/4 v9, 0x0

    move-object v3, p2

    move-object v4, p1

    invoke-direct/range {v3 .. v9}, LLa/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;ZLcom/ui/speedtest/UiSpeedtestLib$Error;)V

    return-object p2
.end method

.method public bridge synthetic d(Ljava/lang/Object;)LLi/g;
    .locals 0

    check-cast p1, LKa/h$b;

    invoke-virtual {p0, p1}, LKa/i;->j(LKa/h$b;)LLi/g;

    move-result-object p1

    return-object p1
.end method

.method public i(LKa/h$b;)LLi/g;
    .locals 1

    const-string/jumbo v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LKa/i$b;

    invoke-direct {v0, p0, p1}, LKa/i$b;-><init>(LKa/i;LKa/h$b;)V

    invoke-static {v0}, LKa/e;->a(Lmh/a;)LLi/g;

    move-result-object p1

    return-object p1
.end method

.method public j(LKa/h$b;)LLi/g;
    .locals 1

    const-string/jumbo v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LKa/i$c;

    invoke-direct {v0, p0, p1}, LKa/i$c;-><init>(LKa/i;LKa/h$b;)V

    invoke-static {v0}, LKa/e;->a(Lmh/a;)LLi/g;

    move-result-object p1

    return-object p1
.end method
