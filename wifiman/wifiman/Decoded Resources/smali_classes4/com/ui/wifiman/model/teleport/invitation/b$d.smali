.class public final Lcom/ui/wifiman/model/teleport/invitation/b$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/invitation/b;->b(Landroid/net/Uri;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/net/Uri;

.field final synthetic b:Lcom/ui/wifiman/model/teleport/invitation/b;


# direct methods
.method public constructor <init>(Landroid/net/Uri;Lcom/ui/wifiman/model/teleport/invitation/b;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/invitation/b$d;->a:Landroid/net/Uri;

    iput-object p2, p0, Lcom/ui/wifiman/model/teleport/invitation/b$d;->b:Lcom/ui/wifiman/model/teleport/invitation/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 4

    const-string v0, "get(...)"

    :try_start_0
    iget-object v1, p0, Lcom/ui/wifiman/model/teleport/invitation/b$d;->a:Landroid/net/Uri;

    invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    const-string v2, "https"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/ui/wifiman/model/teleport/invitation/b$d;->a:Landroid/net/Uri;

    invoke-virtual {v1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v1

    const-string v2, "teleport.ui.link"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/ui/wifiman/model/teleport/invitation/b$d;->a:Landroid/net/Uri;

    invoke-virtual {v1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ui/wifiman/model/teleport/invitation/b$d;->a:Landroid/net/Uri;

    invoke-virtual {v1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lcom/ui/wifiman/model/teleport/invitation/b$d;->b:Lcom/ui/wifiman/model/teleport/invitation/b;

    iget-object v2, p0, Lcom/ui/wifiman/model/teleport/invitation/b$d;->a:Landroid/net/Uri;

    invoke-virtual {v2}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/String;

    invoke-static {v1, v2}, Lcom/ui/wifiman/model/teleport/invitation/b;->c(Lcom/ui/wifiman/model/teleport/invitation/b;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;

    iget-object v2, p0, Lcom/ui/wifiman/model/teleport/invitation/b$d;->a:Landroid/net/Uri;

    invoke-virtual {v2}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/String;

    invoke-direct {v1, v2}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v1}, Lgg/A;->onSuccess(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationService$Error$InvitationNotValid;

    iget-object v1, p0, Lcom/ui/wifiman/model/teleport/invitation/b$d;->a:Landroid/net/Uri;

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationService$Error$InvitationNotValid;-><init>(Landroid/net/Uri;)V

    throw v0

    :cond_1
    new-instance v0, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationService$Error$InvitationNotValid;

    iget-object v1, p0, Lcom/ui/wifiman/model/teleport/invitation/b$d;->a:Landroid/net/Uri;

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationService$Error$InvitationNotValid;-><init>(Landroid/net/Uri;)V

    throw v0

    :cond_2
    new-instance v0, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationService$Error$InvitationNotValid;

    iget-object v1, p0, Lcom/ui/wifiman/model/teleport/invitation/b$d;->a:Landroid/net/Uri;

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationService$Error$InvitationNotValid;-><init>(Landroid/net/Uri;)V

    throw v0

    :cond_3
    new-instance v0, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationService$Error$InvitationNotValid;

    iget-object v1, p0, Lcom/ui/wifiman/model/teleport/invitation/b$d;->a:Landroid/net/Uri;

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationService$Error$InvitationNotValid;-><init>(Landroid/net/Uri;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method
