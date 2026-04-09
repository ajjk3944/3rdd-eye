.class final LJa/c$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJa/c;->start()LLi/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:LJa/c;


# direct methods
.method constructor <init>(LJa/c;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LJa/c$a;->c:LJa/c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method

.method public static synthetic n(Lspeedtest/SpeedtestServer;LKi/t;)V
    .locals 0

    invoke-static {p0, p1}, LJa/c$a;->t(Lspeedtest/SpeedtestServer;LKi/t;)V

    return-void
.end method

.method private static final t(Lspeedtest/SpeedtestServer;LKi/t;)V
    .locals 6

    invoke-virtual {p0}, Lspeedtest/SpeedtestServer;->getStatus()Lspeedtest/SpeedtestServerStatus;

    move-result-object p0

    invoke-virtual {p0}, Lspeedtest/SpeedtestServerStatus;->getErr()Lspeedtest/SpeedtestError;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lspeedtest/SpeedtestServerStatus;->getErr()Lspeedtest/SpeedtestError;

    move-result-object p0

    if-eqz p0, :cond_6

    invoke-static {p0}, Lcom/ui/speedtest/a;->a(Lspeedtest/SpeedtestError;)Lcom/ui/speedtest/UiSpeedtestLib$Error;

    move-result-object p0

    invoke-interface {p1, p0}, LKi/w;->f(Ljava/lang/Throwable;)Z

    goto :goto_2

    :cond_0
    invoke-virtual {p0}, Lspeedtest/SpeedtestServerStatus;->getState()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    sget-object v0, LJa/a$c;->OFF:LJa/a$c;

    goto :goto_0

    :cond_1
    const-wide/16 v4, 0x1

    cmp-long v4, v0, v4

    if-nez v4, :cond_2

    sget-object v0, LJa/a$c;->STARTING:LJa/a$c;

    goto :goto_0

    :cond_2
    const-wide/16 v4, 0x2

    cmp-long v4, v0, v4

    if-nez v4, :cond_3

    sget-object v0, LJa/a$c;->IDLE:LJa/a$c;

    goto :goto_0

    :cond_3
    const-wide/16 v4, 0x3

    cmp-long v0, v0, v4

    if-nez v0, :cond_7

    sget-object v0, LJa/a$c;->ACTIVE:LJa/a$c;

    :goto_0
    invoke-virtual {p0}, Lspeedtest/SpeedtestServerStatus;->getPort()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    cmp-long v2, v4, v2

    const/4 v3, 0x0

    if-eqz v2, :cond_4

    goto :goto_1

    :cond_4
    move-object v1, v3

    :goto_1
    if-eqz v1, :cond_5

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    :cond_5
    invoke-virtual {p0}, Lspeedtest/SpeedtestServerStatus;->getConnectionCount()J

    move-result-wide v1

    long-to-int p0, v1

    new-instance v1, LJa/a$d;

    invoke-direct {v1, v0, v3, p0}, LJa/a$d;-><init>(LJa/a$c;Ljava/lang/Integer;I)V

    invoke-interface {p1, v1}, LKi/w;->k(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    :goto_2
    return-void

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Lspeedtest/SpeedtestServerStatus;->getState()J

    move-result-wide v0

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Unknown server state "

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance v0, LJa/c$a;

    iget-object v1, p0, LJa/c$a;->c:LJa/c;

    invoke-direct {v0, v1, p2}, LJa/c$a;-><init>(LJa/c;Ldh/e;)V

    iput-object p1, v0, LJa/c$a;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LKi/t;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LJa/c$a;->o(LKi/t;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LJa/c$a;->a:I

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

    iget-object p1, p0, LJa/c$a;->b:Ljava/lang/Object;

    check-cast p1, LKi/t;

    iget-object v1, p0, LJa/c$a;->c:LJa/c;

    invoke-virtual {v1}, LJa/c;->c()LJa/a$b;

    move-result-object v3

    invoke-static {v1, v3}, LJa/c;->a(LJa/c;LJa/a$b;)Lspeedtest/SpeedtestServerParams;

    move-result-object v1

    invoke-static {v1}, Lspeedtest/Speedtest;->newSpeedtestServer(Lspeedtest/SpeedtestServerParams;)Lspeedtest/SpeedtestServer;

    move-result-object v1

    new-instance v3, LJa/b;

    invoke-direct {v3, v1, p1}, LJa/b;-><init>(Lspeedtest/SpeedtestServer;LKi/t;)V

    invoke-virtual {v1, v3}, Lspeedtest/SpeedtestServer;->start(Lspeedtest/ChangedCallback;)V

    new-instance v3, LJa/c$a$a;

    invoke-direct {v3, v1}, LJa/c$a$a;-><init>(Lspeedtest/SpeedtestServer;)V

    iput v2, p0, LJa/c$a;->a:I

    invoke-static {p1, v3, p0}, LKi/r;->a(LKi/t;Lmh/a;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final o(LKi/t;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LJa/c$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LJa/c$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LJa/c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
