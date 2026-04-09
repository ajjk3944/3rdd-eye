.class public abstract LK7/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LK7/b$a;
    }
.end annotation


# static fields
.field public static final a:LK7/b$a;

.field private static final b:LZ6/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LK7/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LK7/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LK7/b;->a:LK7/b$a;

    const-class v0, LK7/b;

    const-string/jumbo v1, "request_type"

    invoke-static {v0, v1}, LZ6/a;->b(Ljava/lang/Class;Ljava/lang/String;)LZ6/a;

    move-result-object v0

    const-class v1, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestPayloadTokenRequest;

    const-string/jumbo v2, "REQUEST_ACCESS"

    invoke-virtual {v0, v1, v2}, LZ6/a;->c(Ljava/lang/Class;Ljava/lang/String;)LZ6/a;

    move-result-object v0

    const-class v1, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestPayloadIce;

    const-string/jumbo v2, "GET_ICE_CONFIGURATION"

    invoke-virtual {v0, v1, v2}, LZ6/a;->c(Ljava/lang/Class;Ljava/lang/String;)LZ6/a;

    move-result-object v0

    const-class v1, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestPayloadConnection;

    const-string v2, "CONNECT"

    invoke-virtual {v0, v1, v2}, LZ6/a;->c(Ljava/lang/Class;Ljava/lang/String;)LZ6/a;

    move-result-object v0

    const-string/jumbo v1, "of(ApiTeleportCloudReque\u2026n::class.java, \"CONNECT\")"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, LK7/b;->b:LZ6/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a()LZ6/a;
    .locals 1

    sget-object v0, LK7/b;->b:LZ6/a;

    return-object v0
.end method
