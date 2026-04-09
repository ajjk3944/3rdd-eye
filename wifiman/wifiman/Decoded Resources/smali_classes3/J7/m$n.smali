.class final LJ7/m$n;
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
.field public static final a:LJ7/m$n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LJ7/m$n;

    invoke-direct {v0}, LJ7/m$n;-><init>()V

    sput-object v0, LJ7/m$n;->a:LJ7/m$n;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseIce;)Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseIce;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LJ7/H;->a(Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseIce;)Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseIce;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseIce;

    invoke-virtual {p0, p1}, LJ7/m$n;->a(Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseIce;)Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseIce;

    move-result-object p1

    return-object p1
.end method
