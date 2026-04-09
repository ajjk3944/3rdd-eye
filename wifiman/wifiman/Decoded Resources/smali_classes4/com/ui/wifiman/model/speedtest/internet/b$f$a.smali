.class final Lcom/ui/wifiman/model/speedtest/internet/b$f$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/speedtest/internet/b$f;->a(LKa/f$a;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LKa/f$a;

.field final synthetic c:Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;


# direct methods
.method constructor <init>(LKa/f$a;Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/internet/b$f$a;->b:LKa/f$a;

    iput-object p2, p0, Lcom/ui/wifiman/model/speedtest/internet/b$f$a;->c:Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance p1, Lcom/ui/wifiman/model/speedtest/internet/b$f$a;

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/internet/b$f$a;->b:LKa/f$a;

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/internet/b$f$a;->c:Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;

    invoke-direct {p1, v0, v1, p2}, Lcom/ui/wifiman/model/speedtest/internet/b$f$a;-><init>(LKa/f$a;Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/model/speedtest/internet/b$f$a;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/ui/wifiman/model/speedtest/internet/b$f$a;->a:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object v2, v0, Lcom/ui/wifiman/model/speedtest/internet/b$f$a;->b:LKa/f$a;

    iget-object v4, v0, Lcom/ui/wifiman/model/speedtest/internet/b$f$a;->c:Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;

    invoke-virtual {v4}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;->d()Ljava/lang/String;

    move-result-object v4

    iput v3, v0, Lcom/ui/wifiman/model/speedtest/internet/b$f$a;->a:I

    invoke-interface {v2, v4, v0}, LKa/a;->b(Ljava/lang/String;Ldh/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    check-cast v2, LLa/e;

    invoke-virtual {v2}, LLa/e;->b()Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    long-to-int v1, v3

    invoke-virtual {v2}, LLa/e;->a()Ljava/lang/Long;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    long-to-int v3, v3

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/b;->d(I)Ljava/lang/Integer;

    move-result-object v3

    :goto_1
    move-object v15, v3

    goto :goto_2

    :cond_3
    const/4 v3, 0x0

    goto :goto_1

    :goto_2
    invoke-virtual {v2}, LLa/e;->c()Ljava/lang/String;

    move-result-object v5

    new-instance v2, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/b;->d(I)Ljava/lang/Integer;

    move-result-object v14

    const/16 v17, 0x9fe

    const/16 v18, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    move-object v4, v2

    invoke-direct/range {v4 .. v18}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LW7/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_4
    new-instance v1, Lcom/ui/speedtest/UiSpeedtestLib$Error$IO;

    iget-object v2, v0, Lcom/ui/wifiman/model/speedtest/internet/b$f$a;->c:Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;->d()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Server "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " unreachable"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ui/speedtest/UiSpeedtestLib$Error$IO;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/model/speedtest/internet/b$f$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/speedtest/internet/b$f$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lcom/ui/wifiman/model/speedtest/internet/b$f$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
