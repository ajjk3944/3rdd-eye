.class public Lcom/google/mlkit/vision/vkp/VkpRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getComponents()Ljava/util/List;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ha;->v()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ha;

    move-result-object v0

    return-object v0
.end method
