.class final Lcom/ui/wifiman/model/teleport/invitation/a$d;
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


# static fields
.field public static final a:Lcom/ui/wifiman/model/teleport/invitation/a$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/teleport/invitation/a$d;

    invoke-direct {v0}, Lcom/ui/wifiman/model/teleport/invitation/a$d;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/teleport/invitation/a$d;->a:Lcom/ui/wifiman/model/teleport/invitation/a$d;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$a;)Lgg/r;
    .locals 1

    const-string v0, "siteState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$a$c;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$a$c;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$a$c;->a()Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;

    move-result-object p1

    invoke-static {p1}, Lgg/n;->o(Ljava/lang/Object;)Lgg/n;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$a$b;

    if-eqz v0, :cond_1

    invoke-static {}, Lgg/n;->h()Lgg/n;

    move-result-object p1

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$a$a;

    if-eqz v0, :cond_2

    check-cast p1, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$a$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$a$a;->a()Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error;

    move-result-object p1

    invoke-static {p1}, Lgg/n;->i(Ljava/lang/Throwable;)Lgg/n;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/invitation/a$d;->a(Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$a;)Lgg/r;

    move-result-object p1

    return-object p1
.end method
