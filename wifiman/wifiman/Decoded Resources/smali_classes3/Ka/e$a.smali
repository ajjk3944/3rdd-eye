.class final LKa/e$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LKa/e;->a(Lmh/a;)LLi/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Lmh/a;


# direct methods
.method constructor <init>(Lmh/a;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LKa/e$a;->c:Lmh/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method

.method public static synthetic n(LKi/t;JJJJLspeedtest/SpeedtestError;)V
    .locals 0

    invoke-static/range {p0 .. p9}, LKa/e$a;->t(LKi/t;JJJJLspeedtest/SpeedtestError;)V

    return-void
.end method

.method private static final t(LKi/t;JJJJLspeedtest/SpeedtestError;)V
    .locals 11

    move-object v0, p0

    move-wide v1, p1

    if-eqz p9, :cond_0

    invoke-static/range {p9 .. p9}, Lcom/ui/speedtest/a;->a(Lspeedtest/SpeedtestError;)Lcom/ui/speedtest/UiSpeedtestLib$Error;

    move-result-object v1

    invoke-interface {p0, v1}, LKi/w;->f(Ljava/lang/Throwable;)Z

    goto :goto_2

    :cond_0
    new-instance v10, LKa/c;

    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    if-nez v3, :cond_1

    sget-object v1, LKa/b;->IDLE:LKa/b;

    :goto_0
    move-object v3, v1

    goto :goto_1

    :cond_1
    const-wide/16 v3, 0x1

    cmp-long v3, v1, v3

    if-nez v3, :cond_2

    sget-object v1, LKa/b;->STARTED:LKa/b;

    goto :goto_0

    :cond_2
    const-wide/16 v3, 0x2

    cmp-long v3, v1, v3

    if-nez v3, :cond_4

    sget-object v1, LKa/b;->FINISHED:LKa/b;

    goto :goto_0

    :goto_1
    move-object v2, v10

    move-wide v4, p3

    move-wide/from16 v6, p5

    move-wide/from16 v8, p7

    invoke-direct/range {v2 .. v9}, LKa/c;-><init>(LKa/b;JJJ)V

    invoke-interface {p0, v10}, LKi/w;->k(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v10}, LKa/c;->b()LKa/b;

    move-result-object v1

    sget-object v2, LKa/b;->FINISHED:LKa/b;

    if-ne v1, v2, :cond_3

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p0, v2, v1, v2}, LKi/w$a;->a(LKi/w;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    :cond_3
    :goto_2
    return-void

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "Unknown test state "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance v0, LKa/e$a;

    iget-object v1, p0, LKa/e$a;->c:Lmh/a;

    invoke-direct {v0, v1, p2}, LKa/e$a;-><init>(Lmh/a;Ldh/e;)V

    iput-object p1, v0, LKa/e$a;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LKi/t;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LKa/e$a;->o(LKi/t;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LKa/e$a;->a:I

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

    iget-object p1, p0, LKa/e$a;->b:Ljava/lang/Object;

    check-cast p1, LKi/t;

    iget-object v1, p0, LKa/e$a;->c:Lmh/a;

    invoke-interface {v1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lspeedtest/Speedtest_;

    new-instance v3, LKa/d;

    invoke-direct {v3, p1}, LKa/d;-><init>(LKi/t;)V

    invoke-virtual {v1, v3}, Lspeedtest/Speedtest_;->start(Lspeedtest/SpeedtestStatusCallback;)V

    new-instance v3, LKa/e$a$a;

    invoke-direct {v3, v1}, LKa/e$a$a;-><init>(Lspeedtest/Speedtest_;)V

    iput v2, p0, LKa/e$a;->a:I

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

    invoke-virtual {p0, p1, p2}, LKa/e$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LKa/e$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LKa/e$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
