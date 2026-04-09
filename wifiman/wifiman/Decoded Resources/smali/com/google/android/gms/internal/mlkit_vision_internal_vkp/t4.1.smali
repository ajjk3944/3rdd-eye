.class public final Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/t4;
.super Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Y1;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/A2;


# static fields
.field private static final zzd:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/t4;


# instance fields
.field private zze:I

.field private zzf:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/j4;

.field private zzg:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

.field private zzh:F

.field private zzi:F

.field private zzj:F

.field private zzk:F

.field private zzl:F

.field private zzm:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

.field private zzn:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

.field private zzo:J

.field private zzp:J

.field private zzq:J

.field private zzr:F

.field private zzs:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/o4;

.field private zzt:B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/t4;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/t4;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/t4;->zzd:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/t4;

    const-class v1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/t4;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->p(Ljava/lang/Class;Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Y1;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/t4;->zzt:B

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->k()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/t4;->zzg:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->k()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/t4;->zzm:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->k()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/t4;->zzn:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

    return-void
.end method

.method static synthetic B()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/t4;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/t4;->zzd:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/t4;

    return-object v0
.end method


# virtual methods
.method protected final v(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

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
    iput-byte v1, v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/t4;->zzt:B

    return-object v3

    :cond_1
    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/t4;->zzd:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/t4;

    return-object v1

    :cond_2
    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/k4;

    invoke-direct {v1, v3}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/k4;-><init>(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/e4;)V

    return-object v1

    :cond_3
    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/t4;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/t4;-><init>()V

    return-object v1

    :cond_4
    const-string v18, "zzl"

    const-string v19, "zzs"

    const-string v2, "zze"

    const-string v3, "zzf"

    const-string v4, "zzg"

    const-class v5, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/s4;

    const-string v6, "zzh"

    const-string v7, "zzi"

    const-string v8, "zzj"

    const-string v9, "zzk"

    const-string v10, "zzm"

    const-class v11, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/m4;

    const-string v12, "zzn"

    const-class v13, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/h4;

    const-string v14, "zzp"

    const-string v15, "zzr"

    const-string v16, "zzq"

    const-string v17, "zzo"

    filled-new-array/range {v2 .. v19}, [Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/t4;->zzd:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/t4;

    const-string v3, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0003\u0000\u0001\u1009\u0000\u0002\u001b\u0003\u1001\u0001\u0004\u1001\u0002\u0005\u1001\u0003\u0006\u1001\u0004\u0007\u001b\u0008\u001b\t\u1003\u0007\n\u1001\t\u000b\u1003\u0008\u000c\u1003\u0006\r\u1001\u0005\u000e\u1009\n"

    invoke-static {v2, v3, v1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->m(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/z2;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :cond_5
    iget-byte v1, v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/t4;->zzt:B

    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v1

    return-object v1
.end method
