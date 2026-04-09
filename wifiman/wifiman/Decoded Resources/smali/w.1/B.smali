.class public abstract Lw/B;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lmh/q;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lw/B$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lw/B$a;-><init>(Ldh/e;)V

    sput-object v0, Lw/B;->a:Lmh/q;

    return-void
.end method

.method public static final synthetic a(Ly0/b;Ly0/y;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lw/B;->g(Ly0/b;Ly0/y;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Ly0/b;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lw/B;->h(Ly0/b;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c()Lmh/q;
    .locals 1

    sget-object v0, Lw/B;->a:Lmh/q;

    return-object v0
.end method

.method public static final synthetic d(Ly0/b;ZLdh/e;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Ly0/p;->Main:Ly0/p;

    invoke-static {p0, p1, v0, p2}, Lw/B;->e(Ly0/b;ZLy0/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Ly0/b;ZLy0/p;Ldh/e;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p3, Lw/B$b;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lw/B$b;

    iget v1, v0, Lw/B$b;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lw/B$b;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lw/B$b;

    invoke-direct {v0, p3}, Lw/B$b;-><init>(Ldh/e;)V

    :goto_0
    iget-object p3, v0, Lw/B$b;->d:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lw/B$b;->e:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-boolean p0, v0, Lw/B$b;->c:Z

    iget-object p1, v0, Lw/B$b;->b:Ljava/lang/Object;

    check-cast p1, Ly0/p;

    iget-object p2, v0, Lw/B$b;->a:Ljava/lang/Object;

    check-cast p2, Ly0/b;

    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    move-object v8, p1

    move p1, p0

    move-object p0, p2

    move-object p2, v8

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    :cond_3
    iput-object p0, v0, Lw/B$b;->a:Ljava/lang/Object;

    iput-object p2, v0, Lw/B$b;->b:Ljava/lang/Object;

    iput-boolean p1, v0, Lw/B$b;->c:Z

    iput v3, v0, Lw/B$b;->e:I

    invoke-interface {p0, p2, v0}, Ly0/b;->A1(Ly0/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    check-cast p3, Ly0/n;

    invoke-virtual {p3}, Ly0/n;->c()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x0

    move v6, v5

    :goto_2
    if-ge v6, v4, :cond_7

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ly0/y;

    if-eqz p1, :cond_5

    invoke-static {v7}, Ly0/o;->a(Ly0/y;)Z

    move-result v7

    goto :goto_3

    :cond_5
    invoke-static {v7}, Ly0/o;->b(Ly0/y;)Z

    move-result v7

    :goto_3
    if-nez v7, :cond_6

    move v2, v5

    goto :goto_4

    :cond_6
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_7
    move v2, v3

    :goto_4
    if-eqz v2, :cond_3

    invoke-virtual {p3}, Ly0/n;->c()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ly0/b;ZLy0/p;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const/4 p1, 0x1

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    sget-object p2, Ly0/p;->Main:Ly0/p;

    :cond_1
    invoke-static {p0, p1, p2, p3}, Lw/B;->e(Ly0/b;ZLy0/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Ly0/b;Ly0/y;Ldh/e;)Ljava/lang/Object;
    .locals 4

    invoke-interface {p0}, Ly0/b;->getViewConfiguration()Landroidx/compose/ui/platform/w1;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/ui/platform/w1;->a()J

    move-result-wide v0

    new-instance v2, Lw/B$c;

    const/4 v3, 0x0

    invoke-direct {v2, p1, v3}, Lw/B$c;-><init>(Ly0/y;Ldh/e;)V

    invoke-interface {p0, v0, v1, v2, p2}, Ly0/b;->T1(JLmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Ly0/b;Ldh/e;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p1, Lw/B$d;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lw/B$d;

    iget v1, v0, Lw/B$d;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lw/B$d;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lw/B$d;

    invoke-direct {v0, p1}, Lw/B$d;-><init>(Ldh/e;)V

    :goto_0
    iget-object p1, v0, Lw/B$d;->b:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lw/B$d;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lw/B$d;->a:Ljava/lang/Object;

    check-cast p0, Ly0/b;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    :goto_1
    iput-object p0, v0, Lw/B$d;->a:Ljava/lang/Object;

    iput v3, v0, Lw/B$d;->c:I

    const/4 p1, 0x0

    invoke-static {p0, p1, v0, v3, p1}, Ly0/b;->s1(Ly0/b;Ly0/p;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_2
    check-cast p1, Ly0/n;

    invoke-virtual {p1}, Ly0/n;->c()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x0

    move v6, v5

    :goto_3
    if-ge v6, v4, :cond_4

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ly0/y;

    invoke-virtual {v7}, Ly0/y;->a()V

    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_4
    invoke-virtual {p1}, Ly0/n;->c()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    :goto_4
    if-ge v5, v2, :cond_6

    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly0/y;

    invoke-virtual {v4}, Ly0/y;->i()Z

    move-result v4

    if-eqz v4, :cond_5

    goto :goto_1

    :cond_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :cond_6
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final i(Ly0/G;Lmh/q;Lmh/l;Ldh/e;)Ljava/lang/Object;
    .locals 7

    new-instance v4, Lw/s;

    invoke-direct {v4, p0}, Lw/s;-><init>(LY0/d;)V

    new-instance v6, Lw/B$e;

    const/4 v5, 0x0

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v5}, Lw/B$e;-><init>(Ly0/G;Lmh/q;Lmh/l;Lw/s;Ldh/e;)V

    invoke-static {v6, p3}, LIi/O;->g(Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final j(Ly0/G;Lmh/l;Lmh/l;Lmh/q;Lmh/l;Ldh/e;)Ljava/lang/Object;
    .locals 8

    new-instance v7, Lw/B$f;

    const/4 v6, 0x0

    move-object v0, v7

    move-object v1, p0

    move-object v2, p3

    move-object v3, p2

    move-object v4, p1

    move-object v5, p4

    invoke-direct/range {v0 .. v6}, Lw/B$f;-><init>(Ly0/G;Lmh/q;Lmh/l;Lmh/l;Lmh/l;Ldh/e;)V

    invoke-static {v7, p5}, LIi/O;->g(Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static synthetic k(Ly0/G;Lmh/l;Lmh/l;Lmh/q;Lmh/l;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 7

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object v2, v0

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_1

    move-object v3, v0

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_2

    sget-object p3, Lw/B;->a:Lmh/q;

    :cond_2
    move-object v4, p3

    and-int/lit8 p1, p6, 0x8

    if-eqz p1, :cond_3

    move-object v5, v0

    goto :goto_2

    :cond_3
    move-object v5, p4

    :goto_2
    move-object v1, p0

    move-object v6, p5

    invoke-static/range {v1 .. v6}, Lw/B;->j(Ly0/G;Lmh/l;Lmh/l;Lmh/q;Lmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final l(Ly0/b;Ly0/p;Ldh/e;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p2

    instance-of v1, v0, Lw/B$g;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lw/B$g;

    iget v2, v1, Lw/B$g;->d:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lw/B$g;->d:I

    goto :goto_0

    :cond_0
    new-instance v1, Lw/B$g;

    invoke-direct {v1, v0}, Lw/B$g;-><init>(Ldh/e;)V

    :goto_0
    iget-object v0, v1, Lw/B$g;->c:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v2

    iget v3, v1, Lw/B$g;->d:I

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz v3, :cond_4

    if-eq v3, v7, :cond_3

    if-ne v3, v5, :cond_2

    iget-object v3, v1, Lw/B$g;->b:Ljava/lang/Object;

    check-cast v3, Ly0/p;

    iget-object v8, v1, Lw/B$g;->a:Ljava/lang/Object;

    check-cast v8, Ly0/b;

    invoke-static {v0}, LYg/v;->b(Ljava/lang/Object;)V

    :cond_1
    move-object/from16 v16, v3

    move-object v3, v1

    move-object/from16 v1, v16

    goto/16 :goto_6

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    iget-object v3, v1, Lw/B$g;->b:Ljava/lang/Object;

    check-cast v3, Ly0/p;

    iget-object v8, v1, Lw/B$g;->a:Ljava/lang/Object;

    check-cast v8, Ly0/b;

    invoke-static {v0}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    invoke-static {v0}, LYg/v;->b(Ljava/lang/Object;)V

    move-object/from16 v0, p0

    move-object v3, v1

    move-object/from16 v1, p1

    :goto_1
    iput-object v0, v3, Lw/B$g;->a:Ljava/lang/Object;

    iput-object v1, v3, Lw/B$g;->b:Ljava/lang/Object;

    iput v7, v3, Lw/B$g;->d:I

    invoke-interface {v0, v1, v3}, Ly0/b;->A1(Ly0/p;Ldh/e;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v2, :cond_5

    return-object v2

    :cond_5
    move-object/from16 v16, v8

    move-object v8, v0

    move-object/from16 v0, v16

    move-object/from16 v17, v3

    move-object v3, v1

    move-object/from16 v1, v17

    :goto_2
    check-cast v0, Ly0/n;

    invoke-virtual {v0}, Ly0/n;->c()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v10

    move v11, v6

    :goto_3
    if-ge v11, v10, :cond_c

    invoke-interface {v9, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ly0/y;

    invoke-static {v12}, Ly0/o;->c(Ly0/y;)Z

    move-result v12

    if-nez v12, :cond_b

    invoke-virtual {v0}, Ly0/n;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v9

    move v10, v6

    :goto_4
    if-ge v10, v9, :cond_8

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ly0/y;

    invoke-virtual {v11}, Ly0/y;->p()Z

    move-result v12

    if-nez v12, :cond_7

    invoke-interface {v8}, Ly0/b;->h()J

    move-result-wide v12

    invoke-interface {v8}, Ly0/b;->n1()J

    move-result-wide v14

    invoke-static {v11, v12, v13, v14, v15}, Ly0/o;->f(Ly0/y;JJ)Z

    move-result v11

    if-eqz v11, :cond_6

    goto :goto_5

    :cond_6
    add-int/lit8 v10, v10, 0x1

    goto :goto_4

    :cond_7
    :goto_5
    return-object v4

    :cond_8
    sget-object v0, Ly0/p;->Final:Ly0/p;

    iput-object v8, v1, Lw/B$g;->a:Ljava/lang/Object;

    iput-object v3, v1, Lw/B$g;->b:Ljava/lang/Object;

    iput v5, v1, Lw/B$g;->d:I

    invoke-interface {v8, v0, v1}, Ly0/b;->A1(Ly0/p;Ldh/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_1

    return-object v2

    :goto_6
    check-cast v0, Ly0/n;

    invoke-virtual {v0}, Ly0/n;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v9

    move v10, v6

    :goto_7
    if-ge v10, v9, :cond_a

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ly0/y;

    invoke-virtual {v11}, Ly0/y;->p()Z

    move-result v11

    if-eqz v11, :cond_9

    return-object v4

    :cond_9
    add-int/lit8 v10, v10, 0x1

    goto :goto_7

    :cond_a
    move-object v0, v8

    goto/16 :goto_1

    :cond_b
    add-int/lit8 v11, v11, 0x1

    goto :goto_3

    :cond_c
    invoke-virtual {v0}, Ly0/n;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic m(Ly0/b;Ly0/p;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    sget-object p1, Ly0/p;->Main:Ly0/p;

    :cond_0
    invoke-static {p0, p1, p2}, Lw/B;->l(Ly0/b;Ly0/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
