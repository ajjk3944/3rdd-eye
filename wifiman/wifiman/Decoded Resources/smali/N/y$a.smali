.class final LN/y$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/y;->a(Ly/k;LT/l;I)LT/z1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LN/W;

.field final synthetic c:LN/y;


# direct methods
.method constructor <init>(LN/W;LN/y;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LN/y$a;->b:LN/W;

    iput-object p2, p0, LN/y$a;->c:LN/y;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance p1, LN/y$a;

    iget-object v0, p0, LN/y$a;->b:LN/W;

    iget-object v1, p0, LN/y$a;->c:LN/y;

    invoke-direct {p1, v0, v1, p2}, LN/y$a;-><init>(LN/W;LN/y;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LN/y$a;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LN/y$a;->a:I

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

    iget-object v1, p0, LN/y$a;->b:LN/W;

    iget-object p1, p0, LN/y$a;->c:LN/y;

    invoke-static {p1}, LN/y;->b(LN/y;)F

    move-result p1

    iget-object v3, p0, LN/y$a;->c:LN/y;

    invoke-static {v3}, LN/y;->e(LN/y;)F

    move-result v3

    iget-object v4, p0, LN/y$a;->c:LN/y;

    invoke-static {v4}, LN/y;->d(LN/y;)F

    move-result v4

    iget-object v5, p0, LN/y$a;->c:LN/y;

    invoke-static {v5}, LN/y;->c(LN/y;)F

    move-result v5

    iput v2, p0, LN/y$a;->a:I

    move v2, p1

    move-object v6, p0

    invoke-virtual/range {v1 .. v6}, LN/W;->f(FFFFLdh/e;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, LN/y$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LN/y$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LN/y$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
