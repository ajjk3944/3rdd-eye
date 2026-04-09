.class public final Lcom/ui/core/ui/sso/SSOAccountVM;
.super LR9/a;
.source "SourceFile"

# interfaces
.implements Lcom/ui/core/ui/sso/c$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/core/ui/sso/SSOAccountVM$AccountCreationError;
    }
.end annotation


# instance fields
.field private final e:Lcom/ui/sso/api/UiAccountApi$b;

.field private final f:Landroidx/lifecycle/E;

.field private g:Lcom/ui/core/ui/sso/c;

.field private h:Lcom/ui/core/ui/sso/UiSSO$d;

.field private final i:Lcom/ui/core/ui/sso/UiSSO$e;

.field private final j:LYg/m;

.field private final k:LYg/m;

.field private final l:LLi/y;

.field private final m:LLi/g;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/ui/sso/api/UiAccountApi$b;Landroidx/lifecycle/E;LP9/k;)V
    .locals 1

    const-string/jumbo p3, "uiAccountApiService"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p3, "savedStateHandle"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LR9/a;-><init>()V

    iput-object p1, p0, Lcom/ui/core/ui/sso/SSOAccountVM;->e:Lcom/ui/sso/api/UiAccountApi$b;

    iput-object p2, p0, Lcom/ui/core/ui/sso/SSOAccountVM;->f:Landroidx/lifecycle/E;

    const-string/jumbo p1, "mfa_params"

    invoke-virtual {p2, p1}, Landroidx/lifecycle/E;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/core/ui/sso/UiSSO$d;

    iput-object p1, p0, Lcom/ui/core/ui/sso/SSOAccountVM;->h:Lcom/ui/core/ui/sso/UiSSO$d;

    const-string/jumbo p1, "pkce_params"

    invoke-virtual {p2, p1}, Landroidx/lifecycle/E;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/core/ui/sso/UiSSO$e;

    iput-object p1, p0, Lcom/ui/core/ui/sso/SSOAccountVM;->i:Lcom/ui/core/ui/sso/UiSSO$e;

    new-instance p1, LP9/c;

    invoke-direct {p1, p0}, LP9/c;-><init>(Lcom/ui/core/ui/sso/SSOAccountVM;)V

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lcom/ui/core/ui/sso/SSOAccountVM;->j:LYg/m;

    new-instance p1, LP9/d;

    invoke-direct {p1, p0}, LP9/d;-><init>(Lcom/ui/core/ui/sso/SSOAccountVM;)V

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lcom/ui/core/ui/sso/SSOAccountVM;->k:LYg/m;

    const/4 p1, 0x0

    const/4 p2, 0x6

    const/4 p3, 0x1

    const/4 v0, 0x0

    invoke-static {p3, v0, p1, p2, p1}, LLi/F;->b(IILKi/a;ILjava/lang/Object;)LLi/y;

    move-result-object p1

    iput-object p1, p0, Lcom/ui/core/ui/sso/SSOAccountVM;->l:LLi/y;

    iput-object p1, p0, Lcom/ui/core/ui/sso/SSOAccountVM;->m:LLi/g;

    invoke-direct {p0}, Lcom/ui/core/ui/sso/SSOAccountVM;->t0()V

    return-void
.end method

.method public static synthetic e0(Lcom/ui/core/ui/sso/SSOAccountVM;)LTa/c;
    .locals 0

    invoke-static {p0}, Lcom/ui/core/ui/sso/SSOAccountVM;->n0(Lcom/ui/core/ui/sso/SSOAccountVM;)LTa/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f0()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/ui/core/ui/sso/SSOAccountVM;->m0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic g0(Lcom/ui/core/ui/sso/SSOAccountVM;)Lcom/ui/sso/api/UiAccountApi;
    .locals 0

    invoke-static {p0}, Lcom/ui/core/ui/sso/SSOAccountVM;->k0(Lcom/ui/core/ui/sso/SSOAccountVM;)Lcom/ui/sso/api/UiAccountApi;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic h0(Lcom/ui/core/ui/sso/SSOAccountVM;Lcom/ui/core/ui/sso/UiSSO$a;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/ui/core/ui/sso/SSOAccountVM;->l0(Lcom/ui/core/ui/sso/UiSSO$a;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic i0(Lcom/ui/core/ui/sso/SSOAccountVM;)Lcom/ui/sso/api/UiAccountApi;
    .locals 0

    invoke-direct {p0}, Lcom/ui/core/ui/sso/SSOAccountVM;->o0()Lcom/ui/sso/api/UiAccountApi;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic j0(Lcom/ui/core/ui/sso/SSOAccountVM;)Lcom/ui/sso/api/UiAccountApi$b;
    .locals 0

    iget-object p0, p0, Lcom/ui/core/ui/sso/SSOAccountVM;->e:Lcom/ui/sso/api/UiAccountApi$b;

    return-object p0
.end method

.method private static final k0(Lcom/ui/core/ui/sso/SSOAccountVM;)Lcom/ui/sso/api/UiAccountApi;
    .locals 2

    new-instance v0, Lcom/ui/core/ui/sso/SSOAccountVM$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/ui/core/ui/sso/SSOAccountVM$a;-><init>(Lcom/ui/core/ui/sso/SSOAccountVM;Ldh/e;)V

    const/4 p0, 0x1

    invoke-static {v1, v0, p0, v1}, LIi/i;->f(Ldh/i;Lmh/p;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ui/sso/api/UiAccountApi;

    return-object p0
.end method

.method private final l0(Lcom/ui/core/ui/sso/UiSSO$a;Ldh/e;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    instance-of v2, v0, Lcom/ui/core/ui/sso/SSOAccountVM$b;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lcom/ui/core/ui/sso/SSOAccountVM$b;

    iget v3, v2, Lcom/ui/core/ui/sso/SSOAccountVM$b;->f:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/ui/core/ui/sso/SSOAccountVM$b;->f:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/ui/core/ui/sso/SSOAccountVM$b;

    invoke-direct {v2, v1, v0}, Lcom/ui/core/ui/sso/SSOAccountVM$b;-><init>(Lcom/ui/core/ui/sso/SSOAccountVM;Ldh/e;)V

    :goto_0
    iget-object v0, v2, Lcom/ui/core/ui/sso/SSOAccountVM$b;->d:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v3

    iget v4, v2, Lcom/ui/core/ui/sso/SSOAccountVM$b;->f:I

    const/4 v5, 0x0

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eqz v4, :cond_4

    if-eq v4, v8, :cond_3

    if-eq v4, v7, :cond_2

    if-ne v4, v6, :cond_1

    iget-object v2, v2, Lcom/ui/core/ui/sso/SSOAccountVM$b;->a:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    :try_start_0
    invoke-static {v0}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/ui/sso/api/UiAccountApi$Error; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_4

    :catch_0
    move-exception v0

    goto/16 :goto_6

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v4, v2, Lcom/ui/core/ui/sso/SSOAccountVM$b;->b:Ljava/lang/Object;

    check-cast v4, LNa/b;

    iget-object v7, v2, Lcom/ui/core/ui/sso/SSOAccountVM$b;->a:Ljava/lang/Object;

    check-cast v7, Lcom/ui/core/ui/sso/SSOAccountVM;

    :try_start_1
    invoke-static {v0}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/ui/sso/api/UiAccountApi$Error; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_3

    :cond_3
    iget-object v4, v2, Lcom/ui/core/ui/sso/SSOAccountVM$b;->c:Ljava/lang/Object;

    check-cast v4, LNa/b;

    iget-object v8, v2, Lcom/ui/core/ui/sso/SSOAccountVM$b;->b:Ljava/lang/Object;

    check-cast v8, Lcom/ui/core/ui/sso/UiSSO$a;

    iget-object v9, v2, Lcom/ui/core/ui/sso/SSOAccountVM$b;->a:Ljava/lang/Object;

    check-cast v9, Lcom/ui/core/ui/sso/SSOAccountVM;

    :try_start_2
    invoke-static {v0}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_2
    .catch Lcom/ui/sso/api/UiAccountApi$Error; {:try_start_2 .. :try_end_2} :catch_0

    move-object v11, v4

    move-object v4, v8

    goto :goto_1

    :cond_4
    invoke-static {v0}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_3
    invoke-virtual/range {p1 .. p1}, Lcom/ui/core/ui/sso/UiSSO$a;->e()LEb/r;

    move-result-object v0

    invoke-virtual {v0}, LEb/r;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_2

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lcom/ui/core/ui/sso/UiSSO$a;->e()LEb/r;

    move-result-object v4

    invoke-virtual {v4}, LEb/r;->g()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lcom/ui/core/ui/sso/UiSSO$a;->e()LEb/r;

    move-result-object v9

    invoke-virtual {v9}, LEb/r;->c()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lcom/ui/core/ui/sso/UiSSO$a;->e()LEb/r;

    move-result-object v10

    invoke-virtual {v10}, LEb/r;->f()Ljava/lang/String;

    move-result-object v10

    new-instance v11, LNa/b;

    invoke-direct {v11, v0, v9, v4, v10}, LNa/b;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :try_start_4
    invoke-direct/range {p0 .. p0}, Lcom/ui/core/ui/sso/SSOAccountVM;->o0()Lcom/ui/sso/api/UiAccountApi;

    move-result-object v0

    iput-object v1, v2, Lcom/ui/core/ui/sso/SSOAccountVM$b;->a:Ljava/lang/Object;

    move-object/from16 v4, p1

    iput-object v4, v2, Lcom/ui/core/ui/sso/SSOAccountVM$b;->b:Ljava/lang/Object;

    iput-object v11, v2, Lcom/ui/core/ui/sso/SSOAccountVM$b;->c:Ljava/lang/Object;

    iput v8, v2, Lcom/ui/core/ui/sso/SSOAccountVM$b;->f:I

    invoke-interface {v0, v11, v2}, Lcom/ui/sso/api/UiAccountApi;->b(LNa/b;Ldh/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_5

    return-object v3

    :cond_5
    move-object v9, v1

    :goto_1
    invoke-direct {v9}, Lcom/ui/core/ui/sso/SSOAccountVM;->o0()Lcom/ui/sso/api/UiAccountApi;

    move-result-object v0

    invoke-virtual {v11}, LNa/b;->c()Ljava/util/UUID;

    move-result-object v8
    :try_end_4
    .catch Lcom/ui/sso/api/UiAccountApi$Error; {:try_start_4 .. :try_end_4} :catch_0

    :try_start_5
    instance-of v10, v4, Lcom/ui/core/ui/sso/UiSSO$a$b;

    if-eqz v10, :cond_6

    sget-object v10, Lcom/ui/sso/auth/c;->d:Lcom/ui/sso/auth/c$a;

    check-cast v4, Lcom/ui/core/ui/sso/UiSSO$a$b;

    invoke-virtual {v4}, Lcom/ui/core/ui/sso/UiSSO$a$b;->j()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v10, v4}, Lcom/ui/sso/auth/c$a;->a(Ljava/lang/String;)Lcom/ui/sso/auth/c;

    move-result-object v4

    goto :goto_2

    :catch_1
    move-exception v0

    goto/16 :goto_5

    :cond_6
    instance-of v10, v4, Lcom/ui/core/ui/sso/UiSSO$a$c;

    if-eqz v10, :cond_9

    sget-object v12, Lcom/ui/sso/auth/d;->d:Lcom/ui/sso/auth/d$a;

    move-object v10, v4

    check-cast v10, Lcom/ui/core/ui/sso/UiSSO$a$c;

    invoke-virtual {v10}, Lcom/ui/core/ui/sso/UiSSO$a$c;->k()Ljava/lang/String;

    move-result-object v13

    move-object v10, v4

    check-cast v10, Lcom/ui/core/ui/sso/UiSSO$a$c;

    invoke-virtual {v10}, Lcom/ui/core/ui/sso/UiSSO$a$c;->g()Lcom/ui/core/ui/sso/UiSSO$b;

    move-result-object v10

    invoke-virtual {v10}, Lcom/ui/core/ui/sso/UiSSO$b;->a()Ljava/lang/String;

    move-result-object v14

    move-object v10, v4

    check-cast v10, Lcom/ui/core/ui/sso/UiSSO$a$c;

    invoke-virtual {v10}, Lcom/ui/core/ui/sso/UiSSO$a$c;->g()Lcom/ui/core/ui/sso/UiSSO$b;

    move-result-object v10

    invoke-virtual {v10}, Lcom/ui/core/ui/sso/UiSSO$b;->b()Ljava/lang/String;

    move-result-object v15

    move-object v10, v4

    check-cast v10, Lcom/ui/core/ui/sso/UiSSO$a$c;

    invoke-virtual {v10}, Lcom/ui/core/ui/sso/UiSSO$a$c;->l()Ljava/lang/String;

    move-result-object v16

    check-cast v4, Lcom/ui/core/ui/sso/UiSSO$a$c;

    invoke-virtual {v4}, Lcom/ui/core/ui/sso/UiSSO$a$c;->h()Ljava/lang/String;

    move-result-object v17

    invoke-virtual/range {v12 .. v17}, Lcom/ui/sso/auth/d$a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ui/sso/auth/d;

    move-result-object v4
    :try_end_5
    .catch Lcom/ui/sso/auth/UiCookieAuthError$InvalidCookieFormat; {:try_start_5 .. :try_end_5} :catch_1
    .catch Lcom/ui/sso/api/UiAccountApi$Error; {:try_start_5 .. :try_end_5} :catch_0

    :goto_2
    :try_start_6
    iput-object v9, v2, Lcom/ui/core/ui/sso/SSOAccountVM$b;->a:Ljava/lang/Object;

    iput-object v11, v2, Lcom/ui/core/ui/sso/SSOAccountVM$b;->b:Ljava/lang/Object;

    iput-object v5, v2, Lcom/ui/core/ui/sso/SSOAccountVM$b;->c:Ljava/lang/Object;

    iput v7, v2, Lcom/ui/core/ui/sso/SSOAccountVM$b;->f:I

    invoke-interface {v0, v8, v4, v2}, Lcom/ui/sso/api/UiAccountApi;->g(Ljava/util/UUID;Lcom/ui/sso/auth/a;Ldh/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_7

    return-object v3

    :cond_7
    move-object v7, v9

    move-object v4, v11

    :goto_3
    invoke-virtual {v7}, Lcom/ui/core/ui/sso/SSOAccountVM;->r0()Lcom/ui/core/ui/sso/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/c;->h()LGb/f;

    move-result-object v0

    invoke-interface {v0}, LGb/f;->j()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-direct {v7}, Lcom/ui/core/ui/sso/SSOAccountVM;->o0()Lcom/ui/sso/api/UiAccountApi;

    move-result-object v7

    invoke-virtual {v4}, LNa/b;->c()Ljava/util/UUID;

    move-result-object v4

    new-instance v8, Lcom/ui/sso/auth/e;

    invoke-direct {v8, v0}, Lcom/ui/sso/auth/e;-><init>(Ljava/lang/String;)V

    iput-object v0, v2, Lcom/ui/core/ui/sso/SSOAccountVM$b;->a:Ljava/lang/Object;

    iput-object v5, v2, Lcom/ui/core/ui/sso/SSOAccountVM$b;->b:Ljava/lang/Object;

    iput v6, v2, Lcom/ui/core/ui/sso/SSOAccountVM$b;->f:I

    invoke-interface {v7, v4, v8, v2}, Lcom/ui/sso/api/UiAccountApi;->g(Ljava/util/UUID;Lcom/ui/sso/auth/a;Ldh/e;)Ljava/lang/Object;

    move-result-object v0
    :try_end_6
    .catch Lcom/ui/sso/api/UiAccountApi$Error; {:try_start_6 .. :try_end_6} :catch_0

    if-ne v0, v3, :cond_8

    return-object v3

    :cond_8
    :goto_4
    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0

    :cond_9
    :try_start_7
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
    :try_end_7
    .catch Lcom/ui/sso/auth/UiCookieAuthError$InvalidCookieFormat; {:try_start_7 .. :try_end_7} :catch_1
    .catch Lcom/ui/sso/api/UiAccountApi$Error; {:try_start_7 .. :try_end_7} :catch_0

    :goto_5
    :try_start_8
    new-instance v2, Lcom/ui/core/ui/sso/SSOAccountVM$AccountCreationError$InvalidData;

    const-string/jumbo v3, "Received auth cookie in invalid format"

    invoke-direct {v2, v3, v0}, Lcom/ui/core/ui/sso/SSOAccountVM$AccountCreationError$InvalidData;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_8
    .catch Lcom/ui/sso/api/UiAccountApi$Error; {:try_start_8 .. :try_end_8} :catch_0

    :goto_6
    new-instance v2, LP9/e;

    invoke-direct {v2}, LP9/e;-><init>()V

    invoke-static {v2, v0}, LS9/a;->c(Lmh/a;Ljava/lang/Throwable;)V

    new-instance v2, Lcom/ui/core/ui/sso/SSOAccountVM$AccountCreationError$AccountApi;

    invoke-direct {v2, v0}, Lcom/ui/core/ui/sso/SSOAccountVM$AccountCreationError$AccountApi;-><init>(Lcom/ui/sso/api/UiAccountApi$Error;)V

    throw v2

    :catch_2
    move-exception v0

    new-instance v2, Lcom/ui/core/ui/sso/SSOAccountVM$AccountCreationError$InvalidData;

    const-string/jumbo v3, "Received user ID in invalid format"

    invoke-direct {v2, v3, v0}, Lcom/ui/core/ui/sso/SSOAccountVM$AccountCreationError$InvalidData;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
.end method

.method private static final m0()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "Error when creating UI account in system AccountManager"

    return-object v0
.end method

.method private static final n0(Lcom/ui/core/ui/sso/SSOAccountVM;)LTa/c;
    .locals 2

    new-instance v0, Lcom/ui/core/ui/sso/SSOAccountVM$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/ui/core/ui/sso/SSOAccountVM$c;-><init>(Lcom/ui/core/ui/sso/SSOAccountVM;Ldh/e;)V

    const/4 p0, 0x1

    invoke-static {v1, v0, p0, v1}, LIi/i;->f(Ldh/i;Lmh/p;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LTa/c;

    return-object p0
.end method

.method private final o0()Lcom/ui/sso/api/UiAccountApi;
    .locals 1

    iget-object v0, p0, Lcom/ui/core/ui/sso/SSOAccountVM;->j:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/sso/api/UiAccountApi;

    return-object v0
.end method

.method private final p0()LTa/c;
    .locals 1

    iget-object v0, p0, Lcom/ui/core/ui/sso/SSOAccountVM;->k:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTa/c;

    return-object v0
.end method

.method private final t0()V
    .locals 24

    move-object/from16 v10, p0

    iget-object v0, v10, Lcom/ui/core/ui/sso/SSOAccountVM;->g:Lcom/ui/core/ui/sso/c;

    if-nez v0, :cond_5

    new-instance v2, LGb/i;

    new-instance v0, LP9/i;

    iget-object v1, v10, Lcom/ui/core/ui/sso/SSOAccountVM;->f:Landroidx/lifecycle/E;

    invoke-direct {v0, v1}, LP9/i;-><init>(Landroidx/lifecycle/E;)V

    invoke-direct {v2, v0}, LGb/i;-><init>(LGb/d;)V

    iget-object v0, v10, Lcom/ui/core/ui/sso/SSOAccountVM;->h:Lcom/ui/core/ui/sso/UiSSO$d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/UiSSO$d;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v2, v0}, LGb/i;->C(Ljava/lang/String;)V

    :cond_0
    iget-object v0, v10, Lcom/ui/core/ui/sso/SSOAccountVM;->i:Lcom/ui/core/ui/sso/UiSSO$e;

    invoke-static {v0}, Lia/a;->a(Lcom/ui/core/ui/sso/UiSSO$e;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, v10, Lcom/ui/core/ui/sso/SSOAccountVM;->i:Lcom/ui/core/ui/sso/UiSSO$e;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/UiSSO$e;->b()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    invoke-virtual {v2, v0}, LGb/i;->B(Ljava/lang/String;)V

    :cond_2
    invoke-direct/range {p0 .. p0}, Lcom/ui/core/ui/sso/SSOAccountVM;->p0()LTa/c;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LTa/c;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, LGb/i;->d(Ljava/lang/String;)V

    invoke-virtual {v0}, LTa/c;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, LGb/i;->J(Ljava/lang/String;)V

    invoke-virtual {v0}, LTa/c;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, LGb/i;->l(Ljava/lang/String;)V

    :cond_3
    iget-object v4, v10, Lcom/ui/core/ui/sso/SSOAccountVM;->h:Lcom/ui/core/ui/sso/UiSSO$d;

    iget-object v5, v10, Lcom/ui/core/ui/sso/SSOAccountVM;->i:Lcom/ui/core/ui/sso/UiSSO$e;

    sget-object v0, LP9/n;->a:LP9/n;

    invoke-virtual {v0}, LP9/n;->e()LAb/h;

    move-result-object v12

    invoke-virtual {v0}, LP9/n;->a()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v0}, LP9/n;->b()Ljava/lang/String;

    move-result-object v16

    new-instance v0, LCb/b;

    iget-object v3, v10, Lcom/ui/core/ui/sso/SSOAccountVM;->i:Lcom/ui/core/ui/sso/UiSSO$e;

    invoke-static {v3}, Lia/a;->a(Lcom/ui/core/ui/sso/UiSSO$e;)Z

    move-result v3

    invoke-direct/range {p0 .. p0}, Lcom/ui/core/ui/sso/SSOAccountVM;->p0()LTa/c;

    move-result-object v6

    if-eqz v6, :cond_4

    invoke-virtual {v6}, LTa/c;->c()Ljava/lang/String;

    move-result-object v1

    :cond_4
    invoke-direct {v0, v2, v3, v1}, LCb/b;-><init>(LGb/f;ZLjava/lang/String;)V

    new-instance v1, LAb/g;

    const/16 v22, 0x3a0

    const/16 v23, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object v11, v1

    move-object v13, v2

    move-object/from16 v18, v0

    invoke-direct/range {v11 .. v23}, LAb/g;-><init>(LAb/h;LGb/f;LAb/b;Ljava/lang/String;Ljava/lang/String;Lwb/a;LCb/a;Lokhttp3/logging/HttpLoggingInterceptor$Level;LAb/i;Lgg/y;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v3, v10, Lcom/ui/core/ui/sso/SSOAccountVM;->e:Lcom/ui/sso/api/UiAccountApi$b;

    new-instance v11, Lcom/ui/core/ui/sso/c;

    const/16 v8, 0x40

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v0, v11

    move-object/from16 v6, p0

    invoke-direct/range {v0 .. v9}, Lcom/ui/core/ui/sso/c;-><init>(LAb/a;LGb/f;Lcom/ui/sso/api/UiAccountApi$b;Lcom/ui/core/ui/sso/UiSSO$d;Lcom/ui/core/ui/sso/UiSSO$e;Lcom/ui/core/ui/sso/c$a;Lcom/ui/core/ui/sso/UiSSO$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v11, v10, Lcom/ui/core/ui/sso/SSOAccountVM;->g:Lcom/ui/core/ui/sso/c;

    :cond_5
    return-void
.end method


# virtual methods
.method public G(Lcom/ui/core/ui/sso/UiSSO$a;Ldh/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lcom/ui/core/ui/sso/SSOAccountVM$d;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/ui/core/ui/sso/SSOAccountVM$d;

    iget v1, v0, Lcom/ui/core/ui/sso/SSOAccountVM$d;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/ui/core/ui/sso/SSOAccountVM$d;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/ui/core/ui/sso/SSOAccountVM$d;

    invoke-direct {v0, p0, p2}, Lcom/ui/core/ui/sso/SSOAccountVM$d;-><init>(Lcom/ui/core/ui/sso/SSOAccountVM;Ldh/e;)V

    :goto_0
    iget-object p2, v0, Lcom/ui/core/ui/sso/SSOAccountVM$d;->c:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/ui/core/ui/sso/SSOAccountVM$d;->e:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/ui/core/ui/sso/SSOAccountVM$d;->b:Ljava/lang/Object;

    check-cast p1, Lcom/ui/core/ui/sso/UiSSO$a;

    iget-object v0, v0, Lcom/ui/core/ui/sso/SSOAccountVM$d;->a:Ljava/lang/Object;

    check-cast v0, Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    iput-object p0, v0, Lcom/ui/core/ui/sso/SSOAccountVM$d;->a:Ljava/lang/Object;

    iput-object p1, v0, Lcom/ui/core/ui/sso/SSOAccountVM$d;->b:Ljava/lang/Object;

    iput v3, v0, Lcom/ui/core/ui/sso/SSOAccountVM$d;->e:I

    invoke-direct {p0, p1, v0}, Lcom/ui/core/ui/sso/SSOAccountVM;->l0(Lcom/ui/core/ui/sso/UiSSO$a;Ldh/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    iget-object p2, v0, Lcom/ui/core/ui/sso/SSOAccountVM;->l:LLi/y;

    invoke-interface {p2, p1}, LLi/y;->j(Ljava/lang/Object;)Z

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final q0()LLi/g;
    .locals 1

    iget-object v0, p0, Lcom/ui/core/ui/sso/SSOAccountVM;->m:LLi/g;

    return-object v0
.end method

.method public final r0()Lcom/ui/core/ui/sso/c;
    .locals 2

    iget-object v0, p0, Lcom/ui/core/ui/sso/SSOAccountVM;->g:Lcom/ui/core/ui/sso/c;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "session instance not available, did you call initSession()?"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final s0()LP9/k;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final u0(Lcom/ui/core/ui/sso/UiSSO$a;)V
    .locals 11

    const-string/jumbo v0, "authResponse"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/ui/core/ui/sso/SSOAccountVM;->r0()Lcom/ui/core/ui/sso/c;

    move-result-object v1

    const/16 v9, 0x3f

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v8, p1

    invoke-static/range {v1 .. v10}, Lcom/ui/core/ui/sso/c;->b(Lcom/ui/core/ui/sso/c;LAb/a;LGb/f;Lcom/ui/sso/api/UiAccountApi$b;Lcom/ui/core/ui/sso/UiSSO$d;Lcom/ui/core/ui/sso/UiSSO$e;Lcom/ui/core/ui/sso/c$a;Lcom/ui/core/ui/sso/UiSSO$a;ILjava/lang/Object;)Lcom/ui/core/ui/sso/c;

    move-result-object p1

    iput-object p1, p0, Lcom/ui/core/ui/sso/SSOAccountVM;->g:Lcom/ui/core/ui/sso/c;

    return-void
.end method

.method public final v0(Lcom/ui/core/ui/sso/UiSSO$d;Lcom/ui/core/ui/sso/UiSSO$e;)V
    .locals 11

    const-string/jumbo v0, "mfaParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/core/ui/sso/SSOAccountVM;->f:Landroidx/lifecycle/E;

    const-string/jumbo v1, "mfa_params"

    invoke-virtual {v0, v1, p1}, Landroidx/lifecycle/E;->i(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/ui/core/ui/sso/SSOAccountVM;->r0()Lcom/ui/core/ui/sso/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/c;->g()LAb/a;

    move-result-object v2

    invoke-virtual {p0}, Lcom/ui/core/ui/sso/SSOAccountVM;->r0()Lcom/ui/core/ui/sso/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/c;->h()LGb/f;

    move-result-object v3

    invoke-virtual {p0}, Lcom/ui/core/ui/sso/SSOAccountVM;->r0()Lcom/ui/core/ui/sso/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/c;->i()Lcom/ui/sso/api/UiAccountApi$b;

    move-result-object v4

    invoke-virtual {p0}, Lcom/ui/core/ui/sso/SSOAccountVM;->r0()Lcom/ui/core/ui/sso/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/c;->c()Lcom/ui/core/ui/sso/c$a;

    move-result-object v7

    new-instance v0, Lcom/ui/core/ui/sso/c;

    const/16 v9, 0x40

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v1, v0

    move-object v5, p1

    move-object v6, p2

    invoke-direct/range {v1 .. v10}, Lcom/ui/core/ui/sso/c;-><init>(LAb/a;LGb/f;Lcom/ui/sso/api/UiAccountApi$b;Lcom/ui/core/ui/sso/UiSSO$d;Lcom/ui/core/ui/sso/UiSSO$e;Lcom/ui/core/ui/sso/c$a;Lcom/ui/core/ui/sso/UiSSO$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lcom/ui/core/ui/sso/SSOAccountVM;->g:Lcom/ui/core/ui/sso/c;

    return-void
.end method
