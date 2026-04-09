.class public final Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestPayloadIce;
.super LK7/b;
.source "SourceFile"


# annotations
.annotation runtime LY6/i;
    generateAdapter = true
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0008\u0008\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestPayloadIce;",
        "LK7/b;",
        "",
        "secret",
        "<init>",
        "(Ljava/lang/String;)V",
        "c",
        "Ljava/lang/String;",
        "b",
        "()Ljava/lang/String;",
        "teleport-unifi_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "secret"
        .end annotation
    .end param

    const-string/jumbo v0, "secret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LK7/b;-><init>()V

    iput-object p1, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestPayloadIce;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestPayloadIce;->c:Ljava/lang/String;

    return-object v0
.end method
