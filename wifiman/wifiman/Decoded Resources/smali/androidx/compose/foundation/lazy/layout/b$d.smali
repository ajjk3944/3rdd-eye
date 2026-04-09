.class final Landroidx/compose/foundation/lazy/layout/b$d;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/lazy/layout/b;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Landroidx/compose/foundation/lazy/layout/b;

.field final synthetic c:Lr/H;

.field final synthetic d:Lp0/c;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/lazy/layout/b;Lr/H;Lp0/c;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/b$d;->b:Landroidx/compose/foundation/lazy/layout/b;

    iput-object p2, p0, Landroidx/compose/foundation/lazy/layout/b$d;->c:Lr/H;

    iput-object p3, p0, Landroidx/compose/foundation/lazy/layout/b$d;->d:Lp0/c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance p1, Landroidx/compose/foundation/lazy/layout/b$d;

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/b$d;->b:Landroidx/compose/foundation/lazy/layout/b;

    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/b$d;->c:Lr/H;

    iget-object v2, p0, Landroidx/compose/foundation/lazy/layout/b$d;->d:Lp0/c;

    invoke-direct {p1, v0, v1, v2, p2}, Landroidx/compose/foundation/lazy/layout/b$d;-><init>(Landroidx/compose/foundation/lazy/layout/b;Lr/H;Lp0/c;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/lazy/layout/b$d;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Landroidx/compose/foundation/lazy/layout/b$d;->a:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    :try_start_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Landroidx/compose/foundation/lazy/layout/b$d;->b:Landroidx/compose/foundation/lazy/layout/b;

    invoke-static {p1}, Landroidx/compose/foundation/lazy/layout/b;->d(Landroidx/compose/foundation/lazy/layout/b;)Lr/a;

    move-result-object v4

    const/4 p1, 0x0

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->c(F)Ljava/lang/Float;

    move-result-object v5

    iget-object v6, p0, Landroidx/compose/foundation/lazy/layout/b$d;->c:Lr/H;

    new-instance v8, Landroidx/compose/foundation/lazy/layout/b$d$a;

    iget-object p1, p0, Landroidx/compose/foundation/lazy/layout/b$d;->d:Lp0/c;

    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/b$d;->b:Landroidx/compose/foundation/lazy/layout/b;

    invoke-direct {v8, p1, v1}, Landroidx/compose/foundation/lazy/layout/b$d$a;-><init>(Lp0/c;Landroidx/compose/foundation/lazy/layout/b;)V

    iput v3, p0, Landroidx/compose/foundation/lazy/layout/b$d;->a:I

    const/4 v7, 0x0

    const/4 v10, 0x4

    const/4 v11, 0x0

    move-object v9, p0

    invoke-static/range {v4 .. v11}, Lr/a;->f(Lr/a;Ljava/lang/Object;Lr/i;Ljava/lang/Object;Lmh/l;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, Landroidx/compose/foundation/lazy/layout/b$d;->b:Landroidx/compose/foundation/lazy/layout/b;

    invoke-static {p1, v3}, Landroidx/compose/foundation/lazy/layout/b;->f(Landroidx/compose/foundation/lazy/layout/b;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object p1, p0, Landroidx/compose/foundation/lazy/layout/b$d;->b:Landroidx/compose/foundation/lazy/layout/b;

    invoke-static {p1, v2}, Landroidx/compose/foundation/lazy/layout/b;->g(Landroidx/compose/foundation/lazy/layout/b;Z)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :goto_1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/b$d;->b:Landroidx/compose/foundation/lazy/layout/b;

    invoke-static {v0, v2}, Landroidx/compose/foundation/lazy/layout/b;->g(Landroidx/compose/foundation/lazy/layout/b;Z)V

    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/lazy/layout/b$d;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/lazy/layout/b$d;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/lazy/layout/b$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
