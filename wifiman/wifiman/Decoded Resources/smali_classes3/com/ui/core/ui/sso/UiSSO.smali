.class public final Lcom/ui/core/ui/sso/UiSSO;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/core/ui/sso/UiSSO$a;,
        Lcom/ui/core/ui/sso/UiSSO$b;,
        Lcom/ui/core/ui/sso/UiSSO$c;,
        Lcom/ui/core/ui/sso/UiSSO$Error;,
        Lcom/ui/core/ui/sso/UiSSO$d;,
        Lcom/ui/core/ui/sso/UiSSO$e;,
        Lcom/ui/core/ui/sso/UiSSO$f;,
        Lcom/ui/core/ui/sso/UiSSO$SuppressedError;,
        Lcom/ui/core/ui/sso/UiSSO$g;
    }
.end annotation


# static fields
.field public static final a:Lcom/ui/core/ui/sso/UiSSO;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/core/ui/sso/UiSSO;

    invoke-direct {v0}, Lcom/ui/core/ui/sso/UiSSO;-><init>()V

    sput-object v0, Lcom/ui/core/ui/sso/UiSSO;->a:Lcom/ui/core/ui/sso/UiSSO;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ui/core/ui/sso/UiSSO;->f(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/ui/core/ui/sso/UiSSO;Landroid/content/Context;Lcom/ui/core/ui/sso/UiSSO$c;Ljava/lang/String;Ljava/lang/String;ZLcom/ui/core/ui/sso/UiSSO$g;Lcom/ui/core/ui/sso/UiSSO$e;ILjava/lang/Object;)Landroid/content/Intent;
    .locals 7

    and-int/lit8 v0, p8, 0x2

    if-eqz v0, :cond_0

    sget-object v0, Lcom/ui/core/ui/sso/UiSSO$c;->LOGIN:Lcom/ui/core/ui/sso/UiSSO$c;

    goto :goto_0

    :cond_0
    move-object v0, p2

    :goto_0
    and-int/lit8 v1, p8, 0x4

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v1, v2

    goto :goto_1

    :cond_1
    move-object v1, p3

    :goto_1
    and-int/lit8 v3, p8, 0x8

    if-eqz v3, :cond_2

    move-object v3, v2

    goto :goto_2

    :cond_2
    move-object v3, p4

    :goto_2
    and-int/lit8 v4, p8, 0x10

    if-eqz v4, :cond_3

    const/4 v4, 0x0

    goto :goto_3

    :cond_3
    move v4, p5

    :goto_3
    and-int/lit8 v5, p8, 0x20

    if-eqz v5, :cond_4

    sget-object v5, Lcom/ui/core/ui/sso/UiSSO$g;->FOLLOW_SYSTEM:Lcom/ui/core/ui/sso/UiSSO$g;

    goto :goto_4

    :cond_4
    move-object v5, p6

    :goto_4
    and-int/lit8 v6, p8, 0x40

    if-eqz v6, :cond_5

    goto :goto_5

    :cond_5
    move-object v2, p7

    :goto_5
    move-object p2, p0

    move-object p3, p1

    move-object p4, v0

    move-object p5, v1

    move-object p6, v3

    move p7, v4

    move-object p8, v5

    move-object/from16 p9, v2

    invoke-virtual/range {p2 .. p9}, Lcom/ui/core/ui/sso/UiSSO;->b(Landroid/content/Context;Lcom/ui/core/ui/sso/UiSSO$c;Ljava/lang/String;Ljava/lang/String;ZLcom/ui/core/ui/sso/UiSSO$g;Lcom/ui/core/ui/sso/UiSSO$e;)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method private static final f(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    .locals 11

    const-string/jumbo v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/ui/core/ui/sso/UiSSO;->a:Lcom/ui/core/ui/sso/UiSSO;

    const/16 v9, 0x62

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v2, p0

    move-object v4, p1

    move-object v5, p2

    invoke-static/range {v1 .. v10}, Lcom/ui/core/ui/sso/UiSSO;->c(Lcom/ui/core/ui/sso/UiSSO;Landroid/content/Context;Lcom/ui/core/ui/sso/UiSSO$c;Ljava/lang/String;Ljava/lang/String;ZLcom/ui/core/ui/sso/UiSSO$g;Lcom/ui/core/ui/sso/UiSSO$e;ILjava/lang/Object;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(Landroid/content/Context;Lcom/ui/core/ui/sso/UiSSO$c;Ljava/lang/String;Ljava/lang/String;ZLcom/ui/core/ui/sso/UiSSO$g;Lcom/ui/core/ui/sso/UiSSO$e;)Landroid/content/Intent;
    .locals 3

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "entryPoint"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "theme"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/ui/core/ui/sso/SSOAccountActivity;

    invoke-direct {v1, p1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    sget-object p1, Lcom/ui/core/ui/sso/UiSSO$f;->LOGIN:Lcom/ui/core/ui/sso/UiSSO$f;

    const-string/jumbo v2, "null cannot be cast to non-null type android.os.Parcelable"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v2, "screen"

    invoke-virtual {v1, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string/jumbo p1, "entry_point"

    invoke-virtual {v1, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string/jumbo p1, "username"

    invoke-virtual {v1, p1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string/jumbo p1, "password"

    invoke-virtual {v1, p1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string/jumbo p1, "hasToolbarClose"

    invoke-virtual {v1, p1, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    invoke-virtual {v1, v0, p6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    if-eqz p7, :cond_0

    const-string/jumbo p1, "pkce_params"

    invoke-virtual {v1, p1, p7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    :cond_0
    return-object v1
.end method

.method public final d(LP9/j;)V
    .locals 1

    const-string/jumbo v0, "ssoRecaptchaConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LP9/n;->a:LP9/n;

    invoke-virtual {v0, p1}, LP9/n;->l(LP9/j;)V

    return-void
.end method

.method public final e()V
    .locals 2

    sget-object v0, LMa/a;->a:LMa/a;

    new-instance v1, LP9/l;

    invoke-direct {v1}, LP9/l;-><init>()V

    invoke-virtual {v0, v1}, LMa/a;->e(Lmh/q;)V

    return-void
.end method
