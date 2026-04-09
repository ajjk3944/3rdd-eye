.class public final Li8/s$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li8/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Li8/s$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Li8/s$a;)Landroid/net/Uri$Builder;
    .locals 0

    invoke-direct {p0}, Li8/s$a;->c()Landroid/net/Uri$Builder;

    move-result-object p0

    return-object p0
.end method

.method private final c()Landroid/net/Uri$Builder;
    .locals 2

    new-instance v0, Landroid/net/Uri$Builder;

    invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V

    const-string/jumbo v1, "wifiman"

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string/jumbo v1, "deeplink_v1"

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string/jumbo v1, "authority(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final b(Landroid/net/Uri;)Li8/s;
    .locals 3

    const-string/jumbo v0, "uri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "wifiman"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v2, "deeplink_v1"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_3

    sget-object v0, Li8/s$c;->c:Li8/s$c$a;

    invoke-virtual {v0, p1}, Li8/s$c$a;->a(Landroid/net/Uri;)Li8/s$c;

    move-result-object v0

    if-eqz v0, :cond_2

    :cond_1
    move-object v1, v0

    goto :goto_1

    :cond_2
    sget-object v0, Li8/s$g;->c:Li8/s$g$a;

    invoke-virtual {v0, p1}, Li8/s$g$a;->a(Landroid/net/Uri;)Li8/s;

    move-result-object v0

    if-nez v0, :cond_1

    sget-object v0, Li8/s$f;->d:Li8/s$f$a;

    invoke-virtual {v0, p1}, Li8/s$f$a;->a(Landroid/net/Uri;)Li8/s;

    move-result-object v0

    if-nez v0, :cond_1

    sget-object v0, Li8/s$e$a;->b:Li8/s$e$a;

    invoke-virtual {v0, p1}, Li8/s$e$a;->b(Landroid/net/Uri;)Li8/s$e$a;

    move-result-object p1

    move-object v1, p1

    :cond_3
    :goto_1
    return-object v1
.end method

.method public final d(Landroid/content/Context;Li8/s;)Landroid/content/Intent;
    .locals 2

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "deeplink"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/ubnt/usurvey/ui/splash/SplashActivity;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p2}, Li8/s;->a()Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    move-result-object p1

    const-string/jumbo p2, "setData(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
