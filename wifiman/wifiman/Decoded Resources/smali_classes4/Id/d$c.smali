.class final LId/d$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LId/d;-><init>(Landroid/content/Context;Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager;Lcom/ui/wifiman/model/teleport/session/TeleportSession;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LId/d;


# direct methods
.method constructor <init>(LId/d;)V
    .locals 0

    iput-object p1, p0, LId/d$c;->a:LId/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LId/d;Ljava/lang/String;Lgg/j;)V
    .locals 0

    invoke-static {p0, p1, p2}, LId/d$c;->c(LId/d;Ljava/lang/String;Lgg/j;)V

    return-void
.end method

.method private static final c(LId/d;Ljava/lang/String;Lgg/j;)V
    .locals 2

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb;->p:Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb$a;

    invoke-static {p0}, LId/d;->g(LId/d;)Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    const-string v1, "getApplicationContext(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    const-string v1, "tp"

    invoke-virtual {v0, p0, v1, p1}, Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb$a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb;

    move-result-object p0

    invoke-virtual {p0}, Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb;->C()LJd/b;

    move-result-object p0

    invoke-interface {p2, p0}, Lgg/h;->h(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, LId/d$c;->b(Ljava/lang/String;)LDj/a;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/String;)LDj/a;
    .locals 2

    const-string v0, "passphrase"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LId/d$c;->a:LId/d;

    new-instance v1, LId/e;

    invoke-direct {v1, v0, p1}, LId/e;-><init>(LId/d;Ljava/lang/String;)V

    sget-object p1, Lgg/a;->LATEST:Lgg/a;

    invoke-static {v1, p1}, Lgg/i;->N(Lgg/k;Lgg/a;)Lgg/i;

    move-result-object p1

    return-object p1
.end method
