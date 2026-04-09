.class final Lcom/ui/wifiman/model/teleport/invitation/a$k;
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


# static fields
.field public static final a:Lcom/ui/wifiman/model/teleport/invitation/a$k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/teleport/invitation/a$k;

    invoke-direct {v0}, Lcom/ui/wifiman/model/teleport/invitation/a$k;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/teleport/invitation/a$k;->a:Lcom/ui/wifiman/model/teleport/invitation/a$k;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)Lgg/D;
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$a$a;

    check-cast p1, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error;

    invoke-direct {v0, p1}, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$a$a;-><init>(Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error;)V

    invoke-static {v0}, Lgg/z;->z(Ljava/lang/Object;)Lgg/z;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$a$a;

    new-instance v1, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error$CloudError;

    check-cast p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error$CloudError;-><init>(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;)V

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$a$a;-><init>(Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error;)V

    invoke-static {v0}, Lgg/z;->z(Ljava/lang/Object;)Lgg/z;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lgg/z;->p(Ljava/lang/Throwable;)Lgg/z;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/invitation/a$k;->a(Ljava/lang/Throwable;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
