.class public final Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/K4;
.super Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Y1;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/A2;


# static fields
.field private static final zzd:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/K4;


# instance fields
.field private zze:I

.field private zzf:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/B4;

.field private zzg:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

.field private zzh:F

.field private zzi:F

.field private zzj:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

.field private zzk:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/B1;

.field private zzl:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/B4;

.field private zzm:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/t4;

.field private zzn:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

.field private zzo:B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/K4;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/K4;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/K4;->zzd:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/K4;

    const-class v1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/K4;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->p(Ljava/lang/Class;Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Y1;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/K4;->zzo:B

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->k()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/K4;->zzg:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->k()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/K4;->zzj:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/B1;->b:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/B1;

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/K4;->zzk:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/B1;

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->k()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/K4;->zzn:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

    return-void
.end method

.method static synthetic B()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/K4;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/K4;->zzd:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/K4;

    return-object v0
.end method


# virtual methods
.method protected final v(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 15

    move-object v0, p0

    add-int/lit8 v1, p1, -0x1

    if-eqz v1, :cond_5

    const/4 v2, 0x2

    if-eq v1, v2, :cond_4

    const/4 v2, 0x3

    if-eq v1, v2, :cond_3

    const/4 v2, 0x4

    const/4 v3, 0x0

    if-eq v1, v2, :cond_2

    const/4 v2, 0x5

    if-eq v1, v2, :cond_1

    if-nez p2, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    :goto_0
    iput-byte v1, v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/K4;->zzo:B

    return-object v3

    :cond_1
    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/K4;->zzd:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/K4;

    return-object v1

    :cond_2
    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/C4;

    invoke-direct {v1, v3}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/C4;-><init>(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/x4;)V

    return-object v1

    :cond_3
    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/K4;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/K4;-><init>()V

    return-object v1

    :cond_4
    const-string v13, "zzl"

    const-string v14, "zzi"

    const-string v2, "zze"

    const-string v3, "zzf"

    const-string v4, "zzg"

    const-class v5, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/J4;

    const-string v6, "zzh"

    const-string v7, "zzj"

    const-class v8, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/E4;

    const-string v9, "zzm"

    const-string v10, "zzn"

    const-class v11, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/z4;

    const-string v12, "zzk"

    filled-new-array/range {v2 .. v14}, [Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/K4;->zzd:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/K4;

    const-string v3, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0003\u0001\u0001\u1009\u0000\u0002\u001b\u0003\u1001\u0001\u0004\u001b\u0005\u1409\u0005\u0006\u001b\u0007\u100a\u0003\u0008\u1009\u0004\t\u1001\u0002"

    invoke-static {v2, v3, v1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->m(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/z2;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :cond_5
    iget-byte v1, v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/K4;->zzo:B

    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v1

    return-object v1
.end method
