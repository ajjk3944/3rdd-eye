.class final Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/X2;
.super Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/V2;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/V2;-><init>()V

    return-void
.end method


# virtual methods
.method final bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;

    iget-object v0, p1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->zzc:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W2;

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W2;->c()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W2;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W2;->f()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W2;

    move-result-object v0

    iput-object v0, p1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->zzc:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W2;

    :cond_0
    return-object v0
.end method

.method final bridge synthetic b(Ljava/lang/Object;ILcom/google/android/gms/internal/mlkit_vision_internal_vkp/B1;)V
    .locals 0

    shl-int/lit8 p2, p2, 0x3

    check-cast p1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W2;

    or-int/lit8 p2, p2, 0x2

    invoke-virtual {p1, p2, p3}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W2;->j(ILjava/lang/Object;)V

    return-void
.end method

.method final bridge synthetic c(Ljava/lang/Object;IJ)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W2;

    shl-int/lit8 p2, p2, 0x3

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W2;->j(ILjava/lang/Object;)V

    return-void
.end method

.method final d(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;

    iget-object p1, p1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->zzc:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W2;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W2;->h()V

    return-void
.end method

.method final synthetic e(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W2;

    check-cast p1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;

    iput-object p2, p1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->zzc:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W2;

    return-void
.end method
