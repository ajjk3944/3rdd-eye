.class final Landroidx/compose/foundation/lazy/layout/b$e;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/lazy/layout/b;->m(JZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:I

.field final synthetic c:Landroidx/compose/foundation/lazy/layout/b;

.field final synthetic d:Lr/H;

.field final synthetic e:J


# direct methods
.method constructor <init>(Landroidx/compose/foundation/lazy/layout/b;Lr/H;JLdh/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/b$e;->c:Landroidx/compose/foundation/lazy/layout/b;

    iput-object p2, p0, Landroidx/compose/foundation/lazy/layout/b$e;->d:Lr/H;

    iput-wide p3, p0, Landroidx/compose/foundation/lazy/layout/b$e;->e:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 6

    new-instance p1, Landroidx/compose/foundation/lazy/layout/b$e;

    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/b$e;->c:Landroidx/compose/foundation/lazy/layout/b;

    iget-object v2, p0, Landroidx/compose/foundation/lazy/layout/b$e;->d:Lr/H;

    iget-wide v3, p0, Landroidx/compose/foundation/lazy/layout/b$e;->e:J

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/lazy/layout/b$e;-><init>(Landroidx/compose/foundation/lazy/layout/b;Lr/H;JLdh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/lazy/layout/b$e;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Landroidx/compose/foundation/lazy/layout/b$e;->b:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    :try_start_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/b$e;->a:Ljava/lang/Object;

    check-cast v1, Lr/H;

    :try_start_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_2
    iget-object p1, p0, Landroidx/compose/foundation/lazy/layout/b$e;->c:Landroidx/compose/foundation/lazy/layout/b;

    invoke-static {p1}, Landroidx/compose/foundation/lazy/layout/b;->c(Landroidx/compose/foundation/lazy/layout/b;)Lr/a;

    move-result-object p1

    invoke-virtual {p1}, Lr/a;->p()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Landroidx/compose/foundation/lazy/layout/b$e;->d:Lr/H;

    instance-of v1, p1, Lr/h0;

    if-eqz v1, :cond_3

    check-cast p1, Lr/h0;

    goto :goto_0

    :cond_3
    invoke-static {}, LB/p;->a()Lr/h0;

    move-result-object p1

    :goto_0
    move-object v1, p1

    goto :goto_1

    :cond_4
    iget-object p1, p0, Landroidx/compose/foundation/lazy/layout/b$e;->d:Lr/H;

    goto :goto_0

    :goto_1
    iget-object p1, p0, Landroidx/compose/foundation/lazy/layout/b$e;->c:Landroidx/compose/foundation/lazy/layout/b;

    invoke-static {p1}, Landroidx/compose/foundation/lazy/layout/b;->c(Landroidx/compose/foundation/lazy/layout/b;)Lr/a;

    move-result-object p1

    invoke-virtual {p1}, Lr/a;->p()Z

    move-result p1

    if-nez p1, :cond_6

    iget-object p1, p0, Landroidx/compose/foundation/lazy/layout/b$e;->c:Landroidx/compose/foundation/lazy/layout/b;

    invoke-static {p1}, Landroidx/compose/foundation/lazy/layout/b;->c(Landroidx/compose/foundation/lazy/layout/b;)Lr/a;

    move-result-object p1

    iget-wide v4, p0, Landroidx/compose/foundation/lazy/layout/b$e;->e:J

    invoke-static {v4, v5}, LY0/n;->b(J)LY0/n;

    move-result-object v4

    iput-object v1, p0, Landroidx/compose/foundation/lazy/layout/b$e;->a:Ljava/lang/Object;

    iput v3, p0, Landroidx/compose/foundation/lazy/layout/b$e;->b:I

    invoke-virtual {p1, v4, p0}, Lr/a;->t(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_2
    iget-object p1, p0, Landroidx/compose/foundation/lazy/layout/b$e;->c:Landroidx/compose/foundation/lazy/layout/b;

    invoke-static {p1}, Landroidx/compose/foundation/lazy/layout/b;->b(Landroidx/compose/foundation/lazy/layout/b;)Lmh/a;

    move-result-object p1

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    :cond_6
    move-object v5, v1

    iget-object p1, p0, Landroidx/compose/foundation/lazy/layout/b$e;->c:Landroidx/compose/foundation/lazy/layout/b;

    invoke-static {p1}, Landroidx/compose/foundation/lazy/layout/b;->c(Landroidx/compose/foundation/lazy/layout/b;)Lr/a;

    move-result-object p1

    invoke-virtual {p1}, Lr/a;->m()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LY0/n;

    invoke-virtual {p1}, LY0/n;->n()J

    move-result-wide v3

    iget-wide v6, p0, Landroidx/compose/foundation/lazy/layout/b$e;->e:J

    invoke-static {v3, v4, v6, v7}, LY0/n;->k(JJ)J

    move-result-wide v3

    iget-object p1, p0, Landroidx/compose/foundation/lazy/layout/b$e;->c:Landroidx/compose/foundation/lazy/layout/b;

    invoke-static {p1}, Landroidx/compose/foundation/lazy/layout/b;->c(Landroidx/compose/foundation/lazy/layout/b;)Lr/a;

    move-result-object p1

    invoke-static {v3, v4}, LY0/n;->b(J)LY0/n;

    move-result-object v1

    new-instance v7, Landroidx/compose/foundation/lazy/layout/b$e$a;

    iget-object v6, p0, Landroidx/compose/foundation/lazy/layout/b$e;->c:Landroidx/compose/foundation/lazy/layout/b;

    invoke-direct {v7, v6, v3, v4}, Landroidx/compose/foundation/lazy/layout/b$e$a;-><init>(Landroidx/compose/foundation/lazy/layout/b;J)V

    const/4 v3, 0x0

    iput-object v3, p0, Landroidx/compose/foundation/lazy/layout/b$e;->a:Ljava/lang/Object;

    iput v2, p0, Landroidx/compose/foundation/lazy/layout/b$e;->b:I

    const/4 v6, 0x0

    const/4 v9, 0x4

    const/4 v10, 0x0

    move-object v3, p1

    move-object v4, v1

    move-object v8, p0

    invoke-static/range {v3 .. v10}, Lr/a;->f(Lr/a;Ljava/lang/Object;Lr/i;Ljava/lang/Object;Lmh/l;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    return-object v0

    :cond_7
    :goto_3
    iget-object p1, p0, Landroidx/compose/foundation/lazy/layout/b$e;->c:Landroidx/compose/foundation/lazy/layout/b;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Landroidx/compose/foundation/lazy/layout/b;->h(Landroidx/compose/foundation/lazy/layout/b;Z)V

    iget-object p1, p0, Landroidx/compose/foundation/lazy/layout/b$e;->c:Landroidx/compose/foundation/lazy/layout/b;

    invoke-static {p1, v0}, Landroidx/compose/foundation/lazy/layout/b;->j(Landroidx/compose/foundation/lazy/layout/b;Z)V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/lazy/layout/b$e;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/lazy/layout/b$e;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/lazy/layout/b$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
