.class final Lcom/ui/wifiman/model/teleport/invitation/a$j;
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

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/teleport/invitation/a$j$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/teleport/invitation/a$j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/teleport/invitation/a$j;

    invoke-direct {v0}, Lcom/ui/wifiman/model/teleport/invitation/a$j;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/teleport/invitation/a$j;->a:Lcom/ui/wifiman/model/teleport/invitation/a$j;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;)Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$a;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;->e()Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/ui/wifiman/model/teleport/invitation/a$j$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    :goto_0
    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    new-instance v0, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$a$a;

    new-instance v1, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error$NetworkUnreachableError;

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;->h()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error$NetworkUnreachableError;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$a$a;-><init>(Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error;)V

    goto :goto_1

    :cond_1
    new-instance v0, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$a$c;

    invoke-direct {v0, p1}, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$a$c;-><init>(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;)V

    :goto_1
    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/invitation/a$j;->a(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;)Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$a;

    move-result-object p1

    return-object p1
.end method
