.class public final Lma3;
.super Lpn2;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public f:Ld52;


# virtual methods
.method public final C2(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final D0(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final I1(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final Q(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final S1(F)V
    .locals 0

    .line 1
    return-void
.end method

.method public final S2(Lu10;Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final b()V
    .locals 3

    .line 1
    const-string v0, "The initialization is not processed because MobileAdsSettingsManager is not created successfully."

    .line 2
    .line 3
    invoke-static {v0}, Lgi2;->Z(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lj63;->b:Lwc1;

    .line 7
    .line 8
    new-instance v1, Lbs2;

    .line 9
    .line 10
    const/16 v2, 0x17

    .line 11
    .line 12
    invoke-direct {v1, v2, p0}, Lbs2;-><init>(ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final b2(Lne3;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final i()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final i0(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final j2(Lu10;Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final k()F
    .locals 1

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    return v0
.end method

.method public final m()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final n()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    return-object v0
.end method

.method public final u()V
    .locals 0

    .line 1
    return-void
.end method

.method public final w3(Lms2;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final x2(Lu62;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final y2(Ld52;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lma3;->f:Ld52;

    .line 2
    .line 3
    return-void
.end method
