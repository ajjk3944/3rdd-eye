.class final LJ7/m$m;
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


# instance fields
.field final synthetic a:LJ7/m;


# direct methods
.method constructor <init>(LJ7/m;)V
    .locals 0

    iput-object p1, p0, LJ7/m$m;->a:LJ7/m;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseIce;)V
    .locals 2

    iget-object v0, p0, LJ7/m$m;->a:LJ7/m;

    const-string/jumbo v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, LJ7/n;->o(Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseIce;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseIce;

    invoke-virtual {p0, p1}, LJ7/m$m;->a(Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseIce;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
