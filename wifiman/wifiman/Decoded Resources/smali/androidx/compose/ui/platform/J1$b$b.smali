.class final Landroidx/compose/ui/platform/J1$b$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/J1$b;->j(Landroidx/lifecycle/o;Landroidx/lifecycle/k$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Lkotlin/jvm/internal/N;

.field final synthetic d:LT/N0;

.field final synthetic e:Landroidx/lifecycle/o;

.field final synthetic f:Landroidx/compose/ui/platform/J1$b;

.field final synthetic g:Landroid/view/View;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/N;LT/N0;Landroidx/lifecycle/o;Landroidx/compose/ui/platform/J1$b;Landroid/view/View;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/J1$b$b;->c:Lkotlin/jvm/internal/N;

    iput-object p2, p0, Landroidx/compose/ui/platform/J1$b$b;->d:LT/N0;

    iput-object p3, p0, Landroidx/compose/ui/platform/J1$b$b;->e:Landroidx/lifecycle/o;

    iput-object p4, p0, Landroidx/compose/ui/platform/J1$b$b;->f:Landroidx/compose/ui/platform/J1$b;

    iput-object p5, p0, Landroidx/compose/ui/platform/J1$b$b;->g:Landroid/view/View;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 8

    new-instance v7, Landroidx/compose/ui/platform/J1$b$b;

    iget-object v1, p0, Landroidx/compose/ui/platform/J1$b$b;->c:Lkotlin/jvm/internal/N;

    iget-object v2, p0, Landroidx/compose/ui/platform/J1$b$b;->d:LT/N0;

    iget-object v3, p0, Landroidx/compose/ui/platform/J1$b$b;->e:Landroidx/lifecycle/o;

    iget-object v4, p0, Landroidx/compose/ui/platform/J1$b$b;->f:Landroidx/compose/ui/platform/J1$b;

    iget-object v5, p0, Landroidx/compose/ui/platform/J1$b$b;->g:Landroid/view/View;

    move-object v0, v7

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Landroidx/compose/ui/platform/J1$b$b;-><init>(Lkotlin/jvm/internal/N;LT/N0;Landroidx/lifecycle/o;Landroidx/compose/ui/platform/J1$b;Landroid/view/View;Ldh/e;)V

    iput-object p1, v7, Landroidx/compose/ui/platform/J1$b$b;->b:Ljava/lang/Object;

    return-object v7
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/platform/J1$b$b;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Landroidx/compose/ui/platform/J1$b$b;->a:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/platform/J1$b$b;->b:Ljava/lang/Object;

    check-cast v0, LIi/y0;

    :try_start_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/compose/ui/platform/J1$b$b;->b:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, LIi/N;

    :try_start_1
    iget-object p1, p0, Landroidx/compose/ui/platform/J1$b$b;->c:Lkotlin/jvm/internal/N;

    iget-object p1, p1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast p1, Landroidx/compose/ui/platform/G0;

    if-eqz p1, :cond_2

    iget-object v1, p0, Landroidx/compose/ui/platform/J1$b$b;->g:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroidx/compose/ui/platform/J1;->a(Landroid/content/Context;)LLi/N;

    move-result-object v1

    invoke-interface {v1}, LLi/N;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    invoke-virtual {p1, v5}, Landroidx/compose/ui/platform/G0;->b(F)V

    new-instance v7, Landroidx/compose/ui/platform/J1$b$b$a;

    invoke-direct {v7, v1, p1, v3}, Landroidx/compose/ui/platform/J1$b$b$a;-><init>(LLi/N;Landroidx/compose/ui/platform/G0;Ldh/e;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    move-object v0, v3

    goto :goto_2

    :cond_2
    move-object p1, v3

    :goto_0
    :try_start_2
    iget-object v1, p0, Landroidx/compose/ui/platform/J1$b$b;->d:LT/N0;

    iput-object p1, p0, Landroidx/compose/ui/platform/J1$b$b;->b:Ljava/lang/Object;

    iput v2, p0, Landroidx/compose/ui/platform/J1$b$b;->a:I

    invoke-virtual {v1, p0}, LT/N0;->z0(Ldh/e;)Ljava/lang/Object;

    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-ne v1, v0, :cond_3

    return-object v0

    :cond_3
    move-object v0, p1

    :goto_1
    if-eqz v0, :cond_4

    invoke-static {v0, v3, v2, v3}, LIi/y0$a;->b(LIi/y0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_4
    iget-object p1, p0, Landroidx/compose/ui/platform/J1$b$b;->e:Landroidx/lifecycle/o;

    invoke-interface {p1}, Landroidx/lifecycle/o;->O()Landroidx/lifecycle/k;

    move-result-object p1

    iget-object v0, p0, Landroidx/compose/ui/platform/J1$b$b;->f:Landroidx/compose/ui/platform/J1$b;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/k;->c(Landroidx/lifecycle/n;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :catchall_2
    move-exception v0

    move-object v10, v0

    move-object v0, p1

    move-object p1, v10

    :goto_2
    if-eqz v0, :cond_5

    invoke-static {v0, v3, v2, v3}, LIi/y0$a;->b(LIi/y0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_5
    iget-object v0, p0, Landroidx/compose/ui/platform/J1$b$b;->e:Landroidx/lifecycle/o;

    invoke-interface {v0}, Landroidx/lifecycle/o;->O()Landroidx/lifecycle/k;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/platform/J1$b$b;->f:Landroidx/compose/ui/platform/J1$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/k;->c(Landroidx/lifecycle/n;)V

    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/platform/J1$b$b;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Landroidx/compose/ui/platform/J1$b$b;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Landroidx/compose/ui/platform/J1$b$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
