.class final LJ7/m$p;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ7/m;->d()Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LJ7/m$p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LJ7/m$p;

    invoke-direct {v0}, LJ7/m$p;-><init>()V

    sput-object v0, LJ7/m$p;->a:LJ7/m$p;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseIce;)Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$g;
    .locals 1

    new-instance v0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$g;

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseIce;->b()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-direct {v0, p1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$g;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "Required value was null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseIce;

    invoke-virtual {p0, p1}, LJ7/m$p;->a(Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseIce;)Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$g;

    move-result-object p1

    return-object p1
.end method
