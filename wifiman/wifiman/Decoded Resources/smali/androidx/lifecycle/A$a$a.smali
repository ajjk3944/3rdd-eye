.class final Landroidx/lifecycle/A$a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/lifecycle/A$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field c:Ljava/lang/Object;

.field d:Ljava/lang/Object;

.field e:Ljava/lang/Object;

.field f:Ljava/lang/Object;

.field g:I

.field final synthetic h:Landroidx/lifecycle/k;

.field final synthetic i:Landroidx/lifecycle/k$b;

.field final synthetic j:LIi/N;

.field final synthetic k:Lmh/p;


# direct methods
.method constructor <init>(Landroidx/lifecycle/k;Landroidx/lifecycle/k$b;LIi/N;Lmh/p;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/lifecycle/A$a$a;->h:Landroidx/lifecycle/k;

    iput-object p2, p0, Landroidx/lifecycle/A$a$a;->i:Landroidx/lifecycle/k$b;

    iput-object p3, p0, Landroidx/lifecycle/A$a$a;->j:LIi/N;

    iput-object p4, p0, Landroidx/lifecycle/A$a$a;->k:Lmh/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 6

    new-instance p1, Landroidx/lifecycle/A$a$a;

    iget-object v1, p0, Landroidx/lifecycle/A$a$a;->h:Landroidx/lifecycle/k;

    iget-object v2, p0, Landroidx/lifecycle/A$a$a;->i:Landroidx/lifecycle/k$b;

    iget-object v3, p0, Landroidx/lifecycle/A$a$a;->j:LIi/N;

    iget-object v4, p0, Landroidx/lifecycle/A$a$a;->k:Lmh/p;

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Landroidx/lifecycle/A$a$a;-><init>(Landroidx/lifecycle/k;Landroidx/lifecycle/k$b;LIi/N;Lmh/p;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Landroidx/lifecycle/A$a$a;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v1, p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v2, v1, Landroidx/lifecycle/A$a$a;->g:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v4, :cond_0

    iget-object v0, v1, Landroidx/lifecycle/A$a$a;->f:Ljava/lang/Object;

    check-cast v0, Lmh/p;

    iget-object v0, v1, Landroidx/lifecycle/A$a$a;->e:Ljava/lang/Object;

    check-cast v0, LIi/N;

    iget-object v0, v1, Landroidx/lifecycle/A$a$a;->d:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/k;

    iget-object v0, v1, Landroidx/lifecycle/A$a$a;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/k$b;

    iget-object v0, v1, Landroidx/lifecycle/A$a$a;->b:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/internal/N;

    iget-object v0, v1, Landroidx/lifecycle/A$a$a;->a:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lkotlin/jvm/internal/N;

    :try_start_0
    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_2

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object v2, v1, Landroidx/lifecycle/A$a$a;->h:Landroidx/lifecycle/k;

    invoke-virtual {v2}, Landroidx/lifecycle/k;->b()Landroidx/lifecycle/k$b;

    move-result-object v2

    sget-object v5, Landroidx/lifecycle/k$b;->DESTROYED:Landroidx/lifecycle/k$b;

    if-ne v2, v5, :cond_2

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0

    :cond_2
    new-instance v2, Lkotlin/jvm/internal/N;

    invoke-direct {v2}, Lkotlin/jvm/internal/N;-><init>()V

    new-instance v13, Lkotlin/jvm/internal/N;

    invoke-direct {v13}, Lkotlin/jvm/internal/N;-><init>()V

    :try_start_1
    iget-object v5, v1, Landroidx/lifecycle/A$a$a;->i:Landroidx/lifecycle/k$b;

    iget-object v14, v1, Landroidx/lifecycle/A$a$a;->h:Landroidx/lifecycle/k;

    iget-object v8, v1, Landroidx/lifecycle/A$a$a;->j:LIi/N;

    iget-object v12, v1, Landroidx/lifecycle/A$a$a;->k:Lmh/p;

    iput-object v2, v1, Landroidx/lifecycle/A$a$a;->a:Ljava/lang/Object;

    iput-object v13, v1, Landroidx/lifecycle/A$a$a;->b:Ljava/lang/Object;

    iput-object v5, v1, Landroidx/lifecycle/A$a$a;->c:Ljava/lang/Object;

    iput-object v14, v1, Landroidx/lifecycle/A$a$a;->d:Ljava/lang/Object;

    iput-object v8, v1, Landroidx/lifecycle/A$a$a;->e:Ljava/lang/Object;

    iput-object v12, v1, Landroidx/lifecycle/A$a$a;->f:Ljava/lang/Object;

    iput v4, v1, Landroidx/lifecycle/A$a$a;->g:I

    new-instance v15, LIi/p;

    invoke-static/range {p0 .. p0}, Leh/b;->d(Ldh/e;)Ldh/e;

    move-result-object v6

    invoke-direct {v15, v6, v4}, LIi/p;-><init>(Ldh/e;I)V

    invoke-virtual {v15}, LIi/p;->A()V

    sget-object v6, Landroidx/lifecycle/k$a;->Companion:Landroidx/lifecycle/k$a$a;

    invoke-virtual {v6, v5}, Landroidx/lifecycle/k$a$a;->d(Landroidx/lifecycle/k$b;)Landroidx/lifecycle/k$a;

    move-result-object v7

    invoke-virtual {v6, v5}, Landroidx/lifecycle/k$a$a;->a(Landroidx/lifecycle/k$b;)Landroidx/lifecycle/k$a;

    move-result-object v9

    const/4 v5, 0x0

    invoke-static {v5, v4, v3}, LTi/g;->b(ZILjava/lang/Object;)LTi/a;

    move-result-object v11

    new-instance v10, Landroidx/lifecycle/A$a$a$a;

    move-object v5, v10

    move-object v6, v7

    move-object v7, v2

    move-object v3, v10

    move-object v10, v15

    invoke-direct/range {v5 .. v12}, Landroidx/lifecycle/A$a$a$a;-><init>(Landroidx/lifecycle/k$a;Lkotlin/jvm/internal/N;LIi/N;Landroidx/lifecycle/k$a;LIi/n;LTi/a;Lmh/p;)V

    iput-object v3, v13, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    const-string v5, "null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v10, v3

    check-cast v10, Landroidx/lifecycle/m;

    invoke-virtual {v14, v10}, Landroidx/lifecycle/k;->a(Landroidx/lifecycle/n;)V

    invoke-virtual {v15}, LIi/p;->u()Ljava/lang/Object;

    move-result-object v3

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v5

    if-ne v3, v5, :cond_3

    invoke-static/range {p0 .. p0}, Lkotlin/coroutines/jvm/internal/h;->c(Ldh/e;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object v5, v2

    move-object v2, v13

    goto :goto_2

    :cond_3
    :goto_0
    if-ne v3, v0, :cond_4

    return-object v0

    :cond_4
    move-object v5, v2

    move-object v2, v13

    :goto_1
    iget-object v0, v5, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v0, LIi/y0;

    if-eqz v0, :cond_5

    const/4 v3, 0x0

    invoke-static {v0, v3, v4, v3}, LIi/y0$a;->b(LIi/y0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_5
    iget-object v0, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/m;

    if-eqz v0, :cond_6

    iget-object v2, v1, Landroidx/lifecycle/A$a$a;->h:Landroidx/lifecycle/k;

    invoke-virtual {v2, v0}, Landroidx/lifecycle/k;->c(Landroidx/lifecycle/n;)V

    :cond_6
    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0

    :goto_2
    iget-object v3, v5, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v3, LIi/y0;

    if-eqz v3, :cond_7

    const/4 v5, 0x0

    invoke-static {v3, v5, v4, v5}, LIi/y0$a;->b(LIi/y0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_7
    iget-object v2, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v2, Landroidx/lifecycle/m;

    if-eqz v2, :cond_8

    iget-object v3, v1, Landroidx/lifecycle/A$a$a;->h:Landroidx/lifecycle/k;

    invoke-virtual {v3, v2}, Landroidx/lifecycle/k;->c(Landroidx/lifecycle/n;)V

    :cond_8
    throw v0
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/lifecycle/A$a$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Landroidx/lifecycle/A$a$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/A$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
