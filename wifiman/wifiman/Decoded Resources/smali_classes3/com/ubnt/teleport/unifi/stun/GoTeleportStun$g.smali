.class final Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$g;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;->closeConnection()Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$g;

    invoke-direct {v0}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$g;-><init>()V

    sput-object v0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$g;->a:Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$g;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "STUN - closeConnection"

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$g;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
