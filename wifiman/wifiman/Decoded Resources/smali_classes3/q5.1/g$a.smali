.class final Lq5/g$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq5/g;-><init>(LO1/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:I

.field final synthetic c:Lq5/g;


# direct methods
.method constructor <init>(Lq5/g;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lq5/g$a;->c:Lq5/g;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 1

    new-instance p1, Lq5/g$a;

    iget-object v0, p0, Lq5/g$a;->c:Lq5/g;

    invoke-direct {p1, v0, p2}, Lq5/g$a;-><init>(Lq5/g;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lq5/g$a;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lq5/g$a;->b:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lq5/g$a;->a:Ljava/lang/Object;

    check-cast v0, Lq5/g;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lq5/g$a;->c:Lq5/g;

    invoke-static {p1}, Lq5/g;->a(Lq5/g;)LO1/e;

    move-result-object v1

    invoke-interface {v1}, LO1/e;->b()LLi/g;

    move-result-object v1

    iput-object p1, p0, Lq5/g$a;->a:Ljava/lang/Object;

    iput v2, p0, Lq5/g$a;->b:I

    invoke-static {v1, p0}, LLi/i;->x(LLi/g;Ldh/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2

    return-object v0

    :cond_2
    move-object v0, p1

    move-object p1, v1

    :goto_0
    check-cast p1, LR1/d;

    invoke-virtual {p1}, LR1/d;->d()LR1/d;

    move-result-object p1

    invoke-static {v0, p1}, Lq5/g;->c(Lq5/g;LR1/d;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lq5/g$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lq5/g$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lq5/g$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
