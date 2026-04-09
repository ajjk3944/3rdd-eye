.class public abstract Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W1;
.super Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/i1;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;

.field protected b:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;


# direct methods
.method protected constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/i1;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W1;->a:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->u()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->f()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W1;->b:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Default instance must be immutable."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W1;->e()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W1;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W1;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W1;->a:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->v(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W1;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W1;->f()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W1;->b:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;

    return-object v0
.end method

.method public f()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W1;->b:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->u()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W1;->b:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W1;->b:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->n()V

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W1;->b:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;

    return-object v0
.end method

.method public bridge synthetic s()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/z2;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W1;->f()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;

    move-result-object v0

    return-object v0
.end method
