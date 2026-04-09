.class final Lcom/ui/wifiman/model/teleport/invitation/a$e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/invitation/a$e;->a(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/teleport/invitation/a$e$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/teleport/invitation/a$e$b;

    invoke-direct {v0}, Lcom/ui/wifiman/model/teleport/invitation/a$e$b;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/teleport/invitation/a$e$b;->a:Lcom/ui/wifiman/model/teleport/invitation/a$e$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)Lgg/f;
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error$TunnelCreationFailed;

    new-instance v1, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$ConsoleConnection;

    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$ConsoleConnection;-><init>(Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError;)V

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error$TunnelCreationFailed;-><init>(Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;)V

    invoke-static {v0}, Lgg/b;->D(Ljava/lang/Throwable;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error$CloudError;

    check-cast p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;

    invoke-direct {v0, p1}, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error$CloudError;-><init>(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;)V

    invoke-static {v0}, Lgg/b;->D(Ljava/lang/Throwable;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;

    if-eqz v0, :cond_2

    new-instance v0, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error$TunnelCreationFailed;

    check-cast p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;

    invoke-direct {v0, p1}, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error$TunnelCreationFailed;-><init>(Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;)V

    invoke-static {v0}, Lgg/b;->D(Ljava/lang/Throwable;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lgg/b;->D(Ljava/lang/Throwable;)Lgg/b;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/invitation/a$e$b;->a(Ljava/lang/Throwable;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
