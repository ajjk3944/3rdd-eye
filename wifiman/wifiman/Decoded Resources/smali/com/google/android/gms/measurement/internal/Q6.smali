.class public final Lcom/google/android/gms/measurement/internal/Q6;
.super Lt3/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/measurement/internal/Q6;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/measurement/internal/T6;

    invoke-direct {v0}, Lcom/google/android/gms/measurement/internal/T6;-><init>()V

    sput-object v0, Lcom/google/android/gms/measurement/internal/Q6;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Lt3/a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/Q6;->a:Ljava/util/List;

    return-void
.end method

.method public static varargs b([Lcom/google/android/gms/measurement/internal/s5;)Lcom/google/android/gms/measurement/internal/Q6;
    .locals 4

    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p0, v2

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/s5;->zza()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance p0, Lcom/google/android/gms/measurement/internal/Q6;

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/Q6;-><init>(Ljava/util/List;)V

    return-object p0
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Lt3/b;->a(Landroid/os/Parcel;)I

    move-result p2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/Q6;->a:Ljava/util/List;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {p1, v2, v0, v1}, Lt3/b;->m(Landroid/os/Parcel;ILjava/util/List;Z)V

    invoke-static {p1, p2}, Lt3/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method
