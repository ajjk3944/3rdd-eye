.class final LKa/g$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LKa/g;->b(Ljava/lang/String;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LKa/g;

.field final synthetic c:Ljava/lang/String;


# direct methods
.method constructor <init>(LKa/g;Ljava/lang/String;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LKa/g$a;->b:LKa/g;

    iput-object p2, p0, LKa/g$a;->c:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance p1, LKa/g$a;

    iget-object v0, p0, LKa/g$a;->b:LKa/g;

    iget-object v1, p0, LKa/g$a;->c:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2}, LKa/g$a;-><init>(LKa/g;Ljava/lang/String;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LKa/g$a;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, LKa/g$a;->a:I

    if-nez v0, :cond_5

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LKa/g$a;->b:LKa/g;

    invoke-static {p1}, LKa/g;->g(LKa/g;)Lspeedtest/HttpSpeedtestServerApi;

    move-result-object p1

    new-instance v0, Lspeedtest/SpeedtestServerEvaluationParams;

    invoke-direct {v0}, Lspeedtest/SpeedtestServerEvaluationParams;-><init>()V

    iget-object v1, p0, LKa/g$a;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lspeedtest/SpeedtestServerEvaluationParams;->setUrl(Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lspeedtest/HttpSpeedtestServerApi;->evaluate(Lspeedtest/SpeedtestServerEvaluationParams;)Lspeedtest/SpeedtestServerEvaluation;

    move-result-object p1

    iget-object v1, p0, LKa/g$a;->c:Ljava/lang/String;

    invoke-virtual {p1}, Lspeedtest/SpeedtestServerEvaluation;->getErr()Lspeedtest/SpeedtestError;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string/jumbo v2, "err"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/ui/speedtest/a;->a(Lspeedtest/SpeedtestError;)Lcom/ui/speedtest/UiSpeedtestLib$Error;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    throw v0

    :cond_1
    :goto_0
    invoke-virtual {p1}, Lspeedtest/SpeedtestServerEvaluation;->getVersion()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    const-string/jumbo v3, "version"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_2

    move-object v3, v0

    goto :goto_1

    :cond_2
    move-object v3, v2

    :goto_1
    invoke-virtual {p1}, Lspeedtest/SpeedtestServerEvaluation;->getLatency()Lspeedtest/Duration;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lspeedtest/Duration;->getMs()J

    move-result-wide v4

    invoke-static {v4, v5}, Lkotlin/coroutines/jvm/internal/b;->e(J)Ljava/lang/Long;

    move-result-object v0

    move-object v4, v0

    goto :goto_2

    :cond_3
    move-object v4, v2

    :goto_2
    invoke-virtual {p1}, Lspeedtest/SpeedtestServerEvaluation;->getJitter()Lspeedtest/Duration;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lspeedtest/Duration;->getMs()J

    move-result-wide v5

    invoke-static {v5, v6}, Lkotlin/coroutines/jvm/internal/b;->e(J)Ljava/lang/Long;

    move-result-object v0

    move-object v5, v0

    goto :goto_3

    :cond_4
    move-object v5, v2

    :goto_3
    invoke-virtual {p1}, Lspeedtest/SpeedtestServerEvaluation;->getPacketLoss()Z

    move-result p1

    new-instance v7, LLa/e;

    const/4 v6, 0x0

    move-object v0, v7

    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    move v5, p1

    invoke-direct/range {v0 .. v6}, LLa/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;ZLcom/ui/speedtest/UiSpeedtestLib$Error;)V

    return-object v7

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LKa/g$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LKa/g$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LKa/g$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
