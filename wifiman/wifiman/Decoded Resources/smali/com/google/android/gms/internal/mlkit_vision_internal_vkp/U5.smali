.class public final Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/U5;
.super Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/A2;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/U5;


# instance fields
.field private zzd:I

.field private zze:I

.field private zzf:Ljava/lang/Object;

.field private zzg:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/N5;

.field private zzh:Ljava/lang/String;

.field private zzi:Ljava/lang/String;

.field private zzj:Ljava/lang/String;

.field private zzk:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

.field private zzl:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

.field private zzm:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/t2;

.field private zzn:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/U5;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/U5;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/U5;->zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/U5;

    const-class v1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/U5;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->p(Ljava/lang/Class;Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/U5;->zze:I

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/t2;->d()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/t2;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/U5;->zzm:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/t2;

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/U5;->zzh:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/U5;->zzi:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/U5;->zzj:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->k()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/U5;->zzk:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->k()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/U5;->zzl:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->k()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/U5;->zzn:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

    return-void
.end method

.method static synthetic A()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/U5;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/U5;->zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/U5;

    return-object v0
.end method


# virtual methods
.method protected final v(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    add-int/lit8 v0, p1, -0x1

    if-eqz v0, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    const/4 v2, 0x0

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    return-object v2

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/U5;->zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/U5;

    return-object v0

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/P5;

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/P5;-><init>(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/E5;)V

    return-object v0

    :cond_2
    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/U5;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/U5;-><init>()V

    return-object v0

    :cond_3
    sget-object v12, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/O5;->a:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/s2;

    const-string v15, "zzi"

    const-string v16, "zzj"

    const-string v1, "zzf"

    const-string v2, "zze"

    const-string v3, "zzd"

    const-string v4, "zzg"

    const-string v5, "zzh"

    const-string v6, "zzk"

    const-class v7, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/R5;

    const-string v8, "zzl"

    const-class v9, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/T5;

    const-class v10, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/L5;

    const-string v11, "zzm"

    const-string v13, "zzn"

    const-class v14, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/o1;

    filled-new-array/range {v1 .. v16}, [Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/U5;->zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/U5;

    const-string v2, "\u0000\t\u0001\u0001\u0001\u000b\t\u0001\u0003\u0000\u0001\u1009\u0000\u0002\u0208\u0003\u001b\u0004\u001b\u0005<\u0000\u00082\t\u001b\n\u0208\u000b\u0208"

    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->m(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/z2;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_4
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    return-object v0
.end method
