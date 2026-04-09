.class public final Lcom/ui/wifiman/model/teleport/invitation/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationService;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/teleport/invitation/b$a;
    }
.end annotation


# static fields
.field public static final c:Lcom/ui/wifiman/model/teleport/invitation/b$a;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/content/ClipboardManager;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/teleport/invitation/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/teleport/invitation/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/wifiman/model/teleport/invitation/b;->c:Lcom/ui/wifiman/model/teleport/invitation/b$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/content/ClipboardManager;)V
    .locals 1

    const-string v0, "applicationContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clipboardManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/invitation/b;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/ui/wifiman/model/teleport/invitation/b;->b:Landroid/content/ClipboardManager;

    return-void
.end method

.method public static final synthetic c(Lcom/ui/wifiman/model/teleport/invitation/b;Ljava/lang/String;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/teleport/invitation/b;->f(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic d(Lcom/ui/wifiman/model/teleport/invitation/b;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/teleport/invitation/b;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic e(Lcom/ui/wifiman/model/teleport/invitation/b;)Landroid/content/ClipboardManager;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/teleport/invitation/b;->b:Landroid/content/ClipboardManager;

    return-object p0
.end method

.method private final f(Ljava/lang/String;)Z
    .locals 0

    :try_start_0
    invoke-static {p1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public a()Lgg/z;
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/teleport/invitation/b$b;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/model/teleport/invitation/b$b;-><init>(Lcom/ui/wifiman/model/teleport/invitation/b;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v0

    const-string v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/ui/wifiman/model/teleport/invitation/b$c;

    invoke-direct {v1, p0}, Lcom/ui/wifiman/model/teleport/invitation/b$c;-><init>(Lcom/ui/wifiman/model/teleport/invitation/b;)V

    invoke-virtual {v0, v1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object v0

    const-string v1, "flatMap(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public b(Landroid/net/Uri;)Lgg/z;
    .locals 1

    const-string v0, "uri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wifiman/model/teleport/invitation/b$d;

    invoke-direct {v0, p1, p0}, Lcom/ui/wifiman/model/teleport/invitation/b$d;-><init>(Landroid/net/Uri;Lcom/ui/wifiman/model/teleport/invitation/b;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
