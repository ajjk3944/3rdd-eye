.class final Lcom/ui/wifiman/model/teleport/j$i$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/j$i$c;->a(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/teleport/j$i$c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/teleport/j$i$c$a;

    invoke-direct {v0}, Lcom/ui/wifiman/model/teleport/j$i$c$a;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/teleport/j$i$c$a;->a:Lcom/ui/wifiman/model/teleport/j$i$c$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$f;)Lgg/D;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$f;->c()Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$f;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/j$i$c$a;->a(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$f;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
