.class public final Lcom/google/android/libraries/vision/visionkit/pipeline/l;
.super Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/A2;


# static fields
.field private static final zzb:Lcom/google/android/libraries/vision/visionkit/pipeline/l;


# instance fields
.field private zzd:I

.field private zze:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/qa;

.field private zzf:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/y;

.field private zzg:Z

.field private zzh:Ljava/lang/String;

.field private zzi:B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/libraries/vision/visionkit/pipeline/l;

    invoke-direct {v0}, Lcom/google/android/libraries/vision/visionkit/pipeline/l;-><init>()V

    sput-object v0, Lcom/google/android/libraries/vision/visionkit/pipeline/l;->zzb:Lcom/google/android/libraries/vision/visionkit/pipeline/l;

    const-class v1, Lcom/google/android/libraries/vision/visionkit/pipeline/l;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->p(Ljava/lang/Class;Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/l;->zzi:B

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/l;->zzh:Ljava/lang/String;

    return-void
.end method

.method static synthetic A()Lcom/google/android/libraries/vision/visionkit/pipeline/l;
    .locals 1

    sget-object v0, Lcom/google/android/libraries/vision/visionkit/pipeline/l;->zzb:Lcom/google/android/libraries/vision/visionkit/pipeline/l;

    return-object v0
.end method


# virtual methods
.method protected final v(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    add-int/lit8 p1, p1, -0x1

    if-eqz p1, :cond_5

    const/4 p3, 0x2

    if-eq p1, p3, :cond_4

    const/4 p3, 0x3

    if-eq p1, p3, :cond_3

    const/4 p3, 0x4

    const/4 v0, 0x0

    if-eq p1, p3, :cond_2

    const/4 p3, 0x5

    if-eq p1, p3, :cond_1

    if-nez p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    :goto_0
    iput-byte p1, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/l;->zzi:B

    return-object v0

    :cond_1
    sget-object p1, Lcom/google/android/libraries/vision/visionkit/pipeline/l;->zzb:Lcom/google/android/libraries/vision/visionkit/pipeline/l;

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/libraries/vision/visionkit/pipeline/k;

    invoke-direct {p1, v0}, Lcom/google/android/libraries/vision/visionkit/pipeline/k;-><init>(Lcom/google/android/libraries/vision/visionkit/pipeline/j;)V

    return-object p1

    :cond_3
    new-instance p1, Lcom/google/android/libraries/vision/visionkit/pipeline/l;

    invoke-direct {p1}, Lcom/google/android/libraries/vision/visionkit/pipeline/l;-><init>()V

    return-object p1

    :cond_4
    const-string p1, "zzg"

    const-string p2, "zzh"

    const-string p3, "zzd"

    const-string v0, "zze"

    const-string v1, "zzf"

    filled-new-array {p3, v0, v1, p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lcom/google/android/libraries/vision/visionkit/pipeline/l;->zzb:Lcom/google/android/libraries/vision/visionkit/pipeline/l;

    const-string p3, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001\u1009\u0000\u0002\u1409\u0001\u0003\u1007\u0002\u0004\u1008\u0003"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->m(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/z2;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/l;->zzi:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
