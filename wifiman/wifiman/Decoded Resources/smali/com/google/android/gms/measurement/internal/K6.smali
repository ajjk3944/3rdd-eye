.class public final Lcom/google/android/gms/measurement/internal/K6;
.super Lt3/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/measurement/internal/K6;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:J

.field public final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/measurement/internal/J6;

    invoke-direct {v0}, Lcom/google/android/gms/measurement/internal/J6;-><init>()V

    sput-object v0, Lcom/google/android/gms/measurement/internal/K6;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;JI)V
    .locals 0

    invoke-direct {p0}, Lt3/a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/K6;->a:Ljava/lang/String;

    iput-wide p2, p0, Lcom/google/android/gms/measurement/internal/K6;->b:J

    iput p4, p0, Lcom/google/android/gms/measurement/internal/K6;->c:I

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Lt3/b;->a(Landroid/os/Parcel;)I

    move-result p2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/K6;->a:Ljava/lang/String;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {p1, v2, v0, v1}, Lt3/b;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x2

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/K6;->b:J

    invoke-static {p1, v0, v1, v2}, Lt3/b;->n(Landroid/os/Parcel;IJ)V

    const/4 v0, 0x3

    iget v1, p0, Lcom/google/android/gms/measurement/internal/K6;->c:I

    invoke-static {p1, v0, v1}, Lt3/b;->k(Landroid/os/Parcel;II)V

    invoke-static {p1, p2}, Lt3/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method
