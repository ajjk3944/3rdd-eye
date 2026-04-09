.class public final Ls3/Q;
.super LB3/a;
.source "SourceFile"

# interfaces
.implements Ls3/T;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.common.internal.IGoogleCertificatesApi"

    invoke-direct {p0, p1, v0}, LB3/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final C(Lr3/D;Lx3/a;)Z
    .locals 1

    invoke-virtual {p0}, LB3/a;->c()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LB3/d;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p2}, LB3/d;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/4 p1, 0x5

    invoke-virtual {p0, p1, v0}, LB3/a;->b(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object p1

    invoke-static {p1}, LB3/d;->e(Landroid/os/Parcel;)Z

    move-result p2

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    return p2
.end method

.method public final j(Lr3/z;)Lr3/B;
    .locals 1

    invoke-virtual {p0}, LB3/a;->c()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LB3/d;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/16 p1, 0x8

    invoke-virtual {p0, p1, v0}, LB3/a;->b(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object p1

    sget-object v0, Lr3/B;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p1, v0}, LB3/d;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lr3/B;

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    return-object v0
.end method

.method public final w(Lr3/z;)Lr3/B;
    .locals 1

    invoke-virtual {p0}, LB3/a;->c()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LB3/d;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 p1, 0x6

    invoke-virtual {p0, p1, v0}, LB3/a;->b(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object p1

    sget-object v0, Lr3/B;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p1, v0}, LB3/d;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lr3/B;

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    return-object v0
.end method

.method public final zzi()Z
    .locals 2

    const/4 v0, 0x7

    invoke-virtual {p0}, LB3/a;->c()Landroid/os/Parcel;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, LB3/a;->b(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0}, LB3/d;->e(Landroid/os/Parcel;)Z

    move-result v1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return v1
.end method
