.class final LPi/d;
.super LMi/d;
.source "SourceFile"


# instance fields
.field private final d:LDj/a;


# direct methods
.method public constructor <init>(LDj/a;Ldh/i;ILKi/a;)V
    .locals 0

    .line 4
    invoke-direct {p0, p2, p3, p4}, LMi/d;-><init>(Ldh/i;ILKi/a;)V

    .line 5
    iput-object p1, p0, LPi/d;->d:LDj/a;

    return-void
.end method

.method public synthetic constructor <init>(LDj/a;Ldh/i;ILKi/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    .line 1
    sget-object p2, Ldh/j;->a:Ldh/j;

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    const/4 p3, -0x2

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    .line 2
    sget-object p4, LKi/a;->SUSPEND:LKi/a;

    .line 3
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, LPi/d;-><init>(LDj/a;Ldh/i;ILKi/a;)V

    return-void
.end method

.method public static final synthetic p(LPi/d;Ldh/i;LLi/h;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LPi/d;->q(Ldh/i;LLi/h;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final q(Ldh/i;LLi/h;Ldh/e;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p3

    instance-of v2, v0, LPi/d$a;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, LPi/d$a;

    iget v3, v2, LPi/d$a;->g:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, LPi/d$a;->g:I

    goto :goto_0

    :cond_0
    new-instance v2, LPi/d$a;

    invoke-direct {v2, v1, v0}, LPi/d$a;-><init>(LPi/d;Ldh/e;)V

    :goto_0
    iget-object v0, v2, LPi/d$a;->e:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v3

    iget v4, v2, LPi/d$a;->g:I

    const-wide/16 v5, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eqz v4, :cond_4

    if-eq v4, v8, :cond_3

    if-ne v4, v7, :cond_2

    iget-wide v9, v2, LPi/d$a;->d:J

    iget-object v4, v2, LPi/d$a;->c:Ljava/lang/Object;

    check-cast v4, LPi/f;

    iget-object v11, v2, LPi/d$a;->b:Ljava/lang/Object;

    check-cast v11, LLi/h;

    iget-object v12, v2, LPi/d$a;->a:Ljava/lang/Object;

    check-cast v12, LPi/d;

    :try_start_0
    invoke-static {v0}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    move-object v0, v11

    goto/16 :goto_3

    :catchall_0
    move-exception v0

    goto/16 :goto_4

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    iget-wide v9, v2, LPi/d$a;->d:J

    iget-object v4, v2, LPi/d$a;->c:Ljava/lang/Object;

    check-cast v4, LPi/f;

    iget-object v11, v2, LPi/d$a;->b:Ljava/lang/Object;

    check-cast v11, LLi/h;

    iget-object v12, v2, LPi/d$a;->a:Ljava/lang/Object;

    check-cast v12, LPi/d;

    :try_start_1
    invoke-static {v0}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :cond_4
    invoke-static {v0}, LYg/v;->b(Ljava/lang/Object;)V

    new-instance v0, LPi/f;

    iget v4, v1, LMi/d;->b:I

    iget-object v9, v1, LMi/d;->c:LKi/a;

    invoke-direct/range {p0 .. p0}, LPi/d;->s()J

    move-result-wide v10

    invoke-direct {v0, v4, v9, v10, v11}, LPi/f;-><init>(ILKi/a;J)V

    iget-object v4, v1, LPi/d;->d:LDj/a;

    move-object/from16 v9, p1

    invoke-static {v4, v9}, LPi/e;->c(LDj/a;Ldh/i;)LDj/a;

    move-result-object v4

    invoke-interface {v4, v0}, LDj/a;->b(LDj/b;)V

    move-object v4, v0

    move-object v9, v1

    move-wide v10, v5

    move-object/from16 v0, p2

    :goto_1
    :try_start_2
    iput-object v9, v2, LPi/d$a;->a:Ljava/lang/Object;

    iput-object v0, v2, LPi/d$a;->b:Ljava/lang/Object;

    iput-object v4, v2, LPi/d$a;->c:Ljava/lang/Object;

    iput-wide v10, v2, LPi/d$a;->d:J

    iput v8, v2, LPi/d$a;->g:I

    invoke-virtual {v4, v2}, LPi/f;->d(Ldh/e;)Ljava/lang/Object;

    move-result-object v12
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-ne v12, v3, :cond_5

    return-object v3

    :cond_5
    move-wide v15, v10

    move-object v11, v0

    move-object v0, v12

    move-object v12, v9

    move-wide v9, v15

    :goto_2
    if-nez v0, :cond_6

    invoke-virtual {v4}, LPi/f;->b()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0

    :cond_6
    :try_start_3
    invoke-interface {v2}, Ldh/e;->getContext()Ldh/i;

    move-result-object v13

    invoke-static {v13}, LIi/A0;->l(Ldh/i;)V

    iput-object v12, v2, LPi/d$a;->a:Ljava/lang/Object;

    iput-object v11, v2, LPi/d$a;->b:Ljava/lang/Object;

    iput-object v4, v2, LPi/d$a;->c:Ljava/lang/Object;

    iput-wide v9, v2, LPi/d$a;->d:J

    iput v7, v2, LPi/d$a;->g:I

    invoke-interface {v11, v0, v2}, LLi/h;->a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_1

    return-object v3

    :goto_3
    const-wide/16 v13, 0x1

    add-long v10, v9, v13

    invoke-direct {v12}, LPi/d;->s()J

    move-result-wide v13

    cmp-long v9, v10, v13

    if-nez v9, :cond_7

    invoke-virtual {v4}, LPi/f;->c()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-wide v10, v5

    :cond_7
    move-object v9, v12

    goto :goto_1

    :goto_4
    invoke-virtual {v4}, LPi/f;->b()V

    throw v0
.end method

.method private final r(LLi/h;Ldh/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, LPi/d$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, LPi/d$b;-><init>(LLi/h;LPi/d;Ldh/e;)V

    invoke-static {v0, p2}, LIi/O;->g(Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method private final s()J
    .locals 6

    iget-object v0, p0, LMi/d;->c:LKi/a;

    sget-object v1, LKi/a;->SUSPEND:LKi/a;

    const-wide v2, 0x7fffffffffffffffL

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, LMi/d;->b:I

    const/4 v1, -0x2

    if-eq v0, v1, :cond_3

    const-wide/16 v4, 0x1

    if-eqz v0, :cond_2

    const v1, 0x7fffffff

    if-eq v0, v1, :cond_4

    int-to-long v2, v0

    cmp-long v0, v2, v4

    if-ltz v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Check failed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    move-wide v2, v4

    goto :goto_0

    :cond_3
    sget-object v0, LKi/g;->P:LKi/g$a;

    invoke-virtual {v0}, LKi/g$a;->a()I

    move-result v0

    int-to-long v2, v0

    :cond_4
    :goto_0
    return-wide v2
.end method


# virtual methods
.method public b(LLi/h;Ldh/e;)Ljava/lang/Object;
    .locals 3

    invoke-interface {p2}, Ldh/e;->getContext()Ldh/i;

    move-result-object v0

    iget-object v1, p0, LMi/d;->a:Ldh/i;

    sget-object v2, Ldh/f;->m0:Ldh/f$b;

    invoke-interface {v1, v2}, Ldh/i;->get(Ldh/i$c;)Ldh/i$b;

    move-result-object v1

    check-cast v1, Ldh/f;

    if-eqz v1, :cond_2

    invoke-interface {v0, v2}, Ldh/i;->get(Ldh/i$c;)Ldh/i$b;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1, p2}, LPi/d;->r(LLi/h;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_2
    :goto_0
    iget-object v1, p0, LMi/d;->a:Ldh/i;

    invoke-interface {v0, v1}, Ldh/i;->plus(Ldh/i;)Ldh/i;

    move-result-object v0

    invoke-direct {p0, v0, p1, p2}, LPi/d;->q(Ldh/i;LLi/h;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_3

    return-object p1

    :cond_3
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method protected g(LKi/t;Ldh/e;)Ljava/lang/Object;
    .locals 2

    invoke-interface {p1}, LIi/N;->getCoroutineContext()Ldh/i;

    move-result-object v0

    new-instance v1, LMi/x;

    invoke-interface {p1}, LKi/t;->g()LKi/w;

    move-result-object p1

    invoke-direct {v1, p1}, LMi/x;-><init>(LKi/w;)V

    invoke-direct {p0, v0, v1, p2}, LPi/d;->q(Ldh/i;LLi/h;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method protected i(Ldh/i;ILKi/a;)LMi/d;
    .locals 2

    new-instance v0, LPi/d;

    iget-object v1, p0, LPi/d;->d:LDj/a;

    invoke-direct {v0, v1, p1, p2, p3}, LPi/d;-><init>(LDj/a;Ldh/i;ILKi/a;)V

    return-object v0
.end method
