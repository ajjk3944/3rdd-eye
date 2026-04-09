.class final Lcom/ui/wifiman/model/teleport/b$f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/b$f;->a(LYg/J;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/teleport/b$f$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/teleport/b$f$a;

    invoke-direct {v0}, Lcom/ui/wifiman/model/teleport/b$f$a;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/teleport/b$f$a;->a:Lcom/ui/wifiman/model/teleport/b$f$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;)V
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/teleport/b$f$a;->c(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;)V

    return-void
.end method

.method private static final c(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;)V
    .locals 2

    invoke-interface {p0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;->getConfig()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;

    move-result-object p0

    invoke-virtual {p0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;->b()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TeleportConnection - Cancelled Tunnel["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "] connection"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/b$f$a;->b(Ll9/a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ll9/a;)Lgg/f;
    .locals 2

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/ubnt/teleport/TeleportTunnel;->close()Lgg/b;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/teleport/b$f$a$a;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/teleport/b$f$a$a;-><init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;)V

    invoke-virtual {v0, v1}, Lgg/b;->B(Lkg/f;)Lgg/b;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/teleport/c;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/teleport/c;-><init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;)V

    invoke-virtual {v0, v1}, Lgg/b;->w(Lkg/a;)Lgg/b;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/ui/wifiman/model/teleport/b$f$a$b;

    invoke-direct {p1}, Lcom/ui/wifiman/model/teleport/b$f$a$b;-><init>()V

    invoke-static {p1}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method
