.class public final Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/s2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/r2;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/i3;Ljava/lang/Object;Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/i3;Ljava/lang/Object;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/r2;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/r2;-><init>(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/i3;Ljava/lang/Object;Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/i3;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/s2;->a:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/r2;

    return-void
.end method

.method static b(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/r2;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/r2;->a:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/i3;

    iget-object p0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/r2;->c:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/i3;

    const/4 v1, 0x1

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/S1;->a(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/i3;ILjava/lang/Object;)I

    move-result p1

    const/4 v0, 0x2

    invoke-static {p0, v0, p2}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/S1;->a(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/i3;ILjava/lang/Object;)I

    move-result p0

    add-int/2addr p1, p0

    return p1
.end method

.method public static d(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/i3;Ljava/lang/Object;Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/i3;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/s2;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/s2;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/s2;-><init>(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/i3;Ljava/lang/Object;Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/i3;Ljava/lang/Object;)V

    return-object v0
.end method

.method static e(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/I1;Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/r2;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/r2;->a:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/i3;

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, p2}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/S1;->j(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/I1;Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/i3;ILjava/lang/Object;)V

    iget-object p1, p1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/r2;->c:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/i3;

    const/4 p2, 0x2

    invoke-static {p0, p1, p2, p3}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/S1;->j(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/I1;Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/i3;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/s2;->a:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/r2;

    shl-int/lit8 p1, p1, 0x3

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/I1;->f(I)I

    move-result p1

    invoke-static {v0, p2, p3}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/s2;->b(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/r2;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p2

    invoke-static {p2}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/I1;->f(I)I

    move-result p3

    add-int/2addr p3, p2

    add-int/2addr p1, p3

    return p1
.end method

.method final c()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/r2;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/s2;->a:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/r2;

    return-object v0
.end method
