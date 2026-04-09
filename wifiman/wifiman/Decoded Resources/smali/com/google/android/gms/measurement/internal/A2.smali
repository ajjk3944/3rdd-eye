.class public final Lcom/google/android/gms/measurement/internal/A2;
.super Lcom/google/android/gms/internal/measurement/Y;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/measurement/internal/y2;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.measurement.internal.IUploadBatchesCallback"

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/Y;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final k(Lcom/google/android/gms/measurement/internal/S6;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/Y;->b()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/a0;->d(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 p1, 0x2

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/Y;->n0(ILandroid/os/Parcel;)V

    return-void
.end method
