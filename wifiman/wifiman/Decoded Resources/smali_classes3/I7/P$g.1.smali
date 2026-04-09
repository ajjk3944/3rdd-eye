.class final LI7/P$g;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/P;-><init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$c;Lcom/ubnt/teleport/unifi/stun/TeleportStun;Lcom/wireguard/android/backend/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LI7/P$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LI7/P$g;

    invoke-direct {v0}, LI7/P$g;-><init>()V

    sput-object v0, LI7/P$g;->a:LI7/P$g;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LYg/J;)LDj/a;
    .locals 0

    sget-object p1, LI7/P$g$a;->a:LI7/P$g$a;

    invoke-static {p1}, LN7/a;->b(Lmh/a;)V

    sget-object p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$InterruptedByUser;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$InterruptedByUser;

    invoke-static {p1}, Lgg/i;->k0(Ljava/lang/Throwable;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/J;

    invoke-virtual {p0, p1}, LI7/P$g;->a(LYg/J;)LDj/a;

    move-result-object p1

    return-object p1
.end method
