.class public final LYc/h;
.super LYc/g;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/net/ConnectivityManager;)V
    .locals 2

    const-string v0, "connectivityManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/net/NetworkRequest$Builder;

    invoke-direct {v0}, Landroid/net/NetworkRequest$Builder;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/net/NetworkRequest$Builder;->addTransportType(I)Landroid/net/NetworkRequest$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    move-result-object v0

    const-string v1, "WiFi"

    invoke-direct {p0, v1, v0, p1}, LYc/g;-><init>(Ljava/lang/String;Landroid/net/NetworkRequest;Landroid/net/ConnectivityManager;)V

    return-void
.end method
