.class public final Lcom/ui/sso/api/provider/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/sso/api/provider/b$a;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/ContentResolver;

.field private final b:LIi/J;

.field private final c:LIi/J;

.field private final d:Lcom/ui/sso/api/provider/a$b$c;

.field private final e:LWa/a;

.field private final f:Lcom/ui/sso/api/provider/d$h;

.field private final g:Lcom/ui/sso/api/provider/e$f;

.field private final h:Lcom/ui/sso/api/provider/c;

.field private final i:Lcom/ui/sso/auth/b;


# direct methods
.method public constructor <init>(Landroid/content/ContentResolver;LIi/J;LIi/J;Lcom/ui/sso/api/provider/a$b$c;LWa/a;)V
    .locals 1

    const-string/jumbo v0, "resolver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "dispatcherIO"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "dispatcherDefault"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "providerNotificationObserver"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "androidSdkVersion"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ui/sso/api/provider/b;->a:Landroid/content/ContentResolver;

    .line 3
    iput-object p2, p0, Lcom/ui/sso/api/provider/b;->b:LIi/J;

    .line 4
    iput-object p3, p0, Lcom/ui/sso/api/provider/b;->c:LIi/J;

    .line 5
    iput-object p4, p0, Lcom/ui/sso/api/provider/b;->d:Lcom/ui/sso/api/provider/a$b$c;

    .line 6
    iput-object p5, p0, Lcom/ui/sso/api/provider/b;->e:LWa/a;

    .line 7
    new-instance p1, Lcom/ui/sso/api/provider/d$h;

    invoke-direct {p1}, Lcom/ui/sso/api/provider/d$h;-><init>()V

    iput-object p1, p0, Lcom/ui/sso/api/provider/b;->f:Lcom/ui/sso/api/provider/d$h;

    .line 8
    new-instance p1, Lcom/ui/sso/api/provider/e$f;

    invoke-direct {p1}, Lcom/ui/sso/api/provider/e$f;-><init>()V

    iput-object p1, p0, Lcom/ui/sso/api/provider/b;->g:Lcom/ui/sso/api/provider/e$f;

    .line 9
    new-instance p1, Lcom/ui/sso/api/provider/c;

    invoke-direct {p1}, Lcom/ui/sso/api/provider/c;-><init>()V

    iput-object p1, p0, Lcom/ui/sso/api/provider/b;->h:Lcom/ui/sso/api/provider/c;

    .line 10
    new-instance p1, Lcom/ui/sso/auth/b;

    invoke-direct {p1}, Lcom/ui/sso/auth/b;-><init>()V

    iput-object p1, p0, Lcom/ui/sso/api/provider/b;->i:Lcom/ui/sso/auth/b;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/ContentResolver;LIi/J;LIi/J;Lcom/ui/sso/api/provider/a$b$c;LWa/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_0

    .line 11
    new-instance p4, Lcom/ui/sso/api/provider/a$c;

    invoke-direct {p4, p3}, Lcom/ui/sso/api/provider/a$c;-><init>(LIi/J;)V

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p6, 0x10

    if-eqz p4, :cond_1

    .line 12
    sget-object p4, LWa/a;->b:LWa/a$a;

    invoke-virtual {p4}, LWa/a$a;->a()LWa/a;

    move-result-object p5

    :cond_1
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    .line 13
    invoke-direct/range {v0 .. v5}, Lcom/ui/sso/api/provider/b;-><init>(Landroid/content/ContentResolver;LIi/J;LIi/J;Lcom/ui/sso/api/provider/a$b$c;LWa/a;)V

    return-void
.end method

.method public static final synthetic a(Lcom/ui/sso/api/provider/b;Lcom/ui/sso/api/provider/f;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/ui/sso/api/provider/b;->b(Lcom/ui/sso/api/provider/f;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final b(Lcom/ui/sso/api/provider/f;Ldh/e;)Ljava/lang/Object;
    .locals 13

    instance-of v0, p2, Lcom/ui/sso/api/provider/b$c;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/ui/sso/api/provider/b$c;

    iget v1, v0, Lcom/ui/sso/api/provider/b$c;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/ui/sso/api/provider/b$c;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/ui/sso/api/provider/b$c;

    invoke-direct {v0, p0, p2}, Lcom/ui/sso/api/provider/b$c;-><init>(Lcom/ui/sso/api/provider/b;Ldh/e;)V

    :goto_0
    iget-object p2, v0, Lcom/ui/sso/api/provider/b$c;->b:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/ui/sso/api/provider/b$c;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/ui/sso/api/provider/b$c;->a:Ljava/lang/Object;

    check-cast p1, Lcom/ui/sso/api/provider/f;

    :try_start_0
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/ui/sso/api/UiAccountApi$Error; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p2

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_1
    sget-object p2, Lcom/ui/sso/api/provider/a;->p:Lcom/ui/sso/api/provider/a$a;

    iget-object v6, p0, Lcom/ui/sso/api/provider/b;->a:Landroid/content/ContentResolver;

    sget-object p2, Lcom/ui/sso/api/provider/UiAccountProvider$b;->GET_STATE:Lcom/ui/sso/api/provider/UiAccountProvider$b;

    invoke-virtual {p2}, Lcom/ui/sso/api/provider/UiAccountProvider$b;->getId()Ljava/lang/String;

    move-result-object v8

    iget-object v11, p0, Lcom/ui/sso/api/provider/b;->f:Lcom/ui/sso/api/provider/d$h;

    iget-object v10, p0, Lcom/ui/sso/api/provider/b;->g:Lcom/ui/sso/api/provider/e$f;

    iget-object p2, p0, Lcom/ui/sso/api/provider/b;->b:LIi/J;

    iget-object v5, p0, Lcom/ui/sso/api/provider/b;->e:LWa/a;

    new-instance v2, Lcom/ui/sso/api/provider/b$b;

    const/4 v12, 0x0

    const/4 v9, 0x0

    move-object v4, v2

    move-object v7, p1

    invoke-direct/range {v4 .. v12}, Lcom/ui/sso/api/provider/b$b;-><init>(LWa/a;Landroid/content/ContentResolver;Lcom/ui/sso/api/provider/f;Ljava/lang/String;Lcom/ui/sso/api/provider/d;Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;Ldh/e;)V

    iput-object p1, v0, Lcom/ui/sso/api/provider/b$c;->a:Ljava/lang/Object;

    iput v3, v0, Lcom/ui/sso/api/provider/b$c;->d:I

    invoke-static {p2, v2, v0}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    invoke-static {p2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast p2, Lcom/ui/sso/api/UiAccountApi$c;
    :try_end_1
    .catch Lcom/ui/sso/api/UiAccountApi$Error; {:try_start_1 .. :try_end_1} :catch_0

    return-object p2

    :goto_2
    new-instance v0, Lcom/ui/sso/api/UiAccountApiFactory$AccountApiUnavailableException;

    invoke-interface {p1}, Lcom/ui/sso/api/provider/f;->b()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "UiAccountApi \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\' access FAILED"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Lcom/ui/sso/api/UiAccountApiFactory$AccountApiUnavailableException;-><init>(Ljava/lang/String;Lcom/ui/sso/api/UiAccountApi$Error;)V

    throw v0
.end method


# virtual methods
.method public final c(Ljava/lang/String;)Lcom/ui/sso/api/provider/f;
    .locals 1

    const-string/jumbo v0, "authority"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/ui/sso/api/provider/f$b;->a:Lcom/ui/sso/api/provider/f$b$a;

    invoke-virtual {v0}, Lcom/ui/sso/api/provider/f$b$a;->a()Lcom/ui/sso/api/provider/f$b;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/ui/sso/api/provider/f$b;->b(Ljava/lang/String;)Lcom/ui/sso/api/provider/f;

    move-result-object p1

    return-object p1
.end method

.method public d(LIi/N;Lcom/ui/sso/api/provider/b$a;Ldh/e;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    instance-of v2, v1, Lcom/ui/sso/api/provider/b$d;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/ui/sso/api/provider/b$d;

    iget v3, v2, Lcom/ui/sso/api/provider/b$d;->g:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/ui/sso/api/provider/b$d;->g:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/ui/sso/api/provider/b$d;

    invoke-direct {v2, v0, v1}, Lcom/ui/sso/api/provider/b$d;-><init>(Lcom/ui/sso/api/provider/b;Ldh/e;)V

    :goto_0
    iget-object v1, v2, Lcom/ui/sso/api/provider/b$d;->e:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v3

    iget v4, v2, Lcom/ui/sso/api/provider/b$d;->g:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lcom/ui/sso/api/provider/b$d;->d:Ljava/lang/Object;

    check-cast v3, Lcom/ui/sso/api/provider/f;

    iget-object v4, v2, Lcom/ui/sso/api/provider/b$d;->c:Ljava/lang/Object;

    check-cast v4, Lcom/ui/sso/api/provider/b$a;

    iget-object v5, v2, Lcom/ui/sso/api/provider/b$d;->b:Ljava/lang/Object;

    check-cast v5, LIi/N;

    iget-object v2, v2, Lcom/ui/sso/api/provider/b$d;->a:Ljava/lang/Object;

    check-cast v2, Lcom/ui/sso/api/provider/b;

    invoke-static {v1}, LYg/v;->b(Ljava/lang/Object;)V

    move-object v8, v3

    move-object v14, v5

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string/jumbo v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, LYg/v;->b(Ljava/lang/Object;)V

    invoke-virtual/range {p2 .. p2}, Lcom/ui/sso/api/provider/b$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ui/sso/api/provider/b;->c(Ljava/lang/String;)Lcom/ui/sso/api/provider/f;

    move-result-object v1

    iput-object v0, v2, Lcom/ui/sso/api/provider/b$d;->a:Ljava/lang/Object;

    move-object/from16 v4, p1

    iput-object v4, v2, Lcom/ui/sso/api/provider/b$d;->b:Ljava/lang/Object;

    move-object/from16 v6, p2

    iput-object v6, v2, Lcom/ui/sso/api/provider/b$d;->c:Ljava/lang/Object;

    iput-object v1, v2, Lcom/ui/sso/api/provider/b$d;->d:Ljava/lang/Object;

    iput v5, v2, Lcom/ui/sso/api/provider/b$d;->g:I

    invoke-direct {v0, v1, v2}, Lcom/ui/sso/api/provider/b;->b(Lcom/ui/sso/api/provider/f;Ldh/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_3

    return-object v3

    :cond_3
    move-object v8, v1

    move-object v1, v2

    move-object v14, v4

    move-object v4, v6

    move-object v2, v0

    :goto_1
    move-object v5, v1

    check-cast v5, Lcom/ui/sso/api/UiAccountApi$c;

    iget-object v7, v2, Lcom/ui/sso/api/provider/b;->a:Landroid/content/ContentResolver;

    iget-object v10, v2, Lcom/ui/sso/api/provider/b;->f:Lcom/ui/sso/api/provider/d$h;

    iget-object v11, v2, Lcom/ui/sso/api/provider/b;->g:Lcom/ui/sso/api/provider/e$f;

    iget-object v12, v2, Lcom/ui/sso/api/provider/b;->h:Lcom/ui/sso/api/provider/c;

    iget-object v1, v2, Lcom/ui/sso/api/provider/b;->d:Lcom/ui/sso/api/provider/a$b$c;

    iget-object v9, v2, Lcom/ui/sso/api/provider/b;->e:LWa/a;

    iget-object v15, v2, Lcom/ui/sso/api/provider/b;->b:LIi/J;

    iget-object v3, v2, Lcom/ui/sso/api/provider/b;->c:LIi/J;

    invoke-virtual {v4}, Lcom/ui/sso/api/provider/b$a;->b()Lcom/ui/sso/api/UiAccountApi$d;

    move-result-object v6

    iget-object v13, v2, Lcom/ui/sso/api/provider/b;->i:Lcom/ui/sso/auth/b;

    new-instance v2, Lcom/ui/sso/api/provider/a;

    move-object v4, v2

    move-object/from16 v16, v3

    move-object/from16 v17, v1

    invoke-direct/range {v4 .. v17}, Lcom/ui/sso/api/provider/a;-><init>(Lcom/ui/sso/api/UiAccountApi$c;Lcom/ui/sso/api/UiAccountApi$d;Landroid/content/ContentResolver;Lcom/ui/sso/api/provider/f;LWa/a;Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;Lcom/ui/sso/api/provider/UiAccountProviderCursor$Serializer;Lcom/ui/sso/auth/UiAuthSerializer;LIi/N;LIi/J;LIi/J;Lcom/ui/sso/api/provider/a$b$c;)V

    return-object v2
.end method
