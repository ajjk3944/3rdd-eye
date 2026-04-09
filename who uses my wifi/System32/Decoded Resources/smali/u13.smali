.class public final Lu13;
.super Lhv1;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lb82;


# instance fields
.field public final f:Lc03;


# direct methods
.method public constructor <init>(Ln03;Lc03;)V
    .locals 0

    .line 1
    const-string p1, "com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback"

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lhv1;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lu13;->f:Lc03;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final A3(ILandroid/os/Parcel;Landroid/os/Parcel;)Z
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    iget-object v1, p0, Lu13;->f:Lc03;

    .line 3
    .line 4
    if-eq p1, v0, :cond_2

    .line 5
    .line 6
    const/4 v0, 0x3

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eq p1, v0, :cond_1

    .line 9
    .line 10
    const/4 v0, 0x4

    .line 11
    if-eq p1, v0, :cond_0

    .line 12
    .line 13
    return v2

    .line 14
    :cond_0
    sget-object p1, Lnx2;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 15
    .line 16
    invoke-static {p2, p1}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Lnx2;

    .line 21
    .line 22
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lu13;->a(Lnx2;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 34
    .line 35
    .line 36
    iget-object p2, v1, Lc03;->c:Lhv1;

    .line 37
    .line 38
    check-cast p2, Lu03;

    .line 39
    .line 40
    invoke-virtual {p2, p1, v2}, Lu03;->w0(Ljava/lang/String;I)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    iget-object p1, v1, Lc03;->c:Lhv1;

    .line 45
    .line 46
    check-cast p1, Lu03;

    .line 47
    .line 48
    invoke-virtual {p1}, Lu03;->g()V

    .line 49
    .line 50
    .line 51
    :goto_0
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 52
    .line 53
    .line 54
    const/4 p1, 0x1

    .line 55
    return p1
.end method

.method public final a(Lnx2;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lu13;->f:Lc03;

    .line 2
    .line 3
    iget-object v0, v0, Lc03;->c:Lhv1;

    .line 4
    .line 5
    check-cast v0, Lu03;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lu03;->K0(Lnx2;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
