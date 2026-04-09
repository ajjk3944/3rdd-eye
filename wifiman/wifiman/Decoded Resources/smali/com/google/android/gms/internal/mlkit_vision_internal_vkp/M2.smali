.class final Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/M2;
.super Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/T2;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/T2;-><init>(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/S2;)V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/T2;->l()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/T2;->e()I

    move-result v0

    const/4 v1, 0x0

    if-gtz v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/T2;->f()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lf/d;->a(Ljava/lang/Object;)V

    throw v1

    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/T2;->i(I)Ljava/util/Map$Entry;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/N2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/N2;->a()Ljava/lang/Comparable;

    move-result-object v0

    invoke-static {v0}, Lf/d;->a(Ljava/lang/Object;)V

    throw v1

    :cond_2
    :goto_0
    invoke-super {p0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/T2;->b()V

    return-void
.end method
