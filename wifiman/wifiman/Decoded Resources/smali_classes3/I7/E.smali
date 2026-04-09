.class public final synthetic LI7/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# instance fields
.field public final synthetic a:LI7/P;


# direct methods
.method public synthetic constructor <init>(LI7/P;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI7/E;->a:LI7/P;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LI7/E;->a:LI7/P;

    check-cast p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;

    check-cast p2, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;

    invoke-static {v0, p1, p2}, LI7/P;->z(LI7/P;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;)Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;

    move-result-object p1

    return-object p1
.end method
