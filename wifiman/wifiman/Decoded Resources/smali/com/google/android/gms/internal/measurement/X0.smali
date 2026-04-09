.class public final Lcom/google/android/gms/internal/measurement/X0;
.super Lcom/google/android/gms/internal/measurement/Y;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/V0;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback"

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/Y;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final Y()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/Y;->b()Landroid/os/Parcel;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/measurement/Y;->n0(ILandroid/os/Parcel;)V

    return-void
.end method
