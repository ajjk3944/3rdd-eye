.class public final Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/d4;
.super Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Y1;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/A2;


# static fields
.field private static final zzd:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/d4;


# instance fields
.field private zze:I

.field private zzf:I

.field private zzg:I

.field private zzh:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/M3;

.field private zzi:Ljava/lang/String;

.field private zzj:I

.field private zzk:I

.field private zzl:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

.field private zzm:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Q3;

.field private zzn:Ljava/lang/String;

.field private zzo:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

.field private zzp:J

.field private zzq:B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/d4;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/d4;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/d4;->zzd:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/d4;

    const-class v1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/d4;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->p(Ljava/lang/Class;Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Y1;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/d4;->zzq:B

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/d4;->zzi:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->k()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/d4;->zzl:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/d4;->zzn:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->k()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/d4;->zzo:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

    return-void
.end method

.method static synthetic B()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/d4;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/d4;->zzd:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/d4;

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
    iput-byte v1, v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/d4;->zzq:B

    return-object v3

    :cond_1
    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/d4;->zzd:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/d4;

    return-object v1

    :cond_2
    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/c4;

    invoke-direct {v1, v3}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/c4;-><init>(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/w3;)V

    return-object v1

    :cond_3
    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/d4;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/d4;-><init>()V

    return-object v1

    :cond_4
    const-string v13, "zzo"

    const-string v14, "zzp"

    const-string v2, "zze"

    const-string v3, "zzf"

    const-string v4, "zzg"

    const-string v5, "zzh"

    const-string v6, "zzi"

    const-string v7, "zzj"

    const-string v8, "zzk"

    const-string v9, "zzl"

    const-class v10, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/b4;

    const-string v11, "zzm"

    const-string v12, "zzn"

    filled-new-array/range {v2 .. v14}, [Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/d4;->zzd:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/d4;

    const-string v3, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0002\u0003\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1409\u0002\u0004\u1008\u0003\u0005\u1004\u0004\u0006\u1004\u0005\u0007\u041b\u0008\u1409\u0006\t\u1008\u0007\n\u001a\u000b\u1002\u0008"

    invoke-static {v2, v3, v1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->m(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/z2;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :cond_5
    iget-byte v1, v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/d4;->zzq:B

    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v1

    return-object v1
.end method
