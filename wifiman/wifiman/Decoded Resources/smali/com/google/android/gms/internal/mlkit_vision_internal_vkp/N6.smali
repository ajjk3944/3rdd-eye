.class public final Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/N6;
.super Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/A2;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/N6;


# instance fields
.field private zzd:I

.field private zze:I

.field private zzf:I

.field private zzg:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/N6;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/N6;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/N6;->zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/N6;

    const-class v1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/N6;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->p(Ljava/lang/Class;Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/N6;->zzg:Ljava/lang/String;

    return-void
.end method

.method static synthetic A()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/N6;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/N6;->zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/N6;

    return-object v0
.end method


# virtual methods
.method protected final v(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

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
    sget-object p1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/N6;->zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/N6;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/M6;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/M6;-><init>(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/L6;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/N6;

    invoke-direct {p1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/N6;-><init>()V

    return-object p1

    :cond_3
    const-string p1, "zzf"

    const-string p2, "zzg"

    const-string p3, "zzd"

    const-string v0, "zze"

    filled-new-array {p3, v0, p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/N6;->zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/N6;

    const-string p3, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u0208"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->m(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/z2;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
