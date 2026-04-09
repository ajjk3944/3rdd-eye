.class public final enum Lcom/google/android/gms/internal/measurement/B7;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum zza:Lcom/google/android/gms/internal/measurement/B7;

.field public static final enum zzb:Lcom/google/android/gms/internal/measurement/B7;

.field public static final enum zzc:Lcom/google/android/gms/internal/measurement/B7;

.field public static final enum zzd:Lcom/google/android/gms/internal/measurement/B7;

.field public static final enum zze:Lcom/google/android/gms/internal/measurement/B7;

.field private static final synthetic zzf:[Lcom/google/android/gms/internal/measurement/B7;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/google/android/gms/internal/measurement/B7;

    const-string v1, "DEBUG"

    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/measurement/B7;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/measurement/B7;->zza:Lcom/google/android/gms/internal/measurement/B7;

    new-instance v1, Lcom/google/android/gms/internal/measurement/B7;

    const/4 v2, 0x1

    const/4 v4, 0x6

    const-string v5, "ERROR"

    invoke-direct {v1, v5, v2, v4}, Lcom/google/android/gms/internal/measurement/B7;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/google/android/gms/internal/measurement/B7;->zzb:Lcom/google/android/gms/internal/measurement/B7;

    new-instance v2, Lcom/google/android/gms/internal/measurement/B7;

    const-string v4, "INFO"

    const/4 v5, 0x2

    const/4 v6, 0x4

    invoke-direct {v2, v4, v5, v6}, Lcom/google/android/gms/internal/measurement/B7;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lcom/google/android/gms/internal/measurement/B7;->zzc:Lcom/google/android/gms/internal/measurement/B7;

    new-instance v4, Lcom/google/android/gms/internal/measurement/B7;

    const-string v7, "VERBOSE"

    invoke-direct {v4, v7, v3, v5}, Lcom/google/android/gms/internal/measurement/B7;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lcom/google/android/gms/internal/measurement/B7;->zzd:Lcom/google/android/gms/internal/measurement/B7;

    new-instance v3, Lcom/google/android/gms/internal/measurement/B7;

    const-string v5, "WARN"

    const/4 v7, 0x5

    invoke-direct {v3, v5, v6, v7}, Lcom/google/android/gms/internal/measurement/B7;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/google/android/gms/internal/measurement/B7;->zze:Lcom/google/android/gms/internal/measurement/B7;

    filled-new-array {v0, v1, v2, v4, v3}, [Lcom/google/android/gms/internal/measurement/B7;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/measurement/B7;->zzf:[Lcom/google/android/gms/internal/measurement/B7;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/measurement/B7;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/B7;->zzf:[Lcom/google/android/gms/internal/measurement/B7;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/measurement/B7;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/measurement/B7;

    return-object v0
.end method

.method public static zza(I)Lcom/google/android/gms/internal/measurement/B7;
    .locals 1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x5

    if-eq p0, v0, :cond_1

    const/4 v0, 0x6

    if-eq p0, v0, :cond_0

    sget-object p0, Lcom/google/android/gms/internal/measurement/B7;->zzc:Lcom/google/android/gms/internal/measurement/B7;

    return-object p0

    :cond_0
    sget-object p0, Lcom/google/android/gms/internal/measurement/B7;->zzb:Lcom/google/android/gms/internal/measurement/B7;

    return-object p0

    :cond_1
    sget-object p0, Lcom/google/android/gms/internal/measurement/B7;->zze:Lcom/google/android/gms/internal/measurement/B7;

    return-object p0

    :cond_2
    sget-object p0, Lcom/google/android/gms/internal/measurement/B7;->zza:Lcom/google/android/gms/internal/measurement/B7;

    return-object p0

    :cond_3
    sget-object p0, Lcom/google/android/gms/internal/measurement/B7;->zzd:Lcom/google/android/gms/internal/measurement/B7;

    return-object p0
.end method
