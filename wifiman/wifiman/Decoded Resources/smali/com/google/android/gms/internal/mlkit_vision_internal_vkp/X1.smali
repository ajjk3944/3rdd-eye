.class public abstract Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/X1;
.super Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W1;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/A2;


# direct methods
.method protected constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Y1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W1;-><init>(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic f()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/X1;->h()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Y1;

    move-result-object v0

    return-object v0
.end method

.method public final h()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Y1;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W1;->b:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;

    check-cast v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Y1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->u()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W1;->b:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;

    check-cast v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Y1;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W1;->b:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;

    check-cast v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Y1;

    iget-object v0, v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Y1;->zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/S1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/S1;->g()V

    invoke-super {p0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W1;->f()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Y1;

    return-object v0
.end method

.method public final bridge synthetic s()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/z2;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/X1;->h()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Y1;

    move-result-object v0

    return-object v0
.end method
