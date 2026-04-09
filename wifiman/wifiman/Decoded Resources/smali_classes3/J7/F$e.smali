.class final LJ7/F$e;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ7/F;->e(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;Ljava/lang/String;Ljava/lang/String;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LJ7/F$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LJ7/F$e;

    invoke-direct {v0}, LJ7/F$e;-><init>()V

    sput-object v0, LJ7/F$e;->a:LJ7/F$e;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseTokenFetch;)Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;
    .locals 3

    new-instance v0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseTokenFetch;->b()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "Required value was null."

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseTokenFetch;->c()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-direct {v0, v1, p1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseTokenFetch;

    invoke-virtual {p0, p1}, LJ7/F$e;->a(Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseTokenFetch;)Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;

    move-result-object p1

    return-object p1
.end method
