.class final Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/P2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field private a:I

.field private b:Z

.field private c:Ljava/util/Iterator;

.field final synthetic d:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/T2;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/T2;Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/O2;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/P2;->d:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/T2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, -0x1

    iput p1, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/P2;->a:I

    return-void
.end method

.method private final a()Ljava/util/Iterator;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/P2;->c:Ljava/util/Iterator;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/P2;->d:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/T2;

    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/T2;->j(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/T2;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/P2;->c:Ljava/util/Iterator;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/P2;->c:Ljava/util/Iterator;

    return-object v0
.end method


# virtual methods
.method public final hasNext()Z
    .locals 4

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/P2;->a:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/P2;->d:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/T2;

    invoke-static {v2}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/T2;->d(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/T2;)I

    move-result v3

    if-lt v0, v3, :cond_2

    invoke-static {v2}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/T2;->j(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/T2;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/P2;->a()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return v2

    :cond_1
    move v1, v2

    :cond_2
    :goto_0
    return v1
.end method

.method public final bridge synthetic next()Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/P2;->b:Z

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/P2;->a:I

    add-int/2addr v1, v0

    iput v1, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/P2;->a:I

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/P2;->d:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/T2;

    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/T2;->d(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/T2;)I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/T2;->n(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/T2;)[Ljava/lang/Object;

    move-result-object v0

    aget-object v0, v0, v1

    check-cast v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/N2;

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/P2;->a()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    :goto_0
    return-object v0
.end method

.method public final remove()V
    .locals 3

    iget-boolean v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/P2;->b:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/P2;->b:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/P2;->d:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/T2;

    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/T2;->k(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/T2;)V

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/P2;->a:I

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/P2;->d:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/T2;

    invoke-static {v1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/T2;->d(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/T2;)I

    move-result v2

    if-ge v0, v2, :cond_0

    add-int/lit8 v2, v0, -0x1

    iput v2, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/P2;->a:I

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/T2;->g(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/T2;I)Ljava/lang/Object;

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/P2;->a()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "remove() was called before next()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
