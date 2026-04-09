.class final Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/q2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/K2;


# static fields
.field private static final b:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/x2;


# instance fields
.field private final a:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/x2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/o2;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/o2;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/q2;->b:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/x2;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/p2;

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/V1;->a()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/V1;

    move-result-object v1

    sget v2, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/G2;->d:I

    const/4 v2, 0x2

    new-array v2, v2, [Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/x2;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/q2;->b:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/x2;

    const/4 v3, 0x1

    aput-object v1, v2, v3

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/p2;-><init>([Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/x2;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/h2;->b:[B

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/q2;->a:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/x2;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Class;)Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/J2;
    .locals 8

    sget v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/L2;->b:I

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/a2;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_0

    sget v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/G2;->d:I

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/q2;->a:Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/x2;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/x2;->zzb(Ljava/lang/Class;)Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/w2;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/w2;->zzb()Z

    move-result v0

    if-nez v0, :cond_2

    sget v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/G2;->d:I

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/F2;->a()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/E2;

    move-result-object v3

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/m2;->a()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/l2;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/L2;->s()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/V2;

    move-result-object v5

    invoke-interface {v2}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/w2;->zzc()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Q1;->a()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/O1;

    move-result-object v0

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/v2;->a()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/u2;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/C2;->y(Ljava/lang/Class;Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/w2;Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/E2;Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/l2;Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/V2;Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/O1;Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/u2;)Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/C2;

    move-result-object p1

    return-object p1

    :cond_2
    sget p1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/G2;->d:I

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/L2;->s()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/V2;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/Q1;->a()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/O1;

    move-result-object v0

    invoke-interface {v2}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/w2;->zza()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/z2;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/D2;->c(Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/V2;Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/O1;Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/z2;)Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/D2;

    move-result-object p1

    return-object p1
.end method
