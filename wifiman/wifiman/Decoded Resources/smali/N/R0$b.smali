.class final LN/R0$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/R0;->h(FLr/i;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:LN/R0;

.field final synthetic d:F

.field final synthetic e:Lr/i;


# direct methods
.method constructor <init>(LN/R0;FLr/i;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LN/R0$b;->c:LN/R0;

    iput p2, p0, LN/R0$b;->d:F

    iput-object p3, p0, LN/R0$b;->e:Lr/i;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 4

    new-instance v0, LN/R0$b;

    iget-object v1, p0, LN/R0$b;->c:LN/R0;

    iget v2, p0, LN/R0$b;->d:F

    iget-object v3, p0, LN/R0$b;->e:Lr/i;

    invoke-direct {v0, v1, v2, v3, p2}, LN/R0$b;-><init>(LN/R0;FLr/i;Ldh/e;)V

    iput-object p1, v0, LN/R0$b;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lw/k;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LN/R0$b;->n(Lw/k;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LN/R0$b;->a:I

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    :try_start_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object v1, p0, LN/R0$b;->b:Ljava/lang/Object;

    check-cast v1, Lw/k;

    new-instance v3, Lkotlin/jvm/internal/K;

    invoke-direct {v3}, Lkotlin/jvm/internal/K;-><init>()V

    iget-object v4, p0, LN/R0$b;->c:LN/R0;

    invoke-static {v4}, LN/R0;->b(LN/R0;)LT/m0;

    move-result-object v4

    invoke-interface {v4}, LT/m0;->c()F

    move-result v4

    iput v4, v3, Lkotlin/jvm/internal/K;->a:F

    iget-object v4, p0, LN/R0$b;->c:LN/R0;

    invoke-static {v4}, LN/R0;->c(LN/R0;)LT/q0;

    move-result-object v4

    iget v5, p0, LN/R0$b;->d:F

    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/b;->c(F)Ljava/lang/Float;

    move-result-object v5

    invoke-interface {v4, v5}, LT/q0;->setValue(Ljava/lang/Object;)V

    iget-object v4, p0, LN/R0$b;->c:LN/R0;

    invoke-static {v4, v2}, LN/R0;->f(LN/R0;Z)V

    :try_start_1
    iget v4, v3, Lkotlin/jvm/internal/K;->a:F

    const/4 v5, 0x0

    const/4 v6, 0x2

    invoke-static {v4, v5, v6, v10}, Lr/b;->b(FFILjava/lang/Object;)Lr/a;

    move-result-object v4

    iget v5, p0, LN/R0$b;->d:F

    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/b;->c(F)Ljava/lang/Float;

    move-result-object v5

    iget-object v6, p0, LN/R0$b;->e:Lr/i;

    new-instance v7, LN/R0$b$a;

    invoke-direct {v7, v1, v3}, LN/R0$b$a;-><init>(Lw/k;Lkotlin/jvm/internal/K;)V

    iput v2, p0, LN/R0$b;->a:I

    const/4 v8, 0x0

    const/4 v11, 0x4

    const/4 v12, 0x0

    move-object v1, v4

    move-object v2, v5

    move-object v3, v6

    move-object v4, v8

    move-object v5, v7

    move-object v6, p0

    move v7, v11

    move-object v8, v12

    invoke-static/range {v1 .. v8}, Lr/a;->f(Lr/a;Ljava/lang/Object;Lr/i;Ljava/lang/Object;Lmh/l;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne v1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object v0, p0, LN/R0$b;->c:LN/R0;

    invoke-static {v0}, LN/R0;->c(LN/R0;)LT/q0;

    move-result-object v0

    invoke-interface {v0, v10}, LT/q0;->setValue(Ljava/lang/Object;)V

    iget-object v0, p0, LN/R0$b;->c:LN/R0;

    invoke-static {v0, v9}, LN/R0;->f(LN/R0;Z)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0

    :goto_1
    iget-object v1, p0, LN/R0$b;->c:LN/R0;

    invoke-static {v1}, LN/R0;->c(LN/R0;)LT/q0;

    move-result-object v1

    invoke-interface {v1, v10}, LT/q0;->setValue(Ljava/lang/Object;)V

    iget-object v1, p0, LN/R0$b;->c:LN/R0;

    invoke-static {v1, v9}, LN/R0;->f(LN/R0;Z)V

    throw v0
.end method

.method public final n(Lw/k;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LN/R0$b;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LN/R0$b;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LN/R0$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
