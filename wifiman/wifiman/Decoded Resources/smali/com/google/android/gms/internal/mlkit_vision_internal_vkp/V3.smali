.class public final Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/V3;
.super Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/A2;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/V3;


# instance fields
.field private zzd:I

.field private zze:I

.field private zzf:I

.field private zzg:I

.field private zzh:I

.field private zzi:I

.field private zzj:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

.field private zzk:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/V3;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/V3;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/V3;->zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/V3;

    const-class v1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/V3;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->p(Ljava/lang/Class;Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->k()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/V3;->zzj:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->k()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/V3;->zzk:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

    return-void
.end method

.method static synthetic A()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/V3;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/V3;->zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/V3;

    return-object v0
.end method


# virtual methods
.method protected final v(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

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
    sget-object p1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/V3;->zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/V3;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/S3;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/S3;-><init>(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/w3;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/V3;

    invoke-direct {p1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/V3;-><init>()V

    return-object p1

    :cond_3
    const-string v8, "zzk"

    const-class v9, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/U3;

    const-string v0, "zzd"

    const-string v1, "zze"

    const-string v2, "zzf"

    const-string v3, "zzg"

    const-string v4, "zzh"

    const-string v5, "zzi"

    const-string v6, "zzj"

    const-class v7, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/U3;

    filled-new-array/range {v0 .. v9}, [Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/V3;->zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/V3;

    const-string p3, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u1004\u0003\u0005\u1004\u0004\u0006\u001b\u0007\u001b"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->m(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/z2;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
