.class public final LN3/g;
.super LA3/a;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.signin.internal.ISignInService"

    invoke-direct {p0, p1, v0}, LA3/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final n0(LN3/j;LN3/f;)V
    .locals 1

    invoke-virtual {p0}, LA3/a;->b()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LA3/c;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p2}, LA3/c;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0xc

    invoke-virtual {p0, p1, v0}, LA3/a;->c(ILandroid/os/Parcel;)V

    return-void
.end method
