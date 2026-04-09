.class final LI7/f$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/f;-><init>(Landroid/content/Context;Ljava/lang/Class;LJ7/G;Lcom/ubnt/teleport/TeleportTunnelManager$Storage;Lokhttp3/OkHttpClient;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LI7/f$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LI7/f$a;

    invoke-direct {v0}, LI7/f$a;-><init>()V

    sput-object v0, LI7/f$a;->a:LI7/f$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)Lgg/f;
    .locals 1

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;

    if-eqz p1, :cond_0

    sget-object v0, LI7/g;->a:LI7/g;

    invoke-virtual {v0}, LI7/g;->a()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/ubnt/teleport/TeleportTunnel;->b(Lcom/ubnt/teleport/TeleportTunnel$b;)Lgg/b;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, LI7/f$a;->a(Ll9/a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
