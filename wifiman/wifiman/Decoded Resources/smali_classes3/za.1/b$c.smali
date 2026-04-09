.class final Lza/b$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lza/b;->c(Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lza/b;


# direct methods
.method constructor <init>(Lza/b;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lza/b$c;->b:Lza/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method

.method public static synthetic n()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lza/b$c;->t()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static final t()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "No environment info found in saved snapshot. Falling back to PRODUCTION"

    return-object v0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 1

    new-instance p1, Lza/b$c;

    iget-object v0, p0, Lza/b$c;->b:Lza/b;

    invoke-direct {p1, v0, p2}, Lza/b$c;-><init>(Lza/b;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lza/b$c;->o(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, Lza/b$c;->a:I

    if-nez v0, :cond_7

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lza/b$c;->b:Lza/b;

    invoke-static {p1}, Lza/b;->d(Lza/b;)Landroid/content/SharedPreferences;

    move-result-object p1

    const-string/jumbo v0, "raw"

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lza/b$c;->b:Lza/b;

    invoke-static {v0}, Lza/b;->d(Lza/b;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string/jumbo v2, "env"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v2, p0, Lza/b$c;->b:Lza/b;

    invoke-static {v2, v0}, Lza/b;->f(Lza/b;Ljava/lang/String;)Lcom/ui/uidb/UiDB$b;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_1

    new-instance v2, Lza/c;

    invoke-direct {v2}, Lza/c;-><init>()V

    const/4 v3, 0x2

    invoke-static {v2, v1, v3, v1}, LAa/a;->c(Lmh/a;Ljava/lang/Throwable;ILjava/lang/Object;)V

    :cond_1
    if-nez v0, :cond_2

    sget-object v0, Lcom/ui/uidb/UiDB$b;->PRODUCTION:Lcom/ui/uidb/UiDB$b;

    :cond_2
    iget-object v2, p0, Lza/b$c;->b:Lza/b;

    invoke-static {v2}, Lza/b;->d(Lza/b;)Landroid/content/SharedPreferences;

    move-result-object v2

    const-string/jumbo v3, "created"

    const-wide/16 v4, -0x1

    invoke-interface {v2, v3, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    cmp-long v4, v2, v4

    if-nez v4, :cond_3

    return-object v1

    :cond_3
    iget-object v4, p0, Lza/b$c;->b:Lza/b;

    invoke-static {v4}, Lza/b;->d(Lza/b;)Landroid/content/SharedPreferences;

    move-result-object v4

    const-string/jumbo v5, "etag"

    invoke-interface {v4, v5, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_4

    sget-object v5, LYa/a;->a:LYa/a$a;

    invoke-virtual {v5, v4}, LYa/a$a;->a(Ljava/lang/String;)LYa/a;

    move-result-object v4

    goto :goto_1

    :cond_4
    move-object v4, v1

    :goto_1
    new-instance v5, Lbb/a$a;

    invoke-direct {v5, v2, v3, v4}, Lbb/a$a;-><init>(JLYa/a;)V

    if-nez p1, :cond_5

    return-object v1

    :cond_5
    iget-object v2, p0, Lza/b$c;->b:Lza/b;

    invoke-static {v2}, Lza/b;->d(Lza/b;)Landroid/content/SharedPreferences;

    move-result-object v2

    const-string/jumbo v3, "version"

    invoke-interface {v2, v3, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-static {v2}, Lbb/a$b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lza/b$c;->b:Lza/b;

    :try_start_0
    invoke-static {v3}, Lza/b;->e(Lza/b;)Lbb/b;

    move-result-object v3

    invoke-interface {v3, v0, p1}, Lbb/b;->a(Lcom/ui/uidb/UiDB$b;Ljava/lang/String;)Lbb/a;

    move-result-object v3

    invoke-virtual {v3}, Lbb/a;->a()Ljava/util/List;

    move-result-object v3
    :try_end_0
    .catch Lcom/ui/uidb/UiDB$Error$ContentInvalid; {:try_start_0 .. :try_end_0} :catch_0

    new-instance v4, Lbb/a;

    invoke-direct {v4, v2, v3, v1}, Lbb/a;-><init>(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lcom/ui/uidb/UiDB$c;

    invoke-direct {v1, v5, v4, p1, v0}, Lcom/ui/uidb/UiDB$c;-><init>(Lbb/a$a;Lbb/a;Ljava/lang/String;Lcom/ui/uidb/UiDB$b;)V

    return-object v1

    :catch_0
    move-exception p1

    new-instance v0, Lcom/ui/uidb/UiDB$Error$ContentInvalid;

    const-string/jumbo v1, "Failed to deserialize snapshot from shared preferences"

    invoke-direct {v0, v1, p1}, Lcom/ui/uidb/UiDB$Error$ContentInvalid;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_6
    return-object v1

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final o(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lza/b$c;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lza/b$c;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lza/b$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
