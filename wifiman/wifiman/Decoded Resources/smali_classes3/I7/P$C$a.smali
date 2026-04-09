.class final LI7/P$C$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/P$C;->h(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$f;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LI7/P;

.field final synthetic b:Ljava/lang/String;


# direct methods
.method constructor <init>(LI7/P;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LI7/P$C$a;->a:LI7/P;

    iput-object p2, p0, LI7/P$C$a;->b:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$g;)Lgg/D;
    .locals 3

    iget-object v0, p0, LI7/P$C$a;->a:LI7/P;

    invoke-static {v0}, LI7/P;->J(LI7/P;)Lcom/ubnt/teleport/unifi/stun/TeleportStun;

    move-result-object v0

    new-instance v1, Lcom/ubnt/teleport/unifi/stun/TeleportStun$b;

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$g;->a()Ljava/lang/String;

    move-result-object p1

    iget-object v2, p0, LI7/P$C$a;->b:Ljava/lang/String;

    invoke-direct {v1, p1, v2}, Lcom/ubnt/teleport/unifi/stun/TeleportStun$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/ubnt/teleport/unifi/stun/TeleportStun;->createLocalPeerDescription(Lcom/ubnt/teleport/unifi/stun/TeleportStun$b;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$g;

    invoke-virtual {p0, p1}, LI7/P$C$a;->a(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$g;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
