.class final Ljj/c$b$a;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljj/c$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field b:Ljava/lang/Object;

.field c:I

.field d:I

.field private synthetic e:Ljava/lang/Object;

.field final synthetic f:Lkotlin/jvm/internal/N;

.field final synthetic g:Lkotlin/jvm/internal/N;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Ljj/c$b$a;->f:Lkotlin/jvm/internal/N;

    iput-object p2, p0, Ljj/c$b$a;->g:Lkotlin/jvm/internal/N;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance v0, Ljj/c$b$a;

    iget-object v1, p0, Ljj/c$b$a;->f:Lkotlin/jvm/internal/N;

    iget-object v2, p0, Ljj/c$b$a;->g:Lkotlin/jvm/internal/N;

    invoke-direct {v0, v1, v2, p2}, Ljj/c$b$a;-><init>(Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;Ldh/e;)V

    iput-object p1, v0, Ljj/c$b$a;->e:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly0/b;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Ljj/c$b$a;->n(Ly0/b;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Ljj/c$b$a;->d:I

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v6, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v6, :cond_1

    if-ne v2, v3, :cond_0

    iget v2, v0, Ljj/c$b$a;->c:I

    iget-object v7, v0, Ljj/c$b$a;->b:Ljava/lang/Object;

    check-cast v7, Ly0/n;

    iget-object v8, v0, Ljj/c$b$a;->e:Ljava/lang/Object;

    check-cast v8, Ly0/b;

    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    move-object/from16 v4, p1

    goto/16 :goto_6

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget v2, v0, Ljj/c$b$a;->c:I

    iget-object v7, v0, Ljj/c$b$a;->e:Ljava/lang/Object;

    check-cast v7, Ly0/b;

    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    move-object/from16 v8, p1

    goto :goto_1

    :cond_2
    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object v2, v0, Ljj/c$b$a;->e:Ljava/lang/Object;

    check-cast v2, Ly0/b;

    move-object v7, v2

    const/4 v2, 0x0

    :goto_0
    if-nez v2, :cond_12

    sget-object v8, Ly0/p;->Main:Ly0/p;

    iput-object v7, v0, Ljj/c$b$a;->e:Ljava/lang/Object;

    iput-object v4, v0, Ljj/c$b$a;->b:Ljava/lang/Object;

    iput v2, v0, Ljj/c$b$a;->c:I

    iput v6, v0, Ljj/c$b$a;->d:I

    invoke-interface {v7, v8, v0}, Ly0/b;->A1(Ly0/p;Ldh/e;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast v8, Ly0/n;

    invoke-virtual {v8}, Ly0/n;->c()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v10

    const/4 v11, 0x0

    :goto_2
    if-ge v11, v10, :cond_5

    invoke-interface {v9, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ly0/y;

    invoke-static {v12}, Ly0/o;->d(Ly0/y;)Z

    move-result v12

    if-nez v12, :cond_4

    goto :goto_3

    :cond_4
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    :cond_5
    move v2, v6

    :goto_3
    invoke-virtual {v8}, Ly0/n;->c()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v10

    const/4 v11, 0x0

    :goto_4
    if-ge v11, v10, :cond_8

    invoke-interface {v9, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ly0/y;

    invoke-virtual {v12}, Ly0/y;->p()Z

    move-result v13

    if-nez v13, :cond_7

    invoke-interface {v7}, Ly0/b;->h()J

    move-result-wide v13

    invoke-interface {v7}, Ly0/b;->n1()J

    move-result-wide v4

    invoke-static {v12, v13, v14, v4, v5}, Ly0/o;->f(Ly0/y;JJ)Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_5

    :cond_6
    add-int/lit8 v11, v11, 0x1

    const/4 v4, 0x0

    goto :goto_4

    :cond_7
    :goto_5
    move v2, v6

    :cond_8
    sget-object v4, Ly0/p;->Final:Ly0/p;

    iput-object v7, v0, Ljj/c$b$a;->e:Ljava/lang/Object;

    iput-object v8, v0, Ljj/c$b$a;->b:Ljava/lang/Object;

    iput v2, v0, Ljj/c$b$a;->c:I

    iput v3, v0, Ljj/c$b$a;->d:I

    invoke-interface {v7, v4, v0}, Ly0/b;->A1(Ly0/p;Ldh/e;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_9

    return-object v1

    :cond_9
    move-object v15, v8

    move-object v8, v7

    move-object v7, v15

    :goto_6
    check-cast v4, Ly0/n;

    invoke-virtual {v4}, Ly0/n;->c()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    const/4 v9, 0x0

    :goto_7
    if-ge v9, v5, :cond_b

    invoke-interface {v4, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ly0/y;

    invoke-virtual {v10}, Ly0/y;->p()Z

    move-result v10

    if-eqz v10, :cond_a

    move v2, v6

    goto :goto_8

    :cond_a
    add-int/lit8 v9, v9, 0x1

    goto :goto_7

    :cond_b
    :goto_8
    iget-object v4, v0, Ljj/c$b$a;->f:Lkotlin/jvm/internal/N;

    iget-object v4, v4, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v4, Ly0/y;

    invoke-virtual {v4}, Ly0/y;->f()J

    move-result-wide v4

    invoke-static {v7, v4, v5}, Ljj/c;->a(Ly0/n;J)Z

    move-result v4

    if-nez v4, :cond_e

    iget-object v4, v0, Ljj/c$b$a;->g:Lkotlin/jvm/internal/N;

    invoke-virtual {v7}, Ly0/n;->c()Ljava/util/List;

    move-result-object v5

    iget-object v7, v0, Ljj/c$b$a;->f:Lkotlin/jvm/internal/N;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v9

    const/4 v10, 0x0

    :goto_9
    if-ge v10, v9, :cond_d

    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, Ly0/y;

    invoke-virtual {v12}, Ly0/y;->f()J

    move-result-wide v12

    iget-object v14, v7, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v14, Ly0/y;

    move-object/from16 p1, v7

    invoke-virtual {v14}, Ly0/y;->f()J

    move-result-wide v6

    invoke-static {v12, v13, v6, v7}, Ly0/x;->d(JJ)Z

    move-result v6

    if-eqz v6, :cond_c

    goto :goto_a

    :cond_c
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v7, p1

    const/4 v6, 0x1

    goto :goto_9

    :cond_d
    const/4 v11, 0x0

    :goto_a
    iput-object v11, v4, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    goto :goto_d

    :cond_e
    invoke-virtual {v7}, Ly0/n;->c()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    const/4 v6, 0x0

    :goto_b
    if-ge v6, v5, :cond_10

    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    move-object v9, v7

    check-cast v9, Ly0/y;

    invoke-virtual {v9}, Ly0/y;->i()Z

    move-result v9

    if-eqz v9, :cond_f

    goto :goto_c

    :cond_f
    add-int/lit8 v6, v6, 0x1

    goto :goto_b

    :cond_10
    const/4 v7, 0x0

    :goto_c
    check-cast v7, Ly0/y;

    if-eqz v7, :cond_11

    iget-object v4, v0, Ljj/c$b$a;->f:Lkotlin/jvm/internal/N;

    iput-object v7, v4, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    iget-object v4, v0, Ljj/c$b$a;->g:Lkotlin/jvm/internal/N;

    iput-object v7, v4, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    :goto_d
    move-object v7, v8

    :goto_e
    const/4 v4, 0x0

    const/4 v6, 0x1

    goto/16 :goto_0

    :cond_11
    move-object v7, v8

    const/4 v2, 0x1

    goto :goto_e

    :cond_12
    sget-object v1, LYg/J;->a:LYg/J;

    return-object v1
.end method

.method public final n(Ly0/b;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Ljj/c$b$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Ljj/c$b$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Ljj/c$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
