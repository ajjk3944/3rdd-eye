.class final Lr/c0$d$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr/c0$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field c:I

.field final synthetic d:Lr/c0;

.field final synthetic e:Ljava/lang/Object;

.field final synthetic f:Lr/o0;

.field final synthetic g:Lr/H;


# direct methods
.method constructor <init>(Lr/c0;Ljava/lang/Object;Lr/o0;Lr/H;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lr/c0$d$a;->d:Lr/c0;

    iput-object p2, p0, Lr/c0$d$a;->e:Ljava/lang/Object;

    iput-object p3, p0, Lr/c0$d$a;->f:Lr/o0;

    iput-object p4, p0, Lr/c0$d$a;->g:Lr/H;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 6

    new-instance p1, Lr/c0$d$a;

    iget-object v1, p0, Lr/c0$d$a;->d:Lr/c0;

    iget-object v2, p0, Lr/c0$d$a;->e:Ljava/lang/Object;

    iget-object v3, p0, Lr/c0$d$a;->f:Lr/o0;

    iget-object v4, p0, Lr/c0$d$a;->g:Lr/H;

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lr/c0$d$a;-><init>(Lr/c0;Ljava/lang/Object;Lr/o0;Lr/H;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lr/c0$d$a;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v1, p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v2, v1, Lr/c0$d$a;->c:I

    const/4 v3, 0x5

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    if-eqz v2, :cond_5

    if-eq v2, v7, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_9

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_2
    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_3
    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_4
    iget-object v2, v1, Lr/c0$d$a;->b:Ljava/lang/Object;

    check-cast v2, Lr/c0;

    iget-object v7, v1, Lr/c0$d$a;->a:Ljava/lang/Object;

    check-cast v7, LTi/a;

    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_5
    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object v2, v1, Lr/c0$d$a;->d:Lr/c0;

    invoke-virtual {v2}, Lr/c0;->b()Ljava/lang/Object;

    move-result-object v2

    iget-object v12, v1, Lr/c0$d$a;->e:Ljava/lang/Object;

    invoke-static {v12, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_6

    iget-object v12, v1, Lr/c0$d$a;->d:Lr/c0;

    invoke-static {v12}, Lr/c0;->r(Lr/c0;)V

    iget-object v12, v1, Lr/c0$d$a;->d:Lr/c0;

    invoke-static {v12, v10}, Lr/c0;->w(Lr/c0;F)V

    iget-object v12, v1, Lr/c0$d$a;->f:Lr/o0;

    iget-object v13, v1, Lr/c0$d$a;->e:Ljava/lang/Object;

    invoke-virtual {v12, v13}, Lr/o0;->R(Ljava/lang/Object;)V

    iget-object v12, v1, Lr/c0$d$a;->f:Lr/o0;

    invoke-virtual {v12, v8, v9}, Lr/o0;->J(J)V

    iget-object v12, v1, Lr/c0$d$a;->d:Lr/c0;

    invoke-virtual {v12, v2}, Lr/c0;->d(Ljava/lang/Object;)V

    iget-object v2, v1, Lr/c0$d$a;->d:Lr/c0;

    iget-object v12, v1, Lr/c0$d$a;->e:Ljava/lang/Object;

    invoke-virtual {v2, v12}, Lr/c0;->V(Ljava/lang/Object;)V

    :cond_6
    iget-object v2, v1, Lr/c0$d$a;->d:Lr/c0;

    invoke-virtual {v2}, Lr/c0;->H()LTi/a;

    move-result-object v2

    iget-object v12, v1, Lr/c0$d$a;->d:Lr/c0;

    iput-object v2, v1, Lr/c0$d$a;->a:Ljava/lang/Object;

    iput-object v12, v1, Lr/c0$d$a;->b:Ljava/lang/Object;

    iput v7, v1, Lr/c0$d$a;->c:I

    invoke-interface {v2, v11, v1}, LTi/a;->a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v0, :cond_7

    return-object v0

    :cond_7
    move-object v7, v2

    move-object v2, v12

    :goto_0
    :try_start_0
    invoke-virtual {v2}, Lr/c0;->F()Ljava/lang/Object;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v7, v11}, LTi/a;->d(Ljava/lang/Object;)V

    iget-object v7, v1, Lr/c0$d$a;->e:Ljava/lang/Object;

    invoke-static {v7, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    iget-object v2, v1, Lr/c0$d$a;->d:Lr/c0;

    iput-object v11, v1, Lr/c0$d$a;->a:Ljava/lang/Object;

    iput-object v11, v1, Lr/c0$d$a;->b:Ljava/lang/Object;

    iput v6, v1, Lr/c0$d$a;->c:I

    invoke-static {v2, v1}, Lr/c0;->h(Lr/c0;Ldh/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_8

    return-object v0

    :cond_8
    :goto_1
    iget-object v2, v1, Lr/c0$d$a;->d:Lr/c0;

    iput v5, v1, Lr/c0$d$a;->c:I

    invoke-static {v2, v1}, Lr/c0;->z(Lr/c0;Ldh/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_9

    return-object v0

    :cond_9
    :goto_2
    iget-object v2, v1, Lr/c0$d$a;->d:Lr/c0;

    invoke-virtual {v2}, Lr/c0;->a()Ljava/lang/Object;

    move-result-object v2

    iget-object v5, v1, Lr/c0$d$a;->e:Ljava/lang/Object;

    invoke-static {v2, v5}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_18

    iget-object v2, v1, Lr/c0$d$a;->d:Lr/c0;

    invoke-virtual {v2}, Lr/c0;->I()F

    move-result v2

    const/high16 v5, 0x3f800000    # 1.0f

    cmpg-float v2, v2, v5

    if-gez v2, :cond_15

    iget-object v2, v1, Lr/c0$d$a;->d:Lr/c0;

    invoke-static {v2}, Lr/c0;->k(Lr/c0;)Lr/c0$b;

    move-result-object v2

    iget-object v6, v1, Lr/c0$d$a;->g:Lr/H;

    if-eqz v6, :cond_a

    sget-object v7, Lkotlin/jvm/internal/l;->a:Lkotlin/jvm/internal/l;

    invoke-static {v7}, Lr/u0;->f(Lkotlin/jvm/internal/l;)Lr/s0;

    move-result-object v7

    invoke-interface {v6, v7}, Lr/H;->a(Lr/s0;)Lr/z0;

    move-result-object v6

    goto :goto_3

    :cond_a
    move-object v6, v11

    :goto_3
    if-eqz v2, :cond_b

    invoke-virtual {v2}, Lr/c0$b;->a()Lr/v0;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_15

    :cond_b
    if-eqz v2, :cond_c

    invoke-virtual {v2}, Lr/c0$b;->a()Lr/v0;

    move-result-object v7

    move-object v12, v7

    goto :goto_4

    :cond_c
    move-object v12, v11

    :goto_4
    if-eqz v12, :cond_e

    invoke-virtual {v2}, Lr/c0$b;->e()J

    move-result-wide v13

    invoke-virtual {v2}, Lr/c0$b;->f()Lr/m;

    move-result-object v15

    invoke-static {}, Lr/c0;->j()Lr/c0$a;

    move-result-object v5

    invoke-virtual {v5}, Lr/c0$a;->a()Lr/m;

    move-result-object v16

    invoke-virtual {v2}, Lr/c0$b;->d()Lr/m;

    move-result-object v5

    if-nez v5, :cond_d

    invoke-static {}, Lr/c0;->j()Lr/c0$a;

    move-result-object v5

    invoke-virtual {v5}, Lr/c0$a;->b()Lr/m;

    move-result-object v5

    :cond_d
    move-object/from16 v17, v5

    invoke-interface/range {v12 .. v17}, Lr/v0;->f(JLr/q;Lr/q;Lr/q;)Lr/q;

    move-result-object v5

    check-cast v5, Lr/m;

    goto :goto_6

    :cond_e
    if-eqz v2, :cond_12

    invoke-virtual {v2}, Lr/c0$b;->e()J

    move-result-wide v12

    cmp-long v7, v12, v8

    if-nez v7, :cond_f

    goto :goto_5

    :cond_f
    invoke-virtual {v2}, Lr/c0$b;->c()J

    move-result-wide v12

    const-wide/high16 v14, -0x8000000000000000L

    cmp-long v7, v12, v14

    if-nez v7, :cond_10

    iget-object v7, v1, Lr/c0$d$a;->d:Lr/c0;

    invoke-virtual {v7}, Lr/c0;->J()J

    move-result-wide v12

    :cond_10
    long-to-float v7, v12

    const v12, 0x4e6e6b28    # 1.0E9f

    div-float/2addr v7, v12

    cmpg-float v12, v7, v10

    if-gtz v12, :cond_11

    invoke-static {}, Lr/c0;->j()Lr/c0$a;

    move-result-object v5

    invoke-virtual {v5}, Lr/c0$a;->b()Lr/m;

    move-result-object v5

    goto :goto_6

    :cond_11
    new-instance v12, Lr/m;

    div-float/2addr v5, v7

    invoke-direct {v12, v5}, Lr/m;-><init>(F)V

    move-object v5, v12

    goto :goto_6

    :cond_12
    :goto_5
    invoke-static {}, Lr/c0;->j()Lr/c0$a;

    move-result-object v5

    invoke-virtual {v5}, Lr/c0$a;->b()Lr/m;

    move-result-object v5

    :goto_6
    if-nez v2, :cond_13

    new-instance v2, Lr/c0$b;

    invoke-direct {v2}, Lr/c0$b;-><init>()V

    :cond_13
    invoke-virtual {v2, v6}, Lr/c0$b;->i(Lr/v0;)V

    const/4 v7, 0x0

    invoke-virtual {v2, v7}, Lr/c0$b;->k(Z)V

    iget-object v12, v1, Lr/c0$d$a;->d:Lr/c0;

    invoke-virtual {v12}, Lr/c0;->I()F

    move-result v12

    invoke-virtual {v2, v12}, Lr/c0$b;->o(F)V

    invoke-virtual {v2}, Lr/c0$b;->f()Lr/m;

    move-result-object v12

    iget-object v13, v1, Lr/c0$d$a;->d:Lr/c0;

    invoke-virtual {v13}, Lr/c0;->I()F

    move-result v13

    invoke-virtual {v12, v7, v13}, Lr/m;->e(IF)V

    iget-object v7, v1, Lr/c0$d$a;->d:Lr/c0;

    invoke-virtual {v7}, Lr/c0;->J()J

    move-result-wide v12

    invoke-virtual {v2, v12, v13}, Lr/c0$b;->l(J)V

    invoke-virtual {v2, v8, v9}, Lr/c0$b;->n(J)V

    invoke-virtual {v2, v5}, Lr/c0$b;->m(Lr/m;)V

    if-eqz v6, :cond_14

    invoke-virtual {v2}, Lr/c0$b;->f()Lr/m;

    move-result-object v7

    invoke-static {}, Lr/c0;->j()Lr/c0$a;

    move-result-object v8

    invoke-virtual {v8}, Lr/c0$a;->a()Lr/m;

    move-result-object v8

    invoke-interface {v6, v7, v8, v5}, Lr/v0;->b(Lr/q;Lr/q;Lr/q;)J

    move-result-wide v5

    goto :goto_7

    :cond_14
    iget-object v5, v1, Lr/c0$d$a;->d:Lr/c0;

    invoke-virtual {v5}, Lr/c0;->J()J

    move-result-wide v5

    long-to-double v5, v5

    iget-object v7, v1, Lr/c0$d$a;->d:Lr/c0;

    invoke-virtual {v7}, Lr/c0;->I()F

    move-result v7

    float-to-double v7, v7

    const-wide/high16 v12, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v12, v7

    mul-double/2addr v5, v12

    invoke-static {v5, v6}, Loh/b;->f(D)J

    move-result-wide v5

    :goto_7
    invoke-virtual {v2, v5, v6}, Lr/c0$b;->j(J)V

    iget-object v5, v1, Lr/c0$d$a;->d:Lr/c0;

    invoke-static {v5, v2}, Lr/c0;->v(Lr/c0;Lr/c0$b;)V

    :cond_15
    iget-object v2, v1, Lr/c0$d$a;->d:Lr/c0;

    iput-object v11, v1, Lr/c0$d$a;->a:Ljava/lang/Object;

    iput-object v11, v1, Lr/c0$d$a;->b:Ljava/lang/Object;

    iput v4, v1, Lr/c0$d$a;->c:I

    invoke-static {v2, v1}, Lr/c0;->t(Lr/c0;Ldh/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_16

    return-object v0

    :cond_16
    :goto_8
    iget-object v2, v1, Lr/c0$d$a;->d:Lr/c0;

    iget-object v4, v1, Lr/c0$d$a;->e:Ljava/lang/Object;

    invoke-virtual {v2, v4}, Lr/c0;->d(Ljava/lang/Object;)V

    iget-object v2, v1, Lr/c0$d$a;->d:Lr/c0;

    iput v3, v1, Lr/c0$d$a;->c:I

    invoke-static {v2, v1}, Lr/c0;->y(Lr/c0;Ldh/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_17

    return-object v0

    :cond_17
    :goto_9
    iget-object v0, v1, Lr/c0$d$a;->d:Lr/c0;

    invoke-static {v0, v10}, Lr/c0;->w(Lr/c0;F)V

    :cond_18
    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0

    :catchall_0
    move-exception v0

    move-object v2, v0

    invoke-interface {v7, v11}, LTi/a;->d(Ljava/lang/Object;)V

    throw v2
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lr/c0$d$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lr/c0$d$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lr/c0$d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
