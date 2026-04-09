.class public final Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ba;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Z9;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Z9;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/R9;->b:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/S9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ba;->a:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Z9;

    return-void
.end method

.method public static a(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ba;
    .locals 2

    new-instance p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ba;

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Z9;

    const-string v1, "#vk "

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Z9;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ba;-><init>(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Z9;)V

    return-object p0
.end method


# virtual methods
.method public final b(Ljava/lang/CharSequence;)Ljava/util/List;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ba;->a:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Z9;

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Y9;

    invoke-direct {v1, v0, p0, p1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Y9;-><init>(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Z9;Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ba;Ljava/lang/CharSequence;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
