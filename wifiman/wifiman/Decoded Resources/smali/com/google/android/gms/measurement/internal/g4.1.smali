.class public final enum Lcom/google/android/gms/measurement/internal/g4;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum zza:Lcom/google/android/gms/measurement/internal/g4;

.field public static final enum zzb:Lcom/google/android/gms/measurement/internal/g4;

.field private static final synthetic zzc:[Lcom/google/android/gms/measurement/internal/g4;


# instance fields
.field private final zzd:[Lcom/google/android/gms/measurement/internal/e4$a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/google/android/gms/measurement/internal/g4;

    sget-object v1, Lcom/google/android/gms/measurement/internal/e4$a;->zza:Lcom/google/android/gms/measurement/internal/e4$a;

    sget-object v2, Lcom/google/android/gms/measurement/internal/e4$a;->zzb:Lcom/google/android/gms/measurement/internal/e4$a;

    filled-new-array {v1, v2}, [Lcom/google/android/gms/measurement/internal/e4$a;

    move-result-object v1

    const-string v2, "STORAGE"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lcom/google/android/gms/measurement/internal/g4;-><init>(Ljava/lang/String;I[Lcom/google/android/gms/measurement/internal/e4$a;)V

    sput-object v0, Lcom/google/android/gms/measurement/internal/g4;->zza:Lcom/google/android/gms/measurement/internal/g4;

    new-instance v1, Lcom/google/android/gms/measurement/internal/g4;

    sget-object v2, Lcom/google/android/gms/measurement/internal/e4$a;->zzc:Lcom/google/android/gms/measurement/internal/e4$a;

    filled-new-array {v2}, [Lcom/google/android/gms/measurement/internal/e4$a;

    move-result-object v2

    const-string v3, "DMA"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v2}, Lcom/google/android/gms/measurement/internal/g4;-><init>(Ljava/lang/String;I[Lcom/google/android/gms/measurement/internal/e4$a;)V

    sput-object v1, Lcom/google/android/gms/measurement/internal/g4;->zzb:Lcom/google/android/gms/measurement/internal/g4;

    filled-new-array {v0, v1}, [Lcom/google/android/gms/measurement/internal/g4;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/measurement/internal/g4;->zzc:[Lcom/google/android/gms/measurement/internal/g4;

    return-void
.end method

.method private varargs constructor <init>(Ljava/lang/String;I[Lcom/google/android/gms/measurement/internal/e4$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/google/android/gms/measurement/internal/e4$a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/g4;->zzd:[Lcom/google/android/gms/measurement/internal/e4$a;

    return-void
.end method

.method public static values()[Lcom/google/android/gms/measurement/internal/g4;
    .locals 1

    sget-object v0, Lcom/google/android/gms/measurement/internal/g4;->zzc:[Lcom/google/android/gms/measurement/internal/g4;

    invoke-virtual {v0}, [Lcom/google/android/gms/measurement/internal/g4;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/measurement/internal/g4;

    return-object v0
.end method

.method static bridge synthetic zza(Lcom/google/android/gms/measurement/internal/g4;)[Lcom/google/android/gms/measurement/internal/e4$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/g4;->zzd:[Lcom/google/android/gms/measurement/internal/e4$a;

    return-object p0
.end method


# virtual methods
.method public final zza()[Lcom/google/android/gms/measurement/internal/e4$a;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/g4;->zzd:[Lcom/google/android/gms/measurement/internal/e4$a;

    return-object v0
.end method
