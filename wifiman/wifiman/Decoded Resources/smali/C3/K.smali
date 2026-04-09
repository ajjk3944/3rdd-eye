.class public final LC3/K;
.super LC3/a;
.source "SourceFile"

# interfaces
.implements LC3/L;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"

    invoke-direct {p0, p1, v0}, LC3/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final F(LI3/n;LC3/u;)V
    .locals 1

    invoke-virtual {p0}, LC3/a;->b()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LC3/j;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p2}, LC3/j;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/16 p1, 0x5b

    invoke-virtual {p0, p1, v0}, LC3/a;->f(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final L(Ljava/lang/String;)Lcom/google/android/gms/location/LocationAvailability;
    .locals 1

    invoke-virtual {p0}, LC3/a;->b()Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    const/16 p1, 0x22

    invoke-virtual {p0, p1, v0}, LC3/a;->c(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object p1

    sget-object v0, Lcom/google/android/gms/location/LocationAvailability;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p1, v0}, LC3/j;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/location/LocationAvailability;

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    return-object v0
.end method

.method public final R(LI3/d;LC3/P;)V
    .locals 1

    invoke-virtual {p0}, LC3/a;->b()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LC3/j;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p2}, LC3/j;->c(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0x52

    invoke-virtual {p0, p1, v0}, LC3/a;->f(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final S(LI3/f;LC3/c;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0}, LC3/a;->b()Landroid/os/Parcel;

    move-result-object p3

    invoke-static {p3, p1}, LC3/j;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {p3, p2}, LC3/j;->c(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/4 p1, 0x0

    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    const/16 p1, 0x3f

    invoke-virtual {p0, p1, p3}, LC3/a;->f(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final e0(LI3/d;LC3/u;)V
    .locals 1

    invoke-virtual {p0}, LC3/a;->b()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LC3/j;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p2}, LC3/j;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/16 p1, 0x5a

    invoke-virtual {p0, p1, v0}, LC3/a;->f(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final zzs()Landroid/location/Location;
    .locals 2

    const/4 v0, 0x7

    invoke-virtual {p0}, LC3/a;->b()Landroid/os/Parcel;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, LC3/a;->c(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object v0

    sget-object v1, Landroid/location/Location;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v1}, LC3/j;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Landroid/location/Location;

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-object v1
.end method
