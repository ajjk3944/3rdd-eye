.class final Lw/j$k;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/j;->f(Ly0/G;Lmh/q;Lmh/l;Lmh/a;Lmh/a;Lw/q;Lmh/p;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field b:Ljava/lang/Object;

.field c:Ljava/lang/Object;

.field d:Ljava/lang/Object;

.field e:Ljava/lang/Object;

.field f:Ljava/lang/Object;

.field g:Ljava/lang/Object;

.field h:Z

.field i:F

.field j:I

.field private synthetic k:Ljava/lang/Object;

.field final synthetic l:Lmh/a;

.field final synthetic m:Lkotlin/jvm/internal/M;

.field final synthetic n:Lw/q;

.field final synthetic o:Lmh/q;

.field final synthetic p:Lmh/p;

.field final synthetic q:Lmh/a;

.field final synthetic r:Lmh/l;


# direct methods
.method constructor <init>(Lmh/a;Lkotlin/jvm/internal/M;Lw/q;Lmh/q;Lmh/p;Lmh/a;Lmh/l;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lw/j$k;->l:Lmh/a;

    iput-object p2, p0, Lw/j$k;->m:Lkotlin/jvm/internal/M;

    iput-object p3, p0, Lw/j$k;->n:Lw/q;

    iput-object p4, p0, Lw/j$k;->o:Lmh/q;

    iput-object p5, p0, Lw/j$k;->p:Lmh/p;

    iput-object p6, p0, Lw/j$k;->q:Lmh/a;

    iput-object p7, p0, Lw/j$k;->r:Lmh/l;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 10

    new-instance v9, Lw/j$k;

    iget-object v1, p0, Lw/j$k;->l:Lmh/a;

    iget-object v2, p0, Lw/j$k;->m:Lkotlin/jvm/internal/M;

    iget-object v3, p0, Lw/j$k;->n:Lw/q;

    iget-object v4, p0, Lw/j$k;->o:Lmh/q;

    iget-object v5, p0, Lw/j$k;->p:Lmh/p;

    iget-object v6, p0, Lw/j$k;->q:Lmh/a;

    iget-object v7, p0, Lw/j$k;->r:Lmh/l;

    move-object v0, v9

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lw/j$k;-><init>(Lmh/a;Lkotlin/jvm/internal/M;Lw/q;Lmh/q;Lmh/p;Lmh/a;Lmh/l;Ldh/e;)V

    iput-object p1, v9, Lw/j$k;->k:Ljava/lang/Object;

    return-object v9
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly0/b;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lw/j$k;->n(Ly0/b;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v6, p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v7

    iget v0, v6, Lw/j$k;->j:I

    const/4 v8, 0x5

    const/4 v9, 0x4

    const/4 v10, 0x3

    const/4 v1, 0x2

    const/4 v11, 0x0

    const/4 v12, 0x1

    const/4 v13, 0x0

    if-eqz v0, :cond_6

    if-eq v0, v12, :cond_4

    if-eq v0, v1, :cond_3

    if-eq v0, v10, :cond_2

    if-eq v0, v9, :cond_1

    if-ne v0, v8, :cond_0

    iget-object v0, v6, Lw/j$k;->e:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/M;

    iget-object v1, v6, Lw/j$k;->d:Ljava/lang/Object;

    check-cast v1, Ly0/b;

    iget-object v2, v6, Lw/j$k;->c:Ljava/lang/Object;

    check-cast v2, Lw/q;

    iget-object v3, v6, Lw/j$k;->b:Ljava/lang/Object;

    check-cast v3, Lmh/p;

    iget-object v4, v6, Lw/j$k;->k:Ljava/lang/Object;

    check-cast v4, Ly0/b;

    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    move-object/from16 v10, p1

    move v9, v12

    move-object v5, v13

    goto/16 :goto_13

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget v0, v6, Lw/j$k;->i:F

    iget-object v1, v6, Lw/j$k;->g:Ljava/lang/Object;

    check-cast v1, Ly0/y;

    iget-object v2, v6, Lw/j$k;->f:Ljava/lang/Object;

    check-cast v2, Lw/E;

    iget-object v3, v6, Lw/j$k;->e:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/internal/M;

    iget-object v4, v6, Lw/j$k;->d:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/internal/M;

    iget-object v5, v6, Lw/j$k;->c:Ljava/lang/Object;

    check-cast v5, Ly0/b;

    iget-object v14, v6, Lw/j$k;->b:Ljava/lang/Object;

    check-cast v14, Ly0/y;

    iget-object v15, v6, Lw/j$k;->k:Ljava/lang/Object;

    check-cast v15, Ly0/b;

    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    move-object/from16 v20, v2

    move v2, v0

    move-object v0, v14

    move-object v14, v4

    move-object/from16 v4, v20

    move-object/from16 v21, v15

    move-object v15, v3

    move-object/from16 v3, v21

    goto/16 :goto_d

    :cond_2
    iget v0, v6, Lw/j$k;->i:F

    iget-object v1, v6, Lw/j$k;->f:Ljava/lang/Object;

    check-cast v1, Lw/E;

    iget-object v2, v6, Lw/j$k;->e:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/M;

    iget-object v3, v6, Lw/j$k;->d:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/internal/M;

    iget-object v4, v6, Lw/j$k;->c:Ljava/lang/Object;

    check-cast v4, Ly0/b;

    iget-object v5, v6, Lw/j$k;->b:Ljava/lang/Object;

    check-cast v5, Ly0/y;

    iget-object v14, v6, Lw/j$k;->k:Ljava/lang/Object;

    check-cast v14, Ly0/b;

    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    move-object v15, v2

    move-object v2, v4

    move-object v4, v1

    move v1, v0

    move-object v0, v5

    move-object/from16 v5, p1

    move-object/from16 v20, v14

    move-object v14, v3

    move-object/from16 v3, v20

    goto/16 :goto_4

    :cond_3
    iget-boolean v0, v6, Lw/j$k;->h:Z

    iget-object v1, v6, Lw/j$k;->b:Ljava/lang/Object;

    check-cast v1, Ly0/y;

    iget-object v2, v6, Lw/j$k;->k:Ljava/lang/Object;

    check-cast v2, Ly0/b;

    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    move/from16 v17, v0

    move-object/from16 v0, p1

    goto :goto_1

    :cond_4
    iget-object v0, v6, Lw/j$k;->k:Ljava/lang/Object;

    check-cast v0, Ly0/b;

    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    :cond_5
    move-object v14, v0

    goto :goto_0

    :cond_6
    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object v0, v6, Lw/j$k;->k:Ljava/lang/Object;

    check-cast v0, Ly0/b;

    sget-object v2, Ly0/p;->Initial:Ly0/p;

    iput-object v0, v6, Lw/j$k;->k:Ljava/lang/Object;

    iput v12, v6, Lw/j$k;->j:I

    invoke-static {v0, v11, v2, v6}, Lw/B;->e(Ly0/b;ZLy0/p;Ldh/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v7, :cond_5

    return-object v7

    :goto_0
    move-object v15, v2

    check-cast v15, Ly0/y;

    iget-object v0, v6, Lw/j$k;->l:Lmh/a;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-nez v5, :cond_7

    invoke-virtual {v15}, Ly0/y;->a()V

    :cond_7
    iput-object v14, v6, Lw/j$k;->k:Ljava/lang/Object;

    iput-object v15, v6, Lw/j$k;->b:Ljava/lang/Object;

    iput-boolean v5, v6, Lw/j$k;->h:Z

    iput v1, v6, Lw/j$k;->j:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x2

    const/16 v16, 0x0

    move-object v0, v14

    move-object/from16 v3, p0

    move/from16 v17, v5

    move-object/from16 v5, v16

    invoke-static/range {v0 .. v5}, Lw/B;->f(Ly0/b;ZLy0/p;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_8

    return-object v7

    :cond_8
    move-object v2, v14

    move-object v1, v15

    :goto_1
    check-cast v0, Ly0/y;

    iget-object v3, v6, Lw/j$k;->m:Lkotlin/jvm/internal/M;

    sget-object v4, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v4}, Ll0/g$a;->c()J

    move-result-wide v4

    iput-wide v4, v3, Lkotlin/jvm/internal/M;->a:J

    if-eqz v17, :cond_18

    :goto_2
    invoke-virtual {v0}, Ly0/y;->f()J

    move-result-wide v3

    invoke-virtual {v0}, Ly0/y;->n()I

    move-result v1

    iget-object v5, v6, Lw/j$k;->n:Lw/q;

    iget-object v14, v6, Lw/j$k;->m:Lkotlin/jvm/internal/M;

    invoke-interface {v2}, Ly0/b;->Z()Ly0/n;

    move-result-object v15

    invoke-static {v15, v3, v4}, Lw/j;->a(Ly0/n;J)Z

    move-result v15

    if-eqz v15, :cond_9

    move-object v1, v13

    goto/16 :goto_e

    :cond_9
    invoke-interface {v2}, Ly0/b;->getViewConfiguration()Landroidx/compose/ui/platform/w1;

    move-result-object v15

    invoke-static {v15, v1}, Lw/j;->j(Landroidx/compose/ui/platform/w1;I)F

    move-result v1

    new-instance v15, Lkotlin/jvm/internal/M;

    invoke-direct {v15}, Lkotlin/jvm/internal/M;-><init>()V

    iput-wide v3, v15, Lkotlin/jvm/internal/M;->a:J

    new-instance v3, Lw/E;

    invoke-direct {v3, v5}, Lw/E;-><init>(Lw/q;)V

    move-object v4, v3

    move-object v3, v2

    :goto_3
    iput-object v3, v6, Lw/j$k;->k:Ljava/lang/Object;

    iput-object v0, v6, Lw/j$k;->b:Ljava/lang/Object;

    iput-object v2, v6, Lw/j$k;->c:Ljava/lang/Object;

    iput-object v14, v6, Lw/j$k;->d:Ljava/lang/Object;

    iput-object v15, v6, Lw/j$k;->e:Ljava/lang/Object;

    iput-object v4, v6, Lw/j$k;->f:Ljava/lang/Object;

    iput-object v13, v6, Lw/j$k;->g:Ljava/lang/Object;

    iput v1, v6, Lw/j$k;->i:F

    iput v10, v6, Lw/j$k;->j:I

    invoke-static {v2, v13, v6, v12, v13}, Ly0/b;->s1(Ly0/b;Ly0/p;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v7, :cond_a

    return-object v7

    :cond_a
    :goto_4
    check-cast v5, Ly0/n;

    invoke-virtual {v5}, Ly0/n;->c()Ljava/util/List;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v11

    const/4 v12, 0x0

    :goto_5
    if-ge v12, v11, :cond_c

    invoke-interface {v10, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v19, v18

    check-cast v19, Ly0/y;

    invoke-virtual/range {v19 .. v19}, Ly0/y;->f()J

    move-result-wide v8

    move-object/from16 p1, v14

    iget-wide v13, v15, Lkotlin/jvm/internal/M;->a:J

    invoke-static {v8, v9, v13, v14}, Ly0/x;->d(JJ)Z

    move-result v8

    if-eqz v8, :cond_b

    goto :goto_6

    :cond_b
    add-int/lit8 v12, v12, 0x1

    move-object/from16 v14, p1

    const/4 v8, 0x5

    const/4 v9, 0x4

    const/4 v13, 0x0

    goto :goto_5

    :cond_c
    move-object/from16 p1, v14

    const/16 v18, 0x0

    :goto_6
    move-object/from16 v8, v18

    check-cast v8, Ly0/y;

    if-nez v8, :cond_d

    :goto_7
    move-object v2, v3

    const/4 v1, 0x0

    :goto_8
    const/4 v9, 0x4

    goto/16 :goto_e

    :cond_d
    invoke-virtual {v8}, Ly0/y;->p()Z

    move-result v9

    if-eqz v9, :cond_e

    goto :goto_7

    :cond_e
    invoke-static {v8}, Ly0/o;->d(Ly0/y;)Z

    move-result v9

    if-eqz v9, :cond_12

    invoke-virtual {v5}, Ly0/n;->c()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v8

    const/4 v9, 0x0

    :goto_9
    if-ge v9, v8, :cond_10

    invoke-interface {v5, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    move-object v11, v10

    check-cast v11, Ly0/y;

    invoke-virtual {v11}, Ly0/y;->i()Z

    move-result v11

    if-eqz v11, :cond_f

    goto :goto_a

    :cond_f
    add-int/lit8 v9, v9, 0x1

    goto :goto_9

    :cond_10
    const/4 v10, 0x0

    :goto_a
    check-cast v10, Ly0/y;

    if-nez v10, :cond_11

    goto :goto_7

    :cond_11
    invoke-virtual {v10}, Ly0/y;->f()J

    move-result-wide v8

    iput-wide v8, v15, Lkotlin/jvm/internal/M;->a:J

    move-object/from16 v14, p1

    goto :goto_b

    :cond_12
    invoke-virtual {v4, v8, v1}, Lw/E;->a(Ly0/y;F)Ll0/g;

    move-result-object v5

    if-eqz v5, :cond_14

    invoke-virtual {v5}, Ll0/g;->v()J

    move-result-wide v9

    invoke-virtual {v8}, Ly0/y;->a()V

    move-object/from16 v14, p1

    iput-wide v9, v14, Lkotlin/jvm/internal/M;->a:J

    invoke-virtual {v8}, Ly0/y;->p()Z

    move-result v5

    if-eqz v5, :cond_13

    move-object v2, v3

    move-object v1, v8

    goto :goto_8

    :cond_13
    invoke-virtual {v4}, Lw/E;->e()V

    :goto_b
    const/4 v8, 0x5

    const/4 v9, 0x4

    :goto_c
    const/4 v10, 0x3

    const/4 v11, 0x0

    const/4 v12, 0x1

    const/4 v13, 0x0

    goto/16 :goto_3

    :cond_14
    move-object/from16 v14, p1

    sget-object v5, Ly0/p;->Final:Ly0/p;

    iput-object v3, v6, Lw/j$k;->k:Ljava/lang/Object;

    iput-object v0, v6, Lw/j$k;->b:Ljava/lang/Object;

    iput-object v2, v6, Lw/j$k;->c:Ljava/lang/Object;

    iput-object v14, v6, Lw/j$k;->d:Ljava/lang/Object;

    iput-object v15, v6, Lw/j$k;->e:Ljava/lang/Object;

    iput-object v4, v6, Lw/j$k;->f:Ljava/lang/Object;

    iput-object v8, v6, Lw/j$k;->g:Ljava/lang/Object;

    iput v1, v6, Lw/j$k;->i:F

    const/4 v9, 0x4

    iput v9, v6, Lw/j$k;->j:I

    invoke-interface {v2, v5, v6}, Ly0/b;->A1(Ly0/p;Ldh/e;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v7, :cond_15

    return-object v7

    :cond_15
    move-object v5, v2

    move v2, v1

    move-object v1, v8

    :goto_d
    invoke-virtual {v1}, Ly0/y;->p()Z

    move-result v1

    if-eqz v1, :cond_17

    move-object v2, v3

    const/4 v1, 0x0

    :goto_e
    if-eqz v1, :cond_18

    invoke-virtual {v1}, Ly0/y;->p()Z

    move-result v3

    if-eqz v3, :cond_16

    goto :goto_f

    :cond_16
    const/4 v8, 0x5

    const/4 v10, 0x3

    const/4 v11, 0x0

    const/4 v12, 0x1

    const/4 v13, 0x0

    goto/16 :goto_2

    :cond_17
    move v1, v2

    move-object v2, v5

    const/4 v8, 0x5

    goto :goto_c

    :cond_18
    :goto_f
    if-eqz v1, :cond_2a

    iget-object v3, v6, Lw/j$k;->o:Lmh/q;

    iget-object v4, v6, Lw/j$k;->m:Lkotlin/jvm/internal/M;

    iget-wide v4, v4, Lkotlin/jvm/internal/M;->a:J

    invoke-static {v4, v5}, Ll0/g;->d(J)Ll0/g;

    move-result-object v4

    invoke-interface {v3, v0, v1, v4}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v6, Lw/j$k;->p:Lmh/p;

    iget-object v3, v6, Lw/j$k;->m:Lkotlin/jvm/internal/M;

    iget-wide v3, v3, Lkotlin/jvm/internal/M;->a:J

    invoke-static {v3, v4}, Ll0/g;->d(J)Ll0/g;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Ly0/y;->f()J

    move-result-wide v0

    iget-object v3, v6, Lw/j$k;->p:Lmh/p;

    iget-object v4, v6, Lw/j$k;->n:Lw/q;

    invoke-interface {v2}, Ly0/b;->Z()Ly0/n;

    move-result-object v5

    invoke-static {v5, v0, v1}, Lw/j;->a(Ly0/n;J)Z

    move-result v5

    if-eqz v5, :cond_19

    :goto_10
    const/4 v13, 0x0

    goto/16 :goto_1b

    :cond_19
    :goto_11
    new-instance v5, Lkotlin/jvm/internal/M;

    invoke-direct {v5}, Lkotlin/jvm/internal/M;-><init>()V

    iput-wide v0, v5, Lkotlin/jvm/internal/M;->a:J

    move-object v1, v2

    move-object v0, v5

    move-object v2, v4

    move-object v4, v1

    :goto_12
    iput-object v4, v6, Lw/j$k;->k:Ljava/lang/Object;

    iput-object v3, v6, Lw/j$k;->b:Ljava/lang/Object;

    iput-object v2, v6, Lw/j$k;->c:Ljava/lang/Object;

    iput-object v1, v6, Lw/j$k;->d:Ljava/lang/Object;

    iput-object v0, v6, Lw/j$k;->e:Ljava/lang/Object;

    const/4 v5, 0x0

    iput-object v5, v6, Lw/j$k;->f:Ljava/lang/Object;

    iput-object v5, v6, Lw/j$k;->g:Ljava/lang/Object;

    const/4 v8, 0x5

    iput v8, v6, Lw/j$k;->j:I

    const/4 v9, 0x1

    invoke-static {v1, v5, v6, v9, v5}, Ly0/b;->s1(Ly0/b;Ly0/p;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v7, :cond_1a

    return-object v7

    :cond_1a
    :goto_13
    check-cast v10, Ly0/n;

    invoke-virtual {v10}, Ly0/n;->c()Ljava/util/List;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v12

    const/4 v13, 0x0

    :goto_14
    if-ge v13, v12, :cond_1c

    invoke-interface {v11, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    move-object v15, v14

    check-cast v15, Ly0/y;

    invoke-virtual {v15}, Ly0/y;->f()J

    move-result-wide v8

    iget-wide v5, v0, Lkotlin/jvm/internal/M;->a:J

    invoke-static {v8, v9, v5, v6}, Ly0/x;->d(JJ)Z

    move-result v5

    if-eqz v5, :cond_1b

    goto :goto_15

    :cond_1b
    add-int/lit8 v13, v13, 0x1

    const/4 v5, 0x0

    const/4 v8, 0x5

    const/4 v9, 0x1

    move-object/from16 v6, p0

    goto :goto_14

    :cond_1c
    const/4 v14, 0x0

    :goto_15
    check-cast v14, Ly0/y;

    if-nez v14, :cond_1d

    const/4 v14, 0x0

    goto :goto_1a

    :cond_1d
    invoke-static {v14}, Ly0/o;->d(Ly0/y;)Z

    move-result v5

    if-eqz v5, :cond_22

    invoke-virtual {v10}, Ly0/n;->c()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    const/4 v8, 0x0

    :goto_16
    if-ge v8, v6, :cond_1f

    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Ly0/y;

    invoke-virtual {v10}, Ly0/y;->i()Z

    move-result v10

    if-eqz v10, :cond_1e

    goto :goto_17

    :cond_1e
    add-int/lit8 v8, v8, 0x1

    goto :goto_16

    :cond_1f
    const/4 v9, 0x0

    :goto_17
    check-cast v9, Ly0/y;

    if-nez v9, :cond_20

    goto :goto_1a

    :cond_20
    invoke-virtual {v9}, Ly0/y;->f()J

    move-result-wide v5

    iput-wide v5, v0, Lkotlin/jvm/internal/M;->a:J

    :cond_21
    move-object/from16 v5, p0

    goto/16 :goto_1c

    :cond_22
    invoke-static {v14}, Ly0/o;->h(Ly0/y;)J

    move-result-wide v5

    if-nez v2, :cond_23

    invoke-static {v5, v6}, Ll0/g;->k(J)F

    move-result v5

    goto :goto_18

    :cond_23
    sget-object v8, Lw/q;->Vertical:Lw/q;

    if-ne v2, v8, :cond_24

    invoke-static {v5, v6}, Ll0/g;->n(J)F

    move-result v5

    goto :goto_18

    :cond_24
    invoke-static {v5, v6}, Ll0/g;->m(J)F

    move-result v5

    :goto_18
    const/4 v6, 0x0

    cmpg-float v5, v5, v6

    if-nez v5, :cond_25

    const/4 v5, 0x1

    goto :goto_19

    :cond_25
    const/4 v5, 0x0

    :goto_19
    if-nez v5, :cond_21

    :goto_1a
    if-nez v14, :cond_26

    goto/16 :goto_10

    :cond_26
    invoke-virtual {v14}, Ly0/y;->p()Z

    move-result v0

    if-eqz v0, :cond_27

    goto/16 :goto_10

    :cond_27
    invoke-static {v14}, Ly0/o;->d(Ly0/y;)Z

    move-result v0

    if-eqz v0, :cond_29

    move-object v13, v14

    :goto_1b
    if-nez v13, :cond_28

    move-object/from16 v5, p0

    iget-object v0, v5, Lw/j$k;->q:Lmh/a;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    goto :goto_1d

    :cond_28
    move-object/from16 v5, p0

    iget-object v0, v5, Lw/j$k;->r:Lmh/l;

    invoke-interface {v0, v13}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1d

    :cond_29
    move-object/from16 v5, p0

    invoke-static {v14}, Ly0/o;->g(Ly0/y;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/g;->d(J)Ll0/g;

    move-result-object v0

    invoke-interface {v3, v14, v0}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v14}, Ly0/y;->a()V

    invoke-virtual {v14}, Ly0/y;->f()J

    move-result-wide v0

    move-object v6, v5

    move-object/from16 v20, v4

    move-object v4, v2

    move-object/from16 v2, v20

    goto/16 :goto_11

    :goto_1c
    move-object v6, v5

    goto/16 :goto_12

    :cond_2a
    move-object v5, v6

    :goto_1d
    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method public final n(Ly0/b;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lw/j$k;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lw/j$k;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lw/j$k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
