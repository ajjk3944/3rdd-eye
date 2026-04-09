.class public final Lcom/google/android/recaptcha/internal/zzma;
.super Lcom/google/android/recaptcha/internal/zzna;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/recaptcha/internal/zzoj;


# static fields
.field private static final zzd:Lcom/google/android/recaptcha/internal/zzma;

.field private static volatile zze:Lcom/google/android/recaptcha/internal/zzoq;


# instance fields
.field private zzf:I

.field private zzg:I

.field private zzh:I

.field private zzi:I

.field private zzj:I

.field private zzk:I

.field private zzl:I

.field private zzm:B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/recaptcha/internal/zzma;

    invoke-direct {v0}, Lcom/google/android/recaptcha/internal/zzma;-><init>()V

    sput-object v0, Lcom/google/android/recaptcha/internal/zzma;->zzd:Lcom/google/android/recaptcha/internal/zzma;

    const-class v1, Lcom/google/android/recaptcha/internal/zzma;

    invoke-static {v1, v0}, Lcom/google/android/recaptcha/internal/zznd;->zzI(Ljava/lang/Class;Lcom/google/android/recaptcha/internal/zznd;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/recaptcha/internal/zzna;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, Lcom/google/android/recaptcha/internal/zzma;->zzm:B

    return-void
.end method

.method static bridge synthetic zzf()Lcom/google/android/recaptcha/internal/zzma;
    .locals 1

    sget-object v0, Lcom/google/android/recaptcha/internal/zzma;->zzd:Lcom/google/android/recaptcha/internal/zzma;

    return-object v0
.end method


# virtual methods
.method protected final zzh(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 15

    move-object v1, p0

    add-int/lit8 v0, p1, -0x1

    if-eqz v0, :cond_8

    const/4 v2, 0x2

    if-eq v0, v2, :cond_7

    const/4 v2, 0x3

    if-eq v0, v2, :cond_6

    const/4 v2, 0x4

    const/4 v3, 0x0

    if-eq v0, v2, :cond_5

    const/4 v2, 0x5

    if-eq v0, v2, :cond_4

    const/4 v2, 0x6

    if-eq v0, v2, :cond_1

    if-nez p2, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    iput-byte v0, v1, Lcom/google/android/recaptcha/internal/zzma;->zzm:B

    return-object v3

    :cond_1
    sget-object v0, Lcom/google/android/recaptcha/internal/zzma;->zze:Lcom/google/android/recaptcha/internal/zzoq;

    if-nez v0, :cond_3

    const-class v2, Lcom/google/android/recaptcha/internal/zzma;

    monitor-enter v2

    :try_start_0
    sget-object v0, Lcom/google/android/recaptcha/internal/zzma;->zze:Lcom/google/android/recaptcha/internal/zzoq;

    if-nez v0, :cond_2

    new-instance v0, Lcom/google/android/recaptcha/internal/zzmy;

    sget-object v3, Lcom/google/android/recaptcha/internal/zzma;->zzd:Lcom/google/android/recaptcha/internal/zzma;

    invoke-direct {v0, v3}, Lcom/google/android/recaptcha/internal/zzmy;-><init>(Lcom/google/android/recaptcha/internal/zznd;)V

    sput-object v0, Lcom/google/android/recaptcha/internal/zzma;->zze:Lcom/google/android/recaptcha/internal/zzoq;

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_2
    :goto_1
    monitor-exit v2

    goto :goto_3

    :goto_2
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_3
    :goto_3
    return-object v0

    :cond_4
    sget-object v0, Lcom/google/android/recaptcha/internal/zzma;->zzd:Lcom/google/android/recaptcha/internal/zzma;

    return-object v0

    :cond_5
    new-instance v0, Lcom/google/android/recaptcha/internal/zzlt;

    invoke-direct {v0, v3}, Lcom/google/android/recaptcha/internal/zzlt;-><init>(Lcom/google/android/recaptcha/internal/zzmh;)V

    return-object v0

    :cond_6
    new-instance v0, Lcom/google/android/recaptcha/internal/zzma;

    invoke-direct {v0}, Lcom/google/android/recaptcha/internal/zzma;-><init>()V

    return-object v0

    :cond_7
    const-string/jumbo v2, "zzf"

    const-string/jumbo v3, "zzg"

    sget-object v4, Lcom/google/android/recaptcha/internal/zzlv;->zza:Lcom/google/android/recaptcha/internal/zznh;

    const-string/jumbo v5, "zzh"

    sget-object v6, Lcom/google/android/recaptcha/internal/zzlu;->zza:Lcom/google/android/recaptcha/internal/zznh;

    const-string/jumbo v7, "zzi"

    sget-object v8, Lcom/google/android/recaptcha/internal/zzly;->zza:Lcom/google/android/recaptcha/internal/zznh;

    const-string/jumbo v9, "zzj"

    sget-object v10, Lcom/google/android/recaptcha/internal/zzlz;->zza:Lcom/google/android/recaptcha/internal/zznh;

    const-string/jumbo v11, "zzk"

    sget-object v12, Lcom/google/android/recaptcha/internal/zzlx;->zza:Lcom/google/android/recaptcha/internal/zznh;

    const-string/jumbo v13, "zzl"

    sget-object v14, Lcom/google/android/recaptcha/internal/zzlw;->zza:Lcom/google/android/recaptcha/internal/zznh;

    filled-new-array/range {v2 .. v14}, [Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Lcom/google/android/recaptcha/internal/zzma;->zzd:Lcom/google/android/recaptcha/internal/zzma;

    new-instance v3, Lcom/google/android/recaptcha/internal/zzou;

    const-string v4, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u180c\u0001\u0003\u180c\u0002\u0004\u180c\u0003\u0005\u180c\u0004\u0006\u180c\u0005"

    invoke-direct {v3, v2, v4, v0}, Lcom/google/android/recaptcha/internal/zzou;-><init>(Lcom/google/android/recaptcha/internal/zzoi;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v3

    :cond_8
    iget-byte v0, v1, Lcom/google/android/recaptcha/internal/zzma;->zzm:B

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    return-object v0
.end method
