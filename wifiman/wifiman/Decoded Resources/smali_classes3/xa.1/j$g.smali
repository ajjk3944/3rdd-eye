.class final Lxa/j$g;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxa/j;->a(Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:J

.field c:I

.field final synthetic d:Lxa/j;


# direct methods
.method constructor <init>(Lxa/j;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lxa/j$g;->d:Lxa/j;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 1

    new-instance p1, Lxa/j$g;

    iget-object v0, p0, Lxa/j$g;->d:Lxa/j;

    invoke-direct {p1, v0, p2}, Lxa/j$g;-><init>(Lxa/j;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lxa/j$g;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lxa/j$g;->c:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-wide v0, p0, Lxa/j$g;->b:J

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-wide v3, p0, Lxa/j$g;->b:J

    iget-object v1, p0, Lxa/j$g;->a:Ljava/lang/Object;

    check-cast v1, Lxa/j;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    iget-wide v4, p0, Lxa/j$g;->b:J

    iget-object v1, p0, Lxa/j$g;->a:Ljava/lang/Object;

    check-cast v1, Lxa/j;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object v1, p0, Lxa/j$g;->d:Lxa/j;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-static {v1}, Lxa/j;->g(Lxa/j;)Lya/n;

    move-result-object p1

    if-eqz p1, :cond_5

    iput-object v1, p0, Lxa/j$g;->a:Ljava/lang/Object;

    iput-wide v5, p0, Lxa/j$g;->b:J

    iput v4, p0, Lxa/j$g;->c:I

    invoke-interface {p1, p0}, Lya/n;->a(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    move-wide v4, v5

    :goto_0
    move-wide v5, v4

    :cond_5
    invoke-static {v1}, Lxa/j;->h(Lxa/j;)Lya/n;

    move-result-object p1

    iput-object v1, p0, Lxa/j$g;->a:Ljava/lang/Object;

    iput-wide v5, p0, Lxa/j$g;->b:J

    iput v3, p0, Lxa/j$g;->c:I

    invoke-interface {p1, p0}, Lya/n;->a(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    return-object v0

    :cond_6
    move-wide v3, v5

    :goto_1
    invoke-static {v1}, Lxa/j;->f(Lxa/j;)LLi/y;

    move-result-object p1

    invoke-static {v1}, Lxa/j;->j(Lxa/j;)Lwa/a;

    move-result-object v1

    const/4 v5, 0x0

    iput-object v5, p0, Lxa/j$g;->a:Ljava/lang/Object;

    iput-wide v3, p0, Lxa/j$g;->b:J

    iput v2, p0, Lxa/j$g;->c:I

    invoke-interface {p1, v1, p0}, LLi/y;->a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    return-object v0

    :cond_7
    move-wide v0, v3

    :goto_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v0

    invoke-static {v2, v3}, Lkotlin/coroutines/jvm/internal/b;->e(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lxa/j$g;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lxa/j$g;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lxa/j$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
