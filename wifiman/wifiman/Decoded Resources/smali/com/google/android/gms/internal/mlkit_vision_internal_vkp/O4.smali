.class public final Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/O4;
.super Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/A2;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/O4;


# instance fields
.field private zzd:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

.field private zze:B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/O4;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/O4;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/O4;->zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/O4;

    const-class v1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/O4;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->p(Ljava/lang/Class;Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/O4;->zze:B

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->k()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/O4;->zzd:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/g2;

    return-void
.end method

.method static synthetic A()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/O4;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/O4;->zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/O4;

    return-object v0
.end method


# virtual methods
.method protected final v(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    add-int/lit8 p1, p1, -0x1

    if-eqz p1, :cond_5

    const/4 p3, 0x2

    if-eq p1, p3, :cond_4

    const/4 p3, 0x3

    if-eq p1, p3, :cond_3

    const/4 p3, 0x4

    const/4 v0, 0x0

    if-eq p1, p3, :cond_2

    const/4 p3, 0x5

    if-eq p1, p3, :cond_1

    if-nez p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    :goto_0
    iput-byte p1, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/O4;->zze:B

    return-object v0

    :cond_1
    sget-object p1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/O4;->zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/O4;

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/N4;

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/N4;-><init>(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/M4;)V

    return-object p1

    :cond_3
    new-instance p1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/O4;

    invoke-direct {p1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/O4;-><init>()V

    return-object p1

    :cond_4
    const-string p1, "zzd"

    const-class p2, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/K4;

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/O4;->zzb:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/O4;

    const-string p3, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;->m(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/z2;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/O4;->zze:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
