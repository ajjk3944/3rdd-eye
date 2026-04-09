.class public final Ls3/q0;
.super LB3/a;
.source "SourceFile"

# interfaces
.implements Ls3/N;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.common.internal.ICertData"

    invoke-direct {p0, p1, v0}, LB3/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final zzc()I
    .locals 2

    const/4 v0, 0x2

    invoke-virtual {p0}, LB3/a;->c()Landroid/os/Parcel;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, LB3/a;->b(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return v1
.end method

.method public final zzd()Lx3/a;
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p0}, LB3/a;->c()Landroid/os/Parcel;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, LB3/a;->b(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v1

    invoke-static {v1}, Lx3/a$a;->c(Landroid/os/IBinder;)Lx3/a;

    move-result-object v1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-object v1
.end method
