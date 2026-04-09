.class public abstract Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Y1;
.super Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/A2;


# instance fields
.field protected zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/S1;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/S1;->e()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/S1;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Y1;->zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/S1;

    return-void
.end method


# virtual methods
.method final A()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/S1;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Y1;->zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/S1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/S1;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Y1;->zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/S1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/S1;->d()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/S1;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Y1;->zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/S1;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Y1;->zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/S1;

    return-object v0
.end method
