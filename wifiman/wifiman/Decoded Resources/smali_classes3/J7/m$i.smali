.class final LJ7/m$i;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ7/m;->c()Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LJ7/m$i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LJ7/m$i;

    invoke-direct {v0}, LJ7/m$i;-><init>()V

    sput-object v0, LJ7/m$i;->a:LJ7/m$i;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;)Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;
    .locals 2

    sget-object v0, LJ7/m;->j:LJ7/m$a;

    const-string/jumbo v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, LJ7/m$a;->a(Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;)Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;

    invoke-virtual {p0, p1}, LJ7/m$i;->a(Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;)Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;

    move-result-object p1

    return-object p1
.end method
