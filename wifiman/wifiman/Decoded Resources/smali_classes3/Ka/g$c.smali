.class final LKa/g$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LKa/g;->c(Ljava/lang/String;Ldh/e;)Ljava/lang/Object;
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

    iput-object p1, p0, LKa/g$c;->b:LKa/g;

    iput-object p2, p0, LKa/g$c;->c:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance p1, LKa/g$c;

    iget-object v0, p0, LKa/g$c;->b:LKa/g;

    iget-object v1, p0, LKa/g$c;->c:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2}, LKa/g$c;-><init>(LKa/g;Ljava/lang/String;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LKa/g$c;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, LKa/g$c;->a:I

    if-nez v0, :cond_2

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LKa/g$c;->b:LKa/g;

    invoke-static {p1}, LKa/g;->g(LKa/g;)Lspeedtest/HttpSpeedtestServerApi;

    move-result-object p1

    iget-object v0, p0, LKa/g$c;->c:Ljava/lang/String;

    invoke-interface {p1, v0}, Lspeedtest/HttpSpeedtestServerApi;->serverHandshake(Ljava/lang/String;)Lspeedtest/SpeedServerHandshakeResult;

    move-result-object p1

    invoke-virtual {p1}, Lspeedtest/SpeedServerHandshakeResult;->getError()Lspeedtest/SpeedtestError;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string/jumbo v1, "error"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/ui/speedtest/a;->a(Lspeedtest/SpeedtestError;)Lcom/ui/speedtest/UiSpeedtestLib$Error;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    throw v0

    :cond_1
    :goto_0
    new-instance v0, LKa/f$b;

    invoke-virtual {p1}, Lspeedtest/SpeedServerHandshakeResult;->getVersion()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, LKa/f$b;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LKa/g$c;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LKa/g$c;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LKa/g$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
