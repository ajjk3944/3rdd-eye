.class public final Lcom/ui/sso/api/UiAccountApi$b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/sso/api/UiAccountApi$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Lcom/ui/sso/api/UiAccountApi$b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/sso/api/UiAccountApi$b$a;

    invoke-direct {v0}, Lcom/ui/sso/api/UiAccountApi$b$a;-><init>()V

    sput-object v0, Lcom/ui/sso/api/UiAccountApi$b$a;->a:Lcom/ui/sso/api/UiAccountApi$b$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Lcom/ui/sso/api/UiAccountApi$b;
    .locals 5

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LWa/j;

    new-instance v1, LWa/i;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    const-string/jumbo v3, "getPackageManager(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-direct {v1, v2, v3, v4, v3}, LWa/i;-><init>(Landroid/content/pm/PackageManager;LWa/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v2, LMa/a;->a:LMa/a;

    invoke-virtual {v2}, LMa/a;->a()Ljava/util/Set;

    move-result-object v2

    invoke-direct {v0, v1, v2}, LWa/j;-><init>(LWa/e;Ljava/util/Set;)V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "getPackageName(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LWa/j;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string/jumbo v0, "getApplicationContext(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LIi/c0;->b()LIi/J;

    move-result-object v0

    invoke-static {}, LIi/c0;->a()LIi/J;

    move-result-object v1

    invoke-virtual {p0, p1, v0, v1}, Lcom/ui/sso/api/UiAccountApi$b$a;->b(Landroid/content/Context;LIi/J;LIi/J;)Lcom/ui/sso/api/UiAccountApi$b;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "App signing certificate is not listed. This should never happen for production build since production certificate list is stale and shouldn\'t be configured. For internal builds, make sure your app certificate is listed in [UiAccountLib.allowedCertFingerprint]"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b(Landroid/content/Context;LIi/J;LIi/J;)Lcom/ui/sso/api/UiAccountApi$b;
    .locals 16

    const-string/jumbo v0, "context"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "dispatcherIO"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "dispatcherDefault"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/sso/api/a;

    const/16 v14, 0xff8

    const/4 v15, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v15}, Lcom/ui/sso/api/a;-><init>(Landroid/content/Context;LIi/J;LIi/J;Ljava/lang/String;Landroid/content/pm/PackageManager;Ljava/lang/String;LWa/k;LQa/a;Lcom/ui/sso/account/local/UiAccountSharedPrefProvider;Lcom/ui/sso/api/provider/b;LRa/b;Lcom/ui/sso/api/provider/f$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
