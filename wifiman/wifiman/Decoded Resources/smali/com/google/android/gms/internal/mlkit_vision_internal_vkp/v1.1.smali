.class final Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/v1;
.super Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/A1;
.source "SourceFile"


# instance fields
.field private final d:I

.field private final e:I


# direct methods
.method constructor <init>([BII)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/A1;-><init>([B)V

    add-int v0, p2, p3

    array-length p1, p1

    invoke-static {p2, v0, p1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/B1;->y(III)I

    iput p2, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/v1;->d:I

    iput p3, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/v1;->e:I

    return-void
.end method


# virtual methods
.method protected final T()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/v1;->d:I

    return v0
.end method

.method public final g(I)B
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/v1;->e:I

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/B1;->S(II)V

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/A1;->c:[B

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/v1;->d:I

    add-int/2addr v1, p1

    aget-byte p1, v0, v1

    return p1
.end method

.method final j(I)B
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/v1;->d:I

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/A1;->c:[B

    add-int/2addr v0, p1

    aget-byte p1, v1, v0

    return p1
.end method

.method public final m()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/v1;->e:I

    return v0
.end method
