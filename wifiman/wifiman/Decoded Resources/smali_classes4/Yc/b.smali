.class public final LYc/b;
.super LYc/g;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/net/ConnectivityManager;)V
    .locals 2

    const-string v0, "connectivityManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "Default"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p1}, LYc/g;-><init>(Ljava/lang/String;Landroid/net/NetworkRequest;Landroid/net/ConnectivityManager;)V

    return-void
.end method
