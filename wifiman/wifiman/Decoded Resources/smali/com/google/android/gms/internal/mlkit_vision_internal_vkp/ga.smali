.class final Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ga;
.super Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ha;
.source "SourceFile"


# instance fields
.field final transient c:I

.field final transient d:I

.field final synthetic e:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ha;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ha;II)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ga;->e:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ha;

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ha;-><init>()V

    iput p2, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ga;->c:I

    iput p3, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ga;->d:I

    return-void
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ga;->d:I

    const-string v1, "index"

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W9;->a(IILjava/lang/String;)I

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ga;->e:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ha;

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ga;->c:I

    add-int/2addr p1, v1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method final j()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ga;->e:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ha;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ea;->m()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ga;->c:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ga;->d:I

    add-int/2addr v0, v1

    return v0
.end method

.method final m()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ga;->e:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ha;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ea;->m()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ga;->c:I

    add-int/2addr v0, v1

    return v0
.end method

.method final o()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ga;->e:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ha;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ea;->o()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final s(II)Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ha;
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ga;->d:I

    invoke-static {p1, p2, v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W9;->c(III)V

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ga;->c:I

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ga;->e:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ha;

    add-int/2addr p1, v0

    add-int/2addr p2, v0

    invoke-virtual {v1, p1, p2}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ha;->s(II)Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ha;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ga;->d:I

    return v0
.end method

.method public final bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ha;->s(II)Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ha;

    move-result-object p1

    return-object p1
.end method
