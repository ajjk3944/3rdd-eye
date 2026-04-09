.class final Lvf/e$e;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvf/e;->h(Ljava/lang/String;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lvf/e;


# direct methods
.method constructor <init>(Ljava/lang/String;Lvf/e;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lvf/e$e;->b:Ljava/lang/String;

    iput-object p2, p0, Lvf/e$e;->c:Lvf/e;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance p1, Lvf/e$e;

    iget-object v0, p0, Lvf/e$e;->b:Ljava/lang/String;

    iget-object v1, p0, Lvf/e$e;->c:Lvf/e;

    invoke-direct {p1, v0, v1, p2}, Lvf/e$e;-><init>(Ljava/lang/String;Lvf/e;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lvf/e$e;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    const-string v0, ""

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v1, p0, Lvf/e$e;->a:I

    if-nez v1, :cond_2

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_0
    new-instance p1, Ljava/net/URL;

    iget-object v1, p0, Lvf/e$e;->b:Ljava/lang/String;

    invoke-direct {p1, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    :try_start_1
    new-instance p1, Linet/ipaddr/n;

    iget-object v1, p0, Lvf/e$e;->b:Ljava/lang/String;

    invoke-direct {p1, v1}, Linet/ipaddr/n;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Linet/ipaddr/n;->g()Linet/ipaddr/g;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v1, Lvf/e$b$b;

    invoke-direct {v1, p1}, Lvf/e$b$b;-><init>(Linet/ipaddr/g;)V

    iget-object p1, p0, Lvf/e$e;->c:Lvf/e;

    invoke-static {p1, v1}, Lvf/e;->a(Lvf/e;Lvf/e$b;)Lvf/e$c;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v1, p0, Lvf/e$e;->b:Ljava/lang/String;

    new-instance v2, Ljava/net/URL;

    invoke-virtual {p1}, Lvf/e$c;->getScheme()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lvf/e$c;->getPort()I

    move-result p1

    invoke-direct {v2, v3, v1, p1, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    :try_end_1
    .catch Linet/ipaddr/AddressStringException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Linet/ipaddr/IncompatibleAddressException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v2

    :catch_1
    :cond_0
    :try_start_2
    iget-object p1, p0, Lvf/e$e;->c:Lvf/e;

    new-instance v1, Lvf/e$b$a;

    iget-object v2, p0, Lvf/e$e;->b:Ljava/lang/String;

    invoke-direct {v1, v2}, Lvf/e$b$a;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v1}, Lvf/e;->a(Lvf/e;Lvf/e$b;)Lvf/e$c;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v1, p0, Lvf/e$e;->b:Ljava/lang/String;

    new-instance v2, Ljava/net/URL;

    invoke-virtual {p1}, Lvf/e$c;->getScheme()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lvf/e$c;->getPort()I

    move-result p1

    invoke-direct {v2, v3, v1, p1, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    :try_end_2
    .catch Linet/ipaddr/AddressStringException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Linet/ipaddr/IncompatibleAddressException; {:try_start_2 .. :try_end_2} :catch_2

    return-object v2

    :catch_2
    :cond_1
    const/4 p1, 0x0

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lvf/e$e;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lvf/e$e;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lvf/e$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
