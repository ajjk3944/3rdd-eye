.class public final Lcom/google/android/gms/measurement/internal/N6;
.super Lt3/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/measurement/internal/N6;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:J

.field public b:[B

.field public final c:Ljava/lang/String;

.field public final d:Landroid/os/Bundle;

.field private final e:I

.field public final f:J

.field public g:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/measurement/internal/R6;

    invoke-direct {v0}, Lcom/google/android/gms/measurement/internal/R6;-><init>()V

    sput-object v0, Lcom/google/android/gms/measurement/internal/N6;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(J[BLjava/lang/String;Landroid/os/Bundle;IJ)V
    .locals 10

    .line 1
    const-string v9, ""

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move/from16 v6, p6

    move-wide/from16 v7, p7

    invoke-direct/range {v0 .. v9}, Lcom/google/android/gms/measurement/internal/N6;-><init>(J[BLjava/lang/String;Landroid/os/Bundle;IJLjava/lang/String;)V

    return-void
.end method

.method constructor <init>(J[BLjava/lang/String;Landroid/os/Bundle;IJLjava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lt3/a;-><init>()V

    .line 3
    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/N6;->a:J

    .line 4
    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/N6;->b:[B

    .line 5
    iput-object p4, p0, Lcom/google/android/gms/measurement/internal/N6;->c:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lcom/google/android/gms/measurement/internal/N6;->d:Landroid/os/Bundle;

    .line 7
    iput p6, p0, Lcom/google/android/gms/measurement/internal/N6;->e:I

    .line 8
    iput-wide p7, p0, Lcom/google/android/gms/measurement/internal/N6;->f:J

    .line 9
    iput-object p9, p0, Lcom/google/android/gms/measurement/internal/N6;->g:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 5

    invoke-static {p1}, Lt3/b;->a(Landroid/os/Parcel;)I

    move-result p2

    const/4 v0, 0x1

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/N6;->a:J

    invoke-static {p1, v0, v1, v2}, Lt3/b;->n(Landroid/os/Parcel;IJ)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/N6;->b:[B

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Lt3/b;->f(Landroid/os/Parcel;I[BZ)V

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/N6;->c:Ljava/lang/String;

    invoke-static {p1, v0, v1, v2}, Lt3/b;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x4

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/N6;->d:Landroid/os/Bundle;

    invoke-static {p1, v0, v1, v2}, Lt3/b;->e(Landroid/os/Parcel;ILandroid/os/Bundle;Z)V

    const/4 v0, 0x5

    iget v1, p0, Lcom/google/android/gms/measurement/internal/N6;->e:I

    invoke-static {p1, v0, v1}, Lt3/b;->k(Landroid/os/Parcel;II)V

    const/4 v0, 0x6

    iget-wide v3, p0, Lcom/google/android/gms/measurement/internal/N6;->f:J

    invoke-static {p1, v0, v3, v4}, Lt3/b;->n(Landroid/os/Parcel;IJ)V

    const/4 v0, 0x7

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/N6;->g:Ljava/lang/String;

    invoke-static {p1, v0, v1, v2}, Lt3/b;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-static {p1, p2}, Lt3/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method
