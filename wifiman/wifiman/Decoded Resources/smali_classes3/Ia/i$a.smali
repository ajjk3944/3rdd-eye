.class final LIa/i$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIa/i;->a(Lspeedtest/DirectoryServerApi;LIa/d;)LLi/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Lspeedtest/DirectoryServerApi;

.field final synthetic d:LIa/d;


# direct methods
.method constructor <init>(Lspeedtest/DirectoryServerApi;LIa/d;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LIa/i$a;->c:Lspeedtest/DirectoryServerApi;

    iput-object p2, p0, LIa/i$a;->d:LIa/d;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method

.method public static synthetic n(Lspeedtest/InternetServersEvaluation;LKi/t;)V
    .locals 0

    invoke-static {p0, p1}, LIa/i$a;->t(Lspeedtest/InternetServersEvaluation;LKi/t;)V

    return-void
.end method

.method private static final t(Lspeedtest/InternetServersEvaluation;LKi/t;)V
    .locals 14

    invoke-virtual {p0}, Lspeedtest/InternetServersEvaluation;->getError()Lspeedtest/SpeedtestError;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lspeedtest/InternetServersEvaluation;->getError()Lspeedtest/SpeedtestError;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-virtual {p0}, Lspeedtest/InternetServersEvaluation;->getError()Lspeedtest/SpeedtestError;

    move-result-object p0

    const-string/jumbo v0, "check.error"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/ui/speedtest/a;->a(Lspeedtest/SpeedtestError;)Lcom/ui/speedtest/UiSpeedtestLib$Error;

    move-result-object p0

    invoke-interface {p1, p0}, LKi/w;->f(Ljava/lang/Throwable;)Z

    goto/16 :goto_6

    :cond_0
    invoke-virtual {p0}, Lspeedtest/InternetServersEvaluation;->getState()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_1

    sget-object v0, LIa/f;->IDLE:LIa/f;

    goto :goto_0

    :cond_1
    const-wide/16 v2, 0x1

    cmp-long v2, v0, v2

    if-nez v2, :cond_2

    sget-object v0, LIa/f;->SERVER_FETCH:LIa/f;

    goto :goto_0

    :cond_2
    const-wide/16 v2, 0x2

    cmp-long v2, v0, v2

    if-nez v2, :cond_3

    sget-object v0, LIa/f;->LATENCY_CHECK:LIa/f;

    goto :goto_0

    :cond_3
    const-wide/16 v2, 0x3

    cmp-long v0, v0, v2

    if-nez v0, :cond_d

    sget-object v0, LIa/f;->FINISHED:LIa/f;

    :goto_0
    const/4 v1, 0x0

    invoke-virtual {p0}, Lspeedtest/InternetServersEvaluation;->size()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lsh/m;->t(IJ)Lsh/l;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_b

    move-object v3, v1

    check-cast v3, LZg/S;

    invoke-virtual {v3}, LZg/S;->d()J

    move-result-wide v5

    invoke-virtual {p0, v5, v6}, Lspeedtest/InternetServersEvaluation;->get(J)Lspeedtest/SpeedServerStatus;

    move-result-object v3

    if-eqz v3, :cond_a

    const-string/jumbo v5, "get(i)"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Lspeedtest/SpeedServerStatus;->getServer()Lspeedtest/InternetSpeedTestServer;

    move-result-object v5

    const-string/jumbo v6, "serverStatus.server"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5}, LIa/j;->a(Lspeedtest/InternetSpeedTestServer;)LIa/c;

    move-result-object v5

    if-nez v5, :cond_5

    goto/16 :goto_5

    :cond_5
    invoke-virtual {v3}, Lspeedtest/SpeedServerStatus;->getServer()Lspeedtest/InternetSpeedTestServer;

    move-result-object v6

    invoke-virtual {v6}, Lspeedtest/InternetSpeedTestServer;->getURL()Ljava/lang/String;

    move-result-object v8

    const-string/jumbo v6, "serverStatus.server.url"

    invoke-static {v8, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Lspeedtest/SpeedServerStatus;->getEvaluation()Lspeedtest/SpeedtestServerEvaluation;

    move-result-object v6

    invoke-virtual {v6}, Lspeedtest/SpeedtestServerEvaluation;->getVersion()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_6

    const-string/jumbo v7, "version"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_6

    move-object v9, v6

    goto :goto_2

    :cond_6
    move-object v9, v4

    :goto_2
    invoke-virtual {v3}, Lspeedtest/SpeedServerStatus;->getEvaluation()Lspeedtest/SpeedtestServerEvaluation;

    move-result-object v6

    invoke-virtual {v6}, Lspeedtest/SpeedtestServerEvaluation;->getLatency()Lspeedtest/Duration;

    move-result-object v6

    if-eqz v6, :cond_7

    invoke-virtual {v6}, Lspeedtest/Duration;->getMs()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    move-object v10, v6

    goto :goto_3

    :cond_7
    move-object v10, v4

    :goto_3
    invoke-virtual {v3}, Lspeedtest/SpeedServerStatus;->getEvaluation()Lspeedtest/SpeedtestServerEvaluation;

    move-result-object v6

    invoke-virtual {v6}, Lspeedtest/SpeedtestServerEvaluation;->getJitter()Lspeedtest/Duration;

    move-result-object v6

    if-eqz v6, :cond_8

    invoke-virtual {v6}, Lspeedtest/Duration;->getMs()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    move-object v11, v6

    goto :goto_4

    :cond_8
    move-object v11, v4

    :goto_4
    invoke-virtual {v3}, Lspeedtest/SpeedServerStatus;->getEvaluation()Lspeedtest/SpeedtestServerEvaluation;

    move-result-object v6

    invoke-virtual {v6}, Lspeedtest/SpeedtestServerEvaluation;->getPacketLoss()Z

    move-result v12

    invoke-virtual {v3}, Lspeedtest/SpeedServerStatus;->getEvaluation()Lspeedtest/SpeedtestServerEvaluation;

    move-result-object v3

    invoke-virtual {v3}, Lspeedtest/SpeedtestServerEvaluation;->getErr()Lspeedtest/SpeedtestError;

    move-result-object v3

    if-eqz v3, :cond_9

    const-string/jumbo v4, "err"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Lcom/ui/speedtest/a;->a(Lspeedtest/SpeedtestError;)Lcom/ui/speedtest/UiSpeedtestLib$Error;

    move-result-object v4

    :cond_9
    move-object v13, v4

    new-instance v3, LLa/e;

    move-object v7, v3

    invoke-direct/range {v7 .. v13}, LLa/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;ZLcom/ui/speedtest/UiSpeedtestLib$Error;)V

    new-instance v4, LIa/e;

    invoke-direct {v4, v5, v3}, LIa/e;-><init>(LIa/c;LLa/e;)V

    :cond_a
    :goto_5
    if-eqz v4, :cond_4

    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_b
    new-instance p0, LIa/g;

    invoke-direct {p0, v0, v2}, LIa/g;-><init>(LIa/f;Ljava/util/List;)V

    invoke-interface {p1, p0}, LKi/w;->k(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, LIa/g;->b()LIa/f;

    move-result-object p0

    sget-object v0, LIa/f;->FINISHED:LIa/f;

    if-ne p0, v0, :cond_c

    const/4 p0, 0x1

    invoke-static {p1, v4, p0, v4}, LKi/w$a;->a(LKi/w;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    :cond_c
    :goto_6
    return-void

    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Lspeedtest/InternetServersEvaluation;->getState()J

    move-result-wide v0

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Unknown server check state "

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance v0, LIa/i$a;

    iget-object v1, p0, LIa/i$a;->c:Lspeedtest/DirectoryServerApi;

    iget-object v2, p0, LIa/i$a;->d:LIa/d;

    invoke-direct {v0, v1, v2, p2}, LIa/i$a;-><init>(Lspeedtest/DirectoryServerApi;LIa/d;Ldh/e;)V

    iput-object p1, v0, LIa/i$a;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LKi/t;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LIa/i$a;->o(LKi/t;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LIa/i$a;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LIa/i$a;->b:Ljava/lang/Object;

    check-cast p1, LKi/t;

    iget-object v1, p0, LIa/i$a;->c:Lspeedtest/DirectoryServerApi;

    new-instance v3, Lspeedtest/InternetServersEvaluationParams;

    invoke-direct {v3}, Lspeedtest/InternetServersEvaluationParams;-><init>()V

    iget-object v4, p0, LIa/i$a;->d:LIa/d;

    invoke-virtual {v4}, LIa/d;->a()LIa/d$a;

    move-result-object v5

    if-eqz v5, :cond_2

    new-instance v5, Lspeedtest/LocationCoordinates;

    invoke-direct {v5}, Lspeedtest/LocationCoordinates;-><init>()V

    invoke-virtual {v4}, LIa/d;->a()LIa/d$a;

    move-result-object v6

    invoke-virtual {v6}, LIa/d$a;->a()D

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Lspeedtest/LocationCoordinates;->setLatitude(D)V

    invoke-virtual {v4}, LIa/d;->a()LIa/d$a;

    move-result-object v4

    invoke-virtual {v4}, LIa/d$a;->b()D

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Lspeedtest/LocationCoordinates;->setLongitude(D)V

    invoke-virtual {v3, v5}, Lspeedtest/InternetServersEvaluationParams;->setCoordinates(Lspeedtest/LocationCoordinates;)V

    :cond_2
    invoke-interface {v1, v3}, Lspeedtest/DirectoryServerApi;->getInternetServers(Lspeedtest/InternetServersEvaluationParams;)Lspeedtest/InternetServersEvaluation;

    move-result-object v1

    new-instance v3, LIa/h;

    invoke-direct {v3, v1, p1}, LIa/h;-><init>(Lspeedtest/InternetServersEvaluation;LKi/t;)V

    invoke-virtual {v1, v3}, Lspeedtest/InternetServersEvaluation;->start(Lspeedtest/ChangedCallback;)V

    new-instance v3, LIa/i$a$a;

    invoke-direct {v3, v1}, LIa/i$a$a;-><init>(Lspeedtest/InternetServersEvaluation;)V

    iput v2, p0, LIa/i$a;->a:I

    invoke-static {p1, v3, p0}, LKi/r;->a(LKi/t;Lmh/a;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final o(LKi/t;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LIa/i$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LIa/i$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LIa/i$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
