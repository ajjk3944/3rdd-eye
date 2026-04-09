.class public final LRa/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LRa/b$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:LTa/d;

.field private final c:LQa/a;

.field private final d:LIi/J;


# direct methods
.method public constructor <init>(Ljava/lang/String;LTa/d;LQa/a;LIi/J;)V
    .locals 1

    const-string/jumbo v0, "appPackage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "deviceIdentifiersService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "apiOwnershipManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "dispatcherDefault"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRa/b;->a:Ljava/lang/String;

    iput-object p2, p0, LRa/b;->b:LTa/d;

    iput-object p3, p0, LRa/b;->c:LQa/a;

    iput-object p4, p0, LRa/b;->d:LIi/J;

    return-void
.end method


# virtual methods
.method public a(LIi/N;LRa/b$a;Ldh/e;)Ljava/lang/Object;
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    instance-of v2, v1, LRa/b$b;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, LRa/b$b;

    iget v3, v2, LRa/b$b;->m:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, LRa/b$b;->m:I

    goto :goto_0

    :cond_0
    new-instance v2, LRa/b$b;

    invoke-direct {v2, v0, v1}, LRa/b$b;-><init>(LRa/b;Ldh/e;)V

    :goto_0
    iget-object v1, v2, LRa/b$b;->k:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v3

    iget v4, v2, LRa/b$b;->m:I

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x3

    if-eqz v4, :cond_4

    if-eq v4, v6, :cond_3

    if-eq v4, v5, :cond_2

    if-ne v4, v7, :cond_1

    iget-boolean v3, v2, LRa/b$b;->j:Z

    iget-boolean v4, v2, LRa/b$b;->i:Z

    iget v5, v2, LRa/b$b;->h:I

    iget-object v6, v2, LRa/b$b;->g:Ljava/lang/Object;

    check-cast v6, Lcom/ui/sso/api/UiAccountApi$a;

    iget-object v7, v2, LRa/b$b;->f:Ljava/lang/Object;

    check-cast v7, LNa/c;

    iget-object v8, v2, LRa/b$b;->e:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v9, v2, LRa/b$b;->d:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-object v10, v2, LRa/b$b;->c:Ljava/lang/Object;

    check-cast v10, LRa/b$a;

    iget-object v11, v2, LRa/b$b;->b:Ljava/lang/Object;

    check-cast v11, LIi/N;

    iget-object v2, v2, LRa/b$b;->a:Ljava/lang/Object;

    check-cast v2, LRa/b;

    invoke-static {v1}, LYg/v;->b(Ljava/lang/Object;)V

    move-object v12, v10

    move-object/from16 v20, v11

    move v10, v3

    move-object/from16 v21, v9

    move v9, v4

    move v4, v5

    move-object/from16 v5, v21

    move-object/from16 v22, v8

    move-object v8, v6

    move-object/from16 v6, v22

    goto/16 :goto_3

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string/jumbo v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-boolean v4, v2, LRa/b$b;->i:Z

    iget v5, v2, LRa/b$b;->h:I

    iget-object v6, v2, LRa/b$b;->g:Ljava/lang/Object;

    check-cast v6, Lcom/ui/sso/api/UiAccountApi$a;

    iget-object v8, v2, LRa/b$b;->f:Ljava/lang/Object;

    check-cast v8, LNa/c;

    iget-object v9, v2, LRa/b$b;->e:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-object v10, v2, LRa/b$b;->d:Ljava/lang/Object;

    check-cast v10, Ljava/lang/String;

    iget-object v11, v2, LRa/b$b;->c:Ljava/lang/Object;

    check-cast v11, LRa/b$a;

    iget-object v12, v2, LRa/b$b;->b:Ljava/lang/Object;

    check-cast v12, LIi/N;

    iget-object v13, v2, LRa/b$b;->a:Ljava/lang/Object;

    check-cast v13, LRa/b;

    invoke-static {v1}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_3
    iget v4, v2, LRa/b$b;->h:I

    iget-object v6, v2, LRa/b$b;->g:Ljava/lang/Object;

    check-cast v6, Lcom/ui/sso/api/UiAccountApi$a;

    iget-object v8, v2, LRa/b$b;->f:Ljava/lang/Object;

    check-cast v8, LNa/c;

    iget-object v9, v2, LRa/b$b;->e:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-object v10, v2, LRa/b$b;->d:Ljava/lang/Object;

    check-cast v10, Ljava/lang/String;

    iget-object v11, v2, LRa/b$b;->c:Ljava/lang/Object;

    check-cast v11, LRa/b$a;

    iget-object v12, v2, LRa/b$b;->b:Ljava/lang/Object;

    check-cast v12, LIi/N;

    iget-object v13, v2, LRa/b$b;->a:Ljava/lang/Object;

    check-cast v13, LRa/b;

    invoke-static {v1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {v1}, LYg/v;->b(Ljava/lang/Object;)V

    invoke-virtual/range {p2 .. p2}, LRa/b$a;->b()Ljava/lang/String;

    move-result-object v10

    iget-object v9, v0, LRa/b;->a:Ljava/lang/String;

    invoke-virtual/range {p2 .. p2}, LRa/b$a;->a()Lcom/ui/sso/account/UIAccountManager;

    move-result-object v1

    invoke-interface {v1}, Lcom/ui/sso/account/UIAccountManager;->d()LNa/c;

    move-result-object v8

    sget-object v1, Lcom/ui/sso/api/UiAccountApi$a;->DIRECT:Lcom/ui/sso/api/UiAccountApi$a;

    invoke-virtual/range {p2 .. p2}, LRa/b$a;->a()Lcom/ui/sso/account/UIAccountManager;

    move-result-object v4

    iput-object v0, v2, LRa/b$b;->a:Ljava/lang/Object;

    move-object/from16 v11, p1

    iput-object v11, v2, LRa/b$b;->b:Ljava/lang/Object;

    move-object/from16 v12, p2

    iput-object v12, v2, LRa/b$b;->c:Ljava/lang/Object;

    iput-object v10, v2, LRa/b$b;->d:Ljava/lang/Object;

    iput-object v9, v2, LRa/b$b;->e:Ljava/lang/Object;

    iput-object v8, v2, LRa/b$b;->f:Ljava/lang/Object;

    iput-object v1, v2, LRa/b$b;->g:Ljava/lang/Object;

    iput v7, v2, LRa/b$b;->h:I

    iput v6, v2, LRa/b$b;->m:I

    invoke-interface {v4, v2}, Lcom/ui/sso/account/UIAccountManager;->e(Ldh/e;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_5

    return-object v3

    :cond_5
    move-object v13, v0

    move-object v6, v1

    move-object v1, v4

    move v4, v7

    move-object/from16 v21, v12

    move-object v12, v11

    move-object/from16 v11, v21

    :goto_1
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    iget-object v14, v13, LRa/b;->c:LQa/a;

    iput-object v13, v2, LRa/b$b;->a:Ljava/lang/Object;

    iput-object v12, v2, LRa/b$b;->b:Ljava/lang/Object;

    iput-object v11, v2, LRa/b$b;->c:Ljava/lang/Object;

    iput-object v10, v2, LRa/b$b;->d:Ljava/lang/Object;

    iput-object v9, v2, LRa/b$b;->e:Ljava/lang/Object;

    iput-object v8, v2, LRa/b$b;->f:Ljava/lang/Object;

    iput-object v6, v2, LRa/b$b;->g:Ljava/lang/Object;

    iput v4, v2, LRa/b$b;->h:I

    iput-boolean v1, v2, LRa/b$b;->i:Z

    iput v5, v2, LRa/b$b;->m:I

    invoke-interface {v14, v2}, LQa/a;->a(Ldh/e;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v3, :cond_6

    return-object v3

    :cond_6
    move/from16 v21, v4

    move v4, v1

    move-object v1, v5

    move/from16 v5, v21

    :goto_2
    iget-object v14, v13, LRa/b;->a:Ljava/lang/String;

    invoke-static {v1, v14}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    iget-object v14, v13, LRa/b;->c:LQa/a;

    iput-object v13, v2, LRa/b$b;->a:Ljava/lang/Object;

    iput-object v12, v2, LRa/b$b;->b:Ljava/lang/Object;

    iput-object v11, v2, LRa/b$b;->c:Ljava/lang/Object;

    iput-object v10, v2, LRa/b$b;->d:Ljava/lang/Object;

    iput-object v9, v2, LRa/b$b;->e:Ljava/lang/Object;

    iput-object v8, v2, LRa/b$b;->f:Ljava/lang/Object;

    iput-object v6, v2, LRa/b$b;->g:Ljava/lang/Object;

    iput v5, v2, LRa/b$b;->h:I

    iput-boolean v4, v2, LRa/b$b;->i:Z

    iput-boolean v1, v2, LRa/b$b;->j:Z

    iput v7, v2, LRa/b$b;->m:I

    invoke-interface {v14, v2}, LQa/a;->c(Ldh/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_7

    return-object v3

    :cond_7
    move-object v7, v8

    move-object/from16 v20, v12

    move-object v8, v6

    move-object v6, v9

    move-object v12, v11

    move v9, v4

    move v4, v5

    move-object v5, v10

    move v10, v1

    move-object v1, v2

    move-object v2, v13

    :goto_3
    iget-object v3, v2, LRa/b;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    new-instance v14, Lcom/ui/sso/api/UiAccountApi$c;

    move-object v3, v14

    invoke-direct/range {v3 .. v11}, Lcom/ui/sso/api/UiAccountApi$c;-><init>(ILjava/lang/String;Ljava/lang/String;LNa/c;Lcom/ui/sso/api/UiAccountApi$a;ZZZ)V

    invoke-virtual {v12}, LRa/b$a;->a()Lcom/ui/sso/account/UIAccountManager;

    move-result-object v16

    iget-object v1, v2, LRa/b;->b:LTa/d;

    iget-object v2, v2, LRa/b;->d:LIi/J;

    invoke-virtual {v12}, LRa/b$a;->c()Lcom/ui/sso/api/UiAccountApi$d;

    move-result-object v15

    new-instance v18, Lcom/ui/sso/auth/b;

    invoke-direct/range {v18 .. v18}, Lcom/ui/sso/auth/b;-><init>()V

    new-instance v3, LRa/a;

    move-object v13, v3

    move-object/from16 v17, v1

    move-object/from16 v19, v2

    invoke-direct/range {v13 .. v20}, LRa/a;-><init>(Lcom/ui/sso/api/UiAccountApi$c;Lcom/ui/sso/api/UiAccountApi$d;Lcom/ui/sso/account/UIAccountManager;LTa/d;Lcom/ui/sso/auth/UiAuthSerializer;LIi/J;LIi/N;)V

    return-object v3
.end method
