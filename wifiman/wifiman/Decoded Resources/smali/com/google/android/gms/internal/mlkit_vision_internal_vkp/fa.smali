.class final Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/fa;
.super Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/da;
.source "SourceFile"


# instance fields
.field private final c:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ha;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ha;I)V
    .locals 1

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-direct {p0, v0, p2}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/da;-><init>(II)V

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/fa;->c:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ha;

    return-void
.end method


# virtual methods
.method protected final a(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/fa;->c:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ha;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
