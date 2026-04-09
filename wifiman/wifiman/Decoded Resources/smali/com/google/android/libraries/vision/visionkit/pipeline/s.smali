.class public final Lcom/google/android/libraries/vision/visionkit/pipeline/s;
.super Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Y1;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/A2;


# static fields
.field private static final zzd:Lcom/google/android/libraries/vision/visionkit/pipeline/s;


# instance fields
.field private zzA:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/ta;

.field private zzB:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

.field private zzC:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/L9;

.field private zzD:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/s9;

.field private zzE:Lcom/google/android/libraries/vision/visionkit/pipeline/J;

.field private zzF:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/r3;

.field private zzG:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/d4;

.field private zzH:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/k9;

.field private zzI:Ljava/lang/String;

.field private zzJ:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/j;

.field private zzK:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/q8;

.field private zzL:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/j6;

.field private zzM:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/j6;

.field private zzN:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/j6;

.field private zzO:B

.field private zze:I

.field private zzf:I

.field private zzg:J

.field private zzh:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/N8;

.field private zzi:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/L9;

.field private zzj:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/s9;

.field private zzk:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/p9;

.field private zzl:I

.field private zzm:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/w4;

.field private zzn:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/R0;

.field private zzo:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/O4;

.field private zzp:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/C9;

.field private zzq:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/j8;

.field private zzr:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/c8;

.field private zzs:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/S7;

.field private zzt:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/r6;

.field private zzu:Lcom/google/android/libraries/vision/visionkit/pipeline/A;

.field private zzv:Z

.field private zzw:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/G;

.field private zzx:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/r5;

.field private zzy:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/b5;

.field private zzz:Lcom/google/android/libraries/vision/visionkit/pipeline/l;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/libraries/vision/visionkit/pipeline/s;

    invoke-direct {v0}, Lcom/google/android/libraries/vision/visionkit/pipeline/s;-><init>()V

    sput-object v0, Lcom/google/android/libraries/vision/visionkit/pipeline/s;->zzd:Lcom/google/android/libraries/vision/visionkit/pipeline/s;

    const-class v1, Lcom/google/android/libraries/vision/visionkit/pipeline/s;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->p(Ljava/lang/Class;Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Y1;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/s;->zzO:B

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->k()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/s;->zzB:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/s;->zzI:Ljava/lang/String;

    return-void
.end method

.method static synthetic B()Lcom/google/android/libraries/vision/visionkit/pipeline/s;
    .locals 1

    sget-object v0, Lcom/google/android/libraries/vision/visionkit/pipeline/s;->zzd:Lcom/google/android/libraries/vision/visionkit/pipeline/s;

    return-object v0
.end method

.method public static C([BLcom/google/android/gms/internal/mlkit_vision_internal_vkp/N1;)Lcom/google/android/libraries/vision/visionkit/pipeline/s;
    .locals 1

    sget-object v0, Lcom/google/android/libraries/vision/visionkit/pipeline/s;->zzd:Lcom/google/android/libraries/vision/visionkit/pipeline/s;

    invoke-static {v0, p0, p1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->g(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;[BLcom/google/android/gms/internal/mlkit_vision_internal_vkp/N1;)Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;

    move-result-object p0

    check-cast p0, Lcom/google/android/libraries/vision/visionkit/pipeline/s;

    return-object p0
.end method


# virtual methods
.method protected final v(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 40

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
    iput-byte v1, v0, Lcom/google/android/libraries/vision/visionkit/pipeline/s;->zzO:B

    return-object v3

    :cond_1
    sget-object v1, Lcom/google/android/libraries/vision/visionkit/pipeline/s;->zzd:Lcom/google/android/libraries/vision/visionkit/pipeline/s;

    return-object v1

    :cond_2
    new-instance v1, Lcom/google/android/libraries/vision/visionkit/pipeline/r;

    invoke-direct {v1, v3}, Lcom/google/android/libraries/vision/visionkit/pipeline/r;-><init>(Lcom/google/android/libraries/vision/visionkit/pipeline/q;)V

    return-object v1

    :cond_3
    new-instance v1, Lcom/google/android/libraries/vision/visionkit/pipeline/s;

    invoke-direct {v1}, Lcom/google/android/libraries/vision/visionkit/pipeline/s;-><init>()V

    return-object v1

    :cond_4
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/f8;->a()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/c2;

    move-result-object v10

    const-string v38, "zzM"

    const-string v39, "zzN"

    const-string v2, "zze"

    const-string v3, "zzf"

    const-string v4, "zzg"

    const-string v5, "zzh"

    const-string v6, "zzi"

    const-string v7, "zzj"

    const-string v8, "zzk"

    const-string v9, "zzl"

    const-string v11, "zzm"

    const-string v12, "zzn"

    const-string v13, "zzo"

    const-string v14, "zzp"

    const-string v15, "zzq"

    const-string v16, "zzu"

    const-string v17, "zzr"

    const-string v18, "zzt"

    const-string v19, "zzv"

    const-string v20, "zzw"

    const-string v21, "zzs"

    const-string v22, "zzx"

    const-string v23, "zzy"

    const-string v24, "zzz"

    const-string v25, "zzA"

    const-string v26, "zzB"

    const-class v27, Lcom/google/android/libraries/vision/visionkit/pipeline/v;

    const-string v28, "zzE"

    const-string v29, "zzF"

    const-string v30, "zzC"

    const-string v31, "zzD"

    const-string v32, "zzG"

    const-string v33, "zzH"

    const-string v34, "zzI"

    const-string v35, "zzJ"

    const-string v36, "zzK"

    const-string v37, "zzL"

    filled-new-array/range {v2 .. v39}, [Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lcom/google/android/libraries/vision/visionkit/pipeline/s;->zzd:Lcom/google/android/libraries/vision/visionkit/pipeline/s;

    const-string v3, "\u0001\"\u0000\u0002\u0001\'\"\u0000\u0001\t\u0001\u1002\u0000\u0002\u1009\u0001\u0003\u1409\u0002\u0004\u1009\u0003\u0005\u1009\u0004\u0006\u180c\u0005\u0007\u1409\u0006\u0008\u1409\u0007\t\u1409\u0008\n\u1009\t\u000b\u1409\n\u000c\u1009\u000e\r\u1009\u000b\u000e\u1009\r\u0010\u1007\u000f\u0011\u1009\u0010\u0012\u1009\u000c\u0013\u1409\u0011\u0014\u1009\u0012\u0015\u1409\u0013\u0016\u1009\u0014\u0018\u001b\u0019\u1009\u0017\u001a\u1009\u0018\u001b\u1409\u0015\u001e\u1009\u0016\u001f\u1409\u0019!\u1009\u001a\"\u1008\u001b#\u1009\u001c$\u1009\u001d%\u1009\u001e&\u1009\u001f\'\u1009 "

    invoke-static {v2, v3, v1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->m(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/z2;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :cond_5
    iget-byte v1, v0, Lcom/google/android/libraries/vision/visionkit/pipeline/s;->zzO:B

    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v1

    return-object v1
.end method
