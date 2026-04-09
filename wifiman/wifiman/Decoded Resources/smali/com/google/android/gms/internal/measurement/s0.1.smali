.class public final enum Lcom/google/android/gms/internal/measurement/s0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum zza:Lcom/google/android/gms/internal/measurement/s0;

.field private static final enum zzb:Lcom/google/android/gms/internal/measurement/s0;

.field private static final enum zzc:Lcom/google/android/gms/internal/measurement/s0;

.field private static final synthetic zzd:[Lcom/google/android/gms/internal/measurement/s0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/google/android/gms/internal/measurement/s0;

    const-string v1, "READ_AND_WRITE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/s0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/measurement/s0;->zza:Lcom/google/android/gms/internal/measurement/s0;

    new-instance v1, Lcom/google/android/gms/internal/measurement/s0;

    const-string v2, "READ_ONLY"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/internal/measurement/s0;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/google/android/gms/internal/measurement/s0;->zzb:Lcom/google/android/gms/internal/measurement/s0;

    new-instance v2, Lcom/google/android/gms/internal/measurement/s0;

    const-string v3, "WRITE_ONLY"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lcom/google/android/gms/internal/measurement/s0;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lcom/google/android/gms/internal/measurement/s0;->zzc:Lcom/google/android/gms/internal/measurement/s0;

    filled-new-array {v0, v1, v2}, [Lcom/google/android/gms/internal/measurement/s0;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/measurement/s0;->zzd:[Lcom/google/android/gms/internal/measurement/s0;

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

.method public static values()[Lcom/google/android/gms/internal/measurement/s0;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/s0;->zzd:[Lcom/google/android/gms/internal/measurement/s0;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/measurement/s0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/measurement/s0;

    return-object v0
.end method
