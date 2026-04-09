.class final Lxa/j$e;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxa/j;->k(Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field c:J

.field d:I

.field final synthetic e:Lxa/j;


# direct methods
.method constructor <init>(Lxa/j;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lxa/j$e;->e:Lxa/j;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method

.method public static synthetic n(J)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lxa/j$e;->t(J)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final t(J)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "ProductCatalog - Load finished in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, " ms"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 1

    new-instance p1, Lxa/j$e;

    iget-object v0, p0, Lxa/j$e;->e:Lxa/j;

    invoke-direct {p1, v0, p2}, Lxa/j$e;-><init>(Lxa/j;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lxa/j$e;->o(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lxa/j$e;->d:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-wide v0, p0, Lxa/j$e;->c:J

    iget-object v2, p0, Lxa/j$e;->b:Ljava/lang/Object;

    check-cast v2, Lxa/j;

    iget-object v3, p0, Lxa/j$e;->a:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/internal/N;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-wide v3, p0, Lxa/j$e;->c:J

    iget-object v1, p0, Lxa/j$e;->b:Ljava/lang/Object;

    check-cast v1, Lxa/j;

    iget-object v5, p0, Lxa/j$e;->a:Ljava/lang/Object;

    check-cast v5, Lkotlin/jvm/internal/N;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    new-instance v5, Lkotlin/jvm/internal/N;

    invoke-direct {v5}, Lkotlin/jvm/internal/N;-><init>()V

    iget-object v1, p0, Lxa/j$e;->e:Lxa/j;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-static {v1}, Lxa/j;->g(Lxa/j;)Lya/n;

    move-result-object p1

    if-eqz p1, :cond_3

    iput-object v5, p0, Lxa/j$e;->a:Ljava/lang/Object;

    iput-object v1, p0, Lxa/j$e;->b:Ljava/lang/Object;

    iput-wide v6, p0, Lxa/j$e;->c:J

    iput v3, p0, Lxa/j$e;->d:I

    invoke-interface {p1, p0}, Lya/n;->c(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    move-wide v3, v6

    :goto_0
    invoke-static {v1}, Lxa/j;->h(Lxa/j;)Lya/n;

    move-result-object p1

    iput-object v5, p0, Lxa/j$e;->a:Ljava/lang/Object;

    iput-object v1, p0, Lxa/j$e;->b:Ljava/lang/Object;

    iput-wide v3, p0, Lxa/j$e;->c:J

    iput v2, p0, Lxa/j$e;->d:I

    invoke-interface {p1, p0}, Lya/n;->c(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    move-object v2, v1

    move-wide v0, v3

    move-object v3, v5

    :goto_1
    invoke-static {v2}, Lxa/j;->j(Lxa/j;)Lwa/a;

    move-result-object p1

    iput-object p1, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long/2addr v4, v0

    new-instance p1, Lxa/m;

    invoke-direct {p1, v4, v5}, Lxa/m;-><init>(J)V

    invoke-static {p1}, LBa/a;->b(Lmh/a;)V

    iget-object p1, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    return-object p1
.end method

.method public final o(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lxa/j$e;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lxa/j$e;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lxa/j$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
