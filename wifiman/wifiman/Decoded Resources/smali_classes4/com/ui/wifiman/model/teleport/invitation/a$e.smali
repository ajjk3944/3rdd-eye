.class final Lcom/ui/wifiman/model/teleport/invitation/a$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/invitation/a;->a()Lgg/b;
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

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/invitation/a$e;->a:Lcom/ui/wifiman/model/teleport/invitation/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;)Lgg/f;
    .locals 2

    const-string v0, "endpointSite"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/invitation/a$e;->a:Lcom/ui/wifiman/model/teleport/invitation/a;

    invoke-static {v0}, Lcom/ui/wifiman/model/teleport/invitation/a;->d(Lcom/ui/wifiman/model/teleport/invitation/a;)LFd/D;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/wifiman/model/teleport/invitation/a$e;->a:Lcom/ui/wifiman/model/teleport/invitation/a;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/teleport/invitation/a;->f()Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;

    move-result-object v1

    invoke-interface {v0, v1, p1}, LFd/D;->f(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;)Lgg/z;

    move-result-object p1

    new-instance v0, Lcom/ui/wifiman/model/teleport/invitation/a$e$a;

    iget-object v1, p0, Lcom/ui/wifiman/model/teleport/invitation/a$e;->a:Lcom/ui/wifiman/model/teleport/invitation/a;

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/teleport/invitation/a$e$a;-><init>(Lcom/ui/wifiman/model/teleport/invitation/a;)V

    invoke-virtual {p1, v0}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    sget-object v0, Lcom/ui/wifiman/model/teleport/invitation/a$e$b;->a:Lcom/ui/wifiman/model/teleport/invitation/a$e$b;

    invoke-virtual {p1, v0}, Lgg/b;->O(Lkg/n;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/invitation/a$e;->a(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
