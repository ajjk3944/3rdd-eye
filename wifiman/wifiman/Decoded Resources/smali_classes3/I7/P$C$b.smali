.class final LI7/P$C$b;
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
.field final synthetic a:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$f;

.field final synthetic b:Lcom/wireguard/crypto/b;

.field final synthetic c:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$f;Lcom/wireguard/crypto/b;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LI7/P$C$b;->a:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$f;

    iput-object p2, p0, LI7/P$C$b;->b:Lcom/wireguard/crypto/b;

    iput-object p3, p0, LI7/P$C$b;->c:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lgg/D;
    .locals 4

    iget-object v0, p0, LI7/P$C$b;->a:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$f;

    iget-object v1, p0, LI7/P$C$b;->b:Lcom/wireguard/crypto/b;

    invoke-virtual {v1}, Lcom/wireguard/crypto/b;->h()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$d;

    const-string/jumbo v3, "toBase64()"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v3, "localPeerDescription"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, LI7/P$C$b;->c:Ljava/lang/String;

    invoke-direct {v2, v1, p1, v3}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$f;->a(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$d;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, LI7/P$C$b;->a(Ljava/lang/String;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
