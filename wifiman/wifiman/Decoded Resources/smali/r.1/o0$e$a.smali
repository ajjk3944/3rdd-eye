.class final Lr/o0$e$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr/o0$e;->a(LT/L;)LT/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:F

.field b:I

.field private synthetic c:Ljava/lang/Object;

.field final synthetic d:Lr/o0;


# direct methods
.method constructor <init>(Lr/o0;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lr/o0$e$a;->d:Lr/o0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance v0, Lr/o0$e$a;

    iget-object v1, p0, Lr/o0$e$a;->d:Lr/o0;

    invoke-direct {v0, v1, p2}, Lr/o0$e$a;-><init>(Lr/o0;Ldh/e;)V

    iput-object p1, v0, Lr/o0$e$a;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lr/o0$e$a;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lr/o0$e$a;->b:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget v1, p0, Lr/o0$e$a;->a:F

    iget-object v3, p0, Lr/o0$e$a;->c:Ljava/lang/Object;

    check-cast v3, LIi/N;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lr/o0$e$a;->c:Ljava/lang/Object;

    check-cast p1, LIi/N;

    invoke-interface {p1}, LIi/N;->getCoroutineContext()Ldh/i;

    move-result-object v1

    invoke-static {v1}, Lr/m0;->n(Ldh/i;)F

    move-result v1

    move-object v3, p1

    :cond_2
    :goto_0
    invoke-static {v3}, LIi/O;->i(LIi/N;)Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, Lr/o0$e$a$a;

    iget-object v4, p0, Lr/o0$e$a;->d:Lr/o0;

    invoke-direct {p1, v4, v1}, Lr/o0$e$a$a;-><init>(Lr/o0;F)V

    iput-object v3, p0, Lr/o0$e$a;->c:Ljava/lang/Object;

    iput v1, p0, Lr/o0$e$a;->a:F

    iput v2, p0, Lr/o0$e$a;->b:I

    invoke-static {p1, p0}, LT/i0;->c(Lmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_3
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lr/o0$e$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lr/o0$e$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lr/o0$e$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
