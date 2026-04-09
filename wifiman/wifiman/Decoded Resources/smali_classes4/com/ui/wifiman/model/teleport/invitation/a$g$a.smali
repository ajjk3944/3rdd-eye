.class public final Lcom/ui/wifiman/model/teleport/invitation/a$g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/invitation/a$g;->a(Ljava/lang/Throwable;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/teleport/invitation/a;

.field final synthetic b:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/teleport/invitation/a;Ljava/lang/Throwable;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/invitation/a$g$a;->a:Lcom/ui/wifiman/model/teleport/invitation/a;

    iput-object p2, p0, Lcom/ui/wifiman/model/teleport/invitation/a$g$a;->b:Ljava/lang/Throwable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/invitation/a$g$a;->a:Lcom/ui/wifiman/model/teleport/invitation/a;

    invoke-static {v0}, Lcom/ui/wifiman/model/teleport/invitation/a;->e(Lcom/ui/wifiman/model/teleport/invitation/a;)LFg/a;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$b$a;

    iget-object v2, p0, Lcom/ui/wifiman/model/teleport/invitation/a$g$a;->b:Ljava/lang/Throwable;

    check-cast v2, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error;

    invoke-direct {v1, v2}, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$b$a;-><init>(Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error;)V

    invoke-virtual {v0, v1}, LFg/a;->h(Ljava/lang/Object;)V

    invoke-interface {p1}, Lgg/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface {p1, v0}, Lgg/c;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
