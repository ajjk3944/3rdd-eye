.class public final Lcom/google/android/gms/measurement/internal/j;
.super Lt3/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/measurement/internal/j;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Lcom/google/android/gms/measurement/internal/r7;

.field public d:J

.field public e:Z

.field public f:Ljava/lang/String;

.field public g:Lcom/google/android/gms/measurement/internal/L;

.field public h:J

.field public i:Lcom/google/android/gms/measurement/internal/L;

.field public j:J

.field public k:Lcom/google/android/gms/measurement/internal/L;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/measurement/internal/i;

    invoke-direct {v0}, Lcom/google/android/gms/measurement/internal/i;-><init>()V

    sput-object v0, Lcom/google/android/gms/measurement/internal/j;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/measurement/internal/j;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lt3/a;-><init>()V

    .line 2
    invoke-static {p1}, Ls3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/j;->a:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/j;->a:Ljava/lang/String;

    .line 4
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/j;->b:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/j;->b:Ljava/lang/String;

    .line 5
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/j;->c:Lcom/google/android/gms/measurement/internal/r7;

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/j;->c:Lcom/google/android/gms/measurement/internal/r7;

    .line 6
    iget-wide v0, p1, Lcom/google/android/gms/measurement/internal/j;->d:J

    iput-wide v0, p0, Lcom/google/android/gms/measurement/internal/j;->d:J

    .line 7
    iget-boolean v0, p1, Lcom/google/android/gms/measurement/internal/j;->e:Z

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/j;->e:Z

    .line 8
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/j;->f:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/j;->f:Ljava/lang/String;

    .line 9
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/j;->g:Lcom/google/android/gms/measurement/internal/L;

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/j;->g:Lcom/google/android/gms/measurement/internal/L;

    .line 10
    iget-wide v0, p1, Lcom/google/android/gms/measurement/internal/j;->h:J

    iput-wide v0, p0, Lcom/google/android/gms/measurement/internal/j;->h:J

    .line 11
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/j;->i:Lcom/google/android/gms/measurement/internal/L;

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/j;->i:Lcom/google/android/gms/measurement/internal/L;

    .line 12
    iget-wide v0, p1, Lcom/google/android/gms/measurement/internal/j;->j:J

    iput-wide v0, p0, Lcom/google/android/gms/measurement/internal/j;->j:J

    .line 13
    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/j;->k:Lcom/google/android/gms/measurement/internal/L;

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/j;->k:Lcom/google/android/gms/measurement/internal/L;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/r7;JZLjava/lang/String;Lcom/google/android/gms/measurement/internal/L;JLcom/google/android/gms/measurement/internal/L;JLcom/google/android/gms/measurement/internal/L;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Lt3/a;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/j;->a:Ljava/lang/String;

    .line 16
    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/j;->b:Ljava/lang/String;

    .line 17
    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/j;->c:Lcom/google/android/gms/measurement/internal/r7;

    .line 18
    iput-wide p4, p0, Lcom/google/android/gms/measurement/internal/j;->d:J

    .line 19
    iput-boolean p6, p0, Lcom/google/android/gms/measurement/internal/j;->e:Z

    .line 20
    iput-object p7, p0, Lcom/google/android/gms/measurement/internal/j;->f:Ljava/lang/String;

    .line 21
    iput-object p8, p0, Lcom/google/android/gms/measurement/internal/j;->g:Lcom/google/android/gms/measurement/internal/L;

    .line 22
    iput-wide p9, p0, Lcom/google/android/gms/measurement/internal/j;->h:J

    .line 23
    iput-object p11, p0, Lcom/google/android/gms/measurement/internal/j;->i:Lcom/google/android/gms/measurement/internal/L;

    .line 24
    iput-wide p12, p0, Lcom/google/android/gms/measurement/internal/j;->j:J

    .line 25
    iput-object p14, p0, Lcom/google/android/gms/measurement/internal/j;->k:Lcom/google/android/gms/measurement/internal/L;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 6

    invoke-static {p1}, Lt3/b;->a(Landroid/os/Parcel;)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/j;->a:Ljava/lang/String;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, v3}, Lt3/b;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/j;->b:Ljava/lang/String;

    invoke-static {p1, v1, v2, v3}, Lt3/b;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/j;->c:Lcom/google/android/gms/measurement/internal/r7;

    invoke-static {p1, v1, v2, p2, v3}, Lt3/b;->p(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v1, 0x5

    iget-wide v4, p0, Lcom/google/android/gms/measurement/internal/j;->d:J

    invoke-static {p1, v1, v4, v5}, Lt3/b;->n(Landroid/os/Parcel;IJ)V

    const/4 v1, 0x6

    iget-boolean v2, p0, Lcom/google/android/gms/measurement/internal/j;->e:Z

    invoke-static {p1, v1, v2}, Lt3/b;->c(Landroid/os/Parcel;IZ)V

    const/4 v1, 0x7

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/j;->f:Ljava/lang/String;

    invoke-static {p1, v1, v2, v3}, Lt3/b;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 v1, 0x8

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/j;->g:Lcom/google/android/gms/measurement/internal/L;

    invoke-static {p1, v1, v2, p2, v3}, Lt3/b;->p(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0x9

    iget-wide v4, p0, Lcom/google/android/gms/measurement/internal/j;->h:J

    invoke-static {p1, v1, v4, v5}, Lt3/b;->n(Landroid/os/Parcel;IJ)V

    const/16 v1, 0xa

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/j;->i:Lcom/google/android/gms/measurement/internal/L;

    invoke-static {p1, v1, v2, p2, v3}, Lt3/b;->p(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0xb

    iget-wide v4, p0, Lcom/google/android/gms/measurement/internal/j;->j:J

    invoke-static {p1, v1, v4, v5}, Lt3/b;->n(Landroid/os/Parcel;IJ)V

    const/16 v1, 0xc

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/j;->k:Lcom/google/android/gms/measurement/internal/L;

    invoke-static {p1, v1, v2, p2, v3}, Lt3/b;->p(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Lt3/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method
