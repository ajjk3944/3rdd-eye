.class final enum Lcom/google/android/gms/internal/measurement/t0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum zza:Lcom/google/android/gms/internal/measurement/t0;

.field public static final enum zzb:Lcom/google/android/gms/internal/measurement/t0;

.field public static final enum zzc:Lcom/google/android/gms/internal/measurement/t0;

.field private static final enum zzd:Lcom/google/android/gms/internal/measurement/t0;

.field private static final synthetic zze:[Lcom/google/android/gms/internal/measurement/t0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/google/android/gms/internal/measurement/t0;

    const-string v1, "ALL_CHECKS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/t0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/measurement/t0;->zza:Lcom/google/android/gms/internal/measurement/t0;

    new-instance v1, Lcom/google/android/gms/internal/measurement/t0;

    const-string v2, "SKIP_COMPLIANCE_CHECK"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/internal/measurement/t0;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/google/android/gms/internal/measurement/t0;->zzb:Lcom/google/android/gms/internal/measurement/t0;

    new-instance v2, Lcom/google/android/gms/internal/measurement/t0;

    const-string v3, "SKIP_SECURITY_CHECK"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lcom/google/android/gms/internal/measurement/t0;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lcom/google/android/gms/internal/measurement/t0;->zzd:Lcom/google/android/gms/internal/measurement/t0;

    new-instance v3, Lcom/google/android/gms/internal/measurement/t0;

    const-string v4, "NO_CHECKS"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Lcom/google/android/gms/internal/measurement/t0;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/google/android/gms/internal/measurement/t0;->zzc:Lcom/google/android/gms/internal/measurement/t0;

    filled-new-array {v0, v1, v2, v3}, [Lcom/google/android/gms/internal/measurement/t0;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/measurement/t0;->zze:[Lcom/google/android/gms/internal/measurement/t0;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/measurement/t0;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/t0;->zze:[Lcom/google/android/gms/internal/measurement/t0;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/measurement/t0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/measurement/t0;

    return-object v0
.end method
