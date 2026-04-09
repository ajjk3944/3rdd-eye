.class public final LJ7/q;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# static fields
.field public static final a:LJ7/q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LJ7/q;

    invoke-direct {v0}, LJ7/q;-><init>()V

    sput-object v0, LJ7/q;->a:LJ7/q;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestResponse;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestResponse;->b()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "Required value was null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestResponse;

    invoke-virtual {p0, p1}, LJ7/q;->a(Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestResponse;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
