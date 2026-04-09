.class public final Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/r5;
.super Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/A2;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/r5;


# instance fields
.field private zzd:I

.field private zze:J

.field private zzf:Ljava/lang/String;

.field private zzg:Ljava/lang/String;

.field private zzh:I

.field private zzi:I

.field private zzj:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

.field private zzk:Ljava/lang/String;

.field private zzl:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/j5;

.field private zzm:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/B1;

.field private zzn:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/D5;

.field private zzo:Ljava/lang/String;

.field private zzp:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

.field private zzq:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

.field private zzr:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/B1;

.field private zzs:Ljava/lang/String;

.field private zzt:B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/r5;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/r5;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/r5;->zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/r5;

    const-class v1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/r5;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->p(Ljava/lang/Class;Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/r5;->zzt:B

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/r5;->zzf:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/r5;->zzg:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->k()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/r5;->zzj:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/r5;->zzk:Ljava/lang/String;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/B1;->b:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/B1;

    iput-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/r5;->zzm:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/B1;

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/r5;->zzo:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->k()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/r5;->zzp:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->k()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/r5;->zzq:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

    iput-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/r5;->zzr:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/B1;

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/r5;->zzs:Ljava/lang/String;

    return-void
.end method

.method static synthetic A()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/r5;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/r5;->zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/r5;

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
    iput-byte v1, v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/r5;->zzt:B

    return-object v3

    :cond_1
    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/r5;->zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/r5;

    return-object v1

    :cond_2
    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/o5;

    invoke-direct {v1, v3}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/o5;-><init>(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/n5;)V

    return-object v1

    :cond_3
    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/r5;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/r5;-><init>()V

    return-object v1

    :cond_4
    const-string v18, "zzq"

    const-class v19, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/m5;

    const-string v2, "zzd"

    const-string v3, "zze"

    const-string v4, "zzp"

    const-class v5, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/q5;

    const-string v6, "zzf"

    const-string v7, "zzg"

    const-string v8, "zzh"

    const-string v9, "zzi"

    const-string v10, "zzj"

    const-string v11, "zzk"

    const-string v12, "zzm"

    const-string v13, "zzn"

    const-string v14, "zzl"

    const-string v15, "zzr"

    const-string v16, "zzo"

    const-string v17, "zzs"

    filled-new-array/range {v2 .. v19}, [Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/r5;->zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/r5;

    const-string v3, "\u0001\u000f\u0000\u0001\u0001\u001c\u000f\u0000\u0003\u0004\u0001\u1502\u0000\u0002\u0431\u0010\u1008\u0001\u0011\u1008\u0002\u0012\u1004\u0003\u0013\u1004\u0004\u0014\u001a\u0015\u1008\u0005\u0016\u100a\u0007\u0017\u1409\u0008\u0018\u1409\u0006\u0019\u100a\n\u001a\u1008\t\u001b\u1008\u000b\u001c\u001b"

    invoke-static {v2, v3, v1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->m(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/z2;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :cond_5
    iget-byte v1, v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/r5;->zzt:B

    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v1

    return-object v1
.end method
