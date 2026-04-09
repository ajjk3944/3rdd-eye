.class final LU9/y$g;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU9/y;->u(Landroid/app/Activity;Ljava/lang/String;Lf2/w;LN/n0;LU9/h;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:LU9/h;

.field final synthetic d:LN/n0;


# direct methods
.method constructor <init>(LU9/h;LN/n0;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LU9/y$g;->c:LU9/h;

    iput-object p2, p0, LU9/y$g;->d:LN/n0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance v0, LU9/y$g;

    iget-object v1, p0, LU9/y$g;->c:LU9/h;

    iget-object v2, p0, LU9/y$g;->d:LN/n0;

    invoke-direct {v0, v1, v2, p2}, LU9/y$g;-><init>(LU9/h;LN/n0;Ldh/e;)V

    iput-object p1, v0, LU9/y$g;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LU9/y$g;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, LU9/y$g;->a:I

    if-nez v0, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LU9/y$g;->b:Ljava/lang/Object;

    check-cast p1, LIi/N;

    iget-object v0, p0, LU9/y$g;->c:LU9/h;

    invoke-virtual {v0}, LU9/h;->b()LLi/g;

    move-result-object v0

    new-instance v1, LU9/y$g$b;

    invoke-direct {v1, v0}, LU9/y$g$b;-><init>(LLi/g;)V

    new-instance v0, LU9/y$g$a;

    iget-object v2, p0, LU9/y$g;->d:LN/n0;

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3}, LU9/y$g$a;-><init>(LN/n0;Ldh/e;)V

    invoke-static {v1, v0}, LLi/i;->I(LLi/g;Lmh/p;)LLi/g;

    move-result-object v0

    invoke-static {v0, p1}, LLi/i;->D(LLi/g;LIi/N;)LIi/y0;

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LU9/y$g;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LU9/y$g;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LU9/y$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
