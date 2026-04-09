.class final Landroidx/compose/foundation/lazy/layout/b$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/lazy/layout/b;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Z

.field final synthetic c:Landroidx/compose/foundation/lazy/layout/b;

.field final synthetic d:Lr/H;

.field final synthetic e:Lp0/c;


# direct methods
.method constructor <init>(ZLandroidx/compose/foundation/lazy/layout/b;Lr/H;Lp0/c;Ldh/e;)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/lazy/layout/b$c;->b:Z

    iput-object p2, p0, Landroidx/compose/foundation/lazy/layout/b$c;->c:Landroidx/compose/foundation/lazy/layout/b;

    iput-object p3, p0, Landroidx/compose/foundation/lazy/layout/b$c;->d:Lr/H;

    iput-object p4, p0, Landroidx/compose/foundation/lazy/layout/b$c;->e:Lp0/c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 6

    new-instance p1, Landroidx/compose/foundation/lazy/layout/b$c;

    iget-boolean v1, p0, Landroidx/compose/foundation/lazy/layout/b$c;->b:Z

    iget-object v2, p0, Landroidx/compose/foundation/lazy/layout/b$c;->c:Landroidx/compose/foundation/lazy/layout/b;

    iget-object v3, p0, Landroidx/compose/foundation/lazy/layout/b$c;->d:Lr/H;

    iget-object v4, p0, Landroidx/compose/foundation/lazy/layout/b$c;->e:Lp0/c;

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/lazy/layout/b$c;-><init>(ZLandroidx/compose/foundation/lazy/layout/b;Lr/H;Lp0/c;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/lazy/layout/b$c;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Landroidx/compose/foundation/lazy/layout/b$c;->a:I

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    :try_start_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :try_start_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_2
    iget-boolean p1, p0, Landroidx/compose/foundation/lazy/layout/b$c;->b:Z

    if-eqz p1, :cond_3

    iget-object p1, p0, Landroidx/compose/foundation/lazy/layout/b$c;->c:Landroidx/compose/foundation/lazy/layout/b;

    invoke-static {p1}, Landroidx/compose/foundation/lazy/layout/b;->d(Landroidx/compose/foundation/lazy/layout/b;)Lr/a;

    move-result-object p1

    const/4 v1, 0x0

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/b;->c(F)Ljava/lang/Float;

    move-result-object v1

    iput v4, p0, Landroidx/compose/foundation/lazy/layout/b$c;->a:I

    invoke-virtual {p1, v1, p0}, Lr/a;->t(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    iget-object p1, p0, Landroidx/compose/foundation/lazy/layout/b$c;->c:Landroidx/compose/foundation/lazy/layout/b;

    invoke-static {p1}, Landroidx/compose/foundation/lazy/layout/b;->d(Landroidx/compose/foundation/lazy/layout/b;)Lr/a;

    move-result-object v4

    const/high16 p1, 0x3f800000    # 1.0f

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->c(F)Ljava/lang/Float;

    move-result-object v5

    iget-object v6, p0, Landroidx/compose/foundation/lazy/layout/b$c;->d:Lr/H;

    new-instance v8, Landroidx/compose/foundation/lazy/layout/b$c$a;

    iget-object p1, p0, Landroidx/compose/foundation/lazy/layout/b$c;->e:Lp0/c;

    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/b$c;->c:Landroidx/compose/foundation/lazy/layout/b;

    invoke-direct {v8, p1, v1}, Landroidx/compose/foundation/lazy/layout/b$c$a;-><init>(Lp0/c;Landroidx/compose/foundation/lazy/layout/b;)V

    iput v3, p0, Landroidx/compose/foundation/lazy/layout/b$c;->a:I

    const/4 v7, 0x0

    const/4 v10, 0x4

    const/4 v11, 0x0

    move-object v9, p0

    invoke-static/range {v4 .. v11}, Lr/a;->f(Lr/a;Ljava/lang/Object;Lr/i;Ljava/lang/Object;Lmh/l;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    iget-object p1, p0, Landroidx/compose/foundation/lazy/layout/b$c;->c:Landroidx/compose/foundation/lazy/layout/b;

    invoke-static {p1, v2}, Landroidx/compose/foundation/lazy/layout/b;->e(Landroidx/compose/foundation/lazy/layout/b;Z)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :goto_2
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/b$c;->c:Landroidx/compose/foundation/lazy/layout/b;

    invoke-static {v0, v2}, Landroidx/compose/foundation/lazy/layout/b;->e(Landroidx/compose/foundation/lazy/layout/b;Z)V

    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/lazy/layout/b$c;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/lazy/layout/b$c;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/lazy/layout/b$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
