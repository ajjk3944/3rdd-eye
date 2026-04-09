.class public final Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/J8;
.super Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/A2;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/J8;


# instance fields
.field private zzd:I

.field private zze:I

.field private zzf:Ljava/lang/Object;

.field private zzg:I

.field private zzh:Ljava/lang/String;

.field private zzi:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

.field private zzj:J

.field private zzk:Ljava/lang/String;

.field private zzl:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/J8;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/J8;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/J8;->zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/J8;

    const-class v1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/J8;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->p(Ljava/lang/Class;Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/J8;->zze:I

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/J8;->zzh:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->k()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/J8;->zzi:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/J8;->zzk:Ljava/lang/String;

    return-void
.end method

.method static synthetic A()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/J8;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/J8;->zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/J8;

    return-object v0
.end method


# virtual methods
.method protected final v(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

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
    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/J8;->zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/J8;

    return-object v0

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/G8;

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/G8;-><init>(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/D8;)V

    return-object v0

    :cond_2
    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/J8;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/J8;-><init>()V

    return-object v0

    :cond_3
    sget-object v5, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/K8;->a:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/c2;

    const-string v16, "zzl"

    sget-object v17, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/F8;->a:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/c2;

    const-string v1, "zzf"

    const-string v2, "zze"

    const-string v3, "zzd"

    const-string v4, "zzg"

    const-string v6, "zzh"

    const-string v7, "zzi"

    const-class v8, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/I8;

    const-string v9, "zzk"

    const-class v10, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/P7;

    const-class v11, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/A;

    const-class v12, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/M7;

    const-class v13, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/D;

    const-class v14, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/W7;

    const-string v15, "zzj"

    filled-new-array/range {v1 .. v17}, [Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/J8;->zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/J8;

    const-string v2, "\u0001\u000b\u0001\u0001\u0001\u000b\u000b\u0000\u0001\u0000\u0001\u180c\u0000\u0002\u1008\u0001\u0003\u001b\u0004\u1008\u0003\u0005<\u0000\u0006<\u0000\u0007<\u0000\u0008<\u0000\t<\u0000\n\u1002\u0002\u000b\u180c\u0004"

    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->m(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/z2;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_4
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    return-object v0
.end method
