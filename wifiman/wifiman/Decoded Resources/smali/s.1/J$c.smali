.class final Ls/J$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls/J;->n2()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Ls/J;


# direct methods
.method constructor <init>(Ls/J;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Ls/J$c;->b:Ls/J;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 1

    new-instance p1, Ls/J$c;

    iget-object v0, p0, Ls/J$c;->b:Ls/J;

    invoke-direct {p1, v0, p2}, Ls/J$c;-><init>(Ls/J;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Ls/J$c;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Ls/J$c;->a:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    :cond_3
    :goto_0
    iget-object p1, p0, Ls/J$c;->b:Ls/J;

    invoke-static {p1}, Ls/J;->D2(Ls/J;)LKi/g;

    move-result-object p1

    if-eqz p1, :cond_4

    iput v3, p0, Ls/J$c;->a:I

    invoke-interface {p1, p0}, LKi/v;->c(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    iget-object p1, p0, Ls/J$c;->b:Ls/J;

    invoke-static {p1}, Ls/J;->F2(Ls/J;)Ls/U;

    move-result-object p1

    if-eqz p1, :cond_3

    sget-object p1, Ls/J$c$a;->a:Ls/J$c$a;

    iput v2, p0, Ls/J$c;->a:I

    invoke-static {p1, p0}, LT/i0;->b(Lmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_2
    iget-object p1, p0, Ls/J$c;->b:Ls/J;

    invoke-static {p1}, Ls/J;->F2(Ls/J;)Ls/U;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-interface {p1}, Ls/U;->b()V

    goto :goto_0
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Ls/J$c;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Ls/J$c;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Ls/J$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
