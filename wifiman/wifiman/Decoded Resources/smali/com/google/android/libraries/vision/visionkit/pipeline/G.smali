.class public final Lcom/google/android/libraries/vision/visionkit/pipeline/G;
.super Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/A2;


# static fields
.field private static final zzb:Lcom/google/android/libraries/vision/visionkit/pipeline/G;


# instance fields
.field private zzd:I

.field private zze:I

.field private zzf:Ljava/lang/String;

.field private zzg:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/libraries/vision/visionkit/pipeline/G;

    invoke-direct {v0}, Lcom/google/android/libraries/vision/visionkit/pipeline/G;-><init>()V

    sput-object v0, Lcom/google/android/libraries/vision/visionkit/pipeline/G;->zzb:Lcom/google/android/libraries/vision/visionkit/pipeline/G;

    const-class v1, Lcom/google/android/libraries/vision/visionkit/pipeline/G;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->p(Ljava/lang/Class;Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/G;->zzf:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->k()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/G;->zzg:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

    return-void
.end method

.method static synthetic B()Lcom/google/android/libraries/vision/visionkit/pipeline/G;
    .locals 1

    sget-object v0, Lcom/google/android/libraries/vision/visionkit/pipeline/G;->zzb:Lcom/google/android/libraries/vision/visionkit/pipeline/G;

    return-object v0
.end method

.method public static C([BLcom/google/android/gms/internal/mlkit_vision_internal_vkp/N1;)Lcom/google/android/libraries/vision/visionkit/pipeline/G;
    .locals 1

    sget-object v0, Lcom/google/android/libraries/vision/visionkit/pipeline/G;->zzb:Lcom/google/android/libraries/vision/visionkit/pipeline/G;

    invoke-static {v0, p0, p1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->g(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;[BLcom/google/android/gms/internal/mlkit_vision_internal_vkp/N1;)Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;

    move-result-object p0

    check-cast p0, Lcom/google/android/libraries/vision/visionkit/pipeline/G;

    return-object p0
.end method


# virtual methods
.method public final A()I
    .locals 1

    iget v0, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/G;->zze:I

    return v0
.end method

.method public final D()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/G;->zzf:Ljava/lang/String;

    return-object v0
.end method

.method public final E()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/G;->zzg:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

    return-object v0
.end method

.method protected final v(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    add-int/lit8 p1, p1, -0x1

    if-eqz p1, :cond_4

    const/4 p2, 0x2

    if-eq p1, p2, :cond_3

    const/4 p2, 0x3

    if-eq p1, p2, :cond_2

    const/4 p2, 0x4

    const/4 p3, 0x0

    if-eq p1, p2, :cond_1

    const/4 p2, 0x5

    if-eq p1, p2, :cond_0

    return-object p3

    :cond_0
    sget-object p1, Lcom/google/android/libraries/vision/visionkit/pipeline/G;->zzb:Lcom/google/android/libraries/vision/visionkit/pipeline/G;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/libraries/vision/visionkit/pipeline/F;

    invoke-direct {p1, p3}, Lcom/google/android/libraries/vision/visionkit/pipeline/F;-><init>(Lcom/google/android/libraries/vision/visionkit/pipeline/E;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/libraries/vision/visionkit/pipeline/G;

    invoke-direct {p1}, Lcom/google/android/libraries/vision/visionkit/pipeline/G;-><init>()V

    return-object p1

    :cond_3
    const-string p1, "zzg"

    const-class p2, Lcom/google/android/libraries/vision/visionkit/pipeline/c;

    const-string p3, "zzd"

    const-string v0, "zze"

    const-string v1, "zzf"

    filled-new-array {p3, v0, v1, p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lcom/google/android/libraries/vision/visionkit/pipeline/G;->zzb:Lcom/google/android/libraries/vision/visionkit/pipeline/G;

    const-string p3, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u1008\u0001\u0003\u001b"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->m(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/z2;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
