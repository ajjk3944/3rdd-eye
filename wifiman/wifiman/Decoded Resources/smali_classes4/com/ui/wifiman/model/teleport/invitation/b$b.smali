.class public final Lcom/ui/wifiman/model/teleport/invitation/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/invitation/b;->a()Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/teleport/invitation/b;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/teleport/invitation/b;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/invitation/b$b;->a:Lcom/ui/wifiman/model/teleport/invitation/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/invitation/b$b;->a:Lcom/ui/wifiman/model/teleport/invitation/b;

    invoke-static {v0}, Lcom/ui/wifiman/model/teleport/invitation/b;->e(Lcom/ui/wifiman/model/teleport/invitation/b;)Landroid/content/ClipboardManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/ClipboardManager;->getPrimaryClip()Landroid/content/ClipData;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/ui/wifiman/model/teleport/invitation/b$b;->a:Lcom/ui/wifiman/model/teleport/invitation/b;

    invoke-static {v1}, Lcom/ui/wifiman/model/teleport/invitation/b;->d(Lcom/ui/wifiman/model/teleport/invitation/b;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/ClipData$Item;->coerceToText(Landroid/content/Context;)Ljava/lang/CharSequence;

    move-result-object v0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/16 v2, 0x1f4

    if-gt v1, v2, :cond_1

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-interface {p1, v0}, Lgg/A;->onSuccess(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    sget-object v0, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationService$Error$ClipboardEmpty;->a:Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationService$Error$ClipboardEmpty;

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
