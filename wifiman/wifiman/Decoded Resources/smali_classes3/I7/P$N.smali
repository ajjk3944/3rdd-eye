.class final LI7/P$N;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/P;-><init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$c;Lcom/ubnt/teleport/unifi/stun/TeleportStun;Lcom/wireguard/android/backend/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LI7/P;


# direct methods
.method constructor <init>(LI7/P;)V
    .locals 0

    iput-object p1, p0, LI7/P$N;->a:LI7/P;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$a;)Lgg/f;
    .locals 2

    iget-object v0, p0, LI7/P$N;->a:LI7/P;

    new-instance v1, LI7/P$N$a;

    invoke-direct {v1, v0, p1}, LI7/P$N$a;-><init>(LI7/P;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$a;)V

    invoke-static {v1}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$a;

    invoke-virtual {p0, p1}, LI7/P$N;->a(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
