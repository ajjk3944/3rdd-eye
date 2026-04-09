.class final Ljj/i$d;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljj/i;->g(F)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field c:I

.field final synthetic d:F

.field final synthetic e:Ljj/i;


# direct methods
.method constructor <init>(FLjj/i;Ldh/e;)V
    .locals 0

    iput p1, p0, Ljj/i$d;->d:F

    iput-object p2, p0, Ljj/i$d;->e:Ljj/i;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance p1, Ljj/i$d;

    iget v0, p0, Ljj/i$d;->d:F

    iget-object v1, p0, Ljj/i$d;->e:Ljj/i;

    invoke-direct {p1, v0, v1, p2}, Ljj/i$d;-><init>(FLjj/i;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Ljj/i$d;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Ljj/i$d;->c:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Ljj/i$d;->b:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/M;

    iget-object v3, p0, Ljj/i$d;->a:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/internal/K;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    new-instance p1, Lkotlin/jvm/internal/K;

    invoke-direct {p1}, Lkotlin/jvm/internal/K;-><init>()V

    iget v1, p0, Ljj/i$d;->d:F

    iput v1, p1, Lkotlin/jvm/internal/K;->a:F

    new-instance v1, Lkotlin/jvm/internal/M;

    invoke-direct {v1}, Lkotlin/jvm/internal/M;-><init>()V

    move-object v3, p1

    :goto_0
    iget p1, v3, Lkotlin/jvm/internal/K;->a:F

    const/4 v4, 0x0

    cmpg-float p1, p1, v4

    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    iget-object p1, p0, Ljj/i$d;->e:Ljj/i;

    invoke-static {p1}, Ljj/i;->b(Ljj/i;)LIi/y0;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-interface {p1}, LIi/y0;->isActive()Z

    move-result p1

    if-ne p1, v2, :cond_4

    new-instance p1, Ljj/i$d$a;

    iget-object v4, p0, Ljj/i$d;->e:Ljj/i;

    invoke-direct {p1, v1, v3, v4}, Ljj/i$d$a;-><init>(Lkotlin/jvm/internal/M;Lkotlin/jvm/internal/K;Ljj/i;)V

    iput-object v3, p0, Ljj/i$d;->a:Ljava/lang/Object;

    iput-object v1, p0, Ljj/i$d;->b:Ljava/lang/Object;

    iput v2, p0, Ljj/i$d;->c:I

    invoke-static {p1, p0}, LT/i0;->b(Lmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_1
    iget-object p1, p0, Ljj/i$d;->e:Ljj/i;

    invoke-virtual {p1}, Ljj/i;->B()LKi/g;

    move-result-object p1

    iget v4, v3, Lkotlin/jvm/internal/K;->a:F

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/b;->c(F)Ljava/lang/Float;

    move-result-object v4

    invoke-interface {p1, v4}, LKi/w;->k(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_4
    :goto_2
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Ljj/i$d;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Ljj/i$d;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Ljj/i$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
