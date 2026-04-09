.class final LT5/b$a$a;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT5/b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field b:F

.field c:F

.field d:I

.field e:I

.field private synthetic f:Ljava/lang/Object;

.field final synthetic g:Lmh/p;


# direct methods
.method constructor <init>(Lmh/p;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LT5/b$a$a;->g:Lmh/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance v0, LT5/b$a$a;

    iget-object v1, p0, LT5/b$a$a;->g:Lmh/p;

    invoke-direct {v0, v1, p2}, LT5/b$a$a;-><init>(Lmh/p;Ldh/e;)V

    iput-object p1, v0, LT5/b$a$a;->f:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly0/b;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LT5/b$a$a;->n(Ly0/b;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LT5/b$a$a;->e:I

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v5, :cond_1

    if-ne v1, v3, :cond_0

    iget v1, p0, LT5/b$a$a;->c:F

    iget v6, p0, LT5/b$a$a;->d:I

    iget v7, p0, LT5/b$a$a;->b:F

    iget-object v8, p0, LT5/b$a$a;->f:Ljava/lang/Object;

    check-cast v8, Ly0/b;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget v1, p0, LT5/b$a$a;->c:F

    iget v6, p0, LT5/b$a$a;->d:I

    iget v7, p0, LT5/b$a$a;->b:F

    iget-object v8, p0, LT5/b$a$a;->f:Ljava/lang/Object;

    check-cast v8, Ly0/b;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LT5/b$a$a;->f:Ljava/lang/Object;

    move-object v8, p1

    check-cast v8, Ly0/b;

    invoke-interface {v8}, Ly0/b;->getViewConfiguration()Landroidx/compose/ui/platform/w1;

    move-result-object p1

    invoke-interface {p1}, Landroidx/compose/ui/platform/w1;->g()F

    move-result v1

    iput-object v8, p0, LT5/b$a$a;->f:Ljava/lang/Object;

    iput v2, p0, LT5/b$a$a;->b:F

    iput v4, p0, LT5/b$a$a;->d:I

    iput v1, p0, LT5/b$a$a;->c:F

    iput v5, p0, LT5/b$a$a;->e:I

    invoke-static {v8, v4, p0}, Lw/B;->d(Ly0/b;ZLdh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    move v7, v2

    move v6, v4

    :goto_0
    iput-object v8, p0, LT5/b$a$a;->f:Ljava/lang/Object;

    iput v7, p0, LT5/b$a$a;->b:F

    iput v6, p0, LT5/b$a$a;->d:I

    iput v1, p0, LT5/b$a$a;->c:F

    iput v3, p0, LT5/b$a$a;->e:I

    const/4 p1, 0x0

    invoke-static {v8, p1, p0, v5, p1}, Ly0/b;->s1(Ly0/b;Ly0/p;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    check-cast p1, Ly0/n;

    invoke-virtual {p1}, Ly0/n;->c()Ljava/util/List;

    move-result-object v9

    check-cast v9, Ljava/lang/Iterable;

    instance-of v10, v9, Ljava/util/Collection;

    if-eqz v10, :cond_6

    move-object v10, v9

    check-cast v10, Ljava/util/Collection;

    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_6

    :cond_5
    move v9, v4

    goto :goto_2

    :cond_6
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_7
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_5

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ly0/y;

    invoke-virtual {v10}, Ly0/y;->p()Z

    move-result v10

    if-eqz v10, :cond_7

    move v9, v5

    :goto_2
    if-nez v9, :cond_b

    invoke-static {p1}, Lw/F;->c(Ly0/n;)F

    move-result v10

    if-nez v6, :cond_8

    mul-float/2addr v7, v10

    invoke-static {p1, v4}, Lw/F;->b(Ly0/n;Z)F

    move-result v11

    int-to-float v12, v5

    sub-float/2addr v12, v7

    invoke-static {v12}, Ljava/lang/Math;->abs(F)F

    move-result v12

    mul-float/2addr v12, v11

    cmpl-float v11, v12, v1

    if-lez v11, :cond_8

    move v6, v5

    :cond_8
    if-eqz v6, :cond_b

    invoke-static {p1, v4}, Lw/F;->a(Ly0/n;Z)J

    move-result-wide v11

    cmpg-float v13, v10, v2

    if-nez v13, :cond_9

    goto :goto_3

    :cond_9
    iget-object v13, p0, LT5/b$a$a;->g:Lmh/p;

    invoke-static {v11, v12}, Ll0/g;->d(J)Ll0/g;

    move-result-object v11

    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/b;->c(F)Ljava/lang/Float;

    move-result-object v10

    invoke-interface {v13, v11, v10}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_3
    invoke-virtual {p1}, Ly0/n;->c()Ljava/util/List;

    move-result-object v10

    check-cast v10, Ljava/lang/Iterable;

    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_a
    :goto_4
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_b

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ly0/y;

    invoke-static {v11}, Ly0/o;->j(Ly0/y;)Z

    move-result v12

    if-eqz v12, :cond_a

    invoke-virtual {v11}, Ly0/y;->a()V

    goto :goto_4

    :cond_b
    if-nez v9, :cond_e

    invoke-virtual {p1}, Ly0/n;->c()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    instance-of v9, p1, Ljava/util/Collection;

    if-eqz v9, :cond_c

    move-object v9, p1

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_c

    goto :goto_5

    :cond_c
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_d
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_e

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ly0/y;

    invoke-virtual {v9}, Ly0/y;->i()Z

    move-result v9

    if-eqz v9, :cond_d

    goto/16 :goto_0

    :cond_e
    :goto_5
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(Ly0/b;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LT5/b$a$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LT5/b$a$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LT5/b$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
