.class final LH8/l$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH8/l;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LH8/l;


# direct methods
.method constructor <init>(LH8/l;)V
    .locals 0

    iput-object p1, p0, LH8/l$g;->a:LH8/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$a;

    check-cast p2, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$b;

    check-cast p3, Lwa/a;

    invoke-virtual {p0, p1, p2, p3}, LH8/l$g;->b(Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$a;Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$b;Lwa/a;)LH8/l$b;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$a;Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$b;Lwa/a;)LH8/l$b;
    .locals 1

    const-string/jumbo v0, "siteState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "tunnelCreationState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "catalogBrowser"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$a$b;

    if-eqz v0, :cond_0

    sget-object p1, LH8/l$b$c;->a:LH8/l$b$c;

    goto/16 :goto_1

    :cond_0
    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$a$a;

    if-eqz v0, :cond_1

    iget-object p2, p0, LH8/l$g;->a:LH8/l;

    check-cast p1, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$a$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$a$a;->a()Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p2, p1, v0, p3}, LH8/l;->z0(LH8/l;Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;Lwa/a;)LH8/l$b;

    move-result-object p1

    goto :goto_1

    :cond_1
    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$a$c;

    if-eqz v0, :cond_6

    instance-of v0, p2, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$b$b;

    if-eqz v0, :cond_2

    new-instance p2, LH8/l$b$b$b;

    iget-object v0, p0, LH8/l$g;->a:LH8/l;

    check-cast p1, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$a$c;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$a$c;->a()Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;

    move-result-object p1

    invoke-static {v0, p1, p3}, LH8/l;->v0(LH8/l;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;Lwa/a;)LH8/l$a;

    move-result-object p1

    invoke-direct {p2, p1}, LH8/l$b$b$b;-><init>(LH8/l$a;)V

    :goto_0
    move-object p1, p2

    goto :goto_1

    :cond_2
    instance-of v0, p2, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$b$c;

    if-eqz v0, :cond_3

    new-instance p2, LH8/l$b$b$a;

    iget-object v0, p0, LH8/l$g;->a:LH8/l;

    check-cast p1, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$a$c;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$a$c;->a()Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;

    move-result-object p1

    invoke-static {v0, p1, p3}, LH8/l;->v0(LH8/l;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;Lwa/a;)LH8/l$a;

    move-result-object p1

    invoke-direct {p2, p1}, LH8/l$b$b$a;-><init>(LH8/l$a;)V

    goto :goto_0

    :cond_3
    instance-of v0, p2, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$b$d;

    if-eqz v0, :cond_4

    new-instance p2, LH8/l$b$b$c;

    iget-object v0, p0, LH8/l$g;->a:LH8/l;

    check-cast p1, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$a$c;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$a$c;->a()Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;

    move-result-object p1

    invoke-static {v0, p1, p3}, LH8/l;->v0(LH8/l;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;Lwa/a;)LH8/l$a;

    move-result-object p1

    invoke-direct {p2, p1}, LH8/l$b$b$c;-><init>(LH8/l$a;)V

    goto :goto_0

    :cond_4
    instance-of v0, p2, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$b$a;

    if-eqz v0, :cond_5

    iget-object v0, p0, LH8/l$g;->a:LH8/l;

    check-cast p2, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$b$a;

    invoke-virtual {p2}, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$b$a;->a()Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error;

    move-result-object p2

    check-cast p1, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$a$c;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$a$c;->a()Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;

    move-result-object p1

    invoke-static {v0, p2, p1, p3}, LH8/l;->z0(LH8/l;Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;Lwa/a;)LH8/l$b;

    move-result-object p1

    :goto_1
    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
