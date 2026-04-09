.class public abstract Lw/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:F

.field private static final b:F

.field private static final c:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide/high16 v0, 0x3fc0000000000000L    # 0.125

    double-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, Lw/j;->a:F

    const/16 v1, 0x12

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    sput v1, Lw/j;->b:F

    div-float/2addr v0, v1

    sput v0, Lw/j;->c:F

    return-void
.end method

.method public static final synthetic a(Ly0/n;J)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lw/j;->i(Ly0/n;J)Z

    move-result p0

    return p0
.end method

.method public static final b(Ly0/b;JLdh/e;)Ljava/lang/Object;
    .locals 17

    move-wide/from16 v0, p1

    move-object/from16 v2, p3

    instance-of v3, v2, Lw/j$a;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lw/j$a;

    iget v4, v3, Lw/j$a;->d:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lw/j$a;->d:I

    goto :goto_0

    :cond_0
    new-instance v3, Lw/j$a;

    invoke-direct {v3, v2}, Lw/j$a;-><init>(Ldh/e;)V

    :goto_0
    iget-object v2, v3, Lw/j$a;->c:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v4

    iget v5, v3, Lw/j$a;->d:I

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v5, :cond_2

    if-ne v5, v6, :cond_1

    iget-object v0, v3, Lw/j$a;->b:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/M;

    iget-object v1, v3, Lw/j$a;->a:Ljava/lang/Object;

    check-cast v1, Ly0/b;

    invoke-static {v2}, LYg/v;->b(Ljava/lang/Object;)V

    move-object/from16 v16, v1

    move-object v1, v0

    move-object/from16 v0, v16

    goto :goto_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v2}, LYg/v;->b(Ljava/lang/Object;)V

    invoke-interface/range {p0 .. p0}, Ly0/b;->Z()Ly0/n;

    move-result-object v2

    invoke-static {v2, v0, v1}, Lw/j;->i(Ly0/n;J)Z

    move-result v2

    if-eqz v2, :cond_3

    return-object v7

    :cond_3
    new-instance v2, Lkotlin/jvm/internal/M;

    invoke-direct {v2}, Lkotlin/jvm/internal/M;-><init>()V

    iput-wide v0, v2, Lkotlin/jvm/internal/M;->a:J

    move-object/from16 v0, p0

    :goto_1
    iput-object v0, v3, Lw/j$a;->a:Ljava/lang/Object;

    iput-object v2, v3, Lw/j$a;->b:Ljava/lang/Object;

    iput v6, v3, Lw/j$a;->d:I

    invoke-static {v0, v7, v3, v6, v7}, Ly0/b;->s1(Ly0/b;Ly0/p;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_4

    return-object v4

    :cond_4
    move-object/from16 v16, v2

    move-object v2, v1

    move-object/from16 v1, v16

    :goto_2
    check-cast v2, Ly0/n;

    invoke-virtual {v2}, Ly0/n;->c()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v8

    const/4 v9, 0x0

    move v10, v9

    :goto_3
    if-ge v10, v8, :cond_6

    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, Ly0/y;

    invoke-virtual {v12}, Ly0/y;->f()J

    move-result-wide v12

    iget-wide v14, v1, Lkotlin/jvm/internal/M;->a:J

    invoke-static {v12, v13, v14, v15}, Ly0/x;->d(JJ)Z

    move-result v12

    if-eqz v12, :cond_5

    goto :goto_4

    :cond_5
    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    :cond_6
    move-object v11, v7

    :goto_4
    check-cast v11, Ly0/y;

    if-nez v11, :cond_7

    move-object v11, v7

    goto :goto_7

    :cond_7
    invoke-static {v11}, Ly0/o;->d(Ly0/y;)Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-virtual {v2}, Ly0/n;->c()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    :goto_5
    if-ge v9, v5, :cond_9

    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    move-object v10, v8

    check-cast v10, Ly0/y;

    invoke-virtual {v10}, Ly0/y;->i()Z

    move-result v10

    if-eqz v10, :cond_8

    goto :goto_6

    :cond_8
    add-int/lit8 v9, v9, 0x1

    goto :goto_5

    :cond_9
    move-object v8, v7

    :goto_6
    check-cast v8, Ly0/y;

    if-nez v8, :cond_a

    goto :goto_7

    :cond_a
    invoke-virtual {v8}, Ly0/y;->f()J

    move-result-wide v8

    iput-wide v8, v1, Lkotlin/jvm/internal/M;->a:J

    goto :goto_8

    :cond_b
    invoke-static {v11}, Ly0/o;->k(Ly0/y;)Z

    move-result v2

    if-eqz v2, :cond_d

    :goto_7
    if-eqz v11, :cond_c

    invoke-virtual {v11}, Ly0/y;->p()Z

    move-result v0

    if-nez v0, :cond_c

    move-object v7, v11

    :cond_c
    return-object v7

    :cond_d
    :goto_8
    move-object v2, v1

    goto :goto_1
.end method

.method public static final c(Ly0/b;JLdh/e;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p3, Lw/j$b;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lw/j$b;

    iget v1, v0, Lw/j$b;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lw/j$b;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lw/j$b;

    invoke-direct {v0, p3}, Lw/j$b;-><init>(Ldh/e;)V

    :goto_0
    iget-object p3, v0, Lw/j$b;->c:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lw/j$b;->d:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lw/j$b;->b:Ljava/lang/Object;

    check-cast p0, Lkotlin/jvm/internal/N;

    iget-object p1, v0, Lw/j$b;->a:Ljava/lang/Object;

    check-cast p1, Ly0/y;

    :try_start_0
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException; {:try_start_0 .. :try_end_0} :catch_1

    goto/16 :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    invoke-interface {p0}, Ly0/b;->Z()Ly0/n;

    move-result-object p3

    invoke-static {p3, p1, p2}, Lw/j;->i(Ly0/n;J)Z

    move-result p3

    if-eqz p3, :cond_3

    return-object v4

    :cond_3
    invoke-interface {p0}, Ly0/b;->Z()Ly0/n;

    move-result-object p3

    invoke-virtual {p3}, Ly0/n;->c()Ljava/util/List;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v2

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v2, :cond_5

    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Ly0/y;

    invoke-virtual {v7}, Ly0/y;->f()J

    move-result-wide v7

    invoke-static {v7, v8, p1, p2}, Ly0/x;->d(JJ)Z

    move-result v7

    if-eqz v7, :cond_4

    goto :goto_2

    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_5
    move-object v6, v4

    :goto_2
    move-object p1, v6

    check-cast p1, Ly0/y;

    if-nez p1, :cond_6

    return-object v4

    :cond_6
    new-instance p2, Lkotlin/jvm/internal/N;

    invoke-direct {p2}, Lkotlin/jvm/internal/N;-><init>()V

    new-instance p3, Lkotlin/jvm/internal/N;

    invoke-direct {p3}, Lkotlin/jvm/internal/N;-><init>()V

    iput-object p1, p3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-interface {p0}, Ly0/b;->getViewConfiguration()Landroidx/compose/ui/platform/w1;

    move-result-object v2

    invoke-interface {v2}, Landroidx/compose/ui/platform/w1;->c()J

    move-result-wide v5

    :try_start_1
    new-instance v2, Lw/j$c;

    invoke-direct {v2, p3, p2, v4}, Lw/j$c;-><init>(Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;Ldh/e;)V

    iput-object p1, v0, Lw/j$b;->a:Ljava/lang/Object;

    iput-object p2, v0, Lw/j$b;->b:Ljava/lang/Object;

    iput v3, v0, Lw/j$b;->d:I

    invoke-interface {p0, v5, v6, v2, v0}, Ly0/b;->O0(JLmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p0, v1, :cond_8

    return-object v1

    :catch_0
    move-object p0, p2

    :catch_1
    iget-object p0, p0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast p0, Ly0/y;

    if-nez p0, :cond_7

    move-object v4, p1

    goto :goto_3

    :cond_7
    move-object v4, p0

    :cond_8
    :goto_3
    return-object v4
.end method

.method public static final d(Ly0/b;JLmh/p;Ldh/e;)Ljava/lang/Object;
    .locals 18

    move-wide/from16 v0, p1

    move-object/from16 v2, p4

    instance-of v3, v2, Lw/j$d;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lw/j$d;

    iget v4, v3, Lw/j$d;->h:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lw/j$d;->h:I

    goto :goto_0

    :cond_0
    new-instance v3, Lw/j$d;

    invoke-direct {v3, v2}, Lw/j$d;-><init>(Ldh/e;)V

    :goto_0
    iget-object v2, v3, Lw/j$d;->g:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v4

    iget v5, v3, Lw/j$d;->h:I

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v5, :cond_3

    if-eq v5, v7, :cond_2

    if-ne v5, v6, :cond_1

    iget v0, v3, Lw/j$d;->f:F

    iget-object v1, v3, Lw/j$d;->e:Ljava/lang/Object;

    check-cast v1, Ly0/y;

    iget-object v5, v3, Lw/j$d;->d:Ljava/lang/Object;

    check-cast v5, Lw/E;

    iget-object v9, v3, Lw/j$d;->c:Ljava/lang/Object;

    check-cast v9, Lkotlin/jvm/internal/M;

    iget-object v10, v3, Lw/j$d;->b:Ljava/lang/Object;

    check-cast v10, Ly0/b;

    iget-object v11, v3, Lw/j$d;->a:Ljava/lang/Object;

    check-cast v11, Lmh/p;

    invoke-static {v2}, LYg/v;->b(Ljava/lang/Object;)V

    move-object v2, v5

    move-object v5, v3

    move v3, v0

    move-object v0, v10

    goto/16 :goto_a

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget v0, v3, Lw/j$d;->f:F

    iget-object v1, v3, Lw/j$d;->d:Ljava/lang/Object;

    check-cast v1, Lw/E;

    iget-object v5, v3, Lw/j$d;->c:Ljava/lang/Object;

    check-cast v5, Lkotlin/jvm/internal/M;

    iget-object v9, v3, Lw/j$d;->b:Ljava/lang/Object;

    check-cast v9, Ly0/b;

    iget-object v10, v3, Lw/j$d;->a:Ljava/lang/Object;

    check-cast v10, Lmh/p;

    invoke-static {v2}, LYg/v;->b(Ljava/lang/Object;)V

    move-object/from16 v17, v5

    move v5, v0

    move-object v0, v9

    move-object v9, v3

    move-object v3, v1

    move-object v1, v10

    move-object/from16 v10, v17

    goto :goto_2

    :cond_3
    invoke-static {v2}, LYg/v;->b(Ljava/lang/Object;)V

    sget-object v2, Ly0/L;->a:Ly0/L$a;

    invoke-virtual {v2}, Ly0/L$a;->d()I

    move-result v2

    invoke-interface/range {p0 .. p0}, Ly0/b;->Z()Ly0/n;

    move-result-object v5

    invoke-static {v5, v0, v1}, Lw/j;->a(Ly0/n;J)Z

    move-result v5

    if-eqz v5, :cond_4

    goto/16 :goto_b

    :cond_4
    invoke-interface/range {p0 .. p0}, Ly0/b;->getViewConfiguration()Landroidx/compose/ui/platform/w1;

    move-result-object v5

    invoke-static {v5, v2}, Lw/j;->j(Landroidx/compose/ui/platform/w1;I)F

    move-result v2

    new-instance v5, Lkotlin/jvm/internal/M;

    invoke-direct {v5}, Lkotlin/jvm/internal/M;-><init>()V

    iput-wide v0, v5, Lkotlin/jvm/internal/M;->a:J

    new-instance v0, Lw/E;

    invoke-direct {v0, v8}, Lw/E;-><init>(Lw/q;)V

    move-object/from16 v1, p3

    move-object v9, v5

    move-object v5, v3

    move v3, v2

    move-object v2, v0

    move-object/from16 v0, p0

    :goto_1
    iput-object v1, v5, Lw/j$d;->a:Ljava/lang/Object;

    iput-object v0, v5, Lw/j$d;->b:Ljava/lang/Object;

    iput-object v9, v5, Lw/j$d;->c:Ljava/lang/Object;

    iput-object v2, v5, Lw/j$d;->d:Ljava/lang/Object;

    iput-object v8, v5, Lw/j$d;->e:Ljava/lang/Object;

    iput v3, v5, Lw/j$d;->f:F

    iput v7, v5, Lw/j$d;->h:I

    invoke-static {v0, v8, v5, v7, v8}, Ly0/b;->s1(Ly0/b;Ly0/p;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v4, :cond_5

    return-object v4

    :cond_5
    move/from16 v17, v3

    move-object v3, v2

    move-object v2, v10

    move-object v10, v9

    move-object v9, v5

    move/from16 v5, v17

    :goto_2
    check-cast v2, Ly0/n;

    invoke-virtual {v2}, Ly0/n;->c()Ljava/util/List;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v12

    const/4 v14, 0x0

    :goto_3
    if-ge v14, v12, :cond_7

    invoke-interface {v11, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    move-object/from16 v16, v15

    check-cast v16, Ly0/y;

    invoke-virtual/range {v16 .. v16}, Ly0/y;->f()J

    move-result-wide v7

    move/from16 v16, v14

    iget-wide v13, v10, Lkotlin/jvm/internal/M;->a:J

    invoke-static {v7, v8, v13, v14}, Ly0/x;->d(JJ)Z

    move-result v7

    if-eqz v7, :cond_6

    goto :goto_4

    :cond_6
    add-int/lit8 v14, v16, 0x1

    const/4 v7, 0x1

    const/4 v8, 0x0

    goto :goto_3

    :cond_7
    const/4 v15, 0x0

    :goto_4
    move-object v7, v15

    check-cast v7, Ly0/y;

    if-nez v7, :cond_8

    :goto_5
    const/4 v8, 0x0

    goto/16 :goto_b

    :cond_8
    invoke-virtual {v7}, Ly0/y;->p()Z

    move-result v8

    if-eqz v8, :cond_9

    goto :goto_5

    :cond_9
    invoke-static {v7}, Ly0/o;->d(Ly0/y;)Z

    move-result v8

    if-eqz v8, :cond_d

    invoke-virtual {v2}, Ly0/n;->c()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v7

    const/4 v13, 0x0

    :goto_6
    if-ge v13, v7, :cond_b

    invoke-interface {v2, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    move-object v11, v8

    check-cast v11, Ly0/y;

    invoke-virtual {v11}, Ly0/y;->i()Z

    move-result v11

    if-eqz v11, :cond_a

    goto :goto_7

    :cond_a
    add-int/lit8 v13, v13, 0x1

    goto :goto_6

    :cond_b
    const/4 v8, 0x0

    :goto_7
    check-cast v8, Ly0/y;

    if-nez v8, :cond_c

    goto :goto_5

    :cond_c
    invoke-virtual {v8}, Ly0/y;->f()J

    move-result-wide v7

    iput-wide v7, v10, Lkotlin/jvm/internal/M;->a:J

    goto :goto_8

    :cond_d
    invoke-virtual {v3, v7, v5}, Lw/E;->a(Ly0/y;F)Ll0/g;

    move-result-object v2

    if-eqz v2, :cond_f

    invoke-interface {v1, v7, v2}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v7}, Ly0/y;->p()Z

    move-result v2

    if-eqz v2, :cond_e

    move-object v8, v7

    goto :goto_b

    :cond_e
    invoke-virtual {v3}, Lw/E;->e()V

    :goto_8
    move-object v2, v3

    move v3, v5

    move-object v5, v9

    move-object v9, v10

    :goto_9
    const/4 v7, 0x1

    const/4 v8, 0x0

    goto/16 :goto_1

    :cond_f
    sget-object v2, Ly0/p;->Final:Ly0/p;

    iput-object v1, v9, Lw/j$d;->a:Ljava/lang/Object;

    iput-object v0, v9, Lw/j$d;->b:Ljava/lang/Object;

    iput-object v10, v9, Lw/j$d;->c:Ljava/lang/Object;

    iput-object v3, v9, Lw/j$d;->d:Ljava/lang/Object;

    iput-object v7, v9, Lw/j$d;->e:Ljava/lang/Object;

    iput v5, v9, Lw/j$d;->f:F

    iput v6, v9, Lw/j$d;->h:I

    invoke-interface {v0, v2, v9}, Ly0/b;->A1(Ly0/p;Ldh/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_10

    return-object v4

    :cond_10
    move-object v11, v1

    move-object v2, v3

    move v3, v5

    move-object v1, v7

    move-object v5, v9

    move-object v9, v10

    :goto_a
    invoke-virtual {v1}, Ly0/y;->p()Z

    move-result v1

    if-eqz v1, :cond_11

    goto :goto_5

    :goto_b
    return-object v8

    :cond_11
    move-object v1, v11

    goto :goto_9
.end method

.method public static final e(Ly0/G;Lmh/l;Lmh/a;Lmh/a;Lmh/p;Ldh/e;)Ljava/lang/Object;
    .locals 8

    new-instance v1, Lw/j$h;

    invoke-direct {v1, p1}, Lw/j$h;-><init>(Lmh/l;)V

    new-instance v2, Lw/j$i;

    invoke-direct {v2, p2}, Lw/j$i;-><init>(Lmh/a;)V

    sget-object v4, Lw/j$j;->a:Lw/j$j;

    const/4 v5, 0x0

    move-object v0, p0

    move-object v3, p3

    move-object v6, p4

    move-object v7, p5

    invoke-static/range {v0 .. v7}, Lw/j;->f(Ly0/G;Lmh/q;Lmh/l;Lmh/a;Lmh/a;Lw/q;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final f(Ly0/G;Lmh/q;Lmh/l;Lmh/a;Lmh/a;Lw/q;Lmh/p;Ldh/e;)Ljava/lang/Object;
    .locals 10

    new-instance v2, Lkotlin/jvm/internal/M;

    invoke-direct {v2}, Lkotlin/jvm/internal/M;-><init>()V

    new-instance v9, Lw/j$k;

    const/4 v8, 0x0

    move-object v0, v9

    move-object v1, p4

    move-object v3, p5

    move-object v4, p1

    move-object/from16 v5, p6

    move-object v6, p3

    move-object v7, p2

    invoke-direct/range {v0 .. v8}, Lw/j$k;-><init>(Lmh/a;Lkotlin/jvm/internal/M;Lw/q;Lmh/q;Lmh/p;Lmh/a;Lmh/l;Ldh/e;)V

    move-object v0, p0

    move-object/from16 v1, p7

    invoke-static {p0, v9, v1}, Lw/o;->d(Ly0/G;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_0

    return-object v0

    :cond_0
    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method public static synthetic g(Ly0/G;Lmh/l;Lmh/a;Lmh/a;Lmh/p;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 6

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    sget-object p1, Lw/j$e;->a:Lw/j$e;

    :cond_0
    move-object v1, p1

    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_1

    sget-object p2, Lw/j$f;->a:Lw/j$f;

    :cond_1
    move-object v2, p2

    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_2

    sget-object p3, Lw/j$g;->a:Lw/j$g;

    :cond_2
    move-object v3, p3

    move-object v0, p0

    move-object v4, p4

    move-object v5, p5

    invoke-static/range {v0 .. v5}, Lw/j;->e(Ly0/G;Lmh/l;Lmh/a;Lmh/a;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Ly0/b;JLmh/l;Ldh/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p4, Lw/j$l;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lw/j$l;

    iget v1, v0, Lw/j$l;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lw/j$l;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lw/j$l;

    invoke-direct {v0, p4}, Lw/j$l;-><init>(Ldh/e;)V

    :goto_0
    iget-object p4, v0, Lw/j$l;->c:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lw/j$l;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lw/j$l;->b:Ljava/lang/Object;

    check-cast p0, Lmh/l;

    iget-object p1, v0, Lw/j$l;->a:Ljava/lang/Object;

    check-cast p1, Ly0/b;

    invoke-static {p4}, LYg/v;->b(Ljava/lang/Object;)V

    move-object p3, p0

    move-object p0, p1

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p4}, LYg/v;->b(Ljava/lang/Object;)V

    :goto_1
    iput-object p0, v0, Lw/j$l;->a:Ljava/lang/Object;

    iput-object p3, v0, Lw/j$l;->b:Ljava/lang/Object;

    iput v3, v0, Lw/j$l;->d:I

    invoke-static {p0, p1, p2, v0}, Lw/j;->b(Ly0/b;JLdh/e;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    :goto_2
    check-cast p4, Ly0/y;

    if-nez p4, :cond_4

    const/4 p0, 0x0

    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    :cond_4
    invoke-static {p4}, Ly0/o;->d(Ly0/y;)Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    :cond_5
    invoke-interface {p3, p4}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p4}, Ly0/y;->f()J

    move-result-wide p1

    goto :goto_1
.end method

.method private static final i(Ly0/n;J)Z
    .locals 6

    invoke-virtual {p0}, Ly0/n;->c()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ly0/y;

    invoke-virtual {v4}, Ly0/y;->f()J

    move-result-wide v4

    invoke-static {v4, v5, p1, p2}, Ly0/x;->d(JJ)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_1
    check-cast v3, Ly0/y;

    const/4 p0, 0x1

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ly0/y;->i()Z

    move-result p1

    if-ne p1, p0, :cond_2

    move v1, p0

    :cond_2
    xor-int/2addr p0, v1

    return p0
.end method

.method public static final j(Landroidx/compose/ui/platform/w1;I)F
    .locals 1

    sget-object v0, Ly0/L;->a:Ly0/L$a;

    invoke-virtual {v0}, Ly0/L$a;->b()I

    move-result v0

    invoke-static {p1, v0}, Ly0/L;->g(II)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-interface {p0}, Landroidx/compose/ui/platform/w1;->g()F

    move-result p0

    sget p1, Lw/j;->c:F

    mul-float/2addr p0, p1

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Landroidx/compose/ui/platform/w1;->g()F

    move-result p0

    :goto_0
    return p0
.end method
