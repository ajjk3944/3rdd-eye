.class public abstract LId/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LId/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(LId/f;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;)LId/c;
    .locals 1

    const-string v0, "$receiver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$ReconnectionFailed;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$ReconnectionFailed;

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$ReconnectionFailed;->a()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;

    move-result-object p1

    :cond_0
    instance-of v0, p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Cloud;

    if-eqz v0, :cond_3

    check-cast p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Cloud;

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Cloud;->a()Ljava/lang/Exception;

    move-result-object p1

    instance-of v0, p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    invoke-interface {p0, p1}, LId/f;->t(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;)LId/c;

    move-result-object p0

    if-nez p0, :cond_9

    :cond_2
    sget-object p0, LId/c$h;->a:LId/c$h;

    goto :goto_3

    :cond_3
    instance-of p0, p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Stun;

    if-nez p0, :cond_8

    instance-of p0, p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Wireguard$Config;

    if-nez p0, :cond_8

    instance-of p0, p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Wireguard$Connection;

    if-eqz p0, :cond_4

    goto :goto_2

    :cond_4
    instance-of p0, p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Wireguard$VPNUnauthorized;

    if-eqz p0, :cond_5

    sget-object p0, LId/c$h;->a:LId/c$h;

    goto :goto_3

    :cond_5
    instance-of p0, p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$ReconnectionFailed;

    if-nez p0, :cond_7

    instance-of p0, p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$InterruptedByUser;

    if-eqz p0, :cond_6

    goto :goto_1

    :cond_6
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_7
    :goto_1
    sget-object p0, LId/c$c;->a:LId/c$c;

    goto :goto_3

    :cond_8
    :goto_2
    sget-object p0, LId/c$g;->a:LId/c$g;

    :cond_9
    :goto_3
    return-object p0
.end method

.method public static b(LId/f;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;)LId/c;
    .locals 0

    const-string p0, "$receiver"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p0, p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;

    if-eqz p0, :cond_0

    sget-object p0, LId/c$b;->a:LId/c$b;

    goto :goto_1

    :cond_0
    instance-of p0, p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$ApiError;

    if-nez p0, :cond_6

    instance-of p0, p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CommunicationError$ResponseTimeout;

    if-nez p0, :cond_6

    instance-of p0, p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CommunicationError$NetworkError;

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    instance-of p0, p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError$TeleportDisabled;

    if-eqz p0, :cond_2

    sget-object p0, LId/c$f;->a:LId/c$f;

    goto :goto_1

    :cond_2
    instance-of p0, p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError$SiteGatewayNotFound;

    if-eqz p0, :cond_3

    sget-object p0, LId/c$d;->a:LId/c$d;

    goto :goto_1

    :cond_3
    instance-of p0, p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError$Unauthenticated;

    if-eqz p0, :cond_4

    sget-object p0, LId/c$e;->a:LId/c$e;

    goto :goto_1

    :cond_4
    instance-of p0, p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError$ClientInvalid;

    if-eqz p0, :cond_5

    sget-object p0, LId/c$b;->a:LId/c$b;

    goto :goto_1

    :cond_5
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_6
    :goto_0
    sget-object p0, LId/c$a;->a:LId/c$a;

    :goto_1
    return-object p0
.end method

.method public static c(LId/f;Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;)LId/c;
    .locals 1

    const-string v0, "$receiver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$NoVpnProfile;

    if-nez v0, :cond_5

    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$NoMainConsole;

    if-nez v0, :cond_5

    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$NoSSOAccount;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$Tunnel;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$Tunnel;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$Tunnel;->a()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;

    move-result-object p1

    invoke-interface {p0, p1}, LId/f;->B(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;)LId/c;

    move-result-object p0

    goto :goto_1

    :cond_1
    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$Cloud;

    if-eqz v0, :cond_2

    check-cast p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$Cloud;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$Cloud;->a()Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;

    move-result-object p1

    invoke-interface {p0, p1}, LId/f;->t(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;)LId/c;

    move-result-object p0

    goto :goto_1

    :cond_2
    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$ConsoleConnection;

    if-eqz v0, :cond_3

    check-cast p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$ConsoleConnection;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$ConsoleConnection;->a()Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError;

    move-result-object p1

    invoke-interface {p0, p1}, LId/f;->S(Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError;)LId/c;

    move-result-object p0

    goto :goto_1

    :cond_3
    instance-of p0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$CancelledByUser;

    if-eqz p0, :cond_4

    sget-object p0, LId/c$c;->a:LId/c$c;

    goto :goto_1

    :cond_4
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_5
    :goto_0
    sget-object p0, LId/c$h;->a:LId/c$h;

    :goto_1
    return-object p0
.end method

.method public static d(LId/f;Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError;)LId/c;
    .locals 0

    const-string p0, "$receiver"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p0, p1, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$IO;

    if-eqz p0, :cond_0

    sget-object p0, LId/c$a;->a:LId/c$a;

    goto :goto_1

    :cond_0
    instance-of p0, p1, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$RequestFailed;

    if-nez p0, :cond_2

    instance-of p0, p1, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$Unauthorized;

    if-nez p0, :cond_2

    instance-of p0, p1, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$UntrustedCertificate;

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_2
    :goto_0
    sget-object p0, LId/c$b;->a:LId/c$b;

    :goto_1
    return-object p0
.end method
