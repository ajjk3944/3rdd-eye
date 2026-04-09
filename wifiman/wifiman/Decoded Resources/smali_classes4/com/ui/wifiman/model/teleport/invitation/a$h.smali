.class final Lcom/ui/wifiman/model/teleport/invitation/a$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/invitation/a;-><init>(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;LI7/a;LFd/D;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/teleport/invitation/a;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/teleport/invitation/a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/invitation/a$h;->a:Lcom/ui/wifiman/model/teleport/invitation/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud;)Lgg/D;
    .locals 1

    const-string v0, "cloud"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/invitation/a$h;->a:Lcom/ui/wifiman/model/teleport/invitation/a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/teleport/invitation/a;->f()Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud;->b(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/invitation/a$h;->a(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
