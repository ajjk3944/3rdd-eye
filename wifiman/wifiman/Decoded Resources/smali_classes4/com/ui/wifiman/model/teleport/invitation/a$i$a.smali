.class final Lcom/ui/wifiman/model/teleport/invitation/a$i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/invitation/a$i;->a(Lgg/i;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/teleport/invitation/a$i$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/teleport/invitation/a$i$a;

    invoke-direct {v0}, Lcom/ui/wifiman/model/teleport/invitation/a$i$a;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/teleport/invitation/a$i$a;->a:Lcom/ui/wifiman/model/teleport/invitation/a$i$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)LDj/a;
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;

    instance-of v1, v0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;

    if-nez v1, :cond_4

    instance-of v1, v0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CommunicationError$ResponseTimeout;

    if-nez v1, :cond_4

    instance-of v1, v0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CommunicationError;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    instance-of v1, v0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$ApiError;

    if-eqz v1, :cond_2

    move-object v0, p1

    check-cast v0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$ApiError;

    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$ApiError;->a()I

    move-result v0

    const/16 v1, 0x194

    if-ne v0, v1, :cond_1

    new-instance p1, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error$TokenProbablyUsed;

    invoke-direct {p1}, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error$TokenProbablyUsed;-><init>()V

    invoke-static {p1}, Lgg/i;->k0(Ljava/lang/Throwable;)Lgg/i;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-static {p1}, Lgg/i;->k0(Ljava/lang/Throwable;)Lgg/i;

    move-result-object p1

    goto :goto_1

    :cond_2
    instance-of v0, v0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError;

    if-eqz v0, :cond_3

    invoke-static {p1}, Lgg/i;->k0(Ljava/lang/Throwable;)Lgg/i;

    move-result-object p1

    goto :goto_1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    :goto_0
    const-wide/16 v0, 0x3e8

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v0, v1, p1}, Lgg/i;->d2(JLjava/util/concurrent/TimeUnit;)Lgg/i;

    move-result-object p1

    goto :goto_1

    :cond_5
    invoke-static {p1}, Lgg/i;->k0(Ljava/lang/Throwable;)Lgg/i;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/invitation/a$i$a;->a(Ljava/lang/Throwable;)LDj/a;

    move-result-object p1

    return-object p1
.end method
