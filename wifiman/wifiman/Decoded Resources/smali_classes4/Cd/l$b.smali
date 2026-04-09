.class final LCd/l$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCd/l;->h(LCd/n;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LCd/l;

.field final synthetic c:LCd/n;


# direct methods
.method constructor <init>(LCd/l;LCd/n;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LCd/l$b;->b:LCd/l;

    iput-object p2, p0, LCd/l$b;->c:LCd/n;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance p1, LCd/l$b;

    iget-object v0, p0, LCd/l$b;->b:LCd/l;

    iget-object v1, p0, LCd/l$b;->c:LCd/n;

    invoke-direct {p1, v0, v1, p2}, LCd/l$b;-><init>(LCd/l;LCd/n;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LCd/l$b;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LCd/l$b;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LCd/l$b;->b:LCd/l;

    invoke-static {p1}, LCd/l;->e(LCd/l;)LKa/f$a;

    move-result-object p1

    sget-object v1, LCd/j;->a:LCd/j$b;

    iget-object v3, p0, LCd/l$b;->c:LCd/n;

    invoke-virtual {v3}, LCd/n;->o()LCd/j$c;

    move-result-object v3

    invoke-virtual {v3}, LCd/j$c;->a()Linet/ipaddr/g;

    move-result-object v3

    const/16 v4, 0x22c5

    invoke-virtual {v1, v3, v4}, LCd/j$b;->a(Linet/ipaddr/g;I)Ljava/lang/String;

    move-result-object v1

    iput v2, p0, LCd/l$b;->a:I

    invoke-interface {p1, v1, p0}, LKa/a;->b(Ljava/lang/String;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, LLa/e;

    new-instance v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;

    new-instance v1, LCd/j$d;

    invoke-virtual {p1}, LLa/e;->b()Ljava/lang/Long;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {p1}, LLa/e;->a()Ljava/lang/Long;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    long-to-int v3, v3

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/b;->d(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_1

    :cond_3
    const/4 v3, 0x0

    :goto_1
    invoke-virtual {p1}, LLa/e;->d()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v2, v3, p1}, LCd/j$d;-><init>(ILjava/lang/Integer;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;-><init>(Ljava/lang/Object;)V

    return-object v0

    :cond_4
    new-instance p1, Lcom/ui/speedtest/UiSpeedtestLib$Error$IO;

    iget-object v0, p0, LCd/l$b;->c:LCd/n;

    invoke-virtual {v0}, LCd/n;->o()LCd/j$c;

    move-result-object v0

    invoke-virtual {v0}, LCd/j$c;->a()Linet/ipaddr/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Server "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " unreachable"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/ui/speedtest/UiSpeedtestLib$Error$IO;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LCd/l$b;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LCd/l$b;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LCd/l$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
