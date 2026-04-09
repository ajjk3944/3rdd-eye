.class public final Lcom/google/android/play/integrity/internal/t;
.super Lcom/google/android/play/integrity/internal/a;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/play/integrity/internal/v;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string/jumbo v0, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService"

    invoke-direct {p0, p1, v0}, Lcom/google/android/play/integrity/internal/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final M(Landroid/os/Bundle;Lcom/google/android/play/integrity/internal/x;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/play/integrity/internal/a;->b()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/android/play/integrity/internal/p;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    const/4 p1, 0x2

    invoke-virtual {p0, p1, v0}, Lcom/google/android/play/integrity/internal/a;->c(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final V(Landroid/os/Bundle;Lcom/google/android/play/integrity/internal/x;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/play/integrity/internal/a;->b()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/android/play/integrity/internal/p;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    const/4 p1, 0x3

    invoke-virtual {p0, p1, v0}, Lcom/google/android/play/integrity/internal/a;->c(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final d(Landroid/os/Bundle;Lcom/google/android/play/integrity/internal/E;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/play/integrity/internal/a;->b()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/android/play/integrity/internal/p;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    const/4 p1, 0x6

    invoke-virtual {p0, p1, v0}, Lcom/google/android/play/integrity/internal/a;->c(ILandroid/os/Parcel;)V

    return-void
.end method
