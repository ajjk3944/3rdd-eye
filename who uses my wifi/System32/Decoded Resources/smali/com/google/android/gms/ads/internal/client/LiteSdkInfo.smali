.class public Lcom/google/android/gms/ads/internal/client/LiteSdkInfo;
.super Lcm2;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    const-string p1, "com.google.android.gms.ads.internal.client.ILiteSdkInfo"

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lhv1;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public getAdapterCreator()Lu62;
    .locals 1

    .line 1
    new-instance v0, Ls62;

    .line 2
    .line 3
    invoke-direct {v0}, Ls62;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public getLiteSdkVersion()Lw63;
    .locals 3

    .line 1
    new-instance v0, Lw63;

    .line 2
    .line 3
    const v1, 0xf212370

    .line 4
    .line 5
    .line 6
    const-string v2, "24.7.0"

    .line 7
    .line 8
    invoke-direct {v0, v2, v1, v1}, Lw63;-><init>(Ljava/lang/String;II)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
