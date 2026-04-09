.class final Lr/c$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr/c;->f(Ljava/lang/Object;Lr/s0;Lr/i;Ljava/lang/Object;Ljava/lang/String;Lmh/l;LT/l;II)LT/z1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:I

.field private synthetic c:Ljava/lang/Object;

.field final synthetic d:LKi/g;

.field final synthetic e:Lr/a;

.field final synthetic f:LT/z1;

.field final synthetic g:LT/z1;


# direct methods
.method constructor <init>(LKi/g;Lr/a;LT/z1;LT/z1;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lr/c$b;->d:LKi/g;

    iput-object p2, p0, Lr/c$b;->e:Lr/a;

    iput-object p3, p0, Lr/c$b;->f:LT/z1;

    iput-object p4, p0, Lr/c$b;->g:LT/z1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 7

    new-instance v6, Lr/c$b;

    iget-object v1, p0, Lr/c$b;->d:LKi/g;

    iget-object v2, p0, Lr/c$b;->e:Lr/a;

    iget-object v3, p0, Lr/c$b;->f:LT/z1;

    iget-object v4, p0, Lr/c$b;->g:LT/z1;

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lr/c$b;-><init>(LKi/g;Lr/a;LT/z1;LT/z1;Ldh/e;)V

    iput-object p1, v6, Lr/c$b;->c:Ljava/lang/Object;

    return-object v6
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lr/c$b;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lr/c$b;->b:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lr/c$b;->a:Ljava/lang/Object;

    check-cast v1, LKi/i;

    iget-object v3, p0, Lr/c$b;->c:Ljava/lang/Object;

    check-cast v3, LIi/N;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    move-object v4, p1

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object v1, p0, Lr/c$b;->c:Ljava/lang/Object;

    check-cast v1, LIi/N;

    iget-object v3, p0, Lr/c$b;->d:LKi/g;

    invoke-interface {v3}, LKi/v;->iterator()LKi/i;

    move-result-object v3

    move-object v12, v3

    move-object v3, v1

    move-object v1, v12

    :goto_0
    iput-object v3, p0, Lr/c$b;->c:Ljava/lang/Object;

    iput-object v1, p0, Lr/c$b;->a:Ljava/lang/Object;

    iput v2, p0, Lr/c$b;->b:I

    invoke-interface {v1, p0}, LKi/i;->a(Ldh/e;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_2

    return-object v0

    :cond_2
    :goto_1
    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v1}, LKi/i;->next()Ljava/lang/Object;

    move-result-object v4

    iget-object v5, p0, Lr/c$b;->d:LKi/g;

    invoke-interface {v5}, LKi/v;->d()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, LKi/k;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_3

    move-object v7, v4

    goto :goto_2

    :cond_3
    move-object v7, v5

    :goto_2
    new-instance v4, Lr/c$b$a;

    iget-object v8, p0, Lr/c$b;->e:Lr/a;

    iget-object v9, p0, Lr/c$b;->f:LT/z1;

    iget-object v10, p0, Lr/c$b;->g:LT/z1;

    const/4 v11, 0x0

    move-object v6, v4

    invoke-direct/range {v6 .. v11}, Lr/c$b$a;-><init>(Ljava/lang/Object;Lr/a;LT/z1;LT/z1;Ldh/e;)V

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v5, v3

    move-object v8, v4

    invoke-static/range {v5 .. v10}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    goto :goto_0

    :cond_4
    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lr/c$b;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lr/c$b;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lr/c$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
