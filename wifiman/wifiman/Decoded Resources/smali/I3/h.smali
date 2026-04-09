.class public final LI3/h;
.super Lt3/a;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/g;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LI3/h;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lcom/google/android/gms/common/api/Status;

.field private final b:LI3/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LI3/q;

    invoke-direct {v0}, LI3/q;-><init>()V

    sput-object v0, LI3/h;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/common/api/Status;LI3/i;)V
    .locals 0

    invoke-direct {p0}, Lt3/a;-><init>()V

    iput-object p1, p0, LI3/h;->a:Lcom/google/android/gms/common/api/Status;

    iput-object p2, p0, LI3/h;->b:LI3/i;

    return-void
.end method


# virtual methods
.method public b()LI3/i;
    .locals 1

    iget-object v0, p0, LI3/h;->b:LI3/i;

    return-object v0
.end method

.method public e()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, LI3/h;->a:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lt3/b;->a(Landroid/os/Parcel;)I

    move-result v0

    invoke-virtual {p0}, LI3/h;->e()Lcom/google/android/gms/common/api/Status;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Lt3/b;->p(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v1, 0x2

    invoke-virtual {p0}, LI3/h;->b()LI3/i;

    move-result-object v2

    invoke-static {p1, v1, v2, p2, v3}, Lt3/b;->p(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Lt3/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method
