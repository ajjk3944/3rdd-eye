.class final LT/N0$k;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT/N0;->z0(Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field c:Ljava/lang/Object;

.field d:Ljava/lang/Object;

.field e:Ljava/lang/Object;

.field f:Ljava/lang/Object;

.field g:Ljava/lang/Object;

.field h:Ljava/lang/Object;

.field i:I

.field synthetic j:Ljava/lang/Object;

.field final synthetic k:LT/N0;


# direct methods
.method constructor <init>(LT/N0;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LT/N0$k;->k:LT/N0;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method

.method private static final E(Ljava/util/List;LT/N0;)V
    .locals 6

    invoke-interface {p0}, Ljava/util/List;->clear()V

    invoke-static {p1}, LT/N0;->G(LT/N0;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    invoke-static {p1}, LT/N0;->y(LT/N0;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LT/l0;

    move-object v5, p0

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    invoke-static {p1}, LT/N0;->y(LT/N0;)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->clear()V

    sget-object p0, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p0
.end method

.method public static final synthetic n(LT/N0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lo/I;Lo/I;Lo/I;Lo/I;)V
    .locals 0

    invoke-static/range {p0 .. p7}, LT/N0$k;->v(LT/N0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lo/I;Lo/I;Lo/I;Lo/I;)V

    return-void
.end method

.method public static final synthetic o(Ljava/util/List;LT/N0;)V
    .locals 0

    invoke-static {p0, p1}, LT/N0$k;->E(Ljava/util/List;LT/N0;)V

    return-void
.end method

.method private static final v(LT/N0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lo/I;Lo/I;Lo/I;Lo/I;)V
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    move-object/from16 v2, p5

    move-object/from16 v3, p7

    invoke-static/range {p0 .. p0}, LT/N0;->G(LT/N0;)Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    :try_start_0
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->clear()V

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->clear()V

    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    move-result v5

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v5, :cond_0

    move-object/from16 v8, p3

    invoke-interface {v8, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LT/E;

    invoke-interface {v9}, LT/E;->s()V

    invoke-static {v0, v9}, LT/N0;->O(LT/N0;LT/E;)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_8

    :cond_0
    move-object/from16 v8, p3

    invoke-interface/range {p3 .. p3}, Ljava/util/List;->clear()V

    iget-object v5, v1, Lo/T;->b:[Ljava/lang/Object;

    iget-object v7, v1, Lo/T;->a:[J

    array-length v8, v7

    add-int/lit8 v8, v8, -0x2

    const/4 v13, 0x7

    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    if-ltz v8, :cond_4

    const/4 v9, 0x0

    :goto_1
    aget-wide v11, v7, v9

    move-object v10, v7

    not-long v6, v11

    shl-long/2addr v6, v13

    and-long/2addr v6, v11

    and-long/2addr v6, v14

    cmp-long v6, v6, v14

    if-eqz v6, :cond_3

    sub-int v6, v9, v8

    not-int v6, v6

    ushr-int/lit8 v6, v6, 0x1f

    const/16 v7, 0x8

    rsub-int/lit8 v6, v6, 0x8

    const/4 v7, 0x0

    :goto_2
    if-ge v7, v6, :cond_2

    const-wide/16 v16, 0xff

    and-long v18, v11, v16

    const-wide/16 v20, 0x80

    cmp-long v18, v18, v20

    if-gez v18, :cond_1

    shl-int/lit8 v18, v9, 0x3

    add-int v18, v18, v7

    aget-object v18, v5, v18

    move-object/from16 v14, v18

    check-cast v14, LT/E;

    invoke-interface {v14}, LT/E;->s()V

    invoke-static {v0, v14}, LT/N0;->O(LT/N0;LT/E;)V

    :cond_1
    const/16 v14, 0x8

    shr-long/2addr v11, v14

    add-int/lit8 v7, v7, 0x1

    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    goto :goto_2

    :cond_2
    const/16 v14, 0x8

    if-ne v6, v14, :cond_4

    :cond_3
    if-eq v9, v8, :cond_4

    add-int/lit8 v9, v9, 0x1

    move-object v7, v10

    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    goto :goto_1

    :cond_4
    invoke-virtual/range {p4 .. p4}, Lo/I;->m()V

    iget-object v1, v2, Lo/T;->b:[Ljava/lang/Object;

    iget-object v5, v2, Lo/T;->a:[J

    array-length v6, v5

    add-int/lit8 v6, v6, -0x2

    if-ltz v6, :cond_8

    const/4 v7, 0x0

    :goto_3
    aget-wide v8, v5, v7

    not-long v10, v8

    shl-long/2addr v10, v13

    and-long/2addr v10, v8

    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v10, v14

    cmp-long v10, v10, v14

    if-eqz v10, :cond_7

    sub-int v10, v7, v6

    not-int v10, v10

    ushr-int/lit8 v10, v10, 0x1f

    const/16 v11, 0x8

    rsub-int/lit8 v10, v10, 0x8

    const/4 v11, 0x0

    :goto_4
    if-ge v11, v10, :cond_6

    const-wide/16 v14, 0xff

    and-long v21, v8, v14

    const-wide/16 v14, 0x80

    cmp-long v12, v21, v14

    if-gez v12, :cond_5

    shl-int/lit8 v12, v7, 0x3

    add-int/2addr v12, v11

    aget-object v12, v1, v12

    check-cast v12, LT/E;

    invoke-interface {v12}, LT/E;->t()V

    :cond_5
    const/16 v12, 0x8

    shr-long/2addr v8, v12

    add-int/lit8 v11, v11, 0x1

    goto :goto_4

    :cond_6
    const/16 v12, 0x8

    if-ne v10, v12, :cond_8

    :cond_7
    if-eq v7, v6, :cond_8

    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_8
    invoke-virtual/range {p5 .. p5}, Lo/I;->m()V

    invoke-virtual/range {p6 .. p6}, Lo/I;->m()V

    iget-object v1, v3, Lo/T;->b:[Ljava/lang/Object;

    iget-object v2, v3, Lo/T;->a:[J

    array-length v5, v2

    add-int/lit8 v5, v5, -0x2

    if-ltz v5, :cond_c

    const/4 v6, 0x0

    :goto_5
    aget-wide v7, v2, v6

    not-long v9, v7

    shl-long/2addr v9, v13

    and-long/2addr v9, v7

    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v9, v11

    cmp-long v9, v9, v11

    if-eqz v9, :cond_b

    sub-int v9, v6, v5

    not-int v9, v9

    ushr-int/lit8 v9, v9, 0x1f

    const/16 v10, 0x8

    rsub-int/lit8 v9, v9, 0x8

    const/4 v10, 0x0

    :goto_6
    if-ge v10, v9, :cond_a

    const-wide/16 v14, 0xff

    and-long v16, v7, v14

    const-wide/16 v18, 0x80

    cmp-long v16, v16, v18

    if-gez v16, :cond_9

    shl-int/lit8 v16, v6, 0x3

    add-int v16, v16, v10

    aget-object v16, v1, v16

    move-object/from16 v11, v16

    check-cast v11, LT/E;

    invoke-interface {v11}, LT/E;->s()V

    invoke-static {v0, v11}, LT/N0;->O(LT/N0;LT/E;)V

    :cond_9
    const/16 v11, 0x8

    shr-long/2addr v7, v11

    add-int/lit8 v10, v10, 0x1

    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    goto :goto_6

    :cond_a
    const/16 v11, 0x8

    const-wide/16 v14, 0xff

    const-wide/16 v18, 0x80

    if-ne v9, v11, :cond_c

    goto :goto_7

    :cond_b
    const/16 v11, 0x8

    const-wide/16 v14, 0xff

    const-wide/16 v18, 0x80

    :goto_7
    if-eq v6, v5, :cond_c

    add-int/lit8 v6, v6, 0x1

    goto :goto_5

    :cond_c
    invoke-virtual/range {p7 .. p7}, Lo/I;->m()V

    sget-object v0, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v4

    return-void

    :goto_8
    monitor-exit v4

    throw v0
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    move-object/from16 v0, p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LT/N0$k;->i:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v2, v0, LT/N0$k;->h:Ljava/lang/Object;

    check-cast v2, Lo/I;

    iget-object v5, v0, LT/N0$k;->g:Ljava/lang/Object;

    check-cast v5, Ljava/util/Set;

    iget-object v6, v0, LT/N0$k;->f:Ljava/lang/Object;

    check-cast v6, Lo/I;

    iget-object v7, v0, LT/N0$k;->e:Ljava/lang/Object;

    check-cast v7, Lo/I;

    iget-object v8, v0, LT/N0$k;->d:Ljava/lang/Object;

    check-cast v8, Lo/I;

    iget-object v9, v0, LT/N0$k;->c:Ljava/lang/Object;

    check-cast v9, Ljava/util/List;

    iget-object v10, v0, LT/N0$k;->b:Ljava/lang/Object;

    check-cast v10, Ljava/util/List;

    iget-object v11, v0, LT/N0$k;->a:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v12, v0, LT/N0$k;->j:Ljava/lang/Object;

    check-cast v12, LT/g0;

    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    move-object/from16 v21, v10

    move-object v10, v1

    move-object v1, v8

    move v8, v3

    move-object v3, v6

    move-object/from16 v6, v21

    move-object/from16 v22, v12

    move-object v12, v2

    move-object/from16 v2, v22

    move-object/from16 v23, v11

    move-object v11, v5

    move-object/from16 v5, v23

    move-object/from16 v24, v9

    move-object v9, v7

    move-object/from16 v7, v24

    goto/16 :goto_2

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget-object v2, v0, LT/N0$k;->h:Ljava/lang/Object;

    check-cast v2, Lo/I;

    iget-object v5, v0, LT/N0$k;->g:Ljava/lang/Object;

    check-cast v5, Ljava/util/Set;

    iget-object v6, v0, LT/N0$k;->f:Ljava/lang/Object;

    check-cast v6, Lo/I;

    iget-object v7, v0, LT/N0$k;->e:Ljava/lang/Object;

    check-cast v7, Lo/I;

    iget-object v8, v0, LT/N0$k;->d:Ljava/lang/Object;

    check-cast v8, Lo/I;

    iget-object v9, v0, LT/N0$k;->c:Ljava/lang/Object;

    check-cast v9, Ljava/util/List;

    iget-object v10, v0, LT/N0$k;->b:Ljava/lang/Object;

    check-cast v10, Ljava/util/List;

    iget-object v11, v0, LT/N0$k;->a:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v12, v0, LT/N0$k;->j:Ljava/lang/Object;

    check-cast v12, LT/g0;

    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    move-object v13, v9

    move-object v14, v10

    move-object v15, v11

    move-object v9, v5

    move-object v10, v6

    move-object v11, v7

    move-object v7, v2

    move-object v2, v12

    move-object v12, v8

    goto :goto_1

    :cond_2
    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object v2, v0, LT/N0$k;->j:Ljava/lang/Object;

    check-cast v2, LT/g0;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-static {}, Lo/U;->a()Lo/I;

    move-result-object v8

    invoke-static {}, Lo/U;->a()Lo/I;

    move-result-object v9

    new-instance v10, Lo/I;

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct {v10, v11, v4, v12}, Lo/I;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v10}, LV/e;->a(Lo/T;)Ljava/util/Set;

    move-result-object v11

    invoke-static {}, Lo/U;->a()Lo/I;

    move-result-object v12

    :goto_0
    iget-object v13, v0, LT/N0$k;->k:LT/N0;

    invoke-static {v13}, LT/N0;->E(LT/N0;)Z

    move-result v13

    if-eqz v13, :cond_6

    iget-object v13, v0, LT/N0$k;->k:LT/N0;

    iput-object v2, v0, LT/N0$k;->j:Ljava/lang/Object;

    iput-object v5, v0, LT/N0$k;->a:Ljava/lang/Object;

    iput-object v6, v0, LT/N0$k;->b:Ljava/lang/Object;

    iput-object v7, v0, LT/N0$k;->c:Ljava/lang/Object;

    iput-object v8, v0, LT/N0$k;->d:Ljava/lang/Object;

    iput-object v9, v0, LT/N0$k;->e:Ljava/lang/Object;

    iput-object v10, v0, LT/N0$k;->f:Ljava/lang/Object;

    iput-object v11, v0, LT/N0$k;->g:Ljava/lang/Object;

    iput-object v12, v0, LT/N0$k;->h:Ljava/lang/Object;

    iput v4, v0, LT/N0$k;->i:I

    invoke-static {v13, v0}, LT/N0;->s(LT/N0;Ldh/e;)Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v1, :cond_3

    return-object v1

    :cond_3
    move-object v15, v5

    move-object v14, v6

    move-object v13, v7

    move-object v7, v12

    move-object v12, v8

    move-object/from16 v21, v11

    move-object v11, v9

    move-object/from16 v9, v21

    :goto_1
    iget-object v5, v0, LT/N0$k;->k:LT/N0;

    invoke-static {v5}, LT/N0;->N(LT/N0;)Z

    move-result v5

    if-eqz v5, :cond_5

    new-instance v8, LT/N0$k$a;

    iget-object v6, v0, LT/N0$k;->k:LT/N0;

    move-object v5, v8

    move-object/from16 p1, v7

    move-object v7, v10

    move-object v4, v8

    move-object/from16 v8, p1

    move-object/from16 v16, v9

    move-object v9, v15

    move-object v3, v10

    move-object v10, v14

    move-object/from16 v17, v11

    move-object v11, v12

    move-object/from16 v18, v1

    move-object v1, v12

    move-object v12, v13

    move-object/from16 v19, v4

    move-object v4, v13

    move-object/from16 v13, v17

    move-object/from16 v20, v3

    move-object v3, v14

    move-object/from16 v14, v16

    invoke-direct/range {v5 .. v14}, LT/N0$k$a;-><init>(LT/N0;Lo/I;Lo/I;Ljava/util/List;Ljava/util/List;Lo/I;Ljava/util/List;Lo/I;Ljava/util/Set;)V

    iput-object v2, v0, LT/N0$k;->j:Ljava/lang/Object;

    iput-object v15, v0, LT/N0$k;->a:Ljava/lang/Object;

    iput-object v3, v0, LT/N0$k;->b:Ljava/lang/Object;

    iput-object v4, v0, LT/N0$k;->c:Ljava/lang/Object;

    iput-object v1, v0, LT/N0$k;->d:Ljava/lang/Object;

    move-object/from16 v7, v17

    iput-object v7, v0, LT/N0$k;->e:Ljava/lang/Object;

    move-object/from16 v6, v20

    iput-object v6, v0, LT/N0$k;->f:Ljava/lang/Object;

    move-object/from16 v5, v16

    iput-object v5, v0, LT/N0$k;->g:Ljava/lang/Object;

    move-object/from16 v12, p1

    iput-object v12, v0, LT/N0$k;->h:Ljava/lang/Object;

    const/4 v8, 0x2

    iput v8, v0, LT/N0$k;->i:I

    move-object/from16 v9, v19

    invoke-interface {v2, v9, v0}, LT/g0;->j(Lmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object v9

    move-object/from16 v10, v18

    if-ne v9, v10, :cond_4

    return-object v10

    :cond_4
    move-object v11, v5

    move-object v9, v7

    move-object v5, v15

    move-object v7, v4

    move-object/from16 v21, v6

    move-object v6, v3

    move-object/from16 v3, v21

    :goto_2
    iget-object v4, v0, LT/N0$k;->k:LT/N0;

    invoke-static {v4}, LT/N0;->u(LT/N0;)V

    const/4 v4, 0x1

    move/from16 v21, v8

    move-object v8, v1

    move-object v1, v10

    move-object v10, v3

    :goto_3
    move/from16 v3, v21

    goto/16 :goto_0

    :cond_5
    move v8, v3

    move-object v5, v9

    move-object v6, v10

    move-object v4, v13

    move-object v3, v14

    move-object v10, v1

    move-object v1, v12

    move-object v12, v7

    move-object v7, v11

    move-object v11, v5

    move-object v9, v7

    move-object v5, v15

    move-object v7, v4

    const/4 v4, 0x1

    move/from16 v21, v8

    move-object v8, v1

    move-object v1, v10

    move-object v10, v6

    move-object v6, v3

    goto :goto_3

    :cond_6
    sget-object v1, LYg/J;->a:LYg/J;

    return-object v1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, LT/g0;

    check-cast p3, Ldh/e;

    invoke-virtual {p0, p1, p2, p3}, LT/N0$k;->t(LIi/N;LT/g0;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final t(LIi/N;LT/g0;Ldh/e;)Ljava/lang/Object;
    .locals 1

    new-instance p1, LT/N0$k;

    iget-object v0, p0, LT/N0$k;->k:LT/N0;

    invoke-direct {p1, v0, p3}, LT/N0$k;-><init>(LT/N0;Ldh/e;)V

    iput-object p2, p1, LT/N0$k;->j:Ljava/lang/Object;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LT/N0$k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
