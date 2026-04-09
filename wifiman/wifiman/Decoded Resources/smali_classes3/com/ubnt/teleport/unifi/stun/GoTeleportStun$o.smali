.class final Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$o;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;->getInterfaceAddressesJson()Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$o;

    invoke-direct {v0}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$o;-><init>()V

    sput-object v0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$o;->a:Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$o;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/net/NetworkInterface;)Lzi/j;
    .locals 1

    invoke-virtual {p1}, Ljava/net/NetworkInterface;->getInetAddresses()Ljava/util/Enumeration;

    move-result-object p1

    const-string/jumbo v0, "it.inetAddresses"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LZg/v;->z(Ljava/util/Enumeration;)Ljava/util/Iterator;

    move-result-object p1

    invoke-static {p1}, Lzi/m;->g(Ljava/util/Iterator;)Lzi/j;

    move-result-object p1

    sget-object v0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$o$a;->a:Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$o$a;

    invoke-static {p1, v0}, Lzi/m;->N(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/net/NetworkInterface;

    invoke-virtual {p0, p1}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$o;->a(Ljava/net/NetworkInterface;)Lzi/j;

    move-result-object p1

    return-object p1
.end method
