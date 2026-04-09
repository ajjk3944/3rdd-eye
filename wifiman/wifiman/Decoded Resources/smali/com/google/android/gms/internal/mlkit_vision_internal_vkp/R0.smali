.class public final Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/R0;
.super Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/A2;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/R0;


# instance fields
.field private zzd:I

.field private zze:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/B1;

.field private zzf:I

.field private zzg:I

.field private zzh:Ljava/lang/String;

.field private zzi:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

.field private zzj:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/T0;

.field private zzk:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

.field private zzl:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/z0;

.field private zzm:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/w0;

.field private zzn:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

.field private zzo:B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/R0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/R0;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/R0;->zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/R0;

    const-class v1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/R0;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->p(Ljava/lang/Class;Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/R0;->zzo:B

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/B1;->b:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/B1;

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/R0;->zze:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/B1;

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/R0;->zzh:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->k()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/R0;->zzi:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->k()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/R0;->zzk:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->k()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/R0;->zzn:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

    return-void
.end method

.method static synthetic A()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/R0;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/R0;->zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/R0;

    return-object v0
.end method


# virtual methods
.method protected final v(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

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
    iput-byte v1, v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/R0;->zzo:B

    return-object v3

    :cond_1
    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/R0;->zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/R0;

    return-object v1

    :cond_2
    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Q0;

    invoke-direct {v1, v3}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Q0;-><init>(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W;)V

    return-object v1

    :cond_3
    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/R0;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/R0;-><init>()V

    return-object v1

    :cond_4
    const-string v14, "zzf"

    const-string v15, "zzg"

    const-string v2, "zzd"

    const-string v3, "zze"

    const-string v4, "zzh"

    const-string v5, "zzi"

    const-class v6, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/t0;

    const-string v7, "zzj"

    const-string v8, "zzk"

    const-class v9, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/P0;

    const-string v10, "zzl"

    const-string v11, "zzm"

    const-string v12, "zzn"

    const-class v13, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/N0;

    filled-new-array/range {v2 .. v15}, [Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/R0;->zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/R0;

    const-string v3, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0003\u0004\u0001\u150a\u0000\u0002\u1008\u0003\u0003\u041b\u0004\u1009\u0004\u0005\u041b\u0006\u1009\u0005\u0007\u1009\u0006\u0008\u041b\t\u1004\u0001\n\u1004\u0002"

    invoke-static {v2, v3, v1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->m(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/z2;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :cond_5
    iget-byte v1, v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/R0;->zzo:B

    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v1

    return-object v1
.end method
