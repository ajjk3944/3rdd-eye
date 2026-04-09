.class public final synthetic Lcom/ui/wifiman/model/teleport/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/a;


# instance fields
.field public final synthetic a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;


# direct methods
.method public synthetic constructor <init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/c;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/c;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;

    invoke-static {v0}, Lcom/ui/wifiman/model/teleport/b$f$a;->a(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;)V

    return-void
.end method
