.class final Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/P1;
.super Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/O1;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/O1;-><init>()V

    return-void
.end method


# virtual methods
.method final a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Y1;

    iget-object p1, p1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Y1;->zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/S1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/S1;->g()V

    return-void
.end method

.method final b(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/k3;Ljava/util/Map$Entry;)V
    .locals 0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lf/d;->a(Ljava/lang/Object;)V

    sget-object p1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/i3;->zza:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/i3;

    const/4 p1, 0x0

    throw p1
.end method
