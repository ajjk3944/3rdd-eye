.class public final Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/N1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final b:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/N1;


# instance fields
.field private final a:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/N1;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/N1;-><init>(Z)V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/N1;->b:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/N1;

    return-void
.end method

.method constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/N1;->a:Ljava/util/Map;

    return-void
.end method

.method public static a()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/N1;
    .locals 1

    sget v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/G2;->d:I

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/N1;->b:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/N1;

    return-object v0
.end method


# virtual methods
.method public final b(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/z2;I)Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Z1;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/M1;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/M1;-><init>(Ljava/lang/Object;I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/N1;->a:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lf/d;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method
