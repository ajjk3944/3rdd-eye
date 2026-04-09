.class final Lcom/marsounjan/icmp4a/a$e$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/marsounjan/icmp4a/a$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Landroid/net/Network;

.field final synthetic c:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/net/Network;Ljava/lang/String;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lcom/marsounjan/icmp4a/a$e$a;->b:Landroid/net/Network;

    iput-object p2, p0, Lcom/marsounjan/icmp4a/a$e$a;->c:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance p1, Lcom/marsounjan/icmp4a/a$e$a;

    iget-object v0, p0, Lcom/marsounjan/icmp4a/a$e$a;->b:Landroid/net/Network;

    iget-object v1, p0, Lcom/marsounjan/icmp4a/a$e$a;->c:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2}, Lcom/marsounjan/icmp4a/a$e$a;-><init>(Landroid/net/Network;Ljava/lang/String;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lcom/marsounjan/icmp4a/a$e$a;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, Lcom/marsounjan/icmp4a/a$e$a;->a:I

    if-nez v0, :cond_1

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    new-instance p1, Lcom/marsounjan/icmp4a/a$c$b;

    iget-object v0, p0, Lcom/marsounjan/icmp4a/a$e$a;->b:Landroid/net/Network;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/marsounjan/icmp4a/a$e$a;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/net/Network;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/marsounjan/icmp4a/a$e$a;->c:Ljava/lang/String;

    invoke-static {v0}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {p1, v0}, Lcom/marsounjan/icmp4a/a$c$b;-><init>(Ljava/net/InetAddress;)V

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/marsounjan/icmp4a/a$e$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lcom/marsounjan/icmp4a/a$e$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lcom/marsounjan/icmp4a/a$e$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
