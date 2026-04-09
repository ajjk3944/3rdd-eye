.class public final Lcom/ui/sso/api/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/sso/api/UiAccountApi$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/sso/api/a$a;
    }
.end annotation


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:LIi/J;

.field private final d:LIi/J;

.field private final e:Ljava/lang/String;

.field private final f:Landroid/content/pm/PackageManager;

.field private final g:Ljava/lang/String;

.field private final h:LWa/k;

.field private final i:LQa/a;

.field private final j:Lcom/ui/sso/account/local/UiAccountSharedPrefProvider;

.field private final k:Lcom/ui/sso/api/provider/b;

.field private final l:LRa/b;

.field private final m:Lcom/ui/sso/api/provider/f$b;


# direct methods
.method public constructor <init>(Landroid/content/Context;LIi/J;LIi/J;Ljava/lang/String;Landroid/content/pm/PackageManager;Ljava/lang/String;LWa/k;LQa/a;Lcom/ui/sso/account/local/UiAccountSharedPrefProvider;Lcom/ui/sso/api/provider/b;LRa/b;Lcom/ui/sso/api/provider/f$b;)V
    .locals 1

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "dispatcherIO"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "dispatcherDefault"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "packageName"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "packageManager"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "accountType"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "packageInstallationObserver"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "ownershipManager"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "encryptedPrefProvider"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "contentProviderApiFactory"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "directApiFactory"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "uriFactory"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ui/sso/api/a;->b:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Lcom/ui/sso/api/a;->c:LIi/J;

    .line 4
    iput-object p3, p0, Lcom/ui/sso/api/a;->d:LIi/J;

    .line 5
    iput-object p4, p0, Lcom/ui/sso/api/a;->e:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lcom/ui/sso/api/a;->f:Landroid/content/pm/PackageManager;

    .line 7
    iput-object p6, p0, Lcom/ui/sso/api/a;->g:Ljava/lang/String;

    .line 8
    iput-object p7, p0, Lcom/ui/sso/api/a;->h:LWa/k;

    .line 9
    iput-object p8, p0, Lcom/ui/sso/api/a;->i:LQa/a;

    .line 10
    iput-object p9, p0, Lcom/ui/sso/api/a;->j:Lcom/ui/sso/account/local/UiAccountSharedPrefProvider;

    .line 11
    iput-object p10, p0, Lcom/ui/sso/api/a;->k:Lcom/ui/sso/api/provider/b;

    .line 12
    iput-object p11, p0, Lcom/ui/sso/api/a;->l:LRa/b;

    .line 13
    iput-object p12, p0, Lcom/ui/sso/api/a;->m:Lcom/ui/sso/api/provider/f$b;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;LIi/J;LIi/J;Ljava/lang/String;Landroid/content/pm/PackageManager;Ljava/lang/String;LWa/k;LQa/a;Lcom/ui/sso/account/local/UiAccountSharedPrefProvider;Lcom/ui/sso/api/provider/b;LRa/b;Lcom/ui/sso/api/provider/f$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 16

    move-object/from16 v0, p1

    move/from16 v1, p13

    and-int/lit8 v2, v1, 0x2

    if-eqz v2, :cond_0

    .line 14
    invoke-static {}, LIi/c0;->b()LIi/J;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object/from16 v2, p2

    :goto_0
    and-int/lit8 v3, v1, 0x4

    if-eqz v3, :cond_1

    .line 15
    invoke-static {}, LIi/c0;->a()LIi/J;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object/from16 v3, p3

    :goto_1
    and-int/lit8 v4, v1, 0x8

    if-eqz v4, :cond_2

    .line 16
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    const-string/jumbo v5, "getPackageName(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    move-object/from16 v4, p4

    :goto_2
    and-int/lit8 v5, v1, 0x10

    if-eqz v5, :cond_3

    .line 17
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    const-string/jumbo v6, "getPackageManager(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_3

    :cond_3
    move-object/from16 v5, p5

    :goto_3
    and-int/lit8 v6, v1, 0x20

    if-eqz v6, :cond_4

    .line 18
    sget v6, LNa/a;->c:I

    invoke-virtual {v0, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    const-string/jumbo v7, "getString(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_4

    :cond_4
    move-object/from16 v6, p6

    :goto_4
    and-int/lit8 v7, v1, 0x40

    if-eqz v7, :cond_5

    .line 19
    new-instance v7, LWa/l;

    invoke-direct {v7, v0, v3}, LWa/l;-><init>(Landroid/content/Context;LIi/J;)V

    goto :goto_5

    :cond_5
    move-object/from16 v7, p7

    :goto_5
    and-int/lit16 v8, v1, 0x80

    if-eqz v8, :cond_6

    .line 20
    sget-object v8, LVa/a;->a:LVa/a$a;

    invoke-virtual {v8, v0}, LVa/a$a;->a(Landroid/content/Context;)LVa/a;

    move-result-object v8

    goto :goto_6

    :cond_6
    move-object/from16 v8, p8

    :goto_6
    and-int/lit16 v9, v1, 0x100

    if-eqz v9, :cond_7

    .line 21
    new-instance v9, Lcom/ui/sso/account/local/a;

    invoke-direct {v9, v2}, Lcom/ui/sso/account/local/a;-><init>(LIi/J;)V

    goto :goto_7

    :cond_7
    move-object/from16 v9, p9

    :goto_7
    and-int/lit16 v10, v1, 0x200

    if-eqz v10, :cond_8

    .line 22
    new-instance v10, Lcom/ui/sso/api/provider/b;

    .line 23
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v11

    const-string/jumbo v12, "getContentResolver(...)"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v12, 0x18

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 p2, v10

    move-object/from16 p3, v11

    move-object/from16 p4, v2

    move-object/from16 p5, v3

    move-object/from16 p6, v14

    move-object/from16 p7, v15

    move/from16 p8, v12

    move-object/from16 p9, v13

    .line 24
    invoke-direct/range {p2 .. p9}, Lcom/ui/sso/api/provider/b;-><init>(Landroid/content/ContentResolver;LIi/J;LIi/J;Lcom/ui/sso/api/provider/a$b$c;LWa/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_8

    :cond_8
    move-object/from16 v10, p10

    :goto_8
    and-int/lit16 v11, v1, 0x400

    if-eqz v11, :cond_9

    .line 25
    new-instance v11, LRa/b;

    .line 26
    sget-object v12, LTa/e;->g:LTa/e$a;

    invoke-virtual {v12, v0, v2}, LTa/e$a;->a(Landroid/content/Context;LIi/J;)LTa/d;

    move-result-object v12

    .line 27
    invoke-direct {v11, v4, v12, v8, v3}, LRa/b;-><init>(Ljava/lang/String;LTa/d;LQa/a;LIi/J;)V

    goto :goto_9

    :cond_9
    move-object/from16 v11, p11

    :goto_9
    and-int/lit16 v1, v1, 0x800

    if-eqz v1, :cond_a

    .line 28
    sget-object v1, Lcom/ui/sso/api/provider/f$b;->a:Lcom/ui/sso/api/provider/f$b$a;

    invoke-virtual {v1}, Lcom/ui/sso/api/provider/f$b$a;->a()Lcom/ui/sso/api/provider/f$b;

    move-result-object v1

    goto :goto_a

    :cond_a
    move-object/from16 v1, p12

    :goto_a
    move-object/from16 p2, p0

    move-object/from16 p3, p1

    move-object/from16 p4, v2

    move-object/from16 p5, v3

    move-object/from16 p6, v4

    move-object/from16 p7, v5

    move-object/from16 p8, v6

    move-object/from16 p9, v7

    move-object/from16 p10, v8

    move-object/from16 p11, v9

    move-object/from16 p12, v10

    move-object/from16 p13, v11

    move-object/from16 p14, v1

    .line 29
    invoke-direct/range {p2 .. p14}, Lcom/ui/sso/api/a;-><init>(Landroid/content/Context;LIi/J;LIi/J;Ljava/lang/String;Landroid/content/pm/PackageManager;Ljava/lang/String;LWa/k;LQa/a;Lcom/ui/sso/account/local/UiAccountSharedPrefProvider;Lcom/ui/sso/api/provider/b;LRa/b;Lcom/ui/sso/api/provider/f$b;)V

    return-void
.end method

.method public static final synthetic b(Lcom/ui/sso/api/a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/ui/sso/api/a;->g:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic c(Lcom/ui/sso/api/a;LIi/N;Lcom/ui/sso/api/UiAccountApi$d;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/ui/sso/api/a;->k(LIi/N;Lcom/ui/sso/api/UiAccountApi$d;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lcom/ui/sso/api/a;LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/ui/sso/api/a;->m(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lcom/ui/sso/api/a;LIi/N;Lcom/ui/sso/api/UiAccountApi$d;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/ui/sso/api/a;->n(LIi/N;Lcom/ui/sso/api/UiAccountApi$d;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lcom/ui/sso/api/a;LIi/N;Ljava/lang/String;Lcom/ui/sso/api/UiAccountApi$d;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ui/sso/api/a;->o(LIi/N;Ljava/lang/String;Lcom/ui/sso/api/UiAccountApi$d;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Lcom/ui/sso/api/a;LIi/N;Lcom/ui/sso/api/UiAccountApi$d;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/ui/sso/api/a;->q(LIi/N;Lcom/ui/sso/api/UiAccountApi$d;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic h(Lcom/ui/sso/api/a;LIi/N;Lcom/ui/sso/api/UiAccountApi$d;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/ui/sso/api/a;->r(LIi/N;Lcom/ui/sso/api/UiAccountApi$d;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic i(Lcom/ui/sso/api/a;LIi/N;Lcom/ui/sso/api/UiAccountApi$d;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/ui/sso/api/a;->s(LIi/N;Lcom/ui/sso/api/UiAccountApi$d;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic j(Lcom/ui/sso/api/a;Lcom/ui/sso/api/UiAccountApi;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/ui/sso/api/a;->t(Lcom/ui/sso/api/UiAccountApi;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final k(LIi/N;Lcom/ui/sso/api/UiAccountApi$d;Ldh/e;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move-object/from16 v0, p3

    instance-of v3, v0, Lcom/ui/sso/api/a$g;

    if-eqz v3, :cond_0

    move-object v3, v0

    check-cast v3, Lcom/ui/sso/api/a$g;

    iget v4, v3, Lcom/ui/sso/api/a$g;->e:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lcom/ui/sso/api/a$g;->e:I

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/ui/sso/api/a$g;

    invoke-direct {v3, v1, v0}, Lcom/ui/sso/api/a$g;-><init>(Lcom/ui/sso/api/a;Ldh/e;)V

    :goto_0
    iget-object v0, v3, Lcom/ui/sso/api/a$g;->c:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v4

    iget v5, v3, Lcom/ui/sso/api/a$g;->e:I

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v5, :cond_2

    if-ne v5, v6, :cond_1

    iget-object v2, v3, Lcom/ui/sso/api/a$g;->b:Ljava/lang/Object;

    check-cast v2, Lcom/ui/sso/api/UiAccountApi$d;

    iget-object v3, v3, Lcom/ui/sso/api/a$g;->a:Ljava/lang/Object;

    check-cast v3, Lcom/ui/sso/api/a;

    :try_start_0
    invoke-static {v0}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/ui/sso/api/UiAccountApiFactory$AccountApiUnavailableException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_1
    iget-object v0, v1, Lcom/ui/sso/api/a;->l:LRa/b;

    iget-object v5, v1, Lcom/ui/sso/api/a;->g:Ljava/lang/String;

    new-instance v15, LOa/d;

    iget-object v9, v1, Lcom/ui/sso/api/a;->g:Ljava/lang/String;

    iget-object v8, v1, Lcom/ui/sso/api/a;->b:Landroid/content/Context;

    invoke-static {v8}, Landroid/accounts/AccountManager;->get(Landroid/content/Context;)Landroid/accounts/AccountManager;

    move-result-object v10

    const-string/jumbo v8, "get(...)"

    invoke-static {v10, v8}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v12, v1, Lcom/ui/sso/api/a;->c:LIi/J;

    const/4 v13, 0x4

    const/4 v14, 0x0

    const/4 v11, 0x0

    move-object v8, v15

    invoke-direct/range {v8 .. v14}, LOa/d;-><init>(Ljava/lang/String;Landroid/accounts/AccountManager;LOa/a;LIi/J;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v8, LRa/b$a;

    invoke-direct {v8, v15, v5, v2}, LRa/b$a;-><init>(Lcom/ui/sso/account/UIAccountManager;Ljava/lang/String;Lcom/ui/sso/api/UiAccountApi$d;)V

    iput-object v1, v3, Lcom/ui/sso/api/a$g;->a:Ljava/lang/Object;

    iput-object v2, v3, Lcom/ui/sso/api/a$g;->b:Ljava/lang/Object;

    iput v6, v3, Lcom/ui/sso/api/a$g;->e:I

    move-object/from16 v5, p1

    invoke-virtual {v0, v5, v8, v3}, LRa/b;->a(LIi/N;LRa/b$a;Ldh/e;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catch Lcom/ui/sso/api/UiAccountApiFactory$AccountApiUnavailableException; {:try_start_1 .. :try_end_1} :catch_1

    if-ne v0, v4, :cond_3

    return-object v4

    :cond_3
    move-object v3, v1

    :goto_1
    :try_start_2
    check-cast v0, LRa/a;
    :try_end_2
    .catch Lcom/ui/sso/api/UiAccountApiFactory$AccountApiUnavailableException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_3

    :catch_1
    move-exception v0

    move-object v3, v1

    :goto_2
    sget-object v4, Lcom/ui/sso/api/a$h;->a:Lcom/ui/sso/api/a$h;

    invoke-static {v4, v0}, LUa/a;->c(Lmh/a;Ljava/lang/Throwable;)V

    new-instance v4, Lcom/ui/sso/api/UiAccountApi$d$a$a;

    iget-object v5, v3, Lcom/ui/sso/api/a;->e:Ljava/lang/String;

    invoke-direct {v4, v5, v0}, Lcom/ui/sso/api/UiAccountApi$d$a$a;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v2, v4}, Lcom/ui/sso/api/UiAccountApi$d;->e(Lcom/ui/sso/api/UiAccountApi$d$a;)V

    move-object v0, v7

    :goto_3
    if-nez v0, :cond_4

    return-object v7

    :cond_4
    new-instance v4, Lcom/ui/sso/api/UiAccountApi$d$a$b;

    invoke-virtual {v0}, LRa/a;->getState()Lcom/ui/sso/api/UiAccountApi$c;

    move-result-object v5

    invoke-direct {v4, v5}, Lcom/ui/sso/api/UiAccountApi$d$a$b;-><init>(Lcom/ui/sso/api/UiAccountApi$c;)V

    invoke-virtual {v2, v4}, Lcom/ui/sso/api/UiAccountApi$d;->e(Lcom/ui/sso/api/UiAccountApi$d$a;)V

    invoke-virtual {v0}, LRa/a;->getState()Lcom/ui/sso/api/UiAccountApi$c;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/sso/api/UiAccountApi$c;->b()Ljava/lang/String;

    move-result-object v2

    iget-object v4, v3, Lcom/ui/sso/api/a;->g:Ljava/lang/String;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-virtual {v0}, LRa/a;->getState()Lcom/ui/sso/api/UiAccountApi$c;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/sso/api/UiAccountApi$c;->f()Z

    move-result v2

    if-nez v2, :cond_5

    return-object v7

    :cond_5
    return-object v0

    :cond_6
    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, LRa/a;->getState()Lcom/ui/sso/api/UiAccountApi$c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/sso/api/UiAccountApi$c;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v3, v3, Lcom/ui/sso/api/a;->g:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Direct account manager type \'"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\' doesn\'t match our type \'"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\'"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method private final m(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Lcom/ui/sso/api/a$o;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/ui/sso/api/a$o;

    iget v1, v0, Lcom/ui/sso/api/a$o;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/ui/sso/api/a$o;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/ui/sso/api/a$o;

    invoke-direct {v0, p0, p2}, Lcom/ui/sso/api/a$o;-><init>(Lcom/ui/sso/api/a;Ldh/e;)V

    :goto_0
    iget-object p2, v0, Lcom/ui/sso/api/a$o;->a:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/ui/sso/api/a$o;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/ui/sso/api/a;->c:LIi/J;

    new-instance v2, Lcom/ui/sso/api/a$p;

    const/4 v4, 0x0

    invoke-direct {v2, p0, p1, v4}, Lcom/ui/sso/api/a$p;-><init>(Lcom/ui/sso/api/a;LIi/N;Ldh/e;)V

    iput v3, v0, Lcom/ui/sso/api/a$o;->c:I

    invoke-static {p2, v2, v0}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    move-object p1, p2

    check-cast p1, Lcom/ui/sso/api/UiAccountApi;

    invoke-interface {p1}, Lcom/ui/sso/api/UiAccountApi;->i()Lcom/ui/sso/api/UiAccountApi$d;

    move-result-object v0

    invoke-interface {p1}, Lcom/ui/sso/api/UiAccountApi;->getState()Lcom/ui/sso/api/UiAccountApi$c;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ui/sso/api/UiAccountApi$d;->f(Lcom/ui/sso/api/UiAccountApi$c;)V

    return-object p2
.end method

.method private final n(LIi/N;Lcom/ui/sso/api/UiAccountApi$d;Ldh/e;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p3

    instance-of v2, v0, Lcom/ui/sso/api/a$q;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lcom/ui/sso/api/a$q;

    iget v3, v2, Lcom/ui/sso/api/a$q;->h:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/ui/sso/api/a$q;->h:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/ui/sso/api/a$q;

    invoke-direct {v2, v1, v0}, Lcom/ui/sso/api/a$q;-><init>(Lcom/ui/sso/api/a;Ldh/e;)V

    :goto_0
    iget-object v0, v2, Lcom/ui/sso/api/a$q;->f:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v3

    iget v4, v2, Lcom/ui/sso/api/a$q;->h:I

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v4, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    :try_start_0
    invoke-static {v0}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/ui/sso/api/UiAccountApiFactory$AccountApiUnavailableException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_2

    :catch_0
    move-exception v0

    goto/16 :goto_3

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v4, v2, Lcom/ui/sso/api/a$q;->e:Ljava/lang/Object;

    check-cast v4, LIi/N;

    iget-object v6, v2, Lcom/ui/sso/api/a$q;->d:Ljava/lang/Object;

    check-cast v6, LRa/b;

    iget-object v7, v2, Lcom/ui/sso/api/a$q;->c:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    iget-object v8, v2, Lcom/ui/sso/api/a$q;->b:Ljava/lang/Object;

    check-cast v8, Lcom/ui/sso/api/UiAccountApi$d;

    iget-object v9, v2, Lcom/ui/sso/api/a$q;->a:Ljava/lang/Object;

    check-cast v9, Lcom/ui/sso/api/a;

    :try_start_1
    invoke-static {v0}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/ui/sso/api/UiAccountApiFactory$AccountApiUnavailableException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :cond_3
    invoke-static {v0}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_2
    iget-object v0, v1, Lcom/ui/sso/api/a;->l:LRa/b;

    iget-object v7, v1, Lcom/ui/sso/api/a;->g:Ljava/lang/String;

    iget-object v4, v1, Lcom/ui/sso/api/a;->j:Lcom/ui/sso/account/local/UiAccountSharedPrefProvider;

    iget-object v8, v1, Lcom/ui/sso/api/a;->b:Landroid/content/Context;

    iput-object v1, v2, Lcom/ui/sso/api/a$q;->a:Ljava/lang/Object;

    move-object/from16 v9, p2

    iput-object v9, v2, Lcom/ui/sso/api/a$q;->b:Ljava/lang/Object;

    iput-object v7, v2, Lcom/ui/sso/api/a$q;->c:Ljava/lang/Object;

    iput-object v0, v2, Lcom/ui/sso/api/a$q;->d:Ljava/lang/Object;

    move-object/from16 v10, p1

    iput-object v10, v2, Lcom/ui/sso/api/a$q;->e:Ljava/lang/Object;

    iput v6, v2, Lcom/ui/sso/api/a$q;->h:I

    invoke-interface {v4, v8, v6, v2}, Lcom/ui/sso/account/local/UiAccountSharedPrefProvider;->a(Landroid/content/Context;ZLdh/e;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_4

    return-object v3

    :cond_4
    move-object v6, v0

    move-object v0, v4

    move-object v8, v9

    move-object v4, v10

    move-object v9, v1

    :goto_1
    move-object v11, v0

    check-cast v11, Landroid/content/SharedPreferences;

    iget-object v13, v9, Lcom/ui/sso/api/a;->c:LIi/J;

    new-instance v0, LPa/a;

    const/4 v12, 0x0

    const/4 v14, 0x2

    const/4 v15, 0x0

    move-object v10, v0

    invoke-direct/range {v10 .. v15}, LPa/a;-><init>(Landroid/content/SharedPreferences;LOa/a;LIi/J;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v9, LRa/b$a;

    invoke-direct {v9, v0, v7, v8}, LRa/b$a;-><init>(Lcom/ui/sso/account/UIAccountManager;Ljava/lang/String;Lcom/ui/sso/api/UiAccountApi$d;)V

    const/4 v0, 0x0

    iput-object v0, v2, Lcom/ui/sso/api/a$q;->a:Ljava/lang/Object;

    iput-object v0, v2, Lcom/ui/sso/api/a$q;->b:Ljava/lang/Object;

    iput-object v0, v2, Lcom/ui/sso/api/a$q;->c:Ljava/lang/Object;

    iput-object v0, v2, Lcom/ui/sso/api/a$q;->d:Ljava/lang/Object;

    iput-object v0, v2, Lcom/ui/sso/api/a$q;->e:Ljava/lang/Object;

    iput v5, v2, Lcom/ui/sso/api/a$q;->h:I

    invoke-virtual {v6, v4, v9, v2}, LRa/b;->a(LIi/N;LRa/b$a;Ldh/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_5

    return-object v3

    :cond_5
    :goto_2
    check-cast v0, Lcom/ui/sso/api/UiAccountApi;
    :try_end_2
    .catch Lcom/ui/sso/api/UiAccountApiFactory$AccountApiUnavailableException; {:try_start_2 .. :try_end_2} :catch_0

    return-object v0

    :goto_3
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string/jumbo v3, "Failed to obtain Local Account API backed with encrypted local storage"

    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
.end method

.method private final o(LIi/N;Ljava/lang/String;Lcom/ui/sso/api/UiAccountApi$d;Ldh/e;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p4, Lcom/ui/sso/api/a$r;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/ui/sso/api/a$r;

    iget v1, v0, Lcom/ui/sso/api/a$r;->f:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/ui/sso/api/a$r;->f:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/ui/sso/api/a$r;

    invoke-direct {v0, p0, p4}, Lcom/ui/sso/api/a$r;-><init>(Lcom/ui/sso/api/a;Ldh/e;)V

    :goto_0
    iget-object p4, v0, Lcom/ui/sso/api/a$r;->d:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/ui/sso/api/a$r;->f:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lcom/ui/sso/api/a$r;->c:Ljava/lang/Object;

    move-object p3, p1

    check-cast p3, Lcom/ui/sso/api/UiAccountApi$d;

    iget-object p1, v0, Lcom/ui/sso/api/a$r;->b:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Ljava/lang/String;

    iget-object p1, v0, Lcom/ui/sso/api/a$r;->a:Ljava/lang/Object;

    check-cast p1, Lcom/ui/sso/api/a;

    :try_start_0
    invoke-static {p4}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/ui/sso/api/UiAccountApiFactory$AccountApiUnavailableException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p4

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_1
    iget-object p4, p0, Lcom/ui/sso/api/a;->k:Lcom/ui/sso/api/provider/b;

    new-instance v2, Lcom/ui/sso/api/provider/b$a;

    invoke-direct {v2, p2, p3}, Lcom/ui/sso/api/provider/b$a;-><init>(Ljava/lang/String;Lcom/ui/sso/api/UiAccountApi$d;)V

    iput-object p0, v0, Lcom/ui/sso/api/a$r;->a:Ljava/lang/Object;

    iput-object p2, v0, Lcom/ui/sso/api/a$r;->b:Ljava/lang/Object;

    iput-object p3, v0, Lcom/ui/sso/api/a$r;->c:Ljava/lang/Object;

    iput v4, v0, Lcom/ui/sso/api/a$r;->f:I

    invoke-virtual {p4, p1, v2, v0}, Lcom/ui/sso/api/provider/b;->d(LIi/N;Lcom/ui/sso/api/provider/b$a;Ldh/e;)Ljava/lang/Object;

    move-result-object p4
    :try_end_1
    .catch Lcom/ui/sso/api/UiAccountApiFactory$AccountApiUnavailableException; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p0

    :goto_1
    :try_start_2
    check-cast p4, Lcom/ui/sso/api/provider/a;
    :try_end_2
    .catch Lcom/ui/sso/api/UiAccountApiFactory$AccountApiUnavailableException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_7

    :catch_1
    move-exception p4

    move-object p1, p0

    :goto_2
    invoke-virtual {p4}, Lcom/ui/sso/api/UiAccountApiFactory$AccountApiUnavailableException;->a()Lcom/ui/sso/api/UiAccountApi$Error;

    move-result-object v0

    instance-of v1, v0, Lcom/ui/sso/api/UiAccountApi$Error$CallerSignCertMismatch;

    if-eqz v1, :cond_4

    new-instance v0, Lcom/ui/sso/api/a$u;

    invoke-direct {v0, p2}, Lcom/ui/sso/api/a$u;-><init>(Ljava/lang/String;)V

    invoke-static {v0, p4}, LUa/a;->c(Lmh/a;Ljava/lang/Throwable;)V

    goto :goto_6

    :cond_4
    instance-of v1, v0, Lcom/ui/sso/api/UiAccountApi$Error$ContentProvider$ProviderUnavailable;

    if-eqz v1, :cond_5

    new-instance v0, Lcom/ui/sso/api/a$v;

    invoke-direct {v0, p2}, Lcom/ui/sso/api/a$v;-><init>(Ljava/lang/String;)V

    invoke-static {v0, p4}, LUa/a;->c(Lmh/a;Ljava/lang/Throwable;)V

    goto :goto_6

    :cond_5
    instance-of v1, v0, Lcom/ui/sso/api/UiAccountApi$Error$Unsupported;

    if-eqz v1, :cond_6

    move v1, v4

    goto :goto_3

    :cond_6
    instance-of v1, v0, Lcom/ui/sso/api/UiAccountApi$Error$ContentProvider$ReceivedInvalidResponse;

    :goto_3
    if-eqz v1, :cond_7

    move v1, v4

    goto :goto_4

    :cond_7
    instance-of v1, v0, Lcom/ui/sso/api/UiAccountApi$Error$ContentProvider$IllegalState;

    :goto_4
    if-eqz v1, :cond_8

    goto :goto_5

    :cond_8
    instance-of v4, v0, Lcom/ui/sso/api/UiAccountApi$Error$AccountManager;

    :goto_5
    if-eqz v4, :cond_9

    new-instance v0, Lcom/ui/sso/api/a$w;

    invoke-direct {v0, p2}, Lcom/ui/sso/api/a$w;-><init>(Ljava/lang/String;)V

    invoke-static {v0, p4}, LUa/a;->f(Lmh/a;Ljava/lang/Throwable;)V

    :cond_9
    :goto_6
    invoke-virtual {p3}, Lcom/ui/sso/api/UiAccountApi$d;->a()Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/ui/sso/api/UiAccountApi$d$a$a;

    invoke-direct {v1, p2, p4}, Lcom/ui/sso/api/UiAccountApi$d$a$a;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object p4, v3

    :goto_7
    if-nez p4, :cond_a

    return-object v3

    :cond_a
    invoke-virtual {p3}, Lcom/ui/sso/api/UiAccountApi$d;->a()Ljava/util/List;

    move-result-object p3

    new-instance v0, Lcom/ui/sso/api/UiAccountApi$d$a$b;

    invoke-virtual {p4}, Lcom/ui/sso/api/provider/a;->getState()Lcom/ui/sso/api/UiAccountApi$c;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ui/sso/api/UiAccountApi$d$a$b;-><init>(Lcom/ui/sso/api/UiAccountApi$c;)V

    invoke-interface {p3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p4}, Lcom/ui/sso/api/provider/a;->getState()Lcom/ui/sso/api/UiAccountApi$c;

    move-result-object p3

    invoke-virtual {p3}, Lcom/ui/sso/api/UiAccountApi$c;->b()Ljava/lang/String;

    move-result-object p3

    iget-object p1, p1, Lcom/ui/sso/api/a;->g:Ljava/lang/String;

    invoke-static {p3, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    new-instance p1, Lcom/ui/sso/api/a$s;

    invoke-direct {p1, p2, p4}, Lcom/ui/sso/api/a$s;-><init>(Ljava/lang/String;Lcom/ui/sso/api/provider/a;)V

    const/4 p2, 0x2

    invoke-static {p1, v3, p2, v3}, LUa/a;->d(Lmh/a;Ljava/lang/Throwable;ILjava/lang/Object;)V

    return-object v3

    :cond_b
    new-instance p1, Lcom/ui/sso/api/a$t;

    invoke-direct {p1, p2, p4}, Lcom/ui/sso/api/a$t;-><init>(Ljava/lang/String;Lcom/ui/sso/api/provider/a;)V

    invoke-static {p1}, LUa/a;->e(Lmh/a;)V

    return-object p4
.end method

.method private final p(LIi/N;Ljava/lang/String;Lcom/ui/sso/api/UiAccountApi$d;Ldh/e;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/ui/sso/api/a;->m:Lcom/ui/sso/api/provider/f$b;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p2, v1, v2, v1}, Lcom/ui/sso/api/provider/f$b$b;->a(Lcom/ui/sso/api/provider/f$b;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/ui/sso/api/provider/f;

    move-result-object p2

    invoke-interface {p2}, Lcom/ui/sso/api/provider/f;->b()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ui/sso/api/a;->o(LIi/N;Ljava/lang/String;Lcom/ui/sso/api/UiAccountApi$d;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final q(LIi/N;Lcom/ui/sso/api/UiAccountApi$d;Ldh/e;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p3, Lcom/ui/sso/api/a$x;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/ui/sso/api/a$x;

    iget v1, v0, Lcom/ui/sso/api/a$x;->i:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/ui/sso/api/a$x;->i:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/ui/sso/api/a$x;

    invoke-direct {v0, p0, p3}, Lcom/ui/sso/api/a$x;-><init>(Lcom/ui/sso/api/a;Ldh/e;)V

    :goto_0
    iget-object p3, v0, Lcom/ui/sso/api/a$x;->g:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/ui/sso/api/a$x;->i:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/ui/sso/api/a$x;->f:Ljava/lang/Object;

    check-cast p1, Ljava/util/Iterator;

    iget-object p2, v0, Lcom/ui/sso/api/a$x;->e:Ljava/lang/Object;

    check-cast p2, Ljava/util/List;

    iget-object v2, v0, Lcom/ui/sso/api/a$x;->d:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v4, v0, Lcom/ui/sso/api/a$x;->c:Ljava/lang/Object;

    check-cast v4, Lcom/ui/sso/api/UiAccountApi$d;

    iget-object v5, v0, Lcom/ui/sso/api/a$x;->b:Ljava/lang/Object;

    check-cast v5, LIi/N;

    iget-object v6, v0, Lcom/ui/sso/api/a$x;->a:Ljava/lang/Object;

    check-cast v6, Lcom/ui/sso/api/a;

    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    move-object v8, v2

    move-object v2, p2

    move-object p2, v5

    :goto_1
    move-object v5, v8

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    invoke-virtual {p0, p2}, Lcom/ui/sso/api/a;->l(Lcom/ui/sso/api/UiAccountApi$d;)Ljava/util/Set;

    move-result-object p3

    invoke-static {}, LZg/v;->c()Ljava/util/List;

    move-result-object v2

    check-cast p3, Ljava/lang/Iterable;

    invoke-static {p3}, LZg/v;->V0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p3

    check-cast p3, Ljava/lang/Iterable;

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    move-object v6, p0

    move-object v4, v2

    move-object v8, p2

    move-object p2, p1

    move-object p1, p3

    move-object p3, v8

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    iput-object v6, v0, Lcom/ui/sso/api/a$x;->a:Ljava/lang/Object;

    iput-object p2, v0, Lcom/ui/sso/api/a$x;->b:Ljava/lang/Object;

    iput-object p3, v0, Lcom/ui/sso/api/a$x;->c:Ljava/lang/Object;

    iput-object v4, v0, Lcom/ui/sso/api/a$x;->d:Ljava/lang/Object;

    iput-object v2, v0, Lcom/ui/sso/api/a$x;->e:Ljava/lang/Object;

    iput-object p1, v0, Lcom/ui/sso/api/a$x;->f:Ljava/lang/Object;

    iput v3, v0, Lcom/ui/sso/api/a$x;->i:I

    invoke-direct {v6, p2, v5, p3, v0}, Lcom/ui/sso/api/a;->o(LIi/N;Ljava/lang/String;Lcom/ui/sso/api/UiAccountApi$d;Ldh/e;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_3

    return-object v1

    :cond_3
    move-object v8, v4

    move-object v4, p3

    move-object p3, v5

    goto :goto_1

    :goto_3
    check-cast p3, Lcom/ui/sso/api/provider/a;

    if-eqz p3, :cond_5

    invoke-interface {v2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p3}, Lcom/ui/sso/api/provider/a;->getState()Lcom/ui/sso/api/UiAccountApi$c;

    move-result-object v7

    invoke-virtual {v7}, Lcom/ui/sso/api/UiAccountApi$c;->g()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-virtual {p3}, Lcom/ui/sso/api/provider/a;->getState()Lcom/ui/sso/api/UiAccountApi$c;

    move-result-object p3

    invoke-virtual {p3}, Lcom/ui/sso/api/UiAccountApi$c;->f()Z

    move-result p3

    if-nez p3, :cond_4

    goto :goto_4

    :cond_4
    move-object v4, v5

    goto :goto_5

    :cond_5
    :goto_4
    move-object p3, v4

    move-object v4, v5

    goto :goto_2

    :cond_6
    :goto_5
    invoke-static {v4}, LZg/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private final r(LIi/N;Lcom/ui/sso/api/UiAccountApi$d;Ldh/e;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p3, Lcom/ui/sso/api/a$y;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/ui/sso/api/a$y;

    iget v1, v0, Lcom/ui/sso/api/a$y;->f:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/ui/sso/api/a$y;->f:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/ui/sso/api/a$y;

    invoke-direct {v0, p0, p3}, Lcom/ui/sso/api/a$y;-><init>(Lcom/ui/sso/api/a;Ldh/e;)V

    :goto_0
    iget-object p3, v0, Lcom/ui/sso/api/a$y;->d:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/ui/sso/api/a$y;->f:I

    const/4 v3, 0x5

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v2, :cond_6

    if-eq v2, v7, :cond_5

    if-eq v2, v6, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/ui/sso/api/a$y;->a:Ljava/lang/Object;

    check-cast p1, Lcom/ui/sso/api/a;

    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_3
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_4
    iget-object p1, v0, Lcom/ui/sso/api/a$y;->a:Ljava/lang/Object;

    check-cast p1, Lcom/ui/sso/api/a;

    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_5
    iget-object p1, v0, Lcom/ui/sso/api/a$y;->c:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lcom/ui/sso/api/UiAccountApi$d;

    iget-object p1, v0, Lcom/ui/sso/api/a$y;->b:Ljava/lang/Object;

    check-cast p1, LIi/N;

    iget-object v2, v0, Lcom/ui/sso/api/a$y;->a:Ljava/lang/Object;

    check-cast v2, Lcom/ui/sso/api/a;

    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    move-object v9, p2

    move-object p2, p1

    move-object p1, v2

    move-object v2, p3

    move-object p3, v9

    goto :goto_1

    :cond_6
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p3, p0, Lcom/ui/sso/api/a;->i:LQa/a;

    iput-object p0, v0, Lcom/ui/sso/api/a$y;->a:Ljava/lang/Object;

    iput-object p1, v0, Lcom/ui/sso/api/a$y;->b:Ljava/lang/Object;

    iput-object p2, v0, Lcom/ui/sso/api/a$y;->c:Ljava/lang/Object;

    iput v7, v0, Lcom/ui/sso/api/a$y;->f:I

    invoke-interface {p3, v0}, LQa/a;->a(Ldh/e;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_7

    return-object v1

    :cond_7
    move-object v2, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    :goto_1
    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_8

    return-object v8

    :cond_8
    iget-object v7, p1, Lcom/ui/sso/api/a;->e:Ljava/lang/String;

    invoke-static {v2, v7}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_c

    iput-object p1, v0, Lcom/ui/sso/api/a$y;->a:Ljava/lang/Object;

    iput-object v8, v0, Lcom/ui/sso/api/a$y;->b:Ljava/lang/Object;

    iput-object v8, v0, Lcom/ui/sso/api/a$y;->c:Ljava/lang/Object;

    iput v6, v0, Lcom/ui/sso/api/a$y;->f:I

    invoke-direct {p1, p2, p3, v0}, Lcom/ui/sso/api/a;->k(LIi/N;Lcom/ui/sso/api/UiAccountApi$d;Ldh/e;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_9

    return-object v1

    :cond_9
    :goto_2
    check-cast p3, Lcom/ui/sso/api/UiAccountApi;

    if-eqz p3, :cond_a

    return-object p3

    :cond_a
    iget-object p1, p1, Lcom/ui/sso/api/a;->i:LQa/a;

    iput-object v8, v0, Lcom/ui/sso/api/a$y;->a:Ljava/lang/Object;

    iput v5, v0, Lcom/ui/sso/api/a$y;->f:I

    invoke-interface {p1, v8, v0}, LQa/a;->d(Ljava/lang/String;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_b

    return-object v1

    :cond_b
    :goto_3
    return-object v8

    :cond_c
    iput-object p1, v0, Lcom/ui/sso/api/a$y;->a:Ljava/lang/Object;

    iput-object v8, v0, Lcom/ui/sso/api/a$y;->b:Ljava/lang/Object;

    iput-object v8, v0, Lcom/ui/sso/api/a$y;->c:Ljava/lang/Object;

    iput v4, v0, Lcom/ui/sso/api/a$y;->f:I

    invoke-direct {p1, p2, v2, p3, v0}, Lcom/ui/sso/api/a;->p(LIi/N;Ljava/lang/String;Lcom/ui/sso/api/UiAccountApi$d;Ldh/e;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_d

    return-object v1

    :cond_d
    :goto_4
    check-cast p3, Lcom/ui/sso/api/UiAccountApi;

    if-eqz p3, :cond_e

    invoke-interface {p3}, Lcom/ui/sso/api/UiAccountApi;->getState()Lcom/ui/sso/api/UiAccountApi$c;

    move-result-object p2

    invoke-virtual {p2}, Lcom/ui/sso/api/UiAccountApi$c;->f()Z

    move-result p2

    if-eqz p2, :cond_e

    return-object p3

    :cond_e
    iget-object p1, p1, Lcom/ui/sso/api/a;->i:LQa/a;

    iput-object v8, v0, Lcom/ui/sso/api/a$y;->a:Ljava/lang/Object;

    iput v3, v0, Lcom/ui/sso/api/a$y;->f:I

    invoke-interface {p1, v8, v0}, LQa/a;->d(Ljava/lang/String;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_f

    return-object v1

    :cond_f
    :goto_5
    return-object v8
.end method

.method private final s(LIi/N;Lcom/ui/sso/api/UiAccountApi$d;Ldh/e;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p3, Lcom/ui/sso/api/a$z;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/ui/sso/api/a$z;

    iget v1, v0, Lcom/ui/sso/api/a$z;->f:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/ui/sso/api/a$z;->f:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/ui/sso/api/a$z;

    invoke-direct {v0, p0, p3}, Lcom/ui/sso/api/a$z;-><init>(Lcom/ui/sso/api/a;Ldh/e;)V

    :goto_0
    iget-object p3, v0, Lcom/ui/sso/api/a$z;->d:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/ui/sso/api/a$z;->f:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_5

    if-eq v2, v6, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/ui/sso/api/a$z;->a:Ljava/lang/Object;

    check-cast p1, Lcom/ui/sso/api/a;

    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    iget-object p1, v0, Lcom/ui/sso/api/a$z;->c:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lcom/ui/sso/api/UiAccountApi$d;

    iget-object p1, v0, Lcom/ui/sso/api/a$z;->b:Ljava/lang/Object;

    check-cast p1, LIi/N;

    iget-object v2, v0, Lcom/ui/sso/api/a$z;->a:Ljava/lang/Object;

    check-cast v2, Lcom/ui/sso/api/a;

    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    move-object v8, p2

    move-object p2, p1

    move-object p1, v2

    move-object v2, p3

    move-object p3, v8

    goto :goto_1

    :cond_5
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p3, p0, Lcom/ui/sso/api/a;->i:LQa/a;

    iput-object p0, v0, Lcom/ui/sso/api/a$z;->a:Ljava/lang/Object;

    iput-object p1, v0, Lcom/ui/sso/api/a$z;->b:Ljava/lang/Object;

    iput-object p2, v0, Lcom/ui/sso/api/a$z;->c:Ljava/lang/Object;

    iput v6, v0, Lcom/ui/sso/api/a$z;->f:I

    invoke-interface {p3, v0}, LQa/a;->c(Ldh/e;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_6

    return-object v1

    :cond_6
    move-object v2, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    :goto_1
    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_7

    return-object v7

    :cond_7
    iget-object v6, p1, Lcom/ui/sso/api/a;->e:Ljava/lang/String;

    invoke-static {v2, v6}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_9

    iput-object v7, v0, Lcom/ui/sso/api/a$z;->a:Ljava/lang/Object;

    iput-object v7, v0, Lcom/ui/sso/api/a$z;->b:Ljava/lang/Object;

    iput-object v7, v0, Lcom/ui/sso/api/a$z;->c:Ljava/lang/Object;

    iput v5, v0, Lcom/ui/sso/api/a$z;->f:I

    invoke-direct {p1, p2, p3, v0}, Lcom/ui/sso/api/a;->n(LIi/N;Lcom/ui/sso/api/UiAccountApi$d;Ldh/e;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_8

    return-object v1

    :cond_8
    :goto_2
    return-object p3

    :cond_9
    iput-object p1, v0, Lcom/ui/sso/api/a$z;->a:Ljava/lang/Object;

    iput-object v7, v0, Lcom/ui/sso/api/a$z;->b:Ljava/lang/Object;

    iput-object v7, v0, Lcom/ui/sso/api/a$z;->c:Ljava/lang/Object;

    iput v4, v0, Lcom/ui/sso/api/a$z;->f:I

    invoke-direct {p1, p2, v2, p3, v0}, Lcom/ui/sso/api/a;->p(LIi/N;Ljava/lang/String;Lcom/ui/sso/api/UiAccountApi$d;Ldh/e;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_a

    return-object v1

    :cond_a
    :goto_3
    check-cast p3, Lcom/ui/sso/api/UiAccountApi;

    if-eqz p3, :cond_b

    return-object p3

    :cond_b
    iget-object p1, p1, Lcom/ui/sso/api/a;->i:LQa/a;

    iput-object v7, v0, Lcom/ui/sso/api/a$z;->a:Ljava/lang/Object;

    iput v3, v0, Lcom/ui/sso/api/a$z;->f:I

    invoke-interface {p1, v7, v0}, LQa/a;->b(Ljava/lang/String;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_c

    return-object v1

    :cond_c
    :goto_4
    return-object v7
.end method

.method private final t(Lcom/ui/sso/api/UiAccountApi;Ldh/e;)Ljava/lang/Object;
    .locals 2

    invoke-interface {p1}, Lcom/ui/sso/api/UiAccountApi;->getState()Lcom/ui/sso/api/UiAccountApi$c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/sso/api/UiAccountApi$c;->c()I

    move-result v0

    const/4 v1, 0x3

    if-ge v0, v1, :cond_0

    sget-object p1, Lcom/ui/sso/api/a$A;->a:Lcom/ui/sso/api/a$A;

    invoke-static {p1}, LUa/a;->e(Lmh/a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_0
    invoke-interface {p1}, Lcom/ui/sso/api/UiAccountApi;->getState()Lcom/ui/sso/api/UiAccountApi$c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/sso/api/UiAccountApi$c;->e()LNa/c;

    move-result-object v0

    sget-object v1, Lcom/ui/sso/api/a$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_1
    iget-object v0, p0, Lcom/ui/sso/api/a;->i:LQa/a;

    invoke-interface {p1}, Lcom/ui/sso/api/UiAccountApi;->getState()Lcom/ui/sso/api/UiAccountApi$c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/sso/api/UiAccountApi$c;->d()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1, p2}, LQa/a;->b(Ljava/lang/String;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_3
    iget-object v0, p0, Lcom/ui/sso/api/a;->i:LQa/a;

    invoke-interface {p1}, Lcom/ui/sso/api/UiAccountApi;->getState()Lcom/ui/sso/api/UiAccountApi$c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/sso/api/UiAccountApi$c;->d()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1, p2}, LQa/a;->d(Ljava/lang/String;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_4

    return-object p1

    :cond_4
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method


# virtual methods
.method public a(LIi/N;)LLi/g;
    .locals 8

    const-string/jumbo v0, "externalScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/sso/api/a;->h:LWa/k;

    invoke-interface {v0}, LWa/k;->a()LLi/g;

    move-result-object v0

    new-instance v1, Lcom/ui/sso/api/a$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/ui/sso/api/a$b;-><init>(Lcom/ui/sso/api/a;Ldh/e;)V

    invoke-static {v0, v1}, LLi/i;->J(LLi/g;Lmh/p;)LLi/g;

    move-result-object v0

    new-instance v1, Lcom/ui/sso/api/a$c;

    invoke-direct {v1, p0, p1, v2}, Lcom/ui/sso/api/a$c;-><init>(Lcom/ui/sso/api/a;LIi/N;Ldh/e;)V

    invoke-static {v0, v1}, LLi/i;->E(LLi/g;Lmh/p;)LLi/g;

    move-result-object v0

    new-instance v1, Lcom/ui/sso/api/a$d;

    invoke-direct {v1, p0, v2}, Lcom/ui/sso/api/a$d;-><init>(Lcom/ui/sso/api/a;Ldh/e;)V

    invoke-static {v0, v1}, LLi/i;->I(LLi/g;Lmh/p;)LLi/g;

    move-result-object v0

    new-instance v1, Lcom/ui/sso/api/a$e;

    invoke-direct {v1, p0, v2}, Lcom/ui/sso/api/a$e;-><init>(Lcom/ui/sso/api/a;Ldh/e;)V

    invoke-static {v0, v1}, LLi/i;->H(LLi/g;Lmh/q;)LLi/g;

    move-result-object v0

    sget-object v1, Lcom/ui/sso/api/a$f;->a:Lcom/ui/sso/api/a$f;

    invoke-static {v0, v1}, LLi/i;->p(LLi/g;Lmh/l;)LLi/g;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/sso/api/a;->d:LIi/J;

    invoke-static {v0, v1}, LLi/i;->C(LLi/g;Ldh/i;)LLi/g;

    move-result-object v0

    sget-object v1, LLi/J;->a:LLi/J$a;

    const/4 v6, 0x3

    const/4 v7, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    invoke-static/range {v1 .. v7}, LLi/J$a;->b(LLi/J$a;JJILjava/lang/Object;)LLi/J;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, p1, v1, v2}, LWa/c;->a(LLi/g;LIi/N;LLi/J;I)LLi/g;

    move-result-object p1

    return-object p1
.end method

.method public final l(Lcom/ui/sso/api/UiAccountApi$d;)Ljava/util/Set;
    .locals 14

    const-string/jumbo v0, "sup"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/ui/sso/api/a$i;->a:Lcom/ui/sso/api/a$i;

    invoke-static {v0}, LUa/a;->e(Lmh/a;)V

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iget-object v1, p0, Lcom/ui/sso/api/a;->f:Landroid/content/pm/PackageManager;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->getInstalledPackages(I)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/pm/PackageInfo;

    invoke-virtual {p1}, Lcom/ui/sso/api/UiAccountApi$d;->d()Ljava/util/Set;

    move-result-object v3

    iget-object v4, v2, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    const-string/jumbo v5, "N/A"

    if-nez v4, :cond_1

    move-object v4, v5

    :cond_1
    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v3, v2, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    if-eqz v3, :cond_0

    iget-object v4, p0, Lcom/ui/sso/api/a;->e:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    iget-object v2, v2, Landroid/content/pm/PackageInfo;->providers:[Landroid/content/pm/ProviderInfo;

    new-instance v3, Lkotlin/jvm/internal/N;

    invoke-direct {v3}, Lkotlin/jvm/internal/N;-><init>()V

    if-eqz v2, :cond_0

    array-length v4, v2

    const/4 v6, 0x0

    move v7, v6

    :goto_1
    if-ge v7, v4, :cond_0

    aget-object v8, v2, v7

    invoke-virtual {p1}, Lcom/ui/sso/api/UiAccountApi$d;->b()Ljava/util/Set;

    move-result-object v9

    iget-object v10, v8, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    if-nez v10, :cond_3

    move-object v10, v5

    :cond_3
    invoke-interface {v9, v10}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v9, v8, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    if-eqz v9, :cond_6

    const-string/jumbo v10, "ui.account.provider"

    const/4 v11, 0x2

    const/4 v12, 0x0

    invoke-static {v9, v10, v6, v11, v12}, Lkotlin/text/t;->B(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v9

    const/4 v10, 0x1

    if-ne v9, v10, :cond_6

    new-instance v9, Lcom/ui/sso/api/a$j;

    invoke-direct {v9, v8}, Lcom/ui/sso/api/a$j;-><init>(Landroid/content/pm/ProviderInfo;)V

    invoke-static {v9}, LUa/a;->e(Lmh/a;)V

    :try_start_0
    iget-object v9, p0, Lcom/ui/sso/api/a;->f:Landroid/content/pm/PackageManager;

    iget-object v10, v8, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    const/16 v13, 0x80

    invoke-virtual {v9, v10, v13}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v9

    iget-object v9, v9, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    if-eqz v9, :cond_4

    const-string/jumbo v10, "accountType"

    invoke-virtual {v9, v10}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    goto :goto_2

    :catch_0
    move-exception v8

    goto :goto_3

    :cond_4
    move-object v9, v12

    :goto_2
    iput-object v9, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    iget-object v10, p0, Lcom/ui/sso/api/a;->g:Ljava/lang/String;

    invoke-static {v9, v10}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    new-instance v9, Lcom/ui/sso/api/a$k;

    invoke-direct {v9, v8, p0}, Lcom/ui/sso/api/a$k;-><init>(Landroid/content/pm/ProviderInfo;Lcom/ui/sso/api/a;)V

    invoke-static {v9}, LUa/a;->e(Lmh/a;)V

    iget-object v8, v8, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    const-string/jumbo v9, "authority"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_5
    new-instance v9, Lcom/ui/sso/api/a$l;

    invoke-direct {v9, v8, v3}, Lcom/ui/sso/api/a$l;-><init>(Landroid/content/pm/ProviderInfo;Lkotlin/jvm/internal/N;)V

    invoke-static {v9, v12, v11, v12}, LUa/a;->g(Lmh/a;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :goto_3
    sget-object v9, Lcom/ui/sso/api/a$m;->a:Lcom/ui/sso/api/a$m;

    invoke-static {v9, v8}, LUa/a;->f(Lmh/a;Ljava/lang/Throwable;)V

    :catch_1
    :cond_6
    :goto_4
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_7
    new-instance v1, Lcom/ui/sso/api/a$n;

    invoke-direct {v1, v0}, Lcom/ui/sso/api/a$n;-><init>(Ljava/util/Set;)V

    invoke-static {v1}, LUa/a;->e(Lmh/a;)V

    invoke-virtual {p1}, Lcom/ui/sso/api/UiAccountApi$d;->c()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method
