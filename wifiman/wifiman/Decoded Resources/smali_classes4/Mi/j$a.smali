.class final LMi/j$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LMi/j;->a(LLi/h;[LLi/g;Lmh/a;Lmh/q;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field c:I

.field d:I

.field e:I

.field private synthetic f:Ljava/lang/Object;

.field final synthetic g:[LLi/g;

.field final synthetic h:Lmh/a;

.field final synthetic i:Lmh/q;

.field final synthetic j:LLi/h;


# direct methods
.method constructor <init>([LLi/g;Lmh/a;Lmh/q;LLi/h;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LMi/j$a;->g:[LLi/g;

    iput-object p2, p0, LMi/j$a;->h:Lmh/a;

    iput-object p3, p0, LMi/j$a;->i:Lmh/q;

    iput-object p4, p0, LMi/j$a;->j:LLi/h;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 7

    new-instance v6, LMi/j$a;

    iget-object v1, p0, LMi/j$a;->g:[LLi/g;

    iget-object v2, p0, LMi/j$a;->h:Lmh/a;

    iget-object v3, p0, LMi/j$a;->i:Lmh/q;

    iget-object v4, p0, LMi/j$a;->j:LLi/h;

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, LMi/j$a;-><init>([LLi/g;Lmh/a;Lmh/q;LLi/h;Ldh/e;)V

    iput-object p1, v6, LMi/j$a;->f:Ljava/lang/Object;

    return-object v6
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LMi/j$a;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    move-object/from16 v0, p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LMi/j$a;->e:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    iget v2, v0, LMi/j$a;->d:I

    iget v6, v0, LMi/j$a;->c:I

    iget-object v7, v0, LMi/j$a;->b:Ljava/lang/Object;

    check-cast v7, [B

    iget-object v8, v0, LMi/j$a;->a:Ljava/lang/Object;

    check-cast v8, LKi/g;

    iget-object v9, v0, LMi/j$a;->f:Ljava/lang/Object;

    check-cast v9, [Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    move/from16 v21, v2

    move-object v2, v7

    move-object v7, v8

    goto/16 :goto_4

    :cond_2
    iget v2, v0, LMi/j$a;->d:I

    iget v6, v0, LMi/j$a;->c:I

    iget-object v7, v0, LMi/j$a;->b:Ljava/lang/Object;

    check-cast v7, [B

    iget-object v8, v0, LMi/j$a;->a:Ljava/lang/Object;

    check-cast v8, LKi/g;

    iget-object v9, v0, LMi/j$a;->f:Ljava/lang/Object;

    check-cast v9, [Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    move-object/from16 v10, p1

    check-cast v10, LKi/k;

    invoke-virtual {v10}, LKi/k;->l()Ljava/lang/Object;

    move-result-object v10

    move-object/from16 v22, v8

    move v8, v2

    move-object v2, v7

    move-object/from16 v7, v22

    goto/16 :goto_3

    :cond_3
    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object v2, v0, LMi/j$a;->f:Ljava/lang/Object;

    check-cast v2, LIi/N;

    iget-object v6, v0, LMi/j$a;->g:[LLi/g;

    array-length v12, v6

    if-nez v12, :cond_4

    sget-object v1, LYg/J;->a:LYg/J;

    return-object v1

    :cond_4
    new-array v13, v12, [Ljava/lang/Object;

    sget-object v7, LMi/r;->b:LNi/C;

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v6, v13

    invoke-static/range {v6 .. v11}, LZg/n;->y([Ljava/lang/Object;Ljava/lang/Object;IIILjava/lang/Object;)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    invoke-static {v12, v7, v7, v6, v7}, LKi/j;->b(ILKi/a;Lmh/l;ILjava/lang/Object;)LKi/g;

    move-result-object v20

    new-instance v11, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v11, v12}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    const/16 v21, 0x0

    move/from16 v10, v21

    :goto_1
    if-ge v10, v12, :cond_5

    new-instance v9, LMi/j$a$a;

    iget-object v15, v0, LMi/j$a;->g:[LLi/g;

    const/16 v19, 0x0

    move-object v14, v9

    move/from16 v16, v10

    move-object/from16 v17, v11

    move-object/from16 v18, v20

    invoke-direct/range {v14 .. v19}, LMi/j$a$a;-><init>([LLi/g;ILjava/util/concurrent/atomic/AtomicInteger;LKi/g;Ldh/e;)V

    const/4 v14, 0x3

    const/4 v15, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v6, v2

    move v10, v14

    move-object v14, v11

    move-object v11, v15

    invoke-static/range {v6 .. v11}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    add-int/lit8 v10, v16, 0x1

    move-object v11, v14

    goto :goto_1

    :cond_5
    new-array v2, v12, [B

    move v6, v12

    move-object/from16 v7, v20

    :goto_2
    add-int/lit8 v8, v21, 0x1

    int-to-byte v8, v8

    iput-object v13, v0, LMi/j$a;->f:Ljava/lang/Object;

    iput-object v7, v0, LMi/j$a;->a:Ljava/lang/Object;

    iput-object v2, v0, LMi/j$a;->b:Ljava/lang/Object;

    iput v6, v0, LMi/j$a;->c:I

    iput v8, v0, LMi/j$a;->d:I

    iput v5, v0, LMi/j$a;->e:I

    invoke-interface {v7, v0}, LKi/v;->i(Ldh/e;)Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v1, :cond_6

    return-object v1

    :cond_6
    move-object v9, v13

    :goto_3
    invoke-static {v10}, LKi/k;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LZg/N;

    if-nez v10, :cond_7

    sget-object v1, LYg/J;->a:LYg/J;

    return-object v1

    :cond_7
    invoke-virtual {v10}, LZg/N;->c()I

    move-result v11

    aget-object v12, v9, v11

    invoke-virtual {v10}, LZg/N;->d()Ljava/lang/Object;

    move-result-object v10

    aput-object v10, v9, v11

    sget-object v10, LMi/r;->b:LNi/C;

    if-ne v12, v10, :cond_8

    add-int/lit8 v6, v6, -0x1

    :cond_8
    aget-byte v10, v2, v11

    if-eq v10, v8, :cond_9

    int-to-byte v10, v8

    aput-byte v10, v2, v11

    invoke-interface {v7}, LKi/v;->d()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v10}, LKi/k;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LZg/N;

    if-nez v10, :cond_7

    :cond_9
    if-nez v6, :cond_b

    iget-object v10, v0, LMi/j$a;->h:Lmh/a;

    invoke-interface {v10}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, [Ljava/lang/Object;

    if-nez v10, :cond_a

    iget-object v10, v0, LMi/j$a;->i:Lmh/q;

    iget-object v11, v0, LMi/j$a;->j:LLi/h;

    iput-object v9, v0, LMi/j$a;->f:Ljava/lang/Object;

    iput-object v7, v0, LMi/j$a;->a:Ljava/lang/Object;

    iput-object v2, v0, LMi/j$a;->b:Ljava/lang/Object;

    iput v6, v0, LMi/j$a;->c:I

    iput v8, v0, LMi/j$a;->d:I

    iput v4, v0, LMi/j$a;->e:I

    invoke-interface {v10, v11, v9, v0}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v1, :cond_b

    return-object v1

    :cond_a
    const/16 v16, 0xe

    const/16 v17, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v11, v9

    move-object v12, v10

    invoke-static/range {v11 .. v17}, LZg/n;->q([Ljava/lang/Object;[Ljava/lang/Object;IIIILjava/lang/Object;)[Ljava/lang/Object;

    iget-object v11, v0, LMi/j$a;->i:Lmh/q;

    iget-object v12, v0, LMi/j$a;->j:LLi/h;

    iput-object v9, v0, LMi/j$a;->f:Ljava/lang/Object;

    iput-object v7, v0, LMi/j$a;->a:Ljava/lang/Object;

    iput-object v2, v0, LMi/j$a;->b:Ljava/lang/Object;

    iput v6, v0, LMi/j$a;->c:I

    iput v8, v0, LMi/j$a;->d:I

    iput v3, v0, LMi/j$a;->e:I

    invoke-interface {v11, v12, v10, v0}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v1, :cond_b

    return-object v1

    :cond_b
    move/from16 v21, v8

    :goto_4
    move-object v13, v9

    goto/16 :goto_2
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LMi/j$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LMi/j$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LMi/j$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
