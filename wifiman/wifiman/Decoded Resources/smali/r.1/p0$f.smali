.class final Lr/p0$f;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr/p0;->f(Lr/q0;Ljava/lang/String;LT/l;II)Lr/o0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field c:I

.field final synthetic d:Lr/q0;


# direct methods
.method constructor <init>(Lr/q0;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lr/p0$f;->d:Lr/q0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 1

    new-instance p1, Lr/p0$f;

    iget-object v0, p0, Lr/p0$f;->d:Lr/q0;

    invoke-direct {p1, v0, p2}, Lr/p0$f;-><init>(Lr/q0;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lr/p0$f;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lr/p0$f;->c:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lr/p0$f;->b:Ljava/lang/Object;

    check-cast v0, Lr/q0;

    iget-object v1, p0, Lr/p0$f;->a:Ljava/lang/Object;

    check-cast v1, LTi/a;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lr/p0$f;->d:Lr/q0;

    check-cast p1, Lr/c0;

    invoke-virtual {p1}, Lr/c0;->L()V

    iget-object p1, p0, Lr/p0$f;->d:Lr/q0;

    check-cast p1, Lr/c0;

    invoke-virtual {p1}, Lr/c0;->H()LTi/a;

    move-result-object v1

    iget-object p1, p0, Lr/p0$f;->d:Lr/q0;

    iput-object v1, p0, Lr/p0$f;->a:Ljava/lang/Object;

    iput-object p1, p0, Lr/p0$f;->b:Ljava/lang/Object;

    iput v2, p0, Lr/p0$f;->c:I

    invoke-interface {v1, v3, p0}, LTi/a;->a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_2

    return-object v0

    :cond_2
    move-object v0, p1

    :goto_0
    :try_start_0
    move-object p1, v0

    check-cast p1, Lr/c0;

    invoke-virtual {v0}, Lr/q0;->b()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p1, v2}, Lr/c0;->S(Ljava/lang/Object;)V

    move-object p1, v0

    check-cast p1, Lr/c0;

    invoke-virtual {p1}, Lr/c0;->G()LIi/n;

    move-result-object p1

    if-eqz p1, :cond_3

    sget-object v2, LYg/u;->b:LYg/u$a;

    invoke-virtual {v0}, Lr/q0;->b()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1, v2}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_3
    :goto_1
    check-cast v0, Lr/c0;

    invoke-virtual {v0, v3}, Lr/c0;->T(LIi/n;)V

    sget-object p1, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v1, v3}, LTi/a;->d(Ljava/lang/Object;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :goto_2
    invoke-interface {v1, v3}, LTi/a;->d(Ljava/lang/Object;)V

    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lr/p0$f;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lr/p0$f;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lr/p0$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
