.class public final Lcom/google/android/gms/measurement/internal/h;
.super Lt3/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/measurement/internal/h;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:J

.field public final b:I

.field public final c:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/measurement/internal/g;

    invoke-direct {v0}, Lcom/google/android/gms/measurement/internal/g;-><init>()V

    sput-object v0, Lcom/google/android/gms/measurement/internal/h;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(JIJ)V
    .locals 0

    invoke-direct {p0}, Lt3/a;-><init>()V

    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/h;->a:J

    iput p3, p0, Lcom/google/android/gms/measurement/internal/h;->b:I

    iput-wide p4, p0, Lcom/google/android/gms/measurement/internal/h;->c:J

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Lt3/b;->a(Landroid/os/Parcel;)I

    move-result p2

    const/4 v0, 0x1

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/h;->a:J

    invoke-static {p1, v0, v1, v2}, Lt3/b;->n(Landroid/os/Parcel;IJ)V

    const/4 v0, 0x2

    iget v1, p0, Lcom/google/android/gms/measurement/internal/h;->b:I

    invoke-static {p1, v0, v1}, Lt3/b;->k(Landroid/os/Parcel;II)V

    const/4 v0, 0x3

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/h;->c:J

    invoke-static {p1, v0, v1, v2}, Lt3/b;->n(Landroid/os/Parcel;IJ)V

    invoke-static {p1, p2}, Lt3/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method
