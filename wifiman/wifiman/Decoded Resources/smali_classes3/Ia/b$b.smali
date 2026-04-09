.class final LIa/b$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIa/b;->c(Ldh/e;)Ljava/lang/Object;
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

    iput-object p1, p0, LIa/b$b;->b:LIa/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 1

    new-instance p1, LIa/b$b;

    iget-object v0, p0, LIa/b$b;->b:LIa/b;

    invoke-direct {p1, v0, p2}, LIa/b$b;-><init>(LIa/b;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LIa/b$b;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, LIa/b$b;->a:I

    if-nez v0, :cond_1

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LIa/b$b;->b:LIa/b;

    invoke-static {p1}, LIa/b;->h(LIa/b;)Lspeedtest/DirectoryServerApi;

    move-result-object p1

    invoke-interface {p1}, Lspeedtest/DirectoryServerApi;->authenticate()Lspeedtest/SpeedtestApiAuthenticateResult;

    move-result-object p1

    invoke-virtual {p1}, Lspeedtest/SpeedtestApiAuthenticateResult;->getErr()Lspeedtest/SpeedtestError;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, LIa/a$c;

    invoke-virtual {p1}, Lspeedtest/SpeedtestApiAuthenticateResult;->getToken()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "result.token"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lspeedtest/SpeedtestApiAuthenticateResult;->getTTL()I

    move-result p1

    invoke-direct {v0, v1, p1}, LIa/a$c;-><init>(Ljava/lang/String;I)V

    return-object v0

    :cond_0
    invoke-static {v0}, Lcom/ui/speedtest/a;->a(Lspeedtest/SpeedtestError;)Lcom/ui/speedtest/UiSpeedtestLib$Error;

    move-result-object p1

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LIa/b$b;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LIa/b$b;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LIa/b$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
