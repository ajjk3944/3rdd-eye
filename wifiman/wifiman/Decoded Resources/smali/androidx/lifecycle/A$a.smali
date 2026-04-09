.class final Landroidx/lifecycle/A$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/lifecycle/A;->a(Landroidx/lifecycle/k;Landroidx/lifecycle/k$b;Lmh/p;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Landroidx/lifecycle/k;

.field final synthetic d:Landroidx/lifecycle/k$b;

.field final synthetic e:Lmh/p;


# direct methods
.method constructor <init>(Landroidx/lifecycle/k;Landroidx/lifecycle/k$b;Lmh/p;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/lifecycle/A$a;->c:Landroidx/lifecycle/k;

    iput-object p2, p0, Landroidx/lifecycle/A$a;->d:Landroidx/lifecycle/k$b;

    iput-object p3, p0, Landroidx/lifecycle/A$a;->e:Lmh/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 4

    new-instance v0, Landroidx/lifecycle/A$a;

    iget-object v1, p0, Landroidx/lifecycle/A$a;->c:Landroidx/lifecycle/k;

    iget-object v2, p0, Landroidx/lifecycle/A$a;->d:Landroidx/lifecycle/k$b;

    iget-object v3, p0, Landroidx/lifecycle/A$a;->e:Lmh/p;

    invoke-direct {v0, v1, v2, v3, p2}, Landroidx/lifecycle/A$a;-><init>(Landroidx/lifecycle/k;Landroidx/lifecycle/k$b;Lmh/p;Ldh/e;)V

    iput-object p1, v0, Landroidx/lifecycle/A$a;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Landroidx/lifecycle/A$a;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Landroidx/lifecycle/A$a;->a:I

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

    iget-object p1, p0, Landroidx/lifecycle/A$a;->b:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, LIi/N;

    invoke-static {}, LIi/c0;->c()LIi/H0;

    move-result-object p1

    invoke-virtual {p1}, LIi/H0;->p0()LIi/H0;

    move-result-object p1

    new-instance v1, Landroidx/lifecycle/A$a$a;

    iget-object v4, p0, Landroidx/lifecycle/A$a;->c:Landroidx/lifecycle/k;

    iget-object v5, p0, Landroidx/lifecycle/A$a;->d:Landroidx/lifecycle/k$b;

    iget-object v7, p0, Landroidx/lifecycle/A$a;->e:Lmh/p;

    const/4 v8, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v8}, Landroidx/lifecycle/A$a$a;-><init>(Landroidx/lifecycle/k;Landroidx/lifecycle/k$b;LIi/N;Lmh/p;Ldh/e;)V

    iput v2, p0, Landroidx/lifecycle/A$a;->a:I

    invoke-static {p1, v1, p0}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/lifecycle/A$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Landroidx/lifecycle/A$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/A$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
