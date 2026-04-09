.class public final LJ7/p;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field final synthetic a:LJ7/n;


# direct methods
.method public constructor <init>(LJ7/n;)V
    .locals 0

    iput-object p1, p0, LJ7/p;->a:LJ7/n;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestResponse;)V
    .locals 2

    iget-object v0, p0, LJ7/p;->a:LJ7/n;

    const-string/jumbo v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, LJ7/n;->m(Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestResponse;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestResponse;

    invoke-virtual {p0, p1}, LJ7/p;->a(Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestResponse;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
