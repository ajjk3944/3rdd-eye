.class final LCd/k$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCd/k;->a(Linet/ipaddr/g;J)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LCd/k;

.field final synthetic c:Linet/ipaddr/g;


# direct methods
.method constructor <init>(LCd/k;Linet/ipaddr/g;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LCd/k$a;->b:LCd/k;

    iput-object p2, p0, LCd/k$a;->c:Linet/ipaddr/g;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance p1, LCd/k$a;

    iget-object v0, p0, LCd/k$a;->b:LCd/k;

    iget-object v1, p0, LCd/k$a;->c:Linet/ipaddr/g;

    invoke-direct {p1, v0, v1, p2}, LCd/k$a;-><init>(LCd/k;Linet/ipaddr/g;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LCd/k$a;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LCd/k$a;->a:I

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

    iget-object p1, p0, LCd/k$a;->b:LCd/k;

    invoke-static {p1}, LCd/k;->b(LCd/k;)LKa/f$a;

    move-result-object p1

    sget-object v1, LCd/j;->a:LCd/j$b;

    iget-object v3, p0, LCd/k$a;->c:Linet/ipaddr/g;

    const/16 v4, 0x22c5

    invoke-virtual {v1, v3, v4}, LCd/j$b;->a(Linet/ipaddr/g;I)Ljava/lang/String;

    move-result-object v1

    iput v2, p0, LCd/k$a;->a:I

    invoke-interface {p1, v1, p0}, LKa/f$a;->c(Ljava/lang/String;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    return-object p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LCd/k$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LCd/k$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LCd/k$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
