.class final Lcom/ui/sso/api/a$p;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/sso/api/a;->m(LIi/N;Ldh/e;)Ljava/lang/Object;
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

.field h:I

.field final synthetic i:Lcom/ui/sso/api/a;

.field final synthetic j:LIi/N;


# direct methods
.method constructor <init>(Lcom/ui/sso/api/a;LIi/N;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/sso/api/a$p;->i:Lcom/ui/sso/api/a;

    iput-object p2, p0, Lcom/ui/sso/api/a$p;->j:LIi/N;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance p1, Lcom/ui/sso/api/a$p;

    iget-object v0, p0, Lcom/ui/sso/api/a$p;->i:Lcom/ui/sso/api/a;

    iget-object v1, p0, Lcom/ui/sso/api/a$p;->j:LIi/N;

    invoke-direct {p1, v0, v1, p2}, Lcom/ui/sso/api/a$p;-><init>(Lcom/ui/sso/api/a;LIi/N;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lcom/ui/sso/api/a$p;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/ui/sso/api/a$p;->h:I

    const/4 v3, 0x0

    const/4 v4, 0x3

    const/4 v5, 0x1

    const/4 v6, 0x2

    const/4 v7, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string/jumbo v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    iget-object v1, v0, Lcom/ui/sso/api/a$p;->a:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/N;

    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_12

    :pswitch_1
    iget-object v2, v0, Lcom/ui/sso/api/a$p;->b:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/N;

    iget-object v3, v0, Lcom/ui/sso/api/a$p;->a:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/internal/N;

    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    move-object v4, v2

    move-object/from16 v2, p1

    goto/16 :goto_11

    :pswitch_2
    iget-object v1, v0, Lcom/ui/sso/api/a$p;->a:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/N;

    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_10

    :pswitch_3
    iget-object v2, v0, Lcom/ui/sso/api/a$p;->d:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/N;

    iget-object v3, v0, Lcom/ui/sso/api/a$p;->c:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/internal/N;

    iget-object v4, v0, Lcom/ui/sso/api/a$p;->b:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/internal/N;

    iget-object v5, v0, Lcom/ui/sso/api/a$p;->a:Ljava/lang/Object;

    check-cast v5, Lcom/ui/sso/api/UiAccountApi$d;

    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    move-object v6, v5

    move-object v5, v4

    move-object v4, v3

    move-object v3, v2

    move-object/from16 v2, p1

    goto/16 :goto_e

    :pswitch_4
    iget-object v2, v0, Lcom/ui/sso/api/a$p;->g:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/N;

    iget-object v8, v0, Lcom/ui/sso/api/a$p;->f:Ljava/lang/Object;

    iget-object v9, v0, Lcom/ui/sso/api/a$p;->e:Ljava/lang/Object;

    check-cast v9, Ljava/util/Iterator;

    iget-object v10, v0, Lcom/ui/sso/api/a$p;->d:Ljava/lang/Object;

    check-cast v10, Lkotlin/jvm/internal/L;

    iget-object v11, v0, Lcom/ui/sso/api/a$p;->c:Ljava/lang/Object;

    check-cast v11, Lkotlin/jvm/internal/N;

    iget-object v12, v0, Lcom/ui/sso/api/a$p;->b:Ljava/lang/Object;

    check-cast v12, Lkotlin/jvm/internal/N;

    iget-object v13, v0, Lcom/ui/sso/api/a$p;->a:Ljava/lang/Object;

    check-cast v13, Lcom/ui/sso/api/UiAccountApi$d;

    :try_start_0
    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/ui/sso/api/UiAccountApi$Error; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_8

    :pswitch_5
    iget-object v2, v0, Lcom/ui/sso/api/a$p;->e:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/N;

    iget-object v8, v0, Lcom/ui/sso/api/a$p;->d:Ljava/lang/Object;

    check-cast v8, Lkotlin/jvm/internal/L;

    iget-object v9, v0, Lcom/ui/sso/api/a$p;->c:Ljava/lang/Object;

    check-cast v9, Lkotlin/jvm/internal/N;

    iget-object v10, v0, Lcom/ui/sso/api/a$p;->b:Ljava/lang/Object;

    check-cast v10, Lkotlin/jvm/internal/N;

    iget-object v11, v0, Lcom/ui/sso/api/a$p;->a:Ljava/lang/Object;

    check-cast v11, Lcom/ui/sso/api/UiAccountApi$d;

    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    move-object v12, v11

    move-object v11, v10

    move-object v10, v2

    move-object/from16 v2, p1

    goto/16 :goto_7

    :pswitch_6
    iget-object v2, v0, Lcom/ui/sso/api/a$p;->e:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/N;

    iget-object v8, v0, Lcom/ui/sso/api/a$p;->d:Ljava/lang/Object;

    check-cast v8, Lkotlin/jvm/internal/L;

    iget-object v9, v0, Lcom/ui/sso/api/a$p;->c:Ljava/lang/Object;

    check-cast v9, Lkotlin/jvm/internal/N;

    iget-object v10, v0, Lcom/ui/sso/api/a$p;->b:Ljava/lang/Object;

    check-cast v10, Lkotlin/jvm/internal/N;

    iget-object v11, v0, Lcom/ui/sso/api/a$p;->a:Ljava/lang/Object;

    check-cast v11, Lcom/ui/sso/api/UiAccountApi$d;

    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    move-object v12, v11

    move-object v11, v10

    move-object v10, v9

    move-object v9, v2

    move-object/from16 v2, p1

    goto/16 :goto_4

    :pswitch_7
    iget-object v2, v0, Lcom/ui/sso/api/a$p;->d:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/L;

    iget-object v3, v0, Lcom/ui/sso/api/a$p;->c:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/internal/N;

    iget-object v4, v0, Lcom/ui/sso/api/a$p;->b:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/internal/N;

    iget-object v5, v0, Lcom/ui/sso/api/a$p;->a:Ljava/lang/Object;

    check-cast v5, Lcom/ui/sso/api/UiAccountApi$d;

    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_d

    :pswitch_8
    iget-object v2, v0, Lcom/ui/sso/api/a$p;->e:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/N;

    iget-object v8, v0, Lcom/ui/sso/api/a$p;->d:Ljava/lang/Object;

    check-cast v8, Lkotlin/jvm/internal/L;

    iget-object v9, v0, Lcom/ui/sso/api/a$p;->c:Ljava/lang/Object;

    check-cast v9, Lkotlin/jvm/internal/N;

    iget-object v10, v0, Lcom/ui/sso/api/a$p;->b:Ljava/lang/Object;

    check-cast v10, Lkotlin/jvm/internal/N;

    iget-object v11, v0, Lcom/ui/sso/api/a$p;->a:Ljava/lang/Object;

    check-cast v11, Lcom/ui/sso/api/UiAccountApi$d;

    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    move-object v12, v11

    move-object/from16 v11, p1

    move-object/from16 v16, v10

    move-object v10, v9

    move-object/from16 v9, v16

    goto/16 :goto_2

    :pswitch_9
    iget-object v2, v0, Lcom/ui/sso/api/a$p;->d:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/L;

    iget-object v8, v0, Lcom/ui/sso/api/a$p;->c:Ljava/lang/Object;

    check-cast v8, Lkotlin/jvm/internal/N;

    iget-object v9, v0, Lcom/ui/sso/api/a$p;->b:Ljava/lang/Object;

    check-cast v9, Lkotlin/jvm/internal/N;

    iget-object v10, v0, Lcom/ui/sso/api/a$p;->a:Ljava/lang/Object;

    check-cast v10, Lcom/ui/sso/api/UiAccountApi$d;

    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_a
    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    new-instance v2, Lcom/ui/sso/api/UiAccountApi$d;

    invoke-direct {v2}, Lcom/ui/sso/api/UiAccountApi$d;-><init>()V

    new-instance v8, Lkotlin/jvm/internal/N;

    invoke-direct {v8}, Lkotlin/jvm/internal/N;-><init>()V

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v9

    iput-object v9, v8, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    new-instance v9, Lkotlin/jvm/internal/N;

    invoke-direct {v9}, Lkotlin/jvm/internal/N;-><init>()V

    new-instance v10, Lkotlin/jvm/internal/L;

    invoke-direct {v10}, Lkotlin/jvm/internal/L;-><init>()V

    move-object/from16 v16, v10

    move-object v10, v2

    move-object/from16 v2, v16

    move-object/from16 v17, v9

    move-object v9, v8

    move-object/from16 v8, v17

    :goto_0
    iget v11, v2, Lkotlin/jvm/internal/L;->a:I

    if-gt v11, v6, :cond_16

    if-eqz v11, :cond_0

    iput-object v10, v0, Lcom/ui/sso/api/a$p;->a:Ljava/lang/Object;

    iput-object v9, v0, Lcom/ui/sso/api/a$p;->b:Ljava/lang/Object;

    iput-object v8, v0, Lcom/ui/sso/api/a$p;->c:Ljava/lang/Object;

    iput-object v2, v0, Lcom/ui/sso/api/a$p;->d:Ljava/lang/Object;

    iput-object v7, v0, Lcom/ui/sso/api/a$p;->e:Ljava/lang/Object;

    iput-object v7, v0, Lcom/ui/sso/api/a$p;->f:Ljava/lang/Object;

    iput-object v7, v0, Lcom/ui/sso/api/a$p;->g:Ljava/lang/Object;

    iput v5, v0, Lcom/ui/sso/api/a$p;->h:I

    const-wide/16 v11, 0xc8

    invoke-static {v11, v12, v0}, LIi/Y;->a(JLdh/e;)Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v1, :cond_0

    return-object v1

    :cond_0
    :goto_1
    new-instance v11, Lcom/ui/sso/api/a$p$h;

    invoke-direct {v11, v2}, Lcom/ui/sso/api/a$p$h;-><init>(Lkotlin/jvm/internal/L;)V

    invoke-static {v11}, LUa/a;->e(Lmh/a;)V

    sget-object v11, Lcom/ui/sso/api/a$p$k;->a:Lcom/ui/sso/api/a$p$k;

    invoke-static {v11}, LUa/a;->e(Lmh/a;)V

    iget-object v11, v0, Lcom/ui/sso/api/a$p;->i:Lcom/ui/sso/api/a;

    iget-object v12, v0, Lcom/ui/sso/api/a$p;->j:LIi/N;

    iput-object v10, v0, Lcom/ui/sso/api/a$p;->a:Ljava/lang/Object;

    iput-object v9, v0, Lcom/ui/sso/api/a$p;->b:Ljava/lang/Object;

    iput-object v8, v0, Lcom/ui/sso/api/a$p;->c:Ljava/lang/Object;

    iput-object v2, v0, Lcom/ui/sso/api/a$p;->d:Ljava/lang/Object;

    iput-object v8, v0, Lcom/ui/sso/api/a$p;->e:Ljava/lang/Object;

    iput-object v7, v0, Lcom/ui/sso/api/a$p;->f:Ljava/lang/Object;

    iput-object v7, v0, Lcom/ui/sso/api/a$p;->g:Ljava/lang/Object;

    iput v6, v0, Lcom/ui/sso/api/a$p;->h:I

    invoke-static {v11, v12, v10, v0}, Lcom/ui/sso/api/a;->h(Lcom/ui/sso/api/a;LIi/N;Lcom/ui/sso/api/UiAccountApi$d;Ldh/e;)Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v1, :cond_1

    return-object v1

    :cond_1
    move-object v12, v10

    move-object v10, v8

    move-object v8, v2

    move-object v2, v10

    :goto_2
    iput-object v11, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    iget-object v2, v10, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-eqz v2, :cond_3

    new-instance v2, Lcom/ui/sso/api/a$p$l;

    invoke-direct {v2, v10}, Lcom/ui/sso/api/a$p$l;-><init>(Lkotlin/jvm/internal/N;)V

    invoke-static {v2}, LUa/a;->e(Lmh/a;)V

    iget-object v2, v0, Lcom/ui/sso/api/a$p;->i:Lcom/ui/sso/api/a;

    iget-object v3, v10, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v3, Lcom/ui/sso/api/UiAccountApi;

    iput-object v12, v0, Lcom/ui/sso/api/a$p;->a:Ljava/lang/Object;

    iput-object v9, v0, Lcom/ui/sso/api/a$p;->b:Ljava/lang/Object;

    iput-object v10, v0, Lcom/ui/sso/api/a$p;->c:Ljava/lang/Object;

    iput-object v8, v0, Lcom/ui/sso/api/a$p;->d:Ljava/lang/Object;

    iput-object v7, v0, Lcom/ui/sso/api/a$p;->e:Ljava/lang/Object;

    iput v4, v0, Lcom/ui/sso/api/a$p;->h:I

    invoke-static {v2, v3, v0}, Lcom/ui/sso/api/a;->j(Lcom/ui/sso/api/a;Lcom/ui/sso/api/UiAccountApi;Ldh/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_2

    return-object v1

    :cond_2
    move-object v2, v8

    move-object v4, v9

    move-object v3, v10

    :goto_3
    move-object v5, v12

    goto/16 :goto_d

    :cond_3
    sget-object v2, Lcom/ui/sso/api/a$p$m;->a:Lcom/ui/sso/api/a$p$m;

    invoke-static {v2}, LUa/a;->e(Lmh/a;)V

    iget-object v2, v0, Lcom/ui/sso/api/a$p;->i:Lcom/ui/sso/api/a;

    iget-object v11, v0, Lcom/ui/sso/api/a$p;->j:LIi/N;

    iput-object v12, v0, Lcom/ui/sso/api/a$p;->a:Ljava/lang/Object;

    iput-object v9, v0, Lcom/ui/sso/api/a$p;->b:Ljava/lang/Object;

    iput-object v10, v0, Lcom/ui/sso/api/a$p;->c:Ljava/lang/Object;

    iput-object v8, v0, Lcom/ui/sso/api/a$p;->d:Ljava/lang/Object;

    iput-object v9, v0, Lcom/ui/sso/api/a$p;->e:Ljava/lang/Object;

    const/4 v13, 0x4

    iput v13, v0, Lcom/ui/sso/api/a$p;->h:I

    invoke-static {v2, v11, v12, v0}, Lcom/ui/sso/api/a;->g(Lcom/ui/sso/api/a;LIi/N;Lcom/ui/sso/api/UiAccountApi$d;Ldh/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v11, v9

    :goto_4
    iput-object v2, v9, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    new-instance v2, Lcom/ui/sso/api/a$p$n;

    invoke-direct {v2, v11}, Lcom/ui/sso/api/a$p$n;-><init>(Lkotlin/jvm/internal/N;)V

    invoke-static {v2}, LUa/a;->e(Lmh/a;)V

    iget-object v2, v11, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v13, v9

    check-cast v13, Lcom/ui/sso/api/provider/a;

    invoke-virtual {v13}, Lcom/ui/sso/api/provider/a;->getState()Lcom/ui/sso/api/UiAccountApi$c;

    move-result-object v14

    invoke-virtual {v14}, Lcom/ui/sso/api/UiAccountApi$c;->g()Z

    move-result v14

    if-eqz v14, :cond_5

    invoke-virtual {v13}, Lcom/ui/sso/api/provider/a;->getState()Lcom/ui/sso/api/UiAccountApi$c;

    move-result-object v13

    invoke-virtual {v13}, Lcom/ui/sso/api/UiAccountApi$c;->f()Z

    move-result v13

    if-eqz v13, :cond_5

    goto :goto_5

    :cond_6
    move-object v9, v7

    :goto_5
    iput-object v9, v10, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-eqz v9, :cond_8

    new-instance v2, Lcom/ui/sso/api/a$p$o;

    invoke-direct {v2, v10}, Lcom/ui/sso/api/a$p$o;-><init>(Lkotlin/jvm/internal/N;)V

    invoke-static {v2}, LUa/a;->e(Lmh/a;)V

    iget-object v2, v0, Lcom/ui/sso/api/a$p;->i:Lcom/ui/sso/api/a;

    iget-object v3, v10, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v3, Lcom/ui/sso/api/UiAccountApi;

    iput-object v12, v0, Lcom/ui/sso/api/a$p;->a:Ljava/lang/Object;

    iput-object v11, v0, Lcom/ui/sso/api/a$p;->b:Ljava/lang/Object;

    iput-object v10, v0, Lcom/ui/sso/api/a$p;->c:Ljava/lang/Object;

    iput-object v8, v0, Lcom/ui/sso/api/a$p;->d:Ljava/lang/Object;

    iput-object v7, v0, Lcom/ui/sso/api/a$p;->e:Ljava/lang/Object;

    const/4 v4, 0x5

    iput v4, v0, Lcom/ui/sso/api/a$p;->h:I

    invoke-static {v2, v3, v0}, Lcom/ui/sso/api/a;->j(Lcom/ui/sso/api/a;Lcom/ui/sso/api/UiAccountApi;Ldh/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_7

    return-object v1

    :cond_7
    move-object v2, v8

    move-object v3, v10

    :goto_6
    move-object v4, v11

    goto :goto_3

    :cond_8
    sget-object v2, Lcom/ui/sso/api/a$p$p;->a:Lcom/ui/sso/api/a$p$p;

    invoke-static {v2}, LUa/a;->e(Lmh/a;)V

    iget-object v2, v0, Lcom/ui/sso/api/a$p;->i:Lcom/ui/sso/api/a;

    iget-object v9, v0, Lcom/ui/sso/api/a$p;->j:LIi/N;

    iput-object v12, v0, Lcom/ui/sso/api/a$p;->a:Ljava/lang/Object;

    iput-object v11, v0, Lcom/ui/sso/api/a$p;->b:Ljava/lang/Object;

    iput-object v10, v0, Lcom/ui/sso/api/a$p;->c:Ljava/lang/Object;

    iput-object v8, v0, Lcom/ui/sso/api/a$p;->d:Ljava/lang/Object;

    iput-object v10, v0, Lcom/ui/sso/api/a$p;->e:Ljava/lang/Object;

    const/4 v13, 0x6

    iput v13, v0, Lcom/ui/sso/api/a$p;->h:I

    invoke-static {v2, v9, v12, v0}, Lcom/ui/sso/api/a;->c(Lcom/ui/sso/api/a;LIi/N;Lcom/ui/sso/api/UiAccountApi$d;Ldh/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_9

    return-object v1

    :cond_9
    move-object v9, v10

    :goto_7
    iput-object v2, v10, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    iget-object v2, v9, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-eqz v2, :cond_b

    new-instance v2, Lcom/ui/sso/api/a$p$q;

    invoke-direct {v2, v9}, Lcom/ui/sso/api/a$p$q;-><init>(Lkotlin/jvm/internal/N;)V

    invoke-static {v2}, LUa/a;->e(Lmh/a;)V

    iget-object v2, v0, Lcom/ui/sso/api/a$p;->i:Lcom/ui/sso/api/a;

    iget-object v3, v9, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v3, Lcom/ui/sso/api/UiAccountApi;

    iput-object v12, v0, Lcom/ui/sso/api/a$p;->a:Ljava/lang/Object;

    iput-object v11, v0, Lcom/ui/sso/api/a$p;->b:Ljava/lang/Object;

    iput-object v9, v0, Lcom/ui/sso/api/a$p;->c:Ljava/lang/Object;

    iput-object v8, v0, Lcom/ui/sso/api/a$p;->d:Ljava/lang/Object;

    iput-object v7, v0, Lcom/ui/sso/api/a$p;->e:Ljava/lang/Object;

    const/4 v4, 0x7

    iput v4, v0, Lcom/ui/sso/api/a$p;->h:I

    invoke-static {v2, v3, v0}, Lcom/ui/sso/api/a;->j(Lcom/ui/sso/api/a;Lcom/ui/sso/api/UiAccountApi;Ldh/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_a

    return-object v1

    :cond_a
    move-object v2, v8

    move-object v3, v9

    goto :goto_6

    :cond_b
    sget-object v2, Lcom/ui/sso/api/a$p$a;->a:Lcom/ui/sso/api/a$p$a;

    invoke-static {v2}, LUa/a;->e(Lmh/a;)V

    iget-object v2, v11, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v10, v8

    move-object v13, v12

    move-object v12, v11

    move-object v11, v9

    move-object v9, v2

    move-object v2, v11

    :cond_c
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_f

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v14, v8

    check-cast v14, Lcom/ui/sso/api/provider/a;

    invoke-virtual {v14}, Lcom/ui/sso/api/provider/a;->getState()Lcom/ui/sso/api/UiAccountApi$c;

    move-result-object v15

    invoke-virtual {v15}, Lcom/ui/sso/api/UiAccountApi$c;->c()I

    move-result v15

    if-lt v15, v4, :cond_e

    invoke-virtual {v14}, Lcom/ui/sso/api/provider/a;->getState()Lcom/ui/sso/api/UiAccountApi$c;

    move-result-object v15

    invoke-virtual {v15}, Lcom/ui/sso/api/UiAccountApi$c;->f()Z

    move-result v15

    if-eqz v15, :cond_e

    :try_start_1
    iput-object v13, v0, Lcom/ui/sso/api/a$p;->a:Ljava/lang/Object;

    iput-object v12, v0, Lcom/ui/sso/api/a$p;->b:Ljava/lang/Object;

    iput-object v11, v0, Lcom/ui/sso/api/a$p;->c:Ljava/lang/Object;

    iput-object v10, v0, Lcom/ui/sso/api/a$p;->d:Ljava/lang/Object;

    iput-object v9, v0, Lcom/ui/sso/api/a$p;->e:Ljava/lang/Object;

    iput-object v8, v0, Lcom/ui/sso/api/a$p;->f:Ljava/lang/Object;

    iput-object v2, v0, Lcom/ui/sso/api/a$p;->g:Ljava/lang/Object;

    const/16 v15, 0x8

    iput v15, v0, Lcom/ui/sso/api/a$p;->h:I

    invoke-virtual {v14, v0}, Lcom/ui/sso/api/provider/a;->t(Ldh/e;)Ljava/lang/Object;

    move-result-object v14
    :try_end_1
    .catch Lcom/ui/sso/api/UiAccountApi$Error; {:try_start_1 .. :try_end_1} :catch_0

    if-ne v14, v1, :cond_d

    return-object v1

    :cond_d
    :goto_8
    move v14, v5

    goto :goto_9

    :catch_0
    :cond_e
    move v14, v3

    :goto_9
    if-eqz v14, :cond_c

    :goto_a
    move-object v9, v12

    goto :goto_b

    :cond_f
    move-object v8, v7

    goto :goto_a

    :goto_b
    iput-object v8, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    iget-object v2, v11, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-eqz v2, :cond_10

    new-instance v2, Lcom/ui/sso/api/a$p$b;

    invoke-direct {v2, v11}, Lcom/ui/sso/api/a$p$b;-><init>(Lkotlin/jvm/internal/N;)V

    invoke-static {v2}, LUa/a;->e(Lmh/a;)V

    iget-object v2, v0, Lcom/ui/sso/api/a$p;->i:Lcom/ui/sso/api/a;

    iget-object v3, v11, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v3, Lcom/ui/sso/api/UiAccountApi;

    iput-object v13, v0, Lcom/ui/sso/api/a$p;->a:Ljava/lang/Object;

    iput-object v9, v0, Lcom/ui/sso/api/a$p;->b:Ljava/lang/Object;

    iput-object v11, v0, Lcom/ui/sso/api/a$p;->c:Ljava/lang/Object;

    iput-object v10, v0, Lcom/ui/sso/api/a$p;->d:Ljava/lang/Object;

    iput-object v7, v0, Lcom/ui/sso/api/a$p;->e:Ljava/lang/Object;

    iput-object v7, v0, Lcom/ui/sso/api/a$p;->f:Ljava/lang/Object;

    iput-object v7, v0, Lcom/ui/sso/api/a$p;->g:Ljava/lang/Object;

    const/16 v4, 0x9

    iput v4, v0, Lcom/ui/sso/api/a$p;->h:I

    invoke-static {v2, v3, v0}, Lcom/ui/sso/api/a;->j(Lcom/ui/sso/api/a;Lcom/ui/sso/api/UiAccountApi;Ldh/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_13

    return-object v1

    :cond_10
    sget-object v2, Lcom/ui/sso/api/a$p$c;->a:Lcom/ui/sso/api/a$p$c;

    invoke-static {v2}, LUa/a;->e(Lmh/a;)V

    iget-object v2, v9, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_11
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_12

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v12, v8

    check-cast v12, Lcom/ui/sso/api/provider/a;

    invoke-virtual {v12}, Lcom/ui/sso/api/provider/a;->getState()Lcom/ui/sso/api/UiAccountApi$c;

    move-result-object v12

    invoke-virtual {v12}, Lcom/ui/sso/api/UiAccountApi$c;->f()Z

    move-result v12

    if-eqz v12, :cond_11

    goto :goto_c

    :cond_12
    move-object v8, v7

    :goto_c
    iput-object v8, v11, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-eqz v8, :cond_14

    new-instance v2, Lcom/ui/sso/api/a$p$d;

    invoke-direct {v2, v11}, Lcom/ui/sso/api/a$p$d;-><init>(Lkotlin/jvm/internal/N;)V

    invoke-static {v2}, LUa/a;->e(Lmh/a;)V

    :cond_13
    move-object v4, v9

    move-object v2, v10

    move-object v3, v11

    move-object v5, v13

    goto :goto_d

    :cond_14
    iget v2, v10, Lkotlin/jvm/internal/L;->a:I

    add-int/2addr v2, v5

    iput v2, v10, Lkotlin/jvm/internal/L;->a:I

    if-gt v2, v6, :cond_15

    sget-object v2, Lcom/ui/sso/api/a$p$e;->a:Lcom/ui/sso/api/a$p$e;

    invoke-static {v2}, LUa/a;->e(Lmh/a;)V

    :cond_15
    move-object v2, v10

    move-object v8, v11

    move-object v10, v13

    goto/16 :goto_0

    :cond_16
    move-object v3, v8

    move-object v4, v9

    move-object v5, v10

    :goto_d
    iget v2, v2, Lkotlin/jvm/internal/L;->a:I

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/b;->d(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v5, v2}, Lcom/ui/sso/api/UiAccountApi$d;->g(Ljava/lang/Integer;)V

    iget-object v2, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-eqz v2, :cond_17

    return-object v2

    :cond_17
    sget-object v2, Lcom/ui/sso/api/a$p$f;->a:Lcom/ui/sso/api/a$p$f;

    invoke-static {v2, v7, v6, v7}, LUa/a;->g(Lmh/a;Ljava/lang/Throwable;ILjava/lang/Object;)V

    iget-object v2, v0, Lcom/ui/sso/api/a$p;->i:Lcom/ui/sso/api/a;

    iget-object v6, v0, Lcom/ui/sso/api/a$p;->j:LIi/N;

    iput-object v5, v0, Lcom/ui/sso/api/a$p;->a:Ljava/lang/Object;

    iput-object v4, v0, Lcom/ui/sso/api/a$p;->b:Ljava/lang/Object;

    iput-object v3, v0, Lcom/ui/sso/api/a$p;->c:Ljava/lang/Object;

    iput-object v3, v0, Lcom/ui/sso/api/a$p;->d:Ljava/lang/Object;

    iput-object v7, v0, Lcom/ui/sso/api/a$p;->e:Ljava/lang/Object;

    iput-object v7, v0, Lcom/ui/sso/api/a$p;->f:Ljava/lang/Object;

    iput-object v7, v0, Lcom/ui/sso/api/a$p;->g:Ljava/lang/Object;

    const/16 v8, 0xa

    iput v8, v0, Lcom/ui/sso/api/a$p;->h:I

    invoke-static {v2, v6, v5, v0}, Lcom/ui/sso/api/a;->i(Lcom/ui/sso/api/a;LIi/N;Lcom/ui/sso/api/UiAccountApi$d;Ldh/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_18

    return-object v1

    :cond_18
    move-object v6, v5

    move-object v5, v4

    move-object v4, v3

    :goto_e
    iput-object v2, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    iget-object v2, v4, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-eqz v2, :cond_19

    new-instance v1, Lcom/ui/sso/api/a$p$g;

    invoke-direct {v1, v4}, Lcom/ui/sso/api/a$p$g;-><init>(Lkotlin/jvm/internal/N;)V

    invoke-static {v1}, LUa/a;->e(Lmh/a;)V

    iget-object v1, v4, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    return-object v1

    :cond_19
    iget-object v2, v5, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Lcom/ui/sso/api/provider/a;

    invoke-virtual {v5}, Lcom/ui/sso/api/provider/a;->getState()Lcom/ui/sso/api/UiAccountApi$c;

    move-result-object v5

    invoke-virtual {v5}, Lcom/ui/sso/api/UiAccountApi$c;->h()Z

    move-result v5

    if-eqz v5, :cond_1a

    goto :goto_f

    :cond_1b
    move-object v3, v7

    :goto_f
    iput-object v3, v4, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-eqz v3, :cond_1d

    new-instance v2, Lcom/ui/sso/api/a$p$i;

    invoke-direct {v2, v4}, Lcom/ui/sso/api/a$p$i;-><init>(Lkotlin/jvm/internal/N;)V

    invoke-static {v2}, LUa/a;->e(Lmh/a;)V

    iget-object v2, v0, Lcom/ui/sso/api/a$p;->i:Lcom/ui/sso/api/a;

    iget-object v3, v4, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v3, Lcom/ui/sso/api/UiAccountApi;

    iput-object v4, v0, Lcom/ui/sso/api/a$p;->a:Ljava/lang/Object;

    iput-object v7, v0, Lcom/ui/sso/api/a$p;->b:Ljava/lang/Object;

    iput-object v7, v0, Lcom/ui/sso/api/a$p;->c:Ljava/lang/Object;

    iput-object v7, v0, Lcom/ui/sso/api/a$p;->d:Ljava/lang/Object;

    const/16 v5, 0xb

    iput v5, v0, Lcom/ui/sso/api/a$p;->h:I

    invoke-static {v2, v3, v0}, Lcom/ui/sso/api/a;->j(Lcom/ui/sso/api/a;Lcom/ui/sso/api/UiAccountApi;Ldh/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_1c

    return-object v1

    :cond_1c
    move-object v1, v4

    :goto_10
    iget-object v1, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    return-object v1

    :cond_1d
    iget-object v2, v0, Lcom/ui/sso/api/a$p;->i:Lcom/ui/sso/api/a;

    iget-object v3, v0, Lcom/ui/sso/api/a$p;->j:LIi/N;

    iput-object v4, v0, Lcom/ui/sso/api/a$p;->a:Ljava/lang/Object;

    iput-object v4, v0, Lcom/ui/sso/api/a$p;->b:Ljava/lang/Object;

    iput-object v7, v0, Lcom/ui/sso/api/a$p;->c:Ljava/lang/Object;

    iput-object v7, v0, Lcom/ui/sso/api/a$p;->d:Ljava/lang/Object;

    const/16 v5, 0xc

    iput v5, v0, Lcom/ui/sso/api/a$p;->h:I

    invoke-static {v2, v3, v6, v0}, Lcom/ui/sso/api/a;->e(Lcom/ui/sso/api/a;LIi/N;Lcom/ui/sso/api/UiAccountApi$d;Ldh/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_1e

    return-object v1

    :cond_1e
    move-object v3, v4

    :goto_11
    iput-object v2, v4, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    new-instance v2, Lcom/ui/sso/api/a$p$j;

    invoke-direct {v2, v3}, Lcom/ui/sso/api/a$p$j;-><init>(Lkotlin/jvm/internal/N;)V

    invoke-static {v2}, LUa/a;->e(Lmh/a;)V

    iget-object v2, v0, Lcom/ui/sso/api/a$p;->i:Lcom/ui/sso/api/a;

    iget-object v4, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v4, Lcom/ui/sso/api/UiAccountApi;

    iput-object v3, v0, Lcom/ui/sso/api/a$p;->a:Ljava/lang/Object;

    iput-object v7, v0, Lcom/ui/sso/api/a$p;->b:Ljava/lang/Object;

    const/16 v5, 0xd

    iput v5, v0, Lcom/ui/sso/api/a$p;->h:I

    invoke-static {v2, v4, v0}, Lcom/ui/sso/api/a;->j(Lcom/ui/sso/api/a;Lcom/ui/sso/api/UiAccountApi;Ldh/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_1f

    return-object v1

    :cond_1f
    move-object v1, v3

    :goto_12
    iget-object v1, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_7
        :pswitch_5
        :pswitch_7
        :pswitch_4
        :pswitch_7
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/ui/sso/api/a$p;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lcom/ui/sso/api/a$p;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lcom/ui/sso/api/a$p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
