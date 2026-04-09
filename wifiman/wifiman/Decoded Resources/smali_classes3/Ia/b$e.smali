.class final LIa/b$e;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIa/b;->a(LIa/k;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LIa/b;

.field final synthetic c:LIa/k;


# direct methods
.method constructor <init>(LIa/b;LIa/k;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LIa/b$e;->b:LIa/b;

    iput-object p2, p0, LIa/b$e;->c:LIa/k;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance p1, LIa/b$e;

    iget-object v0, p0, LIa/b$e;->b:LIa/b;

    iget-object v1, p0, LIa/b$e;->c:LIa/k;

    invoke-direct {p1, v0, v1, p2}, LIa/b$e;-><init>(LIa/b;LIa/k;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LIa/b$e;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, LIa/b$e;->a:I

    if-nez v0, :cond_3

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LIa/b$e;->b:LIa/b;

    iget-object v0, p0, LIa/b$e;->c:LIa/k;

    invoke-static {p1}, LIa/b;->g(LIa/b;)Lspeedtest/SpeedtestApplicationInfo;

    move-result-object v1

    invoke-static {p1, v0, v1}, LIa/b;->e(LIa/b;LIa/k;Lspeedtest/SpeedtestApplicationInfo;)LIa/b$a;

    move-result-object p1

    iget-object v0, p0, LIa/b$e;->c:LIa/k;

    instance-of v0, v0, LIa/k$a;

    if-eqz v0, :cond_2

    iget-object v0, p0, LIa/b$e;->b:LIa/b;

    invoke-static {v0}, LIa/b;->h(LIa/b;)Lspeedtest/DirectoryServerApi;

    move-result-object v1

    invoke-virtual {p1}, LIa/b$a;->a()Lspeedtest/SpeedTestApiTestReportClientInfo;

    move-result-object v2

    iget-object v0, p0, LIa/b$e;->b:LIa/b;

    iget-object v3, p0, LIa/b$e;->c:LIa/k;

    check-cast v3, LIa/k$a;

    invoke-static {v0, v3}, LIa/b;->f(LIa/b;LIa/k$a;)Lspeedtest/SpeedtestApiTestReportLocalParams;

    move-result-object v3

    invoke-virtual {p1}, LIa/b$a;->c()Lspeedtest/Duration;

    move-result-object v4

    invoke-virtual {p1}, LIa/b$a;->b()Lspeedtest/LinkSpeed;

    move-result-object v5

    invoke-virtual {p1}, LIa/b$a;->d()Lspeedtest/LinkSpeed;

    move-result-object v6

    invoke-interface/range {v1 .. v6}, Lspeedtest/DirectoryServerApi;->testReportLocal(Lspeedtest/SpeedTestApiTestReportClientInfo;Lspeedtest/SpeedtestApiTestReportLocalParams;Lspeedtest/Duration;Lspeedtest/LinkSpeed;Lspeedtest/LinkSpeed;)Lspeedtest/SpeedTestApiTestReportResult;

    move-result-object p1

    invoke-virtual {p1}, Lspeedtest/SpeedTestApiTestReportResult;->getErr()Lspeedtest/SpeedtestError;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lspeedtest/SpeedTestApiTestReportResult;->getId()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-static {p1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    new-instance v0, LIa/l;

    invoke-direct {v0, p1}, LIa/l;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_1
    invoke-static {v0}, Lcom/ui/speedtest/a;->a(Lspeedtest/SpeedtestError;)Lcom/ui/speedtest/UiSpeedtestLib$Error;

    move-result-object p1

    throw p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LIa/b$e;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LIa/b$e;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LIa/b$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
