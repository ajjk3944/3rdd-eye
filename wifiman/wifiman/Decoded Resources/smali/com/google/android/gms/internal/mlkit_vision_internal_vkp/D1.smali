.class final Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/D1;
.super Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/F1;
.source "SourceFile"


# instance fields
.field private final c:[B

.field private d:I

.field private e:I

.field private f:I

.field private final g:I

.field private h:I


# direct methods
.method synthetic constructor <init>([BIIZLcom/google/android/gms/internal/mlkit_vision_internal_vkp/C1;)V
    .locals 0

    const/4 p2, 0x0

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/F1;-><init>(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/E1;)V

    const p2, 0x7fffffff

    iput p2, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/D1;->h:I

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/D1;->c:[B

    iput p3, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/D1;->d:I

    const/4 p1, 0x0

    iput p1, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/D1;->f:I

    iput p1, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/D1;->g:I

    return-void
.end method

.method private final d()V
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/D1;->d:I

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/D1;->e:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/D1;->d:I

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/D1;->h:I

    if-le v0, v1, :cond_0

    sub-int v1, v0, v1

    iput v1, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/D1;->e:I

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/D1;->d:I

    return-void

    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/D1;->e:I

    return-void
.end method


# virtual methods
.method public final e(I)I
    .locals 1

    if-ltz p1, :cond_2

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/D1;->f:I

    add-int/2addr p1, v0

    if-ltz p1, :cond_1

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/D1;->h:I

    if-gt p1, v0, :cond_0

    iput p1, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/D1;->h:I

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/D1;->d()V

    return v0

    :cond_0
    new-instance p1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzbew;

    const-string v0, "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzbew;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzbew;

    const-string v0, "Failed to parse the message."

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzbew;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzbew;

    const-string v0, "CodedInputStream encountered an embedded string or message which claimed to have negative size."

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzbew;-><init>(Ljava/lang/String;)V

    throw p1
.end method
