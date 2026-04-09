.class final Landroidx/compose/foundation/gestures/b$b$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/b$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Landroidx/compose/foundation/gestures/b;

.field final synthetic d:Ly0/G;

.field final synthetic e:Lmh/q;

.field final synthetic f:Lmh/l;

.field final synthetic g:Lmh/a;

.field final synthetic h:Lmh/a;

.field final synthetic i:Lmh/p;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/gestures/b;Ly0/G;Lmh/q;Lmh/l;Lmh/a;Lmh/a;Lmh/p;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/gestures/b$b$a;->c:Landroidx/compose/foundation/gestures/b;

    iput-object p2, p0, Landroidx/compose/foundation/gestures/b$b$a;->d:Ly0/G;

    iput-object p3, p0, Landroidx/compose/foundation/gestures/b$b$a;->e:Lmh/q;

    iput-object p4, p0, Landroidx/compose/foundation/gestures/b$b$a;->f:Lmh/l;

    iput-object p5, p0, Landroidx/compose/foundation/gestures/b$b$a;->g:Lmh/a;

    iput-object p6, p0, Landroidx/compose/foundation/gestures/b$b$a;->h:Lmh/a;

    iput-object p7, p0, Landroidx/compose/foundation/gestures/b$b$a;->i:Lmh/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 10

    new-instance v9, Landroidx/compose/foundation/gestures/b$b$a;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/b$b$a;->c:Landroidx/compose/foundation/gestures/b;

    iget-object v2, p0, Landroidx/compose/foundation/gestures/b$b$a;->d:Ly0/G;

    iget-object v3, p0, Landroidx/compose/foundation/gestures/b$b$a;->e:Lmh/q;

    iget-object v4, p0, Landroidx/compose/foundation/gestures/b$b$a;->f:Lmh/l;

    iget-object v5, p0, Landroidx/compose/foundation/gestures/b$b$a;->g:Lmh/a;

    iget-object v6, p0, Landroidx/compose/foundation/gestures/b$b$a;->h:Lmh/a;

    iget-object v7, p0, Landroidx/compose/foundation/gestures/b$b$a;->i:Lmh/p;

    move-object v0, v9

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Landroidx/compose/foundation/gestures/b$b$a;-><init>(Landroidx/compose/foundation/gestures/b;Ly0/G;Lmh/q;Lmh/l;Lmh/a;Lmh/a;Lmh/p;Ldh/e;)V

    iput-object p1, v9, Landroidx/compose/foundation/gestures/b$b$a;->b:Ljava/lang/Object;

    return-object v9
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/b$b$a;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Landroidx/compose/foundation/gestures/b$b$a;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Landroidx/compose/foundation/gestures/b$b$a;->b:Ljava/lang/Object;

    check-cast v0, LIi/N;

    :try_start_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/compose/foundation/gestures/b$b$a;->b:Ljava/lang/Object;

    check-cast p1, LIi/N;

    :try_start_1
    iget-object v1, p0, Landroidx/compose/foundation/gestures/b$b$a;->c:Landroidx/compose/foundation/gestures/b;

    invoke-static {v1}, Landroidx/compose/foundation/gestures/b;->K2(Landroidx/compose/foundation/gestures/b;)Lw/q;

    move-result-object v8

    iget-object v3, p0, Landroidx/compose/foundation/gestures/b$b$a;->d:Ly0/G;

    iget-object v4, p0, Landroidx/compose/foundation/gestures/b$b$a;->e:Lmh/q;

    iget-object v5, p0, Landroidx/compose/foundation/gestures/b$b$a;->f:Lmh/l;

    iget-object v6, p0, Landroidx/compose/foundation/gestures/b$b$a;->g:Lmh/a;

    iget-object v7, p0, Landroidx/compose/foundation/gestures/b$b$a;->h:Lmh/a;

    iget-object v9, p0, Landroidx/compose/foundation/gestures/b$b$a;->i:Lmh/p;

    iput-object p1, p0, Landroidx/compose/foundation/gestures/b$b$a;->b:Ljava/lang/Object;

    iput v2, p0, Landroidx/compose/foundation/gestures/b$b$a;->a:I

    move-object v10, p0

    invoke-static/range {v3 .. v10}, Lw/j;->f(Ly0/G;Lmh/q;Lmh/l;Lmh/a;Lmh/a;Lw/q;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p1, v0, :cond_3

    return-object v0

    :catch_1
    move-exception v0

    move-object v11, v0

    move-object v0, p1

    move-object p1, v11

    :goto_0
    iget-object v1, p0, Landroidx/compose/foundation/gestures/b$b$a;->c:Landroidx/compose/foundation/gestures/b;

    invoke-static {v1}, Landroidx/compose/foundation/gestures/b;->J2(Landroidx/compose/foundation/gestures/b;)LKi/g;

    move-result-object v1

    if-eqz v1, :cond_2

    sget-object v2, Landroidx/compose/foundation/gestures/a$a;->a:Landroidx/compose/foundation/gestures/a$a;

    invoke-interface {v1, v2}, LKi/w;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, LKi/k;->b(Ljava/lang/Object;)LKi/k;

    :cond_2
    invoke-static {v0}, LIi/O;->i(LIi/N;)Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    :goto_1
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_4
    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/b$b$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/gestures/b$b$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/gestures/b$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
