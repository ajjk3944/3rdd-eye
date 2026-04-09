.class public final Lcom/google/ads/mediation/a;
.super Lh30;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final y:Lcom/google/ads/mediation/AbstractAdViewAdapter;

.field public final z:Lhd0;


# direct methods
.method public constructor <init>(Lcom/google/ads/mediation/AbstractAdViewAdapter;Lhd0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/ads/mediation/a;->y:Lcom/google/ads/mediation/AbstractAdViewAdapter;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/ads/mediation/a;->z:Lhd0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final q(Lu70;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/ads/mediation/a;->z:Lhd0;

    .line 2
    .line 3
    check-cast v0, Lxb4;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lxb4;->u(Lr2;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final r(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, Lg30;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/ads/mediation/a;->y:Lcom/google/ads/mediation/AbstractAdViewAdapter;

    .line 4
    .line 5
    iput-object p1, v0, Lcom/google/ads/mediation/AbstractAdViewAdapter;->mInterstitialAd:Lg30;

    .line 6
    .line 7
    new-instance v1, Lgr0;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/google/ads/mediation/a;->z:Lhd0;

    .line 10
    .line 11
    invoke-direct {v1, v0, v2}, Lgr0;-><init>(Lcom/google/ads/mediation/AbstractAdViewAdapter;Lhd0;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v1}, Lg30;->b(Lyc0;)V

    .line 15
    .line 16
    .line 17
    check-cast v2, Lxb4;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    const-string p1, "#008 Must be called on the main UI thread."

    .line 23
    .line 24
    invoke-static {p1}, Lou1;->h(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const-string p1, "Adapter called onAdLoaded."

    .line 28
    .line 29
    invoke-static {p1}, Lgi2;->U(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :try_start_0
    iget-object p1, v2, Lxb4;->g:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p1, Lz62;

    .line 35
    .line 36
    invoke-interface {p1}, Lz62;->g()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :catch_0
    move-exception p1

    .line 41
    const-string v0, "#007 Could not call remote method."

    .line 42
    .line 43
    invoke-static {v0, p1}, Lgi2;->p0(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method
