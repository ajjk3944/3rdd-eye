.class final Lcom/marsounjan/icmp4a/a$e;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/marsounjan/icmp4a/a;->m(Landroid/net/Network;Ljava/lang/String;JLdh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:J

.field final synthetic d:Landroid/net/Network;


# direct methods
.method constructor <init>(Ljava/lang/String;JLandroid/net/Network;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lcom/marsounjan/icmp4a/a$e;->b:Ljava/lang/String;

    iput-wide p2, p0, Lcom/marsounjan/icmp4a/a$e;->c:J

    iput-object p4, p0, Lcom/marsounjan/icmp4a/a$e;->d:Landroid/net/Network;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 6

    new-instance p1, Lcom/marsounjan/icmp4a/a$e;

    iget-object v1, p0, Lcom/marsounjan/icmp4a/a$e;->b:Ljava/lang/String;

    iget-wide v2, p0, Lcom/marsounjan/icmp4a/a$e;->c:J

    iget-object v4, p0, Lcom/marsounjan/icmp4a/a$e;->d:Landroid/net/Network;

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/marsounjan/icmp4a/a$e;-><init>(Ljava/lang/String;JLandroid/net/Network;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lcom/marsounjan/icmp4a/a$e;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/marsounjan/icmp4a/a$e;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    :try_start_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lkotlinx/coroutines/TimeoutCancellationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_3

    :catch_2
    move-exception p1

    goto :goto_4

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lcom/marsounjan/icmp4a/a$e;->b:Ljava/lang/String;

    invoke-static {p1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_3

    iget-wide v3, p0, Lcom/marsounjan/icmp4a/a$e;->c:J

    new-instance p1, Lcom/marsounjan/icmp4a/a$e$a;

    iget-object v1, p0, Lcom/marsounjan/icmp4a/a$e;->d:Landroid/net/Network;

    iget-object v5, p0, Lcom/marsounjan/icmp4a/a$e;->b:Ljava/lang/String;

    const/4 v6, 0x0

    invoke-direct {p1, v1, v5, v6}, Lcom/marsounjan/icmp4a/a$e$a;-><init>(Landroid/net/Network;Ljava/lang/String;Ldh/e;)V

    iput v2, p0, Lcom/marsounjan/icmp4a/a$e;->a:I

    invoke-static {v3, v4, p1, p0}, LIi/W0;->c(JLmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lcom/marsounjan/icmp4a/a$c;

    goto :goto_5

    :cond_3
    new-instance p1, Lcom/marsounjan/icmp4a/a$c$a$c;

    new-instance v0, Ljava/net/UnknownHostException;

    const-string v1, "Cannot resolve empty host"

    invoke-direct {v0, v1}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Lcom/marsounjan/icmp4a/a$c$a$c;-><init>(Ljava/net/UnknownHostException;)V
    :try_end_1
    .catch Ljava/net/UnknownHostException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lkotlinx/coroutines/TimeoutCancellationException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_5

    :goto_1
    new-instance v0, Lcom/marsounjan/icmp4a/a$c$a$b;

    invoke-direct {v0, p1}, Lcom/marsounjan/icmp4a/a$c$a$b;-><init>(Lkotlinx/coroutines/TimeoutCancellationException;)V

    :goto_2
    move-object p1, v0

    goto :goto_5

    :goto_3
    new-instance v0, Lcom/marsounjan/icmp4a/a$c$a$a;

    invoke-direct {v0, p1}, Lcom/marsounjan/icmp4a/a$c$a$a;-><init>(Ljava/lang/SecurityException;)V

    goto :goto_2

    :goto_4
    new-instance v0, Lcom/marsounjan/icmp4a/a$c$a$c;

    invoke-direct {v0, p1}, Lcom/marsounjan/icmp4a/a$c$a$c;-><init>(Ljava/net/UnknownHostException;)V

    goto :goto_2

    :goto_5
    return-object p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/marsounjan/icmp4a/a$e;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lcom/marsounjan/icmp4a/a$e;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lcom/marsounjan/icmp4a/a$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
