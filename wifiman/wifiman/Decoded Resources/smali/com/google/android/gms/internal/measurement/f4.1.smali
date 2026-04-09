.class final Lcom/google/android/gms/internal/measurement/f4;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/measurement/zzjr;

.field private final b:[B


# direct methods
.method private constructor <init>(I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-array p1, p1, [B

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/f4;->b:[B

    .line 4
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzjr;->D([B)Lcom/google/android/gms/internal/measurement/zzjr;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/f4;->a:Lcom/google/android/gms/internal/measurement/zzjr;

    return-void
.end method

.method synthetic constructor <init>(ILcom/google/android/gms/internal/measurement/j4;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/f4;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/measurement/V3;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/f4;->a:Lcom/google/android/gms/internal/measurement/zzjr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzjr;->E()V

    new-instance v0, Lcom/google/android/gms/internal/measurement/h4;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/f4;->b:[B

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/h4;-><init>([B)V

    return-object v0
.end method

.method public final b()Lcom/google/android/gms/internal/measurement/zzjr;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/f4;->a:Lcom/google/android/gms/internal/measurement/zzjr;

    return-object v0
.end method
