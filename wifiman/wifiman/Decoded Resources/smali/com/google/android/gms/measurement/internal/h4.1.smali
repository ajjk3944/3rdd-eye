.class public final enum Lcom/google/android/gms/measurement/internal/h4;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum zza:Lcom/google/android/gms/measurement/internal/h4;

.field public static final enum zzb:Lcom/google/android/gms/measurement/internal/h4;

.field public static final enum zzc:Lcom/google/android/gms/measurement/internal/h4;

.field public static final enum zzd:Lcom/google/android/gms/measurement/internal/h4;

.field private static final synthetic zze:[Lcom/google/android/gms/measurement/internal/h4;


# instance fields
.field private final zzf:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/google/android/gms/measurement/internal/h4;

    const/4 v1, 0x0

    const-string v2, "uninitialized"

    const-string v3, "UNINITIALIZED"

    invoke-direct {v0, v3, v1, v2}, Lcom/google/android/gms/measurement/internal/h4;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/measurement/internal/h4;->zza:Lcom/google/android/gms/measurement/internal/h4;

    new-instance v1, Lcom/google/android/gms/measurement/internal/h4;

    const/4 v2, 0x1

    const-string v3, "eu_consent_policy"

    const-string v4, "POLICY"

    invoke-direct {v1, v4, v2, v3}, Lcom/google/android/gms/measurement/internal/h4;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/google/android/gms/measurement/internal/h4;->zzb:Lcom/google/android/gms/measurement/internal/h4;

    new-instance v2, Lcom/google/android/gms/measurement/internal/h4;

    const/4 v3, 0x2

    const-string v4, "denied"

    const-string v5, "DENIED"

    invoke-direct {v2, v5, v3, v4}, Lcom/google/android/gms/measurement/internal/h4;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lcom/google/android/gms/measurement/internal/h4;->zzc:Lcom/google/android/gms/measurement/internal/h4;

    new-instance v3, Lcom/google/android/gms/measurement/internal/h4;

    const/4 v4, 0x3

    const-string v5, "granted"

    const-string v6, "GRANTED"

    invoke-direct {v3, v6, v4, v5}, Lcom/google/android/gms/measurement/internal/h4;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lcom/google/android/gms/measurement/internal/h4;->zzd:Lcom/google/android/gms/measurement/internal/h4;

    filled-new-array {v0, v1, v2, v3}, [Lcom/google/android/gms/measurement/internal/h4;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/measurement/internal/h4;->zze:[Lcom/google/android/gms/measurement/internal/h4;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/h4;->zzf:Ljava/lang/String;

    return-void
.end method

.method public static values()[Lcom/google/android/gms/measurement/internal/h4;
    .locals 1

    sget-object v0, Lcom/google/android/gms/measurement/internal/h4;->zze:[Lcom/google/android/gms/measurement/internal/h4;

    invoke-virtual {v0}, [Lcom/google/android/gms/measurement/internal/h4;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/measurement/internal/h4;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/h4;->zzf:Ljava/lang/String;

    return-object v0
.end method
