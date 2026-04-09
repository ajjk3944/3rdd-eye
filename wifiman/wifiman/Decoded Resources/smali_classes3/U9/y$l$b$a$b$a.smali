.class final LU9/y$l$b$a$b$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU9/y$l$b$a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field synthetic b:Ljava/lang/Object;

.field final synthetic c:Lf2/w;

.field final synthetic d:LU9/f;

.field final synthetic e:LN/n0;

.field final synthetic f:Lmh/l;


# direct methods
.method constructor <init>(Lf2/w;LU9/f;LN/n0;Lmh/l;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LU9/y$l$b$a$b$a;->c:Lf2/w;

    iput-object p2, p0, LU9/y$l$b$a$b$a;->d:LU9/f;

    iput-object p3, p0, LU9/y$l$b$a$b$a;->e:LN/n0;

    iput-object p4, p0, LU9/y$l$b$a$b$a;->f:Lmh/l;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 7

    new-instance v6, LU9/y$l$b$a$b$a;

    iget-object v1, p0, LU9/y$l$b$a$b$a;->c:Lf2/w;

    iget-object v2, p0, LU9/y$l$b$a$b$a;->d:LU9/f;

    iget-object v3, p0, LU9/y$l$b$a$b$a;->e:LN/n0;

    iget-object v4, p0, LU9/y$l$b$a$b$a;->f:Lmh/l;

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, LU9/y$l$b$a$b$a;-><init>(Lf2/w;LU9/f;LN/n0;Lmh/l;Ldh/e;)V

    iput-object p1, v6, LU9/y$l$b$a$b$a;->b:Ljava/lang/Object;

    return-object v6
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LU9/h$a;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LU9/y$l$b$a$b$a;->n(LU9/h$a;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LU9/y$l$b$a$b$a;->a:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LU9/y$l$b$a$b$a;->b:Ljava/lang/Object;

    check-cast p1, LU9/h$a;

    instance-of v1, p1, LU9/j;

    if-eqz v1, :cond_3

    iget-object v4, p0, LU9/y$l$b$a$b$a;->c:Lf2/w;

    iget-object p1, p0, LU9/y$l$b$a$b$a;->d:LU9/f;

    invoke-interface {p1}, LQ9/j$b;->a()Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lf2/n;->d0(Lf2/n;Ljava/lang/String;ZZILjava/lang/Object;)Z

    iget-object p1, p0, LU9/y$l$b$a$b$a;->e:LN/n0;

    iput v3, p0, LU9/y$l$b$a$b$a;->a:I

    invoke-virtual {p1, p0}, LN/n0;->l(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    return-object v0

    :cond_3
    instance-of v1, p1, LU9/i;

    if-eqz v1, :cond_4

    iget-object p1, p0, LU9/y$l$b$a$b$a;->e:LN/n0;

    iput v2, p0, LU9/y$l$b$a$b$a;->a:I

    invoke-virtual {p1, p0}, LN/n0;->i(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    return-object v0

    :cond_4
    instance-of v0, p1, LU9/h$a$a;

    if-nez v0, :cond_6

    instance-of v0, p1, LU9/k;

    if-eqz v0, :cond_5

    iget-object v0, p0, LU9/y$l$b$a$b$a;->f:Lmh/l;

    check-cast p1, LU9/k;

    invoke-virtual {p1}, LU9/k;->a()Lcom/ui/core/ui/sso/UiSSO$a;

    move-result-object p1

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_6
    :goto_1
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LU9/h$a;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LU9/y$l$b$a$b$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LU9/y$l$b$a$b$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LU9/y$l$b$a$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
