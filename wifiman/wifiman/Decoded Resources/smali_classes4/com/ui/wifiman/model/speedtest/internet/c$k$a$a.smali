.class final Lcom/ui/wifiman/model/speedtest/internet/c$k$a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/speedtest/internet/c$k$a;->a(LYg/s;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lcom/ui/wifiman/model/speedtest/internet/c;

.field final synthetic c:LIa/a$c;

.field final synthetic d:Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/speedtest/internet/c;LIa/a$c;Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/internet/c$k$a$a;->b:Lcom/ui/wifiman/model/speedtest/internet/c;

    iput-object p2, p0, Lcom/ui/wifiman/model/speedtest/internet/c$k$a$a;->c:LIa/a$c;

    iput-object p3, p0, Lcom/ui/wifiman/model/speedtest/internet/c$k$a$a;->d:Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance p1, Lcom/ui/wifiman/model/speedtest/internet/c$k$a$a;

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/internet/c$k$a$a;->b:Lcom/ui/wifiman/model/speedtest/internet/c;

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/internet/c$k$a$a;->c:LIa/a$c;

    iget-object v2, p0, Lcom/ui/wifiman/model/speedtest/internet/c$k$a$a;->d:Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/ui/wifiman/model/speedtest/internet/c$k$a$a;-><init>(Lcom/ui/wifiman/model/speedtest/internet/c;LIa/a$c;Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/model/speedtest/internet/c$k$a$a;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/ui/wifiman/model/speedtest/internet/c$k$a$a;->a:I

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

    iget-object p1, p0, Lcom/ui/wifiman/model/speedtest/internet/c$k$a$a;->b:Lcom/ui/wifiman/model/speedtest/internet/c;

    invoke-static {p1}, Lcom/ui/wifiman/model/speedtest/internet/c;->m(Lcom/ui/wifiman/model/speedtest/internet/c;)Ltd/d;

    move-result-object p1

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/internet/c$k$a$a;->c:LIa/a$c;

    invoke-virtual {v1}, LIa/a$c;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ltd/d;->d(Ljava/lang/String;)LKa/f$a;

    move-result-object p1

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/internet/c$k$a$a;->d:Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;->d()Ljava/lang/String;

    move-result-object v1

    iput v2, p0, Lcom/ui/wifiman/model/speedtest/internet/c$k$a$a;->a:I

    invoke-interface {p1, v1, p0}, LKa/a;->b(Ljava/lang/String;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    return-object p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/model/speedtest/internet/c$k$a$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/speedtest/internet/c$k$a$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lcom/ui/wifiman/model/speedtest/internet/c$k$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
