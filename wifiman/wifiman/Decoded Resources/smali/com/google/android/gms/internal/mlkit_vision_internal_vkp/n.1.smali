.class final Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/c2;


# static fields
.field static final a:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/c2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/n;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/n;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/n;->a:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/c2;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(I)Z
    .locals 0

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method
