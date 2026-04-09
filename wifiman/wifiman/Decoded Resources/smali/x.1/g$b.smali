.class final Lx/g$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx/g;->i(Lw/v;FLmh/l;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:I

.field final synthetic c:Lx/g;

.field final synthetic d:F

.field final synthetic e:Lmh/l;

.field final synthetic f:Lw/v;


# direct methods
.method constructor <init>(Lx/g;FLmh/l;Lw/v;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lx/g$b;->c:Lx/g;

    iput p2, p0, Lx/g$b;->d:F

    iput-object p3, p0, Lx/g$b;->e:Lmh/l;

    iput-object p4, p0, Lx/g$b;->f:Lw/v;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 6

    new-instance p1, Lx/g$b;

    iget-object v1, p0, Lx/g$b;->c:Lx/g;

    iget v2, p0, Lx/g$b;->d:F

    iget-object v3, p0, Lx/g$b;->e:Lmh/l;

    iget-object v4, p0, Lx/g$b;->f:Lw/v;

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lx/g$b;-><init>(Lx/g;FLmh/l;Lw/v;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lx/g$b;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lx/g$b;->b:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lx/g$b;->a:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/K;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lx/g$b;->c:Lx/g;

    invoke-static {p1}, Lx/g;->e(Lx/g;)Lr/z;

    move-result-object p1

    const/4 v1, 0x0

    iget v4, p0, Lx/g$b;->d:F

    invoke-static {p1, v1, v4}, Lr/B;->a(Lr/z;FF)F

    move-result p1

    iget-object v1, p0, Lx/g$b;->c:Lx/g;

    invoke-static {v1}, Lx/g;->g(Lx/g;)Lx/i;

    move-result-object v1

    iget v4, p0, Lx/g$b;->d:F

    invoke-interface {v1, v4, p1}, Lx/i;->a(FF)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_6

    new-instance v1, Lkotlin/jvm/internal/K;

    invoke-direct {v1}, Lkotlin/jvm/internal/K;-><init>()V

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    iget v4, p0, Lx/g$b;->d:F

    invoke-static {v4}, Ljava/lang/Math;->signum(F)F

    move-result v4

    mul-float/2addr p1, v4

    iput p1, v1, Lkotlin/jvm/internal/K;->a:F

    iget-object v4, p0, Lx/g$b;->e:Lmh/l;

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->c(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {v4, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v5, p0, Lx/g$b;->c:Lx/g;

    iget-object v6, p0, Lx/g$b;->f:Lw/v;

    iget v7, v1, Lkotlin/jvm/internal/K;->a:F

    iget v8, p0, Lx/g$b;->d:F

    new-instance v9, Lx/g$b$b;

    iget-object p1, p0, Lx/g$b;->e:Lmh/l;

    invoke-direct {v9, v1, p1}, Lx/g$b$b;-><init>(Lkotlin/jvm/internal/K;Lmh/l;)V

    iput-object v1, p0, Lx/g$b;->a:Ljava/lang/Object;

    iput v3, p0, Lx/g$b;->b:I

    move-object v10, p0

    invoke-static/range {v5 .. v10}, Lx/g;->h(Lx/g;Lw/v;FFLmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    move-object v3, p1

    check-cast v3, Lr/k;

    iget-object p1, p0, Lx/g$b;->c:Lx/g;

    invoke-static {p1}, Lx/g;->g(Lx/g;)Lx/i;

    move-result-object p1

    invoke-virtual {v3}, Lr/k;->p()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-interface {p1, v4}, Lx/i;->b(F)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-nez v4, :cond_5

    iput p1, v1, Lkotlin/jvm/internal/K;->a:F

    iget-object v13, p0, Lx/g$b;->f:Lw/v;

    const/16 v11, 0x1e

    const/4 v12, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    invoke-static/range {v3 .. v12}, Lr/l;->g(Lr/k;FFJJZILjava/lang/Object;)Lr/k;

    move-result-object v8

    iget-object v3, p0, Lx/g$b;->c:Lx/g;

    invoke-static {v3}, Lx/g;->f(Lx/g;)Lr/i;

    move-result-object v9

    new-instance v10, Lx/g$b$a;

    iget-object v3, p0, Lx/g$b;->e:Lmh/l;

    invoke-direct {v10, v1, v3}, Lx/g$b$a;-><init>(Lkotlin/jvm/internal/K;Lmh/l;)V

    const/4 v1, 0x0

    iput-object v1, p0, Lx/g$b;->a:Ljava/lang/Object;

    iput v2, p0, Lx/g$b;->b:I

    move-object v5, v13

    move v6, p1

    move v7, p1

    move-object v11, p0

    invoke-static/range {v5 .. v11}, Lx/h;->c(Lw/v;FFLr/k;Lr/i;Lmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    return-object p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "calculateSnapOffset returned NaN. Please use a valid value."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "calculateApproachOffset returned NaN. Please use a valid value."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lx/g$b;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lx/g$b;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lx/g$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
