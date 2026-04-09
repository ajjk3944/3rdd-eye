.class final LI7/P$z;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/P;->q0(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI7/P$z$a;
    }
.end annotation


# static fields
.field public static final a:LI7/P$z;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LI7/P$z;

    invoke-direct {v0}, LI7/P$z;-><init>()V

    sput-object v0, LI7/P$z;->a:LI7/P$z;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)Lgg/f;
    .locals 4

    instance-of v0, p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;

    const-string/jumbo v1, "error"

    if-eqz v0, :cond_0

    new-instance v0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Cloud;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Exception;

    invoke-direct {v0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Cloud;-><init>(Ljava/lang/Exception;)V

    invoke-static {v0}, Lgg/b;->D(Ljava/lang/Throwable;)Lgg/b;

    move-result-object p1

    goto/16 :goto_1

    :cond_0
    instance-of v0, p1, Lcom/ubnt/teleport/unifi/stun/TeleportStun$Error;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Stun;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Exception;

    invoke-direct {v0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Stun;-><init>(Ljava/lang/Exception;)V

    invoke-static {v0}, Lgg/b;->D(Ljava/lang/Throwable;)Lgg/b;

    move-result-object p1

    goto :goto_1

    :cond_1
    instance-of v0, p1, Lcom/wireguard/android/backend/BackendException;

    if-eqz v0, :cond_3

    move-object v0, p1

    check-cast v0, Lcom/wireguard/android/backend/BackendException;

    invoke-virtual {v0}, Lcom/wireguard/android/backend/BackendException;->a()Lcom/wireguard/android/backend/BackendException$a;

    move-result-object v2

    if-nez v2, :cond_2

    const/4 v2, -0x1

    goto :goto_0

    :cond_2
    sget-object v3, LI7/P$z$a;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    :goto_0
    packed-switch v2, :pswitch_data_0

    :pswitch_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_1
    new-instance v2, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Wireguard$Connection;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Exception;

    invoke-virtual {v0}, Lcom/wireguard/android/backend/BackendException;->a()Lcom/wireguard/android/backend/BackendException$a;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, p1, v0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Wireguard$Connection;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    invoke-static {v2}, Lgg/b;->D(Ljava/lang/Throwable;)Lgg/b;

    move-result-object p1

    goto :goto_1

    :pswitch_2
    new-instance v1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Wireguard$Config;

    check-cast p1, Ljava/lang/Exception;

    invoke-virtual {v0}, Lcom/wireguard/android/backend/BackendException;->a()Lcom/wireguard/android/backend/BackendException$a;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, p1, v0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Wireguard$Config;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    invoke-static {v1}, Lgg/b;->D(Ljava/lang/Throwable;)Lgg/b;

    move-result-object p1

    goto :goto_1

    :pswitch_3
    sget-object p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Wireguard$VPNUnauthorized;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Wireguard$VPNUnauthorized;

    invoke-static {p1}, Lgg/b;->D(Ljava/lang/Throwable;)Lgg/b;

    move-result-object p1

    goto :goto_1

    :pswitch_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "Wireguard error with no reason"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-static {p1}, Lgg/b;->D(Ljava/lang/Throwable;)Lgg/b;

    move-result-object p1

    :goto_1
    return-object p1

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LI7/P$z;->a(Ljava/lang/Throwable;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
