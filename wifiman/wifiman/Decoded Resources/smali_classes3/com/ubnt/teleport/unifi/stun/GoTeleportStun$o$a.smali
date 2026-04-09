.class final Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$o$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$o;->a(Ljava/net/NetworkInterface;)Lzi/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$o$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$o$a;

    invoke-direct {v0}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$o$a;-><init>()V

    sput-object v0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$o$a;->a:Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$o$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/net/InetAddress;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p1}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/net/InetAddress;

    invoke-virtual {p0, p1}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$o$a;->a(Ljava/net/InetAddress;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
